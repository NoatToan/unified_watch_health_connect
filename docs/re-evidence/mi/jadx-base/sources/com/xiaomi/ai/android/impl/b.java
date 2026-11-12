package com.xiaomi.ai.android.impl;

import android.content.Context;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.ai.android.capability.StorageCapability;
import com.xiaomi.ai.android.core.e;
import com.xiaomi.ai.android.utils.d;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.smarthome.setting.ServerSetting;

/* JADX INFO: loaded from: classes6.dex */
public class b extends StorageCapability {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10964b;
    private final e c;

    public b(e eVar, int i, int i2) {
        StringBuilder sb;
        String str;
        this.f10963a = eVar.j();
        this.c = eVar;
        this.f10964b = i2 == 2 ? "staging" : i2 == 1 ? ServerSetting.SERVER_ENV_PREVIEW : "production";
        switch (i) {
            case 1:
                sb = new StringBuilder();
                sb.append(this.f10964b);
                str = "_DO-TOKEN-V1";
                break;
            case 2:
                sb = new StringBuilder();
                sb.append(this.f10964b);
                str = "_MIOT-TOKEN-V1";
                break;
            case 3:
                sb = new StringBuilder();
                sb.append(this.f10964b);
                str = "_TP-TOKEN-V1";
                break;
            case 4:
                sb = new StringBuilder();
                sb.append(this.f10964b);
                str = "_AO-TOKEN-V1";
                break;
            case 5:
                sb = new StringBuilder();
                sb.append(this.f10964b);
                str = "_AA-TOKEN-V1";
                break;
            case 6:
                sb = new StringBuilder();
                sb.append(this.f10964b);
                str = "_DAA-TOKEN-V1";
                break;
            default:
                sb = new StringBuilder();
                sb.append(this.f10964b);
                str = "_unknown_auth_type";
                break;
        }
        sb.append(str);
        this.f10964b = sb.toString();
        if (eVar.i().b("auth.support_multiply_client_id")) {
            this.f10964b += RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + eVar.h().getDeviceId().b();
            this.f10964b += RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + eVar.i().i("auth.client_id");
        }
        this.f10964b += RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR;
    }

    @Override // com.xiaomi.ai.android.capability.StorageCapability
    public void clearKeyValue() {
        d.a(this.f10963a, "aivs_user_data.xml");
    }

    @Override // com.xiaomi.ai.android.capability.StorageCapability
    public String readKeyValue(String str) {
        if (XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2.equals(str) || "refresh_token".equals(str) || "expire_at".equals(str)) {
            str = this.c.c() + str;
        }
        return d.a(this.f10963a, "aivs_user_data.xml", this.f10964b + str);
    }

    @Override // com.xiaomi.ai.android.capability.StorageCapability
    public void removeKeyValue(String str) {
        if (XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2.equals(str) || "refresh_token".equals(str) || "expire_at".equals(str)) {
            str = this.c.c() + str;
        }
        d.b(this.f10963a, "aivs_user_data.xml", this.f10964b + str);
    }

    @Override // com.xiaomi.ai.android.capability.StorageCapability
    public boolean writeKeyValue(String str, String str2) {
        if (XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2.equals(str) || "refresh_token".equals(str) || "expire_at".equals(str)) {
            str = this.c.c() + str;
        }
        d.a(this.f10963a, "aivs_user_data.xml", this.f10964b + str, str2);
        return true;
    }
}
