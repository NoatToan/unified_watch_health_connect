package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$updatePastSessionsPrivacy$1", f = "LivetrackService.kt", l = {432, 433}, m = "invokeSuspend", v = 2)
public final class e1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f184444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(LivetrackService livetrackService, String str, t13.d<? super e1> dVar) {
        super(2, dVar);
        this.f184443b = livetrackService;
        this.f184444c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e1(this.f184443b, this.f184444c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r7.h(r6.f184444c, r6) == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184442a;
        LivetrackService livetrackService = this.f184443b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f184442a = 1;
            int i15 = LivetrackService.f50160k;
            if (livetrackService.d(this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        xd2.a1 a1Var = livetrackService.f50166f;
        if (a1Var == null) {
            p005kotlin.jvm.internal.s.m("repository");
            throw null;
        }
        this.f184442a = 2;
    }
}
