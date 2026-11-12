package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteForegroundUpdater implements ForegroundUpdater {
    @Override // androidx.work.ForegroundUpdater
    public ListenableFuture<Void> setForegroundAsync(Context context, UUID uuid, ForegroundInfo foregroundInfo) {
        return RemoteWorkManager.getInstance(context).setForegroundAsync(uuid.toString(), foregroundInfo);
    }
}
