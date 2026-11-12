package u53;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.apache.commons.io.FileUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n0\t8\u0002X\u0082\u0004R\u000b\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004R\u0013\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¨\u0006\u0010"}, d2 = {"Lu53/n;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "Lh53/b;", "Lkotlinx/coroutines/internal/Core;", "_next", "_state", "array", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f168753e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168754f = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f168755g = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f168756h = new x("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f168757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f168759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f168760d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu53/n$b;", "", "", FirebaseAnalytics.Param.INDEX, "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f168761a;

        public b(int i14) {
            this.f168761a = i14;
        }
    }

    public n(int i14, boolean z14) {
        this.f168757a = i14;
        this.f168758b = z14;
        int i15 = i14 - 1;
        this.f168759c = i15;
        this.f168760d = new AtomicReferenceArray(i14);
        if (i15 > 1073741823) {
            vb.h.z("Check failed.");
            throw null;
        }
        if ((i14 & i15) == 0) {
            return;
        }
        vb.h.z("Check failed.");
        throw null;
    }

    public final int a(E e4) {
        n<E> nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f168755g;
            long j8 = atomicLongFieldUpdater.get(nVar);
            long j14 = 3458764513820540928L & j8;
            a aVar = f168753e;
            if (j14 != 0) {
                aVar.getClass();
                return (j8 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i14 = (int) (1073741823 & j8);
            int i15 = (int) ((1152921503533105152L & j8) >> 30);
            int i16 = nVar.f168759c;
            if (((i15 + 2) & i16) == (i14 & i16)) {
                return 1;
            }
            boolean z14 = nVar.f168758b;
            AtomicReferenceArray atomicReferenceArray = nVar.f168760d;
            if (z14 || atomicReferenceArray.get(i15 & i16) == null) {
                aVar.getClass();
                if (f168755g.compareAndSet(nVar, j8, ((-1152921503533105153L) & j8) | (((long) ((i15 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i15 & i16, e4);
                    n<E> nVar2 = this;
                    while ((atomicLongFieldUpdater.get(nVar2) & FileUtils.ONE_EB) != 0) {
                        n<E> nVarC = nVar2.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVarC.f168760d;
                        int i17 = nVarC.f168759c & i15;
                        Object obj = atomicReferenceArray2.get(i17);
                        if ((obj instanceof b) && ((b) obj).f168761a == i15) {
                            atomicReferenceArray2.set(i17, e4);
                        } else {
                            nVarC = null;
                        }
                        nVar2 = nVarC;
                        if (nVar2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                nVar = this;
            } else {
                int i18 = nVar.f168757a;
                if (i18 < 1024 || ((i15 - i14) & 1073741823) > (i18 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        do {
            atomicLongFieldUpdater = f168755g;
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((FileUtils.ONE_EB & j8) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, 2305843009213693952L | j8));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<E> c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        n<E> nVar;
        while (true) {
            atomicLongFieldUpdater = f168755g;
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & FileUtils.ONE_EB) != 0) {
                nVar = this;
                break;
            }
            long j14 = FileUtils.ONE_EB | j8;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j8, j14)) {
                j8 = j14;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168754f;
            n<E> nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f168757a * 2, nVar.f168758b);
            int i14 = (int) (1073741823 & j8);
            int i15 = (int) ((1152921503533105152L & j8) >> 30);
            while (true) {
                int i16 = nVar.f168759c;
                int i17 = i14 & i16;
                if (i17 == (i16 & i15)) {
                    break;
                }
                Object bVar = nVar.f168760d.get(i17);
                if (bVar == null) {
                    bVar = new b(i14);
                }
                nVar3.f168760d.set(nVar3.f168759c & i14, bVar);
                i14++;
            }
            f168753e.getClass();
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j8);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n<E> nVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f168755g;
            long j8 = atomicLongFieldUpdater.get(nVarC);
            if ((j8 & FileUtils.ONE_EB) != 0) {
                return f168756h;
            }
            int i14 = (int) (j8 & 1073741823);
            int i15 = nVarC.f168759c;
            int i16 = i14 & i15;
            if ((((int) ((1152921503533105152L & j8) >> 30)) & i15) != i16) {
                AtomicReferenceArray atomicReferenceArray = nVarC.f168760d;
                Object obj = atomicReferenceArray.get(i16);
                boolean z14 = nVarC.f168758b;
                if (obj == null) {
                    if (z14) {
                    }
                } else if (!(obj instanceof b)) {
                    f168753e.getClass();
                    long j14 = (i14 + 1) & 1073741823;
                    if (f168755g.compareAndSet(nVarC, j8, (j8 & (-1073741824)) | j14)) {
                        atomicReferenceArray.set(i16, null);
                        return obj;
                    }
                    nVarC = this;
                    if (z14) {
                        while (true) {
                            long j15 = atomicLongFieldUpdater.get(nVarC);
                            int i17 = (int) (j15 & 1073741823);
                            if ((j15 & FileUtils.ONE_EB) != 0) {
                                nVarC = nVarC.c();
                            } else {
                                n<E> nVar = nVarC;
                                if (f168755g.compareAndSet(nVar, j15, (j15 & (-1073741824)) | j14)) {
                                    nVar.f168760d.set(i17 & nVar.f168759c, null);
                                    nVarC = null;
                                } else {
                                    nVarC = nVar;
                                }
                            }
                            if (nVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006¨\u0006\u001a"}, d2 = {"Lu53/n$a;", "", "<init>", "()V", "", "INITIAL_CAPACITY", "I", "CAPACITY_BITS", "MAX_CAPACITY_MASK", "HEAD_SHIFT", "", "HEAD_MASK", "J", "TAIL_SHIFT", "TAIL_MASK", "FROZEN_SHIFT", "FROZEN_MASK", "CLOSED_SHIFT", "CLOSED_MASK", "MIN_ADD_SPIN_CAPACITY", "Lu53/x;", "REMOVE_FROZEN", "Lu53/x;", "ADD_SUCCESS", "ADD_FROZEN", "ADD_CLOSED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
