package o52;

import java.util.List;
import m52.k;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.domain.GetStartWorkoutTypeUseCase", f = "GetStartWorkoutTypeUseCase.kt", l = {19, 26, 36, 37}, m = "invoke", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f129277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f129278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f129279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f129280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f129281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f129282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f129283g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f129282f = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f129281e = obj;
        this.f129283g |= Integer.MIN_VALUE;
        return this.f129282f.a(null, this);
    }
}
