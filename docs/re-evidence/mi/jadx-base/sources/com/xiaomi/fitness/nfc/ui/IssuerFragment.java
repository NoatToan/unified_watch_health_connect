package com.xiaomi.fitness.nfc.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.gson.Gson;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.sesdk.URIUtils;
import com.service.mi.BankCard;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.bean.result.IssueCarFailNoRetryResultState;
import com.xiaomi.fitness.nfc.bean.result.IssueCarFailRetryResultState;
import com.xiaomi.fitness.nfc.bean.result.IssueCarSuccessResultState;
import com.xiaomi.fitness.nfc.bean.result.IssueCardSuccessResultState;
import com.xiaomi.fitness.nfc.bean.result.ResultInfo;
import com.xiaomi.fitness.nfc.bean.result.ShiftInFailResultState;
import com.xiaomi.fitness.nfc.bean.result.ShiftInSuccessResultState;
import com.xiaomi.fitness.nfc.di.NfcEventModule;
import com.xiaomi.fitness.nfc.issuer.IssuerResult;
import com.xiaomi.fitness.nfc.ui.IssuerFragment;
import com.xiaomi.fitness.nfc.ui.issued.ActiveCardResultFragment;
import com.xiaomi.fitness.nfc.ui.issued.CardRenameFragment;
import com.xiaomi.fitness.nfc.ui.issued.SelectActiveWayFragment;
import com.xiaomi.fitness.nfc.ui.issued.YoYoPreIssueFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.dld;
import defpackage.jng;
import defpackage.jxf;
import defpackage.ltg;
import defpackage.lxf;
import defpackage.o0j;
import defpackage.o63;
import defpackage.pli;
import defpackage.rji;
import defpackage.sui;
import defpackage.uxi;
import defpackage.vqg;
import defpackage.wni;
import defpackage.yl3;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 U2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001UB\u0007¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0006J)\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00100J\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u0010\u0006J\u000f\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020.H\u0016¢\u0006\u0004\b6\u00100J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\u0006J\u0017\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u0016\u0010?\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010=R\u0018\u0010C\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010=R\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010@R\u0016\u0010K\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010@R\u0016\u0010L\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010@R\u0018\u0010M\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010=R$\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssuerFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/IssuerListViewModel;", "Ljng;", "", "openCard", "()V", "gotoRenamePage", "Lcom/xiaomi/fitness/nfc/issuer/IssuerResult;", "issuerResult", "Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "buildMasterFailResultInfo", "(Lcom/xiaomi/fitness/nfc/issuer/IssuerResult;)Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "", "detail", "(Ljava/lang/String;)Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "buildMifareFailResultInfo", "onIssueXiaomiSuccess", "buildShiftInFailResultInfo", "buildCarSuccessResultInfo", "()Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "", "code", "buildCarFailResultInfo", "(ILjava/lang/String;)Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "buildSuccessResultInfo", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/os/Message;", "msg", "xhandleMessage", "(Landroid/os/Message;)V", "gotoOrderDetailPage", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "isNeedCardInfo", "()Z", "isNeedMessageEvent", "setCancelResult", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "onBackPressed", LifecycleConstantKt.ON_DESTROY, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "invokeJson", "Ljava/lang/String;", "sourceChannel", "isMaster", "Z", "isNeedConfirm", "shareUrl", "token", "Lcom/service/mi/BankCard;", "bankCard", "Lcom/service/mi/BankCard;", "Ldld;", "mIssuer", "Ldld;", "mIssuing", "hasMiLockDevice", "isFromOurApp", "mProtoType", "Landroid/util/Pair;", "resultPair", "Landroid/util/Pair;", "Ldld$b;", "mSEInteractionListener", "Ldld$b;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nIssuerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssuerFragment.kt\ncom/xiaomi/fitness/nfc/ui/IssuerFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n54#2,3:716\n24#2:719\n57#2,6:720\n63#2,2:727\n54#2,3:729\n24#2:732\n57#2,6:733\n63#2,2:740\n54#2,3:742\n24#2:745\n57#2,6:746\n63#2,2:753\n54#2,3:755\n24#2:758\n57#2,6:759\n63#2,2:766\n57#3:726\n57#3:739\n57#3:752\n57#3:765\n1863#4,2:768\n*S KotlinDebug\n*F\n+ 1 IssuerFragment.kt\ncom/xiaomi/fitness/nfc/ui/IssuerFragment\n*L\n209#1:716,3\n209#1:719\n209#1:720,6\n209#1:727,2\n211#1:729,3\n211#1:732\n211#1:733,6\n211#1:740,2\n213#1:742,3\n213#1:745\n213#1:746,6\n213#1:753,2\n218#1:755,3\n218#1:758\n218#1:759,6\n218#1:766,2\n209#1:726\n211#1:739\n213#1:752\n218#1:765\n420#1:768,2\n*E\n"})
public final class IssuerFragment extends BaseCardFragment<IssuerListViewModel, jng> {

