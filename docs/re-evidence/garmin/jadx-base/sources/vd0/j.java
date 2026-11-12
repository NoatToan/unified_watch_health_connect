package vd0;

import android.content.Context;
import android.content.DialogInterface;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.AddDogPageKt$AddDogPageContent$8$1", f = "AddDogPage.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f177296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f177297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String[] f177298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f177299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f177300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f177301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oe0.d f177302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f177303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, String str, String[] strArr, int i14, String str2, String str3, oe0.d dVar, p3.p1<Boolean> p1Var, t13.d<? super j> dVar2) {
        super(2, dVar2);
        this.f177296a = context;
        this.f177297b = str;
        this.f177298c = strArr;
        this.f177299d = i14;
        this.f177300e = str2;
        this.f177301f = str3;
        this.f177302g = dVar;
        this.f177303h = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f177296a, this.f177297b, this.f177298c, this.f177299d, this.f177300e, this.f177301f, this.f177302g, this.f177303h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        androidx.appcompat.app.e.a negativeButton = new androidx.appcompat.app.e.a(this.f177296a).setTitle(this.f177297b).setSingleChoiceItems(this.f177298c, this.f177299d, (DialogInterface.OnClickListener) null).setNegativeButton(this.f177300e, (DialogInterface.OnClickListener) null);
        oe0.d dVar = this.f177302g;
        p3.p1<Boolean> p1Var = this.f177303h;
        negativeButton.setPositiveButton(this.f177301f, new h(dVar, p1Var, 0)).setOnDismissListener(new i(p1Var, 0)).show();
        return Unit.INSTANCE;
    }
}
