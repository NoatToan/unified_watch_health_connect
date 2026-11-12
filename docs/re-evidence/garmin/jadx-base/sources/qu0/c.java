package qu0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqu0/c;", "", "Lqu0/d;", "featureName", "Lqu0/b;", "featureConfirmationStatus", "<init>", "(Lqu0/d;Lqu0/b;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f147880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f147881b;

    public /* synthetic */ c(d dVar, b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? null : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f147880a == cVar.f147880a && this.f147881b == cVar.f147881b;
    }

    public final int hashCode() {
        d dVar = this.f147880a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        b bVar = this.f147881b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "RecipientFeatureInfo(featureName=" + this.f147880a + ", featureConfirmationStatus=" + this.f147881b + ")";
    }

    public c(d dVar, b bVar) {
        this.f147880a = dVar;
        this.f147881b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
