package uy0;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetNutritionSettingsItemsUseCase", f = "GetNutritionSettingsItemsUseCase.kt", l = {38}, m = "invoke", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f173173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f173174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f173175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f173176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, t13.d<? super g0> dVar) {
        super(dVar);
        this.f173175c = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173174b = obj;
        this.f173176d |= Integer.MIN_VALUE;
        return this.f173175c.b(this);
    }
}
