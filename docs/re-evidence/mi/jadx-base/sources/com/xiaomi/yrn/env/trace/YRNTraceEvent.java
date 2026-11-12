package com.xiaomi.yrn.env.trace;

import android.text.TextUtils;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import defpackage.zxr;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class YRNTraceEvent implements Serializable {
    private String appName;
    private Object biz;

    /* JADX INFO: renamed from: com, reason: collision with root package name */
    private YRNBundleInfo f14541com;
    private long duration;
    private int errorCode;
    private String msg;

    private YRNTraceEvent(String str, int i, String str2, YRNBundleInfo yRNBundleInfo, Object obj, long j) {
        if (TextUtils.isEmpty(str)) {
            zxr.b("YRN_YRNV3_SDK", "new YRNTraceEvent: appName is Empty ! Please Check ! ");
        }
        this.appName = str;
        this.errorCode = i;
        this.msg = str2;
        this.f14541com = yRNBundleInfo;
        this.biz = obj;
        this.duration = j;
    }

    public static YRNTraceEvent newEvent(String str, int i, String str2, YRNBundleInfo yRNBundleInfo, Object obj, long j) {
        return new YRNTraceEvent(str, i, str2, yRNBundleInfo, obj, j);
    }

    public String getAppName() {
        return this.appName;
    }

    public Object getBiz() {
        Object obj = this.biz;
        return obj instanceof YRNBundleInfo ? ((YRNBundleInfo) obj).m873clone() : obj;
    }

    public YRNBundleInfo getCom() {
        YRNBundleInfo yRNBundleInfo = this.f14541com;
        if (yRNBundleInfo != null) {
            return yRNBundleInfo.m873clone();
        }
        return null;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setBiz(Object obj) {
        this.biz = obj;
    }

    public void setCom(YRNBundleInfo yRNBundleInfo) {
        this.f14541com = yRNBundleInfo;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public String toString() {
        return "{appName='" + this.appName + "',\n errorCode=" + this.errorCode + ",\n msg='" + this.msg + "',\n com=" + this.f14541com + ",\n biz=" + this.biz + ",\n duration=" + this.duration + AbstractJsonLexerKt.END_OBJ;
    }

    public static YRNTraceEvent newEvent(String str, int i, String str2, YRNBundleInfo yRNBundleInfo, Object obj) {
        return newEvent(str, i, str2, yRNBundleInfo, obj, 0L);
    }
}
