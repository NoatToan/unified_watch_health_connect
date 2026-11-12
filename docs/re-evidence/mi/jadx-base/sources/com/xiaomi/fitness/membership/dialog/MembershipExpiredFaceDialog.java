package com.xiaomi.fitness.membership.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.membership.dialog.MembershipExpiredFaceDialog;
import com.xiaomi.fitness.membership.export.data.VipExpiredFaceConfig;
import com.xiaomi.fitness.membership.export.data.VipExpiredFaceData;
import com.xiaomi.fitness.membership.export.data.VipExpiredFaceItem;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import defpackage.oji;
import defpackage.qui;
import defpackage.sk5;
import defpackage.uof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b2\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\f¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/membership/dialog/MembershipExpiredFaceDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceData;", "data", "", "initFaceList", "(Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceData;)V", "setListener", "()V", "Lkotlin/Function0;", "login", "checkLogin", "(Lkotlin/jvm/functions/Function0;)V", "gotoVipCenter", "", "clickType", "trackDialogExposeOrClick", "(Z)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "", "TAG", "Ljava/lang/String;", "vipExpiredFaceData", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceData;", "Luof;", "mBinding", "Luof;", "dismissAction", "Lkotlin/jvm/functions/Function0;", "getDismissAction", "()Lkotlin/jvm/functions/Function0;", "setDismissAction", "<init>", "Companion", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMembershipExpiredFaceDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MembershipExpiredFaceDialog.kt\ncom/xiaomi/fitness/membership/dialog/MembershipExpiredFaceDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
public final class MembershipExpiredFaceDialog extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String TAG = "MembershipExpiredFaceDialog";

    @Nullable
    private Function0<Unit> dismissAction;
    private uof mBinding;

    @Nullable
    private VipExpiredFaceData vipExpiredFaceData;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/membership/dialog/MembershipExpiredFaceDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/xiaomi/fitness/membership/dialog/MembershipExpiredFaceDialog;", "checkVipExpiredFaceListData", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceData;", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MembershipExpiredFaceDialog newInstance(@Nullable VipExpiredFaceData checkVipExpiredFaceListData) {
            MembershipExpiredFaceDialog membershipExpiredFaceDialog = new MembershipExpiredFaceDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", checkVipExpiredFaceListData);
            membershipExpiredFaceDialog.setArguments(bundle);
            return membershipExpiredFaceDialog;
        }
    }

    private final void checkLogin(Function0<Unit> login) {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            login.invoke();
        } else if (fragmentActivity != null) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(fragmentActivity);
        }
    }

    private final void gotoVipCenter() {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(currentActivity, YRNConstants.APP_NAME, "dial/Membership", null);
        trackDialogExposeOrClick(true);
        dismiss();
    }

    private final void initFaceList(VipExpiredFaceData data) {
        ArrayList<VipExpiredFaceItem> watchfaceList;
        VipExpiredFaceConfig device_config;
        MembershipExpiredFaceAdapter membershipExpiredFaceAdapter = new MembershipExpiredFaceAdapter((data == null || (device_config = data.getDevice_config()) == null) ? 1 : device_config.getShape(), data != null ? data.getHasMore() : false);
        uof uofVar = this.mBinding;
        uof uofVar2 = null;
        if (uofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uofVar = null;
        }
        uofVar.C.setLayoutManager(new LinearLayoutManager(ApplicationExtKt.getApplication(), 0, false));
        uof uofVar3 = this.mBinding;
        if (uofVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uofVar2 = uofVar3;
        }
        uofVar2.C.setAdapter(membershipExpiredFaceAdapter);
        ArrayList<VipExpiredFaceItem> arrayList = new ArrayList<>();
        if (data != null && (watchfaceList = data.getWatchfaceList()) != null) {
            arrayList.addAll(watchfaceList);
        }
        if (data != null && data.getHasMore()) {
            arrayList.add(new VipExpiredFaceItem("", ""));
        }
        membershipExpiredFaceAdapter.setComboList(arrayList);
        trackDialogExposeOrClick(false);
    }

    private final void setListener() {
        uof uofVar = this.mBinding;
        uof uofVar2 = null;
        if (uofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uofVar = null;
        }
        ViewExtKt.clickWithTrigger$default(uofVar.D, 0L, new Function1() { // from class: mof
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MembershipExpiredFaceDialog.setListener$lambda$4(this.f27049a, (TextView) obj);
            }
        }, 1, null);
        uof uofVar3 = this.mBinding;
        if (uofVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uofVar2 = uofVar3;
        }
        ViewExtKt.clickWithTrigger$default(uofVar2.B, 0L, new Function1() { // from class: nof
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MembershipExpiredFaceDialog.setListener$lambda$5(this.f28200a, (ImageView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4(final MembershipExpiredFaceDialog this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.checkLogin(new Function0() { // from class: oof
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MembershipExpiredFaceDialog.setListener$lambda$4$lambda$3(this.f29338a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4$lambda$3(MembershipExpiredFaceDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoVipCenter();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$5(MembershipExpiredFaceDialog this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    private final void trackDialogExposeOrClick(boolean clickType) {
        String str;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        String autoPageTrackCurrentFragmentName = oneTrackExtKt.getAutoPageTrackCurrentFragmentName();
        Logger.i(this.TAG, "trackDialogExposeOrClick " + autoPageTrackCurrentFragmentName);
        String str2 = clickType ? "click_v3" : "expose_v3";
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.to("tip", clickType ? "56.71.1.1.29823" : "56.71.1.1.29821");
        pairArr[1] = TuplesKt.to("name", "overall_pop");
        pairArr[2] = TuplesKt.to("picture_name", "vip_end");
        pairArr[3] = TuplesKt.to("picture_id", "");
        pairArr[4] = TuplesKt.to("url", "");
        if (autoPageTrackCurrentFragmentName != null) {
            switch (autoPageTrackCurrentFragmentName) {
                case "com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragment":
                    str = "device_tab_page";
                    break;
                case "com.xiaomi.fitness.watch.face.market.DeviceFaceMarketFragment":
                    str = "watchface_page";
                    break;
                case "com.xiaomi.fitness.mine.MineFragment":
                    str = "profile_tab_page";
                    break;
                case "com.xiaomi.fitness.sport.sporttab.SportTabV4Fragment":
                    str = "workout_tab_page";
                    break;
                case "com.xiaomi.fitness.watch.face.FaceMeFragment":
                case "com.xiaomi.fitness.watch.face.FaceFragment":
                    str = "watchface_page";
                    break;
                default:
                    str = "status_tab_page";
                    break;
            }
        } else {
            str = "status_tab_page";
        }
        pairArr[5] = TuplesKt.to("source", str);
        oneTrackExtKt.reportData(str2, MapsKt__MapsKt.mapOf(pairArr));
    }

    @Nullable
    public final Function0<Unit> getDismissAction() {
        return this.dismissAction;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        uof uofVar = (uof) sk5.j(inflater, qui.f31859b, container, false);
        this.mBinding = uofVar;
        if (uofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uofVar = null;
        }
        return uofVar.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        Function0<Unit> function0 = this.dismissAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("data", this.vipExpiredFaceData);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            savedInstanceState = getArguments();
        }
        if (savedInstanceState != null) {
            this.vipExpiredFaceData = (VipExpiredFaceData) savedInstanceState.getParcelable("data");
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawableResource(oji.c);
            window.setLayout(-1, -1);
            window.setFlags(2, 2);
            window.getAttributes().dimAmount = 0.5f;
        }
        initFaceList(this.vipExpiredFaceData);
        setListener();
    }

    public final void setDismissAction(@Nullable Function0<Unit> function0) {
        this.dismissAction = function0;
    }
}
