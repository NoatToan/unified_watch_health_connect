package com.xiaomi.fitness.health.sleep.interfere;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailFragment;
import com.xiaomi.fitness.health.sleep.interfere.adapter.SleepInterfereDayAdapter;
import com.xiaomi.fitness.health.sleep.interfere.adapter.SleepInterfereTaskAdapter;
import com.xiaomi.fitness.health.sleep.interfere.net.ModelsKt;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereDayTask;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereTaskItem;
import com.xiaomi.fitness.health.sleep.interfere.utils.CalendarUtils;
import com.xiaomi.fitness.health.sleep.interfere.utils.SleepInterferePreference;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.a4i;
import defpackage.av6;
import defpackage.c0j;
import defpackage.dih;
import defpackage.eri;
import defpackage.jui;
import defpackage.nwi;
import defpackage.qxi;
import defpackage.wba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\u0018\u0000 N2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001NB\u0007¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u0019JC\u0010$\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00172\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u00107\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u00108\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00105R\u0014\u0010L\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereDetailVM;", "Lwba;", "", "initView", "()V", "stopPlan", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "dayTask", "showDayTasks", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;)V", "", "fillDayTaskIfNeeded", "(Ljava/util/List;)V", "", "updateDate", "", "type", "", "status", "updateDayTaskStatus", "(JLjava/lang/String;I)V", "", "hasAllTaskCompleted", "()Z", "getTodayDayTask", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", DialWidgetType.DATE, "calcTaskCountInfo", "(J)Ljava/lang/String;", "needShowCompletedPopMedal", "taskType", "checked", "Lkotlin/Function2;", "updateCallback", "handleTaskAction", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "planId", "J", "startDate", "endDate", "bedTime", "I", "wakeTime", "curDayTasks", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "La4i;", "popMenu", "La4i;", "Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereTaskAdapter;", "taskAdapter", "Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereTaskAdapter;", "Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereDayAdapter;", "dayAdapter", "Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereDayAdapter;", "", "dayTasksMapInfo", "Ljava/util/Map;", "planLastDate", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInterfereDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereDetailFragment.kt\ncom/xiaomi/fitness/health/sleep/interfere/SleepInterfereDetailFragment\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,506:1\n216#2:507\n217#2:510\n1863#3,2:508\n1863#3:511\n1863#3,2:512\n1864#3:514\n1863#3,2:515\n1863#3,2:517\n1863#3,2:519\n2632#3,3:521\n1053#3:524\n1872#3,3:525\n*S KotlinDebug\n*F\n+ 1 SleepInterfereDetailFragment.kt\ncom/xiaomi/fitness/health/sleep/interfere/SleepInterfereDetailFragment\n*L\n367#1:507\n367#1:510\n369#1:508,2\n381#1:511\n382#1:512,2\n381#1:514\n393#1:515,2\n406#1:517,2\n422#1:519,2\n425#1:521,3\n197#1:524\n197#1:525,3\n*E\n"})
public final class SleepInterfereDetailFragment extends BaseBindingFragment<SleepInterfereDetailVM, wba> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DAILY_SNAP_CALC_TIME = 20;
    private static final int DAY_IN_SECONDS = 86400;

    @NotNull
    private static final String KEY_END_DATE = "key.end_date";

    @NotNull
    private static final String KEY_INTERFERE_ID = "key.interfere_id";

    @NotNull
    private static final String KEY_START_DATE = "key.start_date";

    @NotNull
    private static final String TAG = "SleepInterfereDetailFragment";

    @Nullable
    private SleepInterfereDayTask curDayTasks;

    @Nullable
    private SleepInterfereDayAdapter dayAdapter;

    @Nullable
    private a4i popMenu;

    @Nullable
    private SleepInterfereTaskAdapter taskAdapter;
    private long planId = -1;
    private long startDate = -1;
    private long endDate = -1;
    private int bedTime = -1;
    private int wakeTime = -1;

    @NotNull
    private final Map<Long, SleepInterfereDayTask> dayTasksMapInfo = new LinkedHashMap();
    private long planLastDate = -1;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereDetailFragment$Companion;", "", "<init>", "()V", "TAG", "", "DAY_IN_SECONDS", "", "DAILY_SNAP_CALC_TIME", "KEY_INTERFERE_ID", "KEY_START_DATE", "KEY_END_DATE", "launch", "", "ctx", "Landroid/content/Context;", "interfereId", "", "startDate", "endDate", "bedTime", "wakeTime", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context ctx, long interfereId, long startDate, long endDate, int bedTime, int wakeTime) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            dih dihVarA = dih.a();
            FragmentParams.b bVarE = new FragmentParams.b().e(SleepInterfereDetailFragment.class);
            Bundle bundle = new Bundle();
            bundle.putLong(SleepInterfereDetailFragment.KEY_INTERFERE_ID, interfereId);
            bundle.putLong(SleepInterfereDetailFragment.KEY_START_DATE, startDate);
            bundle.putLong(SleepInterfereDetailFragment.KEY_END_DATE, endDate);
            bundle.putInt(SleepInterfereSetFragment.KEY_BED_TIME, bedTime);
            bundle.putInt(SleepInterfereSetFragment.KEY_WAKE_TIME, wakeTime);
            Unit unit = Unit.INSTANCE;
            dihVarA.e(ctx, bVarE.c(bundle).b());
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailFragment$stopPlan$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/health/sleep/interfere/SleepInterfereDetailFragment$stopPlan$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(SleepInterfereDetailFragment this$0, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.hideLoading();
            if (z) {
                FragmentActivity activity = this$0.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            } else {
                ToastUtil.INSTANCE.showToast(c0j.common_network_error_retry_later);
            }
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which == -2) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            } else {
                if (which != -1) {
                    return;
                }
                SleepInterfereDetailFragment.this.showLoading(c0j.yq, false);
                SleepInterfereDetailVM sleepInterfereDetailVMAccess$getMViewModel = SleepInterfereDetailFragment.access$getMViewModel(SleepInterfereDetailFragment.this);
                long j = SleepInterfereDetailFragment.this.planId;
                final SleepInterfereDetailFragment sleepInterfereDetailFragment = SleepInterfereDetailFragment.this;
                sleepInterfereDetailVMAccess$getMViewModel.stopPlan(j, new Function1() { // from class: rnm
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SleepInterfereDetailFragment.AnonymousClass1.onDialogClick$lambda$0(sleepInterfereDetailFragment, ((Boolean) obj).booleanValue());
                    }
                });
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepInterfereDetailVM access$getMViewModel(SleepInterfereDetailFragment sleepInterfereDetailFragment) {
        return (SleepInterfereDetailVM) sleepInterfereDetailFragment.getMViewModel();
    }

    private final String calcTaskCountInfo(long date) {
        int i;
        SleepInterfereDayTask sleepInterfereDayTask = this.dayTasksMapInfo.get(Long.valueOf(date));
        List<SleepInterfereTaskItem> tasks = sleepInterfereDayTask != null ? sleepInterfereDayTask.getTasks() : null;
        if (tasks != null) {
            Iterator<T> it = tasks.iterator();
            i = 0;
            while (it.hasNext()) {
                if (ModelsKt.isCompleted((SleepInterfereTaskItem) it.next())) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        Resources resources = ApplicationExtKt.getApplication().getResources();
        int i2 = qxi.E0;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(tasks != null ? tasks.size() : 0);
        String quantityString = resources.getQuantityString(i2, 1, objArr);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    private final void fillDayTaskIfNeeded(List<SleepInterfereDayTask> dayTask) {
        int size = this.dayTasksMapInfo.values().size();
        long j = 86400;
        long j2 = (this.endDate - this.startDate) / j;
        long j3 = size;
        if (j3 < j2) {
            Logger.i(TAG, "has future days, need fill day task list!!");
            long jLongValue = ((Number) ((Map.Entry) CollectionsKt___CollectionsKt.last(this.dayTasksMapInfo.entrySet())).getKey()).longValue();
            long j4 = j2 - j3;
            long j5 = 0;
            while (j5 < j4) {
                long j6 = 1 + j5;
                long j7 = (j6 * j) + jLongValue;
                SleepInterfereDayTask sleepInterfereDayTask = new SleepInterfereDayTask(j7, CollectionsKt__CollectionsKt.emptyList(), 1, (int) (j5 + j3), false, 16, null);
                this.dayTasksMapInfo.put(Long.valueOf(j7), sleepInterfereDayTask);
                ListExtKt.add(dayTask, sleepInterfereDayTask);
                j5 = j6;
            }
            this.planLastDate = -1L;
        }
    }

    private final SleepInterfereDayTask getTodayDayTask() {
        SleepInterfereDayTask sleepInterfereDayTask = null;
        for (SleepInterfereDayTask sleepInterfereDayTask2 : this.dayTasksMapInfo.values()) {
            if (ModelsKt.isToday(sleepInterfereDayTask2)) {
                sleepInterfereDayTask = sleepInterfereDayTask2;
            }
        }
        return sleepInterfereDayTask;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleTaskAction(final SleepInterfereDayTask dayTask, final String taskType, final boolean checked, final Function2<? super Boolean, ? super Boolean, Unit> updateCallback) {
        SleepInterferePreference sleepInterferePreference = SleepInterferePreference.INSTANCE;
        if (!sleepInterferePreference.getAutoTaskComplete() && TextUtils.equals(taskType, "EXERCISE_30MIN")) {
            if (updateCallback != null) {
                Boolean bool = Boolean.FALSE;
                updateCallback.invoke(bool, bool);
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            MainExtKt.showTabWithIndex(fragmentActivityRequireActivity, MainTab.INSTANCE.getINDEX_SPORT());
            return;
        }
        if (sleepInterferePreference.getAutoTaskComplete() || !TextUtils.equals(taskType, "LIMIT_NAPS")) {
            ((SleepInterfereDetailVM) getMViewModel()).completeTask(this.planId, dayTask.getDate(), CollectionsKt__CollectionsJVMKt.listOf(new Pair(taskType, Integer.valueOf(checked ? 2 : 0))), new Function1() { // from class: nnm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepInterfereDetailFragment.handleTaskAction$lambda$21(taskType, this, dayTask, updateCallback, checked, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (CalendarUtils.INSTANCE.calcCurrentTime().getFirst().intValue() < 20) {
            ToastUtil.INSTANCE.showToast(c0j.mg);
        }
        if (updateCallback != null) {
            Boolean bool2 = Boolean.FALSE;
            updateCallback.invoke(bool2, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleTaskAction$lambda$21(String taskType, final SleepInterfereDetailFragment this$0, SleepInterfereDayTask dayTask, Function2 function2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(taskType, "$taskType");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dayTask, "$dayTask");
        if (z2) {
            if (!ArraysKt___ArraysKt.contains(new String[]{"TIMELY_SLEEP", "TIMELY_WAKE_UP"}, taskType)) {
                ToastUtil.INSTANCE.showToast(c0j.Eg);
            }
            this$0.updateDayTaskStatus(dayTask.getDate(), taskType, 2);
            SleepInterfereTaskAdapter sleepInterfereTaskAdapter = this$0.taskAdapter;
            if (sleepInterfereTaskAdapter != null) {
                sleepInterfereTaskAdapter.updateTaskStatus(taskType, 2);
            }
            this$0.getMBinding().B.setText(this$0.calcTaskCountInfo(dayTask.getDate()));
            if (this$0.needShowCompletedPopMedal()) {
                MedalManager medalManagerExtKt = MedalManagerExtKt.getInstance(MedalManager.INSTANCE);
                FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                String string = this$0.getString(c0j.rg);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = this$0.getString(c0j.sg);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = this$0.getString(c0j.Sg);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                medalManagerExtKt.showSleepInterfereMedal(fragmentActivityRequireActivity, string, string2, string3, new Function0() { // from class: jnm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SleepInterfereDetailFragment.handleTaskAction$lambda$21$lambda$20(this.f22952a);
                    }
                });
            }
        } else {
            ToastUtil.INSTANCE.showToast(c0j.common_network_error_retry_later);
        }
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(!z), Boolean.valueOf(z2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleTaskAction$lambda$21$lambda$20(SleepInterfereDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepInterfereReportFragment.Companion companion = SleepInterfereReportFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        companion.launch(fragmentActivityRequireActivity, this$0.planId);
        return Unit.INSTANCE;
    }

    private final boolean hasAllTaskCompleted() {
        Iterator<T> it = this.dayTasksMapInfo.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            List<SleepInterfereTaskItem> tasks = ((SleepInterfereDayTask) it.next()).getTasks();
            if (tasks != null) {
                Iterator<T> it2 = tasks.iterator();
                while (it2.hasNext()) {
                    if (!ModelsKt.isCompleted((SleepInterfereTaskItem) it2.next())) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        SpannableString styledString;
        a4i a4iVar = new a4i(requireActivity(), getMBinding().J.findViewById(eri.Rb));
        this.popMenu = a4iVar;
        a4iVar.f(nwi.j);
        a4i a4iVar2 = this.popMenu;
        if (a4iVar2 != null) {
            a4iVar2.setOnMenuItemClickListener(new a4i.c() { // from class: knm
                @Override // a4i.c
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return SleepInterfereDetailFragment.initView$lambda$3(this.f24025a, menuItem);
                }
            });
        }
        TextView textView = getMBinding().C;
        Context context = getContext();
        if (context != null) {
            StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
            int i = qxi.A0;
            SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
            styledString = styledStringUtils.getStyledString(context, i, 1, (1008 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(spanPropKey, "400"))), (1008 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(new StyledStringUtils.StyledArg(1, new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey, "400"), TuplesKt.to(SpanPropKey.FONT_SIZE, "164.7%"))))), (1008 & 16) != 0, (1008 & 32) != 0 ? Locale.getDefault() : null, (1008 & 64) != 0, (1008 & 128) != 0 ? null : null, (1008 & 256) != 0 ? MapsKt__MapsKt.emptyMap() : null, (1008 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null);
        } else {
            styledString = null;
        }
        textView.setText(styledString);
        RecyclerView recyclerView = getMBinding().D;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        getMBinding().D.setAdapter(this.dayAdapter);
        ((SleepInterfereDetailVM) getMViewModel()).getDayTaskList().observe(getViewLifecycleOwner(), new SleepInterfereDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lnm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepInterfereDetailFragment.initView$lambda$7(this.f25248a, (List) obj);
            }
        }));
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: mnm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepInterfereDetailFragment.initView$lambda$10(this.f27030a, view);
            }
        });
        getMBinding().I.setLayoutManager(new LinearLayoutManager(requireContext()));
        getMBinding().I.setAdapter(this.taskAdapter);
        getMBinding().I.addItemDecoration(new RecyclerView.n() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailFragment.initView.5
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.top = ExtUtilsKt.getDp(12);
            }
        });
        ((SleepInterfereDetailVM) getMViewModel()).getDayTasks(this.planId, this.startDate, this.endDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$10(SleepInterfereDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepInterfereDayTask todayDayTask = this$0.getTodayDayTask();
        if (todayDayTask == null) {
            Logger.e(TAG, "no today data!!");
        } else {
            this$0.getMBinding().D.scrollToPosition(todayDayTask.getDayIndex());
            this$0.showDayTasks(todayDayTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$3(SleepInterfereDetailFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == eri.Nc) {
            SleepInterfereSetFragment.Companion companion = SleepInterfereSetFragment.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            companion.launchForResult(fragmentActivityRequireActivity, Long.valueOf(this$0.planId), Integer.valueOf(this$0.bedTime), Integer.valueOf(this$0.wakeTime));
            return true;
        }
        if (itemId == eri.Pc) {
            this$0.stopPlan();
            return true;
        }
        if (itemId != eri.Oc) {
            return true;
        }
        SleepInterfereHistoryFragment.Companion companion2 = SleepInterfereHistoryFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity2 = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        companion2.launch(fragmentActivityRequireActivity2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$7(SleepInterfereDetailFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailFragment$initView$lambda$7$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepInterfereDayTask) t).getDate()), Long.valueOf(((SleepInterfereDayTask) t2).getDate()));
                }
            })) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                SleepInterfereDayTask sleepInterfereDayTask = (SleepInterfereDayTask) obj;
                sleepInterfereDayTask.setTimeLineStatus(CalendarUtils.INSTANCE.calcSleepDayTimeline(sleepInterfereDayTask.getDate()));
                sleepInterfereDayTask.setDayIndex(i);
                this$0.dayTasksMapInfo.put(Long.valueOf(sleepInterfereDayTask.getDate()), sleepInterfereDayTask);
                arrayList.add(sleepInterfereDayTask);
                if (ModelsKt.isToday(sleepInterfereDayTask)) {
                    this$0.curDayTasks = sleepInterfereDayTask;
                }
                this$0.planLastDate = sleepInterfereDayTask.getDate();
                i = i2;
            }
            this$0.fillDayTaskIfNeeded(arrayList);
            SleepInterfereDayAdapter sleepInterfereDayAdapter = this$0.dayAdapter;
            if (sleepInterfereDayAdapter != null) {
                sleepInterfereDayAdapter.setTasks(arrayList);
            }
            this$0.showDayTasks(this$0.curDayTasks);
        }
        return Unit.INSTANCE;
    }

    private final boolean needShowCompletedPopMedal() {
        List<SleepInterfereTaskItem> tasks;
        List<SleepInterfereTaskItem> tasks2;
        long j = this.planLastDate;
        if (j <= 0) {
            Logger.i(TAG, "needShowCompletedPopMedal no lastDate");
            return false;
        }
        SleepInterfereDayTask sleepInterfereDayTask = this.dayTasksMapInfo.get(Long.valueOf(j));
        if (sleepInterfereDayTask != null && (tasks2 = sleepInterfereDayTask.getTasks()) != null) {
            for (SleepInterfereTaskItem sleepInterfereTaskItem : tasks2) {
                Logger.i(TAG, "needShowCompletedPopMedal-task-info:" + sleepInterfereTaskItem.getType() + " - " + sleepInterfereTaskItem.getStatus());
            }
        }
        SleepInterfereDayTask sleepInterfereDayTask2 = this.dayTasksMapInfo.get(Long.valueOf(this.planLastDate));
        if (sleepInterfereDayTask2 != null && (tasks = sleepInterfereDayTask2.getTasks()) != null) {
            List<SleepInterfereTaskItem> list = tasks;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!ModelsKt.isFinished((SleepInterfereTaskItem) it.next())) {
                    }
                }
            }
            Logger.i(TAG, "all task complete!!");
            return true;
        }
        Logger.i(TAG, "not all task complete!!");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(SleepInterfereDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a4i a4iVar = this$0.popMenu;
        if (a4iVar != null) {
            a4iVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SleepInterfereDetailFragment this$0, SleepInterfereDayTask dayTask, String type, boolean z, Function2 function2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dayTask, "dayTask");
        Intrinsics.checkNotNullParameter(type, "type");
        this$0.handleTaskAction(dayTask, type, z, function2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SleepInterfereDetailFragment this$0, int i, SleepInterfereDayTask sleepInterfereDayTask) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.curDayTasks = sleepInterfereDayTask;
        Intrinsics.checkNotNull(sleepInterfereDayTask);
        this$0.showDayTasks(sleepInterfereDayTask);
        return Unit.INSTANCE;
    }

    private final void showDayTasks(SleepInterfereDayTask dayTask) {
        SpannableString styledString;
        List<SleepInterfereTaskItem> tasks;
        if (dayTask == null) {
            ToastUtil.INSTANCE.showToast(c0j.ig);
            LinearLayout taskContainer = getMBinding().G;
            Intrinsics.checkNotNullExpressionValue(taskContainer, "taskContainer");
            ViewExtKt.gone(taskContainer);
            Logger.i(TAG, "show empty task");
            return;
        }
        TextView textView = getMBinding().C;
        Context context = getContext();
        if (context != null) {
            StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
            int i = qxi.A0;
            int dayIndex = dayTask.getDayIndex() + 1;
            SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
            styledString = styledStringUtils.getStyledString(context, i, dayIndex, (1008 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(spanPropKey, "400"))), (1008 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(new StyledStringUtils.StyledArg(Integer.valueOf(dayTask.getDayIndex() + 1), new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey, "400"), TuplesKt.to(SpanPropKey.FONT_SIZE, "164.7%"))))), (1008 & 16) != 0, (1008 & 32) != 0 ? Locale.getDefault() : null, (1008 & 64) != 0, (1008 & 128) != 0 ? null : null, (1008 & 256) != 0 ? MapsKt__MapsKt.emptyMap() : null, (1008 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null);
        } else {
            styledString = null;
        }
        textView.setText(styledString);
        SleepInterfereTaskAdapter sleepInterfereTaskAdapter = this.taskAdapter;
        if (sleepInterfereTaskAdapter != null) {
            sleepInterfereTaskAdapter.setTasks(dayTask);
        }
        SleepInterfereTaskAdapter sleepInterfereTaskAdapter2 = this.taskAdapter;
        if (sleepInterfereTaskAdapter2 != null) {
            sleepInterfereTaskAdapter2.updateTargetTime(this.bedTime, this.wakeTime);
        }
        SleepInterfereDayAdapter sleepInterfereDayAdapter = this.dayAdapter;
        if (sleepInterfereDayAdapter != null) {
            sleepInterfereDayAdapter.updateSelectedDay(dayTask.getDayIndex());
        }
        getMBinding().B.setText(calcTaskCountInfo(dayTask.getDate()));
        LinearLayout taskContainer2 = getMBinding().G;
        Intrinsics.checkNotNullExpressionValue(taskContainer2, "taskContainer");
        ViewExtKt.visible(taskContainer2);
        if (ModelsKt.isToday(dayTask)) {
            TextView backToday = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(backToday, "backToday");
            ViewExtKt.gone(backToday);
        } else {
            TextView backToday2 = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(backToday2, "backToday");
            ViewExtKt.visible(backToday2);
            if (SleepInterferePreference.INSTANCE.getFutureTaskComplete()) {
                return;
            }
            if (ModelsKt.isFuture(dayTask) || ((tasks = dayTask.getTasks()) != null && tasks.isEmpty())) {
                LinearLayout taskContainer3 = getMBinding().G;
                Intrinsics.checkNotNullExpressionValue(taskContainer3, "taskContainer");
                ViewExtKt.gone(taskContainer3);
                ToastUtil.INSTANCE.showToast(c0j.ig);
            }
        }
        getMBinding().D.scrollToPosition(dayTask.getDayIndex());
    }

    private final void stopPlan() {
        CommonDialog.c cVar = new CommonDialog.c("training_plan");
        cVar.setDialogTitle(c0j.yg);
        cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(c0j.zg, new Object[0]));
        cVar.setPositiveText(c0j.Bg);
        cVar.setNegativeText(c0j.Ag);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.setCancelable(true);
        commonDialogCreate.addDialogCallback(new AnonymousClass1());
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    private final void updateDayTaskStatus(long updateDate, String type, int status) {
        for (Map.Entry<Long, SleepInterfereDayTask> entry : this.dayTasksMapInfo.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            SleepInterfereDayTask value = entry.getValue();
            if (updateDate == jLongValue) {
                List<SleepInterfereTaskItem> tasks = value.getTasks();
                if (tasks != null) {
                    for (SleepInterfereTaskItem sleepInterfereTaskItem : tasks) {
                        if (TextUtils.equals(type, sleepInterfereTaskItem.getType())) {
                            sleepInterfereTaskItem.setStatus(status);
                        }
                    }
                }
                SleepInterfereDayAdapter sleepInterfereDayAdapter = this.dayAdapter;
                if (sleepInterfereDayAdapter != null) {
                    sleepInterfereDayAdapter.updateDayTask(value);
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.O0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 256 || data == null) {
            return;
        }
        int intExtra = data.getIntExtra(SleepInterfereSetFragment.KEY_BED_TIME, -1);
        int intExtra2 = data.getIntExtra(SleepInterfereSetFragment.KEY_WAKE_TIME, -1);
        if (intExtra < 0 || intExtra2 < 0) {
            Logger.i(TAG, "update target time exception!!");
        } else {
            this.bedTime = intExtra;
            this.wakeTime = intExtra2;
        }
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.planId = arguments != null ? arguments.getLong(KEY_INTERFERE_ID) : -1L;
        Bundle arguments2 = getArguments();
        this.startDate = arguments2 != null ? arguments2.getLong(KEY_START_DATE) : -1L;
        Bundle arguments3 = getArguments();
        this.endDate = arguments3 != null ? arguments3.getLong(KEY_END_DATE) : -1L;
        Bundle arguments4 = getArguments();
        this.bedTime = arguments4 != null ? arguments4.getInt(SleepInterfereSetFragment.KEY_BED_TIME) : -1;
        Bundle arguments5 = getArguments();
        this.wakeTime = arguments5 != null ? arguments5.getInt(SleepInterfereSetFragment.KEY_WAKE_TIME) : -1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        long j = this.planId;
        if (j <= 0 || this.startDate <= 0 || this.endDate <= 0 || this.bedTime <= 0 || this.wakeTime <= 0) {
            Logger.e(TAG, "start SleepInterfereDetailFragment with error params(planId:" + j + ", startData:" + this.startDate + ", endDate:" + this.endDate + ")");
        }
        getMBinding().J.setTitle(c0j.Rg);
        getMBinding().J.setMoreClickListener(new View.OnClickListener() { // from class: onm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepInterfereDetailFragment.onViewCreated$lambda$0(this.f29321a, view2);
            }
        });
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.taskAdapter = new SleepInterfereTaskAdapter(contextRequireContext, new Function4() { // from class: pnm
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SleepInterfereDetailFragment.onViewCreated$lambda$1(this.f30564a, (SleepInterfereDayTask) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (Function2) obj4);
            }
        });
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        this.dayAdapter = new SleepInterfereDayAdapter(contextRequireContext2, new Function2() { // from class: qnm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepInterfereDetailFragment.onViewCreated$lambda$2(this.f31680a, ((Integer) obj).intValue(), (SleepInterfereDayTask) obj2);
            }
        });
        initView();
    }
}
