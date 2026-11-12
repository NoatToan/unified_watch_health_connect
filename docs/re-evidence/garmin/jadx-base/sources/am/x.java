package am;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityMapDetails$2", f = "ActivityRepo.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super c83.a0<ps.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<qs.x> f4261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f4262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(List<? extends qs.x> list, m mVar, long j8, int i14, int i15, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f4261b = list;
        this.f4262c = mVar;
        this.f4263d = j8;
        this.f4264e = i14;
        this.f4265f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f4261b, this.f4262c, this.f4263d, this.f4264e, this.f4265f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ps.k>> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<String> listB1;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4260a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        List<qs.x> list = this.f4261b;
        if (list == null || list.isEmpty()) {
            listB1 = null;
        } else {
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((qs.x) it.next()).name());
            }
            listB1 = p13.h0.b1(arrayList);
        }
        o53.i0<c83.a0<ps.k>> i0VarH = this.f4262c.f4069a.h(this.f4263d, new Integer(this.f4264e), new Integer(this.f4265f), listB1);
        this.f4260a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
