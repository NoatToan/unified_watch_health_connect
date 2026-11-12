package uk2;

import al2.k;
import al2.l;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import pk2.x;
import yt2.f;
import zk.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luk2/a;", "Ltk2/a;", "", "enableAdHocAnalytics", "<init>", "(Z)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a extends tk2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap<String, ArrayList<p<l, c>>> f171917d;

    static {
        new C3197a(null);
    }

    public a(boolean z14) {
        super(z14);
        this.f171917d = new ConcurrentHashMap<>();
    }

    public static void c(d dVar) {
        String errorStackTrace;
        zk.a aVarA = dVar.a();
        if (aVarA == null) {
            return;
        }
        List<e> list = aVarA.f205030b;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((e) it.next()).f205041b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof kc2.b) {
                arrayList2.add(obj);
            }
        }
        kc2.b bVar = (kc2.b) h0.d0(arrayList2);
        if (bVar != null && (errorStackTrace = bVar.getErrorStackTrace()) != null) {
            if (w.z(errorStackTrace, "UnknownHostException", false)) {
                ArrayList arrayList3 = new ArrayList(y.r(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((e) it3.next()).f205041b);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (obj2 instanceof kc2.e) {
                        arrayList4.add(obj2);
                    }
                }
                kc2.e eVar = (kc2.e) h0.d0(arrayList4);
                Object obj3 = null;
                if (!s.g(eVar != null ? eVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String() : null, "CONNECTED")) {
                    for (Object obj4 : list) {
                        if (((e) obj4).f205040a.equals("IsBackground")) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    e eVar2 = (e) obj3;
                    if (eVar2 != null ? eVar2.f205041b.equals(Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
        }
        yt2.e eVar3 = new yt2.e(aVarA);
        f.f199669a.getClass();
        f.a(eVar3, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tk2.a
    public final void a(al2.c cVar) {
        int i14;
        int i15;
        rs2.c cVar2 = cVar.f3775a;
        synchronized (this) {
            try {
                ArrayList<p<l, c>> arrayListPut = this.f171917d.put(cVar2.getF92741e(), new ArrayList<>());
                i14 = 0;
                if (arrayListPut != null) {
                    ArrayList arrayList = new ArrayList(y.r(arrayListPut, 10));
                    Iterator<T> it = arrayListPut.iterator();
                    while (it.hasNext()) {
                        arrayList.add((c) ((p) it.next()).f128595b);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (i14 < arrayList.size()) {
                        int iB = 500;
                        while (true) {
                            i15 = i14 + 1;
                            c cVar3 = (c) arrayList.get(i14);
                            iB = iB + 300 + cVar3.b();
                            arrayList2.add(cVar3);
                            if (i15 >= arrayList.size() || iB >= 30000) {
                                break;
                            } else {
                                i14 = i15;
                            }
                        }
                        try {
                            d.c cVar4 = new d.c();
                            cVar4.e(cVar2, arrayList2);
                            c(cVar4);
                        } catch (Exception unused) {
                        }
                        arrayList2.clear();
                        i14 = i15;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        al2.b bVar = cVar.f3777c;
        if (bVar.f3774a) {
            if (i14 > 0 || bVar == al2.b.NO_ITEMS) {
                try {
                    d.a aVar = new d.a();
                    aVar.e(cVar);
                    c(aVar);
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tk2.a
    public final void b(l lVar) {
        lVar.getClass();
        x xVar = lVar.f3823e;
        Object obj = null;
        if ((xVar != null ? xVar.f138496a : null) == pk2.y.FILE_TYPE_BLOCKING_FAILURE) {
            CoreTransferException coreTransferException = lVar.f3826h;
            if ((coreTransferException != null ? coreTransferException.getFailure() : null) == ok2.e.f132641i) {
                return;
            }
        }
        if (lVar.f3822d == k.SKIPPED) {
            CoreTransferException coreTransferException2 = lVar.f3826h;
            if ((coreTransferException2 != null ? coreTransferException2.getFailure() : null) == ok2.e.D) {
                return;
            }
        }
        synchronized (this.f171917d) {
            try {
                ArrayList<p<l, c>> arrayList = this.f171917d.get(lVar.f3819a.getF92741e());
                if (arrayList != null) {
                    for (Object obj2 : arrayList) {
                        l lVar2 = (l) ((p) obj2).f128594a;
                        UUID uuid = lVar2.f3821c.f185842a;
                        if (s.g(uuid, uuid)) {
                            CoreTransferException coreTransferException3 = lVar2.f3826h;
                            if ((coreTransferException3 != null ? coreTransferException3.getFailure() : null) == ok2.e.f132639g) {
                                obj = obj2;
                                break;
                            }
                        }
                    }
                    p pVar = (p) obj;
                    if (pVar != null) {
                        arrayList.remove(pVar);
                    }
                    arrayList.add(new p<>(lVar, c.a.a(c.f171924n, lVar)));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: uk2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luk2/a$a;", "", "<init>", "()V", "", "MAX_EVENT_PAYLOAD_SIZE", "I", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3197a {
        public /* synthetic */ C3197a(j jVar) {
            this();
        }

        private C3197a() {
        }
    }

    public a() {
        this(false, 1, null);
    }

    public /* synthetic */ a(boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }
}
