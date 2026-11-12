package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aq.p2;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import j23.t;
import o13.r;
import o53.b0;
import o53.c2;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001'B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\fB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001bR$\u0010&\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\u001b¨\u0006("}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/LabelledValuesRangeProgressBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "", "formatter", "", "setCustomValueFormatter", "(Le23/l;)V", "progressChangedCallback", "setProgressChangedCallback", "Lo53/b0;", "coroutineScope", "setCoroutineScope", "(Lo53/b0;)V", "getCurrentProgress", "()I", "progress", "setCurrentProgress", "(I)V", "value", IntegerTokenConverter.CONVERTER_KEY, "I", "getRangeStart", "rangeStart", "j", "getRangeEnd", "rangeEnd", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LabelledValuesRangeProgressBar extends ConstraintLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f47474k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeekBar f47475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f47476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f47477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f47478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l<? super Integer, String> f47479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l<? super Integer, String> f47480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l<? super Integer, Unit> f47481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f47482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int rangeStart;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int rangeEnd;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/LabelledValuesRangeProgressBar$a", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c2 f47485a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.view.LabelledValuesRangeProgressBar$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.view.LabelledValuesRangeProgressBar$1$onProgressChanged$1", f = "LabelledValuesRangeProgressBar.kt", l = {77}, m = "invokeSuspend", v = 2)
        public static final class C0926a extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47487a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LabelledValuesRangeProgressBar f47488b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f47489c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0926a(LabelledValuesRangeProgressBar labelledValuesRangeProgressBar, int i14, d<? super C0926a> dVar) {
                super(2, dVar);
                this.f47488b = labelledValuesRangeProgressBar;
                this.f47489c = i14;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C0926a(this.f47488b, this.f47489c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((C0926a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f47487a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f47487a = 1;
                    if (m0.b(500L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                LabelledValuesRangeProgressBar.i(this.f47488b, this.f47489c);
                return Unit.INSTANCE;
            }
        }

        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i14, boolean z14) {
            if (z14) {
                c2 c2Var = this.f47485a;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                LabelledValuesRangeProgressBar labelledValuesRangeProgressBar = LabelledValuesRangeProgressBar.this;
                b0 b0Var = labelledValuesRangeProgressBar.f47482h;
                this.f47485a = b0Var != null ? ge1.b.T(b0Var, null, null, new C0926a(labelledValuesRangeProgressBar, i14, null), 3) : null;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            c2 c2Var = this.f47485a;
            if (c2Var != null) {
                c2Var.c(null);
            }
            LabelledValuesRangeProgressBar labelledValuesRangeProgressBar = LabelledValuesRangeProgressBar.this;
            LabelledValuesRangeProgressBar.i(labelledValuesRangeProgressBar, labelledValuesRangeProgressBar.f47475a.getProgress());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements l<Integer, String> {
        public c(Object obj) {
            super(1, obj, LabelledValuesRangeProgressBar.class, "formatValueWithDefaultFormatter", "formatValueWithDefaultFormatter(I)Ljava/lang/String;", 0);
        }

        @Override // e23.l
        public final String invoke(Integer num) {
            int iIntValue = num.intValue();
            LabelledValuesRangeProgressBar labelledValuesRangeProgressBar = (LabelledValuesRangeProgressBar) this.receiver;
            int i14 = LabelledValuesRangeProgressBar.f47474k;
            labelledValuesRangeProgressBar.getClass();
            return String.valueOf(iIntValue);
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelledValuesRangeProgressBar(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        context.getClass();
        this.f47479e = new c(this);
        this.rangeEnd = 100;
        LayoutInflater.from(context).inflate(R.layout.labelled_values_range_progress_bar, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.range_progress_bar);
        viewFindViewById.getClass();
        SeekBar seekBar = (SeekBar) viewFindViewById;
        this.f47475a = seekBar;
        View viewFindViewById2 = findViewById(R.id.current_value_label);
        viewFindViewById2.getClass();
        this.f47476b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.min_value_label);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f47477c = textView;
        View viewFindViewById4 = findViewById(R.id.max_value_label);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f47478d = textView2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p2.f12156a, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        this.rangeStart = typedArrayObtainStyledAttributes.getInt(1, 0);
        int i16 = typedArrayObtainStyledAttributes.getInt(0, 100);
        this.rangeEnd = i16;
        int i17 = this.rangeStart;
        if (i17 < 0 || i17 > i16) {
            this.rangeStart = 0;
            this.rangeEnd = 100;
        }
        seekBar.setOnSeekBarChangeListener(new a());
        seekBar.setMax(this.rangeEnd - this.rangeStart);
        m();
        textView.setText(this.f47479e.invoke(Integer.valueOf(this.rangeStart)));
        textView.setContentDescription(j(this.rangeStart));
        textView2.setText(this.f47479e.invoke(Integer.valueOf(this.rangeEnd)));
        textView2.setContentDescription(j(this.rangeEnd));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void i(LabelledValuesRangeProgressBar labelledValuesRangeProgressBar, int i14) {
        l<? super Integer, Unit> lVar = labelledValuesRangeProgressBar.f47481g;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(labelledValuesRangeProgressBar.rangeStart + i14));
        }
        l<? super Integer, String> lVar2 = labelledValuesRangeProgressBar.f47480f;
        if (lVar2 != null) {
            Context context = labelledValuesRangeProgressBar.getContext();
            context.getClass();
            c22.b.h(context, lVar2.invoke(Integer.valueOf(labelledValuesRangeProgressBar.rangeStart + i14)));
            v22.b.a(lVar2.invoke(Integer.valueOf(labelledValuesRangeProgressBar.rangeStart + i14)), labelledValuesRangeProgressBar.f47475a);
        }
    }

    public final int getCurrentProgress() {
        return this.f47475a.getProgress() + this.rangeStart;
    }

    public final int getRangeEnd() {
        return this.rangeEnd;
    }

    public final int getRangeStart() {
        return this.rangeStart;
    }

    public final String j(int i14) {
        String strInvoke;
        l<? super Integer, String> lVar = this.f47480f;
        return (lVar == null || (strInvoke = lVar.invoke(Integer.valueOf(i14))) == null) ? this.f47479e.invoke(Integer.valueOf(i14)) : strInvoke;
    }

    public final void k(l lVar, String str) {
        SeekBar seekBar = this.f47475a;
        seekBar.setContentDescription(str);
        this.f47480f = lVar;
        v22.b.a((String) lVar.invoke(Integer.valueOf(getCurrentProgress())), seekBar);
        m();
        String strInvoke = this.f47479e.invoke(Integer.valueOf(this.rangeStart));
        TextView textView = this.f47477c;
        textView.setText(strInvoke);
        textView.setContentDescription(j(this.rangeStart));
        String strInvoke2 = this.f47479e.invoke(Integer.valueOf(this.rangeEnd));
        TextView textView2 = this.f47478d;
        textView2.setText(strInvoke2);
        textView2.setContentDescription(j(this.rangeEnd));
    }

    public final void l(int i14, int i15, Integer num) {
        if (i14 < 0 || i14 > i15) {
            return;
        }
        this.rangeStart = i14;
        this.rangeEnd = i15;
        String strInvoke = this.f47479e.invoke(Integer.valueOf(i14));
        TextView textView = this.f47477c;
        textView.setText(strInvoke);
        textView.setContentDescription(j(this.rangeStart));
        String strInvoke2 = this.f47479e.invoke(Integer.valueOf(this.rangeEnd));
        TextView textView2 = this.f47478d;
        textView2.setText(strInvoke2);
        textView2.setContentDescription(j(this.rangeEnd));
        this.f47475a.setMax(this.rangeEnd - this.rangeStart);
        setCurrentProgress(num.intValue());
        m();
    }

    public final void m() {
        int progress = this.f47475a.getProgress() + this.rangeStart;
        String strInvoke = this.f47479e.invoke(Integer.valueOf(progress));
        TextView textView = this.f47476b;
        textView.setText(strInvoke);
        textView.setContentDescription(j(progress));
    }

    public final void setCoroutineScope(b0 coroutineScope) {
        coroutineScope.getClass();
        this.f47482h = coroutineScope;
    }

    public final void setCurrentProgress(int progress) {
        this.f47475a.setProgress(t.f(progress, new j23.l(this.rangeStart, this.rangeEnd)) - this.rangeStart);
        m();
    }

    public final void setCustomValueFormatter(l<? super Integer, String> formatter) {
        formatter.getClass();
        this.f47479e = formatter;
        m();
        String strInvoke = this.f47479e.invoke(Integer.valueOf(this.rangeStart));
        TextView textView = this.f47477c;
        textView.setText(strInvoke);
        textView.setContentDescription(j(this.rangeStart));
        String strInvoke2 = this.f47479e.invoke(Integer.valueOf(this.rangeEnd));
        TextView textView2 = this.f47478d;
        textView2.setText(strInvoke2);
        textView2.setContentDescription(j(this.rangeEnd));
    }

    public final void setProgressChangedCallback(l<? super Integer, Unit> progressChangedCallback) {
        progressChangedCallback.getClass();
        this.f47481g = progressChangedCallback;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/LabelledValuesRangeProgressBar$b;", "", "<init>", "()V", "", "DEFAULT_RANGE_END", "I", "", "PROGRESS_CHANGE_DELAY", "J", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelledValuesRangeProgressBar(Context context) {
        this(context, null, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelledValuesRangeProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelledValuesRangeProgressBar(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
        context.getClass();
    }
}
