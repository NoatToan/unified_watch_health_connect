package qt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import i3.e5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.GarminTrailsViewModel$searchTrails$1", f = "GarminTrailsViewModel.kt", l = {380, 383}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f147598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f147599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f147600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f147601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f147602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, boolean z14, a aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f147600c = str;
        this.f147601d = z14;
        this.f147602e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f147600c, this.f147601d, this.f147602e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0225  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        if (r2 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        String strB;
        Object objG0;
        Object value2;
        Object value3;
        pt1.c cVar;
        i53.c cVarB;
        Object next;
        le2.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147599b;
        a aVar3 = this.f147602e;
        if (i14 == 0) {
            o13.r.b(obj);
            String str = this.f147600c;
            if (str.length() > 0) {
                int length = str.length();
                boolean z14 = this.f147601d;
                if (length >= 3 || z14) {
                    if (!z14) {
                        this.f147599b = 1;
                        if (o53.m0.b(1000L, this) != aVar2) {
                        }
                    }
                    return aVar2;
                }
                return Unit.INSTANCE;
            }
            p2 p2Var = aVar3.f147503p;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, pt1.c.a((pt1.c) value, false, false, false, null, null, new pt1.j(this.f147600c, null, null, null, 14, null), false, false, 479)));
            return Unit.INSTANCE;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = this.f147598a;
            o13.r.b(obj);
            objG0 = obj;
            strB = str2;
        }
        v2 v2Var = (v2) objG0;
        if (v2Var instanceof v2.b) {
            p2 p2Var2 = aVar3.f147503p;
            do {
                value3 = p2Var2.getValue();
                cVar = (pt1.c) value3;
                List<qs1.q> listB = ((qs1.p) ((v2.b) v2Var).f47386a).b();
                if (listB != null) {
                    ArrayList arrayList = new ArrayList(p13.y.r(listB, 10));
                    for (qs1.q qVar : listB) {
                        lt1.j jVar = lt1.j.f114865a;
                        Context context = aVar3.f147488a;
                        jVar.getClass();
                        qVar.getClass();
                        context.getClass();
                        us1.f.a aVar4 = us1.f.f172388d;
                        String strM = qVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                        aVar4.getClass();
                        Iterator<T> it = us1.f.f172391g.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!p005kotlin.jvm.internal.s.g(((us1.f) next).f172392a, strM));
                        us1.f fVar = (us1.f) next;
                        if (fVar == null) {
                            fVar = us1.f.f172389e;
                        }
                        String displayName = qVar.getDisplayName();
                        String str3 = displayName == null ? "" : displayName;
                        String strI = qVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION java.lang.String();
                        String str4 = strI == null ? "" : strI;
                        String strK = qVar.getSearchResultItemId();
                        String str5 = strK == null ? "" : strK;
                        String strH = qVar.getLocale();
                        String str6 = strH == null ? "" : strH;
                        String strG = e5.g(context.getString(fVar.f172393b), " • ", qVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION java.lang.String());
                        qs1.a aVarB = qVar.getBoundingBox();
                        if (aVarB != null) {
                            Double northLatitude = aVarB.getNorthLatitude();
                            double dDoubleValue = northLatitude != null ? northLatitude.doubleValue() : 0.0d;
                            Double eastLongitude = aVarB.getEastLongitude();
                            ke2.b bVar = new ke2.b(dDoubleValue, eastLongitude != null ? eastLongitude.doubleValue() : 0.0d, null, 4, null);
                            Double southLatitude = aVarB.getSouthLatitude();
                            double dDoubleValue2 = southLatitude != null ? southLatitude.doubleValue() : 0.0d;
                            Double westLongitude = aVarB.getWestLongitude();
                            aVar = new le2.a(bVar, new ke2.b(dDoubleValue2, westLongitude != null ? westLongitude.doubleValue() : 0.0d, null, 4, null));
                        } else {
                            aVar = new le2.a(null, null, 3, null);
                        }
                        arrayList.add(new pt1.i(str3, str4, str5, fVar, str6, strG, aVar, qVar.getCuratedCourseId(), qVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String(), qVar.getProvinceUriComponent(), qVar.getCourseNameUriComponent()));
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (hashSet.add(((pt1.i) obj2).f140858c)) {
                            arrayList2.add(obj2);
                        }
                    }
                    cVarB = i53.a.e(arrayList2);
                    if (cVarB == null) {
                        cVarB = j53.l.b();
                    }
                } else {
                    cVarB = j53.l.b();
                }
            } while (!p2Var2.b(value3, pt1.c.a(cVar, false, false, false, null, null, new pt1.j(this.f147600c, strB, cVarB, null, 8, null), false, false, 479)));
        } else {
            p2 p2Var3 = aVar3.f147503p;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, pt1.c.a((pt1.c) value2, false, false, false, null, null, new pt1.j(this.f147600c, null, null, null, 14, null), false, false, 479)));
        }
        return Unit.INSTANCE;
        bv.d dVar = aVar3.f147494g;
        b2 b2Var = aVar3.f147511z;
        strB = dVar.b();
        ss1.a aVar5 = aVar3.f147489b;
        qs1.o oVar = new qs1.o(this.f147600c, strB, new Double(((pt1.c) b2Var.f150540a.getValue()).f140819d.f140827c.f112052a.f104551a), new Double(((pt1.c) b2Var.f150540a.getValue()).f140819d.f140827c.f112053b.f104551a), new Double(((pt1.c) b2Var.f150540a.getValue()).f140819d.f140827c.f112052a.f104552b), new Double(((pt1.c) b2Var.f150540a.getValue()).f140819d.f140827c.f112053b.f104552b));
        this.f147598a = strB;
        this.f147599b = 2;
        objG0 = aVar5.g0(oVar, this);
    }
}
