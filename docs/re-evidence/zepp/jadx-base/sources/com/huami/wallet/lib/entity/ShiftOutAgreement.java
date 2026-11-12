package com.huami.wallet.lib.entity;

import com.huami.sleepassistant.apilib.utils.WebConst;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/huami/wallet/lib/entity/ShiftOutAgreement;", "Ljava/io/Serializable;", "", "component1", "component2", "component3", "id", "url", "name", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "b", "getUrl", "setUrl", "c", "getName", "setName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ShiftOutAgreement implements Serializable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String name;

    public ShiftOutAgreement(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.id = str;
        this.url = str2;
        this.name = str3;
    }

    public static /* synthetic */ ShiftOutAgreement copy$default(ShiftOutAgreement shiftOutAgreement, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shiftOutAgreement.id;
        }
        if ((i & 2) != 0) {
            str2 = shiftOutAgreement.url;
        }
        if ((i & 4) != 0) {
            str3 = shiftOutAgreement.name;
        }
        return shiftOutAgreement.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ShiftOutAgreement copy(@NotNull String id, @NotNull String url, @NotNull String name) {
        return new ShiftOutAgreement(id, url, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShiftOutAgreement)) {
            return false;
        }
        ShiftOutAgreement shiftOutAgreement = (ShiftOutAgreement) other;
        return Intrinsics.areEqual(this.id, shiftOutAgreement.id) && Intrinsics.areEqual(this.url, shiftOutAgreement.url) && Intrinsics.areEqual(this.name, shiftOutAgreement.name);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.url.hashCode()) * 31) + this.name.hashCode();
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setUrl(@NotNull String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "ShiftOutAgreement(id=" + this.id + ", url=" + this.url + ", name=" + this.name + ')';
    }
}
