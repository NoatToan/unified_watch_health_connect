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
import com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState;
import com.mapbox.maps.extension.compose.style.layers.ModelIdValue;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0003\bù\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0099\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\u0016\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020\f\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103B\t\b\u0016¢\u0006\u0004\b2\u00104J\u0017\u0010:\u001a\u0002072\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u0002072\u0006\u00106\u001a\u000205H\u0003¢\u0006\u0004\b;\u00109R1\u0010D\u001a\u0002002\u0006\u0010<\u001a\u0002008F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bC\u00104\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bF\u0010>\u0012\u0004\bG\u00104R \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bH\u0010>\u0012\u0004\bI\u00104R \u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bJ\u0010>\u0012\u0004\bK\u00104R \u0010L\u001a\b\u0012\u0004\u0012\u00020\b0E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bL\u0010>\u0012\u0004\bM\u00104R \u0010N\u001a\b\u0012\u0004\u0012\u00020\n0E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bN\u0010>\u0012\u0004\bO\u00104R \u0010P\u001a\b\u0012\u0004\u0012\u00020\f0E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bP\u0010>\u0012\u0004\bQ\u00104R \u0010R\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bR\u0010>\u0012\u0004\bS\u00104R \u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bT\u0010>\u0012\u0004\bU\u00104R \u0010V\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bV\u0010>\u0012\u0004\bW\u00104R \u0010X\u001a\b\u0012\u0004\u0012\u00020\u00040E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bX\u0010>\u0012\u0004\bY\u00104R \u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00120E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bZ\u0010>\u0012\u0004\b[\u00104R \u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00040E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\\\u0010>\u0012\u0004\b]\u00104R \u0010^\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b^\u0010>\u0012\u0004\b_\u00104R \u0010`\u001a\b\u0012\u0004\u0012\u00020\u00160E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b`\u0010>\u0012\u0004\ba\u00104R \u0010b\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bb\u0010>\u0012\u0004\bc\u00104R \u0010d\u001a\b\u0012\u0004\u0012\u00020\u00040E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bd\u0010>\u0012\u0004\be\u00104R \u0010f\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bf\u0010>\u0012\u0004\bg\u00104R \u0010h\u001a\b\u0012\u0004\u0012\u00020\b0E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bh\u0010>\u0012\u0004\bi\u00104R \u0010j\u001a\b\u0012\u0004\u0012\u00020\u00160E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bj\u0010>\u0012\u0004\bk\u00104R \u0010l\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bl\u0010>\u0012\u0004\bm\u00104R \u0010n\u001a\b\u0012\u0004\u0012\u00020\u00040E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bn\u0010>\u0012\u0004\bo\u00104R \u0010p\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bp\u0010>\u0012\u0004\bq\u00104R \u0010r\u001a\b\u0012\u0004\u0012\u00020\u00160E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\br\u0010>\u0012\u0004\bs\u00104R \u0010t\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bt\u0010>\u0012\u0004\bu\u00104R \u0010v\u001a\b\u0012\u0004\u0012\u00020\"0E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bv\u0010>\u0012\u0004\bw\u00104R \u0010x\u001a\b\u0012\u0004\u0012\u00020\u00160E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bx\u0010>\u0012\u0004\by\u00104R \u0010z\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bz\u0010>\u0012\u0004\b{\u00104R \u0010|\u001a\b\u0012\u0004\u0012\u00020&0E8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b|\u0010>\u0012\u0004\b}\u00104R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020(0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010>R\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020*0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010>R\u001c\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020*0E8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010>R\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\f0E8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010>R\u001c\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020.0E8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010>R9\u0010\u008a\u0001\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u0087\u0001\u00104\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001*\u0006\b\u0088\u0001\u0010\u0089\u0001R9\u0010\u0091\u0001\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u008f\u0001\u00104\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001*\u0006\b\u0090\u0001\u0010\u0089\u0001R9\u0010\u0098\u0001\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u0096\u0001\u00104\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001*\u0006\b\u0097\u0001\u0010\u0089\u0001R9\u0010\u009f\u0001\u001a\u00020\b2\u0006\u0010<\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u009d\u0001\u00104\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001*\u0006\b\u009e\u0001\u0010\u0089\u0001R9\u0010¦\u0001\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n8F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b¤\u0001\u00104\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001*\u0006\b¥\u0001\u0010\u0089\u0001R9\u0010\u00ad\u0001\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f8F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b«\u0001\u00104\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001*\u0006\b¬\u0001\u0010\u0089\u0001R9\u0010²\u0001\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b°\u0001\u00104\u001a\u0006\b®\u0001\u0010\u0093\u0001\"\u0006\b¯\u0001\u0010\u0095\u0001*\u0006\b±\u0001\u0010\u0089\u0001R9\u0010·\u0001\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bµ\u0001\u00104\u001a\u0006\b³\u0001\u0010\u008c\u0001\"\u0006\b´\u0001\u0010\u008e\u0001*\u0006\b¶\u0001\u0010\u0089\u0001R9\u0010¼\u0001\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bº\u0001\u00104\u001a\u0006\b¸\u0001\u0010\u0093\u0001\"\u0006\b¹\u0001\u0010\u0095\u0001*\u0006\b»\u0001\u0010\u0089\u0001R9\u0010Á\u0001\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b¿\u0001\u00104\u001a\u0006\b½\u0001\u0010\u008c\u0001\"\u0006\b¾\u0001\u0010\u008e\u0001*\u0006\bÀ\u0001\u0010\u0089\u0001R9\u0010È\u0001\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u00128F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÆ\u0001\u00104\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001*\u0006\bÇ\u0001\u0010\u0089\u0001R9\u0010Í\u0001\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bË\u0001\u00104\u001a\u0006\bÉ\u0001\u0010\u008c\u0001\"\u0006\bÊ\u0001\u0010\u008e\u0001*\u0006\bÌ\u0001\u0010\u0089\u0001R9\u0010Ò\u0001\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÐ\u0001\u00104\u001a\u0006\bÎ\u0001\u0010\u0093\u0001\"\u0006\bÏ\u0001\u0010\u0095\u0001*\u0006\bÑ\u0001\u0010\u0089\u0001R9\u0010Ù\u0001\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00168F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b×\u0001\u00104\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001*\u0006\bØ\u0001\u0010\u0089\u0001R9\u0010Þ\u0001\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÜ\u0001\u00104\u001a\u0006\bÚ\u0001\u0010\u0093\u0001\"\u0006\bÛ\u0001\u0010\u0095\u0001*\u0006\bÝ\u0001\u0010\u0089\u0001R9\u0010ã\u0001\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bá\u0001\u00104\u001a\u0006\bß\u0001\u0010\u008c\u0001\"\u0006\bà\u0001\u0010\u008e\u0001*\u0006\bâ\u0001\u0010\u0089\u0001R9\u0010è\u0001\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bæ\u0001\u00104\u001a\u0006\bä\u0001\u0010\u0093\u0001\"\u0006\bå\u0001\u0010\u0095\u0001*\u0006\bç\u0001\u0010\u0089\u0001R9\u0010í\u0001\u001a\u00020\b2\u0006\u0010<\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bë\u0001\u00104\u001a\u0006\bé\u0001\u0010\u009a\u0001\"\u0006\bê\u0001\u0010\u009c\u0001*\u0006\bì\u0001\u0010\u0089\u0001R9\u0010ò\u0001\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00168F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bð\u0001\u00104\u001a\u0006\bî\u0001\u0010Ô\u0001\"\u0006\bï\u0001\u0010Ö\u0001*\u0006\bñ\u0001\u0010\u0089\u0001R9\u0010÷\u0001\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bõ\u0001\u00104\u001a\u0006\bó\u0001\u0010\u0093\u0001\"\u0006\bô\u0001\u0010\u0095\u0001*\u0006\bö\u0001\u0010\u0089\u0001R9\u0010ü\u0001\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bú\u0001\u00104\u001a\u0006\bø\u0001\u0010\u008c\u0001\"\u0006\bù\u0001\u0010\u008e\u0001*\u0006\bû\u0001\u0010\u0089\u0001R9\u0010\u0081\u0002\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÿ\u0001\u00104\u001a\u0006\bý\u0001\u0010\u0093\u0001\"\u0006\bþ\u0001\u0010\u0095\u0001*\u0006\b\u0080\u0002\u0010\u0089\u0001R9\u0010\u0086\u0002\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00168F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u0084\u0002\u00104\u001a\u0006\b\u0082\u0002\u0010Ô\u0001\"\u0006\b\u0083\u0002\u0010Ö\u0001*\u0006\b\u0085\u0002\u0010\u0089\u0001R9\u0010\u008b\u0002\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u0089\u0002\u00104\u001a\u0006\b\u0087\u0002\u0010\u0093\u0001\"\u0006\b\u0088\u0002\u0010\u0095\u0001*\u0006\b\u008a\u0002\u0010\u0089\u0001R9\u0010\u0092\u0002\u001a\u00020\"2\u0006\u0010<\u001a\u00020\"8F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u0090\u0002\u00104\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002\"\u0006\b\u008e\u0002\u0010\u008f\u0002*\u0006\b\u0091\u0002\u0010\u0089\u0001R9\u0010\u0097\u0002\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00168F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u0095\u0002\u00104\u001a\u0006\b\u0093\u0002\u0010Ô\u0001\"\u0006\b\u0094\u0002\u0010Ö\u0001*\u0006\b\u0096\u0002\u0010\u0089\u0001R9\u0010\u009c\u0002\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u009a\u0002\u00104\u001a\u0006\b\u0098\u0002\u0010\u0093\u0001\"\u0006\b\u0099\u0002\u0010\u0095\u0001*\u0006\b\u009b\u0002\u0010\u0089\u0001R9\u0010£\u0002\u001a\u00020&2\u0006\u0010<\u001a\u00020&8F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b¡\u0002\u00104\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002\"\u0006\b\u009f\u0002\u0010 \u0002*\u0006\b¢\u0002\u0010\u0089\u0001R2\u0010©\u0002\u001a\u00020(2\u0006\u0010<\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b¦\u0002\u0010§\u0002*\u0006\b¨\u0002\u0010\u0089\u0001R2\u0010¯\u0002\u001a\u00020*2\u0006\u0010<\u001a\u00020*8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bª\u0002\u0010«\u0002\"\u0006\b¬\u0002\u0010\u00ad\u0002*\u0006\b®\u0002\u0010\u0089\u0001R2\u0010³\u0002\u001a\u00020*2\u0006\u0010<\u001a\u00020*8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b°\u0002\u0010«\u0002\"\u0006\b±\u0002\u0010\u00ad\u0002*\u0006\b²\u0002\u0010\u0089\u0001R2\u0010·\u0002\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b´\u0002\u0010¨\u0001\"\u0006\bµ\u0002\u0010ª\u0001*\u0006\b¶\u0002\u0010\u0089\u0001R2\u0010½\u0002\u001a\u00020.2\u0006\u0010<\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002*\u0006\b¼\u0002\u0010\u0089\u0001¨\u0006¾\u0002"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/layers/ModelIdValue;", "initialModelId", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialModelAmbientOcclusionIntensity", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialModelAmbientOcclusionIntensityTransition", "Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "initialModelCastShadows", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialModelColor", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialModelColorUseTheme", "initialModelColorTransition", "initialModelColorMixIntensity", "initialModelColorMixIntensityTransition", "initialModelCutoffFadeRange", "Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelElevationReferenceValue;", "initialModelElevationReference", "initialModelEmissiveStrength", "initialModelEmissiveStrengthTransition", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "initialModelHeightBasedEmissiveStrengthMultiplier", "initialModelHeightBasedEmissiveStrengthMultiplierTransition", "initialModelOpacity", "initialModelOpacityTransition", "initialModelReceiveShadows", "initialModelRotation", "initialModelRotationTransition", "initialModelRoughness", "initialModelRoughnessTransition", "initialModelScale", "initialModelScaleTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelScaleModeValue;", "initialModelScaleMode", "initialModelTranslation", "initialModelTranslationTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelTypeValue;", "initialModelType", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "initialInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/layers/ModelIdValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelElevationReferenceValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelScaleModeValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelTypeValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "UpdateModelId", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "getInteractionsState$annotations", "interactionsState", "Lp3/p1;", "modelIdState", "getModelIdState$annotations", "modelAmbientOcclusionIntensityState", "getModelAmbientOcclusionIntensityState$annotations", "modelAmbientOcclusionIntensityTransitionState", "getModelAmbientOcclusionIntensityTransitionState$annotations", "modelCastShadowsState", "getModelCastShadowsState$annotations", "modelColorState", "getModelColorState$annotations", "modelColorUseThemeState", "getModelColorUseThemeState$annotations", "modelColorTransitionState", "getModelColorTransitionState$annotations", "modelColorMixIntensityState", "getModelColorMixIntensityState$annotations", "modelColorMixIntensityTransitionState", "getModelColorMixIntensityTransitionState$annotations", "modelCutoffFadeRangeState", "getModelCutoffFadeRangeState$annotations", "modelElevationReferenceState", "getModelElevationReferenceState$annotations", "modelEmissiveStrengthState", "getModelEmissiveStrengthState$annotations", "modelEmissiveStrengthTransitionState", "getModelEmissiveStrengthTransitionState$annotations", "modelHeightBasedEmissiveStrengthMultiplierState", "getModelHeightBasedEmissiveStrengthMultiplierState$annotations", "modelHeightBasedEmissiveStrengthMultiplierTransitionState", "getModelHeightBasedEmissiveStrengthMultiplierTransitionState$annotations", "modelOpacityState", "getModelOpacityState$annotations", "modelOpacityTransitionState", "getModelOpacityTransitionState$annotations", "modelReceiveShadowsState", "getModelReceiveShadowsState$annotations", "modelRotationState", "getModelRotationState$annotations", "modelRotationTransitionState", "getModelRotationTransitionState$annotations", "modelRoughnessState", "getModelRoughnessState$annotations", "modelRoughnessTransitionState", "getModelRoughnessTransitionState$annotations", "modelScaleState", "getModelScaleState$annotations", "modelScaleTransitionState", "getModelScaleTransitionState$annotations", "modelScaleModeState", "getModelScaleModeState$annotations", "modelTranslationState", "getModelTranslationState$annotations", "modelTranslationTransitionState", "getModelTranslationTransitionState$annotations", "modelTypeState", "getModelTypeState$annotations", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "getModelId", "()Lcom/mapbox/maps/extension/compose/style/layers/ModelIdValue;", "setModelId", "(Lcom/mapbox/maps/extension/compose/style/layers/ModelIdValue;)V", "getModelId$annotations", "getModelId$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelLayerState;)Ljava/lang/Object;", "modelId", "getModelAmbientOcclusionIntensity", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setModelAmbientOcclusionIntensity", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getModelAmbientOcclusionIntensity$annotations", "getModelAmbientOcclusionIntensity$delegate", "modelAmbientOcclusionIntensity", "getModelAmbientOcclusionIntensityTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setModelAmbientOcclusionIntensityTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getModelAmbientOcclusionIntensityTransition$annotations", "getModelAmbientOcclusionIntensityTransition$delegate", "modelAmbientOcclusionIntensityTransition", "getModelCastShadows", "()Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "setModelCastShadows", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;)V", "getModelCastShadows$annotations", "getModelCastShadows$delegate", "modelCastShadows", "getModelColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setModelColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getModelColor$annotations", "getModelColor$delegate", "modelColor", "getModelColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setModelColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getModelColorUseTheme$annotations", "getModelColorUseTheme$delegate", "modelColorUseTheme", "getModelColorTransition", "setModelColorTransition", "getModelColorTransition$annotations", "getModelColorTransition$delegate", "modelColorTransition", "getModelColorMixIntensity", "setModelColorMixIntensity", "getModelColorMixIntensity$annotations", "getModelColorMixIntensity$delegate", "modelColorMixIntensity", "getModelColorMixIntensityTransition", "setModelColorMixIntensityTransition", "getModelColorMixIntensityTransition$annotations", "getModelColorMixIntensityTransition$delegate", "modelColorMixIntensityTransition", "getModelCutoffFadeRange", "setModelCutoffFadeRange", "getModelCutoffFadeRange$annotations", "getModelCutoffFadeRange$delegate", "modelCutoffFadeRange", "getModelElevationReference", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelElevationReferenceValue;", "setModelElevationReference", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelElevationReferenceValue;)V", "getModelElevationReference$annotations", "getModelElevationReference$delegate", "modelElevationReference", "getModelEmissiveStrength", "setModelEmissiveStrength", "getModelEmissiveStrength$annotations", "getModelEmissiveStrength$delegate", "modelEmissiveStrength", "getModelEmissiveStrengthTransition", "setModelEmissiveStrengthTransition", "getModelEmissiveStrengthTransition$annotations", "getModelEmissiveStrengthTransition$delegate", "modelEmissiveStrengthTransition", "getModelHeightBasedEmissiveStrengthMultiplier", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setModelHeightBasedEmissiveStrengthMultiplier", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getModelHeightBasedEmissiveStrengthMultiplier$annotations", "getModelHeightBasedEmissiveStrengthMultiplier$delegate", "modelHeightBasedEmissiveStrengthMultiplier", "getModelHeightBasedEmissiveStrengthMultiplierTransition", "setModelHeightBasedEmissiveStrengthMultiplierTransition", "getModelHeightBasedEmissiveStrengthMultiplierTransition$annotations", "getModelHeightBasedEmissiveStrengthMultiplierTransition$delegate", "modelHeightBasedEmissiveStrengthMultiplierTransition", "getModelOpacity", "setModelOpacity", "getModelOpacity$annotations", "getModelOpacity$delegate", "modelOpacity", "getModelOpacityTransition", "setModelOpacityTransition", "getModelOpacityTransition$annotations", "getModelOpacityTransition$delegate", "modelOpacityTransition", "getModelReceiveShadows", "setModelReceiveShadows", "getModelReceiveShadows$annotations", "getModelReceiveShadows$delegate", "modelReceiveShadows", "getModelRotation", "setModelRotation", "getModelRotation$annotations", "getModelRotation$delegate", "modelRotation", "getModelRotationTransition", "setModelRotationTransition", "getModelRotationTransition$annotations", "getModelRotationTransition$delegate", "modelRotationTransition", "getModelRoughness", "setModelRoughness", "getModelRoughness$annotations", "getModelRoughness$delegate", "modelRoughness", "getModelRoughnessTransition", "setModelRoughnessTransition", "getModelRoughnessTransition$annotations", "getModelRoughnessTransition$delegate", "modelRoughnessTransition", "getModelScale", "setModelScale", "getModelScale$annotations", "getModelScale$delegate", "modelScale", "getModelScaleTransition", "setModelScaleTransition", "getModelScaleTransition$annotations", "getModelScaleTransition$delegate", "modelScaleTransition", "getModelScaleMode", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelScaleModeValue;", "setModelScaleMode", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelScaleModeValue;)V", "getModelScaleMode$annotations", "getModelScaleMode$delegate", "modelScaleMode", "getModelTranslation", "setModelTranslation", "getModelTranslation$annotations", "getModelTranslation$delegate", "modelTranslation", "getModelTranslationTransition", "setModelTranslationTransition", "getModelTranslationTransition$annotations", "getModelTranslationTransition$delegate", "modelTranslationTransition", "getModelType", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelTypeValue;", "setModelType", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/ModelTypeValue;)V", "getModelType$annotations", "getModelType$delegate", "modelType", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class ModelLayerState {
    private final p1<Filter> filterState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<DoubleValue> modelAmbientOcclusionIntensityState;
    private final p1<Transition> modelAmbientOcclusionIntensityTransitionState;
    private final p1<BooleanValue> modelCastShadowsState;
    private final p1<DoubleValue> modelColorMixIntensityState;
    private final p1<Transition> modelColorMixIntensityTransitionState;
    private final p1<ColorValue> modelColorState;
    private final p1<Transition> modelColorTransitionState;
    private final p1<StringValue> modelColorUseThemeState;
    private final p1<DoubleValue> modelCutoffFadeRangeState;
    private final p1<ModelElevationReferenceValue> modelElevationReferenceState;
    private final p1<DoubleValue> modelEmissiveStrengthState;
    private final p1<Transition> modelEmissiveStrengthTransitionState;
    private final p1<DoubleListValue> modelHeightBasedEmissiveStrengthMultiplierState;
    private final p1<Transition> modelHeightBasedEmissiveStrengthMultiplierTransitionState;
    private final p1<ModelIdValue> modelIdState;
    private final p1<DoubleValue> modelOpacityState;
    private final p1<Transition> modelOpacityTransitionState;
    private final p1<BooleanValue> modelReceiveShadowsState;
    private final p1<DoubleListValue> modelRotationState;
    private final p1<Transition> modelRotationTransitionState;
    private final p1<DoubleValue> modelRoughnessState;
    private final p1<Transition> modelRoughnessTransitionState;
    private final p1<ModelScaleModeValue> modelScaleModeState;
    private final p1<DoubleListValue> modelScaleState;
    private final p1<Transition> modelScaleTransitionState;
    private final p1<DoubleListValue> modelTranslationState;
    private final p1<Transition> modelTranslationTransitionState;
    private final p1<ModelTypeValue> modelTypeState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private ModelLayerState(ModelIdValue modelIdValue, DoubleValue doubleValue, Transition transition, BooleanValue booleanValue, ColorValue colorValue, StringValue stringValue, Transition transition2, DoubleValue doubleValue2, Transition transition3, DoubleValue doubleValue3, ModelElevationReferenceValue modelElevationReferenceValue, DoubleValue doubleValue4, Transition transition4, DoubleListValue doubleListValue, Transition transition5, DoubleValue doubleValue5, Transition transition6, BooleanValue booleanValue2, DoubleListValue doubleListValue2, Transition transition7, DoubleValue doubleValue6, Transition transition8, DoubleListValue doubleListValue3, Transition transition9, ModelScaleModeValue modelScaleModeValue, DoubleListValue doubleListValue4, Transition transition10, ModelTypeValue modelTypeValue, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue2, Filter filter, LayerInteractionsState layerInteractionsState) {
        this.interactionsState = p0.n(layerInteractionsState);
        this.modelIdState = p0.n(modelIdValue);
        this.modelAmbientOcclusionIntensityState = p0.n(doubleValue);
        this.modelAmbientOcclusionIntensityTransitionState = p0.n(transition);
        this.modelCastShadowsState = p0.n(booleanValue);
        this.modelColorState = p0.n(colorValue);
        this.modelColorUseThemeState = p0.n(stringValue);
        this.modelColorTransitionState = p0.n(transition2);
        this.modelColorMixIntensityState = p0.n(doubleValue2);
        this.modelColorMixIntensityTransitionState = p0.n(transition3);
        this.modelCutoffFadeRangeState = p0.n(doubleValue3);
        this.modelElevationReferenceState = p0.n(modelElevationReferenceValue);
        this.modelEmissiveStrengthState = p0.n(doubleValue4);
        this.modelEmissiveStrengthTransitionState = p0.n(transition4);
        this.modelHeightBasedEmissiveStrengthMultiplierState = p0.n(doubleListValue);
        this.modelHeightBasedEmissiveStrengthMultiplierTransitionState = p0.n(transition5);
        this.modelOpacityState = p0.n(doubleValue5);
        this.modelOpacityTransitionState = p0.n(transition6);
        this.modelReceiveShadowsState = p0.n(booleanValue2);
        this.modelRotationState = p0.n(doubleListValue2);
        this.modelRotationTransitionState = p0.n(transition7);
        this.modelRoughnessState = p0.n(doubleValue6);
        this.modelRoughnessTransitionState = p0.n(transition8);
        this.modelScaleState = p0.n(doubleListValue3);
        this.modelScaleTransitionState = p0.n(transition9);
        this.modelScaleModeState = p0.n(modelScaleModeValue);
        this.modelTranslationState = p0.n(doubleListValue4);
        this.modelTranslationTransitionState = p0.n(transition10);
        this.modelTypeState = p0.n(modelTypeValue);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue2);
        this.filterState = p0.n(filter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateModelId(LayerNode layerNode, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(874148854);
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
            if (getModelId().getNotInitial$extension_compose_release()) {
                p<String, String> modelInfo = getModelId().getModelInfo();
                if (modelInfo != null) {
                    layerNode.addModel$extension_compose_release(modelInfo);
                }
                layerNode.setProperty$extension_compose_release("model-id", getModelId().getValue());
            }
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(layerNode, i14);
    }

    @MapboxExperimental
    public static /* synthetic */ void getInteractionsState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelAmbientOcclusionIntensity$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelAmbientOcclusionIntensityState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelAmbientOcclusionIntensityTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelAmbientOcclusionIntensityTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelCastShadows$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelCastShadowsState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorMixIntensity$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelColorMixIntensityState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorMixIntensityTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelColorMixIntensityTransitionState$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelColorState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelColorTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelCutoffFadeRange$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelCutoffFadeRangeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelElevationReference$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelElevationReferenceState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelEmissiveStrength$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelEmissiveStrengthState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelEmissiveStrengthTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelEmissiveStrengthTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelHeightBasedEmissiveStrengthMultiplier$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelHeightBasedEmissiveStrengthMultiplierState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelHeightBasedEmissiveStrengthMultiplierTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelHeightBasedEmissiveStrengthMultiplierTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelId$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelIdState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelOpacity$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelOpacityState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelOpacityTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelOpacityTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelReceiveShadows$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelReceiveShadowsState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelRotation$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelRotationState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelRotationTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelRotationTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelRoughness$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelRoughnessState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelRoughnessTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelRoughnessTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelScale$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelScaleMode$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelScaleModeState$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelScaleState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelScaleTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelScaleTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelTranslation$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelTranslationState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelTranslationTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelTranslationTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelType$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getModelTypeState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(924079635);
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
            UpdateModelId(layerNode, o0VarE, i15 & 126);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelAmbientOcclusionIntensityState, "model-ambient-occlusion-intensity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelAmbientOcclusionIntensityTransitionState, "model-ambient-occlusion-intensity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelCastShadowsState, "model-cast-shadows", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelColorState, "model-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelColorUseThemeState, "model-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelColorTransitionState, "model-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelColorMixIntensityState, "model-color-mix-intensity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelColorMixIntensityTransitionState, "model-color-mix-intensity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelCutoffFadeRangeState, "model-cutoff-fade-range", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelElevationReferenceState, "model-elevation-reference", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelEmissiveStrengthState, "model-emissive-strength", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelEmissiveStrengthTransitionState, "model-emissive-strength-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelHeightBasedEmissiveStrengthMultiplierState, "model-height-based-emissive-strength-multiplier", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelHeightBasedEmissiveStrengthMultiplierTransitionState, "model-height-based-emissive-strength-multiplier-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelOpacityState, "model-opacity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelOpacityTransitionState, "model-opacity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelReceiveShadowsState, "model-receive-shadows", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelRotationState, "model-rotation", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelRotationTransitionState, "model-rotation-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelRoughnessState, "model-roughness", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelRoughnessTransitionState, "model-roughness-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelScaleState, "model-scale", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelScaleTransitionState, "model-scale-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelScaleModeState, "model-scale-mode", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelTranslationState, "model-translation", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelTranslationTransitionState, "model-translation-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.modelTypeState, "model-type", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.visibilityState, "visibility", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.minZoomState, "minzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.maxZoomState, "maxzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.sourceLayerState, "source-layer", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) layerNode.getSetPropertyAction$extension_compose_release(), this.filterState, "filter", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new ModelLayerState$UpdateProperties$1(this, layerNode, i14);
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

    public final DoubleValue getModelAmbientOcclusionIntensity() {
        return this.modelAmbientOcclusionIntensityState.getF182175a();
    }

    public final Transition getModelAmbientOcclusionIntensityTransition() {
        return this.modelAmbientOcclusionIntensityTransitionState.getF182175a();
    }

    public final BooleanValue getModelCastShadows() {
        return this.modelCastShadowsState.getF182175a();
    }

    public final ColorValue getModelColor() {
        return this.modelColorState.getF182175a();
    }

    public final DoubleValue getModelColorMixIntensity() {
        return this.modelColorMixIntensityState.getF182175a();
    }

    public final Transition getModelColorMixIntensityTransition() {
        return this.modelColorMixIntensityTransitionState.getF182175a();
    }

    public final Transition getModelColorTransition() {
        return this.modelColorTransitionState.getF182175a();
    }

    public final StringValue getModelColorUseTheme() {
        return this.modelColorUseThemeState.getF182175a();
    }

    public final DoubleValue getModelCutoffFadeRange() {
        return this.modelCutoffFadeRangeState.getF182175a();
    }

    public final ModelElevationReferenceValue getModelElevationReference() {
        return this.modelElevationReferenceState.getF182175a();
    }

    public final DoubleValue getModelEmissiveStrength() {
        return this.modelEmissiveStrengthState.getF182175a();
    }

    public final Transition getModelEmissiveStrengthTransition() {
        return this.modelEmissiveStrengthTransitionState.getF182175a();
    }

    public final DoubleListValue getModelHeightBasedEmissiveStrengthMultiplier() {
        return this.modelHeightBasedEmissiveStrengthMultiplierState.getF182175a();
    }

    public final Transition getModelHeightBasedEmissiveStrengthMultiplierTransition() {
        return this.modelHeightBasedEmissiveStrengthMultiplierTransitionState.getF182175a();
    }

    public final ModelIdValue getModelId() {
        return this.modelIdState.getF182175a();
    }

    public final DoubleValue getModelOpacity() {
        return this.modelOpacityState.getF182175a();
    }

    public final Transition getModelOpacityTransition() {
        return this.modelOpacityTransitionState.getF182175a();
    }

    public final BooleanValue getModelReceiveShadows() {
        return this.modelReceiveShadowsState.getF182175a();
    }

    public final DoubleListValue getModelRotation() {
        return this.modelRotationState.getF182175a();
    }

    public final Transition getModelRotationTransition() {
        return this.modelRotationTransitionState.getF182175a();
    }

    public final DoubleValue getModelRoughness() {
        return this.modelRoughnessState.getF182175a();
    }

    public final Transition getModelRoughnessTransition() {
        return this.modelRoughnessTransitionState.getF182175a();
    }

    public final DoubleListValue getModelScale() {
        return this.modelScaleState.getF182175a();
    }

    public final ModelScaleModeValue getModelScaleMode() {
        return this.modelScaleModeState.getF182175a();
    }

    public final Transition getModelScaleTransition() {
        return this.modelScaleTransitionState.getF182175a();
    }

    public final DoubleListValue getModelTranslation() {
        return this.modelTranslationState.getF182175a();
    }

    public final Transition getModelTranslationTransition() {
        return this.modelTranslationTransitionState.getF182175a();
    }

    public final ModelTypeValue getModelType() {
        return this.modelTypeState.getF182175a();
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

    public final void setModelAmbientOcclusionIntensity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.modelAmbientOcclusionIntensityState.setValue(doubleValue);
    }

    public final void setModelAmbientOcclusionIntensityTransition(Transition transition) {
        transition.getClass();
        this.modelAmbientOcclusionIntensityTransitionState.setValue(transition);
    }

    public final void setModelCastShadows(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.modelCastShadowsState.setValue(booleanValue);
    }

    public final void setModelColor(ColorValue colorValue) {
        colorValue.getClass();
        this.modelColorState.setValue(colorValue);
    }

    public final void setModelColorMixIntensity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.modelColorMixIntensityState.setValue(doubleValue);
    }

    public final void setModelColorMixIntensityTransition(Transition transition) {
        transition.getClass();
        this.modelColorMixIntensityTransitionState.setValue(transition);
    }

    public final void setModelColorTransition(Transition transition) {
        transition.getClass();
        this.modelColorTransitionState.setValue(transition);
    }

    public final void setModelColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.modelColorUseThemeState.setValue(stringValue);
    }

    public final void setModelCutoffFadeRange(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.modelCutoffFadeRangeState.setValue(doubleValue);
    }

    public final void setModelElevationReference(ModelElevationReferenceValue modelElevationReferenceValue) {
        modelElevationReferenceValue.getClass();
        this.modelElevationReferenceState.setValue(modelElevationReferenceValue);
    }

    public final void setModelEmissiveStrength(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.modelEmissiveStrengthState.setValue(doubleValue);
    }

    public final void setModelEmissiveStrengthTransition(Transition transition) {
        transition.getClass();
        this.modelEmissiveStrengthTransitionState.setValue(transition);
    }

    public final void setModelHeightBasedEmissiveStrengthMultiplier(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.modelHeightBasedEmissiveStrengthMultiplierState.setValue(doubleListValue);
    }

    public final void setModelHeightBasedEmissiveStrengthMultiplierTransition(Transition transition) {
        transition.getClass();
        this.modelHeightBasedEmissiveStrengthMultiplierTransitionState.setValue(transition);
    }

    public final void setModelId(ModelIdValue modelIdValue) {
        modelIdValue.getClass();
        this.modelIdState.setValue(modelIdValue);
    }

    public final void setModelOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.modelOpacityState.setValue(doubleValue);
    }

    public final void setModelOpacityTransition(Transition transition) {
        transition.getClass();
        this.modelOpacityTransitionState.setValue(transition);
    }

    public final void setModelReceiveShadows(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.modelReceiveShadowsState.setValue(booleanValue);
    }

    public final void setModelRotation(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.modelRotationState.setValue(doubleListValue);
    }

    public final void setModelRotationTransition(Transition transition) {
        transition.getClass();
        this.modelRotationTransitionState.setValue(transition);
    }

    public final void setModelRoughness(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.modelRoughnessState.setValue(doubleValue);
    }

    public final void setModelRoughnessTransition(Transition transition) {
        transition.getClass();
        this.modelRoughnessTransitionState.setValue(transition);
    }

    public final void setModelScale(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.modelScaleState.setValue(doubleListValue);
    }

    public final void setModelScaleMode(ModelScaleModeValue modelScaleModeValue) {
        modelScaleModeValue.getClass();
        this.modelScaleModeState.setValue(modelScaleModeValue);
    }

    public final void setModelScaleTransition(Transition transition) {
        transition.getClass();
        this.modelScaleTransitionState.setValue(transition);
    }

    public final void setModelTranslation(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.modelTranslationState.setValue(doubleListValue);
    }

    public final void setModelTranslationTransition(Transition transition) {
        transition.getClass();
        this.modelTranslationTransitionState.setValue(transition);
    }

    public final void setModelType(ModelTypeValue modelTypeValue) {
        modelTypeValue.getClass();
        this.modelTypeState.setValue(modelTypeValue);
    }

    public final void setSourceLayer(StringValue stringValue) {
        stringValue.getClass();
        this.sourceLayerState.setValue(stringValue);
    }

    public final void setVisibility(VisibilityValue visibilityValue) {
        visibilityValue.getClass();
        this.visibilityState.setValue(visibilityValue);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.layers.generated.ModelLayerState$UpdateModelId$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements e23.p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ LayerNode $layerNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LayerNode layerNode, int i14) {
            super(2);
            this.$layerNode = layerNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            ModelLayerState.this.UpdateModelId(this.$layerNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ModelLayerState() {
        ModelIdValue modelIdValue = ModelIdValue.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        Transition transition = Transition.INITIAL;
        BooleanValue booleanValue = BooleanValue.INITIAL;
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        ModelElevationReferenceValue modelElevationReferenceValue = ModelElevationReferenceValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        ModelScaleModeValue modelScaleModeValue = ModelScaleModeValue.INITIAL;
        ModelTypeValue modelTypeValue = ModelTypeValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(modelIdValue, doubleValue, transition, booleanValue, colorValue, stringValue, transition, doubleValue, transition, doubleValue, modelElevationReferenceValue, doubleValue, transition, doubleListValue, transition, doubleValue, transition, booleanValue, doubleListValue, transition, doubleValue, transition, doubleListValue, transition, modelScaleModeValue, doubleListValue, transition, modelTypeValue, visibilityValue, longValue, longValue, stringValue, Filter.INITIAL, new LayerInteractionsState());
    }
}
