package mz1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel", f = "AddTIEventViewModel.kt", l = {2672}, m = "getUpcomingEvents", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f121898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f121900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AddTIEventViewModel addTIEventViewModel, t13.d<? super q> dVar) {
        super(dVar);
        this.f121899b = addTIEventViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121898a = obj;
        this.f121900c |= Integer.MIN_VALUE;
        return this.f121899b.Z5(this);
    }
}
