package nm0;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.l2;
import c22.r0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import d53.k;
import d53.u;
import e23.l;
import fw.p;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnm0/d;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class d extends m0 {
    public ViewGroup A;
    public LinearLayout B;
    public ViewGroup C;
    public LinearLayout D;
    public final boolean E;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f126552h = new w1(s0.f105811a.b(mm0.e.class), new c(this), new e(this), new C2433d(null, this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.c<Intent> f126553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f126554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f126555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f126556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f126557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f126558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f126559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f126560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f126561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f126562r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public UserLevelImageView f126563t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public UserLevelImageView f126564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UserLevelImageView f126565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f126566x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewGroup f126567y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f126568z;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f126570b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f126569a = iArr;
            int[] iArr2 = new int[GroupDTO.e.values().length];
            try {
                iArr2[GroupDTO.e.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f126570b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f126571a;

        public b(l lVar) {
            lVar.getClass();
            this.f126571a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f126571a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f126571a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f126572a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f126572a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f126572a.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: nm0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C2433d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f126573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f126574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2433d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f126573a = aVar;
            this.f126574b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f126573a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f126574b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f126575a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f126575a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f126575a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public d() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new jp.a(this, 11));
        cVarRegisterForActivityResult.getClass();
        this.f126553i = cVarRegisterForActivityResult;
        this.E = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        J6(K6().B4());
    }

    public final void I6(LinearLayout linearLayout, int i14, String str, String str2, View.OnClickListener onClickListener) {
        View viewInflate = getLayoutInflater().inflate(R.layout.item_connect_with_us, (ViewGroup) null);
        if (viewInflate != null) {
            ((ImageView) viewInflate.findViewById(R.id.connect_with_us_icon_image_view)).setImageResource(i14);
            ((TextView) viewInflate.findViewById(R.id.connect_with_us_name_text_view)).setText(str);
            TextView textView = (TextView) viewInflate.findViewById(R.id.connect_with_us_hint_text_view);
            textView.setText(str2);
            v22.e.r(textView, g22.n.d(str2));
            viewInflate.setOnClickListener(onClickListener);
            linearLayout.addView(viewInflate);
        }
    }

    public final void J6(long j8) {
        w6();
        j jVarA4 = K6().A4(String.valueOf(j8));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA4, viewLifecycleOwner, new b(new nm0.b(this, 0)));
    }

    public final mm0.e K6() {
        return (mm0.e) this.f126552h.getValue();
    }

    public void M6() {
    }

    public void S6(View view2) {
    }

    public void T6() {
    }

    public final void U6(GroupDetailsDTO groupDetailsDTO) {
        boolean z14;
        ImageView imageView = this.f126554j;
        if (imageView == null) {
            s.m("groupImageView");
            throw null;
        }
        jm0.b bVar = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
        String str = groupDetailsDTO.f31564g;
        if (str == null || !g22.n.d(str)) {
            zp0.c cVar = new zp0.c(this);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            cVar.f206567g = bVar.s(contextRequireContext, groupDetailsDTO.I);
            cVar.h(imageView);
        } else {
            zp0.c cVar2 = new zp0.c(this);
            cVar2.f206570j = 2131232395;
            cVar2.f206565e = groupDetailsDTO.f31564g;
            cVar2.h(imageView);
        }
        ImageView imageView2 = this.f126554j;
        if (imageView2 == null) {
            s.m("groupImageView");
            throw null;
        }
        imageView2.setOnClickListener(new lq.g(21, this, groupDetailsDTO));
        TextView textView = this.f126556l;
        if (textView == null) {
            s.m("groupNameTextView");
            throw null;
        }
        textView.setText(groupDetailsDTO.f31559b);
        GroupDTO.e eVar = groupDetailsDTO.f31567j;
        int i14 = eVar == null ? -1 : a.f126570b[eVar.ordinal()];
        ImageView imageView3 = this.f126557m;
        if (i14 == 1) {
            if (imageView3 == null) {
                s.m("groupPrivacyImageView");
                throw null;
            }
            imageView3.setImageResource(R.drawable.unlock);
            TextView textView2 = this.f126558n;
            if (textView2 == null) {
                s.m("groupPrivacyTextView");
                throw null;
            }
            textView2.setText(R.string.lbl_public);
        } else {
            if (imageView3 == null) {
                s.m("groupPrivacyImageView");
                throw null;
            }
            imageView3.setImageResource(R.drawable.lock);
            TextView textView3 = this.f126558n;
            if (textView3 == null) {
                s.m("groupPrivacyTextView");
                throw null;
            }
            textView3.setText(R.string.lbl_private);
        }
        String str2 = groupDetailsDTO.f31569l;
        TextView textView4 = this.f126560p;
        if (textView4 == null) {
            s.m("groupLocationTextView");
            throw null;
        }
        textView4.setText(str2);
        TextView textView5 = this.f126560p;
        if (textView5 == null) {
            s.m("groupLocationTextView");
            throw null;
        }
        v22.e.r(textView5, g22.n.d(str2));
        ImageView imageView4 = this.f126559o;
        if (imageView4 == null) {
            s.m("groupLocationImageView");
            throw null;
        }
        v22.e.r(imageView4, g22.n.d(str2));
        boolean zF = jm0.e.f(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), groupDetailsDTO);
        jm0.e eVar2 = jm0.e.f99565a;
        GroupDTO.c cVar3 = groupDetailsDTO.f31578w;
        eVar2.getClass();
        boolean zD = jm0.e.d(cVar3);
        ImageView imageView5 = this.f126561q;
        if (imageView5 == null) {
            s.m("groupAdminImageView");
            throw null;
        }
        v22.e.r(imageView5, zF || zD);
        TextView textView6 = this.f126562r;
        if (textView6 == null) {
            s.m("groupAdminTextView");
            throw null;
        }
        v22.e.r(textView6, zF || zD);
        TextView textView7 = this.f126562r;
        if (textView7 == null) {
            s.m("groupAdminTextView");
            throw null;
        }
        textView7.setText(getString(zF ? R.string.lbl_owner : R.string.lbl_admin));
        UserLevelImageView userLevelImageView = this.f126565w;
        if (userLevelImageView == null) {
            s.m("profileImageViewRight");
            throw null;
        }
        UserLevelImageView userLevelImageView2 = this.f126564v;
        if (userLevelImageView2 == null) {
            s.m("profileImageViewMiddle");
            throw null;
        }
        UserLevelImageView userLevelImageView3 = this.f126563t;
        if (userLevelImageView3 == null) {
            s.m("profileImageViewLeft");
            throw null;
        }
        List listK = x.k(userLevelImageView, userLevelImageView2, userLevelImageView3);
        int i15 = groupDetailsDTO.f31580y;
        int i16 = 0;
        for (Object obj : listK) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                x.q();
                throw null;
            }
            UserLevelImageView userLevelImageView4 = (UserLevelImageView) obj;
            if (i16 < i15) {
                v22.e.q(userLevelImageView4);
                List<String> list = groupDetailsDTO.A;
                userLevelImageView4.setProfileImageData(new b12.b(list != null ? (String) h0.e0(i16, list) : null, null, null, null, null, 30, null));
            } else {
                v22.e.j(userLevelImageView4);
            }
            i16 = i17;
        }
        if (listK.isEmpty()) {
            z14 = true;
            break;
        }
        Iterator it = listK.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((UserLevelImageView) it.next()).getVisibility() != 8) {
                    z14 = false;
                    break;
                }
            } else {
                z14 = true;
                break;
            }
        }
        TextView textView8 = this.f126566x;
        if (z14) {
            if (textView8 == null) {
                s.m("groupMemberDescriptionTextView");
                throw null;
            }
            textView8.setVisibility(8);
        } else {
            if (textView8 == null) {
                s.m("groupMemberDescriptionTextView");
                throw null;
            }
            textView8.setText(groupDetailsDTO.f31580y == 1 ? getString(R.string.lbl_one_member) : getString(R.string.lbl_number_of_members_plural, NumberFormat.getInstance().format(groupDetailsDTO.f31580y)));
            TextView textView9 = this.f126566x;
            if (textView9 == null) {
                s.m("groupMemberDescriptionTextView");
                throw null;
            }
            textView9.setVisibility(0);
        }
        ImageView imageView6 = this.f126555k;
        if (imageView6 == null) {
            s.m("groupIconImageView");
            throw null;
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        Resources resources = getResources();
        resources.getClass();
        imageView6.setImageDrawable(r0.a(contextRequireContext2, R.drawable.user_groups, R.color.gcm_connection_color, R.color.gcm_icon_on_color, (int) xy2.b.n(resources, 1.0f), R.color.gcm_icon_stroke, r0.a.LARGE));
        String str3 = groupDetailsDTO.f31560c;
        ViewGroup viewGroup = this.f126567y;
        if (viewGroup == null) {
            s.m("descriptionSection");
            throw null;
        }
        v22.e.r(viewGroup, g22.n.d(str3));
        TextView textView10 = this.f126568z;
        if (textView10 == null) {
            s.m("descriptionTextView");
            throw null;
        }
        textView10.setText(str3);
        ArrayList arrayList = groupDetailsDTO.f31573p;
        arrayList.getClass();
        ArrayList<com.garmin.android.apps.connectmobile.connections.groups.services.model.e> arrayListJ = jm0.e.j(arrayList);
        ViewGroup viewGroup2 = this.A;
        if (viewGroup2 == null) {
            s.m("whatWeDoSection");
            throw null;
        }
        v22.e.r(viewGroup2, !arrayListJ.isEmpty());
        LinearLayout linearLayout = this.B;
        if (linearLayout == null) {
            s.m("whatWeDoLayout");
            throw null;
        }
        linearLayout.removeAllViews();
        jm0.e.f99565a.getClass();
        ArrayList<com.garmin.android.apps.connectmobile.group.service.model.b> arrayList2 = new ArrayList();
        for (com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar3 : arrayListJ) {
            switch (eVar3 == null ? -1 : jm0.e.b.f99568a[eVar3.ordinal()]) {
                case 1:
                    arrayList2.add(com.garmin.android.apps.connectmobile.group.service.model.b.WALKING);
                    break;
                case 2:
                    arrayList2.add(com.garmin.android.apps.connectmobile.group.service.model.b.RUNNING);
                    break;
                case 3:
                    arrayList2.add(com.garmin.android.apps.connectmobile.group.service.model.b.ROAD_CYCLING);
                    break;
                case 4:
                    arrayList2.add(com.garmin.android.apps.connectmobile.group.service.model.b.MOUNTAIN_CYCLING);
                    break;
                case 5:
                    arrayList2.add(com.garmin.android.apps.connectmobile.group.service.model.b.SWIMMING);
                    break;
                case 6:
                    arrayList2.add(com.garmin.android.apps.connectmobile.group.service.model.b.TRIATHLON);
                    break;
                case 7:
                    arrayList2.add(com.garmin.android.apps.connectmobile.group.service.model.b.PARASPORTS);
                    break;
                case 8:
                    arrayList2.add(com.garmin.android.apps.connectmobile.group.service.model.b.GOLF);
                    break;
                case 9:
                    arrayList2.add(com.garmin.android.apps.connectmobile.group.service.model.b.OTHER);
                    break;
            }
        }
        for (com.garmin.android.apps.connectmobile.group.service.model.b bVar2 : arrayList2) {
            LinearLayout linearLayout2 = this.B;
            if (linearLayout2 == null) {
                s.m("whatWeDoLayout");
                throw null;
            }
            int i18 = bVar2.f36408a;
            String string = getString(bVar2.f36409b);
            string.getClass();
            String str4 = groupDetailsDTO.f31574q;
            if (bVar2 != com.garmin.android.apps.connectmobile.group.service.model.b.OTHER) {
                str4 = null;
            }
            View viewInflate = getLayoutInflater().inflate(R.layout.item_group_what_we_do, (ViewGroup) null);
            if (viewInflate != null) {
                ((ImageView) viewInflate.findViewById(R.id.what_we_do_activity_image_view)).setImageResource(i18);
                ((TextView) viewInflate.findViewById(R.id.what_we_do_activity_text_view)).setText(string);
                TextView textView11 = (TextView) viewInflate.findViewById(R.id.what_we_do_activity_hint_text_view);
                textView11.setText(str4);
                v22.e.r(textView11, g22.n.d(str4));
                linearLayout2.addView(viewInflate);
            }
        }
        ViewGroup viewGroup3 = this.C;
        if (viewGroup3 == null) {
            s.m("connectWithUsSection");
            throw null;
        }
        viewGroup3.setVisibility(8);
        LinearLayout linearLayout3 = this.D;
        if (linearLayout3 == null) {
            s.m("connectWithUsLayout");
            throw null;
        }
        linearLayout3.removeAllViews();
        final String str5 = groupDetailsDTO.f31571n;
        boolean zD2 = g22.n.d(str5);
        boolean z15 = this.E;
        if (!zD2 || z15) {
            str5 = null;
        }
        if (str5 != null) {
            ViewGroup viewGroup4 = this.C;
            if (viewGroup4 == null) {
                s.m("connectWithUsSection");
                throw null;
            }
            viewGroup4.setVisibility(0);
            LinearLayout linearLayout4 = this.D;
            if (linearLayout4 == null) {
                s.m("connectWithUsLayout");
                throw null;
            }
            String string2 = getString(R.string.facebook);
            string2.getClass();
            final int i19 = 0;
            I6(linearLayout4, 2131232677, string2, "", new View.OnClickListener(this) { // from class: nm0.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f126550b;

                {
                    this.f126550b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i19) {
                        case 0:
                            final d dVar = this.f126550b;
                            Context contextRequireContext3 = dVar.requireContext();
                            contextRequireContext3.getClass();
                            final int i24 = 2;
                            final String str6 = str5;
                            jm0.d.a(new e23.a() { // from class: nm0.a
                                @Override // e23.a
                                public final Object invoke() {
                                    String strReplaceFirst;
                                    switch (i24) {
                                        case 0:
                                            Uri uri = Uri.parse(str6);
                                            uri.getClass();
                                            g22.e.i(dVar, uri);
                                            break;
                                        case 1:
                                            d dVar2 = dVar;
                                            String str7 = str6;
                                            try {
                                                if (u.y(str7, "@", false)) {
                                                    strReplaceFirst = new k("@").f57698a.matcher(str7).replaceFirst("");
                                                    strReplaceFirst.getClass();
                                                } else {
                                                    strReplaceFirst = str7;
                                                }
                                                dVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=".concat(strReplaceFirst))));
                                            } catch (ActivityNotFoundException unused) {
                                                Uri uri2 = Uri.parse("https://twitter.com/".concat(str7));
                                                uri2.getClass();
                                                g22.e.i(dVar2, uri2);
                                            }
                                            break;
                                        default:
                                            Uri uri3 = Uri.parse(str6);
                                            uri3.getClass();
                                            g22.e.i(dVar, uri3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, contextRequireContext3);
                            break;
                        case 1:
                            final d dVar2 = this.f126550b;
                            Context contextRequireContext4 = dVar2.requireContext();
                            contextRequireContext4.getClass();
                            final int i25 = 1;
                            final String str7 = str5;
                            jm0.d.a(new e23.a() { // from class: nm0.a
                                @Override // e23.a
                                public final Object invoke() {
                                    String strReplaceFirst;
                                    switch (i25) {
                                        case 0:
                                            Uri uri = Uri.parse(str7);
                                            uri.getClass();
                                            g22.e.i(dVar2, uri);
                                            break;
                                        case 1:
                                            d dVar3 = dVar2;
                                            String str8 = str7;
                                            try {
                                                if (u.y(str8, "@", false)) {
                                                    strReplaceFirst = new k("@").f57698a.matcher(str8).replaceFirst("");
                                                    strReplaceFirst.getClass();
                                                } else {
                                                    strReplaceFirst = str8;
                                                }
                                                dVar3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=".concat(strReplaceFirst))));
                                            } catch (ActivityNotFoundException unused) {
                                                Uri uri2 = Uri.parse("https://twitter.com/".concat(str8));
                                                uri2.getClass();
                                                g22.e.i(dVar3, uri2);
                                            }
                                            break;
                                        default:
                                            Uri uri3 = Uri.parse(str7);
                                            uri3.getClass();
                                            g22.e.i(dVar2, uri3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, contextRequireContext4);
                            break;
                        default:
                            final d dVar3 = this.f126550b;
                            Context contextRequireContext5 = dVar3.requireContext();
                            contextRequireContext5.getClass();
                            final int i26 = 0;
                            final String str8 = str5;
                            jm0.d.a(new e23.a() { // from class: nm0.a
                                @Override // e23.a
                                public final Object invoke() {
                                    String strReplaceFirst;
                                    switch (i26) {
                                        case 0:
                                            Uri uri = Uri.parse(str8);
                                            uri.getClass();
                                            g22.e.i(dVar3, uri);
                                            break;
                                        case 1:
                                            d dVar4 = dVar3;
                                            String str9 = str8;
                                            try {
                                                if (u.y(str9, "@", false)) {
                                                    strReplaceFirst = new k("@").f57698a.matcher(str9).replaceFirst("");
                                                    strReplaceFirst.getClass();
                                                } else {
                                                    strReplaceFirst = str9;
                                                }
                                                dVar4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=".concat(strReplaceFirst))));
                                            } catch (ActivityNotFoundException unused) {
                                                Uri uri2 = Uri.parse("https://twitter.com/".concat(str9));
                                                uri2.getClass();
                                                g22.e.i(dVar4, uri2);
                                            }
                                            break;
                                        default:
                                            Uri uri3 = Uri.parse(str8);
                                            uri3.getClass();
                                            g22.e.i(dVar3, uri3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, contextRequireContext5);
                            break;
                    }
                }
            });
        }
        final String str6 = groupDetailsDTO.f31572o;
        if (!g22.n.d(str6) || z15) {
            str6 = null;
        }
        if (str6 != null) {
            ViewGroup viewGroup5 = this.C;
            if (viewGroup5 == null) {
                s.m("connectWithUsSection");
                throw null;
            }
            viewGroup5.setVisibility(0);
            LinearLayout linearLayout5 = this.D;
            if (linearLayout5 == null) {
                s.m("connectWithUsLayout");
                throw null;
            }
            String string3 = getString(R.string.f28714x);
            string3.getClass();
            final int i24 = 1;
            I6(linearLayout5, 2131232801, string3, "", new View.OnClickListener(this) { // from class: nm0.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f126550b;

                {
                    this.f126550b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i24) {
                        case 0:
                            final d dVar = this.f126550b;
                            Context contextRequireContext3 = dVar.requireContext();
                            contextRequireContext3.getClass();
                            final int i25 = 2;
                            final String str7 = str6;
                            jm0.d.a(new e23.a() { // from class: nm0.a
                                @Override // e23.a
                                public final Object invoke() {
                                    String strReplaceFirst;
                                    switch (i25) {
                                        case 0:
                                            Uri uri = Uri.parse(str7);
                                            uri.getClass();
                                            g22.e.i(dVar, uri);
                                            break;
                                        case 1:
                                            d dVar4 = dVar;
                                            String str9 = str7;
                                            try {
                                                if (u.y(str9, "@", false)) {
                                                    strReplaceFirst = new k("@").f57698a.matcher(str9).replaceFirst("");
                                                    strReplaceFirst.getClass();
                                                } else {
                                                    strReplaceFirst = str9;
                                                }
                                                dVar4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=".concat(strReplaceFirst))));
                                            } catch (ActivityNotFoundException unused) {
                                                Uri uri2 = Uri.parse("https://twitter.com/".concat(str9));
                                                uri2.getClass();
                                                g22.e.i(dVar4, uri2);
                                            }
                                            break;
                                        default:
                                            Uri uri3 = Uri.parse(str7);
                                            uri3.getClass();
                                            g22.e.i(dVar, uri3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, contextRequireContext3);
                            break;
                        case 1:
                            final d dVar2 = this.f126550b;
                            Context contextRequireContext4 = dVar2.requireContext();
                            contextRequireContext4.getClass();
                            final int i26 = 1;
                            final String str8 = str6;
                            jm0.d.a(new e23.a() { // from class: nm0.a
                                @Override // e23.a
                                public final Object invoke() {
                                    String strReplaceFirst;
                                    switch (i26) {
                                        case 0:
                                            Uri uri = Uri.parse(str8);
                                            uri.getClass();
                                            g22.e.i(dVar2, uri);
                                            break;
                                        case 1:
                                            d dVar4 = dVar2;
                                            String str9 = str8;
                                            try {
                                                if (u.y(str9, "@", false)) {
                                                    strReplaceFirst = new k("@").f57698a.matcher(str9).replaceFirst("");
                                                    strReplaceFirst.getClass();
                                                } else {
                                                    strReplaceFirst = str9;
                                                }
                                                dVar4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=".concat(strReplaceFirst))));
                                            } catch (ActivityNotFoundException unused) {
                                                Uri uri2 = Uri.parse("https://twitter.com/".concat(str9));
                                                uri2.getClass();
                                                g22.e.i(dVar4, uri2);
                                            }
                                            break;
                                        default:
                                            Uri uri3 = Uri.parse(str8);
                                            uri3.getClass();
                                            g22.e.i(dVar2, uri3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, contextRequireContext4);
                            break;
                        default:
                            final d dVar3 = this.f126550b;
                            Context contextRequireContext5 = dVar3.requireContext();
                            contextRequireContext5.getClass();
                            final int i27 = 0;
                            final String str9 = str6;
                            jm0.d.a(new e23.a() { // from class: nm0.a
                                @Override // e23.a
                                public final Object invoke() {
                                    String strReplaceFirst;
                                    switch (i27) {
                                        case 0:
                                            Uri uri = Uri.parse(str9);
                                            uri.getClass();
                                            g22.e.i(dVar3, uri);
                                            break;
                                        case 1:
                                            d dVar4 = dVar3;
                                            String str10 = str9;
                                            try {
                                                if (u.y(str10, "@", false)) {
                                                    strReplaceFirst = new k("@").f57698a.matcher(str10).replaceFirst("");
                                                    strReplaceFirst.getClass();
                                                } else {
                                                    strReplaceFirst = str10;
                                                }
                                                dVar4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=".concat(strReplaceFirst))));
                                            } catch (ActivityNotFoundException unused) {
                                                Uri uri2 = Uri.parse("https://twitter.com/".concat(str10));
                                                uri2.getClass();
                                                g22.e.i(dVar4, uri2);
                                            }
                                            break;
                                        default:
                                            Uri uri3 = Uri.parse(str9);
                                            uri3.getClass();
                                            g22.e.i(dVar3, uri3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, contextRequireContext5);
                            break;
                    }
                }
            });
        }
        final String str7 = groupDetailsDTO.f31570m;
        if (!g22.n.d(str7)) {
            str7 = null;
        }
        if (str7 != null) {
            ViewGroup viewGroup6 = this.C;
            if (viewGroup6 == null) {
                s.m("connectWithUsSection");
                throw null;
            }
            viewGroup6.setVisibility(0);
            LinearLayout linearLayout6 = this.D;
            if (linearLayout6 == null) {
                s.m("connectWithUsLayout");
                throw null;
            }
            String string4 = getString(R.string.lbl_website);
            string4.getClass();
            final int i25 = 2;
            I6(linearLayout6, 2131232800, string4, new k("http(s)?://").f(str7, ""), new View.OnClickListener(this) { // from class: nm0.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f126550b;

                {
                    this.f126550b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i25) {
                        case 0:
                            final d dVar = this.f126550b;
                            Context contextRequireContext3 = dVar.requireContext();
                            contextRequireContext3.getClass();
                            final int i26 = 2;
                            final String str8 = str7;
                            jm0.d.a(new e23.a() { // from class: nm0.a
                                @Override // e23.a
                                public final Object invoke() {
                                    String strReplaceFirst;
                                    switch (i26) {
                                        case 0:
                                            Uri uri = Uri.parse(str8);
                                            uri.getClass();
                                            g22.e.i(dVar, uri);
                                            break;
                                        case 1:
                                            d dVar4 = dVar;
                                            String str10 = str8;
                                            try {
                                                if (u.y(str10, "@", false)) {
                                                    strReplaceFirst = new k("@").f57698a.matcher(str10).replaceFirst("");
                                                    strReplaceFirst.getClass();
                                                } else {
                                                    strReplaceFirst = str10;
                                                }
                                                dVar4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=".concat(strReplaceFirst))));
                                            } catch (ActivityNotFoundException unused) {
                                                Uri uri2 = Uri.parse("https://twitter.com/".concat(str10));
                                                uri2.getClass();
                                                g22.e.i(dVar4, uri2);
                                            }
                                            break;
                                        default:
                                            Uri uri3 = Uri.parse(str8);
                                            uri3.getClass();
                                            g22.e.i(dVar, uri3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, contextRequireContext3);
                            break;
                        case 1:
                            final d dVar2 = this.f126550b;
                            Context contextRequireContext4 = dVar2.requireContext();
                            contextRequireContext4.getClass();
                            final int i27 = 1;
                            final String str9 = str7;
                            jm0.d.a(new e23.a() { // from class: nm0.a
                                @Override // e23.a
                                public final Object invoke() {
                                    String strReplaceFirst;
                                    switch (i27) {
                                        case 0:
                                            Uri uri = Uri.parse(str9);
                                            uri.getClass();
                                            g22.e.i(dVar2, uri);
                                            break;
                                        case 1:
                                            d dVar4 = dVar2;
                                            String str10 = str9;
                                            try {
                                                if (u.y(str10, "@", false)) {
                                                    strReplaceFirst = new k("@").f57698a.matcher(str10).replaceFirst("");
                                                    strReplaceFirst.getClass();
                                                } else {
                                                    strReplaceFirst = str10;
                                                }
                                                dVar4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=".concat(strReplaceFirst))));
                                            } catch (ActivityNotFoundException unused) {
                                                Uri uri2 = Uri.parse("https://twitter.com/".concat(str10));
                                                uri2.getClass();
                                                g22.e.i(dVar4, uri2);
                                            }
                                            break;
                                        default:
                                            Uri uri3 = Uri.parse(str9);
                                            uri3.getClass();
                                            g22.e.i(dVar2, uri3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, contextRequireContext4);
                            break;
                        default:
                            final d dVar3 = this.f126550b;
                            Context contextRequireContext5 = dVar3.requireContext();
                            contextRequireContext5.getClass();
                            final int i28 = 0;
                            final String str10 = str7;
                            jm0.d.a(new e23.a() { // from class: nm0.a
                                @Override // e23.a
                                public final Object invoke() {
                                    String strReplaceFirst;
                                    switch (i28) {
                                        case 0:
                                            Uri uri = Uri.parse(str10);
                                            uri.getClass();
                                            g22.e.i(dVar3, uri);
                                            break;
                                        case 1:
                                            d dVar4 = dVar3;
                                            String str11 = str10;
                                            try {
                                                if (u.y(str11, "@", false)) {
                                                    strReplaceFirst = new k("@").f57698a.matcher(str11).replaceFirst("");
                                                    strReplaceFirst.getClass();
                                                } else {
                                                    strReplaceFirst = str11;
                                                }
                                                dVar4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?screen_name=".concat(strReplaceFirst))));
                                            } catch (ActivityNotFoundException unused) {
                                                Uri uri2 = Uri.parse("https://twitter.com/".concat(str11));
                                                uri2.getClass();
                                                g22.e.i(dVar4, uri2);
                                            }
                                            break;
                                        default:
                                            Uri uri3 = Uri.parse(str10);
                                            uri3.getClass();
                                            g22.e.i(dVar3, uri3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, contextRequireContext5);
                            break;
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        S6(view2);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.group_about_layout);
        linearLayout.getClass();
        ViewGroup viewGroup = (ViewGroup) linearLayout.findViewById(R.id.header_section);
        View viewFindViewById = viewGroup.findViewById(R.id.group_image_view);
        viewFindViewById.getClass();
        this.f126554j = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.group_icon_image_view);
        viewFindViewById2.getClass();
        this.f126555k = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.group_name_text_view);
        viewFindViewById3.getClass();
        this.f126556l = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.group_privacy_image_view);
        viewFindViewById4.getClass();
        this.f126557m = (ImageView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.group_privacy_text_view);
        viewFindViewById5.getClass();
        this.f126558n = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.group_location_image_view);
        viewFindViewById6.getClass();
        this.f126559o = (ImageView) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.group_location_text_view);
        viewFindViewById7.getClass();
        this.f126560p = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.group_admin_image_view);
        viewFindViewById8.getClass();
        this.f126561q = (ImageView) viewFindViewById8;
        View viewFindViewById9 = viewGroup.findViewById(R.id.group_admin_text_view);
        viewFindViewById9.getClass();
        this.f126562r = (TextView) viewFindViewById9;
        View viewFindViewById10 = viewGroup.findViewById(R.id.group_member_section);
        viewFindViewById10.getClass();
        ((ViewGroup) viewFindViewById10).setOnClickListener(new mt0.h0(this, 24));
        View viewFindViewById11 = viewGroup.findViewById(R.id.profile_image_1);
        viewFindViewById11.getClass();
        this.f126563t = (UserLevelImageView) viewFindViewById11;
        View viewFindViewById12 = viewGroup.findViewById(R.id.profile_image_2);
        viewFindViewById12.getClass();
        this.f126564v = (UserLevelImageView) viewFindViewById12;
        View viewFindViewById13 = viewGroup.findViewById(R.id.profile_image_3);
        viewFindViewById13.getClass();
        this.f126565w = (UserLevelImageView) viewFindViewById13;
        View viewFindViewById14 = viewGroup.findViewById(R.id.profile_images_description_text_view);
        viewFindViewById14.getClass();
        this.f126566x = (TextView) viewFindViewById14;
        View viewFindViewById15 = linearLayout.findViewById(R.id.description_section);
        View viewFindViewById16 = ((ViewGroup) viewFindViewById15).findViewById(R.id.description_text_view);
        viewFindViewById16.getClass();
        this.f126568z = (TextView) viewFindViewById16;
        viewFindViewById15.getClass();
        this.f126567y = (ViewGroup) viewFindViewById15;
        View viewFindViewById17 = linearLayout.findViewById(R.id.what_we_do_section);
        View viewFindViewById18 = ((ViewGroup) viewFindViewById17).findViewById(R.id.what_we_do_layout);
        viewFindViewById18.getClass();
        this.B = (LinearLayout) viewFindViewById18;
        viewFindViewById17.getClass();
        this.A = (ViewGroup) viewFindViewById17;
        View viewFindViewById19 = linearLayout.findViewById(R.id.connect_with_us_section);
        View viewFindViewById20 = ((ViewGroup) viewFindViewById19).findViewById(R.id.connect_with_us_layout);
        viewFindViewById20.getClass();
        this.D = (LinearLayout) viewFindViewById20;
        viewFindViewById19.getClass();
        this.C = (ViewGroup) viewFindViewById19;
        GroupDetailsDTO groupDetailsDTO = K6().f119507c;
        if (groupDetailsDTO != null) {
            U6(groupDetailsDTO);
        }
        l2<GroupDetailsDTO> l2Var = K6().f119515k;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(l2Var, viewLifecycleOwner, new b(new nm0.b(this, 1)));
    }
}
