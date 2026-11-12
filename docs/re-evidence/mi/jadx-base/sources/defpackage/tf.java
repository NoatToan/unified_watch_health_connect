package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0005\u000eB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Ltf;", "Ljq$a;", "", "cmd", "I", PluginDeviceInfo.FMODEL, "()I", "", "getBytes", "()[B", "bytes", "subType", "<init>", "(II)V", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class tf extends jq.a {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34634b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Ltf$a;", "", "", "CMD_BYTE_LEN", "I", "SUB_TYPE_DEVICE", "SUB_TYPE_HEARING", "SUB_TYPE_RESPONSE", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltf$b;", "Ltf;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends tf {

        @NotNull
        public static final b d = new b();

        public b() {
            super(2, 5);
        }
    }

    public tf(int i, int i2) {
        super(ArraysKt___ArraysJvmKt.plus(c3.a(i, 1), c3.a(i2, 1)));
        this.f34633a = i;
        this.f34634b = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF34634b() {
        return this.f34634b;
    }

    @Override // jq.a
    @NotNull
    public byte[] getBytes() {
        return ArraysKt___ArraysJvmKt.plus(c3.a(this.f34633a, 1), c3.a(this.f34634b, 1));
    }
}
