package w60;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lv60/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.cross_selling.repo.CrossSellingRepo$getProductAvailability$2", f = "CrossSellingRepo.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class a extends i implements l<t13.d<? super a0<v60.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f183120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t60.a f183121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f183122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f183123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, t60.a aVar, String str, String str2, t13.d<? super a> dVar2) {
        super(1, dVar2);
        this.f183120b = dVar;
        this.f183121c = aVar;
        this.f183122d = str;
        this.f183123e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a(this.f183120b, this.f183121c, this.f183122d, this.f183123e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<v60.c>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183119a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        u60.b bVar = this.f183120b.f183132b;
        String str = this.f183121c.f162703b;
        String str2 = this.f183122d;
        str2.getClass();
        i0<a0<v60.c>> i0VarA = bVar.a(str, str2, this.f183123e);
        this.f183119a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
