package com.huami.watch.wififtp;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DeviceUnboundEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.RxBus;
import com.huami.watch.wififtp.FileManagerActivity;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
public class FileManagerActivity extends AppCompatActivity {
    private Disposable a;
    private TextView b;
    private View c;
    private ImageView d;
    private View e;
    private View f;
    private FrameLayout j;
    private final int g = 5105;
    private final int h = 5108;
    private int i = 5105;
    private IWifiFtpListener k = new a();
    private FTPCallbackAdaptor l = new g();

    public class a implements IWifiFtpListener {
        public a() {
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onDeviceConnected() {
            FileManagerActivity.this.q();
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onDeviceDisconnected() {
            FileManagerActivity.this.r();
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onFtpServerStateChanged(int i, @Nullable String str, @Nullable String str2) {
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onWifiApStateChanged(int i) {
        }
    }

    public class b implements Consumer<Object> {
        public b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(@NonNull Object obj) throws Exception {
            if (obj instanceof DisconnectedEvent) {
                if (WifiFtpModule.hasBoundDevice(FileManagerActivity.this)) {
                    FileManagerActivity.this.r();
                }
            } else if (obj instanceof ConnectedEvent) {
                FileManagerActivity.this.q();
            } else if (obj instanceof DeviceUnboundEvent) {
                FileManagerActivity.this.s();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FileManagerActivity.this.f.setVisibility(8);
            FileManagerActivity.this.c.setVisibility(0);
            FileManagerActivity.this.c.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(100L).start();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FileManagerActivity.this.b.setText(FileManagerActivity.this.getString(R.string.file_manager));
            FileManagerActivity.this.b.animate().alpha(1.0f).setDuration(100L).start();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FileManagerActivity.this.c.setVisibility(8);
            FileManagerActivity.this.f.setVisibility(0);
            FileManagerActivity.this.f.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(100L).start();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FileManagerActivity.this.b.setText(FileManagerActivity.this.getString(R.string.file_manager_title_translist));
            FileManagerActivity.this.b.animate().alpha(1.0f).setDuration(100L).start();
        }
    }

    public class g extends FTPCallbackAdaptor {
        public g() {
        }

        @Override // com.huami.watch.wififtp.FTPCallbackAdaptor, com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskAdd(PhoneWifiFtpUtil.TransferTask transferTask) {
            if (!FileManagerActivity.this.d.isEnabled()) {
                FileManagerActivity.this.d.setEnabled(true);
            }
            if (FileManagerActivity.this.f.isEnabled()) {
                return;
            }
            FileManagerActivity.this.f.setEnabled(true);
        }

        @Override // com.huami.watch.wififtp.FTPCallbackAdaptor, com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskRemove(PhoneWifiFtpUtil.TransferTask transferTask) {
            FileManagerActivity.this.m();
        }

        @Override // com.huami.watch.wififtp.FTPCallbackAdaptor, com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskStateChanged(PhoneWifiFtpUtil.TransferTask transferTask) {
            FileManagerActivity.this.m();
        }
    }

    private void initView() {
        this.j = (FrameLayout) findViewById(R.id.file_manager_root);
        TextView textView = (TextView) findViewById(R.id.textview_title);
        this.b = textView;
        textView.setText(getString(R.string.file_manager));
        this.b.setVisibility(0);
        this.c = findViewById(R.id.btn_trans_list_container);
        this.d = (ImageView) findViewById(R.id.btn_trans_list);
        this.e = findViewById(R.id.ftp_new_point);
        this.d.setEnabled(false);
        View viewFindViewById = findViewById(R.id.btn_clear_all);
        this.f = viewFindViewById;
        viewFindViewById.setEnabled(false);
        t(5105);
        PhoneWifiFtpUtil.get().registerFTPCallback(this.l);
        ((FileManagerFragment) getSupportFragmentManager().findFragmentById(R.id.fg_file_explorer)).setAnimationView(this.j, this.d, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        PhoneWifiFtpUtil phoneWifiFtpUtil = PhoneWifiFtpUtil.get();
        if (phoneWifiFtpUtil == null || phoneWifiFtpUtil.getTaskCount() != 0) {
            return;
        }
        if (this.d.isEnabled()) {
            this.d.setEnabled(false);
        }
        if (this.f.isEnabled()) {
            this.f.setEnabled(false);
            this.f.setAlpha(0.5f);
        }
        if (this.e.getVisibility() == 0) {
            this.e.setVisibility(4);
        }
    }

    private void n() {
        this.a = RxBus.get().toObservable().subscribe(new b(), new Consumer() { // from class: d62
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                FileManagerActivity.o((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(Throwable th) throws Exception {
        HMLog.warn("FileManagerActivity", th, new Function0() { // from class: e62
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return FileManagerActivity.p();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (!this.d.isEnabled()) {
            this.d.setEnabled(true);
        }
        if (!this.f.isEnabled()) {
            this.f.setEnabled(true);
        }
        m();
        ((FileManagerFragment) getSupportFragmentManager().findFragmentById(R.id.fg_file_explorer)).onConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        t(5105);
        if (this.d.isEnabled()) {
            this.d.setEnabled(false);
        }
        if (this.f.isEnabled()) {
            this.f.setEnabled(false);
        }
        ((FileManagerFragment) getSupportFragmentManager().findFragmentById(R.id.fg_file_explorer)).onDisconnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        t(5105);
        if (this.d.isEnabled()) {
            this.d.setEnabled(false);
        }
        if (this.f.isEnabled()) {
            this.f.setEnabled(false);
        }
        ((FileManagerFragment) getSupportFragmentManager().findFragmentById(R.id.fg_file_explorer)).onUnbound();
    }

    private void t(int i) {
        if (i == this.i) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.setTransition(4097);
        Fragment fragmentFindFragmentById = supportFragmentManager.findFragmentById(R.id.fg_file_explorer);
        Fragment fragmentFindFragmentById2 = supportFragmentManager.findFragmentById(R.id.fg_file_transfer_list);
        if (i == 5105) {
            if (fragmentFindFragmentById2 != null) {
                fragmentTransactionBeginTransaction.hide(fragmentFindFragmentById2);
            }
            if (fragmentFindFragmentById != null) {
                fragmentTransactionBeginTransaction.show(fragmentFindFragmentById);
            }
            this.f.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(100L).withEndAction(new c()).start();
            this.b.animate().alpha(0.0f).setDuration(100L).withEndAction(new d()).start();
        } else if (i == 5108) {
            if (fragmentFindFragmentById != null) {
                fragmentTransactionBeginTransaction.hide(fragmentFindFragmentById);
            }
            if (fragmentFindFragmentById2 != null) {
                fragmentTransactionBeginTransaction.show(fragmentFindFragmentById2);
            }
            if (this.e.getVisibility() == 0) {
                this.e.setVisibility(4);
            }
            this.c.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(100L).withEndAction(new e()).start();
            this.b.animate().alpha(0.0f).setDuration(100L).withEndAction(new f()).start();
        }
        try {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.i = i;
    }

    public void checkDeviceState() {
        if (!WifiFtpModule.hasBoundDevice(this)) {
            s();
        } else if (WifiFtpModule.isDeviceConnected(this)) {
            q();
        } else {
            r();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = this.i;
        if (i != 5105) {
            if (i != 5108) {
                return;
            }
            t(5105);
        } else {
            FileManagerFragment fileManagerFragment = (FileManagerFragment) getSupportFragmentManager().findFragmentById(R.id.fg_file_explorer);
            if (fileManagerFragment != null ? fileManagerFragment.onBackPressed() : false) {
                return;
            }
            super.onBackPressed();
        }
    }

    public void onBackPressedInternal(View view) {
        onBackPressed();
    }

    public void onClearAllBtnClick(View view) {
        if (this.i != 5108) {
            return;
        }
        ((FtpTransferListFragment) getSupportFragmentManager().findFragmentById(R.id.fg_file_transfer_list)).onHeaderRemoveBtnClick();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        PhoneWifiFtpUtil.init(this);
        setContentView(R.layout.activity_file_manager);
        DeviceCompatibility.setStatusBarDarkMode(this, !RainbowUtils.isDarkMode(this), R.color.s38);
        initView();
        n();
        WifiFtpModule.addListener(this.k);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        WatchWifiFtpUtil.get().disableWifiAP();
        WifiFtpModule.sendDisableFtp();
        PhoneWifiFtpUtil.release();
        this.a.dispose();
        WifiFtpModule.removeListener(this.k);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkDeviceState();
        CheckLocationServiceUtil.INSTANCE.checkLocationServiceReady((AppCompatActivity) this);
    }

    public void onTransferListBtnClick(View view) {
        if (this.i != 5105) {
            return;
        }
        t(5108);
    }
}
