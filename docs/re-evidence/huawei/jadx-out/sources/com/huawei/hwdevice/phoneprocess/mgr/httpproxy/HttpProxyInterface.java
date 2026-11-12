package com.huawei.hwdevice.phoneprocess.mgr.httpproxy;

import defpackage.oeq;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface HttpProxyInterface {
    void delete(String str, Map<String, String> map, com.huawei.networkclient.ResultCallback<oeq> resultCallback);

    void get(String str, Map<String, String> map, Map<String, String> map2, com.huawei.networkclient.ResultCallback<oeq> resultCallback);

    void post(String str, Map<String, String> map, String str2, com.huawei.networkclient.ResultCallback<oeq> resultCallback);

    void put(String str, Map<String, String> map, String str2, com.huawei.networkclient.ResultCallback<oeq> resultCallback);
}
