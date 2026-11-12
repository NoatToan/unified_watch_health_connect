package com.huawei.hianalytics;

import android.content.Context;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.storage.CommonHeaderEx;
import com.huawei.hianalytics.core.storage.DaoManager;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements IStorageHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static j f11553b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f11554a;

    public j(Context context) {
        this.f11554a = i.a(context);
    }

    public static j a(Context context) {
        if (f11553b == null) {
            synchronized (j.class) {
                if (f11553b == null) {
                    f11553b = new j(context);
                }
            }
        }
        return f11553b;
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final boolean checkAndClearTable() {
        this.f11554a.getClass();
        return DaoManager.getInstance().checkAndClearTable();
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final void deleteAll() {
        i iVar = this.f11554a;
        iVar.getClass();
        DaoManager.getInstance().deleteAllEvents();
        iVar.a("", "");
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final void deleteByTag(String str) {
        i iVar = this.f11554a;
        iVar.getClass();
        DaoManager.getInstance().deleteEvents(str, "");
        iVar.a(str, "");
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final void deleteByTagType(String str, String str2) {
        i iVar = this.f11554a;
        iVar.getClass();
        DaoManager.getInstance().deleteEvents(str, str2);
        iVar.a(str, str2);
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final void deleteCommonHeaderExAll() {
        this.f11554a.getClass();
        DaoManager.getInstance().deleteAllHeaders();
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final void deleteEvents(List list) {
        i iVar = this.f11554a;
        iVar.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        DaoManager.getInstance().deleteEvents(list);
        String servicetag = ((Event) list.get(0)).getServicetag();
        String evttype = ((Event) list.get(0)).getEvttype();
        Iterator it = list.iterator();
        long subCount = 0;
        while (it.hasNext()) {
            subCount -= (long) ((Event) it.next()).getSubCount();
        }
        AtomicLong atomicLongB = iVar.b(servicetag, evttype);
        if (atomicLongB != null) {
            if (atomicLongB.addAndGet(subCount) < 0) {
                iVar.a(servicetag, evttype);
                return;
            }
            return;
        }
        if (iVar.f11547a == null) {
            iVar.f11547a = x0.b(EnvUtils.getAppContext());
        }
        AtomicLong atomicLong = new AtomicLong(DaoManager.getInstance().countBySubCount(servicetag, evttype, iVar.f11547a));
        if ("oper".equals(evttype)) {
            iVar.f11548b.put(servicetag, atomicLong);
        } else if ("maint".equals(evttype)) {
            iVar.f11549c.put(servicetag, atomicLong);
        }
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final int deleteMcInfo(List list) {
        this.f11554a.getClass();
        return DaoManager.getInstance().deleteMcInfo(list);
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final int deleteMcTag(List list) {
        this.f11554a.getClass();
        return DaoManager.getInstance().deleteMcTag(list);
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final long insert(Event event) {
        i iVar = this.f11554a;
        iVar.getClass();
        long jInsert = DaoManager.getInstance().insert(event);
        if (jInsert > 0) {
            String servicetag = event.getServicetag();
            String evttype = event.getEvttype();
            long subCount = event.getSubCount();
            AtomicLong atomicLongB = iVar.b(servicetag, evttype);
            if (atomicLongB == null) {
                if (iVar.f11547a == null) {
                    iVar.f11547a = x0.b(EnvUtils.getAppContext());
                }
                AtomicLong atomicLong = new AtomicLong(DaoManager.getInstance().countBySubCount(servicetag, evttype, iVar.f11547a));
                if ("oper".equals(evttype)) {
                    iVar.f11548b.put(servicetag, atomicLong);
                    return jInsert;
                }
                if ("maint".equals(evttype)) {
                    iVar.f11549c.put(servicetag, atomicLong);
                    return jInsert;
                }
            } else if (atomicLongB.addAndGet(subCount) < 0) {
                iVar.a(servicetag, evttype);
            }
        }
        return jInsert;
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final long insertMcInfo(String str) {
        this.f11554a.getClass();
        return DaoManager.getInstance().insertMcInfo(str);
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final long insertMcTagList(List list) {
        this.f11554a.getClass();
        return DaoManager.getInstance().insertMcTagList(list);
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final List queryMcInfo() {
        this.f11554a.getClass();
        return DaoManager.getInstance().queryMcInfo();
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final List queryMcTag(String str) {
        this.f11554a.getClass();
        return DaoManager.getInstance().queryMcTag(str);
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final CommonHeaderEx readCommonHeaderEx(String str) {
        this.f11554a.getClass();
        return DaoManager.getInstance().readHeader(str);
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final long readEventSize(String str) {
        long j;
        long j2;
        i iVar = this.f11554a;
        AtomicLong atomicLongB = iVar.b(str, "oper");
        if (atomicLongB != null) {
            j = atomicLongB.get();
        } else {
            if (iVar.f11547a == null) {
                iVar.f11547a = x0.b(EnvUtils.getAppContext());
            }
            AtomicLong atomicLong = new AtomicLong(DaoManager.getInstance().countBySubCount(str, "oper", iVar.f11547a));
            iVar.f11548b.put(str, atomicLong);
            j = atomicLong.get();
        }
        AtomicLong atomicLongB2 = iVar.b(str, "maint");
        if (atomicLongB2 != null) {
            j2 = atomicLongB2.get();
        } else {
            if (iVar.f11547a == null) {
                iVar.f11547a = x0.b(EnvUtils.getAppContext());
            }
            AtomicLong atomicLong2 = new AtomicLong(DaoManager.getInstance().countBySubCount(str, "maint", iVar.f11547a));
            iVar.f11549c.put(str, atomicLong2);
            j2 = atomicLong2.get();
        }
        return j2 + j;
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final List readEvents(String str, String str2) {
        i iVar = this.f11554a;
        if (iVar.f11547a == null) {
            iVar.f11547a = x0.b(EnvUtils.getAppContext());
        }
        return DaoManager.getInstance().readEvents(str, str2, iVar.f11547a, -1L);
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final long readEventsAllSize() {
        this.f11554a.getClass();
        return DaoManager.getInstance().countEvents();
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final List readOldEvents(String str, String str2) {
        i iVar = this.f11554a;
        if (iVar.f11547a == null) {
            iVar.f11547a = x0.b(EnvUtils.getAppContext());
        }
        long jCurrentTimeMillis = k.b().a().p;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        return DaoManager.getInstance().readEvents(str, str2, iVar.f11547a, jCurrentTimeMillis);
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final long insert(CommonHeaderEx commonHeaderEx) {
        this.f11554a.getClass();
        return DaoManager.getInstance().insert(commonHeaderEx);
    }

    @Override // com.huawei.hianalytics.core.storage.IStorageHandler
    public final long readEventSize(String str, String str2) {
        i iVar = this.f11554a;
        AtomicLong atomicLongB = iVar.b(str, str2);
        if (atomicLongB != null) {
            return atomicLongB.get();
        }
        if (iVar.f11547a == null) {
            iVar.f11547a = x0.b(EnvUtils.getAppContext());
        }
        AtomicLong atomicLong = new AtomicLong(DaoManager.getInstance().countBySubCount(str, str2, iVar.f11547a));
        if ("oper".equals(str2)) {
            iVar.f11548b.put(str, atomicLong);
        } else if ("maint".equals(str2)) {
            iVar.f11549c.put(str, atomicLong);
        }
        return atomicLong.get();
    }
}
