package iw;

import c83.a0;
import com.garmin.android.apps.connectmobile.settings.model.AutoActivityDetectDTO;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/settings/model/AutoActivityDetectDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.biz.repo.PersonalPrefsRepo$getDefaultAutoActivityValue$2", f = "PersonalPrefsRepo.kt", l = {13}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements l<t13.d<? super a0<AutoActivityDetectDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f95267b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f95267b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f95267b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<AutoActivityDetectDTO>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95266a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<AutoActivityDetectDTO>> i0VarD = this.f95267b.f95263a.d();
        this.f95266a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
