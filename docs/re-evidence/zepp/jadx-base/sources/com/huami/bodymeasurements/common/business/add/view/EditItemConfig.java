package com.huami.bodymeasurements.common.business.add.view;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R6\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u0004\u0018\u0001`\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR6\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 \u0018\u00010\u0016j\u0004\u0018\u0001`!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001e¨\u0006("}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/EditItemConfig;", "", "", "a", "Ljava/lang/String;", "getItemName", "()Ljava/lang/String;", "setItemName", "(Ljava/lang/String;)V", "itemName", "b", "getItemUnit", "setItemUnit", "itemUnit", "", "c", LogUtil.I, "getDigits", "()I", "setDigits", "(I)V", "digits", "Lkotlin/Function1;", "", "Lcom/huami/bodymeasurements/common/business/add/view/CheckContentValid;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "getCheckContentValid", "()Lkotlin/jvm/functions/Function1;", "setCheckContentValid", "(Lkotlin/jvm/functions/Function1;)V", "checkContentValid", "", "Lcom/huami/bodymeasurements/common/business/add/view/InputFinished;", "e", "getInputFinished", "setInputFinished", "inputFinished", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class EditItemConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String itemName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String itemUnit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int digits;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function1<? super String, Boolean> checkContentValid;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function1<? super String, Unit> inputFinished;

    @Nullable
    public final Function1<String, Boolean> getCheckContentValid() {
        return this.checkContentValid;
    }

    public final int getDigits() {
        return this.digits;
    }

    @Nullable
    public final Function1<String, Unit> getInputFinished() {
        return this.inputFinished;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final String getItemUnit() {
        return this.itemUnit;
    }

    public final void setCheckContentValid(@Nullable Function1<? super String, Boolean> function1) {
        this.checkContentValid = function1;
    }

    public final void setDigits(int i) {
        this.digits = i;
    }

    public final void setInputFinished(@Nullable Function1<? super String, Unit> function1) {
        this.inputFinished = function1;
    }

    public final void setItemName(@Nullable String str) {
        this.itemName = str;
    }

    public final void setItemUnit(@Nullable String str) {
        this.itemUnit = str;
    }
}
