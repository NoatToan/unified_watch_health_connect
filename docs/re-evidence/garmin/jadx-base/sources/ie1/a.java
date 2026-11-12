package ie1;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import gl1.d;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.d0;
import p13.j0;
import p13.x;
import qz.c;
import xz.f;
import xz.g;
import zx0.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lie1/a;", "Lqz/c;", "Lge1/a;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<ge1.a, IBarLineScatterCandleBubbleDataSet<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f93095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke1.a f93096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je1.a f93097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final he1.a f93098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f93099e;

    static {
        new C1783a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f93095a = context;
        this.f93096b = new ke1.a(context);
        this.f93097c = new je1.a(context);
        this.f93098d = new he1.a(context);
        this.f93099e = new ArrayList();
    }

    @Override // qz.c
    public final List<IBarLineScatterCandleBubbleDataSet<?>> a(ge1.a aVar) {
        ge1.a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        ge1.c cVar = ge1.c.HIGH_LOW_RATES;
        ArrayList arrayList2 = this.f93099e;
        if (arrayList2.contains(cVar)) {
            arrayList.addAll(this.f93097c.a(aVar2));
        }
        if (arrayList2.contains(ge1.c.ACTIVE)) {
            arrayList.addAll(this.f93098d.a(aVar2));
        }
        arrayList.addAll(this.f93096b.a(aVar2));
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(ge1.a aVar) {
        return Integer.valueOf(MathKt.c(1472.0f));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(ge1.a aVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(ge1.a aVar) {
        return -16.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final List f(ge1.a aVar) {
        ge1.a aVar2 = aVar;
        boolean zG = d.G(aVar2);
        ke1.a aVar3 = this.f93096b;
        je1.a aVar4 = this.f93097c;
        float fT = zG ? aVar4.t(aVar2) : aVar3.t(aVar2);
        float fFloatValue = 24.0f;
        if (d.G(aVar2)) {
            aVar4.getClass();
            if (d.G(aVar2)) {
                fFloatValue = ((Number) je1.a.A(aVar2).f128595b).floatValue();
            }
        } else {
            aVar3.getClass();
            if (d.G(aVar2)) {
                fFloatValue = ((Number) ke1.a.A(aVar2).f128595b).floatValue();
            }
        }
        float f14 = (fFloatValue - fT) / 4;
        return x.k(x((int) fT), x((int) (fT + f14)), x((int) ((2 * f14) + fT)), x((int) ((3 * f14) + fT)), x((int) fFloatValue));
    }

    @Override // qz.c
    public final List g(ge1.a aVar) {
        ge1.a aVar2 = aVar;
        return m.g(this.f93096b.f104540a, aVar2 != null ? aVar2.f76998f : null, new kb0.d(15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float i(ge1.a aVar) {
        ge1.a aVar2 = aVar;
        if (d.G(aVar2)) {
            this.f93097c.getClass();
            if (d.G(aVar2)) {
                return ((Number) je1.a.A(aVar2).f128595b).floatValue();
            }
            return 24.0f;
        }
        this.f93096b.getClass();
        if (d.G(aVar2)) {
            return ((Number) ke1.a.A(aVar2).f128595b).floatValue();
        }
        return 24.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(ge1.a aVar) {
        return 5;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(ge1.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final void n(Object... objArr) {
        ArrayList arrayList = this.f93099e;
        arrayList.clear();
        d0.w(arrayList, objArr);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(ge1.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(ge1.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(ge1.a aVar) {
        return 1456.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(ge1.a aVar) {
        return null;
    }

    @Override // qz.c
    public final float t(ge1.a aVar) {
        ge1.a aVar2 = aVar;
        if (d.F(aVar2)) {
            return this.f93098d.t(aVar2);
        }
        return d.G(aVar2) ? this.f93097c.t(aVar2) : this.f93096b.t(aVar2);
    }

    @Override // qz.c
    public final List u(ge1.a aVar) {
        ge1.a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f93096b.u(aVar2));
        ge1.c cVar = ge1.c.HIGH_LOW_RATES;
        ArrayList arrayList2 = this.f93099e;
        arrayList.addAll((arrayList2.contains(cVar) && d.G(aVar2)) ? this.f93097c.u(aVar2) : j0.f134944a);
        arrayList.addAll((arrayList2.contains(ge1.c.ACTIVE) && d.F(aVar2)) ? this.f93098d.u(aVar2) : j0.f134944a);
        if (aVar2 != null && !aVar2.f76997e.isEmpty() && !aVar2.f76993a.isEmpty()) {
            Context context = this.f93095a;
            String string = context.getString(R.string.allday_stress_unmeasurable);
            string.getClass();
            arrayList.add(new f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm3_stress_unmeasurable)), null, g.h.f192753a, null, null, 106, null));
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(ge1.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(ge1.a aVar) {
        return 0.0f;
    }

    public final LimitLine x(int i14) {
        LimitLine limitLine = new LimitLine(i14, String.valueOf(i14));
        limitLine.setLineWidth(1.0f);
        rz.a.f155189g.getClass();
        int i15 = rz.a.f155190h;
        Context context = this.f93095a;
        limitLine.setLineColor(a7.b.getColor(context, i15));
        limitLine.setTextColor(a7.b.getColor(context, rz.a.f155191i));
        limitLine.setTextSize(10.0f);
        limitLine.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
        return limitLine;
    }

    /* JADX INFO: renamed from: ie1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lie1/a$a;", "", "<init>", "()V", "", "X_AXIS_MARGIN", "F", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1783a {
        public /* synthetic */ C1783a(j jVar) {
            this();
        }

        private C1783a() {
        }
    }
}
