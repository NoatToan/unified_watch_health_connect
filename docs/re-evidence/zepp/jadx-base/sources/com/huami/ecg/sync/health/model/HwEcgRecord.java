package com.huami.ecg.sync.health.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/huami/ecg/sync/health/model/HwEcgRecord;", "", "", "", "value", "", "setValue", "", "a", LogUtil.I, "getHr", "()I", "setHr", "(I)V", Constants.DATA_KEY_HR, "b", "getAfib", "setAfib", "afib", "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class HwEcgRecord {
    public static final int AFIB = 1;
    public static final int FF_CMD = 255;
    public static final int HRV_OVER_120 = 6;
    public static final int NOISY = 7;
    public static final int NORMAL = 2;
    public static final int NOT_DO_CALCU = 0;
    public static final int REJECT_BY_ALGO = 3;
    public static final int SUSPECTED_AFIB = 4;
    public static final int UNDEFINE = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int hr = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int afib = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "{hr:" + HwEcgRecord.this.getHr() + ",afib:" + HwEcgRecord.this.getAfib() + '}';
        }
    }

    public final int getAfib() {
        return this.afib;
    }

    public final int getHr() {
        return this.hr;
    }

    public final void setAfib(int i) {
        this.afib = i;
    }

    public final void setHr(int i) {
        this.hr = i;
    }

    public final boolean setValue(@Nullable List<Byte> value) {
        if ((value == null || value.isEmpty()) || value.size() < 2) {
            return false;
        }
        this.hr = value.get(0).byteValue() & 255;
        this.afib = value.get(1).byteValue() & 255;
        HMLog.info("HwEcgRecord", new a());
        return true;
    }
}
