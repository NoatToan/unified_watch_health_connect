package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$handleGrouptrackConnectionsRequest$1", f = "LivetrackService.kt", l = {389}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f184544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f184546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f184547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<String> f184548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f184549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f184550i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(LivetrackService livetrackService, long j8, int i14, String str, int i15, List<String> list, Integer num, Integer num2, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f184543b = livetrackService;
        this.f184544c = j8;
        this.f184545d = i14;
        this.f184546e = str;
        this.f184547f = i15;
        this.f184548g = list;
        this.f184549h = num;
        this.f184550i = num2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o0(this.f184543b, this.f184544c, this.f184545d, this.f184546e, this.f184547f, this.f184548g, this.f184549h, this.f184550i, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184542a;
        if (i14 == 0) {
            o13.r.b(obj);
            fe2.p1 p1Var = this.f184543b.f50167g.get(this.f184544c);
            if (p1Var != null) {
                this.f184542a = 1;
                if (p1Var.o(this.f184545d, this.f184546e, this.f184547f, this.f184548g, this.f184549h, this.f184550i, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
