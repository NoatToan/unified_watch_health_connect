package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class i0e extends j0e {
    public String h = null;
    public int i = qzd.f;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f20646k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public int q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f20647r = Float.NaN;
    public float s = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f20648a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f20648a = sparseIntArray;
            sparseIntArray.append(u4j.U6, 1);
            f20648a.append(u4j.S6, 2);
            f20648a.append(u4j.b7, 3);
            f20648a.append(u4j.Q6, 4);
            f20648a.append(u4j.R6, 5);
            f20648a.append(u4j.Y6, 6);
            f20648a.append(u4j.Z6, 7);
            f20648a.append(u4j.T6, 9);
            f20648a.append(u4j.a7, 8);
            f20648a.append(u4j.X6, 11);
            f20648a.append(u4j.W6, 12);
            f20648a.append(u4j.V6, 10);
        }

        public static void b(i0e i0eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f20648a.get(index)) {
                    case 1:
                        if (MotionLayout.E0) {
                            int resourceId = typedArray.getResourceId(index, i0eVar.f32024b);
                            i0eVar.f32024b = resourceId;
                            if (resourceId == -1) {
                                i0eVar.c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            i0eVar.c = typedArray.getString(index);
                        } else {
                            i0eVar.f32024b = typedArray.getResourceId(index, i0eVar.f32024b);
                        }
                        break;
                    case 2:
                        i0eVar.f32023a = typedArray.getInt(index, i0eVar.f32023a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            i0eVar.h = typedArray.getString(index);
                        } else {
                            i0eVar.h = ba7.c[typedArray.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        i0eVar.g = typedArray.getInteger(index, i0eVar.g);
                        break;
                    case 5:
                        i0eVar.j = typedArray.getInt(index, i0eVar.j);
                        break;
                    case 6:
                        i0eVar.m = typedArray.getFloat(index, i0eVar.m);
                        break;
                    case 7:
                        i0eVar.n = typedArray.getFloat(index, i0eVar.n);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, i0eVar.l);
                        i0eVar.f20646k = f;
                        i0eVar.l = f;
                        break;
                    case 9:
                        i0eVar.q = typedArray.getInt(index, i0eVar.q);
                        break;
                    case 10:
                        i0eVar.i = typedArray.getInt(index, i0eVar.i);
                        break;
                    case 11:
                        i0eVar.f20646k = typedArray.getFloat(index, i0eVar.f20646k);
                        break;
                    case 12:
                        i0eVar.l = typedArray.getFloat(index, i0eVar.l);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f20648a.get(index));
                        break;
                }
            }
            int i2 = i0eVar.f32023a;
        }
    }

    public i0e() {
        this.d = 2;
    }

    @Override // defpackage.qzd
    public void a(HashMap<String, xwq> map) {
    }

    @Override // defpackage.qzd
    /* JADX INFO: renamed from: b */
    public qzd clone() {
        return new i0e().c(this);
    }

    @Override // defpackage.qzd
    public qzd c(qzd qzdVar) {
        super.c(qzdVar);
        i0e i0eVar = (i0e) qzdVar;
        this.h = i0eVar.h;
        this.i = i0eVar.i;
        this.j = i0eVar.j;
        this.f20646k = i0eVar.f20646k;
        this.l = Float.NaN;
        this.m = i0eVar.m;
        this.n = i0eVar.n;
        this.o = i0eVar.o;
        this.p = i0eVar.p;
        this.f20647r = i0eVar.f20647r;
        this.s = i0eVar.s;
        return this;
    }

    @Override // defpackage.qzd
    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, u4j.P6));
    }

    public void m(int i) {
        this.q = i;
    }

    public void n(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                this.h = obj.toString();
                break;
            case "percentWidth":
                this.f20646k = k(obj);
                break;
            case "percentHeight":
                this.l = k(obj);
                break;
            case "drawPath":
                this.j = l(obj);
                break;
            case "sizePercent":
                float fK = k(obj);
                this.f20646k = fK;
                this.l = fK;
                break;
            case "percentX":
                this.m = k(obj);
                break;
            case "percentY":
                this.n = k(obj);
                break;
        }
    }
}
