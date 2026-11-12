package com.huami.healthlabel.healthlabelhistory.adapter;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelHistoryEntity;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "", "getItemType", "a", LogUtil.I, "getMyItemType", "()I", "myItemType", "", "b", "Ljava/lang/String;", "getUniqueID", "()Ljava/lang/String;", "setUniqueID", "(Ljava/lang/String;)V", "uniqueID", "", "c", "J", "getMLabelDate", "()J", "setMLabelDate", "(J)V", "mLabelDate", "", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelDayEntity;", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getMDayLabelData", "()Ljava/util/List;", "setMDayLabelData", "(Ljava/util/List;)V", "mDayLabelData", "<init>", "(I)V", "Companion", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelHistoryEntity implements MultiItemEntity {
    public static final int LABEL_LIST = 2;
    public static final int TEXT = 1;
    public static final int TEXT_YEAR_DATE = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int myItemType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long mLabelDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String uniqueID = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<HealthLabelDayEntity> mDayLabelData = new ArrayList();

    public HealthLabelHistoryEntity(int i) {
        this.myItemType = i;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType, reason: from getter */
    public int getMyItemType() {
        return this.myItemType;
    }

    @NotNull
    public final List<HealthLabelDayEntity> getMDayLabelData() {
        return this.mDayLabelData;
    }

    public final long getMLabelDate() {
        return this.mLabelDate;
    }

    public final int getMyItemType() {
        return this.myItemType;
    }

    @NotNull
    public final String getUniqueID() {
        return this.uniqueID;
    }

    public final void setMDayLabelData(@NotNull List<HealthLabelDayEntity> list) {
        this.mDayLabelData = list;
    }

    public final void setMLabelDate(long j) {
        this.mLabelDate = j;
    }

    public final void setUniqueID(@NotNull String str) {
        this.uniqueID = str;
    }
}
