package com.xiaomi.fitness.heartrate.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler;
import com.xiaomi.fitness.heartrate.ui.EvaluatingInfo;
import com.xiaomi.fitness.heartrate.ui.HeartRateReportActivity;
import com.xiaomi.fitness.heartrate.ui.view.IndicatorView;
import com.xiaomi.fitness.widget.view.DurationTextView;
import defpackage.a7c;
import defpackage.d0j;
import defpackage.jli;
import defpackage.kji;
import defpackage.lui;
import defpackage.rni;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00016B\u0007¢\u0006\u0004\b5\u0010\u0019J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b*\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00100\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00102¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/HeartRateReportActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/heartrate/ui/ReportViewModel;", "La7c;", "Lcom/xiaomi/fitness/heartrate/ui/EvaluatingInfo;", "info", "", "type", "", "fillAxisView", "(Lcom/xiaomi/fitness/heartrate/ui/EvaluatingInfo;I)V", "index", "", "", Constants.KEY_RECHARGE_VALUES, "descArr", "fill3SegmentsAxisView", "(I[Ljava/lang/String;[Ljava/lang/String;I)V", "fill5SegmentsAxisView", "color", "setEvaluationStateBg", "(I)V", "getStatusByType", "(I)I", "initTitle", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(La7c;)V", "mHrm", "I", "mStatusType", "", "mMeasureTime", "J", "mOrigin", "Ljava/lang/String;", "Lcom/xiaomi/fitness/heartrate/ui/view/IndicatorView;", "mIndicatorView", "Lcom/xiaomi/fitness/heartrate/ui/view/IndicatorView;", "mDetectType", "Landroid/widget/TextView;", "mTvHrmEvaluationState", "Landroid/widget/TextView;", "mTvHeartTateStatusDesc", "layoutId", "getLayoutId", "()I", "getViewModelId", "viewModelId", "<init>", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HeartRateReportActivity extends Hilt_HeartRateReportActivity<ReportViewModel, a7c> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int layoutId = lui.g;
    private int mDetectType;
    private int mHrm;

    @Nullable
    private IndicatorView mIndicatorView;
    private long mMeasureTime;

    @Nullable
    private String mOrigin;
    private int mStatusType;

    @Nullable
    private TextView mTvHeartTateStatusDesc;

    @Nullable
    private TextView mTvHrmEvaluationState;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/HeartRateReportActivity$Companion;", "", "<init>", "()V", "launchReport", "", "context", "Landroid/content/Context;", "detectType", "", EcgSchemaHandler.PARAM_MEASURE_TIME, "", "hrm", "detectStatus", "originType", "", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit launchReport$lambda$0(Bundle args, Intent it) {
            Intrinsics.checkNotNullParameter(args, "$args");
            Intrinsics.checkNotNullParameter(it, "it");
            it.putExtras(args);
            return Unit.INSTANCE;
        }

        public final void launchReport(@NotNull Context context, int detectType, long measureTime, int hrm, int detectStatus, @Nullable String originType) {
            Intrinsics.checkNotNullParameter(context, "context");
            final Bundle bundle = new Bundle();
            bundle.putLong("measure_time", measureTime);
            bundle.putInt("hrm", hrm);
            bundle.putInt("detect_status", detectStatus);
            bundle.putString("origin", originType);
            bundle.putInt(DetectManualActivity.DETECT_TYPE, detectType);
            LaunchExtensionKt.startActivity(context, (Class<?>) HeartRateReportActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: l6c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HeartRateReportActivity.Companion.launchReport$lambda$0(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(HeartRateReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(HeartRateReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LaunchExtensionKt.startActivity$default(this$0, CitingLiteratureActivity.class, (Function1) null, 2, (Object) null);
    }

    private final void fill3SegmentsAxisView(int index, String[] values, String[] descArr, int type) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        IndicatorView indicatorView = this.mIndicatorView;
        if (indicatorView == null) {
            return;
        }
        Intrinsics.checkNotNull(indicatorView);
        indicatorView.setSegmentCount(3);
        int length = values.length + 2;
        Number[] numberArr = new Number[length];
        int i = 0;
        numberArr[0] = 0;
        int length2 = values.length;
        while (true) {
            iArr = null;
            Integer numValueOf = null;
            if (i >= length2) {
                break;
            }
            int i2 = i + 1;
            String str = values[i];
            if (str != null) {
                numValueOf = Integer.valueOf(Integer.parseInt(str));
            }
            numberArr[i2] = numValueOf;
            i = i2;
        }
        numberArr[values.length + 1] = 300;
        IndicatorView indicatorView2 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView2);
        indicatorView2.setSegmentRange((Number[]) Arrays.copyOf(numberArr, length));
        IndicatorView indicatorView3 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView3);
        indicatorView3.setValue(Integer.valueOf(this.mHrm));
        IndicatorView indicatorView4 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView4);
        indicatorView4.setTagTexts((String[]) Arrays.copyOf(descArr, descArr.length));
        IndicatorView indicatorView5 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView5);
        indicatorView5.setValueTexts(CollectionsKt__CollectionsKt.mutableListOf(Arrays.copyOf(values, values.length)));
        if (TextUtils.equals(this.mOrigin, "page_detect") || UIUtils.isNightMode(this)) {
            iArr2 = new int[]{kji.l, kji.g, kji.s};
            iArr3 = new int[]{kji.j, kji.f, kji.f23923r};
        } else {
            iArr2 = new int[]{kji.n, kji.h, kji.t};
            iArr3 = new int[]{kji.p, kji.i, kji.u};
        }
        IndicatorView indicatorView6 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView6);
        indicatorView6.setSegmentColors(Arrays.copyOf(iArr2, iArr2.length));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.US, "%s %d %s %s", Arrays.copyOf(new Object[]{getString(d0j.f), Integer.valueOf(this.mHrm), getString(d0j.B), descArr[index]}, 4));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        IndicatorView indicatorView7 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView7);
        indicatorView7.setContentDescription(str2);
        TextView textView = this.mTvHrmEvaluationState;
        Intrinsics.checkNotNull(textView);
        textView.setTextColor(getColor(iArr2[index]));
        setEvaluationStateBg(getColor(iArr3[index]));
        TextView textView2 = this.mTvHrmEvaluationState;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(descArr[index]);
        if (type == 0) {
            iArr = new int[]{d0j.Q, d0j.P, d0j.O};
        } else if (type == 1) {
            iArr = new int[]{d0j.N, d0j.M, d0j.L};
        }
        if (iArr == null || iArr.length <= index) {
            return;
        }
        TextView textView3 = this.mTvHeartTateStatusDesc;
        Intrinsics.checkNotNull(textView3);
        textView3.setText(iArr[index]);
    }

    private final void fill5SegmentsAxisView(int index, String[] values, String[] descArr, int type) {
        int[] iArr;
        int[] iArr2;
        IndicatorView indicatorView = this.mIndicatorView;
        if (indicatorView == null) {
            return;
        }
        Intrinsics.checkNotNull(indicatorView);
        indicatorView.setSegmentCount(5);
        int length = values.length + 2;
        Number[] numberArr = new Number[length];
        int i = 0;
        numberArr[0] = 0;
        int length2 = values.length;
        while (i < length2) {
            int i2 = i + 1;
            String str = values[i];
            Intrinsics.checkNotNull(str);
            numberArr[i2] = Integer.valueOf(Integer.parseInt(str));
            i = i2;
        }
        numberArr[values.length + 1] = 300;
        IndicatorView indicatorView2 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView2);
        indicatorView2.setSegmentRange((Number[]) Arrays.copyOf(numberArr, length));
        IndicatorView indicatorView3 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView3);
        indicatorView3.setValue(Integer.valueOf(this.mHrm));
        IndicatorView indicatorView4 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView4);
        indicatorView4.setTagTexts((String[]) Arrays.copyOf(descArr, descArr.length));
        IndicatorView indicatorView5 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView5);
        indicatorView5.setValueTexts(CollectionsKt__CollectionsKt.mutableListOf(Arrays.copyOf(values, values.length)));
        if (TextUtils.equals(this.mOrigin, "page_detect") || UIUtils.isNightMode(this)) {
            iArr = new int[]{kji.c, kji.g, kji.m, kji.l, kji.s};
            iArr2 = new int[]{kji.f23921b, kji.f, kji.f23922k, kji.j, kji.f23923r};
        } else {
            iArr = new int[]{kji.e, kji.h, kji.o, kji.n, kji.t};
            iArr2 = new int[]{kji.d, kji.i, kji.q, kji.p, kji.u};
        }
        IndicatorView indicatorView6 = this.mIndicatorView;
        if (indicatorView6 != null) {
            indicatorView6.setSegmentColors(Arrays.copyOf(iArr, iArr.length));
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.US, "%s %d %s %s", Arrays.copyOf(new Object[]{getString(d0j.f), Integer.valueOf(this.mHrm), getString(d0j.B), descArr[index]}, 4));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        IndicatorView indicatorView7 = this.mIndicatorView;
        Intrinsics.checkNotNull(indicatorView7);
        indicatorView7.setContentDescription(str2);
        TextView textView = this.mTvHrmEvaluationState;
        Intrinsics.checkNotNull(textView);
        textView.setTextColor(getColor(iArr[index]));
        setEvaluationStateBg(getColor(iArr2[index]));
        TextView textView2 = this.mTvHrmEvaluationState;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(descArr[index]);
        int[] iArr3 = type == 2 ? new int[]{d0j.J, d0j.I, d0j.K, d0j.G, d0j.H} : null;
        if (iArr3 == null || iArr3.length <= index) {
            return;
        }
        TextView textView3 = this.mTvHeartTateStatusDesc;
        Intrinsics.checkNotNull(textView3);
        textView3.setText(iArr3[index]);
    }

    private final void fillAxisView(EvaluatingInfo info, int type) {
        List<ValueData> indicators = info.getIndicators();
        int size = indicators.size();
        int i = size - 1;
        String[] strArr = new String[i];
        String[] strArr2 = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            ValueData valueData = indicators.get(i2);
            if (i2 < i) {
                strArr[i2] = String.valueOf(valueData.getEnd());
            }
            strArr2[i2] = valueData.getDescription();
        }
        int iFindIndicatorIndex = info.findIndicatorIndex();
        if (type == 0 || type == 1) {
            fill3SegmentsAxisView(iFindIndicatorIndex, strArr, strArr2, type);
        } else {
            if (type != 2) {
                return;
            }
            fill5SegmentsAxisView(iFindIndicatorIndex, strArr, strArr2, type);
        }
    }

    private final int getStatusByType(int type) {
        if (type == 0) {
            return d0j.q;
        }
        if (type == 1) {
            return d0j.o;
        }
        if (type != 2) {
            return 0;
        }
        return d0j.m;
    }

    private final void initTitle() {
        setTitle(d0j.l);
        setSubtitle(TimeUtils.formatDate(getString(d0j.c) + " HH:mm", Long.valueOf(this.mMeasureTime)));
        if (!TextUtils.equals(this.mOrigin, "page_daily")) {
            setTitleBackground(kji.f23920a);
        }
        IActionBar.DefaultImpls.setEndView$default(this, 0, rni.c, null, new View.OnClickListener() { // from class: h6c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateReportActivity.initTitle$lambda$5(this.f19740a, view);
            }
        }, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitle$lambda$5(final HeartRateReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LaunchExtensionKt.startActivity(this$0, (Class<?>) PrincipleActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: g6c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HeartRateReportActivity.initTitle$lambda$5$lambda$4(this.f18648a, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitle$lambda$5$lambda$4(HeartRateReportActivity this$0, Intent it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra(DetectManualActivity.DETECT_TYPE, this$0.mDetectType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(HeartRateReportActivity this$0, EvaluatingInfo evaluatingInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (evaluatingInfo != null) {
            this$0.fillAxisView(evaluatingInfo, this$0.mStatusType);
        }
        return Unit.INSTANCE;
    }

    private final void setEvaluationStateBg(int color) {
        float dimen = ResourceExtKt.getDimen(this, jli.f22909a);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dimen, dimen, dimen, dimen, dimen, dimen, dimen, dimen}, null, null));
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(color);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        TextView textView = this.mTvHrmEvaluationState;
        Intrinsics.checkNotNull(textView);
        textView.setBackground(shapeDrawable);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull a7c a7cVar) {
        Intrinsics.checkNotNullParameter(a7cVar, "<this>");
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("hrm") || !extras.containsKey("detect_status") || !extras.containsKey("measure_time") || !extras.containsKey("origin") || !extras.containsKey(DetectManualActivity.DETECT_TYPE)) {
            throw new IllegalStateException("need hrm,type,measure time,detect type,origin args".toString());
        }
        this.mHrm = extras.getInt("hrm");
        this.mStatusType = extras.getInt("detect_status");
        this.mMeasureTime = extras.getLong("measure_time");
        this.mOrigin = extras.getString("origin");
        this.mDetectType = extras.getInt(DetectManualActivity.DETECT_TYPE);
        this.mTvHrmEvaluationState = a7cVar.G;
        this.mTvHeartTateStatusDesc = a7cVar.E;
        this.mIndicatorView = a7cVar.C;
        a7cVar.B.setText(String.valueOf(this.mHrm), getString(d0j.B));
        DurationTextView durationTextView = a7cVar.B;
        durationTextView.setContentDescription(durationTextView.getDurationText());
        a7cVar.F.setText(getStatusByType(this.mStatusType));
        a7cVar.H.setOnClickListener(new View.OnClickListener() { // from class: j6c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateReportActivity.bindView$lambda$2(this.f22459a, view);
            }
        });
        a7cVar.J.setOnClickListener(new View.OnClickListener() { // from class: k6c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateReportActivity.bindView$lambda$3(this.f23515a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.heartrate.ui.Hilt_HeartRateReportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTitle();
        ((ReportViewModel) getMViewModel()).getEvaluatingInfo().observe(this, new HeartRateReportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i6c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HeartRateReportActivity.onCreate$lambda$0(this.f20831a, (EvaluatingInfo) obj);
            }
        }));
        ((ReportViewModel) getMViewModel()).handleEvaluationReport(this.mHrm, this.mMeasureTime, this.mStatusType);
        UIUtils uIUtils = UIUtils.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightStatusBar(window, false);
    }
}
