package com.huami.snore.core.repo;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.facebook.appevents.UserDataStore;
import com.huami.snore.core.converter.PoToVoExKt;
import com.huami.snore.core.db.VoiceRecorderDB;
import com.huami.snore.core.db.dao.VoiceRecorderDao;
import com.huami.snore.core.db.entity.VoiceRecorderEntity;
import com.huami.snore.core.helper.PagingHelper;
import com.huami.snore.core.repo.LocalVoiceDataImpl;
import com.huami.snore.core.vo.VoiceListingModel;
import com.huami.snore.core.vo.VoiceShowInfo;
import com.tekartik.sqflite.Constant;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001d\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J#\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/huami/snore/core/repo/LocalVoiceDataImpl;", "Lcom/huami/snore/core/repo/LocalVoiceDataApi;", "Ljava/util/Date;", "startTime", "endTime", "Lcom/huami/snore/core/vo/VoiceListingModel;", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "loadRecorderData", "", "Lcom/huami/snore/core/db/entity/VoiceRecorderEntity;", "loadWithinTimeDataList", "Landroidx/lifecycle/LiveData;", "", "getRecorderCount", "", "filePath", "deleteByFilePath", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entity", "", Constant.METHOD_INSERT, "update", "findByStartTime", "deleteWithinTimeData", "(Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/snore/core/db/VoiceRecorderDB;", "a", "Lcom/huami/snore/core/db/VoiceRecorderDB;", UserDataStore.DATE_OF_BIRTH, "<init>", "(Lcom/huami/snore/core/db/VoiceRecorderDB;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class LocalVoiceDataImpl implements LocalVoiceDataApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final VoiceRecorderDB db;

    public LocalVoiceDataImpl(@NotNull VoiceRecorderDB voiceRecorderDB) {
        this.db = voiceRecorderDB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceShowInfo b(VoiceRecorderEntity voiceRecorderEntity) {
        return PoToVoExKt.toVoiceShowInfo(voiceRecorderEntity);
    }

    @Override // com.huami.snore.core.repo.LocalVoiceDataApi
    @Nullable
    public Object deleteByFilePath(@Nullable String str, @NotNull Continuation<? super Integer> continuation) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        return Boxing.boxInt(this.db.voiceRecorderDao().delete(str));
    }

    @Override // com.huami.snore.core.repo.LocalVoiceDataApi
    @Nullable
    public Object deleteWithinTimeData(@NotNull Date date, @NotNull Date date2, @NotNull Continuation<? super Unit> continuation) {
        for (VoiceRecorderEntity voiceRecorderEntity : this.db.voiceRecorderDao().loadWithinTimeDataList(date, date2)) {
            if (new File(voiceRecorderEntity.getFilePath()).exists()) {
                new File(voiceRecorderEntity.getFilePath()).delete();
            }
        }
        this.db.voiceRecorderDao().deleteWithinTimeData(date, date2);
        return Unit.INSTANCE;
    }

    @Override // com.huami.snore.core.repo.LocalVoiceDataApi
    @NotNull
    public List<VoiceRecorderEntity> findByStartTime(@Nullable Date startTime) {
        List<VoiceRecorderEntity> listFindByStartTime = startTime == null ? null : this.db.voiceRecorderDao().findByStartTime(startTime);
        return listFindByStartTime == null ? CollectionsKt__CollectionsKt.emptyList() : listFindByStartTime;
    }

    @Override // com.huami.snore.core.repo.LocalVoiceDataApi
    @NotNull
    public LiveData<Integer> getRecorderCount(@Nullable Date startTime, @Nullable Date endTime) {
        return (startTime == null || endTime == null) ? new MutableLiveData() : this.db.voiceRecorderDao().getCountWithinTimeData(startTime, endTime);
    }

    @Override // com.huami.snore.core.repo.LocalVoiceDataApi
    public void insert(@NotNull List<VoiceRecorderEntity> entity) {
        VoiceRecorderDao voiceRecorderDao = this.db.voiceRecorderDao();
        Object[] array = entity.toArray(new VoiceRecorderEntity[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        VoiceRecorderEntity[] voiceRecorderEntityArr = (VoiceRecorderEntity[]) array;
        voiceRecorderDao.insert((VoiceRecorderEntity[]) Arrays.copyOf(voiceRecorderEntityArr, voiceRecorderEntityArr.length));
    }

    @Override // com.huami.snore.core.repo.LocalVoiceDataApi
    @Nullable
    public VoiceListingModel<VoiceShowInfo> loadRecorderData(@Nullable Date startTime, @Nullable Date endTime) {
        if (startTime == null || endTime == null) {
            return null;
        }
        VoiceRecorderDB voiceRecorderDB = this.db;
        return new PagingHelper(voiceRecorderDB, voiceRecorderDB.voiceRecorderDao().loadWithinTimeData(startTime, endTime).map(new Function() { // from class: uq4
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return LocalVoiceDataImpl.b((VoiceRecorderEntity) obj);
            }
        })).getVoiceListing();
    }

    @Override // com.huami.snore.core.repo.LocalVoiceDataApi
    @NotNull
    public List<VoiceRecorderEntity> loadWithinTimeDataList(@NotNull Date startTime, @NotNull Date endTime) {
        return this.db.voiceRecorderDao().loadWithinTimeDataList(startTime, endTime);
    }

    @Override // com.huami.snore.core.repo.LocalVoiceDataApi
    public void update(@NotNull VoiceRecorderEntity entity) {
        this.db.voiceRecorderDao().update(entity);
    }
}
