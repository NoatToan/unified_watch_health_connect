package com.xiaomi.hm.health.push;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u0010.J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003Jc\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\r\u0010 R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\u0010\u0010 R\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b\u0011\u0010 R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u001dR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/push/Accounts;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "uid", "isInChina", "thirdId", "huamiId", "isOldAccount", "isHuamiSDKLogin", "scheme", "areaTopic", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", "b", "Z", "()Z", "c", "getThirdId", GoogleApiAvailabilityLight.a, "getHuamiId", "e", "f", "g", "getScheme", "h", "getAreaTopic", "setAreaTopic", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "push_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Accounts {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String uid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isInChina;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String thirdId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String huamiId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean isOldAccount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean isHuamiSDKLogin;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final String scheme;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private String areaTopic;

    public Accounts(@Nullable String str, boolean z, @Nullable String str2, @Nullable String str3, boolean z2, boolean z3, @Nullable String str4, @Nullable String str5) {
        this.uid = str;
        this.isInChina = z;
        this.thirdId = str2;
        this.huamiId = str3;
        this.isOldAccount = z2;
        this.isHuamiSDKLogin = z3;
        this.scheme = str4;
        this.areaTopic = str5;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsInChina() {
        return this.isInChina;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThirdId() {
        return this.thirdId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHuamiId() {
        return this.huamiId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsOldAccount() {
        return this.isOldAccount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsHuamiSDKLogin() {
        return this.isHuamiSDKLogin;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAreaTopic() {
        return this.areaTopic;
    }

    @NotNull
    public final Accounts copy(@Nullable String uid, boolean isInChina, @Nullable String thirdId, @Nullable String huamiId, boolean isOldAccount, boolean isHuamiSDKLogin, @Nullable String scheme, @Nullable String areaTopic) {
        return new Accounts(uid, isInChina, thirdId, huamiId, isOldAccount, isHuamiSDKLogin, scheme, areaTopic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Accounts)) {
            return false;
        }
        Accounts accounts = (Accounts) other;
        return Intrinsics.areEqual(this.uid, accounts.uid) && this.isInChina == accounts.isInChina && Intrinsics.areEqual(this.thirdId, accounts.thirdId) && Intrinsics.areEqual(this.huamiId, accounts.huamiId) && this.isOldAccount == accounts.isOldAccount && this.isHuamiSDKLogin == accounts.isHuamiSDKLogin && Intrinsics.areEqual(this.scheme, accounts.scheme) && Intrinsics.areEqual(this.areaTopic, accounts.areaTopic);
    }

    @Nullable
    public final String getAreaTopic() {
        return this.areaTopic;
    }

    @Nullable
    public final String getHuamiId() {
        return this.huamiId;
    }

    @Nullable
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    public final String getThirdId() {
        return this.thirdId;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isInChina;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        String str2 = this.thirdId;
        int iHashCode2 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.huamiId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z2 = this.isOldAccount;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i2 = (iHashCode3 + r3) * 31;
        boolean z3 = this.isHuamiSDKLogin;
        int i3 = (i2 + (z3 ? 1 : z3)) * 31;
        String str4 = this.scheme;
        int iHashCode4 = (i3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.areaTopic;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isHuamiSDKLogin() {
        return this.isHuamiSDKLogin;
    }

    public final boolean isInChina() {
        return this.isInChina;
    }

    public final boolean isOldAccount() {
        return this.isOldAccount;
    }

    public final void setAreaTopic(@Nullable String str) {
        this.areaTopic = str;
    }

    @NotNull
    public String toString() {
        return "Accounts(uid=" + ((Object) this.uid) + ", isInChina=" + this.isInChina + ", thirdId=" + ((Object) this.thirdId) + ", huamiId=" + ((Object) this.huamiId) + ", isOldAccount=" + this.isOldAccount + ", isHuamiSDKLogin=" + this.isHuamiSDKLogin + ", scheme=" + ((Object) this.scheme) + ", areaTopic=" + ((Object) this.areaTopic) + ')';
    }
}
