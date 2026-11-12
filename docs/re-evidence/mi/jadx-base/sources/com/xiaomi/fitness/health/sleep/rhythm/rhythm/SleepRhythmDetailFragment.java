package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.lifecycle.Observer;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.body;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepProjectReport;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmPreference;
import com.xiaomi.fitness.health.sleep.rhythm.data.ResearchPresignedUrlResponse;
import com.xiaomi.fitness.health.sleep.rhythm.data.SleepRhythmProjectUserInfo;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailFragment;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import defpackage.a4i;
import defpackage.av6;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.nwi;
import defpackage.pni;
import defpackage.qxi;
import defpackage.uvb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001TB\u0007¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J)\u0010\u0015\u001a\u00020\u00042\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010$\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0006J#\u0010)\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040'H\u0002¢\u0006\u0004\b)\u0010*J-\u0010.\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040-H\u0002¢\u0006\u0004\b.\u0010/J!\u00102\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b4\u00105J)\u0010:\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00122\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailViewModel;", "Luvb;", "", "initView", "()V", "requestRhythmData", "Lcom/xiaomi/fit/fitness/export/data/project/SleepProjectReport;", "sleepRhythmReports", "initBaseView", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepProjectReport;)V", "Landroid/view/View;", "view", "showPopupMenu", "(Landroid/view/View;)V", "downLoadSelect", "Lkotlin/Function2;", "", "", "isUse", "checkRhythmValue", "(Lkotlin/jvm/functions/Function2;)V", "", "idNumber", "formatIdNumber", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmProjectUserInfo;", "sleepRhythmProjectUserInfo", "onInfoInput", "(Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmProjectUserInfo;)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "mDialog", "name", "phone", "upToRemote", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;Ljava/lang/String;Ljava/lang/String;)V", "showUpSleepRhythmSuccessDialog", "Lkotlin/Function1;", OvulationTestRecord.Result.POSITIVE, "showRecordDownLoadRemindDialog", "(Lkotlin/jvm/functions/Function1;)V", "days", "isDownLoad", "Lkotlin/Function0;", "showPDFUseRemindDialog", "(IZLkotlin/jvm/functions/Function0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Luvb;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter;", "mSleepRhythmChatListAdapter$delegate", "Lkotlin/Lazy;", "getMSleepRhythmChatListAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter;", "mSleepRhythmChatListAdapter", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter;", "mSleepRhythmSleepItemAdapter$delegate", "getMSleepRhythmSleepItemAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter;", "mSleepRhythmSleepItemAdapter", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "sleepRhythmReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "isCycle", "Ljava/lang/Boolean;", "", "getStartTime", "()J", "startTime", "getCycleDay", "()I", "cycleDay", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepRhythmDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmDetailFragment.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,718:1\n1863#2,2:719\n1863#2,2:722\n1010#2,2:725\n1863#2,2:727\n216#3:721\n217#3:724\n65#4,16:729\n93#4,3:745\n*S KotlinDebug\n*F\n+ 1 SleepRhythmDetailFragment.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailFragment\n*L\n203#1:719,2\n235#1:722,2\n243#1:725,2\n439#1:727,2\n234#1:721\n234#1:724\n479#1:729,16\n479#1:745,3\n*E\n"})
public final class SleepRhythmDetailFragment extends Hilt_SleepRhythmDetailFragment<SleepRhythmDetailViewModel, uvb> {
    public static final int INTENT_REQUEST_EDIT_DIARY_CODE = 10001;

    @NotNull
    public static final String INTENT_REQUEST_END_LIMIT = "request_end_limit";
    public static final int INTENT_REQUEST_REMOTE = 10002;

    @NotNull
    public static final String INTENT_REQUEST_RHYTHM_TYPE = "type";

    @NotNull
    public static final String INTENT_REQUEST_START_TIME = "request_start_time";

    @NotNull
    public static final String PARAM_REPORT = "report";

    @NotNull
    public static final String PARAM_REPORT_IS_CYCLE = "request_is_cycle";

    @NotNull
    public static final String PARAM_REPORT_PROJECT = "report_project";

    @Nullable
    private Boolean isCycle;

