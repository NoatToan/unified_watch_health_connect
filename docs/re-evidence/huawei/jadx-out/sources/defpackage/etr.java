package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.health.manager.util.UnitUtilExt;
import com.huawei.health.provider.HealthFaDataExtendHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ohos.localability.FormCallback;
import com.huawei.ohos.localability.FormException;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.plugindaemon.R;
import health.compact.a.DaemonServiceSpUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogAnonymous;
import health.compact.a.LogicalStepCounter;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.StepsRecord;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class etr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ReentrantReadWriteLock f33472a = new ReentrantReadWriteLock();
    private StepsRecord g;
    private Map<Long, ett> e = new HashMap();
    private Set<Long> h = new HashSet();
    private Set<Long> j = new HashSet();
    private Map<Long, Integer> f = new ConcurrentHashMap();
    private long d = SystemClock.elapsedRealtime();
    private long i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f33473b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExtendHandler f33474c = HandlerCenter.e("Step_FaFormManager");

    /* JADX INFO: loaded from: classes7.dex */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static etr f33478a = new etr();
    }

    public static etr d() {
        return a.f33478a;
    }

    public List<ett> b() {
        f33472a.readLock().lock();
        try {
            return new ArrayList(this.e.values());
        } finally {
            f33472a.readLock().unlock();
        }
    }

    public ett e(ett ettVar) {
        if (ettVar == null) {
            ReleaseLogUtil.d("Step_FaFormManager", "addFaForm failed with null paras.");
            return null;
        }
        if (!ettVar.e()) {
            ReleaseLogUtil.d("Step_FaFormManager", "addFaForm ignore with other faForm paras.");
            return ettVar;
        }
        f33472a.writeLock().lock();
        try {
            e(true);
            ett ettVarPut = this.e.put(Long.valueOf(ettVar.c()), ettVar);
            if (this.h.contains(Long.valueOf(ettVar.c()))) {
                this.j.add(Long.valueOf(ettVar.c()));
            }
            ReleaseLogUtil.c("Step_FaFormManager", "add faForm: ", ettVar);
            o();
            f33472a.writeLock().unlock();
            b(this.g, true);
            return ettVarPut;
        } catch (Throwable th) {
            f33472a.writeLock().unlock();
            throw th;
        }
    }

    public ett a(ContentValues contentValues) {
        if (contentValues == null) {
            ReleaseLogUtil.d("Step_FaFormManager", "addFaForm failed with null paras.");
            return null;
        }
        ett ettVar = new ett();
        ettVar.e(contentValues.getAsLong("cardId").longValue());
        ettVar.c(contentValues.getAsInteger("cardType").intValue());
        ettVar.e(contentValues.getAsInteger("cardSize").intValue());
        return e(ettVar);
    }

    public long a(long j) {
        f33472a.writeLock().lock();
        try {
            e(true);
            ett ettVarRemove = this.e.remove(Long.valueOf(j));
            this.j.remove(Long.valueOf(j));
            ReleaseLogUtil.c("Step_FaFormManager", " removeFaForm faCardId:", Long.valueOf(j), " faForm:", ettVarRemove);
            o();
            if (ettVarRemove != null) {
                return j;
            }
            ReleaseLogUtil.d("Step_FaFormManager", "removeFaForm ignore with not exit.");
            return 0L;
        } finally {
            f33472a.writeLock().unlock();
        }
    }

    public void b(StepsRecord stepsRecord, final boolean z) {
        if (stepsRecord == null) {
            return;
        }
        this.g = stepsRecord;
        if (a()) {
            this.f33474c.removeTasksAndMessages();
            this.f33474c.postTask(new Runnable() { // from class: etw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33482c.a(z);
                }
            }, EnvironmentInfo.g() ? Math.max(0L, (this.i + 1005) - SystemClock.elapsedRealtime()) : 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x0021 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:4:0x0014, B:11:0x0048, B:13:0x0050, B:16:0x0056, B:17:0x0066, B:19:0x006c, B:20:0x0076, B:22:0x0080, B:23:0x0084, B:26:0x0089, B:28:0x009a, B:30:0x00b5, B:33:0x00c2, B:6:0x0021, B:8:0x002d, B:10:0x0035), top: B:40:0x0014, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x002d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:4:0x0014, B:11:0x0048, B:13:0x0050, B:16:0x0056, B:17:0x0066, B:19:0x006c, B:20:0x0076, B:22:0x0080, B:23:0x0084, B:26:0x0089, B:28:0x009a, B:30:0x00b5, B:33:0x00c2, B:6:0x0021, B:8:0x002d, B:10:0x0035), top: B:40:0x0014, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(boolean z) {
        StepsRecord stepsRecord;
        StepsRecord stepsRecord2;
        Integer numValueOf;
        f33472a.readLock().lock();
        if (z) {
            this.d = SystemClock.elapsedRealtime();
            Set<Long> set = this.j;
            stepsRecord2 = this.g;
            if (stepsRecord2 != null) {
                numValueOf = Integer.valueOf(stepsRecord2.f);
            } else {
                numValueOf = null;
            }
            ReleaseLogUtil.c("Step_FaFormManager", "updateForm. cIds:", set, " recd:", numValueOf);
        } else {
            try {
                if (SystemClock.elapsedRealtime() - this.d > 5000) {
                    this.d = SystemClock.elapsedRealtime();
                    Set<Long> set2 = this.j;
                    stepsRecord2 = this.g;
                    if (stepsRecord2 != null) {
                        numValueOf = Integer.valueOf(stepsRecord2.f);
                    } else {
                        numValueOf = null;
                    }
                    ReleaseLogUtil.c("Step_FaFormManager", "updateForm. cIds:", set2, " recd:", numValueOf);
                }
            } catch (Throwable th) {
                f33472a.readLock().unlock();
                throw th;
            }
        }
        if (!this.j.isEmpty() && (stepsRecord = this.g) != null) {
            ogz ogzVarC = c(stepsRecord);
            this.i = SystemClock.elapsedRealtime();
            for (Long l : this.j) {
                long jLongValue = l.longValue();
                try {
                    try {
                        if (ogv.d(jLongValue, BaseApplication.b(), ogzVarC)) {
                            c(jLongValue);
                        } else {
                            b(jLongValue);
                        }
                    } catch (Exception e) {
                        ReleaseLogUtil.b("Step_FaFormManager", "updateForm failed. cardId:", l, ExceptionUtils.c(e));
                    }
                } catch (FormException e2) {
                    ReleaseLogUtil.b("Step_FaFormManager", "updateForm failed. cardId:", l, ExceptionUtils.c(e2));
                    if (!FormException.FormError.INTERNAL_ERROR.equals(e2.b()) && !FormException.FormError.MAX_REQUEST.equals(e2.b())) {
                        b(jLongValue);
                    }
                }
            }
        }
        f33472a.readLock().unlock();
    }

    public void d(StepsRecord stepsRecord) {
        try {
            BaseApplication.b().getContentResolver().insert(Uri.parse("content://com.huawei.ohos.health.HealthDataAbility"), e(stepsRecord));
        } catch (Exception e) {
            ReleaseLogUtil.b("Step_FaFormManager", "refreshData failed with error.", ExceptionUtils.c(e));
        }
    }

    private ContentValues e(StepsRecord stepsRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MedalConstants.EVENT_STEPS, Integer.valueOf(stepsRecord.f));
        contentValues.put("distance", Integer.valueOf(stepsRecord.f36647a));
        contentValues.put("carior", Integer.valueOf(stepsRecord.f36649c));
        contentValues.put("goalSteps", Integer.valueOf(stepsRecord.h));
        return contentValues;
    }

    public boolean a() {
        return this.f33473b;
    }

    public void f() {
        if (this.f33473b) {
            ReleaseLogUtil.d("Step_FaFormManager", "updateRefreshType ignore with mActiveRefreshEnable:", Boolean.valueOf(this.f33473b));
        } else {
            d(10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i) {
        ThreadPoolManager.c().a("Step_FaFormManager", new Runnable() { // from class: etr.1
            @Override // java.lang.Runnable
            public void run() {
                ReleaseLogUtil.c("Step_FaFormManager", "updateRefreshType :", Integer.valueOf(i));
                String strB = DaemonServiceSpUtils.b();
                String strL = etr.this.l();
                if (!TextUtils.isEmpty(strL)) {
                    DaemonServiceSpUtils.b(strL);
                    strB = strL;
                } else if (TextUtils.isEmpty(strB)) {
                    strB = null;
                }
                boolean zB = etr.this.b(strB, 0);
                if (zB || i <= 0) {
                    etr.this.e(zB);
                } else {
                    etr.this.n();
                    HandlerExecutor.c(new Runnable() { // from class: etr.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            etr.this.d(i - 1);
                        }
                    }, 2000L);
                }
            }
        });
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DaemonServiceSpUtils.b(str);
        e(b(str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        ReleaseLogUtil.c("Step_FaFormManager", "enableActiveRefresh() new enabled:", Boolean.valueOf(z), " old enabled:", Boolean.valueOf(this.f33473b));
        if (this.f33473b) {
            d(false);
        }
        if (this.f33473b == z) {
            return;
        }
        this.f33473b = z;
        if (this.f33473b) {
            m();
            d(true);
        } else {
            k();
            i();
        }
    }

    private void m() {
        try {
            ReleaseLogUtil.c("Step_FaFormManager", " registerFormsVisibleNotifier().");
            ogv.a(BaseApplication.b(), new FormCallback() { // from class: etr.2
                @Override // com.huawei.ohos.localability.FormCallback
                public void onFormsVisible(List<Long> list) {
                    ReleaseLogUtil.c("Step_FaFormManager", "FormsVisibleNotifier visibleList:", list);
                    etr.this.d(list);
                    if (njy.e(list)) {
                        return;
                    }
                    ipj.e();
                    etr etrVar = etr.this;
                    etrVar.b(etrVar.g, true);
                }
            });
        } catch (FormException e) {
            ReleaseLogUtil.b("Step_FaFormManager", "registerFormsVisibleNotifier failed. please check", ExceptionUtils.c(e));
        }
    }

    private void k() {
        try {
            ReleaseLogUtil.c("Step_FaFormManager", " unregisterFormsVisibleNotifier().");
            ogv.b(BaseApplication.b());
        } catch (FormException e) {
            ReleaseLogUtil.b("Step_FaFormManager", "unregisterFormsVisibleNotifier failed. please check", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<Long> list) {
        f33472a.writeLock().lock();
        this.h.clear();
        this.j.clear();
        if (njy.e(list)) {
            f33472a.writeLock().unlock();
            return;
        }
        for (Long l : list) {
            if (l != null) {
                this.h.add(l);
                if (this.e.containsKey(l)) {
                    this.j.add(l);
                }
            }
        }
        f33472a.writeLock().unlock();
    }

    private void d(final boolean z) {
        ReleaseLogUtil.c("Step_FaFormManager", "load data start. isFirst:", Boolean.valueOf(z));
        ThreadPoolManager.c().a("Step_FaFormManager", new Runnable() { // from class: etr.4
            @Override // java.lang.Runnable
            public void run() {
                List listH = etr.this.h();
                if (njy.e(listH) && z) {
                    listH = etr.this.g();
                }
                etr.this.c((List<ett>) listH);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<ett> g() {
        String strC = DaemonServiceSpUtils.c();
        ReleaseLogUtil.c("Step_FaFormManager", " getFaFormWithSp: ", strC);
        ArrayList arrayList = new ArrayList();
        if (strC != null && !strC.isEmpty()) {
            try {
                List list = (List) peh.d(strC, new TypeToken<List<ett>>() { // from class: com.huawei.health.fa.manager.FaFormManager$4
                }.getType());
                if (list != null) {
                    arrayList.addAll(list);
                    return arrayList;
                }
            } catch (JsonParseException | NullPointerException e) {
                ReleaseLogUtil.d("Step_FaFormManager", " getFaFormWithSp: ", ExceptionUtils.c(e));
            }
        }
        return arrayList;
    }

    private void o() {
        try {
            String strC = peh.c(b());
            ReleaseLogUtil.c("Step_FaFormManager", " updateFaFormToSp: ", strC);
            DaemonServiceSpUtils.c(strC);
        } catch (JsonParseException e) {
            ReleaseLogUtil.d("Step_FaFormManager", " updateFaFormToSp: ", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<ett> list) {
        f33472a.writeLock().lock();
        try {
            for (ett ettVar : list) {
                this.e.put(Long.valueOf(ettVar.c()), ettVar);
                if (this.h.contains(Long.valueOf(ettVar.c()))) {
                    this.j.add(Long.valueOf(ettVar.c()));
                }
            }
            o();
            f33472a.writeLock().unlock();
            b(this.g, true);
        } catch (Throwable th) {
            f33472a.writeLock().unlock();
            throw th;
        }
    }

    private void i() {
        f33472a.writeLock().lock();
        this.e.clear();
        this.h.clear();
        this.f.clear();
        this.j.clear();
        f33472a.writeLock().unlock();
    }

    private void b(final long j) {
        ThreadPoolManager.c().a("Step_FaFormManager", new Runnable() { // from class: etx
            @Override // java.lang.Runnable
            public final void run() {
                this.f33483b.d(j);
            }
        });
    }

    /* synthetic */ void d(long j) {
        Integer num = this.f.get(Long.valueOf(j));
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue() + 1;
        Integer numValueOf = Integer.valueOf(iIntValue);
        ReleaseLogUtil.d("Step_FaFormManager", "updateFromFailed. cardId:", Long.valueOf(j), " failed times:", numValueOf);
        if (!EnvironmentInfo.g()) {
            numValueOf.getClass();
            if (iIntValue >= 50) {
                a(j);
                this.f.remove(Long.valueOf(j));
                return;
            }
        }
        this.f.put(Long.valueOf(j), numValueOf);
    }

    private void c(long j) {
        this.f.remove(Long.valueOf(j));
    }

    private ogz c(StepsRecord stepsRecord) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sports_count", UnitUtilExt.e(BaseApplication.b(), stepsRecord.f, 1, 0));
            double dDoubleValue = stepsRecord.h == 0 ? 0.0d : new BigDecimal((((double) stepsRecord.f) * 100.0d) / ((double) stepsRecord.h)).setScale(1, RoundingMode.HALF_UP).doubleValue();
            jSONObject.put("sports_percent", Math.min(Math.max(0.0d, dDoubleValue), 100.0d));
            jSONObject.put("step_unit", BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_hw_phonecounter_widget_step_unit));
            jSONObject.put("app_authorized", LogicalStepCounter.d(BaseApplication.b()).b());
            HealthFaDataExtendHelper.d().a(stepsRecord.f, stepsRecord.h, dDoubleValue, jSONObject);
        } catch (JSONException e) {
            LogUtil.j("Step_FaFormManager", "getJsFormBindingData failed. pls check", ExceptionUtils.c(e));
        }
        return new ogz(jSONObject.toString());
    }

    public void j() {
        ReleaseLogUtil.c("Step_FaFormManager", "updateAllCardForScene enter");
        ThreadPoolManager.c().a("Step_FaFormManager", new Runnable() { // from class: etu
            @Override // java.lang.Runnable
            public final void run() {
                this.f33481b.c();
            }
        });
    }

    /* synthetic */ void c() {
        List<ett> listG = g();
        if (njy.e(listG)) {
            ReleaseLogUtil.d("Step_FaFormManager", "updateAllCardForScene faForms empty.");
        } else {
            c(listG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<ett> h() {
        Uri uri = Uri.parse("content://com.huawei.ohos.health.HealthDataAbility");
        ArrayList arrayList = new ArrayList();
        if (!e()) {
            ReleaseLogUtil.b("Step_FaFormManager", "getFaFormWithProvider uri is invalid");
            return arrayList;
        }
        String[] strArr = {"cardId", "cardSize", "cardType"};
        try {
            Cursor cursorQuery = BaseApplication.b().getContentResolver().query(uri, strArr, null, null, null);
            while (cursorQuery != null) {
                try {
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    ett ettVar = new ett();
                    ettVar.e(cursorQuery.getLong(cursorQuery.getColumnIndex(strArr[0])));
                    ettVar.e(cursorQuery.getInt(cursorQuery.getColumnIndex(strArr[1])));
                    ettVar.c(cursorQuery.getInt(cursorQuery.getColumnIndex(strArr[2])));
                    if (ettVar.e()) {
                        arrayList.add(ettVar);
                    }
                    ReleaseLogUtil.c("Step_FaFormManager", "getFaFormWithProvider.  Forms:", arrayList);
                    return arrayList;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                ReleaseLogUtil.c("Step_FaFormManager", "getFaFormWithProvider failed:", ExceptionUtils.c(e));
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e) {
            ReleaseLogUtil.c("Step_FaFormManager", "getFaFormWithProvider failed:", ExceptionUtils.c(e));
        }
        ReleaseLogUtil.c("Step_FaFormManager", "getFaFormWithProvider.  Forms:", arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String l() {
        if (!e()) {
            ReleaseLogUtil.b("Step_FaFormManager", "querySupportActiveRefresh uri is invalid");
            return "";
        }
        String[] strArr = {"HealthFaAbility"};
        try {
            Cursor cursorQuery = BaseApplication.b().getContentResolver().query(Uri.parse("content://com.huawei.ohos.health.HealthDataAbility"), strArr, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        int columnIndex = cursorQuery.getColumnIndex(strArr[0]);
                        if (columnIndex < 0) {
                            ReleaseLogUtil.c("Step_FaFormManager", "get ability failed with wrong result");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return "";
                        }
                        String string = cursorQuery.getString(columnIndex);
                        ReleaseLogUtil.c("Step_FaFormManager", "get ability set is:", string);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return string;
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e) {
            ReleaseLogUtil.c("Step_FaFormManager", "get isFaVersion2 failed:", ExceptionUtils.c(e));
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ReleaseLogUtil.c("Step_FaFormManager", "startHealthFaProcess enter.");
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setClassName(FaCardAgdsApi.STEP_FA_CARD_PACKAGE_NAME, "com.huawei.ohos.health.SpringBoardAbilityShellActivity");
            BaseApplication.b().startActivity(intent);
        } catch (Exception e) {
            ReleaseLogUtil.d("Step_FaFormManager", "startHealthFaProcess failed", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str, int i) {
        return str != null && i < str.length() && '1' == str.charAt((str.length() - 1) - i);
    }

    public boolean e() {
        Uri uri = Uri.parse("content://com.huawei.ohos.health.HealthDataAbility");
        if (uri == null) {
            LogUtil.j("Step_FaFormManager", "isValidUri  uri is null ");
            return false;
        }
        try {
            PackageManager packageManager = BaseApplication.b().getPackageManager();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(uri.getAuthority(), 0);
            if (providerInfoResolveContentProvider == null) {
                ReleaseLogUtil.d("Step_FaFormManager", "isValidUri providerInfo == null ");
                return false;
            }
            ApplicationInfo applicationInfo = providerInfoResolveContentProvider.applicationInfo;
            if (applicationInfo == null) {
                ReleaseLogUtil.d("Step_FaFormManager", "isValidUri applicationInfo == null ");
                return false;
            }
            String str = applicationInfo.packageName;
            if (!TextUtils.isEmpty(str)) {
                return (packageManager.checkSignatures(FaCardAgdsApi.STEP_FA_CARD_PACKAGE_NAME, str) == 0) || ((applicationInfo.flags & 1) == 1);
            }
            ReleaseLogUtil.d("Step_FaFormManager", "isValidUri packageName is null ");
            return false;
        } catch (RuntimeException e) {
            ReleaseLogUtil.b("Step_FaFormManager", "isValidUri exception", LogAnonymous.b(e));
            return false;
        }
    }
}
