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

/* JADX INFO: loaded from: classes6.dex */
public class sz6 extends c72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<uz6> f34116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34117b;
    public Context c;
    public LayoutInflater d;
    public boolean f;
    public String g;
    public c h;
    public boolean e = true;
    public boolean i = false;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f34118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f34119b;
        public TextView c;
        public TextView d;
        public DurationTextView e;
        public ImageView f;

        public a(View view) {
            super(view);
            this.f34118a = view.findViewById(eri.S1);
            this.f34119b = (TextView) view.findViewById(eri.f442do);
            this.c = (TextView) view.findViewById(eri.ho);
            this.d = (TextView) view.findViewById(eri.fo);
            this.e = (DurationTextView) view.findViewById(eri.p4);
            this.f = (ImageView) view.findViewById(eri.Z8);
        }

        public void a(Context context, uz6 uz6Var) {
            this.f34118a.setBackground(new kxk(uz6Var.a(), DisplayUtil.dip2px(10.0f), DisplayUtil.dip2px(3.0f)));
            this.f34119b.setText(uz6Var.d(context));
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
        public ImageView f34120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f34121b;
        public DistributeView c;
        public View d;

        public b(View view) {
            super(view);
            this.f34120a = (ImageView) view.findViewById(eri.C7);
            this.f34121b = (TextView) view.findViewById(eri.Kn);
            this.c = (DistributeView) view.findViewById(eri.T3);
            this.d = view.findViewById(eri.X3);
        }

        public void a(int i, String str, List<uz6> list, boolean z) {
            if (i != -1) {
                this.f34120a.setImageResource(i);
            } else {
                this.f34120a.setVisibility(8);
            }
            this.f34121b.setText(str);
            this.c.setShowEmptyDistribute(sz6.this.i);
            this.c.setDataList(list);
            if (z) {
                this.d.setVisibility(8);
            } else {
                this.d.setVisibility(0);
            }
        }
    }

    public interface c {
        void a(uz6 uz6Var, int i);
    }

    public sz6(Context context, List<uz6> list, int i) {
        this.c = context;
        this.f34116a = list;
        this.f34117b = i;
        this.d = LayoutInflater.from(context);
    }

    @Override // defpackage.c72
    public int getContentItemCount() {
        return this.f34116a.size();
    }

    @Override // defpackage.c72
    public List<uz6> getDataList() {
        return this.f34116a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mHeaderCount + getContentItemCount();
    }

    public final /* synthetic */ void j(uz6 uz6Var, int i, View view) {
        c cVar = this.h;
        if (cVar != null) {
            cVar.a(uz6Var, i);
        }
    }

    public void k(boolean z) {
        this.e = z;
    }

    public void l(boolean z) {
        this.f = z;
    }

    public void m(String str) {
        this.g = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        if (d0Var instanceof b) {
            b bVar = (b) d0Var;
            String typeName = HealthDistributeUtil.getTypeName(this.c, this.f34117b);
            int i2 = this.f34117b;
            if (i2 == 9) {
                typeName = this.g;
            }
            bVar.a(HealthDistributeUtil.getImageTypeResourceId(i2), typeName, this.f34116a, this.f);
            return;
        }
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            final uz6 uz6Var = this.f34116a.get(i - this.mHeaderCount);
            if (uz6Var != null) {
                aVar.a(this.c, uz6Var);
            }
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: rz6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f33083a.j(uz6Var, i, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 101 ? new b(this.d.inflate(jui.B6, viewGroup, false)) : new a(this.d.inflate(jui.D6, viewGroup, false));
    }

    public void setDistributeItemClickListener(c cVar) {
        this.h = cVar;
    }
}
