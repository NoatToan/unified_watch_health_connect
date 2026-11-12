package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.suggestion.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.muscleview.data.HealthBodyPath;
import com.huawei.ui.commonui.muscleview.data.HealthMusclePath;
import com.huawei.ui.commonui.muscleview.view.HealthTrainResultView;
import defpackage.btt;
import defpackage.qos;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class StrechMuscleView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f10204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<HealthMusclePath> f10205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<HealthBodyPath> f10206c;
    private Context d;
    private List<HealthBodyPath> e;
    private HealthTrainResultView f;
    private List<HealthMusclePath> g;
    private View i;

    public StrechMuscleView(Context context) {
        this(context, null);
    }

    public StrechMuscleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StrechMuscleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
        a();
    }

    private void a() {
        View viewInflate = View.inflate(this.d, R.layout.strech_part_layout, this);
        this.i = viewInflate;
        this.f = (HealthTrainResultView) viewInflate.findViewById(R.id.muscle_result);
        this.f10204a = (HealthTextView) this.i.findViewById(R.id.strech_part_subheader_illustration);
    }

    private void c() {
        this.g = qos.d().b(getContext(), 1);
        this.f10205b = qos.d().b(getContext(), 2);
        this.e = qos.d().e(getContext(), 1);
        this.f10206c = qos.d().e(getContext(), 2);
    }

    public void setData(final SparseArray<Integer> sparseArray, final SparseArray<Integer> sparseArray2, int i) {
        c();
        if (i < 60) {
            this.f10204a.setText(getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_strechpart_low));
        } else if (i >= 80) {
            this.f10204a.setText(getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_strechpart_high));
        } else {
            this.f10204a.setText(getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_strechpart_middle));
        }
        btt.d().c(new Runnable() { // from class: idl
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.e.b(sparseArray, sparseArray2);
            }
        });
    }

    public /* synthetic */ void b(SparseArray sparseArray, SparseArray sparseArray2) throws Throwable {
        this.f.setFrontViewData(this.e, this.g, sparseArray);
        this.f.setBackViewData(this.f10206c, this.f10205b, sparseArray2);
    }
}
