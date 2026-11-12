package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter;
import com.huawei.health.suggestion.ui.fitness.helper.RecyclerHolder;
import com.huawei.ui.commonui.progressbar.HealthMultiProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.hmb;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ScorePersentView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10203b;
    private View d;
    private HealthRecycleView e;

    public ScorePersentView(Context context) {
        this(context, null);
    }

    public ScorePersentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScorePersentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10203b = context;
        b();
    }

    private void b() {
        View viewInflate = View.inflate(this.f10203b, R.layout.action_finish_main, this);
        this.d = viewInflate;
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.action_finish_score_view);
        this.e = healthRecycleView;
        healthRecycleView.setNestedScrollingEnabled(false);
        this.e.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
    }

    public void setActionScoreAdapter(List<hmb> list) {
        this.e.setAdapter(new BaseRecyclerViewAdapter<hmb>(list, R.layout.action_finish_score_item) { // from class: com.huawei.health.suggestion.ui.view.ScorePersentView.5
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void convert(RecyclerHolder recyclerHolder, int i, hmb hmbVar) {
                recyclerHolder.b(R.id.sug_coach_item_finish_actionname, hmbVar.e());
                String strValueOf = String.valueOf(hmbVar.a());
                recyclerHolder.b(R.id.sug_coach_item_score, ScorePersentView.this.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_sleep_referece_title_score_string, CommonUtil.j(strValueOf), strValueOf));
                HealthMultiProgressBar healthMultiProgressBar = (HealthMultiProgressBar) recyclerHolder.e(R.id.sug_coach_item_progress);
                Integer[] numArr = {Integer.valueOf(hmbVar.j()), Integer.valueOf(hmbVar.c()), Integer.valueOf(hmbVar.d()), Integer.valueOf(hmbVar.b()), Integer.valueOf(hmbVar.h())};
                if (ScorePersentView.this.a(numArr) == 0) {
                    numArr[4] = 1;
                }
                healthMultiProgressBar.e(4).c(10).a(numArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Integer[] numArr) {
        if (numArr == null) {
            return 0;
        }
        int iIntValue = 0;
        for (Integer num : numArr) {
            iIntValue += num.intValue();
        }
        return iIntValue;
    }
}
