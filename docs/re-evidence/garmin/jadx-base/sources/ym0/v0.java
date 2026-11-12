package ym0;

import com.garmin.android.apps.connectmobile.connections.model.ConnectionSearchResultDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/connections/model/ConnectionSearchResultDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$userSearchByKeyword$2", f = "GroupRepo.kt", l = {178}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.l<t13.d<? super c83.a0<ConnectionSearchResultDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f198071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f198072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f198073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f198075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(a aVar, String str, int i14, int i15, boolean z14, t13.d<? super v0> dVar) {
        super(1, dVar);
        this.f198071b = aVar;
        this.f198072c = str;
        this.f198073d = i14;
        this.f198074e = i15;
        this.f198075f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v0(this.f198071b, this.f198072c, this.f198073d, this.f198074e, this.f198075f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ConnectionSearchResultDTO>> dVar) {
        return ((v0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198070a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<ConnectionSearchResultDTO>> i0VarB = this.f198071b.f197889c.b(this.f198072c, this.f198073d, this.f198074e, this.f198075f);
        this.f198070a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
