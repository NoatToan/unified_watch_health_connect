package defpackage;

import android.os.VibrationEffect;
import android.os.Vibrator;
import com.apprichtap.haptic.player.IHapticEffectPerformer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class pp implements IHapticEffectPerformer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Vibrator f45754c;

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void stop() {
        Vibrator vibrator = this.f45754c;
        if (vibrator == null) {
            po.e.a("GooglePerformer", "stop(), null == mVibrator!");
        } else {
            vibrator.cancel();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void start(String str) {
        try {
            String strE = pm.e(str, true);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            pm.d(strE, arrayList, arrayList2);
            if (arrayList.size() != 0 && arrayList.size() == arrayList2.size()) {
                po.e.d("GooglePerformer", "timings:" + arrayList.toString() + ",amplitudes:" + arrayList2.toString());
                long[] jArr = new long[arrayList.size()];
                int[] iArr = new int[arrayList2.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    jArr[i] = ((Long) arrayList.get(i)).longValue();
                    iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                }
                this.f45754c.vibrate(VibrationEffect.createWaveform(jArr, iArr, -1));
                return;
            }
            po.e.a("GooglePerformer", "start(String), invalid timings and amplitudes!");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public pp(Vibrator vibrator) {
        if (vibrator == null) {
            po.e.a("GooglePerformer", "GooglePerformer(Vibrator), vibrator == null");
        } else {
            this.f45754c = vibrator;
        }
    }
}
