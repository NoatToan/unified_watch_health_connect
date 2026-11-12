package com.xiaomi.fitness.nfc.ui.issued;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.sesdk.KeyCardArt;
import com.miui.tsmclient.sesdk.SeCard;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.bean.NameBean;
import com.xiaomi.fitness.nfc.ui.BaseRechargeFragment;
import com.xiaomi.fitness.nfc.ui.IssuerActivity;
import com.xiaomi.fitness.nfc.ui.issued.CardRenameFragment;
import com.xiaomi.fitness.nfc.ui.issued.MifareCardFaceListAdapter;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.cxg;
import defpackage.emg;
import defpackage.ixf;
import defpackage.ltg;
import defpackage.lxf;
import defpackage.o0j;
import defpackage.o63;
import defpackage.pli;
import defpackage.qhi;
import defpackage.sui;
import defpackage.uxi;
import defpackage.vng;
import defpackage.vqg;
import defpackage.yhq;
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
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003@ABB\u0007¢\u0006\u0004\b?\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\nJ\u0017\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00104\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00101R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\u000608R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardRenameFragment;", "Lcom/xiaomi/fitness/nfc/ui/BaseRechargeFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/CardRenameViewModel;", "Lvng;", "Landroid/content/Context;", "context", "", "goToNotificationSetting", "(Landroid/content/Context;)V", "loadCardFace", "()V", "onSuccess", "setLayoutManager", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "", "isNeedCardInfo", "()Z", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", LifecycleConstantKt.ON_DESTROY, "", "s", "disEngAndChLengthFilter", "(Ljava/lang/CharSequence;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lixf;", "mAdapter", "Lixf;", "Lcom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter;", "mFaceAdapter", "Lcom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter$FaceBean;", "faceBeanList", "Ljava/util/ArrayList;", "Lcom/miui/tsmclient/sesdk/KeyCardArt$Art;", "selectCardFace", "Lcom/miui/tsmclient/sesdk/KeyCardArt$Art;", "hasMiLockDevice", "Z", "isFromOurApp", "isFromDoorDetail", "isNeedShowSupperDialog", "", "sourceChannel", "Ljava/lang/String;", "Lcom/xiaomi/fitness/nfc/ui/issued/CardRenameFragment$NameEditTextWatcher;", "nameEditTextWatcher", "Lcom/xiaomi/fitness/nfc/ui/issued/CardRenameFragment$NameEditTextWatcher;", "", "getColCountPerRow", "()I", "colCountPerRow", "<init>", "Companion", "NameEditTextWatcher", "CustomerItemDecoration", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCardRenameFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardRenameFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/CardRenameFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,384:1\n13402#2,2:385\n1863#3,2:387\n*S KotlinDebug\n*F\n+ 1 CardRenameFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/CardRenameFragment\n*L\n111#1:385,2\n118#1:387,2\n*E\n"})
public final class CardRenameFragment extends BaseRechargeFragment<CardRenameViewModel, vng> {

    @NotNull
    private final ArrayList<MifareCardFaceListAdapter.FaceBean> faceBeanList;
    private boolean hasMiLockDevice;
    private boolean isFromDoorDetail;
    private boolean isFromOurApp;
    private boolean isNeedShowSupperDialog;

    @Nullable
    private ixf mAdapter;

    @Nullable
    private MifareCardFaceListAdapter mFaceAdapter;

    @NotNull
    private NameEditTextWatcher nameEditTextWatcher;

    @Nullable
    private KeyCardArt.Art selectCardFace;

    @Nullable
    private String sourceChannel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String sHasMiLockDevice = "sHasMiLockDevice";

    @NotNull
    private static final String sIsNeedShowSupperDialog = "isNeedShowSupperDialog";

    @NotNull
    private static final String sIsFromOurApp = "sIsFromOurApp";

