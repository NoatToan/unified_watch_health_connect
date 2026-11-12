package com.miui.tsmclient.model;

import com.miui.tsmclient.net.TSMAuthManager;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    protected String mBussinessType = "";
    protected TSMAuthManager mTSMAuthManager = new TSMAuthManager();
    private List<b> mTaskList = new Vector();

    public BaseResponse executeTask(b bVar) {
        synchronized (this.mTaskList) {
            this.mTaskList.add(bVar);
        }
        return bVar.d();
    }

    public void shutDown() {
        synchronized (this.mTaskList) {
            for (int i = 0; i < this.mTaskList.size(); i++) {
                try {
                    this.mTaskList.get(i).h();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.mTaskList.clear();
        }
    }
}
