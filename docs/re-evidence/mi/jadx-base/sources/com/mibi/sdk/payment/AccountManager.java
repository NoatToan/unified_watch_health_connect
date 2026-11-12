package com.mibi.sdk.payment;

import android.content.Context;
import com.mibi.sdk.account.AccountInjector;
import com.mibi.sdk.common.utils.MibiLog;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes5.dex */
class AccountManager {
    private static final String ACCOUNT_MODULE_INJECTOR = "com.mibi.sdk.account.AccountInjector";
    private static final String TAG = "AccountManager";

    public static void initAccount(Context context) {
        tryInjectAccount(context);
    }

    public static boolean isLogined(Context context) {
        Boolean bool;
        Boolean bool2 = Boolean.FALSE;
        try {
            bool = (Boolean) AccountInjector.class.getMethod("isLogined", Context.class).invoke(null, context);
            try {
                MibiLog.d(TAG, "isLogin:" + bool);
            } catch (ClassNotFoundException unused) {
                bool2 = bool;
                MibiLog.e(TAG, "AccountInjector is not founded.Use no account");
                bool = bool2;
            } catch (IllegalAccessException e) {
                e = e;
                bool2 = bool;
                e.printStackTrace();
                bool = bool2;
            } catch (NoSuchMethodException e2) {
                e = e2;
                bool2 = bool;
                e.printStackTrace();
                bool = bool2;
            } catch (InvocationTargetException e3) {
                e = e3;
                bool2 = bool;
                e.printStackTrace();
                bool = bool2;
            }
        } catch (ClassNotFoundException unused2) {
        } catch (IllegalAccessException e4) {
            e = e4;
        } catch (NoSuchMethodException e5) {
            e = e5;
        } catch (InvocationTargetException e6) {
            e = e6;
        }
        return bool.booleanValue();
    }

    public static void tryClearAccount() {
        try {
            AccountInjector.class.getMethod("release", new Class[0]).invoke(null, new Object[0]);
            MibiLog.d(TAG, "tryInjectAccount success");
        } catch (ClassNotFoundException unused) {
            MibiLog.e(TAG, "AccountInjector is not founded.Use no account");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    private static void tryInjectAccount(Context context) {
        try {
            AccountInjector.class.getMethod("inject", Context.class).invoke(null, context);
            MibiLog.d(TAG, "tryInjectAccount success");
        } catch (ClassNotFoundException unused) {
            MibiLog.e(TAG, "AccountInjector is not founded.Use no account");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }
}
