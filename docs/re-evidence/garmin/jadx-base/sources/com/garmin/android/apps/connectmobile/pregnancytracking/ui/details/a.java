package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\f\rB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/a$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Ldb1/g;", "movementTypes", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/a$a;", "movementChartTypeCallBack", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/a$a;)V", "a", "b", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<db1.g> f40451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0761a f40452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashMap f40453d;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.a$a, reason: collision with other inner class name */
    public interface InterfaceC0761a {
        void o(Set<? extends db1.g> set);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/a;Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f40454b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Button f40455a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, View view2) {
            super(view2);
            view2.getClass();
            Button button = (Button) view2;
            this.f40455a = button;
            button.setOnClickListener(new cw2.b(13, aVar, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, List<? extends db1.g> list, InterfaceC0761a interfaceC0761a) {
        context.getClass();
        list.getClass();
        this.f40450a = context;
        this.f40451b = list;
        this.f40452c = interfaceC0761a;
        this.f40453d = new LinkedHashMap();
        if (!list.isEmpty()) {
            this.f40453d.put(h0.b0(list), Boolean.TRUE);
        }
        if (interfaceC0761a != null) {
            LinkedHashMap linkedHashMap = this.f40453d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            interfaceC0761a.o(linkedHashMap2.keySet());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f40451b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        Button button = bVar.f40455a;
        List<db1.g> list = this.f40451b;
        button.setText(list.get(i14).name());
        button.setSelected(p005kotlin.jvm.internal.s.g(this.f40453d.get(list.get(i14)), Boolean.TRUE));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(this.f40450a).inflate(R.layout.view_display_chip, viewGroup, false);
        viewInflate.getClass();
        return new b(this, viewInflate);
    }

    public /* synthetic */ a(Context context, List list, InterfaceC0761a interfaceC0761a, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, list, (i14 & 4) != 0 ? null : interfaceC0761a);
    }
}
