package com.mapbox.maps.extension.compose.style.layers.generated;

import com.google.firebase.analytics.FirebaseAnalytics;
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
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b×\u0001\b\u0007\u0018\u00002\u00020\u0001B±\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0010\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0010\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102B\t\b\u0016¢\u0006\u0004\b1\u00103J\u0017\u00109\u001a\u0002062\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R \u0010?\u001a\b\u0012\u0004\u0012\u00020\b0:8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b?\u0010<\u0012\u0004\b@\u00103R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010<R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010<R \u0010C\u001a\b\u0012\u0004\u0012\u00020\b0:8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bC\u0010<\u0012\u0004\bD\u00103R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010<R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010<R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010<R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00100:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010<R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010<R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010<R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010<R \u0010L\u001a\b\u0012\u0004\u0012\u00020\b0:8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bL\u0010<\u0012\u0004\bM\u00103R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010<R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00170:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010<R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010<R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010<R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010<R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010<R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001d0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010<R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010<R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010<R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010<R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010<R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00100:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010<R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010<R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010<R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00100:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010<R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010<R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010<R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020)0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010<R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020+0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010<R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020+0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010<R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010<R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020/0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010<R+\u0010k\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\be\u0010f\"\u0004\bg\u0010h*\u0004\bi\u0010jR+\u0010q\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o*\u0004\bp\u0010jR+\u0010w\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\br\u0010s\"\u0004\bt\u0010u*\u0004\bv\u0010jR1\u0010~\u001a\u00020\b2\u0006\u0010d\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b|\u00103\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{*\u0004\b}\u0010jR.\u0010\u0082\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0014\u001a\u0004\b\u007f\u0010m\"\u0005\b\u0080\u0001\u0010o*\u0005\b\u0081\u0001\u0010jR/\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0083\u0001\u0010s\"\u0005\b\u0084\u0001\u0010u*\u0005\b\u0085\u0001\u0010jR6\u0010\u008b\u0001\u001a\u00020\b2\u0006\u0010d\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u0089\u0001\u00103\u001a\u0005\b\u0087\u0001\u0010y\"\u0005\b\u0088\u0001\u0010{*\u0005\b\u008a\u0001\u0010jR/\u0010\u008f\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u008c\u0001\u0010m\"\u0005\b\u008d\u0001\u0010o*\u0005\b\u008e\u0001\u0010jR/\u0010\u0093\u0001\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0090\u0001\u0010f\"\u0005\b\u0091\u0001\u0010h*\u0005\b\u0092\u0001\u0010jR/\u0010\u0097\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0094\u0001\u0010m\"\u0005\b\u0095\u0001\u0010o*\u0005\b\u0096\u0001\u0010jR1\u0010\u009d\u0001\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001*\u0005\b\u009c\u0001\u0010jR/\u0010¡\u0001\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u009e\u0001\u0010f\"\u0005\b\u009f\u0001\u0010h*\u0005\b \u0001\u0010jR/\u0010¥\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¢\u0001\u0010m\"\u0005\b£\u0001\u0010o*\u0005\b¤\u0001\u0010jR/\u0010©\u0001\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¦\u0001\u0010s\"\u0005\b§\u0001\u0010u*\u0005\b¨\u0001\u0010jR6\u0010®\u0001\u001a\u00020\b2\u0006\u0010d\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b¬\u0001\u00103\u001a\u0005\bª\u0001\u0010y\"\u0005\b«\u0001\u0010{*\u0005\b\u00ad\u0001\u0010jR/\u0010²\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¯\u0001\u0010m\"\u0005\b°\u0001\u0010o*\u0005\b±\u0001\u0010jR1\u0010¸\u0001\u001a\u00020\u00172\u0006\u0010d\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001*\u0005\b·\u0001\u0010jR/\u0010¼\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¹\u0001\u0010m\"\u0005\bº\u0001\u0010o*\u0005\b»\u0001\u0010jR/\u0010À\u0001\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b½\u0001\u0010f\"\u0005\b¾\u0001\u0010h*\u0005\b¿\u0001\u0010jR/\u0010Ä\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÁ\u0001\u0010m\"\u0005\bÂ\u0001\u0010o*\u0005\bÃ\u0001\u0010jR/\u0010È\u0001\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÅ\u0001\u0010f\"\u0005\bÆ\u0001\u0010h*\u0005\bÇ\u0001\u0010jR1\u0010Î\u0001\u001a\u00020\u001d2\u0006\u0010d\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001*\u0005\bÍ\u0001\u0010jR/\u0010Ò\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÏ\u0001\u0010m\"\u0005\bÐ\u0001\u0010o*\u0005\bÑ\u0001\u0010jR/\u0010Ö\u0001\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÓ\u0001\u0010f\"\u0005\bÔ\u0001\u0010h*\u0005\bÕ\u0001\u0010jR/\u0010Ú\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b×\u0001\u0010m\"\u0005\bØ\u0001\u0010o*\u0005\bÙ\u0001\u0010jR/\u0010Þ\u0001\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÛ\u0001\u0010f\"\u0005\bÜ\u0001\u0010h*\u0005\bÝ\u0001\u0010jR1\u0010â\u0001\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bß\u0001\u0010\u0099\u0001\"\u0006\bà\u0001\u0010\u009b\u0001*\u0005\bá\u0001\u0010jR/\u0010æ\u0001\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bã\u0001\u0010f\"\u0005\bä\u0001\u0010h*\u0005\bå\u0001\u0010jR/\u0010ê\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bç\u0001\u0010m\"\u0005\bè\u0001\u0010o*\u0005\bé\u0001\u0010jR1\u0010î\u0001\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bë\u0001\u0010\u0099\u0001\"\u0006\bì\u0001\u0010\u009b\u0001*\u0005\bí\u0001\u0010jR/\u0010ò\u0001\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bï\u0001\u0010f\"\u0005\bð\u0001\u0010h*\u0005\bñ\u0001\u0010jR/\u0010ö\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bó\u0001\u0010m\"\u0005\bô\u0001\u0010o*\u0005\bõ\u0001\u0010jR1\u0010ü\u0001\u001a\u00020)2\u0006\u0010d\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001*\u0005\bû\u0001\u0010jR1\u0010\u0082\u0002\u001a\u00020+2\u0006\u0010d\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002*\u0005\b\u0081\u0002\u0010jR1\u0010\u0086\u0002\u001a\u00020+2\u0006\u0010d\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0083\u0002\u0010þ\u0001\"\u0006\b\u0084\u0002\u0010\u0080\u0002*\u0005\b\u0085\u0002\u0010jR/\u0010\u008a\u0002\u001a\u00020\b2\u0006\u0010d\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0087\u0002\u0010y\"\u0005\b\u0088\u0002\u0010{*\u0005\b\u0089\u0002\u0010jR1\u0010\u0090\u0002\u001a\u00020/2\u0006\u0010d\u001a\u00020/8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002*\u0005\b\u008f\u0002\u0010j¨\u0006\u0091\u0002"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/LocationIndicatorLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialAccuracyRadius", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialAccuracyRadiusTransition", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialAccuracyRadiusBorderColor", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialAccuracyRadiusBorderColorUseTheme", "initialAccuracyRadiusBorderColorTransition", "initialAccuracyRadiusColor", "initialAccuracyRadiusColorUseTheme", "initialAccuracyRadiusColorTransition", "initialBearing", "initialBearingTransition", "Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "initialBearingImage", "initialBearingImageSize", "initialBearingImageSizeTransition", "initialEmphasisCircleColor", "initialEmphasisCircleColorUseTheme", "initialEmphasisCircleColorTransition", "Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;", "initialEmphasisCircleGlowRange", "initialEmphasisCircleGlowRangeTransition", "initialEmphasisCircleRadius", "initialEmphasisCircleRadiusTransition", "initialImagePitchDisplacement", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "initialLocation", "initialLocationTransition", "initialLocationIndicatorOpacity", "initialLocationIndicatorOpacityTransition", "initialPerspectiveCompensation", "initialShadowImage", "initialShadowImageSize", "initialShadowImageSizeTransition", "initialTopImage", "initialTopImageSize", "initialTopImageSizeTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "<init>", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "Lp3/p1;", "accuracyRadiusState", "Lp3/p1;", "accuracyRadiusTransitionState", "accuracyRadiusBorderColorState", "accuracyRadiusBorderColorUseThemeState", "getAccuracyRadiusBorderColorUseThemeState$annotations", "accuracyRadiusBorderColorTransitionState", "accuracyRadiusColorState", "accuracyRadiusColorUseThemeState", "getAccuracyRadiusColorUseThemeState$annotations", "accuracyRadiusColorTransitionState", "bearingState", "bearingTransitionState", "bearingImageState", "bearingImageSizeState", "bearingImageSizeTransitionState", "emphasisCircleColorState", "emphasisCircleColorUseThemeState", "getEmphasisCircleColorUseThemeState$annotations", "emphasisCircleColorTransitionState", "emphasisCircleGlowRangeState", "emphasisCircleGlowRangeTransitionState", "emphasisCircleRadiusState", "emphasisCircleRadiusTransitionState", "imagePitchDisplacementState", "locationState", "locationTransitionState", "locationIndicatorOpacityState", "locationIndicatorOpacityTransitionState", "perspectiveCompensationState", "shadowImageState", "shadowImageSizeState", "shadowImageSizeTransitionState", "topImageState", "topImageSizeState", "topImageSizeTransitionState", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "<set-?>", "getAccuracyRadius", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setAccuracyRadius", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getAccuracyRadius$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/LocationIndicatorLayerState;)Ljava/lang/Object;", "accuracyRadius", "getAccuracyRadiusTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setAccuracyRadiusTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getAccuracyRadiusTransition$delegate", "accuracyRadiusTransition", "getAccuracyRadiusBorderColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setAccuracyRadiusBorderColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getAccuracyRadiusBorderColor$delegate", "accuracyRadiusBorderColor", "getAccuracyRadiusBorderColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setAccuracyRadiusBorderColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getAccuracyRadiusBorderColorUseTheme$annotations", "getAccuracyRadiusBorderColorUseTheme$delegate", "accuracyRadiusBorderColorUseTheme", "getAccuracyRadiusBorderColorTransition", "setAccuracyRadiusBorderColorTransition", "getAccuracyRadiusBorderColorTransition$delegate", "accuracyRadiusBorderColorTransition", "getAccuracyRadiusColor", "setAccuracyRadiusColor", "getAccuracyRadiusColor$delegate", "accuracyRadiusColor", "getAccuracyRadiusColorUseTheme", "setAccuracyRadiusColorUseTheme", "getAccuracyRadiusColorUseTheme$annotations", "getAccuracyRadiusColorUseTheme$delegate", "accuracyRadiusColorUseTheme", "getAccuracyRadiusColorTransition", "setAccuracyRadiusColorTransition", "getAccuracyRadiusColorTransition$delegate", "accuracyRadiusColorTransition", "getBearing", "setBearing", "getBearing$delegate", "bearing", "getBearingTransition", "setBearingTransition", "getBearingTransition$delegate", "bearingTransition", "getBearingImage", "()Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "setBearingImage", "(Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;)V", "getBearingImage$delegate", "bearingImage", "getBearingImageSize", "setBearingImageSize", "getBearingImageSize$delegate", "bearingImageSize", "getBearingImageSizeTransition", "setBearingImageSizeTransition", "getBearingImageSizeTransition$delegate", "bearingImageSizeTransition", "getEmphasisCircleColor", "setEmphasisCircleColor", "getEmphasisCircleColor$delegate", "emphasisCircleColor", "getEmphasisCircleColorUseTheme", "setEmphasisCircleColorUseTheme", "getEmphasisCircleColorUseTheme$annotations", "getEmphasisCircleColorUseTheme$delegate", "emphasisCircleColorUseTheme", "getEmphasisCircleColorTransition", "setEmphasisCircleColorTransition", "getEmphasisCircleColorTransition$delegate", "emphasisCircleColorTransition", "getEmphasisCircleGlowRange", "()Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;", "setEmphasisCircleGlowRange", "(Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;)V", "getEmphasisCircleGlowRange$delegate", "emphasisCircleGlowRange", "getEmphasisCircleGlowRangeTransition", "setEmphasisCircleGlowRangeTransition", "getEmphasisCircleGlowRangeTransition$delegate", "emphasisCircleGlowRangeTransition", "getEmphasisCircleRadius", "setEmphasisCircleRadius", "getEmphasisCircleRadius$delegate", "emphasisCircleRadius", "getEmphasisCircleRadiusTransition", "setEmphasisCircleRadiusTransition", "getEmphasisCircleRadiusTransition$delegate", "emphasisCircleRadiusTransition", "getImagePitchDisplacement", "setImagePitchDisplacement", "getImagePitchDisplacement$delegate", "imagePitchDisplacement", "getLocation", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setLocation", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getLocation$delegate", FirebaseAnalytics.Param.LOCATION, "getLocationTransition", "setLocationTransition", "getLocationTransition$delegate", "locationTransition", "getLocationIndicatorOpacity", "setLocationIndicatorOpacity", "getLocationIndicatorOpacity$delegate", "locationIndicatorOpacity", "getLocationIndicatorOpacityTransition", "setLocationIndicatorOpacityTransition", "getLocationIndicatorOpacityTransition$delegate", "locationIndicatorOpacityTransition", "getPerspectiveCompensation", "setPerspectiveCompensation", "getPerspectiveCompensation$delegate", "perspectiveCompensation", "getShadowImage", "setShadowImage", "getShadowImage$delegate", "shadowImage", "getShadowImageSize", "setShadowImageSize", "getShadowImageSize$delegate", "shadowImageSize", "getShadowImageSizeTransition", "setShadowImageSizeTransition", "getShadowImageSizeTransition$delegate", "shadowImageSizeTransition", "getTopImage", "setTopImage", "getTopImage$delegate", "topImage", "getTopImageSize", "setTopImageSize", "getTopImageSize$delegate", "topImageSize", "getTopImageSizeTransition", "setTopImageSizeTransition", "getTopImageSizeTransition$delegate", "topImageSizeTransition", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationIndicatorLayerState {
    private final p1<ColorValue> accuracyRadiusBorderColorState;
    private final p1<Transition> accuracyRadiusBorderColorTransitionState;
    private final p1<StringValue> accuracyRadiusBorderColorUseThemeState;
    private final p1<ColorValue> accuracyRadiusColorState;
    private final p1<Transition> accuracyRadiusColorTransitionState;
    private final p1<StringValue> accuracyRadiusColorUseThemeState;
    private final p1<DoubleValue> accuracyRadiusState;
    private final p1<Transition> accuracyRadiusTransitionState;
    private final p1<DoubleValue> bearingImageSizeState;
    private final p1<Transition> bearingImageSizeTransitionState;
    private final p1<ImageValue> bearingImageState;
    private final p1<DoubleValue> bearingState;
    private final p1<Transition> bearingTransitionState;
    private final p1<ColorValue> emphasisCircleColorState;
    private final p1<Transition> emphasisCircleColorTransitionState;
    private final p1<StringValue> emphasisCircleColorUseThemeState;
    private final p1<DoubleRangeValue> emphasisCircleGlowRangeState;
    private final p1<Transition> emphasisCircleGlowRangeTransitionState;
    private final p1<DoubleValue> emphasisCircleRadiusState;
    private final p1<Transition> emphasisCircleRadiusTransitionState;
    private final p1<Filter> filterState;
    private final p1<DoubleValue> imagePitchDisplacementState;
    private final p1<DoubleValue> locationIndicatorOpacityState;
    private final p1<Transition> locationIndicatorOpacityTransitionState;
    private final p1<DoubleListValue> locationState;
    private final p1<Transition> locationTransitionState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<DoubleValue> perspectiveCompensationState;
    private final p1<DoubleValue> shadowImageSizeState;
    private final p1<Transition> shadowImageSizeTransitionState;
    private final p1<ImageValue> shadowImageState;
    private final p1<StringValue> sourceLayerState;
    private final p1<DoubleValue> topImageSizeState;
    private final p1<Transition> topImageSizeTransitionState;
    private final p1<ImageValue> topImageState;
    private final p1<VisibilityValue> visibilityState;

    private LocationIndicatorLayerState(DoubleValue doubleValue, Transition transition, ColorValue colorValue, StringValue stringValue, Transition transition2, ColorValue colorValue2, StringValue stringValue2, Transition transition3, DoubleValue doubleValue2, Transition transition4, ImageValue imageValue, DoubleValue doubleValue3, Transition transition5, ColorValue colorValue3, StringValue stringValue3, Transition transition6, DoubleRangeValue doubleRangeValue, Transition transition7, DoubleValue doubleValue4, Transition transition8, DoubleValue doubleValue5, DoubleListValue doubleListValue, Transition transition9, DoubleValue doubleValue6, Transition transition10, DoubleValue doubleValue7, ImageValue imageValue2, DoubleValue doubleValue8, Transition transition11, ImageValue imageValue3, DoubleValue doubleValue9, Transition transition12, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue4, Filter filter) {
        this.accuracyRadiusState = p0.n(doubleValue);
        this.accuracyRadiusTransitionState = p0.n(transition);
        this.accuracyRadiusBorderColorState = p0.n(colorValue);
        this.accuracyRadiusBorderColorUseThemeState = p0.n(stringValue);
        this.accuracyRadiusBorderColorTransitionState = p0.n(transition2);
        this.accuracyRadiusColorState = p0.n(colorValue2);
        this.accuracyRadiusColorUseThemeState = p0.n(stringValue2);
        this.accuracyRadiusColorTransitionState = p0.n(transition3);
        this.bearingState = p0.n(doubleValue2);
        this.bearingTransitionState = p0.n(transition4);
        this.bearingImageState = p0.n(imageValue);
        this.bearingImageSizeState = p0.n(doubleValue3);
        this.bearingImageSizeTransitionState = p0.n(transition5);
        this.emphasisCircleColorState = p0.n(colorValue3);
        this.emphasisCircleColorUseThemeState = p0.n(stringValue3);
        this.emphasisCircleColorTransitionState = p0.n(transition6);
        this.emphasisCircleGlowRangeState = p0.n(doubleRangeValue);
        this.emphasisCircleGlowRangeTransitionState = p0.n(transition7);
        this.emphasisCircleRadiusState = p0.n(doubleValue4);
        this.emphasisCircleRadiusTransitionState = p0.n(transition8);
        this.imagePitchDisplacementState = p0.n(doubleValue5);
        this.locationState = p0.n(doubleListValue);
        this.locationTransitionState = p0.n(transition9);
        this.locationIndicatorOpacityState = p0.n(doubleValue6);
        this.locationIndicatorOpacityTransitionState = p0.n(transition10);
        this.perspectiveCompensationState = p0.n(doubleValue7);
        this.shadowImageState = p0.n(imageValue2);
        this.shadowImageSizeState = p0.n(doubleValue8);
        this.shadowImageSizeTransitionState = p0.n(transition11);
        this.topImageState = p0.n(imageValue3);
        this.topImageSizeState = p0.n(doubleValue9);
        this.topImageSizeTransitionState = p0.n(transition12);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue4);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getAccuracyRadiusBorderColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getAccuracyRadiusBorderColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getAccuracyRadiusColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getAccuracyRadiusColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getEmphasisCircleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getEmphasisCircleColorUseThemeState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(-1105313231);
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
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.accuracyRadiusState, "accuracy-radius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.accuracyRadiusTransitionState, "accuracy-radius-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.accuracyRadiusBorderColorState, "accuracy-radius-border-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.accuracyRadiusBorderColorUseThemeState, "accuracy-radius-border-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.accuracyRadiusBorderColorTransitionState, "accuracy-radius-border-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.accuracyRadiusColorState, "accuracy-radius-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.accuracyRadiusColorUseThemeState, "accuracy-radius-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.accuracyRadiusColorTransitionState, "accuracy-radius-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.bearingState, "bearing", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.bearingTransitionState, "bearing-transition", o0VarE, 384);
            int i16 = (i15 & 14) | 384;
            PropertyTypesKt.AddImageWhenNotInitial(layerNode, this.bearingImageState, "bearing-image", o0VarE, i16);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.bearingImageSizeState, "bearing-image-size", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.bearingImageSizeTransitionState, "bearing-image-size-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.emphasisCircleColorState, "emphasis-circle-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.emphasisCircleColorUseThemeState, "emphasis-circle-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.emphasisCircleColorTransitionState, "emphasis-circle-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.emphasisCircleGlowRangeState, "emphasis-circle-glow-range", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.emphasisCircleGlowRangeTransitionState, "emphasis-circle-glow-range-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.emphasisCircleRadiusState, "emphasis-circle-radius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.emphasisCircleRadiusTransitionState, "emphasis-circle-radius-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.imagePitchDisplacementState, "image-pitch-displacement", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.locationState, FirebaseAnalytics.Param.LOCATION, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.locationTransitionState, "location-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.locationIndicatorOpacityState, "location-indicator-opacity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.locationIndicatorOpacityTransitionState, "location-indicator-opacity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.perspectiveCompensationState, "perspective-compensation", o0VarE, 384);
            PropertyTypesKt.AddImageWhenNotInitial(layerNode, this.shadowImageState, "shadow-image", o0VarE, i16);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.shadowImageSizeState, "shadow-image-size", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.shadowImageSizeTransitionState, "shadow-image-size-transition", o0VarE, 384);
            PropertyTypesKt.AddImageWhenNotInitial(layerNode, this.topImageState, "top-image", o0VarE, i16);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.topImageSizeState, "top-image-size", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.topImageSizeTransitionState, "top-image-size-transition", o0VarE, 384);
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
        p2VarI0.f135219d = new LocationIndicatorLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final DoubleValue getAccuracyRadius() {
        return this.accuracyRadiusState.getF182175a();
    }

    public final ColorValue getAccuracyRadiusBorderColor() {
        return this.accuracyRadiusBorderColorState.getF182175a();
    }

    public final Transition getAccuracyRadiusBorderColorTransition() {
        return this.accuracyRadiusBorderColorTransitionState.getF182175a();
    }

    public final StringValue getAccuracyRadiusBorderColorUseTheme() {
        return this.accuracyRadiusBorderColorUseThemeState.getF182175a();
    }

    public final ColorValue getAccuracyRadiusColor() {
        return this.accuracyRadiusColorState.getF182175a();
    }

    public final Transition getAccuracyRadiusColorTransition() {
        return this.accuracyRadiusColorTransitionState.getF182175a();
    }

    public final StringValue getAccuracyRadiusColorUseTheme() {
        return this.accuracyRadiusColorUseThemeState.getF182175a();
    }

    public final Transition getAccuracyRadiusTransition() {
        return this.accuracyRadiusTransitionState.getF182175a();
    }

    public final DoubleValue getBearing() {
        return this.bearingState.getF182175a();
    }

    public final ImageValue getBearingImage() {
        return this.bearingImageState.getF182175a();
    }

    public final DoubleValue getBearingImageSize() {
        return this.bearingImageSizeState.getF182175a();
    }

    public final Transition getBearingImageSizeTransition() {
        return this.bearingImageSizeTransitionState.getF182175a();
    }

    public final Transition getBearingTransition() {
        return this.bearingTransitionState.getF182175a();
    }

    public final ColorValue getEmphasisCircleColor() {
        return this.emphasisCircleColorState.getF182175a();
    }

    public final Transition getEmphasisCircleColorTransition() {
        return this.emphasisCircleColorTransitionState.getF182175a();
    }

    public final StringValue getEmphasisCircleColorUseTheme() {
        return this.emphasisCircleColorUseThemeState.getF182175a();
    }

    public final DoubleRangeValue getEmphasisCircleGlowRange() {
        return this.emphasisCircleGlowRangeState.getF182175a();
    }

    public final Transition getEmphasisCircleGlowRangeTransition() {
        return this.emphasisCircleGlowRangeTransitionState.getF182175a();
    }

    public final DoubleValue getEmphasisCircleRadius() {
        return this.emphasisCircleRadiusState.getF182175a();
    }

    public final Transition getEmphasisCircleRadiusTransition() {
        return this.emphasisCircleRadiusTransitionState.getF182175a();
    }

    public final Filter getFilter() {
        return this.filterState.getF182175a();
    }

    public final DoubleValue getImagePitchDisplacement() {
        return this.imagePitchDisplacementState.getF182175a();
    }

    public final DoubleListValue getLocation() {
        return this.locationState.getF182175a();
    }

    public final DoubleValue getLocationIndicatorOpacity() {
        return this.locationIndicatorOpacityState.getF182175a();
    }

    public final Transition getLocationIndicatorOpacityTransition() {
        return this.locationIndicatorOpacityTransitionState.getF182175a();
    }

    public final Transition getLocationTransition() {
        return this.locationTransitionState.getF182175a();
    }

    public final LongValue getMaxZoom() {
        return this.maxZoomState.getF182175a();
    }

    public final LongValue getMinZoom() {
        return this.minZoomState.getF182175a();
    }

    public final DoubleValue getPerspectiveCompensation() {
        return this.perspectiveCompensationState.getF182175a();
    }

    public final ImageValue getShadowImage() {
        return this.shadowImageState.getF182175a();
    }

    public final DoubleValue getShadowImageSize() {
        return this.shadowImageSizeState.getF182175a();
    }

    public final Transition getShadowImageSizeTransition() {
        return this.shadowImageSizeTransitionState.getF182175a();
    }

    public final StringValue getSourceLayer() {
        return this.sourceLayerState.getF182175a();
    }

    public final ImageValue getTopImage() {
        return this.topImageState.getF182175a();
    }

    public final DoubleValue getTopImageSize() {
        return this.topImageSizeState.getF182175a();
    }

    public final Transition getTopImageSizeTransition() {
        return this.topImageSizeTransitionState.getF182175a();
    }

    public final VisibilityValue getVisibility() {
        return this.visibilityState.getF182175a();
    }

    public final void setAccuracyRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.accuracyRadiusState.setValue(doubleValue);
    }

    public final void setAccuracyRadiusBorderColor(ColorValue colorValue) {
        colorValue.getClass();
        this.accuracyRadiusBorderColorState.setValue(colorValue);
    }

    public final void setAccuracyRadiusBorderColorTransition(Transition transition) {
        transition.getClass();
        this.accuracyRadiusBorderColorTransitionState.setValue(transition);
    }

    public final void setAccuracyRadiusBorderColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.accuracyRadiusBorderColorUseThemeState.setValue(stringValue);
    }

    public final void setAccuracyRadiusColor(ColorValue colorValue) {
        colorValue.getClass();
        this.accuracyRadiusColorState.setValue(colorValue);
    }

    public final void setAccuracyRadiusColorTransition(Transition transition) {
        transition.getClass();
        this.accuracyRadiusColorTransitionState.setValue(transition);
    }

    public final void setAccuracyRadiusColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.accuracyRadiusColorUseThemeState.setValue(stringValue);
    }

    public final void setAccuracyRadiusTransition(Transition transition) {
        transition.getClass();
        this.accuracyRadiusTransitionState.setValue(transition);
    }

    public final void setBearing(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.bearingState.setValue(doubleValue);
    }

    public final void setBearingImage(ImageValue imageValue) {
        imageValue.getClass();
        this.bearingImageState.setValue(imageValue);
    }

    public final void setBearingImageSize(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.bearingImageSizeState.setValue(doubleValue);
    }

    public final void setBearingImageSizeTransition(Transition transition) {
        transition.getClass();
        this.bearingImageSizeTransitionState.setValue(transition);
    }

    public final void setBearingTransition(Transition transition) {
        transition.getClass();
        this.bearingTransitionState.setValue(transition);
    }

    public final void setEmphasisCircleColor(ColorValue colorValue) {
        colorValue.getClass();
        this.emphasisCircleColorState.setValue(colorValue);
    }

    public final void setEmphasisCircleColorTransition(Transition transition) {
        transition.getClass();
        this.emphasisCircleColorTransitionState.setValue(transition);
    }

    public final void setEmphasisCircleColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.emphasisCircleColorUseThemeState.setValue(stringValue);
    }

    public final void setEmphasisCircleGlowRange(DoubleRangeValue doubleRangeValue) {
        doubleRangeValue.getClass();
        this.emphasisCircleGlowRangeState.setValue(doubleRangeValue);
    }

    public final void setEmphasisCircleGlowRangeTransition(Transition transition) {
        transition.getClass();
        this.emphasisCircleGlowRangeTransitionState.setValue(transition);
    }

    public final void setEmphasisCircleRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.emphasisCircleRadiusState.setValue(doubleValue);
    }

    public final void setEmphasisCircleRadiusTransition(Transition transition) {
        transition.getClass();
        this.emphasisCircleRadiusTransitionState.setValue(transition);
    }

    public final void setFilter(Filter filter) {
        filter.getClass();
        this.filterState.setValue(filter);
    }

    public final void setImagePitchDisplacement(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.imagePitchDisplacementState.setValue(doubleValue);
    }

    public final void setLocation(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.locationState.setValue(doubleListValue);
    }

    public final void setLocationIndicatorOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.locationIndicatorOpacityState.setValue(doubleValue);
    }

    public final void setLocationIndicatorOpacityTransition(Transition transition) {
        transition.getClass();
        this.locationIndicatorOpacityTransitionState.setValue(transition);
    }

    public final void setLocationTransition(Transition transition) {
        transition.getClass();
        this.locationTransitionState.setValue(transition);
    }

    public final void setMaxZoom(LongValue longValue) {
        longValue.getClass();
        this.maxZoomState.setValue(longValue);
    }

    public final void setMinZoom(LongValue longValue) {
        longValue.getClass();
        this.minZoomState.setValue(longValue);
    }

    public final void setPerspectiveCompensation(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.perspectiveCompensationState.setValue(doubleValue);
    }

    public final void setShadowImage(ImageValue imageValue) {
        imageValue.getClass();
        this.shadowImageState.setValue(imageValue);
    }

    public final void setShadowImageSize(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.shadowImageSizeState.setValue(doubleValue);
    }

    public final void setShadowImageSizeTransition(Transition transition) {
        transition.getClass();
        this.shadowImageSizeTransitionState.setValue(transition);
    }

    public final void setSourceLayer(StringValue stringValue) {
        stringValue.getClass();
        this.sourceLayerState.setValue(stringValue);
    }

    public final void setTopImage(ImageValue imageValue) {
        imageValue.getClass();
        this.topImageState.setValue(imageValue);
    }

    public final void setTopImageSize(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.topImageSizeState.setValue(doubleValue);
    }

    public final void setTopImageSizeTransition(Transition transition) {
        transition.getClass();
        this.topImageSizeTransitionState.setValue(transition);
    }

    public final void setVisibility(VisibilityValue visibilityValue) {
        visibilityValue.getClass();
        this.visibilityState.setValue(visibilityValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocationIndicatorLayerState() {
        DoubleValue doubleValue = DoubleValue.INITIAL;
        Transition transition = Transition.INITIAL;
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        ImageValue imageValue = ImageValue.INITIAL;
        DoubleRangeValue doubleRangeValue = DoubleRangeValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(doubleValue, transition, colorValue, stringValue, transition, colorValue, stringValue, transition, doubleValue, transition, imageValue, doubleValue, transition, colorValue, stringValue, transition, doubleRangeValue, transition, doubleValue, transition, doubleValue, doubleListValue, transition, doubleValue, transition, doubleValue, imageValue, doubleValue, transition, imageValue, doubleValue, transition, visibilityValue, longValue, longValue, stringValue, Filter.INITIAL);
    }
}
