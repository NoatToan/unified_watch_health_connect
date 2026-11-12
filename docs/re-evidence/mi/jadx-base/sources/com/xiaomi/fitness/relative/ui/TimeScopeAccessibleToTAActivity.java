package com.xiaomi.fitness.relative.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.server.model.RelativeSetting;
import com.xiaomi.fitness.relative.ui.TimeScopeAccessibleToTAActivity;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import defpackage.hfk;
import defpackage.t0j;
import defpackage.vji;
import defpackage.xui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\t\b\u0007¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\tR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010!\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0006¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/TimeScopeAccessibleToTAActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Lhfk;", "", "getDataSharedTimeScopeFromInput", "()I", "", "prefillWithDefault", "()V", "requestDataAndPrefill", "timeScopeValue", "setRangeTypeFromLast", "(I)V", "upSettingData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", LifecycleConstantKt.ON_RESUME, "", "relativeUid", "Ljava/lang/Long;", "", "relativesSettlingFlag", "Z", "selectedTimeScope", "I", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTimeScopeAccessibleToTAActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeScopeAccessibleToTAActivity.kt\ncom/xiaomi/fitness/relative/ui/TimeScopeAccessibleToTAActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1863#2,2:171\n*S KotlinDebug\n*F\n+ 1 TimeScopeAccessibleToTAActivity.kt\ncom/xiaomi/fitness/relative/ui/TimeScopeAccessibleToTAActivity\n*L\n122#1:171,2\n*E\n"})
public final class TimeScopeAccessibleToTAActivity extends Hilt_TimeScopeAccessibleToTAActivity<RelativeCareViewModel, hfk> {

    @NotNull
    public static final String TAG = "TimeScopeAccessibleToTAActivity";

    @Nullable
    private Long relativeUid;
    private boolean relativesSettlingFlag;
    private int selectedTimeScope = 3;

