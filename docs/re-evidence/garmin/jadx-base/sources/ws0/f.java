package ws0;

import b63.o;
import c83.a0;
import com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.model.LactateSummaryMeasurementsDTO;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.repo.LactateThresholdRepoImpl$getLactateThresholdSummaryReport$2", f = "LactateThresholdRepoImpl.kt", l = {103}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements l<t13.d<? super a0<LactateSummaryMeasurementsDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f186924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f186925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f186926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f186927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f186928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f186929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List<String> f186930h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, String str, String str2, o oVar, o oVar2, String str3, List<String> list, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f186924b = jVar;
        this.f186925c = str;
        this.f186926d = str2;
        this.f186927e = oVar;
        this.f186928f = oVar2;
        this.f186929g = str3;
        this.f186930h = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f186924b, this.f186925c, this.f186926d, this.f186927e, this.f186928f, this.f186929g, this.f186930h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<LactateSummaryMeasurementsDTO>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186923a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        us0.a aVar2 = this.f186924b.f186946a;
        fz0.c cVarA = fz0.d.a(this.f186927e);
        fz0.c cVarA2 = fz0.d.a(this.f186928f);
        this.f186923a = 1;
        Object objB = aVar2.b(this.f186925c, this.f186926d, cVarA, cVarA2, this.f186929g, this.f186930h, this);
        return objB == aVar ? aVar : objB;
    }
}
