package org.threeten.bp;

import defpackage.a5p;
import defpackage.b5p;
import defpackage.crd;
import defpackage.i1s;
import defpackage.k1s;
import defpackage.kq5;
import defpackage.sv5;
import defpackage.t4p;
import defpackage.z4p;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.slf4j.Marker;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.zone.ZoneRulesException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZoneId implements Serializable {
    public static final b5p<ZoneId> FROM = new a();
    public static final Map<String, String> SHORT_IDS;
    private static final long serialVersionUID = 8352817235686L;

    public class a implements b5p<ZoneId> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ZoneId a(t4p t4pVar) {
            return ZoneId.from(t4pVar);
        }
    }

    public class b extends sv5 {
        public b() {
        }

        @Override // defpackage.t4p
        public long getLong(z4p z4pVar) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
        }

        @Override // defpackage.t4p
        public boolean isSupported(z4p z4pVar) {
            return false;
        }

        @Override // defpackage.sv5, defpackage.t4p
        public <R> R query(b5p<R> b5pVar) {
            return b5pVar == a5p.g() ? (R) ZoneId.this : (R) super.query(b5pVar);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("ART", "Africa/Cairo");
        map.put("AST", "America/Anchorage");
        map.put("BET", "America/Sao_Paulo");
        map.put("BST", "Asia/Dhaka");
        map.put("CAT", "Africa/Harare");
        map.put("CNT", "America/St_Johns");
        map.put("CST", "America/Chicago");
        map.put("CTT", "Asia/Shanghai");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("ECT", "Europe/Paris");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("IST", "Asia/Kolkata");
        map.put("JST", "Asia/Tokyo");
        map.put("MIT", "Pacific/Apia");
        map.put("NET", "Asia/Yerevan");
        map.put("NST", "Pacific/Auckland");
        map.put("PLT", "Asia/Karachi");
        map.put("PNT", "America/Phoenix");
        map.put("PRT", "America/Puerto_Rico");
        map.put("PST", "America/Los_Angeles");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("EST", "-05:00");
        map.put("MST", "-07:00");
        map.put("HST", "-10:00");
        SHORT_IDS = Collections.unmodifiableMap(map);
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != org.threeten.bp.a.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId from(t4p t4pVar) {
        ZoneId zoneId = (ZoneId) t4pVar.query(a5p.f());
        if (zoneId != null) {
            return zoneId;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName());
    }

    public static Set<String> getAvailableZoneIds() {
        return new HashSet(k1s.a());
    }

    public static ZoneId of(String str, Map<String, String> map) {
        crd.i(str, "zoneId");
        crd.i(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return of(str);
    }

    public static ZoneId ofOffset(String str, ZoneOffset zoneOffset) {
        crd.i(str, "prefix");
        crd.i(zoneOffset, "offset");
        if (str.length() == 0) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: " + str);
        }
        if (zoneOffset.getTotalSeconds() == 0) {
            return new org.threeten.bp.a(str, zoneOffset.getRules());
        }
        return new org.threeten.bp.a(str + zoneOffset.getId(), zoneOffset.getRules());
    }

    public static ZoneId systemDefault() {
        return of(TimeZone.getDefault().getID(), SHORT_IDS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new kq5().p(textStyle).w(locale).b(new b());
    }

    public abstract String getId();

    public abstract i1s getRules();

    public int hashCode() {
        return getId().hashCode();
    }

    public ZoneId normalized() {
        try {
            i1s rules = getRules();
            if (rules.e()) {
                return rules.a(Instant.EPOCH);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public String toString() {
        return getId();
    }

    public abstract void write(DataOutput dataOutput) throws IOException;

    public static ZoneId of(String str) {
        crd.i(str, "zoneId");
        if (str.equals("Z")) {
            return ZoneOffset.UTC;
        }
        if (str.length() != 1) {
            if (!str.startsWith(Marker.ANY_NON_NULL_MARKER) && !str.startsWith("-")) {
                if (!str.equals("UTC") && !str.equals("GMT") && !str.equals("UT")) {
                    if (!str.startsWith("UTC+") && !str.startsWith("GMT+") && !str.startsWith("UTC-") && !str.startsWith("GMT-")) {
                        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                            return org.threeten.bp.a.a(str, true);
                        }
                        ZoneOffset zoneOffsetOf = ZoneOffset.of(str.substring(2));
                        if (zoneOffsetOf.getTotalSeconds() == 0) {
                            return new org.threeten.bp.a("UT", zoneOffsetOf.getRules());
                        }
                        return new org.threeten.bp.a("UT" + zoneOffsetOf.getId(), zoneOffsetOf.getRules());
                    }
                    ZoneOffset zoneOffsetOf2 = ZoneOffset.of(str.substring(3));
                    if (zoneOffsetOf2.getTotalSeconds() == 0) {
                        return new org.threeten.bp.a(str.substring(0, 3), zoneOffsetOf2.getRules());
                    }
                    return new org.threeten.bp.a(str.substring(0, 3) + zoneOffsetOf2.getId(), zoneOffsetOf2.getRules());
                }
                return new org.threeten.bp.a(str, ZoneOffset.UTC.getRules());
            }
            return ZoneOffset.of(str);
        }
        throw new DateTimeException("Invalid zone: " + str);
    }
}
