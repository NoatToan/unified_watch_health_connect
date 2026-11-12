package ohos.ace.plugin.photoaccesshelper;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentQueryMap;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes46.dex */
public class PhotoPlugin {
    private static String EMPTY_STR = "";
    private static String IMAGE_PREFIX = "file://";
    private static final int MEDIA_TYPE_IMAGE = 1;
    private static final int MEDIA_TYPE_VIDEO = 2;
    private static final String RELATIVE_PATH = "relative_path";
    private static final String SCHEME_CONTENT = "content";
    private static String SELECTION_KEY = "android:query-arg-sql-selection";
    private static String TAG = "photoPlugin";
    private static final int VERSION_Q_API_LEVEL = 29;
    private static final int VERSION_T_API_LEVEL = 33;
    private Context mContext;
    private Object mProxyInstance = null;
    private ContentResolver mResolver;

    protected native void nativeInit();

    protected native void onPickerResult(List<String> list, int i);

    public PhotoPlugin(Context context) {
        this.mContext = context;
        nativeInit();
    }

    public void startPhotoPicker(String str) {
        if (this.mContext == null) {
            Log.i(TAG, "mContext is null");
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        if ("*/*".equals(str)) {
            intent.setType("image/*;video/*");
        } else {
            intent.setType(str);
        }
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        setCallback(activity);
        try {
            activity.startActivityForResult(intent, 1001);
        } catch (ActivityNotFoundException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    public boolean checkPermission() {
        Context context = this.mContext;
        if (context == null) {
            Log.i(TAG, "mContext is null");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            if (packageManager.checkPermission("android.permission.READ_MEDIA_IMAGES", this.mContext.getPackageName()) == 0 || packageManager.checkPermission("android.permission.READ_MEDIA_VIDEO", this.mContext.getPackageName()) == 0) {
                return true;
            }
            Log.e(TAG, "not has permission");
            return false;
        }
        if (packageManager.checkPermission("android.permission.READ_EXTERNAL_STORAGE", this.mContext.getPackageName()) == 0) {
            return true;
        }
        Log.e(TAG, "not has permission");
        return false;
    }

    public boolean checkWritePermission() {
        if (this.mContext == null) {
            Log.e(TAG, "mContext is null");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33 || this.mContext.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", this.mContext.getPackageName()) == 0) {
            return true;
        }
        Log.e(TAG, "not has permission");
        return false;
    }

    public Cursor queryPhoto(Bundle bundle, String[] strArr, String[] strArr2) {
        if (this.mContext == null) {
            Log.i(TAG, "mContext is null");
            return null;
        }
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        if (this.mResolver == null) {
            this.mResolver = activity.getContentResolver();
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        String string = bundle.getString(SELECTION_KEY);
        if (Build.VERSION.SDK_INT >= 30) {
            bundle.putString(SELECTION_KEY, "is_pending = ? AND " + string);
            String[] strArr3 = new String[strArr.length + 1];
            int i = 0;
            strArr3[0] = "0";
            while (i < strArr.length) {
                int i2 = i + 1;
                strArr3[i2] = strArr[i];
                i = i2;
            }
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr3);
            return this.mResolver.query(contentUri, strArr2, bundle, null);
        }
        StringBuilder sb = new StringBuilder();
        appendSelectionArg(sb, bundle.getString("android:query-arg-sql-group-by"), ") GROUP BY(");
        bundle.putString(SELECTION_KEY, string + sb.toString());
        return this.mResolver.query(contentUri, removeWhichNotSupport(strArr2), bundle, null);
    }

    public AlbumValues queryAlbum(Bundle bundle, String[] strArr, String[] strArr2) {
        if (this.mContext == null) {
            Log.i(TAG, "mContext is null");
            return null;
        }
        return new AlbumValues(new ContentQueryMap(queryPhoto(bundle, strArr, strArr2), "_id", false, null));
    }

    private void appendSelectionArg(StringBuilder sb, String str, String str2) {
        if (str == null || str.isEmpty()) {
            return;
        }
        sb.append(str2);
        sb.append(str);
    }

    private String[] removeWhichNotSupport(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
            if (arrayList.contains("is_favorite")) {
                arrayList.remove("is_favorite");
                strArr = new String[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    strArr[i] = (String) arrayList.get(i);
                }
            }
        }
        return strArr;
    }

    private void setCallback(final Activity activity) {
        activity.getPackageName();
        try {
            Class<?> cls = Class.forName("ohos.stage.ability.adapter.StageActivityDelegate");
            Class<?> cls2 = Class.forName("ohos.stage.ability.adapter.StageActivityDelegate$INTENTCALLBACK");
            Method method = cls.getMethod("addIntentCallback", cls2);
            if (this.mProxyInstance == null) {
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: ohos.ace.plugin.photoaccesshelper.PhotoPlugin$$ExternalSyntheticLambda0
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        return this.f$0.m2056x15297c6e(activity, obj, method2, objArr);
                    }
                });
                this.mProxyInstance = objNewProxyInstance;
                method.invoke(null, objNewProxyInstance);
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: lambda$setCallback$0$ohos-ace-plugin-photoaccesshelper-PhotoPlugin, reason: not valid java name */
    /* synthetic */ Object m2056x15297c6e(Activity activity, Object obj, Method method, Object[] objArr) throws Throwable {
        if (!"onResult".equals(method.getName())) {
            return null;
        }
        onResult(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), (Intent) objArr[2], activity);
        return null;
    }

    public void onResult(int i, int i2, Intent intent, Activity activity) {
        Log.i(TAG, "onResult enter requestCode is " + i + ", " + i2);
        if (checkResult(i, i2, intent)) {
            ArrayList arrayList = new ArrayList();
            ContentResolver contentResolver = activity.getContentResolver();
            this.mResolver = contentResolver;
            if (contentResolver == null) {
                onPickerResult(arrayList, 0);
                return;
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null || clipData.getItemCount() <= 0) {
                onPickerResult(getIntentData(intent), 0);
                return;
            }
            int itemCount = clipData.getItemCount();
            for (int i3 = 0; i3 < itemCount; i3++) {
                String imagePath = getImagePath(clipData.getItemAt(i3).getUri());
                if (!imagePath.equals(EMPTY_STR)) {
                    arrayList.add(imagePath);
                }
            }
            onPickerResult(arrayList, 0);
        }
    }

    private List<String> getIntentData(Intent intent) {
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        if (data != null) {
            String imagePath = getImagePath(data);
            if (!imagePath.equals(EMPTY_STR)) {
                arrayList.add(imagePath);
            }
        }
        return arrayList;
    }

    private String getImagePath(Uri uri) {
        ContentResolver contentResolver = this.mResolver;
        if (contentResolver == null) {
            return EMPTY_STR;
        }
        Cursor cursorQuery = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
        if (cursorQuery == null) {
            return EMPTY_STR;
        }
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
        if (string == null || string.isEmpty()) {
            return EMPTY_STR;
        }
        return IMAGE_PREFIX + string;
    }

    private boolean checkResult(int i, int i2, Intent intent) {
        String str = "requestCode:" + i + ".   resultCode:" + i2;
        if (i != 1001) {
            Log.d(TAG, str);
            return false;
        }
        if (i2 != -1) {
            Log.i(TAG, str);
            onPickerResult(new ArrayList(), 0);
            return false;
        }
        if (intent != null) {
            return true;
        }
        Log.i(TAG, str + ".  data is null");
        onPickerResult(new ArrayList(), 0);
        return false;
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

    public String createPhoto(int i, String str, String str2) {
        Context context = this.mContext;
        if (context == null) {
            Log.e(TAG, "mContext is null");
            return null;
        }
        if (this.mResolver == null) {
            this.mResolver = context.getContentResolver();
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            str = str.substring(iLastIndexOf + 1).toLowerCase(Locale.ROOT);
        }
        String str3 = str;
        ContentValues contentValues = new ContentValues();
        String strGenerateDisplayName = generateDisplayName(i, str2, str3);
        String mimeTypeFromExtension = getMimeTypeFromExtension(str3);
        if (mimeTypeFromExtension == null) {
            Log.e(TAG, "extension not supported");
            return null;
        }
        contentValues.put("_display_name", strGenerateDisplayName);
        contentValues.put("mime_type", mimeTypeFromExtension);
        return insertAsset(i, str3, str2, contentValues, strGenerateDisplayName);
    }

    private String insertAsset(int i, String str, String str2, ContentValues contentValues, String str3) {
        Uri uriInsert;
        String string = Long.toString(System.currentTimeMillis());
        String packageName = this.mContext.getPackageName();
        String str4 = string + "_" + (new Random().nextInt(900) + 100);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues.put(RELATIVE_PATH, Environment.DIRECTORY_DCIM + "/" + packageName + "/" + str4);
            } else {
                contentValues.put("_data", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + "/" + packageName + "/" + str4 + "/" + str3);
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                StringBuilder sb = new StringBuilder();
                sb.append(packageName);
                sb.append("/");
                sb.append(str4);
                File file = new File(externalStoragePublicDirectory, sb.toString());
                if (!file.exists() && !file.mkdirs()) {
                    Log.e(TAG, "Failed to create directory");
                    return null;
                }
            }
            if (i == 1) {
                uriInsert = this.mResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else {
                uriInsert = this.mResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
            }
            if (uriInsert == null) {
                Log.e(TAG, "Error uri is null");
                return null;
            }
            return uriInsert.toString();
        } catch (OutOfMemoryError | SecurityException e) {
            Log.e(TAG, "Error creating media asset: " + e.getMessage());
            return null;
        }
    }

    private String generateDisplayName(int i, String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            Log.e(TAG, "extension is null");
            return null;
        }
        if (str == null || str.isEmpty()) {
            return generateDefaultAssetName(i, str2);
        }
        return str + "." + str2;
    }

    private String generateDefaultAssetName(int i, String str) {
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.getDefault()).format(new Date());
        return (i == 1 ? "IMG_" : "VID_") + str2 + "." + str;
    }

    private String getMimeTypeFromExtension(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension != null && !mimeTypeFromExtension.isEmpty()) {
            return mimeTypeFromExtension;
        }
        Log.e(TAG, "extension not supported");
        return null;
    }
}
