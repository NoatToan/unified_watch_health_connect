package com.huami.heartrate.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/huami/heartrate/ui/HistoryViewTypeData;", "", "Lcom/huami/heartrate/ui/ViewType;", "a", "Lcom/huami/heartrate/ui/ViewType;", "getViewType", "()Lcom/huami/heartrate/ui/ViewType;", "viewType", "<init>", "(Lcom/huami/heartrate/ui/ViewType;)V", "Lcom/huami/heartrate/ui/TitleData;", "Lcom/huami/heartrate/ui/ListData;", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public abstract class HistoryViewTypeData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ViewType viewType;

    private HistoryViewTypeData(ViewType viewType) {
        this.viewType = viewType;
    }

    public /* synthetic */ HistoryViewTypeData(ViewType viewType, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewType);
    }

    @NotNull
    public final ViewType getViewType() {
        return this.viewType;
    }
}
