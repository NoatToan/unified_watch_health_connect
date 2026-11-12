package ey0;

import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import o53.i0;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcy0/o;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$uploadEpicImage$2", f = "MultiDayActivitiesRepository.kt", l = {GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.l<t13.d<? super c83.a0<cy0.o>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultipartBody.Part f67161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, String str, MultipartBody.Part part, t13.d<? super e0> dVar) {
        super(1, dVar);
        this.f67159b = g0Var;
        this.f67160c = str;
        this.f67161d = part;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e0(this.f67159b, this.f67160c, this.f67161d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<cy0.o>> dVar) {
        return ((e0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67158a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<cy0.o>> i0VarL = g0.b(this.f67159b).l(this.f67160c, this.f67161d);
        this.f67158a = 1;
        Object objAwait = i0VarL.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
