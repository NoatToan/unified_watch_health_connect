package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.DistributeView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.data.model.HealthDistributeUtil;
import com.xiaomi.fitness.widget.view.DurationTextView;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class cx2 extends c72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<uz6> f14817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14818b;
    public Context c;
    public LayoutInflater d;
    public boolean f;
    public c h;
    public boolean e = true;
    public String g = "";

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f14819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f14820b;
        public TextView c;
        public TextView d;
        public DurationTextView e;
        public ImageView f;

        public a(View view) {
            super(view);
            this.f14819a = view.findViewById(eri.S1);
            this.f14820b = (TextView) view.findViewById(eri.f442do);
            this.c = (TextView) view.findViewById(eri.ho);
            this.d = (TextView) view.findViewById(eri.fo);
            this.e = (DurationTextView) view.findViewById(eri.p4);
            this.f = (ImageView) view.findViewById(eri.Z8);
        }

        public void a(Context context, uz6 uz6Var) {
            this.f14819a.setBackground(new kxk(uz6Var.a(), DisplayUtil.dip2px(10.0f), DisplayUtil.dip2px(3.0f)));
            this.f14820b.setText(uz6Var.d(context));
            if (uz6Var.j) {
                this.e.setVisibility(0);
                this.e.setDuration(uz6Var.f36300k);
                this.c.setText("");
                this.d.setText("");
            } else {
                this.e.setVisibility(8);
                this.c.setText(uz6Var.h);
                this.d.setText(uz6Var.i);
            }
            if (uz6Var.m) {
                this.f.setVisibility(0);
            } else {
                this.f.setVisibility(8);
            }
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f14821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f14822b;
        public DistributeView c;
        public View d;
        public TextView e;
        public ImageView f;

        public b(View view) {
            super(view);
            this.f14821a = (ImageView) view.findViewById(eri.C7);
            this.f14822b = (TextView) view.findViewById(eri.Kn);
            this.c = (DistributeView) view.findViewById(eri.T3);
            this.d = view.findViewById(eri.X3);
            this.f = (ImageView) view.findViewById(eri.D7);
            this.e = (TextView) view.findViewById(eri.lj);
        }

        public void a(int i, String str, List<uz6> list, boolean z, int i2, String str2) {
            if (i != -1) {
                this.f14821a.setImageResource(i);
            } else {
                this.f14821a.setVisibility(8);
            }
            this.f14822b.setText(str);
            this.c.setDataList(list);
            if (z) {
                this.d.setVisibility(8);
            } else {
                this.d.setVisibility(0);
            }
            if (i2 == 10 || i2 == 11) {
                this.f.setVisibility(0);
                if (Objects.equals(str2, "")) {
                    return;
                }
                this.e.setVisibility(0);
                this.e.setText(str2);
            }
        }
    }

    public interface c {
        void onClick(int i);
    }

    public interface d {
    }

    public cx2(Context context, List<uz6> list, int i) {
        this.c = context;
        this.f14817a = list;
        this.f14818b = i;
        this.d = LayoutInflater.from(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(int i, View view) {
        c cVar = this.h;
        if (cVar != null) {
            cVar.onClick(i);
        }
    }

    @Override // defpackage.c72
    public int getContentItemCount() {
        return this.f14817a.size();
    }

    @Override // defpackage.c72
    public List<uz6> getDataList() {
        return this.f14817a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mHeaderCount + getContentItemCount();
    }

    public final /* synthetic */ void l(uz6 uz6Var, int i, View view) {
    }

    public void m(String str) {
        this.g = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        if (d0Var instanceof b) {
            b bVar = (b) d0Var;
            bVar.a(HealthDistributeUtil.getImageTypeResourceId(this.f14818b), HealthDistributeUtil.getTypeName(this.c, this.f14818b), this.f14817a, this.f, this.f14818b, this.g);
            bVar.f.setOnClickListener(new View.OnClickListener() { // from class: ax2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3530a.k(i, view);
                }
            });
            return;
        }
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            final uz6 uz6Var = this.f14817a.get(i - this.mHeaderCount);
            if (uz6Var != null) {
                aVar.a(this.c, uz6Var);
            }
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: bx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4687a.l(uz6Var, i, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 101 ? new b(this.d.inflate(jui.M2, viewGroup, false)) : new a(this.d.inflate(jui.D6, viewGroup, false));
    }

    public void setDistributeGuidIconClickListener(c cVar) {
        this.h = cVar;
    }

    public void setDistributeItemClickListener(d dVar) {
    }
}
