package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes12.dex */
public class fe implements ge {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ge f18751c;
    private static final byte[] d = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f18753b;
    private final byte[] e = new byte[0];

    @Override // com.huawei.openalliance.ad.ge
    public boolean d(String str) {
        SharedPreferences sharedPreferences;
        synchronized (this.e) {
            if (!com.huawei.openalliance.ad.utils.dg.b(str) && (sharedPreferences = this.f18753b) != null) {
                return sharedPreferences.contains(str);
            }
            return false;
        }
    }

    @Override // com.huawei.openalliance.ad.ge
    public long d() {
        synchronized (this.e) {
            SharedPreferences sharedPreferences = this.f18753b;
            if (sharedPreferences == null) {
                return 0L;
            }
            return sharedPreferences.getLong(Constants.LABEL_GEN_TIME, 0L);
        }
    }

    @Override // com.huawei.openalliance.ad.ge
    public void c(String str) {
        synchronized (this.e) {
            if (this.f18753b != null && !com.huawei.openalliance.ad.utils.dg.b(str)) {
                this.f18753b.edit().remove(str).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ge
    public int c() {
        synchronized (this.e) {
            SharedPreferences sharedPreferences = this.f18753b;
            if (sharedPreferences == null) {
                return 200;
            }
            return sharedPreferences.getInt(Constants.INS_APPS_RETURN_CODE, -1);
        }
    }

    @Override // com.huawei.openalliance.ad.ge
    public void b(String str) {
        synchronized (this.e) {
            SharedPreferences sharedPreferences = this.f18753b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(Constants.ENCODING_MODE, str).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ge
    public String b() {
        String strA;
        synchronized (this.e) {
            SharedPreferences sharedPreferences = this.f18753b;
            strA = sharedPreferences == null ? com.huawei.openalliance.ad.utils.dg.a((Object) 1) : sharedPreferences.getString(Constants.ENCODING_MODE, com.huawei.openalliance.ad.utils.dg.a((Object) 1));
        }
        return strA;
    }

    @Override // com.huawei.openalliance.ad.ge
    public void a(String str) {
        synchronized (this.e) {
            SharedPreferences sharedPreferences = this.f18753b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(Constants.INS_APPS_ENCODED, str).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ge
    public void a(long j) {
        synchronized (this.e) {
            SharedPreferences sharedPreferences = this.f18753b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong(Constants.LABEL_GEN_TIME, j).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ge
    public void a(int i) {
        synchronized (this.e) {
            SharedPreferences sharedPreferences = this.f18753b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt(Constants.INS_APPS_RETURN_CODE, i).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ge
    public String a() {
        String string;
        synchronized (this.e) {
            SharedPreferences sharedPreferences = this.f18753b;
            string = sharedPreferences == null ? "" : sharedPreferences.getString(Constants.INS_APPS_ENCODED, "");
        }
        return string;
    }

    private static ge b(Context context) {
        ge geVar;
        synchronized (d) {
            if (f18751c == null) {
                f18751c = new fe(context);
            }
            geVar = f18751c;
        }
        return geVar;
    }

    public static ge a(Context context) {
        return b(context);
    }

    private fe(Context context) {
        this.f18752a = context.getApplicationContext();
        try {
            this.f18753b = context.getSharedPreferences("HiAd_InsAppsSharedPreferences", 0);
        } catch (Throwable th) {
            try {
                hw.c("InsAppsSpHandler", "get SharedPreference exception: %s", th.getClass().getSimpleName());
            } finally {
                this.f18753b = null;
            }
        }
    }
}
