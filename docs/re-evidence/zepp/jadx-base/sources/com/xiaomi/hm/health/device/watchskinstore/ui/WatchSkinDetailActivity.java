package com.xiaomi.hm.health.device.watchskinstore.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicerecorder.UriGetter;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.view.ViewUtils;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceEvent;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.watch_skin.UriUtils;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinProgressView;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinUtils;
import com.xiaomi.hm.health.device.watchskinstore.WatchSkinHelper;
import com.xiaomi.hm.health.device.watchskinstore.adapter.SelectColorAdapter;
import com.xiaomi.hm.health.device.watchskinstore.adapter.SelectMoreColorAdapter;
import com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi;
import com.xiaomi.hm.health.device.watchskinstore.bean.ReLoadEvent;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchResult;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinstore.ui.WatchSkinDetailActivity;
import com.xiaomi.hm.health.fragment.SelectImageFragment;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
public class WatchSkinDetailActivity extends BaseWatchSkinActivity {
    private static final String K0 = "WatchSkinDetail";
    public static final String KEY_DEVICE = "device";
    public static final String KEY_FROM_LOCAL = "from_local";
    public static final String KEY_FROM_OUTSIDE = "from_outside";
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    private static final int L0 = 1024;
    private static final int M0 = 1025;
    public static final int MORE_COLOR_COLUMN = 13;
    private static final int N0 = 1026;
    private static final int O0 = 1027;
    private static final int P0 = 6;
    private static final float Q0 = 12.0f;
    private static final long R0 = 200;
    private static final long S0 = 30000;
    private static final int T0 = 1;
    private static final int U0 = 0;
    private static final int V0 = 1;
    private static final int W0 = 2;
    private static final int X0 = 3;
    private static final int Y0 = 4;
    private static final int Z0 = 5;
    private static final int a1 = 6;
    private static final int b1 = 7;
    private static final int c1 = 8;
    private static final int d1 = 9;
    private static final int e1 = 10;
    private static final int f1 = 11;
    private static final int g1 = 13;
    private static final int h1 = 14;
    private static final int i1 = 15;
    private static final int j1 = 16;
    private static final int k1 = 17;
    private static final int l1 = 18;
    private static final int m1 = 20;
    private ImageView A;
    private Context A0;
    private ImageView B;
    private final Lazy<DeviceManagerApi> B0;
    private ImageView C;
    private final Lazy<DeviceUtilsApi> C0;
    private ImageView D;
    private final DeviceManagerApi D0;
    private TextView E;
    private HMDeviceSource E0;
    private TextView F;
    private HMDeviceType F0;
    private AppCompatRatingBar G;
    private boolean G0;
    private View H;
    private boolean H0;
    private LinearLayout I;
    private WatchSkinDownloader I0;
    private View J;
    private String J0;
    private RecyclerView K;
    private RecyclerView L;
    private View M;
    private ImageView N;
    private WatchSkinProgressView O;
    private TextView P;
    private View Q;
    private TextView R;
    private TextView S;
    private View T;
    private String U;
    private String V;
    private String W;
    private String X;
    private SelectColorAdapter Y;
    private SelectMoreColorAdapter Z;
    private List<Integer> m0;
    private List<Integer> n0;
    private int r0;
    private WatchSkinBean s0;
    private Handler t0;
    private Runnable u0;
    private String v0;
    private String w0;
    private String x0;
    private String y0;
    private String z0;
    private int z = 4;
    private boolean o0 = false;
    private boolean p0 = true;
    private boolean q0 = true;

    public class a implements WatchSkinDownloader.DownloadProgressListener {
        public WeakReference a;

