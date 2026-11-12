package defpackage;

import com.huawei.health.recognizekit.base.RecognizeBiApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class gum implements RecognizeBiApi {
    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onAlbumEvent(String str) {
    }

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onRecognizeEvent(String str, lmn lmnVar) {
    }

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onRecognizeEvent(boolean z) {
    }

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onTipsEvent(String str) {
    }

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onEnterEvent(int i, String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", 2);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SNACK_CONTROL_ENTRANCE.value(), map, 0);
    }

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onRecognizeResultEvent(boolean z, boolean z2) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("result", 2);
        map.put("event", 2);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SNACK_CONTROL_ACTION.value(), map, 0);
    }
}
