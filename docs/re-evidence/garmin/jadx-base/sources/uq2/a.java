package uq2;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Luq2/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3216a f172309c = new C3216a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f172310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f172311b;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f172310a = new m(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_unionpay_developer_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.unionpay_developer_settings_recycler_view);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        }
        if (recyclerView != null) {
            m mVar = this.f172310a;
            if (mVar == null) {
                s.m("settingsItemAdapter");
                throw null;
            }
            recyclerView.setAdapter(mVar);
        }
        m mVar2 = this.f172310a;
        if (mVar2 == null) {
            s.m("settingsItemAdapter");
            throw null;
        }
        ArrayList arrayList = this.f172311b;
        if (arrayList != null) {
            mVar2.r(arrayList);
        } else {
            s.m("settingsList");
            throw null;
        }
    }

    /* JADX INFO: renamed from: uq2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luq2/a$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3216a {
        public /* synthetic */ C3216a(j jVar) {
            this();
        }

        private C3216a() {
        }
    }
}
