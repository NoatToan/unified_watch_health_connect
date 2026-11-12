package com.mapbox.maps.extension.style.layers.generated;

import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
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
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.Formatted;
import com.mapbox.maps.extension.style.types.LayersDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\tJ\u0019\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\tJ\u0019\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0011H&¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\tJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0007H&¢\u0006\u0004\b\u0018\u0010\tJ\u0019\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0011H&¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\tJ\u001f\u0010\u001b\u001a\u00020\u00042\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0007H&¢\u0006\u0004\b\u001b\u0010\tJ\u0019\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0011H&¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007H&¢\u0006\u0004\b\u001d\u0010\tJ\u0019\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\tJ\u0019\u0010 \u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0007H&¢\u0006\u0004\b \u0010\tJ\u0019\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\rH&¢\u0006\u0004\b\"\u0010\u000fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H&¢\u0006\u0004\b\"\u0010\tJ\u0019\u0010$\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b$\u0010%J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007H&¢\u0006\u0004\b$\u0010\tJ\u0019\u0010&\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\rH&¢\u0006\u0004\b&\u0010\u000fJ\u0017\u0010&\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H&¢\u0006\u0004\b&\u0010\tJ\u001f\u0010'\u001a\u00020\u00042\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH'¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0007H'¢\u0006\u0004\b'\u0010\tJ\u0019\u0010)\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0007H&¢\u0006\u0004\b)\u0010\tJ\u001f\u0010+\u001a\u00020\u00042\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH&¢\u0006\u0004\b+\u0010\u001cJ\u0017\u0010+\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0007H&¢\u0006\u0004\b+\u0010\tJ\u0019\u0010,\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0011H&¢\u0006\u0004\b,\u0010\u0013J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0007H&¢\u0006\u0004\b,\u0010\tJ\u0019\u0010.\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020-H'¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0007H'¢\u0006\u0004\b.\u0010\tJ\u0019\u00101\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u000200H&¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0007H&¢\u0006\u0004\b1\u0010\tJ\u0017\u00103\u001a\u00020\u00042\u0006\u00103\u001a\u00020\rH&¢\u0006\u0004\b3\u0010\u000fJ\u0017\u00103\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0007H&¢\u0006\u0004\b3\u0010\tJ\u0019\u00104\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\rH&¢\u0006\u0004\b4\u0010\u000fJ\u0017\u00104\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0007H&¢\u0006\u0004\b4\u0010\tJ\u0019\u00105\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u0011H&¢\u0006\u0004\b5\u0010\u0013J\u0017\u00105\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0007H&¢\u0006\u0004\b5\u0010\tJ\u0019\u00107\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u000206H&¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0007H&¢\u0006\u0004\b7\u0010\tJ\u0019\u00109\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u0011H&¢\u0006\u0004\b9\u0010\u0013J\u0017\u00109\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0007H&¢\u0006\u0004\b9\u0010\tJ\u0019\u0010;\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0007H&¢\u0006\u0004\b;\u0010\tJ\u0017\u0010>\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=H&¢\u0006\u0004\b>\u0010?J\u0017\u0010>\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0007H&¢\u0006\u0004\b>\u0010\tJ\u0017\u0010>\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0002H&¢\u0006\u0004\b>\u0010\u0005J#\u0010>\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\b>\u0010CJ\u001f\u0010D\u001a\u00020\u00042\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&¢\u0006\u0004\bD\u0010\u001cJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0007H&¢\u0006\u0004\bD\u0010\tJ\u0019\u0010E\u001a\u00020\u00042\b\b\u0002\u0010E\u001a\u00020\u0011H&¢\u0006\u0004\bE\u0010\u0013J\u0017\u0010E\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u0007H&¢\u0006\u0004\bE\u0010\tJ\u0019\u0010G\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020FH&¢\u0006\u0004\bG\u0010HJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0007H&¢\u0006\u0004\bG\u0010\tJ\u0019\u0010I\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0011H&¢\u0006\u0004\bI\u0010\u0013J\u0017\u0010I\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0007H&¢\u0006\u0004\bI\u0010\tJ\u0019\u0010J\u001a\u00020\u00042\b\b\u0002\u0010J\u001a\u00020\rH&¢\u0006\u0004\bJ\u0010\u000fJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0007H&¢\u0006\u0004\bJ\u0010\tJ\u0019\u0010K\u001a\u00020\u00042\b\b\u0002\u0010K\u001a\u00020\rH&¢\u0006\u0004\bK\u0010\u000fJ\u0017\u0010K\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0007H&¢\u0006\u0004\bK\u0010\tJ\u0019\u0010L\u001a\u00020\u00042\b\b\u0002\u0010L\u001a\u00020\rH&¢\u0006\u0004\bL\u0010\u000fJ\u0017\u0010L\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0007H&¢\u0006\u0004\bL\u0010\tJ\u0019\u0010M\u001a\u00020\u00042\b\b\u0002\u0010M\u001a\u00020\rH&¢\u0006\u0004\bM\u0010\u000fJ\u0017\u0010M\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0007H&¢\u0006\u0004\bM\u0010\tJ\u001f\u0010N\u001a\u00020\u00042\u000e\b\u0002\u0010N\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH&¢\u0006\u0004\bN\u0010\u001cJ\u0017\u0010N\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0007H&¢\u0006\u0004\bN\u0010\tJ\u0019\u0010O\u001a\u00020\u00042\b\b\u0002\u0010O\u001a\u00020\u0011H&¢\u0006\u0004\bO\u0010\u0013J\u0017\u0010O\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0007H&¢\u0006\u0004\bO\u0010\tJ\u0019\u0010P\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\rH&¢\u0006\u0004\bP\u0010\u000fJ\u0017\u0010P\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0007H&¢\u0006\u0004\bP\u0010\tJ\u0019\u0010R\u001a\u00020\u00042\b\b\u0002\u0010R\u001a\u00020QH&¢\u0006\u0004\bR\u0010SJ\u0017\u0010R\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0007H&¢\u0006\u0004\bR\u0010\tJ\u0019\u0010T\u001a\u00020\u00042\b\b\u0002\u0010T\u001a\u00020\rH&¢\u0006\u0004\bT\u0010\u000fJ\u0017\u0010T\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0007H&¢\u0006\u0004\bT\u0010\tJ\u0019\u0010U\u001a\u00020\u00042\b\b\u0002\u0010U\u001a\u00020\rH&¢\u0006\u0004\bU\u0010\u000fJ\u0017\u0010U\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u0007H&¢\u0006\u0004\bU\u0010\tJ\u0019\u0010W\u001a\u00020\u00042\b\b\u0002\u0010W\u001a\u00020VH&¢\u0006\u0004\bW\u0010XJ\u0017\u0010W\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u0007H&¢\u0006\u0004\bW\u0010\tJ\u0019\u0010Y\u001a\u00020\u00042\b\b\u0002\u0010Y\u001a\u00020\rH&¢\u0006\u0004\bY\u0010\u000fJ\u0017\u0010Y\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0007H&¢\u0006\u0004\bY\u0010\tJ\u001f\u0010Z\u001a\u00020\u00042\u000e\b\u0002\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH'¢\u0006\u0004\bZ\u0010\u001cJ\u0017\u0010Z\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0007H'¢\u0006\u0004\bZ\u0010\tJ\u0019\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020[H&¢\u0006\u0004\b\\\u0010]J\u0017\u0010\\\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u0007H&¢\u0006\u0004\b\\\u0010\tJ\u001d\u0010^\u001a\u00020\u00042\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&¢\u0006\u0004\b^\u0010\u001cJ\u0017\u0010^\u001a\u00020\u00042\u0006\u0010^\u001a\u00020\u0007H&¢\u0006\u0004\b^\u0010\tJ\u001d\u0010_\u001a\u00020\u00042\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&¢\u0006\u0004\b_\u0010\u001cJ\u0017\u0010_\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u0007H&¢\u0006\u0004\b_\u0010\tJ\u0019\u0010`\u001a\u00020\u00042\b\b\u0002\u0010`\u001a\u00020\u0002H&¢\u0006\u0004\b`\u0010\u0005J\u0017\u0010`\u001a\u00020\u00042\u0006\u0010`\u001a\u00020\u0007H&¢\u0006\u0004\b`\u0010\tJ\u0019\u0010`\u001a\u00020\u00042\b\b\u0001\u0010`\u001a\u00020aH&¢\u0006\u0004\b`\u0010bJ\u0017\u0010e\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0004\be\u0010fJ#\u0010e\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\be\u0010CJ\u0017\u0010h\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u0002H'¢\u0006\u0004\bh\u0010\u0005J\u0017\u0010h\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u0007H'¢\u0006\u0004\bh\u0010\tJ\u0019\u0010i\u001a\u00020\u00042\b\b\u0002\u0010i\u001a\u00020\rH&¢\u0006\u0004\bi\u0010\u000fJ\u0017\u0010i\u001a\u00020\u00042\u0006\u0010i\u001a\u00020\u0007H&¢\u0006\u0004\bi\u0010\tJ\u0017\u0010j\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0004\bj\u0010fJ#\u0010j\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\bj\u0010CJ\u0019\u0010k\u001a\u00020\u00042\b\b\u0002\u0010k\u001a\u00020\rH&¢\u0006\u0004\bk\u0010\u000fJ\u0017\u0010k\u001a\u00020\u00042\u0006\u0010k\u001a\u00020\u0007H&¢\u0006\u0004\bk\u0010\tJ\u0017\u0010l\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0004\bl\u0010fJ#\u0010l\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\bl\u0010CJ\u0019\u0010m\u001a\u00020\u00042\b\b\u0002\u0010m\u001a\u00020\rH&¢\u0006\u0004\bm\u0010\u000fJ\u0017\u0010m\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u0007H&¢\u0006\u0004\bm\u0010\tJ\u0017\u0010n\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0004\bn\u0010fJ#\u0010n\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\bn\u0010CJ\u0019\u0010o\u001a\u00020\u00042\b\b\u0002\u0010o\u001a\u00020\u0002H&¢\u0006\u0004\bo\u0010\u0005J\u0017\u0010o\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u0007H&¢\u0006\u0004\bo\u0010\tJ\u0019\u0010o\u001a\u00020\u00042\b\b\u0001\u0010o\u001a\u00020aH&¢\u0006\u0004\bo\u0010bJ\u0017\u0010p\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0004\bp\u0010fJ#\u0010p\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\bp\u0010CJ\u0017\u0010q\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0002H'¢\u0006\u0004\bq\u0010\u0005J\u0017\u0010q\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0007H'¢\u0006\u0004\bq\u0010\tJ\u0019\u0010r\u001a\u00020\u00042\b\b\u0002\u0010r\u001a\u00020\rH&¢\u0006\u0004\br\u0010\u000fJ\u0017\u0010r\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0007H&¢\u0006\u0004\br\u0010\tJ\u0017\u0010s\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0004\bs\u0010fJ#\u0010s\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\bs\u0010CJ\u0019\u0010t\u001a\u00020\u00042\b\b\u0002\u0010t\u001a\u00020\rH&¢\u0006\u0004\bt\u0010\u000fJ\u0017\u0010t\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u0007H&¢\u0006\u0004\bt\u0010\tJ\u0017\u0010u\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0004\bu\u0010fJ#\u0010u\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\bu\u0010CJ\u0019\u0010v\u001a\u00020\u00042\b\b\u0002\u0010v\u001a\u00020\rH&¢\u0006\u0004\bv\u0010\u000fJ\u0017\u0010v\u001a\u00020\u00042\u0006\u0010v\u001a\u00020\u0007H&¢\u0006\u0004\bv\u0010\tJ\u0017\u0010w\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0004\bw\u0010fJ#\u0010w\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\bw\u0010CJ\u0019\u0010x\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\rH&¢\u0006\u0004\bx\u0010\u000fJ\u0017\u0010x\u001a\u00020\u00042\u0006\u0010x\u001a\u00020\u0007H&¢\u0006\u0004\bx\u0010\tJ\u0017\u0010y\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0004\by\u0010fJ#\u0010y\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\by\u0010CJ\u001f\u0010z\u001a\u00020\u00042\u000e\b\u0002\u0010z\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH&¢\u0006\u0004\bz\u0010\u001cJ\u0017\u0010z\u001a\u00020\u00042\u0006\u0010z\u001a\u00020\u0007H&¢\u0006\u0004\bz\u0010\tJ\u0017\u0010{\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0004\b{\u0010fJ#\u0010{\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0004\b{\u0010CJ\u0019\u0010}\u001a\u00020\u00042\b\b\u0002\u0010}\u001a\u00020|H&¢\u0006\u0004\b}\u0010~J\u0017\u0010}\u001a\u00020\u00042\u0006\u0010}\u001a\u00020\u0007H&¢\u0006\u0004\b}\u0010\tJ\u0019\u0010\u007f\u001a\u00020\u00042\b\b\u0002\u0010\u007f\u001a\u00020\rH'¢\u0006\u0004\b\u007f\u0010\u000fJ\u0017\u0010\u007f\u001a\u00020\u00042\u0006\u0010\u007f\u001a\u00020\u0007H'¢\u0006\u0004\b\u007f\u0010\tJ\u0019\u0010\u0080\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH'¢\u0006\u0005\b\u0080\u0001\u0010fJ%\u0010\u0080\u0001\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H'¢\u0006\u0005\b\u0080\u0001\u0010CJ\u001c\u0010\u0081\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u0002H&¢\u0006\u0005\b\u0081\u0001\u0010\u0005J\u001a\u0010\u0081\u0001\u001a\u00020\u00042\u0007\u0010\u0081\u0001\u001a\u00020\u0007H&¢\u0006\u0005\b\u0081\u0001\u0010\tJ\u001c\u0010\u0081\u0001\u001a\u00020\u00042\t\b\u0001\u0010\u0081\u0001\u001a\u00020aH&¢\u0006\u0005\b\u0081\u0001\u0010bJ\u0019\u0010\u0082\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0005\b\u0082\u0001\u0010fJ%\u0010\u0082\u0001\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0005\b\u0082\u0001\u0010CJ\u001a\u0010\u0083\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b\u0083\u0001\u0010\u0005J\u001a\u0010\u0083\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u0007H'¢\u0006\u0005\b\u0083\u0001\u0010\tJ\u001c\u0010\u0084\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0084\u0001\u001a\u00020\rH&¢\u0006\u0005\b\u0084\u0001\u0010\u000fJ\u001a\u0010\u0084\u0001\u001a\u00020\u00042\u0007\u0010\u0084\u0001\u001a\u00020\u0007H&¢\u0006\u0005\b\u0084\u0001\u0010\tJ\u0019\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0005\b\u0085\u0001\u0010fJ%\u0010\u0085\u0001\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0005\b\u0085\u0001\u0010CJ\u001c\u0010\u0086\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0086\u0001\u001a\u00020\rH&¢\u0006\u0005\b\u0086\u0001\u0010\u000fJ\u001a\u0010\u0086\u0001\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00020\u0007H&¢\u0006\u0005\b\u0086\u0001\u0010\tJ\u0019\u0010\u0087\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0005\b\u0087\u0001\u0010fJ%\u0010\u0087\u0001\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0005\b\u0087\u0001\u0010CJ\u001c\u0010\u0088\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0088\u0001\u001a\u00020\u0002H&¢\u0006\u0005\b\u0088\u0001\u0010\u0005J\u001a\u0010\u0088\u0001\u001a\u00020\u00042\u0007\u0010\u0088\u0001\u001a\u00020\u0007H&¢\u0006\u0005\b\u0088\u0001\u0010\tJ\u001c\u0010\u0088\u0001\u001a\u00020\u00042\t\b\u0001\u0010\u0088\u0001\u001a\u00020aH&¢\u0006\u0005\b\u0088\u0001\u0010bJ\u0019\u0010\u0089\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0005\b\u0089\u0001\u0010fJ%\u0010\u0089\u0001\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0005\b\u0089\u0001\u0010CJ\u001a\u0010\u008a\u0001\u001a\u00020\u00042\u0007\u0010\u008a\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b\u008a\u0001\u0010\u0005J\u001a\u0010\u008a\u0001\u001a\u00020\u00042\u0007\u0010\u008a\u0001\u001a\u00020\u0007H'¢\u0006\u0005\b\u008a\u0001\u0010\tJ\u001c\u0010\u008b\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u008b\u0001\u001a\u00020\rH&¢\u0006\u0005\b\u008b\u0001\u0010\u000fJ\u001a\u0010\u008b\u0001\u001a\u00020\u00042\u0007\u0010\u008b\u0001\u001a\u00020\u0007H&¢\u0006\u0005\b\u008b\u0001\u0010\tJ\u0019\u0010\u008c\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0005\b\u008c\u0001\u0010fJ%\u0010\u008c\u0001\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0005\b\u008c\u0001\u0010CJ\u001c\u0010\u008d\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u008d\u0001\u001a\u00020\rH&¢\u0006\u0005\b\u008d\u0001\u0010\u000fJ\u001a\u0010\u008d\u0001\u001a\u00020\u00042\u0007\u0010\u008d\u0001\u001a\u00020\u0007H&¢\u0006\u0005\b\u008d\u0001\u0010\tJ\u0019\u0010\u008e\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0005\b\u008e\u0001\u0010fJ%\u0010\u008e\u0001\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0005\b\u008e\u0001\u0010CJ\u001c\u0010\u008f\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u008f\u0001\u001a\u00020\rH&¢\u0006\u0005\b\u008f\u0001\u0010\u000fJ\u001a\u0010\u008f\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u0007H&¢\u0006\u0005\b\u008f\u0001\u0010\tJ\u0019\u0010\u0090\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0005\b\u0090\u0001\u0010fJ%\u0010\u0090\u0001\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0005\b\u0090\u0001\u0010CJ\"\u0010\u0091\u0001\u001a\u00020\u00042\u000f\b\u0002\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH&¢\u0006\u0005\b\u0091\u0001\u0010\u001cJ\u001a\u0010\u0091\u0001\u001a\u00020\u00042\u0007\u0010\u0091\u0001\u001a\u00020\u0007H&¢\u0006\u0005\b\u0091\u0001\u0010\tJ\u0019\u0010\u0092\u0001\u001a\u00020\u00042\u0006\u0010d\u001a\u00020cH&¢\u0006\u0005\b\u0092\u0001\u0010fJ%\u0010\u0092\u0001\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020A0@H&¢\u0006\u0005\b\u0092\u0001\u0010CJ\u001e\u0010\u0094\u0001\u001a\u00020\u00042\n\b\u0002\u0010\u0094\u0001\u001a\u00030\u0093\u0001H&¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001a\u0010\u0094\u0001\u001a\u00020\u00042\u0007\u0010\u0094\u0001\u001a\u00020\u0007H&¢\u0006\u0005\b\u0094\u0001\u0010\t¨\u0006\u0096\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayerDsl;", "", "", "sourceLayer", "Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "maxZoom", "", "iconAllowOverlap", "(Z)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "iconAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "iconIgnorePlacement", "iconImage", "iconKeepUpright", "", "iconOffset", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "iconOptional", "iconPadding", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconPitchAlignment;", "iconPitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconPitchAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "iconRotate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;", "iconRotationAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "iconSize", "iconSizeScaleRange", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "iconTextFit", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "iconTextFitPadding", "symbolAvoidEdges", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolElevationReference;", "symbolElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolElevationReference;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolPlacement;", "symbolPlacement", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolPlacement;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "symbolSortKey", "symbolSpacing", "symbolZElevate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolZOrder;", "symbolZOrder", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SymbolZOrder;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "textAllowOverlap", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "textAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "Lcom/mapbox/maps/extension/style/types/Formatted;", "textField", "(Lcom/mapbox/maps/extension/style/types/Formatted;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "Lkotlin/Function1;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", GNCSOptOutSettingsFragment.EXTRA_TEXT_FONT, "textIgnorePlacement", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "textJustify", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "textKeepUpright", "textLetterSpacing", "textLineHeight", "textMaxAngle", "textMaxWidth", "textOffset", "textOptional", "textPadding", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextPitchAlignment;", "textPitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextPitchAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "textRadialOffset", "textRotate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextRotationAlignment;", "textRotationAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextRotationAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "textSize", "textSizeScaleRange", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", "textTransform", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "textVariableAnchor", "textWritingMode", "iconColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "iconColorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "iconColorUseTheme", "iconColorSaturation", "iconColorSaturationTransition", "iconEmissiveStrength", "iconEmissiveStrengthTransition", "iconHaloBlur", "iconHaloBlurTransition", "iconHaloColor", "iconHaloColorTransition", "iconHaloColorUseTheme", "iconHaloWidth", "iconHaloWidthTransition", "iconImageCrossFade", "iconImageCrossFadeTransition", "iconOcclusionOpacity", "iconOcclusionOpacityTransition", "iconOpacity", "iconOpacityTransition", "iconTranslate", "iconTranslateTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTranslateAnchor;", "iconTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTranslateAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "symbolZOffset", "symbolZOffsetTransition", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "textColorTransition", "textColorUseTheme", "textEmissiveStrength", "textEmissiveStrengthTransition", "textHaloBlur", "textHaloBlurTransition", "textHaloColor", "textHaloColorTransition", "textHaloColorUseTheme", "textHaloWidth", "textHaloWidthTransition", "textOcclusionOpacity", "textOcclusionOpacityTransition", "textOpacity", "textOpacityTransition", "textTranslate", "textTranslateTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTranslateAnchor;", "textTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTranslateAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface SymbolLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ SymbolLayer iconAllowOverlap$default(SymbolLayerDsl symbolLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconAllowOverlap");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return symbolLayerDsl.iconAllowOverlap(z14);
        }

        public static /* synthetic */ SymbolLayer iconAnchor$default(SymbolLayerDsl symbolLayerDsl, IconAnchor iconAnchor, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconAnchor");
                return null;
            }
            if ((i14 & 1) != 0) {
                iconAnchor = IconAnchor.CENTER;
            }
            return symbolLayerDsl.iconAnchor(iconAnchor);
        }

        public static /* synthetic */ SymbolLayer iconColor$default(SymbolLayerDsl symbolLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#000000";
            }
            return symbolLayerDsl.iconColor(str);
        }

        public static /* synthetic */ SymbolLayer iconColorSaturation$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconColorSaturation");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.iconColorSaturation(d14);
        }

        public static /* synthetic */ SymbolLayer iconEmissiveStrength$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconEmissiveStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return symbolLayerDsl.iconEmissiveStrength(d14);
        }

        public static /* synthetic */ SymbolLayer iconHaloBlur$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconHaloBlur");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.iconHaloBlur(d14);
        }

        public static /* synthetic */ SymbolLayer iconHaloColor$default(SymbolLayerDsl symbolLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconHaloColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "rgba(0, 0, 0, 0)";
            }
            return symbolLayerDsl.iconHaloColor(str);
        }

        public static /* synthetic */ SymbolLayer iconHaloWidth$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconHaloWidth");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.iconHaloWidth(d14);
        }

        public static /* synthetic */ SymbolLayer iconIgnorePlacement$default(SymbolLayerDsl symbolLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconIgnorePlacement");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return symbolLayerDsl.iconIgnorePlacement(z14);
        }

        public static /* synthetic */ SymbolLayer iconImageCrossFade$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconImageCrossFade");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.iconImageCrossFade(d14);
        }

        public static /* synthetic */ SymbolLayer iconKeepUpright$default(SymbolLayerDsl symbolLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconKeepUpright");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return symbolLayerDsl.iconKeepUpright(z14);
        }

        public static /* synthetic */ SymbolLayer iconOcclusionOpacity$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconOcclusionOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.iconOcclusionOpacity(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SymbolLayer iconOffset$default(SymbolLayerDsl symbolLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconOffset");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return symbolLayerDsl.iconOffset((List<Double>) list);
        }

        public static /* synthetic */ SymbolLayer iconOpacity$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return symbolLayerDsl.iconOpacity(d14);
        }

        public static /* synthetic */ SymbolLayer iconOptional$default(SymbolLayerDsl symbolLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconOptional");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return symbolLayerDsl.iconOptional(z14);
        }

        public static /* synthetic */ SymbolLayer iconPadding$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconPadding");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 2.0d;
            }
            return symbolLayerDsl.iconPadding(d14);
        }

        public static /* synthetic */ SymbolLayer iconPitchAlignment$default(SymbolLayerDsl symbolLayerDsl, IconPitchAlignment iconPitchAlignment, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconPitchAlignment");
                return null;
            }
            if ((i14 & 1) != 0) {
                iconPitchAlignment = IconPitchAlignment.AUTO;
            }
            return symbolLayerDsl.iconPitchAlignment(iconPitchAlignment);
        }

        public static /* synthetic */ SymbolLayer iconRotate$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconRotate");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.iconRotate(d14);
        }

        public static /* synthetic */ SymbolLayer iconRotationAlignment$default(SymbolLayerDsl symbolLayerDsl, IconRotationAlignment iconRotationAlignment, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconRotationAlignment");
                return null;
            }
            if ((i14 & 1) != 0) {
                iconRotationAlignment = IconRotationAlignment.AUTO;
            }
            return symbolLayerDsl.iconRotationAlignment(iconRotationAlignment);
        }

        public static /* synthetic */ SymbolLayer iconSize$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconSize");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return symbolLayerDsl.iconSize(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SymbolLayer iconSizeScaleRange$default(SymbolLayerDsl symbolLayerDsl, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconSizeScaleRange");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(Double.valueOf(0.8d), Double.valueOf(2.0d));
            }
            return symbolLayerDsl.iconSizeScaleRange((List<Double>) list);
        }

        public static /* synthetic */ SymbolLayer iconTextFit$default(SymbolLayerDsl symbolLayerDsl, IconTextFit iconTextFit, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconTextFit");
                return null;
            }
            if ((i14 & 1) != 0) {
                iconTextFit = IconTextFit.NONE;
            }
            return symbolLayerDsl.iconTextFit(iconTextFit);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SymbolLayer iconTextFitPadding$default(SymbolLayerDsl symbolLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconTextFitPadding");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf, dValueOf, dValueOf);
            }
            return symbolLayerDsl.iconTextFitPadding((List<Double>) list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SymbolLayer iconTranslate$default(SymbolLayerDsl symbolLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconTranslate");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return symbolLayerDsl.iconTranslate((List<Double>) list);
        }

        public static /* synthetic */ SymbolLayer iconTranslateAnchor$default(SymbolLayerDsl symbolLayerDsl, IconTranslateAnchor iconTranslateAnchor, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: iconTranslateAnchor");
                return null;
            }
            if ((i14 & 1) != 0) {
                iconTranslateAnchor = IconTranslateAnchor.MAP;
            }
            return symbolLayerDsl.iconTranslateAnchor(iconTranslateAnchor);
        }

        public static /* synthetic */ SymbolLayer symbolAvoidEdges$default(SymbolLayerDsl symbolLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: symbolAvoidEdges");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return symbolLayerDsl.symbolAvoidEdges(z14);
        }

        public static /* synthetic */ SymbolLayer symbolElevationReference$default(SymbolLayerDsl symbolLayerDsl, SymbolElevationReference symbolElevationReference, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: symbolElevationReference");
                return null;
            }
            if ((i14 & 1) != 0) {
                symbolElevationReference = SymbolElevationReference.GROUND;
            }
            return symbolLayerDsl.symbolElevationReference(symbolElevationReference);
        }

        public static /* synthetic */ SymbolLayer symbolPlacement$default(SymbolLayerDsl symbolLayerDsl, SymbolPlacement symbolPlacement, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: symbolPlacement");
                return null;
            }
            if ((i14 & 1) != 0) {
                symbolPlacement = SymbolPlacement.POINT;
            }
            return symbolLayerDsl.symbolPlacement(symbolPlacement);
        }

        public static /* synthetic */ SymbolLayer symbolSpacing$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: symbolSpacing");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 250.0d;
            }
            return symbolLayerDsl.symbolSpacing(d14);
        }

        public static /* synthetic */ SymbolLayer symbolZElevate$default(SymbolLayerDsl symbolLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: symbolZElevate");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return symbolLayerDsl.symbolZElevate(z14);
        }

        public static /* synthetic */ SymbolLayer symbolZOffset$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: symbolZOffset");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.symbolZOffset(d14);
        }

        public static /* synthetic */ SymbolLayer symbolZOrder$default(SymbolLayerDsl symbolLayerDsl, SymbolZOrder symbolZOrder, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: symbolZOrder");
                return null;
            }
            if ((i14 & 1) != 0) {
                symbolZOrder = SymbolZOrder.AUTO;
            }
            return symbolLayerDsl.symbolZOrder(symbolZOrder);
        }

        public static /* synthetic */ SymbolLayer textAllowOverlap$default(SymbolLayerDsl symbolLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textAllowOverlap");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return symbolLayerDsl.textAllowOverlap(z14);
        }

        public static /* synthetic */ SymbolLayer textAnchor$default(SymbolLayerDsl symbolLayerDsl, TextAnchor textAnchor, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textAnchor");
                return null;
            }
            if ((i14 & 1) != 0) {
                textAnchor = TextAnchor.CENTER;
            }
            return symbolLayerDsl.textAnchor(textAnchor);
        }

        public static /* synthetic */ SymbolLayer textColor$default(SymbolLayerDsl symbolLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#000000";
            }
            return symbolLayerDsl.textColor(str);
        }

        public static /* synthetic */ SymbolLayer textEmissiveStrength$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textEmissiveStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return symbolLayerDsl.textEmissiveStrength(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SymbolLayer textFont$default(SymbolLayerDsl symbolLayerDsl, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textFont");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k("Open Sans Regular", "Arial Unicode MS Regular");
            }
            return symbolLayerDsl.textFont((List<String>) list);
        }

        public static /* synthetic */ SymbolLayer textHaloBlur$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textHaloBlur");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.textHaloBlur(d14);
        }

        public static /* synthetic */ SymbolLayer textHaloColor$default(SymbolLayerDsl symbolLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textHaloColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "rgba(0, 0, 0, 0)";
            }
            return symbolLayerDsl.textHaloColor(str);
        }

        public static /* synthetic */ SymbolLayer textHaloWidth$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textHaloWidth");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.textHaloWidth(d14);
        }

        public static /* synthetic */ SymbolLayer textIgnorePlacement$default(SymbolLayerDsl symbolLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textIgnorePlacement");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return symbolLayerDsl.textIgnorePlacement(z14);
        }

        public static /* synthetic */ SymbolLayer textJustify$default(SymbolLayerDsl symbolLayerDsl, TextJustify textJustify, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textJustify");
                return null;
            }
            if ((i14 & 1) != 0) {
                textJustify = TextJustify.CENTER;
            }
            return symbolLayerDsl.textJustify(textJustify);
        }

        public static /* synthetic */ SymbolLayer textKeepUpright$default(SymbolLayerDsl symbolLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textKeepUpright");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = true;
            }
            return symbolLayerDsl.textKeepUpright(z14);
        }

        public static /* synthetic */ SymbolLayer textLetterSpacing$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textLetterSpacing");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.textLetterSpacing(d14);
        }

        public static /* synthetic */ SymbolLayer textLineHeight$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textLineHeight");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.2d;
            }
            return symbolLayerDsl.textLineHeight(d14);
        }

        public static /* synthetic */ SymbolLayer textMaxAngle$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textMaxAngle");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 45.0d;
            }
            return symbolLayerDsl.textMaxAngle(d14);
        }

        public static /* synthetic */ SymbolLayer textMaxWidth$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textMaxWidth");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 10.0d;
            }
            return symbolLayerDsl.textMaxWidth(d14);
        }

        public static /* synthetic */ SymbolLayer textOcclusionOpacity$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textOcclusionOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.textOcclusionOpacity(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SymbolLayer textOffset$default(SymbolLayerDsl symbolLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textOffset");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return symbolLayerDsl.textOffset((List<Double>) list);
        }

        public static /* synthetic */ SymbolLayer textOpacity$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return symbolLayerDsl.textOpacity(d14);
        }

        public static /* synthetic */ SymbolLayer textOptional$default(SymbolLayerDsl symbolLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textOptional");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return symbolLayerDsl.textOptional(z14);
        }

        public static /* synthetic */ SymbolLayer textPadding$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textPadding");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 2.0d;
            }
            return symbolLayerDsl.textPadding(d14);
        }

        public static /* synthetic */ SymbolLayer textPitchAlignment$default(SymbolLayerDsl symbolLayerDsl, TextPitchAlignment textPitchAlignment, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textPitchAlignment");
                return null;
            }
            if ((i14 & 1) != 0) {
                textPitchAlignment = TextPitchAlignment.AUTO;
            }
            return symbolLayerDsl.textPitchAlignment(textPitchAlignment);
        }

        public static /* synthetic */ SymbolLayer textRadialOffset$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textRadialOffset");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.textRadialOffset(d14);
        }

        public static /* synthetic */ SymbolLayer textRotate$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textRotate");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return symbolLayerDsl.textRotate(d14);
        }

        public static /* synthetic */ SymbolLayer textRotationAlignment$default(SymbolLayerDsl symbolLayerDsl, TextRotationAlignment textRotationAlignment, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textRotationAlignment");
                return null;
            }
            if ((i14 & 1) != 0) {
                textRotationAlignment = TextRotationAlignment.AUTO;
            }
            return symbolLayerDsl.textRotationAlignment(textRotationAlignment);
        }

        public static /* synthetic */ SymbolLayer textSize$default(SymbolLayerDsl symbolLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textSize");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 16.0d;
            }
            return symbolLayerDsl.textSize(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SymbolLayer textSizeScaleRange$default(SymbolLayerDsl symbolLayerDsl, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textSizeScaleRange");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(Double.valueOf(0.8d), Double.valueOf(2.0d));
            }
            return symbolLayerDsl.textSizeScaleRange((List<Double>) list);
        }

        public static /* synthetic */ SymbolLayer textTransform$default(SymbolLayerDsl symbolLayerDsl, TextTransform textTransform, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textTransform");
                return null;
            }
            if ((i14 & 1) != 0) {
                textTransform = TextTransform.NONE;
            }
            return symbolLayerDsl.textTransform(textTransform);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SymbolLayer textTranslate$default(SymbolLayerDsl symbolLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textTranslate");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return symbolLayerDsl.textTranslate((List<Double>) list);
        }

        public static /* synthetic */ SymbolLayer textTranslateAnchor$default(SymbolLayerDsl symbolLayerDsl, TextTranslateAnchor textTranslateAnchor, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: textTranslateAnchor");
                return null;
            }
            if ((i14 & 1) != 0) {
                textTranslateAnchor = TextTranslateAnchor.MAP;
            }
            return symbolLayerDsl.textTranslateAnchor(textTranslateAnchor);
        }
    }

    SymbolLayer filter(Expression filter);

    SymbolLayer iconAllowOverlap(Expression iconAllowOverlap);

    SymbolLayer iconAllowOverlap(boolean iconAllowOverlap);

    SymbolLayer iconAnchor(Expression iconAnchor);

    SymbolLayer iconAnchor(IconAnchor iconAnchor);

    SymbolLayer iconColor(int iconColor);

    SymbolLayer iconColor(Expression iconColor);

    SymbolLayer iconColor(String iconColor);

    SymbolLayer iconColorSaturation(double iconColorSaturation);

    SymbolLayer iconColorSaturation(Expression iconColorSaturation);

    SymbolLayer iconColorSaturationTransition(StyleTransition options);

    SymbolLayer iconColorSaturationTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer iconColorTransition(StyleTransition options);

    SymbolLayer iconColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    SymbolLayer iconColorUseTheme(Expression iconColorUseTheme);

    @MapboxExperimental
    SymbolLayer iconColorUseTheme(String iconColorUseTheme);

    SymbolLayer iconEmissiveStrength(double iconEmissiveStrength);

    SymbolLayer iconEmissiveStrength(Expression iconEmissiveStrength);

    SymbolLayer iconEmissiveStrengthTransition(StyleTransition options);

    SymbolLayer iconEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer iconHaloBlur(double iconHaloBlur);

    SymbolLayer iconHaloBlur(Expression iconHaloBlur);

    SymbolLayer iconHaloBlurTransition(StyleTransition options);

    SymbolLayer iconHaloBlurTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer iconHaloColor(int iconHaloColor);

    SymbolLayer iconHaloColor(Expression iconHaloColor);

    SymbolLayer iconHaloColor(String iconHaloColor);

    SymbolLayer iconHaloColorTransition(StyleTransition options);

    SymbolLayer iconHaloColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    SymbolLayer iconHaloColorUseTheme(Expression iconHaloColorUseTheme);

    @MapboxExperimental
    SymbolLayer iconHaloColorUseTheme(String iconHaloColorUseTheme);

    SymbolLayer iconHaloWidth(double iconHaloWidth);

    SymbolLayer iconHaloWidth(Expression iconHaloWidth);

    SymbolLayer iconHaloWidthTransition(StyleTransition options);

    SymbolLayer iconHaloWidthTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer iconIgnorePlacement(Expression iconIgnorePlacement);

    SymbolLayer iconIgnorePlacement(boolean iconIgnorePlacement);

    SymbolLayer iconImage(Expression iconImage);

    SymbolLayer iconImage(String iconImage);

    SymbolLayer iconImageCrossFade(double iconImageCrossFade);

    SymbolLayer iconImageCrossFade(Expression iconImageCrossFade);

    SymbolLayer iconImageCrossFadeTransition(StyleTransition options);

    SymbolLayer iconImageCrossFadeTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer iconKeepUpright(Expression iconKeepUpright);

    SymbolLayer iconKeepUpright(boolean iconKeepUpright);

    SymbolLayer iconOcclusionOpacity(double iconOcclusionOpacity);

    SymbolLayer iconOcclusionOpacity(Expression iconOcclusionOpacity);

    SymbolLayer iconOcclusionOpacityTransition(StyleTransition options);

    SymbolLayer iconOcclusionOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer iconOffset(Expression iconOffset);

    SymbolLayer iconOffset(List<Double> iconOffset);

    SymbolLayer iconOpacity(double iconOpacity);

    SymbolLayer iconOpacity(Expression iconOpacity);

    SymbolLayer iconOpacityTransition(StyleTransition options);

    SymbolLayer iconOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer iconOptional(Expression iconOptional);

    SymbolLayer iconOptional(boolean iconOptional);

    SymbolLayer iconPadding(double iconPadding);

    SymbolLayer iconPadding(Expression iconPadding);

    SymbolLayer iconPitchAlignment(Expression iconPitchAlignment);

    SymbolLayer iconPitchAlignment(IconPitchAlignment iconPitchAlignment);

    SymbolLayer iconRotate(double iconRotate);

    SymbolLayer iconRotate(Expression iconRotate);

    SymbolLayer iconRotationAlignment(Expression iconRotationAlignment);

    SymbolLayer iconRotationAlignment(IconRotationAlignment iconRotationAlignment);

    SymbolLayer iconSize(double iconSize);

    SymbolLayer iconSize(Expression iconSize);

    @MapboxExperimental
    SymbolLayer iconSizeScaleRange(Expression iconSizeScaleRange);

    @MapboxExperimental
    SymbolLayer iconSizeScaleRange(List<Double> iconSizeScaleRange);

    SymbolLayer iconTextFit(Expression iconTextFit);

    SymbolLayer iconTextFit(IconTextFit iconTextFit);

    SymbolLayer iconTextFitPadding(Expression iconTextFitPadding);

    SymbolLayer iconTextFitPadding(List<Double> iconTextFitPadding);

    SymbolLayer iconTranslate(Expression iconTranslate);

    SymbolLayer iconTranslate(List<Double> iconTranslate);

    SymbolLayer iconTranslateAnchor(Expression iconTranslateAnchor);

    SymbolLayer iconTranslateAnchor(IconTranslateAnchor iconTranslateAnchor);

    SymbolLayer iconTranslateTransition(StyleTransition options);

    SymbolLayer iconTranslateTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer maxZoom(double maxZoom);

    SymbolLayer minZoom(double minZoom);

    SymbolLayer slot(String slot);

    SymbolLayer sourceLayer(String sourceLayer);

    SymbolLayer symbolAvoidEdges(Expression symbolAvoidEdges);

    SymbolLayer symbolAvoidEdges(boolean symbolAvoidEdges);

    @MapboxExperimental
    SymbolLayer symbolElevationReference(Expression symbolElevationReference);

    @MapboxExperimental
    SymbolLayer symbolElevationReference(SymbolElevationReference symbolElevationReference);

    SymbolLayer symbolPlacement(Expression symbolPlacement);

    SymbolLayer symbolPlacement(SymbolPlacement symbolPlacement);

    SymbolLayer symbolSortKey(double symbolSortKey);

    SymbolLayer symbolSortKey(Expression symbolSortKey);

    SymbolLayer symbolSpacing(double symbolSpacing);

    SymbolLayer symbolSpacing(Expression symbolSpacing);

    SymbolLayer symbolZElevate(Expression symbolZElevate);

    SymbolLayer symbolZElevate(boolean symbolZElevate);

    @MapboxExperimental
    SymbolLayer symbolZOffset(double symbolZOffset);

    @MapboxExperimental
    SymbolLayer symbolZOffset(Expression symbolZOffset);

    @MapboxExperimental
    SymbolLayer symbolZOffsetTransition(StyleTransition options);

    @MapboxExperimental
    SymbolLayer symbolZOffsetTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer symbolZOrder(Expression symbolZOrder);

    SymbolLayer symbolZOrder(SymbolZOrder symbolZOrder);

    SymbolLayer textAllowOverlap(Expression textAllowOverlap);

    SymbolLayer textAllowOverlap(boolean textAllowOverlap);

    SymbolLayer textAnchor(Expression textAnchor);

    SymbolLayer textAnchor(TextAnchor textAnchor);

    SymbolLayer textColor(int textColor);

    SymbolLayer textColor(Expression textColor);

    SymbolLayer textColor(String textColor);

    SymbolLayer textColorTransition(StyleTransition options);

    SymbolLayer textColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    SymbolLayer textColorUseTheme(Expression textColorUseTheme);

    @MapboxExperimental
    SymbolLayer textColorUseTheme(String textColorUseTheme);

    SymbolLayer textEmissiveStrength(double textEmissiveStrength);

    SymbolLayer textEmissiveStrength(Expression textEmissiveStrength);

    SymbolLayer textEmissiveStrengthTransition(StyleTransition options);

    SymbolLayer textEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer textField(Expression textField);

    SymbolLayer textField(Formatted textField);

    SymbolLayer textField(l<? super Formatted, Unit> block);

    SymbolLayer textField(String textField);

    SymbolLayer textFont(Expression textFont);

    SymbolLayer textFont(List<String> textFont);

    SymbolLayer textHaloBlur(double textHaloBlur);

    SymbolLayer textHaloBlur(Expression textHaloBlur);

    SymbolLayer textHaloBlurTransition(StyleTransition options);

    SymbolLayer textHaloBlurTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer textHaloColor(int textHaloColor);

    SymbolLayer textHaloColor(Expression textHaloColor);

    SymbolLayer textHaloColor(String textHaloColor);

    SymbolLayer textHaloColorTransition(StyleTransition options);

    SymbolLayer textHaloColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    SymbolLayer textHaloColorUseTheme(Expression textHaloColorUseTheme);

    @MapboxExperimental
    SymbolLayer textHaloColorUseTheme(String textHaloColorUseTheme);

    SymbolLayer textHaloWidth(double textHaloWidth);

    SymbolLayer textHaloWidth(Expression textHaloWidth);

    SymbolLayer textHaloWidthTransition(StyleTransition options);

    SymbolLayer textHaloWidthTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer textIgnorePlacement(Expression textIgnorePlacement);

    SymbolLayer textIgnorePlacement(boolean textIgnorePlacement);

    SymbolLayer textJustify(Expression textJustify);

    SymbolLayer textJustify(TextJustify textJustify);

    SymbolLayer textKeepUpright(Expression textKeepUpright);

    SymbolLayer textKeepUpright(boolean textKeepUpright);

    SymbolLayer textLetterSpacing(double textLetterSpacing);

    SymbolLayer textLetterSpacing(Expression textLetterSpacing);

    SymbolLayer textLineHeight(double textLineHeight);

    SymbolLayer textLineHeight(Expression textLineHeight);

    SymbolLayer textMaxAngle(double textMaxAngle);

    SymbolLayer textMaxAngle(Expression textMaxAngle);

    SymbolLayer textMaxWidth(double textMaxWidth);

    SymbolLayer textMaxWidth(Expression textMaxWidth);

    SymbolLayer textOcclusionOpacity(double textOcclusionOpacity);

    SymbolLayer textOcclusionOpacity(Expression textOcclusionOpacity);

    SymbolLayer textOcclusionOpacityTransition(StyleTransition options);

    SymbolLayer textOcclusionOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer textOffset(Expression textOffset);

    SymbolLayer textOffset(List<Double> textOffset);

    SymbolLayer textOpacity(double textOpacity);

    SymbolLayer textOpacity(Expression textOpacity);

    SymbolLayer textOpacityTransition(StyleTransition options);

    SymbolLayer textOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer textOptional(Expression textOptional);

    SymbolLayer textOptional(boolean textOptional);

    SymbolLayer textPadding(double textPadding);

    SymbolLayer textPadding(Expression textPadding);

    SymbolLayer textPitchAlignment(Expression textPitchAlignment);

    SymbolLayer textPitchAlignment(TextPitchAlignment textPitchAlignment);

    SymbolLayer textRadialOffset(double textRadialOffset);

    SymbolLayer textRadialOffset(Expression textRadialOffset);

    SymbolLayer textRotate(double textRotate);

    SymbolLayer textRotate(Expression textRotate);

    SymbolLayer textRotationAlignment(Expression textRotationAlignment);

    SymbolLayer textRotationAlignment(TextRotationAlignment textRotationAlignment);

    SymbolLayer textSize(double textSize);

    SymbolLayer textSize(Expression textSize);

    @MapboxExperimental
    SymbolLayer textSizeScaleRange(Expression textSizeScaleRange);

    @MapboxExperimental
    SymbolLayer textSizeScaleRange(List<Double> textSizeScaleRange);

    SymbolLayer textTransform(Expression textTransform);

    SymbolLayer textTransform(TextTransform textTransform);

    SymbolLayer textTranslate(Expression textTranslate);

    SymbolLayer textTranslate(List<Double> textTranslate);

    SymbolLayer textTranslateAnchor(Expression textTranslateAnchor);

    SymbolLayer textTranslateAnchor(TextTranslateAnchor textTranslateAnchor);

    SymbolLayer textTranslateTransition(StyleTransition options);

    SymbolLayer textTranslateTransition(l<? super StyleTransition.Builder, Unit> block);

    SymbolLayer textVariableAnchor(Expression textVariableAnchor);

    SymbolLayer textVariableAnchor(List<String> textVariableAnchor);

    SymbolLayer textWritingMode(Expression textWritingMode);

    SymbolLayer textWritingMode(List<String> textWritingMode);

    SymbolLayer visibility(Expression visibility);

    SymbolLayer visibility(Visibility visibility);
}
