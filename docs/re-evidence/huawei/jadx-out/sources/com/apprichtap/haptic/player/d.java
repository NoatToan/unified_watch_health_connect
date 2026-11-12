package com.apprichtap.haptic.player;

import android.content.Context;
import android.os.Process;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.core.internal.view.SupportMenu;
import defpackage.pm;
import defpackage.po;
import defpackage.pr;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class d implements IHapticEffectPerformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3905a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f3906c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Vibrator f3907b;
    private Class<?> d;
    private Context e;
    private boolean f;
    private String j;
    private AtomicInteger h = new AtomicInteger();
    private int g = 255;

    /* JADX INFO: loaded from: classes21.dex */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f3908a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f3909b = 256;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f3910c = 513;
        public static final int d = 514;
        public static final int e = 769;
        public static final int f = 1;
        public static final int g = 2;
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void updateParameter(int i, int i2) {
        if (32 > f3905a) {
            po.e.e("RichTapPerformer", "not support updateHapticParam(), core version:" + f3905a);
            return;
        }
        String str = this.j;
        int[] iArrA = str != null ? pr.a(str) : null;
        if (iArrA == null || 2 != iArrA.length) {
            po.e.a("RichTapPerformer", "updateHapticParams, invalid sender, do nothing!");
            return;
        }
        po.e.d("RichTapPerformer", "updateHapticParams, sender pid:" + iArrA[0] + ",gid:" + (iArrA[1] & SupportMenu.CATEGORY_MASK) + ",intensity:" + i + ",freq:" + i2);
        int[] iArr = {256, 0, 0, 513, i, a.d, i2};
        System.arraycopy(iArrA, 0, iArr, 1, 2);
        c(iArr, 7);
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void swapVibrationIndex(boolean z) {
        po.e.b("RichTapPerformer", "swapVibrationIndex:" + z);
        this.f = z;
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public boolean supportRealtimeAdjustment() {
        return 32 <= f3905a;
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void stop() {
        po.e.d("RichTapPerformer", "stop()");
        d(0, 0, 0);
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void start(String str) {
        String strE;
        int i;
        int iMyPid;
        int iIncrementAndGet;
        String str2 = this.j;
        int[] iArrA = str2 != null ? pr.a(str2) : null;
        int i2 = f3905a;
        if (i2 <= 0) {
            po.e.a("RichTapPerformer", "start(), mRichTapCoreMajorVersion:" + f3905a);
            return;
        }
        if (23 >= i2) {
            strE = pm.e(str, true);
            i = 1;
        } else {
            if (32 <= i2 && iArrA != null) {
                int length = iArrA.length;
            }
            strE = str;
            i = 2;
        }
        if (iArrA == null || 2 != iArrA.length) {
            iMyPid = Process.myPid();
            iIncrementAndGet = this.h.incrementAndGet() % Integer.MAX_VALUE;
        } else {
            int i3 = iArrA[0];
            iIncrementAndGet = iArrA[1];
            iMyPid = i3;
        }
        int[] iArrD = pm.d(strE, i, f3905a, f3906c, iMyPid, iIncrementAndGet, this.f);
        try {
            po.e.d("RichTapPerformer", "start() mGain:" + this.g + " raw data:" + Arrays.toString(iArrD));
            Class<?> cls = this.d;
            Class<?> cls2 = Integer.TYPE;
            this.f3907b.vibrate((VibrationEffect) cls.getMethod("createPatternHeWithParam", int[].class, cls2, cls2, cls2, cls2).invoke(null, iArrD, 1, 0, Integer.valueOf(this.g), 0));
        } catch (Throwable th) {
            po.e.e("RichTapPerformer", "The system doesn't integrate richTap software");
            th.printStackTrace();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void setSenderIdKey(String str) {
        po.e.d("RichTapPerformer", "setSenderIdKey:" + str);
        this.j = str;
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public void setGain(int i) {
        if (this.e == null) {
            po.e.e("RichTapPerformer", "set gain null == mContext");
            return;
        }
        if (i == 0) {
            po.e.d("RichTapPerformer", "0 == gain");
            i = 1;
        }
        d(0, i, 0);
        this.g = i;
    }

    @Override // com.apprichtap.haptic.player.IHapticEffectPerformer
    public int getRichTapCoreMajorVersion() {
        return f3905a;
    }

    private void c() {
        try {
            if (this.e != null && this.f3907b != null) {
                int iIntValue = ((Integer) this.d.getMethod("checkIfRichTapSupport", new Class[0]).invoke(null, new Object[0])).intValue();
                po.e.d("RichTapPerformer", "getRichTapCoreMajorVersion check framework RichTap version:" + iIntValue);
                if (1 == iIntValue) {
                    return;
                }
                StringBuilder sb = new StringBuilder("clientCode:");
                sb.append((16711680 & iIntValue) >> 16);
                sb.append(" majorVersion:");
                int i = (65280 & iIntValue) >> 8;
                sb.append(i);
                sb.append(" minorVersion:");
                int i2 = iIntValue & 255;
                sb.append(i2);
                po.e.d("RichTapPerformer", sb.toString());
                f3905a = i;
                f3906c = i2;
                return;
            }
            po.e.a("RichTapPerformer", "getRichTapCoreMajorVersion mContext or mVibrator null");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean e() {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("richtap.os.PhonyVibrationEffect");
            } catch (ClassNotFoundException unused) {
                po.e.b("RichTapPerformer", "failed to reflect class: \"richtap.os.PhonyVibrationEffect\"!");
                cls = null;
            }
            if (cls == null) {
                try {
                    cls = Class.forName("android.os.RichTapVibrationEffect");
                } catch (ClassNotFoundException unused2) {
                    po.e.b("RichTapPerformer", "failed to reflect class: \"android.os.RichTapVibrationEffect\"!");
                    cls = null;
                }
            }
            if (cls == null) {
                try {
                    cls = Class.forName("android.os.VibrationEffect");
                } catch (ClassNotFoundException unused3) {
                    po.e.b("RichTapPerformer", "failed to reflect class: \"android.os.VibrationEffect\"!");
                }
            }
            return 2 != ((Integer) cls.getMethod("checkIfRichTapSupport", new Class[0]).invoke(null, new Object[0])).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private void c(int[] iArr, int i) {
        if (f3905a <= 0) {
            po.e.a("RichTapPerformer", "applyPreBakedEffect, CORE_MAJOR_VERSION:" + f3905a);
        } else {
            try {
                this.f3907b.vibrate((VibrationEffect) this.d.getMethod("createHapticParameter", int[].class, Integer.TYPE).invoke(null, iArr, Integer.valueOf(i)));
            } catch (Throwable th) {
                th.printStackTrace();
                po.e.e("RichTapPerformer", "The system doesn't integrate RichTap software");
            }
        }
    }

    private void d(int i, int i2, int i3) {
        if (f3905a <= 0) {
            po.e.a("RichTapPerformer", "applyPatternHeParam, CORE_MAJOR_VERSION:" + f3905a);
            return;
        }
        try {
            po.e.b("RichTapPerformer", "applyPatternHeParam, interval:" + i + ", amplitude:" + i2 + ",freq:" + i3);
            Class<?> cls = this.d;
            Class cls2 = Integer.TYPE;
            this.f3907b.vibrate((VibrationEffect) cls.getMethod("createPatternHeParameter", cls2, cls2, cls2).invoke(null, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        } catch (Throwable th) {
            th.printStackTrace();
            po.e.e("RichTapPerformer", "The system doesn't integrate RichTap software");
        }
    }

    public d(Context context) {
        this.e = context;
        this.f3907b = (Vibrator) context.getSystemService("vibrator");
        try {
            this.d = Class.forName("richtap.os.PhonyVibrationEffect");
        } catch (ClassNotFoundException unused) {
            this.d = null;
            po.e.b("RichTapPerformer", "failed to reflect class: \"richtap.os.PhonyVibrationEffect\"!");
        }
        if (this.d == null) {
            try {
                this.d = Class.forName("android.os.RichTapVibrationEffect");
            } catch (ClassNotFoundException unused2) {
                this.d = null;
                po.e.b("RichTapPerformer", "failed to reflect class: \"android.os.RichTapVibrationEffect\"!");
            }
        }
        if (this.d == null) {
            try {
                this.d = Class.forName("android.os.VibrationEffect");
            } catch (ClassNotFoundException unused3) {
                po.e.b("RichTapPerformer", "failed to reflect class: \"android.os.VibrationEffect\"!");
            }
        }
        c();
    }
}
