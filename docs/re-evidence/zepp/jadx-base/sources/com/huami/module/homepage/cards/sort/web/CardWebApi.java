package com.huami.module.homepage.cards.sort.web;

import com.huami.sleepassistant.apilib.utils.WebConst;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H&J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H&¨\u0006\f"}, d2 = {"Lcom/huami/module/homepage/cards/sort/web/CardWebApi;", "", "", "Lcom/huami/module/homepage/cards/sort/web/CardShowEntry;", "loadCardSort", WebConst.QueryParam.SORT_LIST, "", "uploadCardSort", "Lcom/huami/module/homepage/cards/sort/web/CardExpandEntry;", "loadCardExpand", "expandList", "uploadCardExpand", "homePage_release"}, k = 1, mv = {1, 5, 1})
public interface CardWebApi {
    @NotNull
    List<CardExpandEntry> loadCardExpand();

    @NotNull
    List<CardShowEntry> loadCardSort();

    boolean uploadCardExpand(@NotNull List<CardExpandEntry> expandList);

    boolean uploadCardSort(@NotNull List<CardShowEntry> sortList);
}
