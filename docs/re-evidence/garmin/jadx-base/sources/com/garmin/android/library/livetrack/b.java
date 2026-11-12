package com.garmin.android.library.livetrack;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
public interface b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/livetrack/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        EVENT_LIVETRACK_RESEND_DECLINED_REQUEST,
        EVENT_LIVETRACK_RENEW_EXPIRING_SUBSCRIPTION,
        EVENT_LIVETRACK_RENEW_EXPIRED_SUBSCRIPTION,
        EVENT_LIVETRACK_STARTED_WITH_SMS_RECIPIENT;

        /* JADX INFO: renamed from: com.garmin.android.library.livetrack.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0997a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50185a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.EVENT_LIVETRACK_RESEND_DECLINED_REQUEST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.EVENT_LIVETRACK_RENEW_EXPIRING_SUBSCRIPTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.EVENT_LIVETRACK_RENEW_EXPIRED_SUBSCRIPTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.EVENT_LIVETRACK_STARTED_WITH_SMS_RECIPIENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f50185a = iArr;
            }
        }
    }

    void a(a aVar);
}
