package cq0;

import com.garmin.android.apps.connectmobile.incidentdetection.EdgeIncidentDetectionService;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.q f55127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f55128c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e(e23.l lVar, List list, int i14) {
        this.f55126a = i14;
        this.f55127b = (p005kotlin.jvm.internal.q) lVar;
        this.f55128c = list;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e23.l, kotlin.jvm.internal.q] */
    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f55126a;
        List list = this.f55128c;
        ?? r14 = this.f55127b;
        switch (i14) {
            case 0:
                int i15 = EdgeIncidentDetectionService.f36785w;
                r14.invoke(list);
                break;
            default:
                int i16 = lq0.c.f114315g;
                r14.invoke(list);
                break;
        }
    }
}
