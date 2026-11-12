package pt0;

import androidx.lifecycle.t0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.EarnedBadgeChallengeViewModel$getChallengesFilteredByBadge$1", f = "EarnedBadgeChallengeViewModel.kt", l = {25, 32}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<t0<List<? extends com.garmin.android.apps.connectmobile.leaderboard.model.a0>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f140623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.service.model.a f140624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f140625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f140626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f140627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f140628g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f140629a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.badges.service.model.a.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.a.AD_HOC_CHALLENGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_CHALLENGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_TEAM_CHALLENGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f140629a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.garmin.android.apps.connectmobile.badges.service.model.a aVar, e0 e0Var, int i14, int i15, int i16, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f140624c = aVar;
        this.f140625d = e0Var;
        this.f140626e = i14;
        this.f140627f = i15;
        this.f140628g = i16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b0 b0Var = new b0(this.f140624c, this.f140625d, this.f140626e, this.f140627f, this.f140628g, dVar);
        b0Var.f140623b = obj;
        return b0Var;
    }

    @Override // e23.p
    public final Object invoke(t0<List<? extends com.garmin.android.apps.connectmobile.leaderboard.model.a0>> t0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        t0 t0Var = (t0) this.f140623b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140622a;
        if (i14 != 0) {
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
        }
        o13.r.b(obj);
        int i15 = a.f140629a[this.f140624c.ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            String strValueOf = String.valueOf(this.f140626e);
            this.f140623b = t0Var;
            this.f140622a = 1;
            obj = e0.x4(this.f140625d, strValueOf, this.f140627f, this.f140628g, this);
        } else {
            list = p13.j0.f134944a;
            this.f140623b = null;
            this.f140622a = 2;
        }
        return aVar;
        list = (List) obj;
        this.f140623b = null;
        this.f140622a = 2;
    }
}
