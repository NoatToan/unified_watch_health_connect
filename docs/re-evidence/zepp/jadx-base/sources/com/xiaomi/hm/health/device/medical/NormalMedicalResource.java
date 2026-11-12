package com.xiaomi.hm.health.device.medical;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/medical/NormalMedicalResource;", "Lcom/xiaomi/hm/health/device/medical/MedicalResource;", "", "e", LogUtil.I, "getAtrial_fib_text", "()I", "atrial_fib_text", "f", "getAtrial_fib_summary", "atrial_fib_summary", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class NormalMedicalResource extends MedicalResource {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int atrial_fib_text = R.string.abnormal_heart_beat;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int atrial_fib_summary;

    public NormalMedicalResource() {
        this.atrial_fib_summary = GlobalConfig.get().isBuildMidong() ? R.string.health_detect_atrial_fib_summary : R.string.device_health_atrial_fib_summary;
    }

    @Override // com.xiaomi.hm.health.device.medical.MedicalResource
    public int getAtrial_fib_summary() {
        return this.atrial_fib_summary;
    }

    @Override // com.xiaomi.hm.health.device.medical.MedicalResource
    public int getAtrial_fib_text() {
        return this.atrial_fib_text;
    }
}
