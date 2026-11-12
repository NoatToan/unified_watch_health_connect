package rv2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.grid.WatchFaceGridDataHandler", f = "WatchFaceGridDataHandler.kt", l = {43}, m = "sendWatchFaceGridSelectionChange", v = 1)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f154766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f154768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f154769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f154768c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154767b = obj;
        this.f154769d |= Integer.MIN_VALUE;
        return this.f154768c.a(null, 0, 0, 0, this);
    }
}
