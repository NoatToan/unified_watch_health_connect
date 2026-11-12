package defpackage;

import com.mibi.sdk.common.CommonConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.homeroom.model.Home;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: db, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eB#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, d2 = {"Ldb;", "", "", "toString", "", "hashCode", "other", "", "equals", "stateCode", Home.JSON_KEY_ADDRESS, CommonConstants.KEY_USER_NAME, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FtpServerStatus {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int stateCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final String address;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String userName;

    /* JADX INFO: renamed from: db$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Ldb$a;", "", "", "STATE_DISABLED", "I", "STATE_ENABLED", "STATE_ENABLEING", "STATE_FAILED", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FtpServerStatus(int i, @Nullable String str, @Nullable String str2) {
        this.stateCode = i;
        this.address = str;
        this.userName = str2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FtpServerStatus)) {
            return false;
        }
        FtpServerStatus ftpServerStatus = (FtpServerStatus) other;
        return this.stateCode == ftpServerStatus.stateCode && Intrinsics.areEqual(this.address, ftpServerStatus.address) && Intrinsics.areEqual(this.userName, ftpServerStatus.userName);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.stateCode) * 31;
        String str = this.address;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FtpServerStatus(stateCode=" + this.stateCode + ", address=" + this.address + ", userName=" + this.userName + ')';
    }
}
