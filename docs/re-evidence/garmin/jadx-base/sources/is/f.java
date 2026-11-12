package is;

import android.graphics.Canvas;
import android.graphics.Picture;
import nr.p0;
import o4.y;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Picture f94869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f94870c;

    public /* synthetic */ f(Picture picture, p0 p0Var, int i14) {
        this.f94868a = i14;
        this.f94869b = picture;
        this.f94870c = p0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        l4.f fVar = (l4.f) obj;
        switch (this.f94868a) {
            case 0:
                fVar.getClass();
                final int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (fVar.f109845a.b() >> 32));
                final int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (fVar.f109845a.b() & 4294967295L));
                final int i14 = 1;
                final Picture picture = this.f94869b;
                final p0 p0Var = this.f94870c;
                return fVar.e(new e23.l() { // from class: is.g
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        int i15 = i14;
                        p0 p0Var2 = p0Var;
                        int i16 = iIntBitsToFloat2;
                        int i17 = iIntBitsToFloat;
                        Picture picture2 = picture;
                        q4.c cVar = (q4.c) obj2;
                        switch (i15) {
                            case 0:
                                cVar.getClass();
                                Canvas canvasBeginRecording = picture2.beginRecording(i17, i16);
                                canvasBeginRecording.getClass();
                                Canvas canvas = o4.d.f128822a;
                                o4.c cVar2 = new o4.c();
                                cVar2.f128816a = canvasBeginRecording;
                                g6.o layoutDirection = cVar.getLayoutDirection();
                                long jB = cVar.b();
                                g6.c cVarD = cVar.getF142543b().d();
                                g6.o oVarE = cVar.getF142543b().e();
                                y yVarA = cVar.getF142543b().a();
                                long jB2 = cVar.getF142543b().b();
                                r4.c cVar3 = cVar.getF142543b().f142551b;
                                q4.a.b f142543b = cVar.getF142543b();
                                f142543b.g(cVar);
                                f142543b.h(layoutDirection);
                                f142543b.f(cVar2);
                                f142543b.c(jB);
                                f142543b.f142551b = null;
                                cVar2.l();
                                try {
                                    cVar.m1();
                                    cVar2.i();
                                    q4.a.b f142543b2 = cVar.getF142543b();
                                    f142543b2.g(cVarD);
                                    f142543b2.h(oVarE);
                                    f142543b2.f(yVarA);
                                    f142543b2.c(jB2);
                                    f142543b2.f142551b = cVar3;
                                    picture2.endRecording();
                                    if (p0Var2.f127286e instanceof p0.a.d) {
                                        cVar.m1();
                                    } else {
                                        o4.d.a(cVar.getF142543b().a()).drawPicture(picture2);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    cVar2.i();
                                    q4.a.b f142543b3 = cVar.getF142543b();
                                    f142543b3.g(cVarD);
                                    f142543b3.h(oVarE);
                                    f142543b3.f(yVarA);
                                    f142543b3.c(jB2);
                                    f142543b3.f142551b = cVar3;
                                    throw th3;
                                }
                            default:
                                cVar.getClass();
                                Canvas canvasBeginRecording2 = picture2.beginRecording(i17, i16);
                                canvasBeginRecording2.getClass();
                                Canvas canvas2 = o4.d.f128822a;
                                o4.c cVar4 = new o4.c();
                                cVar4.f128816a = canvasBeginRecording2;
                                g6.o layoutDirection2 = cVar.getLayoutDirection();
                                long jB3 = cVar.b();
                                g6.c cVarD2 = cVar.getF142543b().d();
                                g6.o oVarE2 = cVar.getF142543b().e();
                                y yVarA2 = cVar.getF142543b().a();
                                long jB4 = cVar.getF142543b().b();
                                r4.c cVar5 = cVar.getF142543b().f142551b;
                                q4.a.b f142543b4 = cVar.getF142543b();
                                f142543b4.g(cVar);
                                f142543b4.h(layoutDirection2);
                                f142543b4.f(cVar4);
                                f142543b4.c(jB3);
                                f142543b4.f142551b = null;
                                cVar4.l();
                                try {
                                    cVar.m1();
                                    cVar4.i();
                                    q4.a.b f142543b5 = cVar.getF142543b();
                                    f142543b5.g(cVarD2);
                                    f142543b5.h(oVarE2);
                                    f142543b5.f(yVarA2);
                                    f142543b5.c(jB4);
                                    f142543b5.f142551b = cVar5;
                                    picture2.endRecording();
                                    if (p0Var2.f127286e instanceof p0.a.d) {
                                        cVar.m1();
                                    } else {
                                        o4.d.a(cVar.getF142543b().a()).drawPicture(picture2);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    cVar4.i();
                                    q4.a.b f142543b6 = cVar.getF142543b();
                                    f142543b6.g(cVarD2);
                                    f142543b6.h(oVarE2);
                                    f142543b6.f(yVarA2);
                                    f142543b6.c(jB4);
                                    f142543b6.f142551b = cVar5;
                                    throw th4;
                                }
                        }
                    }
                });
            default:
                fVar.getClass();
                final int iIntBitsToFloat3 = (int) Float.intBitsToFloat((int) (fVar.f109845a.b() >> 32));
                final int iIntBitsToFloat4 = (int) Float.intBitsToFloat((int) (fVar.f109845a.b() & 4294967295L));
                final int i15 = 0;
                final Picture picture2 = this.f94869b;
                final p0 p0Var2 = this.f94870c;
                return fVar.e(new e23.l() { // from class: is.g
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        int i16 = i15;
                        p0 p0Var3 = p0Var2;
                        int i17 = iIntBitsToFloat4;
                        int i18 = iIntBitsToFloat3;
                        Picture picture3 = picture2;
                        q4.c cVar = (q4.c) obj2;
                        switch (i16) {
                            case 0:
                                cVar.getClass();
                                Canvas canvasBeginRecording = picture3.beginRecording(i18, i17);
                                canvasBeginRecording.getClass();
                                Canvas canvas = o4.d.f128822a;
                                o4.c cVar2 = new o4.c();
                                cVar2.f128816a = canvasBeginRecording;
                                g6.o layoutDirection = cVar.getLayoutDirection();
                                long jB = cVar.b();
                                g6.c cVarD = cVar.getF142543b().d();
                                g6.o oVarE = cVar.getF142543b().e();
                                y yVarA = cVar.getF142543b().a();
                                long jB2 = cVar.getF142543b().b();
                                r4.c cVar3 = cVar.getF142543b().f142551b;
                                q4.a.b f142543b = cVar.getF142543b();
                                f142543b.g(cVar);
                                f142543b.h(layoutDirection);
                                f142543b.f(cVar2);
                                f142543b.c(jB);
                                f142543b.f142551b = null;
                                cVar2.l();
                                try {
                                    cVar.m1();
                                    cVar2.i();
                                    q4.a.b f142543b2 = cVar.getF142543b();
                                    f142543b2.g(cVarD);
                                    f142543b2.h(oVarE);
                                    f142543b2.f(yVarA);
                                    f142543b2.c(jB2);
                                    f142543b2.f142551b = cVar3;
                                    picture3.endRecording();
                                    if (p0Var3.f127286e instanceof p0.a.d) {
                                        cVar.m1();
                                    } else {
                                        o4.d.a(cVar.getF142543b().a()).drawPicture(picture3);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    cVar2.i();
                                    q4.a.b f142543b3 = cVar.getF142543b();
                                    f142543b3.g(cVarD);
                                    f142543b3.h(oVarE);
                                    f142543b3.f(yVarA);
                                    f142543b3.c(jB2);
                                    f142543b3.f142551b = cVar3;
                                    throw th3;
                                }
                            default:
                                cVar.getClass();
                                Canvas canvasBeginRecording2 = picture3.beginRecording(i18, i17);
                                canvasBeginRecording2.getClass();
                                Canvas canvas2 = o4.d.f128822a;
                                o4.c cVar4 = new o4.c();
                                cVar4.f128816a = canvasBeginRecording2;
                                g6.o layoutDirection2 = cVar.getLayoutDirection();
                                long jB3 = cVar.b();
                                g6.c cVarD2 = cVar.getF142543b().d();
                                g6.o oVarE2 = cVar.getF142543b().e();
                                y yVarA2 = cVar.getF142543b().a();
                                long jB4 = cVar.getF142543b().b();
                                r4.c cVar5 = cVar.getF142543b().f142551b;
                                q4.a.b f142543b4 = cVar.getF142543b();
                                f142543b4.g(cVar);
                                f142543b4.h(layoutDirection2);
                                f142543b4.f(cVar4);
                                f142543b4.c(jB3);
                                f142543b4.f142551b = null;
                                cVar4.l();
                                try {
                                    cVar.m1();
                                    cVar4.i();
                                    q4.a.b f142543b5 = cVar.getF142543b();
                                    f142543b5.g(cVarD2);
                                    f142543b5.h(oVarE2);
                                    f142543b5.f(yVarA2);
                                    f142543b5.c(jB4);
                                    f142543b5.f142551b = cVar5;
                                    picture3.endRecording();
                                    if (p0Var3.f127286e instanceof p0.a.d) {
                                        cVar.m1();
                                    } else {
                                        o4.d.a(cVar.getF142543b().a()).drawPicture(picture3);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    cVar4.i();
                                    q4.a.b f142543b6 = cVar.getF142543b();
                                    f142543b6.g(cVarD2);
                                    f142543b6.h(oVarE2);
                                    f142543b6.f(yVarA2);
                                    f142543b6.c(jB4);
                                    f142543b6.f142551b = cVar5;
                                    throw th4;
                                }
                        }
                    }
                });
        }
    }
}
