package mz1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel", f = "AddTIEventViewModel.kt", l = {3301}, m = "fetchAndFindTmeZoneDTOByTimeZoneID", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f121768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f121771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AddTIEventViewModel addTIEventViewModel, t13.d<? super h> dVar) {
        super(dVar);
        this.f121770c = addTIEventViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121769b = obj;
        this.f121771d |= Integer.MIN_VALUE;
        return this.f121770c.d5(null, this);
    }
}
