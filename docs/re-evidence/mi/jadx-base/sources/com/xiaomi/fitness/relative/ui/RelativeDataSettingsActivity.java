package com.xiaomi.fitness.relative.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.server.model.RelativeSetting;
import com.xiaomi.fitness.relative.server.model.TopicSubscriptions;
import com.xiaomi.fitness.relative.ui.RelativeDataSettingsActivity;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.lfk;
import defpackage.t0j;
import defpackage.vji;
import defpackage.xui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\t\b\u0007¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001d\u0010\u0006R\u001c\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/RelativeDataSettingsActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Llfk;", "", "loadTimeScope", "()V", "", "last_data", "setRangeTypeFromLast", "(Ljava/lang/String;)V", "loadTopicSubscriptions", "", "isChecked", "upTopicSubscriptions", "(Z)V", "showUnfriendConfirmationDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "unfriendConfirmationDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "relativeUid", "Ljava/lang/Long;", "relativeNode", "Ljava/lang/String;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRelativeDataSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeDataSettingsActivity.kt\ncom/xiaomi/fitness/relative/ui/RelativeDataSettingsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n1863#2,2:268\n1#3:270\n*S KotlinDebug\n*F\n+ 1 RelativeDataSettingsActivity.kt\ncom/xiaomi/fitness/relative/ui/RelativeDataSettingsActivity\n*L\n152#1:268,2\n*E\n"})
public final class RelativeDataSettingsActivity extends Hilt_RelativeDataSettingsActivity<RelativeCareViewModel, lfk> {

    @NotNull
    public static final String TAG = "RelativeDataSettingsActivity";
    public static final int TYPE_SUBSCRIBE = 1;
    public static final int TYPE_UNSUBSCRIBE = 2;

    @Nullable
    private String relativeNode;

    @Nullable
    private Long relativeUid;

