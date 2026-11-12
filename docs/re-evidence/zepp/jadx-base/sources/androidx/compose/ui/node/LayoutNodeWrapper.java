package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.watch.notification.TransportUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\r\b \u0018\u0000 Ö\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0002Ö\u0001B\u0011\u0012\u0006\u0010}\u001a\u00020|¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\b\u0010\b\u001a\u00020\u0007H\u0002J%\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0014J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0014J/\u0010!\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001dH\u0084\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H&J\u0011\u0010%\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0086\u0002J@\u0010/\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0019\u0010,\u001a\u0015\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b+H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u000e\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0006J\u0010\u00102\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0006H$J\u0011\u00103\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0006H\u0096\u0002J!\u00104\u001a\u00020\u00072\u0019\u0010,\u001a\u0015\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b+J+\u0010;\u001a\u00020\u00072\u0006\u00105\u001a\u00020\n2\f\u00108\u001a\b\u0012\u0004\u0012\u00020706H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J+\u0010?\u001a\u00020\u00072\u0006\u00105\u001a\u00020\n2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<06H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010:J\u001d\u0010C\u001a\u00020\n2\u0006\u0010@\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ\u001d\u0010F\u001a\u00020\n2\u0006\u0010D\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010BJ%\u0010K\u001a\u00020\n2\u0006\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JJ\u0018\u0010M\u001a\u00020L2\u0006\u0010G\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001d\u0010O\u001a\u00020\n2\u0006\u0010D\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010BJ(\u0010P\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00062\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0002J\u001d\u0010R\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010BJ\u001d\u0010T\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010BJ\u0018\u0010W\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00062\u0006\u0010V\u001a\u00020UH\u0004J\b\u0010X\u001a\u00020\u0007H\u0016J\b\u0010Y\u001a\u00020\u0007H\u0016J\u001d\u0010\\\u001a\u00020\u00112\u0006\u00105\u001a\u00020\nH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010[J\u001d\u0010^\u001a\u00020\u00112\u0006\u00105\u001a\u00020\nH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010[J\b\u0010_\u001a\u00020\u0007H\u0016J\n\u0010a\u001a\u0004\u0018\u00010`H&J\n\u0010b\u001a\u0004\u0018\u00010`H&J\n\u0010d\u001a\u0004\u0018\u00010cH&J\n\u0010e\u001a\u0004\u0018\u00010cH&J\n\u0010f\u001a\u0004\u0018\u00010cH&J\u0010\u0010i\u001a\u00020\u00072\u0006\u0010h\u001a\u00020gH\u0016J\u0010\u0010l\u001a\u00020\u00072\u0006\u0010k\u001a\u00020jH\u0016J\u0011\u0010o\u001a\u0004\u0018\u00010cH\u0000¢\u0006\u0004\bm\u0010nJ\u0011\u0010s\u001a\u0004\u0018\u00010pH\u0000¢\u0006\u0004\bq\u0010rJ\n\u0010t\u001a\u0004\u0018\u00010pH&J\n\u0010u\u001a\u0004\u0018\u00010pH&J\n\u0010v\u001a\u0004\u0018\u00010pH&J\b\u0010w\u001a\u00020\u0007H\u0016J\u0017\u0010{\u001a\u00020\u00002\u0006\u0010x\u001a\u00020\u0000H\u0000¢\u0006\u0004\by\u0010zR\u001d\u0010}\u001a\u00020|8\u0000@\u0000X\u0080\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R+\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001RN\u0010,\u001a\u0015\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b+2\u001a\u0010\u0089\u0001\u001a\u0015\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b+8\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\b,\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0088\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R(\u0010\u0098\u0001\u001a\u0011\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R1\u0010'\u001a\u00020&2\u0007\u0010\u0089\u0001\u001a\u00020&8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0003¢\u0006\u000f\n\u0005\b'\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R0\u0010)\u001a\u00020(2\u0007\u0010\u0089\u0001\u001a\u00020(8\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\b)\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R)\u0010¢\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u0088\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R*\u0010ª\u0001\u001a\u00020\u00112\u0007\u0010\u0089\u0001\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bª\u0001\u0010\u0088\u0001\u001a\u0006\b«\u0001\u0010£\u0001R0\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010¬\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010²\u0001\u001a\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010£\u0001R\u0019\u0010µ\u0001\u001a\u00020\u000f8B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u001a\u0010¹\u0001\u001a\u00030¶\u00018B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u001b\u0010»\u0001\u001a\u0004\u0018\u00010\u00008P@\u0010X\u0090\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010\u0084\u0001R\u001a\u0010¿\u0001\u001a\u00030¼\u00018&@&X¦\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R \u0010Â\u0001\u001a\u00030À\u00018F@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0003¢\u0006\b\u001a\u0006\bÁ\u0001\u0010\u009c\u0001R\u0016\u0010Ã\u0001\u001a\u00020\u00118F@\u0006¢\u0006\b\u001a\u0006\bÃ\u0001\u0010£\u0001R,\u0010É\u0001\u001a\u00030\u0094\u00012\b\u0010Ä\u0001\u001a\u00030\u0094\u00018F@@X\u0086\u000e¢\u0006\u0010\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R \u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00020\"0Ê\u00018V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0018\u0010Ð\u0001\u001a\u0004\u0018\u00010\u00038F@\u0006¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00038F@\u0006¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ï\u0001R\u0019\u0010Ó\u0001\u001a\u00020\u00118V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010£\u0001\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001\n\u0002\b!¨\u0006×\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "updateLayerParameters", "ancestor", "Landroidx/compose/ui/geometry/Offset;", "offset", "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/LayoutNodeWrapper;J)J", "ancestorToLocal", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "", "clipBounds", "bounds", "rectInParent", "fromParentRect", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "onMeasureResultChanged", "getWrappedByCoordinates", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "get", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "canvas", "draw", "performDraw", "invoke", "onLayerBlockUpdated", "pointerPosition", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitPointerInputFilters", "hitTest-3MmeM6k", "(JLjava/util/List;)V", "hitTest", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitSemanticsWrappers", "hitTestSemantics-3MmeM6k", "hitTestSemantics", "relativeToWindow", "windowToLocal-MK-Hz9U", "(J)J", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "localToRoot-MK-Hz9U", "localToRoot", "withPositionTranslation", "toParentPosition-MK-Hz9U", "toParentPosition", "fromParentPosition-MK-Hz9U", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "attach", "detach", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "findPreviousNestedScrollWrapper", "findNextNestedScrollWrapper", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findPreviousFocusWrapper", "findNextFocusWrapper", "findLastFocusWrapper", "Landroidx/compose/ui/focus/FocusState;", "focusState", "propagateFocusEvent", "Landroidx/compose/ui/focus/FocusOrder;", "focusOrder", "populateFocusOrder", "findParentFocusNode$ui_release", "()Landroidx/compose/ui/node/ModifiedFocusNode;", "findParentFocusNode", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findParentKeyInputNode$ui_release", "()Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findParentKeyInputNode", "findPreviousKeyInputWrapper", "findNextKeyInputWrapper", "findLastKeyInputWrapper", "onModifierChanged", "other", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)Landroidx/compose/ui/node/LayoutNodeWrapper;", "findCommonAncestor", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "wrappedBy", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getWrappedBy$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setWrappedBy$ui_release", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "isClipping", "Z", "<set-?>", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "_isAttached", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "", "oldAlignmentLines", "Ljava/util/Map;", "J", "getPosition-nOcc-ac", "()J", "F", "getZIndex", "()F", "setZIndex", "(F)V", "isShallowPlacing", "()Z", "setShallowPlacing", "(Z)V", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "invalidateParentLayer", "Lkotlin/jvm/functions/Function0;", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "getHasMeasureResult", "hasMeasureResult", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "getWrapped$ui_release", "wrapped", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "isAttached", "value", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "isValid", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class LayoutNodeWrapper extends Placeable implements Measurable, LayoutCoordinates, OwnerScope, Function1<Canvas, Unit> {

    @NotNull
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";

    @NotNull
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private boolean _isAttached;

    @Nullable
    private MeasureResult _measureResult;

    @Nullable
    private MutableRect _rectCache;
    private boolean isClipping;
    private boolean isShallowPlacing;
    private boolean lastLayerDrawingWasSkipped;

    @Nullable
    private OwnedLayer layer;

    @Nullable
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;

    @NotNull
    private Density layerDensity;

    @NotNull
    private LayoutDirection layerLayoutDirection;

    @NotNull
    private final LayoutNode layoutNode;

    @Nullable
    private Map<AlignmentLine, Integer> oldAlignmentLines;

    @Nullable
    private LayoutNodeWrapper wrappedBy;
    private float zIndex;

    @NotNull
    private static final Function1<LayoutNodeWrapper, Unit> onCommitAffectingLayerParams = new Function1<LayoutNodeWrapper, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNodeWrapper layoutNodeWrapper) {
            invoke2(layoutNodeWrapper);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LayoutNodeWrapper layoutNodeWrapper) {
            if (layoutNodeWrapper.isValid()) {
                layoutNodeWrapper.updateLayerParameters();
            }
        }
    };

    @NotNull
    private static final Function1<LayoutNodeWrapper, Unit> onCommitAffectingLayer = new Function1<LayoutNodeWrapper, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$Companion$onCommitAffectingLayer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNodeWrapper layoutNodeWrapper) {
            invoke2(layoutNodeWrapper);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LayoutNodeWrapper layoutNodeWrapper) {
            OwnedLayer layer = layoutNodeWrapper.getLayer();
            if (layer == null) {
                return;
            }
            layer.invalidate();
        }
    };

    @NotNull
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private long position = IntOffset.INSTANCE.m3053getZeronOccac();

    @NotNull
    private final Function0<Unit> invalidateParentLayer = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$invalidateParentLayer$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LayoutNodeWrapper wrappedBy = this.this$0.getWrappedBy();
            if (wrappedBy == null) {
                return;
            }
            wrappedBy.invalidateLayer();
        }
    };

    public LayoutNodeWrapper(@NotNull LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
    }

    private final void ancestorToLocal(LayoutNodeWrapper ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper != null) {
            layoutNodeWrapper.ancestorToLocal(ancestor, rect, clipBounds);
        }
        fromParentRect(rect, clipBounds);
    }

    /* JADX INFO: renamed from: ancestorToLocal-R5De75A, reason: not valid java name */
    private final long m2569ancestorToLocalR5De75A(LayoutNodeWrapper ancestor, long offset) {
        if (ancestor == this) {
            return offset;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        return (layoutNodeWrapper == null || Intrinsics.areEqual(ancestor, layoutNodeWrapper)) ? m2570fromParentPositionMKHz9U(offset) : m2570fromParentPositionMKHz9U(layoutNodeWrapper.m2569ancestorToLocalR5De75A(ancestor, offset));
    }

    private final void fromParentRect(MutableRect bounds, boolean clipBounds) {
        float fM3043getXimpl = IntOffset.m3043getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() - fM3043getXimpl);
        bounds.setRight(bounds.getRight() - fM3043getXimpl);
        float fM3044getYimpl = IntOffset.m3044getYimpl(getPosition());
        bounds.setTop(bounds.getTop() - fM3044getYimpl);
        bounds.setBottom(bounds.getBottom() - fM3044getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.intersect(0.0f, 0.0f, IntSize.m3085getWidthimpl(mo2480getSizeYbymL2g()), IntSize.m3084getHeightimpl(mo2480getSizeYbymL2g()));
                bounds.isEmpty();
            }
        }
    }

    private final boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    private final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver();
    }

    private final void rectInParent(MutableRect bounds, boolean clipBounds) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping && clipBounds) {
                bounds.intersect(0.0f, 0.0f, IntSize.m3085getWidthimpl(mo2480getSizeYbymL2g()), IntSize.m3084getHeightimpl(mo2480getSizeYbymL2g()));
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float fM3043getXimpl = IntOffset.m3043getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() + fM3043getXimpl);
        bounds.setRight(bounds.getRight() + fM3043getXimpl);
        float fM3044getYimpl = IntOffset.m3044getYimpl(getPosition());
        bounds.setTop(bounds.getTop() + fM3044getYimpl);
        bounds.setBottom(bounds.getBottom() + fM3044getYimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLayerParameters() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            final Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
            if (function1 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
            reusableGraphicsLayerScope.reset();
            reusableGraphicsLayerScope.setGraphicsDensity$ui_release(this.layoutNode.getDensity());
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper.updateLayerParameters.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function1.invoke(LayoutNodeWrapper.graphicsLayerScope);
                }
            });
            ownedLayer.mo2588updateLayerPropertiesdRfWZ4U(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.getTransformOrigin(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), this.layoutNode.getLayoutDirection(), this.layoutNode.getDensity());
            this.isClipping = reusableGraphicsLayerScope.getClip();
        } else {
            if (!(this.layerBlock == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        Owner owner$ui_release = this.layoutNode.getOwner();
        if (owner$ui_release == null) {
            return;
        }
        owner$ui_release.onLayoutChange(this.layoutNode);
    }

    public void attach() {
        this._isAttached = true;
        onLayerBlockUpdated(this.layerBlock);
    }

    public abstract int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine);

    public void detach() {
        this._isAttached = false;
        onLayerBlockUpdated(this.layerBlock);
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release == null) {
            return;
        }
        parent$ui_release.invalidateLayer$ui_release();
    }

    public final void draw(@NotNull Canvas canvas) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float fM3043getXimpl = IntOffset.m3043getXimpl(getPosition());
        float fM3044getYimpl = IntOffset.m3044getYimpl(getPosition());
        canvas.translate(fM3043getXimpl, fM3044getYimpl);
        performDraw(canvas);
        canvas.translate(-fM3043getXimpl, -fM3044getYimpl);
    }

    public final void drawBorder(@NotNull Canvas canvas, @NotNull Paint paint) {
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m3085getWidthimpl(getMeasuredSize()) - 0.5f, IntSize.m3084getHeightimpl(getMeasuredSize()) - 0.5f), paint);
    }

    @NotNull
    public final LayoutNodeWrapper findCommonAncestor$ui_release(@NotNull LayoutNodeWrapper other) {
        LayoutNode parent$ui_release = other.layoutNode;
        LayoutNode parent$ui_release2 = this.layoutNode;
        if (parent$ui_release == parent$ui_release2) {
            LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = parent$ui_release2.getOuterLayoutNodeWrapper$ui_release();
            LayoutNodeWrapper layoutNodeWrapper = this;
            while (layoutNodeWrapper != outerLayoutNodeWrapper$ui_release && layoutNodeWrapper != other) {
                layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
            }
            return layoutNodeWrapper == other ? other : this;
        }
        while (parent$ui_release.getDepth() > parent$ui_release2.getDepth()) {
            parent$ui_release = parent$ui_release.getParent$ui_release();
        }
        while (parent$ui_release2.getDepth() > parent$ui_release.getDepth()) {
            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
        }
        while (parent$ui_release != parent$ui_release2) {
            parent$ui_release = parent$ui_release.getParent$ui_release();
            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
            if (parent$ui_release == null || parent$ui_release2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (parent$ui_release2 == this.layoutNode) {
            return this;
        }
        return parent$ui_release == other.layoutNode ? other : parent$ui_release.getInnerLayoutNodeWrapper();
    }

    @Nullable
    public abstract ModifiedFocusNode findLastFocusWrapper();

    @Nullable
    public abstract ModifiedKeyInputNode findLastKeyInputWrapper();

    @Nullable
    public abstract ModifiedFocusNode findNextFocusWrapper();

    @Nullable
    public abstract ModifiedKeyInputNode findNextKeyInputWrapper();

    @Nullable
    public abstract NestedScrollDelegatingWrapper findNextNestedScrollWrapper();

    @Nullable
    public final ModifiedFocusNode findParentFocusNode$ui_release() {
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        ModifiedFocusNode modifiedFocusNodeFindPreviousFocusWrapper = layoutNodeWrapper == null ? null : layoutNodeWrapper.findPreviousFocusWrapper();
        if (modifiedFocusNodeFindPreviousFocusWrapper != null) {
            return modifiedFocusNodeFindPreviousFocusWrapper;
        }
        for (LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            ModifiedFocusNode modifiedFocusNodeFindLastFocusWrapper = parent$ui_release.getOuterLayoutNodeWrapper$ui_release().findLastFocusWrapper();
            if (modifiedFocusNodeFindLastFocusWrapper != null) {
                return modifiedFocusNodeFindLastFocusWrapper;
            }
        }
        return null;
    }

    @Nullable
    public final ModifiedKeyInputNode findParentKeyInputNode$ui_release() {
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        ModifiedKeyInputNode modifiedKeyInputNodeFindPreviousKeyInputWrapper = layoutNodeWrapper == null ? null : layoutNodeWrapper.findPreviousKeyInputWrapper();
        if (modifiedKeyInputNodeFindPreviousKeyInputWrapper != null) {
            return modifiedKeyInputNodeFindPreviousKeyInputWrapper;
        }
        for (LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            ModifiedKeyInputNode modifiedKeyInputNodeFindLastKeyInputWrapper = parent$ui_release.getOuterLayoutNodeWrapper$ui_release().findLastKeyInputWrapper();
            if (modifiedKeyInputNodeFindLastKeyInputWrapper != null) {
                return modifiedKeyInputNodeFindLastKeyInputWrapper;
            }
        }
        return null;
    }

    @Nullable
    public abstract ModifiedFocusNode findPreviousFocusWrapper();

    @Nullable
    public abstract ModifiedKeyInputNode findPreviousKeyInputWrapper();

    @Nullable
    public abstract NestedScrollDelegatingWrapper findPreviousNestedScrollWrapper();

    /* JADX INFO: renamed from: fromParentPosition-MK-Hz9U, reason: not valid java name */
    public long m2570fromParentPositionMKHz9U(long position) {
        long jM3055minusNvtHpc = IntOffsetKt.m3055minusNvtHpc(position, getPosition());
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null ? jM3055minusNvtHpc : ownedLayer.mo2585mapOffset8S9VItk(jM3055minusNvtHpc, true);
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(@NotNull AlignmentLine alignmentLine) {
        int iCalculateAlignmentLine;
        if (getHasMeasureResult() && (iCalculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return iCalculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m3043getXimpl(m2501getApparentToRealOffsetnOccac()) : IntOffset.m3044getYimpl(m2501getApparentToRealOffsetnOccac()));
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    @Nullable
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Nullable
    public final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutNode$ui_release, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @NotNull
    public final MeasureResult getMeasureResult() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    @NotNull
    public abstract MeasureScope getMeasureScope();

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper == null) {
            return null;
        }
        return layoutNodeWrapper.getWrappedByCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (isAttached()) {
            return this.layoutNode.getOuterLayoutNodeWrapper$ui_release().wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        Map<AlignmentLine, Integer> alignmentLines;
        MeasureResult measureResult = this._measureResult;
        Set<AlignmentLine> setKeySet = null;
        if (measureResult != null && (alignmentLines = measureResult.getAlignmentLines()) != null) {
            setKeySet = alignmentLines.keySet();
        }
        return setKeySet == null ? y.emptySet() : setKeySet;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo2480getSizeYbymL2g() {
        return getMeasuredSize();
    }

    @Nullable
    /* JADX INFO: renamed from: getWrapped$ui_release */
    public LayoutNodeWrapper getWrapped() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getWrappedBy$ui_release, reason: from getter */
    public final LayoutNodeWrapper getWrappedBy() {
        return this.wrappedBy;
    }

    @Nullable
    public LayoutCoordinates getWrappedByCoordinates() {
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper == null) {
            return null;
        }
        return layoutNodeWrapper.getWrappedByCoordinates();
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* JADX INFO: renamed from: hitTest-3MmeM6k */
    public abstract void mo2553hitTest3MmeM6k(long pointerPosition, @NotNull List<PointerInputFilter> hitPointerInputFilters);

    /* JADX INFO: renamed from: hitTestSemantics-3MmeM6k */
    public abstract void mo2554hitTestSemantics3MmeM6k(long pointerPosition, @NotNull List<SemanticsWrapper> hitSemanticsWrappers);

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper == null) {
            return;
        }
        layoutNodeWrapper.invalidateLayer();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
        invoke2(canvas);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean isAttached() {
        if (!this._isAttached || this.layoutNode.isAttached()) {
            return this._isAttached;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m2572isPointerInBoundsk4lQ0M(long pointerPosition) {
        float fM983getXimpl = Offset.m983getXimpl(pointerPosition);
        float fM984getYimpl = Offset.m984getYimpl(pointerPosition);
        return fM983getXimpl >= 0.0f && fM984getYimpl >= 0.0f && fM983getXimpl < ((float) getMeasuredWidth()) && fM984getYimpl < ((float) getMeasuredHeight());
    }

    /* JADX INFO: renamed from: isShallowPlacing, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return this.layer != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        if (!sourceCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) sourceCoordinates;
        LayoutNodeWrapper layoutNodeWrapperFindCommonAncestor$ui_release = findCommonAncestor$ui_release(layoutNodeWrapper);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m3085getWidthimpl(sourceCoordinates.mo2480getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m3084getHeightimpl(sourceCoordinates.mo2480getSizeYbymL2g()));
        while (layoutNodeWrapper != layoutNodeWrapperFindCommonAncestor$ui_release) {
            layoutNodeWrapper.rectInParent(rectCache, clipBounds);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
        }
        ancestorToLocal(layoutNodeWrapperFindCommonAncestor$ui_release, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo2481localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource) {
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) sourceCoordinates;
        LayoutNodeWrapper layoutNodeWrapperFindCommonAncestor$ui_release = findCommonAncestor$ui_release(layoutNodeWrapper);
        while (layoutNodeWrapper != layoutNodeWrapperFindCommonAncestor$ui_release) {
            relativeToSource = layoutNodeWrapper.m2574toParentPositionMKHz9U(relativeToSource);
            layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
        }
        return m2569ancestorToLocalR5De75A(layoutNodeWrapperFindCommonAncestor$ui_release, relativeToSource);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo2482localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        for (LayoutNodeWrapper layoutNodeWrapper = this; layoutNodeWrapper != null; layoutNodeWrapper = layoutNodeWrapper.wrappedBy) {
            relativeToLocal = layoutNodeWrapper.m2574toParentPositionMKHz9U(relativeToLocal);
        }
        return relativeToLocal;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo2483localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(this.layoutNode).mo2590calculatePositionInWindowMKHz9U(mo2482localToRootMKHz9U(relativeToLocal));
    }

    public final void onLayerBlockUpdated(@Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        Owner owner$ui_release;
        boolean z = (this.layerBlock == layerBlock && Intrinsics.areEqual(this.layerDensity, this.layoutNode.getDensity()) && this.layerLayoutDirection == this.layoutNode.getLayoutDirection()) ? false : true;
        this.layerBlock = layerBlock;
        this.layerDensity = this.layoutNode.getDensity();
        this.layerLayoutDirection = this.layoutNode.getLayoutDirection();
        if (!isAttached() || layerBlock == null) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                getLayoutNode().setInnerLayerWrapperIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && (owner$ui_release = getLayoutNode().getOwner()) != null) {
                    owner$ui_release.onLayoutChange(getLayoutNode());
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        if (this.layer != null) {
            if (z) {
                updateLayerParameters();
                return;
            }
            return;
        }
        OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(this.layoutNode).createLayer(this, this.invalidateParentLayer);
        ownedLayerCreateLayer.mo2587resizeozmzZPI(getMeasuredSize());
        ownedLayerCreateLayer.mo2586movegyyYBs(getPosition());
        Unit unit = Unit.INSTANCE;
        this.layer = ownedLayerCreateLayer;
        updateLayerParameters();
        this.layoutNode.setInnerLayerWrapperIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
    }

    public void onMeasureResultChanged(int width, int height) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo2587resizeozmzZPI(IntSizeKt.IntSize(width, height));
        } else {
            LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
            if (layoutNodeWrapper != null) {
                layoutNodeWrapper.invalidateLayer();
            }
        }
        Owner owner$ui_release = this.layoutNode.getOwner();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(this.layoutNode);
        }
        m2504setMeasuredSizeozmzZPI(IntSizeKt.IntSize(width, height));
    }

    public void onModifierChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            return;
        }
        ownedLayer.invalidate();
    }

    public abstract void performDraw(@NotNull Canvas canvas);

    @NotNull
    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m2573performingMeasureK40F9xA(long constraints, @NotNull Function0<? extends Placeable> block) {
        m2505setMeasurementConstraintsBRTryo0(constraints);
        Placeable placeableInvoke = block.invoke();
        OwnedLayer layer = getLayer();
        if (layer != null) {
            layer.mo2587resizeozmzZPI(getMeasuredSize());
        }
        return placeableInvoke;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2469placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        onLayerBlockUpdated(layerBlock);
        if (!IntOffset.m3042equalsimpl0(getPosition(), position)) {
            this.position = position;
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo2586movegyyYBs(position);
            } else {
                LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
                if (layoutNodeWrapper != null) {
                    layoutNodeWrapper.invalidateLayer();
                }
            }
            LayoutNodeWrapper wrapped = getWrapped();
            if (Intrinsics.areEqual(wrapped == null ? null : wrapped.layoutNode, this.layoutNode)) {
                LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.onAlignmentsChanged$ui_release();
                }
            } else {
                this.layoutNode.onAlignmentsChanged$ui_release();
            }
            Owner owner$ui_release = this.layoutNode.getOwner();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(this.layoutNode);
            }
        }
        this.zIndex = zIndex;
    }

    public void populateFocusOrder(@NotNull FocusOrder focusOrder) {
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper == null) {
            return;
        }
        layoutNodeWrapper.populateFocusOrder(focusOrder);
    }

    public void propagateFocusEvent(@NotNull FocusState focusState) {
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper == null) {
            return;
        }
        layoutNodeWrapper.propagateFocusEvent(focusState);
    }

    public final void setMeasureResult$ui_release(@NotNull MeasureResult measureResult) {
        LayoutNode parent$ui_release;
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if ((!(map == null || map.isEmpty()) || (!measureResult.getAlignmentLines().isEmpty())) && !Intrinsics.areEqual(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                LayoutNodeWrapper wrapped = getWrapped();
                if (Intrinsics.areEqual(wrapped == null ? null : wrapped.layoutNode, this.layoutNode)) {
                    LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                    if (parent$ui_release2 != null) {
                        parent$ui_release2.onAlignmentsChanged$ui_release();
                    }
                    if (this.layoutNode.getAlignmentLines().getUsedDuringParentMeasurement()) {
                        LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
                        if (parent$ui_release3 != null) {
                            parent$ui_release3.requestRemeasure$ui_release();
                        }
                    } else if (this.layoutNode.getAlignmentLines().getUsedDuringParentLayout() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
                        parent$ui_release.requestRelayout$ui_release();
                    }
                } else {
                    this.layoutNode.onAlignmentsChanged$ui_release();
                }
                this.layoutNode.getAlignmentLines().setDirty$ui_release(true);
                Map linkedHashMap = this.oldAlignmentLines;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.oldAlignmentLines = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(measureResult.getAlignmentLines());
            }
        }
    }

    public final void setShallowPlacing(boolean z) {
        this.isShallowPlacing = z;
    }

    public final void setWrappedBy$ui_release(@Nullable LayoutNodeWrapper layoutNodeWrapper) {
        this.wrappedBy = layoutNodeWrapper;
    }

    public final void setZIndex(float f) {
        this.zIndex = f;
    }

    /* JADX INFO: renamed from: toParentPosition-MK-Hz9U, reason: not valid java name */
    public long m2574toParentPositionMKHz9U(long position) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo2585mapOffset8S9VItk(position, false);
        }
        return IntOffsetKt.m3057plusNvtHpc(position, getPosition());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo2484windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        LayoutCoordinates layoutCoordinatesFindRoot = LayoutCoordinatesKt.findRoot(this);
        return mo2481localPositionOfR5De75A(layoutCoordinatesFindRoot, Offset.m987minusMKHz9U(LayoutNodeKt.requireOwner(this.layoutNode).mo2589calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRoot)));
    }

    public final void withPositionTranslation(@NotNull Canvas canvas, @NotNull Function1<? super Canvas, Unit> block) {
        float fM3043getXimpl = IntOffset.m3043getXimpl(getPosition());
        float fM3044getYimpl = IntOffset.m3044getYimpl(getPosition());
        canvas.translate(fM3043getXimpl, fM3044getYimpl);
        block.invoke(canvas);
        canvas.translate(-fM3043getXimpl, -fM3044getYimpl);
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m2575withinLayerBoundsk4lQ0M(long pointerPosition) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null || !this.isClipping) {
            return true;
        }
        return ownedLayer.mo2584isInLayerk4lQ0M(pointerPosition);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull final Canvas canvas) {
        if (!this.layoutNode.getIsPlaced()) {
            this.lastLayerDrawingWasSkipped = true;
        } else {
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayer, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    LayoutNodeWrapper.this.performDraw(canvas);
                }
            });
            this.lastLayerDrawingWasSkipped = false;
        }
    }
}
