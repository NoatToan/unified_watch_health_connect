package r51;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.v;
import com.garmin.android.apps.connectmobile.f1;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.text.DecimalFormat;
import java.util.ArrayList;
import oi0.g;
import oi0.h;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import qv1.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lr51/d;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lr51/d$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Lr51/d$a;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f150485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f150486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> f150487e;

    public interface a {
        void O1(long j8);

        void d0(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar);
    }

    public d(Context context, a aVar) {
        context.getClass();
        this.f150485c = context;
        this.f150486d = aVar;
        this.f150487e = new ArrayList<>();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f150487e.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        Integer numValueOf = f0Var != null ? Integer.valueOf(f0Var.getBindingAdapterPosition()) : null;
        if (f0Var == null || numValueOf == null || !(f0Var instanceof c)) {
            return;
        }
        c cVar = (c) f0Var;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = this.f150487e.get(numValueOf.intValue());
        bVar.getClass();
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar2 = bVar;
        TextView textView = cVar.f150483d;
        View view2 = cVar.f150480a;
        Context context = view2.getContext();
        ComposeView composeView = cVar.f150484e;
        a aVar = this.f150486d;
        composeView.setOnClickListener(new b(bVar2, aVar));
        cVar.f150481b.setImageResource(2131231984);
        cVar.f150482c.setText(bVar2.f39765b);
        l3.a aVar2 = l3.f23124b;
        double d14 = bVar2.f39770g;
        m3 m3Var = bVar2.d() ? m3.KILOMETER : m3.MILE;
        DecimalFormat decimalFormat = l3.f23129g;
        aVar2.getClass();
        String strO = l3.a.O(context, d14, m3Var, decimalFormat, true);
        long j8 = bVar2.f39773j;
        double d15 = j8 / (bVar2.f39770g / (com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g() ? 1000.0d : 1609.344d));
        String strB1 = l3.a.b1(((long) 1000) * j8);
        context.getClass();
        String string = context.getString(R.string.pace_pro_time_pace_format, strB1, l3.a.y0(aVar2, context, d15, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g(), true));
        string.getClass();
        textView.setText(context.getString(R.string.string_space_bullet_string_pattern, strO, string));
        h hVar = new h(context);
        String strD = hVar.d(j8, true);
        String string2 = context.getString(R.string.string_space_string_pattern, hVar.d(MathKt.d(d15), true), new g(context).a(com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g()));
        string2.getClass();
        String string3 = context.getString(R.string.pace_pro_time_pace_format, strD, string2);
        string3.getClass();
        textView.setContentDescription(context.getString(R.string.string_space_string_pattern, oi0.c.A(context, new l(20), strO), string3));
        view2.setOnClickListener(new b(aVar, bVar2));
        view2.setLongClickable(true);
        view2.setOnLongClickListener(new v(bVar2, aVar));
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewInflate = LayoutInflater.from(this.f150485c).inflate(R.layout.pacepro_list_item, viewGroup, false);
        viewInflate.getClass();
        return new c(viewInflate);
    }
}
