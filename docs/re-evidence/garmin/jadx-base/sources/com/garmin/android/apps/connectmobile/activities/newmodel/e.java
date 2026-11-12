package com.garmin.android.apps.connectmobile.activities.newmodel;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/e;", "", "<init>", "()V", "a", "b", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e$a;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e$b;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/e$a;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e;", "Lps/j;", "activityImage", "<init>", "(Lps/j;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ps.j f29418a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ps.j jVar) {
            super(null);
            jVar.getClass();
            this.f29418a = jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f29418a, ((a) obj).f29418a);
        }

        public final int hashCode() {
            return this.f29418a.hashCode();
        }

        public final String toString() {
            return "ActivityImage(activityImage=" + this.f29418a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/e$b;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f29419a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(null);
            exc.getClass();
            this.f29419a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f29419a, ((b) obj).f29419a);
        }

        public final int hashCode() {
            return this.f29419a.hashCode();
        }

        public final String toString() {
            return f3.h(this.f29419a, "ActivityImageError(exception=", ")");
        }
    }

    public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private e() {
    }
}
