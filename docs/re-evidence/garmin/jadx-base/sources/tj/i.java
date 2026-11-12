package tj;

import android.graphics.Matrix;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Xml;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.caverock.androidsvg.SVGParseException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.perf.util.Constants;
import ds.e0;
import j20.x;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.apache.commons.io.IOUtils;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f165014d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tj.g f165011a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tj.g.j0 f165012b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f165013c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f165015e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f165016f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StringBuilder f165017g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f165018h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StringBuilder f165019i = null;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f165021b;

        static {
            int[] iArr = new int[g.values().length];
            f165021b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f165021b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f165021b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f165021b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f165021b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f165021b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f165021b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f165021b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f165021b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f165021b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f165021b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f165021b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f165021b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f165021b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f165021b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f165021b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f165021b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f165021b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f165021b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f165021b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f165021b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f165021b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f165021b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f165021b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f165021b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f165021b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f165021b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f165021b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f165021b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f165021b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f165021b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f165021b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f165021b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f165021b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f165021b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f165021b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f165021b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f165021b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f165021b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f165021b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f165021b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f165021b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f165021b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f165021b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f165021b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f165021b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f165021b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f165021b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f165021b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f165021b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f165021b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f165021b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f165021b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f165021b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f165021b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f165021b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f165021b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f165021b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f165021b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f165021b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f165021b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f165021b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f165021b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f165021b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f165021b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f165021b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f165021b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f165021b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f165021b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f165021b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f165021b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f165021b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f165021b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f165021b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f165021b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f165021b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f165021b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f165021b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f165021b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f165021b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f165021b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f165021b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f165021b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f165021b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f165021b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f165021b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f165021b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f165021b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f165021b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f165020a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f165020a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f165020a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f165020a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f165020a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f165020a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f165020a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f165020a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f165020a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f165020a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f165020a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f165020a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f165020a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f165020a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f165020a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f165020a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f165020a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f165020a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f165020a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f165020a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f165020a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f165020a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f165020a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f165020a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f165020a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f165020a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f165020a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f165020a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f165020a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f165020a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f165020a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap f165022a;

        static {
            HashMap map = new HashMap(10);
            f165022a = map;
            map.put("none", tj.e.a.none);
            map.put("xMinYMin", tj.e.a.xMinYMin);
            map.put("xMidYMin", tj.e.a.xMidYMin);
            map.put("xMaxYMin", tj.e.a.xMaxYMin);
            map.put("xMinYMid", tj.e.a.xMinYMid);
            map.put("xMidYMid", tj.e.a.xMidYMid);
            map.put("xMaxYMid", tj.e.a.xMaxYMid);
            map.put("xMinYMax", tj.e.a.xMinYMax);
            map.put("xMidYMax", tj.e.a.xMidYMax);
            map.put("xMaxYMax", tj.e.a.xMaxYMax);
        }

        private b() {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap f165023a;

        static {
            HashMap map = new HashMap(47);
            f165023a = map;
            q6.f.r(-984833, map, "aliceblue", -332841, "antiquewhite");
            e0.n(-8388652, -16711681, "aqua", "aquamarine", map);
            q6.f.r(-983041, map, "azure", -657956, "beige");
            q6.f.r(-6972, map, "bisque", -16777216, "black");
            q6.f.r(-5171, map, "blanchedalmond", -16776961, "blue");
            q6.f.r(-7722014, map, "blueviolet", -5952982, "brown");
            q6.f.r(-2180985, map, "burlywood", -10510688, "cadetblue");
            q6.f.r(-8388864, map, "chartreuse", -2987746, "chocolate");
            q6.f.r(-32944, map, "coral", -10185235, "cornflowerblue");
            q6.f.r(-1828, map, "cornsilk", -2354116, "crimson");
            e0.n(-16777077, -16711681, "cyan", "darkblue", map);
            q6.f.r(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
            e0.n(-16751616, -5658199, "darkgray", "darkgreen", map);
            e0.n(-4343957, -5658199, "darkgrey", "darkkhaki", map);
            q6.f.r(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
            q6.f.r(-29696, map, "darkorange", -6737204, "darkorchid");
            q6.f.r(-7667712, map, "darkred", -1468806, "darksalmon");
            q6.f.r(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            e0.n(-7077677, -16724271, "darkturquoise", "darkviolet", map);
            q6.f.r(-60269, map, "deeppink", -16728065, "deepskyblue");
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            e0.n(-5103070, -14774017, "dodgerblue", "firebrick", map);
            q6.f.r(-1296, map, "floralwhite", -14513374, "forestgreen");
            e0.n(-2302756, -65281, "fuchsia", "gainsboro", map);
            q6.f.r(-460545, map, "ghostwhite", -10496, "gold");
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            q6.f.r(-16744448, map, "green", -5374161, "greenyellow");
            e0.n(-983056, -8355712, "grey", "honeydew", map);
            q6.f.r(-38476, map, "hotpink", -3318692, "indianred");
            q6.f.r(-11861886, map, "indigo", -16, "ivory");
            q6.f.r(-989556, map, "khaki", -1644806, "lavender");
            q6.f.r(-3851, map, "lavenderblush", -8586240, "lawngreen");
            q6.f.r(-1331, map, "lemonchiffon", -5383962, "lightblue");
            q6.f.r(-1015680, map, "lightcoral", -2031617, "lightcyan");
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            q6.f.r(-18751, map, "lightpink", -24454, "lightsalmon");
            q6.f.r(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            e0.n(-32, -5192482, "lightsteelblue", "lightyellow", map);
            q6.f.r(-16711936, map, "lime", -13447886, "limegreen");
            map.put("linen", -331546);
            map.put("magenta", -65281);
            q6.f.r(-8388608, map, "maroon", -10039894, "mediumaquamarine");
            q6.f.r(-16777011, map, "mediumblue", -4565549, "mediumorchid");
            q6.f.r(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
            q6.f.r(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
            q6.f.r(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
            q6.f.r(-15132304, map, "midnightblue", -655366, "mintcream");
            q6.f.r(-6943, map, "mistyrose", -6987, "moccasin");
            q6.f.r(-8531, map, "navajowhite", -16777088, "navy");
            q6.f.r(-133658, map, "oldlace", -8355840, "olive");
            q6.f.r(-9728477, map, "olivedrab", -23296, "orange");
            q6.f.r(-47872, map, "orangered", -2461482, "orchid");
            q6.f.r(-1120086, map, "palegoldenrod", -6751336, "palegreen");
            q6.f.r(-5247250, map, "paleturquoise", -2396013, "palevioletred");
            q6.f.r(-4139, map, "papayawhip", -9543, "peachpuff");
            q6.f.r(-3308225, map, "peru", -16181, "pink");
            q6.f.r(-2252579, map, "plum", -5185306, "powderblue");
            q6.f.r(-8388480, map, "purple", -10079335, "rebeccapurple");
            q6.f.r(-65536, map, "red", -4419697, "rosybrown");
            q6.f.r(-12490271, map, "royalblue", -7650029, "saddlebrown");
            q6.f.r(-360334, map, "salmon", -744352, "sandybrown");
            q6.f.r(-13726889, map, "seagreen", -2578, "seashell");
            q6.f.r(-6270419, map, "sienna", -4144960, "silver");
            q6.f.r(-7876885, map, "skyblue", -9807155, "slateblue");
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            e0.n(-16711809, -1286, "snow", "springgreen", map);
            q6.f.r(-12156236, map, "steelblue", -2968436, "tan");
            q6.f.r(-16744320, map, "teal", -2572328, "thistle");
            q6.f.r(-40121, map, "tomato", -12525360, "turquoise");
            q6.f.r(-1146130, map, "violet", -663885, "wheat");
            q6.f.r(-1, map, "white", -657931, "whitesmoke");
            q6.f.r(-256, map, "yellow", -6632142, "yellowgreen");
            map.put("transparent", 0);
        }

        private c() {
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap f165024a;

        static {
            HashMap map = new HashMap(9);
            f165024a = map;
            tj.g.d1 d1Var = tj.g.d1.pt;
            map.put("xx-small", new tj.g.p(0.694f, d1Var));
            map.put("x-small", new tj.g.p(0.833f, d1Var));
            map.put("small", new tj.g.p(10.0f, d1Var));
            map.put("medium", new tj.g.p(12.0f, d1Var));
            map.put("large", new tj.g.p(14.4f, d1Var));
            map.put("x-large", new tj.g.p(17.3f, d1Var));
            map.put("xx-large", new tj.g.p(20.7f, d1Var));
            tj.g.d1 d1Var2 = tj.g.d1.percent;
            map.put("smaller", new tj.g.p(83.33f, d1Var2));
            map.put("larger", new tj.g.p(120.0f, d1Var2));
        }

        private d() {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap f165025a;

        static {
            HashMap map = new HashMap(13);
            f165025a = map;
            map.put("normal", 400);
            Integer numValueOf = Integer.valueOf(Constants.FROZEN_FRAME_TIME);
            map.put(TtmlNode.BOLD, numValueOf);
            q6.f.r(1, map, "bolder", -1, "lighter");
            q6.f.r(100, map, "100", 200, "200");
            map.put("300", 300);
            map.put("400", 400);
            q6.f.r(500, map, "500", 600, "600");
            e0.n(800, numValueOf, "700", "800", map);
            map.put("900", 900);
        }

        private e() {
        }
    }

    public enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        public static final HashMap K1 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    K1.put(Action.CLASS_ATTRIBUTE, gVar);
                } else if (gVar != UNSUPPORTED) {
                    K1.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g a(String str) {
            g gVar = (g) K1.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    public enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        public static final HashMap T = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    T.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    T.put(hVar.name(), hVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: tj.i$i, reason: collision with other inner class name */
    public static class C3096i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f165102a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f165104c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f165103b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final tj.d f165105d = new tj.d();

        public C3096i(String str) {
            this.f165104c = 0;
            String strTrim = str.trim();
            this.f165102a = strTrim;
            this.f165104c = strTrim.length();
        }

        public static boolean g(int i14) {
            return i14 == 32 || i14 == 10 || i14 == 13 || i14 == 9;
        }

        public final int a() {
            int i14 = this.f165103b;
            int i15 = this.f165104c;
            if (i14 == i15) {
                return -1;
            }
            int i16 = i14 + 1;
            this.f165103b = i16;
            if (i16 < i15) {
                return this.f165102a.charAt(i16);
            }
            return -1;
        }

        public final Boolean b(Object obj) {
            if (obj == null) {
                return null;
            }
            p();
            int i14 = this.f165103b;
            if (i14 == this.f165104c) {
                return null;
            }
            char cCharAt = this.f165102a.charAt(i14);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f165103b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public final float c(float f14) {
            if (Float.isNaN(f14)) {
                return Float.NaN;
            }
            p();
            return i();
        }

        public final boolean d(char c14) {
            int i14 = this.f165103b;
            boolean z14 = i14 < this.f165104c && this.f165102a.charAt(i14) == c14;
            if (z14) {
                this.f165103b++;
            }
            return z14;
        }

        public final boolean e(String str) {
            int length = str.length();
            int i14 = this.f165103b;
            boolean z14 = i14 <= this.f165104c - length && this.f165102a.substring(i14, i14 + length).equals(str);
            if (z14) {
                this.f165103b += length;
            }
            return z14;
        }

        public final boolean f() {
            return this.f165103b == this.f165104c;
        }

        public final Integer h() {
            int i14 = this.f165103b;
            if (i14 == this.f165104c) {
                return null;
            }
            this.f165103b = i14 + 1;
            return Integer.valueOf(this.f165102a.charAt(i14));
        }

        public final float i() {
            int i14 = this.f165103b;
            int i15 = this.f165104c;
            tj.d dVar = this.f165105d;
            float fA = dVar.a(i14, i15, this.f165102a);
            if (!Float.isNaN(fA)) {
                this.f165103b = dVar.f164740a;
            }
            return fA;
        }

        public final tj.g.p j() {
            float fI = i();
            if (Float.isNaN(fI)) {
                return null;
            }
            tj.g.d1 d1VarN = n();
            return d1VarN == null ? new tj.g.p(fI, tj.g.d1.px) : new tj.g.p(fI, d1VarN);
        }

        public final String k() {
            if (f()) {
                return null;
            }
            int i14 = this.f165103b;
            String str = this.f165102a;
            char cCharAt = str.charAt(i14);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f165103b = i14;
                return null;
            }
            int i15 = this.f165103b;
            this.f165103b = i15 + 1;
            return str.substring(i14 + 1, i15);
        }

        public final String l() {
            return m(' ', false);
        }

        public final String m(char c14, boolean z14) {
            if (f()) {
                return null;
            }
            int i14 = this.f165103b;
            String str = this.f165102a;
            char cCharAt = str.charAt(i14);
            if ((!z14 && g(cCharAt)) || cCharAt == c14) {
                return null;
            }
            int i15 = this.f165103b;
            int iA = a();
            while (iA != -1 && iA != c14 && (z14 || !g(iA))) {
                iA = a();
            }
            return str.substring(i15, this.f165103b);
        }

        public final tj.g.d1 n() {
            if (f()) {
                return null;
            }
            int i14 = this.f165103b;
            String str = this.f165102a;
            char cCharAt = str.charAt(i14);
            int i15 = this.f165103b;
            if (cCharAt == '%') {
                this.f165103b = i15 + 1;
                return tj.g.d1.percent;
            }
            if (i15 > this.f165104c - 2) {
                return null;
            }
            try {
                tj.g.d1 d1VarValueOf = tj.g.d1.valueOf(str.substring(i15, i15 + 2).toLowerCase(Locale.US));
                this.f165103b += 2;
                return d1VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final float o() {
            p();
            int i14 = this.f165103b;
            int i15 = this.f165104c;
            tj.d dVar = this.f165105d;
            float fA = dVar.a(i14, i15, this.f165102a);
            if (!Float.isNaN(fA)) {
                this.f165103b = dVar.f164740a;
            }
            return fA;
        }

        public final boolean p() {
            q();
            int i14 = this.f165103b;
            if (i14 == this.f165104c || this.f165102a.charAt(i14) != ',') {
                return false;
            }
            this.f165103b++;
            q();
            return true;
        }

        public final void q() {
            while (true) {
                int i14 = this.f165103b;
                if (i14 >= this.f165104c || !g(this.f165102a.charAt(i14))) {
                    return;
                } else {
                    this.f165103b++;
                }
            }
        }
    }

    public class j implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final XmlPullParser f165106a;

        public j(i iVar, XmlPullParser xmlPullParser) {
            this.f165106a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final int getLength() {
            return this.f165106a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public final String getLocalName(int i14) {
            return this.f165106a.getAttributeName(i14);
        }

        @Override // org.xml.sax.Attributes
        public final String getQName(int i14) {
            XmlPullParser xmlPullParser = this.f165106a;
            String attributeName = xmlPullParser.getAttributeName(i14);
            if (xmlPullParser.getAttributePrefix(i14) == null) {
                return attributeName;
            }
            return xmlPullParser.getAttributePrefix(i14) + CoreConstants.COLON_CHAR + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i14) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getURI(int i14) {
            return this.f165106a.getAttributeNamespace(i14);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i14) {
            return this.f165106a.getAttributeValue(i14);
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:128:0x0282  */
    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:190:0x0331  */
    /* JADX WARN: Code duplicated, block: B:224:0x038e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0458  */
    public static void C(tj.g.e0 e0Var, String str, String str2) {
        tj.g.p pVarJ;
        String strM;
        tj.g.p pVarS;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        tj.g.e0.a aVar = null;
        tj.g.p pVarS2 = null;
        tj.g.e0.e eVar = null;
        tj.g.e0.i iVar = null;
        tj.g.e0.a aVar2 = null;
        cVar = null;
        cVar = null;
        tj.g.c cVar = null;
        Boolean bool = null;
        tj.g.e0.f fVar = null;
        tj.g.e0.h hVar = null;
        tj.g.e0.EnumC3093g enumC3093g = null;
        tj.g.e0.b bVar = null;
        String strSubstring = null;
        pVarArr = null;
        pVarArr = null;
        pVarArr = null;
        pVarArr = null;
        pVarArr = null;
        tj.g.p[] pVarArr = null;
        tj.g.e0.d dVar = null;
        tj.g.e0.c cVar2 = null;
        try {
            switch (a.f165021b[g.a(str).ordinal()]) {
                case 47:
                    tj.g.o0 o0VarW = w(str2);
                    e0Var.f164800b = o0VarW;
                    if (o0VarW != null) {
                        e0Var.f164799a |= 1;
                    }
                    break;
                case 48:
                    if ("nonzero".equals(str2)) {
                        aVar = tj.g.e0.a.NonZero;
                    } else if ("evenodd".equals(str2)) {
                        aVar = tj.g.e0.a.EvenOdd;
                    }
                    e0Var.f164801c = aVar;
                    if (aVar != null) {
                        e0Var.f164799a |= 2;
                    }
                    break;
                case 49:
                    Float fV = v(str2);
                    e0Var.f164802d = fV;
                    if (fV != null) {
                        e0Var.f164799a |= 4;
                    }
                    break;
                case 50:
                    tj.g.o0 o0VarW2 = w(str2);
                    e0Var.f164803e = o0VarW2;
                    if (o0VarW2 != null) {
                        e0Var.f164799a |= 8;
                    }
                    break;
                case 51:
                    Float fV2 = v(str2);
                    e0Var.f164804f = fV2;
                    if (fV2 != null) {
                        e0Var.f164799a |= 16;
                    }
                    break;
                case 52:
                    e0Var.f164805g = s(str2);
                    e0Var.f164799a |= 32;
                    break;
                case 53:
                    if ("butt".equals(str2)) {
                        cVar2 = tj.g.e0.c.Butt;
                    } else if ("round".equals(str2)) {
                        cVar2 = tj.g.e0.c.Round;
                    } else if ("square".equals(str2)) {
                        cVar2 = tj.g.e0.c.Square;
                    }
                    e0Var.f164806h = cVar2;
                    if (cVar2 != null) {
                        e0Var.f164799a |= 64;
                    }
                    break;
                case 54:
                    if ("miter".equals(str2)) {
                        dVar = tj.g.e0.d.Miter;
                    } else if ("round".equals(str2)) {
                        dVar = tj.g.e0.d.Round;
                    } else if ("bevel".equals(str2)) {
                        dVar = tj.g.e0.d.Bevel;
                    }
                    e0Var.f164807i = dVar;
                    if (dVar != null) {
                        e0Var.f164799a |= 128;
                    }
                    break;
                case 55:
                    e0Var.f164808j = Float.valueOf(p(str2));
                    e0Var.f164799a |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        C3096i c3096i = new C3096i(str2);
                        c3096i.q();
                        if (!c3096i.f() && (pVarJ = c3096i.j()) != null && !pVarJ.f()) {
                            float f14 = pVarJ.f164914a;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(pVarJ);
                            while (true) {
                                if (!c3096i.f()) {
                                    c3096i.p();
                                    tj.g.p pVarJ2 = c3096i.j();
                                    if (pVarJ2 != null && !pVarJ2.f()) {
                                        arrayList.add(pVarJ2);
                                        f14 += pVarJ2.f164914a;
                                    }
                                } else if (f14 != 0.0f) {
                                    pVarArr = (tj.g.p[]) arrayList.toArray(new tj.g.p[arrayList.size()]);
                                }
                            }
                        }
                        e0Var.f164809k = pVarArr;
                        if (pVarArr != null) {
                            e0Var.f164799a |= 512;
                        }
                    } else {
                        e0Var.f164809k = null;
                        e0Var.f164799a |= 512;
                    }
                    break;
                case 57:
                    e0Var.f164811l = s(str2);
                    e0Var.f164799a |= 1024;
                    break;
                case 58:
                    e0Var.f164812m = v(str2);
                    e0Var.f164799a |= 2048;
                    break;
                case 59:
                    e0Var.f164813n = n(str2);
                    e0Var.f164799a |= 4096;
                    break;
                case 60:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        C3096i c3096i2 = new C3096i(str2);
                        Integer num = null;
                        tj.g.e0.b bVar2 = null;
                        String str3 = null;
                        while (true) {
                            strM = c3096i2.m(IOUtils.DIR_SEPARATOR_UNIX, false);
                            c3096i2.q();
                            if (strM == null) {
                                break;
                            } else if (num == null || bVar2 == null) {
                                if (!strM.equals("normal") && (num != null || (num = (Integer) e.f165025a.get(strM)) == null)) {
                                    if (bVar2 == null) {
                                        switch (strM) {
                                            case "oblique":
                                                bVar2 = tj.g.e0.b.Oblique;
                                                break;
                                            case "italic":
                                                bVar2 = tj.g.e0.b.Italic;
                                                break;
                                            case "normal":
                                                bVar2 = tj.g.e0.b.Normal;
                                                break;
                                            default:
                                                bVar2 = null;
                                                break;
                                        }
                                        if (bVar2 != null) {
                                            continue;
                                        }
                                    }
                                    if (str3 == null && strM.equals("small-caps")) {
                                        str3 = strM;
                                    }
                                }
                            }
                        }
                        try {
                            pVarS = (tj.g.p) d.f165024a.get(strM);
                            if (pVarS == null) {
                                pVarS = s(strM);
                            }
                        } catch (SVGParseException unused) {
                            pVarS = null;
                        }
                        if (c3096i2.d(IOUtils.DIR_SEPARATOR_UNIX)) {
                            c3096i2.q();
                            String strL = c3096i2.l();
                            if (strL != null) {
                                s(strL);
                            }
                            c3096i2.q();
                        }
                        if (!c3096i2.f()) {
                            int i14 = c3096i2.f165103b;
                            c3096i2.f165103b = c3096i2.f165104c;
                            strSubstring = c3096i2.f165102a.substring(i14);
                        }
                        e0Var.f164814o = q(strSubstring);
                        e0Var.f164815p = pVarS;
                        e0Var.f164816q = Integer.valueOf(num == null ? 400 : num.intValue());
                        if (bVar2 == null) {
                            bVar2 = tj.g.e0.b.Normal;
                        }
                        e0Var.f164817r = bVar2;
                        e0Var.f164799a |= 122880;
                        break;
                    }
                    break;
                case 61:
                    ArrayList arrayListQ = q(str2);
                    e0Var.f164814o = arrayListQ;
                    if (arrayListQ != null) {
                        e0Var.f164799a |= 8192;
                    }
                    break;
                case 62:
                    try {
                        tj.g.p pVar = (tj.g.p) d.f165024a.get(str2);
                        pVarS2 = pVar == null ? s(str2) : pVar;
                        break;
                    } catch (SVGParseException unused2) {
                    }
                    e0Var.f164815p = pVarS2;
                    if (pVarS2 != null) {
                        e0Var.f164799a |= 16384;
                    }
                    break;
                case 63:
                    Integer num2 = (Integer) e.f165025a.get(str2);
                    e0Var.f164816q = num2;
                    if (num2 != null) {
                        e0Var.f164799a |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                    }
                    break;
                case 64:
                    switch (str2) {
                        case "oblique":
                            bVar = tj.g.e0.b.Oblique;
                            break;
                        case "italic":
                            bVar = tj.g.e0.b.Italic;
                            break;
                        case "normal":
                            bVar = tj.g.e0.b.Normal;
                            break;
                    }
                    e0Var.f164817r = bVar;
                    if (bVar != null) {
                        e0Var.f164799a |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                    }
                    break;
                case 65:
                    switch (str2) {
                        case "line-through":
                            enumC3093g = tj.g.e0.EnumC3093g.LineThrough;
                            break;
                        case "underline":
                            enumC3093g = tj.g.e0.EnumC3093g.Underline;
                            break;
                        case "none":
                            enumC3093g = tj.g.e0.EnumC3093g.None;
                            break;
                        case "blink":
                            enumC3093g = tj.g.e0.EnumC3093g.Blink;
                            break;
                        case "overline":
                            enumC3093g = tj.g.e0.EnumC3093g.Overline;
                            break;
                    }
                    e0Var.f164818t = enumC3093g;
                    if (enumC3093g != null) {
                        e0Var.f164799a |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                    }
                    break;
                case 66:
                    if (str2.equals("ltr")) {
                        hVar = tj.g.e0.h.LTR;
                    } else if (str2.equals("rtl")) {
                        hVar = tj.g.e0.h.RTL;
                    }
                    e0Var.f164819v = hVar;
                    if (hVar != null) {
                        e0Var.f164799a |= 68719476736L;
                    }
                    break;
                case 67:
                    switch (str2) {
                        case "middle":
                            fVar = tj.g.e0.f.Middle;
                            break;
                        case "end":
                            fVar = tj.g.e0.f.End;
                            break;
                        case "start":
                            fVar = tj.g.e0.f.Start;
                            break;
                    }
                    e0Var.f164820w = fVar;
                    if (fVar != null) {
                        e0Var.f164799a |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    }
                    break;
                case 68:
                    switch (str2) {
                        case "hidden":
                        case "scroll":
                            bool = Boolean.FALSE;
                            break;
                        case "auto":
                        case "visible":
                            bool = Boolean.TRUE;
                            break;
                    }
                    e0Var.f164821x = bool;
                    if (bool != null) {
                        e0Var.f164799a |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                    }
                    break;
                case 69:
                    String strR = r(str2);
                    e0Var.f164823z = strR;
                    e0Var.A = strR;
                    e0Var.B = strR;
                    e0Var.f164799a |= 14680064;
                    break;
                case 70:
                    e0Var.f164823z = r(str2);
                    e0Var.f164799a |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    break;
                case 71:
                    e0Var.A = r(str2);
                    e0Var.f164799a |= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                    break;
                case 72:
                    e0Var.B = r(str2);
                    e0Var.f164799a |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            e0Var.C = Boolean.valueOf(!str2.equals("none"));
                            e0Var.f164799a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                            e0Var.D = Boolean.valueOf(str2.equals("visible"));
                            e0Var.f164799a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e0Var.E = tj.g.C3094g.f164871a;
                    } else {
                        try {
                            e0Var.E = n(str2);
                        } catch (SVGParseException e4) {
                            e4.getMessage();
                            return;
                        }
                    }
                    e0Var.f164799a |= 67108864;
                    break;
                case 76:
                    e0Var.F = v(str2);
                    e0Var.f164799a |= 134217728;
                    break;
                case 77:
                    if (!TtmlNode.TEXT_EMPHASIS_AUTO.equals(str2) && str2.startsWith("rect(")) {
                        C3096i c3096i3 = new C3096i(str2.substring(5));
                        c3096i3.q();
                        tj.g.p pVarU = u(c3096i3);
                        c3096i3.p();
                        tj.g.p pVarU2 = u(c3096i3);
                        c3096i3.p();
                        tj.g.p pVarU3 = u(c3096i3);
                        c3096i3.p();
                        tj.g.p pVarU4 = u(c3096i3);
                        c3096i3.q();
                        if (c3096i3.d(CoreConstants.RIGHT_PARENTHESIS_CHAR) || c3096i3.f()) {
                            cVar = new tj.g.c(pVarU, pVarU2, pVarU3, pVarU4);
                        }
                    }
                    e0Var.f164822y = cVar;
                    if (cVar != null) {
                        e0Var.f164799a |= 1048576;
                    }
                    break;
                case 78:
                    e0Var.I = r(str2);
                    e0Var.f164799a |= 268435456;
                    break;
                case 79:
                    if ("nonzero".equals(str2)) {
                        aVar2 = tj.g.e0.a.NonZero;
                    } else if ("evenodd".equals(str2)) {
                        aVar2 = tj.g.e0.a.EvenOdd;
                    }
                    e0Var.P = aVar2;
                    e0Var.f164799a |= 536870912;
                    break;
                case 80:
                    e0Var.T = r(str2);
                    e0Var.f164799a |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e0Var.X = tj.g.C3094g.f164871a;
                    } else {
                        try {
                            e0Var.X = n(str2);
                        } catch (SVGParseException e14) {
                            e14.getMessage();
                            return;
                        }
                    }
                    e0Var.f164799a |= 2147483648L;
                    break;
                case 82:
                    e0Var.Y = v(str2);
                    e0Var.f164799a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e0Var.Z = tj.g.C3094g.f164871a;
                    } else {
                        try {
                            e0Var.Z = n(str2);
                        } catch (SVGParseException e15) {
                            e15.getMessage();
                            return;
                        }
                    }
                    e0Var.f164799a |= 8589934592L;
                    break;
                case 84:
                    e0Var.f164810k0 = v(str2);
                    e0Var.f164799a |= 17179869184L;
                    break;
                case 85:
                    if (str2.equals("none")) {
                        iVar = tj.g.e0.i.None;
                    } else if (str2.equals("non-scaling-stroke")) {
                        iVar = tj.g.e0.i.NonScalingStroke;
                    }
                    e0Var.H0 = iVar;
                    if (iVar != null) {
                        e0Var.f164799a |= 34359738368L;
                    }
                    break;
                case 86:
                    switch (str2) {
                        case "optimizeQuality":
                            eVar = tj.g.e0.e.optimizeQuality;
                            break;
                        case "auto":
                            eVar = tj.g.e0.e.auto;
                            break;
                        case "optimizeSpeed":
                            eVar = tj.g.e0.e.optimizeSpeed;
                            break;
                    }
                    e0Var.I0 = eVar;
                    if (eVar != null) {
                        e0Var.f164799a |= 137438953472L;
                    }
                    break;
            }
        } catch (SVGParseException unused3) {
        }
    }

    public static int b(float f14) {
        if (f14 < 0.0f) {
            return 0;
        }
        if (f14 > 255.0f) {
            return 255;
        }
        return Math.round(f14);
    }

    public static int d(float f14, float f15, float f16) {
        float f17 = 0.0f;
        float f18 = f14 % 360.0f;
        if (f14 < 0.0f) {
            f18 += 360.0f;
        }
        float f19 = f18 / 60.0f;
        float f22 = f15 / 100.0f;
        float f24 = f16 / 100.0f;
        if (f22 < 0.0f) {
            f22 = 0.0f;
        } else if (f22 > 1.0f) {
            f22 = 1.0f;
        }
        if (f24 >= 0.0f) {
            f17 = f24 > 1.0f ? 1.0f : f24;
        }
        float f25 = f17 <= 0.5f ? (f22 + 1.0f) * f17 : (f17 + f22) - (f22 * f17);
        float f26 = (f17 * 2.0f) - f25;
        return b(e(f26, f25, f19 - 2.0f) * 256.0f) | (b(e(f26, f25, f19 + 2.0f) * 256.0f) << 16) | (b(e(f26, f25, f19) * 256.0f) << 8);
    }

    public static float e(float f14, float f15, float f16) {
        if (f16 < 0.0f) {
            f16 += 6.0f;
        }
        if (f16 >= 6.0f) {
            f16 -= 6.0f;
        }
        if (f16 < 1.0f) {
            return x.a(f15, f14, f16, f14);
        }
        if (f16 < 3.0f) {
            return f15;
        }
        return f16 < 4.0f ? x.a(4.0f, f16, f15 - f14, f14) : f14;
    }

    public static void f(tj.g.g0 g0Var, Attributes attributes) {
        for (int i14 = 0; i14 < attributes.getLength(); i14++) {
            String strTrim = attributes.getValue(i14).trim();
            switch (a.f165021b[sn.a.a(attributes, i14)]) {
                case 21:
                    C3096i c3096i = new C3096i(strTrim);
                    HashSet hashSet = new HashSet();
                    while (!c3096i.f()) {
                        String strL = c3096i.l();
                        if (strL.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(strL.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        c3096i.q();
                    }
                    g0Var.d(hashSet);
                    break;
                case 22:
                    g0Var.e(strTrim);
                    break;
                case 23:
                    C3096i c3096i2 = new C3096i(strTrim);
                    HashSet hashSet2 = new HashSet();
                    while (!c3096i2.f()) {
                        String strL2 = c3096i2.l();
                        int iIndexOf = strL2.indexOf(45);
                        if (iIndexOf != -1) {
                            strL2 = strL2.substring(0, iIndexOf);
                        }
                        hashSet2.add(new Locale(strL2, "", "").getLanguage());
                        c3096i2.q();
                    }
                    g0Var.j(hashSet2);
                    break;
                case 24:
                    C3096i c3096i3 = new C3096i(strTrim);
                    HashSet hashSet3 = new HashSet();
                    while (!c3096i3.f()) {
                        hashSet3.add(c3096i3.l());
                        c3096i3.q();
                    }
                    g0Var.c(hashSet3);
                    break;
                case 25:
                    ArrayList arrayListQ = q(strTrim);
                    g0Var.k(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                    break;
            }
        }
    }

    public static void g(tj.g.l0 l0Var, Attributes attributes) throws SVGParseException {
        for (int i14 = 0; i14 < attributes.getLength(); i14++) {
            String qName = attributes.getQName(i14);
            if (qName.equals(TtmlNode.ATTR_ID) || qName.equals("xml:id")) {
                l0Var.f164896c = attributes.getValue(i14).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i14).trim();
                if ("default".equals(strTrim)) {
                    l0Var.f164897d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SVGParseException(fb1.c.n("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    l0Var.f164897d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(tj.g.j jVar, Attributes attributes) throws SVGParseException {
        for (int i14 = 0; i14 < attributes.getLength(); i14++) {
            String strTrim = attributes.getValue(i14).trim();
            int i15 = a.f165021b[sn.a.a(attributes, i14)];
            if (i15 != 6) {
                switch (i15) {
                    case 32:
                        if ("objectBoundingBox".equals(strTrim)) {
                            jVar.f164887i = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                sn.a.q("Invalid value for attribute gradientUnits");
                                return;
                            }
                            jVar.f164887i = Boolean.TRUE;
                        }
                        break;
                    case 33:
                        jVar.f164888j = z(strTrim);
                        break;
                    case 34:
                        try {
                            jVar.f164889k = tj.g.k.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException(am.j.m("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i14)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i14))) {
                jVar.f164890l = strTrim;
            }
        }
    }

    public static void i(tj.g.z zVar, Attributes attributes, String str) throws SVGParseException {
        for (int i14 = 0; i14 < attributes.getLength(); i14++) {
            if (g.a(attributes.getLocalName(i14)) == g.points) {
                C3096i c3096i = new C3096i(attributes.getValue(i14));
                ArrayList arrayList = new ArrayList();
                c3096i.q();
                while (!c3096i.f()) {
                    float fI = c3096i.i();
                    if (Float.isNaN(fI)) {
                        throw new SVGParseException(am.j.m("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c3096i.p();
                    float fI2 = c3096i.i();
                    if (Float.isNaN(fI2)) {
                        throw new SVGParseException(am.j.m("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c3096i.p();
                    arrayList.add(Float.valueOf(fI));
                    arrayList.add(Float.valueOf(fI2));
                }
                zVar.f164956o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i15 = 0;
                while (it.hasNext()) {
                    zVar.f164956o[i15] = ((Float) it.next()).floatValue();
                    i15++;
                }
            }
        }
    }

    public static void j(tj.g.l0 l0Var, Attributes attributes) {
        for (int i14 = 0; i14 < attributes.getLength(); i14++) {
            String strTrim = attributes.getValue(i14).trim();
            if (strTrim.length() != 0) {
                int i15 = a.f165021b[sn.a.a(attributes, i14)];
                if (i15 == 45) {
                    C3096i c3096i = new C3096i(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strM = c3096i.m(CoreConstants.COLON_CHAR, false);
                        c3096i.q();
                        if (!c3096i.d(CoreConstants.COLON_CHAR)) {
                            break;
                        }
                        c3096i.q();
                        String strM2 = c3096i.m(';', true);
                        if (strM2 == null) {
                            break;
                        }
                        c3096i.q();
                        if (c3096i.f() || c3096i.d(';')) {
                            if (l0Var.f164899f == null) {
                                l0Var.f164899f = new tj.g.e0();
                            }
                            C(l0Var.f164899f, strM, strM2);
                            c3096i.q();
                        }
                    }
                } else if (i15 != 46) {
                    if (l0Var.f164898e == null) {
                        l0Var.f164898e = new tj.g.e0();
                    }
                    C(l0Var.f164898e, attributes.getLocalName(i14), attributes.getValue(i14).trim());
                } else {
                    tj.b.d dVar = new tj.b.d(strTrim);
                    ArrayList arrayList = null;
                    while (!dVar.f()) {
                        String strL = dVar.l();
                        if (strL != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strL);
                            dVar.q();
                        }
                    }
                    l0Var.f164900g = arrayList;
                }
            }
        }
    }

    public static void k(tj.g.a1 a1Var, Attributes attributes) {
        for (int i14 = 0; i14 < attributes.getLength(); i14++) {
            String strTrim = attributes.getValue(i14).trim();
            int i15 = a.f165021b[sn.a.a(attributes, i14)];
            if (i15 == 1) {
                a1Var.f164765n = t(strTrim);
            } else if (i15 == 2) {
                a1Var.f164766o = t(strTrim);
            } else if (i15 == 19) {
                a1Var.f164767p = t(strTrim);
            } else if (i15 == 20) {
                a1Var.f164768q = t(strTrim);
            }
        }
    }

    public static void l(tj.g.n nVar, Attributes attributes) {
        for (int i14 = 0; i14 < attributes.getLength(); i14++) {
            if (g.a(attributes.getLocalName(i14)) == g.transform) {
                nVar.l(z(attributes.getValue(i14)));
            }
        }
    }

    public static void m(tj.g.r0 r0Var, Attributes attributes) throws SVGParseException {
        for (int i14 = 0; i14 < attributes.getLength(); i14++) {
            String strTrim = attributes.getValue(i14).trim();
            int i15 = a.f165021b[sn.a.a(attributes, i14)];
            if (i15 == 7) {
                x(r0Var, strTrim);
            } else if (i15 != 87) {
                continue;
            } else {
                C3096i c3096i = new C3096i(strTrim);
                c3096i.q();
                float fI = c3096i.i();
                c3096i.p();
                float fI2 = c3096i.i();
                c3096i.p();
                float fI3 = c3096i.i();
                c3096i.p();
                float fI4 = c3096i.i();
                if (Float.isNaN(fI) || Float.isNaN(fI2) || Float.isNaN(fI3) || Float.isNaN(fI4)) {
                    sn.a.q("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (fI3 < 0.0f) {
                    sn.a.q("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (fI4 < 0.0f) {
                        sn.a.q("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    r0Var.f164932o = new tj.g.b(fI, fI2, fI3, fI4);
                }
            }
        }
    }

    public static tj.g.f n(String str) throws SVGParseException {
        long j8;
        int i14;
        if (str.charAt(0) == '#') {
            int length = str.length();
            tj.c cVar = null;
            if (1 < length) {
                long j14 = 0;
                int i15 = 1;
                while (true) {
                    if (i15 < length) {
                        char cCharAt = str.charAt(i15);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j8 = j14 * 16;
                                i14 = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j8 = j14 * 16;
                                i14 = cCharAt - 'a';
                            }
                            j14 = j8 + ((long) i14) + 10;
                        } else {
                            j14 = (j14 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j14 <= 4294967295L) {
                            i15++;
                        }
                    }
                    if (i15 != 1) {
                        cVar = new tj.c(j14, i15);
                    }
                }
            }
            if (cVar == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            long j15 = cVar.f164737b;
            int i16 = cVar.f164736a;
            if (i16 == 4) {
                int i17 = (int) j15;
                int i18 = i17 & 3840;
                int i19 = i17 & PsExtractor.VIDEO_STREAM_MASK;
                int i24 = i17 & 15;
                return new tj.g.f(i24 | (i18 << 8) | (-16777216) | (i18 << 12) | (i19 << 8) | (i19 << 4) | (i24 << 4));
            }
            if (i16 != 5) {
                if (i16 == 7) {
                    return new tj.g.f(((int) j15) | (-16777216));
                }
                if (i16 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i25 = (int) j15;
                return new tj.g.f((i25 >>> 8) | (i25 << 24));
            }
            int i26 = (int) j15;
            int i27 = 61440 & i26;
            int i28 = i26 & 3840;
            int i29 = i26 & PsExtractor.VIDEO_STREAM_MASK;
            int i30 = i26 & 15;
            return new tj.g.f((i30 << 24) | (i30 << 28) | (i27 << 8) | (i27 << 4) | (i28 << 4) | i28 | i29 | (i29 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            C3096i c3096i = new C3096i(str.substring(zStartsWith ? 5 : 4));
            c3096i.q();
            float fI = c3096i.i();
            if (!Float.isNaN(fI) && c3096i.d(CoreConstants.PERCENT_CHAR)) {
                fI = (fI * 256.0f) / 100.0f;
            }
            float fC = c3096i.c(fI);
            if (!Float.isNaN(fC) && c3096i.d(CoreConstants.PERCENT_CHAR)) {
                fC = (fC * 256.0f) / 100.0f;
            }
            float fC2 = c3096i.c(fC);
            if (!Float.isNaN(fC2) && c3096i.d(CoreConstants.PERCENT_CHAR)) {
                fC2 = (fC2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                c3096i.q();
                if (Float.isNaN(fC2) || !c3096i.d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new tj.g.f((b(fI) << 16) | (-16777216) | (b(fC) << 8) | b(fC2));
            }
            float fC3 = c3096i.c(fC2);
            c3096i.q();
            if (Float.isNaN(fC3) || !c3096i.d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new tj.g.f((b(fC3 * 256.0f) << 24) | (b(fI) << 16) | (b(fC) << 8) | b(fC2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) c.f165023a.get(lowerCase);
            if (num != null) {
                return new tj.g.f(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        C3096i c3096i2 = new C3096i(str.substring(zStartsWith2 ? 5 : 4));
        c3096i2.q();
        float fI2 = c3096i2.i();
        float fC4 = c3096i2.c(fI2);
        if (!Float.isNaN(fC4)) {
            c3096i2.d(CoreConstants.PERCENT_CHAR);
        }
        float fC5 = c3096i2.c(fC4);
        if (!Float.isNaN(fC5)) {
            c3096i2.d(CoreConstants.PERCENT_CHAR);
        }
        if (!zStartsWith2) {
            c3096i2.q();
            if (Float.isNaN(fC5) || !c3096i2.d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new tj.g.f(d(fI2, fC4, fC5) | (-16777216));
        }
        float fC6 = c3096i2.c(fC5);
        c3096i2.q();
        if (Float.isNaN(fC6) || !c3096i2.d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new tj.g.f((b(fC6 * 256.0f) << 24) | d(fI2, fC4, fC5));
    }

    public static float o(int i14, String str) throws SVGParseException {
        float fA = new tj.d().a(0, i14, str);
        if (Float.isNaN(fA)) {
            throw new SVGParseException(fb1.c.n("Invalid float value: ", str));
        }
        return fA;
    }

    public static float p(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        sn.a.q("Invalid float value (empty string)");
        return 0.0f;
    }

    public static ArrayList q(String str) {
        C3096i c3096i = new C3096i(str);
        ArrayList arrayList = null;
        do {
            String strK = c3096i.k();
            if (strK == null) {
                strK = c3096i.m(CoreConstants.COMMA_CHAR, true);
            }
            if (strK == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strK);
            c3096i.p();
        } while (!c3096i.f());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static tj.g.p s(String str) throws SVGParseException {
        if (str.length() == 0) {
            sn.a.q("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        tj.g.d1 d1VarValueOf = tj.g.d1.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d1VarValueOf = tj.g.d1.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d1VarValueOf = tj.g.d1.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new tj.g.p(o(length, str), d1VarValueOf);
        } catch (NumberFormatException e4) {
            throw new SVGParseException("Invalid length value: ".concat(str), e4);
        }
    }

    public static ArrayList t(String str) throws SVGParseException {
        String str2;
        if (str.length() == 0) {
            sn.a.q("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        C3096i c3096i = new C3096i(str);
        c3096i.q();
        while (!c3096i.f()) {
            float fI = c3096i.i();
            if (Float.isNaN(fI)) {
                StringBuilder sb3 = new StringBuilder("Invalid length list value: ");
                int i14 = c3096i.f165103b;
                while (true) {
                    boolean zF = c3096i.f();
                    str2 = c3096i.f165102a;
                    if (zF || C3096i.g(str2.charAt(c3096i.f165103b))) {
                        break;
                    }
                    c3096i.f165103b++;
                }
                String strSubstring = str2.substring(i14, c3096i.f165103b);
                c3096i.f165103b = i14;
                sb3.append(strSubstring);
                throw new SVGParseException(sb3.toString());
            }
            tj.g.d1 d1VarN = c3096i.n();
            if (d1VarN == null) {
                d1VarN = tj.g.d1.px;
            }
            arrayList.add(new tj.g.p(fI, d1VarN));
            c3096i.p();
        }
        return arrayList;
    }

    public static tj.g.p u(C3096i c3096i) {
        return c3096i.e(TtmlNode.TEXT_EMPHASIS_AUTO) ? new tj.g.p(0.0f) : c3096i.j();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f14 = 0.0f;
            if (fP < 0.0f) {
                fP = f14;
            } else {
                f14 = 1.0f;
                if (fP > 1.0f) {
                    fP = f14;
                }
            }
            return Float.valueOf(fP);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static tj.g.o0 w(String str) {
        tj.g.o0 o0VarN = null;
        if (!str.startsWith("url(")) {
            if (str.equals("none")) {
                return tj.g.f.f164865c;
            }
            if (str.equals("currentColor")) {
                return tj.g.C3094g.f164871a;
            }
            try {
                return n(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new tj.g.u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (strTrim2.equals("none")) {
                o0VarN = tj.g.f.f164865c;
            } else if (strTrim2.equals("currentColor")) {
                o0VarN = tj.g.C3094g.f164871a;
            } else {
                try {
                    o0VarN = n(strTrim2);
                } catch (SVGParseException unused2) {
                }
            }
        }
        return new tj.g.u(strTrim, o0VarN);
    }

    public static void x(tj.g.p0 p0Var, String str) throws SVGParseException {
        tj.e.b bVar;
        C3096i c3096i = new C3096i(str);
        c3096i.q();
        String strL = c3096i.l();
        if ("defer".equals(strL)) {
            c3096i.q();
            strL = c3096i.l();
        }
        tj.e.a aVar = (tj.e.a) b.f165022a.get(strL);
        c3096i.q();
        if (c3096i.f()) {
            bVar = null;
        } else {
            String strL2 = c3096i.l();
            strL2.getClass();
            if (strL2.equals("meet")) {
                bVar = tj.e.b.meet;
            } else {
                if (!strL2.equals("slice")) {
                    throw new SVGParseException(fb1.c.n("Invalid preserveAspectRatio definition: ", str));
                }
                bVar = tj.e.b.slice;
            }
        }
        p0Var.f164916n = new tj.e(aVar, bVar);
    }

    public static HashMap y(C3096i c3096i) {
        HashMap map = new HashMap();
        c3096i.q();
        String strM = c3096i.m('=', false);
        while (strM != null) {
            c3096i.d('=');
            map.put(strM, c3096i.k());
            c3096i.q();
            strM = c3096i.m('=', false);
        }
        return map;
    }

    public static Matrix z(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        C3096i c3096i = new C3096i(str);
        c3096i.q();
        while (!c3096i.f()) {
            String strSubstring = null;
            if (!c3096i.f()) {
                int i14 = c3096i.f165103b;
                String str2 = c3096i.f165102a;
                int iCharAt = str2.charAt(i14);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = c3096i.a();
                    }
                }
                int i15 = c3096i.f165103b;
                while (C3096i.g(iCharAt)) {
                    iCharAt = c3096i.a();
                }
                if (iCharAt == 40) {
                    c3096i.f165103b++;
                    strSubstring = str2.substring(i14, i15);
                } else {
                    c3096i.f165103b = i14;
                }
            }
            if (strSubstring == null) {
                throw new SVGParseException(fb1.c.n("Bad transform function encountered in transform list: ", str));
            }
            switch (strSubstring) {
                case "matrix":
                    c3096i.q();
                    float fI = c3096i.i();
                    c3096i.p();
                    float fI2 = c3096i.i();
                    c3096i.p();
                    float fI3 = c3096i.i();
                    c3096i.p();
                    float fI4 = c3096i.i();
                    c3096i.p();
                    float fI5 = c3096i.i();
                    c3096i.p();
                    float fI6 = c3096i.i();
                    c3096i.q();
                    if (Float.isNaN(fI6) || !c3096i.d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException(fb1.c.n("Invalid transform list: ", str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fI, fI3, fI5, fI2, fI4, fI6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c3096i.q();
                    float fI7 = c3096i.i();
                    float fO = c3096i.o();
                    float fO2 = c3096i.o();
                    c3096i.q();
                    if (Float.isNaN(fI7) || !c3096i.d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException(fb1.c.n("Invalid transform list: ", str));
                    }
                    if (Float.isNaN(fO)) {
                        matrix.preRotate(fI7);
                    } else {
                        if (Float.isNaN(fO2)) {
                            throw new SVGParseException(fb1.c.n("Invalid transform list: ", str));
                        }
                        matrix.preRotate(fI7, fO, fO2);
                    }
                    break;
                    break;
                case "scale":
                    c3096i.q();
                    float fI8 = c3096i.i();
                    float fO3 = c3096i.o();
                    c3096i.q();
                    if (Float.isNaN(fI8) || !c3096i.d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException(fb1.c.n("Invalid transform list: ", str));
                    }
                    if (!Float.isNaN(fO3)) {
                        matrix.preScale(fI8, fO3);
                    } else {
                        matrix.preScale(fI8, fI8);
                    }
                    break;
                    break;
                case "skewX":
                    c3096i.q();
                    float fI9 = c3096i.i();
                    c3096i.q();
                    if (Float.isNaN(fI9) || !c3096i.d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException(fb1.c.n("Invalid transform list: ", str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fI9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    c3096i.q();
                    float fI10 = c3096i.i();
                    c3096i.q();
                    if (Float.isNaN(fI10) || !c3096i.d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException(fb1.c.n("Invalid transform list: ", str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fI10)));
                    break;
                    break;
                case "translate":
                    c3096i.q();
                    float fI11 = c3096i.i();
                    float fO4 = c3096i.o();
                    c3096i.q();
                    if (Float.isNaN(fI11) || !c3096i.d(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException(fb1.c.n("Invalid transform list: ", str));
                    }
                    if (!Float.isNaN(fO4)) {
                        matrix.preTranslate(fI11, fO4);
                    } else {
                        matrix.preTranslate(fI11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new SVGParseException(am.j.m("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (c3096i.f()) {
                return matrix;
            }
            c3096i.p();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws SVGParseException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e4) {
            throw new SVGParseException("Stream error", e4);
        } catch (ParserConfigurationException e14) {
            throw new SVGParseException("XML parser problem", e14);
        } catch (SAXException e15) {
            throw new SVGParseException("SVG parse error", e15);
        }
    }

    public final void B(InputStream inputStream) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(this, xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        this.f165011a = new tj.g();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        C3096i c3096i = new C3096i(xmlPullParserNewPullParser.getText());
                        String strL = c3096i.l();
                        y(c3096i);
                        strL.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (this.f165011a.f164761a == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + CoreConstants.COLON_CHAR + name;
                        }
                        D(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + CoreConstants.COLON_CHAR + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        F(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        E(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (IOException e4) {
                throw new SVGParseException("Stream error", e4);
            }
        } catch (XmlPullParserException e14) {
            throw new SVGParseException("XML parser problem", e14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:646:0x0bee  */
    /* JADX WARN: Code duplicated, block: B:649:0x0bf5  */
    /* JADX WARN: Code duplicated, block: B:872:0x0c17 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:888:0x0c11 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void D(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        char c14;
        float fI;
        float f14;
        float f15;
        int i14;
        char cCharAt;
        boolean z14;
        if (this.f165013c) {
            this.f165014d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            h hVar = (h) h.T.get(str2.length() > 0 ? str2 : str3);
            if (hVar == null) {
                hVar = h.UNSUPPORTED;
            }
            int i15 = 0;
            switch (a.f165020a[hVar.ordinal()]) {
                case 1:
                    tj.g.f0 f0Var = new tj.g.f0();
                    f0Var.f164906a = this.f165011a;
                    f0Var.f164907b = this.f165012b;
                    g(f0Var, attributes);
                    j(f0Var, attributes);
                    f(f0Var, attributes);
                    m(f0Var, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim = attributes.getValue(i15).trim();
                        int i16 = a.f165021b[sn.a.a(attributes, i15)];
                        if (i16 == 1) {
                            f0Var.f164867p = s(strTrim);
                        } else if (i16 == 2) {
                            f0Var.f164868q = s(strTrim);
                        } else if (i16 == 3) {
                            tj.g.p pVarS = s(strTrim);
                            f0Var.f164869r = pVarS;
                            if (pVarS.f()) {
                                sn.a.q("Invalid <svg> element. width cannot be negative");
                                return;
                            }
                        } else if (i16 != 4) {
                            continue;
                        } else {
                            tj.g.p pVarS2 = s(strTrim);
                            f0Var.f164870s = pVarS2;
                            if (pVarS2.f()) {
                                sn.a.q("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        }
                        i15++;
                    }
                    tj.g.j0 j0Var = this.f165012b;
                    if (j0Var == null) {
                        this.f165011a.f164761a = f0Var;
                    } else {
                        j0Var.h(f0Var);
                    }
                    this.f165012b = f0Var;
                    return;
                case 2:
                case 3:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.m mVar = new tj.g.m();
                    mVar.f164906a = this.f165011a;
                    mVar.f164907b = this.f165012b;
                    g(mVar, attributes);
                    j(mVar, attributes);
                    l(mVar, attributes);
                    f(mVar, attributes);
                    this.f165012b.h(mVar);
                    this.f165012b = mVar;
                    return;
                case 4:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.h hVar2 = new tj.g.h();
                    hVar2.f164906a = this.f165011a;
                    hVar2.f164907b = this.f165012b;
                    g(hVar2, attributes);
                    j(hVar2, attributes);
                    l(hVar2, attributes);
                    this.f165012b.h(hVar2);
                    this.f165012b = hVar2;
                    return;
                case 5:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.e1 e1Var = new tj.g.e1();
                    e1Var.f164906a = this.f165011a;
                    e1Var.f164907b = this.f165012b;
                    g(e1Var, attributes);
                    j(e1Var, attributes);
                    l(e1Var, attributes);
                    f(e1Var, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim2 = attributes.getValue(i15).trim();
                        int i17 = a.f165021b[sn.a.a(attributes, i15)];
                        if (i17 == 1) {
                            e1Var.f164860p = s(strTrim2);
                        } else if (i17 == 2) {
                            e1Var.f164861q = s(strTrim2);
                        } else if (i17 == 3) {
                            tj.g.p pVarS3 = s(strTrim2);
                            e1Var.f164862r = pVarS3;
                            if (pVarS3.f()) {
                                sn.a.q("Invalid <use> element. width cannot be negative");
                                return;
                            }
                        } else if (i17 == 4) {
                            tj.g.p pVarS4 = s(strTrim2);
                            e1Var.f164863s = pVarS4;
                            if (pVarS4.f()) {
                                sn.a.q("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (i17 == 6 && ("".equals(attributes.getURI(i15)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i15)))) {
                            e1Var.f164859o = strTrim2;
                        }
                        i15++;
                    }
                    this.f165012b.h(e1Var);
                    this.f165012b = e1Var;
                    return;
                case 6:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.v vVar = new tj.g.v();
                    vVar.f164906a = this.f165011a;
                    vVar.f164907b = this.f165012b;
                    g(vVar, attributes);
                    j(vVar, attributes);
                    l(vVar, attributes);
                    f(vVar, attributes);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim3 = attributes.getValue(i18).trim();
                        int i19 = a.f165021b[sn.a.a(attributes, i18)];
                        float f16 = 0.0f;
                        if (i19 == 8) {
                            C3096i c3096i = new C3096i(strTrim3);
                            tj.g.w wVar = new tj.g.w();
                            if (!c3096i.f()) {
                                int iIntValue = c3096i.h().intValue();
                                int i24 = 109;
                                if (iIntValue == 77 || iIntValue == 109) {
                                    float f17 = 0.0f;
                                    float fI2 = 0.0f;
                                    float f18 = 0.0f;
                                    float fC = 0.0f;
                                    float f19 = 0.0f;
                                    float f22 = 0.0f;
                                    while (true) {
                                        c3096i.q();
                                        switch (iIntValue) {
                                            case 65:
                                            case 97:
                                                f16 = f16;
                                                c14 = 'a';
                                                float fI3 = c3096i.i();
                                                float f24 = f18;
                                                float fC2 = c3096i.c(fI3);
                                                float fC3 = c3096i.c(fC2);
                                                Boolean boolB = c3096i.b(Float.valueOf(fC3));
                                                Boolean boolB2 = c3096i.b(boolB);
                                                if (boolB2 == null) {
                                                    fI = Float.NaN;
                                                } else {
                                                    c3096i.p();
                                                    fI = c3096i.i();
                                                }
                                                float fC4 = c3096i.c(fI);
                                                if (!Float.isNaN(fC4) && fI3 >= f16 && fC2 >= f16) {
                                                    if (iIntValue == 97) {
                                                        fI += f17;
                                                        fC4 += f24;
                                                    }
                                                    boolean zBooleanValue = boolB.booleanValue();
                                                    boolean zBooleanValue2 = boolB2.booleanValue();
                                                    f14 = fI;
                                                    float f25 = fC4;
                                                    i24 = 109;
                                                    wVar.d(fI3, fC2, fC3, zBooleanValue, zBooleanValue2, f14, f25);
                                                    fI2 = f14;
                                                    f18 = f25;
                                                    fC = f18;
                                                    c3096i.p();
                                                    if (c3096i.f()) {
                                                        i14 = c3096i.f165103b;
                                                        if (i14 != c3096i.f165104c && (((cCharAt = c3096i.f165102a.charAt(i14)) >= c14 && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                            iIntValue = c3096i.h().intValue();
                                                        }
                                                        f16 = f16;
                                                        i24 = i24;
                                                        f17 = f14;
                                                    }
                                                }
                                                break;
                                            case 67:
                                            case 99:
                                                f16 = f16;
                                                c14 = 'a';
                                                float fI4 = c3096i.i();
                                                float fC5 = c3096i.c(fI4);
                                                float fC6 = c3096i.c(fC5);
                                                float fC7 = c3096i.c(fC6);
                                                float fC8 = c3096i.c(fC7);
                                                float fC9 = c3096i.c(fC8);
                                                if (!Float.isNaN(fC9)) {
                                                    if (iIntValue == 99) {
                                                        fC8 += f17;
                                                        fC9 += f18;
                                                        fI4 += f17;
                                                        fC5 += f18;
                                                        fC6 += f17;
                                                        fC7 += f18;
                                                    }
                                                    float f26 = fC5;
                                                    float f27 = fC6;
                                                    float f28 = fC7;
                                                    float f29 = fC8;
                                                    float f34 = fC9;
                                                    wVar.b(fI4, f26, f27, f28, f29, f34);
                                                    fI2 = f27;
                                                    fC = f28;
                                                    f18 = f34;
                                                    f14 = f29;
                                                    i24 = 109;
                                                    c3096i.p();
                                                    if (c3096i.f()) {
                                                        i14 = c3096i.f165103b;
                                                        if (i14 != c3096i.f165104c) {
                                                            iIntValue = c3096i.h().intValue();
                                                        }
                                                        f16 = f16;
                                                        i24 = i24;
                                                        f17 = f14;
                                                    }
                                                }
                                                break;
                                            case 72:
                                            case 104:
                                                f16 = f16;
                                                c14 = 'a';
                                                float fI5 = c3096i.i();
                                                if (!Float.isNaN(fI5)) {
                                                    if (iIntValue == 104) {
                                                        fI5 += f17;
                                                    }
                                                    float f35 = fI5;
                                                    wVar.c(f35, f18);
                                                    fI2 = f35;
                                                    f14 = fI2;
                                                    i24 = i24;
                                                    c3096i.p();
                                                    if (c3096i.f()) {
                                                        i14 = c3096i.f165103b;
                                                        if (i14 != c3096i.f165104c) {
                                                            iIntValue = c3096i.h().intValue();
                                                        }
                                                        f16 = f16;
                                                        i24 = i24;
                                                        f17 = f14;
                                                    }
                                                }
                                                break;
                                            case 76:
                                            case 108:
                                                f16 = f16;
                                                c14 = 'a';
                                                float fI6 = c3096i.i();
                                                float fC10 = c3096i.c(fI6);
                                                if (!Float.isNaN(fC10)) {
                                                    if (iIntValue == 108) {
                                                        fI6 += f17;
                                                        fC10 += f18;
                                                    }
                                                    float f36 = fI6;
                                                    f18 = fC10;
                                                    wVar.c(f36, f18);
                                                    fI2 = f36;
                                                    f14 = fI2;
                                                    fC = f18;
                                                    i24 = i24;
                                                    c3096i.p();
                                                    if (c3096i.f()) {
                                                        i14 = c3096i.f165103b;
                                                        if (i14 != c3096i.f165104c) {
                                                            iIntValue = c3096i.h().intValue();
                                                        }
                                                        f16 = f16;
                                                        i24 = i24;
                                                        f17 = f14;
                                                    }
                                                }
                                                break;
                                            case 77:
                                            case 109:
                                                f16 = f16;
                                                c14 = 'a';
                                                float fI7 = c3096i.i();
                                                float fC11 = c3096i.c(fI7);
                                                if (!Float.isNaN(fC11)) {
                                                    if (iIntValue == i24 && wVar.f164944b != 0) {
                                                        fI7 += f17;
                                                        fC11 += f18;
                                                    }
                                                    float f37 = fI7;
                                                    f18 = fC11;
                                                    wVar.a(f37, f18);
                                                    fI2 = f37;
                                                    f14 = fI2;
                                                    f19 = f14;
                                                    fC = f18;
                                                    f22 = fC;
                                                    iIntValue = iIntValue != i24 ? 76 : 108;
                                                    i24 = i24;
                                                    c3096i.p();
                                                    if (c3096i.f()) {
                                                        i14 = c3096i.f165103b;
                                                        if (i14 != c3096i.f165104c) {
                                                            iIntValue = c3096i.h().intValue();
                                                        }
                                                        f16 = f16;
                                                        i24 = i24;
                                                        f17 = f14;
                                                    }
                                                }
                                                break;
                                            case 81:
                                            case 113:
                                                c14 = 'a';
                                                fI2 = c3096i.i();
                                                fC = c3096i.c(fI2);
                                                float fC12 = c3096i.c(fC);
                                                float fC13 = c3096i.c(fC12);
                                                if (!Float.isNaN(fC13)) {
                                                    if (iIntValue == 113) {
                                                        fC12 += f17;
                                                        fC13 += f18;
                                                        fI2 += f17;
                                                        fC += f18;
                                                    }
                                                    f15 = fC12;
                                                    f18 = fC13;
                                                    wVar.e(fI2, fC, f15, f18);
                                                    f14 = f15;
                                                    i24 = i24;
                                                    c3096i.p();
                                                    if (c3096i.f()) {
                                                        i14 = c3096i.f165103b;
                                                        if (i14 != c3096i.f165104c) {
                                                            iIntValue = c3096i.h().intValue();
                                                        }
                                                        f16 = f16;
                                                        i24 = i24;
                                                        f17 = f14;
                                                    }
                                                }
                                                break;
                                            case 83:
                                            case 115:
                                                float f38 = (f17 * 2.0f) - fI2;
                                                float f39 = (2.0f * f18) - fC;
                                                float fI8 = c3096i.i();
                                                float fC14 = c3096i.c(fI8);
                                                float fC15 = c3096i.c(fC14);
                                                float fC16 = c3096i.c(fC15);
                                                if (!Float.isNaN(fC16)) {
                                                    if (iIntValue == 115) {
                                                        fC15 += f17;
                                                        fC16 += f18;
                                                        fI8 += f17;
                                                        fC14 += f18;
                                                    }
                                                    float f44 = fC14;
                                                    float f45 = fC16;
                                                    float f46 = fI8;
                                                    c14 = 'a';
                                                    wVar.b(f38, f39, f46, f44, fC15, f45);
                                                    fI2 = f46;
                                                    fC = f44;
                                                    f15 = fC15;
                                                    f18 = f45;
                                                    f14 = f15;
                                                    i24 = i24;
                                                    c3096i.p();
                                                    if (c3096i.f()) {
                                                        i14 = c3096i.f165103b;
                                                        if (i14 != c3096i.f165104c) {
                                                            iIntValue = c3096i.h().intValue();
                                                        }
                                                        f16 = f16;
                                                        i24 = i24;
                                                        f17 = f14;
                                                    }
                                                }
                                                break;
                                            case 84:
                                            case 116:
                                                fI2 = (f17 * 2.0f) - fI2;
                                                fC = (2.0f * f18) - fC;
                                                float fI9 = c3096i.i();
                                                float fC17 = c3096i.c(fI9);
                                                if (!Float.isNaN(fC17)) {
                                                    if (iIntValue == 116) {
                                                        fI9 += f17;
                                                        fC17 += f18;
                                                    }
                                                    float f47 = fI9;
                                                    f18 = fC17;
                                                    wVar.e(fI2, fC, f47, f18);
                                                    f14 = f47;
                                                    c14 = 'a';
                                                    c3096i.p();
                                                    if (c3096i.f()) {
                                                        i14 = c3096i.f165103b;
                                                        if (i14 != c3096i.f165104c) {
                                                            iIntValue = c3096i.h().intValue();
                                                        }
                                                        f16 = f16;
                                                        i24 = i24;
                                                        f17 = f14;
                                                    }
                                                }
                                                break;
                                            case 86:
                                            case 118:
                                                float fI10 = c3096i.i();
                                                if (!Float.isNaN(fI10)) {
                                                    if (iIntValue == 118) {
                                                        fI10 += f18;
                                                    }
                                                    f18 = fI10;
                                                    wVar.c(f17, f18);
                                                    f14 = f17;
                                                    fC = f18;
                                                    c14 = 'a';
                                                    c3096i.p();
                                                    if (c3096i.f()) {
                                                        i14 = c3096i.f165103b;
                                                        if (i14 != c3096i.f165104c) {
                                                            iIntValue = c3096i.h().intValue();
                                                        }
                                                        f16 = f16;
                                                        i24 = i24;
                                                        f17 = f14;
                                                    }
                                                }
                                                break;
                                            case 90:
                                            case 122:
                                                wVar.close();
                                                f16 = f16;
                                                fI2 = f19;
                                                f14 = fI2;
                                                f18 = f22;
                                                fC = f18;
                                                c14 = 'a';
                                                c3096i.p();
                                                if (c3096i.f()) {
                                                    i14 = c3096i.f165103b;
                                                    if (i14 != c3096i.f165104c) {
                                                        iIntValue = c3096i.h().intValue();
                                                    }
                                                    f16 = f16;
                                                    i24 = i24;
                                                    f17 = f14;
                                                }
                                                break;
                                        }
                                    }
                                }
                            }
                            vVar.f164941o = wVar;
                        } else if (i19 == 9 && p(strTrim3) < 0.0f) {
                            sn.a.q("Invalid <path> element. pathLength cannot be negative");
                            return;
                        }
                    }
                    this.f165012b.h(vVar);
                    return;
                case 7:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.b0 b0Var = new tj.g.b0();
                    b0Var.f164906a = this.f165011a;
                    b0Var.f164907b = this.f165012b;
                    g(b0Var, attributes);
                    j(b0Var, attributes);
                    l(b0Var, attributes);
                    f(b0Var, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim4 = attributes.getValue(i15).trim();
                        int i25 = a.f165021b[sn.a.a(attributes, i15)];
                        if (i25 == 1) {
                            b0Var.f164773o = s(strTrim4);
                        } else if (i25 == 2) {
                            b0Var.f164774p = s(strTrim4);
                        } else if (i25 == 3) {
                            tj.g.p pVarS5 = s(strTrim4);
                            b0Var.f164775q = pVarS5;
                            if (pVarS5.f()) {
                                sn.a.q("Invalid <rect> element. width cannot be negative");
                                return;
                            }
                        } else if (i25 == 4) {
                            tj.g.p pVarS6 = s(strTrim4);
                            b0Var.f164776r = pVarS6;
                            if (pVarS6.f()) {
                                sn.a.q("Invalid <rect> element. height cannot be negative");
                                return;
                            }
                        } else if (i25 == 10) {
                            tj.g.p pVarS7 = s(strTrim4);
                            b0Var.f164777s = pVarS7;
                            if (pVarS7.f()) {
                                sn.a.q("Invalid <rect> element. rx cannot be negative");
                                return;
                            }
                        } else if (i25 != 11) {
                            continue;
                        } else {
                            tj.g.p pVarS8 = s(strTrim4);
                            b0Var.f164778t = pVarS8;
                            if (pVarS8.f()) {
                                sn.a.q("Invalid <rect> element. ry cannot be negative");
                                return;
                            }
                        }
                        i15++;
                    }
                    this.f165012b.h(b0Var);
                    return;
                case 8:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.d dVar = new tj.g.d();
                    dVar.f164906a = this.f165011a;
                    dVar.f164907b = this.f165012b;
                    g(dVar, attributes);
                    j(dVar, attributes);
                    l(dVar, attributes);
                    f(dVar, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim5 = attributes.getValue(i15).trim();
                        switch (a.f165021b[sn.a.a(attributes, i15)]) {
                            case 12:
                                dVar.f164784o = s(strTrim5);
                                break;
                            case 13:
                                dVar.f164785p = s(strTrim5);
                                break;
                            case 14:
                                tj.g.p pVarS9 = s(strTrim5);
                                dVar.f164786q = pVarS9;
                                if (pVarS9.f()) {
                                    sn.a.q("Invalid <circle> element. r cannot be negative");
                                    return;
                                }
                                break;
                                break;
                        }
                        i15++;
                    }
                    this.f165012b.h(dVar);
                    return;
                case 9:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.i iVar = new tj.g.i();
                    iVar.f164906a = this.f165011a;
                    iVar.f164907b = this.f165012b;
                    g(iVar, attributes);
                    j(iVar, attributes);
                    l(iVar, attributes);
                    f(iVar, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim6 = attributes.getValue(i15).trim();
                        switch (a.f165021b[sn.a.a(attributes, i15)]) {
                            case 10:
                                tj.g.p pVarS10 = s(strTrim6);
                                iVar.f164879q = pVarS10;
                                if (pVarS10.f()) {
                                    sn.a.q("Invalid <ellipse> element. rx cannot be negative");
                                    return;
                                }
                                break;
                                break;
                            case 11:
                                tj.g.p pVarS11 = s(strTrim6);
                                iVar.f164880r = pVarS11;
                                if (pVarS11.f()) {
                                    sn.a.q("Invalid <ellipse> element. ry cannot be negative");
                                    return;
                                }
                                break;
                                break;
                            case 12:
                                iVar.f164877o = s(strTrim6);
                                break;
                            case 13:
                                iVar.f164878p = s(strTrim6);
                                break;
                        }
                        i15++;
                    }
                    this.f165012b.h(iVar);
                    return;
                case 10:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.q qVar = new tj.g.q();
                    qVar.f164906a = this.f165011a;
                    qVar.f164907b = this.f165012b;
                    g(qVar, attributes);
                    j(qVar, attributes);
                    l(qVar, attributes);
                    f(qVar, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim7 = attributes.getValue(i15).trim();
                        switch (a.f165021b[sn.a.a(attributes, i15)]) {
                            case 15:
                                qVar.f164917o = s(strTrim7);
                                break;
                            case 16:
                                qVar.f164918p = s(strTrim7);
                                break;
                            case 17:
                                qVar.f164919q = s(strTrim7);
                                break;
                            case 18:
                                qVar.f164920r = s(strTrim7);
                                break;
                        }
                        i15++;
                    }
                    this.f165012b.h(qVar);
                    return;
                case 11:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.z zVar = new tj.g.z();
                    zVar.f164906a = this.f165011a;
                    zVar.f164907b = this.f165012b;
                    g(zVar, attributes);
                    j(zVar, attributes);
                    l(zVar, attributes);
                    f(zVar, attributes);
                    i(zVar, attributes, "polyline");
                    this.f165012b.h(zVar);
                    return;
                case 12:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.a0 a0Var = new tj.g.a0();
                    a0Var.f164906a = this.f165011a;
                    a0Var.f164907b = this.f165012b;
                    g(a0Var, attributes);
                    j(a0Var, attributes);
                    l(a0Var, attributes);
                    f(a0Var, attributes);
                    i(a0Var, attributes, "polygon");
                    this.f165012b.h(a0Var);
                    return;
                case 13:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.w0 w0Var = new tj.g.w0();
                    w0Var.f164906a = this.f165011a;
                    w0Var.f164907b = this.f165012b;
                    g(w0Var, attributes);
                    j(w0Var, attributes);
                    l(w0Var, attributes);
                    f(w0Var, attributes);
                    k(w0Var, attributes);
                    this.f165012b.h(w0Var);
                    this.f165012b = w0Var;
                    return;
                case 14:
                    tj.g.j0 j0Var2 = this.f165012b;
                    if (j0Var2 == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(j0Var2 instanceof tj.g.y0)) {
                        sn.a.q("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                    tj.g.v0 v0Var = new tj.g.v0();
                    v0Var.f164906a = this.f165011a;
                    v0Var.f164907b = this.f165012b;
                    g(v0Var, attributes);
                    j(v0Var, attributes);
                    f(v0Var, attributes);
                    k(v0Var, attributes);
                    this.f165012b.h(v0Var);
                    this.f165012b = v0Var;
                    tj.g.j0 j0Var3 = v0Var.f164907b;
                    if (j0Var3 instanceof tj.g.b1) {
                        v0Var.f164942r = (tj.g.b1) j0Var3;
                        return;
                    } else {
                        v0Var.f164942r = ((tj.g.x0) j0Var3).b();
                        return;
                    }
                case 15:
                    tj.g.j0 j0Var4 = this.f165012b;
                    if (j0Var4 == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(j0Var4 instanceof tj.g.y0)) {
                        sn.a.q("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                    tj.g.u0 u0Var = new tj.g.u0();
                    u0Var.f164906a = this.f165011a;
                    u0Var.f164907b = this.f165012b;
                    g(u0Var, attributes);
                    j(u0Var, attributes);
                    f(u0Var, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim8 = attributes.getValue(i15).trim();
                        if (a.f165021b[sn.a.a(attributes, i15)] == 6 && ("".equals(attributes.getURI(i15)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i15)))) {
                            u0Var.f164939n = strTrim8;
                        }
                        i15++;
                    }
                    this.f165012b.h(u0Var);
                    tj.g.j0 j0Var5 = u0Var.f164907b;
                    if (j0Var5 instanceof tj.g.b1) {
                        u0Var.f164940o = (tj.g.b1) j0Var5;
                        return;
                    } else {
                        u0Var.f164940o = ((tj.g.x0) j0Var5).b();
                        return;
                    }
                case 16:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.s0 s0Var = new tj.g.s0();
                    s0Var.f164906a = this.f165011a;
                    s0Var.f164907b = this.f165012b;
                    g(s0Var, attributes);
                    j(s0Var, attributes);
                    l(s0Var, attributes);
                    f(s0Var, attributes);
                    this.f165012b.h(s0Var);
                    this.f165012b = s0Var;
                    return;
                case 17:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.t0 t0Var = new tj.g.t0();
                    t0Var.f164906a = this.f165011a;
                    t0Var.f164907b = this.f165012b;
                    g(t0Var, attributes);
                    j(t0Var, attributes);
                    f(t0Var, attributes);
                    m(t0Var, attributes);
                    this.f165012b.h(t0Var);
                    this.f165012b = t0Var;
                    return;
                case 18:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.r rVar = new tj.g.r();
                    rVar.f164906a = this.f165011a;
                    rVar.f164907b = this.f165012b;
                    g(rVar, attributes);
                    j(rVar, attributes);
                    f(rVar, attributes);
                    m(rVar, attributes);
                    for (int i26 = 0; i26 < attributes.getLength(); i26++) {
                        String strTrim9 = attributes.getValue(i26).trim();
                        switch (a.f165021b[sn.a.a(attributes, i26)]) {
                            case 26:
                                rVar.f164927q = s(strTrim9);
                                break;
                            case 27:
                                rVar.f164928r = s(strTrim9);
                                break;
                            case 28:
                                tj.g.p pVarS12 = s(strTrim9);
                                rVar.f164929s = pVarS12;
                                if (pVarS12.f()) {
                                    sn.a.q("Invalid <marker> element. markerWidth cannot be negative");
                                    return;
                                }
                                break;
                                break;
                            case 29:
                                tj.g.p pVarS13 = s(strTrim9);
                                rVar.f164930t = pVarS13;
                                if (pVarS13.f()) {
                                    sn.a.q("Invalid <marker> element. markerHeight cannot be negative");
                                    return;
                                }
                                break;
                                break;
                            case 30:
                                if ("strokeWidth".equals(strTrim9)) {
                                    rVar.f164926p = false;
                                } else {
                                    if (!"userSpaceOnUse".equals(strTrim9)) {
                                        sn.a.q("Invalid value for attribute markerUnits");
                                        return;
                                    }
                                    rVar.f164926p = true;
                                }
                                break;
                            case 31:
                                if (TtmlNode.TEXT_EMPHASIS_AUTO.equals(strTrim9)) {
                                    rVar.f164931u = Float.valueOf(Float.NaN);
                                } else {
                                    rVar.f164931u = Float.valueOf(p(strTrim9));
                                }
                                break;
                        }
                    }
                    this.f165012b.h(rVar);
                    this.f165012b = rVar;
                    return;
                case 19:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.m0 m0Var = new tj.g.m0();
                    m0Var.f164906a = this.f165011a;
                    m0Var.f164907b = this.f165012b;
                    g(m0Var, attributes);
                    j(m0Var, attributes);
                    h(m0Var, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim10 = attributes.getValue(i15).trim();
                        switch (a.f165021b[sn.a.a(attributes, i15)]) {
                            case 15:
                                m0Var.f164902m = s(strTrim10);
                                break;
                            case 16:
                                m0Var.f164903n = s(strTrim10);
                                break;
                            case 17:
                                m0Var.f164904o = s(strTrim10);
                                break;
                            case 18:
                                m0Var.f164905p = s(strTrim10);
                                break;
                        }
                        i15++;
                    }
                    this.f165012b.h(m0Var);
                    this.f165012b = m0Var;
                    return;
                case 20:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.q0 q0Var = new tj.g.q0();
                    q0Var.f164906a = this.f165011a;
                    q0Var.f164907b = this.f165012b;
                    g(q0Var, attributes);
                    j(q0Var, attributes);
                    h(q0Var, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim11 = attributes.getValue(i15).trim();
                        int i27 = a.f165021b[sn.a.a(attributes, i15)];
                        if (i27 == 35) {
                            q0Var.f164924p = s(strTrim11);
                        } else if (i27 != 36) {
                            switch (i27) {
                                case 12:
                                    q0Var.f164921m = s(strTrim11);
                                    break;
                                case 13:
                                    q0Var.f164922n = s(strTrim11);
                                    break;
                                case 14:
                                    tj.g.p pVarS14 = s(strTrim11);
                                    q0Var.f164923o = pVarS14;
                                    if (pVarS14.f()) {
                                        sn.a.q("Invalid <radialGradient> element. r cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                            }
                        } else {
                            q0Var.f164925q = s(strTrim11);
                        }
                        i15++;
                    }
                    this.f165012b.h(q0Var);
                    this.f165012b = q0Var;
                    return;
                case 21:
                    tj.g.j0 j0Var6 = this.f165012b;
                    if (j0Var6 == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(j0Var6 instanceof tj.g.j)) {
                        sn.a.q("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                    tj.g.d0 d0Var = new tj.g.d0();
                    d0Var.f164906a = this.f165011a;
                    d0Var.f164907b = this.f165012b;
                    g(d0Var, attributes);
                    j(d0Var, attributes);
                    for (int i28 = 0; i28 < attributes.getLength(); i28++) {
                        String strTrim12 = attributes.getValue(i28).trim();
                        if (a.f165021b[sn.a.a(attributes, i28)] == 37) {
                            if (strTrim12.length() == 0) {
                                sn.a.q("Invalid offset value in <stop> (empty string)");
                                return;
                            }
                            int length = strTrim12.length();
                            if (strTrim12.charAt(strTrim12.length() - 1) == '%') {
                                length--;
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            try {
                                float fO = o(length, strTrim12);
                                float f48 = 100.0f;
                                if (z14) {
                                    fO /= 100.0f;
                                }
                                if (fO < 0.0f) {
                                    f48 = 0.0f;
                                } else if (fO <= 100.0f) {
                                    f48 = fO;
                                }
                                d0Var.f164787h = Float.valueOf(f48);
                            } catch (NumberFormatException e4) {
                                throw new SVGParseException("Invalid offset value in <stop>: ".concat(strTrim12), e4);
                            }
                        }
                    }
                    this.f165012b.h(d0Var);
                    this.f165012b = d0Var;
                    return;
                case 22:
                case 23:
                    this.f165015e = true;
                    this.f165016f = hVar;
                    return;
                case 24:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.e eVar = new tj.g.e();
                    eVar.f164906a = this.f165011a;
                    eVar.f164907b = this.f165012b;
                    g(eVar, attributes);
                    j(eVar, attributes);
                    l(eVar, attributes);
                    f(eVar, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim13 = attributes.getValue(i15).trim();
                        if (a.f165021b[sn.a.a(attributes, i15)] == 38) {
                            if ("objectBoundingBox".equals(strTrim13)) {
                                eVar.f164798o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim13)) {
                                    sn.a.q("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                                eVar.f164798o = Boolean.TRUE;
                            }
                        }
                        i15++;
                    }
                    this.f165012b.h(eVar);
                    this.f165012b = eVar;
                    return;
                case 25:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.z0 z0Var = new tj.g.z0();
                    z0Var.f164906a = this.f165011a;
                    z0Var.f164907b = this.f165012b;
                    g(z0Var, attributes);
                    j(z0Var, attributes);
                    f(z0Var, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim14 = attributes.getValue(i15).trim();
                        int i29 = a.f165021b[sn.a.a(attributes, i15)];
                        if (i29 != 6) {
                            if (i29 == 39) {
                                z0Var.f164958o = s(strTrim14);
                            }
                        } else if ("".equals(attributes.getURI(i15)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i15))) {
                            z0Var.f164957n = strTrim14;
                        }
                        i15++;
                    }
                    this.f165012b.h(z0Var);
                    this.f165012b = z0Var;
                    tj.g.j0 j0Var7 = z0Var.f164907b;
                    if (j0Var7 instanceof tj.g.b1) {
                        z0Var.f164959p = (tj.g.b1) j0Var7;
                        return;
                    } else {
                        z0Var.f164959p = ((tj.g.x0) j0Var7).b();
                        return;
                    }
                case 26:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.y yVar = new tj.g.y();
                    yVar.f164906a = this.f165011a;
                    yVar.f164907b = this.f165012b;
                    g(yVar, attributes);
                    j(yVar, attributes);
                    f(yVar, attributes);
                    m(yVar, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim15 = attributes.getValue(i15).trim();
                        int i30 = a.f165021b[sn.a.a(attributes, i15)];
                        if (i30 == 1) {
                            yVar.f164951s = s(strTrim15);
                        } else if (i30 == 2) {
                            yVar.f164952t = s(strTrim15);
                        } else if (i30 == 3) {
                            tj.g.p pVarS15 = s(strTrim15);
                            yVar.f164953u = pVarS15;
                            if (pVarS15.f()) {
                                sn.a.q("Invalid <pattern> element. width cannot be negative");
                                return;
                            }
                        } else if (i30 == 4) {
                            tj.g.p pVarS16 = s(strTrim15);
                            yVar.f164954v = pVarS16;
                            if (pVarS16.f()) {
                                sn.a.q("Invalid <pattern> element. height cannot be negative");
                                return;
                            }
                        } else if (i30 != 6) {
                            switch (i30) {
                                case 40:
                                    if ("objectBoundingBox".equals(strTrim15)) {
                                        yVar.f164948p = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim15)) {
                                            sn.a.q("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                        yVar.f164948p = Boolean.TRUE;
                                    }
                                    break;
                                case 41:
                                    if ("objectBoundingBox".equals(strTrim15)) {
                                        yVar.f164949q = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim15)) {
                                            sn.a.q("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                        yVar.f164949q = Boolean.TRUE;
                                    }
                                    break;
                                case 42:
                                    yVar.f164950r = z(strTrim15);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i15)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i15))) {
                            yVar.f164955w = strTrim15;
                        }
                        i15++;
                    }
                    this.f165012b.h(yVar);
                    this.f165012b = yVar;
                    return;
                case 27:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.o oVar = new tj.g.o();
                    oVar.f164906a = this.f165011a;
                    oVar.f164907b = this.f165012b;
                    g(oVar, attributes);
                    j(oVar, attributes);
                    l(oVar, attributes);
                    f(oVar, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim16 = attributes.getValue(i15).trim();
                        int i34 = a.f165021b[sn.a.a(attributes, i15)];
                        if (i34 == 1) {
                            oVar.f164909p = s(strTrim16);
                        } else if (i34 == 2) {
                            oVar.f164910q = s(strTrim16);
                        } else if (i34 == 3) {
                            tj.g.p pVarS17 = s(strTrim16);
                            oVar.f164911r = pVarS17;
                            if (pVarS17.f()) {
                                sn.a.q("Invalid <use> element. width cannot be negative");
                                return;
                            }
                        } else if (i34 == 4) {
                            tj.g.p pVarS18 = s(strTrim16);
                            oVar.f164912s = pVarS18;
                            if (pVarS18.f()) {
                                sn.a.q("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (i34 != 6) {
                            if (i34 == 7) {
                                x(oVar, strTrim16);
                            }
                        } else if ("".equals(attributes.getURI(i15)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i15))) {
                            oVar.f164908o = strTrim16;
                        }
                        i15++;
                    }
                    this.f165012b.h(oVar);
                    this.f165012b = oVar;
                    return;
                case 28:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.f1 f1Var = new tj.g.f1();
                    f1Var.f164906a = this.f165011a;
                    f1Var.f164907b = this.f165012b;
                    g(f1Var, attributes);
                    f(f1Var, attributes);
                    m(f1Var, attributes);
                    this.f165012b.h(f1Var);
                    this.f165012b = f1Var;
                    return;
                case 29:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.s sVar = new tj.g.s();
                    sVar.f164906a = this.f165011a;
                    sVar.f164907b = this.f165012b;
                    g(sVar, attributes);
                    j(sVar, attributes);
                    f(sVar, attributes);
                    while (i15 < attributes.getLength()) {
                        String strTrim17 = attributes.getValue(i15).trim();
                        int i35 = a.f165021b[sn.a.a(attributes, i15)];
                        if (i35 == 1) {
                            s(strTrim17);
                        } else if (i35 == 2) {
                            s(strTrim17);
                        } else if (i35 == 3) {
                            tj.g.p pVarS19 = s(strTrim17);
                            sVar.f164935p = pVarS19;
                            if (pVarS19.f()) {
                                sn.a.q("Invalid <mask> element. width cannot be negative");
                                return;
                            }
                        } else if (i35 == 4) {
                            tj.g.p pVarS20 = s(strTrim17);
                            sVar.f164936q = pVarS20;
                            if (pVarS20.f()) {
                                sn.a.q("Invalid <mask> element. height cannot be negative");
                                return;
                            }
                        } else if (i35 != 43) {
                            if (i35 != 44) {
                                continue;
                            } else if ("objectBoundingBox".equals(strTrim17)) {
                                sVar.f164934o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim17)) {
                                    sn.a.q("Invalid value for attribute maskContentUnits");
                                    return;
                                }
                                sVar.f164934o = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim17)) {
                            sVar.f164933n = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim17)) {
                                sn.a.q("Invalid value for attribute maskUnits");
                                return;
                            }
                            sVar.f164933n = Boolean.TRUE;
                        }
                        i15++;
                    }
                    this.f165012b.h(sVar);
                    this.f165012b = sVar;
                    return;
                case 30:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    String str4 = TtmlNode.COMBINE_ALL;
                    boolean zEquals = true;
                    while (i15 < attributes.getLength()) {
                        String strTrim18 = attributes.getValue(i15).trim();
                        int i36 = a.f165021b[sn.a.a(attributes, i15)];
                        if (i36 == 88) {
                            zEquals = strTrim18.equals("text/css");
                        } else if (i36 == 89) {
                            str4 = strTrim18;
                        }
                        i15++;
                    }
                    if (zEquals) {
                        tj.b.f fVar = tj.b.f.screen;
                        tj.b.d dVar2 = new tj.b.d(str4);
                        dVar2.q();
                        for (tj.b.f fVar2 : tj.b.c(dVar2)) {
                            if (fVar2 == tj.b.f.all || fVar2 == fVar) {
                                this.f165018h = true;
                                return;
                            }
                        }
                    }
                    this.f165013c = true;
                    this.f165014d = 1;
                    return;
                case 31:
                    if (this.f165012b == null) {
                        sn.a.q("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tj.g.c0 c0Var = new tj.g.c0();
                    c0Var.f164906a = this.f165011a;
                    c0Var.f164907b = this.f165012b;
                    g(c0Var, attributes);
                    j(c0Var, attributes);
                    this.f165012b.h(c0Var);
                    this.f165012b = c0Var;
                    return;
                default:
                    this.f165013c = true;
                    this.f165014d = 1;
                    return;
            }
        }
    }

    public final void E(String str) {
        if (this.f165013c) {
            return;
        }
        if (this.f165015e) {
            if (this.f165017g == null) {
                this.f165017g = new StringBuilder(str.length());
            }
            this.f165017g.append(str);
        } else if (this.f165018h) {
            if (this.f165019i == null) {
                this.f165019i = new StringBuilder(str.length());
            }
            this.f165019i.append(str);
        } else if (this.f165012b instanceof tj.g.y0) {
            a(str);
        }
    }

    public final void F(char[] cArr, int i14, int i15) {
        if (this.f165013c) {
            return;
        }
        if (this.f165015e) {
            if (this.f165017g == null) {
                this.f165017g = new StringBuilder(i15);
            }
            this.f165017g.append(cArr, i14, i15);
        } else if (this.f165018h) {
            if (this.f165019i == null) {
                this.f165019i = new StringBuilder(i15);
            }
            this.f165019i.append(cArr, i14, i15);
        } else if (this.f165012b instanceof tj.g.y0) {
            a(new String(cArr, i14, i15));
        }
    }

    public final void a(String str) {
        tj.g.h0 h0Var = (tj.g.h0) this.f165012b;
        int size = h0Var.f164872i.size();
        tj.g.n0 n0Var = size == 0 ? null : h0Var.f164872i.get(size - 1);
        if (!(n0Var instanceof tj.g.c1)) {
            this.f165012b.h(new tj.g.c1(str));
        } else {
            tj.g.c1 c1Var = (tj.g.c1) n0Var;
            c1Var.f164783c = am.j.o(c1Var.f164783c, str, new StringBuilder());
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.f165013c) {
            int i14 = this.f165014d - 1;
            this.f165014d = i14;
            if (i14 == 0) {
                this.f165013c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int[] iArr = a.f165020a;
            h hVar = (h) h.T.get(str2);
            if (hVar == null) {
                hVar = h.UNSUPPORTED;
            }
            int i15 = iArr[hVar.ordinal()];
            if (i15 != 1 && i15 != 2 && i15 != 4 && i15 != 5 && i15 != 13 && i15 != 14) {
                switch (i15) {
                    case 22:
                    case 23:
                        this.f165015e = false;
                        if (this.f165017g != null) {
                            h hVar2 = this.f165016f;
                            if (hVar2 == h.title || hVar2 == h.desc) {
                                this.f165011a.getClass();
                            }
                            this.f165017g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f165019i;
                        if (sb3 != null) {
                            this.f165018h = false;
                            String string = sb3.toString();
                            tj.b bVar = new tj.b(tj.b.f.screen, tj.b.t.Document);
                            tj.g gVar = this.f165011a;
                            tj.b.d dVar = new tj.b.d(string);
                            dVar.q();
                            gVar.f164762b.b(bVar.e(dVar));
                            this.f165019i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f165012b = ((tj.g.n0) this.f165012b).f164907b;
        }
    }

    public class f extends DefaultHandler2 {
        private f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void characters(char[] cArr, int i14, int i15) {
            i.this.E(new String(cArr, i14, i15));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endDocument() {
            i.this.getClass();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endElement(String str, String str2, String str3) {
            i.this.c(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void processingInstruction(String str, String str2) {
            C3096i c3096i = new C3096i(str2);
            i.this.getClass();
            i.y(c3096i);
            str.equals("xml-stylesheet");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startDocument() {
            i iVar = i.this;
            iVar.getClass();
            iVar.f165011a = new tj.g();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
            i.this.D(str, str2, str3, attributes);
        }

        public /* synthetic */ f(i iVar, a aVar) {
            this();
        }
    }
}
