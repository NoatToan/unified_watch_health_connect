package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lmg;", "Llg;", "", "init", "deInit", "Lw5;", "callback", PluginDeviceInfo.FMODEL, "Ln2;", "characteristic", "<init>", "(Ln2;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class mg implements lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n2 f26121a;

    public mg(@NotNull n2 characteristic) {
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        this.f26121a = characteristic;
    }

    @Override // defpackage.lg
    public boolean a(@NotNull w5 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.f26121a.a(callback);
    }

    @Override // defpackage.lg
    public boolean deInit() {
        return this.f26121a.deInit();
    }

    @Override // defpackage.lg
    public boolean init() {
        return this.f26121a.init();
    }

    @Override // defpackage.lg
    public boolean a() {
        return this.f26121a.d();
    }
}
