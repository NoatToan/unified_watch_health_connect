package jq1;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\n\u000bB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Ljq1/h;", "", "Ljq1/h$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "prStartTimeGmt", "", "value", "<init>", "(Ljq1/h$b;JD)V", "b", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f100013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f100014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f100015c;

    static {
        new a(null);
    }

    public h(b bVar, long j8, double d14) {
        this.f100013a = bVar;
        this.f100014b = j8;
        this.f100015c = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f100013a, hVar.f100013a) && this.f100014b == hVar.f100014b && Double.compare(this.f100015c, hVar.f100015c) == 0;
    }

    public final int hashCode() {
        b bVar = this.f100013a;
        return Double.hashCode(this.f100015c) + q6.f.e((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f100014b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StepsPersonalRecord(type=");
        sb3.append(this.f100013a);
        sb3.append(", prStartTimeGmt=");
        sb3.append(this.f100014b);
        return am.j.r(sb3, ", value=", this.f100015c, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljq1/h$a;", "", "<init>", "()V", "", "STEPS_CURRENT_STREAK_ID", "J", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ljq1/h$b;", "", "<init>", "()V", "b", "a", "Ljq1/h$b$a;", "Ljq1/h$b$b;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljq1/h$b$a;", "Ljq1/h$b;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f100016a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: jq1.h$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljq1/h$b$b;", "Ljq1/h$b;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1927b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1927b f100017a = new C1927b();

            private C1927b() {
                super(null);
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
