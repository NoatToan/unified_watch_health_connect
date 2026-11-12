package lp;

import am.x0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.domain.GetSelectionFilterActivitiesUseCase", f = "GetSelectionFilterActivitiesUseCase.kt", l = {36}, m = "getChildActivities", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f114098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f114099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f114100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f114100c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f114099b = obj;
        this.f114101d |= Integer.MIN_VALUE;
        return i.a(this.f114100c, null, false, this);
    }
}
