package zg0;

import am.j;
import android.app.Activity;
import androidx.lifecycle.t0;
import c22.k;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import e23.p;
import o13.q;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.feedback.domain.LaunchInAppReviewUseCase$invoke$1", f = "LaunchInAppReviewUseCase.kt", l = {23, 28, 31, 41, 45}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<t0<Boolean>, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f204674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f204675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0 f204676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ReviewManager f204677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f204678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f204679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f204680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f204681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f204682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Activity f204683j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, Activity activity, d<? super b> dVar) {
        super(2, dVar);
        this.f204682i = aVar;
        this.f204683j = activity;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f204682i, this.f204683j, dVar);
        bVar.f204681h = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Boolean> t0Var, d<? super Unit> dVar) {
        return ((b) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:41:0x0113 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:39:0x0108, B:41:0x0113, B:45:0x0131, B:44:0x0122, B:35:0x00d6), top: B:60:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0122 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:39:0x0108, B:41:0x0113, B:45:0x0131, B:44:0x0122, B:35:0x00d6), top: B:60:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0165  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r2.emit(r0, r18) == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        if (r2.emit(r4, r18) == r3) goto L57;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        Object bVar;
        Throwable thB;
        Object objJ;
        ReviewManager reviewManager;
        t0 t0Var;
        int i14;
        Activity activity2;
        a aVar;
        long jCurrentTimeMillis;
        Task<Void> taskLaunchReviewFlow;
        Activity activity3;
        long j8;
        t0 t0Var2 = (t0) this.f204681h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f204680g;
        Activity activity4 = this.f204683j;
        a aVar3 = this.f204682i;
        try {
            if (i15 == 0) {
                r.b(obj);
                if (((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("in_app_review_enabled")) {
                    int i16 = q.f128596b;
                    ReviewManager reviewManagerCreate = ReviewManagerFactory.create(activity4);
                    reviewManagerCreate.getClass();
                    Task<ReviewInfo> taskRequestReviewFlow = reviewManagerCreate.requestReviewFlow();
                    taskRequestReviewFlow.getClass();
                    this.f204681h = t0Var2;
                    this.f204674a = activity4;
                    this.f204675b = aVar3;
                    this.f204676c = t0Var2;
                    this.f204677d = reviewManagerCreate;
                    this.f204678e = 0;
                    this.f204680g = 2;
                    objJ = xy2.b.j(taskRequestReviewFlow, this);
                    if (objJ != aVar2) {
                        reviewManager = reviewManagerCreate;
                        t0Var = t0Var2;
                        i14 = 0;
                        activity2 = activity4;
                        aVar = aVar3;
                        ReviewInfo reviewInfo = (ReviewInfo) objJ;
                        activity = activity4;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        a2 a2Var = a2.GENERAL;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "LaunchInAppReviewUseCase", "In-app review flow requested successfully.");
                        taskLaunchReviewFlow = reviewManager.launchReviewFlow(activity2, reviewInfo);
                        taskLaunchReviewFlow.getClass();
                        this.f204681h = t0Var2;
                        this.f204674a = activity2;
                        this.f204675b = aVar;
                        this.f204676c = t0Var;
                        this.f204677d = null;
                        this.f204678e = i14;
                        this.f204679f = jCurrentTimeMillis;
                        this.f204680g = 3;
                        if (xy2.b.j(taskLaunchReviewFlow, this) == aVar2) {
                            activity3 = activity2;
                            j8 = jCurrentTimeMillis;
                            if (System.currentTimeMillis() - j8 > 1000) {
                                a2 a2Var2 = a2.GENERAL;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var2, "LaunchInAppReviewUseCase", "In-app review flow launched successfully.");
                            } else {
                                a2 a2Var3 = a2.GENERAL;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var3, "LaunchInAppReviewUseCase", "In-app review flow likely not shown to user, navigate to Play Store.");
                                a.a(aVar, activity3);
                            }
                            bVar = Unit.INSTANCE;
                            int i17 = q.f128596b;
                        }
                    }
                } else {
                    a2 a2Var4 = a2.GENERAL;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var4, "LaunchInAppReviewUseCase", "In-app review is disabled via remote config.");
                    a.a(aVar3, activity4);
                    Boolean bool = Boolean.FALSE;
                    this.f204681h = null;
                    this.f204680g = 1;
                }
                return aVar2;
            }
            if (i15 == 1) {
                r.b(obj);
                return Unit.INSTANCE;
            }
            if (i15 == 2) {
                int i18 = this.f204678e;
                ReviewManager reviewManager2 = this.f204677d;
                t0 t0Var3 = this.f204676c;
                a aVar4 = this.f204675b;
                Activity activity5 = (Activity) this.f204674a;
                r.b(obj);
                activity2 = activity5;
                t0Var = t0Var3;
                i14 = i18;
                aVar = aVar4;
                reviewManager = reviewManager2;
                objJ = obj;
                ReviewInfo reviewInfo2 = (ReviewInfo) objJ;
                activity = activity4;
                try {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    a2 a2Var5 = a2.GENERAL;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var5, "LaunchInAppReviewUseCase", "In-app review flow requested successfully.");
                    taskLaunchReviewFlow = reviewManager.launchReviewFlow(activity2, reviewInfo2);
                    taskLaunchReviewFlow.getClass();
                    this.f204681h = t0Var2;
                    this.f204674a = activity2;
                    this.f204675b = aVar;
                    this.f204676c = t0Var;
                    this.f204677d = null;
                    this.f204678e = i14;
                    this.f204679f = jCurrentTimeMillis;
                    this.f204680g = 3;
                    if (xy2.b.j(taskLaunchReviewFlow, this) == aVar2) {
                        activity3 = activity2;
                        j8 = jCurrentTimeMillis;
                        if (System.currentTimeMillis() - j8 > 1000) {
                            a2 a2Var6 = a2.GENERAL;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var6, "LaunchInAppReviewUseCase", "In-app review flow launched successfully.");
                        } else {
                            a2 a2Var7 = a2.GENERAL;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var7, "LaunchInAppReviewUseCase", "In-app review flow likely not shown to user, navigate to Play Store.");
                            a.a(aVar, activity3);
                        }
                        bVar = Unit.INSTANCE;
                        int i19 = q.f128596b;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    int i24 = q.f128596b;
                    bVar = new q.b(th);
                }
                return aVar2;
            }
            if (i15 == 3) {
                j8 = this.f204679f;
                aVar = this.f204675b;
                activity3 = (Activity) this.f204674a;
                r.b(obj);
                activity = activity4;
                if (System.currentTimeMillis() - j8 > 1000) {
                    a2 a2Var8 = a2.GENERAL;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var8, "LaunchInAppReviewUseCase", "In-app review flow launched successfully.");
                } else {
                    a2 a2Var9 = a2.GENERAL;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var9, "LaunchInAppReviewUseCase", "In-app review flow likely not shown to user, navigate to Play Store.");
                    a.a(aVar, activity3);
                }
                bVar = Unit.INSTANCE;
                int i110 = q.f128596b;
            } else if (i15 == 4) {
                bVar = this.f204674a;
                r.b(obj);
                activity = activity4;
                thB = q.b(bVar);
                if (thB != null) {
                    a2 a2Var10 = a2.GENERAL;
                    String strP = j.p("In-app review launch failed: ", thB);
                    i2.f36769a.getClass();
                    i2.a.f(a2Var10, "LaunchInAppReviewUseCase", strP);
                    a.a(aVar3, activity);
                    Boolean bool2 = Boolean.FALSE;
                    this.f204681h = null;
                    this.f204674a = bVar;
                    this.f204675b = null;
                    this.f204676c = null;
                    this.f204677d = null;
                    this.f204678e = 0;
                    this.f204680g = 5;
                }
            } else {
                if (i15 != 5) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            th = th4;
            activity = activity4;
        }
        if (!(bVar instanceof q.b)) {
            Boolean bool3 = Boolean.TRUE;
            this.f204681h = t0Var2;
            this.f204674a = bVar;
            this.f204675b = null;
            this.f204676c = null;
            this.f204677d = null;
            this.f204678e = 0;
            this.f204680g = 4;
            if (t0Var2.emit(bool3, this) != aVar2) {
            }
            return aVar2;
        }
        thB = q.b(bVar);
        if (thB != null) {
            a2 a2Var11 = a2.GENERAL;
            String strP2 = j.p("In-app review launch failed: ", thB);
            i2.f36769a.getClass();
            i2.a.f(a2Var11, "LaunchInAppReviewUseCase", strP2);
            a.a(aVar3, activity);
            Boolean bool4 = Boolean.FALSE;
            this.f204681h = null;
            this.f204674a = bVar;
            this.f204675b = null;
            this.f204676c = null;
            this.f204677d = null;
            this.f204678e = 0;
            this.f204680g = 5;
        }
        return Unit.INSTANCE;
    }
}
