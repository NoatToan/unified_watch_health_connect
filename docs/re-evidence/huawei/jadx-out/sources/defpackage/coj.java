package defpackage;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class coj {
    public static boolean e(BluetoothHeadset bluetoothHeadset, BluetoothDevice bluetoothDevice) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (bluetoothHeadset == null || bluetoothDevice == null) {
            return false;
        }
        Object objInvoke = bluetoothHeadset.getClass().getMethod("connect", BluetoothDevice.class).invoke(bluetoothHeadset, bluetoothDevice);
        if (objInvoke instanceof Boolean) {
            return ((Boolean) objInvoke).booleanValue();
        }
        return false;
    }

    public static boolean c(BluetoothA2dp bluetoothA2dp, BluetoothDevice bluetoothDevice) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (bluetoothA2dp == null || bluetoothDevice == null) {
            return false;
        }
        Object objInvoke = bluetoothA2dp.getClass().getMethod("connect", BluetoothDevice.class).invoke(bluetoothA2dp, bluetoothDevice);
        if (objInvoke instanceof Boolean) {
            return ((Boolean) objInvoke).booleanValue();
        }
        return false;
    }

    public static boolean b(BluetoothHeadset bluetoothHeadset, BluetoothDevice bluetoothDevice, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (bluetoothHeadset == null || bluetoothDevice == null) {
            return false;
        }
        Object objInvoke = bluetoothHeadset.getClass().getMethod("setPriority", BluetoothDevice.class, Integer.TYPE).invoke(bluetoothHeadset, bluetoothDevice, Integer.valueOf(i));
        if (objInvoke instanceof Boolean) {
            return ((Boolean) objInvoke).booleanValue();
        }
        return false;
    }

    public static boolean c(BluetoothDevice bluetoothDevice) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (bluetoothDevice == null) {
            return false;
        }
        Object objInvoke = bluetoothDevice.getClass().getMethod("createBond", new Class[0]).invoke(bluetoothDevice, new Object[0]);
        if (objInvoke instanceof Boolean) {
            return ((Boolean) objInvoke).booleanValue();
        }
        return false;
    }

    public static boolean a(BluetoothDevice bluetoothDevice) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (bluetoothDevice == null) {
            return false;
        }
        Object objInvoke = bluetoothDevice.getClass().getMethod("removeBond", new Class[0]).invoke(bluetoothDevice, new Object[0]);
        if (objInvoke instanceof Boolean) {
            return ((Boolean) objInvoke).booleanValue();
        }
        return false;
    }

    public static boolean b(BluetoothDevice bluetoothDevice) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (bluetoothDevice == null) {
            return false;
        }
        Object objInvoke = bluetoothDevice.getClass().getMethod("cancelBondProcess", new Class[0]).invoke(bluetoothDevice, new Object[0]);
        if (objInvoke instanceof Boolean) {
            return ((Boolean) objInvoke).booleanValue();
        }
        return false;
    }

    public static boolean d() {
        return BaseApplication.b().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("BtControlUtil", "cancelBtConfirmDialog mac is null");
            return;
        }
        LogUtil.b("BtControlUtil", "Enter cancelBtConfirmDialog");
        try {
            Class<?> cls = Class.forName("android.bluetooth.BluetoothAdapterEx");
            if (cls != null) {
                cls.getMethod("addPairWhiteList", String.class).invoke(cls, str);
            }
        } catch (ClassNotFoundException e) {
            LogUtil.d("BtControlUtil", "ClassNotFoundException e: ", cpc.c(e));
        } catch (IllegalAccessException e2) {
            LogUtil.d("BtControlUtil", "IllegalAccessException e: ", cpc.c(e2));
        } catch (NoSuchMethodException e3) {
            LogUtil.d("BtControlUtil", "NoSuchMethodException e: ", cpc.c(e3));
        } catch (InvocationTargetException e4) {
            LogUtil.d("BtControlUtil", "InvocationTargetException e: ", cpc.c(e4));
        }
    }

    public static boolean d(String str) {
        boolean zB;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("BtControlUtil", "isDeviceInBonded mac is null");
            return false;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        try {
            Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
            if (bondedDevices != null && bondedDevices.size() > 0) {
                Iterator<BluetoothDevice> it = bondedDevices.iterator();
                zB = false;
                while (it.hasNext() && !(zB = b(it.next(), str))) {
                    try {
                    } catch (SecurityException e) {
                        e = e;
                        z = zB;
                        LogUtil.d("BtControlUtil", "isDeviceInBonded SecurityException", ExceptionUtils.c(e));
                        return z;
                    }
                }
            } else {
                LogUtil.e("BtControlUtil", "isDeviceInBonded devices is null");
                zB = false;
            }
            LogUtil.b("BtControlUtil", "isInBonded: ", Boolean.valueOf(zB));
            return zB;
        } catch (SecurityException e2) {
            e = e2;
        }
    }

    private static boolean b(BluetoothDevice bluetoothDevice, String str) {
        return bluetoothDevice != null && str.equals(bluetoothDevice.getAddress()) && bluetoothDevice.getBondState() == 12;
    }
}
