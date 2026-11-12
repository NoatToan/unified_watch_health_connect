package o91;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ln91/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.data.repo.PersonalRecordsRepositoryImpl$updatePersonalRecordType$2", f = "PersonalRecordsRepositoryImpl.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements l<t13.d<? super a0<n91.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f130999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f131000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n91.b f131001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, n91.b bVar, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f131000b = gVar;
        this.f131001c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f131000b, this.f131001c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<n91.b>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f130999a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        m91.a aVar2 = this.f131000b.f130989a;
        n91.b bVar = this.f131001c;
        long j8 = bVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
        this.f130999a = 1;
        Object objD = aVar2.d(j8, bVar, this);
        return objD == aVar ? aVar : objD;
    }
}
