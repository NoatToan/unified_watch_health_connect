package com.garmin.android.apps.connectmobile.contacts.emergency;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import ch.qos.logback.classic.spi.CallerData;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fw.p;
import go1.g0;
import j20.z;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/g;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends Fragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f32695h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f32696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f32697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConstraintLayout f32698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f32699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f32700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f32701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f32702g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32703a;

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
            f32703a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32704a;

        public c(l lVar) {
            lVar.getClass();
            this.f32704a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32704a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32704a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f32705a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f32705a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f32707b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f32706a = aVar;
            this.f32707b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32706a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f32707b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32708a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f32708a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f32708a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public g() {
        super(R.layout.fragment_send_new_request);
        this.f32702g = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.contacts.emergency.d.class), new d(this), new f(this), new e(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u6().f32665z.f(this, new c(new z(this, 1)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.g(this, u6().f32646e.j());
        View viewFindViewById = view2.findViewById(R.id.text_view_title);
        viewFindViewById.getClass();
        this.f32696a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text_view_description);
        viewFindViewById2.getClass();
        this.f32697b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.layout_text_message);
        viewFindViewById3.getClass();
        this.f32698c = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.text_view_bubble);
        viewFindViewById4.getClass();
        this.f32699d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.text_view_bottom_note);
        viewFindViewById5.getClass();
        this.f32700e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.button_send_request);
        viewFindViewById6.getClass();
        this.f32701f = (Button) viewFindViewById6;
        TextView textView = this.f32696a;
        if (textView == null) {
            s.m("titleTextView");
            throw null;
        }
        textView.setText(getString(R.string.send_new_request) + CallerData.NA);
        TextView textView2 = this.f32697b;
        if (textView2 == null) {
            s.m("descriptionTextView");
            throw null;
        }
        textView2.setText(u6().f32659r == l20.l.LIVETRACK ? getString(R.string.msg_send_live_track_request) : getString(R.string.msg_send_emergency_contact_request));
        TextView textView3 = this.f32700e;
        if (textView3 == null) {
            s.m("bottomNoteTextView");
            throw null;
        }
        textView3.setText(getString(R.string.msg_livetrack_receive_text_message));
        Button button = this.f32701f;
        if (button == null) {
            s.m("sendRequestButton");
            throw null;
        }
        button.setOnClickListener(new g0(this, 27));
        u6().Q4();
        v6();
        g22.e.f(this);
        u6().f32653l.f(getViewLifecycleOwner(), new c(new z(this, 0)));
    }

    public final com.garmin.android.apps.connectmobile.contacts.emergency.d u6() {
        return (com.garmin.android.apps.connectmobile.contacts.emergency.d) this.f32702g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    public final void v6() {
        boolean z14;
        l20.c cVar = u6().f32647f;
        if (cVar != null) {
            ConstraintLayout constraintLayout = this.f32698c;
            if (constraintLayout == null) {
                s.m("textMessageLayout");
                throw null;
            }
            v22.e.v(constraintLayout, !s.g(cVar.getIsValid(), Boolean.FALSE));
        }
        Button button = this.f32701f;
        if (button == null) {
            s.m("sendRequestButton");
            throw null;
        }
        if (!(cVar != null ? s.g(cVar.getIsValid(), Boolean.FALSE) : false)) {
            z14 = u6().f32657p.length() > 0;
        }
        button.setEnabled(z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
