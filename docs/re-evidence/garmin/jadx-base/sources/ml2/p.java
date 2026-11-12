package ml2;

import com.google.common.primitives.UnsignedBytes;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001:\u0001\tB\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lml2/p;", "", "", "connectionId", "", "Lml2/o;", "pagesToRead", "<init>", "(Ljava/lang/String;Ljava/util/Collection;)V", "a", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f119417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<o> f119418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f119419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f119420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f119421e;

    static {
        new a(null);
    }

    public p(String str, Collection<? extends o> collection) {
        str.getClass();
        collection.getClass();
        Logger logger = LoggerFactory.getLogger(m.a("MultiLinkInfo", str, null));
        logger.getClass();
        this.f119417a = logger;
        this.f119418b = p13.h0.f1(collection);
        this.f119419c = new AtomicBoolean();
        this.f119420d = new AtomicInteger();
        this.f119421e = new n(str, null, null, null, null, null, null, 126, null);
    }

    public abstract ListenableFuture<n> a();

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    public final b0 b(byte[] bArr) {
        o fVar;
        c0 c0Var;
        bArr.getClass();
        int length = bArr.length;
        Logger logger = this.f119417a;
        Integer numValueOf = null;
        if (length < 2) {
            logger.warn("Info page data too short " + bArr.length);
            return null;
        }
        if (bArr[0] == -1) {
            return new b0.b(bArr[1]);
        }
        o.f119409b.getClass();
        if (bArr.length != 0) {
            byte b14 = bArr[0];
            if (b14 == 0) {
                fVar = o.g.f119416c;
            } else if (b14 == 1) {
                fVar = o.a.f119411c;
            } else if (b14 == 2) {
                fVar = o.d.f119413c;
            } else if (b14 == 3) {
                fVar = o.e.f119414c;
            } else if (b14 == 4) {
                fVar = o.c.f119412c;
            } else if (b14 != 5 || bArr.length < 3) {
                fVar = null;
            } else {
                fVar = new o.f(jg.b.K(1, bArr));
            }
        } else {
            fVar = null;
        }
        if (fVar == null) {
            logger.warn("Invalid multi-link info page: " + bArr);
            return null;
        }
        if (fVar instanceof o.g) {
            ArrayList arrayList = new ArrayList();
            j23.l lVarO = j23.t.o(1, bArr.length);
            lVarO.getClass();
            Iterator it = (lVarO.isEmpty() ? j0.f134944a : new p13.n(p13.s.k(lVarO.f96796a, lVarO.f96797b + 1, bArr))).iterator();
            int i14 = 0;
            while (it.hasNext()) {
                byte bByteValue = ((Number) it.next()).byteValue();
                for (int i15 = 0; i15 < 8; i15++) {
                    int i16 = 1 << i15;
                    if ((i16 & bByteValue) == i16) {
                        arrayList.add(Integer.valueOf((i14 * 8) + i15));
                    }
                }
                i14++;
            }
            this.f119421e = n.a(this.f119421e, arrayList, null, null, null, null, 30);
            return new b0.a(o.g.f119416c);
        }
        if (fVar instanceof o.a) {
            this.f119421e = n.a(this.f119421e, null, p13.s.k(1, bArr.length, bArr), null, null, null, 29);
            return new b0.a(o.a.f119411c);
        }
        if (fVar instanceof o.d) {
            int i17 = bArr[1] & UnsignedBytes.MAX_VALUE;
            this.f119421e = n.a(this.f119421e, null, null, bArr.length < 4 ? new a0(0, 0, i17) : new a0(bArr[3] & UnsignedBytes.MAX_VALUE, bArr[2] & UnsignedBytes.MAX_VALUE, i17), null, null, 27);
            return new b0.a(o.d.f119413c);
        }
        if (fVar instanceof o.e) {
            if (bArr.length < 3) {
                c0Var = null;
            } else {
                int iK = jg.b.K(1, bArr);
                c0Var = bArr.length >= 9 ? new c0(iK, Integer.valueOf(jg.b.K(3, bArr)), Long.valueOf(jg.b.L(5, bArr))) : new c0(iK, null, null);
            }
            if (c0Var != null) {
                this.f119421e = n.a(this.f119421e, null, null, null, c0Var, null, 23);
                return new b0.a(o.e.f119414c);
            }
        } else {
            if (fVar instanceof o.c) {
                this.f119421e = n.a(this.f119421e, null, null, null, null, p13.s.k(1, bArr.length, bArr), 15);
                return new b0.a(o.c.f119412c);
            }
            if (fVar instanceof o.f) {
                if (bArr.length < 4) {
                    logger.error("Service revision missing status byte");
                } else {
                    int iK2 = jg.b.K(1, bArr);
                    int i18 = bArr[3] & UnsignedBytes.MAX_VALUE;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            logger.error("Parsing service revision: Service ID (" + iK2 + ") not supported");
                        } else {
                            logger.error("Parsing service revision unknown status: " + i18);
                        }
                    } else if (bArr.length < 5) {
                        logger.error("Service revision missing revision byte");
                    } else {
                        numValueOf = Integer.valueOf(bArr[4] & UnsignedBytes.MAX_VALUE);
                    }
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    n nVar = this.f119421e;
                    int i19 = ((o.f) fVar).f119415c;
                    Map<Integer, Integer> map = nVar.f119403g;
                    LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
                    linkedHashMap.put(Integer.valueOf(i19), Integer.valueOf(iIntValue));
                    this.f119421e = new n(nVar.f119397a, nVar.f119398b, nVar.f119399c, nVar.f119400d, nVar.f119401e, nVar.f119402f, linkedHashMap);
                }
                return new b0.a(fVar);
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lml2/p$a;", "", "<init>", "()V", "", "MAX_RETRIES", "I", "", "PAGE_INVALID", "B", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
