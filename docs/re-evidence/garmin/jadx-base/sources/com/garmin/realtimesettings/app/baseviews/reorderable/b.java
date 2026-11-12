package com.garmin.realtimesettings.app.baseviews.reorderable;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.s0;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.garmin.android.apps.connectmobile.R;
import cx2.e;
import cx2.f;
import gw2.h;
import i3.e5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import wv2.d;
import wv2.g;
import wv2.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB9\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/realtimesettings/app/baseviews/reorderable/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lwv2/d;", "Lcom/garmin/realtimesettings/app/baseviews/reorderable/a$a;", "", "Lwv2/a;", "list", "Lgw2/h;", "actionType", "Lwv2/g;", "actionListener", "Landroidx/recyclerview/widget/s;", "itemTouchHelper", "<init>", "(Ljava/util/List;Lgw2/h;Lwv2/g;Landroidx/recyclerview/widget/s;)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends RecyclerView.h<d> implements com.garmin.realtimesettings.app.baseviews.reorderable.a.InterfaceC1125a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f52547j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<wv2.a> f52548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f52549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f52550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f52551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cx2.h f52552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f52553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f52554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public wv2.a f52555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NestedScrollView f52556i;

    /* JADX INFO: renamed from: com.garmin.realtimesettings.app.baseviews.reorderable.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1126b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52557a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52557a = iArr;
        }
    }

    static {
        new a(null);
    }

    public b(List<wv2.a> list, h hVar, g gVar, s sVar) {
        list.getClass();
        hVar.getClass();
        this.f52548a = list;
        this.f52549b = hVar;
        this.f52550c = gVar;
        this.f52551d = sVar;
        this.f52552e = new cx2.h("ReorderableListAdapter", null, 2, null);
        this.f52553f = new Handler(Looper.getMainLooper());
    }

    @Override // com.garmin.realtimesettings.app.baseviews.reorderable.a.InterfaceC1125a
    public final void b(int i14, int i15) {
        for (wv2.a aVar : this.f52548a) {
            int i16 = aVar.f187461a;
            if (i16 == i14) {
                aVar.f187461a = i15;
            } else if (i16 == i15) {
                aVar.f187461a = i14;
            }
        }
        notifyItemMoved(i14, i15);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f52548a.size();
    }

    @Override // com.garmin.realtimesettings.app.baseviews.reorderable.a.InterfaceC1125a
    public final void l(d dVar) {
        dVar.getClass();
        dVar.itemView.setAlpha(1.0f);
        wv2.a aVar = this.f52555h;
        if (aVar != null) {
            g gVar = this.f52550c;
            if (gVar != null) {
                gVar.f(aVar.f187464d.f192281a, aVar.f187461a);
            }
            this.f52555h = null;
        }
        try {
            j jVar = this.f52554g;
            if (jVar != null) {
                this.f52553f.removeCallbacks(jVar);
            }
        } catch (Exception unused) {
            this.f52552e.getClass();
        }
    }

    @Override // com.garmin.realtimesettings.app.baseviews.reorderable.a.InterfaceC1125a
    public final void o(d dVar) {
        dVar.getClass();
        View view2 = dVar.itemView;
        view2.getClass();
        j jVar = new j(view2, this);
        this.f52554g = jVar;
        this.f52553f.post(jVar);
        for (Object obj : this.f52548a) {
            if (((wv2.a) obj).f187461a == dVar.getAbsoluteAdapterPosition()) {
                this.f52555h = (wv2.a) obj;
                dVar.itemView.setAlpha(0.5f);
            }
        }
        obj = null;
        this.f52555h = (wv2.a) obj;
        dVar.itemView.setAlpha(0.5f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, final int i14) {
        Object next;
        final d dVar = (d) f0Var;
        dVar.getClass();
        AppCompatImageView appCompatImageView = dVar.f187472b;
        AppCompatImageView appCompatImageView2 = dVar.f187474d;
        AppCompatImageView appCompatImageView3 = dVar.f187476f;
        AppCompatImageView appCompatImageView4 = dVar.f187475e;
        TextView textView = dVar.f187473c;
        AppCompatImageView appCompatImageView5 = dVar.f187471a;
        List<wv2.a> list = this.f52548a;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((wv2.a) next).f187461a != i14);
        wv2.a aVar = (wv2.a) next;
        textView.setText(aVar != null ? aVar.f187462b : null);
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        if (p005kotlin.jvm.internal.s.g(com.garmin.realtimesettings.app.initialization.b.f52598j, Boolean.TRUE)) {
            appCompatImageView4.setVisibility(0);
            appCompatImageView3.setVisibility(0);
        }
        int i15 = C1126b.f52557a[this.f52549b.ordinal()];
        if (i15 == 1) {
            appCompatImageView5.setImageResource(2131233296);
            appCompatImageView5.setVisibility(0);
            appCompatImageView5.setContentDescription(dVar.itemView.getContext().getString(R.string.rts_lbl_add_to_device, textView.getText()));
        } else if (i15 != 2) {
            appCompatImageView5.setVisibility(4);
        } else {
            appCompatImageView5.setImageResource(2131233300);
            appCompatImageView5.setVisibility(0);
            appCompatImageView5.setContentDescription(dVar.itemView.getContext().getString(R.string.rts_lbl_remove_from_device, textView.getText()));
        }
        String str = aVar != null ? aVar.f187464d.f192282b : null;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 1053567612) {
                if (iHashCode != 1184726098) {
                    if (iHashCode == 2130809258 && str.equals("HIDDEN")) {
                        dVar.itemView.setVisibility(8);
                    }
                } else if (str.equals("VISIBLE")) {
                    dVar.itemView.setVisibility(0);
                    d.d(appCompatImageView5, true);
                    d.d(appCompatImageView, true);
                    d.d(textView, true);
                    d.d(appCompatImageView2, true);
                    if (aVar.f187465e) {
                        appCompatImageView5.setAlpha(1.0f);
                    } else {
                        appCompatImageView5.setAlpha(0.5f);
                    }
                }
            } else if (str.equals("DISABLED")) {
                dVar.itemView.setVisibility(0);
                d.d(appCompatImageView5, false);
                d.d(appCompatImageView, false);
                d.d(textView, false);
                d.d(appCompatImageView2, false);
            }
        }
        cx2.g.f(appCompatImageView, aVar != null ? aVar.f187463c : null, com.garmin.realtimesettings.app.initialization.b.f52593e, 4);
        appCompatImageView5.setOnClickListener(new wv2.h(0, aVar, this));
        appCompatImageView2.setOnTouchListener(new b00.d(2, this, dVar));
        s0.r(appCompatImageView2, new cx2.d());
        final int i16 = 0;
        appCompatImageView4.setOnTouchListener(new View.OnTouchListener(this) { // from class: wv2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.realtimesettings.app.baseviews.reorderable.b f187488b;

            {
                this.f187488b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i17 = i16;
                d dVar2 = dVar;
                int i18 = i14;
                com.garmin.realtimesettings.app.baseviews.reorderable.b bVar = this.f187488b;
                switch (i17) {
                    case 0:
                        int i19 = com.garmin.realtimesettings.app.baseviews.reorderable.b.f52547j;
                        view2.getClass();
                        motionEvent.getClass();
                        if (motionEvent.getActionMasked() == 0) {
                            bVar.r(i18, i18 - 1, dVar2.getAbsoluteAdapterPosition());
                        }
                        break;
                    default:
                        int i24 = com.garmin.realtimesettings.app.baseviews.reorderable.b.f52547j;
                        view2.getClass();
                        motionEvent.getClass();
                        if (motionEvent.getActionMasked() == 0) {
                            bVar.r(i18, i18 + 1, dVar2.getAbsoluteAdapterPosition());
                        }
                        break;
                }
                return true;
            }
        });
        final int i17 = 1;
        appCompatImageView3.setOnTouchListener(new View.OnTouchListener(this) { // from class: wv2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.realtimesettings.app.baseviews.reorderable.b f187488b;

            {
                this.f187488b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i18 = i17;
                d dVar2 = dVar;
                int i19 = i14;
                com.garmin.realtimesettings.app.baseviews.reorderable.b bVar = this.f187488b;
                switch (i18) {
                    case 0:
                        int i110 = com.garmin.realtimesettings.app.baseviews.reorderable.b.f52547j;
                        view2.getClass();
                        motionEvent.getClass();
                        if (motionEvent.getActionMasked() == 0) {
                            bVar.r(i19, i19 - 1, dVar2.getAbsoluteAdapterPosition());
                        }
                        break;
                    default:
                        int i24 = com.garmin.realtimesettings.app.baseviews.reorderable.b.f52547j;
                        view2.getClass();
                        motionEvent.getClass();
                        if (motionEvent.getActionMasked() == 0) {
                            bVar.r(i19, i19 + 1, dVar2.getAbsoluteAdapterPosition());
                        }
                        break;
                }
                return true;
            }
        });
        if (i14 == 0) {
            d.d(appCompatImageView4, false);
            String string = textView.getText().toString();
            string.getClass();
            s0.r(appCompatImageView4, new f(true, null, string));
        } else {
            wv2.a aVar2 = list.get(i14 - 1);
            String string2 = textView.getText().toString();
            String str2 = aVar2.f187462b;
            string2.getClass();
            s0.r(appCompatImageView4, new f(false, str2, string2));
        }
        if (i14 == list.size() - 1) {
            d.d(appCompatImageView3, false);
            String string3 = textView.getText().toString();
            string3.getClass();
            s0.r(appCompatImageView3, new e(true, null, string3));
            return;
        }
        wv2.a aVar3 = list.get(i14 + 1);
        String string4 = textView.getText().toString();
        String str3 = aVar3.f187462b;
        string4.getClass();
        s0.r(appCompatImageView3, new e(false, str3, string4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.rts_reorderable_item_view, viewGroup, false);
        viewE.getClass();
        return new d(viewE);
    }

    public final void r(int i14, int i15, int i16) {
        Object next;
        List<wv2.a> list = this.f52548a;
        Collections.swap(list, i14, i15);
        notifyItemMoved(i14, i15);
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((wv2.a) next).f187461a != i16);
        wv2.a aVar = (wv2.a) next;
        this.f52555h = aVar;
        if (aVar != null) {
            g gVar = this.f52550c;
            if (gVar != null) {
                gVar.f(aVar.f187464d.f192281a, i15);
            }
            this.f52555h = null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/realtimesettings/app/baseviews/reorderable/b$a;", "", "<init>", "()V", "", "SCROLL_SPEED", "I", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public b() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ b(List list, h hVar, g gVar, s sVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new ArrayList() : list, (i14 & 2) != 0 ? h.NONE : hVar, (i14 & 4) != 0 ? null : gVar, (i14 & 8) != 0 ? null : sVar);
    }
}
