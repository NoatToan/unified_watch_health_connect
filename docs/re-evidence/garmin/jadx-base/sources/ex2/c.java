package ex2;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.ImageHelper$downloadZipImagesFromIconSet$2", f = "ImageHelper.kt", l = {326}, m = "invokeSuspend", v = 1)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f66948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f66949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f66950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f66951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f66952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String str, String str2, String str3, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f66949c = context;
        this.f66950d = str;
        this.f66951e = str2;
        this.f66952f = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f66949c, this.f66950d, this.f66951e, this.f66952f, dVar);
        cVar.f66948b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f66948b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f66947a;
        HttpURLConnection httpURLConnection = null;
        if (i14 == 0) {
            o13.r.b(obj);
            iw2.w wVar = iw2.w.f95547a;
            this.f66948b = b0Var;
            this.f66947a = 1;
            wVar.getClass();
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new iw2.n(this.f66949c, this.f66950d, this.f66951e, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        File file = (File) obj;
        byte[] bArr = new byte[8192];
        try {
            try {
                i.f66971b.getClass();
                URLConnection uRLConnectionOpenConnection = new URL(this.f66952f).openConnection();
                httpURLConnection = uRLConnectionOpenConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnectionOpenConnection : null;
                if (httpURLConnection == null) {
                    Logger logger = cx2.h.f56678c;
                    Boolean bool = Boolean.FALSE;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return bool;
                }
                if (httpURLConnection.getResponseCode() != 200) {
                    httpURLConnection.getResponseCode();
                    Logger logger2 = cx2.h.f56678c;
                    Boolean bool2 = Boolean.FALSE;
                    httpURLConnection.disconnect();
                    return bool2;
                }
                ZipInputStream zipInputStream = new ZipInputStream(httpURLConnection.getInputStream());
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            Unit unit = Unit.INSTANCE;
                            zipInputStream.close();
                            i.f66971b.getClass();
                            httpURLConnection.disconnect();
                            return Boolean.TRUE;
                        }
                        String name = nextEntry.getName();
                        i iVar = i.f66970a;
                        name.getClass();
                        iVar.getClass();
                        String strSubstring = name.substring(d53.w.L(0, 6, name, "/") + 1);
                        i.f66971b.getClass();
                        if (strSubstring.length() == 0) {
                            nextEntry.getName();
                        } else {
                            File file2 = new File(file, strSubstring);
                            File parentFile = nextEntry.isDirectory() ? file2 : file2.getParentFile();
                            if (parentFile.isDirectory() || parentFile.mkdirs()) {
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    while (true) {
                                        try {
                                            int i15 = zipInputStream.read(bArr);
                                            if (i15 == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, i15);
                                        } catch (Throwable th3) {
                                            try {
                                                throw th3;
                                            } catch (Throwable th4) {
                                                jg.b.l(fileOutputStream, th3);
                                                throw th4;
                                            }
                                        }
                                    }
                                    i.f66971b.getClass();
                                    Unit unit2 = Unit.INSTANCE;
                                    fileOutputStream.close();
                                } catch (FileNotFoundException e4) {
                                    i.f66971b.d(e4, "downloadAndSaveImagesFromZip: Caught fileNotFoundException");
                                } catch (ProtocolException e14) {
                                    i.f66971b.d(e14, "downloadAndSaveImagesFromZip: Caught protocolException");
                                }
                            } else {
                                nextEntry.getName();
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            jg.b.l(zipInputStream, th5);
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                i.f66971b.getClass();
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th7;
            }
        } catch (Exception unused) {
            i.f66971b.getClass();
            Boolean bool3 = Boolean.FALSE;
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            return bool3;
        }
    }
}
