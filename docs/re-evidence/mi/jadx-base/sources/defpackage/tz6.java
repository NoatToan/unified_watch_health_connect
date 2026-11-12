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
import com.xiaomi.fitness.widget.view.DurationTextView;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class tz6 extends c72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<uz6> f35203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35204b;
    public Context c;
    public LayoutInflater d;
    public boolean e = true;
    public boolean f;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f35205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f35206b;
        public TextView c;
        public TextView d;
        public DurationTextView e;
        public ImageView f;

        public a(View view) {
            super(view);
            this.f35205a = view.findViewById(bsi.J);
            this.f35206b = (TextView) view.findViewById(bsi.J9);
            this.c = (TextView) view.findViewById(bsi.L9);
            this.d = (TextView) view.findViewById(bsi.K9);
            this.e = (DurationTextView) view.findViewById(bsi.M1);
            this.f = (ImageView) view.findViewById(bsi.g3);
        }

        public void a(Context context, uz6 uz6Var) {
            this.f35205a.setBackground(new kxk(uz6Var.a(), DisplayUtil.dip2px(10.0f), DisplayUtil.dip2px(3.0f)));
            this.f35206b.setText(uz6Var.d(context));
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
        public ImageView f35207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f35208b;
        public DistributeView c;
        public View d;

        public b(View view) {
            super(view);
            this.f35207a = (ImageView) view.findViewById(bsi.G2);
            this.f35208b = (TextView) view.findViewById(bsi.p9);
            this.c = (DistributeView) view.findViewById(bsi.x1);
            this.d = view.findViewById(bsi.y1);
        }

        public void a(int i, String str, List<uz6> list, boolean z) {
            if (i != -1) {
                this.f35207a.setImageResource(i);
            } else {
                this.f35207a.setVisibility(8);
            }
            this.f35208b.setText(str);
            this.c.setDataList(list);
            if (z) {
                this.d.setVisibility(8);
            } else {
                this.d.setVisibility(0);
            }
        }
    }

    public interface c {
    }

    public tz6(Context context, List<uz6> list, int i) {
        this.c = context;
        this.f35203a = list;
        this.f35204b = i;
        this.d = LayoutInflater.from(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(uz6 uz6Var, int i, View view) {
    }

    @Override // defpackage.c72
    public int getContentItemCount() {
        return this.f35203a.size();
    }

    @Override // defpackage.c72
    public List<uz6> getDataList() {
        return this.f35203a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mHeaderCount + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        if (d0Var instanceof b) {
            ((b) d0Var).a(hoi.n, this.c.getString(j1j.E7), this.f35203a, this.f);
            return;
        }
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            final uz6 uz6Var = this.f35203a.get(i - this.mHeaderCount);
            if (uz6Var != null) {
                aVar.a(this.c, uz6Var);
            }
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: qz6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32010a.j(uz6Var, i, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 101 ? new b(this.d.inflate(ivi.C0, viewGroup, false)) : new a(this.d.inflate(ivi.D0, viewGroup, false));
    }

    public void setDistributeItemClickListener(c cVar) {
    }
}
