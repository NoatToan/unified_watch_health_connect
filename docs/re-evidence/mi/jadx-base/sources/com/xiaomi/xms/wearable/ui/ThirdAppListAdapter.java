package com.xiaomi.xms.wearable.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.xms.wearable.bean.AppInfo;
import com.xiaomi.xms.wearable.ui.ThirdAppListAdapter;
import defpackage.psi;
import defpackage.r8h;
import defpackage.wvi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u001d\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/ThirdAppListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/xms/wearable/ui/ThirdAppListAdapter$ThirdAppListHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/xms/wearable/ui/ThirdAppListAdapter$ThirdAppListHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/xms/wearable/ui/ThirdAppListAdapter$ThirdAppListHolder;I)V", "getItemCount", "()I", "", "Lcom/xiaomi/xms/wearable/bean/AppInfo;", "appInfoList", "Ljava/util/List;", "Lr8h;", "onItemClickListener", "Lr8h;", "<init>", "(Ljava/util/List;Lr8h;)V", "ThirdAppListHolder", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
public final class ThirdAppListAdapter extends RecyclerView.Adapter<ThirdAppListHolder> {

    @NotNull
    private final List<AppInfo> appInfoList;

    @NotNull
    private final r8h onItemClickListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/ThirdAppListAdapter$ThirdAppListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "appName", "Landroid/widget/TextView;", "getAppName", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/xms/wearable/ui/ThirdAppListAdapter;Landroid/view/View;)V", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
    public final class ThirdAppListHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView appName;

        @NotNull
        private final ImageView icon;
        final /* synthetic */ ThirdAppListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThirdAppListHolder(@NotNull ThirdAppListAdapter thirdAppListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = thirdAppListAdapter;
            View viewFindViewById = view.findViewById(psi.p);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(psi.g);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.appName = (TextView) viewFindViewById2;
        }

        @NotNull
        public final TextView getAppName() {
            return this.appName;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }
    }

    public ThirdAppListAdapter(@NotNull List<AppInfo> appInfoList, @NotNull r8h onItemClickListener) {
        Intrinsics.checkNotNullParameter(appInfoList, "appInfoList");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.appInfoList = appInfoList;
        this.onItemClickListener = onItemClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ThirdAppListAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onItemClickListener.onItemClick(view, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.appInfoList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ThirdAppListHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AppInfo appInfo = this.appInfoList.get(position);
        holder.getAppName().setText(appInfo.getAppName());
        holder.getIcon().setImageDrawable(appInfo.getAppIcon());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: bap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdAppListAdapter.onBindViewHolder$lambda$0(this.f3991a, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ThirdAppListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(wvi.g, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ThirdAppListHolder(this, viewInflate);
    }
}
