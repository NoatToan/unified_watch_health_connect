package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class l0e extends qzd {
    public String g;
    public int h = -1;
    public float i = Float.NaN;
    public float j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f24478k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f24479r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public int u = 0;
    public String v = null;
    public float w = Float.NaN;
    public float x = 0.0f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f24480a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24480a = sparseIntArray;
            sparseIntArray.append(u4j.d7, 1);
            f24480a.append(u4j.m7, 2);
            f24480a.append(u4j.i7, 4);
            f24480a.append(u4j.j7, 5);
            f24480a.append(u4j.k7, 6);
            f24480a.append(u4j.g7, 7);
            f24480a.append(u4j.s7, 8);
            f24480a.append(u4j.r7, 9);
            f24480a.append(u4j.q7, 10);
            f24480a.append(u4j.o7, 12);
            f24480a.append(u4j.n7, 13);
            f24480a.append(u4j.h7, 14);
            f24480a.append(u4j.e7, 15);
            f24480a.append(u4j.f7, 16);
            f24480a.append(u4j.l7, 17);
            f24480a.append(u4j.p7, 18);
            f24480a.append(u4j.u7, 20);
            f24480a.append(u4j.t7, 21);
            f24480a.append(u4j.v7, 19);
        }

        public static void a(l0e l0eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f24480a.get(index)) {
                    case 1:
                        l0eVar.i = typedArray.getFloat(index, l0eVar.i);
                        break;
                    case 2:
                        l0eVar.j = typedArray.getDimension(index, l0eVar.j);
                        break;
                    case 3:
                    case 11:
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f24480a.get(index));
                        break;
                    case 4:
                        l0eVar.f24478k = typedArray.getFloat(index, l0eVar.f24478k);
                        break;
                    case 5:
                        l0eVar.l = typedArray.getFloat(index, l0eVar.l);
                        break;
                    case 6:
                        l0eVar.m = typedArray.getFloat(index, l0eVar.m);
                        break;
                    case 7:
                        l0eVar.o = typedArray.getFloat(index, l0eVar.o);
                        break;
                    case 8:
                        l0eVar.n = typedArray.getFloat(index, l0eVar.n);
                        break;
                    case 9:
                        l0eVar.g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.E0) {
                            int resourceId = typedArray.getResourceId(index, l0eVar.f32024b);
                            l0eVar.f32024b = resourceId;
                            if (resourceId == -1) {
                                l0eVar.c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            l0eVar.c = typedArray.getString(index);
                        } else {
                            l0eVar.f32024b = typedArray.getResourceId(index, l0eVar.f32024b);
                        }
                        break;
                    case 12:
                        l0eVar.f32023a = typedArray.getInt(index, l0eVar.f32023a);
                        break;
                    case 13:
                        l0eVar.h = typedArray.getInteger(index, l0eVar.h);
                        break;
                    case 14:
                        l0eVar.p = typedArray.getFloat(index, l0eVar.p);
                        break;
                    case 15:
                        l0eVar.q = typedArray.getDimension(index, l0eVar.q);
                        break;
                    case 16:
                        l0eVar.f24479r = typedArray.getDimension(index, l0eVar.f24479r);
                        break;
                    case 17:
                        l0eVar.s = typedArray.getDimension(index, l0eVar.s);
                        break;
                    case 18:
                        l0eVar.t = typedArray.getFloat(index, l0eVar.t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            l0eVar.v = typedArray.getString(index);
                            l0eVar.u = 7;
                        } else {
                            l0eVar.u = typedArray.getInt(index, l0eVar.u);
                        }
                        break;
                    case 20:
                        l0eVar.w = typedArray.getFloat(index, l0eVar.w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            l0eVar.x = typedArray.getDimension(index, l0eVar.x);
                        } else {
                            l0eVar.x = typedArray.getFloat(index, l0eVar.x);
                        }
                        break;
                }
            }
        }
    }

    public l0e() {
        this.d = 3;
        this.e = new HashMap<>();
    }

    public void U(HashMap<String, mxq> map) {
        for (String str : map.keySet()) {
            mxq mxqVar = map.get(str);
            if (mxqVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.l)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.l, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.m, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.q, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f24479r)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.f24479r, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.s)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.s, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.t)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.t, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.o, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.p)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.p, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f24478k)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.f24478k, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.j, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.n, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                mxqVar.b(this.f32023a, this.i, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("UNKNOWN addValues \"");
                            sb.append(str);
                            sb.append("\"");
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.e.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((mxq.b) mxqVar).j(this.f32023a, constraintAttribute, this.w, this.u, this.x);
                    }
                }
            }
        }
    }

    @Override // defpackage.qzd
    public void a(HashMap<String, xwq> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // defpackage.qzd
    /* JADX INFO: renamed from: b */
    public qzd clone() {
        return new l0e().c(this);
    }

    @Override // defpackage.qzd
    public qzd c(qzd qzdVar) {
        super.c(qzdVar);
        l0e l0eVar = (l0e) qzdVar;
        this.g = l0eVar.g;
        this.h = l0eVar.h;
        this.u = l0eVar.u;
        this.w = l0eVar.w;
        this.x = l0eVar.x;
        this.t = l0eVar.t;
        this.i = l0eVar.i;
        this.j = l0eVar.j;
        this.f24478k = l0eVar.f24478k;
        this.n = l0eVar.n;
        this.l = l0eVar.l;
        this.m = l0eVar.m;
        this.o = l0eVar.o;
        this.p = l0eVar.p;
        this.q = l0eVar.q;
        this.f24479r = l0eVar.f24479r;
        this.s = l0eVar.s;
        return this;
    }

    @Override // defpackage.qzd
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.i)) {
            hashSet.add(SleepAnalyzerAlpha.NAME_ALPHA);
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add(BizTypeConstants.ELEVATION);
        }
        if (!Float.isNaN(this.f24478k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X);
        }
        if (!Float.isNaN(this.f24479r)) {
            hashSet.add(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y);
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.t)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, u4j.c7));
    }

    @Override // defpackage.qzd
    public void h(HashMap<String, Integer> map) {
        if (this.h == -1) {
            return;
        }
        if (!Float.isNaN(this.i)) {
            map.put(SleepAnalyzerAlpha.NAME_ALPHA, Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.j)) {
            map.put(BizTypeConstants.ELEVATION, Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.f24478k)) {
            map.put("rotation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.l)) {
            map.put("rotationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.m)) {
            map.put("rotationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.q)) {
            map.put(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.f24479r)) {
            map.put(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.s)) {
            map.put("translationZ", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.n)) {
            map.put("transitionPathRotate", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            map.put("scaleX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            map.put("scaleY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.t)) {
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
