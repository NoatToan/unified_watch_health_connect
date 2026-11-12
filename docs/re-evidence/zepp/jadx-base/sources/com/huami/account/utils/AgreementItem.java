package com.huami.account.utils;

import com.google.gson.annotations.SerializedName;
import com.huami.account.UserLegalInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/account/utils/AgreementItem;", "", "", "component1", "()Ljava/lang/Long;", "", "component2", "component3", ParamKey.createTime, UserLegalInfoManager.KEY_LANGUAGE, "version", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/account/utils/AgreementItem;", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Long;", "getCreateTime", "b", "Ljava/lang/String;", "getLanguage", "()Ljava/lang/String;", "c", "getVersion", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AgreementItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(ParamKey.createTime)
    @Nullable
    private final Long createTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(UserLegalInfoManager.KEY_LANGUAGE)
    @Nullable
    private final String language;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("version")
    @Nullable
    private final String version;

    public AgreementItem(@Nullable Long l, @Nullable String str, @Nullable String str2) {
        this.createTime = l;
        this.language = str;
        this.version = str2;
    }

    public static /* synthetic */ AgreementItem copy$default(AgreementItem agreementItem, Long l, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = agreementItem.createTime;
        }
        if ((i & 2) != 0) {
            str = agreementItem.language;
        }
        if ((i & 4) != 0) {
            str2 = agreementItem.version;
        }
        return agreementItem.copy(l, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final AgreementItem copy(@Nullable Long createTime, @Nullable String language, @Nullable String version) {
        return new AgreementItem(createTime, language, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementItem)) {
            return false;
        }
        AgreementItem agreementItem = (AgreementItem) other;
        return Intrinsics.areEqual(this.createTime, agreementItem.createTime) && Intrinsics.areEqual(this.language, agreementItem.language) && Intrinsics.areEqual(this.version, agreementItem.version);
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        Long l = this.createTime;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.language;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AgreementItem(createTime=" + this.createTime + ", language=" + this.language + ", version=" + this.version + ")";
    }
}
