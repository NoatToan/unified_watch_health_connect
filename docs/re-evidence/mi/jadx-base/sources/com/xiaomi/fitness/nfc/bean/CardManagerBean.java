package com.xiaomi.fitness.nfc.bean;

import com.miui.tsmclient.net.TSMAuthContants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/CardManagerBean;", "", TSMAuthContants.PARAM_CARD_CATEGORY, "", "<init>", "(I)V", "getCardCategory", "()I", "setCardCategory", "list", "", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardManagerBean {
    public static final int sTypeCar = 2;
    public static final int sTypeDoor = 1;
    public static final int sTypeTrans = 0;
    public static final int sTypeYoYo = 3;
    private int cardCategory;

    @NotNull
    private List<CardWrapper> list = new ArrayList();

    public CardManagerBean(int i) {
        this.cardCategory = i;
    }

    public final int getCardCategory() {
        return this.cardCategory;
    }

    @NotNull
    public final List<CardWrapper> getList() {
        return this.list;
    }

    public final void setCardCategory(int i) {
        this.cardCategory = i;
    }

    public final void setList(@NotNull List<CardWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }
}
