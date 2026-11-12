package qs;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqs/d;", "", "", "manufacturerName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d {
    GARMIN("GARMIN"),
    DEFAULT("");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f147044b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147048a;

    d(String str) {
        this.f147048a = str;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/d$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0019  */
        /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
        public static d a(String str) {
            for (d dVar : d.values()) {
                if (p005kotlin.jvm.internal.s.g(dVar.f147048a, str)) {
                    if (dVar == null) {
                        return d.DEFAULT;
                    }
                    return dVar;
                }
            }
            dVar = null;
            if (dVar == null) {
                return d.DEFAULT;
            }
            return dVar;
        }

        private a() {
        }
    }
}
