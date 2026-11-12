package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, d2 = {"Lv0;", "", "", PluginDeviceInfo.FMODEL, "", "toString", "", "hashCode", "other", "equals", "version", "apiLevel", "allowLocalBinding", "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AuthorizationProtocolInfo {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int apiLevel;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int allowLocalBinding;

    /* JADX INFO: renamed from: v0$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lv0$a;", "", "", "byteArray", "Lv0;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AuthorizationProtocolInfo a(@Nullable byte[] byteArray) {
            if (byteArray == null) {
                return null;
            }
            a3 a3Var = new a3(byteArray);
            return new AuthorizationProtocolInfo(a3Var.a(), a3Var.b(), a3Var.a());
        }
    }

    public AuthorizationProtocolInfo(int i, int i2, int i3) {
        this.version = i;
        this.apiLevel = i2;
        this.allowLocalBinding = i3;
    }

    public final boolean a() {
        return this.allowLocalBinding == 1;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizationProtocolInfo)) {
            return false;
        }
        AuthorizationProtocolInfo authorizationProtocolInfo = (AuthorizationProtocolInfo) other;
        return this.version == authorizationProtocolInfo.version && this.apiLevel == authorizationProtocolInfo.apiLevel && this.allowLocalBinding == authorizationProtocolInfo.allowLocalBinding;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.version) * 31) + Integer.hashCode(this.apiLevel)) * 31) + Integer.hashCode(this.allowLocalBinding);
    }

    @NotNull
    public String toString() {
        return "AuthorizationProtocolInfo(version=" + this.version + ", apiLevel=" + this.apiLevel + ", allowLocalBinding=" + this.allowLocalBinding + ')';
    }
}
