package com.huami.account.userinfo.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/huami/account/userinfo/bean/ItemValue;", "", "", "component1", "", "component2", "component3", "()Ljava/lang/Integer;", "nameId", "tip", "iconId", "copy", "(ILjava/lang/String;Ljava/lang/Integer;)Lcom/huami/account/userinfo/bean/ItemValue;", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getNameId", "()I", "b", "Ljava/lang/String;", "getTip", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "getIconId", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;)V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ItemValue {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int nameId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String tip;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer iconId;

    public ItemValue(int i, @Nullable String str, @Nullable Integer num) {
        this.nameId = i;
        this.tip = str;
        this.iconId = num;
    }

    public static /* synthetic */ ItemValue copy$default(ItemValue itemValue, int i, String str, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = itemValue.nameId;
        }
        if ((i2 & 2) != 0) {
            str = itemValue.tip;
        }
        if ((i2 & 4) != 0) {
            num = itemValue.iconId;
        }
        return itemValue.copy(i, str, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNameId() {
        return this.nameId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTip() {
        return this.tip;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getIconId() {
        return this.iconId;
    }

    @NotNull
    public final ItemValue copy(int nameId, @Nullable String tip, @Nullable Integer iconId) {
        return new ItemValue(nameId, tip, iconId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemValue)) {
            return false;
        }
        ItemValue itemValue = (ItemValue) other;
        return this.nameId == itemValue.nameId && Intrinsics.areEqual(this.tip, itemValue.tip) && Intrinsics.areEqual(this.iconId, itemValue.iconId);
    }

    @Nullable
    public final Integer getIconId() {
        return this.iconId;
    }

    public final int getNameId() {
        return this.nameId;
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    public int hashCode() {
        int i = this.nameId * 31;
        String str = this.tip;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.iconId;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ItemValue(nameId=" + this.nameId + ", tip=" + ((Object) this.tip) + ", iconId=" + this.iconId + ')';
    }
}
