package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepDistributeAdapter;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference;
import com.xiaomi.fitness.health.sleep.utils.SleepStageExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.health.sleep.view.widget.DonutChartView;
import com.xiaomi.fitness.health.sleep.view.widget.DonutPieceModel;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.HealthDistributeSegmentView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.view.DurationTextView;
import defpackage.c0j;
import defpackage.c72;
import defpackage.eri;
import defpackage.jui;
import defpackage.n9f;
import defpackage.pni;
import defpackage.qxi;
import defpackage.uz6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 82\u00020\u0001:\u000589:;<B\u001d\u0012\u0006\u00104\u001a\u00020\u0019\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c¢\u0006\u0004\b6\u00107J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0018R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R/\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020$0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter;", "Lc72;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$d0;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "getContentItemCount", "", "Luz6;", "getDataList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$OnTitleItemClickListener;", "onTitleItemClickListener", "setOnTitleItemClickListener", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$OnTitleItemClickListener;)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "mDataList", "Ljava/util/List;", "titleItemClickListener", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$OnTitleItemClickListener;", "getTitleItemClickListener", "()Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$OnTitleItemClickListener;", "setTitleItemClickListener", "", "coverViewStatus", "Z", "getCoverViewStatus", "()Z", "setCoverViewStatus", "(Z)V", "hasRemData", "getHasRemData", "setHasRemData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "model", "showInStageChartPredicate", "Lkotlin/jvm/functions/Function1;", "context", "dataList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Companion", "HeaderViewHolder", "ContentViewHolder", "SleepStageSectionViewHolder", "OnTitleItemClickListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepDistributeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDistributeAdapter.kt\ncom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,342:1\n774#2:343\n865#2,2:344\n1053#2:346\n*S KotlinDebug\n*F\n+ 1 SleepDistributeAdapter.kt\ncom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter\n*L\n87#1:343\n87#1:344,2\n88#1:346\n*E\n"})
public final class SleepDistributeAdapter extends c72 {
    public static final int titleShowCoverView = 2;
    public static final int titleUnderstandView = 1;
    private boolean coverViewStatus;
    private boolean hasRemData;

    @NotNull
    private final Context mContext;

    @NotNull
    private final List<uz6> mDataList;

    @NotNull
    private final Function1<uz6, Boolean> showInStageChartPredicate;

    @Nullable
    private OnTitleItemClickListener titleItemClickListener;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010J\u001a\u00020=¢\u0006\u0004\bK\u0010CJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0010\u001a\u0004\b2\u0010\u0012\"\u0004\b3\u0010\u0014R\"\u00104\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0010\u001a\u0004\b5\u0010\u0012\"\u0004\b6\u0010\u0014R\"\u00107\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0010\u001a\u0004\b8\u0010\u0012\"\u0004\b9\u0010\u0014R\"\u0010:\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0010\u001a\u0004\b;\u0010\u0012\"\u0004\b<\u0010\u0014R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010?\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\"\u0010G\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0010\u001a\u0004\bH\u0010\u0012\"\u0004\bI\u0010\u0014¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$ContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "coverViewStatus", "", "startAnimation", "(Z)V", "Landroid/content/Context;", "context", "Luz6;", "model", "hasRemData", "bindData", "(Landroid/content/Context;Luz6;ZZ)V", "Landroid/widget/TextView;", "valueTxtView", "Landroid/widget/TextView;", "getValueTxtView", "()Landroid/widget/TextView;", "setValueTxtView", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "durationTextView", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "getDurationTextView", "()Lcom/xiaomi/fitness/widget/view/DurationTextView;", "setDurationTextView", "(Lcom/xiaomi/fitness/widget/view/DurationTextView;)V", "Lcom/xiaomi/fitness/view/HealthDistributeSegmentView;", "sleepSegmentView", "Lcom/xiaomi/fitness/view/HealthDistributeSegmentView;", "getSleepSegmentView", "()Lcom/xiaomi/fitness/view/HealthDistributeSegmentView;", "setSleepSegmentView", "(Lcom/xiaomi/fitness/view/HealthDistributeSegmentView;)V", "Landroid/widget/LinearLayout;", "sleepCoverView", "Landroid/widget/LinearLayout;", "getSleepCoverView", "()Landroid/widget/LinearLayout;", "setSleepCoverView", "(Landroid/widget/LinearLayout;)V", "Landroid/widget/ImageView;", "sleepCoverImageView", "Landroid/widget/ImageView;", "getSleepCoverImageView", "()Landroid/widget/ImageView;", "setSleepCoverImageView", "(Landroid/widget/ImageView;)V", "wakeValueTxtView", "getWakeValueTxtView", "setWakeValueTxtView", "wakeValueUnitView", "getWakeValueUnitView", "setWakeValueUnitView", "sleepCoverTxtView", "getSleepCoverTxtView", "setSleepCoverTxtView", "abnormalTxtView", "getAbnormalTxtView", "setAbnormalTxtView", "Landroid/view/View;", "sleepCoverViewLeft", "Landroid/view/View;", "getSleepCoverViewLeft", "()Landroid/view/View;", "setSleepCoverViewLeft", "(Landroid/view/View;)V", "sleepCoverViewRight", "getSleepCoverViewRight", "setSleepCoverViewRight", "sleepTextPercentValue", "getSleepTextPercentValue", "setSleepTextPercentValue", "itemView", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ContentViewHolder extends RecyclerView.d0 {

