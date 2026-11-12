package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;

/* JADX INFO: loaded from: classes7.dex */
public interface u8h<T extends RecyclerBarEntry> {
    void onItemClick(View view, int i);

    void onItemClick(View view, int i, Boolean bool);

    void onItemSelected(T t, int i);

    void onLongItemClick(View view, int i);

    void onScrollStateChanged(RecyclerView recyclerView, int i);

    void onScrolled(RecyclerView recyclerView, int i, int i2);
}
