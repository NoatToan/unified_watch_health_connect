package uy0;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetSettingsItemsUseCase", f = "GetSettingsItemsUseCase.kt", l = {60}, m = "invoke", v = 2)
public final class z0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f173378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f173379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f173380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f173381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(v0 v0Var, t13.d<? super z0> dVar) {
        super(dVar);
        this.f173380c = v0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173379b = obj;
        this.f173381d |= Integer.MIN_VALUE;
        return this.f173380c.d(false, this);
    }
}
