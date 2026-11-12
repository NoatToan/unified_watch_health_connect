package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity(indices = {@Index(unique = true, value = {"jumpType"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003J;\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R!\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010%\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/huami/training/db/po/FilterMode;", "", "", "component1", "component2", "component3", "", "component4", "text", "jumpType", "defaultOrder", "supportOrders", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "getJumpType", "c", "getDefaultOrder", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getSupportOrders", "()Ljava/util/List;", "e", LogUtil.I, "getId", "()I", WebConst.QueryParam.SET_ID, "(I)V", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FilterMode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String jumpType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String defaultOrder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<String> supportOrders;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    private int id;

    public FilterMode(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable List<String> list) {
        this.text = str;
        this.jumpType = str2;
        this.defaultOrder = str3;
        this.supportOrders = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterMode copy$default(FilterMode filterMode, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterMode.text;
        }
        if ((i & 2) != 0) {
            str2 = filterMode.jumpType;
        }
        if ((i & 4) != 0) {
            str3 = filterMode.defaultOrder;
        }
        if ((i & 8) != 0) {
            list = filterMode.supportOrders;
        }
        return filterMode.copy(str, str2, str3, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDefaultOrder() {
        return this.defaultOrder;
    }

    @Nullable
    public final List<String> component4() {
        return this.supportOrders;
    }

    @NotNull
    public final FilterMode copy(@NotNull String text, @NotNull String jumpType, @Nullable String defaultOrder, @Nullable List<String> supportOrders) {
        return new FilterMode(text, jumpType, defaultOrder, supportOrders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterMode)) {
            return false;
        }
        FilterMode filterMode = (FilterMode) other;
        return Intrinsics.areEqual(this.text, filterMode.text) && Intrinsics.areEqual(this.jumpType, filterMode.jumpType) && Intrinsics.areEqual(this.defaultOrder, filterMode.defaultOrder) && Intrinsics.areEqual(this.supportOrders, filterMode.supportOrders);
    }

    @Nullable
    public final String getDefaultOrder() {
        return this.defaultOrder;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    public final List<String> getSupportOrders() {
        return this.supportOrders;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + this.jumpType.hashCode()) * 31;
        String str = this.defaultOrder;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.supportOrders;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "FilterMode(text=" + this.text + ", jumpType=" + this.jumpType + ", defaultOrder=" + ((Object) this.defaultOrder) + ", supportOrders=" + this.supportOrders + ')';
    }
}
