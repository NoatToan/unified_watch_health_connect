package com.xiaomi.hm.health.device.watch_skin;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Movie;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.AvatarManagerApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.lib.view.ViewUtils;
import com.huami.prelaunch.PreLaunchUtilKt;
import com.huami.prelaunch.elements.Picture;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseui.GifMovieView;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.watch_skin.watchskincoroutine.DefaultDialInfoReader;
import com.xiaomi.hm.health.device.watch_skin.watchskincoroutine.WatchSkinError;
import com.xiaomi.hm.health.device.watch_skin.watchskincoroutine.WatchSkinState;
import com.xiaomi.hm.health.device.watch_skin.watchskincoroutine.WatchSkinViewModel;
import com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt;
import com.xiaomi.hm.health.discovery.jsbridge.function.SyncWatchSkinHandler;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import de.greenrobot.event.EventBus;
import defpackage.lj8;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
public class WatchSkinDetailDialog extends DialogFragment {
    private static final int A = 1;
    public static final String ARGS_FROM_LOCAL = "from_local";
    private static final int B = 2;
    private static final int C = 3;
    public static final long CANCEL_DELAY = 3000;
    private static final int D = 4;
    private static final int E = 5;
    private static final int F = 6;
    private static final int G = 7;
    private static final int H = 8;
    private static final int I = 1;
    private static final Lazy<DeviceManagerApi> J = KoinJavaComponent.inject(DeviceManagerApi.class);
    public static boolean SHOWING = false;
    private static final String w = "WatchSkinDetailDialog";
    private static final int x = 43;
    private static final int y = 30000;
    private static final int z = 0;
    private WatchSkinProgressView a;
    private String b;
    private WatchSkinInfo c;
    private TextView d;
    private GifMovieView e;
    private ImageView f;
    private JsCallBackFunction g;
    private WatchSkinDownloader k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private Handler q;
    private Runnable r;
    private WatchSkinViewModel u;
    private int h = 4;
    private final Lazy<AvatarManagerApi> i = KoinJavaComponent.inject(AvatarManagerApi.class);
    private DeviceManagerApi j = J.getValue();
    private HMDeviceSource s = HMDeviceSource.MILI_PEYTO;
    private int t = 0;
    private boolean v = true;

