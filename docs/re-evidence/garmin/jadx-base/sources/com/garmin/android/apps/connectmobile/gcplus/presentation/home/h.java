package com.garmin.android.apps.connectmobile.gcplus.presentation.home;

import ak0.f0;
import b63.l;
import b63.z;
import c80.n;
import c80.o;
import ck0.q;
import ck0.t;
import gg1.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i53.f a(o oVar) {
        Iterator it;
        t tVar;
        ck0.c cVar;
        ck0.d dVar;
        String strConcat;
        String strConcat2;
        String str;
        String strConcat3;
        String str2;
        String strConcat4;
        b63.o oVarB;
        String orDefault;
        String orDefault2;
        String orDefault3;
        String str3;
        Map<String, c80.e> map;
        o oVar2 = oVar;
        List<n> list = oVar2.f25501a;
        ArrayList arrayList = new ArrayList();
        for (Iterator it3 = list.iterator(); it3.hasNext(); it3 = it) {
            n nVar = (n) it3.next();
            String str4 = nVar.f25466c;
            l lVar = nVar.f25473j;
            Map<String, String> map2 = nVar.f25472i;
            String str5 = nVar.f25469f;
            String str6 = nVar.f25467d;
            String str7 = nVar.f25468e;
            c80.d dVar2 = nVar.f25470g;
            if (str4 == null || str5 == null || str6 == null || str7 == null) {
                it = it3;
                tVar = null;
            } else {
                String str8 = nVar.f25474k;
                c80.e eVar = (str8 == null || (map = oVar2.f25503c) == null) ? null : map.get(str8);
                String str9 = nVar.f25464a;
                String str10 = nVar.f25465b;
                if (dVar2 == null || (str3 = dVar2.f25320a) == null) {
                    cVar = null;
                } else {
                    l lVar2 = dVar2.f25321b;
                    cVar = new ck0.c(str3, lVar2 != null ? b(lVar2) : null, lVar != null ? b(lVar) : null);
                }
                if (eVar != null) {
                    int i14 = eVar.f25355b - eVar.f25354a;
                    l lVar3 = eVar.f25356c;
                    dVar = new ck0.d(i14, lVar3 != null ? b(lVar3) : null, eVar.f25357d);
                } else {
                    dVar = null;
                }
                String str11 = nVar.f25471h;
                if (map2 == null || (orDefault3 = map2.getOrDefault("Image", null)) == null) {
                    strConcat = null;
                } else {
                    v0.T.getClass();
                    strConcat = v0.a.b().b().concat(orDefault3);
                }
                if (map2 == null || (orDefault2 = map2.getOrDefault("DetailedImage", null)) == null) {
                    strConcat2 = null;
                } else {
                    v0.T.getClass();
                    strConcat2 = v0.a.b().b().concat(orDefault2);
                }
                if (map2 != null) {
                    str = str11;
                    String orDefault4 = map2.getOrDefault("Image_Dark", null);
                    if (orDefault4 != null) {
                        v0.T.getClass();
                        strConcat3 = v0.a.b().b().concat(orDefault4);
                    }
                    if (map2 != null) {
                        it = it3;
                        str2 = null;
                        orDefault = map2.getOrDefault("DetailedImage_Dark", null);
                        if (orDefault != null) {
                            v0.T.getClass();
                            strConcat4 = v0.a.b().b().concat(orDefault);
                        }
                        q qVar = new q(strConcat, strConcat2, strConcat3, strConcat4);
                        if (lVar != null) {
                            oVarB = b(lVar);
                        } else {
                            oVarB = str2;
                        }
                        tVar = new t(str9, str10, str4, str5, str6, str7, cVar, dVar, str, qVar, oVarB);
                    } else {
                        it = it3;
                        str2 = null;
                    }
                    strConcat4 = str2;
                    q qVar2 = new q(strConcat, strConcat2, strConcat3, strConcat4);
                    if (lVar != null) {
                        oVarB = b(lVar);
                    } else {
                        oVarB = str2;
                    }
                    tVar = new t(str9, str10, str4, str5, str6, str7, cVar, dVar, str, qVar2, oVarB);
                } else {
                    str = str11;
                }
                strConcat3 = null;
                if (map2 != null) {
                    it = it3;
                    str2 = null;
                    orDefault = map2.getOrDefault("DetailedImage_Dark", null);
                    if (orDefault != null) {
                        v0.T.getClass();
                        strConcat4 = v0.a.b().b().concat(orDefault);
                    }
                    q qVar3 = new q(strConcat, strConcat2, strConcat3, strConcat4);
                    if (lVar != null) {
                        oVarB = b(lVar);
                    } else {
                        oVarB = str2;
                    }
                    tVar = new t(str9, str10, str4, str5, str6, str7, cVar, dVar, str, qVar3, oVarB);
                } else {
                    it = it3;
                    str2 = null;
                }
                strConcat4 = str2;
                q qVar4 = new q(strConcat, strConcat2, strConcat3, strConcat4);
                if (lVar != null) {
                    oVarB = b(lVar);
                } else {
                    oVarB = str2;
                }
                tVar = new t(str9, str10, str4, str5, str6, str7, cVar, dVar, str, qVar4, oVarB);
            }
            if (tVar != null) {
                arrayList.add(tVar);
            }
            oVar2 = oVar;
        }
        return i53.a.j(h0.N0(arrayList, new f0()));
    }

    public static b63.o b(l lVar) {
        z.INSTANCE.getClass();
        return b63.b.e(b63.n.b(lVar), z.Companion.a()).b();
    }
}
