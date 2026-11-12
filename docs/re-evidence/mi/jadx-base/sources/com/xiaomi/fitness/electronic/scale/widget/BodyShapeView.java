package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.model.AnalysisDataModel;
import com.xiaomi.fitness.electronic.scale.model.FatAnalysisBean;
import defpackage.bri;
import defpackage.eji;
import defpackage.gui;
import defpackage.jz6;
import defpackage.ofl;
import defpackage.syi;
import defpackage.ua1;
import defpackage.z5h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\"\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&J\u0010\u0010'\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/BodyShapeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bmiTv18", "Landroid/widget/TextView;", "bmiTv20", "fatTv10", "fatTv20", "diagramBodyShape", "Lcom/xiaomi/fitness/electronic/scale/widget/BodyShapeDiagram;", "tvAthleteType", "tvMuscleType", "tvMuscleSlimType", "tvEmaciatedType", "tvLeanType", "tvSlimlineType", "tvHealthyType", "tvScaleOverweight", "tvScaleObesity", "tvInvisibleObesity", "tvTypeList", "Ljava/util/ArrayList;", "initView", "", "setSelectedType", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "initData", "sex", "", "initBodyShapeDiagram", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BodyShapeView extends ConstraintLayout {
    private TextView bmiTv18;
    private TextView bmiTv20;
    private BodyShapeDiagram diagramBodyShape;
    private TextView fatTv10;
    private TextView fatTv20;
    private TextView tvAthleteType;
    private TextView tvEmaciatedType;
    private TextView tvHealthyType;
    private TextView tvInvisibleObesity;
    private TextView tvLeanType;
    private TextView tvMuscleSlimType;
    private TextView tvMuscleType;
    private TextView tvScaleObesity;
    private TextView tvScaleOverweight;
    private TextView tvSlimlineType;

    @NotNull
    private ArrayList<TextView> tvTypeList;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BodyShapeView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initBodyShapeDiagram(final WeightResult weightResult) {
        AnalysisDataModel analysisDataModel = new AnalysisDataModel();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        analysisDataModel.getFatAnalysisData(resources, syi.f34105a).S(ofl.c()).e0(ofl.c()).H(ua1.c()).a(new z5h<List<FatAnalysisBean>>() { // from class: com.xiaomi.fitness.electronic.scale.widget.BodyShapeView.initBodyShapeDiagram.1
            @Override // defpackage.z5h
            public void onComplete() {
            }

            @Override // defpackage.z5h
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
            }

            @Override // defpackage.z5h
            public void onSubscribe(jz6 d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }

            @Override // defpackage.z5h
            public void onNext(List<FatAnalysisBean> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                BodyShapeDiagram bodyShapeDiagram = BodyShapeView.this.diagramBodyShape;
                if (bodyShapeDiagram == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diagramBodyShape");
                    bodyShapeDiagram = null;
                }
                bodyShapeDiagram.setData(list, weightResult.getBt());
            }
        });
    }

    private final void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        View viewInflate = LayoutInflater.from(context).inflate(gui.i0, this);
        this.bmiTv18 = (TextView) viewInflate.findViewById(bri.E3);
        this.bmiTv20 = (TextView) viewInflate.findViewById(bri.F3);
        this.fatTv10 = (TextView) viewInflate.findViewById(bri.G3);
        this.fatTv20 = (TextView) viewInflate.findViewById(bri.H3);
        this.tvAthleteType = (TextView) viewInflate.findViewById(bri.b4);
        this.tvMuscleType = (TextView) viewInflate.findViewById(bri.a5);
        this.tvMuscleSlimType = (TextView) viewInflate.findViewById(bri.Z4);
        this.tvEmaciatedType = (TextView) viewInflate.findViewById(bri.B4);
        this.tvLeanType = (TextView) viewInflate.findViewById(bri.U4);
        this.tvSlimlineType = (TextView) viewInflate.findViewById(bri.B5);
        this.tvHealthyType = (TextView) viewInflate.findViewById(bri.G4);
        this.tvScaleOverweight = (TextView) viewInflate.findViewById(bri.r5);
        this.tvScaleObesity = (TextView) viewInflate.findViewById(bri.q5);
        this.tvInvisibleObesity = (TextView) viewInflate.findViewById(bri.S4);
        this.diagramBodyShape = (BodyShapeDiagram) viewInflate.findViewById(bri.T);
        ArrayList<TextView> arrayList = this.tvTypeList;
        TextView textView = this.tvAthleteType;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAthleteType");
            textView = null;
        }
        arrayList.add(textView);
        ArrayList<TextView> arrayList2 = this.tvTypeList;
        TextView textView3 = this.tvMuscleType;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvMuscleType");
            textView3 = null;
        }
        arrayList2.add(textView3);
        ArrayList<TextView> arrayList3 = this.tvTypeList;
        TextView textView4 = this.tvMuscleSlimType;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvMuscleSlimType");
            textView4 = null;
        }
        arrayList3.add(textView4);
        ArrayList<TextView> arrayList4 = this.tvTypeList;
        TextView textView5 = this.tvEmaciatedType;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvEmaciatedType");
            textView5 = null;
        }
        arrayList4.add(textView5);
        ArrayList<TextView> arrayList5 = this.tvTypeList;
        TextView textView6 = this.tvLeanType;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvLeanType");
            textView6 = null;
        }
        arrayList5.add(textView6);
        ArrayList<TextView> arrayList6 = this.tvTypeList;
        TextView textView7 = this.tvSlimlineType;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSlimlineType");
            textView7 = null;
        }
        arrayList6.add(textView7);
        ArrayList<TextView> arrayList7 = this.tvTypeList;
        TextView textView8 = this.tvHealthyType;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvHealthyType");
            textView8 = null;
        }
        arrayList7.add(textView8);
        ArrayList<TextView> arrayList8 = this.tvTypeList;
        TextView textView9 = this.tvScaleOverweight;
        if (textView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvScaleOverweight");
            textView9 = null;
        }
        arrayList8.add(textView9);
        ArrayList<TextView> arrayList9 = this.tvTypeList;
        TextView textView10 = this.tvScaleObesity;
        if (textView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvScaleObesity");
            textView10 = null;
        }
        arrayList9.add(textView10);
        ArrayList<TextView> arrayList10 = this.tvTypeList;
        TextView textView11 = this.tvInvisibleObesity;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvInvisibleObesity");
        } else {
            textView2 = textView11;
        }
        arrayList10.add(textView2);
    }

    private final void setSelectedType(WeightResult weightResult) {
        Iterator<TextView> it = this.tvTypeList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            TextView next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.setTextColor(getResources().getColor(eji.v));
        }
        short bt = weightResult.getBt();
        TextView textView = null;
        if (bt == -5) {
            TextView textView2 = this.tvEmaciatedType;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvEmaciatedType");
            } else {
                textView = textView2;
            }
            textView.setTextColor(getResources().getColor(eji.x));
            return;
        }
        if (bt == -4) {
            TextView textView3 = this.tvLeanType;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvLeanType");
            } else {
                textView = textView3;
            }
            textView.setTextColor(getResources().getColor(eji.x));
            return;
        }
        if (bt == -3) {
            TextView textView4 = this.tvInvisibleObesity;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvInvisibleObesity");
            } else {
                textView = textView4;
            }
            textView.setTextColor(getResources().getColor(eji.x));
            return;
        }
        if (bt == -2) {
            TextView textView5 = this.tvMuscleSlimType;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvMuscleSlimType");
            } else {
                textView = textView5;
            }
            textView.setTextColor(getResources().getColor(eji.x));
            return;
        }
        if (bt == -1) {
            TextView textView6 = this.tvSlimlineType;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvSlimlineType");
            } else {
                textView = textView6;
            }
            textView.setTextColor(getResources().getColor(eji.x));
            return;
        }
        if (bt == 0) {
            TextView textView7 = this.tvHealthyType;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvHealthyType");
            } else {
                textView = textView7;
            }
            textView.setTextColor(getResources().getColor(eji.x));
            return;
        }
        if (bt == 1) {
            TextView textView8 = this.tvMuscleType;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvMuscleType");
            } else {
                textView = textView8;
            }
            textView.setTextColor(getResources().getColor(eji.x));
            return;
        }
        if (bt == 2) {
            TextView textView9 = this.tvScaleOverweight;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvScaleOverweight");
            } else {
                textView = textView9;
            }
            textView.setTextColor(getResources().getColor(eji.x));
            return;
        }
        if (bt == 3) {
            TextView textView10 = this.tvAthleteType;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvAthleteType");
            } else {
                textView = textView10;
            }
            textView.setTextColor(getResources().getColor(eji.x));
            return;
        }
        if (bt == 4) {
            TextView textView11 = this.tvScaleObesity;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvScaleObesity");
            } else {
                textView = textView11;
            }
            textView.setTextColor(getResources().getColor(eji.x));
        }
    }

    public final void initData(@NotNull WeightResult weightResult, @Nullable String sex) {
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        setSelectedType(weightResult);
        initBodyShapeDiagram(weightResult);
        TextView textView = null;
        if (Intrinsics.areEqual(sex, "male")) {
            TextView textView2 = this.fatTv10;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fatTv10");
                textView2 = null;
            }
            textView2.setText("10%");
            TextView textView3 = this.fatTv20;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fatTv20");
            } else {
                textView = textView3;
            }
            textView.setText("20%");
            return;
        }
        TextView textView4 = this.fatTv10;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fatTv10");
            textView4 = null;
        }
        textView4.setText("18%");
        TextView textView5 = this.fatTv20;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fatTv20");
        } else {
            textView = textView5;
        }
        textView.setText("28%");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BodyShapeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyShapeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tvTypeList = new ArrayList<>();
        initView(context, attributeSet, i);
    }
}
