package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.model.SportDivingInfoModel;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class eln extends RecyclerView.Adapter<RecyclerView.d0> {
    public List<SportDivingInfoModel> c;
    public Context d;
    public int e;
    public LayoutInflater f;
    public Boolean g;
    public b9h i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16778a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16779b = 0;
    public Boolean h = Boolean.FALSE;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f16780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f16781b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public TextView g;
        public TextView h;
        public TextView i;

        public a(View view) {
            super(view);
            this.f16780a = (TextView) view.findViewById(bsi.T8);
            this.f16781b = (TextView) view.findViewById(bsi.B8);
            this.c = (TextView) view.findViewById(bsi.z8);
            this.d = (TextView) view.findViewById(bsi.V8);
            this.e = (TextView) view.findViewById(bsi.N8);
            this.f = (TextView) view.findViewById(bsi.s8);
            this.g = (TextView) view.findViewById(bsi.O8);
            this.h = (TextView) view.findViewById(bsi.w8);
            this.i = (TextView) view.findViewById(bsi.t8);
        }

        public void a(Context context, SportDivingInfoModel sportDivingInfoModel) {
            int i = sportDivingInfoModel.f11865a;
            if (i == -1) {
                this.f16780a.setText(context.getString(j1j.g4));
            } else {
                this.f16780a.setText(Integer.toString(i));
            }
            this.f16781b.setText(TimeDateUtil.getTimeStrWithSecDef(sportDivingInfoModel.f11866b));
            if (sportDivingInfoModel.e > 0.0f) {
                this.c.setText(String.format("%s%s", Float.toString(xr5.e(2, sportDivingInfoModel.e)), context.getResources().getQuantityString(byi.f4728k, (int) sportDivingInfoModel.d)));
            } else {
                this.c.setText("--");
            }
            float f = sportDivingInfoModel.c;
            if (f > 0.0f) {
                this.d.setText(String.format("%s%s", Float.toString(xr5.e(2, f)), context.getString(j1j.n4)));
            } else {
                this.d.setText("--");
            }
            if (eln.this.h.booleanValue()) {
                this.f.setVisibility(0);
                this.g.setVisibility(0);
                this.h.setVisibility(0);
                this.i.setVisibility(0);
                if (sportDivingInfoModel.d > 0.0f) {
                    this.f.setText(String.format("%s%s", Float.toString(xr5.e(2, sportDivingInfoModel.d)), context.getResources().getQuantityString(byi.f4728k, (int) sportDivingInfoModel.d)));
                } else {
                    this.f.setText("--");
                }
                float f2 = sportDivingInfoModel.f;
                if (f2 > -10000.0f) {
                    this.g.setText(String.format("%s%s", Float.toString(xr5.e(2, f2)), context.getString(j1j.n4)));
                } else {
                    this.g.setText("--");
                }
                float f3 = sportDivingInfoModel.g;
                if (f3 > 0.0f) {
                    float f4 = f3 / 60.0f;
                    this.h.setText(xr5.e(1, f4) + context.getResources().getQuantityString(byi.n, (int) f4, Float.valueOf(f4)));
                } else {
                    this.h.setText("--");
                }
                float f5 = sportDivingInfoModel.h;
                if (f5 <= 0.0f) {
                    this.i.setText("--");
                    return;
                }
                float f6 = f5 / 60.0f;
                this.i.setText(xr5.e(1, f6) + context.getResources().getQuantityString(byi.n, (int) f6, Float.valueOf(f6)));
            }
        }

        public void b(Boolean bool) {
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f16782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Boolean f16783b;

        public b(View view) {
            super(view);
            this.f16783b = Boolean.FALSE;
            this.f16782a = (TextView) view.findViewById(bsi.i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view) {
            if (eln.this.i != null) {
                if (this.f16783b.booleanValue()) {
                    eln.this.i.onShowPassage();
                    this.f16783b = Boolean.FALSE;
                    this.f16782a.setText(j1j.a7);
                } else {
                    eln.this.i.onLoadMore();
                    this.f16783b = Boolean.TRUE;
                    this.f16782a.setText(j1j.b7);
                }
            }
        }

        public void bindData() {
            this.f16782a.setOnClickListener(new View.OnClickListener() { // from class: fln
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17902a.b(view);
                }
            });
        }
    }

    public class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f16784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f16785b;
        public TextView c;
        public TextView d;

        public c(View view) {
            super(view);
            this.f16784a = (TextView) view.findViewById(bsi.v9);
            this.f16785b = (TextView) view.findViewById(bsi.w9);
            this.c = (TextView) view.findViewById(bsi.x9);
            this.d = (TextView) view.findViewById(bsi.y9);
        }

        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                this.f16784a.setVisibility(0);
                this.f16785b.setVisibility(0);
                this.c.setVisibility(0);
                this.d.setVisibility(0);
            }
        }
    }

    public eln(Context context, List<SportDivingInfoModel> list, int i, Boolean bool) {
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
        return this.f16778a + getContentItemCount() + this.f16779b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.f16778a;
        if (i2 == 0 || i >= i2) {
            return (this.f16779b == 0 || i < i2 + getContentItemCount()) ? 1 : 102;
        }
        return 101;
    }

    public void notifyDataChanged() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof c) {
            ((c) d0Var).a(this.h);
            return;
        }
        if (d0Var instanceof b) {
            ((b) d0Var).bindData();
            return;
        }
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            SportDivingInfoModel sportDivingInfoModel = this.c.get(i - this.f16778a);
            if (sportDivingInfoModel != null) {
                aVar.a(this.d, sportDivingInfoModel);
                aVar.b(this.h);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 101) {
            return new c(this.f.inflate(ivi.E0, viewGroup, false));
        }
        return i == 102 ? new b(this.f.inflate(ivi.n1, viewGroup, false)) : new a(this.f.inflate(ivi.J0, viewGroup, false));
    }

    public void setFooterViewCount(int i) {
        this.f16779b = i;
    }

    public eln(Context context, List<SportDivingInfoModel> list, int i, Boolean bool, b9h b9hVar) {
        this.d = context;
        this.c = list;
        this.e = i;
        this.g = bool;
        this.i = b9hVar;
        this.f = LayoutInflater.from(context);
    }
}
