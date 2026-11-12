package com.huawei.ui.device.activity.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicMenu;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.OperationStruct;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.views.music.MusicLinearLayoutManager;
import com.huawei.ui.device.views.music.MusicMenuViewDialog;
import defpackage.idy;
import defpackage.lsk;
import defpackage.lzl;
import defpackage.lzq;
import defpackage.lzu;
import defpackage.njy;
import defpackage.qop;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.rga;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class MusicSongsActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MusicSongsActivity f24488b;
    private ArrayList<String> e;
    private LinearLayout h;
    private LinearLayout i;
    private RelativeLayout l;
    private LinearLayout p;
    private HealthProgressBar q;
    private MusicLinearLayoutManager r;
    private b s;
    private HealthRecycleView t;
    private CustomTitleBar u;
    private HealthToolBar v;
    private d g = new d(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MusicMenu f24489c = new MusicMenu();
    private MusicMenu f = new MusicMenu();
    private boolean o = false;
    private boolean k = false;
    private List<MusicSong> n = new ArrayList(16);
    private HashMap<Integer, Boolean> m = new HashMap<>(16);
    private int j = 2;
    private Map<String, Object> d = new HashMap(16);
    private HealthToolBar.OnSingleTapListener w = new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.2
        @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
        public void onSingleTap(int i) {
            if (MusicSongsActivity.this.j != 2) {
                MusicSongsActivity.this.d();
                return;
            }
            if (i == 1) {
                MusicSongsActivity.this.a();
                idy.b(AnalyticsValue.HEALTH_MUSIC_MENU_ALL_SELECT_1090088.value(), MusicSongsActivity.this.d);
            } else {
                if (i != 2) {
                    return;
                }
                if (!qrs.r()) {
                    MusicSongsActivity.this.c();
                } else {
                    LogUtil.j("MusicSongsActivity", "click to fast!");
                }
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f24487a = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("MusicSongsActivity", "device connect state onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("MusicSongsActivity", "device connect state onReceive intent :", action);
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                if (deviceInfo == null) {
                    LogUtil.j("MusicSongsActivity", "device connect state onReceive deviceInfo is null.");
                    return;
                }
                if (!lzq.d(deviceInfo)) {
                    LogUtil.j("MusicSongsActivity", "This device does not have the correspond capability.");
                    return;
                }
                MusicSongsActivity.this.j = deviceInfo.getDeviceConnectState();
                int i = MusicSongsActivity.this.j;
                if (i == 1) {
                    LogUtil.a("MusicSongsActivity", "DEVICE_CONNECTING");
                    return;
                }
                if (i == 2) {
                    LogUtil.a("MusicSongsActivity", "DEVICE_CONNECTED");
                } else if (i != 3) {
                    LogUtil.j("MusicSongsActivity", "DEVICE_CONNECT_STATUS_OTHER");
                } else {
                    LogUtil.a("MusicSongsActivity", "DEVICE_DISCONNECTED");
                }
            }
        }
    };

    class b extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HashMap<Integer, Integer> f24502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f24503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LayoutInflater f24504c;
        private List<MusicSong> d;

        class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private HealthCheckBox f24508b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private HealthTextView f24509c;
            private HealthTextView d;
            private ImageView e;
            private ImageView f;

            a(View view) {
                super(view);
                this.d = (HealthTextView) view.findViewById(R.id.music_song_name_tv);
                this.f24509c = (HealthTextView) view.findViewById(R.id.music_song_singer_tv);
                this.e = (ImageView) view.findViewById(R.id.imageview_more_or_select);
                this.f24508b = (HealthCheckBox) view.findViewById(R.id.cb_more_or_select);
                this.f = (ImageView) view.findViewById(R.id.under_line);
            }

            private void b(final int i, final boolean z, final MusicSong musicSong) {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.b.a.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ReleaseLogUtil.d("R_MusicSongsActivity", "item click positon:", Integer.valueOf(i), ",isChecked:", Boolean.valueOf(z));
                        if (z) {
                            MusicSongsActivity.this.m.put(Integer.valueOf(i), false);
                            a.this.f24508b.setChecked(false);
                            MusicSongsActivity.this.n.remove(musicSong);
                            if (MusicSongsActivity.this.n.size() != b.this.d.size()) {
                                MusicSongsActivity.this.k = false;
                                MusicSongsActivity.this.a((List<MusicSong>) b.this.d);
                                MusicSongsActivity.this.v.setIcon(1, R.drawable.ic_public_select_all);
                            }
                        } else if (MusicSongsActivity.this.n.size() < 500) {
                            if (!MusicSongsActivity.this.n.contains(musicSong)) {
                                MusicSongsActivity.this.m.put(Integer.valueOf(i), true);
                                a.this.f24508b.setChecked(true);
                                MusicSongsActivity.this.n.add(musicSong);
                                if (MusicSongsActivity.this.n.size() == b.this.d.size() || (lzu.c().h() && MusicSongsActivity.this.n.size() >= 500)) {
                                    MusicSongsActivity.this.k = true;
                                    MusicSongsActivity.this.v.setIconTitle(1, MusicSongsActivity.this.getResources().getString(R.string.IDS_contact_delete_uncheck_all));
                                    MusicSongsActivity.this.v.setIcon(1, R.drawable.ic_public_deselect_all);
                                }
                            } else {
                                ReleaseLogUtil.d("R_MusicSongsActivity", "mListDeletes contains song");
                                return;
                            }
                        } else {
                            qpx.b(MusicSongsActivity.this.f24488b, MusicSongsActivity.this.getResources().getString(R.string.IDS_hw_music_limit_five_hundred));
                            return;
                        }
                        b.this.notifyDataSetChanged();
                    }
                });
                if (MusicSongsActivity.this.n.size() > 0) {
                    MusicSongsActivity.this.u.setTitleText(MusicSongsActivity.this.getResources().getQuantityString(R.plurals.IDS_hw_weight_delete_check_measure_data, 0, Integer.valueOf(MusicSongsActivity.this.n.size())));
                } else {
                    MusicSongsActivity.this.u.setTitleText(MusicSongsActivity.this.getResources().getString(R.string.IDS_hw_show_main_health_page_healthdata_selected));
                }
            }

            public void d(MusicSong musicSong, final int i) {
                if (musicSong == null) {
                    return;
                }
                this.d.setText(musicSong.getSongName());
                this.f24509c.setText(rga.a(MusicSongsActivity.this.f24488b, musicSong));
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.b.a.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        b.this.d(view, i);
                    }
                });
                this.e.setVisibility(MusicSongsActivity.this.o ? 8 : 0);
                this.f24508b.setVisibility(MusicSongsActivity.this.o ? 0 : 8);
                boolean zEquals = Boolean.TRUE.equals(MusicSongsActivity.this.m.get(Integer.valueOf(i)));
                this.f24508b.setChecked(zEquals);
                if (MusicSongsActivity.this.o) {
                    b(i, zEquals, musicSong);
                } else {
                    View view = this.itemView;
                    b bVar = b.this;
                    view.setOnLongClickListener(bVar.new e(i, bVar.d));
                }
                if (MusicSongsActivity.this.n.size() == 0) {
                    MusicSongsActivity.this.v.setIconVisible(2, 8);
                } else {
                    MusicSongsActivity.this.v.setIconVisible(2, 0);
                }
                if (b.this.d.size() - 1 == i) {
                    this.f.setVisibility(8);
                } else if (CommonUtil.at()) {
                    this.f.setVisibility(8);
                } else {
                    this.f.setVisibility(0);
                }
            }
        }

        b(List<MusicSong> list, int i) {
            this.d = new ArrayList(16);
            this.f24504c = LayoutInflater.from(MusicSongsActivity.this.f24488b);
            this.d = list;
            c(list, i);
        }

        public void c(List<MusicSong> list, int i) {
            this.f24502a = new HashMap<>(16);
            MusicSongsActivity.this.m = new HashMap(16);
            if (MusicSongsActivity.this.o) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    this.f24502a.put(Integer.valueOf(i2), 0);
                    MusicSongsActivity.this.m.put(Integer.valueOf(i2), false);
                }
            } else {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    this.f24502a.put(Integer.valueOf(i3), 8);
                    MusicSongsActivity.this.m.put(Integer.valueOf(i3), false);
                }
            }
            if (!MusicSongsActivity.this.o || i < 0) {
                return;
            }
            MusicSongsActivity.this.m.put(Integer.valueOf(i), true);
        }

        public List<MusicSong> e() {
            List<MusicSong> list = this.d;
            return list == null ? new ArrayList() : list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<MusicSong> list = this.d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup viewGroup, int i) {
            a aVar = new a(this.f24504c.inflate(R.layout.activity_music_song_list_item, viewGroup, false));
            this.f24503b = aVar;
            aVar.setIsRecyclable(false);
            return this.f24503b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a aVar, int i) {
            if (this.d.isEmpty() || i < 0 || i >= this.d.size()) {
                return;
            }
            aVar.d(this.d.get(i), i);
        }

        class e implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f24513a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<MusicSong> f24514c;

            e(int i, List<MusicSong> list) {
                this.f24513a = i;
                this.f24514c = list;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                ReleaseLogUtil.d("R_MusicSongsActivity", "item longclick positon:", Integer.valueOf(this.f24513a));
                MusicSongsActivity.this.o = true;
                MusicSongsActivity.this.n.clear();
                int i = this.f24513a;
                if (i >= 0 && i < this.f24514c.size()) {
                    MusicSongsActivity.this.n.add(this.f24514c.get(this.f24513a));
                }
                MusicSongsActivity.this.a(MusicSongsActivity.this.o);
                for (int i2 = 0; i2 < this.f24514c.size(); i2++) {
                    MusicSongsActivity.this.s.f24502a.put(Integer.valueOf(i2), 0);
                }
                MusicSongsActivity.this.m.put(Integer.valueOf(this.f24513a), true);
                b.this.notifyDataSetChanged();
                idy.b(AnalyticsValue.HEALTH_MUSIC_MENU_LONG_CLICK_1090087.value(), MusicSongsActivity.this.d);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(View view, final int i) {
            View viewInflate = LayoutInflater.from(MusicSongsActivity.this).inflate(R.layout.delete_toolbar_popupwindow, (ViewGroup) null);
            final qop qopVar = new qop(MusicSongsActivity.this.f24488b, viewInflate);
            qopVar.e(view, 14);
            viewInflate.findViewById(R.id.delete_music_ll).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.b.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (MusicSongsActivity.this.j == 2) {
                        MusicSongsActivity.this.e(i);
                        qop qopVar2 = qopVar;
                        if (qopVar2 != null) {
                            qopVar2.e();
                        }
                        idy.b(AnalyticsValue.HEALTH_MUSIC_DELETE_SONG_FROM_MENU_1090089.value(), MusicSongsActivity.this.d);
                        return;
                    }
                    MusicSongsActivity.this.d();
                }
            });
        }
    }

    static class d extends BaseHandler<MusicSongsActivity> {
        d(MusicSongsActivity musicSongsActivity) {
            super(musicSongsActivity);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MusicSongsActivity musicSongsActivity, Message message) {
            switch (message.what) {
                case 1000:
                    musicSongsActivity.p.setVisibility(8);
                    musicSongsActivity.a(musicSongsActivity.o);
                    musicSongsActivity.o();
                    break;
                case 1001:
                    musicSongsActivity.a(musicSongsActivity.o);
                    musicSongsActivity.o();
                    break;
                case 1002:
                    musicSongsActivity.u.setTitleText(musicSongsActivity.f24489c.getMemuNewName());
                    musicSongsActivity.o();
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        qpx.e(this.f24488b, getResources().getString(R.string.IDS_hw_health_music_check_bluetooth_connection));
    }

    private void p() {
        LogUtil.a("MusicSongsActivity", "Enter registerConnectStateBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.f24488b, this.f24487a, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void t() {
        try {
            unregisterReceiver(this.f24487a);
        } catch (IllegalArgumentException e) {
            LogUtil.a("MusicSongsActivity", e.getMessage());
        }
    }

    private void m() {
        MusicMenu musicMenu = this.f24489c;
        if (musicMenu != null) {
            if (musicMenu.getMusicSongsList().size() == 0) {
                this.i.setVisibility(8);
                this.h.setVisibility(0);
            } else {
                this.i.setVisibility(0);
                this.h.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            this.u.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_cancel_selector), qre.f(R.string.accessibility_close));
            this.u.setTitleText(getResources().getQuantityString(R.plurals.IDS_hw_weight_delete_check_measure_data, 0, Integer.valueOf(this.n.size())));
            this.u.setRightTextButtonVisibility(8);
            this.v.setVisibility(0);
            if (this.n.size() == 500) {
                this.v.setIconTitle(1, getResources().getString(R.string.IDS_contact_delete_uncheck_all));
                this.v.setIcon(1, R.drawable.ic_public_deselect_all);
                this.k = true;
            } else {
                a(this.f24489c.getMusicSongsList());
                this.v.setIcon(1, R.drawable.ic_public_select_all);
                this.k = false;
            }
        } else {
            this.u.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
            MusicMenu musicMenu = this.f24489c;
            if (musicMenu != null) {
                this.u.setTitleText(musicMenu.getMenuName());
            }
            this.u.setRightTextButtonVisibility(0);
            this.v.setVisibility(8);
            this.n.clear();
            o();
        }
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        b bVar;
        if (this.f24489c == null || (bVar = this.s) == null) {
            return;
        }
        bVar.c(bVar.e(), -1);
        this.s.notifyDataSetChanged();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_music_menu_songs);
        this.f24488b = this;
        this.d.put("click", "1");
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.e = intent.getStringArrayListExtra("menu_list");
            } catch (ArrayIndexOutOfBoundsException e) {
                LogUtil.e("MusicSongsActivity", "get mAllMenuNameList error:", e.getMessage());
            }
            MusicMenu musicMenuD = lzu.c().d();
            if (musicMenuD != null) {
                this.f24489c = musicMenuD;
            }
            MusicMenu musicMenuB = lzu.c().b();
            if (musicMenuB != null) {
                this.f = musicMenuB;
            }
            this.j = intent.getIntExtra("current_bluetooth_status", 2);
            if (intent.getIntExtra("song_num", 16) == 0) {
                e();
            }
        }
        p();
        n();
        i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.o) {
            a(false);
            this.o = false;
        } else {
            super.onBackPressed();
        }
    }

    private void n() {
        this.t = (HealthRecycleView) findViewById(R.id.musics_songs_in_menu_list);
        this.i = (LinearLayout) findViewById(R.id.data_ll);
        this.h = (LinearLayout) findViewById(R.id.empty_ll);
        this.p = (LinearLayout) findViewById(R.id.load_ll);
        this.q = (HealthProgressBar) findViewById(R.id.load_progressbar);
        HealthProgressBar healthProgressBar = (HealthProgressBar) findViewById(R.id.load_progressbar);
        this.q = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        g();
        j();
        h();
    }

    private void h() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.layout_music_load_all_tips);
        this.l = relativeLayout;
        relativeLayout.setVisibility(this.f24489c.getMusicSongsList().size() == this.f24489c.getMenuMusicCount() ? 8 : 0);
        findViewById(R.id.load_all_music_confirm_tv).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MusicSongsActivity.this.l.setVisibility(8);
            }
        });
    }

    private void f() {
        this.u.setRightTextButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View viewInflate = LayoutInflater.from(MusicSongsActivity.this.f24488b).inflate(R.layout.popview_menu_more_operation, (ViewGroup) null);
                final qop qopVar = new qop(MusicSongsActivity.this.f24488b, viewInflate);
                qopVar.e(view, 14);
                viewInflate.findViewById(R.id.add_music_rl).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (MusicSongsActivity.this.j == 2) {
                            MusicSongsActivity.this.e();
                            qopVar.e();
                            idy.b(AnalyticsValue.HEALTH_MUSIC_ADD_MUSIC_TO_MENU_1090092.value(), MusicSongsActivity.this.d);
                            return;
                        }
                        MusicSongsActivity.this.d();
                    }
                });
                viewInflate.findViewById(R.id.rename_music_rl).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.7.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (MusicSongsActivity.this.j == 2) {
                            MusicSongsActivity.this.l();
                            qopVar.e();
                        } else {
                            MusicSongsActivity.this.d();
                        }
                    }
                });
                viewInflate.findViewById(R.id.del_menu_rl).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.7.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (MusicSongsActivity.this.j == 2) {
                            MusicSongsActivity.this.b();
                            qopVar.e();
                            idy.b(AnalyticsValue.HEALTH_MUSIC_DELETE_MENU_1090091.value(), MusicSongsActivity.this.d);
                            return;
                        }
                        MusicSongsActivity.this.d();
                    }
                });
            }
        });
    }

    private void j() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.local_music_resource_titlebar);
        this.u = customTitleBar;
        MusicMenu musicMenu = this.f24489c;
        if (musicMenu != null) {
            customTitleBar.setTitleText(musicMenu.getMenuName());
        }
        this.u.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.u.setRightTextButtonClickable(true);
        this.u.setRightTextButtonVisibility(0);
        f();
        this.u.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MusicSongsActivity.this.o) {
                    MusicSongsActivity.this.a(false);
                    MusicSongsActivity.this.o = false;
                } else {
                    MusicSongsActivity.this.k();
                }
            }
        });
    }

    private void g() {
        this.v = (HealthToolBar) findViewById(R.id.bottom_operate_toolbar);
        this.v.d(View.inflate(this, R.layout.hw_toolbar_bottomview, null));
        this.v.setOnSingleTapListener(this.w);
        this.v.setIcon(1, R.drawable.ic_public_select_all);
        a(this.f24489c.getMusicSongsList());
        this.v.setIcon(2, R.drawable.ic_delete);
        this.v.setIconTitle(2, getResources().getString(R.string.IDS_hw_health_music_remove_from_song_list));
        this.v.setIconVisible(3, 8);
    }

    private void i() {
        if (this.f24489c == null) {
            return;
        }
        MusicLinearLayoutManager musicLinearLayoutManager = new MusicLinearLayoutManager(this.f24488b);
        this.r = musicLinearLayoutManager;
        this.t.setLayoutManager(musicLinearLayoutManager);
        b bVar = new b(this.f24489c.getMusicSongsList(), -1);
        this.s = bVar;
        this.t.setAdapter(bVar);
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Intent intent = new Intent(this.f24488b, (Class<?>) DefaultMenuSongsListActivity.class);
        MusicMenu musicMenu = new MusicMenu();
        musicMenu.getMusicSongsList().addAll(this.f.getMusicSongsList());
        if (this.f24489c != null) {
            musicMenu.getMusicSongsList().removeAll(this.f24489c.getMusicSongsList());
        }
        lzu.c().e(musicMenu);
        lzu.c().a(this.f24489c);
        startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        final MusicMenuViewDialog.Builder builder = new MusicMenuViewDialog.Builder(this.f24488b);
        MusicMenuViewDialog musicMenuViewDialogD = builder.d();
        if (musicMenuViewDialogD == null) {
            LogUtil.a("MusicSongsActivity", "modifyMenuNameByUser failed! Create dialog error!");
            return;
        }
        musicMenuViewDialogD.show();
        builder.a().setText(R.string.IDS_hw_health_music_rename);
        builder.d(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MusicSongsActivity.this.e(builder.c().getText().toString());
                idy.b(AnalyticsValue.HEALTH_MUSIC_RENAME_MENU_1090090.value(), MusicSongsActivity.this.d);
            }
        });
        builder.c().addTextChangedListener(new TextWatcher() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.9
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().trim().isEmpty()) {
                    if (MusicSongsActivity.this.e.contains(editable.toString())) {
                        builder.b(false);
                        builder.e().setError(MusicSongsActivity.this.getString(R.string.IDS_hw_health_music_repeated_name));
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
    public boolean e(String str) {
        LogUtil.a("MusicSongsActivity", "modifyMenuName enter");
        try {
            final OperationStruct operationStruct = new OperationStruct();
            operationStruct.setOperationType(2);
            operationStruct.setFolderIndex(Integer.parseInt(this.f24489c.getMenuIndex()));
            operationStruct.setFolderName(str);
            lzl.a(this.f24488b).c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("MusicSongsActivity", "receive modifyMenuName rsp time:", Long.valueOf(System.currentTimeMillis()));
                    if (i == 100000) {
                        MusicSongsActivity.this.f24489c.setMemuNewName(operationStruct.getFolderName());
                        Iterator it = MusicSongsActivity.this.e.iterator();
                        while (it.hasNext()) {
                            if (((String) it.next()).equals(MusicSongsActivity.this.f24489c.getMenuName())) {
                                it.remove();
                                MusicSongsActivity.this.e.add(operationStruct.getFolderName());
                                MusicSongsActivity.this.f24489c.setMenuName(operationStruct.getFolderName());
                                break;
                            }
                        }
                        Message messageObtainMessage = MusicSongsActivity.this.g.obtainMessage();
                        messageObtainMessage.what = 1002;
                        MusicSongsActivity.this.g.sendMessage(messageObtainMessage);
                        return;
                    }
                    LogUtil.a("MusicSongsActivity", "modifyMenuName failed, errCode:", Integer.valueOf(i));
                }
            });
            return true;
        } catch (NumberFormatException e) {
            LogUtil.a("MusicSongsActivity", "modifyMenuName failed, exception:", e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (!this.k) {
            this.v.setIconTitle(1, getResources().getString(R.string.IDS_contact_delete_uncheck_all));
            this.v.setIcon(1, R.drawable.ic_public_deselect_all);
            this.k = true;
            MusicMenu musicMenu = this.f24489c;
            if (musicMenu != null) {
                if (musicMenu.getMusicSongsList().size() <= 500) {
                    q();
                } else {
                    r();
                }
            }
            this.s.notifyDataSetChanged();
            return;
        }
        a(this.f24489c.getMusicSongsList());
        this.v.setIcon(1, R.drawable.ic_public_select_all);
        this.k = false;
        this.n.clear();
        for (int i = 0; i < this.f24489c.getMusicSongsList().size(); i++) {
            this.m.put(Integer.valueOf(i), false);
        }
        this.s.notifyDataSetChanged();
    }

    private void q() {
        this.n.clear();
        this.n.addAll(this.f24489c.getMusicSongsList());
        for (int i = 0; i < this.f24489c.getMusicSongsList().size(); i++) {
            this.m.put(Integer.valueOf(i), true);
        }
    }

    private void r() {
        int i = 0;
        if (this.n.size() == 0) {
            this.n.addAll(this.f24489c.getMusicSongsList().subList(0, 500));
            while (i < 500) {
                this.m.put(Integer.valueOf(i), true);
                i++;
            }
            return;
        }
        ArrayList<MusicSong> musicSongsList = this.f24489c.getMusicSongsList();
        while (i < musicSongsList.size() && this.n.size() < 500) {
            if (!this.n.contains(musicSongsList.get(i))) {
                this.n.add(musicSongsList.get(i));
                this.m.put(Integer.valueOf(i), true);
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        LogUtil.a("MusicSongsActivity", "deleteAllMenuInfo enter");
        try {
            OperationStruct operationStruct = new OperationStruct();
            operationStruct.setOperationType(1);
            operationStruct.setFolderIndex(Integer.parseInt(this.f24489c.getMenuIndex()));
            lzl.a(this.f24488b).c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.13
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("MusicSongsActivity", "receive deleteAllMenuInfo rsp");
                    if (i == 100000) {
                        Intent intent = new Intent();
                        lzu.c().a(MusicSongsActivity.this.f24489c);
                        MusicSongsActivity.this.setResult(3, intent);
                        MusicSongsActivity.this.finish();
                        return;
                    }
                    LogUtil.a("MusicSongsActivity", "deleteAllMenuInfo failed, errCode:", Integer.valueOf(i));
                    MusicSongsActivity.this.finish();
                }
            });
        } catch (NumberFormatException e) {
            LogUtil.a("MusicSongsActivity", "deleteAllMenuInfo failed, exception:", e);
            finish();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        LogUtil.a("MusicSongsActivity", "deleteSongFromMenu enter");
        this.p.setVisibility(0);
        ArrayList arrayList = new ArrayList(16);
        try {
            Iterator<MusicSong> it = this.n.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt(it.next().getSongIndex())));
            }
            OperationStruct operationStruct = new OperationStruct();
            operationStruct.setOperationType(4);
            operationStruct.setFolderIndex(Integer.parseInt(this.f24489c.getMenuIndex()));
            operationStruct.setMusicIndexs(arrayList);
            lzl.a(this.f24488b).c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("MusicSongsActivity", "receive deleteSongFromMenu rsp");
                    if (i == 100000) {
                        MusicSongsActivity.this.k = false;
                        MusicSongsActivity.this.o = false;
                        if (MusicSongsActivity.this.f24489c != null) {
                            MusicSongsActivity.this.f24489c.removeRealMusicCount(MusicSongsActivity.this.n);
                        }
                        LogUtil.a("MusicSongsActivity", "deleteSongFromMenu succeed!");
                    } else {
                        LogUtil.a("MusicSongsActivity", "deleteSongFromMenu failed, errCode:", Integer.valueOf(i));
                    }
                    Message messageObtainMessage = MusicSongsActivity.this.g.obtainMessage();
                    messageObtainMessage.what = 1000;
                    MusicSongsActivity.this.g.sendMessage(messageObtainMessage);
                }
            });
            return true;
        } catch (NumberFormatException e) {
            LogUtil.a("MusicSongsActivity", "delete music in folder failed, exception:", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(final int i) {
        String menuIndex;
        LogUtil.a("MusicSongsActivity", "deleteSongFromMenuByUser enter time:");
        try {
            ArrayList arrayList = new ArrayList(16);
            final ArrayList<MusicSong> arrayList2 = new ArrayList<>(16);
            MusicMenu musicMenu = this.f24489c;
            if (musicMenu == null) {
                menuIndex = "0";
            } else {
                arrayList2 = musicMenu.getMusicSongsList();
                menuIndex = this.f24489c.getMenuIndex();
            }
            if (!njy.b(arrayList2) || arrayList2.size() <= i) {
                return true;
            }
            arrayList.add(Integer.valueOf(Integer.parseInt(arrayList2.get(i).getSongIndex())));
            OperationStruct operationStruct = new OperationStruct();
            operationStruct.setOperationType(4);
            operationStruct.setFolderIndex(lsk.a(menuIndex, 10));
            operationStruct.setMusicIndexs(arrayList);
            lzl.a(this.f24488b).c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.MusicSongsActivity.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.a("MusicSongsActivity", "receive deleteSongFromMenuByUser rsp");
                    if (i2 == 100000) {
                        arrayList2.remove(i);
                        MusicSongsActivity.this.f24489c.setMenuMusicCount(MusicSongsActivity.this.f24489c.getMenuMusicCount() - 1);
                        Message messageObtainMessage = MusicSongsActivity.this.g.obtainMessage();
                        messageObtainMessage.what = 1001;
                        MusicSongsActivity.this.g.sendMessage(messageObtainMessage);
                        LogUtil.a("MusicSongsActivity", "delete music in folder succeed!");
                        return;
                    }
                    LogUtil.a("MusicSongsActivity", "delete music in folder failed,errCode:", Integer.valueOf(i2));
                }
            });
            return true;
        } catch (NumberFormatException e) {
            LogUtil.a("MusicSongsActivity", "delete music in folder failed, exception:", e);
            return false;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        t();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            if (keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0) {
                return true;
            }
            if (this.o) {
                a(false);
                this.o = false;
                return true;
            }
            k();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("MusicSongsActivity", "onActivityResult enter, req:", Integer.valueOf(i), "result:", Integer.valueOf(i2));
        if (intent == null) {
            LogUtil.a("MusicSongsActivity", "return data is null");
            return;
        }
        if (i != 1) {
            return;
        }
        MusicMenu musicMenuD = lzu.c().d();
        if (musicMenuD == null) {
            LogUtil.a("MusicSongsActivity", "get menu is null");
            return;
        }
        MusicMenu musicMenu = this.f24489c;
        if (musicMenu != null) {
            musicMenu.addRealMusicCount(musicMenuD.getMusicSongsList());
            b bVar = this.s;
            bVar.c(bVar.e(), -1);
            this.s.notifyDataSetChanged();
        }
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Intent intent = new Intent();
        lzu.c().a(this.f24489c);
        setResult(1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<MusicSong> list) {
        this.v.setIconTitle(1, getResources().getString(R.string.IDS_contact_delete_select_all));
        if (njy.e(list)) {
            LogUtil.a("MusicSongsActivity", "musicSongList is empty");
        } else {
            if (!lzu.c().h() || list.size() <= 500) {
                return;
            }
            this.v.setIconTitle(1, getResources().getString(R.string.IDS_hw_music_select_five_hundred));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
