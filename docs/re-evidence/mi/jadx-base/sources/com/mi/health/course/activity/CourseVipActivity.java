package com.mi.health.course.activity;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.activity.CourseVipActivity;
import com.mi.health.course.adapter.OpenVipAdapter;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.CourseVipExtKt;
import com.mi.health.course.export.data.CourseMembership;
import com.mi.health.course.export.data.CourseVipInfo;
import com.mi.health.course.export.data.OpenVipModel;
import com.mi.health.course.util.WebViewUrlKt;
import com.mi.health.course.vm.CourseVipVM;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.PaymentProgressDefaultListener;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.bli;
import defpackage.czi;
import defpackage.ew1;
import defpackage.hz4;
import defpackage.oqi;
import defpackage.sti;
import defpackage.xmi;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006,"}, d2 = {"Lcom/mi/health/course/activity/CourseVipActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/mi/health/course/vm/CourseVipVM;", "Lhz4;", "", "initView", "()V", "requestPay", "initData", "Lcom/mi/health/course/export/data/CourseMembership;", "data", "onDataOK", "(Lcom/mi/health/course/export/data/CourseMembership;)V", "onError", "onNoNet", "refreshVipInfo", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", "TAG", "Ljava/lang/String;", "Landroid/widget/TextView;", "stateView", "Landroid/widget/TextView;", "Ljava/util/ArrayList;", "Lcom/mi/health/course/export/data/OpenVipModel;", "vipList", "Ljava/util/ArrayList;", "Lcom/mi/health/course/adapter/OpenVipAdapter;", "adapterVip$delegate", "Lkotlin/Lazy;", "getAdapterVip", "()Lcom/mi/health/course/adapter/OpenVipAdapter;", "adapterVip", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseVipActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVipActivity.kt\ncom/mi/health/course/activity/CourseVipActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n774#2:265\n865#2,2:266\n2653#2:278\n1872#2,3:280\n54#3,3:268\n24#3:271\n59#3,6:272\n1#4:279\n*S KotlinDebug\n*F\n+ 1 CourseVipActivity.kt\ncom/mi/health/course/activity/CourseVipActivity\n*L\n126#1:265\n126#1:266,2\n192#1:278\n192#1:280,3\n168#1:268,3\n168#1:271\n168#1:272,6\n192#1:279\n*E\n"})
public final class CourseVipActivity extends Hilt_CourseVipActivity<CourseVipVM, hz4> {
    private TextView stateView;

    @NotNull
    private final String TAG = "CourseVipActivity";

    @NotNull
    private final ArrayList<OpenVipModel> vipList = new ArrayList<>();

