package zo0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;
import r22.v0;
import uu.i0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzo0/i;", "Lzo0/p;", "Lzo0/q;", "navigator", "<init>", "(Lzo0/q;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206153a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.BadgeDialogHandler", f = "BadgeDialogHandler.kt", l = {18}, m = "requestDialogData", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f206154a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f206156c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f206154a = obj;
            this.f206156c |= Integer.MIN_VALUE;
            return i.this.c(this);
        }
    }

    static {
        new a(null);
    }

    public i(q qVar) {
        qVar.getClass();
        this.f206153a = qVar;
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.d)) {
            return null;
        }
        com.garmin.android.apps.connectmobile.badges.service.model.u uVar = ((n.d) nVar).f206174a;
        String strB = i0.b((int) uVar.getBadgeId(), uVar.getBadgeChallengeUUID());
        String badgeChallengeName = uVar.getBadgeChallengeName();
        if (badgeChallengeName == null) {
            badgeChallengeName = "";
        }
        m0.a aVar = m0.f149759e;
        q qVar = this.f206153a;
        String string = qVar.u5().getString(R.string.msg_earned_reward);
        String string2 = qVar.u5().getString(R.string.msg_completed_challenge_reward, badgeChallengeName);
        wv2.h hVar = new wv2.h(24, this, uVar);
        aVar.getClass();
        return m0.a.a(aVar, 2131231128, strB, true, string, null, string2, R.string.challenges_card_footer_text, hVar, -1, null, false, 0, true, null, false, 22560);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f206156c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f206156c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objA = bVar.f206154a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f206156c;
        if (i15 == 0) {
            o13.r.b(objA);
            com.garmin.android.apps.connectmobile.l.g().getClass();
            boolean zC = gh2.i.f77458c.a().f77477b.c("badge_challenge_rewards_enabled");
            String str = "requestDialogData() -> isBadgeChallengeRewardsEnabled[" + Boolean.valueOf(zC) + "]";
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "BadgeDialogHandler", str);
            if (zC) {
                av.g gVar = (av.g) KoinJavaComponent.get$default(av.g.class, null, null, 6, null);
                bVar.f206156c = 1;
                objA = gVar.a(bVar);
                if (objA == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objA);
        com.garmin.android.apps.connectmobile.badges.service.model.u uVar = (com.garmin.android.apps.connectmobile.badges.service.model.u) objA;
        if (uVar != null) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "BadgeDialogHandler", "requestDialogData() -> unredeemedCodePopupDTO[" + uVar + "]");
            return new n.d(uVar);
        }
        return null;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        if (nVar instanceof n.d) {
            com.garmin.android.apps.connectmobile.badges.service.model.u uVar = ((n.d) nVar).f206174a;
            av.g gVar = (av.g) KoinJavaComponent.get$default(av.g.class, null, null, 6, null);
            uVar.h();
            gVar.getClass();
            gVar.f13085b.f(uVar);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
