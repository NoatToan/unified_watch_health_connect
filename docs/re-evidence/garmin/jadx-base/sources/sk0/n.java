package sk0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.TaggingPrivacyActivity;
import i3.df;
import i3.pc;
import java.text.NumberFormat;
import java.util.List;
import l72.i3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f159761b;

    public /* synthetic */ n(TaggingPrivacyActivity taggingPrivacyActivity, p3.p1 p1Var, int i14) {
        this.f159760a = i14;
        this.f159761b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        com.garmin.android.apps.connectmobile.userprofile.model.o oVar;
        com.garmin.android.apps.connectmobile.userprofile.model.o oVar2;
        int i14 = this.f159760a;
        p3.p1 p1Var = this.f159761b;
        switch (i14) {
            case 0:
                p1Var.setValue(n0.b((n0) p1Var.getF182175a(), null, null, null, null, null, null, null, null, null, null, ((Boolean) obj).booleanValue(), null, null, 7167));
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                str.getClass();
                p1Var.setValue(n0.b((n0) p1Var.getF182175a(), null, null, null, null, null, null, null, null, null, null, false, str, null, 6143));
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj;
                list.getClass();
                p1Var.setValue(n0.b((n0) p1Var.getF182175a(), null, null, null, null, null, null, null, null, null, null, false, null, i53.a.e(p13.h0.S0(p13.h0.C0(((n0) p1Var.getF182175a()).f159774m, list), 10)), 4095));
                return Unit.INSTANCE;
            case 3:
                y22.x xVar = (y22.x) obj;
                xVar.getClass();
                p1Var.setValue(n0.b((n0) p1Var.getF182175a(), null, null, null, null, null, null, null, null, null, null, false, null, i53.a.e(p13.h0.y0(((n0) p1Var.getF182175a()).f159774m, xVar)), 4095));
                return Unit.INSTANCE;
            case 4:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "ADD")) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 5:
                f5.c0 c0Var = (f5.c0) obj;
                c0Var.getClass();
                p1Var.setValue(Integer.valueOf((int) Float.intBitsToFloat((int) (f5.d0.d(c0Var) & 4294967295L))));
                return Unit.INSTANCE;
            case 6:
                Double d14 = (Double) obj;
                pq1.d dVar = (pq1.d) p1Var.getF182175a();
                if (d14 != null) {
                    dVar.getClass();
                    String str2 = NumberFormat.getIntegerInstance().format((long) d14.doubleValue());
                    if (str2 != null) {
                        return str2;
                    }
                }
                return dVar.f();
            case 7:
                tf0.l lVar = (tf0.l) obj;
                lVar.getClass();
                p1Var.setValue(lVar);
                return Unit.INSTANCE;
            case 8:
                df dfVar = (df) obj;
                dfVar.getClass();
                if (dfVar != df.Settled) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Boolean.TRUE;
            case 9:
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var2.f111063a, "MENU_ITEM_DELETE_BACKUP_ID")) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                p1Var.setValue(str3);
                return Unit.INSTANCE;
            case 11:
                String str4 = (String) obj;
                str4.getClass();
                p1Var.setValue(str4);
                return Unit.INSTANCE;
            case 12:
                b82.t0.a aVar = (b82.t0.a) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                aVar.getClass();
                int i15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.c.f46116a[aVar.ordinal()];
                if (i15 == 1) {
                    p1Var.setValue(Boolean.FALSE);
                } else {
                    if (i15 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 13:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                p1Var.setValue(bool);
                return Unit.INSTANCE;
            case 14:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                p1Var.setValue(bool2);
                return Unit.INSTANCE;
            case 15:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue = bool3.booleanValue();
                FollowerRequestsPrivacyActivity.a aVar5 = FollowerRequestsPrivacyActivity.f47109c;
                if (zBooleanValue != ((Boolean) p1Var.getF182175a()).booleanValue()) {
                    p1Var.setValue(bool3);
                }
                return Unit.INSTANCE;
            case 16:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                TaggingPrivacyActivity.a aVar6 = TaggingPrivacyActivity.f47117a;
                com.garmin.android.apps.connectmobile.userprofile.model.o oVar3 = (com.garmin.android.apps.connectmobile.userprofile.model.o) p1Var.getF182175a();
                String strH = com.airbnb.lottie.animation.keyframe.a.h("switch to ", zBooleanValue2);
                i2.a aVar7 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar7.getClass();
                i2.a.b(a2Var, "TaggingPrivacyActivity", strH);
                if (zBooleanValue2) {
                    int i16 = TaggingPrivacyActivity.b.f47118a[oVar3.ordinal()];
                    if (i16 == 1) {
                        i2.a.b(a2Var, "TaggingPrivacyActivity", "tagPermission from " + oVar3 + " to TagPermission.FOLLOWINGS");
                        oVar = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWINGS;
                    } else if (i16 == 2) {
                        i2.a.b(a2Var, "TaggingPrivacyActivity", "tagPermission from " + oVar3 + " to TagPermission.FOLLOWINGS");
                        oVar = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWINGS;
                    } else if (i16 == 3) {
                        i2.a.b(a2Var, "TaggingPrivacyActivity", "tagPermission from " + oVar3 + " to TagPermission.FOLLOWERS_AND_FOLLOWINGS");
                        oVar = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS_AND_FOLLOWINGS;
                    } else {
                        if (i16 != 4) {
                            lc.u0.r();
                            return null;
                        }
                        i2.a.b(a2Var, "TaggingPrivacyActivity", "tagPermission from " + oVar3 + " to TagPermission.FOLLOWERS_AND_FOLLOWINGS");
                        oVar = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS_AND_FOLLOWINGS;
                    }
                    p1Var.setValue(oVar);
                    return Unit.INSTANCE;
                }
                int i17 = TaggingPrivacyActivity.b.f47118a[oVar3.ordinal()];
                if (i17 == 1) {
                    i2.a.b(a2Var, "TaggingPrivacyActivity", "tagPermission from " + oVar3 + " to TagPermission.NONE");
                    oVar = com.garmin.android.apps.connectmobile.userprofile.model.o.NONE;
                } else if (i17 == 2) {
                    i2.a.b(a2Var, "TaggingPrivacyActivity", "tagPermission from " + oVar3 + " to TagPermission.NONE");
                    oVar = com.garmin.android.apps.connectmobile.userprofile.model.o.NONE;
                } else if (i17 == 3) {
                    i2.a.b(a2Var, "TaggingPrivacyActivity", "tagPermission from " + oVar3 + " to TagPermission.FOLLOWERS");
                    oVar = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS;
                } else {
                    if (i17 != 4) {
                        lc.u0.r();
                        return null;
                    }
                    i2.a.b(a2Var, "TaggingPrivacyActivity", "tagPermission from " + oVar3 + " to TagPermission.FOLLOWERS");
                    oVar = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS;
                }
                p1Var.setValue(oVar);
                return Unit.INSTANCE;
            case 17:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                TaggingPrivacyActivity.a aVar8 = TaggingPrivacyActivity.f47117a;
                com.garmin.android.apps.connectmobile.userprofile.model.o oVar4 = (com.garmin.android.apps.connectmobile.userprofile.model.o) p1Var.getF182175a();
                String strH2 = com.airbnb.lottie.animation.keyframe.a.h("switch to ", zBooleanValue3);
                i2.a aVar9 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar9.getClass();
                i2.a.b(a2Var2, "TaggingPrivacyActivity", strH2);
                if (zBooleanValue3) {
                    int i18 = TaggingPrivacyActivity.b.f47118a[oVar4.ordinal()];
                    if (i18 == 1) {
                        i2.a.b(a2Var2, "TaggingPrivacyActivity", "tagPermission from " + oVar4 + " to TagPermission.FOLLOWERS");
                        oVar2 = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS;
                    } else if (i18 == 2) {
                        i2.a.b(a2Var2, "TaggingPrivacyActivity", "tagPermission from " + oVar4 + " to TagPermission.FOLLOWERS_AND_FOLLOWINGS");
                        oVar2 = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS_AND_FOLLOWINGS;
                    } else if (i18 == 3) {
                        i2.a.b(a2Var2, "TaggingPrivacyActivity", "tagPermission from " + oVar4 + " to TagPermission.FOLLOWERS");
                        oVar2 = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS;
                    } else {
                        if (i18 != 4) {
                            lc.u0.r();
                            return null;
                        }
                        i2.a.b(a2Var2, "TaggingPrivacyActivity", "tagPermission from " + oVar4 + " to TagPermission.FOLLOWERS_AND_FOLLOWINGS");
                        oVar2 = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS_AND_FOLLOWINGS;
                    }
                    p1Var.setValue(oVar2);
                    return Unit.INSTANCE;
                }
                int i19 = TaggingPrivacyActivity.b.f47118a[oVar4.ordinal()];
                if (i19 == 1) {
                    i2.a.b(a2Var2, "TaggingPrivacyActivity", "tagPermission from " + oVar4 + " to TagPermission.NONE");
                    oVar2 = com.garmin.android.apps.connectmobile.userprofile.model.o.NONE;
                } else if (i19 == 2) {
                    i2.a.b(a2Var2, "TaggingPrivacyActivity", "tagPermission from " + oVar4 + " to TagPermission.FOLLOWINGS");
                    oVar2 = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWINGS;
                } else if (i19 == 3) {
                    i2.a.b(a2Var2, "TaggingPrivacyActivity", "tagPermission from " + oVar4 + " to TagPermission.NONE");
                    oVar2 = com.garmin.android.apps.connectmobile.userprofile.model.o.NONE;
                } else {
                    if (i19 != 4) {
                        lc.u0.r();
                        return null;
                    }
                    i2.a.b(a2Var2, "TaggingPrivacyActivity", "tagPermission from " + oVar4 + " to TagPermission.FOLLOWINGS");
                    oVar2 = com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWINGS;
                }
                p1Var.setValue(oVar2);
                return Unit.INSTANCE;
            case 18:
                w50.d dVar2 = (w50.d) obj;
                dVar2.getClass();
                p1Var.setValue(dVar2);
                return Unit.INSTANCE;
            case 19:
                u70.a aVar10 = (u70.a) obj;
                aVar10.getClass();
                p1Var.setValue(aVar10);
                return Unit.INSTANCE;
            case 20:
                String str5 = (String) obj;
                str5.getClass();
                p1Var.setValue(str5);
                return Unit.INSTANCE;
            case 21:
                String str6 = (String) obj;
                str6.getClass();
                p1Var.setValue(str6);
                return Unit.INSTANCE;
            case 22:
                pc pcVar = (pc) obj;
                pcVar.getClass();
                return Boolean.valueOf((pcVar == pc.Hidden && (((fg2.a) p1Var.getF182175a()) instanceof fg2.a.d)) ? false : true);
            case 23:
                String str7 = (String) obj;
                str7.getClass();
                p1Var.setValue(str7);
                return Unit.INSTANCE;
            case 24:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                p1Var.setValue(bool4);
                return Unit.INSTANCE;
            case 25:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                p1Var.setValue(bool5);
                return Unit.INSTANCE;
            case 26:
                String str8 = (String) obj;
                str8.getClass();
                p1Var.setValue(str8);
                return Unit.INSTANCE;
            case 27:
                b82.t0.a aVar11 = (b82.t0.a) obj;
                aVar11.getClass();
                p1Var.setValue(Boolean.valueOf(aVar11 == b82.t0.a.ON_FOCUS));
                return Unit.INSTANCE;
            case 28:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                p1Var.setValue(bool6);
                return Unit.INSTANCE;
            default:
                p1Var.setValue((n4.c) obj);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(p3.p1 p1Var, int i14) {
        this.f159760a = i14;
        this.f159761b = p1Var;
    }
}
