package com.xiaomi.fitness.sport.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport/bean/SportLabelBean;", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "label", "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportLabelBean extends BaseSportItemBean {

    @NotNull
    private final String label;

    public SportLabelBean(@NotNull String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }
}
