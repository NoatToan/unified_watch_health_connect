package w20;

import c22.c3;
import c22.g2;
import c22.i;
import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.w;
import p13.x;
import s20.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lw20/b;", "", "Lc22/c3;", Constants.ScionAnalytics.PARAM_LABEL, "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILc22/c3;Ljava/lang/String;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    TAILWIND(g2.b(x0.Ic), "tailwind"),
    RANDOM(i.b(R.string.lbl_direction_random), "random"),
    SOUTH(i.b(R.string.direction_south), "south"),
    NORTH(i.b(R.string.direction_north), "north"),
    EAST(i.b(R.string.direction_east), "east"),
    WEST(i.b(R.string.direction_west), "west");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f181482c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f181490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181491b;

    static {
        x0.f23314a.getClass();
        f181482c = new a(null);
    }

    b(c3 c3Var, String str) {
        this.f181490a = c3Var;
        this.f181491b = str;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw20/b$a;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a() {
            q13.b bVarB = w.b();
            bVarB.addAll(x.k(b.NORTH, b.EAST, b.WEST, b.SOUTH));
            if (((h) KoinJavaComponent.get$default(h.class, null, null, 6, null)).c()) {
                bVarB.add(b.TAILWIND);
            }
            return (b) h0.E0(w.a(bVarB), h23.c.f81216a);
        }

        private a() {
        }
    }
}
