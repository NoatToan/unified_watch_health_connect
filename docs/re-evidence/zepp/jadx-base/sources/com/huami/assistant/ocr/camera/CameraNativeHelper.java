package com.huami.assistant.ocr.camera;

import android.content.Context;
import com.huami.assistant.ocr.camera.CameraNativeHelper;
import com.huami.assistant.ocr.idcardquality.IDcardQualityProcess;

/* JADX INFO: loaded from: classes5.dex */
public class CameraNativeHelper {

    public interface CameraNativeInitCallback {
        void onError(int errorCode, Throwable e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(CameraNativeInitCallback cameraNativeInitCallback, String str, Context context) {
        if (IDcardQualityProcess.getLoadSoException() != null) {
            cameraNativeInitCallback.onError(10, IDcardQualityProcess.getLoadSoException());
        } else if (IDcardQualityProcess.init(str) != 0) {
            cameraNativeInitCallback.onError(11, null);
        } else if (IDcardQualityProcess.getInstance().idcardQualityInit(context.getAssets(), "models") != 0) {
            cameraNativeInitCallback.onError(12, null);
        }
    }

    public static void init(final Context ctx, final String token, final CameraNativeInitCallback cb) {
        CameraThreadPool.execute(new Runnable() { // from class: qj0
            @Override // java.lang.Runnable
            public final void run() {
                CameraNativeHelper.b(cb, token, ctx);
            }
        });
    }

    public static void release() {
        IDcardQualityProcess.getInstance().releaseModel();
    }
}
