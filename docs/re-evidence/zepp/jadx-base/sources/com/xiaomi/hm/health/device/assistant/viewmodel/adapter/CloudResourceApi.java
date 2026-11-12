package com.xiaomi.hm.health.device.assistant.viewmodel.adapter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\tJ$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/CloudResourceApi;", "TitleRes", "IconRes", "", "", "appId", "cardId", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/CloudResourceApi$Item;", "loadTitleAndIcon", "Item", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface CloudResourceApi<TitleRes, IconRes> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0007\u001a\u00028\u0002\u0012\u0006\u0010\b\u001a\u00028\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00022\b\b\u0002\u0010\b\u001a\u00028\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u0019\u0010\u0007\u001a\u00028\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0005R\u0019\u0010\b\u001a\u00028\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/CloudResourceApi$Item;", "Title", "Icon", "", "component1", "()Ljava/lang/Object;", "component2", "title", "icon", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/CloudResourceApi$Item;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "getTitle", "b", "getIcon", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Item<Title, Icon> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final Title title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final Icon icon;

        public Item(Title title, Icon icon) {
            this.title = title;
            this.icon = icon;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item copy$default(Item item, Object obj, Object obj2, int i, Object obj3) {
            if ((i & 1) != 0) {
                obj = item.title;
            }
            if ((i & 2) != 0) {
                obj2 = item.icon;
            }
            return item.copy(obj, obj2);
        }

        public final Title component1() {
            return this.title;
        }

        public final Icon component2() {
            return this.icon;
        }

        @NotNull
        public final Item<Title, Icon> copy(Title title, Icon icon) {
            return new Item<>(title, icon);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.title, item.title) && Intrinsics.areEqual(this.icon, item.icon);
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final Title getTitle() {
            return this.title;
        }

        public int hashCode() {
            Title title = this.title;
            int iHashCode = (title == null ? 0 : title.hashCode()) * 31;
            Icon icon = this.icon;
            return iHashCode + (icon != null ? icon.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Item(title=" + this.title + ", icon=" + this.icon + ")";
        }
    }

    @NotNull
    Item<TitleRes, IconRes> loadTitleAndIcon(@NotNull String appId, @NotNull String cardId);
}
