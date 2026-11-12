package com.xiaomi.hm.health.bodyfat.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.business.ScaleMeasureOwner;
import com.huami.bluetooth.profile.channel.module.ChannelModuleProvider;
import com.huami.bluetooth.profile.channel.module.MeasureMode;
import com.huami.bluetooth.profile.channel.module.ScaleMode;
import com.huami.bluetooth.profile.channel.module.ScaleSettingModule;
import com.huami.bluetooth.profile.channel.module.SettingResult;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bt.device.HMAmazfitScaleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001b\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\u0007R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/utils/ScaleSettingUpdateUtil;", "", "", "userId", "", "avatarId", "mode", "", "setAvatarIdAndMeasureMode", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "user", "addOrUpdateFamilyInfo", "(Lcom/xiaomi/hm/health/databases/model/UserInfos;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteFamilyMember", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isMeasureBody", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "breakMeasure", "exitGuestMode", "exitBabyWeightMode", "a", LogUtil.I, "textDotMatrixWidth", "b", "textDotMatrixHeight", "c", "bigextDotMatrixWidth", GoogleApiAvailabilityLight.a, "bigTextDotMatrixHeight", "e", "Ljava/lang/String;", "mTag", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ScaleSettingUpdateUtil {

    @NotNull
    public static final ScaleSettingUpdateUtil INSTANCE = new ScaleSettingUpdateUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int textDotMatrixWidth = 37;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int textDotMatrixHeight = 12;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int bigextDotMatrixWidth = 59;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int bigTextDotMatrixHeight = 19;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String mTag = "ScaleUpdate";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil", f = "ScaleSettingUpdateUtil.kt", i = {}, l = {58}, m = "addOrUpdateFamilyInfo", n = {}, s = {})
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
            return ScaleSettingUpdateUtil.this.addOrUpdateFamilyInfo(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ UserInfos a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserInfos userInfos) {
            super(0);
            this.a = userInfos;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("user.birthday--", this.a.getBirthday());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("添加或修改用户信息--", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "汉江秤未连接";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil", f = "ScaleSettingUpdateUtil.kt", i = {}, l = {78}, m = "deleteFamilyMember", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ScaleSettingUpdateUtil.this.deleteFamilyMember(0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("删除用户结果--", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "汉江秤未连接";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil$exitBabyWeightMode$1", f = "ScaleSettingUpdateUtil.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ScaleSettingModule scaleSettingModule;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT);
                if ((device instanceof HMAmazfitScaleDevice) && (scaleSettingModule = (ScaleSettingModule) ChannelModuleProvider.INSTANCE.of(device).get(ScaleSettingModule.class)) != null) {
                    MeasureMode measureMode = MeasureMode.MODEL_BABY_WEIGHT;
                    this.a = 1;
                    obj = scaleSettingModule.setModel(measureMode, false, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil$exitGuestMode$1", f = "ScaleSettingUpdateUtil.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ScaleSettingModule scaleSettingModule;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT);
                if ((device instanceof HMAmazfitScaleDevice) && (scaleSettingModule = (ScaleSettingModule) ChannelModuleProvider.INSTANCE.of(device).get(ScaleSettingModule.class)) != null) {
                    this.a = 1;
                    obj = ScaleSettingModule.setGuestModel$default(scaleSettingModule, false, null, this, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil", f = "ScaleSettingUpdateUtil.kt", i = {}, l = {96}, m = "isMeasureBody", n = {}, s = {})
    public static final class j extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ScaleSettingUpdateUtil.this.isMeasureBody(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil$setAvatarIdAndMeasureMode$1", f = "ScaleSettingUpdateUtil.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ UserInfos b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(UserInfos userInfos, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = userInfos;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScaleSettingUpdateUtil scaleSettingUpdateUtil = ScaleSettingUpdateUtil.INSTANCE;
                UserInfos userInfos = this.b;
                this.a = 1;
                if (scaleSettingUpdateUtil.addOrUpdateFamilyInfo(userInfos, this) == coroutine_suspended) {
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

    private ScaleSettingUpdateUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object addOrUpdateFamilyInfo(@NotNull UserInfos userInfos, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        String str;
        Boolean bool;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.c;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT);
                if (device instanceof HMAmazfitScaleDevice) {
                    ScaleSettingModule scaleSettingModule = (ScaleSettingModule) ChannelModuleProvider.INSTANCE.of(device).get(ScaleSettingModule.class);
                    long j2 = Long.parseLong(BFCallback.getHMPersonInfo().getUserid());
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) userInfos.getBirthday(), new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, (Object) null);
                    if (listSplit$default.size() != 2) {
                        HMLog.debug(mTag, new b(userInfos));
                        return Unit.INSTANCE;
                    }
                    if (scaleSettingModule == null) {
                        bool = null;
                        str = mTag;
                    } else {
                        long j3 = Long.parseLong(userInfos.getUserId());
                        int avatarIdOfScale = userInfos.getAvatarIdOfScale();
                        int iIntValue = userInfos.getGender().intValue();
                        int iIntValue2 = userInfos.getHeight().intValue();
                        int measureMode = userInfos.getMeasureMode();
                        int i4 = Integer.parseInt((String) listSplit$default.get(0));
                        int i5 = Integer.parseInt((String) listSplit$default.get(1));
                        byte[] bArrTextToDotMatrix = DotMatrixUtilsKt.textToDotMatrix(userInfos.getName(), 37, 12);
                        String name = userInfos.getName();
                        str = mTag;
                        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrTextToDotMatrix, DotMatrixUtilsKt.textToDotMatrix(name, 59, 19));
                        float fFloatValue = userInfos.getWeight().floatValue();
                        aVar.c = 1;
                        Object objAddOrUpdateFamilyInfo = scaleSettingModule.addOrUpdateFamilyInfo(j2, j3, avatarIdOfScale, iIntValue, iIntValue2, measureMode, i4, i5, bArrPlus, fFloatValue, aVar);
                        if (objAddOrUpdateFamilyInfo == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = objAddOrUpdateFamilyInfo;
                    }
                    HMLog.info(str, new c(bool));
                } else {
                    HMLog.debug(mTag, d.a);
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            str = mTag;
            bool = (Boolean) obj;
            HMLog.info(str, new c(bool));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object breakMeasure(@NotNull Continuation<? super Boolean> continuation) {
        IHMAuthCallback device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT);
        return device instanceof ScaleMeasureOwner ? ((ScaleMeasureOwner) device).getScaleMeasureApi().breakMeasure(continuation) : Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteFamilyMember(long j2, @NotNull Continuation<? super Unit> continuation) {
        e eVar;
        Boolean bool;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.c = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object objDeleteMember = eVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar2.c;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objDeleteMember);
                HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT);
                if (device instanceof HMAmazfitScaleDevice) {
                    ScaleSettingModule scaleSettingModule = (ScaleSettingModule) ChannelModuleProvider.INSTANCE.of(device).get(ScaleSettingModule.class);
                    long j3 = Long.parseLong(BFCallback.getHMPersonInfo().getUserid());
                    if (scaleSettingModule == null) {
                        bool = null;
                    } else {
                        eVar2.c = 1;
                        objDeleteMember = scaleSettingModule.deleteMember(j3, j2, eVar2);
                        if (objDeleteMember == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    HMLog.debug(mTag, new f(bool));
                } else {
                    HMLog.debug(mTag, g.a);
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeleteMember);
            bool = (Boolean) objDeleteMember;
            HMLog.debug(mTag, new f(bool));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    public final void exitBabyWeightMode() {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new h(null), 3, null);
    }

    public final void exitGuestMode() {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new i(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object isMeasureBody(@NotNull Continuation<? super Boolean> continuation) {
        j jVar;
        SettingResult settingResult;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.c = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object model = jVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = jVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(model);
            HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT);
            if (!(device instanceof HMAmazfitScaleDevice)) {
                return Boxing.boxBoolean(false);
            }
            ScaleSettingModule scaleSettingModule = (ScaleSettingModule) ChannelModuleProvider.INSTANCE.of(device).get(ScaleSettingModule.class);
            if (scaleSettingModule == null) {
                settingResult = null;
            } else {
                MeasureMode measureMode = MeasureMode.MODEL_PREGNANT;
                jVar.c = 1;
                model = scaleSettingModule.getModel(measureMode, jVar);
                if (model == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean((settingResult != null ? (ScaleMode) settingResult.getT() : null) == ScaleMode.EnterMode);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(model);
        settingResult = (SettingResult) model;
        return Boxing.boxBoolean((settingResult != null ? (ScaleMode) settingResult.getT() : null) == ScaleMode.EnterMode);
    }

    public final void setAvatarIdAndMeasureMode(@NotNull String userId, int avatarId, int mode) {
        UserInfos info = UserInfoManager.getManager().getInfo(Long.parseLong(userId));
        if (info != null) {
            info.setMeasureMode(mode);
            info.setAvatarIdOfScale(avatarId);
            kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new k(info, null), 3, null);
        }
    }
}
