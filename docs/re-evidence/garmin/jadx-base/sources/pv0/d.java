package pv0;

import java.util.List;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017¨\u0006\u001b"}, d2 = {"Lpv0/d;", "", "", "behaviourId", "userProfilePk", "", "measurementTypeKey", "name", "", "hidden", "", "Lpv0/n;", "subTypes", "categoryKey", "tracked", "sleepRelated", "", "sequenceOrder", "<init>", "(JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "b", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f141356k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f141357l = {null, null, null, null, null, o13.m.a(o13.n.PUBLICATION, new pk0.m(6)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f141358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f141359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f141361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f141362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<n> f141363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f141364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f141365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f141366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f141367j;

    public /* synthetic */ d(int i14, long j8, Long l14, String str, String str2, Boolean bool, List list, String str3, Boolean bool2, Boolean bool3, Integer num, u1 u1Var) {
        this.f141358a = (i14 & 1) == 0 ? -1L : j8;
        if ((i14 & 2) == 0) {
            this.f141359b = null;
        } else {
            this.f141359b = l14;
        }
        if ((i14 & 4) == 0) {
            this.f141360c = null;
        } else {
            this.f141360c = str;
        }
        if ((i14 & 8) == 0) {
            this.f141361d = null;
        } else {
            this.f141361d = str2;
        }
        if ((i14 & 16) == 0) {
            this.f141362e = null;
        } else {
            this.f141362e = bool;
        }
        if ((i14 & 32) == 0) {
            this.f141363f = null;
        } else {
            this.f141363f = list;
        }
        if ((i14 & 64) == 0) {
            this.f141364g = null;
        } else {
            this.f141364g = str3;
        }
        if ((i14 & 128) == 0) {
            this.f141365h = null;
        } else {
            this.f141365h = bool2;
        }
        if ((i14 & 256) == 0) {
            this.f141366i = null;
        } else {
            this.f141366i = bool3;
        }
        if ((i14 & 512) == 0) {
            this.f141367j = null;
        } else {
            this.f141367j = num;
        }
    }

    public static d a(d dVar, String str, Boolean bool, int i14) {
        long j8 = dVar.f141358a;
        Long l14 = dVar.f141359b;
        String str2 = dVar.f141360c;
        if ((i14 & 8) != 0) {
            str = dVar.f141361d;
        }
        String str3 = str;
        Boolean bool2 = dVar.f141362e;
        List<n> list = dVar.f141363f;
        String str4 = dVar.f141364g;
        if ((i14 & 128) != 0) {
            bool = dVar.f141365h;
        }
        Boolean bool3 = dVar.f141366i;
        Integer num = dVar.f141367j;
        dVar.getClass();
        return new d(j8, l14, str2, str3, bool2, list, str4, bool, bool3, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f141358a == dVar.f141358a && p005kotlin.jvm.internal.s.g(this.f141359b, dVar.f141359b) && p005kotlin.jvm.internal.s.g(this.f141360c, dVar.f141360c) && p005kotlin.jvm.internal.s.g(this.f141361d, dVar.f141361d) && p005kotlin.jvm.internal.s.g(this.f141362e, dVar.f141362e) && p005kotlin.jvm.internal.s.g(this.f141363f, dVar.f141363f) && p005kotlin.jvm.internal.s.g(this.f141364g, dVar.f141364g) && p005kotlin.jvm.internal.s.g(this.f141365h, dVar.f141365h) && p005kotlin.jvm.internal.s.g(this.f141366i, dVar.f141366i) && p005kotlin.jvm.internal.s.g(this.f141367j, dVar.f141367j);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f141358a) * 31;
        Long l14 = this.f141359b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f141360c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f141361d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f141362e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<n> list = this.f141363f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f141364g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f141365h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f141366i;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.f141367j;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BehaviourDTO(behaviourId=");
        sb3.append(this.f141358a);
        sb3.append(", userProfilePk=");
        sb3.append(this.f141359b);
        sn.a.t(sb3, ", measurementTypeKey=", this.f141360c, ", name=", this.f141361d);
        sb3.append(", hidden=");
        sb3.append(this.f141362e);
        sb3.append(", subTypes=");
        sb3.append(this.f141363f);
        sb3.append(", categoryKey=");
        sb3.append(this.f141364g);
        sb3.append(", tracked=");
        sb3.append(this.f141365h);
        sb3.append(", sleepRelated=");
        sb3.append(this.f141366i);
        sb3.append(", sequenceOrder=");
        sb3.append(this.f141367j);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: pv0.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpv0/d$b;", "", "<init>", "()V", "Li63/c;", "Lpv0/d;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f141368a;
        }

        private Companion() {
        }
    }

    public d() {
        this(0L, (Long) null, (String) null, (String) null, (Boolean) null, (List) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, 1023, (p005kotlin.jvm.internal.j) null);
    }

    public d(long j8, Long l14, String str, String str2, Boolean bool, List<n> list, String str3, Boolean bool2, Boolean bool3, Integer num) {
        this.f141358a = j8;
        this.f141359b = l14;
        this.f141360c = str;
        this.f141361d = str2;
        this.f141362e = bool;
        this.f141363f = list;
        this.f141364g = str3;
        this.f141365h = bool2;
        this.f141366i = bool3;
        this.f141367j = num;
    }

    public /* synthetic */ d(long j8, Long l14, String str, String str2, Boolean bool, List list, String str3, Boolean bool2, Boolean bool3, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? null : list, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : bool2, (i14 & 256) != 0 ? null : bool3, (i14 & 512) != 0 ? null : num);
    }
}
