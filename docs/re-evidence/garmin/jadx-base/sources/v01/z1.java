package v01;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.SaveMealSettingsUseCase", f = "SaveMealSettingsUseCase.kt", l = {40}, m = "invoke", v = 2)
public final class z1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f174630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f174631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b2 f174632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f174633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(b2 b2Var, t13.d<? super z1> dVar) {
        super(dVar);
        this.f174632c = b2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f174631b = obj;
        this.f174633d |= Integer.MIN_VALUE;
        return this.f174632c.b(null, null, null, null, null, null, this);
    }
}
