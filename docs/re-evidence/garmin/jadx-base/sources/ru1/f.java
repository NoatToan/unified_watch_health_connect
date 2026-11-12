package ru1;

import am.x0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.exercise.ExerciseTranslationsRepositoryImpl$retrieveTranslations$2", f = "ExerciseTranslationsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super v2<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f154583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f154584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f154585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, x0 x0Var, boolean z14, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f154583a = eVar;
        this.f154584b = x0Var;
        this.f154585c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f154583a, this.f154584b, this.f154585c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends String>> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        e eVar = this.f154583a;
        String strB = eVar.f154581b.b();
        x0 x0Var = this.f154584b;
        boolean z14 = this.f154585c;
        v2 v2VarC = eVar.c(x0Var, z14, false, strB);
        if (v2VarC instanceof v2.b) {
            return v2VarC;
        }
        if (!strB.equals("en")) {
            v2 v2VarC2 = eVar.c(x0Var, z14, false, "en");
            if (v2VarC2 instanceof v2.b) {
                return v2VarC2;
            }
        }
        v2 v2VarC3 = eVar.c(x0Var, z14, true, strB);
        return v2VarC3 instanceof v2.b ? v2VarC3 : eVar.c(x0Var, z14, true, "en");
    }
}
