package r21;

import com.garmin.android.apps.connectmobile.R;
import f5.v1;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import o4.f1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p13.x;
import p5.h0;
import p5.k0;
import s5.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f149486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f149487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f149488d;

    public /* synthetic */ e(Object obj, int i14, int i15, int i16) {
        this.f149485a = i16;
        this.f149488d = obj;
        this.f149486b = i14;
        this.f149487c = i15;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f149485a;
        int i15 = this.f149487c;
        int i16 = this.f149486b;
        Object obj2 = this.f149488d;
        switch (i14) {
            case 0:
                v1.a aVar = (v1.a) obj;
                aVar.getClass();
                Iterator it = ((ArrayList) obj2).iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    v1.a.B(aVar, (v1) it.next(), i17, 0);
                    i17 += i16 + i15;
                }
                break;
            case 1:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                Integer numValueOf = Integer.valueOf(i16);
                Integer numValueOf2 = Integer.valueOf(i15);
                l22.a aVar2 = ((x00.a) obj2).f188233a;
                h0.n(k0Var, p13.h0.k0(x.k(aVar2.getString(R.string.lbl_intensity_details_title), e5.g(aVar2.a(R.string.lbl_plural_more_than_one_minute, numValueOf), StringUtils.SPACE, aVar2.getString(R.string.lbl_intensity_moderate_short)), aVar2.getString(R.string.lbl_or), e5.g(aVar2.a(R.string.lbl_plural_more_than_one_minute, numValueOf2), StringUtils.SPACE, aVar2.getString(R.string.lbl_intensity_vigorous_short))), ". ", null, null, null, 62));
                break;
            default:
                s sVar = (s) obj;
                o4.j jVarV = sVar.f157290a.v(sVar.d(i16), sVar.d(i15));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(sVar.f157295f)) & 4294967295L);
                n4.c.a aVar3 = n4.c.f123541b;
                jVarV.e(jFloatToRawIntBits);
                f1.m((o4.j) obj2, jVarV);
                break;
        }
        return Unit.INSTANCE;
    }
}
