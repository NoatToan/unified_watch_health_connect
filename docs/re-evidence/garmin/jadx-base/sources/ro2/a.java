package ro2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import jr2.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lro2/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2915a f154046d = new C2915a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f154047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f154048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f154049c;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f154047a = new m(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_snowball_developer_settings, viewGroup, false);
        this.f154048b = (RecyclerView) viewInflate.findViewById(R.id.snowball_developer_settings_recycler_view);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        RecyclerView recyclerView = this.f154048b;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
            m mVar = this.f154047a;
            if (mVar == null) {
                s.m("settingsItemAdapter");
                throw null;
            }
            recyclerView.setAdapter(mVar);
        }
        m mVar2 = this.f154047a;
        if (mVar2 == null) {
            s.m("settingsItemAdapter");
            throw null;
        }
        ArrayList arrayList = this.f154049c;
        if (arrayList != null) {
            mVar2.r(arrayList);
        } else {
            s.m("settingsList");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ro2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro2/a$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2915a {
        public /* synthetic */ C2915a(j jVar) {
            this();
        }

        private C2915a() {
        }
    }
}
