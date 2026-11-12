package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class gbc extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<BloodPressureItem> f18801a;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f18802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f18803b;
        public View c;
        public TextView d;
        public TextView e;
        public TextView f;
        public TextView g;

        public a(View view) {
            super(view);
            this.f18802a = (TextView) view.findViewById(eri.Um);
            this.f18803b = view.findViewById(eri.tj);
            this.c = view.findViewById(eri.Y0);
            this.d = (TextView) view.findViewById(eri.xl);
            this.e = (TextView) view.findViewById(eri.Fl);
            this.f = (TextView) view.findViewById(eri.wl);
            this.g = (TextView) view.findViewById(eri.El);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (ArrayUtils.isEmpty(this.f18801a)) {
            return 0;
        }
        return this.f18801a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        aVar.f18803b.setVisibility(0);
        aVar.c.setVisibility(0);
        if (i == 0) {
            aVar.f18803b.setVisibility(4);
        }
        if (i == getItemCount() - 1) {
            aVar.c.setVisibility(4);
        }
        BloodPressureItem bloodPressureItem = this.f18801a.get(i);
        aVar.e.setText(String.valueOf(bloodPressureItem.getLowPressure()));
        aVar.d.setText(String.valueOf(bloodPressureItem.getHighPressure()));
        aVar.f18802a.setText(TimeDateUtil.getDateStr(bloodPressureItem.getTime(), TimeUtils.FORMAT_H_M));
        int iB = pz2.b(bloodPressureItem.getHighPressure());
        boolean zE = pz2.e(iB);
        int iC = pz2.c(bloodPressureItem.getLowPressure());
        boolean zE2 = pz2.e(iC);
        Resources resources = aVar.itemView.getResources();
        if (zE) {
            aVar.f.setVisibility(0);
            aVar.f.setText(iB == 4 ? resources.getString(c0j.x2) : resources.getString(c0j.y2));
        } else {
            aVar.f.setVisibility(8);
        }
        if (!zE2) {
            aVar.g.setVisibility(8);
        } else {
            aVar.g.setVisibility(0);
            aVar.g.setText(iC == 4 ? resources.getString(c0j.x2) : resources.getString(c0j.y2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(jui.e6, viewGroup, false));
    }

    public void k(List<BloodPressureItem> list) {
        this.f18801a = list;
        notifyDataSetChanged();
    }
}
