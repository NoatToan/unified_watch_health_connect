package zm1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzm1/v;", "Luz/c;", "Lzm1/o;", "Lrl1/i;", "Lzm1/s;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "trainingReadinessFactor", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZZ)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements uz.c<o, rl1.i, s, IBarLineScatterCandleBubbleDataSet<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f205343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f205344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f205345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f205346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f205347e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f205348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f205349b;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.SLEEP_SCORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f205348a = iArr;
            int[] iArr2 = new int[rl1.i.values().length];
            try {
                iArr2[rl1.i.RESTING_HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[rl1.i.OVERNIGHT_HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[rl1.i.BODY_BATTERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[rl1.i.SKIN_TEMP.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[rl1.i.PULSE_OX.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[rl1.i.RESPIRATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[rl1.i.RESPIRATION_AVERAGES.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[rl1.i.OVERNIGHT_HRV.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            f205349b = iArr2;
        }
    }

    public v(Context context, LocalDate localDate, LocalDate localDate2, boolean z14, boolean z15) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f205343a = context;
        this.f205344b = localDate;
        this.f205345c = localDate2;
        this.f205346d = z14;
        this.f205347e = z15;
    }

    @Override // uz.c
    public final qz.c a(o oVar, rl1.i iVar) {
        rl1.i iVar2 = iVar;
        int i14 = iVar2 == null ? -1 : a.f205349b[iVar2.ordinal()];
        boolean z14 = this.f205346d;
        LocalDate localDate = this.f205345c;
        LocalDate localDate2 = this.f205344b;
        Context context = this.f205343a;
        switch (i14) {
            case 1:
                return new m(context, localDate2, localDate, z14);
            case 2:
                return new c(context, localDate2, localDate, z14);
            case 3:
                return new i(context, localDate2, localDate, z14);
            case 4:
                return new r(context, localDate2, localDate, z14);
            case 5:
                return new k(context, localDate2, localDate, z14);
            case 6:
            case 7:
                return new l(context, localDate2, localDate, z14);
            case 8:
                return new j(context, localDate2, localDate, z14);
            default:
                return null;
        }
    }

    @Override // uz.c
    public final qz.c b(o oVar, rl1.i iVar) {
        o oVar2 = oVar;
        oVar2.getClass();
        if (a.f205348a[oVar2.ordinal()] != 1) {
            u0.r();
            return null;
        }
        return new n(this.f205343a, this.f205344b, this.f205345c, this.f205346d, this.f205347e);
    }
}
