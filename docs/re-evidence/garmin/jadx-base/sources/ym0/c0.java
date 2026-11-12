package ym0;

import com.google.mlkit.common.MlKitException;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$getGroupMember$2", f = "GroupRepo.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.connections.groups.services.model.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f197922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f197923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f197924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f197925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f197926h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a aVar, String str, int i14, int i15, boolean z14, boolean z15, boolean z16, t13.d<? super c0> dVar) {
        super(1, dVar);
        this.f197920b = aVar;
        this.f197921c = str;
        this.f197922d = i14;
        this.f197923e = i15;
        this.f197924f = z14;
        this.f197925g = z15;
        this.f197926h = z16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c0(this.f197920b, this.f197921c, this.f197922d, this.f197923e, this.f197924f, this.f197925g, this.f197926h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.connections.groups.services.model.b>>> dVar) {
        return ((c0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197919a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>>> i0VarY = this.f197920b.f197888b.y(this.f197921c, this.f197922d, this.f197923e, this.f197924f, this.f197925g, this.f197926h);
        this.f197919a = 1;
        Object objAwait = i0VarY.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
