package com.garmin.android.apps.connectmobile.devices.targetedselection;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import c22.c3;
import c22.f3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/i;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/devices/targetedselection/d;)V", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends x<l, RecyclerView.f0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34602c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f34603b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/devices/targetedselection/i$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.recyclerview.widget.o.f<l> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(l lVar, l lVar2) {
            l lVar3 = lVar;
            l lVar4 = lVar2;
            lVar3.getClass();
            lVar4.getClass();
            return lVar3.equals(lVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(l lVar, l lVar2) {
            l lVar3 = lVar;
            l lVar4 = lVar2;
            lVar3.getClass();
            lVar4.getClass();
            return lVar3.f34612a == lVar4.f34612a;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34604a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.HEADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34604a = iArr;
        }
    }

    static {
        new b(null);
        f34602c = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar) {
        super(f34602c);
        dVar.getClass();
        this.f34603b = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return r(i14).f34612a.f34631a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String string;
        f0Var.getClass();
        int i15 = c.f34604a[r(i14).f34612a.ordinal()];
        if (i15 == 1) {
            com.garmin.android.apps.connectmobile.devices.targetedselection.b bVar = (com.garmin.android.apps.connectmobile.devices.targetedselection.b) f0Var;
            l lVarR = r(i14);
            lVarR.getClass();
            bVar.f34593b.setContent(new z3.e(-333671228, true, new fd0.b(0, bVar, (l.a) lVarR)));
            return;
        }
        if (i15 == 2) {
            f fVar = (f) f0Var;
            l lVarR2 = r(i14);
            lVarR2.getClass();
            fVar.f34597a.setText(fVar.itemView.getContext().getString(((l.b) lVarR2).f34623b));
            return;
        }
        if (i15 != 3) {
            u0.r();
            return;
        }
        g gVar = (g) f0Var;
        l lVarR3 = r(i14);
        lVarR3.getClass();
        l.c cVar = (l.c) lVarR3;
        c3 c3Var = cVar.f34625c;
        View view2 = gVar.itemView;
        if (c3Var != null) {
            Context context = view2.getContext();
            context.getClass();
            string = dh.b.A(context, c3Var);
        } else {
            string = view2.getContext().getString(cVar.f34624b);
            string.getClass();
        }
        TextView textView = gVar.f34598a;
        f3 f3Var = f3.f23054a;
        Context context2 = gVar.itemView.getContext();
        context2.getClass();
        f3Var.getClass();
        textView.setText(f3.c(context2, string, true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        m mVar;
        viewGroup.getClass();
        m.f34626b.getClass();
        m[] mVarArrValues = m.values();
        int length = mVarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                mVar = null;
                break;
            }
            mVar = mVarArrValues[i15];
            if (mVar.f34631a == i14) {
                break;
            }
            i15++;
        }
        if (mVar == null) {
            mVar = m.DEVICE;
        }
        int i16 = c.f34604a[mVar.ordinal()];
        if (i16 == 1) {
            return new com.garmin.android.apps.connectmobile.devices.targetedselection.b(n23.j.b(viewGroup, R.layout.gcm_targeted_device_selection_course_row_item, viewGroup, false), this.f34603b);
        }
        if (i16 == 2) {
            return new f(n23.j.b(viewGroup, R.layout.gcm_targeted_device_selection_section_text, viewGroup, false));
        }
        if (i16 == 3) {
            return new g(n23.j.b(viewGroup, R.layout.compatible_device_description_layout, viewGroup, false));
        }
        u0.r();
        return null;
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/i$b;", "", "<init>", "()V", "com/garmin/android/apps/connectmobile/devices/targetedselection/i$a", "DiffCallback", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/i$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
