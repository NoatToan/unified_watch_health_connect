package com.xiaomi.digitalkey.wearable.storage;

import android.content.Context;
import android.util.AtomicFile;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class DKStorageManager {
    private static final boolean DEBUG = Logger.LOG_STORAGE;
    private static final boolean ERR = true;
    private static final String LogTag = "SDK-DKF-DKStorageManager:";

    public static boolean checkShareRecordFile(Context context, String str) {
        if (str == null) {
            return false;
        }
        String strConcat = str.concat(".db");
        if (new AtomicFile(new File(context.getDataDir().toString() + "/record", strConcat)).getBaseFile().exists()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat);
        sb.append(": Not exist, return");
        return false;
    }

    public static Object loadRecord(Context context, String str) throws ClassNotFoundException, IOException {
        String strConcat = str.concat(".db");
        File file = new File(context.getDataDir() + "/record", strConcat);
        if (!file.exists()) {
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("record file: ");
                sb.append(strConcat);
                sb.append(" Not exist, return");
            }
            throw new ClassNotFoundException("file not find");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        if (DEBUG) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Load record done! ");
            sb2.append(strConcat);
        }
        fileInputStream.close();
        objectInputStream.close();
        return object;
    }

    public static boolean removeRecord(Context context, String str) throws IOException, ClassNotFoundException {
        String strConcat = str.concat(".db");
        File file = new File(context.getDataDir() + "/record", strConcat);
        if (!file.exists()) {
            if (!DEBUG) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("record file: ");
            sb.append(strConcat);
            sb.append(" Not exist, return");
            return false;
        }
        boolean zDelete = file.delete();
        if (DEBUG) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("remove record result: ");
            sb2.append(zDelete);
            sb2.append(" !");
            sb2.append(strConcat);
        }
        return zDelete;
    }

    public static void saveRecord(Context context, Object obj, String str) throws IOException {
        String strConcat = str.concat(".db");
        String str2 = context.getDataDir().toString() + "/record";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str2, strConcat));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(obj);
        fileOutputStream.close();
        objectOutputStream.close();
    }
}
