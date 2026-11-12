package lq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.LinkedHashMap;
import java.util.List;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u000b\fB-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Llq/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Llq/f$b;", "", "Llq/h;", "intervalTypes", "Llq/f$a;", "intervalFilterTypeCallback", "defaultFilter", "<init>", "(Ljava/util/List;Llq/f$a;Llq/h;)V", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h> f114295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f114296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f114297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f114299e;

    public interface a {
        void a(h hVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llq/f$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Llq/f;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f114300b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Button f114301a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, View view2) {
            super(view2);
            view2.getClass();
            Button button = (Button) view2;
            this.f114301a = button;
            button.setOnClickListener(new g(0, fVar, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends h> list, a aVar, h hVar) {
        list.getClass();
        this.f114295a = list;
        this.f114296b = aVar;
        this.f114297c = hVar;
        this.f114298d = list.indexOf(hVar);
        this.f114299e = new LinkedHashMap();
        int iA = t0.a(y.r(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (h hVar2 : list) {
            linkedHashMap.put(hVar2, Boolean.valueOf(hVar2 == this.f114297c));
        }
        this.f114299e = new LinkedHashMap(linkedHashMap);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f114295a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        Button button = bVar.f114301a;
        Context context = button.getContext();
        List<h> list = this.f114295a;
        button.setText(context.getString(list.get(i14).f114312b));
        button.setSelected(s.g(this.f114299e.get(list.get(i14)), Boolean.TRUE));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(this, j.b(viewGroup, R.layout.view_display_chip, viewGroup, false));
    }

    public /* synthetic */ f(List list, a aVar, h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? h.ALL : hVar);
    }
}
