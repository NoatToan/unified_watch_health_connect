package com.miui.bugreport.logprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DumpLogProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final File f10280a = new File("/");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile HashMap<String, File> f10281b = new HashMap<>();
    public static volatile boolean c;

    public static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static HashMap<String, File> b(Context context, String str) {
        HashMap<String, File> map = new HashMap<>();
        try {
            XmlResourceParser xmlResourceParserLoadXmlMetaData = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).loadXmlMetaData(context.getPackageManager(), str);
            if (xmlResourceParserLoadXmlMetaData != null) {
                while (true) {
                    int next = xmlResourceParserLoadXmlMetaData.next();
                    if (next == 1) {
                        break;
                    }
                    if (next == 2) {
                        String name = xmlResourceParserLoadXmlMetaData.getName();
                        File externalStorageDirectory = null;
                        String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            externalStorageDirectory = f10280a;
                        } else if ("files-path".equals(name)) {
                            externalStorageDirectory = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            externalStorageDirectory = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            externalStorageDirectory = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = context.getExternalFilesDirs(null);
                            if (externalFilesDirs.length > 0) {
                                externalStorageDirectory = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = context.getExternalCacheDirs();
                            if (externalCacheDirs.length > 0) {
                                externalStorageDirectory = externalCacheDirs[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                externalStorageDirectory = externalMediaDirs[0];
                            }
                        }
                        if (externalStorageDirectory != null) {
                            c(attributeValue, a(externalStorageDirectory, attributeValue2));
                        }
                    }
                }
            } else {
                return map;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void c(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            f10281b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean d(Context context) {
        try {
            return (context.getPackageManager().getPackageInfo("com.miui.bugreport", 0).applicationInfo.flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        c = d(getContext());
        f10281b.putAll(b(getContext(), "com.miui.bugreport.DEFAULT_LOG_DIR"));
        f10281b.putAll(b(getContext(), "com.miui.bugreport.LOG_DIR"));
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (!c) {
            return null;
        }
        String path = Uri.parse(Uri.decode(uri.toString())).getPath();
        if (TextUtils.isEmpty(path)) {
            throw new FileNotFoundException();
        }
        try {
            File file = new File(path);
            String canonicalPath = file.getCanonicalPath();
            Iterator<Map.Entry<String, File>> it = f10281b.entrySet().iterator();
            while (it.hasNext()) {
                if (canonicalPath.startsWith(it.next().getValue().getPath())) {
                    return ParcelFileDescriptor.open(file, 268435456);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!c) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, File>> it = f10281b.entrySet().iterator();
        while (it.hasNext()) {
            File value = it.next().getValue();
            if (value.exists()) {
                linkedList.offer(value);
                while (linkedList.size() != 0) {
                    File file = (File) linkedList.poll();
                    if (file.isFile()) {
                        arrayList.add(file.getPath());
                    } else {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2.isFile()) {
                                    arrayList.add(file2.getPath());
                                } else if (file2.isDirectory()) {
                                    linkedList.offer(file2);
                                }
                            }
                        }
                    }
                }
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[0]);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("logDir", arrayList);
        matrixCursor.setExtras(bundle);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
