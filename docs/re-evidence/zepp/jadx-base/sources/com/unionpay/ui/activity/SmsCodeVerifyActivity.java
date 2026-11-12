package com.unionpay.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.ui.fragment.SmsCodeVerifyFragment;

/* JADX INFO: loaded from: classes18.dex */
public class SmsCodeVerifyActivity extends BaseUnionPayActivity {
    public static final int REQUEST_CODE = 18;

    public static void open(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) SmsCodeVerifyActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("PanId", str);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, 18);
    }

    @Override // com.unionpay.ui.activity.BaseUnionPayActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.wl_sms_code_verify);
        SmsCodeVerifyFragment smsCodeVerifyFragment = new SmsCodeVerifyFragment();
        smsCodeVerifyFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), smsCodeVerifyFragment).commit();
    }
}
