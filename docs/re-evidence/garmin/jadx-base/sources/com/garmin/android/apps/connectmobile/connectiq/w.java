package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0006\u0018\u0019\u001a\u001b\u001c\u001dBu\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/android/apps/connectmobile/connectiq/y;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lsq0/b;", "Lcom/garmin/android/apps/connectmobile/connectiq/l;", "appType", "Lsq0/e;", "startDragListener", "Lkotlin/Function1;", "Lo10/b;", "", "onItemClicked", "Lcom/garmin/android/apps/connectmobile/connectiq/y$a;", "onItemAdded", "onItemRemoved", "Landroid/view/View$OnClickListener;", "onSectionButtonClicked", "Lkotlin/Function2;", "", "", "onItemMoved", "<init>", "(Lcom/garmin/android/apps/connectmobile/connectiq/l;Lsq0/e;Le23/l;Le23/l;Le23/l;Landroid/view/View$OnClickListener;Le23/p;)V", "b", JWKParameterNames.RSA_EXPONENT, "c", "d", "a", "f", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends androidx.recyclerview.widget.x<y, RecyclerView.f0> implements sq0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f32042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sq0.e f32043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<o10.b, Unit> f32044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<y.a, Unit> f32045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<y.a, Unit> f32046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f32047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e23.p<Integer, Integer, Boolean> f32048h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$b;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/connectiq/y;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.recyclerview.widget.o.f<y> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(y yVar, y yVar2) {
            y yVar3 = yVar;
            y yVar4 = yVar2;
            yVar3.getClass();
            yVar4.getClass();
            return yVar3.getF32108c() == yVar4.getF32108c();
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(y yVar, y yVar2) {
            y yVar3 = yVar;
            y yVar4 = yVar2;
            yVar3.getClass();
            yVar4.getClass();
            return yVar3.getF32107b() == yVar4.getF32107b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(l lVar, sq0.e eVar, e23.l<? super o10.b, Unit> lVar2, e23.l<? super y.a, Unit> lVar3, e23.l<? super y.a, Unit> lVar4, View.OnClickListener onClickListener, e23.p<? super Integer, ? super Integer, Boolean> pVar) {
        super(new b());
        lVar.getClass();
        eVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        onClickListener.getClass();
        pVar.getClass();
        this.f32042b = lVar;
        this.f32043c = eVar;
        this.f32044d = lVar2;
        this.f32045e = lVar3;
        this.f32046f = lVar4;
        this.f32047g = onClickListener;
        this.f32048h = pVar;
    }

    @Override // sq0.b
    public final int K0() {
        return 0;
    }

    @Override // sq0.b
    public final boolean f(int i14, int i15) {
        return this.f32048h.invoke(Integer.valueOf(i14), Integer.valueOf(i15)).booleanValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        y yVarR = r(i14);
        if (yVarR instanceof y.e) {
            return 0;
        }
        if (yVarR instanceof y.d) {
            return 1;
        }
        if (yVarR instanceof y.b) {
            return 2;
        }
        if (yVarR instanceof y.a) {
            return this.f32042b == l.WATCH_FACES ? 4 : 3;
        }
        if (yVarR instanceof y.c) {
            return 5;
        }
        lc.u0.r();
        return 0;
    }

    @Override // sq0.b
    public final void h8(int i14) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (f0Var instanceof e) {
            e eVar = (e) f0Var;
            TextView textView = eVar.f32071b;
            if (eVar.f32070a == 0) {
                y yVarR = r(i14);
                yVarR.getClass();
                textView.setText(((y.e) yVarR).f32106a);
                return;
            } else {
                y yVarR2 = r(i14);
                yVarR2.getClass();
                textView.setText(((y.d) yVarR2).f32103a);
                return;
            }
        }
        if (f0Var instanceof c) {
            y yVarR3 = r(i14);
            yVarR3.getClass();
            ((c) f0Var).f32064a.setText(((y.b) yVarR3).f32097a);
            return;
        }
        if (!(f0Var instanceof a)) {
            if (!(f0Var instanceof f)) {
                if (f0Var instanceof d) {
                    y yVarR4 = r(i14);
                    yVarR4.getClass();
                    d dVar = (d) f0Var;
                    dVar.f32067b.setText(dVar.itemView.getContext().getString(((y.c) yVarR4).f32100a));
                    dVar.itemView.setOnClickListener(new x(dVar, 0));
                    ImageView imageView = dVar.f32068c;
                    Context context = dVar.itemView.getContext();
                    context.getClass();
                    c22.c.a(imageView, context, R.dimen.icon_small, 1.0f, 1.8f);
                    return;
                }
                return;
            }
            y yVarR5 = r(i14);
            yVarR5.getClass();
            f fVar = (f) f0Var;
            o10.b bVar = ((y.a) yVarR5).f32092a;
            bVar.getClass();
            Context context2 = fVar.itemView.getContext();
            context2.getClass();
            zp0.c cVar = new zp0.c(context2);
            cVar.f206565e = bVar.getIconUrl();
            cVar.f206570j = 2131232265;
            cVar.h(fVar.f32074b);
            fVar.f32075c.setText(bVar.getName());
            fVar.f32076d.setVisibility(bVar.getUpdateAvailable() ? 0 : 8);
            fVar.itemView.setOnClickListener(new a61.d0(24, fVar, bVar));
            return;
        }
        y yVarR6 = r(i14);
        yVarR6.getClass();
        y.a aVar = (y.a) yVarR6;
        a aVar2 = (a) f0Var;
        ImageView imageView2 = aVar2.f32056g;
        TextView textView2 = aVar2.f32058i;
        TextView textView3 = aVar2.f32059j;
        ImageView imageView3 = aVar2.f32055f;
        View rootView = aVar2.itemView.getRootView();
        boolean z14 = rootView instanceof ConstraintLayout;
        if (z14) {
            if (aVar2.f32061l == null) {
                androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                aVar2.f32061l = dVar2;
                dVar2.f((ConstraintLayout) rootView);
            }
            androidx.constraintlayout.widget.d dVar3 = aVar2.f32061l;
            if (dVar3 != null) {
                dVar3.b((ConstraintLayout) rootView);
            }
        }
        aVar2.f32060k = aVar;
        o10.b bVar2 = aVar.f32092a;
        Context context3 = aVar2.itemView.getContext();
        context3.getClass();
        zp0.c cVar2 = new zp0.c(context3);
        cVar2.f206565e = bVar2.getIconUrl();
        cVar2.f206570j = 2131232265;
        cVar2.h(aVar2.f32057h);
        textView2.setText(bVar2.getName());
        textView3.setVisibility(bVar2.getUpdateAvailable() ? 0 : 8);
        aVar2.itemView.setOnClickListener(new u(aVar, aVar2));
        aVar2.itemView.setOnLongClickListener(new v(0));
        switch (a.b.f32062a[aVar.f32093b.ordinal()]) {
            case 1:
                imageView3.setVisibility(8);
                imageView2.setVisibility(8);
                break;
            case 2:
                imageView2.setVisibility(0);
                imageView2.setOnTouchListener(new b00.d(1, aVar2, aVar));
                imageView3.setVisibility(8);
                break;
            case 3:
                imageView2.setVisibility(8);
                imageView3.setVisibility(0);
                imageView3.setImageResource(R.drawable.ic_remove_red);
                imageView3.setContentDescription(aVar2.itemView.getContext().getString(R.string.lbl_remove));
                imageView3.setOnClickListener(new u(aVar2, aVar, 1));
                break;
            case 4:
                imageView2.setVisibility(0);
                imageView2.setOnTouchListener(new b00.d(1, aVar2, aVar));
                imageView3.setVisibility(0);
                imageView3.setImageResource(R.drawable.ic_remove_red);
                imageView3.setContentDescription(aVar2.itemView.getContext().getString(R.string.lbl_remove));
                imageView3.setOnClickListener(new u(aVar2, aVar, 2));
                break;
            case 5:
                imageView2.setVisibility(8);
                imageView3.setVisibility(0);
                imageView3.setImageResource(R.drawable.ic_add_round);
                imageView3.setContentDescription(aVar2.itemView.getContext().getString(R.string.lbl_add));
                imageView3.setOnClickListener(new u(aVar2, aVar, 3));
                break;
            case 6:
                imageView2.setVisibility(0);
                imageView2.setOnTouchListener(new b00.d(1, aVar2, aVar));
                imageView3.setVisibility(0);
                imageView3.setImageResource(R.drawable.ic_add_round);
                imageView3.setContentDescription(aVar2.itemView.getContext().getString(R.string.lbl_add));
                imageView3.setOnClickListener(new u(aVar2, aVar, 4));
                break;
            default:
                lc.u0.r();
                return;
        }
        Context context4 = aVar2.itemView.getContext();
        context4.getClass();
        if (c22.b.a(context4) >= 1.5f && z14 && v22.e.d(textView3)) {
            androidx.constraintlayout.widget.d dVar4 = new androidx.constraintlayout.widget.d();
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            dVar4.f(constraintLayout);
            dVar4.e(textView2.getId(), 4);
            dVar4.e(textView3.getId(), 7);
            dVar4.e(textView3.getId(), 3);
            dVar4.e(imageView2.getId(), 6);
            dVar4.h(textView2.getId(), 7, imageView2.getId(), 6);
            dVar4.h(textView3.getId(), 6, textView2.getId(), 6);
            dVar4.h(textView3.getId(), 3, textView2.getId(), 4);
            dVar4.b(constraintLayout);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 0) {
            e.f32069c.getClass();
            return e.a.a(viewGroup, 0);
        }
        if (i14 == 1) {
            e.f32069c.getClass();
            return e.a.a(viewGroup, 1);
        }
        if (i14 == 2) {
            c.f32063b.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_text_caption, viewGroup, false);
            viewInflate.getClass();
            return new c(viewInflate);
        }
        e23.l<o10.b, Unit> lVar = this.f32044d;
        if (i14 == 3) {
            a.C0521a c0521a = a.f32049m;
            ch1.f fVar = new ch1.f(this);
            c0521a.getClass();
            sq0.e eVar = this.f32043c;
            eVar.getClass();
            lVar.getClass();
            e23.l<y.a, Unit> lVar2 = this.f32045e;
            lVar2.getClass();
            e23.l<y.a, Unit> lVar3 = this.f32046f;
            lVar3.getClass();
            View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_connect_iq_list_item_downloaded_app, viewGroup, false);
            viewInflate2.getClass();
            return new a(viewInflate2, eVar, lVar, lVar2, lVar3, fVar);
        }
        if (i14 == 4) {
            f.f32072e.getClass();
            lVar.getClass();
            View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_connect_iq_list_item_downloaded_watchface, viewGroup, false);
            viewInflate3.getClass();
            return new f(viewInflate3, lVar);
        }
        if (i14 != 5) {
            throw new ClassCastException(am.j.h(i14, "Unknown viewType "));
        }
        d.f32065d.getClass();
        View.OnClickListener onClickListener = this.f32047g;
        onClickListener.getClass();
        View viewInflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_connect_iq_button_section, viewGroup, false);
        viewInflate4.getClass();
        return new d(viewInflate4, onClickListener);
    }

    @Override // sq0.b
    public final int z1() {
        return 0;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lsq0/c;", "Landroid/view/View;", "view", "Lsq0/e;", "startDragListener", "Lkotlin/Function1;", "Lo10/b;", "", "onItemClicked", "Lcom/garmin/android/apps/connectmobile/connectiq/y$a;", "onItemAdded", "onItemRemoved", "updateDragItem", "<init>", "(Landroid/view/View;Lsq0/e;Le23/l;Le23/l;Le23/l;Le23/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 implements sq0.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final C0521a f32049m = new C0521a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sq0.e f32050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.l<o10.b, Unit> f32051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.l<y.a, Unit> f32052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.l<y.a, Unit> f32053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.l<y.a, Unit> f32054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f32055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ImageView f32056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ImageView f32057h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TextView f32058i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TextView f32059j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public y.a f32060k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f32061l;

        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32062a;

            static {
                int[] iArr = new int[com.garmin.android.apps.connectmobile.connectiq.b.values().length];
                try {
                    iArr[com.garmin.android.apps.connectmobile.connectiq.b.NO_ACTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.connectiq.b.REORDERABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.connectiq.b.ADDED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.connectiq.b.ADDED_REORDERABLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.connectiq.b.NOT_ADDED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.connectiq.b.NOT_ADDED_REORDERABLE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f32062a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(View view2, sq0.e eVar, e23.l<? super o10.b, Unit> lVar, e23.l<? super y.a, Unit> lVar2, e23.l<? super y.a, Unit> lVar3, e23.l<? super y.a, Unit> lVar4) {
            super(view2);
            view2.getClass();
            eVar.getClass();
            lVar.getClass();
            lVar2.getClass();
            lVar3.getClass();
            lVar4.getClass();
            this.f32050a = eVar;
            this.f32051b = lVar;
            this.f32052c = lVar2;
            this.f32053d = lVar3;
            this.f32054e = lVar4;
            View viewFindViewById = view2.findViewById(R.id.add_or_remove);
            viewFindViewById.getClass();
            ImageView imageView = (ImageView) viewFindViewById;
            this.f32055f = imageView;
            View viewFindViewById2 = view2.findViewById(R.id.drag_handle);
            viewFindViewById2.getClass();
            ImageView imageView2 = (ImageView) viewFindViewById2;
            this.f32056g = imageView2;
            View viewFindViewById3 = view2.findViewById(R.id.icon);
            viewFindViewById3.getClass();
            ImageView imageView3 = (ImageView) viewFindViewById3;
            this.f32057h = imageView3;
            View viewFindViewById4 = view2.findViewById(R.id.name);
            viewFindViewById4.getClass();
            this.f32058i = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.updated);
            viewFindViewById5.getClass();
            this.f32059j = (TextView) viewFindViewById5;
            androidx.core.view.s0.r(imageView2, new v22.f());
            Context context = view2.getContext();
            context.getClass();
            if (c22.b.a(context) >= 1.5f) {
                Context context2 = view2.getContext();
                context2.getClass();
                Resources resources = view2.getContext().getResources();
                resources.getClass();
                int iC = (int) c22.b.c(context2, xy2.b.n(resources, 40.0f), 1.5f);
                imageView3.getLayoutParams().height = iC;
                imageView3.getLayoutParams().width = iC;
                imageView.getLayoutParams().height = iC;
                imageView.getLayoutParams().width = iC;
                Context context3 = view2.getContext();
                context3.getClass();
                Resources resources2 = view2.getContext().getResources();
                resources2.getClass();
                int iC2 = (int) c22.b.c(context3, xy2.b.n(resources2, 20.0f), 1.5f);
                imageView2.getLayoutParams().width = iC2;
                imageView2.getLayoutParams().height = iC2;
            }
        }

        @Override // sq0.c
        public final void a() {
            this.itemView.animate().alpha(0.4f);
        }

        @Override // sq0.c
        public final void c() {
            this.itemView.animate().alpha(1.0f);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connectiq.w$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$a$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0521a {
            public /* synthetic */ C0521a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C0521a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f32063b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f32064a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.item_text_view);
            viewFindViewById.getClass();
            this.f32064a = (TextView) viewFindViewById;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$c$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "Landroid/view/View$OnClickListener;", "onSectionButtonClicked", "<init>", "(Landroid/view/View;Landroid/view/View$OnClickListener;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f32065d = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View.OnClickListener f32066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f32067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f32068c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view2, View.OnClickListener onClickListener) {
            super(view2);
            view2.getClass();
            onClickListener.getClass();
            this.f32066a = onClickListener;
            View viewFindViewById = view2.findViewById(R.id.tv_message);
            viewFindViewById.getClass();
            this.f32067b = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.iv_exit_to_app_ion);
            viewFindViewById2.getClass();
            this.f32068c = (ImageView) viewFindViewById2;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$d$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "", "sectionViewType", "<init>", "(Landroid/view/View;I)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f32069c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f32071b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view2, int i14) {
            super(view2);
            view2.getClass();
            this.f32070a = i14;
            View viewFindViewById = view2.findViewById(R.id.header_item_text_view);
            viewFindViewById.getClass();
            this.f32071b = (TextView) viewFindViewById;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$e$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static e a(ViewGroup viewGroup, int i14) {
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i14 == 0 ? R.layout.connect_iq_activities_list_header : R.layout.item_header_overline, viewGroup, false);
                viewInflate.getClass();
                return new e(viewInflate, i14);
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$f;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lo10/b;", "", "onItemClicked", "<init>", "(Landroid/view/View;Le23/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends RecyclerView.f0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f32072e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.l<o10.b, Unit> f32073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f32074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f32075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f32076d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(View view2, e23.l<? super o10.b, Unit> lVar) {
            super(view2);
            view2.getClass();
            lVar.getClass();
            this.f32073a = lVar;
            View viewFindViewById = view2.findViewById(R.id.icon);
            viewFindViewById.getClass();
            this.f32074b = (ImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.name);
            viewFindViewById2.getClass();
            this.f32075c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.updated);
            viewFindViewById3.getClass();
            this.f32076d = (TextView) viewFindViewById3;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/w$f$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }
}
