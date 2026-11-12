package defpackage;

import com.xiaomi.push.ib;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class vls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f37013a;

    static {
        int[] iArr = new int[ib.values().length];
        f37013a = iArr;
        try {
            iArr[ib.Registration.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f37013a[ib.UnRegistration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f37013a[ib.Subscription.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f37013a[ib.UnSubscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f37013a[ib.SendMessage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f37013a[ib.AckMessage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f37013a[ib.SetConfig.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f37013a[ib.ReportFeedback.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f37013a[ib.MultiConnectionBroadcast.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f37013a[ib.MultiConnectionResult.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f37013a[ib.Notification.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f37013a[ib.Command.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
