package k62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk62/o;", "", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class o {
    public static final o INSTANCE = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f103209a = o13.m.a(o13.n.PUBLICATION, new l(2));

    private o() {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o);
    }

    public final int hashCode() {
        return 1092015311;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i63.c<o> serializer() {
        return (i63.c) f103209a.getValue();
    }

    public final String toString() {
        return "MyWorkoutList";
    }
}
