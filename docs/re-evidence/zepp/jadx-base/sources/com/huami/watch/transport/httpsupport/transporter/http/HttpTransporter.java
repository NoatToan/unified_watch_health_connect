package com.huami.watch.transport.httpsupport.transporter.http;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.global.PublicParamsBuilder;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.model.DataUtils;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes9.dex */
public class HttpTransporter {
    private static final MediaType d = MediaType.parse("application/json; charset=utf-8");
    private OkHttpClient a;
    private AtomicBoolean b = new AtomicBoolean(false);
    private PublicParamsBuilder c;

    public class a extends Request.Builder {
        public a() {
        }

        @Override // com.squareup.okhttp.Request.Builder
        public Request.Builder addHeader(String str, String str2) {
            HttpTransporter.this.d(str, str2);
            return super.addHeader(str, str2);
        }

        @Override // com.squareup.okhttp.Request.Builder
        public Request.Builder header(String str, String str2) {
            HttpTransporter.this.d(str, str2);
            return super.header(str, str2);
        }

        @Override // com.squareup.okhttp.Request.Builder
        public Request.Builder removeHeader(String str) {
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "HEADER OUT ====  for : " + hashCode() + " with : [" + str + "]");
            if (GlobalDefine.DEBUG_HTTP) {
                Log.i(GlobalDefine.TAG_HTTP, "HEADER OUE ====  for : " + hashCode() + " with : [" + str + "]");
            }
            return super.removeHeader(str);
        }
    }

    private void b(Context context, DataItem dataItem, Request.Builder builder) {
        Iterator<String> itRetrieveAllHeaderKeys = dataItem.retrieveAllHeaderKeys();
        if (itRetrieveAllHeaderKeys == null) {
            return;
        }
        while (itRetrieveAllHeaderKeys.hasNext()) {
            String next = itRetrieveAllHeaderKeys.next();
            String headerValByKey = dataItem.getHeaderValByKey(next);
            if (GlobalDefine.DEBUG_COMPANION) {
                Log.i(GlobalDefine.TAG_COMPANION, "Auto Fill Header , [" + next + SearchCriteria.EQ + headerValByKey + "]");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "Auto Fill Header , [" + next + SearchCriteria.EQ + headerValByKey + "]");
            try {
                builder.addHeader(next, headerValByKey);
            } catch (Exception e) {
                e.printStackTrace();
                if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, "HEADER : [" + next + SearchCriteria.EQ + headerValByKey + "]  is ILLEGAL");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "HEADER : [" + next + SearchCriteria.EQ + headerValByKey + "]  is ILLEGAL");
            }
        }
        if (GlobalDefine.DEBUG_COMPANION) {
            Log.i(GlobalDefine.TAG_COMPANION, "Auto Fill Header end .");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "Auto Fill Header end .");
    }

    private DataItem c(Context context, DataItem dataItem, Response response) {
        DataItem dataItem2;
        synchronized (this) {
            dataItem2 = new DataItem();
            dataItem2.setUrl(dataItem.getUrl());
            dataItem2.setFlags(dataItem.getFlags());
            dataItem2.setAction(dataItem.getAction());
            dataItem2.setIdentifier(dataItem.getIdentifier());
            dataItem2.setMethod(dataItem.getMethod());
            dataItem2.setOwner(dataItem.getOwner());
            if (response == null || response.code() != 200) {
                dataItem2.setData(dataItem.getData());
                dataItem2.setExtraData(dataItem.getExtraData().toString());
                dataItem2.setCode(response == null ? -1 : response.code());
                dataItem2.setState(4);
            } else {
                dataItem2.setCode(response.code());
                dataItem2.setState(0);
                try {
                    String strString = response.body().string();
                    dataItem2.setData(strString);
                    TrafficStasis.getInstance(context).appendChannelDownload(dataItem.getOwner(), strString.getBytes());
                    dataItem2.setUrl("");
                    if (dataItem.hasFlag(64)) {
                        dataItem.getExtraData().remove(DataUtils.DataItemKey.KEY_EXTRA_HEADER);
                        dataItem2.setExtraData(dataItem.getExtraData().toString());
                    } else {
                        dataItem2.addExtraPair("target", dataItem.trackWho());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return dataItem2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "HEADER In ====  for : " + hashCode() + " with : [" + str + " , " + str2 + "]");
        if (GlobalDefine.DEBUG_HTTP) {
            Log.i(GlobalDefine.TAG_HTTP, "HEADER In ====  for : " + hashCode() + " with : [" + str + " , " + str2 + "]");
        }
    }

    public DataItem get(Context context, DataItem dataItem) {
        String url = dataItem.getUrl();
        Request.Builder builder = new Request.Builder();
        PublicParamsBuilder publicParamsBuilder = this.c;
        if (publicParamsBuilder != null) {
            String strCompleteURL = publicParamsBuilder.completeURL(context, url);
            if (!TextUtils.isEmpty(strCompleteURL)) {
                url = strCompleteURL;
            }
            this.c.fillPublicHeader(context, dataItem, builder);
        }
        builder.url(url);
        if (dataItem.hasHeader() && (dataItem.getFlags() & 16) != 0) {
            b(context, dataItem, builder);
        }
        Request requestBuild = builder.build();
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "Request Info : " + requestBuild.toString() + " , " + requestBuild.hashCode());
        Map<String, List<String>> multimap = requestBuild.headers().toMultimap();
        if (GlobalDefine.DEBUG_HTTP) {
            Log.i(GlobalDefine.TAG_HTTP, "HEADER INFO ====  for " + requestBuild.hashCode() + " BEGIN>>");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "HEADER INFO ====  for " + requestBuild.hashCode() + " BEGIN>>");
        for (String str : multimap.keySet()) {
            for (String str2 : multimap.get(str)) {
                if (GlobalDefine.DEBUG_HTTP) {
                    Log.i(GlobalDefine.TAG_HTTP, "[" + str + ":" + str2 + "]");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "[" + str + ":" + str2 + "]");
                multimap = multimap;
            }
        }
        if (GlobalDefine.DEBUG_HTTP) {
            Log.i(GlobalDefine.TAG_HTTP, "HEADER INDO ====  for " + requestBuild.hashCode() + " END<<");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "HEADER INDO ====  for " + requestBuild.hashCode() + " END<<");
        Response responseExecute = null;
        try {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "HTTP 请求  开始请求x: " + dataItem.getIdentifier() + "  who: " + dataItem.trackWho());
            TrafficStasis.getInstance(context).appendChannelUpload(dataItem.getOwner(), requestBuild.headers().toString().getBytes(), dataItem.getData().getBytes());
            responseExecute = this.a.newCall(requestBuild).execute();
            if (responseExecute != null && responseExecute.code() != 200) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "HTTP Response  :" + responseExecute.toString());
            }
        } catch (Exception e) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "HTTP Response  : Exception:" + e.toString());
            dataItem.setState(4);
            if (GlobalDefine.DEBUG_COMPANION) {
                Log.i(GlobalDefine.TAG_COMPANION, dataItem.getIdentifier() + " --> 00 上传并没有成功，网络问题？进行下一步处理...", e);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, dataItem.getIdentifier() + " --> 00 上传并没有成功，网络问题？进行下一步处理...", e);
        }
        return c(context, dataItem, responseExecute);
    }

    public PublicParamsBuilder getPublicParamsBuilder() {
        return this.c;
    }

    public DataItem post(Context context, DataItem dataItem) {
        return post(context, dataItem, d);
    }

    public DataItem post(Context context, DataItem dataItem, MediaType mediaType) {
        String headerValByKey;
        String url = dataItem.getUrl();
        a aVar = new a();
        PublicParamsBuilder publicParamsBuilder = this.c;
        if (publicParamsBuilder != null) {
            String strCompleteURL = publicParamsBuilder.completeURL(context, url);
            if (!TextUtils.isEmpty(strCompleteURL)) {
                url = strCompleteURL;
            }
            this.c.fillPublicHeader(context, dataItem, aVar);
        }
        aVar.url(url);
        Response responseExecute = null;
        if (!dataItem.hasHeader() || (dataItem.getFlags() & 16) == 0) {
            headerValByKey = null;
        } else {
            b(context, dataItem, aVar);
            headerValByKey = dataItem.getHeaderValByKey("Content-Type");
        }
        if (!TextUtils.isEmpty(headerValByKey)) {
            mediaType = MediaType.parse(headerValByKey);
        }
        if (dataItem.getData() != null) {
            String data = dataItem.getData();
            data.getBytes();
            byte[] bArrDecompress = dataItem.hasFlag(8) ? dataItem.decompress(data) : dataItem.removePrefix(data).getBytes();
            try {
                RequestBody requestBodyCreate = RequestBody.create(mediaType, bArrDecompress);
                if (GlobalDefine.DEBUG) {
                    Log.i(GlobalDefine.TAG_COMPANION, "Request Info : " + requestBodyCreate.toString() + " , " + requestBodyCreate.hashCode());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "Request Info : " + requestBodyCreate.toString() + " , " + requestBodyCreate.hashCode());
                aVar.post(requestBodyCreate);
                TrafficStasis.getInstance(context).appendChannelUpload(dataItem.getOwner(), bArrDecompress);
            } catch (Exception e) {
                if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, "在create request body的时候出错！", e);
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "在create request body的时候出错！" + dataItem.toShortString());
                return null;
            }
        }
        Request requestBuild = aVar.build();
        TrafficStasis.getInstance(context).appendChannelUpload(dataItem.getOwner(), requestBuild.urlString().getBytes(), requestBuild.headers().toString().getBytes());
        try {
            responseExecute = this.a.newCall(requestBuild).execute();
            if (responseExecute != null && responseExecute.code() != 200) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "HTTP Response  :" + responseExecute.toString());
            }
        } catch (Exception e2) {
            dataItem.setState(4);
            if (GlobalDefine.DEBUG_COMPANION) {
                Log.i(GlobalDefine.TAG_COMPANION, dataItem.getIdentifier() + " --> 上传并没有成功，网络问题？进行下一步处理...", e2);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, dataItem.getIdentifier() + " --> 上传并没有成功，网络问题？进行下一步处理...", e2);
        }
        return c(context, dataItem, responseExecute);
    }

    public DataItem request(Context context, DataItem dataItem, Map<?, ?> map) {
        if (!this.b.get()) {
            synchronized (HttpTransporter.class) {
                if (!this.b.get()) {
                    this.a = new OkHttpClient();
                    this.b.set(true);
                }
            }
        }
        if ("get".equals(dataItem.getMethod())) {
            return get(context, dataItem);
        }
        if (DataItem.HTTP_METHOD_POST.equals(dataItem.getMethod())) {
            return post(context, dataItem);
        }
        return null;
    }

    public void setPublicParamsBuilder(PublicParamsBuilder publicParamsBuilder) {
        this.c = publicParamsBuilder;
    }
}
