package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes19.dex */
public class vsi {
    public static final void c(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                LogUtil.e("UIDV_CloseUtil", "closeIOException:", e.getMessage());
            }
        }
    }

    public static final void c(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                LogUtil.e("UIDV_CloseUtil", "OutputStream IOException:", e.getMessage());
            }
        }
    }

    public static final void c(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static final void c(OutputStreamWriter outputStreamWriter) {
        if (outputStreamWriter != null) {
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                LogUtil.e("UIDV_CloseUtil", "IOException :" + e.getMessage());
            }
        }
    }

    public static final void d(PrintWriter printWriter) {
        if (printWriter != null) {
            printWriter.close();
        }
    }

    public static final void a(InputStreamReader inputStreamReader) {
        if (inputStreamReader != null) {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                LogUtil.e("UIDV_CloseUtil", "IOException :", e.getMessage());
            }
        }
    }

    public static final void c(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                LogUtil.e("UIDV_CloseUtil", "FileOutputStream IOException:", e.getMessage());
            }
        }
    }

    public static final void a(FileInputStream fileInputStream) {
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                LogUtil.e("UIDV_CloseUtil", "FileInputStream IOException:", e.getMessage());
            }
        }
    }

    public static final void d(ZipInputStream zipInputStream) {
        if (zipInputStream != null) {
            try {
                zipInputStream.close();
            } catch (IOException e) {
                LogUtil.e("UIDV_CloseUtil", "IOException:", e.getMessage());
            }
        }
    }
}
