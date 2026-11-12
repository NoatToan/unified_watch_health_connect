package p6;

import android.content.Context;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.FeatureStateOperationCallback;
import fa.z;
import java.util.HashMap;
import java.util.List;
import p005kotlin.jvm.internal.t0;
import p3.m;
import p3.o0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements pa.f.a, androidx.media3.exoplayer.mediacodec.f, MediaCodecUtil.f, pb.g.a, FeatureStateOperationCallback, OnCompleteListener, IFillFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136191a;

    public /* synthetic */ b(int i14) {
        this.f136191a = i14;
    }

    public static long a(d92.b bVar, m mVar) {
        bVar.getClass();
        return d92.b.a(mVar).c().e();
    }

    public static long b(o0 o0Var) {
        return d92.b.a(o0Var).c().e();
    }

    public static Double c(double d14, Double d15) {
        return Double.valueOf(d15.doubleValue() * d14);
    }

    public static String d(Context context, int i14, String str) {
        str.getClass();
        String string = context.getString(i14);
        string.getClass();
        return string;
    }

    public static String e(String str, k23.d dVar) {
        return str + dVar;
    }

    public static String f(StringBuilder sb3, Boolean bool, String str) {
        sb3.append(bool);
        sb3.append(str);
        return sb3.toString();
    }

    public static String g(StringBuilder sb3, Long l14, String str) {
        sb3.append(l14);
        sb3.append(str);
        return sb3.toString();
    }

    public static String h(t0 t0Var, Class cls, StringBuilder sb3) {
        sb3.append(t0Var.b(cls));
        return sb3.toString();
    }

    public static StringBuilder i(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
        sb3.append(str5);
        return sb3;
    }

    public static StringBuilder j(String str, t43.m mVar, String str2) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(mVar);
        sb3.append(str2);
        return sb3;
    }

    public static void k(long j8, String str, String str2, StringBuilder sb3) {
        sb3.append(j8);
        sb3.append(str);
        sb3.append(str2);
    }

    public static void l(Integer num, String str, String str2, String str3, StringBuilder sb3) {
        sb3.append(num);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append((Object) " must implement ");
        sb3.append(obj2);
        throw new ClassCastException(sb3.toString());
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new ns2.d(str + obj);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new ns2.d(str + obj);
    }

    @Override // pb.g.a
    public boolean evaluate(int i14, int i15, int i16, int i17, int i18) {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.f
    public List getDecoderInfos(String str, boolean z14, boolean z15) {
        return MediaCodecUtil.e(str, z14, z15);
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        switch (this.f136191a) {
            case 25:
                int i14 = q30.b.f142378f;
                break;
            case 26:
                int i15 = q30.b.f142378f;
                break;
            default:
                int i16 = q30.b.f142378f;
                break;
        }
        return lineDataProvider.getYChartMin();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f
    public int getScore(Object obj) {
        HashMap<MediaCodecUtil.b, List<androidx.media3.exoplayer.mediacodec.d>> map = MediaCodecUtil.f9248a;
        String str = ((androidx.media3.exoplayer.mediacodec.d) obj).f9270a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (z.f70071a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        if (task == null || !task.isComplete()) {
            String str = a2.CLOUD_MESSAGING.f28756a;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, str, "FirebaseMessaging delete token error");
            return;
        }
        String str2 = a2.CLOUD_MESSAGING.f28756a;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, str2, "FirebaseMessaging delete token successfully");
    }

    @Override // com.mapbox.maps.FeatureStateOperationCallback
    public void run(Expected expected) {
        switch (this.f136191a) {
            case 17:
                expected.getClass();
                break;
            case 18:
                expected.getClass();
                break;
            case 19:
                expected.getClass();
                break;
            case 20:
                expected.getClass();
                break;
            case 21:
                expected.getClass();
                break;
            default:
                expected.getClass();
                break;
        }
    }
}
