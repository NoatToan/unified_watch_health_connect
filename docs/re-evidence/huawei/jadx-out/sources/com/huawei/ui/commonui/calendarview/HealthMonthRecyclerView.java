package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.uikit.phone.hwrecyclerview.widget.HwRecyclerView;
import defpackage.qjj;
import defpackage.qjo;
import defpackage.qrs;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public class HealthMonthRecyclerView extends HwRecyclerView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set<String> f23331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f23332c;
    private int d;
    private LinearLayoutManager e;
    private qjo g;
    private MarkDateTrigger h;

    public HealthMonthRecyclerView(Context context) {
        super(context);
        this.f23331b = new HashSet();
    }

    public HealthMonthRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23331b = new HashSet();
    }

    public HealthMonthRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23331b = new HashSet();
    }

    void d(qjo qjoVar) {
        this.g = qjoVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.e = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        d dVar = new d(getContext());
        this.f23332c = dVar;
        setAdapter(dVar);
        b(false);
        e(false);
    }

    private void b(int i) {
        if (i > -1 && i < this.d - 1) {
            scrollToPosition(i);
            this.e.scrollToPositionWithOffset(i, 0);
            return;
        }
        int i2 = this.d;
        if (i == i2 - 1) {
            this.e.setStackFromEnd(true);
        } else {
            LogUtil.e("HealthMonthRecyclerView", "moveToPosition failed, position = ", Integer.valueOf(i), ", count = ", Integer.valueOf(i2));
        }
    }

    void c() {
        this.d = qjj.c(this.g) + 1;
        this.f23332c.notifyDataSetChanged();
        b(this.d - 1);
    }

    void c(HealthCalendar healthCalendar, boolean z, boolean z2) {
        int iB = qjj.b(healthCalendar, this.g);
        int i = this.d - 1;
        if (iB > i) {
            iB = i;
        }
        b(iB);
        HealthCalendarBaseMonthView healthCalendarBaseMonthView = (HealthCalendarBaseMonthView) findViewWithTag(Integer.valueOf(iB));
        if (healthCalendarBaseMonthView != null) {
            healthCalendarBaseMonthView.setSelectedCalendar(this.g.o);
            healthCalendarBaseMonthView.invalidate();
        }
    }

    final void e() {
        c();
        HealthCalendar healthCalendar = this.g.o;
        if (this.g.d != null) {
            this.g.d.onMonthDateSelected(healthCalendar, false);
        }
        if (this.g.f46319b != null) {
            this.g.f46319b.onCalendarSelect(healthCalendar, false);
        }
    }

    public void setMarkDateTrigger(MarkDateTrigger markDateTrigger) {
        this.h = markDateTrigger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(long j, long j2) {
        return this.f23331b.contains(String.valueOf(j) + String.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j, long j2) {
        this.f23331b.add(String.valueOf(j) + String.valueOf(j2));
    }

    /* JADX INFO: loaded from: classes43.dex */
    class d extends RecyclerView.Adapter<C0269d> {
        final LayoutInflater e;

        d(Context context) {
            this.e = LayoutInflater.from(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0269d onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C0269d(this.e.inflate(R.layout.health_calendar_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return HealthMonthRecyclerView.this.d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0269d c0269d, int i) {
            int iA = qjj.a(i, HealthMonthRecyclerView.this.g);
            int iE = qjj.e(i, HealthMonthRecyclerView.this.g);
            c0269d.f23338b.initMonthWithDate(iA, iE);
            c0269d.f23338b.setSelectedCalendar(HealthMonthRecyclerView.this.g.o);
            String str = String.valueOf(iA) + String.valueOf(iE);
            if ((c0269d.f23338b.getTag() instanceof String) && !str.equals(c0269d.f23338b.getTag())) {
                c0269d.f23338b.requestLayout();
            }
            c0269d.f23338b.setTag(str);
            c0269d.d.setText(DateUtils.formatDateTime(HealthMonthRecyclerView.this.getContext(), new HealthCalendar(iA, iE, 1).transformCalendar().getTimeInMillis(), 36));
            long jE = qjj.e(iA, iE);
            long jC = qjj.c(iA, iE);
            if (HealthMonthRecyclerView.this.h == null || HealthMonthRecyclerView.this.b(jE, jC)) {
                return;
            }
            c cVar = new c(HealthMonthRecyclerView.this, c0269d);
            cVar.a(jE, jC);
            HealthMonthRecyclerView.this.h.retrieveMarkDate(jE, jC, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public HealthCalendarBaseMonthView e() {
            HealthCalendarBaseMonthView healthDefaultMonthView;
            try {
                Constructor<?> constructor = HealthMonthRecyclerView.this.g.t().getConstructor(Context.class);
                healthDefaultMonthView = constructor.newInstance(HealthMonthRecyclerView.this.getContext()) instanceof HealthCalendarBaseMonthView ? (HealthCalendarBaseMonthView) constructor.newInstance(HealthMonthRecyclerView.this.getContext()) : null;
            } catch (IllegalAccessException unused) {
                Log.e("HealthMonthRecyclerView", "IllegalAccessException in reflect call HealthCalendarBaseMonthView constructor");
            } catch (InstantiationException unused2) {
                Log.e("HealthMonthRecyclerView", "InstantiationException in reflect call HealthCalendarBaseMonthView constructor");
            } catch (NoSuchMethodException unused3) {
                Log.e("HealthMonthRecyclerView", "NoSuchMethodException in reflect call HealthCalendarBaseMonthView constructor");
            } catch (InvocationTargetException unused4) {
                Log.e("HealthMonthRecyclerView", "InvocationTargetException in reflect call HealthCalendarBaseMonthView constructor");
            }
            if (healthDefaultMonthView == null) {
                healthDefaultMonthView = new HealthDefaultMonthView(HealthMonthRecyclerView.this.getContext());
            }
            healthDefaultMonthView.init(HealthMonthRecyclerView.this.g);
            return healthDefaultMonthView;
        }

        /* JADX INFO: renamed from: com.huawei.ui.commonui.calendarview.HealthMonthRecyclerView$d$d, reason: collision with other inner class name */
        class C0269d extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            HealthCalendarBaseMonthView f23338b;
            HealthTextView d;

            C0269d(View view) {
                super(view);
                this.d = (HealthTextView) view.findViewById(R.id.text1);
                if (qrs.v()) {
                    this.d.setTextSize(0, HealthMonthRecyclerView.this.getResources().getDimensionPixelSize(R.dimen.health_common_24dp));
                }
                HealthCalendarBaseMonthView healthCalendarBaseMonthViewE = d.this.e();
                this.f23338b = healthCalendarBaseMonthViewE;
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).addView(healthCalendarBaseMonthViewE);
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes43.dex */
    static class c extends UiCallback<Map<String, HealthCalendar>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<d.C0269d> f23333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f23334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f23335c;
        private WeakReference<HealthMonthRecyclerView> d;

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
        }

        public c(HealthMonthRecyclerView healthMonthRecyclerView, d.C0269d c0269d) {
            this.d = new WeakReference<>(healthMonthRecyclerView);
            this.f23333a = new WeakReference<>(c0269d);
        }

        public void a(long j, long j2) {
            this.f23335c = j;
            this.f23334b = j2;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Map<String, HealthCalendar> map) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.commonui.calendarview.HealthMonthRecyclerView.c.4
                @Override // java.lang.Runnable
                public void run() {
                    HealthMonthRecyclerView healthMonthRecyclerView = (HealthMonthRecyclerView) c.this.d.get();
                    d.C0269d c0269d = (d.C0269d) c.this.f23333a.get();
                    if (healthMonthRecyclerView != null && c0269d != null) {
                        healthMonthRecyclerView.e(c.this.f23335c, c.this.f23334b);
                        healthMonthRecyclerView.g.c(map);
                        c0269d.f23338b.update();
                        return;
                    }
                    LogUtil.j("HealthMonthRecyclerView", "recyclerView or holder is null");
                }
            });
        }
    }
}
