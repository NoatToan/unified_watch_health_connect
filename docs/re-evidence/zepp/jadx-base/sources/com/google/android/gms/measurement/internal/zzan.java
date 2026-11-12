package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzan extends y0 {
    private long b;
    private String c;
    private AccountManager d;
    private Boolean e;
    private long f;

    public zzan(zzfv zzfvVar) {
        super(zzfvVar);
    }

    @WorkerThread
    public final long b() {
        zzg();
        return this.f;
    }

    @WorkerThread
    public final boolean c() {
        zzg();
        long jCurrentTimeMillis = this.zzs.zzav().currentTimeMillis();
        if (jCurrentTimeMillis - this.f > 86400000) {
            this.e = null;
        }
        Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.checkSelfPermission(this.zzs.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
            this.zzs.zzay().zzm().zza("Permission error checking for dasher/unicorn accounts");
            this.f = jCurrentTimeMillis;
            this.e = Boolean.FALSE;
            return false;
        }
        if (this.d == null) {
            this.d = AccountManager.get(this.zzs.zzau());
        }
        try {
            Account[] result = this.d.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            if (result != null && result.length > 0) {
                this.e = Boolean.TRUE;
                this.f = jCurrentTimeMillis;
                return true;
            }
            Account[] result2 = this.d.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.e = Boolean.TRUE;
                this.f = jCurrentTimeMillis;
                return true;
            }
            this.f = jCurrentTimeMillis;
            this.e = Boolean.FALSE;
            return false;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.zzs.zzay().zzh().zzb("Exception checking account types", e);
        }
    }

    public final long zzb() {
        zzu();
        return this.b;
    }

    public final String zzc() {
        zzu();
        return this.c;
    }

    @WorkerThread
    public final void zzd() {
        zzg();
        this.e = null;
        this.f = 0L;
    }

    @Override // com.google.android.gms.measurement.internal.y0
    public final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.b = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb.append(lowerCase2);
        this.c = sb.toString();
        return false;
    }
}
