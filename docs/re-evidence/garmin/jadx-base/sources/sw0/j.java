package sw0;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.u0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsw0/j;", "Lcom/garmin/android/apps/connectmobile/u0;", "<init>", "()V", "a", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f161084g = new a(null);

    public j() {
        super(R.layout.map_legend_bottom_sheet_content, false, false, 0, 14, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        List listB1;
        Bundle arguments = getArguments();
        if (arguments == null) {
            listB1 = j0.f134944a;
        } else {
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("LIST_LEGEND_ITEMS", k.class) : arguments.getParcelableArrayList("LIST_LEGEND_ITEMS");
            if (parcelableArrayList == null || (listB1 = h0.b1(parcelableArrayList)) == null) {
                listB1 = j0.f134944a;
            }
        }
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view_legend);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new i(listB1));
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String w6() {
        String string = getString(R.string.lbl_map_legend);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String y6() {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsw0/j$a;", "", "<init>", "()V", "", "LIST_LEGEND_ITEMS", "Ljava/lang/String;", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
