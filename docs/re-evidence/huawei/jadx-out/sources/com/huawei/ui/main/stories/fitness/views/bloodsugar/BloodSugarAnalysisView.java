package com.huawei.ui.main.stories.fitness.views.bloodsugar;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarAnalysisView;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import com.huawei.ui.main.stories.health.util.BloodSugarSuperRuleEngineUtil;
import defpackage.njy;
import defpackage.ula;
import defpackage.uma;
import defpackage.umb;
import defpackage.umd;
import defpackage.umg;
import defpackage.uvz;
import defpackage.uwf;
import defpackage.uwh;
import defpackage.vgo;
import defpackage.vgw;
import defpackage.vil;
import defpackage.wuc;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarAnalysisView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<uma> f27202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<HiHealthData> f27203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BloodSugarAnalysisSportAdapter f27204c;
    private final Context d;
    private BloodSugarAnalysisDietView e;
    private final Handler f;
    private HealthSubHeader g;
    private boolean h;
    private LinearLayout i;
    private BloodSugarAnalysisDietView j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final BloodSugarSuperRuleEngineUtil p;
    private BloodSugarAnalysisDietView q;
    private String r;
    private LinearLayout s;
    private long t;
    private HealthRecycleView u;
    private List<umg> w;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public BloodSugarAnalysisView(Context context) {
        this(context, null);
    }

    public BloodSugarAnalysisView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BloodSugarAnalysisView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = false;
        this.o = false;
        this.l = false;
        this.n = false;
        this.m = false;
        this.k = false;
        this.f27203b = new ArrayList();
        this.t = 0L;
        this.r = "BLOOD_SUGAR_CONTINUE";
        this.d = context;
        this.f = new e(this);
        this.p = new BloodSugarSuperRuleEngineUtil(context);
        f();
    }

    public void setShowType(String str) {
        this.r = str;
    }

    private void f() {
        Context context = this.d;
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.health_data_blood_sugar_analysis, this);
        this.i = (LinearLayout) viewInflate.findViewById(R.id.blood_sugar_diet);
        this.s = (LinearLayout) viewInflate.findViewById(R.id.blood_sugar_sport);
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.blood_sugar_analysis_diet_title);
        this.g = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(0);
        ((HealthSubHeader) viewInflate.findViewById(R.id.blood_sugar_analysis_sport_title)).setSubHeaderBackgroundColor(0);
        this.u = (HealthRecycleView) viewInflate.findViewById(R.id.blood_sugar_analysis_sport_recycle);
        this.e = (BloodSugarAnalysisDietView) viewInflate.findViewById(R.id.blood_sugar_analysis_breakfast);
        this.q = (BloodSugarAnalysisDietView) viewInflate.findViewById(R.id.blood_sugar_analysis_lunch);
        this.j = (BloodSugarAnalysisDietView) viewInflate.findViewById(R.id.blood_sugar_analysis_dinner);
        this.e.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.s.setVisibility(8);
        this.f27204c = new BloodSugarAnalysisSportAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.d);
        linearLayoutManager.setOrientation(1);
        this.u.setLayoutManager(linearLayoutManager);
        this.u.setAdapter(this.f27204c);
    }

    private void d(long j, int i2, final List<uma> list) {
        if (j < 0) {
            return;
        }
        long j2 = j * 60000;
        final long jB = TimeUtil.b(j2);
        final long jA = TimeUtil.a(j2);
        if (i2 == 0) {
            if (njy.e(list)) {
                this.f27202a = null;
                return;
            }
            boolean z = true;
            if (this.f27202a != null && list.size() == this.f27202a.size()) {
                boolean z2 = false;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    uma umaVar = this.f27202a.get(i3);
                    uma umaVar2 = list.get(i3);
                    if (umaVar.m() != umaVar2.m() || umaVar.e() != umaVar2.e()) {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (this.m || z) {
                this.m = false;
                this.f27202a = list;
                this.h = false;
                this.o = false;
                this.l = false;
                ThreadPoolManager.c().execute(new Runnable() { // from class: ukq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50297b.c(jB, jA, list);
                    }
                });
                return;
            }
            return;
        }
        if (this.k || this.t != jB) {
            this.k = false;
            this.t = jB;
            uwf.d().b(jB, jA, new f(this));
        }
    }

    public /* synthetic */ void c(long j, long j2, List list) {
        if (CardConstants.e()) {
            LogUtil.a("BloodSugarAnalysisView", "the user has join diet diary");
            a(j, j2, list);
        }
    }

    public void setRefreshDiet(boolean z) {
        this.m = z;
    }

    public void setRefreshSport(boolean z) {
        this.k = z;
    }

    public void d() {
        this.t = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: uku
            @Override // java.lang.Runnable
            public final void run() {
                this.f50301c.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ukx
            @Override // java.lang.Runnable
            public final void run() {
                this.f50302a.e();
            }
        });
    }

    public /* synthetic */ void e() {
        this.s.setVisibility(8);
    }

    private void a(long j, long j2, List<uma> list) {
        int iA = DateFormatUtil.a(j);
        int iA2 = DateFormatUtil.a(j2);
        ReleaseLogUtil.c("BloodSugarAnalysisView", "getDietData startDate ", Integer.valueOf(iA), " endDate ", Integer.valueOf(iA2));
        vil.d(iA, iA2, (ResponseCallback<List<vgo>>) new b(this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<uma> list, List<vgw> list2) {
        int i2;
        HashMap map = new HashMap(0);
        for (uma umaVar : list) {
            if (umaVar.n() == 2008) {
                i2 = 10;
            } else if (umaVar.n() == 2010) {
                i2 = 20;
            } else if (umaVar.n() == 2012) {
                i2 = 30;
            } else {
                LogUtil.a("BloodSugarAnalysisView", "Type wrong!");
                i2 = -1;
            }
            for (vgw vgwVar : list2) {
                if (i2 > 0 && i2 == vgwVar.i()) {
                    map.put(umaVar, vgwVar);
                    break;
                }
            }
        }
        if (map.isEmpty()) {
            LogUtil.d("BloodSugarAnalysisView", "data = null");
            a();
        } else {
            this.p.d(new c(this, map));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<uma, vgw> map) {
        for (Map.Entry<uma, vgw> entry : map.entrySet()) {
            uma key = entry.getKey();
            vgw value = entry.getValue();
            if (value != null) {
                float fE = key.c().e();
                float fE2 = key.a().e();
                this.p.e(wuc.a(value.i()), fE, fE2, new d(this, value));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(umb umbVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = umbVar;
        this.f.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDietData(umb umbVar) {
        if (umbVar == null) {
            b();
            return;
        }
        int iC = umbVar.c();
        if (iC == 0) {
            this.e.setDietData(umbVar);
            this.h = true;
        } else if (iC == 1) {
            this.q.setDietData(umbVar);
            this.o = true;
        } else if (iC == 2) {
            this.j.setDietData(umbVar);
            this.l = true;
        } else {
            LogUtil.j("BloodSugarAnalysisView", "TYPE is wrong");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public umb b(String str, vgw vgwVar) {
        String strC = wuc.c(this.d, vgwVar.i());
        int iRound = Math.round(wuc.d(vgwVar));
        umb umbVar = new umb();
        umbVar.c(wuc.a(vgwVar.i()));
        umbVar.a(vgwVar.e());
        umbVar.d(iRound);
        umbVar.d(strC);
        umbVar.c(wuc.c(vgwVar));
        umbVar.a(vgwVar.i());
        umbVar.a(vgwVar.d());
        if (!"".equals(str)) {
            int identifier = this.d.getResources().getIdentifier(str, "string", BaseApplication.b().getPackageName());
            if (iRound > 0) {
                str = this.d.getResources().getString(identifier, e(String.valueOf(iRound)));
            } else {
                str = this.d.getResources().getString(identifier);
            }
        }
        umbVar.e(str);
        return umbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getSportBloodSugarData() {
        long startTime;
        long endTime;
        if (this.w.size() == 1) {
            umg umgVar = this.w.get(0);
            startTime = umgVar.getStartTime() - 1800000;
            endTime = umgVar.getEndTime();
        } else {
            int size = this.w.size();
            umg umgVar2 = this.w.get(0);
            startTime = this.w.get(size - 1).getStartTime() - 1800000;
            endTime = umgVar2.getEndTime();
        }
        ula.c().e(startTime, endTime + 1800000, new int[]{2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2106}, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ArrayList arrayList = new ArrayList(16);
        HiHealthData hiHealthData = new HiHealthData();
        HiHealthData hiHealthData2 = new HiHealthData();
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            umd umdVar = new umd();
            umg umgVar = this.w.get(i2);
            if (umgVar != null) {
                long startTime = umgVar.getStartTime();
                long endTime = umgVar.getEndTime();
                long j = startTime;
                for (HiHealthData hiHealthData3 : this.f27203b) {
                    if (hiHealthData3 != null) {
                        long startTime2 = hiHealthData3.getStartTime();
                        if (startTime > startTime2) {
                            long j2 = startTime - startTime2;
                            if (j2 < j) {
                                hiHealthData = hiHealthData3;
                                j = j2;
                            }
                        }
                        if (startTime2 > endTime) {
                            hiHealthData2 = hiHealthData3;
                            break;
                        }
                    }
                }
                if (j <= 1800000) {
                    umdVar.a(hiHealthData);
                    umdVar.d(hiHealthData2);
                    umdVar.a(umgVar);
                    arrayList.add(umdVar);
                }
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j("BloodSugarAnalysisView", "bloodSugarSportBeanList is empty");
            if (this.s.getVisibility() == 0) {
                g();
                return;
            }
            return;
        }
        this.p.d(new c(this, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportBloodSugarSuggest(List<umd> list) {
        AtomicInteger atomicInteger = new AtomicInteger(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            umd umdVar = list.get(i2);
            this.p.a(umdVar.d().getFloatValue(), umdVar.b().getFloatValue(), new i(this, list, atomicInteger, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<umd> list) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = list;
        this.f.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str, String[] strArr) {
        if (strArr == null) {
            return "";
        }
        Resources resources = this.d.getResources();
        int identifier = resources.getIdentifier(str, "string", BaseApplication.b().getPackageName());
        if (strArr.length == 0) {
            return resources.getString(identifier);
        }
        if (strArr.length == 1) {
            return resources.getString(identifier, e(strArr[0]));
        }
        if (strArr.length != 2) {
            return "";
        }
        return resources.getString(identifier, e(strArr[0]), e(strArr[1]));
    }

    private String e(String str) {
        try {
            return this.d.getResources().getQuantityString(R.plurals.IDS_gravity_unit_with_value, Integer.parseInt(str), Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            LogUtil.e("BloodSugarAnalysisView", "Integer.parseInt(num) is error");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportBloodSugarView(List<umd> list) {
        if (njy.e(list) || !i()) {
            LogUtil.j("BloodSugarAnalysisView", "mBloodSugarSportBean is null or is not FingerTip!");
            this.s.setVisibility(8);
        } else {
            this.s.setVisibility(0);
            this.f27204c.d(list);
        }
    }

    private void m() {
        if (this.n || this.h || this.o || this.l) {
            this.e.setVisibility(0);
            this.q.setVisibility(0);
            this.j.setVisibility(0);
        } else {
            this.e.setVisibility(8);
            this.q.setVisibility(8);
            this.j.setVisibility(8);
        }
    }

    public void c() {
        this.g.setVisibility(8);
        this.i.setVisibility(8);
        this.s.setVisibility(8);
    }

    private boolean i() {
        return "BLOOD_SUGAR_FINGER_TIP".equals(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b() {
        boolean z = this.h;
        if (!z && !this.o && !this.l) {
            LogUtil.a("BloodSugarAnalysisView", "DietView is GONE");
            this.e.setDietRootVisibility(8);
            this.q.setDietRootVisibility(8);
            this.j.setDietRootVisibility(8);
            return;
        }
        if (z) {
            this.e.setDietRootVisibility(0);
        } else {
            this.e.setDietRootVisibility(8);
        }
        if (this.o) {
            this.q.setDietRootVisibility(0);
        } else {
            this.q.setDietRootVisibility(8);
        }
        if (this.l) {
            this.j.setDietRootVisibility(0);
        } else {
            this.j.setDietRootVisibility(8);
        }
    }

    public void setSportDiffView(long j) {
        d(j, 1, (List<uma>) null);
    }

    public void setDiffData(Map<Long, IStorageModel> map, long j) {
        d(j, 0, b(map));
    }

    private List<uma> b(Map<Long, IStorageModel> map) {
        if (map == null || map.size() == 0) {
            this.n = false;
            this.g.setVisibility(8);
            m();
            return null;
        }
        Map<Long, IStorageModel> mapC = c(map);
        ArrayList arrayList = new ArrayList(mapC.size());
        Iterator<Map.Entry<Long, IStorageModel>> it = mapC.entrySet().iterator();
        while (it.hasNext()) {
            IStorageModel value = it.next().getValue();
            if (value instanceof uma) {
                arrayList.add((uma) value);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: ukv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((uma) obj).n(), ((uma) obj2).n());
            }
        });
        if (njy.e(arrayList) || !i()) {
            this.i.setVisibility(8);
            this.n = false;
            this.g.setVisibility(8);
            m();
            return null;
        }
        this.i.setVisibility(0);
        this.n = true;
        m();
        int size = arrayList.size();
        if (size == 1) {
            c(arrayList);
            return arrayList;
        }
        if (size == 2) {
            b(arrayList);
            return arrayList;
        }
        if (size == 3) {
            e(arrayList);
            return arrayList;
        }
        LogUtil.j("BloodSugarAnalysisView", " mBloodSugarModels size is wrong ");
        return arrayList;
    }

    private void c(BloodSugarAnalysisDietView bloodSugarAnalysisDietView, int i2, uma umaVar) {
        bloodSugarAnalysisDietView.setVisibility(0);
        this.g.setVisibility(0);
        umb umbVar = new umb();
        umbVar.c(i2);
        umbVar.b(umaVar.e());
        umbVar.e(umaVar.h());
        bloodSugarAnalysisDietView.setDiffData(umbVar, umaVar);
    }

    private void c(List<uma> list) {
        uma umaVar = list.get(0);
        if (umaVar.n() == 2008) {
            this.q.setVisibility(8);
            this.j.setVisibility(8);
            c(this.e, 0, umaVar);
        } else if (umaVar.n() == 2010) {
            this.e.setVisibility(8);
            this.j.setVisibility(8);
            c(this.q, 1, umaVar);
        } else {
            if (umaVar.n() == 2012) {
                this.e.setVisibility(8);
                this.q.setVisibility(8);
                c(this.j, 2, umaVar);
                return;
            }
            LogUtil.j("BloodSugarAnalysisView", " updateOneDifference Type wrong!");
        }
    }

    private void b(List<uma> list) {
        uma umaVar = list.get(0);
        uma umaVar2 = list.get(1);
        int iN = umaVar.n();
        int iN2 = umaVar2.n();
        if (iN == 2008 && iN2 == 2010) {
            this.j.setVisibility(8);
            c(this.e, 0, umaVar);
            c(this.q, 1, umaVar2);
        } else if (iN == 2010 && iN2 == 2012) {
            this.e.setVisibility(8);
            c(this.q, 1, umaVar);
            c(this.j, 2, umaVar2);
        } else {
            this.q.setVisibility(8);
            c(this.e, 0, umaVar);
            c(this.j, 2, umaVar2);
        }
    }

    private void e(List<uma> list) {
        uma umaVar = list.get(0);
        uma umaVar2 = list.get(1);
        uma umaVar3 = list.get(2);
        c(this.e, 0, umaVar);
        c(this.q, 1, umaVar2);
        c(this.j, 2, umaVar3);
    }

    private Map<Long, IStorageModel> c(Map<Long, IStorageModel> map) {
        HashMap map2 = new HashMap(16);
        if (map == null || map.size() == 0) {
            LogUtil.j("BloodSugarAnalysisView", "fitnessBloodSugarDayData bloodModelMaps can not null");
            return map2;
        }
        List<uwh> listE = e(map);
        if (njy.b(listE)) {
            ArrayList arrayList = new ArrayList(16);
            ArrayList arrayList2 = new ArrayList(16);
            ArrayList arrayList3 = new ArrayList(16);
            ArrayList arrayList4 = new ArrayList(16);
            ArrayList arrayList5 = new ArrayList(16);
            ArrayList arrayList6 = new ArrayList(16);
            for (uwh uwhVar : listE) {
                switch ((int) uwhVar.m()) {
                    case 2008:
                        arrayList.add(uwhVar);
                        break;
                    case 2009:
                        arrayList2.add(uwhVar);
                        break;
                    case 2010:
                        arrayList3.add(uwhVar);
                        break;
                    case 2011:
                        arrayList4.add(uwhVar);
                        break;
                    case 2012:
                        arrayList5.add(uwhVar);
                        break;
                    case 2013:
                        arrayList6.add(uwhVar);
                        break;
                }
            }
            c(map2, arrayList, arrayList2);
            c(map2, arrayList3, arrayList4);
            c(map2, arrayList5, arrayList6);
        }
        return map2;
    }

    private List<uwh> e(Map<Long, IStorageModel> map) {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Long, IStorageModel>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            IStorageModel value = it.next().getValue();
            if (value instanceof uma) {
                uma umaVar = (uma) value;
                uwh uwhVar = new uwh();
                uwhVar.e(umaVar.e());
                uwhVar.c(umaVar.n());
                uwhVar.e(umaVar.m());
                arrayList.add(uwhVar);
            }
        }
        return arrayList;
    }

    private void c(Map<Long, IStorageModel> map, List<uwh> list, List<uwh> list2) {
        uwh uwhVarValueAt;
        if (list == null || list2 == null || list.isEmpty() || list2.isEmpty()) {
            LogUtil.j("BloodSugarAnalysisView", "The beforeMealList or afterMealList is Null or Empty");
            return;
        }
        SparseArray<uwh> sparseArrayD = d(list);
        SparseArray<uwh> sparseArrayD2 = d(list2);
        if (sparseArrayD == null || sparseArrayD2 == null) {
            LogUtil.j("BloodSugarAnalysisView", "The beforeMealUniqueData or afterMealUniqueData is Empty");
            return;
        }
        int size = sparseArrayD.size();
        for (int i2 = 0; i2 < size; i2++) {
            uwh uwhVar = sparseArrayD2.get(sparseArrayD.keyAt(i2));
            if (uwhVar != null && !Double.isNaN(uwhVar.o()) && (uwhVarValueAt = sparseArrayD.valueAt(i2)) != null && !Double.isNaN(uwhVarValueAt.o())) {
                float fO = ((float) uwhVarValueAt.o()) - ((float) uwhVar.o());
                uma umaVar = new uma(Math.abs(fO), (int) uwhVarValueAt.m(), Math.abs(fO) > 3.3f ? 2 : 1);
                umaVar.b(uwhVarValueAt.g());
                float fO2 = (float) uwhVarValueAt.o();
                int iM = (int) uwhVarValueAt.m();
                uma umaVar2 = new uma(fO2, iM, c(this.d, fO2, iM));
                umaVar2.b(uwhVarValueAt.g());
                umaVar.e(umaVar2);
                float fO3 = (float) uwhVar.o();
                int iM2 = (int) uwhVar.m();
                uma umaVar3 = new uma(fO3, iM2, c(this.d, fO3, iM2));
                umaVar3.b(uwhVar.g());
                umaVar.a(umaVar3);
                map.put(Long.valueOf(uwhVarValueAt.g()), umaVar);
            }
        }
    }

    private SparseArray<uwh> d(List<uwh> list) {
        SparseArray<uwh> sparseArray = new SparseArray<>();
        if (list == null) {
            LogUtil.j("BloodSugarAnalysisView", "The healthDataList is null, return null");
            return sparseArray;
        }
        Collections.sort(list, new Comparator() { // from class: uky
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((uwh) obj).g(), ((uwh) obj2).g());
            }
        });
        for (uwh uwhVar : list) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(uwhVar.g());
            sparseArray.put((calendar.get(1) * 10000) + (calendar.get(2) * 100) + calendar.get(5), uwhVar);
        }
        return sparseArray;
    }

    private int c(Context context, float f2, int i2) {
        Map<String, String> mapD = uvz.d(context, i2, f2);
        if (!mapD.containsKey("HEALTH_BLOOD_SUGAR_LEVEL_KEY")) {
            return 1000;
        }
        try {
            return Integer.parseInt(mapD.get("HEALTH_BLOOD_SUGAR_LEVEL_KEY"));
        } catch (NumberFormatException unused) {
            LogUtil.j("BloodSugarAnalysisView", "levelValue is String, parse to Integer error");
            return 1000;
        }
    }

    static class c implements BloodSugarSuperRuleEngineUtil.LoadJsCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f27207a;
        private final WeakReference<BloodSugarAnalysisView> d;

        c(BloodSugarAnalysisView bloodSugarAnalysisView, Object obj) {
            this.d = new WeakReference<>(bloodSugarAnalysisView);
            this.f27207a = obj;
        }

        @Override // com.huawei.ui.main.stories.health.util.BloodSugarSuperRuleEngineUtil.LoadJsCallBack
        public void onLoad(boolean z) {
            BloodSugarAnalysisView bloodSugarAnalysisView = this.d.get();
            if (bloodSugarAnalysisView == null) {
                return;
            }
            if (!z) {
                LogUtil.j("BloodSugarAnalysisView", "Load js code failed");
                return;
            }
            Object obj = this.f27207a;
            if (obj instanceof List) {
                bloodSugarAnalysisView.setSportBloodSugarSuggest((List) obj);
            } else if (obj instanceof Map) {
                bloodSugarAnalysisView.a((Map<uma, vgw>) obj);
            } else {
                LogUtil.a("BloodSugarAnalysisView", "Load js code success, but do not any things");
            }
        }
    }

    static class d implements BloodSugarSuperRuleEngineUtil.BloodSugarFactCallBack {
        private final vgw d;
        private final WeakReference<BloodSugarAnalysisView> e;

        d(BloodSugarAnalysisView bloodSugarAnalysisView, vgw vgwVar) {
            this.e = new WeakReference<>(bloodSugarAnalysisView);
            this.d = vgwVar;
        }

        @Override // com.huawei.ui.main.stories.health.util.BloodSugarSuperRuleEngineUtil.BloodSugarFactCallBack
        public void onFactCallback(boolean z, String str, String[] strArr) {
            BloodSugarAnalysisView bloodSugarAnalysisView = this.e.get();
            if (bloodSugarAnalysisView == null) {
                return;
            }
            LogUtil.d("BloodSugarAnalysisView", "isMatched=", Boolean.valueOf(z), ", suggestion=", str);
            bloodSugarAnalysisView.a((z && StringUtils.j(str)) ? bloodSugarAnalysisView.b(str, this.d) : bloodSugarAnalysisView.b("", this.d));
        }
    }

    static class i implements BloodSugarSuperRuleEngineUtil.BloodSugarFactCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<BloodSugarAnalysisView> f27209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<umd> f27210c;
        private final AtomicInteger e;

        i(BloodSugarAnalysisView bloodSugarAnalysisView, List<umd> list, AtomicInteger atomicInteger, int i) {
            this.f27209b = new WeakReference<>(bloodSugarAnalysisView);
            this.e = atomicInteger;
            this.f27210c = list;
            this.f27208a = i;
        }

        @Override // com.huawei.ui.main.stories.health.util.BloodSugarSuperRuleEngineUtil.BloodSugarFactCallBack
        public void onFactCallback(boolean z, String str, String[] strArr) {
            BloodSugarAnalysisView bloodSugarAnalysisView = this.f27209b.get();
            if (bloodSugarAnalysisView == null) {
                return;
            }
            LogUtil.d("BloodSugarAnalysisView", "isMatched=", Boolean.valueOf(z), ", suggestion=", str);
            if (z && StringUtils.j(str)) {
                this.f27210c.get(this.f27208a).e(bloodSugarAnalysisView.c(str, strArr));
            }
            if (this.e.decrementAndGet() == 0) {
                bloodSugarAnalysisView.a(this.f27210c);
            }
        }
    }

    /* JADX INFO: loaded from: classes43.dex */
    static class e extends BaseHandler<BloodSugarAnalysisView> {
        e(BloodSugarAnalysisView bloodSugarAnalysisView) {
            super(bloodSugarAnalysisView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BloodSugarAnalysisView bloodSugarAnalysisView, Message message) {
            int i = message.what;
            if (i == 0) {
                bloodSugarAnalysisView.b();
                return;
            }
            if (i == 1) {
                bloodSugarAnalysisView.setDietData(message.obj instanceof umb ? (umb) message.obj : null);
            } else {
                if (i != 2) {
                    return;
                }
                bloodSugarAnalysisView.setSportBloodSugarView(message.obj instanceof List ? (List) message.obj : null);
            }
        }
    }

    public static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BloodSugarAnalysisView> f27205c;

        a(BloodSugarAnalysisView bloodSugarAnalysisView) {
            this.f27205c = new WeakReference<>(bloodSugarAnalysisView);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            BloodSugarAnalysisView bloodSugarAnalysisView = this.f27205c.get();
            if (bloodSugarAnalysisView == null) {
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                if (!list.isEmpty()) {
                    LogUtil.a("BloodSugarAnalysisView", "getFingertipsBloodSugarData hasData count = ", Integer.valueOf(list.size()));
                    Collections.sort(list, new Comparator() { // from class: ukw
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return BloodSugarAnalysisView.a.e((HiHealthData) obj2, (HiHealthData) obj3);
                        }
                    });
                    bloodSugarAnalysisView.f27203b = list;
                    bloodSugarAnalysisView.j();
                    return;
                }
            }
            LogUtil.j("BloodSugarAnalysisView", "getSportBloodSugarData is Empty");
            bloodSugarAnalysisView.g();
        }

        public static /* synthetic */ int e(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return (int) (hiHealthData.getStartTime() - hiHealthData2.getStartTime());
        }
    }

    static class f implements IBaseResponseCallback {
        private final WeakReference<BloodSugarAnalysisView> e;

        f(BloodSugarAnalysisView bloodSugarAnalysisView) {
            this.e = new WeakReference<>(bloodSugarAnalysisView);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            BloodSugarAnalysisView bloodSugarAnalysisView = this.e.get();
            if (bloodSugarAnalysisView == null) {
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                if (!list.isEmpty()) {
                    bloodSugarAnalysisView.w = list;
                    bloodSugarAnalysisView.getSportBloodSugarData();
                    return;
                }
            }
            bloodSugarAnalysisView.g();
        }
    }

    static class b implements ResponseCallback<List<vgo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<BloodSugarAnalysisView> f27206a;
        private final List<uma> e;

        public b(BloodSugarAnalysisView bloodSugarAnalysisView, List<uma> list) {
            this.f27206a = new WeakReference<>(bloodSugarAnalysisView);
            this.e = list;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<vgo> list) {
            LogUtil.a("BloodSugarAnalysisView", "DietDiaryCallback errorCode ", Integer.valueOf(i), " list ", list);
            BloodSugarAnalysisView bloodSugarAnalysisView = this.f27206a.get();
            if (bloodSugarAnalysisView == null) {
                ReleaseLogUtil.d("BloodSugarAnalysisView", "DietDiaryCallback view is null");
                return;
            }
            if (njy.e(list)) {
                bloodSugarAnalysisView.a();
                return;
            }
            vgo vgoVar = list.get(0);
            if (vgoVar == null) {
                bloodSugarAnalysisView.a();
                return;
            }
            if (vgoVar.d() == null) {
                bloodSugarAnalysisView.a();
                return;
            }
            List<vgw> listA = vgoVar.a();
            if (njy.e(listA)) {
                bloodSugarAnalysisView.a();
            } else {
                bloodSugarAnalysisView.d(this.e, listA);
            }
        }
    }
}
