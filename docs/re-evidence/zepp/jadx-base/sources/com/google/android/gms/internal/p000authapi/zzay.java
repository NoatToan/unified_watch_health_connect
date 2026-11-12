package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes3.dex */
public final class zzay {
    private static final Feature a;
    private static final Feature b;
    private static final Feature c;
    public static final Feature zzdc;
    public static final Feature zzdd;
    public static final Feature zzdg;
    public static final Feature zzdh;
    public static final Feature[] zzdj;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 4L);
        zzdc = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        zzdd = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        a = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        b = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 3L);
        zzdg = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 3L);
        zzdh = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 2L);
        c = feature7;
        zzdj = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7};
    }
}
