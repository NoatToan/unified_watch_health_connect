package com.huami.eid.ui.fragment;

import android.animation.ValueAnimator;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.NavController;
import androidx.p012savedstate.SavedStateRegistryOwner;
import cn.eid.service.CreateEidResultEvent;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.State;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.dev.Logcat;
import com.huami.eid.ui.R;
import com.huami.eid.ui.camera.SenseCamera;
import com.huami.eid.ui.camera.SenseCameraPreview;
import com.huami.eid.ui.extensions.EidStatusExtensionKt;
import com.huami.eid.ui.fragment.EidOpenFragment;
import com.huami.eid.ui.viewmodel.EidOpenViewModel;
import com.huami.nfc.eid.entities.EidStatus;
import com.huami.wallet.common.helper.ViewExtensionKt;
import com.huami.wallet.common.util.WalletRxBus;
import com.loc.z;
import com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener;
import com.sensetime.senseid.sdk.liveness.silent.SilentLivenessApi;
import com.sensetime.senseid.sdk.liveness.silent.common.type.PixelFormat;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import com.sensetime.senseid.sdk.liveness.silent.common.type.Size;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceOcclusion;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007*\u0001X\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001]B\u0007¢\u0006\u0004\b[\u0010\\J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u001c\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\b\u0010-\u001a\u00020\u0004H\u0016R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010A\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010C\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010<R\u0016\u0010E\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010<R\u0016\u0010G\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010FR\u0016\u0010I\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010KR\u0016\u0010N\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010MR\u0016\u0010O\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010QR\u001d\u0010W\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bH\u0010VR\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010Y¨\u0006^"}, d2 = {"Lcom/huami/eid/ui/fragment/EidOpenFragment;", "Lcom/huami/eid/ui/fragment/EidBaseFragment;", "Landroid/hardware/Camera$PreviewCallback;", "Lcom/huami/eid/ui/camera/SenseCameraPreview$StartListener;", "", "initViewModel", "x", "u", "v", "w", "", "result", "", "info", "y", "B", "unlock", GoogleApiAvailabilityLight.b, "r", SOAP.XMLNS, "o", "m", "H", LogUtil.I, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, com.google.android.exoplayer2.text.ttml.b.r, hl.k, "C", "message", "F", "", "setViewId", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "initView", "", "data", "Landroid/hardware/Camera;", "camera", "onPreviewFrame", "onFail", "onDestroyView", "onBackButtonClick", "Lcom/huami/eid/ui/camera/SenseCameraPreview;", "c", "Lcom/huami/eid/ui/camera/SenseCameraPreview;", "cameraPreviewView", "Lcom/huami/eid/ui/camera/SenseCamera;", GoogleApiAvailabilityLight.a, "Lcom/huami/eid/ui/camera/SenseCamera;", "senseCamera", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "stepImage", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "noteTextView", "g", "stepIndexText", "h", "stepTitleText", "i", "stepInfoText", z.j, "finishText", "Landroid/view/View;", "normalBodyView", "l", "faceBodyView", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;", "progressBar", "Z", "needReleaseCamera", "isInputData", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "progressAnimator", "Lcom/huami/eid/ui/viewmodel/EidOpenViewModel;", DTransferConstants.SEARCH_KEY, "Lkotlin/Lazy;", "()Lcom/huami/eid/ui/viewmodel/EidOpenViewModel;", "viewModel", "com/huami/eid/ui/fragment/EidOpenFragment$livenessListener$1", "Lcom/huami/eid/ui/fragment/EidOpenFragment$livenessListener$1;", "livenessListener", "<init>", "()V", "Companion", "eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidOpenFragment extends EidBaseFragment implements Camera.PreviewCallback, SenseCameraPreview.StartListener {

    @NotNull
    public static final String REQID_CARD_EXPIRE = "0301026";

    @NotNull
    public static final String REQID_NET_DISCONNECT_ERROR = "-20002";

    @NotNull
    public static final String REQID_NET_ERROR = "-20001";
    private static final long s = 100000;
    private static final int t = 320;
    private static final int u = 300;
    private static final int v = 123;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private SenseCameraPreview cameraPreviewView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SenseCamera senseCamera;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ImageView stepImage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private TextView noteTextView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private TextView stepIndexText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private TextView stepTitleText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private TextView stepInfoText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private TextView finishText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private View normalBodyView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private View faceBodyView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private ProgressBar progressBar;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean needReleaseCamera;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isInputData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator progressAnimator;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final EidOpenFragment$livenessListener$1 livenessListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lcom/huami/nfc/eid/entities/EidStatus;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<EidStatus>, Unit> {

        /* JADX INFO: renamed from: com.huami.eid.ui.fragment.EidOpenFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lcom/huami/nfc/eid/entities/EidStatus;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0381a extends Lambda implements Function1<Success<? extends EidStatus>, Unit> {
            public final /* synthetic */ EidOpenFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0381a(EidOpenFragment eidOpenFragment) {
                super(1);
                this.a = eidOpenFragment;
            }

            public final void a(@NotNull Success<EidStatus> success) {
                EidStatus value = success.getValue();
                if (value == null) {
                    return;
                }
                EidOpenFragment eidOpenFragment = this.a;
                if (EidStatusExtensionKt.installedInCurrentDevice(value)) {
                    eidOpenFragment.F(eidOpenFragment.getString(R.string.eid_already_opened_tips));
                } else {
                    eidOpenFragment.r();
                    eidOpenFragment.H();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends EidStatus> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Lcom/huami/nfc/eid/entities/EidStatus;", "fail", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends EidStatus>, Unit> {
            public final /* synthetic */ EidOpenFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EidOpenFragment eidOpenFragment) {
                super(1);
                this.a = eidOpenFragment;
            }

            public final void a(@NotNull Fail<EidStatus> fail) {
                String string;
                String string2 = this.a.getString(R.string.eid_info_error_tips);
                Logcat.i("observeEidStatus fail:" + fail);
                String message = fail.getError().getMessage();
                if (message != null) {
                    EidOpenFragment eidOpenFragment = this.a;
                    if (StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) EidOpenFragment.REQID_NET_ERROR, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) EidOpenFragment.REQID_NET_DISCONNECT_ERROR, false, 2, (Object) null)) {
                        string = eidOpenFragment.getString(R.string.eid_reqid_net_error_tips);
                        Logcat.e("穿戴设备未链接网络");
                    } else if (StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) EidOpenFragment.REQID_CARD_EXPIRE, false, 2, (Object) null)) {
                        string = eidOpenFragment.getString(R.string.eid_reqid_expire);
                        Logcat.e("证件已过期");
                    }
                    string2 = string;
                }
                this.a.F(string2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends EidStatus> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<EidStatus> stateBuilder) {
            stateBuilder.onSuccess(new C0381a(EidOpenFragment.this));
            stateBuilder.onFail(new b(EidOpenFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<EidStatus> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<StateBuilder<Unit>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends Unit>, Unit> {
            public final /* synthetic */ EidOpenFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EidOpenFragment eidOpenFragment) {
                super(1);
                this.a = eidOpenFragment;
            }

            public final void a(@NotNull Success<Unit> success) {
                this.a.s();
                this.a.I();
                this.a.l().openEidCard(this.a.l().getBizSerialNumber(), this.a.l().getRequestId());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Unit> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.eid.ui.fragment.EidOpenFragment$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0382b extends Lambda implements Function1<Fail<? extends Unit>, Unit> {
            public final /* synthetic */ EidOpenFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0382b(EidOpenFragment eidOpenFragment) {
                super(1);
                this.a = eidOpenFragment;
            }

            public final void a(@NotNull Fail<Unit> fail) {
                this.a.I();
                EidOpenFragment eidOpenFragment = this.a;
                eidOpenFragment.F(eidOpenFragment.getString(R.string.eid_info_face_error_tips));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Unit> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Unit> stateBuilder) {
            stateBuilder.onSuccess(new a(EidOpenFragment.this));
            stateBuilder.onFail(new C0382b(EidOpenFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Unit> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<StateBuilder<Boolean>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends Boolean>, Unit> {
            public final /* synthetic */ EidOpenFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EidOpenFragment eidOpenFragment) {
                super(1);
                this.a = eidOpenFragment;
            }

            public final void a(@NotNull Success<Boolean> success) {
                this.a.k();
                if (Intrinsics.areEqual(success.getValue(), Boolean.TRUE)) {
                    this.a.o();
                    EidOpenFragment.z(this.a, true, null, 2, null);
                } else {
                    EidOpenFragment eidOpenFragment = this.a;
                    eidOpenFragment.F(eidOpenFragment.getString(R.string.eid_info_error_tips));
                    EidOpenFragment.z(this.a, false, null, 2, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Boolean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends Boolean>, Unit> {
            public final /* synthetic */ EidOpenFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EidOpenFragment eidOpenFragment) {
                super(1);
                this.a = eidOpenFragment;
            }

            public final void a(@NotNull Fail<Boolean> fail) {
                this.a.k();
                EidOpenFragment eidOpenFragment = this.a;
                eidOpenFragment.F(eidOpenFragment.getString(R.string.eid_info_error_tips));
                this.a.y(false, "eID开通时出错 " + fail.getError());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Boolean> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Boolean> stateBuilder) {
            stateBuilder.onSuccess(new a(EidOpenFragment.this));
            stateBuilder.onFail(new b(EidOpenFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Boolean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<StateBuilder<Boolean>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends Boolean>, Unit> {
            public final /* synthetic */ EidOpenFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EidOpenFragment eidOpenFragment) {
                super(1);
                this.a = eidOpenFragment;
            }

            public final void a(@NotNull Success<Boolean> success) {
                if (Intrinsics.areEqual(success.getValue(), Boolean.TRUE)) {
                    this.a.n(false);
                    this.a.l().verifyWatchPwd();
                } else {
                    this.a.C();
                    Logcat.e("穿戴设备未设置锁屏密码");
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Boolean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends Boolean>, Unit> {
            public final /* synthetic */ EidOpenFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EidOpenFragment eidOpenFragment) {
                super(1);
                this.a = eidOpenFragment;
            }

            public final void a(@NotNull Fail<Boolean> fail) {
                EidOpenFragment eidOpenFragment = this.a;
                eidOpenFragment.F(eidOpenFragment.getString(R.string.eid_info_error_tips));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Boolean> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public d() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Boolean> stateBuilder) {
            stateBuilder.onSuccess(new a(EidOpenFragment.this));
            stateBuilder.onFail(new b(EidOpenFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Boolean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<StateBuilder<Boolean>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends Boolean>, Unit> {
            public final /* synthetic */ EidOpenFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EidOpenFragment eidOpenFragment) {
                super(1);
                this.a = eidOpenFragment;
            }

            public final void a(@NotNull Success<Boolean> success) {
                this.a.n(success.getValue().booleanValue());
                if (Intrinsics.areEqual(success.getValue(), Boolean.TRUE)) {
                    this.a.l().getReqidFromWatchAndCheck();
                    return;
                }
                EidOpenFragment eidOpenFragment = this.a;
                eidOpenFragment.F(eidOpenFragment.getString(R.string.eid_info_error_tips));
                Logcat.e("穿戴设备解锁失败");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Boolean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends Boolean>, Unit> {
            public final /* synthetic */ EidOpenFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EidOpenFragment eidOpenFragment) {
                super(1);
                this.a = eidOpenFragment;
            }

            public final void a(@NotNull Fail<Boolean> fail) {
                EidOpenFragment eidOpenFragment = this.a;
                eidOpenFragment.F(eidOpenFragment.getString(R.string.eid_info_error_tips));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Boolean> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public e() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Boolean> stateBuilder) {
            stateBuilder.onSuccess(new a(EidOpenFragment.this));
            stateBuilder.onFail(new b(EidOpenFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Boolean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.eid.ui.fragment.EidOpenFragment$livenessListener$1] */
    public EidOpenFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.eid.ui.fragment.EidOpenFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<EidOpenViewModel>() { // from class: com.huami.eid.ui.fragment.EidOpenFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.eid.ui.viewmodel.EidOpenViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EidOpenViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(EidOpenViewModel.class), function0, objArr);
            }
        });
        this.livenessListener = new OnLivenessListener() { // from class: com.huami.eid.ui.fragment.EidOpenFragment$livenessListener$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private long lastStatusUpdateTime;

            @Override // com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener
            public void onDetectOver(@Nullable ResultCode resultCode, @Nullable byte[] result, @Nullable List<byte[]> imageData, @Nullable Rect faceRect) {
                this.b.isInputData = false;
                if (imageData == null) {
                    Logcat.e("人脸识别数据为null");
                    return;
                }
                if (!(!imageData.isEmpty())) {
                    Logcat.e("人脸识别数据为null");
                    return;
                }
                State<EidStatus> value = this.b.l().getEidStatusLiveData().getValue();
                Objects.requireNonNull(value, "null cannot be cast to non-null type com.huami.arch.core.Success<com.huami.nfc.eid.entities.EidStatus>");
                EidStatus eidStatus = (EidStatus) ((Success) value).getValue();
                if (eidStatus == null) {
                    return;
                }
                EidOpenFragment eidOpenFragment = this.b;
                eidOpenFragment.l().faceCompare(eidStatus.getOrderNum(), eidOpenFragment.l().getRequestId(), imageData.get(0));
            }

            @Override // com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener
            public void onError(@NotNull ResultCode resultCode) {
                this.b.isInputData = false;
            }

            @Override // com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener
            public void onInitialized() {
                this.b.isInputData = true;
            }

            @Override // com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener
            public void onStatusUpdate(int faceState, @Nullable FaceOcclusion faceOcclusion, int faceDistance) {
                boolean z;
                if (faceOcclusion == null || SystemClock.elapsedRealtime() - this.lastStatusUpdateTime < 300) {
                    return;
                }
                if (faceState == 1) {
                    TextView textView = this.b.noteTextView;
                    Objects.requireNonNull(textView);
                    textView.setText(R.string.common_tracking_missed);
                } else if (faceState == 2) {
                    TextView textView2 = this.b.noteTextView;
                    Objects.requireNonNull(textView2);
                    textView2.setText(R.string.common_tracking_out_of_bound);
                } else if (faceState == 3) {
                    StringBuilder sb = new StringBuilder();
                    if (faceOcclusion.getBrowOcclusionState() == 2) {
                        sb.append(this.b.getString(R.string.common_tracking_covered_brow));
                        z = true;
                    } else {
                        z = false;
                    }
                    if (faceOcclusion.getEyeOcclusionState() == 2) {
                        sb.append(z ? "、" : "");
                        sb.append(this.b.getString(R.string.common_tracking_covered_eye));
                        z = true;
                    }
                    if (faceOcclusion.getNoseOcclusionState() == 2) {
                        sb.append(z ? "、" : "");
                        sb.append(this.b.getString(R.string.common_tracking_covered_nose));
                        z = true;
                    }
                    if (faceOcclusion.getMouthOcclusionState() == 2) {
                        sb.append(z ? "、" : "");
                        sb.append(this.b.getString(R.string.common_tracking_covered_mouth));
                    }
                    TextView textView3 = this.b.noteTextView;
                    Objects.requireNonNull(textView3);
                    textView3.setText(this.b.getString(R.string.common_tracking_covered, sb.toString()));
                } else if (faceDistance == 1) {
                    TextView textView4 = this.b.noteTextView;
                    Objects.requireNonNull(textView4);
                    textView4.setText(R.string.common_face_too_far);
                } else if (faceDistance == -1) {
                    TextView textView5 = this.b.noteTextView;
                    Objects.requireNonNull(textView5);
                    textView5.setText(R.string.common_face_too_close);
                } else {
                    TextView textView6 = this.b.noteTextView;
                    Objects.requireNonNull(textView6);
                    textView6.setText(R.string.common_detecting);
                }
                this.lastStatusUpdateTime = SystemClock.elapsedRealtime();
            }
        };
    }

    private final void A() {
        if (this.needReleaseCamera) {
            this.isInputData = false;
            SenseCameraPreview senseCameraPreview = this.cameraPreviewView;
            Objects.requireNonNull(senseCameraPreview);
            senseCameraPreview.stop();
            SenseCameraPreview senseCameraPreview2 = this.cameraPreviewView;
            Objects.requireNonNull(senseCameraPreview2);
            senseCameraPreview2.release();
            this.needReleaseCamera = false;
        }
    }

    private final void B() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        if (ContextCompat.checkSelfPermission(fragmentActivityRequireActivity, "android.permission.CAMERA") != 0) {
            ActivityCompat.requestPermissions(fragmentActivityRequireActivity, new String[]{"android.permission.CAMERA"}, 123);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(getContext());
        builder.setMessage(R.string.eid_empty_rom_password_tips);
        builder.setPositiveButton(R.string.eid_already_set, new DialogInterface.OnClickListener() { // from class: ok1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EidOpenFragment.D(this.a, dialogInterface, i);
            }
        });
        builder.setNegativeButton(R.string.eid_cancel, new DialogInterface.OnClickListener() { // from class: nk1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EidOpenFragment.E(this.a, dialogInterface, i);
            }
        });
        builder.create();
        builder.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(EidOpenFragment eidOpenFragment, DialogInterface dialogInterface, int i) {
        eidOpenFragment.l().checkPwdState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(EidOpenFragment eidOpenFragment, DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        if (eidOpenFragment.getActivity() == null) {
            return;
        }
        eidOpenFragment.onBackButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(String message) {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(getContext());
        builder.setMessage(message);
        builder.setNeutralButton(R.string.eid_know_it, new DialogInterface.OnClickListener() { // from class: mk1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EidOpenFragment.G(this.a, dialogInterface, i);
            }
        });
        builder.create();
        builder.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(EidOpenFragment eidOpenFragment, DialogInterface dialogInterface, int i) {
        eidOpenFragment.onBackButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        SenseCamera senseCamera;
        View view = this.faceBodyView;
        Objects.requireNonNull(view);
        ViewExtensionKt.visible(view);
        View view2 = this.normalBodyView;
        Objects.requireNonNull(view2);
        ViewExtensionKt.gone(view2);
        this.needReleaseCamera = true;
        try {
            SenseCameraPreview senseCameraPreview = this.cameraPreviewView;
            if (senseCameraPreview == null || (senseCamera = this.senseCamera) == null) {
                throw null;
            }
            senseCameraPreview.start(senseCamera);
            SenseCamera senseCamera2 = this.senseCamera;
            if (senseCamera2 == null) {
                throw null;
            }
            senseCamera2.setOnPreviewFrameCallback(this);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        View view = this.faceBodyView;
        Objects.requireNonNull(view);
        ViewExtensionKt.gone(view);
        View view2 = this.normalBodyView;
        Objects.requireNonNull(view2);
        ViewExtensionKt.visible(view2);
        A();
    }

    private final void initViewModel() {
        x();
        u();
        v();
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.progressAnimator;
        boolean z = false;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            z = true;
        }
        if (!z || (valueAnimator = this.progressAnimator) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EidOpenViewModel l() {
        return (EidOpenViewModel) this.viewModel.getValue();
    }

    private final void m() {
        TextView textView = this.noteTextView;
        Objects.requireNonNull(textView);
        textView.setText(R.string.common_tracking_missed);
        SenseCameraPreview senseCameraPreview = this.cameraPreviewView;
        Objects.requireNonNull(senseCameraPreview);
        senseCameraPreview.setStartListener(this);
        this.senseCamera = new SenseCamera.Builder(getContext()).setFacing(1).setRequestedPreviewSize(320, 320).build();
        l().initFaceRecognition(requireContext(), this.livenessListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(boolean unlock) {
        TextView textView = this.stepIndexText;
        Objects.requireNonNull(textView);
        textView.setText("1");
        TextView textView2 = this.stepTitleText;
        Objects.requireNonNull(textView2);
        textView2.setText(R.string.eid_open_collection_information);
        if (unlock) {
            TextView textView3 = this.stepInfoText;
            Objects.requireNonNull(textView3);
            textView3.setText(R.string.eid_open_near_watch_tips);
            ImageView imageView = this.stepImage;
            Objects.requireNonNull(imageView);
            imageView.setImageResource(R.drawable.eid_open_step_near_watch);
            return;
        }
        TextView textView4 = this.stepInfoText;
        Objects.requireNonNull(textView4);
        textView4.setText(R.string.eid_open_input_password_tips);
        ImageView imageView2 = this.stepImage;
        Objects.requireNonNull(imageView2);
        imageView2.setImageResource(R.drawable.eid_open_step_password);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        k();
        TextView textView = this.finishText;
        Objects.requireNonNull(textView);
        ViewExtensionKt.visible(textView);
        ProgressBar progressBar = this.progressBar;
        Objects.requireNonNull(progressBar);
        ViewExtensionKt.gone(progressBar);
        TextView textView2 = this.stepIndexText;
        Objects.requireNonNull(textView2);
        textView2.setText("4");
        TextView textView3 = this.stepTitleText;
        Objects.requireNonNull(textView3);
        textView3.setText(R.string.eid_open_finish);
        TextView textView4 = this.stepInfoText;
        Objects.requireNonNull(textView4);
        textView4.setText(R.string.eid_open_finish_tips);
        ImageView imageView = this.stepImage;
        Objects.requireNonNull(imageView);
        imageView.setImageResource(R.drawable.eid_open_step_finish);
    }

    private final void p() {
        k();
        ProgressBar progressBar = this.progressBar;
        Objects.requireNonNull(progressBar);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) (progressBar.getMax() * 0.9f));
        this.progressAnimator = valueAnimatorOfInt;
        if (valueAnimatorOfInt == null) {
            return;
        }
        valueAnimatorOfInt.setDuration(100000L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lk1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                EidOpenFragment.q(this.a, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(EidOpenFragment eidOpenFragment, ValueAnimator valueAnimator) {
        ProgressBar progressBar = eidOpenFragment.progressBar;
        Objects.requireNonNull(progressBar);
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressBar.setProgress(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        TextView textView = this.stepIndexText;
        Objects.requireNonNull(textView);
        textView.setText("2");
        TextView textView2 = this.stepTitleText;
        Objects.requireNonNull(textView2);
        textView2.setText(R.string.eid_open_face_recognition);
        TextView textView3 = this.stepInfoText;
        Objects.requireNonNull(textView3);
        textView3.setText(R.string.eid_open_face_tips);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        TextView textView = this.stepIndexText;
        Objects.requireNonNull(textView);
        textView.setText("3");
        ProgressBar progressBar = this.progressBar;
        Objects.requireNonNull(progressBar);
        ViewExtensionKt.visible(progressBar);
        TextView textView2 = this.stepTitleText;
        Objects.requireNonNull(textView2);
        textView2.setText(R.string.eid_open_check_information);
        TextView textView3 = this.stepInfoText;
        Objects.requireNonNull(textView3);
        textView3.setText(R.string.eid_open_check_tips);
        ImageView imageView = this.stepImage;
        Objects.requireNonNull(imageView);
        imageView.setImageResource(R.drawable.eid_open_step_check);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EidOpenFragment eidOpenFragment, View view) {
        NavController navController = eidOpenFragment.getNavController();
        if (navController == null) {
            return;
        }
        navController.navigate(R.id.action_to_detail);
    }

    private final void u() {
        LiveDataExtensionKt.observeState$default(l().getEidStatusLiveData(), this, null, new a(), 2, null);
    }

    private final void v() {
        LiveDataExtensionKt.observeState$default(l().getFaceCompareLiveData(), this, null, new b(), 2, null);
    }

    private final void w() {
        LiveDataExtensionKt.observeState$default(l().getOpenResultLiveData(), this, null, new c(), 2, null);
    }

    private final void x() {
        LiveDataExtensionKt.observeState$default(l().getPwdStateLiveData(), this, null, new d(), 2, null);
        LiveDataExtensionKt.observeState$default(l().getWatchUnlockLiveData(), this, null, new e(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(boolean result, String info) {
        WalletRxBus companion = WalletRxBus.INSTANCE.getInstance();
        CreateEidResultEvent createEidResultEvent = new CreateEidResultEvent();
        createEidResultEvent.setResult(result);
        createEidResultEvent.setInfo(info);
        Unit unit = Unit.INSTANCE;
        companion.post(createEidResultEvent);
    }

    public static /* synthetic */ void z(EidOpenFragment eidOpenFragment, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        eidOpenFragment.y(z, str);
    }

    @Override // com.huami.eid.ui.fragment.EidBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.eid.ui.fragment.EidBaseFragment
    public void initView() {
        super.initView();
        setTitle(getString(R.string.eid_open_card_title));
        View viewRequireView = requireView();
        this.normalBodyView = viewRequireView.findViewById(R.id.normal_body);
        this.faceBodyView = viewRequireView.findViewById(R.id.face_body);
        this.noteTextView = (TextView) viewRequireView.findViewById(R.id.linkface_txt_note);
        this.cameraPreviewView = (SenseCameraPreview) viewRequireView.findViewById(R.id.camera_preview);
        this.stepIndexText = (TextView) viewRequireView.findViewById(R.id.step_index);
        this.stepTitleText = (TextView) viewRequireView.findViewById(R.id.step_title);
        this.stepInfoText = (TextView) viewRequireView.findViewById(R.id.step_info);
        this.stepImage = (ImageView) viewRequireView.findViewById(R.id.step_image);
        this.finishText = (TextView) viewRequireView.findViewById(R.id.finish);
        this.progressBar = (ProgressBar) viewRequireView.findViewById(R.id.progress_bar);
        m();
        TextView textView = this.finishText;
        Objects.requireNonNull(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: pk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EidOpenFragment.t(this.a, view);
            }
        });
        initViewModel();
        l().checkPwdState();
    }

    @Override // com.huami.eid.ui.fragment.EidBaseFragment
    public void onBackButtonClick() {
        if (l().getOpenResultLiveData().getValue() instanceof Success) {
            State<Boolean> value = l().getOpenResultLiveData().getValue();
            Objects.requireNonNull(value, "null cannot be cast to non-null type com.huami.arch.core.Success<kotlin.Boolean>");
            Boolean bool = (Boolean) ((Success) value).getValue();
            if (bool != null && bool.booleanValue()) {
                NavController navController = getNavController();
                if (navController == null) {
                    return;
                }
                navController.navigate(R.id.action_to_detail);
                return;
            }
        }
        super.onBackButtonClick();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SilentLivenessApi.cancel();
        A();
    }

    @Override // com.huami.eid.ui.camera.SenseCameraPreview.StartListener
    public void onFail() {
        F(getString(R.string.eid_info_face_error_tips));
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(@NotNull byte[] data, @NotNull Camera camera) {
        if (this.isInputData) {
            SenseCameraPreview senseCameraPreview = this.cameraPreviewView;
            Objects.requireNonNull(senseCameraPreview);
            int width = senseCameraPreview.getWidth();
            SenseCameraPreview senseCameraPreview2 = this.cameraPreviewView;
            Objects.requireNonNull(senseCameraPreview2);
            int height = senseCameraPreview2.getHeight();
            SenseCameraPreview senseCameraPreview3 = this.cameraPreviewView;
            Objects.requireNonNull(senseCameraPreview3);
            Object parent = senseCameraPreview3.getParent();
            if (parent != null) {
                View view = (View) parent;
                width = view.getWidth();
                height = view.getHeight();
            }
            SenseCameraPreview senseCameraPreview4 = this.cameraPreviewView;
            Objects.requireNonNull(senseCameraPreview4);
            Rect rectConvertViewRectToPicture = senseCameraPreview4.convertViewRectToPicture(new Rect(0, 0, width, height));
            PixelFormat pixelFormat = PixelFormat.NV21;
            SenseCamera senseCamera = this.senseCamera;
            Objects.requireNonNull(senseCamera);
            Size previewSize = senseCamera.getPreviewSize();
            SenseCamera senseCamera2 = this.senseCamera;
            Objects.requireNonNull(senseCamera2);
            SilentLivenessApi.inputData(data, pixelFormat, previewSize, rectConvertViewRectToPicture, true, senseCamera2.getRotationDegrees());
        }
    }

    @Override // com.huami.eid.ui.fragment.EidBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        B();
    }

    @Override // com.huami.eid.ui.fragment.EidBaseFragment
    public int setViewId() {
        return R.layout.fragment_eid_open;
    }
}
