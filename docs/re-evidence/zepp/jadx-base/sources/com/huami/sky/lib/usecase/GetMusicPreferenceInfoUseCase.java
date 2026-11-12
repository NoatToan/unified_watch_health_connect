package com.huami.sky.lib.usecase;

import com.huami.sky.lib.entity.MusicPreferenceItem;
import com.huami.sky.lib.repo.intro.SelectedMusicPrefsRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/sky/lib/usecase/GetMusicPreferenceInfoUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sky/lib/repo/intro/SelectedMusicPrefsRepo;", "a", "Lcom/huami/sky/lib/repo/intro/SelectedMusicPrefsRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Lcom/huami/sky/lib/repo/intro/SelectedMusicPrefsRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class GetMusicPreferenceInfoUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SelectedMusicPrefsRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.lib.usecase.GetMusicPreferenceInfoUseCase$invoke$2", f = "GetMusicPreferenceInfoUseCase.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends List<? extends MusicPreferenceItem>>>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetMusicPreferenceInfoUseCase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends List<? extends MusicPreferenceItem>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Flow<? extends List<MusicPreferenceItem>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Flow<? extends List<MusicPreferenceItem>>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SelectedMusicPrefsRepo selectedMusicPrefsRepo = GetMusicPreferenceInfoUseCase.this.repo;
                this.a = 1;
                obj = selectedMusicPrefsRepo.getSelectedMusicPrefs(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public GetMusicPreferenceInfoUseCase(@NotNull SelectedMusicPrefsRepo selectedMusicPrefsRepo, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.repo = selectedMusicPrefsRepo;
        this.defaultDispatcher = coroutineDispatcher;
    }

    @Nullable
    public final Object invoke(@NotNull Continuation<? super Flow<? extends List<MusicPreferenceItem>>> continuation) {
        return BuildersKt.withContext(this.defaultDispatcher, new a(null), continuation);
    }

    public /* synthetic */ GetMusicPreferenceInfoUseCase(SelectedMusicPrefsRepo selectedMusicPrefsRepo, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(selectedMusicPrefsRepo, (i & 2) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }
}
