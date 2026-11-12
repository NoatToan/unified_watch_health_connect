package xf1;

import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.library.mapsdkadapter.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxf1/d;", "Lqw0/a;", "Lcom/garmin/android/library/mapsdkadapter/i$g;", "Lcom/garmin/android/library/mapsdkadapter/i$m;", "Lcom/garmin/android/library/mapsdkadapter/i$j;", "", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends qw0.a implements com.garmin.android.library.mapsdkadapter.i.m, com.garmin.android.library.mapsdkadapter.i.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f190658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.e f190659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.l f190660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ie2.j f190661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qe2.i f190662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f190663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<SegmentDetailsDTO> f190664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap<Long, String> f190665o = new HashMap<>();

    public interface a {
        void e5();

        void f2(ie2.j jVar, long j8);

        void o7();
    }

    public void A6() {
        qe2.h hVar;
        ie2.k uiSettings;
        ie2.k uiSettings2;
        this.f190663m = false;
        qe2.h hVar2 = this.f148294e;
        if (hVar2 != null) {
            hVar2.setPadding(0, 0, 0, 0);
        }
        qe2.h hVar3 = this.f148294e;
        if (hVar3 != null && (uiSettings2 = hVar3.f144584a.getUiSettings()) != null) {
            uiSettings2.setZoomControlsEnabled(true);
        }
        qe2.h hVar4 = this.f148294e;
        if (hVar4 != null && (uiSettings = hVar4.f144584a.getUiSettings()) != null) {
            uiSettings.setAllGesturesEnabled(true);
        }
        ie2.j jVar = this.f190661k;
        if (jVar != null) {
            jVar.setIcon(2131232322);
        }
        com.garmin.android.library.mapsdkadapter.l lVar = this.f190660j;
        if (lVar != null && (hVar = this.f148294e) != null) {
            hVar.m(lVar);
        }
        qe2.i iVar = this.f190662l;
        if (iVar != null) {
            iVar.remove();
        }
        u6(this.f190659i, 0);
    }

    public void C6() {
        this.f190663m = true;
    }

    public boolean O2(ie2.j jVar) {
        long jLongValue;
        Map.Entry<Long, String> next;
        ie2.k uiSettings;
        ie2.k uiSettings2;
        qe2.h hVar;
        String title = jVar.getTitle();
        boolean z14 = this.f190663m;
        if (title != null) {
            if (z14 && (jVar.equals(this.f190661k) || jVar.equals(this.f190662l))) {
                A6();
                a aVar = this.f190658h;
                if (aVar != null) {
                    aVar.e5();
                    return true;
                }
            } else {
                if (this.f190663m) {
                    ie2.j jVar2 = this.f190661k;
                    if (jVar2 != null) {
                        jVar2.setIcon(2131232322);
                    }
                    com.garmin.android.library.mapsdkadapter.l lVar = this.f190660j;
                    if (lVar != null && (hVar = this.f148294e) != null) {
                        hVar.m(lVar);
                    }
                    qe2.i iVar = this.f190662l;
                    if (iVar != null) {
                        iVar.remove();
                    }
                }
                this.f190663m = true;
                C6();
                qe2.h hVar2 = this.f148294e;
                if (hVar2 != null && (uiSettings2 = hVar2.f144584a.getUiSettings()) != null) {
                    uiSettings2.setZoomControlsEnabled(false);
                }
                qe2.h hVar3 = this.f148294e;
                if (hVar3 != null && (uiSettings = hVar3.f144584a.getUiSettings()) != null) {
                    uiSettings.setAllGesturesEnabled(false);
                }
                qe2.h hVar4 = this.f148294e;
                if (hVar4 != null) {
                    hVar4.setMyLocationEnabled(false);
                }
                String title2 = jVar.getTitle();
                Iterator<Map.Entry<Long, String>> it = this.f190665o.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        jLongValue = 0;
                        break;
                    }
                    next = it.next();
                    jLongValue = next.getKey().longValue();
                } while (!s.g(title2, next.getValue()));
                a aVar2 = this.f190658h;
                if (aVar2 != null) {
                    aVar2.f2(jVar, jLongValue);
                    return true;
                }
            }
        } else if (z14) {
            A6();
            a aVar3 = this.f190658h;
            if (aVar3 != null) {
                aVar3.e5();
            }
        }
        return true;
    }

    public void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        if (this.f190663m) {
            A6();
            a aVar = this.f190658h;
            if (aVar != null) {
                aVar.e5();
            }
        }
    }

    @Override // qw0.a, com.garmin.android.library.mapsdkadapter.i.g
    public void onCameraIdle() {
        qe2.h hVar = this.f148294e;
        Objects.toString(hVar != null ? hVar.f144584a.getA() : null);
        if (this.f190663m) {
            return;
        }
        qe2.h hVar2 = this.f148294e;
        this.f190659i = hVar2 != null ? hVar2.f144584a.getA() : null;
    }

    @Override // qw0.a
    public final void w6() {
        ie2.k uiSettings;
        ie2.k uiSettings2;
        super.w6();
        if (this.f190663m) {
            qe2.h hVar = this.f148294e;
            if (hVar != null && (uiSettings2 = hVar.f144584a.getUiSettings()) != null) {
                uiSettings2.setZoomControlsEnabled(false);
            }
            qe2.h hVar2 = this.f148294e;
            if (hVar2 != null && (uiSettings = hVar2.f144584a.getUiSettings()) != null) {
                uiSettings.setAllGesturesEnabled(false);
            }
            qe2.h hVar3 = this.f148294e;
            if (hVar3 != null) {
                hVar3.setMyLocationEnabled(false);
            }
        }
    }

    public final com.garmin.android.library.mapsdkadapter.e z6(List<SegmentDetailsDTO> list) {
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            hVar.clear();
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            SegmentDetailsDTO segmentDetailsDTO = list.get(i14);
            ArrayList arrayList = segmentDetailsDTO.f41283x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = segmentDetailsDTO.f41283x;
                com.garmin.android.apps.connectmobile.segments.model.a aVar2 = arrayList2 != null ? (com.garmin.android.apps.connectmobile.segments.model.a) arrayList2.get(0) : null;
                if (aVar2 != null) {
                    com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(aVar2.f41341a, aVar2.f41342b, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                    aVar.b(fVar);
                    p pVar = new p();
                    pVar.b(2131232322);
                    pVar.d(fVar);
                    pVar.f50327a.f50312d = segmentDetailsDTO.f17838c;
                    this.f190665o.put(Long.valueOf(segmentDetailsDTO.f17837b), segmentDetailsDTO.f17838c);
                    qe2.h hVar2 = this.f148294e;
                    if (hVar2 != null) {
                        hVar2.x(pVar);
                    }
                }
            }
        }
        return aVar.a();
    }
}
