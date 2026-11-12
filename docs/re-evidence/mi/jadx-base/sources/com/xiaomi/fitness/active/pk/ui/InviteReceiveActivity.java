package com.xiaomi.fitness.active.pk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.active.pk.ActivePkViewModel;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.active.pk.net.model.DailyGoalItem;
import com.xiaomi.fitness.active.pk.net.model.GetInviteRecordUserDetailResult;
import com.xiaomi.fitness.active.pk.net.model.InviteRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity;
import com.xiaomi.fitness.active.pk.util.ActiveGoalUtils;
import com.xiaomi.fitness.active.pk.util.BusinessFailDealUtil;
import com.xiaomi.fitness.active.pk.util.ImageUtils;
import com.xiaomi.fitness.active.pk.util.LaunchExtKt;
import com.xiaomi.fitness.active.pk.util.PkLogger;
import com.xiaomi.fitness.active.pk.util.SynDialogHelper;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.mine.export.IWebSyncImpl;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.bui;
import defpackage.fni;
import defpackage.hxh;
import defpackage.ozi;
import defpackage.ryh;
import defpackage.yv1;
import defpackage.zii;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0007¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001a\u0010\u0006R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0014\u0010)\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010#¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/InviteReceiveActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/active/pk/ActivePkViewModel;", "Lhxh;", "", "initIntentParams", "()V", "initBottomAction", "dealAcceptClick", "refreshUserInfo", "initRainbowAndGenderView", "Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;", "inviteRecordDetail", "refreshUserDataInfo", "(Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;)V", "", "isOwn", "", "Lcom/xiaomi/fitness/active/pk/net/model/DailyGoalItem;", "goalList", "refreshActiveGoal", "(ZLjava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", PkConstants.PARAM_INVITE_ID, "J", PkConstants.PARAM_INVITER_UID, "", "source", "I", "getSource", "()I", "setSource", "(I)V", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nInviteReceiveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InviteReceiveActivity.kt\ncom/xiaomi/fitness/active/pk/ui/InviteReceiveActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,279:1\n1863#2,2:280\n*S KotlinDebug\n*F\n+ 1 InviteReceiveActivity.kt\ncom/xiaomi/fitness/active/pk/ui/InviteReceiveActivity\n*L\n263#1:280,2\n*E\n"})
public final class InviteReceiveActivity extends Hilt_InviteReceiveActivity<ActivePkViewModel, hxh> {
    public static final int DEFAULT_SOURCE = 1;

