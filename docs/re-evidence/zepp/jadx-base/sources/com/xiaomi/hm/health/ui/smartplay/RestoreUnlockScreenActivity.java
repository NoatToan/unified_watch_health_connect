package com.xiaomi.hm.health.ui.smartplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.mifit.analytics.Analytics;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;

/* JADX INFO: loaded from: classes22.dex */
public class RestoreUnlockScreenActivity extends BaseTitleActivity implements View.OnClickListener {
    private void initView() {
        TextView textView = (TextView) findViewById(R.id.left_btn);
        TextView textView2 = (TextView) findViewById(R.id.right_btn);
        textView.setText(R.string.cancel);
        textView2.setText(R.string.restore);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
    }

    private void l() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        hMPersonInfo.getMiliConfig().setScreenLock(0);
        hMPersonInfo.saveInfo(2);
        HMAccountWebExtAPI.updateProfile();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.left_btn) {
            Analytics.event(this, StatEvent.BIND_SCREEN_LOCK_RESTORE_OUT, StatEvent.BIND_SCREEN_LOCK_RESTORE_OUT_UNRESTORE);
            finish();
        } else if (id == R.id.right_btn) {
            startActivity(new Intent(this, (Class<?>) ScreenUnlockActivity.class));
            Analytics.event(this, StatEvent.BIND_SCREEN_LOCK_RESTORE_OUT, StatEvent.BIND_SCREEN_LOCK_RESTORE_OUT_RESTORE);
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restore_unlock_screen);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        initView();
        l();
    }
}
