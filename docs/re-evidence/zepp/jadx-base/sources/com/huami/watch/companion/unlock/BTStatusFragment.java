package com.huami.watch.companion.unlock;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.unlock.BTStatusFragment;
import com.huami.watch.companion.util.HelpUtil;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class BTStatusFragment extends Fragment {
    private static final String f = "BTStatusFragment";
    private static final int g = 120000;
    private static final int h = 0;
    private static final int i = 8193;
    private TipComponent a;
    private Disposable b;
    private BLEStatueListener c;
    private BroadcastReceiver d;
    private Handler e = null;

    public interface BLEStatueListener {
        CharSequence getUnbindStr();

        void onVisibleChange(boolean z);

        TopTips setTopTips();
    }

    public static class TopTips {
        private boolean a;
        private String b;

        public TopTips(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public class a implements Consumer<Object> {
        public a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(@NonNull Object obj) throws Exception {
            Log.d(BTStatusFragment.f, "Event : " + obj, new Object[0]);
            if (obj instanceof ConnectedEvent) {
                BTStatusFragment.this.onConnected();
            } else if (obj instanceof DisconnectedEvent) {
                BTStatusFragment.this.onDisconnected();
            }
        }
    }

    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            BTStatusFragment.this.r();
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra == 12) {
                    BTStatusFragment.this.onBluetoothStateChange(true);
                } else if (intExtra == 10) {
                    BTStatusFragment.this.onBluetoothStateChange(false);
                }
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BTStatusFragment.enableBluetooth(BTStatusFragment.this.getActivity());
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BTStatusFragment.this.q(false);
            BTStatusFragment.this.a.setVisibility(8);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HelpUtil.toHelpPage(BTStatusFragment.this.getActivity(), 4);
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BTStatusFragment.this.showConnecting();
        }
    }

    public static BTStatusFragment create(int i2, FragmentTransaction fragmentTransaction) {
        BTStatusFragment bTStatusFragmentNewInstance = newInstance();
        fragmentTransaction.replace(i2, bTStatusFragmentNewInstance);
        fragmentTransaction.commit();
        return bTStatusFragmentNewInstance;
    }

    public static boolean enableBluetooth(Activity activity) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || defaultAdapter.isEnabled()) {
            return true;
        }
        activity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), i);
        return false;
    }

    private boolean i() {
        return this.c.setTopTips().a;
    }

    public static boolean isBluetoothOn() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    private boolean j() {
        return !DeviceManager.getManager(getActivity()).hasBoundDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Throwable th) throws Exception {
        HMLog.warn(f, th, new Function0() { // from class: ll
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BTStatusFragment.k();
            }
        });
    }

    private void m() {
        this.d = new c();
        getActivity().registerReceiver(this.d, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    private void n() {
        Handler handler = this.e;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    public static BTStatusFragment newInstance() {
        BTStatusFragment bTStatusFragment = new BTStatusFragment();
        bTStatusFragment.setArguments(new Bundle());
        return bTStatusFragment;
    }

    private void o() {
        Handler handler = this.e;
        if (handler == null || handler.hasMessages(0)) {
            return;
        }
        Message message = new Message();
        message.what = 0;
        this.e.sendMessageDelayed(message, 120000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConnected() {
        showSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDisconnected() {
        if (!isBluetoothOn()) {
            showOpenBLE();
        } else if (j()) {
            showUnbind();
        } else {
            if (isConnected()) {
                return;
            }
            showConnecting();
        }
    }

    private void onUnbound() {
        showUnbind();
    }

    private void p(CharSequence charSequence) {
        if (this.a != null) {
            q(true);
            this.a.setVisibility(0);
            this.a.stopLoading();
            this.a.clear();
            this.a.setTitle(charSequence);
            this.a.postDelayed(new e(), 1500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(boolean z) {
        if (this.c != null) {
            if ((!z || this.a.getVisibility() == 0) && (z || this.a.getVisibility() == 8)) {
                return;
            }
            this.c.onVisibleChange(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        setFailed(R.string.watch_connect_fail, R.string.click_tolook_for_help, R.string.retry, new f(), new g());
    }

    private void s(int i2) {
        t(getString(i2));
    }

    private void t(CharSequence charSequence) {
        if (this.a != null) {
            q(true);
            this.a.setVisibility(0);
            this.a.clear();
            this.a.setTitle(charSequence);
            this.a.startLoading();
        }
    }

    public boolean isConnected() {
        return DeviceManager.getManager(getActivity()).isBoundDeviceConnected();
    }

    public void onBluetoothStateChange(boolean z) {
        if (i()) {
            showMIUITips();
            return;
        }
        if (j()) {
            showUnbind();
        } else if (z) {
            showConnecting();
        } else {
            showOpenBLE();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.b = RxBus.get().toObservable().subscribe(new a(), new Consumer() { // from class: dl
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BTStatusFragment.l((Throwable) obj);
            }
        });
        this.e = new b();
        m();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TipComponent tipComponent = new TipComponent(getActivity());
        this.a = tipComponent;
        tipComponent.setVisibility(8);
        return this.a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        TipComponent tipComponent = this.a;
        if (tipComponent != null) {
            tipComponent.stopLoading();
        }
        Disposable disposable = this.b;
        if (disposable != null) {
            disposable.dispose();
            this.b = null;
        }
        Handler handler = this.e;
        if (handler != null) {
            handler.removeMessages(0);
            this.e = null;
        }
        getActivity().unregisterReceiver(this.d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Analytics.endSession(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Analytics.startSession(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Objects.requireNonNull(this.c, "BLEStatueListener is null, you must call setBLEStatusListener()");
        if (i()) {
            showMIUITips();
            return;
        }
        if (!isBluetoothOn()) {
            showOpenBLE();
        } else if (j()) {
            showUnbind();
        } else {
            if (isConnected()) {
                return;
            }
            showConnecting();
        }
    }

    public void setBLEStatusListener(BLEStatueListener bLEStatueListener) {
        if (bLEStatueListener != null) {
            this.c = bLEStatueListener;
        }
    }

    public void setFailed(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        if (this.a != null) {
            q(true);
            this.a.setVisibility(0);
            this.a.stopLoading();
            this.a.clear();
            this.a.setIcon(R.drawable.unlock_icon_link);
            this.a.setTitle(charSequence);
            this.a.setButton(charSequence2, onClickListener);
        }
    }

    public void setSuccess(int i2) {
        p(getString(i2));
    }

    public void setWarning(CharSequence charSequence) {
        if (this.a != null) {
            q(true);
            this.a.setVisibility(0);
            this.a.clear();
            this.a.setTitle(charSequence);
        }
    }

    public void showConnecting() {
        s(R.string.device_tip_connecting);
        o();
    }

    public void showMIUITips() {
        setWarning(this.c.setTopTips().b);
    }

    public void showOpenBLE() {
        setFailed(R.string.device_tip_ble_not_open, R.string.device_tip_bt_open, R.drawable.unlock_icon_bluetooth, new d());
    }

    public void showSuccess() {
        setSuccess(R.string.device_tip_connect_succeed);
        n();
    }

    public void showUnbind() {
        BLEStatueListener bLEStatueListener = this.c;
        if (bLEStatueListener == null || TextUtils.isEmpty(bLEStatueListener.getUnbindStr())) {
            return;
        }
        setWarning(this.c.getUnbindStr());
    }

    public void setFailed(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (this.a != null) {
            q(true);
            this.a.setVisibility(0);
            this.a.stopLoading();
            this.a.clear();
            this.a.setIcon(R.drawable.unlock_icon_link);
            this.a.setTitle(charSequence);
            this.a.setSubTitle(charSequence2);
            this.a.setOnClickListener(onClickListener);
            this.a.setButton(charSequence3, onClickListener2);
        }
    }

    public void setFailed(CharSequence charSequence, CharSequence charSequence2, int i2, View.OnClickListener onClickListener) {
        if (this.a != null) {
            q(true);
            this.a.setVisibility(0);
            this.a.stopLoading();
            this.a.clear();
            this.a.setIcon(i2);
            this.a.setTitle(charSequence);
            this.a.setButton(charSequence2, onClickListener);
        }
    }

    public void setFailed(int i2, int i3, int i4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        setFailed(getString(i2), getString(i3), getString(i4), onClickListener, onClickListener2);
    }

    public void setFailed(int i2, int i3, View.OnClickListener onClickListener) {
        setFailed(getString(i2), getString(i3), onClickListener);
    }

    public void setFailed(int i2, int i3, int i4, View.OnClickListener onClickListener) {
        setFailed(getString(i2), getString(i3), i4, onClickListener);
    }
}
