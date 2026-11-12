package tb0;

import android.content.Context;
import android.net.Uri;
import b82.d1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.TaggingPrivacyActivity;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import f5.z0;
import h5.e0;
import i3.a1;
import i3.k4;
import i3.mh;
import i3.nj;
import i3.ua;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l72.f0;
import l72.i3;
import l72.j0;
import l72.p1;
import m4.b0;
import m92.h0;
import o4.d0;
import o4.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p3.x3;
import s5.x0;
import ug2.q0;
import vd0.n1;
import vd0.s0;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f163630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f163631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f163632d;

    public /* synthetic */ h(String str, e23.l lVar, k4 k4Var) {
        this.f163629a = 29;
        this.f163630b = str;
        this.f163632d = lVar;
        this.f163631c = k4Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e4  */
    private final Object a(Object obj, Object obj2) {
        b0 b0Var = (b0) this.f163630b;
        v72.b bVar = (v72.b) this.f163631c;
        x3 x3Var = (x3) this.f163632d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(aVar, p6.b.a(d92.b.f58623a, mVar), m1.f128891a);
            nj.f89109a.getClass();
            h4.r rVarG = c2.l.G(rVarE, nj.a(mVar));
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarG, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            l0 l0Var = (l0) x3Var.getF182175a();
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarA = m4.e.a(c2.l.C(u2Var.a(aVar, 0.9f, true), 0.0f, 0.0f, 8, 0.0f, 11), b0Var);
            boolean zR = mVar.r(bVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new v72.c.b(bVar);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v72.c.b(bVar);
                    mVar.K(objQ);
                }
            }
            v72.a.f176173a.getClass();
            p1.b(l0Var, rVarA, "Search", null, false, false, null, 0L, null, null, v72.a.f176174b, null, null, null, (e23.l) ((k23.g) objQ), mVar, 384, 6, 15352);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar = (com.garmin.android.apps.connectmobile.stress.presentation.view.a) this.f163630b;
        o53.b0 b0Var = (o53.b0) this.f163631c;
        a1 a1Var = (a1) this.f163632d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
        int i14 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(1131565269, new s0(aVar, i14, b0Var, a1Var), mVar), mVar, 6);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x011f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0150  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    private final Object c(Object obj, Object obj2) {
        h82.r rVar = (h82.r) this.f163630b;
        vu0.j jVar = (vu0.j) this.f163631c;
        b92.a aVar = (b92.a) this.f163632d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = vu0.j.f180247o;
        int i15 = 1;
        int i16 = 2;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = mVar.r(jVar);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new vu0.i(jVar, i15);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new vu0.i(jVar, i15);
                    mVar.K(objQ);
                }
            }
            rVar.B(R.string.lbl_how_it_works, null, false, (e23.a) objQ, mVar, 0, 6);
            if (jVar.f180254l) {
                mVar.C(2105112041);
                mVar.f();
            } else {
                mVar.C(2104618087);
                boolean zR2 = mVar.r(jVar);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new vu0.i(jVar, i16);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new vu0.i(jVar, i16);
                        mVar.K(objQ2);
                    }
                }
                rVar.B(R.string.lbl_sharing, null, false, (e23.a) objQ2, mVar, 0, 6);
                if (jVar.f180252j) {
                    mVar.C(2104757742);
                    boolean zR3 = mVar.r(jVar);
                    Object objQ3 = mVar.q();
                    if (zR3) {
                        objQ3 = new vu0.i(jVar, 3);
                        mVar.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new vu0.i(jVar, 3);
                            mVar.K(objQ3);
                        }
                    }
                    rVar.B(R.string.lbl_livetrack_profile_privacy, null, false, (e23.a) objQ3, mVar, 0, 6);
                    mVar.f();
                } else {
                    mVar.C(2104906697);
                    mVar.f();
                }
                if (jVar.f180248f) {
                    mVar.C(2104954840);
                    boolean zR4 = mVar.r(jVar);
                    Object objQ4 = mVar.q();
                    if (zR4) {
                        objQ4 = new vu0.i(jVar, 4);
                        mVar.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new vu0.i(jVar, 4);
                            mVar.K(objQ4);
                        }
                    }
                    int i17 = b92.a.f16960b;
                    rVar.B(R.string.lbl_grouptrack, aVar, false, (e23.a) objQ4, mVar, 0, 4);
                    mVar.f();
                } else {
                    mVar.C(2105094185);
                    mVar.f();
                }
                mVar.f();
            }
            boolean zR5 = mVar.r(jVar);
            Object objQ5 = mVar.q();
            if (zR5) {
                objQ5 = new vu0.i(jVar, 5);
                mVar.K(objQ5);
            } else {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new vu0.i(jVar, 5);
                    mVar.K(objQ5);
                }
            }
            rVar.B(R.string.live_track_auto_start, null, false, (e23.a) objQ5, mVar, 0, 6);
            if (jVar.f180250h) {
                mVar.C(2105263755);
                boolean zR6 = mVar.r(jVar);
                Object objQ6 = mVar.q();
                if (zR6) {
                    objQ6 = new vu0.i(jVar, 6);
                    mVar.K(objQ6);
                } else {
                    aVar2.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new vu0.i(jVar, 6);
                        mVar.K(objQ6);
                    }
                }
                rVar.B(R.string.lbl_show_course, null, false, (e23.a) objQ6, mVar, 0, 6);
                mVar.f();
            } else {
                mVar.C(2105384841);
                mVar.f();
            }
            if (jVar.f180254l) {
                mVar.C(2105836201);
                mVar.f();
            } else {
                mVar.C(2105441230);
                if (jVar.f180251i) {
                    mVar.C(2105483762);
                    boolean zR7 = mVar.r(jVar);
                    Object objQ7 = mVar.q();
                    if (zR7) {
                        objQ7 = new vu0.i(jVar, 7);
                        mVar.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new vu0.i(jVar, 7);
                            mVar.K(objQ7);
                        }
                    }
                    rVar.B(R.string.live_track_spectator_messaging, null, false, (e23.a) objQ7, mVar, 0, 6);
                    mVar.f();
                } else {
                    mVar.C(2105628873);
                    mVar.f();
                }
                if (jVar.f180249g) {
                    mVar.C(2105674195);
                    boolean zR8 = mVar.r(jVar);
                    Object objQ8 = mVar.q();
                    if (zR8) {
                        objQ8 = new vu0.i(jVar, 8);
                        mVar.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new vu0.i(jVar, 8);
                            mVar.K(objQ8);
                        }
                    }
                    rVar.B(R.string.lbl_feature_tour_strava_beacon, null, false, (e23.a) objQ8, mVar, 0, 6);
                    mVar.f();
                } else {
                    mVar.C(2105818345);
                    mVar.f();
                }
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005f  */
    private final Object d(Object obj, Object obj2) {
        h82.r rVar = (h82.r) this.f163630b;
        vu0.j jVar = (vu0.j) this.f163631c;
        Context context = (Context) this.f163632d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = vu0.j.f180247o;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            rVar.t(R.string.livetrack_help_text_message, mVar, 0);
            rVar.q(gl1.y.Q(mVar, R.string.livetrack_text_message_description_1), mVar, 0);
            if (jVar.f180253k) {
                mVar.C(749609946);
                mVar.f();
            } else {
                mVar.C(749319724);
                String strQ = gl1.y.Q(mVar, R.string.livetrack_connect_plus_learn_more);
                boolean zR = mVar.r(context);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new tz1.h(context, 11);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new tz1.h(context, 11);
                        mVar.K(objQ);
                    }
                }
                rVar.w(strQ, null, (e23.a) objQ, mVar, 0, 2);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:197:0x076e  */
    /* JADX WARN: Code duplicated, block: B:237:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:250:0x0971  */
    /* JADX WARN: Code duplicated, block: B:300:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:358:0x0c87  */
    /* JADX WARN: Code duplicated, block: B:37:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x03ac  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        h4.r.a aVar;
        float f14;
        float f15;
        long jB;
        int i14 = this.f163629a;
        int i15 = 9;
        p3.m.a aVar2 = p3.m.f135153a;
        int i16 = 1;
        Object obj3 = this.f163631c;
        Object obj4 = this.f163632d;
        Object obj5 = this.f163630b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                k.d((h4.r) obj5, (hv.a) obj3, (e23.l) obj4, (p3.m) obj, p0.t(391));
                return Unit.INSTANCE;
            case 1:
                sg1.b bVar = (sg1.b) obj5;
                e23.a aVar3 = (e23.a) obj3;
                p3.p1 p1Var = (p3.p1) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String str = bVar.f159195e;
                    i53.f fVarA = i53.a.a(new i3("MENU_ITEM_DELETE_BACKUP_ID", gl1.y.Q(mVar, R.string.lbl_delete), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    Object objQ = mVar.q();
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sk0.n(p1Var, i15);
                        mVar.K(objQ);
                    }
                    z02.f.d(str, null, null, aVar3, null, fVarA, (e23.l) objQ, mVar, 14680064, 54);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                tg1.o.b((List) obj5, (e23.l) obj4, (sg1.d) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                pg1.a aVar4 = (pg1.a) obj5;
                sg1.b bVar2 = (sg1.b) obj3;
                e23.a aVar5 = (e23.a) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    f0 f0Var = f0.f110999a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_device_migration_restore);
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f16 = eVar.f97920e;
                    float f17 = 0;
                    g6.f.a aVar7 = g6.f.f75994b;
                    h4.r rVarB = c2.l.B(aVar6, f16, f17, f17, eVar.f97917b);
                    boolean zB = mVar2.B(aVar4) | mVar2.r(bVar2) | mVar2.B(aVar5);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = new sg0.j(aVar4, 22, bVar2, aVar5);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new sg0.j(aVar4, 22, bVar2, aVar5);
                            mVar2.K(objQ2);
                        }
                    }
                    f0Var.k(strQ, rVarB, false, (e23.a) objQ2, mVar2, 0, 4);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                tw.a.d((kw.o) obj5, (kw.m) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                tw.a.a((qw.g) obj5, (kw.p) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                tw.c.a((Context) obj5, (kw.k) obj3, (kw.m) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.u) obj3;
                List list = (List) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                list.getClass();
                ((p3.p1) obj5).setValue(list);
                uVar.f46284n = p005kotlin.jvm.internal.s.g(((j0) ((List) obj4).get(iIntValue3)).f111072a, uVar.requireContext().getString(R.string.workout_pool_swim)) ? m52.c.LAP_SWIMMING : m52.c.OPEN_WATER_SWIMMING;
                InlineUnitsTextFieldView inlineUnitsTextFieldView = uVar.f46276f;
                if (inlineUnitsTextFieldView == null) {
                    p005kotlin.jvm.internal.s.m("swimDistanceView");
                    throw null;
                }
                InlineUnitsTextFieldView.a currentUnit = inlineUnitsTextFieldView.getCurrentUnit();
                currentUnit.getClass();
                bg0.a.b bVar3 = ((eg0.b) currentUnit).f63972a;
                InlineUnitsTextFieldView inlineUnitsTextFieldView2 = uVar.f46276f;
                if (inlineUnitsTextFieldView2 == null) {
                    p005kotlin.jvm.internal.s.m("swimDistanceView");
                    throw null;
                }
                Number currentNumber = inlineUnitsTextFieldView2.getCurrentNumber();
                uVar.C6().N6(currentNumber != null ? new bg0.a.c(currentNumber, bVar3) : null, uVar.f46284n);
                return Unit.INSTANCE;
            case 8:
                Float f18 = (Float) obj5;
                rz1.h hVar = (rz1.h) obj3;
                i53.c cVar = (i53.c) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    tz1.g.c(f18, hVar != null ? hVar.f155232c : null, hVar != null ? hVar.f155233d : null, cVar, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 9:
                TaggingPrivacyActivity taggingPrivacyActivity = (TaggingPrivacyActivity) obj5;
                com.garmin.android.apps.connectmobile.userprofile.model.o oVar = (com.garmin.android.apps.connectmobile.userprofile.model.o) obj3;
                p3.p1 p1Var2 = (p3.p1) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                TaggingPrivacyActivity.a aVar9 = TaggingPrivacyActivity.f47117a;
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar4, R.string.privacy_setting_tagging_title);
                    boolean zR = mVar4.r(taggingPrivacyActivity) | mVar4.k(oVar.ordinal());
                    Object objQ3 = mVar4.q();
                    if (zR) {
                        objQ3 = new u12.r(taggingPrivacyActivity, oVar, p1Var2, 1);
                        mVar4.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new u12.r(taggingPrivacyActivity, oVar, p1Var2, 1);
                            mVar4.K(objQ3);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ3, null, strQ2, mVar4, null);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                u70.g.b((u70.b.a) obj5, (u70.a) obj3, (e23.l) obj4, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 11:
                aa1.g gVar = (aa1.g) obj5;
                e23.a<Unit> aVar10 = (e23.a) obj3;
                e23.a<Unit> aVar11 = (e23.a) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar12 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar13 = h4.d.a.f81536n;
                    c2.z zVarA = c2.y.a(kVar, aVar13, mVar5, 0);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    h4.r rVarC = h4.k.c(aVar12, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar14);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar5);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar5);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar4);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar5);
                    c2.b0 b0Var = c2.b0.f22601a;
                    boolean z14 = gVar.f2287m;
                    boolean z15 = gVar.f2288n;
                    String str2 = gVar.f2282h;
                    boolean z16 = gVar.f2276b;
                    if (z14) {
                        mVar5.C(693319467);
                        String upperCase = gl1.y.Q(mVar5, R.string.social_new_badge_hint).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        d92.b.f58623a.getClass();
                        long jE = d92.b.a(mVar5).e().e();
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        aVar = aVar12;
                        g02.g.a(upperCase, 0L, jE, c2.l.C(aVar12, eVar3.f97920e, eVar3.f97918c, 0.0f, 0.0f, 12), eVar3.f97920e, eVar3.f97918c, mVar5, 0, 2);
                        mVar5.f();
                    } else {
                        aVar = aVar12;
                        mVar5.C(693908560);
                        mVar5.f();
                    }
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f19 = eVar4.f97920e;
                    float f22 = eVar4.f97916a;
                    float f24 = eVar4.f97918c;
                    if (!gVar.f2287m) {
                        f14 = f19;
                    }
                    if (z16) {
                        f14 = f24;
                        f15 = f24;
                    } else {
                        f14 = f24;
                        f15 = f19;
                    }
                    h4.r rVarB2 = c2.l.B(rVarF, f19, f14, f19, f15);
                    h4.g.b bVar5 = h4.d.a.f81534l;
                    s2 s2VarA = q2.a(c2.j.i(f19), bVar5, mVar5, 48);
                    int iHashCode2 = Long.hashCode(mVar5.getU());
                    i2 i2VarX2 = mVar5.x();
                    h4.r rVarC2 = h4.k.c(rVarB2, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar14);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar2, s2VarA, mVar5);
                    b4.c(c1623g, i2VarX2, mVar5);
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, mVar5);
                    u2 u2Var = u2.f22900a;
                    z0 z0VarD = c2.q.d(h4.d.a.f81527e, false);
                    int iHashCode3 = Long.hashCode(mVar5.getU());
                    i2 i2VarX3 = mVar5.x();
                    h4.r rVarC3 = h4.k.c(aVar, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar14);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar2, z0VarD, mVar5);
                    b4.c(c1623g, i2VarX3, mVar5);
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar5, iHashCode3, bVar4);
                    }
                    b4.c(fVar, rVarC3, mVar5);
                    c2.u uVar2 = c2.u.f22885a;
                    j92.c cVar2 = j92.b.f97901d;
                    c2.q.a(u1.n.e(l4.k.b(x2.q(aVar, cVar2.f97906e), k2.i.f102406a), com.nimbusds.jose.shaded.gson.internal.a.c(mVar5), m1.f128891a), mVar5, 0);
                    Integer num = gVar.f2286l;
                    if (num == null) {
                        mVar5.C(1554320568);
                        mVar5.f();
                    } else {
                        mVar5.C(1554320569);
                        d1.f16531a.a(cVar2.f97906e, num.intValue(), cVar2.f97905d, 0L, d92.b.a(mVar5).c().g(), mVar5, 0, 8);
                        Unit unit = Unit.INSTANCE;
                        mVar5.f();
                    }
                    mVar5.y();
                    c2.j.i iVarI = c2.j.i(f22);
                    h4.r rVarA = u2Var.a(aVar, 1.0f, true);
                    c2.z zVarA2 = c2.y.a(iVarI, aVar13, mVar5, 0);
                    int iHashCode4 = Long.hashCode(mVar5.getU());
                    i2 i2VarX4 = mVar5.x();
                    h4.r rVarC4 = h4.k.c(rVarA, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar14);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar2, zVarA2, mVar5);
                    b4.c(c1623g, i2VarX4, mVar5);
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar5, iHashCode4, bVar4);
                    }
                    b4.c(fVar, rVarC4, mVar5);
                    boolean z17 = gVar.f2279e != null;
                    boolean zR2 = mVar5.r(gVar);
                    Object objQ4 = mVar5.q();
                    if (zR2) {
                        objQ4 = new u91.k(gVar, 0);
                        mVar5.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new u91.k(gVar, 0);
                            mVar5.K(objQ4);
                        }
                    }
                    h4.r rVarA2 = wz1.i.a((e23.l) objQ4, aVar, z17);
                    String str3 = gVar.f2278d;
                    String str4 = str3 == null ? "" : str3;
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97931h;
                    mh.c(str4, rVarA2, zl.a.a(mVar5), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(x0Var), mVar5, 0, 0, 131064);
                    if (g22.n.d(str2)) {
                        mVar5.C(1067267138);
                        String str5 = gVar.f2280f;
                        String str6 = (str5 == null || d53.w.J(str5)) ? null : str5;
                        if (str6 == null) {
                            mVar5.C(-1274457089);
                            mVar5.f();
                        } else {
                            mVar5.C(-1274457088);
                            mh.c(str6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.c.e(j92.f.f97935l), mVar5), mVar5, 0, 0, 131070);
                            Unit unit2 = Unit.INSTANCE;
                            mVar5.f();
                        }
                        mVar5.f();
                    } else {
                        mVar5.C(-1274164138);
                        mVar5.f();
                    }
                    String str7 = gVar.f2284j;
                    if (str7 == null) {
                        mVar5.C(-1274054740);
                        mVar5.f();
                    } else {
                        mVar5.C(-1274054739);
                        s2 s2VarA2 = q2.a(c2.j.i(f22), bVar5, mVar5, 48);
                        int iHashCode5 = Long.hashCode(mVar5.getU());
                        i2 i2VarX5 = mVar5.x();
                        h4.r rVarC5 = h4.k.c(aVar, mVar5);
                        if (mVar5.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar14);
                        } else {
                            mVar5.c();
                        }
                        b4.c(eVar2, s2VarA2, mVar5);
                        b4.c(c1623g, i2VarX5, mVar5);
                        if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode5))) {
                            v.h.z(iHashCode5, mVar5, iHashCode5, bVar4);
                        }
                        b4.c(fVar, rVarC5, mVar5);
                        String strQ3 = gl1.y.Q(mVar5, R.string.lbl_previous);
                        x0 x0Var2 = j92.f.f97935l;
                        mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar5), mVar5, 0, 0, 131070);
                        boolean z18 = gVar.f2285k != null;
                        boolean zR3 = mVar5.r(gVar);
                        Object objQ5 = mVar5.q();
                        if (zR3) {
                            objQ5 = new u91.k(gVar, 1);
                            mVar5.K(objQ5);
                        } else {
                            aVar2.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new u91.k(gVar, 1);
                                mVar5.K(objQ5);
                            }
                        }
                        mh.c(str7, wz1.i.a((e23.l) objQ5, aVar, z18), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar5), mVar5, 0, 0, 131068);
                        mVar5.y();
                        Unit unit3 = Unit.INSTANCE;
                        mVar5.f();
                    }
                    mVar5.y();
                    if (z15) {
                        mVar5.C(71211055);
                        h4.r rVarQ = x2.q(aVar, f19);
                        long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar5);
                        long jG = d92.b.a(mVar5).c().g();
                        g6.f.a aVar15 = g6.f.f75994b;
                        ua.a(2, 0.0f, 0, 384, 48, jX, jG, rVarQ, mVar5);
                        mVar5.f();
                    } else {
                        mVar5.C(71587178);
                        boolean z19 = gVar.f2283i != null;
                        boolean zR4 = mVar5.r(gVar);
                        Object objQ6 = mVar5.q();
                        if (zR4) {
                            objQ6 = new u91.k(gVar, 2);
                            mVar5.K(objQ6);
                        } else {
                            aVar2.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new u91.k(gVar, 2);
                                mVar5.K(objQ6);
                            }
                        }
                        mh.c(str2 == null ? "" : str2, wz1.i.a((e23.l) objQ6, aVar, z19), zl.a.a(mVar5), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar5, 0, 0, 131064);
                        mVar5.f();
                    }
                    mVar5.y();
                    if (z16) {
                        mVar5.C(699541880);
                        c2.j.i iVarJ = c2.j.j(f19, h4.d.a.f81538p);
                        h4.r rVarF2 = x2.f(aVar, 1.0f);
                        float f25 = eVar4.f97920e;
                        h4.r rVarC6 = c2.l.C(rVarF2, f25, 0.0f, f25, eVar4.f97918c, 2);
                        s2 s2VarA3 = q2.a(iVarJ, bVar5, mVar5, 48);
                        int iHashCode6 = Long.hashCode(mVar5.getU());
                        i2 i2VarX6 = mVar5.x();
                        h4.r rVarC7 = h4.k.c(rVarC6, mVar5);
                        if (mVar5.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar14);
                        } else {
                            mVar5.c();
                        }
                        b4.c(eVar2, s2VarA3, mVar5);
                        b4.c(c1623g, i2VarX6, mVar5);
                        if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode6))) {
                            v.h.z(iHashCode6, mVar5, iHashCode6, bVar4);
                        }
                        b4.c(fVar, rVarC7, mVar5);
                        f0.a aVar16 = f0.a.f111000a;
                        aVar16.j(gl1.y.Q(mVar5, R.string.lbl_decline), null, !z15, aVar10, mVar5, 0, 2);
                        aVar16.f(gl1.y.Q(mVar5, R.string.lbl_accept), null, !z15, aVar11, mVar5, 0, 2);
                        mVar5.y();
                        mVar5.f();
                    } else {
                        mVar5.C(700689872);
                        mVar5.f();
                    }
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                int i17 = ub1.b.f169785e;
                ((ub1.b) obj3).a(p0.t(7), (e23.a) obj4, (h4.r) obj5, (p3.m) obj);
                return Unit.INSTANCE;
            case 13:
                uc1.f fVar2 = (uc1.f) obj5;
                fg0.k kVar2 = (fg0.k) obj3;
                e23.a aVar17 = (e23.a) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    uc1.d.a(fVar2, kVar2, aVar17, mVar6, fg0.k.X << 3, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                q0.c((z3.e) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ut0.f.a((List) obj5, (List) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                uu1.j.a((String) obj5, (String) obj3, (b92.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                i53.c<kw.c> cVar3 = (i53.c) obj5;
                Context context = (Context) obj3;
                String str8 = (String) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar18 = h4.r.S;
                    h4.r rVarD = x2.d(aVar18, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.b bVar6 = c2.j.f22695e;
                    h4.d.f81522a.getClass();
                    c2.z zVarA3 = c2.y.a(bVar6, h4.d.a.f81536n, mVar7, 6);
                    int iHashCode7 = Long.hashCode(mVar7.getU());
                    i2 i2VarX7 = mVar7.x();
                    h4.r rVarC8 = h4.k.c(rVarD, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar19 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar19);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX7, mVar7);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar7, iHashCode7, bVar7);
                    }
                    b4.c(h5.g.a.f81807d, rVarC8, mVar7);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (cVar3 == null || cVar3.isEmpty()) {
                        mVar7.C(725106932);
                        String strQ4 = gl1.y.Q(mVar7, R.string.common_no_data);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar7), mVar7, 0, 0, 131070);
                        mVar7.f();
                    } else {
                        mVar7.C(725346748);
                        h4.r rVarA3 = b0Var2.a(x2.f(aVar18, 1.0f), 1.0f, true);
                        ArrayList arrayList = new ArrayList();
                        for (kw.c cVar4 : cVar3) {
                            h0.e.a aVar20 = new h0.e.a(cVar4.f106830a, 1.0f);
                            o92.e eVar5 = o92.e.CIRCLE;
                            Integer num2 = cVar4.f106831b;
                            if (num2 != null && num2.intValue() == -1) {
                                num2 = null;
                            }
                            if (num2 != null) {
                                jB = o4.f0.b(context.getColor(num2.intValue()));
                            } else {
                                d0.f128823b.getClass();
                                jB = d0.f128832k;
                            }
                            arrayList.add(new h0.e.d(aVar20, new o92.b(eVar5, jB, null, 4, null), null, 4, null));
                        }
                        i53.c cVarE = i53.a.e(arrayList);
                        Float fValueOf = Float.valueOf(e32.o.f62807j.f62819a);
                        float fB = uw.b.b(mVar7);
                        h0.e.a aVar21 = new h0.e.a(0.0f, 1.0f);
                        o92.e eVar6 = o92.e.CIRCLE;
                        gl.c.f77766a.getClass();
                        m92.w.a(rVarA3, cVarE, fValueOf, fB, new h0.e.d(aVar21, new o92.b(eVar6, gl.c.a(mVar7).g(), null, 4, null), null, 4, null), g6.f.a(uw.b.b(mVar7) / 3), Float.valueOf(0.0f), Float.valueOf(2.0f), mVar7, 905969664);
                        mVar7.f();
                    }
                    String strQ5 = gl1.y.Q(mVar7, R.string.label_last_7d);
                    h4.r.a aVar22 = h4.r.S;
                    boolean zB2 = mVar7.B(str8);
                    Object objQ7 = mVar7.q();
                    if (zB2) {
                        objQ7 = new u91.c(str8, 7);
                        mVar7.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new u91.c(str8, 7);
                            mVar7.K(objQ7);
                        }
                    }
                    h4.r rVarF3 = x2.f(p5.v.c((e23.l) objQ7, aVar22, false), 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar7 = j92.b.f97899b;
                    h4.r rVarC9 = c2.l.C(rVarF3, 0.0f, eVar7.f97917b, 0.0f, eVar7.f97920e, 5);
                    d92.b.f58624b.getClass();
                    mh.c(strQ5, rVarC9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar7), mVar7, 0, 0, 131068);
                    mVar7.y();
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ux.f.a(p0.t(1), (List) obj5, (LocalDate) obj3, (LocalDate) obj4, (p3.m) obj);
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                v40.e.a((k30.k) obj5, (i53.c) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                v50.j.a((x50.e) obj3, (e23.l) obj4, (h4.r) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                return a(obj, obj2);
            case 22:
                ((Integer) obj2).getClass();
                vb1.i.a(p0.t(1), (h4.r) obj5, (String) obj3, (String) obj4, (p3.m) obj);
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                vd0.m.a((oe0.d) obj5, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(9));
                return Unit.INSTANCE;
            case 24:
                zc.d dVar = (zc.d) obj5;
                oe0.g gVar2 = (oe0.g) obj3;
                Context context2 = (Context) obj4;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    boolean z24 = dVar.d().f196385a instanceof yc.z0.b;
                    m3.s sVarE = m3.l.e(mVar8);
                    boolean zR5 = mVar8.r(dVar);
                    Object objQ8 = mVar8.q();
                    if (zR5) {
                        objQ8 = new et1.s0(dVar, 11);
                        mVar8.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new et1.s0(dVar, 11);
                            mVar8.K(objQ8);
                        }
                    }
                    m3.l.b(z24, (e23.a) objQ8, null, sVarE, null, null, z3.f.c(1840122964, new ng2.i(dVar, 29, gVar2, context2), mVar8), mVar8, 1572864, 52);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                n1.c((Uri) obj5, (String) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                return b(obj, obj2);
            case 27:
                return c(obj, obj2);
            case 28:
                return d(obj, obj2);
            default:
                String str9 = (String) obj5;
                e23.l lVar = (e23.l) obj4;
                k4 k4Var = (k4) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar23 = h4.r.S;
                    boolean zB3 = mVar9.B(lVar) | mVar9.B(k4Var);
                    Object objQ9 = mVar9.q();
                    if (zB3) {
                        objQ9 = new vv0.n(i16, lVar, k4Var);
                        mVar9.K(objQ9);
                    } else {
                        aVar2.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new vv0.n(i16, lVar, k4Var);
                            mVar9.K(objQ9);
                        }
                    }
                    h4.r rVarD2 = u1.w.d(aVar23, false, null, null, (e23.a) objQ9, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar8 = j92.b.f97899b;
                    h4.r rVarC10 = c2.l.C(rVarD2, eVar8.f97917b, 0.0f, eVar8.f97921f, eVar8.f97920e, 2);
                    d92.b.f58624b.getClass();
                    mh.c(str9, rVarC10, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar9), mVar9, 0, 0, 131068);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(Object obj, e23.l lVar, Object obj2, int i14, int i15) {
        this.f163629a = i15;
        this.f163630b = obj;
        this.f163632d = lVar;
        this.f163631c = obj2;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f163629a = i15;
        this.f163630b = obj;
        this.f163631c = obj2;
        this.f163632d = obj3;
    }

    public /* synthetic */ h(Object obj, int i14, Object obj2, Object obj3) {
        this.f163629a = i14;
        this.f163630b = obj;
        this.f163631c = obj2;
        this.f163632d = obj3;
    }

    public /* synthetic */ h(ub1.b bVar, h4.r rVar, e23.a aVar, int i14) {
        this.f163629a = 12;
        this.f163631c = bVar;
        this.f163630b = rVar;
        this.f163632d = aVar;
    }

    public /* synthetic */ h(x50.e eVar, e23.l lVar, h4.r rVar, int i14) {
        this.f163629a = 20;
        this.f163631c = eVar;
        this.f163632d = lVar;
        this.f163630b = rVar;
    }
}
