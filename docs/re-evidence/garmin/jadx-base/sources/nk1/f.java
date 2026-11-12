package nk1;

import c83.a0;
import com.garmin.android.apps.connectmobile.settings.model.Office365SettingDTO;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.repo.Office365Repo$setOffice365Settings$2", f = "Office365Repo.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.l<t13.d<? super a0<Office365SettingDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f126419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hk1.m f126420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, hk1.m mVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f126419b = aVar;
        this.f126420c = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f126419b, this.f126420c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Office365SettingDTO>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126418a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Office365SettingDTO>> i0VarE = this.f126419b.f126408a.e(this.f126420c);
        this.f126418a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
