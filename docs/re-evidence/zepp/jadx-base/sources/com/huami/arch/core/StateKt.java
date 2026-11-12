package com.huami.arch.core;

import androidx.exifinterface.media.ExifInterface;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003H\u0086\b¨\u0006\u0006"}, d2 = {"R", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/State;", "Lkotlin/Function1;", TransportUri.ACTION_BLOCK, SportAnalytics.ParamValue.MapButtonType.MAP, "arch_release"}, k = 2, mv = {1, 4, 0})
public final class StateKt {
    @NotNull
    public static final <R, T> State<T> map(@NotNull State<? extends R> state, @NotNull Function1<? super R, ? extends T> function1) {
        if (state instanceof Loading) {
            return new Loading();
        }
        if (state instanceof Success) {
            return new Success(function1.invoke((Object) ((Success) state).getValue()));
        }
        if (state instanceof Fail) {
            return new Fail(((Fail) state).getError());
        }
        throw new NoWhenBranchMatchedException();
    }
}
