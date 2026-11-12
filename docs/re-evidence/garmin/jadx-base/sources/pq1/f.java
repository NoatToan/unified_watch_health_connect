package pq1;

import android.content.Context;
import androidx.core.view.j;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lpq1/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljq1/g;", "stepDetails", "<init>", "(Landroid/content/Context;Ljq1/g;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f139572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq1.g f139573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f139574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f139575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jq1.h f139576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f139577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f139578g;

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public f(Context context, jq1.g gVar) {
        int iIntValue;
        DateTime dateTimeWithTimeAtStartOfDay;
        boolean z14;
        DateTime dateTimeWithTimeAtStartOfDay2;
        List<jq1.h> list;
        ?? arrayList;
        Integer num;
        context.getClass();
        this.f139572a = context;
        this.f139573b = gVar;
        jq1.h hVar = null;
        Object obj = null;
        hVar = null;
        jq1.b bVar = gVar != null ? gVar.f100009a : null;
        if (bVar == null || (num = bVar.f99984f) == null) {
            iIntValue = 0;
        } else {
            int iIntValue2 = num.intValue();
            Integer num2 = bVar.f99981c;
            iIntValue = ((num2 != null ? num2.intValue() : 0) * 100) / (iIntValue2 <= 0 ? 1 : iIntValue2);
        }
        this.f139578g = iIntValue;
        if (bVar == null) {
            dateTimeWithTimeAtStartOfDay = null;
        } else {
            String str = bVar.f99980b;
            DateTime dateTimeK = (str == null || !(w.J(str) ^ true)) ? null : j0.K(str, "yyyy-MM-dd");
            if (dateTimeK != null) {
                dateTimeWithTimeAtStartOfDay = dateTimeK.withTimeAtStartOfDay();
            } else {
                dateTimeWithTimeAtStartOfDay = null;
            }
        }
        if (dateTimeWithTimeAtStartOfDay != null) {
            List<jq1.h> list2 = gVar.f100012d;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    jq1.h hVar2 = (jq1.h) obj2;
                    j0 j0Var = j0.f23099a;
                    DateTime dateTimeWithTimeAtStartOfDay3 = new DateTime(hVar2.f100014b).withTimeAtStartOfDay();
                    j0Var.getClass();
                    if (j0.F(dateTimeWithTimeAtStartOfDay3, dateTimeWithTimeAtStartOfDay) && !s.g(hVar2.f100013a, jq1.h.b.a.f100016a)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = p13.j0.f134944a;
            }
            z14 = !((Collection) arrayList).isEmpty();
        } else {
            z14 = false;
        }
        this.f139574c = z14;
        j0 j0Var2 = j0.f23099a;
        if (bVar == null) {
            dateTimeWithTimeAtStartOfDay2 = null;
        } else {
            String str2 = bVar.f99980b;
            DateTime dateTimeK2 = (str2 == null || !(w.J(str2) ^ true)) ? null : j0.K(str2, "yyyy-MM-dd");
            if (dateTimeK2 != null) {
                dateTimeWithTimeAtStartOfDay2 = dateTimeK2.withTimeAtStartOfDay();
            } else {
                dateTimeWithTimeAtStartOfDay2 = null;
            }
        }
        DateTime dateTimeNow = DateTime.now();
        j0Var2.getClass();
        boolean zF = j0.F(dateTimeWithTimeAtStartOfDay2, dateTimeNow);
        this.f139575d = z14 && zF;
        jq1.g gVar2 = this.f139573b;
        if (gVar2 != null && (list = gVar2.f100012d) != null) {
            for (Object obj3 : list) {
                jq1.h hVar3 = (jq1.h) obj3;
                if ((hVar3.f100013a instanceof jq1.h.b.a) && hVar3.f100015c >= 2.0d) {
                    obj = obj3;
                    break;
                }
            }
            hVar = (jq1.h) obj;
        }
        this.f139576e = hVar;
        this.f139577f = hVar != null && zF && this.f139578g >= 100;
    }

    public final String a() {
        int i14 = this.f139578g / 100;
        boolean z14 = this.f139575d;
        Context context = this.f139572a;
        if (z14) {
            return context.getString(R.string.lbl_new_personal_record_exclamation);
        }
        if (this.f139574c) {
            return context.getString(R.string.lbl_personal_record_exclamation);
        }
        if (this.f139577f) {
            jq1.h hVar = this.f139576e;
            return context.getString(R.string.lbl_x_day_goal_streak, hVar != null ? String.valueOf((int) hVar.f100015c) : null);
        }
        if (i14 == 1) {
            return context.getString(R.string.lbl_daily_goal_exclamation);
        }
        if (i14 > 1) {
            return context.getString(R.string.string_space_string_pattern, j.f(i14, context.getString(R.string.symbol_multiplication)), context.getString(R.string.lbl_daily_goal_exclamation));
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpq1/f$a;", "", "<init>", "()V", "", "GOAL_STREAK_MIN_DAYS", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
