package xf1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.n0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxf1/j;", "Landroidx/fragment/app/n0;", "", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends n0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f190696l = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f190697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f190698k;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f190697j = (h) context;
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement SegmentSelectionListener");
        }
    }

    @Override // androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm3_simple_list_view_layout, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        TextView textView = (TextView) view2.findViewById(android.R.id.empty);
        u6();
        this.f7311e.setEmptyView(textView);
        textView.setText(R.string.msg_no_matching_segments);
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        i iVar = new i(mVarRequireActivity, lVar.y());
        this.f190698k = iVar;
        w6(iVar);
        i iVar2 = this.f190698k;
        if (iVar2 != null) {
            l2.f37135b.getClass();
            Bundle bundleC = l2.a.b().c(this);
            ArrayList parcelableArrayList = bundleC != null ? bundleC.getParcelableArrayList("SEGMENTS_LIST") : null;
            iVar2.clear();
            if (parcelableArrayList != null) {
                ArrayList arrayList = new ArrayList();
                iVar2.f190687c = arrayList;
                arrayList.addAll(parcelableArrayList);
                iVar2.addAll(parcelableArrayList);
            }
        }
    }

    @Override // androidx.fragment.app.n0
    public final void v6(ListView listView, View view2, int i14) {
        i iVar;
        listView.getClass();
        view2.getClass();
        if (this.f190697j == null || (iVar = this.f190698k) == null) {
            return;
        }
        bg1.a item = iVar.getItem(i14);
        h hVar = this.f190697j;
        if (hVar != null) {
            hVar.u8(item);
        }
    }

    public final void z6(List list) {
        i iVar = this.f190698k;
        if (iVar == null) {
            return;
        }
        ArrayList arrayListZ = list != null ? h0.Z(list) : null;
        iVar.clear();
        if (arrayListZ != null) {
            ArrayList arrayList = new ArrayList();
            iVar.f190687c = arrayList;
            arrayList.addAll(arrayListZ);
            iVar.addAll(arrayListZ);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxf1/j$a;", "", "<init>", "()V", "", "KEY_BUNDLE_SEGMENTS_LIST", "Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
