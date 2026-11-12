package miuix.view;

import android.view.View;
import androidx.annotation.Keep;
import androidx.collection.SparseArrayCompat;
import defpackage.alb;
import defpackage.blb;
import defpackage.dlb;
import miui.util.HapticFeedbackUtil;

/* JADX INFO: loaded from: classes3.dex */
@Keep
class LinearVibrator implements blb {
    private static final String TAG = "LinearVibrator";
    private final SparseArrayCompat<Integer> mIds = new SparseArrayCompat<>();

    static {
        initialize();
    }

    private LinearVibrator() {
        buildIds();
    }

    private void buildIds() {
        this.mIds.append(alb.f, 268435456);
        this.mIds.append(alb.g, 268435457);
        this.mIds.append(alb.h, 268435458);
        this.mIds.append(alb.i, 268435459);
        this.mIds.append(alb.j, 268435460);
        this.mIds.append(alb.f1169k, 268435461);
        this.mIds.append(alb.l, 268435462);
        this.mIds.append(alb.m, 268435463);
        this.mIds.append(alb.n, 268435464);
        this.mIds.append(alb.o, 268435465);
        int i = PlatformConstants.VERSION;
        if (i < 2) {
            return;
        }
        this.mIds.append(alb.p, 268435466);
        this.mIds.append(alb.q, 268435467);
        this.mIds.append(alb.f1170r, 268435468);
        if (i < 3) {
            return;
        }
        this.mIds.append(alb.s, 268435469);
        if (i < 4) {
            return;
        }
        this.mIds.append(alb.t, 268435470);
        if (i < 5) {
            return;
        }
        this.mIds.append(alb.w, 268435471);
        this.mIds.append(alb.x, 268435472);
        this.mIds.append(alb.y, 268435473);
        this.mIds.append(alb.z, 268435474);
        this.mIds.append(alb.A, 268435475);
        this.mIds.append(alb.B, 268435476);
        this.mIds.append(alb.C, 268435477);
        this.mIds.append(alb.D, 268435478);
        this.mIds.append(alb.E, 268435479);
        this.mIds.append(alb.F, 268435480);
    }

    private static void initialize() {
        if (PlatformConstants.VERSION < 1) {
            return;
        }
        try {
            if (HapticFeedbackUtil.isSupportLinearMotorVibrate()) {
                HapticCompat.registerProvider(new LinearVibrator());
            }
        } catch (Throwable unused) {
        }
    }

    public int obtainFeedBack(int i) {
        int iIndexOfKey = this.mIds.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return this.mIds.valueAt(iIndexOfKey).intValue();
        }
        return -1;
    }

    @Override // defpackage.blb
    public boolean performHapticFeedback(View view, int i) {
        int iIndexOfKey = this.mIds.indexOfKey(i);
        if (iIndexOfKey < 0) {
            String.format("feedback(0x%08x-%s) is not found in current platform(v%d)", Integer.valueOf(i), alb.b(i), Integer.valueOf(PlatformConstants.VERSION));
            return false;
        }
        Integer numValueAt = this.mIds.valueAt(iIndexOfKey);
        int iIntValue = numValueAt.intValue();
        if (!HapticFeedbackUtil.isSupportLinearMotorVibrate(iIntValue)) {
            String.format("unsupported feedback: 0x%08x. platform version: %d", numValueAt, Integer.valueOf(PlatformConstants.VERSION));
            return false;
        }
        dlb.a("performHapticFeedback view: " + view + ", feedbackConstant: " + i);
        return view.performHapticFeedback(iIntValue);
    }

    public boolean supportLinearMotor(int i) {
        int iIndexOfKey = this.mIds.indexOfKey(i);
        if (iIndexOfKey < 0) {
            String.format("feedback(0x%08x-%s) is not found in current platform(v%d)", Integer.valueOf(i), alb.b(i), Integer.valueOf(PlatformConstants.VERSION));
            return false;
        }
        Integer numValueAt = this.mIds.valueAt(iIndexOfKey);
        int iIntValue = numValueAt.intValue();
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(iIntValue)) {
            return HapticFeedbackUtil.isSupportLinearMotorVibrate(iIntValue);
        }
        String.format("unsupported feedback: 0x%08x. platform version: %d", numValueAt, Integer.valueOf(PlatformConstants.VERSION));
        return false;
    }
}
