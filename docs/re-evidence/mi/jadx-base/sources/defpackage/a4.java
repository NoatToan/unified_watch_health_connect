package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"La4;", "", "", "value", c.f13755a, PluginDeviceInfo.FICONON, "()B", "", "byteLen", "I", PluginDeviceInfo.FDESC, "()I", "<init>", "(Ljava/lang/String;IBI)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum a4 {
    UINT_8((byte) 0, 1),
    INT_8((byte) 1, 1),
    UINT_16((byte) 2, 2),
    INT_16((byte) 3, 2),
    UINT_32((byte) 4, 4),
    INT_32((byte) 5, 4),
    UINT_64((byte) 6, 8),
    INT_64((byte) 7, 8),
    FLOAT_32((byte) 8, 4),
    FLOAT_64((byte) 9, 8);


    @NotNull
    public static final a v = new a(null);
    public final byte t;
    public final int u;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"La4$a;", "", "", "value", "La4;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final a4 a(byte value) {
            for (a4 a4Var : a4.values()) {
                if (a4Var.getT() == value) {
                    return a4Var;
                }
            }
            return null;
        }
    }

    a4(byte b2, int i) {
        this.t = b2;
        this.u = i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getU() {
        return this.u;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte getT() {
        return this.t;
    }
}
