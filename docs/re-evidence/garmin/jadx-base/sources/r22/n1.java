package r22;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import r22.m1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lr22/n1;", "Lr22/m1;", "T", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class n1<T extends m1> extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f149766a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f149767b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f149768c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"r22/n1$b", "Landroidx/recyclerview/widget/RecyclerView$f0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {
        public b(ViewGroup viewGroup) {
            super(viewGroup);
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        Iterator it = this.f149766a.iterator();
        int itemCount = 0;
        while (it.hasNext()) {
            itemCount += ((m1) it.next()).getItemCount();
        }
        return itemCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        int itemCount = 0;
        for (m1 m1Var : this.f149766a) {
            itemCount += m1Var.getItemCount();
            if (i14 < itemCount) {
                int itemViewType = m1Var.getItemViewType(i14 - (itemCount - m1Var.getItemCount()));
                LinkedHashMap linkedHashMap = this.f149767b;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) ((o13.p) entry.getValue()).f128594a).intValue() == itemViewType && p005kotlin.jvm.internal.s.g(((o13.p) entry.getValue()).f128595b, m1Var)) {
                        return ((Number) entry.getKey()).intValue();
                    }
                }
                int i15 = this.f149768c;
                this.f149768c = i15 + 1;
                linkedHashMap.put(Integer.valueOf(i15), new o13.p(Integer.valueOf(itemViewType), m1Var));
                return i15;
            }
        }
        String strH = am.j.h(i14, "Cannot determine view type for position ");
        com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "SectionedAdapter", strH);
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        m1 m1Var;
        int itemCount;
        f0Var.getClass();
        o13.p pVar = (o13.p) this.f149767b.get(Integer.valueOf(f0Var.getItemViewType()));
        if (pVar == null || (m1Var = (m1) pVar.f128595b) == null) {
            return;
        }
        int itemCount2 = 0;
        for (m1 m1Var2 : this.f149766a) {
            itemCount2 += m1Var2.getItemCount();
            if (i14 < itemCount2) {
                itemCount = i14 - (itemCount2 - m1Var2.getItemCount());
                m1Var.b(f0Var, itemCount);
            }
        }
        String strH = am.j.h(i14, "Cannot determine section position for global position ");
        com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "SectionedAdapter", strH);
        itemCount = -1;
        m1Var.b(f0Var, itemCount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        m1 m1Var;
        viewGroup.getClass();
        o13.p pVar = (o13.p) this.f149767b.get(Integer.valueOf(i14));
        RecyclerView.f0 f0VarA = (pVar == null || (m1Var = (m1) pVar.f128595b) == null) ? null : m1Var.a(viewGroup, ((Number) pVar.f128594a).intValue());
        if (f0VarA != null) {
            return f0VarA;
        }
        String strH = am.j.h(i14, "Cannot create ViewHolder for view type ");
        com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "SectionedAdapter", strH);
        return new b(viewGroup);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr22/n1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
