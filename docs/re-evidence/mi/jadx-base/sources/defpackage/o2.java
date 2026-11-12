package defpackage;

import android.content.Context;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000bR1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lo2;", "", "Landroid/content/Context;", "<set-?>", "context$delegate", "Lkotlin/properties/ReadWriteProperty;", "getContext", "()Landroid/content/Context;", PluginDeviceInfo.FMODEL, "(Landroid/content/Context;)V", "getContext$annotations", "()V", "context", "<init>", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o2 f28659a = new o2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f28660b = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(f28659a, o2.class, "context", "getContext()Landroid/content/Context;", 0))};

    @NotNull
    public static final ReadWriteProperty c = Delegates.INSTANCE.notNull();

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        c.setValue(f28659a, f28660b[0], context);
    }
}