    @NotNull
    public static final String EXTRA_ISSUE_CARD_STATUS = "EXTRA_ISSUE_CARD_STATUS";
    public static final float HUAMI_PROGRESS_SCALE = 0.5f;
    public static final int MSG_FAIL_FOR_BANK = 20;
    public static final int MSG_FAIL_FOR_CAR = 40;
    public static final int MSG_FAIL_FOR_MASTER = 30;
    public static final int MSG_FAIL_FOR_MIFARE = 5;
    public static final int MSG_FAIL_FOR_OUT_APP = 80;
    public static final int MSG_FAIL_FOR_RESULT_CAR = 70;
    public static final int MSG_FAIL_FOR_SHIFT_IN = 7;
    public static final int MSG_FINISHED_MASTER = 200;
    public static final int MSG_INTERACTION_FINISHED = 3;
    public static final int MSG_INTERACTION_START = 1;
    public static final int MSG_SUCCESS_FOR_OUT_CAR_RESULT = 50;
    public static final int MSG_SUCCESS_FOR_RESULT = 4;
    public static final int MSG_SUCCESS_FOR_RESULT_CAR = 60;
    public static final int MSG_SUCCESS_FOR_RESULT_MASTER = 10;
    public static final int REQUEST_CODE_CARD_PRE_ISSUE_TRANSIT = 1;
    public static final int sRequestCodeIssueResilt = 10;
    public static final int sRequestOrderDetail = 100;

    @Nullable
    private BankCard bankCard;
    private boolean hasMiLockDevice;

    @Nullable
    private String invokeJson;
    private boolean isFromOurApp;
    private boolean isMaster;
    private boolean isNeedConfirm;

    @Nullable
    private dld mIssuer;
    private boolean mIssuing;

    @Nullable
    private String mProtoType;

    @NotNull
    private final dld.b mSEInteractionListener;

    @Nullable
    private Pair<Integer, String> resultPair;

    @Nullable
    private String shareUrl;

    @Nullable
    private String sourceChannel;

    @Nullable
    private String token;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String sInvokeJson = "sInvokeJson";

    @NotNull
    private static String sBankPhone = "sBankNumber";

    @NotNull
    private static String sIsNeedConfirm = "sIsNeedConfirm";

    @NotNull
    private static String sCardFace = YoYoPreIssueFragment.sCardFace;

