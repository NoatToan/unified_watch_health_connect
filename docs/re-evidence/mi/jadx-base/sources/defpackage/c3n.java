package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;

/* JADX INFO: loaded from: classes5.dex */
public class c3n extends LinearLayoutManager {

    public class a extends n {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public c3n(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }
}
