package vk1;

import c22.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f12.l;
import org.json.JSONArray;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvk1/c;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f178593a = new c();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f178595b;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.HR_MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.HR_RESERVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.LACTATE_THRESHOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f178594a = iArr;
            int[] iArr2 = new int[u0.values().length];
            try {
                iArr2[u0.X1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[u0.M2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[u0.V3.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[u0.W3.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[u0.Y2.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f178595b = iArr2;
        }
    }

    private c() {
    }

    public static f a() {
        f fVar = new f();
        fVar.f178622l = true;
        fVar.f178612b = "DEFAULT";
        fVar.f178611a = "HR_MAX";
        int[] iArr = j.HR_MAX.f178643c;
        fVar.f178623m = iArr[0];
        fVar.f178624n = iArr[1];
        fVar.f178625o = iArr[2];
        fVar.f178626p = iArr[3];
        fVar.f178627q = iArr[4];
        fVar.f178621k = h();
        i.f178635a.getClass();
        i.c(fVar);
        return fVar;
    }

    public static String b(f fVar, f fVar2) {
        if (s.g(fVar, fVar2)) {
            return "UNCHANGED";
        }
        boolean z14 = fVar.f178622l;
        if (!z14 || fVar2.f178622l) {
            return (z14 || !fVar2.f178622l) ? "CHANGED" : "DELETED";
        }
        return "NEW";
    }

    public static final String c(b bVar) {
        String str;
        String str2;
        String str3;
        bVar.getClass();
        JSONArray jSONArray = new JSONArray();
        f fVar = bVar.f178585e;
        if ((fVar != null ? fVar.f178620j : null) != null && !s.g(fVar.f178620j, "UNCHANGED")) {
            jSONArray.put(fVar.F());
        }
        f fVar2 = bVar.f178586f;
        if (fVar2 != null && bVar.f178581a && (str3 = fVar2.f178620j) != null && !str3.equals("UNCHANGED")) {
            jSONArray.put(fVar2.F());
        }
        f fVar3 = bVar.f178587g;
        if (fVar3 != null && bVar.f178582b && (str2 = fVar3.f178620j) != null && !str2.equals("UNCHANGED")) {
            jSONArray.put(fVar3.F());
        }
        f fVar4 = bVar.f178588h;
        if (fVar4 != null && bVar.f178583c && (str = fVar4.f178620j) != null && !str.equals("UNCHANGED")) {
            jSONArray.put(fVar4.F());
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    public static final e d(f fVar) {
        String str = fVar.f178612b;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                try {
                    return e.valueOf(str);
                } catch (IllegalArgumentException e4) {
                    sn.a.s("getSportEnum: ", e4.getMessage(), i2.f36769a, a2.SETTINGS, "HRZonesUtil");
                }
            }
        }
        return null;
    }

    public static String e(int i14) {
        return hb.a.h((o) KoinJavaComponent.get$default(o.class, null, null, 6, null), i14);
    }

    public static final String f(f fVar) {
        fVar.getClass();
        j jVarG = g(fVar);
        if (jVarG == null) {
            return "";
        }
        int i14 = a.f178594a[jVarG.ordinal()];
        c cVar = f178593a;
        if (i14 == 1) {
            cVar.getClass();
            return e(R.string.hr_zones_lbl_training_method_percent_max_heart_rate);
        }
        if (i14 == 2) {
            cVar.getClass();
            return e(R.string.hr_zones_lbl_training_method_percent_heart_rate_reserve);
        }
        if (i14 != 3) {
            return "";
        }
        cVar.getClass();
        return e(R.string.hr_zones_lbl_training_method_percent_lactate_threshold);
    }

    public static final j g(f fVar) {
        fVar.getClass();
        String str = fVar.f178611a;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                try {
                    return j.valueOf(str);
                } catch (IllegalArgumentException e4) {
                    sn.a.s("getTrainingMethodEnum: ", e4.getMessage(), i2.f36769a, a2.SETTINGS, "HRZonesUtil");
                }
            }
        }
        return null;
    }

    public static final int h() {
        l.f68084a.getClass();
        int iU = l.a.a().u();
        if (iU == -1) {
            iU = 35;
        }
        return 220 - iU;
    }

    public static final void i(f fVar) {
        fVar.getClass();
        j jVarG = g(fVar);
        if (jVarG != null) {
            fVar.f178621k = h();
            int[] iArr = jVarG.f178643c;
            f178593a.getClass();
            fVar.f178623m = iArr[0];
            fVar.f178624n = iArr[1];
            fVar.f178625o = iArr[2];
            fVar.f178626p = iArr[3];
            fVar.f178627q = iArr[4];
            int i14 = a.f178594a[jVarG.ordinal()];
            if (i14 == 1) {
                i.f178635a.getClass();
                i.c(fVar);
            } else if (i14 == 2) {
                g.f178633a.getClass();
                g.c(fVar);
            } else {
                if (i14 != 3) {
                    return;
                }
                h.f178634a.getClass();
                h.c(fVar);
            }
        }
    }

    public static final void j(b bVar, b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        f fVar = bVar.f178585e;
        c cVar = f178593a;
        if (fVar != null) {
            f fVar2 = bVar2.f178585e;
            fVar2.getClass();
            cVar.getClass();
            fVar.f178620j = b(fVar, fVar2);
        }
        f fVar3 = bVar.f178586f;
        if (fVar3 != null) {
            f fVar4 = bVar2.f178586f;
            fVar4.getClass();
            cVar.getClass();
            fVar3.f178620j = b(fVar3, fVar4);
        }
        f fVar5 = bVar.f178587g;
        if (fVar5 != null) {
            f fVar6 = bVar2.f178587g;
            fVar6.getClass();
            cVar.getClass();
            fVar5.f178620j = b(fVar5, fVar6);
        }
        f fVar7 = bVar.f178588h;
        if (fVar7 != null) {
            f fVar8 = bVar2.f178588h;
            fVar8.getClass();
            cVar.getClass();
            fVar7.f178620j = b(fVar7, fVar8);
        }
    }
}
