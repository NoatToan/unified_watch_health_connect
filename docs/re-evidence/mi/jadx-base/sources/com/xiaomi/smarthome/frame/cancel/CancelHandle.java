package com.xiaomi.smarthome.frame.cancel;

import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class CancelHandle implements Cancelable {
    private static final String TAG = "CancelHandle";
    private final LinkedList<Cancelable> cancelables = new LinkedList<>();
    private boolean isCancel = false;

    public void add(Cancelable cancelable) {
        synchronized (this.cancelables) {
            if (cancelable != null) {
                try {
                    if (!this.isCancel) {
                        this.cancelables.add(cancelable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.xiaomi.smarthome.frame.cancel.Cancelable
    public void cancel() {
        StringBuilder sb = new StringBuilder();
        sb.append("CancelHandle ");
        sb.append(hashCode());
        sb.append(" release run ");
        sb.append(this.cancelables.size());
        synchronized (this.cancelables) {
            try {
                this.isCancel = true;
                if (this.cancelables.size() == 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.cancelables);
                this.cancelables.clear();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Cancelable) arrayList.get(size)).cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
