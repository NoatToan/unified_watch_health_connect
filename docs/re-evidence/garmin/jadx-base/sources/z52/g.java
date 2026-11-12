package z52;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.v;
import com.mapbox.common.HttpHeaders;
import java.util.List;
import m52.k;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lz52/g;", "Lz52/a;", "", HttpHeaders.AGE, "Lz52/e;", "rlt", "", "runPower", "Lvk1/b;", "heartRateZones", "bikeFtp", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "powerZones", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/v;", "powerCurveTargets", "<init>", "(ILz52/e;DLvk1/b;DLcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements z52.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f202547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f202548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vk1.b f202549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f202550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PowerZonesDTO f202551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<v> f202552g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202553a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f116754n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f116755o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f116758r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f202553a = iArr;
        }
    }

    public g(int i14, e eVar, double d14, vk1.b bVar, double d15, PowerZonesDTO powerZonesDTO, List<v> list) {
        eVar.getClass();
        bVar.getClass();
        this.f202546a = i14;
        this.f202547b = eVar;
        this.f202548c = d14;
        this.f202549d = bVar;
        this.f202550e = d15;
        this.f202551f = powerZonesDTO;
        this.f202552g = list;
    }

    @Override // z52.a
    public final f a() {
        e eVar = this.f202547b;
        Integer num = eVar.f202540b;
        return new f(num != null ? num.intValue() : MathKt.b(((double) (220 - this.f202546a)) * 0.85d), ((double) 1) / eVar.f202539a, this.f202548c, 180.0d);
    }

    @Override // z52.a
    public final List<v> b() {
        return this.f202552g;
    }

    @Override // z52.a
    public final d c() {
        Integer num = this.f202547b.f202541c;
        int iIntValue = num != null ? num.intValue() : MathKt.b(((double) (220 - this.f202546a)) * 0.85d);
        double d14 = this.f202550e;
        return new d(iIntValue, 6.7056d, d14, d14, 90.0d);
    }

    @Override // z52.a
    public final double d(int i14, k kVar) {
        vk1.f fVar;
        int i15;
        int i16;
        kVar.getClass();
        int i17 = a.f202553a[kVar.ordinal()];
        vk1.b bVar = this.f202549d;
        if (i17 == 1) {
            fVar = bVar.f178586f;
        } else if (i17 != 2) {
            fVar = i17 != 3 ? null : bVar.f178588h;
        } else {
            fVar = bVar.f178587g;
        }
        if (fVar == null && (fVar = bVar.f178585e) == null) {
            fVar = new vk1.f();
        }
        double d14 = fVar.f178613c;
        Double dValueOf = d14 != 0.0d ? Double.valueOf(d14) : null;
        double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : 30.0d;
        if (i14 == 0) {
            return (dDoubleValue + ((double) fVar.f178615e)) / 2.0d;
        }
        if (i14 == 1) {
            i15 = fVar.f178615e;
            i16 = fVar.f178616f;
        } else if (i14 == 2) {
            i15 = fVar.f178616f;
            i16 = fVar.f178617g;
        } else if (i14 == 3) {
            i15 = fVar.f178617g;
            i16 = fVar.f178618h;
        } else {
            if (i14 != 4) {
                return 140.0d;
            }
            i15 = fVar.f178618h;
            i16 = fVar.f178619i;
        }
        return ((double) (i15 + i16)) / 2.0d;
    }

    @Override // z52.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final PowerZonesDTO getF202551f() {
        return this.f202551f;
    }
}
