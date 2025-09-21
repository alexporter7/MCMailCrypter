package com.github.alexporter7;

import com.github.alexporter7.command.MailCrypterCommands;
import com.github.alexporter7.config.MailCrypterConfig;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

public class MailCrypterClient implements ClientModInitializer {

	public static MailCrypterConfig config;
	@Override
	public void onInitializeClient() {
		MailCrypter.LOGGER.info("Registering config serializer");
		AutoConfig.register(MailCrypterConfig.class, GsonConfigSerializer::new);

		MailCrypter.LOGGER.info("Initializing config");
		config = AutoConfig.getConfigHolder(MailCrypterConfig.class).getConfig();

		MailCrypter.LOGGER.info("Registering commands");
		MailCrypterCommands.registerCommands();
	}
}