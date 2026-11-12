package yo;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.perf.FirebasePerformance;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyo/b;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    ADD("ADD"),
    EDIT("EDIT"),
    DELETE(FirebasePerformance.HttpMethod.DELETE);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f198220a;

    b(String str) {
        this.f198220a = str;
    }
}
