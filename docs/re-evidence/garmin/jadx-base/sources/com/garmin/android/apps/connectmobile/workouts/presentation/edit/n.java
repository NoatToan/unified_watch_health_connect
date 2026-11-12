package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/n;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/p;", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "stepNode", "<init>", "(Ll52/i$a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements r52.b<q, p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49207a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.q<String, String, e23.a<? extends Unit>, Unit> {
        public a(Object obj) {
            super(3, obj, p.class, "downloadAudioNote", "downloadAudioNote(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // e23.q
        public final Unit invoke(String str, String str2, e23.a<? extends Unit> aVar) {
            String str3 = str;
            String str4 = str2;
            e23.a<? extends Unit> aVar2 = aVar;
            str3.getClass();
            str4.getClass();
            aVar2.getClass();
            ((p) this.receiver).t(aVar2, str3, str4);
            return Unit.INSTANCE;
        }
    }

    public n(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
        aVar.getClass();
        this.f49207a = aVar;
    }

    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(p pVar, q qVar, p3.m mVar, int i14) {
        int i15;
        pVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(354846351);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(pVar) : o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) this.f49207a.getData();
            if (qVar.f49269y) {
                o0VarE.C(1314796909);
                w13.b.c(z3.f.c(-1284020133, new f62.b0(qVar, this, j0Var, pVar), o0VarE), o0VarE, 6);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1313320999);
                w02.b0.b(z3.f.c(-206869710, new f62.b0(qVar, j0Var, this, pVar), o0VarE), o0VarE, 6);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.a0(this, pVar, qVar, i14, 9);
        }
    }
}
