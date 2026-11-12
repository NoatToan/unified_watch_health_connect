package mz1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel", f = "AddTIEventViewModel.kt", l = {1826}, m = "handleEventImageUpload", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f121921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f121924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AddTIEventViewModel addTIEventViewModel, t13.d<? super s> dVar) {
        super(dVar);
        this.f121923c = addTIEventViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121922b = obj;
        this.f121924d |= Integer.MIN_VALUE;
        return AddTIEventViewModel.X4(this.f121923c, null, null, this);
    }
}
