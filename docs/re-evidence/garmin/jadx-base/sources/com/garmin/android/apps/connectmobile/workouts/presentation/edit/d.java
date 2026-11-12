package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48945a = a.f48946a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f48946a = new a();

        private a() {
        }

        public static d a(Double d14, m52.j jVar) {
            return (!zf.b.D(d14) || jVar == null) ? c.f48949b : new b(d14.doubleValue(), jVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d;", "", "value", "Lm52/j;", "measurementUnit", "<init>", "(DLm52/j;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f48947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m52.j f48948c;

        public b(double d14, m52.j jVar) {
            jVar.getClass();
            this.f48947b = d14;
            this.f48948c = jVar;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getF48947b() {
            return this.f48947b;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final m52.j getF48948c() {
            return this.f48948c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f48947b, bVar.f48947b) == 0 && this.f48948c == bVar.f48948c;
        }

        public final int hashCode() {
            return this.f48948c.hashCode() + (Double.hashCode(this.f48947b) * 31);
        }

        public final String toString() {
            return "Specified(value=" + this.f48947b + ", measurementUnit=" + this.f48948c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f48949b = new c();

        private c() {
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.d
        /* JADX INFO: renamed from: a */
        public final double getF48947b() {
            return Double.NaN;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.d
        /* JADX INFO: renamed from: b */
        public final /* bridge */ /* synthetic */ m52.j getF48948c() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1777089723;
        }

        public final String toString() {
            return "Unspecified";
        }
    }

    /* JADX INFO: renamed from: a */
    double getF48947b();

    /* JADX INFO: renamed from: b */
    m52.j getF48948c();
}
