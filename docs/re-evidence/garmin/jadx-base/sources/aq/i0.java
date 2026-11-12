package aq;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Laq/i0;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends androidx.lifecycle.u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11990a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11991b = R.string.lbl_edit_multi_exercise_mixed;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11992c = "MixedExerciseName";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f11993d = -1.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11994e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.y0<Object> f11995f = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.y0<Object> f11996g = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.y0<Object> f11997h = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.y0<Object> f11998i = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.lifecycle.y0<Boolean> f11999j = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f12000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Double f12001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Long f12002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Double f12003n;

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void x4(List<x> list) {
        Object objValueOf;
        Object objValueOf2;
        this.f12000k = null;
        this.f12001l = null;
        this.f12002m = null;
        this.f12003n = null;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((x) it.next()).f12286b.f41117g;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        List listB1 = p13.h0.b1(p13.h0.f1(arrayList));
        int size = listB1.size();
        String str2 = this.f11992c;
        this.f12000k = size == 1 ? (String) p13.h0.b0(listB1) : str2;
        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it3 = list.iterator();
        while (true) {
            double dDoubleValue = 0.0d;
            if (!it3.hasNext()) {
                break;
            }
            Double D = ((x) it3.next()).f12286b.D();
            if (D != null) {
                dDoubleValue = D.doubleValue();
            }
            arrayList2.add(Double.valueOf(Math.rint(dDoubleValue)));
        }
        List listB2 = p13.h0.b1(p13.h0.f1(arrayList2));
        int size2 = listB2.size();
        double d14 = this.f11993d;
        this.f12001l = size2 == 1 ? (Double) p13.h0.b0(listB2) : Double.valueOf(d14);
        ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it4 = list.iterator();
        while (true) {
            long jLongValue = -2;
            if (!it4.hasNext()) {
                break;
            }
            Long lH = ((x) it4.next()).f12286b.H();
            if (lH != null) {
                jLongValue = lH.longValue();
            }
            arrayList3.add(Long.valueOf(jLongValue));
        }
        List listB3 = p13.h0.b1(p13.h0.f1(arrayList3));
        int size3 = listB3.size();
        long j8 = this.f11994e;
        this.f12002m = size3 == 1 ? (Long) p13.h0.b0(listB3) : Long.valueOf(j8);
        ArrayList arrayList4 = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList4.add(Double.valueOf(ss.f.a(((x) it5.next()).f12286b.Z())));
        }
        List listB4 = p13.h0.b1(p13.h0.f1(arrayList4));
        boolean z14 = listB4.size() > 1;
        Double dValueOf = (Double) p13.h0.d0(listB4);
        if (dValueOf == null) {
            dValueOf = Double.valueOf(0.0d);
        }
        this.f12003n = dValueOf;
        String str3 = this.f12000k;
        int i14 = this.f11991b;
        if (str3 == null || d53.w.J(str3)) {
            objValueOf = Integer.valueOf(R.string.lbl_unknown);
        } else if (str3.equals(str2)) {
            objValueOf = str3;
            objValueOf = Integer.valueOf(i14);
        }
        objValueOf = str3;
        androidx.lifecycle.y0<Object> y0Var = this.f11995f;
        if (!p005kotlin.jvm.internal.s.g(y0Var.d(), objValueOf)) {
            y0Var.j(objValueOf);
        }
        Double d15 = this.f12001l;
        Object objValueOf3 = Integer.valueOf(R.string.no_duration_value);
        if (p005kotlin.jvm.internal.s.c(d15, d14)) {
            objValueOf3 = Integer.valueOf(i14);
        } else if (d15 != null && !p005kotlin.jvm.internal.s.c(d15, 0.0d)) {
            c22.l3.a aVar = c22.l3.f23124b;
            long jD = MathKt.d(d15.doubleValue());
            aVar.getClass();
            String strE1 = c22.l3.a.e1(jD);
            if (strE1 != null) {
                objValueOf3 = strE1;
            }
        }
        androidx.lifecycle.y0<Object> y0Var2 = this.f11996g;
        if (!p005kotlin.jvm.internal.s.g(y0Var2.d(), objValueOf3)) {
            y0Var2.j(objValueOf3);
        }
        Long l14 = this.f12002m;
        if (l14 != null && l14.longValue() == j8) {
            objValueOf2 = Integer.valueOf(i14);
        } else {
            objValueOf2 = (l14 == null || l14.longValue() == -2) ? Integer.valueOf(R.string.no_value) : String.valueOf(l14.longValue());
        }
        androidx.lifecycle.y0<Object> y0Var3 = this.f11997h;
        if (!p005kotlin.jvm.internal.s.g(y0Var3.d(), objValueOf2)) {
            y0Var3.j(objValueOf2);
        }
        Double d16 = this.f12003n;
        Object objValueOf4 = z14 ? Integer.valueOf(i14) : ss.f.d(d16, p005kotlin.jvm.internal.s.c(d16, -1.0d), true);
        androidx.lifecycle.y0<Object> y0Var4 = this.f11998i;
        if (p005kotlin.jvm.internal.s.g(y0Var4.d(), objValueOf4)) {
            return;
        }
        y0Var4.j(objValueOf4);
    }
}
