package defpackage;

import com.xiaomi.push.ib;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class igs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21124a;

    static {
        int[] iArr = new int[ib.values().length];
        f21124a = iArr;
        try {
            iArr[ib.Registration.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21124a[ib.UnRegistration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21124a[ib.Subscription.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f21124a[ib.UnSubscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f21124a[ib.SendMessage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f21124a[ib.AckMessage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f21124a[ib.SetConfig.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f21124a[ib.ReportFeedback.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f21124a[ib.Notification.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f21124a[ib.Command.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