    /* JADX INFO: renamed from: mSleepRhythmChatListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepRhythmChatListAdapter;

    /* JADX INFO: renamed from: mSleepRhythmSleepItemAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepRhythmSleepItemAdapter;

    @Nullable
    private SleepRhythmReport sleepRhythmReport;

    public SleepRhythmDetailFragment() {
        super(jui.N3);
        this.mSleepRhythmChatListAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: usm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepRhythmDetailFragment.mSleepRhythmChatListAdapter_delegate$lambda$0();
            }
        });
        this.mSleepRhythmSleepItemAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vsm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepRhythmDetailFragment.mSleepRhythmSleepItemAdapter_delegate$lambda$1();
            }
        });
        this.isCycle = Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepRhythmDetailViewModel access$getMViewModel(SleepRhythmDetailFragment sleepRhythmDetailFragment) {
        return (SleepRhythmDetailViewModel) sleepRhythmDetailFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$4(SleepRhythmDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((SleepRhythmDetailViewModel) this$0.getMViewModel()).getLocalSleepRhythmDiaryInfo().getValue() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        SleepProjectReport value = ((SleepRhythmDetailViewModel) this$0.getMViewModel()).getLocalSleepRhythmDiaryInfo().getValue();
        Intrinsics.checkNotNull(value);
        bundle.putLong(SleepDiaryUpdateFragment.INTENT_REQUEST_TIME, value.getTime());
        SleepRhythmReport sleepRhythmReport = this$0.sleepRhythmReport;
        bundle.putString(SleepDiaryUpdateFragment.INTENT_REQUEST_SID, sleepRhythmReport != null ? sleepRhythmReport.getSid() : null);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.85.0.1.35882"), TuplesKt.to("name", "sleep_diary_modify")));
        BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) SleepDiaryUpdateFragment.class, bundle, 10001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$6(SleepRhythmDetailFragment this$0, RightArrowSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundle = new Bundle();
        bundle.putSerializable("report", this$0.sleepRhythmReport);
        Unit unit = Unit.INSTANCE;
        BaseFragmentExKt.gotoPage(this$0, SleepRhythmAllFragment.class, bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8(SleepRhythmDetailFragment this$0, RightArrowSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundle = new Bundle();
        bundle.putSerializable("report", this$0.sleepRhythmReport);
        Unit unit = Unit.INSTANCE;
        BaseFragmentExKt.gotoPage(this$0, SleepRhythmSleepChatAllFragment.class, bundle);
        return Unit.INSTANCE;
    }

    private final void checkRhythmValue(Function2<? super Integer, ? super Boolean, Unit> isUse) {
        if (getCycleDay() != 14 && getCycleDay() != 28) {
            isUse.invoke(10, Boolean.FALSE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SleepRhythmChatListAdapter.SleepRhythmChartValue sleepRhythmChartValue : getMSleepRhythmChatListAdapter().getChartValue()) {
            if ((!sleepRhythmChartValue.getSleepValue().isEmpty()) || (!sleepRhythmChartValue.getBodyValue().isEmpty()) || (!sleepRhythmChartValue.getBedValue().isEmpty()) || (!sleepRhythmChartValue.getLightValue().isEmpty())) {
                arrayList.add(Long.valueOf(sleepRhythmChartValue.getTime()));
            }
        }
        if (getCycleDay() == 14) {
            if (arrayList.size() < 10 || !SleepRhythmHandle.INSTANCE.hasConsecutiveDays(arrayList, 7)) {
                isUse.invoke(10, Boolean.FALSE);
                return;
            } else {
                isUse.invoke(10, Boolean.TRUE);
                return;
            }
        }
        if (arrayList.size() < 20 || !SleepRhythmHandle.INSTANCE.hasConsecutiveDays(arrayList, 14)) {
            isUse.invoke(20, Boolean.FALSE);
        } else {
            isUse.invoke(20, Boolean.TRUE);
        }
    }

    private final void downLoadSelect() {
        showRecordDownLoadRemindDialog(new Function1() { // from class: htm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmDetailFragment.downLoadSelect$lambda$20(this.f20443a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit downLoadSelect$lambda$20(final SleepRhythmDetailFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, true, 3, null);
        if (((SleepRhythmDetailViewModel) this$0.getMViewModel()).getLocalSleepRhythmDiaryInfoData() != null) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.87.0.1.35886"), TuplesKt.to("name", "download_type"), TuplesKt.to("type", Integer.valueOf(i))));
            if (i == 0) {
                SleepRhythmPDFUploader sleepRhythmPDFUploader = SleepRhythmPDFUploader.INSTANCE;
                SleepRhythmReport sleepRhythmReport = this$0.sleepRhythmReport;
                long time = sleepRhythmReport != null ? sleepRhythmReport.getTime() : 0L;
                SleepRhythmReport sleepRhythmReport2 = this$0.sleepRhythmReport;
                int cycleDay = sleepRhythmReport2 != null ? sleepRhythmReport2.getCycleDay() : 1;
                LinearLayout pdfView = ((uvb) this$0.getMBinding()).Q;
                Intrinsics.checkNotNullExpressionValue(pdfView, "pdfView");
                View view = ((uvb) this$0.getMBinding()).K;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout = (LinearLayout) view;
                View view2 = ((uvb) this$0.getMBinding()).L;
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout2 = (LinearLayout) view2;
                View view3 = ((uvb) this$0.getMBinding()).M;
                Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout3 = (LinearLayout) view3;
                View view4 = ((uvb) this$0.getMBinding()).N;
                Intrinsics.checkNotNull(view4, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout4 = (LinearLayout) view4;
                FragmentActivity mActivity = this$0.getMActivity();
                Intrinsics.checkNotNull(mActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
                SleepProjectReport localSleepRhythmDiaryInfoData = ((SleepRhythmDetailViewModel) this$0.getMViewModel()).getLocalSleepRhythmDiaryInfoData();
                SleepRhythmDetailViewModel sleepRhythmDetailViewModel = (SleepRhythmDetailViewModel) this$0.getMViewModel();
                SleepProjectReport localSleepRhythmDiaryInfoData2 = ((SleepRhythmDetailViewModel) this$0.getMViewModel()).getLocalSleepRhythmDiaryInfoData();
                Intrinsics.checkNotNull(localSleepRhythmDiaryInfoData2);
                sleepRhythmPDFUploader.downLoadPDF(time, cycleDay, pdfView, linearLayout, linearLayout2, linearLayout3, linearLayout4, (BaseActivity) mActivity, localSleepRhythmDiaryInfoData, sleepRhythmDetailViewModel.convertBasicSleepData(localSleepRhythmDiaryInfoData2, this$0.getStartTime(), this$0.getCycleDay(), false), new Function1() { // from class: tsm
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SleepRhythmDetailFragment.downLoadSelect$lambda$20$lambda$18(this.f35001a, (String) obj);
                    }
                });
            } else {
                SleepRhythmHandle sleepRhythmHandle = SleepRhythmHandle.INSTANCE;
                SleepRhythmReport sleepRhythmReport3 = this$0.sleepRhythmReport;
                long time2 = sleepRhythmReport3 != null ? sleepRhythmReport3.getTime() : 0L;
                SleepRhythmReport sleepRhythmReport4 = this$0.sleepRhythmReport;
                int cycleDay2 = sleepRhythmReport4 != null ? sleepRhythmReport4.getCycleDay() : 1;
                LinearLayout pdfView2 = ((uvb) this$0.getMBinding()).Q;
                Intrinsics.checkNotNullExpressionValue(pdfView2, "pdfView");
                View view5 = ((uvb) this$0.getMBinding()).K;
                Intrinsics.checkNotNull(view5, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout5 = (LinearLayout) view5;
                FragmentActivity mActivity2 = this$0.getMActivity();
                Intrinsics.checkNotNull(mActivity2);
                SleepProjectReport localSleepRhythmDiaryInfoData3 = ((SleepRhythmDetailViewModel) this$0.getMViewModel()).getLocalSleepRhythmDiaryInfoData();
                SleepRhythmDetailViewModel sleepRhythmDetailViewModel2 = (SleepRhythmDetailViewModel) this$0.getMViewModel();
                SleepProjectReport localSleepRhythmDiaryInfoData4 = ((SleepRhythmDetailViewModel) this$0.getMViewModel()).getLocalSleepRhythmDiaryInfoData();
                Intrinsics.checkNotNull(localSleepRhythmDiaryInfoData4);
                sleepRhythmHandle.createDownLoadView(time2, cycleDay2, pdfView2, linearLayout5, (BaseActivity) mActivity2, localSleepRhythmDiaryInfoData3, sleepRhythmDetailViewModel2.convertBasicSleepData(localSleepRhythmDiaryInfoData4, this$0.getStartTime(), this$0.getCycleDay(), false), new Function1() { // from class: etm
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SleepRhythmDetailFragment.downLoadSelect$lambda$20$lambda$19(this.f17062a, (String) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downLoadSelect$lambda$20$lambda$18(SleepRhythmDetailFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        ShareUtil shareUtil = ShareUtil.INSTANCE;
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        shareUtil.sharePdf(new WeakReference<>(mActivity), it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downLoadSelect$lambda$20$lambda$19(SleepRhythmDetailFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    private final String formatIdNumber(String idNumber) {
        if (idNumber.length() < 4) {
            return idNumber;
        }
        String strSubstring = idNumber.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = idNumber.substring(idNumber.length() - 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring + StringsKt__StringsJVMKt.repeat(Marker.ANY_MARKER, idNumber.length() - 4) + strSubstring2;
    }

    private final int getCycleDay() {
        SleepRhythmReport sleepRhythmReport = this.sleepRhythmReport;
        if (sleepRhythmReport != null) {
            return sleepRhythmReport.getCycleDay();
        }
        return 1;
    }

    private final SleepRhythmChatListAdapter getMSleepRhythmChatListAdapter() {
        return (SleepRhythmChatListAdapter) this.mSleepRhythmChatListAdapter.getValue();
    }

    private final SleepRhythmSleepItemAdapter getMSleepRhythmSleepItemAdapter() {
        return (SleepRhythmSleepItemAdapter) this.mSleepRhythmSleepItemAdapter.getValue();
    }

    private final long getStartTime() {
        SleepRhythmReport sleepRhythmReport = this.sleepRhythmReport;
        if (sleepRhythmReport != null) {
            return sleepRhythmReport.getTime();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBaseView(SleepProjectReport sleepRhythmReports) {
        Boolean bool = this.isCycle;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            RightArrowSingleLineTextView healthSleepRhythmItemIcon = ((uvb) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(healthSleepRhythmItemIcon, "healthSleepRhythmItemIcon");
            ViewExtKt.gone(healthSleepRhythmItemIcon);
            RightArrowSingleLineTextView sleepDetailTitle = ((uvb) getMBinding()).V;
            Intrinsics.checkNotNullExpressionValue(sleepDetailTitle, "sleepDetailTitle");
            ViewExtKt.gone(sleepDetailTitle);
            ImageView healthSleepRhythmEditIcon = ((uvb) getMBinding()).I;
            Intrinsics.checkNotNullExpressionValue(healthSleepRhythmEditIcon, "healthSleepRhythmEditIcon");
            ViewExtKt.gone(healthSleepRhythmEditIcon);
        } else {
            RightArrowSingleLineTextView healthSleepRhythmItemIcon2 = ((uvb) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(healthSleepRhythmItemIcon2, "healthSleepRhythmItemIcon");
            ViewExtKt.visible(healthSleepRhythmItemIcon2);
            RightArrowSingleLineTextView sleepDetailTitle2 = ((uvb) getMBinding()).V;
            Intrinsics.checkNotNullExpressionValue(sleepDetailTitle2, "sleepDetailTitle");
            ViewExtKt.visible(sleepDetailTitle2);
            ImageView healthSleepRhythmEditIcon2 = ((uvb) getMBinding()).I;
            Intrinsics.checkNotNullExpressionValue(healthSleepRhythmEditIcon2, "healthSleepRhythmEditIcon");
            ViewExtKt.visible(healthSleepRhythmEditIcon2);
        }
        Map<Long, SleepDiaryReport> sleepDiaryInfoList = sleepRhythmReports.getSleepDiaryInfoList();
        if (sleepDiaryInfoList == null || sleepDiaryInfoList.isEmpty()) {
            View sleepDiaryEmptyView = ((uvb) getMBinding()).W;
            Intrinsics.checkNotNullExpressionValue(sleepDiaryEmptyView, "sleepDiaryEmptyView");
            ViewExtKt.visible(sleepDiaryEmptyView);
            SleepRhythmDetailDiaryView sleepRhythmDiaryView = ((uvb) getMBinding()).Z;
            Intrinsics.checkNotNullExpressionValue(sleepRhythmDiaryView, "sleepRhythmDiaryView");
            ViewExtKt.gone(sleepRhythmDiaryView);
            SleepRhythmDetailDiaryListView sleepRhythmDiaryListView = ((uvb) getMBinding()).Y;
            Intrinsics.checkNotNullExpressionValue(sleepRhythmDiaryListView, "sleepRhythmDiaryListView");
            ViewExtKt.gone(sleepRhythmDiaryListView);
        } else {
            View sleepDiaryEmptyView2 = ((uvb) getMBinding()).W;
            Intrinsics.checkNotNullExpressionValue(sleepDiaryEmptyView2, "sleepDiaryEmptyView");
            ViewExtKt.gone(sleepDiaryEmptyView2);
            if (Intrinsics.areEqual(this.isCycle, bool2)) {
                SleepRhythmDetailDiaryListView sleepRhythmDiaryListView2 = ((uvb) getMBinding()).Y;
                Intrinsics.checkNotNullExpressionValue(sleepRhythmDiaryListView2, "sleepRhythmDiaryListView");
                ViewExtKt.visible(sleepRhythmDiaryListView2);
                SleepRhythmDetailDiaryView sleepRhythmDiaryView2 = ((uvb) getMBinding()).Z;
                Intrinsics.checkNotNullExpressionValue(sleepRhythmDiaryView2, "sleepRhythmDiaryView");
                ViewExtKt.gone(sleepRhythmDiaryView2);
                SleepRhythmDetailDiaryListView sleepRhythmDetailDiaryListView = ((uvb) getMBinding()).Y;
                Map<Long, SleepDiaryReport> sleepDiaryInfoList2 = sleepRhythmReports.getSleepDiaryInfoList();
                Intrinsics.checkNotNull(sleepDiaryInfoList2);
                sleepRhythmDetailDiaryListView.updateDiaryView(CollectionsKt___CollectionsKt.toMutableList((Collection) sleepDiaryInfoList2.values()), getStartTime(), getCycleDay());
            } else {
                SleepRhythmDetailDiaryListView sleepRhythmDiaryListView3 = ((uvb) getMBinding()).Y;
                Intrinsics.checkNotNullExpressionValue(sleepRhythmDiaryListView3, "sleepRhythmDiaryListView");
                ViewExtKt.gone(sleepRhythmDiaryListView3);
                SleepRhythmDetailDiaryView sleepRhythmDiaryView3 = ((uvb) getMBinding()).Z;
                Intrinsics.checkNotNullExpressionValue(sleepRhythmDiaryView3, "sleepRhythmDiaryView");
                ViewExtKt.gone(sleepRhythmDiaryView3);
                View sleepDiaryEmptyView3 = ((uvb) getMBinding()).W;
                Intrinsics.checkNotNullExpressionValue(sleepDiaryEmptyView3, "sleepDiaryEmptyView");
                ViewExtKt.visible(sleepDiaryEmptyView3);
                Map<Long, SleepDiaryReport> sleepDiaryInfoList3 = sleepRhythmReports.getSleepDiaryInfoList();
                Intrinsics.checkNotNull(sleepDiaryInfoList3);
                for (SleepDiaryReport sleepDiaryReport : sleepDiaryInfoList3.values()) {
                    if (sleepDiaryReport.getTime() == getStartTime()) {
                        SleepRhythmDetailDiaryView sleepRhythmDiaryView4 = ((uvb) getMBinding()).Z;
                        Intrinsics.checkNotNullExpressionValue(sleepRhythmDiaryView4, "sleepRhythmDiaryView");
                        ViewExtKt.visible(sleepRhythmDiaryView4);
                        View sleepDiaryEmptyView4 = ((uvb) getMBinding()).W;
                        Intrinsics.checkNotNullExpressionValue(sleepDiaryEmptyView4, "sleepDiaryEmptyView");
                        ViewExtKt.gone(sleepDiaryEmptyView4);
                        ((uvb) getMBinding()).Z.updateDiaryView(sleepDiaryReport);
                    }
                }
            }
        }
        List<SleepRhythmChatListAdapter.SleepRhythmChartValue> listConvertBasicSleepData = ((SleepRhythmDetailViewModel) getMViewModel()).convertBasicSleepData(sleepRhythmReports, getStartTime(), getCycleDay(), true);
        if (listConvertBasicSleepData.isEmpty()) {
            View sleepRhythmChatEmptyView = ((uvb) getMBinding()).X;
            Intrinsics.checkNotNullExpressionValue(sleepRhythmChatEmptyView, "sleepRhythmChatEmptyView");
            ViewExtKt.visible(sleepRhythmChatEmptyView);
            LinearLayoutCompat chatListRootView = ((uvb) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(chatListRootView, "chatListRootView");
            ViewExtKt.gone(chatListRootView);
            RightArrowSingleLineTextView healthSleepRhythmItemIcon3 = ((uvb) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(healthSleepRhythmItemIcon3, "healthSleepRhythmItemIcon");
            ViewExtKt.gone(healthSleepRhythmItemIcon3);
        } else {
            View sleepRhythmChatEmptyView2 = ((uvb) getMBinding()).X;
            Intrinsics.checkNotNullExpressionValue(sleepRhythmChatEmptyView2, "sleepRhythmChatEmptyView");
            ViewExtKt.gone(sleepRhythmChatEmptyView2);
            LinearLayoutCompat chatListRootView2 = ((uvb) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(chatListRootView2, "chatListRootView");
            ViewExtKt.visible(chatListRootView2);
            RightArrowSingleLineTextView healthSleepRhythmItemIcon4 = ((uvb) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(healthSleepRhythmItemIcon4, "healthSleepRhythmItemIcon");
            ViewExtKt.visible(healthSleepRhythmItemIcon4);
            getMSleepRhythmChatListAdapter().updateDataList(listConvertBasicSleepData, getStartTime(), getCycleDay());
        }
        ((uvb) getMBinding()).U.setAdapter(getMSleepRhythmSleepItemAdapter());
        ArrayList arrayList = new ArrayList();
        Map<Long, List<SleepSegmentReport>> sleepReport = sleepRhythmReports.getSleepReport();
        if (sleepReport != null && !sleepReport.isEmpty()) {
            Map<Long, List<SleepSegmentReport>> sleepReport2 = sleepRhythmReports.getSleepReport();
            Intrinsics.checkNotNull(sleepReport2);
            for (Map.Entry<Long, List<SleepSegmentReport>> entry : sleepReport2.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                for (SleepSegmentReport sleepSegmentReport : entry.getValue()) {
                    if (sleepSegmentReport.hasStageData()) {
                        arrayList.add(new SleepRhythmSleepItemAdapter.SleepSegmentReportItem(jLongValue, sleepSegmentReport));
                    }
                }
            }
            if (arrayList.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailFragment$initBaseView$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepRhythmSleepItemAdapter.SleepSegmentReportItem) t).getTime()), Long.valueOf(((SleepRhythmSleepItemAdapter.SleepSegmentReportItem) t2).getTime()));
                    }
                });
            }
        }
        if (arrayList.isEmpty()) {
            LinearLayoutCompat sleepDetailChatRootView = ((uvb) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(sleepDetailChatRootView, "sleepDetailChatRootView");
            ViewExtKt.gone(sleepDetailChatRootView);
            RightArrowSingleLineTextView sleepDetailTitle3 = ((uvb) getMBinding()).V;
            Intrinsics.checkNotNullExpressionValue(sleepDetailTitle3, "sleepDetailTitle");
            ViewExtKt.gone(sleepDetailTitle3);
            View sleepDetailChatEmptyView = ((uvb) getMBinding()).S;
            Intrinsics.checkNotNullExpressionValue(sleepDetailChatEmptyView, "sleepDetailChatEmptyView");
            ViewExtKt.visible(sleepDetailChatEmptyView);
        } else {
            LinearLayoutCompat sleepDetailChatRootView2 = ((uvb) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(sleepDetailChatRootView2, "sleepDetailChatRootView");
            ViewExtKt.visible(sleepDetailChatRootView2);
            RightArrowSingleLineTextView sleepDetailTitle4 = ((uvb) getMBinding()).V;
            Intrinsics.checkNotNullExpressionValue(sleepDetailTitle4, "sleepDetailTitle");
            ViewExtKt.visible(sleepDetailTitle4);
            View sleepDetailChatEmptyView2 = ((uvb) getMBinding()).S;
            Intrinsics.checkNotNullExpressionValue(sleepDetailChatEmptyView2, "sleepDetailChatEmptyView");
            ViewExtKt.gone(sleepDetailChatEmptyView2);
        }
        getMSleepRhythmSleepItemAdapter().updateDataList(arrayList, getStartTime(), getCycleDay(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((SleepRhythmDetailViewModel) getMViewModel()).getLocalSleepRhythmDiaryInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: dtm
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepRhythmDetailFragment.initView$lambda$9(this.f15925a, (SleepProjectReport) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$9(SleepRhythmDetailFragment this$0, SleepProjectReport sleepProjectReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sleepProjectReport == null) {
            this$0.hideLoading();
            return;
        }
        Map<Long, SleepDiaryReport> sleepDiaryInfoList = sleepProjectReport.getSleepDiaryInfoList();
        Integer numValueOf = sleepDiaryInfoList != null ? Integer.valueOf(sleepDiaryInfoList.size()) : null;
        Map<Long, List<SleepSegmentReport>> sleepReport = sleepProjectReport.getSleepReport();
        Integer numValueOf2 = sleepReport != null ? Integer.valueOf(sleepReport.size()) : null;
        Map<Long, List<LightValueItem>> lightValueList = sleepProjectReport.getLightValueList();
        Integer numValueOf3 = lightValueList != null ? Integer.valueOf(lightValueList.size()) : null;
        Map<Long, List<body>> bodyMomentumList = sleepProjectReport.getBodyMomentumList();
        Logger.i(SleepRhythmHandle.TAG, "localSleepRhythmDiaryInfo = " + numValueOf + "  sleepReport = " + numValueOf2 + "  lightValueList = " + numValueOf3 + "  bodyMomentumList = " + (bodyMomentumList != null ? Integer.valueOf(bodyMomentumList.size()) : null) + " ");
        this$0.initBaseView(sleepProjectReport);
        this$0.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmChatListAdapter mSleepRhythmChatListAdapter_delegate$lambda$0() {
        return new SleepRhythmChatListAdapter(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmSleepItemAdapter mSleepRhythmSleepItemAdapter_delegate$lambda$1() {
        return new SleepRhythmSleepItemAdapter(new ArrayList());
    }

    private final void onInfoInput(final SleepRhythmProjectUserInfo sleepRhythmProjectUserInfo) {
        String phone_num;
        View viewInflate = LayoutInflater.from(getMActivity()).inflate(jui.P3, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(eri.Tc);
        final EditText editText = (EditText) viewInflate.findViewById(eri.Z7);
        final EditText editText2 = (EditText) viewInflate.findViewById(eri.Y7);
        editText.setText(sleepRhythmProjectUserInfo != null ? sleepRhythmProjectUserInfo.getUser_name() : null);
        if (sleepRhythmProjectUserInfo == null || (phone_num = sleepRhythmProjectUserInfo.getPhone_num()) == null) {
            phone_num = "";
        }
        editText2.setText(formatIdNumber(phone_num));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = sleepRhythmProjectUserInfo != null;
        final CommonDialog commonDialogCreate = new CommonDialog.c("health_sleep_rhythm_detail_up_dialog_title").setDialogTitle(c0j.xi).setDialogDescription(c0j.wi).setCustomView(viewInflate).setCanceledOnTouchOutside(true).create();
        Intrinsics.checkNotNull(editText2);
        editText2.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailFragment$onInfoInput$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                if (booleanRef.element) {
                    editText2.getText().clear();
                }
                booleanRef.element = false;
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: ftm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmDetailFragment.onInfoInput$lambda$25(editText2, editText, this, booleanRef, sleepRhythmProjectUserInfo, commonDialogCreate, view);
            }
        });
        commonDialogCreate.show(getParentFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onInfoInput$lambda$25(EditText editText, EditText editText2, final SleepRhythmDetailFragment this$0, Ref.BooleanRef needClear, SleepRhythmProjectUserInfo sleepRhythmProjectUserInfo, final CommonDialog commonDialog, View view) {
        String str;
        String string;
        String phone_num;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(needClear, "$needClear");
        Editable text = editText.getText();
        final String string2 = "";
        if (text != null && text.length() != 0) {
            Intrinsics.checkNotNull(editText2);
            if (!ViewExtKt.isTextNullOrEmpty(editText2)) {
                Editable text2 = editText2.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                if (StringsKt__StringsKt.contains$default((CharSequence) text2, (CharSequence) " ", false, 2, (Object) null)) {
                    FragmentActivity mActivity = this$0.getMActivity();
                    if (mActivity != null) {
                        String string3 = this$0.getString(c0j.cc);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        ToastExtKt.toastShort(mActivity, string3);
                        return;
                    }
                    return;
                }
                Regex regex = new Regex("^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$");
                if (!needClear.element) {
                    string = editText.getText().toString();
                } else if (sleepRhythmProjectUserInfo == null || (string = sleepRhythmProjectUserInfo.getPhone_num()) == null) {
                    string = "";
                }
                if (!regex.matches(string)) {
                    FragmentActivity mActivity2 = this$0.getMActivity();
                    if (mActivity2 != null) {
                        String string4 = this$0.getString(c0j.qj);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        ToastExtKt.toastShort(mActivity2, string4);
                        return;
                    }
                    return;
                }
                final String string5 = editText2.getText().toString();
                if (!needClear.element) {
                    string2 = editText.getText().toString();
                } else if (sleepRhythmProjectUserInfo != null && (phone_num = sleepRhythmProjectUserInfo.getPhone_num()) != null) {
                    string2 = phone_num;
                }
                if (!SleepRhythmPreference.INSTANCE.getHasShowRhythmUpLoadRemind()) {
                    this$0.checkRhythmValue(new Function2() { // from class: ktm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SleepRhythmDetailFragment.onInfoInput$lambda$25$lambda$24(this.f24286a, commonDialog, string5, string2, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
                        }
                    });
                    return;
                } else {
                    Intrinsics.checkNotNull(commonDialog);
                    this$0.upToRemote(commonDialog, string5, string2);
                    return;
                }
            }
        }
        Intrinsics.checkNotNull(editText2);
        if (ViewExtKt.isTextNullOrEmpty(editText2)) {
            String string6 = this$0.getString(c0j.Oj);
            Intrinsics.checkNotNull(editText);
            str = string6 + (ViewExtKt.isTextNullOrEmpty(editText) ? "，" : "");
        } else {
            str = "";
        }
        Intrinsics.checkNotNull(editText);
        if (ViewExtKt.isTextNullOrEmpty(editText)) {
            string2 = this$0.getString(c0j.Nj);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        FragmentActivity mActivity3 = this$0.getMActivity();
        if (mActivity3 != null) {
            ToastExtKt.toastShort(mActivity3, str + string2 + this$0.getString(c0j.M9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInfoInput$lambda$25$lambda$24(final SleepRhythmDetailFragment this$0, final CommonDialog commonDialog, final String name, final String phone, int i, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(phone, "$phone");
        if (z) {
            Intrinsics.checkNotNull(commonDialog);
            this$0.upToRemote(commonDialog, name, phone);
        } else {
            SleepRhythmPreference.INSTANCE.setHasShowRhythmUpLoadRemind(true);
            this$0.showPDFUseRemindDialog(i, false, new Function0() { // from class: gtm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SleepRhythmDetailFragment.onInfoInput$lambda$25$lambda$24$lambda$23(this.f19322a, commonDialog, name, phone);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInfoInput$lambda$25$lambda$24$lambda$23(SleepRhythmDetailFragment this$0, CommonDialog commonDialog, String name, String phone) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(phone, "$phone");
        Intrinsics.checkNotNull(commonDialog);
        this$0.upToRemote(commonDialog, name, phone);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(SleepRhythmDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.87.0.1.35887"), TuplesKt.to("name", "more_click")));
        Intrinsics.checkNotNull(view);
        this$0.showPopupMenu(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestRhythmData() {
        Logger.i(SleepRhythmHandle.TAG, "requestRhythmData startTime  = " + getStartTime() + "  endLimit = " + getCycleDay() + " ");
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        SleepRhythmDetailViewModel sleepRhythmDetailViewModel = (SleepRhythmDetailViewModel) getMViewModel();
        long startTime = getStartTime();
        long startTime2 = getStartTime() + (((long) (getCycleDay() + 1)) * 86400);
        SleepRhythmReport sleepRhythmReport = this.sleepRhythmReport;
        sleepRhythmDetailViewModel.requestRhythmData(startTime, startTime2, sleepRhythmReport != null ? sleepRhythmReport.getSid() : null);
    }

    private final void showPDFUseRemindDialog(int days, boolean isDownLoad, final Function0<Unit> positive) {
        CommonDialog commonDialogCreate = new CommonDialog.c("health_sleep_rhythm_download_pdf_use_remind").setDialogDescriptionString(new DialogParams.DialogDescriptionString(ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.L0, days, Integer.valueOf(days)))).setPositiveText(isDownLoad ? c0j.qi : c0j.ri).setNegativeText(c0j.c).setCanceledOnTouchOutside(true).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailFragment.showPDFUseRemindDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which == -1) {
                        positive.invoke();
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                } else if (dialog != null) {
                    dialog.dismiss();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.h);
        a4iVar.d().add(0, 1, 0, getString(c0j.Ei));
        a4iVar.d().add(0, 2, 0, getString(c0j.Kj));
        a4iVar.d().add(0, 3, 0, getString(c0j.zj));
        a4iVar.d().add(0, 4, 0, c0j.common_delete);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: wsm
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return SleepRhythmDetailFragment.showPopupMenu$lambda$17(this.f38320a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean showPopupMenu$lambda$17(final SleepRhythmDetailFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId == 2) {
                PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 3, null);
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.87.0.1.35888"), TuplesKt.to("name", "sleep_rhythm_disorders_data_detail_BDGJ")));
                ((SleepRhythmDetailViewModel) this$0.getMViewModel()).querySleepRhythmThirdAuthStatus().observe(this$0.getViewLifecycleOwner(), new Observer() { // from class: ysm
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        SleepRhythmDetailFragment.showPopupMenu$lambda$17$lambda$16(this.f40496a, (Boolean) obj);
                    }
                });
            } else if (itemId == 3) {
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.87.0.1.35891"), TuplesKt.to("name", "sleep_rhythm_disorders_data_detail_delete")));
                IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
                FragmentActivity mActivity = this$0.getMActivity();
                Intrinsics.checkNotNull(mActivity);
                healthPageExtKt.goToHealthVisitDoctorPage(mActivity, 7);
            } else if (itemId == 4) {
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.87.0.1.35890"), TuplesKt.to("name", "sleep_rhythm_disorders_data_detail_d")));
                CommonDialog commonDialogCreate = new CommonDialog.c("alert").setDialogTitle((DialogParams.DialogDescriptionString) null).setDialogDescription(c0j.Mj).setPositiveText(c0j.e).setCanceledOnTouchOutside(true).setNegativeText(c0j.c).create();
                commonDialogCreate.addDialogCallback(new SleepRhythmDetailFragment$showPopupMenu$1$3(this$0));
                commonDialogCreate.showIfNeed(this$0.getParentFragmentManager());
            }
        } else if (SleepRhythmPreference.INSTANCE.getHasShowRhythmDownLoadRemind()) {
            this$0.downLoadSelect();
        } else {
            this$0.checkRhythmValue(new Function2() { // from class: xsm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SleepRhythmDetailFragment.showPopupMenu$lambda$17$lambda$15(this.f39426a, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPopupMenu$lambda$17$lambda$15(final SleepRhythmDetailFragment this$0, int i, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.downLoadSelect();
        } else {
            SleepRhythmPreference.INSTANCE.setHasShowRhythmDownLoadRemind(true);
            this$0.showPDFUseRemindDialog(i, true, new Function0() { // from class: ntm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SleepRhythmDetailFragment.showPopupMenu$lambda$17$lambda$15$lambda$14(this.f28362a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPopupMenu$lambda$17$lambda$15$lambda$14(SleepRhythmDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.downLoadSelect();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupMenu$lambda$17$lambda$16(SleepRhythmDetailFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            this$0.onInfoInput(null);
        } else {
            BaseFragmentExKt.gotoPageForResult(this$0, SleepRhythmUpToRemoteFragment.class, 10002);
        }
    }

    private final void showRecordDownLoadRemindDialog(final Function1<? super Integer, Unit> positive) {
        String[] strArr = {getString(c0j.Fi), getString(c0j.Gi)};
        final Ref.IntRef intRef = new Ref.IntRef();
        CommonDialog commonDialogCreate = new CommonDialog.c("health_sleep_rhythm_download_select").setDialogTitle(c0j.Hi).setItems(strArr).setItemsCheckedIndex(intRef.element).setPositiveText(c0j.e).setNegativeText(c0j.c).setCanceledOnTouchOutside(true).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailFragment.showRecordDownLoadRemindDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which == -1) {
                        int i = intRef.element;
                        if (i == -1) {
                            FragmentActivity mActivity = this.getMActivity();
                            if (mActivity != null) {
                                String string = this.getString(c0j.Ii);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                ToastExtKt.toastShort(mActivity, string);
                                return;
                            }
                            return;
                        }
                        positive.invoke2(Integer.valueOf(i));
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                } else if (dialog != null) {
                    dialog.dismiss();
                }
                intRef.element = which;
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void showUpSleepRhythmSuccessDialog() {
        BaseFragmentExKt.gotoPage(this, SleepRhythmUpToRemoteSucFragment.class, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void upToRemote(final CommonDialog<DialogParams> mDialog, final String name, final String phone) {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.87.0.1.35889"), TuplesKt.to("name", "sleep_rhythm_disorders_data_detail_BDGJ_submit")));
        SleepRhythmPDFUploader sleepRhythmPDFUploader = SleepRhythmPDFUploader.INSTANCE;
        SleepRhythmReport sleepRhythmReport = this.sleepRhythmReport;
        long time = sleepRhythmReport != null ? sleepRhythmReport.getTime() : 0L;
        SleepRhythmReport sleepRhythmReport2 = this.sleepRhythmReport;
        int cycleDay = sleepRhythmReport2 != null ? sleepRhythmReport2.getCycleDay() : 1;
        LinearLayout pdfView = ((uvb) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(pdfView, "pdfView");
        View view = ((uvb) getMBinding()).K;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) view;
        View view2 = ((uvb) getMBinding()).L;
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout2 = (LinearLayout) view2;
        View view3 = ((uvb) getMBinding()).M;
        Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout3 = (LinearLayout) view3;
        View view4 = ((uvb) getMBinding()).N;
        Intrinsics.checkNotNull(view4, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout4 = (LinearLayout) view4;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        SleepProjectReport localSleepRhythmDiaryInfoData = ((SleepRhythmDetailViewModel) getMViewModel()).getLocalSleepRhythmDiaryInfoData();
        SleepRhythmDetailViewModel sleepRhythmDetailViewModel = (SleepRhythmDetailViewModel) getMViewModel();
        SleepProjectReport localSleepRhythmDiaryInfoData2 = ((SleepRhythmDetailViewModel) getMViewModel()).getLocalSleepRhythmDiaryInfoData();
        Intrinsics.checkNotNull(localSleepRhythmDiaryInfoData2);
        sleepRhythmPDFUploader.downLoadPDF(time, cycleDay, pdfView, linearLayout, linearLayout2, linearLayout3, linearLayout4, (BaseActivity) mActivity, localSleepRhythmDiaryInfoData, sleepRhythmDetailViewModel.convertBasicSleepData(localSleepRhythmDiaryInfoData2, getStartTime(), getCycleDay(), false), new Function1() { // from class: mtm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmDetailFragment.upToRemote$lambda$29(this.f27205a, name, phone, mDialog, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit upToRemote$lambda$29(final SleepRhythmDetailFragment this$0, final String name, final String phone, final CommonDialog mDialog, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(phone, "$phone");
        Intrinsics.checkNotNullParameter(mDialog, "$mDialog");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        SleepRhythmDetailViewModel sleepRhythmDetailViewModel = (SleepRhythmDetailViewModel) this$0.getMViewModel();
        SleepRhythmReport sleepRhythmReport = this$0.sleepRhythmReport;
        String sid = sleepRhythmReport != null ? sleepRhythmReport.getSid() : null;
        SleepRhythmReport sleepRhythmReport2 = this$0.sleepRhythmReport;
        Intrinsics.checkNotNull(sleepRhythmReport2);
        sleepRhythmDetailViewModel.getPDFUploadUrl(sid, it, sleepRhythmReport2.getTime(), new Function2() { // from class: ctm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepRhythmDetailFragment.upToRemote$lambda$29$lambda$28(this.f14705a, name, phone, mDialog, ((Boolean) obj).booleanValue(), (ResearchPresignedUrlResponse) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit upToRemote$lambda$29$lambda$28(final SleepRhythmDetailFragment this$0, String name, String phone, final CommonDialog mDialog, boolean z, ResearchPresignedUrlResponse researchPresignedUrlResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(phone, "$phone");
        Intrinsics.checkNotNullParameter(mDialog, "$mDialog");
        if (!z || researchPresignedUrlResponse == null) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                String string = this$0.getString(c0j.Jj);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ToastExtKt.toastShort(mActivity, string);
            }
            this$0.hideLoading();
        } else {
            SleepRhythmDetailViewModel sleepRhythmDetailViewModel = (SleepRhythmDetailViewModel) this$0.getMViewModel();
            SleepRhythmReport sleepRhythmReport = this$0.sleepRhythmReport;
            String sid = sleepRhythmReport != null ? sleepRhythmReport.getSid() : null;
            Intrinsics.checkNotNull(sid);
            SleepRhythmReport sleepRhythmReport2 = this$0.sleepRhythmReport;
            Intrinsics.checkNotNull(sleepRhythmReport2);
            sleepRhythmDetailViewModel.setUserInfo(sid, sleepRhythmReport2.getTime(), researchPresignedUrlResponse.getUrl(), name, phone, new Function1() { // from class: itm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepRhythmDetailFragment.upToRemote$lambda$29$lambda$28$lambda$26(this.f22081a, mDialog, ((Boolean) obj).booleanValue());
                }
            }, new Function1() { // from class: jtm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepRhythmDetailFragment.upToRemote$lambda$29$lambda$28$lambda$27(this.f23124a, (String) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit upToRemote$lambda$29$lambda$28$lambda$26(SleepRhythmDetailFragment this$0, CommonDialog mDialog, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mDialog, "$mDialog");
        this$0.hideLoading();
        this$0.showUpSleepRhythmSuccessDialog();
        mDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit upToRemote$lambda$29$lambda$28$lambda$27(SleepRhythmDetailFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            String string = this$0.getString(c0j.Jj);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(mActivity, string);
        }
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull uvb uvbVar) {
        Intrinsics.checkNotNullParameter(uvbVar, "<this>");
        uvbVar.B.setAdapter(getMSleepRhythmChatListAdapter());
        uvbVar.B.addItemDecoration(new SleepDiaryUpdateFragment.SpaceItemDecoration());
        uvbVar.I.setOnClickListener(new View.OnClickListener() { // from class: zsm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmDetailFragment.bindView$lambda$4(this.f41635a, view);
            }
        });
        ViewExtKt.clickWithTrigger$default(uvbVar.J, 0L, new Function1() { // from class: atm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmDetailFragment.bindView$lambda$6(this.f3441a, (RightArrowSingleLineTextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(uvbVar.V, 0L, new Function1() { // from class: btm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmDetailFragment.bindView$lambda$8(this.f4596a, (RightArrowSingleLineTextView) obj);
            }
        }, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == 10001) {
            requestRhythmData();
        }
        if (resultCode == -1 && requestCode == 10002) {
            onInfoInput(null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.sleepRhythmReport = (SleepRhythmReport) (arguments != null ? arguments.getSerializable("report") : null);
        Bundle arguments2 = getArguments();
        this.isCycle = arguments2 != null ? Boolean.valueOf(arguments2.getBoolean(PARAM_REPORT_IS_CYCLE)) : null;
        setTitle(getString(c0j.vi));
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        if (Intrinsics.areEqual(this.isCycle, Boolean.TRUE)) {
            IActionBar.DefaultImpls.setEndView$default(this, 0, pni.x2, null, new View.OnClickListener() { // from class: ltm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SleepRhythmDetailFragment.onViewCreated$lambda$2(this.f25427a, view2);
                }
            }, 5, null);
        }
        initView();
        requestRhythmData();
    }
}
