package a52;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import z42.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lz42/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.data.repository.PushesRepositoryImpl$getWeeklyPushesSummary$2", f = "PushesRepositoryImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<List<? extends j>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f1477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f1478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, DateTime dateTime, int i14, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f1477b = gVar;
        this.f1478c = dateTime;
        this.f1479d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f1477b, this.f1478c, this.f1479d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends j>>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f1476a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<j>>> i0VarA = this.f1477b.f1480a.a(fz0.d.b(this.f1478c), this.f1479d);
        this.f1476a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
