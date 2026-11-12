package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.model.SportSkiingInfoModel;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class d1o extends RecyclerView.Adapter<RecyclerView.d0> {
    public List<SportSkiingInfoModel> c;
    public Context d;
    public int e;
    public LayoutInflater f;
    public Boolean g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14969a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14970b = 0;
    public Boolean h = Boolean.FALSE;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f14971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f14972b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public TextView g;

        public a(View view) {
            super(view);
            this.f14971a = (TextView) view.findViewById(bsi.T8);
            this.f14972b = (TextView) view.findViewById(bsi.B8);
            this.c = (TextView) view.findViewById(bsi.z8);
            this.d = (TextView) view.findViewById(bsi.V8);
            this.e = (TextView) view.findViewById(bsi.N8);
            this.f = (TextView) view.findViewById(bsi.u8);
            this.g = (TextView) view.findViewById(bsi.I8);
        }

        public void a(Context context, SportSkiingInfoModel sportSkiingInfoModel) {
            this.f14971a.setText(Integer.toString(sportSkiingInfoModel.f11867a));
            this.f14972b.setText(TimeDateUtil.getTimeStrWithSecDef(sportSkiingInfoModel.f11868b));
            this.c.setText(Float.toString(xr5.e(2, (sportSkiingInfoModel.c * 1.0f) / 1000.0f)));
            this.d.setText(Float.toString(sportSkiingInfoModel.d));
            if (d1o.this.g.booleanValue()) {
                this.e.setVisibility(0);
                this.e.setText(Float.toString(sportSkiingInfoModel.e));
            }
            if (d1o.this.h.booleanValue()) {
                this.f.setVisibility(0);
                this.f.setText(Float.toString(sportSkiingInfoModel.g));
                this.g.setVisibility(0);
                this.g.setText(Float.toString(sportSkiingInfoModel.f));
            }
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinearLayout f14973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f14974b;
        public TextView c;

        public b(View view) {
            super(view);
            this.f14973a = (LinearLayout) view.findViewById(bsi.o9);
            this.f14974b = (TextView) view.findViewById(bsi.w9);
            this.c = (TextView) view.findViewById(bsi.x9);
        }

        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                this.f14973a.setVisibility(0);
            }
            if (d1o.this.h.booleanValue()) {
                this.f14974b.setVisibility(0);
                this.c.setVisibility(0);
            }
        }
    }

    public d1o(Context context, List<SportSkiingInfoModel> list, int i, Boolean bool) {
        this.d = context;
        this.c = list;
        this.e = i;
        this.g = bool;
        this.f = LayoutInflater.from(context);
    }

    public int getContentItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f14969a + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.f14969a;
        if (i2 == 0 || i >= i2) {
            return (this.f14970b == 0 || i < i2 + getContentItemCount()) ? 1 : 102;
        }
        return 101;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof b) {
            ((b) d0Var).a(this.g);
            return;
        }
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            SportSkiingInfoModel sportSkiingInfoModel = this.c.get(i - this.f14969a);
            if (sportSkiingInfoModel != null) {
                aVar.a(this.d, sportSkiingInfoModel);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 101 ? new b(this.f.inflate(ivi.K0, viewGroup, false)) : new a(this.f.inflate(ivi.J0, viewGroup, false));
    }
}
