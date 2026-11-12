package com.huami.network.hmnetwork.properties;

import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class HMUserPropertiesAPI {
    private static final String a = "users/%s/properties";

    public static void getProperty(PropertyItem propertyItem, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        if (HMWebUtil.isHuamiSDKLogin()) {
            HMWebUtil.doRequest(HMServerDef.getRestfulUrl(a, HMWebUtil.getUserId()), propertyItem.b(), Support.RequestSupport.GET, z, iHMBasicHttpResponseHandler);
        }
    }

    public static void getRangeProperty(PropertyItem propertyItem, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        if (HMWebUtil.isHuamiSDKLogin()) {
            HMWebUtil.doRequest(HMServerDef.getRestfulUrl(a, HMWebUtil.getUserId()), propertyItem.c(), Support.RequestSupport.GET, z, iHMBasicHttpResponseHandler);
        }
    }

    public static void getWatchBatchProperty(List<PropertyItem> list, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        if (HMWebUtil.isHuamiSDKLogin()) {
            HMWebUtil.doRequest(HMServerDef.getRestfulWatchUrl(a, HMWebUtil.getUserId()), PropertyItem.a(list), Support.RequestSupport.GET, z, iHMBasicHttpResponseHandler);
        }
    }

    public static void postProperty(List<PropertyItem> list, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        if (HMWebUtil.isHuamiSDKLogin()) {
            Set<Object> setD = PropertyItem.d(list);
            if (setD.size() <= 0) {
                return;
            }
            HMWebUtil.doSeparateRequest(HMServerDef.getRestfulUrl(a, HMWebUtil.getUserId()), setD, Support.RequestSupport.POST, true, z, iHMBasicHttpResponseHandler, new HMHttpConfig[0]);
        }
    }

    public static void postProperty(PropertyItem propertyItem, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyItem);
        postProperty(arrayList, z, iHMBasicHttpResponseHandler);
    }
}
