package ho1;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import fo1.o0;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lho1/l;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f84814d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f84815a = new w1(s0.f105811a.b(o0.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f84816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f84817c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84818a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.GROUP_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.COMMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f84818a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f84819a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f84819a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f84819a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f84820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f84821b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f84820a = aVar;
            this.f84821b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f84820a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f84821b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f84822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f84822a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f84822a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public l() {
        final int i14 = 0;
        this.f84816b = o13.m.b(new e23.a(this) { // from class: ho1.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f84813b;

            {
                this.f84813b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object serializable;
                int i15 = i14;
                l lVar = this.f84813b;
                switch (i15) {
                    case 0:
                        l.a aVar = l.f84814d;
                        Bundle arguments = lVar.getArguments();
                        return Long.valueOf(arguments != null ? arguments.getLong("ARG_GROUP_ID", -1L) : -1L);
                    default:
                        l.a aVar2 = l.f84814d;
                        Bundle arguments2 = lVar.getArguments();
                        if (arguments2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = arguments2.getSerializable("ARG_TYPE", o.class);
                            } else {
                                Object serializable2 = arguments2.getSerializable("ARG_TYPE");
                                if (!(serializable2 instanceof o)) {
                                    serializable2 = null;
                                }
                                serializable = (o) serializable2;
                            }
                            o oVar = (o) serializable;
                            if (oVar != null) {
                                return oVar;
                            }
                        }
                        return o.DEFAULT;
                }
            }
        });
        final int i15 = 1;
        this.f84817c = o13.m.b(new e23.a(this) { // from class: ho1.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f84813b;

            {
                this.f84813b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object serializable;
                int i16 = i15;
                l lVar = this.f84813b;
                switch (i16) {
                    case 0:
                        l.a aVar = l.f84814d;
                        Bundle arguments = lVar.getArguments();
                        return Long.valueOf(arguments != null ? arguments.getLong("ARG_GROUP_ID", -1L) : -1L);
                    default:
                        l.a aVar2 = l.f84814d;
                        Bundle arguments2 = lVar.getArguments();
                        if (arguments2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = arguments2.getSerializable("ARG_TYPE", o.class);
                            } else {
                                Object serializable2 = arguments2.getSerializable("ARG_TYPE");
                                if (!(serializable2 instanceof o)) {
                                    serializable2 = null;
                                }
                                serializable = (o) serializable2;
                            }
                            o oVar = (o) serializable;
                            if (oVar != null) {
                                return oVar;
                            }
                        }
                        return o.DEFAULT;
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(2108656885, true, new fp0.l(this, 14)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (((o) this.f84817c.getValue()) == o.GROUP_ACTIVITY) {
            ((o0) this.f84815a.getValue()).D = ((Number) this.f84816b.getValue()).longValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lho1/l$a;", "", "<init>", "()V", "", "ARG_GROUP_ID", "Ljava/lang/String;", "ARG_TYPE", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
