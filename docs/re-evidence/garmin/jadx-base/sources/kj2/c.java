package kj2;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.ui.composables.customviews.CustomAddressAutocompletionEditTextKt$CustomAutocompletionEditText$2$1", f = "CustomAddressAutocompletionEditText.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f104994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f104996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f104997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i14, n1 n1Var, p1<Boolean> p1Var, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f104994a = context;
        this.f104995b = i14;
        this.f104996c = n1Var;
        this.f104997d = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f104994a, this.f104995b, this.f104996c, this.f104997d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        float intValue = this.f104996c.getIntValue();
        Resources resources = this.f104994a.getResources();
        resources.getClass();
        float fApplyDimension = TypedValue.applyDimension(1, this.f104995b, resources.getDisplayMetrics()) / 3;
        p1<Boolean> p1Var = this.f104997d;
        if (intValue < fApplyDimension) {
            p1Var.setValue(Boolean.FALSE);
        } else {
            p1Var.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
