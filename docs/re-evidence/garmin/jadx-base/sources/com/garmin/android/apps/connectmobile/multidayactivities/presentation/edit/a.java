package com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit;

import com.nimbusds.jose.jwk.JWKParameterNames;
import i63.h;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "c", "f", "a", "b", "d", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$a;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$b;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$c;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$d;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$e;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$f;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$a;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class C0701a extends a {
        public static final C0701a INSTANCE = new C0701a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f39312a = m.a(n.PUBLICATION, new qy0.a(5));

        private C0701a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0701a);
        }

        public final int hashCode() {
            return 905194306;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<C0701a> serializer() {
            return (i63.c) f39312a.getValue();
        }

        public final String toString() {
            return "Activities";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$b;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class b extends a {
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f39313a = m.a(n.PUBLICATION, new qy0.a(6));

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1146033830;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<b> serializer() {
            return (i63.c) f39313a.getValue();
        }

        public final String toString() {
            return "ActivitiesFilter";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$c;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class c extends a {
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f39314a = m.a(n.PUBLICATION, new qy0.a(7));

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1346028016;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<c> serializer() {
            return (i63.c) f39314a.getValue();
        }

        public final String toString() {
            return "Course";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$d;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class d extends a {
        public static final d INSTANCE = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f39315a = m.a(n.PUBLICATION, new qy0.a(8));

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1095665115;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<d> serializer() {
            return (i63.c) f39315a.getValue();
        }

        public final String toString() {
            return "CoursesFilter";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$e;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class e extends a {
        public static final e INSTANCE = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f39316a = m.a(n.PUBLICATION, new qy0.a(9));

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1879877426;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<e> serializer() {
            return (i63.c) f39316a.getValue();
        }

        public final String toString() {
            return "Main";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a$f;", "Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class f extends a {
        public static final f INSTANCE = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f39317a = m.a(n.PUBLICATION, new qy0.a(10));

        private f() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1799715923;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<f> serializer() {
            return (i63.c) f39317a.getValue();
        }

        public final String toString() {
            return "Privacy";
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }
}
