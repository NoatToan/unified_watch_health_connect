package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/b$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/b;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48509a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -645785696;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.details.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/b$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/b;", "", "deviceName", "<init>", "(Ljava/lang/String;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0945b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48510a;

        public /* synthetic */ C0945b(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0945b) && p005kotlin.jvm.internal.s.g(this.f48510a, ((C0945b) obj).f48510a);
        }

        public final int hashCode() {
            String str = this.f48510a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("Visible(deviceName=", this.f48510a, ")");
        }

        public C0945b(String str) {
            this.f48510a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0945b() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
