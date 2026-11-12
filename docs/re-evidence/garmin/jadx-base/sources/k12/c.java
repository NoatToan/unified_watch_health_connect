package k12;

import o53.i0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lpu/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.SsoRepo$getUserLoginToken$2", f = "SsoRepo.kt", l = {26, 36}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super c83.a0<pu.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f102309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f102310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f102311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f102312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str, String str2, String str3, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f102309b = bVar;
        this.f102310c = str;
        this.f102311d = str2;
        this.f102312e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f102309b, this.f102310c, this.f102311d, this.f102312e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<pu.k>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102308a;
        if (i14 == 0) {
            o13.r.b(obj);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            this.f102308a = 1;
            obj = bVar.w(this);
            if (obj != aVar) {
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<pu.k>> i0VarA = this.f102309b.f102304a.a("4", "GarminConnectMobileAndroid", this.f102310c, (String) obj, this.f102311d, this.f102312e);
        this.f102308a = 2;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
