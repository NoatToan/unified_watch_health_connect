package vd0;

import android.content.Context;
import android.content.DialogInterface;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.EditDogPageKt$EditDogPageContent$10$1", f = "EditDogPage.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f177262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f177263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String[] f177264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f177265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f177266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f177267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oe0.s f177268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f177269h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Context context, String str, String[] strArr, int i14, String str2, String str3, oe0.s sVar, p3.p1<Boolean> p1Var, t13.d<? super g1> dVar) {
        super(2, dVar);
        this.f177262a = context;
        this.f177263b = str;
        this.f177264c = strArr;
        this.f177265d = i14;
        this.f177266e = str2;
        this.f177267f = str3;
        this.f177268g = sVar;
        this.f177269h = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g1(this.f177262a, this.f177263b, this.f177264c, this.f177265d, this.f177266e, this.f177267f, this.f177268g, this.f177269h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        androidx.appcompat.app.e.a negativeButton = new androidx.appcompat.app.e.a(this.f177262a).setTitle(this.f177263b).setSingleChoiceItems(this.f177264c, this.f177265d, (DialogInterface.OnClickListener) null).setNegativeButton(this.f177266e, (DialogInterface.OnClickListener) null);
        oe0.s sVar = this.f177268g;
        p3.p1<Boolean> p1Var = this.f177269h;
        negativeButton.setPositiveButton(this.f177267f, new f1(sVar, p1Var, 0)).setOnDismissListener(new i(p1Var, 2)).show();
        return Unit.INSTANCE;
    }
}
