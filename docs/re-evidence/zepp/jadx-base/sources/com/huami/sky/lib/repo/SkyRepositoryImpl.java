package com.huami.sky.lib.repo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.AccountService;
import com.huami.sky.lib.api.RecommendMusicApi;
import com.huami.sky.lib.api.RelaxDataApi;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicEntity;
import com.huami.sky.lib.entity.RelaxInfo;
import com.huami.sky.lib.entity.RelaxScoreResponse;
import com.huami.sky.lib.entity.UserRelaxScore;
import com.huami.sky.lib.room.MusicInfoDao;
import com.huami.sky.lib.room.RelaxScoreDao;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b*\u0010+J'\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/huami/sky/lib/repo/SkyRepositoryImpl;", "Lcom/huami/sky/lib/repo/SkyRepository;", "", WebConstant.QueryParam.LAUNCH, "", WebConstant.QueryParam.SWITCH, "Lcom/huami/sky/lib/entity/MusicEntity;", "recommendMusic", "(ZLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startTime", "endTime", "", "saveRelaxScoreFromServer", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/sky/lib/entity/UserRelaxScore;", "getRelaxScoreFromLocal", "Lcom/huami/account/service/AccountService;", "a", "Lcom/huami/account/service/AccountService;", "userApi", "Lcom/huami/sky/lib/api/RecommendMusicApi;", "b", "Lcom/huami/sky/lib/api/RecommendMusicApi;", "musicApi", "Lcom/huami/sky/lib/api/RelaxDataApi;", "c", "Lcom/huami/sky/lib/api/RelaxDataApi;", "relaxDataApi", "Lcom/huami/sky/lib/room/RelaxScoreDao;", GoogleApiAvailabilityLight.a, "Lcom/huami/sky/lib/room/RelaxScoreDao;", "relaxScoreDao", "Lcom/huami/sky/lib/room/MusicInfoDao;", "e", "Lcom/huami/sky/lib/room/MusicInfoDao;", "musicDao", "", "f", "Ljava/lang/String;", "tag", "<init>", "(Lcom/huami/account/service/AccountService;Lcom/huami/sky/lib/api/RecommendMusicApi;Lcom/huami/sky/lib/api/RelaxDataApi;Lcom/huami/sky/lib/room/RelaxScoreDao;Lcom/huami/sky/lib/room/MusicInfoDao;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SkyRepositoryImpl implements SkyRepository {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AccountService userApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RecommendMusicApi musicApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final RelaxDataApi relaxDataApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final RelaxScoreDao relaxScoreDao;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MusicInfoDao musicDao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String tag = "SkyRepositoryImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ RelaxScoreResponse a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RelaxScoreResponse relaxScoreResponse) {
            super(0);
            this.a = relaxScoreResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Exception c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2, Exception exc) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startTime=" + this.a + ",endTime=" + this.b + ",error " + this.c.getMessage();
        }
    }

    public SkyRepositoryImpl(@NotNull AccountService accountService, @NotNull RecommendMusicApi recommendMusicApi, @NotNull RelaxDataApi relaxDataApi, @NotNull RelaxScoreDao relaxScoreDao, @NotNull MusicInfoDao musicInfoDao) {
        this.userApi = accountService;
        this.musicApi = recommendMusicApi;
        this.relaxDataApi = relaxDataApi;
        this.relaxScoreDao = relaxScoreDao;
        this.musicDao = musicInfoDao;
    }

    @Override // com.huami.sky.lib.repo.SkyRepository
    @NotNull
    public Flow<List<UserRelaxScore>> getRelaxScoreFromLocal(long startTime) {
        return this.relaxScoreDao.getRelaxScoreAfterTime(this.userApi.userIdOrThrow(), startTime);
    }

    @Override // com.huami.sky.lib.repo.SkyRepository
    @Nullable
    public Object recommendMusic(boolean z, @Nullable Integer num, @NotNull Continuation<? super MusicEntity> continuation) {
        MusicEntity musicEntityRecommendMusic = this.musicApi.recommendMusic(z, num);
        if (musicEntityRecommendMusic == null) {
            return null;
        }
        musicEntityRecommendMusic.setTime(System.currentTimeMillis());
        this.musicDao.insert(musicEntityRecommendMusic);
        return musicEntityRecommendMusic;
    }

    @Override // com.huami.sky.lib.repo.SkyRepository
    public void saveRelaxScoreFromServer(long startTime, long endTime) {
        List<RelaxInfo> items;
        try {
            String strUserIdOrThrow = this.userApi.userIdOrThrow();
            RelaxScoreResponse relaxScore = this.relaxDataApi.getRelaxScore(startTime, endTime);
            HMLog.info(this.tag, new a(relaxScore));
            if (relaxScore != null && (items = relaxScore.getItems()) != null) {
                RelaxScoreDao relaxScoreDao = this.relaxScoreDao;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
                Iterator<T> it2 = items.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new UserRelaxScore(strUserIdOrThrow, (RelaxInfo) it2.next()));
                }
                relaxScoreDao.insert(arrayList);
            }
        } catch (Exception e) {
            HMLog.info(this.tag, new b(startTime, endTime, e));
            e.printStackTrace();
        }
    }
}
