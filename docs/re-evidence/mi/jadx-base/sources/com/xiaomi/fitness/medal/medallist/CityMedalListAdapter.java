package com.xiaomi.fitness.medal.medallist;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailActivity;
import com.xiaomi.fitness.medal.medallist.CityMedalListAdapter;
import defpackage.ecf;
import defpackage.iri;
import defpackage.mli;
import defpackage.nuf;
import defpackage.pui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\f\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u001e\u0010\bJ\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/CityMedalListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lecf$a$a;", "newData", "", "updateFreshDate", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "", "data", "Ljava/util/List;", "getData", "()Ljava/util/List;", "paddingHorizontalBetweenMedal", "I", "getColCountPerRow", "colCountPerRow", "<init>", "Companion", "CityMedalViewHolder", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCityMedalListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CityMedalListAdapter.kt\ncom/xiaomi/fitness/medal/medallist/CityMedalListAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,97:1\n54#2,3:98\n24#2:101\n59#2,6:102\n*S KotlinDebug\n*F\n+ 1 CityMedalListAdapter.kt\ncom/xiaomi/fitness/medal/medallist/CityMedalListAdapter\n*L\n68#1:98,3\n68#1:101\n68#1:102,6\n*E\n"})
public final class CityMedalListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "CityMedalListAdapter";

    @NotNull
    private final List<ecf.a.C0923a> data;
    private final int paddingHorizontalBetweenMedal;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/CityMedalListAdapter$CityMedalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "description", "getDescription", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/medal/medallist/CityMedalListAdapter;Landroid/view/View;)V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class CityMedalViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView description;

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;
        final /* synthetic */ CityMedalListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CityMedalViewHolder(@NotNull CityMedalListAdapter cityMedalListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = cityMedalListAdapter;
            View viewFindViewById = view.findViewById(iri.I);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(iri.K);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.name = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(iri.F);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.description = (TextView) viewFindViewById3;
        }

        @NotNull
        public final TextView getDescription() {
            return this.description;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }
    }

    public CityMedalListAdapter(@NotNull List<ecf.a.C0923a> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.paddingHorizontalBetweenMedal = ExtUtilsKt.getDimension(mli.f26982a);
    }

    private final int getColCountPerRow() {
        Application application;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            return 4;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        return (uIUtils.isTablet() && (application = ApplicationExtKt.getApplication()) != null && uIUtils.isLandscape(application)) ? 5 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(ecf.a.C0923a medalData, Context context, View view) {
        Intrinsics.checkNotNullParameter(medalData, "$medalData");
        Intent intent = new Intent();
        intent.putExtra("key_params_medal_id", medalData.o.longValue());
        intent.putExtra("key_params_medal_type", medalData.m);
        intent.putExtra("key_from_medal_home", true);
        Logger.d(TAG, "id=" + medalData.o + " medalType=" + medalData.m);
        intent.setClass(context, MedalDetailActivity.class);
        context.startActivity(intent);
    }

    @NotNull
    public final List<ecf.a.C0923a> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int iCoerceIn = RangesKt___RangesKt.coerceIn(((UIUtils.INSTANCE.getScreenWidth(ApplicationExtKt.getApplication()) - (this.paddingHorizontalBetweenMedal * (getColCountPerRow() - 1))) - (ExtUtilsKt.getDimension(mli.c) * 2)) / getColCountPerRow(), 0, ExtUtilsKt.getDp(Float.valueOf(100.0f)));
        Logger.i(TAG, "onBindViewHolder = " + iCoerceIn + ",colCountPerRow = " + getColCountPerRow());
        final ecf.a.C0923a c0923a = this.data.get(position);
        if (holder instanceof CityMedalViewHolder) {
            CityMedalViewHolder cityMedalViewHolder = (CityMedalViewHolder) holder;
            cityMedalViewHolder.getIcon().getLayoutParams().width = iCoerceIn;
            ViewGroup.LayoutParams layoutParams = cityMedalViewHolder.getIcon().getLayoutParams();
            float f = iCoerceIn;
            MedalManager.Companion companion = MedalManager.INSTANCE;
            layoutParams.height = (int) (MedalManagerExtKt.getInstance(companion).getMedalListImgRatio(c0923a.f16490b) * f);
            ImageView icon = cityMedalViewHolder.getIcon();
            String str = c0923a.c;
            ImageLoader imageLoader = Coil.imageLoader(icon.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(icon.getContext()).data(str).target(icon);
            builderTarget.size(iCoerceIn, (int) (f * MedalManagerExtKt.getInstance(companion).getMedalListImgRatio(c0923a.f16490b)));
            imageLoader.enqueue(builderTarget.build());
            cityMedalViewHolder.getName().setText(c0923a.f16492r);
            cityMedalViewHolder.getDescription().setText(MedalManagerExtKt.getInstance(companion).getMedalSubtitle(c0923a));
            final Context context = holder.itemView.getContext();
            nuf.f(holder.itemView);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: wx3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CityMedalListAdapter.onBindViewHolder$lambda$1(c0923a, context, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(pui.i, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new CityMedalViewHolder(this, viewInflate);
    }

    public final void updateFreshDate(@NotNull List<? extends ecf.a.C0923a> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.data.clear();
        this.data.addAll(newData);
        notifyDataSetChanged();
    }
}
