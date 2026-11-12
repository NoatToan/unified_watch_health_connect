package a61;

import android.media.MediaCodec;
import android.os.Parcelable;
import androidx.camera.core.impl.l2;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import b0.w0;
import com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.model.LactateSummaryMeasurementsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import id0.p5;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1554b;

    public /* synthetic */ c(Object obj, int i14) {
        this.f1553a = i14;
        this.f1554b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i14 = this.f1553a;
        int i15 = 0;
        Object obj3 = this.f1554b;
        switch (i14) {
            case 0:
                e eVar = e.f1563a;
                return ((Number) ((a03.n) obj3).invoke(obj, obj2)).intValue();
            case 1:
                e eVar2 = e.f1563a;
                return ((Number) ((d) obj3).invoke(obj, obj2)).intValue();
            case 2:
                return ((Number) ((c50.a) obj3).invoke(obj, obj2)).intValue();
            case 3:
                Parcelable.Creator<WorkoutDetailsDTO> creator = WorkoutDetailsDTO.CREATOR;
                return ((Number) ((com.garmin.android.apps.connectmobile.workouts.data.model.e0) obj3).invoke(obj, obj2)).intValue();
            case 4:
                com.garmin.android.apps.connectmobile.workouts.data.model.h0.a aVar = com.garmin.android.apps.connectmobile.workouts.data.model.h0.f48185j;
                return ((Number) ((com.garmin.android.apps.connectmobile.workouts.data.model.e0) obj3).invoke(obj, obj2)).intValue();
            case 5:
                com.garmin.android.apps.connectmobile.workouts.data.model.h0.a aVar2 = com.garmin.android.apps.connectmobile.workouts.data.model.h0.f48185j;
                return ((Number) ((com.garmin.android.apps.connectmobile.workouts.data.model.e0) obj3).invoke(obj, obj2)).intValue();
            case 6:
                int i16 = dh1.b.f59626f;
                return ((Number) ((dh1.a) obj3).invoke(obj, obj2)).intValue();
            case 7:
                return ((Number) ((d50.b) obj3).invoke(obj, obj2)).intValue();
            case 8:
                com.garmin.android.apps.connectmobile.social.b.a aVar3 = com.garmin.android.apps.connectmobile.social.b.T0;
                return ((Number) ((d50.b) obj3).invoke(obj, obj2)).intValue();
            case 9:
                int i17 = com.garmin.android.apps.connectmobile.activities.stats.exercises.c.A;
                return ((Number) ((fp0.l) obj3).invoke(obj, obj2)).intValue();
            case 10:
                t60.a aVar4 = ih0.s.f93481l;
                return ((Number) ((p5) obj3).invoke(obj, obj2)).intValue();
            case 11:
                return ((Number) ((ml0.a) obj3).invoke(obj, obj2)).intValue();
            case 12:
                return ((Number) ((d81.z) obj3).invoke(obj, obj2)).intValue();
            case 13:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                return ((Number) ((ml0.a) obj3).invoke(obj, obj2)).intValue();
            case 14:
                l2.f fVar = (l2.f) obj2;
                ((p0.f) obj3).getClass();
                Class<?> cls = ((l2.f) obj).f().f5476j;
                int i18 = cls == MediaCodec.class ? 2 : (cls == w0.class || cls == v0.d.class) ? 0 : 1;
                Class<?> cls2 = fVar.f().f5476j;
                if (cls2 == MediaCodec.class) {
                    i15 = 2;
                } else if (cls2 != w0.class && cls2 != v0.d.class) {
                    i15 = 1;
                }
                return i18 - i15;
            case 15:
                MediaCodecUtil.f fVar2 = (MediaCodecUtil.f) obj3;
                HashMap<MediaCodecUtil.b, List<androidx.media3.exoplayer.mediacodec.d>> map = MediaCodecUtil.f9248a;
                return fVar2.getScore(obj2) - fVar2.getScore(obj);
            case 16:
                return ((Number) ((pk0.l) obj3).invoke(obj, obj2)).intValue();
            case 17:
                return ((Number) ((q51.a) obj3).invoke(obj, obj2)).intValue();
            case 18:
                return ((Number) ((q51.a) obj3).invoke(obj, obj2)).intValue();
            case 19:
                for (e23.l lVar : (e23.l[]) obj3) {
                    int iB = r13.a.b((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
                    if (iB != 0) {
                        return iB;
                    }
                }
                return 0;
            case 20:
                int i19 = s20.m.f156023b;
                return ((Number) ((rk2.b) obj3).invoke(obj, obj2)).intValue();
            case 21:
                return ((Number) ((s5.a) obj3).invoke(obj, obj2)).intValue();
            case 22:
                int i24 = com.garmin.android.apps.connectmobile.powerguide.a.f40362e;
                return ((Number) ((s70.v) obj3).invoke(obj, obj2)).intValue();
            case 23:
                sj1.a.C3020a c3020a = sj1.a.f159441a;
                return ((Number) ((si1.a) obj3).invoke(obj, obj2)).intValue();
            case 24:
                return ((Number) ((sv0.b) obj3).invoke(obj, obj2)).intValue();
            case 25:
                return ((Number) ((sv0.b) obj3).invoke(obj, obj2)).intValue();
            case 26:
                return ((Number) ((tr2.o) obj3).invoke(obj, obj2)).intValue();
            case 27:
                uk0.i iVar = uk0.i.f171830a;
                return ((Number) ((u91.i) obj3).invoke(obj, obj2)).intValue();
            case 28:
                int i25 = LactateSummaryMeasurementsDTO.f37138g;
                return ((Number) ((vp1.a) obj3).invoke(obj, obj2)).intValue();
            default:
                int i26 = LactateSummaryMeasurementsDTO.f37138g;
                return ((Number) ((vp1.a) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
