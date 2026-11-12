package com.garmin.android.apps.connectmobile.performance;

import java.util.Set;
import org.joda.time.YearMonth;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/a$a;", "Lcom/garmin/android/apps/connectmobile/performance/a;", "", "activityId", "", "activityTypeKey", "<init>", "(JLjava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0729a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f39829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39830b;

        public C0729a(long j8, String str) {
            str.getClass();
            this.f39829a = j8;
            this.f39830b = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/a$b;", "Lcom/garmin/android/apps/connectmobile/performance/a;", "Lorg/joda/time/YearMonth;", "yearMonth", "<init>", "(Lorg/joda/time/YearMonth;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final YearMonth f39831a;

        public b(YearMonth yearMonth) {
            yearMonth.getClass();
            this.f39831a = yearMonth;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/a$c;", "Lcom/garmin/android/apps/connectmobile/performance/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f39832a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -619289216;
        }

        public final String toString() {
            return "PersonalRecord";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/a$d;", "Lcom/garmin/android/apps/connectmobile/performance/a;", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/c;", "exerciseKeyPairsInCurrentStats", "<init>", "(Ljava/util/Set;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<com.garmin.android.apps.connectmobile.performance.dto.c> f39833a;

        public d(Set<com.garmin.android.apps.connectmobile.performance.dto.c> set) {
            set.getClass();
            this.f39833a = set;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/a$e;", "Lcom/garmin/android/apps/connectmobile/performance/a;", "", "", "muscleKeysInCurrentStats", "<init>", "(Ljava/util/Set;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<String> f39834a;

        public e(Set<String> set) {
            set.getClass();
            this.f39834a = set;
        }
    }
}
