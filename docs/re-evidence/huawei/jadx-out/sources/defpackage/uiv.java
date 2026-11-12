package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;

/* JADX INFO: loaded from: classes43.dex */
public class uiv {
    private static uiv d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private uim f50204b = uim.c();

    private uiv() {
    }

    public static uiv d() {
        if (d == null) {
            d = new uiv();
        }
        return d;
    }

    public void d(final CommonUiBaseResponse commonUiBaseResponse) {
        if (this.f50204b != null) {
            LogUtil.a("FitnessThirdPartyDataInteractor", "requestGoogleFitPonitDatas ");
            this.f50204b.a(new CommonUiBaseResponse() { // from class: uiv.1
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i, Object obj) {
                    commonUiBaseResponse.onResponse(i, obj);
                    LogUtil.d("FitnessThirdPartyDataInteractor", "requestGoogleFitPonitDatas  sucess !!! ");
                }
            });
        }
    }

    public void b(final CommonUiBaseResponse commonUiBaseResponse) {
        if (this.f50204b != null) {
            LogUtil.a("FitnessThirdPartyDataInteractor", "requestGoogleFitSegentDatas");
            this.f50204b.c(new CommonUiBaseResponse() { // from class: uiv.2
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i, Object obj) {
                    commonUiBaseResponse.onResponse(i, obj);
                    LogUtil.d("FitnessThirdPartyDataInteractor", "requestGoogleFitSegentDatas  sucess !!! ");
                }
            });
        }
    }
}
