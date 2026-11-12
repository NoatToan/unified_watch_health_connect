package com.huami.wallet.accessdoor.fragment;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.adapter.CardScheduleTimeAdapter;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.huami.wallet.accessdoor.databinding.FragmentAccessCardDetailBinding;
import com.huami.wallet.accessdoor.di.koin.DoorKoinModuleKt;
import com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog;
import com.huami.wallet.accessdoor.dialog.TimeSelectorDialog;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.fragment.AccessCardDetailFragment;
import com.huami.wallet.accessdoor.helper.AccessDoorPageHelper;
import com.huami.wallet.accessdoor.helper.EditTextWatcher;
import com.huami.wallet.accessdoor.helper.IconToastHelper;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.helper.ViewSingleClickExtensionKt;
import com.huami.wallet.accessdoor.utils.ImageUtils;
import com.huami.wallet.accessdoor.utils.WebUrlHelper;
import com.huami.wallet.accessdoor.viewmodel.AccessDetailViewModel;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 L2\u00020\u0001:\u00020LB\u0007¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u001b\u0010\n\u001a\u00020\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J3\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u0002H\u0002J\b\u0010$\u001a\u00020\u0002H\u0002J'\u0010'\u001a\u00020\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u001cH\u0002J\u001a\u0010.\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016R\u001d\u00104\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u0010:\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/AccessCardDetailFragment;", "Landroidx/fragment/app/Fragment;", "", "w", "x", "E", "y", "z", "", "msg", "N", "(Ljava/lang/Integer;)V", "F", "t", SOAP.XMLNS, GoogleApiAvailabilityLight.b, "v", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "protocolEntity", "r", "", "isDefault", "X", "initView", DTransferConstants.SEARCH_KEY, "u", "P", "K", "", "cardName", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "done", "m", "H", "W", "hour", "minute", "U", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", ExifInterface.LATITUDE_SOUTH, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/wallet/accessdoor/databinding/FragmentAccessCardDetailBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "o", "()Lcom/huami/wallet/accessdoor/databinding/FragmentAccessCardDetailBinding;", "binding", "Lcom/huami/wallet/accessdoor/viewmodel/AccessDetailViewModel;", "b", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/wallet/accessdoor/viewmodel/AccessDetailViewModel;", "viewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "c", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/wallet/accessdoor/dialog/AccessDoorUserPrivacyDialog;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/accessdoor/dialog/AccessDoorUserPrivacyDialog;", "mAccessDoorUserPrivacyDialog", "e", LogUtil.I, "cardSize", "Lcom/huami/wallet/accessdoor/dialog/TimeSelectorDialog;", "f", "Lcom/huami/wallet/accessdoor/dialog/TimeSelectorDialog;", "timeSelectorDialog", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class AccessCardDetailFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] g;

    @NotNull
    private static final String h = "AccessCardDetailFragment";
    private static final int i = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private AccessDoorUserPrivacyDialog mAccessDoorUserPrivacyDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int cardSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private TimeSelectorDialog timeSelectorDialog;

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016R$\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0016"}, d2 = {"com/huami/wallet/accessdoor/fragment/AccessCardDetailFragment$a", "Landroid/text/TextWatcher;", "", "p0", "", "p1", "p2", "p3", "", "beforeTextChanged", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "", "<set-?>", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "currentText", "src", "<init>", "(Ljava/lang/String;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private String currentText;

        public a(@NotNull String str) {
            this.currentText = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrentText() {
            return this.currentText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable p0) {
            this.currentText = StringsKt__StringsKt.trim(String.valueOf(p0)).toString();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            if (AccessCardDetailFragment.this.p().getProtocolEntity() == null) {
                AccessCardDetailFragment.this.K();
            } else {
                AccessCardDetailFragment accessCardDetailFragment = AccessCardDetailFragment.this;
                accessCardDetailFragment.r(accessCardDetailFragment.p().getProtocolEntity());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            if (AccessCardDetailFragment.this.p().getProtocolEntity() != null) {
                AccessCardDetailFragment accessCardDetailFragment = AccessCardDetailFragment.this;
                accessCardDetailFragment.r(accessCardDetailFragment.p().getProtocolEntity());
                return;
            }
            AccessCardDetailFragment.this.p().recordDoorDetailOperation(1);
            Boolean boolIsMiDevice = AccessCardDetailFragment.this.p().isMiDevice();
            if (boolIsMiDevice == null) {
                return;
            }
            FunctionsConfig.getOpenWebUrl().invoke(WebUrlHelper.INSTANCE.getFAQWebUrl(view.getContext(), boolIsMiDevice.booleanValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<View, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            if (AccessCardDetailFragment.this.p().getProtocolEntity() == null) {
                AccessCardDetailFragment.this.H();
            } else {
                AccessCardDetailFragment accessCardDetailFragment = AccessCardDetailFragment.this;
                accessCardDetailFragment.r(accessCardDetailFragment.p().getProtocolEntity());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<View, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            AccessCardDetailFragment.V(AccessCardDetailFragment.this, null, null, 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/CardScheduleTime;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<CardScheduleTime, Unit> {
        public f() {
            super(1);
        }

        public final void a(@NotNull CardScheduleTime cardScheduleTime) throws Exception {
            AccessCardDetailFragment.this.p().deleteScheduleTimes(cardScheduleTime);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardScheduleTime cardScheduleTime) throws Exception {
            a(cardScheduleTime);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<View, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            if (AccessCardDetailFragment.this.p().getProtocolEntity() == null) {
                AccessCardDetailFragment.this.P();
            } else {
                AccessCardDetailFragment accessCardDetailFragment = AccessCardDetailFragment.this;
                accessCardDetailFragment.r(accessCardDetailFragment.p().getProtocolEntity());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public h() {
            super(1);
        }

        public final void a(Resource<Boolean> resource) {
            if (resource.status == Status.LOADING) {
                AccessCardDetailFragment.this.v();
                return;
            }
            if (resource.data != null && resource.isSuccessful()) {
                AccessCardDetailFragment.this.n();
                TextView textView = AccessCardDetailFragment.this.o().tvCardName;
                DoorCardInfo doorCardInfo = AccessCardDetailFragment.this.p().getDoorInfoAndDefaultCard().getDoorCardInfo();
                textView.setText(doorCardInfo == null ? null : doorCardInfo.getName());
                return;
            }
            if (TextUtils.equals(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                IconToastHelper.showOrError(AccessCardDetailFragment.this.requireContext(), AccessCardDetailFragment.this.getResources().getString(R.string.access_no_network), resource);
                AccessCardDetailFragment.this.n();
            } else {
                IconToastHelper.showOrError(AccessCardDetailFragment.this.requireContext(), AccessCardDetailFragment.this.getResources().getString(R.string.access_access_door_loading_failure), resource);
                AccessCardDetailFragment.this.n();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public i() {
            super(1);
        }

        public final void a(Resource<Boolean> resource) {
            if (resource.status == Status.LOADING) {
                if (AccessCardDetailFragment.this.mLoadingDialog == null || !AccessCardDetailFragment.this.mLoadingDialog.isShowing()) {
                    AccessCardDetailFragment accessCardDetailFragment = AccessCardDetailFragment.this;
                    accessCardDetailFragment.mLoadingDialog = LoadingDialog.showDialog(accessCardDetailFragment.requireActivity(), AccessCardDetailFragment.this.getResources().getString(R.string.access_access_door_delete_loading));
                    AccessCardDetailFragment.this.mLoadingDialog.setCancelable(false);
                    return;
                }
                return;
            }
            if (resource.data != null && resource.isSuccessful()) {
                AccessCardDetailFragment.this.n();
                if (AccessCardDetailFragment.this.cardSize == 1) {
                    AccessDoorPageHelper.getInstance().finishPreviousActivities();
                    return;
                } else {
                    AccessCardDetailFragment.this.requireActivity().finish();
                    return;
                }
            }
            if (TextUtils.equals(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                IconToastHelper.showOrError(AccessCardDetailFragment.this.requireContext(), AccessCardDetailFragment.this.getResources().getString(R.string.access_no_network), resource);
                AccessCardDetailFragment.this.n();
            } else {
                IconToastHelper.showOrError(AccessCardDetailFragment.this.requireContext(), AccessCardDetailFragment.this.getResources().getString(R.string.access_door_delete_failure), resource);
                AccessCardDetailFragment.this.n();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/CardScheduleTime;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<CardScheduleTime, Comparable<?>> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(@NotNull CardScheduleTime cardScheduleTime) {
            return Integer.valueOf(cardScheduleTime.getHour());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/CardScheduleTime;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<CardScheduleTime, Comparable<?>> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(@NotNull CardScheduleTime cardScheduleTime) {
            return Integer.valueOf(cardScheduleTime.getMinute());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ DialogInterface b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(DialogInterface dialogInterface) {
            super(1);
            this.b = dialogInterface;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) throws Exception {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) throws Exception {
            if (AccessCardDetailFragment.this.p().getDoorInfoAndDefaultCard().getDoorCardInfo() == null) {
                IconToast.showError(AccessCardDetailFragment.this.requireContext(), AccessCardDetailFragment.this.getResources().getString(R.string.access_door_update_card_name_failure));
                AccessCardDetailFragment.this.requireActivity().finish();
            } else {
                AccessCardDetailFragment.this.p().getDoorInfoAndDefaultCard().getDoorCardInfo().setName(str);
                AccessCardDetailFragment.this.p().updateCardName(AccessCardDetailFragment.this.p().getDoorInfoAndDefaultCard().getDoorCardInfo());
            }
            this.b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "hour", "minute", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function2<Integer, Integer, Unit> {
        public final /* synthetic */ TimeSelectorDialog b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "code", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Integer, Unit> {
            public final /* synthetic */ AccessCardDetailFragment a;
            public final /* synthetic */ TimeSelectorDialog b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AccessCardDetailFragment accessCardDetailFragment, TimeSelectorDialog timeSelectorDialog) {
                super(1);
                this.a = accessCardDetailFragment;
                this.b = timeSelectorDialog;
            }

            public final void a(int i) {
                if (i == 1) {
                    this.a.S(this.b.getString(R.string.wl_set_scheduled_switch_notification_msg_1));
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.a.S(this.b.getResources().getQuantityString(R.plurals.wl_set_scheduled_switch_notification_msg_2, 5, 5));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                a(num.intValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(TimeSelectorDialog timeSelectorDialog) {
            super(2);
            this.b = timeSelectorDialog;
        }

        public final void a(@Nullable Integer num, @Nullable Integer num2) throws Exception {
            if (num == null) {
                return;
            }
            num.intValue();
            if (num2 == null) {
                return;
            }
            num2.intValue();
            AccessCardDetailFragment.this.p().setCardScheduleTime(AccessCardDetailFragment.this.p().getDoorInfoAndDefaultCard().getDoorCardInfo().getAid(), num.intValue(), num2.intValue(), new a(AccessCardDetailFragment.this, this.b));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) throws Exception {
            a(num, num2);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AccessCardDetailFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentAccessCardDetailBinding;"));
        g = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccessCardDetailFragment() {
        super(R.layout.fragment_access_card_detail);
        this.binding = FragmentViewBindingKt.viewBinding(new AccessCardDetailFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentAccessCardDetailBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.AccessCardDetailFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AccessDetailViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.AccessCardDetailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.AccessDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AccessDetailViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(AccessDetailViewModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(AccessCardDetailFragment accessCardDetailFragment, Resource resource) {
        List listSortedWith;
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        List<CardScheduleTime> mutableList = null;
        if (i2 == 1) {
            O(accessCardDetailFragment, null, 1, null);
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return;
            }
            accessCardDetailFragment.n();
            return;
        }
        accessCardDetailFragment.n();
        RecyclerView.Adapter adapter = accessCardDetailFragment.o().rvScheduledSwitchTimes.getAdapter();
        if (!(adapter instanceof CardScheduleTimeAdapter)) {
            adapter = null;
        }
        if (adapter == null) {
            return;
        }
        CardScheduleTimeAdapter cardScheduleTimeAdapter = (CardScheduleTimeAdapter) adapter;
        List list = (List) resource.data;
        if (list != null && (listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, ComparisonsKt__ComparisonsKt.compareBy(j.a, k.a))) != null) {
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listSortedWith);
        }
        if (mutableList == null) {
            return;
        }
        cardScheduleTimeAdapter.setDataSource(mutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(AccessCardDetailFragment accessCardDetailFragment, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 1) {
            O(accessCardDetailFragment, null, 1, null);
            return;
        }
        if (i2 != 3) {
            accessCardDetailFragment.n();
            return;
        }
        accessCardDetailFragment.n();
        String str = resource.code;
        if (!(str != null && StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "53", false, 2, (Object) null))) {
            String str2 = resource.code;
            if (!(str2 != null && StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "66", false, 2, (Object) null))) {
                CustomToast.makeText(accessCardDetailFragment.requireContext(), R.string.earbud_music_oper_fail, 0).show();
                return;
            }
        }
        accessCardDetailFragment.S(accessCardDetailFragment.getString(R.string.wl_set_scheduled_switch_notification_msg_1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(AccessCardDetailFragment accessCardDetailFragment, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 1) {
            O(accessCardDetailFragment, null, 1, null);
            return;
        }
        if (i2 == 2) {
            accessCardDetailFragment.n();
        } else {
            if (i2 != 3) {
                return;
            }
            accessCardDetailFragment.n();
            CustomToast.makeText(accessCardDetailFragment.requireContext(), R.string.earbud_music_oper_fail, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(AccessCardDetailFragment accessCardDetailFragment, Boolean bool) {
        accessCardDetailFragment.o().doorCardTimeSwitch.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    private final void E() {
        LiveDataExtensionKt.observeWithNotNull(p().getSetDefaultCardLiveData(), this, new Function1<Resource<Boolean>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.AccessCardDetailFragment$observeSetDefaultCard$1

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.LOADING.ordinal()] = 1;
                    iArr[Status.SUCCESS.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(Resource<Boolean> resource) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
                if (i2 == 1) {
                    AccessCardDetailFragment accessCardDetailFragment = this.a;
                    accessCardDetailFragment.mLoadingDialog = LoadingDialog.showDialog(accessCardDetailFragment.requireActivity(), this.a.getResources().getString(R.string.access_door_loading));
                    this.a.mLoadingDialog.setCancelable(false);
                } else if (i2 == 2) {
                    this.a.n();
                    this.a.X(true);
                    this.a.t();
                } else if (Intrinsics.areEqual(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                    IconToastHelper.showOrError(this.a.requireContext(), this.a.getResources().getString(R.string.access_no_network), resource);
                    this.a.n();
                } else {
                    this.a.n();
                    this.a.s();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
    }

    private final void F() throws Exception {
        w();
        x();
        E();
        y();
        z();
        p().getDoorInfoLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: o0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) throws Exception {
                AccessCardDetailFragment.G(this.a, (DoorInfoAndDefaultCard) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(AccessCardDetailFragment accessCardDetailFragment, DoorInfoAndDefaultCard doorInfoAndDefaultCard) throws Exception {
        accessCardDetailFragment.o().tvCardName.setText(accessCardDetailFragment.p().getDoorInfoAndDefaultCard().getDoorCardInfo().getName());
        ImageUtils.loadImage(accessCardDetailFragment.o().cardImage, accessCardDetailFragment.p().getDoorInfoAndDefaultCard().getDoorCardInfo().getCardArt());
        accessCardDetailFragment.W();
        accessCardDetailFragment.p().queryScheduleTimes(accessCardDetailFragment.p().getDoorInfoAndDefaultCard().getDoorCardInfo().getAid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setTitle(R.string.access_card_delete_verify).setMessage(R.string.access_card_message).setPositiveButton(R.string.access_card_verify, new DialogInterface.OnClickListener() { // from class: j0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) throws Exception {
                AccessCardDetailFragment.I(this.a, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.access_card_cancel, new DialogInterface.OnClickListener() { // from class: m0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AccessCardDetailFragment.J(dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(AccessCardDetailFragment accessCardDetailFragment, DialogInterface dialogInterface, int i2) throws Exception {
        if (accessCardDetailFragment.p().getDoorInfoAndDefaultCard().getDoorCardInfo() != null) {
            accessCardDetailFragment.p().deleteCard(accessCardDetailFragment.p().getDoorInfoAndDefaultCard().getDoorCardInfo().getAid());
            return;
        }
        IconToast.showError(accessCardDetailFragment.requireContext(), accessCardDetailFragment.getResources().getString(R.string.access_door_delete_failure));
        FragmentActivity activity = accessCardDetailFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        String string = TextUtils.isEmpty(o().tvCardName.getText().toString()) ? "" : o().tvCardName.getText().toString();
        final a aVar = new a(string);
        new AlertDialogFragment.Builder(requireContext()).setTitle(R.string.access_edit_access_name).autoDismiss(false).editTextShow(true).setEditText(string).addTextWatcher(aVar).setNegativeButton(R.string.access_card_cancel, new DialogInterface.OnClickListener() { // from class: k0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AccessCardDetailFragment.L(dialogInterface, i2);
            }
        }).setPositiveButton(R.string.access_card_verify, new DialogInterface.OnClickListener() { // from class: com.huami.wallet.accessdoor.fragment.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AccessCardDetailFragment.M(this.a, aVar, dialogInterface, i2);
            }
        }).show(getChildFragmentManager()).setGravity(80);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(AccessCardDetailFragment accessCardDetailFragment, a aVar, DialogInterface dialogInterface, int i2) {
        accessCardDetailFragment.m(aVar.getCurrentText(), accessCardDetailFragment.new l(dialogInterface));
    }

    private final void N(@StringRes Integer msg) {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            LoadingDialog loadingDialogShowDialog = msg != null ? LoadingDialog.showDialog(requireActivity(), getResources().getString(msg.intValue())) : LoadingDialog.showDialog(requireActivity());
            this.mLoadingDialog = loadingDialogShowDialog;
            loadingDialogShowDialog.setCancelable(false);
        }
    }

    public static /* synthetic */ void O(AccessCardDetailFragment accessCardDetailFragment, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        accessCardDetailFragment.N(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setTitle(R.string.access_card_set_default_card).setMessage(getString(DoorKoinModuleKt.getDoorRes().setDefaultCardMessage())).setPositiveButton(R.string.access_card_verify, new DialogInterface.OnClickListener() { // from class: h0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) throws Exception {
                AccessCardDetailFragment.Q(this.a, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.access_card_cancel, new DialogInterface.OnClickListener() { // from class: n0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AccessCardDetailFragment.R(dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(AccessCardDetailFragment accessCardDetailFragment, DialogInterface dialogInterface, int i2) throws Exception {
        if (accessCardDetailFragment.p().getDoorInfoAndDefaultCard().getDoorCardInfo() != null) {
            accessCardDetailFragment.p().setDefaultCard(accessCardDetailFragment.p().getDoorInfoAndDefaultCard().getDoorCardInfo().getAid());
            return;
        }
        IconToast.showError(accessCardDetailFragment.requireContext(), accessCardDetailFragment.getResources().getString(R.string.access_door_set_name_failure));
        FragmentActivity activity = accessCardDetailFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(String msg) {
        new AlertDialogFragment.Builder(requireContext()).setTitle(R.string.wl_scheduled_switch_notification_title).setMessage(msg).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: l0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AccessCardDetailFragment.T(dialogInterface, i2);
            }
        }).setCancelable(false).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void U(Integer hour, Integer minute) {
        List<CardScheduleTime> list;
        Resource<List<CardScheduleTime>> value = p().getCardScheduleTimesLiveData().getValue();
        boolean z = false;
        if (((value == null || (list = value.data) == null) ? 0 : list.size()) >= 5) {
            S(getResources().getQuantityString(R.plurals.wl_set_scheduled_switch_notification_msg_2, 5, 5));
            return;
        }
        String string = getString(R.string.wl_choose_time);
        if (this.timeSelectorDialog == null) {
            TimeSelectorDialog timeSelectorDialog = new TimeSelectorDialog();
            this.timeSelectorDialog = timeSelectorDialog;
            timeSelectorDialog.setCancelable(true);
        }
        TimeSelectorDialog timeSelectorDialog2 = this.timeSelectorDialog;
        if (timeSelectorDialog2 == null) {
            return;
        }
        timeSelectorDialog2.setSureListener(new m(timeSelectorDialog2));
        timeSelectorDialog2.setTitle(string);
        Calendar calendar = Calendar.getInstance();
        timeSelectorDialog2.setInitialTime(hour == null ? calendar.get(11) : hour.intValue(), minute == null ? calendar.get(12) : minute.intValue());
        if (!timeSelectorDialog2.isAdded() && !timeSelectorDialog2.isVisible() && getChildFragmentManager().findFragmentByTag(h) == null) {
            z = true;
        }
        if (!z) {
            timeSelectorDialog2 = null;
        }
        if (timeSelectorDialog2 == null) {
            return;
        }
        timeSelectorDialog2.show(getChildFragmentManager(), h);
    }

    public static /* synthetic */ void V(AccessCardDetailFragment accessCardDetailFragment, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            num2 = null;
        }
        accessCardDetailFragment.U(num, num2);
    }

    private final void W() throws Exception {
        DoorCardInfo doorCardInfo = p().getDoorInfoAndDefaultCard().getDoorCardInfo();
        if (doorCardInfo == null) {
            return;
        }
        p().updateCardName(doorCardInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(boolean isDefault) {
        o().tvSetDefaultCard.setVisibility(isDefault ? 8 : 0);
        o().tvCardState.setVisibility(isDefault ^ true ? 8 : 0);
        if (p().isEncryptionCard()) {
            o().tvEncryptionCardTip.setVisibility(0);
            o().tvEncryptionTip.setVisibility(0);
        } else {
            o().tvEncryptionCardTip.setVisibility(8);
            o().tvEncryptionTip.setVisibility(8);
        }
    }

    private final void initView() {
        ViewSingleClickExtensionKt.singleClickListener(o().tvSetDefaultCard, 1000L, new g());
        u();
        q();
    }

    private final void m(String cardName, Function1<? super String, Unit> done) {
        int iStrLength = EditTextWatcher.strLength(cardName);
        if (iStrLength == 0) {
            CustomToast.makeText(requireContext(), getResources().getString(R.string.access_please_input_card_name), 1).show();
        } else if (iStrLength > 14) {
            CustomToast.makeText(requireContext(), getString(R.string.access_door_input_length_tip), 0).show();
        } else {
            done.invoke(cardName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.mLoadingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAccessCardDetailBinding o() {
        return (FragmentAccessCardDetailBinding) this.binding.getValue(this, g[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessDetailViewModel p() {
        return (AccessDetailViewModel) this.viewModel.getValue();
    }

    private final void q() {
        TextView textView = (TextView) requireView().findViewById(R.id.tv_fre_question);
        TextView textView2 = (TextView) requireView().findViewById(R.id.tv_edit_name);
        TextView textView3 = (TextView) requireView().findViewById(R.id.tv_delete_card);
        ViewSingleClickExtensionKt.singleClickListener(textView2, 1000L, new b());
        ViewSingleClickExtensionKt.singleClickListener(textView, 1000L, new c());
        ViewSingleClickExtensionKt.singleClickListener(textView3, 1000L, new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(ProtocolEntity protocolEntity) {
        AccessDoorUserPrivacyDialog accessDoorUserPrivacyDialog = AccessDoorUserPrivacyDialog.getInstance(protocolEntity);
        this.mAccessDoorUserPrivacyDialog = accessDoorUserPrivacyDialog;
        accessDoorUserPrivacyDialog.setOnClickButton(new AccessDoorUserPrivacyDialog.OnClickButton() { // from class: com.huami.wallet.accessdoor.fragment.AccessCardDetailFragment$initDialog$1
            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickNegation() {
                AccessDoorUserPrivacyDialog accessDoorUserPrivacyDialog2 = this.a.mAccessDoorUserPrivacyDialog;
                if (accessDoorUserPrivacyDialog2 == null) {
                    return;
                }
                accessDoorUserPrivacyDialog2.dismiss();
            }

            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickPosition(@Nullable Long id) throws Exception {
                this.a.p().userAgreementProtocol(id);
                AccessDoorUserPrivacyDialog accessDoorUserPrivacyDialog2 = this.a.mAccessDoorUserPrivacyDialog;
                if (accessDoorUserPrivacyDialog2 == null) {
                    return;
                }
                accessDoorUserPrivacyDialog2.dismiss();
            }

            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickUserPrivacy(@NotNull String protocol) {
                FunctionsConfig.getOpenWebUrl().invoke(protocol);
            }
        });
        this.mAccessDoorUserPrivacyDialog.show(getChildFragmentManager(), h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setTitle(R.string.access_card_set_default_failure).setMessage(R.string.access_card_set_default_failure_message).setNeutralButton(R.string.access_card_has_known, (DialogInterface.OnClickListener) null).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setTitle(R.string.access_card_set_default_success).setMessage(getString(DoorKoinModuleKt.getDoorRes().setDefaultCardSuccessMessage())).setNeutralButton(R.string.access_card_has_known, (DialogInterface.OnClickListener) null).show(getChildFragmentManager());
    }

    private final void u() {
        ViewSingleClickExtensionKt.singleClickListener(o().btScheduledSwitchCardAdd, 1000L, new e());
        CardScheduleTimeAdapter cardScheduleTimeAdapter = new CardScheduleTimeAdapter();
        cardScheduleTimeAdapter.setItemViewDeleteClickListener(new f());
        RecyclerView recyclerView = o().rvScheduledSwitchTimes;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setJustifyContent(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter(cardScheduleTimeAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(requireActivity(), getResources().getString(R.string.access_access_door_loading));
            this.mLoadingDialog = loadingDialogShowDialog;
            loadingDialogShowDialog.setCancelable(false);
        }
    }

    private final void w() {
        LiveDataExtensionKt.observeWithNotNull(p().getUpdateCardNameLiveData(), this, new h());
    }

    private final void x() {
        LiveDataExtensionKt.observeWithNotNull(p().getDeleteCardLiveData(), this, new i());
    }

    private final void y() {
        LiveDataExtensionKt.observeWithNotNull(p().getGetProtocolEntityLiveData(), this, new Function1<Resource<ProtocolEntity>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.AccessCardDetailFragment$observeProtocolEntity$1

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.SUCCESS.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(Resource<ProtocolEntity> resource) {
                ProtocolEntity protocolEntity;
                if (WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()] != 1 || (protocolEntity = resource.data) == null) {
                    return;
                }
                this.a.r(protocolEntity);
                this.a.p().setProtocolEntity(resource.data);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<ProtocolEntity> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
    }

    private final void z() throws Exception {
        p().getCardScheduleTimesLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: q0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AccessCardDetailFragment.A(this.a, (Resource) obj);
            }
        });
        p().getSetCardScheduleTimeResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: r0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AccessCardDetailFragment.B(this.a, (Resource) obj);
            }
        });
        p().getDeleteCardScheduleTimeResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: p0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AccessCardDetailFragment.C(this.a, (Resource) obj);
            }
        });
        p().isSupportTimeSwitchCardLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: i0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AccessCardDetailFragment.D(this.a, (Boolean) obj);
            }
        });
        p().isSupportTimeSwitchCard();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        p().getUserProtocol("UPDATE");
        initView();
        this.cardSize = requireActivity().getIntent().getIntExtra("cardSize", 0);
        F();
        DoorInfoAndDefaultCard doorInfoAndDefaultCard = (DoorInfoAndDefaultCard) requireActivity().getIntent().getParcelableExtra("doorInfoAndDefaultCard");
        p().setDoorInfoAndDefaultCard(doorInfoAndDefaultCard);
        X(doorInfoAndDefaultCard.getIdDefaultCard());
    }
}