    public class a extends HMLoadTarget<File> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(File file) {
            WatchSkinDetailDialog.this.e.setMovie(Movie.decodeFile(file.getAbsolutePath()));
        }
    }

    public class b extends HMLoadTarget<Bitmap> {
        public b() {
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap bitmap) {
            if (WatchSkinDetailDialog.this.isDetached() || WatchSkinDetailDialog.this.getActivity() == null) {
                return;
            }
            ((AvatarManagerApi) WatchSkinDetailDialog.this.i.getValue()).makeRoundedBitmapDrawable(bitmap, WatchSkinDetailDialog.this.getActivity(), WatchSkinDetailDialog.this.f);
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WatchSkinError.values().length];
            a = iArr;
            try {
                iArr[WatchSkinError.SPORT_ONGOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WatchSkinError.TIME_ONGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WatchSkinError.MUSIC_ONGOING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WatchSkinError.STORAGE_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WatchSkinError.FAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WatchSkinError.SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WatchSkinError.START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WatchSkinError.FW_LOW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WatchSkinError.BATTERY_LOW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class d implements WatchSkinDownloader.DownloadProgressListener {
        public WeakReference<WatchSkinDetailDialog> a;

        public class a extends SingleSubscriber<Void> {
            public a() {
            }

            @Override // rx.SingleSubscriber
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r3) {
                HMLog.d(WatchSkinDetailDialog.w, "onSuccess: " + r3, new Object[0]);
                EventBus.getDefault().post(new WatchSkinDownloadEvent(true));
            }

            @Override // rx.SingleSubscriber
            public void onError(Throwable th) {
                HMLog.d(WatchSkinDetailDialog.w, "onError: " + th, new Object[0]);
            }
        }

        public d(WatchSkinDetailDialog watchSkinDetailDialog) {
            this.a = new WeakReference<>(watchSkinDetailDialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(WatchSkinDetailDialog watchSkinDetailDialog, View view) {
            watchSkinDetailDialog.f0(3);
            watchSkinDetailDialog.d.setText("");
            watchSkinDetailDialog.k.startDownload();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void d(WatchSkinDetailDialog watchSkinDetailDialog) throws Exception {
            WatchSkinManager.saveInfo2Xml(watchSkinDetailDialog.F(), watchSkinDetailDialog.c.name);
            return null;
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onFailure() {
            final WatchSkinDetailDialog watchSkinDetailDialog = this.a.get();
            if (watchSkinDetailDialog == null || !watchSkinDetailDialog.isAdded()) {
                return;
            }
            if (watchSkinDetailDialog.g != null) {
                watchSkinDetailDialog.g.onCallBack(SyncWatchSkinHandler.getError(SyncWatchSkinHandler.DOWNLOAD_ERROR_CODE, SyncWatchSkinHandler.DOWNLOAD_ERROR_MSG));
            }
            watchSkinDetailDialog.a.setState(1, watchSkinDetailDialog.getString(R.string.download_watch_skin_fail));
            watchSkinDetailDialog.a.setProgress(0.0f);
            watchSkinDetailDialog.d.setVisibility(0);
            if (NetUtil.isNetworkConnected(DeviceXFunctionsKt.getDeviceXApplication())) {
                watchSkinDetailDialog.d.setText(watchSkinDetailDialog.m);
            } else {
                if (watchSkinDetailDialog.g != null) {
                    watchSkinDetailDialog.g.onCallBack(SyncWatchSkinHandler.getError(SyncWatchSkinHandler.NET_ERROR_CODE, SyncWatchSkinHandler.NET_ERROR_MSG));
                }
                watchSkinDetailDialog.d.setText(watchSkinDetailDialog.getString(R.string.watch_skin_network_error));
            }
            watchSkinDetailDialog.f0(6);
            watchSkinDetailDialog.a.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.watch_skin.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WatchSkinDetailDialog.d.c(watchSkinDetailDialog, view);
                }
            });
            EventBus.getDefault().post(new WatchSkinDownloadEvent(false));
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onProgress(float f) {
            WatchSkinDetailDialog watchSkinDetailDialog = this.a.get();
            if (watchSkinDetailDialog == null || !watchSkinDetailDialog.isAdded()) {
                return;
            }
            watchSkinDetailDialog.a.setProgress(f);
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onStart() {
            WatchSkinDetailDialog watchSkinDetailDialog = this.a.get();
            if (watchSkinDetailDialog == null || !watchSkinDetailDialog.isAdded()) {
                return;
            }
            watchSkinDetailDialog.f0(3);
            watchSkinDetailDialog.a.setProgress(0.0f);
            watchSkinDetailDialog.a.setState(3, watchSkinDetailDialog.getString(R.string.downloading_watch_skin));
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onSuccess() {
            final WatchSkinDetailDialog watchSkinDetailDialog = this.a.get();
            if (watchSkinDetailDialog == null || !watchSkinDetailDialog.isAdded()) {
                return;
            }
            if (WatchSkinUtils.a(watchSkinDetailDialog.t)) {
                WatchSkinAPIKt.reportDownload(watchSkinDetailDialog.s.getValue(), watchSkinDetailDialog.c.id);
            }
            watchSkinDetailDialog.Z(watchSkinDetailDialog.a, true);
            Observable.fromCallable(new Callable() { // from class: com.xiaomi.hm.health.device.watch_skin.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WatchSkinDetailDialog.d.d(watchSkinDetailDialog);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new a());
        }
    }

    public static class e implements WatchSkinSyncManager.SyncProgressListener {
        public WeakReference<WatchSkinDetailDialog> a;

        public e(WatchSkinDetailDialog watchSkinDetailDialog) {
            this.a = new WeakReference<>(watchSkinDetailDialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(WatchSkinDetailDialog watchSkinDetailDialog, Runnable runnable, View view) {
            watchSkinDetailDialog.a.removeCallbacks(runnable);
            watchSkinDetailDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(WatchSkinDetailDialog watchSkinDetailDialog, View view) {
            watchSkinDetailDialog.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager.SyncProgressListener
        public void onProgress(Progress progress) {
            WatchSkinDetailDialog watchSkinDetailDialog = this.a.get();
            if (watchSkinDetailDialog == null || !watchSkinDetailDialog.isAdded()) {
                return;
            }
            int i = progress.total;
            watchSkinDetailDialog.a.setProgress(i == 0 ? 0.0f : progress.progress / i);
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager.SyncProgressListener
        public void onStart() {
            WatchSkinDetailDialog watchSkinDetailDialog = this.a.get();
            if (watchSkinDetailDialog == null || !watchSkinDetailDialog.isAdded()) {
                return;
            }
            watchSkinDetailDialog.a.setProgress(0.0f);
            watchSkinDetailDialog.a.setState(3, watchSkinDetailDialog.getString(R.string.watch_skin_syncing));
            watchSkinDetailDialog.d.setText("");
            watchSkinDetailDialog.f0(5);
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager.SyncProgressListener
        public void onStop(int i) {
            final WatchSkinDetailDialog watchSkinDetailDialog = this.a.get();
            if (watchSkinDetailDialog == null || !watchSkinDetailDialog.isAdded()) {
                return;
            }
            if (i == 0) {
                if (watchSkinDetailDialog.g != null) {
                    if (watchSkinDetailDialog.v) {
                        watchSkinDetailDialog.g.onCallBack(SyncWatchSkinHandler.getSuccess(SyncWatchSkinHandler.CACHE_SYNC_SUCCESS_CODE, SyncWatchSkinHandler.CACHE_SYNC_SUCCESS_MSG));
                    } else {
                        watchSkinDetailDialog.g.onCallBack(SyncWatchSkinHandler.getSuccess(SyncWatchSkinHandler.DOWNLOAD_SYNC_SUCCESS_CODE, SyncWatchSkinHandler.DOWNLOAD_SYNC_SUCCESS_MSG));
                    }
                }
                watchSkinDetailDialog.a.setState(1, watchSkinDetailDialog.getString(R.string.watch_skin_sync_done));
                watchSkinDetailDialog.d.setText("");
                watchSkinDetailDialog.f0(2);
                final lj8 lj8Var = new lj8(watchSkinDetailDialog);
                watchSkinDetailDialog.a.postDelayed(lj8Var, 3000L);
                watchSkinDetailDialog.a.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.watch_skin.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WatchSkinDetailDialog.e.d(watchSkinDetailDialog, lj8Var, view);
                    }
                });
                return;
            }
            if (watchSkinDetailDialog.g != null && i == 1) {
                watchSkinDetailDialog.g.onCallBack(SyncWatchSkinHandler.getError(SyncWatchSkinHandler.SYNC_ERROR_CODE, SyncWatchSkinHandler.SYNC_ERROR_MSG));
            }
            watchSkinDetailDialog.a.setState(1, watchSkinDetailDialog.l);
            watchSkinDetailDialog.f0(6);
            if (!((DeviceManagerApi) WatchSkinDetailDialog.J.getValue()).isBluetoothEnable()) {
                watchSkinDetailDialog.f0(6);
                watchSkinDetailDialog.d.setText(watchSkinDetailDialog.getString(R.string.watch_skin_open_bluetooth));
                watchSkinDetailDialog.a.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.watch_skin.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WatchSkinDetailDialog.e.f(watchSkinDetailDialog, view);
                    }
                });
                return;
            }
            if (i == 2) {
                watchSkinDetailDialog.d.setText(watchSkinDetailDialog.getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_sporting : R.string.local_watch_skin_sporting_band));
            } else if (i == 3) {
                watchSkinDetailDialog.d.setText(watchSkinDetailDialog.getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_timing : R.string.local_watch_skin_timing_band));
            } else if (i == 4) {
                watchSkinDetailDialog.d.setText(watchSkinDetailDialog.getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_music : R.string.local_watch_skin_music_band));
            } else if (i == 1) {
                watchSkinDetailDialog.d.setText(watchSkinDetailDialog.p);
            }
            watchSkinDetailDialog.a.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.watch_skin.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WatchSkinDetailDialog.D(watchSkinDetailDialog);
                }
            });
        }
    }

    public static /* bridge */ /* synthetic */ void D(WatchSkinDetailDialog watchSkinDetailDialog) {
        watchSkinDetailDialog.h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String F() {
        File file = new File(this.b);
        if (!file.exists()) {
            HMLog.d(w, "ret: " + file.getParentFile().mkdirs(), new Object[0]);
        }
        return file.getParent();
    }

    private void G(View view) {
        boolean z2;
        this.a = (WatchSkinProgressView) view.findViewById(R.id.progress);
        this.d = (TextView) view.findViewById(R.id.error_tips_tv);
        int i = this.t;
        if (4 == i) {
            view.findViewById(R.id.peyto_container).setVisibility(8);
            view.findViewById(R.id.pyh_container).setVisibility(0);
            this.e = (GifMovieView) view.findViewById(R.id.pyh_gif_view);
            this.f = (ImageView) view.findViewById(R.id.pyh_thumbnail_img);
        } else if (i == 6 || i == 5 || i == 10 || i == 13 || i == 14 || i == 16) {
            view.findViewById(R.id.peyto_container).setVisibility(8);
            view.findViewById(R.id.gtr_container).setVisibility(0);
            this.e = (GifMovieView) view.findViewById(R.id.gtr_gif_view);
            this.f = (ImageView) view.findViewById(R.id.gtr_thumbnail_img);
            ImageView imageView = (ImageView) view.findViewById(R.id.gtr_bg);
            int i2 = this.t;
            if (i2 == 10) {
                PreLaunchUtilKt.setImage(imageView, Picture.ONYX_WATCH_SKIN);
            } else if (i2 == 6) {
                HMDeviceSource hMDeviceSource = this.s;
                if (hMDeviceSource == HMDeviceSource.MILI_HAWK_SWK || hMDeviceSource == HMDeviceSource.MILI_HAWK_SWK_W) {
                    imageView.setImageResource(R.drawable.img_hawk_swk_dial_bg);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                    layoutParams.topMargin = (int) ViewUtils.dp2px(requireContext(), 43.0f);
                    this.f.setLayoutParams(layoutParams);
                } else {
                    imageView.setImageResource(R.drawable.img_hawk_dial_bg);
                }
            } else if (this.s == HMDeviceSource.MILI_FALCON_DISNEY) {
                imageView.setImageResource(R.drawable.img_falcon_marvel_dial_bg);
            } else {
                imageView.setImageResource(R.drawable.img_falcon_dial_bg);
            }
        } else if (i == 9) {
            view.findViewById(R.id.peyto_container).setVisibility(8);
            view.findViewById(R.id.vulture_container).setVisibility(0);
            this.e = (GifMovieView) view.findViewById(R.id.vulture_gif_view);
            this.f = (ImageView) view.findViewById(R.id.vulture_thumbnail_img);
            ((ImageView) view.findViewById(R.id.vulture_bg)).setImageResource(R.drawable.img_vulture_dial_bg);
        } else if (7 == i || 11 == i || 15 == i || 19 == i) {
            view.findViewById(R.id.peyto_container).setVisibility(8);
            view.findViewById(R.id.kestrel_container).setVisibility(0);
            this.e = (GifMovieView) view.findViewById(R.id.kestrel_gif_view);
            this.f = (ImageView) view.findViewById(R.id.kestrel_thumbnail_img);
        } else if (i == 0 || 3 == i) {
            this.e = (GifMovieView) view.findViewById(R.id.gif_view);
            this.f = (ImageView) view.findViewById(R.id.thumbnail_img);
        } else if (i == 1) {
            if (J.getValue().getBoundDeviceSource(HMDeviceType.MILI) == HMDeviceSource.MILI_TEMPO) {
                view.findViewById(R.id.peyto_container).setVisibility(8);
                view.findViewById(R.id.tempo_container).setVisibility(0);
                this.e = (GifMovieView) view.findViewById(R.id.tempo_gif_view);
                this.f = (ImageView) view.findViewById(R.id.tempo_thumbnail_img);
            } else {
                view.findViewById(R.id.peyto_container).setVisibility(8);
                view.findViewById(R.id.tempo_container).setVisibility(8);
                view.findViewById(R.id.beats_container).setVisibility(0);
                this.e = (GifMovieView) view.findViewById(R.id.beats_gif_view);
                this.f = (ImageView) view.findViewById(R.id.beats_thumbnail_img);
            }
        } else if (i == 2) {
            view.findViewById(R.id.peyto_container).setVisibility(8);
            view.findViewById(R.id.cinco_container).setVisibility(0);
            this.e = (GifMovieView) view.findViewById(R.id.cinco_gif_view);
            this.f = (ImageView) view.findViewById(R.id.cinco_thumbnail_img);
        } else if (i == 8) {
            view.findViewById(R.id.peyto_container).setVisibility(8);
            view.findViewById(R.id.athens_container).setVisibility(0);
            this.e = (GifMovieView) view.findViewById(R.id.athens_gif_view);
            this.f = (ImageView) view.findViewById(R.id.athens_thumbnail_img);
        } else if (i == 17) {
            view.findViewById(R.id.peyto_container).setVisibility(8);
            view.findViewById(R.id.venice_container).setVisibility(0);
            this.e = (GifMovieView) view.findViewById(R.id.venice_gif_view);
            this.f = (ImageView) view.findViewById(R.id.venice_thumbnail_img);
        } else if (i == 12) {
            view.findViewById(R.id.peyto_container).setVisibility(8);
            view.findViewById(R.id.aneto_container).setVisibility(0);
            this.e = (GifMovieView) view.findViewById(R.id.aneto_gif_view);
            this.f = (ImageView) view.findViewById(R.id.aneto_thumbnail_img);
        }
        int i3 = this.t;
        if (i3 == 2 || i3 == 1) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            if (getContext() != null) {
                layoutParams2.topMargin = (int) ViewUtils.dp2px(getContext(), 10.0f);
                layoutParams2.bottomMargin = (int) ViewUtils.dp2px(getContext(), 10.0f);
                this.d.setLayoutParams(layoutParams2);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.title_tv);
        TextView textView2 = (TextView) view.findViewById(R.id.tips_tv);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.c = (WatchSkinInfo) arguments.getParcelable(WatchSkinConstant.ARGS_SKIN_INFO);
            z2 = arguments.getBoolean("from_local");
        } else {
            z2 = false;
        }
        if (this.c == null) {
            return;
        }
        I();
        if (z2) {
            W();
            this.b = this.c.skinBin;
            Z(this.a, false);
        } else {
            H();
            V();
        }
        textView.setText(this.c.name);
        if (z2 || ConfigHelperKt.hasFeature(this.s, Feature.HIDE_WATCH_SKIN_DOWNLOAD_TIME) || ConfigHelperKt.hasFeature(this.s, Feature.GT_SOURCE_S)) {
            textView2.setText(this.c.skinSize);
        } else {
            Resources resources = getResources();
            int i4 = R.plurals.download_time;
            int i5 = this.c.downloads;
            textView2.setText(String.format("%s  %s", this.c.skinSize, resources.getQuantityString(i4, i5, Integer.valueOf(i5))));
        }
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            getDialog().getWindow().requestFeature(1);
        }
    }

    private void H() {
        this.b = WatchSkinManager.getDownloadPath(DeviceXFunctionsKt.getDeviceXApplication(), this.c.skinBin, false);
        HMLog.i(w, "download watch skin file path: " + this.b, new Object[0]);
        try {
            File file = new File(this.b);
            if (file.exists()) {
                HMLog.d(w, "file exists.", new Object[0]);
                Z(this.a, false);
                return;
            }
            this.v = false;
            HMLog.d(w, "file not exists.", new Object[0]);
            HMLog.i(w, "initSkinInfo mkdir: " + file.getParentFile().mkdirs(), new Object[0]);
            this.a.setOnClickListener(new View.OnClickListener() { // from class: oj8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.J(view);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void I() {
        this.l = getString(R.string.sync_watch_skin);
        this.m = getString(R.string.try_again);
        this.n = getString(R.string.device_connecting);
        this.o = getString(R.string.watch_data_syncing);
        this.p = getString(R.string.watch_skin_sync_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        WatchSkinDownloader watchSkinDownloader = new WatchSkinDownloader(this.c.skinBin, this.b);
        this.k = watchSkinDownloader;
        watchSkinDownloader.setProgressListener(new d(this));
        this.k.startDownload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(WatchSkinState watchSkinState) {
        Progress progress = watchSkinState.getProgress();
        if (progress != null) {
            int i = progress.total;
            this.a.setProgress(i == 0 ? 0.0f : progress.progress / i);
        }
        switch (c.a[watchSkinState.getPageState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                b0(watchSkinState.getPageState());
                break;
            case 4:
                this.d.setText(getString(R.string.watch_storage_full));
                this.a.setState(1, this.l);
                f0(6);
                break;
            case 6:
                d0();
                break;
            case 7:
                c0();
                break;
            case 8:
                a0();
                break;
            case 9:
                Y();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(View view) {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(View view) {
        this.d.setText(this.n);
        f0(0);
        this.a.setState(2, this.l);
        this.q.postDelayed(this.r, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        f0(6);
        if (J.getValue().isBluetoothEnable()) {
            this.d.setText(getString(R.string.watch_skin_conn_fail));
            this.a.setState(1, this.l);
            this.a.setOnClickListener(new View.OnClickListener() { // from class: rj8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.M(view);
                }
            });
        } else {
            this.a.setState(1, this.l);
            this.d.setText(getString(R.string.watch_skin_open_bluetooth));
            this.a.setOnClickListener(new View.OnClickListener() { // from class: qj8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.L(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(View view) {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(View view) {
        h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(View view) {
        this.j.startSyncData(HMDeviceType.MILI);
        this.a.setState(2, this.l);
        this.d.setText(this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(View view) {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(View view) {
        h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(Runnable runnable, View view) {
        this.a.removeCallbacks(runnable);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public /* synthetic */ void U(DialogInterface dialogInterface, int i) {
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(0, true);
                HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(getContext(), hMDeviceType, false, true);
            } else {
                HMFwUpgradeManager.getInstance().enableFwUpgrade(0, true);
                HMFwUpgradeManager.getInstance().checkFwUpgrade(getContext(), HMDeviceType.MILI, false, true);
            }
        } else {
            HMFwUpgradeManager.getInstance().enableFwUpgrade(0, true);
            HMFwUpgradeManager.getInstance().checkFwUpgrade(getContext(), HMDeviceType.MILI, false, true);
        }
        dialogInterface.dismiss();
    }

    private void V() {
        String[] strArr = this.c.thumbnails;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (String str : strArr) {
            if (str.endsWith(".gif") || str.endsWith(".GIF")) {
                this.e.setVisibility(0);
                this.f.setVisibility(8);
                HMImageLoader.with(getContext()).load(str).asFile().into(new a());
                WatchSkinManager.saveThumbnail(DeviceXFunctionsKt.getDeviceXApplication(), F(), this.c.thumbnails[0]);
                return;
            }
        }
        int i = this.t;
        if (i == 4 || i == 5 || i == 6) {
            HMImageLoader.with(getActivity()).load(this.c.thumbnails[0]).asBitmap().into(new b());
        } else {
            HMImageLoader.with(DeviceXFunctionsKt.getDeviceXApplication()).load(this.c.thumbnails[0]).into(this.f);
        }
        WatchSkinManager.saveThumbnail(DeviceXFunctionsKt.getDeviceXApplication(), F(), this.c.thumbnails[0]);
    }

    private void W() {
        this.f.setImageBitmap(BitmapFactory.decodeFile(this.c.thumbnails[0]));
    }

    private void X() {
        this.u.getWatchSkinLiveData().observe(this, new Observer() { // from class: kj8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.K((WatchSkinState) obj);
            }
        });
    }

    private void Y() {
        HMLog.i(w, "can not sync for low battery.", new Object[0]);
        this.d.setText(ConfigHelperKt.hasFeature(this.s, Feature.WATCH_SOURCE_S) ? R.string.watch_skin_low_battery : R.string.watch_skin_low_battery_tempo);
        this.a.setState(2, this.l);
        f0(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(WatchSkinProgressView watchSkinProgressView, boolean z2) {
        watchSkinProgressView.setState(1, this.l);
        watchSkinProgressView.setOnClickListener(null);
        DeviceManagerApi deviceManagerApi = this.j;
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        Lazy<DeviceManagerApi> lazy = J;
        if (!lazy.getValue().isBluetoothEnable()) {
            HMLog.i(w, "bluetooth disable.", new Object[0]);
            f0(6);
            this.d.setText(getString(R.string.watch_skin_open_bluetooth));
            watchSkinProgressView.setOnClickListener(new View.OnClickListener() { // from class: tj8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.O(view);
                }
            });
            return;
        }
        if (!lazy.getValue().isConnected(hMDeviceType)) {
            HMLog.i(w, "device is connecting.", new Object[0]);
            this.d.setText(this.n);
            watchSkinProgressView.setState(2, this.l);
            f0(0);
            this.q.postDelayed(this.r, 30000L);
            return;
        }
        if (lazy.getValue().isSyncingData(hMDeviceType)) {
            HMLog.i(w, "data syncing.", new Object[0]);
            this.d.setText(this.o);
            watchSkinProgressView.setState(2, this.l);
            f0(1);
            return;
        }
        if (HMAgpsUpgradeManager.getAgpsProgress() != null) {
            HMLog.i(w, "agps upgrading.", new Object[0]);
            this.d.setText(R.string.watch_skin_agps_upgrading);
            this.a.setState(2, this.l);
            f0(7);
            return;
        }
        HMLog.i(w, "ready to sync skin.", new Object[0]);
        f0(2);
        if (z2) {
            h0();
        } else {
            watchSkinProgressView.setOnClickListener(new View.OnClickListener() { // from class: nj8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.P(view);
                }
            });
        }
    }

    private void a0() {
        this.d.setText(R.string.fw_version_low);
        this.a.setState(2, this.l);
        f0(6);
        g0();
    }

    private void b0(WatchSkinError watchSkinError) {
        JsCallBackFunction jsCallBackFunction = this.g;
        if (jsCallBackFunction != null && watchSkinError == WatchSkinError.FAIL) {
            jsCallBackFunction.onCallBack(SyncWatchSkinHandler.getError(SyncWatchSkinHandler.SYNC_ERROR_CODE, SyncWatchSkinHandler.SYNC_ERROR_MSG));
        }
        this.a.setState(1, this.l);
        f0(6);
        if (!J.getValue().isBluetoothEnable()) {
            f0(6);
            this.d.setText(getString(R.string.watch_skin_open_bluetooth));
            this.a.setOnClickListener(new View.OnClickListener() { // from class: sj8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.R(view);
                }
            });
            return;
        }
        int i = c.a[watchSkinError.ordinal()];
        if (i == 1) {
            this.d.setText(getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_sporting : R.string.local_watch_skin_sporting_band));
        } else if (i == 2) {
            this.d.setText(getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_timing : R.string.local_watch_skin_timing_band));
        } else if (i != 3) {
            this.d.setText(this.p);
        } else {
            this.d.setText(getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_music : R.string.local_watch_skin_music_band));
        }
        this.a.setOnClickListener(new View.OnClickListener() { // from class: uj8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.S(view);
            }
        });
    }

    private void c0() {
        this.a.setProgress(0.0f);
        this.a.setState(3, getString(R.string.watch_skin_syncing));
        this.d.setText("");
        f0(5);
    }

    private void d0() {
        JsCallBackFunction jsCallBackFunction = this.g;
        if (jsCallBackFunction != null) {
            if (this.v) {
                jsCallBackFunction.onCallBack(SyncWatchSkinHandler.getSuccess(SyncWatchSkinHandler.CACHE_SYNC_SUCCESS_CODE, SyncWatchSkinHandler.CACHE_SYNC_SUCCESS_MSG));
            } else {
                jsCallBackFunction.onCallBack(SyncWatchSkinHandler.getSuccess(SyncWatchSkinHandler.DOWNLOAD_SYNC_SUCCESS_CODE, SyncWatchSkinHandler.DOWNLOAD_SYNC_SUCCESS_MSG));
            }
        }
        this.a.setState(1, getString(R.string.watch_skin_sync_done));
        this.d.setText("");
        f0(2);
        final lj8 lj8Var = new lj8(this);
        this.a.postDelayed(lj8Var, 3000L);
        this.a.setOnClickListener(new View.OnClickListener() { // from class: vj8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.T(lj8Var, view);
            }
        });
    }

    private long[] e0(String str) {
        long[] jArr = new long[2];
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            fileInputStream.skip(18L);
            byte[] bArr = new byte[4];
            fileInputStream.read(bArr);
            jArr[0] = GattUtils.bytesToLong(bArr, 0, 4);
            fileInputStream.skip(10L);
            byte[] bArr2 = new byte[4];
            fileInputStream.read(bArr2);
            jArr[1] = GattUtils.bytesToLong(bArr2, 0, 4);
        } catch (Exception e2) {
            HMLog.i(w, "readDialSize e: " + e2, new Object[0]);
        }
        return jArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i) {
        this.h = i;
        if (i == 4 || i == 2 || i == 6) {
            setCancelable(true);
        } else {
            setCancelable(false);
        }
    }

    private void g0() {
        new AlertDialogFragment.Builder(getContext()).setPositiveButton(R.string.update_now, new DialogInterface.OnClickListener() { // from class: jj8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.U(dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setCancelable(false).setMessage(HMDeviceConfig.hasBoundWatch() ? R.string.fw_upgrade_tips_watch : R.string.fw_upgrade_tips).show(requireActivity().getSupportFragmentManager());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        this.u.syncWatchSkin(this.c.fwVersion, null, this.b, new DefaultDialInfoReader());
    }

    private boolean i0() {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) J.getValue().getDevice(HMDeviceType.MILI);
        if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            HMLog.i(w, "device null or disconnect", new Object[0]);
            return false;
        }
        DeviceInfo deviceInfo = hMMiLiProDevice.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.i(w, "device info null", new Object[0]);
            return false;
        }
        com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo.getDeviceFeature();
        if (deviceFeature != null) {
            return deviceFeature.hasSw(15);
        }
        HMLog.i(w, "feature null", new Object[0]);
        return false;
    }

    private void j0() {
        if (this.j.getBatteryInfo(HMDeviceType.MILI).getLevel() > 10) {
            WatchSkinSyncManager.getInstance().syncSkin(null, this.b, null, new e(this));
            return;
        }
        HMLog.i(w, "can not sync for low battery.", new Object[0]);
        this.d.setText(ConfigHelperKt.hasFeature(this.s, Feature.WATCH_SOURCE_S) ? R.string.watch_skin_low_battery : R.string.watch_skin_low_battery_tempo);
        this.a.setState(2, this.l);
        f0(6);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            this.d.setText(this.n);
            this.a.setState(2, this.l);
            f0(0);
            this.q.postDelayed(this.r, 30000L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        EventBus.getDefault().registerSticky(this);
        this.u = (WatchSkinViewModel) new ViewModelProvider(this).get(WatchSkinViewModel.class);
        HMDeviceSource boundDeviceSource = J.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        this.s = boundDeviceSource;
        this.t = WatchSkinUtils.getWatchfaceType(boundDeviceSource);
        View viewInflate = layoutInflater.inflate(R.layout.dialog_watch_skin_detail, viewGroup, false);
        this.q = new Handler(Looper.getMainLooper());
        this.r = new Runnable() { // from class: mj8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.N();
            }
        };
        G(viewInflate);
        X();
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SHOWING = false;
        EventBus.getDefault().unregister(this);
        this.q.removeCallbacksAndMessages(null);
    }

    public void onEventMainThread(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        JsCallBackFunction jsCallBackFunction;
        HMDeviceType deviceType = hMDeviceConnectionEvent.getDeviceType();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (deviceType == hMDeviceType && this.h == 0) {
            if (!hMDeviceConnectionEvent.isConnected()) {
                if (!hMDeviceConnectionEvent.isConnectingTimeout() || (jsCallBackFunction = this.g) == null) {
                    return;
                }
                jsCallBackFunction.onCallBack(SyncWatchSkinHandler.getError(SyncWatchSkinHandler.DEVICE_CONN_ERROR_CODE, SyncWatchSkinHandler.DEVICE_CONN_ERROR_MSG));
                return;
            }
            this.q.removeCallbacksAndMessages(null);
            if (this.j.isSyncingData(hMDeviceType)) {
                this.a.setState(2, this.l);
                this.d.setText(this.o);
                f0(1);
            } else if (HMAgpsUpgradeManager.getAgpsProgress() != null) {
                this.d.setText(R.string.watch_skin_agps_upgrading);
                this.a.setState(2, this.l);
                f0(7);
            } else {
                f0(2);
                this.d.setText("");
                this.a.setState(1, this.l);
                h0();
            }
        }
    }

    public void setFunction(JsCallBackFunction jsCallBackFunction) {
        this.g = jsCallBackFunction;
    }

    public void onEventMainThread(HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent) {
        if (this.h != 7) {
            return;
        }
        if ((hMDeviceFwUpgradeEvent.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_CEP || hMDeviceFwUpgradeEvent.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_NMEA) && hMDeviceFwUpgradeEvent.isStop()) {
            this.a.setState(1, this.l);
            this.d.setText("");
            f0(2);
            h0();
        }
    }

    public void onEventMainThread(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
        HMDeviceType deviceType = hMDeviceSyncDataEvent.getDeviceType();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (deviceType == hMDeviceType && this.h == 1 && hMDeviceSyncDataEvent.isStop()) {
            if (hMDeviceSyncDataEvent.getResult()) {
                if (HMAgpsUpgradeManager.getAgpsProgress() != null) {
                    this.d.setText(R.string.watch_skin_agps_upgrading);
                    this.a.setState(2, this.l);
                    f0(7);
                    return;
                } else {
                    this.a.setState(1, this.l);
                    this.d.setText("");
                    f0(2);
                    h0();
                    return;
                }
            }
            f0(6);
            this.a.setState(1, this.l);
            this.d.setText(this.p);
            this.a.setOnClickListener(new View.OnClickListener() { // from class: pj8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.Q(view);
                }
            });
        }
    }
}
