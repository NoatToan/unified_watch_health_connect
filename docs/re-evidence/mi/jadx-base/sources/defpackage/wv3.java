package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.smarthome.library.common.util.DateTimeHelper;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import miuix.animation.internal.FolmeCore;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class wv3<D extends org.threeten.bp.chrono.a> extends vv3<D> implements s4p, w4p, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f38391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f38392b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38393a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f38393a = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38393a[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38393a[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38393a[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38393a[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38393a[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38393a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public wv3(D d, LocalTime localTime) {
        crd.i(d, DialWidgetType.DATE);
        crd.i(localTime, "time");
        this.f38391a = d;
        this.f38392b = localTime;
    }

    public static <R extends org.threeten.bp.chrono.a> wv3<R> a(R r2, LocalTime localTime) {
        return new wv3<>(r2, localTime);
    }

    public static vv3<?> n(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((org.threeten.bp.chrono.a) objectInput.readObject()).atTime((LocalTime) objectInput.readObject());
    }

    private Object writeReplace() {
        return new gwl(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, this);
    }

    @Override // defpackage.vv3
    public zv3<D> atZone(ZoneId zoneId) {
        return aw3.b(this, zoneId, null);
    }

    @Override // defpackage.vv3, defpackage.s4p
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wv3<D> plus(long j, c5p c5pVar) {
        if (!(c5pVar instanceof ChronoUnit)) {
            return this.f38391a.getChronology().ensureChronoLocalDateTime(c5pVar.addTo(this, j));
        }
        switch (a.f38393a[((ChronoUnit) c5pVar).ordinal()]) {
            case 1:
                return h(j);
            case 2:
                return c(j / 86400000000L).h((j % 86400000000L) * 1000);
            case 3:
                return c(j / 86400000).h((j % 86400000) * FolmeCore.NANOS_TO_MS);
            case 4:
                return i(j);
            case 5:
                return e(j);
            case 6:
                return d(j);
            case 7:
                return c(j / 256).d((j % 256) * 12);
            default:
                return p(this.f38391a.plus(j, c5pVar), this.f38392b);
        }
    }

    public final wv3<D> c(long j) {
        return p(this.f38391a.plus(j, ChronoUnit.DAYS), this.f38392b);
    }

    public final wv3<D> d(long j) {
        return k(this.f38391a, j, 0L, 0L, 0L);
    }

    public final wv3<D> e(long j) {
        return k(this.f38391a, 0L, j, 0L, 0L);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public int get(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isTimeBased() ? this.f38392b.get(z4pVar) : this.f38391a.get(z4pVar);
        }
        return range(z4pVar).checkValidIntValue(getLong(z4pVar), z4pVar);
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isTimeBased() ? this.f38392b.getLong(z4pVar) : this.f38391a.getLong(z4pVar);
        }
        return z4pVar.getFrom(this);
    }

    public final wv3<D> h(long j) {
        return k(this.f38391a, 0L, 0L, 0L, j);
    }

    public wv3<D> i(long j) {
        return k(this.f38391a, 0L, 0L, j, 0L);
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isDateBased() || z4pVar.isTimeBased();
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    public final wv3<D> k(D d, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return p(d, this.f38392b);
        }
        long j5 = (j4 / 86400000000000L) + (j3 / 86400) + (j2 / DateTimeHelper.sDayInMinutes) + (j / 24);
        long j6 = (j4 % 86400000000000L) + ((j3 % 86400) * FolmeCore.NANOS_TO_S) + ((j2 % DateTimeHelper.sDayInMinutes) * 60000000000L) + ((j % 24) * 3600000000000L);
        long nanoOfDay = this.f38392b.toNanoOfDay();
        long j7 = j6 + nanoOfDay;
        long jE = j5 + crd.e(j7, 86400000000000L);
        long jH = crd.h(j7, 86400000000000L);
        return p(d.plus(jE, ChronoUnit.DAYS), jH == nanoOfDay ? this.f38392b : LocalTime.ofNanoOfDay(jH));
    }

    public final wv3<D> p(s4p s4pVar, LocalTime localTime) {
        D d = this.f38391a;
        return (d == s4pVar && this.f38392b == localTime) ? this : new wv3<>(d.getChronology().ensureChronoLocalDate(s4pVar), localTime);
    }

    @Override // defpackage.vv3, defpackage.rv5, defpackage.s4p
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public wv3<D> with(w4p w4pVar) {
        if (w4pVar instanceof org.threeten.bp.chrono.a) {
            return p((org.threeten.bp.chrono.a) w4pVar, this.f38392b);
        }
        if (w4pVar instanceof LocalTime) {
            return p(this.f38391a, (LocalTime) w4pVar);
        }
        return w4pVar instanceof wv3 ? this.f38391a.getChronology().ensureChronoLocalDateTime((wv3) w4pVar) : this.f38391a.getChronology().ensureChronoLocalDateTime((wv3) w4pVar.adjustInto(this));
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isTimeBased() ? this.f38392b.range(z4pVar) : this.f38391a.range(z4pVar);
        }
        return z4pVar.rangeRefinedBy(this);
    }

    @Override // defpackage.vv3, defpackage.s4p
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public wv3<D> with(z4p z4pVar, long j) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isTimeBased() ? p(this.f38391a, this.f38392b.with(z4pVar, j)) : p(this.f38391a.with(z4pVar, j), this.f38392b);
        }
        return this.f38391a.getChronology().ensureChronoLocalDateTime(z4pVar.adjustInto(this, j));
    }

    @Override // defpackage.vv3
    public D toLocalDate() {
        return this.f38391a;
    }

    @Override // defpackage.vv3
    public LocalTime toLocalTime() {
        return this.f38392b;
    }

    @Override // defpackage.s4p
    public long until(s4p s4pVar, c5p c5pVar) {
        vv3<?> vv3VarLocalDateTime = toLocalDate().getChronology().localDateTime(s4pVar);
        if (!(c5pVar instanceof ChronoUnit)) {
            return c5pVar.between(this, vv3VarLocalDateTime);
        }
        ChronoUnit chronoUnit = (ChronoUnit) c5pVar;
        if (!chronoUnit.isTimeBased()) {
            org.threeten.bp.chrono.a localDate = vv3VarLocalDateTime.toLocalDate();
            if (vv3VarLocalDateTime.toLocalTime().isBefore(this.f38392b)) {
                localDate = localDate.minus(1L, (c5p) ChronoUnit.DAYS);
            }
            return this.f38391a.until(localDate, c5pVar);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long jN = vv3VarLocalDateTime.getLong(chronoField) - this.f38391a.getLong(chronoField);
        switch (a.f38393a[chronoUnit.ordinal()]) {
            case 1:
                jN = crd.n(jN, 86400000000000L);
                break;
            case 2:
                jN = crd.n(jN, 86400000000L);
                break;
            case 3:
                jN = crd.n(jN, 86400000L);
                break;
            case 4:
                jN = crd.m(jN, RepositoryManager.GAP_A_DAY);
                break;
            case 5:
                jN = crd.m(jN, 1440);
                break;
            case 6:
                jN = crd.m(jN, 24);
                break;
            case 7:
                jN = crd.m(jN, 2);
                break;
        }
        return crd.k(jN, this.f38392b.until(vv3VarLocalDateTime.toLocalTime(), c5pVar));
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f38391a);
        objectOutput.writeObject(this.f38392b);
    }
}
