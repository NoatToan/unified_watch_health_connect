package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigGetParameterHandler {

    @VisibleForTesting(otherwise = 3)
    public static final Charset FRC_BYTE_ARRAY_ENCODING = Charset.forName("UTF-8");
    public static final Pattern e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    public static final Pattern f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    private final Set<BiConsumer<String, ConfigContainer>> a = new HashSet();
    private final Executor b;
    private final ConfigCacheClient c;
    private final ConfigCacheClient d;

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.b = executor;
        this.c = configCacheClient;
        this.d = configCacheClient2;
    }

    private void b(final String str, final ConfigContainer configContainer) {
        if (configContainer == null) {
            return;
        }
        synchronized (this.a) {
            for (final BiConsumer<String, ConfigContainer> biConsumer : this.a) {
                this.b.execute(new Runnable() { // from class: oy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        biConsumer.accept(str, configContainer);
                    }
                });
            }
        }
    }

    @Nullable
    private static ConfigContainer c(ConfigCacheClient configCacheClient) {
        return configCacheClient.getBlocking();
    }

    @Nullable
    private static Double d(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer configContainerC = c(configCacheClient);
        if (configContainerC == null) {
            return null;
        }
        try {
            return Double.valueOf(configContainerC.getConfigs().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Set<String> e(ConfigCacheClient configCacheClient) {
        HashSet hashSet = new HashSet();
        ConfigContainer configContainerC = c(configCacheClient);
        if (configContainerC == null) {
            return hashSet;
        }
        Iterator<String> itKeys = configContainerC.getConfigs().keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        return hashSet;
    }

    private static TreeSet<String> f(String str, ConfigContainer configContainer) {
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator<String> itKeys = configContainer.getConfigs().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    @Nullable
    private static Long g(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer configContainerC = c(configCacheClient);
        if (configContainerC == null) {
            return null;
        }
        try {
            return Long.valueOf(configContainerC.getConfigs().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    private static String h(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer configContainerC = c(configCacheClient);
        if (configContainerC == null) {
            return null;
        }
        try {
            return configContainerC.getConfigs().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void j(String str, String str2) {
        Log.w(FirebaseRemoteConfig.TAG, String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void addListener(BiConsumer<String, ConfigContainer> biConsumer) {
        synchronized (this.a) {
            this.a.add(biConsumer);
        }
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(e(this.c));
        hashSet.addAll(e(this.d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, getValue(str));
        }
        return map;
    }

    public boolean getBoolean(String str) {
        String strH = h(this.c, str);
        if (strH != null) {
            if (e.matcher(strH).matches()) {
                b(str, c(this.c));
                return true;
            }
            if (f.matcher(strH).matches()) {
                b(str, c(this.c));
                return false;
            }
        }
        String strH2 = h(this.d, str);
        if (strH2 != null) {
            if (e.matcher(strH2).matches()) {
                return true;
            }
            if (f.matcher(strH2).matches()) {
                return false;
            }
        }
        j(str, "Boolean");
        return false;
    }

    public byte[] getByteArray(String str) {
        String strH = h(this.c, str);
        if (strH != null) {
            b(str, c(this.c));
            return strH.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        String strH2 = h(this.d, str);
        if (strH2 != null) {
            return strH2.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        j(str, "ByteArray");
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
    }

    public double getDouble(String str) {
        Double d = d(this.c, str);
        if (d != null) {
            b(str, c(this.c));
            return d.doubleValue();
        }
        Double d2 = d(this.d, str);
        if (d2 != null) {
            return d2.doubleValue();
        }
        j(str, "Double");
        return 0.0d;
    }

    public Set<String> getKeysByPrefix(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        ConfigContainer configContainerC = c(this.c);
        if (configContainerC != null) {
            treeSet.addAll(f(str, configContainerC));
        }
        ConfigContainer configContainerC2 = c(this.d);
        if (configContainerC2 != null) {
            treeSet.addAll(f(str, configContainerC2));
        }
        return treeSet;
    }

    public long getLong(String str) {
        Long lG = g(this.c, str);
        if (lG != null) {
            b(str, c(this.c));
            return lG.longValue();
        }
        Long lG2 = g(this.d, str);
        if (lG2 != null) {
            return lG2.longValue();
        }
        j(str, "Long");
        return 0L;
    }

    public String getString(String str) {
        String strH = h(this.c, str);
        if (strH != null) {
            b(str, c(this.c));
            return strH;
        }
        String strH2 = h(this.d, str);
        if (strH2 != null) {
            return strH2;
        }
        j(str, "String");
        return "";
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        String strH = h(this.c, str);
        if (strH != null) {
            b(str, c(this.c));
            return new FirebaseRemoteConfigValueImpl(strH, 2);
        }
        String strH2 = h(this.d, str);
        if (strH2 != null) {
            return new FirebaseRemoteConfigValueImpl(strH2, 1);
        }
        j(str, "FirebaseRemoteConfigValue");
        return new FirebaseRemoteConfigValueImpl("", 0);
    }
}
