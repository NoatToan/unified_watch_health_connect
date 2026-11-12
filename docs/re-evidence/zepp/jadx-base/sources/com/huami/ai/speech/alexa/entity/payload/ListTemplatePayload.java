package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/ListTemplatePayload;", "Lcom/huami/ai/speech/alexa/entity/payload/BaseTemplateRuntimePayload;", "", "Lcom/huami/ai/speech/alexa/entity/payload/ListItem;", "component1", "listItems", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "e", "Ljava/util/List;", "getListItems", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ListTemplatePayload extends BaseTemplateRuntimePayload {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("listItems")
    @NotNull
    private final List<ListItem> listItems;

    public ListTemplatePayload(@NotNull List<ListItem> list) {
        super(null, null, null, null, 15, null);
        this.listItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListTemplatePayload copy$default(ListTemplatePayload listTemplatePayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listTemplatePayload.listItems;
        }
        return listTemplatePayload.copy(list);
    }

    @NotNull
    public final List<ListItem> component1() {
        return this.listItems;
    }

    @NotNull
    public final ListTemplatePayload copy(@NotNull List<ListItem> listItems) {
        return new ListTemplatePayload(listItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ListTemplatePayload) && Intrinsics.areEqual(this.listItems, ((ListTemplatePayload) other).listItems);
    }

    @NotNull
    public final List<ListItem> getListItems() {
        return this.listItems;
    }

    public int hashCode() {
        return this.listItems.hashCode();
    }

    @NotNull
    public String toString() {
        return "ListTemplatePayload(listItems=" + this.listItems + ')';
    }
}
