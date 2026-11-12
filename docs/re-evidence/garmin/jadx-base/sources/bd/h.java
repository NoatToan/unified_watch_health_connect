package bd;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class h extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f17502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f17503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<View> f17504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17506e;

    public h(View view2) {
        super(view2);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f17504c = sparseArray;
        TextView textView = (TextView) view2.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view2.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view2.findViewById(R.id.icon));
        sparseArray.put(com.garmin.android.apps.connectmobile.R.id.icon_frame, view2.findViewById(com.garmin.android.apps.connectmobile.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view2.findViewById(R.id.icon_frame));
        this.f17502a = view2.getBackground();
        if (textView != null) {
            this.f17503b = textView.getTextColors();
        }
    }

    public final View d(int i14) {
        SparseArray<View> sparseArray = this.f17504c;
        View view2 = sparseArray.get(i14);
        if (view2 != null) {
            return view2;
        }
        View viewFindViewById = this.itemView.findViewById(i14);
        if (viewFindViewById != null) {
            sparseArray.put(i14, viewFindViewById);
        }
        return viewFindViewById;
    }
}
