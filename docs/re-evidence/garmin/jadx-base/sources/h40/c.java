package h40;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import aq.q1;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh40/c;", "", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "onClose", "<init>", "(Landroid/view/View;Le23/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f81593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f81594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f81595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f81596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f81597e;

    public c(View view2, e23.a<Unit> aVar) {
        view2.getClass();
        aVar.getClass();
        this.f81593a = view2;
        this.f81594b = view2.getContext();
        this.f81595c = (ImageView) view2.findViewById(R.id.hazard_type_icon);
        this.f81596d = (TextView) view2.findViewById(R.id.hazard_type_tv);
        this.f81597e = (TextView) view2.findViewById(R.id.last_reported_time_tv);
        view2.findViewById(R.id.bottom_sheet_close_iv).setOnClickListener(new q1(aVar, 5));
    }

    public final String a(DateTime dateTime, boolean z14) {
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        if (lValueOf == null || lValueOf.longValue() <= 0) {
            return "";
        }
        j0.f23099a.getClass();
        DateTime dateTimeB = j0.B(lValueOf);
        if (dateTimeB == null) {
            return "";
        }
        Context context = this.f81594b;
        context.getClass();
        return xy2.b.q(context, dateTimeB, z14, 12);
    }
}
