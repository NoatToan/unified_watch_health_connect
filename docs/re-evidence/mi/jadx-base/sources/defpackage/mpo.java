package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DurationTextView;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class mpo extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<ppo> f27072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f27073b;
    public LayoutInflater c;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public String i;
    public boolean j;

    public static class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f27074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f27075b;
        public ImageView c;

        public a(View view) {
            super(view);
            this.f27074a = (ImageView) view.findViewById(bri.b1);
            this.f27075b = (TextView) view.findViewById(bri.a6);
            this.c = (ImageView) view.findViewById(bri.T0);
        }

        public void a(int i, String str, int i2) {
            if (i != -1) {
                this.f27074a.setImageResource(i);
            } else {
                this.f27074a.setVisibility(8);
            }
            this.f27075b.setText(str);
            this.c.setVisibility(i2);
        }
    }

    public static class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f27076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f27077b;
        public TextView c;
        public DurationTextView d;
        public TextView e;
        public ImageView f;

        public b(View view) {
            super(view);
            this.f27076a = (TextView) view.findViewById(bri.b6);
            this.f27077b = (TextView) view.findViewById(bri.e6);
            this.c = (TextView) view.findViewById(bri.d6);
            this.d = (DurationTextView) view.findViewById(bri.U);
            this.e = (TextView) view.findViewById(bri.Z3);
            this.f = (ImageView) view.findViewById(bri.n1);
        }

        public void a(ppo ppoVar) {
            if (ppoVar.e) {
                this.d.setVisibility(0);
                this.d.setDuration(ppoVar.f);
                this.f27077b.setText("");
            } else {
                this.d.setVisibility(8);
                this.f27077b.setText(ppoVar.f30623b);
            }
            if (TextUtils.isEmpty(ppoVar.d)) {
                this.e.setVisibility(8);
            } else {
                this.e.setVisibility(0);
                this.e.setText(ppoVar.d);
            }
            this.f27076a.setText(ppoVar.f30622a);
            this.c.setText(ppoVar.c);
            if (ppoVar.g) {
                this.f.setVisibility(0);
            } else {
                this.f.setVisibility(8);
            }
        }
    }

    public static class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f27078a;

        public c(View view) {
            super(view);
            this.f27078a = (TextView) view.findViewById(bri.D4);
        }

        public void bindData(String str) {
            this.f27078a.setText(str);
        }
    }

    public interface d {
    }

    public mpo(Context context, List<ppo> list) {
        this.e = 0;
        this.g = -1;
        this.h = 8;
        this.j = false;
        this.f27072a = list;
        this.f27073b = context;
        this.d = 0;
        this.c = LayoutInflater.from(context);
    }

    public int getContentItemCount() {
        return this.f27072a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d + getContentItemCount() + this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.d;
        if (i2 == 0 || i >= i2) {
            return (this.e == 0 || i != getItemCount() - 1) ? 1 : 2;
        }
        return 101;
    }

    public boolean isHeaderView(int i) {
        int i2 = this.d;
        return i2 != 0 && i < i2;
    }

    public final /* synthetic */ void l(View view) {
    }

    public final /* synthetic */ void m(ppo ppoVar, int i, View view) {
    }

    public final /* synthetic */ void n(View view) {
    }

    public void notifyDataChanged() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            aVar.a(this.g, this.f, this.h);
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: ipo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21980a.l(view);
                }
            });
        } else {
            if (d0Var instanceof b) {
                b bVar = (b) d0Var;
                final ppo ppoVar = this.f27072a.get(i - this.d);
                if (ppoVar != null) {
                    bVar.a(ppoVar);
                }
                bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: kpo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f24145a.m(ppoVar, i, view);
                    }
                });
                return;
            }
            if (d0Var instanceof c) {
                c cVar = (c) d0Var;
                cVar.bindData(this.i);
                cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: lpo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f25305a.n(view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 101) {
            return new a(this.c.inflate(gui.k0, viewGroup, false));
        }
        return i == 2 ? new c(this.c.inflate(gui.j0, viewGroup, false)) : new b(this.c.inflate(gui.l0, viewGroup, false));
    }

    public void setOnItemClickListener(d dVar) {
    }

    public mpo(Context context, List<ppo> list, int i, int i2) {
        this(context, list, context.getString(i), i2);
    }

    public mpo(Context context, List<ppo> list, String str, int i) {
        this.d = 1;
        this.e = 0;
        this.h = 8;
        this.j = false;
        this.f27073b = context;
        this.f27072a = list;
        this.f = str;
        this.g = i;
        this.c = LayoutInflater.from(context);
    }
}
