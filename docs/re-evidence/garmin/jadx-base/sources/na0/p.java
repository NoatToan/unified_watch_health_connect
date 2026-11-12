package na0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import gg1.o0;
import j23.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lna0/p;", "Landroidx/lifecycle/u1;", "Lgg1/o0;", "initialMeasurementSystem", "", "initialCircumferenceInMm", "<init>", "(Lgg1/o0;I)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f125161d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f125162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f125163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f125164c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125165a;

        static {
            int[] iArr = new int[o0.values().length];
            try {
                iArr[o0.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f125165a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgg1/o0;", "system", "", "circumferenceInMm", "Lna0/n;", "<anonymous>", "(Lgg1/o0;I)Lna0/n;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelCircumferenceViewModel$uiState$1", f = "BikeWheelCircumferenceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.q<o0, Integer, t13.d<? super n>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ o0 f125166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f125167b;

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(o0 o0Var, Integer num, t13.d<? super n> dVar) {
            int iIntValue = num.intValue();
            c cVar = p.this.new c(dVar);
            cVar.f125166a = o0Var;
            cVar.f125167b = iIntValue;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o0 o0Var = this.f125166a;
            int i14 = this.f125167b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i15 = p.f125161d;
            return new n(o0Var, i14, p.this.x4(o0Var, i14));
        }
    }

    static {
        new a(null);
    }

    public p(o0 o0Var, int i14) {
        o0Var.getClass();
        p2 p2VarA = q2.a(o0Var);
        this.f125162a = p2VarA;
        p2 p2VarA2 = q2.a(Integer.valueOf(i14));
        this.f125163b = p2VarA2;
        this.f125164c = r53.s.K(new r53.u1(p2VarA, p2VarA2, new c(null)), v1.a(this), k2.a.a(k2.f150703a, 2), q2.a(new n((o0) p2VarA.getValue(), ((Number) p2VarA2.getValue()).intValue(), x4((o0) p2VarA.getValue(), ((Number) p2VarA2.getValue()).intValue()))).getValue());
    }

    public final i53.f x4(o0 o0Var, int i14) {
        int iE;
        Integer numValueOf;
        if (b.f125165a[o0Var.ordinal()] == 1) {
            final i53.f fVarJ = i53.a.j(h0.b1(new j23.l(0, 9999)));
            int iIndexOf = fVarJ.indexOf(Integer.valueOf(i14));
            numValueOf = iIndexOf >= 0 ? Integer.valueOf(iIndexOf) : null;
            final int i15 = 0;
            return i53.a.a(new fb0.f(numValueOf != null ? numValueOf.intValue() : 0, fVarJ, Integer.valueOf(R.string.lbl_mm), new e23.l() { // from class: na0.o
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i15;
                    int iB = 2111;
                    p pVar = this;
                    i53.f fVar = fVarJ;
                    int iIntValue = ((Integer) obj).intValue();
                    switch (i16) {
                        case 0:
                            int i17 = p.f125161d;
                            Integer num = (Integer) h0.e0(iIntValue, fVar);
                            pVar.y4(num != null ? num.intValue() : 2111);
                            break;
                        default:
                            int i18 = p.f125161d;
                            Integer num2 = (Integer) h0.e0(iIntValue, fVar);
                            int iIntValue2 = num2 != null ? num2.intValue() : 83;
                            if (iIntValue2 != 83) {
                                l3.a aVar = l3.f23124b;
                                double d14 = iIntValue2;
                                m3 m3Var = m3.INCH;
                                m3 m3Var2 = m3.MILLIMETER;
                                aVar.getClass();
                                iB = MathKt.b(l3.a.g(d14, m3Var, m3Var2));
                            }
                            pVar.y4(iB);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        final i53.f fVarJ2 = i53.a.j(h0.b1(new j23.l(0, 393)));
        if (i14 == 2111) {
            iE = 83;
        } else {
            l3.a aVar = l3.f23124b;
            double d14 = i14;
            m3 m3Var = m3.MILLIMETER;
            m3 m3Var2 = m3.INCH;
            aVar.getClass();
            iE = t.e(MathKt.b(l3.a.g(d14, m3Var, m3Var2)), 0, 393);
        }
        int iIndexOf2 = fVarJ2.indexOf(Integer.valueOf(iE));
        numValueOf = iIndexOf2 >= 0 ? Integer.valueOf(iIndexOf2) : null;
        final int i16 = 1;
        return i53.a.a(new fb0.f(numValueOf != null ? numValueOf.intValue() : 0, fVarJ2, Integer.valueOf(R.string.lbl_inch), new e23.l() { // from class: na0.o
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                int iB = 2111;
                p pVar = this;
                i53.f fVar = fVarJ2;
                int iIntValue = ((Integer) obj).intValue();
                switch (i17) {
                    case 0:
                        int i18 = p.f125161d;
                        Integer num = (Integer) h0.e0(iIntValue, fVar);
                        pVar.y4(num != null ? num.intValue() : 2111);
                        break;
                    default:
                        int i19 = p.f125161d;
                        Integer num2 = (Integer) h0.e0(iIntValue, fVar);
                        int iIntValue2 = num2 != null ? num2.intValue() : 83;
                        if (iIntValue2 != 83) {
                            l3.a aVar2 = l3.f23124b;
                            double d15 = iIntValue2;
                            m3 m3Var3 = m3.INCH;
                            m3 m3Var4 = m3.MILLIMETER;
                            aVar2.getClass();
                            iB = MathKt.b(l3.a.g(d15, m3Var3, m3Var4));
                        }
                        pVar.y4(iB);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    public final void y4(int i14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f125163b;
            value = p2Var.getValue();
            ((Number) value).intValue();
        } while (!p2Var.b(value, Integer.valueOf(i14)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lna0/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
