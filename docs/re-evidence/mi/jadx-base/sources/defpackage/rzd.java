package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class rzd extends qzd {
    public String g;
    public int h = -1;
    public boolean i = false;
    public float j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f33092k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f33093r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f33094a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f33094a = sparseIntArray;
            sparseIntArray.append(u4j.Y5, 1);
            f33094a.append(u4j.j6, 2);
            f33094a.append(u4j.f6, 4);
            f33094a.append(u4j.g6, 5);
            f33094a.append(u4j.h6, 6);
            f33094a.append(u4j.Z5, 19);
            f33094a.append(u4j.a6, 20);
            f33094a.append(u4j.d6, 7);
            f33094a.append(u4j.p6, 8);
            f33094a.append(u4j.o6, 9);
            f33094a.append(u4j.n6, 10);
            f33094a.append(u4j.l6, 12);
            f33094a.append(u4j.k6, 13);
            f33094a.append(u4j.e6, 14);
            f33094a.append(u4j.b6, 15);
            f33094a.append(u4j.c6, 16);
            f33094a.append(u4j.i6, 17);
            f33094a.append(u4j.m6, 18);
        }

        public static void a(rzd rzdVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f33094a.get(index)) {
                    case 1:
                        rzdVar.j = typedArray.getFloat(index, rzdVar.j);
                        break;
                    case 2:
                        rzdVar.f33092k = typedArray.getDimension(index, rzdVar.f33092k);
                        break;
                    case 3:
                    case 11:
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f33094a.get(index));
                        break;
                    case 4:
                        rzdVar.l = typedArray.getFloat(index, rzdVar.l);
                        break;
                    case 5:
                        rzdVar.m = typedArray.getFloat(index, rzdVar.m);
                        break;
                    case 6:
                        rzdVar.n = typedArray.getFloat(index, rzdVar.n);
                        break;
                    case 7:
                        rzdVar.f33093r = typedArray.getFloat(index, rzdVar.f33093r);
                        break;
                    case 8:
                        rzdVar.q = typedArray.getFloat(index, rzdVar.q);
                        break;
                    case 9:
                        rzdVar.g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.E0) {
                            int resourceId = typedArray.getResourceId(index, rzdVar.f32024b);
                            rzdVar.f32024b = resourceId;
                            if (resourceId == -1) {
                                rzdVar.c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            rzdVar.c = typedArray.getString(index);
                        } else {
                            rzdVar.f32024b = typedArray.getResourceId(index, rzdVar.f32024b);
                        }
                        break;
                    case 12:
                        rzdVar.f32023a = typedArray.getInt(index, rzdVar.f32023a);
                        break;
                    case 13:
                        rzdVar.h = typedArray.getInteger(index, rzdVar.h);
                        break;
                    case 14:
                        rzdVar.s = typedArray.getFloat(index, rzdVar.s);
                        break;
                    case 15:
                        rzdVar.t = typedArray.getDimension(index, rzdVar.t);
                        break;
                    case 16:
                        rzdVar.u = typedArray.getDimension(index, rzdVar.u);
                        break;
                    case 17:
                        rzdVar.v = typedArray.getDimension(index, rzdVar.v);
                        break;
                    case 18:
                        rzdVar.w = typedArray.getFloat(index, rzdVar.w);
                        break;
                    case 19:
                        rzdVar.o = typedArray.getDimension(index, rzdVar.o);
                        break;
                    case 20:
                        rzdVar.p = typedArray.getDimension(index, rzdVar.p);
                        break;
                }
            }
        }
    }

    public rzd() {
        this.d = 1;
        this.e = new HashMap<>();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void R(String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    b2 = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b2 = 1;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b2 = 2;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b2 = 3;
                }
                break;
            case -1225497657:
                if (str.equals(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X)) {
                    b2 = 4;
                }
                break;
            case -1225497656:
                if (str.equals(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y)) {
                    b2 = 5;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b2 = 6;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b2 = 7;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
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
            case 579057826:
                if (str.equals("curveFit")) {
                    b2 = 15;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b2 = 16;
                }
                break;
        }
        switch (b2) {
            case 0:
                this.w = k(obj);
                break;
            case 1:
                this.g = obj.toString();
                break;
            case 2:
                this.m = k(obj);
                break;
            case 3:
                this.n = k(obj);
                break;
            case 4:
                this.t = k(obj);
                break;
            case 5:
                this.u = k(obj);
                break;
            case 6:
                this.v = k(obj);
                break;
            case 7:
                this.f33093r = k(obj);
                break;
            case 8:
                this.s = k(obj);
                break;
            case 9:
                this.o = k(obj);
                break;
            case 10:
                this.p = k(obj);
                break;
            case 11:
                this.l = k(obj);
                break;
            case 12:
                this.f33092k = k(obj);
                break;
            case 13:
                this.q = k(obj);
                break;
            case 14:
                this.j = k(obj);
                break;
            case 15:
                this.h = l(obj);
                break;
            case 16:
                this.i = j(obj);
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qzd
    public void a(HashMap<String, xwq> map) {
        for (String str : map.keySet()) {
            xwq xwqVar = map.get(str);
            if (xwqVar != null) {
                byte b2 = 7;
                if (!str.startsWith("CUSTOM")) {
                    switch (str.hashCode()) {
                        case -1249320806:
                            b2 = str.equals("rotationX") ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            b2 = str.equals("rotationY") ? (byte) 1 : (byte) -1;
                            break;
                        case -1225497657:
                            b2 = str.equals(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X) ? (byte) 2 : (byte) -1;
                            break;
                        case -1225497656:
                            b2 = str.equals(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y) ? (byte) 3 : (byte) -1;
                            break;
                        case -1225497655:
                            b2 = str.equals("translationZ") ? (byte) 4 : (byte) -1;
                            break;
                        case -1001078227:
                            b2 = str.equals(BroadcastsKt.SILENT_PUSHING_PROGRESS) ? (byte) 5 : (byte) -1;
                            break;
                        case -908189618:
                            b2 = str.equals("scaleX") ? (byte) 6 : (byte) -1;
                            break;
                        case -908189617:
                            if (!str.equals("scaleY")) {
                                b2 = -1;
                            }
                            break;
                        case -760884510:
                            b2 = str.equals("transformPivotX") ? (byte) 8 : (byte) -1;
                            break;
                        case -760884509:
                            b2 = str.equals("transformPivotY") ? (byte) 9 : (byte) -1;
                            break;
                        case -40300674:
                            b2 = str.equals("rotation") ? (byte) 10 : (byte) -1;
                            break;
                        case -4379043:
                            b2 = str.equals(BizTypeConstants.ELEVATION) ? (byte) 11 : (byte) -1;
                            break;
                        case 37232917:
                            b2 = str.equals("transitionPathRotate") ? AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT : (byte) -1;
                            break;
                        case 92909918:
                            b2 = str.equals(SleepAnalyzerAlpha.NAME_ALPHA) ? HMProSyncDataBaseProfile.DATA_TYPE_PAI : (byte) -1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            if (!Float.isNaN(this.m)) {
                                xwqVar.c(this.f32023a, this.m);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.n)) {
                                xwqVar.c(this.f32023a, this.n);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.t)) {
                                xwqVar.c(this.f32023a, this.t);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.u)) {
                                xwqVar.c(this.f32023a, this.u);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.v)) {
                                xwqVar.c(this.f32023a, this.v);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.w)) {
                                xwqVar.c(this.f32023a, this.w);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.f33093r)) {
                                xwqVar.c(this.f32023a, this.f33093r);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.s)) {
                                xwqVar.c(this.f32023a, this.s);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.m)) {
                                xwqVar.c(this.f32023a, this.o);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.n)) {
                                xwqVar.c(this.f32023a, this.p);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.l)) {
                                xwqVar.c(this.f32023a, this.l);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.f33092k)) {
                                xwqVar.c(this.f32023a, this.f33092k);
                            }
                            break;
                        case 12:
                            if (!Float.isNaN(this.q)) {
                                xwqVar.c(this.f32023a, this.q);
                            }
                            break;
                        case 13:
                            if (!Float.isNaN(this.j)) {
                                xwqVar.c(this.f32023a, this.j);
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.e.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((xwq.b) xwqVar).i(this.f32023a, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // defpackage.qzd
    /* JADX INFO: renamed from: b */
    public qzd clone() {
        return new rzd().c(this);
    }

    @Override // defpackage.qzd
    public qzd c(qzd qzdVar) {
        super.c(qzdVar);
        rzd rzdVar = (rzd) qzdVar;
        this.h = rzdVar.h;
        this.i = rzdVar.i;
        this.j = rzdVar.j;
        this.f33092k = rzdVar.f33092k;
        this.l = rzdVar.l;
        this.m = rzdVar.m;
        this.n = rzdVar.n;
        this.o = rzdVar.o;
        this.p = rzdVar.p;
        this.q = rzdVar.q;
        this.f33093r = rzdVar.f33093r;
        this.s = rzdVar.s;
        this.t = rzdVar.t;
        this.u = rzdVar.u;
        this.v = rzdVar.v;
        this.w = rzdVar.w;
        return this;
    }

    @Override // defpackage.qzd
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.j)) {
            hashSet.add(SleepAnalyzerAlpha.NAME_ALPHA);
        }
        if (!Float.isNaN(this.f33092k)) {
            hashSet.add(BizTypeConstants.ELEVATION);
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X);
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y);
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f33093r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add(BroadcastsKt.SILENT_PUSHING_PROGRESS);
        }
        if (this.e.size() > 0) {
            Iterator<String> it = this.e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // defpackage.qzd
    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, u4j.X5));
    }

    @Override // defpackage.qzd
    public void h(HashMap<String, Integer> map) {
        if (this.h == -1) {
            return;
        }
        if (!Float.isNaN(this.j)) {
            map.put(SleepAnalyzerAlpha.NAME_ALPHA, Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.f33092k)) {
            map.put(BizTypeConstants.ELEVATION, Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.l)) {
            map.put("rotation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.m)) {
            map.put("rotationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.n)) {
            map.put("rotationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            map.put("transformPivotX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.p)) {
            map.put("transformPivotY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.t)) {
            map.put(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.u)) {
            map.put(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.v)) {
            map.put("translationZ", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.q)) {
            map.put("transitionPathRotate", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.f33093r)) {
            map.put("scaleX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.s)) {
            map.put("scaleY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.w)) {
            map.put(BroadcastsKt.SILENT_PUSHING_PROGRESS, Integer.valueOf(this.h));
        }
        if (this.e.size() > 0) {
            Iterator<String> it = this.e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.h));
            }
        }
    }
}
