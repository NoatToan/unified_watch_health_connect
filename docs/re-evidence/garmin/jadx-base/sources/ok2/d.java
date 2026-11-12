package ok2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017Bk\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lok2/d;", "", "", "Lpk2/f0;", "uploadDestinations", "Lpk2/c0;", "downloadSources", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function0;", "", "isAppVisible", "Lok2/d$d;", "customFailureConfig", "Lok2/d$c;", "batchConfig", "Lkotlin/Function1;", "Lwk2/f;", "enableCompression", "<init>", "(Ljava/util/List;Ljava/util/List;Landroid/content/Context;Le23/a;Lok2/d$d;Lok2/d$c;Le23/l;)V", "b", "d", "c", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f132618i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<Set<g0>> f132619j = p13.x.k(p13.u.m0(new g0[]{g0.USER_INITIATED_HIGHEST, g0.USER_INITIATED_PREFERRED, g0.IMMEDIATE_MESSAGE}), p13.u.m0(new g0[]{g0.USER_INITIATED_GENERAL, g0.AUTOMATIC_PREFERRED, g0.AUTOMATIC_STANDARD}), p13.u.m0(new g0[]{g0.AUTOMATIC_ALLOWED, g0.UTILITY_SILENT}));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f132620k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<pk2.c0> f132621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f132622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Boolean> f132623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2519d f132624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f132625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<? super wk2.f, Boolean> f132626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<pk2.f0> f132627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y.d f132628h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ok2/d$a", "Lok2/d$d;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements InterfaceC2519d {
        @Override // ok2.d.InterfaceC2519d
        public final com.garmin.device.filetransfer.core.background.a c() {
            return new com.garmin.device.filetransfer.core.background.a(a0.f132585h.a());
        }

        @Override // ok2.d.InterfaceC2519d
        public final void e() {
        }

        @Override // ok2.d.InterfaceC2519d
        public final void f() {
        }

        @Override // ok2.d.InterfaceC2519d
        public final void h(rs2.c cVar, wk2.f fVar) {
            fVar.getClass();
        }

        @Override // ok2.d.InterfaceC2519d
        public final void i() {
        }
    }

    /* JADX INFO: renamed from: ok2.d$d, reason: collision with other inner class name */
    public interface InterfaceC2519d {
        com.garmin.device.filetransfer.core.background.a c();

        void e();

        void f();

        void h(rs2.c cVar, wk2.f fVar);

        void i();
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00df A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:47:0x00d3, B:49:0x00df, B:51:0x00e3, B:53:0x00e7, B:55:0x00ee, B:57:0x00f2, B:59:0x00f7), top: B:115:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:47:0x00d3, B:49:0x00df, B:51:0x00e3, B:53:0x00e7, B:55:0x00ee, B:57:0x00f2, B:59:0x00f7), top: B:115:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:47:0x00d3, B:49:0x00df, B:51:0x00e3, B:53:0x00e7, B:55:0x00ee, B:57:0x00f2, B:59:0x00f7), top: B:115:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x0100  */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends pk2.f0> list, List<? extends pk2.c0> list2, Context context, e23.a<Boolean> aVar, InterfaceC2519d interfaceC2519d, c cVar, e23.l<? super wk2.f, Boolean> lVar) {
        ArrayList arrayList;
        sk2.c cVar2;
        Object objNewInstance;
        sk2.b bVar;
        sk2.b gVar;
        sk2.a aVar2;
        int i14;
        list.getClass();
        list2.getClass();
        aVar.getClass();
        cVar.getClass();
        lVar.getClass();
        this.f132621a = list2;
        this.f132622b = context;
        this.f132623c = aVar;
        this.f132624d = interfaceC2519d;
        this.f132625e = cVar;
        this.f132626f = lVar;
        if (list.isEmpty() && list2.isEmpty()) {
            vb.h.s("Must supply at least one upload or download agent");
            throw null;
        }
        int size = list.size();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((pk2.f0) obj).getF159941g())) {
                arrayList2.add(obj);
            }
        }
        if (size != arrayList2.size()) {
            vb.h.s("Upload agents must supply distinct filterOptions");
            throw null;
        }
        boolean z14 = false;
        if (list.isEmpty()) {
            arrayList = new ArrayList(list);
            try {
                Object objNewInstance2 = Class.forName("com.garmin.pairing.setup.database.delegate.SetupCachedDeviceXml").newInstance();
                objNewInstance2.getClass();
                cVar2 = new sk2.c((sk2.b) objNewInstance2);
            } catch (Throwable unused) {
                cVar2 = null;
            }
            if (cVar2 == null) {
                try {
                    Logger logger = lm2.a.f113609b;
                    objNewInstance = lm2.a.class.newInstance();
                    if (objNewInstance instanceof sk2.b) {
                        bVar = (sk2.b) objNewInstance;
                    } else {
                        bVar = null;
                    }
                    if (bVar == null) {
                        gVar = new sk2.g();
                    } else {
                        gVar = bVar;
                    }
                    if (bVar instanceof sk2.a) {
                        aVar2 = (sk2.a) bVar;
                    } else {
                        aVar2 = null;
                    }
                    cVar2 = new sk2.c(gVar, null, aVar2, 2, null);
                } catch (Throwable unused2) {
                }
            }
            arrayList.add(cVar2 == null ? new sk2.c() : cVar2);
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList = new ArrayList(list);
                    Object objNewInstance3 = Class.forName("com.garmin.pairing.setup.database.delegate.SetupCachedDeviceXml").newInstance();
                    objNewInstance3.getClass();
                    cVar2 = new sk2.c((sk2.b) objNewInstance3);
                    if (cVar2 == null) {
                        Logger logger2 = lm2.a.f113609b;
                        objNewInstance = lm2.a.class.newInstance();
                        if (objNewInstance instanceof sk2.b) {
                            bVar = (sk2.b) objNewInstance;
                        } else {
                            bVar = null;
                        }
                        if (bVar == null) {
                            gVar = new sk2.g();
                        } else {
                            gVar = bVar;
                        }
                        if (bVar instanceof sk2.a) {
                            aVar2 = (sk2.a) bVar;
                        } else {
                            aVar2 = null;
                        }
                        cVar2 = new sk2.c(gVar, null, aVar2, 2, null);
                    }
                    arrayList.add(cVar2 == null ? new sk2.c() : cVar2);
                } else if (((pk2.f0) it.next()) instanceof sk2.c) {
                    if (list.isEmpty()) {
                        i14 = 0;
                    } else {
                        Iterator<T> it3 = list.iterator();
                        i14 = 0;
                        while (it3.hasNext()) {
                            if ((((pk2.f0) it3.next()) instanceof sk2.c) && (i14 = i14 + 1) < 0) {
                                p13.x.p();
                                throw null;
                            }
                        }
                    }
                    if (i14 > 1) {
                        vb.h.s("Cannot define multiple DeviceXmlReadAgents");
                        throw null;
                    }
                    arrayList = new ArrayList(list);
                }
            }
        }
        List<pk2.c0> list3 = this.f132621a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list3) {
            if (obj2 instanceof mk2.e) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.size() > 1) {
            vb.h.s("Duplicate AdHocTransferAgents in downloadSources");
            throw null;
        }
        if (arrayList3.size() == 1) {
            Object objD0 = p13.h0.d0(arrayList3);
            qk2.a aVar3 = objD0 instanceof qk2.a ? (qk2.a) objD0 : null;
            if (aVar3 == null) {
                vb.h.s("Non-file-transfer-core implementation of AdHocTransferServiceFactory not supported");
                throw null;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof mk2.e) {
                    arrayList4.add(obj3);
                }
            }
            if (arrayList4.isEmpty()) {
                arrayList.add(aVar3);
            } else {
                if (!arrayList4.isEmpty()) {
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        if (!p005kotlin.jvm.internal.s.g((mk2.e) it4.next(), aVar3)) {
                            z14 = true;
                            break;
                        }
                    }
                }
                if (z14) {
                    vb.h.s("Unexpected duplicate AdHocTransferAgent in uploadDestinations");
                    throw null;
                }
            }
        }
        this.f132627g = Collections.unmodifiableList(arrayList);
        InterfaceC2519d interfaceC2519d2 = this.f132624d;
        if (interfaceC2519d2 != null) {
            interfaceC2519d2.i();
        }
        this.f132628h = y.d.DEFAULT;
    }

    public static void m(al2.c.a aVar) {
        List<al2.j> list = aVar.f3787d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            al2.j jVar = (al2.j) obj;
            al2.c.a.C0066a c0066a = al2.c.a.f3783h;
            jVar.getClass();
            CoreTransferException coreTransferException = jVar.f3806c;
            if (jVar.a() || coreTransferException.getFailure() == e.B || coreTransferException.getFailure().a()) {
                arrayList.add(obj);
            }
        }
        aVar.a(arrayList);
    }

    public final mk2.e j() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f132621a) {
            if (obj instanceof mk2.e) {
                arrayList.add(obj);
            }
        }
        mk2.e eVar = (mk2.e) p13.h0.d0(arrayList);
        if (eVar != null) {
            return eVar;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : this.f132627g) {
            if (obj2 instanceof mk2.e) {
                arrayList2.add(obj2);
            }
        }
        return (mk2.e) p13.h0.d0(arrayList2);
    }

    public final List k(wk2.h hVar) {
        hVar.getClass();
        return hVar == wk2.h.PHONE_TO_DEVICE ? this.f132621a : this.f132627g;
    }

    public final Set l(rs2.c cVar, wk2.f fVar) {
        fVar.getClass();
        cVar.getClass();
        List listK = k(fVar.f185844c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (cl2.c.l((pk2.z) obj, cVar, fVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p13.d0.v(arrayList2, ((pk2.z) it.next()).t(cVar, fVar));
        }
        return p13.h0.g1(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC2519d n() {
        InterfaceC2519d interfaceC2519d = this.f132624d;
        if (interfaceC2519d != null) {
            return interfaceC2519d;
        }
        InterfaceC2519d interfaceC2519d2 = this instanceof InterfaceC2519d ? (InterfaceC2519d) this : null;
        return interfaceC2519d2 == null ? f132620k : interfaceC2519d2;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public y.d getF132628h() {
        return this.f132628h;
    }

    public final boolean p() {
        try {
            return this.f132623c.invoke().booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lok2/d$b;", "", "<init>", "()V", "", "FAILURE_RETRY_DELAY_MILLIS", "J", "", "MAX_FAILED_ATTEMPTS", "I", "DEVICE_LIST_FILES_MIN_INTERVAL", "DOWNLOAD_LIST_FILES_MIN_INTERVAL", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lok2/d$c;", "", "", "", "Lok2/g0;", "transferTypeGroups", "<init>", "(Ljava/util/Collection;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Collection<Set<g0>> f132629a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(Integer.valueOf(((g0) t7).a()), Integer.valueOf(((g0) t14).a()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                T next;
                Iterator<T> it = ((Set) t14).iterator();
                Object next2 = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iA = ((g0) next).a();
                        do {
                            T next3 = it.next();
                            int iA2 = ((g0) next3).a();
                            if (iA > iA2) {
                                next = next3;
                                iA = iA2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = (T) null;
                }
                g0 g0Var = next;
                Iterator<T> it3 = ((Set) t7).iterator();
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        int iA3 = ((g0) next2).a();
                        do {
                            Object next4 = it3.next();
                            int iA4 = ((g0) next4).a();
                            if (iA3 > iA4) {
                                next2 = next4;
                                iA3 = iA4;
                            }
                        } while (it3.hasNext());
                    }
                }
                return r13.a.b(g0Var, (g0) next2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Collection<? extends Set<? extends g0>> collection) {
            collection.getClass();
            if (collection.isEmpty()) {
                this.f132629a = collection;
                return;
            }
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            Iterator it = p13.h0.N0(collection, new b()).iterator();
            int i14 = 0;
            while (it.hasNext()) {
                List listN0 = p13.h0.N0((Set) it.next(), new a());
                if (listN0 == null || !listN0.isEmpty()) {
                    Iterator it3 = listN0.iterator();
                    while (it3.hasNext()) {
                        if (((g0) it3.next()).a() <= i14) {
                            vb.h.s("TransferTypes in aggregation groups must not overlap priorities. ".concat(p13.h0.k0(listN0, null, null, null, null, 63)));
                            throw null;
                        }
                    }
                }
                int iA = ((g0) p13.h0.b0(listN0)).a();
                int iA2 = ((g0) p13.h0.m0(listN0)).a();
                g0[] g0VarArrValues = g0.values();
                ArrayList arrayList2 = new ArrayList();
                for (g0 g0Var : g0VarArrValues) {
                    int iA3 = g0Var.a();
                    if (iA <= iA3 && iA3 <= iA2) {
                        arrayList2.add(g0Var);
                    }
                }
                HashSet hashSetZ0 = p13.h0.Z0(arrayList2);
                if (!hashSetZ0.isEmpty()) {
                    Iterator it4 = hashSetZ0.iterator();
                    while (it4.hasNext()) {
                        if (hashSet.contains((g0) it4.next())) {
                            vb.h.s("One TransferType cannot be in multiple aggregation groups. ".concat(p13.h0.k0(listN0, null, null, null, null, 63)));
                            throw null;
                        }
                    }
                }
                hashSet.addAll(hashSetZ0);
                arrayList.add(hashSetZ0);
                i14 = iA2;
            }
            this.f132629a = arrayList;
        }

        public c() {
            this(null, 1, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Collection collection, int i14, p005kotlin.jvm.internal.j jVar) {
            if ((i14 & 1) != 0) {
                d.f132618i.getClass();
                collection = d.f132619j;
            }
            this(collection);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(List<? extends pk2.f0> list, List<? extends pk2.c0> list2, Context context, e23.a<Boolean> aVar) {
        this(list, list2, context, aVar, null, null, null, 112, null);
        list.getClass();
        list2.getClass();
        aVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(List<? extends pk2.f0> list, List<? extends pk2.c0> list2, Context context, e23.a<Boolean> aVar, InterfaceC2519d interfaceC2519d) {
        this(list, list2, context, aVar, interfaceC2519d, null, null, 96, null);
        list.getClass();
        list2.getClass();
        aVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(List<? extends pk2.f0> list, List<? extends pk2.c0> list2, Context context, e23.a<Boolean> aVar, InterfaceC2519d interfaceC2519d, c cVar) {
        this(list, list2, context, aVar, interfaceC2519d, cVar, null, 64, null);
        list.getClass();
        list2.getClass();
        aVar.getClass();
        cVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(List<? extends pk2.f0> list, List<? extends pk2.c0> list2, Context context) {
        this(list, list2, context, null, null, null, null, 120, null);
        list.getClass();
        list2.getClass();
    }

    public /* synthetic */ d(List list, List list2, Context context, e23.a aVar, InterfaceC2519d interfaceC2519d, c cVar, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, list2, context, (i14 & 8) != 0 ? new oe0.e(5) : aVar, (i14 & 16) != 0 ? null : interfaceC2519d, (i14 & 32) != 0 ? new c(null, 1, null) : cVar, (i14 & 64) != 0 ? new oe2.g(7) : lVar);
    }
}
