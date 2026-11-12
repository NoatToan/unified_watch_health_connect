package com.huawei.watchface;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.huawei.watchface.mvp.model.datatype.FileCreateResponse;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class t0 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30571a;

    public t0(List list) {
        this.f30571a = list;
    }

    public FileCreateResponse b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("FileCreateRequest", "dealReceive json is empty");
            return null;
        }
        try {
            return (FileCreateResponse) c5.a().a(str, FileCreateResponse.class);
        } catch (Exception e) {
            HwLog.e("FileCreateRequest", "dealReceive " + HwLog.printException(e));
            return null;
        }
    }

    public String buildRequestParams() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(WatchFaceConstant.SCENARIO_ID, "ThemeContentFile");
            linkedHashMap.put("materialFileInfoList", this.f30571a);
            JsonElement jsonElement = (JsonElement) GsonHelper.fromJson(GsonHelper.toJson(linkedHashMap), JsonElement.class);
            return jsonElement != null ? jsonElement.getAsJsonObject().toString() : "";
        } catch (Exception e) {
            HwLog.i("FileCreateRequest", "Exception : " + HwLog.printException(e));
            return "";
        }
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.huawei.hms.network.embedded.x2.CONNECT_TIMEOUT, 6000);
            jSONObject.put("read_timeout", 6000);
        } catch (JSONException e) {
            HwLog.e("FileCreateRequest", "build reqConfigJson:" + HwLog.printException((Exception) e));
        }
        return jSONObject.toString();
    }

    public LinkedHashMap f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(super.getReqHeaders());
        linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
        linkedHashMap.put(WatchFaceHttpUtil.HTTP_CONFIG_JSON, e());
        linkedHashMap.remove("Content-Type");
        linkedHashMap.remove(WatchFaceConstant.CIPHER_VERSION);
        return linkedHashMap;
    }

    public String g() {
        return a(WatchFaceHttpUtil.getFileCreateResourceUrl(), buildRequestParams(), f());
    }
}
