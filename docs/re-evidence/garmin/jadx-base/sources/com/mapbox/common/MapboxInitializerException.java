package com.mapbox.common;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mapbox/common/MapboxInitializerException;", "", "initializerData", "Lcom/mapbox/common/InitializerData;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(Lcom/mapbox/common/InitializerData;Landroid/content/Context;Ljava/lang/Throwable;)V", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxInitializerException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxInitializerException(InitializerData initializerData, Context context, Throwable th3) {
        super(BaseMapboxInitializerKt.gatherSystemInfo(initializerData, context, th3), th3);
        initializerData.getClass();
        context.getClass();
        th3.getClass();
    }
}
