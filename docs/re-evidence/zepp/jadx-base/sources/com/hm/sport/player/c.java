package com.hm.sport.player;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class c {
    private c() {
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[SYNTHETIC] */
    public static File a(Context context, List<String> list) throws Throwable {
        SequenceInputStream sequenceInputStream;
        FileOutputStream fileOutputStream;
        SequenceInputStream sequenceInputStream2;
        FileOutputStream fileOutputStream2 = null;
        if (context == null || list == null || list.size() <= 0) {
            return null;
        }
        String str = context.getFilesDir() + File.separator + "sound.mp3";
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        AssetManager assets = context.getResources().getAssets();
        try {
            ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(assets.open(str2));
                }
            }
            sequenceInputStream = new SequenceInputStream(Collections.enumeration(arrayList));
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(str);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = sequenceInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream3.write(bArr, 0, i);
                        fileOutputStream3.flush();
                    }
                    File file2 = new File(str);
                    try {
                        fileOutputStream3.close();
                    } catch (IOException unused) {
                    }
                    try {
                        sequenceInputStream.close();
                    } catch (IOException unused2) {
                    }
                    return file2;
                } catch (Exception e) {
                    fileOutputStream = fileOutputStream3;
                    e = e;
                    sequenceInputStream2 = sequenceInputStream;
                    try {
                        Log.e("Player", e.getMessage(), e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (sequenceInputStream2 != null) {
                            try {
                                sequenceInputStream2.close();
                            } catch (IOException unused4) {
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        sequenceInputStream = sequenceInputStream2;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (sequenceInputStream != null) {
                            throw th;
                        }
                        try {
                            sequenceInputStream.close();
                            throw th;
                        } catch (IOException unused6) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    fileOutputStream2 = fileOutputStream3;
                    th = th2;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    if (sequenceInputStream != null) {
                        throw th;
                    }
                    sequenceInputStream.close();
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                sequenceInputStream2 = sequenceInputStream;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
            sequenceInputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            sequenceInputStream = null;
        }
    }
}
