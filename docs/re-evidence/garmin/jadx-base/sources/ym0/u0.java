package ym0;

import java.util.List;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/group/service/model/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$uploadGroupProfileImage$2", f = "GroupRepo.kt", l = {346}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.group.service.model.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f198064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f198065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<MultipartBody.Part> f198066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(a aVar, String str, List<MultipartBody.Part> list, t13.d<? super u0> dVar) {
        super(1, dVar);
        this.f198064b = aVar;
        this.f198065c = str;
        this.f198066d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u0(this.f198064b, this.f198065c, this.f198066d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.group.service.model.a>>> dVar) {
        return ((u0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198063a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.group.service.model.a>>> i0VarI = this.f198064b.f197888b.i(this.f198065c, this.f198066d);
        this.f198063a = 1;
        Object objAwait = i0VarI.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
