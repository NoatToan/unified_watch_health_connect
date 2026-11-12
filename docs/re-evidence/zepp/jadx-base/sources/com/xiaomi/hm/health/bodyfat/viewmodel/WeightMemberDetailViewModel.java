package com.xiaomi.hm.health.bodyfat.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.event.EventOneFootChanged;
import com.xiaomi.hm.health.bodyfat.event.EventUserInfoUpdate;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseUserFragment;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.UserScaleInfoRepository;
import com.xiaomi.hm.health.bodyfat.manager.WeightGoalManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil;
import com.xiaomi.hm.health.bodyfat.webapi.Resource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\bJ\u0010\u0010\u0014\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015J\"\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u001c\u0010\u001d\u001a\u00020\u00198\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000e\u0010!R)\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0#0\u001e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010!R)\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0#0\u001e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010!¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightMemberDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "", "type", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "user", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$WeightData;", ParamKey.weightData, "", "a", "", "isAdd", "", "uid", "getUserInfo", "saveUserInfo", "Lcom/xiaomi/hm/health/bodyfat/event/EventUserInfoUpdate;", "event", "updateUserInfo", "reloadUserInfoFromWeightGoal", "deleteMember", "Lcom/xiaomi/hm/health/model/account/HMUserInfo;", "hmUserInfo", "parseUserInfo", "addNewMember", "", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "mTag", "Landroidx/lifecycle/MutableLiveData;", "b", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "userInfo", "Lcom/xiaomi/hm/health/bodyfat/webapi/Resource;", "c", "getAddMemberResult", "addMemberResult", GoogleApiAvailabilityLight.a, "getDeleteMemberResult", "deleteMemberResult", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightMemberDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "WeightMember";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfo = LazyKt__LazyJVMKt.lazy(k.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy addMemberResult = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteMemberResult = LazyKt__LazyJVMKt.lazy(d.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bodyfat/webapi/Resource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<Resource<Boolean>>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<Boolean>> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.WeightMemberDetailViewModel$addNewMember$1", f = "WeightMemberDetailViewModel.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ UserInfos c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ChooseUserFragment.WeightData e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ UserInfos a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UserInfos userInfos) {
                super(0);
                this.a = userInfos;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("add member and sync ", this.a);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.viewmodel.WeightMemberDetailViewModel$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0787b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0787b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("Add new member exception >", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ UserInfos a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(UserInfos userInfos) {
                super(0);
                this.a = userInfos;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("Add new member error. User id is > ", this.a.getUserId());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserInfos userInfos, int i, ChooseUserFragment.WeightData weightData, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = userInfos;
            this.d = i;
            this.e = weightData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightMemberDetailViewModel.this.new b(this.c, this.d, this.e, continuation);
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
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HMLog.debug(WeightMemberDetailViewModel.this.getMTag(), new a(this.c));
                    this.c.setSynced(Boxing.boxInt(0));
                    if (UserInfoManager.getManager().syncInfoToServer(this.c)) {
                        ScaleSettingUpdateUtil scaleSettingUpdateUtil = ScaleSettingUpdateUtil.INSTANCE;
                        UserInfos userInfos = this.c;
                        this.a = 1;
                        if (scaleSettingUpdateUtil.addOrUpdateFamilyInfo(userInfos, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        HMLog.info$default(null, new c(this.c), 1, null);
                        WeightMemberDetailViewModel.this.getAddMemberResult().postValue(Resource.success(Boxing.boxBoolean(false)));
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMDaoManager.getInstance().getUserInfosDao().insertOrReplace(this.c);
                UserScaleInfoRepository.INSTANCE.getInstance().addOrUpdateUserScaleInfo(new UserScaleInfo(this.c.getUserId(), this.c.getAvatarIdOfScale(), this.c.getMeasureMode()));
                WeightMemberDetailViewModel.this.a(this.d, this.c, this.e);
                HMWeightUtils.syncToServer();
                WeightMemberDetailViewModel.this.getAddMemberResult().postValue(Resource.success(Boxing.boxBoolean(true)));
            } catch (Exception e) {
                HMLog.error$default(null, null, null, new C0787b(e), 7, null);
                WeightMemberDetailViewModel.this.getAddMemberResult().postValue(Resource.success(Boxing.boxBoolean(false)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.WeightMemberDetailViewModel$deleteMember$1", f = "WeightMemberDetailViewModel.kt", i = {0}, l = {118}, m = "invokeSuspend", n = {"uid"}, s = {"J$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public long a;
        public int b;
        public final /* synthetic */ UserInfos c;
        public final /* synthetic */ WeightMemberDetailViewModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UserInfos userInfos, WeightMemberDetailViewModel weightMemberDetailViewModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = userInfos;
            this.d = weightMemberDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            long j;
            String userId;
            Long lBoxLong;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoManager.getManager().deleteInfoMark(this.c);
                UserScaleInfoRepository companion = UserScaleInfoRepository.INSTANCE.getInstance();
                UserInfos userInfos = this.c;
                companion.deleteUserScaleInfoById(userInfos == null ? null : userInfos.getUserId());
                UserInfos userInfos2 = this.c;
                long jLongValue = 0;
                if (userInfos2 != null && (userId = userInfos2.getUserId()) != null && (lBoxLong = Boxing.boxLong(Long.parseLong(userId))) != null) {
                    jLongValue = lBoxLong.longValue();
                }
                ScaleSettingUpdateUtil scaleSettingUpdateUtil = ScaleSettingUpdateUtil.INSTANCE;
                this.a = jLongValue;
                this.b = 1;
                if (scaleSettingUpdateUtil.deleteFamilyMember(jLongValue, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = jLongValue;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.a;
                ResultKt.throwOnFailure(obj);
            }
            WeightGoalManager.getInstance().deleteUserWeightGoalInLocal(j);
            List<WeightInfos> infosDesc = WeightInfoManager.getManager().getInfosDesc(j);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WeightInfos weightInfos : infosDesc) {
                Integer sync = weightInfos.getSync();
                if (sync != null && sync.intValue() == 0) {
                    arrayList.add(weightInfos);
                } else {
                    arrayList2.add(weightInfos);
                }
            }
            if (!arrayList.isEmpty()) {
                WeightInfoRepository.INSTANCE.getInstance().deleteWeightInfos(arrayList);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((WeightInfos) it2.next()).setSync(Boxing.boxInt(-1));
            }
            if (!arrayList2.isEmpty()) {
                WeightInfoRepository.INSTANCE.getInstance().updateWeightInfos(arrayList2);
                WeightInfoManager.getManager().syncInfosDeletedToServer(arrayList2);
            }
            this.d.getDeleteMemberResult().postValue(Resource.success(Boxing.boxBoolean(true)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bodyfat/webapi/Resource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<MutableLiveData<Resource<Boolean>>> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<Boolean>> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ UserInfos a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(UserInfos userInfos) {
            super(0);
            this.a = userInfos;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("add new member id--", this.a.getUserId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ UserInfos a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(UserInfos userInfos) {
            super(0);
            this.a = userInfos;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "find member id--" + ((Object) this.a.getUserId()) + "--name" + ((Object) this.a.getName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ UserInfos a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(UserInfos userInfos) {
            super(0);
            this.a = userInfos;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("parse member ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.WeightMemberDetailViewModel$reloadUserInfoFromWeightGoal$1", f = "WeightMemberDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ UserInfos a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UserInfos userInfos) {
                super(0);
                this.a = userInfos;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("reload member ", this.a);
            }
        }

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightMemberDetailViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UserInfos value = WeightMemberDetailViewModel.this.getUserInfo().getValue();
            if (value != null) {
                WeightMemberDetailViewModel weightMemberDetailViewModel = WeightMemberDetailViewModel.this;
                UserInfos info = UserInfoManager.getManager().getInfo(Long.parseLong(value.getUserId()));
                HMLog.debug(weightMemberDetailViewModel.getMTag(), new a(value));
                info.setMeasureMode(value.getMeasureMode());
                info.setAvatarIdOfScale(value.getAvatarIdOfScale());
                weightMemberDetailViewModel.saveUserInfo(info);
                weightMemberDetailViewModel.getUserInfo().postValue(info);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.WeightMemberDetailViewModel$saveUserInfo$1", f = "WeightMemberDetailViewModel.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ UserInfos b;
        public final /* synthetic */ WeightMemberDetailViewModel c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ UserInfos a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UserInfos userInfos) {
                super(0);
                this.a = userInfos;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("save member ", this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(UserInfos userInfos, WeightMemberDetailViewModel weightMemberDetailViewModel, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = userInfos;
            this.c = weightMemberDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfos userInfos = this.b;
                if (userInfos != null) {
                    HMLog.debug(this.c.getMTag(), new a(userInfos));
                    UserInfoManager.getManager().updateInfo(userInfos, true);
                    UserScaleInfoRepository.INSTANCE.getInstance().addOrUpdateUserScaleInfo(new UserScaleInfo(userInfos.getUserId(), userInfos.getAvatarIdOfScale(), userInfos.getMeasureMode()));
                    UserInfoManager.getManager().syncInfoToServer(userInfos);
                    ScaleSettingUpdateUtil scaleSettingUpdateUtil = ScaleSettingUpdateUtil.INSTANCE;
                    this.a = 1;
                    if (scaleSettingUpdateUtil.addOrUpdateFamilyInfo(userInfos, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ EventUserInfoUpdate a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(EventUserInfoUpdate eventUserInfoUpdate) {
            super(0);
            this.a = eventUserInfoUpdate;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("update member ", this.a.getInfo());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<MutableLiveData<UserInfos>> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<UserInfos> getA() {
            return new MutableLiveData<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int type, UserInfos user, ChooseUserFragment.WeightData weightData) {
        WeightInfos weightInfos = new WeightInfos();
        weightInfos.setSync(0);
        String userId = user.getUserId();
        weightInfos.setUserId(userId == null ? null : Long.valueOf(Long.parseLong(userId)));
        BFCallback.IHMDeviceManager hMDeviceManager = BFCallback.getHMDeviceManager();
        HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
        weightInfos.setDevice_id(hMDeviceManager.getBoundDeviceId(hMDeviceType));
        weightInfos.setSource(Integer.valueOf(BFCallback.getHMDeviceManager().getBoundDeviceSource(hMDeviceType).getValue()));
        weightInfos.setHeight(user.getHeight());
        weightInfos.setBmi(Float.valueOf(HMWeightUtils.calcuBMI(user.getHeight().intValue(), user.getWeight().floatValue())));
        switch (type) {
            case 16:
            case 17:
                if (weightData != null) {
                    weightInfos.setType(type != 16 ? 2 : 0);
                    weightInfos.setTimestamp(Long.valueOf(weightData.getCreateTime()));
                    weightInfos.setWeight(Float.valueOf(weightData.getWeight()));
                    if (HMWeightUtils.isValidImpedance(weightData.getImpedance())) {
                        WeightAdvData weightAdvData = new WeightAdvData();
                        weightAdvData.setValueKg(weightInfos.getWeight().floatValue());
                        weightAdvData.setImpedance(weightData.getImpedance());
                        weightAdvData.setSourceValue(weightInfos.getSource().intValue());
                        weightAdvData.setTimestamp(weightInfos.getTimestamp().longValue());
                        BodyParamsUtils.addBodyParams(weightInfos, weightAdvData, Long.parseLong(user.getUserId()));
                    }
                } else {
                    weightInfos.setType(1);
                    weightInfos.setTimestamp(Long.valueOf(System.currentTimeMillis()));
                    weightInfos.setWeight(user.getWeight());
                }
                WeightInfoRepository.INSTANCE.getInstance().addWeightInfo(weightInfos);
                break;
            case 18:
                weightInfos.setType(3);
                weightInfos.setOfmt(weightData == null ? null : Float.valueOf(weightData.getOneFootValue()));
                weightInfos.setTimestamp(weightData == null ? null : Long.valueOf(weightData.getCreateTime()));
                weightInfos.setWeight(weightData != null ? Float.valueOf(weightData.getWeight()) : null);
                WeightInfoRepository.INSTANCE.getInstance().addWeightInfo(weightInfos);
                EventBus.getDefault().post(new EventOneFootChanged());
                break;
        }
    }

    public static /* synthetic */ void getUserInfo$default(WeightMemberDetailViewModel weightMemberDetailViewModel, boolean z, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        weightMemberDetailViewModel.getUserInfo(z, j2);
    }

    public final void addNewMember(int type, @Nullable UserInfos user, @Nullable ChooseUserFragment.WeightData weightData) {
        if (user != null) {
            getAddMemberResult().setValue(Resource.loading());
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(user, type, weightData, null), 2, null);
        }
    }

    public final void deleteMember(@Nullable UserInfos user) {
        getDeleteMemberResult().setValue(Resource.loading());
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(user, this, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getAddMemberResult() {
        return (MutableLiveData) this.addMemberResult.getValue();
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getDeleteMemberResult() {
        return (MutableLiveData) this.deleteMemberResult.getValue();
    }

    @NotNull
    public final String getMTag() {
        return this.mTag;
    }

    @NotNull
    public final MutableLiveData<UserInfos> getUserInfo() {
        return (MutableLiveData) this.userInfo.getValue();
    }

    public final void parseUserInfo(@NotNull HMUserInfo hmUserInfo) {
        UserInfos userInfos = new UserInfos();
        userInfos.setName(hmUserInfo.getNickname());
        userInfos.setBirthday(hmUserInfo.getBirthday());
        userInfos.setAvatarUrl(hmUserInfo.getAvatar());
        userInfos.setAvatarPath(hmUserInfo.getAvatarPath());
        userInfos.setGender(Integer.valueOf(hmUserInfo.getGender()));
        userInfos.setHeight(Integer.valueOf(hmUserInfo.getHeight()));
        userInfos.setWeight(Float.valueOf(hmUserInfo.getWeight()));
        userInfos.setTargetWeight(Float.valueOf(hmUserInfo.getTargetWeight()));
        UserInfos value = getUserInfo().getValue();
        userInfos.setMeasureMode(value == null ? 0 : value.getMeasureMode());
        UserInfos value2 = getUserInfo().getValue();
        userInfos.setAvatarIdOfScale(value2 != null ? value2.getAvatarIdOfScale() : 0);
        UserInfos value3 = getUserInfo().getValue();
        userInfos.setUserId(value3 == null ? null : value3.getUserId());
        HMLog.debug(this.mTag, new g(userInfos));
        getUserInfo().setValue(userInfos);
    }

    public final void reloadUserInfoFromWeightGoal() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h(null), 2, null);
    }

    public final void saveUserInfo(@Nullable UserInfos user) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new i(user, this, null), 2, null);
    }

    public final void updateUserInfo(@NotNull EventUserInfoUpdate event) {
        if (event.getInfo() != null) {
            UserInfos info = event.getInfo();
            UserInfos value = getUserInfo().getValue();
            info.setMeasureMode(value == null ? 0 : value.getMeasureMode());
            UserInfos info2 = event.getInfo();
            UserInfos value2 = getUserInfo().getValue();
            info2.setAvatarIdOfScale(value2 != null ? value2.getAvatarIdOfScale() : 0);
            HMLog.debug(this.mTag, new j(event));
            getUserInfo().setValue(event.getInfo());
            saveUserInfo(event.getInfo());
        }
    }

    public final void getUserInfo(boolean isAdd, long uid) {
        if (isAdd) {
            UserInfos userInfos = new UserInfos();
            userInfos.setUserId(String.valueOf(System.currentTimeMillis()));
            userInfos.setMeasureMode(0);
            HMLog.debug(this.mTag, new e(userInfos));
            getUserInfo().setValue(userInfos);
            return;
        }
        UserInfos info = UserInfoManager.getManager().getInfo(uid);
        UserScaleInfo userScaleInfoById = UserScaleInfoRepository.INSTANCE.getInstance().getUserScaleInfoById(info.getUserId());
        info.setMeasureMode(userScaleInfoById == null ? 0 : userScaleInfoById.getMeasureMode());
        info.setAvatarIdOfScale(userScaleInfoById != null ? userScaleInfoById.getAvatarIdOfScale() : 0);
        HMLog.debug(this.mTag, new f(info));
        getUserInfo().setValue(info);
    }
}
