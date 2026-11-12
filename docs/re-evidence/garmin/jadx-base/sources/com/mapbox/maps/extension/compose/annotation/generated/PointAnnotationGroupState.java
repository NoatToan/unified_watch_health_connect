package com.mapbox.maps.extension.compose.annotation.generated;

import android.graphics.Bitmap;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.annotation.IconImage;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.IconPitchAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.IconRotationAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.IconTextFit;
import com.mapbox.maps.extension.style.layers.properties.generated.IconTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.SymbolElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.SymbolPlacement;
import com.mapbox.maps.extension.style.layers.properties.generated.SymbolZOrder;
import com.mapbox.maps.extension.style.layers.properties.generated.TextAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.TextJustify;
import com.mapbox.maps.extension.style.layers.properties.generated.TextPitchAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.TextRotationAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.TextTransform;
import com.mapbox.maps.extension.style.layers.properties.generated.TextTranslateAnchor;
import com.mapbox.maps.extension.style.utils.ColorUtils;
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
@Metadata(d1 = {"\u0000µ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0003\b¤\u0003\b\u0007\u0018\u00002\u00020\u0001B \u0006\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\b\u00100\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u000b\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00106\u001a\u0004\u0018\u00010\u000b\u0012\b\u00107\u001a\u0004\u0018\u00010\u000b\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\b\u0010:\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n\u0012\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n\u0012\b\u0010A\u001a\u0004\u0018\u00010@\u0012\b\u0010B\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010C\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010D\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010E\u001a\u0004\u0018\u00010@\u0012\b\u0010F\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010G\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010H\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010I\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010L\u001a\u0004\u0018\u00010K\u0012\b\u0010M\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010N\u001a\u0004\u0018\u00010@\u0012\b\u0010O\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010P\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010Q\u001a\u0004\u0018\u00010@\u0012\b\u0010R\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010S\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010T\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010W\u001a\u0004\u0018\u00010V\u0012\b\u0010X\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010Z\u001a\u0004\u0018\u00010&\u0012\b\u0010[\u001a\u0004\u0018\u00010&\u0012\b\u0010\\\u001a\u0004\u0018\u00010&\u0012\b\u0010]\u001a\u0004\u0018\u00010&\u0012\u0006\u0010_\u001a\u00020^ø\u0001\u0000¢\u0006\u0004\b`\u0010aB\t\b\u0016¢\u0006\u0004\b`\u0010bJ\u0017\u0010h\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0001¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bi\u0010gJ\u0017\u0010j\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bj\u0010gJ\u0017\u0010k\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bk\u0010gJ\u0017\u0010l\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bl\u0010gJ\u0017\u0010m\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bm\u0010gJ\u0017\u0010n\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bn\u0010gJ\u0017\u0010o\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bo\u0010gJ\u0017\u0010p\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bp\u0010gJ\u0017\u0010q\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bq\u0010gJ\u0017\u0010r\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\br\u0010gJ\u0017\u0010s\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bs\u0010gJ\u0017\u0010t\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bt\u0010gJ\u0017\u0010u\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bu\u0010gJ\u0017\u0010v\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bv\u0010gJ\u0017\u0010w\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bw\u0010gJ\u0017\u0010x\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bx\u0010gJ\u0017\u0010y\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\by\u0010gJ\u0017\u0010z\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\bz\u0010gJ\u0017\u0010{\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\b{\u0010gJ\u0017\u0010|\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\b|\u0010gJ\u0017\u0010}\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\b}\u0010gJ\u0017\u0010~\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\b~\u0010gJ\u0017\u0010\u007f\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\b\u007f\u0010gJ\u0019\u0010\u0080\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0080\u0001\u0010gJ\u0019\u0010\u0081\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0081\u0001\u0010gJ\u0019\u0010\u0082\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0082\u0001\u0010gJ\u0019\u0010\u0083\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0083\u0001\u0010gJ\u0019\u0010\u0084\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0084\u0001\u0010gJ\u0019\u0010\u0085\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0085\u0001\u0010gJ\u0019\u0010\u0086\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0086\u0001\u0010gJ\u0019\u0010\u0087\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0087\u0001\u0010gJ\u0019\u0010\u0088\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0088\u0001\u0010gJ\u0019\u0010\u0089\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0089\u0001\u0010gJ\u0019\u0010\u008a\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u008a\u0001\u0010gJ\u0019\u0010\u008b\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u008b\u0001\u0010gJ\u0019\u0010\u008c\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u008c\u0001\u0010gJ\u0019\u0010\u008d\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u008d\u0001\u0010gJ\u0019\u0010\u008e\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u008e\u0001\u0010gJ\u0019\u0010\u008f\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u008f\u0001\u0010gJ\u0019\u0010\u0090\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0090\u0001\u0010gJ\u0019\u0010\u0091\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0091\u0001\u0010gJ\u0019\u0010\u0092\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0092\u0001\u0010gJ\u0019\u0010\u0093\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0093\u0001\u0010gJ\u0019\u0010\u0094\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0094\u0001\u0010gJ\u0019\u0010\u0095\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0095\u0001\u0010gJ\u0019\u0010\u0096\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0096\u0001\u0010gJ\u0019\u0010\u0097\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0097\u0001\u0010gJ\u0019\u0010\u0098\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0098\u0001\u0010gJ\u0019\u0010\u0099\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u0099\u0001\u0010gJ\u0019\u0010\u009a\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u009a\u0001\u0010gJ\u0019\u0010\u009b\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u009b\u0001\u0010gJ\u0019\u0010\u009c\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u009c\u0001\u0010gJ\u0019\u0010\u009d\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u009d\u0001\u0010gJ\u0019\u0010\u009e\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u009e\u0001\u0010gJ\u0019\u0010\u009f\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u009f\u0001\u0010gJ\u0019\u0010 \u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b \u0001\u0010gJ\u0019\u0010¡\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b¡\u0001\u0010gJ\u0019\u0010¢\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b¢\u0001\u0010gJ\u0019\u0010£\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b£\u0001\u0010gJ\u0019\u0010¤\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b¤\u0001\u0010gJ\u0019\u0010¥\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b¥\u0001\u0010gJ\u0019\u0010¦\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b¦\u0001\u0010gJ\u0019\u0010§\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b§\u0001\u0010gJ\u0019\u0010¨\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b¨\u0001\u0010gJ\u0019\u0010©\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b©\u0001\u0010gJ\u0019\u0010ª\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\bª\u0001\u0010gJ\u0019\u0010«\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b«\u0001\u0010gJ\u0019\u0010¬\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b¬\u0001\u0010gJ\u0019\u0010\u00ad\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b\u00ad\u0001\u0010gJ\u0019\u0010®\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b®\u0001\u0010gJ\u0019\u0010¯\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b¯\u0001\u0010gJ\u0019\u0010°\u0001\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0003¢\u0006\u0005\b°\u0001\u0010gR3\u0010¸\u0001\u001a\u00020^2\u0007\u0010±\u0001\u001a\u00020^8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R7\u0010¾\u0001\u001a\u0004\u0018\u00010\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b¹\u0001\u0010³\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R7\u0010Ä\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b¿\u0001\u0010³\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R7\u0010È\u0001\u001a\u0004\u0018\u00010\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÅ\u0001\u0010³\u0001\u001a\u0006\bÆ\u0001\u0010»\u0001\"\u0006\bÇ\u0001\u0010½\u0001R7\u0010Î\u0001\u001a\u0004\u0018\u00010\u00072\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÉ\u0001\u0010³\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R7\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÏ\u0001\u0010³\u0001\u001a\u0006\bÐ\u0001\u0010»\u0001\"\u0006\bÑ\u0001\u0010½\u0001RC\u0010Ø\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000f\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÓ\u0001\u0010³\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R7\u0010Ü\u0001\u001a\u0004\u0018\u00010\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÙ\u0001\u0010³\u0001\u001a\u0006\bÚ\u0001\u0010»\u0001\"\u0006\bÛ\u0001\u0010½\u0001R7\u0010â\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÝ\u0001\u0010³\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R7\u0010è\u0001\u001a\u0004\u0018\u00010\u000f2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bã\u0001\u0010³\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R7\u0010ì\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bé\u0001\u0010³\u0001\u001a\u0006\bê\u0001\u0010ß\u0001\"\u0006\bë\u0001\u0010á\u0001R7\u0010ò\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bí\u0001\u0010³\u0001\u001a\u0006\bî\u0001\u0010ï\u0001\"\u0006\bð\u0001\u0010ñ\u0001R7\u0010ö\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bó\u0001\u0010³\u0001\u001a\u0006\bô\u0001\u0010ß\u0001\"\u0006\bõ\u0001\u0010á\u0001RJ\u0010û\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000f\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F@FX\u0087\u008e\u0002¢\u0006\u001f\n\u0006\b÷\u0001\u0010³\u0001\u0012\u0005\bú\u0001\u0010b\u001a\u0006\bø\u0001\u0010Õ\u0001\"\u0006\bù\u0001\u0010×\u0001R7\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00162\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bü\u0001\u0010³\u0001\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002RC\u0010\u0085\u0002\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000f\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010³\u0001\u001a\u0006\b\u0083\u0002\u0010Õ\u0001\"\u0006\b\u0084\u0002\u0010×\u0001R7\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u0086\u0002\u0010³\u0001\u001a\u0006\b\u0087\u0002\u0010»\u0001\"\u0006\b\u0088\u0002\u0010½\u0001R>\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u001a2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u001a8F@FX\u0087\u008e\u0002¢\u0006\u001f\n\u0006\b\u008a\u0002\u0010³\u0001\u0012\u0005\b\u008f\u0002\u0010b\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R7\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u001c2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u0091\u0002\u0010³\u0001\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R7\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u0097\u0002\u0010³\u0001\u001a\u0006\b\u0098\u0002\u0010ß\u0001\"\u0006\b\u0099\u0002\u0010á\u0001R7\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u009b\u0002\u0010³\u0001\u001a\u0006\b\u009c\u0002\u0010ß\u0001\"\u0006\b\u009d\u0002\u0010á\u0001R7\u0010¢\u0002\u001a\u0004\u0018\u00010\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u009f\u0002\u0010³\u0001\u001a\u0006\b \u0002\u0010»\u0001\"\u0006\b¡\u0002\u0010½\u0001R7\u0010¨\u0002\u001a\u0004\u0018\u00010!2\t\u0010±\u0001\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b£\u0002\u0010³\u0001\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b¦\u0002\u0010§\u0002R7\u0010¬\u0002\u001a\u0004\u0018\u00010\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b©\u0002\u0010³\u0001\u001a\u0006\bª\u0002\u0010»\u0001\"\u0006\b«\u0002\u0010½\u0001R7\u0010²\u0002\u001a\u0004\u0018\u00010$2\t\u0010±\u0001\u001a\u0004\u0018\u00010$8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u00ad\u0002\u0010³\u0001\u001a\u0006\b®\u0002\u0010¯\u0002\"\u0006\b°\u0002\u0010±\u0002R7\u0010¸\u0002\u001a\u0004\u0018\u00010&2\t\u0010±\u0001\u001a\u0004\u0018\u00010&8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b³\u0002\u0010³\u0001\u001a\u0006\b´\u0002\u0010µ\u0002\"\u0006\b¶\u0002\u0010·\u0002RC\u0010¼\u0002\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n2\u000f\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b¹\u0002\u0010³\u0001\u001a\u0006\bº\u0002\u0010Õ\u0001\"\u0006\b»\u0002\u0010×\u0001R7\u0010À\u0002\u001a\u0004\u0018\u00010\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b½\u0002\u0010³\u0001\u001a\u0006\b¾\u0002\u0010»\u0001\"\u0006\b¿\u0002\u0010½\u0001R7\u0010Æ\u0002\u001a\u0004\u0018\u00010*2\t\u0010±\u0001\u001a\u0004\u0018\u00010*8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÁ\u0002\u0010³\u0001\u001a\u0006\bÂ\u0002\u0010Ã\u0002\"\u0006\bÄ\u0002\u0010Å\u0002R7\u0010Ê\u0002\u001a\u0004\u0018\u00010\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÇ\u0002\u0010³\u0001\u001a\u0006\bÈ\u0002\u0010»\u0001\"\u0006\bÉ\u0002\u0010½\u0001R7\u0010Î\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bË\u0002\u0010³\u0001\u001a\u0006\bÌ\u0002\u0010ß\u0001\"\u0006\bÍ\u0002\u0010á\u0001R7\u0010Ò\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÏ\u0002\u0010³\u0001\u001a\u0006\bÐ\u0002\u0010ß\u0001\"\u0006\bÑ\u0002\u0010á\u0001R7\u0010Ö\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÓ\u0002\u0010³\u0001\u001a\u0006\bÔ\u0002\u0010ß\u0001\"\u0006\bÕ\u0002\u0010á\u0001R7\u0010Ú\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b×\u0002\u0010³\u0001\u001a\u0006\bØ\u0002\u0010ß\u0001\"\u0006\bÙ\u0002\u0010á\u0001RC\u0010Þ\u0002\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000f\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÛ\u0002\u0010³\u0001\u001a\u0006\bÜ\u0002\u0010Õ\u0001\"\u0006\bÝ\u0002\u0010×\u0001R7\u0010â\u0002\u001a\u0004\u0018\u00010\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bß\u0002\u0010³\u0001\u001a\u0006\bà\u0002\u0010»\u0001\"\u0006\bá\u0002\u0010½\u0001R7\u0010æ\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bã\u0002\u0010³\u0001\u001a\u0006\bä\u0002\u0010ß\u0001\"\u0006\bå\u0002\u0010á\u0001R7\u0010ì\u0002\u001a\u0004\u0018\u0001042\t\u0010±\u0001\u001a\u0004\u0018\u0001048F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bç\u0002\u0010³\u0001\u001a\u0006\bè\u0002\u0010é\u0002\"\u0006\bê\u0002\u0010ë\u0002R7\u0010ð\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bí\u0002\u0010³\u0001\u001a\u0006\bî\u0002\u0010ß\u0001\"\u0006\bï\u0002\u0010á\u0001R7\u0010ô\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bñ\u0002\u0010³\u0001\u001a\u0006\bò\u0002\u0010ß\u0001\"\u0006\bó\u0002\u0010á\u0001R7\u0010ú\u0002\u001a\u0004\u0018\u0001082\t\u0010±\u0001\u001a\u0004\u0018\u0001088F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bõ\u0002\u0010³\u0001\u001a\u0006\bö\u0002\u0010÷\u0002\"\u0006\bø\u0002\u0010ù\u0002R7\u0010þ\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bû\u0002\u0010³\u0001\u001a\u0006\bü\u0002\u0010ß\u0001\"\u0006\bý\u0002\u0010á\u0001RJ\u0010\u0083\u0003\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000f\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F@FX\u0087\u008e\u0002¢\u0006\u001f\n\u0006\bÿ\u0002\u0010³\u0001\u0012\u0005\b\u0082\u0003\u0010b\u001a\u0006\b\u0080\u0003\u0010Õ\u0001\"\u0006\b\u0081\u0003\u0010×\u0001R7\u0010\u0089\u0003\u001a\u0004\u0018\u00010<2\t\u0010±\u0001\u001a\u0004\u0018\u00010<8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u0084\u0003\u0010³\u0001\u001a\u0006\b\u0085\u0003\u0010\u0086\u0003\"\u0006\b\u0087\u0003\u0010\u0088\u0003RC\u0010\u008d\u0003\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n2\u000f\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u008a\u0003\u0010³\u0001\u001a\u0006\b\u008b\u0003\u0010Õ\u0001\"\u0006\b\u008c\u0003\u0010×\u0001RC\u0010\u0091\u0003\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n2\u000f\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u008e\u0003\u0010³\u0001\u001a\u0006\b\u008f\u0003\u0010Õ\u0001\"\u0006\b\u0090\u0003\u0010×\u0001R@\u0010\u0097\u0003\u001a\u0004\u0018\u00010@2\t\u0010±\u0001\u001a\u0004\u0018\u00010@8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0018\n\u0006\b\u0092\u0003\u0010³\u0001\u001a\u0006\b\u0093\u0003\u0010\u0094\u0003\"\u0006\b\u0095\u0003\u0010\u0096\u0003R7\u0010\u009b\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u0098\u0003\u0010³\u0001\u001a\u0006\b\u0099\u0003\u0010ß\u0001\"\u0006\b\u009a\u0003\u0010á\u0001R7\u0010\u009f\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u009c\u0003\u0010³\u0001\u001a\u0006\b\u009d\u0003\u0010ß\u0001\"\u0006\b\u009e\u0003\u0010á\u0001R7\u0010£\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b \u0003\u0010³\u0001\u001a\u0006\b¡\u0003\u0010ß\u0001\"\u0006\b¢\u0003\u0010á\u0001R@\u0010§\u0003\u001a\u0004\u0018\u00010@2\t\u0010±\u0001\u001a\u0004\u0018\u00010@8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0018\n\u0006\b¤\u0003\u0010³\u0001\u001a\u0006\b¥\u0003\u0010\u0094\u0003\"\u0006\b¦\u0003\u0010\u0096\u0003R7\u0010«\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b¨\u0003\u0010³\u0001\u001a\u0006\b©\u0003\u0010ß\u0001\"\u0006\bª\u0003\u0010á\u0001R7\u0010¯\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b¬\u0003\u0010³\u0001\u001a\u0006\b\u00ad\u0003\u0010ß\u0001\"\u0006\b®\u0003\u0010á\u0001R7\u0010³\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b°\u0003\u0010³\u0001\u001a\u0006\b±\u0003\u0010ß\u0001\"\u0006\b²\u0003\u0010á\u0001R7\u0010·\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b´\u0003\u0010³\u0001\u001a\u0006\bµ\u0003\u0010ß\u0001\"\u0006\b¶\u0003\u0010á\u0001RC\u0010»\u0003\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000f\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b¸\u0003\u0010³\u0001\u001a\u0006\b¹\u0003\u0010Õ\u0001\"\u0006\bº\u0003\u0010×\u0001R7\u0010Á\u0003\u001a\u0004\u0018\u00010K2\t\u0010±\u0001\u001a\u0004\u0018\u00010K8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b¼\u0003\u0010³\u0001\u001a\u0006\b½\u0003\u0010¾\u0003\"\u0006\b¿\u0003\u0010À\u0003R>\u0010Æ\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0087\u008e\u0002¢\u0006\u001f\n\u0006\bÂ\u0003\u0010³\u0001\u0012\u0005\bÅ\u0003\u0010b\u001a\u0006\bÃ\u0003\u0010ß\u0001\"\u0006\bÄ\u0003\u0010á\u0001R@\u0010Ê\u0003\u001a\u0004\u0018\u00010@2\t\u0010±\u0001\u001a\u0004\u0018\u00010@8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0018\n\u0006\bÇ\u0003\u0010³\u0001\u001a\u0006\bÈ\u0003\u0010\u0094\u0003\"\u0006\bÉ\u0003\u0010\u0096\u0003R7\u0010Î\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bË\u0003\u0010³\u0001\u001a\u0006\bÌ\u0003\u0010ß\u0001\"\u0006\bÍ\u0003\u0010á\u0001R7\u0010Ò\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÏ\u0003\u0010³\u0001\u001a\u0006\bÐ\u0003\u0010ß\u0001\"\u0006\bÑ\u0003\u0010á\u0001R@\u0010Ö\u0003\u001a\u0004\u0018\u00010@2\t\u0010±\u0001\u001a\u0004\u0018\u00010@8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0018\n\u0006\bÓ\u0003\u0010³\u0001\u001a\u0006\bÔ\u0003\u0010\u0094\u0003\"\u0006\bÕ\u0003\u0010\u0096\u0003R7\u0010Ú\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b×\u0003\u0010³\u0001\u001a\u0006\bØ\u0003\u0010ß\u0001\"\u0006\bÙ\u0003\u0010á\u0001R7\u0010Þ\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÛ\u0003\u0010³\u0001\u001a\u0006\bÜ\u0003\u0010ß\u0001\"\u0006\bÝ\u0003\u0010á\u0001R7\u0010â\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bß\u0003\u0010³\u0001\u001a\u0006\bà\u0003\u0010ß\u0001\"\u0006\bá\u0003\u0010á\u0001RC\u0010æ\u0003\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000f\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bã\u0003\u0010³\u0001\u001a\u0006\bä\u0003\u0010Õ\u0001\"\u0006\bå\u0003\u0010×\u0001R7\u0010ì\u0003\u001a\u0004\u0018\u00010V2\t\u0010±\u0001\u001a\u0004\u0018\u00010V8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bç\u0003\u0010³\u0001\u001a\u0006\bè\u0003\u0010é\u0003\"\u0006\bê\u0003\u0010ë\u0003R7\u0010ð\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bí\u0003\u0010³\u0001\u001a\u0006\bî\u0003\u0010ß\u0001\"\u0006\bï\u0003\u0010á\u0001R7\u0010ô\u0003\u001a\u0004\u0018\u00010\u000b2\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bñ\u0003\u0010³\u0001\u001a\u0006\bò\u0003\u0010ß\u0001\"\u0006\bó\u0003\u0010á\u0001R>\u0010ù\u0003\u001a\u0004\u0018\u00010&2\t\u0010±\u0001\u001a\u0004\u0018\u00010&8F@FX\u0087\u008e\u0002¢\u0006\u001f\n\u0006\bõ\u0003\u0010³\u0001\u0012\u0005\bø\u0003\u0010b\u001a\u0006\bö\u0003\u0010µ\u0002\"\u0006\b÷\u0003\u0010·\u0002R>\u0010þ\u0003\u001a\u0004\u0018\u00010&2\t\u0010±\u0001\u001a\u0004\u0018\u00010&8F@FX\u0087\u008e\u0002¢\u0006\u001f\n\u0006\bú\u0003\u0010³\u0001\u0012\u0005\bý\u0003\u0010b\u001a\u0006\bû\u0003\u0010µ\u0002\"\u0006\bü\u0003\u0010·\u0002R>\u0010\u0083\u0004\u001a\u0004\u0018\u00010&2\t\u0010±\u0001\u001a\u0004\u0018\u00010&8F@FX\u0087\u008e\u0002¢\u0006\u001f\n\u0006\bÿ\u0003\u0010³\u0001\u0012\u0005\b\u0082\u0004\u0010b\u001a\u0006\b\u0080\u0004\u0010µ\u0002\"\u0006\b\u0081\u0004\u0010·\u0002R>\u0010\u0088\u0004\u001a\u0004\u0018\u00010&2\t\u0010±\u0001\u001a\u0004\u0018\u00010&8F@FX\u0087\u008e\u0002¢\u0006\u001f\n\u0006\b\u0084\u0004\u0010³\u0001\u0012\u0005\b\u0087\u0004\u0010b\u001a\u0006\b\u0085\u0004\u0010µ\u0002\"\u0006\b\u0086\u0004\u0010·\u0002\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0089\u0004"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationGroupState;", "", "", "initialIconAllowOverlap", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "initialIconAnchor", "initialIconIgnorePlacement", "Lcom/mapbox/maps/extension/compose/annotation/IconImage;", "initialIconImage", "initialIconKeepUpright", "", "", "initialIconOffset", "initialIconOptional", "initialIconPadding", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconPitchAlignment;", "initialIconPitchAlignment", "initialIconRotate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;", "initialIconRotationAlignment", "initialIconSize", "initialIconSizeScaleRange", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "initialIconTextFit", "initialIconTextFitPadding", "initialSymbolAvoidEdges", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolElevationReference;", "initialSymbolElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolPlacement;", "initialSymbolPlacement", "initialSymbolSortKey", "initialSymbolSpacing", "initialSymbolZElevate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolZOrder;", "initialSymbolZOrder", "initialTextAllowOverlap", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "initialTextAnchor", "", "initialTextField", "initialTextFont", "initialTextIgnorePlacement", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "initialTextJustify", "initialTextKeepUpright", "initialTextLetterSpacing", "initialTextLineHeight", "initialTextMaxAngle", "initialTextMaxWidth", "initialTextOffset", "initialTextOptional", "initialTextPadding", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextPitchAlignment;", "initialTextPitchAlignment", "initialTextRadialOffset", "initialTextRotate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextRotationAlignment;", "initialTextRotationAlignment", "initialTextSize", "initialTextSizeScaleRange", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", "initialTextTransform", "initialTextVariableAnchor", "initialTextWritingMode", "Lo4/d0;", "initialIconColor", "initialIconColorSaturation", "initialIconEmissiveStrength", "initialIconHaloBlur", "initialIconHaloColor", "initialIconHaloWidth", "initialIconImageCrossFade", "initialIconOcclusionOpacity", "initialIconOpacity", "initialIconTranslate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTranslateAnchor;", "initialIconTranslateAnchor", "initialSymbolZOffset", "initialTextColor", "initialTextEmissiveStrength", "initialTextHaloBlur", "initialTextHaloColor", "initialTextHaloWidth", "initialTextOcclusionOpacity", "initialTextOpacity", "initialTextTranslate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTranslateAnchor;", "initialTextTranslateAnchor", "initialMaxZoom", "initialMinZoom", "initialIconColorUseTheme", "initialIconHaloColorUseTheme", "initialTextColorUseTheme", "initialTextHaloColorUseTheme", "Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationGroupInteractionsState;", "initialPointAnnotationGroupInteractionsState", "<init>", "(Ljava/lang/Boolean;Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;Ljava/lang/Boolean;Lcom/mapbox/maps/extension/compose/annotation/IconImage;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Double;Lcom/mapbox/maps/extension/style/layers/properties/generated/IconPitchAlignment;Ljava/lang/Double;Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;Ljava/lang/Double;Ljava/util/List;Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;Ljava/util/List;Ljava/lang/Boolean;Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolElevationReference;Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolPlacement;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolZOrder;Ljava/lang/Boolean;Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Double;Lcom/mapbox/maps/extension/style/layers/properties/generated/TextPitchAlignment;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/extension/style/layers/properties/generated/TextRotationAlignment;Ljava/lang/Double;Ljava/util/List;Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;Ljava/util/List;Ljava/util/List;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTranslateAnchor;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTranslateAnchor;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationGroupInteractionsState;)V", "()V", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationManager;", "annotationManager", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationManager;Lp3/m;I)V", "UpdateProperties", "UpdateIconAllowOverlap", "UpdateIconAnchor", "UpdateIconIgnorePlacement", "UpdateIconImage", "UpdateIconKeepUpright", "UpdateIconOffset", "UpdateIconOptional", "UpdateIconPadding", "UpdateIconPitchAlignment", "UpdateIconRotate", "UpdateIconRotationAlignment", "UpdateIconSize", "UpdateIconSizeScaleRange", "UpdateIconTextFit", "UpdateIconTextFitPadding", "UpdateSymbolAvoidEdges", "UpdateSymbolElevationReference", "UpdateSymbolPlacement", "UpdateSymbolSortKey", "UpdateSymbolSpacing", "UpdateSymbolZElevate", "UpdateSymbolZOrder", "UpdateTextAllowOverlap", "UpdateTextAnchor", "UpdateTextField", "UpdateTextFont", "UpdateTextIgnorePlacement", "UpdateTextJustify", "UpdateTextKeepUpright", "UpdateTextLetterSpacing", "UpdateTextLineHeight", "UpdateTextMaxAngle", "UpdateTextMaxWidth", "UpdateTextOffset", "UpdateTextOptional", "UpdateTextPadding", "UpdateTextPitchAlignment", "UpdateTextRadialOffset", "UpdateTextRotate", "UpdateTextRotationAlignment", "UpdateTextSize", "UpdateTextSizeScaleRange", "UpdateTextTransform", "UpdateTextVariableAnchor", "UpdateTextWritingMode", "UpdateIconColor", "UpdateIconColorSaturation", "UpdateIconEmissiveStrength", "UpdateIconHaloBlur", "UpdateIconHaloColor", "UpdateIconHaloWidth", "UpdateIconImageCrossFade", "UpdateIconOcclusionOpacity", "UpdateIconOpacity", "UpdateIconTranslate", "UpdateIconTranslateAnchor", "UpdateSymbolZOffset", "UpdateTextColor", "UpdateTextEmissiveStrength", "UpdateTextHaloBlur", "UpdateTextHaloColor", "UpdateTextHaloWidth", "UpdateTextOcclusionOpacity", "UpdateTextOpacity", "UpdateTextTranslate", "UpdateTextTranslateAnchor", "UpdateMaxZoom", "UpdateMinZoom", "UpdateIconColorUseTheme", "UpdateIconHaloColorUseTheme", "UpdateTextColorUseTheme", "UpdateTextHaloColorUseTheme", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationGroupInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationGroupInteractionsState;)V", "interactionsState", "iconAllowOverlap$delegate", "getIconAllowOverlap", "()Ljava/lang/Boolean;", "setIconAllowOverlap", "(Ljava/lang/Boolean;)V", "iconAllowOverlap", "iconAnchor$delegate", "getIconAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "setIconAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;)V", "iconAnchor", "iconIgnorePlacement$delegate", "getIconIgnorePlacement", "setIconIgnorePlacement", "iconIgnorePlacement", "iconImage$delegate", "getIconImage", "()Lcom/mapbox/maps/extension/compose/annotation/IconImage;", "setIconImage", "(Lcom/mapbox/maps/extension/compose/annotation/IconImage;)V", "iconImage", "iconKeepUpright$delegate", "getIconKeepUpright", "setIconKeepUpright", "iconKeepUpright", "iconOffset$delegate", "getIconOffset", "()Ljava/util/List;", "setIconOffset", "(Ljava/util/List;)V", "iconOffset", "iconOptional$delegate", "getIconOptional", "setIconOptional", "iconOptional", "iconPadding$delegate", "getIconPadding", "()Ljava/lang/Double;", "setIconPadding", "(Ljava/lang/Double;)V", "iconPadding", "iconPitchAlignment$delegate", "getIconPitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconPitchAlignment;", "setIconPitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconPitchAlignment;)V", "iconPitchAlignment", "iconRotate$delegate", "getIconRotate", "setIconRotate", "iconRotate", "iconRotationAlignment$delegate", "getIconRotationAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;", "setIconRotationAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;)V", "iconRotationAlignment", "iconSize$delegate", "getIconSize", "setIconSize", "iconSize", "iconSizeScaleRange$delegate", "getIconSizeScaleRange", "setIconSizeScaleRange", "getIconSizeScaleRange$annotations", "iconSizeScaleRange", "iconTextFit$delegate", "getIconTextFit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "setIconTextFit", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;)V", "iconTextFit", "iconTextFitPadding$delegate", "getIconTextFitPadding", "setIconTextFitPadding", "iconTextFitPadding", "symbolAvoidEdges$delegate", "getSymbolAvoidEdges", "setSymbolAvoidEdges", "symbolAvoidEdges", "symbolElevationReference$delegate", "getSymbolElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolElevationReference;", "setSymbolElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolElevationReference;)V", "getSymbolElevationReference$annotations", "symbolElevationReference", "symbolPlacement$delegate", "getSymbolPlacement", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolPlacement;", "setSymbolPlacement", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolPlacement;)V", "symbolPlacement", "symbolSortKey$delegate", "getSymbolSortKey", "setSymbolSortKey", "symbolSortKey", "symbolSpacing$delegate", "getSymbolSpacing", "setSymbolSpacing", "symbolSpacing", "symbolZElevate$delegate", "getSymbolZElevate", "setSymbolZElevate", "symbolZElevate", "symbolZOrder$delegate", "getSymbolZOrder", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolZOrder;", "setSymbolZOrder", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolZOrder;)V", "symbolZOrder", "textAllowOverlap$delegate", "getTextAllowOverlap", "setTextAllowOverlap", "textAllowOverlap", "textAnchor$delegate", "getTextAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "setTextAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;)V", "textAnchor", "textField$delegate", "getTextField", "()Ljava/lang/String;", "setTextField", "(Ljava/lang/String;)V", "textField", "textFont$delegate", "getTextFont", "setTextFont", GNCSOptOutSettingsFragment.EXTRA_TEXT_FONT, "textIgnorePlacement$delegate", "getTextIgnorePlacement", "setTextIgnorePlacement", "textIgnorePlacement", "textJustify$delegate", "getTextJustify", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "setTextJustify", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;)V", "textJustify", "textKeepUpright$delegate", "getTextKeepUpright", "setTextKeepUpright", "textKeepUpright", "textLetterSpacing$delegate", "getTextLetterSpacing", "setTextLetterSpacing", "textLetterSpacing", "textLineHeight$delegate", "getTextLineHeight", "setTextLineHeight", "textLineHeight", "textMaxAngle$delegate", "getTextMaxAngle", "setTextMaxAngle", "textMaxAngle", "textMaxWidth$delegate", "getTextMaxWidth", "setTextMaxWidth", "textMaxWidth", "textOffset$delegate", "getTextOffset", "setTextOffset", "textOffset", "textOptional$delegate", "getTextOptional", "setTextOptional", "textOptional", "textPadding$delegate", "getTextPadding", "setTextPadding", "textPadding", "textPitchAlignment$delegate", "getTextPitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextPitchAlignment;", "setTextPitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextPitchAlignment;)V", "textPitchAlignment", "textRadialOffset$delegate", "getTextRadialOffset", "setTextRadialOffset", "textRadialOffset", "textRotate$delegate", "getTextRotate", "setTextRotate", "textRotate", "textRotationAlignment$delegate", "getTextRotationAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextRotationAlignment;", "setTextRotationAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextRotationAlignment;)V", "textRotationAlignment", "textSize$delegate", "getTextSize", "setTextSize", "textSize", "textSizeScaleRange$delegate", "getTextSizeScaleRange", "setTextSizeScaleRange", "getTextSizeScaleRange$annotations", "textSizeScaleRange", "textTransform$delegate", "getTextTransform", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", "setTextTransform", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;)V", "textTransform", "textVariableAnchor$delegate", "getTextVariableAnchor", "setTextVariableAnchor", "textVariableAnchor", "textWritingMode$delegate", "getTextWritingMode", "setTextWritingMode", "textWritingMode", "iconColor$delegate", "getIconColor-QN2ZGVo", "()Lo4/d0;", "setIconColor-Y2TPw74", "(Lo4/d0;)V", "iconColor", "iconColorSaturation$delegate", "getIconColorSaturation", "setIconColorSaturation", "iconColorSaturation", "iconEmissiveStrength$delegate", "getIconEmissiveStrength", "setIconEmissiveStrength", "iconEmissiveStrength", "iconHaloBlur$delegate", "getIconHaloBlur", "setIconHaloBlur", "iconHaloBlur", "iconHaloColor$delegate", "getIconHaloColor-QN2ZGVo", "setIconHaloColor-Y2TPw74", "iconHaloColor", "iconHaloWidth$delegate", "getIconHaloWidth", "setIconHaloWidth", "iconHaloWidth", "iconImageCrossFade$delegate", "getIconImageCrossFade", "setIconImageCrossFade", "iconImageCrossFade", "iconOcclusionOpacity$delegate", "getIconOcclusionOpacity", "setIconOcclusionOpacity", "iconOcclusionOpacity", "iconOpacity$delegate", "getIconOpacity", "setIconOpacity", "iconOpacity", "iconTranslate$delegate", "getIconTranslate", "setIconTranslate", "iconTranslate", "iconTranslateAnchor$delegate", "getIconTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTranslateAnchor;", "setIconTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTranslateAnchor;)V", "iconTranslateAnchor", "symbolZOffset$delegate", "getSymbolZOffset", "setSymbolZOffset", "getSymbolZOffset$annotations", "symbolZOffset", "textColor$delegate", "getTextColor-QN2ZGVo", "setTextColor-Y2TPw74", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "textEmissiveStrength$delegate", "getTextEmissiveStrength", "setTextEmissiveStrength", "textEmissiveStrength", "textHaloBlur$delegate", "getTextHaloBlur", "setTextHaloBlur", "textHaloBlur", "textHaloColor$delegate", "getTextHaloColor-QN2ZGVo", "setTextHaloColor-Y2TPw74", "textHaloColor", "textHaloWidth$delegate", "getTextHaloWidth", "setTextHaloWidth", "textHaloWidth", "textOcclusionOpacity$delegate", "getTextOcclusionOpacity", "setTextOcclusionOpacity", "textOcclusionOpacity", "textOpacity$delegate", "getTextOpacity", "setTextOpacity", "textOpacity", "textTranslate$delegate", "getTextTranslate", "setTextTranslate", "textTranslate", "textTranslateAnchor$delegate", "getTextTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTranslateAnchor;", "setTextTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTranslateAnchor;)V", "textTranslateAnchor", "maxZoom$delegate", "getMaxZoom", "setMaxZoom", "maxZoom", "minZoom$delegate", "getMinZoom", "setMinZoom", "minZoom", "iconColorUseTheme$delegate", "getIconColorUseTheme", "setIconColorUseTheme", "getIconColorUseTheme$annotations", "iconColorUseTheme", "iconHaloColorUseTheme$delegate", "getIconHaloColorUseTheme", "setIconHaloColorUseTheme", "getIconHaloColorUseTheme$annotations", "iconHaloColorUseTheme", "textColorUseTheme$delegate", "getTextColorUseTheme", "setTextColorUseTheme", "getTextColorUseTheme$annotations", "textColorUseTheme", "textHaloColorUseTheme$delegate", "getTextHaloColorUseTheme", "setTextHaloColorUseTheme", "getTextHaloColorUseTheme$annotations", "textHaloColorUseTheme", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PointAnnotationGroupState {

    /* JADX INFO: renamed from: iconAllowOverlap$delegate, reason: from kotlin metadata */
    private final p1 iconAllowOverlap;

    /* JADX INFO: renamed from: iconAnchor$delegate, reason: from kotlin metadata */
    private final p1 iconAnchor;

    /* JADX INFO: renamed from: iconColor$delegate, reason: from kotlin metadata */
    private final p1 iconColor;

    /* JADX INFO: renamed from: iconColorSaturation$delegate, reason: from kotlin metadata */
    private final p1 iconColorSaturation;

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

    /* JADX INFO: renamed from: iconIgnorePlacement$delegate, reason: from kotlin metadata */
    private final p1 iconIgnorePlacement;

    /* JADX INFO: renamed from: iconImage$delegate, reason: from kotlin metadata */
    private final p1 iconImage;

    /* JADX INFO: renamed from: iconImageCrossFade$delegate, reason: from kotlin metadata */
    private final p1 iconImageCrossFade;

    /* JADX INFO: renamed from: iconKeepUpright$delegate, reason: from kotlin metadata */
    private final p1 iconKeepUpright;

    /* JADX INFO: renamed from: iconOcclusionOpacity$delegate, reason: from kotlin metadata */
    private final p1 iconOcclusionOpacity;

    /* JADX INFO: renamed from: iconOffset$delegate, reason: from kotlin metadata */
    private final p1 iconOffset;

    /* JADX INFO: renamed from: iconOpacity$delegate, reason: from kotlin metadata */
    private final p1 iconOpacity;

    /* JADX INFO: renamed from: iconOptional$delegate, reason: from kotlin metadata */
    private final p1 iconOptional;

    /* JADX INFO: renamed from: iconPadding$delegate, reason: from kotlin metadata */
    private final p1 iconPadding;

    /* JADX INFO: renamed from: iconPitchAlignment$delegate, reason: from kotlin metadata */
    private final p1 iconPitchAlignment;

    /* JADX INFO: renamed from: iconRotate$delegate, reason: from kotlin metadata */
    private final p1 iconRotate;

    /* JADX INFO: renamed from: iconRotationAlignment$delegate, reason: from kotlin metadata */
    private final p1 iconRotationAlignment;

    /* JADX INFO: renamed from: iconSize$delegate, reason: from kotlin metadata */
    private final p1 iconSize;

    /* JADX INFO: renamed from: iconSizeScaleRange$delegate, reason: from kotlin metadata */
    private final p1 iconSizeScaleRange;

    /* JADX INFO: renamed from: iconTextFit$delegate, reason: from kotlin metadata */
    private final p1 iconTextFit;

    /* JADX INFO: renamed from: iconTextFitPadding$delegate, reason: from kotlin metadata */
    private final p1 iconTextFitPadding;

    /* JADX INFO: renamed from: iconTranslate$delegate, reason: from kotlin metadata */
    private final p1 iconTranslate;

    /* JADX INFO: renamed from: iconTranslateAnchor$delegate, reason: from kotlin metadata */
    private final p1 iconTranslateAnchor;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;

    /* JADX INFO: renamed from: maxZoom$delegate, reason: from kotlin metadata */
    private final p1 maxZoom;

    /* JADX INFO: renamed from: minZoom$delegate, reason: from kotlin metadata */
    private final p1 minZoom;

    /* JADX INFO: renamed from: symbolAvoidEdges$delegate, reason: from kotlin metadata */
    private final p1 symbolAvoidEdges;

    /* JADX INFO: renamed from: symbolElevationReference$delegate, reason: from kotlin metadata */
    private final p1 symbolElevationReference;

    /* JADX INFO: renamed from: symbolPlacement$delegate, reason: from kotlin metadata */
    private final p1 symbolPlacement;

    /* JADX INFO: renamed from: symbolSortKey$delegate, reason: from kotlin metadata */
    private final p1 symbolSortKey;

    /* JADX INFO: renamed from: symbolSpacing$delegate, reason: from kotlin metadata */
    private final p1 symbolSpacing;

    /* JADX INFO: renamed from: symbolZElevate$delegate, reason: from kotlin metadata */
    private final p1 symbolZElevate;

    /* JADX INFO: renamed from: symbolZOffset$delegate, reason: from kotlin metadata */
    private final p1 symbolZOffset;

    /* JADX INFO: renamed from: symbolZOrder$delegate, reason: from kotlin metadata */
    private final p1 symbolZOrder;

    /* JADX INFO: renamed from: textAllowOverlap$delegate, reason: from kotlin metadata */
    private final p1 textAllowOverlap;

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

    /* JADX INFO: renamed from: textFont$delegate, reason: from kotlin metadata */
    private final p1 textFont;

    /* JADX INFO: renamed from: textHaloBlur$delegate, reason: from kotlin metadata */
    private final p1 textHaloBlur;

    /* JADX INFO: renamed from: textHaloColor$delegate, reason: from kotlin metadata */
    private final p1 textHaloColor;

    /* JADX INFO: renamed from: textHaloColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 textHaloColorUseTheme;

    /* JADX INFO: renamed from: textHaloWidth$delegate, reason: from kotlin metadata */
    private final p1 textHaloWidth;

    /* JADX INFO: renamed from: textIgnorePlacement$delegate, reason: from kotlin metadata */
    private final p1 textIgnorePlacement;

    /* JADX INFO: renamed from: textJustify$delegate, reason: from kotlin metadata */
    private final p1 textJustify;

    /* JADX INFO: renamed from: textKeepUpright$delegate, reason: from kotlin metadata */
    private final p1 textKeepUpright;

    /* JADX INFO: renamed from: textLetterSpacing$delegate, reason: from kotlin metadata */
    private final p1 textLetterSpacing;

    /* JADX INFO: renamed from: textLineHeight$delegate, reason: from kotlin metadata */
    private final p1 textLineHeight;

    /* JADX INFO: renamed from: textMaxAngle$delegate, reason: from kotlin metadata */
    private final p1 textMaxAngle;

    /* JADX INFO: renamed from: textMaxWidth$delegate, reason: from kotlin metadata */
    private final p1 textMaxWidth;

    /* JADX INFO: renamed from: textOcclusionOpacity$delegate, reason: from kotlin metadata */
    private final p1 textOcclusionOpacity;

    /* JADX INFO: renamed from: textOffset$delegate, reason: from kotlin metadata */
    private final p1 textOffset;

    /* JADX INFO: renamed from: textOpacity$delegate, reason: from kotlin metadata */
    private final p1 textOpacity;

    /* JADX INFO: renamed from: textOptional$delegate, reason: from kotlin metadata */
    private final p1 textOptional;

    /* JADX INFO: renamed from: textPadding$delegate, reason: from kotlin metadata */
    private final p1 textPadding;

    /* JADX INFO: renamed from: textPitchAlignment$delegate, reason: from kotlin metadata */
    private final p1 textPitchAlignment;

    /* JADX INFO: renamed from: textRadialOffset$delegate, reason: from kotlin metadata */
    private final p1 textRadialOffset;

    /* JADX INFO: renamed from: textRotate$delegate, reason: from kotlin metadata */
    private final p1 textRotate;

    /* JADX INFO: renamed from: textRotationAlignment$delegate, reason: from kotlin metadata */
    private final p1 textRotationAlignment;

    /* JADX INFO: renamed from: textSize$delegate, reason: from kotlin metadata */
    private final p1 textSize;

    /* JADX INFO: renamed from: textSizeScaleRange$delegate, reason: from kotlin metadata */
    private final p1 textSizeScaleRange;

    /* JADX INFO: renamed from: textTransform$delegate, reason: from kotlin metadata */
    private final p1 textTransform;

    /* JADX INFO: renamed from: textTranslate$delegate, reason: from kotlin metadata */
    private final p1 textTranslate;

    /* JADX INFO: renamed from: textTranslateAnchor$delegate, reason: from kotlin metadata */
    private final p1 textTranslateAnchor;

    /* JADX INFO: renamed from: textVariableAnchor$delegate, reason: from kotlin metadata */
    private final p1 textVariableAnchor;

    /* JADX INFO: renamed from: textWritingMode$delegate, reason: from kotlin metadata */
    private final p1 textWritingMode;

    private PointAnnotationGroupState(Boolean bool, IconAnchor iconAnchor, Boolean bool2, IconImage iconImage, Boolean bool3, List<Double> list, Boolean bool4, Double d14, IconPitchAlignment iconPitchAlignment, Double d15, IconRotationAlignment iconRotationAlignment, Double d16, List<Double> list2, IconTextFit iconTextFit, List<Double> list3, Boolean bool5, SymbolElevationReference symbolElevationReference, SymbolPlacement symbolPlacement, Double d17, Double d18, Boolean bool6, SymbolZOrder symbolZOrder, Boolean bool7, TextAnchor textAnchor, String str, List<String> list4, Boolean bool8, TextJustify textJustify, Boolean bool9, Double d19, Double d24, Double d25, Double d26, List<Double> list5, Boolean bool10, Double d27, TextPitchAlignment textPitchAlignment, Double d28, Double d29, TextRotationAlignment textRotationAlignment, Double d34, List<Double> list6, TextTransform textTransform, List<String> list7, List<String> list8, d0 d0Var, Double d35, Double d36, Double d37, d0 d0Var2, Double d38, Double d39, Double d44, Double d45, List<Double> list9, IconTranslateAnchor iconTranslateAnchor, Double d46, d0 d0Var3, Double d47, Double d48, d0 d0Var4, Double d49, Double d54, Double d55, List<Double> list10, TextTranslateAnchor textTranslateAnchor, Double d56, Double d57, String str2, String str3, String str4, String str5, PointAnnotationGroupInteractionsState pointAnnotationGroupInteractionsState) {
        this.interactionsState = p0.n(pointAnnotationGroupInteractionsState);
        this.iconAllowOverlap = p0.n(bool);
        this.iconAnchor = p0.n(iconAnchor);
        this.iconIgnorePlacement = p0.n(bool2);
        this.iconImage = p0.n(iconImage);
        this.iconKeepUpright = p0.n(bool3);
        this.iconOffset = p0.n(list);
        this.iconOptional = p0.n(bool4);
        this.iconPadding = p0.n(d14);
        this.iconPitchAlignment = p0.n(iconPitchAlignment);
        this.iconRotate = p0.n(d15);
        this.iconRotationAlignment = p0.n(iconRotationAlignment);
        this.iconSize = p0.n(d16);
        this.iconSizeScaleRange = p0.n(list2);
        this.iconTextFit = p0.n(iconTextFit);
        this.iconTextFitPadding = p0.n(list3);
        this.symbolAvoidEdges = p0.n(bool5);
        this.symbolElevationReference = p0.n(symbolElevationReference);
        this.symbolPlacement = p0.n(symbolPlacement);
        this.symbolSortKey = p0.n(d17);
        this.symbolSpacing = p0.n(d18);
        this.symbolZElevate = p0.n(bool6);
        this.symbolZOrder = p0.n(symbolZOrder);
        this.textAllowOverlap = p0.n(bool7);
        this.textAnchor = p0.n(textAnchor);
        this.textField = p0.n(str);
        this.textFont = p0.n(list4);
        this.textIgnorePlacement = p0.n(bool8);
        this.textJustify = p0.n(textJustify);
        this.textKeepUpright = p0.n(bool9);
        this.textLetterSpacing = p0.n(d19);
        this.textLineHeight = p0.n(d24);
        this.textMaxAngle = p0.n(d25);
        this.textMaxWidth = p0.n(d26);
        this.textOffset = p0.n(list5);
        this.textOptional = p0.n(bool10);
        this.textPadding = p0.n(d27);
        this.textPitchAlignment = p0.n(textPitchAlignment);
        this.textRadialOffset = p0.n(d28);
        this.textRotate = p0.n(d29);
        this.textRotationAlignment = p0.n(textRotationAlignment);
        this.textSize = p0.n(d34);
        this.textSizeScaleRange = p0.n(list6);
        this.textTransform = p0.n(textTransform);
        this.textVariableAnchor = p0.n(list7);
        this.textWritingMode = p0.n(list8);
        this.iconColor = p0.n(d0Var);
        this.iconColorSaturation = p0.n(d35);
        this.iconEmissiveStrength = p0.n(d36);
        this.iconHaloBlur = p0.n(d37);
        this.iconHaloColor = p0.n(d0Var2);
        this.iconHaloWidth = p0.n(d38);
        this.iconImageCrossFade = p0.n(d39);
        this.iconOcclusionOpacity = p0.n(d44);
        this.iconOpacity = p0.n(d45);
        this.iconTranslate = p0.n(list9);
        this.iconTranslateAnchor = p0.n(iconTranslateAnchor);
        this.symbolZOffset = p0.n(d46);
        this.textColor = p0.n(d0Var3);
        this.textEmissiveStrength = p0.n(d47);
        this.textHaloBlur = p0.n(d48);
        this.textHaloColor = p0.n(d0Var4);
        this.textHaloWidth = p0.n(d49);
        this.textOcclusionOpacity = p0.n(d54);
        this.textOpacity = p0.n(d55);
        this.textTranslate = p0.n(list10);
        this.textTranslateAnchor = p0.n(textTranslateAnchor);
        this.maxZoom = p0.n(d56);
        this.minZoom = p0.n(d57);
        this.iconColorUseTheme = p0.n(str2);
        this.iconHaloColorUseTheme = p0.n(str3);
        this.textColorUseTheme = p0.n(str4);
        this.textHaloColorUseTheme = p0.n(str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconAllowOverlap(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(2059967750);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconAllowOverlap(getIconAllowOverlap());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass1(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconAnchor(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-679092497);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconAnchor(getIconAnchor());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40011(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconColor(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(413216865);
        x1 x1Var = n.f135158a;
        d0 d0VarM150getIconColorQN2ZGVo = m150getIconColorQN2ZGVo();
        if (d0VarM150getIconColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM150getIconColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        pointAnnotationManager.setIconColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconColorSaturation(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1559275409);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconColorSaturation(getIconColorSaturation());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40021(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconColorUseTheme(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(198503679);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconColorUseTheme(getIconColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40031(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconEmissiveStrength(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1215446196);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconEmissiveStrength(getIconEmissiveStrength());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40041(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconHaloBlur(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-650972511);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconHaloBlur(getIconHaloBlur());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40051(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconHaloColor(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(250942397);
        x1 x1Var = n.f135158a;
        d0 d0VarM151getIconHaloColorQN2ZGVo = m151getIconHaloColorQN2ZGVo();
        if (d0VarM151getIconHaloColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM151getIconHaloColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        pointAnnotationManager.setIconHaloColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40062(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconHaloColorUseTheme(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-164776869);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconHaloColorUseTheme(getIconHaloColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40071(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconHaloWidth(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(2037787322);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconHaloWidth(getIconHaloWidth());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40081(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconIgnorePlacement(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1618832529);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconIgnorePlacement(getIconIgnorePlacement());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40091(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconImage(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1286069609);
        x1 x1Var = n.f135158a;
        IconImage iconImage = getIconImage();
        if (iconImage != null) {
            Bitmap bitmap = iconImage.getBitmap();
            if (bitmap != null) {
                pointAnnotationManager.setIconImageBitmap(bitmap);
            }
            String imageId = iconImage.getImageId();
            if (imageId != null) {
                pointAnnotationManager.setIconImage(imageId);
            }
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40102(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconImageCrossFade(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-912226461);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconImageCrossFade(getIconImageCrossFade());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40111(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconKeepUpright(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1959118024);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconKeepUpright(getIconKeepUpright());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40121(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconOcclusionOpacity(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-474007546);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconOcclusionOpacity(getIconOcclusionOpacity());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40131(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconOffset(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-995208495);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconOffset(getIconOffset());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40141(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconOpacity(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-43603783);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconOpacity(getIconOpacity());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40151(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconOptional(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1531173028);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconOptional(getIconOptional());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40161(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconPadding(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2047527053);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconPadding(getIconPadding());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40171(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconPitchAlignment(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1300713185);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconPitchAlignment(getIconPitchAlignment());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40181(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconRotate(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(795822857);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconRotate(getIconRotate());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40191(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconRotationAlignment(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1953501695);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconRotationAlignment(getIconRotationAlignment());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40201(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconSize(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2061139165);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconSize(getIconSize());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40211(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconSizeScaleRange(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1769174640);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconSizeScaleRange(getIconSizeScaleRange());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40221(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconTextFit(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1687479488);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconTextFit(getIconTextFit());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40231(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconTextFitPadding(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(2099948759);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconTextFitPadding(getIconTextFitPadding());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40241(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconTranslate(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-798952234);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconTranslate(getIconTranslate());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40251(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateIconTranslateAnchor(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1529871905);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setIconTranslateAnchor(getIconTranslateAnchor());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40261(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateMaxZoom(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-148612652);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setMaxZoom(getMaxZoom());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40271(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateMinZoom(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(612157350);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setMinZoom(getMinZoom());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40281(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateSymbolAvoidEdges(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2031768188);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setSymbolAvoidEdges(getSymbolAvoidEdges());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40291(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateSymbolElevationReference(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(156450199);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setSymbolElevationReference(getSymbolElevationReference());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40301(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateSymbolPlacement(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1472916802);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setSymbolPlacement(getSymbolPlacement());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40311(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateSymbolSortKey(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(374865154);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setSymbolSortKey(getSymbolSortKey());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40321(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateSymbolSpacing(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1374687520);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setSymbolSpacing(getSymbolSpacing());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40331(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateSymbolZElevate(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(370901605);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setSymbolZElevate(getSymbolZElevate());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40341(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateSymbolZOffset(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1670738102);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setSymbolZOffset(getSymbolZOffset());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40351(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateSymbolZOrder(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1135294383);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setSymbolZOrder(getSymbolZOrder());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40361(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextAllowOverlap(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-795478830);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextAllowOverlap(getTextAllowOverlap());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40371(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextAnchor(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1997275205);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextAnchor(getTextAnchor());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40381(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextColor(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(-876231147);
        x1 x1Var = n.f135158a;
        d0 d0VarM152getTextColorQN2ZGVo = m152getTextColorQN2ZGVo();
        if (d0VarM152getTextColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM152getTextColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        pointAnnotationManager.setTextColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40392(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextColorUseTheme(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1873972915);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextColorUseTheme(getTextColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40401(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextEmissiveStrength(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(873616664);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextEmissiveStrength(getTextEmissiveStrength());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40411(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextField(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1703809954);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextField(getTextField());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40421(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextFont(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1583017569);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextFont(getTextFont());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40431(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextHaloBlur(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-409202579);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextHaloBlur(getTextHaloBlur());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40441(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextHaloColor(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(-844124303);
        x1 x1Var = n.f135158a;
        d0 d0VarM153getTextHaloColorQN2ZGVo = m153getTextHaloColorQN2ZGVo();
        if (d0VarM153getTextHaloColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM153getTextHaloColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        pointAnnotationManager.setTextHaloColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40452(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextHaloColorUseTheme(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(171662351);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextHaloColorUseTheme(getTextHaloColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40461(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextHaloWidth(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(942720622);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextHaloWidth(getTextHaloWidth());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40471(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextIgnorePlacement(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1132032325);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextIgnorePlacement(getTextIgnorePlacement());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40481(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextJustify(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-911348088);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextJustify(getTextJustify());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40491(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextKeepUpright(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1867006844);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextKeepUpright(getTextKeepUpright());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40501(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextLetterSpacing(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(588634491);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextLetterSpacing(getTextLetterSpacing());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40511(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextLineHeight(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1966935819);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextLineHeight(getTextLineHeight());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40521(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextMaxAngle(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-497198367);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextMaxAngle(getTextMaxAngle());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40531(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextMaxWidth(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1534213454);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextMaxWidth(getTextMaxWidth());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40541(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextOcclusionOpacity(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1615055314);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextOcclusionOpacity(getTextOcclusionOpacity());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40551(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextOffset(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1981576093);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextOffset(getTextOffset());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40561(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextOpacity(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(2042405229);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextOpacity(getTextOpacity());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40571(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextOptional(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1772942960);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextOptional(getTextOptional());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40581(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextPadding(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(38481959);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextPadding(getTextPadding());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40591(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextPitchAlignment(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1700651949);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextPitchAlignment(getTextPitchAlignment());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40601(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextRadialOffset(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2023913346);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextRadialOffset(getTextRadialOffset());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40611(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextRotate(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-522359851);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextRotate(getTextRotate());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40621(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextRotationAlignment(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2005026381);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextRotationAlignment(getTextRotationAlignment());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40631(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextSize(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-855808273);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextSize(getTextSize());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40641(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextSizeScaleRange(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1369235876);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextSizeScaleRange(getTextSizeScaleRange());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40651(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextTransform(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1032391636);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextTransform(getTextTransform());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40661(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextTranslate(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1894018934);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextTranslate(getTextTranslate());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40671(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextTranslateAnchor(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1043071701);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextTranslateAnchor(getTextTranslateAnchor());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40681(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextVariableAnchor(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1040696929);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextVariableAnchor(getTextVariableAnchor());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40691(pointAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateTextWritingMode(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1263076007);
        x1 x1Var = n.f135158a;
        pointAnnotationManager.setTextWritingMode(getTextWritingMode());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40701(pointAnnotationManager, i14);
    }

    @MapboxExperimental
    public static /* synthetic */ void getIconColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getIconHaloColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getIconSizeScaleRange$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSymbolElevationReference$annotations() {
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

    @MapboxExperimental
    public static /* synthetic */ void getTextSizeScaleRange$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        pointAnnotationManager.getClass();
        o0 o0VarE = mVar.E(520233450);
        x1 x1Var = n.f135158a;
        int i15 = (i14 & 112) | 8;
        UpdateIconAllowOverlap(pointAnnotationManager, o0VarE, i15);
        UpdateIconAnchor(pointAnnotationManager, o0VarE, i15);
        UpdateIconIgnorePlacement(pointAnnotationManager, o0VarE, i15);
        UpdateIconImage(pointAnnotationManager, o0VarE, i15);
        UpdateIconKeepUpright(pointAnnotationManager, o0VarE, i15);
        UpdateIconOffset(pointAnnotationManager, o0VarE, i15);
        UpdateIconOptional(pointAnnotationManager, o0VarE, i15);
        UpdateIconPadding(pointAnnotationManager, o0VarE, i15);
        UpdateIconPitchAlignment(pointAnnotationManager, o0VarE, i15);
        UpdateIconRotate(pointAnnotationManager, o0VarE, i15);
        UpdateIconRotationAlignment(pointAnnotationManager, o0VarE, i15);
        UpdateIconSize(pointAnnotationManager, o0VarE, i15);
        UpdateIconSizeScaleRange(pointAnnotationManager, o0VarE, i15);
        UpdateIconTextFit(pointAnnotationManager, o0VarE, i15);
        UpdateIconTextFitPadding(pointAnnotationManager, o0VarE, i15);
        UpdateSymbolAvoidEdges(pointAnnotationManager, o0VarE, i15);
        UpdateSymbolElevationReference(pointAnnotationManager, o0VarE, i15);
        UpdateSymbolPlacement(pointAnnotationManager, o0VarE, i15);
        UpdateSymbolSortKey(pointAnnotationManager, o0VarE, i15);
        UpdateSymbolSpacing(pointAnnotationManager, o0VarE, i15);
        UpdateSymbolZElevate(pointAnnotationManager, o0VarE, i15);
        UpdateSymbolZOrder(pointAnnotationManager, o0VarE, i15);
        UpdateTextAllowOverlap(pointAnnotationManager, o0VarE, i15);
        UpdateTextAnchor(pointAnnotationManager, o0VarE, i15);
        UpdateTextField(pointAnnotationManager, o0VarE, i15);
        UpdateTextFont(pointAnnotationManager, o0VarE, i15);
        UpdateTextIgnorePlacement(pointAnnotationManager, o0VarE, i15);
        UpdateTextJustify(pointAnnotationManager, o0VarE, i15);
        UpdateTextKeepUpright(pointAnnotationManager, o0VarE, i15);
        UpdateTextLetterSpacing(pointAnnotationManager, o0VarE, i15);
        UpdateTextLineHeight(pointAnnotationManager, o0VarE, i15);
        UpdateTextMaxAngle(pointAnnotationManager, o0VarE, i15);
        UpdateTextMaxWidth(pointAnnotationManager, o0VarE, i15);
        UpdateTextOffset(pointAnnotationManager, o0VarE, i15);
        UpdateTextOptional(pointAnnotationManager, o0VarE, i15);
        UpdateTextPadding(pointAnnotationManager, o0VarE, i15);
        UpdateTextPitchAlignment(pointAnnotationManager, o0VarE, i15);
        UpdateTextRadialOffset(pointAnnotationManager, o0VarE, i15);
        UpdateTextRotate(pointAnnotationManager, o0VarE, i15);
        UpdateTextRotationAlignment(pointAnnotationManager, o0VarE, i15);
        UpdateTextSize(pointAnnotationManager, o0VarE, i15);
        UpdateTextSizeScaleRange(pointAnnotationManager, o0VarE, i15);
        UpdateTextTransform(pointAnnotationManager, o0VarE, i15);
        UpdateTextVariableAnchor(pointAnnotationManager, o0VarE, i15);
        UpdateTextWritingMode(pointAnnotationManager, o0VarE, i15);
        UpdateIconColor(pointAnnotationManager, o0VarE, i15);
        UpdateIconColorSaturation(pointAnnotationManager, o0VarE, i15);
        UpdateIconEmissiveStrength(pointAnnotationManager, o0VarE, i15);
        UpdateIconHaloBlur(pointAnnotationManager, o0VarE, i15);
        UpdateIconHaloColor(pointAnnotationManager, o0VarE, i15);
        UpdateIconHaloWidth(pointAnnotationManager, o0VarE, i15);
        UpdateIconImageCrossFade(pointAnnotationManager, o0VarE, i15);
        UpdateIconOcclusionOpacity(pointAnnotationManager, o0VarE, i15);
        UpdateIconOpacity(pointAnnotationManager, o0VarE, i15);
        UpdateIconTranslate(pointAnnotationManager, o0VarE, i15);
        UpdateIconTranslateAnchor(pointAnnotationManager, o0VarE, i15);
        UpdateSymbolZOffset(pointAnnotationManager, o0VarE, i15);
        UpdateTextColor(pointAnnotationManager, o0VarE, i15);
        UpdateTextEmissiveStrength(pointAnnotationManager, o0VarE, i15);
        UpdateTextHaloBlur(pointAnnotationManager, o0VarE, i15);
        UpdateTextHaloColor(pointAnnotationManager, o0VarE, i15);
        UpdateTextHaloWidth(pointAnnotationManager, o0VarE, i15);
        UpdateTextOcclusionOpacity(pointAnnotationManager, o0VarE, i15);
        UpdateTextOpacity(pointAnnotationManager, o0VarE, i15);
        UpdateTextTranslate(pointAnnotationManager, o0VarE, i15);
        UpdateTextTranslateAnchor(pointAnnotationManager, o0VarE, i15);
        UpdateMaxZoom(pointAnnotationManager, o0VarE, i15);
        UpdateMinZoom(pointAnnotationManager, o0VarE, i15);
        UpdateIconColorUseTheme(pointAnnotationManager, o0VarE, i15);
        UpdateIconHaloColorUseTheme(pointAnnotationManager, o0VarE, i15);
        UpdateTextColorUseTheme(pointAnnotationManager, o0VarE, i15);
        UpdateTextHaloColorUseTheme(pointAnnotationManager, o0VarE, i15);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new PointAnnotationGroupState$UpdateProperties$1(this, pointAnnotationManager, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getIconAllowOverlap() {
        return (Boolean) this.iconAllowOverlap.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IconAnchor getIconAnchor() {
        return (IconAnchor) this.iconAnchor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getIconColor-QN2ZGVo, reason: not valid java name */
    public final d0 m150getIconColorQN2ZGVo() {
        return (d0) this.iconColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconColorSaturation() {
        return (Double) this.iconColorSaturation.getF182175a();
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
    public final d0 m151getIconHaloColorQN2ZGVo() {
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
    public final Boolean getIconIgnorePlacement() {
        return (Boolean) this.iconIgnorePlacement.getF182175a();
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
    public final Boolean getIconKeepUpright() {
        return (Boolean) this.iconKeepUpright.getF182175a();
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
    public final Boolean getIconOptional() {
        return (Boolean) this.iconOptional.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconPadding() {
        return (Double) this.iconPadding.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IconPitchAlignment getIconPitchAlignment() {
        return (IconPitchAlignment) this.iconPitchAlignment.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconRotate() {
        return (Double) this.iconRotate.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IconRotationAlignment getIconRotationAlignment() {
        return (IconRotationAlignment) this.iconRotationAlignment.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getIconSize() {
        return (Double) this.iconSize.getF182175a();
    }

    public final List<Double> getIconSizeScaleRange() {
        return (List) this.iconSizeScaleRange.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IconTextFit getIconTextFit() {
        return (IconTextFit) this.iconTextFit.getF182175a();
    }

    public final List<Double> getIconTextFitPadding() {
        return (List) this.iconTextFitPadding.getF182175a();
    }

    public final List<Double> getIconTranslate() {
        return (List) this.iconTranslate.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IconTranslateAnchor getIconTranslateAnchor() {
        return (IconTranslateAnchor) this.iconTranslateAnchor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PointAnnotationGroupInteractionsState getInteractionsState() {
        return (PointAnnotationGroupInteractionsState) this.interactionsState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getMaxZoom() {
        return (Double) this.maxZoom.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getMinZoom() {
        return (Double) this.minZoom.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getSymbolAvoidEdges() {
        return (Boolean) this.symbolAvoidEdges.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SymbolElevationReference getSymbolElevationReference() {
        return (SymbolElevationReference) this.symbolElevationReference.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SymbolPlacement getSymbolPlacement() {
        return (SymbolPlacement) this.symbolPlacement.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getSymbolSortKey() {
        return (Double) this.symbolSortKey.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getSymbolSpacing() {
        return (Double) this.symbolSpacing.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getSymbolZElevate() {
        return (Boolean) this.symbolZElevate.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getSymbolZOffset() {
        return (Double) this.symbolZOffset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SymbolZOrder getSymbolZOrder() {
        return (SymbolZOrder) this.symbolZOrder.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getTextAllowOverlap() {
        return (Boolean) this.textAllowOverlap.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextAnchor getTextAnchor() {
        return (TextAnchor) this.textAnchor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final d0 m152getTextColorQN2ZGVo() {
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

    public final List<String> getTextFont() {
        return (List) this.textFont.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextHaloBlur() {
        return (Double) this.textHaloBlur.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getTextHaloColor-QN2ZGVo, reason: not valid java name */
    public final d0 m153getTextHaloColorQN2ZGVo() {
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
    public final Boolean getTextIgnorePlacement() {
        return (Boolean) this.textIgnorePlacement.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextJustify getTextJustify() {
        return (TextJustify) this.textJustify.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getTextKeepUpright() {
        return (Boolean) this.textKeepUpright.getF182175a();
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
    public final Double getTextMaxAngle() {
        return (Double) this.textMaxAngle.getF182175a();
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
    public final Boolean getTextOptional() {
        return (Boolean) this.textOptional.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextPadding() {
        return (Double) this.textPadding.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextPitchAlignment getTextPitchAlignment() {
        return (TextPitchAlignment) this.textPitchAlignment.getF182175a();
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
    public final TextRotationAlignment getTextRotationAlignment() {
        return (TextRotationAlignment) this.textRotationAlignment.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getTextSize() {
        return (Double) this.textSize.getF182175a();
    }

    public final List<Double> getTextSizeScaleRange() {
        return (List) this.textSizeScaleRange.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextTransform getTextTransform() {
        return (TextTransform) this.textTransform.getF182175a();
    }

    public final List<Double> getTextTranslate() {
        return (List) this.textTranslate.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextTranslateAnchor getTextTranslateAnchor() {
        return (TextTranslateAnchor) this.textTranslateAnchor.getF182175a();
    }

    public final List<String> getTextVariableAnchor() {
        return (List) this.textVariableAnchor.getF182175a();
    }

    public final List<String> getTextWritingMode() {
        return (List) this.textWritingMode.getF182175a();
    }

    public final void setIconAllowOverlap(Boolean bool) {
        this.iconAllowOverlap.setValue(bool);
    }

    public final void setIconAnchor(IconAnchor iconAnchor) {
        this.iconAnchor.setValue(iconAnchor);
    }

    /* JADX INFO: renamed from: setIconColor-Y2TPw74, reason: not valid java name */
    public final void m154setIconColorY2TPw74(d0 d0Var) {
        this.iconColor.setValue(d0Var);
    }

    public final void setIconColorSaturation(Double d14) {
        this.iconColorSaturation.setValue(d14);
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
    public final void m155setIconHaloColorY2TPw74(d0 d0Var) {
        this.iconHaloColor.setValue(d0Var);
    }

    public final void setIconHaloColorUseTheme(String str) {
        this.iconHaloColorUseTheme.setValue(str);
    }

    public final void setIconHaloWidth(Double d14) {
        this.iconHaloWidth.setValue(d14);
    }

    public final void setIconIgnorePlacement(Boolean bool) {
        this.iconIgnorePlacement.setValue(bool);
    }

    public final void setIconImage(IconImage iconImage) {
        this.iconImage.setValue(iconImage);
    }

    public final void setIconImageCrossFade(Double d14) {
        this.iconImageCrossFade.setValue(d14);
    }

    public final void setIconKeepUpright(Boolean bool) {
        this.iconKeepUpright.setValue(bool);
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

    public final void setIconOptional(Boolean bool) {
        this.iconOptional.setValue(bool);
    }

    public final void setIconPadding(Double d14) {
        this.iconPadding.setValue(d14);
    }

    public final void setIconPitchAlignment(IconPitchAlignment iconPitchAlignment) {
        this.iconPitchAlignment.setValue(iconPitchAlignment);
    }

    public final void setIconRotate(Double d14) {
        this.iconRotate.setValue(d14);
    }

    public final void setIconRotationAlignment(IconRotationAlignment iconRotationAlignment) {
        this.iconRotationAlignment.setValue(iconRotationAlignment);
    }

    public final void setIconSize(Double d14) {
        this.iconSize.setValue(d14);
    }

    public final void setIconSizeScaleRange(List<Double> list) {
        this.iconSizeScaleRange.setValue(list);
    }

    public final void setIconTextFit(IconTextFit iconTextFit) {
        this.iconTextFit.setValue(iconTextFit);
    }

    public final void setIconTextFitPadding(List<Double> list) {
        this.iconTextFitPadding.setValue(list);
    }

    public final void setIconTranslate(List<Double> list) {
        this.iconTranslate.setValue(list);
    }

    public final void setIconTranslateAnchor(IconTranslateAnchor iconTranslateAnchor) {
        this.iconTranslateAnchor.setValue(iconTranslateAnchor);
    }

    public final void setInteractionsState(PointAnnotationGroupInteractionsState pointAnnotationGroupInteractionsState) {
        pointAnnotationGroupInteractionsState.getClass();
        this.interactionsState.setValue(pointAnnotationGroupInteractionsState);
    }

    public final void setMaxZoom(Double d14) {
        this.maxZoom.setValue(d14);
    }

    public final void setMinZoom(Double d14) {
        this.minZoom.setValue(d14);
    }

    public final void setSymbolAvoidEdges(Boolean bool) {
        this.symbolAvoidEdges.setValue(bool);
    }

    public final void setSymbolElevationReference(SymbolElevationReference symbolElevationReference) {
        this.symbolElevationReference.setValue(symbolElevationReference);
    }

    public final void setSymbolPlacement(SymbolPlacement symbolPlacement) {
        this.symbolPlacement.setValue(symbolPlacement);
    }

    public final void setSymbolSortKey(Double d14) {
        this.symbolSortKey.setValue(d14);
    }

    public final void setSymbolSpacing(Double d14) {
        this.symbolSpacing.setValue(d14);
    }

    public final void setSymbolZElevate(Boolean bool) {
        this.symbolZElevate.setValue(bool);
    }

    public final void setSymbolZOffset(Double d14) {
        this.symbolZOffset.setValue(d14);
    }

    public final void setSymbolZOrder(SymbolZOrder symbolZOrder) {
        this.symbolZOrder.setValue(symbolZOrder);
    }

    public final void setTextAllowOverlap(Boolean bool) {
        this.textAllowOverlap.setValue(bool);
    }

    public final void setTextAnchor(TextAnchor textAnchor) {
        this.textAnchor.setValue(textAnchor);
    }

    /* JADX INFO: renamed from: setTextColor-Y2TPw74, reason: not valid java name */
    public final void m156setTextColorY2TPw74(d0 d0Var) {
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

    public final void setTextFont(List<String> list) {
        this.textFont.setValue(list);
    }

    public final void setTextHaloBlur(Double d14) {
        this.textHaloBlur.setValue(d14);
    }

    /* JADX INFO: renamed from: setTextHaloColor-Y2TPw74, reason: not valid java name */
    public final void m157setTextHaloColorY2TPw74(d0 d0Var) {
        this.textHaloColor.setValue(d0Var);
    }

    public final void setTextHaloColorUseTheme(String str) {
        this.textHaloColorUseTheme.setValue(str);
    }

    public final void setTextHaloWidth(Double d14) {
        this.textHaloWidth.setValue(d14);
    }

    public final void setTextIgnorePlacement(Boolean bool) {
        this.textIgnorePlacement.setValue(bool);
    }

    public final void setTextJustify(TextJustify textJustify) {
        this.textJustify.setValue(textJustify);
    }

    public final void setTextKeepUpright(Boolean bool) {
        this.textKeepUpright.setValue(bool);
    }

    public final void setTextLetterSpacing(Double d14) {
        this.textLetterSpacing.setValue(d14);
    }

    public final void setTextLineHeight(Double d14) {
        this.textLineHeight.setValue(d14);
    }

    public final void setTextMaxAngle(Double d14) {
        this.textMaxAngle.setValue(d14);
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

    public final void setTextOptional(Boolean bool) {
        this.textOptional.setValue(bool);
    }

    public final void setTextPadding(Double d14) {
        this.textPadding.setValue(d14);
    }

    public final void setTextPitchAlignment(TextPitchAlignment textPitchAlignment) {
        this.textPitchAlignment.setValue(textPitchAlignment);
    }

    public final void setTextRadialOffset(Double d14) {
        this.textRadialOffset.setValue(d14);
    }

    public final void setTextRotate(Double d14) {
        this.textRotate.setValue(d14);
    }

    public final void setTextRotationAlignment(TextRotationAlignment textRotationAlignment) {
        this.textRotationAlignment.setValue(textRotationAlignment);
    }

    public final void setTextSize(Double d14) {
        this.textSize.setValue(d14);
    }

    public final void setTextSizeScaleRange(List<Double> list) {
        this.textSizeScaleRange.setValue(list);
    }

    public final void setTextTransform(TextTransform textTransform) {
        this.textTransform.setValue(textTransform);
    }

    public final void setTextTranslate(List<Double> list) {
        this.textTranslate.setValue(list);
    }

    public final void setTextTranslateAnchor(TextTranslateAnchor textTranslateAnchor) {
        this.textTranslateAnchor.setValue(textTranslateAnchor);
    }

    public final void setTextVariableAnchor(List<String> list) {
        this.textVariableAnchor.setValue(list);
    }

    public final void setTextWritingMode(List<String> list) {
        this.textWritingMode.setValue(list);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconAllowOverlap$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconAllowOverlap(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconAnchor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40011 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40011(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconAnchor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconColor$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconColorSaturation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40021 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40021(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconColorSaturation(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40031 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40031(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconEmissiveStrength$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40041 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40041(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconEmissiveStrength(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconHaloBlur$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40051 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40051(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconHaloBlur(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconHaloColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40062 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40062(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconHaloColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconHaloColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40071 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40071(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconHaloColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconHaloWidth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40081 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40081(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconHaloWidth(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconIgnorePlacement$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40091 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40091(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconIgnorePlacement(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconImage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40102 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40102(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconImage(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconImageCrossFade$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40111 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40111(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconImageCrossFade(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconKeepUpright$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40121 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40121(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconKeepUpright(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconOcclusionOpacity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40131 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40131(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconOcclusionOpacity(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconOffset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40141 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40141(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconOffset(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconOpacity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40151 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40151(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconOpacity(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconOptional$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40161 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40161(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconOptional(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconPadding$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40171 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40171(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconPadding(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconPitchAlignment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40181 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40181(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconPitchAlignment(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconRotate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40191 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40191(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconRotate(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconRotationAlignment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40201 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40201(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconRotationAlignment(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconSize$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40211 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40211(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconSize(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconSizeScaleRange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40221 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40221(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconSizeScaleRange(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconTextFit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40231 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40231(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconTextFit(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconTextFitPadding$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40241 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40241(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconTextFitPadding(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconTranslate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40251 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40251(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconTranslate(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateIconTranslateAnchor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40261 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40261(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateIconTranslateAnchor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateMaxZoom$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40271 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40271(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateMaxZoom(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateMinZoom$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40281 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40281(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateMinZoom(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateSymbolAvoidEdges$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40291 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40291(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateSymbolAvoidEdges(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateSymbolElevationReference$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40301 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40301(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateSymbolElevationReference(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateSymbolPlacement$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40311 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40311(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateSymbolPlacement(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateSymbolSortKey$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40321 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40321(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateSymbolSortKey(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateSymbolSpacing$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40331 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40331(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateSymbolSpacing(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateSymbolZElevate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40341 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40341(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateSymbolZElevate(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateSymbolZOffset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40351 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40351(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateSymbolZOffset(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateSymbolZOrder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40361 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40361(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateSymbolZOrder(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextAllowOverlap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40371 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40371(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextAllowOverlap(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextAnchor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40381 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40381(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextAnchor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40392 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40392(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40401 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40401(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextEmissiveStrength$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40411 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40411(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextEmissiveStrength(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextField$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40421 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40421(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextField(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextFont$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40431 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40431(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextFont(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextHaloBlur$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40441 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40441(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextHaloBlur(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextHaloColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40452 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40452(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextHaloColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextHaloColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40461 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40461(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextHaloColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextHaloWidth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40471 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40471(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextHaloWidth(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextIgnorePlacement$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40481 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40481(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextIgnorePlacement(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextJustify$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40491 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40491(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextJustify(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextKeepUpright$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40501 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40501(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextKeepUpright(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextLetterSpacing$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40511 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40511(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextLetterSpacing(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextLineHeight$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40521 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40521(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextLineHeight(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextMaxAngle$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40531 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40531(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextMaxAngle(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextMaxWidth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40541 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40541(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextMaxWidth(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextOcclusionOpacity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40551 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40551(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextOcclusionOpacity(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextOffset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40561 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40561(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextOffset(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextOpacity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40571 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40571(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextOpacity(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextOptional$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40581 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40581(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextOptional(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextPadding$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40591 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40591(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextPadding(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextPitchAlignment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40601 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40601(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextPitchAlignment(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextRadialOffset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40611 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40611(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextRadialOffset(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextRotate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40621 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40621(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextRotate(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextRotationAlignment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40631 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40631(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextRotationAlignment(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextSize$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40641 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40641(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextSize(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextSizeScaleRange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40651 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40651(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextSizeScaleRange(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextTransform$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40661 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40661(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextTransform(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextTranslate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40671 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40671(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextTranslate(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextTranslateAnchor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40681 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40681(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextTranslateAnchor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextVariableAnchor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40691 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40691(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextVariableAnchor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupState$UpdateTextWritingMode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40701 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PointAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40701(PointAnnotationManager pointAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = pointAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupState.this.UpdateTextWritingMode(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    public PointAnnotationGroupState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PointAnnotationGroupInteractionsState());
    }
}
