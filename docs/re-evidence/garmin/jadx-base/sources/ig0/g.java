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
@v13.e(c = "com.garmin.android.apps.connectmobile.events.network.eventsearch.eventsearch.EventSearchRepo$getInPersonEvents$2", f = "EventSearchRepo.kt", l = {44}, m = "invokeSuspend", v = 2)
public final class g extends i implements l<t13.d<? super a0<List<? extends o>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f93252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f93253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f93254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f93255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f93256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Double f93257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Double f93258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f93259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f93260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Double f93261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Double f93262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String[] f93263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f93264n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, String str, String str2, String str3, String str4, Double d14, Double d15, Integer num, String str5, Double d16, Double d17, String[] strArr, boolean z14, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f93252b = bVar;
        this.f93253c = str;
        this.f93254d = str2;
        this.f93255e = str3;
        this.f93256f = str4;
        this.f93257g = d14;
        this.f93258h = d15;
        this.f93259i = num;
        this.f93260j = str5;
        this.f93261k = d16;
        this.f93262l = d17;
        this.f93263m = strArr;
        this.f93264n = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f93252b, this.f93253c, this.f93254d, this.f93255e, this.f93256f, this.f93257g, this.f93258h, this.f93259i, this.f93260j, this.f93261k, this.f93262l, this.f93263m, this.f93264n, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends o>>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93251a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        a aVar2 = this.f93252b.f93238a;
        Double d14 = this.f93261k;
        Integer num = d14 != null ? new Integer((int) d14.doubleValue()) : null;
        Double d15 = this.f93262l;
        i0<a0<List<o>>> i0VarD = aVar2.d(this.f93253c, this.f93254d, this.f93255e, this.f93256f, this.f93257g, this.f93258h, this.f93259i, true, false, this.f93260j, num, d15 != null ? new Integer((int) d15.doubleValue()) : null, this.f93263m, 100, true, null, this.f93264n);
        this.f93251a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
