package b00;

import android.view.View;
import androidx.lifecycle.y0;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14135a = a.f14136a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb00/b$a;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f14136a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y0<b00.a> f14137b = new y0<>();

        private a() {
        }
    }

    OnChartGestureListener a();

    View.OnLongClickListener b();

    View.OnTouchListener c();
}
