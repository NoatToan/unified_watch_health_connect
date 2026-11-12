package org.acra.config;

import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import java.util.Map;
import org.acra.security.KeyStoreFactory;
import org.acra.security.TLS;
import org.acra.sender.HttpSender;

/* JADX INFO: loaded from: classes23.dex */
public interface HttpSenderConfigurationBuilder extends ConfigurationBuilder {
    @NonNull
    HttpSenderConfigurationBuilder setBasicAuthLogin(@NonNull String str);

    @NonNull
    HttpSenderConfigurationBuilder setBasicAuthPassword(@NonNull String str);

    @NonNull
    HttpSenderConfigurationBuilder setCertificatePath(@NonNull String str);

    @NonNull
    HttpSenderConfigurationBuilder setCertificateType(@NonNull String str);

    @NonNull
    HttpSenderConfigurationBuilder setCompress(boolean z);

    @NonNull
    HttpSenderConfigurationBuilder setConnectionTimeout(int i);

    @NonNull
    HttpSenderConfigurationBuilder setDropReportsOnTimeout(boolean z);

    @NonNull
    HttpSenderConfigurationBuilder setEnabled(boolean z);

    @NonNull
    HttpSenderConfigurationBuilder setHttpHeaders(Map<String, String> map);

    @NonNull
    HttpSenderConfigurationBuilder setHttpMethod(@NonNull HttpSender.Method method);

    @NonNull
    HttpSenderConfigurationBuilder setKeyStoreFactoryClass(@NonNull Class<? extends KeyStoreFactory> cls);

    @NonNull
    HttpSenderConfigurationBuilder setResCertificate(@RawRes int i);

    @NonNull
    HttpSenderConfigurationBuilder setSocketTimeout(int i);

    @NonNull
    HttpSenderConfigurationBuilder setTlsProtocols(@NonNull TLS... tlsArr);

    @NonNull
    HttpSenderConfigurationBuilder setUri(@NonNull String str);
}
