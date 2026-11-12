package com.huami.device.feature.health.ui.bloodpressure;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.bloodpressure_ui.R;
import com.huami.device.feature.health.util.BloodPressureCorrectDayStatus;
import com.huami.device.feature.health.util.BloodPressureExtKt;
import com.huami.femalehealth.uilib.helper.ChartHelper;
import com.huami.tools.analytics.DbUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001d\u0010\u0011\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001d\u0010\u0014\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\u0018¨\u0006%"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/BloodPressureSettingDialogView;", "Landroid/widget/LinearLayout;", "", "mLastCorrectTime", "", "setCorrectDate", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getMPreDateText", "()Landroid/widget/TextView;", "mPreDateText", "b", "getMPreSummaryText", "mPreSummaryText", "c", "getMNextDateText", "mNextDateText", GoogleApiAvailabilityLight.a, "getMNextSummaryText", "mNextSummaryText", "Landroid/view/View;", "e", "getMNextContent", "()Landroid/view/View;", "mNextContent", "f", "getMSplitView", "mSplitView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureSettingDialogView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPreDateText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPreSummaryText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNextDateText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNextSummaryText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNextContent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSplitView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<View> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return BloodPressureSettingDialogView.this.findViewById(R.id.next_correct_content);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<TextView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) BloodPressureSettingDialogView.this.findViewById(R.id.next_correct_date);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<TextView> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) BloodPressureSettingDialogView.this.findViewById(R.id.next_correct_summary);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<TextView> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) BloodPressureSettingDialogView.this.findViewById(R.id.pre_correct_date);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<TextView> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) BloodPressureSettingDialogView.this.findViewById(R.id.pre_correct_summary);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<View> {
        public f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return BloodPressureSettingDialogView.this.findViewById(R.id.split);
        }
    }

    @JvmOverloads
    public BloodPressureSettingDialogView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public BloodPressureSettingDialogView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public BloodPressureSettingDialogView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPreDateText = LazyKt__LazyJVMKt.lazy(new d());
        this.mPreSummaryText = LazyKt__LazyJVMKt.lazy(new e());
        this.mNextDateText = LazyKt__LazyJVMKt.lazy(new b());
        this.mNextSummaryText = LazyKt__LazyJVMKt.lazy(new c());
        this.mNextContent = LazyKt__LazyJVMKt.lazy(new a());
        this.mSplitView = LazyKt__LazyJVMKt.lazy(new f());
        LayoutInflater.from(context).inflate(R.layout.view_blood_pressure_setting, this);
    }

    private final View getMNextContent() {
        return (View) this.mNextContent.getValue();
    }

    private final TextView getMNextDateText() {
        return (TextView) this.mNextDateText.getValue();
    }

    private final TextView getMNextSummaryText() {
        return (TextView) this.mNextSummaryText.getValue();
    }

    private final TextView getMPreDateText() {
        return (TextView) this.mPreDateText.getValue();
    }

    private final TextView getMPreSummaryText() {
        return (TextView) this.mPreSummaryText.getValue();
    }

    private final View getMSplitView() {
        return (View) this.mSplitView.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void setCorrectDate(long mLastCorrectTime) {
        getMPreSummaryText().setText(R.string.blood_pressure_pre_correct_summary);
        getMNextSummaryText().setText(R.string.blood_pressure_next_correct_summary);
        long j = mLastCorrectTime * ((long) 1000);
        if (BloodPressureExtKt.generateCorrectStatus(j) instanceof BloodPressureCorrectDayStatus.INVALID) {
            getMSplitView().setVisibility(8);
            getMNextContent().setVisibility(8);
        } else {
            getMSplitView().setVisibility(0);
            getMNextContent().setVisibility(0);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ChartHelper.FMT_MM_DD, Locale.getDefault());
        getMPreDateText().setText(simpleDateFormat.format(calendar.getTime()));
        TextView mNextDateText = getMNextDateText();
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.add(6, 28);
        Unit unit = Unit.INSTANCE;
        mNextDateText.setText(simpleDateFormat.format(calendar2.getTime()));
    }

    public /* synthetic */ BloodPressureSettingDialogView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
