package e60;

import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gg1.o0;
import java.text.DecimalFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le60/a;", "", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "Lgg1/o0;", "prefMeasurementSystem", "<init>", "(Ll22/b;ZLgg1/o0;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f63147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f63149c;

    public /* synthetic */ a(l22.b bVar, boolean z14, o0 o0Var, int i14, j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() : z14, (i14 & 4) != 0 ? ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g() : o0Var);
    }

    public final String a(double d14, String str) {
        str.getClass();
        if (Double.isNaN(d14)) {
            return str;
        }
        m3 m3Var = this.f63148b ? m3.KILOMETER : m3.MILE;
        l3.a aVar = l3.f23124b;
        DecimalFormat decimalFormat = l3.f23129g;
        l22.b bVar = this.f63147a;
        String string = bVar.getString(R.string.no_value);
        aVar.getClass();
        return l3.a.R(bVar, d14, m3Var, decimalFormat, true, string);
    }

    public a(l22.b bVar, boolean z14, o0 o0Var) {
        bVar.getClass();
        o0Var.getClass();
        this.f63147a = bVar;
        this.f63148b = z14;
        this.f63149c = o0Var;
    }
}
