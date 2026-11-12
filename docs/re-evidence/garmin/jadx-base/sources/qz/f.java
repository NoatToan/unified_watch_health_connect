package qz;

import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.Legend;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f148595a = a.f148596a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqz/f$a;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f148596a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f148597b = R.color.gcm_chart_text_label;

        private a() {
        }
    }

    void a(List<xz.f> list);

    Legend b();
}
