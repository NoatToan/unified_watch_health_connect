package defpackage;

import android.content.Context;
import android.os.HapticPlayer;
import android.os.Vibrator;
import com.apprichtap.haptic.player.IHapticEffectPerformer;
import com.apprichtap.haptic.player.IHapticPlayer;
import com.apprichtap.haptic.player.PlayerEventCallback;
import com.apprichtap.haptic.player.d;
import com.apprichtap.haptic.sync.SyncCallback;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class oz implements IHapticPlayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f44999a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f45000c;
    private Vibrator d;
    private IHapticPlayer e;

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void updateHapticParameter(int i, int i2, int i3) {
        po.e.d("RichTapPlayer", "updateHapticParameter amplitude,freq,interval:" + i + "," + i2 + "," + i3);
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
            return;
        }
        try {
            iHapticPlayer.updateHapticParameter(i, i2, i3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void unregisterPlayerEventCallback() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.unregisterPlayerEventCallback();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void stop() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.stop();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void start() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.start();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setSwitching(boolean z) {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.setSwitching(z);
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setSpeed(float f) {
        String str;
        if (3.0f < f || 0.5f > f) {
            po.e.a("RichTapPlayer", "invalid speed multiple!");
        }
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            str = "null == mPlayer!";
        } else {
            try {
                iHapticPlayer.setSpeed(f);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                str = "fail to setSpeed";
            }
        }
        po.e.a("RichTapPlayer", str);
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setLooping(boolean z) {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.setLooping(z);
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setDataSource(String str, int i, int i2, SyncCallback syncCallback) {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.setDataSource(str, i, i2, syncCallback);
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setDataSource(String str, int i, int i2, int i3, int i4, SyncCallback syncCallback) {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.setDataSource(str, i, i2, i3, i4, syncCallback);
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setDataSource(File file, int i, int i2, SyncCallback syncCallback) {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.setDataSource(file, i, i2, syncCallback);
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void seekTo(int i) {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.seekTo(i);
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void reset() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.reset();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void release() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer != null) {
            iHapticPlayer.release();
        }
        this.e = null;
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void registerPlayerEventCallback(PlayerEventCallback playerEventCallback) {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.registerPlayerEventCallback(playerEventCallback);
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void prepare() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.prepare();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void pause() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer == null) {
            po.e.a("RichTapPlayer", "null == mPlayer!");
        } else {
            iHapticPlayer.pause();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public boolean isPlaying() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer != null) {
            return iHapticPlayer.isPlaying();
        }
        po.e.a("RichTapPlayer", "null == mPlayer!");
        return false;
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public boolean getSwitching() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer != null) {
            return iHapticPlayer.getSwitching();
        }
        return false;
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public float getSpeed() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer != null) {
            return iHapticPlayer.getSpeed();
        }
        return 1.0f;
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public int getDuration() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer != null) {
            return iHapticPlayer.getDuration();
        }
        po.e.a("RichTapPlayer", "null == mPlayer!");
        return 0;
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public int getCurrentPosition() {
        IHapticPlayer iHapticPlayer = this.e;
        if (iHapticPlayer != null) {
            return iHapticPlayer.getCurrentPosition();
        }
        po.e.a("RichTapPlayer", "null == mPlayer!");
        return 0;
    }

    public static boolean c(int i) {
        if (i == 0) {
            return true;
        }
        try {
            if (i == 1) {
                return HapticPlayer.isAvailable();
            }
            if (i != 2) {
                return false;
            }
            return d.e();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static int c(Context context) {
        try {
            if (context != null) {
                return new d(context).getRichTapCoreMajorVersion();
            }
            po.e.a("RichTapPlayer", "getRichTapCoreMajorVersion, null == context");
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static oz b(Context context, int i) {
        if (context == null) {
            po.e.a("RichTapPlayer", "context == null");
            return null;
        }
        if (c(i)) {
            return new oz(context, i);
        }
        po.e.a("RichTapPlayer", "specified player type not available!");
        return null;
    }

    private oz(IHapticEffectPerformer iHapticEffectPerformer) {
        this.e = IHapticPlayer.create(iHapticEffectPerformer);
    }

    private oz(Context context, int i) {
        oz ozVar;
        this.f45000c = context.getApplicationContext();
        this.d = (Vibrator) context.getSystemService("vibrator");
        d dVar = new d(this.f45000c);
        this.f44999a = dVar;
        if (i != 0) {
            if (i == 1) {
                ozVar = new oz(new pw());
            } else if (i != 2) {
                po.e.e("RichTapPlayer", "unknown player type:" + i);
            } else {
                this.e = new oz(dVar);
            }
            po.f45736a = this.f45000c;
        }
        ozVar = new oz(new pp(this.d));
        this.e = ozVar;
        po.f45736a = this.f45000c;
    }
}
