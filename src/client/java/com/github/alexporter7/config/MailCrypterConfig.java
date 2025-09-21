package com.github.alexporter7.config;

import com.github.alexporter7.MailCrypter;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name=MailCrypter.MOD_ID)
public class MailCrypterConfig implements ConfigData {

    @ConfigEntry.Category("Key Settings")
    public String defaultSecretKey = "";

}
