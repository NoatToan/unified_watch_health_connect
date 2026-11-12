package com.huami.training.repo;

import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.DisplayLocationBo;
import com.huami.training.api.LoadOnActiveLiveData;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.CardBean;
import com.huami.training.api.pojo.EntranceCardBean;
import com.huami.training.api.pojo.EntranceCardExtension;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.JoinedTrainingBean;
import com.huami.training.api.pojo.TrainingBean;
import com.huami.training.converter.PoToVoExKt;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.TrainingDbExKt;
import com.huami.training.db.dao.EntranceDao;
import com.huami.training.db.dao.ParticipationDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.po.CardPlace;
import com.huami.training.db.po.EntranceKing;
import com.huami.training.db.po.LookAround;
import com.huami.training.db.po.Subject;
import com.huami.training.db.po.Tag;
import com.huami.training.db.po.TodayTraining;
import com.huami.training.db.po.Training;
import com.huami.training.dto.App;
import com.huami.training.dto.SubjectPlace;
import com.huami.training.dto.Trainer;
import com.huami.training.helper.AbsentLiveData;
import com.huami.training.helper.AppExecutors;
import com.huami.training.paging.PagingKeyHelper;
import com.huami.training.repo.EntranceRepo;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.huami.training.vo.EntranceKingVo;
import com.huami.training.vo.EntranceSubjectVo;
import com.huami.training.vo.Listing;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TagVo;
import com.huami.training.vo.TrainingVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.LongRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB7\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\b?\u0010@J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\u0003J\b\u0010\n\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007J\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\b0\u0007J\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\b0\u0007J\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00020\b0\u0007J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u0007H\u0007J\u001a\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00020\b0\u0007H\u0007J\"\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00020\b0\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0007R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/huami/training/repo/EntranceRepo;", "", "", "Lcom/huami/training/api/pojo/TrainingBean;", "body", "", "m", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "v", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "loadEntranceCards", "Lcom/huami/training/vo/EntranceSubjectVo;", "loadBannerData", "loadSubjectData", "Lcom/huami/training/vo/EntranceKingVo;", "loadKingData", "", "loadAllJoinedCourse", "Lcom/huami/training/vo/TagVo;", "loadTodayTag", "", "tagId", "Lcom/huami/training/vo/TrainingVo;", "loadTodayTraining", "Lcom/huami/training/vo/Listing;", "loadKanKanList", "Lcom/huami/training/dto/App;", "a", "Lcom/huami/training/dto/App;", "app", "Lcom/huami/training/helper/AppExecutors;", "b", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/db/TrainingDb;", "c", "Lcom/huami/training/db/TrainingDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/training/api/TrainingWebApi;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/api/TrainingWebApi;", "webApi", "Lcom/huami/training/dto/Trainer;", "e", "Lcom/huami/training/dto/Trainer;", "trainer", "Lcom/huami/training/paging/PagingKeyHelper;", "f", "Lcom/huami/training/paging/PagingKeyHelper;", "pagingKeyHelper", "Lcom/huami/training/db/dao/EntranceDao;", "g", "Lcom/huami/training/db/dao/EntranceDao;", "entranceDao", "Lcom/huami/training/db/dao/TrainingDao;", "h", "Lcom/huami/training/db/dao/TrainingDao;", "trainingDao", "Lcom/huami/training/db/dao/ParticipationDao;", "i", "Lcom/huami/training/db/dao/ParticipationDao;", "participationDao", "<init>", "(Lcom/huami/training/dto/App;Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/db/TrainingDb;Lcom/huami/training/api/TrainingWebApi;Lcom/huami/training/dto/Trainer;Lcom/huami/training/paging/PagingKeyHelper;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class EntranceRepo {
    private static final int j = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final App app;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TrainingDb db;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final TrainingWebApi webApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Trainer trainer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyHelper pagingKeyHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final EntranceDao entranceDao;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final TrainingDao trainingDao;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ParticipationDao participationDao;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableLiveData<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableLiveData<Unit> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setValue(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ KanKanBoundaryCallback a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(KanKanBoundaryCallback kanKanBoundaryCallback) {
            super(0);
            this.a = kanKanBoundaryCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.getHelper().retryAllFailed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<List<? extends TrainingBean>, Unit> {
        public c(EntranceRepo entranceRepo) {
            super(1, entranceRepo, EntranceRepo.class, "insertKanKanResultIntoDb", "insertKanKanResultIntoDb(Ljava/util/List;)V", 0);
        }

        public final void a(@Nullable List<TrainingBean> list) {
            ((EntranceRepo) this.receiver).m(list);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TrainingBean> list) {
            a(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.training.repo.EntranceRepo$loadEntranceCards$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\nH\u0014J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/huami/training/repo/EntranceRepo$loadEntranceCards$1", "Lcom/huami/training/repo/NetworkBoundResource;", "", "Lcom/huami/training/api/pojo/CardBean;", "result", "saveCallResult", "data", "", "shouldFetch", "(Lkotlin/Unit;)Z", "Landroidx/lifecycle/LiveData;", "loadFromDb", "Lcom/huami/training/vo/ApiResponse;", "createCall", "po", "poToVo", "(Lkotlin/Unit;)Lkotlin/Unit;", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class C15471 extends NetworkBoundResource<Unit, CardBean, Unit> {

        /* JADX INFO: renamed from: com.huami.training.repo.EntranceRepo$loadEntranceCards$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/CardBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ApiResponse<CardBean>> {
            public final /* synthetic */ EntranceRepo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EntranceRepo entranceRepo) {
                super(0);
                this.a = entranceRepo;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ApiResponse<CardBean> invoke() {
                return this.a.webApi.loadEntranceCards(this.a.app);
            }
        }

        public C15471(AppExecutors appExecutors) {
            super(appExecutors);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void F(EntranceRepo entranceRepo, CardBean cardBean) {
            entranceRepo.entranceDao.deleteSubjectPlaces(SubjectPlace.COURSE_SUBJECT);
            List<EntranceCardBean> subject = cardBean.getSubject();
            if (subject == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : subject) {
                EntranceCardExtension extensions = ((EntranceCardBean) obj).getExtensions();
                if (extensions != null ? new LongRange(extensions.getStartTime(), extensions.getEndTime()).contains(System.currentTimeMillis() / ((long) 1000)) : false) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(WebBeanToPoExKt.toEntranceSubjectPo((EntranceCardBean) it2.next()));
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new CardPlace(SubjectPlace.COURSE_SUBJECT, ((Subject) it3.next()).getId()));
            }
            entranceRepo.entranceDao.insertSubjects(arrayList2);
            entranceRepo.entranceDao.insertSubjectPlaces(arrayList3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void G(EntranceRepo entranceRepo, CardBean cardBean) {
            entranceRepo.entranceDao.deleteSubjectPlaces(SubjectPlace.COURSE_CAROUSEL);
            List<EntranceCardBean> banner = cardBean.getBanner();
            if (banner == null) {
                return;
            }
            List listTake = CollectionsKt___CollectionsKt.take(banner, 5);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listTake) {
                EntranceCardExtension extensions = ((EntranceCardBean) obj).getExtensions();
                if (extensions != null ? new LongRange(extensions.getStartTime(), extensions.getEndTime()).contains(System.currentTimeMillis() / ((long) 1000)) : false) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(WebBeanToPoExKt.toEntranceSubjectPo((EntranceCardBean) it2.next()));
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new CardPlace(SubjectPlace.COURSE_CAROUSEL, ((Subject) it3.next()).getId()));
            }
            entranceRepo.entranceDao.insertSubjects(arrayList2);
            entranceRepo.entranceDao.insertSubjectPlaces(arrayList3);
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        @NotNull
        public LiveData<ApiResponse<CardBean>> createCall() {
            return LoadOnActiveLiveData.INSTANCE.create(EntranceRepo.this.appExecutors.getNetworkIO(), new a(EntranceRepo.this));
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        @NotNull
        public LiveData<Unit> loadFromDb() {
            return AbsentLiveData.INSTANCE.create();
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        @Nullable
        public Unit poToVo(@Nullable Unit po) {
            return null;
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public boolean shouldFetch(@Nullable Unit data) {
            return true;
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public void saveCallResult(@NotNull final CardBean result) {
            TrainingDb trainingDb = EntranceRepo.this.db;
            final EntranceRepo entranceRepo = EntranceRepo.this;
            trainingDb.runInTransaction(new Runnable() { // from class: rn1
                @Override // java.lang.Runnable
                public final void run() {
                    EntranceRepo.C15471.G(entranceRepo, result);
                }
            });
            TrainingDb trainingDb2 = EntranceRepo.this.db;
            final EntranceRepo entranceRepo2 = EntranceRepo.this;
            trainingDb2.runInTransaction(new Runnable() { // from class: qn1
                @Override // java.lang.Runnable
                public final void run() {
                    EntranceRepo.C15471.F(entranceRepo2, result);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huami.training.repo.EntranceRepo$loadTodayTraining$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u0001J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0014J\u0018\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\rH\u0014J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000f0\rH\u0014J \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00022\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\u0013"}, d2 = {"com/huami/training/repo/EntranceRepo$loadTodayTraining$1", "Lcom/huami/training/repo/NetworkBoundResource;", "", "Lcom/huami/training/db/po/Training;", "Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/TrainingBean;", "Lcom/huami/training/vo/TrainingVo;", "result", "", "saveCallResult", "data", "", "shouldFetch", "Landroidx/lifecycle/LiveData;", "loadFromDb", "Lcom/huami/training/vo/ApiResponse;", "createCall", "po", "poToVo", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class C15481 extends NetworkBoundResource<List<? extends Training>, Items<TrainingBean>, List<? extends TrainingVo>> {
        public final /* synthetic */ long d;

        /* JADX INFO: renamed from: com.huami.training.repo.EntranceRepo$loadTodayTraining$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/TrainingBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ApiResponse<Items<TrainingBean>>> {
            public final /* synthetic */ long a;
            public final /* synthetic */ EntranceRepo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, EntranceRepo entranceRepo) {
                super(0);
                this.a = j;
                this.b = entranceRepo;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ApiResponse<Items<TrainingBean>> invoke() {
                return TrainingWebApi.DefaultImpls.loadTrainings$default(this.b.webApi, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(this.a), null, null, 6, 28671, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15481(long j, AppExecutors appExecutors) {
            super(appExecutors);
            this.d = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void E(EntranceRepo entranceRepo, Items items, long j) {
            entranceRepo.entranceDao.clearTodayTraining();
            TrainingDao trainingDao = entranceRepo.trainingDao;
            List items2 = items.getItems();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = items2.iterator();
            while (it2.hasNext()) {
                Training trainingPo = WebBeanToPoExKt.toTrainingPo((TrainingBean) it2.next());
                if (trainingPo != null) {
                    arrayList.add(trainingPo);
                }
            }
            trainingDao.insertOrUpdateTrainings(arrayList);
            EntranceDao entranceDao = entranceRepo.entranceDao;
            List items3 = items.getItems();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items3, 10));
            Iterator it3 = items3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new TodayTraining(((TrainingBean) it3.next()).getId(), j));
            }
            entranceDao.insertTodayTraining(arrayList2);
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        @NotNull
        public LiveData<ApiResponse<Items<TrainingBean>>> createCall() {
            return LoadOnActiveLiveData.INSTANCE.create(EntranceRepo.this.appExecutors.getNetworkIO(), new a(this.d, EntranceRepo.this));
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        @NotNull
        public LiveData<List<? extends Training>> loadFromDb() {
            return EntranceRepo.this.entranceDao.queryTodayTraining(this.d);
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public /* bridge */ /* synthetic */ List<? extends TrainingVo> poToVo(List<? extends Training> list) {
            return poToVo2((List<Training>) list);
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public /* bridge */ /* synthetic */ boolean shouldFetch(List<? extends Training> list) {
            return shouldFetch2((List<Training>) list);
        }

        /* JADX INFO: renamed from: shouldFetch, reason: avoid collision after fix types in other method */
        public boolean shouldFetch2(@Nullable List<Training> data) {
            return true;
        }

        @Nullable
        /* JADX INFO: renamed from: poToVo, reason: avoid collision after fix types in other method */
        public List<TrainingVo> poToVo2(@Nullable List<Training> po) {
            boolean zBooleanValue = EntranceRepo.this.trainer.isMale().invoke().booleanValue();
            if (po == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(po, 10));
            Iterator<T> it2 = po.iterator();
            while (it2.hasNext()) {
                arrayList.add(PoToVoExKt.toTrainingVo((Training) it2.next(), zBooleanValue));
            }
            return arrayList;
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public void saveCallResult(@NotNull final Items<TrainingBean> result) {
            TrainingDb trainingDb = EntranceRepo.this.db;
            final EntranceRepo entranceRepo = EntranceRepo.this;
            final long j = this.d;
            trainingDb.runInTransaction(new Runnable() { // from class: sn1
                @Override // java.lang.Runnable
                public final void run() {
                    EntranceRepo.C15481.E(entranceRepo, result, j);
                }
            });
        }
    }

    public EntranceRepo(@NotNull App app, @NotNull AppExecutors appExecutors, @NotNull TrainingDb trainingDb, @NotNull TrainingWebApi trainingWebApi, @NotNull Trainer trainer, @NotNull PagingKeyHelper pagingKeyHelper) {
        this.app = app;
        this.appExecutors = appExecutors;
        this.db = trainingDb;
        this.webApi = trainingWebApi;
        this.trainer = trainer;
        this.pagingKeyHelper = pagingKeyHelper;
        this.entranceDao = trainingDb.entranceDao();
        this.trainingDao = trainingDb.trainingDao();
        this.participationDao = trainingDb.participationDao();
    }

    private final void A() {
        this.pagingKeyHelper.resetKanKanPagingKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(final List<TrainingBean> body) {
        if (body == null) {
            return;
        }
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: fn1
            @Override // java.lang.Runnable
            public final void run() {
                EntranceRepo.n(this.a, body);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final EntranceRepo entranceRepo, final List list) {
        entranceRepo.db.runInTransaction(new Runnable() { // from class: pn1
            @Override // java.lang.Runnable
            public final void run() {
                EntranceRepo.o(this.a, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(EntranceRepo entranceRepo, List list) {
        TrainingDao trainingDao = entranceRepo.trainingDao;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Training trainingPo = WebBeanToPoExKt.toTrainingPo((TrainingBean) it2.next());
            if (trainingPo != null) {
                arrayList.add(trainingPo);
            }
        }
        trainingDao.insertOrUpdateTrainings(arrayList);
        EntranceDao entranceDao = entranceRepo.entranceDao;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new LookAround(((TrainingBean) it3.next()).getId()));
        }
        entranceDao.insertLookAroundTrainings(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(MediatorLiveData mediatorLiveData, List list) {
        Resource.Companion companion = Resource.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoToVoExKt.toEntranceSubjectVo((Subject) it2.next()));
        }
        mediatorLiveData.setValue(companion.success(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData q(EntranceRepo entranceRepo, Unit unit) {
        return entranceRepo.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingVo r(boolean z, Training training) {
        return PoToVoExKt.toTrainingVo(training, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource s(List list) {
        Resource.Companion companion = Resource.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoToVoExKt.toEntranceKingVo((EntranceKing) it2.next()));
        }
        return companion.success(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MediatorLiveData mediatorLiveData, List list) {
        Resource.Companion companion = Resource.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoToVoExKt.toEntranceSubjectVo((Subject) it2.next()));
        }
        mediatorLiveData.setValue(companion.success(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource u(List list) {
        Resource.Companion companion = Resource.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoToVoExKt.toTodayTagVo((Tag) it2.next()));
        }
        return companion.success(arrayList);
    }

    @MainThread
    private final LiveData<Resource<Unit>> v() {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.INSTANCE.loading(null));
        A();
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: mn1
            @Override // java.lang.Runnable
            public final void run() {
                EntranceRepo.w(this.a, mutableLiveData);
            }
        });
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(final EntranceRepo entranceRepo, final MutableLiveData mutableLiveData) {
        boolean zBooleanValue = entranceRepo.trainer.isMale().invoke().booleanValue();
        final ApiResponse apiResponseLoadTrainings$default = TrainingWebApi.DefaultImpls.loadTrainings$default(entranceRepo.webApi, null, DisplayLocationBo.LOOK_AROUND, Boolean.valueOf(zBooleanValue), null, null, null, null, null, null, null, null, null, null, null, null, 20, 32761, null);
        entranceRepo.appExecutors.getMainThread().execute(new Runnable() { // from class: gn1
            @Override // java.lang.Runnable
            public final void run() {
                EntranceRepo.x(apiResponseLoadTrainings$default, entranceRepo, mutableLiveData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(final ApiResponse apiResponse, final EntranceRepo entranceRepo, MutableLiveData mutableLiveData) {
        if (apiResponse instanceof ApiSuccessResponse) {
            entranceRepo.pagingKeyHelper.setKanKanPagingKey(((Items) ((ApiSuccessResponse) apiResponse).getBody()).getNext());
            entranceRepo.appExecutors.getDiskIO().execute(new Runnable() { // from class: nn1
                @Override // java.lang.Runnable
                public final void run() {
                    EntranceRepo.y(this.a, apiResponse);
                }
            });
            mutableLiveData.setValue(Resource.INSTANCE.success(null));
        } else if (apiResponse instanceof ApiEmptyResponse) {
            mutableLiveData.setValue(Resource.INSTANCE.success(null));
        } else if (apiResponse instanceof ApiErrorResponse) {
            mutableLiveData.setValue(Resource.INSTANCE.error(((ApiErrorResponse) apiResponse).getErrorMessage(), null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(final EntranceRepo entranceRepo, ApiResponse apiResponse) {
        entranceRepo.entranceDao.clearLookAroundTrainings();
        final List items = ((Items) ((ApiSuccessResponse) apiResponse).getBody()).getItems();
        entranceRepo.db.runInTransaction(new Runnable() { // from class: on1
            @Override // java.lang.Runnable
            public final void run() {
                EntranceRepo.z(this.a, items);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(EntranceRepo entranceRepo, List list) {
        TrainingDao trainingDao = entranceRepo.trainingDao;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Training trainingPo = WebBeanToPoExKt.toTrainingPo((TrainingBean) it2.next());
            if (trainingPo != null) {
                arrayList.add(trainingPo);
            }
        }
        trainingDao.insertOrUpdateTrainings(arrayList);
        EntranceDao entranceDao = entranceRepo.entranceDao;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new LookAround(((TrainingBean) it3.next()).getId()));
        }
        entranceDao.insertLookAroundTrainings(arrayList2);
    }

    @MainThread
    @NotNull
    public final LiveData<Resource<Integer>> loadAllJoinedCourse() {
        return new NetworkBoundResource<Integer, Items<JoinedTrainingBean>, Integer>(this.appExecutors) { // from class: com.huami.training.repo.EntranceRepo.loadAllJoinedCourse.1

            /* JADX INFO: renamed from: com.huami.training.repo.EntranceRepo$loadAllJoinedCourse$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<ApiResponse<Items<JoinedTrainingBean>>> {
                public final /* synthetic */ EntranceRepo a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(EntranceRepo entranceRepo) {
                    super(0);
                    this.a = entranceRepo;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ApiResponse<Items<JoinedTrainingBean>> invoke() {
                    return TrainingWebApi.DefaultImpls.loadJoinedTrainings$default(this.a.webApi, null, null, null, 7, null);
                }
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            @NotNull
            public LiveData<ApiResponse<Items<JoinedTrainingBean>>> createCall() {
                return LoadOnActiveLiveData.INSTANCE.create(EntranceRepo.this.appExecutors.getNetworkIO(), new a(EntranceRepo.this));
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            @NotNull
            public LiveData<Integer> loadFromDb() {
                return EntranceRepo.this.participationDao.queryAllJoinedTrainingsCount();
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            @Nullable
            public Integer poToVo(@Nullable Integer po) {
                return po;
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            public boolean shouldFetch(@Nullable Integer data) {
                return true;
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            public void saveCallResult(@NotNull Items<JoinedTrainingBean> result) {
                TrainingDbExKt.saveAllJoinedTrainings(EntranceRepo.this.db, result.getItems());
            }
        }.asLiveData();
    }

    @NotNull
    public final LiveData<Resource<List<EntranceSubjectVo>>> loadBannerData() {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(this.entranceDao.querySubjects(SubjectPlace.COURSE_CAROUSEL), new Observer() { // from class: kn1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceRepo.p(mediatorLiveData, (List) obj);
            }
        });
        return mediatorLiveData;
    }

    @NotNull
    public final LiveData<Resource<Unit>> loadEntranceCards() {
        return new C15471(this.appExecutors).asLiveData();
    }

    @MainThread
    @NotNull
    public final Listing<TrainingVo> loadKanKanList() {
        KanKanBoundaryCallback kanKanBoundaryCallback = new KanKanBoundaryCallback(this.webApi, this.trainer, new c(this), this.appExecutors, 20, this.pagingKeyHelper);
        MutableLiveData mutableLiveData = new MutableLiveData();
        LiveData liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function() { // from class: en1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceRepo.q(this.a, (Unit) obj);
            }
        });
        PagedList.Config configBuild = new PagedList.Config.Builder().setEnablePlaceholders(true).setPageSize(20).setInitialLoadSizeHint(20).setPrefetchDistance(0).build();
        final boolean zBooleanValue = this.trainer.isMale().invoke().booleanValue();
        return new Listing<>(new LivePagedListBuilder(this.entranceDao.queryLookAroundTrainings().map(new Function() { // from class: hn1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceRepo.r(zBooleanValue, (Training) obj);
            }
        }), configBuild).setBoundaryCallback(kanKanBoundaryCallback).setFetchExecutor(this.appExecutors.getDiskIO()).build(), kanKanBoundaryCallback.getNetworkState(), liveDataSwitchMap, new a(mutableLiveData), new b(kanKanBoundaryCallback));
    }

    @NotNull
    public final LiveData<Resource<List<EntranceKingVo>>> loadKingData() {
        return Transformations.map(this.entranceDao.queryKingList(), new Function() { // from class: in1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceRepo.s((List) obj);
            }
        });
    }

    @NotNull
    public final LiveData<Resource<List<EntranceSubjectVo>>> loadSubjectData() {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(this.entranceDao.querySubjects(SubjectPlace.COURSE_SUBJECT), new Observer() { // from class: ln1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceRepo.t(mediatorLiveData, (List) obj);
            }
        });
        return mediatorLiveData;
    }

    @MainThread
    @NotNull
    public final LiveData<Resource<List<TagVo>>> loadTodayTag() {
        return Transformations.map(this.entranceDao.queryTodayTag(), new Function() { // from class: jn1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceRepo.u((List) obj);
            }
        });
    }

    @MainThread
    @NotNull
    public final LiveData<Resource<List<TrainingVo>>> loadTodayTraining(long tagId) {
        return new C15481(tagId, this.appExecutors).asLiveData();
    }
}