    @NotNull
    public static final String TAG = "InviteReceiveAct";
    public static final long VALID_ID = -1;
    private long inviteId = -1;
    private long inviterUid = -1;
    private int source = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hxh access$getMBinding(InviteReceiveActivity inviteReceiveActivity) {
        return (hxh) inviteReceiveActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ActivePkViewModel access$getMViewModel(InviteReceiveActivity inviteReceiveActivity) {
        return (ActivePkViewModel) inviteReceiveActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dealAcceptClick() {
        ((hxh) getMBinding()).J.setEnabled(false);
        SynDialogHelper.INSTANCE.showSyncDialogIfNeed(this, new IWebSyncImpl() { // from class: com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity.dealAcceptClick.1
            @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
            public void onWebSyncAccepted() {
                super.onWebSyncAccepted();
                ActivePkViewModel activePkViewModelAccess$getMViewModel = InviteReceiveActivity.access$getMViewModel(InviteReceiveActivity.this);
                Long lValueOf = InviteReceiveActivity.this.inviteId <= 0 ? null : Long.valueOf(InviteReceiveActivity.this.inviteId);
                Long lValueOf2 = InviteReceiveActivity.this.inviterUid > 0 ? Long.valueOf(InviteReceiveActivity.this.inviterUid) : null;
                final InviteReceiveActivity inviteReceiveActivity = InviteReceiveActivity.this;
                Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity$dealAcceptClick$1$onWebSyncAccepted$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(Integer num) {
                        invoke(num.intValue());
                        return Unit.INSTANCE;
                    }

                    public void invoke(int p1) {
                        inviteReceiveActivity.startActivity(new Intent(inviteReceiveActivity, (Class<?>) PkListActivity.class));
                        InviteReceiveActivity inviteReceiveActivity2 = inviteReceiveActivity;
                        String string = inviteReceiveActivity2.getString(ozi.g);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        ToastExtKt.toastLong(inviteReceiveActivity2, string);
                        inviteReceiveActivity.finish();
                    }
                };
                final InviteReceiveActivity inviteReceiveActivity2 = InviteReceiveActivity.this;
                activePkViewModelAccess$getMViewModel.acceptOrRejectInvite(lValueOf, lValueOf2, true, function1, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity$dealAcceptClick$1$onWebSyncAccepted$2
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                        invoke2(apiException);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public void invoke2(ApiException p1) {
                        Intrinsics.checkNotNullParameter(p1, "p1");
                        InviteReceiveActivity.access$getMBinding(inviteReceiveActivity2).J.setEnabled(true);
                        BusinessFailDealUtil.INSTANCE.dealAcceptOrRejectInviteFail(inviteReceiveActivity2, p1);
                    }
                });
            }

            @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
            public void onWebSyncDenied() {
                super.onWebSyncDenied();
                InviteReceiveActivity.access$getMBinding(InviteReceiveActivity.this).J.setEnabled(true);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBottomAction() {
        ((hxh) getMBinding()).A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: shd
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                InviteReceiveActivity.initBottomAction$lambda$0(this.f33639a, compoundButton, z);
            }
        });
        ((hxh) getMBinding()).J.setOnClickListener(new View.OnClickListener() { // from class: thd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteReceiveActivity.initBottomAction$lambda$1(this.f34705a, view);
            }
        });
        ((hxh) getMBinding()).M.setOnClickListener(new View.OnClickListener() { // from class: uhd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteReceiveActivity.initBottomAction$lambda$2(this.f35758a, view);
            }
        });
        String string = getString(ozi.l);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(ozi.U, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SpannableString spannableString = new SpannableString(string2);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string2, string, 0, false, 6, (Object) null);
        spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity.initBottomAction.4
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                InviteReceiveActivity.this.startActivity(new Intent(InviteReceiveActivity.this, (Class<?>) PkRuleActivity.class));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
                ds.setColor(ResourceExtKt.getResourceColor(InviteReceiveActivity.this, zii.f41317a));
                ds.setFakeBoldText(false);
            }
        }, iIndexOf$default, string.length() + iIndexOf$default, 17);
        ((hxh) getMBinding()).N.setMovementMethod(LinkMovementMethod.getInstance());
        ((hxh) getMBinding()).N.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initBottomAction$lambda$0(InviteReceiveActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((hxh) this$0.getMBinding()).J.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBottomAction$lambda$1(InviteReceiveActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dealAcceptClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initBottomAction$lambda$2(final InviteReceiveActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((hxh) this$0.getMBinding()).M.setEnabled(false);
        ActivePkViewModel activePkViewModel = (ActivePkViewModel) this$0.getMViewModel();
        long j = this$0.inviteId;
        Long lValueOf = j <= 0 ? null : Long.valueOf(j);
        long j2 = this$0.inviterUid;
        activePkViewModel.acceptOrRejectInvite(lValueOf, j2 <= 0 ? null : Long.valueOf(j2), false, new Function1<Integer, Unit>() { // from class: com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity$initBottomAction$3$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(int p1) {
                if (this.this$0.isTaskRoot()) {
                    LaunchExtKt.stateLaunchActivity(this.this$0);
                }
                this.this$0.finish();
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity$initBottomAction$3$2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(ApiException p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                InviteReceiveActivity.access$getMBinding(this.this$0).M.setEnabled(true);
                BusinessFailDealUtil.INSTANCE.dealAcceptOrRejectInviteFail(this.this$0, p1);
            }
        });
    }

    private final void initIntentParams() {
        this.inviteId = getIntent().getLongExtra(PkConstants.PARAM_INVITE_ID, -1L);
        this.source = getIntent().getIntExtra("source", -1);
        long longExtra = getIntent().getLongExtra(PkConstants.PARAM_INVITER_UID, -1L);
        this.inviterUid = longExtra;
        PkLogger.INSTANCE.i(TAG, "inviteId from intent is " + this.inviteId + ", source is " + this.source + " inviterUid is " + longExtra, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRainbowAndGenderView() {
        ActivePkViewModel.getDefaultActiveGoalLiveData$default((ActivePkViewModel) getMViewModel(), 0L, false, 3, null).observe(this, new InviteReceiveActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qhd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return InviteReceiveActivity.initRainbowAndGenderView$lambda$4(this.f31520a, (List) obj);
            }
        }));
        ((ActivePkViewModel) getMViewModel()).getIsMaleLiveData().observe(this, new InviteReceiveActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rhd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return InviteReceiveActivity.initRainbowAndGenderView$lambda$5(this.f32546a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initRainbowAndGenderView$lambda$4(InviteReceiveActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((hxh) this$0.getMBinding()).I.y(list, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initRainbowAndGenderView$lambda$5(InviteReceiveActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((hxh) this$0.getMBinding()).D.setBackgroundResource(bool.booleanValue() ? fni.f17958b : fni.f17957a);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshActiveGoal(boolean isOwn, List<DailyGoalItem> goalList) {
        if (ArrayUtils.isEmpty(goalList)) {
            return;
        }
        ryh layoutPkUserActiveGoal = ((hxh) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(layoutPkUserActiveGoal, "layoutPkUserActiveGoal");
        TextView textView = isOwn ? layoutPkUserActiveGoal.J : layoutPkUserActiveGoal.F;
        Intrinsics.checkNotNull(textView);
        TextView textView2 = isOwn ? layoutPkUserActiveGoal.K : layoutPkUserActiveGoal.G;
        Intrinsics.checkNotNull(textView2);
        TextView textView3 = isOwn ? layoutPkUserActiveGoal.L : layoutPkUserActiveGoal.H;
        Intrinsics.checkNotNull(textView3);
        Intrinsics.checkNotNull(goalList);
        for (DailyGoalItem dailyGoalItem : goalList) {
            int field = dailyGoalItem.getField();
            int iconWithGoalField = ActiveGoalUtils.INSTANCE.getIconWithGoalField(field);
            long target = dailyGoalItem.getTarget();
            TextView textView4 = field != 1 ? field != 2 ? textView3 : textView : textView2;
            textView4.setText(String.valueOf(target));
            int i = isOwn ? iconWithGoalField : 0;
            if (isOwn) {
                iconWithGoalField = 0;
            }
            textView4.setCompoundDrawablesWithIntrinsicBounds(i, 0, iconWithGoalField, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshUserDataInfo(InviteRecordDetail inviteRecordDetail) {
        String nickName;
        PkLogger.INSTANCE.i(TAG, "refreshUserDataInfo " + inviteRecordDetail, new Object[0]);
        if (inviteRecordDetail == null) {
            return;
        }
        UserInfo inviterUserInfo = inviteRecordDetail.getInviterUserInfo();
        UserInfo inviteeUserInfo = inviteRecordDetail.getInviteeUserInfo();
        if (inviterUserInfo != null) {
            nickName = inviterUserInfo.getNickName();
            if (nickName == null) {
                nickName = "";
            }
            String icon = inviterUserInfo.getIcon();
            if (icon == null) {
                icon = "";
            }
            ((hxh) getMBinding()).E.I.setText(nickName);
            if (!TextUtils.isEmpty(icon)) {
                ImageUtils.INSTANCE.loadAvatar(((hxh) getMBinding()).E.D, icon);
            }
            refreshActiveGoal(false, inviterUserInfo.getGoalList());
        } else {
            nickName = "";
        }
        ((hxh) getMBinding()).L.setText(getString(ozi.D, nickName));
        if (inviteeUserInfo != null) {
            String string = getString(ozi.G);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String icon2 = inviteeUserInfo.getIcon();
            String str = icon2 != null ? icon2 : "";
            ((hxh) getMBinding()).E.M.setText(string);
            if (!TextUtils.isEmpty(str)) {
                ImageUtils.INSTANCE.loadAvatar(((hxh) getMBinding()).E.E, str);
            }
            refreshActiveGoal(true, inviteeUserInfo.getGoalList());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshUserInfo() {
        ((ActivePkViewModel) getMViewModel()).queryInviteUserDetailLiveData(Long.valueOf(this.inviteId), Long.valueOf(this.inviterUid)).observe(this, new InviteReceiveActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vhd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return InviteReceiveActivity.refreshUserInfo$lambda$3(this.f36898a, (GetInviteRecordUserDetailResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUserInfo$lambda$3(final InviteReceiveActivity this$0, GetInviteRecordUserDetailResult getInviteRecordUserDetailResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BusinessFailDealUtil businessFailDealUtil = BusinessFailDealUtil.INSTANCE;
        Intrinsics.checkNotNull(getInviteRecordUserDetailResult);
        businessFailDealUtil.dealGetInviteUserDetailFail(this$0, getInviteRecordUserDetailResult, new BusinessFailDealUtil.PageCallback<InviteRecordDetail>() { // from class: com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity$refreshUserInfo$1$1
            @Override // com.xiaomi.fitness.active.pk.util.BusinessFailDealUtil.PageCallback
            public void showFail() {
                ConstraintLayout pageFailGroup = InviteReceiveActivity.access$getMBinding(this.this$0).H;
                Intrinsics.checkNotNullExpressionValue(pageFailGroup, "pageFailGroup");
                ViewExtKt.setVisible(pageFailGroup, true);
                RelativeLayout container = InviteReceiveActivity.access$getMBinding(this.this$0).B;
                Intrinsics.checkNotNullExpressionValue(container, "container");
                ViewExtKt.setVisible(container, false);
            }

            @Override // com.xiaomi.fitness.active.pk.util.BusinessFailDealUtil.PageCallback
            public void showNerWorkError() {
            }

            @Override // com.xiaomi.fitness.active.pk.util.BusinessFailDealUtil.PageCallback
            public void showSuccess(InviteRecordDetail record) {
                RelativeLayout container = InviteReceiveActivity.access$getMBinding(this.this$0).B;
                Intrinsics.checkNotNullExpressionValue(container, "container");
                ViewExtKt.setVisible(container, true);
                ConstraintLayout pageFailGroup = InviteReceiveActivity.access$getMBinding(this.this$0).H;
                Intrinsics.checkNotNullExpressionValue(pageFailGroup, "pageFailGroup");
                ViewExtKt.setVisible(pageFailGroup, false);
                this.this$0.refreshUserDataInfo(record);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return bui.f4617b;
    }

    public final int getSource() {
        return this.source;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return yv1.f40598a;
    }

    @Override // com.xiaomi.fitness.active.pk.ui.Hilt_InviteReceiveActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(ozi.i);
        initIntentParams();
        if (this.inviteId <= 0 && this.inviterUid <= 0) {
            LaunchExtKt.stateLaunchActivity(this);
            finish();
            ToastExtKt.toastLong(this, "param id is invalid");
        } else {
            if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
            }
            initRainbowAndGenderView();
            initBottomAction();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            refreshUserInfo();
        }
    }

    public final void setSource(int i) {
        this.source = i;
    }
}
