package com.xiaomi.hm.health.bodyfat.activity;

import android.os.Bundle;
import android.view.View;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;

/* JADX INFO: loaded from: classes19.dex */
public class BodyFat2TestActivity extends BaseTitleActivity implements View.OnClickListener {
    private void initView() {
        findViewById(R.id.tx_guest_mode).setOnClickListener(this);
        findViewById(R.id.tx_one_foot).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tx_guest_mode) {
            AddGuestActivity.INSTANCE.startMe(this, 2);
        } else if (id == R.id.tx_one_foot) {
            WeightConnectActivity.startMe(this, false);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_bodyfat2_test);
        BFTitleStyleKt.setUnifyTitleStyle(this, null, null);
        initView();
    }
}