    @NotNull
    private static String sToken = "sToken";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u000e\u0010\u0017\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssuerFragment$Companion;", "", "<init>", "()V", IssuerFragment.EXTRA_ISSUE_CARD_STATUS, "", "sInvokeJson", "getSInvokeJson", "()Ljava/lang/String;", "setSInvokeJson", "(Ljava/lang/String;)V", "sBankPhone", "getSBankPhone", "setSBankPhone", "sIsNeedConfirm", "getSIsNeedConfirm", "setSIsNeedConfirm", YoYoPreIssueFragment.sCardFace, "getSCardFace", "setSCardFace", "sToken", "getSToken", "setSToken", "HUAMI_PROGRESS_SCALE", "", "MSG_INTERACTION_START", "", "MSG_INTERACTION_FINISHED", "MSG_SUCCESS_FOR_RESULT", "MSG_FINISHED_MASTER", "MSG_FAIL_FOR_SHIFT_IN", "MSG_FAIL_FOR_BANK", "MSG_FAIL_FOR_MIFARE", "MSG_SUCCESS_FOR_RESULT_MASTER", "MSG_FAIL_FOR_MASTER", "MSG_FAIL_FOR_CAR", "MSG_SUCCESS_FOR_OUT_CAR_RESULT", "MSG_SUCCESS_FOR_RESULT_CAR", "MSG_FAIL_FOR_RESULT_CAR", "MSG_FAIL_FOR_OUT_APP", "REQUEST_CODE_CARD_PRE_ISSUE_TRANSIT", "sRequestCodeIssueResilt", "sRequestOrderDetail", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSBankPhone() {
            return IssuerFragment.sBankPhone;
        }

        @NotNull
        public final String getSCardFace() {
            return IssuerFragment.sCardFace;
        }

        @NotNull
        public final String getSInvokeJson() {
            return IssuerFragment.sInvokeJson;
        }

        @NotNull
        public final String getSIsNeedConfirm() {
            return IssuerFragment.sIsNeedConfirm;
        }

        @NotNull
        public final String getSToken() {
            return IssuerFragment.sToken;
        }

        public final void setSBankPhone(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            IssuerFragment.sBankPhone = str;
        }

        public final void setSCardFace(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            IssuerFragment.sCardFace = str;
        }

        public final void setSInvokeJson(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            IssuerFragment.sInvokeJson = str;
        }

        public final void setSIsNeedConfirm(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            IssuerFragment.sIsNeedConfirm = str;
        }

        public final void setSToken(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            IssuerFragment.sToken = str;
        }
    }

    public IssuerFragment() {
        super(sui.w, 0, false);
        this.isFromOurApp = true;
        this.mSEInteractionListener = new dld.b() { // from class: com.xiaomi.fitness.nfc.ui.IssuerFragment$mSEInteractionListener$1
            @Override // dld.b
            public void onFinished(BaseResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.this$0.showBack();
                this.this$0.setCardWrapper(zl3.g().i());
                dld dldVar = this.this$0.mIssuer;
                Intrinsics.checkNotNull(dldVar);
                dldVar.r(this.this$0.getCardWrapper());
                Handler mHandler = this.this$0.getMHandler();
                Intrinsics.checkNotNull(mHandler);
                mHandler.obtainMessage(3, result.mResultCode, 0, result.mMsg).sendToTarget();
                this.this$0.mIssuing = false;
            }

            @Override // dld.b
            public void onStart() {
                this.this$0.mIssuing = true;
                Handler mHandler = this.this$0.getMHandler();
                Intrinsics.checkNotNull(mHandler);
                mHandler.obtainMessage(1).sendToTarget();
            }

            @Override // dld.b
            public void onFinished(IssuerResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.this$0.showBack();
                this.this$0.setCardWrapper(zl3.g().i());
                Handler mHandler = this.this$0.getMHandler();
                Intrinsics.checkNotNull(mHandler);
                mHandler.obtainMessage(200, result).sendToTarget();
                this.this$0.mIssuing = false;
            }
        };
    }

    private final ResultInfo buildCarFailResultInfo(int code, String detail) {
        ResultInfo.Builder opBtnTextStrRes = (code == 2 || code == 22022) ? new ResultInfo.Builder(IssueCarFailRetryResultState.class.getName()).setOpBtnTextStrRes(o0j.z2) : new ResultInfo.Builder(IssueCarFailNoRetryResultState.class.getName()).setOpBtnTextStrRes(o0j.common_cancel);
        ResultInfo.Builder contentColorRes = opBtnTextStrRes.setTitle(getString(o0j.D0)).setResultIconRes(wni.f38163k).setContentStrRes(o0j.m1).setContentColorRes(rji.n);
        if (TextUtils.isEmpty(detail)) {
            detail = getString(o0j.t5);
        }
        contentColorRes.setContentDetail(detail).setBtnResLayoutId(sui.H0);
        return opBtnTextStrRes.build();
    }

    private final ResultInfo buildCarSuccessResultInfo() {
        return new ResultInfo.Builder(IssueCarSuccessResultState.class.getName()).setTitle(getString(o0j.D0)).setResultIconRes(wni.l).setContentStrRes(o0j.u5).setContentColorRes(rji.f32615k).setContentDetail("").setOpBtnTextStrRes(o0j.k2).setBtnResLayoutId(sui.H0).build();
    }

    private final ResultInfo buildMasterFailResultInfo(IssuerResult issuerResult) {
        return new ResultInfo.Builder(jxf.class.getName()).setTitle(NfcUtils.INSTANCE.payName()).setResultIconRes(wni.f38163k).setContentStrRes(o0j.m1).setContentColorRes(rji.n).setContentDetail(issuerResult.getCardType() == 2 ? NfcUtils.getVisaErrorMsg("provisionToken", issuerResult.getBaseResponse().getResultCode(), issuerResult.getBaseResponse().getSpErrors()) : NfcUtils.getMasterErrorMsg(issuerResult.getBaseResponse().getResultCode(), issuerResult.getBaseResponse().getSpErrors())).setOpBtnTextStrRes(o0j.common_retry).setBtnResLayoutId(sui.I0).build();
    }

    private final ResultInfo buildMifareFailResultInfo(String detail) {
        String name;
        ResultInfo.Builder builder = new ResultInfo.Builder(jxf.class.getName());
        if (this.invokeJson != null) {
            name = getString(o0j.d3);
        } else {
            CardWrapper cardWrapper = getCardWrapper();
            name = cardWrapper != null ? cardWrapper.getName() : null;
        }
        ResultInfo.Builder contentColorRes = builder.setTitle(name).setResultIconRes(wni.f38163k).setContentStrRes(o0j.m1).setContentColorRes(rji.n);
        if (TextUtils.isEmpty(detail)) {
            detail = getString(o0j.t5);
        }
        return contentColorRes.setContentDetail(detail).setOpBtnTextStrRes(o0j.z2).setBtnResLayoutId(sui.H0).build();
    }

    private final ResultInfo buildShiftInFailResultInfo(String detail) {
        ResultInfo.Builder contentColorRes = new ResultInfo.Builder(ShiftInFailResultState.class.getName()).setTitle(getString(o0j.T1)).setResultIconRes(wni.f38163k).setContentStrRes(o0j.y5).setContentColorRes(rji.n);
        if (TextUtils.isEmpty(detail)) {
            detail = getString(o0j.t5);
        }
        return contentColorRes.setContentDetail(detail).setOpBtnTextStrRes(o0j.z2).setBtnResLayoutId(sui.H0).build();
    }

    private final ResultInfo buildSuccessResultInfo() {
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        if (!cardWrapper.isCloudTransit()) {
            CardWrapper cardWrapper2 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            if (cardWrapper2.getTransferInOrder() == null) {
                ResultInfo.Builder builder = new ResultInfo.Builder(IssueCardSuccessResultState.class.getName());
                CardWrapper cardWrapper3 = getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper3);
                return builder.setTitle(cardWrapper3.getName()).setResultIconRes(wni.l).setContentStrRes(o0j.u5).setContentColorRes(rji.f32615k).setContentDetail(getString(o0j.v5)).setOpTextStrRes(o0j.x5).setOpBtnTextStrRes(o0j.k2).setBtnResLayoutId(sui.H0).build();
            }
        }
        return new ResultInfo.Builder(ShiftInSuccessResultState.class.getName()).setTitle(getString(o0j.B5)).setResultIconRes(wni.l).setContentStrRes(o0j.z5).setContentColorRes(rji.f32615k).setContentDetail(getString(o0j.A5)).setOpBtnTextStrRes(o0j.k2).setBtnResLayoutId(sui.K0).build();
    }

    private final void gotoRenamePage() {
        ltg.c().j(getCardWrapper());
        Bundle bundle = new Bundle();
        CardRenameFragment.Companion companion = CardRenameFragment.INSTANCE;
        bundle.putBoolean(companion.getSHasMiLockDevice(), this.hasMiLockDevice);
        bundle.putBoolean(companion.getSIsFromOurApp(), this.isFromOurApp);
        bundle.putString(IssuerActivity.KEY_SOURCE_CHANNEL, this.sourceChannel);
        gotoPage(CardRenameFragment.class, bundle);
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        finish();
    }

    private final void onIssueXiaomiSuccess() {
        zl3.g().f.add(getCardWrapper());
        zl3.g().p();
        ltg.c().j(getCardWrapper());
        zl3.g().l(getCardWrapper());
        o63.b(new yl3(getCardWrapper(), true));
        ToastUtil.showLongToast(o0j.k3);
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.startActivity(new Intent(mActivity, (Class<?>) CardManagerActivity.class));
            FragmentActivity mActivity2 = getMActivity();
            if (mActivity2 != null) {
                mActivity2.setResult(-1);
            }
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void openCard() {
        CardWrapper cardWrapper;
        if (this.shareUrl != null) {
            dld dldVar = this.mIssuer;
            Intrinsics.checkNotNull(dldVar);
            dldVar.i();
        } else if (this.invokeJson != null || this.bankCard != null || ((cardWrapper = getCardWrapper()) != null && cardWrapper.isCloudDoor())) {
            dld dldVar2 = this.mIssuer;
            Intrinsics.checkNotNull(dldVar2);
            dldVar2.i();
        } else {
            IssuerListViewModel issuerListViewModel = (IssuerListViewModel) getMViewModel();
            CardWrapper cardWrapper2 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            dld dldVar3 = this.mIssuer;
            Intrinsics.checkNotNull(dldVar3);
            issuerListViewModel.updateCard(cardWrapper2, dldVar3, new Function1() { // from class: nld
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IssuerFragment.openCard$lambda$2(this.f28038a, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openCard$lambda$2(IssuerFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        dld dldVar = this$0.mIssuer;
        Intrinsics.checkNotNull(dldVar);
        if (dldVar.j) {
            dld dldVar2 = this$0.mIssuer;
            Intrinsics.checkNotNull(dldVar2);
            dldVar2.i();
        } else {
            ToastUtil.showShortToast(o0j.M5);
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit xhandleMessage$lambda$11$lambda$10(final IssuerFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vqg.d("recharge exception and updateContent");
        IssuerListViewModel issuerListViewModel = (IssuerListViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        issuerListViewModel.updateCard(cardWrapper, new Function0() { // from class: vld
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IssuerFragment.xhandleMessage$lambda$11$lambda$10$lambda$9(this.f37004a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xhandleMessage$lambda$11$lambda$10$lambda$9(IssuerFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ltg.c().s(1, 1);
        ltg.c().j(this$0.getCardWrapper());
        this$0.gotoOrderDetailPage();
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xhandleMessage$lambda$11$lambda$3(IssuerFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onIssueXiaomiSuccess();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xhandleMessage$lambda$11$lambda$4(IssuerFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onIssueXiaomiSuccess();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xhandleMessage$lambda$11$lambda$5(IssuerFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoRenamePage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xhandleMessage$lambda$11$lambda$6(IssuerFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.gotoRenamePage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit xhandleMessage$lambda$11$lambda$7(IssuerFragment this$0, Ref.ObjectRef bundle, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        vqg.d("cloudTransit issue updateContent");
        ltg.c().s(1, 1);
        ltg.c().j(cardWrapper);
        this$0.gotoPageForResult(IssueResultFragment.class, (Bundle) bundle.element, 10);
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit xhandleMessage$lambda$11$lambda$8(IssuerFragment this$0, Ref.ObjectRef bundle, BaseResponse response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(response, "response");
        ltg.c().s(1, 1);
        ltg.c().j(this$0.getCardWrapper());
        if (response.isSuccess()) {
            vqg.d("gotoPageForResult IssueResultFragment recharge");
            this$0.gotoPageForResult(IssueResultFragment.class, (Bundle) bundle.element, 10);
        } else {
            this$0.gotoOrderDetailPage();
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    @Nullable
    public final Handler getHandler() {
        return getMHandler();
    }

    public final void gotoOrderDetailPage() {
        Bundle bundle = new Bundle();
        zl3.g().l(getCardWrapper());
        CardWrapper cardWrapper = getCardWrapper();
        OrderData.Order rechargeOrder = cardWrapper != null ? cardWrapper.getRechargeOrder() : null;
        Intrinsics.checkNotNull(rechargeOrder);
        bundle.putString(CardOrderDetailFragment.sOrderId, rechargeOrder.getOrderId());
        bundle.putInt(CardOrderDetailFragment.sAmount, rechargeOrder.getPayFee());
        bundle.putBoolean(CardOrderDetailFragment.sIsFromIssue, false);
        gotoPageForResult(CardOrderDetailFragment.class, bundle, 100);
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return !this.isMaster && this.shareUrl == null && this.invokeJson == null;
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedMessageEvent() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0153  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r3.isMifare() != false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r3, int r4, @org.jetbrains.annotations.Nullable android.content.Intent r5) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.nfc.ui.IssuerFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (this.mIssuing) {
            return false;
        }
        setCancelResult();
        finish();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        try {
            ViewGroup.LayoutParams layoutParams = ((jng) getMBinding()).A.getLayoutParams();
            if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
                layoutParams.width = -1;
            } else {
                layoutParams.width = BaseFragmentExtKt.getDimensionPixelOffset(this, pli.d);
            }
            ((jng) getMBinding()).A.setLayoutParams(layoutParams);
        } catch (Exception e) {
            vqg.c("IssuerFragment onConfigurationChanged", e);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        dld dldVar = this.mIssuer;
        if (dldVar != null) {
            dldVar.p();
        }
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0346  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x0170  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        CardWrapper cardWrapper;
        int i;
        CardWrapper cardWrapper2;
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        hideBack();
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null && (window = mActivity.getWindow()) != null) {
            window.addFlags(128);
        }
        int i2 = 1;
        if (Build.VERSION.SDK_INT >= 29) {
            ((jng) getMBinding()).D.setForceDarkAllowed(true);
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        ((jng) getMBinding()).D.show(wearableDeviceModel);
        if (wearableDeviceModel != null && DeviceModelExtKt.isBandType(wearableDeviceModel)) {
            ((jng) getMBinding()).G.setScaleX(0.5f);
            ((jng) getMBinding()).G.setScaleY(0.5f);
        }
        boolean z = zl3.g().e.isEmpty() && zl3.g().f.isEmpty();
        if (this.invokeJson == null && this.bankCard == null && ((cardWrapper2 = getCardWrapper()) == null || !cardWrapper2.isMifare())) {
            CardWrapper cardWrapper3 = getCardWrapper();
            if (cardWrapper3 != null && cardWrapper3.isBank()) {
                i2 = 2;
            } else if (z) {
                i2 = 5;
            } else {
                i2 = 3;
            }
        } else if (z) {
            i2 = 3;
        }
        ((jng) getMBinding()).I.setText(getResources().getQuantityString(uxi.c, i2, Integer.valueOf(i2)));
        String string2 = getString(o0j.g3);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str = string2 + string2;
        String str2 = string2 + str;
        ((jng) getMBinding()).F.setText(string2);
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            IssuerListViewModel issuerListViewModel = (IssuerListViewModel) getMViewModel();
            TextView issuerLoadingView = ((jng) getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(issuerLoadingView, "issuerLoadingView");
            issuerListViewModel.issuerLoading(mActivity2, string2, str, str2, issuerLoadingView);
        }
        if (this.shareUrl != null) {
            setTitle(o0j.D0);
        } else if (this.invokeJson != null) {
            if (this.invokeJson == null) {
                cardWrapper = getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper);
                if (TextUtils.isEmpty(cardWrapper.mCardName)) {
                    string = getString(o0j.j3);
                } else {
                    CardWrapper cardWrapper4 = getCardWrapper();
                    Intrinsics.checkNotNull(cardWrapper4);
                    string = cardWrapper4.mCardName;
                }
            } else {
                string = getString(o0j.j3);
            }
            setTitle(string);
        } else {
            if (getCardWrapper() != null) {
                CardWrapper cardWrapper5 = getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper5);
                if (cardWrapper5.isMifare()) {
                    if (this.invokeJson == null) {
                        cardWrapper = getCardWrapper();
                        Intrinsics.checkNotNull(cardWrapper);
                        if (TextUtils.isEmpty(cardWrapper.mCardName)) {
                            string = getString(o0j.j3);
                        } else {
                            CardWrapper cardWrapper6 = getCardWrapper();
                            Intrinsics.checkNotNull(cardWrapper6);
                            string = cardWrapper6.mCardName;
                        }
                    } else {
                        string = getString(o0j.j3);
                    }
                    setTitle(string);
                }
            }
            if (this.bankCard != null) {
                setTitle(NfcUtils.INSTANCE.payName());
            } else {
                if (getCardWrapper() != null) {
                    CardWrapper cardWrapper7 = getCardWrapper();
                    Intrinsics.checkNotNull(cardWrapper7);
                    if (cardWrapper7.isBank()) {
                        setTitle(NfcUtils.INSTANCE.payName());
                    }
                }
                CardWrapper cardWrapper8 = getCardWrapper();
                setTitle(cardWrapper8 != null ? cardWrapper8.mCardName : null);
            }
        }
        ViewGroup.LayoutParams layoutParams = ((jng) getMBinding()).A.getLayoutParams();
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = BaseFragmentExtKt.getDimensionPixelOffset(this, pli.d);
        }
        ((jng) getMBinding()).A.setLayoutParams(layoutParams);
        String str3 = this.shareUrl;
        if (str3 != null) {
            String cardFace = URIUtils.getCardFace(str3);
            vqg.d("IssuerFragment cardFace:" + cardFace);
            ImageView cardFaceView = ((jng) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(cardFaceView, "cardFaceView");
            Coil.imageLoader(cardFaceView.getContext()).enqueue(new ImageRequest.Builder(cardFaceView.getContext()).data(cardFace).target(cardFaceView).build());
        } else if (this.invokeJson != null) {
            ImageView cardFaceView2 = ((jng) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(cardFaceView2, "cardFaceView");
            Coil.imageLoader(cardFaceView2.getContext()).enqueue(new ImageRequest.Builder(cardFaceView2.getContext()).data(lxf.a(false)).target(cardFaceView2).build());
        } else if (this.bankCard != null) {
            ImageView cardFaceView3 = ((jng) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(cardFaceView3, "cardFaceView");
            Coil.imageLoader(cardFaceView3.getContext()).enqueue(new ImageRequest.Builder(cardFaceView3.getContext()).data(Integer.valueOf(wni.o)).target(cardFaceView3).build());
        } else {
            CardWrapper cardWrapper9 = getCardWrapper();
            String cardFace2 = cardWrapper9 != null ? cardWrapper9.getCardFace() : null;
            vqg.d("IssuerFragment cardFace:" + cardFace2);
            if (!TextUtils.isEmpty(cardFace2)) {
                ImageView cardFaceView4 = ((jng) getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(cardFaceView4, "cardFaceView");
                Coil.imageLoader(cardFaceView4.getContext()).enqueue(new ImageRequest.Builder(cardFaceView4.getContext()).data(cardFace2).target(cardFaceView4).build());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (this.isMaster) {
            this.mIssuer = dld.a.a(this, this.bankCard, getArguments());
        } else {
            String str4 = this.shareUrl;
            if (str4 != null) {
                this.mIssuer = dld.a.c(this, str4, this.isNeedConfirm, this.mProtoType);
            } else {
                this.mIssuer = dld.a.b(this, getCardWrapper(), getArguments(), this.invokeJson, this.token);
            }
        }
        dld dldVar = this.mIssuer;
        if (dldVar != null) {
            dldVar.q(this.mSEInteractionListener);
        }
        if (this.shareUrl == null && this.invokeJson == null && this.bankCard == null) {
            TextView textView = ((jng) getMBinding()).H;
            CardWrapper cardWrapper10 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper10);
            if (cardWrapper10.isCloudTransit()) {
                i = o0j.b2;
            } else {
                CardWrapper cardWrapper11 = getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper11);
                if (cardWrapper11.hasTransferInOrder()) {
                    i = o0j.b2;
                } else {
                    i = o0j.u1;
                }
            }
            textView.setText(i);
        } else {
            ((jng) getMBinding()).H.setText(o0j.u1);
        }
        dld dldVar2 = this.mIssuer;
        Intrinsics.checkNotNull(dldVar2);
        if (dldVar2.a(false)) {
            openCard();
            return;
        }
        dld dldVar3 = this.mIssuer;
        if (dldVar3 != null) {
            dldVar3.o();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.invokeJson = args.getString(sInvokeJson);
            this.sourceChannel = args.getString(IssuerActivity.KEY_SOURCE_CHANNEL);
            this.shareUrl = args.getString(IssuerActivity.KEY_SHARE_URL);
            this.isMaster = args.getBoolean("sIsMaster");
            this.bankCard = (BankCard) args.getParcelable(AddCardNumberFragment.sBankCard);
            CardRenameFragment.Companion companion = CardRenameFragment.INSTANCE;
            this.hasMiLockDevice = args.getBoolean(companion.getSHasMiLockDevice());
            this.isFromOurApp = args.getBoolean(companion.getSIsFromOurApp(), true);
            this.isNeedConfirm = args.getBoolean(sIsNeedConfirm, true);
            this.token = args.getString(sToken);
            String string = args.getString(IssuerActivity.KEY_PROTO_TYPE);
            if (string == null) {
                string = ProductList.ProductInfo.CCC_TYPE;
            }
            this.mProtoType = string;
        }
    }

    public final void setCancelResult() {
        zl3.g().l(getCardWrapper());
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, android.os.Bundle] */
    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public void xhandleMessage(@Nullable Message msg) {
        String string;
        ResultInfo resultInfoBuildMasterFailResultInfo;
        super.xhandleMessage(msg);
        if (msg != null) {
            int i = msg.what;
            if (i == 3) {
                Object obj = msg.obj;
                String str = obj instanceof String ? (String) obj : null;
                int i2 = msg.arg1;
                if (i2 == 0) {
                    CardWrapper cardWrapper = getCardWrapper();
                    if (cardWrapper != null) {
                        cardWrapper.mHasIssue = true;
                    }
                    FragmentActivity mActivity = getMActivity();
                    if (mActivity != null) {
                        mActivity.setResult(-1);
                    }
                }
                dld dldVar = this.mIssuer;
                if (dldVar != null) {
                    dldVar.n(i2 == 0, i2, str, null);
                    return;
                }
                return;
            }
            if (i == 4) {
                CardWrapper cardWrapper2 = getCardWrapper();
                if (cardWrapper2 != null) {
                    if (!cardWrapper2.isMifare() && !cardWrapper2.isCloudDoor()) {
                        if (cardWrapper2.isTransit() || cardWrapper2.isCloudTransit()) {
                            MedalManagerExtKt.getInstance(MedalManager.INSTANCE).doMedalAssistWithSp(8);
                            zl3.g().e.add(getCardWrapper());
                            zl3.g().r();
                            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            objectRef.element = new Bundle();
                            ((Bundle) objectRef.element).putParcelable(IssueResultFragment.RESULT_INFO, buildSuccessResultInfo());
                            CardWrapper cardWrapper3 = getCardWrapper();
                            Intrinsics.checkNotNull(cardWrapper3);
                            if (!cardWrapper3.isCloudTransit()) {
                                CardWrapper cardWrapper4 = getCardWrapper();
                                Intrinsics.checkNotNull(cardWrapper4);
                                if (cardWrapper4.getTransferInOrder() == null) {
                                    IssuerListViewModel issuerListViewModel = (IssuerListViewModel) getMViewModel();
                                    CardWrapper cardWrapper5 = getCardWrapper();
                                    Intrinsics.checkNotNull(cardWrapper5);
                                    issuerListViewModel.recharge(cardWrapper5, new Function1() { // from class: tld
                                        @Override // kotlin.jvm.functions.Function1
                                        /* JADX INFO: renamed from: invoke */
                                        public final Object invoke2(Object obj2) {
                                            return IssuerFragment.xhandleMessage$lambda$11$lambda$8(this.f34827a, objectRef, (BaseResponse) obj2);
                                        }
                                    }, new Function0() { // from class: uld
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return IssuerFragment.xhandleMessage$lambda$11$lambda$10(this.f35907a);
                                        }
                                    });
                                    return;
                                }
                            }
                            vqg.d("gotoPageForResult IssueResultFragment recharge cardWrapper!!.isCloudTransit");
                            IssuerListViewModel issuerListViewModel2 = (IssuerListViewModel) getMViewModel();
                            CardWrapper cardWrapper6 = getCardWrapper();
                            Intrinsics.checkNotNull(cardWrapper6);
                            issuerListViewModel2.updateCardClondTransit(cardWrapper6, new Function1() { // from class: sld
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: invoke */
                                public final Object invoke2(Object obj2) {
                                    return IssuerFragment.xhandleMessage$lambda$11$lambda$7(this.f33759a, objectRef, (CardWrapper) obj2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    MedalManagerExtKt.getInstance(MedalManager.INSTANCE).doMedalAssistWithSp(9);
                    if (lxf.f(getCardWrapper()) || lxf.d(getCardWrapper())) {
                        String string2 = getString(lxf.d(getCardWrapper()) ? o0j.q3 : o0j.s3);
                        Intrinsics.checkNotNull(string2);
                        IssuerListViewModel issuerListViewModel3 = (IssuerListViewModel) getMViewModel();
                        CardWrapper cardWrapper7 = getCardWrapper();
                        Intrinsics.checkNotNull(cardWrapper7);
                        issuerListViewModel3.changeName(cardWrapper7, string2, new Function0() { // from class: old
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IssuerFragment.xhandleMessage$lambda$11$lambda$3(this.f29271a);
                            }
                        }, new Function1() { // from class: pld
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj2) {
                                return IssuerFragment.xhandleMessage$lambda$11$lambda$4(this.f30519a, (String) obj2);
                            }
                        });
                        return;
                    }
                    zl3.g().l(getCardWrapper());
                    zl3.g().f.add(getCardWrapper());
                    zl3.g().p();
                    CardWrapper cardWrapper8 = getCardWrapper();
                    if (TextUtils.isEmpty(cardWrapper8 != null ? cardWrapper8.mCardName : null)) {
                        string = getString(o0j.n3);
                    } else {
                        CardWrapper cardWrapper9 = getCardWrapper();
                        Intrinsics.checkNotNull(cardWrapper9);
                        string = cardWrapper9.mCardName;
                    }
                    CardWrapper cardWrapper10 = getCardWrapper();
                    if (cardWrapper10 != null) {
                        cardWrapper10.mCardName = string;
                    }
                    IssuerListViewModel issuerListViewModel4 = (IssuerListViewModel) getMViewModel();
                    CardWrapper cardWrapper11 = getCardWrapper();
                    Intrinsics.checkNotNull(cardWrapper11);
                    Intrinsics.checkNotNull(string);
                    issuerListViewModel4.changeName(cardWrapper11, string, new Function0() { // from class: qld
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IssuerFragment.xhandleMessage$lambda$11$lambda$5(this.f31629a);
                        }
                    }, new Function1() { // from class: rld
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj2) {
                            return IssuerFragment.xhandleMessage$lambda$11$lambda$6(this.f32674a, (String) obj2);
                        }
                    });
                    return;
                }
                return;
            }
            String str2 = "";
            if (i != 5) {
                if (i == 7) {
                    zl3.g().l(getCardWrapper());
                    Pair<Integer, String> pair = (Pair) msg.obj;
                    this.resultPair = pair;
                    Intrinsics.checkNotNull(pair);
                    if (!TextUtils.isEmpty((CharSequence) pair.second)) {
                        Pair<Integer, String> pair2 = this.resultPair;
                        Intrinsics.checkNotNull(pair2);
                        Object obj2 = pair2.second;
                        Intrinsics.checkNotNull(obj2);
                        str2 = (String) obj2;
                    }
                    ResultInfo resultInfoBuildShiftInFailResultInfo = buildShiftInFailResultInfo(str2);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(IssueResultFragment.RESULT_INFO, resultInfoBuildShiftInFailResultInfo);
                    gotoPageForResult(IssueResultFragment.class, bundle, 10);
                    return;
                }
                if (i == 10) {
                    zl3.g().j.add(getCardWrapper());
                    zl3.g().q();
                    o63.b(new yl3(getCardWrapper(), true));
                    CardWrapper cardWrapper12 = getCardWrapper();
                    Intrinsics.checkNotNull(cardWrapper12);
                    if (cardWrapper12.isNeedAuthor) {
                        Bundle bundle2 = new Bundle();
                        Object obj3 = msg.obj;
                        if (obj3 != null && (obj3 instanceof IssuerResult)) {
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.xiaomi.fitness.nfc.issuer.IssuerResult");
                            IssuerResult issuerResult = (IssuerResult) obj3;
                            ArrayList<String> arrayList = new ArrayList<>();
                            List<AuthenticationMethod> authenticationMethodList = issuerResult.getAuthenticationMethodList();
                            if (authenticationMethodList != null && !authenticationMethodList.isEmpty()) {
                                Iterator<T> it = issuerResult.getAuthenticationMethodList().iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new Gson().toJson((AuthenticationMethod) it.next()));
                                }
                            }
                            bundle2.putStringArrayList(SelectActiveWayFragment.ACTIVE_METHOD_LIST, arrayList);
                        }
                        ActiveCardResultFragment.Companion companion = ActiveCardResultFragment.INSTANCE;
                        String sCardFace2 = companion.getSCardFace();
                        CardWrapper cardWrapper13 = getCardWrapper();
                        bundle2.putString(sCardFace2, cardWrapper13 != null ? cardWrapper13.getCardFace() : null);
                        String sStatus = companion.getSStatus();
                        CardWrapper cardWrapper14 = getCardWrapper();
                        bundle2.putString(sStatus, cardWrapper14 != null ? cardWrapper14.getStatus() : null);
                        String sTailNo = companion.getSTailNo();
                        CardWrapper cardWrapper15 = getCardWrapper();
                        bundle2.putString(sTailNo, cardWrapper15 != null ? cardWrapper15.getBankEndNo() : null);
                        String sBankName = companion.getSBankName();
                        CardWrapper cardWrapper16 = getCardWrapper();
                        bundle2.putString(sBankName, cardWrapper16 != null ? cardWrapper16.getBankName() : null);
                        String mCardType = companion.getMCardType();
                        CardWrapper cardWrapper17 = getCardWrapper();
                        BankCard bankCard = cardWrapper17 != null ? cardWrapper17.bankCard : null;
                        Intrinsics.checkNotNull(bankCard);
                        bundle2.putInt(mCardType, bankCard.getCardType());
                        gotoPage(SelectActiveWayFragment.class, bundle2);
                    } else {
                        ltg.c().j(getCardWrapper());
                    }
                    FragmentActivity mActivity2 = getMActivity();
                    if (mActivity2 != null) {
                        mActivity2.setResult(-1);
                    }
                    finish();
                    return;
                }
                if (i == 30) {
                    Object obj4 = msg.obj;
                    if (obj4 == null || !(obj4 instanceof IssuerResult)) {
                        resultInfoBuildMasterFailResultInfo = buildMasterFailResultInfo("");
                    } else {
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.xiaomi.fitness.nfc.issuer.IssuerResult");
                        resultInfoBuildMasterFailResultInfo = buildMasterFailResultInfo((IssuerResult) obj4);
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable(IssueResultFragment.RESULT_INFO, resultInfoBuildMasterFailResultInfo);
                    bundle3.putBoolean("sIsMaster", this.isMaster);
                    gotoPageForResult(IssueResultFragment.class, bundle3, 10);
                    return;
                }
                if (i != 40) {
                    if (i == 50) {
                        ltg.c().j(getCardWrapper());
                        NfcEventModule.INSTANCE.syncCardNumber();
                        o63.b(new yl3(getCardWrapper(), true));
                        FragmentActivity mActivity3 = getMActivity();
                        if (mActivity3 == null || !(mActivity3 instanceof IssuerActivity)) {
                            return;
                        }
                        ((IssuerActivity) mActivity3).setResult(0, "open card success");
                        finish();
                        return;
                    }
                    if (i == 60) {
                        o63.b(new yl3(true));
                        Bundle bundle4 = new Bundle();
                        bundle4.putParcelable(IssueResultFragment.RESULT_INFO, buildCarSuccessResultInfo());
                        gotoPage(IssueResultFragment.class, bundle4);
                        finish();
                        return;
                    }
                    if (i == 70) {
                        Object obj5 = msg.obj;
                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.util.Pair<java.lang.Integer, kotlin.String>");
                        Pair pair3 = (Pair) obj5;
                        Bundle bundle5 = new Bundle();
                        int iIntValue = ((Integer) pair3.first).intValue();
                        Object second = pair3.second;
                        Intrinsics.checkNotNullExpressionValue(second, "second");
                        bundle5.putParcelable(IssueResultFragment.RESULT_INFO, buildCarFailResultInfo(iIntValue, (String) second));
                        gotoPageForResult(IssueResultFragment.class, bundle5, 10);
                        return;
                    }
                    if (i != 80) {
                        if (i != 200) {
                            return;
                        }
                        Object obj6 = msg.obj;
                        Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type com.xiaomi.fitness.nfc.issuer.IssuerResult");
                        IssuerResult issuerResult2 = (IssuerResult) obj6;
                        dld dldVar2 = this.mIssuer;
                        Intrinsics.checkNotNull(dldVar2);
                        dldVar2.n(issuerResult2.getBaseResponse().isStatusOK(), -1, issuerResult2.getCardType() == 2 ? NfcUtils.getVisaErrorMsg("provisionToken", issuerResult2.getBaseResponse().getResultCode(), issuerResult2.getBaseResponse().getSpErrors()) : NfcUtils.getMasterErrorMsg(issuerResult2.getBaseResponse().getResultCode(), issuerResult2.getBaseResponse().getSpErrors()), issuerResult2);
                        return;
                    }
                    Object obj7 = msg.obj;
                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.util.Pair<java.lang.Integer, kotlin.String>");
                    Pair pair4 = (Pair) obj7;
                    FragmentActivity mActivity4 = getMActivity();
                    if (mActivity4 == null || !(mActivity4 instanceof IssuerActivity)) {
                        return;
                    }
                    ((IssuerActivity) mActivity4).setResult(10, "issue end err code:" + pair4.first + " msg:" + pair4.second);
                    finish();
                    return;
                }
            }
            ltg.c().s(0, 2);
            zl3.g().l(getCardWrapper());
            Object obj8 = msg.obj;
            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.util.Pair<kotlin.Int, kotlin.String>");
            Pair<Integer, String> pair5 = (Pair) obj8;
            this.resultPair = pair5;
            Intrinsics.checkNotNull(pair5);
            if (!TextUtils.isEmpty((CharSequence) pair5.second)) {
                Pair<Integer, String> pair6 = this.resultPair;
                Intrinsics.checkNotNull(pair6);
                Object obj9 = pair6.second;
                Intrinsics.checkNotNull(obj9);
                str2 = (String) obj9;
            }
            ResultInfo resultInfoBuildMifareFailResultInfo = buildMifareFailResultInfo(str2);
            Bundle bundle6 = new Bundle();
            bundle6.putParcelable(IssueResultFragment.RESULT_INFO, resultInfoBuildMifareFailResultInfo);
            gotoPageForResult(IssueResultFragment.class, bundle6, 10);
        }
    }

    private final ResultInfo buildMasterFailResultInfo(String detail) {
        ResultInfo.Builder contentColorRes = new ResultInfo.Builder(jxf.class.getName()).setTitle(NfcUtils.INSTANCE.payName()).setResultIconRes(wni.f38163k).setContentStrRes(o0j.m1).setContentColorRes(rji.n);
        if (TextUtils.isEmpty(detail)) {
            detail = getString(o0j.t5);
        }
        return contentColorRes.setContentDetail(detail).setOpBtnTextStrRes(o0j.common_retry).setBtnResLayoutId(sui.I0).build();
    }
}
