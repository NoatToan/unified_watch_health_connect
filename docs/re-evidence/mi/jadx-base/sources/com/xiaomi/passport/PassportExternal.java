package com.xiaomi.passport;

/* JADX INFO: loaded from: classes11.dex */
public class PassportExternal {
    public static PassportUserEnvironment getEnvironment() {
        return PassportUserEnvironment.Holder.getInstance();
    }

    public static void initEnvironment(PassportUserEnvironment passportUserEnvironment) {
        PassportUserEnvironment.Holder.setInstance(passportUserEnvironment);
    }
}
