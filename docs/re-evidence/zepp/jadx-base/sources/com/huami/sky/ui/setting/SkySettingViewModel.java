package com.huami.sky.ui.setting;

import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.sky.lib.entity.MusicPreferenceItem;
import com.huami.sky.lib.entity.SleepReminderSettingInfo;
import com.huami.sky.lib.usecase.GetMusicPreferenceInfoUseCase;
import com.huami.sky.lib.usecase.GetReminderDetailUseCase;
import com.huami.sky.lib.usecase.SetReminderOpenUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/ui/setting/SkySettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/flow/Flow;", "", "musicPrefsFlow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sky/lib/entity/SleepReminderSettingInfo;", "sleepReminderFlow", "", "isOpen", "", "setReminderIsOpen", "Lcom/huami/sky/lib/usecase/GetMusicPreferenceInfoUseCase;", "a", "Lcom/huami/sky/lib/usecase/GetMusicPreferenceInfoUseCase;", "getMusicPreferenceInfoUseCase", "Lcom/huami/sky/lib/usecase/GetReminderDetailUseCase;", "b", "Lcom/huami/sky/lib/usecase/GetReminderDetailUseCase;", "getReminderDetailUseCase", "Lcom/huami/sky/lib/usecase/SetReminderOpenUseCase;", "c", "Lcom/huami/sky/lib/usecase/SetReminderOpenUseCase;", "setReminderOpenUseCase", "<init>", "(Lcom/huami/sky/lib/usecase/GetMusicPreferenceInfoUseCase;Lcom/huami/sky/lib/usecase/GetReminderDetailUseCase;Lcom/huami/sky/lib/usecase/SetReminderOpenUseCase;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkySettingViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetMusicPreferenceInfoUseCase getMusicPreferenceInfoUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GetReminderDetailUseCase getReminderDetailUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SetReminderOpenUseCase setReminderOpenUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.setting.SkySettingViewModel", f = "SkySettingViewModel.kt", i = {}, l = {29}, m = "musicPrefsFlow", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return SkySettingViewModel.this.musicPrefsFlow(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<MusicPreferenceItem, CharSequence> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull MusicPreferenceItem musicPreferenceItem) {
            return musicPreferenceItem.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.setting.SkySettingViewModel$setReminderIsOpen$1", f = "SkySettingViewModel.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkySettingViewModel.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SetReminderOpenUseCase setReminderOpenUseCase = SkySettingViewModel.this.setReminderOpenUseCase;
                boolean z = this.c;
                this.a = 1;
                if (setReminderOpenUseCase.invoke(z, this) == coroutine_suspended) {
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

    public SkySettingViewModel(@NotNull GetMusicPreferenceInfoUseCase getMusicPreferenceInfoUseCase, @NotNull GetReminderDetailUseCase getReminderDetailUseCase, @NotNull SetReminderOpenUseCase setReminderOpenUseCase) {
        this.getMusicPreferenceInfoUseCase = getMusicPreferenceInfoUseCase;
        this.getReminderDetailUseCase = getReminderDetailUseCase;
        this.setReminderOpenUseCase = setReminderOpenUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object musicPrefsFlow(@NotNull Continuation<? super Flow<String>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            GetMusicPreferenceInfoUseCase getMusicPreferenceInfoUseCase = this.getMusicPreferenceInfoUseCase;
            aVar.c = 1;
            objInvoke = getMusicPreferenceInfoUseCase.invoke(aVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        final Flow flow = (Flow) objInvoke;
        return new Flow<String>() { // from class: com.huami.sky.ui.setting.SkySettingViewModel$musicPrefsFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.sky.ui.setting.SkySettingViewModel$musicPrefsFlow$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends MusicPreferenceItem>> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.huami.sky.ui.setting.SkySettingViewModel$musicPrefsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sky.ui.setting.SkySettingViewModel$musicPrefsFlow$$inlined$map$1$2", f = "SkySettingViewModel.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends MusicPreferenceItem> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends MusicPreferenceItem> list2 = list;
                        String strJoinToString$default = list2 == null ? null : CollectionsKt___CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, SkySettingViewModel.b.a, 30, null);
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(strJoinToString$default, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super String> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final void setReminderIsOpen(boolean isOpen) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new c(isOpen, null), 3, null);
    }

    @Nullable
    public final Object sleepReminderFlow(@NotNull Continuation<? super Flow<SleepReminderSettingInfo>> continuation) {
        return this.getReminderDetailUseCase.invoke(continuation);
    }
}
