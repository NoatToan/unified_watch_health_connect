package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$updateLiveTrackPrivacy$1", f = "LivetrackService.kt", l = {371, 372}, m = "invokeSuspend", v = 2)
public final class a1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o13.p<ge2.c, ge2.b>[] f184383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1(LivetrackService livetrackService, o13.p<? extends ge2.c, ? extends ge2.b>[] pVarArr, t13.d<? super a1> dVar) {
        super(2, dVar);
        this.f184382b = livetrackService;
        this.f184383c = pVarArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a1(this.f184382b, this.f184383c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7.H(r1, r6) == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184381a;
        LivetrackService livetrackService = this.f184382b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f184381a = 1;
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
        o13.p<ge2.c, ge2.b>[] pVarArr = this.f184383c;
        o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length);
        this.f184381a = 2;
    }
}
