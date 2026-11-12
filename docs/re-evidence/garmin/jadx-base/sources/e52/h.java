package e52;

import android.content.Context;
import androidx.core.view.j;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Le52/h;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lz42/g;", "pushesDetails", "<init>", "(Landroid/content/Context;Lz42/g;)V", "a", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f63089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z42.h f63090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63092d;

    static {
        new a(null);
    }

    public h(Context context, z42.g gVar) {
        int iIntValue;
        List<z42.h> list;
        DateTime dateTimeB;
        Integer pushesGoal;
        context.getClass();
        this.f63089a = context;
        z42.h hVar = null;
        Object obj = null;
        hVar = null;
        z42.b bVar = gVar != null ? gVar.f202396a : null;
        if (bVar == null || (pushesGoal = bVar.getPushesGoal()) == null) {
            iIntValue = 0;
        } else {
            int iIntValue2 = pushesGoal.intValue();
            Integer pushes = bVar.getPushes();
            iIntValue = ((pushes != null ? pushes.intValue() : 0) * 100) / (iIntValue2 <= 0 ? 1 : iIntValue2);
        }
        this.f63092d = iIntValue;
        j0 j0Var = j0.f23099a;
        DateTime dateTimeWithTimeAtStartOfDay = (bVar == null || (dateTimeB = bVar.b()) == null) ? null : dateTimeB.withTimeAtStartOfDay();
        DateTime dateTimeNow = DateTime.now();
        j0Var.getClass();
        boolean zF = j0.F(dateTimeWithTimeAtStartOfDay, dateTimeNow);
        if (gVar != null && (list = gVar.f202399d) != null) {
            for (Object obj2 : list) {
                z42.h hVar2 = (z42.h) obj2;
                if ((hVar2.f202400a instanceof z42.h.a.C3773a) && hVar2.f202401b >= 2.0d) {
                    obj = obj2;
                    break;
                }
            }
            hVar = (z42.h) obj;
        }
        this.f63090b = hVar;
        this.f63091c = hVar != null && zF && this.f63092d >= 100;
    }

    public final String a() {
        int i14 = this.f63092d / 100;
        boolean z14 = this.f63091c;
        Context context = this.f63089a;
        if (z14) {
            z42.h hVar = this.f63090b;
            return context.getString(R.string.lbl_x_day_goal_streak, hVar != null ? String.valueOf((int) hVar.f202401b) : null);
        }
        if (i14 == 1) {
            return context.getString(R.string.lbl_daily_goal_exclamation);
        }
        if (i14 > 1) {
            return context.getString(R.string.string_space_string_pattern, j.f(i14, context.getString(R.string.symbol_multiplication)), context.getString(R.string.lbl_daily_goal_exclamation));
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le52/h$a;", "", "<init>", "()V", "", "GOAL_STREAK_MIN_DAYS", "I", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