        public a(WatchSkinDetailActivity watchSkinDetailActivity) {
            this.a = new WeakReference(watchSkinDetailActivity);
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onFailure() {
            if (((WatchSkinDetailActivity) this.a.get()) != null) {
                WatchSkinDetailActivity.this.x1(10);
            }
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onProgress(float f) {
            if (((WatchSkinDetailActivity) this.a.get()) != null) {
                WatchSkinDetailActivity.this.y1(8, Float.valueOf(f));
            }
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onStart() {
            if (((WatchSkinDetailActivity) this.a.get()) != null) {
                WatchSkinDetailActivity.this.y1(9, 3);
            }
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onSuccess() {
            if (((WatchSkinDetailActivity) this.a.get()) != null) {
                WatchSkinDetailActivity.this.x1(11);
            }
        }
    }

    public class b implements WatchSkinSyncManager.SyncProgressListener {
        public WeakReference a;

        public b(WatchSkinDetailActivity watchSkinDetailActivity) {
            this.a = new WeakReference(watchSkinDetailActivity);
        }

        private String a() {
            return WatchSkinDetailActivity.this.getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_music : R.string.local_watch_skin_music_band);
        }

        private String b() {
            return WatchSkinDetailActivity.this.getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_sporting : R.string.local_watch_skin_sporting_band);
        }

        private String c() {
            return WatchSkinDetailActivity.this.getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_timing : R.string.local_watch_skin_timing_band);
        }

        private void d(int i) {
            String strB;
            WatchSkinDetailActivity watchSkinDetailActivity = WatchSkinDetailActivity.this;
            watchSkinDetailActivity.B1(1, watchSkinDetailActivity.v0);
            if (!((DeviceManagerApi) WatchSkinDetailActivity.this.B0.getValue()).isBluetoothEnable()) {
                WatchSkinDetailActivity.this.x1(17);
                return;
            }
            if (i == 2) {
                strB = b();
            } else if (i != 3) {
                strB = i != 4 ? WatchSkinDetailActivity.this.z0 : a();
            } else {
                strB = c();
            }
            WatchSkinDetailActivity.this.y1(14, strB);
        }

        private void e() {
            WatchSkinDetailActivity.this.x1(13);
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager.SyncProgressListener
        public void onProgress(Progress progress) {
            if (((WatchSkinDetailActivity) this.a.get()) != null) {
                int i = progress.total;
                WatchSkinDetailActivity.this.y1(8, Float.valueOf(i == 0 ? 0.0f : progress.progress / Float.valueOf(i).floatValue()));
            }
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager.SyncProgressListener
        public void onStart() {
            if (this.a.get() != null) {
                WatchSkinDetailActivity.this.y1(9, 5);
            }
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager.SyncProgressListener
        public void onStop(int i) {
            if (this.a.get() != null) {
                if (i == 0) {
                    e();
                } else {
                    d(i);
                }
            }
        }
    }

    public WatchSkinDetailActivity() {
        Lazy<DeviceManagerApi> lazyInject = KoinJavaComponent.inject(DeviceManagerApi.class);
        this.B0 = lazyInject;
        this.C0 = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.D0 = lazyInject.getValue();
    }

    private void A0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.C0.getValue().getStoragePath());
        String str = File.separator;
        sb.append(str);
        sb.append("TEMP_PHOTO");
        sb.append(str);
        String string = sb.toString();
        File file = new File(string);
        u1(file);
        if (file.mkdirs()) {
            this.U = string + System.currentTimeMillis() + ".jpg";
        }
    }

    private void A1(WatchSkinBean watchSkinBean) {
        if (watchSkinBean == null) {
            showTipsView(0);
            return;
        }
        super.setData();
        this.s0 = watchSkinBean;
        setTitleText(watchSkinBean.getName());
        if (!TextUtils.isEmpty(watchSkinBean.getImage())) {
            WatchSkinHelper.loadImage(this, this.A, watchSkinBean.getImage(), watchSkinBean.getIsLocal());
        }
        if (watchSkinBean.getCustomizable()) {
            this.r0 = this.s0.getSelectColor();
            this.I.setVisibility(0);
            this.Z.setNewData(this.n0);
            this.Y.setNewData(this.m0);
            WatchSkinHelper.setTintTransBg(this, this.B, WatchSkinHelper.getTransImageRes(this.s0), this.r0);
            int i = this.r0;
            if (i != 0) {
                if (this.m0.contains(Integer.valueOf(i))) {
                    this.Y.setSelectPosition(this.m0.indexOf(Integer.valueOf(this.r0)));
                } else if (this.n0.contains(Integer.valueOf(this.r0))) {
                    this.Z.setMoreColorSelectPosition(this.n0.indexOf(Integer.valueOf(this.r0)));
                }
            }
        } else {
            this.I.setVisibility(8);
        }
        String downloadUrl = this.s0.getDownloadUrl();
        if (this.G0) {
            this.H.setVisibility(8);
            this.C.setVisibility(8);
            this.J0 = downloadUrl;
        } else {
            this.H.setVisibility(0);
            this.C.setVisibility(0);
            this.G.setRating(watchSkinBean.getRank());
            this.C.setSelected(watchSkinBean.getFavorited());
            this.J0 = WatchSkinManager.getDownloadPath(this, downloadUrl, false);
        }
        String description = watchSkinBean.getDescription();
        boolean zIsEmpty = TextUtils.isEmpty(description);
        this.E.setVisibility(zIsEmpty ? 8 : 0);
        this.F.setVisibility(zIsEmpty ? 8 : 0);
        if (!zIsEmpty) {
            this.F.setText(description);
        }
        this.P.setText(getString(R.string.watch_skin_price_buy, new Object[]{String.valueOf(watchSkinBean.getPrice())}));
        z1(watchSkinBean.getIsFree() || watchSkinBean.getDownloadable());
        l0("WF_Detail_ViewNum");
    }

    private void B0() {
        this.C.setOnClickListener(new View.OnClickListener() { // from class: zh8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.Q0(view);
            }
        });
        findViewById(R.id.cinco_container).setOnClickListener(new View.OnClickListener() { // from class: ai8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.R0(view);
            }
        });
        this.D.setOnClickListener(new View.OnClickListener() { // from class: ej8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.S0(view);
            }
        });
        this.T.setOnClickListener(new View.OnClickListener() { // from class: ij8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.T0(view);
            }
        });
        this.N.setOnClickListener(new View.OnClickListener() { // from class: bj8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.U0(view);
            }
        });
        this.O.setOnClickListener(new View.OnClickListener() { // from class: vh8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.V0(view);
            }
        });
        this.P.setOnClickListener(new View.OnClickListener() { // from class: wh8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.W0(view);
            }
        });
        this.S.setOnClickListener(new View.OnClickListener() { // from class: yh8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.X0(view);
            }
        });
        this.Y.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: bi8
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.Y0(baseQuickAdapter, view, i);
            }
        });
        this.Z.setOnItemClickListener(new SelectMoreColorAdapter.OnItemClickListener() { // from class: ci8
            @Override // com.xiaomi.hm.health.device.watchskinstore.adapter.SelectMoreColorAdapter.OnItemClickListener
            public final void onItemClick(RecyclerView.Adapter adapter, View view, int i) {
                this.a.Z0(adapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B1(int i, String str) {
        this.O.setState(i, str);
        this.p0 = i == 1;
        this.T.setEnabled(i == 1);
        this.q0 = i == 1;
    }

    private void C0() {
        this.K.setLayoutManager(new GridLayoutManager(this, 6));
        this.m0 = new ArrayList();
        this.n0 = new ArrayList();
        this.Y = new SelectColorAdapter(R.layout.layout_select_color, this.m0);
        this.L.setLayoutManager(new GridLayoutManager(this, 13));
        this.Z = new SelectMoreColorAdapter(R.layout.select_more_color_item, this.n0);
        this.Z.setSize((int) ((ViewUtils.getScreenWidth(this) - ViewUtils.dp2px(this, 12.0f)) / 13.0f));
        this.K.setAdapter(this.Y);
        this.L.setAdapter(this.Z);
    }

    private void C1() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.open_vip_tips));
        SpannableString spannableString = new SpannableString(getString(R.string.watch_skin_free));
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff6000")), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        this.R.setText(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D0(String str, Exception exc) {
        return "生成表盘背景图的URI异常:" + str + "," + exc;
    }

    private void D1(boolean z) {
        this.o0 = z;
        this.J.setVisibility(z ? 0 : 8);
        this.M.setVisibility(z ? 0 : 4);
        Float fValueOf = Float.valueOf(this.M.getHeight());
        if (z) {
            this.M.setTranslationY(fValueOf.floatValue());
        }
        View view = this.M;
        float[] fArr = new float[2];
        fArr[0] = z ? view.getTranslationY() : 0.0f;
        fArr[1] = z ? 0.0f : fValueOf.floatValue();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", fArr);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Uri E0(Intent intent) throws Exception {
        Uri uriU0 = u0();
        HMLog.i(K0, "select picture uri:" + uriU0, new Object[0]);
        return UriUtils.INSTANCE.savePhotoFromUriToUri(this, intent.getData(), uriU0) ? uriU0 : Uri.EMPTY;
    }

    private void E1() {
        new AlertDialogFragment.Builder(this).setPositiveButton(R.string.update_now, new DialogInterface.OnClickListener() { // from class: uh8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.l1(dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: fi8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.m1(dialogInterface, i);
            }
        }).setCancelable(false).setMessage(HMDeviceConfig.hasBoundWatch() ? R.string.fw_upgrade_tips_watch : R.string.fw_upgrade_tips).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(Uri uri) {
        n0(uri, r0());
    }

    private void F1() {
        WatchSkinBean watchSkinBean = this.s0;
        if (watchSkinBean == null) {
            return;
        }
        if (watchSkinBean.getMetas() != null && !WatchSkinUtils.isFwSupport(this.E0, this.s0.getMetas().getMinimumFirmwareVersion())) {
            IconToast.showError(this.A0, R.string.fw_version_low);
            B1(2, this.v0);
            this.z = 6;
            E1();
            return;
        }
        BatteryInfo batteryInfo = this.D0.getBatteryInfo(this.F0);
        if (batteryInfo == null) {
            return;
        }
        if (batteryInfo.getLevel() <= 10) {
            HMLog.i(K0, "can not sync for low battery.", new Object[0]);
            IconToast.showError(this.A0, R.string.watch_skin_low_battery_tempo);
            B1(2, this.v0);
            this.p0 = true;
            this.z = 6;
            return;
        }
        int i = this.r0;
        if (i == 0) {
            WatchSkinSyncManager.getInstance().syncSkin(this.V, this.J0, null, new b(this));
            return;
        }
        WatchSkinSyncManager.getInstance().syncSkin(this.V, this.J0, new byte[]{Integer.valueOf(Color.alpha(i)).byteValue(), Integer.valueOf(Color.red(this.r0)).byteValue(), Integer.valueOf(Color.green(this.r0)).byteValue(), Integer.valueOf(Color.blue(this.r0)).byteValue()}, new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G0() {
        return "";
    }

    private void G1() {
        if (this.s0 == null) {
            return;
        }
        p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H0(Throwable th) {
        HMLog.error(K0, "", th, new Function0() { // from class: mi8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WatchSkinDetailActivity.G0();
            }
        });
    }

    private void H1(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
        HMLog.d(K0, "syncDataEvent:" + this.z, new Object[0]);
        if (this.z == 1 && hMDeviceSyncDataEvent.isStop()) {
            if (hMDeviceSyncDataEvent.getResult()) {
                x1(18);
            } else {
                x1(20);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(View view) {
        showLoadingDialog(this.x0, false);
        this.z = 0;
        B1(2, this.v0);
        this.t0.postDelayed(this.u0, 30000L);
    }

    private void I1() {
        Intent intent = new Intent(this, (Class<?>) LargeWatchSkinActivity.class);
        intent.putExtra("image", this.V);
        intent.putExtra(LargeWatchSkinActivity.KEY_BEAN, this.s0);
        startActivity(intent);
        overridePendingTransition(R.anim.scale_in, R.anim.scale_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(View view) {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    private void J1(final boolean z) {
        Observable.fromCallable(new Callable() { // from class: ki8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.n1(z);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: pi8
            @Override // rx.functions.Action0
            public final void call() {
                this.a.o1();
            }
        }).subscribe(new Action1() { // from class: ui8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.p1(z, (WatchResult) obj);
            }
        }, new Action1() { // from class: cj8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatchSkinDetailActivity.r1((Throwable) obj);
            }
        });
        l0("WF_Favourite_ClickNum");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(View view) {
        this.D0.startSyncData(this.F0);
        B1(2, this.v0);
        showLoadingDialog(this.v0, false);
    }

    private void K1() {
        TintUtils.tintDrawable(this.B, this.r0);
        this.s0.setSelectColor(this.r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(View view) {
        this.z = 3;
        this.I0.startDownload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(View view) {
        F1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public /* synthetic */ boolean O0(Message message) {
        Object obj = message.obj;
        HMLog.d(K0, "handleMessage:" + message.what + ":" + obj, new Object[0]);
        int i = message.what;
        if (i == 1) {
            this.z = 1;
            B1(2, this.v0);
            showLoadingDialog(this.y0, false);
        } else if (i != 20) {
            switch (i) {
                case 8:
                    this.O.setProgress(((Float) obj).floatValue());
                    break;
                case 9:
                    this.z = ((Integer) obj).intValue();
                    this.O.setProgress(0.0f);
                    B1(3, getString(this.z == 3 ? R.string.downloading_watch_skin : R.string.watch_skin_syncing));
                    break;
                case 10:
                    this.z = 6;
                    B1(1, getString(R.string.download_watch_skin_fail));
                    this.O.setProgress(0.0f);
                    this.O.setVisibility(0);
                    IconToast.showError(this.A0, NetUtil.isNetworkConnected(DeviceXFunctionsKt.getContext()) ? this.w0 : getString(R.string.watch_skin_network_error));
                    this.O.setOnClickListener(new View.OnClickListener() { // from class: dj8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.L0(view);
                        }
                    });
                    o0();
                    break;
                case 11:
                    l0("WF_Download_Success");
                    s1();
                    v1();
                    break;
                default:
                    switch (i) {
                        case 13:
                            this.z = 2;
                            B1(1, getString(R.string.watch_skin_sync_done));
                            this.O.setOnClickListener(null);
                            this.p0 = true;
                            this.T.setEnabled(false);
                            this.q0 = false;
                            this.t0.postDelayed(new Runnable() { // from class: ei8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.N0();
                                }
                            }, 3000L);
                            break;
                        case 14:
                            this.z = 6;
                            B1(1, this.v0);
                            IconToast.showError(this.A0, (String) obj);
                            this.O.setOnClickListener(new View.OnClickListener() { // from class: xh8
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    this.a.M0(view);
                                }
                            });
                            break;
                        case 15:
                            this.z = 0;
                            showLoadingDialog(this.x0, false);
                            B1(2, this.v0);
                            this.t0.postDelayed(this.u0, 30000L);
                            break;
                        case 16:
                            hideLoadingDialog();
                            this.z = 6;
                            B1(1, this.v0);
                            IconToast.showError(this.A0, R.string.watch_skin_conn_fail);
                            this.O.setOnClickListener(new View.OnClickListener() { // from class: gj8
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    this.a.I0(view);
                                }
                            });
                            break;
                        case 17:
                            this.z = 6;
                            B1(1, this.v0);
                            IconToast.showError(this.A0, getString(R.string.sync_watch_fail) + "\n" + getString(R.string.watch_skin_open_bluetooth));
                            this.O.setOnClickListener(new View.OnClickListener() { // from class: fj8
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    this.a.J0(view);
                                }
                            });
                            break;
                        case 18:
                            if (HMAgpsUpgradeManager.getAgpsProgress() == null) {
                                hideLoadingDialog();
                                B1(1, this.v0);
                                this.z = 2;
                                F1();
                            } else {
                                showLoadingDialog(getString(R.string.watch_skin_agps_upgrading), false);
                                B1(2, this.v0);
                                this.z = 7;
                            }
                            break;
                    }
                    break;
            }
        } else {
            this.z = 6;
            B1(1, this.v0);
            IconToast.showError(this.A0, this.z0);
            this.O.setOnClickListener(new View.OnClickListener() { // from class: hj8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.K0(view);
                }
            });
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0() {
        hideLoadingDialog();
        if (this.B0.getValue().isBluetoothEnable()) {
            x1(16);
        } else {
            x1(17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(View view) {
        WatchSkinBean watchSkinBean = this.s0;
        if (watchSkinBean == null) {
            return;
        }
        J1(!watchSkinBean.getFavorited());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(View view) {
        I1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(View view) {
        I1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(View view) {
        selectBgImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(View view) {
        D1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(View view) {
        if (this.s0 == null) {
            return;
        }
        G1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0(View view) {
        if (this.s0 == null) {
            return;
        }
        w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(View view) {
        v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (this.q0) {
            if (i == baseQuickAdapter.getData().size() - 1) {
                this.r0 = this.n0.get(this.Z.getMoreColorSelectPosition()).intValue();
                D1(true);
            } else {
                this.r0 = this.m0.get(i).intValue();
            }
            K1();
            this.Y.setSelectPosition(i);
            this.Y.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0(RecyclerView.Adapter adapter, View view, int i) {
        if (this.o0) {
            int moreColorSelectPosition = this.Z.getMoreColorSelectPosition();
            this.Z.setMoreColorSelectPosition(i);
            this.r0 = this.n0.get(i).intValue();
            K1();
            this.Z.notifyItemChanged(i);
            if (moreColorSelectPosition != -1) {
                this.Z.notifyItemChanged(moreColorSelectPosition);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult a1() throws Exception {
        WatchSkinBean data;
        WatchResult<WatchSkinBean> watchResultLoadSingleLocalWatchSkin = this.G0 ? WatchSkinHelper.loadSingleLocalWatchSkin((AppCompatActivity) this.A0, this.H0, this.X) : WatchSkinApi.loadWatchSkinDetail(String.valueOf(this.E0.getValue()), this.X);
        if (watchResultLoadSingleLocalWatchSkin.isSuccessful() && (data = watchResultLoadSingleLocalWatchSkin.getData()) != null && data.getCustomizable()) {
            this.m0.clear();
            Collections.addAll(this.m0, WatchSkinHelper.getColorArray());
            this.n0.clear();
            Collections.addAll(this.n0, WatchSkinHelper.getMoreColorArray());
        }
        return watchResultLoadSingleLocalWatchSkin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1() {
        showLoadingDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c1(WatchResult watchResult) {
        HMLog.i(K0, "load  detail result:" + watchResult, new Object[0]);
        hideLoadingDialog();
        if (watchResult.isSuccessful()) {
            A1((WatchSkinBean) watchResult.getData());
        } else {
            showTipsView(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d1() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e1(Throwable th) {
        HMLog.error(K0, "", th, new Function0() { // from class: oi8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WatchSkinDetailActivity.d1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult f1() throws Exception {
        return WatchSkinApi.reportDownload(String.valueOf(this.E0.getValue()), this.X);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g1(WatchResult watchResult) {
        HMLog.d(K0, "onSuccess!!!" + watchResult, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h1(Throwable th) {
        HMLog.d(K0, "onError: " + th, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean i1() throws Exception {
        return Boolean.valueOf(WatchSkinManager.saveInfo2Xml(t0(), this.s0.getName(), this.s0.getId(), this.s0.getCustomizable()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j1(Boolean bool) {
        EventBus.getDefault().post(new ReLoadEvent(true));
        HMLog.d(K0, "onSuccess!!!" + bool, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k1(Throwable th) {
        HMLog.d(K0, "onError: " + th, new Object[0]);
    }

    private void l0(String str) {
        WatchSkinBean watchSkinBean = this.s0;
        if (watchSkinBean == null || watchSkinBean.getIsLocal()) {
            return;
        }
        HashMap map = new HashMap();
        map.put(StatEvent.WF_WATCHFACETYPE, this.s0.getIsFree() ? "F" : "NF");
        map.put("WatchFaceId", String.valueOf(this.s0.getId()));
        WatchSkinHelper.analyticCount(str, this.E0.getValue(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l1(DialogInterface dialogInterface, int i) {
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(this.F0)) {
            HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(0, true);
            HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(this, this.F0, false, true);
        } else {
            HMFwUpgradeManager.getInstance().enableFwUpgrade(0, true);
            HMFwUpgradeManager.getInstance().checkFwUpgrade(this, this.F0, false, true);
        }
        this.p0 = true;
        dialogInterface.dismiss();
    }

    public static void launchDetailActivity(Activity activity, HMDeviceSource hMDeviceSource, int i, String str) {
        launchDetailActivity(activity, hMDeviceSource, String.valueOf(i), str, false);
    }

    private void m0(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        HMLog.d(K0, "connectEvent:" + this.z, new Object[0]);
        if (this.z == 0 && hMDeviceConnectionEvent.isConnected()) {
            this.t0.removeCallbacksAndMessages(null);
            if (this.D0.isSyncingData(this.F0)) {
                x1(1);
            } else {
                x1(18);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m1(DialogInterface dialogInterface, int i) {
        this.p0 = true;
    }

    private void n0(Uri uri, Uri uri2) {
        if (uri == null || uri == Uri.EMPTY) {
            return;
        }
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.addFlags(1);
        intent.setDataAndType(uri, UriGetter.ShareContentType.IMAGE);
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 2);
        intent.putExtra(AnimatorViewWrapper.SCALE, true);
        intent.putExtra("output", uri2);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.PNG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, 1026);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult n1(boolean z) throws Exception {
        return WatchSkinApi.updateCollectStatus(String.valueOf(this.E0.getValue()), this.X, z);
    }

    private void o0() {
        HMLog.d(K0, "deleteSkinFile!!!", new Object[0]);
        File file = new File(this.J0);
        if (file.exists()) {
            HMLog.d(K0, "sync skin  failed!!delete" + file.delete(), new Object[0]);
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            return;
        }
        parentFile.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o1() {
        showLoadingDialog();
    }

    private void p0() {
        if (TextUtils.isEmpty(this.J0)) {
            return;
        }
        HMLog.i(K0, "download path:" + this.J0, new Object[0]);
        File file = new File(this.J0);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdir();
        }
        if (file.exists()) {
            s1();
            return;
        }
        if (this.s0.getIsLocal()) {
            HMLog.i(K0, "local file skin is  not exists!!!", new Object[0]);
            return;
        }
        WatchSkinDownloader watchSkinDownloader = new WatchSkinDownloader(this.s0.getDownloadUrl(), this.J0, this.s0.getIsFree());
        this.I0 = watchSkinDownloader;
        watchSkinDownloader.setProgressListener(new a(this));
        this.I0.startDownload();
        l0("WF_Download_ClickNum");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p1(boolean z, WatchResult watchResult) {
        hideLoadingDialog();
        if (!watchResult.isSuccessful() || !((Boolean) watchResult.getData()).booleanValue()) {
            Toast.makeText(this, z ? R.string.watch_skin_collect_failed : R.string.watch_skin_cancel_collect_failed, 0).show();
            return;
        }
        this.s0.setFavorited(z);
        this.C.setSelected(z);
        EventBus.getDefault().post(new ReLoadEvent(true));
    }

    private Uri q0(Context context, final String str) {
        try {
            return Build.VERSION.SDK_INT >= 24 ? FileProvider.getUriForFile(context, getString(R.string.share_provider_file_authorities), new File(str)) : Uri.fromFile(new File(str));
        } catch (Exception e) {
            HMLog.error(K0, new Function0() { // from class: li8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WatchSkinDetailActivity.D0(str, e);
                }
            });
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q1() {
        return "";
    }

    private Uri r0() {
        this.W = s0();
        HMLog.d(K0, "preCroppedPath:" + this.W, new Object[0]);
        File file = new File(this.W);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            HMLog.d(K0, "getOutCropUri :parent: is not exists", new Object[0]);
            parentFile.mkdirs();
        }
        return Uri.fromFile(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r1(Throwable th) {
        HMLog.error(K0, "", th, new Function0() { // from class: ni8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WatchSkinDetailActivity.q1();
            }
        });
    }

    private String s0() {
        return t0() + File.separator + WatchSkinManager.WATCH_SKIN_DIAL_NAME;
    }

    private void s1() {
        if (!this.B0.getValue().isBluetoothEnable()) {
            HMLog.i(K0, "bluetooth disable.", new Object[0]);
            x1(17);
        } else if (!this.B0.getValue().isConnected(this.F0)) {
            HMLog.i(K0, "device is connecting.", new Object[0]);
            x1(15);
        } else if (this.B0.getValue().isSyncingData(this.F0)) {
            HMLog.i(K0, "data syncing.", new Object[0]);
            x1(1);
        } else {
            HMLog.i(K0, "data syncing success", new Object[0]);
            x1(18);
        }
    }

    private String t0() {
        if (TextUtils.isEmpty(this.J0)) {
            HMLog.d(K0, "getSkinFolder downloadSkinPath is NULL!!!", new Object[0]);
            return null;
        }
        File file = new File(this.J0);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            HMLog.d(K0, "ret: " + (parentFile != null ? parentFile.mkdirs() : false), new Object[0]);
        }
        return file.getParent();
    }

    private void t1() {
        Intent intent = getIntent();
        HMDeviceSource hMDeviceSource = intent == null ? null : (HMDeviceSource) intent.getSerializableExtra("device");
        this.E0 = hMDeviceSource;
        if (hMDeviceSource == null) {
            finish();
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra(KEY_FROM_OUTSIDE, false);
        this.H0 = booleanExtra;
        if (booleanExtra) {
            this.G0 = true;
            this.X = WatchSkinManager.getWatchSkinPath(getIntent());
        } else {
            this.G0 = intent.getBooleanExtra("from_local", false);
            this.X = intent.getStringExtra("id");
        }
        String stringExtra = intent.getStringExtra("name");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        setTitleText(stringExtra);
    }

    private Uri u0() {
        String str = t0() + File.separator + WatchSkinManager.WATCH_SKIN_TEMP_DIAL_NAME;
        HMLog.d(K0, "getTempOutCropUri:" + str, new Object[0]);
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            HMLog.d(K0, "getTempOutCropUri :parent: is not exists", new Object[0]);
            parentFile.mkdirs();
        }
        file.deleteOnExit();
        return q0(this, str);
    }

    private Boolean u1(File file) {
        boolean zDelete = false;
        if (file.isFile()) {
            zDelete = file.delete();
        } else if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                zDelete = file.delete();
            } else {
                for (File file2 : fileArrListFiles) {
                    u1(file2);
                }
                zDelete = file.delete();
            }
        }
        return Boolean.valueOf(zDelete);
    }

    private void v0() {
    }

    private void v1() {
        w1();
        Observable.fromCallable(new Callable() { // from class: ii8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.f1();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: vi8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatchSkinDetailActivity.g1((WatchResult) obj);
            }
        }, new Action1() { // from class: zi8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatchSkinDetailActivity.h1((Throwable) obj);
            }
        });
    }

    private void w0() {
        if (this.s0 == null) {
            return;
        }
        l0(StatEvent.WF_BUY_CLICKNUM);
        WatchSkinOrderActivity.launchWatchSkinOrderActivity(this, this.E0, this.s0, 1027);
    }

    private void w1() {
        WatchSkinManager.saveThumbnail(this, t0(), this.s0.getImage());
        Object transImageRes = WatchSkinHelper.getTransImageRes(this.s0);
        if (transImageRes instanceof String) {
            WatchSkinManager.saveThumbnail(this, t0(), String.valueOf(transImageRes), WatchSkinManager.WATCH_SKIN_TRANS_NAME);
        }
        Observable.fromCallable(new Callable() { // from class: hi8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.i1();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: wi8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatchSkinDetailActivity.j1((Boolean) obj);
            }
        }, new Action1() { // from class: xi8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatchSkinDetailActivity.k1((Throwable) obj);
            }
        });
    }

    private void x0(final Intent intent) {
        if (TextUtils.isEmpty(intent.getDataString())) {
            return;
        }
        Observable.fromCallable(new Callable() { // from class: ji8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.E0(intent);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: si8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.F0((Uri) obj);
            }
        }, new Action1() { // from class: aj8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatchSkinDetailActivity.H0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x1(int i) {
        y1(i, null);
    }

    private void y0() {
        n0(q0(this, this.U), r0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1(int i, Object obj) {
        this.t0.sendMessage(Message.obtain(this.t0, i, obj));
    }

    private void z0() {
        this.t0 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: qi8
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.O0(message);
            }
        });
        this.u0 = new Runnable() { // from class: di8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P0();
            }
        };
    }

    private void z1(boolean z) {
        if (z) {
            this.O.setVisibility(0);
            this.P.setVisibility(8);
            this.Q.setVisibility(8);
        } else {
            this.O.setVisibility(8);
            this.P.setVisibility(0);
            this.Q.setVisibility(0);
        }
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int containerId() {
        return R.id.layout_container;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int createLayout() {
        return R.layout.activity_watch_skin_detail;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int errorContainerId() {
        return R.id.error_container;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void initData() {
        this.A0 = this;
        t1();
        this.F0 = this.E0.getType();
        this.v0 = getString(R.string.sync_watch_skin);
        this.w0 = getString(R.string.try_again);
        this.x0 = getString(R.string.device_connecting);
        this.y0 = getString(R.string.watch_data_syncing);
        this.z0 = getString(R.string.watch_skin_sync_fail);
        C1();
        z0();
        A0();
        if (TextUtils.isEmpty(this.X)) {
            HMLog.i(K0, "WatchSkinId is NULL!!!", new Object[0]);
            finish();
        }
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void initView() {
        this.A = (ImageView) findViewById(R.id.cinco_bg_img);
        this.B = (ImageView) findViewById(R.id.cinco_transparent_img);
        this.C = (ImageView) findViewById(R.id.watch_skin_collect_iv);
        this.D = (ImageView) findViewById(R.id.watch_skin_large_iv);
        this.E = (TextView) findViewById(R.id.watch_skin_detail_title);
        this.F = (TextView) findViewById(R.id.watch_skin_detail);
        this.G = (AppCompatRatingBar) findViewById(R.id.watch_skin_rate);
        this.H = findViewById(R.id.watch_skin_star_layout);
        this.O = (WatchSkinProgressView) findViewById(R.id.sync_apply_btn);
        this.P = (TextView) findViewById(R.id.watch_skin_buy_tv);
        this.I = (LinearLayout) findViewById(R.id.layout_customize);
        this.K = (RecyclerView) findViewById(R.id.select_color_rv);
        this.M = findViewById(R.id.color_container);
        this.N = (ImageView) findViewById(R.id.close_more_color_icon);
        this.L = (RecyclerView) findViewById(R.id.select_more_color_rv);
        this.J = findViewById(R.id.disable_mask);
        this.T = findViewById(R.id.add_view);
        this.Q = findViewById(R.id.open_vip_layout);
        this.R = (TextView) findViewById(R.id.watch_skin_vip_tips_tv);
        this.S = (TextView) findViewById(R.id.open_vip_tv);
        C0();
        B0();
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void loadData(boolean z) {
        Observable.fromCallable(new Callable() { // from class: gi8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a1();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: ri8
            @Override // rx.functions.Action0
            public final void call() {
                this.a.b1();
            }
        }).subscribe(new Action1() { // from class: ti8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.c1((WatchResult) obj);
            }
        }, new Action1() { // from class: yi8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatchSkinDetailActivity.e1((Throwable) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        HMLog.i(K0, "onActivityResult, requstCode:" + i + " resultCode: " + i2, new Object[0]);
        if (i2 != -1) {
            this.W = null;
        }
        if (i == 1) {
            x1(15);
            return;
        }
        switch (i) {
            case 1024:
                x0(intent);
                break;
            case 1025:
                y0();
                break;
            case 1026:
                String str = this.W;
                this.V = str;
                WatchSkinHelper.loadImage(this, this.A, str, true);
                break;
            case 1027:
                z1(true);
                G1();
                break;
        }
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.getDefault().registerSticky(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(HMDeviceEvent hMDeviceEvent) {
        if (hMDeviceEvent.getDeviceType() != this.F0) {
            HMLog.d(K0, "event is not current device" + hMDeviceEvent, new Object[0]);
            return;
        }
        if (!(hMDeviceEvent instanceof HMDeviceFwUpgradeEvent)) {
            if (hMDeviceEvent instanceof HMDeviceConnectionEvent) {
                m0((HMDeviceConnectionEvent) hMDeviceEvent);
                return;
            } else {
                if (hMDeviceEvent instanceof HMDeviceSyncDataEvent) {
                    H1((HMDeviceSyncDataEvent) hMDeviceEvent);
                    return;
                }
                return;
            }
        }
        HMLog.d(K0, "HMDeviceFwUpgradeEvent:" + this.z, new Object[0]);
        if (this.z != 7) {
            return;
        }
        HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent = (HMDeviceFwUpgradeEvent) hMDeviceEvent;
        if ((hMDeviceFwUpgradeEvent.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_CEP || hMDeviceFwUpgradeEvent.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_NMEA) && hMDeviceFwUpgradeEvent.isStop()) {
            B1(1, this.v0);
            hideLoadingDialog();
            this.z = 2;
            F1();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.p0) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        if (this.p0) {
            super.onLeftClicked();
        }
    }

    public void openGallery() {
        Intent intent = new Intent();
        intent.setType(UriGetter.ShareContentType.IMAGE);
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(intent, 1024);
    }

    public void selectBgImage() {
        SelectImageFragment.newInstance(1025).show(getSupportFragmentManager(), (String) null);
    }

    public void takePhoto() {
        startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", q0(this, this.U)), 1025);
    }

    public static void launchDetailActivity(Activity activity, HMDeviceSource hMDeviceSource, String str, String str2, boolean z) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) WatchSkinDetailActivity.class);
        intent.putExtra("device", hMDeviceSource);
        intent.putExtra("id", str);
        intent.putExtra("name", str2);
        intent.putExtra("from_local", z);
        intent.putExtra("checkNetwork", !z);
        activity.startActivity(intent);
    }
}
