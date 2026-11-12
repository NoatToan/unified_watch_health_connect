package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import defpackage.bri;
import defpackage.gui;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/AnalysisDataDesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTvName1", "Landroid/widget/TextView;", "mTvDes1", "mTvName2", "mTvDes2", "mTvName3", "mTvDes3", "initView", "", "initData", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "type", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnalysisDataDesView extends LinearLayout {
    public static final int TYPE_FAT = 0;
    public static final int TYPE_MUSCLE = 1;
    private TextView mTvDes1;
    private TextView mTvDes2;
    private TextView mTvDes3;
    private TextView mTvName1;
    private TextView mTvName2;
    private TextView mTvName3;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalysisDataDesView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        View viewInflate = LayoutInflater.from(context).inflate(gui.S, this);
        this.mTvName1 = (TextView) viewInflate.findViewById(bri.c5);
        this.mTvDes1 = (TextView) viewInflate.findViewById(bri.n4);
        this.mTvName2 = (TextView) viewInflate.findViewById(bri.d5);
        this.mTvDes2 = (TextView) viewInflate.findViewById(bri.o4);
        this.mTvName3 = (TextView) viewInflate.findViewById(bri.e5);
        this.mTvDes3 = (TextView) viewInflate.findViewById(bri.p4);
        TextView textView = this.mTvDes1;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvDes1");
            textView = null;
        }
        textView.setText(getResources().getString(zzi.X));
        TextView textView3 = this.mTvDes2;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvDes2");
            textView3 = null;
        }
        textView3.setText(getResources().getString(zzi.Q3));
        TextView textView4 = this.mTvDes3;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvDes3");
        } else {
            textView2 = textView4;
        }
        textView2.setText(getResources().getString(zzi.t5));
    }

    public final void initData(@NotNull WeightResult weightResult, int type) {
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        TextView textView = null;
        if (type == 0) {
            if (weightResult.getEofa() == 0) {
                TextView textView2 = this.mTvName1;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName1");
                    textView2 = null;
                }
                textView2.setText(getResources().getString(zzi.s5));
            } else if (weightResult.getEofa() == 1) {
                TextView textView3 = this.mTvName1;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName1");
                    textView3 = null;
                }
                textView3.setText(getResources().getString(zzi.X3));
            } else if (weightResult.getEofa() == 2) {
                TextView textView4 = this.mTvName1;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName1");
                    textView4 = null;
                }
                textView4.setText(getResources().getString(zzi.T4));
            }
            if (weightResult.getEofl() == 0) {
                TextView textView5 = this.mTvName2;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName2");
                    textView5 = null;
                }
                textView5.setText(getResources().getString(zzi.s5));
            } else if (weightResult.getEofl() == 1) {
                TextView textView6 = this.mTvName2;
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName2");
                    textView6 = null;
                }
                textView6.setText(getResources().getString(zzi.X3));
            } else if (weightResult.getEofl() == 2) {
                TextView textView7 = this.mTvName2;
                if (textView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName2");
                    textView7 = null;
                }
                textView7.setText(getResources().getString(zzi.T4));
            }
            if (weightResult.getEofb() == 0) {
                TextView textView8 = this.mTvName3;
                if (textView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName3");
                } else {
                    textView = textView8;
                }
                textView.setText(getResources().getString(zzi.s5));
                return;
            }
            if (weightResult.getEofb() == 1) {
                TextView textView9 = this.mTvName3;
                if (textView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName3");
                } else {
                    textView = textView9;
                }
                textView.setText(getResources().getString(zzi.X3));
                return;
            }
            if (weightResult.getEofb() == 2) {
                TextView textView10 = this.mTvName3;
                if (textView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvName3");
                } else {
                    textView = textView10;
                }
                textView.setText(getResources().getString(zzi.T4));
                return;
            }
            return;
        }
        if (type != 1) {
            return;
        }
        if (weightResult.getEoma() == 0) {
            TextView textView11 = this.mTvName1;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvName1");
                textView11 = null;
            }
            textView11.setText(getResources().getString(zzi.s5));
        } else if (weightResult.getEoma() == 1) {
            TextView textView12 = this.mTvName1;
            if (textView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvName1");
                textView12 = null;
            }
            textView12.setText(getResources().getString(zzi.X3));
        } else if (weightResult.getEoma() == 2) {
            TextView textView13 = this.mTvName1;
            if (textView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvName1");
                textView13 = null;
            }
            textView13.setText(getResources().getString(zzi.T4));
        }
        if (weightResult.getEoml() == 0) {
            TextView textView14 = this.mTvName2;
            if (textView14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvName2");
                textView14 = null;
            }
            textView14.setText(getResources().getString(zzi.s5));
        } else if (weightResult.getEoml() == 1) {
            TextView textView15 = this.mTvName2;
            if (textView15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvName2");
                textView15 = null;
            }
            textView15.setText(getResources().getString(zzi.X3));
        } else if (weightResult.getEoml() == 2) {
            TextView textView16 = this.mTvName2;
            if (textView16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvName2");
                textView16 = null;
            }
            textView16.setText(getResources().getString(zzi.T4));
        }
        if (weightResult.getEomb() == 0) {
            TextView textView17 = this.mTvName3;
            if (textView17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvName3");
            } else {
                textView = textView17;
            }
            textView.setText(getResources().getString(zzi.s5));
            return;
        }
        if (weightResult.getEomb() == 1) {
            TextView textView18 = this.mTvName3;
            if (textView18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvName3");
            } else {
                textView = textView18;
            }
            textView.setText(getResources().getString(zzi.X3));
            return;
        }
        if (weightResult.getEomb() == 2) {
            TextView textView19 = this.mTvName3;
            if (textView19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvName3");
            } else {
                textView = textView19;
            }
            textView.setText(getResources().getString(zzi.T4));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalysisDataDesView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalysisDataDesView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet, i);
    }
}
