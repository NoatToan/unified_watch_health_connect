package com.garmin.android.apps.connectmobile.workouts.presentation.benchmark;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import f12.l;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.c0;
import p13.h0;
import pm0.h;
import q62.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/a;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/a$b;", "selectionCallback", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/a$b;)V", "b", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f48398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<com.garmin.android.apps.connectmobile.workouts.data.model.b> f48399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f48400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k52.a f48401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f48402g;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/a;Landroid/view/View;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C0941a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f48403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f48404b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0941a(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f48404b = aVar;
            this.f48403a = new d(view2);
        }
    }

    public interface b {
        void U4(com.garmin.android.apps.connectmobile.workouts.data.model.b bVar);
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            a aVar = a.this;
            return r13.a.b(aVar.f48401f.c((com.garmin.android.apps.connectmobile.workouts.data.model.b) t7), aVar.f48401f.c((com.garmin.android.apps.connectmobile.workouts.data.model.b) t14));
        }
    }

    public a(Context context, b bVar) {
        context.getClass();
        bVar.getClass();
        this.f48398c = bVar;
        this.f48399d = new ArrayList<>();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        this.f48400e = layoutInflaterFrom;
        this.f48401f = new k52.a(new l22.a(context));
        this.f48402g = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
    }

    public final void A(List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list) {
        ArrayList<com.garmin.android.apps.connectmobile.workouts.data.model.b> arrayList = this.f48399d;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
            if (arrayList.size() > 1) {
                c0.u(arrayList, new c());
            }
        }
        notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f48399d.size();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        String string;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = (com.garmin.android.apps.connectmobile.workouts.data.model.b) h0.e0(i14, this.f48399d);
        if (bVar == null || !(f0Var instanceof C0941a)) {
            return;
        }
        C0941a c0941a = (C0941a) f0Var;
        a aVar = c0941a.f48404b;
        String strC = aVar.f48401f.c(bVar);
        k52.a aVar2 = aVar.f48401f;
        Double dM = bVar.m();
        boolean z14 = aVar.f48402g;
        if (dM != null) {
            aVar2.getClass();
            if (Double.isNaN(dM.doubleValue())) {
                string = aVar2.f102937c.getString(R.string.activities_value_not_set);
            } else {
                DecimalFormat decimalFormat = l3.f23126d;
                decimalFormat.getClass();
                String strA = aVar2.a(dM, decimalFormat);
                l22.b bVar2 = aVar2.f102947a;
                string = strA.concat(StringUtils.SPACE.concat(z14 ? bVar2.getString(R.string.lbl_kg) : bVar2.getString(R.string.lbl_lbs)));
            }
        } else {
            string = aVar2.f102937c.getString(R.string.activities_value_not_set);
        }
        d dVar = c0941a.f48403a;
        int i15 = d.f143195f;
        dVar.a();
        TextView textView = dVar.f143198c;
        if (strC != null) {
            if (textView != null) {
                textView.setText(strC);
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = dVar.f143199d;
        if (textView2 != null) {
            textView2.setText(string);
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        ImageView imageView = dVar.f143197b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        c0941a.itemView.setOnClickListener(new h(16, this, bVar));
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewInflate = this.f48400e.inflate(R.layout.gcm4_workout_list_item, viewGroup, false);
        viewInflate.getClass();
        return new C0941a(this, viewInflate);
    }
}
