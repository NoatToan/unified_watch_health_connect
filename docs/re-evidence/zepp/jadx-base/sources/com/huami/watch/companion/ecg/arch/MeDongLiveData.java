package com.huami.watch.companion.ecg.arch;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import com.huami.watch.util.AppUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0014R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/watch/companion/ecg/arch/MeDongLiveData;", "Landroidx/lifecycle/LiveData;", "", "", "onActive", "Landroid/content/Context;", "a", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class MeDongLiveData extends LiveData<Boolean> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    public MeDongLiveData(@NotNull Context context) {
        this.mContext = context;
    }

    @Override // androidx.p008lifecycle.LiveData
    public void onActive() {
        super.onActive();
        setValue(Boolean.valueOf(AppUtil.isAppExists(this.mContext, "com.huami.midong")));
    }
}
