package com.huawei.wear.oversea.restclient;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.wear.oversea.httputil.BaseHttpParams;
import com.huawei.wear.oversea.httputil.restclient.StringDeleteRestClientService;
import com.huawei.wear.oversea.httputil.restclient.StringGetRestClientService;
import com.huawei.wear.oversea.httputil.restclient.StringRestClientService;
import defpackage.xmq;
import defpackage.xmr;
import defpackage.xmu;
import defpackage.xmv;
import defpackage.xmw;
import defpackage.xnd;
import defpackage.xpp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseRestClient<Result, RequestParams> extends BaseHttpParams {
    private static final String TAG = "BaseRestClient";
    protected Map<String, String> headMaps;
    private Context mContext;
    protected int mRequestType = 2;
    protected String mUrl;
    protected Map<String, String> requestMaps;

    protected abstract Result handleFailResult(int i, String str, Object obj);

    protected abstract Result handleSucceedResult(String str);

    public BaseRestClient(Context context, String str, Map<String, String> map, Map<String, String> map2) {
        this.headMaps = new LinkedHashMap();
        this.requestMaps = new LinkedHashMap();
        this.mUrl = str;
        this.mContext = context;
        if (map != null) {
            this.headMaps = map;
            addAgent(map);
        }
        if (map2 != null) {
            this.requestMaps = map2;
        }
    }

    public static Map<String, String> getDefaultMaps() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Content-Type", "application/json");
        linkedHashMap.put("Charset", "UTF-8");
        return linkedHashMap;
    }

    private Map<String, String> getHeadMaps() {
        Map<String, String> defaultMaps = getDefaultMaps();
        addAgent(defaultMaps);
        return defaultMaps;
    }

    public Map<String, String> addAgent(Map map) {
        if (map == null) {
            return null;
        }
        if (map.containsKey("User-Agent")) {
            return map;
        }
        map.put("User-Agent", xpp.e(this.mContext));
        return map;
    }

    public Result doRestClientProcessTask(xmq xmqVar, String str) throws xmv, xmw, IOException, xmr, IllegalArgumentException {
        RestClient restClientE = xmu.e(this.mUrl, this.mContext);
        if (restClientE == null) {
            xnd.d(TAG, "restClient is null", true);
            throw new xmr("restClient is null");
        }
        xmqVar.c(" |before open https connection:" + System.currentTimeMillis());
        Submit submit = getSubmit(xmqVar, restClientE, str);
        if (submit == null) {
            xnd.d(TAG, "submit is null", true);
            throw new xmv();
        }
        Response responseExecute = submit.execute();
        if (responseExecute == null) {
            xnd.d(TAG, "response is null", true);
            throw new xmw();
        }
        xmqVar.c(" |after open https connection:" + System.currentTimeMillis());
        if (responseExecute.isOK()) {
            xmqVar.c(" |before read Response data:" + System.currentTimeMillis());
            Result resultHandleSucceedResult = handleSucceedResult((String) responseExecute.getBody());
            xmqVar.c(" |after handle Response data:" + System.currentTimeMillis());
            return resultHandleSucceedResult;
        }
        return handleFailResult(responseExecute.getCode(), responseExecute.getMessage(), responseExecute);
    }

    protected Submit getSubmit(xmq xmqVar, RestClient restClient, String str) {
        int i = this.mRequestType;
        if (i == 1) {
            xmqVar.c(" |prepare RestClientConstants.GET:" + System.currentTimeMillis());
            Submit<String> submitExecuteRestClientRequest = ((StringGetRestClientService) restClient.create(StringGetRestClientService.class)).executeRestClientRequest(this.headMaps, this.mUrl, this.requestMaps);
            xmqVar.c(" |end RestClientConstants.GET: and submit " + System.currentTimeMillis());
            return submitExecuteRestClientRequest;
        }
        if (i == 3) {
            xmqVar.c(" |prepare RestClientConstants.DELETE:" + System.currentTimeMillis());
            Submit<String> submitExecuteRestClientRequest2 = ((StringDeleteRestClientService) restClient.create(StringDeleteRestClientService.class)).executeRestClientRequest(this.headMaps, this.mUrl, this.requestMaps);
            xmqVar.c(" |end RestClientConstants.DELETE: and submit " + System.currentTimeMillis());
            return submitExecuteRestClientRequest2;
        }
        xmqVar.c(" |prepare post:" + System.currentTimeMillis());
        StringRestClientService stringRestClientService = (StringRestClientService) restClient.create(StringRestClientService.class);
        if (str == null) {
            str = "";
        }
        Map<String, String> map = this.headMaps;
        Submit<String> submitExecuteRestClientRequest3 = stringRestClientService.executeRestClientRequest((map == null || map.isEmpty()) ? getHeadMaps() : this.headMaps, this.mUrl, str);
        xmqVar.c(" | post get submit:" + System.currentTimeMillis());
        return submitExecuteRestClientRequest3;
    }
}
