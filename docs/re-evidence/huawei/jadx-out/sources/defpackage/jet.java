package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.trackanimation.bgm.choosedownload.MusicPrePlayService;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jet {
    private static volatile jet d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ServiceConnection f38504b = new ServiceConnection(this) { // from class: jet.4
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38505c;

    private jet() {
    }

    public static jet b() {
        if (d == null) {
            synchronized (SportMusicController.class) {
                if (d == null) {
                    d = new jet();
                }
            }
        }
        return d;
    }

    public void b(String str) {
        LogUtil.a("Track_MusicPreController", "bindService enter");
        Intent intent = new Intent();
        intent.setClass(BaseApplication.getContext(), MusicPrePlayService.class);
        intent.putExtra("dynamic_music_path", str);
        this.f38505c = BaseApplication.getContext().bindService(intent, this.f38504b, 1);
    }

    public void d() {
        if (this.f38504b == null || !this.f38505c) {
            return;
        }
        BaseApplication.getContext().unbindService(this.f38504b);
        this.f38505c = false;
    }
}
