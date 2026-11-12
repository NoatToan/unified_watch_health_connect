package com.huawei.agconnect.apms.collect.model.event.network;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.a;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.jih;
import com.huawei.agconnect.apms.k0;
import com.huawei.agconnect.apms.mno;
import com.huawei.agconnect.apms.n0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HttpEvent extends Event {
    private long bytesReceived;
    private long bytesSent;
    private String cdnProvider;
    private int connectFailedTimes;
    private int connectTotalTimes;
    private long contentLength;
    private String contentType;
    private int dnsFailedTimes;
    private JsonArray dnsInfos;
    private int dnsTotalTimes;
    private String domain;
    private String errorMessage;
    private int followUpTimes;
    private String httpMethod;
    private int libType;
    private String nQoETransactionId;
    private String nuwaSampleState;
    private String nuwaSpanId;
    private String nuwaTraceId;
    private String nuwaTraceNeIn;
    private String nuwaTraceNeOut;
    private String nuwaTraceRqIn;
    private String nuwaTraceRqOut;
    private long requestBodyEnd;
    private long requestBodyStart;
    private long requestHeadersEnd;
    private long requestHeadersStart;
    private long responseBodyEnd;
    private long responseBodyStart;
    private long responseHeaderEnd;
    private long responseHeaderStart;
    private String serverIp;
    private String serviceCode;
    private String serviceInteractionId;
    private String serviceSessionId;
    private String serviceTraceId;
    private JsonArray socketInfos;
    private String stackTrace;
    private int statusCode;
    private long totalTime;
    private String url;

    public static class DnsEvent extends CollectableArray {
        private String addressList;
        private long dnsStart;
        private long dnsStop;
        private String domainName;
        private boolean isSuccess;

        public DnsEvent(jih jihVar) {
            this.domainName = jihVar.def();
            this.addressList = jihVar.abc();
            this.dnsStart = jihVar.bcd();
            this.dnsStop = jihVar.cde();
            this.isSuccess = jihVar.efg();
        }

        @Override // com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
        public JsonArray asJsonArray() {
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(k0.abc(this.domainName));
            jsonArray.add(k0.abc(this.addressList));
            mno.abc(this.dnsStart, jsonArray);
            mno.abc(this.dnsStop, jsonArray);
            jsonArray.add(k0.abc(Boolean.valueOf(this.isSuccess)));
            return jsonArray;
        }
    }

    public static class SocketEvent extends CollectableArray {
        private String cipherSuite;
        private long connectEnd;
        private long connectStart;
        private String errorDesc;
        private String httpVersion;
        private String inetaddress;
        private boolean isHttps;
        private boolean isSuccess;
        private long secConnectEnd;
        private long secConnectStart;
        private String tlsVersion;

        public SocketEvent(n0 n0Var) {
            this.inetaddress = n0Var.fgh();
            this.connectEnd = n0Var.bcd();
            this.connectStart = n0Var.cde();
            this.secConnectEnd = n0Var.ghi();
            this.secConnectStart = n0Var.hij();
            this.isHttps = n0Var.jkl();
            this.httpVersion = n0Var.efg();
            this.tlsVersion = n0Var.ijk();
            this.cipherSuite = n0Var.abc();
            this.isSuccess = n0Var.klm();
            this.errorDesc = n0Var.def();
        }

        @Override // com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
        public JsonArray asJsonArray() {
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(k0.abc(this.inetaddress));
            mno.abc(this.connectStart, jsonArray);
            mno.abc(this.connectEnd, jsonArray);
            mno.abc(this.secConnectStart, jsonArray);
            mno.abc(this.secConnectEnd, jsonArray);
            jsonArray.add(k0.abc(Boolean.valueOf(this.isHttps)));
            jsonArray.add(k0.abc(this.httpVersion));
            jsonArray.add(k0.abc(this.tlsVersion));
            jsonArray.add(k0.abc(this.cipherSuite));
            jsonArray.add(k0.abc(Boolean.valueOf(this.isSuccess)));
            jsonArray.add(k0.abc(this.errorDesc));
            return jsonArray;
        }
    }

    public HttpEvent(a aVar) {
        this.nQoETransactionId = "";
        this.nuwaTraceNeIn = "";
        this.nuwaTraceNeOut = "";
        this.nuwaSampleState = "0";
        this.nuwaTraceRqIn = "";
        this.nuwaTraceRqOut = "";
        this.timestamp = aVar.nml();
        this.eventName = EventType.NATIVE_HTTP;
        this.url = aVar.kji();
        this.httpMethod = aVar.nop();
        this.totalTime = aVar.lkj();
        this.statusCode = aVar.mlk();
        this.bytesReceived = aVar.abc();
        this.bytesSent = aVar.bcd();
        this.contentType = aVar.ghi();
        this.contentLength = aVar.fgh();
        this.errorMessage = aVar.lmn();
        RuntimeEnvInformation runtimeEnvInformation = Agent.getRuntimeEnvInformation();
        this.runtimeEnvInformation = runtimeEnvInformation;
        runtimeEnvInformation.setSessionArray(aVar.qpo());
        this.domain = aVar.klm();
        this.followUpTimes = aVar.mno();
        this.serverIp = aVar.vut();
        this.dnsInfos = copyDnsInfoToEventList(aVar.ijk());
        this.dnsFailedTimes = aVar.hij();
        this.dnsTotalTimes = aVar.jkl();
        this.socketInfos = copySocketInfoToEventList(aVar.pon());
        this.connectFailedTimes = aVar.def();
        this.connectTotalTimes = aVar.efg();
        this.requestHeadersStart = aVar.zab();
        this.requestHeadersEnd = aVar.yza();
        this.requestBodyStart = aVar.xyz();
        this.requestBodyEnd = aVar.wxy();
        this.responseHeaderStart = aVar.wvu();
        this.responseHeaderEnd = aVar.xwv();
        this.responseBodyStart = aVar.yxw();
        this.responseBodyEnd = aVar.zyx();
        this.stackTrace = aVar.onm();
        this.errorMessage = aVar.lmn();
        this.libType = aVar.opq();
        this.cdnProvider = aVar.cde();
        this.serviceCode = aVar.uts();
        this.serviceInteractionId = aVar.tsr();
        this.serviceSessionId = aVar.srq();
        this.serviceTraceId = aVar.rqp();
        this.nuwaTraceId = aVar.rst();
        this.nuwaSpanId = aVar.qrs();
        this.nuwaTraceNeIn = aVar.stu();
        this.nuwaTraceNeOut = aVar.tuv();
        this.nuwaSampleState = aVar.pqr();
        this.nuwaTraceRqIn = aVar.uvw();
        this.nuwaTraceRqOut = aVar.vwx();
    }

    private JsonArray copyDnsInfoToEventList(List<jih> list) {
        if (list == null) {
            return new JsonArray();
        }
        int size = list.size();
        JsonArray jsonArray = new JsonArray();
        for (int i = 0; i < size; i++) {
            jsonArray.add(new DnsEvent(list.get(i)).asJson());
        }
        return jsonArray;
    }

    private JsonArray copySocketInfoToEventList(List<n0> list) {
        if (list == null) {
            return new JsonArray();
        }
        int size = list.size();
        JsonArray jsonArray = new JsonArray();
        for (int i = 0; i < size; i++) {
            jsonArray.add(new SocketEvent(list.get(i)).asJson());
        }
        return jsonArray;
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
    public JsonArray asJsonArray() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(this.runtimeEnvInformation.asJsonArray());
        mno.abc(this.timestamp, jsonArray);
        jsonArray.add(k0.abc(this.url));
        jsonArray.add(k0.abc(Integer.valueOf(this.libType)));
        jsonArray.add(k0.abc(this.domain));
        jsonArray.add(k0.abc(this.cdnProvider));
        jsonArray.add(k0.abc(this.serverIp));
        jsonArray.add(k0.abc(this.httpMethod));
        jsonArray.add(k0.abc(this.contentType));
        mno.abc(this.contentLength, jsonArray);
        jsonArray.add(k0.abc(Integer.valueOf(this.statusCode)));
        jsonArray.add(k0.abc(this.serviceCode));
        mno.abc(this.totalTime, jsonArray);
        mno.abc(this.requestHeadersStart, jsonArray);
        mno.abc(this.requestHeadersEnd, jsonArray);
        mno.abc(this.requestBodyStart, jsonArray);
        mno.abc(this.requestBodyEnd, jsonArray);
        mno.abc(this.bytesSent, jsonArray);
        mno.abc(this.responseHeaderStart, jsonArray);
        mno.abc(this.responseHeaderEnd, jsonArray);
        mno.abc(this.responseBodyStart, jsonArray);
        mno.abc(this.responseBodyEnd, jsonArray);
        mno.abc(this.bytesReceived, jsonArray);
        jsonArray.add(k0.abc(Integer.valueOf(this.followUpTimes)));
        jsonArray.add(k0.abc(Integer.valueOf(this.dnsFailedTimes)));
        jsonArray.add(k0.abc(Integer.valueOf(this.dnsTotalTimes)));
        jsonArray.add(this.dnsInfos);
        jsonArray.add(k0.abc(Integer.valueOf(this.connectFailedTimes)));
        jsonArray.add(k0.abc(Integer.valueOf(this.connectTotalTimes)));
        jsonArray.add(this.socketInfos);
        jsonArray.add(k0.abc(this.errorMessage));
        jsonArray.add(k0.abc(this.stackTrace));
        jsonArray.add(k0.abc(this.nQoETransactionId));
        jsonArray.add(k0.abc(this.serviceSessionId));
        jsonArray.add(k0.abc(this.serviceInteractionId));
        jsonArray.add(k0.abc(this.serviceTraceId));
        jsonArray.add(k0.abc(this.nuwaTraceId));
        jsonArray.add(k0.abc(this.nuwaSpanId));
        jsonArray.add(k0.abc(this.nuwaTraceNeIn));
        jsonArray.add(k0.abc(this.nuwaTraceNeOut));
        jsonArray.add(k0.abc(this.nuwaSampleState));
        jsonArray.add(k0.abc(this.nuwaTraceRqIn));
        jsonArray.add(k0.abc(this.nuwaTraceRqOut));
        return jsonArray;
    }

    public String getUrl() {
        return this.url;
    }

    public void setNQoETransactionId(String str) {
        this.nQoETransactionId = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public HttpEvent(a aVar, String str) {
        this(aVar);
        if (TextUtils.isEmpty(this.stackTrace)) {
            this.stackTrace = str;
        }
    }
}
