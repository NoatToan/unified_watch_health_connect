package w81;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import j22.g;
import java.util.List;
import java.util.Locale;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vc0.v;
import vg1.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lw81/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "optionalExplanation", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<g> f183549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f183550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f183551c;

    public b() {
        super(R.layout.fragment_permissions_settings);
        new y81.a();
        this.f183549a = y81.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        a aVar = this.f183551c;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        } else {
            s.m("settingsAdapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.permissions_settings_recycler_view);
        viewFindViewById.getClass();
        this.f183550b = (RecyclerView) viewFindViewById;
        this.f183551c = new a(this.f183549a);
        RecyclerView recyclerView = this.f183550b;
        if (recyclerView == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.f183550b;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        a aVar = this.f183551c;
        if (aVar == null) {
            s.m("settingsAdapter");
            throw null;
        }
        recyclerView2.setAdapter(aVar);
        TextView textView = (TextView) view2.findViewById(R.id.permissions_settings_explanation_text_view);
        String string = getString(R.string.msg_recommend_allow_permissions);
        string.getClass();
        t tVarB = m.b(new v(this, 27));
        if (s.g(Locale.getDefault().getLanguage(), Locale.KOREAN.getLanguage())) {
            string = e5.g(string, "\n", (String) tVarB.getValue());
        }
        textView.setText(string);
        view2.findViewById(R.id.permissions_settings_manage_button).setOnClickListener(new z0(this, 10));
    }
}
