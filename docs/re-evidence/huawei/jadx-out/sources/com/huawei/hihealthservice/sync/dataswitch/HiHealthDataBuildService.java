package com.huawei.hihealthservice.sync.dataswitch;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.samplepoint.SamplePoint;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import defpackage.kym;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface HiHealthDataBuildService {
    List<HiHealthData> build(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail);
}
