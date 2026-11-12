package com.huami.watch.companion.initial;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.bind.BindHelper;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.NetworkUtil;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;

/* JADX INFO: loaded from: classes16.dex */
public class InitialBluetoothNetworkTipActivity extends AppCompatActivity {
    public static final String MSG = "huami.watch.message";
    public static final String MSG_BLUETOOTH_UNAVAILABLE = "message.bluetooth.unavailable";
    public static final String MSG_NETWORK_UNAVAILABLE = "message.network.unavailable";
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 100;
    private TextView a;
    private View b;
    private String c;
    private BroadcastReceiver e;
    private Handler d = null;
    public View.OnClickListener f = new c();
    public View.OnClickListener g = new d();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BindHelper.getHelper().notifyStateChanged(-2);
            InitialState.setInitialled(true);
            InitialBluetoothNetworkTipActivity.this.finish();
        }
    }

    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                InitialBluetoothNetworkTipActivity.this.h();
            } else if (i == 2) {
                InitialBluetoothNetworkTipActivity.this.i();
            }
            super.handleMessage(message);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.v("yl", "bluetooth button clicked");
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                InitialBluetoothNetworkTipActivity initialBluetoothNetworkTipActivity = InitialBluetoothNetworkTipActivity.this;
                Toast.makeText(initialBluetoothNetworkTipActivity, initialBluetoothNetworkTipActivity.getString(R.string.bluetooth_not_detected), 0).show();
                InitialBluetoothNetworkTipActivity.this.finish();
            }
            if (defaultAdapter.isEnabled()) {
                Log.v("yl", "bluetooth button already on");
            } else {
                InitialBluetoothNetworkTipActivity.this.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 100);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NetworkUtil.isOnline(InitialBluetoothNetworkTipActivity.this)) {
                InitialBluetoothNetworkTipActivity.this.h();
            } else {
                new AlertDialogFragment.Builder(InitialBluetoothNetworkTipActivity.this).setMessage(R.string.no_network_plz_retry).setNeutralButton(R.string.btn_known, new DialogInterface.OnClickListener() { // from class: com.huami.watch.companion.initial.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).show(InitialBluetoothNetworkTipActivity.this.getSupportFragmentManager());
            }
        }
    }

    public class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 12) {
                InitialBluetoothNetworkTipActivity.this.d.obtainMessage(1).sendToTarget();
            }
        }
    }

    public class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION)) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                if (networkInfo.isConnected() || networkInfo2.isConnected()) {
                    InitialBluetoothNetworkTipActivity.this.d.obtainMessage(2).sendToTarget();
                }
            }
        }
    }

    private void f() {
        this.e = new e();
        registerReceiver(this.e, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    private void g() {
        this.e = new f();
        registerReceiver(this.e, new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (InitialState.isBluetoothOn()) {
            setResult(-1);
        } else {
            InitialState.toBluetoothOnTip(this);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (NetworkUtil.isOnline(this)) {
            setResult(-1);
        } else {
            InitialState.toNetworkUnavailable(this);
        }
        finish();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BindHelper.getHelper().notifyStateChanged(-2);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        this.c = getIntent().getStringExtra(MSG);
        setContentView(R.layout.activity_bluetooth_network_verify);
        DeviceCompatibility.setStatusBarDarkMode(this, !RainbowUtils.isDarkMode(this), R.color.s38);
        int i2 = R.id.button_text;
        this.a = (TextView) findViewById(i2);
        View viewFindViewById = findViewById(R.id.bind_later);
        this.b = viewFindViewById;
        viewFindViewById.setOnClickListener(new a());
        this.d = new b();
        if (!this.c.equals(MSG_BLUETOOTH_UNAVAILABLE)) {
            if (this.c.equals(MSG_NETWORK_UNAVAILABLE)) {
                ((TextView) findViewById(R.id.title_text)).setText(R.string.plz_keep_phone_online);
                ((ImageView) findViewById(R.id.button_icon)).setImageResource(R.drawable.binding_btn_wifi);
                ((TextView) findViewById(i2)).setText(R.string.retry);
                ((TextView) findViewById(R.id.tip_text)).setText(R.string.plz_retry_after_connect_network);
                this.a.setOnClickListener(this.g);
                return;
            }
            return;
        }
        f();
        this.a.setOnClickListener(this.f);
        if (I18nUtil.isEn(this)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
            layoutParams.width = (int) TypedValue.applyDimension(1, 128.0f, getResources().getDisplayMetrics());
            this.a.setLayoutParams(layoutParams);
            ImageView imageView = (ImageView) findViewById(R.id.img_circle);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.width = (int) TypedValue.applyDimension(1, 209.0f, getResources().getDisplayMetrics());
            layoutParams2.height = (int) TypedValue.applyDimension(1, 209.0f, getResources().getDisplayMetrics());
            imageView.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.e;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
    }
}
