package defpackage;

import android.bluetooth.BluetoothDevice;
import com.careforeyou.library.enums.Protocal_Type;
import com.careforeyou.library.enums.Weight_Digit;
import com.google.common.base.Ascii;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes4.dex */
public class vu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f51592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f51593c;
    public String d;
    public byte e;
    public byte f;
    public int g;
    public Protocal_Type h;
    public float i;
    public int j;
    public byte k;
    public double l;
    public Date n;
    public String o;

    public String toString() {
        return "ChipseaBroadcastFrame{version=" + ((int) this.k) + ", deviceType=" + ((int) this.f51592b) + ", cmdId=" + ((int) this.e) + ", weight=" + this.l + ", productId=" + this.g + ", mac='" + this.f51593c + "', procotalType=" + this.h + ", scaleWeight='" + this.o + "', scaleProperty=" + ((int) this.f) + ", r1=" + this.i + ", weightTime=" + this.n + ", rssi=" + this.j + ", modle=" + this.f51591a + '}';
    }

    private void a(byte[] bArr, String str) {
        if (bArr.length < 11) {
            return;
        }
        this.f51593c = str;
        byte b2 = bArr[1];
        this.k = b2;
        if (b2 == 16) {
            this.f51592b = bArr[3];
            byte b3 = bArr[4];
            this.e = b3;
            this.f = b3;
        } else if (b2 == 17) {
            this.f = bArr[3];
            this.f51592b = bArr[4];
        }
        if (this.f51592b != 0) {
            this.e = wg.e(this.f);
            vz vzVarE = wl.e(bArr[5], bArr[6], this.f, false);
            this.l = vzVarE.f51724a;
            this.o = vzVarE.d;
            this.g = wg.a(wg.c(bArr, 7, 4));
            return;
        }
        if (b2 == 16) {
            this.l = wg.a(wg.c(bArr, 8, 2)) / 10.0f;
            return;
        }
        if (b2 != 17) {
            return;
        }
        this.e = wg.e(this.f);
        vz vzVarE2 = wl.e(bArr[5], bArr[6], this.f, false);
        this.l = vzVarE2.f51724a;
        this.o = vzVarE2.d;
        this.g = wg.a(wg.c(bArr, 7, 4));
    }

    private void c(byte[] bArr, String str) {
        if (bArr.length < 8) {
            return;
        }
        this.f51593c = str;
        this.k = (byte) 1;
        byte b2 = bArr[8];
        this.f = b2;
        this.e = wg.e(b2);
        this.g = wg.a(wg.c(bArr, 6, 2));
        if (this.e == 0) {
            this.l = 0.0d;
            this.o = "";
            this.i = 0.0f;
        } else {
            vz vzVarE = wl.e(bArr[2], bArr[3], this.f, false);
            this.l = vzVarE.f51724a;
            this.o = vzVarE.d;
            this.i = wg.a(wg.c(bArr, 4, 2)) / 10.0f;
        }
        if (wg.d(this.f) == 0) {
            this.f51592b = (byte) 0;
        } else {
            this.f51592b = (byte) 4;
        }
    }

    private void b(byte[] bArr, String str) {
        if (bArr.length < 14) {
            return;
        }
        this.f51593c = str;
        this.k = bArr[1];
        this.g = wg.a(wg.c(bArr, 3, 4));
        if (bArr[7] == 0) {
            this.f51592b = (byte) 0;
        } else {
            this.f51592b = (byte) 2;
        }
        byte b2 = bArr[8];
        this.f = b2;
        byte bE = wg.e(b2);
        this.e = bE;
        if (bE > 0) {
            vz vzVarE = wl.e(bArr[10], bArr[11], this.f, false);
            this.l = vzVarE.f51724a;
            this.o = vzVarE.d;
            this.i = wg.a(wg.c(bArr, 12, 2)) / 10.0f;
            return;
        }
        this.l = 0.0d;
        this.o = "";
        this.i = 0.0f;
    }

    private void e(byte[] bArr, String str) {
        if (bArr.length < 10) {
            return;
        }
        this.f51593c = str;
        this.f51592b = (byte) 1;
        this.k = bArr[2];
        byte b2 = bArr[3];
        this.f = b2;
        this.e = (byte) 0;
        vz vzVarE = wl.e(bArr[5], bArr[4], b2, true);
        this.l = vzVarE.f51724a;
        this.o = vzVarE.d;
        this.g = wg.a(wg.c(bArr, 6, 4));
    }

    private void d(byte[] bArr, String str) {
        if (bArr.length < 8) {
            return;
        }
        this.f51593c = str;
        this.f51592b = (byte) 3;
        byte b2 = bArr[0];
        if (b2 != -63) {
            if (b2 == -62) {
                this.f = (byte) 5;
                this.e = (byte) 1;
                byte b3 = bArr[3];
                if ((b3 & (-128)) == -128) {
                    this.i = 500.0f;
                } else {
                    this.i = 0.0f;
                }
                byte[] bArr2 = {(byte) (b3 & Ascii.DEL), bArr[2]};
                vz vzVarE = wl.e(bArr2[0], bArr2[1], (byte) 5, false);
                this.l = vzVarE.f51724a;
                this.o = vzVarE.d;
                this.n = new Date(((long) wg.a(new byte[]{bArr[7], bArr[6], bArr[5], bArr[4]})) * 1000);
                return;
            }
            return;
        }
        byte b4 = bArr[8];
        this.f = b4;
        byte bE = wg.e(b4);
        this.e = bE;
        if (bE == 0) {
            this.i = 0.0f;
        } else if ((bArr[3] & (-128)) == -128) {
            this.i = 500.0f;
        }
        byte[] bArr3 = {(byte) (bArr[3] & Ascii.DEL), bArr[2]};
        vz vzVarE2 = wl.e(bArr3[0], bArr3[1], this.f, false);
        this.l = vzVarE2.f51724a;
        this.o = vzVarE2.d;
        this.g = wg.a(new byte[]{bArr[7], bArr[6], bArr[5], bArr[4]});
        this.n = new Date(System.currentTimeMillis());
    }

    public vu(byte[] bArr, BluetoothDevice bluetoothDevice, int i) throws vs {
        if (bArr == null || bArr.length < 2) {
            throw new vs("帧格式错误 -- 帧为空");
        }
        this.j = i;
        byte b2 = bArr[0];
        if (b2 == -54) {
            if (bArr[1] == 32) {
                b(bArr, bluetoothDevice.getAddress());
                return;
            } else {
                a(bArr, bluetoothDevice.getAddress());
                return;
            }
        }
        if (b2 == -1) {
            e(bArr, bluetoothDevice.getAddress());
            return;
        }
        if (b2 == -64) {
            c(bArr, bluetoothDevice.getAddress());
            return;
        }
        if (b2 == -63 || b2 == -62) {
            d(bArr, bluetoothDevice.getAddress());
        } else {
            if (b2 == 0 && bArr[1] == 1) {
                d(bArr, bluetoothDevice);
                return;
            }
            throw new vs("帧格式错误 -- 帧头错误");
        }
    }

    private void d(byte[] bArr, BluetoothDevice bluetoothDevice) {
        DecimalFormat decimalFormat;
        if (bArr.length < 17) {
            return;
        }
        wf.e("chipseaBroadcastFrame", "xiangshan：" + wg.c(bArr));
        this.f51593c = bluetoothDevice.getAddress();
        this.d = bluetoothDevice.getName();
        this.k = bArr[2];
        this.f51592b = (byte) 5;
        int iA = wg.a(wg.c(bArr, 3, 2));
        this.f51591a = iA;
        if (iA == 789) {
            byte b2 = bArr[11];
            byte b3 = (byte) (b2 & Ascii.US);
            int i = (b3 == 1 || b3 == 4) ? 1 : 2;
            double dA = (float) (((double) wg.a(wg.c(bArr, 12, 2))) / Math.pow(10.0d, i));
            this.l = dA;
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
            if (i == 1) {
                decimalFormat = new DecimalFormat("#0.0", decimalFormatSymbols);
            } else {
                decimalFormat = new DecimalFormat("#0.00", decimalFormatSymbols);
            }
            this.o = decimalFormat.format(dA);
            this.e = (byte) 0;
            if (bArr[17] == 1) {
                this.i = (float) (((double) wg.a(wg.c(bArr, 14, 2))) / Math.pow(10.0d, b2 >> 5));
                this.e = (byte) 1;
                return;
            }
            return;
        }
        byte b4 = bArr[16];
        this.f = b4;
        this.e = wg.j(b4);
        wf.e("chipseaBroadcastFrame", "cmdId" + ((int) this.e));
        vz vzVarE = wl.e(bArr[12], bArr[13], this.f, Weight_Digit.TWO, true);
        this.l = vzVarE.f51724a;
        this.o = vzVarE.d;
        this.i = wg.a(wg.c(bArr, 14, 2));
    }
}
