package lr2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.devicesettings.RapidPassSettingActivity;
import p005kotlin.Unit;
import s5.w0;
import v2.h1;
import v2.r0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f114434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f114435c;

    public /* synthetic */ s(int i14, int i15, int i16) {
        this.f114433a = i16;
        this.f114434b = i14;
        this.f114435c = i15;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf A[SYNTHETIC] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int length;
        int i14;
        long j8;
        h1 h1Var;
        char cCharAt;
        int i15 = this.f114433a;
        int i16 = this.f114435c;
        int i17 = this.f114434b;
        switch (i15) {
            case 0:
                androidx.appcompat.app.e.a aVar = (androidx.appcompat.app.e.a) obj;
                int i18 = RapidPassSettingActivity.a.f52031f;
                aVar.getClass();
                aVar.setTitle(i17);
                aVar.setMessage(i16);
                aVar.setPositiveButton(R.string.lbl_ok, new jm0.c(19));
                break;
            case 1:
                u2.d dVar = (u2.d) obj;
                if (i17 < 0 || i16 < 0) {
                    b2.e.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i17 + " and " + i16 + " respectively.");
                }
                int i19 = 0;
                for (int i24 = 0; i24 < i17; i24++) {
                    int i25 = i19 + 1;
                    long j14 = dVar.f167833d;
                    h1 h1Var2 = dVar.f167831b;
                    w0.a aVar2 = w0.f157315b;
                    int i26 = (int) (j14 >> 32);
                    if (i26 <= i25) {
                        i19 = i26;
                        length = 0;
                        for (int i27 = 0; i27 < i16; i27++) {
                            i14 = length + 1;
                            j8 = dVar.f167833d;
                            h1Var = dVar.f167831b;
                            w0.a aVar3 = w0.f157315b;
                            if (((int) (j8 & 4294967295L)) + i14 < h1Var.length()) {
                                length = h1Var.length() - ((int) (dVar.f167833d & 4294967295L));
                                long j15 = dVar.f167833d;
                                w0.a aVar4 = w0.f157315b;
                                int i28 = (int) (j15 & 4294967295L);
                                r0.a(dVar, i28, length + i28);
                                int i29 = (int) (dVar.f167833d >> 32);
                                r0.a(dVar, i29 - i19, i29);
                            } else {
                                cCharAt = h1Var.charAt((((int) (dVar.f167833d & 4294967295L)) + i14) - 1);
                                char cCharAt2 = h1Var.charAt(((int) (4294967295L & dVar.f167833d)) + i14);
                                if (Character.isHighSurrogate(cCharAt) || !Character.isLowSurrogate(cCharAt2)) {
                                    length = i14;
                                } else {
                                    length += 2;
                                }
                            }
                            break;
                        }
                        long j16 = dVar.f167833d;
                        w0.a aVar5 = w0.f157315b;
                        int i210 = (int) (j16 & 4294967295L);
                        r0.a(dVar, i210, length + i210);
                        int i211 = (int) (dVar.f167833d >> 32);
                        r0.a(dVar, i211 - i19, i211);
                    } else {
                        i19 = (Character.isHighSurrogate(h1Var2.charAt((i26 - i25) + (-1))) && Character.isLowSurrogate(h1Var2.charAt(((int) (dVar.f167833d >> 32)) - i25))) ? i19 + 2 : i25;
                    }
                    break;
                }
                length = 0;
                while (i27 < i16) {
                    i14 = length + 1;
                    j8 = dVar.f167833d;
                    h1Var = dVar.f167831b;
                    w0.a aVar6 = w0.f157315b;
                    if (((int) (j8 & 4294967295L)) + i14 < h1Var.length()) {
                        length = h1Var.length() - ((int) (dVar.f167833d & 4294967295L));
                        long j17 = dVar.f167833d;
                        w0.a aVar7 = w0.f157315b;
                        int i212 = (int) (j17 & 4294967295L);
                        r0.a(dVar, i212, length + i212);
                        int i213 = (int) (dVar.f167833d >> 32);
                        r0.a(dVar, i213 - i19, i213);
                    } else {
                        cCharAt = h1Var.charAt((((int) (dVar.f167833d & 4294967295L)) + i14) - 1);
                        char cCharAt3 = h1Var.charAt(((int) (4294967295L & dVar.f167833d)) + i14);
                        if (Character.isHighSurrogate(cCharAt)) {
                            length = i14;
                        } else {
                            length = i14;
                        }
                    }
                    break;
                }
                long j18 = dVar.f167833d;
                w0.a aVar8 = w0.f157315b;
                int i214 = (int) (j18 & 4294967295L);
                r0.a(dVar, i214, length + i214);
                int i215 = (int) (dVar.f167833d >> 32);
                r0.a(dVar, i215 - i19, i215);
                break;
            default:
                u2.d dVar2 = (u2.d) obj;
                w0 w0Var = dVar2.f167834e;
                h1 h1Var3 = dVar2.f167831b;
                if (w0Var != null) {
                    dVar2.e(null);
                }
                int iE = j23.t.e(i17, 0, h1Var3.length());
                int iE2 = j23.t.e(i16, 0, h1Var3.length());
                if (iE != iE2) {
                    if (iE < iE2) {
                        dVar2.d(iE, iE2, null);
                    } else {
                        dVar2.d(iE2, iE, null);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
