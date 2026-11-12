package com.mapbox.maps.extension.compose.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.DoubleRangeValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.layers.Filter;
import com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import e23.p;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0003\b´\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0081\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-B\t\b\u0016¢\u0006\u0004\b,\u0010.J\u0017\u00104\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R1\u0010=\u001a\u00020*2\u0006\u00105\u001a\u00020*8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010.\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020>8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b?\u00107\u0012\u0004\b@\u0010.R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00107R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00107R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00107R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00107R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00107R \u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020>8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bF\u00107\u0012\u0004\bG\u0010.R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\r0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u00107R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00107R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00100>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00107R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00107R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u00107R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u00107R \u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bN\u00107\u0012\u0004\bO\u0010.R \u0010P\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bP\u00107\u0012\u0004\bQ\u0010.R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u00107R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u00107R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u00107R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u00107R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00107R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u00107R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u00107R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001e0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u00107R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u00107R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u00107R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\"0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u00107R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020$0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u00107R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020$0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u00107R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u00107R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020(0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u00107R1\u0010h\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\be\u0010.\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d*\u0004\bf\u0010gR+\u0010n\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l*\u0004\bm\u0010gR+\u0010t\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r*\u0004\bs\u0010gR+\u0010x\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bu\u0010j\"\u0004\bv\u0010l*\u0004\bw\u0010gR+\u0010|\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\by\u0010p\"\u0004\bz\u0010r*\u0004\b{\u0010gR.\u0010\u0082\u0001\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0014\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001*\u0005\b\u0081\u0001\u0010gR6\u0010\u0087\u0001\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u0085\u0001\u0010.\u001a\u0005\b\u0083\u0001\u0010b\"\u0005\b\u0084\u0001\u0010d*\u0005\b\u0086\u0001\u0010gR1\u0010\u008d\u0001\u001a\u00020\r2\u0006\u00105\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001*\u0005\b\u008c\u0001\u0010gR/\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u008e\u0001\u0010p\"\u0005\b\u008f\u0001\u0010r*\u0005\b\u0090\u0001\u0010gR1\u0010\u0097\u0001\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001*\u0005\b\u0096\u0001\u0010gR/\u0010\u009b\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0098\u0001\u0010p\"\u0005\b\u0099\u0001\u0010r*\u0005\b\u009a\u0001\u0010gR/\u0010\u009f\u0001\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u009c\u0001\u0010j\"\u0005\b\u009d\u0001\u0010l*\u0005\b\u009e\u0001\u0010gR/\u0010£\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b \u0001\u0010p\"\u0005\b¡\u0001\u0010r*\u0005\b¢\u0001\u0010gR6\u0010¨\u0001\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b¦\u0001\u0010.\u001a\u0005\b¤\u0001\u0010j\"\u0005\b¥\u0001\u0010l*\u0005\b§\u0001\u0010gR6\u0010\u00ad\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b«\u0001\u0010.\u001a\u0005\b©\u0001\u0010p\"\u0005\bª\u0001\u0010r*\u0005\b¬\u0001\u0010gR/\u0010±\u0001\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b®\u0001\u0010j\"\u0005\b¯\u0001\u0010l*\u0005\b°\u0001\u0010gR/\u0010µ\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b²\u0001\u0010p\"\u0005\b³\u0001\u0010r*\u0005\b´\u0001\u0010gR/\u0010¹\u0001\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¶\u0001\u0010j\"\u0005\b·\u0001\u0010l*\u0005\b¸\u0001\u0010gR/\u0010½\u0001\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bº\u0001\u0010j\"\u0005\b»\u0001\u0010l*\u0005\b¼\u0001\u0010gR/\u0010Á\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¾\u0001\u0010p\"\u0005\b¿\u0001\u0010r*\u0005\bÀ\u0001\u0010gR/\u0010Å\u0001\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÂ\u0001\u0010j\"\u0005\bÃ\u0001\u0010l*\u0005\bÄ\u0001\u0010gR/\u0010É\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÆ\u0001\u0010p\"\u0005\bÇ\u0001\u0010r*\u0005\bÈ\u0001\u0010gR1\u0010Ï\u0001\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001*\u0005\bÎ\u0001\u0010gR/\u0010Ó\u0001\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÐ\u0001\u0010j\"\u0005\bÑ\u0001\u0010l*\u0005\bÒ\u0001\u0010gR/\u0010×\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÔ\u0001\u0010p\"\u0005\bÕ\u0001\u0010r*\u0005\bÖ\u0001\u0010gR1\u0010Ý\u0001\u001a\u00020\"2\u0006\u00105\u001a\u00020\"8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001*\u0005\bÜ\u0001\u0010gR1\u0010ã\u0001\u001a\u00020$2\u0006\u00105\u001a\u00020$8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001*\u0005\bâ\u0001\u0010gR1\u0010ç\u0001\u001a\u00020$2\u0006\u00105\u001a\u00020$8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bä\u0001\u0010ß\u0001\"\u0006\bå\u0001\u0010á\u0001*\u0005\bæ\u0001\u0010gR/\u0010ë\u0001\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bè\u0001\u0010b\"\u0005\bé\u0001\u0010d*\u0005\bê\u0001\u0010gR1\u0010ñ\u0001\u001a\u00020(2\u0006\u00105\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bì\u0001\u0010í\u0001\"\u0006\bî\u0001\u0010ï\u0001*\u0005\bð\u0001\u0010g¨\u0006ò\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/RasterLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialRasterArrayBand", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialRasterBrightnessMax", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialRasterBrightnessMaxTransition", "initialRasterBrightnessMin", "initialRasterBrightnessMinTransition", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialRasterColor", "initialRasterColorUseTheme", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "initialRasterColorMix", "initialRasterColorMixTransition", "Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;", "initialRasterColorRange", "initialRasterColorRangeTransition", "initialRasterContrast", "initialRasterContrastTransition", "initialRasterElevation", "initialRasterElevationTransition", "initialRasterEmissiveStrength", "initialRasterEmissiveStrengthTransition", "initialRasterFadeDuration", "initialRasterHueRotate", "initialRasterHueRotateTransition", "initialRasterOpacity", "initialRasterOpacityTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/RasterResamplingValue;", "initialRasterResampling", "initialRasterSaturation", "initialRasterSaturationTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "initialInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/RasterResamplingValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "getInteractionsState$annotations", "interactionsState", "Lp3/p1;", "rasterArrayBandState", "getRasterArrayBandState$annotations", "rasterBrightnessMaxState", "rasterBrightnessMaxTransitionState", "rasterBrightnessMinState", "rasterBrightnessMinTransitionState", "rasterColorState", "rasterColorUseThemeState", "getRasterColorUseThemeState$annotations", "rasterColorMixState", "rasterColorMixTransitionState", "rasterColorRangeState", "rasterColorRangeTransitionState", "rasterContrastState", "rasterContrastTransitionState", "rasterElevationState", "getRasterElevationState$annotations", "rasterElevationTransitionState", "getRasterElevationTransitionState$annotations", "rasterEmissiveStrengthState", "rasterEmissiveStrengthTransitionState", "rasterFadeDurationState", "rasterHueRotateState", "rasterHueRotateTransitionState", "rasterOpacityState", "rasterOpacityTransitionState", "rasterResamplingState", "rasterSaturationState", "rasterSaturationTransitionState", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "getRasterArrayBand", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setRasterArrayBand", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getRasterArrayBand$annotations", "getRasterArrayBand$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/RasterLayerState;)Ljava/lang/Object;", "rasterArrayBand", "getRasterBrightnessMax", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setRasterBrightnessMax", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getRasterBrightnessMax$delegate", "rasterBrightnessMax", "getRasterBrightnessMaxTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setRasterBrightnessMaxTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getRasterBrightnessMaxTransition$delegate", "rasterBrightnessMaxTransition", "getRasterBrightnessMin", "setRasterBrightnessMin", "getRasterBrightnessMin$delegate", "rasterBrightnessMin", "getRasterBrightnessMinTransition", "setRasterBrightnessMinTransition", "getRasterBrightnessMinTransition$delegate", "rasterBrightnessMinTransition", "getRasterColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setRasterColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getRasterColor$delegate", "rasterColor", "getRasterColorUseTheme", "setRasterColorUseTheme", "getRasterColorUseTheme$annotations", "getRasterColorUseTheme$delegate", "rasterColorUseTheme", "getRasterColorMix", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setRasterColorMix", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getRasterColorMix$delegate", "rasterColorMix", "getRasterColorMixTransition", "setRasterColorMixTransition", "getRasterColorMixTransition$delegate", "rasterColorMixTransition", "getRasterColorRange", "()Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;", "setRasterColorRange", "(Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;)V", "getRasterColorRange$delegate", "rasterColorRange", "getRasterColorRangeTransition", "setRasterColorRangeTransition", "getRasterColorRangeTransition$delegate", "rasterColorRangeTransition", "getRasterContrast", "setRasterContrast", "getRasterContrast$delegate", "rasterContrast", "getRasterContrastTransition", "setRasterContrastTransition", "getRasterContrastTransition$delegate", "rasterContrastTransition", "getRasterElevation", "setRasterElevation", "getRasterElevation$annotations", "getRasterElevation$delegate", "rasterElevation", "getRasterElevationTransition", "setRasterElevationTransition", "getRasterElevationTransition$annotations", "getRasterElevationTransition$delegate", "rasterElevationTransition", "getRasterEmissiveStrength", "setRasterEmissiveStrength", "getRasterEmissiveStrength$delegate", "rasterEmissiveStrength", "getRasterEmissiveStrengthTransition", "setRasterEmissiveStrengthTransition", "getRasterEmissiveStrengthTransition$delegate", "rasterEmissiveStrengthTransition", "getRasterFadeDuration", "setRasterFadeDuration", "getRasterFadeDuration$delegate", "rasterFadeDuration", "getRasterHueRotate", "setRasterHueRotate", "getRasterHueRotate$delegate", "rasterHueRotate", "getRasterHueRotateTransition", "setRasterHueRotateTransition", "getRasterHueRotateTransition$delegate", "rasterHueRotateTransition", "getRasterOpacity", "setRasterOpacity", "getRasterOpacity$delegate", "rasterOpacity", "getRasterOpacityTransition", "setRasterOpacityTransition", "getRasterOpacityTransition$delegate", "rasterOpacityTransition", "getRasterResampling", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/RasterResamplingValue;", "setRasterResampling", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/RasterResamplingValue;)V", "getRasterResampling$delegate", "rasterResampling", "getRasterSaturation", "setRasterSaturation", "getRasterSaturation$delegate", "rasterSaturation", "getRasterSaturationTransition", "setRasterSaturationTransition", "getRasterSaturationTransition$delegate", "rasterSaturationTransition", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RasterLayerState {
    private final p1<Filter> filterState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<StringValue> rasterArrayBandState;
    private final p1<DoubleValue> rasterBrightnessMaxState;
    private final p1<Transition> rasterBrightnessMaxTransitionState;
    private final p1<DoubleValue> rasterBrightnessMinState;
    private final p1<Transition> rasterBrightnessMinTransitionState;
    private final p1<DoubleListValue> rasterColorMixState;
    private final p1<Transition> rasterColorMixTransitionState;
    private final p1<DoubleRangeValue> rasterColorRangeState;
    private final p1<Transition> rasterColorRangeTransitionState;
    private final p1<ColorValue> rasterColorState;
    private final p1<StringValue> rasterColorUseThemeState;
    private final p1<DoubleValue> rasterContrastState;
    private final p1<Transition> rasterContrastTransitionState;
    private final p1<DoubleValue> rasterElevationState;
    private final p1<Transition> rasterElevationTransitionState;
    private final p1<DoubleValue> rasterEmissiveStrengthState;
    private final p1<Transition> rasterEmissiveStrengthTransitionState;
    private final p1<DoubleValue> rasterFadeDurationState;
    private final p1<DoubleValue> rasterHueRotateState;
    private final p1<Transition> rasterHueRotateTransitionState;
    private final p1<DoubleValue> rasterOpacityState;
    private final p1<Transition> rasterOpacityTransitionState;
    private final p1<RasterResamplingValue> rasterResamplingState;
    private final p1<DoubleValue> rasterSaturationState;
    private final p1<Transition> rasterSaturationTransitionState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private RasterLayerState(StringValue stringValue, DoubleValue doubleValue, Transition transition, DoubleValue doubleValue2, Transition transition2, ColorValue colorValue, StringValue stringValue2, DoubleListValue doubleListValue, Transition transition3, DoubleRangeValue doubleRangeValue, Transition transition4, DoubleValue doubleValue3, Transition transition5, DoubleValue doubleValue4, Transition transition6, DoubleValue doubleValue5, Transition transition7, DoubleValue doubleValue6, DoubleValue doubleValue7, Transition transition8, DoubleValue doubleValue8, Transition transition9, RasterResamplingValue rasterResamplingValue, DoubleValue doubleValue9, Transition transition10, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue3, Filter filter, LayerInteractionsState layerInteractionsState) {
        this.interactionsState = p0.n(layerInteractionsState);
        this.rasterArrayBandState = p0.n(stringValue);
        this.rasterBrightnessMaxState = p0.n(doubleValue);
        this.rasterBrightnessMaxTransitionState = p0.n(transition);
        this.rasterBrightnessMinState = p0.n(doubleValue2);
        this.rasterBrightnessMinTransitionState = p0.n(transition2);
        this.rasterColorState = p0.n(colorValue);
        this.rasterColorUseThemeState = p0.n(stringValue2);
        this.rasterColorMixState = p0.n(doubleListValue);
        this.rasterColorMixTransitionState = p0.n(transition3);
        this.rasterColorRangeState = p0.n(doubleRangeValue);
        this.rasterColorRangeTransitionState = p0.n(transition4);
        this.rasterContrastState = p0.n(doubleValue3);
        this.rasterContrastTransitionState = p0.n(transition5);
        this.rasterElevationState = p0.n(doubleValue4);
        this.rasterElevationTransitionState = p0.n(transition6);
        this.rasterEmissiveStrengthState = p0.n(doubleValue5);
        this.rasterEmissiveStrengthTransitionState = p0.n(transition7);
        this.rasterFadeDurationState = p0.n(doubleValue6);
        this.rasterHueRotateState = p0.n(doubleValue7);
        this.rasterHueRotateTransitionState = p0.n(transition8);
        this.rasterOpacityState = p0.n(doubleValue8);
        this.rasterOpacityTransitionState = p0.n(transition9);
        this.rasterResamplingState = p0.n(rasterResamplingValue);
        this.rasterSaturationState = p0.n(doubleValue9);
        this.rasterSaturationTransitionState = p0.n(transition10);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue3);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getInteractionsState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterArrayBand$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterArrayBandState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterElevation$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterElevationState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterElevationTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterElevationTransitionState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(-432756223);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(layerNode) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= o0VarE.B(this) ? 32 : 16;
        }
        if ((i15 & 91) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterArrayBandState, "raster-array-band", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterBrightnessMaxState, "raster-brightness-max", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterBrightnessMaxTransitionState, "raster-brightness-max-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterBrightnessMinState, "raster-brightness-min", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterBrightnessMinTransitionState, "raster-brightness-min-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterColorState, "raster-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterColorUseThemeState, "raster-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterColorMixState, "raster-color-mix", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterColorMixTransitionState, "raster-color-mix-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterColorRangeState, "raster-color-range", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterColorRangeTransitionState, "raster-color-range-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterContrastState, "raster-contrast", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterContrastTransitionState, "raster-contrast-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterElevationState, "raster-elevation", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterElevationTransitionState, "raster-elevation-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterEmissiveStrengthState, "raster-emissive-strength", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterEmissiveStrengthTransitionState, "raster-emissive-strength-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterFadeDurationState, "raster-fade-duration", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterHueRotateState, "raster-hue-rotate", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterHueRotateTransitionState, "raster-hue-rotate-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterOpacityState, "raster-opacity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterOpacityTransitionState, "raster-opacity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterResamplingState, "raster-resampling", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterSaturationState, "raster-saturation", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterSaturationTransitionState, "raster-saturation-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.visibilityState, "visibility", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.minZoomState, "minzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.maxZoomState, "maxzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.sourceLayerState, "source-layer", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.filterState, "filter", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new RasterLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final Filter getFilter() {
        return this.filterState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LayerInteractionsState getInteractionsState() {
        return (LayerInteractionsState) this.interactionsState.getF182175a();
    }

    public final LongValue getMaxZoom() {
        return this.maxZoomState.getF182175a();
    }

    public final LongValue getMinZoom() {
        return this.minZoomState.getF182175a();
    }

    public final StringValue getRasterArrayBand() {
        return this.rasterArrayBandState.getF182175a();
    }

    public final DoubleValue getRasterBrightnessMax() {
        return this.rasterBrightnessMaxState.getF182175a();
    }

    public final Transition getRasterBrightnessMaxTransition() {
        return this.rasterBrightnessMaxTransitionState.getF182175a();
    }

    public final DoubleValue getRasterBrightnessMin() {
        return this.rasterBrightnessMinState.getF182175a();
    }

    public final Transition getRasterBrightnessMinTransition() {
        return this.rasterBrightnessMinTransitionState.getF182175a();
    }

    public final ColorValue getRasterColor() {
        return this.rasterColorState.getF182175a();
    }

    public final DoubleListValue getRasterColorMix() {
        return this.rasterColorMixState.getF182175a();
    }

    public final Transition getRasterColorMixTransition() {
        return this.rasterColorMixTransitionState.getF182175a();
    }

    public final DoubleRangeValue getRasterColorRange() {
        return this.rasterColorRangeState.getF182175a();
    }

    public final Transition getRasterColorRangeTransition() {
        return this.rasterColorRangeTransitionState.getF182175a();
    }

    public final StringValue getRasterColorUseTheme() {
        return this.rasterColorUseThemeState.getF182175a();
    }

    public final DoubleValue getRasterContrast() {
        return this.rasterContrastState.getF182175a();
    }

    public final Transition getRasterContrastTransition() {
        return this.rasterContrastTransitionState.getF182175a();
    }

    public final DoubleValue getRasterElevation() {
        return this.rasterElevationState.getF182175a();
    }

    public final Transition getRasterElevationTransition() {
        return this.rasterElevationTransitionState.getF182175a();
    }

    public final DoubleValue getRasterEmissiveStrength() {
        return this.rasterEmissiveStrengthState.getF182175a();
    }

    public final Transition getRasterEmissiveStrengthTransition() {
        return this.rasterEmissiveStrengthTransitionState.getF182175a();
    }

    public final DoubleValue getRasterFadeDuration() {
        return this.rasterFadeDurationState.getF182175a();
    }

    public final DoubleValue getRasterHueRotate() {
        return this.rasterHueRotateState.getF182175a();
    }

    public final Transition getRasterHueRotateTransition() {
        return this.rasterHueRotateTransitionState.getF182175a();
    }

    public final DoubleValue getRasterOpacity() {
        return this.rasterOpacityState.getF182175a();
    }

    public final Transition getRasterOpacityTransition() {
        return this.rasterOpacityTransitionState.getF182175a();
    }

    public final RasterResamplingValue getRasterResampling() {
        return this.rasterResamplingState.getF182175a();
    }

    public final DoubleValue getRasterSaturation() {
        return this.rasterSaturationState.getF182175a();
    }

    public final Transition getRasterSaturationTransition() {
        return this.rasterSaturationTransitionState.getF182175a();
    }

    public final StringValue getSourceLayer() {
        return this.sourceLayerState.getF182175a();
    }

    public final VisibilityValue getVisibility() {
        return this.visibilityState.getF182175a();
    }

    public final void setFilter(Filter filter) {
        filter.getClass();
        this.filterState.setValue(filter);
    }

    public final void setInteractionsState(LayerInteractionsState layerInteractionsState) {
        layerInteractionsState.getClass();
        this.interactionsState.setValue(layerInteractionsState);
    }

    public final void setMaxZoom(LongValue longValue) {
        longValue.getClass();
        this.maxZoomState.setValue(longValue);
    }

    public final void setMinZoom(LongValue longValue) {
        longValue.getClass();
        this.minZoomState.setValue(longValue);
    }

    public final void setRasterArrayBand(StringValue stringValue) {
        stringValue.getClass();
        this.rasterArrayBandState.setValue(stringValue);
    }

    public final void setRasterBrightnessMax(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterBrightnessMaxState.setValue(doubleValue);
    }

    public final void setRasterBrightnessMaxTransition(Transition transition) {
        transition.getClass();
        this.rasterBrightnessMaxTransitionState.setValue(transition);
    }

    public final void setRasterBrightnessMin(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterBrightnessMinState.setValue(doubleValue);
    }

    public final void setRasterBrightnessMinTransition(Transition transition) {
        transition.getClass();
        this.rasterBrightnessMinTransitionState.setValue(transition);
    }

    public final void setRasterColor(ColorValue colorValue) {
        colorValue.getClass();
        this.rasterColorState.setValue(colorValue);
    }

    public final void setRasterColorMix(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.rasterColorMixState.setValue(doubleListValue);
    }

    public final void setRasterColorMixTransition(Transition transition) {
        transition.getClass();
        this.rasterColorMixTransitionState.setValue(transition);
    }

    public final void setRasterColorRange(DoubleRangeValue doubleRangeValue) {
        doubleRangeValue.getClass();
        this.rasterColorRangeState.setValue(doubleRangeValue);
    }

    public final void setRasterColorRangeTransition(Transition transition) {
        transition.getClass();
        this.rasterColorRangeTransitionState.setValue(transition);
    }

    public final void setRasterColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.rasterColorUseThemeState.setValue(stringValue);
    }

    public final void setRasterContrast(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterContrastState.setValue(doubleValue);
    }

    public final void setRasterContrastTransition(Transition transition) {
        transition.getClass();
        this.rasterContrastTransitionState.setValue(transition);
    }

    public final void setRasterElevation(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterElevationState.setValue(doubleValue);
    }

    public final void setRasterElevationTransition(Transition transition) {
        transition.getClass();
        this.rasterElevationTransitionState.setValue(transition);
    }

    public final void setRasterEmissiveStrength(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterEmissiveStrengthState.setValue(doubleValue);
    }

    public final void setRasterEmissiveStrengthTransition(Transition transition) {
        transition.getClass();
        this.rasterEmissiveStrengthTransitionState.setValue(transition);
    }

    public final void setRasterFadeDuration(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterFadeDurationState.setValue(doubleValue);
    }

    public final void setRasterHueRotate(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterHueRotateState.setValue(doubleValue);
    }

    public final void setRasterHueRotateTransition(Transition transition) {
        transition.getClass();
        this.rasterHueRotateTransitionState.setValue(transition);
    }

    public final void setRasterOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterOpacityState.setValue(doubleValue);
    }

    public final void setRasterOpacityTransition(Transition transition) {
        transition.getClass();
        this.rasterOpacityTransitionState.setValue(transition);
    }

    public final void setRasterResampling(RasterResamplingValue rasterResamplingValue) {
        rasterResamplingValue.getClass();
        this.rasterResamplingState.setValue(rasterResamplingValue);
    }

    public final void setRasterSaturation(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterSaturationState.setValue(doubleValue);
    }

    public final void setRasterSaturationTransition(Transition transition) {
        transition.getClass();
        this.rasterSaturationTransitionState.setValue(transition);
    }

    public final void setSourceLayer(StringValue stringValue) {
        stringValue.getClass();
        this.sourceLayerState.setValue(stringValue);
    }

    public final void setVisibility(VisibilityValue visibilityValue) {
        visibilityValue.getClass();
        this.visibilityState.setValue(visibilityValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RasterLayerState() {
        StringValue stringValue = StringValue.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        Transition transition = Transition.INITIAL;
        ColorValue colorValue = ColorValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        DoubleRangeValue doubleRangeValue = DoubleRangeValue.INITIAL;
        RasterResamplingValue rasterResamplingValue = RasterResamplingValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(stringValue, doubleValue, transition, doubleValue, transition, colorValue, stringValue, doubleListValue, transition, doubleRangeValue, transition, doubleValue, transition, doubleValue, transition, doubleValue, transition, doubleValue, doubleValue, transition, doubleValue, transition, rasterResamplingValue, doubleValue, transition, visibilityValue, longValue, longValue, stringValue, Filter.INITIAL, new LayerInteractionsState());
    }
}
