package dz1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexButton;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldz1/m;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f61773f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f61774g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ry1.a f61775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f61776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexButton f61777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexButton f61778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f61779e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"dz1/m$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.s
        public final void b() {
            m mVar = m.this;
            cz1.a aVar = (cz1.a) mVar.f61776b.getValue();
            GCMComplexButton gCMComplexButton = mVar.f61777c;
            if (gCMComplexButton == null) {
                p005kotlin.jvm.internal.s.m("inPersonButton");
                throw null;
            }
            ImageView imageView = gCMComplexButton.f45654b;
            ny1.g gVar = (imageView == null || imageView.getVisibility() != 0) ? ny1.g.VIRTUAL : ny1.g.IN_PERSON;
            gVar.getClass();
            my1.d dVar = (my1.d) aVar.L0.d();
            aVar.Z4().m(dVar != null ? my1.d.b(dVar, null, null, null, null, gVar, null, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048559) : null);
            mVar.f61779e.f(false);
            mVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f61781a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f61781a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f61781a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61781a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61782a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f61782a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f61782a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f61783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f61784b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f61783a = aVar;
            this.f61784b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f61783a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f61784b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61785a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f61785a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f61785a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f61774g = gt2.b.f79005a.h("TIFindEventFilterParticipationFragment");
    }

    public m() {
        super(R.layout.ti_find_event_filter_participation_fragment);
        this.f61776b = new w1(s0.f105811a.b(cz1.a.class), new d(this), new f(this), new e(null, this));
        this.f61779e = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f61775a = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIFindEventFilterParticipationFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((cz1.a) this.f61776b.getValue()).j5(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f61775a;
        if (aVar != null) {
            String string = getString(R.string.search_filter_participation);
            string.getClass();
            aVar.g(2, string);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f61779e, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.in_person_button);
        ((GCMComplexButton) viewFindViewById).a(false);
        viewFindViewById.getClass();
        this.f61777c = (GCMComplexButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.virtual_button);
        ((GCMComplexButton) viewFindViewById2).a(false);
        viewFindViewById2.getClass();
        this.f61778d = (GCMComplexButton) viewFindViewById2;
        GCMComplexButton gCMComplexButton = this.f61777c;
        if (gCMComplexButton == null) {
            p005kotlin.jvm.internal.s.m("inPersonButton");
            throw null;
        }
        final int i14 = 0;
        gCMComplexButton.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f61772b;

            {
                this.f61772b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                m mVar = this.f61772b;
                switch (i15) {
                    case 0:
                        m.a aVar2 = m.f61773f;
                        mVar.u6(ny1.g.IN_PERSON);
                        break;
                    default:
                        m.a aVar3 = m.f61773f;
                        mVar.u6(ny1.g.VIRTUAL);
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton2 = this.f61778d;
        if (gCMComplexButton2 == null) {
            p005kotlin.jvm.internal.s.m("virtualButton");
            throw null;
        }
        final int i15 = 1;
        gCMComplexButton2.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f61772b;

            {
                this.f61772b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                m mVar = this.f61772b;
                switch (i16) {
                    case 0:
                        m.a aVar2 = m.f61773f;
                        mVar.u6(ny1.g.IN_PERSON);
                        break;
                    default:
                        m.a aVar3 = m.f61773f;
                        mVar.u6(ny1.g.VIRTUAL);
                        break;
                }
            }
        });
        ((cz1.a) this.f61776b.getValue()).L0.f(getViewLifecycleOwner(), new c(new ds0.g(this, 2)));
    }

    public final void u6(ny1.g gVar) {
        GCMComplexButton gCMComplexButton = this.f61778d;
        if (gCMComplexButton == null) {
            p005kotlin.jvm.internal.s.m("virtualButton");
            throw null;
        }
        gCMComplexButton.a(gVar == ny1.g.VIRTUAL);
        GCMComplexButton gCMComplexButton2 = this.f61777c;
        if (gCMComplexButton2 != null) {
            gCMComplexButton2.a(gVar == ny1.g.IN_PERSON);
        } else {
            p005kotlin.jvm.internal.s.m("inPersonButton");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldz1/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
