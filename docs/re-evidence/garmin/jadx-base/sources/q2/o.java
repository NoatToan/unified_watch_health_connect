package q2;

import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Device;
import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.Metadata;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o {
    public static /* synthetic */ DataOrigin.Builder b() {
        return new DataOrigin.Builder();
    }

    public static /* synthetic */ Device.Builder d() {
        return new Device.Builder();
    }

    public static /* synthetic */ ExerciseLap.Builder g(Instant instant, Instant instant2) {
        return new ExerciseLap.Builder(instant, instant2);
    }

    public static /* synthetic */ Metadata.Builder i() {
        return new Metadata.Builder();
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder k(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder l(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* synthetic */ void n() {
    }
}
