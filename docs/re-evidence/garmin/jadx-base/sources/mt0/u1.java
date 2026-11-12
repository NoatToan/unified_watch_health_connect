package mt0;

import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.ChallengeRulesActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.ChallengeRulesActivity$setupViews$8", f = "ChallengeRulesActivity.kt", l = {271, 272}, m = "invokeSuspend", v = 2)
public final class u1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChallengeRulesActivity f120882b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.ChallengeRulesActivity$setupViews$8$1", f = "ChallengeRulesActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f120883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ChallengeRulesActivity f120884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c80.p f120885c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ChallengeRulesActivity challengeRulesActivity, c80.p pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f120884b = challengeRulesActivity;
            this.f120885c = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f120884b, this.f120885c, dVar);
            aVar.f120883a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ChallengeRulesActivity challengeRulesActivity = this.f120884b;
            TextView textView = (TextView) challengeRulesActivity.findViewById(R.id.gc_plus_message);
            textView.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = challengeRulesActivity.f37232g;
            int i14 = 8;
            textView.setVisibility((pVar == null || !pVar.Z0()) ? 8 : 0);
            StringBuilder sb3 = new StringBuilder("displayChallengeText featureStatus = ");
            c80.p pVar2 = this.f120885c;
            sb3.append(pVar2);
            String string = sb3.toString();
            com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "ChallengeRulesActivity", string);
            if (pVar2 instanceof c80.p.a) {
                TextView textView2 = (TextView) challengeRulesActivity.findViewById(R.id.multiplier_point_message);
                textView2.getClass();
                com.garmin.android.apps.connectmobile.leaderboard.model.p pVar3 = challengeRulesActivity.f37232g;
                if (pVar3 != null && pVar3.k0()) {
                    i14 = 0;
                }
                textView2.setVisibility(i14);
                c80.p.a aVar3 = (c80.p.a) pVar2;
                if (aVar3.f25520b) {
                    textView.setText(challengeRulesActivity.getString(R.string.msg_implicit_consent_gc_plus_badge_challenges_no_expired));
                    textView2.setText(challengeRulesActivity.getString(R.string.msg_implicit_consent_double_point_badge_challenges_no_expired));
                } else {
                    String strI = com.nimbusds.jose.shaded.gson.internal.a.i("MMMM d, yyyy", aVar3.f25519a);
                    textView.setText(challengeRulesActivity.getString(R.string.msg_implicit_consent_gc_plus_badge_challenges_expired_date, strI));
                    textView2.setText(challengeRulesActivity.getString(R.string.msg_implicit_consent_double_point_badge_challenges_expired_date, strI));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(ChallengeRulesActivity challengeRulesActivity, t13.d<? super u1> dVar) {
        super(2, dVar);
        this.f120882b = challengeRulesActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u1(this.f120882b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (ge1.b.e0(r1, r3, r6) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120881a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
        c80.q qVar = c80.q.SOCIAL;
        this.f120881a = 1;
        obj = j1Var.j(qVar, this);
        if (obj != aVar) {
        }
        return aVar;
        x53.c cVar = o53.s0.f129406a;
        o53.t1 t1Var = u53.o.f168762a;
        a aVar2 = new a(this.f120882b, (c80.p) obj, null);
        this.f120881a = 2;
    }
}
