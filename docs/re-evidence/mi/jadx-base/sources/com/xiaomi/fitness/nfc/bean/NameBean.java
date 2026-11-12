package com.xiaomi.fitness.nfc.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/NameBean;", "", "name", "", "isSelected", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "()Z", "setSelected", "(Z)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NameBean {
    private boolean isSelected;

    @NotNull
    private String name;

    public NameBean(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.isSelected = z;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
