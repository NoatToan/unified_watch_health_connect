package oe0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.EditDogViewModel", f = "EditDogViewModel.kt", l = {180}, m = "updateDogWithPhoto", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f131442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f131442b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131441a = obj;
        this.f131443c |= Integer.MIN_VALUE;
        return s.x4(this.f131442b, null, null, null, this);
    }
}
