package com.xmlywind.volley.toolbox;

import android.os.SystemClock;
import com.google.common.net.HttpHeaders;
import com.xmlywind.volley.p;
import com.xmlywind.volley.q;
import com.xmlywind.volley.r;
import com.xmlywind.volley.s;
import com.xmlywind.volley.t;
import java.io.IOException;
import java.io.InputStream;
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
public class b implements com.xmlywind.volley.f {
    public static final boolean a = t.b;
    public final c b;
    private final a c;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    public b(a aVar, c cVar) {
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

    private static void a(String str, com.xmlywind.volley.l<?> lVar) {
        lVar.a(String.format("%s-Redirect [timeout=%s]", str, Integer.valueOf(lVar.p())));
    }

    private static void a(String str, com.xmlywind.volley.l<?> lVar, s sVar) throws s {
        p pVarR = lVar.r();
        int iP = lVar.p();
        try {
            pVarR.a(sVar);
            lVar.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iP)));
        } catch (s e) {
            lVar.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iP)));
            throw e;
        }
    }

    private byte[] a(InputStream inputStream, int i) throws IOException {
        byte[] byteArray;
        n nVar = new n(this.b, i);
        byte[] bArrA = null;
        try {
            bArrA = this.b.a(1024);
            long j = 0;
            while (true) {
                int i2 = inputStream.read(bArrA);
                if (i2 == -1 || (i >= 1 && j >= i)) {
                    break;
                }
                nVar.write(bArrA, 0, i2);
                j += (long) i2;
            }
            byteArray = nVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused) {
                t.a("Error occurred when closing InputStream", new Object[0]);
            }
            this.b.a(bArrA);
        } catch (Throwable th) {
            try {
                t.c("readError", th.getMessage());
                byteArray = nVar.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        t.a("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.b.a(bArrA);
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                        t.a("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.b.a(bArrA);
                nVar.close();
            }
        }
        return byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01ed A[Catch: all -> 0x014c, TryCatch #9 {all -> 0x014c, blocks: (B:4:0x0012, B:74:0x0157, B:76:0x0172, B:89:0x0199, B:91:0x019f, B:92:0x01a4, B:93:0x01a8, B:94:0x01ad, B:98:0x01b6, B:100:0x01bc, B:101:0x01c2, B:102:0x01c7, B:104:0x01ca, B:106:0x01d0, B:107:0x01d6, B:108:0x01db, B:109:0x01dc, B:110:0x01e1, B:111:0x01e2, B:112:0x01e9, B:113:0x01ed, B:114:0x01f3, B:122:0x0216, B:123:0x021b, B:125:0x021d, B:126:0x0237, B:127:0x0238), top: B:155:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01f3 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #9 {all -> 0x014c, blocks: (B:4:0x0012, B:74:0x0157, B:76:0x0172, B:89:0x0199, B:91:0x019f, B:92:0x01a4, B:93:0x01a8, B:94:0x01ad, B:98:0x01b6, B:100:0x01bc, B:101:0x01c2, B:102:0x01c7, B:104:0x01ca, B:106:0x01d0, B:107:0x01d6, B:108:0x01db, B:109:0x01dc, B:110:0x01e1, B:111:0x01e2, B:112:0x01e9, B:113:0x01ed, B:114:0x01f3, B:122:0x0216, B:123:0x021b, B:125:0x021d, B:126:0x0237, B:127:0x0238), top: B:155:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0157 A[Catch: all -> 0x014c, TRY_ENTER, TryCatch #9 {all -> 0x014c, blocks: (B:4:0x0012, B:74:0x0157, B:76:0x0172, B:89:0x0199, B:91:0x019f, B:92:0x01a4, B:93:0x01a8, B:94:0x01ad, B:98:0x01b6, B:100:0x01bc, B:101:0x01c2, B:102:0x01c7, B:104:0x01ca, B:106:0x01d0, B:107:0x01d6, B:108:0x01db, B:109:0x01dc, B:110:0x01e1, B:111:0x01e2, B:112:0x01e9, B:113:0x01ed, B:114:0x01f3, B:122:0x0216, B:123:0x021b, B:125:0x021d, B:126:0x0237, B:127:0x0238), top: B:155:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0172 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #9 {all -> 0x014c, blocks: (B:4:0x0012, B:74:0x0157, B:76:0x0172, B:89:0x0199, B:91:0x019f, B:92:0x01a4, B:93:0x01a8, B:94:0x01ad, B:98:0x01b6, B:100:0x01bc, B:101:0x01c2, B:102:0x01c7, B:104:0x01ca, B:106:0x01d0, B:107:0x01d6, B:108:0x01db, B:109:0x01dc, B:110:0x01e1, B:111:0x01e2, B:112:0x01e9, B:113:0x01ed, B:114:0x01f3, B:122:0x0216, B:123:0x021b, B:125:0x021d, B:126:0x0237, B:127:0x0238), top: B:155:0x0012 }] */
    @Override // com.xmlywind.volley.f
    public com.xmlywind.volley.i a(com.xmlywind.volley.l<?> lVar) throws Throwable {
        List<com.xmlywind.volley.e> list;
        byte[] bArr;
        int iA;
        s hVar;
        String str;
        q qVar;
        com.xmlywind.volley.i iVar;
        byte[] bArrA;
        List<com.xmlywind.volley.e> list2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            List<com.xmlywind.volley.e> listEmptyList = Collections.emptyList();
            i iVar2 = null;
            try {
                try {
                    i iVarA = this.c.a(lVar, a(lVar.i()));
                    try {
                        try {
                            int iA2 = iVarA.a();
                            List<com.xmlywind.volley.e> listB = iVarA.b();
                            try {
                                if (iA2 == 304) {
                                    com.xmlywind.volley.b.a aVarI = lVar.i();
                                    if (aVarI != null) {
                                        iVar = new com.xmlywind.volley.i(304, aVarI.a, true, SystemClock.elapsedRealtime() - jElapsedRealtime, a(listB, aVarI));
                                        if (iVarA.d() == null) {
                                            break;
                                        }
                                        try {
                                            iVarA.d().close();
                                            break;
                                        } catch (IOException e) {
                                            t.c(e.getMessage(), new Object[0]);
                                            break;
                                        }
                                    }
                                    iVar = new com.xmlywind.volley.i(304, null, true, SystemClock.elapsedRealtime() - jElapsedRealtime, listB);
                                    if (iVarA.d() == null) {
                                        break;
                                    }
                                    try {
                                        iVarA.d().close();
                                        break;
                                    } catch (IOException e2) {
                                        t.c(e2.getMessage(), new Object[0]);
                                        break;
                                    }
                                }
                                if (iA2 == 301 || iA2 == 302) {
                                    try {
                                        String str2 = a(listB).get("Location");
                                        lVar.c(str2);
                                        lVar.a("redirectURL: " + str2);
                                    } catch (IOException e3) {
                                        e = e3;
                                        listEmptyList = listB;
                                        list = listEmptyList;
                                        bArr = null;
                                        iVar2 = iVarA;
                                        if (iVar2 != null) {
                                            throw new com.xmlywind.volley.j(e);
                                        }
                                        iA = iVar2.a();
                                        t.c("Unexpected response code %d for %s", Integer.valueOf(iA), lVar.h());
                                        if (bArr != null) {
                                            com.xmlywind.volley.i iVar3 = new com.xmlywind.volley.i(iA, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, list);
                                            if (iA != 301 || iA == 302) {
                                                a("redirect", lVar);
                                            } else if (iA == 401 || iA == 403) {
                                                hVar = new com.xmlywind.volley.a(iVar3);
                                                str = "auth";
                                            } else {
                                                if (iA < 400 || iA > 499) {
                                                    if (iA < 500 || iA > 599) {
                                                        if (iA <= 599) {
                                                            throw new q(iVar3);
                                                        }
                                                        if (!lVar.n()) {
                                                            throw new q(iVar3);
                                                        }
                                                        qVar = new q(iVar3);
                                                    } else {
                                                        if (!lVar.n()) {
                                                            throw new q(iVar3);
                                                        }
                                                        qVar = new q(iVar3);
                                                    }
                                                } else {
                                                    if (!lVar.n()) {
                                                        throw new q(iVar3);
                                                    }
                                                    qVar = new q(iVar3);
                                                }
                                                a("server", lVar, qVar);
                                            }
                                            if (iVar2.d() != null) {
                                                try {
                                                    iVar2.d().close();
                                                } catch (IOException e4) {
                                                    t.c(e4.getMessage(), new Object[0]);
                                                }
                                            }
                                        } else {
                                            hVar = new com.xmlywind.volley.h(e);
                                            str = "network";
                                        }
                                        a(str, lVar, hVar);
                                        if (iVar2.d() != null) {
                                            iVar2.d().close();
                                        }
                                    }
                                }
                                InputStream inputStreamD = iVarA.d();
                                if (inputStreamD != null) {
                                    int iC = iVarA.c();
                                    if (lVar.d() >= 0) {
                                        iC = lVar.d();
                                    }
                                    bArrA = a(inputStreamD, iC);
                                } else {
                                    bArrA = new byte[0];
                                }
                                byte[] bArr2 = bArrA;
                                try {
                                    list2 = listB;
                                    try {
                                        a(SystemClock.elapsedRealtime() - jElapsedRealtime, lVar, bArr2, iA2);
                                        if (iA2 >= 200 && iA2 <= 299) {
                                            iVar = new com.xmlywind.volley.i(iA2, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, list2);
                                            if (iVarA.d() == null) {
                                                break;
                                            }
                                            try {
                                                iVarA.d().close();
                                                break;
                                            } catch (IOException e5) {
                                                t.c(e5.getMessage(), new Object[0]);
                                                break;
                                            }
                                        }
                                        throw new IOException();
                                    } catch (IOException e6) {
                                        e = e6;
                                        iVar2 = iVarA;
                                        bArr = bArr2;
                                        list = list2;
                                        if (iVar2 != null) {
                                            throw new com.xmlywind.volley.j(e);
                                        }
                                        iA = iVar2.a();
                                        t.c("Unexpected response code %d for %s", Integer.valueOf(iA), lVar.h());
                                        if (bArr != null) {
                                            com.xmlywind.volley.i iVar4 = new com.xmlywind.volley.i(iA, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, list);
                                            if (iA != 301) {
                                                a("redirect", lVar);
                                            } else {
                                                a("redirect", lVar);
                                            }
                                            if (iVar2.d() != null) {
                                                iVar2.d().close();
                                            }
                                        } else {
                                            hVar = new com.xmlywind.volley.h(e);
                                            str = "network";
                                        }
                                        a(str, lVar, hVar);
                                        if (iVar2.d() != null) {
                                            iVar2.d().close();
                                        }
                                    }
                                } catch (IOException e7) {
                                    e = e7;
                                    list2 = listB;
                                }
                            } catch (IOException e8) {
                                e = e8;
                                listEmptyList = listB;
                            }
                        } catch (IOException e9) {
                            e = e9;
                        }
                    } catch (MalformedURLException e10) {
                        e = e10;
                        throw new RuntimeException("Bad URL " + lVar.h(), e);
                    } catch (SocketTimeoutException unused) {
                        iVar2 = iVarA;
                        a("socket", lVar, new r());
                        if (iVar2 != null && iVar2.d() != null) {
                            try {
                                iVar2.d().close();
                            } catch (IOException e11) {
                                t.c(e11.getMessage(), new Object[0]);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        iVar2 = iVarA;
                        Throwable th2 = th;
                        if (iVar2 == null || iVar2.d() == null) {
                            throw th2;
                        }
                        try {
                            iVar2.d().close();
                            throw th2;
                        } catch (IOException e12) {
                            t.c(e12.getMessage(), new Object[0]);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (MalformedURLException e13) {
                e = e13;
            } catch (SocketTimeoutException unused2) {
            } catch (IOException e14) {
                e = e14;
                list = listEmptyList;
                bArr = null;
            }
        }
        return iVar;
    }
}
