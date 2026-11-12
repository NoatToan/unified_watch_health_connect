package ot0;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lot0/d;", "", "Lot0/e;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "ruleText", "<init>", "(Lot0/e;Ljava/lang/CharSequence;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f133726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f133727b;

    public d(e eVar, CharSequence charSequence) {
        eVar.getClass();
        charSequence.getClass();
        this.f133726a = eVar;
        this.f133727b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f133726a == dVar.f133726a && this.f133727b.equals(dVar.f133727b);
    }

    public final int hashCode() {
        return this.f133727b.hashCode() + (this.f133726a.hashCode() * 31);
    }

    public final String toString() {
        return "BadgeChallengeRule(type=" + this.f133726a + ", ruleText=" + ((Object) this.f133727b) + ")";
    }
}
