package com.rnfs;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import defpackage.ddq;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class d extends AsyncTask<c, int[], ddq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f10589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ddq f10590b;
    public AtomicBoolean c = new AtomicBoolean(false);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d dVar = d.this;
                dVar.g(dVar.f10589a, d.this.f10590b);
                d.this.f10589a.g.a(d.this.f10590b);
            } catch (Exception e) {
                d.this.f10590b.c = e;
                d.this.f10589a.g.a(d.this.f10590b);
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ddq doInBackground(c... cVarArr) {
        this.f10589a = cVarArr[0];
        this.f10590b = new ddq();
        new Thread(new a()).start();
        return this.f10590b;
    }

    public String e(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase()) : null;
        return mimeTypeFromExtension == null ? "*/*" : mimeTypeFromExtension;
    }

    public void f() {
        this.c.set(true);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x035e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0363  */
    /* JADX WARN: Code duplicated, block: B:110:0x0368  */
    /* JADX WARN: Code duplicated, block: B:112:0x036d  */
    public final void g(c cVar, ddq ddqVar) throws Exception {
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
            Object[] array = cVar.f10588b.toArray();
            boolean z = cVar.c;
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) cVar.f10587a.openConnection();
            try {
                httpURLConnection3.setDoOutput(true);
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = cVar.d.keySetIterator();
                httpURLConnection3.setRequestMethod(cVar.f);
                if (!z) {
                    httpURLConnection3.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
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
                        String str8 = string3;
                        str7 = str7 + "--*****\r\nContent-Disposition: form-data; name=\"" + strNextKey2 + "\"\r\n\r\n" + cVar.e.getString(strNextKey2) + "\r\n";
                        httpURLConnection3 = httpURLConnection2;
                        readableMapKeySetIteratorKeySetIterator2 = readableMapKeySetIterator;
                        string3 = str8;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                    }
                    th = th;
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
                String str9 = string3;
                try {
                    String[] strArr2 = new String[array.length];
                    Iterator<ReadableMap> it = cVar.f10588b.iterator();
                    String str10 = str7;
                    String str11 = "" + str7;
                    int i2 = 0;
                    long length = 0;
                    while (true) {
                        str = str11;
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
                            String str12 = string;
                            String str13 = str4;
                            String str14 = string2;
                            String str15 = str5;
                            File file = new File(next.getString("filepath"));
                            int i3 = i2;
                            long length2 = file.length();
                            length += length2;
                            if (z) {
                                str3 = str6;
                                i = i3;
                                str11 = str;
                            } else {
                                String str16 = "--*****" + str6 + "Content-Disposition: form-data; name=\"" + str12 + "\"; filename=\"" + str14 + "\"" + str6 + "Content-Type: " + strE + str6;
                                i = i3;
                                if (array.length - 1 == i) {
                                    length += (long) str9.length();
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Content-length: ");
                                sb2.append(length2);
                                str3 = str6;
                                sb2.append(str3);
                                String string4 = sb2.toString();
                                strArr[i] = str16 + string4 + str3;
                                str11 = str + str16 + string4 + str3;
                            }
                            str6 = str3;
                            i2 = i + 1;
                            str4 = str13;
                            it = it2;
                            str5 = str15;
                            strArr2 = strArr;
                        } catch (Throwable th2) {
                            th = th2;
                            dataOutputStream = null;
                            bufferedInputStream = null;
                            bufferedReader = null;
                            httpURLConnection = httpURLConnection2;
                        }
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
                    String str17 = str6;
                    String[] strArr3 = strArr2;
                    c.a aVar = this.f10589a.i;
                    if (aVar != null) {
                        aVar.a();
                    }
                    if (z) {
                        httpURLConnection3 = httpURLConnection2;
                    } else {
                        long length3 = ((long) (str.length() + (array.length * 2))) + length;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("");
                        int i4 = (int) length3;
                        sb3.append(i4);
                        httpURLConnection3 = httpURLConnection2;
                        httpURLConnection3.setRequestProperty("Content-length", sb3.toString());
                        httpURLConnection3.setFixedLengthStreamingMode(i4);
                    }
                    httpURLConnection3.connect();
                    dataOutputStream = new DataOutputStream(httpURLConnection3.getOutputStream());
                    try {
                        WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(dataOutputStream);
                        if (!z) {
                            dataOutputStream.writeBytes(str10);
                        }
                        Iterator<ReadableMap> it3 = cVar.f10588b.iterator();
                        int i5 = 0;
                        int i6 = 0;
                        while (it3.hasNext()) {
                            ReadableMap next2 = it3.next();
                            if (!z) {
                                dataOutputStream.writeBytes(strArr3[i5]);
                            }
                            File file2 = new File(next2.getString(str2));
                            String str18 = str2;
                            Iterator<ReadableMap> it4 = it3;
                            long length4 = file2.length();
                            int i7 = i6;
                            long jCeil = (long) Math.ceil(length4 / 100.0f);
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            FileChannel channel = fileInputStream.getChannel();
                            long j = 0;
                            while (j < length4) {
                                long jTransferTo = channel.transferTo(j, jCeil, writableByteChannelNewChannel);
                                j += jTransferTo;
                                WritableByteChannel writableByteChannel = writableByteChannelNewChannel;
                                c.InterfaceC0334c interfaceC0334c = this.f10589a.h;
                                long j2 = length4;
                                if (interfaceC0334c != null) {
                                    int i8 = (int) (((long) i7) + jTransferTo);
                                    interfaceC0334c.a((int) length, i8);
                                    i7 = i8;
                                }
                                writableByteChannelNewChannel = writableByteChannel;
                                length4 = j2;
                            }
                            WritableByteChannel writableByteChannel2 = writableByteChannelNewChannel;
                            if (!z) {
                                dataOutputStream.writeBytes(str17);
                            }
                            i5++;
                            fileInputStream.close();
                            it3 = it4;
                            i6 = i7;
                            str2 = str18;
                            writableByteChannelNewChannel = writableByteChannel2;
                        }
                        if (!z) {
                            dataOutputStream.writeBytes(str9);
                        }
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        bufferedInputStream = new BufferedInputStream(httpURLConnection3.getInputStream());
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
                            try {
                                WritableMap writableMapCreateMap = Arguments.createMap();
                                for (Map.Entry<String, List<String>> entry : httpURLConnection3.getHeaderFields().entrySet()) {
                                    writableMapCreateMap.putString(entry.getKey(), entry.getValue().get(0));
                                }
                                StringBuilder sb4 = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        String string5 = sb4.toString();
                                        int responseCode = httpURLConnection3.getResponseCode();
                                        ddq ddqVar2 = this.f10590b;
                                        ddqVar2.f15418b = writableMapCreateMap;
                                        ddqVar2.d = string5;
                                        ddqVar2.f15417a = responseCode;
                                        httpURLConnection3.disconnect();
                                        dataOutputStream.close();
                                        bufferedInputStream.close();
                                        bufferedReader.close();
                                        return;
                                    }
                                    sb4.append(line);
                                    sb4.append("\n");
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                httpURLConnection = httpURLConnection3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            httpURLConnection = httpURLConnection3;
                            bufferedReader = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        httpURLConnection = httpURLConnection3;
                        bufferedInputStream = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    httpURLConnection3 = httpURLConnection2;
                    httpURLConnection = httpURLConnection3;
                    dataOutputStream = null;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            dataOutputStream = null;
            bufferedInputStream = null;
            bufferedReader = null;
            httpURLConnection = null;
        }
    }
}
