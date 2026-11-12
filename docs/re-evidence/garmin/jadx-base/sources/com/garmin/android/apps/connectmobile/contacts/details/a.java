package com.garmin.android.apps.connectmobile.contacts.details;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import d53.y;
import java.util.ArrayList;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\t\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017BC\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/contacts/details/a$i;", "viewProfileClickListener", "Lcom/garmin/android/apps/connectmobile/contacts/details/a$f;", "emailItemClickListener", "Lcom/garmin/android/apps/connectmobile/contacts/details/a$g;", "phoneItemClickListener", "Lcom/garmin/android/apps/connectmobile/contacts/details/a$h;", "smsLiveEventRequestListener", "Lcom/garmin/android/apps/connectmobile/contacts/details/a$e;", "deleteContactListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/details/a$i;Lcom/garmin/android/apps/connectmobile/contacts/details/a$f;Lcom/garmin/android/apps/connectmobile/contacts/details/a$g;Lcom/garmin/android/apps/connectmobile/contacts/details/a$h;Lcom/garmin/android/apps/connectmobile/contacts/details/a$e;)V", IntegerTokenConverter.CONVERTER_KEY, "f", "g", "h", JWKParameterNames.RSA_EXPONENT, "a", "b", "c", "d", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f32442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f32443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f32444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f32445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f32446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f32447f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/details/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f32448e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f32449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UserLevelImageView f32450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Button f32451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f32452d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f32452d = aVar;
            this.f32449a = (TextView) view2.findViewById(R.id.contact_details_name);
            this.f32450b = (UserLevelImageView) view2.findViewById(R.id.contact_details_image);
            this.f32451c = (Button) view2.findViewById(R.id.contact_details_view_profile_button);
            m.b(new g20.e(view2, 0));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/a$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/details/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ int f32453q = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f32454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f32455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f32456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f32457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f32458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final View f32459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ImageView f32460g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final View f32461h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final View f32462i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final View f32463j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final View f32464k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final CheckBox f32465l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final TextView f32466m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final TextView f32467n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final TextView f32468o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ a f32469p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f32469p = aVar;
            this.f32454a = (TextView) view2.findViewById(R.id.contact_info_label);
            this.f32455b = (ImageView) view2.findViewById(R.id.messenger_icon);
            this.f32456c = (TextView) view2.findViewById(R.id.contact_info_value);
            this.f32457d = (TextView) view2.findViewById(R.id.contact_warning_label);
            this.f32458e = (TextView) view2.findViewById(R.id.contact_send_sms_request);
            this.f32459f = view2.findViewById(R.id.live_track_details_row);
            this.f32460g = (ImageView) view2.findViewById(R.id.live_track_details_icon);
            this.f32461h = view2.findViewById(R.id.emergency_contact_details_row);
            this.f32462i = view2.findViewById(R.id.emergency_contact_details_no_response_row);
            this.f32463j = view2.findViewById(R.id.contact_info_warning);
            this.f32464k = view2.findViewById(R.id.contact_send_sms_invite);
            this.f32465l = (CheckBox) view2.findViewById(R.id.contact_info_checkbox);
            this.f32466m = (TextView) view2.findViewById(R.id.emergency_contact_text);
            this.f32467n = (TextView) view2.findViewById(R.id.emergency_contact_no_response_text);
            this.f32468o = (TextView) view2.findViewById(R.id.live_track_text);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/a$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/details/a;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f32470a = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, View view2) {
            super(view2);
            view2.getClass();
            GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) view2.findViewById(R.id.add_contact_info_btn);
            gCMComplexOneLineButton.setPadding(0, (int) view2.getContext().getResources().getDimension(R.dimen.spacing_normal), 0, 0);
            gCMComplexOneLineButton.setButtonLeftLabel(view2.getContext().getString(R.string.delete_contact));
            gCMComplexOneLineButton.setLeftLabelColor(view2.getContext().getColor(R.color.gcm_text_danger_action));
            gCMComplexOneLineButton.setOnClickListener(new g20.d(aVar, 2));
        }
    }

    public interface e {
        void C0();
    }

    public interface f {
        void u5(com.garmin.android.apps.connectmobile.contacts.a.c cVar);
    }

    public interface g {
        void Z1();

        void n6(com.garmin.android.apps.connectmobile.contacts.a.f fVar);
    }

    public interface h {
        void k4(com.garmin.android.apps.connectmobile.contacts.a.f fVar);
    }

    public interface i {
        void Y();
    }

    static {
        new C0527a(null);
    }

    public /* synthetic */ a(i iVar, f fVar, g gVar, h hVar, e eVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : iVar, (i14 & 2) != 0 ? null : fVar, (i14 & 4) != 0 ? null : gVar, (i14 & 8) != 0 ? null : hVar, (i14 & 16) != 0 ? null : eVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f32447f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        com.garmin.android.apps.connectmobile.contacts.a aVar = (com.garmin.android.apps.connectmobile.contacts.a) this.f32447f.get(i14);
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.d) {
            return 0;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.f) {
            return 1;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.c) {
            return 2;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.g) {
            return 3;
        }
        return aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.e ? 4 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        View view2;
        View view3;
        int i15;
        int i16;
        int i17;
        int i18;
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        boolean z14 = f0Var instanceof b;
        ArrayList arrayList = this.f32447f;
        if (z14) {
            b bVar = (b) f0Var;
            Object obj = arrayList.get(i14);
            obj.getClass();
            com.garmin.android.apps.connectmobile.contacts.a.d dVar = (com.garmin.android.apps.connectmobile.contacts.a.d) obj;
            String string = bVar.itemView.getContext().getString(R.string.string_space_string_pattern, dVar.f32348a, dVar.f32349b);
            string.getClass();
            String string2 = w.i0(string).toString();
            TextView textView = bVar.f32449a;
            textView.setText(string2);
            bVar.f32450b.setProfileImageData(new b12.b(dVar.f32350c, null, null, y.q0(string2), null, 22, null));
            boolean z15 = dVar.f32351d;
            Button button = bVar.f32451c;
            if (z15) {
                button.setVisibility(0);
                button.setOnClickListener(new g20.d(bVar.f32452d, 0));
            } else {
                button.setVisibility(8);
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (f0Var instanceof c) {
            c cVar = (c) f0Var;
            ImageView imageView = cVar.f32460g;
            final com.garmin.android.apps.connectmobile.contacts.a aVar = (com.garmin.android.apps.connectmobile.contacts.a) arrayList.get(i14);
            TextView textView2 = cVar.f32456c;
            final a aVar2 = cVar.f32469p;
            View view4 = cVar.f32459f;
            TextView textView3 = cVar.f32454a;
            CheckBox checkBox = cVar.f32465l;
            View view5 = cVar.f32461h;
            View view6 = cVar.f32463j;
            aVar.getClass();
            TextView textView4 = cVar.f32457d;
            textView4.getClass();
            textView4.setVisibility(8);
            View view7 = cVar.f32464k;
            view7.getClass();
            view7.setVisibility(8);
            TextView textView5 = cVar.f32458e;
            textView5.getClass();
            textView5.setVisibility(8);
            TextView textView6 = cVar.f32466m;
            textView6.getClass();
            textView6.setVisibility(8);
            TextView textView7 = cVar.f32468o;
            textView7.getClass();
            textView7.setVisibility(8);
            View view8 = cVar.f32462i;
            view8.getClass();
            view8.setVisibility(8);
            TextView textView8 = cVar.f32467n;
            textView8.getClass();
            textView8.setVisibility(8);
            Context context = cVar.itemView.getContext();
            context.getClass();
            if (c22.b.e(context)) {
                ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                Context context2 = cVar.itemView.getContext();
                context2.getClass();
                view2 = view8;
                Resources resources = cVar.itemView.getResources();
                resources.getClass();
                view3 = view5;
                layoutParams.width = (int) c22.b.c(context2, xy2.b.n(resources, 100.0f), 1.5f);
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                Context context3 = cVar.itemView.getContext();
                context3.getClass();
                Resources resources2 = cVar.itemView.getResources();
                resources2.getClass();
                layoutParams2.height = (int) c22.b.c(context3, xy2.b.n(resources2, 30.0f), 1.5f);
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                Context context4 = cVar.itemView.getContext();
                context4.getClass();
                Resources resources3 = cVar.itemView.getResources();
                resources3.getClass();
                layoutParams3.width = (int) c22.b.c(context4, xy2.b.n(resources3, 30.0f), 1.5f);
                ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
                Context context5 = cVar.itemView.getContext();
                context5.getClass();
                Resources resources4 = cVar.itemView.getResources();
                resources4.getClass();
                layoutParams4.height = (int) c22.b.c(context5, xy2.b.n(resources4, 30.0f), 1.5f);
                ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                Context context6 = cVar.itemView.getContext();
                context6.getClass();
                Resources resources5 = cVar.itemView.getResources();
                resources5.getClass();
                layoutParams5.width = (int) c22.b.c(context6, xy2.b.n(resources5, 30.0f), 1.5f);
                ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
                Context context7 = cVar.itemView.getContext();
                context7.getClass();
                Resources resources6 = cVar.itemView.getResources();
                resources6.getClass();
                layoutParams6.height = (int) c22.b.c(context7, xy2.b.n(resources6, 30.0f), 1.5f);
                ViewGroup.LayoutParams layoutParams7 = view6.getLayoutParams();
                Context context8 = cVar.itemView.getContext();
                context8.getClass();
                Resources resources7 = cVar.itemView.getResources();
                resources7.getClass();
                layoutParams7.width = (int) c22.b.c(context8, xy2.b.n(resources7, 16.0f), 1.5f);
                ViewGroup.LayoutParams layoutParams8 = view6.getLayoutParams();
                Context context9 = cVar.itemView.getContext();
                context9.getClass();
                Resources resources8 = cVar.itemView.getResources();
                resources8.getClass();
                layoutParams8.height = (int) c22.b.c(context9, xy2.b.n(resources8, 16.0f), 1.5f);
            } else {
                view2 = view8;
                view3 = view5;
            }
            if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.f) {
                com.garmin.android.apps.connectmobile.contacts.a.f fVar = (com.garmin.android.apps.connectmobile.contacts.a.f) aVar;
                boolean z16 = fVar.f32362g;
                boolean z17 = fVar.f32360e;
                if (fVar.f32359d) {
                    view6.getClass();
                    view6.setVisibility(0);
                    if (fVar.f32364i) {
                        view6.setOnClickListener(null);
                        view6.setClickable(false);
                    } else {
                        textView5.setVisibility(8);
                        if (aVar2.f32444c == null) {
                            view6.setOnClickListener(null);
                            view6.setClickable(false);
                        } else {
                            view6.setOnClickListener(new g20.d(aVar2, 1));
                        }
                    }
                } else {
                    view6.getClass();
                    view6.setVisibility(8);
                }
                if (z17) {
                    if (fVar.f32361f) {
                        imageView.setColorFilter(cVar.itemView.getContext().getColor(R.color.gcm_icon_secondary));
                    }
                    i18 = 0;
                    textView7.setVisibility(0);
                    textView7.setText(cVar.itemView.getContext().getString(R.string.lbl_livetrack_recipient));
                    i17 = 8;
                } else {
                    i17 = 8;
                    i18 = 0;
                    textView7.setVisibility(8);
                }
                Integer num = fVar.f32367l;
                if (num != null) {
                    int iIntValue = num.intValue();
                    textView4.setVisibility(i18);
                    textView4.setText(cVar.itemView.getContext().getString(iIntValue));
                } else {
                    textView4.setVisibility(i17);
                }
                if (fVar.f32371p) {
                    textView5.setVisibility(i18);
                    final int i19 = 0;
                    textView5.setOnClickListener(new View.OnClickListener(aVar2) { // from class: g20.f

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.details.a f75333b;

                        {
                            this.f75333b = aVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view9) {
                            int i24 = i19;
                            com.garmin.android.apps.connectmobile.contacts.a aVar3 = aVar;
                            com.garmin.android.apps.connectmobile.contacts.details.a aVar4 = this.f75333b;
                            switch (i24) {
                                case 0:
                                    int i25 = com.garmin.android.apps.connectmobile.contacts.details.a.c.f32453q;
                                    com.garmin.android.apps.connectmobile.contacts.details.a.h hVar = aVar4.f32445d;
                                    if (hVar != null) {
                                        hVar.k4((com.garmin.android.apps.connectmobile.contacts.a.f) aVar3);
                                    }
                                    break;
                                case 1:
                                    int i26 = com.garmin.android.apps.connectmobile.contacts.details.a.c.f32453q;
                                    com.garmin.android.apps.connectmobile.contacts.details.a.g gVar = aVar4.f32444c;
                                    if (gVar != null) {
                                        gVar.n6((com.garmin.android.apps.connectmobile.contacts.a.f) aVar3);
                                    }
                                    break;
                                default:
                                    int i27 = com.garmin.android.apps.connectmobile.contacts.details.a.c.f32453q;
                                    com.garmin.android.apps.connectmobile.contacts.details.a.f fVar2 = aVar4.f32443b;
                                    if (fVar2 != null) {
                                        fVar2.u5((com.garmin.android.apps.connectmobile.contacts.a.c) aVar3);
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    textView5.setVisibility(i17);
                }
                if (z16) {
                    final int i24 = 1;
                    cVar.itemView.setOnClickListener(new View.OnClickListener(aVar2) { // from class: g20.f

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.details.a f75333b;

                        {
                            this.f75333b = aVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view9) {
                            int i25 = i24;
                            com.garmin.android.apps.connectmobile.contacts.a aVar3 = aVar;
                            com.garmin.android.apps.connectmobile.contacts.details.a aVar4 = this.f75333b;
                            switch (i25) {
                                case 0:
                                    int i26 = com.garmin.android.apps.connectmobile.contacts.details.a.c.f32453q;
                                    com.garmin.android.apps.connectmobile.contacts.details.a.h hVar = aVar4.f32445d;
                                    if (hVar != null) {
                                        hVar.k4((com.garmin.android.apps.connectmobile.contacts.a.f) aVar3);
                                    }
                                    break;
                                case 1:
                                    int i27 = com.garmin.android.apps.connectmobile.contacts.details.a.c.f32453q;
                                    com.garmin.android.apps.connectmobile.contacts.details.a.g gVar = aVar4.f32444c;
                                    if (gVar != null) {
                                        gVar.n6((com.garmin.android.apps.connectmobile.contacts.a.f) aVar3);
                                    }
                                    break;
                                default:
                                    int i28 = com.garmin.android.apps.connectmobile.contacts.details.a.c.f32453q;
                                    com.garmin.android.apps.connectmobile.contacts.details.a.f fVar2 = aVar4.f32443b;
                                    if (fVar2 != null) {
                                        fVar2.u5((com.garmin.android.apps.connectmobile.contacts.a.c) aVar3);
                                    }
                                    break;
                            }
                        }
                    });
                    checkBox.setVisibility(0);
                    checkBox.setChecked(fVar.f32363h);
                } else {
                    checkBox.setVisibility(8);
                }
                cVar.itemView.setClickable(z16);
                String str = fVar.f32357b;
                Context context10 = cVar.itemView.getContext();
                context10.getClass();
                textView2.setText(jg.b.v(context10, str));
                textView3.getClass();
                v22.e.v(textView3, fVar.f32373r);
                textView3.setText(fVar.f32358c.f109041b);
                view4.getClass();
                v22.e.v(view4, z17);
                Integer num2 = fVar.f32375t;
                if (num2 == null) {
                    View view9 = view3;
                    view9.getClass();
                    view9.setVisibility(8);
                    view2.setVisibility(8);
                    textView6.setVisibility(8);
                    textView8.setVisibility(8);
                    return;
                }
                if (num2.intValue() == 2131231821) {
                    view3.getClass();
                    view3.setVisibility(0);
                    view2.setVisibility(8);
                    textView6.setVisibility(0);
                    textView6.setText(cVar.itemView.getContext().getString(R.string.assistance_contact));
                    textView8.setVisibility(8);
                    return;
                }
                View view10 = view3;
                view10.getClass();
                view10.setVisibility(8);
                view2.setVisibility(0);
                textView8.setVisibility(0);
                textView8.setText(cVar.itemView.getContext().getString(R.string.assistance_contact));
                textView6.setVisibility(8);
                return;
            }
            View view11 = view2;
            View view12 = view3;
            if (!(aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.c)) {
                if (!(aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.e)) {
                    aVar.toString();
                    return;
                }
                com.garmin.android.apps.connectmobile.contacts.a.e eVar = (com.garmin.android.apps.connectmobile.contacts.a.e) aVar;
                boolean z18 = eVar.f32354b;
                if (z18) {
                    textView7.setVisibility(0);
                    textView7.setText(cVar.itemView.getContext().getString(R.string.lbl_livetrack_recipient));
                } else {
                    textView7.setVisibility(8);
                }
                String str2 = eVar.f32353a;
                Context context11 = cVar.itemView.getContext();
                context11.getClass();
                textView2.setText(jg.b.v(context11, str2));
                textView3.getClass();
                v22.e.v(textView3, eVar.f32355c);
                textView3.setText(R.string.lbl_garmin_messenger_app_name);
                view4.getClass();
                v22.e.v(view4, z18);
                view12.getClass();
                view12.setVisibility(8);
                view11.setVisibility(8);
                textView6.setVisibility(8);
                ImageView imageView2 = cVar.f32455b;
                imageView2.getClass();
                imageView2.setVisibility(0);
                textView8.setVisibility(8);
                view6.getClass();
                view6.setVisibility(8);
                return;
            }
            com.garmin.android.apps.connectmobile.contacts.a.c cVar2 = (com.garmin.android.apps.connectmobile.contacts.a.c) aVar;
            boolean z19 = cVar2.f32337d;
            boolean z24 = cVar2.f32339f;
            boolean z25 = cVar2.f32341h;
            if (z25) {
                final int i25 = 2;
                cVar.itemView.setOnClickListener(new View.OnClickListener(aVar2) { // from class: g20.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.details.a f75333b;

                    {
                        this.f75333b = aVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view13) {
                        int i26 = i25;
                        com.garmin.android.apps.connectmobile.contacts.a aVar3 = aVar;
                        com.garmin.android.apps.connectmobile.contacts.details.a aVar4 = this.f75333b;
                        switch (i26) {
                            case 0:
                                int i27 = com.garmin.android.apps.connectmobile.contacts.details.a.c.f32453q;
                                com.garmin.android.apps.connectmobile.contacts.details.a.h hVar = aVar4.f32445d;
                                if (hVar != null) {
                                    hVar.k4((com.garmin.android.apps.connectmobile.contacts.a.f) aVar3);
                                }
                                break;
                            case 1:
                                int i28 = com.garmin.android.apps.connectmobile.contacts.details.a.c.f32453q;
                                com.garmin.android.apps.connectmobile.contacts.details.a.g gVar = aVar4.f32444c;
                                if (gVar != null) {
                                    gVar.n6((com.garmin.android.apps.connectmobile.contacts.a.f) aVar3);
                                }
                                break;
                            default:
                                int i29 = com.garmin.android.apps.connectmobile.contacts.details.a.c.f32453q;
                                com.garmin.android.apps.connectmobile.contacts.details.a.f fVar2 = aVar4.f32443b;
                                if (fVar2 != null) {
                                    fVar2.u5((com.garmin.android.apps.connectmobile.contacts.a.c) aVar3);
                                }
                                break;
                        }
                    }
                });
                checkBox.setVisibility(0);
                checkBox.setChecked(cVar2.f32342i);
            } else {
                checkBox.setVisibility(8);
            }
            if (z24) {
                if (cVar2.f32340g) {
                    imageView.setColorFilter(cVar.itemView.getContext().getColor(R.color.gcm_icon_secondary));
                }
                i15 = 0;
                textView7.setVisibility(0);
                textView7.setText(cVar.itemView.getContext().getString(R.string.lbl_livetrack_recipient));
                i16 = 8;
            } else {
                i15 = 0;
                i16 = 8;
                textView7.setVisibility(8);
            }
            if (z19) {
                view6.getClass();
                view6.setVisibility(i16);
            } else {
                view6.getClass();
                view6.setVisibility(i15);
                view6.setImportantForAccessibility(1);
                view6.setOnClickListener(null);
            }
            cVar.itemView.setClickable(z25);
            textView2.setText(cVar2.f32335b);
            textView3.getClass();
            v22.e.v(textView3, cVar2.f32346m);
            textView3.setText(R.string.lbl_email);
            view4.getClass();
            v22.e.v(view4, z24);
            Integer num3 = cVar2.f32347n;
            if (num3 == null) {
                view12.getClass();
                view12.setVisibility(8);
                view11.setVisibility(8);
                r12.setVisibility(8);
                textView8.setVisibility(8);
            } else if (num3.intValue() == 2131231821) {
                view12.getClass();
                view12.setVisibility(0);
                view11.setVisibility(8);
                textView6.setVisibility(0);
                textView6.setText(cVar.itemView.getContext().getString(R.string.assistance_contact));
                textView8.setVisibility(8);
            } else {
                view12.getClass();
                view12.setVisibility(8);
                view11.setVisibility(0);
                textView8.setVisibility(0);
                textView8.setText(cVar.itemView.getContext().getString(R.string.assistance_contact));
                r12.setVisibility(8);
            }
            view6.getClass();
            v22.e.v(view6, !z19);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 0) {
            return new b(this, n23.j.b(viewGroup, R.layout.gcm4_contact_info_header_item, viewGroup, false));
        }
        if (i14 != 1 && i14 != 2) {
            if (i14 == 3) {
                return new d(this, n23.j.b(viewGroup, R.layout.gcm4_contact_edit_details_btn_item, viewGroup, false));
            }
            if (i14 != 4) {
                return new b(this, n23.j.b(viewGroup, R.layout.gcm4_contact_info_header_item, viewGroup, false));
            }
        }
        return new c(this, n23.j.b(viewGroup, R.layout.gcm4_contact_info_list_item, viewGroup, false));
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.details.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/a$a;", "", "<init>", "()V", "", "ITEM_TYPE_INVALID", "I", "ITEM_TYPE_HEADER", "ITEM_TYPE_PHONE", "ITEM_TYPE_EMAIL", "ITEM_TYPE_DELETE_CONTACT", "ITEM_TYPE_MESSENGER", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0527a {
        public /* synthetic */ C0527a(j jVar) {
            this();
        }

        private C0527a() {
        }
    }

    public a(i iVar, f fVar, g gVar, h hVar, e eVar) {
        this.f32442a = iVar;
        this.f32443b = fVar;
        this.f32444c = gVar;
        this.f32445d = hVar;
        this.f32446e = eVar;
        this.f32447f = new ArrayList();
    }

    public a() {
        this(null, null, null, null, null, 31, null);
    }
}
