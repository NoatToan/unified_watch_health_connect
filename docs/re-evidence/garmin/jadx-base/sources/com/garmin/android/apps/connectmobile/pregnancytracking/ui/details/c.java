package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\f\rB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/c$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Ldb1/d;", "glucoseTypes", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/c$a;", "glucoseChartTypeCallBack", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/c$a;)V", "a", "b", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<db1.d> f40561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f40562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f40563d;

    public interface a {
        void o(Set<? extends db1.d> set);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/c$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/c;Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f40564b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Button f40565a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, View view2) {
            super(view2);
            view2.getClass();
            Button button = (Button) view2;
            this.f40565a = button;
            button.setOnClickListener(new cw2.b(14, cVar, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, List<? extends db1.d> list, a aVar) {
        context.getClass();
        list.getClass();
        this.f40560a = context;
        this.f40561b = list;
        this.f40562c = aVar;
        this.f40563d = new LinkedHashMap();
        int iA = t0.a(y.r(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((db1.d) it.next(), Boolean.TRUE);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        this.f40563d = linkedHashMap2;
        a aVar2 = this.f40562c;
        if (aVar2 != null) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            aVar2.o(linkedHashMap3.keySet());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f40561b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        Button button = bVar.f40565a;
        Context context = button.getContext();
        List<db1.d> list = this.f40561b;
        button.setText(context.getString(list.get(i14).f59000a));
        button.setSelected(p005kotlin.jvm.internal.s.g(this.f40563d.get(list.get(i14)), Boolean.TRUE));
        s0.r(bVar.itemView, new d(this, i14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(this.f40560a).inflate(R.layout.view_display_chip, viewGroup, false);
        viewInflate.getClass();
        return new b(this, viewInflate);
    }

    public /* synthetic */ c(Context context, List list, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, list, (i14 & 4) != 0 ? null : aVar);
    }
}
