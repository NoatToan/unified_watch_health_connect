package rq0;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.domain.GetDemographicSelectionUseCase", f = "GetDemographicSelectionUseCase.kt", l = {94}, m = "createDefaultPreferenceList", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f154108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f154110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f154111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, t13.d<? super a> dVar2) {
        super(dVar2);
        this.f154110c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154109b = obj;
        this.f154111d |= Integer.MIN_VALUE;
        return this.f154110c.b(null, this);
    }
}
