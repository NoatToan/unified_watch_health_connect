package com.huawei.pluginmessagecenter.service;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.pgz;
import defpackage.pha;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes42.dex */
public class MessageJsApi extends JsBaseModule {
    private static final int DEFAULT_ERROR = -1;
    private static final String MODULE = "module";
    private static final String MSG_ID = "messageId";
    private static final int MSG_STATUS_UNREAD = 0;
    private static final String TYPE = "type";

    @JavascriptInterface
    public void getMessages(long j, String str) {
        LogUtil.a(this.TAG, "enter getMessages");
        ArrayList arrayList = new ArrayList();
        if (StringUtils.g(str)) {
            LogUtil.j(this.TAG, "messageCenter.getMessages: parameter cannot be null or empty.");
            onFailureCallback(j, "parameter is not or emyty", -1);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            List<MessageObject> listB = pha.e(this.mContext).b(jSONObject.getString("module"), jSONObject.getString("type"));
            if (njy.e(listB)) {
                LogUtil.j(this.TAG, "list is Empty");
                onSuccessCallback(j, "");
                return;
            }
            for (MessageObject messageObject : listB) {
                if (messageObject.getReadFlag() == 0) {
                    arrayList.add(messageObject);
                }
            }
            String json = new Gson().toJson(arrayList);
            LogUtil.a(this.TAG, "getMessages success");
            onSuccessCallback(j, json);
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "getMessage JSONException");
            onFailureCallback(j, "JSONException", -1);
        }
    }

    @JavascriptInterface
    public void onRead(String str) throws Throwable {
        LogUtil.a(this.TAG, "enter onRead");
        if (StringUtils.g(str)) {
            LogUtil.j(this.TAG, "parameter be null or empty.");
            return;
        }
        try {
            pgz.c(this.mContext).e(new JSONObject(str).getString(MSG_ID));
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "onRead JSONException");
        }
    }
}
