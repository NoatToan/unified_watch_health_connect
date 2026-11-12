package com.xiaomi.fitness.sport.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport/bean/LocalSportBean;", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "<init>", "()V", "localTitle", "", "getLocalTitle", "()Ljava/lang/String;", "setLocalTitle", "(Ljava/lang/String;)V", "localSource", "getLocalSource", "setLocalSource", "backResource", "", "getBackResource", "()I", "setBackResource", "(I)V", "tag", "getTag", "setTag", "type", "getType", "setType", "model", "getModel", "setModel", "isEco", "", "()Z", "setEco", "(Z)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalSportBean extends BaseSportItemBean {
    private int backResource;
    private boolean isEco;

    @NotNull
    private String localTitle = "";

    @NotNull
    private String localSource = "";

    @NotNull
    private String tag = "";

    @NotNull
    private String type = "";

    @NotNull
    private String model = "";

    public final int getBackResource() {
        return this.backResource;
    }

    @NotNull
    public final String getLocalSource() {
        return this.localSource;
    }

    @NotNull
    public final String getLocalTitle() {
        return this.localTitle;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isEco, reason: from getter */
    public final boolean getIsEco() {
        return this.isEco;
    }

    public final void setBackResource(int i) {
        this.backResource = i;
    }

    public final void setEco(boolean z) {
        this.isEco = z;
    }

    public final void setLocalSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localSource = str;
    }

    public final void setLocalTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localTitle = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }
}
