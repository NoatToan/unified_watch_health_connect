package au1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gg1.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wt1.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau1/a;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/b;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends com.garmin.android.apps.connectmobile.training.atp.create.steps.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f13021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f13022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<h> f13023j = new ArrayList<>();

    public final Button E6() {
        Button button = this.f13022i;
        if (button != null) {
            return button;
        }
        s.m("completeButton");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm4_training_create_days_step, viewGroup, false);
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.training_step_days_container);
        View viewFindViewById = view2.findViewById(R.id.training_step_header_info);
        viewFindViewById.getClass();
        this.f13021h = (TextView) viewFindViewById;
        h hVar = new h(getContext(), q.SUNDAY);
        ArrayList<h> arrayList = this.f13023j;
        arrayList.add(hVar);
        arrayList.add(new h(getContext(), q.MONDAY));
        arrayList.add(new h(getContext(), q.TUESDAY));
        arrayList.add(new h(getContext(), q.WEDNESDAY));
        arrayList.add(new h(getContext(), q.THURSDAY));
        arrayList.add(new h(getContext(), q.FRIDAY));
        arrayList.add(new h(getContext(), q.SATURDAY));
        View viewFindViewById2 = view2.findViewById(R.id.complete_button);
        viewFindViewById2.getClass();
        this.f13022i = (Button) viewFindViewById2;
        m mVarE1 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1();
        if (mVarE1 == m.SATURDAY) {
            Collections.rotate(arrayList, 1);
        } else if (mVarE1 == m.MONDAY) {
            Collections.rotate(arrayList, -1);
        }
        arrayList.get(0).f47747h.setVisibility(0);
        Iterator<h> it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView(it.next());
        }
        View viewFindViewById3 = view2.findViewById(R.id.complete_button);
        viewFindViewById3.getClass();
        this.f13022i = (Button) viewFindViewById3;
    }
}
