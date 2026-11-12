package mz1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel", f = "AddTIEventViewModel.kt", l = {1529}, m = "getAddressFromLocation$gcm_training_initiative_vanillaRelease", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f121778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f121780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AddTIEventViewModel addTIEventViewModel, t13.d<? super i> dVar) {
        super(dVar);
        this.f121779b = addTIEventViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121778a = obj;
        this.f121780c |= Integer.MIN_VALUE;
        return this.f121779b.i5(null, this);
    }
}
