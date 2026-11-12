package com.huami.sleepassistant.lib.ui.base;

import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/base/FTReleaseLog;", "Lcom/huami/sleepassistant/lib/ui/base/FTLog;", "", "msg", "", GoogleApiAvailabilityLight.a, "v", "e", "i", "a", "Ljava/lang/String;", "_tag", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FTReleaseLog implements FTLog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String _tag = "FTLog";

    @Override // com.huami.sleepassistant.lib.ui.base.FTLog
    public void d(@NotNull String msg) {
        Log.d(this._tag, msg);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.FTLog
    public void e(@NotNull String msg) {
        Log.e(this._tag, msg);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.FTLog
    public void i(@NotNull String msg) {
        Log.i(this._tag, msg);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.FTLog
    public void v(@NotNull String msg) {
        Log.v(this._tag, msg);
    }
}
