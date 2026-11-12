package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.view.SportPaceSegmentView;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class dro extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15843a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15844b = 0;
    public Context c;
    public List<gro> d;
    public List<gro> e;
    public final LayoutInflater f;
    public b9h g;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f15845a;

        public a(View view) {
            super(view);
            this.f15845a = (TextView) view.findViewById(bsi.H9);
        }

        public void a(gro groVar) {
            this.f15845a.setText(String.format(dro.this.c.getString(j1j.Q9), pz6.b(dro.this.c, (int) groVar.f34530b), TimeDateUtil.getZNTimeWithSec((int) groVar.f34529a)));
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f15847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f15848b;
        public SportPaceSegmentView c;

        public b(View view) {
            super(view);
            this.f15847a = view;
            this.f15848b = (TextView) view.findViewById(bsi.C9);
            this.c = (SportPaceSegmentView) view.findViewById(bsi.R4);
        }

        public void a(gro groVar, int i) {
            this.f15848b.setText(String.format(dro.this.c.getString(j1j.P9), Integer.valueOf(groVar.c)) + "  " + String.format(dro.this.c.getString(j1j.W9), Integer.valueOf(groVar.l)) + "  " + String.format(dro.this.c.getString(j1j.X9), gro.i(dro.this.c, groVar.m)));
            this.c.e(groVar, dro.this.j(), dro.this.l(i), 1);
        }
    }

    public class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f15849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Boolean f15850b;

        public c(View view) {
            super(view);
            this.f15850b = Boolean.FALSE;
            this.f15849a = (TextView) view.findViewById(bsi.i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view) {
            if (dro.this.g != null) {
                if (this.f15850b.booleanValue()) {
                    dro.this.g.onShowPassage();
                    this.f15850b = Boolean.FALSE;
                    this.f15849a.setText(j1j.a7);
                } else {
                    dro.this.g.onLoadMore();
                    this.f15850b = Boolean.TRUE;
                    this.f15849a.setText(j1j.b7);
                }
            }
        }

        public void bindData() {
            this.f15849a.setOnClickListener(new View.OnClickListener() { // from class: ero
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17006a.b(view);
                }
            });
        }
    }

    public class d extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f15851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f15852b;

        public d(View view) {
            super(view);
            this.f15851a = (ImageView) view.findViewById(bsi.O2);
            this.f15852b = (TextView) view.findViewById(bsi.I9);
        }

        public void bindData() {
            this.f15851a.setImageResource(hoi.i2);
            this.f15852b.setText(j1j.R9);
        }
    }

    public dro(Context context, List<gro> list, b9h b9hVar) {
        this.c = context;
        this.d = list;
        this.f = LayoutInflater.from(context);
        this.g = b9hVar;
    }

    public int getContentItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15843a + getContentItemCount() + this.f15844b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return super.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int contentItemCount = getContentItemCount();
        int i2 = this.f15843a;
        if (i2 != 0 && i < i2) {
            return -2;
        }
        if (this.f15844b != 0 && i >= contentItemCount + i2) {
            return -1;
        }
        gro groVar = this.d.get(i - i2);
        if (groVar != null) {
            return groVar.f;
        }
        return 0;
    }

    public boolean isBottomView(int i) {
        return this.f15844b != 0 && i >= this.f15843a + getContentItemCount();
    }

    public boolean isHeaderView(int i) {
        int i2 = this.f15843a;
        return i2 != 0 && i < i2;
    }

    public m9f j() {
        return tb2.b(this.e);
    }

    public gro k(int i) {
        if (i == -1 || isBottomView(i) || isHeaderView(i)) {
            return null;
        }
        return this.d.get(i - this.f15843a);
    }

    public boolean l(int i) {
        gro groVar = this.d.get(i - this.f15843a);
        return groVar != null && groVar.f == 0 && groVar.f34530b >= 100.0f;
    }

    public void m(List<gro> list) {
        this.e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        gro groVar;
        if (d0Var instanceof d) {
            ((d) d0Var).bindData();
            return;
        }
        if (d0Var instanceof c) {
            ((c) d0Var).bindData();
            return;
        }
        if (d0Var instanceof a) {
            gro groVar2 = this.d.get(i - this.f15843a);
            if (groVar2 != null) {
                ((a) d0Var).a(groVar2);
                return;
            }
            return;
        }
        if (!(d0Var instanceof b) || (groVar = this.d.get(i - this.f15843a)) == null) {
            return;
        }
        b bVar = (b) d0Var;
        bVar.a(groVar, i);
        bVar.f15847a.setTag(groVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == -2) {
            return new d(this.f.inflate(ivi.k1, viewGroup, false));
        }
        if (i == -1) {
            return new c(this.f.inflate(ivi.n1, viewGroup, false));
        }
        return i == 1 ? new a(this.f.inflate(ivi.m1, viewGroup, false)) : new b(this.f.inflate(ivi.l1, viewGroup, false));
    }

    public void setBottomCount(int i) {
        this.f15844b = i;
        notifyDataSetChanged();
    }
}
