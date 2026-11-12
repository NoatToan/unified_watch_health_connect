package com.xiaomi.xms.wearable.ui.appshop.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/model/LoadStatus;", "", "<init>", "()V", "LOADING", "", "LOAD_NO_INTERNET", "LOAD_MORE_NO_INTERNET", "LOADED", "LOADED_NO_MORE", "NO_DATA", "HIDE_EMPTY", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoadStatus {
    public static final int HIDE_EMPTY = 6;

    @NotNull
    public static final LoadStatus INSTANCE = new LoadStatus();
    public static final int LOADED = 3;
    public static final int LOADED_NO_MORE = 4;
    public static final int LOADING = 0;
    public static final int LOAD_MORE_NO_INTERNET = 2;
    public static final int LOAD_NO_INTERNET = 1;
    public static final int NO_DATA = 5;

    private LoadStatus() {
    }
}
