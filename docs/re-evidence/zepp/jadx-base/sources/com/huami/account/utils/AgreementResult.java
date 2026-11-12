package com.huami.account.utils;

import com.google.gson.annotations.SerializedName;
import com.huami.account.UserLegalInfoManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J3\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/account/utils/AgreementResult;", "", "", "component1", "component2", "", "Lcom/huami/account/utils/AgreementItem;", "component3", "hadSaved", "time", "items", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getHadSaved", "()Ljava/lang/String;", "b", "getTime", "c", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AgreementResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(UserLegalInfoManager.KEY_HAD_SAVED)
    @Nullable
    private final String hadSaved;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("time")
    @Nullable
    private final String time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("items")
    @Nullable
    private final List<AgreementItem> items;

    public AgreementResult(@Nullable String str, @Nullable String str2, @Nullable List<AgreementItem> list) {
        this.hadSaved = str;
        this.time = str2;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgreementResult copy$default(AgreementResult agreementResult, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agreementResult.hadSaved;
        }
        if ((i & 2) != 0) {
            str2 = agreementResult.time;
        }
        if ((i & 4) != 0) {
            list = agreementResult.items;
        }
        return agreementResult.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHadSaved() {
        return this.hadSaved;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @Nullable
    public final List<AgreementItem> component3() {
        return this.items;
    }

    @NotNull
    public final AgreementResult copy(@Nullable String hadSaved, @Nullable String time, @Nullable List<AgreementItem> items) {
        return new AgreementResult(hadSaved, time, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementResult)) {
            return false;
        }
        AgreementResult agreementResult = (AgreementResult) other;
        return Intrinsics.areEqual(this.hadSaved, agreementResult.hadSaved) && Intrinsics.areEqual(this.time, agreementResult.time) && Intrinsics.areEqual(this.items, agreementResult.items);
    }

    @Nullable
    public final String getHadSaved() {
        return this.hadSaved;
    }

    @Nullable
    public final List<AgreementItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.hadSaved;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.time;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AgreementItem> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AgreementResult(hadSaved=" + this.hadSaved + ", time=" + this.time + ", items=" + this.items + ")";
    }
}
