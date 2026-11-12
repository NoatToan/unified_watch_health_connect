package com.miui.tsmclientsdk.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.miui.tsmclientsdk.IMiTsmResponse;
import com.miui.tsmclientsdk.OnProgressUpdateListener;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ServiceTask<T extends IInterface> extends AbstractServiceTask<T, IMiTsmResponse> {

    public class IMiTsmResponseImpl extends IMiTsmResponse.Stub {
        private final AbstractServiceTask<T, IMiTsmResponse>.SimpleResponse mSimpleResponse;

        public IMiTsmResponseImpl(ServiceTask serviceTask) {
            this(null);
        }

        @Override // com.miui.tsmclientsdk.IMiTsmResponse
        public String getId() throws RemoteException {
            return this.mSimpleResponse.getId();
        }

        @Override // com.miui.tsmclientsdk.IMiTsmResponse
        public void onError(int i, String str) throws RemoteException {
            this.mSimpleResponse.onError(i, str);
        }

        @Override // com.miui.tsmclientsdk.IMiTsmResponse
        public void onProgress(int i) throws RemoteException {
            this.mSimpleResponse.onProgress(i);
        }

        @Override // com.miui.tsmclientsdk.IMiTsmResponse
        public void onResult(Bundle bundle) throws RemoteException {
            this.mSimpleResponse.onResult(bundle);
        }

        public IMiTsmResponseImpl(String str) {
            this.mSimpleResponse = new AbstractServiceTask.SimpleResponse(str);
        }
    }

    public ServiceTask(Context context) {
        this(context, false);
    }

    public ServiceTask(Context context, boolean z) {
        this(context, z, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclientsdk.internal.AbstractServiceTask
    public IMiTsmResponse getResponse() {
        return new IMiTsmResponseImpl(this.mId);
    }

    public ServiceTask(Context context, boolean z, OnProgressUpdateListener onProgressUpdateListener) {
        this(context, null, z, onProgressUpdateListener, null);
    }

    public ServiceTask(Context context, String str, boolean z, OnProgressUpdateListener onProgressUpdateListener, List<AbstractServiceTask> list) {
        super(context, str, z, onProgressUpdateListener, list);
    }
}
