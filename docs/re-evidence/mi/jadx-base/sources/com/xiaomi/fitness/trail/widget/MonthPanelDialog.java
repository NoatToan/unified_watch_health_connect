package com.xiaomi.fitness.trail.widget;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.b8g;
import defpackage.b8h;
import defpackage.bsi;
import defpackage.f9h;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.t7g;
import defpackage.x8h;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class MonthPanelDialog extends CommonDialog<MonthDialogParams> implements b8h, f9h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Calendar f13253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f13254b;
    public t7g c;
    public b8g d;
    public TextView e;
    public LinearLayoutManager f;
    public TextView g;
    public Date h;
    public List<f9h> i = new CopyOnWriteArrayList();
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f13255k;
    public int l;

    public static class MonthDialogParams extends DialogParams {
        public static final Parcelable.Creator<MonthDialogParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13256a;

        public class a implements Parcelable.Creator<MonthDialogParams> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MonthDialogParams createFromParcel(Parcel parcel) {
                return new MonthDialogParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public MonthDialogParams[] newArray(int i) {
                return new MonthDialogParams[i];
            }
        }

        public MonthDialogParams(String str) {
            super(str);
        }

        public int a() {
            return this.f13256a;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.DialogParams, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13256a);
        }

        public MonthDialogParams(Parcel parcel) {
            super(parcel);
            this.f13256a = parcel.readInt();
        }
    }

    public class a extends RecyclerView.s {
        public a() {
        }

        public final /* synthetic */ void b() {
            MonthPanelDialog.this.G();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            MonthPanelDialog.this.G();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i == 0 && i2 == 0) {
                ExecutorHelper.postInMain(new Runnable() { // from class: a8g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f768a.b();
                    }
                }, 200L);
            }
        }
    }

    public static class b extends com.xiaomi.fitness.baseui.dialog.a<b, MonthDialogParams, MonthPanelDialog> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13258a;

        public b(String str) {
            this(new MonthDialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MonthPanelDialog internalCreate() {
            return new MonthPanelDialog(this.f13258a);
        }

        public b(MonthDialogParams monthDialogParams) {
            super(monthDialogParams);
            this.f13258a = 0;
        }
    }

    public MonthPanelDialog(int i) {
        this.l = i;
    }

    public final void A(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(bsi.B3);
        if (viewGroup != null) {
            int iA = requireDialogParams().a();
            if (iA == 0) {
                return;
            } else {
                viewGroup.addView(LayoutInflater.from(getContext()).inflate(iA, viewGroup, false));
            }
        }
        this.f13255k = viewGroup;
    }

    public void B(View view) {
        this.d.f(Calendar.getInstance().getTime());
        C();
    }

    public final void C() {
        Date dateB = this.d.b();
        if (dateB != null) {
            this.f13254b.scrollToPosition(this.c.n(dateB));
            this.c.notifyDataSetChanged();
        }
    }

    public final void D(String str) {
        if (this.e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.e.setText(str);
    }

    public void E(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        this.h = calendar.getTime();
    }

    public final void F(boolean z) {
        if (this.g == null || !isResumed()) {
            return;
        }
        this.g.setVisibility(z ? 0 : 4);
        if (Locale.getDefault() == Locale.CHINESE || Locale.getDefault() == Locale.SIMPLIFIED_CHINESE || Locale.getDefault() == Locale.TRADITIONAL_CHINESE) {
            this.g.setText(j1j.ma);
            return;
        }
        Calendar calendar = this.f13253a;
        calendar.setTimeInMillis(System.currentTimeMillis());
        this.g.setText(String.valueOf(calendar.get(5)));
    }

    public final void G() {
        t7g.a aVar;
        int iFindLastVisibleItemPosition = this.f.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition < 0 || !isResumed() || (aVar = (t7g.a) this.f13254b.findViewHolderForLayoutPosition(iFindLastVisibleItemPosition)) == null) {
            return;
        }
        int iF = aVar.f();
        int iD = aVar.d();
        this.f13253a.set(1, iF);
        this.f13253a.set(2, iD);
        this.f13253a.set(5, 1);
        D(TimeUtils.formatDate(getString(j1j.d), Long.valueOf(this.f13253a.getTimeInMillis())));
    }

    public void addOnMonthPreparedListener(f9h f9hVar) {
        if (this.i.contains(f9hVar)) {
            return;
        }
        this.i.add(f9hVar);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        A(view);
        this.e = (TextView) view.findViewById(bsi.k8);
        this.f13253a = Calendar.getInstance();
        b8g b8gVar = (b8g) new ViewModelProvider(this).get(b8g.class);
        this.d = b8gVar;
        b8gVar.setOnDateSelectedListener(this);
        this.d.f(this.h);
        TextView textView = (TextView) view.findViewById(bsi.l8);
        this.g = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: z7g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f40983a.B(view2);
            }
        });
        t7g t7gVar = new t7g(this.l);
        this.c = t7gVar;
        t7gVar.setOnMonthPreparedListener(this);
        this.c.o(null);
        this.f13254b = (RecyclerView) view.findViewById(bsi.N3);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f = linearLayoutManager;
        this.f13254b.setLayoutManager(linearLayoutManager);
        this.f13254b.setAdapter(this.c);
        this.f13254b.scrollToPosition(this.c.getCount() - 1);
        this.c.q(this.d);
        this.f13254b.addOnScrollListener(new a());
        Context context = view.getContext();
        if (this.l == 1) {
            this.g.setBackground(context.getDrawable(hoi.c0));
        }
    }

    @Override // defpackage.f9h
    public void m(MonthPanelView monthPanelView, Date date, Date date2) {
        Iterator<f9h> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().m(monthPanelView, date, date2);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.d.setOnDateSelectedListener(null);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (i == -1) {
            Bundle bundle = new Bundle();
            bundle.putLong("key_select_date", this.d.b().getTime());
            setResultData(-1, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        F(TimeUtils.getBeginOfToday() != TimeUtils.getBeginOfDate(this.d.b().getTime()));
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C();
    }

    @Override // defpackage.b8h
    public void q(Date date) {
        F((this.d.d() || this.j) ? false : true);
    }

    public void removeOnMonthPreparedListener(f9h f9hVar) {
        this.i.remove(f9hVar);
    }

    public void setOnJumpToTodayListener(x8h x8hVar) {
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b buildUpon() {
        return new b(requireDialogParams());
    }
}
