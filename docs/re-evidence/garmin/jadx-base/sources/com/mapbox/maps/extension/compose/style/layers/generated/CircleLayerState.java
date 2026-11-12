package com.mapbox.maps.extension.compose.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.layers.Filter;
import com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationOptions;
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
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0003\b¶\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0081\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/B\t\b\u0016¢\u0006\u0004\b.\u00100J\u0017\u00106\u001a\u0002032\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R1\u0010?\u001a\u00020,2\u0006\u00107\u001a\u00020,8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b>\u00100\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020@8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bA\u00109\u0012\u0004\bB\u00100R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00109R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00109R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00109R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\t0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00109R \u0010G\u001a\b\u0012\u0004\u0012\u00020\u000b0@8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bG\u00109\u0012\u0004\bH\u00100R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00109R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00109R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00109R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u00109R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u00109R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00120@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00109R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00140@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u00109R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u00109R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u00109R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\t0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u00109R \u0010S\u001a\b\u0012\u0004\u0012\u00020\u000b0@8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bS\u00109\u0012\u0004\bT\u00100R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u00109R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00109R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u00109R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00040@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u00109R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u00109R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001f0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u00109R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u00109R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\"0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u00109R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020$0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u00109R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020&0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u00109R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020&0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u00109R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000b0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u00109R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020*0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u00109R1\u0010i\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bf\u00100\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e*\u0004\bg\u0010hR+\u0010o\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m*\u0004\bn\u0010hR+\u0010s\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bp\u0010k\"\u0004\bq\u0010m*\u0004\br\u0010hR+\u0010y\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bt\u0010u\"\u0004\bv\u0010w*\u0004\bx\u0010hR+\u0010\u007f\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}*\u0004\b~\u0010hR8\u0010\u0086\u0001\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\b\u0084\u0001\u00100\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001*\u0005\b\u0085\u0001\u0010hR/\u0010\u008a\u0001\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0087\u0001\u0010u\"\u0005\b\u0088\u0001\u0010w*\u0005\b\u0089\u0001\u0010hR/\u0010\u008e\u0001\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u008b\u0001\u0010k\"\u0005\b\u008c\u0001\u0010m*\u0005\b\u008d\u0001\u0010hR/\u0010\u0092\u0001\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u008f\u0001\u0010u\"\u0005\b\u0090\u0001\u0010w*\u0005\b\u0091\u0001\u0010hR/\u0010\u0096\u0001\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0093\u0001\u0010k\"\u0005\b\u0094\u0001\u0010m*\u0005\b\u0095\u0001\u0010hR/\u0010\u009a\u0001\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0097\u0001\u0010u\"\u0005\b\u0098\u0001\u0010w*\u0005\b\u0099\u0001\u0010hR1\u0010 \u0001\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001*\u0005\b\u009f\u0001\u0010hR1\u0010¦\u0001\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001*\u0005\b¥\u0001\u0010hR/\u0010ª\u0001\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b§\u0001\u0010k\"\u0005\b¨\u0001\u0010m*\u0005\b©\u0001\u0010hR/\u0010®\u0001\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b«\u0001\u0010u\"\u0005\b¬\u0001\u0010w*\u0005\b\u00ad\u0001\u0010hR/\u0010²\u0001\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¯\u0001\u0010{\"\u0005\b°\u0001\u0010}*\u0005\b±\u0001\u0010hR8\u0010·\u0001\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\bµ\u0001\u00100\u001a\u0006\b³\u0001\u0010\u0081\u0001\"\u0006\b´\u0001\u0010\u0083\u0001*\u0005\b¶\u0001\u0010hR/\u0010»\u0001\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¸\u0001\u0010u\"\u0005\b¹\u0001\u0010w*\u0005\bº\u0001\u0010hR/\u0010¿\u0001\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¼\u0001\u0010k\"\u0005\b½\u0001\u0010m*\u0005\b¾\u0001\u0010hR/\u0010Ã\u0001\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÀ\u0001\u0010u\"\u0005\bÁ\u0001\u0010w*\u0005\bÂ\u0001\u0010hR/\u0010Ç\u0001\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÄ\u0001\u0010k\"\u0005\bÅ\u0001\u0010m*\u0005\bÆ\u0001\u0010hR/\u0010Ë\u0001\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÈ\u0001\u0010u\"\u0005\bÉ\u0001\u0010w*\u0005\bÊ\u0001\u0010hR1\u0010Ñ\u0001\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001*\u0005\bÐ\u0001\u0010hR/\u0010Õ\u0001\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÒ\u0001\u0010u\"\u0005\bÓ\u0001\u0010w*\u0005\bÔ\u0001\u0010hR1\u0010Û\u0001\u001a\u00020\"2\u0006\u00107\u001a\u00020\"8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001*\u0005\bÚ\u0001\u0010hR1\u0010á\u0001\u001a\u00020$2\u0006\u00107\u001a\u00020$8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001*\u0005\bà\u0001\u0010hR1\u0010ç\u0001\u001a\u00020&2\u0006\u00107\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001*\u0005\bæ\u0001\u0010hR1\u0010ë\u0001\u001a\u00020&2\u0006\u00107\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bè\u0001\u0010ã\u0001\"\u0006\bé\u0001\u0010å\u0001*\u0005\bê\u0001\u0010hR1\u0010ï\u0001\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bì\u0001\u0010\u0081\u0001\"\u0006\bí\u0001\u0010\u0083\u0001*\u0005\bî\u0001\u0010hR1\u0010õ\u0001\u001a\u00020*2\u0006\u00107\u001a\u00020*8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001*\u0005\bô\u0001\u0010h¨\u0006ö\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/CircleLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/layers/generated/CircleElevationReferenceValue;", "initialCircleElevationReference", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialCircleSortKey", "initialCircleBlur", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialCircleBlurTransition", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialCircleColor", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialCircleColorUseTheme", "initialCircleColorTransition", "initialCircleEmissiveStrength", "initialCircleEmissiveStrengthTransition", "initialCircleOpacity", "initialCircleOpacityTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/CirclePitchAlignmentValue;", "initialCirclePitchAlignment", "Lcom/mapbox/maps/extension/compose/style/layers/generated/CirclePitchScaleValue;", "initialCirclePitchScale", "initialCircleRadius", "initialCircleRadiusTransition", "initialCircleStrokeColor", "initialCircleStrokeColorUseTheme", "initialCircleStrokeColorTransition", "initialCircleStrokeOpacity", "initialCircleStrokeOpacityTransition", "initialCircleStrokeWidth", "initialCircleStrokeWidthTransition", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "initialCircleTranslate", "initialCircleTranslateTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/CircleTranslateAnchorValue;", "initialCircleTranslateAnchor", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "initialInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/CircleElevationReferenceValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/CirclePitchAlignmentValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/CirclePitchScaleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/CircleTranslateAnchorValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "getInteractionsState$annotations", "interactionsState", "Lp3/p1;", "circleElevationReferenceState", "getCircleElevationReferenceState$annotations", "circleSortKeyState", "circleBlurState", "circleBlurTransitionState", "circleColorState", "circleColorUseThemeState", "getCircleColorUseThemeState$annotations", "circleColorTransitionState", "circleEmissiveStrengthState", "circleEmissiveStrengthTransitionState", "circleOpacityState", "circleOpacityTransitionState", "circlePitchAlignmentState", "circlePitchScaleState", "circleRadiusState", "circleRadiusTransitionState", "circleStrokeColorState", "circleStrokeColorUseThemeState", "getCircleStrokeColorUseThemeState$annotations", "circleStrokeColorTransitionState", "circleStrokeOpacityState", "circleStrokeOpacityTransitionState", "circleStrokeWidthState", "circleStrokeWidthTransitionState", "circleTranslateState", "circleTranslateTransitionState", "circleTranslateAnchorState", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "getCircleElevationReference", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/CircleElevationReferenceValue;", "setCircleElevationReference", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/CircleElevationReferenceValue;)V", "getCircleElevationReference$annotations", "getCircleElevationReference$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/CircleLayerState;)Ljava/lang/Object;", "circleElevationReference", "getCircleSortKey", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setCircleSortKey", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getCircleSortKey$delegate", "circleSortKey", "getCircleBlur", "setCircleBlur", "getCircleBlur$delegate", "circleBlur", "getCircleBlurTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setCircleBlurTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getCircleBlurTransition$delegate", "circleBlurTransition", "getCircleColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setCircleColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getCircleColor$delegate", "circleColor", "getCircleColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setCircleColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getCircleColorUseTheme$annotations", "getCircleColorUseTheme$delegate", "circleColorUseTheme", "getCircleColorTransition", "setCircleColorTransition", "getCircleColorTransition$delegate", "circleColorTransition", "getCircleEmissiveStrength", "setCircleEmissiveStrength", "getCircleEmissiveStrength$delegate", "circleEmissiveStrength", "getCircleEmissiveStrengthTransition", "setCircleEmissiveStrengthTransition", "getCircleEmissiveStrengthTransition$delegate", "circleEmissiveStrengthTransition", "getCircleOpacity", "setCircleOpacity", "getCircleOpacity$delegate", "circleOpacity", "getCircleOpacityTransition", "setCircleOpacityTransition", "getCircleOpacityTransition$delegate", "circleOpacityTransition", "getCirclePitchAlignment", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/CirclePitchAlignmentValue;", "setCirclePitchAlignment", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/CirclePitchAlignmentValue;)V", "getCirclePitchAlignment$delegate", "circlePitchAlignment", "getCirclePitchScale", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/CirclePitchScaleValue;", "setCirclePitchScale", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/CirclePitchScaleValue;)V", "getCirclePitchScale$delegate", "circlePitchScale", "getCircleRadius", "setCircleRadius", "getCircleRadius$delegate", "circleRadius", "getCircleRadiusTransition", "setCircleRadiusTransition", "getCircleRadiusTransition$delegate", "circleRadiusTransition", "getCircleStrokeColor", "setCircleStrokeColor", "getCircleStrokeColor$delegate", "circleStrokeColor", "getCircleStrokeColorUseTheme", "setCircleStrokeColorUseTheme", "getCircleStrokeColorUseTheme$annotations", "getCircleStrokeColorUseTheme$delegate", "circleStrokeColorUseTheme", "getCircleStrokeColorTransition", "setCircleStrokeColorTransition", "getCircleStrokeColorTransition$delegate", "circleStrokeColorTransition", "getCircleStrokeOpacity", "setCircleStrokeOpacity", "getCircleStrokeOpacity$delegate", "circleStrokeOpacity", "getCircleStrokeOpacityTransition", "setCircleStrokeOpacityTransition", "getCircleStrokeOpacityTransition$delegate", "circleStrokeOpacityTransition", "getCircleStrokeWidth", "setCircleStrokeWidth", "getCircleStrokeWidth$delegate", "circleStrokeWidth", "getCircleStrokeWidthTransition", "setCircleStrokeWidthTransition", "getCircleStrokeWidthTransition$delegate", "circleStrokeWidthTransition", "getCircleTranslate", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setCircleTranslate", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getCircleTranslate$delegate", "circleTranslate", "getCircleTranslateTransition", "setCircleTranslateTransition", "getCircleTranslateTransition$delegate", "circleTranslateTransition", "getCircleTranslateAnchor", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/CircleTranslateAnchorValue;", "setCircleTranslateAnchor", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/CircleTranslateAnchorValue;)V", "getCircleTranslateAnchor$delegate", "circleTranslateAnchor", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CircleLayerState {
    private final p1<DoubleValue> circleBlurState;
    private final p1<Transition> circleBlurTransitionState;
    private final p1<ColorValue> circleColorState;
    private final p1<Transition> circleColorTransitionState;
    private final p1<StringValue> circleColorUseThemeState;
    private final p1<CircleElevationReferenceValue> circleElevationReferenceState;
    private final p1<DoubleValue> circleEmissiveStrengthState;
    private final p1<Transition> circleEmissiveStrengthTransitionState;
    private final p1<DoubleValue> circleOpacityState;
    private final p1<Transition> circleOpacityTransitionState;
    private final p1<CirclePitchAlignmentValue> circlePitchAlignmentState;
    private final p1<CirclePitchScaleValue> circlePitchScaleState;
    private final p1<DoubleValue> circleRadiusState;
    private final p1<Transition> circleRadiusTransitionState;
    private final p1<DoubleValue> circleSortKeyState;
    private final p1<ColorValue> circleStrokeColorState;
    private final p1<Transition> circleStrokeColorTransitionState;
    private final p1<StringValue> circleStrokeColorUseThemeState;
    private final p1<DoubleValue> circleStrokeOpacityState;
    private final p1<Transition> circleStrokeOpacityTransitionState;
    private final p1<DoubleValue> circleStrokeWidthState;
    private final p1<Transition> circleStrokeWidthTransitionState;
    private final p1<CircleTranslateAnchorValue> circleTranslateAnchorState;
    private final p1<DoubleListValue> circleTranslateState;
    private final p1<Transition> circleTranslateTransitionState;
    private final p1<Filter> filterState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private CircleLayerState(CircleElevationReferenceValue circleElevationReferenceValue, DoubleValue doubleValue, DoubleValue doubleValue2, Transition transition, ColorValue colorValue, StringValue stringValue, Transition transition2, DoubleValue doubleValue3, Transition transition3, DoubleValue doubleValue4, Transition transition4, CirclePitchAlignmentValue circlePitchAlignmentValue, CirclePitchScaleValue circlePitchScaleValue, DoubleValue doubleValue5, Transition transition5, ColorValue colorValue2, StringValue stringValue2, Transition transition6, DoubleValue doubleValue6, Transition transition7, DoubleValue doubleValue7, Transition transition8, DoubleListValue doubleListValue, Transition transition9, CircleTranslateAnchorValue circleTranslateAnchorValue, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue3, Filter filter, LayerInteractionsState layerInteractionsState) {
        this.interactionsState = p0.n(layerInteractionsState);
        this.circleElevationReferenceState = p0.n(circleElevationReferenceValue);
        this.circleSortKeyState = p0.n(doubleValue);
        this.circleBlurState = p0.n(doubleValue2);
        this.circleBlurTransitionState = p0.n(transition);
        this.circleColorState = p0.n(colorValue);
        this.circleColorUseThemeState = p0.n(stringValue);
        this.circleColorTransitionState = p0.n(transition2);
        this.circleEmissiveStrengthState = p0.n(doubleValue3);
        this.circleEmissiveStrengthTransitionState = p0.n(transition3);
        this.circleOpacityState = p0.n(doubleValue4);
        this.circleOpacityTransitionState = p0.n(transition4);
        this.circlePitchAlignmentState = p0.n(circlePitchAlignmentValue);
        this.circlePitchScaleState = p0.n(circlePitchScaleValue);
        this.circleRadiusState = p0.n(doubleValue5);
        this.circleRadiusTransitionState = p0.n(transition5);
        this.circleStrokeColorState = p0.n(colorValue2);
        this.circleStrokeColorUseThemeState = p0.n(stringValue2);
        this.circleStrokeColorTransitionState = p0.n(transition6);
        this.circleStrokeOpacityState = p0.n(doubleValue6);
        this.circleStrokeOpacityTransitionState = p0.n(transition7);
        this.circleStrokeWidthState = p0.n(doubleValue7);
        this.circleStrokeWidthTransitionState = p0.n(transition8);
        this.circleTranslateState = p0.n(doubleListValue);
        this.circleTranslateTransitionState = p0.n(transition9);
        this.circleTranslateAnchorState = p0.n(circleTranslateAnchorValue);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue3);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getCircleColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleElevationReference$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getCircleElevationReferenceState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleStrokeColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getCircleStrokeColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getInteractionsState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(-49003295);
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
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleElevationReferenceState, "circle-elevation-reference", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleSortKeyState, CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleBlurState, CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleBlurTransitionState, "circle-blur-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleColorState, CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleColorUseThemeState, CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleColorTransitionState, "circle-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleEmissiveStrengthState, "circle-emissive-strength", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleEmissiveStrengthTransitionState, "circle-emissive-strength-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleOpacityState, CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleOpacityTransitionState, "circle-opacity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circlePitchAlignmentState, "circle-pitch-alignment", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circlePitchScaleState, "circle-pitch-scale", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleRadiusState, CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleRadiusTransitionState, "circle-radius-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleStrokeColorState, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleStrokeColorUseThemeState, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleStrokeColorTransitionState, "circle-stroke-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleStrokeOpacityState, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleStrokeOpacityTransitionState, "circle-stroke-opacity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleStrokeWidthState, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleStrokeWidthTransitionState, "circle-stroke-width-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleTranslateState, "circle-translate", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleTranslateTransitionState, "circle-translate-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.circleTranslateAnchorState, "circle-translate-anchor", o0VarE, 384);
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
        p2VarI0.f135219d = new CircleLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final DoubleValue getCircleBlur() {
        return this.circleBlurState.getF182175a();
    }

    public final Transition getCircleBlurTransition() {
        return this.circleBlurTransitionState.getF182175a();
    }

    public final ColorValue getCircleColor() {
        return this.circleColorState.getF182175a();
    }

    public final Transition getCircleColorTransition() {
        return this.circleColorTransitionState.getF182175a();
    }

    public final StringValue getCircleColorUseTheme() {
        return this.circleColorUseThemeState.getF182175a();
    }

    public final CircleElevationReferenceValue getCircleElevationReference() {
        return this.circleElevationReferenceState.getF182175a();
    }

    public final DoubleValue getCircleEmissiveStrength() {
        return this.circleEmissiveStrengthState.getF182175a();
    }

    public final Transition getCircleEmissiveStrengthTransition() {
        return this.circleEmissiveStrengthTransitionState.getF182175a();
    }

    public final DoubleValue getCircleOpacity() {
        return this.circleOpacityState.getF182175a();
    }

    public final Transition getCircleOpacityTransition() {
        return this.circleOpacityTransitionState.getF182175a();
    }

    public final CirclePitchAlignmentValue getCirclePitchAlignment() {
        return this.circlePitchAlignmentState.getF182175a();
    }

    public final CirclePitchScaleValue getCirclePitchScale() {
        return this.circlePitchScaleState.getF182175a();
    }

    public final DoubleValue getCircleRadius() {
        return this.circleRadiusState.getF182175a();
    }

    public final Transition getCircleRadiusTransition() {
        return this.circleRadiusTransitionState.getF182175a();
    }

    public final DoubleValue getCircleSortKey() {
        return this.circleSortKeyState.getF182175a();
    }

    public final ColorValue getCircleStrokeColor() {
        return this.circleStrokeColorState.getF182175a();
    }

    public final Transition getCircleStrokeColorTransition() {
        return this.circleStrokeColorTransitionState.getF182175a();
    }

    public final StringValue getCircleStrokeColorUseTheme() {
        return this.circleStrokeColorUseThemeState.getF182175a();
    }

    public final DoubleValue getCircleStrokeOpacity() {
        return this.circleStrokeOpacityState.getF182175a();
    }

    public final Transition getCircleStrokeOpacityTransition() {
        return this.circleStrokeOpacityTransitionState.getF182175a();
    }

    public final DoubleValue getCircleStrokeWidth() {
        return this.circleStrokeWidthState.getF182175a();
    }

    public final Transition getCircleStrokeWidthTransition() {
        return this.circleStrokeWidthTransitionState.getF182175a();
    }

    public final DoubleListValue getCircleTranslate() {
        return this.circleTranslateState.getF182175a();
    }

    public final CircleTranslateAnchorValue getCircleTranslateAnchor() {
        return this.circleTranslateAnchorState.getF182175a();
    }

    public final Transition getCircleTranslateTransition() {
        return this.circleTranslateTransitionState.getF182175a();
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

    public final StringValue getSourceLayer() {
        return this.sourceLayerState.getF182175a();
    }

    public final VisibilityValue getVisibility() {
        return this.visibilityState.getF182175a();
    }

    public final void setCircleBlur(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.circleBlurState.setValue(doubleValue);
    }

    public final void setCircleBlurTransition(Transition transition) {
        transition.getClass();
        this.circleBlurTransitionState.setValue(transition);
    }

    public final void setCircleColor(ColorValue colorValue) {
        colorValue.getClass();
        this.circleColorState.setValue(colorValue);
    }

    public final void setCircleColorTransition(Transition transition) {
        transition.getClass();
        this.circleColorTransitionState.setValue(transition);
    }

    public final void setCircleColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.circleColorUseThemeState.setValue(stringValue);
    }

    public final void setCircleElevationReference(CircleElevationReferenceValue circleElevationReferenceValue) {
        circleElevationReferenceValue.getClass();
        this.circleElevationReferenceState.setValue(circleElevationReferenceValue);
    }

    public final void setCircleEmissiveStrength(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.circleEmissiveStrengthState.setValue(doubleValue);
    }

    public final void setCircleEmissiveStrengthTransition(Transition transition) {
        transition.getClass();
        this.circleEmissiveStrengthTransitionState.setValue(transition);
    }

    public final void setCircleOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.circleOpacityState.setValue(doubleValue);
    }

    public final void setCircleOpacityTransition(Transition transition) {
        transition.getClass();
        this.circleOpacityTransitionState.setValue(transition);
    }

    public final void setCirclePitchAlignment(CirclePitchAlignmentValue circlePitchAlignmentValue) {
        circlePitchAlignmentValue.getClass();
        this.circlePitchAlignmentState.setValue(circlePitchAlignmentValue);
    }

    public final void setCirclePitchScale(CirclePitchScaleValue circlePitchScaleValue) {
        circlePitchScaleValue.getClass();
        this.circlePitchScaleState.setValue(circlePitchScaleValue);
    }

    public final void setCircleRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.circleRadiusState.setValue(doubleValue);
    }

    public final void setCircleRadiusTransition(Transition transition) {
        transition.getClass();
        this.circleRadiusTransitionState.setValue(transition);
    }

    public final void setCircleSortKey(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.circleSortKeyState.setValue(doubleValue);
    }

    public final void setCircleStrokeColor(ColorValue colorValue) {
        colorValue.getClass();
        this.circleStrokeColorState.setValue(colorValue);
    }

    public final void setCircleStrokeColorTransition(Transition transition) {
        transition.getClass();
        this.circleStrokeColorTransitionState.setValue(transition);
    }

    public final void setCircleStrokeColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.circleStrokeColorUseThemeState.setValue(stringValue);
    }

    public final void setCircleStrokeOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.circleStrokeOpacityState.setValue(doubleValue);
    }

    public final void setCircleStrokeOpacityTransition(Transition transition) {
        transition.getClass();
        this.circleStrokeOpacityTransitionState.setValue(transition);
    }

    public final void setCircleStrokeWidth(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.circleStrokeWidthState.setValue(doubleValue);
    }

    public final void setCircleStrokeWidthTransition(Transition transition) {
        transition.getClass();
        this.circleStrokeWidthTransitionState.setValue(transition);
    }

    public final void setCircleTranslate(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.circleTranslateState.setValue(doubleListValue);
    }

    public final void setCircleTranslateAnchor(CircleTranslateAnchorValue circleTranslateAnchorValue) {
        circleTranslateAnchorValue.getClass();
        this.circleTranslateAnchorState.setValue(circleTranslateAnchorValue);
    }

    public final void setCircleTranslateTransition(Transition transition) {
        transition.getClass();
        this.circleTranslateTransitionState.setValue(transition);
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

    public final void setSourceLayer(StringValue stringValue) {
        stringValue.getClass();
        this.sourceLayerState.setValue(stringValue);
    }

    public final void setVisibility(VisibilityValue visibilityValue) {
        visibilityValue.getClass();
        this.visibilityState.setValue(visibilityValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CircleLayerState() {
        CircleElevationReferenceValue circleElevationReferenceValue = CircleElevationReferenceValue.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        Transition transition = Transition.INITIAL;
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        CirclePitchAlignmentValue circlePitchAlignmentValue = CirclePitchAlignmentValue.INITIAL;
        CirclePitchScaleValue circlePitchScaleValue = CirclePitchScaleValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        CircleTranslateAnchorValue circleTranslateAnchorValue = CircleTranslateAnchorValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(circleElevationReferenceValue, doubleValue, doubleValue, transition, colorValue, stringValue, transition, doubleValue, transition, doubleValue, transition, circlePitchAlignmentValue, circlePitchScaleValue, doubleValue, transition, colorValue, stringValue, transition, doubleValue, transition, doubleValue, transition, doubleListValue, transition, circleTranslateAnchorValue, visibilityValue, longValue, longValue, stringValue, Filter.INITIAL, new LayerInteractionsState());
    }
}
