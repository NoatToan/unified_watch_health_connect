package org.acra.security;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.KeyStore;
import org.acra.config.ConfigUtils;
import org.acra.config.CoreConfiguration;
import org.acra.config.HttpSenderConfiguration;
import org.acra.security.NoKeyStoreFactory;
import org.acra.util.InstanceCreator;

/* JADX INFO: loaded from: classes23.dex */
public final class KeyStoreHelper {
    private static final String a = "asset://";

    private KeyStoreHelper() {
    }

    @Nullable
    public static KeyStore getKeyStore(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        HttpSenderConfiguration httpSenderConfiguration = (HttpSenderConfiguration) ConfigUtils.getPluginConfiguration(coreConfiguration, HttpSenderConfiguration.class);
        KeyStore keyStoreCreate = ((KeyStoreFactory) new InstanceCreator().create(httpSenderConfiguration.keyStoreFactoryClass(), new InstanceCreator.Fallback() { // from class: cl4
            @Override // org.acra.util.InstanceCreator.Fallback
            public final Object get() {
                return new NoKeyStoreFactory();
            }
        })).create(context);
        if (keyStoreCreate != null) {
            return keyStoreCreate;
        }
        int iResCertificate = httpSenderConfiguration.resCertificate();
        String strCertificatePath = httpSenderConfiguration.certificatePath();
        String strCertificateType = httpSenderConfiguration.certificateType();
        if (iResCertificate != 0) {
            return new c(strCertificateType, iResCertificate).create(context);
        }
        if (strCertificatePath.equals("")) {
            return keyStoreCreate;
        }
        return strCertificatePath.startsWith(a) ? new a(strCertificateType, strCertificatePath.substring(8)).create(context) : new b(strCertificateType, strCertificatePath).create(context);
    }
}
