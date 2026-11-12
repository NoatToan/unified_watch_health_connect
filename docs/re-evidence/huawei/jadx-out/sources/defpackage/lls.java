package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.mvp.ui.activity.ScanImageActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes10.dex */
public class lls {
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[Catch: IOException -> 0x0060, TRY_LEAVE, TryCatch #8 {IOException -> 0x0060, blocks: (B:28:0x005c, B:32:0x0064), top: B:54:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:54:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.gson.Gson] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.io.BufferedReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.BufferedReader] */
    public static <T> T a(InputStream inputStream, Class<T> cls) throws Throwable {
        ?? r8;
        Throwable e;
        InputStreamReader inputStreamReader;
        ?? Create = new GsonBuilder().create();
        InputStreamReader inputStreamReader2 = null;
        t = null;
        t = null;
        T t = null;
        try {
            try {
                inputStreamReader = new InputStreamReader((InputStream) inputStream, StandardCharsets.UTF_8);
                try {
                    inputStream = new BufferedReader(inputStreamReader);
                    try {
                        t = (T) Create.fromJson(inputStream, cls);
                        try {
                            inputStreamReader.close();
                            inputStream.close();
                        } catch (IOException e2) {
                            LogUtil.e("Foundation_JsonUtil", ExceptionUtils.c(e2));
                        }
                    } catch (JsonSyntaxException e3) {
                        e = e3;
                        LogUtil.e("Foundation_JsonUtil", "readDataFromJsonFile exception :", ExceptionUtils.c(e));
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                                if (inputStream != 0) {
                                    inputStream.close();
                                }
                            } catch (IOException e4) {
                                inputStream = new Object[]{ExceptionUtils.c(e4)};
                                LogUtil.e("Foundation_JsonUtil", (Object[]) inputStream);
                            }
                        } else if (inputStream != 0) {
                            inputStream.close();
                        }
                    } catch (NullPointerException e5) {
                        e = e5;
                        LogUtil.e("Foundation_JsonUtil", "readDataFromJsonFile exception :", ExceptionUtils.c(e));
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            if (inputStream != 0) {
                                inputStream.close();
                            }
                        } else if (inputStream != 0) {
                            inputStream.close();
                        }
                    }
                } catch (JsonSyntaxException e6) {
                    e = e6;
                    e = e;
                    inputStream = 0;
                    LogUtil.e("Foundation_JsonUtil", "readDataFromJsonFile exception :", ExceptionUtils.c(e));
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                        if (inputStream != 0) {
                            inputStream.close();
                        }
                    } else if (inputStream != 0) {
                        inputStream.close();
                    }
                    return t;
                } catch (NullPointerException e7) {
                    e = e7;
                    e = e;
                    inputStream = 0;
                    LogUtil.e("Foundation_JsonUtil", "readDataFromJsonFile exception :", ExceptionUtils.c(e));
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                        if (inputStream != 0) {
                            inputStream.close();
                        }
                    } else if (inputStream != 0) {
                        inputStream.close();
                    }
                    return t;
                } catch (Throwable th) {
                    th = th;
                    r8 = 0;
                    inputStreamReader2 = inputStreamReader;
                    if (inputStreamReader2 != null) {
                        try {
                            inputStreamReader2.close();
                        } catch (IOException e8) {
                            LogUtil.e("Foundation_JsonUtil", ExceptionUtils.c(e8));
                            throw th;
                        }
                    }
                    if (r8 != 0) {
                        r8.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                inputStreamReader2 = inputStreamReader;
                r8 = inputStream;
                th = th2;
            }
        } catch (JsonSyntaxException e9) {
            e = e9;
            e = e;
            inputStream = 0;
            inputStreamReader = null;
            LogUtil.e("Foundation_JsonUtil", "readDataFromJsonFile exception :", ExceptionUtils.c(e));
            if (inputStreamReader != null) {
                inputStreamReader.close();
                if (inputStream != 0) {
                    inputStream.close();
                }
            } else if (inputStream != 0) {
                inputStream.close();
            }
            return t;
        } catch (NullPointerException e10) {
            e = e10;
            e = e;
            inputStream = 0;
            inputStreamReader = null;
            LogUtil.e("Foundation_JsonUtil", "readDataFromJsonFile exception :", ExceptionUtils.c(e));
            if (inputStreamReader != null) {
                inputStreamReader.close();
                if (inputStream != 0) {
                    inputStream.close();
                }
            } else if (inputStream != 0) {
                inputStream.close();
            }
            return t;
        } catch (Throwable th3) {
            th = th3;
            r8 = 0;
        }
        return t;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[Catch: IOException -> 0x0080, TRY_LEAVE, TryCatch #7 {IOException -> 0x0080, blocks: (B:32:0x007c, B:36:0x0084), top: B:56:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4 A[Catch: IOException -> 0x00a0, TRY_LEAVE, TryCatch #8 {IOException -> 0x00a0, blocks: (B:44:0x009c, B:48:0x00a4), top: B:58:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[SYNTHETIC] */
    private static String e(InputStream inputStream) throws Throwable {
        BufferedReader bufferedReader;
        IOException iOException;
        BufferedReader bufferedReader2;
        Throwable th;
        InputStreamReader inputStreamReader = null;
        try {
            InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream, "UTF-8");
            try {
                bufferedReader2 = new BufferedReader(inputStreamReader2, 2048);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        if (sb.length() > 5242880) {
                            LogUtil.e("Foundation_JsonUtil", "json file len is beyond max limits:", Integer.valueOf(ScanImageActivity.SCAN_IMAGE_LENGTH_LIMIT));
                            break;
                        }
                        sb.append(line);
                    }
                    String string = sb.toString();
                    try {
                        inputStreamReader2.close();
                        bufferedReader2.close();
                        return string;
                    } catch (IOException e) {
                        LogUtil.e("Foundation_JsonUtil", ExceptionUtils.c(e));
                        return string;
                    }
                } catch (IOException e2) {
                    iOException = e2;
                    inputStreamReader = inputStreamReader2;
                    try {
                        LogUtil.e("Foundation_JsonUtil", "readStringFromJsonFile", ExceptionUtils.c(iOException));
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                                if (bufferedReader2 != null) {
                                    bufferedReader2.close();
                                }
                            } catch (IOException e3) {
                                LogUtil.e("Foundation_JsonUtil", ExceptionUtils.c(e3));
                                return "";
                            }
                        } else if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return "";
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        bufferedReader = bufferedReader2;
                        th = th3;
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (IOException e4) {
                                LogUtil.e("Foundation_JsonUtil", ExceptionUtils.c(e4));
                                throw th;
                            }
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = inputStreamReader2;
                    Throwable th5 = th;
                    bufferedReader = bufferedReader2;
                    th = th5;
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (IOException e5) {
                iOException = e5;
                bufferedReader2 = null;
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                    throw th;
                }
                throw th;
            }
        } catch (IOException e6) {
            iOException = e6;
            bufferedReader2 = null;
        } catch (Throwable th7) {
            th = th7;
            bufferedReader = null;
        }
    }

    public static final <T> T e(InputStream inputStream, TypeToken<T> typeToken) throws Throwable {
        try {
            return (T) new Gson().fromJson(e(inputStream), typeToken.getType());
        } catch (JsonSyntaxException e) {
            LogUtil.e("Foundation_JsonUtil", "Gson to List error:", ExceptionUtils.c(e));
            return null;
        }
    }

    public static <T> T b(String str, TypeToken<T> typeToken) {
        try {
            return (T) new Gson().fromJson(str, typeToken.getType());
        } catch (JsonSyntaxException e) {
            LogUtil.e("Foundation_JsonUtil", "Gson to List error:", ExceptionUtils.c(e));
            return null;
        }
    }
}
