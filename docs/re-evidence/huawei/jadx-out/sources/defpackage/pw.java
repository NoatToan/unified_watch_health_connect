package defpackage;

import android.os.DynamicEffect;
import android.os.HapticPlayer;
import com.apprichtap.haptic.player.IHapticEffectPerformer;

/* JADX INFO: loaded from: classes4.dex */
public class pw implements IHapticEffectPerformer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    HapticPlayer f45907b;

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void updateParameter(int i, int i2) {
        HapticPlayer hapticPlayer = this.f45907b;
        if (hapticPlayer == null) {
            po.e.a(IHapticEffectPerformer.TAG, "updateParameter, HapticsPlayer is null");
            return;
        }
        int i3 = (int) ((i / 100.0f) * 255.0f);
        try {
            hapticPlayer.updateParameter(0, i3, i2);
        } catch (Throwable th) {
            po.e.a(IHapticEffectPerformer.TAG, "no method HapticPlayer.updateParameter(interval, amplitude, freq), in sendLoopParameter(int amplitude, int interval, int freq)");
            th.printStackTrace();
            try {
                this.f45907b.updateAmplitude(i3);
            } catch (Throwable th2) {
                po.e.a(IHapticEffectPerformer.TAG, "no updateAmplitude(amplitude) method");
                th2.printStackTrace();
            }
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void stop() {
        try {
            HapticPlayer hapticPlayer = this.f45907b;
            if (hapticPlayer == null) {
                po.e.a(IHapticEffectPerformer.TAG, "stop(), HapticsPlayer is null");
            } else {
                hapticPlayer.stop();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void start(String str) {
        try {
            HapticPlayer hapticPlayer = new HapticPlayer(DynamicEffect.create(pm.e(str, true)));
            this.f45907b = hapticPlayer;
            try {
                hapticPlayer.start(1, 0, 255);
            } catch (NoSuchMethodError unused) {
                po.e.e(IHapticEffectPerformer.TAG, "no method HapticPlayer.start(loop, interval, amplitude), in TIMED_VIBRATION");
                this.f45907b.start(1);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
