package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
class MetadataBackendRegistry implements BackendRegistry {
    private static final String BACKEND_KEY_PREFIX = "backend:";
    private static final String TAG = "BackendRegistry";
    private final BackendFactoryProvider backendFactoryProvider;
    private final Map<String, TransportBackend> backends;
    private final CreationContextFactory creationContextFactory;

    public static class BackendFactoryProvider {
        private final Context applicationContext;
        private Map<String, String> backendProviders = null;

        public BackendFactoryProvider(Context context) {
            this.applicationContext = context;
        }

        private Map<String, String> discover(Context context) {
            Bundle metadata = getMetadata(context);
            if (metadata == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : metadata.keySet()) {
                Object obj = metadata.get(str);
                if ((obj instanceof String) && str.startsWith(MetadataBackendRegistry.BACKEND_KEY_PREFIX)) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map<String, String> getBackendProviders() {
            if (this.backendProviders == null) {
                this.backendProviders = discover(this.applicationContext);
            }
            return this.backendProviders;
        }

        private static Bundle getMetadata(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public BackendFactory get(String str) {
            String str2 = getBackendProviders().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str2).asSubclass(BackendFactory.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException unused) {
                StringBuilder sb3 = new StringBuilder("Class ");
                sb3.append(str2);
                sb3.append(" is not found.");
                return null;
            } catch (IllegalAccessException unused2) {
                StringBuilder sb4 = new StringBuilder("Could not instantiate ");
                sb4.append(str2);
                sb4.append(".");
                return null;
            } catch (InstantiationException unused3) {
                StringBuilder sb5 = new StringBuilder("Could not instantiate ");
                sb5.append(str2);
                sb5.append(".");
                return null;
            } catch (NoSuchMethodException unused4) {
                "Could not instantiate ".concat(str2);
                return null;
            } catch (InvocationTargetException unused5) {
                "Could not instantiate ".concat(str2);
                return null;
            }
        }
    }

    public MetadataBackendRegistry(BackendFactoryProvider backendFactoryProvider, CreationContextFactory creationContextFactory) {
        this.backends = new HashMap();
        this.backendFactoryProvider = backendFactoryProvider;
        this.creationContextFactory = creationContextFactory;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public synchronized TransportBackend get(String str) {
        if (this.backends.containsKey(str)) {
            return this.backends.get(str);
        }
        BackendFactory backendFactory = this.backendFactoryProvider.get(str);
        if (backendFactory == null) {
            return null;
        }
        TransportBackend transportBackendCreate = backendFactory.create(this.creationContextFactory.create(str));
        this.backends.put(str, transportBackendCreate);
        return transportBackendCreate;
    }

    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        this(new BackendFactoryProvider(context), creationContextFactory);
    }
}
