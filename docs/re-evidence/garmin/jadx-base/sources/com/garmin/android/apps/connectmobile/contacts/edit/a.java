package com.garmin.android.apps.connectmobile.contacts.edit;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSingleLineEditTextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.y;
import e23.l;
import go1.g0;
import hx0.k;
import i20.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/contacts/edit/a$f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/edit/a$f;)V", "f", "c", "d", JWKParameterNames.RSA_EXPONENT, "b", "a", "g", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f32524f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f32525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f32526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32529e;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.edit.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/edit/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C0530a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexOneLineButton f32530a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0530a(a aVar, View view2) {
            super(view2);
            view2.getClass();
            GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) view2.findViewById(R.id.add_contact_info_btn);
            this.f32530a = gCMComplexOneLineButton;
            gCMComplexOneLineButton.b();
            gCMComplexOneLineButton.setButtonLeftLabel(view2.getContext().getString(R.string.contact_management_add_email));
            gCMComplexOneLineButton.setFocusableInTouchMode(true);
            gCMComplexOneLineButton.setOnClickListener(new k(5, this, aVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/edit/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexOneLineButton f32531a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, View view2) {
            super(view2);
            view2.getClass();
            GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) view2.findViewById(R.id.add_contact_info_btn);
            this.f32531a = gCMComplexOneLineButton;
            gCMComplexOneLineButton.b();
            gCMComplexOneLineButton.setButtonLeftLabel(view2.getContext().getString(R.string.contact_management_label_add_phone));
            gCMComplexOneLineButton.setFocusableInTouchMode(true);
            gCMComplexOneLineButton.setOnClickListener(new k(6, this, aVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/a$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/edit/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f32532e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMSingleLineEditTextView f32533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GCMSingleLineEditTextView f32534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UserLevelImageView f32535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f32536d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f32536d = aVar;
            this.f32533a = (GCMSingleLineEditTextView) view2.findViewById(R.id.contact_edit_first_name);
            this.f32534b = (GCMSingleLineEditTextView) view2.findViewById(R.id.contact_edit_last_name);
            this.f32535c = (UserLevelImageView) view2.findViewById(R.id.contact_image);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/a$e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/edit/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class e extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f32537c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexTwoLineButton f32538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f32539b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f32539b = aVar;
            this.f32538a = (GCMComplexTwoLineButton) view2.findViewById(R.id.contact_info_value_edit);
        }
    }

    public interface f {
        void A8(com.garmin.android.apps.connectmobile.contacts.a.c cVar);

        void B1(h hVar);

        void W8(com.garmin.android.apps.connectmobile.contacts.a.f fVar);

        void i3();

        void m9(h hVar);

        void q9(List<? extends com.garmin.android.apps.connectmobile.contacts.a> list);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/a$g;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/edit/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class g extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f32540a = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a aVar, View view2) {
            super(view2);
            view2.getClass();
            GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) view2.findViewById(R.id.add_contact_info_btn);
            gCMComplexOneLineButton.setPadding(0, (int) view2.getContext().getResources().getDimension(R.dimen.spacing_normal), 0, 0);
            gCMComplexOneLineButton.setButtonLeftLabel(view2.getContext().getString(R.string.delete_contact));
            gCMComplexOneLineButton.setLeftLabelColor(view2.getContext().getColor(R.color.gcm_text_danger_action));
            gCMComplexOneLineButton.setOnClickListener(new g0(aVar, 15));
        }
    }

    static {
        new c(null);
    }

    public a(f fVar) {
        this.f32525a = fVar;
        this.f32526b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f32526b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        com.garmin.android.apps.connectmobile.contacts.a aVar = (com.garmin.android.apps.connectmobile.contacts.a) this.f32526b.get(i14);
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.d) {
            return 0;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.f) {
            return 1;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.c) {
            return 2;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.b) {
            return 3;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.C0525a) {
            return 4;
        }
        return aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.g ? 5 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        boolean z14 = f0Var instanceof d;
        ArrayList arrayList = this.f32526b;
        if (z14) {
            final d dVar = (d) f0Var;
            Object obj = arrayList.get(i14);
            obj.getClass();
            com.garmin.android.apps.connectmobile.contacts.a.d dVar2 = (com.garmin.android.apps.connectmobile.contacts.a.d) obj;
            GCMSingleLineEditTextView gCMSingleLineEditTextView = dVar.f32533a;
            String str = dVar2.f32348a;
            GCMSingleLineEditTextView gCMSingleLineEditTextView2 = dVar.f32534b;
            String string = gCMSingleLineEditTextView2.getContext().getString(R.string.contact_management_label_first_name);
            string.getClass();
            final a aVar = dVar.f32536d;
            final int i15 = 0;
            gCMSingleLineEditTextView.i(new GCMSingleLineEditTextView.d(str, string, null, null, null, new l(aVar) { // from class: i20.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.edit.a f87160b;

                {
                    this.f87160b = aVar;
                }

                @Override // e23.l
                public final Object invoke(Object obj2) {
                    com.garmin.android.apps.connectmobile.contacts.a.d dVar3;
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.contacts.edit.a.d dVar4 = dVar;
                    com.garmin.android.apps.connectmobile.contacts.edit.a aVar2 = this.f87160b;
                    String str2 = (String) obj2;
                    switch (i16) {
                        case 0:
                            int i17 = com.garmin.android.apps.connectmobile.contacts.edit.a.d.f32532e;
                            str2.getClass();
                            Object obj3 = aVar2.f32526b.get(dVar4.getAbsoluteAdapterPosition());
                            dVar3 = obj3 instanceof com.garmin.android.apps.connectmobile.contacts.a.d ? (com.garmin.android.apps.connectmobile.contacts.a.d) obj3 : null;
                            if (dVar3 != null) {
                                String string2 = d53.w.i0(str2).toString();
                                if (!p005kotlin.jvm.internal.s.g(dVar3.f32348a, string2)) {
                                    string2.getClass();
                                    dVar3.f32348a = string2;
                                    com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar = aVar2.f32525a;
                                    if (fVar != null) {
                                        fVar.q9(aVar2.f32526b);
                                    }
                                }
                            }
                            break;
                        default:
                            int i18 = com.garmin.android.apps.connectmobile.contacts.edit.a.d.f32532e;
                            str2.getClass();
                            Object obj4 = aVar2.f32526b.get(dVar4.getAbsoluteAdapterPosition());
                            dVar3 = obj4 instanceof com.garmin.android.apps.connectmobile.contacts.a.d ? (com.garmin.android.apps.connectmobile.contacts.a.d) obj4 : null;
                            if (dVar3 != null) {
                                String string3 = d53.w.i0(str2).toString();
                                if (!p005kotlin.jvm.internal.s.g(dVar3.f32349b, string3)) {
                                    string3.getClass();
                                    dVar3.f32349b = string3;
                                    com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar2 = aVar2.f32525a;
                                    if (fVar2 != null) {
                                        fVar2.q9(aVar2.f32526b);
                                    }
                                }
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, null, null, 96, false, null, null, 3292, null));
            String str2 = dVar2.f32349b;
            String string2 = gCMSingleLineEditTextView2.getContext().getString(R.string.contact_management_label_last_name);
            string2.getClass();
            final int i16 = 1;
            gCMSingleLineEditTextView2.i(new GCMSingleLineEditTextView.d(str2, string2, null, null, null, new l(aVar) { // from class: i20.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.edit.a f87160b;

                {
                    this.f87160b = aVar;
                }

                @Override // e23.l
                public final Object invoke(Object obj2) {
                    com.garmin.android.apps.connectmobile.contacts.a.d dVar3;
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.contacts.edit.a.d dVar4 = dVar;
                    com.garmin.android.apps.connectmobile.contacts.edit.a aVar2 = this.f87160b;
                    String str3 = (String) obj2;
                    switch (i17) {
                        case 0:
                            int i18 = com.garmin.android.apps.connectmobile.contacts.edit.a.d.f32532e;
                            str3.getClass();
                            Object obj3 = aVar2.f32526b.get(dVar4.getAbsoluteAdapterPosition());
                            dVar3 = obj3 instanceof com.garmin.android.apps.connectmobile.contacts.a.d ? (com.garmin.android.apps.connectmobile.contacts.a.d) obj3 : null;
                            if (dVar3 != null) {
                                String string3 = d53.w.i0(str3).toString();
                                if (!p005kotlin.jvm.internal.s.g(dVar3.f32348a, string3)) {
                                    string3.getClass();
                                    dVar3.f32348a = string3;
                                    com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar = aVar2.f32525a;
                                    if (fVar != null) {
                                        fVar.q9(aVar2.f32526b);
                                    }
                                }
                            }
                            break;
                        default:
                            int i19 = com.garmin.android.apps.connectmobile.contacts.edit.a.d.f32532e;
                            str3.getClass();
                            Object obj4 = aVar2.f32526b.get(dVar4.getAbsoluteAdapterPosition());
                            dVar3 = obj4 instanceof com.garmin.android.apps.connectmobile.contacts.a.d ? (com.garmin.android.apps.connectmobile.contacts.a.d) obj4 : null;
                            if (dVar3 != null) {
                                String string4 = d53.w.i0(str3).toString();
                                if (!p005kotlin.jvm.internal.s.g(dVar3.f32349b, string4)) {
                                    string4.getClass();
                                    dVar3.f32349b = string4;
                                    com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar2 = aVar2.f32525a;
                                    if (fVar2 != null) {
                                        fVar2.q9(aVar2.f32526b);
                                    }
                                }
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, null, null, 96, false, null, null, 3292, null));
            Character chQ0 = y.q0(dVar2.f32348a);
            if (chQ0 == null) {
                chQ0 = y.q0(dVar2.f32349b);
            }
            dVar.f32535c.setProfileImageData(new b12.b(dVar2.f32350c, null, null, chQ0, null, 22, null));
            return;
        }
        if (!(f0Var instanceof e)) {
            if (f0Var instanceof b) {
                boolean zT = t(i14);
                GCMComplexOneLineButton gCMComplexOneLineButton = ((b) f0Var).f32531a;
                if (zT) {
                    gCMComplexOneLineButton.setPadding(0, (int) gCMComplexOneLineButton.getContext().getResources().getDimension(R.dimen.spacing_normal), 0, 0);
                    return;
                } else {
                    gCMComplexOneLineButton.setPadding(0, 0, 0, 0);
                    return;
                }
            }
            if (f0Var instanceof C0530a) {
                boolean zT2 = t(i14);
                GCMComplexOneLineButton gCMComplexOneLineButton2 = ((C0530a) f0Var).f32530a;
                if (zT2) {
                    gCMComplexOneLineButton2.setPadding(0, (int) gCMComplexOneLineButton2.getContext().getResources().getDimension(R.dimen.spacing_normal), 0, 0);
                    return;
                } else {
                    gCMComplexOneLineButton2.setPadding(0, 0, 0, 0);
                    return;
                }
            }
            return;
        }
        final e eVar = (e) f0Var;
        final com.garmin.android.apps.connectmobile.contacts.a aVar2 = (com.garmin.android.apps.connectmobile.contacts.a) arrayList.get(i14);
        boolean zT3 = t(i14);
        final a aVar3 = eVar.f32539b;
        final GCMComplexTwoLineButton gCMComplexTwoLineButton = eVar.f32538a;
        aVar2.getClass();
        if (aVar2 instanceof com.garmin.android.apps.connectmobile.contacts.a.f) {
            com.garmin.android.apps.connectmobile.contacts.a.f fVar = (com.garmin.android.apps.connectmobile.contacts.a.f) aVar2;
            String str3 = fVar.f32357b;
            Context context = eVar.itemView.getContext();
            context.getClass();
            String strV = jg.b.v(context, str3);
            gCMComplexTwoLineButton.setButtonTopLabel(strV);
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(gCMComplexTwoLineButton.getContext().getString(fVar.f32358c.f109041b));
            gCMComplexTwoLineButton.setFocusableInTouchMode(true);
            final int i17 = 0;
            gCMComplexTwoLineButton.setOnClickListener(new View.OnClickListener() { // from class: i20.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i18 = i17;
                    com.garmin.android.apps.connectmobile.contacts.a aVar4 = aVar2;
                    com.garmin.android.apps.connectmobile.contacts.edit.a aVar5 = aVar3;
                    GCMComplexTwoLineButton gCMComplexTwoLineButton2 = gCMComplexTwoLineButton;
                    switch (i18) {
                        case 0:
                            int i19 = com.garmin.android.apps.connectmobile.contacts.edit.a.e.f32537c;
                            gCMComplexTwoLineButton2.requestFocus();
                            com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar2 = aVar5.f32525a;
                            if (fVar2 != null) {
                                fVar2.W8((com.garmin.android.apps.connectmobile.contacts.a.f) aVar4);
                            }
                            break;
                        default:
                            int i24 = com.garmin.android.apps.connectmobile.contacts.edit.a.e.f32537c;
                            gCMComplexTwoLineButton2.requestFocus();
                            com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar3 = aVar5.f32525a;
                            if (fVar3 != null) {
                                fVar3.A8((com.garmin.android.apps.connectmobile.contacts.a.c) aVar4);
                            }
                            break;
                    }
                }
            });
            final int i18 = 0;
            gCMComplexTwoLineButton.setLeftIconClickListener(new View.OnClickListener(aVar3) { // from class: i20.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.edit.a f87167b;

                {
                    this.f87167b = aVar3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i19 = i18;
                    com.garmin.android.apps.connectmobile.contacts.edit.a.e eVar2 = eVar;
                    com.garmin.android.apps.connectmobile.contacts.edit.a aVar4 = this.f87167b;
                    switch (i19) {
                        case 0:
                            int i24 = com.garmin.android.apps.connectmobile.contacts.edit.a.e.f32537c;
                            int absoluteAdapterPosition = eVar2.getAbsoluteAdapterPosition();
                            int i25 = com.garmin.android.apps.connectmobile.contacts.edit.a.f32524f;
                            aVar4.u(absoluteAdapterPosition);
                            break;
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.contacts.edit.a.e.f32537c;
                            int absoluteAdapterPosition2 = eVar2.getAbsoluteAdapterPosition();
                            int i27 = com.garmin.android.apps.connectmobile.contacts.edit.a.f32524f;
                            aVar4.u(absoluteAdapterPosition2);
                            break;
                    }
                }
            });
            gCMComplexTwoLineButton.setLeftIconContentDescription(gCMComplexTwoLineButton.getContext().getString(R.string.remove_phone_template, strV));
            if (zT3) {
                gCMComplexTwoLineButton.setPadding(0, (int) gCMComplexTwoLineButton.getContext().getResources().getDimension(R.dimen.spacing_normal), 0, 0);
                return;
            } else {
                gCMComplexTwoLineButton.setPadding(0, 0, 0, 0);
                return;
            }
        }
        if (!(aVar2 instanceof com.garmin.android.apps.connectmobile.contacts.a.c)) {
            String str4 = "ContactInfoViewHolder bind: skip " + aVar2;
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var, "EditContactAdapter", str4);
            return;
        }
        com.garmin.android.apps.connectmobile.contacts.a.c cVar = (com.garmin.android.apps.connectmobile.contacts.a.c) aVar2;
        gCMComplexTwoLineButton.setButtonTopLabel(cVar.f32335b);
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(gCMComplexTwoLineButton.getContext().getString(cVar.f32336c.f109013b));
        gCMComplexTwoLineButton.setFocusableInTouchMode(true);
        final int i19 = 1;
        gCMComplexTwoLineButton.setOnClickListener(new View.OnClickListener() { // from class: i20.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i110 = i19;
                com.garmin.android.apps.connectmobile.contacts.a aVar5 = aVar2;
                com.garmin.android.apps.connectmobile.contacts.edit.a aVar6 = aVar3;
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = gCMComplexTwoLineButton;
                switch (i110) {
                    case 0:
                        int i111 = com.garmin.android.apps.connectmobile.contacts.edit.a.e.f32537c;
                        gCMComplexTwoLineButton2.requestFocus();
                        com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar2 = aVar6.f32525a;
                        if (fVar2 != null) {
                            fVar2.W8((com.garmin.android.apps.connectmobile.contacts.a.f) aVar5);
                        }
                        break;
                    default:
                        int i24 = com.garmin.android.apps.connectmobile.contacts.edit.a.e.f32537c;
                        gCMComplexTwoLineButton2.requestFocus();
                        com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar3 = aVar6.f32525a;
                        if (fVar3 != null) {
                            fVar3.A8((com.garmin.android.apps.connectmobile.contacts.a.c) aVar5);
                        }
                        break;
                }
            }
        });
        final int i24 = 1;
        gCMComplexTwoLineButton.setLeftIconClickListener(new View.OnClickListener(aVar3) { // from class: i20.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.edit.a f87167b;

            {
                this.f87167b = aVar3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i110 = i24;
                com.garmin.android.apps.connectmobile.contacts.edit.a.e eVar2 = eVar;
                com.garmin.android.apps.connectmobile.contacts.edit.a aVar5 = this.f87167b;
                switch (i110) {
                    case 0:
                        int i25 = com.garmin.android.apps.connectmobile.contacts.edit.a.e.f32537c;
                        int absoluteAdapterPosition = eVar2.getAbsoluteAdapterPosition();
                        int i26 = com.garmin.android.apps.connectmobile.contacts.edit.a.f32524f;
                        aVar5.u(absoluteAdapterPosition);
                        break;
                    default:
                        int i27 = com.garmin.android.apps.connectmobile.contacts.edit.a.e.f32537c;
                        int absoluteAdapterPosition2 = eVar2.getAbsoluteAdapterPosition();
                        int i28 = com.garmin.android.apps.connectmobile.contacts.edit.a.f32524f;
                        aVar5.u(absoluteAdapterPosition2);
                        break;
                }
            }
        });
        gCMComplexTwoLineButton.setLeftIconContentDescription(gCMComplexTwoLineButton.getContext().getString(R.string.remove_email_template, cVar.f32335b));
        if (zT3) {
            gCMComplexTwoLineButton.setPadding(0, (int) gCMComplexTwoLineButton.getContext().getResources().getDimension(R.dimen.spacing_normal), 0, 0);
        } else {
            gCMComplexTwoLineButton.setPadding(0, 0, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 0) {
            return new d(this, j.b(viewGroup, R.layout.gcm4_edit_contact_header_item, viewGroup, false));
        }
        if (i14 != 1 && i14 != 2) {
            if (i14 == 3) {
                return new b(this, j.b(viewGroup, R.layout.gcm4_contact_edit_details_btn_item, viewGroup, false));
            }
            if (i14 != 4) {
                return i14 != 5 ? new d(this, j.b(viewGroup, R.layout.gcm4_edit_contact_header_item, viewGroup, false)) : new g(this, j.b(viewGroup, R.layout.gcm4_contact_edit_details_btn_item, viewGroup, false));
            }
            return new C0530a(this, j.b(viewGroup, R.layout.gcm4_contact_edit_details_btn_item, viewGroup, false));
        }
        return new e(this, j.b(viewGroup, R.layout.gcm4_edit_contact_list_item, viewGroup, false));
    }

    public final void r(int i14, com.garmin.android.apps.connectmobile.contacts.a aVar) {
        ArrayList arrayList = this.f32526b;
        arrayList.add(i14, aVar);
        notifyItemInserted(i14);
        int i15 = i14 + 1;
        if (i15 != arrayList.size()) {
            notifyItemChanged(i15);
        }
    }

    public final boolean t(int i14) {
        int i15;
        if (i14 != 1) {
            int i16 = this.f32528d;
            ArrayList arrayList = this.f32526b;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    if ((((com.garmin.android.apps.connectmobile.contacts.a) it.next()) instanceof com.garmin.android.apps.connectmobile.contacts.a.b) && (i15 = i15 + 1) < 0) {
                        x.p();
                        throw null;
                    }
                }
            } else {
                i15 = 0;
            }
            if (i14 != i16 + i15 + 1) {
                return false;
            }
        }
        return true;
    }

    public final void u(int i14) {
        if (i14 != -1) {
            ArrayList arrayList = this.f32526b;
            com.garmin.android.apps.connectmobile.contacts.a aVar = (com.garmin.android.apps.connectmobile.contacts.a) arrayList.get(i14);
            boolean z14 = aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.f;
            f fVar = this.f32525a;
            if (!z14) {
                if (!(aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.c)) {
                    Objects.toString(aVar);
                    return;
                }
                this.f32529e--;
                x(i14);
                if (this.f32529e == this.f32527c - 1) {
                    r(arrayList.size(), com.garmin.android.apps.connectmobile.contacts.a.C0525a.f32332a);
                }
                if (fVar != null) {
                    fVar.q9(arrayList);
                    return;
                }
                return;
            }
            com.garmin.android.apps.connectmobile.contacts.a.f fVar2 = (com.garmin.android.apps.connectmobile.contacts.a.f) aVar;
            if (fVar2.f32376u) {
                if (fVar != null) {
                    fVar.B1(new h(this, i14, 0));
                }
            } else if (!s.g(fVar2.f32365j, Boolean.TRUE)) {
                z(i14);
            } else if (fVar != null) {
                fVar.m9(new h(this, i14, 1));
            }
        }
    }

    public final void x(int i14) {
        ArrayList arrayList = this.f32526b;
        arrayList.remove(i14);
        notifyItemRemoved(i14);
        if (i14 != arrayList.size()) {
            notifyItemChanged(i14);
        }
    }

    public final void z(int i14) {
        this.f32528d--;
        x(i14);
        int i15 = this.f32528d;
        if (i15 == this.f32527c - 1) {
            r(i15 + 1, com.garmin.android.apps.connectmobile.contacts.a.b.f32333a);
        }
        f fVar = this.f32525a;
        if (fVar != null) {
            fVar.q9(this.f32526b);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/a$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "ITEM_TYPE_HEADER", "I", "ITEM_TYPE_PHONE", "ITEM_TYPE_EMAIL", "ITEM_TYPE_ADD_PHONE", "ITEM_TYPE_ADD_EMAIL", "ITEM_TYPE_DELETE_CONTACT", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : fVar);
    }
}
