package com.xiaomi.infra.galaxy.fds.android;

import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfHttpClient;
import com.google.gson.Gson;
import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.FDSObject;
import com.xiaomi.infra.galaxy.fds.android.model.InitMultipartUploadResult;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import com.xiaomi.infra.galaxy.fds.android.model.PutObjectResult;
import com.xiaomi.infra.galaxy.fds.android.model.ThumbParam;
import com.xiaomi.infra.galaxy.fds.android.model.UploadPartResult;
import com.xiaomi.infra.galaxy.fds.android.model.UploadPartResultList;
import com.xiaomi.infra.galaxy.fds.android.model.UserParam;
import com.xiaomi.infra.galaxy.fds.android.util.Args;
import com.xiaomi.infra.galaxy.fds.android.util.Consts;
import com.xiaomi.infra.galaxy.fds.android.util.ObjectInputStream;
import com.xiaomi.infra.galaxy.fds.android.util.RequestFactory;
import com.xiaomi.infra.galaxy.fds.android.util.Util;
import com.xiaomi.infra.galaxy.fds.model.HttpMethod;
import com.xmlywind.sdk.common.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.text.Typography;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* JADX INFO: loaded from: classes22.dex */
public class GalaxyFDSClientImpl implements GalaxyFDSClient {
    private static final String d = "GalaxyFDSClientImpl";
    private static final String e = "http";
    private static final String f = "https";
    private static final boolean g;
    private final FDSClientConfiguration a;
    private final HttpClient b;
    private ThreadPoolExecutor c;

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "FDS-multipart-upload-thread");
        }
    }

    public class b implements Callable<UploadPartResult> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ byte[] e;

        public b(String str, String str2, String str3, int i, byte[] bArr) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = bArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UploadPartResult call() throws Exception {
            return GalaxyFDSClientImpl.this.d(this.a, this.b, this.c, this.d, this.e);
        }
    }

    static {
        String property = System.getProperty("java.runtime.name");
        if (property == null || !property.equals("android runtime")) {
            g = true;
        } else {
            g = false;
        }
    }

    public GalaxyFDSClientImpl(FDSClientConfiguration fDSClientConfiguration) {
        this.a = fDSClientConfiguration;
        this.b = b(fDSClientConfiguration);
        this.c = new ThreadPoolExecutor(fDSClientConfiguration.getThreadPoolCoreSize(), fDSClientConfiguration.getThreadPoolMaxSize(), fDSClientConfiguration.getThreadPoolKeepAliveSecs(), TimeUnit.SECONDS, new ArrayBlockingQueue(fDSClientConfiguration.getWorkQueueCapacity(), true), new a());
    }

    private HttpClient b(FDSClientConfiguration fDSClientConfiguration) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, fDSClientConfiguration.getConnectionTimeoutMs());
        HttpConnectionParams.setSoTimeout(basicHttpParams, fDSClientConfiguration.getSocketTimeoutMs());
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setTcpNoDelay(basicHttpParams, true);
        int i = fDSClientConfiguration.getSocketBufferSizeHints()[0];
        int i2 = fDSClientConfiguration.getSocketBufferSizeHints()[1];
        if (i > 0 || i2 > 0) {
            HttpConnectionParams.setSocketBufferSize(basicHttpParams, Math.max(i, i2));
        }
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        if (fDSClientConfiguration.isHttpsEnabled()) {
            schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        }
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    private boolean c(List<UserParam> list) {
        if (list != null) {
            Iterator<UserParam> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof ThumbParam) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UploadPartResult d(String str, String str2, String str3, int i, byte[] bArr) throws GalaxyFDSClientException {
        String str4 = this.a.g() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str3 + "?uploadId=" + str + "&partNumber=" + i;
        InputStream inputStream = null;
        int i2 = 0;
        while (true) {
            try {
                try {
                    HttpUriRequest httpUriRequestCreateRequest = RequestFactory.createRequest(str4, this.a.getCredential(), HttpMethod.PUT, null);
                    ((HttpPut) httpUriRequestCreateRequest).setEntity(new ByteArrayEntity(bArr));
                    try {
                        HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(this.b, httpUriRequestCreateRequest);
                        InputStream content = httpResponseExecute.getEntity().getContent();
                        if (httpResponseExecute.getStatusLine().getStatusCode() != 200) {
                            throw new GalaxyFDSClientException("Unable to upload object[" + str2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str3 + "] to URI :" + str4 + ". Fail to upload part " + i + ": " + httpResponseExecute.getStatusLine().toString());
                        }
                        UploadPartResult uploadPartResult = (UploadPartResult) new Gson().fromJson((Reader) new InputStreamReader(content), UploadPartResult.class);
                        if (uploadPartResult != null && uploadPartResult.getEtag() != null) {
                            if (content != null) {
                                try {
                                    content.close();
                                } catch (IOException unused) {
                                }
                            }
                            return uploadPartResult;
                        }
                        throw new GalaxyFDSClientException("Fail to parse the result of uploading part. bucket name:" + str2 + ", object name:" + str3 + ", upload ID:" + str);
                    } catch (IOException e2) {
                        throw new GalaxyFDSClientException("Fail to put part. URI:" + str4, e2);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (GalaxyFDSClientException e3) {
                i2++;
                if (i2 >= this.a.getMaxRetryTimes()) {
                    throw e3;
                }
                if (!g) {
                    Log.i(d, "Retry the upload of object:" + str3 + " bucket:" + str2 + " upload id:" + str + " part number:" + i + " cause:" + Util.getStackTrace(e3));
                }
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
            }
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public void abortMultipartUpload(String str, String str2, String str3) throws GalaxyFDSClientException {
        String str4 = this.a.g() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + "?uploadId=" + str3;
        InputStream content = null;
        try {
            try {
                HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(this.b, RequestFactory.createRequest(str4, this.a.getCredential(), HttpMethod.DELETE, null));
                content = httpResponseExecute.getEntity().getContent();
                if (httpResponseExecute.getStatusLine().getStatusCode() == 200) {
                    if (content != null) {
                        try {
                            content.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                throw new GalaxyFDSClientException("Unable to upload object[" + str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + "] to URI :" + str4 + ". Fail to abort multipart upload: " + httpResponseExecute.getStatusLine().toString());
            } catch (IOException e2) {
                throw new GalaxyFDSClientException("Fail to abort multipart upload. URI:" + str4, e2);
            }
        } catch (Throwable th) {
            if (content != null) {
                try {
                    content.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult completeMultipartUpload(String str, String str2, String str3, ObjectMetadata objectMetadata, UploadPartResultList uploadPartResultList, List<UserParam> list) throws GalaxyFDSClientException {
        HashMap map;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.g() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str3 + "?uploadId=" + str);
        if (list != null) {
            for (UserParam userParam : list) {
                sb.append(Typography.amp);
                sb.append(userParam.toString());
            }
        }
        String string = sb.toString();
        InputStream inputStream = null;
        try {
            if (objectMetadata != null) {
                try {
                    map = new HashMap();
                    for (Map.Entry<String, String> entry : objectMetadata.getAllMetadata().entrySet()) {
                        map.put(entry.getKey().toLowerCase(), entry.getValue());
                    }
                } catch (IOException e2) {
                    throw new GalaxyFDSClientException("Fail to complete multipart upload. URI:" + string, e2);
                }
            } else {
                map = null;
            }
            HttpUriRequest httpUriRequestCreateRequest = RequestFactory.createRequest(string, this.a.getCredential(), HttpMethod.PUT, map);
            ((HttpPut) httpUriRequestCreateRequest).setEntity(new StringEntity(new Gson().toJson(uploadPartResultList)));
            HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(this.b, httpUriRequestCreateRequest);
            InputStream content = httpResponseExecute.getEntity().getContent();
            if (httpResponseExecute.getStatusLine().getStatusCode() != 200) {
                throw new GalaxyFDSClientException("Unable to upload object[" + str2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str3 + "] to URI :" + string + ". Fail to complete multipart upload: " + httpResponseExecute.getStatusLine().toString());
            }
            PutObjectResult putObjectResult = (PutObjectResult) new Gson().fromJson((Reader) new InputStreamReader(content), PutObjectResult.class);
            if (putObjectResult != null && putObjectResult.getAccessKeyId() != null && putObjectResult.getSignature() != null && putObjectResult.getExpires() != 0) {
                putObjectResult.setFdsServiceBaseUri(this.a.c());
                putObjectResult.setCdnServiceBaseUri(this.a.e());
                if (content != null) {
                    try {
                        content.close();
                    } catch (IOException unused) {
                    }
                }
                return putObjectResult;
            }
            throw new GalaxyFDSClientException("Fail to parse the result of completing multipart upload. bucket name:" + str2 + ", object name:" + str3 + ", upload ID:" + str);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public boolean doesObjectExist(String str, String str2) throws GalaxyFDSClientException {
        Args.notNull(str, "bucket name");
        Args.notEmpty(str, "bucket name");
        Args.notNull(str2, "object name");
        Args.notEmpty(str2, "object name");
        String str3 = this.a.c() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2;
        try {
            HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(this.b, RequestFactory.createRequest(str3, this.a.getCredential(), HttpMethod.HEAD, null));
            int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                return true;
            }
            if (statusCode == 404) {
                return false;
            }
            throw new GalaxyFDSClientException("Unable to head object[" + str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + "] from URI :" + str3 + ". Cause:" + httpResponseExecute.getStatusLine().toString());
        } catch (IOException e2) {
            throw new GalaxyFDSClientException("Unable to head object[" + str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + "] from URI :" + str3 + " Exception:" + e2.getMessage(), e2);
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public FDSObject getObject(String str, String str2) throws GalaxyFDSClientException {
        return getObject(str, str2, 0L, (List<UserParam>) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public InitMultipartUploadResult initMultipartUpload(String str, String str2) throws GalaxyFDSClientException {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.g());
        sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        sb.append(str);
        sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        sb.append(str2 == null ? "" : str2);
        sb.append("?uploads");
        String string = sb.toString();
        InputStream inputStream = null;
        try {
            try {
                HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(this.b, RequestFactory.createRequest(string, this.a.getCredential(), str2 == null ? HttpMethod.POST : HttpMethod.PUT, new HashMap()));
                InputStream content = httpResponseExecute.getEntity().getContent();
                if (httpResponseExecute.getStatusLine().getStatusCode() != 200) {
                    throw new GalaxyFDSClientException("Unable to upload object[" + str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + "] to URI :" + string + ". Fail to initiate multipart upload: " + httpResponseExecute.getStatusLine().toString());
                }
                InitMultipartUploadResult initMultipartUploadResult = (InitMultipartUploadResult) new Gson().fromJson((Reader) new InputStreamReader(content), InitMultipartUploadResult.class);
                if (initMultipartUploadResult != null && initMultipartUploadResult.getUploadId() != null && initMultipartUploadResult.getObjectName() != null && initMultipartUploadResult.getBucketName() != null) {
                    if (content != null) {
                        try {
                            content.close();
                        } catch (IOException unused) {
                        }
                    }
                    return initMultipartUploadResult;
                }
                throw new GalaxyFDSClientException("Fail to parse the result of init multipart upload. bucket name:" + str + ", object name:" + str2);
            } catch (IOException e2) {
                throw new GalaxyFDSClientException("Fail to initiate multipart upload. URI:" + string, e2);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, String str2, File file) throws GalaxyFDSClientException {
        return putObject(str, str2, file, (List<UserParam>) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public UploadPartResult uploadPart(String str, String str2, String str3, int i, ObjectInputStream objectInputStream, long j) throws GalaxyFDSClientException {
        byte[] bArr = new byte[FDSClientConfiguration.DEFAULT_UPLOAD_PART_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) j);
        long j2 = j;
        while (j2 != 0) {
            try {
                int i2 = objectInputStream.read(bArr, 0, Math.min(FDSClientConfiguration.DEFAULT_UPLOAD_PART_SIZE, (int) j2));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                j2 -= (long) i2;
            } catch (IOException e2) {
                throw new GalaxyFDSClientException("Fail to read data from input stream, size:" + j, e2);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return d(str, str2, str3, i, byteArray);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public FDSObject getObject(String str, String str2, long j, List<UserParam> list) throws GalaxyFDSClientException {
        return getObject(str, str2, j, list, (ProgressListener) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, String str2, File file, List<UserParam> list) throws GalaxyFDSClientException {
        return putObject(str, str2, file, list, (ProgressListener) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public FDSObject getObject(String str, String str2, long j, List<UserParam> list, ProgressListener progressListener) throws GalaxyFDSClientException {
        Args.notNull(str, "bucket name");
        Args.notEmpty(str, "bucket name");
        Args.notNull(str2, "object name");
        Args.notEmpty(str2, "object name");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.f());
        sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2);
        return getObject(sb.toString(), j, list, progressListener);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, String str2, File file, List<UserParam> list, ProgressListener progressListener) throws GalaxyFDSClientException {
        Args.notNull(file, "file");
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.setContentLength(file.length());
            objectMetadata.setContentType(Util.getMimeType(file));
            objectMetadata.setLastModified(new Date(file.lastModified()));
            return putObject(str, str2, bufferedInputStream, objectMetadata, list, progressListener);
        } catch (FileNotFoundException e2) {
            throw new GalaxyFDSClientException("Unable to find the file to be uploaded:" + file.getAbsolutePath(), e2);
        }
    }

    @Deprecated
    public GalaxyFDSClientImpl(String str, GalaxyFDSCredential galaxyFDSCredential, FDSClientConfiguration fDSClientConfiguration) {
        this.a = fDSClientConfiguration;
        fDSClientConfiguration.setCredential(galaxyFDSCredential);
        this.b = b(fDSClientConfiguration);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    @Deprecated
    public FDSObject getObject(String str, String str2, long j, List<UserParam> list, ProgressListener progressListener, boolean z) throws GalaxyFDSClientException {
        return getObject(str, str2, j, list, progressListener);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0156 A[ADDED_TO_REGION] */
    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public FDSObject getObject(String str, long j, List<UserParam> list, ProgressListener progressListener) throws Throwable {
        InputStream content;
        GalaxyFDSClientException galaxyFDSClientException;
        String string = str;
        Args.notNull(string, "URI");
        Args.notNegative(j, "offset in content");
        if (list != null) {
            StringBuilder sb = new StringBuilder(string);
            for (UserParam userParam : list) {
                if (sb.indexOf("?") == -1) {
                    sb.append('?');
                } else {
                    sb.append(Typography.amp);
                }
                sb.append(userParam.toString());
            }
            string = sb.toString();
        }
        String str2 = string;
        try {
            String path = new URI(str2).getPath();
            int iIndexOf = path.indexOf(47, 1);
            if (iIndexOf != -1) {
                String strSubstring = path.substring(0, iIndexOf);
                String strSubstring2 = path.substring(iIndexOf + 1);
                GalaxyFDSClientException galaxyFDSClientException2 = null;
                galaxyFDSClientException2 = null;
                InputStream inputStream = null;
                try {
                    HashMap map = new HashMap();
                    if (j > 0 && !c(list)) {
                        map.put("Range", Constants.RANGE_PARAMS + j + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    }
                    HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(this.b, RequestFactory.createRequest(str2, this.a.getCredential(), HttpMethod.GET, map));
                    content = httpResponseExecute.getEntity().getContent();
                    try {
                        int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
                        if (statusCode != 200 && statusCode != 206) {
                            galaxyFDSClientException = new GalaxyFDSClientException("Unable to get object[" + strSubstring + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + strSubstring2 + "] from URI :" + str2 + ". Cause:" + httpResponseExecute.getStatusLine().toString());
                            try {
                                throw galaxyFDSClientException;
                            } catch (IOException e2) {
                                e = e2;
                                inputStream = content;
                                try {
                                    GalaxyFDSClientException galaxyFDSClientException3 = new GalaxyFDSClientException("Unable to get object[" + strSubstring + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + strSubstring2 + "] from URI :" + str2 + " Exception:" + e.getMessage(), e);
                                    try {
                                        throw galaxyFDSClientException3;
                                    } catch (Throwable th) {
                                        th = th;
                                        InputStream inputStream2 = inputStream;
                                        galaxyFDSClientException2 = galaxyFDSClientException3;
                                        content = inputStream2;
                                        if (galaxyFDSClientException2 != null) {
                                            try {
                                                content.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    content = inputStream;
                                    galaxyFDSClientException2 = galaxyFDSClientException;
                                    if (galaxyFDSClientException2 != null && content != null) {
                                        content.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                galaxyFDSClientException2 = galaxyFDSClientException;
                                if (galaxyFDSClientException2 != null) {
                                    content.close();
                                }
                                throw th;
                            }
                        }
                        FDSObject fDSObject = new FDSObject(strSubstring, strSubstring2);
                        ObjectMetadata objectMetadata = ObjectMetadata.parseObjectMetadata(httpResponseExecute.getAllHeaders());
                        fDSObject.setObjectContent(new ObjectInputStream(content, objectMetadata, progressListener));
                        fDSObject.setObjectMetadata(objectMetadata);
                        return fDSObject;
                    } catch (IOException e3) {
                        e = e3;
                        galaxyFDSClientException = null;
                    } catch (Throwable th4) {
                        th = th4;
                        if (galaxyFDSClientException2 != null) {
                            content.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    galaxyFDSClientException = null;
                } catch (Throwable th5) {
                    th = th5;
                    content = null;
                }
            } else {
                throw new URISyntaxException(str2, "not a valid object URI");
            }
        } catch (URISyntaxException e5) {
            throw new GalaxyFDSClientException("Invalid URI, can't parse bucket nameand object name form it:" + str2, e5);
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) throws GalaxyFDSClientException {
        return putObject(str, str2, inputStream, objectMetadata, (List<UserParam>) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata, List<UserParam> list) throws GalaxyFDSClientException {
        return putObject(str, str2, inputStream, objectMetadata, list, null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata, List<UserParam> list, ProgressListener progressListener) throws GalaxyFDSClientException {
        String objectName;
        int i;
        Args.notNull(str, "bucket name");
        Args.notEmpty(str, "bucket name");
        Args.notNull(inputStream, "input stream");
        Args.notNull(objectMetadata, "metadata");
        long contentLength = objectMetadata.getContentLength();
        Args.notNegative(contentLength, "content length");
        if (objectMetadata.getContentType() == null) {
            objectMetadata.setContentType(Consts.APPLICATION_OCTET_STREAM);
        }
        String str3 = null;
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream, objectMetadata, progressListener);
        try {
            try {
                InitMultipartUploadResult initMultipartUploadResultInitMultipartUpload = initMultipartUpload(str, str2);
                objectName = initMultipartUploadResultInitMultipartUpload.getObjectName();
                try {
                    String uploadId = initMultipartUploadResultInitMultipartUpload.getUploadId();
                    try {
                        long uploadPartSize = this.a.getUploadPartSize();
                        int iMax = Math.max(1, (int) (((contentLength + uploadPartSize) - 1) / uploadPartSize));
                        ArrayList arrayList = new ArrayList(iMax);
                        int i2 = 1;
                        while (i2 <= iMax) {
                            ArrayList arrayList2 = new ArrayList(iMax);
                            long j = contentLength;
                            int i3 = i2;
                            while (true) {
                                if (i3 > iMax) {
                                    i = iMax;
                                    break;
                                }
                                i = iMax;
                                if (i3 - i2 >= this.a.getThreadPoolMaxSize()) {
                                    break;
                                }
                                long jMin = Math.min(uploadPartSize, j);
                                int i4 = i3;
                                int i5 = (int) jMin;
                                byte[] bArr = new byte[i5];
                                objectInputStream.read(bArr, 0, i5);
                                long j2 = uploadPartSize;
                                ArrayList arrayList3 = arrayList2;
                                arrayList3.add(this.c.submit(new b(uploadId, str, objectName, i4, bArr)));
                                j -= jMin;
                                i3 = i4 + 1;
                                iMax = i;
                                i2 = i2;
                                arrayList2 = arrayList3;
                                arrayList = arrayList;
                                uploadPartSize = j2;
                            }
                            int i6 = i3;
                            long j3 = j;
                            long j4 = uploadPartSize;
                            ArrayList arrayList4 = arrayList;
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((Future) it2.next()).get());
                            }
                            iMax = i;
                            arrayList = arrayList4;
                            i2 = i6;
                            contentLength = j3;
                            uploadPartSize = j4;
                        }
                        UploadPartResultList uploadPartResultList = new UploadPartResultList();
                        uploadPartResultList.setUploadPartResultList(arrayList);
                        PutObjectResult putObjectResultCompleteMultipartUpload = completeMultipartUpload(uploadId, str, objectName, objectMetadata, uploadPartResultList, list);
                        try {
                            objectInputStream.close();
                        } catch (IOException unused) {
                        }
                        return putObjectResultCompleteMultipartUpload;
                    } catch (Exception e2) {
                        e = e2;
                        str3 = uploadId;
                        if (str3 != null) {
                            abortMultipartUpload(str, objectName, str3);
                        }
                        throw new GalaxyFDSClientException(e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                objectName = str2;
            }
        } catch (Throwable th) {
            try {
                objectInputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, File file) throws GalaxyFDSClientException {
        return putObject(str, file, (List<UserParam>) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, File file, List<UserParam> list) throws GalaxyFDSClientException {
        return putObject(str, file, list, (ProgressListener) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public ObjectMetadata getObject(String str, String str2, File file) throws GalaxyFDSClientException {
        return getObject(str, str2, file, (List<UserParam>) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, File file, List<UserParam> list, ProgressListener progressListener) throws GalaxyFDSClientException {
        return putObject(str, (String) null, file, list, progressListener);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public ObjectMetadata getObject(String str, String str2, File file, List<UserParam> list) throws GalaxyFDSClientException {
        return getObject(str, str2, file, list, (ProgressListener) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, InputStream inputStream, ObjectMetadata objectMetadata) throws GalaxyFDSClientException {
        return putObject(str, inputStream, objectMetadata, (List<UserParam>) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public ObjectMetadata getObject(String str, String str2, File file, List<UserParam> list, ProgressListener progressListener) throws Throwable {
        long length;
        Args.notNull(file, "Destination file");
        boolean zC = c(list);
        int i = 0;
        while (true) {
            boolean z = (i == 0 || zC) ? false : true;
            if (z) {
                try {
                    length = file.length();
                } catch (GalaxyFDSClientException e2) {
                    i++;
                    if (i < this.a.getMaxRetryTimes()) {
                        if (!g) {
                            Log.i(d, "Retry the download of object:" + str2 + " bucket:" + str + " to file: " + file.getAbsolutePath() + " cause:" + Util.getStackTrace(e2));
                        }
                    } else {
                        throw e2;
                    }
                }
            } else {
                length = 0;
            }
            FDSObject object = getObject(str, str2, length, list, progressListener);
            Util.downloadObjectToFile(object, file, z);
            return object.getObjectMetadata();
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, InputStream inputStream, ObjectMetadata objectMetadata, List<UserParam> list) throws GalaxyFDSClientException {
        return putObject(str, inputStream, objectMetadata, list, (ProgressListener) null);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public PutObjectResult putObject(String str, InputStream inputStream, ObjectMetadata objectMetadata, List<UserParam> list, ProgressListener progressListener) throws GalaxyFDSClientException {
        return putObject(str, null, inputStream, objectMetadata, list, progressListener);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    @Deprecated
    public ObjectMetadata getObject(String str, String str2, File file, List<UserParam> list, ProgressListener progressListener, boolean z) throws GalaxyFDSClientException {
        return getObject(str, str2, file, list, progressListener);
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient
    public ObjectMetadata getObject(String str, File file, List<UserParam> list, ProgressListener progressListener) throws Throwable {
        long length;
        Args.notNull(file, "Destination file");
        boolean zC = c(list);
        int i = 0;
        while (true) {
            boolean z = (i == 0 || zC) ? false : true;
            if (z) {
                try {
                    length = file.length();
                } catch (GalaxyFDSClientException e2) {
                    i++;
                    if (i < this.a.getMaxRetryTimes()) {
                        if (!g) {
                            Log.i(d, "Retry the download of object:" + str + " to file: " + file.getAbsolutePath() + " cause:" + Util.getStackTrace(e2));
                        }
                    } else {
                        throw e2;
                    }
                }
            } else {
                length = 0;
            }
            FDSObject object = getObject(str, length, list, progressListener);
            Util.downloadObjectToFile(object, file, z);
            return object.getObjectMetadata();
        }
    }
}
