package com.mi.fitness.lpamanagement.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.Scopes;
import com.mi.fitness.lpamanagement.ui.LpaManagementFragment;
import com.mi.fitness.lpamanagement.ui.chinamobile.LpaChinaMobileFragment;
import com.mi.fitness.lpamanagement.ui.chinatelecom.LpaChinaTelecomFragment;
import com.mi.fitness.lpamanagement.ui.chinaunicon.LpaChinaUniconFragment;
import com.mi.fitness.lpamanagement.util.CarrierEntryUtil;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import defpackage.av6;
import defpackage.azi;
import defpackage.dih;
import defpackage.fve;
import defpackage.ive;
import defpackage.jve;
import defpackage.kve;
import defpackage.l9a;
import defpackage.pti;
import defpackage.s7r;
import defpackage.zki;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0007¢\u0006\u0004\b#\u0010\u0019J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u0019R\u0018\u0010\u001d\u001a\u00060\u001cR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/LpaManagementFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/fitness/lpamanagement/ui/LpaManagementViewModel;", "Ll9a;", "", "Lkve;", "profiles", "", "handleProfileList", "(Ljava/util/List;)V", Scopes.PROFILE, "showProfile", "(Lkve;)V", "", "getProfileStatus", "(Lkve;)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "()V", "loadData", "setListener", "Lcom/mi/fitness/lpamanagement/ui/LpaManagementFragment$DataHandlerImpl;", "curDataHandler", "Lcom/mi/fitness/lpamanagement/ui/LpaManagementFragment$DataHandlerImpl;", "", "getLayoutId", "()I", "layoutId", "<init>", "DataHandlerImpl", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LpaManagementFragment extends BaseBindingFragment<LpaManagementViewModel, l9a> {

    @NotNull
    private final DataHandlerImpl curDataHandler = new DataHandlerImpl();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/LpaManagementFragment$DataHandlerImpl;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "(Lcom/mi/fitness/lpamanagement/ui/LpaManagementFragment;)V", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class DataHandlerImpl extends DataHandlerWrapper {
        public DataHandlerImpl() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            jve jveVarR;
            Intrinsics.checkNotNullParameter(did, "did");
            if (packet == null || packet.e != 9 || packet.f != 4) {
                return false;
            }
            ive iveVarX = packet.x();
            if (Intrinsics.areEqual((iveVarX == null || (jveVarR = iveVarX.r()) == null) ? null : Boolean.valueOf(jveVarR.c), Boolean.TRUE)) {
                AnyExtKt.main$default(null, new LpaManagementFragment$DataHandlerImpl$handlePacket$1(LpaManagementFragment.this, null), 1, null);
                Logger.i(LpaManagementFragmentKt.LPA_TAG, "operate success cmd = " + LpaManagementFragment.access$getMViewModel(LpaManagementFragment.this).getLastCmd());
                AnyExtKt.io$default(null, new LpaManagementFragment$DataHandlerImpl$handlePacket$2(LpaManagementFragment.this, null), 1, null);
            } else {
                Logger.i(LpaManagementFragmentKt.LPA_TAG, "operate failed cmd = " + LpaManagementFragment.access$getMViewModel(LpaManagementFragment.this).getLastCmd());
                AnyExtKt.main$default(null, new LpaManagementFragment$DataHandlerImpl$handlePacket$3(LpaManagementFragment.this, null), 1, null);
            }
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ LpaManagementViewModel access$getMViewModel(LpaManagementFragment lpaManagementFragment) {
        return (LpaManagementViewModel) lpaManagementFragment.getMViewModel();
    }

    private final String getProfileStatus(kve profile) {
        boolean z = profile.f;
        if (z) {
            String string = getString(azi.f3612r);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (z) {
            return "";
        }
        String string2 = getString(azi.s);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final void handleProfileList(List<kve> profiles) {
        List<kve> list = profiles;
        if (list != null && !list.isEmpty()) {
            ConstraintLayout lpaProvisionContainer = getMBinding().S;
            Intrinsics.checkNotNullExpressionValue(lpaProvisionContainer, "lpaProvisionContainer");
            ViewExtKt.gone(lpaProvisionContainer);
            ConstraintLayout lpaProfileContainer = getMBinding().N;
            Intrinsics.checkNotNullExpressionValue(lpaProfileContainer, "lpaProfileContainer");
            ViewExtKt.visible(lpaProfileContainer);
            showProfile(profiles.get(0));
            return;
        }
        ConstraintLayout lpaProvisionContainer2 = getMBinding().S;
        Intrinsics.checkNotNullExpressionValue(lpaProvisionContainer2, "lpaProvisionContainer");
        ViewExtKt.visible(lpaProvisionContainer2);
        ConstraintLayout lpaProfileContainer2 = getMBinding().N;
        Intrinsics.checkNotNullExpressionValue(lpaProfileContainer2, "lpaProfileContainer");
        ViewExtKt.gone(lpaProfileContainer2);
        CarrierEntryUtil carrierEntryUtil = CarrierEntryUtil.INSTANCE;
        if (carrierEntryUtil.isSupportCM()) {
            RightArrowSingleLineTextView lpamanagementCm = getMBinding().T;
            Intrinsics.checkNotNullExpressionValue(lpamanagementCm, "lpamanagementCm");
            ViewExtKt.visible(lpamanagementCm);
        } else {
            RightArrowSingleLineTextView lpamanagementCm2 = getMBinding().T;
            Intrinsics.checkNotNullExpressionValue(lpamanagementCm2, "lpamanagementCm");
            ViewExtKt.gone(lpamanagementCm2);
        }
        if (carrierEntryUtil.isSupportCU()) {
            RightArrowSingleLineTextView lpamanagementCu = getMBinding().V;
            Intrinsics.checkNotNullExpressionValue(lpamanagementCu, "lpamanagementCu");
            ViewExtKt.visible(lpamanagementCu);
        } else {
            RightArrowSingleLineTextView lpamanagementCu2 = getMBinding().V;
            Intrinsics.checkNotNullExpressionValue(lpamanagementCu2, "lpamanagementCu");
            ViewExtKt.gone(lpamanagementCu2);
        }
        if (carrierEntryUtil.isSupportCT()) {
            RightArrowSingleLineTextView lpamanagementCt = getMBinding().U;
            Intrinsics.checkNotNullExpressionValue(lpamanagementCt, "lpamanagementCt");
            ViewExtKt.visible(lpamanagementCt);
        } else {
            RightArrowSingleLineTextView lpamanagementCt2 = getMBinding().U;
            Intrinsics.checkNotNullExpressionValue(lpamanagementCt2, "lpamanagementCt");
            ViewExtKt.gone(lpamanagementCt2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(LpaManagementFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        Intrinsics.checkNotNull(list);
        this$0.handleProfileList(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(LpaManagementFragment this$0, fve fveVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String strByteToString = ByteUtil.byteToString(fveVar.c);
        this$0.getMBinding().K.showMore(false);
        this$0.getMBinding().L.showMore(false);
        this$0.getMBinding().K.setSubtitle(strByteToString);
        this$0.getMBinding().L.setSubtitle(fveVar.d);
        this$0.getMBinding().O.showMore(false);
        this$0.getMBinding().Q.showMore(false);
        this$0.getMBinding().O.setSubtitle(strByteToString);
        this$0.getMBinding().Q.setSubtitle(fveVar.d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(LpaManagementFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isLoadingShowing()) {
            this$0.dismissDialog();
            ToastUtil.INSTANCE.showToast(azi.m);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebViewUtilKt.startWebView$default(url, null, false, false, null, false, null, false, 254, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(LpaManagementFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dih.a().e(this$0.getContext(), new FragmentParams.b().e(LpaChinaUniconFragment.class).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(LpaManagementFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dih.a().e(this$0.getContext(), new FragmentParams.b().e(LpaChinaMobileFragment.class).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(LpaManagementFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dih.a().e(this$0.getContext(), new FragmentParams.b().e(LpaChinaTelecomFragment.class).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(final LpaManagementFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogCreate = new CommonDialog.c("disableEsim").setPositiveText(azi.f3610b).setNegativeText(azi.f3609a).setDialogTitle(azi.f).setDialogDescription(azi.e).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.mi.fitness.lpamanagement.ui.LpaManagementFragment$setListener$4$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    PageState.DefaultImpls.showLoading$default(this.this$0, null, 0, false, 3, null);
                    LpaManagementFragment.access$getMViewModel(this.this$0).disableProfile();
                }
            }
        });
        commonDialogCreate.showIfNeed(this$0.getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$8(LpaManagementFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading();
        ((LpaManagementViewModel) this$0.getMViewModel()).enableProfile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$9(final LpaManagementFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogCreate = new CommonDialog.c("deleteEsim").setPositiveText(azi.f3610b).setNegativeText(azi.f3609a).setDialogTitle(azi.d).setDialogDescription(azi.c).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.mi.fitness.lpamanagement.ui.LpaManagementFragment$setListener$6$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    PageState.DefaultImpls.showLoading$default(this.this$0, null, 0, false, 3, null);
                    LpaManagementFragment.access$getMViewModel(this.this$0).deleteProfile();
                }
            }
        });
        commonDialogCreate.showIfNeed(this$0.getChildFragmentManager());
    }

    private final void showProfile(kve profile) {
        getMBinding().M.showMore(false);
        getMBinding().M.setTitle(profile.e);
        getMBinding().M.setRemindText(getProfileStatus(profile));
        getMBinding().P.setSubtitle(ByteUtil.byteToString(profile.c));
        getMBinding().P.showMore(false);
        if (profile.f) {
            Button lpaBtnDeactive = getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(lpaBtnDeactive, "lpaBtnDeactive");
            ViewExtKt.visible(lpaBtnDeactive);
            Button lpaBtnDelete = getMBinding().G;
            Intrinsics.checkNotNullExpressionValue(lpaBtnDelete, "lpaBtnDelete");
            ViewExtKt.gone(lpaBtnDelete);
            Button lpaBtnEnable = getMBinding().H;
            Intrinsics.checkNotNullExpressionValue(lpaBtnEnable, "lpaBtnEnable");
            ViewExtKt.gone(lpaBtnEnable);
            getMBinding().M.setRemindTextColor(BaseFragmentExtKt.getColor(this, zki.f41404b));
            return;
        }
        getMBinding().M.setRemindTextColor(BaseFragmentExtKt.getColor(this, zki.c));
        Button lpaBtnDeactive2 = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(lpaBtnDeactive2, "lpaBtnDeactive");
        ViewExtKt.gone(lpaBtnDeactive2);
        Button lpaBtnDelete2 = getMBinding().G;
        Intrinsics.checkNotNullExpressionValue(lpaBtnDelete2, "lpaBtnDelete");
        ViewExtKt.visible(lpaBtnDelete2);
        Button lpaBtnEnable2 = getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(lpaBtnEnable2, "lpaBtnEnable");
        ViewExtKt.visible(lpaBtnEnable2);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pti.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        showLoading();
        ((LpaManagementViewModel) getMViewModel()).loadProfileInfo();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarrierEntryUtil.INSTANCE.loadCarrierEntries();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(9, this.curDataHandler);
        ((LpaManagementViewModel) getMViewModel()).removeDeviceStatusListener();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(azi.g);
        ((LpaManagementViewModel) getMViewModel()).getProfilesLiveData().observe(getViewLifecycleOwner(), new LpaManagementFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vue
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LpaManagementFragment.onViewCreated$lambda$0(this.f37233a, (List) obj);
            }
        }));
        ((LpaManagementViewModel) getMViewModel()).getEuiccLiveData().observe(getViewLifecycleOwner(), new LpaManagementFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wue
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LpaManagementFragment.onViewCreated$lambda$1(this.f38362a, (fve) obj);
            }
        }));
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(9, this.curDataHandler);
        ((LpaManagementViewModel) getMViewModel()).addDeviceStatusListener();
        ((LpaManagementViewModel) getMViewModel()).getDisconnectLiveData().observe(getViewLifecycleOwner(), new LpaManagementFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xue
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LpaManagementFragment.onViewCreated$lambda$2(this.f39479a, (Boolean) obj);
            }
        }));
        String string = getString(azi.p, "https://watch.iot.mi.com/html/esim/index.html?locale=" + LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null) + "#/faq.md");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CharSequence charSequenceClickSpannable$default = StringExtKt.clickSpannable$default(string, null, zki.f41403a, 0, new Function2() { // from class: yue
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LpaManagementFragment.onViewCreated$lambda$3((String) obj, (String) obj2);
            }
        }, 5, null);
        getMBinding().R.setMovementMethod(LinkMovementMethod.getInstance());
        getMBinding().R.setAutoLinkMask(1);
        getMBinding().R.setHighlightColor(0);
        getMBinding().R.setText(charSequenceClickSpannable$default);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().V.setOnClickListener(new View.OnClickListener() { // from class: pue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaManagementFragment.setListener$lambda$4(this.f30790a, view);
            }
        });
        getMBinding().T.setOnClickListener(new View.OnClickListener() { // from class: que
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaManagementFragment.setListener$lambda$5(this.f31855a, view);
            }
        });
        getMBinding().U.setOnClickListener(new View.OnClickListener() { // from class: rue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaManagementFragment.setListener$lambda$6(this.f32911a, view);
            }
        });
        getMBinding().F.setOnClickListener(new View.OnClickListener() { // from class: sue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaManagementFragment.setListener$lambda$7(this.f33995a, view);
            }
        });
        getMBinding().H.setOnClickListener(new View.OnClickListener() { // from class: tue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaManagementFragment.setListener$lambda$8(this.f35054a, view);
            }
        });
        getMBinding().G.setOnClickListener(new View.OnClickListener() { // from class: uue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaManagementFragment.setListener$lambda$9(this.f36153a, view);
            }
        });
    }
}
