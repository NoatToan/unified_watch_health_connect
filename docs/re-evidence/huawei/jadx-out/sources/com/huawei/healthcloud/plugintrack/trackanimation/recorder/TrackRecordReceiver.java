package com.huawei.healthcloud.plugintrack.trackanimation.recorder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class TrackRecordReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntentFilter f10659b;
    private TrackRecordListener d;
    private Context e;

    public interface TrackRecordListener {
        void onRecordFinish(long j, boolean z);

        void onRecordStart();
    }

    public TrackRecordReceiver(Context context) {
        this.e = context;
    }

    public void b(Context context, TrackRecordListener trackRecordListener) {
        this.d = trackRecordListener;
        IntentFilter intentFilter = new IntentFilter();
        this.f10659b = intentFilter;
        intentFilter.addAction("sta_track_record_start");
        this.f10659b.addAction("sta_track_record_finish");
        LocalBroadcastManager.getInstance().unregisterReceiver(this);
        LocalBroadcastManager.getInstance().registerReceiver(this, this.f10659b);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            ReleaseLogUtil.a("Suggestion_TrackRecordReceiver", "onReceive: intent is null");
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ReleaseLogUtil.a("Suggestion_TrackRecordReceiver", "onReceive: action is empty");
            return;
        }
        if (this.d == null) {
            ReleaseLogUtil.a("Suggestion_TrackRecordReceiver", "onReceive: listener is null");
            return;
        }
        ReleaseLogUtil.d("Suggestion_TrackRecordReceiver", "onReceive: action is ", action);
        action.hashCode();
        if (action.equals("sta_track_record_finish")) {
            this.d.onRecordFinish(intent.getLongExtra("data_key_video_duration", 0L), intent.getBooleanExtra("data_key_video_record_error", false));
        } else if (action.equals("sta_track_record_start")) {
            this.d.onRecordStart();
        }
    }

    public void e() {
        LocalBroadcastManager.getInstance().unregisterReceiver(this);
        this.e = null;
    }

    public void d() {
        if (this.e != null) {
            LocalBroadcastManager.getInstance().sendBroadcast(new Intent("ats_track_record_stop"));
        }
    }

    public void a() {
        if (this.e != null) {
            LocalBroadcastManager.getInstance().sendBroadcast(new Intent("ats_track_record_stop_when_pause"));
        }
    }
}
