package com.xiaomi.hm.health.bt.profile.base;

import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/MedicalRegisterVersion;", "", "", "component1", "component2", "component3", "ecgVersion", "spo2Version", "ppgVersion", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getEcgVersion", "()Ljava/lang/String;", "b", "getSpo2Version", "c", "getPpgVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MedicalRegisterVersion {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String ecgVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String spo2Version;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String ppgVersion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/MedicalRegisterVersion$Companion;", "", "", "data", "Lcom/xiaomi/hm/health/bt/profile/base/MedicalRegisterVersion;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MedicalRegisterVersion parse(@NotNull byte[] data) {
            List strings$default = ByteArrayKt.toStrings$default(data, 0, 0, false, 7, null);
            return strings$default.size() < 3 ? new MedicalRegisterVersion(null, null, null, 7, null) : new MedicalRegisterVersion((String) strings$default.get(0), (String) strings$default.get(1), (String) strings$default.get(2));
        }
    }

    public MedicalRegisterVersion() {
        this(null, null, null, 7, null);
    }

    public MedicalRegisterVersion(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.ecgVersion = str;
        this.spo2Version = str2;
        this.ppgVersion = str3;
    }

    public static /* synthetic */ MedicalRegisterVersion copy$default(MedicalRegisterVersion medicalRegisterVersion, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = medicalRegisterVersion.ecgVersion;
        }
        if ((i & 2) != 0) {
            str2 = medicalRegisterVersion.spo2Version;
        }
        if ((i & 4) != 0) {
            str3 = medicalRegisterVersion.ppgVersion;
        }
        return medicalRegisterVersion.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEcgVersion() {
        return this.ecgVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSpo2Version() {
        return this.spo2Version;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPpgVersion() {
        return this.ppgVersion;
    }

    @NotNull
    public final MedicalRegisterVersion copy(@Nullable String ecgVersion, @Nullable String spo2Version, @Nullable String ppgVersion) {
        return new MedicalRegisterVersion(ecgVersion, spo2Version, ppgVersion);
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

    @Nullable
    public final String getEcgVersion() {
        return this.ecgVersion;
    }

    @Nullable
    public final String getPpgVersion() {
        return this.ppgVersion;
    }

    @Nullable
    public final String getSpo2Version() {
        return this.spo2Version;
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
        return "MedicalRegisterVersion(ecgVersion=" + ((Object) this.ecgVersion) + ", spo2Version=" + ((Object) this.spo2Version) + ", ppgVersion=" + ((Object) this.ppgVersion) + ')';
    }

    public /* synthetic */ MedicalRegisterVersion(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
