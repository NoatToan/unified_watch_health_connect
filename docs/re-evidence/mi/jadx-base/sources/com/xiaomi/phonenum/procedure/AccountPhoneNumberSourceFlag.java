package com.xiaomi.phonenum.procedure;

/* JADX INFO: loaded from: classes11.dex */
public class AccountPhoneNumberSourceFlag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14017a;

    public AccountPhoneNumberSourceFlag(int i) {
        this.f14017a = i;
    }

    public static AccountPhoneNumberSourceFlag c(int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i |= i2;
        }
        return new AccountPhoneNumberSourceFlag(i);
    }

    public AccountPhoneNumberSourceFlag a(int i) {
        return new AccountPhoneNumberSourceFlag(i | this.f14017a);
    }

    public boolean b(int i) {
        return (i & this.f14017a) != 0;
    }
}
