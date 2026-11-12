package com.huami.training.repo;

import androidx.arch.core.util.Function;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.DisplayLocationBo;
import com.huami.training.api.TrainingTypeBo;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.TrainingBean;
import com.huami.training.converter.PoToVoExKt;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.dao.UserCourseDao;
import com.huami.training.db.po.Training;
import com.huami.training.db.po.UserCourse;
import com.huami.training.dto.Trainer;
import com.huami.training.helper.AppExecutors;
import com.huami.training.helper.PagingHelper;
import com.huami.training.paging.PagingKeyCache;
import com.huami.training.repo.UserCourseRepo;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.Listing;
import com.huami.training.vo.TrainingVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/training/repo/UserCourseRepo;", "", "", "userId", "Lcom/huami/training/vo/Listing;", "Lcom/huami/training/vo/TrainingVo;", "loadCoursesInProfile", "", "clearCoursesInProfile", "Lcom/huami/training/helper/AppExecutors;", "a", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/db/TrainingDb;", "b", "Lcom/huami/training/db/TrainingDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/training/api/TrainingWebApi;", "c", "Lcom/huami/training/api/TrainingWebApi;", "webApi", "Lcom/huami/training/paging/PagingKeyCache;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/paging/PagingKeyCache;", "pagingKeyCache", "Lcom/huami/training/dto/Trainer;", "e", "Lcom/huami/training/dto/Trainer;", "trainer", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/db/TrainingDb;Lcom/huami/training/api/TrainingWebApi;Lcom/huami/training/paging/PagingKeyCache;Lcom/huami/training/dto/Trainer;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class UserCourseRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TrainingDb db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TrainingWebApi webApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyCache pagingKeyCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Trainer trainer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/TrainingBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Items<TrainingBean>, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull Items<TrainingBean> items) {
            Long next = items.getNext();
            if (next == null) {
                return null;
            }
            return next.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "nextPageKey", "Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/TrainingBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<String, ApiResponse<Items<TrainingBean>>> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ApiResponse<Items<TrainingBean>> invoke(@Nullable String str) {
            return TrainingWebApi.DefaultImpls.loadTrainings$default(UserCourseRepo.this.webApi, x.setOf(TrainingTypeBo.FEATURED_COURSE), DisplayLocationBo.MIFIT_CIRCLE, null, null, null, null, null, null, this.b, null, null, null, null, null, str == null ? null : Long.valueOf(Long.parseLong(str)), 20, 16124, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            UserCourseRepo.this.db.userCourseDao().deleteUserCoursesByUser(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/TrainingBean;", "body", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Items<TrainingBean>, Unit> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(UserCourseRepo userCourseRepo, List list, String str) {
            TrainingDao trainingDao = userCourseRepo.db.trainingDao();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Training trainingPo = WebBeanToPoExKt.toTrainingPo((TrainingBean) it2.next());
                if (trainingPo != null) {
                    arrayList.add(trainingPo);
                }
            }
            trainingDao.insertOrUpdateTrainings(arrayList);
            UserCourseDao userCourseDao = userCourseRepo.db.userCourseDao();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new UserCourse(((TrainingBean) it3.next()).getId(), str));
            }
            userCourseDao.insertUserCourses(arrayList2);
        }

        public final void b(@NotNull Items<TrainingBean> items) {
            final List<TrainingBean> items2 = items.getItems();
            final UserCourseRepo userCourseRepo = UserCourseRepo.this;
            final String str = this.b;
            userCourseRepo.db.runInTransaction(new Runnable() { // from class: com.huami.training.repo.a
                @Override // java.lang.Runnable
                public final void run() {
                    UserCourseRepo.d.c(userCourseRepo, items2, str);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Items<TrainingBean> items) {
            b(items);
            return Unit.INSTANCE;
        }
    }

    public UserCourseRepo(@NotNull AppExecutors appExecutors, @NotNull TrainingDb trainingDb, @NotNull TrainingWebApi trainingWebApi, @NotNull PagingKeyCache pagingKeyCache, @NotNull Trainer trainer) {
        this.appExecutors = appExecutors;
        this.db = trainingDb;
        this.webApi = trainingWebApi;
        this.pagingKeyCache = pagingKeyCache;
        this.trainer = trainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(UserCourseRepo userCourseRepo, String str) {
        userCourseRepo.db.userCourseDao().deleteUserCoursesByUser(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingVo d(UserCourseRepo userCourseRepo, Training training) {
        return PoToVoExKt.toTrainingVo(training, userCourseRepo.trainer.isMale().invoke().booleanValue());
    }

    public final void clearCoursesInProfile(@NotNull final String userId) {
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: x58
            @Override // java.lang.Runnable
            public final void run() {
                UserCourseRepo.c(this.a, userId);
            }
        });
    }

    @NotNull
    public final Listing<TrainingVo> loadCoursesInProfile(@NotNull String userId) {
        this.trainer.isMale().invoke().booleanValue();
        return new PagingHelper(this.appExecutors, this.db, this.pagingKeyCache, Intrinsics.stringPlus("COURSE_IN_FITTIME_PROFILE_", userId), a.a, new b(userId), this.db.userCourseDao().queryFullUserCoursesForPaging(userId).map(new Function() { // from class: w58
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return UserCourseRepo.d(this.a, (Training) obj);
            }
        }), new c(userId), new d(userId)).getListing();
    }
}
