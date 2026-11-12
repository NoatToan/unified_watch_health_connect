package androidx.compose.ui.node;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.market.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\n\b\u0002\u0010\u0081\u0001\u001a\u00030\u0080\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001a\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\b*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\f*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0097\u0001J\u001a\u0010\u0007\u001a\u00020\u0004*\u00020\fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u0003*\u00020\fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u000b\u001a\u00020\b*\u00020\fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u0003*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u001d\u0010\u000f\u001a\u00020\f*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ\u001d\u0010\u0017\u001a\u00020\u0003*\u00020\u0004H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001bJ\u001d\u0010\u000f\u001a\u00020\f*\u00020\u0004H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001cJt\u00101\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100Jt\u00101\u001a\u00020.2\u0006\u00103\u001a\u0002022\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\\\u0010:\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J\\\u0010:\u001a\u00020.2\u0006\u00103\u001a\u0002022\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<Jp\u0010G\u001a\u00020.2\u0006\u0010>\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020?2\b\b\u0002\u0010D\u001a\u00020A2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FJR\u0010G\u001a\u00020.2\u0006\u0010>\u001a\u00020=2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IJn\u0010S\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020#2\u0006\u0010K\u001a\u00020#2\b\b\u0002\u0010L\u001a\u00020\b2\b\b\u0002\u0010N\u001a\u00020M2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\b\b\u0002\u0010'\u001a\u00020\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJn\u0010S\u001a\u00020.2\u0006\u00103\u001a\u0002022\u0006\u0010J\u001a\u00020#2\u0006\u0010K\u001a\u00020#2\b\b\u0002\u0010L\u001a\u00020\b2\b\b\u0002\u0010N\u001a\u00020M2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\b\b\u0002\u0010'\u001a\u00020\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ\\\u0010X\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010WJ\\\u0010X\u001a\u00020.2\u0006\u00103\u001a\u0002022\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bY\u0010ZJP\u0010_\u001a\u00020.2\u0006\u0010\\\u001a\u00020[2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^JP\u0010_\u001a\u00020.2\u0006\u0010\\\u001a\u00020[2\u0006\u00103\u001a\u0002022\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b`\u0010aJt\u0010h\u001a\u00020.2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020#0b2\u0006\u0010e\u001a\u00020d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010L\u001a\u00020\b2\b\b\u0002\u0010N\u001a\u00020M2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\b\b\u0002\u0010'\u001a\u00020\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010gJt\u0010h\u001a\u00020.2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020#0b2\u0006\u0010e\u001a\u00020d2\u0006\u00103\u001a\u0002022\b\b\u0002\u0010L\u001a\u00020\b2\b\b\u0002\u0010N\u001a\u00020M2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\b\b\u0002\u0010'\u001a\u00020\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bi\u0010jJ\\\u0010l\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010WJ\\\u0010l\u001a\u00020.2\u0006\u00103\u001a\u0002022\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010ZJf\u0010r\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010o\u001a\u00020n2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bp\u0010qJf\u0010r\u001a\u00020.2\u0006\u00103\u001a\u0002022\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010o\u001a\u00020n2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010'\u001a\u00020\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bs\u0010tJ\b\u0010u\u001a\u00020.H\u0016JJ\u0010\u007f\u001a\u00020.2\u0006\u0010w\u001a\u00020v2\u0006\u0010&\u001a\u00020%2\u0006\u0010y\u001a\u00020x2\u0017\u0010|\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020.0z¢\u0006\u0002\b{H\u0080\bø\u0001\u0000ø\u0001\u0003ø\u0001\u0001¢\u0006\u0004\b}\u0010~R\u001a\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\b8\u0016@\u0017X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\b8\u0016@\u0017X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001R!\u00107\u001a\u00020#8V@\u0016X\u0096\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0016@\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0016@\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010&\u001a\u00020%8V@\u0016X\u0096\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u008b\u0001\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006\u0097\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "", "toPx-0680j_4", "(F)F", "toPx", "Landroidx/compose/ui/unit/TextUnit;", "toSp-0xMU5do", "(F)J", "toSp", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "toPx--R2X_6o", "toDp-u2uoSUM", "toSp-kPz2Gy4", "(I)F", "(I)J", "Landroidx/compose/ui/graphics/Brush;", "brush", "startAngle", "sweepAngle", "", "useCenter", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "Landroidx/compose/ui/graphics/Color;", "color", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "radius", b.m0, "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "start", "end", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect-AsUm42w", "drawRect", "drawRect-n-J9OG0", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawContent", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "LayoutNodeWrapper", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "draw-x_KDEd0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/LayoutNodeWrapper;Lkotlin/jvm/functions/Function1;)V", "draw", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getDensity", "()F", Constants.JSON_DENSITY, "getFontScale", "fontScale", "getCenter-F1C5BW0", "()J", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getSize-NH-jbRc", "<init>", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {

    @NotNull
    private final CanvasDrawScope canvasDrawScope;

    @Nullable
    private LayoutNodeWrapper wrapped;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LayoutNodeDrawScope(@NotNull CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    /* JADX INFO: renamed from: draw-x_KDEd0$ui_release, reason: not valid java name */
    public final void m2566drawx_KDEd0$ui_release(@NotNull Canvas canvas, long size, @NotNull LayoutNodeWrapper LayoutNodeWrapper, @NotNull Function1<? super DrawScope, Unit> block) {
        LayoutNodeWrapper layoutNodeWrapper = this.wrapped;
        this.wrapped = LayoutNodeWrapper;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        MeasureScope measureScope = LayoutNodeWrapper.getMeasureScope();
        LayoutDirection layoutDirection = LayoutNodeWrapper.getMeasureScope().getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.getDensity();
        LayoutDirection layoutDirectionComponent2 = drawParams.getLayoutDirection();
        Canvas canvasComponent3 = drawParams.getCanvas();
        long jM1587component4NHjbRc = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(measureScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m1590setSizeuvyYCjk(size);
        canvas.save();
        block.invoke(canvasDrawScope);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m1590setSizeuvyYCjk(jM1587component4NHjbRc);
        this.wrapped = layoutNodeWrapper;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I */
    public void mo1566drawArcillE91I(@NotNull Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1566drawArcillE91I(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    public void mo1567drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1567drawArcyD3GUKo(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    public void mo1568drawCircleV9BoPsw(@NotNull Brush brush, float radius, long center, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1568drawCircleV9BoPsw(brush, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    public void mo1569drawCircleVaOC9Bg(long color, float radius, long center, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1569drawCircleVaOC9Bg(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        LayoutNodeWrapper layoutNodeWrapper = this.wrapped;
        if (layoutNodeWrapper == null) {
            return;
        }
        layoutNodeWrapper.draw(canvas);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    public void mo1570drawImage9jGpkUE(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1570drawImage9jGpkUE(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    public void mo1571drawImagegbVJVH8(@NotNull ImageBitmap image, long topLeft, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1571drawImagegbVJVH8(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    public void mo1572drawLine1RTmtNc(@NotNull Brush brush, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1572drawLine1RTmtNc(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    public void mo1573drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1573drawLineNGM6Ib0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w */
    public void mo1574drawOvalAsUm42w(@NotNull Brush brush, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1574drawOvalAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    public void mo1575drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1575drawOvalnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    public void mo1576drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1576drawPathGBMwjPU(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI */
    public void mo1577drawPathLG529CI(@NotNull Path path, long color, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1577drawPathLG529CI(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    public void mo1578drawPointsF8ZwMP8(@NotNull List<Offset> points, int pointMode, long color, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1578drawPointsF8ZwMP8(points, pointMode, color, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    public void mo1579drawPointsGsft0Ws(@NotNull List<Offset> points, int pointMode, @NotNull Brush brush, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1579drawPointsGsft0Ws(points, pointMode, brush, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w */
    public void mo1580drawRectAsUm42w(@NotNull Brush brush, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1580drawRectAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    public void mo1581drawRectnJ9OG0(long color, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1581drawRectnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    public void mo1582drawRoundRectZuiqVtQ(@NotNull Brush brush, long topLeft, long size, long cornerRadius, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1582drawRoundRectZuiqVtQ(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    public void mo1583drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, @NotNull DrawStyle style, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo1583drawRoundRectuAw5IA(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    public long mo1584getCenterF1C5BW0() {
        return this.canvasDrawScope.mo1584getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public long mo1585getSizeNHjbRc() {
        return this.canvasDrawScope.mo1585getSizeNHjbRc();
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo187roundToPxR2X_6o(long j) {
        return this.canvasDrawScope.mo187roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo188roundToPx0680j_4(float f) {
        return this.canvasDrawScope.mo188roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo189toDpGaN1DYA(long j) {
        return this.canvasDrawScope.mo189toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo190toDpu2uoSUM(float f) {
        return this.canvasDrawScope.mo190toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo191toDpu2uoSUM(int i) {
        return this.canvasDrawScope.mo191toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo192toPxR2X_6o(long j) {
        return this.canvasDrawScope.mo192toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo193toPx0680j_4(float f) {
        return this.canvasDrawScope.mo193toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo194toSp0xMU5do(float f) {
        return this.canvasDrawScope.mo194toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo195toSpkPz2Gy4(float f) {
        return this.canvasDrawScope.mo195toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo196toSpkPz2Gy4(int i) {
        return this.canvasDrawScope.mo196toSpkPz2Gy4(i);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
