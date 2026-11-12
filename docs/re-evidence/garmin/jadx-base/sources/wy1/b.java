package wy1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import fg0.d;
import fg0.o;
import gg0.i;
import gg0.j;
import i3.e5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import lz1.f;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import v22.e;
import wv2.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\n\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lwy1/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lwy1/b$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lfg0/o;", "mEvents", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "b", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.h<C3499b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f188055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o> f188056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f188057c;

    public interface a {
        void B3(o oVar);
    }

    /* JADX INFO: renamed from: wy1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwy1/b$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Lwy1/b;Landroid/view/View;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C3499b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinearLayout f188058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f188059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f188060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f188061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f188062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final LinearLayout f188063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ImageView f188064g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f188065h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ImageView f188066i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3499b(b bVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.item);
            viewFindViewById.getClass();
            this.f188058a = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.event_name);
            viewFindViewById2.getClass();
            this.f188059b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.event_sub_text);
            viewFindViewById3.getClass();
            this.f188060c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.text_view_date);
            viewFindViewById4.getClass();
            this.f188061d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.text_view_month);
            viewFindViewById5.getClass();
            this.f188062e = (TextView) viewFindViewById5;
            View viewFindViewById6 = view2.findViewById(R.id.provider_Layout);
            viewFindViewById6.getClass();
            this.f188063f = (LinearLayout) viewFindViewById6;
            View viewFindViewById7 = view2.findViewById(R.id.provider_img);
            viewFindViewById7.getClass();
            this.f188064g = (ImageView) viewFindViewById7;
            View viewFindViewById8 = view2.findViewById(R.id.provider_title);
            viewFindViewById8.getClass();
            this.f188065h = (TextView) viewFindViewById8;
            View viewFindViewById9 = view2.findViewById(R.id.course_img);
            viewFindViewById9.getClass();
            this.f188066i = (ImageView) viewFindViewById9;
        }
    }

    public b(Context context, List<o> list) {
        context.getClass();
        list.getClass();
        this.f188055a = context;
        this.f188056b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f188056b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) throws ParseException {
        d dVar;
        String strG;
        C3499b c3499b = (C3499b) f0Var;
        c3499b.getClass();
        TextView textView = c3499b.f188065h;
        ImageView imageView = c3499b.f188064g;
        LinearLayout linearLayout = c3499b.f188063f;
        TextView textView2 = c3499b.f188062e;
        o oVar = this.f188056b.get(i14);
        TextView textView3 = c3499b.f188059b;
        String strJ = o.j(oVar);
        String str = "";
        if (strJ == null) {
            strJ = "";
        }
        textView3.setText(strJ);
        String eventDate = oVar.getEventDate();
        if (eventDate != null) {
            Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(eventDate);
            date.getClass();
            String strG2 = j0.g(date, "MMM", null);
            String strG3 = j0.g(date, "MMMM", null);
            c3499b.f188061d.setText(j0.g(date, "d", null));
            textView2.setText(strG2);
            textView2.setContentDescription(strG3);
        }
        List<d> listG = oVar.g();
        Context context = this.f188055a;
        if (listG != null && (dVar = (d) h0.d0(listG)) != null) {
            if (dVar.getUnit() == i.SECOND) {
                l3.a aVar = l3.f23124b;
                Double value = dVar.getValue();
                Long lValueOf = value != null ? Long.valueOf((long) value.doubleValue()) : null;
                aVar.getClass();
                strG = String.valueOf(l3.a.g1(lValueOf));
            } else {
                f.f115404a.getClass();
                double dC = f.a.c(dVar);
                bg0.a.f17827a.getClass();
                if (bg0.a.C0255a.e()) {
                    x0 x0Var = x0.f105818a;
                    l3.f23124b.getClass();
                    strG = e5.g(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(l3.a.T1(dC / 1000.0d, 2))}, 1)), StringUtils.SPACE, context.getString(R.string.unit_enum_km));
                } else {
                    x0 x0Var2 = x0.f105818a;
                    l3.f23124b.getClass();
                    strG = e5.g(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(l3.a.T1(dC / 1609.344d, 2))}, 1)), StringUtils.SPACE, context.getString(R.string.unit_enum_mi));
                }
            }
            str = strG;
        }
        TextView textView4 = c3499b.f188060c;
        og0.a aVar2 = og0.a.f131967a;
        fg0.a administrativeArea = oVar.getAdministrativeArea();
        String strF = administrativeArea != null ? administrativeArea.f() : null;
        aVar2.getClass();
        textView4.setText(og0.a.s(strF, str));
        Boolean hasCourse = oVar.getHasCourse();
        Boolean bool = Boolean.TRUE;
        if (s.g(hasCourse, bool)) {
            e.q(c3499b.f188066i);
        }
        j verifiedStatus = oVar.getVerifiedStatus();
        if (verifiedStatus != null) {
            if (s.g(oVar.getIsOfficial(), bool)) {
                e.q(linearLayout);
                e.q(imageView);
                textView.setText(context.getString(R.string.official_event));
            } else if (j.VERIFIED == verifiedStatus) {
                e.q(linearLayout);
                e.j(imageView);
                textView.setText(context.getString(verifiedStatus.f77180a));
            }
        }
        c3499b.f188058a.setOnClickListener(new h(2, this, c3499b));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new C3499b(this, n23.j.b(viewGroup, R.layout.item_search_event, viewGroup, false));
    }
}
