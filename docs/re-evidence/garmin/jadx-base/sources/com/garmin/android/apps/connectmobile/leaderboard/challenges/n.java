package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.os.Bundle;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import java.util.List;
import mt0.m2;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/n;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/d0;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends d0 {
    public static final a I = new a(null);
    public final o13.t F = o13.m.b(new mh1.i(this, 9));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37679a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f37679a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37679a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37679a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void H6(final int i14, int i15) {
        if (this.D) {
            J6(false);
            return;
        }
        String str = f7().f37993g;
        if (str == null) {
            return;
        }
        if (!x.t(f7())) {
            pt0.f fVarD7 = d7();
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            fVarD7.getClass();
            final int i16 = 1;
            xy2.b.K(fVarD7, new pt0.b(fVarD7, str, dateTimeNow, i14, i15, null)).f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: mt0.m0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.n f120711b;

                {
                    this.f120711b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i17 = i16;
                    int i18 = i14;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.n nVar = this.f120711b;
                    com.garmin.android.apps.connectmobile.g3<? extends List<? extends AdHocChallengePlayerDTO>> g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                    switch (i17) {
                        case 0:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.n.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.n.I;
                            g3Var.getClass();
                            nVar.g7(g3Var, i18);
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.n.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.n.I;
                            g3Var.getClass();
                            nVar.g7(g3Var, i18);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
            return;
        }
        String strB = c22.j0.b(DateTime.now(), "yyyy-MM-dd", null);
        pt0.f fVarD8 = d7();
        if (strB == null) {
            strB = "";
        }
        fVarD8.getClass();
        final int i17 = 0;
        xy2.b.K(fVarD8, new pt0.d(fVarD8, str, strB, i14, i15, null)).f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: mt0.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.n f120711b;

            {
                this.f120711b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                int i19 = i14;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.n nVar = this.f120711b;
                com.garmin.android.apps.connectmobile.g3<? extends List<? extends AdHocChallengePlayerDTO>> g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.n.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.n.I;
                        g3Var.getClass();
                        nVar.g7(g3Var, i19);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.n.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.n.I;
                        g3Var.getClass();
                        nVar.g7(g3Var, i19);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.d0
    public final m2 e7() {
        return (mt0.g0) this.F.getValue();
    }

    @Override // mt0.h2, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        w6((mt0.g0) this.F.getValue());
        u6();
        this.f7311e.setDividerHeight(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/n$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
