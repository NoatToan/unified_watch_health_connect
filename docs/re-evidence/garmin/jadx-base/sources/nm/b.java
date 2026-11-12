package nm;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnm/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "mainChartData", "overlayChartData", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f126526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm.p f126527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zm.p f126528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zm.p f126529d;

    public b(Context context, zm.p pVar, zm.p pVar2) {
        context.getClass();
        pVar.getClass();
        this.f126526a = context;
        this.f126527b = pVar;
        this.f126528c = pVar2;
        if (pVar2 != null && c().contains(Integer.valueOf(pVar2.g1()))) {
            pVar = pVar2;
        } else if (!c().contains(Integer.valueOf(pVar.g1()))) {
            pVar = null;
        }
        this.f126529d = pVar;
    }

    public String a() {
        return null;
    }

    public abstract i53.c<j82.f> b();

    public abstract List<Integer> c();

    public abstract boolean d();
}
