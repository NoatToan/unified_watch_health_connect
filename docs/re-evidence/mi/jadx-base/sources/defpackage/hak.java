package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BaseChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public class hak<T extends RecyclerBarEntry> implements RecyclerView.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u8h f19867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19868b;
    public T c;
    public T d;
    public GestureDetector e;
    public SpeedRatioLayoutManager f;
    public RecyclerView.Adapter g;
    public int h;
    public float i;
    public boolean j;

    public class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseChartRecyclerView f19869a;

        public a(BaseChartRecyclerView baseChartRecyclerView) {
            this.f19869a = baseChartRecyclerView;
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
            float y = motionEvent.getY();
            View viewFindChildViewUnder = this.f19869a.findChildViewUnder(x, y);
            float width = this.f19869a.getWidth() - this.f19869a.getPaddingRight();
            hak hakVar = hak.this;
            hakVar.f19868b = true;
            if (hakVar.f != null) {
                hak.this.f.l(0.0d);
            }
            if (viewFindChildViewUnder == null || hak.this.f19867a == null) {
                return;
            }
            float left = viewFindChildViewUnder.getLeft() + (viewFindChildViewUnder.getWidth() / 2.0f);
            if (left < this.f19869a.getPaddingLeft() || left > width || (childAdapterPosition = this.f19869a.getChildAdapterPosition(viewFindChildViewUnder)) == -1) {
                return;
            }
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) viewFindChildViewUnder.getTag();
            float y2 = recyclerBarEntry.getY();
            boolean z = recyclerBarEntry instanceof BloodGlucoseEntry;
            if (z) {
                BloodGlucoseEntry bloodGlucoseEntry = (BloodGlucoseEntry) recyclerBarEntry;
                int iFindRangeIndex = bloodGlucoseEntry.findRangeIndex(x);
                if (iFindRangeIndex != -1) {
                    float value = bloodGlucoseEntry.getHighLightType() == 1 ? bloodGlucoseEntry.getValues().get(iFindRangeIndex).getValue() : bloodGlucoseEntry.getFingerBSList().get(iFindRangeIndex).getValue();
                    if (value == 0.0f) {
                        value = 1.0f;
                    }
                    if (hak.this.c != null) {
                        ((BloodGlucoseEntry) hak.this.c).setSelectX(-1.0f);
                    }
                    bloodGlucoseEntry.setSelectX(x);
                    bloodGlucoseEntry.setSelectY(Float.valueOf(y));
                    y2 = value;
                } else {
                    y2 = -1.0f;
                }
            }
            Logger.i("BarChart Render notify change + LongPress" + recyclerBarEntry, new Object[0]);
            if (y2 <= recyclerBarEntry.getEntryMinY() || recyclerBarEntry.validType == 1) {
                return;
            }
            if (!recyclerBarEntry.equals(hak.this.c)) {
                if (z) {
                    BloodGlucoseEntry bloodGlucoseEntry2 = (BloodGlucoseEntry) recyclerBarEntry;
                    bloodGlucoseEntry2.setSelectX(x);
                    bloodGlucoseEntry2.setSelectY(Float.valueOf(y));
                    if (hak.this.c != null) {
                        ((BloodGlucoseEntry) hak.this.c).setSelectX(-1.0f);
                    }
                }
                if (hak.this.c != null) {
                    hak.this.c.setSelected(0);
                }
                hak.this.c = recyclerBarEntry;
                recyclerBarEntry.setSelected(2);
            } else {
                if (hak.this.c instanceof BloodGlucoseEntry) {
                    return;
                }
                hak.this.c = null;
                recyclerBarEntry.setSelected(0);
            }
            if (hak.this.g != null) {
                hak.this.g.notifyItemChanged(childAdapterPosition, 0);
            }
            hak.this.f19867a.onLongItemClick(viewFindChildViewUnder, childAdapterPosition);
            hak.this.f19867a.onItemSelected(recyclerBarEntry, childAdapterPosition);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            float value;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            View viewFindChildViewUnder = this.f19869a.findChildViewUnder(x, y);
            float width = this.f19869a.getWidth() - this.f19869a.getPaddingRight();
            if (viewFindChildViewUnder != null && hak.this.f19867a != null) {
                float left = viewFindChildViewUnder.getLeft() + (viewFindChildViewUnder.getWidth() / 2.0f);
                if (left >= this.f19869a.getPaddingLeft() && left <= width) {
                    int childAdapterPosition = this.f19869a.getChildAdapterPosition(viewFindChildViewUnder);
                    Logger.d("BarChart Render notify change + SingleTapUpx" + x + "y" + y, new Object[0]);
                    if (childAdapterPosition != -1) {
                        RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) viewFindChildViewUnder.getTag();
                        recyclerBarEntry.getY();
                        boolean z = recyclerBarEntry instanceof BloodGlucoseEntry;
                        if (z) {
                            BloodGlucoseEntry bloodGlucoseEntry = (BloodGlucoseEntry) recyclerBarEntry;
                            int iFindRangeIndex = bloodGlucoseEntry.findRangeIndex(x);
                            if (iFindRangeIndex != -1) {
                                value = bloodGlucoseEntry.getHighLightType() == 1 ? bloodGlucoseEntry.getValues().get(iFindRangeIndex).getValue() : bloodGlucoseEntry.getFingerBSList().get(iFindRangeIndex).getValue();
                                if (value == 0.0f) {
                                    value = 1.0f;
                                }
                            } else {
                                value = -1.0f;
                            }
                            if (hak.this.c != null) {
                                ((BloodGlucoseEntry) hak.this.c).setSelectX(-1.0f);
                            }
                            bloodGlucoseEntry.setSelectX(x);
                            bloodGlucoseEntry.setSelectY(Float.valueOf(y));
                            Logger.d("BarChart Render notify change + SingleTapUp" + recyclerBarEntry + "x  " + value + "  index  " + iFindRangeIndex, new Object[0]);
                        }
                        if (Math.abs(y - recyclerBarEntry.getGoalY()) <= ExtUtilsKt.getDp(15) && recyclerBarEntry.getGoalValue() > 0) {
                            Logger.i("RecyclerItem", "click Target Line");
                            if (hak.this.j) {
                                if (recyclerBarEntry.equals(hak.this.d)) {
                                    hak.this.d = null;
                                    recyclerBarEntry.setTargetSelected(0);
                                } else {
                                    if (hak.this.d != null) {
                                        hak.this.d.setTargetSelected(0);
                                    }
                                    hak.this.d = recyclerBarEntry;
                                    recyclerBarEntry.setTargetSelected(1);
                                }
                                if (hak.this.c != null) {
                                    hak.this.c.setSelected(0);
                                }
                                recyclerBarEntry.setSelected(0);
                                hak.this.f19867a.onItemSelected(recyclerBarEntry, childAdapterPosition);
                                if (hak.this.g != null) {
                                    hak.this.g.notifyItemChanged(childAdapterPosition, Boolean.FALSE);
                                }
                                return true;
                            }
                        } else if (hak.this.d != null) {
                            hak.this.d.setTargetSelected(0);
                            hak.this.d = null;
                        }
                        Logger.d("BarChart Render notify change + SingleTapUp" + recyclerBarEntry, new Object[0]);
                        if (recyclerBarEntry.getY() > recyclerBarEntry.getEntryMinY() && recyclerBarEntry.validType != 1) {
                            if (recyclerBarEntry.equals(hak.this.c)) {
                                hak.this.c = null;
                                recyclerBarEntry.setSelected(0);
                            } else {
                                if (hak.this.c != null) {
                                    if (z) {
                                        ((BloodGlucoseEntry) hak.this.c).setSelectX(-1.0f);
                                    }
                                    hak.this.c.setSelected(0);
                                }
                                hak.this.c = recyclerBarEntry;
                                recyclerBarEntry.setSelected(1);
                            }
                            hak.this.i = x;
                            hak.this.f19867a.onItemSelected(recyclerBarEntry, childAdapterPosition);
                            hak.this.f19867a.onItemClick(viewFindChildViewUnder, childAdapterPosition);
                            if (hak.this.g != null) {
                                hak.this.g.notifyItemChanged(childAdapterPosition, Boolean.FALSE);
                            }
                            return true;
                        }
                        if (hak.this.c != null) {
                            hak.this.c.setSelected(0);
                        }
                        hak.this.c = null;
                        Logger.i("BarChart Render notify change + SingleTapUp null " + recyclerBarEntry, new Object[0]);
                        hak.this.f19867a.onItemSelected(null, childAdapterPosition);
                        if (hak.this.g != null) {
                            hak.this.g.notifyItemChanged(childAdapterPosition, Boolean.FALSE);
                        }
                    }
                }
            }
            return false;
        }
    }

    public class b implements BaseChartRecyclerView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseChartRecyclerView f19871a;

        public b(BaseChartRecyclerView baseChartRecyclerView) {
            this.f19871a = baseChartRecyclerView;
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void a(MotionEvent motionEvent) {
            hak hakVar = hak.this;
            hakVar.f19868b = false;
            if (hakVar.f != null) {
                hak.this.f.k();
            }
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void b(MotionEvent motionEvent) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void c(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            View viewFindChildViewUnder = this.f19871a.findChildViewUnder(x, y);
            float width = this.f19871a.getWidth() - this.f19871a.getPaddingRight();
            if (viewFindChildViewUnder == null || !hak.this.f19868b) {
                if ((hak.this.c instanceof BloodGlucoseEntry) || hak.this.c == null || hak.this.c.getSelected() != 2) {
                    return;
                }
                hak hakVar = hak.this;
                if (hakVar.f19868b) {
                    hakVar.c.setSelected(0);
                    hak.this.c = null;
                    if (viewFindChildViewUnder == null && hak.this.g != null) {
                        hak.this.g.notifyItemChanged(hak.this.h, 0);
                    }
                    Logger.i("BarChart Render notify change lastPosition" + hak.this.h + "child" + viewFindChildViewUnder + "isLongPressing" + hak.this.f19868b, new Object[0]);
                    hak.this.f19867a.onItemSelected(null, -1);
                    return;
                }
                return;
            }
            float left = viewFindChildViewUnder.getLeft() + (viewFindChildViewUnder.getWidth() / 2.0f);
            if (left < this.f19871a.getPaddingLeft() || left > width) {
                if (hak.this.c != null) {
                    hak.this.c.setSelected(0);
                }
                hak.this.f19867a.onItemSelected(null, -1);
                return;
            }
            int childAdapterPosition = this.f19871a.getChildAdapterPosition(viewFindChildViewUnder);
            hak.this.h = childAdapterPosition;
            if (childAdapterPosition != -1) {
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) viewFindChildViewUnder.getTag();
                float y2 = recyclerBarEntry.getY();
                boolean z = recyclerBarEntry instanceof BloodGlucoseEntry;
                if (z) {
                    BloodGlucoseEntry bloodGlucoseEntry = (BloodGlucoseEntry) recyclerBarEntry;
                    int iFindRangeIndex = bloodGlucoseEntry.findRangeIndex(x);
                    if (iFindRangeIndex == -1) {
                        return;
                    }
                    float value = bloodGlucoseEntry.getHighLightType() == 1 ? bloodGlucoseEntry.getValues().get(iFindRangeIndex).getValue() : bloodGlucoseEntry.getFingerBSList().get(iFindRangeIndex).getValue();
                    Logger.d("BarChart Render notify change + SingleTapUp" + recyclerBarEntry + "x  " + value + "  index  " + iFindRangeIndex, new Object[0]);
                    if (value == 0.0f) {
                        value = 1.0f;
                    } else if (value == -1.0f) {
                        return;
                    }
                    if (hak.this.c != null) {
                        ((BloodGlucoseEntry) hak.this.c).setSelectX(-1.0f);
                    }
                    bloodGlucoseEntry.setSelectX(x);
                    bloodGlucoseEntry.setSelectY(Float.valueOf(y));
                    y2 = value;
                }
                if (y2 <= recyclerBarEntry.getEntryMinY() || recyclerBarEntry.validType == 1) {
                    return;
                }
                if (!recyclerBarEntry.equals(hak.this.c)) {
                    if (z) {
                        BloodGlucoseEntry bloodGlucoseEntry2 = (BloodGlucoseEntry) recyclerBarEntry;
                        bloodGlucoseEntry2.setSelectX(x);
                        bloodGlucoseEntry2.setSelectY(Float.valueOf(y));
                        if (hak.this.c != null) {
                            ((BloodGlucoseEntry) hak.this.c).setSelectX(-1.0f);
                        }
                    }
                    if (hak.this.c != null) {
                        hak.this.c.setSelected(0);
                    }
                    hak.this.c = recyclerBarEntry;
                    recyclerBarEntry.setSelected(2);
                    if (hak.this.g != null) {
                        hak.this.g.notifyItemChanged(childAdapterPosition, 0);
                    }
                }
                hak.this.f19867a.onItemSelected(recyclerBarEntry, childAdapterPosition);
            }
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void d() {
            hak.this.f19867a.onItemClick(null, -1, Boolean.TRUE);
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void e() {
            if (hak.this.c != null) {
                hak.this.c.setSelected(0);
                hak.this.c = null;
                hak.this.g.notifyDataSetChanged();
            }
            hak.this.f19867a.onItemSelected(null, -1);
        }
    }

    public class c extends RecyclerView.s {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (hak.this.f19867a != null) {
                hak.this.f19867a.onScrollStateChanged(recyclerView, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (hak.this.f19867a != null) {
                if (hak.this.c != null && hak.this.c.getSelected() != 0 && !hak.this.f19868b && Math.abs(i) > 4) {
                    hak.this.c.setSelected(0);
                    hak.this.c = null;
                    hak.this.f19867a.onItemSelected(null, -1);
                }
                hak.this.f19867a.onScrolled(recyclerView, i, i2);
            }
        }
    }

    public hak(Context context, BaseChartRecyclerView baseChartRecyclerView, u8h u8hVar) {
        this.f19867a = u8hVar;
        this.f = (SpeedRatioLayoutManager) baseChartRecyclerView.getLayoutManager();
        this.g = baseChartRecyclerView.getAdapter();
        this.e = new GestureDetector(context, new a(baseChartRecyclerView));
        baseChartRecyclerView.setOnChartTouchListener(new b(baseChartRecyclerView));
        baseChartRecyclerView.addOnScrollListener(new c());
    }

    public void l() {
        T t = this.c;
        if (t != null) {
            t.setSelected(0);
            this.c = null;
        }
        this.f19868b = false;
        SpeedRatioLayoutManager speedRatioLayoutManager = this.f;
        if (speedRatioLayoutManager != null) {
            speedRatioLayoutManager.k();
        }
    }

    public void m(boolean z) {
        this.j = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        View viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (viewFindChildViewUnder == null || this.f19867a == null || !this.e.onTouchEvent(motionEvent)) {
            return false;
        }
        this.f19867a.onItemClick(viewFindChildViewUnder, recyclerView.getChildAdapterPosition(viewFindChildViewUnder));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
