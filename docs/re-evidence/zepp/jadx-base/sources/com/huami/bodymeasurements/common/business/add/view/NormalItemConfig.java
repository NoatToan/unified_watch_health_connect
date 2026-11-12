package com.huami.bodymeasurements.common.business.add.view;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000ej\u0004\u0018\u0001`\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016¨\u0006 "}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/NormalItemConfig;", "", "", "a", "Ljava/lang/String;", "getItemName", "()Ljava/lang/String;", "setItemName", "(Ljava/lang/String;)V", "itemName", "b", "getItemValue", "setItemValue", "itemValue", "Lkotlin/Function0;", "", "Lcom/huami/bodymeasurements/common/business/add/view/ValueClick;", "c", "Lkotlin/jvm/functions/Function0;", "getValueClick", "()Lkotlin/jvm/functions/Function0;", "setValueClick", "(Lkotlin/jvm/functions/Function0;)V", "valueClick", "", "Lcom/huami/bodymeasurements/common/business/add/view/SaveEnable;", GoogleApiAvailabilityLight.a, "getSaveEnable", "setSaveEnable", "saveEnable", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class NormalItemConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String itemName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String itemValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> valueClick;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function0<Boolean> saveEnable;

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final String getItemValue() {
        return this.itemValue;
    }

    @Nullable
    public final Function0<Boolean> getSaveEnable() {
        return this.saveEnable;
    }

    @Nullable
    public final Function0<Unit> getValueClick() {
        return this.valueClick;
    }

    public final void setItemName(@Nullable String str) {
        this.itemName = str;
    }

    public final void setItemValue(@Nullable String str) {
        this.itemValue = str;
    }

    public final void setSaveEnable(@Nullable Function0<Boolean> function0) {
        this.saveEnable = function0;
    }

    public final void setValueClick(@Nullable Function0<Unit> function0) {
        this.valueClick = function0;
    }
}