        @NotNull
        private TextView abnormalTxtView;

        @NotNull
        private DurationTextView durationTextView;

        @NotNull
        private ImageView sleepCoverImageView;

        @NotNull
        private TextView sleepCoverTxtView;

        @NotNull
        private LinearLayout sleepCoverView;

        @NotNull
        private View sleepCoverViewLeft;

        @NotNull
        private View sleepCoverViewRight;

        @NotNull
        private HealthDistributeSegmentView sleepSegmentView;

        @NotNull
        private TextView sleepTextPercentValue;

        @NotNull
        private TextView valueTxtView;

        @NotNull
        private TextView wakeValueTxtView;

        @NotNull
        private TextView wakeValueUnitView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.valueTxtView = (TextView) itemView.findViewById(eri.ho);
            this.durationTextView = (DurationTextView) itemView.findViewById(eri.p4);
            this.sleepSegmentView = (HealthDistributeSegmentView) itemView.findViewById(eri.vf);
            this.sleepCoverView = (LinearLayout) itemView.findViewById(eri.Af);
            this.wakeValueTxtView = (TextView) itemView.findViewById(eri.f16995io);
            this.wakeValueUnitView = (TextView) itemView.findViewById(eri.go);
            this.sleepCoverImageView = (ImageView) itemView.findViewById(eri.yf);
            this.sleepCoverTxtView = (TextView) itemView.findViewById(eri.zf);
            this.abnormalTxtView = (TextView) itemView.findViewById(eri.Uj);
            this.sleepCoverViewLeft = itemView.findViewById(eri.Bf);
            this.sleepCoverViewRight = itemView.findViewById(eri.Cf);
            this.sleepTextPercentValue = (TextView) itemView.findViewById(eri.Rn);
        }

        private final void startAnimation(boolean coverViewStatus) {
            ObjectAnimator objectAnimatorOfFloat;
            ObjectAnimator objectAnimatorOfFloat2;
            if (coverViewStatus) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.sleepCoverView, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.sleepCoverView, (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
            }
            if (coverViewStatus) {
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.sleepCoverView, (Property<LinearLayout, Float>) View.SCALE_X, 0.5f, 1.0f);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(...)");
            } else {
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.sleepCoverView, (Property<LinearLayout, Float>) View.SCALE_X, 0.5f, 0.0f);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(...)");
            }
            objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tlm
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SleepDistributeAdapter.ContentViewHolder.startAnimation$lambda$0(this.f34835a, valueAnimator);
                }
            });
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat2.setDuration(300L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startAnimation$lambda$0(ContentViewHolder this$0, ValueAnimator it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.sleepCoverView.invalidate();
        }

        public final void bindData(@Nullable Context context, @NotNull uz6 model, boolean coverViewStatus, boolean hasRemData) {
            Intrinsics.checkNotNullParameter(model, "model");
            if (model.j) {
                this.durationTextView.setVisibility(0);
                this.durationTextView.setDuration(model.f36300k);
                this.valueTxtView.setText(model.g);
            } else {
                this.durationTextView.setVisibility(8);
                this.valueTxtView.setText(model.g);
                this.wakeValueTxtView.setText(model.h);
                this.wakeValueUnitView.setText(model.i);
            }
            this.sleepSegmentView.d(model, this.sleepCoverView, this.sleepCoverImageView, Boolean.valueOf(coverViewStatus), Boolean.valueOf(hasRemData));
            String string = AppUtil.getApp().getString(c0j.xf, Integer.valueOf(model.f39601a));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            if (model.e() == 0) {
                Resources resources = AppUtil.getApp().getResources();
                int i = qxi.v0;
                int i2 = model.f39601a;
                string = resources.getQuantityString(i, i2, Integer.valueOf(i2));
            }
            this.sleepTextPercentValue.setText(string);
            this.sleepCoverViewLeft.setBackground(SleepStageExtKt.getItemDrawableByType(model.e()));
            this.sleepCoverViewRight.setBackground(SleepStageExtKt.getItemDrawableByType(model.e()));
            n9f normaValueByType = SleepStageExtKt.getNormaValueByType(model.e(), hasRemData);
            String string2 = ResourceExtKt.getString(c0j.wf, Integer.valueOf((int) normaValueByType.f27682b), Integer.valueOf((int) normaValueByType.f27681a));
            if (model.e() == 0) {
                string2 = ResourceExtKt.getString(c0j.yf);
            }
            ViewExtKt.setVisible(this.abnormalTxtView, coverViewStatus);
            if (normaValueByType.f27681a == 0.0f) {
                this.sleepCoverView.setVisibility(8);
                ViewExtKt.setVisible(this.abnormalTxtView, false);
            }
            this.sleepCoverTxtView.setText(string2);
            int i3 = model.f39601a;
            if (i3 > normaValueByType.f27681a) {
                this.abnormalTxtView.setText(AppUtil.getApp().getString(c0j.Eh));
            } else if (i3 < normaValueByType.f27682b) {
                this.abnormalTxtView.setText(AppUtil.getApp().getString(c0j.Nh));
            } else {
                ViewExtKt.setVisible(this.abnormalTxtView, false);
            }
        }

        @NotNull
        public final TextView getAbnormalTxtView() {
            return this.abnormalTxtView;
        }

        @NotNull
        public final DurationTextView getDurationTextView() {
            return this.durationTextView;
        }

        @NotNull
        public final ImageView getSleepCoverImageView() {
            return this.sleepCoverImageView;
        }

        @NotNull
        public final TextView getSleepCoverTxtView() {
            return this.sleepCoverTxtView;
        }

        @NotNull
        public final LinearLayout getSleepCoverView() {
            return this.sleepCoverView;
        }

        @NotNull
        public final View getSleepCoverViewLeft() {
            return this.sleepCoverViewLeft;
        }

        @NotNull
        public final View getSleepCoverViewRight() {
            return this.sleepCoverViewRight;
        }

        @NotNull
        public final HealthDistributeSegmentView getSleepSegmentView() {
            return this.sleepSegmentView;
        }

        @NotNull
        public final TextView getSleepTextPercentValue() {
            return this.sleepTextPercentValue;
        }

        @NotNull
        public final TextView getValueTxtView() {
            return this.valueTxtView;
        }

        @NotNull
        public final TextView getWakeValueTxtView() {
            return this.wakeValueTxtView;
        }

        @NotNull
        public final TextView getWakeValueUnitView() {
            return this.wakeValueUnitView;
        }

        public final void setAbnormalTxtView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.abnormalTxtView = textView;
        }

        public final void setDurationTextView(@NotNull DurationTextView durationTextView) {
            Intrinsics.checkNotNullParameter(durationTextView, "<set-?>");
            this.durationTextView = durationTextView;
        }

        public final void setSleepCoverImageView(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.sleepCoverImageView = imageView;
        }

        public final void setSleepCoverTxtView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.sleepCoverTxtView = textView;
        }

        public final void setSleepCoverView(@NotNull LinearLayout linearLayout) {
            Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
            this.sleepCoverView = linearLayout;
        }

        public final void setSleepCoverViewLeft(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.sleepCoverViewLeft = view;
        }

        public final void setSleepCoverViewRight(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.sleepCoverViewRight = view;
        }

        public final void setSleepSegmentView(@NotNull HealthDistributeSegmentView healthDistributeSegmentView) {
            Intrinsics.checkNotNullParameter(healthDistributeSegmentView, "<set-?>");
            this.sleepSegmentView = healthDistributeSegmentView;
        }

        public final void setSleepTextPercentValue(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.sleepTextPercentValue = textView;
        }

        public final void setValueTxtView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.valueTxtView = textView;
        }

        public final void setWakeValueTxtView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.wakeValueTxtView = textView;
        }

        public final void setWakeValueUnitView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.wakeValueUnitView = textView;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u0016J\u001f\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$OnTitleItemClickListener;", "titleItemClickListener", "", "coverViewStatus", "", "bindData", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$OnTitleItemClickListener;Z)V", "Landroid/widget/ImageView;", "headerImageView", "Landroid/widget/ImageView;", "getHeaderImageView", "()Landroid/widget/ImageView;", "setHeaderImageView", "(Landroid/widget/ImageView;)V", "Landroid/view/View;", "dividerLine", "Landroid/view/View;", "getDividerLine", "()Landroid/view/View;", "setDividerLine", "(Landroid/view/View;)V", "headerUnderstandView", "getHeaderUnderstandView", "setHeaderUnderstandView", "Landroid/widget/LinearLayout;", "headerLinearLayout", "Landroid/widget/LinearLayout;", "getHeaderLinearLayout", "()Landroid/widget/LinearLayout;", "setHeaderLinearLayout", "(Landroid/widget/LinearLayout;)V", "itemView", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class HeaderViewHolder extends RecyclerView.d0 {

        @NotNull
        private View dividerLine;

        @NotNull
        private ImageView headerImageView;

        @NotNull
        private LinearLayout headerLinearLayout;

        @NotNull
        private ImageView headerUnderstandView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.headerImageView = (ImageView) itemView.findViewById(eri.F7);
            this.dividerLine = itemView.findViewById(eri.X3);
            this.headerUnderstandView = (ImageView) itemView.findViewById(eri.C7);
            this.headerLinearLayout = (LinearLayout) itemView.findViewById(eri.E7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(OnTitleItemClickListener onTitleItemClickListener, boolean z, View view) {
            if (onTitleItemClickListener != null) {
                onTitleItemClickListener.onClick(2);
            }
            SleepTracePermissionGuidePreference.INSTANCE.setSLEEP_DISTRIBUTE_SHOW_ENABLE(!z);
            SleepTrackHelper.INSTANCE.trackSleepDayItemClick(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$1(HeaderViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandSleepUrlWithStruct(), this$0.itemView.getContext().getString(c0j.Ck), false, false, null, false, null, false, 252, null);
        }

        public final void bindData(@Nullable final OnTitleItemClickListener titleItemClickListener, final boolean coverViewStatus) {
            if (coverViewStatus) {
                this.headerImageView.setBackground(AppUtil.getApp().getDrawable(pni.h0));
            } else {
                this.headerImageView.setBackground(AppUtil.getApp().getDrawable(pni.g0));
            }
            this.headerLinearLayout.setOnClickListener(new View.OnClickListener() { // from class: ulm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepDistributeAdapter.HeaderViewHolder.bindData$lambda$0(titleItemClickListener, coverViewStatus, view);
                }
            });
            this.headerUnderstandView.setOnClickListener(new View.OnClickListener() { // from class: vlm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepDistributeAdapter.HeaderViewHolder.bindData$lambda$1(this.f37009a, view);
                }
            });
            SleepTrackHelper.INSTANCE.trackShowReasonableRange(coverViewStatus);
        }

        @NotNull
        public final View getDividerLine() {
            return this.dividerLine;
        }

        @NotNull
        public final ImageView getHeaderImageView() {
            return this.headerImageView;
        }

        @NotNull
        public final LinearLayout getHeaderLinearLayout() {
            return this.headerLinearLayout;
        }

        @NotNull
        public final ImageView getHeaderUnderstandView() {
            return this.headerUnderstandView;
        }

        public final void setDividerLine(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.dividerLine = view;
        }

        public final void setHeaderImageView(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.headerImageView = imageView;
        }

        public final void setHeaderLinearLayout(@NotNull LinearLayout linearLayout) {
            Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
            this.headerLinearLayout = linearLayout;
        }

        public final void setHeaderUnderstandView(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.headerUnderstandView = imageView;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$OnTitleItemClickListener;", "", "onClick", "", "position", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnTitleItemClickListener {
        void onClick(int position);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$SleepStageSectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Luz6;", "validDataList", "", "bindData", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/health/sleep/view/widget/DonutChartView;", "sleepStageChart", "Lcom/xiaomi/fitness/health/sleep/view/widget/DonutChartView;", "Landroidx/recyclerview/widget/RecyclerView;", "sleepStageDetailRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSleepDistributeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDistributeAdapter.kt\ncom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$SleepStageSectionViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,342:1\n1863#2,2:343\n*S KotlinDebug\n*F\n+ 1 SleepDistributeAdapter.kt\ncom/xiaomi/fitness/health/sleep/ui/adapter/SleepDistributeAdapter$SleepStageSectionViewHolder\n*L\n299#1:343,2\n*E\n"})
    public final class SleepStageSectionViewHolder extends RecyclerView.d0 {

        @NotNull
        private final DonutChartView sleepStageChart;

        @NotNull
        private final RecyclerView sleepStageDetailRecycler;
        final /* synthetic */ SleepDistributeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepStageSectionViewHolder(@NotNull SleepDistributeAdapter sleepDistributeAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepDistributeAdapter;
            View viewFindViewById = itemView.findViewById(eri.Cg);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.sleepStageChart = (DonutChartView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.Zg);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.sleepStageDetailRecycler = (RecyclerView) viewFindViewById2;
        }

        public final void bindData(@NotNull List<? extends uz6> validDataList) {
            Intrinsics.checkNotNullParameter(validDataList, "validDataList");
            ArrayList arrayList = new ArrayList();
            long j = 0;
            for (uz6 uz6Var : validDataList) {
                if (uz6Var.e() != 0) {
                    Logger.i("SleepStageSectionViewHolder", "item type=" + uz6Var.e() + " titleStr=" + uz6Var.g);
                    ListExtKt.add(arrayList, new DonutPieceModel(((float) uz6Var.f39601a) / 100.0f, SleepStageExtKt.getColorResIdByType(uz6Var.e()), SleepStageExtKt.getNameByType(uz6Var.e())));
                    j += uz6Var.f36300k;
                }
            }
            this.sleepStageChart.setPieceModels(arrayList, TimeDateUtil.getHHmmDurationSpannableWithMin((int) (j / ((long) 60000)), 1.6f));
            Logger.d("SleepStageSectionViewHolder", "dataList size=" + validDataList.size());
            this.sleepStageDetailRecycler.setAdapter(new SleepStageDetailAdapter(validDataList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepDistributeAdapter(@NotNull Context context, @NotNull List<? extends uz6> dataList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.mContext = context;
        this.mDataList = dataList;
        this.coverViewStatus = SleepTracePermissionGuidePreference.INSTANCE.getSLEEP_DISTRIBUTE_SHOW_ENABLE();
        this.showInStageChartPredicate = new Function1() { // from class: slm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepDistributeAdapter.showInStageChartPredicate$lambda$1((uz6) obj));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showInStageChartPredicate$lambda$1(uz6 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return model.e() == 3 || model.e() == 2 || model.e() == 1 || model.e() == 0;
    }

    @Override // defpackage.c72
    public int getContentItemCount() {
        return 1;
    }

    public final boolean getCoverViewStatus() {
        return this.coverViewStatus;
    }

    @Override // defpackage.c72
    @NotNull
    public List<uz6> getDataList() {
        return CollectionsKt___CollectionsKt.toMutableList((Collection) this.mDataList);
    }

    public final boolean getHasRemData() {
        return this.hasRemData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mHeaderCount + getContentItemCount();
    }

    @Nullable
    public final OnTitleItemClickListener getTitleItemClickListener() {
        return this.titleItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).bindData(this.titleItemClickListener, this.coverViewStatus);
            return;
        }
        if (holder instanceof SleepStageSectionViewHolder) {
            SleepStageSectionViewHolder sleepStageSectionViewHolder = (SleepStageSectionViewHolder) holder;
            List<uz6> dataList = getDataList();
            Function1<uz6, Boolean> function1 = this.showInStageChartPredicate;
            ArrayList arrayList = new ArrayList();
            for (Object obj : dataList) {
                if (function1.invoke2((uz6) obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            sleepStageSectionViewHolder.bindData(CollectionsKt___CollectionsKt.sortedWith(CollectionsKt___CollectionsKt.reversed(arrayList), new Comparator() { // from class: com.xiaomi.fitness.health.sleep.ui.adapter.SleepDistributeAdapter$onBindViewHolder$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(((uz6) t).e() == 0), Boolean.valueOf(((uz6) t2).e() == 0));
                }
            }));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(this.mContext).inflate(jui.d4, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new SleepStageSectionViewHolder(this, viewInflate);
        }
        if (viewType != 101) {
            View viewInflate2 = LayoutInflater.from(this.mContext).inflate(jui.u7, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new HeaderViewHolder(viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(this.mContext).inflate(jui.u7, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
        return new HeaderViewHolder(viewInflate3);
    }

    public final void setCoverViewStatus(boolean z) {
        this.coverViewStatus = z;
    }

    public final void setHasRemData(boolean z) {
        this.hasRemData = z;
    }

    public final void setOnTitleItemClickListener(@NotNull OnTitleItemClickListener onTitleItemClickListener) {
        Intrinsics.checkNotNullParameter(onTitleItemClickListener, "onTitleItemClickListener");
        this.titleItemClickListener = onTitleItemClickListener;
    }

    public final void setTitleItemClickListener(@Nullable OnTitleItemClickListener onTitleItemClickListener) {
        this.titleItemClickListener = onTitleItemClickListener;
    }
}
