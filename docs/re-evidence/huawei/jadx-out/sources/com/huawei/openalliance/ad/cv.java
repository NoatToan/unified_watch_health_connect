package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.inner.FenceData;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.constant.MzImpCannotReportInfo;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.ShakeClickReportInfo;
import com.huawei.openalliance.ad.inter.data.SwipeClickReportInfo;
import defpackage.axg;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface cv {
    void a(int i, float f, String str, String str2);

    void a(int i, ContentRecord contentRecord);

    void a(int i, Integer num, Integer num2);

    void a(int i, String str, String str2, String str3, ContentRecord contentRecord, String str4);

    void a(axg axgVar);

    void a(com.huawei.openalliance.ad.analysis.a aVar, int i, String str, String str2);

    void a(com.huawei.openalliance.ad.analysis.e eVar);

    void a(ContentRecord contentRecord, int i, int i2);

    void a(ContentRecord contentRecord, int i, int i2, String str);

    void a(ContentRecord contentRecord, long j, long j2);

    void a(ContentRecord contentRecord, long j, long j2, com.huawei.openalliance.ad.analysis.a aVar);

    void a(ContentRecord contentRecord, MzImpCannotReportInfo mzImpCannotReportInfo);

    void a(ContentRecord contentRecord, ShakeClickReportInfo shakeClickReportInfo);

    void a(ContentRecord contentRecord, SwipeClickReportInfo swipeClickReportInfo);

    void a(ContentRecord contentRecord, String str);

    void a(ContentRecord contentRecord, String str, com.huawei.openalliance.ad.analysis.a aVar);

    void a(sn snVar);

    void a(com.huawei.openalliance.ad.utils.dcservice.c cVar, String str);

    void a(String str);

    void a(String str, int i, int i2, int i3, String str2);

    void a(String str, int i, ContentRecord contentRecord);

    void a(String str, Integer num, String str2, ContentRecord contentRecord, boolean z);

    void a(String str, String str2, DelayInfo delayInfo, int i, int i2);

    void a(String str, String str2, ContentRecord contentRecord);

    void a(String str, List<String> list, List<String> list2, Map<String, String> map, String str2);

    void a(String str, boolean z, int i, boolean z2, boolean z3, boolean z4);

    void a(Throwable th);

    void a(List<ContentRecord> list);

    void a(boolean z, FenceData fenceData);

    void b(ContentRecord contentRecord, int i);

    void b(ContentRecord contentRecord, String str);

    void b(ContentRecord contentRecord, String str, String str2);

    void b(String str);

    void b(String str, String str2, ContentRecord contentRecord);

    void b(String str, String str2, String str3);

    void d(ContentRecord contentRecord);

    void d(ContentRecord contentRecord, int i);
}
