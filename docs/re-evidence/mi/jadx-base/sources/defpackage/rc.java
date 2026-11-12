package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¨\u0006\u0012"}, d2 = {"Lrc;", "Lqc;", "", "type", "", PluginDeviceInfo.FMODEL, "Lpc;", "cmd", "data", "Ljq$a;", "command", "Lvc;", "Ljq;", "request", "Ltc;", "characteristic", "<init>", "(Ltc;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class rc implements qc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f32395b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final tc f32396a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lrc$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public rc(@NotNull tc characteristic) {
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        this.f32396a = characteristic;
    }

    @Override // defpackage.qc
    @Nullable
    public byte[] a(int type) {
        return a((pc) pc.b.c, c3.a(type, 0, 1, null));
    }

    public final byte[] a(pc cmd, byte[] data) {
        GenericResponse genericResponseA = a((jq.a) cmd, data);
        if (genericResponseA == null || !genericResponseA.a(cmd.getF30225a())) {
            return null;
        }
        return genericResponseA.getData();
    }

    public final GenericResponse a(jq.a command, byte[] data) {
        return a(new jq(command, data));
    }

    public final GenericResponse a(jq request) {
        return this.f32396a.a(request.getF23009a());
    }
}
