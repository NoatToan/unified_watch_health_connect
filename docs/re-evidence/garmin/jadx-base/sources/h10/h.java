package h10;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.GroupsActivity;
import com.garmin.android.apps.connectmobile.o0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lh10/h;", "Lcom/garmin/android/apps/connectmobile/o0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends o0 {
    public static final /* synthetic */ int D = 0;
    public View A;
    public GroupsActivity B;
    public o C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f80767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f f80768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h10.b f80769y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ListView f80770z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80771a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80771a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f80772a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f80772a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f80772a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f80772a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        o oVar;
        f fVar = this.f80768x;
        if (fVar != null) {
            fVar.clear();
        }
        o oVar2 = this.C;
        if (oVar2 != null) {
            oVar2.f80797a.m();
        }
        String str = this.f80767w;
        if (str == null || (oVar = this.C) == null) {
            return;
        }
        xy2.b.K(oVar, new k(oVar, str, false, null)).f(getViewLifecycleOwner(), new c(new g12.f(this, 24)));
    }

    public final void T6() {
        K6(0);
        View view2 = this.A;
        ViewParent parent = view2 != null ? view2.getParent() : null;
        ListView listView = this.f80770z;
        if (parent != listView && listView != null) {
            listView.addFooterView(this.A, null, false);
        }
        View view3 = this.A;
        if (view3 != null) {
            view3.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.C = (o) new x1(mVarRequireActivity).b(s0.f105811a.b(o.class));
        Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        obj.getClass();
        this.f80767w = ((f12.b) obj).getUserDisplayName();
        f fVar = new f((i.c) getActivity(), this.f80769y, f.b.OWN_CONNECTION_GROUPS, null);
        this.f80768x = fVar;
        w6(fVar);
        M7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f80769y = (h10.b) context;
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement ConnectionGroupRowListener");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.base_swipetofrefresh_list_layout, (ViewGroup) null);
        View viewInflate2 = layoutInflater.inflate(R.layout.layout_group_list_empty, viewGroup, false);
        this.A = viewInflate2;
        ComposeView composeView = viewInflate2 != null ? (ComposeView) viewInflate2.findViewById(R.id.group_social_empty_view) : null;
        if (composeView != null) {
            composeView.setContent(new z3.e(962260617, true, new g(this, 0)));
        }
        return viewInflate;
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u6();
        ListView listView = this.f7311e;
        this.f80770z = listView;
        if (listView != null) {
            listView.setStackFromBottom(false);
        }
        ListView listView2 = this.f80770z;
        if (listView2 != null) {
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            listView2.setSelector(resources.getDrawable(R.drawable.gcm_surface_1_selector_background, null));
        }
        ListView listView3 = this.f80770z;
        if (listView3 != null) {
            Resources resources2 = getResources();
            ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
            listView3.setDivider(resources2.getDrawable(R.drawable.gcm_default_list_item_divider, null));
        }
        ListView listView4 = this.f80770z;
        if (listView4 != null) {
            listView4.setDividerHeight(1);
        }
        ListView listView5 = this.f80770z;
        if (listView5 != null) {
            Resources resources3 = getResources();
            ThreadLocal<TypedValue> threadLocal3 = b7.g.f16255a;
            listView5.setCacheColorHint(resources3.getColor(R.color.gcm_list_item_background, null));
        }
        ListView listView6 = this.f80770z;
        if (listView6 != null) {
            listView6.setFastScrollEnabled(true);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh10/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
