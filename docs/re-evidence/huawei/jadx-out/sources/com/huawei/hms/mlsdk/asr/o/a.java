package com.huawei.hms.mlsdk.asr.o;

import android.os.Bundle;
import com.huawei.hms.mlkit.common.ha.event.BaseInfoGatherEvent;
import com.huawei.hms.mlsdk.common.MLApplication;
import com.huawei.operation.OpAnalyticsConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends BaseInfoGatherEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14397a;
    private int d;
    private int f;
    private int g;
    private int h;
    private int i;
    private String j;
    private String k;
    private boolean m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14398b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f14399c = 0;
    private int e = 0;
    private long l = 0;

    public a(boolean z) {
        this.m = z;
    }

    public final String a() {
        return this.f14397a;
    }

    public final void b(long j) {
        this.f14398b = j;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final void e(int i) {
        this.g = i;
    }

    public final void f(int i) {
        this.f = i;
    }

    public final Long g() {
        return Long.valueOf(this.l);
    }

    @Override // com.huawei.hms.mlkit.common.ha.event.BaseInfoGatherEvent
    public final String getApiName() {
        return "";
    }

    @Override // com.huawei.hms.mlkit.common.ha.event.BaseInfoGatherEvent
    public final Bundle getAppInfo() {
        Bundle bundle = MLApplication.getInstance().toBundle();
        bundle.putString("com.huawei.hms.client.service.name:ml-computer-vision", (this.m ? "ml-computer-voice-realtimetranscription:" : "ml-computer-voice-asr:").concat("3.18.6.304"));
        return bundle;
    }

    @Override // com.huawei.hms.mlkit.common.ha.event.BaseInfoGatherEvent
    public final LinkedHashMap<String, String> getCustomizedData() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("applanguage", this.f14397a);
        long j = this.f14398b;
        linkedHashMap.put("speechStartTime", j == 0 ? "" : String.valueOf(j));
        long j2 = this.f14399c;
        linkedHashMap.put("speechEndTime", j2 == 0 ? "" : String.valueOf(j2));
        int i = this.d;
        linkedHashMap.put("firstWordCost", i == 0 ? "" : String.valueOf(i));
        int i2 = this.e;
        linkedHashMap.put("lastWordCost", i2 == 0 ? "" : String.valueOf(i2));
        int i3 = this.f;
        linkedHashMap.put("voiceStreamTime", i3 == 0 ? "" : String.valueOf(i3));
        int i4 = this.g;
        linkedHashMap.put("uploadVoiceSize", i4 == 0 ? "" : String.valueOf(i4));
        int i5 = this.h;
        linkedHashMap.put(OpAnalyticsConstants.NOTIFICATION_TEXT_LENGTH, i5 == 0 ? "" : String.valueOf(i5));
        int i6 = this.i;
        linkedHashMap.put("chainBuildingDelay", i6 != 0 ? String.valueOf(i6) : "");
        linkedHashMap.put("result", this.j);
        linkedHashMap.put("resultDetail", this.k);
        return linkedHashMap;
    }

    @Override // com.huawei.hms.mlkit.common.ha.event.BaseInfoGatherEvent
    public final String getEventId() {
        return "112001";
    }

    @Override // com.huawei.hms.mlkit.common.ha.event.BaseInfoGatherEvent
    public final String getExtension(String str) {
        return "";
    }

    @Override // com.huawei.hms.mlkit.common.ha.event.BaseInfoGatherEvent
    public final String getModelApkVersion() {
        return "";
    }

    @Override // com.huawei.hms.mlkit.common.ha.event.BaseInfoGatherEvent
    public final String getModuleName() {
        return this.m ? "MLKitRtt" : "MLKitAsr";
    }

    @Override // com.huawei.hms.mlkit.common.ha.event.BaseInfoGatherEvent
    public final String getModuleVersion() {
        return "3.18.6.304";
    }

    public final long h() {
        return this.f14399c;
    }

    public final long i() {
        return this.f14398b;
    }

    public final int j() {
        return this.h;
    }

    public final int k() {
        return this.g;
    }

    public final int l() {
        return this.f;
    }

    public final void a(String str) {
        this.f14397a = str;
    }

    public final void b(int i) {
        this.d = i;
    }

    public final void c(int i) {
        this.e = i;
    }

    public final void d(int i) {
        this.h = i;
    }

    public final String e() {
        return this.j;
    }

    public final String f() {
        return this.k;
    }

    public final void a(long j) {
        this.f14399c = j;
    }

    public final int b() {
        return this.i;
    }

    public final void c(String str) {
        this.k = str;
    }

    public final void a(int i) {
        this.i = i;
    }

    public final void b(String str) {
        this.j = str;
    }

    public final void a(Long l) {
        this.l = l.longValue();
    }
}
