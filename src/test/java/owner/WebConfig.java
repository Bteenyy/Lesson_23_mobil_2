package owner;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${deviceHost}.properties"
})
public interface WebConfig extends Config {
    @Key("platform.device")
    String getPlatformDevice();

    @Key("platform.version")
    String getPlatformVersion();

}