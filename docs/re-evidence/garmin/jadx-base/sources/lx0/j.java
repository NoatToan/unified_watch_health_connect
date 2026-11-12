package lx0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupViewModel", f = "MCTSetupViewModel.kt", l = {226}, m = "getPregnancyHistoryList", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f115181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f115182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f115183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f115183c = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115182b = obj;
        this.f115184d |= Integer.MIN_VALUE;
        return k.y4(this.f115183c, this);
    }
}
