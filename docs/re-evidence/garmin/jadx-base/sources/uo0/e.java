package uo0;

import c83.a0;
import e23.l;
import java.util.Set;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import u1.y1;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lvo0/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.here.api.HereRepositoryImpl$getReverseGeocodeResult$2", f = "HereRepositoryImpl.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class e extends i implements l<t13.d<? super a0<vo0.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f172102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f172103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f172104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set<g> f172105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Set<h> f172106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f172107g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(c cVar, double d14, double d15, Set<? extends g> set, Set<? extends h> set2, String str, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f172102b = cVar;
        this.f172103c = d14;
        this.f172104d = d15;
        this.f172105e = set;
        this.f172106f = set2;
        this.f172107g = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f172102b, this.f172103c, this.f172104d, this.f172105e, this.f172106f, this.f172107g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<vo0.f>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172101a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        int i15 = c.f172081c;
        c cVar = this.f172102b;
        cVar.getClass();
        String str = this.f172103c + "," + this.f172104d;
        Set<g> set = this.f172105e;
        String strK0 = set != null ? h0.k0(set, ",", null, null, new y1(18), 30) : null;
        Set<h> set2 = this.f172106f;
        c.C3209c c3209c = new c.C3209c(str, strK0, set2 != null ? h0.k0(set2, ",", null, null, new y1(17), 30) : null, this.f172107g);
        i0<a0<vo0.f>> i0VarA = cVar.f172083b.a("xd2FdRlwb0D_TDtOB79r0hYQFQAb6Fdgolo7Ne_6GvI", c3209c.f172089a, c3209c.f172090b, c3209c.f172091c, c3209c.f172092d);
        this.f172101a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
