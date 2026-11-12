package com.garmin.android.apps.connectmobile.dashboard.presentation;

import i63.h;
import m63.k1;
import m63.u1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "Companion", "Dashboard", "ChooseFocus", "SelectHomeLayout", "HomeSettings", "SecondaryStats", "EditSecondaryStats", "EditInFocus", "EditEssentials", "DeviceLink", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$ChooseFocus;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$Dashboard;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$DeviceLink;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$EditEssentials;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$EditInFocus;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$EditSecondaryStats;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$HomeSettings;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$SecondaryStats;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$SelectHomeLayout;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public abstract class DashboardRoute {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f33487a = m.a(n.PUBLICATION, new r70.n(1));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$ChooseFocus;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class ChooseFocus extends DashboardRoute {
        public static final ChooseFocus INSTANCE = new ChooseFocus();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f33488b = m.a(n.PUBLICATION, new r70.n(2));

        private ChooseFocus() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChooseFocus);
        }

        public final int hashCode() {
            return -1795112726;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<ChooseFocus> serializer() {
            return (i63.c) f33488b.getValue();
        }

        public final String toString() {
            return "ChooseFocus";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$Dashboard;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class Dashboard extends DashboardRoute {
        public static final Dashboard INSTANCE = new Dashboard();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f33489b = m.a(n.PUBLICATION, new r70.n(3));

        private Dashboard() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dashboard);
        }

        public final int hashCode() {
            return 230255805;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<Dashboard> serializer() {
            return (i63.c) f33489b.getValue();
        }

        public final String toString() {
            return "Dashboard";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$EditEssentials;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class EditEssentials extends DashboardRoute {
        public static final EditEssentials INSTANCE = new EditEssentials();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f33494b = m.a(n.PUBLICATION, new r70.n(4));

        private EditEssentials() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditEssentials);
        }

        public final int hashCode() {
            return -511366138;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<EditEssentials> serializer() {
            return (i63.c) f33494b.getValue();
        }

        public final String toString() {
            return "EditEssentials";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$EditInFocus;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class EditInFocus extends DashboardRoute {
        public static final EditInFocus INSTANCE = new EditInFocus();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f33495b = m.a(n.PUBLICATION, new r70.n(5));

        private EditInFocus() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditInFocus);
        }

        public final int hashCode() {
            return -586838734;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<EditInFocus> serializer() {
            return (i63.c) f33495b.getValue();
        }

        public final String toString() {
            return "EditInFocus";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$EditSecondaryStats;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class EditSecondaryStats extends DashboardRoute {
        public static final EditSecondaryStats INSTANCE = new EditSecondaryStats();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f33496b = m.a(n.PUBLICATION, new r70.n(6));

        private EditSecondaryStats() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditSecondaryStats);
        }

        public final int hashCode() {
            return -1127552980;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<EditSecondaryStats> serializer() {
            return (i63.c) f33496b.getValue();
        }

        public final String toString() {
            return "EditSecondaryStats";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$SecondaryStats;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class SecondaryStats extends DashboardRoute {
        public static final SecondaryStats INSTANCE = new SecondaryStats();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f33499b = m.a(n.PUBLICATION, new r70.n(7));

        private SecondaryStats() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryStats);
        }

        public final int hashCode() {
            return -165831934;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<SecondaryStats> serializer() {
            return (i63.c) f33499b.getValue();
        }

        public final String toString() {
            return "SecondaryStats";
        }
    }

    public /* synthetic */ DashboardRoute(j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$DeviceLink;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "", "macAddress", "deviceName", "productNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "$serializer", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class DeviceLink extends DashboardRoute {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f33490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f33491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f33492d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceLink(int i14, String str, String str2, String str3, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, DashboardRoute$DeviceLink$$serializer.f33493a.getF116202c());
                throw null;
            }
            this.f33490b = str;
            if ((i14 & 2) == 0) {
                this.f33491c = null;
            } else {
                this.f33491c = str2;
            }
            if ((i14 & 4) == 0) {
                this.f33492d = null;
            } else {
                this.f33492d = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceLink)) {
                return false;
            }
            DeviceLink deviceLink = (DeviceLink) obj;
            return s.g(this.f33490b, deviceLink.f33490b) && s.g(this.f33491c, deviceLink.f33491c) && s.g(this.f33492d, deviceLink.f33492d);
        }

        public final int hashCode() {
            int iHashCode = this.f33490b.hashCode() * 31;
            String str = this.f33491c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f33492d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return am.j.o(this.f33492d, ")", p6.b.i("DeviceLink(macAddress=", this.f33490b, ", deviceName=", this.f33491c, ", productNumber="));
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$DeviceLink$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$DeviceLink;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<DeviceLink> serializer() {
                return DashboardRoute$DeviceLink$$serializer.f33493a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceLink(String str, String str2, String str3) {
            super(null);
            str.getClass();
            this.f33490b = str;
            this.f33491c = str2;
            this.f33492d = str3;
        }

        public /* synthetic */ DeviceLink(String str, String str2, String str3, int i14, j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$HomeSettings;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "", "setupFlow", "<init>", "(Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLm63/u1;)V", "Companion", "$serializer", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class HomeSettings extends DashboardRoute {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f33497b;

        public /* synthetic */ HomeSettings(int i14, boolean z14, u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f33497b = false;
            } else {
                this.f33497b = z14;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HomeSettings) && this.f33497b == ((HomeSettings) obj).f33497b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f33497b);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("HomeSettings(setupFlow=", ")", this.f33497b);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$HomeSettings$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$HomeSettings;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<HomeSettings> serializer() {
                return DashboardRoute$HomeSettings$$serializer.f33498a;
            }

            private Companion() {
            }
        }

        public HomeSettings() {
            this(false, 1, (j) null);
        }

        public HomeSettings(boolean z14) {
            super(null);
            this.f33497b = z14;
        }

        public /* synthetic */ HomeSettings(boolean z14, int i14, j jVar) {
            this((i14 & 1) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$SelectHomeLayout;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "", "mode", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm63/u1;)V", "Companion", "$serializer", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class SelectHomeLayout extends DashboardRoute {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f33500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SelectHomeLayout(int i14, String str, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, DashboardRoute$SelectHomeLayout$$serializer.f33501a.getF116202c());
                throw null;
            }
            this.f33500b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectHomeLayout) && s.g(this.f33500b, ((SelectHomeLayout) obj).f33500b);
        }

        public final int hashCode() {
            return this.f33500b.hashCode();
        }

        public final String toString() {
            return am.j.m("SelectHomeLayout(mode=", this.f33500b, ")");
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$SelectHomeLayout$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$SelectHomeLayout;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<SelectHomeLayout> serializer() {
                return DashboardRoute$SelectHomeLayout$$serializer.f33501a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectHomeLayout(String str) {
            super(null);
            str.getClass();
            this.f33500b = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<DashboardRoute> serializer() {
            return (i63.c) DashboardRoute.f33487a.getValue();
        }

        private Companion() {
        }
    }

    private DashboardRoute() {
    }

    public /* synthetic */ DashboardRoute(int i14, u1 u1Var) {
    }
}
