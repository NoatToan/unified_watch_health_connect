package v01;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.NutritionConsiderUnschedulingLocalRemindersUseCase", f = "NutritionConsiderUnschedulingLocalRemindersUseCase.kt", l = {23}, m = "invoke", v = 2)
public final class p1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f174502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f174503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f174504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f174505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(o1 o1Var, t13.d<? super p1> dVar) {
        super(dVar);
        this.f174504c = o1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f174503b = obj;
        this.f174505d |= Integer.MIN_VALUE;
        return this.f174504c.a(null, this);
    }
}
