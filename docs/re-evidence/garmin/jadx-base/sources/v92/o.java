package v92;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.consent.ui.view.ConsentScreenView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv92/o;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f176444m = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s92.g f176446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f176447c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f176449e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f176451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f176452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<s92.e> f176453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f176454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f176455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f176456l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f176445a = new w1(s0.f105811a.b(r.class), new b(this), new v10.a(8), new c(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView.ScaleType f176448d = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f176450f = new ArrayList();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176457a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f176457a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f176457a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f176458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f176459b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f176458a = aVar;
            this.f176459b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f176458a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f176459b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<s92.b> listB;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Object obj = null;
        if (arguments != null) {
            this.f176446b = (s92.g) arguments.getParcelable("extra_consent_text_dto");
            this.f176447c = (Uri) arguments.getParcelable("extra_top_image_uri");
            this.f176448d = ImageView.ScaleType.values()[arguments.getInt("extra_top_image_scale_type", ImageView.ScaleType.CENTER_CROP.ordinal())];
            m mVar = (m) arguments.getSerializable("extra_action_primary");
            if (mVar == null) {
                mVar = m.OPT_OUT;
            }
            this.f176454j = mVar;
            m mVar2 = (m) arguments.getSerializable("extra_action_secondary");
            if (mVar2 == null) {
                mVar2 = m.CANCEL;
            }
            this.f176455k = mVar2;
            Serializable serializable = arguments.getSerializable("extra_consent_screen");
            this.f176456l = serializable instanceof l ? (l) serializable : null;
        }
        s92.g gVar = this.f176446b;
        if (gVar != null) {
            m mVar3 = this.f176454j;
            if (mVar3 == null) {
                p005kotlin.jvm.internal.s.m("actionPrimary");
                throw null;
            }
            boolean z14 = mVar3 == m.OPT_OUT || mVar3 == m.GO_TO_OPT_OUT;
            this.f176449e = z14 ? gVar.getRevokeHeadline() : gVar.getHeadline();
            r rVar = (r) this.f176445a.getValue();
            s92.j jVar = rVar.f176470e ? s92.j.CHILD : rVar.f176469d != null ? s92.j.PARENT : s92.j.INDIVIDUAL;
            if (z14) {
                List<s92.f> listT = gVar.t();
                if (listT != null) {
                    for (Object obj2 : listT) {
                        if (((s92.f) obj2).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == jVar) {
                            obj = obj2;
                            break;
                        }
                    }
                    s92.f fVar = (s92.f) obj;
                    if (fVar == null || (listB = fVar.b()) == null) {
                        listB = gVar.q();
                    }
                } else {
                    listB = gVar.q();
                }
            } else {
                List<s92.f> listF = gVar.f();
                if (listF != null) {
                    for (Object obj3 : listF) {
                        if (((s92.f) obj3).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == jVar) {
                            obj = obj3;
                            break;
                        }
                    }
                    s92.f fVar2 = (s92.f) obj;
                    if (fVar2 == null || (listB = fVar2.b()) == null) {
                        listB = gVar.b();
                    }
                } else {
                    listB = gVar.b();
                }
            }
            if (listB != null && (!listB.isEmpty())) {
                Iterator<s92.b> it = listB.iterator();
                while (it.hasNext()) {
                    this.f176450f.add(it.next());
                }
            }
            this.f176451g = z14 ? gVar.getRevokeConsentButton() : gVar.getGrantButton();
            this.f176452h = z14 ? gVar.getRevokeCancelButton() : gVar.getRejectButton();
            this.f176453i = z14 ? gVar.s() : gVar.d();
        }
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.consent_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((r) this.f176445a.getValue()).f176474i.m(this.f176456l);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ConsentScreenView consentScreenView = (ConsentScreenView) view2.findViewById(R.id.consent_screen_view);
        consentScreenView.setTopImageScaleType(this.f176448d);
        consentScreenView.e(this.f176447c);
        consentScreenView.setHeadlineText(this.f176449e);
        ArrayList<s92.b> arrayList = this.f176450f;
        if (!arrayList.isEmpty()) {
            for (s92.b bVar : arrayList) {
                String copy = bVar.getCopy();
                if (copy != null) {
                    boolean zF = bVar.f();
                    s92.g gVar = this.f176446b;
                    consentScreenView.a(copy, gVar != null ? gVar.getConsentTypeId() : null, zF);
                }
            }
        }
        m mVar = this.f176454j;
        if (mVar == null) {
            p005kotlin.jvm.internal.s.m("actionPrimary");
            throw null;
        }
        final int i14 = 0;
        consentScreenView.f(mVar, this.f176451g, new View.OnClickListener(this) { // from class: v92.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176443b;

            {
                this.f176443b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        o oVar = this.f176443b;
                        s92.g gVar2 = oVar.f176446b;
                        if (gVar2 != null) {
                            y0<a> y0Var = ((r) oVar.f176445a.getValue()).f176473h;
                            m mVar2 = oVar.f176454j;
                            if (mVar2 != null) {
                                y0Var.m(new a.C3291a(mVar2, gVar2));
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("actionPrimary");
                                throw null;
                            }
                        }
                        return;
                    default:
                        o oVar2 = this.f176443b;
                        s92.g gVar3 = oVar2.f176446b;
                        if (gVar3 != null) {
                            y0<a> y0Var2 = ((r) oVar2.f176445a.getValue()).f176473h;
                            m mVar3 = oVar2.f176455k;
                            if (mVar3 != null) {
                                y0Var2.m(new a.C3291a(mVar3, gVar3));
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("actionSecondary");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        m mVar2 = this.f176455k;
        if (mVar2 == null) {
            p005kotlin.jvm.internal.s.m("actionSecondary");
            throw null;
        }
        final int i15 = 1;
        consentScreenView.g(mVar2, this.f176452h, new View.OnClickListener(this) { // from class: v92.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176443b;

            {
                this.f176443b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        o oVar = this.f176443b;
                        s92.g gVar2 = oVar.f176446b;
                        if (gVar2 != null) {
                            y0<a> y0Var = ((r) oVar.f176445a.getValue()).f176473h;
                            m mVar3 = oVar.f176454j;
                            if (mVar3 != null) {
                                y0Var.m(new a.C3291a(mVar3, gVar2));
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("actionPrimary");
                                throw null;
                            }
                        }
                        return;
                    default:
                        o oVar2 = this.f176443b;
                        s92.g gVar3 = oVar2.f176446b;
                        if (gVar3 != null) {
                            y0<a> y0Var2 = ((r) oVar2.f176445a.getValue()).f176473h;
                            m mVar4 = oVar2.f176455k;
                            if (mVar4 != null) {
                                y0Var2.m(new a.C3291a(mVar4, gVar3));
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("actionSecondary");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        List<s92.e> list = this.f176453i;
        if (list != null) {
            for (s92.e eVar : list) {
                if (eVar != null) {
                    String text = eVar.getText();
                    String url = eVar.getUrl();
                    if (text != null && url != null) {
                        consentScreenView.b(text, new ty0.a(this, text, url, 9));
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lv92/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONSENT_TEXT_DTO", "EXTRA_TOP_IMAGE_URI", "EXTRA_TOP_IMAGE_SCALE_TYPE", "EXTRA_ACTION_PRIMARY", "EXTRA_ACTION_SECONDARY", "EXTRA_CONSENT_SCREEN", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o a(s92.g gVar, Uri uri, m mVar, m mVar2, l lVar, ImageView.ScaleType scaleType) {
            gVar.getClass();
            mVar.getClass();
            mVar2.getClass();
            lVar.getClass();
            scaleType.getClass();
            Bundle bundle = new Bundle();
            o oVar = new o();
            bundle.putParcelable("extra_top_image_uri", uri);
            bundle.putParcelable("extra_consent_text_dto", gVar);
            bundle.putInt("extra_top_image_scale_type", scaleType.ordinal());
            bundle.putSerializable("extra_action_primary", mVar);
            bundle.putSerializable("extra_action_secondary", mVar2);
            bundle.putSerializable("extra_consent_screen", lVar);
            oVar.setArguments(bundle);
            return oVar;
        }

        private a() {
        }
    }
}
