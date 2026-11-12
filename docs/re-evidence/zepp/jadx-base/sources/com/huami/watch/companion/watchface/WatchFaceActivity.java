package com.huami.watch.companion.watchface;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicerecorder.UriGetter;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.device.config.DeviceFeature;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.facestore.SkinStoreFragment;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.sync.throttle.SyncThrottler;
import com.huami.watch.companion.ui.activity.ClipWatchFaceBgActivity;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.ui.view.PagerSlidingTabStrip;
import com.huami.watch.companion.util.AvatarTools;
import com.huami.watch.companion.watchface.WatchFaceActivity;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.RxBus;
import com.huami.watch.util.StorageUtil;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceActivity extends FragmentActivity {
    public static final String KEY_DEVICE_ID = "deviceId";
    private static final String l = "WatchFaceActivity";
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private Uri a;
    private Disposable b;
    private ViewPager c;
    private FragmentPagerAdapter d;
    private PagerSlidingTabStrip e;
    private Fragment f;
    private List<Fragment> g;
    private List<String> h;
    private TextView i;
    private ActionbarLayout j;
    private boolean k = false;

    public class a extends FragmentPagerAdapter {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            if (WatchFaceActivity.this.g != null) {
                return WatchFaceActivity.this.g.size();
            }
            return 0;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return (Fragment) WatchFaceActivity.this.g.get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public CharSequence getPageTitle(int i) {
            return (CharSequence) WatchFaceActivity.this.h.get(i);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WatchFaceActivity.this.onBackPressed();
        }
    }

    public class d implements Consumer<Object> {
        public d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(@NonNull Object obj) throws Exception {
            if (obj instanceof DisconnectedEvent) {
                if (DeviceManager.getManager(WatchFaceActivity.this).getCurrentDevice() == null) {
                    return;
                }
                WatchFaceActivity.this.n();
            } else if (obj instanceof ConnectedEvent) {
                WatchFaceActivity.this.m();
            }
        }
    }

    private void i() {
        this.b = RxBus.get().toObservable().subscribe(new d(), new Consumer() { // from class: me8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                WatchFaceActivity.l((Throwable) obj);
            }
        });
    }

    private void initView() {
        this.c = (ViewPager) findViewById(R.id.view_pager);
        this.e = (PagerSlidingTabStrip) findViewById(R.id.tab_indicator);
        this.i = (TextView) findViewById(R.id.delete);
        a aVar = new a(getSupportFragmentManager());
        this.d = aVar;
        this.c.setAdapter(aVar);
        this.e.setViewPager(this.c);
        List<String> list = this.h;
        if (list == null || list.size() <= 1) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
        }
        this.i.setOnClickListener(new b());
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.watchface_actionbar);
        this.j = actionbarLayout;
        actionbarLayout.setTitleText(getString(R.string.facestore_title));
        this.j.setBackArrowClickListener(new c());
    }

    private void j() {
        this.g = new ArrayList();
        this.h = new ArrayList();
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        if (currentDevice != null) {
            this.k = DeviceUtil.isRomSupportWatchFaceStore(currentDevice);
        }
        if (this.k) {
            this.g.add(SkinStoreFragment.newInstance(0));
            this.h.add(getString(R.string.download_watch_face));
        }
        if (DeviceUtil.isRomSupportThirdWatchFace(currentDevice)) {
            this.g.add(SkinStoreFragment.newInstance(1));
            this.h.add(getString(R.string.watch_face_third_watch_face));
        }
        if (DeviceFeature.isSupportCloudWatchFaceList(currentDevice)) {
            this.f = new WatchFaceCloudRecycleFragment();
        } else {
            this.f = new WatchFaceRecycleFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putString("deviceId", getIntent().getStringExtra("deviceId"));
        this.f.setArguments(bundle);
        this.g.add(this.f);
        this.h.add(getString(R.string.my_watch_face));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Throwable th) throws Exception {
        HMLog.warn(l, th, new Function0() { // from class: ne8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WatchFaceActivity.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Fragment fragment = this.f;
        if (fragment == null || !(fragment instanceof WatchFaceRecycleFragment)) {
            return;
        }
        ((WatchFaceRecycleFragment) fragment).onConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Fragment fragment = this.f;
        if (fragment == null || !(fragment instanceof WatchFaceRecycleFragment)) {
            return;
        }
        ((WatchFaceRecycleFragment) fragment).onDisconnected();
    }

    private void o() {
        Fragment fragment = this.f;
        if (fragment == null || !(fragment instanceof WatchFaceRecycleFragment)) {
            return;
        }
        ((WatchFaceRecycleFragment) fragment).onUnbound();
    }

    private void p(Uri uri, boolean z) {
        this.a = AvatarTools.getWatchFaceCroppedImageUri(this, uri);
        Intent intent = new Intent(this, (Class<?>) ClipWatchFaceBgActivity.class);
        intent.setDataAndType(uri, UriGetter.ShareContentType.IMAGE);
        intent.putExtra("output", this.a);
        intent.putExtra("isNeedCheckDuplicate", z);
        startActivityForResult(intent, 2);
    }

    public static void to(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WatchFaceActivity.class);
        intent.addFlags(536870912);
        intent.putExtra("deviceId", str);
        context.startActivity(intent);
    }

    public void checkDeviceState() {
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        if (currentDevice == null) {
            o();
        } else if (currentDevice.isConnected()) {
            m();
        } else {
            n();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        File imageCaptureFile;
        if (i2 != -1) {
            return;
        }
        if (i != 0) {
            if (i == 1 && (imageCaptureFile = StorageUtil.getImageCaptureFile(this)) != null) {
                p(Uri.fromFile(imageCaptureFile), false);
            }
        } else if (intent != null && intent.getData() != null) {
            p(intent.getData(), true);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.c.getCurrentItem();
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_watchface);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        j();
        initView();
        i();
        if (SyncThrottler.isThrough(SyncThrottler.SYNC_WATCHFACES)) {
            SyncUtil.syncWatchFacesFromWatch(Transporter.get(this, "com.huami.watch.companion"));
            SyncThrottler.updateSyncTime(SyncThrottler.SYNC_WATCHFACES);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.b.dispose();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkDeviceState();
        Analytics.startSession(this);
    }

    public void updateDeleteTitle(String str) {
        this.i.setText(str);
    }

    public void updateTitle(String str) {
        this.j.setTitleText(str);
    }
}
