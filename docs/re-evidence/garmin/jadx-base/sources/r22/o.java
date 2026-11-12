package r22;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr22/o;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f149769b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g1 f149770a;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList<String> arrayList;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.simple_bottomsheet_list_dialog, viewGroup, false);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("DIALOG_TITLE") : null;
        if (string != null) {
            ((TextView) viewInflate.findViewById(R.id.tv_dialog_title)).setText(string);
        } else {
            View viewFindViewById = viewInflate.findViewById(R.id.tv_dialog_title);
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(8);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (arrayList = arguments2.getStringArrayList("LABELS_LIST")) == null) {
            arrayList = new ArrayList<>();
        }
        View viewFindViewById2 = viewInflate.findViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new b1(arrayList, new qw0.y(this, 5)));
        viewFindViewById2.getClass();
        return viewInflate;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lr22/o$a;", "", "<init>", "()V", "", "LABELS_LIST", "Ljava/lang/String;", "DIALOG_TITLE", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
