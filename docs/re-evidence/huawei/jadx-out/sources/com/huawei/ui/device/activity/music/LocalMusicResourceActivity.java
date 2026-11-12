package com.huawei.ui.device.activity.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicMenu;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.device.R;
import com.huawei.ui.device.fragment.music.AlbumFragment;
import com.huawei.ui.device.fragment.music.BaseLocalMusicAdapter;
import com.huawei.ui.device.fragment.music.BaseLocalMusicFragment;
import com.huawei.ui.device.fragment.music.FolderFragment;
import com.huawei.ui.device.fragment.music.SingerFragment;
import com.huawei.ui.device.fragment.music.SongFragment;
import defpackage.lzq;
import defpackage.lzu;
import defpackage.qpn;
import defpackage.qpx;
import defpackage.qre;
import defpackage.rft;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class LocalMusicResourceActivity extends BaseActivity {
    private HealthViewPager ac;
    private CustomTitleBar ad;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LocalMusicResourceActivity f24433c;
    private String e;
    private BaseLocalMusicFragment g;
    private LinearLayout j;
    private LinearLayout l;
    private HealthProgressBar p;
    private HealthSubTabWidget t;
    private ArrayList<String> v;
    private HealthToolBar w;
    private int y = 0;
    private int s = 0;
    private int q = 0;
    private boolean k = false;
    private int f = 2;
    private MusicMenu h = new MusicMenu();
    private List<MusicSong> r = new ArrayList(16);
    private ArrayList<MusicSong> d = new ArrayList<>(16);
    private SongFragment u = null;
    private SingerFragment x = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlbumFragment f24432b = null;
    private FolderFragment n = null;
    private ArrayList<Fragment> m = new ArrayList<>(16);
    private String i = "";
    private b o = new b(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f24431a = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.music.LocalMusicResourceActivity.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("LocalMusicResourceActivity", "receiver intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("LocalMusicResourceActivity", "receiver intent: ", action);
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                if (deviceInfo == null) {
                    LogUtil.j("LocalMusicResourceActivity", "receiver deviceInfo is null");
                    return;
                }
                if (!lzq.d(deviceInfo)) {
                    LogUtil.j("LocalMusicResourceActivity", "This device does not have the correspond capability.");
                    return;
                }
                LocalMusicResourceActivity.this.f = deviceInfo.getDeviceConnectState();
                int i = LocalMusicResourceActivity.this.f;
                if (i == 1) {
                    LogUtil.a("LocalMusicResourceActivity", "device connecting");
                    return;
                }
                if (i == 2) {
                    LogUtil.a("LocalMusicResourceActivity", "device connected");
                } else if (i != 3) {
                    LogUtil.j("LocalMusicResourceActivity", "device state is unknown");
                } else {
                    LogUtil.a("LocalMusicResourceActivity", "device disconnected");
                }
            }
        }
    };

    private void o() {
        try {
            unregisterReceiver(this.f24431a);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("LocalMusicResourceActivity", "unregister broadcast occur IllegalArgumentException.");
        }
    }

    private void l() {
        LogUtil.a("LocalMusicResourceActivity", "Enter registerConnectStateBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.f24433c, this.f24431a, intentFilter, LocalBroadcast.f36595c, null);
    }

    static class b extends BaseHandler<LocalMusicResourceActivity> {
        b(LocalMusicResourceActivity localMusicResourceActivity) {
            super(localMusicResourceActivity);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(LocalMusicResourceActivity localMusicResourceActivity, Message message) {
            if (localMusicResourceActivity == null || message == null) {
                return;
            }
            if (message.what == 1014) {
                d(localMusicResourceActivity);
            } else {
                LogUtil.j("LocalMusicResourceActivity", "handleMessageWhenReferenceNotNull unknown message");
            }
        }

        private void d(LocalMusicResourceActivity localMusicResourceActivity) {
            LogUtil.a("LocalMusicResourceActivity", "refreshLocalMusicUi enter");
            localMusicResourceActivity.t.setVisibility(0);
            localMusicResourceActivity.j.setVisibility(0);
            e(localMusicResourceActivity);
            localMusicResourceActivity.l.setVisibility(8);
        }

        private void e(LocalMusicResourceActivity localMusicResourceActivity) {
            if (localMusicResourceActivity.r == null || localMusicResourceActivity.d == null || localMusicResourceActivity.w == null) {
                return;
            }
            if (localMusicResourceActivity.r.size() == localMusicResourceActivity.d.size()) {
                localMusicResourceActivity.w.setVisibility(8);
            } else {
                localMusicResourceActivity.w.setVisibility(0);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.activity_local_music_resouce);
        clearBackgroundDrawable();
        this.f24433c = this;
        this.ad = (CustomTitleBar) findViewById(R.id.local_music_resource_titlebar);
        this.t = (HealthSubTabWidget) findViewById(R.id.hw_local_music_tabs);
        this.ac = (HealthViewPager) findViewById(R.id.hw_local_music_viewpager);
        this.w = (HealthToolBar) findViewById(R.id.select_toolbar);
        this.j = (LinearLayout) findViewById(R.id.local_music_data_layout);
        this.l = (LinearLayout) findViewById(R.id.local_music_load_layout);
        HealthProgressBar healthProgressBar = (HealthProgressBar) findViewById(R.id.local_music_load_progressbar);
        this.p = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            this.h = lzu.c().b();
            this.v = extras.getStringArrayList("device_support_music_type_list");
            this.s = extras.getInt("max_music_number", this.s);
            this.y = extras.getInt("watch_remaining_space", this.y);
            this.q = extras.getInt("musicCount", this.q);
        }
        l();
        h();
        i();
        f();
        HealthViewPager healthViewPager = this.ac;
        if (healthViewPager != null) {
            healthViewPager.setScrollHeightArea(200);
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.device.activity.music.LocalMusicResourceActivity.5
            @Override // java.lang.Runnable
            public void run() {
                LocalMusicResourceActivity.this.g();
            }
        });
        this.i = SharedPreferenceManager.e(this, Integer.toString(10024), "local_music_is_first_enter");
        this.ad.setRightButtonClickable(false);
        this.ad.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_ok_un_click), qre.f(R.string.IDS_contact_confirm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("LocalMusicResourceActivity", "initLocalMusicList enter");
        rft rftVar = new rft();
        ArrayList<MusicSong> arrayList = new ArrayList<>(16);
        List<MusicSong> listA = rftVar.a(this.f24433c, this.v);
        this.r = listA;
        for (MusicSong musicSong : listA) {
            if (this.h == null) {
                LogUtil.j("LocalMusicResourceActivity", "mDefaultMusicMenu is null.");
            } else {
                LogUtil.a("LocalMusicResourceActivity", "localeName:", musicSong.getSongName(), "localeSinger:", musicSong.getSongSingerName());
                Iterator<MusicSong> it = this.h.getMusicSongsList().iterator();
                while (it.hasNext()) {
                    e(musicSong, it.next(), arrayList);
                }
            }
        }
        LogUtil.a("LocalMusicResourceActivity", "mLocalMusicLists size:", Integer.valueOf(this.r.size()), "repeatMusicList size:", Integer.valueOf(arrayList.size()));
        this.d = arrayList;
        LogUtil.a("LocalMusicResourceActivity", "send UPDATE_LOCAL_MUSIC_UI_MESSAGE:");
        Message messageObtainMessage = this.o.obtainMessage();
        messageObtainMessage.what = 1014;
        this.o.sendMessage(messageObtainMessage);
    }

    private void e(MusicSong musicSong, MusicSong musicSong2, ArrayList<MusicSong> arrayList) {
        if (musicSong2.getSongName() == null || !Objects.equals(musicSong2.getSongName(), musicSong.getSongName())) {
            return;
        }
        LogUtil.a("LocalMusicResourceActivity", "remoteName:", musicSong2.getSongName(), "remoteSinger:", musicSong2.getSongSingerName());
        if (musicSong2.getSongSingerName() != null) {
            if (Objects.equals(musicSong2.getSongSingerName(), musicSong.getSongSingerName())) {
                arrayList.add(musicSong);
                return;
            }
            return;
        }
        arrayList.add(musicSong);
    }

    private void e(final ArrayList<MusicSong> arrayList) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(getResources().getString(R.string.IDS_hw_health_music_add_music_tip));
        builder.a(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.LocalMusicResourceActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.e(LocalMusicResourceActivity.this, Integer.toString(10024), "local_music_is_first_enter", "true", new StorageParams());
                Intent intent = new Intent();
                lzu.c().a(arrayList);
                LocalMusicResourceActivity.this.setResult(1, intent);
                LocalMusicResourceActivity.this.finish();
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    private void h() {
        this.ad.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_public_ok), qre.f(R.string.IDS_contact_confirm));
        this.ad.setRightButtonVisibility(0);
        this.ad.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.LocalMusicResourceActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (LocalMusicResourceActivity.this.f == 2) {
                    LocalMusicResourceActivity.this.j();
                } else {
                    qpx.e(LocalMusicResourceActivity.this.f24433c, LocalMusicResourceActivity.this.getResources().getString(R.string.IDS_hw_health_music_check_bluetooth_connection));
                }
            }
        });
        this.ad.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.LocalMusicResourceActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LocalMusicResourceActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ArrayList<MusicSong> arrayList = new ArrayList<>(16);
        ArrayList<Fragment> arrayList2 = this.m;
        if (arrayList2 != null && arrayList2.size() > 0) {
            BaseLocalMusicFragment baseLocalMusicFragment = this.m.get(0) instanceof BaseLocalMusicFragment ? (BaseLocalMusicFragment) this.m.get(0) : null;
            if (baseLocalMusicFragment != null) {
                arrayList.addAll(baseLocalMusicFragment.b());
            }
        }
        LogUtil.a("LocalMusicResourceActivity", "setRightTextButtonOnClickListener size==", Integer.valueOf(arrayList.size()));
        if (arrayList.size() > 0) {
            if (b(arrayList)) {
                LogUtil.a("LocalMusicResourceActivity", "insufficientSpaceWatch");
                return;
            }
            if (!"true".equals(this.i)) {
                e(arrayList);
                return;
            }
            Intent intent = new Intent();
            lzu.c().a(arrayList);
            setResult(1, intent);
            finish();
        }
    }

    private boolean b(ArrayList<MusicSong> arrayList) {
        int i = this.s;
        int size = arrayList.size();
        int size2 = this.h.getMusicSongsList().size();
        if (lzu.c().h()) {
            size2 = this.q;
        }
        LogUtil.e("LocalMusicResourceActivity", "maxMusicNumber: ", Integer.valueOf(i), " addSongListsSize: ", Integer.valueOf(size), " tempMusicCount: ", Integer.valueOf(size2));
        Iterator<MusicSong> it = arrayList.iterator();
        long songSize = 0;
        while (it.hasNext()) {
            songSize += it.next().getSongSize();
        }
        long j = songSize / 1048576;
        int i2 = this.y;
        LogUtil.e("LocalMusicResourceActivity", "sumConversionMusicListMemory:", Long.valueOf(j), " storageMemory:", Integer.valueOf(i2));
        if (i2 < j) {
            c(R.string.IDS_hw_health_music_insufficient_space_watch, getResources().getQuantityString(R.plurals.IDS_hw_health_music_insufficient_space_watch_content, 0, Integer.valueOf(this.y), Integer.valueOf(this.y / 5)));
            return true;
        }
        if (size + size2 <= i) {
            return false;
        }
        c(R.string.IDS_hw_health_music_insufficient_number_watch, getResources().getQuantityString(R.plurals.IDS_hw_health_music_insufficient_number_watch_content, 0, Integer.valueOf(i)));
        return true;
    }

    private void c(int i, String str) {
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f24433c);
        builder.d(i);
        builder.e(str);
        builder.a(R.string.IDS_user_permission_know, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.music.LocalMusicResourceActivity.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                LogUtil.a("LocalMusicResourceActivity", "OK!");
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        if (customAlertDialogB != null) {
            customAlertDialogB.show();
        }
    }

    private void i() {
        this.u = new SongFragment();
        this.x = new SingerFragment();
        this.f24432b = new AlbumFragment();
        this.n = new FolderFragment();
        this.m.add(this.u);
        this.m.add(this.x);
        this.m.add(this.f24432b);
        this.m.add(this.n);
        d(this.u);
        n();
        this.ac.setOffscreenPageLimit(16);
        this.e = MusicSong.SORT_TYPE_SONG;
        k();
    }

    private void f() {
        this.w.d(View.inflate(this, R.layout.hw_toolbar_bottomview, null));
        this.w.setIcon(2, R.drawable.ic_public_select_all);
        this.w.setIconTitle(2, getResources().getString(R.string.IDS_contact_delete_select_all));
        this.w.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.ui.device.activity.music.LocalMusicResourceActivity.7
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public void onSingleTap(int i) {
                if (i == 2) {
                    LocalMusicResourceActivity.this.g.d(LocalMusicResourceActivity.this.k);
                }
            }
        });
    }

    private void n() {
        qpn qpnVar = new qpn(this, this.ac, this.t);
        qpnVar.b(this.t.b(getResources().getString(R.string.IDS_hw_health_music_music)), this.u, true);
        qpnVar.b(this.t.b(getResources().getString(R.string.IDS_hw_health_music_singer)), this.x, false);
        qpnVar.b(this.t.b(getResources().getString(R.string.IDS_hw_health_music_album)), this.f24432b, false);
        qpnVar.b(this.t.b(getResources().getString(R.string.IDS_hw_health_music_folder)), this.n, false);
    }

    private void k() {
        this.ac.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.device.activity.music.LocalMusicResourceActivity.10
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                LogUtil.a("LocalMusicResourceActivity", "CoreSleep onPageSelected position = ", Integer.valueOf(i));
                if (i == 0) {
                    LocalMusicResourceActivity.this.e = MusicSong.SORT_TYPE_SONG;
                    if (LocalMusicResourceActivity.this.r == null || LocalMusicResourceActivity.this.d == null || LocalMusicResourceActivity.this.w == null) {
                        return;
                    }
                    if (LocalMusicResourceActivity.this.r.size() == LocalMusicResourceActivity.this.d.size()) {
                        LocalMusicResourceActivity.this.w.setVisibility(8);
                        return;
                    } else {
                        LocalMusicResourceActivity.this.w.setVisibility(0);
                        return;
                    }
                }
                if (i == 1) {
                    LocalMusicResourceActivity.this.e = MusicSong.SORT_TYPE_SINGER;
                    LocalMusicResourceActivity.this.m();
                } else if (i == 2) {
                    LocalMusicResourceActivity.this.e = MusicSong.SORT_TYPE_ALBUM;
                    LocalMusicResourceActivity.this.m();
                } else if (i == 3) {
                    LocalMusicResourceActivity.this.e = MusicSong.SORT_TYPE_FOLDER;
                    LocalMusicResourceActivity.this.m();
                } else {
                    LogUtil.a("LocalMusicResourceActivity", "no this fragment");
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        BaseLocalMusicFragment baseLocalMusicFragment = this.g;
        if (baseLocalMusicFragment == null) {
            return;
        }
        BaseLocalMusicAdapter baseLocalMusicAdapterC = baseLocalMusicFragment.c();
        if (baseLocalMusicAdapterC != null && baseLocalMusicAdapterC.c() == 0) {
            this.g.d();
        }
        HealthToolBar healthToolBar = this.w;
        if (healthToolBar != null) {
            healthToolBar.setVisibility(8);
        }
    }

    public List<MusicSong> b() {
        return this.r;
    }

    public List<String> a() {
        return this.v;
    }

    public String e() {
        return this.e;
    }

    public HealthToolBar d() {
        return this.w;
    }

    public List<MusicSong> c() {
        return this.d;
    }

    public void d(BaseLocalMusicFragment baseLocalMusicFragment) {
        this.g = baseLocalMusicFragment;
    }

    public void e(int i, Boolean bool) {
        if (i == 0) {
            this.ad.setTitleText(getResources().getString(R.string.IDS_hw_health_music_add_music));
            this.ad.setRightButtonClickable(false);
            this.ad.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_ok_un_click), qre.f(R.string.IDS_contact_confirm));
        } else {
            this.ad.setTitleText(getResources().getQuantityString(R.plurals.IDS_hw_weight_delete_check_measure_data, i, Integer.valueOf(i)));
            this.ad.setRightButtonClickable(true);
            this.ad.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_public_ok), qre.f(R.string.IDS_contact_confirm));
        }
        if (bool.booleanValue()) {
            this.k = true;
            this.w.setIcon(2, R.drawable.ic_public_deselect_all);
            this.w.setIconTitle(2, getResources().getString(R.string.IDS_contact_delete_uncheck_all));
        } else {
            this.k = false;
            this.w.setIcon(2, R.drawable.ic_public_select_all);
            this.w.setIconTitle(2, getResources().getString(R.string.IDS_contact_delete_select_all));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BaseLocalMusicFragment baseLocalMusicFragment = this.g;
        if (baseLocalMusicFragment != null) {
            if (!baseLocalMusicFragment.d() || isFinishing()) {
                return;
            }
            super.onBackPressed();
            return;
        }
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
