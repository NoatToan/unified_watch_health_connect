package com.garmin.android.apps.connectmobile.social;

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
import bv.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.o0;
import e23.l;
import fo1.c2;
import fo1.d1;
import fo1.s1;
import fw.p;
import java.util.List;
import lc.u0;
import o13.h;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/a;", "Lcom/garmin/android/apps/connectmobile/o0;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends o0 {
    public static final C0841a C = new C0841a(null);
    public boolean A;
    public fo1.o0 B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f44508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f44509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public do1.c f44510y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f44511z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44512a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44512a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f44513a;

        public c(l lVar) {
            lVar.getClass();
            this.f44513a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f44513a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44513a.invoke(obj);
        }
    }

    public static final void T6(a aVar, g3 g3Var) {
        aVar.getClass();
        int i14 = b.f44512a[g3Var.f35300a.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    return;
                }
                u0.r();
                return;
            }
            Exception exc = g3Var.f35303d;
            lj0.b bVar = lj0.b.f112956j;
            bVar.getClass();
            g22.e.b(aVar, bVar);
            String str = "Error: " + exc;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "CommentLikesListFragment", str);
            return;
        }
        T t7 = g3Var.f35301b;
        List list = t7 instanceof List ? (List) t7 : null;
        if (list == null) {
            list = j0.f134944a;
        }
        do1.c cVar = aVar.f44510y;
        if (cVar != null) {
            cVar.clear();
        }
        do1.c cVar2 = aVar.f44510y;
        if (cVar2 != null) {
            cVar2.addAll(list);
        }
        do1.c cVar3 = aVar.f44510y;
        int count = cVar3 != null ? cVar3.getCount() : 0;
        aVar.K6(count);
        int i15 = count == 1 ? R.string.connections_news_feed_number_of_likes_singular : R.string.connections_news_feed_number_of_likes_plural;
        TextView textView = aVar.f44509x;
        if (textView != null) {
            textView.setText(aVar.getString(i15, Integer.valueOf(count)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        if (!this.A) {
            fo1.o0 o0Var = this.B;
            if (o0Var != null) {
                dh.b.L(xy2.b.K(o0Var, new d1(o0Var, null, null, null)), this, new c(new do1.e(this)));
                return;
            } else {
                s.m("conversationViewModel");
                throw null;
            }
        }
        String str = this.f44511z;
        if (str == null) {
            return;
        }
        fo1.o0 o0Var2 = this.B;
        if (o0Var2 == null) {
            s.m("conversationViewModel");
            throw null;
        }
        c2 c2Var = o0Var2.f72655b;
        c2Var.getClass();
        dh.b.L(f0.N(new fo1.a2(c2Var, str, null)), this, new c(new do1.d(this)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f44510y = new do1.c(getActivity());
        u6();
        this.f7311e.addHeaderView(this.f44508w, null, false);
        u6();
        this.f7311e.setHeaderDividersEnabled(true);
        w6(this.f44510y);
        M7();
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f44511z = arguments.getString("COMMENT_ID");
            this.A = arguments.getBoolean("GCM_challenge_is_vivokid", false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.base_swipetofrefresh_list_layout, (ViewGroup) null);
        View viewInflate2 = layoutInflater.inflate(R.layout.gcm_like_list_header_3_0, (ViewGroup) null);
        this.f44508w = viewInflate2;
        View viewFindViewById = viewInflate2 != null ? viewInflate2.findViewById(R.id.like_count_label) : null;
        viewFindViewById.getClass();
        this.f44509x = (TextView) viewFindViewById;
        return viewInflate;
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        s1 s1Var = new s1(null, null, this.f44511z, null, false, false, false, false, 248, null);
        y1 viewModelStore = getViewModelStore();
        viewModelStore.getClass();
        this.B = (fo1.o0) new x1(viewModelStore, s1Var, null, 4, null).b(s0.f105811a.b(fo1.o0.class));
    }

    @Override // androidx.fragment.app.n0
    public final void v6(ListView listView, View view2, int i14) {
        listView.getClass();
        view2.getClass();
        do1.c cVar = this.f44510y;
        mo1.b item = cVar != null ? cVar.getItem(i14 - 1) : null;
        if (((item instanceof mo1.h) && ((mo1.h) item).h()) || item == null) {
            return;
        }
        g gVar = (g) KoinJavaComponent.get$default(g.class, null, null, 6, null);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        gVar.b(mVarRequireActivity, item.getDisplayName(), item.getFullName());
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.social.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARGS_COMMENT_ID", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0841a {
        public /* synthetic */ C0841a(j jVar) {
            this();
        }

        private C0841a() {
        }
    }
}
