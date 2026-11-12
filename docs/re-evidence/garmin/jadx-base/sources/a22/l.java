package a22;

import c83.a0;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lj12/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.repo.UserRepo$updateProfileWithoutPhoto$2", f = "UserRepo.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super a0<List<? extends j12.h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.model.h f571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, String str, com.garmin.android.apps.connectmobile.userprofile.model.h hVar, String str2, String str3, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f569b = jVar;
        this.f570c = str;
        this.f571d = hVar;
        this.f572e = str2;
        this.f573f = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f569b, this.f570c, this.f571d, this.f572e, this.f573f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends j12.h>>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f568a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        e eVar = this.f569b.f561a;
        com.garmin.android.apps.connectmobile.userprofile.model.h hVar = com.garmin.android.apps.connectmobile.userprofile.model.h.CONNECT_AVATAR;
        com.garmin.android.apps.connectmobile.userprofile.model.h hVar2 = this.f571d;
        i0<a0<List<j12.h>>> i0VarA = eVar.a(this.f570c, hVar2 == hVar, hVar2, this.f572e, this.f573f);
        this.f568a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
