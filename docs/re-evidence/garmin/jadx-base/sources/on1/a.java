package on1;

import com.garmin.android.apps.connectmobile.R;
import f12.l;
import l22.b;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import yz.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lon1/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f133043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133044b;

    public a(b bVar) {
        bVar.getClass();
        this.f133043a = bVar;
        this.f133044b = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).c();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (em1.a.a(r3) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(double d14) {
        b bVar = this.f133043a;
        String string = bVar.getString(R.string.lbl_degree_sign);
        boolean z14 = this.f133044b;
        if (!z14) {
            if (!z14) {
                em1.a aVar = em1.a.f64616a;
                Double dValueOf = Double.valueOf(d14);
                aVar.getClass();
            }
            return bVar.getString(R.string.no_value_card);
        }
        em1.a aVar2 = em1.a.f64616a;
        Double dValueOf2 = Double.valueOf(d14);
        aVar2.getClass();
        if (!em1.a.b(dValueOf2)) {
            if (!z14) {
                em1.a aVar3 = em1.a.f64616a;
                Double dValueOf3 = Double.valueOf(d14);
                aVar3.getClass();
            }
            return bVar.getString(R.string.no_value_card);
        }
        return new i().getFormattedValue((float) d14).concat(string);
    }
}
