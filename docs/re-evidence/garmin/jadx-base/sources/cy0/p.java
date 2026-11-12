package cy0;

import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.PolyUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcy0/p;", "", "", "activityId", "Lps/m;", "polylineDMO", "", "Lcom/garmin/android/library/mapsdkadapter/f;", "polyline", "Lle2/a;", "boundingBox", "<init>", "(JLps/m;Ljava/util/List;Lle2/a;)V", "(Lps/m;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ps.m f56776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<com.garmin.android.library.mapsdkadapter.f> f56777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final le2.a f56778d;

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c A[PHI: r5
      0x007c: PHI (r5v1 com.garmin.android.library.mapsdkadapter.f) = (r5v0 com.garmin.android.library.mapsdkadapter.f), (r5v3 com.garmin.android.library.mapsdkadapter.f) binds: [B:35:0x008e, B:28:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    public p(ps.m mVar) {
        Double endLat;
        Double startLat;
        double dDoubleValue;
        Double startLon;
        com.garmin.android.library.mapsdkadapter.f fVar;
        i53.c cVarE;
        double dDoubleValue2;
        Double endLon;
        mVar.getClass();
        Long activityId = mVar.getActivityId();
        long jLongValue = activityId != null ? activityId.longValue() : -1L;
        String encodedSamples = mVar.getEncodedSamples();
        com.garmin.android.library.mapsdkadapter.f fVar2 = null;
        if (encodedSamples == null) {
            endLat = mVar.getEndLat();
            if (endLat != null) {
                dDoubleValue2 = endLat.doubleValue();
                endLon = mVar.getEndLon();
                if (endLon != null) {
                    fVar = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue2, endLon.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                } else {
                    fVar = null;
                }
                if (fVar == null) {
                    startLat = mVar.getStartLat();
                    if (startLat != null) {
                        dDoubleValue = startLat.doubleValue();
                        startLon = mVar.getStartLon();
                        if (startLon != null) {
                            fVar = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, startLon.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                            fVar2 = fVar;
                        }
                    }
                } else {
                    fVar2 = fVar;
                }
            } else {
                startLat = mVar.getStartLat();
                if (startLat != null) {
                    dDoubleValue = startLat.doubleValue();
                    startLon = mVar.getStartLon();
                    if (startLon != null) {
                        fVar = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, startLon.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                        fVar2 = fVar;
                    }
                }
            }
            cVarE = i53.a.e(x.l(fVar2));
        } else {
            encodedSamples = encodedSamples.length() <= 0 ? null : encodedSamples;
            if (encodedSamples != null) {
                List<LatLng> listDecode = PolyUtil.decode(encodedSamples);
                listDecode.getClass();
                ArrayList arrayList = new ArrayList(y.r(listDecode, 10));
                for (LatLng latLng : listDecode) {
                    latLng.getClass();
                    arrayList.add(new com.garmin.android.library.mapsdkadapter.f(latLng, com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                }
                cVarE = i53.a.e(arrayList);
                if (cVarE == null) {
                    endLat = mVar.getEndLat();
                    if (endLat != null) {
                        dDoubleValue2 = endLat.doubleValue();
                        endLon = mVar.getEndLon();
                        if (endLon != null) {
                            fVar = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue2, endLon.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                        } else {
                            fVar = null;
                        }
                        if (fVar == null) {
                            startLat = mVar.getStartLat();
                            if (startLat != null) {
                                dDoubleValue = startLat.doubleValue();
                                startLon = mVar.getStartLon();
                                if (startLon != null) {
                                    fVar = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, startLon.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                                    fVar2 = fVar;
                                }
                            }
                        } else {
                            fVar2 = fVar;
                        }
                    } else {
                        startLat = mVar.getStartLat();
                        if (startLat != null) {
                            dDoubleValue = startLat.doubleValue();
                            startLon = mVar.getStartLon();
                            if (startLon != null) {
                                fVar = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, startLon.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                                fVar2 = fVar;
                            }
                        }
                    }
                    cVarE = i53.a.e(x.l(fVar2));
                }
            } else {
                endLat = mVar.getEndLat();
                if (endLat != null) {
                    dDoubleValue2 = endLat.doubleValue();
                    endLon = mVar.getEndLon();
                    if (endLon != null) {
                        fVar = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue2, endLon.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                    } else {
                        fVar = null;
                    }
                    if (fVar == null) {
                        startLat = mVar.getStartLat();
                        if (startLat != null) {
                            dDoubleValue = startLat.doubleValue();
                            startLon = mVar.getStartLon();
                            if (startLon != null) {
                                fVar = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, startLon.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                                fVar2 = fVar;
                            }
                        }
                    } else {
                        fVar2 = fVar;
                    }
                } else {
                    startLat = mVar.getStartLat();
                    if (startLat != null) {
                        dDoubleValue = startLat.doubleValue();
                        startLon = mVar.getStartLon();
                        if (startLon != null) {
                            fVar = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, startLon.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                            fVar2 = fVar;
                        }
                    }
                }
                cVarE = i53.a.e(x.l(fVar2));
            }
        }
        i53.c cVar = cVarE;
        Double maxLat = mVar.getMaxLat();
        double dDoubleValue3 = maxLat != null ? maxLat.doubleValue() : 0.0d;
        Double maxLon = mVar.getMaxLon();
        ke2.b bVar = new ke2.b(dDoubleValue3, maxLon != null ? maxLon.doubleValue() : 0.0d, null, 4, null);
        Double minLat = mVar.getMinLat();
        double dDoubleValue4 = minLat != null ? minLat.doubleValue() : 0.0d;
        Double minLon = mVar.getMinLon();
        this(jLongValue, mVar, cVar, new le2.a(bVar, new ke2.b(dDoubleValue4, minLon != null ? minLon.doubleValue() : 0.0d, null, 4, null)));
    }

    public final com.garmin.android.library.mapsdkadapter.q a(Context context) {
        context.getClass();
        com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
        qVar.a(this.f56777c);
        ie2.p pVar = qVar.f50328a;
        pVar.f93155c = 8.0f;
        pVar.f93166n = true;
        pVar.f93156d = a7.b.getColor(context, R.color.gray_black_static);
        pVar.f93164l = Long.valueOf(this.f56775a);
        pVar.f93158f = -100.0f;
        pVar.f93159g = false;
        return qVar;
    }

    public final com.garmin.android.library.mapsdkadapter.p b(Context context, List list) {
        long j8;
        Bitmap bitmapB;
        Object next;
        list.getClass();
        context.getClass();
        Iterator it = list.iterator();
        do {
            boolean zHasNext = it.hasNext();
            j8 = this.f56775a;
            bitmapB = null;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
        } while (((n) next).getActivityId() != j8);
        n nVar = (n) next;
        x0 x0VarM = z0.m(nVar != null ? nVar.getActivityTypeKey() : null);
        if (x0VarM == null) {
            x0VarM = x0.f4346x;
        }
        int i14 = x0VarM.f4361d;
        int i15 = x0VarM.f4366i;
        if (i14 > 0 && i15 > 0) {
            bitmapB = d7.b.b(new b(context, x0VarM.f4361d, i15), 0, 0, 7);
        }
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.c(bitmapB);
        com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) h0.d0(this.f56777c);
        if (fVar != null) {
            pVar.d(fVar);
        }
        pVar.f50327a.f50322n = Long.valueOf(j8);
        pVar.a(0.5f, 0.9f);
        return pVar;
    }

    public final com.garmin.android.library.mapsdkadapter.q c(Context context, List list) {
        long j8;
        Object next;
        list.getClass();
        context.getClass();
        Iterator it = list.iterator();
        do {
            boolean zHasNext = it.hasNext();
            j8 = this.f56775a;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
        } while (((n) next).getActivityId() != j8);
        n nVar = (n) next;
        x0 x0VarM = z0.m(nVar != null ? nVar.getActivityTypeKey() : null);
        if (x0VarM == null) {
            x0VarM = x0.f4346x;
        }
        com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
        qVar.a(this.f56777c);
        ie2.p pVar = qVar.f50328a;
        pVar.f93155c = 8.0f;
        pVar.f93156d = context.getColor(x0VarM.f4366i);
        pVar.f93164l = Long.valueOf(j8);
        pVar.f93158f = 100.0f;
        pVar.f93159g = false;
        return qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f56775a == pVar.f56775a && p005kotlin.jvm.internal.s.g(this.f56776b, pVar.f56776b) && p005kotlin.jvm.internal.s.g(this.f56777c, pVar.f56777c) && p005kotlin.jvm.internal.s.g(this.f56778d, pVar.f56778d);
    }

    public final int hashCode() {
        return this.f56778d.hashCode() + u0.b((this.f56776b.hashCode() + (Long.hashCode(this.f56775a) * 31)) * 31, 31, this.f56777c);
    }

    public final String toString() {
        return "MultiDayActivityPolyline(activityId=" + this.f56775a + ", polylineDMO=" + this.f56776b + ", polyline=" + this.f56777c + ", boundingBox=" + this.f56778d + ")";
    }

    public p(long j8, ps.m mVar, List<com.garmin.android.library.mapsdkadapter.f> list, le2.a aVar) {
        mVar.getClass();
        list.getClass();
        aVar.getClass();
        this.f56775a = j8;
        this.f56776b = mVar;
        this.f56777c = list;
        this.f56778d = aVar;
    }
}
