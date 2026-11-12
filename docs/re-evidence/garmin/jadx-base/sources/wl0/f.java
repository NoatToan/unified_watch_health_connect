package wl0;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import bs2.ve;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class f extends ArrayAdapter<com.garmin.android.apps.connectmobile.golf.truswing.model.a> {
    public f(Context context, List<com.garmin.android.apps.connectmobile.golf.truswing.model.a> list) {
        super(context, R.layout.simple_list_item_2);
        addAll(list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        com.garmin.android.apps.connectmobile.golf.truswing.model.a aVar = (com.garmin.android.apps.connectmobile.golf.truswing.model.a) getItem(i14);
        xl0.a aVar2 = (xl0.a) view2;
        if (aVar2 == null) {
            aVar2 = new xl0.a(getContext());
        }
        if (aVar != null) {
            ve veVar = aVar.f35891c;
            if (TextUtils.isEmpty(aVar.a())) {
                String strJ = h.i().j(veVar.f20622a);
                if (TextUtils.isEmpty(strJ)) {
                    veVar.name();
                    return aVar2;
                }
                aVar2.setClubName(strJ);
                return aVar2;
            }
            aVar2.setClubName(aVar.a());
        }
        return aVar2;
    }
}
