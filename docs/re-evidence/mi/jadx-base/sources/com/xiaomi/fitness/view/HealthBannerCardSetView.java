package com.xiaomi.fitness.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.baseui.recyclerview.decoration.GridItemSpace;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.pinganhealth.DepartmentType;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import defpackage.eri;
import defpackage.gob;
import defpackage.jui;
import defpackage.nuf;
import defpackage.sk5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u001d\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView$CardDataModel;", "dataModelList", "", "showCard", "(Ljava/util/List;)V", "Lgob;", "dataBinding", "Lgob;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "CardDataModel", "HealthBannerCardAdapter", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HealthBannerCardSetView extends ConstraintLayout {

    @NotNull
    private gob dataBinding;

    @Nullable
    private RecyclerView recyclerView;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/view/HealthBannerCardSetView$CardDataModel;", "", "title", "", Column.SUBTITLE, "picture", "depType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPicture", "()Ljava/lang/Object;", "getDepType", "()I", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardDataModel {
        private final int depType;

        @NotNull
        private final Object picture;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;

        public CardDataModel(@NotNull String title, @NotNull String subtitle, @NotNull Object picture, @DepartmentType int i) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(picture, "picture");
            this.title = title;
            this.subtitle = subtitle;
            this.picture = picture;
            this.depType = i;
        }

        public final int getDepType() {
            return this.depType;
        }

        @NotNull
        public final Object getPicture() {
            return this.picture;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/view/HealthBannerCardSetView$HealthBannerCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView$CardDataModel;", "dataModelList", "", "bindData", "(Ljava/util/List;)V", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Ljava/util/List;", "", "mDataModelList", "<init>", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView;Ljava/util/List;)V", "ItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HealthBannerCardAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

        @NotNull
        private final List<CardDataModel> dataModelList;

        @NotNull
        private final List<CardDataModel> mDataModelList;
        final /* synthetic */ HealthBannerCardSetView this$0;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/view/HealthBannerCardSetView$HealthBannerCardAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView$CardDataModel;", "dataModel", "", "bindData", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView$CardDataModel;)V", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "subtitleTv", "Landroid/widget/ImageView;", "picture", "Landroid/widget/ImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView$HealthBannerCardAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        @SourceDebugExtension({"SMAP\nHealthBannerCardSetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthBannerCardSetView.kt\ncom/xiaomi/fitness/view/HealthBannerCardSetView$HealthBannerCardAdapter$ItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,118:1\n54#2,3:119\n24#2:122\n57#2,6:123\n63#2,2:130\n57#3:129\n*S KotlinDebug\n*F\n+ 1 HealthBannerCardSetView.kt\ncom/xiaomi/fitness/view/HealthBannerCardSetView$HealthBannerCardAdapter$ItemViewHolder\n*L\n100#1:119,3\n100#1:122\n100#1:123,6\n100#1:130,2\n100#1:129\n*E\n"})
        public final class ItemViewHolder extends RecyclerView.d0 {

            @NotNull
            private final ImageView picture;

            @NotNull
            private final TextView subtitleTv;
            final /* synthetic */ HealthBannerCardAdapter this$0;

            @NotNull
            private final TextView titleTv;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemViewHolder(@NotNull HealthBannerCardAdapter healthBannerCardAdapter, View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.this$0 = healthBannerCardAdapter;
                View viewFindViewById = itemView.findViewById(eri.cj);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.titleTv = (TextView) viewFindViewById;
                View viewFindViewById2 = itemView.findViewById(eri.xh);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.subtitleTv = (TextView) viewFindViewById2;
                View viewFindViewById3 = itemView.findViewById(eri.Lc);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                this.picture = (ImageView) viewFindViewById3;
                nuf.f(itemView);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit bindData$lambda$0(ItemViewHolder this$0, CardDataModel dataModel, View it) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(dataModel, "$dataModel");
                Intrinsics.checkNotNullParameter(it, "it");
                IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
                Context context = this$0.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                healthPageExtKt.goToHealthVisitDoctorPage(context, dataModel.getDepType());
                return Unit.INSTANCE;
            }

            public final void bindData(@NotNull final CardDataModel dataModel) {
                Intrinsics.checkNotNullParameter(dataModel, "dataModel");
                ViewExtKt.clickWithTrigger$default(this.itemView, 0L, new Function1() { // from class: iob
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return HealthBannerCardSetView.HealthBannerCardAdapter.ItemViewHolder.bindData$lambda$0(this.f21941a, dataModel, (View) obj);
                    }
                }, 1, null);
                this.titleTv.setText(dataModel.getTitle());
                this.subtitleTv.setText(dataModel.getSubtitle());
                ImageView imageView = this.picture;
                Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(dataModel.getPicture()).target(imageView).build());
            }
        }

        public HealthBannerCardAdapter(@NotNull HealthBannerCardSetView healthBannerCardSetView, List<CardDataModel> dataModelList) {
            Intrinsics.checkNotNullParameter(dataModelList, "dataModelList");
            this.this$0 = healthBannerCardSetView;
            this.dataModelList = dataModelList;
            this.mDataModelList = new ArrayList();
        }

        public final void bindData(@NotNull List<CardDataModel> dataModelList) {
            Intrinsics.checkNotNullParameter(dataModelList, "dataModelList");
            this.mDataModelList.clear();
            this.mDataModelList.addAll(dataModelList);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mDataModelList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (holder instanceof ItemViewHolder) {
                ((ItemViewHolder) holder).bindData(this.mDataModelList.get(position));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (this.dataModelList.size() == 2) {
                View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.G2, (ViewGroup) null);
                Intrinsics.checkNotNull(viewInflate);
                return new ItemViewHolder(this, viewInflate);
            }
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(jui.H2, (ViewGroup) null);
            Intrinsics.checkNotNull(viewInflate2);
            return new ItemViewHolder(this, viewInflate2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public HealthBannerCardSetView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void showCard(@NotNull List<CardDataModel> dataModelList) {
        Intrinsics.checkNotNullParameter(dataModelList, "dataModelList");
        HealthBannerCardAdapter healthBannerCardAdapter = new HealthBannerCardAdapter(this, dataModelList);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(healthBannerCardAdapter);
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new GridItemSpace(ExtUtilsKt.getDp(10), ExtUtilsKt.getDp(12), false));
        }
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new GridLayoutManager(recyclerView3 != null ? recyclerView3.getContext() : null, dataModelList.size(), 1, false));
        }
        healthBannerCardAdapter.bindData(dataModelList);
    }

    public /* synthetic */ HealthBannerCardSetView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HealthBannerCardSetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        gob gobVar = (gob) sk5.j(ExtUtilsKt.getInflater(context), jui.I2, this, true);
        this.dataBinding = gobVar;
        this.recyclerView = gobVar.A;
    }
}