    @NotNull
    private static final String sIsFromDoorDetail = "sIsFromDoorDetail";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardRenameFragment$Companion;", "", "<init>", "()V", "sHasMiLockDevice", "", "getSHasMiLockDevice", "()Ljava/lang/String;", "sIsNeedShowSupperDialog", "getSIsNeedShowSupperDialog", "sIsFromOurApp", "getSIsFromOurApp", "sIsFromDoorDetail", "getSIsFromDoorDetail", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSHasMiLockDevice() {
            return CardRenameFragment.sHasMiLockDevice;
        }

        @NotNull
        public final String getSIsFromDoorDetail() {
            return CardRenameFragment.sIsFromDoorDetail;
        }

        @NotNull
        public final String getSIsFromOurApp() {
            return CardRenameFragment.sIsFromOurApp;
        }

        @NotNull
        public final String getSIsNeedShowSupperDialog() {
            return CardRenameFragment.sIsNeedShowSupperDialog;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardRenameFragment$CustomerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "spanCount", "I", "spacing", "", "includeEdge", "Z", "<init>", "(IIZ)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class CustomerItemDecoration extends RecyclerView.n {
        private final boolean includeEdge;
        private final int spacing;
        private final int spanCount;

        public CustomerItemDecoration(int i, int i2, boolean z) {
            this.spanCount = i;
            this.spacing = i2;
            this.includeEdge = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (this.spanCount == 1) {
                outRect.bottom = this.spacing;
                return;
            }
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int i = this.spanCount;
            int i2 = childAdapterPosition % i;
            int i3 = this.spacing;
            outRect.left = (i2 * i3) / i;
            outRect.right = i3 - (((i2 + 1) * i3) / i);
            if (childAdapterPosition >= i) {
                outRect.top = i3;
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardRenameFragment$NameEditTextWatcher;", "Landroid/text/TextWatcher;", "<init>", "(Lcom/xiaomi/fitness/nfc/ui/issued/CardRenameFragment;)V", "beforeTextChanged", "", "s", "", StatConstants.PARAM_START, "", "count", "after", "onTextChanged", "before", "afterTextChanged", "Landroid/text/Editable;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class NameEditTextWatcher implements TextWatcher {
        public NameEditTextWatcher() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s) {
            CardRenameFragment.access$getMBinding(CardRenameFragment.this).G.removeTextChangedListener(CardRenameFragment.this.nameEditTextWatcher);
            CardRenameFragment.this.disEngAndChLengthFilter(s);
            CardRenameFragment.access$getMBinding(CardRenameFragment.this).G.setSelection(CardRenameFragment.access$getMBinding(CardRenameFragment.this).G.getText().length());
            CardRenameFragment.access$getMBinding(CardRenameFragment.this).G.addTextChangedListener(CardRenameFragment.this.nameEditTextWatcher);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
        }
    }

    public CardRenameFragment() {
        super(sui.C, 0, true);
        this.faceBeanList = new ArrayList<>();
        this.isFromOurApp = true;
        this.isFromDoorDetail = true;
        this.isNeedShowSupperDialog = true;
        this.nameEditTextWatcher = new NameEditTextWatcher();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ vng access$getMBinding(CardRenameFragment cardRenameFragment) {
        return (vng) cardRenameFragment.getMBinding();
    }

    private final int getColCountPerRow() {
        Application application;
        if (!SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            UIUtils uIUtils = UIUtils.INSTANCE;
            if (!uIUtils.isTablet() || (application = ApplicationExtKt.getApplication()) == null || !uIUtils.isLandscape(application)) {
                return 2;
            }
        }
        return 4;
    }

    private final void goToNotificationSetting(Context context) {
        Intent intent = new Intent();
        try {
            intent.addFlags(268435456);
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            startActivity(intent);
        } catch (Exception unused) {
            intent.addFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.xiaomi.fitness.device.manager.DeviceModel, java.lang.Object] */
    private final void loadCardFace() {
        if (lxf.e(getCardWrapper())) {
            return;
        }
        ?? currentDeviceModel = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Intrinsics.checkNotNull(currentDeviceModel);
        if (DeviceModelExtKt.isHuaMi(currentDeviceModel)) {
            return;
        }
        CardRenameViewModel cardRenameViewModel = (CardRenameViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        cardRenameViewModel.loadFaceList(cardWrapper, new Function1() { // from class: nq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardRenameFragment.loadCardFace$lambda$4(this.f28243a, (List) obj);
            }
        }, new Function1() { // from class: oq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardRenameFragment.loadCardFace$lambda$5((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadCardFace$lambda$4(CardRenameFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            ((vng) this$0.getMBinding()).B.setVisibility(8);
            ((vng) this$0.getMBinding()).A.setVisibility(8);
        } else {
            ((vng) this$0.getMBinding()).B.setVisibility(0);
            ((vng) this$0.getMBinding()).A.setVisibility(0);
        }
        MifareCardFaceListAdapter mifareCardFaceListAdapter = this$0.mFaceAdapter;
        if (mifareCardFaceListAdapter != null) {
            mifareCardFaceListAdapter.updateData(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCardFace$lambda$5(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccess() {
        zl3.g().p();
        ltg.c().v(getCardWrapper());
        o63.b(new yl3(getCardWrapper(), true));
        if (!this.isFromOurApp || !lxf.e(getCardWrapper()) || this.isFromDoorDetail) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1, new Intent());
            }
            finish();
            return;
        }
        if (!this.hasMiLockDevice) {
            String MI_LOCK_CARD_HELP_URL = emg.f16810a;
            Intrinsics.checkNotNullExpressionValue(MI_LOCK_CARD_HELP_URL, "MI_LOCK_CARD_HELP_URL");
            WebViewUtilKt.startWebView$default(MI_LOCK_CARD_HELP_URL, "", false, false, null, false, null, false, 252, null);
            FragmentActivity mActivity2 = getMActivity();
            if (mActivity2 != null) {
                mActivity2.setResult(-1);
            }
            finish();
            return;
        }
        FragmentActivity mActivity3 = getMActivity();
        Intrinsics.checkNotNull(mActivity3);
        if (mActivity3.getPackageManager().getLaunchIntentForPackage("com.xiaomi.smarthome") == null) {
            CommonDialog commonDialogCreate = new CommonDialog.c("CardRenameFragment.nothasMijiaApp").setDialogTitle(o0j.p2).setDialogDescription(o0j.i1).setPositiveText(o0j.u2).setCancelable(false).create();
            Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.issued.CardRenameFragment.onSuccess.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    FragmentActivity mActivity4 = CardRenameFragment.this.getMActivity();
                    if (mActivity4 != null) {
                        mActivity4.setResult(-1);
                    }
                    CardRenameFragment.this.finish();
                }
            });
            commonDialogCreate.showIfNeed(getChildFragmentManager());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mihomeplugin://open?action=ACTIVATE_NFC_FOR_LOCK&uid=" + yhq.c.a()));
        intent.setFlags(268435456);
        startActivity(intent);
        FragmentActivity mActivity4 = getMActivity();
        Intrinsics.checkNotNull(mActivity4);
        mActivity4.setResult(-1);
        FragmentActivity mActivity5 = getMActivity();
        Intrinsics.checkNotNull(mActivity5);
        mActivity5.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(CardRenameFragment this$0, MifareCardFaceListAdapter.FaceBean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator<T> it2 = this$0.faceBeanList.iterator();
        while (it2.hasNext()) {
            ((MifareCardFaceListAdapter.FaceBean) it2.next()).setSelected(false);
        }
        it.setSelected(true);
        this$0.selectCardFace = it.getArt();
        MifareCardFaceListAdapter mifareCardFaceListAdapter = this$0.mFaceAdapter;
        if (mifareCardFaceListAdapter != null) {
            mifareCardFaceListAdapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(Ref.BooleanRef hashNotifyPermission, CardRenameFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(hashNotifyPermission, "$hashNotifyPermission");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!hashNotifyPermission.element) {
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            this$0.goToNotificationSetting(contextRequireContext);
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), getColCountPerRow());
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.nfc.ui.issued.CardRenameFragment.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        ((vng) getMBinding()).B.addItemDecoration(new CustomerItemDecoration(getColCountPerRow(), ExtUtilsKt.getDp(Float.valueOf(16.0f)), false));
        ((vng) getMBinding()).B.setLayoutManager(gridLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$6(CardRenameFragment this$0, AdapterView adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ixf ixfVar = this$0.mAdapter;
        if (ixfVar != null) {
            ixfVar.b(i);
        }
        ixf ixfVar2 = this$0.mAdapter;
        Intrinsics.checkNotNull(ixfVar2);
        ((vng) this$0.getMBinding()).G.setText(ixfVar2.getItem(i).getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$9(final CardRenameFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = ((vng) this$0.getMBinding()).G.getText().toString();
        if (TextUtils.isEmpty(string)) {
            ToastUtil.showShortToast(o0j.p3);
            return;
        }
        if (!this$0.faceBeanList.isEmpty() && this$0.selectCardFace == null) {
            ToastUtil.showLongToast(o0j.R4);
            return;
        }
        this$0.showLoading();
        CardRenameViewModel cardRenameViewModel = (CardRenameViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        cardRenameViewModel.submitCardInfo(cardWrapper, string, this$0.selectCardFace, new Function0() { // from class: hq3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardRenameFragment.setListener$lambda$9$lambda$7(this.f20330a);
            }
        }, new Function1() { // from class: iq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardRenameFragment.setListener$lambda$9$lambda$8(this.f21983a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$9$lambda$7(CardRenameFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new CardRenameFragment$setListener$2$1$1(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$9$lambda$8(CardRenameFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        AnyExtKt.main$default(null, new CardRenameFragment$setListener$2$2$1(this$0, msg, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void disEngAndChLengthFilter(@Nullable CharSequence s) {
        if (s != null) {
            int length = s.length();
            int i = 0;
            if (length > 0) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    char cCharAt = s.charAt(i2);
                    i3 += (cCharAt < 19968 || cCharAt > 40869) ? 1 : 2;
                    int i4 = i2 + 1;
                    if (i3 > 16) {
                        s = s.subSequence(0, i2);
                        break;
                    }
                    i2 = i4;
                }
                i = i3;
            }
            if (i > 16) {
                ToastUtil.showToast(getResources().getQuantityString(uxi.f36253b, 16, 16));
                ((vng) getMBinding()).G.setText(s);
            } else {
                ((vng) getMBinding()).G.setText(s);
                ((vng) getMBinding()).H.setEnabled(true);
            }
        }
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((vng) getMBinding()).E.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setLayoutManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.nfc.ui.BaseRechargeFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        ((vng) getMBinding()).G.removeTextChangedListener(this.nameEditTextWatcher);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        SeCard seCard;
        SeCard seCard2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(getString(o0j.Q4));
        EditText editText = ((vng) getMBinding()).G;
        CardWrapper cardWrapper = getCardWrapper();
        String name = null;
        if (TextUtils.isEmpty((cardWrapper == null || (seCard2 = cardWrapper.mSeCard) == null) ? null : seCard2.getName())) {
            name = getString(o0j.n3);
        } else {
            CardWrapper cardWrapper2 = getCardWrapper();
            if (cardWrapper2 != null && (seCard = cardWrapper2.mSeCard) != null) {
                name = seCard.getName();
            }
        }
        editText.setText(name);
        ((vng) getMBinding()).G.addTextChangedListener(this.nameEditTextWatcher);
        String[] stringArray = getResources().getStringArray(qhi.f31525a);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        this.mAdapter = new ixf(getActivity());
        ((vng) getMBinding()).F.setAdapter((ListAdapter) this.mAdapter);
        ArrayList arrayList = new ArrayList();
        for (String str : stringArray) {
            Intrinsics.checkNotNull(str);
            arrayList.add(new NameBean(str, false));
        }
        ((NameBean) arrayList.get(0)).setSelected(true);
        ixf ixfVar = this.mAdapter;
        if (ixfVar != null) {
            ixfVar.c(arrayList);
        }
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        this.mFaceAdapter = new MifareCardFaceListAdapter(mActivity, this.faceBeanList, new Function1() { // from class: lq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardRenameFragment.onViewCreated$lambda$2(this.f25321a, (MifareCardFaceListAdapter.FaceBean) obj);
            }
        });
        setLayoutManager();
        ((vng) getMBinding()).B.setAdapter(this.mFaceAdapter);
        if (!TextUtils.isEmpty(this.sourceChannel)) {
            ((vng) getMBinding()).C.setVisibility(0);
            if (StringsKt__StringsJVMKt.equals("MiHome", this.sourceChannel, true)) {
                ((vng) getMBinding()).C.setText(o0j.t1);
                ((vng) getMBinding()).H.setText(o0j.f1);
            } else {
                ((vng) getMBinding()).H.setText(o0j.g1);
            }
        } else if (getCardWrapper() != null && lxf.e(getCardWrapper()) && this.isFromOurApp) {
            ((vng) getMBinding()).C.setVisibility(0);
            ((vng) getMBinding()).C.setText(o0j.t1);
        }
        loadCardFace();
        if (this.isNeedShowSupperDialog) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            boolean zA = cxg.b(requireContext()).a();
            booleanRef.element = zA;
            int i = o0j.c5;
            int i2 = o0j.a5;
            int i3 = zA ? o0j.u2 : o0j.T3;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            UtilsKt.showMsgDialog$default(i, i2, i3, parentFragmentManager, 0, new Function1() { // from class: mq3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CardRenameFragment.onViewCreated$lambda$3(booleanRef, this, (DialogInterface) obj);
                }
            }, (Function1) null, 80, (Object) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.hasMiLockDevice = args.getBoolean(sHasMiLockDevice);
            this.isNeedShowSupperDialog = args.getBoolean(sIsNeedShowSupperDialog, false);
            this.isFromOurApp = args.getBoolean(sIsFromOurApp, true);
            this.isFromDoorDetail = args.getBoolean(sIsFromDoorDetail, false);
            String string = args.getString(IssuerActivity.KEY_SOURCE_CHANNEL);
            this.sourceChannel = string;
            vqg.b("CardRenameFragment: " + string);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((vng) getMBinding()).F.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: jq3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                CardRenameFragment.setListener$lambda$6(this.f23014a, adapterView, view, i, j);
            }
        });
        ((vng) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: kq3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardRenameFragment.setListener$lambda$9(this.f24157a, view);
            }
        });
    }
}
