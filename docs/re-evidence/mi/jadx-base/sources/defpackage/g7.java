package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lg7;", "", "", "byteArray", "", PluginDeviceInfo.FMODEL, "Lkotlin/Function1;", "hook", "Lnq;", "predict", "<init>", "(Lkotlin/jvm/functions/Function1;Lnq;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<byte[], Unit> f18664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final nq f18665b;

    /* JADX WARN: Multi-variable type inference failed */
    public g7(@NotNull Function1<? super byte[], Unit> hook, @NotNull nq predict) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        Intrinsics.checkNotNullParameter(predict, "predict");
        this.f18664a = hook;
        this.f18665b = predict;
    }

    public final void a(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (this.f18665b.a(byteArray)) {
            this.f18664a.invoke(byteArray);
        }
    }
}
