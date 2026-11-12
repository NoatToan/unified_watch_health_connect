package a3;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p3.a4;
import p3.c2;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"La3/t;", "", "Lo4/d0;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "", "isLight", "<init>", "(JJJJJJJJJJJJZLkotlin/jvm/internal/j;)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c2 f827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c2 f828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c2 f829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c2 f830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c2 f832m;

    private t(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, boolean z14) {
        o4.d0 d0VarA = o4.d0.a(j8);
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        this.f820a = new c2(d0VarA, a4Var);
        this.f821b = new c2(o4.d0.a(j14), a4Var);
        this.f822c = new c2(o4.d0.a(j15), a4Var);
        this.f823d = new c2(o4.d0.a(j16), a4Var);
        this.f824e = new c2(o4.d0.a(j17), a4Var);
        this.f825f = new c2(o4.d0.a(j18), a4Var);
        this.f826g = new c2(o4.d0.a(j19), a4Var);
        this.f827h = new c2(o4.d0.a(j24), a4Var);
        this.f828i = new c2(o4.d0.a(j25), a4Var);
        this.f829j = new c2(o4.d0.a(j26), a4Var);
        this.f830k = new c2(o4.d0.a(j27), a4Var);
        this.f831l = new c2(o4.d0.a(j28), a4Var);
        this.f832m = new c2(Boolean.valueOf(z14), a4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        return ((o4.d0) this.f820a.getF182175a()).f128833a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((o4.d0) this.f825f.getF182175a()).f128833a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.f832m.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Colors(primary=");
        sb3.append((Object) o4.d0.j(a()));
        sb3.append(", primaryVariant=");
        q2.m(((o4.d0) this.f821b.getF182175a()).f128833a, ", secondary=", sb3);
        q2.m(((o4.d0) this.f822c.getF182175a()).f128833a, ", secondaryVariant=", sb3);
        q2.m(((o4.d0) this.f823d.getF182175a()).f128833a, ", background=", sb3);
        sb3.append((Object) o4.d0.j(((o4.d0) this.f824e.getF182175a()).f128833a));
        sb3.append(", surface=");
        sb3.append((Object) o4.d0.j(b()));
        sb3.append(", error=");
        q2.m(((o4.d0) this.f826g.getF182175a()).f128833a, ", onPrimary=", sb3);
        q2.m(((o4.d0) this.f827h.getF182175a()).f128833a, ", onSecondary=", sb3);
        q2.m(((o4.d0) this.f828i.getF182175a()).f128833a, ", onBackground=", sb3);
        q2.m(((o4.d0) this.f829j.getF182175a()).f128833a, ", onSurface=", sb3);
        q2.m(((o4.d0) this.f830k.getF182175a()).f128833a, ", onError=", sb3);
        sb3.append((Object) o4.d0.j(((o4.d0) this.f831l.getF182175a()).f128833a));
        sb3.append(", isLight=");
        sb3.append(c());
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ t(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28, z14);
    }
}
