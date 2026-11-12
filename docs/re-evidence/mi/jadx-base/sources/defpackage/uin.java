package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.detail.view.SportPaceSegmentView;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class uin extends RecyclerView.Adapter<RecyclerView.d0> {
    public Context c;
    public List<b0o> d;
    public List<b0o> e;
    public LayoutInflater f;
    public b9h h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35797a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35798b = 1;
    public boolean g = this.g;
    public boolean g = this.g;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f35799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f35800b;
        public SportPaceSegmentView c;

        public a(View view) {
            super(view);
            this.f35799a = view;
            this.f35800b = (TextView) view.findViewById(bsi.r7);
            this.c = (SportPaceSegmentView) view.findViewById(bsi.R4);
        }

        public void a(b0o b0oVar, m9f m9fVar, int i) {
            this.f35800b.setText(Integer.toString(b0oVar.c));
            this.c.f(x44.a(dki.r1), x44.a(dki.q1));
            this.c.e(b0oVar, m9fVar, true, 0);
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f35801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Boolean f35802b;

        public b(View view) {
            super(view);
            this.f35802b = Boolean.FALSE;
            this.f35801a = (TextView) view.findViewById(bsi.i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view) {
            if (uin.this.h != null) {
                if (this.f35802b.booleanValue()) {
                    uin.this.h.onShowPassage();
                    this.f35802b = Boolean.FALSE;
                    this.f35801a.setText(j1j.a7);
                } else {
                    uin.this.h.onLoadMore();
                    this.f35802b = Boolean.TRUE;
                    this.f35801a.setText(j1j.b7);
                }
            }
        }

        public void bindData() {
            this.f35801a.setOnClickListener(new View.OnClickListener() { // from class: vin
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f36934a.b(view);
                }
            });
        }
    }

    public class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f35803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f35804b;

        public c(View view) {
            super(view);
            this.f35803a = (TextView) view.findViewById(bsi.K9);
            this.f35804b = (TextView) view.findViewById(bsi.B9);
        }

        public void bindData() {
            this.f35803a.setText(uin.this.c.getText(j1j.q7));
            this.f35804b.setText(uin.this.c.getText(j1j.n7));
        }
    }

    public uin(Context context, List<b0o> list, b9h b9hVar) {
        this.c = context;
        this.d = list;
        this.h = b9hVar;
        this.f = LayoutInflater.from(context);
    }

    public int getContentItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f35797a + getContentItemCount() + this.f35798b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return super.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int contentItemCount = getContentItemCount();
        int i2 = this.f35797a;
        if (i2 != 0 && i < i2) {
            return -2;
        }
        if (this.f35798b != 0 && i >= contentItemCount + i2) {
            return -1;
        }
        b0o b0oVar = this.d.get(i - i2);
        if (b0oVar != null) {
            return b0oVar.f;
        }
        return 0;
    }

    public void j(List<b0o> list) {
        this.e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof c) {
            ((c) d0Var).bindData();
            return;
        }
        if (d0Var instanceof b) {
            ((b) d0Var).bindData();
            return;
        }
        if (d0Var instanceof a) {
            m9f m9fVarE = tb2.e(this.e);
            b0o b0oVar = this.d.get(i - this.f35797a);
            if (b0oVar != null) {
                a aVar = (a) d0Var;
                aVar.a(b0oVar, m9fVarE, i);
                aVar.f35799a.setTag(b0oVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == -2) {
            return new c(this.f.inflate(ivi.T0, viewGroup, false));
        }
        return i == -1 ? new b(this.f.inflate(ivi.n1, viewGroup, false)) : new a(this.f.inflate(ivi.g1, viewGroup, false));
    }

    public void setBottomCount(int i) {
        this.f35798b = i;
        notifyDataSetChanged();
    }

    public void setOnLoadMoreListener(b9h b9hVar) {
        this.h = b9hVar;
    }
}
