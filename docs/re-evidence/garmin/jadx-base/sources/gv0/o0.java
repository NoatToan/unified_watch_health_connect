package gv0;

import com.garmin.android.apps.connectmobile.g3;
import java.util.Collection;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f79350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f79351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f79352d;

    public /* synthetic */ o0(e23.a aVar, p1 p1Var, p1 p1Var2, int i14) {
        this.f79349a = i14;
        this.f79352d = aVar;
        this.f79350b = p1Var;
        this.f79351c = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f79349a) {
            case 0:
                Collection collection = (Collection) ((g3) this.f79350b.getF182175a()).f35301b;
                if (collection == null || collection.isEmpty()) {
                    this.f79351c.setValue(Boolean.TRUE);
                } else {
                    this.f79352d.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                return new h2.w((e23.r) this.f79350b.getF182175a(), (e23.l) this.f79351c.getF182175a(), ((Number) this.f79352d.invoke()).intValue());
            case 2:
                if (d53.w.J((CharSequence) this.f79350b.getF182175a())) {
                    this.f79352d.invoke();
                } else {
                    this.f79351c.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 3:
                this.f79350b.setValue("");
                this.f79351c.setValue(Boolean.FALSE);
                this.f79352d.invoke();
                return Unit.INSTANCE;
            case 4:
                if (d53.w.J((CharSequence) this.f79350b.getF182175a())) {
                    this.f79352d.invoke();
                } else {
                    this.f79351c.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 5:
                this.f79350b.setValue("");
                this.f79351c.setValue(Boolean.FALSE);
                this.f79352d.invoke();
                return Unit.INSTANCE;
            case 6:
                jl1.d dVar = (jl1.d) this.f79350b.getF182175a();
                if (p005kotlin.jvm.internal.s.g(dVar.f99482e, dVar.f99481d)) {
                    this.f79352d.invoke();
                } else {
                    this.f79351c.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 7:
                this.f79350b.setValue("");
                this.f79351c.setValue(null);
                this.f79352d.invoke();
                return Unit.INSTANCE;
            case 8:
                this.f79350b.setValue(this.f79351c.getF182175a());
                this.f79352d.invoke();
                return Unit.INSTANCE;
            default:
                if (((Collection) this.f79350b.getF182175a()).size() >= 50) {
                    this.f79351c.setValue(Boolean.TRUE);
                } else {
                    this.f79352d.invoke();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o0(p1 p1Var, e23.a aVar, p1 p1Var2, int i14) {
        this.f79349a = i14;
        this.f79350b = p1Var;
        this.f79352d = aVar;
        this.f79351c = p1Var2;
    }

    public /* synthetic */ o0(p1 p1Var, p1 p1Var2, e23.a aVar, int i14) {
        this.f79349a = i14;
        this.f79350b = p1Var;
        this.f79351c = p1Var2;
        this.f79352d = aVar;
    }
}
