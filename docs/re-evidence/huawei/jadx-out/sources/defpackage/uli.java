package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.util.Pair;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarDietMonitorCardView;
import health.compact.a.HiDateUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class uli {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f50314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f50315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f50316c;
    private Context d;
    private List<e> e;
    private Handler g;
    private int i;
    private ViewGroup j;

    public uli(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return;
        }
        this.d = context;
        this.j = viewGroup;
        ((HealthSubHeader) viewGroup.findViewById(R.id.diet_monitor_subheader)).setSubHeaderBackgroundColor(0);
        this.f50314a = (LinearLayout) viewGroup.findViewById(R.id.blood_sugar_diet_monitor_container);
    }

    public void d() {
        this.j.setVisibility(8);
    }

    public void c(long j, boolean z) {
        long j2 = j * 60000;
        long jP = HiDateUtil.p(j2);
        if (!z && this.f50315b == jP) {
            this.j.setVisibility(this.i);
            return;
        }
        synchronized (this) {
            try {
                this.f50316c = System.currentTimeMillis();
                LogUtil.a("BloodSugarDietMonitorViewHolder", "tryShowMonitorView, eventTag=", Long.valueOf(this.f50316c));
                List<e> list = this.e;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b();
        this.f50314a.removeAllViews();
        this.f50315b = jP;
        LogUtil.a("BloodSugarDietMonitorViewHolder", "tryShowMonitorView, ", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(jP)));
        c(this.f50316c, jP, HiDateUtil.g(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.i = 0;
        this.j.setVisibility(0);
    }

    private void b() {
        this.i = 8;
        this.j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j, List<HiHealthData> list, vgw vgwVar) {
        synchronized (this) {
            if (j != this.f50316c) {
                LogUtil.j("BloodSugarDietMonitorViewHolder", "eventTag is different");
                return;
            }
            if (!list.isEmpty()) {
                if (this.e == null) {
                    this.e = new ArrayList(0);
                    this.g = new Handler(Looper.getMainLooper());
                }
                umb umbVarE = e(vgwVar);
                umbVarE.c(c(list));
                this.e.add(new e(umbVarE, b(list), emq.d()));
                LogUtil.a("BloodSugarDietMonitorViewHolder", "taskList=", Integer.valueOf(this.e.size()));
            } else {
                LogUtil.a("BloodSugarDietMonitorViewHolder", "hiHealthDataList is empty");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j, AtomicInteger atomicInteger) {
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        LogUtil.a("BloodSugarDietMonitorViewHolder", "onQueryDataFinish count=", Integer.valueOf(iDecrementAndGet));
        if (iDecrementAndGet == 0) {
            synchronized (this) {
                List<e> list = this.e;
                if (list == null) {
                    LogUtil.a("BloodSugarDietMonitorViewHolder", "onQueryDataFinish mTaskList == null");
                } else {
                    Collections.sort(list, new Comparator() { // from class: ule
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return uli.d((uli.e) obj, (uli.e) obj2);
                        }
                    });
                    this.g.post(new d(this, j));
                }
            }
        }
    }

    static /* synthetic */ int d(e eVar, e eVar2) {
        int iG;
        int iG2;
        if (eVar.f50319a.l() != eVar2.f50319a.l()) {
            iG = eVar.f50319a.l();
            iG2 = eVar2.f50319a.l();
        } else {
            iG = eVar.f50319a.g();
            iG2 = eVar2.f50319a.g();
        }
        return iG - iG2;
    }

    private void c(long j, long j2, long j3) {
        int iA = DateFormatUtil.a(j2);
        int iA2 = DateFormatUtil.a(j3);
        ReleaseLogUtil.c("BloodSugarDietMonitorViewHolder", "getDiet startDate ", Integer.valueOf(iA), " endDate ", Integer.valueOf(iA2));
        vil.d(iA, iA2, (ResponseCallback<List<vgo>>) new a(this, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j, List<vgo> list) {
        vgo vgoVar;
        if (njy.e(list) || (vgoVar = list.get(0)) == null) {
            return;
        }
        if (vgoVar.d() == null) {
            LogUtil.a("BloodSugarDietMonitorViewHolder", "overview is null");
            return;
        }
        List<vgw> listA = vgoVar.a();
        if (njy.e(listA)) {
            LogUtil.a("BloodSugarDietMonitorViewHolder", "meals is empty");
            return;
        }
        LogUtil.a("BloodSugarDietMonitorViewHolder", "meals size=", Integer.valueOf(listA.size()));
        AtomicInteger atomicInteger = new AtomicInteger(listA.size());
        for (vgw vgwVar : listA) {
            if (wuc.d(vgwVar) <= 0.0f || vgwVar.f() == 0) {
                LogUtil.a("BloodSugarDietMonitorViewHolder", "countCarbohydrate=", Float.valueOf(wuc.d(vgwVar)), ", setTime=", Long.valueOf(vgwVar.f()));
                c(j, atomicInteger);
            } else {
                long jF = vgwVar.f() * 1000;
                d(j, atomicInteger, jF, jF + AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL, vgwVar);
            }
        }
    }

    private void d(long j, AtomicInteger atomicInteger, long j2, long j3, vgw vgwVar) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(new int[]{2108});
        hiDataReadOption.setStartTime(j2);
        hiDataReadOption.setEndTime(j3);
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setSortOrder(0);
        ula.c().e(j2, j3, hiDataReadOption.getType(), new b(this, j, atomicInteger, vgwVar));
    }

    private float c(List<HiHealthData> list) {
        Iterator<HiHealthData> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (b(it.next()) == 1003) {
                i++;
            }
        }
        return new BigDecimal(((double) (i * 100)) / ((double) list.size())).setScale(2, 4).floatValue();
    }

    private int b(HiHealthData hiHealthData) {
        try {
            return Integer.parseInt(uvz.d(BaseApplication.getContext(), hiHealthData.getType(), hiHealthData.getFloatValue()).get("HEALTH_BLOOD_SUGAR_LEVEL_KEY"));
        } catch (NumberFormatException unused) {
            LogUtil.j("BloodSugarDietMonitorViewHolder", "levelValue is String, parse to Integer error");
            return 1000;
        }
    }

    private List<Pair<Long, Float>> b(List<HiHealthData> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            arrayList.add(new Pair(Long.valueOf(hiHealthData.getEndTime()), Float.valueOf(hiHealthData.getFloatValue())));
        }
        return arrayList;
    }

    private umb e(vgw vgwVar) {
        umb umbVar = new umb();
        String strC = wuc.c(this.d, vgwVar.i());
        umbVar.e(vgwVar.f());
        umbVar.a(vgwVar.i());
        umbVar.d(vgwVar.a());
        umbVar.d(strC);
        umbVar.c(wuc.c(vgwVar));
        umbVar.a(vgwVar.e());
        umbVar.d(wuc.d(vgwVar));
        umbVar.a(vgwVar.d());
        return umbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        int iA = wuc.a(i);
        if (iA == -1) {
            return;
        }
        HashMap map = new HashMap(2);
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_ANALYSIS_FEED_CONTINUE_2040138.value();
        map.put("click", "1");
        map.put("type", Integer.valueOf(iA));
        idy.b(strValue, map);
    }

    static class d implements Runnable {
        private final WeakReference<uli> d;
        private final long e;

        d(uli uliVar, long j) {
            this.d = new WeakReference<>(uliVar);
            this.e = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            uli uliVar = this.d.get();
            if (uliVar == null) {
                return;
            }
            if (this.e == uliVar.f50316c) {
                if (uliVar.e.isEmpty()) {
                    LogUtil.j("BloodSugarDietMonitorViewHolder", "AddViewRunnable taskList is empty");
                    return;
                }
                LogUtil.a("BloodSugarDietMonitorViewHolder", "showMonitorView, eventTag=", Long.valueOf(this.e));
                uliVar.e();
                for (int i = 0; i < uliVar.e.size(); i++) {
                    e eVar = (e) uliVar.e.get(i);
                    BloodSugarDietMonitorCardView bloodSugarDietMonitorCardView = new BloodSugarDietMonitorCardView(uliVar.d);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    if (i != 0) {
                        layoutParams.topMargin = uliVar.f50314a.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                    }
                    uliVar.f50314a.addView(bloodSugarDietMonitorCardView, layoutParams);
                    long jN = 1000 * eVar.f50319a.n();
                    bloodSugarDietMonitorCardView.e(eVar.f50319a, eVar.f50320b, jN, AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL + jN, eVar.d);
                    uliVar.e(eVar.f50319a.l());
                }
                return;
            }
            LogUtil.j("BloodSugarDietMonitorViewHolder", "AddViewRunnable eventTag is different");
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final umb f50319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Pair<Long, Float>> f50320b;
        private final float[] d;

        e(umb umbVar, List<Pair<Long, Float>> list, float[] fArr) {
            this.f50319a = umbVar;
            this.f50320b = list;
            this.d = fArr;
        }
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<uli> f50317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f50318c;
        private final AtomicInteger d;
        private final vgw e;

        b(uli uliVar, long j, AtomicInteger atomicInteger, vgw vgwVar) {
            this.f50317b = new WeakReference<>(uliVar);
            this.f50318c = j;
            this.d = atomicInteger;
            this.e = vgwVar;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            uli uliVar = this.f50317b.get();
            if (uliVar == null) {
                return;
            }
            if (obj instanceof List) {
                uliVar.b(this.f50318c, (List<HiHealthData>) obj, this.e);
            }
            uliVar.c(this.f50318c, this.d);
        }
    }

    static class a implements ResponseCallback<List<vgo>> {
        private final long d;
        private final WeakReference<uli> e;

        a(uli uliVar, long j) {
            this.e = new WeakReference<>(uliVar);
            this.d = j;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<vgo> list) {
            LogUtil.a("BloodSugarDietMonitorViewHolder", "DietCallBack errorCode ", Integer.valueOf(i), " list ", list);
            uli uliVar = this.e.get();
            if (uliVar != null) {
                uliVar.e(this.d, list);
            } else {
                ReleaseLogUtil.d("BloodSugarDietMonitorViewHolder", "DietCallBack view is null");
            }
        }
    }
}
