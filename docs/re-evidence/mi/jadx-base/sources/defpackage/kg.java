package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¨\u0006\u0018"}, d2 = {"Lkg;", "Ljg;", "", "init", "deInit", "Ljg$a;", "mode", "Ljg$b;", "operation", PluginDeviceInfo.FMODEL, "", "minutes", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "Ljq$a;", "command", "", "data", "Ljq;", "request", "Ln2;", "characteristic", "<init>", "(Ln2;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class kg implements jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n2 f23810a;

    public kg(@NotNull n2 characteristic) {
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        this.f23810a = characteristic;
    }

    @Override // defpackage.jg
    public boolean a(@NotNull jg.a mode, @NotNull jg.b operation) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return a(ig.d.f21107b, new byte[]{mode.getF22752a(), operation.getF22756a()});
    }

    @Override // defpackage.jg
    public boolean deInit() {
        return this.f23810a.deInit();
    }

    @Override // defpackage.jg
    @Nullable
    public HeartRateConfig getHeartRateConfig() {
        byte[] bArrI = this.f23810a.i();
        if (bArrI != null) {
            return HeartRateConfig.parserFrom(bArrI);
        }
        return null;
    }

    @Override // defpackage.jg
    public boolean init() {
        return this.f23810a.init();
    }

    @Override // defpackage.jg
    public boolean a(int minutes) {
        return a(ig.c.f21106b, new byte[]{(byte) minutes});
    }

    @Override // defpackage.jg
    public boolean a() {
        return a(this, ig.b.f21105b, null, 2, null);
    }

    public static /* synthetic */ boolean a(kg kgVar, jq.a aVar, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return kgVar.a(aVar, bArr);
    }

    public final boolean a(jq.a command, byte[] data) {
        return a(new jq(command, data));
    }

    public final boolean a(jq request) {
        return this.f23810a.b(request.getF23009a());
    }
}
