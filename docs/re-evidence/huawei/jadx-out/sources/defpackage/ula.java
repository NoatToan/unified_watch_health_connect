package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiDateUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class ula {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ula f50307a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f50308b = 0;
    private final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Long, List<HiHealthData>> f50309c = new HashMap(0);

    private ula() {
    }

    public static ula c() {
        if (f50307a == null) {
            synchronized (d) {
                if (f50307a == null) {
                    f50307a = new ula();
                }
            }
        }
        return f50307a;
    }

    public void d(long j, List<HiHealthData> list) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        int iHashCode = hashCode();
        LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(iHashCode), ", addData ", simpleDateFormat.format(Long.valueOf(j)), ", size=", Integer.valueOf(list.size()));
        synchronized (this.e) {
            this.f50309c.put(Long.valueOf(j), list);
        }
    }

    public void e(final long j, final long j2, final int[] iArr, final IBaseResponseCallback iBaseResponseCallback) {
        if (j2 < j || j2 - j > 86400000) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ukz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50305c.c(j, j2, iArr, iBaseResponseCallback);
                }
            });
        } else {
            c(j, j2, iArr, iBaseResponseCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(long j, long j2, int[] iArr, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (this.e) {
            try {
                if (this.f50308b == 2) {
                    return;
                }
                long j3 = j2 - j == 86400000 ? j2 - 1 : j2;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
                LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", thread_id=", Long.valueOf(Thread.currentThread().getId()), ", getDayData start, ", "startTime=", simpleDateFormat.format(Long.valueOf(j)), ", endTime=", simpleDateFormat.format(Long.valueOf(j3)));
                long jP = HiDateUtil.p(j);
                List<HiHealthData> list = this.f50309c.get(Long.valueOf(jP));
                if (list == null) {
                    LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", dayDataList==null");
                    if (this.f50308b == 0) {
                        this.f50308b = 1;
                        LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", requestDataByTimeInterval start");
                        e(jP, HiDateUtil.g(j) - 1);
                    }
                    try {
                        LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", wait");
                        this.e.wait();
                        try {
                            c(j, j3, iArr, iBaseResponseCallback);
                        } catch (InterruptedException unused) {
                            LogUtil.e("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", Failed to getDayData");
                        }
                    } catch (InterruptedException unused2) {
                    }
                    return;
                }
                List<HiHealthData> listA = a(j, j3, list);
                b(iArr, listA);
                LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", getDayData finish, size=", Integer.valueOf(listA.size()));
                iBaseResponseCallback.a(0, listA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private List<HiHealthData> a(long j, long j2, List<HiHealthData> list) {
        if (!list.isEmpty() && j2 - j < 86399999) {
            LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", time filter");
            int iC = c(list, j);
            int iD = d(list, j2);
            LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", startIndex=", Integer.valueOf(iC), ", endIndex=", Integer.valueOf(iD));
            if (iC < 0 || iD < 0) {
                return new ArrayList(0);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
            LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", data.start=", simpleDateFormat.format(Long.valueOf(list.get(iC).getStartTime())), ", data.end=", simpleDateFormat.format(Long.valueOf(list.get(iD - 1).getStartTime())));
            return new ArrayList(list.subList(iC, iD));
        }
        return new ArrayList(list);
    }

    private void b(int[] iArr, List<HiHealthData> list) {
        if (iArr.length != 10) {
            LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", type filter");
            Iterator<HiHealthData> it = list.iterator();
            while (it.hasNext()) {
                HiHealthData next = it.next();
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (next.getType() == iArr[i]) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }

    private int c(List<HiHealthData> list, long j) {
        if (list.get(list.size() - 1).getStartTime() < j) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStartTime() >= j) {
                return i;
            }
        }
        return -1;
    }

    private int d(List<HiHealthData> list, long j) {
        int i = 0;
        if (list.get(0).getStartTime() > j) {
            return -1;
        }
        while (i < list.size()) {
            HiHealthData hiHealthData = list.get(i);
            if (hiHealthData.getStartTime() == j) {
                return i + 1;
            }
            if (hiHealthData.getStartTime() > j) {
                break;
            }
            i++;
        }
        return i;
    }

    private void e(long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(uvz.c());
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setSortOrder(0);
        final long jP = HiDateUtil.p(j);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        nkb.d().b(BaseApplication.b(), hiDataReadOption, new IBaseResponseCallback() { // from class: ulb
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f50310b.d(jElapsedRealtime, jP, i, obj);
            }
        });
    }

    /* synthetic */ void d(long j, long j2, int i, Object obj) {
        List<HiHealthData> arrayList;
        LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", requestDataByTimeInterval ", "costTime = ", Long.valueOf(SystemClock.elapsedRealtime() - j));
        if (obj instanceof List) {
            arrayList = (List) obj;
        } else {
            arrayList = new ArrayList<>(0);
        }
        synchronized (this.e) {
            LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", requestDataByTimeInterval finish, size=", Integer.valueOf(arrayList.size()));
            if (this.f50308b == 1) {
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, new Comparator() { // from class: ulc
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return Long.compare(((HiHealthData) obj2).getStartTime(), ((HiHealthData) obj3).getStartTime());
                        }
                    });
                }
                if (this.f50309c.size() > 180) {
                    Set<Map.Entry<Long, List<HiHealthData>>> setEntrySet = this.f50309c.entrySet();
                    Iterator<Map.Entry<Long, List<HiHealthData>>> it = setEntrySet.iterator();
                    int size = setEntrySet.size() / 2;
                    for (int i2 = 0; i2 < size; i2++) {
                        it.next();
                    }
                    it.remove();
                }
                this.f50309c.put(Long.valueOf(j2), arrayList);
                this.f50308b = 0;
            }
            LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", id=", Long.valueOf(Thread.currentThread().getId()), ", requestDataByTimeInterval notifyAll");
            this.e.notifyAll();
        }
    }

    public void e() {
        LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", destory");
        synchronized (d) {
            if (f50307a != null) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: uld
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50312c.a();
                    }
                });
                f50307a = null;
            }
        }
    }

    /* synthetic */ void a() {
        synchronized (this.e) {
            LogUtil.a("BloodSugarCacheHelper", Integer.valueOf(hashCode()), ", destory execute");
            this.f50308b = 2;
        }
    }
}
