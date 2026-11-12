package be1;

import b71.i;
import i63.h;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lbe1/b;", "", "", "calendarDate", "", "avgWakingRespiration", "avgSleepRespiration", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f17739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f17740c;

    public /* synthetic */ b(int i14, String str, Double d14, Double d15, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f17738a = null;
        } else {
            this.f17738a = str;
        }
        if ((i14 & 2) == 0) {
            this.f17739b = null;
        } else {
            this.f17739b = d14;
        }
        if ((i14 & 4) == 0) {
            this.f17740c = null;
        } else {
            this.f17740c = d15;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f17738a, bVar.f17738a) && s.g(this.f17739b, bVar.f17739b) && s.g(this.f17740c, bVar.f17740c);
    }

    public final int hashCode() {
        String str = this.f17738a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d14 = this.f17739b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f17740c;
        return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DailySummaryDTO(calendarDate=");
        sb3.append(this.f17738a);
        sb3.append(", avgWakingRespiration=");
        sb3.append(this.f17739b);
        sb3.append(", avgSleepRespiration=");
        return i.g(sb3, this.f17740c, ")");
    }

    /* JADX INFO: renamed from: be1.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbe1/b$b;", "", "<init>", "()V", "Li63/c;", "Lbe1/b;", "serializer", "()Li63/c;", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f17741a;
        }

        private Companion() {
        }
    }

    public b() {
        this((String) null, (Double) null, (Double) null, 7, (j) null);
    }

    public b(String str, Double d14, Double d15) {
        this.f17738a = str;
        this.f17739b = d14;
        this.f17740c = d15;
    }

    public /* synthetic */ b(String str, Double d14, Double d15, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15);
    }
}
