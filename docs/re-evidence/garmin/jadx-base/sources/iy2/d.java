package iy2;

import android.content.Context;
import com.garmin.sync.gc.exception.ServerException;
import d53.u;
import d53.w;
import gy2.f;
import gy2.h;
import gy2.i;
import java.io.File;
import java.util.HashMap;
import o13.m;
import o13.r;
import o13.t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Liy2/d;", "", "", "loggingPrefix", "Lhy2/d;", "serverDelegate", "<init>", "(Ljava/lang/String;Lhy2/d;)V", "loggableUrl", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy2.d f95853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f95854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f95855c;

    public d(String str, hy2.d dVar) {
        str.getClass();
        dVar.getClass();
        this.f95853a = dVar;
        Logger logger = LoggerFactory.getLogger(str.concat("FitDownloadStrategy"));
        logger.getClass();
        this.f95854b = logger;
        this.f95855c = new f(str);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0315  */
    /* JADX WARN: Code duplicated, block: B:112:0x0326  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Type inference failed for: r16v4, types: [T, gy2.e, java.lang.Object] */
    public final Object a(gy2.c cVar, File file, Context context, String str, v13.c cVar2) throws Exception {
        b bVar;
        long j8;
        d dVar;
        gy2.c cVar3;
        long j14;
        String str2;
        long j15;
        u13.a aVar;
        File file2;
        gy2.c cVar4;
        String str3;
        Context context2;
        long j16;
        r0 r0Var;
        File file3;
        Context context3;
        hy2.c cVar5;
        StringBuilder sb3;
        byte[] bArrO;
        String str4 = "Unexpected server response (";
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i14 = bVar.f95851k;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f95851k = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar2);
            }
        } else {
            bVar = new b(this, cVar2);
        }
        Object obj = bVar.f95849i;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f95851k;
        if (i15 == 0) {
            r.b(obj);
            long jA = cVar.a();
            long jD = cVar.d();
            r0 r0Var2 = new r0();
            try {
                f.a aVar3 = f.f80309b;
                String strF = cVar.f();
                aVar3.getClass();
                String strA = f.a.a(strF);
                strA.getClass();
                String string = w.i0(strA).toString();
                str2 = "No content found (";
                Long l14 = new Long(cVar.a());
                String str5 = cVar.f80292c;
                h hVar = cVar.f80294e;
                HashMap mapA = nd2.a.a(l14, str5, hVar != null ? hVar.f80327a : null);
                boolean zY = u.y(string, "http", false);
                hy2.d dVar2 = this.f95853a;
                if (zY) {
                    try {
                        bVar.f95841a = this;
                        bVar.f95842b = cVar;
                        bVar.f95843c = file;
                        bVar.f95844d = context;
                        bVar.f95845e = r0Var2;
                        bVar.f95846f = string;
                        bVar.f95847g = jA;
                        bVar.f95848h = jD;
                        bVar.f95851k = 1;
                        b bVar2 = bVar;
                        aVar = aVar2;
                        try {
                            Object objF = dVar2.f(jA, string, str, mapA, bVar2);
                            if (objF != aVar) {
                                file2 = file;
                                dVar = this;
                                cVar4 = cVar;
                                str3 = string;
                                context2 = context;
                                j16 = jD;
                                obj = objF;
                                j14 = jA;
                                r0Var = r0Var2;
                                cVar5 = (hy2.c) obj;
                                File file4 = file2;
                                context3 = context2;
                                cVar3 = cVar4;
                                file3 = file4;
                                str4 = "Unexpected server response (";
                            }
                            return aVar;
                        } catch (Exception e4) {
                            e = e4;
                            j15 = jA;
                            dVar = this;
                            j14 = j15;
                            cVar3 = cVar;
                            sb3 = new StringBuilder("Unable to download file content for messageName=");
                            sb3.append(cVar3.e());
                            sb3.append(" for messageId=");
                            sb3.append(cVar3.d());
                            sb3.append(" for deviceId=");
                            sb3.append(j14);
                            sb3.append(". ");
                            sb3.append(e.getMessage());
                            dVar.f95854b.error(sb3.toString(), (Throwable) e);
                            if (e instanceof ServerException) {
                                throw e;
                            }
                            throw new ServerException(i.DEVICE_MESSAGE_DOWNLOAD_FAILED, sb3.toString(), null, null, 12, null);
                        }
                    } catch (Exception e14) {
                        e = e14;
                        j15 = jA;
                    }
                } else {
                    j15 = jA;
                    b bVar3 = bVar;
                    aVar = aVar2;
                    try {
                        StringBuilder sb4 = new StringBuilder();
                        if (!u.y(string, "/", false)) {
                            try {
                                sb4.append("/");
                            } catch (Exception e15) {
                                e = e15;
                                dVar = this;
                                j14 = j15;
                                cVar3 = cVar;
                                sb3 = new StringBuilder("Unable to download file content for messageName=");
                                sb3.append(cVar3.e());
                                sb3.append(" for messageId=");
                                sb3.append(cVar3.d());
                                sb3.append(" for deviceId=");
                                sb3.append(j14);
                                sb3.append(". ");
                                sb3.append(e.getMessage());
                                dVar.f95854b.error(sb3.toString(), (Throwable) e);
                                if (e instanceof ServerException) {
                                    throw new ServerException(i.DEVICE_MESSAGE_DOWNLOAD_FAILED, sb3.toString(), null, null, 12, null);
                                }
                                throw e;
                            }
                        }
                        String strF2 = cVar.f();
                        strF2.getClass();
                        sb4.append(w.i0(strF2).toString());
                        String string2 = sb4.toString();
                        bVar3.f95841a = this;
                        bVar3.f95842b = cVar;
                        bVar3.f95843c = file;
                        bVar3.f95844d = context;
                        bVar3.f95845e = r0Var2;
                        bVar3.f95846f = string;
                        bVar3.f95847g = j15;
                        bVar3.f95848h = jD;
                        bVar3.f95851k = 2;
                        j8 = j15;
                        try {
                            Object objE = dVar2.e(j8, string2, str, mapA, bVar3);
                            if (objE != aVar) {
                                file3 = file;
                                dVar = this;
                                cVar3 = cVar;
                                context3 = context;
                                j16 = jD;
                                str3 = string;
                                obj = objE;
                                j14 = j8;
                                r0Var = r0Var2;
                                cVar5 = (hy2.c) obj;
                            }
                            return aVar;
                        } catch (Exception e16) {
                            e = e16;
                            dVar = this;
                            cVar3 = cVar;
                            j14 = j8;
                            sb3 = new StringBuilder("Unable to download file content for messageName=");
                            sb3.append(cVar3.e());
                            sb3.append(" for messageId=");
                            sb3.append(cVar3.d());
                            sb3.append(" for deviceId=");
                            sb3.append(j14);
                            sb3.append(". ");
                            sb3.append(e.getMessage());
                            dVar.f95854b.error(sb3.toString(), (Throwable) e);
                            if (e instanceof ServerException) {
                                throw new ServerException(i.DEVICE_MESSAGE_DOWNLOAD_FAILED, sb3.toString(), null, null, 12, null);
                            }
                            throw e;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        j8 = j15;
                    }
                }
            } catch (Exception e18) {
                e = e18;
                j8 = jA;
            }
            sb3 = new StringBuilder("Unable to download file content for messageName=");
            sb3.append(cVar3.e());
            sb3.append(" for messageId=");
            sb3.append(cVar3.d());
            sb3.append(" for deviceId=");
            sb3.append(j14);
            sb3.append(". ");
            sb3.append(e.getMessage());
            dVar.f95854b.error(sb3.toString(), (Throwable) e);
            if (e instanceof ServerException) {
                throw new ServerException(i.DEVICE_MESSAGE_DOWNLOAD_FAILED, sb3.toString(), null, null, 12, null);
            }
            throw e;
        }
        if (i15 == 1) {
            j16 = bVar.f95848h;
            j14 = bVar.f95847g;
            str3 = bVar.f95846f;
            r0Var = bVar.f95845e;
            context2 = bVar.f95844d;
            file2 = bVar.f95843c;
            cVar4 = bVar.f95842b;
            dVar = bVar.f95841a;
            try {
                r.b(obj);
                str2 = "No content found (";
                cVar5 = (hy2.c) obj;
                File file5 = file2;
                context3 = context2;
                cVar3 = cVar4;
                file3 = file5;
                str4 = "Unexpected server response (";
            } catch (Exception e19) {
                e = e19;
                cVar3 = cVar4;
            }
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j16 = bVar.f95848h;
            j14 = bVar.f95847g;
            str3 = bVar.f95846f;
            r0Var = bVar.f95845e;
            context3 = bVar.f95844d;
            file3 = bVar.f95843c;
            cVar3 = bVar.f95842b;
            dVar = bVar.f95841a;
            try {
                r.b(obj);
                str2 = "No content found (";
                cVar5 = (hy2.c) obj;
            } catch (Exception e24) {
                e = e24;
            }
        }
        t tVarB = m.b(new c(str3));
        int httpResponseCode = cVar5.getHttpResponseCode();
        if (httpResponseCode == 204 || httpResponseCode == 404) {
            throw new ServerException(i.CONTENT_DOES_NOT_EXIST, str2 + httpResponseCode + ")", (String) tVarB.getValue(), new Integer(httpResponseCode));
        }
        if (cVar5.b() != null) {
            throw new ServerException(i.UNEXPECTED_SERVER_RESPONSE, str4 + httpResponseCode + ").", (String) tVarB.getValue(), new Integer(httpResponseCode));
        }
        Object data = cVar5.getData();
        if (data == null) {
            throw new ServerException(i.EMPTY_SERVER_RESPONSE, "null response", (String) tVarB.getValue(), new Integer(httpResponseCode));
        }
        if (data instanceof String) {
            h hVar2 = cVar3.f80294e;
            if (!u.q(hVar2 != null ? hVar2.f80339m : null, "JSON", true)) {
                String str6 = cVar3.f80291b;
                if (str6 != null) {
                    String string3 = str6 != null ? str6.toString() : null;
                    string3.getClass();
                    if (string3.equals("ULFConfig")) {
                    }
                }
                throw new ServerException(i.UNEXPECTED_SERVER_RESPONSE, (String) data, (String) tVarB.getValue(), new Integer(httpResponseCode));
            }
            bArrO = u.o((String) data);
        } else {
            if (!(data instanceof byte[])) {
                throw new ServerException(i.UNEXPECTED_SERVER_RESPONSE, "Unexpected response data type", (String) tVarB.getValue(), new Integer(httpResponseCode));
            }
            bArrO = (byte[]) data;
        }
        dVar.f95854b.debug("Downloading file content for deviceId=" + j14 + " from deviceMessageId=" + j16 + " to " + file3.getAbsolutePath());
        dVar.f95855c.getClass();
        f.e(bArrO, file3, context3);
        String parent = file3.getParent();
        parent.getClass();
        String name = file3.getName();
        name.getClass();
        ?? eVar = new gy2.e(parent, name, file3.length(), new Integer(httpResponseCode));
        r0Var.f105810a = eVar;
        return eVar;
    }
}
