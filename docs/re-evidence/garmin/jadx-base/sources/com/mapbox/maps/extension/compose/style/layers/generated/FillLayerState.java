package com.mapbox.maps.extension.compose.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.BooleanValue;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.layers.Filter;
import com.mapbox.maps.extension.compose.style.layers.ImageValue;
import com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationOptions;
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
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0003\bÒ\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0006\u0010#\u001a\u00020\r\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\r\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101B\t\b\u0016¢\u0006\u0004\b0\u00102J\u0017\u00108\u001a\u0002052\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R1\u0010A\u001a\u00020.2\u0006\u00109\u001a\u00020.8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u00102\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bC\u0010;\u0012\u0004\bD\u00102R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bE\u0010;\u0012\u0004\bF\u00102R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010;R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010;R \u0010I\u001a\b\u0012\u0004\u0012\u00020\t0B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bI\u0010;\u0012\u0004\bJ\u00102R \u0010K\u001a\b\u0012\u0004\u0012\u00020\u000b0B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bK\u0010;\u0012\u0004\bL\u00102R \u0010M\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bM\u0010;\u0012\u0004\bN\u00102R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\t0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010;R \u0010P\u001a\b\u0012\u0004\u0012\u00020\u000b0B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bP\u0010;\u0012\u0004\bQ\u00102R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010;R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010;R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010;R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010;R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010;R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010;R \u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b0B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bX\u0010;\u0012\u0004\bY\u00102R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010;R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00190B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010;R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010;R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001c0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010;R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010;R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001f0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010;R \u0010`\u001a\b\u0012\u0004\u0012\u00020\t0B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b`\u0010;\u0012\u0004\ba\u00102R \u0010b\u001a\b\u0012\u0004\u0012\u00020\u000b0B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bb\u0010;\u0012\u0004\bc\u00102R \u0010d\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bd\u0010;\u0012\u0004\be\u00102R \u0010f\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bf\u0010;\u0012\u0004\bg\u00102R \u0010h\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bh\u0010;\u0012\u0004\bi\u00102R\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020&0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010;R\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020(0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010;R\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020(0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010;R\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u000b0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010;R\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020,0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010;R1\u0010v\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bs\u00102\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r*\u0004\bt\u0010uR1\u0010}\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b{\u00102\u001a\u0004\bw\u0010x\"\u0004\by\u0010z*\u0004\b|\u0010uR/\u0010\u0083\u0001\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001*\u0005\b\u0082\u0001\u0010uR/\u0010\u0087\u0001\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0084\u0001\u0010p\"\u0005\b\u0085\u0001\u0010r*\u0005\b\u0086\u0001\u0010uR8\u0010\u008e\u0001\u001a\u00020\t2\u0006\u00109\u001a\u00020\t8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\b\u008c\u0001\u00102\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001*\u0005\b\u008d\u0001\u0010uR8\u0010\u0095\u0001\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\b\u0093\u0001\u00102\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001*\u0005\b\u0094\u0001\u0010uR8\u0010\u009c\u0001\u001a\u00020\r2\u0006\u00109\u001a\u00020\r8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\b\u009a\u0001\u00102\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001*\u0005\b\u009b\u0001\u0010uR1\u0010 \u0001\u001a\u00020\t2\u0006\u00109\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009d\u0001\u0010\u0089\u0001\"\u0006\b\u009e\u0001\u0010\u008b\u0001*\u0005\b\u009f\u0001\u0010uR8\u0010¥\u0001\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\b£\u0001\u00102\u001a\u0006\b¡\u0001\u0010\u0090\u0001\"\u0006\b¢\u0001\u0010\u0092\u0001*\u0005\b¤\u0001\u0010uR1\u0010©\u0001\u001a\u00020\r2\u0006\u00109\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¦\u0001\u0010\u0097\u0001\"\u0006\b§\u0001\u0010\u0099\u0001*\u0005\b¨\u0001\u0010uR0\u0010\u00ad\u0001\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0016\u001a\u0005\bª\u0001\u0010\u007f\"\u0006\b«\u0001\u0010\u0081\u0001*\u0005\b¬\u0001\u0010uR1\u0010±\u0001\u001a\u00020\r2\u0006\u00109\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b®\u0001\u0010\u0097\u0001\"\u0006\b¯\u0001\u0010\u0099\u0001*\u0005\b°\u0001\u0010uR0\u0010µ\u0001\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0016\u001a\u0005\b²\u0001\u0010\u007f\"\u0006\b³\u0001\u0010\u0081\u0001*\u0005\b´\u0001\u0010uR1\u0010¹\u0001\u001a\u00020\r2\u0006\u00109\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¶\u0001\u0010\u0097\u0001\"\u0006\b·\u0001\u0010\u0099\u0001*\u0005\b¸\u0001\u0010uR1\u0010½\u0001\u001a\u00020\t2\u0006\u00109\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bº\u0001\u0010\u0089\u0001\"\u0006\b»\u0001\u0010\u008b\u0001*\u0005\b¼\u0001\u0010uR8\u0010Â\u0001\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\bÀ\u0001\u00102\u001a\u0006\b¾\u0001\u0010\u0090\u0001\"\u0006\b¿\u0001\u0010\u0092\u0001*\u0005\bÁ\u0001\u0010uR1\u0010Æ\u0001\u001a\u00020\r2\u0006\u00109\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÃ\u0001\u0010\u0097\u0001\"\u0006\bÄ\u0001\u0010\u0099\u0001*\u0005\bÅ\u0001\u0010uR1\u0010Ì\u0001\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001*\u0005\bË\u0001\u0010uR0\u0010Ð\u0001\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0016\u001a\u0005\bÍ\u0001\u0010\u007f\"\u0006\bÎ\u0001\u0010\u0081\u0001*\u0005\bÏ\u0001\u0010uR1\u0010Ö\u0001\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001*\u0005\bÕ\u0001\u0010uR1\u0010Ú\u0001\u001a\u00020\r2\u0006\u00109\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b×\u0001\u0010\u0097\u0001\"\u0006\bØ\u0001\u0010\u0099\u0001*\u0005\bÙ\u0001\u0010uR1\u0010à\u0001\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001*\u0005\bß\u0001\u0010uR8\u0010å\u0001\u001a\u00020\t2\u0006\u00109\u001a\u00020\t8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\bã\u0001\u00102\u001a\u0006\bá\u0001\u0010\u0089\u0001\"\u0006\bâ\u0001\u0010\u008b\u0001*\u0005\bä\u0001\u0010uR8\u0010ê\u0001\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\bè\u0001\u00102\u001a\u0006\bæ\u0001\u0010\u0090\u0001\"\u0006\bç\u0001\u0010\u0092\u0001*\u0005\bé\u0001\u0010uR8\u0010ï\u0001\u001a\u00020\r2\u0006\u00109\u001a\u00020\r8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\bí\u0001\u00102\u001a\u0006\bë\u0001\u0010\u0097\u0001\"\u0006\bì\u0001\u0010\u0099\u0001*\u0005\bî\u0001\u0010uR7\u0010ô\u0001\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001d\u0012\u0005\bò\u0001\u00102\u001a\u0005\bð\u0001\u0010\u007f\"\u0006\bñ\u0001\u0010\u0081\u0001*\u0005\bó\u0001\u0010uR8\u0010ù\u0001\u001a\u00020\r2\u0006\u00109\u001a\u00020\r8F@FX\u0087\u008e\u0002¢\u0006\u001e\u0012\u0005\b÷\u0001\u00102\u001a\u0006\bõ\u0001\u0010\u0097\u0001\"\u0006\bö\u0001\u0010\u0099\u0001*\u0005\bø\u0001\u0010uR1\u0010ÿ\u0001\u001a\u00020&2\u0006\u00109\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001*\u0005\bþ\u0001\u0010uR1\u0010\u0085\u0002\u001a\u00020(2\u0006\u00109\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002*\u0005\b\u0084\u0002\u0010uR1\u0010\u0089\u0002\u001a\u00020(2\u0006\u00109\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0086\u0002\u0010\u0081\u0002\"\u0006\b\u0087\u0002\u0010\u0083\u0002*\u0005\b\u0088\u0002\u0010uR1\u0010\u008d\u0002\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u008a\u0002\u0010\u0090\u0001\"\u0006\b\u008b\u0002\u0010\u0092\u0001*\u0005\b\u008c\u0002\u0010uR1\u0010\u0093\u0002\u001a\u00020,2\u0006\u00109\u001a\u00020,8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002\"\u0006\b\u0090\u0002\u0010\u0091\u0002*\u0005\b\u0092\u0002\u0010u¨\u0006\u0094\u0002"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/FillLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "initialFillConstructBridgeGuardRail", "Lcom/mapbox/maps/extension/compose/style/layers/generated/FillElevationReferenceValue;", "initialFillElevationReference", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialFillSortKey", "initialFillAntialias", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialFillBridgeGuardRailColor", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialFillBridgeGuardRailColorUseTheme", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialFillBridgeGuardRailColorTransition", "initialFillColor", "initialFillColorUseTheme", "initialFillColorTransition", "initialFillEmissiveStrength", "initialFillEmissiveStrengthTransition", "initialFillOpacity", "initialFillOpacityTransition", "initialFillOutlineColor", "initialFillOutlineColorUseTheme", "initialFillOutlineColorTransition", "Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "initialFillPattern", "initialFillPatternCrossFade", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "initialFillTranslate", "initialFillTranslateTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/FillTranslateAnchorValue;", "initialFillTranslateAnchor", "initialFillTunnelStructureColor", "initialFillTunnelStructureColorUseTheme", "initialFillTunnelStructureColorTransition", "initialFillZOffset", "initialFillZOffsetTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "initialInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/FillElevationReferenceValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/FillTranslateAnchorValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "getInteractionsState$annotations", "interactionsState", "Lp3/p1;", "fillConstructBridgeGuardRailState", "getFillConstructBridgeGuardRailState$annotations", "fillElevationReferenceState", "getFillElevationReferenceState$annotations", "fillSortKeyState", "fillAntialiasState", "fillBridgeGuardRailColorState", "getFillBridgeGuardRailColorState$annotations", "fillBridgeGuardRailColorUseThemeState", "getFillBridgeGuardRailColorUseThemeState$annotations", "fillBridgeGuardRailColorTransitionState", "getFillBridgeGuardRailColorTransitionState$annotations", "fillColorState", "fillColorUseThemeState", "getFillColorUseThemeState$annotations", "fillColorTransitionState", "fillEmissiveStrengthState", "fillEmissiveStrengthTransitionState", "fillOpacityState", "fillOpacityTransitionState", "fillOutlineColorState", "fillOutlineColorUseThemeState", "getFillOutlineColorUseThemeState$annotations", "fillOutlineColorTransitionState", "fillPatternState", "fillPatternCrossFadeState", "fillTranslateState", "fillTranslateTransitionState", "fillTranslateAnchorState", "fillTunnelStructureColorState", "getFillTunnelStructureColorState$annotations", "fillTunnelStructureColorUseThemeState", "getFillTunnelStructureColorUseThemeState$annotations", "fillTunnelStructureColorTransitionState", "getFillTunnelStructureColorTransitionState$annotations", "fillZOffsetState", "getFillZOffsetState$annotations", "fillZOffsetTransitionState", "getFillZOffsetTransitionState$annotations", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "getFillConstructBridgeGuardRail", "()Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "setFillConstructBridgeGuardRail", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;)V", "getFillConstructBridgeGuardRail$annotations", "getFillConstructBridgeGuardRail$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/FillLayerState;)Ljava/lang/Object;", "fillConstructBridgeGuardRail", "getFillElevationReference", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/FillElevationReferenceValue;", "setFillElevationReference", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/FillElevationReferenceValue;)V", "getFillElevationReference$annotations", "getFillElevationReference$delegate", "fillElevationReference", "getFillSortKey", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setFillSortKey", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getFillSortKey$delegate", "fillSortKey", "getFillAntialias", "setFillAntialias", "getFillAntialias$delegate", "fillAntialias", "getFillBridgeGuardRailColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setFillBridgeGuardRailColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getFillBridgeGuardRailColor$annotations", "getFillBridgeGuardRailColor$delegate", "fillBridgeGuardRailColor", "getFillBridgeGuardRailColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setFillBridgeGuardRailColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getFillBridgeGuardRailColorUseTheme$annotations", "getFillBridgeGuardRailColorUseTheme$delegate", "fillBridgeGuardRailColorUseTheme", "getFillBridgeGuardRailColorTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setFillBridgeGuardRailColorTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getFillBridgeGuardRailColorTransition$annotations", "getFillBridgeGuardRailColorTransition$delegate", "fillBridgeGuardRailColorTransition", "getFillColor", "setFillColor", "getFillColor$delegate", "fillColor", "getFillColorUseTheme", "setFillColorUseTheme", "getFillColorUseTheme$annotations", "getFillColorUseTheme$delegate", "fillColorUseTheme", "getFillColorTransition", "setFillColorTransition", "getFillColorTransition$delegate", "fillColorTransition", "getFillEmissiveStrength", "setFillEmissiveStrength", "getFillEmissiveStrength$delegate", "fillEmissiveStrength", "getFillEmissiveStrengthTransition", "setFillEmissiveStrengthTransition", "getFillEmissiveStrengthTransition$delegate", "fillEmissiveStrengthTransition", "getFillOpacity", "setFillOpacity", "getFillOpacity$delegate", "fillOpacity", "getFillOpacityTransition", "setFillOpacityTransition", "getFillOpacityTransition$delegate", "fillOpacityTransition", "getFillOutlineColor", "setFillOutlineColor", "getFillOutlineColor$delegate", "fillOutlineColor", "getFillOutlineColorUseTheme", "setFillOutlineColorUseTheme", "getFillOutlineColorUseTheme$annotations", "getFillOutlineColorUseTheme$delegate", "fillOutlineColorUseTheme", "getFillOutlineColorTransition", "setFillOutlineColorTransition", "getFillOutlineColorTransition$delegate", "fillOutlineColorTransition", "getFillPattern", "()Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "setFillPattern", "(Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;)V", "getFillPattern$delegate", "fillPattern", "getFillPatternCrossFade", "setFillPatternCrossFade", "getFillPatternCrossFade$delegate", "fillPatternCrossFade", "getFillTranslate", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setFillTranslate", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getFillTranslate$delegate", "fillTranslate", "getFillTranslateTransition", "setFillTranslateTransition", "getFillTranslateTransition$delegate", "fillTranslateTransition", "getFillTranslateAnchor", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/FillTranslateAnchorValue;", "setFillTranslateAnchor", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/FillTranslateAnchorValue;)V", "getFillTranslateAnchor$delegate", "fillTranslateAnchor", "getFillTunnelStructureColor", "setFillTunnelStructureColor", "getFillTunnelStructureColor$annotations", "getFillTunnelStructureColor$delegate", "fillTunnelStructureColor", "getFillTunnelStructureColorUseTheme", "setFillTunnelStructureColorUseTheme", "getFillTunnelStructureColorUseTheme$annotations", "getFillTunnelStructureColorUseTheme$delegate", "fillTunnelStructureColorUseTheme", "getFillTunnelStructureColorTransition", "setFillTunnelStructureColorTransition", "getFillTunnelStructureColorTransition$annotations", "getFillTunnelStructureColorTransition$delegate", "fillTunnelStructureColorTransition", "getFillZOffset", "setFillZOffset", "getFillZOffset$annotations", "getFillZOffset$delegate", "fillZOffset", "getFillZOffsetTransition", "setFillZOffsetTransition", "getFillZOffsetTransition$annotations", "getFillZOffsetTransition$delegate", "fillZOffsetTransition", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FillLayerState {
    private final p1<BooleanValue> fillAntialiasState;
    private final p1<ColorValue> fillBridgeGuardRailColorState;
    private final p1<Transition> fillBridgeGuardRailColorTransitionState;
    private final p1<StringValue> fillBridgeGuardRailColorUseThemeState;
    private final p1<ColorValue> fillColorState;
    private final p1<Transition> fillColorTransitionState;
    private final p1<StringValue> fillColorUseThemeState;
    private final p1<BooleanValue> fillConstructBridgeGuardRailState;
    private final p1<FillElevationReferenceValue> fillElevationReferenceState;
    private final p1<DoubleValue> fillEmissiveStrengthState;
    private final p1<Transition> fillEmissiveStrengthTransitionState;
    private final p1<DoubleValue> fillOpacityState;
    private final p1<Transition> fillOpacityTransitionState;
    private final p1<ColorValue> fillOutlineColorState;
    private final p1<Transition> fillOutlineColorTransitionState;
    private final p1<StringValue> fillOutlineColorUseThemeState;
    private final p1<DoubleValue> fillPatternCrossFadeState;
    private final p1<ImageValue> fillPatternState;
    private final p1<DoubleValue> fillSortKeyState;
    private final p1<FillTranslateAnchorValue> fillTranslateAnchorState;
    private final p1<DoubleListValue> fillTranslateState;
    private final p1<Transition> fillTranslateTransitionState;
    private final p1<ColorValue> fillTunnelStructureColorState;
    private final p1<Transition> fillTunnelStructureColorTransitionState;
    private final p1<StringValue> fillTunnelStructureColorUseThemeState;
    private final p1<DoubleValue> fillZOffsetState;
    private final p1<Transition> fillZOffsetTransitionState;
    private final p1<Filter> filterState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private FillLayerState(BooleanValue booleanValue, FillElevationReferenceValue fillElevationReferenceValue, DoubleValue doubleValue, BooleanValue booleanValue2, ColorValue colorValue, StringValue stringValue, Transition transition, ColorValue colorValue2, StringValue stringValue2, Transition transition2, DoubleValue doubleValue2, Transition transition3, DoubleValue doubleValue3, Transition transition4, ColorValue colorValue3, StringValue stringValue3, Transition transition5, ImageValue imageValue, DoubleValue doubleValue4, DoubleListValue doubleListValue, Transition transition6, FillTranslateAnchorValue fillTranslateAnchorValue, ColorValue colorValue4, StringValue stringValue4, Transition transition7, DoubleValue doubleValue5, Transition transition8, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue5, Filter filter, LayerInteractionsState layerInteractionsState) {
        this.interactionsState = p0.n(layerInteractionsState);
        this.fillConstructBridgeGuardRailState = p0.n(booleanValue);
        this.fillElevationReferenceState = p0.n(fillElevationReferenceValue);
        this.fillSortKeyState = p0.n(doubleValue);
        this.fillAntialiasState = p0.n(booleanValue2);
        this.fillBridgeGuardRailColorState = p0.n(colorValue);
        this.fillBridgeGuardRailColorUseThemeState = p0.n(stringValue);
        this.fillBridgeGuardRailColorTransitionState = p0.n(transition);
        this.fillColorState = p0.n(colorValue2);
        this.fillColorUseThemeState = p0.n(stringValue2);
        this.fillColorTransitionState = p0.n(transition2);
        this.fillEmissiveStrengthState = p0.n(doubleValue2);
        this.fillEmissiveStrengthTransitionState = p0.n(transition3);
        this.fillOpacityState = p0.n(doubleValue3);
        this.fillOpacityTransitionState = p0.n(transition4);
        this.fillOutlineColorState = p0.n(colorValue3);
        this.fillOutlineColorUseThemeState = p0.n(stringValue3);
        this.fillOutlineColorTransitionState = p0.n(transition5);
        this.fillPatternState = p0.n(imageValue);
        this.fillPatternCrossFadeState = p0.n(doubleValue4);
        this.fillTranslateState = p0.n(doubleListValue);
        this.fillTranslateTransitionState = p0.n(transition6);
        this.fillTranslateAnchorState = p0.n(fillTranslateAnchorValue);
        this.fillTunnelStructureColorState = p0.n(colorValue4);
        this.fillTunnelStructureColorUseThemeState = p0.n(stringValue4);
        this.fillTunnelStructureColorTransitionState = p0.n(transition7);
        this.fillZOffsetState = p0.n(doubleValue5);
        this.fillZOffsetTransitionState = p0.n(transition8);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue5);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColor$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillBridgeGuardRailColorState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillBridgeGuardRailColorTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillBridgeGuardRailColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillConstructBridgeGuardRail$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillConstructBridgeGuardRailState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillElevationReference$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillElevationReferenceState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillOutlineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillOutlineColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColor$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillTunnelStructureColorState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillTunnelStructureColorTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillTunnelStructureColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffset$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillZOffsetState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffsetTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillZOffsetTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getInteractionsState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(-298559999);
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
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillConstructBridgeGuardRailState, PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillElevationReferenceState, "fill-elevation-reference", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillSortKeyState, PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillAntialiasState, "fill-antialias", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillBridgeGuardRailColorState, PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillBridgeGuardRailColorUseThemeState, PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillBridgeGuardRailColorTransitionState, "fill-bridge-guard-rail-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillColorState, PolygonAnnotationOptions.PROPERTY_FILL_COLOR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillColorUseThemeState, PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillColorTransitionState, "fill-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillEmissiveStrengthState, "fill-emissive-strength", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillEmissiveStrengthTransitionState, "fill-emissive-strength-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillOpacityState, PolygonAnnotationOptions.PROPERTY_FILL_OPACITY, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillOpacityTransitionState, "fill-opacity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillOutlineColorState, PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillOutlineColorUseThemeState, PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillOutlineColorTransitionState, "fill-outline-color-transition", o0VarE, 384);
            PropertyTypesKt.AddImageWhenNotInitial(layerNode, this.fillPatternState, PolygonAnnotationOptions.PROPERTY_FILL_PATTERN, o0VarE, (i15 & 14) | 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillPatternCrossFadeState, "fill-pattern-cross-fade", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillTranslateState, "fill-translate", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillTranslateTransitionState, "fill-translate-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillTranslateAnchorState, "fill-translate-anchor", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillTunnelStructureColorState, PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillTunnelStructureColorUseThemeState, PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillTunnelStructureColorTransitionState, "fill-tunnel-structure-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillZOffsetState, PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillZOffsetTransitionState, "fill-z-offset-transition", o0VarE, 384);
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
        p2VarI0.f135219d = new FillLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final BooleanValue getFillAntialias() {
        return this.fillAntialiasState.getF182175a();
    }

    public final ColorValue getFillBridgeGuardRailColor() {
        return this.fillBridgeGuardRailColorState.getF182175a();
    }

    public final Transition getFillBridgeGuardRailColorTransition() {
        return this.fillBridgeGuardRailColorTransitionState.getF182175a();
    }

    public final StringValue getFillBridgeGuardRailColorUseTheme() {
        return this.fillBridgeGuardRailColorUseThemeState.getF182175a();
    }

    public final ColorValue getFillColor() {
        return this.fillColorState.getF182175a();
    }

    public final Transition getFillColorTransition() {
        return this.fillColorTransitionState.getF182175a();
    }

    public final StringValue getFillColorUseTheme() {
        return this.fillColorUseThemeState.getF182175a();
    }

    public final BooleanValue getFillConstructBridgeGuardRail() {
        return this.fillConstructBridgeGuardRailState.getF182175a();
    }

    public final FillElevationReferenceValue getFillElevationReference() {
        return this.fillElevationReferenceState.getF182175a();
    }

    public final DoubleValue getFillEmissiveStrength() {
        return this.fillEmissiveStrengthState.getF182175a();
    }

    public final Transition getFillEmissiveStrengthTransition() {
        return this.fillEmissiveStrengthTransitionState.getF182175a();
    }

    public final DoubleValue getFillOpacity() {
        return this.fillOpacityState.getF182175a();
    }

    public final Transition getFillOpacityTransition() {
        return this.fillOpacityTransitionState.getF182175a();
    }

    public final ColorValue getFillOutlineColor() {
        return this.fillOutlineColorState.getF182175a();
    }

    public final Transition getFillOutlineColorTransition() {
        return this.fillOutlineColorTransitionState.getF182175a();
    }

    public final StringValue getFillOutlineColorUseTheme() {
        return this.fillOutlineColorUseThemeState.getF182175a();
    }

    public final ImageValue getFillPattern() {
        return this.fillPatternState.getF182175a();
    }

    public final DoubleValue getFillPatternCrossFade() {
        return this.fillPatternCrossFadeState.getF182175a();
    }

    public final DoubleValue getFillSortKey() {
        return this.fillSortKeyState.getF182175a();
    }

    public final DoubleListValue getFillTranslate() {
        return this.fillTranslateState.getF182175a();
    }

    public final FillTranslateAnchorValue getFillTranslateAnchor() {
        return this.fillTranslateAnchorState.getF182175a();
    }

    public final Transition getFillTranslateTransition() {
        return this.fillTranslateTransitionState.getF182175a();
    }

    public final ColorValue getFillTunnelStructureColor() {
        return this.fillTunnelStructureColorState.getF182175a();
    }

    public final Transition getFillTunnelStructureColorTransition() {
        return this.fillTunnelStructureColorTransitionState.getF182175a();
    }

    public final StringValue getFillTunnelStructureColorUseTheme() {
        return this.fillTunnelStructureColorUseThemeState.getF182175a();
    }

    public final DoubleValue getFillZOffset() {
        return this.fillZOffsetState.getF182175a();
    }

    public final Transition getFillZOffsetTransition() {
        return this.fillZOffsetTransitionState.getF182175a();
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

    public final void setFillAntialias(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.fillAntialiasState.setValue(booleanValue);
    }

    public final void setFillBridgeGuardRailColor(ColorValue colorValue) {
        colorValue.getClass();
        this.fillBridgeGuardRailColorState.setValue(colorValue);
    }

    public final void setFillBridgeGuardRailColorTransition(Transition transition) {
        transition.getClass();
        this.fillBridgeGuardRailColorTransitionState.setValue(transition);
    }

    public final void setFillBridgeGuardRailColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.fillBridgeGuardRailColorUseThemeState.setValue(stringValue);
    }

    public final void setFillColor(ColorValue colorValue) {
        colorValue.getClass();
        this.fillColorState.setValue(colorValue);
    }

    public final void setFillColorTransition(Transition transition) {
        transition.getClass();
        this.fillColorTransitionState.setValue(transition);
    }

    public final void setFillColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.fillColorUseThemeState.setValue(stringValue);
    }

    public final void setFillConstructBridgeGuardRail(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.fillConstructBridgeGuardRailState.setValue(booleanValue);
    }

    public final void setFillElevationReference(FillElevationReferenceValue fillElevationReferenceValue) {
        fillElevationReferenceValue.getClass();
        this.fillElevationReferenceState.setValue(fillElevationReferenceValue);
    }

    public final void setFillEmissiveStrength(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillEmissiveStrengthState.setValue(doubleValue);
    }

    public final void setFillEmissiveStrengthTransition(Transition transition) {
        transition.getClass();
        this.fillEmissiveStrengthTransitionState.setValue(transition);
    }

    public final void setFillOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillOpacityState.setValue(doubleValue);
    }

    public final void setFillOpacityTransition(Transition transition) {
        transition.getClass();
        this.fillOpacityTransitionState.setValue(transition);
    }

    public final void setFillOutlineColor(ColorValue colorValue) {
        colorValue.getClass();
        this.fillOutlineColorState.setValue(colorValue);
    }

    public final void setFillOutlineColorTransition(Transition transition) {
        transition.getClass();
        this.fillOutlineColorTransitionState.setValue(transition);
    }

    public final void setFillOutlineColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.fillOutlineColorUseThemeState.setValue(stringValue);
    }

    public final void setFillPattern(ImageValue imageValue) {
        imageValue.getClass();
        this.fillPatternState.setValue(imageValue);
    }

    public final void setFillPatternCrossFade(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillPatternCrossFadeState.setValue(doubleValue);
    }

    public final void setFillSortKey(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillSortKeyState.setValue(doubleValue);
    }

    public final void setFillTranslate(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.fillTranslateState.setValue(doubleListValue);
    }

    public final void setFillTranslateAnchor(FillTranslateAnchorValue fillTranslateAnchorValue) {
        fillTranslateAnchorValue.getClass();
        this.fillTranslateAnchorState.setValue(fillTranslateAnchorValue);
    }

    public final void setFillTranslateTransition(Transition transition) {
        transition.getClass();
        this.fillTranslateTransitionState.setValue(transition);
    }

    public final void setFillTunnelStructureColor(ColorValue colorValue) {
        colorValue.getClass();
        this.fillTunnelStructureColorState.setValue(colorValue);
    }

    public final void setFillTunnelStructureColorTransition(Transition transition) {
        transition.getClass();
        this.fillTunnelStructureColorTransitionState.setValue(transition);
    }

    public final void setFillTunnelStructureColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.fillTunnelStructureColorUseThemeState.setValue(stringValue);
    }

    public final void setFillZOffset(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillZOffsetState.setValue(doubleValue);
    }

    public final void setFillZOffsetTransition(Transition transition) {
        transition.getClass();
        this.fillZOffsetTransitionState.setValue(transition);
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
    public FillLayerState() {
        BooleanValue booleanValue = BooleanValue.INITIAL;
        FillElevationReferenceValue fillElevationReferenceValue = FillElevationReferenceValue.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        Transition transition = Transition.INITIAL;
        ImageValue imageValue = ImageValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        FillTranslateAnchorValue fillTranslateAnchorValue = FillTranslateAnchorValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(booleanValue, fillElevationReferenceValue, doubleValue, booleanValue, colorValue, stringValue, transition, colorValue, stringValue, transition, doubleValue, transition, doubleValue, transition, colorValue, stringValue, transition, imageValue, doubleValue, doubleListValue, transition, fillTranslateAnchorValue, colorValue, stringValue, transition, doubleValue, transition, visibilityValue, longValue, longValue, stringValue, Filter.INITIAL, new LayerInteractionsState());
    }
}
