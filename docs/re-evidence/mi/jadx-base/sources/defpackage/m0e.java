package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class m0e extends qzd {
    public HashMap<String, Method> A;
    public int g = -1;
    public String h = null;
    public int i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25612k;
    public int l;
    public int m;
    public View n;
    public float o;
    public boolean p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25613r;
    public float s;
    public float t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public RectF y;
    public RectF z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f25614a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f25614a = sparseIntArray;
            sparseIntArray.append(u4j.x7, 8);
            f25614a.append(u4j.B7, 4);
            f25614a.append(u4j.C7, 1);
            f25614a.append(u4j.D7, 2);
            f25614a.append(u4j.y7, 7);
            f25614a.append(u4j.E7, 6);
            f25614a.append(u4j.G7, 5);
            f25614a.append(u4j.A7, 9);
            f25614a.append(u4j.z7, 10);
            f25614a.append(u4j.F7, 11);
            f25614a.append(u4j.H7, 12);
            f25614a.append(u4j.I7, 13);
            f25614a.append(u4j.J7, 14);
        }

        public static void a(m0e m0eVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f25614a.get(index)) {
                    case 1:
                        m0eVar.j = typedArray.getString(index);
                        break;
                    case 2:
                        m0eVar.f25612k = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f25614a.get(index));
                        break;
                    case 4:
                        m0eVar.h = typedArray.getString(index);
                        break;
                    case 5:
                        m0eVar.o = typedArray.getFloat(index, m0eVar.o);
                        break;
                    case 6:
                        m0eVar.l = typedArray.getResourceId(index, m0eVar.l);
                        break;
                    case 7:
                        if (MotionLayout.E0) {
                            int resourceId = typedArray.getResourceId(index, m0eVar.f32024b);
                            m0eVar.f32024b = resourceId;
                            if (resourceId == -1) {
                                m0eVar.c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            m0eVar.c = typedArray.getString(index);
                        } else {
                            m0eVar.f32024b = typedArray.getResourceId(index, m0eVar.f32024b);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, m0eVar.f32023a);
                        m0eVar.f32023a = integer;
                        m0eVar.s = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        m0eVar.m = typedArray.getResourceId(index, m0eVar.m);
                        break;
                    case 10:
                        m0eVar.u = typedArray.getBoolean(index, m0eVar.u);
                        break;
                    case 11:
                        m0eVar.i = typedArray.getResourceId(index, m0eVar.i);
                        break;
                    case 12:
                        m0eVar.x = typedArray.getResourceId(index, m0eVar.x);
                        break;
                    case 13:
                        m0eVar.v = typedArray.getResourceId(index, m0eVar.v);
                        break;
                    case 14:
                        m0eVar.w = typedArray.getResourceId(index, m0eVar.w);
                        break;
                }
            }
        }
    }

    public m0e() {
        int i = qzd.f;
        this.i = i;
        this.j = null;
        this.f25612k = null;
        this.l = i;
        this.m = i;
        this.n = null;
        this.o = 0.1f;
        this.p = true;
        this.q = true;
        this.f25613r = true;
        this.s = Float.NaN;
        this.u = false;
        this.v = i;
        this.w = i;
        this.x = i;
        this.y = new RectF();
        this.z = new RectF();
        this.A = new HashMap<>();
        this.d = 5;
        this.e = new HashMap<>();
    }

    public final void A(String str, View view) {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.e.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.a(view);
                }
            }
        }
    }

    public final void B(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // defpackage.qzd
    public void a(HashMap<String, xwq> map) {
    }

    @Override // defpackage.qzd
    /* JADX INFO: renamed from: b */
    public qzd clone() {
        return new m0e().c(this);
    }

    @Override // defpackage.qzd
    public qzd c(qzd qzdVar) {
        super.c(qzdVar);
        m0e m0eVar = (m0e) qzdVar;
        this.g = m0eVar.g;
        this.h = m0eVar.h;
        this.i = m0eVar.i;
        this.j = m0eVar.j;
        this.f25612k = m0eVar.f25612k;
        this.l = m0eVar.l;
        this.m = m0eVar.m;
        this.n = m0eVar.n;
        this.o = m0eVar.o;
        this.p = m0eVar.p;
        this.q = m0eVar.q;
        this.f25613r = m0eVar.f25613r;
        this.s = m0eVar.s;
        this.t = m0eVar.t;
        this.u = m0eVar.u;
        this.y = m0eVar.y;
        this.z = m0eVar.z;
        this.A = m0eVar.A;
        return this;
    }

    @Override // defpackage.qzd
    public void d(HashSet<String> hashSet) {
    }

    @Override // defpackage.qzd
    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, u4j.w7), context);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    public void y(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (this.m != qzd.f) {
            if (this.n == null) {
                this.n = ((ViewGroup) view.getParent()).findViewById(this.m);
            }
            B(this.y, this.n, this.u);
            B(this.z, view, this.u);
            if (this.y.intersect(this.z)) {
                if (this.p) {
                    this.p = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f25613r) {
                    this.f25613r = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.q = true;
            } else {
                if (this.p) {
                    z = false;
                } else {
                    this.p = true;
                    z = true;
                }
                if (this.q) {
                    this.q = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f25613r = true;
                z6 = z4;
                z3 = false;
            }
        } else {
            if (this.p) {
                float f6 = this.s;
                if ((f - f6) * (this.t - f6) < 0.0f) {
                    this.p = false;
                    z = true;
                }
                if (this.q) {
                    f4 = this.s;
                    f5 = f - f4;
                    if ((this.t - f4) * f5 >= 0.0f && f5 < 0.0f) {
                        this.q = false;
                        z2 = true;
                    }
                    if (this.f25613r) {
                        f2 = this.s;
                        f3 = f - f2;
                        if ((this.t - f2) * f3 < 0.0f || f3 <= 0.0f) {
                            z5 = false;
                        } else {
                            this.f25613r = false;
                        }
                        z3 = z5;
                    } else {
                        if (Math.abs(f - this.s) > this.o) {
                            this.f25613r = true;
                        }
                        z3 = false;
                    }
                    z6 = z2;
                } else if (Math.abs(f - this.s) > this.o) {
                    this.q = true;
                }
                z2 = false;
                if (this.f25613r) {
                    f2 = this.s;
                    f3 = f - f2;
                    if ((this.t - f2) * f3 < 0.0f) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    z3 = z5;
                } else {
                    if (Math.abs(f - this.s) > this.o) {
                        this.f25613r = true;
                    }
                    z3 = false;
                }
                z6 = z2;
            } else if (Math.abs(f - this.s) > this.o) {
                this.p = true;
            }
            z = false;
            if (this.q) {
                f4 = this.s;
                f5 = f - f4;
                if ((this.t - f4) * f5 >= 0.0f) {
                }
                if (this.f25613r) {
                    f2 = this.s;
                    f3 = f - f2;
                    if ((this.t - f2) * f3 < 0.0f) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    z3 = z5;
                } else {
                    if (Math.abs(f - this.s) > this.o) {
                        this.f25613r = true;
                    }
                    z3 = false;
                }
                z6 = z2;
            } else if (Math.abs(f - this.s) > this.o) {
                this.q = true;
            }
            z2 = false;
            if (this.f25613r) {
                f2 = this.s;
                f3 = f - f2;
                if ((this.t - f2) * f3 < 0.0f) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                z3 = z5;
            } else {
                if (Math.abs(f - this.s) > this.o) {
                    this.f25613r = true;
                }
                z3 = false;
            }
            z6 = z2;
        }
        this.t = f;
        if (z6 || z || z3) {
            ((MotionLayout) view.getParent()).K(this.l, z3, f);
        }
        View viewFindViewById = this.i == qzd.f ? view : ((MotionLayout) view.getParent()).findViewById(this.i);
        if (z6) {
            String str = this.j;
            if (str != null) {
                z(str, viewFindViewById);
            }
            if (this.v != qzd.f) {
                ((MotionLayout) view.getParent()).k0(this.v, viewFindViewById);
            }
        }
        if (z3) {
            String str2 = this.f25612k;
            if (str2 != null) {
                z(str2, viewFindViewById);
            }
            if (this.w != qzd.f) {
                ((MotionLayout) view.getParent()).k0(this.w, viewFindViewById);
            }
        }
        if (z) {
            String str3 = this.h;
            if (str3 != null) {
                z(str3, viewFindViewById);
            }
            if (this.x != qzd.f) {
                ((MotionLayout) view.getParent()).k0(this.x, viewFindViewById);
            }
        }
    }

    public final void z(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            A(str, view);
            return;
        }
        if (this.A.containsKey(str)) {
            method = this.A.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.A.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.A.put(str, null);
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find method \"");
                sb.append(str);
                sb.append("\"on class ");
                sb.append(view.getClass().getSimpleName());
                sb.append(" ");
                sb.append(ir5.d(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception in call \"");
            sb2.append(this.h);
            sb2.append("\"on class ");
            sb2.append(view.getClass().getSimpleName());
            sb2.append(" ");
            sb2.append(ir5.d(view));
        }
    }
}
