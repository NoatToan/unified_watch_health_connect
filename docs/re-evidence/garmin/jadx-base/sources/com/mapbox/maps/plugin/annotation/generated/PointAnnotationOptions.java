package com.mapbox.maps.plugin.annotation.generated;

import android.graphics.Bitmap;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxAnnotationException;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.IconTextFit;
import com.mapbox.maps.extension.style.layers.properties.generated.TextAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.TextJustify;
import com.mapbox.maps.extension.style.layers.properties.generated.TextTransform;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationOptions;
import com.mapbox.maps.plugin.annotation.ConvertUtils;
import java.util.List;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b)\u0018\u0000 Ò\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002Ò\u0001B\u0005¢\u0006\u0002\u0010\u0004J<\u0010\u009b\u0001\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u00020\u000f2(\u0010\u009d\u0001\u001a#\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u009e\u0001H\u0016J\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006J\u0007\u0010 \u0001\u001a\u00020OJ\t\u0010¡\u0001\u001a\u0004\u0018\u00010\u0002J\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0002J\u0010\u0010£\u0001\u001a\u00020\u00002\u0007\u0010¤\u0001\u001a\u00020\u0006J\u0010\u0010¥\u0001\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020OJ\u000f\u0010§\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000f\u0010¨\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010©\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u000e\u001a\u00030ª\u0001J\u000f\u0010©\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000f\u0010«\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000fJ\u000f\u0010¬\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000f\u0010\u00ad\u0001\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0018J\u0012\u0010®\u0001\u001a\u00020\u00002\t\b\u0001\u0010!\u001a\u00030ª\u0001J\u000f\u0010®\u0001\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000fJ\u000f\u0010¯\u0001\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000fJ\u000f\u0010°\u0001\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0018J\u000f\u0010±\u0001\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.J\u000f\u0010±\u0001\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u000fJ\u0011\u0010²\u0001\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0018H\u0007J\u000f\u0010³\u0001\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0018J\u0015\u0010´\u0001\u001a\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001807J\u000f\u0010µ\u0001\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0018J\u000f\u0010¶\u0001\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0018J\u000f\u0010·\u0001\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0018J\u000f\u0010¸\u0001\u001a\u00020\u00002\u0006\u0010E\u001a\u00020FJ\u0015\u0010¹\u0001\u001a\u00020\u00002\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001807J\u0010\u0010º\u0001\u001a\u00020\u00002\u0007\u0010»\u0001\u001a\u00020\u0002J\u000f\u0010¼\u0001\u001a\u00020\u00002\u0006\u0010P\u001a\u00020\u0018J\u000f\u0010½\u0001\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u0018J\u000f\u0010¾\u0001\u001a\u00020\u00002\u0006\u0010V\u001a\u00020WJ\u0012\u0010¿\u0001\u001a\u00020\u00002\t\b\u0001\u0010\\\u001a\u00030ª\u0001J\u000f\u0010¿\u0001\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020\u000fJ\u000f\u0010À\u0001\u001a\u00020\u00002\u0006\u0010_\u001a\u00020\u000fJ\u000f\u0010Á\u0001\u001a\u00020\u00002\u0006\u0010b\u001a\u00020\u0018J\u000f\u0010Â\u0001\u001a\u00020\u00002\u0006\u0010e\u001a\u00020\u000fJ\u000f\u0010Ã\u0001\u001a\u00020\u00002\u0006\u0010h\u001a\u00020\u0018J\u0012\u0010Ä\u0001\u001a\u00020\u00002\t\b\u0001\u0010k\u001a\u00030ª\u0001J\u000f\u0010Ä\u0001\u001a\u00020\u00002\u0006\u0010k\u001a\u00020\u000fJ\u000f\u0010Å\u0001\u001a\u00020\u00002\u0006\u0010n\u001a\u00020\u000fJ\u000f\u0010Æ\u0001\u001a\u00020\u00002\u0006\u0010q\u001a\u00020\u0018J\u000f\u0010Ç\u0001\u001a\u00020\u00002\u0006\u0010t\u001a\u00020uJ\u000f\u0010È\u0001\u001a\u00020\u00002\u0006\u0010z\u001a\u00020\u0018J\u000f\u0010É\u0001\u001a\u00020\u00002\u0006\u0010}\u001a\u00020\u0018J\u0010\u0010Ê\u0001\u001a\u00020\u00002\u0007\u0010\u0080\u0001\u001a\u00020\u0018J\u0010\u0010Ë\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020\u0018J\u0016\u0010Ì\u0001\u001a\u00020\u00002\r\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u001807J\u0010\u0010Í\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0018J\u0010\u0010Î\u0001\u001a\u00020\u00002\u0007\u0010\u008c\u0001\u001a\u00020\u0018J\u0010\u0010Ï\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020\u0018J\u0010\u0010Ð\u0001\u001a\u00020\u00002\u0007\u0010\u0092\u0001\u001a\u00020\u0018J\u0011\u0010Ñ\u0001\u001a\u00020\u00002\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001c\u0010$\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R\u001e\u0010'\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001c\u0010*\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010/\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u001d\u0012\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001e\u00103\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001cR\"\u00106\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010\u001cR\u001e\u0010?\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u0010\u001cR\u001e\u0010B\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bC\u0010\u001a\"\u0004\bD\u0010\u001cR\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00109\"\u0004\bM\u0010;R\u000e\u0010N\u001a\u00020OX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010P\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bQ\u0010\u001a\"\u0004\bR\u0010\u001cR\u001e\u0010S\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bT\u0010\u001a\"\u0004\bU\u0010\u001cR\u001c\u0010V\u001a\u0004\u0018\u00010WX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001c\u0010\\\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0011\"\u0004\b^\u0010\u0013R\u001c\u0010_\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0011\"\u0004\ba\u0010\u0013R\u001e\u0010b\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bc\u0010\u001a\"\u0004\bd\u0010\u001cR\u001c\u0010e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0011\"\u0004\bg\u0010\u0013R\u001e\u0010h\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bi\u0010\u001a\"\u0004\bj\u0010\u001cR\u001c\u0010k\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0011\"\u0004\bm\u0010\u0013R\u001c\u0010n\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0011\"\u0004\bp\u0010\u0013R\u001e\u0010q\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\br\u0010\u001a\"\u0004\bs\u0010\u001cR\u001c\u0010t\u001a\u0004\u0018\u00010uX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001e\u0010z\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b{\u0010\u001a\"\u0004\b|\u0010\u001cR\u001e\u0010}\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b~\u0010\u001a\"\u0004\b\u007f\u0010\u001cR!\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001d\u001a\u0005\b\u0081\u0001\u0010\u001a\"\u0005\b\u0082\u0001\u0010\u001cR!\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001d\u001a\u0005\b\u0084\u0001\u0010\u001a\"\u0005\b\u0085\u0001\u0010\u001cR%\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u000107X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u00109\"\u0005\b\u0088\u0001\u0010;R!\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001d\u001a\u0005\b\u008a\u0001\u0010\u001a\"\u0005\b\u008b\u0001\u0010\u001cR!\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001d\u001a\u0005\b\u008d\u0001\u0010\u001a\"\u0005\b\u008e\u0001\u0010\u001cR!\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001d\u001a\u0005\b\u0090\u0001\u0010\u001a\"\u0005\b\u0091\u0001\u0010\u001cR!\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001d\u001a\u0005\b\u0093\u0001\u0010\u001a\"\u0005\b\u0094\u0001\u0010\u001cR\"\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006Ó\u0001"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationOptions;", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "Lcom/mapbox/geojson/Point;", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotation;", "()V", "data", "Lcom/google/gson/JsonElement;", "geometry", "iconAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "getIconAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "setIconAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;)V", "iconColor", "", "getIconColor", "()Ljava/lang/String;", "setIconColor", "(Ljava/lang/String;)V", "iconColorUseTheme", "getIconColorUseTheme", "setIconColorUseTheme", "iconEmissiveStrength", "", "getIconEmissiveStrength", "()Ljava/lang/Double;", "setIconEmissiveStrength", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "iconHaloBlur", "getIconHaloBlur", "setIconHaloBlur", "iconHaloColor", "getIconHaloColor", "setIconHaloColor", "iconHaloColorUseTheme", "getIconHaloColorUseTheme", "setIconHaloColorUseTheme", "iconHaloWidth", "getIconHaloWidth", "setIconHaloWidth", "iconImage", "getIconImage", "setIconImage", "iconImageBitmap", "Landroid/graphics/Bitmap;", "iconImageCrossFade", "getIconImageCrossFade$annotations", "getIconImageCrossFade", "setIconImageCrossFade", "iconOcclusionOpacity", "getIconOcclusionOpacity", "setIconOcclusionOpacity", "iconOffset", "", "getIconOffset", "()Ljava/util/List;", "setIconOffset", "(Ljava/util/List;)V", "iconOpacity", "getIconOpacity", "setIconOpacity", "iconRotate", "getIconRotate", "setIconRotate", "iconSize", "getIconSize", "setIconSize", "iconTextFit", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "getIconTextFit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "setIconTextFit", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;)V", "iconTextFitPadding", "getIconTextFitPadding", "setIconTextFitPadding", "isDraggable", "", "symbolSortKey", "getSymbolSortKey", "setSymbolSortKey", "symbolZOffset", "getSymbolZOffset", "setSymbolZOffset", "textAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "getTextAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "setTextAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;)V", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "getTextColor", "setTextColor", "textColorUseTheme", "getTextColorUseTheme", "setTextColorUseTheme", "textEmissiveStrength", "getTextEmissiveStrength", "setTextEmissiveStrength", "textField", "getTextField", "setTextField", "textHaloBlur", "getTextHaloBlur", "setTextHaloBlur", "textHaloColor", "getTextHaloColor", "setTextHaloColor", "textHaloColorUseTheme", "getTextHaloColorUseTheme", "setTextHaloColorUseTheme", "textHaloWidth", "getTextHaloWidth", "setTextHaloWidth", "textJustify", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "getTextJustify", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "setTextJustify", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;)V", "textLetterSpacing", "getTextLetterSpacing", "setTextLetterSpacing", "textLineHeight", "getTextLineHeight", "setTextLineHeight", "textMaxWidth", "getTextMaxWidth", "setTextMaxWidth", "textOcclusionOpacity", "getTextOcclusionOpacity", "setTextOcclusionOpacity", "textOffset", "getTextOffset", "setTextOffset", "textOpacity", "getTextOpacity", "setTextOpacity", "textRadialOffset", "getTextRadialOffset", "setTextRadialOffset", "textRotate", "getTextRotate", "setTextRotate", "textSize", "getTextSize", "setTextSize", "textTransform", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", "getTextTransform", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", "setTextTransform", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;)V", "build", TtmlNode.ATTR_ID, "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "getData", "getDraggable", "getGeometry", "getPoint", "withData", "jsonElement", "withDraggable", "draggable", "withGeometry", "withIconAnchor", "withIconColor", "", "withIconColorUseTheme", "withIconEmissiveStrength", "withIconHaloBlur", "withIconHaloColor", "withIconHaloColorUseTheme", "withIconHaloWidth", "withIconImage", "withIconImageCrossFade", "withIconOcclusionOpacity", "withIconOffset", "withIconOpacity", "withIconRotate", "withIconSize", "withIconTextFit", "withIconTextFitPadding", "withPoint", "point", "withSymbolSortKey", "withSymbolZOffset", "withTextAnchor", "withTextColor", "withTextColorUseTheme", "withTextEmissiveStrength", "withTextField", "withTextHaloBlur", "withTextHaloColor", "withTextHaloColorUseTheme", "withTextHaloWidth", "withTextJustify", "withTextLetterSpacing", "withTextLineHeight", "withTextMaxWidth", "withTextOcclusionOpacity", "withTextOffset", "withTextOpacity", "withTextRadialOffset", "withTextRotate", "withTextSize", "withTextTransform", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PointAnnotationOptions implements AnnotationOptions<Point, PointAnnotation> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String PROPERTY_ICON_ANCHOR = "icon-anchor";
    public static final String PROPERTY_ICON_COLOR = "icon-color";
    public static final String PROPERTY_ICON_COLOR_USE_THEME = "icon-color-use-theme";
    public static final String PROPERTY_ICON_EMISSIVE_STRENGTH = "icon-emissive-strength";
    public static final String PROPERTY_ICON_HALO_BLUR = "icon-halo-blur";
    public static final String PROPERTY_ICON_HALO_COLOR = "icon-halo-color";
    public static final String PROPERTY_ICON_HALO_COLOR_USE_THEME = "icon-halo-color-use-theme";
    public static final String PROPERTY_ICON_HALO_WIDTH = "icon-halo-width";
    public static final String PROPERTY_ICON_IMAGE = "icon-image";
    public static final String PROPERTY_ICON_IMAGE_CROSS_FADE = "icon-image-cross-fade";
    public static final String PROPERTY_ICON_OCCLUSION_OPACITY = "icon-occlusion-opacity";
    public static final String PROPERTY_ICON_OFFSET = "icon-offset";
    public static final String PROPERTY_ICON_OPACITY = "icon-opacity";
    public static final String PROPERTY_ICON_ROTATE = "icon-rotate";
    public static final String PROPERTY_ICON_SIZE = "icon-size";
    public static final String PROPERTY_ICON_TEXT_FIT = "icon-text-fit";
    public static final String PROPERTY_ICON_TEXT_FIT_PADDING = "icon-text-fit-padding";
    private static final String PROPERTY_IS_DRAGGABLE = "is-draggable";
    public static final String PROPERTY_SYMBOL_SORT_KEY = "symbol-sort-key";
    public static final String PROPERTY_SYMBOL_Z_OFFSET = "symbol-z-offset";
    public static final String PROPERTY_TEXT_ANCHOR = "text-anchor";
    public static final String PROPERTY_TEXT_COLOR = "text-color";
    public static final String PROPERTY_TEXT_COLOR_USE_THEME = "text-color-use-theme";
    public static final String PROPERTY_TEXT_EMISSIVE_STRENGTH = "text-emissive-strength";
    public static final String PROPERTY_TEXT_FIELD = "text-field";
    public static final String PROPERTY_TEXT_HALO_BLUR = "text-halo-blur";
    public static final String PROPERTY_TEXT_HALO_COLOR = "text-halo-color";
    public static final String PROPERTY_TEXT_HALO_COLOR_USE_THEME = "text-halo-color-use-theme";
    public static final String PROPERTY_TEXT_HALO_WIDTH = "text-halo-width";
    public static final String PROPERTY_TEXT_JUSTIFY = "text-justify";
    public static final String PROPERTY_TEXT_LETTER_SPACING = "text-letter-spacing";
    public static final String PROPERTY_TEXT_LINE_HEIGHT = "text-line-height";
    public static final String PROPERTY_TEXT_MAX_WIDTH = "text-max-width";
    public static final String PROPERTY_TEXT_OCCLUSION_OPACITY = "text-occlusion-opacity";
    public static final String PROPERTY_TEXT_OFFSET = "text-offset";
    public static final String PROPERTY_TEXT_OPACITY = "text-opacity";
    public static final String PROPERTY_TEXT_RADIAL_OFFSET = "text-radial-offset";
    public static final String PROPERTY_TEXT_ROTATE = "text-rotate";
    public static final String PROPERTY_TEXT_SIZE = "text-size";
    public static final String PROPERTY_TEXT_TRANSFORM = "text-transform";
    private JsonElement data;
    private Point geometry;
    private IconAnchor iconAnchor;
    private String iconColor;
    private String iconColorUseTheme;
    private Double iconEmissiveStrength;
    private Double iconHaloBlur;
    private String iconHaloColor;
    private String iconHaloColorUseTheme;
    private Double iconHaloWidth;
    private String iconImage;
    private Bitmap iconImageBitmap;
    private Double iconImageCrossFade;
    private Double iconOcclusionOpacity;
    private List<Double> iconOffset;
    private Double iconOpacity;
    private Double iconRotate;
    private Double iconSize;
    private IconTextFit iconTextFit;
    private List<Double> iconTextFitPadding;
    private boolean isDraggable;
    private Double symbolSortKey;
    private Double symbolZOffset;
    private TextAnchor textAnchor;
    private String textColor;
    private String textColorUseTheme;
    private Double textEmissiveStrength;
    private String textField;
    private Double textHaloBlur;
    private String textHaloColor;
    private String textHaloColorUseTheme;
    private Double textHaloWidth;
    private TextJustify textJustify;
    private Double textLetterSpacing;
    private Double textLineHeight;
    private Double textMaxWidth;
    private Double textOcclusionOpacity;
    private List<Double> textOffset;
    private Double textOpacity;
    private Double textRadialOffset;
    private Double textRotate;
    private Double textSize;
    private TextTransform textTransform;

    @e
    public static /* synthetic */ void getIconImageCrossFade$annotations() {
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationOptions
    public PointAnnotation build(String id3, AnnotationManager<Point, PointAnnotation, ?, ?, ?, ?, ?> annotationManager) {
        id3.getClass();
        annotationManager.getClass();
        if (this.geometry == null) {
            throw new MapboxAnnotationException("geometry field is required");
        }
        JsonObject jsonObject = new JsonObject();
        IconAnchor iconAnchor = this.iconAnchor;
        if (iconAnchor != null) {
            jsonObject.addProperty(PROPERTY_ICON_ANCHOR, iconAnchor.getValue());
        }
        String str = this.iconImage;
        if (str != null) {
            jsonObject.addProperty(PROPERTY_ICON_IMAGE, str);
        }
        List<Double> list = this.iconOffset;
        if (list != null) {
            jsonObject.add(PROPERTY_ICON_OFFSET, ConvertUtils.INSTANCE.convertDoubleArray(list));
        }
        Double d14 = this.iconRotate;
        if (d14 != null) {
            p.k(d14, jsonObject, PROPERTY_ICON_ROTATE);
        }
        Double d15 = this.iconSize;
        if (d15 != null) {
            p.k(d15, jsonObject, PROPERTY_ICON_SIZE);
        }
        IconTextFit iconTextFit = this.iconTextFit;
        if (iconTextFit != null) {
            jsonObject.addProperty(PROPERTY_ICON_TEXT_FIT, iconTextFit.getValue());
        }
        List<Double> list2 = this.iconTextFitPadding;
        if (list2 != null) {
            jsonObject.add(PROPERTY_ICON_TEXT_FIT_PADDING, ConvertUtils.INSTANCE.convertDoubleArray(list2));
        }
        Double d16 = this.symbolSortKey;
        if (d16 != null) {
            p.k(d16, jsonObject, PROPERTY_SYMBOL_SORT_KEY);
        }
        TextAnchor textAnchor = this.textAnchor;
        if (textAnchor != null) {
            jsonObject.addProperty(PROPERTY_TEXT_ANCHOR, textAnchor.getValue());
        }
        String str2 = this.textField;
        if (str2 != null) {
            jsonObject.addProperty(PROPERTY_TEXT_FIELD, str2);
        }
        TextJustify textJustify = this.textJustify;
        if (textJustify != null) {
            jsonObject.addProperty(PROPERTY_TEXT_JUSTIFY, textJustify.getValue());
        }
        Double d17 = this.textLetterSpacing;
        if (d17 != null) {
            p.k(d17, jsonObject, PROPERTY_TEXT_LETTER_SPACING);
        }
        Double d18 = this.textLineHeight;
        if (d18 != null) {
            p.k(d18, jsonObject, PROPERTY_TEXT_LINE_HEIGHT);
        }
        Double d19 = this.textMaxWidth;
        if (d19 != null) {
            p.k(d19, jsonObject, PROPERTY_TEXT_MAX_WIDTH);
        }
        List<Double> list3 = this.textOffset;
        if (list3 != null) {
            jsonObject.add(PROPERTY_TEXT_OFFSET, ConvertUtils.INSTANCE.convertDoubleArray(list3));
        }
        Double d24 = this.textRadialOffset;
        if (d24 != null) {
            p.k(d24, jsonObject, PROPERTY_TEXT_RADIAL_OFFSET);
        }
        Double d25 = this.textRotate;
        if (d25 != null) {
            p.k(d25, jsonObject, PROPERTY_TEXT_ROTATE);
        }
        Double d26 = this.textSize;
        if (d26 != null) {
            p.k(d26, jsonObject, PROPERTY_TEXT_SIZE);
        }
        TextTransform textTransform = this.textTransform;
        if (textTransform != null) {
            jsonObject.addProperty(PROPERTY_TEXT_TRANSFORM, textTransform.getValue());
        }
        String str3 = this.iconColor;
        if (str3 != null) {
            jsonObject.addProperty(PROPERTY_ICON_COLOR, str3);
        }
        Double d27 = this.iconEmissiveStrength;
        if (d27 != null) {
            p.k(d27, jsonObject, PROPERTY_ICON_EMISSIVE_STRENGTH);
        }
        Double d28 = this.iconHaloBlur;
        if (d28 != null) {
            p.k(d28, jsonObject, PROPERTY_ICON_HALO_BLUR);
        }
        String str4 = this.iconHaloColor;
        if (str4 != null) {
            jsonObject.addProperty(PROPERTY_ICON_HALO_COLOR, str4);
        }
        Double d29 = this.iconHaloWidth;
        if (d29 != null) {
            p.k(d29, jsonObject, PROPERTY_ICON_HALO_WIDTH);
        }
        Double d34 = this.iconOcclusionOpacity;
        if (d34 != null) {
            p.k(d34, jsonObject, PROPERTY_ICON_OCCLUSION_OPACITY);
        }
        Double d35 = this.iconOpacity;
        if (d35 != null) {
            p.k(d35, jsonObject, PROPERTY_ICON_OPACITY);
        }
        Double d36 = this.symbolZOffset;
        if (d36 != null) {
            p.k(d36, jsonObject, PROPERTY_SYMBOL_Z_OFFSET);
        }
        String str5 = this.textColor;
        if (str5 != null) {
            jsonObject.addProperty(PROPERTY_TEXT_COLOR, str5);
        }
        Double d37 = this.textEmissiveStrength;
        if (d37 != null) {
            p.k(d37, jsonObject, PROPERTY_TEXT_EMISSIVE_STRENGTH);
        }
        Double d38 = this.textHaloBlur;
        if (d38 != null) {
            p.k(d38, jsonObject, PROPERTY_TEXT_HALO_BLUR);
        }
        String str6 = this.textHaloColor;
        if (str6 != null) {
            jsonObject.addProperty(PROPERTY_TEXT_HALO_COLOR, str6);
        }
        Double d39 = this.textHaloWidth;
        if (d39 != null) {
            p.k(d39, jsonObject, PROPERTY_TEXT_HALO_WIDTH);
        }
        Double d44 = this.textOcclusionOpacity;
        if (d44 != null) {
            p.k(d44, jsonObject, PROPERTY_TEXT_OCCLUSION_OPACITY);
        }
        Double d45 = this.textOpacity;
        if (d45 != null) {
            p.k(d45, jsonObject, PROPERTY_TEXT_OPACITY);
        }
        String str7 = this.iconColorUseTheme;
        if (str7 != null) {
            jsonObject.addProperty(PROPERTY_ICON_COLOR_USE_THEME, str7);
        }
        String str8 = this.iconHaloColorUseTheme;
        if (str8 != null) {
            jsonObject.addProperty(PROPERTY_ICON_HALO_COLOR_USE_THEME, str8);
        }
        String str9 = this.textColorUseTheme;
        if (str9 != null) {
            jsonObject.addProperty(PROPERTY_TEXT_COLOR_USE_THEME, str9);
        }
        String str10 = this.textHaloColorUseTheme;
        if (str10 != null) {
            jsonObject.addProperty(PROPERTY_TEXT_HALO_COLOR_USE_THEME, str10);
        }
        Point point = this.geometry;
        point.getClass();
        PointAnnotation pointAnnotation = new PointAnnotation(id3, annotationManager, jsonObject, point);
        Bitmap bitmap = this.iconImageBitmap;
        if (bitmap != null) {
            pointAnnotation.setIconImageBitmap(bitmap);
        }
        pointAnnotation.setDraggable(this.isDraggable);
        pointAnnotation.setData(this.data);
        return pointAnnotation;
    }

    public final JsonElement getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getDraggable, reason: from getter */
    public final boolean getIsDraggable() {
        return this.isDraggable;
    }

    public final Point getGeometry() {
        return this.geometry;
    }

    public final IconAnchor getIconAnchor() {
        return this.iconAnchor;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getIconColorUseTheme() {
        return this.iconColorUseTheme;
    }

    public final Double getIconEmissiveStrength() {
        return this.iconEmissiveStrength;
    }

    public final Double getIconHaloBlur() {
        return this.iconHaloBlur;
    }

    public final String getIconHaloColor() {
        return this.iconHaloColor;
    }

    public final String getIconHaloColorUseTheme() {
        return this.iconHaloColorUseTheme;
    }

    public final Double getIconHaloWidth() {
        return this.iconHaloWidth;
    }

    public final String getIconImage() {
        return this.iconImage;
    }

    public final Double getIconImageCrossFade() {
        return this.iconImageCrossFade;
    }

    public final Double getIconOcclusionOpacity() {
        return this.iconOcclusionOpacity;
    }

    public final List<Double> getIconOffset() {
        return this.iconOffset;
    }

    public final Double getIconOpacity() {
        return this.iconOpacity;
    }

    public final Double getIconRotate() {
        return this.iconRotate;
    }

    public final Double getIconSize() {
        return this.iconSize;
    }

    public final IconTextFit getIconTextFit() {
        return this.iconTextFit;
    }

    public final List<Double> getIconTextFitPadding() {
        return this.iconTextFitPadding;
    }

    public final Point getPoint() {
        return this.geometry;
    }

    public final Double getSymbolSortKey() {
        return this.symbolSortKey;
    }

    public final Double getSymbolZOffset() {
        return this.symbolZOffset;
    }

    public final TextAnchor getTextAnchor() {
        return this.textAnchor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTextColorUseTheme() {
        return this.textColorUseTheme;
    }

    public final Double getTextEmissiveStrength() {
        return this.textEmissiveStrength;
    }

    public final String getTextField() {
        return this.textField;
    }

    public final Double getTextHaloBlur() {
        return this.textHaloBlur;
    }

    public final String getTextHaloColor() {
        return this.textHaloColor;
    }

    public final String getTextHaloColorUseTheme() {
        return this.textHaloColorUseTheme;
    }

    public final Double getTextHaloWidth() {
        return this.textHaloWidth;
    }

    public final TextJustify getTextJustify() {
        return this.textJustify;
    }

    public final Double getTextLetterSpacing() {
        return this.textLetterSpacing;
    }

    public final Double getTextLineHeight() {
        return this.textLineHeight;
    }

    public final Double getTextMaxWidth() {
        return this.textMaxWidth;
    }

    public final Double getTextOcclusionOpacity() {
        return this.textOcclusionOpacity;
    }

    public final List<Double> getTextOffset() {
        return this.textOffset;
    }

    public final Double getTextOpacity() {
        return this.textOpacity;
    }

    public final Double getTextRadialOffset() {
        return this.textRadialOffset;
    }

    public final Double getTextRotate() {
        return this.textRotate;
    }

    public final Double getTextSize() {
        return this.textSize;
    }

    public final TextTransform getTextTransform() {
        return this.textTransform;
    }

    public final void setIconAnchor(IconAnchor iconAnchor) {
        this.iconAnchor = iconAnchor;
    }

    public final void setIconColor(String str) {
        this.iconColor = str;
    }

    public final void setIconColorUseTheme(String str) {
        this.iconColorUseTheme = str;
    }

    public final void setIconEmissiveStrength(Double d14) {
        this.iconEmissiveStrength = d14;
    }

    public final void setIconHaloBlur(Double d14) {
        this.iconHaloBlur = d14;
    }

    public final void setIconHaloColor(String str) {
        this.iconHaloColor = str;
    }

    public final void setIconHaloColorUseTheme(String str) {
        this.iconHaloColorUseTheme = str;
    }

    public final void setIconHaloWidth(Double d14) {
        this.iconHaloWidth = d14;
    }

    public final void setIconImage(String str) {
        this.iconImage = str;
    }

    public final void setIconImageCrossFade(Double d14) {
        this.iconImageCrossFade = d14;
    }

    public final void setIconOcclusionOpacity(Double d14) {
        this.iconOcclusionOpacity = d14;
    }

    public final void setIconOffset(List<Double> list) {
        this.iconOffset = list;
    }

    public final void setIconOpacity(Double d14) {
        this.iconOpacity = d14;
    }

    public final void setIconRotate(Double d14) {
        this.iconRotate = d14;
    }

    public final void setIconSize(Double d14) {
        this.iconSize = d14;
    }

    public final void setIconTextFit(IconTextFit iconTextFit) {
        this.iconTextFit = iconTextFit;
    }

    public final void setIconTextFitPadding(List<Double> list) {
        this.iconTextFitPadding = list;
    }

    public final void setSymbolSortKey(Double d14) {
        this.symbolSortKey = d14;
    }

    public final void setSymbolZOffset(Double d14) {
        this.symbolZOffset = d14;
    }

    public final void setTextAnchor(TextAnchor textAnchor) {
        this.textAnchor = textAnchor;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public final void setTextColorUseTheme(String str) {
        this.textColorUseTheme = str;
    }

    public final void setTextEmissiveStrength(Double d14) {
        this.textEmissiveStrength = d14;
    }

    public final void setTextField(String str) {
        this.textField = str;
    }

    public final void setTextHaloBlur(Double d14) {
        this.textHaloBlur = d14;
    }

    public final void setTextHaloColor(String str) {
        this.textHaloColor = str;
    }

    public final void setTextHaloColorUseTheme(String str) {
        this.textHaloColorUseTheme = str;
    }

    public final void setTextHaloWidth(Double d14) {
        this.textHaloWidth = d14;
    }

    public final void setTextJustify(TextJustify textJustify) {
        this.textJustify = textJustify;
    }

    public final void setTextLetterSpacing(Double d14) {
        this.textLetterSpacing = d14;
    }

    public final void setTextLineHeight(Double d14) {
        this.textLineHeight = d14;
    }

    public final void setTextMaxWidth(Double d14) {
        this.textMaxWidth = d14;
    }

    public final void setTextOcclusionOpacity(Double d14) {
        this.textOcclusionOpacity = d14;
    }

    public final void setTextOffset(List<Double> list) {
        this.textOffset = list;
    }

    public final void setTextOpacity(Double d14) {
        this.textOpacity = d14;
    }

    public final void setTextRadialOffset(Double d14) {
        this.textRadialOffset = d14;
    }

    public final void setTextRotate(Double d14) {
        this.textRotate = d14;
    }

    public final void setTextSize(Double d14) {
        this.textSize = d14;
    }

    public final void setTextTransform(TextTransform textTransform) {
        this.textTransform = textTransform;
    }

    public final PointAnnotationOptions withData(JsonElement jsonElement) {
        jsonElement.getClass();
        this.data = jsonElement;
        return this;
    }

    public final PointAnnotationOptions withDraggable(boolean draggable) {
        this.isDraggable = draggable;
        return this;
    }

    public final PointAnnotationOptions withGeometry(Point geometry) {
        geometry.getClass();
        this.geometry = geometry;
        return this;
    }

    public final PointAnnotationOptions withIconAnchor(IconAnchor iconAnchor) {
        iconAnchor.getClass();
        this.iconAnchor = iconAnchor;
        return this;
    }

    public final PointAnnotationOptions withIconColor(int iconColor) {
        this.iconColor = ColorUtils.INSTANCE.colorToRgbaString(iconColor);
        return this;
    }

    public final PointAnnotationOptions withIconColorUseTheme(String iconColorUseTheme) {
        iconColorUseTheme.getClass();
        this.iconColorUseTheme = iconColorUseTheme;
        return this;
    }

    public final PointAnnotationOptions withIconEmissiveStrength(double iconEmissiveStrength) {
        this.iconEmissiveStrength = Double.valueOf(iconEmissiveStrength);
        return this;
    }

    public final PointAnnotationOptions withIconHaloBlur(double iconHaloBlur) {
        this.iconHaloBlur = Double.valueOf(iconHaloBlur);
        return this;
    }

    public final PointAnnotationOptions withIconHaloColor(int iconHaloColor) {
        this.iconHaloColor = ColorUtils.INSTANCE.colorToRgbaString(iconHaloColor);
        return this;
    }

    public final PointAnnotationOptions withIconHaloColorUseTheme(String iconHaloColorUseTheme) {
        iconHaloColorUseTheme.getClass();
        this.iconHaloColorUseTheme = iconHaloColorUseTheme;
        return this;
    }

    public final PointAnnotationOptions withIconHaloWidth(double iconHaloWidth) {
        this.iconHaloWidth = Double.valueOf(iconHaloWidth);
        return this;
    }

    public final PointAnnotationOptions withIconImage(Bitmap iconImageBitmap) {
        iconImageBitmap.getClass();
        this.iconImageBitmap = iconImageBitmap;
        return this;
    }

    @e
    public final PointAnnotationOptions withIconImageCrossFade(double iconImageCrossFade) {
        this.iconImageCrossFade = Double.valueOf(iconImageCrossFade);
        return this;
    }

    public final PointAnnotationOptions withIconOcclusionOpacity(double iconOcclusionOpacity) {
        this.iconOcclusionOpacity = Double.valueOf(iconOcclusionOpacity);
        return this;
    }

    public final PointAnnotationOptions withIconOffset(List<Double> iconOffset) {
        iconOffset.getClass();
        this.iconOffset = iconOffset;
        return this;
    }

    public final PointAnnotationOptions withIconOpacity(double iconOpacity) {
        this.iconOpacity = Double.valueOf(iconOpacity);
        return this;
    }

    public final PointAnnotationOptions withIconRotate(double iconRotate) {
        this.iconRotate = Double.valueOf(iconRotate);
        return this;
    }

    public final PointAnnotationOptions withIconSize(double iconSize) {
        this.iconSize = Double.valueOf(iconSize);
        return this;
    }

    public final PointAnnotationOptions withIconTextFit(IconTextFit iconTextFit) {
        iconTextFit.getClass();
        this.iconTextFit = iconTextFit;
        return this;
    }

    public final PointAnnotationOptions withIconTextFitPadding(List<Double> iconTextFitPadding) {
        iconTextFitPadding.getClass();
        this.iconTextFitPadding = iconTextFitPadding;
        return this;
    }

    public final PointAnnotationOptions withPoint(Point point) {
        point.getClass();
        this.geometry = point;
        return this;
    }

    public final PointAnnotationOptions withSymbolSortKey(double symbolSortKey) {
        this.symbolSortKey = Double.valueOf(symbolSortKey);
        return this;
    }

    public final PointAnnotationOptions withSymbolZOffset(double symbolZOffset) {
        this.symbolZOffset = Double.valueOf(symbolZOffset);
        return this;
    }

    public final PointAnnotationOptions withTextAnchor(TextAnchor textAnchor) {
        textAnchor.getClass();
        this.textAnchor = textAnchor;
        return this;
    }

    public final PointAnnotationOptions withTextColor(int textColor) {
        this.textColor = ColorUtils.INSTANCE.colorToRgbaString(textColor);
        return this;
    }

    public final PointAnnotationOptions withTextColorUseTheme(String textColorUseTheme) {
        textColorUseTheme.getClass();
        this.textColorUseTheme = textColorUseTheme;
        return this;
    }

    public final PointAnnotationOptions withTextEmissiveStrength(double textEmissiveStrength) {
        this.textEmissiveStrength = Double.valueOf(textEmissiveStrength);
        return this;
    }

    public final PointAnnotationOptions withTextField(String textField) {
        textField.getClass();
        this.textField = textField;
        return this;
    }

    public final PointAnnotationOptions withTextHaloBlur(double textHaloBlur) {
        this.textHaloBlur = Double.valueOf(textHaloBlur);
        return this;
    }

    public final PointAnnotationOptions withTextHaloColor(int textHaloColor) {
        this.textHaloColor = ColorUtils.INSTANCE.colorToRgbaString(textHaloColor);
        return this;
    }

    public final PointAnnotationOptions withTextHaloColorUseTheme(String textHaloColorUseTheme) {
        textHaloColorUseTheme.getClass();
        this.textHaloColorUseTheme = textHaloColorUseTheme;
        return this;
    }

    public final PointAnnotationOptions withTextHaloWidth(double textHaloWidth) {
        this.textHaloWidth = Double.valueOf(textHaloWidth);
        return this;
    }

    public final PointAnnotationOptions withTextJustify(TextJustify textJustify) {
        textJustify.getClass();
        this.textJustify = textJustify;
        return this;
    }

    public final PointAnnotationOptions withTextLetterSpacing(double textLetterSpacing) {
        this.textLetterSpacing = Double.valueOf(textLetterSpacing);
        return this;
    }

    public final PointAnnotationOptions withTextLineHeight(double textLineHeight) {
        this.textLineHeight = Double.valueOf(textLineHeight);
        return this;
    }

    public final PointAnnotationOptions withTextMaxWidth(double textMaxWidth) {
        this.textMaxWidth = Double.valueOf(textMaxWidth);
        return this;
    }

    public final PointAnnotationOptions withTextOcclusionOpacity(double textOcclusionOpacity) {
        this.textOcclusionOpacity = Double.valueOf(textOcclusionOpacity);
        return this;
    }

    public final PointAnnotationOptions withTextOffset(List<Double> textOffset) {
        textOffset.getClass();
        this.textOffset = textOffset;
        return this;
    }

    public final PointAnnotationOptions withTextOpacity(double textOpacity) {
        this.textOpacity = Double.valueOf(textOpacity);
        return this;
    }

    public final PointAnnotationOptions withTextRadialOffset(double textRadialOffset) {
        this.textRadialOffset = Double.valueOf(textRadialOffset);
        return this;
    }

    public final PointAnnotationOptions withTextRotate(double textRotate) {
        this.textRotate = Double.valueOf(textRotate);
        return this;
    }

    public final PointAnnotationOptions withTextSize(double textSize) {
        this.textSize = Double.valueOf(textSize);
        return this;
    }

    public final PointAnnotationOptions withTextTransform(TextTransform textTransform) {
        textTransform.getClass();
        this.textTransform = textTransform;
        return this;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationOptions$Companion;", "", "()V", "PROPERTY_ICON_ANCHOR", "", "PROPERTY_ICON_COLOR", "PROPERTY_ICON_COLOR_USE_THEME", "PROPERTY_ICON_EMISSIVE_STRENGTH", "PROPERTY_ICON_HALO_BLUR", "PROPERTY_ICON_HALO_COLOR", "PROPERTY_ICON_HALO_COLOR_USE_THEME", "PROPERTY_ICON_HALO_WIDTH", "PROPERTY_ICON_IMAGE", "PROPERTY_ICON_IMAGE_CROSS_FADE", "PROPERTY_ICON_OCCLUSION_OPACITY", "PROPERTY_ICON_OFFSET", "PROPERTY_ICON_OPACITY", "PROPERTY_ICON_ROTATE", "PROPERTY_ICON_SIZE", "PROPERTY_ICON_TEXT_FIT", "PROPERTY_ICON_TEXT_FIT_PADDING", "PROPERTY_IS_DRAGGABLE", "PROPERTY_SYMBOL_SORT_KEY", "PROPERTY_SYMBOL_Z_OFFSET", "PROPERTY_TEXT_ANCHOR", "PROPERTY_TEXT_COLOR", "PROPERTY_TEXT_COLOR_USE_THEME", "PROPERTY_TEXT_EMISSIVE_STRENGTH", "PROPERTY_TEXT_FIELD", "PROPERTY_TEXT_HALO_BLUR", "PROPERTY_TEXT_HALO_COLOR", "PROPERTY_TEXT_HALO_COLOR_USE_THEME", "PROPERTY_TEXT_HALO_WIDTH", "PROPERTY_TEXT_JUSTIFY", "PROPERTY_TEXT_LETTER_SPACING", "PROPERTY_TEXT_LINE_HEIGHT", "PROPERTY_TEXT_MAX_WIDTH", "PROPERTY_TEXT_OCCLUSION_OPACITY", "PROPERTY_TEXT_OFFSET", "PROPERTY_TEXT_OPACITY", "PROPERTY_TEXT_RADIAL_OFFSET", "PROPERTY_TEXT_ROTATE", "PROPERTY_TEXT_SIZE", "PROPERTY_TEXT_TRANSFORM", "fromFeature", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationOptions;", "feature", "Lcom/mapbox/geojson/Feature;", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final PointAnnotationOptions fromFeature(Feature feature) {
            feature.getClass();
            if (feature.geometry() == null) {
                throw new MapboxAnnotationException("geometry field is required");
            }
            if (!(feature.geometry() instanceof Point)) {
                return null;
            }
            PointAnnotationOptions pointAnnotationOptions = new PointAnnotationOptions();
            Geometry geometry = feature.geometry();
            geometry.getClass();
            pointAnnotationOptions.geometry = (Point) geometry;
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_ANCHOR)) {
                IconAnchor.Companion companion = IconAnchor.INSTANCE;
                String asString = feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_ANCHOR).getAsString();
                asString.getClass();
                pointAnnotationOptions.setIconAnchor(companion.valueOf(asString));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_IMAGE)) {
                pointAnnotationOptions.setIconImage(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_IMAGE).getAsString());
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_OFFSET)) {
                pointAnnotationOptions.setIconOffset(ConvertUtils.INSTANCE.toDoubleArray(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_OFFSET).getAsJsonArray()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_ROTATE)) {
                pointAnnotationOptions.setIconRotate(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_ROTATE).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_SIZE)) {
                pointAnnotationOptions.setIconSize(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_SIZE).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT)) {
                IconTextFit.Companion companion2 = IconTextFit.INSTANCE;
                String asString2 = feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT).getAsString();
                asString2.getClass();
                pointAnnotationOptions.setIconTextFit(companion2.valueOf(asString2));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING)) {
                pointAnnotationOptions.setIconTextFitPadding(ConvertUtils.INSTANCE.toDoubleArray(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING).getAsJsonArray()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY)) {
                pointAnnotationOptions.setSymbolSortKey(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR)) {
                TextAnchor.Companion companion3 = TextAnchor.INSTANCE;
                String asString3 = feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR).getAsString();
                asString3.getClass();
                pointAnnotationOptions.setTextAnchor(companion3.valueOf(asString3));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_FIELD)) {
                pointAnnotationOptions.setTextField(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_FIELD).getAsString());
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY)) {
                TextJustify.Companion companion4 = TextJustify.INSTANCE;
                String asString4 = feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY).getAsString();
                asString4.getClass();
                pointAnnotationOptions.setTextJustify(companion4.valueOf(asString4));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING)) {
                pointAnnotationOptions.setTextLetterSpacing(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT)) {
                pointAnnotationOptions.setTextLineHeight(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH)) {
                pointAnnotationOptions.setTextMaxWidth(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_OFFSET)) {
                pointAnnotationOptions.setTextOffset(ConvertUtils.INSTANCE.toDoubleArray(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_OFFSET).getAsJsonArray()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET)) {
                pointAnnotationOptions.setTextRadialOffset(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_ROTATE)) {
                pointAnnotationOptions.setTextRotate(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_ROTATE).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_SIZE)) {
                pointAnnotationOptions.setTextSize(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_SIZE).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM)) {
                TextTransform.Companion companion5 = TextTransform.INSTANCE;
                String asString5 = feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM).getAsString();
                asString5.getClass();
                pointAnnotationOptions.setTextTransform(companion5.valueOf(asString5));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR)) {
                pointAnnotationOptions.setIconColor(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR).getAsString());
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH)) {
                pointAnnotationOptions.setIconEmissiveStrength(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR)) {
                pointAnnotationOptions.setIconHaloBlur(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR)) {
                pointAnnotationOptions.setIconHaloColor(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR).getAsString());
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH)) {
                pointAnnotationOptions.setIconHaloWidth(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY)) {
                pointAnnotationOptions.setIconOcclusionOpacity(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_OPACITY)) {
                pointAnnotationOptions.setIconOpacity(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_OPACITY).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET)) {
                pointAnnotationOptions.setSymbolZOffset(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR)) {
                pointAnnotationOptions.setTextColor(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR).getAsString());
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH)) {
                pointAnnotationOptions.setTextEmissiveStrength(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR)) {
                pointAnnotationOptions.setTextHaloBlur(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR)) {
                pointAnnotationOptions.setTextHaloColor(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR).getAsString());
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH)) {
                pointAnnotationOptions.setTextHaloWidth(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY)) {
                pointAnnotationOptions.setTextOcclusionOpacity(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_OPACITY)) {
                pointAnnotationOptions.setTextOpacity(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_OPACITY).getAsDouble()));
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME)) {
                pointAnnotationOptions.setIconColorUseTheme(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME)) {
                pointAnnotationOptions.setIconHaloColorUseTheme(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME)) {
                pointAnnotationOptions.setTextColorUseTheme(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME)) {
                pointAnnotationOptions.setTextHaloColorUseTheme(feature.getProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_IS_DRAGGABLE)) {
                pointAnnotationOptions.isDraggable = feature.getProperty(PointAnnotationOptions.PROPERTY_IS_DRAGGABLE).getAsBoolean();
            }
            if (feature.hasProperty(PointAnnotationOptions.PROPERTY_ICON_IMAGE_CROSS_FADE)) {
                pointAnnotationOptions.setIconImageCrossFade(Double.valueOf(feature.getProperty(PointAnnotationOptions.PROPERTY_ICON_IMAGE_CROSS_FADE).getAsDouble()));
            }
            return pointAnnotationOptions;
        }

        private Companion() {
        }
    }

    public final PointAnnotationOptions withIconImage(String iconImage) {
        iconImage.getClass();
        this.iconImage = iconImage;
        return this;
    }

    public final PointAnnotationOptions withIconColor(String iconColor) {
        iconColor.getClass();
        this.iconColor = iconColor;
        return this;
    }

    public final PointAnnotationOptions withIconHaloColor(String iconHaloColor) {
        iconHaloColor.getClass();
        this.iconHaloColor = iconHaloColor;
        return this;
    }

    public final PointAnnotationOptions withTextColor(String textColor) {
        textColor.getClass();
        this.textColor = textColor;
        return this;
    }

    public final PointAnnotationOptions withTextHaloColor(String textHaloColor) {
        textHaloColor.getClass();
        this.textHaloColor = textHaloColor;
        return this;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationOptions
    public /* bridge */ /* synthetic */ Annotation build(String str, AnnotationManager annotationManager) {
        return build(str, (AnnotationManager<Point, PointAnnotation, ?, ?, ?, ?, ?>) annotationManager);
    }
}
