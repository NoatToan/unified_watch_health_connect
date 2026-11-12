package ry0;

import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lry0/m$a;", "Lry0/m;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f155176a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g2 f155177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c22.i f155178c;

        static {
            x0.f23314a.getClass();
            f155177b = g2.b(x0.H9);
            f155178c = c22.i.b(R.string.lbl_active);
        }

        private a() {
        }

        @Override // ry0.m
        public final g2 a() {
            return f155177b;
        }

        @Override // ry0.m
        public final c22.i b() {
            return f155178c;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 222798263;
        }

        public final String toString() {
            return "Active";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lry0/m$b;", "Lry0/m;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f155179a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g2 f155180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c22.i f155181c;

        static {
            x0.f23314a.getClass();
            f155180b = g2.b(x0.W9);
            f155181c = c22.i.b(R.string.lbl_empty_string);
        }

        private b() {
        }

        @Override // ry0.m
        public final g2 a() {
            return f155180b;
        }

        @Override // ry0.m
        public final c22.i b() {
            return f155181c;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 51251706;
        }

        public final String toString() {
            return "Completed";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lry0/m$c;", "Lry0/m;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f155182a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g2 f155183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c22.i f155184c;

        static {
            x0.f23314a.getClass();
            f155183b = g2.b(x0.f23493kb);
            f155184c = c22.i.b(R.string.lbl_upcoming);
        }

        private c() {
        }

        @Override // ry0.m
        public final g2 a() {
            return f155183b;
        }

        @Override // ry0.m
        public final c22.i b() {
            return f155184c;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1971534963;
        }

        public final String toString() {
            return "Upcoming";
        }
    }

    g2 a();

    c22.i b();
}
