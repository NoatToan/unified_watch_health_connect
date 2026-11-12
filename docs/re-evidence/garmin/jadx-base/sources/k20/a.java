package k20;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import d53.y;
import f20.d0;
import java.util.ArrayList;
import l20.p;
import n23.j;
import o13.m;
import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lk20/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lk20/a$c;", "emergencyContactActionListener", "Lk20/a$b;", "contactItemClickListener", "<init>", "(Lk20/a$c;Lk20/a$b;)V", "c", "b", "a", JWKParameterNames.RSA_EXPONENT, "f", "d", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f102407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f102408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f102409c;

    public interface b {
        void I(d0.b bVar);

        void e5(d0.b bVar);

        void j3(d0.b bVar);
    }

    public interface c {
        void F4();

        void V4();

        void h2();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk20/a$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lk20/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f102410d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f102411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f102412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f102413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f102413c = aVar;
            View viewFindViewById = view2.findViewById(R.id.left_option_label);
            viewFindViewById.getClass();
            this.f102411a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.right_image);
            viewFindViewById2.getClass();
            this.f102412b = (ImageView) viewFindViewById2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk20/a$e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lk20/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class e extends RecyclerView.f0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f102414f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f102415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UserLevelImageView f102416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Button f102417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t f102418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a f102419e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f102419e = aVar;
            this.f102415a = (TextView) view2.findViewById(R.id.contact_details_name);
            this.f102416b = (UserLevelImageView) view2.findViewById(R.id.contact_details_image);
            this.f102417c = (Button) view2.findViewById(R.id.contact_details_view_profile_button);
            this.f102418d = m.b(new g20.e(view2, 2));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk20/a$f;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lk20/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class f extends RecyclerView.f0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f102420h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f102421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f102422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f102423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f102424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f102425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f102426f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ a f102427g;

        /* JADX INFO: renamed from: k20.a$f$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1963a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102428a;

            static {
                int[] iArr = new int[j20.b.values().length];
                try {
                    iArr[j20.b.CONFIRMED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j20.b.UNCONFIRMED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f102428a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f102427g = aVar;
            this.f102421a = (ConstraintLayout) view2.findViewById(R.id.contact_view);
            this.f102422b = (TextView) view2.findViewById(R.id.contact_info_label);
            this.f102423c = (TextView) view2.findViewById(R.id.contact_info_value);
            this.f102424d = (TextView) view2.findViewById(R.id.contact_warning_label);
            this.f102425e = view2.findViewById(R.id.contact_info_warning);
            this.f102426f = (TextView) view2.findViewById(R.id.contact_details_label);
        }
    }

    static {
        new C1962a(null);
    }

    public a(c cVar, b bVar) {
        this.f102407a = cVar;
        this.f102408b = bVar;
        this.f102409c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f102409c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        com.garmin.android.apps.connectmobile.contacts.a aVar = (com.garmin.android.apps.connectmobile.contacts.a) this.f102409c.get(i14);
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.d) {
            return 0;
        }
        if (aVar instanceof d0.b) {
            return 1;
        }
        if (aVar instanceof d0.a) {
            return 2;
        }
        return aVar instanceof d0.c ? 3 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String string;
        String string2;
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        boolean z14 = f0Var instanceof e;
        ArrayList arrayList = this.f102409c;
        if (z14) {
            e eVar = (e) f0Var;
            Object obj = arrayList.get(i14);
            obj.getClass();
            com.garmin.android.apps.connectmobile.contacts.a.d dVar = (com.garmin.android.apps.connectmobile.contacts.a.d) obj;
            String string3 = eVar.itemView.getContext().getString(R.string.string_space_string_pattern, dVar.f32348a, dVar.f32349b);
            string3.getClass();
            String string4 = w.i0(string3).toString();
            TextView textView = eVar.f102415a;
            textView.setText(string4);
            eVar.f102416b.setProfileImageData(new b12.b(dVar.f32350c, null, null, y.q0(string4), null, 22, null));
            Button button = eVar.f102417c;
            button.setVisibility(0);
            button.setText(eVar.itemView.getContext().getString(R.string.edit_contact_details));
            final a aVar = eVar.f102419e;
            final int i15 = 2;
            button.setOnClickListener(new View.OnClickListener(aVar) { // from class: k20.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f102430b;

                {
                    this.f102430b = aVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i16 = i15;
                    a aVar2 = this.f102430b;
                    switch (i16) {
                        case 0:
                            int i17 = a.d.f102410d;
                            a.c cVar = aVar2.f102407a;
                            if (cVar != null) {
                                cVar.F4();
                            }
                            break;
                        case 1:
                            int i18 = a.d.f102410d;
                            a.c cVar2 = aVar2.f102407a;
                            if (cVar2 != null) {
                                cVar2.h2();
                            }
                            break;
                        default:
                            int i19 = a.e.f102414f;
                            a.c cVar3 = aVar2.f102407a;
                            if (cVar3 != null) {
                                cVar3.V4();
                            }
                            break;
                    }
                }
            });
            Integer num = dVar.f32352e;
            if (num == null) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, num.intValue(), 0);
                textView.setCompoundDrawablePadding(((Number) eVar.f102418d.getValue()).intValue());
                return;
            }
        }
        if (!(f0Var instanceof f)) {
            if (f0Var instanceof d) {
                d dVar2 = (d) f0Var;
                Object obj2 = arrayList.get(i14);
                obj2.getClass();
                d0 d0Var = (d0) obj2;
                final a aVar2 = dVar2.f102413c;
                TextView textView2 = dVar2.f102411a;
                if (d0Var instanceof d0.a) {
                    textView2.setText(dVar2.itemView.getContext().getString(R.string.choose_another_contact_method));
                    final int i16 = 0;
                    dVar2.itemView.setOnClickListener(new View.OnClickListener(aVar2) { // from class: k20.b

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ a f102430b;

                        {
                            this.f102430b = aVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i17 = i16;
                            a aVar3 = this.f102430b;
                            switch (i17) {
                                case 0:
                                    int i18 = a.d.f102410d;
                                    a.c cVar = aVar3.f102407a;
                                    if (cVar != null) {
                                        cVar.F4();
                                    }
                                    break;
                                case 1:
                                    int i19 = a.d.f102410d;
                                    a.c cVar2 = aVar3.f102407a;
                                    if (cVar2 != null) {
                                        cVar2.h2();
                                    }
                                    break;
                                default:
                                    int i110 = a.e.f102414f;
                                    a.c cVar3 = aVar3.f102407a;
                                    if (cVar3 != null) {
                                        cVar3.V4();
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                } else {
                    if (d0Var instanceof d0.c) {
                        textView2.setText(dVar2.itemView.getContext().getString(R.string.remove_assistance_contact));
                        textView2.setTextColor(dVar2.itemView.getContext().getColor(R.color.gcm_text_danger_action));
                        v22.e.j(dVar2.f102412b);
                        final int i17 = 1;
                        dVar2.itemView.setOnClickListener(new View.OnClickListener(aVar2) { // from class: k20.b

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ a f102430b;

                            {
                                this.f102430b = aVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i18 = i17;
                                a aVar3 = this.f102430b;
                                switch (i18) {
                                    case 0:
                                        int i19 = a.d.f102410d;
                                        a.c cVar = aVar3.f102407a;
                                        if (cVar != null) {
                                            cVar.F4();
                                        }
                                        break;
                                    case 1:
                                        int i110 = a.d.f102410d;
                                        a.c cVar2 = aVar3.f102407a;
                                        if (cVar2 != null) {
                                            cVar2.h2();
                                        }
                                        break;
                                    default:
                                        int i111 = a.e.f102414f;
                                        a.c cVar3 = aVar3.f102407a;
                                        if (cVar3 != null) {
                                            cVar3.V4();
                                        }
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    i2.f36769a.getClass();
                    i2.a.f(a2.SAFETY_FEATURES, "EmergencyContactDetailsAdapter", "[EmergencyContactActionViewHolder] bind: " + d0Var + " is not handled");
                    return;
                }
            }
            return;
        }
        f fVar = (f) f0Var;
        Object obj3 = arrayList.get(i14);
        obj3.getClass();
        d0 d0Var2 = (d0) obj3;
        ConstraintLayout constraintLayout = fVar.f102421a;
        TextView textView3 = fVar.f102422b;
        View view2 = fVar.f102425e;
        final a aVar3 = fVar.f102427g;
        TextView textView4 = fVar.f102424d;
        textView4.getClass();
        textView4.setVisibility(8);
        Context context = fVar.itemView.getContext();
        context.getClass();
        if (c22.b.e(context)) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Context context2 = fVar.itemView.getContext();
            context2.getClass();
            Resources resources = fVar.itemView.getResources();
            resources.getClass();
            layoutParams.width = (int) c22.b.c(context2, xy2.b.n(resources, 16.0f), 1.5f);
        }
        if (!(d0Var2 instanceof d0.b)) {
            i2.f36769a.getClass();
            i2.a.f(a2.SAFETY_FEATURES, "EmergencyContactDetailsAdapter", "[EmergencyContactInfoViewHolder] bind: " + d0Var2 + " is not handled");
            return;
        }
        final d0.b bVar = (d0.b) d0Var2;
        Integer num2 = bVar.f68374g;
        j20.b bVar2 = bVar.f68376i;
        l20.d dVar3 = bVar.f68370c;
        if (bVar.f68377j) {
            if (bVar2 != null) {
                string2 = fVar.itemView.getContext().getString(bVar2.f96553a);
            } else {
                string2 = null;
            }
            textView3.setText(string2);
            textView3.setVisibility(0);
        }
        TextView textView5 = fVar.f102423c;
        boolean z15 = dVar3 instanceof p;
        String strV = bVar.f68369b;
        if (z15) {
            Context context3 = fVar.itemView.getContext();
            context3.getClass();
            strV = jg.b.v(context3, strV);
        }
        textView5.setText(strV);
        TextView textView6 = fVar.f102426f;
        View view3 = fVar.itemView;
        if (num2 != null) {
            String string5 = view3.getContext().getString(R.string.string_space_bullet_string_pattern, fVar.itemView.getContext().getString(dVar3.getF109041b()), fVar.itemView.getContext().getString(num2.intValue()));
            string5.getClass();
            string = w.i0(string5).toString();
        } else {
            string = view3.getContext().getString(dVar3.getF109041b());
        }
        textView6.setText(string);
        view2.getClass();
        view2.setVisibility(bVar.f68371d ? 0 : 8);
        int i18 = bVar2 == null ? -1 : f.C1963a.f102428a[bVar2.ordinal()];
        if (i18 == 1) {
            final int i19 = 0;
            constraintLayout.setOnClickListener(new View.OnClickListener(aVar3) { // from class: k20.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f102432b;

                {
                    this.f102432b = aVar3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    int i24 = i19;
                    d0.b bVar3 = bVar;
                    a aVar4 = this.f102432b;
                    switch (i24) {
                        case 0:
                            int i25 = a.f.f102420h;
                            a.b bVar4 = aVar4.f102408b;
                            if (bVar4 != null) {
                                bVar4.I(bVar3);
                            }
                            break;
                        case 1:
                            int i26 = a.f.f102420h;
                            a.b bVar5 = aVar4.f102408b;
                            if (bVar5 != null) {
                                bVar5.j3(bVar3);
                            }
                            break;
                        default:
                            int i27 = a.f.f102420h;
                            a.b bVar6 = aVar4.f102408b;
                            if (bVar6 != null) {
                                bVar6.e5(bVar3);
                            }
                            break;
                    }
                }
            });
        } else if (i18 == 2) {
            final int i24 = 1;
            constraintLayout.setOnClickListener(new View.OnClickListener(aVar3) { // from class: k20.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f102432b;

                {
                    this.f102432b = aVar3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    int i25 = i24;
                    d0.b bVar3 = bVar;
                    a aVar4 = this.f102432b;
                    switch (i25) {
                        case 0:
                            int i26 = a.f.f102420h;
                            a.b bVar4 = aVar4.f102408b;
                            if (bVar4 != null) {
                                bVar4.I(bVar3);
                            }
                            break;
                        case 1:
                            int i27 = a.f.f102420h;
                            a.b bVar5 = aVar4.f102408b;
                            if (bVar5 != null) {
                                bVar5.j3(bVar3);
                            }
                            break;
                        default:
                            int i28 = a.f.f102420h;
                            a.b bVar6 = aVar4.f102408b;
                            if (bVar6 != null) {
                                bVar6.e5(bVar3);
                            }
                            break;
                    }
                }
            });
        } else {
            final int i25 = 2;
            constraintLayout.setOnClickListener(new View.OnClickListener(aVar3) { // from class: k20.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f102432b;

                {
                    this.f102432b = aVar3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    int i26 = i25;
                    d0.b bVar3 = bVar;
                    a aVar4 = this.f102432b;
                    switch (i26) {
                        case 0:
                            int i27 = a.f.f102420h;
                            a.b bVar4 = aVar4.f102408b;
                            if (bVar4 != null) {
                                bVar4.I(bVar3);
                            }
                            break;
                        case 1:
                            int i28 = a.f.f102420h;
                            a.b bVar5 = aVar4.f102408b;
                            if (bVar5 != null) {
                                bVar5.j3(bVar3);
                            }
                            break;
                        default:
                            int i29 = a.f.f102420h;
                            a.b bVar6 = aVar4.f102408b;
                            if (bVar6 != null) {
                                bVar6.e5(bVar3);
                            }
                            break;
                    }
                }
            });
            textView4.setVisibility(bVar.f68373f ? 0 : 8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 0) {
            return new e(this, j.b(viewGroup, R.layout.gcm4_contact_info_header_item, viewGroup, false));
        }
        if (i14 != 1) {
            return (i14 == 2 || i14 == 3) ? new d(this, j.b(viewGroup, R.layout.btn_contact_action, viewGroup, false)) : new e(this, j.b(viewGroup, R.layout.gcm4_contact_info_header_item, viewGroup, false));
        }
        return new f(this, j.b(viewGroup, R.layout.gcm4_emergency_contact_info_list_item, viewGroup, false));
    }

    /* JADX INFO: renamed from: k20.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lk20/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "ITEM_TYPE_INVALID", "I", "ITEM_TYPE_HEADER", "ITEM_TYPE_CONTACT_METHOD", "ITEM_TYPE_CHOOSE_CONTACT_METHOD", "ITEM_TYPE_REMOVE_EMERGENCY_CONTACT", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1962a {
        public /* synthetic */ C1962a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1962a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(c cVar, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? null : bVar);
    }
}
