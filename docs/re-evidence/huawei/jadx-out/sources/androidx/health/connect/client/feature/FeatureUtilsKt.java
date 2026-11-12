package androidx.health.connect.client.feature;

import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a-\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0000¢\u0006\u0002\u0010\u000f\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0000¢\u0006\u0002\u0010\u0011\u001a)\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\b\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0000¢\u0006\u0002\u0010\u0012\u001aF\u0010\u0013\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00020\u00012\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0080@¢\u0006\u0002\u0010\u0017\u001a:\u0010\u0013\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\b\u001a\u00020\u00012\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0080@¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"FEATURE_CONSTANT_NAME_PHR", "", "isPersonalHealthRecordFeatureAvailableInPlatform", "", "createExceptionDueToFeatureUnavailable", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "featureConstantName", "apiName", "withPhrFeatureCheck", ExifInterface.GPS_DIRECTION_TRUE, "kClass", "Lkotlin/reflect/KClass;", "block", "Lkotlin/Function0;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "methodName", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withPhrFeatureCheckSuspend", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FeatureUtilsKt {
    public static final String FEATURE_CONSTANT_NAME_PHR = "FEATURE_PERSONAL_HEALTH_RECORD";

    public static final boolean isPersonalHealthRecordFeatureAvailableInPlatform() {
        return Build.VERSION.SDK_INT >= 34 && HealthConnectFeaturesPlatformImpl.INSTANCE.getFeatureStatus(6) == 2;
    }

    public static final UnsupportedOperationException createExceptionDueToFeatureUnavailable(String str, String str2) {
        zcp.c(str, "");
        zcp.c(str2, "");
        return new UnsupportedOperationException("\"" + str2 + "\" must only be called if \"" + str + "\" feature is available. To check whether the feature is available, use `HealthConnectFeatures.getFeatureStatus(HealthConnectFeatures." + str + ") == FEATURE_STATUS_AVAILABLE`.");
    }

    public static final <T> T withPhrFeatureCheck(KClass<?> kClass, Function0<? extends T> function0) {
        zcp.c(kClass, "");
        zcp.c(function0, "");
        return (T) withPhrFeatureCheck(String.valueOf(kClass.getSimpleName()), function0);
    }

    public static final <T> T withPhrFeatureCheck(KClass<?> kClass, String str, Function0<? extends T> function0) {
        zcp.c(kClass, "");
        zcp.c(str, "");
        zcp.c(function0, "");
        return (T) withPhrFeatureCheck(kClass.getSimpleName() + '#' + str, function0);
    }

    public static final <T> T withPhrFeatureCheck(String str, Function0<? extends T> function0) {
        zcp.c(str, "");
        zcp.c(function0, "");
        if (isPersonalHealthRecordFeatureAvailableInPlatform()) {
            return function0.invoke();
        }
        throw createExceptionDueToFeatureUnavailable(FEATURE_CONSTANT_NAME_PHR, str);
    }

    public static final <T> Object withPhrFeatureCheckSuspend(KClass<?> kClass, String str, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return withPhrFeatureCheckSuspend(kClass.getSimpleName() + '#' + str, function1, continuation);
    }

    public static final <T> Object withPhrFeatureCheckSuspend(String str, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        if (isPersonalHealthRecordFeatureAvailableInPlatform()) {
            return function1.invoke(continuation);
        }
        throw createExceptionDueToFeatureUnavailable(FEATURE_CONSTANT_NAME_PHR, str);
    }
}
