package androidx.camera.core.impl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class MetadataHolderService extends Service {
    private MetadataHolderService() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
