package com.garmin.android.apps.connectmobile.dashboard.presentation;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q92.v;
import s92.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c;", "", "<init>", "()V", "b", "a", "c", "d", JWKParameterNames.RSA_EXPONENT, "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c$a;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c$b;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c$c;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c$d;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c$e;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c$a;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c;", "Lq92/v;", "consentStatus", "Ls92/g;", "consentText", "<init>", "(Lq92/v;Ls92/g;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f33536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f33537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, g gVar) {
            super(null);
            vVar.getClass();
            gVar.getClass();
            this.f33536a = vVar;
            this.f33537b = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f33536a, aVar.f33536a) && s.g(this.f33537b, aVar.f33537b);
        }

        public final int hashCode() {
            return this.f33537b.hashCode() + (this.f33536a.hashCode() * 31);
        }

        public final String toString() {
            return "ConsentScreen(consentStatus=" + this.f33536a + ", consentText=" + this.f33537b + ")";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.dashboard.presentation.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c$c;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c;", "", "deviceUnitId", "Lcom/garmin/android/apps/connectmobile/devices/a;", "deviceSettingsType", "<init>", "(Ljava/lang/Long;Lcom/garmin/android/apps/connectmobile/devices/a;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0549c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f33540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.devices.a f33541b;

        public C0549c(Long l14, com.garmin.android.apps.connectmobile.devices.a aVar) {
            super(null);
            this.f33540a = l14;
            this.f33541b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0549c)) {
                return false;
            }
            C0549c c0549c = (C0549c) obj;
            return s.g(this.f33540a, c0549c.f33540a) && this.f33541b == c0549c.f33541b;
        }

        public final int hashCode() {
            Long l14 = this.f33540a;
            int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
            com.garmin.android.apps.connectmobile.devices.a aVar = this.f33541b;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "DeviceScreen(deviceUnitId=" + this.f33540a + ", deviceSettingsType=" + this.f33541b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c$d;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c;", "<init>", "()V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f33542a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1620213357;
        }

        public final String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c$e;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c;", "<init>", "()V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f33543a = new e();

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -232454047;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ c(j jVar) {
        this();
    }

    private c() {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c$b;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c;", "", "Lr70/s;", "dashboardWidgets", "", "setupComplete", "<init>", "(Ljava/util/List;Z)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<r70.s> f33538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f33539b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends r70.s> list, boolean z14) {
            super(null);
            list.getClass();
            this.f33538a = list;
            this.f33539b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f33538a, bVar.f33538a) && this.f33539b == bVar.f33539b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f33539b) + (this.f33538a.hashCode() * 31);
        }

        public final String toString() {
            return "Dashboard(dashboardWidgets=" + this.f33538a + ", setupComplete=" + this.f33539b + ")";
        }

        public /* synthetic */ b(List list, boolean z14, int i14, j jVar) {
            this(list, (i14 & 2) != 0 ? true : z14);
        }
    }
}
