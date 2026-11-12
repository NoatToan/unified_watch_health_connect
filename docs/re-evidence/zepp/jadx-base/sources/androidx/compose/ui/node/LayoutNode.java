package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.market.sdk.Constants;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u0000 ª\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\bª\u0002«\u0002¬\u0002\u00ad\u0002B\n\b\u0010¢\u0006\u0005\b©\u0002\u00102B\u0014\b\u0010\u0012\u0007\u0010\u008b\u0001\u001a\u00020\u0012¢\u0006\u0006\b©\u0002\u0010á\u0001J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0012\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0000H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\u001e\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u0006H\u0002J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020!H\u0002J\u001d\u0010%\u001a\u00020\u00062\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060#H\u0082\bJ\u001d\u0010&\u001a\u00020\u00062\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060#H\u0082\bJ\b\u0010'\u001a\u00020\u0012H\u0002J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0000H\u0000¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00103\u001a\u00020\u0006H\u0000¢\u0006\u0004\b1\u00102J'\u00108\u001a\u00020\u00062\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0000¢\u0006\u0004\b6\u00107J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010?\u001a\u00020\u0006H\u0000¢\u0006\u0004\b>\u00102J\b\u0010@\u001a\u00020\fH\u0016J\u000f\u0010B\u001a\u00020\u0006H\u0000¢\u0006\u0004\bA\u00102J\u001f\u0010F\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\n2\u0006\u0010D\u001a\u00020\nH\u0000¢\u0006\u0004\bE\u0010/J\u000f\u0010H\u001a\u00020\u0006H\u0000¢\u0006\u0004\bG\u00102J\u0017\u0010M\u001a\u00020\u00062\u0006\u0010J\u001a\u00020IH\u0000¢\u0006\u0004\bK\u0010LJ+\u0010U\u001a\u00020\u00062\u0006\u0010O\u001a\u00020N2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0PH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ+\u0010Y\u001a\u00020\u00062\u0006\u0010O\u001a\u00020N2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0PH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u0010TJ\u000f\u0010[\u001a\u00020\u0006H\u0000¢\u0006\u0004\bZ\u00102J\u000f\u0010]\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\\\u00102J\u000f\u0010_\u001a\u00020\u0006H\u0000¢\u0006\u0004\b^\u00102J\u001b\u0010d\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\n0`H\u0000¢\u0006\u0004\bb\u0010cJ\u0017\u0010i\u001a\u00020\u00062\u0006\u0010f\u001a\u00020eH\u0000¢\u0006\u0004\bg\u0010hJ\u000f\u0010k\u001a\u00020\u0006H\u0000¢\u0006\u0004\bj\u00102J!\u0010o\u001a\u00020\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060lH\u0080\bø\u0001\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010q\u001a\u00020\u0006H\u0000¢\u0006\u0004\bp\u00102J\u001d\u0010s\u001a\u00020\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060lH\u0000¢\u0006\u0004\br\u0010nJ\u000f\u0010u\u001a\u00020\u0006H\u0000¢\u0006\u0004\bt\u00102J\u000e\u0010x\u001a\b\u0012\u0004\u0012\u00020w0vH\u0016J\u000f\u0010z\u001a\u00020\u0006H\u0000¢\u0006\u0004\by\u00102J\u001e\u0010\u0080\u0001\u001a\u00020}2\u0006\u0010|\u001a\u00020{H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007fJ$\u0010\u0083\u0001\u001a\u00020\u00122\n\b\u0002\u0010|\u001a\u0004\u0018\u00010{H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0012\u0010\u0085\u0001\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020\nH\u0016J\u0012\u0010\u0086\u0001\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020\nH\u0016J\u0012\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010\u0087\u0001\u001a\u00020\nH\u0016J\u0012\u0010\u0089\u0001\u001a\u00020\n2\u0007\u0010\u0087\u0001\u001a\u00020\nH\u0016J\t\u0010\u008a\u0001\u001a\u00020\u0006H\u0016R\u0019\u0010\u008b\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001f\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R!\u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0090\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008c\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R,\u0010:\u001a\u0004\u0018\u0001092\t\u0010\u0095\u0001\u001a\u0004\u0018\u0001098\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b:\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R'\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u000b\u0010\u008e\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R#\u0010¤\u0001\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u0090\u0001R\u0017\u0010o\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bo\u0010\u008c\u0001R\u001f\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u0090\u0001R\u0019\u0010¦\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u008c\u0001R4\u0010©\u0001\u001a\u00030§\u00012\b\u0010¨\u0001\u001a\u00030§\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R\"\u0010°\u0001\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R4\u0010µ\u0001\u001a\u00030´\u00012\b\u0010¨\u0001\u001a\u00030´\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R\"\u0010¼\u0001\u001a\u00030»\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R4\u0010Á\u0001\u001a\u00030À\u00012\b\u0010¨\u0001\u001a\u00030À\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R\"\u0010È\u0001\u001a\u00030Ç\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\"\u0010Í\u0001\u001a\u00030Ì\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R*\u0010Ñ\u0001\u001a\u00020\u00122\u0007\u0010\u0095\u0001\u001a\u00020\u00128\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\bÑ\u0001\u0010\u008c\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R*\u0010Ó\u0001\u001a\u00020\n2\u0007\u0010\u0095\u0001\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÓ\u0001\u0010\u008e\u0001\u001a\u0006\bÔ\u0001\u0010\u009a\u0001R\u0019\u0010Õ\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010\u008e\u0001R\u0019\u0010Ö\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010\u008e\u0001R*\u0010Ø\u0001\u001a\u00030×\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R0\u0010Þ\u0001\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÞ\u0001\u0010\u008c\u0001\u0012\u0005\bâ\u0001\u00102\u001a\u0006\bß\u0001\u0010Ò\u0001\"\u0006\bà\u0001\u0010á\u0001R!\u0010ã\u0001\u001a\u00020\u001c8\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001R\u001a\u0010è\u0001\u001a\u00030ç\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001a\u0010ë\u0001\u001a\u00030ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001b\u0010í\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010ä\u0001R)\u0010î\u0001\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bî\u0001\u0010\u008c\u0001\u001a\u0006\bï\u0001\u0010Ò\u0001\"\u0006\bð\u0001\u0010á\u0001R0\u0010\u001b\u001a\u00020!2\u0007\u0010¨\u0001\u001a\u00020!8\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u001b\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R7\u0010ö\u0001\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0006\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R7\u0010ü\u0001\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0006\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bü\u0001\u0010÷\u0001\u001a\u0006\bý\u0001\u0010ù\u0001\"\u0006\bþ\u0001\u0010û\u0001R!\u0010ÿ\u0001\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0090\u0001R)\u0010\u0080\u0002\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0080\u0002\u0010\u008c\u0001\u001a\u0006\b\u0081\u0002\u0010Ò\u0001\"\u0006\b\u0082\u0002\u0010á\u0001R \u0010\u0084\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u0083\u00028\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u001f\u0010\u0088\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000v8@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001f\u0010\u008b\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R\u001f\u0010\u008d\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000v8@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u0087\u0002R\u001b\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u00008@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0019\u0010\u0091\u0002\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010Ò\u0001R\u0019\u0010\u0093\u0002\u001a\u00020\u00128@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010Ò\u0001R&\u0010\u0096\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8@@\u0001X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u0095\u0002\u00102\u001a\u0006\b\u0094\u0002\u0010\u008a\u0002R\u0019\u0010\u0097\u0002\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010Ò\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u009a\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u009a\u0001R\u0019\u0010\u009b\u0002\u001a\u00020\u001c8@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010æ\u0001R\u001b\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u001c8@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010æ\u0001R\u001a\u0010¡\u0002\u001a\u00030\u009e\u00028V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010 \u0002R\u001c\u0010¥\u0002\u001a\u0005\u0018\u00010¢\u00028V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0002\u0010¤\u0002R\u001b\u0010¨\u0002\u001a\u0004\u0018\u00010\u00048V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0002\u0010§\u0002\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006®\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "", "recreateUnfoldedChildrenIfDirty", "invalidateUnfoldedVirtualChildren", "onZSortedChildrenInvalidated", "", "depth", "", "debugTreeToString", "onDensityOrLayoutDirectionChanged", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/OnGloballyPositionedModifierWrapper;", "getOrCreateOnPositionedCallbacks", "", "hasNewPositioningCallback", "markNodeAndSubtreeAsPlaced", "it", "rescheduleRemeasureOrRelayout", "markSubtreeAsNotPlaced", "onBeforeLayoutChildren", "alignmentLinesQueriedByModifier", "Landroidx/compose/ui/Modifier$Element;", "modifier", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapper", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "reuseLayoutNodeWrapper", "copyWrappersToCache", "Landroidx/compose/ui/Modifier;", "markReusedModifiers", "Lkotlin/Function1;", TransportUri.ACTION_BLOCK, "forEachDelegate", "forEachDelegateIncludingInner", "shouldInvalidateParentLayer", "index", DefaultSettingsSpiCall.n, "insertAt$ui_release", "(ILandroidx/compose/ui/node/LayoutNode;)V", "insertAt", "count", "removeAt$ui_release", "(II)V", "removeAt", "removeAll$ui_release", "()V", "removeAll", "from", "to", "move$ui_release", "(III)V", "move", "Landroidx/compose/ui/node/Owner;", DataCacher.o, "attach$ui_release", "(Landroidx/compose/ui/node/Owner;)V", "attach", "detach$ui_release", "detach", "toString", "invalidateLayer$ui_release", "invalidateLayer", "x", "y", "place$ui_release", "place", "replace$ui_release", "replace", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw$ui_release", "(Landroidx/compose/ui/graphics/Canvas;)V", "draw", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitPointerInputFilters", "hitTest-3MmeM6k$ui_release", "(JLjava/util/List;)V", "hitTest", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitSemanticsWrappers", "hitTestSemantics-3MmeM6k$ui_release", "hitTestSemantics", "onNodePlaced$ui_release", "onNodePlaced", "layoutChildren$ui_release", "layoutChildren", "onAlignmentsChanged$ui_release", "onAlignmentsChanged", "", "Landroidx/compose/ui/layout/AlignmentLine;", "calculateAlignmentLines$ui_release", "()Ljava/util/Map;", "calculateAlignmentLines", "Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "handleMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "handleMeasureResult", "requestRemeasure$ui_release", "requestRemeasure", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "ignoreRemeasureRequests", "requestRelayout$ui_release", "requestRelayout", "withNoSnapshotReadObservation$ui_release", "withNoSnapshotReadObservation", "dispatchOnPositionedCallbacks$ui_release", "dispatchOnPositionedCallbacks", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "invalidateLayers$ui_release", "invalidateLayers", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "remeasure-_Sx5XlM$ui_release", "(Landroidx/compose/ui/unit/Constraints;)Z", "remeasure", "height", "minIntrinsicWidth", "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "minIntrinsicHeight", "maxIntrinsicHeight", "forceRemeasure", "isVirtual", "Z", "virtualChildrenCount", LogUtil.I, "_foldedChildren", "Landroidx/compose/runtime/collection/MutableVector;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "_foldedParent", "Landroidx/compose/ui/node/LayoutNode;", "<set-?>", "Landroidx/compose/ui/node/Owner;", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "getDepth$ui_release", "()I", "setDepth$ui_release", "(I)V", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "setLayoutState$ui_release", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "wrapperCache", "_zSortedChildren", "zSortedChildrenInvalidated", "Landroidx/compose/ui/layout/MeasurePolicy;", "value", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope$ui_release", "()Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "alignmentLines", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "getAlignmentLines$ui_release", "()Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "mDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "isPlaced", "()Z", "placeOrder", "getPlaceOrder$ui_release", "previousPlaceOrder", "nextChildPlaceOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "canMultiMeasure", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "(Z)V", "getCanMultiMeasure$ui_release$annotations", "innerLayoutNodeWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getInnerLayoutNodeWrapper$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "outerMeasurablePlaceable", "Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "", "zIndex", "F", "_innerLayerWrapper", "innerLayerWrapperIsDirty", "getInnerLayerWrapperIsDirty$ui_release", "setInnerLayerWrapperIsDirty$ui_release", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "onAttach", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "onPositionedCallbacks", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "getFoldedChildren$ui_release", "()Ljava/util/List;", "foldedChildren", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_children", "getChildren$ui_release", "children", "getParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "parent", "isAttached", "getWasMeasuredDuringThisIteration$ui_release", "wasMeasuredDuringThisIteration", "getZSortedChildren", "getZSortedChildren$annotations", "zSortedChildren", "isValid", "getWidth", "getHeight", "getOuterLayoutNodeWrapper$ui_release", "outerLayoutNodeWrapper", "getInnerLayerWrapper$ui_release", "innerLayerWrapper", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "parentInfo", "<init>", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class LayoutNode implements Measurable, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;

    @NotNull
    private final Comparator<LayoutNode> ZComparator;

    @NotNull
    private final MutableVector<LayoutNode> _foldedChildren;

    @Nullable
    private LayoutNode _foldedParent;

    @Nullable
    private LayoutNodeWrapper _innerLayerWrapper;

    @Nullable
    private MutableVector<LayoutNode> _unfoldedChildren;

    @NotNull
    private final MutableVector<LayoutNode> _zSortedChildren;

    @NotNull
    private final LayoutNodeAlignmentLines alignmentLines;
    private boolean canMultiMeasure;

    @NotNull
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerWrapperIsDirty;

    @NotNull
    private final LayoutNodeWrapper innerLayoutNodeWrapper;

    @NotNull
    private final IntrinsicsPolicy intrinsicsPolicy;
    private boolean isPlaced;
    private final boolean isVirtual;

    @NotNull
    private LayoutDirection layoutDirection;

    @NotNull
    private LayoutState layoutState;

    @NotNull
    private final LayoutNodeDrawScope mDrawScope;

    @NotNull
    private MeasurePolicy measurePolicy;

    @NotNull
    private final MeasureScope measureScope;

    @NotNull
    private UsageByParent measuredByParent;

    @NotNull
    private Modifier modifier;
    private boolean needsOnPositionedDispatch;
    private int nextChildPlaceOrder;

    @Nullable
    private Function1<? super Owner, Unit> onAttach;

    @Nullable
    private Function1<? super Owner, Unit> onDetach;

    @Nullable
    private MutableVector<OnGloballyPositionedModifierWrapper> onPositionedCallbacks;

    @NotNull
    private final OuterMeasurablePlaceable outerMeasurablePlaceable;

    @Nullable
    private Owner owner;
    private int placeOrder;
    private int previousPlaceOrder;
    private boolean unfoldedVirtualChildrenListDirty;
    private int virtualChildrenCount;

    @NotNull
    private MutableVector<DelegatingLayoutNodeWrapper<?>> wrapperCache;
    private float zIndex;
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List list, long j) {
            m2561measure3p2s80s(measureScope, (List<? extends Measurable>) list, j);
            throw new KotlinNothingValueException();
        }

        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m2561measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };

    @NotNull
    private static final Function0<LayoutNode> Constructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LayoutNode invoke() {
            return new LayoutNode();
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "Constructor", "Lkotlin/jvm/functions/Function0;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "", "NotPlacedPlaceOrder", LogUtil.I, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "<init>", "(Ljava/lang/String;I)V", "NeedsRemeasure", "Measuring", "NeedsRelayout", "LayingOut", "Ready", "ui_release"}, k = 1, mv = {1, 5, 1})
    public enum LayoutState {
        NeedsRemeasure,
        Measuring,
        NeedsRelayout,
        LayingOut,
        Ready
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000b\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\"\u0010\f\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\r\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "", "minIntrinsicWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "error", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {

        @NotNull
        private final String error;

        public NoIntrinsicsMeasurePolicy(@NotNull String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2562maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2563maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2564minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2565minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @NotNull
        /* JADX INFO: renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m2562maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m2563maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m2564minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m2565minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "<init>", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 5, 1})
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[LayoutState.NeedsRemeasure.ordinal()] = 1;
            iArr[LayoutState.NeedsRelayout.ordinal()] = 2;
            iArr[LayoutState.Ready.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false);
    }

    private final void alignmentLinesQueriedByModifier() {
        if (this.layoutState != LayoutState.Measuring) {
            this.alignmentLines.setUsedByModifierLayout$ui_release(true);
            return;
        }
        this.alignmentLines.setUsedByModifierMeasurement$ui_release(true);
        if (this.alignmentLines.getDirty()) {
            this.layoutState = LayoutState.NeedsRelayout;
        }
    }

    private final void copyWrappersToCache() {
        LayoutNodeWrapper innerLayoutNodeWrapper = getInnerLayoutNodeWrapper();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper); outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            this.wrapperCache.add((DelegatingLayoutNodeWrapper) outerLayoutNodeWrapper$ui_release);
        }
    }

    private final String debugTreeToString(int depth) {
        StringBuilder sb = new StringBuilder();
        if (depth > 0) {
            int i = 0;
            do {
                i++;
                sb.append("  ");
            } while (i < depth);
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                sb.append(content[i2].debugTreeToString(depth + 1));
                i2++;
            } while (i2 < size);
        }
        String string = sb.toString();
        return depth == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.debugTreeToString(i);
    }

    private final void forEachDelegate(Function1<? super LayoutNodeWrapper, Unit> block) {
        LayoutNodeWrapper innerLayoutNodeWrapper = getInnerLayoutNodeWrapper();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper); outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            block.invoke(outerLayoutNodeWrapper$ui_release);
        }
    }

    private final void forEachDelegateIncludingInner(Function1<? super LayoutNodeWrapper, Unit> block) {
        LayoutNodeWrapper wrapped = getInnerLayoutNodeWrapper().getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            block.invoke(outerLayoutNodeWrapper$ui_release);
        }
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableVector<OnGloballyPositionedModifierWrapper> getOrCreateOnPositionedCallbacks() {
        MutableVector<OnGloballyPositionedModifierWrapper> mutableVector = this.onPositionedCallbacks;
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector<OnGloballyPositionedModifierWrapper> mutableVector2 = new MutableVector<>(new OnGloballyPositionedModifierWrapper[16], 0);
        this.onPositionedCallbacks = mutableVector2;
        return mutableVector2;
    }

    @PublishedApi
    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    private final boolean hasNewPositioningCallback() {
        final MutableVector<OnGloballyPositionedModifierWrapper> mutableVector = this.onPositionedCallbacks;
        return ((Boolean) getModifier().foldOut(Boolean.FALSE, new Function2<Modifier.Element, Boolean, Boolean>() { // from class: androidx.compose.ui.node.LayoutNode.hasNewPositioningCallback.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Modifier.Element element, Boolean bool) {
                return invoke(element, bool.booleanValue());
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0031  */
            @NotNull
            public final Boolean invoke(@NotNull Modifier.Element element, boolean z) {
                boolean z2 = false;
                if (z) {
                    z2 = true;
                } else if (element instanceof OnGloballyPositionedModifier) {
                    MutableVector<OnGloballyPositionedModifierWrapper> mutableVector2 = mutableVector;
                    OnGloballyPositionedModifierWrapper onGloballyPositionedModifierWrapper = null;
                    if (mutableVector2 != null) {
                        int size = mutableVector2.getSize();
                        if (size > 0) {
                            OnGloballyPositionedModifierWrapper[] content = mutableVector2.getContent();
                            int i = 0;
                            do {
                                OnGloballyPositionedModifierWrapper onGloballyPositionedModifierWrapper2 = content[i];
                                if (Intrinsics.areEqual(element, onGloballyPositionedModifierWrapper2.getModifier())) {
                                    onGloballyPositionedModifierWrapper = onGloballyPositionedModifierWrapper2;
                                    break;
                                }
                                i++;
                            } while (i < size);
                        }
                        onGloballyPositionedModifierWrapper = onGloballyPositionedModifierWrapper;
                    }
                    if (onGloballyPositionedModifierWrapper == null) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }
        })).booleanValue();
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode parent$ui_release;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (parent$ui_release = getParent$ui_release()) == null) {
            return;
        }
        parent$ui_release.unfoldedVirtualChildrenListDirty = true;
    }

    private final void markNodeAndSubtreeAsPlaced() {
        this.isPlaced = true;
        LayoutNodeWrapper wrapped = getInnerLayoutNodeWrapper().getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            if (outerLayoutNodeWrapper$ui_release.getLastLayerDrawingWasSkipped()) {
                outerLayoutNodeWrapper$ui_release.invalidateLayer();
            }
        }
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            int i = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i];
                if (layoutNode.getPlaceOrder() != Integer.MAX_VALUE) {
                    layoutNode.markNodeAndSubtreeAsPlaced();
                    rescheduleRemeasureOrRelayout(layoutNode);
                }
                i++;
            } while (i < size);
        }
    }

    private final void markReusedModifiers(Modifier modifier) {
        MutableVector<DelegatingLayoutNodeWrapper<?>> mutableVector = this.wrapperCache;
        int size = mutableVector.getSize();
        if (size > 0) {
            DelegatingLayoutNodeWrapper<?>[] content = mutableVector.getContent();
            int i = 0;
            do {
                content[i].setToBeReusedForSameModifier(false);
                i++;
            } while (i < size);
        }
        modifier.foldIn(Unit.INSTANCE, new Function2<Unit, Modifier.Element, Unit>() { // from class: androidx.compose.ui.node.LayoutNode.markReusedModifiers.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit, Modifier.Element element) {
                invoke2(unit, element);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Unit unit, @NotNull Modifier.Element element) {
                Object obj;
                MutableVector mutableVector2 = LayoutNode.this.wrapperCache;
                int size2 = mutableVector2.getSize();
                if (size2 <= 0) {
                    obj = null;
                    break;
                }
                int i2 = size2 - 1;
                Object[] content2 = mutableVector2.getContent();
                while (true) {
                    obj = content2[i2];
                    DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper = (DelegatingLayoutNodeWrapper) obj;
                    if (delegatingLayoutNodeWrapper.getModifier() == element && !delegatingLayoutNodeWrapper.getToBeReusedForSameModifier()) {
                        break;
                    }
                    i2--;
                    if (i2 < 0) {
                        obj = null;
                        break;
                    }
                }
                DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper2 = (DelegatingLayoutNodeWrapper) obj;
                while (delegatingLayoutNodeWrapper2 != null) {
                    delegatingLayoutNodeWrapper2.setToBeReusedForSameModifier(true);
                    if (delegatingLayoutNodeWrapper2.getIsChained()) {
                        LayoutNodeWrapper wrappedBy = delegatingLayoutNodeWrapper2.getWrappedBy();
                        if (wrappedBy instanceof DelegatingLayoutNodeWrapper) {
                            delegatingLayoutNodeWrapper2 = (DelegatingLayoutNodeWrapper) wrappedBy;
                        }
                    }
                    delegatingLayoutNodeWrapper2 = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markSubtreeAsNotPlaced() {
        if (getIsPlaced()) {
            int i = 0;
            this.isPlaced = false;
            MutableVector<LayoutNode> mutableVector = get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    content[i].markSubtreeAsNotPlaced();
                    i++;
                } while (i < size);
            }
        }
    }

    private final void onBeforeLayoutChildren() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            int i = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i];
                if (layoutNode.getLayoutState() == LayoutState.NeedsRemeasure && layoutNode.getMeasuredByParent() == UsageByParent.InMeasureBlock && m2557remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null)) {
                    requestRemeasure$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    private final void onDensityOrLayoutDirectionChanged() {
        requestRemeasure$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onZSortedChildrenInvalidated() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null) {
            return;
        }
        parent$ui_release.onZSortedChildrenInvalidated();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                MutableVector<LayoutNode> mutableVector2 = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector2;
                mutableVector = mutableVector2;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> mutableVector3 = this._foldedChildren;
            int size = mutableVector3.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector3.getContent();
                do {
                    LayoutNode layoutNode = content[i];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
        }
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m2557remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.outerMeasurablePlaceable.m2582getLastConstraintsDWUhwKw();
        }
        return layoutNode.m2560remeasure_Sx5XlM$ui_release(constraints);
    }

    private final void rescheduleRemeasureOrRelayout(LayoutNode it2) {
        int i = WhenMappings.$EnumSwitchMapping$0[it2.layoutState.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new IllegalStateException(Intrinsics.stringPlus("Unexpected state ", it2.layoutState));
            }
            return;
        }
        it2.layoutState = LayoutState.Ready;
        if (i == 1) {
            it2.requestRemeasure$ui_release();
        } else {
            it2.requestRelayout$ui_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DelegatingLayoutNodeWrapper<?> reuseLayoutNodeWrapper(Modifier.Element modifier, LayoutNodeWrapper wrapper) {
        int i;
        if (this.wrapperCache.isEmpty()) {
            return null;
        }
        MutableVector<DelegatingLayoutNodeWrapper<?>> mutableVector = this.wrapperCache;
        int size = mutableVector.getSize();
        int i2 = -1;
        if (size <= 0) {
            i = -1;
            break;
        }
        i = size - 1;
        DelegatingLayoutNodeWrapper<?>[] content = mutableVector.getContent();
        while (true) {
            DelegatingLayoutNodeWrapper<?> delegatingLayoutNodeWrapper = content[i];
            if (delegatingLayoutNodeWrapper.getToBeReusedForSameModifier() && delegatingLayoutNodeWrapper.getModifier() == modifier) {
                break;
            }
            i--;
            if (i < 0) {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            MutableVector<DelegatingLayoutNodeWrapper<?>> mutableVector2 = this.wrapperCache;
            int size2 = mutableVector2.getSize();
            if (size2 > 0) {
                int i3 = size2 - 1;
                DelegatingLayoutNodeWrapper<?>[] content2 = mutableVector2.getContent();
                do {
                    DelegatingLayoutNodeWrapper<?> delegatingLayoutNodeWrapper2 = content2[i3];
                    if (!delegatingLayoutNodeWrapper2.getToBeReusedForSameModifier() && Intrinsics.areEqual(JvmActuals_jvmKt.nativeClass(delegatingLayoutNodeWrapper2.getModifier()), JvmActuals_jvmKt.nativeClass(modifier))) {
                        i2 = i3;
                        break;
                    }
                    i3--;
                } while (i3 >= 0);
            }
            i = i2;
        }
        if (i < 0) {
            return null;
        }
        DelegatingLayoutNodeWrapper<?> delegatingLayoutNodeWrapper3 = this.wrapperCache.getContent()[i];
        delegatingLayoutNodeWrapper3.setModifierTo(modifier);
        DelegatingLayoutNodeWrapper<?> delegatingLayoutNodeWrapper4 = delegatingLayoutNodeWrapper3;
        int i4 = i;
        while (delegatingLayoutNodeWrapper4.getIsChained()) {
            i4--;
            delegatingLayoutNodeWrapper4 = this.wrapperCache.getContent()[i4];
            delegatingLayoutNodeWrapper4.setModifierTo(modifier);
        }
        this.wrapperCache.removeRange(i4, i + 1);
        delegatingLayoutNodeWrapper3.setWrapped(wrapper);
        wrapper.setWrappedBy$ui_release(delegatingLayoutNodeWrapper3);
        return delegatingLayoutNodeWrapper4;
    }

    private final boolean shouldInvalidateParentLayer() {
        LayoutNodeWrapper wrapped = getInnerLayoutNodeWrapper().getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            if (outerLayoutNodeWrapper$ui_release.getLayer() != null) {
                return false;
            }
            if (outerLayoutNodeWrapper$ui_release instanceof ModifiedDrawNode) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    public final void attach$ui_release(@NotNull Owner owner) {
        boolean z;
        int i = 0;
        if (!(this.owner == null)) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + debugTreeToString$default(this, 0, 1, null)).toString());
        }
        LayoutNode layoutNode = this._foldedParent;
        if (layoutNode == null) {
            z = true;
        } else if (Intrinsics.areEqual(layoutNode == null ? null : layoutNode.owner, owner)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attaching to a different owner(");
            sb.append(owner);
            sb.append(") than the parent's owner(");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb.append(parent$ui_release == null ? null : parent$ui_release.getOwner());
            sb.append("). This tree: ");
            sb.append(debugTreeToString$default(this, 0, 1, null));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode2 = this._foldedParent;
            sb.append((Object) (layoutNode2 != null ? debugTreeToString$default(layoutNode2, 0, 1, null) : null));
            throw new IllegalStateException(sb.toString().toString());
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 == null) {
            this.isPlaced = true;
        }
        this.owner = owner;
        this.depth = (parent$ui_release2 == null ? -1 : parent$ui_release2.depth) + 1;
        if (SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner.onSemanticsChange();
        }
        owner.onAttach(this);
        MutableVector<LayoutNode> mutableVector = this._foldedChildren;
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                content[i].attach$ui_release(owner);
                i++;
            } while (i < size);
        }
        requestRemeasure$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.requestRemeasure$ui_release();
        }
        this.innerLayoutNodeWrapper.attach();
        LayoutNodeWrapper innerLayoutNodeWrapper = getInnerLayoutNodeWrapper();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper); outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            outerLayoutNodeWrapper$ui_release.attach();
        }
        Function1<? super Owner, Unit> function1 = this.onAttach;
        if (function1 == null) {
            return;
        }
        function1.invoke(owner);
    }

    @NotNull
    public final Map<AlignmentLine, Integer> calculateAlignmentLines$ui_release() {
        if (!this.outerMeasurablePlaceable.getDuringAlignmentLinesQuery()) {
            alignmentLinesQueriedByModifier();
        }
        layoutChildren$ui_release();
        return this.alignmentLines.getLastCalculation();
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            LayoutNode parent$ui_release = getParent$ui_release();
            throw new IllegalStateException(Intrinsics.stringPlus("Cannot detach node that is already detached!  Tree: ", parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null).toString());
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.requestRemeasure$ui_release();
        }
        this.alignmentLines.reset$ui_release();
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        LayoutNodeWrapper innerLayoutNodeWrapper = getInnerLayoutNodeWrapper();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper); outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            outerLayoutNodeWrapper$ui_release.detach();
        }
        this.innerLayoutNodeWrapper.detach();
        if (SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner.onSemanticsChange();
        }
        owner.onDetach(this);
        this.owner = null;
        this.depth = 0;
        MutableVector<LayoutNode> mutableVector = this._foldedChildren;
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                content[i].detach$ui_release();
                i++;
            } while (i < size);
        }
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        MutableVector<OnGloballyPositionedModifierWrapper> mutableVector;
        int size;
        if (this.layoutState == LayoutState.Ready && getIsPlaced() && (mutableVector = this.onPositionedCallbacks) != null && (size = mutableVector.getSize()) > 0) {
            int i = 0;
            OnGloballyPositionedModifierWrapper[] content = mutableVector.getContent();
            do {
                OnGloballyPositionedModifierWrapper onGloballyPositionedModifierWrapper = content[i];
                onGloballyPositionedModifierWrapper.getModifier().onGloballyPositioned(onGloballyPositionedModifierWrapper);
                i++;
            } while (i < size);
        }
    }

    public final void draw$ui_release(@NotNull Canvas canvas) {
        getOuterLayoutNodeWrapper$ui_release().draw(canvas);
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        requestRemeasure$ui_release();
        Owner owner = this.owner;
        if (owner == null) {
            return;
        }
        owner.measureAndLayout();
    }

    @NotNull
    /* JADX INFO: renamed from: getAlignmentLines$ui_release, reason: from getter */
    public final LayoutNodeAlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    /* JADX INFO: renamed from: getCanMultiMeasure$ui_release, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    @NotNull
    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this.innerLayoutNodeWrapper;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getDepth$ui_release, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    @NotNull
    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asMutableList();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.outerMeasurablePlaceable.getHeight();
    }

    @Nullable
    public final LayoutNodeWrapper getInnerLayerWrapper$ui_release() {
        if (this.innerLayerWrapperIsDirty) {
            LayoutNodeWrapper wrappedBy = this.innerLayoutNodeWrapper;
            LayoutNodeWrapper wrappedBy2 = getOuterLayoutNodeWrapper$ui_release().getWrappedBy();
            this._innerLayerWrapper = null;
            while (!Intrinsics.areEqual(wrappedBy, wrappedBy2)) {
                if ((wrappedBy == null ? null : wrappedBy.getLayer()) != null) {
                    this._innerLayerWrapper = wrappedBy;
                    break;
                }
                wrappedBy = wrappedBy == null ? null : wrappedBy.getWrappedBy();
            }
        }
        LayoutNodeWrapper layoutNodeWrapper = this._innerLayerWrapper;
        if (layoutNodeWrapper == null || layoutNodeWrapper.getLayer() != null) {
            return layoutNodeWrapper;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: renamed from: getInnerLayerWrapperIsDirty$ui_release, reason: from getter */
    public final boolean getInnerLayerWrapperIsDirty() {
        return this.innerLayerWrapperIsDirty;
    }

    @NotNull
    /* JADX INFO: renamed from: getInnerLayoutNodeWrapper$ui_release, reason: from getter */
    public final LayoutNodeWrapper getInnerLayoutNodeWrapper() {
        return this.innerLayoutNodeWrapper;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntrinsicsPolicy$ui_release, reason: from getter */
    public final IntrinsicsPolicy getIntrinsicsPolicy() {
        return this.intrinsicsPolicy;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutState$ui_release, reason: from getter */
    public final LayoutState getLayoutState() {
        return this.layoutState;
    }

    @NotNull
    /* JADX INFO: renamed from: getMDrawScope$ui_release, reason: from getter */
    public final LayoutNodeDrawScope getMDrawScope() {
        return this.mDrawScope;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: getMeasureScope$ui_release, reason: from getter */
    public final MeasureScope getMeasureScope() {
        return this.measureScope;
    }

    @NotNull
    /* JADX INFO: renamed from: getMeasuredByParent$ui_release, reason: from getter */
    public final UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public List<ModifierInfo> getModifierInfo() {
        MutableVector mutableVector = new MutableVector(new ModifierInfo[16], 0);
        LayoutNodeWrapper innerLayoutNodeWrapper = getInnerLayoutNodeWrapper();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper); outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            mutableVector.add(new ModifierInfo(((DelegatingLayoutNodeWrapper) outerLayoutNodeWrapper$ui_release).getModifier(), outerLayoutNodeWrapper$ui_release, outerLayoutNodeWrapper$ui_release.getLayer()));
        }
        return mutableVector.asMutableList();
    }

    /* JADX INFO: renamed from: getNeedsOnPositionedDispatch$ui_release, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    @NotNull
    public final LayoutNodeWrapper getOuterLayoutNodeWrapper$ui_release() {
        return this.outerMeasurablePlaceable.getOuterWrapper();
    }

    @Nullable
    /* JADX INFO: renamed from: getOwner$ui_release, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    @Nullable
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        boolean z = false;
        if (layoutNode != null && layoutNode.isVirtual) {
            z = true;
        }
        if (!z) {
            return layoutNode;
        }
        if (layoutNode == null) {
            return null;
        }
        return layoutNode.getParent$ui_release();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.outerMeasurablePlaceable.getParentData();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @Nullable
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    /* JADX INFO: renamed from: getPlaceOrder$ui_release, reason: from getter */
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    public final boolean getWasMeasuredDuringThisIteration$ui_release() {
        return LayoutNodeKt.requireOwner(this).getMeasureIteration() == this.outerMeasurablePlaceable.getMeasureIteration();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.outerMeasurablePlaceable.getWidth();
    }

    @NotNull
    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(this.ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @NotNull
    public final MutableVector<LayoutNode> get_children$ui_release() {
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren;
        }
        recreateUnfoldedChildrenIfDirty();
        return this._unfoldedChildren;
    }

    public final void handleMeasureResult$ui_release(@NotNull MeasureResult measureResult) {
        this.innerLayoutNodeWrapper.setMeasureResult$ui_release(measureResult);
    }

    /* JADX INFO: renamed from: hitTest-3MmeM6k$ui_release, reason: not valid java name */
    public final void m2558hitTest3MmeM6k$ui_release(long pointerPosition, @NotNull List<PointerInputFilter> hitPointerInputFilters) {
        getOuterLayoutNodeWrapper$ui_release().mo2553hitTest3MmeM6k(getOuterLayoutNodeWrapper$ui_release().m2570fromParentPositionMKHz9U(pointerPosition), hitPointerInputFilters);
    }

    /* JADX INFO: renamed from: hitTestSemantics-3MmeM6k$ui_release, reason: not valid java name */
    public final void m2559hitTestSemantics3MmeM6k$ui_release(long pointerPosition, @NotNull List<SemanticsWrapper> hitSemanticsWrappers) {
        getOuterLayoutNodeWrapper$ui_release().mo2554hitTestSemantics3MmeM6k(getOuterLayoutNodeWrapper$ui_release().m2570fromParentPositionMKHz9U(pointerPosition), hitSemanticsWrappers);
    }

    public final void ignoreRemeasureRequests$ui_release(@NotNull Function0<Unit> block) {
        this.ignoreRemeasureRequests = true;
        block.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void insertAt$ui_release(int index, @NotNull LayoutNode instance) {
        if (!(instance._foldedParent == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(instance);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(debugTreeToString$default(this, 0, 1, null));
            sb.append(" Other tree: ");
            LayoutNode layoutNode = instance._foldedParent;
            sb.append((Object) (layoutNode != null ? debugTreeToString$default(layoutNode, 0, 1, null) : null));
            throw new IllegalStateException(sb.toString().toString());
        }
        if (!(instance.owner == null)) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + debugTreeToString$default(this, 0, 1, null) + " Other tree: " + debugTreeToString$default(instance, 0, 1, null)).toString());
        }
        instance._foldedParent = this;
        this._foldedChildren.add(index, instance);
        onZSortedChildrenInvalidated();
        if (instance.isVirtual) {
            if (!(!this.isVirtual)) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
            }
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        instance.getOuterLayoutNodeWrapper$ui_release().setWrappedBy$ui_release(this.innerLayoutNodeWrapper);
        Owner owner = this.owner;
        if (owner != null) {
            instance.attach$ui_release(owner);
        }
    }

    public final void invalidateLayer$ui_release() {
        LayoutNodeWrapper innerLayerWrapper$ui_release = getInnerLayerWrapper$ui_release();
        if (innerLayerWrapper$ui_release != null) {
            innerLayerWrapper$ui_release.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null) {
            return;
        }
        parent$ui_release.invalidateLayer$ui_release();
    }

    public final void invalidateLayers$ui_release() {
        LayoutNodeWrapper innerLayoutNodeWrapper = getInnerLayoutNodeWrapper();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper); outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            OwnedLayer layer = outerLayoutNodeWrapper$ui_release.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
        OwnedLayer layer2 = this.innerLayoutNodeWrapper.getLayer();
        if (layer2 == null) {
            return;
        }
        layer2.invalidate();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    /* JADX INFO: renamed from: isPlaced, reason: from getter */
    public boolean getIsPlaced() {
        return this.isPlaced;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return isAttached();
    }

    public final void layoutChildren$ui_release() {
        this.alignmentLines.recalculateQueryOwner$ui_release();
        LayoutState layoutState = this.layoutState;
        LayoutState layoutState2 = LayoutState.NeedsRelayout;
        if (layoutState == layoutState2) {
            onBeforeLayoutChildren();
        }
        if (this.layoutState == layoutState2) {
            this.layoutState = LayoutState.LayingOut;
            LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(this, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$layoutChildren$1
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
                    int i = 0;
                    this.this$0.nextChildPlaceOrder = 0;
                    MutableVector<LayoutNode> mutableVector = this.this$0.get_children$ui_release();
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        LayoutNode[] content = mutableVector.getContent();
                        int i2 = 0;
                        do {
                            LayoutNode layoutNode = content[i2];
                            layoutNode.previousPlaceOrder = layoutNode.getPlaceOrder();
                            layoutNode.placeOrder = Integer.MAX_VALUE;
                            layoutNode.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                            i2++;
                        } while (i2 < size);
                    }
                    this.this$0.getInnerLayoutNodeWrapper().getMeasureResult().placeChildren();
                    MutableVector<LayoutNode> mutableVector2 = this.this$0.get_children$ui_release();
                    LayoutNode layoutNode2 = this.this$0;
                    int size2 = mutableVector2.getSize();
                    if (size2 > 0) {
                        LayoutNode[] content2 = mutableVector2.getContent();
                        do {
                            LayoutNode layoutNode3 = content2[i];
                            if (layoutNode3.previousPlaceOrder != layoutNode3.getPlaceOrder()) {
                                layoutNode2.onZSortedChildrenInvalidated();
                                layoutNode2.invalidateLayer$ui_release();
                                if (layoutNode3.getPlaceOrder() == Integer.MAX_VALUE) {
                                    layoutNode3.markSubtreeAsNotPlaced();
                                }
                            }
                            layoutNode3.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(layoutNode3.getAlignmentLines().getUsedDuringParentLayout());
                            i++;
                        } while (i < size2);
                    }
                }
            });
            this.layoutState = LayoutState.Ready;
        }
        if (this.alignmentLines.getUsedDuringParentLayout()) {
            this.alignmentLines.setPreviousUsedDuringParentLayout$ui_release(true);
        }
        if (this.alignmentLines.getDirty() && this.alignmentLines.getRequired$ui_release()) {
            this.alignmentLines.recalculate();
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return this.outerMeasurablePlaceable.maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return this.outerMeasurablePlaceable.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo2468measureBRTryo0(long constraints) {
        return this.outerMeasurablePlaceable.mo2468measureBRTryo0(constraints);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return this.outerMeasurablePlaceable.minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return this.outerMeasurablePlaceable.minIntrinsicWidth(height);
    }

    public final void move$ui_release(int from, int to, int count) {
        if (from == to) {
            return;
        }
        int i = 0;
        if (count > 0) {
            while (true) {
                int i2 = i + 1;
                this._foldedChildren.add(from > to ? i + to : (to + count) - 2, this._foldedChildren.removeAt(from > to ? from + i : from));
                if (i2 >= count) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        onZSortedChildrenInvalidated();
        invalidateUnfoldedVirtualChildren();
        requestRemeasure$ui_release();
    }

    public final void onAlignmentsChanged$ui_release() {
        if (this.alignmentLines.getDirty()) {
            return;
        }
        this.alignmentLines.setDirty$ui_release(true);
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null) {
            return;
        }
        if (this.alignmentLines.getUsedDuringParentMeasurement()) {
            parent$ui_release.requestRemeasure$ui_release();
        } else if (this.alignmentLines.getPreviousUsedDuringParentLayout()) {
            parent$ui_release.requestRelayout$ui_release();
        }
        if (this.alignmentLines.getUsedByModifierMeasurement()) {
            requestRemeasure$ui_release();
        }
        if (this.alignmentLines.getUsedByModifierLayout()) {
            parent$ui_release.requestRelayout$ui_release();
        }
        parent$ui_release.onAlignmentsChanged$ui_release();
    }

    public final void onNodePlaced$ui_release() {
        LayoutNode parent$ui_release = getParent$ui_release();
        float zIndex = this.innerLayoutNodeWrapper.getZIndex();
        LayoutNodeWrapper innerLayoutNodeWrapper = getInnerLayoutNodeWrapper();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper); outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            zIndex += outerLayoutNodeWrapper$ui_release.getZIndex();
        }
        if (!(zIndex == this.zIndex)) {
            this.zIndex = zIndex;
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated();
            }
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
        }
        if (!getIsPlaced()) {
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            markNodeAndSubtreeAsPlaced();
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (parent$ui_release.layoutState == LayoutState.LayingOut) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
            int i = parent$ui_release.nextChildPlaceOrder;
            this.placeOrder = i;
            parent$ui_release.nextChildPlaceOrder = i + 1;
        }
        layoutChildren$ui_release();
    }

    public final void place$ui_release(int x, int y) {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int measuredWidth = this.outerMeasurablePlaceable.getMeasuredWidth();
        LayoutDirection layoutDirection = getLayoutDirection();
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        Placeable.PlacementScope.parentWidth = measuredWidth;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        Placeable.PlacementScope.placeRelative$default(companion, this.outerMeasurablePlaceable, x, y, 0.0f, 4, null);
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m2560remeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints != null) {
            return this.outerMeasurablePlaceable.m2583remeasureBRTryo0(constraints.getValue());
        }
        return false;
    }

    public final void removeAll$ui_release() {
        boolean z = this.owner != null;
        int size = this._foldedChildren.getSize() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                LayoutNode layoutNode = this._foldedChildren.getContent()[size];
                if (z) {
                    layoutNode.detach$ui_release();
                }
                layoutNode._foldedParent = null;
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        this._foldedChildren.clear();
        onZSortedChildrenInvalidated();
        this.virtualChildrenCount = 0;
        invalidateUnfoldedVirtualChildren();
    }

    public final void removeAt$ui_release(int index, int count) {
        if (!(count >= 0)) {
            throw new IllegalArgumentException(("count (" + count + ") must be greater than 0").toString());
        }
        boolean z = this.owner != null;
        int i = (count + index) - 1;
        if (index > i) {
            return;
        }
        while (true) {
            int i2 = i - 1;
            LayoutNode layoutNodeRemoveAt = this._foldedChildren.removeAt(i);
            onZSortedChildrenInvalidated();
            if (z) {
                layoutNodeRemoveAt.detach$ui_release();
            }
            layoutNodeRemoveAt._foldedParent = null;
            if (layoutNodeRemoveAt.isVirtual) {
                this.virtualChildrenCount--;
            }
            invalidateUnfoldedVirtualChildren();
            if (i == index) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void replace$ui_release() {
        this.outerMeasurablePlaceable.replace();
    }

    public final void requestRelayout$ui_release() {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this);
    }

    public final void requestRemeasure$ui_release() {
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this);
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.canMultiMeasure = z;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(@NotNull Density density) {
        if (Intrinsics.areEqual(this.density, density)) {
            return;
        }
        this.density = density;
        onDensityOrLayoutDirectionChanged();
    }

    public final void setDepth$ui_release(int i) {
        this.depth = i;
    }

    public final void setInnerLayerWrapperIsDirty$ui_release(boolean z) {
        this.innerLayerWrapperIsDirty = z;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
        }
    }

    public final void setLayoutState$ui_release(@NotNull LayoutState layoutState) {
        this.layoutState = layoutState;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(@NotNull MeasurePolicy measurePolicy) {
        if (Intrinsics.areEqual(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
        requestRemeasure$ui_release();
    }

    public final void setMeasuredByParent$ui_release(@NotNull UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(@NotNull Modifier modifier) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        if (Intrinsics.areEqual(modifier, this.modifier)) {
            return;
        }
        if (!Intrinsics.areEqual(getModifier(), Modifier.INSTANCE) && !(!this.isVirtual)) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.modifier = modifier;
        boolean zShouldInvalidateParentLayer = shouldInvalidateParentLayer();
        copyWrappersToCache();
        markReusedModifiers(modifier);
        LayoutNodeWrapper outerWrapper = this.outerMeasurablePlaceable.getOuterWrapper();
        if (SemanticsNodeKt.getOuterSemantics(this) != null && isAttached()) {
            this.owner.onSemanticsChange();
        }
        boolean zHasNewPositioningCallback = hasNewPositioningCallback();
        MutableVector<OnGloballyPositionedModifierWrapper> mutableVector = this.onPositionedCallbacks;
        if (mutableVector != null) {
            mutableVector.clear();
        }
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) getModifier().foldOut(this.innerLayoutNodeWrapper, new Function2<Modifier.Element, LayoutNodeWrapper, LayoutNodeWrapper>() { // from class: androidx.compose.ui.node.LayoutNode$modifier$outerWrapper$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final LayoutNodeWrapper invoke(@NotNull Modifier.Element element, @NotNull LayoutNodeWrapper layoutNodeWrapper2) {
                if (element instanceof RemeasurementModifier) {
                    ((RemeasurementModifier) element).onRemeasurementAvailable(this.this$0);
                }
                DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapperReuseLayoutNodeWrapper = this.this$0.reuseLayoutNodeWrapper(element, layoutNodeWrapper2);
                if (delegatingLayoutNodeWrapperReuseLayoutNodeWrapper != null) {
                    if (!(delegatingLayoutNodeWrapperReuseLayoutNodeWrapper instanceof OnGloballyPositionedModifierWrapper)) {
                        return delegatingLayoutNodeWrapperReuseLayoutNodeWrapper;
                    }
                    this.this$0.getOrCreateOnPositionedCallbacks().add(delegatingLayoutNodeWrapperReuseLayoutNodeWrapper);
                    return delegatingLayoutNodeWrapperReuseLayoutNodeWrapper;
                }
                LayoutNodeWrapper modifiedDrawNode = element instanceof DrawModifier ? new ModifiedDrawNode(layoutNodeWrapper2, (DrawModifier) element) : layoutNodeWrapper2;
                if (element instanceof FocusModifier) {
                    ModifiedFocusNode modifiedFocusNode = new ModifiedFocusNode(modifiedDrawNode, (FocusModifier) element);
                    if (layoutNodeWrapper2 != modifiedFocusNode.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) modifiedFocusNode.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = modifiedFocusNode;
                }
                if (element instanceof FocusEventModifier) {
                    ModifiedFocusEventNode modifiedFocusEventNode = new ModifiedFocusEventNode(modifiedDrawNode, (FocusEventModifier) element);
                    if (layoutNodeWrapper2 != modifiedFocusEventNode.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) modifiedFocusEventNode.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = modifiedFocusEventNode;
                }
                if (element instanceof FocusRequesterModifier) {
                    ModifiedFocusRequesterNode modifiedFocusRequesterNode = new ModifiedFocusRequesterNode(modifiedDrawNode, (FocusRequesterModifier) element);
                    if (layoutNodeWrapper2 != modifiedFocusRequesterNode.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) modifiedFocusRequesterNode.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = modifiedFocusRequesterNode;
                }
                if (element instanceof FocusOrderModifier) {
                    ModifiedFocusOrderNode modifiedFocusOrderNode = new ModifiedFocusOrderNode(modifiedDrawNode, (FocusOrderModifier) element);
                    if (layoutNodeWrapper2 != modifiedFocusOrderNode.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) modifiedFocusOrderNode.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = modifiedFocusOrderNode;
                }
                if (element instanceof KeyInputModifier) {
                    ModifiedKeyInputNode modifiedKeyInputNode = new ModifiedKeyInputNode(modifiedDrawNode, (KeyInputModifier) element);
                    if (layoutNodeWrapper2 != modifiedKeyInputNode.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) modifiedKeyInputNode.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = modifiedKeyInputNode;
                }
                if (element instanceof PointerInputModifier) {
                    PointerInputDelegatingWrapper pointerInputDelegatingWrapper = new PointerInputDelegatingWrapper(modifiedDrawNode, (PointerInputModifier) element);
                    if (layoutNodeWrapper2 != pointerInputDelegatingWrapper.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) pointerInputDelegatingWrapper.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = pointerInputDelegatingWrapper;
                }
                if (element instanceof NestedScrollModifier) {
                    NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper = new NestedScrollDelegatingWrapper(modifiedDrawNode, (NestedScrollModifier) element);
                    if (layoutNodeWrapper2 != nestedScrollDelegatingWrapper.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) nestedScrollDelegatingWrapper.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = nestedScrollDelegatingWrapper;
                }
                if (element instanceof LayoutModifier) {
                    ModifiedLayoutNode modifiedLayoutNode = new ModifiedLayoutNode(modifiedDrawNode, (LayoutModifier) element);
                    if (layoutNodeWrapper2 != modifiedLayoutNode.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) modifiedLayoutNode.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = modifiedLayoutNode;
                }
                if (element instanceof ParentDataModifier) {
                    ModifiedParentDataNode modifiedParentDataNode = new ModifiedParentDataNode(modifiedDrawNode, (ParentDataModifier) element);
                    if (layoutNodeWrapper2 != modifiedParentDataNode.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) modifiedParentDataNode.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = modifiedParentDataNode;
                }
                if (element instanceof SemanticsModifier) {
                    SemanticsWrapper semanticsWrapper = new SemanticsWrapper(modifiedDrawNode, (SemanticsModifier) element);
                    if (layoutNodeWrapper2 != semanticsWrapper.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) semanticsWrapper.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = semanticsWrapper;
                }
                if (element instanceof OnRemeasuredModifier) {
                    RemeasureModifierWrapper remeasureModifierWrapper = new RemeasureModifierWrapper(modifiedDrawNode, (OnRemeasuredModifier) element);
                    if (layoutNodeWrapper2 != remeasureModifierWrapper.getWrapped()) {
                        ((DelegatingLayoutNodeWrapper) remeasureModifierWrapper.getWrapped()).setChained(true);
                    }
                    modifiedDrawNode = remeasureModifierWrapper;
                }
                if (!(element instanceof OnGloballyPositionedModifier)) {
                    return modifiedDrawNode;
                }
                OnGloballyPositionedModifierWrapper onGloballyPositionedModifierWrapper = new OnGloballyPositionedModifierWrapper(modifiedDrawNode, (OnGloballyPositionedModifier) element);
                if (layoutNodeWrapper2 != onGloballyPositionedModifierWrapper.getWrapped()) {
                    ((DelegatingLayoutNodeWrapper) onGloballyPositionedModifierWrapper.getWrapped()).setChained(true);
                }
                this.this$0.getOrCreateOnPositionedCallbacks().add(onGloballyPositionedModifierWrapper);
                return onGloballyPositionedModifierWrapper;
            }
        });
        LayoutNode parent$ui_release3 = getParent$ui_release();
        layoutNodeWrapper.setWrappedBy$ui_release(parent$ui_release3 == null ? null : parent$ui_release3.innerLayoutNodeWrapper);
        this.outerMeasurablePlaceable.setOuterWrapper(layoutNodeWrapper);
        if (isAttached()) {
            MutableVector<DelegatingLayoutNodeWrapper<?>> mutableVector2 = this.wrapperCache;
            int size = mutableVector2.getSize();
            if (size > 0) {
                int i = 0;
                DelegatingLayoutNodeWrapper<?>[] content = mutableVector2.getContent();
                do {
                    content[i].detach();
                    i++;
                } while (i < size);
            }
            LayoutNodeWrapper innerLayoutNodeWrapper = getInnerLayoutNodeWrapper();
            for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper); outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
                if (!outerLayoutNodeWrapper$ui_release.isAttached()) {
                    outerLayoutNodeWrapper$ui_release.attach();
                }
            }
        }
        this.wrapperCache.clear();
        LayoutNodeWrapper innerLayoutNodeWrapper2 = getInnerLayoutNodeWrapper();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release2 = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release2, innerLayoutNodeWrapper2); outerLayoutNodeWrapper$ui_release2 = outerLayoutNodeWrapper$ui_release2.getWrapped()) {
            outerLayoutNodeWrapper$ui_release2.onModifierChanged();
        }
        if (!Intrinsics.areEqual(outerWrapper, this.innerLayoutNodeWrapper) || !Intrinsics.areEqual(layoutNodeWrapper, this.innerLayoutNodeWrapper)) {
            requestRemeasure$ui_release();
            LayoutNode parent$ui_release4 = getParent$ui_release();
            if (parent$ui_release4 != null) {
                parent$ui_release4.requestRelayout$ui_release();
            }
        } else if (this.layoutState == LayoutState.Ready && zHasNewPositioningCallback) {
            requestRemeasure$ui_release();
        }
        Object parentData = getParentData();
        this.outerMeasurablePlaceable.recalculateParentData();
        if (!Intrinsics.areEqual(parentData, getParentData()) && (parent$ui_release2 = getParent$ui_release()) != null) {
            parent$ui_release2.requestRemeasure$ui_release();
        }
        if ((zShouldInvalidateParentLayer || shouldInvalidateParentLayer()) && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.needsOnPositionedDispatch = z;
    }

    public final void setOnAttach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    public final void setOnDetach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    @NotNull
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void withNoSnapshotReadObservation$ui_release(@NotNull Function0<Unit> block) {
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().withNoSnapshotReadObservation$ui_release(block);
    }

    public LayoutNode(boolean z) {
        this._foldedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.layoutState = LayoutState.Ready;
        this.wrapperCache = new MutableVector<>(new DelegatingLayoutNodeWrapper[16], 0);
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.measureScope = new LayoutNode$measureScope$1(this);
        this.layoutDirection = LayoutDirection.Ltr;
        this.alignmentLines = new LayoutNodeAlignmentLines(this);
        this.mDrawScope = LayoutNodeKt.getSharedDrawScope();
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.measuredByParent = UsageByParent.NotUsed;
        InnerPlaceable innerPlaceable = new InnerPlaceable(this);
        this.innerLayoutNodeWrapper = innerPlaceable;
        this.outerMeasurablePlaceable = new OuterMeasurablePlaceable(this, innerPlaceable);
        this.innerLayerWrapperIsDirty = true;
        this.modifier = Modifier.INSTANCE;
        this.ZComparator = new Comparator() { // from class: androidx.compose.ui.node.LayoutNode$ZComparator$1
            @Override // java.util.Comparator
            public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                return (layoutNode.zIndex > layoutNode2.zIndex ? 1 : (layoutNode.zIndex == layoutNode2.zIndex ? 0 : -1)) == 0 ? Intrinsics.compare(layoutNode.getPlaceOrder(), layoutNode2.getPlaceOrder()) : Float.compare(layoutNode.zIndex, layoutNode2.zIndex);
            }
        };
        this.isVirtual = z;
    }
}
