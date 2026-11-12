package wl0;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingSessionDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class e0 extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f185915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f185916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<SwingSessionDTO> f185917c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexTwoLineButton f185918a;

        public a(View view2) {
            this.f185918a = (GCMComplexTwoLineButton) view2.findViewById(R.id.two_lines_button_view);
            view2.setTag(this);
        }
    }

    public e0(Activity activity) {
        this.f185916b = LayoutInflater.from(activity);
        this.f185915a = activity;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<SwingSessionDTO> list = this.f185917c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i14) {
        return this.f185917c.get(i14);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i14) {
        return this.f185917c.get(i14).f35882a;
    }

    @Override // android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        a aVar;
        if (view2 == null) {
            view2 = this.f185916b.inflate(R.layout.gcm3_summary_list_row, viewGroup, false);
            aVar = new a(view2);
        } else {
            aVar = (a) view2.getTag();
        }
        SwingSessionDTO swingSessionDTO = this.f185917c.get(i14);
        swingSessionDTO.getClass();
        aVar.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = aVar.f185918a;
        String str = swingSessionDTO.f35885d;
        Activity activity = this.f185915a;
        gCMComplexTwoLineButton.setButtonTopLabel(com.garmin.android.apps.connectmobile.golf.truswing.k.b(activity, str));
        gCMComplexTwoLineButton.setButtonTopLabelTextColor(R.color.gcm_golf_text_accent);
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(activity.getString(R.string.golf_swing_label, Integer.valueOf(swingSessionDTO.f35886e)));
        return view2;
    }
}
