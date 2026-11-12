package mk1;

import android.content.Context;
import android.content.Intent;
import c.q;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.thirdpartyapps.ThirdPartyAppListScreenKt$ThirdPartyAppListScreen$2$1", f = "ThirdPartyAppListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f119148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk1.a f119149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f119150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q<Intent, f.a> f119151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, dk1.a aVar, Context context, q<Intent, f.a> qVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f119148a = str;
        this.f119149b = aVar;
        this.f119150c = context;
        this.f119151d = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f119148a, this.f119149b, this.f119150c, this.f119151d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Intent intentA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        String str = this.f119148a;
        boolean zG = s.g(str, "connect://myfitnesspal");
        Context context = this.f119150c;
        dk1.a aVar2 = this.f119149b;
        if (zG) {
            intentA = aVar2.c(context);
        } else {
            intentA = s.g(str, "connect://strava") ? aVar2.a(context) : null;
        }
        if (intentA != null) {
            this.f119151d.a(intentA, null);
        }
        return Unit.INSTANCE;
    }
}
