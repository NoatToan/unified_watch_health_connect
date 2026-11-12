package com.huami.watch.companion.wifi;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.otaphone.service.OtaTransportCmd;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.watch.wifi.WifiTransportHandler;
import com.huami.watch.wifi.WifiTypeInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AddWifiActivity extends Activity {
    public static final int EAP = 3;
    public static final int EAP_TYPE_AKA = 5;
    public static final int EAP_TYPE_NONE = -1;
    public static final int EAP_TYPE_PEAP = 0;
    public static final int EAP_TYPE_PWD = 3;
    public static final int EAP_TYPE_SIM = 4;
    public static final int EAP_TYPE_TLS = 1;
    public static final int EAP_TYPE_TTLS = 2;
    public static final int NONE = 0;
    public static final int UNKNOWN = -1;
    public static final int VERIFY_TYPE_GTC = 4;
    public static final int VERIFY_TYPE_MSCHAP = 2;
    public static final int VERIFY_TYPE_MSCHAPV2 = 3;
    public static final int VERIFY_TYPE_NONE = 0;
    public static final int VERIFY_TYPE_PAP = 1;
    public static final int WEP = 1;
    public static final int WPA = 2;
    private static final String k = "AddWifiActivity";
    private static final int l = 0;
    private static final int m = 1;
    private static final String n = "com.huami.watch.otaservice";
    private AlertDialogFragment c;
    private Context g;
    private Fragment h;
    private EditText i;
    private OtaTransportCmd j;
    private boolean a = true;
    private Handler b = new e();
    private int d = -1;
    private int e = -1;
    private int f = 0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AddWifiActivity.this.m();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WifiTypeInfo wifiTypeInfo = new WifiTypeInfo();
            wifiTypeInfo.ssid = AddWifiActivity.this.i.getText().toString();
            int i = AddWifiActivity.this.d;
            if (i == -1 || i == 0) {
                wifiTypeInfo.ssidType = 0;
            } else if (i == 1) {
                wifiTypeInfo.ssidType = 1;
                if (AddWifiActivity.this.h != null && (AddWifiActivity.this.h instanceof WifiPasswordInputFragment)) {
                    WifiPasswordInputFragment wifiPasswordInputFragment = (WifiPasswordInputFragment) AddWifiActivity.this.h;
                    Log.i(AddWifiActivity.k, "wep get wifi password: " + wifiPasswordInputFragment.getPassword(), new Object[0]);
                    wifiTypeInfo.password = wifiPasswordInputFragment.getPassword();
                }
            } else if (i == 2) {
                wifiTypeInfo.ssidType = 2;
                if (AddWifiActivity.this.h == null || !(AddWifiActivity.this.h instanceof WifiPasswordInputFragment)) {
                    AddWifiActivity.this.b.obtainMessage(1).sendToTarget();
                } else {
                    WifiPasswordInputFragment wifiPasswordInputFragment2 = (WifiPasswordInputFragment) AddWifiActivity.this.h;
                    Log.i(AddWifiActivity.k, "wpa get wifi password: " + wifiPasswordInputFragment2.getPassword(), new Object[0]);
                    wifiTypeInfo.password = wifiPasswordInputFragment2.getPassword();
                }
            } else if (i == 3) {
                wifiTypeInfo.ssidType = 3;
                if (!(AddWifiActivity.this.h instanceof EAPWifiFragment)) {
                    Log.e(AddWifiActivity.k, "EAP fragment not match!", new Object[0]);
                    AddWifiActivity.this.b.obtainMessage(1).sendToTarget();
                }
                WifiTypeInfo wifiTypeInfoCollectUserInputInfo = ((EAPWifiFragment) AddWifiActivity.this.h).collectUserInputInfo();
                if (wifiTypeInfoCollectUserInputInfo != null) {
                    wifiTypeInfo.eapType = wifiTypeInfoCollectUserInputInfo.eapType;
                    wifiTypeInfo.phase2Type = wifiTypeInfoCollectUserInputInfo.phase2Type;
                    wifiTypeInfo.id = wifiTypeInfoCollectUserInputInfo.id;
                    wifiTypeInfo.anonymousId = wifiTypeInfoCollectUserInputInfo.anonymousId;
                    wifiTypeInfo.password = wifiTypeInfoCollectUserInputInfo.password;
                } else {
                    AddWifiActivity.this.b.obtainMessage(1).sendToTarget();
                }
            }
            if (AddWifiActivity.this.j == null) {
                AddWifiActivity addWifiActivity = AddWifiActivity.this;
                addWifiActivity.j = OtaTransportCmd.getInstance(addWifiActivity.g);
            }
            if (AddWifiActivity.this.j.isConnected()) {
                Log.e(AddWifiActivity.k, "channel connect info " + wifiTypeInfo.toString(), new Object[0]);
                AddWifiActivity.this.j.cmdSendHidenWifi(wifiTypeInfo);
                AddWifiActivity.this.finish();
            } else {
                Log.e(AddWifiActivity.k, "channel disconnect Error!!", new Object[0]);
                AddWifiActivity.this.b.obtainMessage(0).sendToTarget();
            }
            Log.e(AddWifiActivity.k, "wifi info " + wifiTypeInfo.toString(), new Object[0]);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AddWifiActivity.this.l();
            AddWifiActivity.this.n();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AddWifiActivity.this.c.dismissAllowingStateLoss();
        }
    }

    public class e extends Handler {

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

        public class b implements View.OnClickListener {
            public final /* synthetic */ AlertDialogFragment a;

            public b(AlertDialogFragment alertDialogFragment) {
                this.a = alertDialogFragment;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.a.dismiss();
            }
        }

        public e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Log.d(AddWifiActivity.k, " WifiAddHandler handle = " + message.what, new Object[0]);
            int i = message.what;
            if (i == 0) {
                AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(1);
                alertDialogFragmentNewInstance.setMessage(AddWifiActivity.this.getResources().getString(R.string.watch_disconnect));
                alertDialogFragmentNewInstance.setNeutral(AddWifiActivity.this.getString(R.string.btn_enter), new a(alertDialogFragmentNewInstance));
                alertDialogFragmentNewInstance.setCancelable(false);
                try {
                    alertDialogFragmentNewInstance.show(AddWifiActivity.this.getFragmentManager(), "PopUpDialog");
                    return;
                } catch (Exception e) {
                    Log.e(AddWifiActivity.k, "ShowDisconnectDialog Error!!", e, new Object[0]);
                    return;
                }
            }
            if (i != 1) {
                return;
            }
            AlertDialogFragment alertDialogFragmentNewInstance2 = AlertDialogFragment.newInstance(1);
            alertDialogFragmentNewInstance2.setMessage(AddWifiActivity.this.getResources().getString(R.string.wifi_input_error));
            alertDialogFragmentNewInstance2.setNeutral(AddWifiActivity.this.getString(R.string.btn_enter), new b(alertDialogFragmentNewInstance2));
            alertDialogFragmentNewInstance2.setCancelable(false);
            try {
                alertDialogFragmentNewInstance2.show(AddWifiActivity.this.getFragmentManager(), "PopUpDialog");
            } catch (Exception e2) {
                Log.e(AddWifiActivity.k, "ShowDisconnectDialog Error!!", e2, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        View currentFocus;
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (!inputMethodManager.isActive() || (currentFocus = getCurrentFocus()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.j == null) {
            this.j = OtaTransportCmd.getInstance(this.g);
        }
        if (this.j.isConnected()) {
            this.j.cmdCancelWifiAdd();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.c = AlertDialogFragment.newInstance(6);
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        this.c.setContent(new EncodeTypeSettingFragment());
        this.c.setNeutral(getString(R.string.btn_cancel), new d());
        this.c.show(fragmentTransactionBeginTransaction, "Encode setting");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_wifi);
        this.g = this;
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        ((CompanionApplication) getApplication()).setWifiActivity(this);
        this.j = OtaTransportCmd.getInstance(this.g);
        String stringExtra = getIntent().getStringExtra(WifiTransportHandler.SSID_VALUE);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.add_wifi));
        actionbarLayout.setBackArrowClickListener(new a());
        findViewById(R.id.image_commit).setOnClickListener(new b());
        this.i = (EditText) findViewById(R.id.wifi_name_edit_box);
        findViewById(R.id.set_encode_type).setOnClickListener(new c());
        if (stringExtra != null) {
            setEncodeType(3);
            this.i.setText(stringExtra);
            this.i.setEnabled(false);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.j = null;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        m();
        return true;
    }

    public void setEAPType(int i) {
        Fragment fragment = this.h;
        if (fragment instanceof EAPWifiFragment) {
            ((EAPWifiFragment) fragment).onTypeSelected(i);
            this.e = i;
        }
    }

    public void setEncodeType(int i) {
        TextView textView = (TextView) findViewById(R.id.encode_type_result);
        int i2 = R.id.wifi_type_container;
        View viewFindViewById = findViewById(i2);
        if (i == -1) {
            this.d = -1;
            this.h = null;
            viewFindViewById.setVisibility(8);
        } else if (i == 0) {
            this.d = 0;
            textView.setText(getString(R.string.encode_type_none));
            this.h = null;
            viewFindViewById.setVisibility(8);
        } else if (i == 1) {
            this.d = 1;
            textView.setText(getString(R.string.encode_type_wep));
            viewFindViewById.setVisibility(0);
            WifiPasswordInputFragment wifiPasswordInputFragment = new WifiPasswordInputFragment();
            getFragmentManager().beginTransaction().replace(i2, wifiPasswordInputFragment).commit();
            this.h = wifiPasswordInputFragment;
        } else if (i == 2) {
            this.d = 2;
            textView.setText(getString(R.string.encode_type_wpa));
            viewFindViewById.setVisibility(0);
            WifiPasswordInputFragment wifiPasswordInputFragment2 = new WifiPasswordInputFragment();
            getFragmentManager().beginTransaction().replace(i2, wifiPasswordInputFragment2).commit();
            this.h = wifiPasswordInputFragment2;
        } else if (i == 3) {
            this.d = 3;
            textView.setText(getString(R.string.encode_type_eap));
            viewFindViewById.setVisibility(0);
            EAPWifiFragment eAPWifiFragment = new EAPWifiFragment();
            getFragmentManager().beginTransaction().replace(i2, eAPWifiFragment).commit();
            this.h = eAPWifiFragment;
        }
        AlertDialogFragment alertDialogFragment = this.c;
        if (alertDialogFragment != null) {
            alertDialogFragment.dismissAllowingStateLoss();
        }
    }

    public void setVerifyType(int i) {
        Fragment fragment = this.h;
        if (fragment instanceof EAPWifiFragment) {
            ((EAPWifiFragment) fragment).onVerifyTypeSelected(i);
            this.f = i;
        }
    }
}
