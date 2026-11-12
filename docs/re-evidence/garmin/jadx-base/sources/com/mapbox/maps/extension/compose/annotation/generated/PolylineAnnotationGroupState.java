package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.layers.properties.generated.LineCap;
import com.mapbox.maps.extension.style.layers.properties.generated.LineElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.layers.properties.generated.LineTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.LineWidthUnit;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager;
import e23.p;
import java.util.List;
import o4.d0;
import o4.f0;
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
@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0003\bÒ\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0080\u0003\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010*\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010+\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010,\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010.\u001a\u00020-ø\u0001\u0000¢\u0006\u0004\b/\u00100B\t\b\u0016¢\u0006\u0004\b/\u00101J\u0017\u00107\u001a\u0002042\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b8\u00106J\u0017\u00109\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b9\u00106J\u0017\u0010:\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b:\u00106J\u0017\u0010;\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b;\u00106J\u0017\u0010<\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b<\u00106J\u0017\u0010=\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b=\u00106J\u0017\u0010>\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b>\u00106J\u0017\u0010?\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b?\u00106J\u0017\u0010@\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b@\u00106J\u0017\u0010A\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bA\u00106J\u0017\u0010B\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bB\u00106J\u0017\u0010C\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bC\u00106J\u0017\u0010D\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bD\u00106J\u0017\u0010E\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bE\u00106J\u0017\u0010F\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bF\u00106J\u0017\u0010G\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bG\u00106J\u0017\u0010H\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bH\u00106J\u0017\u0010I\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bI\u00106J\u0017\u0010J\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bJ\u00106J\u0017\u0010K\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bK\u00106J\u0017\u0010L\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bL\u00106J\u0017\u0010M\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bM\u00106J\u0017\u0010N\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bN\u00106J\u0017\u0010O\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bO\u00106J\u0017\u0010P\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bP\u00106J\u0017\u0010Q\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bQ\u00106J\u0017\u0010R\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bR\u00106J\u0017\u0010S\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bS\u00106J\u0017\u0010T\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bT\u00106J\u0017\u0010U\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bU\u00106J\u0017\u0010V\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bV\u00106J\u0017\u0010W\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bW\u00106J\u0017\u0010X\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bX\u00106J\u0017\u0010Y\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bY\u00106R+\u0010a\u001a\u00020-2\u0006\u0010Z\u001a\u00020-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R/\u0010g\u001a\u0004\u0018\u00010\u00022\b\u0010Z\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010\\\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR5\u0010n\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bh\u0010\\\u0012\u0004\bm\u00101\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR5\u0010u\u001a\u0004\u0018\u00010\u00062\b\u0010Z\u001a\u0004\u0018\u00010\u00068F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bo\u0010\\\u0012\u0004\bt\u00101\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR/\u0010{\u001a\u0004\u0018\u00010\b2\b\u0010Z\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010\\\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR/\u0010\u007f\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b|\u0010\\\u001a\u0004\b}\u0010j\"\u0004\b~\u0010lR3\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010\\\u001a\u0005\b\u0081\u0001\u0010j\"\u0005\b\u0082\u0001\u0010lR3\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010\\\u001a\u0005\b\u0085\u0001\u0010j\"\u0005\b\u0086\u0001\u0010lR<\u0010\u008e\u0001\u001a\u0004\u0018\u00010\r2\b\u0010Z\u001a\u0004\u0018\u00010\r8F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0088\u0001\u0010\\\u0012\u0005\b\u008d\u0001\u00101\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R:\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0087\u008e\u0002¢\u0006\u001c\n\u0005\b\u008f\u0001\u0010\\\u0012\u0005\b\u0092\u0001\u00101\u001a\u0005\b\u0090\u0001\u0010j\"\u0005\b\u0091\u0001\u0010lR3\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010\\\u001a\u0005\b\u0095\u0001\u0010j\"\u0005\b\u0096\u0001\u0010lR>\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010Z\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\b\u0098\u0001\u0010\\\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R3\u0010¡\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010\\\u001a\u0005\b\u009f\u0001\u0010j\"\u0005\b \u0001\u0010lR>\u0010¥\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010Z\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\b¢\u0001\u0010\\\u001a\u0006\b£\u0001\u0010\u009a\u0001\"\u0006\b¤\u0001\u0010\u009c\u0001RA\u0010«\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b¦\u0001\u0010\\\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R3\u0010¯\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¬\u0001\u0010\\\u001a\u0005\b\u00ad\u0001\u0010j\"\u0005\b®\u0001\u0010lR3\u0010³\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b°\u0001\u0010\\\u001a\u0005\b±\u0001\u0010j\"\u0005\b²\u0001\u0010lR3\u0010·\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b´\u0001\u0010\\\u001a\u0005\bµ\u0001\u0010j\"\u0005\b¶\u0001\u0010lR3\u0010»\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¸\u0001\u0010\\\u001a\u0005\b¹\u0001\u0010j\"\u0005\bº\u0001\u0010lR3\u0010¿\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¼\u0001\u0010\\\u001a\u0005\b½\u0001\u0010j\"\u0005\b¾\u0001\u0010lR3\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÀ\u0001\u0010\\\u001a\u0005\bÁ\u0001\u0010j\"\u0005\bÂ\u0001\u0010lR5\u0010É\u0001\u001a\u0004\u0018\u00010\u001d2\b\u0010Z\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bÄ\u0001\u0010\\\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R3\u0010Í\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÊ\u0001\u0010\\\u001a\u0005\bË\u0001\u0010j\"\u0005\bÌ\u0001\u0010lRA\u0010Ñ\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bÎ\u0001\u0010\\\u001a\u0006\bÏ\u0001\u0010¨\u0001\"\u0006\bÐ\u0001\u0010ª\u0001R5\u0010×\u0001\u001a\u0004\u0018\u00010!2\b\u0010Z\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bÒ\u0001\u0010\\\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001RE\u0010Ü\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010Z\u001a\u0004\u0018\u00010\u00118F@FX\u0087\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u001e\n\u0005\bØ\u0001\u0010\\\u0012\u0005\bÛ\u0001\u00101\u001a\u0006\bÙ\u0001\u0010\u009a\u0001\"\u0006\bÚ\u0001\u0010\u009c\u0001RH\u0010á\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\bÝ\u0001\u0010\\\u0012\u0005\bà\u0001\u00101\u001a\u0006\bÞ\u0001\u0010¨\u0001\"\u0006\bß\u0001\u0010ª\u0001RA\u0010å\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bâ\u0001\u0010\\\u001a\u0006\bã\u0001\u0010¨\u0001\"\u0006\bä\u0001\u0010ª\u0001R3\u0010é\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bæ\u0001\u0010\\\u001a\u0005\bç\u0001\u0010j\"\u0005\bè\u0001\u0010lR3\u0010í\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bê\u0001\u0010\\\u001a\u0005\bë\u0001\u0010j\"\u0005\bì\u0001\u0010lR3\u0010ñ\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bî\u0001\u0010\\\u001a\u0005\bï\u0001\u0010j\"\u0005\bð\u0001\u0010lR<\u0010ö\u0001\u001a\u0004\u0018\u00010\u001d2\b\u0010Z\u001a\u0004\u0018\u00010\u001d8F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\bò\u0001\u0010\\\u0012\u0005\bõ\u0001\u00101\u001a\u0006\bó\u0001\u0010Æ\u0001\"\u0006\bô\u0001\u0010È\u0001R<\u0010û\u0001\u001a\u0004\u0018\u00010\u001d2\b\u0010Z\u001a\u0004\u0018\u00010\u001d8F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b÷\u0001\u0010\\\u0012\u0005\bú\u0001\u00101\u001a\u0006\bø\u0001\u0010Æ\u0001\"\u0006\bù\u0001\u0010È\u0001R<\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u001d2\b\u0010Z\u001a\u0004\u0018\u00010\u001d8F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\bü\u0001\u0010\\\u0012\u0005\bÿ\u0001\u00101\u001a\u0006\bý\u0001\u0010Æ\u0001\"\u0006\bþ\u0001\u0010È\u0001R<\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u001d2\b\u0010Z\u001a\u0004\u0018\u00010\u001d8F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0081\u0002\u0010\\\u0012\u0005\b\u0084\u0002\u00101\u001a\u0006\b\u0082\u0002\u0010Æ\u0001\"\u0006\b\u0083\u0002\u0010È\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0086\u0002"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationGroupState;", "", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "initialLineCap", "", "initialLineCrossSlope", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "initialLineElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "initialLineJoin", "initialLineMiterLimit", "initialLineRoundLimit", "initialLineSortKey", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "initialLineWidthUnit", "initialLineZOffset", "initialLineBlur", "Lo4/d0;", "initialLineBorderColor", "initialLineBorderWidth", "initialLineColor", "", "initialLineDasharray", "initialLineDepthOcclusionFactor", "initialLineEmissiveStrength", "initialLineGapWidth", "initialLineOcclusionOpacity", "initialLineOffset", "initialLineOpacity", "", "initialLinePattern", "initialLinePatternCrossFade", "initialLineTranslate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "initialLineTranslateAnchor", "initialLineTrimColor", "initialLineTrimFadeRange", "initialLineTrimOffset", "initialLineWidth", "initialMaxZoom", "initialMinZoom", "initialLineBorderColorUseTheme", "initialLineColorUseTheme", "initialLineGradientUseTheme", "initialLineTrimColorUseTheme", "Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationGroupInteractionsState;", "initialPolylineAnnotationGroupInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;Ljava/lang/Double;Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;Ljava/lang/Double;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Lo4/d0;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;Lo4/d0;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationGroupInteractionsState;)V", "()V", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager;", "annotationManager", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager;Lp3/m;I)V", "UpdateProperties", "UpdateLineCap", "UpdateLineCrossSlope", "UpdateLineElevationReference", "UpdateLineJoin", "UpdateLineMiterLimit", "UpdateLineRoundLimit", "UpdateLineSortKey", "UpdateLineWidthUnit", "UpdateLineZOffset", "UpdateLineBlur", "UpdateLineBorderColor", "UpdateLineBorderWidth", "UpdateLineColor", "UpdateLineDasharray", "UpdateLineDepthOcclusionFactor", "UpdateLineEmissiveStrength", "UpdateLineGapWidth", "UpdateLineOcclusionOpacity", "UpdateLineOffset", "UpdateLineOpacity", "UpdateLinePattern", "UpdateLinePatternCrossFade", "UpdateLineTranslate", "UpdateLineTranslateAnchor", "UpdateLineTrimColor", "UpdateLineTrimFadeRange", "UpdateLineTrimOffset", "UpdateLineWidth", "UpdateMaxZoom", "UpdateMinZoom", "UpdateLineBorderColorUseTheme", "UpdateLineColorUseTheme", "UpdateLineGradientUseTheme", "UpdateLineTrimColorUseTheme", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationGroupInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationGroupInteractionsState;)V", "interactionsState", "lineCap$delegate", "getLineCap", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "setLineCap", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;)V", "lineCap", "lineCrossSlope$delegate", "getLineCrossSlope", "()Ljava/lang/Double;", "setLineCrossSlope", "(Ljava/lang/Double;)V", "getLineCrossSlope$annotations", "lineCrossSlope", "lineElevationReference$delegate", "getLineElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "setLineElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;)V", "getLineElevationReference$annotations", "lineElevationReference", "lineJoin$delegate", "getLineJoin", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "setLineJoin", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;)V", "lineJoin", "lineMiterLimit$delegate", "getLineMiterLimit", "setLineMiterLimit", "lineMiterLimit", "lineRoundLimit$delegate", "getLineRoundLimit", "setLineRoundLimit", "lineRoundLimit", "lineSortKey$delegate", "getLineSortKey", "setLineSortKey", "lineSortKey", "lineWidthUnit$delegate", "getLineWidthUnit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "setLineWidthUnit", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;)V", "getLineWidthUnit$annotations", "lineWidthUnit", "lineZOffset$delegate", "getLineZOffset", "setLineZOffset", "getLineZOffset$annotations", "lineZOffset", "lineBlur$delegate", "getLineBlur", "setLineBlur", "lineBlur", "lineBorderColor$delegate", "getLineBorderColor-QN2ZGVo", "()Lo4/d0;", "setLineBorderColor-Y2TPw74", "(Lo4/d0;)V", "lineBorderColor", "lineBorderWidth$delegate", "getLineBorderWidth", "setLineBorderWidth", "lineBorderWidth", "lineColor$delegate", "getLineColor-QN2ZGVo", "setLineColor-Y2TPw74", "lineColor", "lineDasharray$delegate", "getLineDasharray", "()Ljava/util/List;", "setLineDasharray", "(Ljava/util/List;)V", "lineDasharray", "lineDepthOcclusionFactor$delegate", "getLineDepthOcclusionFactor", "setLineDepthOcclusionFactor", "lineDepthOcclusionFactor", "lineEmissiveStrength$delegate", "getLineEmissiveStrength", "setLineEmissiveStrength", "lineEmissiveStrength", "lineGapWidth$delegate", "getLineGapWidth", "setLineGapWidth", "lineGapWidth", "lineOcclusionOpacity$delegate", "getLineOcclusionOpacity", "setLineOcclusionOpacity", "lineOcclusionOpacity", "lineOffset$delegate", "getLineOffset", "setLineOffset", "lineOffset", "lineOpacity$delegate", "getLineOpacity", "setLineOpacity", "lineOpacity", "linePattern$delegate", "getLinePattern", "()Ljava/lang/String;", "setLinePattern", "(Ljava/lang/String;)V", "linePattern", "linePatternCrossFade$delegate", "getLinePatternCrossFade", "setLinePatternCrossFade", "linePatternCrossFade", "lineTranslate$delegate", "getLineTranslate", "setLineTranslate", "lineTranslate", "lineTranslateAnchor$delegate", "getLineTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "setLineTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;)V", "lineTranslateAnchor", "lineTrimColor$delegate", "getLineTrimColor-QN2ZGVo", "setLineTrimColor-Y2TPw74", "getLineTrimColor-QN2ZGVo$annotations", "lineTrimColor", "lineTrimFadeRange$delegate", "getLineTrimFadeRange", "setLineTrimFadeRange", "getLineTrimFadeRange$annotations", "lineTrimFadeRange", "lineTrimOffset$delegate", "getLineTrimOffset", "setLineTrimOffset", "lineTrimOffset", "lineWidth$delegate", "getLineWidth", "setLineWidth", "lineWidth", "maxZoom$delegate", "getMaxZoom", "setMaxZoom", "maxZoom", "minZoom$delegate", "getMinZoom", "setMinZoom", "minZoom", "lineBorderColorUseTheme$delegate", "getLineBorderColorUseTheme", "setLineBorderColorUseTheme", "getLineBorderColorUseTheme$annotations", "lineBorderColorUseTheme", "lineColorUseTheme$delegate", "getLineColorUseTheme", "setLineColorUseTheme", "getLineColorUseTheme$annotations", "lineColorUseTheme", "lineGradientUseTheme$delegate", "getLineGradientUseTheme", "setLineGradientUseTheme", "getLineGradientUseTheme$annotations", "lineGradientUseTheme", "lineTrimColorUseTheme$delegate", "getLineTrimColorUseTheme", "setLineTrimColorUseTheme", "getLineTrimColorUseTheme$annotations", "lineTrimColorUseTheme", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationGroupState {

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;

    /* JADX INFO: renamed from: lineBlur$delegate, reason: from kotlin metadata */
    private final p1 lineBlur;

    /* JADX INFO: renamed from: lineBorderColor$delegate, reason: from kotlin metadata */
    private final p1 lineBorderColor;

    /* JADX INFO: renamed from: lineBorderColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 lineBorderColorUseTheme;

    /* JADX INFO: renamed from: lineBorderWidth$delegate, reason: from kotlin metadata */
    private final p1 lineBorderWidth;

    /* JADX INFO: renamed from: lineCap$delegate, reason: from kotlin metadata */
    private final p1 lineCap;

    /* JADX INFO: renamed from: lineColor$delegate, reason: from kotlin metadata */
    private final p1 lineColor;

    /* JADX INFO: renamed from: lineColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 lineColorUseTheme;

    /* JADX INFO: renamed from: lineCrossSlope$delegate, reason: from kotlin metadata */
    private final p1 lineCrossSlope;

    /* JADX INFO: renamed from: lineDasharray$delegate, reason: from kotlin metadata */
    private final p1 lineDasharray;

    /* JADX INFO: renamed from: lineDepthOcclusionFactor$delegate, reason: from kotlin metadata */
    private final p1 lineDepthOcclusionFactor;

    /* JADX INFO: renamed from: lineElevationReference$delegate, reason: from kotlin metadata */
    private final p1 lineElevationReference;

    /* JADX INFO: renamed from: lineEmissiveStrength$delegate, reason: from kotlin metadata */
    private final p1 lineEmissiveStrength;

    /* JADX INFO: renamed from: lineGapWidth$delegate, reason: from kotlin metadata */
    private final p1 lineGapWidth;

    /* JADX INFO: renamed from: lineGradientUseTheme$delegate, reason: from kotlin metadata */
    private final p1 lineGradientUseTheme;

    /* JADX INFO: renamed from: lineJoin$delegate, reason: from kotlin metadata */
    private final p1 lineJoin;

    /* JADX INFO: renamed from: lineMiterLimit$delegate, reason: from kotlin metadata */
    private final p1 lineMiterLimit;

    /* JADX INFO: renamed from: lineOcclusionOpacity$delegate, reason: from kotlin metadata */
    private final p1 lineOcclusionOpacity;

    /* JADX INFO: renamed from: lineOffset$delegate, reason: from kotlin metadata */
    private final p1 lineOffset;

    /* JADX INFO: renamed from: lineOpacity$delegate, reason: from kotlin metadata */
    private final p1 lineOpacity;

    /* JADX INFO: renamed from: linePattern$delegate, reason: from kotlin metadata */
    private final p1 linePattern;

    /* JADX INFO: renamed from: linePatternCrossFade$delegate, reason: from kotlin metadata */
    private final p1 linePatternCrossFade;

    /* JADX INFO: renamed from: lineRoundLimit$delegate, reason: from kotlin metadata */
    private final p1 lineRoundLimit;

    /* JADX INFO: renamed from: lineSortKey$delegate, reason: from kotlin metadata */
    private final p1 lineSortKey;

    /* JADX INFO: renamed from: lineTranslate$delegate, reason: from kotlin metadata */
    private final p1 lineTranslate;

    /* JADX INFO: renamed from: lineTranslateAnchor$delegate, reason: from kotlin metadata */
    private final p1 lineTranslateAnchor;

    /* JADX INFO: renamed from: lineTrimColor$delegate, reason: from kotlin metadata */
    private final p1 lineTrimColor;

    /* JADX INFO: renamed from: lineTrimColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 lineTrimColorUseTheme;

    /* JADX INFO: renamed from: lineTrimFadeRange$delegate, reason: from kotlin metadata */
    private final p1 lineTrimFadeRange;

    /* JADX INFO: renamed from: lineTrimOffset$delegate, reason: from kotlin metadata */
    private final p1 lineTrimOffset;

    /* JADX INFO: renamed from: lineWidth$delegate, reason: from kotlin metadata */
    private final p1 lineWidth;

    /* JADX INFO: renamed from: lineWidthUnit$delegate, reason: from kotlin metadata */
    private final p1 lineWidthUnit;

    /* JADX INFO: renamed from: lineZOffset$delegate, reason: from kotlin metadata */
    private final p1 lineZOffset;

    /* JADX INFO: renamed from: maxZoom$delegate, reason: from kotlin metadata */
    private final p1 maxZoom;

    /* JADX INFO: renamed from: minZoom$delegate, reason: from kotlin metadata */
    private final p1 minZoom;

    private PolylineAnnotationGroupState(LineCap lineCap, Double d14, LineElevationReference lineElevationReference, LineJoin lineJoin, Double d15, Double d16, Double d17, LineWidthUnit lineWidthUnit, Double d18, Double d19, d0 d0Var, Double d24, d0 d0Var2, List<Double> list, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, String str, Double d35, List<Double> list2, LineTranslateAnchor lineTranslateAnchor, d0 d0Var3, List<Double> list3, List<Double> list4, Double d36, Double d37, Double d38, String str2, String str3, String str4, String str5, PolylineAnnotationGroupInteractionsState polylineAnnotationGroupInteractionsState) {
        this.interactionsState = p0.n(polylineAnnotationGroupInteractionsState);
        this.lineCap = p0.n(lineCap);
        this.lineCrossSlope = p0.n(d14);
        this.lineElevationReference = p0.n(lineElevationReference);
        this.lineJoin = p0.n(lineJoin);
        this.lineMiterLimit = p0.n(d15);
        this.lineRoundLimit = p0.n(d16);
        this.lineSortKey = p0.n(d17);
        this.lineWidthUnit = p0.n(lineWidthUnit);
        this.lineZOffset = p0.n(d18);
        this.lineBlur = p0.n(d19);
        this.lineBorderColor = p0.n(d0Var);
        this.lineBorderWidth = p0.n(d24);
        this.lineColor = p0.n(d0Var2);
        this.lineDasharray = p0.n(list);
        this.lineDepthOcclusionFactor = p0.n(d25);
        this.lineEmissiveStrength = p0.n(d26);
        this.lineGapWidth = p0.n(d27);
        this.lineOcclusionOpacity = p0.n(d28);
        this.lineOffset = p0.n(d29);
        this.lineOpacity = p0.n(d34);
        this.linePattern = p0.n(str);
        this.linePatternCrossFade = p0.n(d35);
        this.lineTranslate = p0.n(list2);
        this.lineTranslateAnchor = p0.n(lineTranslateAnchor);
        this.lineTrimColor = p0.n(d0Var3);
        this.lineTrimFadeRange = p0.n(list3);
        this.lineTrimOffset = p0.n(list4);
        this.lineWidth = p0.n(d36);
        this.maxZoom = p0.n(d37);
        this.minZoom = p0.n(d38);
        this.lineBorderColorUseTheme = p0.n(str2);
        this.lineColorUseTheme = p0.n(str3);
        this.lineGradientUseTheme = p0.n(str4);
        this.lineTrimColorUseTheme = p0.n(str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineBlur(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1711357668);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineBlur(getLineBlur());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass1(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineBorderColor(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(-1396750370);
        x1 x1Var = n.f135158a;
        d0 d0VarM195getLineBorderColorQN2ZGVo = m195getLineBorderColorQN2ZGVo();
        if (d0VarM195getLineBorderColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM195getLineBorderColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        polylineAnnotationManager.setLineBorderColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineBorderColorUseTheme(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1015231488);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineBorderColorUseTheme(getLineBorderColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41371(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineBorderWidth(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1068219777);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineBorderWidth(getLineBorderWidth());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41381(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineCap(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1779992409);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineCap(getLineCap());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41391(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineColor(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(258509162);
        x1 x1Var = n.f135158a;
        d0 d0VarM196getLineColorQN2ZGVo = m196getLineColorQN2ZGVo();
        if (d0VarM196getLineColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM196getLineColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        polylineAnnotationManager.setLineColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41402(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineColorUseTheme(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1539844492);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineColorUseTheme(getLineColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41411(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineCrossSlope(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1504546440);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineCrossSlope(getLineCrossSlope());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41421(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineDasharray(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1360256142);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineDasharray(getLineDasharray());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41431(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineDepthOcclusionFactor(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(141832182);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineDepthOcclusionFactor(getLineDepthOcclusionFactor());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41441(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineElevationReference(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1083420949);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineElevationReference(getLineElevationReference());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41451(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineEmissiveStrength(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1189856629);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineEmissiveStrength(getLineEmissiveStrength());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41461(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineGapWidth(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-914355379);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineGapWidth(getLineGapWidth());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41471(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineGradientUseTheme(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(315769615);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineGradientUseTheme(getLineGradientUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41481(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineJoin(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1622199015);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineJoin(getLineJoin());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41491(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineMiterLimit(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1415268403);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineMiterLimit(getLineMiterLimit());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41501(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineOcclusionOpacity(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(108593659);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineOcclusionOpacity(getLineOcclusionOpacity());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41511(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineOffset(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-304547504);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineOffset(getLineOffset());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41521(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineOpacity(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1967357650);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineOpacity(getLineOpacity());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41531(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLinePattern(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1181089513);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLinePattern(getLinePattern());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41541(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLinePatternCrossFade(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1812562455);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLinePatternCrossFade(getLinePatternCrossFade());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41551(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineRoundLimit(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2020013174);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineRoundLimit(getLineRoundLimit());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41561(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineSortKey(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2020043480);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineSortKey(getLineSortKey());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41571(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineTranslate(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1739808277);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineTranslate(getLineTranslate());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41581(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineTranslateAnchor(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1997207190);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineTranslateAnchor(getLineTranslateAnchor());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41591(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineTrimColor(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(-391919512);
        x1 x1Var = n.f135158a;
        d0 d0VarM197getLineTrimColorQN2ZGVo = m197getLineTrimColorQN2ZGVo();
        if (d0VarM197getLineTrimColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM197getLineTrimColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        polylineAnnotationManager.setLineTrimColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41602(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineTrimColorUseTheme(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(2026605194);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineTrimColorUseTheme(getLineTrimColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41611(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineTrimFadeRange(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1137735718);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineTrimFadeRange(getLineTrimFadeRange());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41621(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineTrimOffset(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1007000082);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineTrimOffset(getLineTrimOffset());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41631(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineWidth(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1571487987);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineWidth(getLineWidth());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41641(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineWidthUnit(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1567231537);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineWidthUnit(getLineWidthUnit());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41651(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineZOffset(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1871705100);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setLineZOffset(getLineZOffset());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41661(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateMaxZoom(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1892858162);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setMaxZoom(getMaxZoom());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41671(polylineAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateMinZoom(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1877194656);
        x1 x1Var = n.f135158a;
        polylineAnnotationManager.setMinZoom(getMinZoom());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41681(polylineAnnotationManager, i14);
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCrossSlope$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineGradientUseTheme$annotations() {
    }

    @MapboxExperimental
    /* JADX INFO: renamed from: getLineTrimColor-QN2ZGVo$annotations, reason: not valid java name */
    public static /* synthetic */ void m194getLineTrimColorQN2ZGVo$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimFadeRange$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineWidthUnit$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineZOffset$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        polylineAnnotationManager.getClass();
        o0 o0VarE = mVar.E(809871836);
        x1 x1Var = n.f135158a;
        int i15 = (i14 & 112) | 8;
        UpdateLineCap(polylineAnnotationManager, o0VarE, i15);
        UpdateLineCrossSlope(polylineAnnotationManager, o0VarE, i15);
        UpdateLineElevationReference(polylineAnnotationManager, o0VarE, i15);
        UpdateLineJoin(polylineAnnotationManager, o0VarE, i15);
        UpdateLineMiterLimit(polylineAnnotationManager, o0VarE, i15);
        UpdateLineRoundLimit(polylineAnnotationManager, o0VarE, i15);
        UpdateLineSortKey(polylineAnnotationManager, o0VarE, i15);
        UpdateLineWidthUnit(polylineAnnotationManager, o0VarE, i15);
        UpdateLineZOffset(polylineAnnotationManager, o0VarE, i15);
        UpdateLineBlur(polylineAnnotationManager, o0VarE, i15);
        UpdateLineBorderColor(polylineAnnotationManager, o0VarE, i15);
        UpdateLineBorderWidth(polylineAnnotationManager, o0VarE, i15);
        UpdateLineColor(polylineAnnotationManager, o0VarE, i15);
        UpdateLineDasharray(polylineAnnotationManager, o0VarE, i15);
        UpdateLineDepthOcclusionFactor(polylineAnnotationManager, o0VarE, i15);
        UpdateLineEmissiveStrength(polylineAnnotationManager, o0VarE, i15);
        UpdateLineGapWidth(polylineAnnotationManager, o0VarE, i15);
        UpdateLineOcclusionOpacity(polylineAnnotationManager, o0VarE, i15);
        UpdateLineOffset(polylineAnnotationManager, o0VarE, i15);
        UpdateLineOpacity(polylineAnnotationManager, o0VarE, i15);
        UpdateLinePattern(polylineAnnotationManager, o0VarE, i15);
        UpdateLinePatternCrossFade(polylineAnnotationManager, o0VarE, i15);
        UpdateLineTranslate(polylineAnnotationManager, o0VarE, i15);
        UpdateLineTranslateAnchor(polylineAnnotationManager, o0VarE, i15);
        UpdateLineTrimColor(polylineAnnotationManager, o0VarE, i15);
        UpdateLineTrimFadeRange(polylineAnnotationManager, o0VarE, i15);
        UpdateLineTrimOffset(polylineAnnotationManager, o0VarE, i15);
        UpdateLineWidth(polylineAnnotationManager, o0VarE, i15);
        UpdateMaxZoom(polylineAnnotationManager, o0VarE, i15);
        UpdateMinZoom(polylineAnnotationManager, o0VarE, i15);
        UpdateLineBorderColorUseTheme(polylineAnnotationManager, o0VarE, i15);
        UpdateLineColorUseTheme(polylineAnnotationManager, o0VarE, i15);
        UpdateLineGradientUseTheme(polylineAnnotationManager, o0VarE, i15);
        UpdateLineTrimColorUseTheme(polylineAnnotationManager, o0VarE, i15);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new PolylineAnnotationGroupState$UpdateProperties$1(this, polylineAnnotationManager, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PolylineAnnotationGroupInteractionsState getInteractionsState() {
        return (PolylineAnnotationGroupInteractionsState) this.interactionsState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineBlur() {
        return (Double) this.lineBlur.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getLineBorderColor-QN2ZGVo, reason: not valid java name */
    public final d0 m195getLineBorderColorQN2ZGVo() {
        return (d0) this.lineBorderColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLineBorderColorUseTheme() {
        return (String) this.lineBorderColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineBorderWidth() {
        return (Double) this.lineBorderWidth.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LineCap getLineCap() {
        return (LineCap) this.lineCap.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getLineColor-QN2ZGVo, reason: not valid java name */
    public final d0 m196getLineColorQN2ZGVo() {
        return (d0) this.lineColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLineColorUseTheme() {
        return (String) this.lineColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineCrossSlope() {
        return (Double) this.lineCrossSlope.getF182175a();
    }

    public final List<Double> getLineDasharray() {
        return (List) this.lineDasharray.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineDepthOcclusionFactor() {
        return (Double) this.lineDepthOcclusionFactor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LineElevationReference getLineElevationReference() {
        return (LineElevationReference) this.lineElevationReference.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineEmissiveStrength() {
        return (Double) this.lineEmissiveStrength.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineGapWidth() {
        return (Double) this.lineGapWidth.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLineGradientUseTheme() {
        return (String) this.lineGradientUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LineJoin getLineJoin() {
        return (LineJoin) this.lineJoin.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineMiterLimit() {
        return (Double) this.lineMiterLimit.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineOcclusionOpacity() {
        return (Double) this.lineOcclusionOpacity.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineOffset() {
        return (Double) this.lineOffset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineOpacity() {
        return (Double) this.lineOpacity.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLinePattern() {
        return (String) this.linePattern.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLinePatternCrossFade() {
        return (Double) this.linePatternCrossFade.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineRoundLimit() {
        return (Double) this.lineRoundLimit.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineSortKey() {
        return (Double) this.lineSortKey.getF182175a();
    }

    public final List<Double> getLineTranslate() {
        return (List) this.lineTranslate.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LineTranslateAnchor getLineTranslateAnchor() {
        return (LineTranslateAnchor) this.lineTranslateAnchor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getLineTrimColor-QN2ZGVo, reason: not valid java name */
    public final d0 m197getLineTrimColorQN2ZGVo() {
        return (d0) this.lineTrimColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLineTrimColorUseTheme() {
        return (String) this.lineTrimColorUseTheme.getF182175a();
    }

    public final List<Double> getLineTrimFadeRange() {
        return (List) this.lineTrimFadeRange.getF182175a();
    }

    public final List<Double> getLineTrimOffset() {
        return (List) this.lineTrimOffset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineWidth() {
        return (Double) this.lineWidth.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LineWidthUnit getLineWidthUnit() {
        return (LineWidthUnit) this.lineWidthUnit.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineZOffset() {
        return (Double) this.lineZOffset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getMaxZoom() {
        return (Double) this.maxZoom.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getMinZoom() {
        return (Double) this.minZoom.getF182175a();
    }

    public final void setInteractionsState(PolylineAnnotationGroupInteractionsState polylineAnnotationGroupInteractionsState) {
        polylineAnnotationGroupInteractionsState.getClass();
        this.interactionsState.setValue(polylineAnnotationGroupInteractionsState);
    }

    public final void setLineBlur(Double d14) {
        this.lineBlur.setValue(d14);
    }

    /* JADX INFO: renamed from: setLineBorderColor-Y2TPw74, reason: not valid java name */
    public final void m198setLineBorderColorY2TPw74(d0 d0Var) {
        this.lineBorderColor.setValue(d0Var);
    }

    public final void setLineBorderColorUseTheme(String str) {
        this.lineBorderColorUseTheme.setValue(str);
    }

    public final void setLineBorderWidth(Double d14) {
        this.lineBorderWidth.setValue(d14);
    }

    public final void setLineCap(LineCap lineCap) {
        this.lineCap.setValue(lineCap);
    }

    /* JADX INFO: renamed from: setLineColor-Y2TPw74, reason: not valid java name */
    public final void m199setLineColorY2TPw74(d0 d0Var) {
        this.lineColor.setValue(d0Var);
    }

    public final void setLineColorUseTheme(String str) {
        this.lineColorUseTheme.setValue(str);
    }

    public final void setLineCrossSlope(Double d14) {
        this.lineCrossSlope.setValue(d14);
    }

    public final void setLineDasharray(List<Double> list) {
        this.lineDasharray.setValue(list);
    }

    public final void setLineDepthOcclusionFactor(Double d14) {
        this.lineDepthOcclusionFactor.setValue(d14);
    }

    public final void setLineElevationReference(LineElevationReference lineElevationReference) {
        this.lineElevationReference.setValue(lineElevationReference);
    }

    public final void setLineEmissiveStrength(Double d14) {
        this.lineEmissiveStrength.setValue(d14);
    }

    public final void setLineGapWidth(Double d14) {
        this.lineGapWidth.setValue(d14);
    }

    public final void setLineGradientUseTheme(String str) {
        this.lineGradientUseTheme.setValue(str);
    }

    public final void setLineJoin(LineJoin lineJoin) {
        this.lineJoin.setValue(lineJoin);
    }

    public final void setLineMiterLimit(Double d14) {
        this.lineMiterLimit.setValue(d14);
    }

    public final void setLineOcclusionOpacity(Double d14) {
        this.lineOcclusionOpacity.setValue(d14);
    }

    public final void setLineOffset(Double d14) {
        this.lineOffset.setValue(d14);
    }

    public final void setLineOpacity(Double d14) {
        this.lineOpacity.setValue(d14);
    }

    public final void setLinePattern(String str) {
        this.linePattern.setValue(str);
    }

    public final void setLinePatternCrossFade(Double d14) {
        this.linePatternCrossFade.setValue(d14);
    }

    public final void setLineRoundLimit(Double d14) {
        this.lineRoundLimit.setValue(d14);
    }

    public final void setLineSortKey(Double d14) {
        this.lineSortKey.setValue(d14);
    }

    public final void setLineTranslate(List<Double> list) {
        this.lineTranslate.setValue(list);
    }

    public final void setLineTranslateAnchor(LineTranslateAnchor lineTranslateAnchor) {
        this.lineTranslateAnchor.setValue(lineTranslateAnchor);
    }

    /* JADX INFO: renamed from: setLineTrimColor-Y2TPw74, reason: not valid java name */
    public final void m200setLineTrimColorY2TPw74(d0 d0Var) {
        this.lineTrimColor.setValue(d0Var);
    }

    public final void setLineTrimColorUseTheme(String str) {
        this.lineTrimColorUseTheme.setValue(str);
    }

    public final void setLineTrimFadeRange(List<Double> list) {
        this.lineTrimFadeRange.setValue(list);
    }

    public final void setLineTrimOffset(List<Double> list) {
        this.lineTrimOffset.setValue(list);
    }

    public final void setLineWidth(Double d14) {
        this.lineWidth.setValue(d14);
    }

    public final void setLineWidthUnit(LineWidthUnit lineWidthUnit) {
        this.lineWidthUnit.setValue(lineWidthUnit);
    }

    public final void setLineZOffset(Double d14) {
        this.lineZOffset.setValue(d14);
    }

    public final void setMaxZoom(Double d14) {
        this.maxZoom.setValue(d14);
    }

    public final void setMinZoom(Double d14) {
        this.minZoom.setValue(d14);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineBlur$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineBlur(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineBorderColor$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineBorderColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineBorderColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41371 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41371(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineBorderColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineBorderWidth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41381 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41381(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineBorderWidth(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineCap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41391 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41391(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineCap(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41402 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41402(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41411 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41411(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineCrossSlope$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41421 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41421(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineCrossSlope(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineDasharray$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41431 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41431(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineDasharray(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineDepthOcclusionFactor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41441 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41441(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineDepthOcclusionFactor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineElevationReference$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41451 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41451(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineElevationReference(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineEmissiveStrength$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41461 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41461(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineEmissiveStrength(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineGapWidth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41471 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41471(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineGapWidth(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineGradientUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41481 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41481(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineGradientUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineJoin$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41491 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41491(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineJoin(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineMiterLimit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41501 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41501(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineMiterLimit(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineOcclusionOpacity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41511 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41511(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineOcclusionOpacity(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineOffset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41521 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41521(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineOffset(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineOpacity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41531 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41531(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineOpacity(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLinePattern$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41541 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41541(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLinePattern(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLinePatternCrossFade$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41551 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41551(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLinePatternCrossFade(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineRoundLimit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41561 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41561(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineRoundLimit(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineSortKey$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41571 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41571(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineSortKey(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineTranslate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41581 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41581(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineTranslate(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineTranslateAnchor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41591 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41591(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineTranslateAnchor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineTrimColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41602 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41602(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineTrimColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineTrimColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41611 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41611(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineTrimColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineTrimFadeRange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41621 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41621(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineTrimFadeRange(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineTrimOffset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41631 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41631(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineTrimOffset(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineWidth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41641 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41641(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineWidth(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineWidthUnit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41651 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41651(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineWidthUnit(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateLineZOffset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41661 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41661(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateLineZOffset(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateMaxZoom$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41671 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41671(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateMaxZoom(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupState$UpdateMinZoom$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41681 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41681(PolylineAnnotationManager polylineAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polylineAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupState.this.UpdateMinZoom(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    public PolylineAnnotationGroupState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PolylineAnnotationGroupInteractionsState());
    }
}
