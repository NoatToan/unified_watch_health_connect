package r6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i extends d {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151007a;

        static {
            int[] iArr = new int[q6.g.a.values().length];
            f151007a = iArr;
            try {
                iArr[q6.g.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f151007a[q6.g.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f151007a[q6.g.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(q6.g gVar) {
        super(gVar, q6.g.d.HORIZONTAL_CHAIN);
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
                gVar.c(it.next()).g();
            }
        }
        q6.a aVar = null;
        q6.a aVar2 = null;
        for (Object obj : arrayList) {
            q6.a aVarC = gVar.c(obj);
            if (aVar2 == null) {
                Object obj2 = this.N;
                if (obj2 != null) {
                    aVarC.o(obj2);
                    aVarC.k(this.f143038l).m(this.f143044r);
                } else {
                    Object obj3 = this.O;
                    if (obj3 != null) {
                        aVarC.getClass();
                        aVarC.f143024d0 = q6.g.b.START_TO_END;
                        aVarC.O = obj3;
                        aVarC.k(this.f143038l).m(this.f143044r);
                    } else {
                        Object obj4 = this.J;
                        if (obj4 != null) {
                            aVarC.o(obj4);
                            aVarC.k(this.f143035j).m(this.f143042p);
                        } else {
                            Object obj5 = this.K;
                            if (obj5 != null) {
                                aVarC.getClass();
                                aVarC.f143024d0 = q6.g.b.START_TO_END;
                                aVarC.O = obj5;
                                aVarC.k(this.f143035j).m(this.f143042p);
                            } else {
                                String string = aVarC.f143017a.toString();
                                aVarC.o(0);
                                aVarC.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                            }
                        }
                    }
                }
                aVar2 = aVarC;
            }
            if (aVar != null) {
                String string2 = aVar.f143017a.toString();
                String string3 = aVarC.f143017a.toString();
                Object obj6 = aVarC.f143017a;
                aVar.f143024d0 = q6.g.b.END_TO_START;
                aVar.P = obj6;
                aVar.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj7 = aVar.f143017a;
                aVarC.f143024d0 = q6.g.b.START_TO_END;
                aVarC.O = obj7;
                aVarC.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = obj.toString();
            HashMap<String, Float> map = this.f150968o0;
            float fFloatValue = map.containsKey(string4) ? map.get(string4).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                aVarC.f143027f = fFloatValue;
            }
            aVar = aVarC;
        }
        if (aVar != null) {
            Object obj8 = this.P;
            if (obj8 != null) {
                aVar.f143024d0 = q6.g.b.END_TO_START;
                aVar.P = obj8;
                aVar.k(this.f143039m).m(this.f143045s);
            } else {
                Object obj9 = this.Q;
                if (obj9 != null) {
                    aVar.i(obj9);
                    aVar.k(this.f143039m).m(this.f143045s);
                } else {
                    Object obj10 = this.L;
                    if (obj10 != null) {
                        aVar.f143024d0 = q6.g.b.END_TO_START;
                        aVar.P = obj10;
                        aVar.k(this.f143037k).m(this.f143043q);
                    } else {
                        Object obj11 = this.M;
                        if (obj11 != null) {
                            aVar.i(obj11);
                            aVar.k(this.f143037k).m(this.f143043q);
                        } else {
                            String string5 = aVar.f143017a.toString();
                            aVar.i(0);
                            aVar.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                        }
                    }
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f14 = this.f150967n0;
        if (f14 != 0.5f) {
            aVar2.f143031h = f14;
        }
        int i14 = a.f151007a[this.f150973t0.ordinal()];
        if (i14 == 1) {
            aVar2.f143023d = 0;
        } else if (i14 == 2) {
            aVar2.f143023d = 1;
        } else {
            if (i14 != 3) {
                return;
            }
            aVar2.f143023d = 2;
        }
    }
}
