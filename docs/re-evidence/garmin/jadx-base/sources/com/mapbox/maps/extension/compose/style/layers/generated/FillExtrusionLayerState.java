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
@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0003\bÔ\u0002\b\u0007\u0018\u00002\u00020\u0001B±\u0003\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00105\u001a\u00020\u0005\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00108\u001a\u000201\u0012\u0006\u00109\u001a\u00020\u0002\u0012\u0006\u0010:\u001a\u00020\u0005\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010?\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020\u0015\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FB\t\b\u0016¢\u0006\u0004\bE\u0010GJ\u0017\u0010M\u001a\u00020J2\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010LR1\u0010V\u001a\u00020C2\u0006\u0010N\u001a\u00020C8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bU\u0010G\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR \u0010X\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bX\u0010P\u0012\u0004\bY\u0010GR \u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bZ\u0010P\u0012\u0004\b[\u0010GR \u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\\\u0010P\u0012\u0004\b]\u0010GR \u0010^\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b^\u0010P\u0012\u0004\b_\u0010GR \u0010`\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b`\u0010P\u0012\u0004\ba\u0010GR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010PR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010PR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010PR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010PR \u0010f\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bf\u0010P\u0012\u0004\bg\u0010GR \u0010h\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bh\u0010P\u0012\u0004\bi\u0010GR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010PR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010PR \u0010l\u001a\b\u0012\u0004\u0012\u00020\u00110W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bl\u0010P\u0012\u0004\bm\u0010GR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00130W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010PR \u0010o\u001a\b\u0012\u0004\u0012\u00020\u00150W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bo\u0010P\u0012\u0004\bp\u0010GR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010PR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010PR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010PR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010PR \u0010u\u001a\b\u0012\u0004\u0012\u00020\u00130W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bu\u0010P\u0012\u0004\bv\u0010GR \u0010w\u001a\b\u0012\u0004\u0012\u00020\u00150W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bw\u0010P\u0012\u0004\bx\u0010GR \u0010y\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\by\u0010P\u0012\u0004\bz\u0010GR \u0010{\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b{\u0010P\u0012\u0004\b|\u0010GR \u0010}\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b}\u0010P\u0012\u0004\b~\u0010GR!\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0083\u0004¢\u0006\r\n\u0004\b\u007f\u0010P\u0012\u0005\b\u0080\u0001\u0010GR#\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010P\u0012\u0005\b\u0082\u0001\u0010GR#\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010P\u0012\u0005\b\u0084\u0001\u0010GR#\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010P\u0012\u0005\b\u0086\u0001\u0010GR#\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010P\u0012\u0005\b\u0088\u0001\u0010GR#\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010P\u0012\u0005\b\u008a\u0001\u0010GR\u001c\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010PR\u001c\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010PR#\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020(0W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010P\u0012\u0005\b\u008e\u0001\u0010GR#\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010P\u0012\u0005\b\u0090\u0001\u0010GR#\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010P\u0012\u0005\b\u0092\u0001\u0010GR\u001c\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010PR\u001c\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010PR\u001c\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020.0W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010PR\u001c\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010PR#\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u0002010W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010P\u0012\u0005\b\u0098\u0001\u0010GR\u001c\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u0002030W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010PR\u001c\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010PR\u001c\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u0002060W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010PR\u001c\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u0002010W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010PR#\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010P\u0012\u0005\b\u009e\u0001\u0010GR#\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050W8\u0002X\u0083\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010P\u0012\u0005\b \u0001\u0010GR\u001c\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020;0W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¡\u0001\u0010PR\u001c\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020=0W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¢\u0001\u0010PR\u001c\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020=0W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b£\u0001\u0010PR\u001c\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¤\u0001\u0010PR\u001c\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020A0W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¥\u0001\u0010PR9\u0010\u00ad\u0001\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bª\u0001\u0010G\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001*\u0006\b«\u0001\u0010¬\u0001R9\u0010²\u0001\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b°\u0001\u0010G\u001a\u0006\b®\u0001\u0010§\u0001\"\u0006\b¯\u0001\u0010©\u0001*\u0006\b±\u0001\u0010¬\u0001R9\u0010¹\u0001\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b·\u0001\u0010G\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001*\u0006\b¸\u0001\u0010¬\u0001R9\u0010¾\u0001\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b¼\u0001\u0010G\u001a\u0006\bº\u0001\u0010§\u0001\"\u0006\b»\u0001\u0010©\u0001*\u0006\b½\u0001\u0010¬\u0001R9\u0010Ã\u0001\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÁ\u0001\u0010G\u001a\u0006\b¿\u0001\u0010´\u0001\"\u0006\bÀ\u0001\u0010¶\u0001*\u0006\bÂ\u0001\u0010¬\u0001R2\u0010Ç\u0001\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÄ\u0001\u0010§\u0001\"\u0006\bÅ\u0001\u0010©\u0001*\u0006\bÆ\u0001\u0010¬\u0001R2\u0010Ë\u0001\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÈ\u0001\u0010´\u0001\"\u0006\bÉ\u0001\u0010¶\u0001*\u0006\bÊ\u0001\u0010¬\u0001R2\u0010Ï\u0001\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÌ\u0001\u0010§\u0001\"\u0006\bÍ\u0001\u0010©\u0001*\u0006\bÎ\u0001\u0010¬\u0001R2\u0010Ó\u0001\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÐ\u0001\u0010´\u0001\"\u0006\bÑ\u0001\u0010¶\u0001*\u0006\bÒ\u0001\u0010¬\u0001R9\u0010Ø\u0001\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÖ\u0001\u0010G\u001a\u0006\bÔ\u0001\u0010§\u0001\"\u0006\bÕ\u0001\u0010©\u0001*\u0006\b×\u0001\u0010¬\u0001R9\u0010Ý\u0001\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÛ\u0001\u0010G\u001a\u0006\bÙ\u0001\u0010´\u0001\"\u0006\bÚ\u0001\u0010¶\u0001*\u0006\bÜ\u0001\u0010¬\u0001R2\u0010á\u0001\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÞ\u0001\u0010§\u0001\"\u0006\bß\u0001\u0010©\u0001*\u0006\bà\u0001\u0010¬\u0001R2\u0010å\u0001\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bâ\u0001\u0010´\u0001\"\u0006\bã\u0001\u0010¶\u0001*\u0006\bä\u0001\u0010¬\u0001R9\u0010ì\u0001\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\u00118F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bê\u0001\u0010G\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001*\u0006\bë\u0001\u0010¬\u0001R2\u0010ò\u0001\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001*\u0006\bñ\u0001\u0010¬\u0001R9\u0010ù\u0001\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00158F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b÷\u0001\u0010G\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001*\u0006\bø\u0001\u0010¬\u0001R2\u0010ý\u0001\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bú\u0001\u0010´\u0001\"\u0006\bû\u0001\u0010¶\u0001*\u0006\bü\u0001\u0010¬\u0001R2\u0010\u0081\u0002\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bþ\u0001\u0010§\u0001\"\u0006\bÿ\u0001\u0010©\u0001*\u0006\b\u0080\u0002\u0010¬\u0001R2\u0010\u0085\u0002\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0082\u0002\u0010§\u0001\"\u0006\b\u0083\u0002\u0010©\u0001*\u0006\b\u0084\u0002\u0010¬\u0001R2\u0010\u0089\u0002\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0086\u0002\u0010´\u0001\"\u0006\b\u0087\u0002\u0010¶\u0001*\u0006\b\u0088\u0002\u0010¬\u0001R9\u0010\u008e\u0002\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\u00138F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u008c\u0002\u0010G\u001a\u0006\b\u008a\u0002\u0010î\u0001\"\u0006\b\u008b\u0002\u0010ð\u0001*\u0006\b\u008d\u0002\u0010¬\u0001R9\u0010\u0093\u0002\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00158F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u0091\u0002\u0010G\u001a\u0006\b\u008f\u0002\u0010ô\u0001\"\u0006\b\u0090\u0002\u0010ö\u0001*\u0006\b\u0092\u0002\u0010¬\u0001R9\u0010\u0098\u0002\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u0096\u0002\u0010G\u001a\u0006\b\u0094\u0002\u0010´\u0001\"\u0006\b\u0095\u0002\u0010¶\u0001*\u0006\b\u0097\u0002\u0010¬\u0001R9\u0010\u009d\u0002\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u009b\u0002\u0010G\u001a\u0006\b\u0099\u0002\u0010§\u0001\"\u0006\b\u009a\u0002\u0010©\u0001*\u0006\b\u009c\u0002\u0010¬\u0001R9\u0010¢\u0002\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b \u0002\u0010G\u001a\u0006\b\u009e\u0002\u0010´\u0001\"\u0006\b\u009f\u0002\u0010¶\u0001*\u0006\b¡\u0002\u0010¬\u0001R9\u0010§\u0002\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b¥\u0002\u0010G\u001a\u0006\b£\u0002\u0010§\u0001\"\u0006\b¤\u0002\u0010©\u0001*\u0006\b¦\u0002\u0010¬\u0001R9\u0010¬\u0002\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bª\u0002\u0010G\u001a\u0006\b¨\u0002\u0010´\u0001\"\u0006\b©\u0002\u0010¶\u0001*\u0006\b«\u0002\u0010¬\u0001R9\u0010±\u0002\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b¯\u0002\u0010G\u001a\u0006\b\u00ad\u0002\u0010§\u0001\"\u0006\b®\u0002\u0010©\u0001*\u0006\b°\u0002\u0010¬\u0001R9\u0010¶\u0002\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b´\u0002\u0010G\u001a\u0006\b²\u0002\u0010´\u0001\"\u0006\b³\u0002\u0010¶\u0001*\u0006\bµ\u0002\u0010¬\u0001R9\u0010»\u0002\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b¹\u0002\u0010G\u001a\u0006\b·\u0002\u0010§\u0001\"\u0006\b¸\u0002\u0010©\u0001*\u0006\bº\u0002\u0010¬\u0001R9\u0010À\u0002\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b¾\u0002\u0010G\u001a\u0006\b¼\u0002\u0010´\u0001\"\u0006\b½\u0002\u0010¶\u0001*\u0006\b¿\u0002\u0010¬\u0001R2\u0010Ä\u0002\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÁ\u0002\u0010§\u0001\"\u0006\bÂ\u0002\u0010©\u0001*\u0006\bÃ\u0002\u0010¬\u0001R2\u0010È\u0002\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÅ\u0002\u0010´\u0001\"\u0006\bÆ\u0002\u0010¶\u0001*\u0006\bÇ\u0002\u0010¬\u0001R9\u0010Ï\u0002\u001a\u00020(2\u0006\u0010N\u001a\u00020(8F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÍ\u0002\u0010G\u001a\u0006\bÉ\u0002\u0010Ê\u0002\"\u0006\bË\u0002\u0010Ì\u0002*\u0006\bÎ\u0002\u0010¬\u0001R9\u0010Ô\u0002\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bÒ\u0002\u0010G\u001a\u0006\bÐ\u0002\u0010§\u0001\"\u0006\bÑ\u0002\u0010©\u0001*\u0006\bÓ\u0002\u0010¬\u0001R9\u0010Ù\u0002\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b×\u0002\u0010G\u001a\u0006\bÕ\u0002\u0010´\u0001\"\u0006\bÖ\u0002\u0010¶\u0001*\u0006\bØ\u0002\u0010¬\u0001R2\u0010Ý\u0002\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÚ\u0002\u0010§\u0001\"\u0006\bÛ\u0002\u0010©\u0001*\u0006\bÜ\u0002\u0010¬\u0001R2\u0010á\u0002\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÞ\u0002\u0010´\u0001\"\u0006\bß\u0002\u0010¶\u0001*\u0006\bà\u0002\u0010¬\u0001R2\u0010ç\u0002\u001a\u00020.2\u0006\u0010N\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bâ\u0002\u0010ã\u0002\"\u0006\bä\u0002\u0010å\u0002*\u0006\bæ\u0002\u0010¬\u0001R2\u0010ë\u0002\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bè\u0002\u0010§\u0001\"\u0006\bé\u0002\u0010©\u0001*\u0006\bê\u0002\u0010¬\u0001R9\u0010ò\u0002\u001a\u0002012\u0006\u0010N\u001a\u0002018F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\bð\u0002\u0010G\u001a\u0006\bì\u0002\u0010í\u0002\"\u0006\bî\u0002\u0010ï\u0002*\u0006\bñ\u0002\u0010¬\u0001R2\u0010ø\u0002\u001a\u0002032\u0006\u0010N\u001a\u0002038F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bó\u0002\u0010ô\u0002\"\u0006\bõ\u0002\u0010ö\u0002*\u0006\b÷\u0002\u0010¬\u0001R2\u0010ü\u0002\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bù\u0002\u0010´\u0001\"\u0006\bú\u0002\u0010¶\u0001*\u0006\bû\u0002\u0010¬\u0001R2\u0010\u0082\u0003\u001a\u0002062\u0006\u0010N\u001a\u0002068F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bý\u0002\u0010þ\u0002\"\u0006\bÿ\u0002\u0010\u0080\u0003*\u0006\b\u0081\u0003\u0010¬\u0001R2\u0010\u0086\u0003\u001a\u0002012\u0006\u0010N\u001a\u0002018F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0083\u0003\u0010í\u0002\"\u0006\b\u0084\u0003\u0010ï\u0002*\u0006\b\u0085\u0003\u0010¬\u0001R9\u0010\u008b\u0003\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u0089\u0003\u0010G\u001a\u0006\b\u0087\u0003\u0010§\u0001\"\u0006\b\u0088\u0003\u0010©\u0001*\u0006\b\u008a\u0003\u0010¬\u0001R9\u0010\u0090\u0003\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u008e\u0003\u0010G\u001a\u0006\b\u008c\u0003\u0010´\u0001\"\u0006\b\u008d\u0003\u0010¶\u0001*\u0006\b\u008f\u0003\u0010¬\u0001R2\u0010\u0096\u0003\u001a\u00020;2\u0006\u0010N\u001a\u00020;8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0091\u0003\u0010\u0092\u0003\"\u0006\b\u0093\u0003\u0010\u0094\u0003*\u0006\b\u0095\u0003\u0010¬\u0001R2\u0010\u009c\u0003\u001a\u00020=2\u0006\u0010N\u001a\u00020=8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0097\u0003\u0010\u0098\u0003\"\u0006\b\u0099\u0003\u0010\u009a\u0003*\u0006\b\u009b\u0003\u0010¬\u0001R2\u0010 \u0003\u001a\u00020=2\u0006\u0010N\u001a\u00020=8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u009d\u0003\u0010\u0098\u0003\"\u0006\b\u009e\u0003\u0010\u009a\u0003*\u0006\b\u009f\u0003\u0010¬\u0001R2\u0010¤\u0003\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¡\u0003\u0010ô\u0001\"\u0006\b¢\u0003\u0010ö\u0001*\u0006\b£\u0003\u0010¬\u0001R2\u0010ª\u0003\u001a\u00020A2\u0006\u0010N\u001a\u00020A8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¥\u0003\u0010¦\u0003\"\u0006\b§\u0003\u0010¨\u0003*\u0006\b©\u0003\u0010¬\u0001¨\u0006«\u0003"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialFillExtrusionEdgeRadius", "initialFillExtrusionAmbientOcclusionGroundAttenuation", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialFillExtrusionAmbientOcclusionGroundAttenuationTransition", "initialFillExtrusionAmbientOcclusionGroundRadius", "initialFillExtrusionAmbientOcclusionGroundRadiusTransition", "initialFillExtrusionAmbientOcclusionIntensity", "initialFillExtrusionAmbientOcclusionIntensityTransition", "initialFillExtrusionAmbientOcclusionRadius", "initialFillExtrusionAmbientOcclusionRadiusTransition", "initialFillExtrusionAmbientOcclusionWallRadius", "initialFillExtrusionAmbientOcclusionWallRadiusTransition", "initialFillExtrusionBase", "initialFillExtrusionBaseTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionBaseAlignmentValue;", "initialFillExtrusionBaseAlignment", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialFillExtrusionColor", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialFillExtrusionColorUseTheme", "initialFillExtrusionColorTransition", "initialFillExtrusionCutoffFadeRange", "initialFillExtrusionEmissiveStrength", "initialFillExtrusionEmissiveStrengthTransition", "initialFillExtrusionFloodLightColor", "initialFillExtrusionFloodLightColorUseTheme", "initialFillExtrusionFloodLightColorTransition", "initialFillExtrusionFloodLightGroundAttenuation", "initialFillExtrusionFloodLightGroundAttenuationTransition", "initialFillExtrusionFloodLightGroundRadius", "initialFillExtrusionFloodLightGroundRadiusTransition", "initialFillExtrusionFloodLightIntensity", "initialFillExtrusionFloodLightIntensityTransition", "initialFillExtrusionFloodLightWallRadius", "initialFillExtrusionFloodLightWallRadiusTransition", "initialFillExtrusionHeight", "initialFillExtrusionHeightTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionHeightAlignmentValue;", "initialFillExtrusionHeightAlignment", "initialFillExtrusionLineWidth", "initialFillExtrusionLineWidthTransition", "initialFillExtrusionOpacity", "initialFillExtrusionOpacityTransition", "Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "initialFillExtrusionPattern", "initialFillExtrusionPatternCrossFade", "Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "initialFillExtrusionRoundedRoof", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "initialFillExtrusionTranslate", "initialFillExtrusionTranslateTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionTranslateAnchorValue;", "initialFillExtrusionTranslateAnchor", "initialFillExtrusionVerticalGradient", "initialFillExtrusionVerticalScale", "initialFillExtrusionVerticalScaleTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "initialInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionBaseAlignmentValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionHeightAlignmentValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionTranslateAnchorValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "getInteractionsState$annotations", "interactionsState", "Lp3/p1;", "fillExtrusionEdgeRadiusState", "getFillExtrusionEdgeRadiusState$annotations", "fillExtrusionAmbientOcclusionGroundAttenuationState", "getFillExtrusionAmbientOcclusionGroundAttenuationState$annotations", "fillExtrusionAmbientOcclusionGroundAttenuationTransitionState", "getFillExtrusionAmbientOcclusionGroundAttenuationTransitionState$annotations", "fillExtrusionAmbientOcclusionGroundRadiusState", "getFillExtrusionAmbientOcclusionGroundRadiusState$annotations", "fillExtrusionAmbientOcclusionGroundRadiusTransitionState", "getFillExtrusionAmbientOcclusionGroundRadiusTransitionState$annotations", "fillExtrusionAmbientOcclusionIntensityState", "fillExtrusionAmbientOcclusionIntensityTransitionState", "fillExtrusionAmbientOcclusionRadiusState", "fillExtrusionAmbientOcclusionRadiusTransitionState", "fillExtrusionAmbientOcclusionWallRadiusState", "getFillExtrusionAmbientOcclusionWallRadiusState$annotations", "fillExtrusionAmbientOcclusionWallRadiusTransitionState", "getFillExtrusionAmbientOcclusionWallRadiusTransitionState$annotations", "fillExtrusionBaseState", "fillExtrusionBaseTransitionState", "fillExtrusionBaseAlignmentState", "getFillExtrusionBaseAlignmentState$annotations", "fillExtrusionColorState", "fillExtrusionColorUseThemeState", "getFillExtrusionColorUseThemeState$annotations", "fillExtrusionColorTransitionState", "fillExtrusionCutoffFadeRangeState", "fillExtrusionEmissiveStrengthState", "fillExtrusionEmissiveStrengthTransitionState", "fillExtrusionFloodLightColorState", "getFillExtrusionFloodLightColorState$annotations", "fillExtrusionFloodLightColorUseThemeState", "getFillExtrusionFloodLightColorUseThemeState$annotations", "fillExtrusionFloodLightColorTransitionState", "getFillExtrusionFloodLightColorTransitionState$annotations", "fillExtrusionFloodLightGroundAttenuationState", "getFillExtrusionFloodLightGroundAttenuationState$annotations", "fillExtrusionFloodLightGroundAttenuationTransitionState", "getFillExtrusionFloodLightGroundAttenuationTransitionState$annotations", "fillExtrusionFloodLightGroundRadiusState", "getFillExtrusionFloodLightGroundRadiusState$annotations", "fillExtrusionFloodLightGroundRadiusTransitionState", "getFillExtrusionFloodLightGroundRadiusTransitionState$annotations", "fillExtrusionFloodLightIntensityState", "getFillExtrusionFloodLightIntensityState$annotations", "fillExtrusionFloodLightIntensityTransitionState", "getFillExtrusionFloodLightIntensityTransitionState$annotations", "fillExtrusionFloodLightWallRadiusState", "getFillExtrusionFloodLightWallRadiusState$annotations", "fillExtrusionFloodLightWallRadiusTransitionState", "getFillExtrusionFloodLightWallRadiusTransitionState$annotations", "fillExtrusionHeightState", "fillExtrusionHeightTransitionState", "fillExtrusionHeightAlignmentState", "getFillExtrusionHeightAlignmentState$annotations", "fillExtrusionLineWidthState", "getFillExtrusionLineWidthState$annotations", "fillExtrusionLineWidthTransitionState", "getFillExtrusionLineWidthTransitionState$annotations", "fillExtrusionOpacityState", "fillExtrusionOpacityTransitionState", "fillExtrusionPatternState", "fillExtrusionPatternCrossFadeState", "fillExtrusionRoundedRoofState", "getFillExtrusionRoundedRoofState$annotations", "fillExtrusionTranslateState", "fillExtrusionTranslateTransitionState", "fillExtrusionTranslateAnchorState", "fillExtrusionVerticalGradientState", "fillExtrusionVerticalScaleState", "getFillExtrusionVerticalScaleState$annotations", "fillExtrusionVerticalScaleTransitionState", "getFillExtrusionVerticalScaleTransitionState$annotations", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "getFillExtrusionEdgeRadius", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setFillExtrusionEdgeRadius", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getFillExtrusionEdgeRadius$annotations", "getFillExtrusionEdgeRadius$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionLayerState;)Ljava/lang/Object;", "fillExtrusionEdgeRadius", "getFillExtrusionAmbientOcclusionGroundAttenuation", "setFillExtrusionAmbientOcclusionGroundAttenuation", "getFillExtrusionAmbientOcclusionGroundAttenuation$annotations", "getFillExtrusionAmbientOcclusionGroundAttenuation$delegate", "fillExtrusionAmbientOcclusionGroundAttenuation", "getFillExtrusionAmbientOcclusionGroundAttenuationTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setFillExtrusionAmbientOcclusionGroundAttenuationTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getFillExtrusionAmbientOcclusionGroundAttenuationTransition$annotations", "getFillExtrusionAmbientOcclusionGroundAttenuationTransition$delegate", "fillExtrusionAmbientOcclusionGroundAttenuationTransition", "getFillExtrusionAmbientOcclusionGroundRadius", "setFillExtrusionAmbientOcclusionGroundRadius", "getFillExtrusionAmbientOcclusionGroundRadius$annotations", "getFillExtrusionAmbientOcclusionGroundRadius$delegate", "fillExtrusionAmbientOcclusionGroundRadius", "getFillExtrusionAmbientOcclusionGroundRadiusTransition", "setFillExtrusionAmbientOcclusionGroundRadiusTransition", "getFillExtrusionAmbientOcclusionGroundRadiusTransition$annotations", "getFillExtrusionAmbientOcclusionGroundRadiusTransition$delegate", "fillExtrusionAmbientOcclusionGroundRadiusTransition", "getFillExtrusionAmbientOcclusionIntensity", "setFillExtrusionAmbientOcclusionIntensity", "getFillExtrusionAmbientOcclusionIntensity$delegate", "fillExtrusionAmbientOcclusionIntensity", "getFillExtrusionAmbientOcclusionIntensityTransition", "setFillExtrusionAmbientOcclusionIntensityTransition", "getFillExtrusionAmbientOcclusionIntensityTransition$delegate", "fillExtrusionAmbientOcclusionIntensityTransition", "getFillExtrusionAmbientOcclusionRadius", "setFillExtrusionAmbientOcclusionRadius", "getFillExtrusionAmbientOcclusionRadius$delegate", "fillExtrusionAmbientOcclusionRadius", "getFillExtrusionAmbientOcclusionRadiusTransition", "setFillExtrusionAmbientOcclusionRadiusTransition", "getFillExtrusionAmbientOcclusionRadiusTransition$delegate", "fillExtrusionAmbientOcclusionRadiusTransition", "getFillExtrusionAmbientOcclusionWallRadius", "setFillExtrusionAmbientOcclusionWallRadius", "getFillExtrusionAmbientOcclusionWallRadius$annotations", "getFillExtrusionAmbientOcclusionWallRadius$delegate", "fillExtrusionAmbientOcclusionWallRadius", "getFillExtrusionAmbientOcclusionWallRadiusTransition", "setFillExtrusionAmbientOcclusionWallRadiusTransition", "getFillExtrusionAmbientOcclusionWallRadiusTransition$annotations", "getFillExtrusionAmbientOcclusionWallRadiusTransition$delegate", "fillExtrusionAmbientOcclusionWallRadiusTransition", "getFillExtrusionBase", "setFillExtrusionBase", "getFillExtrusionBase$delegate", "fillExtrusionBase", "getFillExtrusionBaseTransition", "setFillExtrusionBaseTransition", "getFillExtrusionBaseTransition$delegate", "fillExtrusionBaseTransition", "getFillExtrusionBaseAlignment", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionBaseAlignmentValue;", "setFillExtrusionBaseAlignment", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionBaseAlignmentValue;)V", "getFillExtrusionBaseAlignment$annotations", "getFillExtrusionBaseAlignment$delegate", "fillExtrusionBaseAlignment", "getFillExtrusionColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setFillExtrusionColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getFillExtrusionColor$delegate", "fillExtrusionColor", "getFillExtrusionColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setFillExtrusionColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getFillExtrusionColorUseTheme$annotations", "getFillExtrusionColorUseTheme$delegate", "fillExtrusionColorUseTheme", "getFillExtrusionColorTransition", "setFillExtrusionColorTransition", "getFillExtrusionColorTransition$delegate", "fillExtrusionColorTransition", "getFillExtrusionCutoffFadeRange", "setFillExtrusionCutoffFadeRange", "getFillExtrusionCutoffFadeRange$delegate", "fillExtrusionCutoffFadeRange", "getFillExtrusionEmissiveStrength", "setFillExtrusionEmissiveStrength", "getFillExtrusionEmissiveStrength$delegate", "fillExtrusionEmissiveStrength", "getFillExtrusionEmissiveStrengthTransition", "setFillExtrusionEmissiveStrengthTransition", "getFillExtrusionEmissiveStrengthTransition$delegate", "fillExtrusionEmissiveStrengthTransition", "getFillExtrusionFloodLightColor", "setFillExtrusionFloodLightColor", "getFillExtrusionFloodLightColor$annotations", "getFillExtrusionFloodLightColor$delegate", "fillExtrusionFloodLightColor", "getFillExtrusionFloodLightColorUseTheme", "setFillExtrusionFloodLightColorUseTheme", "getFillExtrusionFloodLightColorUseTheme$annotations", "getFillExtrusionFloodLightColorUseTheme$delegate", "fillExtrusionFloodLightColorUseTheme", "getFillExtrusionFloodLightColorTransition", "setFillExtrusionFloodLightColorTransition", "getFillExtrusionFloodLightColorTransition$annotations", "getFillExtrusionFloodLightColorTransition$delegate", "fillExtrusionFloodLightColorTransition", "getFillExtrusionFloodLightGroundAttenuation", "setFillExtrusionFloodLightGroundAttenuation", "getFillExtrusionFloodLightGroundAttenuation$annotations", "getFillExtrusionFloodLightGroundAttenuation$delegate", "fillExtrusionFloodLightGroundAttenuation", "getFillExtrusionFloodLightGroundAttenuationTransition", "setFillExtrusionFloodLightGroundAttenuationTransition", "getFillExtrusionFloodLightGroundAttenuationTransition$annotations", "getFillExtrusionFloodLightGroundAttenuationTransition$delegate", "fillExtrusionFloodLightGroundAttenuationTransition", "getFillExtrusionFloodLightGroundRadius", "setFillExtrusionFloodLightGroundRadius", "getFillExtrusionFloodLightGroundRadius$annotations", "getFillExtrusionFloodLightGroundRadius$delegate", "fillExtrusionFloodLightGroundRadius", "getFillExtrusionFloodLightGroundRadiusTransition", "setFillExtrusionFloodLightGroundRadiusTransition", "getFillExtrusionFloodLightGroundRadiusTransition$annotations", "getFillExtrusionFloodLightGroundRadiusTransition$delegate", "fillExtrusionFloodLightGroundRadiusTransition", "getFillExtrusionFloodLightIntensity", "setFillExtrusionFloodLightIntensity", "getFillExtrusionFloodLightIntensity$annotations", "getFillExtrusionFloodLightIntensity$delegate", "fillExtrusionFloodLightIntensity", "getFillExtrusionFloodLightIntensityTransition", "setFillExtrusionFloodLightIntensityTransition", "getFillExtrusionFloodLightIntensityTransition$annotations", "getFillExtrusionFloodLightIntensityTransition$delegate", "fillExtrusionFloodLightIntensityTransition", "getFillExtrusionFloodLightWallRadius", "setFillExtrusionFloodLightWallRadius", "getFillExtrusionFloodLightWallRadius$annotations", "getFillExtrusionFloodLightWallRadius$delegate", "fillExtrusionFloodLightWallRadius", "getFillExtrusionFloodLightWallRadiusTransition", "setFillExtrusionFloodLightWallRadiusTransition", "getFillExtrusionFloodLightWallRadiusTransition$annotations", "getFillExtrusionFloodLightWallRadiusTransition$delegate", "fillExtrusionFloodLightWallRadiusTransition", "getFillExtrusionHeight", "setFillExtrusionHeight", "getFillExtrusionHeight$delegate", "fillExtrusionHeight", "getFillExtrusionHeightTransition", "setFillExtrusionHeightTransition", "getFillExtrusionHeightTransition$delegate", "fillExtrusionHeightTransition", "getFillExtrusionHeightAlignment", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionHeightAlignmentValue;", "setFillExtrusionHeightAlignment", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionHeightAlignmentValue;)V", "getFillExtrusionHeightAlignment$annotations", "getFillExtrusionHeightAlignment$delegate", "fillExtrusionHeightAlignment", "getFillExtrusionLineWidth", "setFillExtrusionLineWidth", "getFillExtrusionLineWidth$annotations", "getFillExtrusionLineWidth$delegate", "fillExtrusionLineWidth", "getFillExtrusionLineWidthTransition", "setFillExtrusionLineWidthTransition", "getFillExtrusionLineWidthTransition$annotations", "getFillExtrusionLineWidthTransition$delegate", "fillExtrusionLineWidthTransition", "getFillExtrusionOpacity", "setFillExtrusionOpacity", "getFillExtrusionOpacity$delegate", "fillExtrusionOpacity", "getFillExtrusionOpacityTransition", "setFillExtrusionOpacityTransition", "getFillExtrusionOpacityTransition$delegate", "fillExtrusionOpacityTransition", "getFillExtrusionPattern", "()Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "setFillExtrusionPattern", "(Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;)V", "getFillExtrusionPattern$delegate", "fillExtrusionPattern", "getFillExtrusionPatternCrossFade", "setFillExtrusionPatternCrossFade", "getFillExtrusionPatternCrossFade$delegate", "fillExtrusionPatternCrossFade", "getFillExtrusionRoundedRoof", "()Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "setFillExtrusionRoundedRoof", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;)V", "getFillExtrusionRoundedRoof$annotations", "getFillExtrusionRoundedRoof$delegate", "fillExtrusionRoundedRoof", "getFillExtrusionTranslate", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setFillExtrusionTranslate", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getFillExtrusionTranslate$delegate", "fillExtrusionTranslate", "getFillExtrusionTranslateTransition", "setFillExtrusionTranslateTransition", "getFillExtrusionTranslateTransition$delegate", "fillExtrusionTranslateTransition", "getFillExtrusionTranslateAnchor", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionTranslateAnchorValue;", "setFillExtrusionTranslateAnchor", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionTranslateAnchorValue;)V", "getFillExtrusionTranslateAnchor$delegate", "fillExtrusionTranslateAnchor", "getFillExtrusionVerticalGradient", "setFillExtrusionVerticalGradient", "getFillExtrusionVerticalGradient$delegate", "fillExtrusionVerticalGradient", "getFillExtrusionVerticalScale", "setFillExtrusionVerticalScale", "getFillExtrusionVerticalScale$annotations", "getFillExtrusionVerticalScale$delegate", "fillExtrusionVerticalScale", "getFillExtrusionVerticalScaleTransition", "setFillExtrusionVerticalScaleTransition", "getFillExtrusionVerticalScaleTransition$annotations", "getFillExtrusionVerticalScaleTransition$delegate", "fillExtrusionVerticalScaleTransition", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FillExtrusionLayerState {
    private final p1<DoubleValue> fillExtrusionAmbientOcclusionGroundAttenuationState;
    private final p1<Transition> fillExtrusionAmbientOcclusionGroundAttenuationTransitionState;
    private final p1<DoubleValue> fillExtrusionAmbientOcclusionGroundRadiusState;
    private final p1<Transition> fillExtrusionAmbientOcclusionGroundRadiusTransitionState;
    private final p1<DoubleValue> fillExtrusionAmbientOcclusionIntensityState;
    private final p1<Transition> fillExtrusionAmbientOcclusionIntensityTransitionState;
    private final p1<DoubleValue> fillExtrusionAmbientOcclusionRadiusState;
    private final p1<Transition> fillExtrusionAmbientOcclusionRadiusTransitionState;
    private final p1<DoubleValue> fillExtrusionAmbientOcclusionWallRadiusState;
    private final p1<Transition> fillExtrusionAmbientOcclusionWallRadiusTransitionState;
    private final p1<FillExtrusionBaseAlignmentValue> fillExtrusionBaseAlignmentState;
    private final p1<DoubleValue> fillExtrusionBaseState;
    private final p1<Transition> fillExtrusionBaseTransitionState;
    private final p1<ColorValue> fillExtrusionColorState;
    private final p1<Transition> fillExtrusionColorTransitionState;
    private final p1<StringValue> fillExtrusionColorUseThemeState;
    private final p1<DoubleValue> fillExtrusionCutoffFadeRangeState;
    private final p1<DoubleValue> fillExtrusionEdgeRadiusState;
    private final p1<DoubleValue> fillExtrusionEmissiveStrengthState;
    private final p1<Transition> fillExtrusionEmissiveStrengthTransitionState;
    private final p1<ColorValue> fillExtrusionFloodLightColorState;
    private final p1<Transition> fillExtrusionFloodLightColorTransitionState;
    private final p1<StringValue> fillExtrusionFloodLightColorUseThemeState;
    private final p1<DoubleValue> fillExtrusionFloodLightGroundAttenuationState;
    private final p1<Transition> fillExtrusionFloodLightGroundAttenuationTransitionState;
    private final p1<DoubleValue> fillExtrusionFloodLightGroundRadiusState;
    private final p1<Transition> fillExtrusionFloodLightGroundRadiusTransitionState;
    private final p1<DoubleValue> fillExtrusionFloodLightIntensityState;
    private final p1<Transition> fillExtrusionFloodLightIntensityTransitionState;
    private final p1<DoubleValue> fillExtrusionFloodLightWallRadiusState;
    private final p1<Transition> fillExtrusionFloodLightWallRadiusTransitionState;
    private final p1<FillExtrusionHeightAlignmentValue> fillExtrusionHeightAlignmentState;
    private final p1<DoubleValue> fillExtrusionHeightState;
    private final p1<Transition> fillExtrusionHeightTransitionState;
    private final p1<DoubleValue> fillExtrusionLineWidthState;
    private final p1<Transition> fillExtrusionLineWidthTransitionState;
    private final p1<DoubleValue> fillExtrusionOpacityState;
    private final p1<Transition> fillExtrusionOpacityTransitionState;
    private final p1<DoubleValue> fillExtrusionPatternCrossFadeState;
    private final p1<ImageValue> fillExtrusionPatternState;
    private final p1<BooleanValue> fillExtrusionRoundedRoofState;
    private final p1<FillExtrusionTranslateAnchorValue> fillExtrusionTranslateAnchorState;
    private final p1<DoubleListValue> fillExtrusionTranslateState;
    private final p1<Transition> fillExtrusionTranslateTransitionState;
    private final p1<BooleanValue> fillExtrusionVerticalGradientState;
    private final p1<DoubleValue> fillExtrusionVerticalScaleState;
    private final p1<Transition> fillExtrusionVerticalScaleTransitionState;
    private final p1<Filter> filterState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private FillExtrusionLayerState(DoubleValue doubleValue, DoubleValue doubleValue2, Transition transition, DoubleValue doubleValue3, Transition transition2, DoubleValue doubleValue4, Transition transition3, DoubleValue doubleValue5, Transition transition4, DoubleValue doubleValue6, Transition transition5, DoubleValue doubleValue7, Transition transition6, FillExtrusionBaseAlignmentValue fillExtrusionBaseAlignmentValue, ColorValue colorValue, StringValue stringValue, Transition transition7, DoubleValue doubleValue8, DoubleValue doubleValue9, Transition transition8, ColorValue colorValue2, StringValue stringValue2, Transition transition9, DoubleValue doubleValue10, Transition transition10, DoubleValue doubleValue11, Transition transition11, DoubleValue doubleValue12, Transition transition12, DoubleValue doubleValue13, Transition transition13, DoubleValue doubleValue14, Transition transition14, FillExtrusionHeightAlignmentValue fillExtrusionHeightAlignmentValue, DoubleValue doubleValue15, Transition transition15, DoubleValue doubleValue16, Transition transition16, ImageValue imageValue, DoubleValue doubleValue17, BooleanValue booleanValue, DoubleListValue doubleListValue, Transition transition17, FillExtrusionTranslateAnchorValue fillExtrusionTranslateAnchorValue, BooleanValue booleanValue2, DoubleValue doubleValue18, Transition transition18, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue3, Filter filter, LayerInteractionsState layerInteractionsState) {
        this.interactionsState = p0.n(layerInteractionsState);
        this.fillExtrusionEdgeRadiusState = p0.n(doubleValue);
        this.fillExtrusionAmbientOcclusionGroundAttenuationState = p0.n(doubleValue2);
        this.fillExtrusionAmbientOcclusionGroundAttenuationTransitionState = p0.n(transition);
        this.fillExtrusionAmbientOcclusionGroundRadiusState = p0.n(doubleValue3);
        this.fillExtrusionAmbientOcclusionGroundRadiusTransitionState = p0.n(transition2);
        this.fillExtrusionAmbientOcclusionIntensityState = p0.n(doubleValue4);
        this.fillExtrusionAmbientOcclusionIntensityTransitionState = p0.n(transition3);
        this.fillExtrusionAmbientOcclusionRadiusState = p0.n(doubleValue5);
        this.fillExtrusionAmbientOcclusionRadiusTransitionState = p0.n(transition4);
        this.fillExtrusionAmbientOcclusionWallRadiusState = p0.n(doubleValue6);
        this.fillExtrusionAmbientOcclusionWallRadiusTransitionState = p0.n(transition5);
        this.fillExtrusionBaseState = p0.n(doubleValue7);
        this.fillExtrusionBaseTransitionState = p0.n(transition6);
        this.fillExtrusionBaseAlignmentState = p0.n(fillExtrusionBaseAlignmentValue);
        this.fillExtrusionColorState = p0.n(colorValue);
        this.fillExtrusionColorUseThemeState = p0.n(stringValue);
        this.fillExtrusionColorTransitionState = p0.n(transition7);
        this.fillExtrusionCutoffFadeRangeState = p0.n(doubleValue8);
        this.fillExtrusionEmissiveStrengthState = p0.n(doubleValue9);
        this.fillExtrusionEmissiveStrengthTransitionState = p0.n(transition8);
        this.fillExtrusionFloodLightColorState = p0.n(colorValue2);
        this.fillExtrusionFloodLightColorUseThemeState = p0.n(stringValue2);
        this.fillExtrusionFloodLightColorTransitionState = p0.n(transition9);
        this.fillExtrusionFloodLightGroundAttenuationState = p0.n(doubleValue10);
        this.fillExtrusionFloodLightGroundAttenuationTransitionState = p0.n(transition10);
        this.fillExtrusionFloodLightGroundRadiusState = p0.n(doubleValue11);
        this.fillExtrusionFloodLightGroundRadiusTransitionState = p0.n(transition11);
        this.fillExtrusionFloodLightIntensityState = p0.n(doubleValue12);
        this.fillExtrusionFloodLightIntensityTransitionState = p0.n(transition12);
        this.fillExtrusionFloodLightWallRadiusState = p0.n(doubleValue13);
        this.fillExtrusionFloodLightWallRadiusTransitionState = p0.n(transition13);
        this.fillExtrusionHeightState = p0.n(doubleValue14);
        this.fillExtrusionHeightTransitionState = p0.n(transition14);
        this.fillExtrusionHeightAlignmentState = p0.n(fillExtrusionHeightAlignmentValue);
        this.fillExtrusionLineWidthState = p0.n(doubleValue15);
        this.fillExtrusionLineWidthTransitionState = p0.n(transition15);
        this.fillExtrusionOpacityState = p0.n(doubleValue16);
        this.fillExtrusionOpacityTransitionState = p0.n(transition16);
        this.fillExtrusionPatternState = p0.n(imageValue);
        this.fillExtrusionPatternCrossFadeState = p0.n(doubleValue17);
        this.fillExtrusionRoundedRoofState = p0.n(booleanValue);
        this.fillExtrusionTranslateState = p0.n(doubleListValue);
        this.fillExtrusionTranslateTransitionState = p0.n(transition17);
        this.fillExtrusionTranslateAnchorState = p0.n(fillExtrusionTranslateAnchorValue);
        this.fillExtrusionVerticalGradientState = p0.n(booleanValue2);
        this.fillExtrusionVerticalScaleState = p0.n(doubleValue18);
        this.fillExtrusionVerticalScaleTransitionState = p0.n(transition18);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue3);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundAttenuation$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundAttenuationState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundAttenuationTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundAttenuationTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundRadius$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundRadiusState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundRadiusTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundRadiusTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionWallRadius$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionAmbientOcclusionWallRadiusState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionWallRadiusTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionAmbientOcclusionWallRadiusTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionBaseAlignment$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionBaseAlignmentState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionEdgeRadius$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionEdgeRadiusState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColor$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightColorState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightColorTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundAttenuation$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightGroundAttenuationState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundAttenuationTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightGroundAttenuationTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundRadius$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightGroundRadiusState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundRadiusTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightGroundRadiusTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightIntensity$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightIntensityState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightIntensityTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightIntensityTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightWallRadius$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightWallRadiusState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightWallRadiusTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionFloodLightWallRadiusTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionHeightAlignment$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionHeightAlignmentState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionLineWidth$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionLineWidthState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionLineWidthTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionLineWidthTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionRoundedRoof$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionRoundedRoofState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionVerticalScale$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionVerticalScaleState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionVerticalScaleTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getFillExtrusionVerticalScaleTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getInteractionsState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(1564032697);
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
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionEdgeRadiusState, "fill-extrusion-edge-radius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionAmbientOcclusionGroundAttenuationState, "fill-extrusion-ambient-occlusion-ground-attenuation", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionAmbientOcclusionGroundAttenuationTransitionState, "fill-extrusion-ambient-occlusion-ground-attenuation-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionAmbientOcclusionGroundRadiusState, "fill-extrusion-ambient-occlusion-ground-radius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionAmbientOcclusionGroundRadiusTransitionState, "fill-extrusion-ambient-occlusion-ground-radius-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionAmbientOcclusionIntensityState, "fill-extrusion-ambient-occlusion-intensity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionAmbientOcclusionIntensityTransitionState, "fill-extrusion-ambient-occlusion-intensity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionAmbientOcclusionRadiusState, "fill-extrusion-ambient-occlusion-radius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionAmbientOcclusionRadiusTransitionState, "fill-extrusion-ambient-occlusion-radius-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionAmbientOcclusionWallRadiusState, "fill-extrusion-ambient-occlusion-wall-radius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionAmbientOcclusionWallRadiusTransitionState, "fill-extrusion-ambient-occlusion-wall-radius-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionBaseState, "fill-extrusion-base", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionBaseTransitionState, "fill-extrusion-base-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionBaseAlignmentState, "fill-extrusion-base-alignment", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionColorState, "fill-extrusion-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionColorUseThemeState, "fill-extrusion-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionColorTransitionState, "fill-extrusion-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionCutoffFadeRangeState, "fill-extrusion-cutoff-fade-range", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionEmissiveStrengthState, "fill-extrusion-emissive-strength", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionEmissiveStrengthTransitionState, "fill-extrusion-emissive-strength-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightColorState, "fill-extrusion-flood-light-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightColorUseThemeState, "fill-extrusion-flood-light-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightColorTransitionState, "fill-extrusion-flood-light-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightGroundAttenuationState, "fill-extrusion-flood-light-ground-attenuation", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightGroundAttenuationTransitionState, "fill-extrusion-flood-light-ground-attenuation-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightGroundRadiusState, "fill-extrusion-flood-light-ground-radius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightGroundRadiusTransitionState, "fill-extrusion-flood-light-ground-radius-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightIntensityState, "fill-extrusion-flood-light-intensity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightIntensityTransitionState, "fill-extrusion-flood-light-intensity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightWallRadiusState, "fill-extrusion-flood-light-wall-radius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionFloodLightWallRadiusTransitionState, "fill-extrusion-flood-light-wall-radius-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionHeightState, "fill-extrusion-height", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionHeightTransitionState, "fill-extrusion-height-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionHeightAlignmentState, "fill-extrusion-height-alignment", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionLineWidthState, "fill-extrusion-line-width", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionLineWidthTransitionState, "fill-extrusion-line-width-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionOpacityState, "fill-extrusion-opacity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionOpacityTransitionState, "fill-extrusion-opacity-transition", o0VarE, 384);
            PropertyTypesKt.AddImageWhenNotInitial(layerNode, this.fillExtrusionPatternState, "fill-extrusion-pattern", o0VarE, (i15 & 14) | 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionPatternCrossFadeState, "fill-extrusion-pattern-cross-fade", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionRoundedRoofState, "fill-extrusion-rounded-roof", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionTranslateState, "fill-extrusion-translate", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionTranslateTransitionState, "fill-extrusion-translate-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionTranslateAnchorState, "fill-extrusion-translate-anchor", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionVerticalGradientState, "fill-extrusion-vertical-gradient", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionVerticalScaleState, "fill-extrusion-vertical-scale", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.fillExtrusionVerticalScaleTransitionState, "fill-extrusion-vertical-scale-transition", o0VarE, 384);
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
        p2VarI0.f135219d = new FillExtrusionLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final DoubleValue getFillExtrusionAmbientOcclusionGroundAttenuation() {
        return this.fillExtrusionAmbientOcclusionGroundAttenuationState.getF182175a();
    }

    public final Transition getFillExtrusionAmbientOcclusionGroundAttenuationTransition() {
        return this.fillExtrusionAmbientOcclusionGroundAttenuationTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionAmbientOcclusionGroundRadius() {
        return this.fillExtrusionAmbientOcclusionGroundRadiusState.getF182175a();
    }

    public final Transition getFillExtrusionAmbientOcclusionGroundRadiusTransition() {
        return this.fillExtrusionAmbientOcclusionGroundRadiusTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionAmbientOcclusionIntensity() {
        return this.fillExtrusionAmbientOcclusionIntensityState.getF182175a();
    }

    public final Transition getFillExtrusionAmbientOcclusionIntensityTransition() {
        return this.fillExtrusionAmbientOcclusionIntensityTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionAmbientOcclusionRadius() {
        return this.fillExtrusionAmbientOcclusionRadiusState.getF182175a();
    }

    public final Transition getFillExtrusionAmbientOcclusionRadiusTransition() {
        return this.fillExtrusionAmbientOcclusionRadiusTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionAmbientOcclusionWallRadius() {
        return this.fillExtrusionAmbientOcclusionWallRadiusState.getF182175a();
    }

    public final Transition getFillExtrusionAmbientOcclusionWallRadiusTransition() {
        return this.fillExtrusionAmbientOcclusionWallRadiusTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionBase() {
        return this.fillExtrusionBaseState.getF182175a();
    }

    public final FillExtrusionBaseAlignmentValue getFillExtrusionBaseAlignment() {
        return this.fillExtrusionBaseAlignmentState.getF182175a();
    }

    public final Transition getFillExtrusionBaseTransition() {
        return this.fillExtrusionBaseTransitionState.getF182175a();
    }

    public final ColorValue getFillExtrusionColor() {
        return this.fillExtrusionColorState.getF182175a();
    }

    public final Transition getFillExtrusionColorTransition() {
        return this.fillExtrusionColorTransitionState.getF182175a();
    }

    public final StringValue getFillExtrusionColorUseTheme() {
        return this.fillExtrusionColorUseThemeState.getF182175a();
    }

    public final DoubleValue getFillExtrusionCutoffFadeRange() {
        return this.fillExtrusionCutoffFadeRangeState.getF182175a();
    }

    public final DoubleValue getFillExtrusionEdgeRadius() {
        return this.fillExtrusionEdgeRadiusState.getF182175a();
    }

    public final DoubleValue getFillExtrusionEmissiveStrength() {
        return this.fillExtrusionEmissiveStrengthState.getF182175a();
    }

    public final Transition getFillExtrusionEmissiveStrengthTransition() {
        return this.fillExtrusionEmissiveStrengthTransitionState.getF182175a();
    }

    public final ColorValue getFillExtrusionFloodLightColor() {
        return this.fillExtrusionFloodLightColorState.getF182175a();
    }

    public final Transition getFillExtrusionFloodLightColorTransition() {
        return this.fillExtrusionFloodLightColorTransitionState.getF182175a();
    }

    public final StringValue getFillExtrusionFloodLightColorUseTheme() {
        return this.fillExtrusionFloodLightColorUseThemeState.getF182175a();
    }

    public final DoubleValue getFillExtrusionFloodLightGroundAttenuation() {
        return this.fillExtrusionFloodLightGroundAttenuationState.getF182175a();
    }

    public final Transition getFillExtrusionFloodLightGroundAttenuationTransition() {
        return this.fillExtrusionFloodLightGroundAttenuationTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionFloodLightGroundRadius() {
        return this.fillExtrusionFloodLightGroundRadiusState.getF182175a();
    }

    public final Transition getFillExtrusionFloodLightGroundRadiusTransition() {
        return this.fillExtrusionFloodLightGroundRadiusTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionFloodLightIntensity() {
        return this.fillExtrusionFloodLightIntensityState.getF182175a();
    }

    public final Transition getFillExtrusionFloodLightIntensityTransition() {
        return this.fillExtrusionFloodLightIntensityTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionFloodLightWallRadius() {
        return this.fillExtrusionFloodLightWallRadiusState.getF182175a();
    }

    public final Transition getFillExtrusionFloodLightWallRadiusTransition() {
        return this.fillExtrusionFloodLightWallRadiusTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionHeight() {
        return this.fillExtrusionHeightState.getF182175a();
    }

    public final FillExtrusionHeightAlignmentValue getFillExtrusionHeightAlignment() {
        return this.fillExtrusionHeightAlignmentState.getF182175a();
    }

    public final Transition getFillExtrusionHeightTransition() {
        return this.fillExtrusionHeightTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionLineWidth() {
        return this.fillExtrusionLineWidthState.getF182175a();
    }

    public final Transition getFillExtrusionLineWidthTransition() {
        return this.fillExtrusionLineWidthTransitionState.getF182175a();
    }

    public final DoubleValue getFillExtrusionOpacity() {
        return this.fillExtrusionOpacityState.getF182175a();
    }

    public final Transition getFillExtrusionOpacityTransition() {
        return this.fillExtrusionOpacityTransitionState.getF182175a();
    }

    public final ImageValue getFillExtrusionPattern() {
        return this.fillExtrusionPatternState.getF182175a();
    }

    public final DoubleValue getFillExtrusionPatternCrossFade() {
        return this.fillExtrusionPatternCrossFadeState.getF182175a();
    }

    public final BooleanValue getFillExtrusionRoundedRoof() {
        return this.fillExtrusionRoundedRoofState.getF182175a();
    }

    public final DoubleListValue getFillExtrusionTranslate() {
        return this.fillExtrusionTranslateState.getF182175a();
    }

    public final FillExtrusionTranslateAnchorValue getFillExtrusionTranslateAnchor() {
        return this.fillExtrusionTranslateAnchorState.getF182175a();
    }

    public final Transition getFillExtrusionTranslateTransition() {
        return this.fillExtrusionTranslateTransitionState.getF182175a();
    }

    public final BooleanValue getFillExtrusionVerticalGradient() {
        return this.fillExtrusionVerticalGradientState.getF182175a();
    }

    public final DoubleValue getFillExtrusionVerticalScale() {
        return this.fillExtrusionVerticalScaleState.getF182175a();
    }

    public final Transition getFillExtrusionVerticalScaleTransition() {
        return this.fillExtrusionVerticalScaleTransitionState.getF182175a();
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

    public final void setFillExtrusionAmbientOcclusionGroundAttenuation(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionAmbientOcclusionGroundAttenuationState.setValue(doubleValue);
    }

    public final void setFillExtrusionAmbientOcclusionGroundAttenuationTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionAmbientOcclusionGroundAttenuationTransitionState.setValue(transition);
    }

    public final void setFillExtrusionAmbientOcclusionGroundRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionAmbientOcclusionGroundRadiusState.setValue(doubleValue);
    }

    public final void setFillExtrusionAmbientOcclusionGroundRadiusTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionAmbientOcclusionGroundRadiusTransitionState.setValue(transition);
    }

    public final void setFillExtrusionAmbientOcclusionIntensity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionAmbientOcclusionIntensityState.setValue(doubleValue);
    }

    public final void setFillExtrusionAmbientOcclusionIntensityTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionAmbientOcclusionIntensityTransitionState.setValue(transition);
    }

    public final void setFillExtrusionAmbientOcclusionRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionAmbientOcclusionRadiusState.setValue(doubleValue);
    }

    public final void setFillExtrusionAmbientOcclusionRadiusTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionAmbientOcclusionRadiusTransitionState.setValue(transition);
    }

    public final void setFillExtrusionAmbientOcclusionWallRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionAmbientOcclusionWallRadiusState.setValue(doubleValue);
    }

    public final void setFillExtrusionAmbientOcclusionWallRadiusTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionAmbientOcclusionWallRadiusTransitionState.setValue(transition);
    }

    public final void setFillExtrusionBase(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionBaseState.setValue(doubleValue);
    }

    public final void setFillExtrusionBaseAlignment(FillExtrusionBaseAlignmentValue fillExtrusionBaseAlignmentValue) {
        fillExtrusionBaseAlignmentValue.getClass();
        this.fillExtrusionBaseAlignmentState.setValue(fillExtrusionBaseAlignmentValue);
    }

    public final void setFillExtrusionBaseTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionBaseTransitionState.setValue(transition);
    }

    public final void setFillExtrusionColor(ColorValue colorValue) {
        colorValue.getClass();
        this.fillExtrusionColorState.setValue(colorValue);
    }

    public final void setFillExtrusionColorTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionColorTransitionState.setValue(transition);
    }

    public final void setFillExtrusionColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.fillExtrusionColorUseThemeState.setValue(stringValue);
    }

    public final void setFillExtrusionCutoffFadeRange(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionCutoffFadeRangeState.setValue(doubleValue);
    }

    public final void setFillExtrusionEdgeRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionEdgeRadiusState.setValue(doubleValue);
    }

    public final void setFillExtrusionEmissiveStrength(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionEmissiveStrengthState.setValue(doubleValue);
    }

    public final void setFillExtrusionEmissiveStrengthTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionEmissiveStrengthTransitionState.setValue(transition);
    }

    public final void setFillExtrusionFloodLightColor(ColorValue colorValue) {
        colorValue.getClass();
        this.fillExtrusionFloodLightColorState.setValue(colorValue);
    }

    public final void setFillExtrusionFloodLightColorTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionFloodLightColorTransitionState.setValue(transition);
    }

    public final void setFillExtrusionFloodLightColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.fillExtrusionFloodLightColorUseThemeState.setValue(stringValue);
    }

    public final void setFillExtrusionFloodLightGroundAttenuation(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionFloodLightGroundAttenuationState.setValue(doubleValue);
    }

    public final void setFillExtrusionFloodLightGroundAttenuationTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionFloodLightGroundAttenuationTransitionState.setValue(transition);
    }

    public final void setFillExtrusionFloodLightGroundRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionFloodLightGroundRadiusState.setValue(doubleValue);
    }

    public final void setFillExtrusionFloodLightGroundRadiusTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionFloodLightGroundRadiusTransitionState.setValue(transition);
    }

    public final void setFillExtrusionFloodLightIntensity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionFloodLightIntensityState.setValue(doubleValue);
    }

    public final void setFillExtrusionFloodLightIntensityTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionFloodLightIntensityTransitionState.setValue(transition);
    }

    public final void setFillExtrusionFloodLightWallRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionFloodLightWallRadiusState.setValue(doubleValue);
    }

    public final void setFillExtrusionFloodLightWallRadiusTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionFloodLightWallRadiusTransitionState.setValue(transition);
    }

    public final void setFillExtrusionHeight(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionHeightState.setValue(doubleValue);
    }

    public final void setFillExtrusionHeightAlignment(FillExtrusionHeightAlignmentValue fillExtrusionHeightAlignmentValue) {
        fillExtrusionHeightAlignmentValue.getClass();
        this.fillExtrusionHeightAlignmentState.setValue(fillExtrusionHeightAlignmentValue);
    }

    public final void setFillExtrusionHeightTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionHeightTransitionState.setValue(transition);
    }

    public final void setFillExtrusionLineWidth(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionLineWidthState.setValue(doubleValue);
    }

    public final void setFillExtrusionLineWidthTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionLineWidthTransitionState.setValue(transition);
    }

    public final void setFillExtrusionOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionOpacityState.setValue(doubleValue);
    }

    public final void setFillExtrusionOpacityTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionOpacityTransitionState.setValue(transition);
    }

    public final void setFillExtrusionPattern(ImageValue imageValue) {
        imageValue.getClass();
        this.fillExtrusionPatternState.setValue(imageValue);
    }

    public final void setFillExtrusionPatternCrossFade(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionPatternCrossFadeState.setValue(doubleValue);
    }

    public final void setFillExtrusionRoundedRoof(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.fillExtrusionRoundedRoofState.setValue(booleanValue);
    }

    public final void setFillExtrusionTranslate(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.fillExtrusionTranslateState.setValue(doubleListValue);
    }

    public final void setFillExtrusionTranslateAnchor(FillExtrusionTranslateAnchorValue fillExtrusionTranslateAnchorValue) {
        fillExtrusionTranslateAnchorValue.getClass();
        this.fillExtrusionTranslateAnchorState.setValue(fillExtrusionTranslateAnchorValue);
    }

    public final void setFillExtrusionTranslateTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionTranslateTransitionState.setValue(transition);
    }

    public final void setFillExtrusionVerticalGradient(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.fillExtrusionVerticalGradientState.setValue(booleanValue);
    }

    public final void setFillExtrusionVerticalScale(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.fillExtrusionVerticalScaleState.setValue(doubleValue);
    }

    public final void setFillExtrusionVerticalScaleTransition(Transition transition) {
        transition.getClass();
        this.fillExtrusionVerticalScaleTransitionState.setValue(transition);
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
    public FillExtrusionLayerState() {
        DoubleValue doubleValue = DoubleValue.INITIAL;
        Transition transition = Transition.INITIAL;
        FillExtrusionBaseAlignmentValue fillExtrusionBaseAlignmentValue = FillExtrusionBaseAlignmentValue.INITIAL;
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        FillExtrusionHeightAlignmentValue fillExtrusionHeightAlignmentValue = FillExtrusionHeightAlignmentValue.INITIAL;
        ImageValue imageValue = ImageValue.INITIAL;
        BooleanValue booleanValue = BooleanValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        FillExtrusionTranslateAnchorValue fillExtrusionTranslateAnchorValue = FillExtrusionTranslateAnchorValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(doubleValue, doubleValue, transition, doubleValue, transition, doubleValue, transition, doubleValue, transition, doubleValue, transition, doubleValue, transition, fillExtrusionBaseAlignmentValue, colorValue, stringValue, transition, doubleValue, doubleValue, transition, colorValue, stringValue, transition, doubleValue, transition, doubleValue, transition, doubleValue, transition, doubleValue, transition, doubleValue, transition, fillExtrusionHeightAlignmentValue, doubleValue, transition, doubleValue, transition, imageValue, doubleValue, booleanValue, doubleListValue, transition, fillExtrusionTranslateAnchorValue, booleanValue, doubleValue, transition, visibilityValue, longValue, longValue, stringValue, Filter.INITIAL, new LayerInteractionsState());
    }
}
