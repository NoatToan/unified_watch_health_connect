package k30;

import c22.c3;
import c22.g2;
import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB#\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lk30/k;", "", "", Action.KEY_ATTRIBUTE, "Lc22/c3;", NotificationConstants.KEY_DATA_MIME_TYPE, "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lc22/c3;Lc22/c3;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum k {
    POPULARITY("POPULARITY", c22.i.b(R.string.lbl_routing_most_popular), c22.i.b(R.string.lbl_routing_most_popular_subtitle)),
    FOLLOW_ROADS("FOLLOW_ROADS", c22.i.b(R.string.lbl_routing_most_direct), c22.i.b(R.string.lbl_routing_most_direct_subtitle)),
    MIN_ASCENT("MIN_ASCENT", g2.b(x0.Nc), g2.b(x0.Oc)),
    FREE_FLOW("FREE_FLOW", g2.b(x0.Lc), g2.b(x0.Mc)),
    FREEHAND(null, c22.i.b(R.string.lbl_freehand), c22.i.b(R.string.lbl_routing_freehand_subtitle));


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f102555d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f102563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f102564c;

    static {
        x0.f23314a.getClass();
        f102555d = new a(null);
    }

    k(String str, c3 c3Var, c3 c3Var2) {
        this.f102562a = str;
        this.f102563b = c3Var;
        this.f102564c = c3Var2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk30/k$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static List a(com.garmin.android.apps.connectmobile.courses.model.i iVar) {
            iVar.getClass();
            return iVar.c() ? p13.x.k(k.POPULARITY, k.MIN_ASCENT, k.FREE_FLOW) : p13.x.k(k.POPULARITY, k.MIN_ASCENT);
        }

        private a() {
        }
    }
}
