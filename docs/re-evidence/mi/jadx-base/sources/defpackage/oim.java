package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class oim extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<SleepItemEntry> f29204b;
    public final RecyclerView c;

    public static class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f29205a;

        public a(View view) {
            super(view);
            this.f29205a = view;
        }
    }

    public oim(Context context, List<SleepItemEntry> list, RecyclerView recyclerView) {
        this.f29203a = context;
        this.f29204b = list;
        this.c = recyclerView;
    }

    private void setLinearLayout(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<SleepItemEntry> list = this.f29204b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        SleepItemEntry sleepItemEntry = this.f29204b.get(i);
        return sleepItemEntry != null ? sleepItemEntry.type : super.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        float width = (this.c.getWidth() - this.c.getPaddingRight()) - this.c.getPaddingLeft();
        SleepItemEntry sleepItemEntry = this.f29204b.get(0);
        List<SleepItemEntry> list = this.f29204b;
        long j = sleepItemEntry.f11764a.g - list.get(list.size() - 1).f11764a.f;
        SleepItemEntry sleepItemEntry2 = this.f29204b.get(i);
        setLinearLayout(aVar.f29205a, Math.max((int) ((sleepItemEntry2.f11764a.b() * width) / j), 1));
        aVar.f29205a.setTag(sleepItemEntry2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i, List<Object> list) {
        onBindViewHolder(aVar, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.f29203a).inflate(jui.i6, viewGroup, false));
    }

    public void setEntries(List<SleepItemEntry> list) {
        this.f29204b = list;
        notifyDataSetChanged();
    }
}
