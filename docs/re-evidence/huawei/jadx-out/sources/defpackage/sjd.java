package defpackage;

import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.functionsetcard.manager.ICardManager;
import com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardShowStrategy;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sjd implements CardShowStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ICardManager f48163c;
    private boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Observer f48162b = new Observer() { // from class: sjd.4
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (str == null) {
                return;
            }
            str.hashCode();
            if (!str.equals("NOTIFY_STEP_CARD_CHANGED")) {
                if (str.equals(ObserveLabels.HEALTH_LIFE_VERSION)) {
                    LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "notify HEALTH_LIFE_VERSION");
                    if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof Integer)) {
                        return;
                    }
                    sjd.this.a();
                    return;
                }
                return;
            }
            LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "notify step card status changed");
            if (objArr == null || objArr.length <= 0) {
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof String) {
                sjd.this.d((String) obj);
            }
        }
    };

    public sjd(ICardManager iCardManager) {
        this.f48163c = iCardManager;
        c();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardShowStrategy
    public void doStrategy() {
        e();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardShowStrategy
    public void release() {
        b();
    }

    private void c() {
        Observer observer;
        if (this.d || (observer = this.f48162b) == null) {
            return;
        }
        ObserverManagerUtil.d(observer, "NOTIFY_STEP_CARD_CHANGED");
        ObserverManagerUtil.d(this.f48162b, ObserveLabels.HEALTH_LIFE_VERSION);
        this.d = true;
    }

    private void b() {
        if (this.d) {
            ObserverManagerUtil.a(this.f48162b, "NOTIFY_STEP_CARD_CHANGED");
            ObserverManagerUtil.a(this.f48162b, ObserveLabels.HEALTH_LIFE_VERSION);
            this.d = false;
        }
    }

    private void e() {
        ICardManager iCardManager = this.f48163c;
        if (iCardManager == null) {
            LogUtil.j("FunctionCard_ThreeCircleCardStrategy", "addThreeCircleToCurrentConfig mCardImpl is null");
            return;
        }
        sit currentConfigs = iCardManager.getCurrentConfigs();
        sit defaultConfigs = this.f48163c.getDefaultConfigs();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(currentConfigs.c());
        List<String> listC = siu.c(arrayList);
        String name = CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName();
        if (listC.contains(name)) {
            LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "cardConfigList already have three circle");
            return;
        }
        LinkedList<CardConfig> linkedList = new LinkedList<>();
        for (CardConfig cardConfig : currentConfigs.c()) {
            if (cardConfig != null && cardConfig.getCardId() != null && !cardConfig.getCardId().equals(CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName())) {
                linkedList.add(cardConfig);
            }
        }
        CardConfig cardConfig2 = new CardConfig();
        for (CardConfig cardConfig3 : defaultConfigs.c()) {
            if (cardConfig3 != null && cardConfig3.getCardId() != null && cardConfig3.getCardId().equals(CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName())) {
                cardConfig3.setShowFlag(2);
                cardConfig2 = cardConfig3;
            }
        }
        linkedList.add(cardConfig2);
        currentConfigs.e(linkedList);
        List<six> listA = currentConfigs.a();
        if (listA.size() < 4) {
            LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "group type size is less than 4, please check");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(listA.get(3).a());
        if (arrayList2.contains(name)) {
            LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "marketingGroup already have three circle");
            return;
        }
        arrayList2.add(name);
        listA.get(3).c(arrayList2);
        currentConfigs.d(listA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        ICardManager iCardManager = this.f48163c;
        if (iCardManager == null) {
            LogUtil.j("FunctionCard_ThreeCircleCardStrategy", "queryThreeCircleSwitch mCardImpl is null");
            return;
        }
        sit currentConfigs = iCardManager.getCurrentConfigs();
        List<CardConfig> cardConfigList = this.f48163c.getCardConfigList(true);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(currentConfigs.c());
        List<String> listC = siu.c(cardConfigList);
        if (CollectionUtils.a(arrayList)) {
            LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "queryThreeCircleSwitch cardConfigList == null");
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "three_circle_edited_hide_or_show");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "health_life_edited_hide_or_show");
        if (e(strE.concat(strE2))) {
            LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "user edit three circle show, health life show");
        } else if (str.equals("threeCircleCard")) {
            c(listC, strE, strE2);
        } else if (str.equals("threeLeafCard")) {
            d(listC, strE, strE2);
        }
    }

    private boolean e(String str) {
        ArrayList arrayList = new ArrayList();
        String string = Integer.toString(1);
        String string2 = Integer.toString(2);
        arrayList.add(string.concat(string2));
        arrayList.add(string.concat(string));
        arrayList.add(string2.concat(string));
        arrayList.add(string2.concat(string));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void c(List<String> list, String str, String str2) {
        LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "showThreeCircleCard current cardIdList", list);
        String name = CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName();
        if (siu.e(str, str2) && list.contains("HEALTH_MODEL_CARD_KEY_NEW") && !list.contains(name)) {
            LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "situation one, switch");
            a("HEALTH_MODEL_CARD_KEY_NEW", name);
            return;
        }
        if (str2.equals(Integer.toString(2)) && !str.equals(Integer.toString(1)) && !str.equals(Integer.toString(2)) && !list.contains(name)) {
            LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "situation two, add");
            a(1, name);
        }
        LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "showThreeCircleCard new cardIdList", list);
    }

    private void d(List<String> list, String str, String str2) {
        LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "showHealthModelCard current cardIdList", list);
        String name = CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName();
        if (siu.e(str, str2) && list.contains(name) && !list.contains("HEALTH_MODEL_CARD_KEY_NEW")) {
            LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "situation one, switch");
            a(name, "HEALTH_MODEL_CARD_KEY_NEW");
            return;
        }
        if (str.equals(Integer.toString(2)) && !str2.equals(Integer.toString(2)) && !str2.equals(Integer.toString(1)) && !list.contains("HEALTH_MODEL_CARD_KEY_NEW")) {
            LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "situation two, add");
            a(1, "HEALTH_MODEL_CARD_KEY_NEW");
        }
        LogUtil.a("FunctionCard_ThreeCircleCardStrategy", "showHealthModelCard new cardIdList", list);
    }

    private void a(String str, String str2) {
        ICardManager iCardManager = this.f48163c;
        if (iCardManager == null) {
            LogUtil.j("FunctionCard_ThreeCircleCardStrategy", "replaceTwoModelCard mCardImpl is null");
        } else {
            iCardManager.replaceTwoModelCard(str, str2);
        }
    }

    private void a(int i, String str) {
        ICardManager iCardManager = this.f48163c;
        if (iCardManager == null) {
            LogUtil.j("FunctionCard_ThreeCircleCardStrategy", "addTwoModelCard mCardImpl is null");
        } else {
            iCardManager.addTwoModelCard(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ICardManager iCardManager = this.f48163c;
        if (iCardManager == null) {
            LogUtil.j("FunctionCard_ThreeCircleCardStrategy", "hideOrShowThreeLeaf mCardImpl is null");
        } else {
            iCardManager.updateHealthModelCard();
        }
    }
}
