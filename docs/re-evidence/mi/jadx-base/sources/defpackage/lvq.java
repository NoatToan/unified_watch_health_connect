package defpackage;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class lvq extends uzd {

    public static class a extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    public static class b extends lvq {
        public float[] h = new float[1];
        public ConstraintAttribute i;

        @Override // defpackage.uzd
        public void c(Object obj) {
            this.i = (ConstraintAttribute) obj;
        }

        @Override // defpackage.lvq
        public void j(View view, float f) {
            this.h[0] = a(f);
            ke5.b(this.i, view, this.h);
        }
    }

    public static class c extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
            view.setElevation(a(f));
        }
    }

    public static class d extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
        }

        public void k(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    public static class e extends lvq {
        public boolean h = false;

        @Override // defpackage.lvq
        public void j(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    public static class f extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
            view.setRotation(a(f));
        }
    }

    public static class g extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    public static class h extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    public static class i extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    public static class j extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    public static class k extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    public static class l extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    public static class m extends lvq {
        @Override // defpackage.lvq
        public void j(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static lvq i(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b2 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b2 = 1;
                }
                break;
            case -1225497657:
                if (str.equals(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X)) {
                    b2 = 2;
                }
                break;
            case -1225497656:
                if (str.equals(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y)) {
                    b2 = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b2 = 4;
                }
                break;
            case -1001078227:
                if (str.equals(BroadcastsKt.SILENT_PUSHING_PROGRESS)) {
                    b2 = 5;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b2 = 6;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b2 = 7;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    b2 = 8;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b2 = 9;
                }
                break;
            case -4379043:
                if (str.equals(BizTypeConstants.ELEVATION)) {
                    b2 = 10;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b2 = 11;
                }
                break;
            case 92909918:
                if (str.equals(SleepAnalyzerAlpha.NAME_ALPHA)) {
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                }
                break;
        }
        switch (b2) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case 8:
                return new a();
            case 9:
                return new f();
            case 10:
                return new c();
            case 11:
                return new d();
            case 12:
                return new a();
            case 13:
                return new a();
            default:
                return null;
        }
    }

    public abstract void j(View view, float f2);
}
