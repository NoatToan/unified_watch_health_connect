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
public class tzd extends qzd {
    public String g = null;
    public int h = 0;
    public int i = -1;
    public String j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f35212k = Float.NaN;
    public float l = 0.0f;
    public float m = 0.0f;
    public float n = Float.NaN;
    public int o = -1;
    public float p = Float.NaN;
    public float q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f35213r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public float z = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f35214a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f35214a = sparseIntArray;
            sparseIntArray.append(u4j.E6, 1);
            f35214a.append(u4j.C6, 2);
            f35214a.append(u4j.F6, 3);
            f35214a.append(u4j.B6, 4);
            f35214a.append(u4j.K6, 5);
            f35214a.append(u4j.I6, 6);
            f35214a.append(u4j.H6, 7);
            f35214a.append(u4j.L6, 8);
            f35214a.append(u4j.r6, 9);
            f35214a.append(u4j.A6, 10);
            f35214a.append(u4j.w6, 11);
            f35214a.append(u4j.x6, 12);
            f35214a.append(u4j.y6, 13);
            f35214a.append(u4j.G6, 14);
            f35214a.append(u4j.u6, 15);
            f35214a.append(u4j.v6, 16);
            f35214a.append(u4j.s6, 17);
            f35214a.append(u4j.t6, 18);
            f35214a.append(u4j.z6, 19);
            f35214a.append(u4j.D6, 20);
            f35214a.append(u4j.J6, 21);
        }

        public static void b(tzd tzdVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f35214a.get(index)) {
                    case 1:
                        if (MotionLayout.E0) {
                            int resourceId = typedArray.getResourceId(index, tzdVar.f32024b);
                            tzdVar.f32024b = resourceId;
                            if (resourceId == -1) {
                                tzdVar.c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            tzdVar.c = typedArray.getString(index);
                        } else {
                            tzdVar.f32024b = typedArray.getResourceId(index, tzdVar.f32024b);
                        }
                        break;
                    case 2:
                        tzdVar.f32023a = typedArray.getInt(index, tzdVar.f32023a);
                        break;
                    case 3:
                        tzdVar.g = typedArray.getString(index);
                        break;
                    case 4:
                        tzdVar.h = typedArray.getInteger(index, tzdVar.h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            tzdVar.j = typedArray.getString(index);
                            tzdVar.i = 7;
                        } else {
                            tzdVar.i = typedArray.getInt(index, tzdVar.i);
                        }
                        break;
                    case 6:
                        tzdVar.f35212k = typedArray.getFloat(index, tzdVar.f35212k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            tzdVar.l = typedArray.getDimension(index, tzdVar.l);
                        } else {
                            tzdVar.l = typedArray.getFloat(index, tzdVar.l);
                        }
                        break;
                    case 8:
                        tzdVar.o = typedArray.getInt(index, tzdVar.o);
                        break;
                    case 9:
                        tzdVar.p = typedArray.getFloat(index, tzdVar.p);
                        break;
                    case 10:
                        tzdVar.q = typedArray.getDimension(index, tzdVar.q);
                        break;
                    case 11:
                        tzdVar.f35213r = typedArray.getFloat(index, tzdVar.f35213r);
                        break;
                    case 12:
                        tzdVar.t = typedArray.getFloat(index, tzdVar.t);
                        break;
                    case 13:
                        tzdVar.u = typedArray.getFloat(index, tzdVar.u);
                        break;
                    case 14:
                        tzdVar.s = typedArray.getFloat(index, tzdVar.s);
                        break;
                    case 15:
                        tzdVar.v = typedArray.getFloat(index, tzdVar.v);
                        break;
                    case 16:
                        tzdVar.w = typedArray.getFloat(index, tzdVar.w);
                        break;
                    case 17:
                        tzdVar.x = typedArray.getDimension(index, tzdVar.x);
                        break;
                    case 18:
                        tzdVar.y = typedArray.getDimension(index, tzdVar.y);
                        break;
                    case 19:
                        tzdVar.z = typedArray.getDimension(index, tzdVar.z);
                        break;
                    case 20:
                        tzdVar.n = typedArray.getFloat(index, tzdVar.n);
                        break;
                    case 21:
                        tzdVar.m = typedArray.getFloat(index, tzdVar.m) / 360.0f;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f35214a.get(index));
                        break;
                }
            }
        }
    }

    public tzd() {
        this.d = 4;
        this.e = new HashMap<>();
    }

    public void Y(HashMap<String, lvq> map) {
        lvq lvqVar;
        lvq lvqVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.e.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.d() == ConstraintAttribute.AttributeType.FLOAT_TYPE && (lvqVar = map.get(str)) != null) {
                    lvqVar.e(this.f32023a, this.i, this.j, this.o, this.f35212k, this.l, this.m, constraintAttribute.e(), constraintAttribute);
                }
            } else {
                float fZ = Z(str);
                if (!Float.isNaN(fZ) && (lvqVar2 = map.get(str)) != null) {
                    lvqVar2.d(this.f32023a, this.i, this.j, this.o, this.f35212k, this.l, this.m, fZ);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public float Z(String str) {
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
            case -40300674:
                if (str.equals("rotation")) {
                    b2 = 8;
                }
                break;
            case -4379043:
                if (str.equals(BizTypeConstants.ELEVATION)) {
                    b2 = 9;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b2 = 10;
                }
                break;
            case 92909918:
                if (str.equals(SleepAnalyzerAlpha.NAME_ALPHA)) {
                    b2 = 11;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                }
                break;
        }
        switch (b2) {
            case 0:
                return this.t;
            case 1:
                return this.u;
            case 2:
                return this.x;
            case 3:
                return this.y;
            case 4:
                return this.z;
            case 5:
                return this.n;
            case 6:
                return this.v;
            case 7:
                return this.w;
            case 8:
                return this.f35213r;
            case 9:
                return this.q;
            case 10:
                return this.s;
            case 11:
                return this.p;
            case 12:
                return this.l;
            case 13:
                return this.m;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("  UNKNOWN  ");
                sb.append(str);
                return Float.NaN;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qzd
    public void a(HashMap<String, xwq> map) {
        ir5.g("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            xwq xwqVar = map.get(str);
            if (xwqVar != null) {
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
                    case -40300674:
                        if (str.equals("rotation")) {
                            b2 = 8;
                        }
                        break;
                    case -4379043:
                        if (str.equals(BizTypeConstants.ELEVATION)) {
                            b2 = 9;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b2 = 10;
                        }
                        break;
                    case 92909918:
                        if (str.equals(SleepAnalyzerAlpha.NAME_ALPHA)) {
                            b2 = 11;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        xwqVar.c(this.f32023a, this.t);
                        break;
                    case 1:
                        xwqVar.c(this.f32023a, this.u);
                        break;
                    case 2:
                        xwqVar.c(this.f32023a, this.x);
                        break;
                    case 3:
                        xwqVar.c(this.f32023a, this.y);
                        break;
                    case 4:
                        xwqVar.c(this.f32023a, this.z);
                        break;
                    case 5:
                        xwqVar.c(this.f32023a, this.n);
                        break;
                    case 6:
                        xwqVar.c(this.f32023a, this.v);
                        break;
                    case 7:
                        xwqVar.c(this.f32023a, this.w);
                        break;
                    case 8:
                        xwqVar.c(this.f32023a, this.f35213r);
                        break;
                    case 9:
                        xwqVar.c(this.f32023a, this.q);
                        break;
                    case 10:
                        xwqVar.c(this.f32023a, this.s);
                        break;
                    case 11:
                        xwqVar.c(this.f32023a, this.p);
                        break;
                    case 12:
                        xwqVar.c(this.f32023a, this.l);
                        break;
                    case 13:
                        xwqVar.c(this.f32023a, this.m);
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("  UNKNOWN  ");
                            sb.append(str);
                        }
                        break;
                }
            }
        }
    }

    @Override // defpackage.qzd
    /* JADX INFO: renamed from: b */
    public qzd clone() {
        return new tzd().c(this);
    }

    @Override // defpackage.qzd
    public qzd c(qzd qzdVar) {
        super.c(qzdVar);
        tzd tzdVar = (tzd) qzdVar;
        this.g = tzdVar.g;
        this.h = tzdVar.h;
        this.i = tzdVar.i;
        this.j = tzdVar.j;
        this.f35212k = tzdVar.f35212k;
        this.l = tzdVar.l;
        this.m = tzdVar.m;
        this.n = tzdVar.n;
        this.o = tzdVar.o;
        this.p = tzdVar.p;
        this.q = tzdVar.q;
        this.f35213r = tzdVar.f35213r;
        this.s = tzdVar.s;
        this.t = tzdVar.t;
        this.u = tzdVar.u;
        this.v = tzdVar.v;
        this.w = tzdVar.w;
        this.x = tzdVar.x;
        this.y = tzdVar.y;
        this.z = tzdVar.z;
        return this;
    }

    @Override // defpackage.qzd
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.p)) {
            hashSet.add(SleepAnalyzerAlpha.NAME_ALPHA);
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add(BizTypeConstants.ELEVATION);
        }
        if (!Float.isNaN(this.f35213r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.x)) {
            hashSet.add(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X);
        }
        if (!Float.isNaN(this.y)) {
            hashSet.add(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y);
        }
        if (!Float.isNaN(this.z)) {
            hashSet.add("translationZ");
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
        a.b(this, context.obtainStyledAttributes(attributeSet, u4j.q6));
    }
}
