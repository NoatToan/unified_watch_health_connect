package com.mapbox.maps.plugin.annotation.generated;

import android.graphics.Bitmap;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
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
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationManagerImpl;
import com.mapbox.maps.plugin.annotation.ClusterAnnotationManager;
import com.mapbox.maps.plugin.annotation.OnClusterClickListener;
import com.mapbox.maps.plugin.annotation.OnClusterLongClickListener;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import d53.u;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 Õ\u000222\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00012\u00020\n:\u0002Õ\u0002B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0017\u0010Í\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030d2\b\u0010Î\u0002\u001a\u00030Ï\u0002J\u0016\u0010Í\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030d2\u0007\u0010Ð\u0002\u001a\u000201J\t\u0010Ñ\u0002\u001a\u000201H\u0016J\u0013\u0010Ò\u0002\u001a\u00030Ó\u00022\u0007\u0010Ô\u0002\u001a\u000201H\u0014R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010%8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00102\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R.\u00107\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b8\u00109\u001a\u0004\b:\u00104\"\u0004\b;\u00106R(\u0010<\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R(\u0010?\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010.\"\u0004\bA\u00100R*\u0010B\u001a\u0004\u0018\u00010%2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010%8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010(\"\u0004\bD\u0010*R(\u0010E\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u00104\"\u0004\bG\u00106R.\u0010H\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bI\u00109\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R(\u0010L\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010.\"\u0004\bN\u00100R(\u0010O\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010\u001c\"\u0004\bQ\u0010\u001eR(\u0010R\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u00104\"\u0004\bT\u00106R(\u0010V\u001a\u0004\u0018\u00010U2\b\u0010\u0018\u001a\u0004\u0018\u00010U@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010[\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010.\"\u0004\b]\u00100R(\u0010^\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010\u001c\"\u0004\b`\u0010\u001eR(\u0010a\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010.\"\u0004\bc\u00100R4\u0010e\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010\u0014\"\u0004\bg\u0010hR(\u0010i\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010.\"\u0004\bk\u00100R(\u0010l\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010\u001c\"\u0004\bn\u0010\u001eR(\u0010o\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010.\"\u0004\bq\u00100R(\u0010s\u001a\u0004\u0018\u00010r2\b\u0010\u0018\u001a\u0004\u0018\u00010r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR(\u0010x\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010.\"\u0004\bz\u00100R)\u0010|\u001a\u0004\u0018\u00010{2\b\u0010\u0018\u001a\u0004\u0018\u00010{8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R+\u0010\u0081\u0001\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010.\"\u0005\b\u0083\u0001\u00100R>\u0010\u0084\u0001\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d8F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\b\u0085\u0001\u00109\u001a\u0005\b\u0086\u0001\u0010\u0014\"\u0005\b\u0087\u0001\u0010hR/\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\t\u0010\u0018\u001a\u0005\u0018\u00010\u0088\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R7\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008f\u0001\u0010\u0014\"\u0005\b\u0090\u0001\u0010hR7\u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0092\u0001\u0010\u0014\"\u0005\b\u0093\u0001\u0010hR/\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00012\t\u0010\u0018\u001a\u0005\u0018\u00010\u0094\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R/\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00012\t\u0010\u0018\u001a\u0005\u0018\u00010\u009a\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R+\u0010 \u0001\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¡\u0001\u0010.\"\u0005\b¢\u0001\u00100R+\u0010£\u0001\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¤\u0001\u0010.\"\u0005\b¥\u0001\u00100R+\u0010¦\u0001\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b§\u0001\u00104\"\u0005\b¨\u0001\u00106R+\u0010©\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bª\u0001\u0010\u001c\"\u0005\b«\u0001\u0010\u001eR6\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00012\t\u0010\u0018\u001a\u0005\u0018\u00010¬\u00018F@FX\u0087\u000e¢\u0006\u0017\u0012\u0005\b®\u0001\u00109\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R/\u0010´\u0001\u001a\u0005\u0018\u00010³\u00012\t\u0010\u0018\u001a\u0005\u0018\u00010³\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R+\u0010¹\u0001\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bº\u0001\u0010.\"\u0005\b»\u0001\u00100R+\u0010¼\u0001\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b½\u0001\u0010.\"\u0005\b¾\u0001\u00100R+\u0010¿\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÀ\u0001\u0010\u001c\"\u0005\bÁ\u0001\u0010\u001eR2\u0010Â\u0001\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\bÃ\u0001\u00109\u001a\u0005\bÄ\u0001\u0010.\"\u0005\bÅ\u0001\u00100R/\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00012\t\u0010\u0018\u001a\u0005\u0018\u00010Æ\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R+\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÍ\u0001\u0010\u001c\"\u0005\bÎ\u0001\u0010\u001eR/\u0010Ð\u0001\u001a\u0005\u0018\u00010Ï\u00012\t\u0010\u0018\u001a\u0005\u0018\u00010Ï\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R-\u0010Õ\u0001\u001a\u0004\u0018\u00010%2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010%8G@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÖ\u0001\u0010(\"\u0005\b×\u0001\u0010*R+\u0010Ø\u0001\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÙ\u0001\u00104\"\u0005\bÚ\u0001\u00106R2\u0010Û\u0001\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\bÜ\u0001\u00109\u001a\u0005\bÝ\u0001\u00104\"\u0005\bÞ\u0001\u00106R+\u0010ß\u0001\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bà\u0001\u0010.\"\u0005\bá\u0001\u00100R+\u0010â\u0001\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bã\u0001\u00104\"\u0005\bä\u0001\u00106R7\u0010å\u0001\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bæ\u0001\u0010\u0014\"\u0005\bç\u0001\u0010hR+\u0010è\u0001\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bé\u0001\u0010.\"\u0005\bê\u0001\u00100R-\u0010ë\u0001\u001a\u0004\u0018\u00010%2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010%8G@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bì\u0001\u0010(\"\u0005\bí\u0001\u0010*R+\u0010î\u0001\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bï\u0001\u00104\"\u0005\bð\u0001\u00106R2\u0010ñ\u0001\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\bò\u0001\u00109\u001a\u0005\bó\u0001\u00104\"\u0005\bô\u0001\u00106R+\u0010õ\u0001\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bö\u0001\u0010.\"\u0005\b÷\u0001\u00100R+\u0010ø\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bù\u0001\u0010\u001c\"\u0005\bú\u0001\u0010\u001eR/\u0010ü\u0001\u001a\u0005\u0018\u00010û\u00012\t\u0010\u0018\u001a\u0005\u0018\u00010û\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R+\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0002\u0010\u001c\"\u0005\b\u0083\u0002\u0010\u001eR+\u0010\u0084\u0002\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0085\u0002\u0010.\"\u0005\b\u0086\u0002\u00100R+\u0010\u0087\u0002\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0088\u0002\u0010.\"\u0005\b\u0089\u0002\u00100R+\u0010\u008a\u0002\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0002\u0010.\"\u0005\b\u008c\u0002\u00100R+\u0010\u008d\u0002\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008e\u0002\u0010.\"\u0005\b\u008f\u0002\u00100R+\u0010\u0090\u0002\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0091\u0002\u0010.\"\u0005\b\u0092\u0002\u00100R7\u0010\u0093\u0002\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0094\u0002\u0010\u0014\"\u0005\b\u0095\u0002\u0010hR+\u0010\u0096\u0002\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0097\u0002\u0010.\"\u0005\b\u0098\u0002\u00100R+\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009a\u0002\u0010\u001c\"\u0005\b\u009b\u0002\u0010\u001eR+\u0010\u009c\u0002\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009d\u0002\u0010.\"\u0005\b\u009e\u0002\u00100R/\u0010 \u0002\u001a\u0005\u0018\u00010\u009f\u00022\t\u0010\u0018\u001a\u0005\u0018\u00010\u009f\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0006\b£\u0002\u0010¤\u0002R+\u0010¥\u0002\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¦\u0002\u0010.\"\u0005\b§\u0002\u00100R+\u0010¨\u0002\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b©\u0002\u0010.\"\u0005\bª\u0002\u00100R/\u0010¬\u0002\u001a\u0005\u0018\u00010«\u00022\t\u0010\u0018\u001a\u0005\u0018\u00010«\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u00ad\u0002\u0010®\u0002\"\u0006\b¯\u0002\u0010°\u0002R+\u0010±\u0002\u001a\u0004\u0018\u00010+2\b\u0010\u0018\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b²\u0002\u0010.\"\u0005\b³\u0002\u00100R>\u0010´\u0002\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d8F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\bµ\u0002\u00109\u001a\u0005\b¶\u0002\u0010\u0014\"\u0005\b·\u0002\u0010hR/\u0010¹\u0002\u001a\u0005\u0018\u00010¸\u00022\t\u0010\u0018\u001a\u0005\u0018\u00010¸\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bº\u0002\u0010»\u0002\"\u0006\b¼\u0002\u0010½\u0002R7\u0010¾\u0002\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¿\u0002\u0010\u0014\"\u0005\bÀ\u0002\u0010hR/\u0010Â\u0002\u001a\u0005\u0018\u00010Á\u00022\t\u0010\u0018\u001a\u0005\u0018\u00010Á\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÃ\u0002\u0010Ä\u0002\"\u0006\bÅ\u0002\u0010Æ\u0002R7\u0010Ç\u0002\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÈ\u0002\u0010\u0014\"\u0005\bÉ\u0002\u0010hR7\u0010Ê\u0002\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bË\u0002\u0010\u0014\"\u0005\bÌ\u0002\u0010h¨\u0006Ö\u0002"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationManager;", "Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl;", "Lcom/mapbox/geojson/Point;", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotation;", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationOptions;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationDragListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationClickListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationLongClickListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationInteractionListener;", "Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "Lcom/mapbox/maps/plugin/annotation/ClusterAnnotationManager;", "delegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "annotationConfig", "Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;)V", "clusterClickListeners", "", "Lcom/mapbox/maps/plugin/annotation/OnClusterClickListener;", "getClusterClickListeners", "()Ljava/util/List;", "clusterLongClickListeners", "Lcom/mapbox/maps/plugin/annotation/OnClusterLongClickListener;", "getClusterLongClickListeners", "value", "", "iconAllowOverlap", "getIconAllowOverlap", "()Ljava/lang/Boolean;", "setIconAllowOverlap", "(Ljava/lang/Boolean;)V", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "iconAnchor", "getIconAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "setIconAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;)V", "", "iconColorInt", "getIconColorInt", "()Ljava/lang/Integer;", "setIconColorInt", "(Ljava/lang/Integer;)V", "", "iconColorSaturation", "getIconColorSaturation", "()Ljava/lang/Double;", "setIconColorSaturation", "(Ljava/lang/Double;)V", "", "iconColorString", "getIconColorString", "()Ljava/lang/String;", "setIconColorString", "(Ljava/lang/String;)V", "iconColorUseTheme", "getIconColorUseTheme$annotations", "()V", "getIconColorUseTheme", "setIconColorUseTheme", "iconEmissiveStrength", "getIconEmissiveStrength", "setIconEmissiveStrength", "iconHaloBlur", "getIconHaloBlur", "setIconHaloBlur", "iconHaloColorInt", "getIconHaloColorInt", "setIconHaloColorInt", "iconHaloColorString", "getIconHaloColorString", "setIconHaloColorString", "iconHaloColorUseTheme", "getIconHaloColorUseTheme$annotations", "getIconHaloColorUseTheme", "setIconHaloColorUseTheme", "iconHaloWidth", "getIconHaloWidth", "setIconHaloWidth", "iconIgnorePlacement", "getIconIgnorePlacement", "setIconIgnorePlacement", "iconImage", "getIconImage", "setIconImage", "Landroid/graphics/Bitmap;", "iconImageBitmap", "getIconImageBitmap", "()Landroid/graphics/Bitmap;", "setIconImageBitmap", "(Landroid/graphics/Bitmap;)V", "iconImageCrossFade", "getIconImageCrossFade", "setIconImageCrossFade", "iconKeepUpright", "getIconKeepUpright", "setIconKeepUpright", "iconOcclusionOpacity", "getIconOcclusionOpacity", "setIconOcclusionOpacity", "", "iconOffset", "getIconOffset", "setIconOffset", "(Ljava/util/List;)V", "iconOpacity", "getIconOpacity", "setIconOpacity", "iconOptional", "getIconOptional", "setIconOptional", "iconPadding", "getIconPadding", "setIconPadding", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconPitchAlignment;", "iconPitchAlignment", "getIconPitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconPitchAlignment;", "setIconPitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconPitchAlignment;)V", "iconRotate", "getIconRotate", "setIconRotate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;", "iconRotationAlignment", "getIconRotationAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;", "setIconRotationAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;)V", "iconSize", "getIconSize", "setIconSize", "iconSizeScaleRange", "getIconSizeScaleRange$annotations", "getIconSizeScaleRange", "setIconSizeScaleRange", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "iconTextFit", "getIconTextFit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "setIconTextFit", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;)V", "iconTextFitPadding", "getIconTextFitPadding", "setIconTextFitPadding", "iconTranslate", "getIconTranslate", "setIconTranslate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTranslateAnchor;", "iconTranslateAnchor", "getIconTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTranslateAnchor;", "setIconTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTranslateAnchor;)V", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "layerFilter", "getLayerFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "setLayerFilter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "maxZoom", "getMaxZoom", "setMaxZoom", "minZoom", "getMinZoom", "setMinZoom", "slot", "getSlot", "setSlot", "symbolAvoidEdges", "getSymbolAvoidEdges", "setSymbolAvoidEdges", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolElevationReference;", "symbolElevationReference", "getSymbolElevationReference$annotations", "getSymbolElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolElevationReference;", "setSymbolElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolElevationReference;)V", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolPlacement;", "symbolPlacement", "getSymbolPlacement", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolPlacement;", "setSymbolPlacement", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolPlacement;)V", "symbolSortKey", "getSymbolSortKey", "setSymbolSortKey", "symbolSpacing", "getSymbolSpacing", "setSymbolSpacing", "symbolZElevate", "getSymbolZElevate", "setSymbolZElevate", "symbolZOffset", "getSymbolZOffset$annotations", "getSymbolZOffset", "setSymbolZOffset", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolZOrder;", "symbolZOrder", "getSymbolZOrder", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolZOrder;", "setSymbolZOrder", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolZOrder;)V", "textAllowOverlap", "getTextAllowOverlap", "setTextAllowOverlap", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "textAnchor", "getTextAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "setTextAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;)V", "textColorInt", "getTextColorInt", "setTextColorInt", "textColorString", "getTextColorString", "setTextColorString", "textColorUseTheme", "getTextColorUseTheme$annotations", "getTextColorUseTheme", "setTextColorUseTheme", "textEmissiveStrength", "getTextEmissiveStrength", "setTextEmissiveStrength", "textField", "getTextField", "setTextField", GNCSOptOutSettingsFragment.EXTRA_TEXT_FONT, "getTextFont", "setTextFont", "textHaloBlur", "getTextHaloBlur", "setTextHaloBlur", "textHaloColorInt", "getTextHaloColorInt", "setTextHaloColorInt", "textHaloColorString", "getTextHaloColorString", "setTextHaloColorString", "textHaloColorUseTheme", "getTextHaloColorUseTheme$annotations", "getTextHaloColorUseTheme", "setTextHaloColorUseTheme", "textHaloWidth", "getTextHaloWidth", "setTextHaloWidth", "textIgnorePlacement", "getTextIgnorePlacement", "setTextIgnorePlacement", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "textJustify", "getTextJustify", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "setTextJustify", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;)V", "textKeepUpright", "getTextKeepUpright", "setTextKeepUpright", "textLetterSpacing", "getTextLetterSpacing", "setTextLetterSpacing", "textLineHeight", "getTextLineHeight", "setTextLineHeight", "textMaxAngle", "getTextMaxAngle", "setTextMaxAngle", "textMaxWidth", "getTextMaxWidth", "setTextMaxWidth", "textOcclusionOpacity", "getTextOcclusionOpacity", "setTextOcclusionOpacity", "textOffset", "getTextOffset", "setTextOffset", "textOpacity", "getTextOpacity", "setTextOpacity", "textOptional", "getTextOptional", "setTextOptional", "textPadding", "getTextPadding", "setTextPadding", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextPitchAlignment;", "textPitchAlignment", "getTextPitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextPitchAlignment;", "setTextPitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextPitchAlignment;)V", "textRadialOffset", "getTextRadialOffset", "setTextRadialOffset", "textRotate", "getTextRotate", "setTextRotate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextRotationAlignment;", "textRotationAlignment", "getTextRotationAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextRotationAlignment;", "setTextRotationAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextRotationAlignment;)V", "textSize", "getTextSize", "setTextSize", "textSizeScaleRange", "getTextSizeScaleRange$annotations", "getTextSizeScaleRange", "setTextSizeScaleRange", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", "textTransform", "getTextTransform", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", "setTextTransform", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;)V", "textTranslate", "getTextTranslate", "setTextTranslate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTranslateAnchor;", "textTranslateAnchor", "getTextTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTranslateAnchor;", "setTextTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTranslateAnchor;)V", "textVariableAnchor", "getTextVariableAnchor", "setTextVariableAnchor", "textWritingMode", "getTextWritingMode", "setTextWritingMode", "create", "featureCollection", "Lcom/mapbox/geojson/FeatureCollection;", "json", "getAnnotationIdKey", "setDataDrivenPropertyIsUsed", "", "property", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PointAnnotationManager extends AnnotationManagerImpl<Point, PointAnnotation, PointAnnotationOptions, OnPointAnnotationDragListener, OnPointAnnotationClickListener, OnPointAnnotationLongClickListener, OnPointAnnotationInteractionListener, SymbolLayer> implements ClusterAnnotationManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static AtomicLong ID_GENERATOR = new AtomicLong(0);
    private final List<OnClusterClickListener> clusterClickListeners;
    private final List<OnClusterLongClickListener> clusterLongClickListeners;
    private Bitmap iconImageBitmap;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements p<String, String, SymbolLayer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, SymbolLayer.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // e23.p
        public final SymbolLayer invoke(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new SymbolLayer(str, str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointAnnotationManager(MapDelegateProvider mapDelegateProvider, AnnotationConfig annotationConfig) {
        super(mapDelegateProvider, annotationConfig, ID_GENERATOR.incrementAndGet(), "pointAnnotation", AnonymousClass1.INSTANCE);
        mapDelegateProvider.getClass();
        this.clusterClickListeners = new ArrayList();
        this.clusterLongClickListeners = new ArrayList();
        Map<String, Boolean> dataDrivenPropertyUsageMap = getDataDrivenPropertyUsageMap();
        Boolean bool = Boolean.FALSE;
        dataDrivenPropertyUsageMap.put(PointAnnotationOptions.PROPERTY_ICON_ANCHOR, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_IMAGE, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_OFFSET, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_ROTATE, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_SIZE, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_FIELD, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_OFFSET, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_ROTATE, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_SIZE, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_COLOR, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_OPACITY, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_COLOR, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_OPACITY, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME, bool);
        getDataDrivenPropertyUsageMap().put(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME, bool);
        Boolean bool2 = Boolean.TRUE;
        setIconAllowOverlap(bool2);
        setTextAllowOverlap(bool2);
        setIconIgnorePlacement(bool2);
        setTextIgnorePlacement(bool2);
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

    @Override // com.mapbox.maps.plugin.annotation.ClusterAnnotationManager
    public boolean addClusterClickListener(OnClusterClickListener onClusterClickListener) {
        return ClusterAnnotationManager.DefaultImpls.addClusterClickListener(this, onClusterClickListener);
    }

    @Override // com.mapbox.maps.plugin.annotation.ClusterAnnotationManager
    public boolean addClusterLongClickListener(OnClusterLongClickListener onClusterLongClickListener) {
        return ClusterAnnotationManager.DefaultImpls.addClusterLongClickListener(this, onClusterLongClickListener);
    }

    public final List<PointAnnotation> create(FeatureCollection featureCollection) {
        featureCollection.getClass();
        List<Feature> listFeatures = featureCollection.features();
        if (listFeatures == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Feature feature : listFeatures) {
            PointAnnotationOptions.Companion companion = PointAnnotationOptions.INSTANCE;
            feature.getClass();
            PointAnnotationOptions pointAnnotationOptionsFromFeature = companion.fromFeature(feature);
            if (pointAnnotationOptionsFromFeature != null) {
                arrayList.add(pointAnnotationOptionsFromFeature);
            }
        }
        return create(arrayList);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public String getAnnotationIdKey() {
        return PointAnnotation.ID_KEY;
    }

    @Override // com.mapbox.maps.plugin.annotation.ClusterAnnotationManager
    public List<OnClusterClickListener> getClusterClickListeners() {
        return this.clusterClickListeners;
    }

    @Override // com.mapbox.maps.plugin.annotation.ClusterAnnotationManager
    public List<OnClusterLongClickListener> getClusterLongClickListeners() {
        return this.clusterLongClickListeners;
    }

    public final Boolean getIconAllowOverlap() {
        return getLayer$plugin_annotation_release().getIconAllowOverlap();
    }

    public final IconAnchor getIconAnchor() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_ANCHOR);
        if (jsonElement == null) {
            return null;
        }
        IconAnchor.Companion companion = IconAnchor.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = asString.toUpperCase(locale);
        upperCase.getClass();
        return companion.valueOf(upperCase);
    }

    public final Integer getIconColorInt() {
        Integer numE;
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        if (jsonElement == null || (numE = com.mapbox.maps.p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final Double getIconColorSaturation() {
        return getLayer$plugin_annotation_release().getIconColorSaturation();
    }

    public final String getIconColorString() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getIconColorUseTheme() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getIconEmissiveStrength() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Double getIconHaloBlur() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Integer getIconHaloColorInt() {
        Integer numE;
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        if (jsonElement == null || (numE = com.mapbox.maps.p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getIconHaloColorString() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getIconHaloColorUseTheme() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getIconHaloWidth() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Boolean getIconIgnorePlacement() {
        return getLayer$plugin_annotation_release().getIconIgnorePlacement();
    }

    public final String getIconImage() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_IMAGE);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Bitmap getIconImageBitmap() {
        return this.iconImageBitmap;
    }

    public final Double getIconImageCrossFade() {
        return getLayer$plugin_annotation_release().getIconImageCrossFade();
    }

    public final Boolean getIconKeepUpright() {
        return getLayer$plugin_annotation_release().getIconKeepUpright();
    }

    public final Double getIconOcclusionOpacity() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final List<Double> getIconOffset() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_OFFSET);
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(jsonArray, 10));
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            String string = it.next().toString();
            string.getClass();
            arrayList.add(Double.valueOf(Double.parseDouble(string)));
        }
        return arrayList;
    }

    public final Double getIconOpacity() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_OPACITY);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Boolean getIconOptional() {
        return getLayer$plugin_annotation_release().getIconOptional();
    }

    public final Double getIconPadding() {
        return getLayer$plugin_annotation_release().getIconPadding();
    }

    public final IconPitchAlignment getIconPitchAlignment() {
        return getLayer$plugin_annotation_release().getIconPitchAlignment();
    }

    public final Double getIconRotate() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_ROTATE);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final IconRotationAlignment getIconRotationAlignment() {
        return getLayer$plugin_annotation_release().getIconRotationAlignment();
    }

    public final Double getIconSize() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_SIZE);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final List<Double> getIconSizeScaleRange() {
        return getLayer$plugin_annotation_release().getIconSizeScaleRange();
    }

    public final IconTextFit getIconTextFit() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT);
        if (jsonElement == null) {
            return null;
        }
        IconTextFit.Companion companion = IconTextFit.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = asString.toUpperCase(locale);
        upperCase.getClass();
        return companion.valueOf(upperCase);
    }

    public final List<Double> getIconTextFitPadding() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING);
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(jsonArray, 10));
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            String string = it.next().toString();
            string.getClass();
            arrayList.add(Double.valueOf(Double.parseDouble(string)));
        }
        return arrayList;
    }

    public final List<Double> getIconTranslate() {
        return getLayer$plugin_annotation_release().getIconTranslate();
    }

    public final IconTranslateAnchor getIconTranslateAnchor() {
        return getLayer$plugin_annotation_release().getIconTranslateAnchor();
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public Expression getLayerFilter() {
        return getLayer$plugin_annotation_release().getFilter();
    }

    public final Double getMaxZoom() {
        return getLayer$plugin_annotation_release().getMaxZoom();
    }

    public final Double getMinZoom() {
        return getLayer$plugin_annotation_release().getMinZoom();
    }

    public final String getSlot() {
        return getLayer$plugin_annotation_release().getSlot();
    }

    public final Boolean getSymbolAvoidEdges() {
        return getLayer$plugin_annotation_release().getSymbolAvoidEdges();
    }

    public final SymbolElevationReference getSymbolElevationReference() {
        return getLayer$plugin_annotation_release().getSymbolElevationReference();
    }

    public final SymbolPlacement getSymbolPlacement() {
        return getLayer$plugin_annotation_release().getSymbolPlacement();
    }

    public final Double getSymbolSortKey() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Double getSymbolSpacing() {
        return getLayer$plugin_annotation_release().getSymbolSpacing();
    }

    public final Boolean getSymbolZElevate() {
        return getLayer$plugin_annotation_release().getSymbolZElevate();
    }

    public final Double getSymbolZOffset() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final SymbolZOrder getSymbolZOrder() {
        return getLayer$plugin_annotation_release().getSymbolZOrder();
    }

    public final Boolean getTextAllowOverlap() {
        return getLayer$plugin_annotation_release().getTextAllowOverlap();
    }

    public final TextAnchor getTextAnchor() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR);
        if (jsonElement == null) {
            return null;
        }
        TextAnchor.Companion companion = TextAnchor.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = asString.toUpperCase(locale);
        upperCase.getClass();
        return companion.valueOf(upperCase);
    }

    public final Integer getTextColorInt() {
        Integer numE;
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        if (jsonElement == null || (numE = com.mapbox.maps.p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getTextColorString() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getTextColorUseTheme() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getTextEmissiveStrength() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final String getTextField() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_FIELD);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final List<String> getTextFont() {
        return getLayer$plugin_annotation_release().getTextFont();
    }

    public final Double getTextHaloBlur() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Integer getTextHaloColorInt() {
        Integer numE;
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        if (jsonElement == null || (numE = com.mapbox.maps.p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getTextHaloColorString() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getTextHaloColorUseTheme() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getTextHaloWidth() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Boolean getTextIgnorePlacement() {
        return getLayer$plugin_annotation_release().getTextIgnorePlacement();
    }

    public final TextJustify getTextJustify() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY);
        if (jsonElement == null) {
            return null;
        }
        TextJustify.Companion companion = TextJustify.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = asString.toUpperCase(locale);
        upperCase.getClass();
        return companion.valueOf(upperCase);
    }

    public final Boolean getTextKeepUpright() {
        return getLayer$plugin_annotation_release().getTextKeepUpright();
    }

    public final Double getTextLetterSpacing() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Double getTextLineHeight() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Double getTextMaxAngle() {
        return getLayer$plugin_annotation_release().getTextMaxAngle();
    }

    public final Double getTextMaxWidth() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Double getTextOcclusionOpacity() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final List<Double> getTextOffset() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_OFFSET);
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(jsonArray, 10));
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            String string = it.next().toString();
            string.getClass();
            arrayList.add(Double.valueOf(Double.parseDouble(string)));
        }
        return arrayList;
    }

    public final Double getTextOpacity() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_OPACITY);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Boolean getTextOptional() {
        return getLayer$plugin_annotation_release().getTextOptional();
    }

    public final Double getTextPadding() {
        return getLayer$plugin_annotation_release().getTextPadding();
    }

    public final TextPitchAlignment getTextPitchAlignment() {
        return getLayer$plugin_annotation_release().getTextPitchAlignment();
    }

    public final Double getTextRadialOffset() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Double getTextRotate() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_ROTATE);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final TextRotationAlignment getTextRotationAlignment() {
        return getLayer$plugin_annotation_release().getTextRotationAlignment();
    }

    public final Double getTextSize() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_SIZE);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final List<Double> getTextSizeScaleRange() {
        return getLayer$plugin_annotation_release().getTextSizeScaleRange();
    }

    public final TextTransform getTextTransform() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM);
        if (jsonElement == null) {
            return null;
        }
        TextTransform.Companion companion = TextTransform.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = asString.toUpperCase(locale);
        upperCase.getClass();
        return companion.valueOf(upperCase);
    }

    public final List<Double> getTextTranslate() {
        return getLayer$plugin_annotation_release().getTextTranslate();
    }

    public final TextTranslateAnchor getTextTranslateAnchor() {
        return getLayer$plugin_annotation_release().getTextTranslateAnchor();
    }

    public final List<String> getTextVariableAnchor() {
        return getLayer$plugin_annotation_release().getTextVariableAnchor();
    }

    public final List<String> getTextWritingMode() {
        return getLayer$plugin_annotation_release().getTextWritingMode();
    }

    @Override // com.mapbox.maps.plugin.annotation.ClusterAnnotationManager
    public boolean removeClusterClickListener(OnClusterClickListener onClusterClickListener) {
        return ClusterAnnotationManager.DefaultImpls.removeClusterClickListener(this, onClusterClickListener);
    }

    @Override // com.mapbox.maps.plugin.annotation.ClusterAnnotationManager
    public boolean removeClusterLongClickListener(OnClusterLongClickListener onClusterLongClickListener) {
        return ClusterAnnotationManager.DefaultImpls.removeClusterLongClickListener(this, onClusterLongClickListener);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public void setDataDrivenPropertyIsUsed(String property) {
        property.getClass();
        switch (property.hashCode()) {
            case -2146810373:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_ROTATE)) {
                    SymbolLayer layer$plugin_annotation_release = getLayer$plugin_annotation_release();
                    Expression.Companion companion = Expression.INSTANCE;
                    layer$plugin_annotation_release.textRotate(companion.get(PointAnnotationOptions.PROPERTY_TEXT_ROTATE));
                    getDragLayer$plugin_annotation_release().textRotate(companion.get(PointAnnotationOptions.PROPERTY_TEXT_ROTATE));
                    break;
                }
                break;
            case -2041493401:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_OFFSET)) {
                    SymbolLayer layer$plugin_annotation_release2 = getLayer$plugin_annotation_release();
                    Expression.Companion companion2 = Expression.INSTANCE;
                    layer$plugin_annotation_release2.iconOffset(companion2.get(PointAnnotationOptions.PROPERTY_ICON_OFFSET));
                    getDragLayer$plugin_annotation_release().iconOffset(companion2.get(PointAnnotationOptions.PROPERTY_ICON_OFFSET));
                    break;
                }
                break;
            case -1946894033:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_ROTATE)) {
                    SymbolLayer layer$plugin_annotation_release3 = getLayer$plugin_annotation_release();
                    Expression.Companion companion3 = Expression.INSTANCE;
                    layer$plugin_annotation_release3.iconRotate(companion3.get(PointAnnotationOptions.PROPERTY_ICON_ROTATE));
                    getDragLayer$plugin_annotation_release().iconRotate(companion3.get(PointAnnotationOptions.PROPERTY_ICON_ROTATE));
                    break;
                }
                break;
            case -1747293499:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME)) {
                    SymbolLayer layer$plugin_annotation_release4 = getLayer$plugin_annotation_release();
                    Expression.Companion companion4 = Expression.INSTANCE;
                    layer$plugin_annotation_release4.iconColorUseTheme(companion4.get(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME));
                    getDragLayer$plugin_annotation_release().iconColorUseTheme(companion4.get(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME));
                    break;
                }
                break;
            case -1717422239:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET)) {
                    SymbolLayer layer$plugin_annotation_release5 = getLayer$plugin_annotation_release();
                    Expression.Companion companion5 = Expression.INSTANCE;
                    layer$plugin_annotation_release5.textRadialOffset(companion5.get(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET));
                    getDragLayer$plugin_annotation_release().textRadialOffset(companion5.get(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET));
                    break;
                }
                break;
            case -1708933018:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR)) {
                    SymbolLayer layer$plugin_annotation_release6 = getLayer$plugin_annotation_release();
                    Expression.Companion companion6 = Expression.INSTANCE;
                    layer$plugin_annotation_release6.iconHaloColor(companion6.get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR));
                    getDragLayer$plugin_annotation_release().iconHaloColor(companion6.get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR));
                    break;
                }
                break;
            case -1690648887:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH)) {
                    SymbolLayer layer$plugin_annotation_release7 = getLayer$plugin_annotation_release();
                    Expression.Companion companion7 = Expression.INSTANCE;
                    layer$plugin_annotation_release7.iconHaloWidth(companion7.get(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH));
                    getDragLayer$plugin_annotation_release().iconHaloWidth(companion7.get(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH));
                    break;
                }
                break;
            case -1628743893:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY)) {
                    SymbolLayer layer$plugin_annotation_release8 = getLayer$plugin_annotation_release();
                    Expression.Companion companion8 = Expression.INSTANCE;
                    layer$plugin_annotation_release8.textOcclusionOpacity(companion8.get(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY));
                    getDragLayer$plugin_annotation_release().textOcclusionOpacity(companion8.get(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY));
                    break;
                }
                break;
            case -1600683761:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_COLOR)) {
                    SymbolLayer layer$plugin_annotation_release9 = getLayer$plugin_annotation_release();
                    Expression.Companion companion9 = Expression.INSTANCE;
                    layer$plugin_annotation_release9.iconColor(companion9.get(PointAnnotationOptions.PROPERTY_ICON_COLOR));
                    getDragLayer$plugin_annotation_release().iconColor(companion9.get(PointAnnotationOptions.PROPERTY_ICON_COLOR));
                    break;
                }
                break;
            case -1595213049:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_IMAGE)) {
                    SymbolLayer layer$plugin_annotation_release10 = getLayer$plugin_annotation_release();
                    Expression.Companion companion10 = Expression.INSTANCE;
                    layer$plugin_annotation_release10.iconImage(companion10.get(PointAnnotationOptions.PROPERTY_ICON_IMAGE));
                    getDragLayer$plugin_annotation_release().iconImage(companion10.get(PointAnnotationOptions.PROPERTY_ICON_IMAGE));
                    break;
                }
                break;
            case -1436636971:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_SIZE)) {
                    SymbolLayer layer$plugin_annotation_release11 = getLayer$plugin_annotation_release();
                    Expression.Companion companion11 = Expression.INSTANCE;
                    layer$plugin_annotation_release11.iconSize(companion11.get(PointAnnotationOptions.PROPERTY_ICON_SIZE));
                    getDragLayer$plugin_annotation_release().iconSize(companion11.get(PointAnnotationOptions.PROPERTY_ICON_SIZE));
                    break;
                }
                break;
            case -1362940800:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT)) {
                    SymbolLayer layer$plugin_annotation_release12 = getLayer$plugin_annotation_release();
                    Expression.Companion companion12 = Expression.INSTANCE;
                    layer$plugin_annotation_release12.textLineHeight(companion12.get(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT));
                    getDragLayer$plugin_annotation_release().textLineHeight(companion12.get(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT));
                    break;
                }
                break;
            case -1336352187:
                if (property.equals(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY)) {
                    SymbolLayer layer$plugin_annotation_release13 = getLayer$plugin_annotation_release();
                    Expression.Companion companion13 = Expression.INSTANCE;
                    layer$plugin_annotation_release13.symbolSortKey(companion13.get(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY));
                    getDragLayer$plugin_annotation_release().symbolSortKey(companion13.get(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY));
                    break;
                }
                break;
            case -1262567732:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM)) {
                    SymbolLayer layer$plugin_annotation_release14 = getLayer$plugin_annotation_release();
                    Expression.Companion companion14 = Expression.INSTANCE;
                    layer$plugin_annotation_release14.textTransform(companion14.get(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM));
                    getDragLayer$plugin_annotation_release().textTransform(companion14.get(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM));
                    break;
                }
                break;
            case -1083772767:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_SIZE)) {
                    SymbolLayer layer$plugin_annotation_release15 = getLayer$plugin_annotation_release();
                    Expression.Companion companion15 = Expression.INSTANCE;
                    layer$plugin_annotation_release15.textSize(companion15.get(PointAnnotationOptions.PROPERTY_TEXT_SIZE));
                    getDragLayer$plugin_annotation_release().textSize(companion15.get(PointAnnotationOptions.PROPERTY_TEXT_SIZE));
                    break;
                }
                break;
            case -951348361:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY)) {
                    SymbolLayer layer$plugin_annotation_release16 = getLayer$plugin_annotation_release();
                    Expression.Companion companion16 = Expression.INSTANCE;
                    layer$plugin_annotation_release16.iconOcclusionOpacity(companion16.get(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY));
                    getDragLayer$plugin_annotation_release().iconOcclusionOpacity(companion16.get(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY));
                    break;
                }
                break;
            case -888013006:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR)) {
                    SymbolLayer layer$plugin_annotation_release17 = getLayer$plugin_annotation_release();
                    Expression.Companion companion17 = Expression.INSTANCE;
                    layer$plugin_annotation_release17.textHaloColor(companion17.get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR));
                    getDragLayer$plugin_annotation_release().textHaloColor(companion17.get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR));
                    break;
                }
                break;
            case -886443260:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR)) {
                    SymbolLayer layer$plugin_annotation_release18 = getLayer$plugin_annotation_release();
                    Expression.Companion companion18 = Expression.INSTANCE;
                    layer$plugin_annotation_release18.iconHaloBlur(companion18.get(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR));
                    getDragLayer$plugin_annotation_release().iconHaloBlur(companion18.get(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR));
                    break;
                }
                break;
            case -869728875:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH)) {
                    SymbolLayer layer$plugin_annotation_release19 = getLayer$plugin_annotation_release();
                    Expression.Companion companion19 = Expression.INSTANCE;
                    layer$plugin_annotation_release19.textHaloWidth(companion19.get(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH));
                    getDragLayer$plugin_annotation_release().textHaloWidth(companion19.get(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH));
                    break;
                }
                break;
            case -564393509:
                if (property.equals(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET)) {
                    SymbolLayer layer$plugin_annotation_release20 = getLayer$plugin_annotation_release();
                    Expression.Companion companion20 = Expression.INSTANCE;
                    layer$plugin_annotation_release20.symbolZOffset(companion20.get(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET));
                    getDragLayer$plugin_annotation_release().symbolZOffset(companion20.get(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET));
                    break;
                }
                break;
            case -483024021:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_OPACITY)) {
                    SymbolLayer layer$plugin_annotation_release21 = getLayer$plugin_annotation_release();
                    Expression.Companion companion21 = Expression.INSTANCE;
                    layer$plugin_annotation_release21.textOpacity(companion21.get(PointAnnotationOptions.PROPERTY_TEXT_OPACITY));
                    getDragLayer$plugin_annotation_release().textOpacity(companion21.get(PointAnnotationOptions.PROPERTY_TEXT_OPACITY));
                    break;
                }
                break;
            case -465299984:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY)) {
                    SymbolLayer layer$plugin_annotation_release22 = getLayer$plugin_annotation_release();
                    Expression.Companion companion22 = Expression.INSTANCE;
                    layer$plugin_annotation_release22.textJustify(companion22.get(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY));
                    getDragLayer$plugin_annotation_release().textJustify(companion22.get(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY));
                    break;
                }
                break;
            case -199448228:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME)) {
                    SymbolLayer layer$plugin_annotation_release23 = getLayer$plugin_annotation_release();
                    Expression.Companion companion23 = Expression.INSTANCE;
                    layer$plugin_annotation_release23.iconHaloColorUseTheme(companion23.get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME));
                    getDragLayer$plugin_annotation_release().iconHaloColorUseTheme(companion23.get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME));
                    break;
                }
                break;
            case -197162119:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME)) {
                    SymbolLayer layer$plugin_annotation_release24 = getLayer$plugin_annotation_release();
                    Expression.Companion companion24 = Expression.INSTANCE;
                    layer$plugin_annotation_release24.textColorUseTheme(companion24.get(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME));
                    getDragLayer$plugin_annotation_release().textColorUseTheme(companion24.get(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME));
                    break;
                }
                break;
            case 317300605:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH)) {
                    SymbolLayer layer$plugin_annotation_release25 = getLayer$plugin_annotation_release();
                    Expression.Companion companion25 = Expression.INSTANCE;
                    layer$plugin_annotation_release25.textMaxWidth(companion25.get(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH));
                    getDragLayer$plugin_annotation_release().textMaxWidth(companion25.get(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH));
                    break;
                }
                break;
            case 428355132:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING)) {
                    SymbolLayer layer$plugin_annotation_release26 = getLayer$plugin_annotation_release();
                    Expression.Companion companion26 = Expression.INSTANCE;
                    layer$plugin_annotation_release26.textLetterSpacing(companion26.get(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING));
                    getDragLayer$plugin_annotation_release().textLetterSpacing(companion26.get(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING));
                    break;
                }
                break;
            case 525511352:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR)) {
                    SymbolLayer layer$plugin_annotation_release27 = getLayer$plugin_annotation_release();
                    Expression.Companion companion27 = Expression.INSTANCE;
                    layer$plugin_annotation_release27.textHaloBlur(companion27.get(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR));
                    getDragLayer$plugin_annotation_release().textHaloBlur(companion27.get(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR));
                    break;
                }
                break;
            case 676079173:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT)) {
                    SymbolLayer layer$plugin_annotation_release28 = getLayer$plugin_annotation_release();
                    Expression.Companion companion28 = Expression.INSTANCE;
                    layer$plugin_annotation_release28.iconTextFit(companion28.get(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT));
                    getDragLayer$plugin_annotation_release().iconTextFit(companion28.get(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT));
                    break;
                }
                break;
            case 748171971:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_COLOR)) {
                    SymbolLayer layer$plugin_annotation_release29 = getLayer$plugin_annotation_release();
                    Expression.Companion companion29 = Expression.INSTANCE;
                    layer$plugin_annotation_release29.textColor(companion29.get(PointAnnotationOptions.PROPERTY_TEXT_COLOR));
                    getDragLayer$plugin_annotation_release().textColor(companion29.get(PointAnnotationOptions.PROPERTY_TEXT_COLOR));
                    break;
                }
                break;
            case 750756954:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_FIELD)) {
                    SymbolLayer layer$plugin_annotation_release30 = getLayer$plugin_annotation_release();
                    Expression.Companion companion30 = Expression.INSTANCE;
                    layer$plugin_annotation_release30.textField(companion30.get(PointAnnotationOptions.PROPERTY_TEXT_FIELD));
                    getDragLayer$plugin_annotation_release().textField(companion30.get(PointAnnotationOptions.PROPERTY_TEXT_FIELD));
                    break;
                }
                break;
            case 961593943:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH)) {
                    SymbolLayer layer$plugin_annotation_release31 = getLayer$plugin_annotation_release();
                    Expression.Companion companion31 = Expression.INSTANCE;
                    layer$plugin_annotation_release31.textEmissiveStrength(companion31.get(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH));
                    getDragLayer$plugin_annotation_release().textEmissiveStrength(companion31.get(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH));
                    break;
                }
                break;
            case 1304244361:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING)) {
                    SymbolLayer layer$plugin_annotation_release32 = getLayer$plugin_annotation_release();
                    Expression.Companion companion32 = Expression.INSTANCE;
                    layer$plugin_annotation_release32.iconTextFitPadding(companion32.get(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING));
                    getDragLayer$plugin_annotation_release().iconTextFitPadding(companion32.get(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING));
                    break;
                }
                break;
            case 1419415223:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_OPACITY)) {
                    SymbolLayer layer$plugin_annotation_release33 = getLayer$plugin_annotation_release();
                    Expression.Companion companion33 = Expression.INSTANCE;
                    layer$plugin_annotation_release33.iconOpacity(companion33.get(PointAnnotationOptions.PROPERTY_ICON_OPACITY));
                    getDragLayer$plugin_annotation_release().iconOpacity(companion33.get(PointAnnotationOptions.PROPERTY_ICON_OPACITY));
                    break;
                }
                break;
            case 1561581864:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME)) {
                    SymbolLayer layer$plugin_annotation_release34 = getLayer$plugin_annotation_release();
                    Expression.Companion companion34 = Expression.INSTANCE;
                    layer$plugin_annotation_release34.textHaloColorUseTheme(companion34.get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME));
                    getDragLayer$plugin_annotation_release().textHaloColorUseTheme(companion34.get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME));
                    break;
                }
                break;
            case 1638989475:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH)) {
                    SymbolLayer layer$plugin_annotation_release35 = getLayer$plugin_annotation_release();
                    Expression.Companion companion35 = Expression.INSTANCE;
                    layer$plugin_annotation_release35.iconEmissiveStrength(companion35.get(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH));
                    getDragLayer$plugin_annotation_release().iconEmissiveStrength(companion35.get(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH));
                    break;
                }
                break;
            case 1660037973:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR)) {
                    SymbolLayer layer$plugin_annotation_release36 = getLayer$plugin_annotation_release();
                    Expression.Companion companion36 = Expression.INSTANCE;
                    layer$plugin_annotation_release36.textAnchor(companion36.get(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR));
                    getDragLayer$plugin_annotation_release().textAnchor(companion36.get(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR));
                    break;
                }
                break;
            case 1859954313:
                if (property.equals(PointAnnotationOptions.PROPERTY_ICON_ANCHOR)) {
                    SymbolLayer layer$plugin_annotation_release37 = getLayer$plugin_annotation_release();
                    Expression.Companion companion37 = Expression.INSTANCE;
                    layer$plugin_annotation_release37.iconAnchor(companion37.get(PointAnnotationOptions.PROPERTY_ICON_ANCHOR));
                    getDragLayer$plugin_annotation_release().iconAnchor(companion37.get(PointAnnotationOptions.PROPERTY_ICON_ANCHOR));
                    break;
                }
                break;
            case 2053557555:
                if (property.equals(PointAnnotationOptions.PROPERTY_TEXT_OFFSET)) {
                    SymbolLayer layer$plugin_annotation_release38 = getLayer$plugin_annotation_release();
                    Expression.Companion companion38 = Expression.INSTANCE;
                    layer$plugin_annotation_release38.textOffset(companion38.get(PointAnnotationOptions.PROPERTY_TEXT_OFFSET));
                    getDragLayer$plugin_annotation_release().textOffset(companion38.get(PointAnnotationOptions.PROPERTY_TEXT_OFFSET));
                    break;
                }
                break;
        }
    }

    public final void setIconAllowOverlap(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("symbol", "icon-allow-overlap"), "icon-allow-overlap");
    }

    public final void setIconAnchor(IconAnchor iconAnchor) {
        if (iconAnchor != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_ICON_ANCHOR, iconAnchor.getValue());
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_ANCHOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_ANCHOR);
        }
        update(getAnnotations());
    }

    public final void setIconColorInt(Integer num) {
        if (num != null) {
            com.mapbox.maps.p.l(num, ColorUtils.INSTANCE, getDataDrivenPropertyDefaultValues(), PointAnnotationOptions.PROPERTY_ICON_COLOR);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        }
        update(getAnnotations());
    }

    public final void setIconColorSaturation(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("symbol", "icon-color-saturation"), "icon-color-saturation");
    }

    public final void setIconColorString(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR, str);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        }
        update(getAnnotations());
    }

    public final void setIconColorUseTheme(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME, str);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME);
        }
        update(getAnnotations());
    }

    public final void setIconEmissiveStrength(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH, d14, PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH);
        }
        update(getAnnotations());
    }

    public final void setIconHaloBlur(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR, d14, PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR);
        }
        update(getAnnotations());
    }

    public final void setIconHaloColorInt(Integer num) {
        if (num != null) {
            com.mapbox.maps.p.l(num, ColorUtils.INSTANCE, getDataDrivenPropertyDefaultValues(), PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        }
        update(getAnnotations());
    }

    public final void setIconHaloColorString(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR, str);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        }
        update(getAnnotations());
    }

    public final void setIconHaloColorUseTheme(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME, str);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME);
        }
        update(getAnnotations());
    }

    public final void setIconHaloWidth(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH, d14, PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH);
        }
        update(getAnnotations());
    }

    public final void setIconIgnorePlacement(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("symbol", "icon-ignore-placement"), "icon-ignore-placement");
    }

    public final void setIconImage(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_ICON_IMAGE, str);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_IMAGE);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_IMAGE);
        }
        update(getAnnotations());
    }

    public final void setIconImageBitmap(Bitmap bitmap) {
        this.iconImageBitmap = bitmap;
        if (bitmap == null) {
            setIconImage(null);
            return;
        }
        if (bitmap.equals(bitmap)) {
            return;
        }
        if (getIconImage() != null) {
            String iconImage = getIconImage();
            iconImage.getClass();
            if (!u.y(iconImage, PointAnnotation.ICON_DEFAULT_NAME_PREFIX, false)) {
                return;
            }
        }
        String str = PointAnnotation.ICON_DEFAULT_NAME_PREFIX + bitmap.hashCode();
        setIconImage(str);
        addStyleImage$plugin_annotation_release(str, bitmap);
    }

    public final void setIconImageCrossFade(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("symbol", PointAnnotationOptions.PROPERTY_ICON_IMAGE_CROSS_FADE), PointAnnotationOptions.PROPERTY_ICON_IMAGE_CROSS_FADE);
    }

    public final void setIconKeepUpright(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("symbol", "icon-keep-upright"), "icon-keep-upright");
    }

    public final void setIconOcclusionOpacity(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY, d14, PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY);
        }
        update(getAnnotations());
    }

    public final void setIconOffset(List<Double> list) {
        if (list == null || list.isEmpty()) {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_OFFSET);
        } else {
            JsonArray jsonArray = new JsonArray(list.size());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jsonArray.add(Double.valueOf(((Number) it.next()).doubleValue()));
            }
            getDataDrivenPropertyDefaultValues().add(PointAnnotationOptions.PROPERTY_ICON_OFFSET, jsonArray);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_OFFSET);
        }
        update(getAnnotations());
    }

    public final void setIconOpacity(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_ICON_OPACITY, d14, PointAnnotationOptions.PROPERTY_ICON_OPACITY);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_OPACITY);
        }
        update(getAnnotations());
    }

    public final void setIconOptional(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("symbol", "icon-optional"), "icon-optional");
    }

    public final void setIconPadding(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("symbol", "icon-padding"), "icon-padding");
    }

    public final void setIconPitchAlignment(IconPitchAlignment iconPitchAlignment) {
        setLayerProperty(iconPitchAlignment != null ? TypeUtils.INSTANCE.wrapToValue(iconPitchAlignment) : com.mapbox.maps.p.a("symbol", "icon-pitch-alignment"), "icon-pitch-alignment");
    }

    public final void setIconRotate(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_ICON_ROTATE, d14, PointAnnotationOptions.PROPERTY_ICON_ROTATE);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_ROTATE);
        }
        update(getAnnotations());
    }

    public final void setIconRotationAlignment(IconRotationAlignment iconRotationAlignment) {
        setLayerProperty(iconRotationAlignment != null ? TypeUtils.INSTANCE.wrapToValue(iconRotationAlignment) : com.mapbox.maps.p.a("symbol", "icon-rotation-alignment"), "icon-rotation-alignment");
    }

    public final void setIconSize(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_ICON_SIZE, d14, PointAnnotationOptions.PROPERTY_ICON_SIZE);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_SIZE);
        }
        update(getAnnotations());
    }

    public final void setIconSizeScaleRange(List<Double> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("symbol", "icon-size-scale-range"), "icon-size-scale-range");
    }

    public final void setIconTextFit(IconTextFit iconTextFit) {
        if (iconTextFit != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT, iconTextFit.getValue());
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT);
        }
        update(getAnnotations());
    }

    public final void setIconTextFitPadding(List<Double> list) {
        if (list == null || list.isEmpty()) {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING);
        } else {
            JsonArray jsonArray = new JsonArray(list.size());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jsonArray.add(Double.valueOf(((Number) it.next()).doubleValue()));
            }
            getDataDrivenPropertyDefaultValues().add(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING, jsonArray);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING);
        }
        update(getAnnotations());
    }

    public final void setIconTranslate(List<Double> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("symbol", "icon-translate"), "icon-translate");
    }

    public final void setIconTranslateAnchor(IconTranslateAnchor iconTranslateAnchor) {
        setLayerProperty(iconTranslateAnchor != null ? TypeUtils.INSTANCE.wrapToValue(iconTranslateAnchor) : com.mapbox.maps.p.a("symbol", "icon-translate-anchor"), "icon-translate-anchor");
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public void setLayerFilter(Expression expression) {
        if (expression != null) {
            getLayer$plugin_annotation_release().filter(expression);
            getDragLayer$plugin_annotation_release().filter(expression);
        }
    }

    public final void setMaxZoom(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("symbol", "maxzoom"), "maxzoom");
    }

    public final void setMinZoom(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("symbol", "minzoom"), "minzoom");
    }

    public final void setSlot(String str) {
        setLayerProperty(str != null ? TypeUtils.INSTANCE.wrapToValue(str) : com.mapbox.maps.p.a("symbol", "slot"), "slot");
    }

    public final void setSymbolAvoidEdges(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("symbol", "symbol-avoid-edges"), "symbol-avoid-edges");
    }

    public final void setSymbolElevationReference(SymbolElevationReference symbolElevationReference) {
        setLayerProperty(symbolElevationReference != null ? TypeUtils.INSTANCE.wrapToValue(symbolElevationReference) : com.mapbox.maps.p.a("symbol", "symbol-elevation-reference"), "symbol-elevation-reference");
    }

    public final void setSymbolPlacement(SymbolPlacement symbolPlacement) {
        setLayerProperty(symbolPlacement != null ? TypeUtils.INSTANCE.wrapToValue(symbolPlacement) : com.mapbox.maps.p.a("symbol", "symbol-placement"), "symbol-placement");
    }

    public final void setSymbolSortKey(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY, d14, PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY);
        }
        update(getAnnotations());
    }

    public final void setSymbolSpacing(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("symbol", "symbol-spacing"), "symbol-spacing");
    }

    public final void setSymbolZElevate(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("symbol", "symbol-z-elevate"), "symbol-z-elevate");
    }

    public final void setSymbolZOffset(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET, d14, PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET);
        }
        update(getAnnotations());
    }

    public final void setSymbolZOrder(SymbolZOrder symbolZOrder) {
        setLayerProperty(symbolZOrder != null ? TypeUtils.INSTANCE.wrapToValue(symbolZOrder) : com.mapbox.maps.p.a("symbol", "symbol-z-order"), "symbol-z-order");
    }

    public final void setTextAllowOverlap(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("symbol", "text-allow-overlap"), "text-allow-overlap");
    }

    public final void setTextAnchor(TextAnchor textAnchor) {
        if (textAnchor != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR, textAnchor.getValue());
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR);
        }
        update(getAnnotations());
    }

    public final void setTextColorInt(Integer num) {
        if (num != null) {
            com.mapbox.maps.p.l(num, ColorUtils.INSTANCE, getDataDrivenPropertyDefaultValues(), PointAnnotationOptions.PROPERTY_TEXT_COLOR);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        }
        update(getAnnotations());
    }

    public final void setTextColorString(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR, str);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        }
        update(getAnnotations());
    }

    public final void setTextColorUseTheme(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME, str);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME);
        }
        update(getAnnotations());
    }

    public final void setTextEmissiveStrength(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH, d14, PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH);
        }
        update(getAnnotations());
    }

    public final void setTextField(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_TEXT_FIELD, str);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_FIELD);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_FIELD);
        }
        update(getAnnotations());
    }

    public final void setTextFont(List<String> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("symbol", "text-font"), "text-font");
    }

    public final void setTextHaloBlur(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR, d14, PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR);
        }
        update(getAnnotations());
    }

    public final void setTextHaloColorInt(Integer num) {
        if (num != null) {
            com.mapbox.maps.p.l(num, ColorUtils.INSTANCE, getDataDrivenPropertyDefaultValues(), PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        }
        update(getAnnotations());
    }

    public final void setTextHaloColorString(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR, str);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        }
        update(getAnnotations());
    }

    public final void setTextHaloColorUseTheme(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME, str);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME);
        }
        update(getAnnotations());
    }

    public final void setTextHaloWidth(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH, d14, PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH);
        }
        update(getAnnotations());
    }

    public final void setTextIgnorePlacement(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("symbol", "text-ignore-placement"), "text-ignore-placement");
    }

    public final void setTextJustify(TextJustify textJustify) {
        if (textJustify != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY, textJustify.getValue());
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY);
        }
        update(getAnnotations());
    }

    public final void setTextKeepUpright(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("symbol", "text-keep-upright"), "text-keep-upright");
    }

    public final void setTextLetterSpacing(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING, d14, PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING);
        }
        update(getAnnotations());
    }

    public final void setTextLineHeight(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT, d14, PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT);
        }
        update(getAnnotations());
    }

    public final void setTextMaxAngle(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("symbol", "text-max-angle"), "text-max-angle");
    }

    public final void setTextMaxWidth(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH, d14, PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH);
        }
        update(getAnnotations());
    }

    public final void setTextOcclusionOpacity(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY, d14, PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY);
        }
        update(getAnnotations());
    }

    public final void setTextOffset(List<Double> list) {
        if (list == null || list.isEmpty()) {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_OFFSET);
        } else {
            JsonArray jsonArray = new JsonArray(list.size());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jsonArray.add(Double.valueOf(((Number) it.next()).doubleValue()));
            }
            getDataDrivenPropertyDefaultValues().add(PointAnnotationOptions.PROPERTY_TEXT_OFFSET, jsonArray);
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_OFFSET);
        }
        update(getAnnotations());
    }

    public final void setTextOpacity(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_OPACITY, d14, PointAnnotationOptions.PROPERTY_TEXT_OPACITY);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_OPACITY);
        }
        update(getAnnotations());
    }

    public final void setTextOptional(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("symbol", "text-optional"), "text-optional");
    }

    public final void setTextPadding(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("symbol", "text-padding"), "text-padding");
    }

    public final void setTextPitchAlignment(TextPitchAlignment textPitchAlignment) {
        setLayerProperty(textPitchAlignment != null ? TypeUtils.INSTANCE.wrapToValue(textPitchAlignment) : com.mapbox.maps.p.a("symbol", "text-pitch-alignment"), "text-pitch-alignment");
    }

    public final void setTextRadialOffset(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET, d14, PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET);
        }
        update(getAnnotations());
    }

    public final void setTextRotate(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_ROTATE, d14, PointAnnotationOptions.PROPERTY_TEXT_ROTATE);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_ROTATE);
        }
        update(getAnnotations());
    }

    public final void setTextRotationAlignment(TextRotationAlignment textRotationAlignment) {
        setLayerProperty(textRotationAlignment != null ? TypeUtils.INSTANCE.wrapToValue(textRotationAlignment) : com.mapbox.maps.p.a("symbol", "text-rotation-alignment"), "text-rotation-alignment");
    }

    public final void setTextSize(Double d14) {
        if (d14 != null) {
            com.mapbox.maps.p.j(this, PointAnnotationOptions.PROPERTY_TEXT_SIZE, d14, PointAnnotationOptions.PROPERTY_TEXT_SIZE);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_SIZE);
        }
        update(getAnnotations());
    }

    public final void setTextSizeScaleRange(List<Double> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("symbol", "text-size-scale-range"), "text-size-scale-range");
    }

    public final void setTextTransform(TextTransform textTransform) {
        if (textTransform != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM, textTransform.getValue());
            enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM);
        }
        update(getAnnotations());
    }

    public final void setTextTranslate(List<Double> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("symbol", "text-translate"), "text-translate");
    }

    public final void setTextTranslateAnchor(TextTranslateAnchor textTranslateAnchor) {
        setLayerProperty(textTranslateAnchor != null ? TypeUtils.INSTANCE.wrapToValue(textTranslateAnchor) : com.mapbox.maps.p.a("symbol", "text-translate-anchor"), "text-translate-anchor");
    }

    public final void setTextVariableAnchor(List<String> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("symbol", "text-variable-anchor"), "text-variable-anchor");
    }

    public final void setTextWritingMode(List<String> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("symbol", "text-writing-mode"), "text-writing-mode");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationManager$Companion;", "", "()V", "ID_GENERATOR", "Ljava/util/concurrent/atomic/AtomicLong;", "getID_GENERATOR", "()Ljava/util/concurrent/atomic/AtomicLong;", "setID_GENERATOR", "(Ljava/util/concurrent/atomic/AtomicLong;)V", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final AtomicLong getID_GENERATOR() {
            return PointAnnotationManager.ID_GENERATOR;
        }

        public final void setID_GENERATOR(AtomicLong atomicLong) {
            atomicLong.getClass();
            PointAnnotationManager.ID_GENERATOR = atomicLong;
        }

        private Companion() {
        }
    }

    public final List<PointAnnotation> create(String json) {
        json.getClass();
        FeatureCollection featureCollectionFromJson = FeatureCollection.fromJson(json);
        featureCollectionFromJson.getClass();
        return create(featureCollectionFromJson);
    }

    public /* synthetic */ PointAnnotationManager(MapDelegateProvider mapDelegateProvider, AnnotationConfig annotationConfig, int i14, j jVar) {
        this(mapDelegateProvider, (i14 & 2) != 0 ? null : annotationConfig);
    }
}
