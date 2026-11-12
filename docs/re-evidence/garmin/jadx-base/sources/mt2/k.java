package mt2;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmt2/k;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum k {
    RUNNING("running"),
    CYCLING("cycling"),
    OTHER("other"),
    SWIMMING("swimming"),
    STRENGTH("strength_training"),
    CARDIO("cardio_training"),
    YOGA("yoga"),
    PILATES("pilates"),
    HIIT("hiit"),
    MOBILITY("mobility");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121072a;

    k(String str) {
        this.f121072a = str;
    }
}
