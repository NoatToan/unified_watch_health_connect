package com.huami.assistant.ui.v2.viewmodel;

import android.app.Application;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import com.huami.assistant.ui.v2.model.ScheduleListItemModel;
import com.huami.assistant.ui.v2.repo.ScheduleRepo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\n\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR)\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/assistant/ui/v2/viewmodel/ScheduleListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "index", "", "setLoadStartDayIndex", "Lcom/huami/assistant/ui/v2/repo/ScheduleRepo;", "a", "Lkotlin/Lazy;", "()Lcom/huami/assistant/ui/v2/repo/ScheduleRepo;", "mRepo", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getStartDayIndex", "()Landroidx/lifecycle/MutableLiveData;", "startDayIndex", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleListItemModel;", "c", "getAllData", "()Landroidx/lifecycle/LiveData;", "allData", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleListViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> startDayIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy allData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/LiveData;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleListItemModel;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LiveData<List<ScheduleListItemModel>>> {
        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LiveData c(ScheduleListViewModel scheduleListViewModel, Integer num) {
            return scheduleListViewModel.a().loadAll(num.intValue());
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LiveData<List<ScheduleListItemModel>> invoke() {
            MutableLiveData<Integer> startDayIndex = ScheduleListViewModel.this.getStartDayIndex();
            final ScheduleListViewModel scheduleListViewModel = ScheduleListViewModel.this;
            return Transformations.switchMap(startDayIndex, new Function() { // from class: com.huami.assistant.ui.v2.viewmodel.a
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return ScheduleListViewModel.a.c(scheduleListViewModel, (Integer) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/ScheduleRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ScheduleRepo> {
        public final /* synthetic */ Application a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Application application) {
            super(0);
            this.a = application;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleRepo invoke() {
            return new ScheduleRepo(this.a);
        }
    }

    public ScheduleListViewModel(@NotNull Application application) {
        super(application);
        this.mRepo = LazyKt__LazyJVMKt.lazy(new b(application));
        this.startDayIndex = new MutableLiveData<>(0);
        this.allData = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduleRepo a() {
        return (ScheduleRepo) this.mRepo.getValue();
    }

    @NotNull
    public final LiveData<List<ScheduleListItemModel>> getAllData() {
        return (LiveData) this.allData.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getStartDayIndex() {
        return this.startDayIndex;
    }

    public final void setLoadStartDayIndex(int index) {
        this.startDayIndex.postValue(Integer.valueOf(index));
    }
}
