package wr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u000b\fB-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lwr/l;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lwr/l$b;", "", "Lln/b;", "lapFilterTypes", "Lwr/l$a;", "lapFilterTypeCallback", "defaultFilter", "<init>", "(Ljava/util/List;Lwr/l$a;Lln/b;)V", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ln.b> f186788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f186789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ln.b f186790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f186791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f186792e;

    public interface a {
        void a(ln.b bVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwr/l$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lwr/l;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f186793b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Button f186794a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, View view2) {
            super(view2);
            view2.getClass();
            Button button = (Button) view2;
            this.f186794a = button;
            button.setOnClickListener(new u12.e(29, lVar, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends ln.b> list, a aVar, ln.b bVar) {
        list.getClass();
        this.f186788a = list;
        this.f186789b = aVar;
        this.f186790c = bVar;
        this.f186791d = list.indexOf(bVar);
        this.f186792e = new LinkedHashMap();
        int iA = t0.a(y.r(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (ln.b bVar2 : list) {
            linkedHashMap.put(bVar2, Boolean.valueOf(bVar2 == this.f186790c));
        }
        this.f186792e = new LinkedHashMap(linkedHashMap);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f186788a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String string;
        b bVar = (b) f0Var;
        bVar.getClass();
        Button button = bVar.f186794a;
        List<ln.b> list = this.f186788a;
        ln.b bVar2 = list.get(i14);
        Context context = button.getContext();
        context.getClass();
        int i15 = bVar2.f113641b;
        Integer num = bVar2.f113642c;
        if (num == null) {
            string = context.getString(i15);
            string.getClass();
        } else {
            string = context.getString(num.intValue(), context.getString(i15));
            string.getClass();
        }
        button.setText(string);
        button.setSelected(s.g(this.f186792e.get(list.get(i14)), Boolean.TRUE));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(this, n23.j.b(viewGroup, R.layout.view_display_chip, viewGroup, false));
    }

    public /* synthetic */ l(List list, a aVar, ln.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? ln.b.f113634h : bVar);
    }
}
