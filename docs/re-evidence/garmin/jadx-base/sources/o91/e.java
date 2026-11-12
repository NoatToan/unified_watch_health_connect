package o91;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ln91/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.data.repo.PersonalRecordsRepositoryImpl$getPersonalRecordForActivity$2", f = "PersonalRecordsRepositoryImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements l<t13.d<? super a0<List<? extends n91.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f130982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f130983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f130984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f130985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, long j8, boolean z14, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f130983b = gVar;
        this.f130984c = j8;
        this.f130985d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f130983b, this.f130984c, this.f130985d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends n91.a>>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f130982a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        m91.a aVar2 = this.f130983b.f130989a;
        this.f130982a = 1;
        Object objI = aVar2.i(this.f130984c, this.f130985d, this);
        return objI == aVar ? aVar : objI;
    }
}
