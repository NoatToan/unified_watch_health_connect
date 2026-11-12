package wn1;

import androidx.lifecycle.u1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwn1/g;", "Landroidx/lifecycle/u1;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f186220c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.l f186222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f186223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f186224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f12.l f186225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f186226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f186227j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f186218a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f186219b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f186221d = true;

    public g() {
        final int i14 = 0;
        this.f186223f = o13.m.b(new e23.a(this) { // from class: wn1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f186213b;

            {
                this.f186213b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return Boolean.valueOf(u0.n(this.f186213b.f186220c, u0.S5));
                    default:
                        return Integer.valueOf(this.f186213b.x4() ? 5 : 4);
                }
            }
        });
        final int i15 = 1;
        this.f186224g = o13.m.b(new e23.a(this) { // from class: wn1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f186213b;

            {
                this.f186213b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return Boolean.valueOf(u0.n(this.f186213b.f186220c, u0.S5));
                    default:
                        return Integer.valueOf(this.f186213b.x4() ? 5 : 4);
                }
            }
        });
        f12.l.f68084a.getClass();
        f12.l lVarA = f12.l.a.a();
        this.f186225h = lVarA;
        p2 p2VarA = q2.a(new d(((k0) KoinJavaComponent.get$default(k0.class, null, null, 6, null)).b(this.f186218a), lVarA.w(), Float.valueOf(lVarA.t()), Double.valueOf(lVarA.v3()), lVarA.l1(), Integer.valueOf(lVarA.e2())));
        this.f186226i = p2VarA;
        this.f186227j = p2VarA;
    }

    public final boolean x4() {
        return ((Boolean) this.f186223f.getValue()).booleanValue();
    }

    public final void y4(String str) {
        str.getClass();
        ((k0) KoinJavaComponent.get$default(k0.class, null, null, 6, null)).d(this.f186218a, str);
        while (true) {
            p2 p2Var = this.f186226i;
            Object value = p2Var.getValue();
            String str2 = str;
            if (p2Var.b(value, d.a((d) value, str2, null, null, null, null, null, 62))) {
                return;
            } else {
                str = str2;
            }
        }
    }
}
