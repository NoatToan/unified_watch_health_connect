package com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import c22.b;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gl1.d;
import oi0.c;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/viewbinder/BenchmarkExerciseOneRepMaxView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/viewbinder/BenchmarkExerciseOneRepMaxView$a;", "h", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/viewbinder/BenchmarkExerciseOneRepMaxView$a;", "getOnValuesChangedListener", "()Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/viewbinder/BenchmarkExerciseOneRepMaxView$a;", "setOnValuesChangedListener", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/viewbinder/BenchmarkExerciseOneRepMaxView$a;)V", "onValuesChangedListener", "a", "", "showWeightPicker", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BenchmarkExerciseOneRepMaxView extends LinearLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f48406i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f48407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f48408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k52.a f48409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f48411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Double f48412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f48413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public a onValuesChangedListener;

    public interface a {
        void a(int i14, Double d14, Double d15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenchmarkExerciseOneRepMaxView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f48410d = 1;
        this.f48413g = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        LayoutInflater.from(context).inflate(R.layout.gcm_benchmark_one_rep_max_fragment, (ViewGroup) this, true);
        this.f48408b = (ComposeView) findViewById(R.id.benchmark_compose_container);
        TextView textView = (TextView) findViewById(R.id.benchmark_detail_estimated_weight_label);
        String string = context.getString(R.string.string_equals_pattern, context.getString(R.string.lbl_estimated_one_rep_max));
        string.getClass();
        textView.setText(string);
        textView.setContentDescription(c.A(context, new t52.c(0), string));
        View viewFindViewById = findViewById(R.id.benchmark_detail_estimated_weight);
        viewFindViewById.getClass();
        TextView textView2 = (TextView) viewFindViewById;
        this.f48407a = textView2;
        this.f48409c = new k52.a(new l22.a(context));
        if (b.a(context) >= 1.5f) {
            ((LinearLayout) findViewById(R.id.benchmark_detail_estimated_weight_layout)).setOrientation(1);
            textView.getLayoutParams().width = -2;
            textView2.getLayoutParams().width = -2;
        }
    }

    public final void a(Double d14, Integer num) {
        this.f48410d = (num == null || num.intValue() <= 0) ? 1 : num.intValue();
        this.f48411e = d14;
        ComposeView composeView = this.f48408b;
        if (composeView != null) {
            composeView.setContent(new e(-1183942141, true, new t52.a(this, 0)));
        }
        b();
    }

    public final void b() {
        Double dN = d.n(this.f48411e, Integer.valueOf(this.f48410d));
        this.f48412f = dN;
        this.f48407a.setText(k52.e.b(this.f48409c, dN, this.f48413g));
    }

    public final a getOnValuesChangedListener() {
        return this.onValuesChangedListener;
    }

    public final void setOnValuesChangedListener(a aVar) {
        this.onValuesChangedListener = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenchmarkExerciseOneRepMaxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenchmarkExerciseOneRepMaxView(Context context) {
        this(context, null, 0);
        context.getClass();
    }
}
