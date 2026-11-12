package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.a;
import org.threeten.bp.chrono.b;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.zone.ZoneOffsetTransition;

/* JADX INFO: loaded from: classes3.dex */
public final class aw3<D extends org.threeten.bp.chrono.a> extends zv3<D> implements Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv3<D> f3506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f3507b;
    public final ZoneId c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3508a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f3508a = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3508a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public aw3(wv3<D> wv3Var, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.f3506a = (wv3) crd.i(wv3Var, "dateTime");
        this.f3507b = (ZoneOffset) crd.i(zoneOffset, "offset");
        this.c = (ZoneId) crd.i(zoneId, "zone");
    }

    public static <R extends org.threeten.bp.chrono.a> zv3<R> b(wv3<R> wv3Var, ZoneId zoneId, ZoneOffset zoneOffset) {
        crd.i(wv3Var, "localDateTime");
        crd.i(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new aw3(wv3Var, (ZoneOffset) zoneId, zoneId);
        }
        i1s rules = zoneId.getRules();
        LocalDateTime localDateTimeFrom = LocalDateTime.from((t4p) wv3Var);
        List<ZoneOffset> listC = rules.c(localDateTimeFrom);
        if (listC.size() == 1) {
            zoneOffset = listC.get(0);
        } else if (listC.size() == 0) {
            ZoneOffsetTransition zoneOffsetTransitionB = rules.b(localDateTimeFrom);
            wv3Var = wv3Var.i(zoneOffsetTransitionB.getDuration().getSeconds());
            zoneOffset = zoneOffsetTransitionB.getOffsetAfter();
        } else if (zoneOffset == null || !listC.contains(zoneOffset)) {
            zoneOffset = listC.get(0);
        }
        crd.i(zoneOffset, "offset");
        return new aw3(wv3Var, zoneOffset, zoneId);
    }

    public static <R extends org.threeten.bp.chrono.a> aw3<R> c(b bVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetA = zoneId.getRules().a(instant);
        crd.i(zoneOffsetA, "offset");
        return new aw3<>((wv3) bVar.localDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneOffsetA)), zoneOffsetA, zoneId);
    }

    public static zv3<?> d(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        vv3 vv3Var = (vv3) objectInput.readObject();
        ZoneOffset zoneOffset = (ZoneOffset) objectInput.readObject();
        return vv3Var.atZone(zoneOffset).withZoneSameLocal((ZoneId) objectInput.readObject());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new gwl(HMProSyncDataBaseProfile.DATA_TYPE_PAI, this);
    }

    public final aw3<D> a(Instant instant, ZoneId zoneId) {
        return c(toLocalDate().getChronology(), instant, zoneId);
    }

    @Override // defpackage.zv3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv3) && compareTo((zv3<?>) obj) == 0;
    }

    @Override // defpackage.zv3
    public ZoneOffset getOffset() {
        return this.f3507b;
    }

    @Override // defpackage.zv3
    public ZoneId getZone() {
        return this.c;
    }

    @Override // defpackage.zv3
    public int hashCode() {
        return (toLocalDateTime().hashCode() ^ getOffset().hashCode()) ^ Integer.rotateLeft(getZone().hashCode(), 3);
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        return (z4pVar instanceof ChronoField) || (z4pVar != null && z4pVar.isSupportedBy(this));
    }

    @Override // defpackage.zv3
    public vv3<D> toLocalDateTime() {
        return this.f3506a;
    }

    @Override // defpackage.zv3
    public String toString() {
        String str = toLocalDateTime().toString() + getOffset().toString();
        if (getOffset() == getZone()) {
            return str;
        }
        return str + AbstractJsonLexerKt.BEGIN_LIST + getZone().toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // defpackage.s4p
    public long until(s4p s4pVar, c5p c5pVar) {
        zv3<?> zv3VarZonedDateTime = toLocalDate().getChronology().zonedDateTime(s4pVar);
        if (!(c5pVar instanceof ChronoUnit)) {
            return c5pVar.between(this, zv3VarZonedDateTime);
        }
        return this.f3506a.until(zv3VarZonedDateTime.withZoneSameInstant(this.f3507b).toLocalDateTime(), c5pVar);
    }

    @Override // defpackage.zv3
    public zv3<D> withEarlierOffsetAtOverlap() {
        ZoneOffsetTransition zoneOffsetTransitionB = getZone().getRules().b(LocalDateTime.from((t4p) this));
        if (zoneOffsetTransitionB != null && zoneOffsetTransitionB.isOverlap()) {
            ZoneOffset offsetBefore = zoneOffsetTransitionB.getOffsetBefore();
            if (!offsetBefore.equals(this.f3507b)) {
                return new aw3(this.f3506a, offsetBefore, this.c);
            }
        }
        return this;
    }

    @Override // defpackage.zv3
    public zv3<D> withLaterOffsetAtOverlap() {
        ZoneOffsetTransition zoneOffsetTransitionB = getZone().getRules().b(LocalDateTime.from((t4p) this));
        if (zoneOffsetTransitionB != null) {
            ZoneOffset offsetAfter = zoneOffsetTransitionB.getOffsetAfter();
            if (!offsetAfter.equals(getOffset())) {
                return new aw3(this.f3506a, offsetAfter, this.c);
            }
        }
        return this;
    }

    @Override // defpackage.zv3
    public zv3<D> withZoneSameInstant(ZoneId zoneId) {
        crd.i(zoneId, "zone");
        return this.c.equals(zoneId) ? this : a(this.f3506a.toInstant(this.f3507b), zoneId);
    }

    @Override // defpackage.zv3
    public zv3<D> withZoneSameLocal(ZoneId zoneId) {
        return b(this.f3506a, zoneId, this.f3507b);
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f3506a);
        objectOutput.writeObject(this.f3507b);
        objectOutput.writeObject(this.c);
    }

    @Override // defpackage.zv3, defpackage.s4p
    public zv3<D> plus(long j, c5p c5pVar) {
        return c5pVar instanceof ChronoUnit ? with((w4p) this.f3506a.plus(j, c5pVar)) : toLocalDate().getChronology().ensureChronoZonedDateTime(c5pVar.addTo(this, j));
    }

    @Override // defpackage.zv3, defpackage.s4p
    public zv3<D> with(z4p z4pVar, long j) {
        if (!(z4pVar instanceof ChronoField)) {
            return toLocalDate().getChronology().ensureChronoZonedDateTime(z4pVar.adjustInto(this, j));
        }
        ChronoField chronoField = (ChronoField) z4pVar;
        int i = a.f3508a[chronoField.ordinal()];
        if (i == 1) {
            return plus(j - toEpochSecond(), (c5p) ChronoUnit.SECONDS);
        }
        if (i != 2) {
            return b(this.f3506a.with(z4pVar, j), this.c, this.f3507b);
        }
        return a(this.f3506a.toInstant(ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j))), this.c);
    }
}
