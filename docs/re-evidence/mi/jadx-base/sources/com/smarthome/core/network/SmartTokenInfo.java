package com.smarthome.core.network;

import com.xiaomi.smarthome.setting.LoginSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 52\u00020\u0001:\u00015Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003Ji\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u00100\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00066"}, d2 = {"Lcom/smarthome/core/network/SmartTokenInfo;", "", "sid", "", "cUserId", "serviceToken", "ssecurity", "timeDiff", "", "domain", "miId", "passToken", "isSystemAccount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCUserId", "()Ljava/lang/String;", "setCUserId", "(Ljava/lang/String;)V", "getDomain", "setDomain", "()Z", "setSystemAccount", "(Z)V", "getMiId", "setMiId", "getPassToken", "setPassToken", "getServiceToken", "setServiceToken", "getSid", "setSid", "getSsecurity", "setSsecurity", "getTimeDiff", "()J", "setTimeDiff", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class SmartTokenInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String SID_XIAOMI_IO = LoginSetting.SID_XIAOMI_IO;

    @Nullable
    private String cUserId;

    @NotNull
    private String domain;
    private boolean isSystemAccount;

    @NotNull
    private String miId;

    @NotNull
    private String passToken;

    @Nullable
    private String serviceToken;

    @NotNull
    private String sid;

    @Nullable
    private String ssecurity;
    private long timeDiff;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/smarthome/core/network/SmartTokenInfo$Companion;", "", "()V", "SID_XIAOMI_IO", "", "getSID_XIAOMI_IO", "()Ljava/lang/String;", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSID_XIAOMI_IO() {
            return SmartTokenInfo.SID_XIAOMI_IO;
        }
    }

    public SmartTokenInfo() {
        this(null, null, null, null, 0L, null, null, null, false, 511, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCUserId() {
        return this.cUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServiceToken() {
        return this.serviceToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSsecurity() {
        return this.ssecurity;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimeDiff() {
        return this.timeDiff;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMiId() {
        return this.miId;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPassToken() {
        return this.passToken;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsSystemAccount() {
        return this.isSystemAccount;
    }

    @NotNull
    public final SmartTokenInfo copy(@NotNull String sid, @Nullable String cUserId, @Nullable String serviceToken, @Nullable String ssecurity, long timeDiff, @NotNull String domain, @NotNull String miId, @NotNull String passToken, boolean isSystemAccount) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(miId, "miId");
        Intrinsics.checkNotNullParameter(passToken, "passToken");
        return new SmartTokenInfo(sid, cUserId, serviceToken, ssecurity, timeDiff, domain, miId, passToken, isSystemAccount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartTokenInfo)) {
            return false;
        }
        SmartTokenInfo smartTokenInfo = (SmartTokenInfo) other;
        return Intrinsics.areEqual(this.sid, smartTokenInfo.sid) && Intrinsics.areEqual(this.cUserId, smartTokenInfo.cUserId) && Intrinsics.areEqual(this.serviceToken, smartTokenInfo.serviceToken) && Intrinsics.areEqual(this.ssecurity, smartTokenInfo.ssecurity) && this.timeDiff == smartTokenInfo.timeDiff && Intrinsics.areEqual(this.domain, smartTokenInfo.domain) && Intrinsics.areEqual(this.miId, smartTokenInfo.miId) && Intrinsics.areEqual(this.passToken, smartTokenInfo.passToken) && this.isSystemAccount == smartTokenInfo.isSystemAccount;
    }

    @Nullable
    public final String getCUserId() {
        return this.cUserId;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getMiId() {
        return this.miId;
    }

    @NotNull
    public final String getPassToken() {
        return this.passToken;
    }

    @Nullable
    public final String getServiceToken() {
        return this.serviceToken;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final String getSsecurity() {
        return this.ssecurity;
    }

    public final long getTimeDiff() {
        return this.timeDiff;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20 */
    public int hashCode() {
        int iHashCode = this.sid.hashCode() * 31;
        String str = this.cUserId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.serviceToken;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ssecurity;
        int iHashCode4 = (((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.timeDiff)) * 31) + this.domain.hashCode()) * 31) + this.miId.hashCode()) * 31) + this.passToken.hashCode()) * 31;
        boolean z = this.isSystemAccount;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode4 + r1;
    }

    public final boolean isSystemAccount() {
        return this.isSystemAccount;
    }

    public final void setCUserId(@Nullable String str) {
        this.cUserId = str;
    }

    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.domain = str;
    }

    public final void setMiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.miId = str;
    }

    public final void setPassToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.passToken = str;
    }

    public final void setServiceToken(@Nullable String str) {
        this.serviceToken = str;
    }

    public final void setSid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sid = str;
    }

    public final void setSsecurity(@Nullable String str) {
        this.ssecurity = str;
    }

    public final void setSystemAccount(boolean z) {
        this.isSystemAccount = z;
    }

    public final void setTimeDiff(long j) {
        this.timeDiff = j;
    }

    @NotNull
    public String toString() {
        return "SmartTokenInfo(sid=" + this.sid + ", cUserId=" + ((Object) this.cUserId) + ", serviceToken=" + ((Object) this.serviceToken) + ", ssecurity=" + ((Object) this.ssecurity) + ", timeDiff=" + this.timeDiff + ", domain=" + this.domain + ", miId=" + this.miId + ", passToken=" + this.passToken + ", isSystemAccount=" + this.isSystemAccount + ')';
    }

    public SmartTokenInfo(@NotNull String sid, @Nullable String str, @Nullable String str2, @Nullable String str3, long j, @NotNull String domain, @NotNull String miId, @NotNull String passToken, boolean z) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(miId, "miId");
        Intrinsics.checkNotNullParameter(passToken, "passToken");
        this.sid = sid;
        this.cUserId = str;
        this.serviceToken = str2;
        this.ssecurity = str3;
        this.timeDiff = j;
        this.domain = domain;
        this.miId = miId;
        this.passToken = passToken;
        this.isSystemAccount = z;
    }

    public /* synthetic */ SmartTokenInfo(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LoginSetting.SID_XIAOMI_IO : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? LoginSetting.COOKIE_DOMAIN_XIAOMI_IO : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? false : z);
    }
}
