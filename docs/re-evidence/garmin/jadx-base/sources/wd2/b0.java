package wd2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager", f = "LivetrackManager.kt", l = {367, 369}, m = "startSettingsMigration", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ge2.e f184388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f184389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o13.p f184390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f184391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f184392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f184393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(q qVar, t13.d<? super b0> dVar) {
        super(dVar);
        this.f184392e = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184391d = obj;
        this.f184393f |= Integer.MIN_VALUE;
        return q.b(this.f184392e, null, null, this);
    }
}
