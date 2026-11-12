package com.huami.healthlabel.ui.viewModel;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/healthlabel/ui/viewModel/ManagerLabel;", "Lcom/huami/healthlabel/ui/viewModel/FirstLoad;", "", "a", "Z", "getHasCache", "()Z", "hasCache", "<init>", "(Z)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class ManagerLabel extends FirstLoad {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean hasCache;

    public ManagerLabel(boolean z) {
        super(null);
        this.hasCache = z;
    }

    public final boolean getHasCache() {
        return this.hasCache;
    }
}
