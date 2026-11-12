package com.garmin.feature.garminpay.providers.gpay.snowball.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity$push$1", f = "SnowballAddCardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f51270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f51271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SnowballAddCardActivity.b f51272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v vVar, Fragment fragment, SnowballAddCardActivity.b bVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f51270a = vVar;
        this.f51271b = fragment;
        this.f51272c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f51270a, this.f51271b, this.f51272c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        v vVar = this.f51270a;
        boolean zIsEmpty = vVar.f7372c.f().isEmpty();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(vVar);
        Fragment fragment = this.f51271b;
        SnowballAddCardActivity.b bVar = this.f51272c;
        if (zIsEmpty) {
            aVar2.l(R.id.content_frame, fragment, bVar.name());
        } else {
            aVar2.l(R.id.content_frame, fragment, bVar.name());
            aVar2.d(null);
        }
        aVar2.e();
        return Unit.INSTANCE;
    }
}
