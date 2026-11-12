package fe2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultDataUploader$addTrackPoint$2", f = "DefaultDataUploader.kt", l = {202}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f70679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ae2.g f70680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var, ae2.g gVar, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f70679b = a0Var;
        this.f70680c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f70679b, this.f70680c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.util.ArrayList] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ae2.t tVar;
        Object next;
        ae2.r rVar;
        DateTime dateTime;
        int size;
        ae2.f fitnessPointData;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70678a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f70679b.f70591e.debug("addTrackPoint() " + this.f70680c);
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            a0 a0Var = this.f70679b;
            synchronized (a0Var.f70594h) {
                try {
                    if (!a0Var.f70594h.isEmpty()) {
                        r0Var.f105810a = new ArrayList(a0Var.f70594h);
                        a0Var.f70594h.clear();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            List list = (List) r0Var.f105810a;
            if (list != null && (!list.isEmpty())) {
                ae2.f fitnessPointData2 = this.f70680c.getFitnessPointData();
                if (fitnessPointData2 != null) {
                    fitnessPointData2.e((List) r0Var.f105810a);
                }
                List list2 = (List) r0Var.f105810a;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((ae2.t) next) instanceof ae2.t.a));
                    tVar = (ae2.t) next;
                } else {
                    tVar = null;
                }
                if (tVar != null) {
                    a0 a0Var2 = this.f70679b;
                    DateTime dateTime2 = this.f70680c.getDateTime();
                    this.f70678a = 1;
                    if (a0.c(a0Var2, dateTime2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        a0 a0Var3 = this.f70679b;
        synchronized (a0Var3.f70599m) {
            rVar = a0Var3.f70598l;
            Unit unit2 = Unit.INSTANCE;
        }
        ae2.f fitnessPointData3 = this.f70680c.getFitnessPointData();
        if (fitnessPointData3 != null) {
            fitnessPointData3.c(rVar);
        }
        a0 a0Var4 = this.f70679b;
        synchronized (a0Var4.f70601o) {
            DateTime dateTime3 = a0Var4.f70600n;
            dateTime = dateTime3 != null ? dateTime3 : null;
        }
        if (dateTime != null && (fitnessPointData = this.f70680c.getFitnessPointData()) != null) {
            fitnessPointData.b(new DateTime(dateTime));
        }
        a0 a0Var5 = this.f70679b;
        LinkedList linkedList = a0Var5.f70593g;
        ae2.g gVar = this.f70680c;
        synchronized (linkedList) {
            a0Var5.f70593g.add(gVar);
            size = a0Var5.f70593g.size();
        }
        a0 a0Var6 = this.f70679b;
        Object obj2 = a0Var6.f70597k;
        ae2.g gVar2 = this.f70680c;
        synchronized (obj2) {
            a0Var6.f70596j = gVar2;
        }
        this.f70679b.f70591e.debug("Added track point " + this.f70680c);
        u62.z.i("Point buffer size ", size, this.f70679b.f70591e);
        return Unit.INSTANCE;
    }
}
