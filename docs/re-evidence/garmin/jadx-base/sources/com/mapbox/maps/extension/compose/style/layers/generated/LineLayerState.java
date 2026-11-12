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
import com.mapbox.maps.extension.compose.style.layers.ImageValue;
import com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationOptions;
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
@Metadata(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0003\bµ\u0002\b\u0007\u0018\u00002\u00020\u0001B©\u0003\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0011\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0011\u0012\u0006\u0010%\u001a\u00020\u0013\u0012\u0006\u0010&\u001a\u00020\u0015\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0011\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0011\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020\u001d\u0012\u0006\u00101\u001a\u00020\u0011\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00104\u001a\u00020\u0013\u0012\u0006\u00105\u001a\u00020\u0015\u0012\u0006\u00106\u001a\u00020\u0011\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u00109\u001a\u00020\u001d\u0012\u0006\u0010:\u001a\u00020\u0004\u0012\u0006\u0010;\u001a\u00020\u0011\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010@\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020\u0015\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GB\t\b\u0016¢\u0006\u0004\bF\u0010HJ\u0017\u0010N\u001a\u00020K2\u0006\u0010J\u001a\u00020IH\u0001¢\u0006\u0004\bL\u0010MR1\u0010W\u001a\u00020D2\u0006\u0010O\u001a\u00020D8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bP\u0010Q\u0012\u0004\bV\u0010H\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010QR \u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bZ\u0010Q\u0012\u0004\b[\u0010HR \u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00060X8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\\\u0010Q\u0012\u0004\b]\u0010HR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\b0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010QR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010QR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010QR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010QR \u0010b\u001a\b\u0012\u0004\u0012\u00020\r0X8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bb\u0010Q\u0012\u0004\bc\u0010HR \u0010d\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bd\u0010Q\u0012\u0004\be\u0010HR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010QR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010QR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00130X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010QR \u0010i\u001a\b\u0012\u0004\u0012\u00020\u00150X8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bi\u0010Q\u0012\u0004\bj\u0010HR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010QR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010QR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010QR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00130X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010QR \u0010o\u001a\b\u0012\u0004\u0012\u00020\u00150X8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bo\u0010Q\u0012\u0004\bp\u0010HR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010QR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u001d0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010QR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010QR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010QR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010QR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010QR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010QR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010QR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00130X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010QR \u0010z\u001a\b\u0012\u0004\u0012\u00020\u00150X8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bz\u0010Q\u0012\u0004\b{\u0010HR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010QR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010QR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010QR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010QR\u001c\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010QR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010QR\u001c\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020-0X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010QR\u001c\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010QR\u001c\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010QR\u001c\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010QR\u001c\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u0002020X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010QR#\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130X8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010Q\u0012\u0005\b\u0088\u0001\u0010HR#\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150X8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010Q\u0012\u0005\b\u008a\u0001\u0010HR#\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010Q\u0012\u0005\b\u008c\u0001\u0010HR#\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u0002070X8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010Q\u0012\u0005\b\u008e\u0001\u0010HR\u001c\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010QR\u001c\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010QR\u001c\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010QR\u001c\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020<0X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010QR\u001c\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020>0X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010QR\u001c\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020>0X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010QR\u001c\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010QR\u001c\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020B0X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010QR2\u0010\u009d\u0001\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001*\u0006\b\u009b\u0001\u0010\u009c\u0001R9\u0010¤\u0001\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b¢\u0001\u0010H\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001*\u0006\b£\u0001\u0010\u009c\u0001R9\u0010«\u0001\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b©\u0001\u0010H\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001*\u0006\bª\u0001\u0010\u009c\u0001R2\u0010±\u0001\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001*\u0006\b°\u0001\u0010\u009c\u0001R2\u0010µ\u0001\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b²\u0001\u0010\u009f\u0001\"\u0006\b³\u0001\u0010¡\u0001*\u0006\b´\u0001\u0010\u009c\u0001R2\u0010¹\u0001\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¶\u0001\u0010\u009f\u0001\"\u0006\b·\u0001\u0010¡\u0001*\u0006\b¸\u0001\u0010\u009c\u0001R2\u0010½\u0001\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bº\u0001\u0010\u009f\u0001\"\u0006\b»\u0001\u0010¡\u0001*\u0006\b¼\u0001\u0010\u009c\u0001R9\u0010Ä\u0001\u001a\u00020\r2\u0006\u0010O\u001a\u00020\r8F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÂ\u0001\u0010H\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001*\u0006\bÃ\u0001\u0010\u009c\u0001R9\u0010É\u0001\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÇ\u0001\u0010H\u001a\u0006\bÅ\u0001\u0010\u009f\u0001\"\u0006\bÆ\u0001\u0010¡\u0001*\u0006\bÈ\u0001\u0010\u009c\u0001R2\u0010Í\u0001\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÊ\u0001\u0010\u009f\u0001\"\u0006\bË\u0001\u0010¡\u0001*\u0006\bÌ\u0001\u0010\u009c\u0001R2\u0010Ó\u0001\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001*\u0006\bÒ\u0001\u0010\u009c\u0001R2\u0010Ù\u0001\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001*\u0006\bØ\u0001\u0010\u009c\u0001R9\u0010à\u0001\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u00158F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÞ\u0001\u0010H\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001*\u0006\bß\u0001\u0010\u009c\u0001R2\u0010ä\u0001\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bá\u0001\u0010Ï\u0001\"\u0006\bâ\u0001\u0010Ñ\u0001*\u0006\bã\u0001\u0010\u009c\u0001R2\u0010è\u0001\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bå\u0001\u0010\u009f\u0001\"\u0006\bæ\u0001\u0010¡\u0001*\u0006\bç\u0001\u0010\u009c\u0001R2\u0010ì\u0001\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bé\u0001\u0010Ï\u0001\"\u0006\bê\u0001\u0010Ñ\u0001*\u0006\bë\u0001\u0010\u009c\u0001R2\u0010ð\u0001\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bí\u0001\u0010Õ\u0001\"\u0006\bî\u0001\u0010×\u0001*\u0006\bï\u0001\u0010\u009c\u0001R9\u0010õ\u0001\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u00158F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bó\u0001\u0010H\u001a\u0006\bñ\u0001\u0010Û\u0001\"\u0006\bò\u0001\u0010Ý\u0001*\u0006\bô\u0001\u0010\u009c\u0001R2\u0010ù\u0001\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bö\u0001\u0010Ï\u0001\"\u0006\b÷\u0001\u0010Ñ\u0001*\u0006\bø\u0001\u0010\u009c\u0001R2\u0010ÿ\u0001\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001*\u0006\bþ\u0001\u0010\u009c\u0001R2\u0010\u0083\u0002\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0080\u0002\u0010\u009f\u0001\"\u0006\b\u0081\u0002\u0010¡\u0001*\u0006\b\u0082\u0002\u0010\u009c\u0001R2\u0010\u0087\u0002\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0084\u0002\u0010Ï\u0001\"\u0006\b\u0085\u0002\u0010Ñ\u0001*\u0006\b\u0086\u0002\u0010\u009c\u0001R2\u0010\u008b\u0002\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0088\u0002\u0010\u009f\u0001\"\u0006\b\u0089\u0002\u0010¡\u0001*\u0006\b\u008a\u0002\u0010\u009c\u0001R2\u0010\u008f\u0002\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u008c\u0002\u0010Ï\u0001\"\u0006\b\u008d\u0002\u0010Ñ\u0001*\u0006\b\u008e\u0002\u0010\u009c\u0001R2\u0010\u0093\u0002\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0090\u0002\u0010\u009f\u0001\"\u0006\b\u0091\u0002\u0010¡\u0001*\u0006\b\u0092\u0002\u0010\u009c\u0001R2\u0010\u0097\u0002\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0094\u0002\u0010Ï\u0001\"\u0006\b\u0095\u0002\u0010Ñ\u0001*\u0006\b\u0096\u0002\u0010\u009c\u0001R2\u0010\u009b\u0002\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0098\u0002\u0010Õ\u0001\"\u0006\b\u0099\u0002\u0010×\u0001*\u0006\b\u009a\u0002\u0010\u009c\u0001R9\u0010 \u0002\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u00158F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u009e\u0002\u0010H\u001a\u0006\b\u009c\u0002\u0010Û\u0001\"\u0006\b\u009d\u0002\u0010Ý\u0001*\u0006\b\u009f\u0002\u0010\u009c\u0001R2\u0010¤\u0002\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¡\u0002\u0010\u009f\u0001\"\u0006\b¢\u0002\u0010¡\u0001*\u0006\b£\u0002\u0010\u009c\u0001R2\u0010¨\u0002\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¥\u0002\u0010Ï\u0001\"\u0006\b¦\u0002\u0010Ñ\u0001*\u0006\b§\u0002\u0010\u009c\u0001R2\u0010¬\u0002\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b©\u0002\u0010\u009f\u0001\"\u0006\bª\u0002\u0010¡\u0001*\u0006\b«\u0002\u0010\u009c\u0001R2\u0010°\u0002\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u00ad\u0002\u0010Ï\u0001\"\u0006\b®\u0002\u0010Ñ\u0001*\u0006\b¯\u0002\u0010\u009c\u0001R2\u0010´\u0002\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b±\u0002\u0010\u009f\u0001\"\u0006\b²\u0002\u0010¡\u0001*\u0006\b³\u0002\u0010\u009c\u0001R2\u0010¸\u0002\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bµ\u0002\u0010Ï\u0001\"\u0006\b¶\u0002\u0010Ñ\u0001*\u0006\b·\u0002\u0010\u009c\u0001R2\u0010¾\u0002\u001a\u00020-2\u0006\u0010O\u001a\u00020-8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¹\u0002\u0010º\u0002\"\u0006\b»\u0002\u0010¼\u0002*\u0006\b½\u0002\u0010\u009c\u0001R2\u0010Â\u0002\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¿\u0002\u0010\u009f\u0001\"\u0006\bÀ\u0002\u0010¡\u0001*\u0006\bÁ\u0002\u0010\u009c\u0001R2\u0010Æ\u0002\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÃ\u0002\u0010û\u0001\"\u0006\bÄ\u0002\u0010ý\u0001*\u0006\bÅ\u0002\u0010\u009c\u0001R2\u0010Ê\u0002\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÇ\u0002\u0010Ï\u0001\"\u0006\bÈ\u0002\u0010Ñ\u0001*\u0006\bÉ\u0002\u0010\u009c\u0001R2\u0010Ð\u0002\u001a\u0002022\u0006\u0010O\u001a\u0002028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bË\u0002\u0010Ì\u0002\"\u0006\bÍ\u0002\u0010Î\u0002*\u0006\bÏ\u0002\u0010\u009c\u0001R9\u0010Õ\u0002\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00138F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÓ\u0002\u0010H\u001a\u0006\bÑ\u0002\u0010Õ\u0001\"\u0006\bÒ\u0002\u0010×\u0001*\u0006\bÔ\u0002\u0010\u009c\u0001R9\u0010Ú\u0002\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u00158F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bØ\u0002\u0010H\u001a\u0006\bÖ\u0002\u0010Û\u0001\"\u0006\b×\u0002\u0010Ý\u0001*\u0006\bÙ\u0002\u0010\u009c\u0001R9\u0010ß\u0002\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÝ\u0002\u0010H\u001a\u0006\bÛ\u0002\u0010Ï\u0001\"\u0006\bÜ\u0002\u0010Ñ\u0001*\u0006\bÞ\u0002\u0010\u009c\u0001R9\u0010æ\u0002\u001a\u0002072\u0006\u0010O\u001a\u0002078F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bä\u0002\u0010H\u001a\u0006\bà\u0002\u0010á\u0002\"\u0006\bâ\u0002\u0010ã\u0002*\u0006\bå\u0002\u0010\u009c\u0001R2\u0010ê\u0002\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bç\u0002\u0010û\u0001\"\u0006\bè\u0002\u0010ý\u0001*\u0006\bé\u0002\u0010\u009c\u0001R2\u0010î\u0002\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bë\u0002\u0010\u009f\u0001\"\u0006\bì\u0002\u0010¡\u0001*\u0006\bí\u0002\u0010\u009c\u0001R2\u0010ò\u0002\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bï\u0002\u0010Ï\u0001\"\u0006\bð\u0002\u0010Ñ\u0001*\u0006\bñ\u0002\u0010\u009c\u0001R2\u0010ø\u0002\u001a\u00020<2\u0006\u0010O\u001a\u00020<8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bó\u0002\u0010ô\u0002\"\u0006\bõ\u0002\u0010ö\u0002*\u0006\b÷\u0002\u0010\u009c\u0001R2\u0010þ\u0002\u001a\u00020>2\u0006\u0010O\u001a\u00020>8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bù\u0002\u0010ú\u0002\"\u0006\bû\u0002\u0010ü\u0002*\u0006\bý\u0002\u0010\u009c\u0001R2\u0010\u0082\u0003\u001a\u00020>2\u0006\u0010O\u001a\u00020>8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÿ\u0002\u0010ú\u0002\"\u0006\b\u0080\u0003\u0010ü\u0002*\u0006\b\u0081\u0003\u0010\u009c\u0001R2\u0010\u0086\u0003\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0083\u0003\u0010Û\u0001\"\u0006\b\u0084\u0003\u0010Ý\u0001*\u0006\b\u0085\u0003\u0010\u009c\u0001R2\u0010\u008c\u0003\u001a\u00020B2\u0006\u0010O\u001a\u00020B8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0087\u0003\u0010\u0088\u0003\"\u0006\b\u0089\u0003\u0010\u008a\u0003*\u0006\b\u008b\u0003\u0010\u009c\u0001¨\u0006\u008d\u0003"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/LineLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/layers/generated/LineCapValue;", "initialLineCap", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialLineCrossSlope", "Lcom/mapbox/maps/extension/compose/style/layers/generated/LineElevationReferenceValue;", "initialLineElevationReference", "Lcom/mapbox/maps/extension/compose/style/layers/generated/LineJoinValue;", "initialLineJoin", "initialLineMiterLimit", "initialLineRoundLimit", "initialLineSortKey", "Lcom/mapbox/maps/extension/compose/style/layers/generated/LineWidthUnitValue;", "initialLineWidthUnit", "initialLineZOffset", "initialLineBlur", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialLineBlurTransition", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialLineBorderColor", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialLineBorderColorUseTheme", "initialLineBorderColorTransition", "initialLineBorderWidth", "initialLineBorderWidthTransition", "initialLineColor", "initialLineColorUseTheme", "initialLineColorTransition", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "initialLineDasharray", "initialLineDepthOcclusionFactor", "initialLineDepthOcclusionFactorTransition", "initialLineEmissiveStrength", "initialLineEmissiveStrengthTransition", "initialLineGapWidth", "initialLineGapWidthTransition", "initialLineGradient", "initialLineGradientUseTheme", "initialLineOcclusionOpacity", "initialLineOcclusionOpacityTransition", "initialLineOffset", "initialLineOffsetTransition", "initialLineOpacity", "initialLineOpacityTransition", "Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "initialLinePattern", "initialLinePatternCrossFade", "initialLineTranslate", "initialLineTranslateTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/LineTranslateAnchorValue;", "initialLineTranslateAnchor", "initialLineTrimColor", "initialLineTrimColorUseTheme", "initialLineTrimColorTransition", "Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;", "initialLineTrimFadeRange", "initialLineTrimOffset", "initialLineWidth", "initialLineWidthTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "initialInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/LineCapValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/LineElevationReferenceValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/LineJoinValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/LineWidthUnitValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/LineTranslateAnchorValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "getInteractionsState$annotations", "interactionsState", "Lp3/p1;", "lineCapState", "lineCrossSlopeState", "getLineCrossSlopeState$annotations", "lineElevationReferenceState", "getLineElevationReferenceState$annotations", "lineJoinState", "lineMiterLimitState", "lineRoundLimitState", "lineSortKeyState", "lineWidthUnitState", "getLineWidthUnitState$annotations", "lineZOffsetState", "getLineZOffsetState$annotations", "lineBlurState", "lineBlurTransitionState", "lineBorderColorState", "lineBorderColorUseThemeState", "getLineBorderColorUseThemeState$annotations", "lineBorderColorTransitionState", "lineBorderWidthState", "lineBorderWidthTransitionState", "lineColorState", "lineColorUseThemeState", "getLineColorUseThemeState$annotations", "lineColorTransitionState", "lineDasharrayState", "lineDepthOcclusionFactorState", "lineDepthOcclusionFactorTransitionState", "lineEmissiveStrengthState", "lineEmissiveStrengthTransitionState", "lineGapWidthState", "lineGapWidthTransitionState", "lineGradientState", "lineGradientUseThemeState", "getLineGradientUseThemeState$annotations", "lineOcclusionOpacityState", "lineOcclusionOpacityTransitionState", "lineOffsetState", "lineOffsetTransitionState", "lineOpacityState", "lineOpacityTransitionState", "linePatternState", "linePatternCrossFadeState", "lineTranslateState", "lineTranslateTransitionState", "lineTranslateAnchorState", "lineTrimColorState", "getLineTrimColorState$annotations", "lineTrimColorUseThemeState", "getLineTrimColorUseThemeState$annotations", "lineTrimColorTransitionState", "getLineTrimColorTransitionState$annotations", "lineTrimFadeRangeState", "getLineTrimFadeRangeState$annotations", "lineTrimOffsetState", "lineWidthState", "lineWidthTransitionState", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "getLineCap", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/LineCapValue;", "setLineCap", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/LineCapValue;)V", "getLineCap$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/LineLayerState;)Ljava/lang/Object;", "lineCap", "getLineCrossSlope", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setLineCrossSlope", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getLineCrossSlope$annotations", "getLineCrossSlope$delegate", "lineCrossSlope", "getLineElevationReference", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/LineElevationReferenceValue;", "setLineElevationReference", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/LineElevationReferenceValue;)V", "getLineElevationReference$annotations", "getLineElevationReference$delegate", "lineElevationReference", "getLineJoin", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/LineJoinValue;", "setLineJoin", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/LineJoinValue;)V", "getLineJoin$delegate", "lineJoin", "getLineMiterLimit", "setLineMiterLimit", "getLineMiterLimit$delegate", "lineMiterLimit", "getLineRoundLimit", "setLineRoundLimit", "getLineRoundLimit$delegate", "lineRoundLimit", "getLineSortKey", "setLineSortKey", "getLineSortKey$delegate", "lineSortKey", "getLineWidthUnit", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/LineWidthUnitValue;", "setLineWidthUnit", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/LineWidthUnitValue;)V", "getLineWidthUnit$annotations", "getLineWidthUnit$delegate", "lineWidthUnit", "getLineZOffset", "setLineZOffset", "getLineZOffset$annotations", "getLineZOffset$delegate", "lineZOffset", "getLineBlur", "setLineBlur", "getLineBlur$delegate", "lineBlur", "getLineBlurTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setLineBlurTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getLineBlurTransition$delegate", "lineBlurTransition", "getLineBorderColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setLineBorderColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getLineBorderColor$delegate", "lineBorderColor", "getLineBorderColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setLineBorderColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getLineBorderColorUseTheme$annotations", "getLineBorderColorUseTheme$delegate", "lineBorderColorUseTheme", "getLineBorderColorTransition", "setLineBorderColorTransition", "getLineBorderColorTransition$delegate", "lineBorderColorTransition", "getLineBorderWidth", "setLineBorderWidth", "getLineBorderWidth$delegate", "lineBorderWidth", "getLineBorderWidthTransition", "setLineBorderWidthTransition", "getLineBorderWidthTransition$delegate", "lineBorderWidthTransition", "getLineColor", "setLineColor", "getLineColor$delegate", "lineColor", "getLineColorUseTheme", "setLineColorUseTheme", "getLineColorUseTheme$annotations", "getLineColorUseTheme$delegate", "lineColorUseTheme", "getLineColorTransition", "setLineColorTransition", "getLineColorTransition$delegate", "lineColorTransition", "getLineDasharray", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setLineDasharray", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getLineDasharray$delegate", "lineDasharray", "getLineDepthOcclusionFactor", "setLineDepthOcclusionFactor", "getLineDepthOcclusionFactor$delegate", "lineDepthOcclusionFactor", "getLineDepthOcclusionFactorTransition", "setLineDepthOcclusionFactorTransition", "getLineDepthOcclusionFactorTransition$delegate", "lineDepthOcclusionFactorTransition", "getLineEmissiveStrength", "setLineEmissiveStrength", "getLineEmissiveStrength$delegate", "lineEmissiveStrength", "getLineEmissiveStrengthTransition", "setLineEmissiveStrengthTransition", "getLineEmissiveStrengthTransition$delegate", "lineEmissiveStrengthTransition", "getLineGapWidth", "setLineGapWidth", "getLineGapWidth$delegate", "lineGapWidth", "getLineGapWidthTransition", "setLineGapWidthTransition", "getLineGapWidthTransition$delegate", "lineGapWidthTransition", "getLineGradient", "setLineGradient", "getLineGradient$delegate", "lineGradient", "getLineGradientUseTheme", "setLineGradientUseTheme", "getLineGradientUseTheme$annotations", "getLineGradientUseTheme$delegate", "lineGradientUseTheme", "getLineOcclusionOpacity", "setLineOcclusionOpacity", "getLineOcclusionOpacity$delegate", "lineOcclusionOpacity", "getLineOcclusionOpacityTransition", "setLineOcclusionOpacityTransition", "getLineOcclusionOpacityTransition$delegate", "lineOcclusionOpacityTransition", "getLineOffset", "setLineOffset", "getLineOffset$delegate", "lineOffset", "getLineOffsetTransition", "setLineOffsetTransition", "getLineOffsetTransition$delegate", "lineOffsetTransition", "getLineOpacity", "setLineOpacity", "getLineOpacity$delegate", "lineOpacity", "getLineOpacityTransition", "setLineOpacityTransition", "getLineOpacityTransition$delegate", "lineOpacityTransition", "getLinePattern", "()Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "setLinePattern", "(Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;)V", "getLinePattern$delegate", "linePattern", "getLinePatternCrossFade", "setLinePatternCrossFade", "getLinePatternCrossFade$delegate", "linePatternCrossFade", "getLineTranslate", "setLineTranslate", "getLineTranslate$delegate", "lineTranslate", "getLineTranslateTransition", "setLineTranslateTransition", "getLineTranslateTransition$delegate", "lineTranslateTransition", "getLineTranslateAnchor", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/LineTranslateAnchorValue;", "setLineTranslateAnchor", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/LineTranslateAnchorValue;)V", "getLineTranslateAnchor$delegate", "lineTranslateAnchor", "getLineTrimColor", "setLineTrimColor", "getLineTrimColor$annotations", "getLineTrimColor$delegate", "lineTrimColor", "getLineTrimColorUseTheme", "setLineTrimColorUseTheme", "getLineTrimColorUseTheme$annotations", "getLineTrimColorUseTheme$delegate", "lineTrimColorUseTheme", "getLineTrimColorTransition", "setLineTrimColorTransition", "getLineTrimColorTransition$annotations", "getLineTrimColorTransition$delegate", "lineTrimColorTransition", "getLineTrimFadeRange", "()Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;", "setLineTrimFadeRange", "(Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;)V", "getLineTrimFadeRange$annotations", "getLineTrimFadeRange$delegate", "lineTrimFadeRange", "getLineTrimOffset", "setLineTrimOffset", "getLineTrimOffset$delegate", "lineTrimOffset", "getLineWidth", "setLineWidth", "getLineWidth$delegate", "lineWidth", "getLineWidthTransition", "setLineWidthTransition", "getLineWidthTransition$delegate", "lineWidthTransition", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LineLayerState {
    private final p1<Filter> filterState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;
    private final p1<DoubleValue> lineBlurState;
    private final p1<Transition> lineBlurTransitionState;
    private final p1<ColorValue> lineBorderColorState;
    private final p1<Transition> lineBorderColorTransitionState;
    private final p1<StringValue> lineBorderColorUseThemeState;
    private final p1<DoubleValue> lineBorderWidthState;
    private final p1<Transition> lineBorderWidthTransitionState;
    private final p1<LineCapValue> lineCapState;
    private final p1<ColorValue> lineColorState;
    private final p1<Transition> lineColorTransitionState;
    private final p1<StringValue> lineColorUseThemeState;
    private final p1<DoubleValue> lineCrossSlopeState;
    private final p1<DoubleListValue> lineDasharrayState;
    private final p1<DoubleValue> lineDepthOcclusionFactorState;
    private final p1<Transition> lineDepthOcclusionFactorTransitionState;
    private final p1<LineElevationReferenceValue> lineElevationReferenceState;
    private final p1<DoubleValue> lineEmissiveStrengthState;
    private final p1<Transition> lineEmissiveStrengthTransitionState;
    private final p1<DoubleValue> lineGapWidthState;
    private final p1<Transition> lineGapWidthTransitionState;
    private final p1<ColorValue> lineGradientState;
    private final p1<StringValue> lineGradientUseThemeState;
    private final p1<LineJoinValue> lineJoinState;
    private final p1<DoubleValue> lineMiterLimitState;
    private final p1<DoubleValue> lineOcclusionOpacityState;
    private final p1<Transition> lineOcclusionOpacityTransitionState;
    private final p1<DoubleValue> lineOffsetState;
    private final p1<Transition> lineOffsetTransitionState;
    private final p1<DoubleValue> lineOpacityState;
    private final p1<Transition> lineOpacityTransitionState;
    private final p1<DoubleValue> linePatternCrossFadeState;
    private final p1<ImageValue> linePatternState;
    private final p1<DoubleValue> lineRoundLimitState;
    private final p1<DoubleValue> lineSortKeyState;
    private final p1<LineTranslateAnchorValue> lineTranslateAnchorState;
    private final p1<DoubleListValue> lineTranslateState;
    private final p1<Transition> lineTranslateTransitionState;
    private final p1<ColorValue> lineTrimColorState;
    private final p1<Transition> lineTrimColorTransitionState;
    private final p1<StringValue> lineTrimColorUseThemeState;
    private final p1<DoubleRangeValue> lineTrimFadeRangeState;
    private final p1<DoubleListValue> lineTrimOffsetState;
    private final p1<DoubleValue> lineWidthState;
    private final p1<Transition> lineWidthTransitionState;
    private final p1<LineWidthUnitValue> lineWidthUnitState;
    private final p1<DoubleValue> lineZOffsetState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private LineLayerState(LineCapValue lineCapValue, DoubleValue doubleValue, LineElevationReferenceValue lineElevationReferenceValue, LineJoinValue lineJoinValue, DoubleValue doubleValue2, DoubleValue doubleValue3, DoubleValue doubleValue4, LineWidthUnitValue lineWidthUnitValue, DoubleValue doubleValue5, DoubleValue doubleValue6, Transition transition, ColorValue colorValue, StringValue stringValue, Transition transition2, DoubleValue doubleValue7, Transition transition3, ColorValue colorValue2, StringValue stringValue2, Transition transition4, DoubleListValue doubleListValue, DoubleValue doubleValue8, Transition transition5, DoubleValue doubleValue9, Transition transition6, DoubleValue doubleValue10, Transition transition7, ColorValue colorValue3, StringValue stringValue3, DoubleValue doubleValue11, Transition transition8, DoubleValue doubleValue12, Transition transition9, DoubleValue doubleValue13, Transition transition10, ImageValue imageValue, DoubleValue doubleValue14, DoubleListValue doubleListValue2, Transition transition11, LineTranslateAnchorValue lineTranslateAnchorValue, ColorValue colorValue4, StringValue stringValue4, Transition transition12, DoubleRangeValue doubleRangeValue, DoubleListValue doubleListValue3, DoubleValue doubleValue15, Transition transition13, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue5, Filter filter, LayerInteractionsState layerInteractionsState) {
        this.interactionsState = p0.n(layerInteractionsState);
        this.lineCapState = p0.n(lineCapValue);
        this.lineCrossSlopeState = p0.n(doubleValue);
        this.lineElevationReferenceState = p0.n(lineElevationReferenceValue);
        this.lineJoinState = p0.n(lineJoinValue);
        this.lineMiterLimitState = p0.n(doubleValue2);
        this.lineRoundLimitState = p0.n(doubleValue3);
        this.lineSortKeyState = p0.n(doubleValue4);
        this.lineWidthUnitState = p0.n(lineWidthUnitValue);
        this.lineZOffsetState = p0.n(doubleValue5);
        this.lineBlurState = p0.n(doubleValue6);
        this.lineBlurTransitionState = p0.n(transition);
        this.lineBorderColorState = p0.n(colorValue);
        this.lineBorderColorUseThemeState = p0.n(stringValue);
        this.lineBorderColorTransitionState = p0.n(transition2);
        this.lineBorderWidthState = p0.n(doubleValue7);
        this.lineBorderWidthTransitionState = p0.n(transition3);
        this.lineColorState = p0.n(colorValue2);
        this.lineColorUseThemeState = p0.n(stringValue2);
        this.lineColorTransitionState = p0.n(transition4);
        this.lineDasharrayState = p0.n(doubleListValue);
        this.lineDepthOcclusionFactorState = p0.n(doubleValue8);
        this.lineDepthOcclusionFactorTransitionState = p0.n(transition5);
        this.lineEmissiveStrengthState = p0.n(doubleValue9);
        this.lineEmissiveStrengthTransitionState = p0.n(transition6);
        this.lineGapWidthState = p0.n(doubleValue10);
        this.lineGapWidthTransitionState = p0.n(transition7);
        this.lineGradientState = p0.n(colorValue3);
        this.lineGradientUseThemeState = p0.n(stringValue3);
        this.lineOcclusionOpacityState = p0.n(doubleValue11);
        this.lineOcclusionOpacityTransitionState = p0.n(transition8);
        this.lineOffsetState = p0.n(doubleValue12);
        this.lineOffsetTransitionState = p0.n(transition9);
        this.lineOpacityState = p0.n(doubleValue13);
        this.lineOpacityTransitionState = p0.n(transition10);
        this.linePatternState = p0.n(imageValue);
        this.linePatternCrossFadeState = p0.n(doubleValue14);
        this.lineTranslateState = p0.n(doubleListValue2);
        this.lineTranslateTransitionState = p0.n(transition11);
        this.lineTranslateAnchorState = p0.n(lineTranslateAnchorValue);
        this.lineTrimColorState = p0.n(colorValue4);
        this.lineTrimColorUseThemeState = p0.n(stringValue4);
        this.lineTrimColorTransitionState = p0.n(transition12);
        this.lineTrimFadeRangeState = p0.n(doubleRangeValue);
        this.lineTrimOffsetState = p0.n(doubleListValue3);
        this.lineWidthState = p0.n(doubleValue15);
        this.lineWidthTransitionState = p0.n(transition13);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue5);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getInteractionsState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineBorderColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCrossSlope$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineCrossSlopeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineElevationReference$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineElevationReferenceState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineGradientUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineGradientUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColor$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineTrimColorState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineTrimColorTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineTrimColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimFadeRange$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineTrimFadeRangeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineWidthUnit$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineWidthUnitState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineZOffset$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getLineZOffsetState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(-1425444383);
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
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineCapState, "line-cap", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineCrossSlopeState, "line-cross-slope", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineElevationReferenceState, "line-elevation-reference", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineJoinState, PolylineAnnotationOptions.PROPERTY_LINE_JOIN, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineMiterLimitState, "line-miter-limit", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineRoundLimitState, "line-round-limit", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineSortKeyState, PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineWidthUnitState, "line-width-unit", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineZOffsetState, PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineBlurState, PolylineAnnotationOptions.PROPERTY_LINE_BLUR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineBlurTransitionState, "line-blur-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineBorderColorState, PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineBorderColorUseThemeState, PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineBorderColorTransitionState, "line-border-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineBorderWidthState, PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineBorderWidthTransitionState, "line-border-width-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineColorState, PolylineAnnotationOptions.PROPERTY_LINE_COLOR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineColorUseThemeState, PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineColorTransitionState, "line-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineDasharrayState, "line-dasharray", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineDepthOcclusionFactorState, "line-depth-occlusion-factor", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineDepthOcclusionFactorTransitionState, "line-depth-occlusion-factor-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineEmissiveStrengthState, "line-emissive-strength", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineEmissiveStrengthTransitionState, "line-emissive-strength-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineGapWidthState, PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineGapWidthTransitionState, "line-gap-width-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineGradientState, "line-gradient", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineGradientUseThemeState, "line-gradient-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineOcclusionOpacityState, "line-occlusion-opacity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineOcclusionOpacityTransitionState, "line-occlusion-opacity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineOffsetState, PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineOffsetTransitionState, "line-offset-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineOpacityState, PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineOpacityTransitionState, "line-opacity-transition", o0VarE, 384);
            PropertyTypesKt.AddImageWhenNotInitial(layerNode, this.linePatternState, PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, o0VarE, (i15 & 14) | 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.linePatternCrossFadeState, "line-pattern-cross-fade", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineTranslateState, "line-translate", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineTranslateTransitionState, "line-translate-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineTranslateAnchorState, "line-translate-anchor", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineTrimColorState, "line-trim-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineTrimColorUseThemeState, "line-trim-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineTrimColorTransitionState, "line-trim-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineTrimFadeRangeState, "line-trim-fade-range", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineTrimOffsetState, "line-trim-offset", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineWidthState, PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.lineWidthTransitionState, "line-width-transition", o0VarE, 384);
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
        p2VarI0.f135219d = new LineLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final Filter getFilter() {
        return this.filterState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LayerInteractionsState getInteractionsState() {
        return (LayerInteractionsState) this.interactionsState.getF182175a();
    }

    public final DoubleValue getLineBlur() {
        return this.lineBlurState.getF182175a();
    }

    public final Transition getLineBlurTransition() {
        return this.lineBlurTransitionState.getF182175a();
    }

    public final ColorValue getLineBorderColor() {
        return this.lineBorderColorState.getF182175a();
    }

    public final Transition getLineBorderColorTransition() {
        return this.lineBorderColorTransitionState.getF182175a();
    }

    public final StringValue getLineBorderColorUseTheme() {
        return this.lineBorderColorUseThemeState.getF182175a();
    }

    public final DoubleValue getLineBorderWidth() {
        return this.lineBorderWidthState.getF182175a();
    }

    public final Transition getLineBorderWidthTransition() {
        return this.lineBorderWidthTransitionState.getF182175a();
    }

    public final LineCapValue getLineCap() {
        return this.lineCapState.getF182175a();
    }

    public final ColorValue getLineColor() {
        return this.lineColorState.getF182175a();
    }

    public final Transition getLineColorTransition() {
        return this.lineColorTransitionState.getF182175a();
    }

    public final StringValue getLineColorUseTheme() {
        return this.lineColorUseThemeState.getF182175a();
    }

    public final DoubleValue getLineCrossSlope() {
        return this.lineCrossSlopeState.getF182175a();
    }

    public final DoubleListValue getLineDasharray() {
        return this.lineDasharrayState.getF182175a();
    }

    public final DoubleValue getLineDepthOcclusionFactor() {
        return this.lineDepthOcclusionFactorState.getF182175a();
    }

    public final Transition getLineDepthOcclusionFactorTransition() {
        return this.lineDepthOcclusionFactorTransitionState.getF182175a();
    }

    public final LineElevationReferenceValue getLineElevationReference() {
        return this.lineElevationReferenceState.getF182175a();
    }

    public final DoubleValue getLineEmissiveStrength() {
        return this.lineEmissiveStrengthState.getF182175a();
    }

    public final Transition getLineEmissiveStrengthTransition() {
        return this.lineEmissiveStrengthTransitionState.getF182175a();
    }

    public final DoubleValue getLineGapWidth() {
        return this.lineGapWidthState.getF182175a();
    }

    public final Transition getLineGapWidthTransition() {
        return this.lineGapWidthTransitionState.getF182175a();
    }

    public final ColorValue getLineGradient() {
        return this.lineGradientState.getF182175a();
    }

    public final StringValue getLineGradientUseTheme() {
        return this.lineGradientUseThemeState.getF182175a();
    }

    public final LineJoinValue getLineJoin() {
        return this.lineJoinState.getF182175a();
    }

    public final DoubleValue getLineMiterLimit() {
        return this.lineMiterLimitState.getF182175a();
    }

    public final DoubleValue getLineOcclusionOpacity() {
        return this.lineOcclusionOpacityState.getF182175a();
    }

    public final Transition getLineOcclusionOpacityTransition() {
        return this.lineOcclusionOpacityTransitionState.getF182175a();
    }

    public final DoubleValue getLineOffset() {
        return this.lineOffsetState.getF182175a();
    }

    public final Transition getLineOffsetTransition() {
        return this.lineOffsetTransitionState.getF182175a();
    }

    public final DoubleValue getLineOpacity() {
        return this.lineOpacityState.getF182175a();
    }

    public final Transition getLineOpacityTransition() {
        return this.lineOpacityTransitionState.getF182175a();
    }

    public final ImageValue getLinePattern() {
        return this.linePatternState.getF182175a();
    }

    public final DoubleValue getLinePatternCrossFade() {
        return this.linePatternCrossFadeState.getF182175a();
    }

    public final DoubleValue getLineRoundLimit() {
        return this.lineRoundLimitState.getF182175a();
    }

    public final DoubleValue getLineSortKey() {
        return this.lineSortKeyState.getF182175a();
    }

    public final DoubleListValue getLineTranslate() {
        return this.lineTranslateState.getF182175a();
    }

    public final LineTranslateAnchorValue getLineTranslateAnchor() {
        return this.lineTranslateAnchorState.getF182175a();
    }

    public final Transition getLineTranslateTransition() {
        return this.lineTranslateTransitionState.getF182175a();
    }

    public final ColorValue getLineTrimColor() {
        return this.lineTrimColorState.getF182175a();
    }

    public final Transition getLineTrimColorTransition() {
        return this.lineTrimColorTransitionState.getF182175a();
    }

    public final StringValue getLineTrimColorUseTheme() {
        return this.lineTrimColorUseThemeState.getF182175a();
    }

    public final DoubleRangeValue getLineTrimFadeRange() {
        return this.lineTrimFadeRangeState.getF182175a();
    }

    public final DoubleListValue getLineTrimOffset() {
        return this.lineTrimOffsetState.getF182175a();
    }

    public final DoubleValue getLineWidth() {
        return this.lineWidthState.getF182175a();
    }

    public final Transition getLineWidthTransition() {
        return this.lineWidthTransitionState.getF182175a();
    }

    public final LineWidthUnitValue getLineWidthUnit() {
        return this.lineWidthUnitState.getF182175a();
    }

    public final DoubleValue getLineZOffset() {
        return this.lineZOffsetState.getF182175a();
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

    public final void setFilter(Filter filter) {
        filter.getClass();
        this.filterState.setValue(filter);
    }

    public final void setInteractionsState(LayerInteractionsState layerInteractionsState) {
        layerInteractionsState.getClass();
        this.interactionsState.setValue(layerInteractionsState);
    }

    public final void setLineBlur(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineBlurState.setValue(doubleValue);
    }

    public final void setLineBlurTransition(Transition transition) {
        transition.getClass();
        this.lineBlurTransitionState.setValue(transition);
    }

    public final void setLineBorderColor(ColorValue colorValue) {
        colorValue.getClass();
        this.lineBorderColorState.setValue(colorValue);
    }

    public final void setLineBorderColorTransition(Transition transition) {
        transition.getClass();
        this.lineBorderColorTransitionState.setValue(transition);
    }

    public final void setLineBorderColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.lineBorderColorUseThemeState.setValue(stringValue);
    }

    public final void setLineBorderWidth(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineBorderWidthState.setValue(doubleValue);
    }

    public final void setLineBorderWidthTransition(Transition transition) {
        transition.getClass();
        this.lineBorderWidthTransitionState.setValue(transition);
    }

    public final void setLineCap(LineCapValue lineCapValue) {
        lineCapValue.getClass();
        this.lineCapState.setValue(lineCapValue);
    }

    public final void setLineColor(ColorValue colorValue) {
        colorValue.getClass();
        this.lineColorState.setValue(colorValue);
    }

    public final void setLineColorTransition(Transition transition) {
        transition.getClass();
        this.lineColorTransitionState.setValue(transition);
    }

    public final void setLineColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.lineColorUseThemeState.setValue(stringValue);
    }

    public final void setLineCrossSlope(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineCrossSlopeState.setValue(doubleValue);
    }

    public final void setLineDasharray(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.lineDasharrayState.setValue(doubleListValue);
    }

    public final void setLineDepthOcclusionFactor(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineDepthOcclusionFactorState.setValue(doubleValue);
    }

    public final void setLineDepthOcclusionFactorTransition(Transition transition) {
        transition.getClass();
        this.lineDepthOcclusionFactorTransitionState.setValue(transition);
    }

    public final void setLineElevationReference(LineElevationReferenceValue lineElevationReferenceValue) {
        lineElevationReferenceValue.getClass();
        this.lineElevationReferenceState.setValue(lineElevationReferenceValue);
    }

    public final void setLineEmissiveStrength(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineEmissiveStrengthState.setValue(doubleValue);
    }

    public final void setLineEmissiveStrengthTransition(Transition transition) {
        transition.getClass();
        this.lineEmissiveStrengthTransitionState.setValue(transition);
    }

    public final void setLineGapWidth(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineGapWidthState.setValue(doubleValue);
    }

    public final void setLineGapWidthTransition(Transition transition) {
        transition.getClass();
        this.lineGapWidthTransitionState.setValue(transition);
    }

    public final void setLineGradient(ColorValue colorValue) {
        colorValue.getClass();
        this.lineGradientState.setValue(colorValue);
    }

    public final void setLineGradientUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.lineGradientUseThemeState.setValue(stringValue);
    }

    public final void setLineJoin(LineJoinValue lineJoinValue) {
        lineJoinValue.getClass();
        this.lineJoinState.setValue(lineJoinValue);
    }

    public final void setLineMiterLimit(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineMiterLimitState.setValue(doubleValue);
    }

    public final void setLineOcclusionOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineOcclusionOpacityState.setValue(doubleValue);
    }

    public final void setLineOcclusionOpacityTransition(Transition transition) {
        transition.getClass();
        this.lineOcclusionOpacityTransitionState.setValue(transition);
    }

    public final void setLineOffset(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineOffsetState.setValue(doubleValue);
    }

    public final void setLineOffsetTransition(Transition transition) {
        transition.getClass();
        this.lineOffsetTransitionState.setValue(transition);
    }

    public final void setLineOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineOpacityState.setValue(doubleValue);
    }

    public final void setLineOpacityTransition(Transition transition) {
        transition.getClass();
        this.lineOpacityTransitionState.setValue(transition);
    }

    public final void setLinePattern(ImageValue imageValue) {
        imageValue.getClass();
        this.linePatternState.setValue(imageValue);
    }

    public final void setLinePatternCrossFade(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.linePatternCrossFadeState.setValue(doubleValue);
    }

    public final void setLineRoundLimit(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineRoundLimitState.setValue(doubleValue);
    }

    public final void setLineSortKey(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineSortKeyState.setValue(doubleValue);
    }

    public final void setLineTranslate(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.lineTranslateState.setValue(doubleListValue);
    }

    public final void setLineTranslateAnchor(LineTranslateAnchorValue lineTranslateAnchorValue) {
        lineTranslateAnchorValue.getClass();
        this.lineTranslateAnchorState.setValue(lineTranslateAnchorValue);
    }

    public final void setLineTranslateTransition(Transition transition) {
        transition.getClass();
        this.lineTranslateTransitionState.setValue(transition);
    }

    public final void setLineTrimColor(ColorValue colorValue) {
        colorValue.getClass();
        this.lineTrimColorState.setValue(colorValue);
    }

    public final void setLineTrimColorTransition(Transition transition) {
        transition.getClass();
        this.lineTrimColorTransitionState.setValue(transition);
    }

    public final void setLineTrimColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.lineTrimColorUseThemeState.setValue(stringValue);
    }

    public final void setLineTrimFadeRange(DoubleRangeValue doubleRangeValue) {
        doubleRangeValue.getClass();
        this.lineTrimFadeRangeState.setValue(doubleRangeValue);
    }

    public final void setLineTrimOffset(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.lineTrimOffsetState.setValue(doubleListValue);
    }

    public final void setLineWidth(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineWidthState.setValue(doubleValue);
    }

    public final void setLineWidthTransition(Transition transition) {
        transition.getClass();
        this.lineWidthTransitionState.setValue(transition);
    }

    public final void setLineWidthUnit(LineWidthUnitValue lineWidthUnitValue) {
        lineWidthUnitValue.getClass();
        this.lineWidthUnitState.setValue(lineWidthUnitValue);
    }

    public final void setLineZOffset(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.lineZOffsetState.setValue(doubleValue);
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
    public LineLayerState() {
        LineCapValue lineCapValue = LineCapValue.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        LineElevationReferenceValue lineElevationReferenceValue = LineElevationReferenceValue.INITIAL;
        LineJoinValue lineJoinValue = LineJoinValue.INITIAL;
        LineWidthUnitValue lineWidthUnitValue = LineWidthUnitValue.INITIAL;
        Transition transition = Transition.INITIAL;
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        ImageValue imageValue = ImageValue.INITIAL;
        LineTranslateAnchorValue lineTranslateAnchorValue = LineTranslateAnchorValue.INITIAL;
        DoubleRangeValue doubleRangeValue = DoubleRangeValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(lineCapValue, doubleValue, lineElevationReferenceValue, lineJoinValue, doubleValue, doubleValue, doubleValue, lineWidthUnitValue, doubleValue, doubleValue, transition, colorValue, stringValue, transition, doubleValue, transition, colorValue, stringValue, transition, doubleListValue, doubleValue, transition, doubleValue, transition, doubleValue, transition, colorValue, stringValue, doubleValue, transition, doubleValue, transition, doubleValue, transition, imageValue, doubleValue, doubleListValue, transition, lineTranslateAnchorValue, colorValue, stringValue, transition, doubleRangeValue, doubleListValue, doubleValue, transition, visibilityValue, longValue, longValue, stringValue, Filter.INITIAL, new LayerInteractionsState());
    }
}
