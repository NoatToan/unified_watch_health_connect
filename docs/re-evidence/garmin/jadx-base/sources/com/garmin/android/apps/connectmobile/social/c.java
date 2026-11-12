package com.garmin.android.apps.connectmobile.social;

import am.c2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.m;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.o0;
import do1.g;
import e23.l;
import fo1.i1;
import fo1.s1;
import fw.p;
import mo1.f;
import o13.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/c;", "Lcom/garmin/android/apps/connectmobile/o0;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends o0 {
    public static final a C = new a(null);
    public TextView A;
    public fo1.o0 B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f44524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c2 f44525x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f44526y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f44527z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44528a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44528a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.social.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0843c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f44529a;

        public C0843c(l lVar) {
            lVar.getClass();
            this.f44529a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f44529a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44529a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        fo1.o0 o0Var = this.B;
        if (o0Var != null) {
            dh.b.L(xy2.b.K(o0Var, new i1(o0Var, null, null, null)), this, new C0843c(new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 25)));
        } else {
            s.m("conversationViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f44524w = new g(getActivity());
        u6();
        this.f7311e.addHeaderView(this.f44527z, null, false);
        u6();
        this.f7311e.setHeaderDividersEnabled(true);
        g gVar = this.f44524w;
        if (gVar == null) {
            s.m("mAdapter");
            throw null;
        }
        w6(gVar);
        M7();
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("GCM_conversation_resource_type");
            string.getClass();
            this.f44525x = c2.valueOf(string);
            this.f44526y = arguments.getString("GCM_conversation_resource_id");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.base_swipetofrefresh_list_layout, (ViewGroup) null);
        View viewInflate2 = layoutInflater.inflate(R.layout.gcm_like_list_header_3_0, (ViewGroup) null);
        this.f44527z = viewInflate2;
        this.A = viewInflate2 != null ? (TextView) viewInflate2.findViewById(R.id.like_count_label) : null;
        return viewInflate;
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        s1 s1Var = new s1(this.f44525x, this.f44526y, null, null, false, false, false, false, 252, null);
        y1 viewModelStore = getF189591b();
        viewModelStore.getClass();
        this.B = (fo1.o0) new x1(viewModelStore, s1Var, null, 4, null).b(s0.f105811a.b(fo1.o0.class));
    }

    @Override // androidx.fragment.app.n0
    public final void v6(ListView listView, View view2, int i14) {
        listView.getClass();
        view2.getClass();
        g gVar = this.f44524w;
        if (gVar == null) {
            s.m("mAdapter");
            throw null;
        }
        f item = gVar.getItem(i14 - 1);
        bv.g gVar2 = (bv.g) KoinJavaComponent.get$default(bv.g.class, null, null, 6, null);
        if (item != null) {
            m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            gVar2.b(mVarRequireActivity, item.getDisplayName(), item.getFullName());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/c$a;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
