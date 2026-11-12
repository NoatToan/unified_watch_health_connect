package wy1;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import fg0.d;
import fg0.k;
import fg0.n;
import gg0.i;
import gg0.j;
import i3.e5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lz1.f;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import v22.e;
import wv2.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\f\rB-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lwy1/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lwy1/c$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lfg0/k;", "mEvents", "Lfg0/n;", "eventProviders", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V", "b", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f188067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<k> f188068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<n> f188069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f188070d;

    public interface a {
        void f(k kVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwy1/c$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Lwy1/c;Landroid/view/View;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinearLayout f188071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f188072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f188073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f188074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f188075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final LinearLayout f188076f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ImageView f188077g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f188078h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ImageView f188079i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.item);
            viewFindViewById.getClass();
            this.f188071a = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.event_name);
            viewFindViewById2.getClass();
            this.f188072b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.event_sub_text);
            viewFindViewById3.getClass();
            this.f188073c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.text_view_date);
            viewFindViewById4.getClass();
            this.f188074d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.text_view_month);
            viewFindViewById5.getClass();
            this.f188075e = (TextView) viewFindViewById5;
            View viewFindViewById6 = view2.findViewById(R.id.provider_Layout);
            viewFindViewById6.getClass();
            this.f188076f = (LinearLayout) viewFindViewById6;
            View viewFindViewById7 = view2.findViewById(R.id.provider_img);
            viewFindViewById7.getClass();
            this.f188077g = (ImageView) viewFindViewById7;
            View viewFindViewById8 = view2.findViewById(R.id.provider_title);
            viewFindViewById8.getClass();
            this.f188078h = (TextView) viewFindViewById8;
            View viewFindViewById9 = view2.findViewById(R.id.course_img);
            viewFindViewById9.getClass();
            this.f188079i = (ImageView) viewFindViewById9;
        }
    }

    public c(Context context, List<k> list, List<n> list2) {
        context.getClass();
        list.getClass();
        this.f188067a = context;
        this.f188068b = list;
        this.f188069c = list2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f188068b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        j verifiedStatus;
        String strG;
        b bVar = (b) f0Var;
        bVar.getClass();
        TextView textView = bVar.f188078h;
        ImageView imageView = bVar.f188077g;
        LinearLayout linearLayout = bVar.f188076f;
        k kVar = this.f188068b.get(i14);
        TextView textView2 = bVar.f188072b;
        Parcelable.Creator<k> creator = k.CREATOR;
        String strR = kVar.r(false);
        String str = "";
        if (strR == null) {
            strR = "";
        }
        textView2.setText(strR);
        LocalDate date = kVar.getDate();
        if (date != null) {
            String string = date.toString("MMM");
            bVar.f188074d.setText(date.toString("d"));
            bVar.f188075e.setText(string);
        }
        d completionTarget = kVar.getCompletionTarget();
        Context context = this.f188067a;
        n nVar = null;
        obj = null;
        Object obj = null;
        if (completionTarget != null) {
            if (completionTarget.getUnit() == i.SECOND) {
                l3.a aVar = l3.f23124b;
                Double value = completionTarget.getValue();
                Long lValueOf = value != null ? Long.valueOf((long) value.doubleValue()) : null;
                aVar.getClass();
                strG = String.valueOf(l3.a.g1(lValueOf));
            } else {
                f.f115404a.getClass();
                double dC = f.a.c(completionTarget);
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
        TextView textView3 = bVar.f188073c;
        og0.a aVar2 = og0.a.f131967a;
        String location = kVar.getLocation();
        aVar2.getClass();
        textView3.setText(og0.a.s(location, str));
        e.v(bVar.f188079i, kVar.getCourseId() != null);
        List<String> listG0 = kVar.g0();
        if (listG0 == null || !listG0.contains("OFFICIAL")) {
            List<n> list = this.f188069c;
            if (list != null) {
                Iterator<T> it = list.iterator();
                Object[] objArr = false;
                Object obj2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (objArr != true) {
                            break;
                        }
                        obj = obj2;
                        break;
                    } else {
                        Object next = it.next();
                        if (u.q(((n) next).getEventsProviderKey(), kVar.getProvider(), false)) {
                            if (objArr == true) {
                                break;
                            }
                            objArr = true;
                            obj2 = next;
                        }
                    }
                }
                nVar = (n) obj;
            }
            if (nVar != null && (verifiedStatus = nVar.getVerifiedStatus()) != null && verifiedStatus != j.NONE) {
                e.q(linearLayout);
                e.j(imageView);
                textView.setText(context.getString(verifiedStatus.f77180a));
            }
        } else {
            e.q(linearLayout);
            e.q(imageView);
            textView.setText(context.getString(R.string.official_event));
        }
        bVar.f188071a.setOnClickListener(new h(3, this, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(this, n23.j.b(viewGroup, R.layout.item_search_event, viewGroup, false));
    }
}
