package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SportRecordLandEntry;
import com.xiaomi.fitness.chart.view.BaseChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class iak<T extends RecyclerBarEntry> implements RecyclerView.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u8h f20946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20947b;
    public T c;
    public GestureDetector d;
    public SpeedRatioLayoutManager e;
    public RecyclerView.Adapter f;
    public int g;

    public class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseChartRecyclerView f20948a;

        public a(BaseChartRecyclerView baseChartRecyclerView) {
            this.f20948a = baseChartRecyclerView;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return super.onDown(motionEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            int childAdapterPosition;
            float x = motionEvent.getX();
            View viewFindChildViewUnder = this.f20948a.findChildViewUnder(x, motionEvent.getY());
            float width = this.f20948a.getWidth() - this.f20948a.getPaddingRight();
            iak iakVar = iak.this;
            iakVar.f20947b = true;
            if (iakVar.e != null) {
                iak.this.e.l(0.0d);
            }
            if (viewFindChildViewUnder == null || iak.this.f20946a == null) {
                return;
            }
            viewFindChildViewUnder.getWidth();
            if (x < this.f20948a.getPaddingLeft() || x > width || (childAdapterPosition = this.f20948a.getChildAdapterPosition(viewFindChildViewUnder)) == -1) {
                return;
            }
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) viewFindChildViewUnder.getTag();
            Logger.i("BarChart Render notify change + LongPress" + recyclerBarEntry, new Object[0]);
            float y = recyclerBarEntry.getY();
            boolean z = recyclerBarEntry instanceof SportRecordLandEntry;
            if (z) {
                SportRecordLandEntry sportRecordLandEntry = (SportRecordLandEntry) recyclerBarEntry;
                int iFindRangeIndex = sportRecordLandEntry.findRangeIndex(x);
                if (iFindRangeIndex != -1) {
                    y = sportRecordLandEntry.getItemValues(iFindRangeIndex);
                }
                sportRecordLandEntry.setSelectX(x);
            }
            if (y < 0.0f) {
                return;
            }
            if (recyclerBarEntry.equals(iak.this.c)) {
                iak.this.c = null;
                recyclerBarEntry.setSelected(0);
            } else {
                if (iak.this.c != null) {
                    iak.this.c.setSelected(0);
                    if (iak.this.c instanceof SportRecordLandEntry) {
                        ((SportRecordLandEntry) iak.this.c).setSelectX(-1.0f);
                    }
                }
                if (z) {
                    ((SportRecordLandEntry) recyclerBarEntry).setSelectX(x);
                }
                iak.this.c = recyclerBarEntry;
                recyclerBarEntry.setSelected(2);
            }
            if (iak.this.f != null) {
                iak.this.f.notifyItemChanged(childAdapterPosition, 0);
            }
            iak.this.f20946a.onLongItemClick(viewFindChildViewUnder, childAdapterPosition);
            iak.this.f20946a.onItemSelected(recyclerBarEntry, childAdapterPosition);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            int childAdapterPosition;
            float x = motionEvent.getX();
            View viewFindChildViewUnder = this.f20948a.findChildViewUnder(x, motionEvent.getY());
            float width = this.f20948a.getWidth() - this.f20948a.getPaddingRight();
            if (viewFindChildViewUnder != null && iak.this.f20946a != null) {
                viewFindChildViewUnder.getWidth();
                if (x >= this.f20948a.getPaddingLeft() && x <= width && (childAdapterPosition = this.f20948a.getChildAdapterPosition(viewFindChildViewUnder)) != -1) {
                    RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) viewFindChildViewUnder.getTag();
                    Logger.d("BarChart Render notify change + SingleTapUp" + recyclerBarEntry, new Object[0]);
                    float y = recyclerBarEntry.getY();
                    if (recyclerBarEntry instanceof SportRecordLandEntry) {
                        SportRecordLandEntry sportRecordLandEntry = (SportRecordLandEntry) recyclerBarEntry;
                        int iFindRangeIndex = sportRecordLandEntry.findRangeIndex(x);
                        if (iFindRangeIndex != -1 && iFindRangeIndex < sportRecordLandEntry.getDataItem().getListValue().size()) {
                            y = sportRecordLandEntry.getItemValues(iFindRangeIndex);
                            if (sportRecordLandEntry.getDataItem().getSportRecordKey() == SportRecordKey.Height) {
                                y = 0.0f;
                            }
                        }
                        sportRecordLandEntry.setSelectX(x);
                    }
                    if (y < 0.0f) {
                        if (iak.this.c != null) {
                            iak.this.c.setSelected(0);
                        }
                        iak.this.c = null;
                        Logger.i("BarChart Render notify change + SingleTapUp null " + recyclerBarEntry, new Object[0]);
                        iak.this.f20946a.onItemSelected(null, childAdapterPosition);
                        if (iak.this.f != null) {
                            iak.this.f.notifyItemChanged(childAdapterPosition, Boolean.FALSE);
                        }
                        return false;
                    }
                    if (recyclerBarEntry.equals(iak.this.c)) {
                        iak.this.c = null;
                        recyclerBarEntry.setSelected(0);
                    } else {
                        if (iak.this.c != null) {
                            iak.this.c.setSelected(0);
                            if (iak.this.c instanceof SportRecordLandEntry) {
                                ((SportRecordLandEntry) iak.this.c).setSelectX(-1.0f);
                            }
                        }
                        iak.this.c = recyclerBarEntry;
                        recyclerBarEntry.setSelected(1);
                    }
                    iak.this.f20946a.onItemSelected(recyclerBarEntry, childAdapterPosition);
                    iak.this.f20946a.onItemClick(viewFindChildViewUnder, childAdapterPosition);
                    if (iak.this.f != null) {
                        iak.this.f.notifyItemChanged(childAdapterPosition, Boolean.FALSE);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public class b implements BaseChartRecyclerView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseChartRecyclerView f20950a;

        public b(BaseChartRecyclerView baseChartRecyclerView) {
            this.f20950a = baseChartRecyclerView;
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void a(MotionEvent motionEvent) {
            iak iakVar = iak.this;
            iakVar.f20947b = false;
            if (iakVar.e != null) {
                iak.this.e.k();
            }
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void b(MotionEvent motionEvent) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void c(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            View viewFindChildViewUnder = this.f20950a.findChildViewUnder(x, motionEvent.getY());
            float width = this.f20950a.getWidth() - this.f20950a.getPaddingRight();
            if (viewFindChildViewUnder == null || !iak.this.f20947b) {
                if (iak.this.c == null || iak.this.c.getSelected() != 2) {
                    return;
                }
                iak iakVar = iak.this;
                if (iakVar.f20947b) {
                    iakVar.c.setSelected(0);
                    iak.this.c = null;
                    if (viewFindChildViewUnder == null) {
                        iak.this.f.notifyItemChanged(iak.this.g, 0);
                    }
                    Logger.i("BarChart Render notify change lastPosition" + iak.this.g + "child" + viewFindChildViewUnder + "isLongPressing" + iak.this.f20947b, new Object[0]);
                    iak.this.f20946a.onItemSelected(null, -1);
                    return;
                }
                return;
            }
            viewFindChildViewUnder.getWidth();
            if (x < this.f20950a.getPaddingLeft() || x > width) {
                return;
            }
            int childAdapterPosition = this.f20950a.getChildAdapterPosition(viewFindChildViewUnder);
            iak.this.g = childAdapterPosition;
            if (childAdapterPosition != -1) {
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) viewFindChildViewUnder.getTag();
                float y = recyclerBarEntry.getY();
                boolean z = recyclerBarEntry instanceof SportRecordLandEntry;
                if (z) {
                    SportRecordLandEntry sportRecordLandEntry = (SportRecordLandEntry) recyclerBarEntry;
                    int iFindRangeIndex = sportRecordLandEntry.findRangeIndex(x);
                    if (iFindRangeIndex != -1) {
                        y = sportRecordLandEntry.getItemValues(iFindRangeIndex);
                    }
                    sportRecordLandEntry.setSelectX(x);
                }
                if (y < 0.0f) {
                    return;
                }
                if (!recyclerBarEntry.equals(iak.this.c)) {
                    if (iak.this.c != null) {
                        iak.this.c.setSelected(0);
                        if (iak.this.c instanceof SportRecordLandEntry) {
                            ((SportRecordLandEntry) iak.this.c).setSelectX(-1.0f);
                        }
                    }
                    if (z) {
                        ((SportRecordLandEntry) recyclerBarEntry).setSelectX(x);
                    }
                    iak.this.c = recyclerBarEntry;
                    recyclerBarEntry.setSelected(2);
                    if (iak.this.f != null) {
                        iak.this.f.notifyItemChanged(childAdapterPosition, 0);
                    }
                }
                iak.this.f20946a.onItemSelected(recyclerBarEntry, childAdapterPosition);
            }
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void d() {
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void e() {
            if (iak.this.c != null) {
                iak.this.c.setSelected(0);
                iak.this.c = null;
                iak.this.f.notifyDataSetChanged();
            }
            iak.this.f20946a.onItemSelected(null, -1);
        }
    }

    public class c extends RecyclerView.s {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (iak.this.f20946a != null) {
                iak.this.f20946a.onScrollStateChanged(recyclerView, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (iak.this.f20946a != null) {
                if (iak.this.c != null && iak.this.c.getSelected() != 0 && !iak.this.f20947b && Math.abs(i) > 4) {
                    iak.this.c.setSelected(0);
                    iak.this.c = null;
                    iak.this.f20946a.onItemSelected(null, -1);
                }
                iak.this.f20946a.onScrolled(recyclerView, i, i2);
            }
        }
    }

    public iak(Context context, BaseChartRecyclerView baseChartRecyclerView, u8h u8hVar) {
        this.f20946a = u8hVar;
        this.e = (SpeedRatioLayoutManager) baseChartRecyclerView.getLayoutManager();
        this.f = baseChartRecyclerView.getAdapter();
        this.d = new GestureDetector(context, new a(baseChartRecyclerView));
        baseChartRecyclerView.setOnChartTouchListener(new b(baseChartRecyclerView));
        baseChartRecyclerView.addOnScrollListener(new c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        View viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (viewFindChildViewUnder == null || this.f20946a == null || !this.d.onTouchEvent(motionEvent)) {
            return false;
        }
        this.f20946a.onItemClick(viewFindChildViewUnder, recyclerView.getChildAdapterPosition(viewFindChildViewUnder));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
