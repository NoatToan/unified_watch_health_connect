package com.xiaomi.mipush.sdk;

import com.xiaomi.push.cz;

/* JADX INFO: loaded from: classes22.dex */
/* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[cz.values().length];
        a = iArr;
        try {
            iArr[cz.SendMessage.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[cz.Registration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[cz.UnRegistration.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[cz.Subscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[cz.UnSubscription.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[cz.Command.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[cz.Notification.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
