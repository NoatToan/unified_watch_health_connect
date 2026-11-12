package x21;

import e23.l;
import p005kotlin.Unit;
import p3.i0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f188489b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f188488a = i14;
        this.f188489b = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f188488a;
        c cVar = this.f188489b;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                int i15 = c.f188490g;
                cVar.f188491a.setValue(bool);
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                int i16 = c.f188490g;
                str.getClass();
                cVar.f188492b.setValue(str);
                return Unit.INSTANCE;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                int i17 = c.f188490g;
                cVar.f188493c.i(fFloatValue);
                return Unit.INSTANCE;
            case 3:
                String str2 = (String) obj;
                int i18 = c.f188490g;
                str2.getClass();
                cVar.f188491a.setValue(Boolean.FALSE);
                cVar.f188493c.i(0.0f);
                cVar.f188494d.setValue(str2);
                return Unit.INSTANCE;
            default:
                ((i0) obj).getClass();
                cVar.f188496f.e();
                return new d(cVar);
        }
    }
}
