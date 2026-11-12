package com.huami.health.afppg.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/health/afppg/model/AtrialFibrillationEventDay;", "", "", "duration", LogUtil.I, "getDuration", "()I", "setDuration", "(I)V", "", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "atrialFibrillationList", "Ljava/util/List;", "getAtrialFibrillationList", "()Ljava/util/List;", "setAtrialFibrillationList", "(Ljava/util/List;)V", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class AtrialFibrillationEventDay {

    @NotNull
    private List<AtrialFibrillation> atrialFibrillationList = new ArrayList();
    private int duration;

    @NotNull
    public final List<AtrialFibrillation> getAtrialFibrillationList() {
        return this.atrialFibrillationList;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setAtrialFibrillationList(@NotNull List<AtrialFibrillation> list) {
        this.atrialFibrillationList = list;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }
}
