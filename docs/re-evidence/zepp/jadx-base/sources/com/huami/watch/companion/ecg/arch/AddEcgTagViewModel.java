package com.huami.watch.companion.ecg.arch;

import android.app.Application;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.EcgDataRepo;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.db.entity.EcgTagValue;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ecg.arch.AddEcgTagViewModel;
import com.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity;
import com.huami.watch.companion.ecg.util.EcgTagEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J;\u0010\t\u001a\u00020\u00052'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0 0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020&0.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/huami/watch/companion/ecg/arch/AddEcgTagViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "func", "g", "(Lkotlin/jvm/functions/Function2;)V", "", MeDongAuthActivity.ARGS_ECG, "setEcgTag", "Lcom/huami/watch/companion/ecg/util/EcgTagEnum;", "tag", "addTag", "", EcgTag.CUSTOM_TAG, "saveTag", "Lcom/huami/ecg/EcgDataRepo;", "a", "Lkotlin/Lazy;", "f", "()Lcom/huami/ecg/EcgDataRepo;", "mEcgRepo", "Landroidx/lifecycle/MediatorLiveData;", "b", "Landroidx/lifecycle/MediatorLiveData;", "getCustomTagLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "customTagLiveData", "", "c", "getStringTagLiveData", "stringTagLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/watch/companion/arch/Result;", "Lcom/huami/ecg/core/db/entity/EcgTag;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "getSaveStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "saveStatusLiveData", "e", "ecgIdLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "ecgTagData", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class AddEcgTagViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcgRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<String> customTagLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Set<EcgTagEnum>> stringTagLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Result<EcgTag>> saveStatusLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> ecgIdLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<EcgTag> ecgTagData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ecg/EcgDataRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EcgDataRepo> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgDataRepo invoke() {
            return new EcgDataRepo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.AddEcgTagViewModel$safeLaunch$1", f = "AddEcgTagViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.c;
                this.a = 1;
                if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.AddEcgTagViewModel$saveTag$1", f = "AddEcgTagViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AddEcgTagViewModel.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<String> stringTags;
            EcgTagValue value;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcgTag ecgTag = (EcgTag) AddEcgTagViewModel.this.ecgTagData.getValue();
            if (ecgTag == null) {
                ecgTag = new EcgTag();
            }
            Long l = (Long) AddEcgTagViewModel.this.ecgIdLiveData.getValue();
            ecgTag.setEcgId(l == null ? 0L : l.longValue());
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            String str = this.c;
            EcgTag ecgTag2 = (EcgTag) AddEcgTagViewModel.this.ecgTagData.getValue();
            String str2 = null;
            if (ecgTag2 != null && (value = ecgTag2.getValue()) != null) {
                str2 = value.getCom.huami.ecg.core.db.entity.EcgTag.CUSTOM_TAG java.lang.String();
            }
            booleanRef.element = !Intrinsics.areEqual(str, str2);
            AddEcgTagViewModel.this.getCustomTagLiveData().postValue(this.c);
            ArrayList arrayList = new ArrayList();
            EcgTagValue value2 = ecgTag.getValue();
            if (value2 == null) {
                value2 = new EcgTagValue();
            }
            int size = value2.getStringTags().size();
            Set<EcgTagEnum> value3 = AddEcgTagViewModel.this.getStringTagLiveData().getValue();
            if (size != (value3 == null ? 0 : value3.size())) {
                booleanRef.element = true;
            }
            Set<EcgTagEnum> value4 = AddEcgTagViewModel.this.getStringTagLiveData().getValue();
            if (value4 != null) {
                for (EcgTagEnum ecgTagEnum : value4) {
                    arrayList.add(ecgTagEnum.getKey());
                    EcgTagValue value5 = ecgTag.getValue();
                    if (!((value5 == null || (stringTags = value5.getStringTags()) == null || !stringTags.contains(ecgTagEnum.getKey())) ? false : true)) {
                        booleanRef.element = true;
                    }
                }
            }
            if (!booleanRef.element) {
                AddEcgTagViewModel.this.getSaveStatusLiveData().postValue(Result.success(ecgTag));
                return Unit.INSTANCE;
            }
            value2.setStringTags(arrayList);
            ecgTag.setValue(value2);
            AddEcgTagViewModel.this.f().saveEcgTag(ecgTag);
            AddEcgTagViewModel.this.getSaveStatusLiveData().postValue(Result.success(ecgTag));
            return Unit.INSTANCE;
        }
    }

    public AddEcgTagViewModel(@NotNull Application application) {
        super(application);
        this.mEcgRepo = LazyKt__LazyJVMKt.lazy(a.a);
        this.customTagLiveData = new MediatorLiveData<>();
        this.stringTagLiveData = new MediatorLiveData<>();
        this.saveStatusLiveData = new MutableLiveData<>();
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.ecgIdLiveData = mutableLiveData;
        this.ecgTagData = Transformations.switchMap(mutableLiveData, new Function() { // from class: n7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return AddEcgTagViewModel.e(this.a, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData e(AddEcgTagViewModel addEcgTagViewModel, Long l) {
        return addEcgTagViewModel.f().getTagData(l == null ? 0L : l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcgDataRepo f() {
        return (EcgDataRepo) this.mEcgRepo.getValue();
    }

    private final void g(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> func) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(func, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AddEcgTagViewModel addEcgTagViewModel, EcgTag ecgTag) {
        EcgTagValue value;
        MediatorLiveData<String> customTagLiveData = addEcgTagViewModel.getCustomTagLiveData();
        String str = null;
        if (ecgTag != null && (value = ecgTag.getValue()) != null) {
            str = value.getCom.huami.ecg.core.db.entity.EcgTag.CUSTOM_TAG java.lang.String();
        }
        customTagLiveData.postValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AddEcgTagViewModel addEcgTagViewModel, EcgTag ecgTag) {
        EcgTagValue value;
        List<String> stringTags;
        MediatorLiveData<Set<EcgTagEnum>> stringTagLiveData = addEcgTagViewModel.getStringTagLiveData();
        Set<EcgTagEnum> mutableSet = null;
        if (ecgTag != null && (value = ecgTag.getValue()) != null && (stringTags = value.getStringTags()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = stringTags.iterator();
            while (it2.hasNext()) {
                EcgTagEnum ecgTagEnumKeyOf = EcgTagEnum.INSTANCE.keyOf((String) it2.next());
                if (ecgTagEnumKeyOf != null) {
                    arrayList.add(ecgTagEnumKeyOf);
                }
            }
            mutableSet = CollectionsKt___CollectionsKt.toMutableSet(arrayList);
        }
        stringTagLiveData.postValue(mutableSet);
    }

    public final void addTag(@NotNull EcgTagEnum tag) {
        Set<EcgTagEnum> value = this.stringTagLiveData.getValue();
        if (value == null) {
            value = new LinkedHashSet<>();
        }
        if (value.contains(tag)) {
            value.remove(tag);
        } else {
            value.add(tag);
        }
        this.stringTagLiveData.setValue(value);
    }

    @NotNull
    public final MediatorLiveData<String> getCustomTagLiveData() {
        return this.customTagLiveData;
    }

    @NotNull
    public final MutableLiveData<Result<EcgTag>> getSaveStatusLiveData() {
        return this.saveStatusLiveData;
    }

    @NotNull
    public final MediatorLiveData<Set<EcgTagEnum>> getStringTagLiveData() {
        return this.stringTagLiveData;
    }

    public final void saveTag(@NotNull String customTag) {
        g(new c(customTag, null));
    }

    public final void setEcgTag(long ecgId) {
        this.ecgIdLiveData.postValue(Long.valueOf(ecgId));
        this.customTagLiveData.addSource(this.ecgTagData, new Observer() { // from class: p7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddEcgTagViewModel.h(this.a, (EcgTag) obj);
            }
        });
        this.stringTagLiveData.addSource(this.ecgTagData, new Observer() { // from class: o7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddEcgTagViewModel.i(this.a, (EcgTag) obj);
            }
        });
    }
}
