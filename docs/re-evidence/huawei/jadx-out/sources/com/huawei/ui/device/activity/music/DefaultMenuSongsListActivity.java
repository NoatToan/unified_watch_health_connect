package com.huawei.ui.device.activity.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicMenu;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.OperationStruct;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import defpackage.lzl;
import defpackage.lzq;
import defpackage.lzu;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.rga;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DefaultMenuSongsListActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DefaultMenuSongsListActivity f24417a;
    private e e;
    private ListView g;
    private HealthProgressBar i;
    private LinearLayout j;
    private CustomTitleBar n;
    private a h = new a(this);
    private MusicMenu d = new MusicMenu();
    private MusicMenu o = new MusicMenu();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MusicMenu f24418b = new MusicMenu();
    private int f = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f24419c = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.music.DefaultMenuSongsListActivity.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("DefaultMenuSongsListActivity", "mConnectStateChangedReceiver intent is null.");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("DefaultMenuSongsListActivity", "mConnectStateChangedReceiver intent:", action);
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                if (deviceInfo == null) {
                    LogUtil.j("DefaultMenuSongsListActivity", "mConnectStateChangedReceiver deviceInfo is null.");
                    return;
                }
                if (!lzq.d(deviceInfo)) {
                    LogUtil.j("DefaultMenuSongsListActivity", "This device does not have the correspond capability.");
                    return;
                }
                DefaultMenuSongsListActivity.this.f = deviceInfo.getDeviceConnectState();
                int i = DefaultMenuSongsListActivity.this.f;
                if (i == 1) {
                    LogUtil.a("DefaultMenuSongsListActivity", "current device connecting.");
                    return;
                }
                if (i == 2) {
                    LogUtil.a("DefaultMenuSongsListActivity", "current device connected.");
                } else if (i != 3) {
                    LogUtil.j("DefaultMenuSongsListActivity", "current device state is unknown.");
                } else {
                    LogUtil.a("DefaultMenuSongsListActivity", "current device disconnected.");
                }
            }
        }
    };

    private void c() {
        LogUtil.a("DefaultMenuSongsListActivity", "register connect state broadcast.");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.f24417a, this.f24419c, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void j() {
        LogUtil.a("DefaultMenuSongsListActivity", "unregister connect state broadcast.");
        try {
            unregisterReceiver(this.f24419c);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DefaultMenuSongsListActivity", "unregister connect state broadcast occur IllegalArgumentException.");
        }
    }

    class e extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean[] f24423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f24424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LayoutInflater f24425c;
        private List<MusicSong> e;
        private View j;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            ImageView f24428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            ImageView f24429b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            HealthTextView f24430c;
            HealthTextView d;
            HealthCheckBox e;

            d() {
            }
        }

        e(List<MusicSong> list) {
            this.f24425c = LayoutInflater.from(DefaultMenuSongsListActivity.this.f24417a);
            this.e = list;
            if (list != null) {
                this.f24423a = new boolean[list.size()];
            }
        }

        public int e() {
            List<MusicSong> list = this.e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<MusicSong> list = this.e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public MusicSong getItem(int i) {
            if (i < 0 || i > this.e.size() - 1) {
                return null;
            }
            return this.e.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                this.j = this.f24425c.inflate(R.layout.activity_music_song_list_item, (ViewGroup) null);
                d dVar = new d();
                this.f24424b = dVar;
                dVar.d = (HealthTextView) this.j.findViewById(R.id.music_song_name_tv);
                this.f24424b.f24430c = (HealthTextView) this.j.findViewById(R.id.music_song_singer_tv);
                this.f24424b.e = (HealthCheckBox) this.j.findViewById(R.id.cb_more_or_select);
                this.f24424b.f24428a = (ImageView) this.j.findViewById(R.id.imageview_more_or_select);
                this.f24424b.f24429b = (ImageView) this.j.findViewById(R.id.under_line);
                this.j.setTag(this.f24424b);
            } else {
                this.j = view;
                Object tag = view.getTag();
                if (tag instanceof d) {
                    this.f24424b = (d) tag;
                }
            }
            MusicSong item = getItem(i);
            if (item != null) {
                this.f24424b.d.setText(item.getSongName());
                this.f24424b.f24430c.setText(rga.a(DefaultMenuSongsListActivity.this.f24417a, item));
            }
            this.f24424b.e.setVisibility(0);
            this.f24424b.f24428a.setVisibility(8);
            if (this.e.size() - 1 == i || CommonUtil.at()) {
                this.f24424b.f24429b.setVisibility(8);
            } else {
                this.f24424b.f24429b.setVisibility(0);
            }
            this.f24424b.e.setFocusable(false);
            this.f24424b.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.music.DefaultMenuSongsListActivity.e.1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    int i2;
                    if (e.this.f24423a == null || (i2 = i) < 0 || i2 >= e.this.f24423a.length) {
                        return;
                    }
                    e.this.f24423a[i] = z;
                }
            });
            boolean[] zArr = this.f24423a;
            if (zArr != null && i >= 0 && i < zArr.length) {
                this.f24424b.e.setChecked(this.f24423a[i]);
            }
            return this.j;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_default_menu_songs_list);
        this.f24417a = this;
        if (getIntent() != null) {
            MusicMenu musicMenuB = lzu.c().b();
            if (musicMenuB != null) {
                this.f24418b = musicMenuB;
            }
            MusicMenu musicMenuD = lzu.c().d();
            if (musicMenuD != null) {
                this.d = musicMenuD;
            }
        }
        c();
        a();
        e();
    }

    private void a() {
        b();
        this.g = (ListView) findViewById(R.id.default_menu_songs_listview);
        this.j = (LinearLayout) findViewById(R.id.load_ll);
        this.i = (HealthProgressBar) findViewById(R.id.load_progressbar);
        HealthProgressBar healthProgressBar = (HealthProgressBar) findViewById(R.id.load_progressbar);
        this.i = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
    }

    private void e() {
        e eVar = new e(this.f24418b.getMusicSongsList());
        this.e = eVar;
        this.g.setAdapter((ListAdapter) eVar);
        this.g.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.device.activity.music.DefaultMenuSongsListActivity.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object tag = view.getTag();
                if (tag instanceof e.d) {
                    e.d dVar = (e.d) tag;
                    if (DefaultMenuSongsListActivity.this.e.f24423a == null || i < 0 || i >= DefaultMenuSongsListActivity.this.e.f24423a.length) {
                        return;
                    }
                    if (DefaultMenuSongsListActivity.this.e.f24423a[i]) {
                        DefaultMenuSongsListActivity.this.e.f24423a[i] = false;
                        dVar.e.setChecked(false);
                    } else {
                        DefaultMenuSongsListActivity.this.e.f24423a[i] = true;
                        dVar.e.setChecked(true);
                    }
                }
            }
        });
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.default_menu_songs_titlebar);
        this.n = customTitleBar;
        customTitleBar.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_public_ok), qre.f(R.string.IDS_contact_confirm));
        this.n.setRightTextButtonClickable(true);
        this.n.setRightTextButtonVisibility(0);
        this.n.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.DefaultMenuSongsListActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DefaultMenuSongsListActivity.this.finish();
            }
        });
        this.n.setRightTextButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.DefaultMenuSongsListActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DefaultMenuSongsListActivity.this.f == 2) {
                    if (!qrs.r()) {
                        DefaultMenuSongsListActivity.this.j.setVisibility(0);
                        LogUtil.a("DefaultMenuSongsListActivity", "initTitleBarView UPDATE_UI_MENU_VISIBLE");
                        DefaultMenuSongsListActivity.this.d();
                        return;
                    }
                    LogUtil.a("DefaultMenuSongsListActivity", "click to fast!");
                    return;
                }
                qpx.e(DefaultMenuSongsListActivity.this.f24417a, DefaultMenuSongsListActivity.this.getResources().getString(R.string.IDS_hw_health_music_check_bluetooth_connection));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.o = new MusicMenu();
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < this.e.e(); i++) {
            try {
                if (this.e.f24423a[i]) {
                    MusicSong musicSong = (MusicSong) this.e.e.get(i);
                    this.o.getMusicSongsList().add(musicSong);
                    arrayList.add(Integer.valueOf(Integer.parseInt(musicSong.getSongIndex())));
                }
            } catch (NumberFormatException unused) {
                LogUtil.a("DefaultMenuSongsListActivity", "get mCurrentMenu's index is null");
                finish();
                return;
            }
        }
        OperationStruct operationStruct = new OperationStruct();
        operationStruct.setOperationType(3);
        operationStruct.setFolderIndex(Integer.parseInt(this.d.getMenuIndex()));
        operationStruct.setMusicIndexs(arrayList);
        lzl.a(this.f24417a).c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.music.DefaultMenuSongsListActivity.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 != 100000) {
                    LogUtil.a("DefaultMenuSongsListActivity", "add music:", " errCode:", Integer.valueOf(i2));
                    DefaultMenuSongsListActivity.this.finish();
                } else {
                    Intent intent = new Intent();
                    lzu.c().a(DefaultMenuSongsListActivity.this.o);
                    DefaultMenuSongsListActivity.this.setResult(1, intent);
                    DefaultMenuSongsListActivity.this.finish();
                }
                Message messageObtainMessage = DefaultMenuSongsListActivity.this.h.obtainMessage();
                messageObtainMessage.what = 1000;
                DefaultMenuSongsListActivity.this.h.sendMessage(messageObtainMessage);
                LogUtil.a("DefaultMenuSongsListActivity", "notifyMenuActivityRefreshData UPDATE_UI_MENU_GONE");
            }
        });
    }

    static class a extends BaseHandler<DefaultMenuSongsListActivity> {
        a(DefaultMenuSongsListActivity defaultMenuSongsListActivity) {
            super(defaultMenuSongsListActivity);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(DefaultMenuSongsListActivity defaultMenuSongsListActivity, Message message) {
            if (message.what == 1000) {
                defaultMenuSongsListActivity.j.setVisibility(8);
            } else {
                LogUtil.a("DefaultMenuSongsListActivity", "handleMessageWhenReferenceNotNull switch default ");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
