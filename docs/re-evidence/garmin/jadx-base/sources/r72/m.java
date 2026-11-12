package r72;

import android.net.Uri;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f151192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f151193c;

    public /* synthetic */ m(r0 r0Var, e23.l lVar, int i14) {
        this.f151191a = i14;
        this.f151192b = r0Var;
        this.f151193c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object, r72.i] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object, r72.i] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object, r72.i] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object, r72.i] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Uri uri;
        switch (this.f151191a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                r0 r0Var = this.f151192b;
                ?? A = i.a((i) r0Var.f105810a, iIntValue, false, false, null, 14);
                r0Var.f105810a = A;
                this.f151193c.invoke(A);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                r0 r0Var2 = this.f151192b;
                ?? A2 = i.a((i) r0Var2.f105810a, 0, zBooleanValue, false, null, 13);
                r0Var2.f105810a = A2;
                this.f151193c.invoke(A2);
                break;
            case 2:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                r0 r0Var3 = this.f151192b;
                ?? A3 = i.a((i) r0Var3.f105810a, 0, false, zBooleanValue2, null, 11);
                r0Var3.f105810a = A3;
                this.f151193c.invoke(A3);
                break;
            case 3:
                c cVar = (c) obj;
                cVar.getClass();
                r0 r0Var4 = this.f151192b;
                ?? A4 = i.a((i) r0Var4.f105810a, 0, false, false, cVar, 7);
                r0Var4.f105810a = A4;
                this.f151193c.invoke(A4);
                break;
            default:
                if (((Boolean) obj).booleanValue() && (uri = (Uri) this.f151192b.f105810a) != null) {
                    this.f151193c.invoke(uri);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
