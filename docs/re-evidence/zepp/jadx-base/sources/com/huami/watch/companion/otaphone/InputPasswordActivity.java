package com.huami.watch.companion.otaphone;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.otaphone.service.OtaService;
import com.huami.watch.companion.otaphone.service.OtaTransportCmd;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class InputPasswordActivity extends Activity {
    public static final String BROADCAST_RESULT = "com.huai.watch.otaphone.broadcastresult";
    public static final String BROADCAST_SSID = "com.huai.watch.otaphone.broadcastssid";
    public static final String CANCEL_WIFI_ACTION = "com.huai.watch.otaphone.cancelwifi";
    private static final String h = "InputPasswordActivity";
    private static final int i = 0;
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = 4;
    private static String n;
    private EditText a;
    private View b;
    private Context c;
    private Handler d;
    private WifiBroadReceiver e;
    private OtaTransportCmd f;
    private TextWatcher g = new a();

    public class WifiBroadReceiver extends BroadcastReceiver {
        public WifiBroadReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (InputPasswordActivity.CANCEL_WIFI_ACTION.equals(intent.getAction())) {
                InputPasswordActivity.this.finish();
                return;
            }
            int intExtra = intent.getIntExtra(OtaService.INTENT_WIFI_CONNECT_RESULT, 0);
            Log.d(InputPasswordActivity.h, " onReceive result = " + intExtra, new Object[0]);
            if (intExtra == 1) {
                InputPasswordActivity.this.d.obtainMessage(3).sendToTarget();
            } else if (intExtra != 2) {
                InputPasswordActivity.this.d.obtainMessage(0).sendToTarget();
            } else {
                InputPasswordActivity.this.d.obtainMessage(2).sendToTarget();
            }
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            long jG = InputPasswordActivity.this.g();
            if (jG == 0 && InputPasswordActivity.this.b.isEnabled()) {
                InputPasswordActivity.this.b.setEnabled(false);
            } else {
                if (jG < 0 || InputPasswordActivity.this.b.isEnabled()) {
                    return;
                }
                InputPasswordActivity.this.b.setEnabled(true);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class b extends Handler {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(AlertDialogFragment alertDialogFragment, View view) {
            alertDialogFragment.dismiss();
            Log.d(InputPasswordActivity.h, "dissmiss current activity", new Object[0]);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Log.d(InputPasswordActivity.h, " WifiAuthHandler handle = " + message.what, new Object[0]);
            int i = message.what;
            if (i == 0) {
                InputPasswordActivity.this.finish();
                return;
            }
            if (i == 1) {
                InputPasswordActivity inputPasswordActivity = InputPasswordActivity.this;
                Toast.makeText(inputPasswordActivity, inputPasswordActivity.getString(R.string.auth_password), 0).show();
                return;
            }
            if (i == 2) {
                InputPasswordActivity inputPasswordActivity2 = InputPasswordActivity.this;
                Toast.makeText(inputPasswordActivity2, inputPasswordActivity2.getString(R.string.wifi_connected), 0).show();
                InputPasswordActivity.this.finish();
                return;
            }
            if (i == 3) {
                final AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(1);
                alertDialogFragmentNewInstance.setMessage(String.format(InputPasswordActivity.this.getResources().getString(R.string.password_error), InputPasswordActivity.n));
                alertDialogFragmentNewInstance.setNeutral(InputPasswordActivity.this.getString(R.string.btn_known), new View.OnClickListener() { // from class: com.huami.watch.companion.otaphone.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InputPasswordActivity.b.c(alertDialogFragmentNewInstance, view);
                    }
                });
                alertDialogFragmentNewInstance.setCancelable(false);
                alertDialogFragmentNewInstance.show(InputPasswordActivity.this.getFragmentManager(), "PopUpDialog");
                return;
            }
            if (i != 4) {
                return;
            }
            final AlertDialogFragment alertDialogFragmentNewInstance2 = AlertDialogFragment.newInstance(1);
            alertDialogFragmentNewInstance2.setMessage(InputPasswordActivity.this.getResources().getString(R.string.watch_disconnect));
            alertDialogFragmentNewInstance2.setNeutral(InputPasswordActivity.this.getString(R.string.btn_enter), new View.OnClickListener() { // from class: com.huami.watch.companion.otaphone.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    alertDialogFragmentNewInstance2.dismiss();
                }
            });
            alertDialogFragmentNewInstance2.setCancelable(false);
            try {
                alertDialogFragmentNewInstance2.show(InputPasswordActivity.this.getFragmentManager(), "PopUpDialog");
            } catch (Exception e) {
                Log.e(InputPasswordActivity.h, "ShowDisconnectDialog Error!!", e, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long g() {
        return this.a.getText().toString().length();
    }

    private void h(Intent intent) {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.wifi_pwd_actionbar);
        actionbarLayout.setTitleText(getResources().getString(R.string.input_wifi_pwd_title));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: mf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(view);
            }
        });
        View viewFindViewById = findViewById(R.id.button_submit);
        this.b = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: nf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
        this.b.setEnabled(false);
        TextView textView = (TextView) findViewById(R.id.textview_ssid);
        n = intent.getStringExtra(OtaService.INTENT_WIFI_SSID);
        Log.e(h, " Activity ssid = " + n, new Object[0]);
        textView.setText(getResources().getString(R.string.link) + " " + n);
        EditText editText = (EditText) findViewById(R.id.edit_text_password);
        this.a = editText;
        editText.addTextChangedListener(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        Log.e(h, " input password = " + ((Object) this.a.getText()), new Object[0]);
        String string = this.a.getText().toString();
        finish();
        if (this.f == null) {
            this.f = OtaTransportCmd.getInstance(this.c);
        }
        if (!this.f.isConnected()) {
            this.d.obtainMessage(4).sendToTarget();
        } else {
            this.f.cmdSendPassword(n, string);
            finish();
        }
    }

    private void k() {
        if (this.f == null) {
            this.f = OtaTransportCmd.getInstance(this.c);
        }
        if (this.f.isConnected()) {
            this.f.cmdCancePasswordInput();
        } else {
            this.d.obtainMessage(4).sendToTarget();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifi_password);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        this.c = this;
        this.d = new b();
        this.e = new WifiBroadReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BROADCAST_SSID);
        intentFilter.addAction(BROADCAST_RESULT);
        intentFilter.addAction(CANCEL_WIFI_ACTION);
        registerReceiver(this.e, intentFilter);
        this.f = OtaTransportCmd.getInstance(this.c);
        ((CompanionApplication) getApplication()).setPasswordActivity(this);
        h(getIntent());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.e);
        this.f = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i2, keyEvent);
        }
        k();
        return true;
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.d == null) {
            this.d = new b();
        }
        if (this.f == null) {
            this.f = OtaTransportCmd.getInstance(this.c);
        }
        h(intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        Analytics.endSession(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
    }
}
