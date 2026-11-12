package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lbs;", "", "", "errorCode", c.f13755a, PluginDeviceInfo.FDESC, "()B", "<init>", "(Ljava/lang/String;IB)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum bs {
    SUCCESS((byte) 1),
    INVALID_PARAMETER((byte) 2),
    UNKNOWN_GROUP((byte) 3),
    INVALID_GROUP_VERSION((byte) 4),
    INVALID_FIELD((byte) 5),
    INVALID_OPERATION((byte) 6),
    NO_MEMORY((byte) 7),
    OTHER((byte) -1);


    @NotNull
    public static final a u = new a(null);
    public final byte t;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lbs$a;", "", "", "value", "Lbs;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final bs a(byte value) {
            for (bs bsVar : bs.values()) {
                if (bsVar.getT() == value) {
                    if (bsVar == null) {
                        return bs.OTHER;
                    }
                    return bsVar;
                }
            }
            bsVar = null;
            if (bsVar == null) {
                return bs.OTHER;
            }
            return bsVar;
        }
    }

    bs(byte b2) {
        this.t = b2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte getT() {
        return this.t;
    }
}
