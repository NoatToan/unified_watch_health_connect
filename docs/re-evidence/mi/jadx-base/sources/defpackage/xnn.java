package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.detail.model.SportGolfInfoModel;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class xnn extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39285a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39286b = 0;
    public List<SportGolfInfoModel> c;
    public Context d;
    public int e;
    public LayoutInflater f;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f39287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f39288b;
        public TextView c;
        public TextView d;
        public TextView e;

        public a(View view) {
            super(view);
            this.f39287a = (TextView) view.findViewById(bsi.H8);
            this.f39288b = (TextView) view.findViewById(bsi.a9);
            this.c = (TextView) view.findViewById(bsi.b9);
            this.d = (TextView) view.findViewById(bsi.A8);
            this.e = (TextView) view.findViewById(bsi.Z8);
        }

        public void a(Context context, SportGolfInfoModel sportGolfInfoModel) {
            this.f39287a.setText(Integer.toString(sportGolfInfoModel.golfScore.intValue()));
            this.f39288b.setText(Float.toString(sportGolfInfoModel.swingSpeed.floatValue()));
            this.c.setText(Float.toString(sportGolfInfoModel.swingTime.floatValue()));
            this.d.setText(Float.toString(sportGolfInfoModel.downSwingTime.floatValue()));
            this.e.setText(Float.toString(sportGolfInfoModel.swingRhythm.floatValue()));
        }
    }

    public class b extends RecyclerView.d0 {
        public b(View view) {
            super(view);
        }
    }

    public xnn(Context context, List<SportGolfInfoModel> list, int i) {
        this.d = context;
        this.c = list;
        this.e = i;
        this.f = LayoutInflater.from(context);
    }

    public int getContentItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f39285a + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.f39285a;
        if (i2 == 0 || i >= i2) {
            return (this.f39286b == 0 || i < i2 + getContentItemCount()) ? 1 : 102;
        }
        return 101;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            SportGolfInfoModel sportGolfInfoModel = this.c.get(i - this.f39285a);
            if (sportGolfInfoModel != null) {
                aVar.a(this.d, sportGolfInfoModel);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 101 ? new b(this.f.inflate(ivi.G0, viewGroup, false)) : new a(this.f.inflate(ivi.F0, viewGroup, false));
    }
}
