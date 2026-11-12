package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f3;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a0 extends fb2.t<com.garmin.android.apps.connectmobile.devices.model.f, hg1.k> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f93277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f93278g;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93279a;

        static {
            int[] iArr = new int[hg1.k.values().length];
            f93279a = iArr;
            try {
                iArr[hg1.k.DATA_FIELD_SPEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93279a[hg1.k.DATA_FIELD_SPEED_AVG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93279a[hg1.k.DATA_FIELD_SPEED_LAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93279a[hg1.k.DATA_FIELD_PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93279a[hg1.k.DATA_FIELD_PACE_AVG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93279a[hg1.k.DATA_FIELD_PACE_LAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public a0(Context context, int i14, int i15) {
        super(context);
        this.f93276e = View.generateViewId();
        this.f93277f = i14;
        this.f93278g = i15;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (fVar == null) {
            vb.h.s("Model is required");
            return false;
        }
        com.garmin.android.apps.connectmobile.devices.model.g gVar = fVar.I().get(this.f93277f);
        List<String> list = gVar.f34167b;
        return (list == null || list.isEmpty() || gVar.D() <= 0) ? false : true;
    }

    @Override // fb2.t
    public final Map<hg1.k, CharSequence> q(hg1.k[] kVarArr) {
        hg1.k[] kVarArr2 = kVarArr;
        HashMap map = new HashMap();
        if (kVarArr2 != null) {
            for (hg1.k kVar : kVarArr2) {
                map.put(kVar, this.f70343a.getString(kVar.f83713b));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final int t() {
        return this.f93276e;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.data_fields_setting_data_field, NumberFormat.getInstance().format(this.f93278g + 1));
    }

    @Override // fb2.t
    public final void w(hg1.k kVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        hg1.k kVar2 = kVar;
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 != null) {
            fVar2.I().get(this.f93277f).F(this.f93278g, kVar2);
        } else {
            vb.h.s("Model is required");
        }
    }

    public ArrayList x(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        if (fVar == null) {
            vb.h.s("Model is required");
            return null;
        }
        ArrayList arrayList = new ArrayList(fVar.G());
        hg1.k kVar = hg1.k.DATA_FIELD_SPEED;
        if (kVar == fVar.x0()) {
            arrayList.remove(hg1.k.DATA_FIELD_PACE);
            arrayList.remove(hg1.k.DATA_FIELD_PACE_AVG);
            arrayList.remove(hg1.k.DATA_FIELD_PACE_LAP);
            return arrayList;
        }
        if (hg1.k.DATA_FIELD_PACE == fVar.x0()) {
            arrayList.remove(kVar);
            arrayList.remove(hg1.k.DATA_FIELD_SPEED_AVG);
            arrayList.remove(hg1.k.DATA_FIELD_SPEED_LAP);
        }
        return arrayList;
    }

    @Override // fb2.t
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public hg1.k r(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        if (fVar == null) {
            vb.h.s("Model is required");
            return null;
        }
        com.garmin.android.apps.connectmobile.devices.model.g gVar = fVar.I().get(this.f93277f);
        int i14 = this.f93278g;
        hg1.k kVarC = gVar.C(i14);
        hg1.k kVarX0 = fVar.x0();
        hg1.k kVar = hg1.k.DATA_FIELD_PACE;
        if (kVarX0 == kVar) {
            int i15 = a.f93279a[kVarC.ordinal()];
            if (i15 == 1) {
                gVar.F(i14, kVar);
            } else if (i15 == 2) {
                gVar.F(i14, hg1.k.DATA_FIELD_PACE_AVG);
            } else if (i15 == 3) {
                gVar.F(i14, hg1.k.DATA_FIELD_PACE_LAP);
            }
        } else {
            hg1.k kVarX1 = fVar.x0();
            hg1.k kVar2 = hg1.k.DATA_FIELD_SPEED;
            if (kVarX1 == kVar2) {
                int i16 = a.f93279a[kVarC.ordinal()];
                if (i16 == 4) {
                    gVar.F(i14, kVar2);
                } else if (i16 == 5) {
                    gVar.F(i14, hg1.k.DATA_FIELD_SPEED_AVG);
                } else if (i16 == 6) {
                    gVar.F(i14, hg1.k.DATA_FIELD_SPEED_LAP);
                }
            }
        }
        return gVar.C(i14);
    }

    @Override // fb2.t
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public hg1.k[] v(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        ArrayList arrayList = new ArrayList(x(fVar));
        List<com.garmin.android.apps.connectmobile.devices.model.g> listI = fVar.I();
        int i14 = this.f93277f;
        com.garmin.android.apps.connectmobile.devices.model.g gVar = listI.get(i14);
        List<String> list = gVar.f34167b;
        ArrayList arrayList2 = new ArrayList();
        List<String> list2 = gVar.f34167b;
        if (list2 != null && !list2.isEmpty()) {
            list.getClass();
            for (String str : list) {
                hg1.k.f83699c.getClass();
                hg1.k kVarA = hg1.k.a.a(str);
                if (!arrayList2.contains(kVarA)) {
                    arrayList2.add(kVarA);
                }
            }
        }
        int i15 = this.f93278g;
        arrayList2.remove(gVar.C(i15));
        arrayList.removeAll(arrayList2);
        hg1.k kVar = hg1.k.DATA_FIELD_NONE;
        arrayList.remove(kVar);
        int size = fVar.P0() ? fVar.I().size() : 0;
        if (i14 < 0 || i14 >= size) {
            com.garmin.android.apps.connectmobile.devices.model.f.b bVar = com.garmin.android.apps.connectmobile.devices.model.f.f34130c;
            Integer numValueOf = Integer.valueOf(i14);
            Integer numValueOf2 = Integer.valueOf(size - 1);
            bVar.getClass();
            vb.h.s(f3.i(com.airbnb.lottie.animation.keyframe.a.l(numValueOf, "Invalid value: [", "]. Expected values: [", " to ", 0), numValueOf2, "]."));
            return null;
        }
        if ((i14 != 0 && fVar.G().contains(kVar)) || i15 > 0) {
            arrayList.add(kVar);
        }
        arrayList.remove(hg1.k.DATA_FIELD_INVALID);
        return (hg1.k[]) arrayList.toArray(new hg1.k[0]);
    }
}
