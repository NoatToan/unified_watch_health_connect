package e61;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import gg1.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Le61/a;", "Lwz/a;", "", "Lx61/e;", "data", "<init>", "(Ljava/util/List;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends wz.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f63157j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f63158c = m.b(new e51.c(1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f63160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f63161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f63162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f63163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<Integer> f63164i;

    static {
        new C1331a(null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    public a(List<x61.e> list) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Integer altitudeAcclimationMeters = ((x61.e) it.next()).getAltitudeAcclimationMeters();
                if (altitudeAcclimationMeters != null) {
                    arrayList.add(altitudeAcclimationMeters);
                }
            }
            Integer num = (Integer) h0.t0(arrayList);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        this.f63159d = iIntValue;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                Integer altitudeAcclimationMeters2 = ((x61.e) it3.next()).getAltitudeAcclimationMeters();
                if (altitudeAcclimationMeters2 != null) {
                    arrayList2.add(altitudeAcclimationMeters2);
                }
            }
            Integer num2 = (Integer) h0.o0(arrayList2);
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 20000;
            }
        } else {
            iIntValue2 = 20000;
        }
        this.f63160e = iIntValue2;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                Integer currentAltitude = ((x61.e) it4.next()).getCurrentAltitude();
                if (currentAltitude != null) {
                    arrayList3.add(currentAltitude);
                }
            }
            Integer num3 = (Integer) h0.t0(arrayList3);
            if (num3 != null) {
                iIntValue3 = num3.intValue();
            } else {
                iIntValue3 = this.f63159d;
            }
        } else {
            iIntValue3 = this.f63159d;
        }
        this.f63161f = iIntValue3;
        if (list != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it5 = list.iterator();
            while (it5.hasNext()) {
                Integer currentAltitude2 = ((x61.e) it5.next()).getCurrentAltitude();
                if (currentAltitude2 != null) {
                    arrayList4.add(currentAltitude2);
                }
            }
            Integer num4 = (Integer) h0.o0(arrayList4);
            if (num4 != null) {
                iIntValue4 = num4.intValue();
            } else {
                iIntValue4 = this.f63160e;
            }
        } else {
            iIntValue4 = this.f63160e;
        }
        b61.b bVar = b61.b.f16165a;
        Integer numValueOf = Integer.valueOf(Math.min(this.f63159d, this.f63161f));
        o0 o0Var = (o0) this.f63158c.getValue();
        bVar.getClass();
        this.f63162g = b61.b.c(o0Var, numValueOf);
        this.f63163h = b61.b.c((o0) this.f63158c.getValue(), Integer.valueOf(Math.max(this.f63160e, iIntValue4)));
        this.f63164i = x.k(100, 200, 250, 500, 1000, Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), 2000, Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS), Integer.valueOf(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS), 4000, 5000);
    }

    @Override // wz.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getF63163h() {
        return this.f63163h;
    }

    @Override // wz.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getF63162g() {
        return this.f63162g;
    }

    @Override // wz.a
    public final List<Integer> d() {
        return this.f63164i;
    }

    /* JADX INFO: renamed from: e61.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Le61/a$a;", "", "<init>", "()V", "", "ALTITUDE_ACCLIMATION_MIN_VALUE", "I", "ALTITUDE_ACCLIMATION_MAX_VALUE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1331a {
        public /* synthetic */ C1331a(j jVar) {
            this();
        }

        private C1331a() {
        }
    }
}
