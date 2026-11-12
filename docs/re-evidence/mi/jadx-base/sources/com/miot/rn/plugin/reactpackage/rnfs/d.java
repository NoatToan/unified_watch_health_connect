package com.miot.rn.plugin.reactpackage.rnfs;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import defpackage.edq;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class d extends AsyncTask<c, int[], edq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f10256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public edq f10257b;
    public AtomicBoolean c = new AtomicBoolean(false);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d dVar = d.this;
                dVar.g(dVar.f10256a, d.this.f10257b);
                d.this.f10256a.g.a(d.this.f10257b);
            } catch (Exception e) {
                d.this.f10257b.c = e;
                d.this.f10256a.g.a(d.this.f10257b);
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public edq doInBackground(c... cVarArr) {
        this.f10256a = cVarArr[0];
        this.f10257b = new edq();
        new Thread(new a()).start();
        return this.f10257b;
    }

    public String e(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase()) : null;
        return mimeTypeFromExtension == null ? "*/*" : mimeTypeFromExtension;
    }

    public void f() {
        this.c.set(true);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x037f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0384  */
    /* JADX WARN: Code duplicated, block: B:124:0x0389  */
    /* JADX WARN: Code duplicated, block: B:126:0x038e  */
    public final void g(c cVar, edq edqVar) throws Exception {
        DataOutputStream dataOutputStream;
        BufferedInputStream bufferedInputStream;
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        String str;
        String str2;
        String[] strArr;
        String string;
        String string2;
        String strE;
        String str3;
        int i;
        String str4 = "filename";
        String str5 = "name";
        StringBuilder sb = new StringBuilder();
        String str6 = "\r\n";
        sb.append("\r\n");
        sb.append("--");
        sb.append("*****");
        sb.append("--");
        sb.append("\r\n");
        String string3 = sb.toString();
        try {
            Object[] array = cVar.f10255b.toArray();
            boolean z = cVar.c;
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) cVar.f10254a.openConnection();
            try {
                httpURLConnection3.setDoOutput(true);
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = cVar.d.keySetIterator();
                httpURLConnection3.setRequestMethod(cVar.f);
                if (!z) {
                    try {
                        httpURLConnection3.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection3;
                        dataOutputStream = null;
                        bufferedInputStream = null;
                        bufferedReader = null;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (dataOutputStream != null) {
                            dataOutputStream.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    httpURLConnection3.setRequestProperty(strNextKey, cVar.d.getString(strNextKey));
                }
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator2 = cVar.e.keySetIterator();
                String str7 = "";
                while (true) {
                    httpURLConnection2 = httpURLConnection3;
                    if (!readableMapKeySetIteratorKeySetIterator2.hasNextKey()) {
                        break;
                    }
                    try {
                        String strNextKey2 = readableMapKeySetIteratorKeySetIterator2.nextKey();
                        ReadableMapKeySetIterator readableMapKeySetIterator = readableMapKeySetIteratorKeySetIterator2;
                        str7 = str7 + "--*****\r\nContent-Disposition: form-data; name=\"" + strNextKey2 + "\"\r\n\r\n" + cVar.e.getString(strNextKey2) + "\r\n";
                        httpURLConnection3 = httpURLConnection2;
                        readableMapKeySetIteratorKeySetIterator2 = readableMapKeySetIterator;
                        string3 = string3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    th = th2;
                    httpURLConnection = httpURLConnection2;
                    dataOutputStream = null;
                    bufferedInputStream = null;
                    bufferedReader = null;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
                String str8 = string3;
                String[] strArr2 = new String[array.length];
                Iterator<ReadableMap> it = cVar.f10255b.iterator();
                String str9 = "" + str7;
                int i2 = 0;
                String str10 = str7;
                long length = 0;
                while (true) {
                    str = str9;
                    str2 = "filepath";
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        Iterator<ReadableMap> it2 = it;
                        ReadableMap next = it.next();
                        try {
                            string = next.getString(str5);
                            string2 = next.getString(str4);
                            strArr = strArr2;
                            try {
                                strE = next.getString("filetype");
                            } catch (NoSuchKeyException unused) {
                                string = next.getString(str5);
                                string2 = next.getString(str4);
                                strE = e(next.getString("filepath"));
                            }
                        } catch (NoSuchKeyException unused2) {
                            strArr = strArr2;
                        }
                        String str11 = string;
                        String str12 = str4;
                        String str13 = string2;
                        String str14 = str5;
                        File file = new File(next.getString("filepath"));
                        int i3 = i2;
                        long length2 = file.length();
                        length += length2;
                        if (z) {
                            str3 = str6;
                            i = i3;
                            str9 = str;
                        } else {
                            String str15 = "--*****" + str6 + "Content-Disposition: form-data; name=\"" + str11 + "\"; filename=\"" + str13 + "\"" + str6 + "Content-Type: " + strE + str6;
                            i = i3;
                            if (array.length - 1 == i) {
                                length += (long) str8.length();
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Content-length: ");
                            sb2.append(length2);
                            str3 = str6;
                            sb2.append(str3);
                            String string4 = sb2.toString();
                            strArr[i] = str15 + string4 + str3;
                            str9 = str + str15 + string4 + str3;
                        }
                        str6 = str3;
                        i2 = i + 1;
                        str4 = str12;
                        it = it2;
                        str5 = str14;
                        strArr2 = strArr;
                    } catch (Throwable th3) {
                        th = th3;
                        dataOutputStream = null;
                        bufferedInputStream = null;
                        bufferedReader = null;
                    }
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
                String str16 = str6;
                String[] strArr3 = strArr2;
                c.a aVar = this.f10256a.i;
                if (aVar != null) {
                    aVar.a();
                }
                if (z) {
                    httpURLConnection3 = httpURLConnection2;
                } else {
                    try {
                        long length3 = ((long) (str.length() + (array.length * 2))) + length;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("");
                        int i4 = (int) length3;
                        sb3.append(i4);
                        httpURLConnection3 = httpURLConnection2;
                        httpURLConnection3.setRequestProperty("Content-length", sb3.toString());
                        httpURLConnection3.setFixedLengthStreamingMode(i4);
                    } catch (Throwable th4) {
                        th = th4;
                        httpURLConnection3 = httpURLConnection2;
                        httpURLConnection = httpURLConnection3;
                        dataOutputStream = null;
                    }
                }
                httpURLConnection3.connect();
                dataOutputStream = new DataOutputStream(httpURLConnection3.getOutputStream());
                if (!z) {
                    try {
                        dataOutputStream.writeBytes(str10);
                    } catch (Throwable th5) {
                        th = th5;
                        httpURLConnection = httpURLConnection3;
                    }
                }
                try {
                    Runtime runtime = Runtime.getRuntime();
                    Iterator<ReadableMap> it3 = cVar.f10255b.iterator();
                    int i5 = 0;
                    int i6 = 0;
                    while (it3.hasNext()) {
                        ReadableMap next2 = it3.next();
                        if (!z) {
                            dataOutputStream.writeBytes(strArr3[i6]);
                        }
                        File file2 = new File(next2.getString(str2));
                        String str17 = str2;
                        Iterator<ReadableMap> it4 = it3;
                        int length4 = (int) file2.length();
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                        int iCeil = (int) Math.ceil(length4 / 100.0f);
                        httpURLConnection2 = httpURLConnection3;
                        try {
                            if (iCeil > runtime.freeMemory() / 10.0f) {
                                iCeil = (int) Math.ceil(runtime.freeMemory() / 10.0f);
                            }
                            byte[] bArr = new byte[iCeil];
                            while (true) {
                                int i7 = bufferedInputStream2.read(bArr);
                                if (i7 == -1) {
                                    break;
                                }
                                dataOutputStream.write(bArr, 0, i7);
                                c.InterfaceC0319c interfaceC0319c = this.f10256a.h;
                                if (interfaceC0319c != null) {
                                    i5 += i7;
                                    long j = length;
                                    interfaceC0319c.a((int) j, i5);
                                    length = j;
                                }
                            }
                            length = length;
                            if (!z) {
                                dataOutputStream.writeBytes(str16);
                            }
                            i6++;
                            bufferedInputStream2.close();
                            it3 = it4;
                            str2 = str17;
                            httpURLConnection3 = httpURLConnection2;
                        } catch (Throwable th6) {
                            th = th6;
                            httpURLConnection = httpURLConnection2;
                            bufferedInputStream = null;
                            bufferedReader = null;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                    httpURLConnection2 = httpURLConnection3;
                    if (!z) {
                        dataOutputStream.writeBytes(str8);
                    }
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    bufferedInputStream = new BufferedInputStream(httpURLConnection2.getInputStream());
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
                        try {
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            for (Map.Entry<String, List<String>> entry : httpURLConnection2.getHeaderFields().entrySet()) {
                                writableMapCreateMap.putString(entry.getKey(), entry.getValue().get(0));
                            }
                            StringBuilder sb4 = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    String string5 = sb4.toString();
                                    int responseCode = httpURLConnection2.getResponseCode();
                                    edq edqVar2 = this.f10257b;
                                    edqVar2.f16544b = writableMapCreateMap;
                                    edqVar2.d = string5;
                                    edqVar2.f16543a = responseCode;
                                    httpURLConnection2.disconnect();
                                    dataOutputStream.close();
                                    bufferedInputStream.close();
                                    bufferedReader.close();
                                    return;
                                }
                                sb4.append(line);
                                sb4.append("\n");
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    httpURLConnection2 = httpURLConnection3;
                }
            } catch (Throwable th10) {
                th = th10;
                httpURLConnection2 = httpURLConnection3;
            }
        } catch (Throwable th11) {
            th = th11;
            dataOutputStream = null;
            bufferedInputStream = null;
            bufferedReader = null;
            httpURLConnection = null;
        }
    }
}
