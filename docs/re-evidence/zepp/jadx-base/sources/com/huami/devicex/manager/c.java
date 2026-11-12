package com.huami.devicex.manager;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/devicex/manager/c;", "Lcom/huami/devicex/manager/IScreenUnLockSupporter;", "", "onlySupportMiUI", "a", "Z", "()Z", "<init>", "(Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
final class c implements IScreenUnLockSupporter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean onlySupportMiUI;

    public c(boolean z) {
        this.onlySupportMiUI = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getOnlySupportMiUI() {
        return this.onlySupportMiUI;
    }

    @Override // com.huami.devicex.manager.IScreenUnLockSupporter
    public boolean onlySupportMiUI() {
        return this.onlySupportMiUI;
    }
}
