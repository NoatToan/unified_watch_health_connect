package br2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import aq.b0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import qw0.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lbr2/e;", "Landroidx/recyclerview/widget/x;", "Lbr2/f;", "Ler2/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "showConnectionState", "<init>", "(Landroid/content/Context;Z)V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends x<f, er2.j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f19594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f19596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<f> f19597e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbr2/e$b;", "Landroidx/recyclerview/widget/o$f;", "Lbr2/f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends o.f<f> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(f fVar, f fVar2) {
            f fVar3 = fVar;
            f fVar4 = fVar2;
            fVar3.getClass();
            fVar4.getClass();
            return fVar3.equals(fVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(f fVar, f fVar2) {
            fVar.getClass();
            fVar2.getClass();
            return true;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(f fVar, f fVar2) {
            f fVar3 = fVar;
            f fVar4 = fVar2;
            fVar3.getClass();
            fVar4.getClass();
            return Integer.valueOf(fVar3.b(fVar4));
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, boolean z14) {
        super(new b());
        context.getClass();
        this.f19594b = context;
        this.f19595c = z14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        er2.j jVar = (er2.j) f0Var;
        jVar.getClass();
        onBindViewHolder(jVar, i14, j0.f134944a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(this.f19594b).inflate(R.layout.item_selectable_device, viewGroup, false);
        viewInflate.getClass();
        return new er2.j(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(er2.j jVar, int i14, List<? extends Object> list) {
        int iIntValue;
        jVar.getClass();
        list.getClass();
        if (this.f19596d != null) {
            jVar.itemView.setOnClickListener(new b0(this, i14, 1));
        }
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Integer) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
                return;
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() | ((Number) it.next()).intValue());
            }
            iIntValue = ((Number) next).intValue();
        } else {
            iIntValue = -1;
        }
        er2.j.a aVar = this.f19595c ? er2.j.a.DEVICE_WITH_CONNECTION_STATE_ITEM : er2.j.a.DEVICE_ONLY_ITEM;
        List<f> list2 = this.f19597e;
        jVar.d(this.f19594b, list2 != null ? list2.get(i14) : null, iIntValue, aVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbr2/e$a;", "", "<init>", "()V", "", "PAYLOAD_ALL", "I", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
