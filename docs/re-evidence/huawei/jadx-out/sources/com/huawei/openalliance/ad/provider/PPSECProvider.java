package com.huawei.openalliance.ad.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ch;
import com.huawei.openalliance.ad.utils.k;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
public class PPSECProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f20074a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f20075b = new a() { // from class: com.huawei.openalliance.ad.provider.PPSECProvider.1
        @Override // com.huawei.openalliance.ad.provider.a
        public Bundle a(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            try {
                String strA = ch.a(PPSECProvider.this.getContext());
                hw.b("PPSATProvider", "callingPackage " + strA);
                if (TextUtils.isEmpty(strA)) {
                    bundle2.putInt("errcode", 2);
                    return bundle2;
                }
                if (!k.g(PPSECProvider.this.getContext(), strA)) {
                    bundle2.putInt("errcode", 3);
                    return bundle2;
                }
                String strB = com.huawei.openalliance.ad.inter.a.a().b();
                if (TextUtils.isEmpty(strB)) {
                    hw.c("PPSATProvider", "at is null.");
                    bundle2.putInt("errcode", 4);
                    return bundle2;
                }
                bundle2.putString("accessToken", strB);
                bundle2.putInt("errcode", 0);
                return bundle2;
            } catch (Throwable th) {
                bundle2.putInt("errcode", 5);
                hw.c("PPSATProvider", "getAccessToken exception: " + th.getClass().getSimpleName());
                return bundle2;
            }
        }
    };

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f20074a.put("getAccessToken", this.f20075b);
        return false;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        hw.b("PPSATProvider", "call method: " + str);
        a aVar = this.f20074a.get(str);
        if (aVar != null) {
            return aVar.a(str2, bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("errcode", 1);
        return bundle2;
    }
}
