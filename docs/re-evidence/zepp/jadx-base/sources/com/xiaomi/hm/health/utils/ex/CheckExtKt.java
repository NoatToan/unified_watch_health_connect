package com.xiaomi.hm.health.utils.ex;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00018\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "", "nullAction", "ifNull", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "falseAction", "ifFalse", "(Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;)Ljava/lang/Boolean;", "trueAction", "ifTrue", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class CheckExtKt {
    @Nullable
    public static final Boolean ifFalse(@Nullable Boolean bool, @NotNull Function0<Unit> function0) {
        if (bool != null && bool.booleanValue()) {
            return bool;
        }
        function0.invoke();
        return null;
    }

    @Nullable
    public static final <T> T ifNull(@Nullable T t, @NotNull Function0<Unit> function0) {
        if (t == null) {
            function0.invoke();
        }
        return t;
    }

    @Nullable
    public static final Boolean ifTrue(@Nullable Boolean bool, @NotNull Function0<Unit> function0) {
        if (bool == null || !bool.booleanValue()) {
            return bool;
        }
        function0.invoke();
        return null;
    }
}
