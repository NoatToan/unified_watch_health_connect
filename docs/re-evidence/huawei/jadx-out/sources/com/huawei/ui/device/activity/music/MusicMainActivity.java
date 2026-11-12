package com.huawei.ui.device.activity.music;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.Formatter;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicBinder;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicControllerCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicFolderStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicMenu;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationData;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.OperationStruct;
import com.huawei.hwdevice.mainprocess.service.SyncMusicService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.music.MusicMainActivity;
import com.huawei.ui.device.views.music.LocalMusicSearchThreadManager;
import com.huawei.ui.device.views.music.MenuListAdapter;
import com.huawei.ui.device.views.music.MusicMenuViewDialog;
import com.huawei.ui.device.views.music.MusicNestedScrollLayout;
import com.huawei.ui.device.views.music.MusicSongsListAdapter;
import defpackage.idy;
import defpackage.lvb;
import defpackage.lzl;
import defpackage.lzq;
import defpackage.lzt;
import defpackage.lzu;
import defpackage.maa;
import defpackage.mai;
import defpackage.mao;
import defpackage.mgg;
import defpackage.mgt;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class MusicMainActivity extends BaseActivity implements View.OnClickListener, LocalMusicSearchThreadManager.SearchCallback {
    private static boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f24439a;
    private HealthTextView aa;
    private ImageView ab;
    private String ac;
    private lvb ad;
    private lzl ah;
    private RelativeLayout ak;
    private CustomProgressDialog.Builder al;
    private CustomProgressDialog an;
    private HealthToolBar ao;
    private HealthProgressBar aq;
    private String ar;
    private HealthSubHeader at;
    private a av;
    private TextView ax;
    private MusicNestedScrollLayout ay;
    private LinearLayout az;
    private RelativeLayout ba;
    private HealthTextView bb;
    private LocalMusicSearchThreadManager bc;
    private String bd;
    private HealthTextView be;
    private LinearLayout bf;
    private SyncMusicBinder bj;
    private LinearLayout bk;
    private HealthToolBar bl;
    private HealthTextView bn;
    private HealthProgressBar bo;
    private TextView bp;
    private LinearLayout bq;
    private HealthTextView bv;
    private LinearLayout d;
    private MusicSongsListAdapter f;
    private LinearLayout g;
    private RecyclerView h;
    private HealthSubHeader i;
    private RecyclerView j;
    private MusicMainActivity l;
    private TextView m;
    private CustomTitleBar o;
    private LinearLayout p;
    private LinearLayout t;
    private View u;
    private HealthTextView v;
    private HealthTextView w;
    private HealthSearchView z;
    private int bh = 0;
    private int ap = 0;
    private int as = 0;
    private int au = 0;
    private List<String> bg = new ArrayList(16);
    private ArrayList<MusicMenu> q = new ArrayList<>(16);
    private MusicMenu n = new MusicMenu();
    private j y = new j(this);
    private ArrayList<MusicSong> br = new ArrayList<>(16);
    private ArrayList<MusicSong> x = new ArrayList<>(16);
    private boolean ai = false;
    private ArrayList<MusicSong> am = new ArrayList<>(16);
    private SparseIntArray ae = new SparseIntArray(16);
    private boolean ag = false;
    private String r = "";
    private int s = 2;
    private c bi = new c(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f24440b = new HashMap(16);
    private ServiceConnection bm = new ServiceConnection() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder instanceof SyncMusicBinder) {
                MusicMainActivity.this.bj = (SyncMusicBinder) iBinder;
            }
            if (MusicMainActivity.this.bj != null) {
                MusicMainActivity.this.bj.setSyncMusicListener(MusicMainActivity.this.ae());
                MusicMainActivity.this.bj.notifyUiIsSyncMusicTaskRunning();
                MusicMainActivity.this.x();
                return;
            }
            LogUtil.a("MusicMainActivity", "onServiceConnected binder is null!");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtil.a("MusicMainActivity", "onServiceDisconnected");
        }
    };
    private BroadcastReceiver k = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.14
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("MusicMainActivity", "onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("MusicMainActivity", "onReceive intent : ", action);
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                if (deviceInfo == null) {
                    LogUtil.j("MusicMainActivity", "onReceive deviceInfo is null.");
                } else {
                    if (!lzq.d(deviceInfo)) {
                        LogUtil.j("MusicMainActivity", "This device does not have the correspond capability.");
                        return;
                    }
                    MusicMainActivity.this.s = deviceInfo.getDeviceConnectState();
                    LogUtil.a("MusicMainActivity", "mConnectStateChangedReceiver, mDeviceConnectState:", Integer.valueOf(MusicMainActivity.this.s));
                }
            }
        }
    };
    private HealthToolBar.OnSingleTapListener bw = new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.25
        @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
        public void onSingleTap(int i) {
            if (!qrs.r()) {
                if (MusicMainActivity.this.s != 2) {
                    MusicMainActivity.this.m();
                    return;
                }
                if (i == 1) {
                    LogUtil.a("MusicMainActivity", "click addSong");
                    MusicMainActivity.this.s();
                    idy.b(AnalyticsValue.HEALTH_MUSIC_ADD_MUSIC_1090081.value(), MusicMainActivity.this.f24440b);
                    return;
                } else {
                    if (i == 2) {
                        ArrayList<MusicSong> arrayList = new ArrayList<>(16);
                        if (MusicMainActivity.this.q.size() >= MusicMainActivity.this.as) {
                            qpx.b(MusicMainActivity.this.l, MusicMainActivity.this.getResources().getString(R.string.IDS_hw_health_music_add_menu_exceed_limit));
                            return;
                        } else {
                            MusicMainActivity.this.d(false, arrayList, 1);
                            idy.b(AnalyticsValue.HEALTH_MUSIC_CREATE_NEW_SONG_MENU_1090082.value(), MusicMainActivity.this.f24440b);
                            return;
                        }
                    }
                    LogUtil.j("MusicMainActivity", "onSingleTapListener default.");
                    return;
                }
            }
            LogUtil.j("MusicMainActivity", "click to fast!");
        }
    };
    private HealthToolBar.OnSingleTapListener bs = new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.21
        @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
        public void onSingleTap(int i) {
            if (i == 1) {
                MusicMainActivity.this.k();
                return;
            }
            if (i == 2) {
                MusicMainActivity.this.q();
                idy.b(AnalyticsValue.HEALTH_MUSIC_HOME_ALL_SELECT_1090086.value(), MusicMainActivity.this.f24440b);
            } else {
                if (i == 3) {
                    if (MusicMainActivity.this.s == 2) {
                        MusicMainActivity.this.p();
                        return;
                    } else {
                        MusicMainActivity.this.m();
                        return;
                    }
                }
                LogUtil.j("MusicMainActivity", "onMultiSelectSingleTapListener default.");
            }
        }
    };
    private boolean aj = false;
    private int aw = 0;
    private boolean af = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f24441c = new AnonymousClass5();

    public static /* synthetic */ boolean e(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void loadApplicationTheme() {
    }

    static /* synthetic */ int w(MusicMainActivity musicMainActivity) {
        int i = musicMainActivity.au;
        musicMainActivity.au = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        PermissionUtil.d(this.l, PermissionUtil.PermissionType.MEDIA_AUDIO, new CustomPermissionAction(this.l) { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.24
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                MusicMainActivity.this.h();
            }
        });
    }

    public int e() {
        return this.s;
    }

    public j c() {
        return this.y;
    }

    public boolean g() {
        return this.ai;
    }

    public SparseIntArray a() {
        return this.ae;
    }

    public List<MusicSong> b() {
        return this.am;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y() {
        return this.bh;
    }

    public int d() {
        return this.as;
    }

    public static class j extends BaseHandler<MusicMainActivity> {
        j(MusicMainActivity musicMainActivity) {
            super(musicMainActivity);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MusicMainActivity musicMainActivity, Message message) {
            switch (message.what) {
                case 999:
                case 1001:
                    b(musicMainActivity);
                    break;
                case 1000:
                    b(musicMainActivity, message);
                    break;
                case 1002:
                case 1003:
                default:
                    e(message, musicMainActivity);
                    break;
                case 1004:
                case 1008:
                case 1009:
                    musicMainActivity.g.setVisibility(8);
                    musicMainActivity.bc();
                    break;
                case 1005:
                    e(musicMainActivity, message);
                    break;
                case 1006:
                    musicMainActivity.c(false);
                    break;
                case 1007:
                    MusicMainActivity.c(musicMainActivity, message);
                    break;
            }
        }

        private void e(Message message, MusicMainActivity musicMainActivity) {
            int i = message.what;
            if (i == 1002) {
                a(musicMainActivity);
                return;
            }
            if (i == 1003) {
                a(musicMainActivity, message);
                return;
            }
            switch (i) {
                case 1010:
                    d(musicMainActivity, message);
                    break;
                case 1011:
                    e(musicMainActivity);
                    break;
                case 1012:
                    c(musicMainActivity);
                    break;
                case 1013:
                    musicMainActivity.g.setVisibility(8);
                    break;
                case 1014:
                    musicMainActivity.aw();
                    break;
                case 1015:
                    musicMainActivity.al();
                    break;
                default:
                    LogUtil.j("MusicMainActivity", "handleMessageWhenReferenceNotNull unknown msg");
                    break;
            }
        }

        private void e(MusicMainActivity musicMainActivity) {
            musicMainActivity.f.a(new ArrayList(16));
            musicMainActivity.f.notifyDataSetChanged();
        }

        private void d(MusicMainActivity musicMainActivity, Message message) {
            if (njy.b(message.obj, MusicSong.class)) {
                d(musicMainActivity, (List<MusicSong>) message.obj);
            }
        }

        private void c(MusicMainActivity musicMainActivity) {
            if (musicMainActivity.af) {
                musicMainActivity.t.setVisibility(8);
            } else {
                musicMainActivity.bc();
            }
        }

        private void d(MusicMainActivity musicMainActivity, List<MusicSong> list) {
            if (list.size() == musicMainActivity.n.getMusicSongsList().size()) {
                musicMainActivity.ao.setIconVisible(2, 0);
            } else {
                musicMainActivity.ao.setIconVisible(2, 8);
            }
            musicMainActivity.f.a(list);
            musicMainActivity.f.notifyDataSetChanged();
        }

        private void a(MusicMainActivity musicMainActivity) {
            LogUtil.a("MusicMainActivity", "storage memory size is ", Integer.valueOf(musicMainActivity.y()));
            if (musicMainActivity.y() >= 500) {
                musicMainActivity.v.setVisibility(8);
                musicMainActivity.bv.setVisibility(8);
            } else {
                String strA = qre.a(R.string.IDS_hw_health_music_remaining_space, Formatter.formatFileSize(musicMainActivity.getApplicationContext(), 500000000L));
                musicMainActivity.v.setText(strA);
                musicMainActivity.bv.setText(strA);
            }
            if (lzu.c().h()) {
                return;
            }
            LogUtil.a("MusicMainActivity", "initShowAllTipsView is not support");
            lzu.c().b(false);
        }

        private void b(MusicMainActivity musicMainActivity) {
            musicMainActivity.av.notifyDataSetChanged();
            musicMainActivity.c(false);
            musicMainActivity.bc();
            musicMainActivity.ak();
        }

        private void e(MusicMainActivity musicMainActivity, Message message) {
            if (message == null) {
                LogUtil.j("MusicMainActivity", "updateUiWhenOneSongIsBeingTransfer, message is null.");
                return;
            }
            try {
                Bundle data = message.getData();
                if (data != null) {
                    musicMainActivity.c(data.getString("SONGNAME"), data.getString("PROGRESSTEXT"));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                LogUtil.e("MusicMainActivity", "getData error:", ExceptionUtils.c(e));
            }
        }

        private void a(MusicMainActivity musicMainActivity, Message message) {
            musicMainActivity.q.clear();
            if (njy.b(message.obj, MusicMenu.class)) {
                for (MusicMenu musicMenu : (ArrayList) message.obj) {
                    if ("0".equals(musicMenu.getMenuIndex())) {
                        musicMainActivity.n = musicMenu;
                    } else {
                        musicMainActivity.q.add(musicMenu);
                    }
                }
                musicMainActivity.f = new MusicSongsListAdapter(musicMainActivity, musicMainActivity.n.getMusicSongsList(), musicMainActivity.q);
                musicMainActivity.h.setAdapter(musicMainActivity.f);
                musicMainActivity.f.notifyDataSetChanged();
                musicMainActivity.av.notifyDataSetChanged();
                musicMainActivity.bc();
                musicMainActivity.ak();
            }
        }

        private void b(MusicMainActivity musicMainActivity, Message message) {
            if (message.obj instanceof MusicSong) {
                MusicSong musicSong = (MusicSong) message.obj;
                musicMainActivity.n.getMusicSongsList().remove(musicSong);
                MusicMainActivity.w(musicMainActivity);
                musicMainActivity.ak();
                if (musicMainActivity.f != null) {
                    musicMainActivity.f.e(musicSong);
                    musicMainActivity.av.notifyDataSetChanged();
                    musicMainActivity.f.notifyDataSetChanged();
                }
                musicMainActivity.bc();
                musicMainActivity.aq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(MusicMainActivity musicMainActivity, Message message) {
        musicMainActivity.bo.setProgress(message.arg1);
        musicMainActivity.ax.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf(message.arg1)));
    }

    class a extends RecyclerView.Adapter<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f24477b;
        e e;

        private a() {
        }

        class e extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private HealthTextView f24478a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ImageView f24480c;
            private HealthTextView d;
            private LinearLayout e;

            e(View view) {
                super(view);
                this.f24478a = (HealthTextView) a.this.f24477b.findViewById(R.id.music_menu_name_tv);
                this.d = (HealthTextView) a.this.f24477b.findViewById(R.id.music_song_sum_tv);
                this.e = (LinearLayout) a.this.f24477b.findViewById(R.id.under_line_layout);
                this.f24480c = (ImageView) a.this.f24477b.findViewById(R.id.music_song_sum_arrow_iv);
            }

            public void e(final MusicMenu musicMenu, int i) {
                if (musicMenu == null) {
                    return;
                }
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    this.f24480c.setImageResource(R.mipmap.common_arrow_left_click_false);
                } else {
                    this.f24480c.setImageResource(R.drawable.ic_health_sleep_arrow_right);
                }
                this.f24478a.setText(musicMenu.getMenuName());
                this.d.setText(MusicMainActivity.this.getResources().getQuantityString(R.plurals.IDS_settings_music_songs_num, musicMenu.getMenuMusicCount(), Integer.valueOf(musicMenu.getMenuMusicCount())));
                a.this.f24477b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.a.e.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("MusicMainActivity", "Click item, Entered MusicSongsActivity, the menu name=", musicMenu.getMenuName());
                        Intent intent = new Intent();
                        intent.setClass(MusicMainActivity.this, MusicSongsActivity.class);
                        lzu.c().a(musicMenu);
                        lzu.c().e(MusicMainActivity.this.n);
                        intent.putStringArrayListExtra("menu_list", MusicMainActivity.this.v());
                        intent.putExtra("current_bluetooth_status", MusicMainActivity.this.s);
                        MusicMainActivity.this.startActivityForResult(intent, 1);
                    }
                });
                if (MusicMainActivity.this.v().size() - 1 == i) {
                    this.e.setVisibility(8);
                } else {
                    this.e.setVisibility(0);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (MusicMainActivity.this.q == null) {
                return 0;
            }
            return MusicMainActivity.this.q.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e onCreateViewHolder(ViewGroup viewGroup, int i) {
            this.f24477b = LayoutInflater.from(MusicMainActivity.this.l).inflate(R.layout.activity_music_menu_list_item, viewGroup, false);
            e eVar = new e(this.f24477b);
            this.e = eVar;
            eVar.setIsRecyclable(false);
            return this.e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(e eVar, int i) {
            if (MusicMainActivity.this.q.isEmpty() || i < 0 || i >= MusicMainActivity.this.q.size()) {
                return;
            }
            eVar.e((MusicMenu) MusicMainActivity.this.q.get(i), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<String> v() {
        ArrayList<String> arrayList = new ArrayList<>(16);
        ArrayList<MusicMenu> arrayList2 = this.q;
        if (arrayList2 != null) {
            Iterator<MusicMenu> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getMenuName());
            }
        }
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.click_to_watch_tv) {
            Intent intent = new Intent(this.l, (Class<?>) MusicUnCompletedActivity.class);
            intent.putExtra("un_finished_song_list", this.br);
            intent.putExtra("current_bluetooth_status", this.s);
            startActivityForResult(intent, 3);
            return;
        }
        if (id == R.id.add_btn) {
            LogUtil.a("MusicMainActivity", "click addSong");
            if (this.s == 2) {
                if (getString(R.string.IDS_contact_add).equals(this.f24439a.getText().toString())) {
                    s();
                    return;
                } else {
                    au();
                    ac();
                    return;
                }
            }
            m();
            return;
        }
        if (id == R.id.cancel_tv) {
            t();
        } else if (id == R.id.give_up_tv) {
            n();
        } else {
            LogUtil.j("MusicMainActivity", "onClick default.");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("MusicMainActivity", "enter onCreate");
        super.onCreate(bundle);
        setContentView(R.layout.activity_music_main);
        this.l = this;
        this.af = true;
        this.f24440b.put("click", "1");
        this.ah = lzl.a(this.l);
        this.ad = lvb.e();
        ay();
        this.ac = getString(R.string.IDS_hw_health_music_no_music);
        this.ar = getString(R.string.IDS_getting_file);
        af();
        ab();
        x();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.s == 2) {
            if (this.q.size() <= 0) {
                d(true, this.am, this.q.size());
                return;
            } else {
                e(this.am);
                return;
            }
        }
        m();
    }

    private void l() {
        Intent intent = new Intent(this, (Class<?>) SyncMusicService.class);
        intent.putExtra("device_id", this.r);
        bindService(intent, this.bm, 1);
    }

    private void ay() {
        LogUtil.a("MusicMainActivity", "Enter registerConnectStateBroadcast.");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.l, this.k, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void ba() {
        try {
            unregisterReceiver(this.k);
        } catch (IllegalArgumentException unused) {
            LogUtil.a("MusicMainActivity", "unregisterConnectStateChangedBroadcast IllegalArgumentException.");
        }
    }

    private void au() {
        LogUtil.a("MusicMainActivity", "refreshUiWhenLoadingData enter");
        this.ay.setVisibility(8);
        this.bl.setVisibility(8);
        this.ba.setVisibility(0);
        this.bq.setVisibility(8);
        this.ab.setVisibility(8);
        this.aq.setVisibility(0);
        this.aa.setText(this.ar);
        this.d.setVisibility(8);
    }

    private void as() {
        LogUtil.a("MusicMainActivity", "refreshUiIfHasNoData enter");
        this.ay.setVisibility(8);
        this.bl.setVisibility(8);
        this.ba.setVisibility(0);
        this.bq.setVisibility(0);
        this.ab.setVisibility(0);
        this.aq.setVisibility(8);
        this.aa.setText(this.ac);
        this.d.setVisibility(0);
        this.i.setHeadTitleText(getString(R.string.IDS_hw_health_music_watch_all_music));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aw() {
        LogUtil.a("MusicMainActivity", "refreshUiTimeoutFromDevice enter");
        this.ay.setVisibility(8);
        this.bl.setVisibility(8);
        this.ba.setVisibility(0);
        this.bq.setVisibility(8);
        this.ab.setVisibility(0);
        if (LanguageUtil.ba(this.l)) {
            this.ab.setImageDrawable(getResources().getDrawable(R.drawable.ic_refresh_ar));
        } else {
            this.ab.setImageDrawable(getResources().getDrawable(R.drawable.ic_refresh));
        }
        this.aq.setVisibility(8);
        this.aa.setText(getResources().getString(R.string.IDS_hw_health_music_load_fail_retry));
        this.d.setVisibility(0);
        this.f24439a.setText(getString(R.string.IDS_hw_show_set_about_privacy_retry));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bc() {
        if (this.q.size() == 0 && this.n.getMusicSongsList().size() == 0 && this.au <= 0) {
            as();
        } else if (this.q.size() == 0 && this.n.getMusicSongsList().size() != 0) {
            ax();
        } else if (this.q.size() != 0 && this.n.getMusicSongsList().size() == 0) {
            av();
        } else {
            at();
        }
        if (this.aj) {
            this.t.setVisibility(8);
            at();
            aa();
            return;
        }
        ArrayList<MusicSong> arrayList = this.br;
        if (arrayList != null && arrayList.size() > 0) {
            this.t.setVisibility(0);
            at();
            aa();
            return;
        }
        this.t.setVisibility(8);
    }

    private void aa() {
        if (this.q.size() == 0) {
            this.u.setVisibility(8);
            this.at.setVisibility(8);
        }
        if (this.n.getMusicSongsList().size() == 0) {
            this.i.setVisibility(8);
            this.u.setVisibility(8);
        }
    }

    private void at() {
        LogUtil.a("MusicMainActivity", "refreshUiIfHasSongsAndMenus enter");
        this.ay.setVisibility(0);
        this.u.setVisibility(0);
        this.bf.setVisibility(0);
        this.at.setVisibility(0);
        this.i.setVisibility(0);
        this.bl.setVisibility(0);
        this.ba.setVisibility(8);
        this.d.setVisibility(8);
        this.i.setHeadTitleText(lzu.c().c(this.n.getMusicSongsList().size(), this.au));
    }

    private void ax() {
        LogUtil.a("MusicMainActivity", "refreshUiIfOnlyHasSongs enter");
        this.ay.setVisibility(0);
        this.u.setVisibility(8);
        this.bf.setVisibility(0);
        this.bl.setVisibility(0);
        this.ba.setVisibility(8);
        this.d.setVisibility(8);
        this.i.setVisibility(0);
        this.at.setVisibility(8);
        this.i.setHeadTitleText(lzu.c().c(this.n.getMusicSongsList().size(), this.au));
    }

    private void av() {
        LogUtil.a("MusicMainActivity", "refreshUiIfOnlyHasMenus enter");
        this.ay.setVisibility(0);
        this.u.setVisibility(8);
        this.at.setVisibility(0);
        this.bf.setVisibility(8);
        this.bl.setVisibility(0);
        this.ba.setVisibility(8);
        this.d.setVisibility(8);
        this.i.setHeadTitleText(getString(R.string.IDS_hw_health_music_watch_all_music));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SyncMusicBinder.SyncMusicStatusListener ae() {
        return new SyncMusicBinder.SyncMusicStatusListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.29
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicBinder.SyncMusicStatusListener
            public void onGetSyncTaskRunningStatus(boolean z, int i) {
                LogUtil.a("MusicMainActivity", "onGetSyncTaskRunningStatus:", Boolean.valueOf(z), "musicAppType:", Integer.valueOf(i));
                MusicMainActivity.this.d(z, i);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicBinder.SyncMusicStatusListener
            public void onGetSyncMusicProgress(int i) {
                MusicMainActivity.this.a(i);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicBinder.SyncMusicStatusListener
            public void onGetSyncMusicNameAndTotalProgress(String str, String str2) {
                MusicMainActivity.this.a(str, str2);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicBinder.SyncMusicStatusListener
            public void onSyncOneMusicFinished(MusicSong musicSong) {
                MusicMainActivity.this.b(musicSong);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicBinder.SyncMusicStatusListener
            public void onSyncAllMusicsFinished(List<MusicSong> list, List<MusicSong> list2) {
                MusicMainActivity.this.b(list, list2);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicBinder.SyncMusicStatusListener
            public void onBlueToothDisconnect(List<MusicSong> list, List<MusicSong> list2) {
                MusicMainActivity.this.a(list, list2);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicBinder.SyncMusicStatusListener
            public void onSyncMusicFailWhenNoSpace(List<MusicSong> list, List<MusicSong> list2) {
                MusicMainActivity.this.e(list, list2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final List<MusicSong> list, List<MusicSong> list2) {
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.26
            @Override // java.lang.Runnable
            public void run() {
                MusicMainActivity.this.x.clear();
                MusicMainActivity.this.x.addAll(list);
                MusicMainActivity musicMainActivity = MusicMainActivity.this;
                qpx.e(musicMainActivity, musicMainActivity.getResources().getString(R.string.IDS_hw_health_music_insufficient_number_watch));
                MusicMainActivity.this.bn.setVisibility(0);
                MusicMainActivity.this.bn.setText(MusicMainActivity.this.getResources().getString(R.string.IDS_hw_health_music_insufficient_number_watch));
                MusicMainActivity.this.ao();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<MusicSong> list, final List<MusicSong> list2) {
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.30
            @Override // java.lang.Runnable
            public void run() {
                MusicMainActivity.this.x.clear();
                MusicMainActivity.this.x.addAll(list);
                if (!list2.isEmpty()) {
                    MusicMainActivity musicMainActivity = MusicMainActivity.this;
                    qpx.e(musicMainActivity, musicMainActivity.getResources().getQuantityString(R.plurals.IDS_hw_health_music_suc_tips, list2.size(), Integer.valueOf(list2.size())));
                }
                MusicMainActivity.this.bn.setVisibility(0);
                MusicMainActivity.this.bn.setText(MusicMainActivity.this.getResources().getString(R.string.IDS_hw_health_music_describe_2));
                MusicMainActivity.this.ao();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final List<MusicSong> list, final List<MusicSong> list2) {
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.28
            @Override // java.lang.Runnable
            public void run() {
                if (!MusicMainActivity.this.aj) {
                    MusicMainActivity.this.x.clear();
                }
                MusicMainActivity.this.x.addAll(list);
                if (!list2.isEmpty()) {
                    MusicMainActivity musicMainActivity = MusicMainActivity.this;
                    qpx.e(musicMainActivity, musicMainActivity.getResources().getQuantityString(R.plurals.IDS_hw_health_music_suc_tips, list2.size(), Integer.valueOf(list2.size())));
                }
                MusicMainActivity.this.e((List<MusicSong>) list);
                MusicMainActivity.this.ao();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MusicSong musicSong) {
        if (musicSong == null || TextUtils.isEmpty(musicSong.getSongName())) {
            LogUtil.a("MusicMainActivity", "onSyncOneMusicFinished song is null!");
            return;
        }
        LogUtil.a("MusicMainActivity", "onSyncOneMusicFinished");
        this.n.getMusicSongsList().add(0, musicSong);
        this.au++;
        ak();
        Message messageObtainMessage = this.y.obtainMessage();
        messageObtainMessage.what = 1006;
        this.y.sendMessage(messageObtainMessage);
        aq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<MusicSong> list) {
        LogUtil.a("MusicMainActivity", "mFailedTransferedMusicList size:", Integer.valueOf(this.x.size()));
        this.bn.setVisibility(8);
        this.w.setVisibility(8);
        this.bb.setVisibility(8);
        boolean z = true;
        for (MusicSong musicSong : new ArrayList(list)) {
            if (musicSong.getSyncFailedErrorCode() == 140007) {
                this.bn.setVisibility(0);
                this.bn.setText(getResources().getString(R.string.IDS_hw_health_music_describe_4));
                z = false;
            }
            if (musicSong.getSyncFailedErrorCode() == 2) {
                LogUtil.a("MusicMainActivity", "Format Failed Song Name :", musicSong.getFileName());
                this.w.setVisibility(0);
                this.w.setText(getResources().getString(R.string.IDS_hw_health_music_describe_5));
                z = false;
            }
            if (musicSong.getSyncFailedErrorCode() == 1) {
                LogUtil.a("MusicMainActivity", "Sample Rate Failed Song Name :", musicSong.getFileName());
                this.bb.setVisibility(0);
                this.bb.setText(getResources().getString(R.string.IDS_not_support_mus_content));
                z = false;
            }
        }
        if (z) {
            LogUtil.a("MusicMainActivity", "DefaultTransferError");
            this.bn.setVisibility(0);
            this.bn.setText(getResources().getString(R.string.IDS_hw_health_music_describe_3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        lzl.a(this.l).e(new NegotiationData(), new e(this.l));
    }

    private void af() {
        ag();
        this.p.setOnTouchListener(new View.OnTouchListener() { // from class: qwr
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MusicMainActivity.e(view, motionEvent);
            }
        });
        ah();
        au();
        z();
    }

    private void z() {
        this.o.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MusicMainActivity.this.ai) {
                    MusicMainActivity.this.c(false);
                } else {
                    MusicMainActivity.this.finish();
                }
                MusicMainActivity.this.ak();
            }
        });
    }

    private void ah() {
        this.bl.d(View.inflate(this, R.layout.hw_toolbar_bottomview, null));
        this.bl.setOnSingleTapListener(this.bw);
        this.bl.setIcon(1, R.drawable.ic_addition_create_group);
        this.bl.setIconTitle(1, getResources().getString(R.string.IDS_hw_health_music_add_music));
        if (!lzq.d()) {
            this.bl.setIcon(2, R.drawable.ic_song_sheet);
            this.bl.setIconTitle(2, getResources().getString(R.string.IDS_hw_health_music_new_song_list));
        }
        this.bl.setIconVisible(3, 8);
        this.ao.d(View.inflate(this, R.layout.hw_toolbar_bottomview, null));
        this.ao.setOnSingleTapListener(this.bs);
        if (!lzq.d()) {
            this.ao.setIcon(1, R.drawable.ic_song_sheet);
            this.ao.setIconTitle(1, getResources().getString(R.string.IDS_hw_health_music_add_to_song_list));
        }
        this.ao.setIcon(2, R.drawable.ic_public_select_all);
        d(this.n.getMusicSongsList());
        this.ao.setIcon(3, R.drawable.ic_delete);
        this.ao.setIconTitle(3, getResources().getString(R.string.IDS_music_management_delete));
    }

    private void ag() {
        HealthProgressBar healthProgressBar = (HealthProgressBar) findViewById(R.id.load_progressbar);
        this.aq = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        this.p = (LinearLayout) findViewById(R.id.delete_load_ll);
        ((HealthProgressBar) findViewById(R.id.delete_load_progressbar)).setLayerType(1, null);
        this.bv = (HealthTextView) findViewById(R.id.watch_savings_remaining_tv);
        this.v = (HealthTextView) findViewById(R.id.empty_watch_savings_remaining_tv);
        this.o = (CustomTitleBar) findViewById(R.id.music_home_title_bar);
        this.ay = (MusicNestedScrollLayout) findViewById(R.id.my_musics_scrollview);
        this.bk = (LinearLayout) findViewById(R.id.tip_layout);
        this.az = (LinearLayout) findViewById(R.id.hw_search_layout);
        this.z = (HealthSearchView) findViewById(R.id.music_search_view);
        this.u = findViewById(R.id.menu_songs_divider);
        this.bf = (LinearLayout) findViewById(R.id.all_songs_list_layout);
        this.at = (HealthSubHeader) findViewById(R.id.my_song_list_sub_header);
        this.i = (HealthSubHeader) findViewById(R.id.all_songs_sub_header);
        this.bl = (HealthToolBar) findViewById(R.id.bottom_operate_toolbar);
        this.ao = (HealthToolBar) findViewById(R.id.multi_select_toolbar);
        this.ba = (RelativeLayout) findViewById(R.id.layout_when_no_data);
        this.d = (LinearLayout) findViewById(R.id.add_layout_when_no_data);
        this.bq = (LinearLayout) findViewById(R.id.linear_two_text_tips);
        this.ab = (ImageView) findViewById(R.id.has_no_music_image);
        this.aa = (HealthTextView) findViewById(R.id.has_no_music_textview);
        HealthButton healthButton = (HealthButton) findViewById(R.id.add_btn);
        this.f24439a = healthButton;
        healthButton.setOnClickListener(this);
        this.g = (LinearLayout) findViewById(R.id.add_music_to_watch_layout);
        this.t = (LinearLayout) findViewById(R.id.disconnect_device_layout);
        this.bn = (HealthTextView) findViewById(R.id.transfer_failed_tips_tv);
        this.w = (HealthTextView) findViewById(R.id.format_failed_tips_tv);
        this.bb = (HealthTextView) findViewById(R.id.sampleRate_failed_tips_tv);
        ((TextView) findViewById(R.id.cancel_tv)).setOnClickListener(this);
        ((HealthTextView) findViewById(R.id.give_up_tv)).setOnClickListener(this);
        this.j = (RecyclerView) findViewById(R.id.all_musics_menu_list);
        ai();
        this.m = (TextView) findViewById(R.id.adding_music_name_text_view);
        this.ax = (TextView) findViewById(R.id.transfer_music_progress_text);
        this.bo = (HealthProgressBar) findViewById(R.id.transfer_music_progress_bar);
        this.bp = (TextView) findViewById(R.id.music_description_boot_title_one);
        ((HealthTextView) findViewById(R.id.click_to_watch_tv)).setOnClickListener(this);
        this.ak = (RelativeLayout) findViewById(R.id.layout_music_show_all_tips);
        this.be = (HealthTextView) findViewById(R.id.show_all_music_title_tv);
        findViewById(R.id.show_all_music_tv).setOnClickListener(this.f24441c);
    }

    private void ai() {
        this.h = (RecyclerView) findViewById(R.id.all_music_songs_list);
        this.h.setLayoutManager(new LinearLayoutManager(this.l));
        this.h.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f24467a = false;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0 || !this.f24467a) {
                    LogUtil.j("MusicMainActivity", "onScrollStateChanged newState is not idle; mIsToLast : ", Boolean.valueOf(this.f24467a));
                    return;
                }
                if (!lzu.c().e()) {
                    LogUtil.j("MusicMainActivity", "onScrollStateChanged is not load more");
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    LogUtil.j("MusicMainActivity", "onScrollStateChanged is not instance of LinearLayoutManager");
                    return;
                }
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                List<MusicSong> listD = MusicMainActivity.this.f.d();
                if (listD == null || listD.isEmpty()) {
                    LogUtil.j("MusicMainActivity", "onScrollStateChanged songList have not data");
                    return;
                }
                LogUtil.a("MusicMainActivity", "onScrollStateChanged, lastVisiblePosition :", Integer.valueOf(iFindLastVisibleItemPosition), ", isLoadingMore :", Boolean.valueOf(lzu.c().i()));
                if (iFindLastVisibleItemPosition != listD.size() || lzu.c().i()) {
                    return;
                }
                MusicMainActivity.this.al();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                this.f24467a = i2 > 0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        lzu.c().d(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(final int i, final Object obj) {
                LogUtil.a("MusicMainActivity", "loadMoreMusic onResponse errorCode : ", Integer.valueOf(i));
                MusicMainActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int i2 = i;
                        if (i2 != 1) {
                            if (i2 == 2) {
                                MusicMainActivity.this.f.a(false);
                                return;
                            } else {
                                LogUtil.j("MusicMainActivity", "loadMoreMusic onResponse default");
                                return;
                            }
                        }
                        Object obj2 = obj;
                        if (obj2 instanceof mai) {
                            mai maiVar = (mai) obj2;
                            MusicMainActivity.this.f.a(true);
                            List<MusicSong> listB = maiVar.b();
                            if (listB != null) {
                                MusicMainActivity.this.c(listB, MusicMainActivity.this.n.getMusicSongsList());
                                MusicMainActivity.this.f.b(listB);
                                MusicMainActivity.this.f.notifyDataSetChanged();
                                MusicMainActivity.this.ak();
                            }
                            MusicMainActivity.this.b(maiVar.a());
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<MusicSong> list, List<MusicSong> list2) {
        if (list == null || list2 == null) {
            LogUtil.e("MusicMainActivity", "musicSongListAddAll, param is null.");
            return;
        }
        for (MusicSong musicSong : list) {
            if (!list2.contains(musicSong)) {
                list2.add(musicSong);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.music.MusicMainActivity$5, reason: invalid class name */
    class AnonymousClass5 implements View.OnClickListener {
        AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qrs.r()) {
                LogUtil.j("MusicMainActivity", "clickLoadAllMusicListener, isFastClick.");
                return;
            }
            if (MusicMainActivity.this.e() != 2) {
                MusicMainActivity.this.m();
                return;
            }
            MusicMainActivity.this.ad();
            String str = String.format(Locale.ROOT, MusicMainActivity.this.getResources().getString(R.string.IDS_hwh_motiontrack_target_progress), 0, Integer.valueOf(MusicMainActivity.this.au - MusicMainActivity.this.n.getMusicSongsList().size()));
            MusicMainActivity.this.al.b(0);
            MusicMainActivity.this.al.b(str);
            if (!MusicMainActivity.this.an.isShowing()) {
                MusicMainActivity.this.an.show();
            }
            lzu.c().b(MusicMainActivity.this.n.getMusicSongsList().size(), MusicMainActivity.this.au, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.5.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(final int i, final Object obj) {
                    LogUtil.a("MusicMainActivity", "clickLoadAllMusicListener, loadAllMusic onResponse errorCode :", Integer.valueOf(i));
                    if (i == 1 && (obj instanceof mai)) {
                        MusicMainActivity.this.b(((mai) obj).a());
                    } else {
                        MusicMainActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.5.5.3
                            @Override // java.lang.Runnable
                            public void run() {
                                Object obj2 = obj;
                                MusicMainActivity.this.b(i, obj2 instanceof mao ? (mao) obj2 : null);
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, mao maoVar) {
        ad();
        if (i == 1) {
            r();
            bb();
            return;
        }
        if (i == 3) {
            r();
            lzu.c().d(false);
            return;
        }
        if (maoVar == null) {
            LogUtil.j("MusicMainActivity", "showLoadingMusicDialog, musicLoadStruct is null.");
            return;
        }
        this.al.b(maoVar.a());
        this.al.b(maoVar.d());
        if (!this.an.isShowing()) {
            this.an.show();
        }
        MusicSong musicSongE = maoVar.e();
        if (!this.n.getMusicSongsList().contains(musicSongE)) {
            this.n.getMusicSongsList().add(musicSongE);
            c(false);
        }
        this.i.setHeadTitleText(lzu.c().c(this.n.getMusicSongsList().size(), this.au));
        ak();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        if (this.an == null) {
            CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.l);
            this.al = builder;
            builder.e(getResources().getString(R.string.sug_his_loading_more));
            this.al.e(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    lzu.c().d(true);
                }
            });
            CustomProgressDialog customProgressDialogC = this.al.c();
            this.an = customProgressDialogC;
            customProgressDialogC.setCancelable(false);
            this.an.setCanceledOnTouchOutside(false);
        }
    }

    private void r() {
        this.an.dismiss();
        this.al.b(0);
        this.al.d(0);
        this.al.b("");
    }

    private void bb() {
        qpx.b(this.l, R.string.IDS_hw_health_music_shown_all);
    }

    private void ab() {
        Intent intent = getIntent();
        if (intent != null) {
            this.r = intent.getStringExtra("device_id");
        }
        ac();
        this.av = new a();
        this.j.setLayoutManager(new LinearLayoutManager(this.l));
        this.j.setAdapter(this.av);
        MusicSongsListAdapter musicSongsListAdapter = new MusicSongsListAdapter(this, this.n.getMusicSongsList(), this.q);
        this.f = musicSongsListAdapter;
        this.h.setAdapter(musicSongsListAdapter);
        LocalMusicSearchThreadManager localMusicSearchThreadManager = new LocalMusicSearchThreadManager();
        this.bc = localMusicSearchThreadManager;
        localMusicSearchThreadManager.c();
        this.bc.d(this);
        this.z.setOnQueryTextListener(this.bi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        int size = this.n.getMusicSongsList().size();
        if (!lzu.c().h() || size == this.au || this.ai) {
            this.ak.setVisibility(8);
            return;
        }
        Resources resources = getResources();
        int i = R.plurals.IDS_hw_health_music_show_piece;
        int i2 = this.au;
        String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        String quantityString2 = getResources().getQuantityString(R.plurals.IDS_hw_health_music_show_piece, size, Integer.valueOf(size));
        int iA = lzu.c().a(this.au, size);
        this.be.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_hw_health_music_show), quantityString, quantityString2, getResources().getQuantityString(R.plurals.IDS_hw_health_music_show_time, iA, Integer.valueOf(iA))));
        this.ak.setVisibility(0);
    }

    public void d(int i) {
        this.ak.setVisibility(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.ai) {
            c(false);
        } else {
            super.onBackPressed();
        }
    }

    public void j() {
        if (this.am.size() == this.n.getMusicSongsList().size() || this.am.size() >= 500) {
            this.ag = true;
            this.ao.setIconTitle(2, getResources().getString(R.string.IDS_contact_delete_uncheck_all));
            this.ao.setIcon(2, R.drawable.ic_public_deselect_all);
            if (!lzq.d()) {
                this.ao.setIconVisible(1, 0);
            }
            this.ao.setIconVisible(3, 0);
        } else if (this.am.size() == 0) {
            this.ag = false;
            d(this.n.getMusicSongsList());
            this.ao.setIcon(2, R.drawable.ic_public_select_all);
            this.ao.setIconVisible(1, 8);
            this.ao.setIconVisible(3, 8);
        } else {
            this.ag = false;
            d(this.n.getMusicSongsList());
            this.ao.setIcon(2, R.drawable.ic_public_select_all);
            if (!lzq.d()) {
                this.ao.setIconVisible(1, 0);
            }
            this.ao.setIconVisible(3, 0);
        }
        if (this.am.size() > 0) {
            this.o.setTitleText(getResources().getQuantityString(R.plurals.IDS_hw_weight_delete_check_measure_data, 0, Integer.valueOf(this.am.size())));
        } else {
            this.o.setTitleText(getResources().getString(R.string.IDS_hw_show_main_health_page_healthdata_selected));
        }
    }

    public void c(boolean z) {
        this.ai = z;
        if (z) {
            ap();
        } else {
            ar();
        }
    }

    private void ar() {
        this.bl.setVisibility(0);
        this.ao.setVisibility(8);
        this.bk.setVisibility(0);
        this.az.setVisibility(8);
        this.j.setVisibility(0);
        this.at.setVisibility(0);
        if (f()) {
            ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "refreshMultiSelectFalse show addMusic");
            this.g.setVisibility(0);
        } else {
            ArrayList<MusicSong> arrayList = this.br;
            if (arrayList != null && arrayList.size() > 0) {
                this.t.setVisibility(0);
            } else {
                this.t.setVisibility(8);
            }
        }
        if (this.q.size() == 0) {
            this.u.setVisibility(8);
        } else {
            this.u.setVisibility(0);
        }
        this.i.setHeadTitleText(lzu.c().c(this.n.getMusicSongsList().size(), this.au));
        this.o.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
        this.o.setTitleText(getResources().getString(R.string.IDS_hwh_motiontrack_music));
        this.o.setRightTextButtonVisibility(8);
        this.am.clear();
        this.ag = false;
        if (!lzq.d()) {
            this.ao.setIconVisible(1, 0);
        }
        this.ao.setIconVisible(2, 0);
        d(this.n.getMusicSongsList());
        this.ao.setIcon(2, R.drawable.ic_public_select_all);
        this.ao.setIconVisible(3, 0);
        if (this.n.getMusicSongsList().size() > 0 && this.bf.getVisibility() == 8) {
            this.bf.setVisibility(0);
        }
        MusicSongsListAdapter musicSongsListAdapter = new MusicSongsListAdapter(this.l, this.n.getMusicSongsList(), this.q);
        this.f = musicSongsListAdapter;
        this.h.setAdapter(musicSongsListAdapter);
        this.f.notifyDataSetChanged();
        ak();
    }

    public boolean f() {
        boolean zL = maa.b().l();
        LogUtil.a("MusicMainActivity", "refreshAddMusicLayoutOnCreate enter, mIsSyncMusicTaskAlive is:", Boolean.valueOf(this.aj), ",isCancelSyncMusic:", Boolean.valueOf(zL));
        return (!this.aj || this.aw == 2 || zL) ? false : true;
    }

    private void ap() {
        this.bl.setVisibility(8);
        this.ao.setVisibility(0);
        this.bk.setVisibility(8);
        this.az.setVisibility(0);
        this.j.setVisibility(8);
        this.at.setVisibility(8);
        this.g.setVisibility(8);
        this.t.setVisibility(8);
        this.u.setVisibility(8);
        if (this.n.getMusicSongsList().size() == 1) {
            this.ao.setIconTitle(2, getResources().getString(R.string.IDS_contact_delete_uncheck_all));
            this.ao.setIcon(2, R.drawable.ic_public_deselect_all);
            this.ag = true;
        }
        this.i.setHeadTitleText(lzu.c().b(this.n.getMusicSongsList().size(), this.au));
        this.o.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_cancel_selector), qre.f(R.string.accessibility_close));
        this.o.setTitleText(getResources().getQuantityString(R.plurals.IDS_hw_weight_delete_check_measure_data, 0, Integer.valueOf(this.am.size())));
        this.o.setRightTextButtonVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<MusicStruct> list) {
        if (list == null || list.isEmpty() || this.q.isEmpty()) {
            LogUtil.a("MusicMainActivity", "dealOnGetPageFolderRsp, return!");
            return;
        }
        for (MusicStruct musicStruct : list) {
            for (MusicMenu musicMenu : this.q) {
                if (musicMenu.getMusicStructSongIndexList().contains(Integer.valueOf(musicStruct.getMusicIndex()))) {
                    MusicSong musicSong = new MusicSong();
                    musicSong.setFileName(musicStruct.getFileName());
                    musicSong.setSongName(musicStruct.getMusicName());
                    musicSong.setSongSingerName(musicStruct.getMusicSinger());
                    musicSong.setSongIndex(String.valueOf(musicStruct.getMusicIndex()));
                    if (!musicMenu.getMusicSongsList().contains(musicSong)) {
                        musicMenu.getMusicSongsList().add(musicSong);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(List<MusicFolderStruct> list, MusicMainActivity musicMainActivity) {
        if (list == null || list.size() == 0) {
            LogUtil.a("MusicMainActivity", "onGetFolders musicFolderStructure is empty!");
            return;
        }
        if (list.get(0).getMusicStructList() == null) {
            LogUtil.a("MusicMainActivity", "onGetFolders defaultmusiclist is empty!");
        }
        ArrayList arrayList = new ArrayList(16);
        for (MusicFolderStruct musicFolderStruct : list) {
            MusicMenu musicMenu = new MusicMenu();
            musicMenu.fillMusicMenuDataByBlueTooth(musicFolderStruct);
            arrayList.add(musicMenu);
        }
        Message messageObtainMessage = musicMainActivity.y.obtainMessage();
        messageObtainMessage.what = 1003;
        messageObtainMessage.obj = arrayList;
        musicMainActivity.y.sendMessage(messageObtainMessage);
    }

    private void ac() {
        LogUtil.a("MusicMainActivity", "initDeviceMusicLibrary enter");
        this.ah.a(new b(this.l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        lzl.a(this.l).e(new NegotiationData(), new d(this.l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(NegotiationData negotiationData, MusicMainActivity musicMainActivity) {
        SyncMusicBinder syncMusicBinder = musicMainActivity.bj;
        if (syncMusicBinder != null && syncMusicBinder.getService() != null) {
            LogUtil.a("MusicMainActivity", "setSupportFormat");
            musicMainActivity.bj.getService().b(negotiationData.getMp3SampleRate());
            musicMainActivity.bj.getService().b(negotiationData.getAacSupportAdts());
            musicMainActivity.bj.getService().c(negotiationData.getTypeStructList());
            musicMainActivity.bj.getService().a(negotiationData.getMusicFormatList());
            return;
        }
        LogUtil.j("MusicMainActivity", "Service is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final List<MusicSong> list) {
        LogUtil.a("MusicMainActivity", "deleteSongListFromMenuByUser enter");
        if (list == null) {
            LogUtil.j("MusicMainActivity", "deleteSongListFromMenuByUser, songList is null.");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        try {
            Iterator<MusicSong> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt(it.next().getSongIndex())));
            }
            OperationStruct operationStruct = new OperationStruct();
            operationStruct.setOperationType(4);
            operationStruct.setFolderIndex(0);
            operationStruct.setMusicIndexs(arrayList);
            this.ah.c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 100000) {
                        LogUtil.a("MusicMainActivity", "receive deleteSongFromMenuByUser rsp");
                        MusicMainActivity.this.a((List<MusicSong>) list);
                    } else {
                        LogUtil.a("MusicMainActivity", "deleteSongListFromMenuByUser failed, errCode:", Integer.valueOf(i));
                    }
                    MusicMainActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.8.5
                        @Override // java.lang.Runnable
                        public void run() {
                            MusicMainActivity.this.p.setVisibility(8);
                        }
                    });
                }
            });
        } catch (NumberFormatException e2) {
            LogUtil.a("MusicMainActivity", "deleteSongListFromMenuByUser failed, exception:", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<MusicSong> list) {
        for (MusicSong musicSong : list) {
            String fileName = musicSong.getFileName();
            Iterator<MusicSong> it = this.n.getMusicSongsList().iterator();
            while (it.hasNext()) {
                if (it.next().getFileName().equals(fileName)) {
                    it.remove();
                    this.au--;
                }
            }
            for (MusicMenu musicMenu : this.q) {
                if (musicMenu.getMusicSongsList().contains(musicSong)) {
                    musicMenu.getMusicSongsList().remove(musicSong);
                    musicMenu.setMenuMusicCount(musicMenu.getMenuMusicCount() - 1);
                }
            }
        }
        Message messageObtainMessage = this.y.obtainMessage();
        messageObtainMessage.what = 999;
        this.y.sendMessage(messageObtainMessage);
        aq();
        LogUtil.a("MusicMainActivity", "deleteSongListFromMenuByUser succeed!");
    }

    private void e(final ArrayList<MusicSong> arrayList) {
        if (arrayList != null) {
            LogUtil.a("MusicMainActivity", "addMusicToMenu enter, songList size:", Integer.valueOf(arrayList.size()));
        }
        View viewInflate = LayoutInflater.from(this.l).inflate(R.layout.dialog_add_to_menu, (ViewGroup) null);
        MenuListAdapter menuListAdapter = new MenuListAdapter(this.l, this.q);
        a(viewInflate, menuListAdapter);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.l);
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.b(viewInflate, 0, 0);
        builder.b(false);
        final CustomViewDialog customViewDialogD = builder.d();
        if (customViewDialogD != null) {
            customViewDialogD.setCancelable(false);
            customViewDialogD.show();
        }
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.create_new_menu);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomViewDialog customViewDialog = customViewDialogD;
                if (customViewDialog != null) {
                    customViewDialog.dismiss();
                }
                MusicMainActivity musicMainActivity = MusicMainActivity.this;
                musicMainActivity.d(true, arrayList, musicMainActivity.q.size());
            }
        });
        if (this.q.size() >= this.as) {
            healthTextView.setVisibility(8);
        }
        menuListAdapter.e(new AnonymousClass6(menuListAdapter, arrayList, customViewDialogD));
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.music.MusicMainActivity$6, reason: invalid class name */
    public class AnonymousClass6 implements MenuListAdapter.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MenuListAdapter f24472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f24473c;
        final /* synthetic */ CustomViewDialog e;

        AnonymousClass6(MenuListAdapter menuListAdapter, ArrayList arrayList, CustomViewDialog customViewDialog) {
            this.f24472b = menuListAdapter;
            this.f24473c = arrayList;
            this.e = customViewDialog;
        }

        @Override // com.huawei.ui.device.views.music.MenuListAdapter.OnItemClickListener
        public void onItemClick(View view, int i) {
            if (this.f24472b.d() != null) {
                int size = this.f24472b.d().size();
                if (i < 0 || i >= size) {
                    return;
                }
                this.f24472b.a(i);
                MusicMainActivity.this.a(this.f24472b.d().get(i), (ArrayList<MusicSong>) this.f24473c);
                final CustomViewDialog customViewDialog = this.e;
                view.postDelayed(new Runnable() { // from class: qwv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46924b.d(customViewDialog);
                    }
                }, 300L);
            }
        }

        public /* synthetic */ void d(CustomViewDialog customViewDialog) {
            if (customViewDialog != null) {
                customViewDialog.dismiss();
            }
            MusicMainActivity.this.c(false);
        }
    }

    private void a(View view, MenuListAdapter menuListAdapter) {
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.menu_list);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.l));
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        healthRecycleView.setIsScroll(false);
        healthRecycleView.setAdapter(menuListAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MusicMenu musicMenu, ArrayList<MusicSong> arrayList) {
        if (arrayList != null) {
            LogUtil.a("MusicMainActivity", "addSongsToMenuByLongClick enter, songList size:", Integer.valueOf(arrayList.size()));
            final ArrayList arrayList2 = new ArrayList(16);
            try {
                ArrayList arrayList3 = new ArrayList(16);
                for (MusicSong musicSong : arrayList) {
                    if (!musicMenu.getMusicSongsList().contains(musicSong)) {
                        arrayList3.add(Integer.valueOf(Integer.parseInt(musicSong.getSongIndex())));
                        arrayList2.add(musicSong);
                    }
                }
                musicMenu.addRealMusicCount(arrayList2);
                Message messageObtainMessage = this.y.obtainMessage();
                messageObtainMessage.what = 1001;
                this.y.sendMessage(messageObtainMessage);
                LogUtil.a("MusicMainActivity", "addSongsToMenuByLongClick enter, songsIndexList size:", Integer.valueOf(arrayList3.size()));
                OperationStruct operationStruct = new OperationStruct();
                operationStruct.setOperationType(3);
                operationStruct.setFolderIndex(Integer.parseInt(musicMenu.getMenuIndex()));
                operationStruct.setMusicIndexs(arrayList3);
                lzl.a(this.l).c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.11
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("MusicMainActivity", "addSongsToMenuByLongClick onResponse, errorCode:", Integer.valueOf(i));
                        if (i != 100000) {
                            musicMenu.removeRealMusicCount(arrayList2);
                            Message messageObtainMessage2 = MusicMainActivity.this.y.obtainMessage();
                            messageObtainMessage2.what = 1001;
                            MusicMainActivity.this.y.sendMessage(messageObtainMessage2);
                        }
                    }
                });
            } catch (NumberFormatException unused) {
                LogUtil.a("MusicMainActivity", "get mCurrentMenu's index is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (!this.ag) {
            this.ao.setIconTitle(2, getResources().getString(R.string.IDS_contact_delete_uncheck_all));
            this.ao.setIcon(2, R.drawable.ic_public_deselect_all);
            if (!lzq.d()) {
                this.ao.setIconVisible(1, 0);
            }
            this.ao.setIconVisible(3, 0);
            this.ag = true;
            if (this.n.getMusicSongsList().size() <= 500) {
                this.am.clear();
                this.am.addAll(this.n.getMusicSongsList());
                Arrays.fill(this.f.b(), true);
            } else {
                int iAz = az();
                int length = this.f.b().length;
                LogUtil.a("MusicMainActivity", "endFlagIndex:", Integer.valueOf(iAz), ",length:", Integer.valueOf(length));
                Arrays.fill(this.f.b(), 0, Math.min(iAz, length), true);
            }
        } else {
            d(this.n.getMusicSongsList());
            this.ao.setIcon(2, R.drawable.ic_public_select_all);
            this.ao.setIconVisible(1, 8);
            this.ao.setIconVisible(3, 8);
            this.ag = false;
            this.am.clear();
            Arrays.fill(this.f.b(), false);
        }
        this.f.notifyDataSetChanged();
        j();
    }

    private int az() {
        int i = 0;
        if (this.am.size() == 0) {
            this.am.addAll(this.n.getMusicSongsList().subList(0, 500));
            return 500;
        }
        ArrayList<MusicSong> musicSongsList = this.n.getMusicSongsList();
        while (i < musicSongsList.size() && this.am.size() < 500) {
            if (!this.am.contains(musicSongsList.get(i))) {
                this.am.add(musicSongsList.get(i));
            }
            i++;
        }
        return i;
    }

    private void an() {
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.l);
        builder.d(R.string.IDS_hw_health_music_watch_is_low_on_battery_title);
        builder.e(getString(R.string.IDS_hw_health_music_watch_is_low_on_battery_tips));
        builder.a(R.string.IDS_user_permission_know, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.15
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                boolean unused = MusicMainActivity.e = MusicMainActivity.this.w();
                if (MusicMainActivity.this.aj() || lzq.c()) {
                    MusicMainActivity.this.i();
                } else {
                    MusicMainActivity.this.u();
                }
            }
        });
        builder.b().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean aj() {
        if (!e) {
            return true;
        }
        if (!lzq.e()) {
            return false;
        }
        LogUtil.a("MusicMainActivity", "isNotSupportedOnlineMusic, device dismiss online music.");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        qpx.e(this.l, getResources().getString(R.string.IDS_hw_health_music_check_bluetooth_connection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.aj = false;
        this.aw = 0;
        SyncMusicBinder syncMusicBinder = this.bj;
        if (syncMusicBinder != null) {
            syncMusicBinder.notifyServiceCancel();
        }
        LogUtil.a("MusicMainActivity", "cancelTransferSongByUser enter, mIsSyncMusicTaskAlive is:", Boolean.valueOf(this.aj));
        this.br.clear();
        this.x.clear();
        Message messageObtainMessage = this.y.obtainMessage();
        messageObtainMessage.what = 1008;
        this.y.sendMessage(messageObtainMessage);
    }

    private void n() {
        this.br.clear();
        this.x.clear();
        SyncMusicBinder syncMusicBinder = this.bj;
        if (syncMusicBinder != null) {
            syncMusicBinder.notifyServiceCancel();
        }
        this.bn.setVisibility(8);
        this.w.setVisibility(8);
        this.bb.setVisibility(8);
        this.t.setVisibility(8);
        bc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        boolean zL = maa.b().l();
        LogUtil.a("MusicMainActivity", "mIsSyncMusicTaskAlive:", Boolean.valueOf(this.aj), " ;isCancelSyncMusic:", Boolean.valueOf(zL));
        if (this.aj || zL) {
            qpx.e(this.l, getResources().getString(R.string.IDS_hw_health_music_has_task_tips));
            return;
        }
        if (mgt.b(this.r) < 10) {
            an();
            return;
        }
        e = w();
        if (aj() || lzq.c()) {
            i();
        } else {
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        idy.b(AnalyticsValue.HEALTH_MUSIC_LOCAL_MUSIC_1090093.value(), this.f24440b);
        Intent intent = new Intent();
        intent.setClass(this, LocalMusicResourceActivity.class);
        Bundle bundle = new Bundle();
        lzu.c().e(this.n);
        bundle.putInt("max_music_number", this.ap);
        bundle.putInt("watch_remaining_space", this.bh);
        bundle.putInt("musicCount", this.au);
        List<String> list = this.bg;
        if (list instanceof ArrayList) {
            bundle.putStringArrayList("device_support_music_type_list", (ArrayList) list);
        }
        intent.putExtras(bundle);
        startActivityForResult(intent, 2);
    }

    public void d(final boolean z, ArrayList<MusicSong> arrayList, int i) {
        LogUtil.a("MusicMainActivity", "enter createNewSongMenu method ,songs isNotEmpty  ", Boolean.valueOf(njy.b(arrayList)), ",isHasSong ", Boolean.valueOf(z), ",menuSize ", Integer.valueOf(i));
        final MusicMenuViewDialog.Builder builder = new MusicMenuViewDialog.Builder(this.l);
        MusicMenuViewDialog musicMenuViewDialogD = builder.d();
        if (musicMenuViewDialogD == null) {
            LogUtil.a("MusicMainActivity", "createNewSongMenu failed, Create dialog is null");
            return;
        }
        musicMenuViewDialogD.show();
        final ArrayList arrayList2 = new ArrayList();
        if (njy.b(arrayList)) {
            arrayList2.addAll(arrayList);
        }
        if (i == 0) {
            builder.a().setText(R.string.IDS_hw_health_music_new_create_song);
        } else {
            builder.a().setText(R.string.IDS_hw_health_music_create_new_song);
        }
        builder.d(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MusicMainActivity.this.d(builder.c().getText().toString(), z, (ArrayList<MusicSong>) arrayList2);
            }
        });
        builder.c().addTextChangedListener(new TextWatcher() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.13
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable.toString().trim().length() != 0) {
                    if (MusicMainActivity.this.v().contains(editable.toString())) {
                        builder.b(false);
                        builder.e().setError(MusicMainActivity.this.getString(R.string.IDS_hw_health_music_repeated_name));
                        return;
                    } else {
                        builder.b(true);
                        builder.e().setError("");
                        return;
                    }
                }
                builder.b(false);
                builder.e().setError("");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final String str, final boolean z, ArrayList<MusicSong> arrayList) {
        LogUtil.a("MusicMainActivity", "enter addNewMenu method ,songs isNotEmpty  ", Boolean.valueOf(njy.b(arrayList)));
        final ArrayList arrayList2 = new ArrayList();
        if (njy.b(arrayList)) {
            arrayList2.addAll(arrayList);
        }
        OperationStruct operationStruct = new OperationStruct();
        operationStruct.setOperationType(0);
        operationStruct.setFolderName(str);
        this.ah.c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.18
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj == null) {
                    return;
                }
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                LogUtil.a("MusicMainActivity", "receive rsp index:", num);
                if (i == 100000) {
                    LogUtil.a("MusicMainActivity", "receive success rsp");
                    MusicMenu musicMenu = new MusicMenu();
                    musicMenu.setMenuName(str);
                    musicMenu.setMenuIndex(String.valueOf(iIntValue));
                    MusicMainActivity.this.q.add(musicMenu);
                    if (z) {
                        MusicMainActivity.this.a(musicMenu, (List<MusicSong>) arrayList2);
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setClass(MusicMainActivity.this, MusicSongsActivity.class);
                    lzu.c().a(musicMenu);
                    lzu.c().e(MusicMainActivity.this.n);
                    intent.putExtra("song_num", 0);
                    intent.putStringArrayListExtra("menu_list", MusicMainActivity.this.v());
                    MusicMainActivity.this.startActivityForResult(intent, 1);
                    Message messageObtainMessage = MusicMainActivity.this.y.obtainMessage();
                    messageObtainMessage.what = 1001;
                    MusicMainActivity.this.y.sendMessage(messageObtainMessage);
                    return;
                }
                LogUtil.a("MusicMainActivity", "addNewMenu failed, errCode:", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        LogUtil.a("MusicMainActivity", "refreshHwMusicSupportFlag enter:");
        ContentResolver contentResolver = getContentResolver();
        ContentProviderClient contentProviderClient = null;
        try {
            try {
                if (contentResolver == null) {
                    LogUtil.j("MusicMainActivity", "getBundleFromHwMusic: resolver is null");
                    return false;
                }
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(Uri.parse("content://com.android.mediacenter.healthprovider/InfoForWatch"));
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        LogUtil.j("MusicMainActivity", "getHwMusicAccountSendToWear, client is null.");
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        return false;
                    }
                    Bundle bundleCall = contentResolver.call(Uri.parse("content://com.android.mediacenter.healthprovider/InfoForWatch"), "getSupportFlag", (String) null, (Bundle) null);
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    if (bundleCall != null && !bundleCall.isEmpty()) {
                        LogUtil.a("MusicMainActivity", "bundle =", bundleCall.getString("supportLevel"));
                        return "1".equals(bundleCall.getString("supportLevel"));
                    }
                    LogUtil.a("MusicMainActivity", "bundle is empty!");
                    return false;
                } catch (RuntimeException unused) {
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    LogUtil.e("MusicMainActivity", "getHwMusicSupportFlag DeadObjectException");
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                contentProviderClientAcquireUnstableContentProviderClient = null;
            }
        } catch (RuntimeException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.l);
        builder.a(this.l.getResources().getString(R.string.IDS_hw_health_music_no_menu_delete_tip));
        builder.c(R.string.IDS_contact_confirm_ios_btn, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MusicMainActivity.this.p.setVisibility(0);
                MusicMainActivity musicMainActivity = MusicMainActivity.this;
                musicMainActivity.c(musicMainActivity.am);
                idy.b(AnalyticsValue.HEALTH_MUSIC_DELETE_SONG_1090084.value(), MusicMainActivity.this.f24440b);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("MusicMainActivity", "deleteMusicTip click cancel.");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        String deviceIdentify;
        LogUtil.a("MusicMainActivity", "mIsSupportHuaweiMusic :", Boolean.valueOf(e));
        if (e) {
            idy.b(AnalyticsValue.HEALTH_MUSIC_ONLINE_MUSIC_1090094.value(), this.f24440b);
            LogUtil.a("MusicMainActivity", "go to huawei music");
            Bundle bundle = new Bundle();
            DeviceInfo deviceInfoD = mgg.d("MusicMainActivity");
            if (deviceInfoD == null) {
                deviceIdentify = "";
            } else {
                deviceIdentify = deviceInfoD.getDeviceIdentify();
            }
            bundle.putString("deviceId", deviceIdentify);
            bundle.putString("from", getPackageName());
            bundle.putInt("needback", 1);
            bundle.putInt("channelid", 2);
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("hwmediacenter://com.android.mediacenter/healthpage?needback=1"));
            intent.putExtra("data", bundle);
            try {
                String strAc = CommonUtil.ac();
                if (!TextUtils.isEmpty(strAc)) {
                    intent.setPackage(strAc);
                } else {
                    LogUtil.j("MusicMainActivity", "Music invalid package name.");
                }
                e(intent, this.l);
            } catch (RuntimeException e2) {
                LogUtil.e("MusicMainActivity", ExceptionUtils.c(e2));
            }
        }
    }

    private void e(Intent intent, Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.j("MusicMainActivity", "startActivitySecurity can not get packageManager");
            return;
        }
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null) {
            LogUtil.j("MusicMainActivity", "startActivitySecurity can not find activity");
            return;
        }
        ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
        intent.setComponent(componentName);
        qrs.c(intent, componentName.getPackageName(), this, this.l.getResources().getString(R.string.IDS_hw_health_music_huawei_music));
    }

    private void t() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.l);
        builder.a(getResources().getString(R.string.IDS_hw_health_music_cancel_transfer_tip));
        builder.c(R.string.IDS_hw_health_music_stop_add, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("MusicMainActivity", "cancelTransferTip click agree.");
                MusicMainActivity.this.o();
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("MusicMainActivity", "cancelTransferTip click cancel.");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MusicMenu musicMenu, List<MusicSong> list) {
        if (list == null) {
            LogUtil.j("MusicMainActivity", "addMusicToMenu songList is null.");
            return;
        }
        LogUtil.a("MusicMainActivity", "addMusicToMenu songList size: ", Integer.valueOf(list.size()));
        final ArrayList arrayList = new ArrayList(16);
        try {
            ArrayList arrayList2 = new ArrayList(16);
            for (MusicSong musicSong : list) {
                if (!musicMenu.getMusicSongsList().contains(musicSong)) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt(musicSong.getSongIndex())));
                    arrayList.add(musicSong);
                }
            }
            musicMenu.addRealMusicCount(arrayList);
            Message messageObtainMessage = this.y.obtainMessage();
            messageObtainMessage.what = 1001;
            this.y.sendMessage(messageObtainMessage);
            LogUtil.a("MusicMainActivity", "addSongsToMenuByLongClick enter, songsIndexList size:", Integer.valueOf(arrayList2.size()));
            OperationStruct operationStruct = new OperationStruct();
            operationStruct.setOperationType(3);
            operationStruct.setFolderIndex(Integer.parseInt(musicMenu.getMenuIndex()));
            operationStruct.setMusicIndexs(arrayList2);
            lzl.a(this.l).c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.23
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("MusicMainActivity", "addMusicToMenu onResponse errorCode: ", Integer.valueOf(i));
                    if (i != 100000) {
                        musicMenu.removeRealMusicCount(arrayList);
                        Message messageObtainMessage2 = MusicMainActivity.this.y.obtainMessage();
                        messageObtainMessage2.what = 1001;
                        MusicMainActivity.this.y.sendMessage(messageObtainMessage2);
                    }
                }
            });
        } catch (NumberFormatException unused) {
            LogUtil.a("MusicMainActivity", "addMusicToMenu occur NumberFormatException.");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.a("MusicMainActivity", "Enter onPause.");
        this.af = false;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ba();
        ServiceConnection serviceConnection = this.bm;
        if (serviceConnection != null) {
            unbindService(serviceConnection);
            this.bm = null;
        }
        SyncMusicBinder syncMusicBinder = this.bj;
        if (syncMusicBinder != null) {
            syncMusicBinder.setSyncMusicListener(null);
            this.bj = null;
        }
        lzl.a(BaseApplication.getContext()).b();
        lzu.c().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        this.br.clear();
        this.br.addAll(this.x);
        LogUtil.a("MusicMainActivity", "mUnFinishedSongsLists size:", Integer.valueOf(this.br.size()));
        Iterator<MusicSong> it = this.br.iterator();
        while (it.hasNext()) {
            if (it.next().getMusicAppType() != 0) {
                it.remove();
            }
        }
        LogUtil.a("MusicMainActivity", "mUnFinishedSongsLists has local music size:", Integer.valueOf(this.br.size()));
        Message messageObtainMessage = this.y.obtainMessage();
        messageObtainMessage.what = 1004;
        this.y.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, int i) {
        LogUtil.a("MusicMainActivity", "refreshAddMusicLayoutOnCreate enter, mIsSyncMusicTaskAlive is:", Boolean.valueOf(z), ",isCancelSyncMusic:", Boolean.valueOf(maa.b().l()));
        this.aj = z;
        this.aw = i;
        if (f()) {
            SyncMusicBinder syncMusicBinder = this.bj;
            if (syncMusicBinder != null) {
                syncMusicBinder.notifyUiCurrentMusicProgress();
                this.bj.notifyUiCurrentMusicNameAndTotalProgress();
            }
            ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "refreshAddMusicLayoutOnCreate show addMusic");
            Message messageObtainMessage = this.y.obtainMessage();
            messageObtainMessage.what = 1012;
            this.y.sendMessage(messageObtainMessage);
            return;
        }
        ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "refreshAddMusicLayoutOnCreate hide addMusic");
        Message messageObtainMessage2 = this.y.obtainMessage();
        messageObtainMessage2.what = 1013;
        this.y.sendMessage(messageObtainMessage2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Message messageObtainMessage = this.y.obtainMessage();
        messageObtainMessage.arg1 = i;
        messageObtainMessage.what = 1007;
        this.y.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Message messageObtainMessage = this.y.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString("SONGNAME", str);
        bundle.putString("PROGRESSTEXT", str2);
        messageObtainMessage.setData(bundle);
        messageObtainMessage.what = 1005;
        this.y.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "updateUiWhenOneSongStart show addMusic");
        this.g.setVisibility(0);
        this.m.setText(str);
        this.bp.setText(str2);
    }

    private void a(ArrayList<MusicSong> arrayList) {
        LogUtil.a("MusicMainActivity", "enter addSongToDefaultMenu method");
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        if (!this.aj) {
            this.x.clear();
        }
        if (this.ad != null) {
            this.aj = true;
            bc();
            Intent intent = new Intent();
            intent.setClass(this.l, SyncMusicService.class);
            intent.setAction("syncMusicListTaskBegin");
            startService(intent);
        } else {
            LogUtil.e("MusicMainActivity", "transferMusicFile Error:mHwDeviceConfigManager is null");
        }
        this.ay.postDelayed(new Runnable() { // from class: com.huawei.ui.device.activity.music.MusicMainActivity.22
            @Override // java.lang.Runnable
            public void run() {
                MusicMainActivity.this.ay.smoothScrollTo(0, 0);
            }
        }, 100L);
    }

    private void e(MusicMenu musicMenu) {
        LogUtil.a("MusicMainActivity", "updateMusicMenuInfoByReturn enter");
        if (musicMenu == null) {
            LogUtil.a("MusicMainActivity", "onActivityResult， menu is null");
            return;
        }
        String menuName = musicMenu.getMenuName();
        for (MusicMenu musicMenu2 : this.q) {
            if (musicMenu2.getMenuName().equals(menuName)) {
                String memuNewName = musicMenu.getMemuNewName();
                if (!TextUtils.isEmpty(memuNewName)) {
                    musicMenu2.setMenuName(memuNewName);
                }
                musicMenu2.setMenuMusicCount(musicMenu.getMenuMusicCount());
                break;
            }
        }
        am();
    }

    private void am() {
        Message messageObtainMessage = this.y.obtainMessage();
        messageObtainMessage.what = 1001;
        this.y.sendMessage(messageObtainMessage);
    }

    private void b(String str) {
        LogUtil.a("MusicMainActivity", "deleteMusicMenuByReturn enter");
        Iterator<MusicMenu> it = this.q.iterator();
        while (it.hasNext()) {
            if (it.next().getMenuName().equals(str)) {
                it.remove();
                LogUtil.a("MusicMainActivity", "deleteMusicMenuByReturn succeed");
                break;
            }
        }
        a aVar = new a();
        this.av = aVar;
        this.j.setAdapter(aVar);
        Message messageObtainMessage = this.y.obtainMessage();
        messageObtainMessage.what = 1001;
        this.y.sendMessage(messageObtainMessage);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("MusicMainActivity", "onActivityResult enter, req:", Integer.valueOf(i), ";resultcode:", Integer.valueOf(i2));
        if (intent == null) {
            LogUtil.a("MusicMainActivity", "onActivityResult， data is null");
            return;
        }
        if (i == 1) {
            c(i2);
            return;
        }
        if (i == 2) {
            ArrayList<MusicSong> arrayListA = lzu.c().a();
            if (arrayListA != null) {
                a(arrayListA);
                return;
            } else {
                LogUtil.a("MusicMainActivity", "onActivityResult， songList is null");
                return;
            }
        }
        if (i != 3) {
            LogUtil.j("MusicMainActivity", "onActivityResult, default.");
            return;
        }
        if (i2 == 1) {
            n();
            return;
        }
        if (i2 == 2) {
            this.t.setVisibility(8);
            ArrayList<MusicSong> arrayList = this.br;
            if (arrayList == null || arrayList.size() == 0) {
                LogUtil.a("MusicMainActivity", "mUnFinishedSongsLists is empty, something wrong!");
                return;
            }
            LogUtil.a("MusicMainActivity", "mUnFinishedSongsLists size:", Integer.valueOf(this.br.size()));
            lzu.c().a(this.br);
            a(this.br);
            return;
        }
        LogUtil.j("MusicMainActivity", "UN_COMPLETED_MUSIC_REQUEST_CODE, default.");
    }

    private void c(int i) {
        MusicMenu musicMenuD = lzu.c().d();
        if (musicMenuD == null) {
            LogUtil.a("MusicMainActivity", "onActivityResult， menu is null");
            return;
        }
        String memuNewName = musicMenuD.getMemuNewName();
        String menuName = musicMenuD.getMenuName();
        LogUtil.a("MusicMainActivity", "onActivityResult receive returnmenu, menu name =", menuName, ";menu new name=", memuNewName);
        if (i == 1) {
            e(musicMenuD);
        } else if (i != 3) {
            LogUtil.j("MusicMainActivity", "not support operation!");
        } else {
            b(menuName);
        }
    }

    static class c implements SearchView.OnQueryTextListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MusicMainActivity> f24484a;

        c(MusicMainActivity musicMainActivity) {
            if (musicMainActivity != null) {
                this.f24484a = new WeakReference<>(musicMainActivity);
            }
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            return e(str);
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            return e(str);
        }

        private boolean e(String str) {
            MusicMainActivity musicMainActivity = this.f24484a.get();
            if (musicMainActivity == null || musicMainActivity.y == null) {
                return false;
            }
            if (!TextUtils.isEmpty(str)) {
                musicMainActivity.y.sendEmptyMessage(1011);
                musicMainActivity.bd = str;
                musicMainActivity.bc.a(musicMainActivity.bd, musicMainActivity.n.getMusicSongsList(), LocalMusicSearchThreadManager.SearchType.SONG);
                return true;
            }
            musicMainActivity.bd = null;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1010;
            messageObtain.obj = musicMainActivity.n.getMusicSongsList();
            musicMainActivity.y.sendMessage(messageObtain);
            return true;
        }
    }

    @Override // com.huawei.ui.device.views.music.LocalMusicSearchThreadManager.SearchCallback
    public void onSearchResult(List<MusicSong> list) {
        if (this.y != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1010;
            messageObtain.obj = list;
            this.y.sendMessage(messageObtain);
        }
    }

    private void d(List<MusicSong> list) {
        this.ao.setIconTitle(2, getResources().getString(R.string.IDS_contact_delete_select_all));
        if (njy.e(list)) {
            LogUtil.j("MusicMainActivity", "musicSongList is empty");
        } else {
            if (!lzu.c().h() || list.size() <= 500) {
                return;
            }
            this.ao.setIconTitle(2, getResources().getString(R.string.IDS_hw_music_select_five_hundred));
        }
    }

    static class b implements MusicControllerCallbackInterface {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MusicMainActivity> f24483b;

        public b(MusicMainActivity musicMainActivity) {
            this.f24483b = new WeakReference<>(musicMainActivity);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicControllerCallbackInterface
        public void onGetFolders(List<MusicFolderStruct> list, int i) {
            MusicMainActivity musicMainActivity = this.f24483b.get();
            if (musicMainActivity == null || musicMainActivity.y == null) {
                ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "InitDeviceMusicCallback onGetFolders activity: ", Boolean.valueOf(musicMainActivity == null));
                return;
            }
            ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "InitDeviceMusicCallback onGetFolders errorCode", Integer.valueOf(i));
            if (i == 100000) {
                MusicMainActivity.c(list, musicMainActivity);
                return;
            }
            Message messageObtainMessage = musicMainActivity.y.obtainMessage();
            messageObtainMessage.what = 1014;
            musicMainActivity.y.sendMessage(messageObtainMessage);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicControllerCallbackInterface
        public void onGetNegotiationData(NegotiationData negotiationData, int i) {
            MusicMainActivity musicMainActivity = this.f24483b.get();
            if (musicMainActivity == null || musicMainActivity.y == null) {
                ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "InitDeviceMusicCallback onGetNegotiationData activity: ", Boolean.valueOf(musicMainActivity == null));
                return;
            }
            ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "InitDeviceMusicCallback onGetNegotiationData errorCode", Integer.valueOf(i));
            if (i == 100000) {
                musicMainActivity.bg = negotiationData.getMusicFormatList();
                lzt.d().c(negotiationData.getMusicFormatList());
                if (musicMainActivity.bg.isEmpty()) {
                    ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "receive onGetNegotiationData SupportMusicTypeList is empty!");
                }
                musicMainActivity.bh = negotiationData.getStorageSpace();
                LogUtil.a("MusicMainActivity", "receive onGetNegotiationData memory size:", Integer.valueOf(musicMainActivity.bh));
                musicMainActivity.ap = negotiationData.getMaxMusicNumber();
                LogUtil.a("MusicMainActivity", "receive onGetNegotiationData max music number:", Integer.valueOf(musicMainActivity.ap));
                musicMainActivity.au = negotiationData.getMusicCount();
                LogUtil.a("MusicMainActivity", "receive onGetNegotiationData music count:", Integer.valueOf(musicMainActivity.au));
                lzu.c().b(negotiationData);
                Message messageObtainMessage = musicMainActivity.y.obtainMessage();
                messageObtainMessage.what = 1002;
                musicMainActivity.y.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicControllerCallbackInterface
        public void onGetMusicFileInfo(int i, String str, int i2) {
            LogUtil.a("MusicMainActivity", "receive device's getMusicFileInfo request! musicIndex:", Integer.valueOf(i), "; fileName:", str);
        }
    }

    static class d implements NegotiationCallbackInterface {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<MusicMainActivity> f24485c;

        public d(MusicMainActivity musicMainActivity) {
            this.f24485c = new WeakReference<>(musicMainActivity);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationCallbackInterface
        public void onGetNegotiationData(NegotiationData negotiationData, int i) {
            MusicMainActivity musicMainActivity = this.f24485c.get();
            if (negotiationData == null || musicMainActivity == null) {
                ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "DeviceMenuSizeCallback return negotiationData: ", Boolean.valueOf(negotiationData == null));
                return;
            }
            ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "DeviceMenuSizeCallback errorCode", Integer.valueOf(i));
            if (i == 100000) {
                LogUtil.a("MusicMainActivity", "onGetNegotiationData rsp,menuSize:", Integer.valueOf(negotiationData.getMaxFolderNumber()));
                musicMainActivity.bh = negotiationData.getStorageSpace();
                LogUtil.a("MusicMainActivity", "receive onGetNegotiationData memory size:", Integer.valueOf(musicMainActivity.bh));
                musicMainActivity.as = negotiationData.getMaxFolderNumber();
                lzt.d().c(negotiationData.getMusicFormatList());
                MusicMainActivity.a(negotiationData, musicMainActivity);
            }
        }
    }

    static class e implements NegotiationCallbackInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MusicMainActivity> f24486a;

        public e(MusicMainActivity musicMainActivity) {
            this.f24486a = new WeakReference<>(musicMainActivity);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationCallbackInterface
        public void onGetNegotiationData(NegotiationData negotiationData, int i) {
            MusicMainActivity musicMainActivity = this.f24486a.get();
            if (musicMainActivity == null || musicMainActivity.y == null) {
                ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "RefreshDeviceMemoryCallback return activity: ", Boolean.valueOf(musicMainActivity == null));
                return;
            }
            ReleaseLogUtil.d("DEVMGR_MusicMainActivity", "RefreshDeviceMemoryCallback errorCode", Integer.valueOf(i));
            if (i == 100000) {
                LogUtil.a("MusicMainActivity", "onGetNegotiationData rsp,memory:", Integer.valueOf(negotiationData.getStorageSpace()));
                musicMainActivity.bh = negotiationData.getStorageSpace();
                Message messageObtainMessage = musicMainActivity.y.obtainMessage();
                messageObtainMessage.what = 1002;
                musicMainActivity.y.sendMessage(messageObtainMessage);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
