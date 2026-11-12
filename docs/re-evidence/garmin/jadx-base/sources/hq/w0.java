package hq;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseUtil", f = "SelectExerciseUtil.kt", l = {66, 70, 75}, m = "filterExercisesByQuery", v = 2)
public final class w0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f85165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f85167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f85169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0 f85170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85171g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, t13.d<? super w0> dVar) {
        super(dVar);
        this.f85170f = y0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85169e = obj;
        this.f85171g |= Integer.MIN_VALUE;
        y0 y0Var = y0.f85193a;
        return this.f85170f.b(null, null, false, this);
    }
}
