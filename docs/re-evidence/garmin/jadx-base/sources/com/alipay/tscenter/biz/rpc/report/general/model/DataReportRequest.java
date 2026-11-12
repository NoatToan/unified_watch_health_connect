package com.alipay.tscenter.biz.rpc.report.general.model;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class DataReportRequest implements Serializable {
    public Map<String, String> bizData;
    public String bizType;
    public Map<String, String> deviceData;

    /* JADX INFO: renamed from: os, reason: collision with root package name */
    public String f28435os;
    public String rpcVersion;
}
