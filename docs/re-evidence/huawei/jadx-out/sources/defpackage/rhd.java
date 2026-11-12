package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.adapter.HomeCardAdapter;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class rhd {
    public static void d(RecyclerView recyclerView, Context context, HomeCardAdapter homeCardAdapter) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(homeCardAdapter);
        recyclerView.setLayerType(2, null);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    static Map<String, Integer> c(Context context) {
        HashMap map = new HashMap();
        map.put(CardFlowInteractors.CardNameConstants.ACHIEVEMENT_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.ACHIEVEMENT_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.SPORT_RECORDING.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.SPORT_RECORDING.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.STEP_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.STEP_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.DIALOG_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.DIALOG_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.HEALTH_HEAD_LINES_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.HEALTH_HEAD_LINES_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.FUNCTION_SET_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.FUNCTION_SET_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.FUNCTION_MENU_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.FUNCTION_MENU_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.OPERATION_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.OPERATION_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.HEALTH_MODEL_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.HEALTH_MODEL_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.PREVIEW_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.PREVIEW_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.TODO_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.TODO_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.STEP_TREND_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.STEP_TREND_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.RUN_TREND_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.RUN_TREND_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.SMART_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.SMART_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.OPERA_MSG_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.OPERA_MSG_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.RUN_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.RUN_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.SPORTS_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.SPORTS_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.WEIGHT_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.WEIGHT_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.PLAN_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.PLAN_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.SLEEP_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.SLEEP_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.DEVICE_MANAGER_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.DEVICE_MANAGER_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.HEARTRATE_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.HEARTRATE_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.PHYSIOLOGICAL_CYCLE_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.PHYSIOLOGICAL_CYCLE_CARD.getDefaultIndex()));
        a(map);
        c(map);
        return CardFlowInteractors.a(context, map);
    }

    private static void a(Map<String, Integer> map) {
        if (Utils.m()) {
            return;
        }
        map.put(CardFlowInteractors.CardNameConstants.TRAIN_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.TRAIN_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.BLOODSUGAR_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.BLOODSUGAR_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.BLOODPRESSURE_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.BLOODPRESSURE_CARD.getDefaultIndex()));
        map.put(CardFlowInteractors.CardNameConstants.BLOODOXYGEN_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.BLOODOXYGEN_CARD.getDefaultIndex()));
    }

    private static void c(Map<String, Integer> map) {
        if (fua.k()) {
            map.put(CardFlowInteractors.CardNameConstants.HEALTH_TREND_CARD.getName(), Integer.valueOf(CardFlowInteractors.CardIDConstants.HEALTH_TREND_CARD.getDefaultIndex()));
        }
    }

    public static void c(Context context, c cVar, RecyclerView recyclerView, HomeCardAdapter homeCardAdapter) {
        CommonUtil.u("TimeEat_HomeFragmentUiManager-initData enter");
        Map<String, Integer> mapC = c(context);
        ArrayList<AbstractBaseCardData> arrayListA = cVar.a();
        AbstractBaseCardData abstractBaseCardDataD = cVar.d();
        if (abstractBaseCardDataD != null) {
            abstractBaseCardDataD.setCardPositionTag(mapC.get(CardFlowInteractors.CardNameConstants.ACHIEVEMENT_CARD.getName()).intValue());
            arrayListA.add(abstractBaseCardDataD);
        }
        AbstractBaseCardData abstractBaseCardDataG = cVar.g();
        if (abstractBaseCardDataG != null) {
            abstractBaseCardDataG.setCardPositionTag(mapC.get(CardFlowInteractors.CardNameConstants.FUNCTION_SET_CARD.getName()).intValue());
            arrayListA.add(abstractBaseCardDataG);
        }
        AbstractBaseCardData abstractBaseCardDataB = cVar.b();
        if (abstractBaseCardDataB != null) {
            abstractBaseCardDataB.setCardPositionTag(mapC.get(CardFlowInteractors.CardNameConstants.FUNCTION_MENU_CARD.getName()).intValue());
            arrayListA.add(abstractBaseCardDataB);
        }
        AbstractBaseCardData abstractBaseCardDataC = cVar.c();
        if (abstractBaseCardDataC != null) {
            abstractBaseCardDataC.setCardPositionTag(mapC.get(CardFlowInteractors.CardNameConstants.DIALOG_CARD.getName()).intValue());
            arrayListA.add(abstractBaseCardDataC);
        }
        AbstractBaseCardData abstractBaseCardDataK = cVar.k();
        if (abstractBaseCardDataK != null) {
            abstractBaseCardDataK.setCardPositionTag(mapC.get(CardFlowInteractors.CardNameConstants.TODO_CARD.getName()).intValue());
            arrayListA.add(abstractBaseCardDataK);
        }
        c(cVar, mapC, arrayListA);
        AbstractBaseCardData abstractBaseCardDataM = cVar.m();
        if (abstractBaseCardDataM != null) {
            abstractBaseCardDataM.setCardPositionTag(mapC.get(CardFlowInteractors.CardNameConstants.OPERATION_CARD.getName()).intValue());
            arrayListA.add(abstractBaseCardDataM);
        }
        AbstractBaseCardData abstractBaseCardDataI = cVar.i();
        if (abstractBaseCardDataI != null) {
            abstractBaseCardDataI.setCardPositionTag(mapC.get(CardFlowInteractors.CardNameConstants.OPERA_MSG_CARD.getName()).intValue());
            arrayListA.add(abstractBaseCardDataI);
        }
        AbstractBaseCardData abstractBaseCardDataF = cVar.f();
        if (abstractBaseCardDataF != null) {
            abstractBaseCardDataF.setCardPositionTag(mapC.get(CardFlowInteractors.CardNameConstants.FUNCTION_SET_CARD.getName()).intValue() - 1);
            arrayListA.add(abstractBaseCardDataF);
        }
        e(mapC, cVar, arrayListA);
        a(mapC, arrayListA, cVar);
        ArrayList<AbstractBaseCardData> arrayListE = cVar.e();
        LogUtil.d("HomeFragmentUiManager", "initData cardAllDatas=", arrayListE, ", mCardDatas=", arrayListA);
        d(homeCardAdapter, recyclerView, arrayListA, arrayListE);
    }

    private static void e(Map<String, Integer> map, c cVar, ArrayList<AbstractBaseCardData> arrayList) {
        AbstractBaseCardData abstractBaseCardDataO = cVar.o();
        if (abstractBaseCardDataO != null) {
            abstractBaseCardDataO.setCardPositionTag(map.get(CardFlowInteractors.CardNameConstants.STEP_CARD.getName()).intValue());
            arrayList.add(abstractBaseCardDataO);
        }
        AbstractBaseCardData abstractBaseCardDataL = cVar.l();
        if (abstractBaseCardDataL != null) {
            abstractBaseCardDataL.setCardPositionTag(map.get(CardFlowInteractors.CardNameConstants.STEP_CARD.getName()).intValue());
            arrayList.add(abstractBaseCardDataL);
        }
    }

    private static void c(c cVar, Map<String, Integer> map, ArrayList<AbstractBaseCardData> arrayList) {
        AbstractBaseCardData abstractBaseCardDataH = cVar.h();
        if (abstractBaseCardDataH != null) {
            abstractBaseCardDataH.setCardPositionTag(map.get(CardFlowInteractors.CardNameConstants.HEALTH_TREND_CARD.getName()).intValue());
            arrayList.add(abstractBaseCardDataH);
        }
    }

    private static void d(HomeCardAdapter homeCardAdapter, RecyclerView recyclerView, ArrayList<AbstractBaseCardData> arrayList, ArrayList<AbstractBaseCardData> arrayList2) {
        if (homeCardAdapter != null && recyclerView != null) {
            Collections.sort(arrayList);
            arrayList2.addAll(arrayList);
            homeCardAdapter.c(arrayList);
            recyclerView.getRecycledViewPool().clear();
            recyclerView.setAdapter(homeCardAdapter);
        }
        CommonUtil.u("TimeEat_HomeFragmentUiManager-Leave initData");
    }

    static void a(Map<String, Integer> map, ArrayList<AbstractBaseCardData> arrayList, c cVar) {
        AbstractBaseCardData abstractBaseCardDataJ = cVar.j();
        if (abstractBaseCardDataJ != null) {
            abstractBaseCardDataJ.setCardPositionTag(map.get(CardFlowInteractors.CardNameConstants.HEALTH_MODEL_CARD.getName()).intValue());
            arrayList.add(abstractBaseCardDataJ);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractBaseCardData f47327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AbstractBaseCardData f47328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<AbstractBaseCardData> f47329c;
        private AbstractBaseCardData d;
        private ArrayList<AbstractBaseCardData> e;
        private AbstractBaseCardData f;
        private AbstractBaseCardData g;
        private AbstractBaseCardData h;
        private AbstractBaseCardData i;
        private AbstractBaseCardData j;
        private AbstractBaseCardData l;
        private AbstractBaseCardData m;
        private AbstractBaseCardData n;
        private AbstractBaseCardData o;

        public AbstractBaseCardData o() {
            return this.o;
        }

        public AbstractBaseCardData f() {
            return this.f;
        }

        public void e(AbstractBaseCardData abstractBaseCardData) {
            this.f = abstractBaseCardData;
        }

        public void j(AbstractBaseCardData abstractBaseCardData) {
            this.l = abstractBaseCardData;
        }

        public AbstractBaseCardData l() {
            return this.l;
        }

        public AbstractBaseCardData d() {
            return this.f47328b;
        }

        public void b(AbstractBaseCardData abstractBaseCardData) {
            this.f47328b = abstractBaseCardData;
        }

        public AbstractBaseCardData g() {
            return this.h;
        }

        public void c(AbstractBaseCardData abstractBaseCardData) {
            this.h = abstractBaseCardData;
        }

        public AbstractBaseCardData b() {
            return this.d;
        }

        public void a(AbstractBaseCardData abstractBaseCardData) {
            this.d = abstractBaseCardData;
        }

        public AbstractBaseCardData h() {
            return this.i;
        }

        public void d(AbstractBaseCardData abstractBaseCardData) {
            this.i = abstractBaseCardData;
        }

        public AbstractBaseCardData m() {
            return this.n;
        }

        public void h(AbstractBaseCardData abstractBaseCardData) {
            this.n = abstractBaseCardData;
        }

        public AbstractBaseCardData k() {
            return this.m;
        }

        public ArrayList<AbstractBaseCardData> e() {
            return this.e;
        }

        public void e(ArrayList<AbstractBaseCardData> arrayList) {
            this.e = arrayList;
        }

        public ArrayList<AbstractBaseCardData> a() {
            return this.f47329c;
        }

        public void a(ArrayList<AbstractBaseCardData> arrayList) {
            this.f47329c = arrayList;
        }

        public AbstractBaseCardData j() {
            return this.g;
        }

        public AbstractBaseCardData i() {
            return this.j;
        }

        public void i(AbstractBaseCardData abstractBaseCardData) {
            this.j = abstractBaseCardData;
        }

        public AbstractBaseCardData c() {
            return this.f47327a;
        }

        public void d(sho shoVar) {
            this.f47327a = shoVar;
        }
    }
}
