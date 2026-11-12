package oq2;

import android.content.Context;
import android.content.Intent;
import androidx.room.a0;
import com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailActivity;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rd2.j;
import v13.i;
import vb.h;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq2/f;", "Lms2/g;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements ms2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2.b f133320a = is2.b.RABBIT;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsd2/f;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.RabbitServiceProvider$createManageCardActivity$device$1", f = "RabbitServiceProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super sd2.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qs2.d f133321a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qs2.d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f133321a = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f133321a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            j jVar = rd2.f.a().f152045a;
            long j8 = ((fs2.a) this.f133321a).f73431f;
            jVar.getClass();
            return j.i(j8, null);
        }
    }

    @Override // ms2.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public final is2.b getF133320a() {
        return this.f133320a;
    }

    @Override // ms2.g
    public final ms2.d c(hs2.d dVar, hs2.a aVar) {
        aVar.getClass();
        dVar.getClass();
        return new c(this.f133320a, dVar, this, aVar, null, 16, null);
    }

    @Override // ms2.g
    public final Intent d(ms2.f fVar, long j8) {
        fVar.getClass();
        throw new IllegalStateException("Add card flow is not supported for Rabbit");
    }

    @Override // ms2.g
    public final q03.b destroy() {
        z03.f fVar = z03.f.f200765a;
        fVar.getClass();
        return fVar;
    }

    @Override // ms2.g
    public final Intent e(qs2.d dVar) {
        if (!(dVar instanceof fs2.a)) {
            h.s("Failed requirement.");
            return null;
        }
        x53.c cVar = s0.f129406a;
        sd2.f fVar = (sd2.f) ge1.b.W(x53.b.f189152a, new a(dVar, null));
        if (fVar == null) {
            o2.c.m(a0.f(((fs2.a) dVar).f73431f, "Cannot find device ", " in database"));
            return null;
        }
        RabbitCardDetailActivity.a aVar = RabbitCardDetailActivity.f51749j;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        String str = ((fs2.a) dVar).f73426a;
        aVar.getClass();
        str.getClass();
        Intent intent = new Intent(contextC, (Class<?>) RabbitCardDetailActivity.class);
        intent.putExtra("extra.synthesize.model_factory", new RabbitCardDetailActivity.a.C1071a(str, fVar));
        intent.putExtra("extra.synthesize.presenter_factory", new RabbitCardDetailActivity.a.b());
        return intent;
    }

    @Override // ms2.g
    public final q03.b initialize() {
        z03.f fVar = z03.f.f200765a;
        fVar.getClass();
        return fVar;
    }

    @Override // ms2.g
    public final Intent k(String str, q qVar) {
        str.getClass();
        qVar.getClass();
        throw new IllegalStateException("All Rabbits in different devices are distinct, createCardDetailsActivity() shouldn't be called");
    }
}
