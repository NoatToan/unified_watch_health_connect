package com.huami.healthlabel.healthlabelmanager.adapter;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.utils.UtilsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0005\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelEntity;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "", "getItemType", "a", LogUtil.I, "myItemType", "b", "getLabelId", "()I", "setLabelId", "(I)V", "labelId", "", "c", "Ljava/lang/String;", "getLabelText", "()Ljava/lang/String;", "setLabelText", "(Ljava/lang/String;)V", "labelText", GoogleApiAvailabilityLight.a, "getLabelColor", "setLabelColor", "labelColor", "", "e", "Z", "isShow", "()Z", "setShow", "(Z)V", "", "f", "J", "getSort", "()J", "setSort", "(J)V", "sort", "<init>", "Companion", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelEntity implements MultiItemEntity {
    public static final int TYPE_IN_HOME = 1;
    public static final int TYPE_IN_HOME_LABEL = 2;
    public static final int TYPE_NOT_IN_HOME = 3;
    public static final int TYPE_NOT_IN_HOME_LABEL = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int myItemType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int labelId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private String labelText = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String labelColor = "#FFFFFF";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isShow = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long sort = -UtilsKt.getTimeSecond();

    public HealthLabelEntity(int i) {
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

    public final int getLabelId() {
        return this.labelId;
    }

    @NotNull
    public final String getLabelText() {
        return this.labelText;
    }

    public final long getSort() {
        return this.sort;
    }

    /* JADX INFO: renamed from: isShow, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    public final void setLabelColor(@NotNull String str) {
        this.labelColor = str;
    }

    public final void setLabelId(int i) {
        this.labelId = i;
    }

    public final void setLabelText(@NotNull String str) {
        this.labelText = str;
    }

    public final void setShow(boolean z) {
        this.isShow = z;
    }

    public final void setSort(long j) {
        this.sort = j;
    }
}
