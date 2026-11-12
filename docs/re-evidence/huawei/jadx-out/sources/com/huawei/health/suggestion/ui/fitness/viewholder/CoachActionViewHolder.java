package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.CoachMotion;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.fitness.module.TrainActionIntro;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzx;
import defpackage.hiy;
import defpackage.qqf;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CoachActionViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f9436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TrainActionIntro f9438c;
    private HealthButton d;
    private HealthTextView e;

    public CoachActionViewHolder(View view, TrainActionIntro trainActionIntro) {
        super(view);
        this.f9438c = trainActionIntro;
        this.f9436a = (ImageView) view.findViewById(R.id.sug_item_coach_image);
        this.e = (HealthTextView) view.findViewById(R.id.sug_item_coach_text);
        this.d = (HealthButton) view.findViewById(R.id.sug_item_coach_button);
    }

    public void e(List<CoachMotion> list, int i) {
        CoachMotion coachMotion = list.get(i);
        String motionImageUrl = coachMotion.getMotionImageUrl();
        this.f9437b = coachMotion.getTotalMotionNum();
        int currMotionNum = coachMotion.getCurrMotionNum();
        qqf.a(motionImageUrl, this.f9436a, qqf.d);
        this.e.setText(UnitUtil.e(currMotionNum + 1, 1, 0) + "/" + UnitUtil.e(this.f9437b, 1, 0));
        this.d.setText(R.string.sug_curr_action);
        this.d.setVisibility(coachMotion.isButtonVisible() ? 0 : 8);
        c(this.f9436a, coachMotion);
    }

    private void c(View view, final CoachMotion coachMotion) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.CoachActionViewHolder.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                CoachActionViewHolder.this.e(coachMotion);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(CoachMotion coachMotion) {
        this.f9438c.setVisibility(0);
        this.f9438c.d(UnitUtil.e(coachMotion.getCurrMotionNum() + 1, 1, 0), UnitUtil.e(this.f9437b, 1, 0));
        this.f9438c.getNextAction().setVisibility(8);
        this.f9438c.getPreAction().setVisibility(8);
        ArrayList arrayList = new ArrayList(10);
        Motion motion = coachMotion.getMotion();
        arrayList.clear();
        arrayList.add(motion);
        if (gzx.e(motion.acquireCovers())) {
            arrayList.add(motion.acquireCovers());
        }
        hiy hiyVar = new hiy(arrayList, R.layout.sug_coach_vp_intro);
        this.f9438c.setAdapter(hiyVar);
        hiyVar.notifyDataSetChanged();
        this.f9438c.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.CoachActionViewHolder.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachActionViewHolder.this.f9438c.setVisibility(4);
            }
        });
    }
}
