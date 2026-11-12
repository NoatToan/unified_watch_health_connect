package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cl, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eB+\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, d2 = {"Lcl;", "", "", "toString", "", "hashCode", "other", "", "equals", "ecgVersion", "spo2Version", "ppgVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class MedicalRegisterVersion {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @Nullable
    public final String ecgVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final String spo2Version;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String ppgVersion;

    /* JADX INFO: renamed from: cl$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcl$a;", "", "", "data", "Lcl;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MedicalRegisterVersion a(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            List listA = y2.a(data, 0, 0, false, 7, null);
            if (listA.size() >= 3) {
                return new MedicalRegisterVersion((String) listA.get(0), (String) listA.get(1), (String) listA.get(2));
            }
            return new MedicalRegisterVersion(null, null, null, 7, null);
        }
    }

    public MedicalRegisterVersion() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedicalRegisterVersion)) {
            return false;
        }
        MedicalRegisterVersion medicalRegisterVersion = (MedicalRegisterVersion) other;
        return Intrinsics.areEqual(this.ecgVersion, medicalRegisterVersion.ecgVersion) && Intrinsics.areEqual(this.spo2Version, medicalRegisterVersion.spo2Version) && Intrinsics.areEqual(this.ppgVersion, medicalRegisterVersion.ppgVersion);
    }

    public int hashCode() {
        String str = this.ecgVersion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.spo2Version;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ppgVersion;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MedicalRegisterVersion(ecgVersion=" + this.ecgVersion + ", spo2Version=" + this.spo2Version + ", ppgVersion=" + this.ppgVersion + ')';
    }

    public MedicalRegisterVersion(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.ecgVersion = str;
        this.spo2Version = str2;
        this.ppgVersion = str3;
    }

    public /* synthetic */ MedicalRegisterVersion(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
