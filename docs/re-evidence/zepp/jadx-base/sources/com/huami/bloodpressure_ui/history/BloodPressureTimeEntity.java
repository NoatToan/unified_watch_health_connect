package com.huami.bloodpressure_ui.history;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\b\u0001\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/bloodpressure_ui/history/BloodPressureTimeEntity;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "", "getItemType", "itemType", LogUtil.I, "", "mLabelDate", "J", "getMLabelDate", "()J", "setMLabelDate", "(J)V", "", "mDayLabelData", "Ljava/util/List;", "getMDayLabelData", "()Ljava/util/List;", "setMDayLabelData", "(Ljava/util/List;)V", "<init>", "(I)V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureTimeEntity<T> implements MultiItemEntity {
    public static final int DATA_LIST = 2;
    public static final int TEXT = 1;
    public static final int TEXT_YEAR_DATE = 3;
    private final int itemType;

    @NotNull
    private List<? extends T> mDayLabelData = new ArrayList();
    private long mLabelDate;

    public BloodPressureTimeEntity(int i) {
        this.itemType = i;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    @NotNull
    public final List<T> getMDayLabelData() {
        return this.mDayLabelData;
    }

    public final long getMLabelDate() {
        return this.mLabelDate;
    }

    public final void setMDayLabelData(@NotNull List<? extends T> list) {
        this.mDayLabelData = list;
    }

    public final void setMLabelDate(long j) {
        this.mLabelDate = j;
    }
}
