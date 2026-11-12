package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.main.api.MainCommonApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = MainCommonApi.class)
@Singleton
public class tqw implements MainCommonApi {
    @Override // com.huawei.health.main.api.MainCommonApi
    public String getPersonalPrivacySettingValue(int i) {
        return wmq.a(BaseApplication.b()).c(i);
    }

    @Override // com.huawei.health.main.api.MainCommonApi
    public Bitmap getQuickAppIcon(Context context, String str) {
        return vwh.e(context, str);
    }

    @Override // com.huawei.health.main.api.MainCommonApi
    public Drawable getSportIconDrawable(Context context, int i) {
        return vrg.b(context, i);
    }

    @Override // com.huawei.health.main.api.MainCommonApi
    public int getSportIconBackgroundColor(Context context, int i) {
        return vrg.c(context, i);
    }

    @Override // com.huawei.health.main.api.MainCommonApi
    public String getSportName(Context context, int i) {
        return vrg.e(i, context);
    }

    @Override // com.huawei.health.main.api.MainCommonApi
    public String getDataSourceName(HiHealthClient hiHealthClient) {
        return wgt.a(hiHealthClient);
    }
}
