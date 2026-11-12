package io.sentry.transport;

import defpackage.c8c;
import defpackage.fvl;
import defpackage.jul;
import io.sentry.DataCategory;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.clientreport.DiscardReason;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p f21876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21877b;

    @NotNull
    public final Map<DataCategory, Date> c;

    @NotNull
    public final List<b> d;

    @Nullable
    public Timer e;

    @NotNull
    public final Object f;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            z.this.J();
        }
    }

    public interface b {
        void onRateLimitChanged(@NotNull z zVar);
    }

    public z(@NotNull p pVar, @NotNull SentryOptions sentryOptions) {
        this.c = new ConcurrentHashMap();
        this.d = new CopyOnWriteArrayList();
        this.e = null;
        this.f = new Object();
        this.f21876a = pVar;
        this.f21877b = sentryOptions;
    }

    public static void E(@NotNull c8c c8cVar, final boolean z) {
        io.sentry.util.j.o(c8cVar, io.sentry.hints.o.class, new io.sentry.util.j.a() { // from class: io.sentry.transport.x
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                ((io.sentry.hints.o) obj).c(false);
            }
        });
        io.sentry.util.j.o(c8cVar, io.sentry.hints.j.class, new io.sentry.util.j.a() { // from class: io.sentry.transport.y
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                ((io.sentry.hints.j) obj).d(z);
            }
        });
    }

    public final void J() {
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().onRateLimitChanged(this);
        }
    }

    public final long K(@Nullable String str) {
        if (str != null) {
            try {
                return (long) (Double.parseDouble(str) * 1000.0d);
            } catch (NumberFormatException unused) {
            }
        }
        return 60000L;
    }

    public void M(@NotNull b bVar) {
        this.d.remove(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c8 A[PHI: r2 r3
      0x00c8: PHI (r2v6 java.lang.String[]) = (r2v5 java.lang.String[]), (r2v5 java.lang.String[]), (r2v11 java.lang.String[]) binds: [B:11:0x002b, B:13:0x0035, B:62:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v4 int) binds: [B:11:0x002b, B:13:0x0035, B:62:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    public void N(@Nullable String str, @Nullable String str2, int i) {
        String[] strArr;
        int i2;
        String[] strArr2;
        int i3;
        if (str == null) {
            if (i == 429) {
                l(DataCategory.All, new Date(this.f21876a.a() + K(str2)));
                return;
            }
            return;
        }
        int i4 = -1;
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        int i5 = 0;
        int i6 = 0;
        while (i6 < length) {
            String[] strArrSplit2 = strArrSplit[i6].replace(" ", "").split(":", i4);
            String str3 = strArrSplit2.length > 4 ? strArrSplit2[4] : null;
            if (strArrSplit2.length > 0) {
                long jK = K(strArrSplit2[i5]);
                if (strArrSplit2.length > 1) {
                    String str4 = strArrSplit2[1];
                    Date date = new Date(this.f21876a.a() + jK);
                    if (str4 == null || str4.isEmpty()) {
                        strArr = strArrSplit;
                        i2 = i4;
                        l(DataCategory.All, date);
                    } else {
                        String[] strArrSplit3 = str4.split(";", i4);
                        int length2 = strArrSplit3.length;
                        int i7 = i5;
                        while (i7 < length2) {
                            String str5 = strArrSplit3[i7];
                            DataCategory dataCategoryValueOf = DataCategory.Unknown;
                            try {
                                String strB = io.sentry.util.u.b(str5);
                                if (strB != null) {
                                    dataCategoryValueOf = DataCategory.valueOf(strB);
                                    strArr2 = strArrSplit;
                                } else {
                                    strArr2 = strArrSplit;
                                    try {
                                        this.f21877b.getLogger().c(SentryLevel.ERROR, "Couldn't capitalize: %s", str5);
                                    } catch (IllegalArgumentException e) {
                                        e = e;
                                        this.f21877b.getLogger().b(SentryLevel.INFO, e, "Unknown category: %s", str5);
                                    }
                                }
                            } catch (IllegalArgumentException e2) {
                                e = e2;
                                strArr2 = strArrSplit;
                            }
                            if (DataCategory.Unknown.equals(dataCategoryValueOf)) {
                                i3 = -1;
                            } else {
                                if (!DataCategory.MetricBucket.equals(dataCategoryValueOf) || str3 == null || str3.equals("")) {
                                    i3 = -1;
                                } else {
                                    i3 = -1;
                                    String[] strArrSplit4 = str3.split(";", -1);
                                    if (strArrSplit4.length <= 0 || io.sentry.util.b.a(strArrSplit4, "custom")) {
                                    }
                                }
                                l(dataCategoryValueOf, date);
                            }
                            i7++;
                            i4 = i3;
                            strArrSplit = strArr2;
                        }
                        strArr = strArrSplit;
                        i2 = i4;
                    }
                } else {
                    strArr = strArrSplit;
                    i2 = i4;
                }
            } else {
                strArr = strArrSplit;
                i2 = i4;
            }
            i6++;
            i4 = i2;
            i5 = 0;
            strArrSplit = strArr;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f) {
            try {
                Timer timer = this.e;
                if (timer != null) {
                    timer.cancel();
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.clear();
    }

    public void d(@NotNull b bVar) {
        this.d.add(bVar);
    }

    public final void l(@NotNull DataCategory dataCategory, @NotNull Date date) {
        Date date2 = this.c.get(dataCategory);
        if (date2 == null || date.after(date2)) {
            this.c.put(dataCategory, date);
            J();
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new Timer(true);
                    }
                    this.e.schedule(new a(), date);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Nullable
    public jul m(@NotNull jul julVar, @NotNull c8c c8cVar) {
        ArrayList arrayList = null;
        for (fvl fvlVar : julVar.c()) {
            if (s(fvlVar.F().b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fvlVar);
                this.f21877b.getClientReportRecorder().e(DiscardReason.RATELIMIT_BACKOFF, fvlVar);
            }
        }
        if (arrayList == null) {
            return julVar;
        }
        this.f21877b.getLogger().c(SentryLevel.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (fvl fvlVar2 : julVar.c()) {
            if (!arrayList.contains(fvlVar2)) {
                arrayList2.add(fvlVar2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new jul(julVar.b(), arrayList2);
        }
        this.f21877b.getLogger().c(SentryLevel.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
        E(c8cVar, false);
        return null;
    }

    @NotNull
    public final DataCategory n(@NotNull String str) {
        str.hashCode();
        switch (str) {
            case "attachment":
                return DataCategory.Attachment;
            case "replay_video":
                return DataCategory.Replay;
            case "statsd":
                return DataCategory.MetricBucket;
            case "profile":
                return DataCategory.Profile;
            case "event":
                return DataCategory.Error;
            case "check_in":
                return DataCategory.Monitor;
            case "session":
                return DataCategory.Session;
            case "transaction":
                return DataCategory.Transaction;
            default:
                return DataCategory.Unknown;
        }
    }

    public boolean o(@NotNull DataCategory dataCategory) {
        Date date;
        Date date2 = new Date(this.f21876a.a());
        Date date3 = this.c.get(DataCategory.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (DataCategory.Unknown.equals(dataCategory) || (date = this.c.get(dataCategory)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean p() {
        Date date = new Date(this.f21876a.a());
        Iterator<DataCategory> it = this.c.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = this.c.get(it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean s(@NotNull String str) {
        return o(n(str));
    }

    public z(@NotNull SentryOptions sentryOptions) {
        this(n.b(), sentryOptions);
    }
}
