package pl1;

import am.r1;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.library.mapsdkadapter.i;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lpl1/d;", "Landroidx/fragment/app/Fragment;", "Lr51/d$a;", "<init>", "()V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment implements r51.d.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f138528n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f138529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f138530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f138531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f138532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComposeView f138533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f138534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f138535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexTwoLineButton f138536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f138537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f138538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f138539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f138540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f138541m;

    public interface b {
        void D4(long j8);

        void G5(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar);

        void e7();

        void p8();

        void x3();
    }

    @Override // r51.d.a
    public final void O1(long j8) {
        b bVar = this.f138529a;
        if (bVar != null) {
            bVar.D4(j8);
        }
    }

    @Override // r51.d.a
    public final void d0(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar) {
        b bVar2 = this.f138529a;
        if (bVar2 != null) {
            bVar2.G5(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof b) {
            this.f138529a = (b) context;
            return;
        }
        throw new RuntimeException(context + " must implement InteractionListener.");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.shareable_event_details_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f138529a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.logo);
        viewFindViewById.getClass();
        this.f138530b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.title);
        viewFindViewById2.getClass();
        this.f138531c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.shareImg);
        viewFindViewById3.getClass();
        this.f138532d = (ImageView) viewFindViewById3;
        this.f138533e = (ComposeView) view2.findViewById(R.id.type);
        View viewFindViewById4 = view2.findViewById(R.id.pacebands_header);
        viewFindViewById4.getClass();
        this.f138534f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.pacebands_recyclerview);
        viewFindViewById5.getClass();
        this.f138535g = (RecyclerView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.create_pace_pro_strategy);
        viewFindViewById6.getClass();
        this.f138536h = (GCMComplexTwoLineButton) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.modify_event_hint);
        viewFindViewById7.getClass();
        this.f138537i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.disclaimer);
        viewFindViewById8.getClass();
        this.f138538j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.button_space);
        viewFindViewById9.getClass();
        this.f138539k = (Button) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.add_to_calendar);
        viewFindViewById10.getClass();
        this.f138540l = (Button) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.subtitle);
        viewFindViewById11.getClass();
        this.f138541m = (TextView) viewFindViewById11;
        if (getArguments() == null || !requireArguments().containsKey("eventUIModel")) {
            return;
        }
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("eventUIModel") : null;
            parcelable = (ol1.c) (parcelable2 instanceof ol1.c ? parcelable2 : null);
        } else if (bundleRequireArguments != null) {
            parcelable = (Parcelable) bundleRequireArguments.getParcelable("eventUIModel", ol1.c.class);
        }
        ol1.c cVar = (ol1.c) parcelable;
        if (cVar == null) {
            return;
        }
        u6(cVar);
    }

    public final void u6(ol1.c cVar) {
        cVar.getClass();
        List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list = cVar.f132853r;
        String str = cVar.f132836a;
        List<GeoPointDTO> list2 = cVar.f132851p;
        Boolean bool = cVar.f132850o;
        Boolean bool2 = cVar.f132848m;
        Long l14 = cVar.f132843h;
        if (l14 != null) {
            Fragment fragmentG = getChildFragmentManager().G("ShareableEventMapFragment");
            if (fragmentG == null) {
                v childFragmentManager = getChildFragmentManager();
                androidx.fragment.app.a aVarB = j.b(childFragmentManager, childFragmentManager);
                e.a aVar = e.f138542h;
                i.b bVar = cVar.f132852q;
                aVar.getClass();
                e eVar = new e();
                Bundle bundle = new Bundle();
                if (!list2.isEmpty()) {
                    bundle.putParcelableArrayList("courseDetailsDTOExtraKey", (ArrayList) list2);
                } else {
                    bundle.putParcelableArrayList("courseDetailsDTOExtraKey", new ArrayList<>());
                }
                bundle.putInt("courseGeodeticSystemExtraKey", bVar.ordinal());
                eVar.setArguments(bundle);
                aVarB.l(R.id.map_container, eVar, "ShareableEventMapFragment");
                aVarB.e();
            } else {
                e eVar2 = (e) fragmentG;
                eVar2.f138543e = list2;
                eVar2.w6();
            }
        }
        if (str == null) {
            ImageView imageView = this.f138530b;
            if (imageView == null) {
                s.m("logo");
                throw null;
            }
            imageView.setImageResource(R.drawable.gcm3_calendar_list_icon_events);
        } else {
            zp0.c cVar2 = new zp0.c(this);
            cVar2.f206565e = str;
            cVar2.f206570j = R.drawable.gcm3_calendar_list_icon_events;
            cVar2.a("circle_mask");
            ImageView imageView2 = this.f138530b;
            if (imageView2 == null) {
                s.m("logo");
                throw null;
            }
            cVar2.h(imageView2);
        }
        TextView textView = this.f138531c;
        if (textView == null) {
            s.m("title");
            throw null;
        }
        textView.setText(cVar.f132837b);
        Double d14 = cVar.f132838c;
        TextView textView2 = this.f138541m;
        if (l14 == null) {
            if (textView2 == null) {
                s.m("subtitle");
                throw null;
            }
            textView2.setVisibility(8);
        } else {
            if (textView2 == null) {
                s.m("subtitle");
                throw null;
            }
            textView2.setVisibility(0);
            if (d14 == null || Double.isNaN(d14.doubleValue()) || Double.compare(d14.doubleValue(), 0) <= 0) {
                TextView textView3 = this.f138541m;
                if (textView3 == null) {
                    s.m("subtitle");
                    throw null;
                }
                textView3.setText(getString(R.string.no_value));
            } else {
                l3.a aVar2 = l3.f23124b;
                Context context = getContext();
                double dDoubleValue = d14.doubleValue();
                DecimalFormat decimalFormat = l3.f23129g;
                aVar2.getClass();
                String strQ = l3.a.Q(context, dDoubleValue, decimalFormat, true, true);
                String strQ2 = l3.a.Q(getContext(), d14.doubleValue(), l3.f23129g, true, false);
                TextView textView4 = this.f138541m;
                if (textView4 == null) {
                    s.m("subtitle");
                    throw null;
                }
                textView4.setText(getString(R.string.string_space_bullet_string_pattern, strQ, strQ2));
            }
        }
        Boolean bool3 = Boolean.TRUE;
        if (s.g(bool2, bool3) && s.g(cVar.f132847l, bool3) && !s.g(bool, bool3)) {
            ImageView imageView3 = this.f138532d;
            if (imageView3 == null) {
                s.m("shareImg");
                throw null;
            }
            imageView3.setVisibility(0);
            ImageView imageView4 = this.f138532d;
            if (imageView4 == null) {
                s.m("shareImg");
                throw null;
            }
            final int i14 = 0;
            imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: pl1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f138523b;

                {
                    this.f138523b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i15 = i14;
                    d dVar = this.f138523b;
                    switch (i15) {
                        case 0:
                            d.a aVar3 = d.f138528n;
                            com.garmin.android.apps.connectmobile.social.share.b.a aVar4 = com.garmin.android.apps.connectmobile.social.share.b.f44643d;
                            Intent intentQ = r1.q("TODO event link", "TODO Subject");
                            aVar4.getClass();
                            com.garmin.android.apps.connectmobile.social.share.b bVarA = com.garmin.android.apps.connectmobile.social.share.b.a.a(intentQ, false);
                            bVarA.show(dVar.getParentFragmentManager(), bVarA.getTag());
                            break;
                        case 1:
                            d.b bVar2 = dVar.f138529a;
                            if (bVar2 != null) {
                                bVar2.x3();
                            }
                            break;
                        default:
                            d.b bVar3 = dVar.f138529a;
                            if (bVar3 != null) {
                                bVar3.e7();
                            }
                            break;
                    }
                }
            });
        } else {
            ImageView imageView5 = this.f138532d;
            if (imageView5 == null) {
                s.m("shareImg");
                throw null;
            }
            imageView5.setVisibility(8);
        }
        String string = getString(R.string.no_value);
        string.getClass();
        ComposeView composeView = this.f138533e;
        if (composeView != null) {
            composeView.setContent(new z3.e(832836494, true, new c(cVar, string, this, 0)));
        }
        if (!s.g(bool2, bool3) || list == null || list.isEmpty() || getContext() == null) {
            TextView textView5 = this.f138534f;
            if (textView5 == null) {
                s.m("pacebandsHeader");
                throw null;
            }
            textView5.setVisibility(8);
            RecyclerView recyclerView = this.f138535g;
            if (recyclerView == null) {
                s.m("pacebandsRecyclerview");
                throw null;
            }
            recyclerView.setVisibility(8);
        } else {
            TextView textView6 = this.f138534f;
            if (textView6 == null) {
                s.m("pacebandsHeader");
                throw null;
            }
            textView6.setVisibility(0);
            RecyclerView recyclerView2 = this.f138535g;
            if (recyclerView2 == null) {
                s.m("pacebandsRecyclerview");
                throw null;
            }
            recyclerView2.setVisibility(0);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            r51.d dVar = new r51.d(contextRequireContext, this);
            ArrayList<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> arrayList = dVar.f150487e;
            arrayList.clear();
            arrayList.addAll(list);
            dVar.notifyDataSetChanged();
            RecyclerView recyclerView3 = this.f138535g;
            if (recyclerView3 == null) {
                s.m("pacebandsRecyclerview");
                throw null;
            }
            recyclerView3.setAdapter(dVar);
            RecyclerView recyclerView4 = this.f138535g;
            if (recyclerView4 == null) {
                s.m("pacebandsRecyclerview");
                throw null;
            }
            recyclerView4.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        if (!s.g(bool2, bool3) || l14 == null || s.g(bool, bool3)) {
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f138536h;
            if (gCMComplexTwoLineButton == null) {
                s.m("createPaceProStrategy");
                throw null;
            }
            gCMComplexTwoLineButton.setVisibility(8);
        } else {
            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f138536h;
            if (gCMComplexTwoLineButton2 == null) {
                s.m("createPaceProStrategy");
                throw null;
            }
            gCMComplexTwoLineButton2.setVisibility(0);
            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f138536h;
            if (gCMComplexTwoLineButton3 == null) {
                s.m("createPaceProStrategy");
                throw null;
            }
            final int i15 = 1;
            gCMComplexTwoLineButton3.setOnClickListener(new View.OnClickListener(this) { // from class: pl1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f138523b;

                {
                    this.f138523b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i16 = i15;
                    d dVar2 = this.f138523b;
                    switch (i16) {
                        case 0:
                            d.a aVar3 = d.f138528n;
                            com.garmin.android.apps.connectmobile.social.share.b.a aVar4 = com.garmin.android.apps.connectmobile.social.share.b.f44643d;
                            Intent intentQ = r1.q("TODO event link", "TODO Subject");
                            aVar4.getClass();
                            com.garmin.android.apps.connectmobile.social.share.b bVarA = com.garmin.android.apps.connectmobile.social.share.b.a.a(intentQ, false);
                            bVarA.show(dVar2.getParentFragmentManager(), bVarA.getTag());
                            break;
                        case 1:
                            d.b bVar2 = dVar2.f138529a;
                            if (bVar2 != null) {
                                bVar2.x3();
                            }
                            break;
                        default:
                            d.b bVar3 = dVar2.f138529a;
                            if (bVar3 != null) {
                                bVar3.e7();
                            }
                            break;
                    }
                }
            });
        }
        if (!s.g(cVar.f132849n, bool3) || s.g(bool, bool3)) {
            TextView textView7 = this.f138537i;
            if (textView7 == null) {
                s.m("modifyEventHint");
                throw null;
            }
            textView7.setVisibility(8);
        } else {
            TextView textView8 = this.f138537i;
            if (textView8 == null) {
                s.m("modifyEventHint");
                throw null;
            }
            textView8.setVisibility(0);
        }
        if (s.g(bool2, bool3) || l14 == null) {
            TextView textView9 = this.f138538j;
            if (textView9 == null) {
                s.m("disclaimer");
                throw null;
            }
            textView9.setVisibility(8);
        } else {
            TextView textView10 = this.f138538j;
            if (textView10 == null) {
                s.m("disclaimer");
                throw null;
            }
            textView10.setVisibility(0);
        }
        boolean zG = s.g(bool2, bool3);
        Button button = this.f138539k;
        if (zG) {
            if (button == null) {
                s.m("buttonSpace");
                throw null;
            }
            button.setVisibility(8);
            Button button2 = this.f138540l;
            if (button2 != null) {
                button2.setVisibility(8);
                return;
            } else {
                s.m("addToCalendar");
                throw null;
            }
        }
        if (button == null) {
            s.m("buttonSpace");
            throw null;
        }
        button.setVisibility(4);
        Button button3 = this.f138540l;
        if (button3 == null) {
            s.m("addToCalendar");
            throw null;
        }
        button3.setVisibility(0);
        Button button4 = this.f138540l;
        if (button4 == null) {
            s.m("addToCalendar");
            throw null;
        }
        final int i16 = 2;
        button4.setOnClickListener(new View.OnClickListener(this) { // from class: pl1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f138523b;

            {
                this.f138523b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                d dVar2 = this.f138523b;
                switch (i17) {
                    case 0:
                        d.a aVar3 = d.f138528n;
                        com.garmin.android.apps.connectmobile.social.share.b.a aVar4 = com.garmin.android.apps.connectmobile.social.share.b.f44643d;
                        Intent intentQ = r1.q("TODO event link", "TODO Subject");
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.social.share.b bVarA = com.garmin.android.apps.connectmobile.social.share.b.a.a(intentQ, false);
                        bVarA.show(dVar2.getParentFragmentManager(), bVarA.getTag());
                        break;
                    case 1:
                        d.b bVar2 = dVar2.f138529a;
                        if (bVar2 != null) {
                            bVar2.x3();
                        }
                        break;
                    default:
                        d.b bVar3 = dVar2.f138529a;
                        if (bVar3 != null) {
                            bVar3.e7();
                        }
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpl1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "BUNDLE_EXTRA_KEY_EVENT_UI_MODEL", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
