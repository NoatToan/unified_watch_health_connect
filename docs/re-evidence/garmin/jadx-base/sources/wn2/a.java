package wn2;

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
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwn2/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3464a f186346c = new C3464a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jr2.m f186347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f186348b;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f186347a = new jr2.m(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_felica_developer_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.felica_developer_settings_recycler_view);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        }
        if (recyclerView != null) {
            jr2.m mVar = this.f186347a;
            if (mVar == null) {
                p005kotlin.jvm.internal.s.m("settingsItemAdapter");
                throw null;
            }
            recyclerView.setAdapter(mVar);
        }
        jr2.m mVar2 = this.f186347a;
        if (mVar2 == null) {
            p005kotlin.jvm.internal.s.m("settingsItemAdapter");
            throw null;
        }
        ArrayList arrayList = this.f186348b;
        if (arrayList != null) {
            mVar2.r(arrayList);
        } else {
            p005kotlin.jvm.internal.s.m("settingsList");
            throw null;
        }
    }

    /* JADX INFO: renamed from: wn2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwn2/a$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3464a {
        public /* synthetic */ C3464a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3464a() {
        }
    }
}
