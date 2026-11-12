package org.acra.annotation;

import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.acra.security.KeyStoreFactory;
import org.acra.security.NoKeyStoreFactory;
import org.acra.security.TLS;
import org.acra.sender.HttpSender;

/* JADX INFO: loaded from: classes23.dex */
@Target({ElementType.TYPE})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AcraHttpSender {
    @NonNull
    String basicAuthLogin() default "ACRA-NULL-STRING";

    @NonNull
    String basicAuthPassword() default "ACRA-NULL-STRING";

    @NonNull
    String certificatePath() default "";

    @NonNull
    String certificateType() default "X.509";

    boolean compress() default false;

    int connectionTimeout() default 5000;

    boolean dropReportsOnTimeout() default false;

    @NonNull
    HttpSender.Method httpMethod();

    @NonNull
    Class<? extends KeyStoreFactory> keyStoreFactoryClass() default NoKeyStoreFactory.class;

    @RawRes
    int resCertificate() default 0;

    int socketTimeout() default 20000;

    @NonNull
    TLS[] tlsProtocols() default {TLS.V1_3, TLS.V1_2, TLS.V1_1, TLS.V1};

    @NonNull
    String uri();
}
