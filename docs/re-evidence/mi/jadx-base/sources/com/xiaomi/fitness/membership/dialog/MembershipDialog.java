package com.xiaomi.fitness.membership.dialog;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.android.material.imageview.ShapeableImageView;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.common.net.NetConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.membership.constant.MembershipStatusConstantKt;
import com.xiaomi.fitness.membership.dialog.MembershipDialog;
import com.xiaomi.fitness.membership.export.data.Membership;
import com.xiaomi.fitness.membership.export.data.MembershipConfig;
import com.xiaomi.fitness.membership.export.data.Promotion;
import com.xiaomi.fitness.membership.export.data.VipConfigInfo;
import com.xiaomi.fitness.membership.util.MembershipPreference;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.PaymentProgressDefaultListener;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.MibiPayResult;
import com.xiaomi.fitness.pay.export.data.response.OrderInfo;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import defpackage.apf;
import defpackage.av6;
import defpackage.k0j;
import defpackage.oji;
import defpackage.qui;
import defpackage.sk5;
import defpackage.wof;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 N2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\bM\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u001b\u0010\u0016\u001a\u00020\b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\nJ\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\nJ\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010#J!\u0010+\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J-\u00101\u001a\u0004\u0018\u00010'2\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\b2\u0006\u00103\u001a\u00020)H\u0016¢\u0006\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010K¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/membership/dialog/MembershipDialog;", "Landroidx/fragment/app/DialogFragment;", "", "time1", "time2", "", "isSameDay", "(JJ)Z", "", "initConfig", "()V", "initComboList", "", "name", "trackSKUClick", "(Ljava/lang/String;)V", "subscribe", "initPrivacy", "(Z)V", "setListener", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "payDialog", "handleClosePayDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "showAgreeDialog", "", StatConstants.PARAM_END, "startTimer", "(I)V", "endTimeMillis", "startCountDown", "(J)V", "onTimeUp", "stopTimer", "getUrl", "()Ljava/lang/String;", "getUrlHost", "getPrivacyUrl", "getDeductUrl", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", q.f13857a, "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", "", "Lcom/xiaomi/fitness/membership/export/data/Membership;", "comboList", "Ljava/util/List;", "contentSource", "Ljava/lang/String;", "Lwof;", "mBinding", "Lwof;", CommonConstants.KEY_AGREE, "Z", "selectCombo", "Lcom/xiaomi/fitness/membership/export/data/Membership;", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "currentOrder", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "Landroid/os/CountDownTimer;", "countDownTimer", "Landroid/os/CountDownTimer;", "alignTimer", "<init>", "Companion", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMembershipDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MembershipDialog.kt\ncom/xiaomi/fitness/membership/dialog/MembershipDialog\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,481:1\n54#2,3:482\n24#2:485\n59#2,6:486\n54#2,3:492\n24#2:495\n57#2,6:496\n63#2,2:503\n57#3:502\n*S KotlinDebug\n*F\n+ 1 MembershipDialog.kt\ncom/xiaomi/fitness/membership/dialog/MembershipDialog\n*L\n109#1:482,3\n109#1:485\n109#1:486,6\n129#1:492,3\n129#1:495\n129#1:496,6\n129#1:503,2\n129#1:502\n*E\n"})
public final class MembershipDialog extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String TAG = "MembershipDialog";
    private boolean agree;

    @Nullable
    private CountDownTimer alignTimer;

    @Nullable
    private List<Membership> comboList;

    @Nullable
    private VipConfigInfo config;

    @NotNull
    private String contentSource = "";

    @Nullable
    private CountDownTimer countDownTimer;

    @Nullable
    private OrderInfo currentOrder;
    private wof mBinding;

    @Nullable
    private Membership selectCombo;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/membership/dialog/MembershipDialog$Companion;", "", "<init>", "()V", "HOST_OPERATION", "", "TAG", "newInstance", "Lcom/xiaomi/fitness/membership/dialog/MembershipDialog;", "configInfo", "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", "comboList", "", "Lcom/xiaomi/fitness/membership/export/data/Membership;", "contentSource", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MembershipDialog newInstance(@NotNull VipConfigInfo configInfo, @NotNull List<Membership> comboList, @NotNull String contentSource) {
            Intrinsics.checkNotNullParameter(configInfo, "configInfo");
            Intrinsics.checkNotNullParameter(comboList, "comboList");
            Intrinsics.checkNotNullParameter(contentSource, "contentSource");
            MembershipDialog membershipDialog = new MembershipDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable(q.f13857a, configInfo);
            bundle.putParcelableArrayList("combo_list", new ArrayList<>(comboList));
            bundle.putString("content_source", contentSource);
            membershipDialog.setArguments(bundle);
            return membershipDialog;
        }
    }

    private final String getDeductUrl() {
        String urlHost = getUrlHost();
        String currentLocale = LocaleUtil.getCurrentLocale();
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return urlHost + "/html/privacy/index.html?type=membership-renewal&model=app&locale=" + currentLocale + "&region=" + lowerCase;
    }

    private final String getPrivacyUrl() {
        return getUrlHost() + "/html/privacy/index.html?type=membership&model=app&locale=" + LocaleUtil.getCurrentLocale();
    }

    private final String getUrl() {
        String str = "https://cdn.cnbj1.fds.api.mi-img.com";
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging()) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) "https://cdn.cnbj1.fds.api.mi-img.com", "://", 0, false, 6, (Object) null) + 3;
            String strSubstring = "https://cdn.cnbj1.fds.api.mi-img.com".substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = "https://cdn.cnbj1.fds.api.mi-img.com".substring(iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            str = strSubstring + "staging-" + strSubstring2;
        }
        RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        return str + "/hlth-client-assets/components/" + (UIUtils.isNightMode(ApplicationExtKt.getApplication()) ? "membership/member_cover_dark" : "membership/member_cover") + ".png";
    }

    private final String getUrlHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{""}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{lowerCase + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleClosePayDialog(final CommonDialog<?> payDialog) {
        MembershipConfig member;
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.126.1.1.43598"), TuplesKt.to("name", "detain_pop"), TuplesKt.to("source", this.contentSource)));
        apf apfVarA0 = apf.A0(LayoutInflater.from(ApplicationExtKt.getApplication()));
        Intrinsics.checkNotNullExpressionValue(apfVarA0, "inflate(...)");
        final CommonDialog commonDialogCreate = new CommonDialog.c("").setCustomView(apfVarA0.getRoot()).create();
        TextView textView = apfVarA0.F;
        VipConfigInfo vipConfigInfo = this.config;
        textView.setText((vipConfigInfo == null || (member = vipConfigInfo.getMember()) == null) ? null : member.getTitle());
        apfVarA0.D.setOnClickListener(new View.OnClickListener() { // from class: fof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipDialog.handleClosePayDialog$lambda$9(payDialog, commonDialogCreate, this, view);
            }
        });
        apfVarA0.E.setOnClickListener(new View.OnClickListener() { // from class: gof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipDialog.handleClosePayDialog$lambda$10(commonDialogCreate, this, view);
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
        MembershipPreference.INSTANCE.setLAST_RETENTION_TIME(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClosePayDialog$lambda$10(CommonDialog commonDialog, MembershipDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        commonDialog.dismiss();
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.126.1.1.43597"), TuplesKt.to("name", "detain_pop"), TuplesKt.to("source", this$0.contentSource), TuplesKt.to("btn_name", "stay")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClosePayDialog$lambda$9(CommonDialog payDialog, CommonDialog commonDialog, MembershipDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(payDialog, "$payDialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        payDialog.dismiss();
        commonDialog.dismiss();
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.126.1.1.43597"), TuplesKt.to("name", "detain_pop"), TuplesKt.to("source", this$0.contentSource), TuplesKt.to("btn_name", BroadcastsKt.SILENT_PUSHING_CANCEL)));
    }

    private final void initComboList() {
        MembershipDialogAdapter membershipDialogAdapter = new MembershipDialogAdapter(new Function1() { // from class: jof
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MembershipDialog.initComboList$lambda$4(this.f22976a, (Membership) obj);
            }
        });
        List<Membership> listEmptyList = this.comboList;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        membershipDialogAdapter.setComboList(listEmptyList);
        wof wofVar = this.mBinding;
        wof wofVar2 = null;
        if (wofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wofVar = null;
        }
        wofVar.C.setLayoutManager(new LinearLayoutManager(ApplicationExtKt.getApplication(), 0, false));
        wof wofVar3 = this.mBinding;
        if (wofVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            wofVar2 = wofVar3;
        }
        wofVar2.C.setAdapter(membershipDialogAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initComboList$lambda$4(MembershipDialog this$0, Membership it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.trackSKUClick(it.getName());
        this$0.selectCombo = it;
        this$0.initPrivacy(it.getSubscription());
        wof wofVar = this$0.mBinding;
        wof wofVar2 = null;
        if (wofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wofVar = null;
        }
        wofVar.F.setText(it.getDescription());
        Promotion promotion = it.getPromotion();
        if (promotion != null) {
            wof wofVar3 = this$0.mBinding;
            if (wofVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                wofVar3 = null;
            }
            wofVar3.H.setText(this$0.getString(k0j.d, Float.valueOf(promotion.getPrice() / 100.0f)));
            wof wofVar4 = this$0.mBinding;
            if (wofVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                wofVar4 = null;
            }
            ConstraintLayout promotionBg = wofVar4.K;
            Intrinsics.checkNotNullExpressionValue(promotionBg, "promotionBg");
            ViewExtKt.visible(promotionBg);
            wof wofVar5 = this$0.mBinding;
            if (wofVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                wofVar5 = null;
            }
            wofVar5.N.setText(promotion.getSlogan());
            String icon = promotion.getIcon();
            if (icon == null || icon.length() == 0) {
                wof wofVar6 = this$0.mBinding;
                if (wofVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    wofVar6 = null;
                }
                ImageView promotionIcon = wofVar6.M;
                Intrinsics.checkNotNullExpressionValue(promotionIcon, "promotionIcon");
                ViewExtKt.gone(promotionIcon);
            } else {
                wof wofVar7 = this$0.mBinding;
                if (wofVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    wofVar7 = null;
                }
                ImageView promotionIcon2 = wofVar7.M;
                Intrinsics.checkNotNullExpressionValue(promotionIcon2, "promotionIcon");
                ViewExtKt.visible(promotionIcon2);
                wof wofVar8 = this$0.mBinding;
                if (wofVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    wofVar8 = null;
                }
                ImageView promotionIcon3 = wofVar8.M;
                Intrinsics.checkNotNullExpressionValue(promotionIcon3, "promotionIcon");
                Coil.imageLoader(promotionIcon3.getContext()).enqueue(new ImageRequest.Builder(promotionIcon3.getContext()).data(promotion.getIcon()).target(promotionIcon3).build());
            }
            if (promotion.getEndAt() == 0 || !promotion.getDowncount()) {
                this$0.onTimeUp();
                wof wofVar9 = this$0.mBinding;
                if (wofVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    wofVar2 = wofVar9;
                }
                TextView promotionCountdown = wofVar2.L;
                Intrinsics.checkNotNullExpressionValue(promotionCountdown, "promotionCountdown");
                ViewExtKt.gone(promotionCountdown);
            } else {
                wof wofVar10 = this$0.mBinding;
                if (wofVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    wofVar2 = wofVar10;
                }
                TextView promotionCountdown2 = wofVar2.L;
                Intrinsics.checkNotNullExpressionValue(promotionCountdown2, "promotionCountdown");
                ViewExtKt.visible(promotionCountdown2);
                this$0.startTimer(promotion.getEndAt());
            }
        } else {
            wof wofVar11 = this$0.mBinding;
            if (wofVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                wofVar11 = null;
            }
            wofVar11.H.setText(this$0.getString(k0j.d, Float.valueOf(it.getPrice() / 100.0f)));
            wof wofVar12 = this$0.mBinding;
            if (wofVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                wofVar2 = wofVar12;
            }
            ConstraintLayout promotionBg2 = wofVar2.K;
            Intrinsics.checkNotNullExpressionValue(promotionBg2, "promotionBg");
            ViewExtKt.gone(promotionBg2);
        }
        return Unit.INSTANCE;
    }

    private final void initConfig() {
        MembershipConfig member;
        MembershipConfig member2;
        wof wofVar = this.mBinding;
        wof wofVar2 = null;
        if (wofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wofVar = null;
        }
        TextView textView = wofVar.Q;
        VipConfigInfo vipConfigInfo = this.config;
        textView.setText((vipConfigInfo == null || (member2 = vipConfigInfo.getMember()) == null) ? null : member2.getTitle());
        wof wofVar3 = this.mBinding;
        if (wofVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wofVar3 = null;
        }
        TextView textView2 = wofVar3.P;
        VipConfigInfo vipConfigInfo2 = this.config;
        textView2.setText((vipConfigInfo2 == null || (member = vipConfigInfo2.getMember()) == null) ? null : member.getSubTitle());
        wof wofVar4 = this.mBinding;
        if (wofVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            wofVar2 = wofVar4;
        }
        ShapeableImageView cover = wofVar2.E;
        Intrinsics.checkNotNullExpressionValue(cover, "cover");
        String url = getUrl();
        ImageLoader imageLoader = Coil.imageLoader(cover.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(cover.getContext()).data(url).target(cover);
        builderTarget.addHeader(NetConstants.COOKIE, "auth_key=rwelJuWBFJxmbMKD");
        imageLoader.enqueue(builderTarget.build());
    }

    private final void initPrivacy(boolean subscribe) {
        Spannable spannableA = subscribe ? LinkSpanHelper.a(ApplicationExtKt.getApplication(), getString(k0j.f, getPrivacyUrl(), getDeductUrl()), Integer.valueOf(oji.f29220a), new LinkSpanHelper.a() { // from class: cof
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                MembershipDialog.initPrivacy$lambda$5(view, str);
            }
        }) : LinkSpanHelper.a(ApplicationExtKt.getApplication(), ApplicationExtKt.getApplication().getString(k0j.e, getPrivacyUrl()), Integer.valueOf(oji.f29220a), new LinkSpanHelper.a() { // from class: dof
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                MembershipDialog.initPrivacy$lambda$6(view, str);
            }
        });
        wof wofVar = this.mBinding;
        wof wofVar2 = null;
        if (wofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wofVar = null;
        }
        wofVar.I.setMovementMethod(LinkMovementMethod.getInstance());
        wof wofVar3 = this.mBinding;
        if (wofVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            wofVar2 = wofVar3;
        }
        wofVar2.I.setText(spannableA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPrivacy$lambda$5(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPrivacy$lambda$6(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSameDay(long time1, long time2) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        Calendar calendar2 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar2, "getInstance(...)");
        calendar.setTimeInMillis(time1);
        calendar2.setTimeInMillis(time2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimeUp() {
        stopTimer();
        wof wofVar = this.mBinding;
        if (wofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wofVar = null;
        }
        ConstraintLayout promotionBg = wofVar.K;
        Intrinsics.checkNotNullExpressionValue(promotionBg, "promotionBg");
        ViewExtKt.gone(promotionBg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(MembershipDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    private final void setListener() {
        wof wofVar = this.mBinding;
        wof wofVar2 = null;
        if (wofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wofVar = null;
        }
        wofVar.A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hof
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MembershipDialog.setListener$lambda$7(this.f20291a, compoundButton, z);
            }
        });
        wof wofVar3 = this.mBinding;
        if (wofVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            wofVar2 = wofVar3;
        }
        ViewExtKt.clickWithTrigger$default(wofVar2.H, 0L, new Function1() { // from class: iof
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MembershipDialog.setListener$lambda$8(this.f21945a, (TextView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(MembershipDialog this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.agree = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$8(final MembershipDialog this$0, TextView it) {
        int price;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        z = false;
        boolean z = false;
        if (!this$0.agree) {
            Membership membership = this$0.selectCombo;
            if (membership != null && membership.getSubscription()) {
                z = true;
            }
            this$0.showAgreeDialog(z);
            return Unit.INSTANCE;
        }
        if (this$0.selectCombo == null) {
            return Unit.INSTANCE;
        }
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null) {
            return Unit.INSTANCE;
        }
        Membership membership2 = this$0.selectCombo;
        Intrinsics.checkNotNull(membership2);
        if (membership2.getPromotion() == null) {
            Membership membership3 = this$0.selectCombo;
            Intrinsics.checkNotNull(membership3);
            price = membership3.getPrice();
        } else {
            Membership membership4 = this$0.selectCombo;
            Intrinsics.checkNotNull(membership4);
            Promotion promotion = membership4.getPromotion();
            Intrinsics.checkNotNull(promotion);
            price = promotion.getPrice();
        }
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair pair = TuplesKt.to("tip", "56.122.1.1.43498");
        Pair pair2 = TuplesKt.to("name", "member_center_pop_up");
        Membership membership5 = this$0.selectCombo;
        Intrinsics.checkNotNull(membership5);
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pair, pair2, TuplesKt.to(OneTrack.Param.ASSET_NAME, membership5.getName()), TuplesKt.to("source", this$0.contentSource), TuplesKt.to("detail", fragmentActivity.getClass().getName())));
        PaymentManager.Companion companion = PaymentManager.INSTANCE;
        PaymentManager payManagerExtKt = PayManagerExtKt.getInstance(companion);
        Membership membership6 = this$0.selectCombo;
        Intrinsics.checkNotNull(membership6);
        String spuId = membership6.getSpuId();
        Membership membership7 = this$0.selectCombo;
        Intrinsics.checkNotNull(membership7);
        Integer numValueOf = Integer.valueOf(membership7.getSpuVersion());
        Membership membership8 = this$0.selectCombo;
        Intrinsics.checkNotNull(membership8);
        SkuObject skuObjectBuildSkuObject$default = PaymentManager.DefaultImpls.buildSkuObject$default(payManagerExtKt, spuId, numValueOf, membership8.getId(), Long.valueOf(price), 0L, null, null, 112, null);
        PaymentManager payManagerExtKt2 = PayManagerExtKt.getInstance(companion);
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(skuObjectBuildSkuObject$default);
        Membership membership9 = this$0.selectCombo;
        Intrinsics.checkNotNull(membership9);
        Promotion promotion2 = membership9.getPromotion();
        int id = promotion2 != null ? promotion2.getId() : 0;
        Membership membership10 = this$0.selectCombo;
        Intrinsics.checkNotNull(membership10);
        PaymentManager.DefaultImpls.intentToPay$default(payManagerExtKt2, fragmentActivity, listListOf, id, membership10.getSubscription(), false, false, false, 0, this$0.contentSource, null, new PaymentProgressDefaultListener() { // from class: com.xiaomi.fitness.membership.dialog.MembershipDialog$setListener$2$1
            @Override // com.xiaomi.fitness.pay.export.PaymentProgressDefaultListener, com.xiaomi.fitness.pay.export.PaymentProgressListener
            public boolean onClose(CommonDialog<?> dialog) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onClose(dialog);
                if (this.this$0.isSameDay(System.currentTimeMillis(), MembershipPreference.INSTANCE.getLAST_RETENTION_TIME())) {
                    return false;
                }
                this.this$0.handleClosePayDialog(dialog);
                return true;
            }

            @Override // com.xiaomi.fitness.pay.export.PaymentProgressDefaultListener, com.xiaomi.fitness.pay.export.PaymentProgressListener
            public void onCreateOrder(OrderInfo orderInfo) {
                Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
                super.onCreateOrder(orderInfo);
                this.this$0.currentOrder = orderInfo;
                IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                Pair[] pairArr = new Pair[5];
                pairArr[0] = TuplesKt.to("tip", "56.124.1.1.43510");
                pairArr[1] = TuplesKt.to("name", "member_order_creation");
                pairArr[2] = TuplesKt.to("content_source", this.this$0.contentSource);
                pairArr[3] = TuplesKt.to("order_id", orderInfo.getOrder_id());
                SkuObject skuObject = (SkuObject) CollectionsKt___CollectionsKt.getOrNull(orderInfo.getSku_list(), 0);
                pairArr[4] = TuplesKt.to("type_sku", skuObject != null ? skuObject.getSku_name() : null);
                oneTrackExtKt2.reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.mapOf(pairArr));
            }

            @Override // com.xiaomi.fitness.pay.export.PaymentProgressDefaultListener, com.xiaomi.fitness.pay.export.PaymentProgressListener
            public void onOrderFinish(boolean success) {
                super.onOrderFinish(success);
                Logger.i("MembershipDialog", "onOrderFinish: " + success);
                if (success) {
                    Application application = ApplicationExtKt.getApplication();
                    Intent intent = new Intent(MembershipStatusConstantKt.ACTION_MEMBERSHIP_PAY_ACTION);
                    intent.putExtra(MembershipStatusConstantKt.ACTION_MEMBERSHIP_PAY_RESULT, true);
                    application.sendBroadcast(intent);
                    this.this$0.dismiss();
                    YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).sendJSEvent("WEAR_VIP_STATUS_CHANGE", null);
                }
            }

            @Override // com.xiaomi.fitness.pay.export.PaymentProgressDefaultListener, com.xiaomi.fitness.pay.export.PaymentProgressListener
            public void onPayChannel(boolean success, String errorMsg, MibiPayResult result) {
                List<SkuObject> sku_list;
                SkuObject skuObject;
                super.onPayChannel(success, errorMsg, result);
                if (success) {
                    IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = TuplesKt.to("tip", "56.124.1.1.43518");
                    pairArr[1] = TuplesKt.to("name", "member_order_succeed");
                    OrderInfo orderInfo = this.this$0.currentOrder;
                    pairArr[2] = TuplesKt.to("order_id", orderInfo != null ? orderInfo.getOrder_id() : null);
                    OrderInfo orderInfo2 = this.this$0.currentOrder;
                    pairArr[3] = TuplesKt.to("type_sku", (orderInfo2 == null || (sku_list = orderInfo2.getSku_list()) == null || (skuObject = (SkuObject) CollectionsKt___CollectionsKt.getOrNull(sku_list, 0)) == null) ? null : skuObject.getSku_name());
                    OrderInfo orderInfo3 = this.this$0.currentOrder;
                    pairArr[4] = TuplesKt.to(Constants.KEY_PRICE, orderInfo3 != null ? Integer.valueOf(orderInfo3.getPay_fee()) : null);
                    oneTrackExtKt2.reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.mapOf(pairArr));
                }
            }
        }, 752, null);
        return Unit.INSTANCE;
    }

    private final void showAgreeDialog(boolean subscribe) {
        String string = subscribe ? getString(k0j.f, getPrivacyUrl(), getDeductUrl()) : getString(k0j.e, getPrivacyUrl());
        Intrinsics.checkNotNull(string);
        new CommonDialog.c("membership_agree").setDialogTitle(k0j.c).setDialogDescriptionString(new DialogParams.DialogDescriptionString(LinkSpanHelper.a(requireContext(), string, Integer.valueOf(oji.f29220a), new LinkSpanHelper.a() { // from class: bof
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                MembershipDialog.showAgreeDialog$lambda$11(view, str);
            }
        }))).setPositiveText(k0j.f23301b).setNegativeText(k0j.f23300a).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.membership.dialog.MembershipDialog.showAgreeDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    MembershipDialog.this.agree = true;
                    wof wofVar = MembershipDialog.this.mBinding;
                    wof wofVar2 = null;
                    if (wofVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        wofVar = null;
                    }
                    wofVar.A.setChecked(true);
                    wof wofVar3 = MembershipDialog.this.mBinding;
                    if (wofVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        wofVar2 = wofVar3;
                    }
                    wofVar2.H.performClick();
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAgreeDialog$lambda$11(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCountDown(long endTimeMillis) {
        this.countDownTimer = new CountDownTimer(endTimeMillis - System.currentTimeMillis(), 1000L) { // from class: com.xiaomi.fitness.membership.dialog.MembershipDialog.startCountDown.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.onTimeUp();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                String durationStrHour = TimeDateUtil.INSTANCE.getDurationStrHour(millisUntilFinished);
                wof wofVar = this.mBinding;
                if (wofVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    wofVar = null;
                }
                wofVar.L.setText(durationStrHour);
            }
        }.start();
    }

    private final void startTimer(int end) {
        stopTimer();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = ((long) end) * 1000;
        if (j - jCurrentTimeMillis <= 0) {
            onTimeUp();
        } else {
            long j2 = 1000;
            this.alignTimer = new CountDownTimer(j2 - (jCurrentTimeMillis % j2), this, j) { // from class: com.xiaomi.fitness.membership.dialog.MembershipDialog.startTimer.1
                final /* synthetic */ long $endTimeMills;
                final /* synthetic */ MembershipDialog this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(j, j);
                    this.this$0 = this;
                    this.$endTimeMills = j;
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    this.this$0.startCountDown(this.$endTimeMills);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long millisUntilFinished) {
                }
            }.start();
        }
    }

    private final void stopTimer() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.countDownTimer = null;
        CountDownTimer countDownTimer2 = this.alignTimer;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.alignTimer = null;
    }

    private final void trackSKUClick(String name) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.122.1.1.43488"), TuplesKt.to("name", name)));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        wof wofVar = (wof) sk5.j(inflater, qui.c, container, false);
        this.mBinding = wofVar;
        if (wofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wofVar = null;
        }
        return wofVar.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable(q.f13857a, this.config);
        outState.putParcelableArrayList("combo_list", ListExtKt.toArrayList(this.comboList));
        outState.putString("content_source", this.contentSource);
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
            this.config = (VipConfigInfo) savedInstanceState.getParcelable(q.f13857a);
            this.comboList = savedInstanceState.getParcelableArrayList("combo_list");
            String string = savedInstanceState.getString("content_source");
            if (string == null) {
                string = "";
            }
            this.contentSource = string;
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setFlags(2, 2);
            window.getAttributes().dimAmount = 0.5f;
        }
        initConfig();
        initComboList();
        setListener();
        wof wofVar = this.mBinding;
        if (wofVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wofVar = null;
        }
        wofVar.B.setOnClickListener(new View.OnClickListener() { // from class: eof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MembershipDialog.onViewCreated$lambda$2(this.f16881a, view2);
            }
        });
    }
}
