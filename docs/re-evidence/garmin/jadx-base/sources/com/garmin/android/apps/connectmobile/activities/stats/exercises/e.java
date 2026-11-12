package com.garmin.android.apps.connectmobile.activities.stats.exercises;

import hq.r0;
import hq.t0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/e;", "", "<init>", "()V", "c", "a", "b", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/e$a;", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/e$b;", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/e$c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/e$a;", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/e;", "", "Lhq/t0;", "filteredDataList", "Lhq/r0;", "currentSelection", "", "resultCount", "<init>", "(Ljava/util/List;Lhq/r0;I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<t0> f29926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f29927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f29928c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends t0> list, r0 r0Var, int i14) {
            super(null);
            list.getClass();
            this.f29926a = list;
            this.f29927b = r0Var;
            this.f29928c = i14;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/e$b;", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/e;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29929a = new b();

        private b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/e$c;", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/e;", "", "Lhq/t0;", "originalDataList", "Lhq/r0;", "currentSelection", "<init>", "(Ljava/util/List;Lhq/r0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<t0> f29930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f29931b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends t0> list, r0 r0Var) {
            super(null);
            list.getClass();
            this.f29930a = list;
            this.f29931b = r0Var;
        }
    }

    public /* synthetic */ e(j jVar) {
        this();
    }

    private e() {
    }
}
