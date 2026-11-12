package org.threeten.bp;

import defpackage.crd;
import defpackage.i1s;
import defpackage.iwl;
import defpackage.k1s;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import org.threeten.bp.zone.ZoneRulesException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ZoneId implements Serializable {
    public static final Pattern c = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient i1s f29609b;

    public a(String str, i1s i1sVar) {
        this.f29608a = str;
        this.f29609b = i1sVar;
    }

    public static a a(String str, boolean z) {
        i1s rules;
        crd.i(str, "zoneId");
        if (str.length() < 2 || !c.matcher(str).matches()) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        try {
            rules = k1s.c(str, true);
        } catch (ZoneRulesException e) {
            if (str.equals("GMT0")) {
                rules = ZoneOffset.UTC.getRules();
            } else {
                if (z) {
                    throw e;
                }
                rules = null;
            }
        }
        return new a(str, rules);
    }

    public static a b(String str) {
        if (str.equals("Z") || str.startsWith(Marker.ANY_NON_NULL_MARKER) || str.startsWith("-")) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            return new a(str, ZoneOffset.UTC.getRules());
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            ZoneOffset zoneOffsetOf = ZoneOffset.of(str.substring(3));
            if (zoneOffsetOf.getTotalSeconds() == 0) {
                return new a(str.substring(0, 3), zoneOffsetOf.getRules());
            }
            return new a(str.substring(0, 3) + zoneOffsetOf.getId(), zoneOffsetOf.getRules());
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return a(str, false);
        }
        ZoneOffset zoneOffsetOf2 = ZoneOffset.of(str.substring(2));
        if (zoneOffsetOf2.getTotalSeconds() == 0) {
            return new a("UT", zoneOffsetOf2.getRules());
        }
        return new a("UT" + zoneOffsetOf2.getId(), zoneOffsetOf2.getRules());
    }

    public static ZoneId c(DataInput dataInput) throws IOException {
        return b(dataInput.readUTF());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new iwl((byte) 7, this);
    }

    @Override // org.threeten.bp.ZoneId
    public String getId() {
        return this.f29608a;
    }

    @Override // org.threeten.bp.ZoneId
    public i1s getRules() {
        i1s i1sVar = this.f29609b;
        return i1sVar != null ? i1sVar : k1s.c(this.f29608a, false);
    }

    @Override // org.threeten.bp.ZoneId
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        writeExternal(dataOutput);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.f29608a);
    }
}
