package al2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import ok2.g0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lal2/c;", "", "Lrs2/c;", "device", "Lok2/g0;", "transferType", "Lal2/b;", "event", "Lcom/garmin/device/filetransfer/core/util/CoreTransferException;", "details", "", "Lal2/j;", "failedFiles", "", "totalFiles", "", "isConnected", "isLegacySync", "<init>", "(Lrs2/c;Lok2/g0;Lal2/b;Lcom/garmin/device/filetransfer/core/util/CoreTransferException;Ljava/util/List;IZZ)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.c f3775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f3776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f3777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoreTransferException f3778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<j> f3779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3782h;

    public c(rs2.c cVar, g0 g0Var, b bVar, CoreTransferException coreTransferException, List list, int i14, boolean z14, boolean z15, int i15, p005kotlin.jvm.internal.j jVar) {
        this(cVar, g0Var, bVar, (i15 & 8) != 0 ? null : coreTransferException, (i15 & 16) != 0 ? j0.f134944a : list, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? true : z14, (i15 & 128) != 0 ? false : z15);
    }

    public final int a() {
        int i14 = 0;
        List<j> list = this.f3779e;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        for (j jVar : list) {
            if (jVar.a() && jVar.f3804a != null && (i14 = i14 + 1) < 0) {
                x.p();
                throw null;
            }
        }
        return i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f3775a, cVar.f3775a) && this.f3776b == cVar.f3776b && this.f3777c == cVar.f3777c && s.g(this.f3778d, cVar.f3778d) && s.g(this.f3779e, cVar.f3779e) && this.f3780f == cVar.f3780f && this.f3781g == cVar.f3781g && this.f3782h == cVar.f3782h;
    }

    public final int hashCode() {
        int iHashCode = (this.f3777c.hashCode() + ((this.f3776b.hashCode() + (this.f3775a.hashCode() * 31)) * 31)) * 31;
        CoreTransferException coreTransferException = this.f3778d;
        return Boolean.hashCode(this.f3782h) + q6.f.g(q2.d(this.f3780f, u0.b((iHashCode + (coreTransferException == null ? 0 : coreTransferException.hashCode())) * 31, 31, this.f3779e), 31), 31, this.f3781g);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        if (this.f3782h) {
            sb3.append("LegacyBatchTransfer(");
        } else {
            sb3.append("BatchTransfer(");
        }
        sb3.append(cl2.c.p(this.f3775a));
        StringBuilder sb4 = new StringBuilder(", ");
        b bVar = this.f3777c;
        sb4.append(bVar);
        sb3.append(sb4.toString());
        sb3.append(", " + this.f3776b);
        if (!this.f3781g) {
            sb3.append(", DISCONNECTED");
        }
        if (bVar.f3774a) {
            sb3.append(", total=" + this.f3780f + ", failed=" + this.f3779e.size());
        }
        CoreTransferException coreTransferException = this.f3778d;
        if (coreTransferException != null) {
            sb3.append(", " + coreTransferException);
        }
        sb3.append(")");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013BS\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lal2/c$a;", "", "Lrs2/c;", "device", "Lok2/g0;", "transferType", "Lal2/b;", "event", "Lcom/garmin/device/filetransfer/core/util/CoreTransferException;", "details", "", "Lal2/j;", "failedFiles", "", "totalFiles", "", "isConnected", "<init>", "(Lrs2/c;Lok2/g0;Lal2/b;Lcom/garmin/device/filetransfer/core/util/CoreTransferException;Ljava/util/List;IZ)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0066a f3783h = new C0066a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rs2.c f3784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g0 f3785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CoreTransferException f3786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<j> f3787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f3789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f3790g;

        public a(rs2.c cVar, g0 g0Var, b bVar, CoreTransferException coreTransferException, List list, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
            this(cVar, g0Var, (i15 & 4) != 0 ? b.SUCCESS : bVar, (i15 & 8) != 0 ? null : coreTransferException, (i15 & 16) != 0 ? j0.f134944a : list, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? true : z14);
        }

        public final void a(List list) {
            CoreTransferException coreTransferException;
            Object next;
            list.getClass();
            b bVar = b.SUCCESS;
            Iterator it = list.iterator();
            while (true) {
                coreTransferException = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                j jVar = (j) next;
                if (jVar.f3806c.getFailure().a() && jVar.f3805b) {
                    break;
                }
            }
            j jVar2 = (j) next;
            if (jVar2 != null) {
                bVar = b.INTERRUPTED;
                coreTransferException = jVar2.f3806c;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((j) obj).a()) {
                        arrayList.add(obj);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (hashSet.add(((j) obj2).f3806c.getFailure())) {
                        arrayList2.add(obj2);
                    }
                }
                j jVar3 = (j) h0.d0(h0.N0(arrayList2, new d()));
                if (jVar3 != null) {
                    bVar = b.FAILURE;
                    coreTransferException = jVar3.f3806c;
                }
            }
            this.f3790g = bVar;
            this.f3786c = coreTransferException;
            this.f3787d = list;
        }

        /* JADX INFO: renamed from: al2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lal2/c$a$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0066a {
            public /* synthetic */ C0066a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C0066a() {
            }
        }

        private a(rs2.c cVar, g0 g0Var, b bVar, CoreTransferException coreTransferException, List<j> list, int i14, boolean z14) {
            this.f3784a = cVar;
            this.f3785b = g0Var;
            this.f3786c = coreTransferException;
            this.f3787d = list;
            this.f3788e = i14;
            this.f3789f = z14;
            this.f3790g = bVar;
        }
    }

    public c(rs2.c cVar, g0 g0Var, b bVar, CoreTransferException coreTransferException, List<j> list, int i14, boolean z14, boolean z15) {
        cVar.getClass();
        g0Var.getClass();
        bVar.getClass();
        list.getClass();
        this.f3775a = cVar;
        this.f3776b = g0Var;
        this.f3777c = bVar;
        this.f3778d = coreTransferException;
        this.f3779e = list;
        this.f3780f = i14;
        this.f3781g = z14;
        this.f3782h = z15;
    }
}
