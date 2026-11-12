package com.huami.watch.companion.ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.huami.watch.companion.R;
import com.huami.watch.companion.account.AccountMiTokenUtil;
import com.huami.watch.companion.account.IDeviceTokenManager;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.ui.dialog.AlertDialog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class BindMiActivity extends BaseActivity {
    private static final String c = "deviceSource";
    private static final String d = "sn";
    private IDeviceTokenManager b = (IDeviceTokenManager) KoinJavaComponent.inject(IDeviceTokenManager.class).getValue();

    private HMDeviceSource e() {
        return HMDeviceSource.fromValue(getIntent().getIntExtra("deviceSource", -1));
    }

    private String f() {
        return getIntent().getStringExtra("sn");
    }

    private boolean g() {
        return (TextUtils.isEmpty(getIntent().getStringExtra("deviceSource")) || TextUtils.isEmpty(getIntent().getStringExtra("sn"))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(DialogInterface dialogInterface, int i) {
        if (g()) {
            this.b.clearToken(e(), f());
        } else {
            AccountMiTokenUtil.clearMiToken();
            AccountMiTokenUtil.broadcastMiAuthState(this, false);
        }
        Toast.makeText(this, getString(R.string.already_cancel_author), 0).show();
        finish();
    }

    private void initView() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.action_bar);
        TextView textView = (TextView) findViewById(R.id.tv_author);
        int i = R.string.already_author;
        int i2 = R.string.mi_account;
        textView.setText(getString(i, new Object[]{getString(i2)}));
        actionbarLayout.setTitleText(getString(R.string.author_lvmi, new Object[]{getString(i2)}));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: rw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
    }

    public static void start(Context context, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) BindMiActivity.class);
        intent.putExtra("deviceSource", i);
        intent.putExtra("sn", str);
        context.startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bind_mi);
        initView();
    }

    public void unbindAuthor(View view) {
        AlertDialog.setTitle(getString(R.string.cancel_author_title)).setMessage(getString(R.string.cancel_author_mi_msg)).setNegativeBtn(getString(R.string.restore_no)).setPositiveBtn(getString(R.string.dialog_confirm), new DialogInterface.OnClickListener() { // from class: qw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.i(dialogInterface, i);
            }
        }).show(getFragmentManager(), "confirm");
    }
}
