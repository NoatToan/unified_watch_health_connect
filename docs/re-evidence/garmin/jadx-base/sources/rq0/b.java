package rq0;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.domain.GetDemographicSelectionUseCase", f = "GetDemographicSelectionUseCase.kt", l = {101, 107}, m = "getInsightsPreferences", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tq0.d f154112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f154113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f154114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f154115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f154116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t13.d<? super b> dVar2) {
        super(dVar2);
        this.f154115d = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154114c = obj;
        this.f154116e |= Integer.MIN_VALUE;
        return d.a(this.f154115d, null, this);
    }
}
