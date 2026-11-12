package com.xiaomi.hm.health.training.ui.activity;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.weightfigure.WeightFigureView;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.activity.MaxHrRemindHelpActivity;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public class MaxHrRemindHelpActivity extends BaseTitleActivity {
    private WeightFigureView x;

    private void findViews() {
        this.x = (WeightFigureView) $(R.id.hr_section_view);
    }

    private int m() {
        return TrainerInfo.get().age;
    }

    private void n() {
        WeightFigureView weightFigureView = this.x;
        weightFigureView.setLabelTextSize(12.0f);
        weightFigureView.setScaleTextSize(12.0f);
        weightFigureView.setScaleTextColor(ContextCompat.getColor(this, R.color.s2));
        weightFigureView.requestLayout();
        weightFigureView.setType(1);
        weightFigureView.hideThumb(true);
        weightFigureView.setLanguageNormal(Language.isChinese() || Language.isEnglish());
        ViewGroup.LayoutParams layoutParams = weightFigureView.getLayoutParams();
        layoutParams.height = -2;
        weightFigureView.setLayoutParams(layoutParams);
        float fM = 220 - m();
        float[] fArr = {0.0f, 0.6f * fM, 0.7f * fM, 0.8f * fM, 0.9f * fM, fM * 1.0f};
        int[] iArr = {ContextCompat.getColor(this, R.color.hr_tape_warm_up), ContextCompat.getColor(this, R.color.hr_tape_fat_burn), ContextCompat.getColor(this, R.color.hr_tape_lung_strength), ContextCompat.getColor(this, R.color.hr_tape_stamina_strength), ContextCompat.getColor(this, R.color.hr_tape_anaerobic_limit)};
        weightFigureView.setValues(fArr, iArr, getResources().getStringArray(R.array.hr_sport_new), iArr);
        weightFigureView.setListener(new Function1() { // from class: mv4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MaxHrRemindHelpActivity.o((Float) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(Float f) {
        return f.intValue() + "";
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Language.isSpainish()) {
            getTitleTextView().setTextSize(12.0f);
        }
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s38), getString(R.string.title_what_is_max_hr_remind), true);
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.s1));
        setContentView(R.layout.activity_max_hr_remind_help);
        findViews();
        n();
    }
}
