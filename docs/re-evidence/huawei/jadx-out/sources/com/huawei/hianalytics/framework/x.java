package com.huawei.hianalytics.framework;

import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.framework.config.ICallback;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {
    public static void a(Boolean bool, ICallback iCallback, IStorageHandler iStorageHandler, Event event, int i) {
        try {
            iStorageHandler.insert(event);
        } catch (Exception e) {
            if (iCallback == null) {
                return;
            }
            if (bool.booleanValue()) {
                iCallback.onResult(event.getEvtid(), 402, "storage fail. Cause: " + e.getMessage());
                return;
            }
            iCallback.onResult(event.getEvtid(), 402, "resultCode is " + i + " and storage fail. Cause: " + e.getMessage());
        }
    }

    public static void a(ICallback iCallback, IStorageHandler iStorageHandler, Event event) {
        try {
            iStorageHandler.insert(event);
        } catch (Exception e) {
            if (iCallback == null) {
                return;
            }
            iCallback.onResult(event.getEvtid(), 401, "storage fail. Cause: " + e.getMessage());
        }
    }
}
