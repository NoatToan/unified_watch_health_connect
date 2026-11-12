package w91;

import android.app.Activity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f183581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ba1.d f183582c;

    public /* synthetic */ b(Activity activity, ba1.d dVar, int i14) {
        this.f183580a = i14;
        this.f183581b = activity;
        this.f183582c = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Double d14 = (Double) obj;
        switch (this.f183580a) {
            case 0:
                double dDoubleValue = d14.doubleValue();
                Activity activity = this.f183581b;
                if (activity != null) {
                    ba1.d dVar = this.f183582c;
                    dVar.getClass();
                    p91.a aVar = (p91.a) KoinJavaComponent.get$default(p91.a.class, null, null, 6, null);
                    String str = dVar.f16986l;
                    if (str == null) {
                        str = "";
                    }
                    aVar.a(activity, str, dDoubleValue);
                    dVar.B4();
                }
                break;
            default:
                double dDoubleValue2 = d14.doubleValue();
                Activity activity2 = this.f183581b;
                if (activity2 != null) {
                    ba1.d dVar2 = this.f183582c;
                    dVar2.getClass();
                    p91.a aVar2 = (p91.a) KoinJavaComponent.get$default(p91.a.class, null, null, 6, null);
                    String str2 = dVar2.f16986l;
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar2.a(activity2, str2, dDoubleValue2);
                    dVar2.B4();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
