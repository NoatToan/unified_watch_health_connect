package com.huawei.ui.homehealth.functionsetcard.manager.strategy;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.sit;
import defpackage.siy;
import defpackage.siz;
import defpackage.sja;
import defpackage.sjb;
import defpackage.sjc;
import defpackage.sje;
import defpackage.sjh;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class CardUpgradeContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<CardUpgradeStrategy> f25449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25450b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25451c;
    private boolean d;
    private boolean e;
    private List<Boolean> f;
    private String h;
    private SparseArray<CardUpgradeStrategy> i;

    public CardUpgradeContainer(Context context) {
        e(context);
        a(context);
        l();
        o();
    }

    private void e(Context context) {
        this.h = SharedPreferenceManager.e(context, String.valueOf(10000), CardFlowInteractors.CardNameConstants.MANAGER_CARD.getName());
    }

    private void a(Context context) {
        SparseArray<CardUpgradeStrategy> sparseArray = new SparseArray<>(9);
        this.i = sparseArray;
        sparseArray.put(0, new SportsCardStrategy(context));
        this.i.put(1, new SleepCardStrategy(context));
        this.i.put(2, new sje(context));
        this.i.put(3, new sjh(context));
        this.i.put(4, new siz(context));
        this.i.put(5, new sjb(context));
        this.i.put(6, new sjc(context));
        this.i.put(7, new sja(context));
        this.i.put(8, new siy(context));
    }

    private void l() {
        ArrayList arrayList = new ArrayList(9);
        this.f = arrayList;
        arrayList.add(Boolean.valueOf(i()));
        this.f.add(Boolean.valueOf(h()));
        this.f.add(Boolean.valueOf(j()));
        this.f.add(Boolean.valueOf(f()));
        this.f.add(Boolean.valueOf(g()));
        this.f.add(Boolean.valueOf(d()));
        this.f.add(Boolean.valueOf(e()));
        this.f.add(Boolean.valueOf(a()));
        this.f.add(Boolean.valueOf(c()));
    }

    private boolean i() {
        if (this.i.get(0).isEmptyShowCard()) {
            return ("6".equals(this.h) || "7".equals(this.h)) ? false : true;
        }
        return ("8".equals(this.h) || "9".equals(this.h)) ? false : true;
    }

    private boolean h() {
        return !this.i.get(3).isEmptyPosition();
    }

    private boolean j() {
        return !this.i.get(0).isEmptyPosition();
    }

    private boolean f() {
        sja sjaVar = (sja) this.i.get(7);
        try {
            return !sjaVar.isEmptyPosition() && Integer.parseInt(sjaVar.getCardPosition()) >= 1000 && sjaVar.isEmptyShowCard();
        } catch (NumberFormatException unused) {
            LogUtil.e("CardUpgradeContainer", "isPreShowCardPressure error");
        }
        return false;
    }

    private boolean g() {
        sjc sjcVar = (sjc) this.i.get(6);
        try {
            return !sjcVar.isEmptyPosition() && Integer.parseInt(sjcVar.getCardPosition()) >= 1000 && sjcVar.isEmptyShowCard();
        } catch (NumberFormatException unused) {
            LogUtil.e("CardUpgradeContainer", "isPreShowCardPressure error");
        }
        return false;
    }

    private boolean d() {
        boolean z = !this.i.get(0).isEmptyShowCard();
        LogUtil.d("CardUpgradeContainer", "isOneScenario=", Boolean.valueOf(z));
        return z;
    }

    private boolean e() {
        boolean z = false;
        boolean zIsEmptyShowCard = this.i.get(0).isEmptyShowCard();
        boolean zIsEmptyPosition = this.i.get(5).isEmptyPosition();
        if (zIsEmptyShowCard && !zIsEmptyPosition) {
            z = true;
        }
        LogUtil.d("CardUpgradeContainer", "isTwoScenario=", Boolean.valueOf(z));
        return z;
    }

    private boolean a() {
        boolean z = false;
        boolean zIsEmptyShowCard = this.i.get(0).isEmptyShowCard();
        boolean zIsEmptyPosition = this.i.get(1).isEmptyPosition();
        boolean zIsEmptyPosition2 = this.i.get(5).isEmptyPosition();
        if (zIsEmptyShowCard && !zIsEmptyPosition && zIsEmptyPosition2) {
            z = true;
        }
        LogUtil.d("CardUpgradeContainer", "isThreeScenario=", Boolean.valueOf(z));
        return z;
    }

    private boolean c() {
        boolean z = false;
        SportsCardStrategy sportsCardStrategy = (SportsCardStrategy) this.i.get(0);
        boolean zIsEmptyShowCard = sportsCardStrategy.isEmptyShowCard();
        boolean zB = sportsCardStrategy.b();
        if (zIsEmptyShowCard && zB) {
            z = true;
        }
        LogUtil.d("CardUpgradeContainer", "isFourScenario=", Boolean.valueOf(z));
        return z;
    }

    private void o() {
        boolean z = false;
        if (this.i == null) {
            this.d = false;
            return;
        }
        for (int i = 0; i < this.i.size(); i++) {
            CardUpgradeStrategy cardUpgradeStrategy = this.i.get(this.i.keyAt(i));
            if (cardUpgradeStrategy.isEditedCard(this.f)) {
                LogUtil.d("CardUpgradeContainer", cardUpgradeStrategy.getCardId(), " isEditedCard=true");
                z = true;
                break;
            }
        }
        this.d = z;
    }

    private void b() {
        if (this.f25449a == null) {
            this.f25449a = new ArrayList();
            this.f25451c = false;
            this.e = false;
            for (int i = 0; i < this.i.size(); i++) {
                CardUpgradeStrategy cardUpgradeStrategy = this.i.get(this.i.keyAt(i));
                ReleaseLogUtil.d("CardUpgradeContainer", cardUpgradeStrategy.getCardId(), " showCard=", cardUpgradeStrategy.getShowCard(), " position=", cardUpgradeStrategy.getCardPosition());
                if (!cardUpgradeStrategy.isEmptyPosition()) {
                    if (cardUpgradeStrategy instanceof SportsCardStrategy) {
                        this.e = true;
                    }
                    if (cardUpgradeStrategy.getShowFlag(this.f) == 1) {
                        this.f25451c = true;
                    }
                    this.f25449a.add(cardUpgradeStrategy);
                }
            }
            Collections.sort(this.f25449a, new Comparator<CardUpgradeStrategy>() { // from class: com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeContainer.3
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(CardUpgradeStrategy cardUpgradeStrategy2, CardUpgradeStrategy cardUpgradeStrategy3) {
                    try {
                        return Integer.parseInt(cardUpgradeStrategy2.getCardPosition()) - Integer.parseInt(cardUpgradeStrategy3.getCardPosition());
                    } catch (NumberFormatException unused) {
                        LogUtil.e("CardUpgradeContainer", "getEditCardPositionSortList error");
                        return 0;
                    }
                }
            });
        }
    }

    public sit c(sit sitVar) {
        if (sitVar != null && this.d) {
            LinkedList<CardConfig> linkedListC = sitVar.c();
            sitVar.a(this.d);
            if (linkedListC != null) {
                this.f25450b = 0;
                b();
                boolean z = this.e;
                if (z && this.f25451c) {
                    a(linkedListC);
                } else if (z) {
                    e(linkedListC);
                } else {
                    d(linkedListC);
                }
                sitVar.e(linkedListC);
            }
        }
        return sitVar;
    }

    private void a(LinkedList<CardConfig> linkedList) {
        e(linkedList, this.f25449a);
        this.f25450b = 1;
        d(linkedList, "HEALTH_MODEL_CARD_KEY_NEW");
    }

    private void d(LinkedList<CardConfig> linkedList) {
        d(linkedList, this.i.get(0).getCardId());
        d(linkedList, "HEALTH_MODEL_CARD_KEY_NEW");
        e(linkedList, this.f25449a);
    }

    private void e(LinkedList<CardConfig> linkedList) {
        d(linkedList, "HEALTH_MODEL_CARD_KEY_NEW");
        e(linkedList, this.f25449a);
    }

    private void e(LinkedList<CardConfig> linkedList, List<CardUpgradeStrategy> list) {
        for (int i = 0; i < list.size(); i++) {
            c(linkedList, list.get(i));
        }
    }

    private void d(LinkedList<CardConfig> linkedList, String str) {
        for (int i = 0; i < linkedList.size(); i++) {
            CardConfig cardConfig = linkedList.get(i);
            if (str != null && cardConfig != null && str.equals(cardConfig.getCardId())) {
                SportsCardStrategy sportsCardStrategy = (SportsCardStrategy) this.i.get(0);
                if (cardConfig.getCardId() != null && sportsCardStrategy != null && ("HEALTH_MODEL_CARD_KEY_NEW".equals(cardConfig.getCardId()) || cardConfig.getCardId().equals(sportsCardStrategy.getCardId()))) {
                    cardConfig.setShowFlag(1);
                }
                a(linkedList, i, cardConfig);
                return;
            }
        }
    }

    private void c(LinkedList<CardConfig> linkedList, CardUpgradeStrategy cardUpgradeStrategy) {
        for (int i = 0; i < linkedList.size(); i++) {
            CardConfig cardConfig = linkedList.get(i);
            if (cardUpgradeStrategy != null && cardUpgradeStrategy.getCardId() != null && cardConfig != null && cardUpgradeStrategy.getCardId().equals(cardConfig.getCardId())) {
                boolean zIsEditedCard = cardUpgradeStrategy.isEditedCard(this.f);
                int showFlag = cardUpgradeStrategy.getShowFlag(this.f);
                cardConfig.setEditFlag(zIsEditedCard ? 1 : 0);
                cardConfig.setShowFlag(showFlag);
                a(linkedList, i, cardConfig);
                return;
            }
        }
    }

    private void a(LinkedList<CardConfig> linkedList, int i, CardConfig cardConfig) {
        if (njy.c(linkedList, this.f25450b)) {
            linkedList.remove(i);
            linkedList.add(this.f25450b, cardConfig);
            this.f25450b++;
        }
    }
}