    @Nullable
    private CommonDialog<?> unfriendConfirmationDialog;

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.ui.RelativeDataSettingsActivity$showUnfriendConfirmationDialog$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/relative/ui/RelativeDataSettingsActivity$showUnfriendConfirmationDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(RelativeDataSettingsActivity this$0, RelativeResult relativeResult) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (relativeResult.isSuccess()) {
                Logger.i(RelativeDataSettingsActivity.TAG, "deleteRelativeShip success. result=" + relativeResult.getData() + " relativeUid=" + this$0.relativeUid);
                RelativeCareHomePageActivity.Companion.goToAddRelativePageWithClearTopFlagOrNewTask$default(RelativeCareHomePageActivity.INSTANCE, this$0, 2, null, 4, null);
                this$0.finish();
            } else {
                ToastExtKt.toastShort(this$0, t0j.e0);
                Logger.i(RelativeDataSettingsActivity.TAG, "deleteRelativeShip failed. errorCode=" + relativeResult.getErrorCode());
            }
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            Intrinsics.checkNotNullParameter(dialogName, "dialogName");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            super.onDialogClick(dialogName, dialog, which);
            if (which == -1) {
                RelativeCareViewModel relativeCareViewModelAccess$getMViewModel = RelativeDataSettingsActivity.access$getMViewModel(RelativeDataSettingsActivity.this);
                Long l = RelativeDataSettingsActivity.this.relativeUid;
                Intrinsics.checkNotNull(l);
                LiveData<RelativeResult<Boolean>> liveDataDeleteRelativeShip = relativeCareViewModelAccess$getMViewModel.deleteRelativeShip(l.longValue());
                final RelativeDataSettingsActivity relativeDataSettingsActivity = RelativeDataSettingsActivity.this;
                liveDataDeleteRelativeShip.observe(relativeDataSettingsActivity, new RelativeDataSettingsActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: khk
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return RelativeDataSettingsActivity.AnonymousClass1.onDialogClick$lambda$0(relativeDataSettingsActivity, (RelativeResult) obj);
                    }
                }));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ RelativeCareViewModel access$getMViewModel(RelativeDataSettingsActivity relativeDataSettingsActivity) {
        return (RelativeCareViewModel) relativeDataSettingsActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadTimeScope() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("data_shared_time_scope");
        RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) getMViewModel();
        Long l = this.relativeUid;
        Intrinsics.checkNotNull(l);
        relativeCareViewModel.getRelativeSettings(l.longValue(), arrayList).observe(this, new RelativeDataSettingsActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dhk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeDataSettingsActivity.loadTimeScope$lambda$9(this.f15535a, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadTimeScope$lambda$9(RelativeDataSettingsActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            Logger.i(TAG, "loadSettingData success. result=" + relativeResult.getData() + " relativeUid=" + this$0.relativeUid + " code = " + relativeResult.getErrorCode() + " msg = " + relativeResult.getErrorMsg());
            List<RelativeSetting> list = (List) relativeResult.getData();
            if (list != null) {
                for (RelativeSetting relativeSetting : list) {
                    if (Intrinsics.areEqual(relativeSetting.getKey(), "data_shared_time_scope")) {
                        this$0.setRangeTypeFromLast(relativeSetting.getValue());
                    }
                    Logger.d(TAG, "loadSettingData getRelativeSettings DATA_SHARED_TIME_SCOPE value=" + relativeSetting.getValue());
                }
            }
        } else {
            Logger.i(TAG, "loadSettingData false. result=" + relativeResult.getData() + " relativeUid=" + this$0.relativeUid + " code = " + relativeResult.getErrorCode() + " msg = " + relativeResult.getErrorMsg());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadTopicSubscriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("abnormal_event");
        RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) getMViewModel();
        Long l = this.relativeUid;
        Intrinsics.checkNotNull(l);
        relativeCareViewModel.getTopicSubscriptions(l.longValue(), arrayList).observe(this, new RelativeDataSettingsActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zgk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeDataSettingsActivity.loadTopicSubscriptions$lambda$11(this.f41256a, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadTopicSubscriptions$lambda$11(RelativeDataSettingsActivity this$0, RelativeResult relativeResult) {
        TopicSubscriptions topicSubscriptions;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            List list = (List) relativeResult.getData();
            if (list != null && (topicSubscriptions = (TopicSubscriptions) list.get(0)) != null) {
                ((lfk) this$0.getMBinding()).K.setSwitch(topicSubscriptions.getSubscribed());
            }
            Logger.i(TAG, "loadTopicSubscriptions success. result=" + relativeResult.getData() + " relativeUid=" + this$0.relativeUid + " code = " + relativeResult.getErrorCode() + " msg = " + relativeResult.getErrorMsg());
        } else {
            ToastExtKt.toastShort(this$0, t0j.e0);
            Logger.i(TAG, "loadTopicSubscriptions false. result=" + relativeResult.getData() + " relativeUid=" + this$0.relativeUid + " code = " + relativeResult.getErrorCode() + " msg = " + relativeResult.getErrorMsg());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(RelativeDataSettingsActivity this$0, RightArrowBindingSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(this$0, (Class<?>) DataSharedToTAActivity.class);
        intent.putExtra("key_relative_uid", this$0.relativeUid);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RelativeDataSettingsActivity this$0, RightArrowBindingSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(this$0, (Class<?>) DataSharedByTAActivity.class);
        intent.putExtra("key_relative_uid", this$0.relativeUid);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(RelativeDataSettingsActivity this$0, RightArrowBindingSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(this$0, (Class<?>) TimeScopeAccessibleToTAActivity.class);
        intent.putExtra("key_relative_uid", this$0.relativeUid);
        intent.putExtra(RelativeCareConstants.KEY_RELATIVE_SET, true);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RelativeDataSettingsActivity this$0, RightArrowBindingSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(this$0, (Class<?>) EditIdentityLabelActivity.class);
        intent.putExtra("key_relative_uid", this$0.relativeUid);
        intent.putExtra(RelativeCareConstants.KEY_RELATIVE_SET, true);
        intent.putExtra(RelativeCareConstants.KEY_ACCOUNT_NICKNAME, this$0.relativeNode);
        this$0.startActivityForResult(intent, 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(final RelativeDataSettingsActivity this$0, RightArrowBindingSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        RelativeCareUtil.INSTANCE.checkNetworkAndProcessIfAvailable(new Function0() { // from class: jhk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RelativeDataSettingsActivity.onCreate$lambda$5$lambda$4(this.f22812a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5$lambda$4(RelativeDataSettingsActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showUnfriendConfirmationDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onResume$lambda$7(final RelativeDataSettingsActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((lfk) this$0.getMBinding()).K.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ahk
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                RelativeDataSettingsActivity.onResume$lambda$7$lambda$6(this.f1030a, z, iSwitchButton);
            }
        });
        this$0.loadTopicSubscriptions();
        this$0.loadTimeScope();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResume$lambda$7$lambda$6(RelativeDataSettingsActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (NetworkUtils.isNetworkConnected(this$0)) {
            this$0.upTopicSubscriptions(z);
        } else {
            ((lfk) this$0.getMBinding()).K.setSwitch(!z);
            ToastExtKt.toastShort(this$0, t0j.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setRangeTypeFromLast(String last_data) {
        int i = Integer.parseInt(last_data);
        if (i == 1) {
            ((lfk) getMBinding()).C.setRemindText(getString(t0j.j0));
        } else if (i == 2) {
            ((lfk) getMBinding()).C.setRemindText(getString(t0j.j));
        } else {
            if (i != 3) {
                return;
            }
            ((lfk) getMBinding()).C.setRemindText(getString(t0j.f0));
        }
    }

    private final void showUnfriendConfirmationDialog() {
        CommonDialog<?> commonDialog = this.unfriendConfirmationDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            if (this.unfriendConfirmationDialog == null) {
                this.unfriendConfirmationDialog = new CommonDialog.c("unfriend_confirmation").setDialogDescription(t0j.f34176r).setPositiveText(t0j.c).setNegativeText(t0j.f34174b).setCancelable(true).create();
            }
            CommonDialog<?> commonDialog2 = this.unfriendConfirmationDialog;
            Intrinsics.checkNotNull(commonDialog2 != null ? commonDialog2.addDialogCallback(new AnonymousClass1()) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
            CommonDialog<?> commonDialog3 = this.unfriendConfirmationDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void upTopicSubscriptions(boolean isChecked) {
        int i = isChecked ? 1 : 2;
        RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) getMViewModel();
        Long l = this.relativeUid;
        Intrinsics.checkNotNull(l);
        relativeCareViewModel.upTopicSubscriptions(l.longValue(), "abnormal_event", i).observe(this, new RelativeDataSettingsActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: chk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeDataSettingsActivity.upTopicSubscriptions$lambda$12(this.f5351a, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit upTopicSubscriptions$lambda$12(RelativeDataSettingsActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            Logger.i(TAG, "upTopicSubscriptions success. result=" + relativeResult.getData() + " relativeUid=" + this$0.relativeUid);
        } else {
            ToastExtKt.toastShort(this$0, t0j.e0);
            Logger.i(TAG, "upTopicSubscriptions false. result=" + relativeResult.getData() + " relativeUid=" + this$0.relativeUid);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return xui.g;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 2 || data == null) {
            return;
        }
        this.relativeNode = data.getStringExtra("ket_request_set_node");
        Intent intent = new Intent();
        intent.putExtra("ket_request_set_node", this.relativeNode);
        setResult(-1, intent);
        Logger.i("onActivityResult requestCode:" + requestCode + "resultCode:" + resultCode + "data" + this.relativeNode, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.relative.ui.Hilt_RelativeDataSettingsActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.relativeUid = Long.valueOf(getIntent().getLongExtra("key_relative_uid", 0L));
        this.relativeNode = getIntent().getStringExtra(RelativeCareConstants.KEY_ACCOUNT_NICKNAME);
        Long l = this.relativeUid;
        if (l != null && l.longValue() == 0) {
            ToastExtKt.toastShort(this, "relativeUID==0");
            return;
        }
        setTitle(t0j.s0);
        setTitleBackground(vji.f36950b);
        UIUtils.INSTANCE.setNavigationBarColor(this, vji.f36950b);
        ViewExtKt.clickWithTrigger$default(((lfk) getMBinding()).D, 0L, new Function1() { // from class: ehk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeDataSettingsActivity.onCreate$lambda$0(this.f16651a, (RightArrowBindingSingleLineTextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(((lfk) getMBinding()).E, 0L, new Function1() { // from class: fhk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeDataSettingsActivity.onCreate$lambda$1(this.f17789a, (RightArrowBindingSingleLineTextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(((lfk) getMBinding()).C, 0L, new Function1() { // from class: ghk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeDataSettingsActivity.onCreate$lambda$2(this.f19004a, (RightArrowBindingSingleLineTextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(((lfk) getMBinding()).A, 0L, new Function1() { // from class: hhk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeDataSettingsActivity.onCreate$lambda$3(this.f20074a, (RightArrowBindingSingleLineTextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(((lfk) getMBinding()).L, 0L, new Function1() { // from class: ihk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeDataSettingsActivity.onCreate$lambda$5(this.f21152a, (RightArrowBindingSingleLineTextView) obj);
            }
        }, 1, null);
        ((lfk) getMBinding()).K.setSubTitleMaxLines(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "set_exception_subscription"), TuplesKt.to("result", Boolean.valueOf(((lfk) getMBinding()).K.getSwitch())), TuplesKt.to("user_id", MD5Util.MD5(String.valueOf(this.relativeUid))), TuplesKt.to("tip", "56.58.2.1.25037")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
        TextView noNetwork = ((lfk) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
        LinearLayout content = ((lfk) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        relativeCareUtil.handleUnavailableNetworkAndShowFallbackPageIfNeed(noNetwork, content, new Function0() { // from class: bhk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RelativeDataSettingsActivity.onResume$lambda$7(this.f4219a);
            }
        });
    }
}
