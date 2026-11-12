package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditEntity;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class dir extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<WidgetGroupEditEntity> f15576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p8h f15577b;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f15578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f15579b;
        public WidgetGroupEditEntity c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            super(view);
            this.f15578a = view.getContext();
            this.f15579b = (TextView) view.findViewById(zqi.ta);
            this.d = (ImageView) view.findViewById(zqi.J3);
            this.e = (ImageView) view.findViewById(zqi.O3);
            nuf.f(view);
        }

        public void b(WidgetGroupEditEntity widgetGroupEditEntity, final int i) {
            this.c = widgetGroupEditEntity;
            this.f15579b.setText(widgetGroupEditEntity.getName());
            if (widgetGroupEditEntity.isSportFunction()) {
                this.e.setImageResource(jni.b0);
                if (widgetGroupEditEntity.getSportType() > 0) {
                    this.f15579b.setText(widgetGroupEditEntity.getSportName());
                } else {
                    this.f15579b.setText(this.f15578a.getResources().getStringArray(lhi.j)[17]);
                }
            } else if (widgetGroupEditEntity.getIsAdded()) {
                this.e.setImageResource(jni.N);
            } else {
                this.e.setImageResource(jni.M);
            }
            if (widgetGroupEditEntity.getStyle() == 2) {
                d(120);
            } else if (widgetGroupEditEntity.getStyle() == 1 || widgetGroupEditEntity.getStyle() == 4) {
                d(59);
            }
            ikr.f(this.d, widgetGroupEditEntity.getSubType(), widgetGroupEditEntity.getName());
            this.e.setOnClickListener(new View.OnClickListener() { // from class: cir
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5387a.c(i, view);
                }
            });
        }

        public final /* synthetic */ void c(int i, View view) {
            if (!ikr.c()) {
                ToastUtil.showShortToast(wzi.q);
            } else if (dir.this.f15577b != null) {
                dir.this.f15577b.onItemClick(this.itemView, Integer.valueOf(i));
            }
        }

        public final void d(int i) {
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            layoutParams.width = ExtUtilsKt.getDp(Integer.valueOf(i));
            this.d.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<WidgetGroupEditEntity> list = this.f15576a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<WidgetGroupEditEntity> getList() {
        return this.f15576a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        aVar.b(this.f15576a.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(eui.i1, viewGroup, false));
    }

    public void l(List<WidgetGroupEditEntity> list) {
        this.f15576a = list;
    }

    public void m(p8h p8hVar) {
        this.f15577b = p8hVar;
    }
}
