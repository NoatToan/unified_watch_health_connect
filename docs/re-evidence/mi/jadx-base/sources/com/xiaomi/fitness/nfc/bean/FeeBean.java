package com.xiaomi.fitness.nfc.bean;

import com.miui.tsmclient.sesdk.OrderData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/FeeBean;", "", "fee", "Lcom/miui/tsmclient/sesdk/OrderData$Fee;", "isSelected", "", "<init>", "(Lcom/miui/tsmclient/sesdk/OrderData$Fee;Z)V", "getFee", "()Lcom/miui/tsmclient/sesdk/OrderData$Fee;", "()Z", "setSelected", "(Z)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeeBean {

    @NotNull
    private final OrderData.Fee fee;
    private boolean isSelected;

    public FeeBean(@NotNull OrderData.Fee fee, boolean z) {
        Intrinsics.checkNotNullParameter(fee, "fee");
        this.fee = fee;
        this.isSelected = z;
    }

    @NotNull
    public final OrderData.Fee getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public /* synthetic */ FeeBean(OrderData.Fee fee, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fee, (i & 2) != 0 ? false : z);
    }
}
