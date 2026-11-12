package com.xiaomi.hm.health.bodyfat.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.event.EventCloseWeightMeasureFailure;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes19.dex */
public class MeasureFailureActivity extends BaseTitleActivity implements View.OnClickListener {
    private void initView() {
        ((TextView) findViewById(R.id.know_btn_tv)).setOnClickListener(this);
        if (HMWeightUtils.isAmazfitScale()) {
            ((TextView) findViewById(R.id.text_fail1)).setText(R.string.weight_babyfat_measure_failure_hint1_new);
            ((ImageView) findViewById(R.id.iv_help)).setImageResource(R.drawable.bodyfat_iamge_measure_help);
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        EventBus.getDefault().post(new EventCloseWeightMeasureFailure());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.know_btn_tv) {
            finish();
            EventBus.getDefault().post(new EventCloseWeightMeasureFailure());
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_measure_failure);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(getApplicationContext(), R.color.measure_failed_background), true);
        initView();
    }
}
