package com.huami.applet.extension;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\bø\u0001\u0000\u001a*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\bø\u0001\u0000\u001a1\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "Lcom/huami/applet/extension/BooleanExt;", "yes", "no", "otherwise", "(Lcom/huami/applet/extension/BooleanExt;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "applet_release"}, k = 2, mv = {1, 5, 1})
public final class BooleanExtKt {
    @NotNull
    public static final <T> BooleanExt<T> no(boolean z, @NotNull Function0<? extends T> function0) {
        return z ? Otherwise.INSTANCE : new WithData(function0.invoke());
    }

    public static final <T> T otherwise(@NotNull BooleanExt<? extends T> booleanExt, @NotNull Function0<? extends T> function0) {
        if (booleanExt instanceof Otherwise) {
            return function0.invoke();
        }
        if (booleanExt instanceof WithData) {
            return (T) ((WithData) booleanExt).getData();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final <T> BooleanExt<T> yes(boolean z, @NotNull Function0<? extends T> function0) {
        return z ? new WithData(function0.invoke()) : Otherwise.INSTANCE;
    }
}
