package vd0;

import android.content.Context;
import android.content.DialogInterface;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.AddDogPageKt$AddDogPageContent$9$1", f = "AddDogPage.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f177308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f177309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String[] f177310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f177311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f177312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f177313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oe0.d f177314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f177315h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, String str, String[] strArr, int i14, String str2, String str3, oe0.d dVar, p3.p1<Boolean> p1Var, t13.d<? super k> dVar2) {
        super(2, dVar2);
        this.f177308a = context;
        this.f177309b = str;
        this.f177310c = strArr;
        this.f177311d = i14;
        this.f177312e = str2;
        this.f177313f = str3;
        this.f177314g = dVar;
        this.f177315h = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f177308a, this.f177309b, this.f177310c, this.f177311d, this.f177312e, this.f177313f, this.f177314g, this.f177315h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        androidx.appcompat.app.e.a negativeButton = new androidx.appcompat.app.e.a(this.f177308a).setTitle(this.f177309b).setSingleChoiceItems(this.f177310c, this.f177311d, (DialogInterface.OnClickListener) null).setNegativeButton(this.f177312e, (DialogInterface.OnClickListener) null);
        oe0.d dVar = this.f177314g;
        p3.p1<Boolean> p1Var = this.f177315h;
        negativeButton.setPositiveButton(this.f177313f, new h(dVar, p1Var, 1)).setOnDismissListener(new i(p1Var, 1)).show();
        return Unit.INSTANCE;
    }
}
