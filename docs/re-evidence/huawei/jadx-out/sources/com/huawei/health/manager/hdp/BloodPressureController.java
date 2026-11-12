package com.huawei.health.manager.hdp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHealth;
import android.bluetooth.BluetoothHealthAppConfiguration;
import android.bluetooth.BluetoothHealthCallback;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.common.base.Ascii;
import com.huawei.common.Constant;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.manager.util.Consts;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.IoUtils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class BloodPressureController {
    private BluetoothHealthAppConfiguration f;
    private BluetoothHealth g;
    private BluetoothDevice j;
    private String k;
    private String l;
    private Context m;
    private String o;
    private static final byte[] e = {-29, 0, 0, 44, 0, 3, 80, 121, 0, 38, -128, 0, 0, 0, -128, 0, -128, 0, 0, 0, 0, 0, 0, 0, -128, 0, 0, 0, 0, 8, 0, 34, 9, 34, 88, 54, 122, -82, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f8091c = {-25, 0, 0, 18, 0, 16, 0, 1, 2, 1, 0, 10, 0, 0, 0, 0, 0, 0, 13, Ascii.FS, 0, 4, 64, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f8090a = {-25, 0, 0, 18, 0, 16, 0, 2, 2, 1, 0, 10, 0, 0, 0, 0, 0, 0, 13, Ascii.US, 0, 0};
    private static final byte[] d = {-27, 0, 0, 2, 0, 0};
    private int i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<Bundle> f8092b = new ArrayList<>(10);
    private final BluetoothProfile.ServiceListener n = new BluetoothProfile.ServiceListener() { // from class: com.huawei.health.manager.hdp.BloodPressureController.1
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            if (i != 3 || bluetoothProfile == null) {
                return;
            }
            try {
                LogUtil.d("BloodPressureController", Constant.SERVICE_CONNECT_MESSAGE);
                if (bluetoothProfile instanceof BluetoothHealth) {
                    BloodPressureController.this.g = (BluetoothHealth) bluetoothProfile;
                    BloodPressureController.this.g.registerSinkAppConfiguration("HDP", 4103, BloodPressureController.this.h);
                } else {
                    LogUtil.j("BloodPressureController", "bluetoothProfile is not instanceof BluetoothHealth");
                }
            } catch (SecurityException e2) {
                LogUtil.e("BloodPressureController", "onServiceConnected SecurityException:", ExceptionUtils.c(e2));
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
            if (i == 3) {
                BloodPressureController.this.g = null;
            }
        }
    };
    private final BluetoothHealthCallback h = new BluetoothHealthCallback() { // from class: com.huawei.health.manager.hdp.BloodPressureController.2
        @Override // android.bluetooth.BluetoothHealthCallback
        public void onHealthAppConfigurationStatusChange(BluetoothHealthAppConfiguration bluetoothHealthAppConfiguration, int i) {
            if (i == 1) {
                BloodPressureController.this.f = null;
            } else if (i == 0) {
                LogUtil.d("BloodPressureController", "onHealthAppConfigurationStatusChange");
                BloodPressureController.this.f = bluetoothHealthAppConfiguration;
            } else {
                LogUtil.a("BloodPressureController", "status != APP_CONFIG_REGISTRATION_FAILURE && status != APP_CONFIG_REGISTRATION_SUCCESS");
            }
        }

        @Override // android.bluetooth.BluetoothHealthCallback
        public void onHealthChannelStateChange(BluetoothHealthAppConfiguration bluetoothHealthAppConfiguration, BluetoothDevice bluetoothDevice, int i, int i2, ParcelFileDescriptor parcelFileDescriptor, int i3) throws Throwable {
            if (bluetoothHealthAppConfiguration != null && parcelFileDescriptor != null) {
                if (i == 0 && i2 == 2 && bluetoothHealthAppConfiguration.equals(BloodPressureController.this.f)) {
                    BloodPressureController.this.i = i3;
                    LogUtil.a("BloodPressureController", "onHealthChannelStateChange");
                    BloodPressureController.this.b(parcelFileDescriptor);
                    return;
                }
                return;
            }
            LogUtil.j("BloodPressureController", "onHealthChannelStateChange configuration is null");
        }
    };

    public BloodPressureController(Context context) {
        this.m = context;
    }

    public boolean b(BluetoothDevice bluetoothDevice, String str, String str2, String str3) {
        if (bluetoothDevice != null || str != null || str3 != null) {
            LogUtil.d("BloodPressureController", "isPrepare");
            this.j = bluetoothDevice;
            this.o = str;
            this.l = str2;
            this.k = str3;
            this.f8092b.clear();
            BluetoothAdapter.getDefaultAdapter().getProfileProxy(this.m, this.n, 3);
            try {
                Thread.sleep(500L);
                return true;
            } catch (InterruptedException e2) {
                LogUtil.e("BloodPressureController", "prepare InterruptedException ", e2.getMessage());
                return true;
            }
        }
        LogUtil.j("BloodPressureController", "(device == null) && (productId == null) && (kind == null)");
        return false;
    }

    public boolean a() {
        BluetoothHealthAppConfiguration bluetoothHealthAppConfiguration;
        LogUtil.d("BloodPressureController", "start");
        BluetoothHealth bluetoothHealth = this.g;
        if (bluetoothHealth == null || (bluetoothHealthAppConfiguration = this.f) == null) {
            return false;
        }
        try {
            return bluetoothHealth.connectChannelToSource(this.j, bluetoothHealthAppConfiguration);
        } catch (SecurityException e2) {
            LogUtil.e("BloodPressureController", "start SecurityException:", ExceptionUtils.c(e2));
            return false;
        }
    }

    public void b() {
        BluetoothHealth bluetoothHealth;
        LogUtil.d("BloodPressureController", "ending");
        BluetoothDevice bluetoothDevice = this.j;
        if (bluetoothDevice == null || (bluetoothHealth = this.g) == null) {
            return;
        }
        try {
            bluetoothHealth.disconnectChannel(bluetoothDevice, this.f, this.i);
            this.g.unregisterAppConfiguration(this.f);
            this.g = null;
        } catch (SecurityException e2) {
            LogUtil.e("BloodPressureController", "ending SecurityException:", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ParcelFileDescriptor parcelFileDescriptor) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
            try {
                FileOutputStream fileOutputStream4 = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                int i = 1;
                while (fileInputStream2.read(bArr) > -1) {
                    try {
                        byte b2 = bArr[0];
                        if (b2 == -30) {
                            LogUtil.d("BloodPressureController", "fileOutputStream.write FIRST_CONFIGURATION_ARRAY");
                            fileOutputStream4.write(e);
                        } else if (b2 == -25 && bArr[18] == 13 && bArr[19] == 28) {
                            LogUtil.d("BloodPressureController", "fileOutputStream.write(SECOND_CONFIGURATION_ARRAY)");
                            fileOutputStream4.write(f8091c);
                        } else if (b2 == -25 && bArr[18] == 13 && bArr[19] == 31) {
                            LogUtil.d("BloodPressureController", "receive data");
                            this.f8092b.add(a(bArr));
                            i++;
                            byte[] bArr2 = f8090a;
                            bArr2[7] = (byte) i;
                            fileOutputStream4.write(bArr2);
                        } else {
                            if (b2 == -26) {
                                LogUtil.d("BloodPressureController", "ABORT_APDU");
                                c();
                            } else if (b2 == -28) {
                                LogUtil.d("BloodPressureController", "fileOutputStream.write(FOURTH_CONFIGURATION_ARRAY)");
                                fileOutputStream4.write(d);
                                c();
                            } else {
                                LogUtil.d("BloodPressureController", "handleHealthChannelStateChange other type");
                            }
                            i = 1;
                        }
                        bArr = new byte[1024];
                        fileOutputStream4.flush();
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream4;
                        fileOutputStream = fileOutputStream2;
                        fileInputStream = fileInputStream2;
                        try {
                            LogUtil.e("BloodPressureController", "HandleHealthChannelStateChange error", e.getMessage());
                            c(parcelFileDescriptor, fileInputStream, fileOutputStream);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            c(parcelFileDescriptor, fileInputStream, fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream3 = fileOutputStream4;
                        fileOutputStream = fileOutputStream3;
                        fileInputStream = fileInputStream2;
                        c(parcelFileDescriptor, fileInputStream, fileOutputStream);
                        throw th;
                    }
                }
                c(parcelFileDescriptor, fileInputStream2, fileOutputStream4);
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private void c(ParcelFileDescriptor parcelFileDescriptor, FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        if (parcelFileDescriptor != null) {
            IoUtils.c(parcelFileDescriptor);
        }
        if (fileInputStream != null) {
            IoUtils.c(fileInputStream);
        }
        if (fileOutputStream != null) {
            IoUtils.c(fileOutputStream);
        }
    }

    private void c() {
        if (this.m == null || this.f8092b.size() <= 0) {
            return;
        }
        Intent intent = new Intent("com.huawei.health.action.DEVICE_CONNECTED");
        intent.setPackage(this.m.getPackageName());
        intent.putExtra("productId", this.o);
        intent.putExtra("uniqueId", this.l);
        intent.putExtra("kind", this.k);
        intent.putExtra("address", this.j.getAddress());
        intent.putParcelableArrayListExtra("bloodPressureDataList", this.f8092b);
        LogUtil.a("BloodPressureController", "sendBroadcastToConnectDevice productId is ", this.o);
        this.m.sendBroadcast(intent, Consts.d);
    }

    private Bundle a(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("BloodPressureController", "getBloodPressureData data is null");
            return null;
        }
        LogUtil.a("BloodPressureController", "getBloodPressureData()");
        short s = (short) (bArr[45] & 255);
        short s2 = (short) (bArr[47] & 255);
        short s3 = (short) (bArr[63] & 255);
        if (s >= Short.MAX_VALUE || s <= 0) {
            LogUtil.j("BloodPressureController", "getBloodPressureData() systolic invalid");
            s = 0;
        }
        if (s2 >= Short.MAX_VALUE || s2 <= 0) {
            LogUtil.j("BloodPressureController", "getBloodPressureData() diastolic invalid");
            s2 = 0;
        }
        if (s3 >= Short.MAX_VALUE || s3 <= 0) {
            LogUtil.j("BloodPressureController", "getBloodPressureData() heartRate invalid");
            s3 = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putShort(BleConstants.BLOODPRESSURE_SYSTOLIC, s);
        bundle.putShort(BleConstants.BLOODPRESSURE_DIASTOLIC, s2);
        bundle.putShort(IndoorEquipManagerApi.KEY_HEART_RATE, s3);
        bundle.putLong("time", b(bArr));
        return bundle;
    }

    private long b(byte[] bArr) {
        Calendar calendar = Calendar.getInstance();
        int iA = a(bArr[50]);
        calendar.set(a(bArr[51]) + (iA * 100), a(bArr[52]) - 1, a(bArr[53]), a(bArr[54]), a(bArr[55]), a(bArr[56]));
        long timeInMillis = calendar.getTimeInMillis();
        long j = timeInMillis - 9249352595000L;
        if (j < 1000 && j > -1000) {
            timeInMillis = System.currentTimeMillis();
        }
        LogUtil.d("BloodPressureController", "getTime() time = ", Long.valueOf(timeInMillis));
        return timeInMillis;
    }

    private int a(byte b2) {
        try {
            return Integer.parseInt(Integer.toString(b2 & 255, 16));
        } catch (NumberFormatException e2) {
            LogUtil.e("BloodPressureController", "convertHexadecimalToDecimal exception = ", e2.getMessage());
            return 0;
        }
    }
}
