package rr2;

import br2.f;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import e23.p;
import o13.r;
import o53.b0;
import o53.j2;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity$setResultWithPasscodeCheck$1", f = "CardDestinationSelectionActivity.kt", l = {261}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardDestinationSelectionActivity f154285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f154286c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljs2/d;", "<anonymous>", "(Lo53/b0;)Ljs2/d;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity$setResultWithPasscodeCheck$1$1", f = "CardDestinationSelectionActivity.kt", l = {262}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super js2.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f154287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CardDestinationSelectionActivity f154288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f154289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CardDestinationSelectionActivity cardDestinationSelectionActivity, f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f154288b = cardDestinationSelectionActivity;
            this.f154289c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f154288b, this.f154289c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super js2.d> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f154287a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            CardDestinationSelectionActivity.a aVar2 = CardDestinationSelectionActivity.f52143n;
            this.f154288b.ca();
            long j8 = this.f154289c.f19599a;
            this.f154287a = 1;
            Object objB = j2.b(15000L, new fr2.b(j8, null), this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CardDestinationSelectionActivity cardDestinationSelectionActivity, f fVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f154285b = cardDestinationSelectionActivity;
        this.f154286c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f154285b, this.f154286c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154284a;
        f fVar = this.f154286c;
        CardDestinationSelectionActivity cardDestinationSelectionActivity = this.f154285b;
        try {
            if (i14 == 0) {
                r.b(obj);
                hn2.c.ba(cardDestinationSelectionActivity, Boolean.TRUE, null, null, 14);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(cardDestinationSelectionActivity, fVar, null);
                this.f154284a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            long j8 = fVar.f19599a;
            String str = fVar.f19600b;
            CardDestinationSelectionActivity.a aVar3 = CardDestinationSelectionActivity.f52143n;
            cardDestinationSelectionActivity.da(j8, str);
        } catch (Throwable th3) {
            try {
                Logger logger = CardDestinationSelectionActivity.f52144o;
                logger.warn("Failed to refresh passcode", th3);
                cardDestinationSelectionActivity.getClass();
                logger.debug("createAndShowDeviceErrorDialog()");
                br2.c.f19585a.g(null, cardDestinationSelectionActivity);
            } finally {
                cardDestinationSelectionActivity.f52149k = null;
            }
        }
        return Unit.INSTANCE;
    }
}
