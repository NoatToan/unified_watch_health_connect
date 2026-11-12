package ul2;

import am.j;
import android.text.TextUtils;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.device.nfc.NfcCommandHandler;
import com.garmin.device.nfc.g;
import com.garmin.device.nfc.i;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.x0;
import vl2.e;
import vl2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lul2/a;", "Ltl2/c;", "Ltl2/e;", "transferData", "", "useExplicitLock", "Ltl2/c$c;", "transferType", "", HeaderParameterNames.AUTHENTICATION_TAG, "", "maxPackageSize", "<init>", "(Ltl2/e;ZLtl2/c$c;Ljava/lang/String;I)V", "a", "c", "b", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends tl2.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f171955p = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f171956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC3202a f171957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ConcurrentLinkedQueue<c> f171958o;

    /* JADX INFO: renamed from: ul2.a$a, reason: collision with other inner class name */
    public interface InterfaceC3202a {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lul2/a$b;", "Lul2/a$a;", "", "packageId", "", "totalBatches", "Lvl2/b;", "packageCompleteCallback", "<init>", "(Lul2/a;Ljava/lang/String;ILvl2/b;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements InterfaceC3202a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f171959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f171960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f171961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList<vl2.d> f171962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f171963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a f171964f;

        public b(a aVar, String str, int i14, vl2.b bVar) {
            str.getClass();
            bVar.getClass();
            this.f171964f = aVar;
            this.f171959a = str;
            this.f171960b = i14;
            this.f171962d = new ArrayList<>();
            this.f171963e = new Object();
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:40:0x0101  */
        /* JADX WARN: Code duplicated, block: B:6:0x001e  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void b(a aVar, byte[] bArr) {
            Throwable th3;
            Integer numValueOf;
            vl2.d dVar;
            Object obj;
            e eVar;
            short sA;
            ArrayList arrayList;
            int i14;
            String str;
            aVar.getClass();
            vl2.c cVar = vl2.c.f178714a;
            String str2 = this.f171959a;
            int size = this.f171962d.size() + 1;
            cVar.getClass();
            Logger logger = vl2.c.f178715b;
            if (bArr != null) {
                int i15 = 3;
                if (bArr.length < 3) {
                    th3 = null;
                    if (bArr != null) {
                        numValueOf = Integer.valueOf(bArr.length);
                    } else {
                        numValueOf = null;
                    }
                    logger.warn("Failed batch " + size + " response parse, status: null, total size: " + numValueOf);
                } else {
                    int i16 = 0;
                    try {
                        try {
                            eVar = e.values()[bArr[0]];
                            while (true) {
                                if (i14 < sA) {
                                    int i17 = i15 + 5;
                                    if (bArr.length < i17) {
                                        logger.error("Not enough APDU command header bytes in APDU package response payload");
                                    } else {
                                        short sA2 = f.a(bArr, i15);
                                        int iA = f.a(bArr, i15 + 2);
                                        th3 = null;
                                        int i18 = i17 + iA;
                                        if (bArr.length < i18) {
                                            logger.error("Not enough APDU command result bytes in APDU package response payload");
                                            i15 = i17;
                                            break;
                                        }
                                        try {
                                            byte[] bArr2 = new byte[iA];
                                            System.arraycopy(bArr, i17, bArr2, i16, iA);
                                            if (iA >= 2) {
                                                x0 x0Var = x0.f105818a;
                                                str = String.format("%02x%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArr2[iA - 2]), Byte.valueOf(bArr2[iA - 1])}, 2));
                                            } else {
                                                str = "";
                                            }
                                            arrayList.add(new vl2.a(sA2, bArr2, str));
                                            i14++;
                                            i15 = i18;
                                            i16 = 0;
                                        } catch (Exception e4) {
                                            e = e4;
                                        }
                                        e = e4;
                                    }
                                    logger.error("Unexpected error parsing APDU package result", (Throwable) e);
                                }
                                th3 = null;
                                break;
                            }
                        } catch (Exception e14) {
                            logger.error("Something went wrong parsing APDU package result status", (Throwable) e14);
                            eVar = e.UNKNOWN_ERROR;
                        }
                        sA = f.a(bArr, 1);
                        arrayList = new ArrayList();
                        i14 = 0;
                        if (bArr.length > i15) {
                            logger.warn("Unprocessed payload bytes remaining: offset: " + i15 + " payload: " + bArr.length);
                        }
                        logger.debug("Finished batch " + size + " response parse, status: " + eVar + ", total size: " + bArr.length);
                        dVar = new vl2.d(str2, eVar, arrayList);
                    } catch (Exception e15) {
                        e = e15;
                        th3 = null;
                    }
                }
                dVar = th3;
            } else {
                th3 = null;
                if (bArr != null) {
                    numValueOf = Integer.valueOf(bArr.length);
                } else {
                    numValueOf = null;
                }
                logger.warn("Failed batch " + size + " response parse, status: null, total size: " + numValueOf);
                dVar = th3;
            }
            Object obj2 = this.f171963e;
            a aVar2 = this.f171964f;
            synchronized (obj2) {
                if (dVar != 0) {
                    try {
                        obj = dVar.f178717b;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } else {
                    obj = th3;
                }
                if (obj != e.SUCCESS && !this.f171961c) {
                    this.f171961c = true;
                    a.j(aVar2, this.f171959a);
                }
                this.f171962d.add(dVar);
                if (this.f171962d.size() == this.f171960b) {
                    aVar2.f165290g.debug("Received final batch for " + this.f171959a + ", merging all batch results");
                    vl2.c cVar2 = vl2.c.f178714a;
                    ArrayList<vl2.d> arrayList2 = this.f171962d;
                    cVar2.getClass();
                    vl2.c.a(arrayList2);
                    throw th3;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lul2/a$c;", "", "Lcom/garmin/device/nfc/i;", "message", "Lul2/a$a;", "callback", "", "timeout", "<init>", "(Lcom/garmin/device/nfc/i;Lul2/a$a;J)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f171965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC3202a f171966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f171967c;

        public c(i iVar, InterfaceC3202a interfaceC3202a, long j8) {
            iVar.getClass();
            interfaceC3202a.getClass();
            this.f171965a = iVar;
            this.f171966b = interfaceC3202a;
            this.f171967c = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f171965a.equals(cVar.f171965a) && this.f171966b.equals(cVar.f171966b) && this.f171967c == cVar.f171967c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f171967c) + ((this.f171966b.hashCode() + (this.f171965a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("QueueItem(message=");
            sb3.append(this.f171965a);
            sb3.append(", callback=");
            sb3.append(this.f171966b);
            sb3.append(", timeout=");
            return j.i(this.f171967c, ")", sb3);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ul2/a$d", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements g.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<c> f171969b;

        public d(r0<c> r0Var) {
            this.f171969b = r0Var;
        }

        @Override // com.garmin.device.nfc.g.e
        public final void a(i iVar) {
            c(iVar);
        }

        @Override // com.garmin.device.nfc.g.f
        public final void b(int i14) {
            int i15 = a.f171955p;
            a.this.f165290g.error("No response for message " + i14);
            c(null);
        }

        public final void c(i iVar) {
            a aVar = a.this;
            synchronized (aVar.f171956m) {
                aVar.f171957n = null;
                Unit unit = Unit.INSTANCE;
            }
            c cVar = this.f171969b.f105810a;
            cVar.getClass();
            InterfaceC3202a interfaceC3202a = cVar.f171966b;
            if (interfaceC3202a instanceof ul2.b) {
                ((ul2.b) interfaceC3202a).a(a.this, iVar != null ? iVar.d() : null);
            }
            if (interfaceC3202a instanceof b) {
                ((b) interfaceC3202a).b(a.this, iVar != null ? iVar.d() : null);
            }
            a.this.m();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tl2.e eVar, boolean z14, tl2.c.EnumC3105c enumC3105c, String str, int i14) {
        super(eVar, z14, enumC3105c, str);
        eVar.getClass();
        enumC3105c.getClass();
        str.getClass();
        this.f171956m = new byte[0];
        this.f171958o = new ConcurrentLinkedQueue<>();
    }

    public static final void j(a aVar, String str) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (aVar.f171956m) {
            try {
                aVar.f165290g.debug("Cancelling any remaining batches for package ".concat(str));
                while (true) {
                    c cVarPeek = aVar.f171958o.peek();
                    if (cVarPeek != null) {
                        InterfaceC3202a interfaceC3202a = cVarPeek.f171966b;
                        b bVar = interfaceC3202a instanceof b ? (b) interfaceC3202a : null;
                        if (bVar != null) {
                            String str2 = bVar.f171959a;
                            if (TextUtils.isEmpty(str2) || !str.equals(str2)) {
                                break;
                                break;
                            } else {
                                aVar.f171958o.poll();
                                arrayList.add(bVar);
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(aVar, null);
        }
    }

    @Override // tl2.c
    public final void b() {
        InterfaceC3202a interfaceC3202a;
        super.b();
        synchronized (this.f171956m) {
            interfaceC3202a = this.f171957n;
            this.f171957n = null;
            Unit unit = Unit.INSTANCE;
        }
        if (interfaceC3202a instanceof ul2.b) {
            ((ul2.b) interfaceC3202a).a(this, null);
        }
        if (interfaceC3202a instanceof b) {
            ((b) interfaceC3202a).b(this, null);
        }
    }

    public final void k(byte[] bArr, ul2.b bVar) {
        bArr.getClass();
        l(bArr, bVar, AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    public final boolean l(byte[] bArr, ul2.b bVar, long j8) {
        bArr.getClass();
        NfcCommandHandler.b bVar2 = NfcCommandHandler.b.APDU_FROM_MOBILE;
        bVar2.getClass();
        if (this.f165293j.get() != 1) {
            return false;
        }
        a();
        this.f165290g.trace("Queue APDU command:" + bVar2.name());
        i iVar = new i(bVar2, bArr);
        synchronized (this.f171956m) {
            this.f171958o.add(new c(iVar, bVar, j8));
        }
        return m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    public final boolean m() {
        r0 r0Var = new r0();
        synchronized (this.f171956m) {
            try {
                if (this.f171957n != null) {
                    return true;
                }
                ?? Poll = this.f171958o.poll();
                r0Var.f105810a = Poll;
                c cVar = (c) Poll;
                this.f171957n = cVar != null ? cVar.f171966b : null;
                Unit unit = Unit.INSTANCE;
                if (Poll == 0) {
                    i();
                    return false;
                }
                g gVar = this.f165289f;
                i iVar = ((c) Poll).f171965a;
                d dVar = new d(r0Var);
                T t7 = r0Var.f105810a;
                t7.getClass();
                return gVar.c(iVar, dVar, ((c) t7).f171967c) != -1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
