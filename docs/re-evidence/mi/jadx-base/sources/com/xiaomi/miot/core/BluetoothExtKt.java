package com.xiaomi.miot.core;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0000\u001a\u00020\u00018\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "miot-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BluetoothExtKt {

    @SuppressLint({"StaticFieldLeak"})
    public static Context context;

    @NotNull
    public static final Context getContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public static final void setContext(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        context = context2;
    }
}
