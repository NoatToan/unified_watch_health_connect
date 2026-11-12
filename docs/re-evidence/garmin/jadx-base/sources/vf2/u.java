package vf2;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.workout.WorkoutDataSourceImpl", f = "WorkoutDataSourceImpl.kt", l = {70}, m = "getUpdatedWorkoutSteps", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f178025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f178026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f178027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f178028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f178029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f178030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f178031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f178032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f178033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f178034j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f178033i = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f178032h = obj;
        this.f178034j |= Integer.MIN_VALUE;
        int i14 = r.f178007e;
        return this.f178033i.e(null, null, this);
    }
}
