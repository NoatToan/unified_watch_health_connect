package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.e4f;
import defpackage.ndj;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = BlobModule.NAME)
public class BlobModule extends ReactContextBaseJavaModule {
    public static final String NAME = "BlobModule";
    private final Map<String, byte[]> mBlobs;
    private final NetworkingModule.g mNetworkingRequestBodyHandler;
    private final NetworkingModule.h mNetworkingResponseHandler;
    private final NetworkingModule.i mNetworkingUriHandler;
    private final WebSocketModule.b mWebSocketContentHandler;

    public class a implements WebSocketModule.b {
        public a() {
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public void a(String str, WritableMap writableMap) {
            writableMap.putString("data", str);
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public void b(ByteString byteString, WritableMap writableMap) {
            byte[] byteArray = byteString.toByteArray();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("blobId", BlobModule.this.store(byteArray));
            writableMapCreateMap.putInt("offset", 0);
            writableMapCreateMap.putInt(MediaStoreUtil.MediaInfo.SIZE, byteArray.length);
            writableMap.putMap("data", writableMapCreateMap);
            writableMap.putString("type", "blob");
        }
    }

    public class b implements NetworkingModule.i {
        public b() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.i
        public WritableMap a(Uri uri) throws IOException {
            byte[] bytesFromUri = BlobModule.this.getBytesFromUri(uri);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("blobId", BlobModule.this.store(bytesFromUri));
            writableMapCreateMap.putInt("offset", 0);
            writableMapCreateMap.putInt(MediaStoreUtil.MediaInfo.SIZE, bytesFromUri.length);
            writableMapCreateMap.putString("type", BlobModule.this.getMimeTypeFromUri(uri));
            writableMapCreateMap.putString("name", BlobModule.this.getNameFromUri(uri));
            writableMapCreateMap.putDouble("lastModified", BlobModule.this.getLastModifiedFromUri(uri));
            return writableMapCreateMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.i
        public boolean b(Uri uri, String str) {
            String scheme = uri.getScheme();
            return ("http".equals(scheme) || Constants.URI_SCHEME.equals(scheme) || !"blob".equals(str)) ? false : true;
        }
    }

    public class c implements NetworkingModule.g {
        public c() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.g
        public boolean a(ReadableMap readableMap) {
            return readableMap.hasKey("blob");
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.g
        public RequestBody b(ReadableMap readableMap, String str) {
            if (readableMap.hasKey("type") && !readableMap.getString("type").isEmpty()) {
                str = readableMap.getString("type");
            }
            if (str == null) {
                str = "application/octet-stream";
            }
            ReadableMap map = readableMap.getMap("blob");
            return RequestBody.create(MediaType.parse(str), BlobModule.this.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt(MediaStoreUtil.MediaInfo.SIZE)));
        }
    }

    public class d implements NetworkingModule.h {
        public d() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.h
        public WritableMap a(ResponseBody responseBody) throws IOException {
            byte[] bArrBytes = responseBody.bytes();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("blobId", BlobModule.this.store(bArrBytes));
            writableMapCreateMap.putInt("offset", 0);
            writableMapCreateMap.putInt(MediaStoreUtil.MediaInfo.SIZE, bArrBytes.length);
            return writableMapCreateMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.h
        public boolean b(String str) {
            return "blob".equals(str);
        }
    }

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mBlobs = new HashMap();
        this.mWebSocketContentHandler = new a();
        this.mNetworkingUriHandler = new b();
        this.mNetworkingRequestBodyHandler = new c();
        this.mNetworkingResponseHandler = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] getBytesFromUri(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            throw new FileNotFoundException("File not found for " + uri);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamOpenInputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMimeTypeFromUri(Uri uri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? "" : type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getNameFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor cursorQuery = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    return cursorQuery.getString(0);
                }
            } finally {
                cursorQuery.close();
            }
        }
        return uri.getLastPathSegment();
    }

    private WebSocketModule getWebSocketModule() {
        return (WebSocketModule) getReactApplicationContext().getNativeModule(WebSocketModule.class);
    }

    @ReactMethod
    public void addNetworkingHandler() {
        NetworkingModule networkingModule = (NetworkingModule) getReactApplicationContext().getNativeModule(NetworkingModule.class);
        networkingModule.addUriHandler(this.mNetworkingUriHandler);
        networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
        networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
    }

    @ReactMethod
    public void addWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, this.mWebSocketContentHandler);
    }

    @ReactMethod
    public void createFromParts(ReadableArray readableArray, String str) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        int length = 0;
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            String string = map.getString("type");
            string.hashCode();
            if (string.equals("string")) {
                byte[] bytes = map.getString("data").getBytes(Charset.forName("UTF-8"));
                length += bytes.length;
                arrayList.add(i, bytes);
            } else {
                if (!string.equals("blob")) {
                    throw new IllegalArgumentException("Invalid type for blob: " + map.getString("type"));
                }
                ReadableMap map2 = map.getMap("data");
                length += map2.getInt(MediaStoreUtil.MediaInfo.SIZE);
                arrayList.add(i, resolve(map2));
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put((byte[]) it.next());
        }
        store(byteBufferAllocate.array(), str);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        if (identifier == 0) {
            return null;
        }
        return e4f.e("BLOB_URI_SCHEME", MiuiCursorConstants.CONTENT, "BLOB_URI_HOST", resources.getString(identifier));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void release(String str) {
        remove(str);
    }

    public void remove(String str) {
        this.mBlobs.remove(str);
    }

    @ReactMethod
    public void removeWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, null);
    }

    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int i = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter(MediaStoreUtil.MediaInfo.SIZE);
        return resolve(lastPathSegment, i, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    @ReactMethod
    public void sendOverSocket(ReadableMap readableMap, int i) {
        byte[] bArrResolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt(MediaStoreUtil.MediaInfo.SIZE));
        if (bArrResolve != null) {
            getWebSocketModule().sendBinary(ByteString.of(bArrResolve), i);
        } else {
            getWebSocketModule().sendBinary((ByteString) null, i);
        }
    }

    public String store(byte[] bArr) {
        String string = UUID.randomUUID().toString();
        store(bArr, string);
        return string;
    }

    public void store(byte[] bArr, String str) {
        this.mBlobs.put(str, bArr);
    }

    public byte[] resolve(String str, int i, int i2) {
        byte[] bArr = this.mBlobs.get(str);
        if (bArr == null) {
            return null;
        }
        if (i2 == -1) {
            i2 = bArr.length - i;
        }
        return (i > 0 || i2 != bArr.length) ? Arrays.copyOfRange(bArr, i, i2 + i) : bArr;
    }

    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt(MediaStoreUtil.MediaInfo.SIZE));
    }
}
