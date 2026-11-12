package com.xmlywind.volley.toolbox;

import android.os.SystemClock;
import com.google.common.net.HttpHeaders;
import com.xmlywind.volley.p;
import com.xmlywind.volley.q;
import com.xmlywind.volley.r;
import com.xmlywind.volley.s;
import com.xmlywind.volley.t;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes22.dex */
public class e implements com.xmlywind.volley.f {
    public static final boolean a = t.b;
    public final c b;
    private final a c;

    public e(a aVar) {
        this(aVar, new c(4096));
    }

    public e(a aVar, c cVar) {
        this.c = aVar;
        this.b = cVar;
    }

    private static List<com.xmlywind.volley.e> a(List<com.xmlywind.volley.e> list, com.xmlywind.volley.b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.xmlywind.volley.e> it2 = list.iterator();
            while (it2.hasNext()) {
                treeSet.add(it2.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.xmlywind.volley.e> list2 = aVar.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.xmlywind.volley.e eVar : aVar.h) {
                    if (!treeSet.contains(eVar.a())) {
                        arrayList.add(eVar);
                    }
                }
            }
        } else if (!aVar.g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.xmlywind.volley.e(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    private Map<String, String> a(com.xmlywind.volley.b.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        String str = aVar.b;
        if (str != null) {
            map.put(HttpHeaders.IF_NONE_MATCH, str);
        }
        long j = aVar.d;
        if (j > 0) {
            map.put("If-Modified-Since", h.a(j));
        }
        return map;
    }

    public static Map<String, String> a(List<com.xmlywind.volley.e> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < list.size(); i++) {
            com.xmlywind.volley.e eVar = list.get(i);
            treeMap.put(eVar.a(), eVar.b());
        }
        return treeMap;
    }

    private void a(long j, com.xmlywind.volley.l<?> lVar, byte[] bArr, int i) {
        if (a || j > 3000) {
            t.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", lVar, Long.valueOf(j), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i), Integer.valueOf(lVar.r().b()));
        }
    }

    public static void a(String str, com.xmlywind.volley.l<?> lVar, s sVar) throws s {
        p pVarR = lVar.r();
        int iP = lVar.p();
        try {
            pVarR.a(sVar);
            lVar.a(String.format("%s-retry [RetryCount %s]  [timeout=%s]", str, Integer.valueOf(pVarR.b()), Integer.valueOf(iP)));
        } catch (s e) {
            lVar.a(String.format("%s-timeout-giveup [RetryCount %s] [timeout=%s]", str, Integer.valueOf(pVarR.b()), Integer.valueOf(iP)));
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x0183 A[SYNTHETIC] */
    @Override // com.xmlywind.volley.f
    public com.xmlywind.volley.i a(com.xmlywind.volley.l<?> lVar) throws s {
        List<com.xmlywind.volley.e> list;
        byte[] bArr;
        int iA;
        s hVar;
        String str;
        com.xmlywind.volley.i iVar;
        com.xmlywind.volley.a aVar;
        com.xmlywind.volley.i iVar2;
        byte[] bArr2;
        byte[] bArrA;
        List<com.xmlywind.volley.e> list2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            t.b("download start %s", lVar.h());
            List<com.xmlywind.volley.e> listEmptyList = Collections.emptyList();
            i iVar3 = null;
            try {
                try {
                    i iVarA = this.c.a(lVar, a(lVar.i()));
                    try {
                        int iA2 = iVarA.a();
                        t.b("download getStatus %s StatusCode: %s", lVar.h(), Integer.valueOf(iA2));
                        List<com.xmlywind.volley.e> listB = iVarA.b();
                        if (iA2 == 304) {
                            com.xmlywind.volley.b.a aVarI = lVar.i();
                            if (aVarI != null) {
                                iVar2 = new com.xmlywind.volley.i(304, aVarI.a, true, SystemClock.elapsedRealtime() - jElapsedRealtime, a(listB, aVarI));
                                break;
                            }
                            return new com.xmlywind.volley.i(304, null, true, SystemClock.elapsedRealtime() - jElapsedRealtime, listB);
                        }
                        try {
                            try {
                                try {
                                    if (iVarA.d() != null) {
                                        try {
                                            if (lVar instanceof f) {
                                                bArrA = ((f) lVar).a(iVarA);
                                            } else {
                                                bArr2 = null;
                                            }
                                            list2 = listB;
                                            a(SystemClock.elapsedRealtime() - jElapsedRealtime, lVar, bArr2, iA2);
                                            if (iA2 < 200 && iA2 <= 299) {
                                                iVar2 = new com.xmlywind.volley.i(iA2, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, list2);
                                                break;
                                            }
                                            throw new IOException();
                                        } catch (IOException e) {
                                            e = e;
                                            listEmptyList = listB;
                                            list = listEmptyList;
                                            bArr = null;
                                            iVar3 = iVarA;
                                            if (iVar3 != null) {
                                                throw new com.xmlywind.volley.j(e);
                                            }
                                            iA = iVar3.a();
                                            t.c("%s Unexpected response code %d for %s", e.getMessage(), Integer.valueOf(iA), lVar.h());
                                            if (bArr != null) {
                                                iVar = new com.xmlywind.volley.i(iA, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, list);
                                                if (iA != 401) {
                                                }
                                                aVar = new com.xmlywind.volley.a(iVar);
                                                a("auth", lVar, aVar);
                                            } else {
                                                hVar = new com.xmlywind.volley.h(e);
                                                str = "network";
                                            }
                                            a(str, lVar, hVar);
                                        }
                                    } else {
                                        bArrA = new byte[0];
                                    }
                                    a(SystemClock.elapsedRealtime() - jElapsedRealtime, lVar, bArr2, iA2);
                                    if (iA2 < 200) {
                                    }
                                    throw new IOException();
                                } catch (IOException e2) {
                                    e = e2;
                                    iVar3 = iVarA;
                                    bArr = bArr2;
                                    list = list2;
                                    if (iVar3 != null) {
                                        throw new com.xmlywind.volley.j(e);
                                    }
                                    iA = iVar3.a();
                                    t.c("%s Unexpected response code %d for %s", e.getMessage(), Integer.valueOf(iA), lVar.h());
                                    if (bArr != null) {
                                        iVar = new com.xmlywind.volley.i(iA, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, list);
                                        if (iA != 401 || iA == 403) {
                                            aVar = new com.xmlywind.volley.a(iVar);
                                        } else if (iA == 301 || iA == 302) {
                                            aVar = new com.xmlywind.volley.a(iVar);
                                        } else {
                                            if (iA >= 400 && iA <= 499) {
                                                throw new q(iVar);
                                            }
                                            if (iA < 500 || iA > 599) {
                                                throw new q(iVar);
                                            }
                                            if (!lVar.n()) {
                                                throw new q(iVar);
                                            }
                                            hVar = new q(iVar);
                                            str = "server";
                                        }
                                        a("auth", lVar, aVar);
                                    } else {
                                        hVar = new com.xmlywind.volley.h(e);
                                        str = "network";
                                    }
                                    a(str, lVar, hVar);
                                }
                                list2 = listB;
                            } catch (IOException e3) {
                                e = e3;
                                list2 = listB;
                            }
                            bArr2 = bArrA;
                        } catch (IOException e4) {
                            e = e4;
                            listEmptyList = listB;
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (IOException e6) {
                    e = e6;
                    list = listEmptyList;
                    bArr = null;
                }
            } catch (MalformedURLException e7) {
                throw new RuntimeException("Bad URL " + lVar.h(), e7);
            } catch (SocketTimeoutException unused) {
                a("socket", lVar, new r());
            }
        }
        return iVar2;
    }
}
