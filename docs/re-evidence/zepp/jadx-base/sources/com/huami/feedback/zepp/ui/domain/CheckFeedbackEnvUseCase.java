package com.huami.feedback.zepp.ui.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.huami.feedback.domain.CheckContactValidateUseCase;
import com.huami.feedback.domain.CheckSyncLogConnectEnvUseCase;
import com.huami.feedback.domain.CheckSyncLogDeviceEnvUseCase;
import com.huami.feedback.domain.ContactValidateState;
import com.huami.feedback.domain.SyncLogConnectEnvStatus;
import com.huami.feedback.domain.SyncLogDeviceEnvState;
import com.huami.feedback.entity.Contact;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.zepp.ui.R;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001d\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUseCase;", "", "Lcom/huami/feedback/entity/Contact;", ContactSettingItemActivity.KEY_CONTACT, "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState;", "b", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "a", "c", "(Lcom/huami/feedback/sync/api/device/DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "(Lcom/huami/feedback/entity/Contact;Lcom/huami/feedback/sync/api/device/DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/feedback/domain/CheckContactValidateUseCase;", "Lcom/huami/feedback/domain/CheckContactValidateUseCase;", "checkContactValidateUseCase", "Lcom/huami/feedback/domain/CheckSyncLogConnectEnvUseCase;", "Lcom/huami/feedback/domain/CheckSyncLogConnectEnvUseCase;", "checkSyncLogConnectEnvUseCase", "Lcom/huami/feedback/domain/CheckSyncLogDeviceEnvUseCase;", "Lcom/huami/feedback/domain/CheckSyncLogDeviceEnvUseCase;", "checkSyncLogDeviceEnvUseCase", "<init>", "(Lcom/huami/feedback/domain/CheckContactValidateUseCase;Lcom/huami/feedback/domain/CheckSyncLogConnectEnvUseCase;Lcom/huami/feedback/domain/CheckSyncLogDeviceEnvUseCase;)V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public final class CheckFeedbackEnvUseCase {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CheckContactValidateUseCase checkContactValidateUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CheckSyncLogConnectEnvUseCase checkSyncLogConnectEnvUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CheckSyncLogDeviceEnvUseCase checkSyncLogDeviceEnvUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ContactValidateState.values().length];
            iArr[ContactValidateState.EmailInValid.ordinal()] = 1;
            iArr[ContactValidateState.PhoneNumInValid.ordinal()] = 2;
            iArr[ContactValidateState.WeChatIDInValid.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SyncLogConnectEnvStatus.values().length];
            iArr2[SyncLogConnectEnvStatus.BluetoothOff.ordinal()] = 1;
            iArr2[SyncLogConnectEnvStatus.NoNetwork.ordinal()] = 2;
            iArr2[SyncLogConnectEnvStatus.Disconnected.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SyncLogDeviceEnvState.values().length];
            iArr3[SyncLogDeviceEnvState.FirmwareUpgrading.ordinal()] = 1;
            iArr3[SyncLogDeviceEnvState.MusicAlive.ordinal()] = 2;
            iArr3[SyncLogDeviceEnvState.VoiceAssistantAlive.ordinal()] = 3;
            iArr3[SyncLogDeviceEnvState.SyncingData.ordinal()] = 4;
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DeviceType.values().length];
            iArr4[DeviceType.BAND.ordinal()] = 1;
            iArr4[DeviceType.WATCH.ordinal()] = 2;
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.domain.CheckFeedbackEnvUseCase", f = "CheckFeedbackEnvUseCase.kt", i = {0}, l = {74}, m = "checkDeviceEnv", n = {"deviceType"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return CheckFeedbackEnvUseCase.this.c(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.domain.CheckFeedbackEnvUseCase", f = "CheckFeedbackEnvUseCase.kt", i = {}, l = {40}, m = "invoke", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return CheckFeedbackEnvUseCase.this.invoke(null, null, this);
        }
    }

    public CheckFeedbackEnvUseCase(@NotNull CheckContactValidateUseCase checkContactValidateUseCase, @NotNull CheckSyncLogConnectEnvUseCase checkSyncLogConnectEnvUseCase, @NotNull CheckSyncLogDeviceEnvUseCase checkSyncLogDeviceEnvUseCase) {
        this.checkContactValidateUseCase = checkContactValidateUseCase;
        this.checkSyncLogConnectEnvUseCase = checkSyncLogConnectEnvUseCase;
        this.checkSyncLogDeviceEnvUseCase = checkSyncLogDeviceEnvUseCase;
    }

    private final CheckFeedbackEnvUiState a(DeviceType deviceType) {
        int i = WhenMappings.$EnumSwitchMapping$1[this.checkSyncLogConnectEnvUseCase.invoke(deviceType).ordinal()];
        if (i == 1) {
            return new CheckFeedbackEnvUiState.ActionError(ActionType.OPEN_BLUETOOTH);
        }
        if (i == 2) {
            return new CheckFeedbackEnvUiState.ToastError(ToastType.ICON_TOAST, R.string.feedback_no_network_connection);
        }
        if (i != 3) {
            return null;
        }
        return new CheckFeedbackEnvUiState.ActionError(ActionType.CONNECT_DEVICE);
    }

    private final CheckFeedbackEnvUiState b(Contact contact) {
        Integer numValueOf;
        int i = WhenMappings.$EnumSwitchMapping$0[this.checkContactValidateUseCase.invoke(contact).ordinal()];
        if (i == 1) {
            numValueOf = Integer.valueOf(R.string.feedback_input_correct_contact_info);
        } else if (i != 2) {
            numValueOf = i != 3 ? null : Integer.valueOf(R.string.feedback_contact_wechat_correct);
        } else {
            numValueOf = Integer.valueOf(R.string.feedback_contact_phone_correct);
        }
        if (numValueOf != null) {
            return new CheckFeedbackEnvUiState.ToastError(ToastType.CUSTOM_TOAST, numValueOf.intValue());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(DeviceType deviceType, Continuation<? super CheckFeedbackEnvUiState> continuation) {
        a aVar;
        Integer numBoxInt;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            CheckSyncLogDeviceEnvUseCase checkSyncLogDeviceEnvUseCase = this.checkSyncLogDeviceEnvUseCase;
            aVar.a = deviceType;
            aVar.d = 1;
            objInvoke = checkSyncLogDeviceEnvUseCase.invoke(deviceType, aVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceType = (DeviceType) aVar.a;
            ResultKt.throwOnFailure(objInvoke);
        }
        int i3 = WhenMappings.$EnumSwitchMapping$2[((SyncLogDeviceEnvState) objInvoke).ordinal()];
        if (i3 == 1) {
            numBoxInt = Boxing.boxInt(R.string.feedback_device_upgrade_tips);
        } else if (i3 == 2) {
            int i4 = WhenMappings.$EnumSwitchMapping$3[deviceType.ordinal()];
            if (i4 == 1) {
                numBoxInt = Boxing.boxInt(com.huami.feedback.R.string.feed_back_music_running);
            } else if (i4 != 2) {
                numBoxInt = null;
            } else {
                numBoxInt = Boxing.boxInt(com.huami.feedback.R.string.feed_back_music_running_watch);
            }
        } else if (i3 == 3) {
            int i5 = WhenMappings.$EnumSwitchMapping$3[deviceType.ordinal()];
            if (i5 == 1) {
                numBoxInt = Boxing.boxInt(com.huami.feedback.R.string.feed_back_xiaoai_alive);
            } else if (i5 != 2) {
                numBoxInt = null;
            } else {
                numBoxInt = Boxing.boxInt(com.huami.feedback.R.string.feed_back_xiaoai_alive_watch);
            }
        } else if (i3 != 4) {
            numBoxInt = null;
        } else {
            numBoxInt = Boxing.boxInt(R.string.feedback_device_sync_data_tips);
        }
        if (numBoxInt != null) {
            return new CheckFeedbackEnvUiState.ToastError(ToastType.ICON_TOAST, numBoxInt.intValue());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object invoke(@NotNull Contact contact, @Nullable DeviceType deviceType, @NotNull Continuation<? super CheckFeedbackEnvUiState> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objC = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            CheckFeedbackEnvUiState checkFeedbackEnvUiStateB = b(contact);
            if (checkFeedbackEnvUiStateB != null || (checkFeedbackEnvUiStateB = a(deviceType)) != null) {
                return checkFeedbackEnvUiStateB;
            }
            if (deviceType == null) {
                return CheckFeedbackEnvUiState.Successful.INSTANCE;
            }
            bVar.c = 1;
            objC = c(deviceType, bVar);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        CheckFeedbackEnvUiState checkFeedbackEnvUiState = (CheckFeedbackEnvUiState) objC;
        return checkFeedbackEnvUiState == null ? CheckFeedbackEnvUiState.Successful.INSTANCE : checkFeedbackEnvUiState;
    }
}
