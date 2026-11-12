package ohos.ace.plugin.file.fs.picker.filepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes46.dex */
public class FilePicker {
    private static final int FILE_PICKER_CODE = 82;
    private static final String LOG_TAG = "FilePicker";
    private static final int RESULT_ERROR = 13900042;
    private static final int RESULT_OK = 0;
    private Object mProxyInstance;

    protected native void nativeInit();

    protected native void onPickerResult(List<String> list, int i);

    public FilePicker(Context context) {
        nativeInit();
        setCallback();
    }

    private void setCallback() {
        try {
            Class<?> cls = Class.forName("ohos.stage.ability.adapter.StageActivityDelegate");
            Class<?> cls2 = Class.forName("ohos.stage.ability.adapter.StageActivityDelegate$INTENTCALLBACK");
            Method method = cls.getMethod("addIntentCallback", cls2);
            if (this.mProxyInstance == null) {
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: ohos.ace.plugin.file.fs.picker.filepicker.FilePicker$$ExternalSyntheticLambda0
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        return this.f$0.m2054x7e8b6cb(obj, method2, objArr);
                    }
                });
                this.mProxyInstance = objNewProxyInstance;
                method.invoke(null, objNewProxyInstance);
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e(LOG_TAG, (String) Objects.requireNonNull(e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: lambda$setCallback$0$ohos-ace-plugin-file-fs-picker-filepicker-FilePicker, reason: not valid java name */
    /* synthetic */ Object m2054x7e8b6cb(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!"onResult".equals(method.getName())) {
            return null;
        }
        onResult(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), (Intent) objArr[2]);
        return null;
    }

    enum DocumentSelectMode {
        FILE(0),
        FOLDER(1),
        MIXED(2);

        private final int code;

        DocumentSelectMode(int i) {
            this.code = i;
        }
    }

    public void select(int i, String str, String[] strArr, int i2) {
        Log.i(LOG_TAG, "select enter. selectMode:" + i2);
        if (i2 == DocumentSelectMode.FOLDER.code) {
            selectFolder();
        } else {
            selectFile(i, str, strArr);
        }
    }

    public void selectFile(int i, String str, String[] strArr) {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", i != 1);
        intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str));
        intent.setType("*/*");
        if (strArr.length > 0) {
            String[] strArr2 = new String[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(strArr[i2]);
                Log.d(LOG_TAG, "selectFile fileSuffixFilters[i]:" + strArr[i2] + ", types:" + strGuessContentTypeFromName);
                strArr2[i2] = strGuessContentTypeFromName;
            }
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr2);
        }
        startPicker(intent);
    }

    public void selectFolder() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(3);
        startPicker(intent);
    }

    public void save(String[] strArr, String str) {
        Log.i(LOG_TAG, "save enter");
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        if (strArr.length > 0) {
            intent.putExtra("android.intent.extra.TITLE", strArr[0]);
        }
        if (!Objects.equals(str, "")) {
            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str));
        }
        startPicker(intent);
    }

    public void onResult(int i, int i2, Intent intent) {
        Log.i(LOG_TAG, "onResult enter");
        if (checkResult(i, i2, intent)) {
            ArrayList arrayList = new ArrayList();
            Uri data = intent.getData();
            if (data != null) {
                arrayList.add(data.toString());
                onPickerResult(arrayList, 0);
            } else if (intent.getClipData() != null) {
                int itemCount = intent.getClipData().getItemCount();
                for (int i3 = 0; i3 < itemCount; i3++) {
                    arrayList.add(intent.getClipData().getItemAt(i3).getUri().toString());
                }
                onPickerResult(arrayList, 0);
            }
        }
    }

    private boolean checkResult(int i, int i2, Intent intent) {
        String str = "requestCode:" + i + ".   resultCode:" + i2;
        if (i != 82) {
            Log.d(LOG_TAG, str);
            return false;
        }
        if (i2 != -1) {
            Log.i(LOG_TAG, str);
            onPickerResult(new ArrayList(), 0);
            return false;
        }
        if (intent != null) {
            return true;
        }
        Log.i(LOG_TAG, str + ".  data is null");
        onPickerResult(new ArrayList(), 0);
        return false;
    }

    private void startPicker(Intent intent) {
        try {
            ((Activity) Objects.requireNonNull(getActivity())).startActivityForResult(intent, 82);
        } catch (ActivityNotFoundException e) {
            Log.e(LOG_TAG, "ActivityNotFoundException, err:", e);
            onPickerResult(new ArrayList(), 0);
        } catch (Exception e2) {
            Log.e(LOG_TAG, "startActivityForResult unknown error, err:", e2);
            onPickerResult(null, RESULT_ERROR);
        }
    }

    private Activity getActivity() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        return null;
    }
}
