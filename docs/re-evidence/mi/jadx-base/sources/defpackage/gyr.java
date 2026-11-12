package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes2.dex */
public class gyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f19477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19478b;
    public final String c = "YRN_YRNV3_SDK";

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f1d f19479a;

        public a(f1d f1dVar) {
            this.f19479a = f1dVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            f1d f1dVar = this.f19479a;
            if (f1dVar != null) {
                f1dVar.onFailure(-1, iOException == null ? "net request failure" : iOException.getMessage());
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            String strString;
            if (response == null) {
                f1d f1dVar = this.f19479a;
                if (f1dVar != null) {
                    f1dVar.onFailure(-1, "response null");
                    return;
                }
                return;
            }
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                f1d f1dVar2 = this.f19479a;
                if (f1dVar2 != null) {
                    f1dVar2.onFailure(-1, "response body null");
                    return;
                }
                return;
            }
            try {
                if (!response.isSuccessful()) {
                    zxr.b("YRN_YRNV3_SDK", "YRNOkhttpClientFactory.sendAsyncRequest:" + response.message());
                    f1d f1dVar3 = this.f19479a;
                    if (f1dVar3 != null) {
                        f1dVar3.onFailure(response.code(), response.message());
                        return;
                    }
                    return;
                }
                try {
                    strString = responseBodyBody.string();
                    try {
                        responseBodyBody.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    zxr.b("YRN_YRNV3_SDK", "YRNOkhttpClientFactory.sendAsyncRequest:" + response.message());
                    try {
                        responseBodyBody.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    strString = "";
                }
                zxr.a("YRN_YRNV3_SDK", "YRNOkhttpClientFactory.sendAsyncRequest:onResponse:" + strString);
                f1d f1dVar4 = this.f19479a;
                if (f1dVar4 != null) {
                    f1dVar4.onSuccess(strString);
                }
            } catch (Throwable th) {
                try {
                    responseBodyBody.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                throw th;
            }
        }
    }

    public gyr(String str) {
        this.f19478b = str;
        this.f19477a = a(str);
    }

    public final OkHttpClient a(String str) {
        r1d r1dVarN;
        List netInterceptorList;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).cookieJar(new JavaNetCookieJar(new rur()));
        if (zxr.d()) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(httpLoggingInterceptor);
        }
        gur gurVarD = vwr.g().d(str);
        if (gurVarD != null && (r1dVarN = gurVarD.n()) != null && (netInterceptorList = r1dVarN.getNetInterceptorList()) != null && !netInterceptorList.isEmpty()) {
            for (Object obj : netInterceptorList) {
                if (obj instanceof Interceptor) {
                    builder.addNetworkInterceptor((Interceptor) obj);
                } else {
                    zxr.b("YRN_YRNV3_SDK", "YRNOkhttpClientFactory.createOkClient:getNetInterceptorList must be type of okhttp Interceptor");
                }
            }
        }
        try {
            return builder.build();
        } catch (Throwable th) {
            th.printStackTrace();
            ezr.c().f(YRNTraceEvent.newEvent(str, 1200, th.toString(), null, null));
            return null;
        }
    }

    public final OkHttpClient b() {
        if (this.f19477a == null) {
            this.f19477a = a(this.f19478b);
        }
        return this.f19477a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[SYNTHETIC] */
    public boolean c(String str, f1d<String> f1dVar, Response response) throws Throwable {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str)) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "download savePath is Empty:" + str);
            }
            return false;
        }
        ResponseBody responseBodyBody = response.body();
        File file = new File(str);
        String parent = file.getParent();
        if (!wwr.d(parent)) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "downloadFileInfo create error:" + parent);
            }
            return false;
        }
        byte[] bArr = new byte[2048];
        InputStream inputStream = null;
        try {
            if (responseBodyBody == null && f1dVar != null) {
                f1dVar.onFailure(-1, "responseBody is null");
                if (responseBodyBody != null) {
                    try {
                        responseBodyBody.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
            InputStream inputStreamByteStream = responseBodyBody.byteStream();
            try {
                responseBodyBody.getContentLength();
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStreamByteStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    } catch (Exception e2) {
                        e = e2;
                        inputStream = inputStreamByteStream;
                        try {
                            e.printStackTrace();
                            if (f1dVar != null) {
                                f1dVar.onFailure(-1, e.getMessage());
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (responseBodyBody != null) {
                                try {
                                    responseBodyBody.close();
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e7) {
                                    e7.printStackTrace();
                                }
                            }
                            if (responseBodyBody != null) {
                                throw th;
                            }
                            try {
                                responseBodyBody.close();
                                throw th;
                            } catch (Exception e8) {
                                e8.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamByteStream;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (responseBodyBody != null) {
                            throw th;
                        }
                        responseBodyBody.close();
                        throw th;
                    }
                }
                fileOutputStream.flush();
                if (f1dVar != null) {
                    f1dVar.onSuccess(null);
                }
                try {
                    inputStreamByteStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                try {
                    responseBodyBody.close();
                    return true;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return true;
                }
            } catch (Exception e12) {
                e = e12;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e13) {
            e = e13;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public void d(String str, String str2, f1d<String> f1dVar) {
        if (b() == null) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "mOkHttpClient is null");
                return;
            }
            return;
        }
        zxr.a("YRN_YRNV3_SDK", "YRNOkhttpClientFactory.sendAsyncRequest:url is " + str + ",params is " + str2);
        this.f19477a.newCall(new Request.Builder().url(str).header("Content-Type", "application/json").post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str2)).build()).enqueue(new a(f1dVar));
    }

    public boolean e(String str, JsonObject jsonObject, String str2, f1d<String> f1dVar) {
        zxr.a("YRN_YRNV3_SDK", "sendAsyncRequest");
        if (b() == null) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "mOkHttpClient is null");
            }
            return false;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "download url or downloadSavePath is Empty");
            }
            return false;
        }
        try {
            Response responseExecute = this.f19477a.newCall(new Request.Builder().url(oxr.c(str, jsonObject)).get().build()).execute();
            if (responseExecute != null && responseExecute.body() != null) {
                return c(str2, f1dVar, responseExecute);
            }
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "response null");
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "download error:" + e);
            }
            return false;
        }
    }
}
