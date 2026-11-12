package pk0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.brand.BrandModelEntryKt$BrandModelEntry$1$1", f = "BrandModelEntry.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f138214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f138215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f138216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f138217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f138218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f138219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z14, boolean z15, m4.b0 b0Var, boolean z16, boolean z17, m4.b0 b0Var2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f138214a = z14;
        this.f138215b = z15;
        this.f138216c = b0Var;
        this.f138217d = z16;
        this.f138218e = z17;
        this.f138219f = b0Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f138214a, this.f138215b, this.f138216c, this.f138217d, this.f138218e, this.f138219f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f138214a && this.f138215b) {
            m4.b0.a(this.f138216c);
        } else if (this.f138217d && this.f138218e) {
            m4.b0.a(this.f138219f);
        }
        return Unit.INSTANCE;
    }
}
