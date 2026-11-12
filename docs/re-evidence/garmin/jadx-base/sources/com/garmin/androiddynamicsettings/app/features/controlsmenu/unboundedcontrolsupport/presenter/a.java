package com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import hi2.d;
import java.util.ArrayList;
import java.util.Collections;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pm0.h;
import th2.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/unboundedcontrolsupport/presenter/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/unboundedcontrolsupport/presenter/b$a;", "Luh2/a;", "controlsMenuViewModel", "<init>", "(Luh2/a;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> implements b.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f50618g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh2.a f50619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f50620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<sh2.a> f50621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f50624f;

    static {
        new C1016a(null);
    }

    public a(uh2.a aVar) {
        aVar.getClass();
        this.f50619a = aVar;
        this.f50620b = new d("ControlsMenuDragDropAdapter", null, 2, null);
        ArrayList<sh2.a> arrayListD = aVar.f171140b.d();
        this.f50621c = arrayListD == null ? new ArrayList<>() : arrayListD;
    }

    @Override // com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.b.a
    public final void b(int i14, int i15) {
        uh2.a aVar = this.f50619a;
        if (i15 >= aVar.f171143e) {
            this.f50620b.b("Not a valid position to drop");
            aVar.z4(this.f50622d, this.f50623e);
            y0<ArrayList<sh2.a>> y0Var = aVar.f171140b;
            ArrayList<sh2.a> arrayListD = y0Var.d();
            if (arrayListD != null) {
                y0Var.m(aVar.y4(arrayListD));
                aVar.f171141c.m(aVar.x4());
            }
            this.f50624f = true;
            return;
        }
        ArrayList<sh2.a> arrayList = this.f50621c;
        if (i14 >= i15) {
            int i16 = i15 + 1;
            if (i16 <= i14) {
                int i17 = i14;
                while (true) {
                    Collections.swap(arrayList, i17, i17 - 1);
                    if (i17 == i16) {
                        break;
                    } else {
                        i17--;
                    }
                }
            }
        } else {
            int i18 = i14;
            while (i18 < i15) {
                int i19 = i18 + 1;
                Collections.swap(arrayList, i18, i19);
                i18 = i19;
            }
        }
        notifyItemMoved(i14, i15);
        this.f50623e = i15;
    }

    @Override // com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.b.a
    public final void d(c cVar) {
        cVar.getClass();
        this.f50624f = false;
        this.f50622d = cVar.getAdapterPosition();
        cVar.f164554a.setAlpha(0.5f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        int size = this.f50621c.size();
        this.f50620b.getClass();
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        Integer num = this.f50621c.get(i14).f159308b;
        if (num != null && num.intValue() == 9630) {
            return 2;
        }
        return (num != null && num.intValue() == 9631) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        int itemViewType = getItemViewType(i14);
        ArrayList<sh2.a> arrayList = this.f50621c;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                ((th2.b) f0Var).f164553a.setText(arrayList.get(i14).f159310d);
                return;
            }
            th2.d dVar = (th2.d) f0Var;
            Drawable drawable = arrayList.get(i14).f159311e;
            if (drawable != null) {
                dVar.f164559b.setImageDrawable(drawable);
            }
            dVar.f164560c.setText(arrayList.get(i14).f159310d);
            return;
        }
        c cVar = (c) f0Var;
        Drawable drawable2 = arrayList.get(i14).f159311e;
        if (drawable2 != null) {
            cVar.f164556c.setImageDrawable(drawable2);
        }
        Boolean bool = arrayList.get(i14).f159309c;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        ImageView imageView = cVar.f164555b;
        if (zBooleanValue) {
            imageView.setAlpha(0.5f);
        } else {
            imageView.setAlpha(1.0f);
        }
        cVar.f164557d.setText(arrayList.get(i14).f159310d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 0) {
            View viewD = a0.d(viewGroup, R.layout.dsl_controls_menu_selected_item, viewGroup, false);
            viewD.getClass();
            c cVar = new c(viewD);
            cVar.f164555b.setOnClickListener(new h(20, this, cVar));
            return cVar;
        }
        if (i14 != 1) {
            View viewD2 = a0.d(viewGroup, R.layout.dsl_controls_menu_title_text, viewGroup, false);
            viewD2.getClass();
            return new th2.b(viewD2);
        }
        View viewD3 = a0.d(viewGroup, R.layout.dsl_controls_menu_unselected_item, viewGroup, false);
        viewD3.getClass();
        th2.d dVar = new th2.d(viewD3);
        dVar.f164558a.setOnClickListener(new h(21, this, dVar));
        return dVar;
    }

    @Override // com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.b.a
    public final void p(c cVar) {
        cVar.getClass();
        cVar.f164554a.setAlpha(1.0f);
        if (!this.f50624f) {
            int i14 = this.f50623e;
            uh2.a aVar = this.f50619a;
            if (i14 >= aVar.f171143e) {
                y0<ArrayList<sh2.a>> y0Var = aVar.f171140b;
                ArrayList<sh2.a> arrayListD = y0Var.d();
                if (arrayListD != null) {
                    y0Var.m(aVar.y4(arrayListD));
                    aVar.f171141c.m(aVar.x4());
                }
            } else {
                aVar.z4(this.f50622d, i14);
            }
        }
        this.f50622d = 0;
        this.f50623e = 0;
    }

    /* JADX INFO: renamed from: com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/unboundedcontrolsupport/presenter/a$a;", "", "<init>", "()V", "", "SECTION_TITLE_ITEM", "I", "SELECTED_CONTROLS_MENU_ITEM", "UNSELECTED_CONTROLS_MENU_ITEM", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1016a {
        public /* synthetic */ C1016a(j jVar) {
            this();
        }

        private C1016a() {
        }
    }
}
