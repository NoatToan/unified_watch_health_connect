package com.loopj.android.http;

import android.util.Log;
import com.alipay.sdk.m.s.a;
import com.huami.ednetwork.HttpClientCryptoProxy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public class RequestParams {
    public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";
    public static final String LOG_TAG = "RequestParams";
    public boolean autoCloseInputStreams;
    public String contentEncoding;
    public final ConcurrentHashMap<String, FileWrapper> fileParams;
    public boolean isRepeatable;
    public final ConcurrentHashMap<String, StreamWrapper> streamParams;
    public final ConcurrentHashMap<String, String> urlParams;
    public final ConcurrentHashMap<String, Object> urlParamsWithObjects;
    public boolean useJsonStreamer;

    public static class FileWrapper {
        public final String contentType;
        public final File file;

        public FileWrapper(File file, String str) {
            this.file = file;
            this.contentType = str;
        }
    }

    public static class StreamWrapper {
        public final boolean autoClose;
        public final String contentType;
        public final InputStream inputStream;
        public final String name;

        public StreamWrapper(InputStream inputStream, String str, String str2, boolean z) {
            this.inputStream = inputStream;
            this.name = str;
            this.contentType = str2;
            this.autoClose = z;
        }

        public static StreamWrapper newInstance(InputStream inputStream, String str, String str2, boolean z) {
            if (str2 == null) {
                str2 = "application/octet-stream";
            }
            return new StreamWrapper(inputStream, str, str2, z);
        }
    }

    public RequestParams() {
        this((Map<String, String>) null);
    }

    private HttpEntity createFormEntity() {
        try {
            return new UrlEncodedFormEntity(getParamsList(), this.contentEncoding);
        } catch (UnsupportedEncodingException e) {
            Log.e(LOG_TAG, "createFormEntity failed", e);
            return null;
        }
    }

    private HttpEntity createJsonStreamerEntity(ResponseHandlerInterface responseHandlerInterface) throws IOException {
        JsonStreamerEntity jsonStreamerEntity = new JsonStreamerEntity(responseHandlerInterface, (this.fileParams.isEmpty() && this.streamParams.isEmpty()) ? false : true);
        for (Map.Entry<String, String> entry : this.urlParams.entrySet()) {
            jsonStreamerEntity.addPart(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Object> entry2 : this.urlParamsWithObjects.entrySet()) {
            jsonStreamerEntity.addPart(entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry<String, FileWrapper> entry3 : this.fileParams.entrySet()) {
            jsonStreamerEntity.addPart(entry3.getKey(), entry3.getValue());
        }
        for (Map.Entry<String, StreamWrapper> entry4 : this.streamParams.entrySet()) {
            StreamWrapper value = entry4.getValue();
            if (value.inputStream != null) {
                jsonStreamerEntity.addPart(entry4.getKey(), StreamWrapper.newInstance(value.inputStream, value.name, value.contentType, value.autoClose));
            }
        }
        return jsonStreamerEntity;
    }

    private HttpEntity createMultipartEntity(ResponseHandlerInterface responseHandlerInterface) throws IOException {
        SimpleMultipartEntity simpleMultipartEntity = new SimpleMultipartEntity(responseHandlerInterface);
        simpleMultipartEntity.setIsRepeatable(this.isRepeatable);
        for (Map.Entry<String, String> entry : this.urlParams.entrySet()) {
            simpleMultipartEntity.addPart(entry.getKey(), entry.getValue());
        }
        for (BasicNameValuePair basicNameValuePair : getParamsList(null, this.urlParamsWithObjects)) {
            simpleMultipartEntity.addPart(basicNameValuePair.getName(), basicNameValuePair.getValue());
        }
        for (Map.Entry<String, StreamWrapper> entry2 : this.streamParams.entrySet()) {
            StreamWrapper value = entry2.getValue();
            if (value.inputStream != null) {
                simpleMultipartEntity.addPart(entry2.getKey(), value.name, value.inputStream, value.contentType);
            }
        }
        for (Map.Entry<String, FileWrapper> entry3 : this.fileParams.entrySet()) {
            FileWrapper value2 = entry3.getValue();
            simpleMultipartEntity.addPart(entry3.getKey(), value2.file, value2.contentType);
        }
        return simpleMultipartEntity;
    }

    public void add(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        Object hashSet = this.urlParamsWithObjects.get(str);
        if (hashSet == null) {
            hashSet = new HashSet();
            put(str, hashSet);
        }
        if (hashSet instanceof List) {
            ((List) hashSet).add(str2);
        } else if (hashSet instanceof Set) {
            ((Set) hashSet).add(str2);
        }
    }

    public HttpEntity getEntity(ResponseHandlerInterface responseHandlerInterface) throws IOException {
        HttpEntity httpEntityCreateFormEntity;
        if (!HttpClientCryptoProxy.isPathInHmCrypto(responseHandlerInterface.getRequestURI().getPath())) {
            if (this.useJsonStreamer) {
                return createJsonStreamerEntity(responseHandlerInterface);
            }
            return (this.streamParams.isEmpty() && this.fileParams.isEmpty()) ? createFormEntity() : createMultipartEntity(responseHandlerInterface);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.useJsonStreamer) {
            httpEntityCreateFormEntity = createJsonStreamerEntity(responseHandlerInterface);
        } else {
            httpEntityCreateFormEntity = (this.streamParams.isEmpty() && this.fileParams.isEmpty()) ? createFormEntity() : createMultipartEntity(responseHandlerInterface);
        }
        httpEntityCreateFormEntity.writeTo(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return (byteArray == null || byteArray.length == 0) ? httpEntityCreateFormEntity : new HmCryptoHttpEntity(httpEntityCreateFormEntity, HttpClientCryptoProxy.encrypt(byteArray));
    }

    public String getParamString() {
        return URLEncodedUtils.format(getParamsList(), this.contentEncoding);
    }

    public List<BasicNameValuePair> getParamsList() {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry<String, String> entry : this.urlParams.entrySet()) {
            linkedList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        linkedList.addAll(getParamsList(null, this.urlParamsWithObjects));
        return linkedList;
    }

    public void put(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.urlParams.put(str, str2);
    }

    public void remove(String str) {
        this.urlParams.remove(str);
        this.streamParams.remove(str);
        this.fileParams.remove(str);
        this.urlParamsWithObjects.remove(str);
    }

    public void setAutoCloseInputStreams(boolean z) {
        this.autoCloseInputStreams = z;
    }

    public void setContentEncoding(String str) {
        if (str != null) {
            this.contentEncoding = str;
        }
    }

    public void setHttpEntityIsRepeatable(boolean z) {
        this.isRepeatable = z;
    }

    public void setUseJsonStreamer(boolean z) {
        this.useJsonStreamer = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.urlParams.entrySet()) {
            if (sb.length() > 0) {
                sb.append(a.l);
            }
            sb.append(entry.getKey());
            sb.append(SearchCriteria.EQ);
            sb.append(entry.getValue());
        }
        for (Map.Entry<String, StreamWrapper> entry2 : this.streamParams.entrySet()) {
            if (sb.length() > 0) {
                sb.append(a.l);
            }
            sb.append(entry2.getKey());
            sb.append(SearchCriteria.EQ);
            sb.append("STREAM");
        }
        for (Map.Entry<String, FileWrapper> entry3 : this.fileParams.entrySet()) {
            if (sb.length() > 0) {
                sb.append(a.l);
            }
            sb.append(entry3.getKey());
            sb.append(SearchCriteria.EQ);
            sb.append("FILE");
        }
        for (BasicNameValuePair basicNameValuePair : getParamsList(null, this.urlParamsWithObjects)) {
            if (sb.length() > 0) {
                sb.append(a.l);
            }
            sb.append(basicNameValuePair.getName());
            sb.append(SearchCriteria.EQ);
            sb.append(basicNameValuePair.getValue());
        }
        return sb.toString();
    }

    public RequestParams(Map<String, String> map) {
        this.urlParams = new ConcurrentHashMap<>();
        this.streamParams = new ConcurrentHashMap<>();
        this.fileParams = new ConcurrentHashMap<>();
        this.urlParamsWithObjects = new ConcurrentHashMap<>();
        this.contentEncoding = "UTF-8";
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void put(String str, File file) throws FileNotFoundException {
        put(str, file, (String) null);
    }

    public void put(String str, File file, String str2) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new FileNotFoundException();
        }
        if (str != null) {
            this.fileParams.put(str, new FileWrapper(file, str2));
        }
    }

    private List<BasicNameValuePair> getParamsList(String str, Object obj) {
        Object obj2;
        String str2;
        LinkedList linkedList = new LinkedList();
        if (obj instanceof Map) {
            Map map = (Map) obj;
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList);
            for (Object obj3 : arrayList) {
                if ((obj3 instanceof String) && (obj2 = map.get(obj3)) != null) {
                    if (str == null) {
                        str2 = (String) obj3;
                    } else {
                        str2 = String.format("%s[%s]", str, obj3);
                    }
                    linkedList.addAll(getParamsList(str2, obj2));
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.addAll(getParamsList(String.format(Locale.ENGLISH, "%s[%d]", str, Integer.valueOf(i)), list.get(i)));
            }
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                linkedList.addAll(getParamsList(String.format(Locale.ENGLISH, "%s[%d]", str, Integer.valueOf(i2)), objArr[i2]));
            }
        } else if (obj instanceof Set) {
            Iterator it2 = ((Set) obj).iterator();
            while (it2.hasNext()) {
                linkedList.addAll(getParamsList(str, it2.next()));
            }
        } else {
            linkedList.add(new BasicNameValuePair(str, obj.toString()));
        }
        return linkedList;
    }

    public void put(String str, InputStream inputStream) {
        put(str, inputStream, (String) null);
    }

    public void put(String str, InputStream inputStream, String str2) {
        put(str, inputStream, str2, null);
    }

    public void put(String str, InputStream inputStream, String str2, String str3) {
        put(str, inputStream, str2, str3, this.autoCloseInputStreams);
    }

    public void put(String str, InputStream inputStream, String str2, String str3, boolean z) {
        if (str == null || inputStream == null) {
            return;
        }
        this.streamParams.put(str, StreamWrapper.newInstance(inputStream, str2, str3, z));
    }

    public RequestParams(String str, String str2) {
        this(new HashMap<String, String>(str, str2) { // from class: com.loopj.android.http.RequestParams.1
            public final /* synthetic */ String val$key;
            public final /* synthetic */ String val$value;

            {
                this.val$key = str;
                this.val$value = str2;
                put(str, str2);
            }
        });
    }

    public void put(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        this.urlParamsWithObjects.put(str, obj);
    }

    public RequestParams(Object... objArr) {
        this.urlParams = new ConcurrentHashMap<>();
        this.streamParams = new ConcurrentHashMap<>();
        this.fileParams = new ConcurrentHashMap<>();
        this.urlParamsWithObjects = new ConcurrentHashMap<>();
        this.contentEncoding = "UTF-8";
        int length = objArr.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Supplied arguments must be even");
        }
        for (int i = 0; i < length; i += 2) {
            put(String.valueOf(objArr[i]), String.valueOf(objArr[i + 1]));
        }
    }

    public void put(String str, int i) {
        if (str != null) {
            this.urlParams.put(str, String.valueOf(i));
        }
    }

    public void put(String str, long j) {
        if (str != null) {
            this.urlParams.put(str, String.valueOf(j));
        }
    }
}
