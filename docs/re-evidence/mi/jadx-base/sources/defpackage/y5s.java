package defpackage;

import com.xiaomi.push.ib;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class y5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f39823a;

    static {
        int[] iArr = new int[ib.values().length];
        f39823a = iArr;
        try {
            iArr[ib.SendMessage.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f39823a[ib.Registration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f39823a[ib.UnRegistration.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f39823a[ib.Subscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f39823a[ib.UnSubscription.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f39823a[ib.Command.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f39823a[ib.Notification.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
