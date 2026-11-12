package com.huami.wallet.accessdoor.fragment;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.components.devicestatus.DeviceStatusDelegate;
import com.huami.components.devicestatus.DeviceStatusListener;
import com.huami.nfc.base.ExtensionsKt;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.WorkerInfo;
import com.huami.nfc.web.NfcDeviceKt;
import com.huami.nfc.web.UserInfo;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.AccessCardDetailActivity;
import com.huami.wallet.accessdoor.activity.StartAccessLoadingActivity;
import com.huami.wallet.accessdoor.databinding.FragmentWorkDoorBinding;
import com.huami.wallet.accessdoor.di.koin.DoorKoinModuleKt;
import com.huami.wallet.accessdoor.di.koin.INfcDoorToolkits;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.fragment.WorkDoorFragment;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.viewmodel.DoorEntranceViewModel;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001K\u0018\u0000 V2\u00020\u0001:\u0003VW1B\u0007¢\u0006\u0004\bT\u0010UJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J \u0010\u0014\u001a\u00020\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002Jy\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\b\u0010!\u001a\u00020\u0004H\u0002J\b\u0010\"\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010&\u001a\u00020\u0016H\u0002J\u0012\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010'H\u0002J\u0012\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016R\u001d\u00105\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0013\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010>\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010=R\u001d\u0010C\u001a\u00020?8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001d\u0010J\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020K8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010LR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010R¨\u0006X"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/WorkDoorFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "o", "", "g", "l", "", "msg", SOAP.XMLNS, "hideLoading", "initLifecycle", "", "Lcom/huami/nfc/door/DoorCardInfo;", "list", "Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel;", "mDoorEntranceViewModel", "z", "f", "", "title", "Lkotlin/Function0;", "positiveAction", "positiveText", "negativeAction", "negativeText", "neutralAction", "neutralText", "u", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)V", "r", "t", "Lcom/huami/nfc/door/WorkerInfo;", "workerInfo", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "rawStr", "Lcom/huami/wallet/accessdoor/fragment/WorkDoorFragment$ErrorBodyData;", DTransferConstants.SEARCH_KEY, "errorBodyData", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "onViewCreated", "onDestroyView", "Lcom/huami/wallet/accessdoor/databinding/FragmentWorkDoorBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "h", "()Lcom/huami/wallet/accessdoor/databinding/FragmentWorkDoorBinding;", "binding", "b", "Lkotlin/Lazy;", "i", "()Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel;", "Lcom/huami/nfc/web/UserInfo;", "c", z.j, "()Lcom/huami/nfc/web/UserInfo;", "miUserInfo", "Lcom/huami/wallet/accessdoor/di/koin/INfcDoorToolkits;", GoogleApiAvailabilityLight.a, hl.k, "()Lcom/huami/wallet/accessdoor/di/koin/INfcDoorToolkits;", "nfcDoorToolkits", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "e", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "getAppName", "()Ljava/lang/String;", "appName", "com/huami/wallet/accessdoor/fragment/WorkDoorFragment$deviceStatusListener$1", "Lcom/huami/wallet/accessdoor/fragment/WorkDoorFragment$deviceStatusListener$1;", "deviceStatusListener", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "mutexCheckRunnable", "Lcom/huami/wallet/accessdoor/fragment/WorkDoorFragment$a;", "Lcom/huami/wallet/accessdoor/fragment/WorkDoorFragment$a;", "mutexHandler", "<init>", "()V", "Companion", "ErrorBodyData", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class WorkDoorFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] j;

    @NotNull
    private static final String k = "WorkDoorFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDoorEntranceViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy miUserInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcDoorToolkits;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy appName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final WorkDoorFragment$deviceStatusListener$1 deviceStatusListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Runnable mutexCheckRunnable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private a mutexHandler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J7\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/WorkDoorFragment$ErrorBodyData;", "", "", "component1", "component2", "component3", "component4", "code", "mutimelong", Configs.Params.MUTIME_LONG, Configs.Params.MUTIME, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "b", "getMutimelong", "c", "getMutime_long", GoogleApiAvailabilityLight.a, "getMutime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ErrorBodyData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String code;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private final String mutimelong;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        private final String mutime_long;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        private final String mutime;

        public ErrorBodyData(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.code = str;
            this.mutimelong = str2;
            this.mutime_long = str3;
            this.mutime = str4;
        }

        public static /* synthetic */ ErrorBodyData copy$default(ErrorBodyData errorBodyData, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorBodyData.code;
            }
            if ((i & 2) != 0) {
                str2 = errorBodyData.mutimelong;
            }
            if ((i & 4) != 0) {
                str3 = errorBodyData.mutime_long;
            }
            if ((i & 8) != 0) {
                str4 = errorBodyData.mutime;
            }
            return errorBodyData.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMutimelong() {
            return this.mutimelong;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMutime_long() {
            return this.mutime_long;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMutime() {
            return this.mutime;
        }

        @NotNull
        public final ErrorBodyData copy(@NotNull String code, @Nullable String mutimelong, @Nullable String mutime_long, @Nullable String mutime) {
            return new ErrorBodyData(code, mutimelong, mutime_long, mutime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorBodyData)) {
                return false;
            }
            ErrorBodyData errorBodyData = (ErrorBodyData) other;
            return Intrinsics.areEqual(this.code, errorBodyData.code) && Intrinsics.areEqual(this.mutimelong, errorBodyData.mutimelong) && Intrinsics.areEqual(this.mutime_long, errorBodyData.mutime_long) && Intrinsics.areEqual(this.mutime, errorBodyData.mutime);
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final String getMutime() {
            return this.mutime;
        }

        @Nullable
        public final String getMutime_long() {
            return this.mutime_long;
        }

        @Nullable
        public final String getMutimelong() {
            return this.mutimelong;
        }

        public int hashCode() {
            int iHashCode = this.code.hashCode() * 31;
            String str = this.mutimelong;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.mutime_long;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.mutime;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ErrorBodyData(code=" + this.code + ", mutimelong=" + this.mutimelong + ", mutime_long=" + this.mutime_long + ", mutime=" + this.mutime + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/huami/wallet/accessdoor/fragment/WorkDoorFragment$a", "Landroid/os/Handler;", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends Handler {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return WorkDoorFragment.this.requireContext().getString(R.string.app_name);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WorkDoorFragment.this.requireActivity().finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WorkDoorFragment.this.requireActivity().finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WorkDoorFragment.this.requireActivity().finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WorkDoorFragment.this.requireActivity().finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WorkDoorFragment.this.requireActivity().finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/door/WorkerInfo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<WorkerInfo, Unit> {
        public h() {
            super(1);
        }

        public final void a(@Nullable WorkerInfo workerInfo) {
            if (workerInfo == null) {
                return;
            }
            WorkDoorFragment.this.A(workerInfo);
            WorkDoorFragment.this.o();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WorkerInfo workerInfo) {
            a(workerInfo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/di/koin/INfcDoorToolkits;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<INfcDoorToolkits> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final INfcDoorToolkits getA() {
            return DoorKoinModuleKt.getNfcDoorToolkits();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WorkDoorFragment.this.requireActivity().finish();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[5];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WorkDoorFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentWorkDoorBinding;"));
        j = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.huami.wallet.accessdoor.fragment.WorkDoorFragment$deviceStatusListener$1] */
    public WorkDoorFragment() {
        super(R.layout.fragment_work_door);
        this.binding = FragmentViewBindingKt.viewBinding(new WorkDoorFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentWorkDoorBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.WorkDoorFragment$special$$inlined$viewModel$default$1
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
        this.mDoorEntranceViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DoorEntranceViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.WorkDoorFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.DoorEntranceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DoorEntranceViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(DoorEntranceViewModel.class), function0, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.miUserInfo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<UserInfo>() { // from class: com.huami.wallet.accessdoor.fragment.WorkDoorFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.web.UserInfo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final UserInfo getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(UserInfo.class), objArr2, objArr3);
            }
        });
        this.nfcDoorToolkits = LazyKt__LazyJVMKt.lazy(i.a);
        this.appName = LazyKt__LazyJVMKt.lazy(new b());
        this.deviceStatusListener = new DeviceStatusListener() { // from class: com.huami.wallet.accessdoor.fragment.WorkDoorFragment$deviceStatusListener$1
            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onConnected(int p0) {
                this.a.o();
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onConnecting(int p0) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onConnectingTimeout(int p0) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onDisconnected(int p0) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStartSyncAGPS(int p0) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStartSyncData(int p0) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStopSyncAGPS(int p0, boolean p1) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStopSyncData(int p0, boolean p1) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onSynchronizingAGPS(int p0, int p1) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onSynchronizingData(int p0, int p1) {
            }
        };
        this.mutexCheckRunnable = new Runnable() { // from class: kw8
            @Override // java.lang.Runnable
            public final void run() {
                WorkDoorFragment.p(this.a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(WorkerInfo workerInfo) {
        h().message.setText(getString(R.string.access_door_work_card_hello, workerInfo.getName()));
    }

    private final void f() {
        h().imageError.setVisibility(0);
        h().btnOpen.setVisibility(0);
        TextView textView = h().message;
        int i2 = R.string.access_door_work_card_unopen;
        Object[] objArr = new Object[2];
        WorkerInfo value = i().getWorkerInfo().getValue();
        objArr[0] = value == null ? null : value.getName();
        objArr[1] = k().getBindDeviceDisplayName();
        textView.setText(getString(i2, objArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
    
        if ((r0 == null || r0.length() == 0) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean g() {
        if (!k().isLogin()) {
            v(this, getString(R.string.access_user_login_title, getAppName()), getString(R.string.access_user_login_msg, getAppName()), null, null, null, null, new c(), Integer.valueOf(R.string.access_card_verify), 60, null);
            return false;
        }
        if (!DeviceStatusDelegate.getInstance().getDataSource().isConnectedExpectedDevice()) {
            if (k().isMutexLogin()) {
                r();
            }
            return false;
        }
        if (!ExtensionsKt.isNetworkConnected(requireContext())) {
            v(this, getString(R.string.access_please_know), getString(R.string.no_network_connection), null, null, null, null, new d(), Integer.valueOf(R.string.access_card_verify), 60, null);
            return false;
        }
        if (!k().isMainlandUser()) {
            v(this, getString(R.string.access_please_know), getString(R.string.access_nfc_oversea), null, null, null, null, new e(), Integer.valueOf(R.string.access_card_verify), 60, null);
            return false;
        }
        if (!k().isSupportNfc()) {
            v(this, getString(R.string.access_please_know), getString(R.string.access_not_support_nfc), null, null, null, null, new f(), Integer.valueOf(R.string.access_card_verify), 60, null);
            return false;
        }
        if (NfcDeviceKt.isXiaomiDevice(NfcDeviceKt.getNfcDevice().getDeviceModel())) {
            String miId = j().getMiId();
            if (!(miId == null || miId.length() == 0)) {
                String miToken = j().getMiToken();
            }
            v(this, getString(R.string.access_please_know), getString(R.string.access_not_bind_mi_id), null, null, null, null, new g(), Integer.valueOf(R.string.access_card_verify), 60, null);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAppName() {
        return (String) this.appName.getValue();
    }

    private final FragmentWorkDoorBinding h() {
        return (FragmentWorkDoorBinding) this.binding.getValue(this, j[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoading() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        if (!loadingDialog.isShowing()) {
            loadingDialog = null;
        }
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DoorEntranceViewModel i() {
        return (DoorEntranceViewModel) this.mDoorEntranceViewModel.getValue();
    }

    private final void initLifecycle() {
        LiveDataExtensionKt.observeWithNotNull(i().getGetCardListLiveData(), getViewLifecycleOwner(), new Function1<Resource<List<? extends DoorCardInfo>>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.WorkDoorFragment.initLifecycle.1

            /* JADX INFO: renamed from: com.huami.wallet.accessdoor.fragment.WorkDoorFragment$initLifecycle$1$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.LOADING.ordinal()] = 1;
                    iArr[Status.SUCCESS.ordinal()] = 2;
                    iArr[Status.ERROR.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: renamed from: com.huami.wallet.accessdoor.fragment.WorkDoorFragment$initLifecycle$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WorkDoorFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(WorkDoorFragment workDoorFragment) {
                    super(0);
                    this.a = workDoorFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.requireActivity().finish();
                }
            }

            {
                super(1);
            }

            public final void a(Resource<List<DoorCardInfo>> resource) throws Exception {
                int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
                if (i2 == 1) {
                    WorkDoorFragment.this.s(R.string.access_lookup_data);
                    return;
                }
                if (i2 == 2) {
                    WorkDoorFragment.this.hideLoading();
                    WorkDoorFragment workDoorFragment = WorkDoorFragment.this;
                    workDoorFragment.z(resource.data, workDoorFragment.i());
                    return;
                }
                if (i2 != 3) {
                    return;
                }
                WorkDoorFragment.this.hideLoading();
                WorkDoorFragment workDoorFragment2 = WorkDoorFragment.this;
                String str = resource.rawMessage;
                if (str == null) {
                    str = "";
                }
                if (!WorkDoorFragment.this.n(workDoorFragment2.q(str))) {
                    IconToast.showError(WorkDoorFragment.this.requireContext(), WorkDoorFragment.this.requireContext().getString(R.string.wl_load_fail));
                    return;
                }
                WorkDoorFragment workDoorFragment3 = WorkDoorFragment.this;
                String string = workDoorFragment3.getString(R.string.access_token_invalid, workDoorFragment3.getAppName());
                WorkDoorFragment workDoorFragment4 = WorkDoorFragment.this;
                String string2 = workDoorFragment4.getString(R.string.access_token_try, workDoorFragment4.getAppName(), WorkDoorFragment.this.getAppName());
                WorkDoorFragment workDoorFragment5 = WorkDoorFragment.this;
                WorkDoorFragment.v(workDoorFragment5, string, string2, null, null, null, null, new a(workDoorFragment5), Integer.valueOf(R.string.access_card_verify), 60, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends DoorCardInfo>> resource) throws Exception {
                a(resource);
                return Unit.INSTANCE;
            }
        });
        LiveDataExtensionKt.observeWithNotNull(i().isDefaultCardLiveData(), getViewLifecycleOwner(), new Function1<Resource<Boolean>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.WorkDoorFragment.initLifecycle.2

            /* JADX INFO: renamed from: com.huami.wallet.accessdoor.fragment.WorkDoorFragment$initLifecycle$2$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.LOADING.ordinal()] = 1;
                    iArr[Status.SUCCESS.ordinal()] = 2;
                    iArr[Status.ERROR.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(Resource<Boolean> resource) {
                Boolean bool;
                Object next;
                int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
                boolean z = true;
                if (i2 == 1) {
                    WorkDoorFragment.this.s(R.string.access_lookup_data);
                    return;
                }
                if (i2 == 2 || i2 == 3) {
                    WorkDoorFragment.this.hideLoading();
                    Resource<List<DoorCardInfo>> value = WorkDoorFragment.this.i().getGetCardListLiveData().getValue();
                    if (value == null) {
                        return;
                    }
                    List<DoorCardInfo> list = value.data;
                    if (list != null && !list.isEmpty()) {
                        z = false;
                    }
                    if (z || (bool = resource.data) == null) {
                        return;
                    }
                    boolean zBooleanValue = resource.status == Status.SUCCESS ? bool.booleanValue() : false;
                    WorkDoorFragment workDoorFragment = WorkDoorFragment.this;
                    Iterator<T> it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!workDoorFragment.i().isWorkCard((DoorCardInfo) next));
                    DoorCardInfo doorCardInfo = (DoorCardInfo) next;
                    if (doorCardInfo == null) {
                        return;
                    }
                    AccessCardDetailActivity.INSTANCE.open(WorkDoorFragment.this.requireActivity(), new DoorInfoAndDefaultCard(doorCardInfo, zBooleanValue), false);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
        LiveDataExtensionKt.observeWithNotNull(i().getWorkerInfo(), getViewLifecycleOwner(), new h());
    }

    private final void initView(View view) {
        h().btnOpen.setOnClickListener(new View.OnClickListener() { // from class: jw8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WorkDoorFragment.m(this.a, view2);
            }
        });
    }

    private final UserInfo j() {
        return (UserInfo) this.miUserInfo.getValue();
    }

    private final INfcDoorToolkits k() {
        return (INfcDoorToolkits) this.nfcDoorToolkits.getValue();
    }

    private final void l() {
        if (this.mLoadingDialog == null) {
            LoadingDialog loadingDialog = new LoadingDialog(requireContext());
            this.mLoadingDialog = loadingDialog;
            loadingDialog.setCancelable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(WorkDoorFragment workDoorFragment, View view) {
        StartAccessLoadingActivity.INSTANCE.open(workDoorFragment.requireActivity(), workDoorFragment.i().getWorkerInfo().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(ErrorBodyData errorBodyData) {
        if (!Intrinsics.areEqual(errorBodyData == null ? null : errorBodyData.getCode(), ErrorCode.Server.S0105)) {
            if (!Intrinsics.areEqual(errorBodyData != null ? errorBodyData.getCode() : null, "0108")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (g()) {
            i().getCardList(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WorkDoorFragment workDoorFragment) {
        if (workDoorFragment.k().isMutexTopStack() && workDoorFragment.k().isMutexLogin()) {
            return;
        }
        workDoorFragment.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorBodyData q(String rawStr) {
        try {
            if (rawStr.length() == 0) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject = new JSONObject(rawStr).optJSONObject("data");
            return new ErrorBodyData(jSONObjectOptJSONObject.optString("code"), jSONObjectOptJSONObject.optString("mutimelong"), jSONObjectOptJSONObject.optString(Configs.Params.MUTIME_LONG), jSONObjectOptJSONObject.optString(Configs.Params.MUTIME));
        } catch (Exception e2) {
            HMLog.i(k, e2.getMessage(), new Object[0]);
            return null;
        }
    }

    private final void r() {
        if (this.mutexHandler == null) {
            this.mutexHandler = new a();
        }
        a aVar = this.mutexHandler;
        if (aVar == null) {
            return;
        }
        aVar.sendMessageDelayed(Message.obtain(aVar, this.mutexCheckRunnable), 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(@StringRes int msg) {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        if (!(!loadingDialog.isShowing())) {
            loadingDialog = null;
        }
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setMessage(getString(msg));
        loadingDialog.show();
    }

    private final void t() {
        v(this, getString(R.string.access_token_invalid, getAppName()), getString(R.string.access_token_try, getAppName(), getAppName()), null, null, null, null, new j(), Integer.valueOf(R.string.access_card_verify), 60, null);
    }

    private final void u(String title, String msg, final Function0<Unit> positiveAction, @StringRes Integer positiveText, final Function0<Unit> negativeAction, @StringRes Integer negativeText, final Function0<Unit> neutralAction, @StringRes Integer neutralText) {
        AlertDialogFragment.Builder message = new AlertDialogFragment.Builder(requireContext()).setCancelable(false).setTitle(title).setMessage(msg);
        if (positiveAction != null && positiveText != null) {
            message.setPositiveButton(positiveText.intValue(), new DialogInterface.OnClickListener() { // from class: iw8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    WorkDoorFragment.w(positiveAction, dialogInterface, i2);
                }
            });
        }
        if (negativeAction != null && negativeText != null) {
            message.setNegativeButton(negativeText.intValue(), new DialogInterface.OnClickListener() { // from class: gw8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    WorkDoorFragment.x(negativeAction, dialogInterface, i2);
                }
            });
        }
        if (neutralAction != null && neutralText != null) {
            message.setNeutralButton(neutralText.intValue(), new DialogInterface.OnClickListener() { // from class: hw8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    WorkDoorFragment.y(neutralAction, dialogInterface, i2);
                }
            });
        }
        message.show(getChildFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v(WorkDoorFragment workDoorFragment, String str, String str2, Function0 function0, Integer num, Function0 function1, Integer num2, Function0 function2, Integer num3, int i2, Object obj) {
        workDoorFragment.u(str, str2, (i2 & 4) != 0 ? null : function0, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : function1, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : function2, (i2 & 128) != 0 ? null : num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Function0 function0, DialogInterface dialogInterface, int i2) {
        function0.getA();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Function0 function0, DialogInterface dialogInterface, int i2) {
        function0.getA();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Function0 function0, DialogInterface dialogInterface, int i2) {
        function0.getA();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(List<DoorCardInfo> list, DoorEntranceViewModel mDoorEntranceViewModel) throws Exception {
        DoorCardInfo doorCardInfo = null;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (mDoorEntranceViewModel.isWorkCard((DoorCardInfo) obj2)) {
                    obj = obj2;
                    break;
                }
            }
            doorCardInfo = (DoorCardInfo) obj;
        }
        if ((list == null || list.isEmpty()) || doorCardInfo == null) {
            f();
        } else {
            mDoorEntranceViewModel.isDefaultCard(doorCardInfo.getAid());
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        DeviceStatusDelegate.getInstance().registerDeviceStatusListener(this.deviceStatusListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        a aVar = this.mutexHandler;
        if (aVar != null) {
            aVar.removeCallbacks(this.mutexCheckRunnable);
        }
        DeviceStatusDelegate.getInstance().unregisterDeviceStatusListener(this.deviceStatusListener);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        l();
        initLifecycle();
    }
}
