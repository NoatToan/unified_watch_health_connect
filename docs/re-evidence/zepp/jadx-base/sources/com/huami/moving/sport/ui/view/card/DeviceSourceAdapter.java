package com.huami.moving.sport.ui.view.card;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.moving.sport.ui.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter$ViewHolder;", "", "Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter$DeviceItem;", "item", "", "setItems", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemCount", "", "a", "Lkotlin/Lazy;", "getItems", "()Ljava/util/List;", "items", "<init>", "()V", "DeviceItem", "ViewHolder", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceSourceAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy items = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter$DeviceItem;", "item", "", "bindItem", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NotNull View view) {
            super(view);
        }

        public final void bindItem(@NotNull DeviceItem item) {
            ((TextView) this.itemView.findViewById(R.id.tv_name)).setText(item.getName());
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.iv_icon);
            if (imageView == null) {
                return;
            }
            if (item.getIconUrl() != null) {
                Glide.with(imageView).load(item.getIconUrl()).into(imageView);
            } else {
                Glide.with(imageView).load(Integer.valueOf(R.drawable.moving_ui_sport_detail_device)).into(imageView);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter$DeviceItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<DeviceItem>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<DeviceItem> invoke() {
            return new ArrayList();
        }
    }

    private final List<DeviceItem> getItems() {
        return (List) this.items.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return getItems().size();
    }

    public final void setItems(@NotNull List<DeviceItem> item) {
        getItems().clear();
        getItems().addAll(item);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        DeviceItem deviceItem = (DeviceItem) CollectionsKt.getOrNull(getItems(), position);
        if (deviceItem == null) {
            return;
        }
        holder.bindItem(deviceItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.moving_ui_item_sport_device, parent, false));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter$DeviceItem;", "", "", "component1", "component2", "name", "iconUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getIconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class DeviceItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private final String iconUrl;

        public DeviceItem(@NotNull String str, @Nullable String str2) {
            this.name = str;
            this.iconUrl = str2;
        }

        public static /* synthetic */ DeviceItem copy$default(DeviceItem deviceItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceItem.name;
            }
            if ((i & 2) != 0) {
                str2 = deviceItem.iconUrl;
            }
            return deviceItem.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        public final DeviceItem copy(@NotNull String name, @Nullable String iconUrl) {
            return new DeviceItem(name, iconUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceItem)) {
                return false;
            }
            DeviceItem deviceItem = (DeviceItem) other;
            return Intrinsics.areEqual(this.name, deviceItem.name) && Intrinsics.areEqual(this.iconUrl, deviceItem.iconUrl);
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.iconUrl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "DeviceItem(name=" + this.name + ", iconUrl=" + this.iconUrl + ")";
        }

        public /* synthetic */ DeviceItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }
}
