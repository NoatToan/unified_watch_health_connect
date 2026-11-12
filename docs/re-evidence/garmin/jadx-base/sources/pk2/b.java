package pk2;

import android.os.SystemClock;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.device.filetransfer.ItemListingException;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.proto.generated.GDIFileAccess;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.TimeoutCancellationException;
import o53.c2;
import o53.j2;
import o53.l1;
import ok2.g0;
import org.apache.commons.codec.language.bm.Rule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.l0;
import p13.w0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lpk2/b;", "", "Lzk2/d;", "pending", "Lrs2/c;", "device", "Lok2/b;", "helper", "Lo53/b0;", "coroutineScope", "<init>", "(Lzk2/d;Lrs2/c;Lok2/b;Lo53/b0;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f138357m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk2.d f138358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rs2.c f138359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ok2.b f138360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.b0 f138361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f138362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap<lk2.v, Integer> f138363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<l1> f138364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f138365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f138366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f138367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Long f138368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference<cz2.p> f138369l;

    /* JADX INFO: renamed from: pk2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$cleanupUnexpectedFiles$1", f = "AgentQueueHelper.kt", l = {}, m = "invokeSuspend")
    public static final class C2619b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<wk2.f> f138371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wk2.h f138372c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2619b(List<wk2.f> list, wk2.h hVar, t13.d<? super C2619b> dVar) {
            super(2, dVar);
            this.f138371b = list;
            this.f138372c = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C2619b(this.f138371b, this.f138372c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2619b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            cl2.h hVar = cl2.h.f27950a;
            long f92746j = b.this.f138359b.getF92746j();
            hVar.getClass();
            Logger logger = cl2.h.f27951b;
            List<wk2.f> list = this.f138371b;
            list.getClass();
            wk2.h hVar2 = this.f138372c;
            hVar2.getClass();
            try {
                for (File file : cl2.h.c(hVar2, f92746j)) {
                    List listW = d53.w.W(a23.g.f(file), new String[]{"--"});
                    if (listW.size() != 2) {
                        logger.warn("Failed to parse file type/id for " + file.getName());
                    } else {
                        String str = (String) listW.get(0);
                        String str2 = (String) listW.get(1);
                        if (!list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    wk2.f fVar = (wk2.f) it.next();
                                    if (!p005kotlin.jvm.internal.s.g(fVar.f185842a.toString(), str2) || !p005kotlin.jvm.internal.s.g(fVar.f185843b, str)) {
                                    }
                                }
                            }
                        }
                        if (!file.delete()) {
                            logger.debug("deleteUnexpectedFiles: Did not delete file " + file.getName());
                        }
                    }
                }
            } catch (Exception e4) {
                logger.warn("deleteUnexpectedFiles failure", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public b(zk2.d dVar, rs2.c cVar, ok2.b bVar, o53.b0 b0Var) {
        dVar.getClass();
        cVar.getClass();
        bVar.getClass();
        b0Var.getClass();
        this.f138358a = dVar;
        this.f138359b = cVar;
        this.f138360c = bVar;
        this.f138361d = b0Var;
        Logger logger = LoggerFactory.getLogger("CFT#AgentQueueHelper@" + cVar.getF92741e());
        logger.getClass();
        this.f138362e = logger;
        this.f138363f = new ConcurrentHashMap<>();
        this.f138364g = new AtomicReference<>(null);
        bVar.getConfiguration().n().f();
        this.f138365h = 300000L;
        bVar.getConfiguration().n().e();
        this.f138366i = 300000L;
        this.f138369l = new AtomicReference<>(new cz2.p());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable a(b bVar, c0 c0Var, ok2.y yVar, v13.c cVar) throws Exception {
        e eVar;
        bVar.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f138385d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f138385d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar, cVar);
            }
        } else {
            eVar = new e(bVar, cVar);
        }
        Object obj = eVar.f138383b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f138385d;
        try {
            if (i15 != 0) {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList = eVar.f138382a;
                o13.r.b(obj);
                return arrayList;
            }
            o13.r.b(obj);
            p0 p0Var = new p0();
            ArrayList arrayList2 = new ArrayList();
            bVar.f138362e.info("createDownloadItems() for ".concat(c0Var.A()));
            bVar.f138360c.getClass();
            f fVar = new f(yVar, c0Var, bVar, arrayList2, p0Var, null);
            eVar.f138382a = arrayList2;
            eVar.f138385d = 1;
            return j2.b(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, fVar, eVar) == aVar ? aVar : arrayList2;
        } catch (Exception e4) {
            if ((e4 instanceof CoreTransferException) && cl2.c.h((CoreTransferException) e4)) {
                throw e4;
            }
            if (e4 instanceof NoNetworkException) {
                throw new CoreTransferException(ok2.e.f132643k, fb1.c.n("DownloadAgent listFiles failed: ", e4.getMessage()), e4);
            }
            throw new CoreTransferException(ok2.e.f132651t, fb1.c.n("DownloadAgent listFiles failed: ", e4.getMessage()), e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(b bVar, ok2.y yVar, v13.c cVar) {
        l lVar;
        HashSet hashSet;
        b bVar2;
        ok2.y yVar2;
        r0 r0Var;
        m0 m0Var;
        bVar.getClass();
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f138425h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f138425h = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(bVar, cVar);
            }
        } else {
            lVar = new l(bVar, cVar);
        }
        Object obj = lVar.f138423f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f138425h;
        if (i15 == 0) {
            o13.r.b(obj);
            m0 m0Var2 = new m0();
            m0Var2.f105804a = true;
            r0 r0Var2 = new r0();
            hashSet = new HashSet();
            m mVar = new m(bVar, yVar, hashSet, r0Var2, m0Var2, null);
            lVar.f138418a = bVar;
            lVar.f138419b = yVar;
            lVar.f138420c = m0Var2;
            lVar.f138421d = r0Var2;
            lVar.f138422e = hashSet;
            lVar.f138425h = 1;
            if (ge1.b.Y(mVar, lVar) == aVar) {
                return aVar;
            }
            bVar2 = bVar;
            yVar2 = yVar;
            r0Var = r0Var2;
            m0Var = m0Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            HashSet hashSet2 = lVar.f138422e;
            r0Var = lVar.f138421d;
            m0Var = lVar.f138420c;
            yVar2 = lVar.f138419b;
            b bVar3 = lVar.f138418a;
            o13.r.b(obj);
            hashSet = hashSet2;
            bVar2 = bVar3;
        }
        if (m0Var.f105804a && r0Var.f105810a != 0) {
            zk2.d dVar = bVar2.f138358a;
            dVar.getClass();
            hashSet.getClass();
            Map<UUID, zk2.k> map = dVar.f205129c;
            map.getClass();
            synchronized (map) {
                try {
                    Map<UUID, zk2.k> map2 = dVar.f205129c;
                    map2.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<UUID, zk2.k> entry : map2.entrySet()) {
                        if (!hashSet.contains(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (((zk2.k) entry2.getValue()).f205156f == wk2.m.f185864d) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    for (o13.p pVar : w0.o(linkedHashMap2)) {
                        A a14 = pVar.f128594a;
                        a14.getClass();
                        dVar.o((UUID) a14);
                        ((zk2.k) pVar.f128595b).k(x.a.c(x.f138495e, ok2.e.E, "removeUnknownDownloads", null, 4));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (yVar2.f132813g != ok2.y.b.DOWNLOAD_CACHE_PREFERRED) {
                bVar2.f138368k = (Long) r0Var.f105810a;
            }
            bVar2.h(wk2.h.PHONE_TO_DEVICE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(b bVar, ok2.y yVar, v13.c cVar) throws Exception {
        n nVar;
        boolean z14;
        r0 r0Var;
        T t7;
        ok2.y yVar2;
        r0 r0Var2;
        b bVar2;
        boolean z15;
        r0 r0Var3;
        T t14;
        bVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f138448h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f138448h = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(bVar, cVar);
            }
        } else {
            nVar = new n(bVar, cVar);
        }
        Object obj = nVar.f138446f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f138448h;
        if (i15 != 0) {
            if (i15 == 1) {
                boolean z16 = nVar.f138445e;
                r0Var2 = nVar.f138444d;
                r0Var = nVar.f138443c;
                yVar2 = (ok2.y) nVar.f138442b;
                b bVar3 = nVar.f138441a;
                o13.r.b(obj);
                z14 = z16;
                bVar = bVar3;
                t7 = obj;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z15 = nVar.f138445e;
                r0Var3 = (r0) nVar.f138442b;
                bVar2 = nVar.f138441a;
                o13.r.b(obj);
            }
            if (((Long) obj) == null) {
                r0Var3.f105810a = null;
            }
            t14 = r0Var3.f105810a;
            if (t14 != 0) {
                bVar2.f138367j = (Long) t14;
                if (!z15) {
                    bVar2.h(wk2.h.DEVICE_TO_PHONE);
                }
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        ConcurrentHashMap<lk2.v, Integer> concurrentHashMap = bVar.f138363f;
        concurrentHashMap.getClass();
        z14 = !concurrentHashMap.isEmpty();
        r0Var = new r0();
        List<f0> list = bVar.f138360c.getConfiguration().f132627g;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            List<String> list2 = ((f0) obj2).getF159941g().f113305d;
            lk2.v.f113300e.getClass();
            if (p005kotlin.jvm.internal.s.g(list2, null)) {
                arrayList.add(obj2);
            }
        }
        nVar.f138441a = bVar;
        nVar.f138442b = yVar;
        nVar.f138443c = r0Var;
        nVar.f138444d = r0Var;
        nVar.f138445e = z14;
        nVar.f138448h = 1;
        Object objL = bVar.l(arrayList, yVar, nVar);
        if (objL != aVar) {
            t7 = objL;
            yVar2 = yVar;
            r0Var2 = r0Var;
        }
        return aVar;
        r0Var2.f105810a = t7;
        List<f0> list3 = bVar.f138360c.getConfiguration().f132627g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list3) {
            List<String> list4 = ((f0) obj3).getF159941g().f113305d;
            if (list4 != null && !list4.isEmpty()) {
                arrayList2.add(obj3);
            }
        }
        nVar.f138441a = bVar;
        nVar.f138442b = r0Var;
        nVar.f138443c = null;
        nVar.f138444d = null;
        nVar.f138445e = z14;
        nVar.f138448h = 2;
        Object objL2 = bVar.l(arrayList2, yVar2, nVar);
        if (objL2 != aVar) {
            bVar2 = bVar;
            z15 = z14;
            obj = objL2;
            r0Var3 = r0Var;
            if (((Long) obj) == null) {
                r0Var3.f105810a = null;
            }
            t14 = r0Var3.f105810a;
            if (t14 != 0) {
                bVar2.f138367j = (Long) t14;
                if (!z15) {
                    bVar2.h(wk2.h.DEVICE_TO_PHONE);
                }
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        if (r9.m(r2, null, r10, r0) == r1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b bVar, v13.c cVar) {
        s sVar;
        Object next;
        bVar.getClass();
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f138480d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f138480d = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(bVar, cVar);
            }
        } else {
            sVar = new s(bVar, cVar);
        }
        Object objN = sVar.f138478b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f138480d;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    bVar = sVar.f138477a;
                    o13.r.b(objN);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b bVar2 = sVar.f138477a;
                    o13.r.b(objN);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(objN);
            Collection<Integer> collectionValues = bVar.f138363f.values();
            collectionValues.getClass();
            Iterator<T> it = collectionValues.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Integer num = (Integer) next;
                    num.getClass();
                    int iIntValue = num.intValue();
                    do {
                        Object next2 = it.next();
                        Integer num2 = (Integer) next2;
                        num2.getClass();
                        int iIntValue2 = num2.intValue();
                        if (iIntValue > iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Integer num3 = (Integer) next;
            if (num3 == null) {
                bVar.f138362e.info("Skip refreshDeviceFileList, queue not yet populated");
                return Unit.INSTANCE;
            }
            List<f0> list = bVar.f138360c.getConfiguration().f132627g;
            sVar.f138477a = bVar;
            sVar.f138480d = 1;
            objN = n(bVar, list, num3, sVar, 2);
            if (objN == aVar) {
            }
            return aVar;
            lk2.x xVar = (lk2.x) objN;
            if (xVar == null) {
                return Unit.INSTANCE;
            }
            List<f0> list2 = bVar.f138360c.getConfiguration().f132627g;
            sVar.f138477a = bVar;
            sVar.f138480d = 2;
        } catch (Exception e4) {
            com.airbnb.lottie.animation.keyframe.a.A("Failed refreshDeviceFileList: ", e4.getMessage(), bVar.f138362e);
        }
    }

    public static final g0 e(b bVar, g0 g0Var, wk2.f fVar, ok2.y yVar) {
        Collection<String> collection;
        bVar.getClass();
        if (yVar != null) {
            wk2.h hVar = fVar.f185844c;
            hVar.getClass();
            collection = hVar == wk2.h.PHONE_TO_DEVICE ? yVar.f132808b : yVar.f132807a;
        } else {
            collection = null;
        }
        if ((yVar != null ? yVar.f132811e : null) == null || (collection != null && collection.isEmpty())) {
            return g0Var;
        }
        return cl2.c.q(g0Var, bVar.f138358a.j(fVar, collection) ? yVar.f132811e : null, collection != null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    public static Object n(b bVar, List list, Integer num, v13.c cVar, int i14) {
        ArrayList arrayList;
        Iterator it;
        Object next;
        int iIntValue;
        Object next2;
        int iIntValue2;
        Integer num2;
        lk2.v vVar;
        boolean z14 = (i14 & 2) != 0;
        if ((i14 & 4) != 0) {
            num = null;
        }
        ok2.b bVar2 = bVar.f138360c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            p13.d0.v(arrayList2, ((f0) it3.next()).getF159941g().f113303b);
        }
        if (z14) {
            if (!list.isEmpty()) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (((f0) it4.next()).getF159941g().f113305d == null) {
                            arrayList = null;
                        }
                    }
                }
            }
            arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                Iterable iterable = ((f0) it5.next()).getF159941g().f113305d;
                if (iterable == null) {
                    iterable = l0.f134950a;
                }
                p13.d0.v(arrayList, iterable);
            }
        } else {
            arrayList = null;
        }
        if (num != null) {
            vVar = new lk2.v(l0.f134950a, arrayList2, arrayList, num);
        } else {
            ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList3.add(bVar.f138363f.get(((f0) it6.next()).getF159941g()));
            }
            if (arrayList3.isEmpty()) {
                it = arrayList3.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        Integer num3 = (Integer) next;
                        num3.getClass();
                        iIntValue = num3.intValue();
                        do {
                            next2 = it.next();
                            Integer num4 = (Integer) next2;
                            num4.getClass();
                            iIntValue2 = num4.intValue();
                            if (iIntValue > iIntValue2) {
                                next = next2;
                                iIntValue = iIntValue2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                num2 = (Integer) next;
            } else {
                Iterator it7 = arrayList3.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        it = arrayList3.iterator();
                        if (it.hasNext()) {
                            next = null;
                        } else {
                            next = it.next();
                            if (it.hasNext()) {
                                Integer num5 = (Integer) next;
                                num5.getClass();
                                iIntValue = num5.intValue();
                                do {
                                    next2 = it.next();
                                    Integer num6 = (Integer) next2;
                                    num6.getClass();
                                    iIntValue2 = num6.intValue();
                                    if (iIntValue > iIntValue2) {
                                        next = next2;
                                        iIntValue = iIntValue2;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        num2 = (Integer) next;
                    } else if (((Integer) it7.next()) == null) {
                        num2 = null;
                    }
                }
            }
            List<f0> list2 = bVar2.getConfiguration().f132627g;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it8 = list2.iterator();
            while (it8.hasNext()) {
                p13.d0.v(arrayList4, ((f0) it8.next()).getF159941g().f113303b);
            }
            vVar = new lk2.v(arrayList2, arrayList4, arrayList, num2);
        }
        bVar2.getClass();
        return j2.b(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, new u(bVar, vVar, list, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098 A[EDGE_INSN: B:30:0x0098->B:31:0x009b BREAK  A[LOOP:0: B:23:0x007e->B:41:?]] */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:23:0x007e->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v13.c cVar) {
        c cVar2;
        b bVar;
        l1 l1Var;
        CancellationException cancellationException;
        AtomicReference<l1> atomicReference;
        Logger logger;
        l1 andSet;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f138379e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f138379e = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f138377c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f138379e;
        if (i15 == 0) {
            o13.r.b(obj);
            l1 l1Var2 = this.f138364g.get();
            if (l1Var2 != null) {
                try {
                    this.f138360c.getClass();
                    long j8 = ((long) 2) * SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
                    d dVar = new d(l1Var2, null);
                    cVar2.f138375a = this;
                    cVar2.f138376b = l1Var2;
                    cVar2.f138379e = 1;
                    if (j2.b(j8, dVar, cVar2) == aVar) {
                        return aVar;
                    }
                } catch (TimeoutCancellationException unused) {
                    bVar = this;
                    l1Var = l1Var2;
                    ok2.b bVar2 = bVar.f138360c;
                    atomicReference = bVar.f138364g;
                    logger = bVar.f138362e;
                    bVar2.getClass();
                    cancellationException = new CancellationException(androidx.room.a0.f(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US * ((long) 2), "activePopulateQueue timed out after ", "ms"));
                    logger.warn(cancellationException.getMessage());
                    while (!atomicReference.compareAndSet(l1Var, null)) {
                        if (atomicReference.get() != l1Var) {
                            logger.warn("activePopulateQueue job doesn't match, clearing anyway");
                            andSet = atomicReference.getAndSet(null);
                            if (andSet != null) {
                                break;
                            }
                            andSet.c(cancellationException);
                            break;
                        }
                    }
                    l1Var.c(cancellationException);
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l1Var = cVar2.f138376b;
            bVar = cVar2.f138375a;
            try {
                o13.r.b(obj);
            } catch (TimeoutCancellationException unused2) {
                ok2.b bVar3 = bVar.f138360c;
                atomicReference = bVar.f138364g;
                logger = bVar.f138362e;
                bVar3.getClass();
                cancellationException = new CancellationException(androidx.room.a0.f(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US * ((long) 2), "activePopulateQueue timed out after ", "ms"));
                logger.warn(cancellationException.getMessage());
                while (!atomicReference.compareAndSet(l1Var, null)) {
                    if (atomicReference.get() != l1Var) {
                        logger.warn("activePopulateQueue job doesn't match, clearing anyway");
                        andSet = atomicReference.getAndSet(null);
                        if (andSet != null) {
                            break;
                        }
                        andSet.c(cancellationException);
                        break;
                    }
                }
                l1Var.c(cancellationException);
            }
        }
        return Unit.INSTANCE;
    }

    public final void g(ok2.e eVar, String str) {
        this.f138362e.error(eVar + " - " + str);
        zk2.d dVar = this.f138358a;
        dVar.getClass();
        eVar.getClass();
        str.getClass();
        Map<UUID, zk2.k> map = dVar.f205129c;
        map.getClass();
        synchronized (map) {
            ArrayList<al2.j> arrayList = dVar.f205130d;
            al2.j.f3803d.getClass();
            arrayList.add(new al2.j((wk2.f) null, false, new CoreTransferException(eVar, str, null, 4, null)));
        }
    }

    public final void h(wk2.h hVar) {
        ArrayList arrayList;
        zk2.d dVar = this.f138358a;
        dVar.getClass();
        hVar.getClass();
        Map<UUID, zk2.k> map = dVar.f205129c;
        map.getClass();
        synchronized (map) {
            Collection<zk2.k> collectionValues = dVar.f205129c.values();
            arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (((zk2.k) obj).f205152b.f185844c == hVar) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((wk2.i) it.next()).getF205152b());
        }
        ge1.b.T(this.f138361d, null, null, new C2619b(arrayList2, hVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fb A[DONT_INVERT, PHI: r0 r5 r6
      0x01fb: PHI (r0v21 o53.l1) = (r0v8 o53.l1), (r0v8 o53.l1), (r0v31 o53.l1) binds: [B:97:0x01ea, B:99:0x01f8, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r5v28 ok2.y) = (r5v17 ok2.y), (r5v17 ok2.y), (r5v34 ok2.y) binds: [B:97:0x01ea, B:99:0x01f8, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r6v16 pk2.b) = (r6v10 pk2.b), (r6v10 pk2.b), (r6v19 pk2.b) binds: [B:97:0x01ea, B:99:0x01f8, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:105:0x020c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0214  */
    /* JADX WARN: Code duplicated, block: B:112:0x021c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x015c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:68:0x0178  */
    /* JADX WARN: Code duplicated, block: B:71:0x017c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01be  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0117 -> B:42:0x00f3). Please report as a decompilation issue!!! */
    public final Object i(ok2.y yVar, v13.c cVar) {
        g gVar;
        b bVar;
        c2 c2VarT;
        b bVar2;
        ok2.y yVar2;
        Iterator it;
        ok2.y.d dVar;
        l1 l1VarT;
        g0 g0Var;
        int iA;
        Long l14;
        long j8;
        long jLongValue;
        g0 g0Var2;
        int iA2;
        Long l15;
        long j14;
        boolean z14;
        long jLongValue2;
        ok2.y yVar3;
        b bVar3;
        g0 g0Var3;
        ok2.y yVar4 = yVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f138405f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f138405f = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f138403d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f138405f;
        boolean z15 = true;
        if (i15 != 0) {
            if (i15 == 1) {
                it = (Iterator) gVar.f138402c;
                yVar2 = gVar.f138401b;
                bVar2 = gVar.f138400a;
                try {
                    o13.r.b(obj);
                } catch (Exception e4) {
                    bVar2.f138362e.error("Failed to request new items from device " + bVar2.f138359b.getF92741e() + ": " + e4.getMessage());
                }
            } else {
                if (i15 == 2) {
                    l1VarT = (l1) gVar.f138402c;
                    yVar4 = gVar.f138401b;
                    bVar = gVar.f138400a;
                    o13.r.b(obj);
                    if (l1VarT != null) {
                        gVar.f138400a = bVar;
                        gVar.f138401b = yVar4;
                        gVar.f138402c = null;
                        gVar.f138405f = 3;
                        if (l1VarT.P(gVar) != aVar) {
                            yVar3 = yVar4;
                            bVar3 = bVar;
                        }
                        return aVar;
                    }
                    g0Var3 = yVar4.f132811e;
                    if (g0Var3 == null) {
                        g0Var3 = g0.UTILITY_SILENT;
                    }
                    if (g0Var3.a() >= 30) {
                        bVar.f138358a.s(new p40.h(14), new pk2.a(bVar, g0Var3, 0));
                    }
                    return Unit.INSTANCE;
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yVar3 = gVar.f138401b;
                bVar3 = gVar.f138400a;
                o13.r.b(obj);
            }
            yVar4 = yVar3;
            bVar = bVar3;
            g0Var3 = yVar4.f132811e;
            if (g0Var3 == null) {
                g0Var3 = g0.UTILITY_SILENT;
            }
            if (g0Var3.a() >= 30) {
                bVar.f138358a.s(new p40.h(14), new pk2.a(bVar, g0Var3, 0));
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        ok2.b bVar4 = this.f138360c;
        ok2.d configuration = bVar4.getConfiguration();
        Collection<String> collection = yVar4.f132808b;
        rs2.c cVar2 = this.f138359b;
        cVar2.getClass();
        Collection<String> collection2 = yVar4.f132807a;
        if ((collection2 != null && !collection2.isEmpty()) || (collection != null && !collection.isEmpty())) {
            Collection<String> collectionA = ok2.y.a(configuration, wk2.h.DEVICE_TO_PHONE, collection2, cVar2);
            Collection<String> collectionA2 = ok2.y.a(configuration, wk2.h.PHONE_TO_DEVICE, collection, cVar2);
            ok2.y.a aVar2 = new ok2.y.a(yVar4);
            aVar2.f132814a = collectionA;
            aVar2.f132815b = collectionA2;
            yVar4 = new ok2.y(aVar2);
        }
        Object obj2 = yVar4.f132811e;
        if (obj2 == null) {
            obj2 = "";
        }
        Logger logger = this.f138362e;
        logger.info("populateQueue(" + obj2 + "): " + yVar4);
        if (yVar4.f132813g == ok2.y.b.NO_CACHE_ALLOWED) {
            logger.debug("reset to get full file listings");
            this.f138367j = null;
            this.f138368k = null;
            this.f138363f.clear();
            this.f138369l.set(new cz2.p());
        }
        if (yVar4.f132809c != ok2.y.d.BLOCKED) {
            if (yVar4.f132812f) {
                yVar2 = yVar4;
                bVar2 = this;
                it = bVar4.getConfiguration().f132627g.iterator();
            } else {
                bVar2 = this;
            }
            g0Var2 = yVar4.f132811e;
            if (g0Var2 != null) {
                iA2 = g0Var2.a();
            } else {
                iA2 = 19;
            }
            if (iA2 >= 30) {
                bVar2.f138358a.m(wk2.h.DEVICE_TO_PHONE, yVar4.f132807a);
            }
            if (yVar4.f132809c == ok2.y.d.DEFAULT) {
                l15 = bVar2.f138367j;
                j14 = bVar2.f138365h;
                if (l15 == null) {
                    z14 = true;
                } else {
                    jLongValue2 = l15.longValue() + j14;
                    bVar2.f138360c.a();
                    if (jLongValue2 <= SystemClock.elapsedRealtime()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                if (z14) {
                    c2VarT = ge1.b.T(bVar2.f138361d, null, null, new h(bVar2, yVar4, null), 3);
                } else {
                    bVar2.f138362e.debug("populateQueue skip upload check since one occurred recently");
                    c2VarT = null;
                }
            } else {
                c2VarT = ge1.b.T(bVar2.f138361d, null, null, new h(bVar2, yVar4, null), 3);
            }
            bVar = bVar2;
        } else {
            yVar4 = yVar4;
            bVar = this;
            c2VarT = null;
        }
        dVar = yVar4.f132810d;
        if (dVar == ok2.y.d.BLOCKED) {
            l1VarT = null;
        } else {
            g0Var = yVar4.f132811e;
            if (g0Var != null) {
                iA = g0Var.a();
            } else {
                iA = 19;
            }
            if (iA >= 30) {
                bVar.f138358a.m(wk2.h.PHONE_TO_DEVICE, yVar4.f132808b);
            }
            if (dVar == ok2.y.d.DEFAULT) {
                l14 = bVar.f138368k;
                j8 = bVar.f138366i;
                if (l14 != null) {
                    jLongValue = l14.longValue() + j8;
                    bVar.f138360c.a();
                    if (jLongValue > SystemClock.elapsedRealtime()) {
                        z15 = false;
                    }
                }
                if (z15) {
                    bVar.f138362e.debug("populateQueue skip download check since one occurred recently");
                    l1VarT = null;
                }
            }
            l1VarT = ge1.b.T(bVar.f138361d, null, null, new i(bVar, yVar4, null), 3);
        }
        if (c2VarT != null) {
            gVar.f138400a = bVar;
            gVar.f138401b = yVar4;
            gVar.f138402c = l1VarT;
            gVar.f138405f = 2;
            if (c2VarT.P(gVar) != aVar) {
                if (l1VarT != null) {
                    gVar.f138400a = bVar;
                    gVar.f138401b = yVar4;
                    gVar.f138402c = null;
                    gVar.f138405f = 3;
                    if (l1VarT.P(gVar) != aVar) {
                        yVar3 = yVar4;
                        bVar3 = bVar;
                        yVar4 = yVar3;
                        bVar = bVar3;
                    }
                }
            }
            return aVar;
        }
        if (l1VarT != null) {
            gVar.f138400a = bVar;
            gVar.f138401b = yVar4;
            gVar.f138402c = null;
            gVar.f138405f = 3;
            if (l1VarT.P(gVar) != aVar) {
                yVar3 = yVar4;
                bVar3 = bVar;
                yVar4 = yVar3;
                bVar = bVar3;
            }
            return aVar;
        }
        g0Var3 = yVar4.f132811e;
        if (g0Var3 == null) {
            g0Var3 = g0.UTILITY_SILENT;
        }
        if (g0Var3.a() >= 30) {
            bVar.f138358a.s(new p40.h(14), new pk2.a(bVar, g0Var3, 0));
        }
        return Unit.INSTANCE;
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            rs2.c cVar3 = bVar2.f138359b;
            g0 g0Var4 = yVar2.f132811e;
            if (g0Var4 == null) {
                g0Var4 = g0.AUTOMATIC_ALLOWED;
            }
            gVar.f138400a = bVar2;
            gVar.f138401b = yVar2;
            gVar.f138402c = it;
            gVar.f138405f = 1;
            if (f0Var.j(cVar3, g0Var4, gVar) == aVar) {
                return aVar;
            }
        }
        yVar4 = yVar2;
        g0Var2 = yVar4.f132811e;
        if (g0Var2 != null) {
            iA2 = g0Var2.a();
        } else {
            iA2 = 19;
        }
        if (iA2 >= 30) {
            bVar2.f138358a.m(wk2.h.DEVICE_TO_PHONE, yVar4.f132807a);
        }
        if (yVar4.f132809c == ok2.y.d.DEFAULT) {
            l15 = bVar2.f138367j;
            j14 = bVar2.f138365h;
            if (l15 == null) {
                z14 = true;
            } else {
                jLongValue2 = l15.longValue() + j14;
                bVar2.f138360c.a();
                if (jLongValue2 <= SystemClock.elapsedRealtime()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (z14) {
                c2VarT = ge1.b.T(bVar2.f138361d, null, null, new h(bVar2, yVar4, null), 3);
            } else {
                bVar2.f138362e.debug("populateQueue skip upload check since one occurred recently");
                c2VarT = null;
            }
        } else {
            c2VarT = ge1.b.T(bVar2.f138361d, null, null, new h(bVar2, yVar4, null), 3);
        }
        bVar = bVar2;
        dVar = yVar4.f132810d;
        if (dVar == ok2.y.d.BLOCKED) {
            l1VarT = null;
        } else {
            g0Var = yVar4.f132811e;
            if (g0Var != null) {
                iA = g0Var.a();
            } else {
                iA = 19;
            }
            if (iA >= 30) {
                bVar.f138358a.m(wk2.h.PHONE_TO_DEVICE, yVar4.f132808b);
            }
            if (dVar == ok2.y.d.DEFAULT) {
                l14 = bVar.f138368k;
                j8 = bVar.f138366i;
                if (l14 != null) {
                    jLongValue = l14.longValue() + j8;
                    bVar.f138360c.a();
                    if (jLongValue > SystemClock.elapsedRealtime()) {
                        z15 = false;
                    }
                }
                if (z15) {
                    bVar.f138362e.debug("populateQueue skip download check since one occurred recently");
                    l1VarT = null;
                }
            }
            l1VarT = ge1.b.T(bVar.f138361d, null, null, new i(bVar, yVar4, null), 3);
        }
        if (c2VarT != null) {
            gVar.f138400a = bVar;
            gVar.f138401b = yVar4;
            gVar.f138402c = l1VarT;
            gVar.f138405f = 2;
            if (c2VarT.P(gVar) != aVar) {
                if (l1VarT != null) {
                    gVar.f138400a = bVar;
                    gVar.f138401b = yVar4;
                    gVar.f138402c = null;
                    gVar.f138405f = 3;
                    if (l1VarT.P(gVar) != aVar) {
                        yVar3 = yVar4;
                        bVar3 = bVar;
                        yVar4 = yVar3;
                        bVar = bVar3;
                    }
                }
            }
            return aVar;
        }
        if (l1VarT != null) {
            gVar.f138400a = bVar;
            gVar.f138401b = yVar4;
            gVar.f138402c = null;
            gVar.f138405f = 3;
            if (l1VarT.P(gVar) != aVar) {
                yVar3 = yVar4;
                bVar3 = bVar;
                yVar4 = yVar3;
                bVar = bVar3;
            }
            return aVar;
        }
        g0Var3 = yVar4.f132811e;
        if (g0Var3 == null) {
            g0Var3 = g0.UTILITY_SILENT;
        }
        if (g0Var3.a() >= 30) {
            bVar.f138358a.s(new p40.h(14), new pk2.a(bVar, g0Var3, 0));
        }
        return Unit.INSTANCE;
    }

    public final String j(List<? extends f0> list) {
        return this.f138360c.getConfiguration().f132627g.size() == list.size() ? Rule.ALL : h0.k0(list, null, null, null, new p40.h(15), 31);
    }

    public final c2 k(ok2.y yVar) {
        yVar.getClass();
        return o(new j(this, yVar, null));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
    
        if (r12 == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [pk2.b] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [pk2.b] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [pk2.b] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [pk2.b] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [pk2.b] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ArrayList arrayList, ok2.y yVar, v13.c cVar) throws Exception {
        o oVar;
        b bVar;
        ?? r14;
        ok2.y yVar2;
        ?? r15;
        ?? r16;
        lk2.x xVar;
        ok2.y yVar3;
        lk2.x xVar2;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f138454f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f138454f = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objN = oVar.f138452d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r17 = oVar.f138454f;
        try {
            try {
                if (r17 == 0) {
                    o13.r.b(objN);
                    if (!arrayList.isEmpty()) {
                        try {
                            oVar.f138449a = this;
                            oVar.f138450b = arrayList;
                            oVar.f138451c = yVar;
                            oVar.f138454f = 1;
                            objN = n(this, arrayList, null, oVar, 6);
                            if (objN != aVar) {
                                bVar = this;
                                arrayList = arrayList;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            bVar = this;
                            if (e instanceof ItemListingException) {
                            }
                            ok2.e eVar = ok2.e.f132655y;
                            String message = e.getMessage();
                            bVar.g(eVar, message != null ? message : "listFiles failed");
                            return null;
                        }
                        return aVar;
                    }
                    return null;
                }
                if (r17 == 1) {
                    yVar = oVar.f138451c;
                    arrayList = oVar.f138450b;
                    bVar = oVar.f138449a;
                    try {
                        o13.r.b(objN);
                        bVar = bVar;
                        arrayList = arrayList;
                    } catch (Exception e14) {
                        e = e14;
                        if ((e instanceof ItemListingException) || !h0.R(p13.u.m0(new GDIFileAccess.ItemListResponse.Status[]{GDIFileAccess.ItemListResponse.Status.FAIL_TOO_MANY_INCLUDE_TYPES, GDIFileAccess.ItemListResponse.Status.FAIL_INVALID_DATA_TYPE}), ((ItemListingException) e).getStatus())) {
                            ok2.e eVar2 = ok2.e.f132655y;
                            String message2 = e.getMessage();
                            bVar.g(eVar2, message2 != null ? message2 : "listFiles failed");
                            return null;
                        }
                        oVar.f138449a = bVar;
                        oVar.f138450b = arrayList;
                        oVar.f138451c = yVar;
                        oVar.f138454f = 2;
                        objN = n(bVar, arrayList, null, oVar, 4);
                        if (objN != aVar) {
                            ok2.y yVar4 = yVar;
                            r14 = arrayList;
                            yVar2 = yVar4;
                            r17 = bVar;
                            xVar2 = (lk2.x) objN;
                            if (xVar2 != null) {
                                yVar3 = yVar2;
                                r16 = r17;
                                xVar = xVar2;
                                r15 = r14;
                                oVar.f138449a = r16;
                                oVar.f138450b = null;
                                oVar.f138451c = null;
                                oVar.f138454f = 3;
                                Object objM = r16.m(r15, yVar3, xVar, oVar);
                                arrayList = r16;
                            }
                        }
                        return aVar;
                    }
                } else {
                    if (r17 == 2) {
                        yVar2 = oVar.f138451c;
                        List list = oVar.f138450b;
                        b bVar2 = oVar.f138449a;
                        o13.r.b(objN);
                        r17 = bVar2;
                        r14 = list;
                        xVar2 = (lk2.x) objN;
                        if (xVar2 != null) {
                            yVar3 = yVar2;
                            r16 = r17;
                            xVar = xVar2;
                            r15 = r14;
                            oVar.f138449a = r16;
                            oVar.f138450b = null;
                            oVar.f138451c = null;
                            oVar.f138454f = 3;
                            Object objM2 = r16.m(r15, yVar3, xVar, oVar);
                            arrayList = r16;
                        }
                        return null;
                    }
                    if (r17 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b bVar3 = oVar.f138449a;
                    o13.r.b(objN);
                    arrayList = bVar3;
                }
                arrayList.f138360c.a();
                return new Long(SystemClock.elapsedRealtime());
                lk2.x xVar3 = (lk2.x) objN;
                if (xVar3 != null) {
                    ok2.y yVar5 = yVar;
                    r15 = arrayList;
                    r16 = bVar;
                    xVar = xVar3;
                    yVar3 = yVar5;
                    oVar.f138449a = r16;
                    oVar.f138450b = null;
                    oVar.f138451c = null;
                    oVar.f138454f = 3;
                    Object objM3 = r16.m(r15, yVar3, xVar, oVar);
                    arrayList = r16;
                }
                return null;
            } catch (Exception e15) {
                ok2.e eVar3 = ok2.e.f132655y;
                String message3 = e15.getMessage();
                r17.g(eVar3, message3 != null ? message3 : "listFiles failed");
                return null;
            }
        } catch (CoreTransferException e16) {
            ok2.e failure = e16.getFailure();
            String details = e16.getDetails();
            if (details == null) {
                Throwable cause = e16.getCause();
                details = cause != null ? cause.getMessage() : null;
                if (details == null) {
                    details = e16.getFailure().toString();
                }
            }
            arrayList.g(failure, details);
            return null;
        } catch (CancellationException e17) {
            ok2.e eVar4 = ok2.e.f132655y;
            String message4 = e17.getMessage();
            if (message4 == null) {
                message4 = "doPopulateQueue cancelled";
            }
            arrayList.g(eVar4, message4);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0099 A[Catch: Exception -> 0x00f7, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f7, blocks: (B:20:0x0093, B:22:0x0099, B:34:0x00f3, B:37:0x00fa, B:39:0x0105, B:40:0x0109, B:42:0x010f, B:44:0x0133, B:45:0x013e, B:47:0x0144, B:49:0x014d, B:58:0x0171, B:52:0x0154, B:53:0x0158, B:55:0x015e, B:59:0x0175, B:60:0x0179, B:62:0x017f, B:63:0x018d, B:69:0x01c6, B:72:0x01cc, B:74:0x01d4, B:75:0x01e5, B:79:0x01f5, B:71:0x01ca, B:65:0x019b, B:67:0x01a1, B:19:0x0071), top: B:89:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d1 -> B:29:0x00d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(java.util.List r21, ok2.y r22, lk2.x r23, v13.c r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.b.m(java.util.List, ok2.y, lk2.x, v13.c):java.lang.Object");
    }

    public final synchronized c2 o(e23.l lVar) {
        c2 c2VarT;
        c2VarT = ge1.b.T(this.f138361d, null, null, new v(this, lVar, null), 3);
        this.f138364g.set(c2VarT);
        return c2VarT;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpk2/b$a;", "", "<init>", "()V", "", "MAX_CONCURRENT_DOWNLOADS", "I", "MIN_MARK_FOR_RETRY_PRIORITY", "", "FALLBACK_TIMEOUT", "J", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(zk2.d dVar, rs2.c cVar, ok2.b bVar, o53.b0 b0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 8) != 0) {
            b0Var = o53.c0.a(t13.g.a.C3052a.d(new o53.a0("AgentQueueHelper"), ge1.b.h()));
        }
        this(dVar, cVar, bVar, b0Var);
    }
}
