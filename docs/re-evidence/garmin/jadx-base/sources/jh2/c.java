package jh2;

import ci2.m;
import hi2.d;
import java.util.Map;
import mh2.i;
import mh2.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljh2/c;", "", "Lci2/m;", "settingsFragment", "<init>", "(Lci2/m;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f98761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f98762b;

    public c(m mVar) {
        mVar.getClass();
        this.f98761a = mVar;
        this.f98762b = new d("ViewController", null, 2, null);
    }

    public final void a(Map<String, ? extends Object> map) {
        i iVar = i.TYPE;
        String str = iVar.f118617a;
        String str2 = iVar.f118617a;
        Object obj = map.get(str);
        if (!s.g(obj != null ? obj.toString() : null, l.HEADER.f118654a)) {
            Object obj2 = map.get(str2);
            if (!s.g(obj2 != null ? obj2.toString() : null, l.SPACER.f118654a)) {
                Object obj3 = map.get(str2);
                if (!s.g(obj3 != null ? obj3.toString() : null, l.DEVICE.f118654a)) {
                    return;
                }
            }
        }
        this.f98761a.v6().setPadding(0, 0, 0, 0);
    }
}
