package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ToastUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class vjr extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<wjr> f36960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p8h f36961b;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f36962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f36963b;
        public final TextView c;
        public wjr d;

        public a(final View view) {
            super(view);
            this.f36962a = (ImageView) view.findViewById(zqi.L3);
            ImageView imageView = (ImageView) view.findViewById(zqi.O3);
            this.f36963b = imageView;
            this.c = (TextView) view.findViewById(zqi.ta);
            nuf.f(view);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ujr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f35852a.c(view, view2);
                }
            });
        }

        public void b(wjr wjrVar) {
            this.d = wjrVar;
            this.f36963b.setImageResource(wjrVar.c ? jni.N : jni.M);
            this.c.setText(wjrVar.f38042b);
        }

        public final /* synthetic */ void c(View view, View view2) {
            if (!ikr.c()) {
                ToastUtil.showShortToast(wzi.q);
            } else if (vjr.this.f36961b != null) {
                vjr.this.f36961b.onItemClick(view, this.d);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<wjr> list = this.f36960a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        aVar.b(this.f36960a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(eui.k1, viewGroup, false));
    }

    public void l(p8h p8hVar) {
        this.f36961b = p8hVar;
    }

    public void setList(List<wjr> list) {
        this.f36960a = list;
    }
}
