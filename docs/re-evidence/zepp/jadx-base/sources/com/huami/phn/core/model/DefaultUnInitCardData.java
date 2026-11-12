package com.huami.phn.core.model;

import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0013\u001a\u00020\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u001e\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/huami/phn/core/model/DefaultUnInitCardData;", "Lcom/huami/phn/core/model/PHNCardData;", "", "getTimestamp", "()J", "timestamp", "Lcom/huami/phn/core/model/PHNCardData$State;", "getState", "()Lcom/huami/phn/core/model/PHNCardData$State;", "state", "Ljava/util/Calendar;", "getStart", "()Ljava/util/Calendar;", "start", "getUpdate", "update", "", "getDailyPercent", "()I", "dailyPercent", "", "getTsbValue", "()F", "tsbValue", "", "getHasPlan", "()Z", "hasPlan", "getFlag", "flag", "isRestDay", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultUnInitCardData extends PHNCardData {
    @Override // com.huami.phn.core.model.PHNCardData
    public int getDailyPercent() {
        return -1;
    }

    @Override // com.huami.phn.core.model.PHNCardData
    public int getFlag() {
        return 0;
    }

    @Override // com.huami.phn.core.model.PHNCardData
    public boolean getHasPlan() {
        return false;
    }

    @Override // com.huami.phn.core.model.PHNCardData
    @NotNull
    public Calendar getStart() {
        return Calendar.getInstance();
    }

    @Override // com.huami.phn.core.model.PHNCardData
    @NotNull
    public PHNCardData.State getState() {
        return PHNCardData.State.UnInit.INSTANCE;
    }

    @Override // com.huami.phn.core.model.PHNCardData
    public long getTimestamp() {
        return 0L;
    }

    @Override // com.huami.phn.core.model.PHNCardData
    public float getTsbValue() {
        return -1.0f;
    }

    @Override // com.huami.phn.core.model.PHNCardData
    @Nullable
    public Calendar getUpdate() {
        return null;
    }

    @Override // com.huami.phn.core.model.PHNCardData
    public boolean isRestDay() {
        return false;
    }
}
