package defpackage;

import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorRule;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.ColorPattern;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.FireworksPattern;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.KaleidoscopePattern;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.LayerPattern;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.VectorPattern;
import com.huawei.animationkit.computationalwallpaper.template.TemplateSelector;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes23.dex */
public class bfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, ColorRule> f1074a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, ClockColorRule> f1075c;
    private static final Map<String, Class<? extends Pattern>> d;
    private static bfz e;
    private TemplateSelector g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, e> f1076b = new HashMap();
    private final Map<String, a> i = new HashMap();

    static {
        HashMap map = new HashMap();
        d = map;
        HashMap map2 = new HashMap();
        f1074a = map2;
        HashMap map3 = new HashMap();
        f1075c = map3;
        e = null;
        map.put("vector", VectorPattern.class);
        map.put("kaleidoscope", KaleidoscopePattern.class);
        map.put("color", ColorPattern.class);
        map.put("fireworks", FireworksPattern.class);
        map.put("layer", LayerPattern.class);
        map2.put("flower", new beu());
        map2.put("plaid", new bew());
        map2.put("scale", new bev());
        map2.put("digital_hand", new bet());
        map2.put("digital", new bex());
        map3.put("vertical_board", new bdy());
        map3.put("horizontal_board", new bdq());
        map3.put("hand_clock", new bdp());
        map3.put("digital_hand", new bdt());
        map3.put("line_digital", new bdr());
        map3.put("slash_digital", new bdv());
    }

    private bfz() {
    }

    public static bfz c() throws bdo {
        if (e == null) {
            e = new bfz();
        }
        if (bdn.j()) {
            e.b();
        }
        return e;
    }

    static class e {
        private final List<d> e;

        private e() {
            this.e = new ArrayList();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<c> f1081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1082c;
        private String d;
        private ColorRule e;
        private int f;
        private String g;
        private float h;
        private float i;
        private Class<? extends Pattern> j;
        private String o;

        public Class<? extends Pattern> d() {
            return this.j;
        }

        public ColorRule b() {
            return this.e;
        }

        public String i() {
            return this.g;
        }

        public List<c> c() {
            return this.f1081b;
        }

        public String a() {
            return this.f1082c;
        }

        public String f() {
            return this.o;
        }

        public float g() {
            return this.h;
        }

        public float j() {
            return this.i;
        }

        public int h() {
            return this.f;
        }

        public boolean e() {
            return this.f1080a;
        }
    }

    static class a {
        private final List<c> e;

        private a() {
            this.e = new ArrayList();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1079c;
        private ClockColorRule d;
        private String e;

        public String b() {
            return this.f1079c;
        }

        public String d() {
            return this.f1078b;
        }

        public String a() {
            return this.e;
        }

        public String c() {
            return this.f1077a;
        }

        public ClockColorRule e() {
            return this.d;
        }
    }

    public TemplateSelector e() {
        if (this.g == null) {
            this.g = new bga();
        }
        return this.g;
    }

    public List<d> a(String str) throws bdo {
        if (this.f1076b.containsKey(str)) {
            return ((e) Objects.requireNonNull(this.f1076b.get(str))).e;
        }
        throw new bdo("no category " + str);
    }

    private List<c> e(String str) throws bdo {
        if (this.i.containsKey(str)) {
            return ((a) Objects.requireNonNull(this.i.get(str))).e;
        }
        throw new bdo("no clock " + str);
    }

    private void b() throws bdo {
        try {
            Log.i("Templates", "parse xml start");
            g(bdn.b());
            d();
        } catch (bdo e2) {
            Log.e("Templates", (String) Optional.ofNullable(e2.getMessage()).orElse(""));
            throw e2;
        } catch (IOException | XmlPullParserException unused) {
            Log.e("Templates", "parse xml failed, file name: " + bdn.c());
            throw new bdo("parse xml failed, file name: " + bdn.c());
        } catch (NumberFormatException e3) {
            Log.e("Templates", "number format exception", e3);
            throw new bdo(e3);
        }
    }

    private void g(String str) throws XmlPullParserException, IOException, bdo {
        FileInputStream fileInputStream = new FileInputStream(str + File.separator + bdn.c());
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(fileInputStream, "UTF-8");
        e eVar = new e();
        a aVar = new a();
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 1) {
            if (eventType != 2) {
                eventType = xmlPullParserNewPullParser.next();
            } else {
                if ("selector".equals(xmlPullParserNewPullParser.getName())) {
                    this.g = f(xmlPullParserNewPullParser.nextText());
                } else if ("category".equals(xmlPullParserNewPullParser.getName())) {
                    eVar = new e();
                    this.f1076b.put(xmlPullParserNewPullParser.getAttributeValue("", "name"), eVar);
                } else if ("pattern".equals(xmlPullParserNewPullParser.getName())) {
                    eVar.e.add(c(xmlPullParserNewPullParser));
                } else if ("clockset".equals(xmlPullParserNewPullParser.getName())) {
                    aVar = new a();
                    this.i.put(xmlPullParserNewPullParser.getAttributeValue("", "name"), aVar);
                } else if ("clock".equals(xmlPullParserNewPullParser.getName())) {
                    c cVarE = e(xmlPullParserNewPullParser);
                    if (bdn.b(cVarE.f1079c)) {
                        aVar.e.add(cVarE);
                    }
                }
                eventType = xmlPullParserNewPullParser.next();
            }
        }
    }

    private d c(XmlPullParser xmlPullParser) throws bdo {
        d dVar = new d();
        dVar.j = b(xmlPullParser.getAttributeValue("", "pattern_type"));
        dVar.e = c(xmlPullParser.getAttributeValue("", "color_rule"));
        dVar.g = xmlPullParser.getAttributeValue("", "resource");
        dVar.d = xmlPullParser.getAttributeValue("", "clock");
        dVar.f1082c = xmlPullParser.getAttributeValue("", "animation");
        dVar.o = xmlPullParser.getAttributeValue("", RemoteMessageConst.Notification.TAG);
        dVar.f = j(xmlPullParser.getAttributeValue("", "rotate_interval"));
        dVar.h = i(xmlPullParser.getAttributeValue("", "scale_min"));
        dVar.i = i(xmlPullParser.getAttributeValue("", "scale_max"));
        dVar.f1080a = Boolean.parseBoolean(xmlPullParser.getAttributeValue("", "translate"));
        return dVar;
    }

    private c e(XmlPullParser xmlPullParser) throws bdo {
        c cVar = new c();
        cVar.f1079c = xmlPullParser.getAttributeValue("", "clock_type");
        cVar.e = xmlPullParser.getAttributeValue("", "resource_en");
        cVar.f1078b = xmlPullParser.getAttributeValue("", "resource_zh");
        cVar.f1077a = xmlPullParser.getAttributeValue("", "color_mode");
        cVar.d = d(xmlPullParser.getAttributeValue("", "color_rule"));
        return cVar;
    }

    private void d() throws bdo {
        for (e eVar : this.f1076b.values()) {
            for (d dVar : eVar.e) {
                dVar.f1081b = e(dVar.d);
            }
            eVar.e.removeIf(new Predicate() { // from class: bfy
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((bfz.d) obj).f1081b.isEmpty();
                }
            });
        }
    }

    private Class<? extends Pattern> b(String str) throws bdo {
        if (str == null) {
            return null;
        }
        Map<String, Class<? extends Pattern>> map = d;
        if (!map.containsKey(str)) {
            throw new bdo("invalidate pattern type " + str);
        }
        return map.get(str);
    }

    private ColorRule c(String str) throws bdo {
        if (str == null) {
            return null;
        }
        Map<String, ColorRule> map = f1074a;
        if (!map.containsKey(str)) {
            throw new bdo("invalidate color rule " + str);
        }
        return map.get(str);
    }

    private ClockColorRule d(String str) throws bdo {
        if (str == null) {
            return null;
        }
        Map<String, ClockColorRule> map = f1075c;
        if (!map.containsKey(str)) {
            throw new bdo("invalidate clock color rule " + str);
        }
        return map.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private TemplateSelector f(String str) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -2021778750) {
            if (iHashCode != -1602342379) {
                if (iHashCode == -118531761 && str.equals("watch_selector")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("watch8_selector")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("bali_selector")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return new bgb();
        }
        if (b2 == 1) {
            return new bfx();
        }
        if (b2 == 2) {
            return new bgd();
        }
        return new bga();
    }

    private int j(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    private float i(String str) {
        if (str == null || str.isEmpty()) {
            return 1.0f;
        }
        return Float.parseFloat(str);
    }
}
