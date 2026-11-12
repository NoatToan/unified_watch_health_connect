package com.ingenic.iwds.slpt;

import android.content.Context;
import android.os.IBinder;
import com.ingenic.iwds.common.api.ServiceManagerContext;

/* JADX INFO: loaded from: classes18.dex */
public class WatchFaceServiceManager extends ServiceManagerContext {

    public class a extends ServiceManagerContext.ServiceClientProxy {
        public a() {
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public IBinder getBinder() {
            return null;
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceConnected(IBinder iBinder) {
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceDisconnected(boolean z) {
        }
    }

    public WatchFaceServiceManager(Context context) {
        super(context);
        this.m_serviceClientProxy = new a();
    }
}
