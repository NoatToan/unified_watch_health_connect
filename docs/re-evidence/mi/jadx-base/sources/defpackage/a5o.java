package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class a5o extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<v1q> f656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f657b;
    public LayoutInflater c;
    public int d = 1;
    public int e = 0;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f659b;
        public TextView c;

        public a(View view) {
            super(view);
            this.f658a = (TextView) view.findViewById(bsi.e9);
            this.f659b = (TextView) view.findViewById(bsi.z8);
            this.c = (TextView) view.findViewById(bsi.B8);
        }

        public void a(Context context, v1q v1qVar) {
            this.f658a.setText(v1qVar.f36387a);
            this.c.setText(TimeDateUtil.getTimeStrWithSecDef(v1qVar.f36388b));
            int i = v1qVar.c;
            this.f659b.setText(i == -1 ? "--" : pz6.b(context, i));
        }
    }

    public class b extends RecyclerView.d0 {
        public b(View view) {
            super(view);
        }
    }

    public a5o(Context context, List<v1q> list) {
        this.f657b = context;
        this.f656a = list;
        this.c = LayoutInflater.from(context);
    }

    public int getContentItemCount() {
        return this.f656a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.d;
        if (i2 == 0 || i >= i2) {
            return (this.e == 0 || i < i2 + getContentItemCount()) ? 1 : 102;
        }
        return 101;
    }

    public void notifyDataChanged() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            v1q v1qVar = this.f656a.get(i - this.d);
            if (v1qVar != null) {
                aVar.a(this.f657b, v1qVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 101 ? new b(this.c.inflate(ivi.M0, viewGroup, false)) : new a(this.c.inflate(ivi.L0, viewGroup, false));
    }
}
