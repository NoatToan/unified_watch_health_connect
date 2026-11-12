package fd1;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfd1/a;", "", "Lad1/b;", "racePredictorDistance", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Lad1/b;Ljava/lang/String;)V", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad1.b f70477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70478b;

    public a(ad1.b bVar, String str) {
        bVar.getClass();
        str.getClass();
        this.f70477a = bVar;
        this.f70478b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f70477a == aVar.f70477a && this.f70478b.equals(aVar.f70478b);
    }

    public final int hashCode() {
        return this.f70478b.hashCode() + (this.f70477a.hashCode() * 31);
    }

    public final String toString() {
        return "RacePredictorCharHoverEntry(racePredictorDistance=" + this.f70477a + ", label=" + this.f70478b + ")";
    }
}