    /* JADX WARN: Multi-variable type inference failed */
    private final int getDataSharedTimeScopeFromInput() {
        int checkedRadioButtonId = ((hfk) getMBinding()).F.getCheckedRadioButtonId();
        if (checkedRadioButtonId == ((hfk) getMBinding()).H.getId()) {
            this.selectedTimeScope = 1;
        } else if (checkedRadioButtonId == ((hfk) getMBinding()).G.getId()) {
            this.selectedTimeScope = 2;
        } else if (checkedRadioButtonId == ((hfk) getMBinding()).E.getId()) {
            this.selectedTimeScope = 3;
        }
        Logger.d(TAG, "getDataSharedTimeScopeFromInput selectedTimeScope=" + this.selectedTimeScope);
        return this.selectedTimeScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(final TimeScopeAccessibleToTAActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.selectedTimeScope = this$0.getDataSharedTimeScopeFromInput();
        if (this$0.relativesSettlingFlag) {
            RelativeCareUtil.INSTANCE.checkHealthCloudSynchronizationAndProceedIfNeed(this$0, new Function0() { // from class: sep
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TimeScopeAccessibleToTAActivity.onCreate$lambda$2$lambda$1(this.f33570a);
                }
            });
        } else {
            Intent intent = new Intent(this$0, (Class<?>) EditIdentityLabelActivity.class);
            intent.putExtras(this$0.getIntent());
            intent.putExtra(RelativeCareConstants.KEY_DATA_SHARE_TIME_SCOPE, this$0.selectedTimeScope);
            this$0.startActivity(intent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2$lambda$1(TimeScopeAccessibleToTAActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.upSettingData();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(TimeScopeAccessibleToTAActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestDataAndPrefill();
        return Unit.INSTANCE;
    }

    private final void prefillWithDefault() {
        Logger.d(TAG, "prefillWithDefault selectedTimeScope=" + this.selectedTimeScope);
        setRangeTypeFromLast(this.selectedTimeScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestDataAndPrefill() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("data_shared_time_scope");
        RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) getMViewModel();
        Long l = this.relativeUid;
        Intrinsics.checkNotNull(l);
        relativeCareViewModel.getRelativeSettings(l.longValue(), arrayList).observe(this, new TimeScopeAccessibleToTAActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rep
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TimeScopeAccessibleToTAActivity.requestDataAndPrefill$lambda$5(this.f32474a, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDataAndPrefill$lambda$5(TimeScopeAccessibleToTAActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            List<RelativeSetting> list = (List) relativeResult.getData();
            if (list != null) {
                for (RelativeSetting relativeSetting : list) {
                    if (Intrinsics.areEqual(relativeSetting.getKey(), "data_shared_time_scope")) {
                        this$0.setRangeTypeFromLast(Integer.parseInt(relativeSetting.getValue()));
                        Logger.i(TAG, "loadSettingData DATA_SHARED_TIME_SCOPE=" + relativeSetting.getValue());
                    }
                }
            }
        } else {
            ToastExtKt.toastShort(this$0, t0j.e0);
            Logger.i(TAG, "loadSettingData false. result=" + relativeResult.getData() + " relativeUid=" + this$0.relativeUid + " code = " + relativeResult.getErrorCode() + " msg = " + relativeResult.getErrorMsg());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setRangeTypeFromLast(int timeScopeValue) {
        if (timeScopeValue == 1) {
            ((hfk) getMBinding()).H.setChecked(true);
        } else if (timeScopeValue == 2) {
            ((hfk) getMBinding()).G.setChecked(true);
        } else {
            if (timeScopeValue != 3) {
                return;
            }
            ((hfk) getMBinding()).E.setChecked(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void upSettingData() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RelativeSetting("data_shared_time_scope", String.valueOf(getDataSharedTimeScopeFromInput())));
        RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) getMViewModel();
        Long l = this.relativeUid;
        Intrinsics.checkNotNull(l);
        relativeCareViewModel.upRelativeSettings(l.longValue(), arrayList).observe(this, new TimeScopeAccessibleToTAActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qep
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TimeScopeAccessibleToTAActivity.upSettingData$lambda$6(this.f31447a, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit upSettingData$lambda$6(TimeScopeAccessibleToTAActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            ToastExtKt.toastShort(this$0, t0j.v0);
            this$0.finish();
        } else {
            ToastExtKt.toastShort(this$0, t0j.e0);
            Logger.i(TAG, "upSettingData false. result=" + relativeResult.getData() + " relativeUid=" + this$0.relativeUid + " code = " + relativeResult.getErrorCode() + " choice = " + this$0.getDataSharedTimeScopeFromInput());
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return xui.e;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.relative.ui.Hilt_TimeScopeAccessibleToTAActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(t0j.y);
        this.relativeUid = Long.valueOf(getIntent().getLongExtra("key_relative_uid", 0L));
        this.relativesSettlingFlag = getIntent().getBooleanExtra(RelativeCareConstants.KEY_RELATIVE_SET, false);
        Logger.i(TAG, "relativeUid=" + this.relativeUid);
        Long l = this.relativeUid;
        if (l != null && l.longValue() == 0) {
            ToastExtKt.toastShort(this, "relativeUid==0");
            return;
        }
        if (savedInstanceState != null) {
            this.selectedTimeScope = getIntent().getIntExtra(RelativeCareConstants.KEY_DATA_SHARE_TIME_SCOPE, 3);
        }
        UIUtils.INSTANCE.setNavigationBarColor(this, vji.f36950b);
        setTitleBackground(vji.f36950b);
        ViewExtKt.clickWithTrigger$default(((hfk) getMBinding()).B, 0L, new Function1() { // from class: tep
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TimeScopeAccessibleToTAActivity.onCreate$lambda$2(this.f34626a, (TextView) obj);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.relativesSettlingFlag) {
            prefillWithDefault();
            return;
        }
        RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
        TextView noNetwork = ((hfk) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
        ConstraintLayout content = ((hfk) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        relativeCareUtil.handleUnavailableNetworkAndShowFallbackPageIfNeed(noNetwork, content, new Function0() { // from class: pep
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimeScopeAccessibleToTAActivity.onResume$lambda$3(this.f30328a);
            }
        });
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(RelativeCareConstants.KEY_DATA_SHARE_TIME_SCOPE, this.selectedTimeScope);
    }
}
