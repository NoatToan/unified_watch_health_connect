package com.huami.ai.entity.template;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/huami/ai/entity/template/ListTemplate;", "", "", "component1", "component2", "", "component3", "", "Lcom/huami/ai/entity/template/ListTemplateItem;", "component4", "title", MessengerShareContentUtility.SUBTITLE, "itemCount", "item", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getSubtitle", "c", LogUtil.I, "getItemCount", "()I", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getItem", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ListTemplate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int itemCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<ListTemplateItem> item;

    public ListTemplate(@NotNull String str, @NotNull String str2, int i, @NotNull List<ListTemplateItem> list) {
        this.title = str;
        this.subtitle = str2;
        this.itemCount = i;
        this.item = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListTemplate copy$default(ListTemplate listTemplate, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = listTemplate.title;
        }
        if ((i2 & 2) != 0) {
            str2 = listTemplate.subtitle;
        }
        if ((i2 & 4) != 0) {
            i = listTemplate.itemCount;
        }
        if ((i2 & 8) != 0) {
            list = listTemplate.item;
        }
        return listTemplate.copy(str, str2, i, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }

    @NotNull
    public final List<ListTemplateItem> component4() {
        return this.item;
    }

    @NotNull
    public final ListTemplate copy(@NotNull String title, @NotNull String subtitle, int itemCount, @NotNull List<ListTemplateItem> item) {
        return new ListTemplate(title, subtitle, itemCount, item);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) other;
        return Intrinsics.areEqual(this.title, listTemplate.title) && Intrinsics.areEqual(this.subtitle, listTemplate.subtitle) && this.itemCount == listTemplate.itemCount && Intrinsics.areEqual(this.item, listTemplate.item);
    }

    @NotNull
    public final List<ListTemplateItem> getItem() {
        return this.item;
    }

    public final int getItemCount() {
        return this.itemCount;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.itemCount) * 31) + this.item.hashCode();
    }

    @NotNull
    public String toString() {
        return "ListTemplate(title=" + this.title + ", subtitle=" + this.subtitle + ", itemCount=" + this.itemCount + ", item=" + this.item + ')';
    }
}
