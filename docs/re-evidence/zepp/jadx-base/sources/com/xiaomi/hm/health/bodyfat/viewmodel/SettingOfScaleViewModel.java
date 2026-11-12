package com.xiaomi.hm.health.bodyfat.viewmodel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.helper.Resource;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleDialog;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.UserScaleInfoRepository;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import com.xiaomi.hm.health.imageload.GlideRoundTransform;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001f\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014R)\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u00158F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019R#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019R)\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00158F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u0019R#\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00158F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u0019¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseAvatarOfScaleDialog$AvatarInfo;", "getDefaultAvatar", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getAvatarList", "", "avatarId", "getAvatarResById", "(Ljava/lang/Integer;Landroid/content/Context;)I", "Lcom/xiaomi/hm/health/databases/model/UserScaleInfo;", "info", "syncScaleOfSettingInfo", "mode", "setMeasureMode", "Lcom/huami/lib/rainbow/ListTile;", "listTile", "loadScaleAvatar", "(Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;)V", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "avatarList", "b", "getChooseAvatarId", "chooseAvatarId", "Lcom/huami/arch/helper/Resource;", "Ljava/lang/Void;", "c", "getResult", "result", GoogleApiAvailabilityLight.a, "getMeasureMode", "measureMode", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class SettingOfScaleViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy avatarList = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy chooseAvatarId = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy result = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy measureMode = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseAvatarOfScaleDialog$AvatarInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<List<? extends ChooseAvatarOfScaleDialog.AvatarInfo>>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<ChooseAvatarOfScaleDialog.AvatarInfo>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseAvatarOfScaleDialog$AvatarInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<ChooseAvatarOfScaleDialog.AvatarInfo>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<ChooseAvatarOfScaleDialog.AvatarInfo> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/helper/Resource;", "Ljava/lang/Void;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<MutableLiveData<Resource<? extends Void>>> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<Void>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.SettingOfScaleViewModel$syncScaleOfSettingInfo$1", f = "SettingOfScaleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ UserScaleInfo b;
        public final /* synthetic */ SettingOfScaleViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(UserScaleInfo userScaleInfo, SettingOfScaleViewModel settingOfScaleViewModel, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = userScaleInfo;
            this.c = settingOfScaleViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UserScaleInfoRepository.INSTANCE.getInstance().addOrUpdateUserScaleInfo(this.b);
            ScaleSettingUpdateUtil.INSTANCE.setAvatarIdAndMeasureMode(BFCallback.getHMPersonInfo().getUserid(), this.b.getAvatarIdOfScale(), this.b.getMeasureMode());
            this.c.getResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.SettingOfScaleViewModel$syncScaleOfSettingInfo$2", f = "SettingOfScaleViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfos self = UserInfoManager.getManager().getSelf();
                if (self != null) {
                    UserScaleInfo userScaleInfoById = UserScaleInfoRepository.INSTANCE.getInstance().getUserScaleInfoById(self.getUserId());
                    if (userScaleInfoById != null) {
                        self.setAvatarIdOfScale(userScaleInfoById.getAvatarIdOfScale());
                        self.setMeasureMode(userScaleInfoById.getMeasureMode());
                    }
                    ScaleSettingUpdateUtil scaleSettingUpdateUtil = ScaleSettingUpdateUtil.INSTANCE;
                    this.a = 1;
                    if (scaleSettingUpdateUtil.addOrUpdateFamilyInfo(self, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    @NotNull
    public final MutableLiveData<List<ChooseAvatarOfScaleDialog.AvatarInfo>> getAvatarList() {
        return (MutableLiveData) this.avatarList.getValue();
    }

    public final int getAvatarResById(@Nullable Integer avatarId, @NotNull Context context) {
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(R.array.avatar_of_scale_res_id);
        int resourceId = (avatarId == null || avatarId.intValue() < 0 || avatarId.intValue() > typedArrayObtainTypedArray.length() + (-1)) ? R.drawable.scale_avatar_0 : typedArrayObtainTypedArray.getResourceId(avatarId.intValue(), 0);
        typedArrayObtainTypedArray.recycle();
        return resourceId;
    }

    @NotNull
    public final MutableLiveData<ChooseAvatarOfScaleDialog.AvatarInfo> getChooseAvatarId() {
        return (MutableLiveData) this.chooseAvatarId.getValue();
    }

    @NotNull
    public final ChooseAvatarOfScaleDialog.AvatarInfo getDefaultAvatar() {
        return new ChooseAvatarOfScaleDialog.AvatarInfo(R.drawable.scale_avatar_0, 0);
    }

    @NotNull
    public final MutableLiveData<Integer> getMeasureMode() {
        return (MutableLiveData) this.measureMode.getValue();
    }

    @NotNull
    public final MutableLiveData<Resource<Void>> getResult() {
        return (MutableLiveData) this.result.getValue();
    }

    public final void loadScaleAvatar(@NotNull final ListTile listTile, @Nullable Integer avatarId) {
        listTile.setVisibility(0);
        ChooseAvatarOfScaleDialog.AvatarInfo value = getChooseAvatarId().getValue();
        Integer numValueOf = value == null ? null : Integer.valueOf(value.getResId());
        HMImageLoader.with(listTile).transform(new GlideRoundTransform(5.0f)).load(numValueOf == null ? getAvatarResById(avatarId, listTile.getContext()) : numValueOf.intValue()).into(new HMLoadTarget<Drawable>() { // from class: com.xiaomi.hm.health.bodyfat.viewmodel.SettingOfScaleViewModel.loadScaleAvatar.1
            @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
            public void onLoadFinish(@Nullable Drawable resource) {
                listTile.setIndicatorHeader(resource);
            }
        });
    }

    public final void setMeasureMode(int mode) {
        getMeasureMode().setValue(Integer.valueOf(mode));
    }

    public final void syncScaleOfSettingInfo(@NotNull UserScaleInfo info) {
        getResult().setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(info, this, null), 2, null);
    }

    public final void getAvatarList(@NotNull Context context) {
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(R.array.avatar_of_scale_res_id);
        ArrayList arrayList = new ArrayList();
        int length = typedArrayObtainTypedArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(new ChooseAvatarOfScaleDialog.AvatarInfo(typedArrayObtainTypedArray.getResourceId(i, 0), i));
                if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        typedArrayObtainTypedArray.recycle();
        getAvatarList().setValue(arrayList);
    }

    public final void syncScaleOfSettingInfo() {
        if (HMWeightUtils.isAmazfitScaleConnect()) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new f(null), 2, null);
        }
    }
}
