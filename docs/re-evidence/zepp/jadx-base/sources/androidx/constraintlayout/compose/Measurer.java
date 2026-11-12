package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.xiaomi.market.sdk.Constants;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\b¢\u0006\u0005\b\u008b\u0001\u0010<JH\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J!\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010 \u001a\u00020\u001f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001dH\u0002J \u0010$\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0016H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010)\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010'J\b\u0010*\u001a\u00020\u0013H\u0016JI\u0010:\u001a\u0002072\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00104\u001a\u00020\u00052\u0006\u00106\u001a\u000205ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u000f\u0010=\u001a\u00020\u0013H\u0000¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020\u00132\u0006\u0010,\u001a\u00020+H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J\u0018\u0010B\u001a\u00020\u0013*\u00020A2\f\u00103\u001a\b\u0012\u0004\u0012\u00020201J\b\u0010C\u001a\u00020\u0013H\u0016J\u001b\u0010G\u001a\u00020\u0013*\u00020D2\u0006\u0010F\u001a\u00020EH\u0007¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0013H\u0007¢\u0006\u0004\bI\u0010JJ\u000e\u0010K\u001a\u00020\u00132\u0006\u00100\u001a\u00020/R\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010N\u001a\u0004\u0018\u00010'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010U\u001a\u00020T8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR(\u0010[\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020Z0Y8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R(\u0010_\u001a\u0014\u0012\u0004\u0012\u000202\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100Y8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\\R(\u0010a\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020`0Y8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^R\"\u0010d\u001a\u00020c8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u00106\u001a\u0002058\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b6\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001d\u0010t\u001a\u00020o8D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0016\u0010u\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010vR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R%\u0010}\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0083\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0083\u0001\u0010~\u001a\u0006\b\u0084\u0001\u0010\u0080\u0001\"\u0006\b\u0085\u0001\u0010\u0082\u0001R-\u0010\u0089\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u0001j\n\u0012\u0005\u0012\u00030\u0087\u0001`\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u008c\u0001"}, d2 = {"Landroidx/constraintlayout/compose/Measurer;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", "dimensionBehaviour", "", "dimension", "matchConstraintDefaultDimension", "measureStrategy", "", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "", "outConstraints", "obtainConstraints", "", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "measure", "", "copyFrom", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "", "str", "Landroidx/compose/ui/graphics/Color;", "defaultColor", "getColor-wrIjXm8", "(Ljava/lang/String;J)J", "getColor", "Ljava/util/HashMap;", "params", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "startX", "startY", "args", "getDesignInfo", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "layoutReceiver", "addLayoutInformationReceiver", "computeLayoutResult", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "optimizationLevel", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/IntSize;", "performMeasure-DjhGOtQ", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;ILandroidx/compose/ui/layout/MeasureScope;)J", "performMeasure", "resetMeasureState$compose_release", "()V", "resetMeasureState", "applyRootSize-BRTryo0", "(J)V", "applyRootSize", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "performLayout", "didMeasures", "Landroidx/compose/foundation/layout/BoxScope;", "", "forcedScaleFactor", "drawDebugBounds", "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V", "createDesignElements", "(Landroidx/compose/runtime/Composer;I)V", "parseDesignElements", "computedLayoutResult", "Ljava/lang/String;", "layoutInformationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "getLayoutInformationReceiver", "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "setLayoutInformationReceiver", "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", RootDescription.ROOT_ELEMENT, "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "getRoot", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Ljava/util/Map;", "getPlaceables", "()Ljava/util/Map;", "lastMeasures", "Landroidx/constraintlayout/core/state/WidgetFrame;", "frameCache", "getFrameCache", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "setMeasureScope", "(Landroidx/compose/ui/layout/MeasureScope;)V", "Landroidx/constraintlayout/compose/State;", "state$delegate", "Lkotlin/Lazy;", "getState", "()Landroidx/constraintlayout/compose/State;", "state", "widthConstraintsHolder", "[I", "heightConstraintsHolder", "F", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "layoutCurrentWidth", LogUtil.I, "getLayoutCurrentWidth", "()I", "setLayoutCurrentWidth", "(I)V", "layoutCurrentHeight", "getLayoutCurrentHeight", "setLayoutCurrentHeight", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "Lkotlin/collections/ArrayList;", "designElements", "Ljava/util/ArrayList;", "<init>", "compose_release"}, k = 1, mv = {1, 5, 1})
@PublishedApi
public class Measurer implements BasicMeasure.Measurer, DesignInfoProvider {

    @NotNull
    private String computedLayoutResult = "";
    public Density density;

    @NotNull
    private ArrayList<DesignElement> designElements;
    private float forcedScaleFactor;

    @NotNull
    private final Map<Measurable, WidgetFrame> frameCache;

    @NotNull
    private final int[] heightConstraintsHolder;

    @NotNull
    private final Map<Measurable, Integer[]> lastMeasures;
    private int layoutCurrentHeight;
    private int layoutCurrentWidth;

    @Nullable
    private LayoutInformationReceiver layoutInformationReceiver;
    public MeasureScope measureScope;

    @NotNull
    private final Map<Measurable, Placeable> placeables;

    @NotNull
    private final ConstraintWidgetContainer root;

    /* JADX INFO: renamed from: state$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy state;

    @NotNull
    private final int[] widthConstraintsHolder;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Measurer() {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        Unit unit = Unit.INSTANCE;
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<State>() { // from class: androidx.constraintlayout.compose.Measurer$state$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final State getA() {
                return new State(this.this$0.getDensity());
            }
        });
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
        this.designElements = new ArrayList<>();
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* JADX INFO: renamed from: getColor-wrIjXm8, reason: not valid java name */
    private final long m3230getColorwrIjXm8(String str, long defaultColor) {
        if (str != null && StringsKt__StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
            String strSubstring = str.substring(1);
            if (strSubstring.length() == 6) {
                strSubstring = Intrinsics.stringPlus("FF", strSubstring);
            }
            try {
                return ColorKt.Color((int) Long.parseLong(strSubstring, 16));
            } catch (Exception unused) {
            }
        }
        return defaultColor;
    }

    /* JADX INFO: renamed from: getColor-wrIjXm8$default, reason: not valid java name */
    public static /* synthetic */ long m3231getColorwrIjXm8$default(Measurer measurer, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
        }
        if ((i & 2) != 0) {
            j = Color.INSTANCE.m1238getBlack0d7_KjU();
        }
        return measurer.m3230getColorwrIjXm8(str, j);
    }

    private final TextStyle getTextStyle(HashMap<String, String> params) {
        String str = params.get("size");
        long jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
        if (str != null) {
            jM3117getUnspecifiedXSAIIZE = TextUnitKt.getSp(Float.parseFloat(str));
        }
        return new TextStyle(m3231getColorwrIjXm8$default(this, params.get("color"), 0L, 2, null), jM3117getUnspecifiedXSAIIZE, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262140, null);
    }

    private final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int dimension, int matchConstraintDefaultDimension, int measureStrategy, boolean otherDimensionResolved, boolean currentDimensionResolved, int rootMaxConstraint, int[] outConstraints) {
        int i = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i == 1) {
            outConstraints[0] = dimension;
            outConstraints[1] = dimension;
        } else {
            if (i == 2) {
                outConstraints[0] = 0;
                outConstraints[1] = rootMaxConstraint;
                return true;
            }
            if (i == 3) {
                if (ConstraintLayoutKt.DEBUG) {
                    Log.d("CCL", Intrinsics.stringPlus("Measure strategy ", Integer.valueOf(measureStrategy)));
                    Log.d("CCL", Intrinsics.stringPlus("DW ", Integer.valueOf(matchConstraintDefaultDimension)));
                    Log.d("CCL", Intrinsics.stringPlus("ODR ", Boolean.valueOf(otherDimensionResolved)));
                    Log.d("CCL", Intrinsics.stringPlus("IRH ", Boolean.valueOf(currentDimensionResolved)));
                }
                boolean z = currentDimensionResolved || ((measureStrategy == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || matchConstraintDefaultDimension != 1 || otherDimensionResolved));
                if (ConstraintLayoutKt.DEBUG) {
                    Log.d("CCL", Intrinsics.stringPlus("UD ", Boolean.valueOf(z)));
                }
                outConstraints[0] = z ? dimension : 0;
                if (!z) {
                    dimension = rootMaxConstraint;
                }
                outConstraints[1] = dimension;
                if (!z) {
                    return true;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
                }
                outConstraints[0] = rootMaxConstraint;
                outConstraints[1] = rootMaxConstraint;
            }
        }
        return false;
    }

    public final void addLayoutInformationReceiver(@Nullable LayoutInformationReceiver layoutReceiver) {
        this.layoutInformationReceiver = layoutReceiver;
        if (layoutReceiver == null) {
            return;
        }
        layoutReceiver.setLayoutInformation(this.computedLayoutResult);
    }

    /* JADX INFO: renamed from: applyRootSize-BRTryo0, reason: not valid java name */
    public final void m3232applyRootSizeBRTryo0(long constraints) {
        this.root.setWidth(Constraints.m2935getMaxWidthimpl(constraints));
        this.root.setHeight(Constraints.m2934getMaxHeightimpl(constraints));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            Integer numValueOf = layoutInformationReceiver == null ? null : Integer.valueOf(layoutInformationReceiver.getForcedWidth());
            if (numValueOf == null || numValueOf.intValue() != Integer.MIN_VALUE) {
                int forcedWidth = this.layoutInformationReceiver.getForcedWidth();
                if (forcedWidth > this.root.getWidth()) {
                    this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
                } else {
                    this.forcedScaleFactor = 1.0f;
                }
                this.root.setWidth(forcedWidth);
            }
        }
        LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
        if (layoutInformationReceiver2 != null) {
            Integer numValueOf2 = layoutInformationReceiver2 != null ? Integer.valueOf(layoutInformationReceiver2.getForcedHeight()) : null;
            if (numValueOf2 == null || numValueOf2.intValue() != Integer.MIN_VALUE) {
                int forcedHeight = this.layoutInformationReceiver.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                float height = forcedHeight > this.root.getHeight() ? this.root.getHeight() / forcedHeight : 1.0f;
                if (height < this.forcedScaleFactor) {
                    this.forcedScaleFactor = height;
                }
                this.root.setHeight(forcedHeight);
            }
        }
        this.layoutCurrentWidth = this.root.getWidth();
        this.layoutCurrentHeight = this.root.getHeight();
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.root.getWidth() + " ,");
        sb.append("  bottom:  " + this.root.getHeight() + " ,");
        sb.append(" } }");
        for (ConstraintWidget constraintWidget2 : this.root.getChildren()) {
            Object companionWidget = constraintWidget2.getCompanionWidget();
            if (companionWidget instanceof Measurable) {
                WidgetFrame widgetFrame = null;
                if (constraintWidget2.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutIdKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                    }
                    constraintWidget2.stringId = layoutId == null ? null : layoutId.toString();
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(companionWidget);
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb.append(StringUtil.SPACE + ((Object) constraintWidget2.stringId) + ": {");
                    sb.append(" interpolated : ");
                    widgetFrame.serialize(sb, true);
                    sb.append("}, ");
                }
            } else if (constraintWidget2 instanceof Guideline) {
                sb.append(StringUtil.SPACE + ((Object) constraintWidget2.stringId) + ": {");
                Guideline guideline = (Guideline) constraintWidget2;
                if (guideline.getOrientation() == 0) {
                    sb.append(" type: 'hGuideline', ");
                } else {
                    sb.append(" type: 'vGuideline', ");
                }
                sb.append(" interpolated: ");
                sb.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        String string = sb.toString();
        this.computedLayoutResult = string;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver == null) {
            return;
        }
        layoutInformationReceiver.setLayoutInformation(string);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x028b  */
    @Composable
    public final void createDesignElements(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-186577107);
        for (DesignElement designElement : this.designElements) {
            String id = designElement.getId();
            Function4<String, HashMap<String, String>, Composer, Integer, Unit> function4 = DesignElements.INSTANCE.getMap().get(designElement.getType());
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(-186576910);
                function4.invoke(id, designElement.getParams(), composerStartRestartGroup, 64);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-186576844);
                switch (designElement.getType()) {
                    case "button":
                        composerStartRestartGroup.startReplaceableGroup(-186576772);
                        String str = designElement.getParams().get("text");
                        if (str == null) {
                            str = "text";
                        }
                        BasicTextKt.m407BasicTextBpD7jsM(str, PaddingKt.m281padding3ABfNKs(BackgroundKt.m111backgroundbw27NRU$default(ClipKt.clip(LayoutIdKt.layoutId(Modifier.INSTANCE, id), RoundedCornerShapeKt.RoundedCornerShape(20)), m3230getColorwrIjXm8(designElement.getParams().get(b.H), Color.INSTANCE.m1244getLightGray0d7_KjU()), null, 2, null), Dp.m2965constructorimpl(8)), getTextStyle(designElement.getParams()), null, 0, false, 0, composerStartRestartGroup, 32768, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case "textfield":
                        composerStartRestartGroup.startReplaceableGroup(-186575317);
                        String str2 = designElement.getParams().get("text");
                        if (str2 == null) {
                            str2 = "text";
                        }
                        BasicTextFieldKt.BasicTextField(str2, (Function1<? super String, Unit>) new Function1<String, Unit>() { // from class: androidx.constraintlayout.compose.Measurer.createDesignElements.2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str3) {
                                invoke2(str3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull String str3) {
                            }
                        }, LayoutIdKt.layoutId(Modifier.INSTANCE, id), false, false, (TextStyle) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composerStartRestartGroup, 0, 0, 32760);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case "box":
                        composerStartRestartGroup.startReplaceableGroup(-186576210);
                        String str3 = designElement.getParams().get("text");
                        if (str3 == null) {
                            str3 = "";
                        }
                        long jM3230getColorwrIjXm8 = m3230getColorwrIjXm8(designElement.getParams().get(b.H), Color.INSTANCE.m1244getLightGray0d7_KjU());
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM111backgroundbw27NRU$default = BackgroundKt.m111backgroundbw27NRU$default(LayoutIdKt.layoutId(companion, id), jM3230getColorwrIjXm8, null, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM111backgroundbw27NRU$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BasicTextKt.m407BasicTextBpD7jsM(str3, PaddingKt.m281padding3ABfNKs(companion, Dp.m2965constructorimpl(8)), getTextStyle(designElement.getParams()), null, 0, false, 0, composerStartRestartGroup, 32816, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case "text":
                        composerStartRestartGroup.startReplaceableGroup(-186575591);
                        String str4 = designElement.getParams().get("text");
                        if (str4 == null) {
                            str4 = "text";
                        }
                        BasicTextKt.m407BasicTextBpD7jsM(str4, LayoutIdKt.layoutId(Modifier.INSTANCE, id), getTextStyle(designElement.getParams()), null, 0, false, 0, composerStartRestartGroup, 32768, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case "image":
                        composerStartRestartGroup.startReplaceableGroup(-186574977);
                        ImageKt.Image(PainterResources_androidKt.painterResource(android.R.drawable.ic_menu_gallery, composerStartRestartGroup, 0), "Placeholder Image", LayoutIdKt.layoutId(Modifier.INSTANCE, id), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    default:
                        composerStartRestartGroup.startReplaceableGroup(-186574652);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.Measurer.createDesignElements.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                Measurer.this.createDesignElements(composer2, i | 1);
            }
        });
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }

    @Composable
    public final void drawDebugBounds(@NotNull final BoxScope boxScope, final float f, @Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-756996700);
        CanvasKt.Canvas(boxScope.matchParentSize(Modifier.INSTANCE), new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.Measurer.drawDebugBounds.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawScope) {
                float layoutCurrentWidth = Measurer.this.getLayoutCurrentWidth() * f;
                float layoutCurrentHeight = Measurer.this.getLayoutCurrentHeight() * f;
                float fM1052getWidthimpl = (Size.m1052getWidthimpl(drawScope.mo1585getSizeNHjbRc()) - layoutCurrentWidth) / 2.0f;
                float fM1049getHeightimpl = (Size.m1049getHeightimpl(drawScope.mo1585getSizeNHjbRc()) - layoutCurrentHeight) / 2.0f;
                Color.Companion companion = Color.INSTANCE;
                long jM1249getWhite0d7_KjU = companion.m1249getWhite0d7_KjU();
                float f2 = fM1052getWidthimpl + layoutCurrentWidth;
                DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, jM1249getWhite0d7_KjU, OffsetKt.Offset(fM1052getWidthimpl, fM1049getHeightimpl), OffsetKt.Offset(f2, fM1049getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                float f3 = fM1049getHeightimpl + layoutCurrentHeight;
                DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, jM1249getWhite0d7_KjU, OffsetKt.Offset(f2, fM1049getHeightimpl), OffsetKt.Offset(f2, f3), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, jM1249getWhite0d7_KjU, OffsetKt.Offset(f2, f3), OffsetKt.Offset(fM1052getWidthimpl, f3), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, jM1249getWhite0d7_KjU, OffsetKt.Offset(fM1052getWidthimpl, f3), OffsetKt.Offset(fM1052getWidthimpl, fM1049getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                float f4 = 1;
                float f5 = fM1052getWidthimpl + f4;
                float f6 = fM1049getHeightimpl + f4;
                long jM1238getBlack0d7_KjU = companion.m1238getBlack0d7_KjU();
                float f7 = layoutCurrentWidth + f5;
                DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, jM1238getBlack0d7_KjU, OffsetKt.Offset(f5, f6), OffsetKt.Offset(f7, f6), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                float f8 = layoutCurrentHeight + f6;
                DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, jM1238getBlack0d7_KjU, OffsetKt.Offset(f7, f6), OffsetKt.Offset(f7, f8), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, jM1238getBlack0d7_KjU, OffsetKt.Offset(f7, f8), OffsetKt.Offset(f5, f8), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, jM1238getBlack0d7_KjU, OffsetKt.Offset(f5, f8), OffsetKt.Offset(f5, f6), 0.0f, 0, null, 0.0f, null, 0, 504, null);
            }
        }, composerStartRestartGroup, 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.Measurer.drawDebugBounds.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                Measurer.this.drawDebugBounds(boxScope, f, composer2, i | 1);
            }
        });
    }

    @NotNull
    public final Density getDensity() {
        Density density = this.density;
        Objects.requireNonNull(density);
        return density;
    }

    @Override // androidx.constraintlayout.compose.DesignInfoProvider
    @NotNull
    public String getDesignInfo(int startX, int startY, @NotNull String args) {
        return ToolingUtilsKt.parseConstraintsToJson(this.root, getState(), startX, startY);
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    @NotNull
    public final Map<Measurable, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    public final int getLayoutCurrentHeight() {
        return this.layoutCurrentHeight;
    }

    public final int getLayoutCurrentWidth() {
        return this.layoutCurrentWidth;
    }

    @Nullable
    public final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    @NotNull
    public final MeasureScope getMeasureScope() {
        MeasureScope measureScope = this.measureScope;
        Objects.requireNonNull(measureScope);
        return measureScope;
    }

    @NotNull
    public final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    @NotNull
    public final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    @NotNull
    public final State getState() {
        return (State) this.state.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x013b  */
    /* JADX WARN: Code duplicated, block: B:51:0x017a  */
    /* JADX WARN: Code duplicated, block: B:52:0x017c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0180  */
    /* JADX WARN: Code duplicated, block: B:58:0x018d  */
    /* JADX WARN: Code duplicated, block: B:59:0x018f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x01de  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x0202  */
    /* JADX WARN: Code duplicated, block: B:87:0x0208  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00fc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x013b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x0208, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void measure(@NotNull ConstraintWidget constraintWidget, @NotNull BasicMeasure.Measure measure) {
        Integer num;
        Integer num2;
        String str;
        Measurable measurable;
        Placeable placeableMo2468measureBRTryo0;
        Integer numValueOf;
        boolean z;
        Integer numValueOf2;
        boolean z2;
        int iIntValue;
        Integer numValueOf3;
        boolean z3;
        Integer numValueOf4;
        boolean z4;
        int iIntValue2;
        boolean z5;
        Object companionWidget = constraintWidget.getCompanionWidget();
        if (companionWidget instanceof Measurable) {
            if (ConstraintLayoutKt.DEBUG) {
                Log.d("CCL", "Measuring " + LayoutIdKt.getLayoutId((Measurable) companionWidget) + " with: " + ConstraintLayoutKt.toDebugString(constraintWidget) + '\n' + ConstraintLayoutKt.toDebugString(measure));
            }
            Integer[] numArr = this.lastMeasures.get(companionWidget);
            obtainConstraints(measure.horizontalBehavior, measure.horizontalDimension, constraintWidget.mMatchConstraintDefaultWidth, measure.measureStrategy, ((numArr != null && (num = numArr[1]) != null) ? num.intValue() : 0) == constraintWidget.getHeight(), constraintWidget.isResolvedHorizontally(), Constraints.m2935getMaxWidthimpl(getState().getRootIncomingConstraints()), this.widthConstraintsHolder);
            obtainConstraints(measure.verticalBehavior, measure.verticalDimension, constraintWidget.mMatchConstraintDefaultHeight, measure.measureStrategy, ((numArr != null && (num2 = numArr[0]) != null) ? num2.intValue() : 0) == constraintWidget.getWidth(), constraintWidget.isResolvedVertically(), Constraints.m2934getMaxHeightimpl(getState().getRootIncomingConstraints()), this.heightConstraintsHolder);
            int[] iArr = this.widthConstraintsHolder;
            int i = iArr[0];
            int i2 = iArr[1];
            int[] iArr2 = this.heightConstraintsHolder;
            long jConstraints = ConstraintsKt.Constraints(i, i2, iArr2[0], iArr2[1]);
            int i3 = measure.measureStrategy;
            if (i3 == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || i3 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
                if (ConstraintLayoutKt.DEBUG) {
                    str = "CCL";
                    Log.d(str, "Measuring " + LayoutIdKt.getLayoutId((Measurable) companionWidget) + " with " + ((Object) Constraints.m2940toStringimpl(jConstraints)));
                } else {
                    str = "CCL";
                }
                measurable = (Measurable) companionWidget;
                placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(jConstraints);
                getPlaceables().put(companionWidget, placeableMo2468measureBRTryo0);
                constraintWidget.setMeasureRequested(false);
                if (ConstraintLayoutKt.DEBUG) {
                    Log.d(str, LayoutIdKt.getLayoutId(measurable) + " is size " + placeableMo2468measureBRTryo0.getWidth() + StringUtil.SPACE + placeableMo2468measureBRTryo0.getHeight());
                }
                Integer numValueOf5 = Integer.valueOf(placeableMo2468measureBRTryo0.getWidth());
                numValueOf = Integer.valueOf(constraintWidget.mMatchConstraintMinWidth);
                if (numValueOf.intValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    numValueOf = null;
                }
                numValueOf2 = Integer.valueOf(constraintWidget.mMatchConstraintMaxWidth);
                if (numValueOf2.intValue() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    numValueOf2 = null;
                }
                iIntValue = ((Number) RangesKt.coerceIn(numValueOf5, numValueOf, numValueOf2)).intValue();
                Integer numValueOf6 = Integer.valueOf(placeableMo2468measureBRTryo0.getHeight());
                numValueOf3 = Integer.valueOf(constraintWidget.mMatchConstraintMinHeight);
                if (numValueOf3.intValue() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    numValueOf3 = null;
                }
                numValueOf4 = Integer.valueOf(constraintWidget.mMatchConstraintMaxHeight);
                if (numValueOf4.intValue() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    numValueOf4 = null;
                }
                iIntValue2 = ((Number) RangesKt.coerceIn(numValueOf6, numValueOf3, numValueOf4)).intValue();
                if (iIntValue != placeableMo2468measureBRTryo0.getWidth()) {
                    jConstraints = ConstraintsKt.Constraints(iIntValue, iIntValue, Constraints.m2936getMinHeightimpl(jConstraints), Constraints.m2934getMaxHeightimpl(jConstraints));
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (iIntValue2 != placeableMo2468measureBRTryo0.getHeight()) {
                    jConstraints = ConstraintsKt.Constraints(Constraints.m2937getMinWidthimpl(jConstraints), Constraints.m2935getMaxWidthimpl(jConstraints), iIntValue2, iIntValue2);
                    z5 = true;
                }
                if (z5) {
                    if (ConstraintLayoutKt.DEBUG) {
                        Log.d(str, "Remeasuring coerced " + LayoutIdKt.getLayoutId(measurable) + " with " + ((Object) Constraints.m2940toStringimpl(jConstraints)));
                    }
                    getPlaceables().put(companionWidget, measurable.mo2468measureBRTryo0(jConstraints));
                    constraintWidget.setMeasureRequested(false);
                }
            } else {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || constraintWidget.mMatchConstraintDefaultWidth != 0 || measure.verticalBehavior != dimensionBehaviour2 || constraintWidget.mMatchConstraintDefaultHeight != 0) {
                    if (ConstraintLayoutKt.DEBUG) {
                        str = "CCL";
                        Log.d(str, "Measuring " + LayoutIdKt.getLayoutId((Measurable) companionWidget) + " with " + ((Object) Constraints.m2940toStringimpl(jConstraints)));
                    } else {
                        str = "CCL";
                    }
                    measurable = (Measurable) companionWidget;
                    placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(jConstraints);
                    getPlaceables().put(companionWidget, placeableMo2468measureBRTryo0);
                    constraintWidget.setMeasureRequested(false);
                    if (ConstraintLayoutKt.DEBUG) {
                        Log.d(str, LayoutIdKt.getLayoutId(measurable) + " is size " + placeableMo2468measureBRTryo0.getWidth() + StringUtil.SPACE + placeableMo2468measureBRTryo0.getHeight());
                    }
                    Integer numValueOf7 = Integer.valueOf(placeableMo2468measureBRTryo0.getWidth());
                    numValueOf = Integer.valueOf(constraintWidget.mMatchConstraintMinWidth);
                    if (numValueOf.intValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        numValueOf = null;
                    }
                    numValueOf2 = Integer.valueOf(constraintWidget.mMatchConstraintMaxWidth);
                    if (numValueOf2.intValue() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        numValueOf2 = null;
                    }
                    iIntValue = ((Number) RangesKt.coerceIn(numValueOf7, numValueOf, numValueOf2)).intValue();
                    Integer numValueOf8 = Integer.valueOf(placeableMo2468measureBRTryo0.getHeight());
                    numValueOf3 = Integer.valueOf(constraintWidget.mMatchConstraintMinHeight);
                    if (numValueOf3.intValue() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        numValueOf3 = null;
                    }
                    numValueOf4 = Integer.valueOf(constraintWidget.mMatchConstraintMaxHeight);
                    if (numValueOf4.intValue() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        numValueOf4 = null;
                    }
                    iIntValue2 = ((Number) RangesKt.coerceIn(numValueOf8, numValueOf3, numValueOf4)).intValue();
                    if (iIntValue != placeableMo2468measureBRTryo0.getWidth()) {
                        jConstraints = ConstraintsKt.Constraints(iIntValue, iIntValue, Constraints.m2936getMinHeightimpl(jConstraints), Constraints.m2934getMaxHeightimpl(jConstraints));
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (iIntValue2 != placeableMo2468measureBRTryo0.getHeight()) {
                        jConstraints = ConstraintsKt.Constraints(Constraints.m2937getMinWidthimpl(jConstraints), Constraints.m2935getMaxWidthimpl(jConstraints), iIntValue2, iIntValue2);
                        z5 = true;
                    }
                    if (z5) {
                        if (ConstraintLayoutKt.DEBUG) {
                            Log.d(str, "Remeasuring coerced " + LayoutIdKt.getLayoutId(measurable) + " with " + ((Object) Constraints.m2940toStringimpl(jConstraints)));
                        }
                        getPlaceables().put(companionWidget, measurable.mo2468measureBRTryo0(jConstraints));
                        constraintWidget.setMeasureRequested(false);
                    }
                }
            }
            Placeable placeable = this.placeables.get(companionWidget);
            Integer numValueOf9 = placeable == null ? null : Integer.valueOf(placeable.getWidth());
            measure.measuredWidth = numValueOf9 == null ? constraintWidget.getWidth() : numValueOf9.intValue();
            Integer numValueOf10 = placeable != null ? Integer.valueOf(placeable.getHeight()) : null;
            measure.measuredHeight = numValueOf10 == null ? constraintWidget.getHeight() : numValueOf10.intValue();
            int i4 = (placeable == null || !getState().isBaselineNeeded$compose_release(constraintWidget)) ? Integer.MIN_VALUE : placeable.get(AlignmentLineKt.getFirstBaseline());
            measure.measuredHasBaseline = i4 != Integer.MIN_VALUE;
            measure.measuredBaseline = i4;
            Map<Measurable, Integer[]> map = this.lastMeasures;
            Integer[] numArr2 = map.get(companionWidget);
            if (numArr2 == null) {
                numArr2 = new Integer[]{0, 0, Integer.MIN_VALUE};
                map.put((Measurable) companionWidget, numArr2);
            }
            copyFrom(numArr2, measure);
            measure.measuredNeedsSolverPass = (measure.measuredWidth == measure.horizontalDimension && measure.measuredHeight == measure.verticalDimension) ? false : true;
        }
    }

    public final void parseDesignElements(@NotNull ConstraintSet constraintSet) {
        if (constraintSet instanceof JSONConstraintSet) {
            ((JSONConstraintSet) constraintSet).emitDesignElements(this.designElements);
        }
    }

    public final void performLayout(@NotNull Placeable.PlacementScope placementScope, @NotNull List<? extends Measurable> list) {
        if (this.frameCache.isEmpty()) {
            for (ConstraintWidget constraintWidget : this.root.getChildren()) {
                Object companionWidget = constraintWidget.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put((Measurable) companionWidget, new WidgetFrame(constraintWidget.frame.update()));
                }
            }
        }
        int i = 0;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                Measurable measurable = list.get(i);
                final WidgetFrame widgetFrame = getFrameCache().get(measurable);
                if (widgetFrame == null) {
                    return;
                }
                if (widgetFrame.isDefaultTransform()) {
                    int i3 = getFrameCache().get(measurable).left;
                    int i4 = getFrameCache().get(measurable).top;
                    Placeable placeable = getPlaceables().get(measurable);
                    if (placeable != null) {
                        Placeable.PlacementScope.m2506place70tqf50$default(placementScope, placeable, IntOffsetKt.IntOffset(i3, i4), 0.0f, 2, null);
                    }
                } else {
                    Function1<GraphicsLayerScope, Unit> function1 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$performLayout$1$layerBlock$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                            if (!Float.isNaN(widgetFrame.pivotX) || !Float.isNaN(widgetFrame.pivotY)) {
                                graphicsLayerScope.mo1349setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(Float.isNaN(widgetFrame.pivotX) ? 0.5f : widgetFrame.pivotX, Float.isNaN(widgetFrame.pivotY) ? 0.5f : widgetFrame.pivotY));
                            }
                            if (!Float.isNaN(widgetFrame.rotationX)) {
                                graphicsLayerScope.setRotationX(widgetFrame.rotationX);
                            }
                            if (!Float.isNaN(widgetFrame.rotationY)) {
                                graphicsLayerScope.setRotationY(widgetFrame.rotationY);
                            }
                            if (!Float.isNaN(widgetFrame.rotationZ)) {
                                graphicsLayerScope.setRotationZ(widgetFrame.rotationZ);
                            }
                            if (!Float.isNaN(widgetFrame.translationX)) {
                                graphicsLayerScope.setTranslationX(widgetFrame.translationX);
                            }
                            if (!Float.isNaN(widgetFrame.translationY)) {
                                graphicsLayerScope.setTranslationY(widgetFrame.translationY);
                            }
                            if (!Float.isNaN(widgetFrame.translationZ)) {
                                graphicsLayerScope.setShadowElevation(widgetFrame.translationZ);
                            }
                            if (!Float.isNaN(widgetFrame.scaleX) || !Float.isNaN(widgetFrame.scaleY)) {
                                graphicsLayerScope.setScaleX(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX);
                                graphicsLayerScope.setScaleY(Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY);
                            }
                            if (Float.isNaN(widgetFrame.alpha)) {
                                return;
                            }
                            graphicsLayerScope.setAlpha(widgetFrame.alpha);
                        }
                    };
                    int i5 = getFrameCache().get(measurable).left;
                    int i6 = getFrameCache().get(measurable).top;
                    float f = Float.isNaN(widgetFrame.translationZ) ? 0.0f : widgetFrame.translationZ;
                    Placeable placeable2 = getPlaceables().get(measurable);
                    if (placeable2 != null) {
                        placementScope.placeWithLayer(placeable2, i5, i6, f, function1);
                    }
                }
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if ((layoutInformationReceiver == null ? null : layoutInformationReceiver.getLayoutInformationMode()) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: performMeasure-DjhGOtQ, reason: not valid java name */
    public final long m3233performMeasureDjhGOtQ(long constraints, @NotNull LayoutDirection layoutDirection, @NotNull ConstraintSet constraintSet, @NotNull List<? extends Measurable> measurables, int optimizationLevel, @NotNull MeasureScope measureScope) {
        String string;
        setDensity(measureScope);
        setMeasureScope(measureScope);
        getState().width(Constraints.m2933getHasFixedWidthimpl(constraints) ? androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2935getMaxWidthimpl(constraints)) : androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2937getMinWidthimpl(constraints)));
        getState().height(Constraints.m2932getHasFixedHeightimpl(constraints) ? androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2934getMaxHeightimpl(constraints)) : androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2936getMinHeightimpl(constraints)));
        getState().m3265setRootIncomingConstraintsBRTryo0(constraints);
        getState().setLayoutDirection(layoutDirection);
        resetMeasureState$compose_release();
        if (constraintSet.isDirty(measurables)) {
            getState().reset();
            constraintSet.applyTo(getState(), measurables);
            ConstraintLayoutKt.buildMapping(getState(), measurables);
            getState().apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(getState(), measurables);
        }
        m3232applyRootSizeBRTryo0(constraints);
        this.root.updateHierarchy();
        if (ConstraintLayoutKt.DEBUG) {
            this.root.setDebugName("ConstraintLayout");
            for (ConstraintWidget constraintWidget : this.root.getChildren()) {
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                Object layoutId = measurable == null ? null : LayoutIdKt.getLayoutId(measurable);
                String str = "NOTAG";
                if (layoutId != null && (string = layoutId.toString()) != null) {
                    str = string;
                }
                constraintWidget.setDebugName(str);
            }
            Log.d("CCL", Intrinsics.stringPlus("ConstraintLayout is asked to measure with ", Constraints.m2940toStringimpl(constraints)));
            Log.d("CCL", ConstraintLayoutKt.toDebugString(this.root));
            Iterator<ConstraintWidget> it2 = this.root.getChildren().iterator();
            while (it2.hasNext()) {
                Log.d("CCL", ConstraintLayoutKt.toDebugString(it2.next()));
            }
        }
        this.root.setOptimizationLevel(optimizationLevel);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        for (ConstraintWidget constraintWidget2 : this.root.getChildren()) {
            Object companionWidget2 = constraintWidget2.getCompanionWidget();
            if (companionWidget2 instanceof Measurable) {
                Placeable placeable = this.placeables.get(companionWidget2);
                Integer numValueOf = placeable == null ? null : Integer.valueOf(placeable.getWidth());
                Integer numValueOf2 = placeable == null ? null : Integer.valueOf(placeable.getHeight());
                int width = constraintWidget2.getWidth();
                if (numValueOf != null && width == numValueOf.intValue()) {
                    int height = constraintWidget2.getHeight();
                    if (numValueOf2 != null && height == numValueOf2.intValue()) {
                    }
                }
                if (ConstraintLayoutKt.DEBUG) {
                    Log.d("CCL", "Final measurement for " + LayoutIdKt.getLayoutId((Measurable) companionWidget2) + " to confirm size " + constraintWidget2.getWidth() + StringUtil.SPACE + constraintWidget2.getHeight());
                }
                getPlaceables().put(companionWidget2, ((Measurable) companionWidget2).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(constraintWidget2.getWidth(), constraintWidget2.getHeight())));
            }
        }
        if (ConstraintLayoutKt.DEBUG) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.root.getWidth() + StringUtil.SPACE + this.root.getHeight());
        }
        return IntSizeKt.IntSize(this.root.getWidth(), this.root.getHeight());
    }

    public final void resetMeasureState$compose_release() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    public final void setDensity(@NotNull Density density) {
        this.density = density;
    }

    public final void setForcedScaleFactor(float f) {
        this.forcedScaleFactor = f;
    }

    public final void setLayoutCurrentHeight(int i) {
        this.layoutCurrentHeight = i;
    }

    public final void setLayoutCurrentWidth(int i) {
        this.layoutCurrentWidth = i;
    }

    public final void setLayoutInformationReceiver(@Nullable LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
    }

    public final void setMeasureScope(@NotNull MeasureScope measureScope) {
        this.measureScope = measureScope;
    }
}
