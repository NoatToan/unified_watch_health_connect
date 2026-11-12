package org.threeten.bp;

import com.google.android.material.datepicker.UtcDates;
import com.xiaomi.mipush.sdk.Constants;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.zone.ZoneRules;
import org.threeten.bp.zone.ZoneRulesException;
import org.threeten.bp.zone.ZoneRulesProvider;

/* JADX INFO: loaded from: classes23.dex */
final class b extends ZoneId implements Serializable {
    private static final Pattern c = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;
    private final String a;
    private final transient ZoneRules b;

    public b(String str, ZoneRules zoneRules) {
        this.a = str;
        this.b = zoneRules;
    }

    public static b b(String str, boolean z) {
        Jdk8Methods.requireNonNull(str, "zoneId");
        if (str.length() < 2 || !c.matcher(str).matches()) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        ZoneRules rules = null;
        try {
            rules = ZoneRulesProvider.getRules(str, true);
        } catch (ZoneRulesException e) {
            if (str.equals("GMT0")) {
                rules = ZoneOffset.UTC.getRules();
            } else if (z) {
                throw e;
            }
        }
        return new b(str, rules);
    }

    private static b c(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        if (str.equals(UtcDates.UTC) || str.equals("GMT") || str.equals("UT")) {
            return new b(str, ZoneOffset.UTC.getRules());
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            ZoneOffset zoneOffsetOf = ZoneOffset.of(str.substring(3));
            if (zoneOffsetOf.getTotalSeconds() == 0) {
                return new b(str.substring(0, 3), zoneOffsetOf.getRules());
            }
            return new b(str.substring(0, 3) + zoneOffsetOf.getId(), zoneOffsetOf.getRules());
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return b(str, false);
        }
        ZoneOffset zoneOffsetOf2 = ZoneOffset.of(str.substring(2));
        if (zoneOffsetOf2.getTotalSeconds() == 0) {
            return new b("UT", zoneOffsetOf2.getRules());
        }
        return new b("UT" + zoneOffsetOf2.getId(), zoneOffsetOf2.getRules());
    }

    public static ZoneId e(DataInput dataInput) throws IOException {
        return c(dataInput.readUTF());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 7, this);
    }

    @Override // org.threeten.bp.ZoneId
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        f(dataOutput);
    }

    public void f(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.a);
    }

    @Override // org.threeten.bp.ZoneId
    public String getId() {
        return this.a;
    }

    @Override // org.threeten.bp.ZoneId
    public ZoneRules getRules() {
        ZoneRules zoneRules = this.b;
        return zoneRules != null ? zoneRules : ZoneRulesProvider.getRules(this.a, false);
    }
}
