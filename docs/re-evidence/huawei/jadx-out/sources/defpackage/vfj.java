package defpackage;

import android.content.Context;
import com.huawei.ui.main.stories.health.interactors.healthdata.BodyReportRecycleItem;

/* JADX INFO: loaded from: classes19.dex */
public class vfj {
    public static vfm d(Context context, BodyReportRecycleItem bodyReportRecycleItem) {
        if (context == null || bodyReportRecycleItem == null || bodyReportRecycleItem.e() == null) {
            return null;
        }
        switch (AnonymousClass3.f51030a[bodyReportRecycleItem.e().ordinal()]) {
            case 1:
                return new vfr(context, bodyReportRecycleItem);
            case 2:
                return new vfu(context, bodyReportRecycleItem);
            case 3:
                return new vfp(context, bodyReportRecycleItem);
            case 4:
                return new vfq(context, bodyReportRecycleItem);
            case 5:
            case 6:
                return new vfs(context, bodyReportRecycleItem);
            case 7:
                return new vfx(context, bodyReportRecycleItem);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: vfj$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51030a;

        static {
            int[] iArr = new int[BodyReportRecycleItem.BodyReportType.values().length];
            f51030a = iArr;
            try {
                iArr[BodyReportRecycleItem.BodyReportType.BODY_ANALYSIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51030a[BodyReportRecycleItem.BodyReportType.PEER_COMPARISON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51030a[BodyReportRecycleItem.BodyReportType.MUSCLE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51030a[BodyReportRecycleItem.BodyReportType.FAT_ANALYSIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51030a[BodyReportRecycleItem.BodyReportType.OTHER_INDICATORS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51030a[BodyReportRecycleItem.BodyReportType.IMPORTANT_INDICATORS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51030a[BodyReportRecycleItem.BodyReportType.PHYSIQUE_PREDICTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
