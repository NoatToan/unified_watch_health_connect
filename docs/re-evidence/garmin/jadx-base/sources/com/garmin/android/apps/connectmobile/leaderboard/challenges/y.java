package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mt0.y1;
import mt0.z1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u000b\fB'\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/y;", "Lmt0/z1;", "T", "Landroidx/recyclerview/widget/x;", "Lmt0/y1;", "", "options", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/y$b;", "selectionListener", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/y$b;)V", "a", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y<T extends z1> extends androidx.recyclerview.widget.x<T, y1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f37965b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/y$a;", "Lmt0/z1;", "T", "Landroidx/recyclerview/widget/o$f;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T extends z1> extends androidx.recyclerview.widget.o.f<T> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(Object obj, Object obj2) {
            ((z1) obj).getClass();
            ((z1) obj2).getClass();
            return false;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(Object obj, Object obj2) {
            z1 z1Var = (z1) obj;
            z1 z1Var2 = (z1) obj2;
            z1Var.getClass();
            z1Var2.getClass();
            return z1Var.f120948a.equals(z1Var2.f120948a);
        }
    }

    public interface b<T> {
        void Q8(ArrayList arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(List<? extends T> list, b<T> bVar) {
        super(new a());
        list.getClass();
        this.f37965b = bVar;
        if (list.isEmpty()) {
            return;
        }
        u(list);
        t(list);
    }

    public static void u(List list) {
        int i14;
        if (list.isEmpty()) {
            return;
        }
        if (list.isEmpty()) {
            i14 = 0;
        } else {
            Iterator it = list.iterator();
            i14 = 0;
            while (it.hasNext()) {
                if (((z1) it.next()).f120949b && (i14 = i14 + 1) < 0) {
                    p13.x.p();
                    throw null;
                }
            }
        }
        if (i14 == 0) {
            ((z1) list.get(0)).f120949b = true;
        } else {
            if (!((z1) list.get(0)).f120949b || i14 <= 1) {
                return;
            }
            ((z1) list.get(0)).f120949b = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        y1 y1Var = (y1) f0Var;
        y1Var.getClass();
        T tR = r(i14);
        Button button = y1Var.f120935a;
        button.setText(tR.f120948a);
        button.setSelected(tR.f120949b);
        button.setOnClickListener(new g62.d0(this, i14, tR, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        y1 y1Var = new y1(n23.j.b(viewGroup, R.layout.view_display_chip, viewGroup, false));
        View view2 = y1Var.itemView;
        Button button = view2 instanceof Button ? (Button) view2 : null;
        if (button != null) {
            button.setTextColor(a7.b.getColorStateList(viewGroup.getContext(), R.color.view_display_chip_text_color_selector));
        }
        y1Var.itemView.setBackground(j.a.a(viewGroup.getContext(), R.drawable.choice_chips_view_background_selector));
        return y1Var;
    }

    public /* synthetic */ y(List list, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? null : bVar);
    }
}
