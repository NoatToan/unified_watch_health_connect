package h10;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.jvm.internal.s0;
import r22.h0;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
public class r extends Fragment implements f.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f80806j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f80807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f80808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h10.b f80809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f80810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ListView f80811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f80812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f80813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f80814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f80815i;

    public class a extends h0 {
        public a(int i14) {
            super(i14);
        }

        @Override // r22.h0
        public final void a(int i14, int i15) {
            r rVar = r.this;
            rVar.u6(i14, i15, rVar.f80807a);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80817a;

        static {
            int[] iArr = new int[fw.p.values().length];
            f80817a = iArr;
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80817a[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80817a[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f80808b = new f((i.c) getActivity(), this.f80809c, f.b.CONNECTION_GROUP_SEARCH_RESULT, this);
        this.f80811e.addFooterView(this.f80810d);
        this.f80811e.setAdapter((ListAdapter) this.f80808b);
        this.f80811e.removeFooterView(this.f80810d);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("GCM_extra_connection_group_query_param");
            this.f80807a = string;
            String str = !TextUtils.isEmpty(string) ? this.f80807a : null;
            this.f80807a = str;
            a aVar = this.f80813g;
            if (!aVar.f149666c) {
                aVar.f149665b = false;
                aVar.f149667d = 1;
            }
            u6(aVar.f149667d, aVar.f149664a, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f80809c = (h10.b) context;
        } catch (ClassCastException unused) {
            l2.k(context, " must implement ConnectionGroupRowListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f80813g = new a(15);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_list_with_empty_text_layout, (ViewGroup) null);
        this.f80811e = (ListView) viewInflate.findViewById(R.id.list_view);
        this.f80812f = (TextView) viewInflate.findViewById(R.id.list_view_empty_text);
        this.f80810d = layoutInflater.inflate(R.layout.gcm_list_footer_indeterminate_progress, (ViewGroup) null, false);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        this.f80811e.setStackFromBottom(false);
        this.f80811e.setFooterDividersEnabled(true);
        ListView listView = this.f80811e;
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        listView.setSelector(resources.getDrawable(R.drawable.gcm_surface_1_selector_background, null));
        this.f80811e.setDivider(getResources().getDrawable(R.drawable.gcm_default_list_item_divider, null));
        this.f80811e.setDividerHeight(1);
        this.f80811e.setCacheColorHint(getResources().getColor(R.color.gcm_list_item_background, null));
        this.f80811e.setFastScrollEnabled(true);
        this.f80811e.setOnScrollListener(this.f80813g);
        o oVar = (o) new x1(requireActivity()).b(s0.f105811a.b(o.class));
        this.f80815i = oVar;
        dh.b.L(oVar.f80799c, getViewLifecycleOwner(), new p(this, 1));
    }

    public final void u6(int i14, int i15, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i14 == 1) {
            ((com.garmin.android.apps.connectmobile.c) getActivity()).showProgressOverlay();
        }
        this.f80814h = i14;
        o oVar = this.f80815i;
        oVar.getClass();
        str.getClass();
        xy2.b.K(oVar, new n(oVar, str, i14, i15, true, null)).f(getViewLifecycleOwner(), new p(this, 0));
    }

    public final void v6(String str) {
        this.f80808b.clear();
        this.f80812f.setVisibility(8);
        this.f80807a = str;
        a aVar = this.f80813g;
        if (!aVar.f149666c) {
            aVar.f149665b = false;
            aVar.f149667d = 1;
        }
        u6(aVar.f149667d, aVar.f149664a, str);
    }
}
