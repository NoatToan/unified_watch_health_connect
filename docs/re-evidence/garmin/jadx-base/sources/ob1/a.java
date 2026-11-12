package ob1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.f;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l;
import gh2.i;
import mt0.h0;
import o13.m;
import o13.p;
import o13.t;
import o72.o3;
import o72.v3;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vd1.b;
import vd1.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lob1/a;", "Lvd1/d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C2490a f131136m = new C2490a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f131137l = m.b(new v3(27));

    @Override // vd1.d
    public final void C6() {
        f fVar = f.f23050a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        f.d(fVar, contextRequireContext, requireContext().getString(R.string.pregnancy_limit_reached), requireContext().getString(R.string.pregnancy_reminder_time_limit_message, Long.valueOf(y6())), new p(requireContext().getString(R.string.lbl_ok), new o3(9)), null, null, false, 112).show();
    }

    @Override // vd1.d
    public final void E6() {
        f fVar = f.f23050a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        f.d(fVar, contextRequireContext, requireContext().getString(R.string.pregnancy_choose_a_different_time), requireContext().getString(R.string.pregnancy_reminder_already_set), new p(requireContext().getString(R.string.lbl_ok), new o3(10)), null, null, false, 112).show();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_pregnancy_reminder_times, viewGroup, false);
    }

    @Override // vd1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f177454c = new b(A6(), R.layout.pregnancy_reminder_times_list_item, this.f177461j);
        View viewFindViewById = view2.findViewById(R.id.pregnancy_reminder_times_add_button);
        viewFindViewById.getClass();
        Button button = (Button) viewFindViewById;
        this.f177453b = button;
        button.setOnClickListener(new h0(this, 29));
        androidx.fragment.app.m activity = getActivity();
        if (activity == null) {
            ((Logger) this.f131137l.getValue()).error("Activity is null");
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.pregnancy_reminder_times_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(z6());
    }

    @Override // vd1.d
    public final long y6() {
        l.g().getClass();
        return i.f77458c.a().f77477b.g("pregnancy_reminders_max_times");
    }

    /* JADX INFO: renamed from: ob1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lob1/a$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2490a {
        public /* synthetic */ C2490a(j jVar) {
            this();
        }

        private C2490a() {
        }
    }
}
