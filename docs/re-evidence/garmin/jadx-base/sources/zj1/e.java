package zj1;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import yr.o0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzj1/e;", "Lcom/garmin/android/apps/connectmobile/f1;", "", "headerAdded", "Lkotlin/Function1;", "Ll20/a;", "", "onClick", "<init>", "(ZLe23/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f204913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<l20.a, Unit> f204914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f204915e;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzj1/e$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Lkotlin/Function1;", "Ll20/a;", "", "onClick", "<init>", "(Lzj1/e;Landroid/view/View;Le23/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.l<l20.a, Unit> f204916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l20.a f204917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f204918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f204919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f204920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final View f204921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f204922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f204923h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ImageView f204924i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e eVar, View view2, e23.l<? super l20.a, Unit> lVar) {
            super(view2);
            view2.getClass();
            lVar.getClass();
            this.f204916a = lVar;
            this.f204918c = (TextView) view2.findViewById(R.id.contact_info_label);
            this.f204919d = (TextView) view2.findViewById(R.id.contact_info_value);
            this.f204920e = (TextView) view2.findViewById(R.id.contact_warning_label);
            this.f204921f = view2.findViewById(R.id.contact_info_warning);
            this.f204922g = (TextView) view2.findViewById(R.id.contact_details_label);
            this.f204923h = (TextView) view2.findViewById(R.id.contact_add_another_method_link);
            this.f204924i = (ImageView) view2.findViewById(R.id.emergency_contact_icon);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(boolean z14, e23.l<? super l20.a, Unit> lVar) {
        lVar.getClass();
        this.f204913c = z14;
        this.f204914d = lVar;
        this.f204915e = new ArrayList();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f204915e.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (i14 == -1) {
            return;
        }
        String strV = null;
        a aVar = f0Var instanceof a ? (a) f0Var : null;
        if (aVar != null) {
            boolean z14 = this.f204913c;
            ArrayList arrayList = this.f204915e;
            if (z14) {
                i14--;
            }
            l20.a aVar2 = (l20.a) arrayList.get(i14);
            ImageView imageView = aVar.f204924i;
            TextView textView = aVar.f204922g;
            TextView textView2 = aVar.f204923h;
            aVar2.getClass();
            aVar.f204917b = aVar2;
            Context context = aVar.itemView.getContext();
            context.getClass();
            if (c22.b.e(context)) {
                ViewGroup.LayoutParams layoutParams = aVar.f204921f.getLayoutParams();
                Context context2 = aVar.itemView.getContext();
                context2.getClass();
                Resources resources = aVar.itemView.getResources();
                resources.getClass();
                layoutParams.width = (int) c22.b.c(context2, xy2.b.n(resources, 16.0f), 1.5f);
            }
            TextView textView3 = aVar.f204918c;
            textView3.getClass();
            textView3.setVisibility(8);
            TextView textView4 = aVar.f204920e;
            textView4.getClass();
            textView4.setVisibility(8);
            aVar.f204919d.setText(aVar2.j());
            List<l20.c> listK = aVar2.k();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listK) {
                l20.c cVar = (l20.c) obj;
                if (cVar.H() || cVar.Z()) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                textView.getClass();
                textView.setVisibility(8);
            } else {
                Context context3 = aVar.itemView.getContext();
                if (s.g(com.garmin.android.apps.connectmobile.contacts.b.h(aVar2, (l20.c) arrayList2.get(0)), Boolean.TRUE)) {
                    strV = ((l20.c) arrayList2.get(0)).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                } else {
                    String str = ((l20.c) arrayList2.get(0)).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    if (str != null) {
                        Context context4 = aVar.itemView.getContext();
                        context4.getClass();
                        strV = jg.b.v(context4, str);
                    }
                }
                String string = context3.getString(R.string.request_sent_to_contact_method, strV);
                string.getClass();
                if (arrayList2.size() > 1) {
                    string = string + " + " + (arrayList2.size() - 1) + StringUtils.SPACE + aVar.itemView.getContext().getString(R.string.lbl_more);
                }
                textView.setText(string);
            }
            List<l20.c> listK2 = aVar2.k();
            if (listK2 != null && listK2.isEmpty()) {
                textView2.getClass();
                textView2.setVisibility(8);
                break;
            }
            Iterator<T> it = listK2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((l20.c) it.next()).G()) {
                        String string2 = aVar.itemView.getContext().getString(R.string.add_another_contact_method);
                        string2.getClass();
                        textView2.getClass();
                        v22.e.p(textView2, string2, string2, a7.b.getColor(aVar.itemView.getContext(), R.color.gcm_text_primary_action), new o0(aVar, 18));
                        textView2.setVisibility(0);
                        break;
                    }
                } else {
                    textView2.getClass();
                    textView2.setVisibility(8);
                    break;
                }
            }
            Integer numF = ge1.b.F(aVar2);
            if (numF != null) {
                int iIntValue = numF.intValue();
                imageView.getClass();
                imageView.setVisibility(0);
                imageView.setImageResource(iIntValue);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.gcm4_emergency_contact_info_list_item, viewGroup, false), this.f204914d);
    }

    public /* synthetic */ e(boolean z14, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, lVar);
    }
}
