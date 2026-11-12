package com.garmin.android.apps.connectmobile.activities.health.presentation;

import am.j;
import android.os.Parcelable;
import com.nimbusds.jose.jwk.JWKParameterNames;
import nn.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b;", "Lnn/k;", "<init>", "()V", "a", "b", "f", JWKParameterNames.RSA_EXPONENT, "c", "d", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$a;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$b;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$c;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$d;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$e;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$f;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b implements k {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$a;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b;", "", "activityId", "calendarDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29034b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f29033a = str;
            this.f29034b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f29033a, aVar.f29033a) && s.g(this.f29034b, aVar.f29034b);
        }

        public final int hashCode() {
            return this.f29034b.hashCode() + (this.f29033a.hashCode() * 31);
        }

        public final String toString() {
            return e0.g("Delete(activityId=", this.f29033a, ", calendarDate=", this.f29034b, ")");
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.health.presentation.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$b;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b;", "", "activityId", "calendarDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0446b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29036b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0446b(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f29035a = str;
            this.f29036b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0446b)) {
                return false;
            }
            C0446b c0446b = (C0446b) obj;
            return s.g(this.f29035a, c0446b.f29035a) && s.g(this.f29036b, c0446b.f29036b);
        }

        public final int hashCode() {
            return this.f29036b.hashCode() + (this.f29035a.hashCode() * 31);
        }

        public final String toString() {
            return e0.g("FetchData(activityId=", this.f29035a, ", calendarDate=", this.f29036b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$c;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b;", "Lsn/h;", "activity", "<init>", "(Lsn/h;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sn.h f29037a;

        static {
            Parcelable.Creator<sn.h> creator = sn.h.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(sn.h hVar) {
            super(null);
            hVar.getClass();
            this.f29037a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f29037a, ((c) obj).f29037a);
        }

        public final int hashCode() {
            return this.f29037a.hashCode();
        }

        public final String toString() {
            return "LoadCompleteDetails(activity=" + this.f29037a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$d;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f29038a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -474836820;
        }

        public final String toString() {
            return "LoadInitialList";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$e;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b;", "", "activityId", "calendarDate", "newName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f29041c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f29039a = str;
            this.f29040b = str2;
            this.f29041c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f29039a, eVar.f29039a) && s.g(this.f29040b, eVar.f29040b) && s.g(this.f29041c, eVar.f29041c);
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f29039a.hashCode() * 31, 31, this.f29040b);
            String str = this.f29041c;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return j.o(this.f29041c, ")", p6.b.i("UpdateName(activityId=", this.f29039a, ", calendarDate=", this.f29040b, ", newName="));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b$f;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b;", "", "activityId", "calendarDate", "newNotes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f29044c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, String str3) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f29042a = str;
            this.f29043b = str2;
            this.f29044c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return s.g(this.f29042a, fVar.f29042a) && s.g(this.f29043b, fVar.f29043b) && s.g(this.f29044c, fVar.f29044c);
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f29042a.hashCode() * 31, 31, this.f29043b);
            String str = this.f29044c;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return j.o(this.f29044c, ")", p6.b.i("UpdateNotes(activityId=", this.f29042a, ", calendarDate=", this.f29043b, ", newNotes="));
        }
    }

    public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private b() {
    }
}
