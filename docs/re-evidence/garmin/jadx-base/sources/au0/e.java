package au0;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f12886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ char f12887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f12888d;

    public /* synthetic */ e(e23.l lVar, char c14, p1 p1Var, int i14) {
        this.f12885a = i14;
        this.f12886b = lVar;
        this.f12887c = c14;
        this.f12888d = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.f12885a) {
            case 0:
                str.getClass();
                if (str.length() <= 5) {
                    StringBuilder sb3 = new StringBuilder();
                    int length = str.length();
                    boolean z14 = false;
                    for (int i14 = 0; i14 < length; i14++) {
                        char cCharAt = str.charAt(i14);
                        boolean z15 = true;
                        if (!Character.isDigit(cCharAt)) {
                            if ((cCharAt == this.f12887c || cCharAt == '.') && !z14) {
                                z14 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        if (z15) {
                            sb3.append(cCharAt);
                        }
                    }
                    String string = sb3.toString();
                    this.f12888d.setValue(string);
                    this.f12886b.invoke(string);
                }
                break;
            default:
                str.getClass();
                if (str.length() <= 5) {
                    StringBuilder sb4 = new StringBuilder();
                    int length2 = str.length();
                    boolean z16 = false;
                    for (int i15 = 0; i15 < length2; i15++) {
                        char cCharAt2 = str.charAt(i15);
                        boolean z17 = true;
                        if (!Character.isDigit(cCharAt2)) {
                            if ((cCharAt2 == this.f12887c || cCharAt2 == '.') && !z16) {
                                z16 = true;
                            } else {
                                z17 = false;
                            }
                        }
                        if (z17) {
                            sb4.append(cCharAt2);
                        }
                    }
                    String string2 = sb4.toString();
                    this.f12888d.setValue(string2);
                    this.f12886b.invoke(string2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
