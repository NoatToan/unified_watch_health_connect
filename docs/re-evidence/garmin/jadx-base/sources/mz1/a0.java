package mz1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel", f = "AddTIEventViewModel.kt", l = {1917}, m = "uploadEventImage", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f121648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f121650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(AddTIEventViewModel addTIEventViewModel, t13.d<? super a0> dVar) {
        super(dVar);
        this.f121649b = addTIEventViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121648a = obj;
        this.f121650c |= Integer.MIN_VALUE;
        String[] strArr = AddTIEventViewModel.V2;
        return this.f121649b.R6(null, 0L, this);
    }
}
