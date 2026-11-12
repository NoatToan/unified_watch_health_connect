package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Process;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public class lgx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40112b = HiDateUtil.d(System.currentTimeMillis());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40113c;
    private Context d;
    private lfz e;

    public lgx(Context context, int i, int i2) {
        this.d = context;
        this.f40113c = i;
        this.f40111a = i2;
    }

    private void d() {
        this.e = lfz.d(this.d);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        ReleaseLogUtil.d("HiH_HiSyncBackgroud", "insert time ");
        SQLiteDatabase writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
        this.f40112b = HiDateUtil.d(System.currentTimeMillis());
        if (writableDatabase == null) {
            ReleaseLogUtil.a("HiH_HiSyncBackgroud", "error: db is not open!");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!BaseApplication.isRunningForeground()) {
            ThermalCallback.getInstance().controlThreadLevel(Collections.singletonList(Integer.valueOf(Process.myTid())), 1);
        }
        a(1, 10001, writableDatabase, jCurrentTimeMillis);
        boolean z = -2 != a(1, 1, writableDatabase, jCurrentTimeMillis);
        liq.c(this.d, this.f40113c, this.f40112b);
        if (z) {
            liq.d(this.d, this.f40113c, 0);
        } else {
            liq.d(this.d, this.f40113c, 1);
            liq.d(this.d, this.f40113c, jCurrentTimeMillis);
        }
        lgp.d(false);
        try {
            writableDatabase.execSQL(kwb.e(1));
            writableDatabase.execSQL(kwb.c(1));
        } catch (SQLiteException e) {
            ReleaseLogUtil.a("HiH_HiSyncBackgroud", "ClearAllInfo SQLiteException!", LogAnonymous.b(e));
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_HiSyncBackgroud", "ClearAllInfo Exception!", LogAnonymous.b(e2));
        }
        ReleaseLogUtil.d("HiH_HiSyncBackgroud", "insert over !Background task is down! totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private int a(int i, int i2, SQLiteDatabase sQLiteDatabase, long j) {
        boolean z;
        d(i, sQLiteDatabase);
        try {
            Cursor cursorE = kxm.a().e(this.f40113c, i2);
            try {
                if (cursorE == null) {
                    LogUtil.j("Debug_HiSyncBackgroud", "query = null");
                    if (cursorE == null) {
                        return -1;
                    }
                    cursorE.close();
                    return -1;
                }
                int i3 = 4;
                char c2 = 3;
                LogUtil.d("Debug_HiSyncBackgroud", "type=", Integer.valueOf(i2), " ,query count ", Integer.valueOf(cursorE.getCount()));
                List<HiHealthData> arrayList = new ArrayList<>(10);
                int size = 0;
                while (true) {
                    if (!cursorE.moveToNext()) {
                        z = true;
                        break;
                    }
                    if (b(i2, j)) {
                        int i4 = (this.f40111a / 1000) / 60;
                        Object[] objArr = new Object[i3];
                        objArr[0] = "backgroud insert large ";
                        objArr[1] = Integer.valueOf(i4);
                        objArr[2] = "data size=";
                        objArr[c2] = Integer.valueOf(size);
                        LogUtil.a("HiH_HiSyncBackgroud", objArr);
                        z = false;
                        break;
                    }
                    String string = cursorE.getString(cursorE.getColumnIndex("data"));
                    if (string == null) {
                        LogUtil.e("Debug_HiSyncBackgroud", "data  = nul");
                    } else {
                        List list = (List) HiJsonUtil.d(string, new TypeToken<List<HiHealthData>>() { // from class: com.huawei.hihealthservice.sync.syncdata.HiSyncBackgroud$1
                        }.getType());
                        if (!HiCommonUtil.b(list)) {
                            arrayList.addAll(list);
                            size = b(i2, arrayList, size);
                            d(i, sQLiteDatabase, cursorE);
                        }
                    }
                    i3 = 4;
                    c2 = 3;
                }
                if (arrayList.size() > 0) {
                    c(arrayList, i2);
                    size += arrayList.size();
                }
                if (!z) {
                    if (cursorE != null) {
                        cursorE.close();
                    }
                    return -2;
                }
                LogUtil.a("HiH_HiSyncBackgroud", "insert ", Integer.valueOf(i2), "over datasize=", Integer.valueOf(size), ", total time=", Long.valueOf(System.currentTimeMillis() - j));
                if (cursorE != null) {
                    cursorE.close();
                }
                return 0;
            } catch (Throwable th) {
                if (cursorE == null) {
                    throw th;
                }
                try {
                    cursorE.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (SQLiteException e) {
            ReleaseLogUtil.a("HiH_HiSyncBackgroud", "ClearAllInfo SQLiteException!", LogAnonymous.b(e));
            return -2;
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_HiSyncBackgroud", "backgroudInsertHealthData Exception", LogAnonymous.b(e2));
            return -2;
        }
    }

    private int b(int i, List<HiHealthData> list, int i2) {
        if (list.size() <= 200) {
            return i2;
        }
        c(list, i);
        int size = i2 + list.size();
        list.clear();
        lgp.d();
        return size;
    }

    private void d(int i, SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        sQLiteDatabase.execSQL(kwb.a(i, cursor.getInt(cursor.getColumnIndex("_id"))));
    }

    private void d(int i, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(kwb.e(i));
            sQLiteDatabase.execSQL(kwb.c(i));
        } catch (SQLiteException e) {
            ReleaseLogUtil.a("HiH_HiSyncBackgroud", "ClearAllInfo SQLiteException!", LogAnonymous.b(e));
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_HiSyncBackgroud", "ClearAllInfo Exception!", LogAnonymous.b(e2));
        }
    }

    private boolean b(int i, long j) {
        return 1 == i && ((long) this.f40111a) < System.currentTimeMillis() - j;
    }

    private void c(List<HiHealthData> list, int i) {
        int iD = HiDateUtil.d(list.get(0).getStartTime());
        LogUtil.d("Debug_HiSyncBackgroud", "insert size=", Integer.valueOf(list.size()), ", Record day=", Integer.valueOf(iD), " ,errorCode=", Integer.valueOf(this.e.e(list, this.f40113c)));
        if (1 == i && this.f40112b > iD) {
            this.f40112b = iD;
        }
        this.e.prepareRealTimeHealthDataStat(list, false);
        this.e.doRealTimeHealthDataStat(false);
    }

    public static void a(Context context, List<HiHealthData> list, int i, int i2) {
        kxm kxmVarA = kxm.a();
        int i3 = 0;
        long startTime = list.get(0).getStartTime();
        int size = list.size();
        LogUtil.d("Debug_HiSyncBackgroud", "hiHealthDatas size is ", Integer.valueOf(size));
        if (size > 1) {
            Collections.sort(list, new d());
            LogUtil.d("Debug_HiSyncBackgroud", "Collections.sort finish");
        }
        if (size <= 1000) {
            if (kxmVarA.a(i2, i, HiJsonUtil.d(list), startTime)) {
                return;
            }
            LogUtil.j("Debug_HiSyncBackgroud", "performDownloadByVersion saveVersionToDB failed ");
            return;
        }
        int i4 = size / 1000;
        if (size % 1000 != 0) {
            i4++;
        }
        int i5 = i4;
        while (i3 < i5) {
            LogUtil.d("Debug_HiSyncBackgroud", "subhiHealthDatas begin page = ", Integer.valueOf(i3));
            int i6 = i3 + 1;
            int i7 = i6 * 1000;
            List<HiHealthData> listSubList = list.subList(i3 * 1000, i7 > size ? size : i7 - 1);
            if (listSubList == null || listSubList.isEmpty()) {
                LogUtil.j("Debug_HiSyncBackgroud", "subhiHealthDatas is null");
            } else {
                if (!kxmVarA.a(i2, i, HiJsonUtil.d(listSubList), startTime)) {
                    LogUtil.j("Debug_HiSyncBackgroud", "performDownloadByVersion saveVersionToDB failed ");
                }
                LogUtil.d("Debug_HiSyncBackgroud", "subhiHealthDatas over");
            }
            i3 = i6;
        }
    }

    static class d implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = 4146406961938280295L;

        private d() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return Double.compare(hiHealthData2.getStartTime(), hiHealthData.getStartTime());
        }
    }
}
