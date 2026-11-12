package defpackage;

import android.os.SystemClock;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes17.dex */
public class sis {
    private static volatile sis d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48146b;
    private Object f = null;
    private final ReentrantReadWriteLock g = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReentrantReadWriteLock f48147c = new ReentrantReadWriteLock();
    private final Set<HiDataReadResultListener> e = new HashSet();

    public static sis e() {
        if (d == null) {
            synchronized (sis.class) {
                if (d == null) {
                    d = new sis();
                }
            }
        }
        return d;
    }

    public static int[] a() {
        return new int[]{44102, 44103, 44101, 44105, 44001, 44002, 44108, 44104, 44109, 44110, 44203, 44235, 44111, 44112, 44113};
    }

    private sis() {
        b();
    }

    public void d() {
        this.g.writeLock().lock();
        try {
            this.f = null;
            this.f48146b = 0;
            this.f48145a = 0;
            this.g.writeLock().unlock();
            this.f48147c.writeLock().lock();
            try {
                this.e.clear();
            } finally {
                this.f48147c.writeLock().unlock();
            }
        } catch (Throwable th) {
            this.g.writeLock().unlock();
            throw th;
        }
    }

    public void b() {
        LogUtil.a("FunctionSetDataUnitizedReader", "readUnitizedData start");
        d();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthDataEx(i(), new HiDataReadResultListener() { // from class: sis.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("FunctionSetDataUnitizedReader", "readUnitizedData read cost: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                sis.this.g.writeLock().lock();
                try {
                    sis.this.f = obj;
                    sis.this.f48146b = i;
                    sis.this.f48145a = i2;
                    sis.this.g.writeLock().unlock();
                    sis.this.f48147c.readLock().lock();
                    try {
                        for (HiDataReadResultListener hiDataReadResultListener : sis.this.e) {
                            if (hiDataReadResultListener != null) {
                                hiDataReadResultListener.onResult(obj, i, i2);
                            }
                        }
                        sis.this.f48147c.readLock().unlock();
                    } catch (Throwable th) {
                        sis.this.f48147c.readLock().unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    sis.this.g.writeLock().unlock();
                    throw th2;
                }
            }
        });
    }

    public void d(HiDataReadResultListener hiDataReadResultListener) {
        LogUtil.a("FunctionSetDataUnitizedReader", "readCardData");
        this.g.readLock().lock();
        try {
            Object obj = this.f;
            if (obj != null || this.f48146b != 0) {
                hiDataReadResultListener.onResult(obj, this.f48146b, this.f48145a);
            } else {
                this.f48147c.writeLock().lock();
                try {
                    this.e.add(hiDataReadResultListener);
                    this.f48147c.writeLock().unlock();
                } catch (Throwable th) {
                    this.f48147c.writeLock().unlock();
                    throw th;
                }
            }
            this.g.readLock().unlock();
        } catch (Throwable th2) {
            this.g.readLock().unlock();
            throw th2;
        }
    }

    private static List<HiDataReadProOption> i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f());
        arrayList.add(g());
        arrayList.add(j());
        arrayList.add(h());
        return arrayList;
    }

    public static void c() {
        if (d != null) {
            synchronized (sis.class) {
                if (d != null) {
                    d.d();
                    d = null;
                }
            }
        }
    }

    private static HiDataReadProOption f() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{2034});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(16);
        return HiDataReadProOption.builder().e(hiDataReadOption).a(true).b();
    }

    private static HiDataReadProOption g() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        int[] iArrA = a();
        hiDataReadOption.setType(iArrA);
        hiDataReadOption.setCount(iArrA.length);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        return HiDataReadProOption.builder().e(hiDataReadOption).a(true).b();
    }

    private static HiDataReadProOption j() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(uvz.e());
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setReadType(0);
        return HiDataReadProOption.builder().e(hiDataReadOption).a(true).b();
    }

    private static HiDataReadProOption h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{700017});
        return HiDataReadProOption.builder().e(hiDataReadOption).a(1).b();
    }
}
