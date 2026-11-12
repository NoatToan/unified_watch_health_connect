package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.a;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class m8g implements Comparable<m8g> {
    public static String[] D = {"position", "x", "y", "width", "height", "pathRotate"};
    public int c;
    public ba7 p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f25886r;
    public float s;
    public float t;
    public float u;
    public float v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f25883a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25884b = 0;
    public boolean d = false;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 1.0f;
    public float j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f25885k = Float.NaN;
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 0.0f;
    public float o = 0.0f;
    public int q = 0;
    public float w = Float.NaN;
    public float x = Float.NaN;
    public int y = -1;
    public LinkedHashMap<String, ConstraintAttribute> z = new LinkedHashMap<>();
    public int A = 0;
    public double[] B = new double[18];
    public double[] C = new double[18];

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, xwq> map, int i) {
        for (String str : map.keySet()) {
            xwq xwqVar = map.get(str);
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
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        b2 = 8;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        b2 = 9;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        b2 = 10;
                    }
                    break;
                case -4379043:
                    if (str.equals(BizTypeConstants.ELEVATION)) {
                        b2 = 11;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                    }
                    break;
                case 92909918:
                    if (str.equals(SleepAnalyzerAlpha.NAME_ALPHA)) {
                        b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    xwqVar.c(i, Float.isNaN(this.g) ? 0.0f : this.g);
                    break;
                case 1:
                    xwqVar.c(i, Float.isNaN(this.h) ? 0.0f : this.h);
                    break;
                case 2:
                    xwqVar.c(i, Float.isNaN(this.m) ? 0.0f : this.m);
                    break;
                case 3:
                    xwqVar.c(i, Float.isNaN(this.n) ? 0.0f : this.n);
                    break;
                case 4:
                    xwqVar.c(i, Float.isNaN(this.o) ? 0.0f : this.o);
                    break;
                case 5:
                    xwqVar.c(i, Float.isNaN(this.x) ? 0.0f : this.x);
                    break;
                case 6:
                    xwqVar.c(i, Float.isNaN(this.i) ? 1.0f : this.i);
                    break;
                case 7:
                    xwqVar.c(i, Float.isNaN(this.j) ? 1.0f : this.j);
                    break;
                case 8:
                    xwqVar.c(i, Float.isNaN(this.f25885k) ? 0.0f : this.f25885k);
                    break;
                case 9:
                    xwqVar.c(i, Float.isNaN(this.l) ? 0.0f : this.l);
                    break;
                case 10:
                    xwqVar.c(i, Float.isNaN(this.f) ? 0.0f : this.f);
                    break;
                case 11:
                    xwqVar.c(i, Float.isNaN(this.e) ? 0.0f : this.e);
                    break;
                case 12:
                    xwqVar.c(i, Float.isNaN(this.w) ? 0.0f : this.w);
                    break;
                case 13:
                    xwqVar.c(i, Float.isNaN(this.f25883a) ? 1.0f : this.f25883a);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.z.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = this.z.get(str2);
                            if (xwqVar instanceof xwq.b) {
                                ((xwq.b) xwqVar).i(i, constraintAttribute);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(" ViewSpline not a CustomSet frame = ");
                                sb.append(i);
                                sb.append(", value");
                                sb.append(constraintAttribute.e());
                                sb.append(xwqVar);
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("UNKNOWN spline ");
                        sb2.append(str);
                    }
                    break;
            }
        }
    }

    public void b(View view) {
        this.c = view.getVisibility();
        this.f25883a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.d = false;
        this.e = view.getElevation();
        this.f = view.getRotation();
        this.g = view.getRotationX();
        this.h = view.getRotationY();
        this.i = view.getScaleX();
        this.j = view.getScaleY();
        this.f25885k = view.getPivotX();
        this.l = view.getPivotY();
        this.m = view.getTranslationX();
        this.n = view.getTranslationY();
        this.o = view.getTranslationZ();
    }

    public void c(a.C0020a c0020a) {
        a.d dVar = c0020a.c;
        int i = dVar.c;
        this.f25884b = i;
        int i2 = dVar.f2031b;
        this.c = i2;
        this.f25883a = (i2 == 0 || i != 0) ? dVar.d : 0.0f;
        a.e eVar = c0020a.f;
        this.d = eVar.m;
        this.e = eVar.n;
        this.f = eVar.f2033b;
        this.g = eVar.c;
        this.h = eVar.d;
        this.i = eVar.e;
        this.j = eVar.f;
        this.f25885k = eVar.g;
        this.l = eVar.h;
        this.m = eVar.j;
        this.n = eVar.f2034k;
        this.o = eVar.l;
        this.p = ba7.c(c0020a.d.d);
        a.c cVar = c0020a.d;
        this.w = cVar.i;
        this.q = cVar.f;
        this.y = cVar.f2028b;
        this.x = c0020a.c.e;
        for (String str : c0020a.g.keySet()) {
            ConstraintAttribute constraintAttribute = c0020a.g.get(str);
            if (constraintAttribute.g()) {
                this.z.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(m8g m8gVar) {
        return Float.compare(this.f25886r, m8gVar.f25886r);
    }

    public final boolean e(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public void h(m8g m8gVar, HashSet<String> hashSet) {
        if (e(this.f25883a, m8gVar.f25883a)) {
            hashSet.add(SleepAnalyzerAlpha.NAME_ALPHA);
        }
        if (e(this.e, m8gVar.e)) {
            hashSet.add(BizTypeConstants.ELEVATION);
        }
        int i = this.c;
        int i2 = m8gVar.c;
        if (i != i2 && this.f25884b == 0 && (i == 0 || i2 == 0)) {
            hashSet.add(SleepAnalyzerAlpha.NAME_ALPHA);
        }
        if (e(this.f, m8gVar.f)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.w) || !Float.isNaN(m8gVar.w)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.x) || !Float.isNaN(m8gVar.x)) {
            hashSet.add(BroadcastsKt.SILENT_PUSHING_PROGRESS);
        }
        if (e(this.g, m8gVar.g)) {
            hashSet.add("rotationX");
        }
        if (e(this.h, m8gVar.h)) {
            hashSet.add("rotationY");
        }
        if (e(this.f25885k, m8gVar.f25885k)) {
            hashSet.add("transformPivotX");
        }
        if (e(this.l, m8gVar.l)) {
            hashSet.add("transformPivotY");
        }
        if (e(this.i, m8gVar.i)) {
            hashSet.add("scaleX");
        }
        if (e(this.j, m8gVar.j)) {
            hashSet.add("scaleY");
        }
        if (e(this.m, m8gVar.m)) {
            hashSet.add(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X);
        }
        if (e(this.n, m8gVar.n)) {
            hashSet.add(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y);
        }
        if (e(this.o, m8gVar.o)) {
            hashSet.add("translationZ");
        }
    }

    public void i(float f, float f2, float f3, float f4) {
        this.s = f;
        this.t = f2;
        this.u = f3;
        this.v = f4;
    }

    public void k(Rect rect, View view, int i, float f) {
        i(rect.left, rect.top, rect.width(), rect.height());
        b(view);
        this.f25885k = Float.NaN;
        this.l = Float.NaN;
        if (i == 1) {
            this.f = f - 90.0f;
        } else {
            if (i != 2) {
                return;
            }
            this.f = f + 90.0f;
        }
    }

    public void l(Rect rect, a aVar, int i, int i2) {
        i(rect.left, rect.top, rect.width(), rect.height());
        c(aVar.H(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f + 90.0f;
            this.f = f;
            if (f > 180.0f) {
                this.f = f - 360.0f;
                return;
            }
            return;
        }
        this.f -= 90.0f;
    }

    public void m(View view) {
        i(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }
}
