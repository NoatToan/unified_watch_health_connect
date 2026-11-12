package com.garmin.subscriptions.retrofit;

import ca0.d4;
import java.util.TreeSet;
import o13.m;
import o13.r;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/subscriptions/retrofit/e;", "", "<init>", "()V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f52692b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TreeSet<Integer> f52694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f52695e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f52691a = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z53.b f52693c = z53.c.a();

    static {
        TreeSet<Integer> treeSet = new TreeSet<>();
        u.c0(new Integer[]{1, 30, 60, 300, 600}, treeSet);
        f52694d = treeSet;
        f52695e = m.b(new d4(29));
    }

    private e() {
    }

    public static int c(Integer num) {
        TreeSet<Integer> treeSet = f52694d;
        if (num == null) {
            Integer numFirst = treeSet.first();
            numFirst.getClass();
            return numFirst.intValue();
        }
        Integer numHigher = treeSet.higher(num);
        if (numHigher != null) {
            return numHigher.intValue();
        }
        Integer numLast = treeSet.last();
        numLast.getClass();
        return numLast.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        b bVar;
        z53.b bVar2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f52680d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f52680d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f52678b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f52680d;
        if (i15 == 0) {
            r.b(obj);
            z53.b bVar3 = f52693c;
            bVar.f52677a = bVar3;
            bVar.f52680d = 1;
            if (bVar3.c(bVar) == aVar) {
                return aVar;
            }
            bVar2 = bVar3;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar2 = bVar.f52677a;
            r.b(obj);
        }
        try {
            f52692b = null;
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar2.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(int i14, Integer num, v13.c cVar) {
        c cVar2;
        Integer num2;
        z53.b bVar;
        int i15;
        int iC;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i16 = cVar2.f52686f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar2.f52686f = i16 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f52684d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = cVar2.f52686f;
        if (i17 == 0) {
            r.b(obj);
            num2 = num;
            cVar2.f52682b = num2;
            bVar = f52693c;
            cVar2.f52683c = bVar;
            cVar2.f52681a = i14;
            cVar2.f52686f = 1;
            if (bVar.c(cVar2) == aVar) {
                return aVar;
            }
            i15 = i14;
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i18 = cVar2.f52681a;
            bVar = cVar2.f52683c;
            Integer num3 = cVar2.f52682b;
            r.b(obj);
            num2 = num3;
            i15 = i18;
        }
        try {
            a aVar2 = f52692b;
            e eVar = f52691a;
            if (aVar2 == null) {
                if (num2 != null) {
                    iC = num2.intValue();
                } else {
                    eVar.getClass();
                    iC = c(null);
                }
            } else if (num2 != null) {
                iC = num2.intValue();
            } else {
                Integer num4 = new Integer(aVar2.f52674c);
                eVar.getClass();
                iC = c(num4);
            }
            int i19 = iC;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e53.c.a aVar3 = e53.c.f63094b;
            a aVar4 = new a(i15, jCurrentTimeMillis, i19, e53.c.e(e53.e.e(i19, e53.f.SECONDS)) + jCurrentTimeMillis);
            eVar.getClass();
            Object value = f52695e.getValue();
            value.getClass();
            ((Logger) value).warn("rate limit in effect due to " + aVar4.f52672a + " -> retryAfterSeconds[" + aVar4.f52674c + "]");
            f52692b = aVar4;
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(v13.c cVar) {
        d dVar;
        z53.b bVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f52690d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f52690d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f52688b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f52690d;
        if (i15 == 0) {
            r.b(obj);
            z53.b bVar2 = f52693c;
            dVar.f52687a = bVar2;
            dVar.f52690d = 1;
            if (bVar2.c(dVar) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = dVar.f52687a;
            r.b(obj);
        }
        try {
            a aVar2 = f52692b;
            if (aVar2 == null) {
                aVar2 = null;
            } else if (System.currentTimeMillis() > aVar2.f52675d) {
                f52691a.getClass();
                Object value = f52695e.getValue();
                value.getClass();
                ((Logger) value).debug("isEnabled: no, " + aVar2.f52674c + " seconds has passed");
                aVar2 = null;
            }
            return aVar2;
        } finally {
            bVar.e(null);
        }
    }
}
