package com.huami.module.homepage.cards.manager;

import android.content.Context;
import android.view.View;
import com.huami.lib.healthlabel.service.HealthLabelCardView;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"Lcom/huami/module/homepage/cards/manager/CardType;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/View;", "cardView", "Lcom/huami/module/homepage/cards/manager/AdapterItem;", "a", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class CardManagerKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.HEALTH_LABEL.ordinal()] = 1;
            iArr[CardType.MINE_TOOL.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdapterItem a(CardType cardType, Context context, View view) {
        AdapterItem healthLabelItem;
        int i = WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()];
        if (i == 1) {
            healthLabelItem = new HealthLabelItem(context, (HealthLabelCardView) view);
        } else {
            if (i != 2) {
                return new GeneralItem(cardType, view);
            }
            healthLabelItem = new SmallToolItem(context);
        }
        return healthLabelItem;
    }
}
