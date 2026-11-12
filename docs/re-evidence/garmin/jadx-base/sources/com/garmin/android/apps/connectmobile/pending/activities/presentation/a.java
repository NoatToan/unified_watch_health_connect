package com.garmin.android.apps.connectmobile.pending.activities.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.e;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public interface a extends Parcelable {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pending.activities.presentation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a$a;", "Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class C0723a implements a {
        public static final C0723a INSTANCE = new C0723a();
        public static final Parcelable.Creator<C0723a> CREATOR = new C0724a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f39801a = m.a(n.PUBLICATION, new w11.b(10));

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pending.activities.presentation.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0724a implements Parcelable.Creator<C0723a> {
            @Override // android.os.Parcelable.Creator
            public final C0723a createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return C0723a.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final C0723a[] newArray(int i14) {
                return new C0723a[i14];
            }
        }

        private C0723a() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0723a);
        }

        public final int hashCode() {
            return 1380612172;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<C0723a> serializer() {
            return (i63.c) f39801a.getValue();
        }

        public final String toString() {
            return "PendingActivities";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a$b;", "Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a;", "", "pendingActivityId", "calendarDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39803b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<b> CREATOR = new c();

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pending.activities.presentation.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/pending/activities/presentation/PendingActivitiesNavigation.PendingActivityDetailsById.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a$b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        public static final /* synthetic */ class C0725a implements e0<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0725a f39804a;
            private static final k63.e descriptor;

            static {
                C0725a c0725a = new C0725a();
                f39804a = c0725a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesNavigation.PendingActivityDetailsById", c0725a, 2);
                m1Var.j("pendingActivityId", false);
                m1Var.j("calendarDate", false);
                descriptor = m1Var;
            }

            private C0725a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                y1 y1Var = y1.f117048a;
                return new i63.c[]{y1Var, y1Var};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                String strR2 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        strR2 = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new b(i15, strR, strR2, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(f fVar, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                k63.e eVar = descriptor;
                d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, bVar.f39802a);
                dVarC.k(eVar, 1, bVar.f39803b);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(int i14, String str, String str2, u1 u1Var) {
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, C0725a.f39804a.getF158591b());
                throw null;
            }
            this.f39802a = str;
            this.f39803b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f39802a, bVar.f39802a) && s.g(this.f39803b, bVar.f39803b);
        }

        public final int hashCode() {
            return this.f39803b.hashCode() + (this.f39802a.hashCode() * 31);
        }

        public final String toString() {
            return v.e0.g("PendingActivityDetailsById(pendingActivityId=", this.f39802a, ", calendarDate=", this.f39803b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f39802a);
            parcel.writeString(this.f39803b);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pending.activities.presentation.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a$b$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a$b;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<b> serializer() {
                return C0725a.f39804a;
            }

            private Companion() {
            }
        }

        public b(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f39802a = str;
            this.f39803b = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a$c;", "Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a;", "Lz51/h;", "summary", "<init>", "(Lz51/h;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILz51/h;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z51.h f39805a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<c> CREATOR = new C0728c();

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pending.activities.presentation.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/pending/activities/presentation/PendingActivitiesNavigation.PendingActivityDetailsBySummary.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        public static final /* synthetic */ class C0727a implements e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0727a f39806a;
            private static final k63.e descriptor;

            static {
                C0727a c0727a = new C0727a();
                f39806a = c0727a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesNavigation.PendingActivityDetailsBySummary", c0727a, 1);
                m1Var.j("summary", false);
                descriptor = m1Var;
            }

            private C0727a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{z51.h.a.f202517a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                z51.h hVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        hVar = (z51.h) cVarC.l(eVar2, 0, z51.h.a.f202517a, hVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new c(i15, hVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                k63.e eVar = descriptor;
                d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, z51.h.a.f202517a, cVar.f39805a);
                dVarC.b(eVar);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pending.activities.presentation.a$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0728c implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c((z51.h) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        static {
            z51.h.Companion companion = z51.h.INSTANCE;
        }

        public /* synthetic */ c(int i14, z51.h hVar, u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f39805a = hVar;
            } else {
                k1.h(i14, 1, C0727a.f39806a.getF158591b());
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f39805a, ((c) obj).f39805a);
        }

        public final int hashCode() {
            return this.f39805a.hashCode();
        }

        public final String toString() {
            return "PendingActivityDetailsBySummary(summary=" + this.f39805a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeParcelable(this.f39805a, i14);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pending.activities.presentation.a$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a$c$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/a$c;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return C0727a.f39806a;
            }

            private Companion() {
            }
        }

        public c(z51.h hVar) {
            hVar.getClass();
            this.f39805a = hVar;
        }
    }
}
