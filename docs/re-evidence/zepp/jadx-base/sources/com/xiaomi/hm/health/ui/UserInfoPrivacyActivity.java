package com.xiaomi.hm.health.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountExternalContainer;
import com.huami.account.HMLoginManager;
import com.huami.account.UserLegalInfoComponents;
import com.huami.account.UserLegalInfoExt;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.bean.NavigateAgreementType;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.utils.AgreementItem;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.ActivityUserInfoPrivacyBinding;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.ui.UserInfoPrivacyActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\f\u0010\u000e\u001a\u00020\t*\u00020\rH\u0002J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014R\u001d\u0010\u0019\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/ui/UserInfoPrivacyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/xiaomi/hm/health/databinding/ActivityUserInfoPrivacyBinding;", GoogleApiAvailabilityLight.b, DTransferConstants.SEARCH_KEY, "y", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "z", "", "C", "B", LogUtil.D, "Landroidx/appcompat/widget/LinearLayoutCompat;", "E", "Lcom/huami/lib/rainbow/ListTile;", "Landroid/widget/TextView;", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "l", "()Lcom/xiaomi/hm/health/databinding/ActivityUserInfoPrivacyBinding;", "binding", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class UserInfoPrivacyActivity extends AppCompatActivity {

    @NotNull
    private static final String c = "UserInfoPrivacyActivity";

    @NotNull
    private static final String d = "https://upload-cdn.huami.com/tposts/4360667";

    @NotNull
    private static final String e = "https://upload-cdn.huami.com/tposts/3327925";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new UserInfoPrivacyActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityUserInfoPrivacyBinding.class)));
    public static final /* synthetic */ KProperty<Object>[] b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(UserInfoPrivacyActivity.class), "binding", "getBinding()Lcom/xiaomi/hm/health/databinding/ActivityUserInfoPrivacyBinding;"))};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "用户体验计划状态发生改变(isSuccess=" + this.a + ", isChecked=" + this.b + ")";
        }
    }

    private final boolean A() {
        return HMLoginManager.isInMainland();
    }

    private final void B() {
        UserLegalInfoManager.showPage(this, NavigateAgreementType.PRIVACY);
    }

    private final void C() {
        UserLegalInfoManager.showPage(this, NavigateAgreementType.AGREEMENT);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.MINE_ABOUT_PRIVACY_VIEW_NUM));
    }

    private final void D() {
        UserLegalInfoManager.showPage(this, NavigateAgreementType.USER_DATA_RIGHT);
    }

    private final void E(LinearLayoutCompat linearLayoutCompat) {
        IntRange intRangeUntil = kotlin.ranges.e.until(0, linearLayoutCompat.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            arrayList.add(linearLayoutCompat.getChildAt(((IntIterator) it2).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ListTile) {
                arrayList2.add(obj);
            }
        }
        ArrayList<ListTile> arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((ListTile) next).getVisibility() == 0) {
                arrayList3.add(next);
            }
        }
        for (ListTile listTile : arrayList3) {
            if (Intrinsics.areEqual(listTile, CollectionsKt.first((List) arrayList3))) {
                listTile.setRadiusPosition(1);
            } else if (Intrinsics.areEqual(listTile, CollectionsKt.last((List) arrayList3))) {
                listTile.setRadiusPosition(2);
            }
        }
    }

    private final ActivityUserInfoPrivacyBinding l() {
        return (ActivityUserInfoPrivacyBinding) this.binding.getValue(this, b[0]);
    }

    private final TextView m(ListTile listTile) {
        View viewFindViewById = listTile.findViewById(R.id.rainbow_tile_subtitle);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final ActivityUserInfoPrivacyBinding n() {
        final ActivityUserInfoPrivacyBinding activityUserInfoPrivacyBindingL = l();
        activityUserInfoPrivacyBindingL.itemUserPlan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: u68
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws JSONException {
                UserInfoPrivacyActivity.o(activityUserInfoPrivacyBindingL, compoundButton, z);
            }
        });
        activityUserInfoPrivacyBindingL.itemUserPlan.setOnClickListener(null);
        TextView textViewM = m(activityUserInfoPrivacyBindingL.itemUserPlan);
        if (textViewM != null) {
            UserLegalInfoComponents.INSTANCE.assembleAboutExperienceText(this, textViewM);
        }
        return activityUserInfoPrivacyBindingL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(final ActivityUserInfoPrivacyBinding activityUserInfoPrivacyBinding, CompoundButton compoundButton, final boolean z) throws JSONException {
        UserLegalInfoExt.INSTANCE.updateAgreeUserExperience(z, new UserLegalInfoExt.UpdateAgreeUserExperienceCallback() { // from class: v68
            @Override // com.huami.account.UserLegalInfoExt.UpdateAgreeUserExperienceCallback
            public final void onResult(boolean z2, AgreementItem agreementItem) {
                UserInfoPrivacyActivity.p(activityUserInfoPrivacyBinding, z, z2, agreementItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(ActivityUserInfoPrivacyBinding activityUserInfoPrivacyBinding, boolean z, boolean z2, AgreementItem agreementItem) {
        HMLog.info(c, new a(z2, z));
        if (z2) {
            return;
        }
        activityUserInfoPrivacyBinding.itemUserPlan.setChecked(!z);
    }

    private final ActivityUserInfoPrivacyBinding q() {
        ActivityUserInfoPrivacyBinding activityUserInfoPrivacyBindingL = l();
        activityUserInfoPrivacyBindingL.itemUserPrivacy.setOnClickListener(new View.OnClickListener() { // from class: p68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoPrivacyActivity.s(this.a, view);
            }
        });
        activityUserInfoPrivacyBindingL.itemUserAgreement.setOnClickListener(new View.OnClickListener() { // from class: q68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoPrivacyActivity.t(this.a, view);
            }
        });
        activityUserInfoPrivacyBindingL.itemExercisingUserRights.setOnClickListener(new View.OnClickListener() { // from class: n68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoPrivacyActivity.u(this.a, view);
            }
        });
        activityUserInfoPrivacyBindingL.itemUserHealthDataAgreement.setOnClickListener(new View.OnClickListener() { // from class: r68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoPrivacyActivity.v(view);
            }
        });
        activityUserInfoPrivacyBindingL.itemUserCollectedDataList.setOnClickListener(new View.OnClickListener() { // from class: s68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoPrivacyActivity.w(view);
            }
        });
        activityUserInfoPrivacyBindingL.itemUserSharedDataList.setOnClickListener(new View.OnClickListener() { // from class: t68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoPrivacyActivity.x(view);
            }
        });
        activityUserInfoPrivacyBindingL.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: o68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoPrivacyActivity.r(this.a, view);
            }
        });
        return activityUserInfoPrivacyBindingL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(UserInfoPrivacyActivity userInfoPrivacyActivity, View view) {
        userInfoPrivacyActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(UserInfoPrivacyActivity userInfoPrivacyActivity, View view) {
        userInfoPrivacyActivity.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(UserInfoPrivacyActivity userInfoPrivacyActivity, View view) {
        userInfoPrivacyActivity.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(UserInfoPrivacyActivity userInfoPrivacyActivity, View view) {
        userInfoPrivacyActivity.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(View view) {
        String strUserPrivacyPagePath = AccountExternalContainer.INSTANCE.getConfigDelegate().userPrivacyPagePath();
        WebHelper.launch(HMServerDef.getHost() + strUserPrivacyPagePath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(View view) {
        WebHelper.launch(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(View view) {
        WebHelper.launch(e);
    }

    private final ActivityUserInfoPrivacyBinding y() {
        ActivityUserInfoPrivacyBinding activityUserInfoPrivacyBindingL = l();
        boolean zA = A();
        activityUserInfoPrivacyBindingL.itemUserHealthDataAgreement.setVisibility(zA ? 0 : 8);
        activityUserInfoPrivacyBindingL.itemUserCollectedDataList.setVisibility(zA ? 0 : 8);
        activityUserInfoPrivacyBindingL.itemUserSharedDataList.setVisibility(zA ? 0 : 8);
        activityUserInfoPrivacyBindingL.itemUserPlan.setVisibility(HMLoginManager.isShowExperience() ? 0 : 8);
        activityUserInfoPrivacyBindingL.itemUserPlan.setChecked(HMAccountKeeper.INSTANCE.readAgreeUserExperience());
        activityUserInfoPrivacyBindingL.itemExercisingUserRights.setVisibility(z() ? 0 : 8);
        E(activityUserInfoPrivacyBindingL.itemsLayout);
        return activityUserInfoPrivacyBindingL;
    }

    private final boolean z() {
        return (HMLoginManager.isInMainland() || (HMLoginManager.isUnknown() && Intrinsics.areEqual(Locale.getDefault().getCountry(), "CN"))) ? false : true;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017903);
        super.onCreate(savedInstanceState);
        setContentView(l().getRoot());
        y();
        q();
        n();
    }
}
