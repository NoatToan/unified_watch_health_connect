package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.zone.ZoneOffsetTransition;
import org.threeten.bp.zone.ZoneOffsetTransitionRule;

/* JADX INFO: loaded from: classes3.dex */
public final class pbo extends i1s implements Serializable {
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f30216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f30217b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final ZoneOffsetTransitionRule[] f;
    public final ConcurrentMap<Integer, ZoneOffsetTransition[]> g = new ConcurrentHashMap();

    public pbo(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr) {
        this.f30216a = jArr;
        this.f30217b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = zoneOffsetTransitionRuleArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            ZoneOffsetTransition zoneOffsetTransition = new ZoneOffsetTransition(jArr2[i], zoneOffsetArr2[i], zoneOffsetArr2[i2]);
            if (zoneOffsetTransition.isGap()) {
                arrayList.add(zoneOffsetTransition.getDateTimeBefore());
                arrayList.add(zoneOffsetTransition.getDateTimeAfter());
            } else {
                arrayList.add(zoneOffsetTransition.getDateTimeAfter());
                arrayList.add(zoneOffsetTransition.getDateTimeBefore());
            }
            i = i2;
        }
        this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
    }

    public static pbo n(DataInput dataInput) throws IOException, ClassNotFoundException {
        int i = dataInput.readInt();
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = hwl.b(dataInput);
        }
        int i3 = i + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            zoneOffsetArr[i4] = hwl.d(dataInput);
        }
        int i5 = dataInput.readInt();
        long[] jArr2 = new long[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            jArr2[i6] = hwl.b(dataInput);
        }
        int i7 = i5 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            zoneOffsetArr2[i8] = hwl.d(dataInput);
        }
        int i9 = dataInput.readByte();
        ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = new ZoneOffsetTransitionRule[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            zoneOffsetTransitionRuleArr[i10] = ZoneOffsetTransitionRule.readExternal(dataInput);
        }
        return new pbo(jArr, zoneOffsetArr, jArr2, zoneOffsetArr2, zoneOffsetTransitionRuleArr);
    }

    private Object writeReplace() {
        return new hwl((byte) 1, this);
    }

    @Override // defpackage.i1s
    public ZoneOffset a(Instant instant) {
        long epochSecond = instant.getEpochSecond();
        if (this.f.length > 0) {
            long[] jArr = this.c;
            if (epochSecond > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.e;
                ZoneOffsetTransition[] zoneOffsetTransitionArrI = i(j(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
                ZoneOffsetTransition zoneOffsetTransition = null;
                for (int i = 0; i < zoneOffsetTransitionArrI.length; i++) {
                    zoneOffsetTransition = zoneOffsetTransitionArrI[i];
                    if (epochSecond < zoneOffsetTransition.toEpochSecond()) {
                        return zoneOffsetTransition.getOffsetBefore();
                    }
                }
                return zoneOffsetTransition.getOffsetAfter();
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.e[iBinarySearch + 1];
    }

    @Override // defpackage.i1s
    public ZoneOffsetTransition b(LocalDateTime localDateTime) {
        Object objK = k(localDateTime);
        if (objK instanceof ZoneOffsetTransition) {
            return (ZoneOffsetTransition) objK;
        }
        return null;
    }

    @Override // defpackage.i1s
    public List<ZoneOffset> c(LocalDateTime localDateTime) {
        Object objK = k(localDateTime);
        return objK instanceof ZoneOffsetTransition ? ((ZoneOffsetTransition) objK).getValidOffsets() : Collections.singletonList((ZoneOffset) objK);
    }

    @Override // defpackage.i1s
    public boolean d(Instant instant) {
        return !m(instant).equals(a(instant));
    }

    @Override // defpackage.i1s
    public boolean e() {
        return this.c.length == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pbo) {
            pbo pboVar = (pbo) obj;
            return Arrays.equals(this.f30216a, pboVar.f30216a) && Arrays.equals(this.f30217b, pboVar.f30217b) && Arrays.equals(this.c, pboVar.c) && Arrays.equals(this.e, pboVar.e) && Arrays.equals(this.f, pboVar.f);
        }
        if (!(obj instanceof i1s.a)) {
            return false;
        }
        if (e()) {
            Instant instant = Instant.EPOCH;
            if (a(instant).equals(((i1s.a) obj).a(instant))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.i1s
    public boolean f(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return c(localDateTime).contains(zoneOffset);
    }

    public final Object h(LocalDateTime localDateTime, ZoneOffsetTransition zoneOffsetTransition) {
        LocalDateTime dateTimeBefore = zoneOffsetTransition.getDateTimeBefore();
        if (zoneOffsetTransition.isGap()) {
            if (localDateTime.isBefore(dateTimeBefore)) {
                return zoneOffsetTransition.getOffsetBefore();
            }
            return localDateTime.isBefore(zoneOffsetTransition.getDateTimeAfter()) ? zoneOffsetTransition : zoneOffsetTransition.getOffsetAfter();
        }
        if (localDateTime.isBefore(dateTimeBefore)) {
            return localDateTime.isBefore(zoneOffsetTransition.getDateTimeAfter()) ? zoneOffsetTransition.getOffsetBefore() : zoneOffsetTransition;
        }
        return zoneOffsetTransition.getOffsetAfter();
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f30216a) ^ Arrays.hashCode(this.f30217b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final ZoneOffsetTransition[] i(int i) {
        Integer numValueOf = Integer.valueOf(i);
        ZoneOffsetTransition[] zoneOffsetTransitionArr = this.g.get(numValueOf);
        if (zoneOffsetTransitionArr != null) {
            return zoneOffsetTransitionArr;
        }
        ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = this.f;
        ZoneOffsetTransition[] zoneOffsetTransitionArr2 = new ZoneOffsetTransition[zoneOffsetTransitionRuleArr.length];
        for (int i2 = 0; i2 < zoneOffsetTransitionRuleArr.length; i2++) {
            zoneOffsetTransitionArr2[i2] = zoneOffsetTransitionRuleArr[i2].createTransition(i);
        }
        if (i < 2100) {
            this.g.putIfAbsent(numValueOf, zoneOffsetTransitionArr2);
        }
        return zoneOffsetTransitionArr2;
    }

    public final int j(long j, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(crd.e(j + ((long) zoneOffset.getTotalSeconds()), 86400L)).getYear();
    }

    public final Object k(LocalDateTime localDateTime) {
        int i = 0;
        if (this.f.length > 0) {
            LocalDateTime[] localDateTimeArr = this.d;
            if (localDateTime.isAfter(localDateTimeArr[localDateTimeArr.length - 1])) {
                ZoneOffsetTransition[] zoneOffsetTransitionArrI = i(localDateTime.getYear());
                int length = zoneOffsetTransitionArrI.length;
                Object obj = null;
                while (i < length) {
                    ZoneOffsetTransition zoneOffsetTransition = zoneOffsetTransitionArrI[i];
                    Object objH = h(localDateTime, zoneOffsetTransition);
                    if ((objH instanceof ZoneOffsetTransition) || objH.equals(zoneOffsetTransition.getOffsetBefore())) {
                        return objH;
                    }
                    i++;
                    obj = objH;
                }
                return obj;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.d, localDateTime);
        if (iBinarySearch == -1) {
            return this.e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.d;
            if (iBinarySearch < objArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i2])) {
                    iBinarySearch = i2;
                }
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return this.e[(iBinarySearch / 2) + 1];
        }
        LocalDateTime[] localDateTimeArr2 = this.d;
        LocalDateTime localDateTime2 = localDateTimeArr2[iBinarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr2[iBinarySearch + 1];
        ZoneOffset[] zoneOffsetArr = this.e;
        int i3 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr[i3];
        ZoneOffset zoneOffset2 = zoneOffsetArr[i3 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new ZoneOffsetTransition(localDateTime2, zoneOffset, zoneOffset2) : new ZoneOffsetTransition(localDateTime3, zoneOffset, zoneOffset2);
    }

    public ZoneOffset m(Instant instant) {
        int iBinarySearch = Arrays.binarySearch(this.f30216a, instant.getEpochSecond());
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f30217b[iBinarySearch + 1];
    }

    public void o(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f30216a.length);
        for (long j : this.f30216a) {
            hwl.e(j, dataOutput);
        }
        for (ZoneOffset zoneOffset : this.f30217b) {
            hwl.g(zoneOffset, dataOutput);
        }
        dataOutput.writeInt(this.c.length);
        for (long j2 : this.c) {
            hwl.e(j2, dataOutput);
        }
        for (ZoneOffset zoneOffset2 : this.e) {
            hwl.g(zoneOffset2, dataOutput);
        }
        dataOutput.writeByte(this.f.length);
        for (ZoneOffsetTransitionRule zoneOffsetTransitionRule : this.f) {
            zoneOffsetTransitionRule.writeExternal(dataOutput);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandardZoneRules[currentStandardOffset=");
        ZoneOffset[] zoneOffsetArr = this.f30217b;
        sb.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
