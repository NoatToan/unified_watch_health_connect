package hk0;

import android.os.Bundle;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhk0/k;", "Lka2/a$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements ka2.a.InterfaceC1989a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f84075a;

    public k(f fVar) {
        this.f84075a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    @Override // ka2.a.InterfaceC1989a
    public final void a(rs2.c cVar, ka2.b bVar) {
        boolean z14;
        Bundle bundle = new Bundle();
        int i14 = bVar.f103755a[0] & UnsignedBytes.MAX_VALUE;
        for (int i15 = 0; i15 < i14; i15++) {
            long j8 = bVar.a(i15) != null ? ByteBuffer.wrap(bVar.a(i15), 2, 4).order(ByteOrder.LITTLE_ENDIAN).getInt() : -1L;
            if (j8 != -1) {
                String strValueOf = String.valueOf(j8);
                byte[] bArrA = bVar.a(i15);
                if (bArrA != null) {
                    byte b14 = bArrA[1];
                    z14 = (b14 & UnsignedBytes.MAX_POWER_OF_TWO) == 128 && (b14 & Ascii.CAN) != 25 && (b14 & Ascii.DLE) == 16;
                }
                bundle.putBoolean(strValueOf, z14);
            }
        }
        int i16 = f.f84062g;
        this.f84075a.k(cVar, "com.garmin.android.gdi.ACTION_ON_VECTOR_PEDAL_PAIRING_STATUS_RECEIVED", bundle, false);
    }
}
