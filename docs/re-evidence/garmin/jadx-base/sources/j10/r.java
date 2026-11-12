package j10;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class r extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f96399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f96400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f96401e;

    public class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMCheckableRow f96402a;

        public a(r rVar, View view2) {
            super(view2);
            this.f96402a = (GCMCheckableRow) view2.findViewById(R.id.gcm_checkable_row);
        }
    }

    public r(Activity activity, List<String> list, String str) {
        this.f96399c = activity;
        if (list != null) {
            this.f96400d = list;
        } else {
            this.f96400d = new ArrayList();
        }
        if (str == null || list == null) {
            return;
        }
        this.f96401e = list.indexOf(str) > 0 ? list.indexOf(str) : 0;
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f96400d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        String str = this.f96400d.get(i14);
        a aVar = (a) f0Var;
        GCMCheckableRow gCMCheckableRow = aVar.f96402a;
        GCMCheckableRow gCMCheckableRow2 = aVar.f96402a;
        d.f96350d.getClass();
        d dVarA = d.a.a(str);
        gCMCheckableRow.setDefaultText(this.f96399c.getString(dVarA != null ? dVarA.f96364c : -1));
        gCMCheckableRow2.b(false);
        gCMCheckableRow2.setChecked(i14 == this.f96401e);
        gCMCheckableRow2.setOnClickListener(new b0(this, i14, 8));
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        return new a(this, LayoutInflater.from(this.f96399c).inflate(R.layout.gcm_simple_text_check_row_3_0, viewGroup, false));
    }
}
