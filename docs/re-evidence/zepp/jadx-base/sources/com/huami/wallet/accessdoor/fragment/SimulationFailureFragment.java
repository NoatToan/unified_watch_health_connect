package com.huami.wallet.accessdoor.fragment;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity;
import com.huami.wallet.accessdoor.activity.StartAccessLoadingActivity;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.databinding.FragmentSimulationFailureBinding;
import com.huami.wallet.accessdoor.di.koin.DoorKoinModuleKt;
import com.huami.wallet.accessdoor.fragment.SimulationFailureFragment;
import com.huami.wallet.accessdoor.helper.ViewSingleClickExtensionKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001d\u0010\u001c\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/SimulationFailureFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", GoogleApiAvailabilityLight.a, hl.k, "h", "g", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onClick", "", "a", "Ljava/lang/String;", "code", "b", "message", "c", "Lkotlin/Lazy;", "getAppName", "()Ljava/lang/String;", "appName", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "e", "()Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "accessDoorDataSource", "Lcom/huami/wallet/accessdoor/databinding/FragmentSimulationFailureBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "f", "()Lcom/huami/wallet/accessdoor/databinding/FragmentSimulationFailureBinding;", "binding", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class SimulationFailureFragment extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String FEEDBACK_INFO = "门卡模拟开卡失败";
    public static final /* synthetic */ KProperty<Object>[] f;

    @NotNull
    private static final String g;
    private static final int h;

    @NotNull
    private static final String i;

    @NotNull
    private static final String j;

    @NotNull
    private static final String k;
    private static int l;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy appName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy accessDoorDataSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\"\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004¨\u0006\u0019"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/SimulationFailureFragment$Companion;", "", "", "EXTRA_FROM", "Ljava/lang/String;", "getEXTRA_FROM", "()Ljava/lang/String;", "", "EXTRA_FROM_ID", LogUtil.I, "getEXTRA_FROM_ID", "()I", "ARG_FEEDBACK_INFO", "getARG_FEEDBACK_INFO", "ARG_FEEDBACK_APP_LOG", "getARG_FEEDBACK_APP_LOG", "ARG_FEEDBACK_DEVICE_LOG", "getARG_FEEDBACK_DEVICE_LOG", "FAIL_COUNT", "getFAIL_COUNT", "setFAIL_COUNT", "(I)V", "FEEDBACK_INFO", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getARG_FEEDBACK_APP_LOG() {
            return SimulationFailureFragment.j;
        }

        @NotNull
        public final String getARG_FEEDBACK_DEVICE_LOG() {
            return SimulationFailureFragment.k;
        }

        @NotNull
        public final String getARG_FEEDBACK_INFO() {
            return SimulationFailureFragment.i;
        }

        @NotNull
        public final String getEXTRA_FROM() {
            return SimulationFailureFragment.g;
        }

        public final int getEXTRA_FROM_ID() {
            return SimulationFailureFragment.h;
        }

        public final int getFAIL_COUNT() {
            return SimulationFailureFragment.l;
        }

        public final void setFAIL_COUNT(int i) {
            SimulationFailureFragment.l = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            SimulationFailureFragment.this.k();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SimulationFailureFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentSimulationFailureBinding;"));
        f = kPropertyArr;
        INSTANCE = new Companion(null);
        g = "from";
        h = 4;
        i = "ARG_FEEDBACK_INFO";
        j = "ARG_FEEDBACK_APP_LOG";
        k = "ARG_FEEDBACK_DEVICE_LOG";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimulationFailureFragment() {
        super(R.layout.fragment_simulation_failure);
        final StringQualifier stringQualifierNamed = QualifierKt.named(DoorKoinModuleKt.DOOR_CONFIG_APP_NAME);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Function0 function0 = null;
        this.appName = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<String>() { // from class: com.huami.wallet.accessdoor.fragment.SimulationFailureFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final String getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed, function0);
            }
        });
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.accessDoorDataSource = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AccessDoorDataSource>() { // from class: com.huami.wallet.accessdoor.fragment.SimulationFailureFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.accessdoor.api.service.AccessDoorDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AccessDoorDataSource getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(AccessDoorDataSource.class), objArr, objArr2);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new SimulationFailureFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentSimulationFailureBinding.class)));
    }

    private final void d() {
        int i2 = l;
        if (i2 == 0) {
            k();
        } else {
            if (i2 != 1) {
                return;
            }
            h();
        }
    }

    private final AccessDoorDataSource e() {
        return (AccessDoorDataSource) this.accessDoorDataSource.getValue();
    }

    private final FragmentSimulationFailureBinding f() {
        return (FragmentSimulationFailureBinding) this.binding.getValue(this, f[2]);
    }

    private final void g() {
        Function4<Context, String, Boolean, Boolean, Boolean> onErrorToFeedback = FunctionsConfig.getOnErrorToFeedback();
        Context contextRequireContext = requireContext();
        Boolean bool = Boolean.TRUE;
        onErrorToFeedback.invoke(contextRequireContext, FEEDBACK_INFO, bool, bool);
    }

    private final String getAppName() {
        return (String) this.appName.getValue();
    }

    private final void h() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setTitle(R.string.access_door_simulation_result_fail_feedback_title).setMessage(R.string.access_door_simulation_result_fail_feedback_msg).setPositiveButton(R.string.access_door_simulation_result_fail_feedback_alert_sure_button, new DialogInterface.OnClickListener() { // from class: ou6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SimulationFailureFragment.i(this.a, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.access_card_cancel, new DialogInterface.OnClickListener() { // from class: qu6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SimulationFailureFragment.j(dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SimulationFailureFragment simulationFailureFragment, DialogInterface dialogInterface, int i2) {
        simulationFailureFragment.g();
    }

    @SuppressLint({"SetTextI18n"})
    private final void initView(View view) {
        String str;
        f().tvSimulationFailure.setOnClickListener(this);
        ViewSingleClickExtensionKt.singleClickListener(f().tvSimulationFailureTip, 1000L, new a());
        if (FunctionsConfig.isShowDetailMessage().getA().booleanValue()) {
            f().tvSimulationFailureCode.setVisibility(0);
            f().tvSimulationFailureMessage.setVisibility(0);
            TextView textView = f().tvSimulationFailureCode;
            String str2 = "";
            if (TextUtils.isEmpty(this.code)) {
                str = "";
            } else {
                str = "(" + this.code + ")";
            }
            textView.setText(str);
            TextView textView2 = f().tvSimulationFailureMessage;
            if (!TextUtils.isEmpty(this.message)) {
                str2 = this.message;
            }
            textView2.setText(str2);
        } else {
            f().tvSimulationFailureCode.setVisibility(8);
            f().tvSimulationFailureMessage.setVisibility(8);
        }
        String str3 = this.code;
        if (str3 == null || !Intrinsics.areEqual(str3, "http401")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.message);
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            jSONObject2.put("mutimelong", jSONObject2.getLong("mutimelong") + ((long) 2000));
            jSONObject.put("data", jSONObject2);
            e().getToLogin(this.code, jSONObject.toString());
            FragmentActivity activity = getActivity();
            if (activity == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity");
            }
            ((BaseDeviceStatusActivity) activity).removeDeviceStatusTip();
            f().tvSimulationFailureCode.setVisibility(8);
            f().tvSimulationFailureMessage.setVisibility(8);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setTitle(R.string.access_door_simulation_result_fail_tips).setMessage(getString(DoorKoinModuleKt.getDoorRes().getSimulationFailTipsRes(), getAppName())).setNeutralButton(R.string.access_card_has_known, new DialogInterface.OnClickListener() { // from class: pu6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SimulationFailureFragment.l(dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intent intent;
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return;
        }
        this.code = intent.getStringExtra("code");
        this.message = intent.getStringExtra("message");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        l++;
        StartAccessLoadingActivity.Companion.open$default(StartAccessLoadingActivity.INSTANCE, requireContext(), null, 2, null);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        d();
    }
}
