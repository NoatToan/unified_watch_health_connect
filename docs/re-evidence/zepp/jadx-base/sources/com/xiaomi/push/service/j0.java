package com.xiaomi.push.service;

import com.xiaomi.push.cz;

/* JADX INFO: loaded from: classes22.dex */
/* synthetic */ class j0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[cz.values().length];
        a = iArr;
        try {
            iArr[cz.Registration.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[cz.UnRegistration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[cz.Subscription.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[cz.UnSubscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[cz.SendMessage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[cz.AckMessage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[cz.SetConfig.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[cz.ReportFeedback.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[cz.Notification.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[cz.Command.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
