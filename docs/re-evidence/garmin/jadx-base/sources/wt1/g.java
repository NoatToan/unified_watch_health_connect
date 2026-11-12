package wt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel", f = "RaceEventViewModel.kt", l = {252, 259}, m = "getLinkedEventDTOAndShowAlertIfEventDataChanged", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xw1.d f187066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f187067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f187068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v2 f187069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f187070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f187071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f187072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f187073h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(dVar2);
        this.f187072g = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f187071f = obj;
        this.f187073h |= Integer.MIN_VALUE;
        return this.f187072g.D4(null, null, this);
    }
}
