package f11;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p13.h0;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import v01.c0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lf11/a;", "Landroidx/lifecycle/u1;", "Lf11/a$b;", "mode", "Lv01/c0;", "getCustomFoodDetailsUseCase", "Lv01/e;", "createFoodUseCase", "<init>", "(Lf11/a$b;Lv01/c0;Lv01/e;)V", "b", "c", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f67881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f67882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v01.e f67883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f67884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f67885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f67886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f67887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f67888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f67889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f67890j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf11/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        LOADED,
        LOAD_FAILED,
        LOADING,
        ERROR,
        SAVED
    }

    static {
        new C1409a(null);
    }

    public a(b bVar, c0 c0Var, v01.e eVar) {
        bVar.getClass();
        c0Var.getClass();
        eVar.getClass();
        this.f67881a = bVar;
        this.f67882b = c0Var;
        this.f67883c = eVar;
        p2 p2VarA = q2.a(null);
        this.f67884d = p2VarA;
        this.f67885e = s.d(p2VarA);
        p2 p2VarA2 = q2.a(j53.l.b());
        this.f67886f = p2VarA2;
        this.f67887g = s.d(p2VarA2);
        p2 p2VarA3 = q2.a(c.LOADING);
        this.f67888h = p2VarA3;
        this.f67889i = s.d(p2VarA3);
        ge1.b.T(v1.a(this), null, null, new f11.b(this, null), 3);
    }

    public final void x4(v01.c cVar) {
        p2 p2Var = this.f67886f;
        p2Var.setValue(i53.a.j(h0.y0((Iterable) p2Var.getValue(), cVar)));
    }

    public final void y4(b11.f fVar) {
        d11.c cVar;
        p2 p2Var = this.f67884d;
        d11.a aVar = (d11.a) p2Var.getValue();
        if (aVar == null || (cVar = aVar.f57040a) == null) {
            return;
        }
        d11.c cVarA = d11.c.a(cVar, null, null, null, null, null, null, fVar, 447);
        d11.a aVar2 = (d11.a) p2Var.getValue();
        p2Var.setValue(aVar2 != null ? d11.a.a(aVar2, cVarA, null, 14) : null);
        if (fVar.f14266a != null) {
            x4(v01.c.MISSING_CALORIES);
        }
    }

    /* JADX INFO: renamed from: f11.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf11/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1409a {
        public /* synthetic */ C1409a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1409a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lf11/a$b;", "", "<init>", "()V", "a", "b", "Lf11/a$b$a;", "Lf11/a$b$b;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: f11.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf11/a$b$a;", "Lf11/a$b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1410a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1410a f67891a = new C1410a();

            private C1410a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1410a);
            }

            public final int hashCode() {
                return 983241754;
            }

            public final String toString() {
                return "Add";
            }
        }

        /* JADX INFO: renamed from: f11.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf11/a$b$b;", "Lf11/a$b;", "", "foodId", "<init>", "(Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1411b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f67892a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1411b(String str) {
                super(null);
                str.getClass();
                this.f67892a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1411b) && p005kotlin.jvm.internal.s.g(this.f67892a, ((C1411b) obj).f67892a);
            }

            public final int hashCode() {
                return this.f67892a.hashCode();
            }

            public final String toString() {
                return am.j.m("Edit(foodId=", this.f67892a, ")");
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
