package com.mapbox.maps.extension.compose.annotation.generated;

import android.graphics.Bitmap;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.annotation.IconImage;
import com.mapbox.maps.extension.compose.annotation.internal.generated.PointAnnotationNode;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.IconTextFit;
import com.mapbox.maps.extension.style.layers.properties.generated.TextAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.TextJustify;
import com.mapbox.maps.extension.style.layers.properties.generated.TextTransform;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
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
@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0003\bã\u0001\b\u0007\u0018\u00002\u00020\u0001B¢\u0003\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010)\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0010\u0012\b\u00100\u001a\u0004\u0018\u00010\u0010\u0012\b\u00101\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u00103\u001a\u000202ø\u0001\u0000¢\u0006\u0004\b4\u00105B\t\b\u0016¢\u0006\u0004\b4\u00106J\u0017\u0010<\u001a\u0002092\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b=\u0010;J\u0017\u0010>\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b>\u0010;J\u0017\u0010?\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b?\u0010;J\u0017\u0010@\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b@\u0010;J\u0017\u0010A\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bA\u0010;J\u0017\u0010B\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bB\u0010;J\u0017\u0010C\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bC\u0010;J\u0017\u0010D\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bD\u0010;J\u0017\u0010E\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bE\u0010;J\u0017\u0010F\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bF\u0010;J\u0017\u0010G\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bG\u0010;J\u0017\u0010H\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bH\u0010;J\u0017\u0010I\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bI\u0010;J\u0017\u0010J\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bJ\u0010;J\u0017\u0010K\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bK\u0010;J\u0017\u0010L\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bL\u0010;J\u0017\u0010M\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bM\u0010;J\u0017\u0010N\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bN\u0010;J\u0017\u0010O\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bO\u0010;J\u0017\u0010P\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bP\u0010;J\u0017\u0010Q\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bQ\u0010;J\u0017\u0010R\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bR\u0010;J\u0017\u0010S\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bS\u0010;J\u0017\u0010T\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bT\u0010;J\u0017\u0010U\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bU\u0010;J\u0017\u0010V\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bV\u0010;J\u0017\u0010W\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bW\u0010;J\u0017\u0010X\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bX\u0010;J\u0017\u0010Y\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bY\u0010;J\u0017\u0010Z\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bZ\u0010;J\u0017\u0010[\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b[\u0010;J\u0017\u0010\\\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b\\\u0010;J\u0017\u0010]\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b]\u0010;J\u0017\u0010^\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b^\u0010;J\u0017\u0010_\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b_\u0010;J\u0017\u0010`\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b`\u0010;J\u0017\u0010a\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\ba\u0010;J\u0017\u0010b\u001a\u0002092\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\bb\u0010;R+\u0010j\u001a\u0002022\u0006\u0010c\u001a\u0002028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR/\u0010p\u001a\u0004\u0018\u00010\u00022\b\u0010c\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010e\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR/\u0010v\u001a\u0004\u0018\u00010\u00042\b\u0010c\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010e\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR;\u0010|\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bw\u0010e\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R2\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0014\n\u0004\b}\u0010e\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R4\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010e\u001a\u0005\b\u0084\u0001\u0010\u007f\"\u0006\b\u0085\u0001\u0010\u0081\u0001R5\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010c\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0087\u0001\u0010e\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R?\u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010e\u001a\u0005\b\u008e\u0001\u0010y\"\u0005\b\u008f\u0001\u0010{R5\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010c\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0091\u0001\u0010e\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R5\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010c\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0097\u0001\u0010e\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R5\u0010¢\u0001\u001a\u0004\u0018\u00010\u00122\b\u0010c\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u009d\u0001\u0010e\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R4\u0010¦\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b£\u0001\u0010e\u001a\u0005\b¤\u0001\u0010\u007f\"\u0006\b¥\u0001\u0010\u0081\u0001R4\u0010ª\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b§\u0001\u0010e\u001a\u0005\b¨\u0001\u0010\u007f\"\u0006\b©\u0001\u0010\u0081\u0001R4\u0010®\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b«\u0001\u0010e\u001a\u0005\b¬\u0001\u0010\u007f\"\u0006\b\u00ad\u0001\u0010\u0081\u0001R?\u0010²\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¯\u0001\u0010e\u001a\u0005\b°\u0001\u0010y\"\u0005\b±\u0001\u0010{R4\u0010¶\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b³\u0001\u0010e\u001a\u0005\b´\u0001\u0010\u007f\"\u0006\bµ\u0001\u0010\u0081\u0001R4\u0010º\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b·\u0001\u0010e\u001a\u0005\b¸\u0001\u0010\u007f\"\u0006\b¹\u0001\u0010\u0081\u0001R4\u0010¾\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b»\u0001\u0010e\u001a\u0005\b¼\u0001\u0010\u007f\"\u0006\b½\u0001\u0010\u0081\u0001R5\u0010Ä\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010c\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b¿\u0001\u0010e\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R>\u0010Ê\u0001\u001a\u0004\u0018\u00010\u001d2\b\u0010c\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\bÅ\u0001\u0010e\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R4\u0010Î\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bË\u0001\u0010e\u001a\u0005\bÌ\u0001\u0010\u007f\"\u0006\bÍ\u0001\u0010\u0081\u0001R4\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bÏ\u0001\u0010e\u001a\u0005\bÐ\u0001\u0010\u007f\"\u0006\bÑ\u0001\u0010\u0081\u0001R>\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001d2\b\u0010c\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\bÓ\u0001\u0010e\u001a\u0006\bÔ\u0001\u0010Ç\u0001\"\u0006\bÕ\u0001\u0010É\u0001R4\u0010Ú\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b×\u0001\u0010e\u001a\u0005\bØ\u0001\u0010\u007f\"\u0006\bÙ\u0001\u0010\u0081\u0001R4\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bÛ\u0001\u0010e\u001a\u0005\bÜ\u0001\u0010\u007f\"\u0006\bÝ\u0001\u0010\u0081\u0001R4\u0010â\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bß\u0001\u0010e\u001a\u0005\bà\u0001\u0010\u007f\"\u0006\bá\u0001\u0010\u0081\u0001R;\u0010ç\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0087\u008e\u0002¢\u0006\u001d\n\u0005\bã\u0001\u0010e\u0012\u0005\bæ\u0001\u00106\u001a\u0005\bä\u0001\u0010\u007f\"\u0006\bå\u0001\u0010\u0081\u0001R>\u0010ë\u0001\u001a\u0004\u0018\u00010\u001d2\b\u0010c\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\bè\u0001\u0010e\u001a\u0006\bé\u0001\u0010Ç\u0001\"\u0006\bê\u0001\u0010É\u0001R4\u0010ï\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bì\u0001\u0010e\u001a\u0005\bí\u0001\u0010\u007f\"\u0006\bî\u0001\u0010\u0081\u0001R4\u0010ó\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bð\u0001\u0010e\u001a\u0005\bñ\u0001\u0010\u007f\"\u0006\bò\u0001\u0010\u0081\u0001R>\u0010÷\u0001\u001a\u0004\u0018\u00010\u001d2\b\u0010c\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\bô\u0001\u0010e\u001a\u0006\bõ\u0001\u0010Ç\u0001\"\u0006\bö\u0001\u0010É\u0001R4\u0010û\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bø\u0001\u0010e\u001a\u0005\bù\u0001\u0010\u007f\"\u0006\bú\u0001\u0010\u0081\u0001R4\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bü\u0001\u0010e\u001a\u0005\bý\u0001\u0010\u007f\"\u0006\bþ\u0001\u0010\u0081\u0001R4\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u0080\u0002\u0010e\u001a\u0005\b\u0081\u0002\u0010\u007f\"\u0006\b\u0082\u0002\u0010\u0081\u0001R<\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00102\b\u0010c\u001a\u0004\u0018\u00010\u00108F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0084\u0002\u0010e\u0012\u0005\b\u0087\u0002\u00106\u001a\u0006\b\u0085\u0002\u0010\u0099\u0001\"\u0006\b\u0086\u0002\u0010\u009b\u0001R<\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u00102\b\u0010c\u001a\u0004\u0018\u00010\u00108F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0089\u0002\u0010e\u0012\u0005\b\u008c\u0002\u00106\u001a\u0006\b\u008a\u0002\u0010\u0099\u0001\"\u0006\b\u008b\u0002\u0010\u009b\u0001R<\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u00102\b\u0010c\u001a\u0004\u0018\u00010\u00108F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u008e\u0002\u0010e\u0012\u0005\b\u0091\u0002\u00106\u001a\u0006\b\u008f\u0002\u0010\u0099\u0001\"\u0006\b\u0090\u0002\u0010\u009b\u0001R<\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u00102\b\u0010c\u001a\u0004\u0018\u00010\u00108F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0093\u0002\u0010e\u0012\u0005\b\u0096\u0002\u00106\u001a\u0006\b\u0094\u0002\u0010\u0099\u0001\"\u0006\b\u0095\u0002\u0010\u009b\u0001R4\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u00072\b\u0010c\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u0098\u0002\u0010e\u001a\u0005\b\u0099\u0002\u0010\u007f\"\u0006\b\u009a\u0002\u0010\u0081\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009c\u0002"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationState;", "", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "initialIconAnchor", "Lcom/mapbox/maps/extension/compose/annotation/IconImage;", "initialIconImage", "", "", "initialIconOffset", "initialIconRotate", "initialIconSize", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "initialIconTextFit", "initialIconTextFitPadding", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "initialTextAnchor", "", "initialTextField", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "initialTextJustify", "initialTextLetterSpacing", "initialTextLineHeight", "initialTextMaxWidth", "initialTextOffset", "initialTextRadialOffset", "initialTextRotate", "initialTextSize", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", "initialTextTransform", "Lo4/d0;", "initialIconColor", "initialIconEmissiveStrength", "initialIconHaloBlur", "initialIconHaloColor", "initialIconHaloWidth", "initialIconOcclusionOpacity", "initialIconOpacity", "initialSymbolZOffset", "initialTextColor", "initialTextEmissiveStrength", "initialTextHaloBlur", "initialTextHaloColor", "initialTextHaloWidth", "initialTextOcclusionOpacity", "initialTextOpacity", "initialIconColorUseTheme", "initialIconHaloColorUseTheme", "initialTextColorUseTheme", "initialTextHaloColorUseTheme", "initialIconImageCrossFade", "Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationInteractionsState;", "initialPointAnnotationInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;Lcom/mapbox/maps/extension/compose/annotation/IconImage;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;Ljava/util/List;Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;Ljava/lang/String;Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/annotation/internal/generated/PointAnnotationNode;", "annotationNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/annotation/internal/generated/PointAnnotationNode;Lp3/m;I)V", "UpdateProperties", "UpdateIconAnchor", "UpdateIconImage", "UpdateIconOffset", "UpdateIconRotate", "UpdateIconSize", "UpdateIconTextFit", "UpdateIconTextFitPadding", "UpdateTextAnchor", "UpdateTextField", "UpdateTextJustify", "UpdateTextLetterSpacing", "UpdateTextLineHeight", "UpdateTextMaxWidth", "UpdateTextOffset", "UpdateTextRadialOffset", "UpdateTextRotate", "UpdateTextSize", "UpdateTextTransform", "UpdateIconColor", "UpdateIconEmissiveStrength", "UpdateIconHaloBlur", "UpdateIconHaloColor", "UpdateIconHaloWidth", "UpdateIconOcclusionOpacity", "UpdateIconOpacity", "UpdateSymbolZOffset", "UpdateTextColor", "UpdateTextEmissiveStrength", "UpdateTextHaloBlur", "UpdateTextHaloColor", "UpdateTextHaloWidth", "UpdateTextOcclusionOpacity", "UpdateTextOpacity", "UpdateIconColorUseTheme", "UpdateIconHaloColorUseTheme", "UpdateTextColorUseTheme", "UpdateTextHaloColorUseTheme", "UpdateIconImageCrossFade", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationInteractionsState;)V", "interactionsState", "iconAnchor$delegate", "getIconAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "setIconAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;)V", "iconAnchor", "iconImage$delegate", "getIconImage", "()Lcom/mapbox/maps/extension/compose/annotation/IconImage;", "setIconImage", "(Lcom/mapbox/maps/extension/compose/annotation/IconImage;)V", "iconImage", "iconOffset$delegate", "getIconOffset", "()Ljava/util/List;", "setIconOffset", "(Ljava/util/List;)V", "iconOffset", "iconRotate$delegate", "getIconRotate", "()Ljava/lang/Double;", "setIconRotate", "(Ljava/lang/Double;)V", "iconRotate", "iconSize$delegate", "getIconSize", "setIconSize", "iconSize", "iconTextFit$delegate", "getIconTextFit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "setIconTextFit", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;)V", "iconTextFit", "iconTextFitPadding$delegate", "getIconTextFitPadding", "setIconTextFitPadding", "iconTextFitPadding", "textAnchor$delegate", "getTextAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "setTextAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;)V", "textAnchor", "textField$delegate", "getTextField", "()Ljava/lang/String;", "setTextField", "(Ljava/lang/String;)V", "textField", "textJustify$delegate", "getTextJustify", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "setTextJustify", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;)V", "textJustify", "textLetterSpacing$delegate", "getTextLetterSpacing", "setTextLetterSpacing", "textLetterSpacing", "textLineHeight$delegate", "getTextLineHeight", "setTextLineHeight", "textLineHeight", "textMaxWidth$delegate", "getTextMaxWidth", "setTextMaxWidth", "textMaxWidth", "textOffset$delegate", "getTextOffset", "setTextOffset", "textOffset", "textRadialOffset$delegate", "getTextRadialOffset", "setTextRadialOffset", "textRadialOffset", "textRotate$delegate", "getTextRotate", "setTextRotate", "textRotate", "textSize$delegate", "getTextSize", "setTextSize", "textSize", "textTransform$delegate", "getTextTransform", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", "setTextTransform", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;)V", "textTransform", "iconColor$delegate", "getIconColor-QN2ZGVo", "()Lo4/d0;", "setIconColor-Y2TPw74", "(Lo4/d0;)V", "iconColor", "iconEmissiveStrength$delegate", "getIconEmissiveStrength", "setIconEmissiveStrength", "iconEmissiveStrength", "iconHaloBlur$delegate", "getIconHaloBlur", "setIconHaloBlur", "iconHaloBlur", "iconHaloColor$delegate", "getIconHaloColor-QN2ZGVo", "setIconHaloColor-Y2TPw74", "iconHaloColor", "iconHaloWidth$delegate", "getIconHaloWidth", "setIconHaloWidth", "iconHaloWidth", "iconOcclusionOpacity$delegate", "getIconOcclusionOpacity", "setIconOcclusionOpacity", "iconOcclusionOpacity", "iconOpacity$delegate", "getIconOpacity", "setIconOpacity", "iconOpacity", "symbolZOffset$delegate", "getSymbolZOffset", "setSymbolZOffset", "getSymbolZOffset$annotations", "symbolZOffset", "textColor$delegate", "getTextColor-QN2ZGVo", "setTextColor-Y2TPw74", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "textEmissiveStrength$delegate", "getTextEmissiveStrength", "setTextEmissiveStrength", "textEmissiveStrength", "textHaloBlur$delegate", "getTextHaloBlur", "setTextHaloBlur", "textHaloBlur", "textHaloColor$delegate", "getTextHaloColor-QN2ZGVo", "setTextHaloColor-Y2TPw74", "textHaloColor", "textHaloWidth$delegate", "getTextHaloWidth", "setTextHaloWidth", "textHaloWidth", "textOcclusionOpacity$delegate", "getTextOcclusionOpacity", "setTextOcclusionOpacity", "textOcclusionOpacity", "textOpacity$delegate", "getTextOpacity", "setTextOpacity", "textOpacity", "iconColorUseTheme$delegate", "getIconColorUseTheme", "setIconColorUseTheme", "getIconColorUseTheme$annotations", "iconColorUseTheme", "iconHaloColorUseTheme$delegate", "getIconHaloColorUseTheme", "setIconHaloColorUseTheme", "getIconHaloColorUseTheme$annotations", "iconHaloColorUseTheme", "textColorUseTheme$delegate", "getTextColorUseTheme", "setTextColorUseTheme", "getTextColorUseTheme$annotations", "textColorUseTheme", "textHaloColorUseTheme$delegate", "getTextHaloColorUseTheme", "setTextHaloColorUseTheme", "getTextHaloColorUseTheme$annotations", "textHaloColorUseTheme", "iconImageCrossFade$delegate", "getIconImageCrossFade", "setIconImageCrossFade", "iconImageCrossFade", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PointAnnotationState {

    /* JADX INFO: renamed from: iconAnchor$delegate, reason: from kotlin metadata */
    private final p1 iconAnchor;

    /* JADX INFO: renamed from: iconColor$delegate, reason: from kotlin metadata */
    private final p1 iconColor;

    /* JADX INFO: renamed from: iconColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 iconColorUseTheme;

    /* JADX INFO: renamed from: iconEmissiveStrength$delegate, reason: from kotlin metadata */
    private final p1 iconEmissiveStrength;

    /* JADX INFO: renamed from: iconHaloBlur$delegate, reason: from kotlin metadata */
    private final p1 iconHaloBlur;

    /* JADX INFO: renamed from: iconHaloColor$delegate, reason: from kotlin metadata */
    private final p1 iconHaloColor;

    /* JADX INFO: renamed from: iconHaloColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 iconHaloColorUseTheme;

    /* JADX INFO: renamed from: iconHaloWidth$delegate, reason: from kotlin metadata */
    private final p1 iconHaloWidth;

    /* JADX INFO: renamed from: iconImage$delegate, reason: from kotlin metadata */
    private final p1 iconImage;

    /* JADX INFO: renamed from: iconImageCrossFade$delegate, reason: from kotlin metadata */
    private final p1 iconImageCrossFade;

    /* JADX INFO: renamed from: iconOcclusionOpacity$delegate, reason: from kotlin metadata */
    private final p1 iconOcclusionOpacity;

    /* JADX INFO: renamed from: iconOffset$delegate, reason: from kotlin metadata */
    private final p1 iconOffset;

    /* JADX INFO: renamed from: iconOpacity$delegate, reason: from kotlin metadata */
    private final p1 iconOpacity;

    /* JADX INFO: renamed from: iconRotate$delegate, reason: from kotlin metadata */
    private final p1 iconRotate;

    /* JADX INFO: renamed from: iconSize$delegate, reason: from kotlin metadata */
    private final p1 iconSize;

    /* JADX INFO: renamed from: iconTextFit$delegate, reason: from kotlin metadata */
    private final p1 iconTextFit;

    /* JADX INFO: renamed from: iconTextFitPadding$delegate, reason: from kotlin metadata */
    private final p1 iconTextFitPadding;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;

    /* JADX INFO: renamed from: symbolZOffset$delegate, reason: from kotlin metadata */
    private final p1 symbolZOffset;

    /* JADX INFO: renamed from: textAnchor$delegate, reason: from kotlin metadata */
    private final p1 textAnchor;

    /* JADX INFO: renamed from: textColor$delegate, reason: from kotlin metadata */
    private final p1 textColor;

    /* JADX INFO: renamed from: textColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 textColorUseTheme;

    /* JADX INFO: renamed from: textEmissiveStrength$delegate, reason: from kotlin metadata */
    private final p1 textEmissiveStrength;

    /* JADX INFO: renamed from: textField$delegate, reason: from kotlin metadata */
    private final p1 textField;

    /* JADX INFO: renamed from: textHaloBlur$delegate, reason: from kotlin metadata */
    private final p1 textHaloBlur;

    /* JADX INFO: renamed from: textHaloColor$delegate, reason: from kotlin metadata */
    private final p1 textHaloColor;

    /* JADX INFO: renamed from: textHaloColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 textHaloColorUseTheme;

    /* JADX INFO: renamed from: textHaloWidth$delegate, reason: from kotlin metadata */
    private final p1 textHaloWidth;

    /* JADX INFO: renamed from: textJustify$delegate, reason: from kotlin metadata */
    private final p1 textJustify;

    /* JADX INFO: renamed from: textLetterSpacing$delegate, reason: from kotlin metadata */
    private final p1 textLetterSpacing;

    /* JADX INFO: renamed from: textLineHeight$delegate, reason: from kotlin metadata */
    private final p1 textLineHeight;

    /* JADX INFO: renamed from: textMaxWidth$delegate, reason: from kotlin metadata */
    private final p1 textMaxWidth;

    /* JADX INFO: renamed from: textOcclusionOpacity$delegate, reason: from kotlin metadata */
    private final p1 textOcclusionOpacity;

    /* JADX INFO: renamed from: textOffset$delegate, reason: from kotlin metadata */
    private final p1 textOffset;

    /* JADX INFO: renamed from: textOpacity$delegate, reason: from kotlin metadata */
    private final p1 textOpacity;

    /* JADX INFO: renamed from: textRadialOffset$delegate, reason: from kotlin metadata */
    private final p1 textRadialOffset;

    /* JADX INFO: renamed from: textRotate$delegate, reason: from kotlin metadata */
    private final p1 textRotate;

    /* JADX INFO: renamed from: textSize$delegate, reason: from kotlin metadata */
    private final p1 textSize;

    /* JADX INFO: renamed from: textTransform$delegate, reason: from kotlin metadata */
    private final p1 textTransform;

    private PointAnnotationState(IconAnchor iconAnchor, IconImage iconImage, List<Double> list, Double d14, Double d15, IconTextFit iconTextFit, List<Double> list2, TextAnchor textAnchor, String str, TextJustify textJustify, Double d16, Double d17, Double d18, List<Double> list3, Double d19, Double d24, Double d25, TextTransform textTransform, d0 d0Var, Double d26, Double d27, d0 d0Var2, Double d28, Double d29, Double d34, Double d35, d0 d0Var3, Double d36, Double d37, d0 d0Var4, Double d38, Double d39, Double d44, String str2, String str3, String str4, String str5, Double d45, PointAnnotationInteractionsState pointAnnotationInteractionsState) {
        this.interactionsState = p0.n(pointAnnotationInteractionsState);
        this.iconAnchor = p0.n(iconAnchor);
        this.iconImage = p0.n(iconImage);
        this.iconOffset = p0.n(list);
        this.iconRotate = p0.n(d14);
        this.iconSize = p0.n(d15);
        this.iconTextFit = p0.n(iconTextFit);
        this.iconTextFitPadding = p0.n(list2);
        this.textAnchor = p0.n(textAnchor);
        this.textField = p0.n(str);
        this.textJustify = p0.n(textJustify);
        this.textLetterSpacing = p0.n(d16);
        this.textLineHeight = p0.n(d17);
        this.textMaxWidth = p0.n(d18);
        this.textOffset = p0.n(list3);
        this.textRadialOffset = p0.n(d19);
        this.textRotate = p0.n(d24);
        this.textSize = p0.n(d25);
        this.textTransform = p0.n(textTransform);
        this.iconColor = p0.n(d0Var);
        this.iconEmissiveStrength = p0.n(d26);
        this.iconHaloBlur = p0.n(d27);
        this.iconHaloColor = p0.n(d0Var2);
        this.iconHaloWidth = p0.n(d28);
        this.iconOcclusionOpacity = p0.n(d29);
        this.iconOpacity = p0.n(d34);
        this.symbolZOffset = p0.n(d35);
        this.textColor = p0.n(d0Var3);
        this.textEmissiveStrength = p0.n(d36);
        this.textHaloBlur = p0.n(d37);
        this.textHaloColor = p0.n(d0Var4);
        this.textHaloWidth = p0.n(d38);
        this.textOcclusionOpacity = p0.n(d39);
        this.textOpacity = p0.n(d44);
        this.iconColorUseTheme = p0.n(str2);
        this.iconHaloColorUseTheme = p0.n(str3);
        this.textColorUseTheme = p0.n(str4);
        this.textHaloColorUseTheme = p0.n(str5);
        this.iconImageCrossFade = p0.n(d45);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconAnchor(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-148684422);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconAnchor(getIconAnchor());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconColor(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1719238968);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        d0 d0VarM162getIconColorQN2ZGVo = m162getIconColorQN2ZGVo();
        annotation.setIconColorInt(d0VarM162getIconColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM162getIconColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40712(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconColorUseTheme(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1059494250);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconColorUseTheme(getIconColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40722(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconEmissiveStrength(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(372148733);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconEmissiveStrength(getIconEmissiveStrength());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40732(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconHaloBlur(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1677323128);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconHaloBlur(getIconHaloBlur());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40742(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconHaloColor(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-967289364);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        d0 d0VarM163getIconHaloColorQN2ZGVo = m163getIconHaloColorQN2ZGVo();
        annotation.setIconHaloColorInt(d0VarM163getIconHaloColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM163getIconHaloColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40752(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconHaloColorUseTheme(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1573981326);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconHaloColorUseTheme(getIconHaloColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40762(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconHaloWidth(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-322132017);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconHaloWidth(getIconHaloWidth());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40772(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconImage(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1979497280);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        IconImage iconImage = getIconImage();
        if (iconImage != null) {
            Bitmap bitmap = iconImage.getBitmap();
            if (bitmap != null) {
                annotation.setIconImageBitmap(bitmap);
            }
            String imageId = iconImage.getImageId();
            if (imageId != null) {
                annotation.setIconImage(imageId);
            }
        }
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40782(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconImageCrossFade(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1810109306);
        x1 x1Var = n.f135158a;
        pointAnnotationNode.getAnnotationManager().setIconImageCrossFade(getIconImageCrossFade());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass1(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconOcclusionOpacity(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-153358589);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconOcclusionOpacity(getIconOcclusionOpacity());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40792(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconOffset(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-861788584);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconOffset(getIconOffset());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40802(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconOpacity(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1619810160);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconOpacity(getIconOpacity());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40812(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconRotate(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-811977952);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconRotate(getIconRotate());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40822(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconSize(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1050093370);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconSize(getIconSize());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40832(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconTextFit(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-46312055);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconTextFit(getIconTextFit());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40842(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconTextFitPadding(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1061026450);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setIconTextFitPadding(getIconTextFitPadding());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40852(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateSymbolZOffset(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(233265235);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setSymbolZOffset(getSymbolZOffset());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40862(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextAnchor(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1909703982);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextAnchor(getTextAnchor());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40872(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextColor(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(563917972);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        d0 d0VarM164getTextColorQN2ZGVo = m164getTextColorQN2ZGVo();
        annotation.setTextColorInt(d0VarM164getTextColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM164getTextColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40882(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextColorUseTheme(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1564458186);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextColorUseTheme(getTextColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40892(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextEmissiveStrength(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1390084943);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextEmissiveStrength(getTextEmissiveStrength());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40902(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextField(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1490875477);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextField(getTextField());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40912(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextHaloBlur(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(748976956);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextHaloBlur(getTextHaloBlur());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40922(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextHaloColor(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1233569208);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        d0 d0VarM165getTextHaloColorQN2ZGVo = m165getTextHaloColorQN2ZGVo();
        annotation.setTextHaloColorInt(d0VarM165getTextHaloColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM165getTextHaloColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40932(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextHaloColorUseTheme(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1515655078);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextHaloColorUseTheme(getTextHaloColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40942(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextHaloWidth(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1878726555);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextHaloWidth(getTextHaloWidth());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40952(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextJustify(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-579023551);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextJustify(getTextJustify());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40962(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextLetterSpacing(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(754127726);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextLetterSpacing(getTextLetterSpacing());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40972(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextLineHeight(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1815305652);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextLineHeight(getTextLineHeight());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40982(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextMaxWidth(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1052642117);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextMaxWidth(getTextMaxWidth());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40992(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextOcclusionOpacity(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1915592265);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextOcclusionOpacity(getTextOcclusionOpacity());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41002(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextOffset(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1196599820);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextOffset(getTextOffset());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41012(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextOpacity(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1005341244);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextOpacity(getTextOpacity());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41022(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextRadialOffset(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1122777995);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextRadialOffset(getTextRadialOffset());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41032(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextRotate(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1246410452);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextRotate(getTextRotate());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41042(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextSize(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-837895814);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextSize(getTextSize());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41052(pointAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextTransform(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1204251933);
        x1 x1Var = n.f135158a;
        PointAnnotationManager annotationManager = pointAnnotationNode.getAnnotationManager();
        PointAnnotation annotation = pointAnnotationNode.getAnnotation();
        annotation.setTextTransform(getTextTransform());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41062(pointAnnotationNode, i14);
    }

    @MapboxExperimental
    public static /* synthetic */ void getIconColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getIconHaloColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSymbolZOffset$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getTextColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getTextHaloColorUseTheme$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(PointAnnotationNode pointAnnotationNode, m mVar, int i14) {
        pointAnnotationNode.getClass();
        o0 o0VarE = mVar.E(19841695);
        x1 x1Var = n.f135158a;
        int i15 = (i14 & 112) | 8;
        UpdateIconAnchor(pointAnnotationNode, o0VarE, i15);
        UpdateIconImage(pointAnnotationNode, o0VarE, i15);
        UpdateIconOffset(pointAnnotationNode, o0VarE, i15);
        UpdateIconRotate(pointAnnotationNode, o0VarE, i15);
        UpdateIconSize(pointAnnotationNode, o0VarE, i15);
        UpdateIconTextFit(pointAnnotationNode, o0VarE, i15);
        UpdateIconTextFitPadding(pointAnnotationNode, o0VarE, i15);
        UpdateTextAnchor(pointAnnotationNode, o0VarE, i15);
        UpdateTextField(pointAnnotationNode, o0VarE, i15);
        UpdateTextJustify(pointAnnotationNode, o0VarE, i15);
        UpdateTextLetterSpacing(pointAnnotationNode, o0VarE, i15);
        UpdateTextLineHeight(pointAnnotationNode, o0VarE, i15);
        UpdateTextMaxWidth(pointAnnotationNode, o0VarE, i15);
        UpdateTextOffset(pointAnnotationNode, o0VarE, i15);
        UpdateTextRadialOffset(pointAnnotationNode, o0VarE, i15);
        UpdateTextRotate(pointAnnotationNode, o0VarE, i15);
        UpdateTextSize(pointAnnotationNode, o0VarE, i15);
        UpdateTextTransform(pointAnnotationNode, o0VarE, i15);
        UpdateIconColor(pointAnnotationNode, o0VarE, i15);
        UpdateIconEmissiveStrength(pointAnnotationNode, o0VarE, i15);
        UpdateIconHaloBlur(pointAnnotationNode, o0VarE, i15);
        UpdateIconHaloColor(pointAnnotationNode, o0VarE, i15);
        UpdateIconHaloWidth(pointAnnotationNode, o0VarE, i15);
        UpdateIconOcclusionOpacity(pointAnnotationNode, o0VarE, i15);
        UpdateIconOpacity(pointAnnotationNode, o0VarE, i15);
        UpdateSymbolZOffset(pointAnnotationNode, o0VarE, i15);
        UpdateTextColor(pointAnnotationNode, o0VarE, i15);
        UpdateTextEmissiveStrength(pointAnnotationNode, o0VarE, i15);
        UpdateTextHaloBlur(pointAnnotationNode, o0VarE, i15);
        UpdateTextHaloColor(pointAnnotationNode, o0VarE, i15);
        UpdateTextHaloWidth(pointAnnotationNode, o0VarE, i15);
        UpdateTextOcclusionOpacity(pointAnnotationNode, o0VarE, i15);
        UpdateTextOpacity(pointAnnotationNode, o0VarE, i15);
        UpdateIconColorUseTheme(pointAnnotationNode, o0VarE, i15);
        UpdateIconHaloColorUseTheme(pointAnnotationNode, o0VarE, i15);
        UpdateTextColorUseTheme(pointAnnotationNode, o0VarE, i15);
        UpdateTextHaloColorUseTheme(pointAnnotationNode, o0VarE, i15);
        UpdateIconImageCrossFade(pointAnnotationNode, o0VarE, i15);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new PointAnnotationState$UpdateProperties$1(this, pointAnnotationNode, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IconAnchor getIconAnchor() {
        return (IconAnchor) this.iconAnchor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getIconColor-QN2ZGVo, reason: not valid java name */
    public final d0 m162getIconColorQN2ZGVo() {
        return (d0) this.iconColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getIconColorUseTheme() {
        return (String) this.iconColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconEmissiveStrength() {
        return (Double) this.iconEmissiveStrength.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconHaloBlur() {
        return (Double) this.iconHaloBlur.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getIconHaloColor-QN2ZGVo, reason: not valid java name */
    public final d0 m163getIconHaloColorQN2ZGVo() {
        return (d0) this.iconHaloColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getIconHaloColorUseTheme() {
        return (String) this.iconHaloColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconHaloWidth() {
        return (Double) this.iconHaloWidth.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IconImage getIconImage() {
        return (IconImage) this.iconImage.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconImageCrossFade() {
        return (Double) this.iconImageCrossFade.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconOcclusionOpacity() {
        return (Double) this.iconOcclusionOpacity.getF182175a();
    }

    public final List<Double> getIconOffset() {
        return (List) this.iconOffset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconOpacity() {
        return (Double) this.iconOpacity.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconRotate() {
        return (Double) this.iconRotate.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconSize() {
        return (Double) this.iconSize.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IconTextFit getIconTextFit() {
        return (IconTextFit) this.iconTextFit.getF182175a();
    }

    public final List<Double> getIconTextFitPadding() {
        return (List) this.iconTextFitPadding.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PointAnnotationInteractionsState getInteractionsState() {
        return (PointAnnotationInteractionsState) this.interactionsState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getSymbolZOffset() {
        return (Double) this.symbolZOffset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextAnchor getTextAnchor() {
        return (TextAnchor) this.textAnchor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final d0 m164getTextColorQN2ZGVo() {
        return (d0) this.textColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTextColorUseTheme() {
        return (String) this.textColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextEmissiveStrength() {
        return (Double) this.textEmissiveStrength.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTextField() {
        return (String) this.textField.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextHaloBlur() {
        return (Double) this.textHaloBlur.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getTextHaloColor-QN2ZGVo, reason: not valid java name */
    public final d0 m165getTextHaloColorQN2ZGVo() {
        return (d0) this.textHaloColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTextHaloColorUseTheme() {
        return (String) this.textHaloColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextHaloWidth() {
        return (Double) this.textHaloWidth.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextJustify getTextJustify() {
        return (TextJustify) this.textJustify.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextLetterSpacing() {
        return (Double) this.textLetterSpacing.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextLineHeight() {
        return (Double) this.textLineHeight.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextMaxWidth() {
        return (Double) this.textMaxWidth.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextOcclusionOpacity() {
        return (Double) this.textOcclusionOpacity.getF182175a();
    }

    public final List<Double> getTextOffset() {
        return (List) this.textOffset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextOpacity() {
        return (Double) this.textOpacity.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextRadialOffset() {
        return (Double) this.textRadialOffset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextRotate() {
        return (Double) this.textRotate.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextSize() {
        return (Double) this.textSize.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextTransform getTextTransform() {
        return (TextTransform) this.textTransform.getF182175a();
    }

    public final void setIconAnchor(IconAnchor iconAnchor) {
        this.iconAnchor.setValue(iconAnchor);
    }

    /* JADX INFO: renamed from: setIconColor-Y2TPw74, reason: not valid java name */
    public final void m166setIconColorY2TPw74(d0 d0Var) {
        this.iconColor.setValue(d0Var);
    }

    public final void setIconColorUseTheme(String str) {
        this.iconColorUseTheme.setValue(str);
    }

    public final void setIconEmissiveStrength(Double d14) {
        this.iconEmissiveStrength.setValue(d14);
    }

    public final void setIconHaloBlur(Double d14) {
        this.iconHaloBlur.setValue(d14);
    }

    /* JADX INFO: renamed from: setIconHaloColor-Y2TPw74, reason: not valid java name */
    public final void m167setIconHaloColorY2TPw74(d0 d0Var) {
        this.iconHaloColor.setValue(d0Var);
    }

    public final void setIconHaloColorUseTheme(String str) {
        this.iconHaloColorUseTheme.setValue(str);
    }

    public final void setIconHaloWidth(Double d14) {
        this.iconHaloWidth.setValue(d14);
    }

    public final void setIconImage(IconImage iconImage) {
        this.iconImage.setValue(iconImage);
    }

    public final void setIconImageCrossFade(Double d14) {
        this.iconImageCrossFade.setValue(d14);
    }

    public final void setIconOcclusionOpacity(Double d14) {
        this.iconOcclusionOpacity.setValue(d14);
    }

    public final void setIconOffset(List<Double> list) {
        this.iconOffset.setValue(list);
    }

    public final void setIconOpacity(Double d14) {
        this.iconOpacity.setValue(d14);
    }

    public final void setIconRotate(Double d14) {
        this.iconRotate.setValue(d14);
    }

    public final void setIconSize(Double d14) {
        this.iconSize.setValue(d14);
    }

    public final void setIconTextFit(IconTextFit iconTextFit) {
        this.iconTextFit.setValue(iconTextFit);
    }

    public final void setIconTextFitPadding(List<Double> list) {
        this.iconTextFitPadding.setValue(list);
    }

    public final void setInteractionsState(PointAnnotationInteractionsState pointAnnotationInteractionsState) {
        pointAnnotationInteractionsState.getClass();
        this.interactionsState.setValue(pointAnnotationInteractionsState);
    }

    public final void setSymbolZOffset(Double d14) {
        this.symbolZOffset.setValue(d14);
    }

    public final void setTextAnchor(TextAnchor textAnchor) {
        this.textAnchor.setValue(textAnchor);
    }

    /* JADX INFO: renamed from: setTextColor-Y2TPw74, reason: not valid java name */
    public final void m168setTextColorY2TPw74(d0 d0Var) {
        this.textColor.setValue(d0Var);
    }

    public final void setTextColorUseTheme(String str) {
        this.textColorUseTheme.setValue(str);
    }

    public final void setTextEmissiveStrength(Double d14) {
        this.textEmissiveStrength.setValue(d14);
    }

    public final void setTextField(String str) {
        this.textField.setValue(str);
    }

    public final void setTextHaloBlur(Double d14) {
        this.textHaloBlur.setValue(d14);
    }

    /* JADX INFO: renamed from: setTextHaloColor-Y2TPw74, reason: not valid java name */
    public final void m169setTextHaloColorY2TPw74(d0 d0Var) {
        this.textHaloColor.setValue(d0Var);
    }

    public final void setTextHaloColorUseTheme(String str) {
        this.textHaloColorUseTheme.setValue(str);
    }

    public final void setTextHaloWidth(Double d14) {
        this.textHaloWidth.setValue(d14);
    }

    public final void setTextJustify(TextJustify textJustify) {
        this.textJustify.setValue(textJustify);
    }

    public final void setTextLetterSpacing(Double d14) {
        this.textLetterSpacing.setValue(d14);
    }

    public final void setTextLineHeight(Double d14) {
        this.textLineHeight.setValue(d14);
    }

    public final void setTextMaxWidth(Double d14) {
        this.textMaxWidth.setValue(d14);
    }

    public final void setTextOcclusionOpacity(Double d14) {
        this.textOcclusionOpacity.setValue(d14);
    }

    public final void setTextOffset(List<Double> list) {
        this.textOffset.setValue(list);
    }

    public final void setTextOpacity(Double d14) {
        this.textOpacity.setValue(d14);
    }

    public final void setTextRadialOffset(Double d14) {
        this.textRadialOffset.setValue(d14);
    }

    public final void setTextRotate(Double d14) {
        this.textRotate.setValue(d14);
    }

    public final void setTextSize(Double d14) {
        this.textSize.setValue(d14);
    }

    public final void setTextTransform(TextTransform textTransform) {
        this.textTransform.setValue(textTransform);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconAnchor$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconAnchor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40712 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40712(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40722 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40722(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconEmissiveStrength$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40732 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40732(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconEmissiveStrength(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconHaloBlur$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40742 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40742(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconHaloBlur(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconHaloColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40752 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40752(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconHaloColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconHaloColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40762 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40762(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconHaloColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconHaloWidth$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40772 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40772(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconHaloWidth(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconImage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40782 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40782(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconImage(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconImageCrossFade$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconImageCrossFade(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconOcclusionOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40792 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40792(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconOcclusionOpacity(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconOffset$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40802 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40802(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconOffset(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40812 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40812(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconOpacity(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconRotate$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40822 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40822(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconRotate(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconSize$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40832 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40832(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconSize(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconTextFit$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40842 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40842(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconTextFit(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateIconTextFitPadding$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40852 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40852(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateIconTextFitPadding(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateSymbolZOffset$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40862 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40862(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateSymbolZOffset(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextAnchor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40872 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40872(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextAnchor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40882 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40882(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40892 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40892(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextEmissiveStrength$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40902 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40902(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextEmissiveStrength(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextField$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40912 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40912(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextField(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextHaloBlur$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40922 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40922(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextHaloBlur(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextHaloColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40932 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40932(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextHaloColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextHaloColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40942 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40942(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextHaloColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextHaloWidth$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40952 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40952(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextHaloWidth(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextJustify$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40962 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40962(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextJustify(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextLetterSpacing$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40972 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40972(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextLetterSpacing(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextLineHeight$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40982 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40982(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextLineHeight(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextMaxWidth$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40992 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40992(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextMaxWidth(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextOcclusionOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41002 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41002(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextOcclusionOpacity(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextOffset$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41012 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41012(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextOffset(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41022 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41022(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextOpacity(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextRadialOffset$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41032 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41032(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextRadialOffset(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextRotate$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41042 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41042(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextRotate(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextSize$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41052 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41052(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextSize(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationState$UpdateTextTransform$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41062 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41062(PointAnnotationNode pointAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = pointAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationState.this.UpdateTextTransform(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    public PointAnnotationState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PointAnnotationInteractionsState());
    }
}
