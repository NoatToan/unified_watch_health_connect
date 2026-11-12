package ir;

import am.w0;
import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lam/w0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.data.epic.EpicRepository$getEpicLifetimeStats$2", f = "EpicRepository.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<List<? extends w0>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f94747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f94748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f94749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f94750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, String str, String str2, List<String> list, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f94747b = eVar;
        this.f94748c = str;
        this.f94749d = str2;
        this.f94750e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f94747b, this.f94748c, this.f94749d, this.f94750e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends w0>>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94746a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b bVar = this.f94747b.f94756b;
        this.f94746a = 1;
        Object objA = bVar.a(this.f94748c, this.f94749d, false, this.f94750e, this);
        return objA == aVar ? aVar : objA;
    }
}
