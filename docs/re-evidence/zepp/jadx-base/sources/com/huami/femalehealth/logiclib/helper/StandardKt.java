package com.huami.femalehealth.logiclib.helper;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0004\u001a\u00028\u0001\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\u0004\u0018\u00018\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "ifNull", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class StandardKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends R, R> R ifNull(@Nullable T t, @NotNull Function0<? extends R> function0) {
        return t == 0 ? function0.invoke() : t;
    }
}
