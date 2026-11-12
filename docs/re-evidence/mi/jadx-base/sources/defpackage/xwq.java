package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class xwq extends e7n {

    public static class a extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    public static class b extends xwq {
        public String f;
        public SparseArray<ConstraintAttribute> g;
        public float[] h;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f = str.split(",")[1];
            this.g = sparseArray;
        }

        @Override // defpackage.e7n
        public void c(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // defpackage.e7n
        public void e(int i) {
            int size = this.g.size();
            int iH = this.g.valueAt(0).h();
            double[] dArr = new double[size];
            this.h = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iH);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.g.keyAt(i2);
                ConstraintAttribute constraintAttributeValueAt = this.g.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.f(this.h);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.h;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.f16352a = hd5.a(i, dArr, dArr2);
        }

        @Override // defpackage.xwq
        public void h(View view, float f) {
            this.f16352a.e(f, this.h);
            ke5.b(this.g.valueAt(0), view, this.h);
        }

        public void i(int i, ConstraintAttribute constraintAttribute) {
            this.g.append(i, constraintAttribute);
        }
    }

    public static class c extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setElevation(a(f));
        }
    }

    public static class d extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
        }

        public void i(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    public static class e extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    public static class f extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    public static class g extends xwq {
        public boolean f = false;

        @Override // defpackage.xwq
        public void h(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f = true;
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

    public static class h extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setRotation(a(f));
        }
    }

    public static class i extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    public static class j extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    public static class k extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    public static class l extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    public static class m extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    public static class n extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    public static class o extends xwq {
        @Override // defpackage.xwq
        public void h(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public static xwq f(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static xwq g(String str) {
        str.hashCode();
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
            case -760884510:
                if (str.equals("transformPivotX")) {
                    b2 = 9;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    b2 = 10;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b2 = 11;
                }
                break;
            case -4379043:
                if (str.equals(BizTypeConstants.ELEVATION)) {
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                }
                break;
            case 92909918:
                if (str.equals(SleepAnalyzerAlpha.NAME_ALPHA)) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b2 = 15;
                }
                break;
        }
        switch (b2) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case 8:
                return new a();
            case 9:
                return new e();
            case 10:
                return new f();
            case 11:
                return new h();
            case 12:
                return new c();
            case 13:
                return new d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void h(View view, float f2);
}
