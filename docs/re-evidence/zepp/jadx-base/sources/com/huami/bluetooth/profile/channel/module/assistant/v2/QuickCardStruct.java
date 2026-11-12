package com.huami.bluetooth.profile.channel.module.assistant.v2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardStruct;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/ItemDto;", "item", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardStruct$QueryCardsResponseItem;", "item2ResponseItem", "responseItem2dto", "<init>", "()V", "QueryCardsResponseItem", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class QuickCardStruct {

    @NotNull
    public static final QuickCardStruct INSTANCE = new QuickCardStruct();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardStruct$QueryCardsResponseItem;", "", "", "component1", "component2", "", "component3", "appId", "cardId", "visible", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "b", "getCardId", "c", "Z", "getVisible", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class QueryCardsResponseItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String appId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final String cardId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final boolean visible;

        public QueryCardsResponseItem(@NotNull String str, @NotNull String str2, boolean z) {
            this.appId = str;
            this.cardId = str2;
            this.visible = z;
        }

        public static /* synthetic */ QueryCardsResponseItem copy$default(QueryCardsResponseItem queryCardsResponseItem, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = queryCardsResponseItem.appId;
            }
            if ((i & 2) != 0) {
                str2 = queryCardsResponseItem.cardId;
            }
            if ((i & 4) != 0) {
                z = queryCardsResponseItem.visible;
            }
            return queryCardsResponseItem.copy(str, str2, z);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getVisible() {
            return this.visible;
        }

        @NotNull
        public final QueryCardsResponseItem copy(@NotNull String appId, @NotNull String cardId, boolean visible) {
            return new QueryCardsResponseItem(appId, cardId, visible);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QueryCardsResponseItem)) {
                return false;
            }
            QueryCardsResponseItem queryCardsResponseItem = (QueryCardsResponseItem) other;
            return Intrinsics.areEqual(this.appId, queryCardsResponseItem.appId) && Intrinsics.areEqual(this.cardId, queryCardsResponseItem.cardId) && this.visible == queryCardsResponseItem.visible;
        }

        @NotNull
        public final String getAppId() {
            return this.appId;
        }

        @NotNull
        public final String getCardId() {
            return this.cardId;
        }

        public final boolean getVisible() {
            return this.visible;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            int iHashCode = ((this.appId.hashCode() * 31) + this.cardId.hashCode()) * 31;
            boolean z = this.visible;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        @NotNull
        public String toString() {
            return "QueryCardsResponseItem(appId=" + this.appId + ", cardId=" + this.cardId + ", visible=" + this.visible + ')';
        }
    }

    private QuickCardStruct() {
    }

    @NotNull
    public final QueryCardsResponseItem item2ResponseItem(@NotNull ItemDto item) {
        try {
            return new QueryCardsResponseItem(item.appId, item.cardId, item.visible);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NotNull
    public final ItemDto responseItem2dto(@NotNull QueryCardsResponseItem item) {
        ItemDto itemDto = new ItemDto();
        itemDto.appId = item.getAppId();
        itemDto.cardId = item.getCardId();
        itemDto.visible = item.getVisible();
        return itemDto;
    }
}
