package iw0;

import android.content.Context;
import b63.o;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pv0.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0001B7\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Liw0/c;", "Luz/c;", "Lkw0/b;", "Lpv0/r;", "Lkw0/f;", "Lkw0/e;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Lpi0/e;", "dateTimeFormatter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj23/g;", "Lb63/o;", "dateInterval", "", "daily", "showDetailedTypes", "<init>", "(Lpi0/e;Landroid/content/Context;Lj23/g;ZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements uz.c<kw0.b, r, kw0.f<kw0.e>, IBarLineScatterCandleBubbleDataSet<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi0.e f95284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f95285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j23.g<o> f95286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f95288e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95289a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.SLEEP_SCORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.OVERNIGHT_HRV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.OVERNIGHT_STRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f95289a = iArr;
        }
    }

    public c(pi0.e eVar, Context context, j23.g<o> gVar, boolean z14, boolean z15) {
        eVar.getClass();
        context.getClass();
        gVar.getClass();
        this.f95284a = eVar;
        this.f95285b = context;
        this.f95286c = gVar;
        this.f95287d = z14;
        this.f95288e = z15;
    }

    @Override // uz.c
    public final qz.c a(kw0.b bVar, r rVar) {
        r rVar2 = rVar;
        int i14 = rVar2 == null ? -1 : a.f95289a[rVar2.ordinal()];
        boolean z14 = this.f95287d;
        j23.g<o> gVar = this.f95286c;
        Context context = this.f95285b;
        pi0.e eVar = this.f95284a;
        if (i14 == 1) {
            return new g(eVar, context, gVar, z14);
        }
        if (i14 == 2) {
            return new e(eVar, context, gVar, z14);
        }
        if (i14 != 3) {
            return null;
        }
        return new f(eVar, context, gVar, z14);
    }

    @Override // uz.c
    public final qz.c b(kw0.b bVar, r rVar) {
        bVar.getClass();
        return new b(this.f95284a, this.f95285b, this.f95286c, this.f95288e, this.f95287d);
    }

    public /* synthetic */ c(pi0.e eVar, Context context, j23.g gVar, boolean z14, boolean z15, int i14, j jVar) {
        this(eVar, context, gVar, z14, (i14 & 16) != 0 ? false : z15);
    }
}
