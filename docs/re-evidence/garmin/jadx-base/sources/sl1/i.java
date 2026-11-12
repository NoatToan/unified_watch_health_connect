package sl1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsl1/i;", "Luz/c;", "Lrl1/j;", "Lrl1/i;", "Lrm1/j;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements uz.c<rl1.j, rl1.i, rm1.j, IBarLineScatterCandleBubbleDataSet<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f159992a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159993a;

        static {
            int[] iArr = new int[rl1.i.values().length];
            try {
                iArr[rl1.i.MOVEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rl1.i.BREATHING_VARIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rl1.i.AWAKE_RESTLESSNESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rl1.i.RESTING_HEART_RATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rl1.i.BODY_BATTERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rl1.i.PULSE_OX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rl1.i.RESPIRATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rl1.i.RESPIRATION_AVERAGES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[rl1.i.OVERNIGHT_HRV.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f159993a = iArr;
        }
    }

    public i(Context context) {
        context.getClass();
        this.f159992a = context;
    }

    @Override // uz.c
    public final qz.c a(rl1.j jVar, rl1.i iVar) {
        rl1.i iVar2 = iVar;
        int i14 = iVar2 == null ? -1 : a.f159993a[iVar2.ordinal()];
        Context context = this.f159992a;
        switch (i14) {
            case 1:
                return new xl1.a(context);
            case 2:
                return new vl1.b(context);
            case 3:
                return new tl1.c(context);
            case 4:
                return new wl1.b(context);
            case 5:
                return new ul1.a(context);
            case 6:
                return new zl1.a(context);
            case 7:
                return new am1.a(context);
            case 8:
                return new bm1.a(context);
            case 9:
                return new yl1.a(context);
            default:
                return null;
        }
    }

    @Override // uz.c
    public final qz.c b(rl1.j jVar, rl1.i iVar) {
        jVar.getClass();
        return new cm1.a(this.f159992a);
    }
}
