package com.huami.phn.util;

import androidx.exifinterface.media.ExifInterface;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0096\u0001\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00000\u00052!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"R", ExifInterface.GPS_DIRECTION_TRUE, "", "E", "Lcom/huami/phn/util/Result;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "onSuccess", Constants.EXCEPTION, "onFailure", "fold", "(Lcom/huami/phn/util/Result;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "phn_coach_release"}, k = 2, mv = {1, 5, 1})
public final class ResultKt {
    public static final <R, T, E extends Throwable> R fold(@NotNull Result<? extends T, ? extends E> result, @NotNull Function1<? super T, ? extends R> function1, @NotNull Function1<? super E, ? extends R> function2) {
        Throwable thExceptionOrNull = result.exceptionOrNull();
        return thExceptionOrNull == null ? function1.invoke((Object) result.getValue()) : function2.invoke(thExceptionOrNull);
    }
}
