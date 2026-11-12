package zw1;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.p;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzw1/b;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f207228a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207229a;

        static {
            int[] iArr = new int[zw1.a.values().length];
            try {
                iArr[zw1.a.ABS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zw1.a.BICEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zw1.a.CALVES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zw1.a.CHEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zw1.a.FOREARM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[zw1.a.GLUTES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[zw1.a.HAMSTRINGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[zw1.a.ABDUCTORS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[zw1.a.ADDUCTORS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[zw1.a.HIPS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[zw1.a.LATS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[zw1.a.LOWER_BACK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[zw1.a.OBLIQUES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[zw1.a.QUADS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[zw1.a.SHOULDERS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[zw1.a.TRAPS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[zw1.a.TRICEPS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f207229a = iArr;
        }
    }

    /* JADX INFO: renamed from: zw1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3866b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((String) ((p) t7).f128595b, (String) ((p) t14).f128595b);
        }
    }

    public b(l22.b bVar) {
        bVar.getClass();
        this.f207228a = bVar;
    }

    public final List<p<String, String>> a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return j0.f134944a;
        }
        ArrayList<zw1.a> arrayList = new ArrayList();
        for (String str : list) {
            zw1.a.f207205d.getClass();
            zw1.a aVarA = zw1.a.C3865a.a(str);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (zw1.a aVar : arrayList) {
            arrayList2.add(new p(aVar.f207225a, c(aVar)));
        }
        return h0.N0(arrayList2, new C3866b());
    }

    public final ArrayList b(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zw1.a.f207205d.getClass();
            zw1.a aVarA = zw1.a.C3865a.a(str);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(c((zw1.a) it3.next()));
        }
        return arrayList2;
    }

    public final String c(zw1.a aVar) {
        int i14 = a.f207229a[aVar.ordinal()];
        l22.b bVar = this.f207228a;
        switch (i14) {
            case 1:
                return bVar.getString(R.string.lbl_muscles_abs);
            case 2:
                return bVar.getString(R.string.lbl_muscles_biceps);
            case 3:
                return bVar.getString(R.string.lbl_muscles_calves);
            case 4:
                return bVar.getString(R.string.lbl_muscles_chest);
            case 5:
                return bVar.getString(R.string.lbl_muscles_forearms);
            case 6:
                return bVar.getString(R.string.lbl_muscles_glutes);
            case 7:
                return bVar.getString(R.string.lbl_muscles_hamstrings);
            case 8:
                return bVar.getString(R.string.lbl_muscles_hip_abductors);
            case 9:
                return bVar.getString(R.string.lbl_muscles_hip_adductors);
            case 10:
                return bVar.getString(R.string.lbl_muscles_hip_flexors);
            case 11:
                return bVar.getString(R.string.lbl_muscles_lats);
            case 12:
                return bVar.getString(R.string.lbl_muscles_lower_back);
            case 13:
                return bVar.getString(R.string.lbl_muscles_obliques);
            case 14:
                return bVar.getString(R.string.lbl_muscles_quads);
            case 15:
                return bVar.getString(R.string.lbl_muscles_shoulders);
            case 16:
                return bVar.getString(R.string.lbl_muscles_traps);
            case 17:
                return bVar.getString(R.string.lbl_muscles_triceps);
            default:
                u0.r();
                return null;
        }
    }
}
