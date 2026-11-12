package com.xiaomi.fitness.training_plan.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.csi;
import defpackage.cyi;
import defpackage.eki;
import defpackage.ioi;
import defpackage.jvi;
import defpackage.k1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.androidbasewidget.widget.ProgressBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0002J0\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$H\u0014J\u000e\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/HabitHomeMedalProgressInfoLayout;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getCtx", "()Landroid/content/Context;", "medalLayout", "Landroid/widget/LinearLayout;", "level1Root", "level2Root", "level3Root", "level4Root", "level1Img", "Landroid/widget/ImageView;", "level2Img", "level3Img", "level4Img", "level1TV", "Landroid/widget/TextView;", "level2TV", "level3TV", "level4TV", "progressBar1", "Lmiuix/androidbasewidget/widget/ProgressBar;", "progressBar2", "progressBar3", "initMedalLayout", "", "onLayout", "changed", "", "left", "", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "setTrainingTime", "time", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitHomeMedalProgressInfoLayout extends FrameLayout {

    @NotNull
    private static final String TAG = "HabitHomeMedalProgressInfoLayout";

    @NotNull
    private final Context ctx;
    private ImageView level1Img;
    private LinearLayout level1Root;
    private TextView level1TV;
    private ImageView level2Img;
    private LinearLayout level2Root;
    private TextView level2TV;
    private ImageView level3Img;
    private LinearLayout level3Root;
    private TextView level3TV;
    private ImageView level4Img;
    private LinearLayout level4Root;
    private TextView level4TV;
    private LinearLayout medalLayout;
    private ProgressBar progressBar1;
    private ProgressBar progressBar2;
    private ProgressBar progressBar3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitHomeMedalProgressInfoLayout(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        initMedalLayout();
    }

    private final void initMedalLayout() {
        ProgressBar progressBar = null;
        View viewInflate = LayoutInflater.from(this.ctx).inflate(jvi.H, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        this.medalLayout = linearLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout = null;
        }
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = this.medalLayout;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout2 = null;
        }
        addView(linearLayout2);
        LinearLayout linearLayout3 = this.medalLayout;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout3 = null;
        }
        this.level1Root = (LinearLayout) linearLayout3.findViewById(csi.N0);
        LinearLayout linearLayout4 = this.medalLayout;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout4 = null;
        }
        this.level2Root = (LinearLayout) linearLayout4.findViewById(csi.Q0);
        LinearLayout linearLayout5 = this.medalLayout;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout5 = null;
        }
        this.level3Root = (LinearLayout) linearLayout5.findViewById(csi.T0);
        LinearLayout linearLayout6 = this.medalLayout;
        if (linearLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout6 = null;
        }
        this.level4Root = (LinearLayout) linearLayout6.findViewById(csi.W0);
        LinearLayout linearLayout7 = this.medalLayout;
        if (linearLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout7 = null;
        }
        this.level1Img = (ImageView) linearLayout7.findViewById(csi.M0);
        LinearLayout linearLayout8 = this.medalLayout;
        if (linearLayout8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout8 = null;
        }
        this.level2Img = (ImageView) linearLayout8.findViewById(csi.P0);
        LinearLayout linearLayout9 = this.medalLayout;
        if (linearLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout9 = null;
        }
        this.level3Img = (ImageView) linearLayout9.findViewById(csi.S0);
        LinearLayout linearLayout10 = this.medalLayout;
        if (linearLayout10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout10 = null;
        }
        this.level4Img = (ImageView) linearLayout10.findViewById(csi.V0);
        LinearLayout linearLayout11 = this.medalLayout;
        if (linearLayout11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout11 = null;
        }
        this.level1TV = (TextView) linearLayout11.findViewById(csi.L0);
        LinearLayout linearLayout12 = this.medalLayout;
        if (linearLayout12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout12 = null;
        }
        this.level2TV = (TextView) linearLayout12.findViewById(csi.O0);
        LinearLayout linearLayout13 = this.medalLayout;
        if (linearLayout13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout13 = null;
        }
        this.level3TV = (TextView) linearLayout13.findViewById(csi.R0);
        LinearLayout linearLayout14 = this.medalLayout;
        if (linearLayout14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
            linearLayout14 = null;
        }
        this.level4TV = (TextView) linearLayout14.findViewById(csi.U0);
        TextView textView = this.level1TV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("level1TV");
            textView = null;
        }
        textView.setText(ResourceExtKt.getString(k1j.N0));
        TextView textView2 = this.level2TV;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("level2TV");
            textView2 = null;
        }
        textView2.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.s, 10, 10));
        TextView textView3 = this.level3TV;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("level3TV");
            textView3 = null;
        }
        textView3.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.s, 30, 30));
        TextView textView4 = this.level4TV;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("level4TV");
            textView4 = null;
        }
        textView4.setText(ResourceExtKt.getString(k1j.O0));
        View viewInflate2 = LayoutInflater.from(this.ctx).inflate(jvi.I, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate2, "null cannot be cast to non-null type miuix.androidbasewidget.widget.ProgressBar");
        this.progressBar1 = (ProgressBar) viewInflate2;
        View viewInflate3 = LayoutInflater.from(this.ctx).inflate(jvi.I, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate3, "null cannot be cast to non-null type miuix.androidbasewidget.widget.ProgressBar");
        this.progressBar2 = (ProgressBar) viewInflate3;
        View viewInflate4 = LayoutInflater.from(this.ctx).inflate(jvi.I, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate4, "null cannot be cast to non-null type miuix.androidbasewidget.widget.ProgressBar");
        this.progressBar3 = (ProgressBar) viewInflate4;
        ProgressBar progressBar2 = this.progressBar1;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar1");
            progressBar2 = null;
        }
        addView(progressBar2);
        ProgressBar progressBar3 = this.progressBar2;
        if (progressBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar2");
            progressBar3 = null;
        }
        addView(progressBar3);
        ProgressBar progressBar4 = this.progressBar3;
        if (progressBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar3");
        } else {
            progressBar = progressBar4;
        }
        addView(progressBar);
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        ImageView imageView;
        Logger.d(TAG, "onLayout: " + left + " - " + top + " - " + right + " - " + bottom);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LinearLayout linearLayout = this.medalLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("medalLayout");
                linearLayout = null;
            }
            if (Intrinsics.areEqual(childAt, linearLayout)) {
                super.onLayout(changed, left, top, right, bottom);
            } else {
                ImageView imageView2 = this.level1Img;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("level1Img");
                    imageView2 = null;
                }
                int top2 = imageView2.getTop();
                ImageView imageView3 = this.level1Img;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("level1Img");
                    imageView3 = null;
                }
                int height = (top2 + (imageView3.getHeight() / 2)) - ExtUtilsKt.getDp(2);
                int dp = ExtUtilsKt.getDp(4) + height;
                Logger.d(TAG, "progress top:" + height + " - bottom:" + dp);
                ProgressBar progressBar = this.progressBar1;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar1");
                    progressBar = null;
                }
                if (Intrinsics.areEqual(childAt, progressBar)) {
                    ImageView imageView4 = this.level1Img;
                    if (imageView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("level1Img");
                        imageView4 = null;
                    }
                    int right2 = imageView4.getRight();
                    LinearLayout linearLayout2 = this.level2Root;
                    if (linearLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("level2Root");
                        linearLayout2 = null;
                    }
                    int left2 = linearLayout2.getLeft();
                    ImageView imageView5 = this.level2Img;
                    if (imageView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("level2Img");
                        imageView = null;
                    } else {
                        imageView = imageView5;
                    }
                    childAt.layout(right2, height, left2 + imageView.getLeft(), dp);
                } else {
                    ProgressBar progressBar2 = this.progressBar2;
                    if (progressBar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressBar2");
                        progressBar2 = null;
                    }
                    if (Intrinsics.areEqual(childAt, progressBar2)) {
                        LinearLayout linearLayout3 = this.level2Root;
                        if (linearLayout3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("level2Root");
                            linearLayout3 = null;
                        }
                        int right3 = linearLayout3.getRight();
                        LinearLayout linearLayout4 = this.level2Root;
                        if (linearLayout4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("level2Root");
                            linearLayout4 = null;
                        }
                        int width = linearLayout4.getWidth();
                        ImageView imageView6 = this.level2Img;
                        if (imageView6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("level2Img");
                            imageView6 = null;
                        }
                        int right4 = right3 - (width - imageView6.getRight());
                        LinearLayout linearLayout5 = this.level3Root;
                        if (linearLayout5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("level3Root");
                            linearLayout5 = null;
                        }
                        int left3 = linearLayout5.getLeft();
                        ImageView imageView7 = this.level3Img;
                        if (imageView7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("level3Img");
                            imageView7 = null;
                        }
                        childAt.layout(right4, height, left3 + imageView7.getLeft(), dp);
                    } else {
                        ProgressBar progressBar3 = this.progressBar3;
                        if (progressBar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("progressBar3");
                            progressBar3 = null;
                        }
                        if (Intrinsics.areEqual(childAt, progressBar3)) {
                            LinearLayout linearLayout6 = this.level3Root;
                            if (linearLayout6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("level3Root");
                                linearLayout6 = null;
                            }
                            int right5 = linearLayout6.getRight();
                            LinearLayout linearLayout7 = this.level3Root;
                            if (linearLayout7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("level3Root");
                                linearLayout7 = null;
                            }
                            int width2 = linearLayout7.getWidth();
                            ImageView imageView8 = this.level3Img;
                            if (imageView8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("level3Img");
                                imageView8 = null;
                            }
                            int right6 = right5 - (width2 - imageView8.getRight());
                            LinearLayout linearLayout8 = this.level4Root;
                            if (linearLayout8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("level4Root");
                                linearLayout8 = null;
                            }
                            int left4 = linearLayout8.getLeft();
                            ImageView imageView9 = this.level4Img;
                            if (imageView9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("level4Img");
                                imageView9 = null;
                            }
                            childAt.layout(right6, height, left4 + imageView9.getLeft(), dp);
                        }
                    }
                }
            }
        }
    }

    public final void setTrainingTime(int time) {
        TextView textView = null;
        if (time >= 30) {
            if (time > 45) {
                ProgressBar progressBar = this.progressBar3;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar3");
                    progressBar = null;
                }
                progressBar.setProgress(75);
            } else if (time > 40) {
                ProgressBar progressBar2 = this.progressBar3;
                if (progressBar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar3");
                    progressBar2 = null;
                }
                progressBar2.setProgress(50);
            } else if (time > 30) {
                ProgressBar progressBar3 = this.progressBar3;
                if (progressBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar3");
                    progressBar3 = null;
                }
                progressBar3.setProgress(25);
            } else {
                ProgressBar progressBar4 = this.progressBar3;
                if (progressBar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar3");
                    progressBar4 = null;
                }
                progressBar4.setProgress(0);
            }
            ProgressBar progressBar5 = this.progressBar2;
            if (progressBar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar2");
                progressBar5 = null;
            }
            progressBar5.setProgress(100);
            ProgressBar progressBar6 = this.progressBar1;
            if (progressBar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar1");
                progressBar6 = null;
            }
            progressBar6.setProgress(100);
            ImageView imageView = this.level2Img;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("level2Img");
                imageView = null;
            }
            imageView.setImageResource(ioi.E);
            ImageView imageView2 = this.level3Img;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("level3Img");
                imageView2 = null;
            }
            imageView2.setImageResource(ioi.G);
            TextView textView2 = this.level2TV;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("level2TV");
                textView2 = null;
            }
            textView2.setTextColor(ExtUtilsKt.getColor(eki.d));
            TextView textView3 = this.level3TV;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("level3TV");
            } else {
                textView = textView3;
            }
            textView.setTextColor(ExtUtilsKt.getColor(eki.d));
            return;
        }
        if (time >= 10) {
            ProgressBar progressBar7 = this.progressBar2;
            if (progressBar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar2");
                progressBar7 = null;
            }
            progressBar7.setProgress((int) (((time - 10) / 20) * 100));
            ProgressBar progressBar8 = this.progressBar1;
            if (progressBar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar1");
                progressBar8 = null;
            }
            progressBar8.setProgress(100);
            ProgressBar progressBar9 = this.progressBar3;
            if (progressBar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar3");
                progressBar9 = null;
            }
            progressBar9.setProgress(0);
            ImageView imageView3 = this.level2Img;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("level2Img");
                imageView3 = null;
            }
            imageView3.setImageResource(ioi.E);
            ImageView imageView4 = this.level3Img;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("level3Img");
                imageView4 = null;
            }
            imageView4.setImageResource(ioi.F);
            TextView textView4 = this.level2TV;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("level2TV");
                textView4 = null;
            }
            textView4.setTextColor(ExtUtilsKt.getColor(eki.d));
            TextView textView5 = this.level3TV;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("level3TV");
            } else {
                textView = textView5;
            }
            textView.setTextColor(ExtUtilsKt.getColor(eki.f));
            return;
        }
        ProgressBar progressBar10 = this.progressBar1;
        if (progressBar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar1");
            progressBar10 = null;
        }
        progressBar10.setProgress((int) ((time / 10) * 100));
        ProgressBar progressBar11 = this.progressBar2;
        if (progressBar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar2");
            progressBar11 = null;
        }
        progressBar11.setProgress(0);
        ProgressBar progressBar12 = this.progressBar3;
        if (progressBar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar3");
            progressBar12 = null;
        }
        progressBar12.setProgress(0);
        ImageView imageView5 = this.level2Img;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("level2Img");
            imageView5 = null;
        }
        imageView5.setImageResource(ioi.D);
        ImageView imageView6 = this.level3Img;
        if (imageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("level3Img");
            imageView6 = null;
        }
        imageView6.setImageResource(ioi.F);
        TextView textView6 = this.level2TV;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("level2TV");
            textView6 = null;
        }
        textView6.setTextColor(ExtUtilsKt.getColor(eki.f));
        TextView textView7 = this.level3TV;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("level3TV");
        } else {
            textView = textView7;
        }
        textView.setTextColor(ExtUtilsKt.getColor(eki.f));
    }
}
