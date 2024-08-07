package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${env}.properties",
        "file:~/${env}.properties",
        "file:./${env}.properties"
})

public interface WebConfig extends Config {

    @DefaultValue("CHROME")
    Browser browser();

    @DefaultValue("126.0.6478.127")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    @DefaultValue("https://demoqa.com")
    String baseUrl();

    @DefaultValue("false")
    boolean isRemote();

    String remoteUrl();

    @DefaultValue("eager")
    String pageLoadStrategy();
}
