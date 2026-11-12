package lc;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB9\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000e¢\u0006\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Llc/b;", "Llc/i0;", "Llc/a$b;", "Llc/a;", "navigator", "", TtmlNode.ATTR_ID, "<init>", "(Llc/a;I)V", "", "route", "(Llc/a;Ljava/lang/String;)V", "Lk23/d;", "", "", "Lk23/p;", "Llc/q0;", "typeMap", "(Llc/a;Lk23/d;Ljava/util/Map;)V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends i0<a.b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f111720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k23.d<? extends Activity> f111721i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, k23.d<? extends Object> dVar, Map<k23.p, q0<?>> map) {
        super(aVar, dVar, map);
        aVar.getClass();
        dVar.getClass();
        map.getClass();
        this.f111720h = aVar.f111715c;
    }

    @Override // lc.i0
    public final h0 a() {
        a.b bVar = (a.b) super.a();
        if (bVar.f111717g == null) {
            bVar.f111717g = new Intent();
        }
        Intent intent = bVar.f111717g;
        intent.getClass();
        intent.setPackage(null);
        k23.d<? extends Activity> dVar = this.f111721i;
        if (dVar != null) {
            ComponentName componentName = new ComponentName(this.f111720h, (Class<?>) dh.b.u(dVar));
            if (bVar.f111717g == null) {
                bVar.f111717g = new Intent();
            }
            Intent intent2 = bVar.f111717g;
            intent2.getClass();
            intent2.setComponent(componentName);
        }
        if (bVar.f111717g == null) {
            bVar.f111717g = new Intent();
        }
        Intent intent3 = bVar.f111717g;
        intent3.getClass();
        intent3.setAction(null);
        if (bVar.f111717g == null) {
            bVar.f111717g = new Intent();
        }
        Intent intent4 = bVar.f111717g;
        intent4.getClass();
        intent4.setData(null);
        bVar.f111718h = null;
        return bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str) {
        super(aVar, str);
        aVar.getClass();
        str.getClass();
        this.f111720h = aVar.f111715c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o13.e
    public b(a aVar, int i14) {
        super(aVar, i14);
        aVar.getClass();
        this.f111720h = aVar.f111715c;
    }
}
