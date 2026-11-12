package ig0;

import c83.a0;
import e23.l;
import fg0.o;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lfg0/o;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.network.eventsearch.eventsearch.EventSearchRepo$getVirtualEvents$2", f = "EventSearchRepo.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class h extends i implements l<t13.d<? super a0<List<? extends o>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f93266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f93267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f93268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f93269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f93270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f93271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Double f93272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Double f93273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String[] f93274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f93275k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, String str, String str2, String str3, String str4, String str5, Double d14, Double d15, String[] strArr, boolean z14, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f93266b = bVar;
        this.f93267c = str;
        this.f93268d = str2;
        this.f93269e = str3;
        this.f93270f = str4;
        this.f93271g = str5;
        this.f93272h = d14;
        this.f93273i = d15;
        this.f93274j = strArr;
        this.f93275k = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f93266b, this.f93267c, this.f93268d, this.f93269e, this.f93270f, this.f93271g, this.f93272h, this.f93273i, this.f93274j, this.f93275k, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends o>>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93265a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        a aVar2 = this.f93266b.f93238a;
        Double d14 = this.f93272h;
        Integer num = d14 != null ? new Integer((int) d14.doubleValue()) : null;
        Double d15 = this.f93273i;
        i0<a0<List<o>>> i0VarE = aVar2.e(this.f93267c, this.f93268d, this.f93269e, this.f93270f, false, true, this.f93271g, num, d15 != null ? new Integer((int) d15.doubleValue()) : null, this.f93274j, 100, true, null, this.f93275k);
        this.f93265a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
