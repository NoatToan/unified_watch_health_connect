package bi1;

import a61.d0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbi1/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f18034b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f18035a = new w1(s0.f105811a.b(r.class), new c(this), new e(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f18036a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f18036a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f18036a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18036a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f18037a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18037a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f18037a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f18038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f18039b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f18038a = aVar;
            this.f18039b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f18038a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f18039b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f18040a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18040a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f18040a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm3_device_settings_watch_faces_vivomove3_classic, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        ViewGroup viewGroup;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        for (v vVar : v.values()) {
            int i14 = vVar.f18097b;
            View view3 = getView();
            ImageButton imageButton = (view3 == null || (viewGroup = (ViewGroup) view3.findViewById(i14)) == null) ? null : (ImageButton) viewGroup.findViewById(R.id.watch_face_style);
            if (imageButton != null) {
                imageButton.setOnClickListener(new d0(12, this, vVar));
            }
        }
        w1 w1Var = this.f18035a;
        final int i15 = 0;
        ((r) w1Var.getValue()).f18064a.f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: bi1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f18033b;

            {
                this.f18033b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                ViewGroup viewGroup2;
                int i16 = i15;
                h hVar = this.f18033b;
                switch (i16) {
                    case 0:
                        v vVar2 = (v) obj;
                        h.a aVar = h.f18034b;
                        v[] vVarArrValues = v.values();
                        int length = vVarArrValues.length;
                        for (int i17 = 0; i17 < length; i17++) {
                            v vVar3 = vVarArrValues[i17];
                            int i18 = vVar3.f18097b;
                            View view4 = hVar.getView();
                            ImageButton imageButton2 = (view4 == null || (viewGroup2 = (ViewGroup) view4.findViewById(i18)) == null) ? null : (ImageButton) viewGroup2.findViewById(R.id.watch_face_style);
                            if (imageButton2 != null) {
                                imageButton2.setSelected(vVar3 == vVar2);
                            }
                        }
                        break;
                    default:
                        a aVar2 = (a) obj;
                        h.a aVar3 = h.f18034b;
                        aVar2.getClass();
                        hVar.u6(aVar2, u.Top);
                        hVar.u6(aVar2, u.Bottom);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        Iterator<y0<bi1.a>> it = ((r) w1Var.getValue()).f18065b.values().iterator();
        while (it.hasNext()) {
            final int i16 = 1;
            it.next().f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: bi1.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f18033b;

                {
                    this.f18033b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    ViewGroup viewGroup2;
                    int i17 = i16;
                    h hVar = this.f18033b;
                    switch (i17) {
                        case 0:
                            v vVar2 = (v) obj;
                            h.a aVar = h.f18034b;
                            v[] vVarArrValues = v.values();
                            int length = vVarArrValues.length;
                            for (int i18 = 0; i18 < length; i18++) {
                                v vVar3 = vVarArrValues[i18];
                                int i19 = vVar3.f18097b;
                                View view4 = hVar.getView();
                                ImageButton imageButton2 = (view4 == null || (viewGroup2 = (ViewGroup) view4.findViewById(i19)) == null) ? null : (ImageButton) viewGroup2.findViewById(R.id.watch_face_style);
                                if (imageButton2 != null) {
                                    imageButton2.setSelected(vVar3 == vVar2);
                                }
                            }
                            break;
                        default:
                            a aVar2 = (a) obj;
                            h.a aVar3 = h.f18034b;
                            aVar2.getClass();
                            hVar.u6(aVar2, u.Top);
                            hVar.u6(aVar2, u.Bottom);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
    }

    public final void u6(bi1.a aVar, u uVar) {
        Drawable drawableA;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Context context = getContext();
        ImageView imageView = null;
        if (context != null) {
            bi1.b.f18015a.getClass();
            drawableA = bi1.b.a(context, aVar, uVar);
        } else {
            drawableA = null;
        }
        int i14 = aVar.f18012a.f18097b;
        if (uVar == u.Top) {
            View view2 = getView();
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.findViewById(i14)) != null) {
                imageView = (ImageView) viewGroup2.findViewById(R.id.watch_face_top);
            }
        } else {
            View view3 = getView();
            if (view3 != null && (viewGroup = (ViewGroup) view3.findViewById(i14)) != null) {
                imageView = (ImageView) viewGroup.findViewById(R.id.watch_face_bottom);
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(drawableA);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbi1/h$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
