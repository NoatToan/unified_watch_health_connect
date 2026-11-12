package vf0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Luf0/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.epoch.repo.EpochRepo$postEpochRequestAsync$2", f = "EpochRepo.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<d<? super a0<uf0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f177870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f177871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f177872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f177873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, String str2, d<? super b> dVar) {
        super(1, dVar);
        this.f177871b = aVar;
        this.f177872c = str;
        this.f177873d = str2;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new b(this.f177871b, this.f177872c, this.f177873d, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<uf0.b>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f177870a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<uf0.b>> i0VarA = this.f177871b.f177869a.a(this.f177872c, this.f177873d);
        this.f177870a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
