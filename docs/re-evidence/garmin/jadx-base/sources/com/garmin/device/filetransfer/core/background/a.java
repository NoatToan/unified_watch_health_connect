package com.garmin.device.filetransfer.core.background;

import am.j;
import android.content.Context;
import androidx.work.d;
import com.garmin.proto.generated.GDIFileAccess;
import ds.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import o13.m;
import o13.t;
import org.joda.time.DateTimeConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.l0;
import pk2.f0;
import ue.f;
import ue.i0;
import ue.l;
import ue.v;
import ue.x;
import ue.y;
import ue.z;
import vb.h;
import vd1.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0002\f\rB3\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/device/filetransfer/core/background/a;", "", "Lkotlin/Function0;", "", "", "neverDelayDataTypes", "silentDataTypes", "<init>", "(Le23/a;Le23/a;)V", "Lok2/v;", "helper", "(Lok2/v;)V", "a", "b", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1027a f50783c = new C1027a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f50784d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Set<String>> f50785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Set<String>> f50786b;

    static {
        Logger logger = LoggerFactory.getLogger("CFT#TransferScheduler");
        logger.getClass();
        f50784d = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(e23.a<? extends Set<String>> aVar, e23.a<? extends Set<String>> aVar2) {
        Logger logger = f50784d;
        aVar.getClass();
        aVar2.getClass();
        this.f50785a = aVar;
        this.f50786b = aVar2;
        try {
            logger.info("init(neverDelayDataTypes=" + h0.k0((Iterable) aVar.invoke(), null, null, null, null, 63) + ", silentDataTypes=" + h0.k0((Iterable) aVar2.invoke(), null, null, null, null, 63) + ")");
        } catch (Throwable th3) {
            e0.u("init(indeterminate - ", th3.getMessage(), ")", logger);
        }
    }

    public static void b(Context context, long j8, String str, vk2.a aVar, l lVar) {
        context.getClass();
        str.getClass();
        lVar.getClass();
        RetryTransferWorker.a aVar2 = RetryTransferWorker.f50780t;
        v vVar = v.CONNECTED;
        aVar2.getClass();
        vVar.getClass();
        f.a aVar3 = new f.a();
        aVar3.b(vVar);
        f fVarA = aVar3.a();
        int i14 = RetryTransferWorker.a.C1026a.f50782a[lVar.ordinal()];
        if (i14 == 1) {
            RetryTransferWorker.f50781v.warn("Using KEEP policy may delay transfers if existing worker already running");
        } else if (i14 == 2) {
            RetryTransferWorker.f50781v.warn("Using APPEND policy may delay transfers if existing worker encounters issue");
        }
        x.a aVar4 = new x.a((Class<? extends d>) RetryTransferWorker.class);
        aVar4.f170098c.f26950j = fVarA;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x.a aVarD = aVar4.e(j8, timeUnit).d(ue.a.LINEAR, j8, timeUnit);
        BackgroundTransferWorker.f50764q.getClass();
        y yVarC = com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context).c("background_retry_transfer".concat(str), lVar, aVarD.f(BackgroundTransferWorker.a.a("RetryTransferWorker", aVar, str).a()).a());
        yVarC.getClass();
        RetryTransferWorker.f50781v.info("Scheduled auto sync " + (j8 / ((long) DateTimeConstants.MILLIS_PER_MINUTE)) + " min " + ((z) yVarC).f170135c);
    }

    public final b a(long j8, List<lk2.a> list) {
        Set<String> setInvoke;
        Set<String> setInvoke2;
        b bVar;
        list.getClass();
        if (j8 <= 0) {
            b.f50787e.getClass();
            return b.f50788f;
        }
        try {
            setInvoke = this.f50785a.invoke();
        } catch (Throwable unused) {
            setInvoke = l0.f134950a;
        }
        try {
            setInvoke2 = this.f50786b.invoke();
        } catch (Throwable unused2) {
            setInvoke2 = l0.f134950a;
        }
        ArrayList<b> arrayList = new ArrayList(p13.y.r(list, 10));
        for (lk2.a aVar : list) {
            aVar.getClass();
            String str = aVar.f113153b;
            setInvoke.getClass();
            setInvoke2.getClass();
            GDIFileAccess.ItemReference.Urgency urgency = aVar.f113157f;
            GDIFileAccess.ItemReference.Urgency urgency2 = GDIFileAccess.ItemReference.Urgency.IMMEDIATE;
            if (urgency == urgency2 && !setInvoke2.contains(str)) {
                b.f50787e.getClass();
                bVar = b.f50788f;
            } else if (setInvoke.contains(str) && urgency != GDIFileAccess.ItemReference.Urgency.SLOW) {
                b.f50787e.getClass();
                bVar = b.f50788f;
            } else if (urgency == GDIFileAccess.ItemReference.Urgency.SLOW && !setInvoke.contains(str)) {
                b.f50787e.getClass();
                bVar = b.f50792j;
            } else if (!setInvoke2.contains(str) || urgency == urgency2) {
                bVar = null;
            } else {
                b.f50787e.getClass();
                bVar = b.f50792j;
            }
            arrayList.add(bVar);
        }
        if (!arrayList.isEmpty()) {
            for (b bVar2 : arrayList) {
                b.f50787e.getClass();
                b bVar3 = b.f50788f;
                if (s.g(bVar2, bVar3)) {
                    return bVar3;
                }
            }
        }
        f50783c.getClass();
        if (C1027a.a(j8)) {
            b.f50787e.getClass();
            return b.f50791i;
        }
        if (!arrayList.isEmpty()) {
            for (b bVar4 : arrayList) {
                b.f50787e.getClass();
                if (!s.g(bVar4, b.f50792j)) {
                    long offset = (((j8 + ((long) Calendar.getInstance().getTimeZone().getOffset(j8))) / ((long) 1000)) % ((long) DateTimeConstants.SECONDS_PER_DAY)) % ((long) DateTimeConstants.SECONDS_PER_HOUR);
                    b bVar5 = b.f50790h;
                    long j14 = bVar5.f50793a;
                    return (offset <= j14 || offset + j14 > 3600) ? bVar5 : b.f50789g;
                }
            }
        }
        b.f50787e.getClass();
        return b.f50792j;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/device/filetransfer/core/background/a$b;", "", "", "minSeconds", "maxSeconds", "<init>", "(JJ)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C1028a f50787e = new C1028a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f50788f = new b(0, 0, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f50789g = new b(0, 90);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f50790h = new b(60, 420);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f50791i = new b(900, 10800);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f50792j = new b(600, 3600);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f50793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f50794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f50795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t f50796d;

        public b(long j8, long j14) {
            this.f50793a = j8;
            this.f50794b = j14;
            final int i14 = 0;
            this.f50795c = m.b(new e23.a(this) { // from class: vk2.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.device.filetransfer.core.background.a.b f178652b;

                {
                    this.f178652b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    long j15;
                    switch (i14) {
                        case 0:
                            j15 = this.f178652b.f50793a;
                            break;
                        default:
                            j15 = this.f178652b.f50794b;
                            break;
                    }
                    return Long.valueOf(j15 * ((long) 1000));
                }
            });
            final int i15 = 1;
            this.f50796d = m.b(new e23.a(this) { // from class: vk2.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.device.filetransfer.core.background.a.b f178652b;

                {
                    this.f178652b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    long j15;
                    switch (i15) {
                        case 0:
                            j15 = this.f178652b.f50793a;
                            break;
                        default:
                            j15 = this.f178652b.f50794b;
                            break;
                    }
                    return Long.valueOf(j15 * ((long) 1000));
                }
            });
            if (j14 >= j8) {
                return;
            }
            h.z("maxSeconds cannot be smaller than minSeconds");
            throw null;
        }

        public final long a() {
            return ((Number) this.f50796d.getValue()).longValue();
        }

        public final long b(int i14) {
            return new h23.d(i14, i14 >> 31).f(((Number) this.f50795c.getValue()).longValue(), a());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f50793a == bVar.f50793a && this.f50794b == bVar.f50794b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f50794b) + (Long.hashCode(this.f50793a) * 31);
        }

        public final String toString() {
            return j.i(this.f50794b, ")", e0.k(this.f50793a, "Delay(minSeconds=", ", maxSeconds="));
        }

        /* JADX INFO: renamed from: com.garmin.device.filetransfer.core.background.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/device/filetransfer/core/background/a$b$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1028a {
            public /* synthetic */ C1028a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C1028a() {
            }
        }

        public /* synthetic */ b(long j8, long j14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, (i14 & 2) != 0 ? j8 : j14);
        }
    }

    /* JADX INFO: renamed from: com.garmin.device.filetransfer.core.background.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/device/filetransfer/core/background/a$a;", "", "<init>", "()V", "", "SECONDS_IN_DAY", "J", "SECONDS_IN_HOUR", "PRE_MIDNIGHT_SECONDS", "POST_MIDNIGHT_SECONDS", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1027a {
        public /* synthetic */ C1027a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static boolean a(long j8) {
            long offset = ((j8 + ((long) Calendar.getInstance().getTimeZone().getOffset(j8))) / ((long) 1000)) % ((long) DateTimeConstants.SECONDS_PER_DAY);
            return offset <= 600 || offset + 300 > 86400;
        }

        public static HashSet b(pk2.z... zVarArr) {
            HashSet hashSet = new HashSet();
            for (pk2.z zVar : zVarArr) {
                Map<String, pk2.e0> mapD = zVar.D();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, pk2.e0> entry : mapD.entrySet()) {
                    if (entry.getValue() == pk2.e0.PREFERRED) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                hashSet.addAll(arrayList);
            }
            return hashSet;
        }

        public static HashSet c(pk2.z... zVarArr) {
            HashSet hashSet = new HashSet();
            for (pk2.z zVar : zVarArr) {
                Map<String, pk2.e0> mapD = zVar.D();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, pk2.e0> entry : mapD.entrySet()) {
                    if (entry.getValue() == pk2.e0.SILENT) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                hashSet.addAll(arrayList);
            }
            for (pk2.z zVar2 : zVarArr) {
                Map<String, pk2.e0> mapD2 = zVar2.D();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, pk2.e0> entry2 : mapD2.entrySet()) {
                    if (entry2.getValue() != pk2.e0.SILENT) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                Iterator it3 = linkedHashMap2.entrySet().iterator();
                while (it3.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it3.next()).getKey());
                }
                hashSet.removeAll(h0.g1(arrayList2));
            }
            return hashSet;
        }

        private C1027a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(e23.a aVar, e23.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new c(10) : aVar, (i14 & 2) != 0 ? new c(11) : aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(final ok2.v vVar) {
        vVar.getClass();
        final int i14 = 0;
        final int i15 = 1;
        this(new e23.a() { // from class: vk2.b
            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        com.garmin.device.filetransfer.core.background.a.C1027a c1027a = com.garmin.device.filetransfer.core.background.a.f50783c;
                        f0[] f0VarArr = (f0[]) vVar.getConfiguration().f132627g.toArray(new f0[0]);
                        pk2.z[] zVarArr = (pk2.z[]) Arrays.copyOf(f0VarArr, f0VarArr.length);
                        c1027a.getClass();
                        return com.garmin.device.filetransfer.core.background.a.C1027a.b(zVarArr);
                    default:
                        com.garmin.device.filetransfer.core.background.a.C1027a c1027a2 = com.garmin.device.filetransfer.core.background.a.f50783c;
                        f0[] f0VarArr2 = (f0[]) vVar.getConfiguration().f132627g.toArray(new f0[0]);
                        pk2.z[] zVarArr2 = (pk2.z[]) Arrays.copyOf(f0VarArr2, f0VarArr2.length);
                        c1027a2.getClass();
                        return com.garmin.device.filetransfer.core.background.a.C1027a.c(zVarArr2);
                }
            }
        }, new e23.a() { // from class: vk2.b
            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        com.garmin.device.filetransfer.core.background.a.C1027a c1027a = com.garmin.device.filetransfer.core.background.a.f50783c;
                        f0[] f0VarArr = (f0[]) vVar.getConfiguration().f132627g.toArray(new f0[0]);
                        pk2.z[] zVarArr = (pk2.z[]) Arrays.copyOf(f0VarArr, f0VarArr.length);
                        c1027a.getClass();
                        return com.garmin.device.filetransfer.core.background.a.C1027a.b(zVarArr);
                    default:
                        com.garmin.device.filetransfer.core.background.a.C1027a c1027a2 = com.garmin.device.filetransfer.core.background.a.f50783c;
                        f0[] f0VarArr2 = (f0[]) vVar.getConfiguration().f132627g.toArray(new f0[0]);
                        pk2.z[] zVarArr2 = (pk2.z[]) Arrays.copyOf(f0VarArr2, f0VarArr2.length);
                        c1027a2.getClass();
                        return com.garmin.device.filetransfer.core.background.a.C1027a.c(zVarArr2);
                }
            }
        });
    }
}
