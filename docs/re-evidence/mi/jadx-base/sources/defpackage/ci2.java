package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.DistributeView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ci2 extends c72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<uz6> f5357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f5358b;
    public LayoutInflater c;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f5359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f5360b;
        public TextView c;
        public TextView d;

        public a(View view) {
            super(view);
            this.f5359a = view.findViewById(bsi.I);
            this.f5360b = (TextView) view.findViewById(bsi.d9);
            this.c = (TextView) view.findViewById(bsi.L9);
            this.d = (TextView) view.findViewById(bsi.K9);
        }

        public void a(Context context, uz6 uz6Var) {
            this.f5359a.setBackground(new kxk(uz6Var.a(), DisplayUtil.dip2px(10.0f), DisplayUtil.dip2px(3.0f)));
            this.f5360b.setText(uz6Var.f());
            this.c.setText(uz6Var.h);
            this.d.setText(uz6Var.i);
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DistributeView f5361a;

        public b(View view) {
            super(view);
            this.f5361a = (DistributeView) view.findViewById(bsi.t);
        }

        public void bindData(List<uz6> list) {
            this.f5361a.setDataList(list);
        }
    }

    public ci2(Context context, List<uz6> list) {
        this.f5358b = context;
        this.f5357a = list;
        this.c = LayoutInflater.from(context);
    }

    @Override // defpackage.c72
    public int getContentItemCount() {
        return this.f5357a.size();
    }

    @Override // defpackage.c72
    public List<uz6> getDataList() {
        return this.f5357a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mHeaderCount + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof b) {
            ((b) d0Var).bindData(this.f5357a);
            return;
        }
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            uz6 uz6Var = this.f5357a.get(i - this.mHeaderCount);
            if (uz6Var != null) {
                aVar.a(this.f5358b, uz6Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 101 ? new b(this.c.inflate(ivi.w0, viewGroup, false)) : new a(this.c.inflate(ivi.x0, viewGroup, false));
    }
}
