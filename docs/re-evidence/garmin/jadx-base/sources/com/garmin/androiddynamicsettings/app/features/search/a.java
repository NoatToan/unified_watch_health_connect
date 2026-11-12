package com.garmin.androiddynamicsettings.app.features.search;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import d53.u;
import d53.w;
import hi2.d;
import hi2.i;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u000f\u0010B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/search/a;", "Landroid/widget/Filterable;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/androiddynamicsettings/app/features/search/a$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "", "", "searchIndex", "Lcom/garmin/androiddynamicsettings/app/features/search/a$a;", "onItemClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/garmin/androiddynamicsettings/app/features/search/a$a;)V", "a", "b", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends RecyclerView.h<b> implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Map<String, Object>> f50637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1017a f50638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f50639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f50640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f50641f;

    /* JADX INFO: renamed from: com.garmin.androiddynamicsettings.app.features.search.a$a, reason: collision with other inner class name */
    public interface InterfaceC1017a {
        void M6(int i14, List<vh2.a> list);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/search/a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "Lcom/garmin/androiddynamicsettings/app/features/search/a$a;", "onItemClick", "", "Lvh2/a;", "searchDataObject", "<init>", "(Landroid/view/View;Lcom/garmin/androiddynamicsettings/app/features/search/a$a;Ljava/util/List;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1017a f50642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<vh2.a> f50643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StyledTextView f50644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final StyledTextView f50645d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2, InterfaceC1017a interfaceC1017a, List<vh2.a> list) {
            super(view2);
            view2.getClass();
            interfaceC1017a.getClass();
            list.getClass();
            this.f50642a = interfaceC1017a;
            this.f50643b = list;
            View viewFindViewById = view2.findViewById(R.id.result_title);
            viewFindViewById.getClass();
            this.f50644c = (StyledTextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.result_location);
            viewFindViewById2.getClass();
            this.f50645d = (StyledTextView) viewFindViewById2;
            view2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            this.f50642a.M6(getAdapterPosition(), this.f50643b);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/androiddynamicsettings/app/features/search/a$c", "Landroid/widget/Filter;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends Filter {
        public c() {
        }

        @Override // android.widget.Filter
        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            a aVar = a.this;
            d dVar = aVar.f50639d;
            ArrayList arrayList = aVar.f50640e;
            Context context = aVar.f50636a;
            dVar.getClass();
            String string = charSequence != null ? charSequence.toString() : null;
            if (string == null || string.length() == 0) {
                arrayList.clear();
            } else {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = aVar.f50637b.iterator();
                while (it.hasNext()) {
                    Map map = (Map) it.next();
                    String strD = i.a.d(i.f83907a, context, String.valueOf(map.get(mh2.i.TITLE.f118617a)));
                    String strValueOf = String.valueOf(map.get(mh2.i.LOCATION.f118617a));
                    String str = "";
                    for (String str2 : w.W(strValueOf, new String[]{">"})) {
                        if (str.length() > 0) {
                            str = ((Object) str) + ">";
                        }
                        str = ((Object) str) + i.a.d(i.f83907a, context, str2);
                    }
                    if (str.length() > 0) {
                        strValueOf = str;
                    }
                    if (u.y(strD, string, true)) {
                        arrayList2.add(new vh2.a(strD, String.valueOf(map.get(mh2.i.SECTION.f118617a)), strValueOf));
                    } else if (w.z(strD, string, true)) {
                        arrayList3.add(new vh2.a(strD, String.valueOf(map.get(mh2.i.SECTION.f118617a)), strValueOf));
                    }
                }
                arrayList.clear();
                if (!arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add((vh2.a) it3.next());
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it4 = h0.N0(arrayList3, new vh2.d()).iterator();
                    while (it4.hasNext()) {
                        arrayList.add((vh2.a) it4.next());
                    }
                    aVar.f50639d.getClass();
                }
            }
            return new Filter.FilterResults();
        }

        @Override // android.widget.Filter
        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            a.this.f50639d.getClass();
            a aVar = a.this;
            synchronized (aVar.f50640e) {
                aVar.notifyDataSetChanged();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public a(Context context, List<Map<String, Object>> list, InterfaceC1017a interfaceC1017a) {
        context.getClass();
        list.getClass();
        interfaceC1017a.getClass();
        this.f50636a = context;
        this.f50637b = list;
        this.f50638c = interfaceC1017a;
        this.f50639d = new d("SearchResultsAdapter", null, 2, null);
        this.f50640e = new ArrayList();
        this.f50641f = new c();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.f50641f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        int size = this.f50640e.size();
        this.f50639d.getClass();
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        StyledTextView styledTextView = bVar.f50644c;
        ArrayList arrayList = this.f50640e;
        styledTextView.setText(((vh2.a) arrayList.get(i14)).f178408a);
        bVar.f50645d.setText(u.v(((vh2.a) arrayList.get(i14)).f178410c, ">", " > ", false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.dsl_search_results, viewGroup, false);
        viewE.getClass();
        return new b(viewE, this.f50638c, this.f50640e);
    }
}
