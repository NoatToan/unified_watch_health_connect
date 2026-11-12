package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.DistributeView;
import com.xiaomi.fitness.data.model.HealthDistributeUtil;
import com.xiaomi.fitness.widget.view.DurationTextView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ako extends c72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<uz6> f1142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1143b;
    public Context c;
    public LayoutInflater d;
    public boolean f;
    public String g;
    public boolean e = true;
    public boolean h = false;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f1144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f1145b;
        public TextView c;
        public TextView d;
        public DurationTextView e;
        public ImageView f;

        public a(View view) {
            super(view);
            this.f1144a = (ImageView) view.findViewById(eri.Xc);
            this.f1145b = (TextView) view.findViewById(eri.f442do);
            this.c = (TextView) view.findViewById(eri.ho);
            this.d = (TextView) view.findViewById(eri.fo);
            this.e = (DurationTextView) view.findViewById(eri.p4);
            this.f = (ImageView) view.findViewById(eri.Z8);
        }

        public void a(Context context, uz6 uz6Var) {
            this.f1144a.setImageDrawable(of1.b(context, uz6Var.c()));
            this.f1145b.setText(uz6Var.d(context));
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
        public ImageView f1146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f1147b;
        public DistributeView c;
        public View d;

        public b(View view) {
            super(view);
            this.f1146a = (ImageView) view.findViewById(eri.C7);
            this.f1147b = (TextView) view.findViewById(eri.Kn);
            this.c = (DistributeView) view.findViewById(eri.T3);
            this.d = view.findViewById(eri.X3);
        }

        public void a(int i, String str, List<uz6> list, boolean z) {
            if (i != -1) {
                this.f1146a.setImageResource(i);
            } else {
                this.f1146a.setVisibility(8);
            }
            this.f1147b.setText(str);
            this.c.setShowEmptyDistribute(ako.this.h);
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

    public ako(Context context, List<uz6> list, int i) {
        this.c = context;
        this.f1142a = list;
        this.f1143b = i;
        this.d = LayoutInflater.from(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(uz6 uz6Var, int i, View view) {
    }

    @Override // defpackage.c72
    public int getContentItemCount() {
        return this.f1142a.size();
    }

    @Override // defpackage.c72
    public List<uz6> getDataList() {
        return this.f1142a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mHeaderCount + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        if (d0Var instanceof b) {
            b bVar = (b) d0Var;
            String typeName = HealthDistributeUtil.getTypeName(this.c, this.f1143b);
            int i2 = this.f1143b;
            if (i2 == 9) {
                typeName = this.g;
            }
            bVar.a(HealthDistributeUtil.getImageTypeResourceId(i2), typeName, this.f1142a, this.f);
            return;
        }
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            final uz6 uz6Var = this.f1142a.get(i - this.mHeaderCount);
            if (uz6Var != null) {
                aVar.a(this.c, uz6Var);
            }
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: zjo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f41384a.j(uz6Var, i, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 101 ? new b(this.d.inflate(jui.C6, viewGroup, false)) : new a(this.d.inflate(jui.E6, viewGroup, false));
    }

    public void setDistributeItemClickListener(c cVar) {
    }
}
