package defpackage;

import android.text.TextUtils;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.device.api.DeviceManagerCommonConfigApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.ScreenshotResponse;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.Services;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f41651a = File.separator + "device_manager_common_config.json";
    private final Object d = new Object();
    private List<ScreenshotResponse.TypeInfo> e = new ArrayList();

    public static mgm d() {
        return d.f41653a;
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final mgm f41653a = new mgm();
    }

    public void c() {
        boolean isLogined = LoginInit.getInstance(BaseApplication.getContext()).getIsLogined();
        LogUtil.a("ScreenshotResourceManager", "isLogined:", Boolean.valueOf(isLogined));
        if (isLogined) {
            ((DeviceManagerCommonConfigApi) Services.b("Module_Device_Feature", DeviceManagerCommonConfigApi.class)).downLoadCommonConfig();
        }
    }

    public void d(String str, ResultCallback<ScreenshotResponse.ScaleOffsetInfo> resultCallback) {
        synchronized (this.d) {
            if (!njy.e(this.e)) {
                a(str, resultCallback);
                return;
            }
            try {
                File file = new File(BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + "commonResource" + f41651a);
                if (!file.exists()) {
                    resultCallback.onFailure(new Throwable("parseScaleOffsetFromCache file is not exists"));
                    return;
                }
                String strA = FileUtils.a(file, file.length());
                if (TextUtils.isEmpty(strA)) {
                    resultCallback.onFailure(new Throwable("parseScaleOffsetFromCache get config json is empty"));
                    return;
                }
                JSONArray jSONArrayOptJSONArray = new JSONObject(strA).optJSONArray("watchcaseConfigs");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                    List list = (List) new Gson().fromJson(jSONArrayOptJSONArray.toString(), new TypeToken<List<ScreenshotResponse.TypeInfo>>() { // from class: mgm.2
                    }.getType());
                    if (njy.e(list)) {
                        resultCallback.onFailure(new Throwable("parseScaleOffsetFromCache list is null"));
                        return;
                    }
                    this.e.addAll(list);
                    LogUtil.a("ScreenshotResourceManager", "parseScaleOffsetFromCache infoList size:", this.e, " typeInfoList size:", Integer.valueOf(list.size()));
                    a(str, resultCallback);
                    return;
                }
                resultCallback.onFailure(new Throwable("parseScaleOffsetFromCache jsonArray is null or empty"));
            } catch (IOException e) {
                e = e;
                resultCallback.onFailure(new Throwable(ExceptionUtils.c(e)));
            } catch (JSONException e2) {
                e = e2;
                resultCallback.onFailure(new Throwable(ExceptionUtils.c(e)));
            }
        }
    }

    private void a(final String str, ResultCallback<ScreenshotResponse.ScaleOffsetInfo> resultCallback) {
        ScreenshotResponse.TypeInfo typeInfoOrElse = this.e.stream().filter(new Predicate() { // from class: mgn
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return mgm.c(str, (ScreenshotResponse.TypeInfo) obj);
            }
        }).findFirst().orElse(null);
        Objects.isNull(typeInfoOrElse);
        if (typeInfoOrElse == null) {
            resultCallback.onFailure(new Throwable("parseScaleOffsetFromCache info is null"));
            return;
        }
        ScreenshotResponse.ScaleOffsetInfo watchcaseImgPosition = typeInfoOrElse.getWatchcaseImgPosition();
        Objects.isNull(watchcaseImgPosition);
        if (watchcaseImgPosition == null) {
            resultCallback.onFailure(new Throwable("parseScaleOffsetFromCache watchcaseImgPosition is null"));
        } else if (d(watchcaseImgPosition)) {
            resultCallback.onSuccess(watchcaseImgPosition);
        } else {
            resultCallback.onFailure(new Throwable("parseScaleOffsetFromCache scale and offset is wrong"));
        }
    }

    static /* synthetic */ boolean c(String str, ScreenshotResponse.TypeInfo typeInfo) {
        return typeInfo != null && str.equals(typeInfo.getDeviceType());
    }

    public boolean d(ScreenshotResponse.ScaleOffsetInfo scaleOffsetInfo) {
        if (BigDecimal.valueOf(scaleOffsetInfo.getScale()).compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }
        return ((BigDecimal.valueOf(scaleOffsetInfo.getScale()).compareTo(BigDecimal.ONE) == 0) && (BigDecimal.valueOf(scaleOffsetInfo.getTranslateX()).compareTo(BigDecimal.ZERO) == 0) && (BigDecimal.valueOf(scaleOffsetInfo.getTranslateY()).compareTo(BigDecimal.ZERO) == 0)) ? false : true;
    }

    public List<ScreenshotResponse.TypeInfo> b() {
        return this.e;
    }
}
