package com.huawei.hiar.listener;

import com.huawei.hiar.common.FaceHealthCheckState;
import java.util.EventObject;

/* JADX INFO: loaded from: classes33.dex */
public class FaceHealthCheckStateEvent extends EventObject {
    private static final long serialVersionUID = 6806281968676571564L;
    private FaceHealthCheckState mFaceHealthCheckState;

    public FaceHealthCheckState getFaceHealthCheckState() {
        return this.mFaceHealthCheckState;
    }

    public FaceHealthCheckStateEvent(Object obj, FaceHealthCheckState faceHealthCheckState) {
        super(obj);
        this.mFaceHealthCheckState = faceHealthCheckState;
    }
}
