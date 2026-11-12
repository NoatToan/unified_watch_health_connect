package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class gdc extends PagingDataAdapter<HrItem, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f18851a;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f18852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f18853b;

        public a(View view) {
            super(view);
            this.f18852a = (TextView) view.findViewById(eri.im);
            this.f18853b = (TextView) view.findViewById(eri.qn);
        }

        public void b(final HrItem hrItem) {
            Objects.requireNonNull(hrItem);
            this.f18852a.setText(TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat(hrItem.getTime(), false));
            this.f18853b.setText(this.f18853b.getContext().getResources().getQuantityString(qxi.common_unit_heart_rate_desc, hrItem.getHr(), Integer.valueOf(hrItem.getHr())));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: fdc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17674a.c(hrItem, view);
                }
            });
        }

        public final /* synthetic */ void c(HrItem hrItem, View view) {
            if (gdc.this.f18851a != null) {
                gdc.this.f18851a.onClick(hrItem);
            }
        }
    }

    public interface b {
        void onClick(HrItem hrItem);
    }

    public gdc() {
        super(new uv6());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        aVar.b(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(jui.h6, viewGroup, false));
    }

    public void setOnItemClickListener(b bVar) {
        this.f18851a = bVar;
    }
}