    /* JADX INFO: renamed from: adapterVip$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapterVip = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ez4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseVipActivity.adapterVip_delegate$lambda$0(this.f17210a);
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateData.Status.values().length];
            try {
                iArr[StateData.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateData.Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateData.Status.NO_NET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenVipAdapter adapterVip_delegate$lambda$0(CourseVipActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new OpenVipAdapter(this$0.vipList);
    }

    private final OpenVipAdapter getAdapterVip() {
        return (OpenVipAdapter) this.adapterVip.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        String userId;
        AccountCoreInfo accountCoreInfoLoadAccountCoreInfo = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).loadAccountCoreInfo();
        String userName = accountCoreInfoLoadAccountCoreInfo != null ? accountCoreInfoLoadAccountCoreInfo.getUserName() : null;
        if (userName != null && !StringsKt__StringsKt.isBlank(userName)) {
            userId = accountCoreInfoLoadAccountCoreInfo != null ? accountCoreInfoLoadAccountCoreInfo.getUserName() : null;
            Intrinsics.checkNotNull(userId);
        } else if (accountCoreInfoLoadAccountCoreInfo == null || (userId = accountCoreInfoLoadAccountCoreInfo.getUserId()) == null) {
            userId = "";
        }
        String avatarAddress = accountCoreInfoLoadAccountCoreInfo != null ? accountCoreInfoLoadAccountCoreInfo.getAvatarAddress() : null;
        ImageFilterView ivVipUserHead = ((hz4) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(ivVipUserHead, "ivVipUserHead");
        ImageLoader imageLoader = Coil.imageLoader(ivVipUserHead.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(ivVipUserHead.getContext()).data(avatarAddress).target(ivVipUserHead);
        builderTarget.error(xmi.f39269b);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        imageLoader.enqueue(builderTarget.build());
        ((hz4) getMBinding()).L.setText(userId);
        ((CourseVipVM) getMViewModel()).getCourseVipInfoData().observe(this, new CourseVipActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dz4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVipActivity.initData$lambda$10(this.f16087a, (CourseMembership) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$10(CourseVipActivity this$0, CourseMembership courseMembership) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "courseVipInfoData:" + courseMembership);
        StateData.Status status = courseMembership != null ? courseMembership.getStatus() : null;
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            this$0.onDataOK(courseMembership);
        } else if (i == 2) {
            this$0.onError();
        } else if (i == 3) {
            this$0.onNoNet();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        setTitleBackground(bli.l);
        setActionBarNormalTitleMode();
        setTitle(czi.course_vip);
        this.stateView = (TextView) findViewById(oqi.o1);
        RecyclerView recyclerView = ((hz4) getMBinding()).C;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        recyclerView.setAdapter(getAdapterVip());
        TextView textView = ((hz4) getMBinding()).J;
        String string = textView.getResources().getString(czi.course_vip_agreement_pay_fix, WebViewUrlKt.getCourseVipAgreementUrl(LocaleUtil.getCurrentLocale()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CharSequence charSequenceClickSpannable$default = StringExtKt.clickSpannable$default(string, null, bli.h, 0, new Function2() { // from class: fz4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CourseVipActivity.initView$lambda$3$lambda$2(this.f18387a, (String) obj, (String) obj2);
            }
        }, 5, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setAutoLinkMask(1);
        textView.setHighlightColor(0);
        textView.setText(charSequenceClickSpannable$default);
        View view = ((hz4) getMBinding()).N;
        GradientDrawable gradientDrawable = new GradientDrawable();
        View viewVipAgreementBg = ((hz4) getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(viewVipAgreementBg, "viewVipAgreementBg");
        gradientDrawable.setColor(ViewExtKt.getColor(viewVipAgreementBg, bli.g));
        gradientDrawable.setCornerRadius(ExtUtilsKt.getDp(12));
        view.setBackground(gradientDrawable);
        ViewExtKt.clickWithTrigger$default(((hz4) getMBinding()).E, 0L, new Function1() { // from class: gz4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVipActivity.initView$lambda$5(this.f19483a, (TextView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$3$lambda$2(CourseVipActivity this$0, String str, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        WebViewUtilKt.startWebView$default(url, this$0.getString(czi.course_vip_agreement), false, false, null, false, null, false, 252, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$5(CourseVipActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (NetworkUtils.isNetworkConnected(this$0)) {
            this$0.requestPay();
            return Unit.INSTANCE;
        }
        ToastUtil.INSTANCE.showToast(czi.common_hint_network_unavailable);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOK(CourseMembership data) {
        ArrayList<OpenVipModel> membership;
        FrameLayout flStatus = ((hz4) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(flStatus, "flStatus");
        ViewExtKt.gone(flStatus);
        if (data != null && (membership = data.getMembership()) != null && (!membership.isEmpty())) {
            this.vipList.clear();
            ArrayList<OpenVipModel> arrayList = this.vipList;
            ArrayList<OpenVipModel> membership2 = data.getMembership();
            Intrinsics.checkNotNull(membership2);
            int i = 0;
            for (Object obj : membership2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ((OpenVipModel) obj).setSelected(Boolean.valueOf(i == 0));
                i = i2;
            }
            arrayList.addAll(membership2);
            getAdapterVip().notifyDataSetChanged();
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Entrance"), TuplesKt.to("tip", "56.0.0.0.40471"), TuplesKt.to("source", 2)));
        }
        refreshVipInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onError() {
        FrameLayout flStatus = ((hz4) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(flStatus, "flStatus");
        ViewExtKt.visible(flStatus);
        TextView textView = this.stateView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView = null;
        }
        ViewExtKt.visible(textView);
        TextView textView3 = this.stateView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView3 = null;
        }
        textView3.setText(getString(czi.common_hint_unkonwn_error));
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView2 = textView4;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNoNet() {
        FrameLayout flStatus = ((hz4) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(flStatus, "flStatus");
        ViewExtKt.visible(flStatus);
        TextView textView = this.stateView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView = null;
        }
        ViewExtKt.visible(textView);
        TextView textView3 = this.stateView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView3 = null;
        }
        textView3.setText(getString(czi.common_hint_network_unavailable));
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView2 = textView4;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshVipInfo() {
        CourseVipInfo aidongCourseVipInfo = CourseApiKt.getCourseApi().getAidongCourseVipInfo();
        if (aidongCourseVipInfo != null) {
            String expired_at = aidongCourseVipInfo.getExpired_at();
            Boolean boolValueOf = expired_at != null ? Boolean.valueOf(CourseVipExtKt.hasExpired(expired_at)) : null;
            Boolean active = aidongCourseVipInfo.getActive();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(active, bool)) {
                TextView textView = ((hz4) getMBinding()).K;
                int i = czi.course_expire;
                Object[] objArr = new Object[1];
                String expired_at2 = aidongCourseVipInfo.getExpired_at();
                if (expired_at2 == null) {
                    expired_at2 = "";
                }
                objArr[0] = expired_at2;
                textView.setText(getString(i, objArr));
                ((hz4) getMBinding()).E.setText(czi.course_vip_renew);
                return;
            }
            if (!Intrinsics.areEqual(boolValueOf, bool)) {
                ((hz4) getMBinding()).K.setText(czi.course_not_vip_hint);
                ((hz4) getMBinding()).E.setText(czi.course_vip_open);
                return;
            }
            ((hz4) getMBinding()).K.setText(aidongCourseVipInfo.getExpired_at() + " " + getString(czi.course_has_expire));
            ((hz4) getMBinding()).E.setText(czi.course_vip_renew);
        }
    }

    private final void requestPay() {
        ArrayList<OpenVipModel> arrayList = this.vipList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.areEqual(((OpenVipModel) obj).getSelected(), Boolean.TRUE)) {
                arrayList2.add(obj);
            }
        }
        OpenVipModel openVipModel = (OpenVipModel) CollectionsKt___CollectionsKt.getOrNull(arrayList2, 0);
        if (openVipModel != null) {
            PaymentManager.Companion companion = PaymentManager.INSTANCE;
            SkuObject skuObjectBuildSkuObject$default = PaymentManager.DefaultImpls.buildSkuObject$default(PayManagerExtKt.getInstance(companion), openVipModel.getSpuId(), openVipModel.getSpuVer(), openVipModel.getId(), openVipModel.getPrice(), 0L, null, null, 112, null);
            Bundle bundle = new Bundle();
            bundle.putInt("courseSource", 10);
            PaymentManager.DefaultImpls.intentToPay$default(PayManagerExtKt.getInstance(companion), this, CollectionsKt__CollectionsKt.mutableListOf(skuObjectBuildSkuObject$default), 0, false, false, false, false, 3, null, bundle, new PaymentProgressDefaultListener() { // from class: com.mi.health.course.activity.CourseVipActivity$requestPay$2$1
                @Override // com.xiaomi.fitness.pay.export.PaymentProgressDefaultListener, com.xiaomi.fitness.pay.export.PaymentProgressListener
                public void onOrderStatus(String status) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    super.onOrderStatus(status);
                    if (Intrinsics.areEqual(status, OrderStatus.PAYMENT_SUCCESS)) {
                        CourseApi.DefaultImpls.refreshCourseVipData$default(CourseApiKt.getCourseApi(), null, null, 3, null);
                    }
                }
            }, 380, null);
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Entrance"), TuplesKt.to("tip", "56.0.0.0.40474"), TuplesKt.to("source", 2), TuplesKt.to("type_sku", openVipModel.getName())));
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.course_vip_activity;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    @Override // com.mi.health.course.activity.Hilt_CourseVipActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((CourseVipVM) getMViewModel()).getCourseVipInfo();
    }
}
