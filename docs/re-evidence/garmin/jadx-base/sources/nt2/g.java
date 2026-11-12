package nt2;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.lib.workoutcommon.presentation.WorkoutCardStringsDataSource", f = "WorkoutCardStringsDataSource.kt", l = {66, 71}, m = "commonGetSubtitles")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f127851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f127852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f127853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f127854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f127855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f127856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f127857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f127858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f127859i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f127858h = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f127857g = obj;
        this.f127859i |= Integer.MIN_VALUE;
        return this.f127858h.a(false, this);
    }
}
