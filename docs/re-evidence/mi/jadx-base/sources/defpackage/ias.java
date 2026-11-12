package defpackage;

import android.content.Context;
import android.net.Uri;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.SDKConstants;
import com.miui.tsmclient.util.ResUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;

/* JADX INFO: loaded from: classes2.dex */
public class ias implements c3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ens f20956a = new ens();

    @Override // defpackage.c3t
    public BaseResponse a(Context context, String str) {
        return this.f20956a.d(context, str);
    }

    @Override // defpackage.c3t
    public BaseResponse b(Context context, String str) {
        BaseResponse baseResponseF = this.f20956a.f(context, str);
        baseResponseF.mMsg = ResUtils.getString(context, baseResponseF.isSuccess() ? "ccc_terminate_success" : "ccc_terminate_failed");
        return baseResponseF;
    }

    @Override // defpackage.c3t
    public BaseResponse c(Context context, String str) {
        String strDecode = Uri.decode(str);
        Uri uri = Uri.parse(strDecode);
        BaseResponse baseResponseB = this.f20956a.b(context, uri.getQueryParameter(SDKConstants.KEY_BRAND_ID));
        if (baseResponseB.isSuccess()) {
            baseResponseB = new ess().a(context, new CarKeyCardInfo());
        }
        if (!baseResponseB.isSuccess()) {
            return baseResponseB;
        }
        String fragment = uri.getFragment();
        return this.f20956a.a(context, Uri.parse(strDecode.split("\\?")[0] + "?v=" + uri.getQueryParameter("v") + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + fragment));
    }

    @Override // defpackage.c3t
    public BaseResponse d(Context context, String str) {
        return this.f20956a.e(context, str);
    }
}
