package bd0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes8.dex */
public class a0 extends ArrayAdapter<z> {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ProgressBar f17526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ProgressBar f17527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f17528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f17529d;
    }

    public a0(Context context, List<z> list) {
        super(context, R.layout.gcm_device_setup_progress_item, list);
    }

    public final void a(y yVar) {
        z zVar;
        int i14 = 0;
        while (true) {
            if (i14 >= getCount()) {
                zVar = null;
                break;
            }
            zVar = (z) getItem(i14);
            if (yVar == zVar.f17662b) {
                break;
            } else {
                i14++;
            }
        }
        if (zVar != null) {
            remove(zVar);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        a aVar;
        if (view2 == null) {
            view2 = LayoutInflater.from(getContext()).inflate(R.layout.gcm_device_setup_progress_item, viewGroup, false);
            aVar = new a();
            aVar.f17526a = (ProgressBar) view2.findViewById(R.id.spinning_progress_bar);
            aVar.f17528c = (ImageView) view2.findViewById(R.id.result_image);
            aVar.f17529d = (TextView) view2.findViewById(R.id.progress_text);
            aVar.f17527b = (ProgressBar) view2.findViewById(R.id.sync_progress_bar);
            view2.setTag(aVar);
        } else {
            aVar = (a) view2.getTag();
        }
        z zVar = (z) getItem(i14);
        if (zVar != null) {
            y yVar = zVar.f17662b;
            if (zVar.f17661a != -1) {
                aVar.f17526a.setVisibility(4);
                aVar.f17528c.setBackgroundDrawable(a7.b.getDrawable(getContext(), zVar.f17661a));
                aVar.f17528c.setVisibility(0);
            } else {
                aVar.f17526a.setVisibility(0);
                aVar.f17528c.setVisibility(4);
            }
            StringBuilder sb3 = new StringBuilder();
            y yVar2 = y.SYNC_UPLOAD_PREPARED;
            if (yVar == yVar2 || yVar == y.SYNC_DOWNLOAD_PREPARED) {
                if (yVar == yVar2) {
                    int i15 = (int) zVar.f17664d;
                    int i16 = (int) zVar.f17665e;
                    aVar.f17527b.setMax(i15 == 0 ? 1 : i15);
                    aVar.f17527b.setProgress(i15 != 0 ? i16 : 1);
                    sb3.append(getContext().getResources().getString(yVar.f17660a, String.valueOf(i16), String.valueOf(i15)));
                } else if (yVar == y.SYNC_DOWNLOAD_PREPARED) {
                    ProgressBar progressBar = aVar.f17527b;
                    int i17 = zVar.f17666f;
                    if (i17 == 0) {
                        i17 = 1;
                    }
                    progressBar.setMax(i17);
                    aVar.f17527b.setProgress(zVar.f17666f != 0 ? zVar.f17667g : 1);
                    sb3.append(getContext().getResources().getString(yVar.f17660a, String.valueOf(zVar.f17667g), String.valueOf(zVar.f17666f)));
                }
                aVar.f17527b.setVisibility(0);
            } else {
                aVar.f17527b.setVisibility(8);
                sb3 = new StringBuilder(getContext().getResources().getString(yVar.f17660a));
            }
            if (zVar.f17663c != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(zVar.f17663c);
            }
            aVar.f17529d.setText(sb3.toString());
        }
        return view2;
    }
}
