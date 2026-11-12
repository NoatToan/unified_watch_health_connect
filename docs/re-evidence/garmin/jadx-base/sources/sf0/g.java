package sf0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s2;
import e32.p;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import q92.x;
import sd.o;
import z10.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lsf0/g;", "Data", "Le32/p;", "ViewBinder", "NavigatorDestination", "Lg32/c;", "Lsf0/n;", "<init>", "()V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g<Data, ViewBinder extends p<Data>, NavigatorDestination> extends g32.c<Data, ViewBinder, NavigatorDestination> implements n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f158842w = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w1 f158843q = new w1(s0.f105811a.b(j.class), new b(this), new o(2), new c(null, this));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f158844r = o13.m.b(new ro0.g(this, 22));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public sf0.c f158845t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s2 f158846v;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f158847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f158847a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f158847a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f158848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f158849b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f158848a = aVar;
            this.f158849b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f158848a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f158849b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0061  */
    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    @Override // g32.c, e32.a
    public final void M6(Data data) {
        sf0.c cVar;
        ViewGroup viewGroup;
        if (J6().b(data)) {
            w1 w1Var = this.f158843q;
            if (((j) w1Var.getValue()).y4(K4()).d() instanceof i.a) {
                cVar = this.f158845t;
                if (cVar != null) {
                    s.m("epochViewHolder");
                    throw null;
                }
                viewGroup = cVar.f158823a;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "IEpochReload", "showEpochReloadState()");
                ((j) w1Var.getValue()).y4(K4()).f(getViewLifecycleOwner(), (z0) this.f158844r.getValue());
                sf0.c cVar2 = this.f158845t;
                if (cVar2 == null) {
                    s.m("epochViewHolder");
                    throw null;
                }
                ViewGroup viewGroup2 = cVar2.f158823a;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
            }
        } else {
            cVar = this.f158845t;
            if (cVar != null) {
                s.m("epochViewHolder");
                throw null;
            }
            viewGroup = cVar.f158823a;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
        super.M6(data);
    }

    public final void c7(String str, boolean z14) {
        sf0.c cVar = this.f158845t;
        if (cVar == null) {
            s.m("epochViewHolder");
            throw null;
        }
        TextView textView = cVar.f158825c;
        Button button = cVar.f158824b;
        if (z14) {
            button.setVisibility(0);
            textView.setVisibility(8);
        } else {
            button.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 102) {
            if (d1.h(x.DI_CONNECT_UPLOAD, true)) {
                j jVar = (j) this.f158843q.getValue();
                String strK4 = K4();
                int i16 = j.f158858c;
                ge1.b.T(v1.a(jVar), null, null, new l(jVar, strK4, "", null), 3);
                return;
            }
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "EpochReloadDetailsFragment", "For epoch reload storage consent is needed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e32.a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof s2) {
            this.f158846v = (s2) context;
        }
    }

    @Override // g32.c, e32.c, e32.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        final int i14 = 0;
        final int i15 = 1;
        this.f158845t = new sf0.c(view2, new View.OnClickListener(this) { // from class: sf0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158841b;

            {
                this.f158841b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        int i16 = g.f158842w;
                        HelpActivity.a aVar = HelpActivity.f36653a;
                        androidx.fragment.app.m activity = this.f158841b.getActivity();
                        ro0.l lVar = ro0.l.EPOCH_DATA_RELOAD;
                        aVar.getClass();
                        HelpActivity.a.d(activity, lVar, null, null);
                        break;
                    default:
                        int i17 = g.f158842w;
                        boolean zH = d1.h(x.DI_CONNECT_UPLOAD, true);
                        g gVar = this.f158841b;
                        if (!zH) {
                            DataStorageConsentActivity.a.e(DataStorageConsentActivity.f32194t, gVar, false, 102, null, 8);
                        } else {
                            j jVar = (j) gVar.f158843q.getValue();
                            String strK4 = gVar.K4();
                            int i18 = j.f158858c;
                            ge1.b.T(v1.a(jVar), null, null, new l(jVar, strK4, "", null), 3);
                        }
                        break;
                }
            }
        }, new View.OnClickListener(this) { // from class: sf0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158841b;

            {
                this.f158841b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        int i16 = g.f158842w;
                        HelpActivity.a aVar = HelpActivity.f36653a;
                        androidx.fragment.app.m activity = this.f158841b.getActivity();
                        ro0.l lVar = ro0.l.EPOCH_DATA_RELOAD;
                        aVar.getClass();
                        HelpActivity.a.d(activity, lVar, null, null);
                        break;
                    default:
                        int i17 = g.f158842w;
                        boolean zH = d1.h(x.DI_CONNECT_UPLOAD, true);
                        g gVar = this.f158841b;
                        if (!zH) {
                            DataStorageConsentActivity.a.e(DataStorageConsentActivity.f32194t, gVar, false, 102, null, 8);
                        } else {
                            j jVar = (j) gVar.f158843q.getValue();
                            String strK4 = gVar.K4();
                            int i18 = j.f158858c;
                            ge1.b.T(v1.a(jVar), null, null, new l(jVar, strK4, "", null), 3);
                        }
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsf0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
