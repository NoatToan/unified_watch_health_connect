package com.xiaomi.hm.health.ui.diagnosis;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.ActivityDiagnosisBinding;
import com.xiaomi.hm.health.ui.diagnosis.DiagnosisActivity;
import com.xiaomi.hm.health.ui.keekalive.KeepAliveActivity;
import com.xiaomi.hm.health.utils.UIStandardUtilKt;
import com.xiaomi.hm.health.utils.Utils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001c\u0010\u0016\u001a\u00020\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014J\u001a\u0010!\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u0005H\u0016R&\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\r0\"j\b\u0012\u0004\u0012\u00020\r`#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/ui/diagnosis/DiagnosisActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "", "x", "", DTransferConstants.SEARCH_KEY, "", "desc", "Lkotlin/Function0;", "action", "z", "checked", "Lcom/xiaomi/hm/health/ui/diagnosis/QA;", "qa", com.google.android.exoplayer2.text.ttml.b.r, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "o", "u", "", "it", "r", "granted", "y", SOAP.XMLNS, "B", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/widget/CompoundButton;", "buttonView", "isChecked", "onCheckedChanged", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "questions", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/ui/diagnosis/SystemChecker;", "Ljava/util/ArrayList;", "shortList", "Lcom/xiaomi/hm/health/databinding/ActivityDiagnosisBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "t", "()Lcom/xiaomi/hm/health/databinding/ActivityDiagnosisBinding;", "viewBinding", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DiagnosisActivity extends BaseTitleActivity implements CompoundButton.OnCheckedChangeListener {
    private static final int B = 1000;

    @NotNull
    public static final String KEY_TITLE = "title";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private HashSet<QA> questions = new HashSet<>();

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<SystemChecker> shortList = new ArrayList<>();

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = ActivityViewBindingsKt.viewBinding(new DiagnosisActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityDiagnosisBinding.class)));
    public static final /* synthetic */ KProperty<Object>[] A = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DiagnosisActivity.class), "viewBinding", "getViewBinding()Lcom/xiaomi/hm/health/databinding/ActivityDiagnosisBinding;"))};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DiagnosisActivity.this.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DiagnosisActivity.this.x();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            DiagnosisActivity diagnosisActivity = DiagnosisActivity.this;
            intent.setData(Uri.fromParts(NotificationEvent.KEY_PACKAGE, diagnosisActivity.getPackageName(), null));
            diagnosisActivity.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DiagnosisActivity.this.startActivity(new Intent(DiagnosisActivity.this, (Class<?>) KeepAliveActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(Function0 function0, View view) {
        function0.invoke();
    }

    private final boolean B() {
        return StringsKt__StringsKt.contains$default((CharSequence) Utils.getMiuiWholeVersionInfo(), (CharSequence) "MIUI 12", false, 2, (Object) null) && this.questions.contains(QA.PHONE_ALERT);
    }

    private final void o(Context context) {
        if (this.questions.contains(QA.PHONE_ALERT) || this.questions.contains(QA.PHONE_NAMELESS)) {
            for (Map.Entry<String, Boolean> entry : AppUtil.INSTANCE.checkPhonePermission(context).entrySet()) {
                y(r(entry), entry.getValue().booleanValue());
            }
        }
        if (this.questions.contains(QA.MSG_ALERT) || this.questions.contains(QA.APP_ALERT)) {
            boolean zIsNotificationPermissionEnabled = AppUtil.INSTANCE.isNotificationPermissionEnabled(context);
            if (zIsNotificationPermissionEnabled) {
                u(context);
            } else {
                this.shortList.add(SystemChecker.NOTIFICATION);
            }
            y(getString(R.string.read_notification), zIsNotificationPermissionEnabled);
        }
    }

    private final void p(boolean checked, QA qa) {
        if (checked) {
            this.questions.add(qa);
        } else if (this.questions.contains(qa)) {
            this.questions.remove(qa);
        }
        t().btnDiagnose.setEnabled(this.questions.size() != 0);
    }

    private final boolean q() {
        return this.shortList.contains(SystemChecker.CONTACTS) || this.shortList.contains(SystemChecker.PHONE_STATE) || this.shortList.contains(SystemChecker.CALL_LOG);
    }

    private final String r(Map.Entry<String, Boolean> it2) {
        String key = it2.getKey();
        int iHashCode = key.hashCode();
        if (iHashCode != -1921431796) {
            if (iHashCode != -5573545) {
                if (iHashCode == 1977429404 && key.equals("android.permission.READ_CONTACTS")) {
                    if (!it2.getValue().booleanValue()) {
                        this.shortList.add(SystemChecker.CONTACTS);
                    }
                    return getString(R.string.read_contacts);
                }
            } else if (key.equals("android.permission.READ_PHONE_STATE")) {
                if (!it2.getValue().booleanValue()) {
                    this.shortList.add(SystemChecker.PHONE_STATE);
                }
                return getString(R.string.read_phone_state);
            }
        } else if (key.equals("android.permission.READ_CALL_LOG")) {
            if (!it2.getValue().booleanValue()) {
                this.shortList.add(SystemChecker.CALL_LOG);
            }
            return getString(R.string.read_call_log);
        }
        return "";
    }

    private final String s(boolean granted) {
        return granted ? getString(R.string.granted) : getString(R.string.not_granted);
    }

    private final ActivityDiagnosisBinding t() {
        return (ActivityDiagnosisBinding) this.viewBinding.getValue(this, A[0]);
    }

    private final void u(Context context) {
        if (AppUtil.INSTANCE.isNotificationListenerServiceRunning(context)) {
            return;
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.item_request_permission, (ViewGroup) t().layoutPermissionRequest, false);
        ((TextView) viewInflate.findViewById(R.id.tv_desc)).setText(getString(R.string.service_not_running));
        ((TextView) viewInflate.findViewById(R.id.tv_operation)).setVisibility(8);
        t().layoutPermissionRequest.addView(viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(DiagnosisActivity diagnosisActivity, View view) {
        PhenomenaDialog.INSTANCE.showDialog(diagnosisActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(ActivityDiagnosisBinding activityDiagnosisBinding, DiagnosisActivity diagnosisActivity, View view) {
        activityDiagnosisBinding.layoutQuestions.setVisibility(8);
        activityDiagnosisBinding.btnDiagnose.setVisibility(8);
        activityDiagnosisBinding.tvSettingTip.setVisibility(0);
        activityDiagnosisBinding.tvTip.setText(diagnosisActivity.getString(R.string.desc_diagnosis_permissions));
        ViewGroup.LayoutParams layoutParams = activityDiagnosisBinding.tvFeedback.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        diagnosisActivity.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = (int) diagnosisActivity.getResources().getDimension(R.dimen.size_16dp);
        diagnosisActivity.o(diagnosisActivity);
        if (diagnosisActivity.shortList.contains(SystemChecker.NOTIFICATION)) {
            diagnosisActivity.z(diagnosisActivity.getString(R.string.desc_notification_permission), diagnosisActivity.new a());
        }
        if (diagnosisActivity.q()) {
            diagnosisActivity.z(diagnosisActivity.getString(R.string.desc_phone_permissions), diagnosisActivity.new b());
        } else if (diagnosisActivity.B()) {
            diagnosisActivity.z(diagnosisActivity.getString(R.string.desc_phone_miui12), diagnosisActivity.new c());
        }
        diagnosisActivity.z(diagnosisActivity.getString(R.string.desc_running_background), diagnosisActivity.new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        ArrayList arrayList = new ArrayList();
        if (this.shortList.contains(SystemChecker.PHONE_STATE)) {
            arrayList.add("android.permission.READ_PHONE_STATE");
        }
        if (this.shortList.contains(SystemChecker.CALL_LOG)) {
            arrayList.add("android.permission.READ_CALL_LOG");
        }
        if (this.shortList.contains(SystemChecker.CONTACTS)) {
            arrayList.add("android.permission.READ_CONTACTS");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            requestPermissions((String[]) array, 1000);
        }
    }

    private final void y(String desc, boolean granted) {
        View viewInflate = getLayoutInflater().inflate(R.layout.item_diagnosis_result, (ViewGroup) t().layoutDiagnosisResult, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_desc);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_result);
        textView.setText(desc);
        textView2.setText(s(granted));
        t().layoutDiagnosisResult.addView(viewInflate);
    }

    private final void z(String desc, final Function0<Unit> action) {
        View viewInflate = getLayoutInflater().inflate(R.layout.item_request_permission, (ViewGroup) t().layoutPermissionRequest, false);
        ((TextView) viewInflate.findViewById(R.id.tv_desc)).setText(desc);
        ((TextView) viewInflate.findViewById(R.id.tv_operation)).setOnClickListener(new View.OnClickListener() { // from class: ea1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiagnosisActivity.A(action, view);
            }
        });
        t().layoutPermissionRequest.addView(viewInflate);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(@Nullable CompoundButton buttonView, boolean isChecked) {
        Integer numValueOf = buttonView == null ? null : Integer.valueOf(buttonView.getId());
        if (numValueOf != null && numValueOf.intValue() == R.id.cb_phone_alert) {
            p(isChecked, QA.PHONE_ALERT);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.cb_alert_nameless) {
            p(isChecked, QA.PHONE_NAMELESS);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.cb_app_alert) {
            p(isChecked, QA.APP_ALERT);
        } else if (numValueOf != null && numValueOf.intValue() == R.id.cb_msg_alert) {
            p(isChecked, QA.MSG_ALERT);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(t().getRoot());
        UIStandardUtilKt.setUnifyTitleStyle$default(this, getString(R.string.push_and_alert), null, 2, null);
        final ActivityDiagnosisBinding activityDiagnosisBindingT = t();
        activityDiagnosisBindingT.cbPhoneAlert.setOnCheckedChangeListener(this);
        activityDiagnosisBindingT.cbAlertNameless.setOnCheckedChangeListener(this);
        activityDiagnosisBindingT.cbPhoneAlert.setOnCheckedChangeListener(this);
        activityDiagnosisBindingT.cbMsgAlert.setOnCheckedChangeListener(this);
        activityDiagnosisBindingT.tvFeedback.setOnClickListener(new View.OnClickListener() { // from class: da1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiagnosisActivity.v(this.a, view);
            }
        });
        activityDiagnosisBindingT.btnDiagnose.setOnClickListener(new View.OnClickListener() { // from class: ca1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiagnosisActivity.w(activityDiagnosisBindingT, this, view);
            }
        });
    }
}
