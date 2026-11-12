package com.huawei.hianalytics.framework;

import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.framework.config.ICallback;
import com.huawei.hianalytics.framework.config.IMandatoryParameters;
import com.huawei.hianalytics.framework.listener.HAEventManager;
import com.huawei.hianalytics.framework.listener.IHAEventListener;
import com.huawei.hianalytics.framework.policy.IStoragePolicy;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11537c;
    public final String d;
    public final ArrayList e;
    public ICallback f;
    public boolean g;

    public y(byte[] bArr, String str, String str2, String str3, ArrayList arrayList) {
        this.f11535a = (byte[]) bArr.clone();
        this.f11536b = str;
        this.f11537c = str3;
        this.d = str2;
        this.e = arrayList;
    }

    public final void a(int i) {
        ArrayList arrayList;
        if ((i == 400 || i == 413) && (arrayList = this.e) != null && arrayList.size() > 0) {
            if (this.e.size() > 100 && !"ha_default_collection".equals(this.f11536b)) {
                g gVarA = j.a(this.f11536b);
                String str = this.d;
                gVarA.e.put(str + "_send_retry_flag", 100);
                return;
            }
            IStorageHandler iStorageHandlerC = j.c(this.f11536b);
            if (iStorageHandlerC != null) {
                HiLog.i("SendTask", "storageHandler delete bad request events, tag: " + this.f11536b + ", type: " + this.d);
                iStorageHandlerC.deleteEvents(this.e);
                IMandatoryParameters iMandatoryParameters = b.e.f11498a;
                if (iMandatoryParameters.isFlashKey() && iStorageHandlerC.readEventsAllSize() == 0) {
                    iMandatoryParameters.refreshKey(EncryptUtil.generateSecureRandomStr(16), 1);
                    iStorageHandlerC.deleteCommonHeaderExAll();
                }
            }
            a();
        }
    }

    public final void a() {
        int iMin;
        IHAEventListener eventListener = HAEventManager.getInstance().getEventListener();
        if (eventListener != null && (iMin = Math.min(5, this.e.size())) > 0) {
            Collections.sort(this.e, new Comparator() { // from class: com.huawei.hianalytics.framework.y$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return y.a((Event) obj, (Event) obj2);
                }
            });
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < iMin; i++) {
                sb.append(((Event) this.e.get(i)).getEvtid());
                sb.append(",");
            }
            eventListener.onEvent(this.f11536b, "$discard_list", sb.substring(0, sb.length() - 1));
        }
    }

    public static /* synthetic */ int a(Event event, Event event2) {
        return event2.getContent().length() - event.getContent().length();
    }

    public final void a(IStorageHandler iStorageHandler, Event event, int i) {
        IStoragePolicy iStoragePolicyD = j.d(this.f11536b);
        if (iStoragePolicyD == null) {
            HiLog.e("SendTask", "storage policy is null. tag: " + this.f11536b + ", type: " + this.d);
            return;
        }
        if (iStoragePolicyD.decide(IStoragePolicy.PolicyType.STORAGE_LENGTH, this.d)) {
            HiLog.e("SendTask", "db file reach max size, tag: " + this.f11536b + ", type: " + this.d);
            iStorageHandler.deleteAll();
            x.a(Boolean.FALSE, this.f, iStorageHandler, event, i);
            return;
        }
        long eventSize = iStorageHandler.readEventSize(this.f11536b);
        if (eventSize == 0) {
            x.a(Boolean.FALSE, this.f, iStorageHandler, event, i);
            return;
        }
        if (eventSize > 5000) {
            HiLog.e("SendTask", "evt size reach max size, tag: " + this.f11536b + ", TYPE: " + this.d);
            iStorageHandler.deleteByTag(this.f11536b);
            x.a(Boolean.FALSE, this.f, iStorageHandler, event, i);
            return;
        }
        x.a(Boolean.FALSE, this.f, iStorageHandler, event, i);
    }
}
