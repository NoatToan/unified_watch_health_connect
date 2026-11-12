package u21;

import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupViewModel", f = "NutritionSetupViewModel.kt", l = {526, 529, 584}, m = "getSetupAndLocationInfo", v = 2)
public final class x0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x01.e f168178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f168179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l01.d f168180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l01.f f168181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l01.f f168182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinkedHashMap f168183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f168184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u0 f168185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f168186i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(u0 u0Var, t13.d<? super x0> dVar) {
        super(dVar);
        this.f168185h = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f168184g = obj;
        this.f168186i |= Integer.MIN_VALUE;
        return u0.x4(this.f168185h, this);
    }
}
