package jm0;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.GroupUtils$shouldShowErrorMessage$1$1", f = "GroupUtils.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f99569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f99570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f99571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z14, boolean z15, p1<Boolean> p1Var, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f99569a = z14;
        this.f99570b = z15;
        this.f99571c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f99569a, this.f99570b, this.f99571c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        boolean z14 = this.f99569a;
        p1<Boolean> p1Var = this.f99571c;
        if (!z14) {
            zBooleanValue = false;
        } else if (this.f99570b) {
            e eVar = e.f99565a;
            zBooleanValue = p1Var.getF182175a().booleanValue();
        } else {
            zBooleanValue = true;
        }
        e eVar2 = e.f99565a;
        p1Var.setValue(Boolean.valueOf(zBooleanValue));
        return Unit.INSTANCE;
    }
}
