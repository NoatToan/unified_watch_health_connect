package org.koin.core.registry;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import d53.c;
import dh.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;
import org.koin.core.Koin;
import org.koin.core.error.NoPropertyFileFoundException;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0002\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0002¨\u0006\u000b"}, d2 = {"saveProperties", "", "Lorg/koin/core/registry/PropertyRegistry;", "properties", "Ljava/util/Properties;", "loadPropertiesFromFile", "fileName", "", "readDataFromFile", FirebaseAnalytics.Param.CONTENT, "loadEnvironmentProperties", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PropertyRegistryExtKt {
    public static final void loadEnvironmentProperties(PropertyRegistry propertyRegistry) {
        propertyRegistry.getClass();
        propertyRegistry.get_koin().getLogger().debug("load properties from environment");
        Properties properties = System.getProperties();
        properties.getClass();
        saveProperties(propertyRegistry, properties);
        Map<String, String> map = System.getenv();
        map.getClass();
        Properties properties2 = new Properties();
        properties2.putAll(map);
        saveProperties(propertyRegistry, properties2);
    }

    public static final void loadPropertiesFromFile(PropertyRegistry propertyRegistry, String str) throws NoPropertyFileFoundException, IOException {
        propertyRegistry.getClass();
        str.getClass();
        propertyRegistry.get_koin().getLogger().debug("load properties from ".concat(str));
        URL resource = Koin.class.getResource(str);
        String str2 = null;
        if (resource != null) {
            Charset charset = c.f57666b;
            InputStream inputStreamOpenStream = resource.openStream();
            try {
                inputStreamOpenStream.getClass();
                byte[] bArrM = b.M(inputStreamOpenStream);
                jg.b.l(inputStreamOpenStream, null);
                str2 = new String(bArrM, charset);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(inputStreamOpenStream, th3);
                    throw th4;
                }
            }
        }
        if (str2 == null) {
            throw new NoPropertyFileFoundException(o2.c.c(CoreConstants.SINGLE_QUOTE_CHAR, "No properties found for file '", str));
        }
        propertyRegistry.get_koin().getLogger().info("loaded properties from file:'" + str + CoreConstants.SINGLE_QUOTE_CHAR);
        saveProperties(propertyRegistry, readDataFromFile(str2));
    }

    private static final Properties readDataFromFile(String str) throws IOException {
        Properties properties = new Properties();
        byte[] bytes = str.getBytes(c.f57666b);
        bytes.getClass();
        properties.load(new ByteArrayInputStream(bytes));
        return properties;
    }

    public static final void saveProperties(PropertyRegistry propertyRegistry, Properties properties) {
        propertyRegistry.getClass();
        properties.getClass();
        propertyRegistry.get_koin().getLogger().debug("load " + properties.size() + " properties");
        for (Map.Entry entry : u0.m(properties).entrySet()) {
            propertyRegistry.saveProperty$koin_core((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
