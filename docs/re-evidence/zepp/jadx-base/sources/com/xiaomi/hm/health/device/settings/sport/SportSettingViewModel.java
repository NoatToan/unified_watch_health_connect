package com.xiaomi.hm.health.device.settings.sport;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import com.xiaomi.hm.health.device.settings.sport.model.SportCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/SportSettingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "", "a", "", "loadCategories", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/settings/sport/model/SportCategory;", "Landroidx/lifecycle/MutableLiveData;", "getSportCategories", "()Landroidx/lifecycle/MutableLiveData;", "sportCategories", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "<init>", "(Landroid/app/Application;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportSettingViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<SportCategory>> sportCategories;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.settings.sport.SportSettingViewModel$loadCategories$1", f = "SportSettingViewModel.kt", i = {0}, l = {32}, m = "invokeSuspend", n = {"categories"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.SportSettingViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.settings.sport.SportSettingViewModel$loadCategories$1$1", f = "SportSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0879a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportSettingViewModel b;
            public final /* synthetic */ Ref.ObjectRef<List<SportCategory>> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0879a(SportSettingViewModel sportSettingViewModel, Ref.ObjectRef<List<SportCategory>> objectRef, Continuation<? super C0879a> continuation) {
                super(2, continuation);
                this.b = sportSettingViewModel;
                this.c = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0879a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0879a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.List] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.getApplication();
                List listA = this.b.a();
                ArrayList arrayList = new ArrayList();
                for (SportCategory sportCategory : SportCategory.values()) {
                    Iterator it2 = listA.iterator();
                    while (it2.hasNext()) {
                        if (ArraysKt___ArraysKt.contains(sportCategory.getSportTypes(), Boxing.boxInt(((Number) it2.next()).intValue()))) {
                            arrayList.add(sportCategory);
                            break;
                        }
                    }
                }
                this.c.element = CollectionsKt___CollectionsKt.toList(arrayList);
                Log.d("SportSettingViewModel", "Load Categories: " + ArraysUtil.toString(this.c.element), new Object[0]);
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportSettingViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.ObjectRef objectRef;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = CollectionsKt__CollectionsKt.emptyList();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0879a c0879a = new C0879a(SportSettingViewModel.this, objectRef2, null);
                this.a = objectRef2;
                this.b = 1;
                if (BuildersKt.withContext(io2, c0879a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.a;
                ResultKt.throwOnFailure(obj);
            }
            SportSettingViewModel.this.getSportCategories().setValue(objectRef.element);
            return Unit.INSTANCE;
        }
    }

    public SportSettingViewModel(@NotNull Application application) {
        super(application);
        this.sportCategories = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Integer> a() {
        List<SportTypeItem> list;
        List<Integer> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        State<SportTypeConfig> stateLoadSportTypeFromDevice = SportConfigApiKt.loadSportTypeFromDevice();
        Log.d("SportSettingViewModel", "Load Device SportTypes: " + stateLoadSportTypeFromDevice, new Object[0]);
        if (stateLoadSportTypeFromDevice instanceof Success) {
            SportTypeConfig sportTypeConfig = (SportTypeConfig) ((Success) stateLoadSportTypeFromDevice).getValue();
            if (sportTypeConfig != null && (list = sportTypeConfig.getList()) != null) {
                listEmptyList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    listEmptyList.add(Integer.valueOf(((SportTypeItem) it2.next()).getType()));
                }
            }
        } else {
            listEmptyList = CollectionsKt___CollectionsKt.toList(new IntRange(1, 133));
        }
        Log.d("SportSettingViewModel", "Device SportTypes: " + ArraysUtil.toString(listEmptyList), new Object[0]);
        return listEmptyList;
    }

    @NotNull
    public final MutableLiveData<List<SportCategory>> getSportCategories() {
        return this.sportCategories;
    }

    public final void loadCategories() {
        Log.d("SportSettingViewModel", "Load SportCategories...", new Object[0]);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new a(null), 2, null);
    }
}
