package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class per extends PagingDataAdapter<WeightItem, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f30330a;

    public static class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f30331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f30332b;

        public a(View view) {
            super(view);
            this.f30331a = (TextView) view.findViewById(eri.im);
            this.f30332b = (TextView) view.findViewById(eri.qn);
        }
    }

    public interface b {
        void a(WeightItem weightItem);
    }

    public per() {
        super(new uv6());
    }

    public final /* synthetic */ void j(WeightItem weightItem, View view) {
        b bVar = this.f30330a;
        if (bVar != null) {
            bVar.a(weightItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        final WeightItem item = getItem(i);
        Objects.requireNonNull(item);
        long time = item.getTime();
        Context context = aVar.f30331a.getContext();
        aVar.f30331a.setText(TimeUtils.formatDate(context.getString(c0j.o), Long.valueOf(time * 1000)));
        aVar.f30332b.setText(context.getString(c0j.u4, String.format(Locale.getDefault(), "%1$.1f", Float.valueOf(item.getWeight()))));
        aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: oer
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29088a.j(item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(jui.a6, viewGroup, false));
    }

    public void setOnItemClickListener(b bVar) {
        this.f30330a = bVar;
    }
}
