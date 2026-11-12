package com.huami.watch.companion.IME;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class InputEditActivity extends Activity implements IMETransportCmd.callback {
    private static final String g = "InputEditActivity";
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final int k = 3;
    private static Handler l;
    private TextView a;
    private EditText b;
    private View c;
    private IMETransportCmd d;
    private Context e;
    private TextWatcher f = new c();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InputEditActivity.l.obtainMessage(1).sendToTarget();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InputEditActivity.l.obtainMessage(2).sendToTarget();
        }
    }

    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            long jG = InputEditActivity.this.g();
            if (jG == 0 && InputEditActivity.this.c.isEnabled()) {
                InputEditActivity.this.c.setEnabled(false);
            } else {
                if (jG < 0 || InputEditActivity.this.c.isEnabled()) {
                    return;
                }
                InputEditActivity.this.c.setEnabled(true);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class d extends Handler {

        public class a implements View.OnClickListener {
            public final /* synthetic */ AlertDialogFragment a;

            public a(AlertDialogFragment alertDialogFragment) {
                this.a = alertDialogFragment;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.a.dismiss();
            }
        }

        public d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                InputEditActivity.this.finish();
                if (InputEditActivity.this.d != null && InputEditActivity.this.d.isConnected()) {
                    InputEditActivity.this.d.cmdInputCancel();
                    return;
                } else {
                    Log.d(InputEditActivity.g, " disconnect watch", new Object[0]);
                    InputEditActivity.l.obtainMessage(3).sendToTarget();
                    return;
                }
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(1);
                alertDialogFragmentNewInstance.setMessage(InputEditActivity.this.getResources().getString(R.string.watch_disconnect));
                alertDialogFragmentNewInstance.setNeutral(InputEditActivity.this.getString(R.string.btn_enter), new a(alertDialogFragmentNewInstance));
                alertDialogFragmentNewInstance.setCancelable(false);
                try {
                    alertDialogFragmentNewInstance.show(InputEditActivity.this.getFragmentManager(), "PopUpDialog");
                    return;
                } catch (Exception e) {
                    Log.e(InputEditActivity.g, "ShowDisconnectDialog Error!!", e, new Object[0]);
                    return;
                }
            }
            Log.e(InputEditActivity.g, " input msg = " + ((Object) InputEditActivity.this.b.getText()), new Object[0]);
            String string = InputEditActivity.this.b.getText().toString();
            if (InputEditActivity.this.d == null || !InputEditActivity.this.d.isConnected()) {
                InputEditActivity.l.obtainMessage(3).sendToTarget();
            } else {
                InputEditActivity.this.d.cmdSendInputMsg(string);
                InputEditActivity.this.finish();
            }
        }
    }

    private void f(Intent intent) {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.wifi_pwd_actionbar);
        actionbarLayout.setTitleText(getResources().getString(R.string.input_auth_info));
        actionbarLayout.setBackArrowClickListener(new a());
        View viewFindViewById = findViewById(R.id.button_submit);
        this.c = viewFindViewById;
        viewFindViewById.setOnClickListener(new b());
        this.c.setEnabled(false);
        this.a = (TextView) findViewById(R.id.textview_ssid);
        this.a.setText(getResources().getString(R.string.input_wifi_auth_info));
        EditText editText = (EditText) findViewById(R.id.value);
        this.b = editText;
        editText.addTextChangedListener(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long g() {
        return this.b.getText().toString().length();
    }

    @Override // com.huami.watch.companion.IME.IMETransportCmd.callback
    public void dataChannelChanged(boolean z) {
    }

    @Override // com.huami.watch.companion.IME.IMETransportCmd.callback
    public void inputCancel() {
        l.obtainMessage(1).sendToTarget();
    }

    @Override // com.huami.watch.companion.IME.IMETransportCmd.callback
    public void inputMsgReceive(String str) {
    }

    @Override // com.huami.watch.companion.IME.IMETransportCmd.callback
    public void inputRequestReceive() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ime_edit);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        this.e = this;
        l = new d();
        if (this.d == null) {
            this.d = IMETransportCmd.getInstance(this);
        }
        this.d.registerCallback(this);
        f(getIntent());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        IMETransportCmd iMETransportCmd = this.d;
        if (iMETransportCmd != null) {
            iMETransportCmd.unregisterCallback(this);
            this.d = null;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4 && keyEvent.getRepeatCount() == 0) {
            l.obtainMessage(1).sendToTarget();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (l == null) {
            l = new d();
        }
        if (this.d == null) {
            IMETransportCmd iMETransportCmd = IMETransportCmd.getInstance(this.e);
            this.d = iMETransportCmd;
            iMETransportCmd.registerCallback(this);
        }
        f(intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
    }
}
