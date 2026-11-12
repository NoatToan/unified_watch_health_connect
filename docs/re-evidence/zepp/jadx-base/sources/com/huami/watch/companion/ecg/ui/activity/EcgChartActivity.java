package com.huami.watch.companion.ecg.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.chart.LineChartView;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.companion.ecg.arch.EcgChartViewModel;
import com.huami.watch.companion.ecg.ui.activity.EcgChartActivity;
import com.huami.watch.companion.ecg.ui.fragment.ShareFragment;
import com.huami.watch.companion.ecg.ui.helper.LoadingDialogHelper;
import com.huami.watch.companion.ecg.ui.pop.EcgGainSpeedSelectPop;
import com.huami.watch.companion.ecg.util.EcgUtils;
import com.huami.watch.companion.ecg.view.SeekHorizontalScrollView;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.TimeUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u00022\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014R\u001d\u0010 \u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R3\u0010/\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/activity/EcgChartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "m", "Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "x", "Lcom/huami/ecg/core/model/FilterRecord;", "record", "", "showRaw", "rotate", "u", "Lcom/huami/watch/companion/arch/Result;", "Ljava/io/File;", "file", "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onBackClick", "export", "rotateFilter", "setGain", "setSpeed", "Lcom/huami/watch/companion/ecg/arch/EcgChartViewModel;", "a", "Lkotlin/Lazy;", "l", "()Lcom/huami/watch/companion/ecg/arch/EcgChartViewModel;", "mViewModel", "Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "b", hl.k, "()Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "mDialogHelper", "Lcom/huami/watch/companion/ecg/ui/fragment/ShareFragment;", "c", "Lcom/huami/watch/companion/ecg/ui/fragment/ShareFragment;", "mShareFragment", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "mShareFun", "e", "Z", "mShare", "<init>", "()V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgChartActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "timestamp";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialogHelper = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ShareFragment mShareFragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function1<? super File, Unit> mShareFun;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean mShare;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/activity/EcgChartActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "timestamp", "", "to", "", "ARGS_TIMESTAMP", "Ljava/lang/String;", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void to(@NotNull Context context, long timestamp) {
            Intent intent = new Intent(context, (Class<?>) EcgChartActivity.class);
            intent.putExtra("timestamp", timestamp);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: com.huami.watch.companion.ecg.ui.activity.EcgChartActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0000H\n"}, d2 = {"Lkotlin/Function1;", "Ljava/io/File;", "Lkotlin/ParameterName;", "name", "file", "", "share", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0653a extends Lambda implements Function1<Function1<? super File, ? extends Unit>, Unit> {
            public final /* synthetic */ EcgChartActivity a;
            public final /* synthetic */ EcgData b;
            public final /* synthetic */ FilterRecord c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0653a(EcgChartActivity ecgChartActivity, EcgData ecgData, FilterRecord filterRecord) {
                super(1);
                this.a = ecgChartActivity;
                this.b = ecgData;
                this.c = filterRecord;
            }

            public final void a(@NotNull Function1<? super File, Unit> function1) {
                this.a.mShareFun = function1;
                this.a.l().savePdf(this.b, this.c);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super File, ? extends Unit> function1) {
                a(function1);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            EcgData value = EcgChartActivity.this.l().getEcgLiveData().getValue();
            FilterRecord record = EcgChartActivity.this.l().getRecord();
            if (value == null || record == null) {
                Toast.makeText(EcgChartActivity.this, R.string.loading, 0).show();
                return;
            }
            LoadingDialog.dismiss(EcgChartActivity.this.mShareFragment);
            EcgChartActivity.this.mShareFragment = new ShareFragment();
            ShareFragment shareFragment = EcgChartActivity.this.mShareFragment;
            if (shareFragment == null) {
                return;
            }
            EcgChartActivity ecgChartActivity = EcgChartActivity.this;
            shareFragment.showShareDialog(ecgChartActivity, new C0653a(ecgChartActivity, value, record));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LoadingDialogHelper> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper getA() {
            return new LoadingDialogHelper(EcgChartActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/arch/EcgChartViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<EcgChartViewModel> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgChartViewModel getA() {
            EcgChartViewModel ecgChartViewModel = (EcgChartViewModel) new ViewModelProvider(EcgChartActivity.this).get(EcgChartViewModel.class);
            ecgChartViewModel.setTimestamp(EcgChartActivity.this.getIntent().getLongExtra("timestamp", 0L));
            return ecgChartViewModel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "t", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Float, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            invoke(f.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f) {
            EcgChartActivity.this.l().getGainLiveData().postValue(Float.valueOf(f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "t", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Float, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            invoke(f.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f) {
            EcgChartActivity.this.l().getSpeedLiveData().postValue(Float.valueOf(f));
        }
    }

    private final LoadingDialogHelper k() {
        return (LoadingDialogHelper) this.mDialogHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcgChartViewModel l() {
        return (EcgChartViewModel) this.mViewModel.getValue();
    }

    private final void m() {
        l().getEcgLiveData().observe(this, new Observer() { // from class: dg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgChartActivity.n(this.a, (EcgData) obj);
            }
        });
        l().getRecordLiveData().observe(this, new Observer() { // from class: eg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgChartActivity.q(this.a, (Result) obj);
            }
        });
        l().getShowRawLiveData().observe(this, new Observer() { // from class: hg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgChartActivity.r(this.a, (Boolean) obj);
            }
        });
        l().getRotateLiveData().observe(this, new Observer() { // from class: gg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgChartActivity.s(this.a, (Boolean) obj);
            }
        });
        l().getGainLiveData().observe(this, new Observer() { // from class: ig1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgChartActivity.t(this.a, (Float) obj);
            }
        });
        l().getSpeedLiveData().observe(this, new Observer() { // from class: jg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgChartActivity.o(this.a, (Float) obj);
            }
        });
        l().getPdfFileLiveData().observe(this, new Observer() { // from class: fg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgChartActivity.p(this.a, (Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(EcgChartActivity ecgChartActivity, EcgData ecgData) {
        if (ecgData == null) {
            return;
        }
        ecgChartActivity.x(ecgData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(EcgChartActivity ecgChartActivity, Float f2) {
        if (f2 == null) {
            return;
        }
        float fFloatValue = f2.floatValue();
        ((LineChartView) ecgChartActivity.findViewById(R.id.lv_line_chart)).setSpeed(fFloatValue);
        ((TextView) ecgChartActivity.findViewById(R.id.speed)).setText(fFloatValue + "mm/s");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(EcgChartActivity ecgChartActivity, Result result) {
        ecgChartActivity.w(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(EcgChartActivity ecgChartActivity, Result result) {
        FilterRecord filterRecord;
        ecgChartActivity.k().showOrError(result, ecgChartActivity.getString(R.string.loading), "", ecgChartActivity.getString(R.string.ecg_loading_failed));
        if (result == null || (filterRecord = (FilterRecord) result.getData()) == null) {
            return;
        }
        Boolean value = ecgChartActivity.l().getShowRawLiveData().getValue();
        Boolean value2 = ecgChartActivity.l().getRotateLiveData().getValue();
        Boolean bool = Boolean.TRUE;
        ecgChartActivity.u(filterRecord, Intrinsics.areEqual(value, bool), Intrinsics.areEqual(value2, bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(EcgChartActivity ecgChartActivity, Boolean bool) {
        ImageView imageView = (ImageView) ecgChartActivity.findViewById(R.id.showRaw);
        Boolean bool2 = Boolean.TRUE;
        imageView.setImageResource(Intrinsics.areEqual(bool, bool2) ? R.drawable.ic_ecg_hrv_off : R.drawable.ic_ecg_hrv_on);
        FilterRecord record = ecgChartActivity.l().getRecord();
        if (record == null) {
            return;
        }
        ecgChartActivity.u(record, Intrinsics.areEqual(bool, bool2), Intrinsics.areEqual(ecgChartActivity.l().getRotateLiveData().getValue(), bool2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(EcgChartActivity ecgChartActivity, Boolean bool) {
        FilterRecord record = ecgChartActivity.l().getRecord();
        if (record == null) {
            return;
        }
        Boolean value = ecgChartActivity.l().getShowRawLiveData().getValue();
        Boolean bool2 = Boolean.TRUE;
        ecgChartActivity.u(record, Intrinsics.areEqual(value, bool2), Intrinsics.areEqual(bool, bool2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EcgChartActivity ecgChartActivity, Float f2) {
        if (f2 == null) {
            return;
        }
        float fFloatValue = f2.floatValue();
        ((LineChartView) ecgChartActivity.findViewById(R.id.lv_line_chart)).setGain(fFloatValue);
        ((TextView) ecgChartActivity.findViewById(R.id.gain)).setText(fFloatValue + "mm/mv");
    }

    private final void u(final FilterRecord record, final boolean showRaw, final boolean rotate) {
        ((LineChartView) findViewById(R.id.lv_line_chart)).post(new Runnable() { // from class: kg1
            @Override // java.lang.Runnable
            public final void run() {
                EcgChartActivity.v(showRaw, record, rotate, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(boolean z, FilterRecord filterRecord, boolean z2, EcgChartActivity ecgChartActivity) {
        List<Float> rawData = z ? filterRecord.getRawData() : filterRecord.getFilter();
        if (!z2) {
            ((LineChartView) ecgChartActivity.findViewById(R.id.lv_line_chart)).setDataSource(rawData);
            return;
        }
        LineChartView lineChartView = (LineChartView) ecgChartActivity.findViewById(R.id.lv_line_chart);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(rawData, 10));
        Iterator<T> it2 = rawData.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(-((Number) it2.next()).floatValue()));
        }
        lineChartView.setDataSource(arrayList);
    }

    private final void w(Result<File> file) {
        k().showOrError(file, getString(R.string.loading), "", getString(R.string.ecg_export_pdf_error));
        if (file == null) {
            return;
        }
        if (file.isLoading()) {
            this.mShare = true;
        }
        if (this.mShare && file.isSuccess() && file.getData() != null) {
            this.mShare = false;
            Function1<? super File, Unit> function1 = this.mShareFun;
            if (function1 != null) {
                function1.invoke(file.getData());
            }
        }
        if (file.isSuccess()) {
            EcgAnalyticsManagerKt.ecgDetailCExportPdf(true);
        }
        if (file.isError()) {
            EcgAnalyticsManagerKt.ecgDetailCExportPdf(false);
        }
    }

    private final void x(EcgData ecg) {
        ((TextView) findViewById(R.id.title)).setText(TimeUtil.formatDateTime(ecg.getTimestamp() * ((long) 1000), "MM-dd HH:mm"));
        TextView textView = (TextView) findViewById(R.id.avg_hr);
        int i = R.string.ecg_avg_hr;
        EcgUtils ecgUtils = EcgUtils.INSTANCE;
        textView.setText(getString(i, new Object[]{ecgUtils.getHrText(ecg)}));
        ecgUtils.formatEcgSelf((TextView) findViewById(R.id.tv_ecg_owner), ecg);
        ecgUtils.formatAFibTag((TextView) findViewById(R.id.tv_afib), ecgUtils.getAFib(ecg), ecg.getDeviceSource());
        ((LineChartView) findViewById(R.id.lv_line_chart)).setAbnormalTimeRange(ecgUtils.getLabelStartEndRange(ecg));
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void export(@NotNull View view) {
        EcgUtils.INSTANCE.withStorage(this, new a());
    }

    public final void onBackClick(@NotNull View view) {
        onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecg_chart);
        ((SeekHorizontalScrollView) findViewById(R.id.scroll)).setSeekBar((AppCompatSeekBar) findViewById(R.id.seek_bar));
        m();
    }

    public final void rotateFilter(@NotNull View view) {
        Boolean value = l().getRotateLiveData().getValue();
        if (value == null) {
            value = Boolean.FALSE;
        }
        l().getRotateLiveData().postValue(Boolean.valueOf(!value.booleanValue()));
    }

    public final void setGain(@NotNull View view) {
        EcgGainSpeedSelectPop.INSTANCE.newInstance(this).show(view, 0, new d());
    }

    public final void setSpeed(@NotNull View view) {
        if (l().getSpeedLiveData().getValue() == null) {
            return;
        }
        EcgGainSpeedSelectPop.INSTANCE.newInstance(this).show(view, 1, new e());
    }

    public final void showRaw(@NotNull View view) {
        Boolean value = l().getShowRawLiveData().getValue();
        if (value == null) {
            value = Boolean.FALSE;
        }
        boolean zBooleanValue = value.booleanValue();
        l().getShowRawLiveData().postValue(Boolean.valueOf(!zBooleanValue));
        EcgAnalyticsManagerKt.ecgDetailCFilter(zBooleanValue);
    }
}
