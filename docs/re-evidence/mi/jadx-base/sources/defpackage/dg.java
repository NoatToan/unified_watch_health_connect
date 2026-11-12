package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0005\r\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Ldg;", "Ljq$a;", "", "cmd", "I", PluginDeviceInfo.FMODEL, "()I", "", "getBytes", "()[B", "bytes", "<init>", "(I)V", PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class dg extends jq.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f15500b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15501a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ldg$a;", "", "", "CMD_BYTE_LEN", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldg$b;", "Ldg;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends dg {

        @NotNull
        public static final b c = new b();

        public b() {
            super(4);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldg$c;", "Ldg;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends dg {

        @NotNull
        public static final c c = new c();

        public c() {
            super(6);
        }
    }

    public dg(int i) {
        super(c3.a(i, 1));
        this.f15501a = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF15501a() {
        return this.f15501a;
    }

    @Override // jq.a
    @NotNull
    public byte[] getBytes() {
        return c3.a(this.f15501a, 1);
    }
}
