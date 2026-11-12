package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.protobuf.CourseStateProto;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes9.dex */
public class ifv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37578c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f37577b = new BroadcastReceiver() { // from class: ifv.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("Suggestion_VolumeUtil", "registerSystemVolumeReceiver intent is null");
                return;
            }
            if (Constants.VOLUME_CHANGED_ACTION.equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", 3);
                LogUtil.a("Suggestion_VolumeUtil", "registerSystemVolumeReceiver volume change streamType = ", Integer.valueOf(intExtra));
                if (intExtra != 3) {
                    return;
                }
                if (ifv.this.f37578c) {
                    ifv.this.f37578c = false;
                    return;
                }
                AudioManager audioManager = (AudioManager) BaseApplication.getContext().getSystemService("audio");
                if (audioManager == null) {
                    LogUtil.e("Suggestion_VolumeUtil", "AudioManager is null");
                    return;
                }
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", audioManager.getStreamVolume(3));
                int intExtra3 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", audioManager.getStreamVolume(3));
                LogUtil.a("Suggestion_VolumeUtil", "volume change cutValue = ", Integer.valueOf(intExtra2), " oldValue = ", Integer.valueOf(intExtra3));
                CourseStateProto.CourseState.Builder builderNewBuilder = CourseStateProto.CourseState.newBuilder();
                builderNewBuilder.setCurrentVolume((int) ((((double) intExtra2) * 100.0d) / ((double) audioManager.getStreamMaxVolume(3))));
                if (intExtra2 == intExtra3) {
                    LogUtil.e("Suggestion_VolumeUtil", "volume is not change!");
                } else {
                    CoachController.c().e(CoachController.StatusSource.APP, builderNewBuilder);
                }
            }
        }
    };

    public void a(int i) {
        AudioManager audioManager;
        if (i >= 0 && (audioManager = (AudioManager) BaseApplication.getContext().getSystemService("audio")) != null) {
            audioManager.setStreamVolume(3, (int) ((((double) i) / 100.0d) * ((double) audioManager.getStreamMaxVolume(3))), 4);
            this.f37578c = true;
        }
    }

    public boolean a() {
        return this.f37578c;
    }

    public void e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.VOLUME_CHANGED_ACTION);
        BaseApplication.getContext().registerReceiver(this.f37577b, intentFilter);
    }

    public void c() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.f37577b);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("Suggestion_VolumeUtil", "unregister broadcast volume IllegalArgumentException.");
        }
    }
}
