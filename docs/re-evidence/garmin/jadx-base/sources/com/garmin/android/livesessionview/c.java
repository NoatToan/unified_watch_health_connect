package com.garmin.android.livesessionview;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
public interface c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/livesessionview/c$a;", "Lcom/garmin/android/livesessionview/c;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/Throwable;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f50574a;

        public a(Throwable th3) {
            th3.getClass();
            this.f50574a = th3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f50574a.equals(((a) obj).f50574a);
        }

        public final int hashCode() {
            return this.f50574a.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.f50574a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/livesessionview/c$b;", "Lcom/garmin/android/livesessionview/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f50575a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -233259162;
        }

        public final String toString() {
            return "Initialized";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.livesessionview.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/livesessionview/c$c;", "Lcom/garmin/android/livesessionview/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1013c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1013c f50576a = new C1013c();

        private C1013c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1013c);
        }

        public final int hashCode() {
            return 1273752237;
        }

        public final String toString() {
            return "Uninitialized";
        }
    }
}
