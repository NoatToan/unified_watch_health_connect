package ps;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mapsdkadapter.MapView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lps/f1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lps/c1;", "metricTrackLogs", "Lcom/garmin/android/library/mapsdkadapter/i;", "map", "<init>", "(Landroid/content/Context;Lps/c1;Lcom/garmin/android/library/mapsdkadapter/i;)V", "Lcom/garmin/android/library/mapsdkadapter/MapView;", "mapPreview", "(Landroid/content/Context;Lps/c1;Lcom/garmin/android/library/mapsdkadapter/MapView;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f139814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f139815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.i f139816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f139817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<com.garmin.android.library.mapsdkadapter.f> f139818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.q f139819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.q f139820g;

    static {
        new a(null);
    }

    public f1(Context context, c1 c1Var, com.garmin.android.library.mapsdkadapter.i iVar) {
        context.getClass();
        c1Var.getClass();
        this.f139814a = context;
        this.f139815b = c1Var;
        this.f139816c = iVar;
        ArrayList arrayList = new ArrayList();
        this.f139817d = arrayList;
        this.f139818e = p13.h0.b1(arrayList);
        com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
        int color = a7.b.getColor(context, R.color.gray_black_static);
        ie2.p pVar = qVar.f50328a;
        pVar.f93156d = color;
        pVar.f93166n = true;
        pVar.f93158f = -100.0f;
        this.f139819f = qVar;
        com.garmin.android.library.mapsdkadapter.q qVar2 = new com.garmin.android.library.mapsdkadapter.q();
        List<? extends ie2.o> listK = p13.x.k(new ie2.o.a(8.0f), new ie2.o.b(6.0f));
        listK.getClass();
        ie2.p pVar2 = qVar2.f50328a;
        pVar2.getClass();
        pVar2.f93157e = listK;
        this.f139820g = qVar2;
    }

    public final void a(boolean z14, Integer num, Float f14) {
        com.garmin.android.library.mapsdkadapter.i iVar;
        Iterator it = b(z14, num, f14).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            iVar = this.f139816c;
            if (!zHasNext) {
                break;
            }
            com.garmin.android.library.mapsdkadapter.q qVar = (com.garmin.android.library.mapsdkadapter.q) it.next();
            if (iVar != null) {
                iVar.I(qVar);
            }
        }
        if (iVar != null) {
            iVar.w();
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0209  */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [ie2.q, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r5v21 */
    public final ArrayList b(boolean z14, Integer num, Float f14) {
        int i14;
        int i15;
        Integer numValueOf;
        Integer numValueOf2;
        int iE;
        ie2.p pVar;
        ?? r14;
        double d14;
        ie2.p pVar2;
        com.garmin.android.library.mapsdkadapter.q qVar = this.f139820g;
        qVar.b();
        ie2.p pVar3 = qVar.f50328a;
        c1 c1Var = this.f139815b;
        t1 t1VarB = c1Var.b();
        List<Double> list = c1Var.f139764a;
        if (t1VarB == null) {
            return new ArrayList();
        }
        List<Double> list2 = t1VarB.f140223b;
        b1 b1Var = t1VarB.f140222a;
        com.garmin.android.library.mapsdkadapter.q qVar2 = new com.garmin.android.library.mapsdkadapter.q();
        ie2.p pVar4 = qVar2.f50328a;
        if (f14 != null) {
            pVar4.f93158f = f14.floatValue();
        }
        float f15 = b1Var.f139698j;
        int i16 = b1Var.f139696h;
        pVar4.f93155c = f15;
        List<com.garmin.android.library.mapsdkadapter.f> list3 = pVar4.f93153a;
        if (f14 != null) {
            pVar3.f93158f = f14.floatValue();
        }
        pVar3.f93155c = b1Var.f139700l;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        ie2.p pVar5 = pVar3;
        int i17 = -1;
        int i18 = 0;
        double d15 = 1.0d;
        ie2.p pVar6 = pVar4;
        double d16 = 1.0d;
        while (i18 < size) {
            com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(list.get(i18).doubleValue(), c1Var.f139765b.get(i18).doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
            boolean zIsEmpty = list2.isEmpty();
            c1 c1Var2 = c1Var;
            Context context = this.f139814a;
            List<Double> list4 = list;
            if (zIsEmpty) {
                iE = a7.b.getColor(context, i16);
                i15 = size;
                numValueOf2 = null;
            } else {
                int iB = t1VarB.b(context, list2.get(i18));
                Double d17 = list2.get(i18);
                List<Double> list5 = t1VarB.f140224c;
                int[] iArr = b1Var.f139695g;
                if (iArr.length == 0) {
                    i15 = size;
                    numValueOf = null;
                } else if (list5.isEmpty() || d17 == null || Double.isNaN(d17.doubleValue())) {
                    i15 = size;
                    numValueOf = Integer.valueOf(a7.b.getColor(context, i16));
                } else {
                    i15 = size;
                    if (list5.size() == 1) {
                        iArr.getClass();
                        Integer numValueOf3 = iArr.length == 0 ? null : Integer.valueOf(iArr[0]);
                        numValueOf = Integer.valueOf(a7.b.getColor(context, numValueOf3 != null ? numValueOf3.intValue() : i16));
                    } else {
                        int size2 = list5.size();
                        int i19 = 1;
                        while (true) {
                            if (i19 >= size2) {
                                iArr.getClass();
                                if (iArr.length != 0) {
                                    numValueOf = Integer.valueOf(a7.b.getColor(context, iArr[iArr.length - 1]));
                                    break;
                                }
                                n23.j.s("Array is empty.");
                                return null;
                            }
                            if (d17.doubleValue() < list5.get(i19).doubleValue()) {
                                numValueOf = Integer.valueOf(a7.b.getColor(context, iArr[i19 - 1]));
                                break;
                            }
                            i19++;
                        }
                    }
                }
                numValueOf2 = numValueOf;
                iE = iB;
            }
            if (num != null) {
                iE = c7.d.e(iE, num.intValue());
                if (numValueOf2 != null) {
                    numValueOf2 = Integer.valueOf(c7.d.e(numValueOf2.intValue(), num.intValue()));
                }
            }
            LatLng latLng = fVar.f50283a;
            Integer num2 = numValueOf2;
            if (Double.isNaN(latLng.latitude) || Double.isNaN(latLng.longitude)) {
                pVar = pVar5;
                pVar6 = pVar6;
            } else {
                if (i18 == 0) {
                    arrayList2.add(new ie2.r(iE, null, d16));
                    d14 = d16;
                } else {
                    if (i17 == iE) {
                        if (i18 == list4.size() - 1) {
                            ie2.r rVar = new ie2.r(iE, null, d16);
                            arrayList.add(rVar);
                            arrayList2.add(rVar);
                        } else {
                            d16 += (double) 1;
                            arrayList2.add(new ie2.r(iE, null, d16));
                            i17 = iE;
                        }
                        d14 = d16;
                        iE = i17;
                    } else {
                        if (d16 - ((double) 1) > 0.0d) {
                            r14 = 0;
                            arrayList.add(new ie2.r(i17, null, d16 - d15));
                        } else {
                            r14 = 0;
                        }
                        ie2.q.f93168c.getClass();
                        ie2.q.a aVar = new ie2.q.a(i17, iE);
                        arrayList.add(new ie2.r(-1, new ie2.q(aVar.f93171a, aVar.f93172b, r14), 0.0d, 4, null));
                        double d18 = d15;
                        arrayList2.add(new ie2.r(iE, r14, d18));
                        d14 = d18;
                    }
                    pVar6.f93153a.add(fVar);
                    pVar2 = pVar5;
                    if (num2 != null) {
                        pVar2.f93153a.add(fVar);
                        pVar2.f93156d = num2.intValue();
                    }
                    this.f139817d.add(fVar);
                    d16 = d14;
                    pVar = pVar2;
                    d15 = 1.0d;
                    i17 = iE;
                }
                pVar6.f93153a.add(fVar);
                pVar2 = pVar5;
                if (num2 != null) {
                    pVar2.f93153a.add(fVar);
                    pVar2.f93156d = num2.intValue();
                }
                this.f139817d.add(fVar);
                d16 = d14;
                pVar = pVar2;
                d15 = 1.0d;
                i17 = iE;
            }
            i18++;
            pVar5 = pVar;
            pVar6 = pVar6;
            c1Var = c1Var2;
            list = list4;
            t1VarB = t1VarB;
            list2 = list2;
            size = i15;
        }
        ie2.p pVar7 = pVar5;
        ie2.p pVar8 = pVar6;
        pVar8.f93154b.addAll(arrayList);
        pVar8.f93165m.addAll(arrayList2);
        com.garmin.android.library.mapsdkadapter.q qVar3 = this.f139819f;
        if (z14) {
            qVar3.b();
            ie2.p pVar9 = qVar3.f50328a;
            if (num != null) {
                pVar9.f93156d = c7.d.e(pVar9.f93156d, num.intValue());
            }
            if (f14 != null) {
                pVar9.f93158f = f14.floatValue();
            }
            pVar9.f93153a.addAll(list3);
            i14 = 1;
            pVar9.f93166n = true;
            pVar9.f93155c = b1Var.f139699k;
        } else {
            i14 = 1;
        }
        ArrayList arrayList3 = new ArrayList();
        if (list3.size() > i14) {
            if (z14) {
                arrayList3.add(qVar3);
            }
            arrayList3.add(qVar2);
        }
        if (pVar7.f93153a.size() > i14) {
            arrayList3.add(qVar);
        }
        return arrayList3;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lps/f1$a;", "", "<init>", "()V", "", "NO_COLOR", "I", "", "UNDERLINE_POLYLINE_Z_INDEX", "F", "POLYLINE_DASH", "POLYLINE_GAP", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f1(Context context, c1 c1Var, com.garmin.android.library.mapsdkadapter.i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, c1Var, (i14 & 4) != 0 ? null : iVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(Context context, c1 c1Var, MapView mapView) {
        this(context, c1Var, mapView.getMapProxy());
        context.getClass();
        c1Var.getClass();
        mapView.getClass();
    }
}
