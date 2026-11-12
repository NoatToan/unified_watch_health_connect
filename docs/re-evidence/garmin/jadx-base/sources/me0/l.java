package me0;

import c83.a0;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lje0/i;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$getBulkDogProfileStats$2", f = "DogsRepository.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super a0<List<? extends je0.i>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f118026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f118027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<Long> f118028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w wVar, DateTime dateTime, DateTime dateTime2, List<Long> list, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f118025b = wVar;
        this.f118026c = dateTime;
        this.f118027d = dateTime2;
        this.f118028e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f118025b, this.f118026c, this.f118027d, this.f118028e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends je0.i>>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118024a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ke0.a aVarA = w.a(this.f118025b);
        DateTime dateTime = this.f118026c;
        fz0.e eVar = dateTime != null ? new fz0.e(dateTime) : null;
        DateTime dateTime2 = this.f118027d;
        fz0.e eVar2 = dateTime2 != null ? new fz0.e(dateTime2) : null;
        this.f118024a = 1;
        Object objD = aVarA.d(eVar, eVar2, this.f118028e, this);
        return objD == aVar ? aVar : objD;
    }
}
