package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.view.SportPaceSegmentView;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class pin extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30437a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30438b = 0;
    public Context c;
    public List<b0o> d;
    public LayoutInflater e;
    public List<b0o> f;
    public int g;
    public b9h h;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f30439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f30440b;

        public a(View view) {
            super(view);
            this.f30440b = view.getContext();
            this.f30439a = (TextView) view.findViewById(bsi.H9);
        }

        public void a(b0o b0oVar) {
            String timeStrWithSecDef = TimeDateUtil.getTimeStrWithSecDef((int) b0oVar.l);
            int i = (int) b0oVar.m;
            this.f30439a.setText(String.format(this.f30440b.getString(j1j.Q9), this.f30440b.getResources().getQuantityString(byi.common_unit_kilometer_desc_new, i, Integer.toString(i)), timeStrWithSecDef));
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f30441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f30442b;
        public SportPaceSegmentView c;

        public b(View view) {
            super(view);
            this.f30441a = view;
            this.f30442b = (TextView) view.findViewById(bsi.r7);
            this.c = (SportPaceSegmentView) view.findViewById(bsi.R4);
        }

        public void a(b0o b0oVar, m9f m9fVar, int i, int i2) {
            if (i2 != 1 && i2 != 2) {
                this.f30442b.setAlpha(0.4f);
                this.f30442b.setText(b0oVar.n);
            } else if (pin.this.m(i)) {
                this.f30442b.setText(Integer.toString(b0oVar.c));
            } else if (!pin.this.o(i)) {
                return;
            } else {
                this.f30442b.setText(AppUtil.getApp().getString(j1j.S7, Integer.valueOf(b0oVar.c)));
            }
            this.c.e(b0oVar, m9fVar, true, i2);
            if (b0oVar.h > 0) {
                this.f30441a.setContentDescription(((Object) this.f30442b.getText()) + TimeDateUtil.getDurationHrMinSecInMills2(AppUtil.getApp(), ((long) b0oVar.h) * 1000));
            }
        }
    }

    public class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f30443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Boolean f30444b;

        public c(View view) {
            super(view);
            this.f30444b = Boolean.FALSE;
            this.f30443a = (TextView) view.findViewById(bsi.i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view) {
            if (pin.this.h != null) {
                if (this.f30444b.booleanValue()) {
                    pin.this.h.onShowPassage();
                    this.f30444b = Boolean.FALSE;
                    this.f30443a.setText(j1j.a7);
                } else {
                    pin.this.h.onLoadMore();
                    this.f30444b = Boolean.TRUE;
                    this.f30443a.setText(j1j.b7);
                }
            }
        }

        public void bindData() {
            this.f30443a.setOnClickListener(new View.OnClickListener() { // from class: qin
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f31553a.b(view);
                }
            });
        }
    }

    public class d extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f30445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f30446b;

        public d(View view) {
            super(view);
            this.f30445a = (TextView) view.findViewById(bsi.K9);
            this.f30446b = (TextView) view.findViewById(bsi.B9);
        }

        public void bindData(boolean z) {
            this.f30445a.setText(pin.this.c.getResources().getQuantityString(byi.Z, 1));
            if (z) {
                this.f30446b.setText(j1j.u7);
            } else {
                this.f30446b.setText(j1j.K3);
            }
        }
    }

    public pin(Context context, List<b0o> list, b9h b9hVar, int i) {
        this.c = context;
        this.d = list;
        this.h = b9hVar;
        this.g = i;
        this.e = LayoutInflater.from(context);
    }

    public int getContentItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f30437a + getContentItemCount() + this.f30438b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return super.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int contentItemCount = getContentItemCount();
        int i2 = this.f30437a;
        if (i2 != 0 && i < i2) {
            return -2;
        }
        if (this.f30438b != 0 && i >= contentItemCount + i2) {
            return -1;
        }
        b0o b0oVar = this.d.get(i - i2);
        if (b0oVar != null) {
            return b0oVar.f;
        }
        return 0;
    }

    public boolean isBottomView(int i) {
        return this.f30438b != 0 && i >= this.f30437a + getContentItemCount();
    }

    public boolean isHeaderView(int i) {
        int i2 = this.f30437a;
        return i2 != 0 && i < i2;
    }

    public void j(boolean z) {
        if (z) {
            this.f30437a = 1;
        } else {
            this.f30437a = 0;
        }
    }

    public m9f k() {
        int i = this.g;
        if (i == 2) {
            return tb2.c(this.f);
        }
        return i == 1 ? tb2.b(this.f) : new m9f(100.0f, 0.0f);
    }

    public b0o l(int i) {
        if (i == -1 || isBottomView(i) || isHeaderView(i)) {
            return null;
        }
        return this.d.get(i - this.f30437a);
    }

    public boolean m(int i) {
        b0o b0oVar = this.d.get(i - this.f30437a);
        return b0oVar != null && b0oVar.f == 0 && b0oVar.m * 1000.0f >= 995.0f;
    }

    public void n(List<b0o> list) {
        this.f = list;
    }

    public boolean o(int i) {
        b0o b0oVar = this.d.get(i - this.f30437a);
        return b0oVar != null && b0oVar.f == 0 && b0oVar.m * 1000.0f >= 100.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof d) {
            ((d) d0Var).bindData(this.g == 2);
            return;
        }
        if (d0Var instanceof c) {
            ((c) d0Var).bindData();
            return;
        }
        if (d0Var instanceof a) {
            b0o b0oVar = this.d.get(i - this.f30437a);
            if (b0oVar != null) {
                ((a) d0Var).a(b0oVar);
                return;
            }
            return;
        }
        if (d0Var instanceof b) {
            m9f m9fVarK = k();
            b0o b0oVar2 = this.d.get(i - this.f30437a);
            if (b0oVar2 != null) {
                b bVar = (b) d0Var;
                bVar.a(b0oVar2, m9fVarK, i, this.g);
                bVar.f30441a.setTag(b0oVar2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == -2) {
            return new d(this.e.inflate(ivi.T0, viewGroup, false));
        }
        if (i == -1) {
            return new c(this.e.inflate(ivi.n1, viewGroup, false));
        }
        return i == 1 ? new a(this.e.inflate(ivi.m1, viewGroup, false)) : new b(this.e.inflate(ivi.g1, viewGroup, false));
    }

    public void setBottomCount(int i) {
        this.f30438b = i;
        notifyDataSetChanged();
    }

    public void setOnLoadMoreListener(b9h b9hVar) {
        this.h = b9hVar;
    }
}
