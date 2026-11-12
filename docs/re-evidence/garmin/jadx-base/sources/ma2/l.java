package ma2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableBiMap;
import java.util.EnumSet;
import java.util.UUID;
import ml2.q;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public enum l implements Parcelable {
    CONNECT_IQ(null),
    GFDI(q.GFDI),
    /* JADX INFO: Fake field, exist only in values array */
    NFC(q.NFC),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_HR(q.REAL_TIME_HR),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_STEPS(q.REAL_TIME_STEPS),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_CALORIES(q.REAL_TIME_CALORIES),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_FLOORS(q.REAL_TIME_FLOORS),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_INTENSITY(q.REAL_TIME_INTENSITY),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_HRV(q.REAL_TIME_HRV),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_STRESS(q.REAL_TIME_STRESS),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_SPO2(q.REAL_TIME_SPO2),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_BODY_BATTERY(q.REAL_TIME_BODY_BATTERY),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_RESPIRATION(q.REAL_TIME_RESPIRATION),
    /* JADX INFO: Fake field, exist only in values array */
    KEEP_ALIVE(q.KEEP_ALIVE),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_SPAM(q.REAL_TIME_SPAM),
    /* JADX INFO: Fake field, exist only in values array */
    ECHO(q.ECHO),
    /* JADX INFO: Fake field, exist only in values array */
    REAL_TIME_ACTIVE_TIME(q.REAL_TIME_ACTIVE_TIME);

    public static final Parcelable.Creator<l> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f117698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f117699b;

    static {
        q qVar;
        ImmutableBiMap.Builder builder = ImmutableBiMap.builder();
        for (l lVar : values()) {
            UUID uuid = lVar.f117698a;
            if (uuid != null && (qVar = lVar.f117699b) != null) {
                builder.put(uuid, qVar);
            }
        }
        builder.build();
        CREATOR = new Parcelable.Creator<l>() { // from class: ma2.l.a
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                return l.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i14) {
                return new l[i14];
            }
        };
    }

    l(q qVar) {
        UUID uuid;
        if (qVar != null) {
            for (xm2.h hVar : xm2.h.values()) {
                if (hVar.f191549a == qVar.f119440a) {
                    uuid = (UUID) zm2.a.f205368m.get(hVar);
                }
            }
            uuid = null;
        } else {
            uuid = null;
        }
        this.f117698a = uuid;
        this.f117699b = qVar;
    }

    @Deprecated
    public static EnumSet b() {
        EnumSet enumSetNoneOf = EnumSet.noneOf(l.class);
        for (l lVar : EnumSet.allOf(l.class)) {
            if (lVar.f117698a != null) {
                enumSetNoneOf.add(lVar);
            }
        }
        return enumSetNoneOf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(name());
    }
}
