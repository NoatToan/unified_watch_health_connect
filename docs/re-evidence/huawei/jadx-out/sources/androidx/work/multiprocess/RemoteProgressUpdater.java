package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ProgressUpdater;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteProgressUpdater implements ProgressUpdater {
    @Override // androidx.work.ProgressUpdater
    public ListenableFuture<Void> updateProgress(Context context, UUID uuid, Data data) {
        return RemoteWorkManager.getInstance(context).setProgress(uuid, data);
    }
}
