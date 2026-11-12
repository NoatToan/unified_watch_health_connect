package com.huawei.hianalytics.framework;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.framework.config.ICallback;
import com.huawei.hianalytics.framework.config.IMandatoryParameters;
import com.huawei.hianalytics.framework.datahandler.ReportTask;
import com.huawei.hianalytics.framework.listener.HAEventManager;
import com.huawei.hianalytics.framework.listener.IHAEventListener;
import com.huawei.hianalytics.framework.policy.IStoragePolicy;
import com.huawei.hianalytics.framework.threadpool.TaskThread;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11527c;
    public final String d;
    public final String e;
    public final JSONObject f;
    public final long g;
    public final IMandatoryParameters h = b.e.f11498a;
    public final int i;
    public final int j;
    public boolean k;
    public ICallback l;

    public t(String str, String str2, String str3, JSONObject jSONObject, long j, int i, int i2) {
        this.f11525a = str;
        this.e = str3;
        this.f = jSONObject;
        this.g = j;
        this.d = str2;
        this.i = i;
        this.j = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IHAEventListener eventListener;
        IHAEventListener eventListener2;
        JSONObject jSONObject;
        Event event = new Event();
        event.setServicetag(this.f11525a);
        event.setEvttype(this.d);
        event.setEvtid(this.e);
        JSONObject jSONObject2 = this.f;
        String string = jSONObject2 != null ? jSONObject2.toString() : "{}";
        event.setEvttime(String.valueOf(this.g));
        event.setSessionid("");
        event.setSessionname("");
        event.setSubCount((!Event.EventConstants.EVENT_ID_AGGREGATE.equals(this.e) || (jSONObject = this.f) == null) ? 1 : jSONObject.optInt(Event.EventConstants.SUB_COUNT, 1));
        event.setEvtExHashCode(this.f11526b);
        IMandatoryParameters iMandatoryParameters = this.h;
        if (iMandatoryParameters == null) {
            return;
        }
        event.setProcessname(iMandatoryParameters.getProcessName());
        if (this.k) {
            event.setContent(string);
            ArrayList arrayList = new ArrayList();
            arrayList.add(event);
            w wVar = new w(this.f11525a, this.d, arrayList, this.l, "", this.i, this.j);
            wVar.f = true;
            wVar.a();
            return;
        }
        if (j.b(this.f11525a).isLocalEncrypted(this.d)) {
            event.setContent(c.a(string, this.h));
            event.setIsEncrypted(1);
        } else {
            event.setContent(string);
            event.setIsEncrypted(0);
        }
        IStorageHandler iStorageHandlerC = j.c(this.f11525a);
        IStoragePolicy iStoragePolicyD = j.d(this.f11525a);
        if (iStorageHandlerC == null || iStoragePolicyD == null) {
            HiLog.e("RecordTask", "storageHandler is null! tag: " + this.f11525a);
            return;
        }
        if (iStoragePolicyD.decide(IStoragePolicy.PolicyType.STORAGE_LENGTH, this.d)) {
            HiLog.e("RecordTask", "db file reach max size, clear db file, tag: " + this.f11525a);
            iStorageHandlerC.deleteAll();
            x.a(this.l, iStorageHandlerC, event);
            return;
        }
        long eventSize = iStorageHandlerC.readEventSize(this.f11525a);
        if (eventSize == 0 && event.getSubCount() == 1) {
            x.a(this.l, iStorageHandlerC, event);
            HiLog.i("RecordTask", "record evt size: 1, tag: " + this.f11525a + ", type: " + this.d);
            return;
        }
        if (eventSize > 5000) {
            HiLog.e("RecordTask", "cache failed, tag: " + this.f11525a + ", type: " + this.d);
            iStorageHandlerC.deleteByTag(this.f11525a);
            x.a(this.l, iStorageHandlerC, event);
            return;
        }
        x.a(this.l, iStorageHandlerC, event);
        g gVarA = j.a(this.f11525a);
        if (gVarA == null) {
            HiLog.w("RecordTask", "framework config is null, tag: " + this.f11525a);
            return;
        }
        Long l = (Long) gVarA.f11519b.get(this.d);
        long jLongValue = l != null ? l.longValue() : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l2 = (Long) gVarA.f11520c.get(this.d);
        long jLongValue2 = l2 != null ? l2.longValue() : 30000L;
        if (jCurrentTimeMillis - jLongValue <= jLongValue2) {
            return;
        }
        long eventSize2 = iStorageHandlerC.readEventSize(this.f11525a, this.d);
        HiLog.i("RecordTask", "record evt size: " + eventSize2 + ", tag: " + this.f11525a + ", type: " + this.d);
        if (iStoragePolicyD.decide(IStoragePolicy.PolicyType.STORAGE_SIZE, this.d, eventSize2)) {
            gVarA.f11519b.put(this.d, Long.valueOf(System.currentTimeMillis()));
            if (TextUtils.isEmpty(a.a(this.f11525a, this.d)) || !iStoragePolicyD.decide(IStoragePolicy.PolicyType.NETWORK, this.d)) {
                HiLog.w("RecordTask", "network is invalid or collectUrl is empty, tag: " + this.f11525a + ", type: " + this.d);
                return;
            }
            HiLog.i("RecordTask", "begin to auto report! tag: " + this.f11525a + ", type: " + this.d);
            TaskThread.getReportThread().addToQueue(new ReportTask(this.f11525a, this.d, "", this.i, this.j));
            if (jLongValue2 != 30000 && (eventListener2 = HAEventManager.getInstance().getEventListener()) != null) {
                eventListener2.onEvent(this.f11525a, "$retry_list", "");
            }
            IHAEventListener eventListener3 = HAEventManager.getInstance().getEventListener();
            if (eventListener3 != null) {
                eventListener3.onReport(this.f11525a);
            }
            if (TextUtils.equals("HmsProfiler", this.f11525a) && (eventListener = HAEventManager.getInstance().getEventListener()) != null) {
                eventListener.reportAppEvent();
            }
            IHAEventListener eventListener4 = HAEventManager.getInstance().getEventListener();
            if (eventListener4 == null) {
                return;
            }
            eventListener4.metricReport(this.f11525a);
        }
    }
}
