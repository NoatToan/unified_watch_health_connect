package com.huami.feedback.zepp.ui;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.feedback.ContactType;
import com.huami.feedback.domain.CheckChineseUserUseCase;
import com.huami.feedback.domain.CombineIssueAndDeviceUseCase;
import com.huami.feedback.domain.ConnectDeviceStates;
import com.huami.feedback.domain.ConnectDeviceUseCase;
import com.huami.feedback.domain.ConvertUserContactUseCase;
import com.huami.feedback.entity.AdditionalInfoData;
import com.huami.feedback.entity.Contact;
import com.huami.feedback.entity.DeviceAndIssue;
import com.huami.feedback.entity.IssueItem;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.repo.BluetoothStateRepository;
import com.huami.feedback.repo.DeviceRepository;
import com.huami.feedback.repo.IssueRepository;
import com.huami.feedback.repo.UserFormRepository;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.util.AnalyticsKt;
import com.huami.feedback.zepp.ui.domain.ActionType;
import com.huami.feedback.zepp.ui.domain.CheckFeedbackEnvUiState;
import com.huami.feedback.zepp.ui.domain.CheckFeedbackEnvUseCase;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.util.language.HmLanguageUtil;
import com.huami.util.language.Language;
import com.loc.z;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0091\u00012\u00020\u0001:\u0002\u0091\u0001BO\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001\u0012\u0006\u0010/\u001a\u00020,\u0012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001\u0012\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u0013\u0010\u001b\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R%\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09088\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR!\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0018088\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010<\u001a\u0004\bE\u0010>R\u0019\u0010I\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u0002088\u0006@\u0006¢\u0006\f\n\u0004\bO\u0010<\u001a\u0004\bP\u0010>R\u001f\u0010T\u001a\b\u0012\u0004\u0012\u00020\t088\u0006@\u0006¢\u0006\f\n\u0004\bR\u0010<\u001a\u0004\bS\u0010>R%\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f09088\u0006@\u0006¢\u0006\f\n\u0004\bU\u0010<\u001a\u0004\bV\u0010>R\u001f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u0010088\u0006@\u0006¢\u0006\f\n\u0004\bX\u0010<\u001a\u0004\bY\u0010>R\u001f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u0010088\u0006@\u0006¢\u0006\f\n\u0004\b[\u0010<\u001a\u0004\b\\\u0010>R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020^0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010BR\u001f\u0010c\u001a\b\u0012\u0004\u0012\u00020^088\u0006@\u0006¢\u0006\f\n\u0004\ba\u0010<\u001a\u0004\bb\u0010>R\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020d0@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010BR\u001f\u0010i\u001a\b\u0012\u0004\u0012\u00020d088\u0006@\u0006¢\u0006\f\n\u0004\bg\u0010<\u001a\u0004\bh\u0010>R\u001c\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00100j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00100n8\u0006@\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010HR\u0018\u0010x\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010{\u001a\u0004\u0018\u00010y8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010zR\u0013\u0010~\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0013\u0010\u007f\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\b\u007f\u0010JR\u0015\u0010\u0081\u0001\u001a\u00020\t8F@\u0006¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010}R\u0015\u0010\u0083\u0001\u001a\u00020\u00108F@\u0006¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010JR\u0015\u0010\u0084\u0001\u001a\u00020\u00108F@\u0006¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010JR\u0017\u0010\u0088\u0001\u001a\u00030\u0085\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0092\u0001"}, d2 = {"Lcom/huami/feedback/zepp/ui/FeedbackViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/feedback/entity/Contact;", ContactSettingItemActivity.KEY_CONTACT, "", "updateContact", "Lcom/huami/feedback/ContactType;", "contactType", "updateContactType", "", "description", "updateDescription", "Landroid/net/Uri;", "uri", "addImage", "deleteImage", "", "checked", "checkAppLog", "checkDeviceLog", "checkFeedbackEnv", "connectDevice", "resetCheckFeedbackUiState", "resetConnectState", "Lcom/huami/feedback/entity/UserForm;", FeedbackActivity.KEY_USER_FORM, "updateUserForm", "submitUserForm", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitFeedback", "checkHistoryFeedback", "needReload", "reloadHistoryFormIfNeedAndClearSavedUserForm", "setForceDark", "from", "setFromSource", "Lcom/huami/feedback/repo/DeviceRepository;", "a", "Lcom/huami/feedback/repo/DeviceRepository;", "deviceRepository", "Lcom/huami/feedback/repo/BluetoothStateRepository;", "b", "Lcom/huami/feedback/repo/BluetoothStateRepository;", "bluetoothStateRepository", "Lcom/huami/account/service/AccountService;", "c", "Lcom/huami/account/service/AccountService;", "accountService", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUseCase;", GoogleApiAvailabilityLight.a, "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUseCase;", "checkFeedbackEnvUseCase", "Lcom/huami/feedback/repo/UserFormRepository;", "e", "Lcom/huami/feedback/repo/UserFormRepository;", "userFormRepository", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/huami/feedback/entity/DeviceAndIssue;", "f", "Lkotlinx/coroutines/flow/StateFlow;", "getDeviceAndIssueStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "deviceAndIssueStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "g", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_userFormState", "h", "getUserFormState", "userFormState", "i", "Z", "isChineseUser", "()Z", "Lcom/huami/feedback/zepp/ui/ContactCache;", z.j, "Lcom/huami/feedback/zepp/ui/ContactCache;", "contactCache", hl.k, "getContactState", "contactState", "l", "getDescriptionState", "descriptionState", "m", "getImagesStateFlow", "imagesStateFlow", GoogleApiAvailabilityLight.b, "getAppLogCheckState", "appLogCheckState", "o", "getDeviceLogCheckState", "deviceLogCheckState", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState;", com.google.android.exoplayer2.text.ttml.b.r, "_checkFeedbackEnvUiState", DTransferConstants.SEARCH_KEY, "getCheckFeedbackEnvUiState", "checkFeedbackEnvUiState", "Lcom/huami/feedback/domain/ConnectDeviceStates;", "r", "_connectStateFlow", SOAP.XMLNS, "getConnectStateFlow", "connectStateFlow", "Landroidx/lifecycle/MutableLiveData;", "t", "Landroidx/lifecycle/MutableLiveData;", "_showRetryDialogState", "Landroidx/lifecycle/LiveData;", "u", "Landroidx/lifecycle/LiveData;", "getShowRetryDialogState", "()Landroidx/lifecycle/LiveData;", "showRetryDialogState", "v", "isForceDarkInternal", "w", "Ljava/lang/String;", FeedbackActivity.KEY_FEEDBACK_SOURCE, "Lcom/huami/feedback/sync/api/device/DeviceType;", "()Lcom/huami/feedback/sync/api/device/DeviceType;", "selectDeviceType", "getUserId", "()Ljava/lang/String;", "userId", "isNeedPhone", "getIssueTitle", "issueTitle", "getDeviceLogCheckBoxVisible", "deviceLogCheckBoxVisible", "isForceDark", "", "getDescriptionLimitSize", "()I", "descriptionLimitSize", "Lcom/huami/feedback/repo/IssueRepository;", "issueRepository", "Lcom/huami/feedback/domain/CheckChineseUserUseCase;", "checkChineseUserUseCase", "Lcom/huami/feedback/domain/ConvertUserContactUseCase;", "convertUserContactUseCase", "<init>", "(Lcom/huami/feedback/repo/DeviceRepository;Lcom/huami/feedback/repo/BluetoothStateRepository;Lcom/huami/feedback/repo/IssueRepository;Lcom/huami/account/service/AccountService;Lcom/huami/feedback/domain/CheckChineseUserUseCase;Lcom/huami/feedback/domain/ConvertUserContactUseCase;Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUseCase;Lcom/huami/feedback/repo/UserFormRepository;)V", "Companion", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public final class FeedbackViewModel extends ViewModel {
    private static final int x = 500;
    private static final int y = 1000;

    @NotNull
    private static final String z = "webview";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceRepository deviceRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BluetoothStateRepository bluetoothStateRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AccountService accountService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CheckFeedbackEnvUseCase checkFeedbackEnvUseCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final UserFormRepository userFormRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<List<DeviceAndIssue>> deviceAndIssueStateFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private MutableStateFlow<UserForm> _userFormState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<UserForm> userFormState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isChineseUser;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ContactCache contactCache;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<Contact> contactState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<String> descriptionState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<List<Uri>> imagesStateFlow;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<Boolean> appLogCheckState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<Boolean> deviceLogCheckState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private MutableStateFlow<CheckFeedbackEnvUiState> _checkFeedbackEnvUiState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<CheckFeedbackEnvUiState> checkFeedbackEnvUiState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableStateFlow<ConnectDeviceStates> _connectStateFlow;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<ConnectDeviceStates> connectStateFlow;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Boolean> _showRetryDialogState;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> showRetryDialogState;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean isForceDarkInternal;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    private String fromSource;
    public static final int $stable = 8;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$checkFeedbackEnv$1", f = "FeedbackViewModel.kt", i = {2}, l = {222, FTPCodes.USER_LOGGED_IN, 231, 241, 242}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeedbackViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x009e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:40:0x00bc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x00cd A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CheckFeedbackEnvUiState checkFeedbackEnvUiState;
            MutableStateFlow mutableStateFlow;
            MutableStateFlow mutableStateFlow2;
            CheckFeedbackEnvUiState.NoneCheck noneCheck;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    checkFeedbackEnvUiState = (CheckFeedbackEnvUiState) obj;
                    mutableStateFlow = FeedbackViewModel.this._checkFeedbackEnvUiState;
                    this.a = checkFeedbackEnvUiState;
                    this.b = 3;
                    if (mutableStateFlow.emit(checkFeedbackEnvUiState, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (checkFeedbackEnvUiState instanceof CheckFeedbackEnvUiState.ActionError) {
                        FeedbackViewModel.this.connectDevice();
                    }
                    this.a = null;
                    this.b = 4;
                    if (DelayKt.delay(50L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableStateFlow2 = FeedbackViewModel.this._checkFeedbackEnvUiState;
                    noneCheck = CheckFeedbackEnvUiState.NoneCheck.INSTANCE;
                    this.b = 5;
                    if (mutableStateFlow2.emit(noneCheck, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    checkFeedbackEnvUiState = (CheckFeedbackEnvUiState) this.a;
                    ResultKt.throwOnFailure(obj);
                    if ((checkFeedbackEnvUiState instanceof CheckFeedbackEnvUiState.ActionError) && ((CheckFeedbackEnvUiState.ActionError) checkFeedbackEnvUiState).getAction() == ActionType.CONNECT_DEVICE) {
                        FeedbackViewModel.this.connectDevice();
                    }
                    this.a = null;
                    this.b = 4;
                    if (DelayKt.delay(50L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableStateFlow2 = FeedbackViewModel.this._checkFeedbackEnvUiState;
                    noneCheck = CheckFeedbackEnvUiState.NoneCheck.INSTANCE;
                    this.b = 5;
                    if (mutableStateFlow2.emit(noneCheck, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    mutableStateFlow2 = FeedbackViewModel.this._checkFeedbackEnvUiState;
                    noneCheck = CheckFeedbackEnvUiState.NoneCheck.INSTANCE;
                    this.b = 5;
                    if (mutableStateFlow2.emit(noneCheck, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.b = 1;
            if (DelayKt.delay(50L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            UserForm value = FeedbackViewModel.this.getUserFormState().getValue();
            DeviceType deviceType = value == null ? null : value.getDeviceType();
            if (!FeedbackViewModel.this.getDeviceLogCheckState().getValue().booleanValue()) {
                deviceType = null;
            }
            CheckFeedbackEnvUseCase checkFeedbackEnvUseCase = FeedbackViewModel.this.checkFeedbackEnvUseCase;
            Contact value2 = FeedbackViewModel.this.getContactState().getValue();
            this.b = 2;
            obj = checkFeedbackEnvUseCase.invoke(value2, deviceType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            checkFeedbackEnvUiState = (CheckFeedbackEnvUiState) obj;
            mutableStateFlow = FeedbackViewModel.this._checkFeedbackEnvUiState;
            this.a = checkFeedbackEnvUiState;
            this.b = 3;
            if (mutableStateFlow.emit(checkFeedbackEnvUiState, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (checkFeedbackEnvUiState instanceof CheckFeedbackEnvUiState.ActionError) {
                FeedbackViewModel.this.connectDevice();
            }
            this.a = null;
            this.b = 4;
            if (DelayKt.delay(50L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow2 = FeedbackViewModel.this._checkFeedbackEnvUiState;
            noneCheck = CheckFeedbackEnvUiState.NoneCheck.INSTANCE;
            this.b = 5;
            if (mutableStateFlow2.emit(noneCheck, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$checkHistoryFeedback$1", f = "FeedbackViewModel.kt", i = {}, l = {SportDeviceUtils.SOURCE_PROVENCE_W}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeedbackViewModel.this.new b(continuation);
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
                UserFormRepository userFormRepository = FeedbackViewModel.this.userFormRepository;
                this.a = 1;
                obj = userFormRepository.getFormData(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((UserForm) obj) != null) {
                FeedbackViewModel.this._showRetryDialogState.setValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$connectDevice$1", f = "FeedbackViewModel.kt", i = {}, l = {258}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeedbackViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object value;
            Object value2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceType deviceTypeA = FeedbackViewModel.this.a();
                if (deviceTypeA == null) {
                    return Unit.INSTANCE;
                }
                MutableStateFlow mutableStateFlow = FeedbackViewModel.this._connectStateFlow;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, ConnectDeviceStates.Connecting));
                ConnectDeviceUseCase connectDeviceUseCase = new ConnectDeviceUseCase(FeedbackViewModel.this.deviceRepository, FeedbackViewModel.this.bluetoothStateRepository);
                this.a = 1;
                obj = connectDeviceUseCase.invoke(deviceTypeA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ConnectDeviceStates connectDeviceStates = ((Boolean) obj).booleanValue() ? ConnectDeviceStates.Connected : ConnectDeviceStates.ConnectFailed;
            MutableStateFlow mutableStateFlow2 = FeedbackViewModel.this._connectStateFlow;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, connectDeviceStates));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$reloadHistoryFormIfNeedAndClearSavedUserForm$1", f = "FeedbackViewModel.kt", i = {}, l = {361, 372}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ FeedbackViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, FeedbackViewModel feedbackViewModel, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = feedbackViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object formData;
            UserFormRepository userFormRepository;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    formData = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (this.b) {
                UserFormRepository userFormRepository2 = this.c.userFormRepository;
                this.a = 1;
                formData = userFormRepository2.getFormData(this);
                if (formData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            userFormRepository = this.c.userFormRepository;
            this.a = 2;
            if (userFormRepository.setFormData(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            UserForm userFormCopy = (UserForm) formData;
            Contact contact = userFormCopy == null ? null : userFormCopy.getContact();
            if (this.c.isNeedPhone() && contact != null && contact.getContactType() != ContactType.PHONE) {
                userFormCopy = userFormCopy.copy((127 & 1) != 0 ? userFormCopy.deviceType : null, (127 & 2) != 0 ? userFormCopy.issueTitle : null, (127 & 4) != 0 ? userFormCopy.issueID : 0, (127 & 8) != 0 ? userFormCopy.issueItem : null, (127 & 16) != 0 ? userFormCopy.description : null, (127 & 32) != 0 ? userFormCopy.contact : null, (127 & 64) != 0 ? userFormCopy.images : null, (127 & 128) != 0 ? userFormCopy.timeStamp : 0L);
            }
            this.c.updateUserForm(userFormCopy);
            userFormRepository = this.c.userFormRepository;
            this.a = 2;
            if (userFormRepository.setFormData(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$submitFeedback$1", f = "FeedbackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeedbackViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String type;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceType deviceTypeA = FeedbackViewModel.this.a();
            String str = "";
            if (deviceTypeA != null && (type = deviceTypeA.getType()) != null) {
                str = type;
            }
            AnalyticsKt.doAnalyticsLogType(str, FeedbackViewModel.this.getAppLogCheckState().getValue().booleanValue(), FeedbackViewModel.this.getDeviceLogCheckState().getValue().booleanValue());
            FeedbackViewModel feedbackViewModel = FeedbackViewModel.this;
            feedbackViewModel.checkAppLog(feedbackViewModel.getAppLogCheckState().getValue().booleanValue());
            FeedbackViewModel feedbackViewModel2 = FeedbackViewModel.this;
            feedbackViewModel2.checkDeviceLog(feedbackViewModel2.getDeviceLogCheckState().getValue().booleanValue());
            FeedbackViewModel.this.checkFeedbackEnv();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$submitUserForm$2", f = "FeedbackViewModel.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeedbackViewModel.this.new f(continuation);
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
                UserForm value = FeedbackViewModel.this.getUserFormState().getValue();
                if ((value == null ? null : value.getContact()) == null) {
                    FeedbackViewModel feedbackViewModel = FeedbackViewModel.this;
                    feedbackViewModel.updateContact(feedbackViewModel.getContactState().getValue());
                }
                UserFormRepository userFormRepository = FeedbackViewModel.this.userFormRepository;
                UserForm value2 = FeedbackViewModel.this.getUserFormState().getValue();
                this.a = 1;
                if (userFormRepository.setFormData(value2, this) == coroutine_suspended) {
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

    public FeedbackViewModel(@NotNull DeviceRepository deviceRepository, @NotNull BluetoothStateRepository bluetoothStateRepository, @NotNull IssueRepository issueRepository, @NotNull AccountService accountService, @NotNull CheckChineseUserUseCase checkChineseUserUseCase, @NotNull final ConvertUserContactUseCase convertUserContactUseCase, @NotNull CheckFeedbackEnvUseCase checkFeedbackEnvUseCase, @NotNull UserFormRepository userFormRepository) {
        this.deviceRepository = deviceRepository;
        this.bluetoothStateRepository = bluetoothStateRepository;
        this.accountService = accountService;
        this.checkFeedbackEnvUseCase = checkFeedbackEnvUseCase;
        this.userFormRepository = userFormRepository;
        Flow<List<DeviceAndIssue>> flowInvoke = new CombineIssueAndDeviceUseCase(deviceRepository, issueRepository).invoke();
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        this.deviceAndIssueStateFlow = FlowKt.stateIn(flowInvoke, viewModelScope, companion.getEagerly(), CollectionsKt__CollectionsKt.emptyList());
        final MutableStateFlow<UserForm> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._userFormState = MutableStateFlow;
        this.userFormState = MutableStateFlow;
        this.isChineseUser = checkChineseUserUseCase.invoke();
        this.contactCache = new ContactCache();
        StateFlow<Contact> stateFlowStateIn = FlowKt.stateIn(new Flow<Contact>() { // from class: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<UserForm> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ ConvertUserContactUseCase b;
                public final /* synthetic */ FeedbackViewModel c;

                /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$1$2", f = "FeedbackViewModel.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, ConvertUserContactUseCase convertUserContactUseCase, FeedbackViewModel feedbackViewModel) {
                    this.a = flowCollector;
                    this.b = convertUserContactUseCase;
                    this.c = feedbackViewModel;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(UserForm userForm, @NotNull Continuation continuation) {
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
                        UserForm userForm2 = userForm;
                        Contact contact = userForm2 == null ? null : userForm2.getContact();
                        if (contact == null) {
                            contact = this.b.invoke(this.c.isNeedPhone());
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(contact, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super Contact> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = MutableStateFlow.collect(new AnonymousClass2(flowCollector, convertUserContactUseCase, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), companion.getEagerly(), convertUserContactUseCase.invoke(isNeedPhone()));
        updateContact(stateFlowStateIn.getValue());
        Unit unit = Unit.INSTANCE;
        this.contactState = stateFlowStateIn;
        final MutableStateFlow<UserForm> mutableStateFlow = this._userFormState;
        this.descriptionState = FlowKt.stateIn(new Flow<String>() { // from class: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$2$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<UserForm> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$2$2", f = "FeedbackViewModel.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
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
                public Object emit(UserForm userForm, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    String description;
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
                        UserForm userForm2 = userForm;
                        String str = "";
                        if (userForm2 != null && (description = userForm2.getDescription()) != null) {
                            str = description;
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(str, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super String> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), companion.getEagerly(), "");
        this.imagesStateFlow = FlowKt.stateIn(new Flow<List<? extends Uri>>() { // from class: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$3$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<UserForm> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$3$2", f = "FeedbackViewModel.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
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
                public Object emit(UserForm userForm, @NotNull Continuation continuation) {
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
                        UserForm userForm2 = userForm;
                        List<Uri> images = userForm2 == null ? null : userForm2.getImages();
                        if (images == null) {
                            images = CollectionsKt__CollectionsKt.emptyList();
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(images, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super List<? extends Uri>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = MutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), companion.getEagerly(), CollectionsKt__CollectionsKt.emptyList());
        Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$4

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$4$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<UserForm> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$4$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$4$2", f = "FeedbackViewModel.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
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
                public Object emit(UserForm userForm, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    IssueItem issueItem;
                    AdditionalInfoData additionalInfo;
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
                        UserForm userForm2 = userForm;
                        Boolean boolBoxBoolean = Boxing.boxBoolean((userForm2 == null || (issueItem = userForm2.getIssueItem()) == null || (additionalInfo = issueItem.getAdditionalInfo()) == null) ? true : additionalInfo.getDefaultSelectAppLog());
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = MutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        CoroutineScope viewModelScope2 = ViewModelKt.getViewModelScope(this);
        SharingStarted eagerly = companion.getEagerly();
        Boolean bool = Boolean.TRUE;
        this.appLogCheckState = FlowKt.stateIn(flow, viewModelScope2, eagerly, bool);
        final MutableStateFlow<UserForm> mutableStateFlow2 = this._userFormState;
        this.deviceLogCheckState = FlowKt.stateIn(new Flow<Boolean>() { // from class: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$5

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$5$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<UserForm> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$5$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackViewModel$special$$inlined$map$5$2", f = "FeedbackViewModel.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
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
                public Object emit(UserForm userForm, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    IssueItem issueItem;
                    AdditionalInfoData additionalInfo;
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
                        UserForm userForm2 = userForm;
                        Boolean boolBoxBoolean = Boxing.boxBoolean((userForm2 == null || (issueItem = userForm2.getIssueItem()) == null || (additionalInfo = issueItem.getAdditionalInfo()) == null) ? true : additionalInfo.getDefaultSelectDeviceLog());
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = mutableStateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), companion.getEagerly(), bool);
        MutableStateFlow<CheckFeedbackEnvUiState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CheckFeedbackEnvUiState.NoneCheck.INSTANCE);
        this._checkFeedbackEnvUiState = MutableStateFlow2;
        this.checkFeedbackEnvUiState = MutableStateFlow2;
        MutableStateFlow<ConnectDeviceStates> MutableStateFlow3 = StateFlowKt.MutableStateFlow(ConnectDeviceStates.ConnectIdle);
        this._connectStateFlow = MutableStateFlow3;
        this.connectStateFlow = MutableStateFlow3;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this._showRetryDialogState = mutableLiveData;
        this.showRetryDialogState = mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceType a() {
        UserForm value = this.userFormState.getValue();
        if (value == null) {
            return null;
        }
        return value.getDeviceType();
    }

    public final void addImage(@NotNull Uri uri) {
        UserForm value = this.userFormState.getValue();
        if (value == null) {
            return;
        }
        List<Uri> images = value.getImages();
        List listPlus = images == null ? null : CollectionsKt___CollectionsKt.plus((Collection<? extends Uri>) images, uri);
        updateUserForm(value.copy((127 & 1) != 0 ? value.deviceType : null, (127 & 2) != 0 ? value.issueTitle : null, (127 & 4) != 0 ? value.issueID : 0, (127 & 8) != 0 ? value.issueItem : null, (127 & 16) != 0 ? value.description : null, (127 & 32) != 0 ? value.contact : null, (127 & 64) != 0 ? value.images : listPlus == null ? CollectionsKt__CollectionsKt.mutableListOf(uri) : listPlus, (127 & 128) != 0 ? value.timeStamp : 0L));
    }

    public final void checkAppLog(boolean checked) {
        UserForm value = this.userFormState.getValue();
        IssueItem issueItem = value == null ? null : value.getIssueItem();
        if (issueItem == null) {
            return;
        }
        IssueItem issueItemCopy$default = IssueItem.copy$default(issueItem, 0, null, new AdditionalInfoData(checked, issueItem.getAdditionalInfo().getDefaultSelectDeviceLog()), 3, null);
        UserForm value2 = this._userFormState.getValue();
        updateUserForm(value2.copy((127 & 1) != 0 ? value2.deviceType : null, (127 & 2) != 0 ? value2.issueTitle : null, (127 & 4) != 0 ? value2.issueID : 0, (127 & 8) != 0 ? value2.issueItem : issueItemCopy$default, (127 & 16) != 0 ? value2.description : null, (127 & 32) != 0 ? value2.contact : null, (127 & 64) != 0 ? value2.images : null, (127 & 128) != 0 ? value2.timeStamp : 0L));
    }

    public final void checkDeviceLog(boolean checked) {
        UserForm value = this.userFormState.getValue();
        IssueItem issueItem = value == null ? null : value.getIssueItem();
        if (issueItem == null) {
            return;
        }
        IssueItem issueItemCopy$default = IssueItem.copy$default(issueItem, 0, null, new AdditionalInfoData(issueItem.getAdditionalInfo().getDefaultSelectAppLog(), checked), 3, null);
        UserForm value2 = this._userFormState.getValue();
        updateUserForm(value2.copy((127 & 1) != 0 ? value2.deviceType : null, (127 & 2) != 0 ? value2.issueTitle : null, (127 & 4) != 0 ? value2.issueID : 0, (127 & 8) != 0 ? value2.issueItem : issueItemCopy$default, (127 & 16) != 0 ? value2.description : null, (127 & 32) != 0 ? value2.contact : null, (127 & 64) != 0 ? value2.images : null, (127 & 128) != 0 ? value2.timeStamp : 0L));
    }

    public final void checkFeedbackEnv() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    public final void checkHistoryFeedback() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    public final void connectDevice() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    public final void deleteImage(@NotNull Uri uri) {
        List<Uri> images;
        Object next;
        UserForm value = this.userFormState.getValue();
        if (value == null || (images = value.getImages()) == null) {
            return;
        }
        Iterator<T> it2 = images.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual((Uri) next, uri));
        if (((Uri) next) == null) {
            return;
        }
        updateUserForm(value.copy((127 & 1) != 0 ? value.deviceType : null, (127 & 2) != 0 ? value.issueTitle : null, (127 & 4) != 0 ? value.issueID : 0, (127 & 8) != 0 ? value.issueItem : null, (127 & 16) != 0 ? value.description : null, (127 & 32) != 0 ? value.contact : null, (127 & 64) != 0 ? value.images : CollectionsKt___CollectionsKt.minus(images, uri), (127 & 128) != 0 ? value.timeStamp : 0L));
    }

    @NotNull
    public final StateFlow<Boolean> getAppLogCheckState() {
        return this.appLogCheckState;
    }

    @NotNull
    public final StateFlow<CheckFeedbackEnvUiState> getCheckFeedbackEnvUiState() {
        return this.checkFeedbackEnvUiState;
    }

    @NotNull
    public final StateFlow<ConnectDeviceStates> getConnectStateFlow() {
        return this.connectStateFlow;
    }

    @NotNull
    public final StateFlow<Contact> getContactState() {
        return this.contactState;
    }

    public final int getDescriptionLimitSize() {
        return HmLanguageUtil.INSTANCE.languageUtil().isLanguageEquals(Locale.getDefault(), Language.ZH) ? 500 : 1000;
    }

    @NotNull
    public final StateFlow<String> getDescriptionState() {
        return this.descriptionState;
    }

    @NotNull
    public final StateFlow<List<DeviceAndIssue>> getDeviceAndIssueStateFlow() {
        return this.deviceAndIssueStateFlow;
    }

    public final boolean getDeviceLogCheckBoxVisible() {
        UserForm value = this.userFormState.getValue();
        DeviceType deviceType = value == null ? null : value.getDeviceType();
        if (deviceType == null) {
            return false;
        }
        boolean z2 = this.userFormState.getValue().getIssueID() != 14000 && this.deviceRepository.isSupportSyncLog(deviceType);
        if (!z2) {
            checkDeviceLog(false);
        }
        return z2;
    }

    @NotNull
    public final StateFlow<Boolean> getDeviceLogCheckState() {
        return this.deviceLogCheckState;
    }

    @NotNull
    public final StateFlow<List<Uri>> getImagesStateFlow() {
        return this.imagesStateFlow;
    }

    @NotNull
    public final String getIssueTitle() {
        String issueTitle;
        UserForm value = this.userFormState.getValue();
        return (value == null || (issueTitle = value.getIssueTitle()) == null) ? "" : issueTitle;
    }

    @NotNull
    public final LiveData<Boolean> getShowRetryDialogState() {
        return this.showRetryDialogState;
    }

    @NotNull
    public final StateFlow<UserForm> getUserFormState() {
        return this.userFormState;
    }

    @NotNull
    public final String getUserId() {
        String strUserId = AccountServiceExtKt.userId(this.accountService);
        return strUserId == null ? "" : strUserId;
    }

    /* JADX INFO: renamed from: isChineseUser, reason: from getter */
    public final boolean getIsChineseUser() {
        return this.isChineseUser;
    }

    /* JADX INFO: renamed from: isForceDark, reason: from getter */
    public final boolean getIsForceDarkInternal() {
        return this.isForceDarkInternal;
    }

    public final boolean isNeedPhone() {
        return this.isChineseUser && Intrinsics.areEqual(z, this.fromSource);
    }

    public final void reloadHistoryFormIfNeedAndClearSavedUserForm(boolean needReload) {
        this._showRetryDialogState.setValue(Boolean.FALSE);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new d(needReload, this, null), 3, null);
    }

    public final void resetCheckFeedbackUiState() {
        MutableStateFlow<CheckFeedbackEnvUiState> mutableStateFlow = this._checkFeedbackEnvUiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), CheckFeedbackEnvUiState.NoneCheck.INSTANCE)) {
        }
    }

    public final void resetConnectState() {
        MutableStateFlow<ConnectDeviceStates> mutableStateFlow = this._connectStateFlow;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), ConnectDeviceStates.ConnectIdle)) {
        }
    }

    public final void setForceDark() {
        this.isForceDarkInternal = true;
    }

    public final void setFromSource(@NotNull String from) {
        this.fromSource = from;
    }

    public final void submitFeedback() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new e(null), 3, null);
    }

    @Nullable
    public final Object submitUserForm(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new f(null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void updateContact(@NotNull Contact contact) {
        this.contactCache.cache(contact);
        UserForm value = this.userFormState.getValue();
        if (value == null) {
            return;
        }
        updateUserForm(value.copy((127 & 1) != 0 ? value.deviceType : null, (127 & 2) != 0 ? value.issueTitle : null, (127 & 4) != 0 ? value.issueID : 0, (127 & 8) != 0 ? value.issueItem : null, (127 & 16) != 0 ? value.description : null, (127 & 32) != 0 ? value.contact : contact, (127 & 64) != 0 ? value.images : null, (127 & 128) != 0 ? value.timeStamp : 0L));
    }

    public final void updateContactType(@NotNull ContactType contactType) {
        updateContact(this.contactCache.getContactByType(contactType));
    }

    public final void updateDescription(@NotNull String description) {
        UserForm value = this.userFormState.getValue();
        if (value == null) {
            return;
        }
        updateUserForm(value.copy((127 & 1) != 0 ? value.deviceType : null, (127 & 2) != 0 ? value.issueTitle : null, (127 & 4) != 0 ? value.issueID : 0, (127 & 8) != 0 ? value.issueItem : null, (127 & 16) != 0 ? value.description : description, (127 & 32) != 0 ? value.contact : null, (127 & 64) != 0 ? value.images : null, (127 & 128) != 0 ? value.timeStamp : 0L));
    }

    public final void updateUserForm(@Nullable UserForm userForm) {
        MutableStateFlow<UserForm> mutableStateFlow = this._userFormState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), userForm)) {
        }
    }
}
