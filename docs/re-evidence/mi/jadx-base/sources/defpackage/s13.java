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

/* JADX INFO: loaded from: classes7.dex */
public class s13<T extends RecyclerBarEntry> implements RecyclerView.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u8h f33152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33153b;
    public T c;
    public GestureDetector d;
    public SpeedRatioLayoutManager e;
    public RecyclerView.Adapter f;
    public int g;
    public float h;

    public class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseChartRecyclerView f33154a;

        public a(BaseChartRecyclerView baseChartRecyclerView) {
            this.f33154a = baseChartRecyclerView;
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
            View viewFindChildViewUnder = this.f33154a.findChildViewUnder(x, y);
            float width = this.f33154a.getWidth() - this.f33154a.getPaddingRight();
            s13 s13Var = s13.this;
            s13Var.f33153b = true;
            if (s13Var.e != null) {
                s13.this.e.l(0.0d);
            }
            if (viewFindChildViewUnder == null || s13.this.f33152a == null) {
                return;
            }
            viewFindChildViewUnder.getWidth();
            if (x < this.f33154a.getPaddingLeft() || x > width || (childAdapterPosition = this.f33154a.getChildAdapterPosition(viewFindChildViewUnder)) == -1) {
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
                    if (s13.this.c != null) {
                        ((BloodGlucoseEntry) s13.this.c).setSelectX(-1.0f);
                    }
                    bloodGlucoseEntry.setSelectX(x);
                    bloodGlucoseEntry.setSelectY(Float.valueOf(y));
                    y2 = value;
                } else {
                    y2 = -1.0f;
                }
            }
            Logger.i("BarChart Render notify change + LongPress" + recyclerBarEntry, new Object[0]);
            if (y2 <= 0.0f) {
                return;
            }
            if (!recyclerBarEntry.equals(s13.this.c)) {
                if (z) {
                    BloodGlucoseEntry bloodGlucoseEntry2 = (BloodGlucoseEntry) recyclerBarEntry;
                    bloodGlucoseEntry2.setSelectX(x);
                    bloodGlucoseEntry2.setSelectY(Float.valueOf(y));
                    if (s13.this.c != null) {
                        ((BloodGlucoseEntry) s13.this.c).setSelectX(-1.0f);
                    }
                }
                if (s13.this.c != null) {
                    s13.this.c.setSelected(0);
                }
                s13.this.c = recyclerBarEntry;
                recyclerBarEntry.setSelected(2);
            } else {
                if (s13.this.c instanceof BloodGlucoseEntry) {
                    return;
                }
                s13.this.c = null;
                recyclerBarEntry.setSelected(0);
            }
            if (s13.this.f != null) {
                s13.this.f.notifyItemChanged(childAdapterPosition, 0);
            }
            s13.this.f33152a.onLongItemClick(viewFindChildViewUnder, childAdapterPosition);
            s13.this.f33152a.onItemSelected(recyclerBarEntry, childAdapterPosition);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            float value;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            View viewFindChildViewUnder = this.f33154a.findChildViewUnder(x, y);
            float width = this.f33154a.getWidth() - this.f33154a.getPaddingRight();
            if (viewFindChildViewUnder != null && s13.this.f33152a != null) {
                viewFindChildViewUnder.getWidth();
                if (x >= this.f33154a.getPaddingLeft() && x <= width) {
                    int childAdapterPosition = this.f33154a.getChildAdapterPosition(viewFindChildViewUnder);
                    Logger.d("BarChart Render notify change + SingleTapUpx" + x + "y" + y, new Object[0]);
                    if (childAdapterPosition != -1) {
                        RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) viewFindChildViewUnder.getTag();
                        float y2 = recyclerBarEntry.getY();
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
                            if (s13.this.c != null) {
                                ((BloodGlucoseEntry) s13.this.c).setSelectX(-1.0f);
                            }
                            bloodGlucoseEntry.setSelected(1);
                            bloodGlucoseEntry.setSelectX(x);
                            bloodGlucoseEntry.setSelectY(Float.valueOf(y));
                            Logger.d("BarChart Render notify change + SingleTapUp" + recyclerBarEntry + "x  " + value + "  index  " + iFindRangeIndex, new Object[0]);
                            y2 = value;
                        }
                        Logger.d("BarChart Render notify change + SingleTapUp" + recyclerBarEntry, new Object[0]);
                        if (y2 <= 0.0f) {
                            if (s13.this.c != null) {
                                s13.this.c.setSelected(0);
                            }
                            s13.this.c = null;
                            Logger.i("BarChart Render notify change + SingleTapUp null " + recyclerBarEntry, new Object[0]);
                            s13.this.f33152a.onItemSelected(null, childAdapterPosition);
                            if (s13.this.f != null) {
                                s13.this.f.notifyItemChanged(childAdapterPosition, Boolean.FALSE);
                            }
                            return false;
                        }
                        if (!recyclerBarEntry.equals(s13.this.c)) {
                            if (s13.this.c != null) {
                                if (z) {
                                    ((BloodGlucoseEntry) s13.this.c).setSelectX(-1.0f);
                                }
                                s13.this.c.setSelected(0);
                            }
                            s13.this.c = recyclerBarEntry;
                            recyclerBarEntry.setSelected(1);
                        } else if (s13.this.h == x) {
                            s13.this.c = null;
                            recyclerBarEntry.setSelected(0);
                        }
                        s13.this.h = x;
                        s13.this.f33152a.onItemSelected(recyclerBarEntry, childAdapterPosition);
                        s13.this.f33152a.onItemClick(viewFindChildViewUnder, childAdapterPosition);
                        if (s13.this.f != null) {
                            s13.this.f.notifyItemChanged(childAdapterPosition, Boolean.FALSE);
                        }
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public class b implements BaseChartRecyclerView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseChartRecyclerView f33156a;

        public b(BaseChartRecyclerView baseChartRecyclerView) {
            this.f33156a = baseChartRecyclerView;
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void a(MotionEvent motionEvent) {
            s13 s13Var = s13.this;
            s13Var.f33153b = false;
            if (s13Var.e != null) {
                s13.this.e.k();
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
            View viewFindChildViewUnder = this.f33156a.findChildViewUnder(x, y);
            float width = this.f33156a.getWidth() - this.f33156a.getPaddingRight();
            if (viewFindChildViewUnder == null || !s13.this.f33153b) {
                if ((s13.this.c instanceof BloodGlucoseEntry) || s13.this.c == null || s13.this.c.getSelected() != 2) {
                    return;
                }
                s13 s13Var = s13.this;
                if (s13Var.f33153b) {
                    s13Var.c.setSelected(0);
                    s13.this.c = null;
                    if (viewFindChildViewUnder == null && s13.this.f != null) {
                        s13.this.f.notifyItemChanged(s13.this.g, 0);
                    }
                    Logger.i("BarChart Render notify change lastPosition" + s13.this.g + "child" + viewFindChildViewUnder + "isLongPressing" + s13.this.f33153b, new Object[0]);
                    s13.this.f33152a.onItemSelected(null, -1);
                    return;
                }
                return;
            }
            viewFindChildViewUnder.getWidth();
            if (x < this.f33156a.getPaddingLeft() || x > width) {
                return;
            }
            int childAdapterPosition = this.f33156a.getChildAdapterPosition(viewFindChildViewUnder);
            s13.this.g = childAdapterPosition;
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
                    if (s13.this.c != null) {
                        ((BloodGlucoseEntry) s13.this.c).setSelectX(-1.0f);
                    }
                    bloodGlucoseEntry.setSelectX(x);
                    bloodGlucoseEntry.setSelectY(Float.valueOf(y));
                    y2 = value;
                }
                if (y2 <= 0.0f) {
                    return;
                }
                if (!recyclerBarEntry.equals(s13.this.c)) {
                    if (z) {
                        BloodGlucoseEntry bloodGlucoseEntry2 = (BloodGlucoseEntry) recyclerBarEntry;
                        bloodGlucoseEntry2.setSelectX(x);
                        bloodGlucoseEntry2.setSelectY(Float.valueOf(y));
                        if (s13.this.c != null) {
                            ((BloodGlucoseEntry) s13.this.c).setSelectX(-1.0f);
                        }
                    }
                    if (s13.this.c != null) {
                        s13.this.c.setSelected(0);
                    }
                    s13.this.c = recyclerBarEntry;
                    recyclerBarEntry.setSelected(2);
                    if (s13.this.f != null) {
                        s13.this.f.notifyItemChanged(childAdapterPosition, 0);
                    }
                }
                s13.this.f33152a.onItemSelected(recyclerBarEntry, childAdapterPosition);
            }
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void d() {
            s13.this.f33152a.onItemClick(null, -1, Boolean.TRUE);
        }

        @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView.a
        public void e() {
            if (s13.this.c != null) {
                s13.this.c.setSelected(0);
                s13.this.c = null;
                s13.this.f.notifyDataSetChanged();
            }
            s13.this.f33152a.onItemSelected(null, -1);
        }
    }

    public class c extends RecyclerView.s {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (s13.this.f33152a != null) {
                s13.this.f33152a.onScrollStateChanged(recyclerView, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (s13.this.f33152a != null) {
                if (s13.this.c != null && s13.this.c.getSelected() != 0 && !s13.this.f33153b && Math.abs(i) > 4) {
                    s13.this.c.setSelected(0);
                    s13.this.c = null;
                    s13.this.f33152a.onItemSelected(null, -1);
                }
                s13.this.f33152a.onScrolled(recyclerView, i, i2);
            }
        }
    }

    public s13(Context context, BaseChartRecyclerView baseChartRecyclerView, u8h u8hVar) {
        this.f33152a = u8hVar;
        this.e = (SpeedRatioLayoutManager) baseChartRecyclerView.getLayoutManager();
        this.f = baseChartRecyclerView.getAdapter();
        this.d = new GestureDetector(context, new a(baseChartRecyclerView));
        baseChartRecyclerView.setOnChartTouchListener(new b(baseChartRecyclerView));
        baseChartRecyclerView.addOnScrollListener(new c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        View viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (viewFindChildViewUnder == null || this.f33152a == null || !this.d.onTouchEvent(motionEvent)) {
            return false;
        }
        this.f33152a.onItemClick(viewFindChildViewUnder, recyclerView.getChildAdapterPosition(viewFindChildViewUnder));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
