package owner;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${deviceHost}.properties"
})

public interface LocalConfig extends Config {
    @Key("local.server")
    String localServer();

    @Key("device.name")
    String deviceName();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

    @Key("appURL")
    String appURL();

    @Key("appPath")
    String appPath();

    @Key("app.package")
    String appPackage();

    @Key("app.activity")
    String appActivity();
}