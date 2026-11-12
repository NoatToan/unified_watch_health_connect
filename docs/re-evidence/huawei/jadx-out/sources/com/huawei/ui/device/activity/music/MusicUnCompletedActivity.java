package com.huawei.ui.device.activity.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.lzq;
import defpackage.rga;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class MusicUnCompletedActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f24516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f24517c;
    private HealthButton e;
    private LinearLayout f;
    private ListView g;
    private LinearLayout h;
    private ArrayList<MusicSong> i = new ArrayList<>(16);
    private BroadcastReceiver d = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.music.MusicUnCompletedActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("MusicUnCompletedActivity", "mConnectStateChangedReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("MusicUnCompletedActivity", "mConnectStateChangedReceiver onReceive intent: ", action);
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                try {
                    if (intent.getParcelableExtra("deviceinfo") instanceof DeviceInfo) {
                        DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                        if (deviceInfo == null) {
                            LogUtil.j("MusicUnCompletedActivity", "mConnectStateChangedReceiver onReceive currentDeviceInfo is null.");
                            return;
                        }
                        if (lzq.d(deviceInfo)) {
                            MusicUnCompletedActivity.this.f24515a = deviceInfo.getDeviceConnectState();
                            int i = MusicUnCompletedActivity.this.f24515a;
                            if (i == 1) {
                                LogUtil.a("MusicUnCompletedActivity", "DEVICE_CONNECTING");
                                return;
                            }
                            if (i == 2) {
                                LogUtil.a("MusicUnCompletedActivity", "DEVICE_CONNECTED");
                                MusicUnCompletedActivity.this.finish();
                                return;
                            } else if (i == 3) {
                                LogUtil.a("MusicUnCompletedActivity", "DEVICE_DISCONNECTED");
                                return;
                            } else {
                                LogUtil.j("MusicUnCompletedActivity", "DEVICE_CONNECT_STATUS_OTHER");
                                return;
                            }
                        }
                        LogUtil.j("MusicUnCompletedActivity", "This device does not have the correspond capability.");
                    }
                } catch (BadParcelableException e) {
                    LogUtil.e("MusicUnCompletedActivity", "BadParcelableException:", ExceptionUtils.c(e));
                } catch (ClassCastException e2) {
                    LogUtil.e("MusicUnCompletedActivity", "ClassCastException:", ExceptionUtils.c(e2));
                }
            }
        }
    };

    private void d() {
        LogUtil.a("MusicUnCompletedActivity", "Enter registerConnectStateBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this, this.d, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void a() {
        try {
            unregisterReceiver(this.d);
        } catch (IllegalArgumentException e) {
            LogUtil.a("MusicUnCompletedActivity", e.getMessage());
        }
    }

    class d extends BaseAdapter {
        private List<MusicSong> e;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        d(List<MusicSong> list) {
            this.e = new ArrayList(16);
            if (list != null) {
                this.e = list;
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.e.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i >= 0 && i < this.e.size()) {
                return this.e.get(i);
            }
            return this.e.get(0);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            c cVar = null;
            if (view == null) {
                c cVar2 = new c();
                View viewInflate = LayoutInflater.from(MusicUnCompletedActivity.this.getApplicationContext()).inflate(R.layout.un_completed_item, (ViewGroup) null);
                cVar2.f24521b = (HealthTextView) viewInflate.findViewById(R.id.music_song_name_tv);
                cVar2.f24520a = (HealthTextView) viewInflate.findViewById(R.id.music_song_singer_tv);
                cVar2.e = (ImageView) viewInflate.findViewById(R.id.under_line);
                viewInflate.setTag(cVar2);
                cVar = cVar2;
                view = viewInflate;
            } else if (view.getTag() instanceof c) {
                cVar = (c) view.getTag();
            }
            if (cVar != null && i >= 0 && i < this.e.size()) {
                cVar.f24521b.setText(this.e.get(i).getSongName());
                cVar.f24520a.setText(rga.a(MusicUnCompletedActivity.this.getApplicationContext(), this.e.get(i)));
                if (this.e.size() - 1 == i) {
                    cVar.e.setVisibility(8);
                    return view;
                }
                if (CommonUtil.at()) {
                    cVar.e.setVisibility(8);
                    return view;
                }
                cVar.e.setVisibility(0);
            }
            return view;
        }

        class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            HealthTextView f24520a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            HealthTextView f24521b;
            ImageView e;

            c() {
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_music_un_completed_layout);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.i = intent.getParcelableArrayListExtra("un_finished_song_list");
            } catch (ArrayIndexOutOfBoundsException e) {
                LogUtil.e("MusicUnCompletedActivity", "get list error:", e.getMessage());
            }
            this.f24515a = intent.getIntExtra("current_bluetooth_status", 3);
        }
        d();
        e();
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a();
    }

    private void e() {
        this.f24516b = (HealthButton) findViewById(R.id.continue_add_uncompletedsong_btn);
        if (!c()) {
            this.f24516b.setVisibility(8);
        }
        this.e = (HealthButton) findViewById(R.id.giveup_add_uncompletedsongs_btn);
        this.g = (ListView) findViewById(R.id.listview);
        this.h = (LinearLayout) findViewById(R.id.btn_horizontal_ll);
        this.f = (LinearLayout) findViewById(R.id.btn_vertical_ll);
        if (LanguageUtil.bt(this) || LanguageUtil.a(this) || LanguageUtil.ao(this)) {
            this.h.setVisibility(8);
            this.f.setVisibility(0);
        } else {
            this.h.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    private void b() {
        d dVar = new d(this.i);
        this.f24517c = dVar;
        this.g.setAdapter((ListAdapter) dVar);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicUnCompletedActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MusicUnCompletedActivity.this.setResult(1, new Intent());
                MusicUnCompletedActivity.this.finish();
            }
        });
        this.f24516b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.music.MusicUnCompletedActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MusicUnCompletedActivity.this.f24515a == 2) {
                    MusicUnCompletedActivity.this.setResult(2, new Intent());
                    MusicUnCompletedActivity.this.finish();
                } else {
                    Toast.makeText(MusicUnCompletedActivity.this.getBaseContext(), MusicUnCompletedActivity.this.getResources().getString(R.string.IDS_hw_health_music_check_bluetooth_connection), 0).show();
                }
            }
        });
    }

    private boolean c() {
        ArrayList<MusicSong> arrayList = this.i;
        boolean z = false;
        if (arrayList != null && arrayList.size() >= 1) {
            for (MusicSong musicSong : this.i) {
                if (musicSong.getSyncFailedErrorCode() != 2 && musicSong.getSyncFailedErrorCode() != 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
