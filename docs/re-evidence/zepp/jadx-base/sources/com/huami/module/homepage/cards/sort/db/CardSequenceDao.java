package com.huami.module.homepage.cards.sort.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007H'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H'J\b\u0010\r\u001a\u00020\u0005H'¨\u0006\u000e"}, d2 = {"Lcom/huami/module/homepage/cards/sort/db/CardSequenceDao;", "", "", "Lcom/huami/module/homepage/cards/sort/db/CardSequence;", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "", "insertCard", "Lkotlinx/coroutines/flow/Flow;", "queryCardFlow", "queryCard", "", "list", "removeCards", "clearCards", "homePage_release"}, k = 1, mv = {1, 5, 1})
public interface CardSequenceDao {
    @Query("delete from card_sequence")
    void clearCards();

    @Insert(onConflict = 1)
    void insertCard(@NotNull List<CardSequence> cards);

    @Query("select * from card_sequence")
    @NotNull
    List<CardSequence> queryCard();

    @Query("select * from card_sequence")
    @NotNull
    Flow<List<CardSequence>> queryCardFlow();

    @Query("delete from card_sequence where cardName in(:list)")
    void removeCards(@NotNull List<String> list);
}
