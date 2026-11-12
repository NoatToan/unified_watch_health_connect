package r6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class j extends d {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151008a;

        static {
            int[] iArr = new int[q6.g.a.values().length];
            f151008a = iArr;
            try {
                iArr[q6.g.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f151008a[q6.g.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f151008a[q6.g.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(q6.g gVar) {
        super(gVar, q6.g.d.VERTICAL_CHAIN);
    }

    @Override // q6.d, q6.a, q6.e
    public final void apply() {
        q6.g gVar;
        ArrayList<Object> arrayList = this.f143082m0;
        Iterator<Object> it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            gVar = this.f143080k0;
            if (!zHasNext) {
                break;
            } else {
                gVar.c(it.next()).h();
            }
        }
        q6.a aVar = null;
        q6.a aVar2 = null;
        for (Object obj : arrayList) {
            q6.a aVarC = gVar.c(obj);
            if (aVar2 == null) {
                Object obj2 = this.R;
                if (obj2 != null) {
                    aVarC.p(obj2);
                    aVarC.k(this.f143040n).m(this.f143046t);
                } else {
                    Object obj3 = this.S;
                    if (obj3 != null) {
                        aVarC.getClass();
                        aVarC.f143024d0 = q6.g.b.TOP_TO_BOTTOM;
                        aVarC.S = obj3;
                        aVarC.k(this.f143040n).m(this.f143046t);
                    } else {
                        String string = aVarC.f143017a.toString();
                        aVarC.p(0);
                        aVarC.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                    }
                }
                aVar2 = aVarC;
            }
            if (aVar != null) {
                String string2 = aVar.f143017a.toString();
                String string3 = aVarC.f143017a.toString();
                Object obj4 = aVarC.f143017a;
                aVar.f143024d0 = q6.g.b.BOTTOM_TO_TOP;
                aVar.U = obj4;
                aVar.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj5 = aVar.f143017a;
                aVarC.f143024d0 = q6.g.b.TOP_TO_BOTTOM;
                aVarC.S = obj5;
                aVarC.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = obj.toString();
            HashMap<String, Float> map = this.f150968o0;
            float fFloatValue = map.containsKey(string4) ? map.get(string4).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                aVarC.f143029g = fFloatValue;
            }
            aVar = aVarC;
        }
        if (aVar != null) {
            Object obj6 = this.U;
            if (obj6 != null) {
                aVar.f143024d0 = q6.g.b.BOTTOM_TO_TOP;
                aVar.U = obj6;
                aVar.k(this.f143041o).m(this.f143047u);
            } else {
                Object obj7 = this.V;
                if (obj7 != null) {
                    aVar.e(obj7);
                    aVar.k(this.f143041o).m(this.f143047u);
                } else {
                    String string5 = aVar.f143017a.toString();
                    aVar.e(0);
                    aVar.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f14 = this.f150967n0;
        if (f14 != 0.5f) {
            aVar2.f143033i = f14;
        }
        int i14 = a.f151008a[this.f150973t0.ordinal()];
        if (i14 == 1) {
            aVar2.f143025e = 0;
        } else if (i14 == 2) {
            aVar2.f143025e = 1;
        } else {
            if (i14 != 3) {
                return;
            }
            aVar2.f143025e = 2;
        }
    }
}
