package ca0;

import com.garmin.android.apps.connectmobile.navigation.more.TestSearchActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.m1 f26430b;

    public /* synthetic */ q1(p3.m1 m1Var, int i14) {
        this.f26429a = i14;
        this.f26430b = m1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f26429a;
        p3.m1 m1Var = this.f26430b;
        switch (i14) {
            case 0:
                m1Var.i(((Float) obj).floatValue());
                break;
            case 1:
                f5.c0 c0Var = (f5.c0) obj;
                c0Var.getClass();
                m1Var.i((int) (c0Var.a() >> 32));
                break;
            case 2:
                f5.c0 c0Var2 = (f5.c0) obj;
                int i15 = com.garmin.android.apps.connectmobile.bic.a.f30723c;
                c0Var2.getClass();
                m1Var.i((int) (c0Var2.a() >> 32));
                break;
            case 3:
                float fFloatValue = ((Float) obj).floatValue();
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                m1Var.i(fFloatValue);
                break;
            case 4:
                m1Var.i(((Float) obj).floatValue());
                break;
            case 5:
                m1Var.i(((Float) obj).floatValue());
                break;
            case 6:
                m1Var.i(((Float) obj).floatValue());
                break;
            case 7:
                m1Var.i(((Float) obj).floatValue());
                break;
            case 8:
                m1Var.i(((Float) obj).floatValue());
                break;
            case 9:
                m1Var.i(((Float) obj).floatValue());
                break;
            case 10:
                float fFloatValue2 = ((Float) obj).floatValue();
                int i16 = TestSearchActivity.f39390b;
                m1Var.i(fFloatValue2);
                break;
            case 11:
                m1Var.i(((Float) obj).floatValue());
                break;
            default:
                Float f14 = (Float) obj;
                int i17 = yt.h.f199301x;
                f14.getClass();
                m1Var.i(f14.floatValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
