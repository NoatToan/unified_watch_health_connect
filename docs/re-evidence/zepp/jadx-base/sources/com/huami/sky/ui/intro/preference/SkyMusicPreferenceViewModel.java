package com.huami.sky.ui.intro.preference;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.sky.lib.entity.MusicPreference;
import com.huami.sky.lib.entity.MusicPreferenceItem;
import com.huami.sky.lib.repo.intro.IQuestionnaireRepo;
import com.huami.sky.ui.ext.SkyExtKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\t\u001a\u00020\u00022\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0004J\"\u0010\u000b\u001a\u00020\n2\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0004R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006#"}, d2 = {"Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceViewModel;", "Landroidx/lifecycle/ViewModel;", "", "requestMusicPreferenceInfo", "Lkotlin/Pair;", "", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "selectMusics", "saveMusicPreference", "", "isSelectedChanged", "Lcom/huami/sky/lib/repo/intro/IQuestionnaireRepo;", "a", "Lcom/huami/sky/lib/repo/intro/IQuestionnaireRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "Lcom/huami/sky/lib/entity/MusicPreference;", "b", "Landroidx/lifecycle/MutableLiveData;", "_preferenceLiveData", "Landroidx/lifecycle/LiveData;", "c", "Landroidx/lifecycle/LiveData;", "getPreferenceLiveData", "()Landroidx/lifecycle/LiveData;", "preferenceLiveData", GoogleApiAvailabilityLight.a, "_saveLiveData", "e", "getSaveLiveData", "saveLiveData", "<init>", "(Lcom/huami/sky/lib/repo/intro/IQuestionnaireRepo;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyMusicPreferenceViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IQuestionnaireRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<MusicPreference>> _preferenceLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<State<MusicPreference>> preferenceLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Boolean>> _saveLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<State<Boolean>> saveLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/sky/lib/entity/MusicPreference;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.intro.preference.SkyMusicPreferenceViewModel$requestMusicPreferenceInfo$1", f = "SkyMusicPreferenceViewModel.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super State<? extends MusicPreference>>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return SkyMusicPreferenceViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends MusicPreference>> continuation) {
            return invoke2((Continuation<? super State<MusicPreference>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<MusicPreference>> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IQuestionnaireRepo iQuestionnaireRepo = SkyMusicPreferenceViewModel.this.repo;
                this.a = 1;
                obj = iQuestionnaireRepo.getMusicPreferenceInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new Success((MusicPreference) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.intro.preference.SkyMusicPreferenceViewModel$saveMusicPreference$1$1", f = "SkyMusicPreferenceViewModel.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;
        public final /* synthetic */ Pair<String, List<MusicPreferenceItem>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Pair<String, ? extends List<MusicPreferenceItem>> pair, Continuation<? super b> continuation) {
            super(1, continuation);
            this.c = pair;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return SkyMusicPreferenceViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IQuestionnaireRepo iQuestionnaireRepo = SkyMusicPreferenceViewModel.this.repo;
                Map<String, ? extends List<MusicPreferenceItem>> mapMapOf = q.mapOf(this.c);
                this.a = 1;
                obj = iQuestionnaireRepo.saveAndPostQuestionsToServer(mapMapOf, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new Success(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        }
    }

    public SkyMusicPreferenceViewModel(@NotNull IQuestionnaireRepo iQuestionnaireRepo) {
        this.repo = iQuestionnaireRepo;
        MutableLiveData<State<MusicPreference>> mutableLiveData = new MutableLiveData<>();
        this._preferenceLiveData = mutableLiveData;
        this.preferenceLiveData = mutableLiveData;
        MutableLiveData<State<Boolean>> mutableLiveData2 = new MutableLiveData<>();
        this._saveLiveData = mutableLiveData2;
        this.saveLiveData = mutableLiveData2;
        requestMusicPreferenceInfo();
    }

    @NotNull
    public final LiveData<State<MusicPreference>> getPreferenceLiveData() {
        return this.preferenceLiveData;
    }

    @NotNull
    public final LiveData<State<Boolean>> getSaveLiveData() {
        return this.saveLiveData;
    }

    public final boolean isSelectedChanged(@Nullable Pair<String, ? extends List<MusicPreferenceItem>> selectMusics) {
        if (selectMusics == null) {
            return false;
        }
        return this.repo.isSelectedChanged(q.mapOf(selectMusics));
    }

    public final void requestMusicPreferenceInfo() {
        SkyExtKt.startWithLoading(this._preferenceLiveData, ViewModelKt.getViewModelScope(this), new a(null));
    }

    public final void saveMusicPreference(@Nullable Pair<String, ? extends List<MusicPreferenceItem>> selectMusics) {
        if (selectMusics == null) {
            return;
        }
        SkyExtKt.startWithLoading(this._saveLiveData, ViewModelKt.getViewModelScope(this), new b(selectMusics, null));
    }
}
