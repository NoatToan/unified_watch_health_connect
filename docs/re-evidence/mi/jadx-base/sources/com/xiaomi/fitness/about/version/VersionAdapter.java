package com.xiaomi.fitness.about.version;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.uqi;
import defpackage.yti;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/about/version/VersionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/about/version/VersionAdapter$ViewHolder;", "<init>", "()V", "items", "", "Lcom/xiaomi/fitness/about/version/BundleInfo;", "isDarkMode", "", "()Z", "setDarkMode", "(Z)V", "submitList", "", "newItems", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "ViewHolder", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VersionAdapter extends RecyclerView.Adapter<ViewHolder> {
    private boolean isDarkMode;

    @NotNull
    private List<BundleInfo> items = CollectionsKt__CollectionsKt.emptyList();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/about/version/VersionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "strategy", "", "getUpdateStrategyText", "(I)Ljava/lang/String;", "Lcom/xiaomi/fitness/about/version/BundleInfo;", "info", "", "bind", "(Lcom/xiaomi/fitness/about/version/BundleInfo;)V", "", "isDarkMode", "Z", "Landroid/widget/TextView;", "tvModule", "Landroid/widget/TextView;", "tvVersion", "tvMaketime", "tvApiLevel", "tvModuleIdMapVersion", "tvUpdateStrategy", "tvResidentMemory", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Z)V", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nYRNPluginVersionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNPluginVersionActivity.kt\ncom/xiaomi/fitness/about/version/VersionAdapter$ViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1863#2,2:181\n*S KotlinDebug\n*F\n+ 1 YRNPluginVersionActivity.kt\ncom/xiaomi/fitness/about/version/VersionAdapter$ViewHolder\n*L\n158#1:181,2\n*E\n"})
    public static final class ViewHolder extends RecyclerView.d0 {
        private final boolean isDarkMode;

        @NotNull
        private final TextView tvApiLevel;

        @NotNull
        private final TextView tvMaketime;

        @NotNull
        private final TextView tvModule;

        @NotNull
        private final TextView tvModuleIdMapVersion;

        @NotNull
        private final TextView tvResidentMemory;

        @NotNull
        private final TextView tvUpdateStrategy;

        @NotNull
        private final TextView tvVersion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View view, boolean z) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.isDarkMode = z;
            View viewFindViewById = view.findViewById(uqi.R);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            TextView textView = (TextView) viewFindViewById;
            this.tvModule = textView;
            View viewFindViewById2 = view.findViewById(uqi.W);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            TextView textView2 = (TextView) viewFindViewById2;
            this.tvVersion = textView2;
            View viewFindViewById3 = view.findViewById(uqi.Q);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            TextView textView3 = (TextView) viewFindViewById3;
            this.tvMaketime = textView3;
            View viewFindViewById4 = view.findViewById(uqi.P);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            TextView textView4 = (TextView) viewFindViewById4;
            this.tvApiLevel = textView4;
            View viewFindViewById5 = view.findViewById(uqi.S);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            TextView textView5 = (TextView) viewFindViewById5;
            this.tvModuleIdMapVersion = textView5;
            View viewFindViewById6 = view.findViewById(uqi.V);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            TextView textView6 = (TextView) viewFindViewById6;
            this.tvUpdateStrategy = textView6;
            View viewFindViewById7 = view.findViewById(uqi.T);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            TextView textView7 = (TextView) viewFindViewById7;
            this.tvResidentMemory = textView7;
            this.itemView.setBackgroundColor(z ? -14540254 : -1);
            int i = z ? -1 : -16777216;
            Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new TextView[]{textView, textView2, textView3, textView4, textView5, textView6, textView7}).iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setTextColor(i);
            }
        }

        private final String getUpdateStrategyText(int strategy) {
            if (strategy == 1) {
                return "Default";
            }
            if (strategy != 2) {
                return strategy != 3 ? "unknown" : "immediately";
            }
            return "silence";
        }

        public final void bind(@NotNull BundleInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.tvModule.setText("Bundle：" + info.getModule());
            this.tvVersion.setText("Version：" + info.getVersion());
            this.tvMaketime.setText("Maketime：" + info.getMaketime());
            this.tvApiLevel.setText("MaxCommonApiLevel：" + info.getMaxCommonJSApiLevel());
            TextView textView = this.tvModuleIdMapVersion;
            String moduleIdMapVersion = info.getModuleIdMapVersion();
            if (moduleIdMapVersion == null) {
                moduleIdMapVersion = "unknown";
            }
            textView.setText("ModuleIdMapVersion：" + moduleIdMapVersion);
            this.tvUpdateStrategy.setText("UpdateStrategy：" + getUpdateStrategyText(info.getUpdateStrategy()));
            this.tvResidentMemory.setText("Memory mode：" + (info.getResidentMemory() ? "permanent" : "non-resident"));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    /* JADX INFO: renamed from: isDarkMode, reason: from getter */
    public final boolean getIsDarkMode() {
        return this.isDarkMode;
    }

    public final void setDarkMode(boolean z) {
        this.isDarkMode = z;
    }

    public final void submitList(@NotNull List<BundleInfo> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.items = newItems;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(yti.j, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ViewHolder(viewInflate, this.isDarkMode);
    }
}
