package bh;

import android.content.Context;
import android.content.SharedPreferences;
import com.nimbusds.jose.jwk.JWKParameterNames;
import zg.c;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f17909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f17910c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f17911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17912e;

    public a(Context context, String str, String str2, boolean z14, boolean z15) {
        this.f17909b = null;
        this.f17912e = z15;
        this.f17908a = str2;
        this.f17911d = context;
        if (context != null) {
            this.f17909b = context.getSharedPreferences(str2, 0);
        }
    }

    public final String a(String str) {
        SharedPreferences sharedPreferences = this.f17909b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!c.b(string)) {
                return string;
            }
        }
        return "";
    }

    public final void b() {
        Context context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f17910c;
        if (editor != null) {
            if (!this.f17912e && this.f17909b != null) {
                editor.putLong(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, jCurrentTimeMillis);
            }
            this.f17910c.commit();
        }
        if (this.f17909b == null || (context = this.f17911d) == null) {
            return;
        }
        this.f17909b = context.getSharedPreferences(this.f17908a, 0);
    }

    public final void c(String str) {
        SharedPreferences sharedPreferences;
        if (c.b(str) || str.equals(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT)) {
            return;
        }
        if (this.f17910c == null && (sharedPreferences = this.f17909b) != null) {
            this.f17910c = sharedPreferences.edit();
        }
        SharedPreferences.Editor editor = this.f17910c;
        if (editor != null) {
            editor.remove(str);
        }
    }
}
