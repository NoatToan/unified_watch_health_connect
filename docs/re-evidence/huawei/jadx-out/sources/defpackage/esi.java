package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.ecologydevice.ui.measure.adapter.SecondRopeItemAdapter;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class esi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SecondRopeItemAdapter f33408b;
    private HealthRecycleView d;

    public esi(HealthRecycleView healthRecycleView) {
        this.d = healthRecycleView;
        this.f33407a = healthRecycleView.getContext();
        b();
    }

    private void b() {
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f33407a, 2);
        gridLayoutManager.setOrientation(1);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: esi.5
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                if (esi.this.f33408b.get(i).g()) {
                    return gridLayoutManager.getSpanCount();
                }
                return 1;
            }
        });
        this.d.setLayoutManager(gridLayoutManager);
        this.d.setIsScroll(false);
        SecondRopeItemAdapter secondRopeItemAdapter = new SecondRopeItemAdapter();
        this.f33408b = secondRopeItemAdapter;
        this.d.setAdapter(secondRopeItemAdapter);
        this.d.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: esi.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f33410c;
            private boolean d;

            {
                this.f33410c = jhl.c(esi.this.f33407a, 6.0f);
                this.d = LanguageUtil.ba(esi.this.f33407a);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view, recyclerView, state);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (esi.this.f33408b.get(childAdapterPosition).g()) {
                    return;
                }
                int spanIndex = gridLayoutManager.getSpanSizeLookup().getSpanIndex(childAdapterPosition, 2) % 2;
                if ((spanIndex == 0 && !this.d) || (spanIndex == 1 && this.d)) {
                    rect.right = this.f33410c;
                } else {
                    rect.left = this.f33410c;
                }
            }
        });
    }

    public void d(BaseRecyclerAdapter.OnItemClickListener<eps> onItemClickListener) {
        this.f33408b.setOnItemClickListener(onItemClickListener);
    }

    public void d(List<eps> list) {
        this.f33408b.e(list);
    }
}
