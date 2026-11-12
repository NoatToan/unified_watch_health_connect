package com.xiaomi.fitness.habit.ui;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.transform.RoundedCornersTransformation;
import com.example.habit.export.HabitBean;
import com.example.habit.export.Today;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.habit.bean.HabitTodayBean;
import com.xiaomi.fitness.habit.bean.HabitTodayResult;
import com.xiaomi.fitness.habit.ui.HabitTodayAdapter;
import defpackage.b0j;
import defpackage.dri;
import defpackage.hji;
import defpackage.hli;
import defpackage.iui;
import defpackage.nni;
import defpackage.nuf;
import defpackage.pxi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*)+,-./B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0014\u0010$\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0012¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/habit/bean/HabitTodayResult;", "habitTodayResult", "", "loadData", "(Lcom/xiaomi/fitness/habit/bean/HabitTodayResult;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayClickListener;", "habitTodayClickListener", "Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayClickListener;", "paddingHorizontalBetweenMedal", "I", "", "Lcom/xiaomi/fitness/habit/bean/HabitTodayBean;", "habitTodayBeans", "Ljava/util/List;", "getHabitTodayBeans", "()Ljava/util/List;", "getColCountPerRow", "colCountPerRow", "getBackgroundWidth", "backgroundWidth", "getBackgroundHeight", "backgroundHeight", "<init>", "(Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayClickListener;)V", "Companion", "HabitTodayClickListener", "HabitTodayRecommendViewHolder", "HabitTodayViewHolder", "HabitTodayTitleViewHolder", "HabitTodayEmptyViewHolder", "HabitEmptyForTodayViewHolder", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HabitTodayAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private final List<HabitTodayBean> habitTodayBeans;

    @NotNull
    private final HabitTodayClickListener habitTodayClickListener;
    private final int paddingHorizontalBetweenMedal;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int typeToday = 1;
    private static final int typeRecommend = 2;
    private static final int typeTitle = 3;
    private static final int typeEmpty = 4;
    private static final int typeEmptyForToday = 5;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$Companion;", "", "<init>", "()V", "typeToday", "", "getTypeToday", "()I", "typeRecommend", "getTypeRecommend", "typeTitle", "getTypeTitle", "typeEmpty", "getTypeEmpty", "typeEmptyForToday", "getTypeEmptyForToday", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTypeEmpty() {
            return HabitTodayAdapter.typeEmpty;
        }

        public final int getTypeEmptyForToday() {
            return HabitTodayAdapter.typeEmptyForToday;
        }

        public final int getTypeRecommend() {
            return HabitTodayAdapter.typeRecommend;
        }

        public final int getTypeTitle() {
            return HabitTodayAdapter.typeTitle;
        }

        public final int getTypeToday() {
            return HabitTodayAdapter.typeToday;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitEmptyForTodayViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter;Landroid/view/View;)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HabitEmptyForTodayViewHolder extends RecyclerView.d0 {
        final /* synthetic */ HabitTodayAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HabitEmptyForTodayViewHolder(@NotNull HabitTodayAdapter habitTodayAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = habitTodayAdapter;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayClickListener;", "", "punchClick", "", "today", "Lcom/example/habit/export/Today;", "recommendClick", "recommend", "Lcom/example/habit/export/HabitBean;", "goAddHabit", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface HabitTodayClickListener {
        void goAddHabit();

        void punchClick(@NotNull Today today);

        void recommendClick(@NotNull HabitBean recommend);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayEmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "addHabitView", "Landroid/widget/ImageView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter;Landroid/view/View;)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HabitTodayEmptyViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView addHabitView;
        final /* synthetic */ HabitTodayAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HabitTodayEmptyViewHolder(@NotNull final HabitTodayAdapter habitTodayAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = habitTodayAdapter;
            View viewFindViewById = view.findViewById(dri.c);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById;
            this.addHabitView = imageView;
            nuf.f(view);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: kjb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HabitTodayAdapter.HabitTodayEmptyViewHolder._init_$lambda$0(habitTodayAdapter, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(HabitTodayAdapter this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.habitTodayClickListener.goAddHabit();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayRecommendViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/example/habit/export/HabitBean;", "bean", "", "bindData", "(Lcom/example/habit/export/HabitBean;)V", "Landroid/widget/ImageView;", "backgroundView", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", HabitShareActivity.KEY_HABIT_NAME, "Landroid/widget/TextView;", "appBrefView", "totalInsistView", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter;Landroid/view/View;)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nHabitTodayAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitTodayAdapter.kt\ncom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayRecommendViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,256:1\n54#2,3:257\n24#2:260\n59#2,6:261\n*S KotlinDebug\n*F\n+ 1 HabitTodayAdapter.kt\ncom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayRecommendViewHolder\n*L\n127#1:257,3\n127#1:260\n127#1:261,6\n*E\n"})
    public final class HabitTodayRecommendViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView appBrefView;

        @NotNull
        private final ImageView backgroundView;

        @NotNull
        private final TextView habitName;
        final /* synthetic */ HabitTodayAdapter this$0;

        @NotNull
        private final TextView totalInsistView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HabitTodayRecommendViewHolder(@NotNull HabitTodayAdapter habitTodayAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = habitTodayAdapter;
            View viewFindViewById = view.findViewById(dri.e);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.backgroundView = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(dri.u);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.habitName = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(dri.s);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.appBrefView = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(dri.b0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.totalInsistView = (TextView) viewFindViewById4;
            nuf.f(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$2$lambda$1(HabitTodayAdapter this$0, HabitBean recommend, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(recommend, "$recommend");
            this$0.habitTodayClickListener.recommendClick(recommend);
        }

        public final void bindData(@Nullable final HabitBean bean) {
            if (bean != null) {
                final HabitTodayAdapter habitTodayAdapter = this.this$0;
                this.habitName.setText(bean.name);
                this.appBrefView.setText(bean.appBref);
                ImageView imageView = this.backgroundView;
                String str = bean.middleIcon;
                ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(str).target(imageView);
                builderTarget.transformations(new RoundedCornersTransformation(DisplayUtil.dip2px(15.0f)));
                imageLoader.enqueue(builderTarget.build());
                TextView textView = this.totalInsistView;
                Resources resources = this.itemView.getResources();
                int i = pxi.f30880b;
                int i2 = bean.totalInsist;
                textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: ljb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HabitTodayAdapter.HabitTodayRecommendViewHolder.bindData$lambda$2$lambda$1(habitTodayAdapter, bean, view);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter;Landroid/view/View;)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HabitTodayTitleViewHolder extends RecyclerView.d0 {
        final /* synthetic */ HabitTodayAdapter this$0;

        @NotNull
        private final TextView titleView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HabitTodayTitleViewHolder(@NotNull HabitTodayAdapter habitTodayAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = habitTodayAdapter;
            View viewFindViewById = view.findViewById(dri.Y);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            TextView textView = (TextView) viewFindViewById;
            this.titleView = textView;
            textView.setText(view.getResources().getString(b0j.M));
        }

        @NotNull
        public final TextView getTitleView() {
            return this.titleView;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/example/habit/export/Today;", "todayBean", "", "bindData", "(Lcom/example/habit/export/Today;)V", "Landroid/widget/ImageView;", "backgroundView", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "habitNameView", "Landroid/widget/TextView;", "habitTimeView", "punchBtn", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/habit/ui/HabitTodayAdapter;Landroid/view/View;)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nHabitTodayAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitTodayAdapter.kt\ncom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,256:1\n54#2,3:257\n24#2:260\n59#2,4:261\n63#2,2:276\n489#3,11:265\n*S KotlinDebug\n*F\n+ 1 HabitTodayAdapter.kt\ncom/xiaomi/fitness/habit/ui/HabitTodayAdapter$HabitTodayViewHolder\n*L\n154#1:257,3\n154#1:260\n154#1:261,4\n154#1:276,2\n157#1:265,11\n*E\n"})
    public final class HabitTodayViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView backgroundView;

        @NotNull
        private final TextView habitNameView;

        @NotNull
        private final TextView habitTimeView;

        @NotNull
        private final TextView punchBtn;
        final /* synthetic */ HabitTodayAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HabitTodayViewHolder(@NotNull HabitTodayAdapter habitTodayAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = habitTodayAdapter;
            View viewFindViewById = view.findViewById(dri.e);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.backgroundView = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(dri.u);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.habitNameView = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(dri.v);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.habitTimeView = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(dri.z);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.punchBtn = (TextView) viewFindViewById4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$3$lambda$2(HabitTodayAdapter this$0, Today today, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(today, "$today");
            this$0.habitTodayClickListener.punchClick(today);
        }

        public final void bindData(@Nullable final Today todayBean) {
            String strValueOf;
            String strValueOf2;
            if (todayBean != null) {
                final HabitTodayAdapter habitTodayAdapter = this.this$0;
                this.habitNameView.setText(todayBean.getName());
                int hour = todayBean.getPunchTime().getHour();
                int minute = todayBean.getPunchTime().getMinute();
                if (hour < 10) {
                    strValueOf = "0" + hour;
                } else {
                    strValueOf = String.valueOf(hour);
                }
                if (minute < 10) {
                    strValueOf2 = "0" + minute;
                } else {
                    strValueOf2 = String.valueOf(minute);
                }
                this.habitTimeView.setText(strValueOf + ":" + strValueOf2);
                ImageView imageView = this.backgroundView;
                String middleIcon = todayBean.getMiddleIcon();
                ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(middleIcon).target(imageView);
                builderTarget.transformations(new RoundedCornersTransformation(DisplayUtil.dip2px(15.0f)));
                builderTarget.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.habit.ui.HabitTodayAdapter$HabitTodayViewHolder$bindData$lambda$3$lambda$1$$inlined$listener$default$1
                    @Override // coil.request.ImageRequest.Listener
                    public void onCancel(@NotNull ImageRequest request) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onStart(@NotNull ImageRequest request) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
                        this.this$0.backgroundView.setBackground(null);
                    }
                });
                imageLoader.enqueue(builderTarget.build());
                int status = todayBean.getStatus();
                if (status == 0) {
                    this.punchBtn.setText(this.itemView.getResources().getString(b0j.B));
                    this.punchBtn.setTextColor(this.itemView.getResources().getColor(hji.f));
                    this.punchBtn.setBackgroundResource(nni.f28092k);
                    this.punchBtn.setOnClickListener(new View.OnClickListener() { // from class: mjb
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            HabitTodayAdapter.HabitTodayViewHolder.bindData$lambda$3$lambda$2(habitTodayAdapter, todayBean, view);
                        }
                    });
                    return;
                }
                if (status == 1) {
                    this.punchBtn.setText(this.itemView.getResources().getString(b0j.A));
                    this.punchBtn.setTextColor(this.itemView.getResources().getColor(hji.f));
                    this.punchBtn.setBackgroundResource(nni.j);
                    this.punchBtn.setOnClickListener(null);
                    return;
                }
                if (status != 2) {
                    return;
                }
                this.punchBtn.setText(this.itemView.getResources().getString(b0j.C));
                this.punchBtn.setTextColor(this.itemView.getResources().getColor(hji.f));
                this.punchBtn.setBackgroundResource(nni.j);
                this.punchBtn.setOnClickListener(null);
            }
        }
    }

    public HabitTodayAdapter(@NotNull HabitTodayClickListener habitTodayClickListener) {
        Intrinsics.checkNotNullParameter(habitTodayClickListener, "habitTodayClickListener");
        this.habitTodayClickListener = habitTodayClickListener;
        this.paddingHorizontalBetweenMedal = ExtUtilsKt.getDimension(hli.f20215a);
        this.habitTodayBeans = new ArrayList();
    }

    private final int getBackgroundHeight() {
        return (int) (getBackgroundWidth() * 0.46f);
    }

    private final int getBackgroundWidth() {
        return ((UIUtils.INSTANCE.getScreenWidth(ApplicationExtKt.getApplication()) - (this.paddingHorizontalBetweenMedal * getColCountPerRow())) - (ExtUtilsKt.getDimension(hli.c) * 2)) / getColCountPerRow();
    }

    private final int getColCountPerRow() {
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            return 3;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (!uIUtils.isTablet()) {
            return 1;
        }
        Application application = ApplicationExtKt.getApplication();
        return (application == null || !uIUtils.isLandscape(application)) ? 2 : 3;
    }

    @NotNull
    public final List<HabitTodayBean> getHabitTodayBeans() {
        return this.habitTodayBeans;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.habitTodayBeans.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.habitTodayBeans.get(position).getViewType();
    }

    public final void loadData(@NotNull HabitTodayResult habitTodayResult) {
        Intrinsics.checkNotNullParameter(habitTodayResult, "habitTodayResult");
        this.habitTodayBeans.clear();
        Iterator<Today> it = habitTodayResult.getToday().iterator();
        while (it.hasNext()) {
            this.habitTodayBeans.add(new HabitTodayBean(typeToday, it.next(), null));
        }
        if (habitTodayResult.getToday().isEmpty()) {
            if (habitTodayResult.getUserAllHabit() > 0) {
                this.habitTodayBeans.add(new HabitTodayBean(typeEmptyForToday, null, null));
            } else {
                this.habitTodayBeans.add(new HabitTodayBean(typeEmpty, null, null));
            }
        }
        if (!habitTodayResult.getRecommend().isEmpty()) {
            this.habitTodayBeans.add(new HabitTodayBean(typeTitle, null, null));
            Iterator<HabitBean> it2 = habitTodayResult.getRecommend().iterator();
            while (it2.hasNext()) {
                this.habitTodayBeans.add(new HabitTodayBean(typeRecommend, null, it2.next()));
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof HabitTodayViewHolder) {
            ((HabitTodayViewHolder) holder).bindData(this.habitTodayBeans.get(position).getToday());
        } else if (holder instanceof HabitTodayRecommendViewHolder) {
            ((HabitTodayRecommendViewHolder) holder).bindData(this.habitTodayBeans.get(position).getRecommend());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == typeToday) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(iui.f22106r, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new HabitTodayViewHolder(this, viewInflate);
        }
        if (viewType == typeRecommend) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(iui.s, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new HabitTodayRecommendViewHolder(this, viewInflate2);
        }
        if (viewType == typeEmpty) {
            View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(iui.q, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            return new HabitTodayEmptyViewHolder(this, viewInflate3);
        }
        if (viewType == typeEmptyForToday) {
            View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(iui.f, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate4, "inflate(...)");
            return new HabitEmptyForTodayViewHolder(this, viewInflate4);
        }
        View viewInflate5 = LayoutInflater.from(parent.getContext()).inflate(iui.t, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate5, "inflate(...)");
        return new HabitTodayTitleViewHolder(this, viewInflate5);
    }
}
