package com.huawei.hianalytics.visual;

import com.huawei.hianalytics.core.transport.TransportHandlerFactory;
import com.huawei.hianalytics.core.transport.net.Response;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes33.dex */
public abstract class b1 {
    public static String a(String str, String str2, String str3) {
        Response responseExecute = TransportHandlerFactory.create(str2, null, str.getBytes(StandardCharsets.UTF_8), 1).execute(str3);
        return responseExecute.getHttpCode() != 200 ? "" : responseExecute.getContent();
    }
}
