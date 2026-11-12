package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.IconCompat;
import com.alipay.sdk.m.u.i;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.loc.z;
import com.loopj.android.http.AsyncHttpClient;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.cybergarage.http.HTTP;
import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 m2\u00020\u0001:\t\u0003nmop\nqr\u0005BQ\b\u0017\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010V\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bi\u0010jB\u001b\b\u0010\u0012\b\u0010$\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010c\u001a\u00020k¢\u0006\u0004\bi\u0010lJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J$\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\bH\u0007J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u0004H\u0016R$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00101\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b2\u0010'\"\u0004\b3\u0010)R$\u00108\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'\"\u0004\b7\u0010)R\"\u0010>\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010E\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010K\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010N\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\bL\u0010'\"\u0004\bM\u0010)R.\u0010P\u001a\u0004\u0018\u00010O2\b\u0010P\u001a\u0004\u0018\u00010O8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR.\u0010^\u001a\u0004\u0018\u00010V2\b\u0010W\u001a\u0004\u0018\u00010V8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u00109R\u0016\u0010a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u00109R\u0018\u0010c\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010%R\u0018\u0010d\u001a\u0004\u0018\u00010\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010'R\u0013\u0010f\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\be\u0010'R\u0013\u0010h\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\bg\u0010'¨\u0006s"}, d2 = {"Lcom/facebook/GraphRequest;", "", "", "a", "", "c", GoogleApiAvailabilityLight.a, "baseUrl", "", "isBatch", "b", "f", z.j, "h", "g", "Lorg/json/JSONArray;", "batch", "", "Lcom/facebook/GraphRequest$a;", "attachments", "i", "skipClientToken", "setSkipClientToken", "forceOverride", "setForceApplicationRequest", "Lcom/facebook/GraphResponse;", "executeAndWait", "Lcom/facebook/GraphRequestAsyncTask;", "executeAsync", "toString", "Lcom/facebook/AccessToken;", "Lcom/facebook/AccessToken;", "getAccessToken", "()Lcom/facebook/AccessToken;", "setAccessToken", "(Lcom/facebook/AccessToken;)V", "accessToken", "Ljava/lang/String;", "getGraphPath", "()Ljava/lang/String;", "setGraphPath", "(Ljava/lang/String;)V", "graphPath", "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "getGraphObject", "()Lorg/json/JSONObject;", "setGraphObject", "(Lorg/json/JSONObject;)V", "graphObject", "getBatchEntryName", "setBatchEntryName", "batchEntryName", "e", "getBatchEntryDependsOn", "setBatchEntryDependsOn", "batchEntryDependsOn", "Z", "getBatchEntryOmitResultOnSuccess", "()Z", "setBatchEntryOmitResultOnSuccess", "(Z)V", "batchEntryOmitResultOnSuccess", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "getParameters", "()Landroid/os/Bundle;", "setParameters", "(Landroid/os/Bundle;)V", "parameters", "Ljava/lang/Object;", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "tag", "getVersion", "setVersion", "version", "Lcom/facebook/GraphRequest$Callback;", "callback", "Lcom/facebook/GraphRequest$Callback;", "getCallback", "()Lcom/facebook/GraphRequest$Callback;", "setCallback", "(Lcom/facebook/GraphRequest$Callback;)V", "Lcom/facebook/HttpMethod;", "value", hl.k, "Lcom/facebook/HttpMethod;", "getHttpMethod", "()Lcom/facebook/HttpMethod;", "setHttpMethod", "(Lcom/facebook/HttpMethod;)V", "httpMethod", "l", "m", "forceApplicationRequest", GoogleApiAvailabilityLight.b, "overriddenURL", "graphPathWithVersion", "getRelativeUrlForBatchedRequest", "relativeUrlForBatchedRequest", "getUrlForSingleRequest", "urlForSingleRequest", "<init>", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;Ljava/lang/String;)V", "Ljava/net/URL;", "(Lcom/facebook/AccessToken;Ljava/net/URL;)V", "Companion", "Callback", "GraphJSONArrayCallback", "GraphJSONObjectCallback", "OnProgressCallback", "ParcelableResourceWithMimeType", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class GraphRequest {
    private static final String A = "sdk";

    @NotNull
    public static final String ACCESS_TOKEN_PARAM = "access_token";
    private static final String B = "android";
    private static final String C = "name";
    private static final String D = "omit_response_on_success";
    private static final String E = "depends_on";
    private static final String F = "batch_app_id";

    @NotNull
    public static final String FIELDS_PARAM = "fields";
    private static final String G = "relative_url";
    private static final String H = "body";
    private static final String I = "method";
    private static final String J = "batch";
    private static final String K = "file";
    private static final String L = "attached_files";
    private static final String M = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final int MAXIMUM_BATCH_SIZE = 50;
    private static final String N = "debug";
    private static final String O = "info";
    private static final String P = "warning";
    private static final String Q = "__debug__";
    private static final String R = "messages";
    private static final String S = "message";
    private static final String T = "type";
    private static final String U = "link";
    private static final String V = "picture";
    private static final String W = "caption";
    private static final String X;
    private static String Y = null;
    private static final Pattern Z;
    private static volatile String a0 = null;
    private static final String o = "/videos";
    private static final String p = "me";
    private static final String q = "me/friends";
    private static final String r = "me/photos";
    private static final String s = "search";
    private static final String t = "FBAndroidSDK";
    private static final String u = "User-Agent";
    private static final String v = "Content-Type";
    private static final String w = "Accept-Language";
    private static final String x = "Content-Encoding";
    private static final String y = "format";
    private static final String z = "json";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private AccessToken accessToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String graphPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private JSONObject graphObject;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String batchEntryName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String batchEntryDependsOn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean batchEntryOmitResultOnSuccess;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private Bundle parameters;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Object tag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String version;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Callback callback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private HttpMethod httpMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean skipClientToken;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean forceApplicationRequest;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String overriddenURL;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final String TAG = GraphRequest.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequest$Callback;", "", "Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        void onCompleted(@NotNull GraphResponse response);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b¨\u0001\u0010\u009f\u0001J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J:\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J \u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000bH\u0002J \u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010(\u001a\u00020'H\u0002J$\u0010-\u001a\u00020\u000f2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u001e\u001a\u00020&H\u0002J2\u00100\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020&2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020'0.2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+0/H\u0002J\u0010\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020\tH\u0002J\u0012\u00103\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u00104\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u00105\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0002J\n\u00106\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u00108\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u00010\u0002H\u0007J&\u0010>\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010;\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010<H\u0007J\u001c\u0010@\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010=\u001a\u0004\u0018\u00010?H\u0007J0\u0010A\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010=\u001a\u0004\u0018\u00010<H\u0007J\u001c\u0010C\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010=\u001a\u0004\u0018\u00010BH\u0007J&\u0010D\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010<H\u0007J@\u0010J\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010G\u001a\u00020\u00142\u0006\u0010H\u001a\u00020\u00142\b\u0010I\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010BH\u0007JD\u0010O\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010M\u001a\u0004\u0018\u00010\u00022\b\u0010N\u001a\u0004\u0018\u00010$2\b\u0010=\u001a\u0004\u0018\u00010<H\u0007JD\u0010O\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010M\u001a\u0004\u0018\u00010\u00022\b\u0010N\u001a\u0004\u0018\u00010$2\b\u0010=\u001a\u0004\u0018\u00010<H\u0007JB\u0010O\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010S\u001a\u00020R2\b\u0010M\u001a\u0004\u0018\u00010\u00022\b\u0010N\u001a\u0004\u0018\u00010$2\b\u0010=\u001a\u0004\u0018\u00010<H\u0007J.\u0010V\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010U\u001a\u00020T2\b\u00107\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010<H\u0007J$\u0010V\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010U\u001a\u00020T2\b\u0010=\u001a\u0004\u0018\u00010<H\u0007J#\u0010X\u001a\u00020\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0W\"\u00020'H\u0007¢\u0006\u0004\bX\u0010YJ\u0016\u0010X\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020'0.H\u0007J\u0010\u0010X\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010[\u001a\u00020Z2\u0006\u0010(\u001a\u00020'H\u0007J)\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0\\2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0W\"\u00020'H\u0007¢\u0006\u0004\b]\u0010^J\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0\\2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020'0.H\u0007J\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0\\2\u0006\u0010\n\u001a\u00020\tH\u0007J#\u0010`\u001a\u00020_2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0W\"\u00020'H\u0007¢\u0006\u0004\b`\u0010aJ\u0016\u0010`\u001a\u00020_2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020'0.H\u0007J\u0010\u0010`\u001a\u00020_2\u0006\u0010\n\u001a\u00020\tH\u0007J$\u0010b\u001a\b\u0012\u0004\u0012\u00020Z0\\2\u0006\u0010\r\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020'0.H\u0007J\u001e\u0010b\u001a\b\u0012\u0004\u0012\u00020Z0\\2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010c\u001a\u00020_2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\"\u0010c\u001a\u00020_2\b\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J%\u0010i\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020Z0\\H\u0001¢\u0006\u0004\bg\u0010hJ\u0017\u0010l\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\bj\u0010kJ\u001f\u0010o\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0004\bm\u0010nR\u0016\u0010r\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR$\u0010s\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010q\"\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bx\u0010tR\u0016\u0010y\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\by\u0010tR\u0016\u0010z\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010tR\u0016\u0010{\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b{\u0010tR\u0016\u0010|\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010tR\u0016\u0010}\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010tR\u0016\u0010~\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010tR\u0016\u0010\u007f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u007f\u0010tR\u0018\u0010\u0080\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010tR\u0018\u0010\u0081\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010tR\u0018\u0010\u0082\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010tR\u0018\u0010\u0083\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010tR\u0018\u0010\u0084\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010tR\u0018\u0010\u0085\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010tR\u0018\u0010\u0086\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010tR\u0018\u0010\u0087\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010tR\u0018\u0010\u0088\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010tR\u0018\u0010\u0089\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010tR\u0018\u0010\u008a\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010tR\u0018\u0010\u008b\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010tR\u0018\u0010\u008c\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010tR\u0018\u0010\u008d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010tR\u0018\u0010\u008e\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010tR\u0018\u0010\u008f\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010tR\u0018\u0010\u0090\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010tR\u0018\u0010\u0091\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010tR\u0018\u0010\u0092\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010tR\u0019\u0010\u0093\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086T¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010tR\u0018\u0010\u0096\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010tR\u0018\u0010\u0097\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010tR\u0018\u0010\u0098\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010tR\u0018\u0010\u0099\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010tR\u0018\u0010\u009a\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010tR\u0018\u0010\u009b\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010tR\u0018\u0010\u009c\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010tR \u0010\u009d\u0001\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010t\u0012\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010 \u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b \u0001\u0010tR\u0018\u0010¡\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b¡\u0001\u0010tR\u0018\u0010¢\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b¢\u0001\u0010tR\u001a\u0010£\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b£\u0001\u0010tR$\u0010¦\u0001\u001a\r ¥\u0001*\u0005\u0018\u00010¤\u00010¤\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001¨\u0006©\u0001"}, d2 = {"Lcom/facebook/GraphRequest$Companion;", "", "", "graphPath", "c", "Ljava/net/URL;", "url", "Ljava/net/HttpURLConnection;", "a", "Lcom/facebook/GraphRequestBatch;", "requests", "", "f", AbsEsimOperation.HEADER_CONNECTION, "shouldUseGzip", "", "r", "g", "Lcom/facebook/internal/Logger;", "logger", "", "numRequests", "Ljava/io/OutputStream;", "outputStream", GoogleApiAvailabilityLight.b, "path", "h", "Lorg/json/JSONObject;", "graphObject", "Lcom/facebook/GraphRequest$b;", "serializer", "l", "key", "value", "passByValue", "m", "Landroid/os/Bundle;", "bundle", "Lcom/facebook/GraphRequest$c;", "Lcom/facebook/GraphRequest;", "request", com.google.android.exoplayer2.text.ttml.b.r, "", "Lcom/facebook/GraphRequest$a;", "attachments", "o", "", "", DTransferConstants.SEARCH_KEY, "batch", "b", "i", z.j, hl.k, "getDefaultBatchApplicationId", "applicationId", "setDefaultBatchApplicationId", "Lcom/facebook/AccessToken;", "accessToken", "id", "Lcom/facebook/GraphRequest$Callback;", "callback", "newDeleteObjectRequest", "Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "newMeRequest", "newPostRequest", "Lcom/facebook/GraphRequest$GraphJSONArrayCallback;", "newMyFriendsRequest", "newGraphPathRequest", "Landroid/location/Location;", "location", "radiusInMeters", "resultsLimit", "searchText", "newPlacesSearchRequest", "Landroid/graphics/Bitmap;", "image", "caption", "params", "newUploadPhotoRequest", "Ljava/io/File;", "file", "Landroid/net/Uri;", "photoUri", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "newCustomAudienceThirdPartyIdRequest", "", "toHttpConnection", "([Lcom/facebook/GraphRequest;)Ljava/net/HttpURLConnection;", "Lcom/facebook/GraphResponse;", "executeAndWait", "", "executeBatchAndWait", "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "Lcom/facebook/GraphRequestAsyncTask;", "executeBatchAsync", "([Lcom/facebook/GraphRequest;)Lcom/facebook/GraphRequestAsyncTask;", "executeConnectionAndWait", "executeConnectionAsync", "Landroid/os/Handler;", "callbackHandler", "responses", "runCallbacks$facebook_core_release", "(Lcom/facebook/GraphRequestBatch;Ljava/util/List;)V", "runCallbacks", "validateFieldsParamForGetRequests$facebook_core_release", "(Lcom/facebook/GraphRequestBatch;)V", "validateFieldsParamForGetRequests", "serializeToUrlConnection$facebook_core_release", "(Lcom/facebook/GraphRequestBatch;Ljava/net/HttpURLConnection;)V", "serializeToUrlConnection", GoogleApiAvailabilityLight.a, "()Ljava/lang/String;", "mimeContentType", "userAgent", "Ljava/lang/String;", "e", SOAP.XMLNS, "(Ljava/lang/String;)V", "ACCEPT_LANGUAGE_HEADER", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "MAXIMUM_BATCH_SIZE", LogUtil.I, "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", ViewHierarchyConstants.SEARCH, "TAG", "getTAG$facebook_core_release$annotations", "()V", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "versionPattern", "Ljava/util/regex/Pattern;", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "(Lcom/facebook/GraphResponse;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a implements Callback {
            public final /* synthetic */ GraphJSONObjectCallback a;

            public a(GraphJSONObjectCallback graphJSONObjectCallback) {
                this.a = graphJSONObjectCallback;
            }

            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(@NotNull GraphResponse graphResponse) {
                GraphJSONObjectCallback graphJSONObjectCallback = this.a;
                if (graphJSONObjectCallback != null) {
                    graphJSONObjectCallback.onCompleted(graphResponse.getGraphObject(), graphResponse);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "(Lcom/facebook/GraphResponse;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b implements Callback {
            public final /* synthetic */ GraphJSONArrayCallback a;

            public b(GraphJSONArrayCallback graphJSONArrayCallback) {
                this.a = graphJSONArrayCallback;
            }

            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(@NotNull GraphResponse graphResponse) {
                if (this.a != null) {
                    JSONObject graphObject = graphResponse.getGraphObject();
                    this.a.onCompleted(graphObject != null ? graphObject.optJSONArray("data") : null, graphResponse);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c implements Runnable {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ GraphRequestBatch b;

            public c(ArrayList arrayList, GraphRequestBatch graphRequestBatch) {
                this.a = arrayList;
                this.b = graphRequestBatch;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    for (Pair pair : this.a) {
                        ((Callback) pair.first).onCompleted((GraphResponse) pair.second);
                    }
                    Iterator<GraphRequestBatch.Callback> it2 = this.b.getCallbacks().iterator();
                    while (it2.hasNext()) {
                        it2.next().onBatchCompleted(this.b);
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        private Companion() {
        }

        private final HttpURLConnection a(URL url) throws IOException {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            Objects.requireNonNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty("User-Agent", e());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String b(GraphRequestBatch batch) {
            String batchApplicationId = batch.getBatchApplicationId();
            if (batchApplicationId != null && (!batch.isEmpty())) {
                return batchApplicationId;
            }
            Iterator<GraphRequest> it2 = batch.iterator();
            while (it2.hasNext()) {
                AccessToken accessToken = it2.next().getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            String str = GraphRequest.Y;
            if (str != null) {
                if (str.length() > 0) {
                    return str;
                }
            }
            return FacebookSdk.getApplicationId();
        }

        private final String c(String graphPath) {
            return graphPath != null ? graphPath : "me/photos";
        }

        private final String d() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.X}, 1));
        }

        private final String e() {
            if (GraphRequest.a0 == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                GraphRequest.a0 = String.format("%s.%s", Arrays.copyOf(new Object[]{GraphRequest.t, FacebookSdkVersion.BUILD}, 2));
                String customUserAgent = InternalSettings.getCustomUserAgent();
                if (!Utility.isNullOrEmpty(customUserAgent)) {
                    GraphRequest.a0 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.a0, customUserAgent}, 2));
                }
            }
            return GraphRequest.a0;
        }

        private final boolean f(GraphRequestBatch requests) {
            Iterator<GraphRequestBatch.Callback> it2 = requests.getCallbacks().iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof GraphRequestBatch.OnProgressCallback) {
                    return true;
                }
            }
            Iterator<GraphRequest> it3 = requests.iterator();
            while (it3.hasNext()) {
                if (it3.next().getCallback() instanceof OnProgressCallback) {
                    return true;
                }
            }
            return false;
        }

        private final boolean g(GraphRequestBatch requests) {
            for (GraphRequest graphRequest : requests) {
                Iterator<String> it2 = graphRequest.getParameters().keySet().iterator();
                while (it2.hasNext()) {
                    if (i(graphRequest.getParameters().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getTAG$facebook_core_release$annotations() {
        }

        private final boolean h(String path) {
            Matcher matcher = GraphRequest.Z.matcher(path);
            if (matcher.matches()) {
                path = matcher.group(1);
            }
            return m.startsWith$default(path, "me/", false, 2, null) || m.startsWith$default(path, "/me/", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean i(Object value) {
            return (value instanceof Bitmap) || (value instanceof byte[]) || (value instanceof Uri) || (value instanceof ParcelFileDescriptor) || (value instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(Object value) {
            return (value instanceof String) || (value instanceof Boolean) || (value instanceof Number) || (value instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String k(Object value) {
            if (value instanceof String) {
                return (String) value;
            }
            if ((value instanceof Boolean) || (value instanceof Number)) {
                return value.toString();
            }
            if (value instanceof Date) {
                return new SimpleDateFormat(GraphRequest.M, Locale.US).format((Date) value);
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        public final void l(JSONObject graphObject, String path, b serializer) {
            boolean z;
            if (h(path)) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) path, ":", 0, false, 6, (Object) null);
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) path, "?", 0, false, 6, (Object) null);
                if (iIndexOf$default <= 3 || (iIndexOf$default2 != -1 && iIndexOf$default >= iIndexOf$default2)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            Iterator<String> itKeys = graphObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                m(next, graphObject.opt(next), serializer, z && m.equals(next, "image", true));
            }
        }

        private final void m(String key, Object value, b serializer, boolean passByValue) {
            Class<?> cls = value.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) value;
                if (passByValue) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        m(String.format("%s[%s]", Arrays.copyOf(new Object[]{key, next}, 2)), jSONObject.opt(next), serializer, passByValue);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    m(key, jSONObject.optString("id"), serializer, passByValue);
                    return;
                } else if (jSONObject.has("url")) {
                    m(key, jSONObject.optString("url"), serializer, passByValue);
                    return;
                } else {
                    if (jSONObject.has(NativeProtocol.OPEN_GRAPH_CREATE_OBJECT_KEY)) {
                        m(key, jSONObject.toString(), serializer, passByValue);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) value;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    m(String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{key, Integer.valueOf(i)}, 2)), jSONArray.opt(i), serializer, passByValue);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
                serializer.writeString(key, value.toString());
            } else if (Date.class.isAssignableFrom(cls)) {
                serializer.writeString(key, new SimpleDateFormat(GraphRequest.M, Locale.US).format((Date) value));
            }
        }

        private final void n(GraphRequestBatch requests, Logger logger, int numRequests, URL url, OutputStream outputStream, boolean shouldUseGzip) throws JSONException, IOException {
            c cVar = new c(outputStream, logger, shouldUseGzip);
            if (numRequests != 1) {
                String strB = b(requests);
                if (strB.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                cVar.writeString(GraphRequest.F, strB);
                HashMap map = new HashMap();
                q(cVar, requests, map);
                if (logger != null) {
                    logger.append("  Attachments:\n");
                }
                o(map, cVar);
                return;
            }
            GraphRequest graphRequest = requests.get(0);
            HashMap map2 = new HashMap();
            for (String str : graphRequest.getParameters().keySet()) {
                Object obj = graphRequest.getParameters().get(str);
                if (i(obj)) {
                    map2.put(str, new a(graphRequest, obj));
                }
            }
            if (logger != null) {
                logger.append("  Parameters:\n");
            }
            p(graphRequest.getParameters(), cVar, graphRequest);
            if (logger != null) {
                logger.append("  Attachments:\n");
            }
            o(map2, cVar);
            JSONObject graphObject = graphRequest.getGraphObject();
            if (graphObject != null) {
                l(graphObject, url.getPath(), cVar);
            }
        }

        private final void o(Map<String, a> attachments, c serializer) throws IOException {
            for (Map.Entry<String, a> entry : attachments.entrySet()) {
                if (GraphRequest.INSTANCE.i(entry.getValue().getValue())) {
                    serializer.i(entry.getKey(), entry.getValue().getValue(), entry.getValue().getRequest());
                }
            }
        }

        private final void p(Bundle bundle, c serializer, GraphRequest request) throws IOException {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (j(obj)) {
                    serializer.i(str, obj, request);
                }
            }
        }

        private final void q(c serializer, Collection<GraphRequest> requests, Map<String, a> attachments) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it2 = requests.iterator();
            while (it2.hasNext()) {
                it2.next().i(jSONArray, attachments);
            }
            serializer.k("batch", jSONArray, requests);
        }

        private final void r(HttpURLConnection connection, boolean shouldUseGzip) {
            if (!shouldUseGzip) {
                connection.setRequestProperty("Content-Type", d());
            } else {
                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                connection.setRequestProperty("Content-Encoding", AsyncHttpClient.ENCODING_GZIP);
            }
        }

        private final void s(String str) {
            GraphRequest.a0 = str;
        }

        @JvmStatic
        @NotNull
        public final GraphResponse executeAndWait(@NotNull GraphRequest request) {
            List<GraphResponse> listExecuteBatchAndWait = executeBatchAndWait(request);
            if (listExecuteBatchAndWait.size() == 1) {
                return listExecuteBatchAndWait.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequest... requests) {
            return executeBatchAndWait(ArraysKt___ArraysKt.toList(requests));
        }

        @JvmStatic
        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequest... requests) {
            return executeBatchAsync(ArraysKt___ArraysKt.toList(requests));
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection connection, @NotNull Collection<GraphRequest> requests) {
            return executeConnectionAndWait(connection, new GraphRequestBatch(requests));
        }

        @JvmStatic
        @NotNull
        public final GraphRequestAsyncTask executeConnectionAsync(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            return executeConnectionAsync(null, connection, requests);
        }

        @JvmStatic
        @Nullable
        public final String getDefaultBatchApplicationId() {
            return GraphRequest.Y;
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable String applicationId, @Nullable Callback callback) {
            if (applicationId == null && accessToken != null) {
                applicationId = accessToken.getApplicationId();
            }
            if (applicationId == null) {
                applicationId = Utility.getMetadataApplicationId(context);
            }
            if (applicationId == null) {
                throw new FacebookException("Facebook App ID cannot be determined");
            }
            String str = applicationId + "/custom_audience_third_party_id";
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(context);
            Bundle bundle = new Bundle();
            if (accessToken == null) {
                if (attributionIdentifiers == null) {
                    throw new FacebookException("There is no access token and attribution identifiers could not be retrieved");
                }
                String attributionId = attributionIdentifiers.getAttributionId() != null ? attributionIdentifiers.getAttributionId() : attributionIdentifiers.getAndroidAdvertiserId();
                if (attributionIdentifiers.getAttributionId() != null) {
                    bundle.putString("udid", attributionId);
                }
            }
            if (FacebookSdk.getLimitEventAndDataUsage(context) || (attributionIdentifiers != null && attributionIdentifiers.getIsTrackingLimited())) {
                bundle.putString("limit_event_usage", "1");
            }
            return new GraphRequest(accessToken, str, bundle, HttpMethod.GET, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newDeleteObjectRequest(@Nullable AccessToken accessToken, @Nullable String id, @Nullable Callback callback) {
            return new GraphRequest(accessToken, id, null, HttpMethod.DELETE, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newGraphPathRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable Callback callback) {
            return new GraphRequest(accessToken, graphPath, null, null, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newMeRequest(@Nullable AccessToken accessToken, @Nullable GraphJSONObjectCallback callback) {
            return new GraphRequest(accessToken, "me", null, null, new a(callback), null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newMyFriendsRequest(@Nullable AccessToken accessToken, @Nullable final GraphJSONArrayCallback callback) {
            return new GraphRequest(accessToken, GraphRequest.q, null, null, new Callback() { // from class: com.facebook.GraphRequest$Companion$newMyFriendsRequest$wrapper$1
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(@NotNull GraphResponse response) {
                    if (callback != null) {
                        JSONObject graphObject = response.getGraphObject();
                        callback.onCompleted(graphObject != null ? graphObject.optJSONArray("data") : null, response);
                    }
                }
            }, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newPlacesSearchRequest(@Nullable AccessToken accessToken, @Nullable Location location, int radiusInMeters, int resultsLimit, @Nullable String searchText, @Nullable GraphJSONArrayCallback callback) {
            if (location == null && Utility.isNullOrEmpty(searchText)) {
                throw new FacebookException("Either location or searchText must be specified.");
            }
            Bundle bundle = new Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt("limit", resultsLimit);
            if (location != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                bundle.putString(com.google.android.exoplayer2.text.ttml.b.m0, String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2)));
                bundle.putInt("distance", radiusInMeters);
            }
            if (!Utility.isNullOrEmpty(searchText)) {
                bundle.putString(DTransferConstants.SEARCH_KEY, searchText);
            }
            return new GraphRequest(accessToken, "search", bundle, HttpMethod.GET, new b(callback), null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newPostRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable JSONObject graphObject, @Nullable Callback callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, graphPath, null, HttpMethod.POST, callback, null, 32, null);
            graphRequest.setGraphObject(graphObject);
            return graphRequest;
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable Bitmap image, @Nullable String caption, @Nullable Bundle params, @Nullable Callback callback) {
            String strC = c(graphPath);
            Bundle bundle = new Bundle();
            if (params != null) {
                bundle.putAll(params);
            }
            bundle.putParcelable("picture", image);
            if (caption != null) {
                if (caption.length() > 0) {
                    bundle.putString("caption", caption);
                }
            }
            return new GraphRequest(accessToken, strC, bundle, HttpMethod.POST, callback, null, 32, null);
        }

        @JvmStatic
        public final void runCallbacks$facebook_core_release(@NotNull GraphRequestBatch requests, @NotNull List<GraphResponse> responses) {
            int size = requests.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                GraphRequest graphRequest = requests.get(i);
                if (graphRequest.getCallback() != null) {
                    arrayList.add(new Pair(graphRequest.getCallback(), responses.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                c cVar = new c(arrayList, requests);
                Handler callbackHandler = requests.getCallbackHandler();
                if (callbackHandler != null) {
                    callbackHandler.post(cVar);
                } else {
                    cVar.run();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
        @JvmStatic
        public final void serializeToUrlConnection$facebook_core_release(@NotNull GraphRequestBatch requests, @NotNull HttpURLConnection connection) throws Throwable {
            OutputStream progressOutputStream;
            Logger logger = new Logger(LoggingBehavior.REQUESTS, "Request");
            int size = requests.size();
            boolean zG = g(requests);
            OutputStream gZIPOutputStream = null;
            HttpMethod httpMethod = size == 1 ? requests.get(0).getHttpMethod() : null;
            if (httpMethod == null) {
                httpMethod = HttpMethod.POST;
            }
            connection.setRequestMethod(httpMethod.name());
            r(connection, zG);
            URL url = connection.getURL();
            logger.append("Request:\n");
            logger.appendKeyValue("Id", requests.getId());
            logger.appendKeyValue(DTransferConstants.URL, url);
            logger.appendKeyValue("Method", connection.getRequestMethod());
            logger.appendKeyValue("User-Agent", connection.getRequestProperty("User-Agent"));
            logger.appendKeyValue("Content-Type", connection.getRequestProperty("Content-Type"));
            connection.setConnectTimeout(requests.getTimeoutInMilliseconds());
            connection.setReadTimeout(requests.getTimeoutInMilliseconds());
            if (!(httpMethod == HttpMethod.POST)) {
                logger.log();
                return;
            }
            connection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (zG) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = bufferedOutputStream;
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                if (f(requests)) {
                    ProgressNoopOutputStream progressNoopOutputStream = new ProgressNoopOutputStream(requests.getCallbackHandler());
                    n(requests, null, size, url, progressNoopOutputStream, zG);
                    progressOutputStream = new ProgressOutputStream(gZIPOutputStream, requests, progressNoopOutputStream.getProgressMap(), progressNoopOutputStream.getMaxProgress());
                } else {
                    progressOutputStream = gZIPOutputStream;
                }
                try {
                    n(requests, logger, size, url, progressOutputStream, zG);
                    progressOutputStream.close();
                    logger.log();
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = progressOutputStream;
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @JvmStatic
        public final void setDefaultBatchApplicationId(@Nullable String applicationId) {
            GraphRequest.Y = applicationId;
        }

        @JvmStatic
        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull GraphRequest... requests) {
            return toHttpConnection(ArraysKt___ArraysKt.toList(requests));
        }

        @JvmStatic
        public final void validateFieldsParamForGetRequests$facebook_core_release(@NotNull GraphRequestBatch requests) {
            for (GraphRequest graphRequest : requests) {
                if (HttpMethod.GET == graphRequest.getHttpMethod() && Utility.isNullOrEmpty(graphRequest.getParameters().getString(GraphRequest.FIELDS_PARAM))) {
                    Logger.Companion companion = Logger.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    StringBuilder sb = new StringBuilder();
                    sb.append("GET requests for /");
                    String graphPath = graphRequest.getGraphPath();
                    if (graphPath == null) {
                        graphPath = "";
                    }
                    sb.append(graphPath);
                    sb.append(" should contain an explicit \"fields\" parameter.");
                    companion.log(loggingBehavior, 5, "Request", sb.toString());
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull Collection<GraphRequest> requests) {
            return executeBatchAndWait(new GraphRequestBatch(requests));
        }

        @JvmStatic
        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull Collection<GraphRequest> requests) {
            return executeBatchAsync(new GraphRequestBatch(requests));
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            List<GraphResponse> listFromHttpConnection$facebook_core_release = GraphResponse.INSTANCE.fromHttpConnection$facebook_core_release(connection, requests);
            Utility.disconnectQuietly(connection);
            int size = requests.size();
            if (size != listFromHttpConnection$facebook_core_release.size()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listFromHttpConnection$facebook_core_release.size()), Integer.valueOf(size)}, 2)));
            }
            runCallbacks$facebook_core_release(requests, listFromHttpConnection$facebook_core_release);
            AccessTokenManager.INSTANCE.getInstance().extendAccessTokenIfNeeded();
            return listFromHttpConnection$facebook_core_release;
        }

        @JvmStatic
        @NotNull
        public final GraphRequestAsyncTask executeConnectionAsync(@Nullable Handler callbackHandler, @NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(connection, requests);
            requests.setCallbackHandler(callbackHandler);
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        @JvmStatic
        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull Collection<GraphRequest> requests) {
            Validate.notEmpty(requests, "requests");
            return toHttpConnection(new GraphRequestBatch(requests));
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequestBatch requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpConnection;
            List<GraphResponse> listExecuteConnectionAndWait;
            Validate.notEmptyAndContainsNoNulls(requests, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpConnection = toHttpConnection(requests);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpConnection = null;
            } catch (Throwable th) {
                th = th;
                Utility.disconnectQuietly(httpURLConnection);
                throw th;
            }
            try {
                if (httpConnection != null) {
                    listExecuteConnectionAndWait = executeConnectionAndWait(httpConnection, requests);
                } else {
                    List<GraphResponse> listConstructErrorResponses = GraphResponse.INSTANCE.constructErrorResponses(requests.getRequests(), null, new FacebookException(exc));
                    runCallbacks$facebook_core_release(requests, listConstructErrorResponses);
                    listExecuteConnectionAndWait = listConstructErrorResponses;
                }
                Utility.disconnectQuietly(httpConnection);
                return listExecuteConnectionAndWait;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpConnection;
                Utility.disconnectQuietly(httpURLConnection);
                throw th;
            }
        }

        @JvmStatic
        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequestBatch requests) {
            Validate.notEmptyAndContainsNoNulls(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(requests);
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        @JvmStatic
        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull GraphRequestBatch requests) throws Throwable {
            URL url;
            validateFieldsParamForGetRequests$facebook_core_release(requests);
            try {
                if (requests.size() == 1) {
                    url = new URL(requests.get(0).getUrlForSingleRequest());
                } else {
                    url = new URL(ServerProtocol.getGraphUrlBase());
                }
                HttpURLConnection httpURLConnectionA = null;
                try {
                    httpURLConnectionA = a(url);
                    serializeToUrlConnection$facebook_core_release(requests, httpURLConnectionA);
                    return httpURLConnectionA;
                } catch (IOException e) {
                    Utility.disconnectQuietly(httpURLConnectionA);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    Utility.disconnectQuietly(httpURLConnectionA);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable File file, @Nullable String caption, @Nullable Bundle params, @Nullable Callback callback) throws FileNotFoundException {
            String strC = c(graphPath);
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
            Bundle bundle = new Bundle();
            if (params != null) {
                bundle.putAll(params);
            }
            bundle.putParcelable("picture", parcelFileDescriptorOpen);
            if (caption != null) {
                if (caption.length() > 0) {
                    bundle.putString("caption", caption);
                }
            }
            return new GraphRequest(accessToken, strC, bundle, HttpMethod.POST, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable Callback callback) {
            return newCustomAudienceThirdPartyIdRequest(accessToken, context, null, callback);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @NotNull Uri photoUri, @Nullable String caption, @Nullable Bundle params, @Nullable Callback callback) throws FileNotFoundException {
            String strC = c(graphPath);
            if (Utility.isFileUri(photoUri)) {
                return newUploadPhotoRequest(accessToken, strC, new File(photoUri.getPath()), caption, params, callback);
            }
            if (Utility.isContentUri(photoUri)) {
                Bundle bundle = new Bundle();
                if (params != null) {
                    bundle.putAll(params);
                }
                bundle.putParcelable("picture", photoUri);
                if (caption != null) {
                    if (caption.length() > 0) {
                        bundle.putString("caption", caption);
                    }
                }
                return new GraphRequest(accessToken, strC, bundle, HttpMethod.POST, callback, null, 32, null);
            }
            throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONArrayCallback;", "", "Lorg/json/JSONArray;", Configs.Params.OBJECTS, "Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface GraphJSONArrayCallback {
        void onCompleted(@Nullable JSONArray objects, @Nullable GraphResponse response);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "", "Lorg/json/JSONObject;", IconCompat.EXTRA_OBJ, "Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface GraphJSONObjectCallback {
        void onCompleted(@Nullable JSONObject obj, @Nullable GraphResponse response);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$OnProgressCallback;", "Lcom/facebook/GraphRequest$Callback;", "", "current", "max", "", "onProgress", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface OnProgressCallback extends Callback {
        void onProgress(long current, long max);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \u0019*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00028\u0000\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "", "describeContents", "Landroid/os/Parcel;", Argument.OUT, DataCacher.j, "", "writeToParcel", "", "a", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "mimeType", "b", "Landroid/os/Parcelable;", "getResource", "()Landroid/os/Parcelable;", "resource", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "source", "(Landroid/os/Parcel;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private final String mimeType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final RESOURCE resource;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new Parcelable.Creator<ParcelableResourceWithMimeType<?>>() { // from class: com.facebook.GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public GraphRequest.ParcelableResourceWithMimeType<?> createFromParcel(@NotNull Parcel source) {
                return new GraphRequest.ParcelableResourceWithMimeType<>(source, (DefaultConstructorMarker) null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public GraphRequest.ParcelableResourceWithMimeType<?>[] newArray(int size) {
                return new GraphRequest.ParcelableResourceWithMimeType[size];
            }
        };

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Nullable
        public final String getMimeType() {
            return this.mimeType;
        }

        @Nullable
        public final RESOURCE getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, flags);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, @Nullable String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"com/facebook/GraphRequest$a", "", "Lcom/facebook/GraphRequest;", "a", "Lcom/facebook/GraphRequest;", "()Lcom/facebook/GraphRequest;", "request", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final GraphRequest request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final Object value;

        public a(@NotNull GraphRequest graphRequest, @Nullable Object obj) {
            this.request = graphRequest;
            this.value = obj;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final GraphRequest getRequest() {
            return this.request;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"com/facebook/GraphRequest$b", "", "", "key", "value", "", "writeString", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface b {
        void writeString(@NotNull String key, @NotNull String value);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010/\u001a\u00020-\u0012\b\u00102\u001a\u0004\u0018\u000100\u0012\u0006\u0010,\u001a\u00020(¢\u0006\u0004\b7\u00108J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J \u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u001d\u001a\u00020\bJ$\u0010!\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0002J-\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00022\u0016\u0010$\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040#\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J-\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00022\u0016\u0010$\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040#\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u001a\u00106\u001a\u000603j\u0002`48B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u00105¨\u00069"}, d2 = {"com/facebook/GraphRequest$c", "Lcom/facebook/GraphRequest$b;", "", "key", "", "value", "Lcom/facebook/GraphRequest;", "request", "", "i", "Lorg/json/JSONArray;", "requestJsonArray", "", "requests", hl.k, "writeString", "Landroid/graphics/Bitmap;", "bitmap", "c", "", HTTP.CONTENT_RANGE_BYTES, GoogleApiAvailabilityLight.a, "Landroid/net/Uri;", "contentUri", "mimeType", "f", "Landroid/os/ParcelFileDescriptor;", "descriptor", "g", z.j, "name", FileDownloadModel.FILENAME, CameraActivity.KEY_CONTENT_TYPE, "e", "format", "", "args", "b", "(Ljava/lang/String;[Ljava/lang/Object;)V", "h", "", "a", "Z", "firstWrite", "useUrlEncode", "Ljava/io/OutputStream;", "Ljava/io/OutputStream;", "outputStream", "Lcom/facebook/internal/Logger;", "Lcom/facebook/internal/Logger;", "logger", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()Ljava/lang/RuntimeException;", "invalidTypeError", "<init>", "(Ljava/io/OutputStream;Lcom/facebook/internal/Logger;Z)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean firstWrite = true;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean useUrlEncode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final OutputStream outputStream;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Logger logger;

        public c(@NotNull OutputStream outputStream, @Nullable Logger logger, boolean z) {
            this.outputStream = outputStream;
            this.logger = logger;
            this.useUrlEncode = z;
        }

        private final RuntimeException a() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void b(@NotNull String format, @NotNull Object... args) throws IOException {
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String strEncode = URLEncoder.encode(String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "UTF-8");
                Charset charset = Charsets.UTF_8;
                Objects.requireNonNull(strEncode, "null cannot be cast to non-null type java.lang.String");
                outputStream.write(strEncode.getBytes(charset));
                return;
            }
            if (this.firstWrite) {
                OutputStream outputStream2 = this.outputStream;
                Charset charset2 = Charsets.UTF_8;
                outputStream2.write("--".getBytes(charset2));
                OutputStream outputStream3 = this.outputStream;
                String str = GraphRequest.X;
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                outputStream3.write(str.getBytes(charset2));
                this.outputStream.write("\r\n".getBytes(charset2));
                this.firstWrite = false;
            }
            OutputStream outputStream4 = this.outputStream;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            String str2 = String.format(format, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            Charset charset3 = Charsets.UTF_8;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            outputStream4.write(str2.getBytes(charset3));
        }

        public final void c(@NotNull String key, @NotNull Bitmap bitmap) throws IOException {
            e(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
            h("", new Object[0]);
            j();
            Logger logger = this.logger;
            if (logger != null) {
                logger.appendKeyValue("    " + key, "<Image>");
            }
        }

        public final void d(@NotNull String key, @NotNull byte[] bytes) throws IOException {
            e(key, key, "content/unknown");
            this.outputStream.write(bytes);
            h("", new Object[0]);
            j();
            Logger logger = this.logger;
            if (logger != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                logger.appendKeyValue("    " + key, String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1)));
            }
        }

        public final void e(@Nullable String name, @Nullable String filename, @Nullable String contentType) throws IOException {
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%s=", Arrays.copyOf(new Object[]{name}, 1));
                Charset charset = Charsets.UTF_8;
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                outputStream.write(str.getBytes(charset));
                return;
            }
            b("Content-Disposition: form-data; name=\"%s\"", name);
            if (filename != null) {
                b("; filename=\"%s\"", filename);
            }
            h("", new Object[0]);
            if (contentType != null) {
                h("%s: %s", "Content-Type", contentType);
            }
            h("", new Object[0]);
        }

        public final void f(@NotNull String key, @NotNull Uri contentUri, @Nullable String mimeType) throws IOException {
            int iCopyAndCloseInputStream;
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            e(key, key, mimeType);
            if (this.outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) this.outputStream).addProgress(Utility.getContentSize(contentUri));
                iCopyAndCloseInputStream = 0;
            } else {
                iCopyAndCloseInputStream = Utility.copyAndCloseInputStream(FacebookSdk.getApplicationContext().getContentResolver().openInputStream(contentUri), this.outputStream) + 0;
            }
            h("", new Object[0]);
            j();
            Logger logger = this.logger;
            if (logger != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                logger.appendKeyValue("    " + key, String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iCopyAndCloseInputStream)}, 1)));
            }
        }

        public final void g(@NotNull String key, @NotNull ParcelFileDescriptor descriptor, @Nullable String mimeType) throws IOException {
            int iCopyAndCloseInputStream;
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            e(key, key, mimeType);
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) outputStream).addProgress(descriptor.getStatSize());
                iCopyAndCloseInputStream = 0;
            } else {
                iCopyAndCloseInputStream = Utility.copyAndCloseInputStream(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), this.outputStream) + 0;
            }
            h("", new Object[0]);
            j();
            Logger logger = this.logger;
            if (logger != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                logger.appendKeyValue("    " + key, String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iCopyAndCloseInputStream)}, 1)));
            }
        }

        public final void h(@NotNull String format, @NotNull Object... args) throws IOException {
            b(format, Arrays.copyOf(args, args.length));
            if (this.useUrlEncode) {
                return;
            }
            b("\r\n", new Object[0]);
        }

        public final void i(@NotNull String key, @Nullable Object value, @Nullable GraphRequest request) throws IOException {
            Closeable closeable = this.outputStream;
            if (closeable instanceof RequestOutputStream) {
                Objects.requireNonNull(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((RequestOutputStream) closeable).setCurrentRequest(request);
            }
            Companion companion = GraphRequest.INSTANCE;
            if (companion.j(value)) {
                writeString(key, companion.k(value));
                return;
            }
            if (value instanceof Bitmap) {
                c(key, (Bitmap) value);
                return;
            }
            if (value instanceof byte[]) {
                d(key, (byte[]) value);
                return;
            }
            if (value instanceof Uri) {
                f(key, (Uri) value, null);
                return;
            }
            if (value instanceof ParcelFileDescriptor) {
                g(key, (ParcelFileDescriptor) value, null);
                return;
            }
            if (!(value instanceof ParcelableResourceWithMimeType)) {
                throw a();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) value;
            Parcelable resource = parcelableResourceWithMimeType.getResource();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (resource instanceof ParcelFileDescriptor) {
                g(key, (ParcelFileDescriptor) resource, mimeType);
            } else {
                if (!(resource instanceof Uri)) {
                    throw a();
                }
                f(key, (Uri) resource, mimeType);
            }
        }

        public final void j() throws IOException {
            if (this.useUrlEncode) {
                this.outputStream.write(com.alipay.sdk.m.s.a.l.getBytes(Charsets.UTF_8));
            } else {
                h("--%s", GraphRequest.X);
            }
        }

        public final void k(@NotNull String key, @NotNull JSONArray requestJsonArray, @NotNull Collection<GraphRequest> requests) throws JSONException, IOException {
            Closeable closeable = this.outputStream;
            if (!(closeable instanceof RequestOutputStream)) {
                writeString(key, requestJsonArray.toString());
                return;
            }
            Objects.requireNonNull(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
            RequestOutputStream requestOutputStream = (RequestOutputStream) closeable;
            e(key, null, null);
            b("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : requests) {
                JSONObject jSONObject = requestJsonArray.getJSONObject(i);
                requestOutputStream.setCurrentRequest(graphRequest);
                if (i > 0) {
                    b(",%s", jSONObject.toString());
                } else {
                    b("%s", jSONObject.toString());
                }
                i++;
            }
            b("]", new Object[0]);
            Logger logger = this.logger;
            if (logger != null) {
                logger.appendKeyValue("    " + key, requestJsonArray.toString());
            }
        }

        @Override // com.facebook.GraphRequest.b
        public void writeString(@NotNull String key, @NotNull String value) throws IOException {
            e(key, null, null);
            h("%s", value);
            j();
            Logger logger = this.logger;
            if (logger != null) {
                logger.appendKeyValue("    " + key, value);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "(Lcom/facebook/GraphResponse;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d implements Callback {
        public final /* synthetic */ Callback a;

        public d(Callback callback) {
            this.a = callback;
        }

        @Override // com.facebook.GraphRequest.Callback
        public final void onCompleted(@NotNull GraphResponse graphResponse) {
            JSONObject graphObject = graphResponse.getGraphObject();
            JSONObject jSONObjectOptJSONObject = graphObject != null ? graphObject.optJSONObject(GraphRequest.Q) : null;
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray(GraphRequest.R) : null;
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("message") : null;
                    String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
                    String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("link") : null;
                    if (strOptString != null && strOptString2 != null) {
                        LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                        if (Intrinsics.areEqual(strOptString2, GraphRequest.P)) {
                            loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!Utility.isNullOrEmpty(strOptString3)) {
                            strOptString = strOptString + " Link: " + strOptString3;
                        }
                        Logger.INSTANCE.log(loggingBehavior, GraphRequest.TAG, strOptString);
                    }
                }
            }
            Callback callback = this.a;
            if (callback != null) {
                callback.onCompleted(graphResponse);
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < iNextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        X = sb.toString();
        Z = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    @JvmOverloads
    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @JvmOverloads
    public GraphRequest(@Nullable AccessToken accessToken) {
        this(accessToken, null, null, null, null, null, 62, null);
    }

    @JvmOverloads
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str) {
        this(accessToken, str, null, null, null, null, 60, null);
    }

    @JvmOverloads
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle) {
        this(accessToken, str, bundle, null, null, null, 56, null);
    }

    @JvmOverloads
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null, null, 48, null);
    }

    @JvmOverloads
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable Callback callback) {
        this(accessToken, str, bundle, httpMethod, callback, null, 32, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : httpMethod, (i & 16) != 0 ? null : callback, (i & 32) != 0 ? null : str2);
    }

    private final void a() {
        Bundle bundle = this.parameters;
        if (this.skipClientToken || !j()) {
            String strC = c();
            if (strC != null) {
                bundle.putString("access_token", strC);
            }
        } else {
            bundle.putString("access_token", d());
        }
        if (!bundle.containsKey("access_token") && Utility.isNullOrEmpty(FacebookSdk.getClientToken())) {
            Log.w(TAG, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", P);
        }
    }

    private final String b(String baseUrl, boolean isBatch) {
        if (!isBatch && this.httpMethod == HttpMethod.POST) {
            return baseUrl;
        }
        Uri.Builder builderBuildUpon = Uri.parse(baseUrl).buildUpon();
        for (String str : this.parameters.keySet()) {
            Object obj = this.parameters.get(str);
            if (obj == null) {
                obj = "";
            }
            Companion companion = INSTANCE;
            if (companion.j(obj)) {
                builderBuildUpon.appendQueryParameter(str, companion.k(obj).toString());
            } else if (this.httpMethod != HttpMethod.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
            }
        }
        return builderBuildUpon.toString();
    }

    private final String c() {
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            if (!this.parameters.containsKey("access_token")) {
                String token = accessToken.getToken();
                Logger.INSTANCE.registerAccessToken(token);
                return token;
            }
        } else if (!this.skipClientToken && !this.parameters.containsKey("access_token")) {
            return d();
        }
        return this.parameters.getString("access_token");
    }

    private final String d() {
        String applicationId = FacebookSdk.getApplicationId();
        String clientToken = FacebookSdk.getClientToken();
        if (Utility.isNullOrEmpty(applicationId) || Utility.isNullOrEmpty(clientToken)) {
            Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (applicationId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        sb.append(applicationId);
        sb.append(AESEncryptionHelper.SEPARATOR);
        if (clientToken == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        sb.append(clientToken);
        return sb.toString();
    }

    private final String e() {
        if (Z.matcher(this.graphPath).matches()) {
            return this.graphPath;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s/%s", Arrays.copyOf(new Object[]{this.version, this.graphPath}, 2));
    }

    @JvmStatic
    @NotNull
    public static final GraphResponse executeAndWait(@NotNull GraphRequest graphRequest) {
        return INSTANCE.executeAndWait(graphRequest);
    }

    @JvmStatic
    @NotNull
    public static final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeBatchAndWait(graphRequestBatch);
    }

    @JvmStatic
    @NotNull
    public static final List<GraphResponse> executeBatchAndWait(@NotNull Collection<GraphRequest> collection) {
        return INSTANCE.executeBatchAndWait(collection);
    }

    @JvmStatic
    @NotNull
    public static final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequest... graphRequestArr) {
        return INSTANCE.executeBatchAndWait(graphRequestArr);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeBatchAsync(graphRequestBatch);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequestAsyncTask executeBatchAsync(@NotNull Collection<GraphRequest> collection) {
        return INSTANCE.executeBatchAsync(collection);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequest... graphRequestArr) {
        return INSTANCE.executeBatchAsync(graphRequestArr);
    }

    @JvmStatic
    @NotNull
    public static final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeConnectionAndWait(httpURLConnection, graphRequestBatch);
    }

    @JvmStatic
    @NotNull
    public static final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection httpURLConnection, @NotNull Collection<GraphRequest> collection) {
        return INSTANCE.executeConnectionAndWait(httpURLConnection, collection);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequestAsyncTask executeConnectionAsync(@Nullable Handler handler, @NotNull HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeConnectionAsync(handler, httpURLConnection, graphRequestBatch);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequestAsyncTask executeConnectionAsync(@NotNull HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeConnectionAsync(httpURLConnection, graphRequestBatch);
    }

    private final String f(String baseUrl) {
        if (!h()) {
            baseUrl = ServerProtocol.getFacebookGraphUrlBase();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s/%s", Arrays.copyOf(new Object[]{baseUrl, e()}, 2));
    }

    private final boolean g() {
        if (this.graphPath == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        sb.append(FacebookSdk.getApplicationId());
        sb.append("/?.*");
        return this.forceApplicationRequest || Pattern.matches(sb.toString(), this.graphPath) || Pattern.matches("^/?app/?.*", this.graphPath);
    }

    @JvmStatic
    @Nullable
    public static final String getDefaultBatchApplicationId() {
        return INSTANCE.getDefaultBatchApplicationId();
    }

    private final boolean h() {
        if (!Intrinsics.areEqual(FacebookSdk.getGraphDomain(), FacebookSdk.INSTAGRAM_COM)) {
            return true;
        }
        return !g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(JSONArray batch, Map<String, a> attachments) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put(D, this.batchEntryOmitResultOnSuccess);
        }
        String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put(E, str2);
        }
        String relativeUrlForBatchedRequest = getRelativeUrlForBatchedRequest();
        jSONObject.put(G, relativeUrlForBatchedRequest);
        jSONObject.put("method", this.httpMethod);
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            Logger.INSTANCE.registerAccessToken(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = this.parameters.keySet().iterator();
        while (it2.hasNext()) {
            Object obj = this.parameters.get(it2.next());
            if (INSTANCE.i(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(attachments.size())}, 2));
                arrayList.add(str3);
                attachments.put(str3, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put(L, TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            final ArrayList arrayList2 = new ArrayList();
            INSTANCE.l(jSONObject2, relativeUrlForBatchedRequest, new b() { // from class: com.facebook.GraphRequest$serializeToBatch$1
                @Override // com.facebook.GraphRequest.b
                public void writeString(@NotNull String key, @NotNull String value) throws IOException {
                    ArrayList arrayList3 = arrayList2;
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    arrayList3.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2)));
                }
            });
            jSONObject.put("body", TextUtils.join(com.alipay.sdk.m.s.a.l, arrayList2));
        }
        batch.put(jSONObject);
    }

    private final boolean j() {
        String strC = c();
        boolean zContains$default = strC != null ? StringsKt__StringsKt.contains$default((CharSequence) strC, (CharSequence) AESEncryptionHelper.SEPARATOR, false, 2, (Object) null) : false;
        if (((strC == null || !m.startsWith$default(strC, "IG", false, 2, null) || zContains$default) ? false : true) && g()) {
            return true;
        }
        return (h() || zContains$default) ? false : true;
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable Callback callback) {
        return INSTANCE.newCustomAudienceThirdPartyIdRequest(accessToken, context, callback);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable String str, @Nullable Callback callback) {
        return INSTANCE.newCustomAudienceThirdPartyIdRequest(accessToken, context, str, callback);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newDeleteObjectRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Callback callback) {
        return INSTANCE.newDeleteObjectRequest(accessToken, str, callback);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newGraphPathRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Callback callback) {
        return INSTANCE.newGraphPathRequest(accessToken, str, callback);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newMeRequest(@Nullable AccessToken accessToken, @Nullable GraphJSONObjectCallback graphJSONObjectCallback) {
        return INSTANCE.newMeRequest(accessToken, graphJSONObjectCallback);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newMyFriendsRequest(@Nullable AccessToken accessToken, @Nullable GraphJSONArrayCallback graphJSONArrayCallback) {
        return INSTANCE.newMyFriendsRequest(accessToken, graphJSONArrayCallback);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newPlacesSearchRequest(@Nullable AccessToken accessToken, @Nullable Location location, int i, int i2, @Nullable String str, @Nullable GraphJSONArrayCallback graphJSONArrayCallback) {
        return INSTANCE.newPlacesSearchRequest(accessToken, location, i, i2, str, graphJSONArrayCallback);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newPostRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable Callback callback) {
        return INSTANCE.newPostRequest(accessToken, str, jSONObject, callback);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bitmap bitmap, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) {
        return INSTANCE.newUploadPhotoRequest(accessToken, str, bitmap, str2, bundle, callback);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Uri uri, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) throws FileNotFoundException {
        return INSTANCE.newUploadPhotoRequest(accessToken, str, uri, str2, bundle, callback);
    }

    @JvmStatic
    @NotNull
    public static final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable File file, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) throws FileNotFoundException {
        return INSTANCE.newUploadPhotoRequest(accessToken, str, file, str2, bundle, callback);
    }

    @JvmStatic
    public static final void setDefaultBatchApplicationId(@Nullable String str) {
        INSTANCE.setDefaultBatchApplicationId(str);
    }

    @JvmStatic
    @NotNull
    public static final HttpURLConnection toHttpConnection(@NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.toHttpConnection(graphRequestBatch);
    }

    @JvmStatic
    @NotNull
    public static final HttpURLConnection toHttpConnection(@NotNull Collection<GraphRequest> collection) {
        return INSTANCE.toHttpConnection(collection);
    }

    @JvmStatic
    @NotNull
    public static final HttpURLConnection toHttpConnection(@NotNull GraphRequest... graphRequestArr) {
        return INSTANCE.toHttpConnection(graphRequestArr);
    }

    @NotNull
    public final GraphResponse executeAndWait() {
        return INSTANCE.executeAndWait(this);
    }

    @NotNull
    public final GraphRequestAsyncTask executeAsync() {
        return INSTANCE.executeBatchAsync(this);
    }

    @Nullable
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final String getBatchEntryDependsOn() {
        return this.batchEntryDependsOn;
    }

    @Nullable
    public final String getBatchEntryName() {
        return this.batchEntryName;
    }

    public final boolean getBatchEntryOmitResultOnSuccess() {
        return this.batchEntryOmitResultOnSuccess;
    }

    @Nullable
    public final Callback getCallback() {
        return this.callback;
    }

    @Nullable
    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    @Nullable
    public final String getGraphPath() {
        return this.graphPath;
    }

    @Nullable
    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    @NotNull
    public final Bundle getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getRelativeUrlForBatchedRequest() {
        if (this.overriddenURL != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String strF = f(ServerProtocol.getGraphUrlBase());
        a();
        Uri uri = Uri.parse(b(strF, true));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
    }

    @Nullable
    public final Object getTag() {
        return this.tag;
    }

    @NotNull
    public final String getUrlForSingleRequest() {
        String str = this.overriddenURL;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.graphPath;
        String strF = f((this.httpMethod == HttpMethod.POST && str2 != null && m.endsWith$default(str2, o, false, 2, null)) ? ServerProtocol.getGraphVideoUrlBase() : ServerProtocol.getGraphUrlBaseForSubdomain(FacebookSdk.getGraphDomain()));
        a();
        return b(strF, false);
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setAccessToken(@Nullable AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public final void setBatchEntryDependsOn(@Nullable String str) {
        this.batchEntryDependsOn = str;
    }

    public final void setBatchEntryName(@Nullable String str) {
        this.batchEntryName = str;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean z2) {
        this.batchEntryOmitResultOnSuccess = z2;
    }

    public final void setCallback(@Nullable Callback callback) {
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO) || FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.callback = new d(callback);
        } else {
            this.callback = callback;
        }
    }

    public final void setForceApplicationRequest(boolean forceOverride) {
        this.forceApplicationRequest = forceOverride;
    }

    public final void setGraphObject(@Nullable JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    public final void setGraphPath(@Nullable String str) {
        this.graphPath = str;
    }

    public final void setHttpMethod(@Nullable HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != HttpMethod.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    public final void setParameters(@NotNull Bundle bundle) {
        this.parameters = bundle;
    }

    @Deprecated(message = "Starting in v13, the SDK will require a client token to be set before making GraphAPI calls.")
    public final void setSkipClientToken(boolean skipClientToken) {
        this.skipClientToken = skipClientToken;
    }

    public final void setTag(@Nullable Object obj) {
        this.tag = obj;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.accessToken;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.graphPath);
        sb.append(", graphObject: ");
        sb.append(this.graphObject);
        sb.append(", httpMethod: ");
        sb.append(this.httpMethod);
        sb.append(", parameters: ");
        sb.append(this.parameters);
        sb.append(i.d);
        return sb.toString();
    }

    @JvmOverloads
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable Callback callback, @Nullable String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        setCallback(callback);
        setHttpMethod(httpMethod);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            this.version = FacebookSdk.getGraphApiVersion();
        }
    }

    public GraphRequest(@Nullable AccessToken accessToken, @NotNull URL url) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.overriddenURL = url.toString();
        setHttpMethod(HttpMethod.GET);
        this.parameters = new Bundle();
    }
}
