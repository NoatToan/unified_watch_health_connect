package com.huami.module.homepage.cards.business.sky;

import com.huami.module.homepage.cards.manager.CardType;
import com.huami.sky.entry.SkyCardEntry;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0005"}, d2 = {"Lcom/huami/module/homepage/cards/manager/CardType;", "Lcom/huami/sky/entry/SkyCardEntry;", "skyCardEntry", "", "filterSkyCard", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class StarSkyHelperKt {
    public static final boolean filterSkyCard(@NotNull CardType cardType, @Nullable SkyCardEntry skyCardEntry) {
        if (cardType == CardType.STAR_SKY) {
            if (!(skyCardEntry == null ? false : skyCardEntry.getDisplay())) {
                return false;
            }
        }
        return true;
    }
}
