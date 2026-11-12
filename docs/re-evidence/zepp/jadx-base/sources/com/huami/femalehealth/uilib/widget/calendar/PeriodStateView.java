package com.huami.femalehealth.uilib.widget.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.femalehealth.uilib.widget.calendar.status.ForecastStyleKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u0001:\u000289B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b/\u00100B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b/\u00103B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b/\u00105B-\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00104\u001a\u00020\u0006\u0012\u0006\u00106\u001a\u00020\u0006¢\u0006\u0004\b/\u00107J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\r0\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\u0006\u0010\u001b\u001a\u00020\u001aJ,\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000f2\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\r\u0018\u00010\u0011J\u0006\u0010\u001f\u001a\u00020\u000fR(\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R8\u0010.\u001a$\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006:"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/PeriodStateView;", "Landroid/view/View;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "c", "", "colorInt", "", "textString", "a", "b", "", "Lkotlin/Pair;", "lineLength", "", "rtl", "", "Lcom/huami/femalehealth/uilib/widget/calendar/PeriodStateView$State;", GoogleApiAvailabilityLight.a, "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "drawStart", TypedValues.CycleType.S_WAVE_PERIOD, "state", "openPeriod", "isPeriod", "Ljava/util/List;", "stateList", "Z", "renderStateList", LogUtil.I, "stateHeight", "e", "getRtl", "()Z", "setRtl", "(Z)V", "Lkotlin/Function4;", "f", "Lkotlin/jvm/functions/Function4;", "initCanvas", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", TrainingAnalytics.ParamKey.STATE, "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class PeriodStateView extends View {
    private static final float g;
    private static final float h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Pair<Integer, String>> stateList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean period;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private List<State> renderStateList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int stateHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean rtl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function4<Canvas, Integer, Float, Boolean, Integer> initCanvas;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\b\u0018\u0000 P2\u00020\u0001:\u0001PB'\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\bN\u0010OJ@\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0010HÆ\u0001J\t\u0010\u0017\u001a\u00020\rHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0013\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0014\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00102\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u00101R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0019\u0010?\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010,R\u0019\u0010D\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u0010>R\u0019\u0010G\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\bF\u0010>R\u0019\u0010J\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010,\u001a\u0004\bI\u0010>R\u0016\u0010K\u001a\u00020\u00078B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010>R\u0013\u0010M\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\bL\u0010>¨\u0006Q"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/PeriodStateView$State;", "", "Landroid/graphics/Canvas;", "canvas", "", "count", "Lkotlin/Function4;", "", "", "initCanvas", "", "draw", "component1", "", "component2", "component3", "Landroid/content/Context;", "component4", "color", "text", "rtl", DbUtils.Const.Table.CONTEXT, "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getColor", "()I", "b", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "c", "Z", "getRtl", "()Z", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "e", "F", "stateCircleRadius", "f", "getNextLine", "setNextLine", "(Z)V", "nextLine", "g", "getLineNum", "setLineNum", "(I)V", "lineNum", "Landroid/text/TextPaint;", "h", "Landroid/text/TextPaint;", "textPaint", "i", "getEndLength", "()F", "endLength", z.j, "clearance", hl.k, "getLineSpace", "lineSpace", "l", "getLineHeight", "lineHeight", "m", "getLineTrans", "lineTrans", "baseLine", "getSelfLength", "selfLength", "<init>", "(ILjava/lang/String;ZLandroid/content/Context;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class State {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final float n;
        private static final float o;
        private static final float p;
        private static final float q;

        @NotNull
        private static final Lazy<Paint> r;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int color;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final String text;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final boolean rtl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private float stateCircleRadius = n;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private boolean nextLine;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private int lineNum;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        private final TextPaint textPaint;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final float endLength;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final float clearance;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final float lineSpace;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final float lineHeight;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final float lineTrans;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/PeriodStateView$State$Companion;", "", "Landroid/graphics/Paint;", "statePaint$delegate", "Lkotlin/Lazy;", "a", "()Landroid/graphics/Paint;", "statePaint", "", "STATE_SIZE", "F", "getSTATE_SIZE", "()F", "STATE_MARGIN", "STATE_TEXT_MARGIN", "TEXT_SIZE", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "statePaint", "getStatePaint()Landroid/graphics/Paint;"))};

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final Paint a() {
                return (Paint) State.r.getValue();
            }

            public final float getSTATE_SIZE() {
                return State.n;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Paint> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Paint invoke() {
                Paint paint = new Paint();
                paint.setFlags(4);
                paint.setFlags(1);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                return paint;
            }
        }

        static {
            ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
            n = resourceHelper.dp2px(4.0f);
            o = resourceHelper.dp2px(5.0f);
            p = resourceHelper.dp2px(15.0f);
            q = resourceHelper.spToPx(12.0f);
            r = LazyKt__LazyJVMKt.lazy(a.a);
        }

        public State(int i, @NotNull String str, boolean z, @NotNull Context context) {
            this.color = i;
            this.text = str;
            this.rtl = z;
            this.context = context;
            TextPaint textPaint = new TextPaint();
            textPaint.setFlags(4);
            textPaint.setFlags(1);
            float f = q;
            textPaint.setTextSize(f);
            textPaint.setColor(ExtKt.getResColor(getContext(), R.color.s2));
            Unit unit = Unit.INSTANCE;
            this.textPaint = textPaint;
            this.endLength = p;
            this.clearance = o + this.stateCircleRadius;
            float f2 = PeriodStateView.h;
            this.lineSpace = f2;
            this.lineHeight = f;
            this.lineTrans = f2 + (f / 2);
        }

        private final float a() {
            Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
            return fontMetrics.descent + ((fontMetrics.bottom - fontMetrics.top) / 2);
        }

        public static /* synthetic */ State copy$default(State state, int i, String str, boolean z, Context context, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = state.color;
            }
            if ((i2 & 2) != 0) {
                str = state.text;
            }
            if ((i2 & 4) != 0) {
                z = state.rtl;
            }
            if ((i2 & 8) != 0) {
                context = state.context;
            }
            return state.copy(i, str, z, context);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getRtl() {
            return this.rtl;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final State copy(int color, @NotNull String text, boolean rtl, @NotNull Context context) {
            return new State(color, text, rtl, context);
        }

        public final void draw(@NotNull Canvas canvas, int count, @NotNull Function4<? super Canvas, ? super Integer, ? super Float, ? super Boolean, Integer> initCanvas) {
            Companion companion = INSTANCE;
            companion.a().setColor(this.color);
            if (this.nextLine) {
                initCanvas.invoke(canvas, Integer.valueOf(count), Float.valueOf(this.lineNum * this.lineTrans), Boolean.valueOf(this.rtl));
            }
            float f = this.stateCircleRadius;
            canvas.drawCircle(0.0f, f, f, companion.a());
            canvas.translate(this.rtl ? -this.clearance : this.clearance, 0.0f);
            String str = this.text;
            canvas.drawText(str, this.rtl ? -this.textPaint.measureText(str) : 0.0f, a() - (this.stateCircleRadius / 2), this.textPaint);
            canvas.translate(this.rtl ? -(getSelfLength() + this.endLength) : getSelfLength() + this.endLength, 0.0f);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.color == state.color && Intrinsics.areEqual(this.text, state.text) && this.rtl == state.rtl && Intrinsics.areEqual(this.context, state.context);
        }

        public final int getColor() {
            return this.color;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        public final float getEndLength() {
            return this.endLength;
        }

        public final float getLineHeight() {
            return this.lineHeight;
        }

        public final int getLineNum() {
            return this.lineNum;
        }

        public final float getLineSpace() {
            return this.lineSpace;
        }

        public final float getLineTrans() {
            return this.lineTrans;
        }

        public final boolean getNextLine() {
            return this.nextLine;
        }

        public final boolean getRtl() {
            return this.rtl;
        }

        public final float getSelfLength() {
            return this.textPaint.measureText(this.text) + (n * 2) + o + 4;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            int iHashCode = ((this.color * 31) + this.text.hashCode()) * 31;
            boolean z = this.rtl;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return ((iHashCode + r1) * 31) + this.context.hashCode();
        }

        public final void setLineNum(int i) {
            this.lineNum = i;
        }

        public final void setNextLine(boolean z) {
            this.nextLine = z;
        }

        @NotNull
        public String toString() {
            return "State(color=" + this.color + ", text=" + this.text + ", rtl=" + this.rtl + ", context=" + this.context + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n"}, d2 = {"Landroid/graphics/Canvas;", "canvas", "", "count", "", "yOffset", "", "rtl", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function4<Canvas, Integer, Float, Boolean, Integer> {
        public a() {
            super(4);
        }

        public final int a(@NotNull Canvas canvas, @Nullable Integer num, @Nullable Float f, boolean z) {
            if (num != null) {
                canvas.restoreToCount(num.intValue());
            }
            int iSave = canvas.save();
            canvas.translate(z ? PeriodStateView.this.getMeasuredWidth() - PeriodStateView.g : PeriodStateView.g, PeriodStateView.h + (f == null ? 0.0f : f.floatValue()));
            return iSave;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Integer invoke(Canvas canvas, Integer num, Float f, Boolean bool) {
            return Integer.valueOf(a(canvas, num, f, bool.booleanValue()));
        }
    }

    static {
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        g = resourceHelper.dp2px(23.0f);
        h = resourceHelper.dp2px(14.0f);
    }

    public PeriodStateView(@Nullable Context context) {
        this(context, null);
    }

    private final void a(int colorInt, String textString) {
        this.stateList.add(TuplesKt.to(Integer.valueOf(colorInt), textString));
    }

    private final void b() {
        this.stateList.clear();
    }

    private final void c(Context context) {
        performClick();
    }

    private final List<State> d(List<Pair<Integer, String>> list, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int selfLength = 0;
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            State state = new State(((Number) pair.getFirst()).intValue(), (String) pair.getSecond(), z, getContext());
            if (selfLength + state.getSelfLength() <= i) {
                selfLength += ((int) state.getEndLength()) + ((int) state.getSelfLength());
                state.setNextLine(false);
                state.setLineNum(i3);
            } else {
                i3++;
                state.setLineNum(i3);
                selfLength = ((int) state.getSelfLength()) + ((int) state.getEndLength());
                state.setNextLine(true);
            }
            Unit unit = Unit.INSTANCE;
            arrayList.add(state);
            i2 = i4;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openPeriod$default(PeriodStateView periodStateView, boolean z, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        periodStateView.openPeriod(z, list);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final float drawStart() {
        return g - (State.INSTANCE.getSTATE_SIZE() / 2);
    }

    public final boolean getRtl() {
        return this.rtl;
    }

    /* JADX INFO: renamed from: isPeriod, reason: from getter */
    public final boolean getPeriod() {
        return this.period;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas == null) {
            return;
        }
        int iIntValue = this.initCanvas.invoke(canvas, null, null, Boolean.valueOf(getRtl())).intValue();
        List<State> list = this.renderStateList;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((State) it2.next()).draw(canvas, iIntValue, this.initCanvas);
            }
        }
        canvas.restoreToCount(iIntValue);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int lineNum;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        List<State> listD = d(this.stateList, size - (((int) g) * 2), this.rtl);
        State state = (State) CollectionsKt.lastOrNull((List) listD);
        if (state == null) {
            lineNum = 0;
        } else {
            lineNum = (int) (((state.getLineNum() + 1) * state.getLineTrans()) + h);
            this.stateHeight = lineNum;
        }
        Unit unit = Unit.INSTANCE;
        this.renderStateList = listD;
        setMeasuredDimension(size, lineNum);
    }

    public final void openPeriod(boolean period, @Nullable List<Pair<Integer, String>> state) {
        this.period = period;
        b();
        if (state == null) {
            int resColor = ExtKt.getResColor(getContext(), R.color.fh_period_state_circle_color);
            ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
            a(resColor, resourceHelper.getString(R.string.fh_period));
            if (period) {
                a(ForecastStyleKt.getForecastColor(getContext()), resourceHelper.getString(R.string.fh_forecast_period));
                a(ExtKt.getResColor(getContext(), R.color.fh_pregnant_state_circle_color), resourceHelper.getString(R.string.fh_pregnant));
                a(ExtKt.getResColor(getContext(), R.color.fh_ovulation_state_circle_color), resourceHelper.getString(R.string.fh_ovulation));
            }
        } else {
            Iterator<T> it2 = state.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                a(((Number) pair.getFirst()).intValue(), (String) pair.getSecond());
            }
        }
        requestLayout();
    }

    public final void setRtl(boolean z) {
        this.rtl = z;
    }

    public PeriodStateView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PeriodStateView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.stateList = new ArrayList();
        this.initCanvas = new a();
        c(context);
    }

    @RequiresApi(21)
    public PeriodStateView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.stateList = new ArrayList();
        this.initCanvas = new a();
        c(context);
    }
}
