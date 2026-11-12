package a52;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lz42/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.data.repository.PushesRepositoryImpl$getDailyPushesSummary$2", f = "PushesRepositoryImpl.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<z42.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f1469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f1470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f1471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, DateTime dateTime, DateTime dateTime2, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f1469b = gVar;
        this.f1470c = dateTime;
        this.f1471d = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f1469b, this.f1470c, this.f1471d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<z42.a>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f1468a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        y42.a aVar2 = this.f1469b.f1480a;
        fz0.c cVarB = fz0.d.b(this.f1470c);
        fz0.c cVarB2 = fz0.d.b(this.f1471d);
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        i0<a0<z42.a>> i0VarC = aVar2.c(cVarB, cVarB2, fz0.d.b(dateTimeNow));
        this.f1468a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
