package com.huami.sleepassistant.apilib.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sleepassistant.apilib.bean.UpdateCollection;
import com.huami.sleepassistant.apilib.db.po.LiveMusic;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.utils.ext.PoExKt;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H'J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H'J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0003H'J\b\u0010\u0010\u001a\u00020\u0005H'J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0011H'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0014H'J\u0016\u0010\u0017\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002H\u0017J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002H'J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H'J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002H'J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0016H'J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0017J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u000bH'J\b\u0010\"\u001a\u00020\u0005H'J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000bH'J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0011H'J\b\u0010%\u001a\u00020\u0005H'¨\u0006("}, d2 = {"Lcom/huami/sleepassistant/apilib/db/dao/SleepAssistantDao;", "", "", "Lcom/huami/sleepassistant/apilib/db/po/Music;", "musics", "", "insertOrUpdateMusic", "", "insertMusic", WebConstant.QueryParam.TYPE_MUSIC, "insertOrReplaceMusic", "", "ids", "queryMusicIn", "", "updateMusicItem", "deleteMusicListItems", "Landroidx/paging/DataSource$Factory;", "queryMusicListItemsByPaging", "queryMusicList", "Landroidx/lifecycle/LiveData;", "queryMusicDataList", "Lcom/huami/sleepassistant/apilib/db/po/LiveMusic;", "insertOrUpdateLiveMusic", Constants.EXTRA_KEY_TOPICS, "insertLiveMusic", "queryLiveMusicIn", "queryLiveMusic", "liveMusic", "updateLiveMusicItem", "Lcom/huami/sleepassistant/apilib/bean/UpdateCollection;", "item", "updateLiveMusic", "id", "deleteLiveMusicListItems", "deleteLiveMusic", "queryLiveMusicListItemsByPaging", WorkoutExercises.CLEAN, "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public abstract class SleepAssistantDao {
    @Query("delete from LiveMusic")
    public abstract void clean();

    @Query("DELETE From LiveMusic WHERE sid =:id")
    public abstract int deleteLiveMusic(@NotNull String id);

    @Query("DELETE From LiveMusic")
    public abstract void deleteLiveMusicListItems();

    @Query("DELETE From Music")
    public abstract void deleteMusicListItems();

    @Insert(onConflict = 5)
    @NotNull
    public abstract List<Long> insertLiveMusic(@NotNull List<LiveMusic> topics);

    @Insert(onConflict = 5)
    @NotNull
    public abstract List<Long> insertMusic(@NotNull List<Music> musics);

    @Insert(onConflict = 1)
    public abstract void insertOrReplaceMusic(@NotNull Music music);

    @Transaction
    public void insertOrUpdateLiveMusic(@NotNull List<LiveMusic> musics) {
        List<Long> listInsertLiveMusic = insertLiveMusic(musics);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : listInsertLiveMusic) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            LiveMusic liveMusic = ((Number) obj).longValue() == -1 ? musics.get(i2) : null;
            if (liveMusic != null) {
                arrayList.add(liveMusic);
            }
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((LiveMusic) it2.next()).getSid());
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(queryLiveMusicIn(arrayList2), new Comparator() { // from class: com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao$insertOrUpdateLiveMusic$lambda-9$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((LiveMusic) t).getSid(), ((LiveMusic) t2).getSid());
            }
        });
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao$insertOrUpdateLiveMusic$lambda-9$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((LiveMusic) t).getSid(), ((LiveMusic) t2).getSid());
            }
        });
        int size = listSortedWith2.size() < listSortedWith.size() ? listSortedWith2.size() : listSortedWith.size();
        if (size <= 0) {
            return;
        }
        while (true) {
            int i4 = i + 1;
            LiveMusic liveMusic2 = (LiveMusic) listSortedWith.get(i);
            LiveMusic liveMusic3 = (LiveMusic) listSortedWith2.get(i);
            if (!Intrinsics.areEqual(liveMusic2, liveMusic3)) {
                updateLiveMusicItem(PoExKt.combine(liveMusic2, liveMusic3));
            }
            if (i4 >= size) {
                return;
            } else {
                i = i4;
            }
        }
    }

    @Transaction
    public void insertOrUpdateMusic(@NotNull List<Music> musics) {
        List<Long> listInsertMusic = insertMusic(musics);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : listInsertMusic) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Music music = ((Number) obj).longValue() == -1 ? musics.get(i2) : null;
            if (music != null) {
                arrayList.add(music);
            }
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Music) it2.next()).getId());
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(queryMusicIn(arrayList2), new Comparator() { // from class: com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao$insertOrUpdateMusic$lambda-4$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((Music) t).getId(), ((Music) t2).getId());
            }
        });
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao$insertOrUpdateMusic$lambda-4$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((Music) t).getId(), ((Music) t2).getId());
            }
        });
        int size = listSortedWith2.size() < listSortedWith.size() ? listSortedWith2.size() : listSortedWith.size();
        if (size <= 0) {
            return;
        }
        while (true) {
            int i4 = i + 1;
            Music music2 = (Music) listSortedWith.get(i);
            Music music3 = (Music) listSortedWith2.get(i);
            if (!Intrinsics.areEqual(music2, music3)) {
                updateMusicItem(PoExKt.combine(music2, music3));
            }
            if (i4 >= size) {
                return;
            } else {
                i = i4;
            }
        }
    }

    @Query("SELECT * From LiveMusic WHERE sid =:id")
    @NotNull
    public abstract LiveMusic queryLiveMusic(@NotNull String id);

    @Query("SELECT * FROM LiveMusic")
    @NotNull
    public abstract List<LiveMusic> queryLiveMusic();

    @Query("SELECT * FROM LiveMusic WHERE sid in (:ids)")
    @NotNull
    public abstract List<LiveMusic> queryLiveMusicIn(@NotNull List<String> ids);

    @Query("SELECT * FROM LiveMusic")
    @NotNull
    public abstract DataSource.Factory<Integer, LiveMusic> queryLiveMusicListItemsByPaging();

    @Query("SELECT * FROM Music")
    @NotNull
    public abstract LiveData<List<Music>> queryMusicDataList();

    @Query("SELECT * FROM Music WHERE id in (:ids)")
    @NotNull
    public abstract List<Music> queryMusicIn(@NotNull List<String> ids);

    @Query("SELECT * FROM Music")
    @NotNull
    public abstract List<Music> queryMusicList();

    @Query("SELECT * FROM Music")
    @NotNull
    public abstract DataSource.Factory<Integer, Music> queryMusicListItemsByPaging();

    @Transaction
    public void updateLiveMusic(@NotNull UpdateCollection item) {
        LiveMusic liveMusicQueryLiveMusic = queryLiveMusic(item.getSleepSetId());
        String name = item.getName();
        if (name == null) {
            name = "";
        }
        liveMusicQueryLiveMusic.setName(name);
        liveMusicQueryLiveMusic.setPlayTime(item.getPlayTime());
        updateLiveMusicItem(liveMusicQueryLiveMusic);
    }

    @Update
    public abstract int updateLiveMusicItem(@NotNull LiveMusic liveMusic);

    @Update
    public abstract int updateMusicItem(@NotNull Music music);
}
