package e51;

import au0.m;
import e23.l;
import h4.r;
import p005kotlin.Unit;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f63061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f63062c;

    public /* synthetic */ g(int i14, l lVar, int i15) {
        this.f63060a = i15;
        this.f63061b = i14;
        this.f63062c = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f63060a) {
            case 0:
                r rVar = (r) obj;
                rVar.getClass();
                return w.d(rVar, false, null, null, new m(this.f63062c, this.f63061b, 8), 15);
            case 1:
                String str = (String) obj;
                str.getClass();
                int length = str.length();
                int i14 = this.f63061b;
                if (length <= i14 && i14 > 0) {
                    this.f63062c.invoke(str);
                }
                return Unit.INSTANCE;
            case 2:
                ((Boolean) obj).booleanValue();
                this.f63062c.invoke(Integer.valueOf(this.f63061b));
                return Unit.INSTANCE;
            default:
                String str2 = (String) obj;
                str2.getClass();
                int length2 = str2.length();
                int i15 = this.f63061b;
                if (length2 <= i15 && i15 > 0) {
                    this.f63062c.invoke(str2);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(l lVar, int i14, int i15) {
        this.f63060a = i15;
        this.f63062c = lVar;
        this.f63061b = i14;
    }
}
