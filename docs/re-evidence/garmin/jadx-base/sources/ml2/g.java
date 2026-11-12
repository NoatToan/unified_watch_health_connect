package ml2;

import c22.l3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.bikesensors.CalibrationSettingsActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.multilink.reliable.MLRConnectionHelper;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements pj2.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f119344b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f119343a = i14;
        this.f119344b = obj;
    }

    @Override // pj2.l
    public final void a(pj2.k kVar, UUID uuid, UUID uuid2, byte[] bArr) {
        int i14 = this.f119343a;
        Object obj = this.f119344b;
        switch (i14) {
            case 0:
                l lVar = (l) obj;
                UUID uuid3 = lVar.f119384k;
                if (uuid3 == null || uuid3.equals(uuid2)) {
                    if (bArr == null || bArr.length < 2) {
                        lVar.f119376c.warn("Multi-link data packet is too small");
                        break;
                    } else {
                        int i15 = bArr[0] & UnsignedBytes.MAX_VALUE;
                        if (i15 != 0) {
                            MLRConnectionHelper mLRConnectionHelper = lVar.f119386m;
                            if (mLRConnectionHelper == null) {
                                lVar.k(i15, Arrays.copyOfRange(bArr, 1, bArr.length));
                            } else {
                                mLRConnectionHelper.receiveRawPacket(bArr);
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                CalibrationSettingsActivity calibrationSettingsActivity = (CalibrationSettingsActivity) obj;
                CalibrationSettingsActivity.a aVar = CalibrationSettingsActivity.f30766m;
                byte b14 = bArr[0];
                byte b15 = bArr[1];
                byte b16 = bArr[2];
                byte b17 = bArr[3];
                byte b18 = bArr[4];
                StringBuilder sb3 = new StringBuilder("OnCharacteristicChanged: service: ");
                sb3.append(uuid);
                sb3.append(", characteristic: ");
                sb3.append(uuid2);
                sb3.append(", data: ");
                ds.e0.m(b14, b15, ", ", ", ", sb3);
                ds.e0.m(b16, b17, ", ", ",", sb3);
                sb3.append((int) b18);
                String string = sb3.toString();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "CalibrationSettingsActivity", string);
                if (p005kotlin.jvm.internal.s.g(uuid, ma2.h.f117689q) && p005kotlin.jvm.internal.s.g(uuid2, ma2.h.f117690r)) {
                    calibrationSettingsActivity.ga();
                    byte b19 = bArr[0];
                    byte b24 = bArr[1];
                    byte b25 = bArr[2];
                    if (b19 == 32 && b24 == 12) {
                        if (b25 != 1) {
                            calibrationSettingsActivity.runOnUiThread(new tv.a(calibrationSettingsActivity, 1));
                        } else {
                            com.garmin.android.apps.connectmobile.bikesensors.a.f30855a.getClass();
                            String str = bArr.length != 5 ? null : l3.f23137o.format(((double) ByteBuffer.wrap(new byte[]{bArr[3], bArr[4]}).order(ByteOrder.LITTLE_ENDIAN).getShort()) / ((double) 32));
                            if (str == null) {
                                calibrationSettingsActivity.runOnUiThread(new tv.a(calibrationSettingsActivity, 0));
                            } else {
                                calibrationSettingsActivity.runOnUiThread(new r0.h(14, calibrationSettingsActivity, str));
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
