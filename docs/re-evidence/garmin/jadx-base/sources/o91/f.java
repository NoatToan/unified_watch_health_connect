package o91;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ln91/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.data.repo.PersonalRecordsRepositoryImpl$getPersonalRecordHistoryForType$2", f = "PersonalRecordsRepositoryImpl.kt", l = {44}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements l<t13.d<? super a0<List<? extends n91.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f130986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f130987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f130988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, long j8, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f130987b = gVar;
        this.f130988c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f130987b, this.f130988c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends n91.a>>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f130986a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        m91.a aVar2 = this.f130987b.f130989a;
        this.f130986a = 1;
        Object objH = aVar2.h(this.f130988c, true, true, this);
        return objH == aVar ? aVar : objH;
    }
}
