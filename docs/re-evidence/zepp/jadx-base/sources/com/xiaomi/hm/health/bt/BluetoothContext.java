package com.xiaomi.hm.health.bt;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000bR1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/BluetoothContext;", "", "Landroid/content/Context;", "<set-?>", "b", "Lkotlin/properties/ReadWriteProperty;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getContext$annotations", "()V", DbUtils.Const.Table.CONTEXT, "<init>", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BluetoothContext {
    public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(Reflection.getOrCreateKotlinClass(BluetoothContext.class), DbUtils.Const.Table.CONTEXT, "getContext()Landroid/content/Context;"))};

    @NotNull
    public static final BluetoothContext INSTANCE = new BluetoothContext();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty context = Delegates.INSTANCE.notNull();

    private BluetoothContext() {
    }

    @NotNull
    public static final Context getContext() {
        return (Context) context.getValue(INSTANCE, a[0]);
    }

    @JvmStatic
    public static /* synthetic */ void getContext$annotations() {
    }

    public static final void setContext(@NotNull Context context2) {
        context.setValue(INSTANCE, a[0], context2);
    }
}
