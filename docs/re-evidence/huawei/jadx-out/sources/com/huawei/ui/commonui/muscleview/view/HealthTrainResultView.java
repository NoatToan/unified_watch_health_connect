package com.huawei.ui.commonui.muscleview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.muscleview.data.HealthBodyPath;
import com.huawei.ui.commonui.muscleview.data.HealthMuscleInfo;
import com.huawei.ui.commonui.muscleview.data.HealthMusclePath;
import defpackage.qos;
import defpackage.qot;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthTrainResultView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTrainBodyView f23781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTrainBodyView f23782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<qot> f23783c;
    private View d;
    private View e;
    private View g;
    private HealthTrainBodyLineView i;
    private View j;

    public HealthTrainResultView(Context context) {
        super(context);
        b(context, this);
    }

    public HealthTrainResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, this);
    }

    public HealthTrainResultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, this);
    }

    private void b(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.train_result_muscle_layout, viewGroup);
        this.f23781a = (HealthTrainBodyView) findViewById(R.id.iv_positive);
        this.f23782b = (HealthTrainBodyView) findViewById(R.id.iv_negative);
        this.i = (HealthTrainBodyLineView) findViewById(R.id.train_line_view);
        this.j = findViewById(R.id.tv_relax_part_2);
        this.d = findViewById(R.id.tv_relax_part_1);
        this.g = findViewById(R.id.tv_relax_part_2_content);
        this.e = findViewById(R.id.tv_relax_part_1_content);
        this.f23783c = new ArrayList();
    }

    public HealthTrainBodyView getIvPositive() {
        return this.f23781a;
    }

    public HealthTrainBodyView getIvNegative() {
        return this.f23782b;
    }

    public HealthTrainBodyLineView getTrainBodyLineView() {
        return this.i;
    }

    public void setLineData(List<qot> list) {
        HealthTrainBodyLineView healthTrainBodyLineView = this.i;
        if (healthTrainBodyLineView == null) {
            return;
        }
        healthTrainBodyLineView.setLineData(list);
    }

    public void setFrontViewData(List<HealthBodyPath> list, List<HealthMusclePath> list2, SparseArray<Integer> sparseArray) throws Throwable {
        HealthTrainBodyView healthTrainBodyView;
        if (list == null || list2 == null || (healthTrainBodyView = this.f23781a) == null) {
            LogUtil.j("HealthTrainResultView", "setFrontViewData input is null");
            return;
        }
        healthTrainBodyView.setFrontViewData(list, list2, sparseArray);
        if (sparseArray == null || sparseArray.size() == 0) {
            return;
        }
        int iKeyAt = 0;
        int iIntValue = 0;
        for (int i = 0; i < sparseArray.size(); i++) {
            if (sparseArray.keyAt(i) > 28 || sparseArray.keyAt(i) < 0) {
                LogUtil.j("HealthTrainResultView", "setFrontViewData, position is over 27 or below 0");
            } else if (iIntValue < sparseArray.valueAt(i).intValue()) {
                iIntValue = sparseArray.valueAt(i).intValue();
                iKeyAt = sparseArray.keyAt(i);
            }
        }
        qot qotVar = new qot();
        qotVar.d(getIvPositive());
        qotVar.e(iKeyAt);
        HealthMuscleInfo healthMuscleInfoE = qos.d().e(getContext(), 1, iKeyAt != 0 ? iKeyAt - 1 : 0);
        if (healthMuscleInfoE == null || healthMuscleInfoE.c() == null || healthMuscleInfoE.d() == null) {
            LogUtil.j("HealthTrainResultView", "setFrontViewData, info | muscleName | muscleFunction = null");
            return;
        }
        int identifier = getResources().getIdentifier(healthMuscleInfoE.c(), "string", "com.huawei.health");
        int identifier2 = getResources().getIdentifier(healthMuscleInfoE.d(), "string", "com.huawei.health");
        qotVar.e(this.j);
        a(this.g, getResources().getString(identifier2));
        a(this.j, getResources().getString(identifier));
        this.f23783c.add(qotVar);
    }

    public void setBackViewData(List<HealthBodyPath> list, List<HealthMusclePath> list2, SparseArray<Integer> sparseArray) throws Throwable {
        HealthTrainBodyView healthTrainBodyView;
        if (list == null || list2 == null || (healthTrainBodyView = this.f23782b) == null) {
            LogUtil.j("HealthTrainResultView", "setFrontViewData input is null");
            return;
        }
        healthTrainBodyView.setBackViewData(list, list2, sparseArray);
        if (sparseArray == null || sparseArray.size() == 0) {
            return;
        }
        int iKeyAt = 0;
        int iIntValue = 0;
        for (int i = 0; i < sparseArray.size(); i++) {
            if (sparseArray.keyAt(i) > 23 || sparseArray.keyAt(i) < 0) {
                LogUtil.j("HealthTrainResultView", "setBackViewData, position is over 27 or below 0");
            } else if (iIntValue < sparseArray.valueAt(i).intValue()) {
                iIntValue = sparseArray.valueAt(i).intValue();
                iKeyAt = sparseArray.keyAt(i);
            }
        }
        qot qotVar = new qot();
        qotVar.d(getIvNegative());
        qotVar.e(iKeyAt);
        HealthMuscleInfo healthMuscleInfoE = qos.d().e(getContext(), 2, iKeyAt != 0 ? iKeyAt - 1 : 0);
        if (healthMuscleInfoE == null || healthMuscleInfoE.c() == null || healthMuscleInfoE.d() == null) {
            LogUtil.j("HealthTrainResultView", "setBackViewData, info | muscleName | muscleFunction = null");
            return;
        }
        int identifier = getResources().getIdentifier(healthMuscleInfoE.c(), "string", "com.huawei.health");
        int identifier2 = getResources().getIdentifier(healthMuscleInfoE.d(), "string", "com.huawei.health");
        qotVar.e(this.d);
        a(this.e, getResources().getString(identifier2));
        a(this.d, getResources().getString(identifier));
        this.f23783c.add(qotVar);
        if (this.f23783c.size() != 0) {
            setLineData(this.f23783c);
        }
    }

    private void a(View view, String str) {
        if (view instanceof HealthTextView) {
            ((HealthTextView) view).setText(str);
        }
    }
}
