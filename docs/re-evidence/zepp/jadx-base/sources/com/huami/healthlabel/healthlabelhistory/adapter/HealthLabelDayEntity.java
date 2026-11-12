package com.huami.healthlabel.healthlabelhistory.adapter;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0005\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\u0014¨\u0006("}, d2 = {"Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelDayEntity;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "", "getItemType", "a", LogUtil.I, "getMyItemType", "()I", "myItemType", "", "b", "J", "getMLabelDate", "()J", "setMLabelDate", "(J)V", "mLabelDate", "c", "getLabelId", "setLabelId", "(I)V", "labelId", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getLabelText", "()Ljava/lang/String;", "setLabelText", "(Ljava/lang/String;)V", "labelText", "e", "getLabelColor", "setLabelColor", "labelColor", "f", "getLabelCount", "setLabelCount", "labelCount", "<init>", "Companion", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelDayEntity implements MultiItemEntity {
    public static final int LABEL = 2;
    public static final int TITLE = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int myItemType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long mLabelDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int labelId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String labelText = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private String labelColor = "#FFFFFF";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int labelCount;

    public HealthLabelDayEntity(int i) {
        this.myItemType = i;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType, reason: from getter */
    public int getMyItemType() {
        return this.myItemType;
    }

    @NotNull
    public final String getLabelColor() {
        return this.labelColor;
    }

    public final int getLabelCount() {
        return this.labelCount;
    }

    public final int getLabelId() {
        return this.labelId;
    }

    @NotNull
    public final String getLabelText() {
        return this.labelText;
    }

    public final long getMLabelDate() {
        return this.mLabelDate;
    }

    public final int getMyItemType() {
        return this.myItemType;
    }

    public final void setLabelColor(@NotNull String str) {
        this.labelColor = str;
    }

    public final void setLabelCount(int i) {
        this.labelCount = i;
    }

    public final void setLabelId(int i) {
        this.labelId = i;
    }

    public final void setLabelText(@NotNull String str) {
        this.labelText = str;
    }

    public final void setMLabelDate(long j) {
        this.mLabelDate = j;
    }
}
