package com.garmin.android.library.livetrack;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import wd2.d2;
import wd2.f2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/library/livetrack/d;", "", "", "deviceUnitId", "<init>", "(J)V", "c", "b", "a", "Lcom/garmin/android/library/livetrack/d$a;", "Lcom/garmin/android/library/livetrack/d$b;", "Lcom/garmin/android/library/livetrack/d$c;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50196a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/library/livetrack/d$a;", "Lcom/garmin/android/library/livetrack/d;", "", "deviceUnitId", "Lcom/garmin/android/library/livetrack/c;", "errorType", "<init>", "(JLcom/garmin/android/library/livetrack/c;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.library.livetrack.c f50197b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, com.garmin.android.library.livetrack.c cVar) {
            super(j8, null);
            cVar.getClass();
            this.f50197b = cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/livetrack/d$b;", "Lcom/garmin/android/library/livetrack/d;", "", "deviceUnitId", "<init>", "(J)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends d {
        public b(long j8) {
            super(j8, null);
        }
    }

    private d(long j8) {
        this.f50196a = j8;
    }

    public /* synthetic */ d(long j8, p005kotlin.jvm.internal.j jVar) {
        this(j8);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/library/livetrack/d$c;", "Lcom/garmin/android/library/livetrack/d;", "", "deviceUnitId", "", "Lwd2/f2;", "", "Lwd2/d2;", "sharingErrors", "<init>", "(JLjava/util/Map;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends d {
        public /* synthetic */ c(long j8, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, (i14 & 2) != 0 ? null : map);
        }

        public c(long j8, Map<f2, ? extends List<d2>> map) {
            super(j8, null);
        }
    }
}
