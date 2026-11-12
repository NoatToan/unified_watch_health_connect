package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.recognizekit.base.RecognizeBiApi;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class guq implements RecognizeBiApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f36057a;
    private static final String d = AnalyticsValue.RECOGNIZE_FOOD_EVENT_VALUE.value();

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onEnterEvent(int i, String str) {
        f36057a = i;
        HashMap map = new HashMap();
        map.put("from", i + "");
        map.put("entrance", e(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("event", "0");
        map.put("scannedType", "");
        map.put("result", "");
        map.put("type", "");
        map.put("moduleName", "diet_photography");
        lmf.d().c(BaseApplication.b(), d, map, 0);
    }

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onTipsEvent(String str) {
        HashMap map = new HashMap();
        map.put("from", f36057a + "");
        map.put("entrance", e(f36057a));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("event", "1");
        map.put("scannedType", "");
        map.put("result", "");
        map.put("type", "");
        map.put("moduleName", "diet_photography");
        lmf.d().c(BaseApplication.b(), d, map, 0);
    }

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onAlbumEvent(String str) {
        HashMap map = new HashMap();
        map.put("from", f36057a + "");
        map.put("entrance", e(f36057a));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("event", "1");
        map.put("scannedType", "");
        map.put("result", "");
        map.put("type", "");
        map.put("moduleName", "diet_photography");
        lmf.d().c(BaseApplication.b(), d, map, 0);
    }

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onRecognizeEvent(boolean z) {
        HashMap map = new HashMap();
        map.put("from", f36057a + "");
        map.put("event", "4");
        map.put("scannedType", z ? "2" : "1");
        map.put("result", "");
        map.put("type", "");
        lmf.d().c(BaseApplication.b(), d, map, 0);
    }

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onRecognizeResultEvent(boolean z, boolean z2) {
        HashMap map = new HashMap();
        map.put("from", f36057a + "");
        map.put("event", HealthZonePushReceiver.SOS_LOCATION_NOTIFY);
        map.put("scannedType", z ? "2" : "1");
        map.put("result", z2 ? "1" : "2");
        map.put("type", "");
        lmf.d().c(BaseApplication.b(), d, map, 0);
    }

    @Override // com.huawei.health.recognizekit.base.RecognizeBiApi
    public void onRecognizeEvent(String str, lmn lmnVar) {
        lmf.d().a(BaseApplication.b(), str, lmnVar, 0);
    }

    private String e(int i) {
        if (i == 1) {
            return "e1";
        }
        if (i == 2) {
            return "e2";
        }
        if (i == 3) {
            return "e3";
        }
        if (i == 4) {
            return "e4";
        }
        return "0";
    }
}
