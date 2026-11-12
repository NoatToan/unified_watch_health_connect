package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler {
    private static final String BIG_INTEGER_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy";
    private static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
    private static final String LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    private static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    private final ExecutorService executor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final SharedPreferences preferences;

    public MethodCallHandlerImpl(Context context) {
        this.preferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }

    private void commitAsync(final SharedPreferences.Editor editor, final MethodChannel.Result result) {
        this.executor.execute(new Runnable() { // from class: io.flutter.plugins.sharedpreferences.MethodCallHandlerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                final boolean zCommit = editor.commit();
                MethodCallHandlerImpl.this.handler.post(new Runnable() { // from class: io.flutter.plugins.sharedpreferences.MethodCallHandlerImpl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        result.success(Boolean.valueOf(zCommit));
                    }
                });
            }
        });
    }

    private List<String> decodeList(String str) throws Throwable {
        ObjectInputStream objectInputStream = null;
        try {
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                try {
                    List<String> list = (List) objectInputStream2.readObject();
                    objectInputStream2.close();
                    return list;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (ClassNotFoundException e2) {
            e = e2;
        }
    }

    private String encodeList(List<String> list) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                objectOutputStream2.close();
                return strEncodeToString;
            } catch (Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private Map<String, Object> getAllPrefs() throws Throwable {
        Object bigInteger;
        Object objValueOf;
        Map<String, ?> all = this.preferences.getAll();
        HashMap map = new HashMap();
        for (String str : all.keySet()) {
            if (str.startsWith("flutter.")) {
                Object obj = all.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.startsWith(LIST_IDENTIFIER)) {
                        objValueOf = decodeList(str2.substring(40));
                    } else if (str2.startsWith(BIG_INTEGER_PREFIX)) {
                        bigInteger = new BigInteger(str2.substring(44), 36);
                        objValueOf = obj;
                        bigInteger = arrayList;
                        objValueOf = bigInteger;
                    } else if (str2.startsWith(DOUBLE_PREFIX)) {
                        objValueOf = obj;
                        objValueOf = Double.valueOf(str2.substring(40));
                    }
                } else if (obj instanceof Set) {
                    ArrayList arrayList = new ArrayList((Set) obj);
                    if (!this.preferences.edit().remove(str).putString(str, LIST_IDENTIFIER + encodeList(arrayList)).commit()) {
                        objValueOf = obj;
                        bigInteger = arrayList;
                        throw new IOException("Could not migrate set to list");
                    }
                    objValueOf = obj;
                    bigInteger = arrayList;
                    objValueOf = bigInteger;
                }
                objValueOf = obj;
                objValueOf = obj;
                map.put(str, objValueOf);
            }
        }
        return map;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("key");
        try {
            switch (methodCall.method) {
                case "setBool":
                    commitAsync(this.preferences.edit().putBoolean(str, ((Boolean) methodCall.argument("value")).booleanValue()), result);
                    break;
                case "setDouble":
                    String string = Double.toString(((Number) methodCall.argument("value")).doubleValue());
                    commitAsync(this.preferences.edit().putString(str, DOUBLE_PREFIX + string), result);
                    break;
                case "setInt":
                    Number number = (Number) methodCall.argument("value");
                    if (!(number instanceof BigInteger)) {
                        commitAsync(this.preferences.edit().putLong(str, number.longValue()), result);
                        break;
                    } else {
                        commitAsync(this.preferences.edit().putString(str, BIG_INTEGER_PREFIX + ((BigInteger) number).toString(36)), result);
                        break;
                    }
                    break;
                case "setString":
                    String str2 = (String) methodCall.argument("value");
                    if (!str2.startsWith(LIST_IDENTIFIER) && !str2.startsWith(BIG_INTEGER_PREFIX) && !str2.startsWith(DOUBLE_PREFIX)) {
                        commitAsync(this.preferences.edit().putString(str, str2), result);
                        break;
                    }
                    result.error("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", null);
                    break;
                case "setStringList":
                    List<String> list = (List) methodCall.argument("value");
                    commitAsync(this.preferences.edit().putString(str, LIST_IDENTIFIER + encodeList(list)), result);
                    break;
                case "commit":
                    result.success(Boolean.TRUE);
                    break;
                case "getAll":
                    result.success(getAllPrefs());
                    break;
                case "remove":
                    commitAsync(this.preferences.edit().remove(str), result);
                    break;
                case "clear":
                    Set<String> setKeySet = getAllPrefs().keySet();
                    SharedPreferences.Editor editorEdit = this.preferences.edit();
                    Iterator<String> it2 = setKeySet.iterator();
                    while (it2.hasNext()) {
                        editorEdit.remove(it2.next());
                    }
                    commitAsync(editorEdit, result);
                    break;
                default:
                    result.notImplemented();
                    break;
            }
        } catch (IOException e) {
            result.error("IOException encountered", methodCall.method, e);
        }
    }

    public void teardown() {
        this.handler.removeCallbacksAndMessages(null);
        this.executor.shutdown();
    }
}
