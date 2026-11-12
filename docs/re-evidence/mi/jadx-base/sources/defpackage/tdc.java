package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.DistributeView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class tdc extends c72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<uz6> f34589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f34590b;
    public LayoutInflater c;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f34591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f34592b;
        public TextView c;

        public a(View view) {
            super(view);
            this.f34591a = view.findViewById(bsi.I);
            this.f34592b = (TextView) view.findViewById(bsi.d9);
            this.c = (TextView) view.findViewById(bsi.Y8);
        }

        public void a(Context context, uz6 uz6Var) {
            this.f34591a.setBackground(new kxk(uz6Var.a(), DisplayUtil.dip2px(10.0f), DisplayUtil.dip2px(3.0f)));
            this.f34592b.setText(uz6Var.d(context));
            this.c.setText(TimeDateUtil.getTimeStrWithSecDef(uz6Var.e));
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DistributeView f34593a;

        public b(View view) {
            super(view);
            this.f34593a = (DistributeView) view.findViewById(bsi.l2);
        }

        public void bindData(List<uz6> list) {
            this.f34593a.setDataList(list);
        }
    }

    public tdc(Context context, List<uz6> list) {
        this.f34590b = context;
        this.f34589a = list;
        this.c = LayoutInflater.from(context);
    }

    @Override // defpackage.c72
    public int getContentItemCount() {
        return this.f34589a.size();
    }

    @Override // defpackage.c72
    public List<uz6> getDataList() {
        return this.f34589a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mHeaderCount + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof b) {
            ((b) d0Var).bindData(this.f34589a);
            return;
        }
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            uz6 uz6Var = this.f34589a.get(i - this.mHeaderCount);
            if (uz6Var != null) {
                aVar.a(this.f34590b, uz6Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 101 ? new b(this.c.inflate(ivi.O0, viewGroup, false)) : new a(this.c.inflate(ivi.P0, viewGroup, false));
    }
}
