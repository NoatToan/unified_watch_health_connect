package dp1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f1;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yo1.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ldp1/d;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Lyo1/k;", "", "onItemSelected", "<init>", "(Landroid/content/Context;Le23/l;)V", "a", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f60649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<k, Unit> f60650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f60651e;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, l<? super k, Unit> lVar) {
        context.getClass();
        lVar.getClass();
        this.f60649c = context;
        this.f60650d = lVar;
        this.f60651e = new ArrayList();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f60651e.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        String string;
        if (f0Var instanceof h) {
            k kVar = (k) this.f60651e.get(i14);
            h hVar = (h) f0Var;
            String name = kVar.getName();
            String activityName = kVar.getActivityName();
            String strK = "";
            if (activityName == null) {
                activityName = "";
            }
            DateTime dateTimeQ = g22.k.q(kVar.getStartDateTime(), "yyyy-MM-dd'T'HH:mm:ss.S", DateTimeZone.UTC);
            Date date = null;
            DateTime dateTimeWithZone = dateTimeQ != null ? dateTimeQ.withZone(DateTimeZone.getDefault()) : null;
            if (dateTimeWithZone != null) {
                j0.f23099a.getClass();
                string = dateTimeWithZone.toString(j0.z());
            } else {
                string = "";
            }
            if (activityName.length() != 0) {
                string = this.f60649c.getString(R.string.string_space_dot_space_string_pattern, activityName, string);
            }
            try {
                date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S", Locale.getDefault()).parse(kVar.getStartDateTime());
            } catch (ParseException e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.SOCIAL_GROUP_RIDE;
                aVar.getClass();
                i2.a.g(a2Var, "GroupRideSummaryAdapter", e4);
            }
            if (date != null) {
                j0 j0Var = j0.f23099a;
                LocalDate localDate = new DateTime(date).toLocalDate();
                localDate.getClass();
                j0Var.getClass();
                strK = j0.k(localDate.toDateTimeAtStartOfDay(), 'M');
            }
            Boolean boolValueOf = Boolean.valueOf(kVar.getCompleted());
            TextView textView = hVar.f60663d;
            TextView textView2 = hVar.f60662c;
            hVar.f60660a.setText(name);
            TextView textView3 = hVar.f60661b;
            if (string != null) {
                v22.e.q(textView3);
                textView3.setText(string);
            } else {
                v22.e.j(textView3);
            }
            v22.e.q(textView2);
            textView2.setText(strK);
            v22.e.j(textView);
            if (boolValueOf.equals(Boolean.FALSE)) {
                textView.setVisibility(0);
            }
            hVar.itemView.setOnClickListener(new cw2.b(6, this, kVar));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewInflate = LayoutInflater.from(this.f60649c).inflate(R.layout.gcm_group_ride_summary_list_item, viewGroup, false);
        viewInflate.getClass();
        return new h(viewInflate);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldp1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
