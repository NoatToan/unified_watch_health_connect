package m12;

import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm12/n;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f115848a = s3.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115849b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115850a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f115869k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f115871l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.f115872m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.f115873n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.f115874o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.f115875p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t.f115876q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[t.f115877r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[t.f115878t.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[t.f115879v.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[t.f115880w.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[t.f115881x.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[t.X.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[t.f115882y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[t.Y.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[t.Z.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[t.f115870k0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[t.H0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[t.I0.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[t.J0.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[t.K0.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[t.L0.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[t.M0.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[t.N0.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[t.O0.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[t.P0.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[t.Q0.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[t.R0.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[t.S0.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[t.T0.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[t.U0.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[t.V0.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[t.W0.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            f115850a = iArr;
        }
    }

    public n() {
        bv.b.f21239a.getClass();
        bv.b.a();
        this.f115849b = k1.f37122a.O();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final ArrayList a(t tVar, q qVar) {
        String fullName;
        String str;
        int i14;
        com.garmin.android.apps.connectmobile.userprofile.model.r rVar = qVar != null ? qVar.f115856b : null;
        nj1.e eVar = qVar != null ? qVar.f115857c : null;
        Boolean bool = qVar != null ? qVar.f115855a : null;
        ArrayList arrayList = new ArrayList();
        String str2 = "";
        switch (a.f115850a[tVar.ordinal()]) {
            case 1:
                if (rVar != null && (fullName = rVar.getFullName()) != null) {
                    str2 = fullName;
                }
                arrayList.add(new s.b(tVar, str2));
                return arrayList;
            case 2:
                if (rVar != null && (str = rVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION java.lang.String()) != null) {
                    str2 = str;
                }
                arrayList.add(new s.b(tVar, str2));
                return arrayList;
            case 3:
                boolean z14 = qVar != null ? qVar.f115858d : false;
                if (z14) {
                    i14 = R.string.follower_setup_follower_approval_option_require_approval;
                } else {
                    if (z14) {
                        u0.r();
                        return null;
                    }
                    i14 = R.string.follower_setup_follower_approval_option_auto_approve;
                }
                arrayList.add(new s.c(tVar, Integer.valueOf(i14)));
                return arrayList;
            case 4:
                arrayList.add(new s.c(tVar, Integer.valueOf((eVar != null ? eVar.f() : PrivacyType.ONLY_ME).getF28797a())));
                return arrayList;
            case 5:
                arrayList.add(new s.c(tVar, Integer.valueOf((eVar != null ? eVar.b() : PrivacyType.ONLY_ME).getF28797a())));
                return arrayList;
            case 6:
                arrayList.add(new s.c(tVar, Integer.valueOf((eVar != null ? eVar.g() : PrivacyType.ONLY_ME).getF28797a())));
                return arrayList;
            case 7:
                PrivacyType.Companion companion = PrivacyType.INSTANCE;
                String str3 = rVar != null ? rVar.d().f74886a : null;
                PrivacyType privacyType = PrivacyType.ONLY_ME;
                companion.getClass();
                arrayList.add(new s.c(tVar, Integer.valueOf(PrivacyType.Companion.c(str3, privacyType).getF28797a())));
                return arrayList;
            case 8:
                arrayList.add(new s.c(tVar, null, 2, null));
                return arrayList;
            case 9:
                bv.b.f21239a.getClass();
                bv.b.a();
                if (k1.f37122a.H0()) {
                    arrayList.add(new s.c(tVar, null, 2, null));
                }
                return arrayList;
            case 10:
                arrayList.add(new s.c(tVar, null, 2, null));
                return arrayList;
            case 11:
                arrayList.add(new s.c(tVar, null, 2, null));
                return arrayList;
            case 12:
                arrayList.add(new s.c(tVar, null, 2, null));
                return arrayList;
            case 13:
                arrayList.add(new s.c(tVar, null, 2, null));
                return arrayList;
            case 14:
                arrayList.add(new s.c(tVar, null, 2, null));
                return arrayList;
            case 15:
                arrayList.add(new s.e(tVar, null, rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getShowGender(), Boolean.TRUE) : false, 2, null));
                return arrayList;
            case 16:
                arrayList.add(new s.e(tVar, null, rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getShowHeight(), Boolean.TRUE) : false, 2, null));
                return arrayList;
            case 17:
                arrayList.add(new s.e(tVar, null, rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getShowWeight(), Boolean.TRUE) : false, 2, null));
                return arrayList;
            case 18:
                arrayList.add(new s.e(tVar, null, rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getShowAge(), Boolean.TRUE) : false, 2, null));
                return arrayList;
            case 19:
                arrayList.add(new s.e(tVar, null, rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getShowVO2Max(), Boolean.TRUE) : false, 2, null));
                return arrayList;
            case 20:
                arrayList.add(new s.e(tVar, null, rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getShowPersonalRecords(), Boolean.TRUE) : false, 2, null));
                return arrayList;
            case 21:
                arrayList.add(new s.e(tVar, null, rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getShowLifetimeTotals(), Boolean.TRUE) : false, 2, null));
                return arrayList;
            case 22:
                arrayList.add(new s.e(tVar, null, rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getShowLast12Months(), Boolean.TRUE) : false, 2, null));
                return arrayList;
            case 23:
                arrayList.add(new s.e(tVar, null, rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getShowUpcomingEvents(), Boolean.TRUE) : false, 2, null));
                return arrayList;
            case 24:
                arrayList.add(new s.e(tVar, null, rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getShowRecentDevice(), Boolean.TRUE) : false, 2, null));
                return arrayList;
            case 25:
                arrayList.add(new s.c(tVar, null, 2, null));
                return arrayList;
            case 26:
                if (bool != null && bool.booleanValue()) {
                    arrayList.add(new s.c(tVar, null, 2, null));
                    return arrayList;
                }
                return arrayList;
            case 27:
                arrayList.add(new s.c(tVar, null, 2, null));
                return arrayList;
            case 28:
                arrayList.add(new s.c(tVar, null, 2, null));
                return arrayList;
            case 29:
                arrayList.add(s.d.f115864a);
                return arrayList;
            case 30:
            case 31:
            case 32:
            case 33:
                if (tVar.f115885b != 0) {
                    arrayList.add(new s.a(tVar));
                }
                List<t> list = tVar.f115889f;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    t.f115868j.getClass();
                    if (!t.a.a((t) obj, this.f115848a, this.f115849b)) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(a((t) it.next(), qVar));
                }
                return arrayList;
            default:
                return arrayList;
        }
    }
}
