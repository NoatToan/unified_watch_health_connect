package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class t33 {
    public static boolean a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(2).setUsage(1).build();
        try {
            return Build.VERSION.SDK_INT >= 33 ? c(audioManager, audioAttributesBuild) : b(audioManager, audioAttributesBuild);
        } catch (Exception e) {
            tpe.c("BluetoothUtil", e.getMessage());
            return false;
        }
    }

    public static boolean b(AudioManager audioManager, AudioAttributes audioAttributes) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Method method = AudioManager.class.getMethod("getDevicesForAttributes", AudioAttributes.class);
        method.setAccessible(true);
        List list = (List) method.invoke(audioManager, audioAttributes);
        if (list == null || list.isEmpty()) {
            tpe.c("BluetoothUtil", "s is null or empty");
            return false;
        }
        Object obj = list.get(0);
        Method method2 = Class.forName("android.media.AudioDeviceAttributes").getMethod("getType", new Class[0]);
        method2.setAccessible(true);
        tpe.c("BluetoothUtil", "type " + ((Integer) method2.invoke(obj, new Object[0])).intValue());
        return ((Integer) method2.invoke(obj, new Object[0])).intValue() == 8;
    }

    @RequiresApi(33)
    public static boolean c(AudioManager audioManager, AudioAttributes audioAttributes) {
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(audioAttributes);
        return (audioDevicesForAttributes == null || audioDevicesForAttributes.isEmpty() || ((AudioDeviceInfo) audioDevicesForAttributes.get(0)).getType() != 8) ? false : true;
    }
}
