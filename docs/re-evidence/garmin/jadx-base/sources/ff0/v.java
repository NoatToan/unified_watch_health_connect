package ff0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lff0/v;", "Lff0/l;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lff0/a;", "apiService", "Lff0/f;", "ecgDeviceApi", "Lac0/c;", "deviceApiService", "<init>", "(Lff0/a;Lff0/f;Lac0/c;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements l, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f71114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f71115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ac0.c f71116c;

    public v(a aVar, f fVar, ac0.c cVar) {
        aVar.getClass();
        fVar.getClass();
        cVar.getClass();
        this.f71114a = aVar;
        this.f71115b = fVar;
        this.f71116c = cVar;
    }

    @Override // ff0.l
    public final Object a(String str, pf0.o.a aVar) {
        return f0.J(this, new m(this, str, null), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf A[PHI: r2 r11 r12
      0x00cf: PHI (r2v4 long) = (r2v3 long), (r2v5 long) binds: [B:40:0x00cb, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r11v6 com.garmin.android.apps.connectmobile.v2) = (r11v5 com.garmin.android.apps.connectmobile.v2), (r11v12 com.garmin.android.apps.connectmobile.v2) binds: [B:40:0x00cb, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r12v26 java.lang.Object) = (r12v24 java.lang.Object), (r12v1 java.lang.Object) binds: [B:40:0x00cb, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0104 A[LOOP:0: B:48:0x00f9->B:52:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x0123  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0108 A[EDGE_INSN: B:92:0x0108->B:54:0x0108 BREAK  A[LOOP:0: B:48:0x00f9->B:52:0x0104], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        if (r12 == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018d, code lost:
    
        if (r12 == r1) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ff0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, v13.c cVar) throws JSONException {
        p pVar;
        v2 v2Var;
        v2 v2Var2;
        gf0.c deviceInfo;
        String partNumber;
        long jLongValue;
        sd2.f fVarI;
        com.garmin.android.apps.connectmobile.devices.model.l lVarG;
        gf0.c deviceInfo2;
        v2 v2Var3;
        gf0.c deviceInfo3;
        String partNumber2;
        bm2.c[] cVarArrF;
        gf0.c deviceInfo4;
        int length;
        int i14;
        bm2.c cVar2;
        gf0.c deviceInfo5;
        gf0.c deviceInfo6;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i15 = pVar.f71099e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                pVar.f71099e = i15 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objJ = pVar.f71097c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = pVar.f71099e;
        com.garmin.android.apps.connectmobile.devices.model.l lVarF = null;
        if (i16 == 0) {
            o13.r.b(objJ);
            u uVar = new u(this, str, null);
            pVar.f71099e = 1;
            objJ = f0.J(this, uVar, pVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    jLongValue = pVar.f71096b;
                    v2Var = pVar.f71095a;
                    o13.r.b(objJ);
                    v2Var3 = (v2) objJ;
                    if (v2Var3 instanceof v2.b) {
                        cVarArrF = bm2.c.f(new JSONArray((String) ((v2.b) v2Var3).f47386a));
                        deviceInfo4 = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo();
                        if (deviceInfo4 != null) {
                            if (cVarArrF != null) {
                                length = cVarArrF.length;
                                i14 = 0;
                                while (true) {
                                    if (i14 >= length) {
                                        cVar2 = null;
                                        break;
                                    }
                                    cVar2 = cVarArrF[i14];
                                    if (cVar2.f18942x == jLongValue) {
                                        break;
                                    }
                                    i14++;
                                }
                                if (cVar2 != null) {
                                    lVarF = zb0.k.f(cVar2);
                                }
                            }
                            deviceInfo4.g(lVarF);
                            return v2Var;
                        }
                    } else {
                        deviceInfo3 = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo();
                        if (deviceInfo3 != null && (partNumber2 = deviceInfo3.getPartNumber()) != null) {
                            q qVar = new q(this, partNumber2, null);
                            pVar.f71095a = v2Var;
                            pVar.f71096b = jLongValue;
                            pVar.f71099e = 4;
                            objJ = f0.J(this, qVar, pVar);
                        }
                    }
                    return v2Var;
                }
                if (i16 != 4) {
                    if (i16 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v2Var = pVar.f71095a;
                    o13.r.b(objJ);
                    v2 v2Var4 = (v2) objJ;
                    if ((v2Var4 instanceof v2.b) && (deviceInfo6 = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo()) != null) {
                        List<com.garmin.android.apps.connectmobile.devices.model.l> listD = ((com.garmin.android.apps.connectmobile.devices.model.s) ((v2.b) v2Var4).f47386a).d();
                        deviceInfo6.g(listD != null ? (com.garmin.android.apps.connectmobile.devices.model.l) h0.d0(listD) : null);
                    }
                    return v2Var;
                }
                v2Var = pVar.f71095a;
                o13.r.b(objJ);
                v2 v2Var5 = (v2) objJ;
                if ((v2Var5 instanceof v2.b) && (deviceInfo5 = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo()) != null) {
                    List<com.garmin.android.apps.connectmobile.devices.model.l> listD2 = ((com.garmin.android.apps.connectmobile.devices.model.s) ((v2.b) v2Var5).f47386a).d();
                    deviceInfo5.g(listD2 != null ? (com.garmin.android.apps.connectmobile.devices.model.l) h0.d0(listD2) : null);
                }
                return v2Var;
            }
            v2Var = pVar.f71095a;
            o13.r.b(objJ);
            v2Var2 = (v2) objJ;
            if (v2Var2 instanceof v2.b) {
                deviceInfo = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo();
                if (deviceInfo != null && (partNumber = deviceInfo.getPartNumber()) != null) {
                    r rVar = new r(this, partNumber, null);
                    pVar.f71095a = v2Var;
                    pVar.f71099e = 5;
                    objJ = f0.J(this, rVar, pVar);
                }
                return v2Var;
            }
            jLongValue = ((Number) ((v2.b) v2Var2).f47386a).longValue();
            rd2.f.a().f152045a.getClass();
            fVarI = rd2.j.i(jLongValue, null);
            if (fVarI != null) {
                lVarG = zb0.k.g(fVarI);
                deviceInfo2 = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo();
                if (deviceInfo2 != null) {
                    deviceInfo2.g(lVarG);
                    return v2Var;
                }
                return v2Var;
            }
            t tVar = new t(this, null);
            pVar.f71095a = v2Var;
            pVar.f71096b = jLongValue;
            pVar.f71099e = 3;
            objJ = f0.J(this, tVar, pVar);
            if (objJ != aVar) {
                v2Var3 = (v2) objJ;
                if (v2Var3 instanceof v2.b) {
                    cVarArrF = bm2.c.f(new JSONArray((String) ((v2.b) v2Var3).f47386a));
                    deviceInfo4 = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo();
                    if (deviceInfo4 != null) {
                        if (cVarArrF != null) {
                            length = cVarArrF.length;
                            i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    cVar2 = null;
                                    break;
                                }
                                cVar2 = cVarArrF[i14];
                                if (cVar2.f18942x == jLongValue) {
                                    break;
                                    break;
                                }
                                i14++;
                            }
                            if (cVar2 != null) {
                                lVarF = zb0.k.f(cVar2);
                            }
                        }
                        deviceInfo4.g(lVarF);
                        return v2Var;
                    }
                } else {
                    deviceInfo3 = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo();
                    if (deviceInfo3 != null) {
                        q qVar2 = new q(this, partNumber2, null);
                        pVar.f71095a = v2Var;
                        pVar.f71096b = jLongValue;
                        pVar.f71099e = 4;
                        objJ = f0.J(this, qVar2, pVar);
                    }
                }
                return v2Var;
            }
            return aVar;
        }
        o13.r.b(objJ);
        v2 v2Var6 = (v2) objJ;
        if (!(v2Var6 instanceof v2.b)) {
            return v2Var6;
        }
        s sVar = new s(this, v2Var6, null);
        pVar.f71095a = v2Var6;
        pVar.f71099e = 2;
        Object objJ2 = f0.J(this, sVar, pVar);
        if (objJ2 != aVar) {
            objJ = objJ2;
            v2Var = v2Var6;
            v2Var2 = (v2) objJ;
            if (v2Var2 instanceof v2.b) {
                deviceInfo = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo();
                if (deviceInfo != null) {
                    r rVar2 = new r(this, partNumber, null);
                    pVar.f71095a = v2Var;
                    pVar.f71099e = 5;
                    objJ = f0.J(this, rVar2, pVar);
                }
                return v2Var;
            }
            jLongValue = ((Number) ((v2.b) v2Var2).f47386a).longValue();
            rd2.f.a().f152045a.getClass();
            fVarI = rd2.j.i(jLongValue, null);
            if (fVarI != null) {
                lVarG = zb0.k.g(fVarI);
                deviceInfo2 = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo();
                if (deviceInfo2 != null) {
                    deviceInfo2.g(lVarG);
                    return v2Var;
                }
                return v2Var;
            }
            t tVar2 = new t(this, null);
            pVar.f71095a = v2Var;
            pVar.f71096b = jLongValue;
            pVar.f71099e = 3;
            objJ = f0.J(this, tVar2, pVar);
            if (objJ != aVar) {
                v2Var3 = (v2) objJ;
                if (v2Var3 instanceof v2.b) {
                    cVarArrF = bm2.c.f(new JSONArray((String) ((v2.b) v2Var3).f47386a));
                    deviceInfo4 = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo();
                    if (deviceInfo4 != null) {
                        if (cVarArrF != null) {
                            length = cVarArrF.length;
                            i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    cVar2 = null;
                                    break;
                                }
                                cVar2 = cVarArrF[i14];
                                if (cVar2.f18942x == jLongValue) {
                                    break;
                                    break;
                                }
                                i14++;
                            }
                            if (cVar2 != null) {
                                lVarF = zb0.k.f(cVar2);
                            }
                        }
                        deviceInfo4.g(lVarF);
                        return v2Var;
                    }
                } else {
                    deviceInfo3 = ((gf0.b) ((v2.b) v2Var).f47386a).getSummary().getDeviceInfo();
                    if (deviceInfo3 != null) {
                        q qVar3 = new q(this, partNumber2, null);
                        pVar.f71095a = v2Var;
                        pVar.f71096b = jLongValue;
                        pVar.f71099e = 4;
                        objJ = f0.J(this, qVar3, pVar);
                    }
                }
                return v2Var;
            }
        }
        return aVar;
    }

    @Override // ff0.l
    public final Object c(String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, Integer num, v13.i iVar) {
        return f0.J(this, new o(str3, this, str, str2, arrayList, arrayList2, num, null), iVar);
    }

    @Override // ff0.l
    public final Object d(String str, String str2, v13.c cVar) {
        return f0.J(this, new n(null, this, str, str2, null, null), cVar);
    }
}
