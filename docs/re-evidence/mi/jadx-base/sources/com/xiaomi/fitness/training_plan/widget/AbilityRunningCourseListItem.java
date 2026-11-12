package com.xiaomi.fitness.training_plan.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseContent;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseItem;
import com.xiaomi.fitness.training_plan_export.model.RunningPaceRange;
import defpackage.csi;
import defpackage.cyi;
import defpackage.ioi;
import defpackage.jf;
import defpackage.jvi;
import defpackage.k1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityRunningCourseListItem;", "Landroid/widget/FrameLayout;", "", "initView", "()V", "Ljf;", "binding", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseItem;", "courseItem", "Landroid/view/View;", "buildCourseDetail", "(Ljf;Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseItem;)Landroid/view/View;", "", "type", "", "getCourseNameByType", "(I)Ljava/lang/String;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseContent;", "courseContent", "updateData", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseContent;)V", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Landroid/widget/LinearLayout;", "courseList", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "loopTV", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "courseIndicatorImg", "Landroid/widget/ImageView;", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAbilityRunningCourseListLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityRunningCourseListLayout.kt\ncom/xiaomi/fitness/training_plan/widget/AbilityRunningCourseListItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1863#2,2:125\n*S KotlinDebug\n*F\n+ 1 AbilityRunningCourseListLayout.kt\ncom/xiaomi/fitness/training_plan/widget/AbilityRunningCourseListItem\n*L\n51#1:125,2\n*E\n"})
public final class AbilityRunningCourseListItem extends FrameLayout {
    private ImageView courseIndicatorImg;
    private LinearLayout courseList;

    @NotNull
    private final Context ctx;
    private TextView loopTV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbilityRunningCourseListItem(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        initView();
    }

    private final View buildCourseDetail(jf binding, AbilityPlanRunningCourseItem courseItem) {
        binding.B.setText(getCourseNameByType(courseItem.getType()));
        binding.A.setText(ResourceExtKt.getQuantityString(this.ctx, cyi.c, courseItem.getDuration(), Integer.valueOf(courseItem.getDuration())));
        if (courseItem.getPaceRange() != null) {
            binding.F.setVisibility(0);
            TextView textView = binding.D;
            ITrainingManager.Companion companion = ITrainingManager.INSTANCE;
            ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(companion);
            RunningPaceRange paceRange = courseItem.getPaceRange();
            Intrinsics.checkNotNull(paceRange);
            textView.setText(trainingManagerExtKt.buildPaceStr(paceRange.getMinPace()));
            TextView textView2 = binding.C;
            ITrainingManager trainingManagerExtKt2 = TrainingManagerExtKt.getInstance(companion);
            RunningPaceRange paceRange2 = courseItem.getPaceRange();
            Intrinsics.checkNotNull(paceRange2);
            textView2.setText(trainingManagerExtKt2.buildPaceStr(paceRange2.getMaxPace()));
        } else {
            binding.F.setVisibility(8);
        }
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    private final String getCourseNameByType(int type) {
        String string;
        if (type == 1) {
            string = this.ctx.getString(k1j.H);
        } else if (type != 2) {
            string = type != 3 ? "" : this.ctx.getString(k1j.G);
        } else {
            string = this.ctx.getString(k1j.I);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    private final void initView() {
        LayoutInflater.from(this.ctx).inflate(jvi.f23185b, this);
        this.courseList = (LinearLayout) findViewById(csi.H);
        this.loopTV = (TextView) findViewById(csi.a1);
        this.courseIndicatorImg = (ImageView) findViewById(csi.G);
    }

    public final void updateData(@Nullable AbilityPlanRunningCourseContent courseContent) {
        Integer loopCount;
        if (courseContent != null) {
            LinearLayout linearLayout = null;
            if (courseContent.isLoop()) {
                TextView textView = this.loopTV;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loopTV");
                    textView = null;
                }
                textView.setVisibility(0);
                TextView textView2 = this.loopTV;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loopTV");
                    textView2 = null;
                }
                Context context = this.ctx;
                int i = cyi.d;
                Integer loopCount2 = courseContent.getLoopCount();
                textView2.setText(ResourceExtKt.getQuantityString(context, i, loopCount2 != null ? loopCount2.intValue() : 0, courseContent.getLoopCount()));
            } else {
                TextView textView3 = this.loopTV;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loopTV");
                    textView3 = null;
                }
                textView3.setVisibility(8);
            }
            if (!courseContent.isLoop() || (loopCount = courseContent.getLoopCount()) == null || loopCount.intValue() <= 1) {
                ImageView imageView = this.courseIndicatorImg;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("courseIndicatorImg");
                    imageView = null;
                }
                imageView.setImageResource(ioi.course_left_running_indicator);
                jf jfVarA0 = jf.A0(LayoutInflater.from(this.ctx));
                Intrinsics.checkNotNullExpressionValue(jfVarA0, "inflate(...)");
                View viewBuildCourseDetail = buildCourseDetail(jfVarA0, courseContent.getCourseList().get(0));
                LinearLayout linearLayout2 = this.courseList;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("courseList");
                } else {
                    linearLayout = linearLayout2;
                }
                linearLayout.addView(viewBuildCourseDetail, new LinearLayout.LayoutParams(-2, -2));
                return;
            }
            ImageView imageView2 = this.courseIndicatorImg;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("courseIndicatorImg");
                imageView2 = null;
            }
            imageView2.setImageResource(ioi.course_left_running_indicator_long);
            int i2 = 0;
            for (AbilityPlanRunningCourseItem abilityPlanRunningCourseItem : courseContent.getCourseList()) {
                jf jfVarA1 = jf.A0(LayoutInflater.from(this.ctx));
                Intrinsics.checkNotNullExpressionValue(jfVarA1, "inflate(...)");
                View viewBuildCourseDetail2 = buildCourseDetail(jfVarA1, abilityPlanRunningCourseItem);
                if (i2 == 0) {
                    LinearLayout linearLayout3 = this.courseList;
                    if (linearLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("courseList");
                        linearLayout3 = null;
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins(0, 0, 0, ExtUtilsKt.getDp(8));
                    Unit unit = Unit.INSTANCE;
                    linearLayout3.addView(viewBuildCourseDetail2, layoutParams);
                } else {
                    Integer loopCount3 = courseContent.getLoopCount();
                    if (loopCount3 == null) {
                        loopCount3 = -1;
                    }
                    if (i2 == loopCount3.intValue()) {
                        LinearLayout linearLayout4 = this.courseList;
                        if (linearLayout4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("courseList");
                            linearLayout4 = null;
                        }
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.setMargins(0, ExtUtilsKt.getDp(8), 0, 0);
                        Unit unit2 = Unit.INSTANCE;
                        linearLayout4.addView(viewBuildCourseDetail2, layoutParams2);
                    } else {
                        LinearLayout linearLayout5 = this.courseList;
                        if (linearLayout5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("courseList");
                            linearLayout5 = null;
                        }
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams3.setMargins(0, ExtUtilsKt.getDp(8), 0, ExtUtilsKt.getDp(8));
                        Unit unit3 = Unit.INSTANCE;
                        linearLayout5.addView(viewBuildCourseDetail2, layoutParams3);
                    }
                }
                i2++;
            }
        }
    }
}
