package wt1;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel", f = "RaceEventViewModel.kt", l = {112, 121}, m = "createEvent", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f187061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fg0.k f187062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f187063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f187064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f187065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f187064d = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f187063c = obj;
        this.f187065e |= Integer.MIN_VALUE;
        int i14 = d.f187033q;
        return this.f187064d.B4(null, null, this);
    }
}
