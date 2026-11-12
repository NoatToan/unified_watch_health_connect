package com.garmin.android.apps.connectmobile.jet_lag.presentation.setup;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/b$a;", "Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/b;", "<init>", "()V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37095a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/b$b;", "Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/b;", "", "forcedMode", "<init>", "(Z)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0665b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f37096a;

        public C0665b(boolean z14) {
            this.f37096a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0665b) && this.f37096a == ((C0665b) obj).f37096a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f37096a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("Disabled(forcedMode=", ")", this.f37096a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/b$c;", "Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/b;", "", "forcedMode", "<init>", "(Z)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f37097a;

        public c(boolean z14) {
            this.f37097a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f37097a == ((c) obj).f37097a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f37097a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("PermissionDenied(forcedMode=", ")", this.f37097a);
        }
    }
}
