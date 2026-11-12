package com.huawei.health.h5pro.jsbridge.system.media;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.huawei.health.h5pro.utils.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProMediaScanner {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaScannerConnection f6818c;

    public interface OnScanFileCallback extends MediaScannerConnection.OnScanCompletedListener {
        void onScanFailure(String str);
    }

    public void disconnect() {
        MediaScannerConnection mediaScannerConnection = this.f6818c;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.disconnect();
        }
    }

    public void scanFile(Context context, final String str, final String[] strArr, final OnScanFileCallback onScanFileCallback) {
        final int[] iArr = {0};
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection((Context) new WeakReference(context).get(), new MediaScannerConnection.MediaScannerConnectionClient() { // from class: com.huawei.health.h5pro.jsbridge.system.media.H5ProMediaScanner.3
            private void d(String str2, String str3) {
                if (H5ProMediaScanner.this.f6818c.isConnected()) {
                    H5ProMediaScanner.this.f6818c.scanFile(str2, str3);
                }
            }

            @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
            public void onMediaScannerConnected() {
                LogUtil.i("H5ProMediaScanner", "scanFile: onMediaScannerConnected");
                try {
                    if (strArr.length == 0) {
                        d(str, null);
                        return;
                    }
                    int i = 0;
                    while (true) {
                        String[] strArr2 = strArr;
                        if (i >= strArr2.length) {
                            return;
                        }
                        d(str, strArr2[i]);
                        i++;
                    }
                } catch (IllegalStateException e) {
                    LogUtil.w("H5ProMediaScanner", "onMediaScannerConnected: exception -> " + e.getMessage());
                }
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str2, Uri uri) {
                int[] iArr2 = iArr;
                int i = iArr2[0] + 1;
                iArr2[0] = i;
                if (i >= strArr.length) {
                    onScanFileCallback.onScanCompleted(str2, uri);
                    H5ProMediaScanner.this.f6818c.disconnect();
                    LogUtil.i("H5ProMediaScanner", "scanFile: onScanCompleted");
                }
            }
        });
        this.f6818c = mediaScannerConnection;
        mediaScannerConnection.connect();
    }
}
