package i63;

import com.garmin.android.gncs.NotificationConstants;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import m63.y1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f91888b;

    public /* synthetic */ f(g gVar, int i14) {
        this.f91887a = i14;
        this.f91888b = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k63.a aVar = (k63.a) obj;
        switch (this.f91887a) {
            case 0:
                aVar.getClass();
                x0.f105818a.getClass();
                y1.f117048a.getClass();
                k63.a.b(aVar, NotificationConstants.KEY_DATA_MIME_TYPE, y1.f117049b);
                StringBuilder sb3 = new StringBuilder("kotlinx.serialization.Sealed<");
                g gVar = this.f91888b;
                sb3.append(gVar.f91889a.D());
                sb3.append('>');
                k63.a.b(aVar, "value", k63.k.e(sb3.toString(), k63.l.a.f103251a, new k63.e[0], new f(gVar, 1)));
                List<? extends Annotation> list = gVar.f91890b;
                list.getClass();
                aVar.f103213b = list;
                break;
            default:
                aVar.getClass();
                for (Map.Entry entry : this.f91888b.f91893e.entrySet()) {
                    k63.a.b(aVar, (String) entry.getKey(), ((c) entry.getValue()).getF158591b());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
