package com.huami.ai.speech.simplify.alexa.language;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huami.ai.speech.alexa.uitls.AlexaLanguage;
import com.huami.ai.speech.alexa.uitls.AlexaSupportUtilsKt;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003J5\u0010\u000f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0014R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R%\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0012\u0010\u001dR$\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/ai/speech/simplify/alexa/language/LanguageBean;", "getAllDeviceSupportLanguage", "selectLanguage", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "result", "saveSelectedLanguage", "onCleared", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageRepo;", "b", "Lkotlin/Lazy;", "()Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "c", "()Lkotlin/jvm/functions/Function0;", "deviceFun", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "supportLanguageData", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaLanguageSettingViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy repo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceFun;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<LanguageBean>> supportLanguageData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.simplify.alexa.language.AlexaLanguageSettingViewModel$getAllDeviceSupportLanguage$1", f = "AlexaLanguageSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlexaLanguageSettingViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AlexaLanguage alexaLanguage;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<String> listDeviceSupportLanguages = AlexaLanguageSettingViewModel.this.b().deviceSupportLanguages();
            if (listDeviceSupportLanguages == null) {
                AlexaLanguageSettingViewModel.this.supportLanguageData.postValue(null);
                return Unit.INSTANCE;
            }
            String strCurrentAlexaLanguage = AlexaLanguageSettingViewModel.this.b().currentAlexaLanguage();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDeviceSupportLanguages, 10));
            for (String str : listDeviceSupportLanguages) {
                AlexaLanguage[] allAlexaLanguage = AlexaSupportUtilsKt.getAllAlexaLanguage();
                int length = allAlexaLanguage.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        alexaLanguage = null;
                        break;
                    }
                    alexaLanguage = allAlexaLanguage[i];
                    if (Boxing.boxBoolean(Intrinsics.areEqual(alexaLanguage.getLanguageCode(), str)).booleanValue()) {
                        break;
                    }
                    i++;
                }
                if (alexaLanguage == null) {
                    return Unit.INSTANCE;
                }
                arrayList.add(new LanguageBean(Intrinsics.areEqual(str, strCurrentAlexaLanguage), alexaLanguage.getIndex(), alexaLanguage.getLanguageName(), null, 8, null));
            }
            AlexaLanguageSettingViewModel.this.supportLanguageData.postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.simplify.alexa.language.AlexaLanguageSettingViewModel$saveSelectedLanguage$1", f = "AlexaLanguageSettingViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LanguageBean b;
        public final /* synthetic */ Function1<Boolean, Unit> c;
        public final /* synthetic */ AlexaLanguageSettingViewModel d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.ai.speech.simplify.alexa.language.AlexaLanguageSettingViewModel$saveSelectedLanguage$1$1", f = "AlexaLanguageSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<Boolean, Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Boolean, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.invoke(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.ai.speech.simplify.alexa.language.AlexaLanguageSettingViewModel$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.ai.speech.simplify.alexa.language.AlexaLanguageSettingViewModel$saveSelectedLanguage$1$2", f = "AlexaLanguageSettingViewModel.kt", i = {0}, l = {68, 72}, m = "invokeSuspend", n = {RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE}, s = {"L$0"})
        public static final class C0278b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ LanguageBean c;
            public final /* synthetic */ AlexaLanguageSettingViewModel d;
            public final /* synthetic */ Function1<Boolean, Unit> e;

            /* JADX INFO: renamed from: com.huami.ai.speech.simplify.alexa.language.AlexaLanguageSettingViewModel$b$b$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.ai.speech.simplify.alexa.language.AlexaLanguageSettingViewModel$saveSelectedLanguage$1$2$1$1", f = "AlexaLanguageSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ Function1<Boolean, Unit> b;
                public final /* synthetic */ Boolean c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(Function1<? super Boolean, Unit> function1, Boolean bool, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = function1;
                    this.c = bool;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new a(this.b, this.c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.invoke(Boxing.boxBoolean(Intrinsics.areEqual(this.c, Boxing.boxBoolean(true))));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0278b(LanguageBean languageBean, AlexaLanguageSettingViewModel alexaLanguageSettingViewModel, Function1<? super Boolean, Unit> function1, Continuation<? super C0278b> continuation) {
                super(2, continuation);
                this.c = languageBean;
                this.d = alexaLanguageSettingViewModel;
                this.e = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0278b(this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0278b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0066  */
            /* JADX WARN: Code duplicated, block: B:22:0x0080 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                String languageCode;
                Boolean bool;
                AlexaLanguageSettingViewModel alexaLanguageSettingViewModel;
                MainCoroutineDispatcher main;
                a aVar;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        languageCode = (String) this.a;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                languageCode = AlexaSupportUtilsKt.getAllAlexaLanguage()[this.c.getLangCode() - 1].getLanguageCode();
                HMBaseDevice hMBaseDevice = (HMBaseDevice) this.d.a().getA();
                if (hMBaseDevice == null) {
                    bool = null;
                } else {
                    this.a = languageCode;
                    this.b = 1;
                    obj = DeviceUtilsKt.setDeviceAlexaLanguage(hMBaseDevice, languageCode, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                alexaLanguageSettingViewModel = this.d;
                Function1<Boolean, Unit> function1 = this.e;
                if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                    alexaLanguageSettingViewModel.b().updateLanguageCache(languageCode);
                }
                main = Dispatchers.getMain();
                aVar = new a(function1, bool, null);
                this.a = bool;
                this.b = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
                bool = (Boolean) obj;
                alexaLanguageSettingViewModel = this.d;
                Function1<Boolean, Unit> function2 = this.e;
                if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                    alexaLanguageSettingViewModel.b().updateLanguageCache(languageCode);
                }
                main = Dispatchers.getMain();
                aVar = new a(function2, bool, null);
                this.a = bool;
                this.b = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(LanguageBean languageBean, Function1<? super Boolean, Unit> function1, AlexaLanguageSettingViewModel alexaLanguageSettingViewModel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = languageBean;
            this.c = function1;
            this.d = alexaLanguageSettingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
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
                LanguageBean languageBean = this.b;
                if (languageBean != null) {
                    e.f(GlobalScope.INSTANCE, null, null, new C0278b(languageBean, this.d, this.c, null), 3, null);
                    return Unit.INSTANCE;
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public AlexaLanguageSettingViewModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AlexaLanguageSettingViewModel(CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function0<HMBaseDevice> a() {
        return (Function0) this.deviceFun.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlexaLanguageRepo b() {
        return (AlexaLanguageRepo) this.repo.getValue();
    }

    @NotNull
    public final LiveData<List<LanguageBean>> getAllDeviceSupportLanguage() {
        e.f(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new a(null), 2, null);
        return this.supportLanguageData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    @DelicateCoroutinesApi
    public final void saveSelectedLanguage(@Nullable LanguageBean selectLanguage, @NotNull Function1<? super Boolean, Unit> result) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(selectLanguage, result, this, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlexaLanguageSettingViewModel(@NotNull CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.repo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AlexaLanguageRepo>() { // from class: com.huami.ai.speech.simplify.alexa.language.AlexaLanguageSettingViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AlexaLanguageRepo getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AlexaLanguageRepo.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceFun = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<Function0<? extends HMBaseDevice>>() { // from class: com.huami.ai.speech.simplify.alexa.language.AlexaLanguageSettingViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.jvm.functions.Function0<? extends com.xiaomi.hm.health.bt.device.HMBaseDevice>] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Function0<? extends HMBaseDevice> getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Function0.class), objArr2, objArr3);
            }
        });
        this.supportLanguageData = new MutableLiveData<>();
    }
}
