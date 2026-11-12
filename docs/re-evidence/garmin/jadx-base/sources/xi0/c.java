package xi0;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o61.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lo61/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ftp.reports.data.repo.FtpRepositoryImpl$getLastPowerToWeightReport$2", f = "FtpRepositoryImpl.kt", l = {15}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<List<? extends h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f191115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f191116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f191117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f191118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, String str, fz0.c cVar, List<String> list, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f191115b = eVar;
        this.f191116c = str;
        this.f191117d = cVar;
        this.f191118e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f191115b, this.f191116c, this.f191117d, this.f191118e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends h>>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191114a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        vi0.a aVar2 = this.f191115b.f191126a;
        this.f191114a = 1;
        Object objB = aVar2.b(this.f191116c, this.f191117d, this.f191118e, this);
        return objB == aVar ? aVar : objB;
    }
}
