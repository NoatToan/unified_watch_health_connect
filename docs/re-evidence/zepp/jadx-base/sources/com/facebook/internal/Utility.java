package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.UserDataStore;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.loc.z;
import com.tencent.open.SocialConstants;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.cybergarage.http.HTTP;
import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ò\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\bñ\u0001ò\u0001ó\u0001ô\u0001B\u000b\b\u0002¢\u0006\u0006\bð\u0001\u0010ë\u0001J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J.\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0007J\u001e\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0007J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007J/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0016j\b\u0012\u0004\u0012\u00028\u0000`\u0017\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u001aj\b\u0012\u0004\u0012\u00028\u0000`\u001b\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012\"\u00028\u0000H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010\"\u001a\u00020!H\u0007J\u0014\u0010#\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0007J\u0014\u0010#\u001a\u0004\u0018\u00010\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007J\u001a\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0002J&\u0010/\u001a\u00020.2\b\u0010*\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010-\u001a\u0004\u0018\u00010,H\u0007J\u0012\u00101\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u00010\u000eH\u0007J$\u00105\u001a\u0002042\u0006\u00102\u001a\u00020,2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\u00103\u001a\u0004\u0018\u00010\u000eH\u0007J,\u00108\u001a\u0002042\u0006\u00102\u001a\u00020,2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0010\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u000106H\u0007J$\u0010:\u001a\u0002042\u0006\u00102\u001a\u00020,2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\u00109\u001a\u0004\u0018\u00010.H\u0007J$\u0010<\u001a\u00020\n2\u0006\u0010;\u001a\u00020,2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0007J\u0012\u0010?\u001a\u0002042\b\u0010>\u001a\u0004\u0018\u00010=H\u0007J\u0012\u0010B\u001a\u0002042\b\u0010A\u001a\u0004\u0018\u00010@H\u0007J\u0012\u0010E\u001a\u00020\u000e2\b\u0010D\u001a\u0004\u0018\u00010CH\u0007J\u001c\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010H2\u0006\u0010G\u001a\u00020FH\u0007J\u001c\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0H2\u0006\u0010G\u001a\u00020FH\u0007J\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000e062\u0006\u0010L\u001a\u00020KH\u0007J&\u0010O\u001a\u0004\u0018\u00010\u00012\u0006\u0010G\u001a\u00020F2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\u0010N\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010R\u001a\u00020\u000e2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0007J\u001a\u0010V\u001a\u00020U2\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010T\u001a\u00020SH\u0007J\u001c\u0010X\u001a\u00020\n2\b\u0010W\u001a\u0004\u0018\u00010\u000e2\b\u00102\u001a\u0004\u0018\u00010\u000eH\u0007J\u0018\u0010\f\u001a\u0002042\u0006\u0010D\u001a\u00020C2\u0006\u0010Y\u001a\u00020\u000eH\u0002J\u0010\u0010Z\u001a\u0002042\u0006\u0010D\u001a\u00020CH\u0007J\"\u0010_\u001a\u0002042\b\u0010[\u001a\u0004\u0018\u00010\u000e2\u000e\u0010^\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0007J\u001c\u0010_\u001a\u0002042\b\u0010[\u001a\u0004\u0018\u00010\u000e2\b\u0010`\u001a\u0004\u0018\u00010\u000eH\u0007J&\u0010_\u001a\u0002042\b\u0010[\u001a\u0004\u0018\u00010\u000e2\b\u0010`\u001a\u0004\u0018\u00010\u000e2\b\u0010b\u001a\u0004\u0018\u00010aH\u0007J)\u0010c\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\b\u0010W\u001a\u0004\u0018\u00018\u00002\b\u00102\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\bc\u0010dJ\u001c\u0010e\u001a\u00020\n2\b\u0010W\u001a\u0004\u0018\u00010F2\b\u00102\u001a\u0004\u0018\u00010FH\u0007J\u001c\u0010h\u001a\u00020\u000e2\b\u0010f\u001a\u0004\u0018\u00010F2\b\u0010g\u001a\u0004\u0018\u00010\u000eH\u0007J\u001e\u0010j\u001a\u0004\u0018\u00010F2\b\u0010f\u001a\u0004\u0018\u00010F2\b\u0010i\u001a\u0004\u0018\u00010\u000eH\u0007J\u001e\u0010k\u001a\u0004\u0018\u00010K2\b\u0010f\u001a\u0004\u0018\u00010F2\b\u0010i\u001a\u0004\u0018\u00010\u000eH\u0007J\b\u0010l\u001a\u000204H\u0007J\u0012\u0010o\u001a\u0002042\b\u0010n\u001a\u0004\u0018\u00010mH\u0007J/\u0010q\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\u00062\u0012\u0010p\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012\"\u00028\u0000H\u0007¢\u0006\u0004\bq\u0010rJ\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020\u000e062\u0006\u0010L\u001a\u00020KH\u0007J\u0016\u0010u\u001a\b\u0012\u0004\u0012\u00020\u000e0t2\u0006\u0010L\u001a\u00020KH\u0007J \u0010w\u001a\u00020\u000e2\u0016\u0010v\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0HH\u0007J\u001c\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0H2\u0006\u0010x\u001a\u00020\u000eH\u0007J4\u0010\u007f\u001a\u0002042\u0006\u0010z\u001a\u00020F2\b\u0010|\u001a\u0004\u0018\u00010{2\b\u0010}\u001a\u0004\u0018\u00010\u000e2\u0006\u0010~\u001a\u00020\n2\u0006\u0010D\u001a\u00020CH\u0007J\u000b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000eH\u0007J\u001a\u0010\u0082\u0001\u001a\u0002042\u0006\u0010z\u001a\u00020F2\u0007\u0010\u0081\u0001\u001a\u00020CH\u0007JO\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00012\f\u0010\u0084\u0001\u001a\u0007\u0012\u0002\b\u00030\u0083\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u000e2!\u0010\u0086\u0001\u001a\u0011\u0012\r\b\u0001\u0012\t\u0012\u0002\b\u0003\u0018\u00010\u0083\u00010\u0012\"\t\u0012\u0002\b\u0003\u0018\u00010\u0083\u0001H\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001JJ\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u000e2\u0007\u0010\u0085\u0001\u001a\u00020\u000e2!\u0010\u0086\u0001\u001a\u0011\u0012\r\b\u0001\u0012\t\u0012\u0002\b\u0003\u0018\u00010\u0083\u00010\u0012\"\t\u0012\u0002\b\u0003\u0018\u00010\u0083\u0001H\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u008b\u0001JB\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u008d\u0001\u001a\u00030\u0087\u00012\u0017\u0010\u008e\u0001\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0012\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0013\u0010\u0091\u0001\u001a\u00020\u000e2\b\u0010D\u001a\u0004\u0018\u00010CH\u0007J8\u0010\u0095\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000106\"\u0004\b\u0000\u0010\u00062\u000f\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001062\u000e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0093\u0001H\u0007JD\u0010v\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u000106\"\u0004\b\u0000\u0010\u0006\"\u0005\b\u0001\u0010\u0096\u00012\u000f\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001062\u0014\u0010\u0098\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0097\u0001H\u0007J\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000e2\b\u00109\u001a\u0004\u0018\u00010.H\u0007J\u0013\u0010\u009a\u0001\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010.H\u0007J\u0013\u0010\u009b\u0001\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010.H\u0007J\u0013\u0010\u009c\u0001\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010.H\u0007J\u0013\u0010\u009f\u0001\u001a\u00030\u009e\u00012\u0007\u0010\u009d\u0001\u001a\u00020.H\u0007J*\u0010¢\u0001\u001a\u0005\u0018\u00010 \u00012\b\u0010;\u001a\u0004\u0018\u00010,2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\u0010¡\u0001\u001a\u00030 \u0001H\u0007J-\u0010¥\u0001\u001a\u0002042\b\u0010¤\u0001\u001a\u00030£\u00012\u0018\u0010v\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010HH\u0007J%\u0010¦\u0001\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010H2\b\u0010¤\u0001\u001a\u00030£\u0001H\u0007J\u0015\u0010©\u0001\u001a\u00020\n2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0007J\u0014\u0010«\u0001\u001a\u00020\u000e2\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010¯\u0001\u001a\u0002042\u0007\u0010¬\u0001\u001a\u00020\u000e2\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0007J\u0014\u0010°\u0001\u001a\u0004\u0018\u00010F2\u0007\u0010¬\u0001\u001a\u00020\u000eH\u0007J\u0013\u0010²\u0001\u001a\u00030±\u00012\u0007\u0010¬\u0001\u001a\u00020\u000eH\u0002J\u0014\u0010´\u0001\u001a\u00020\u000e2\t\u0010³\u0001\u001a\u0004\u0018\u00010\u000eH\u0002J\u000b\u0010µ\u0001\u001a\u0004\u0018\u00010\u000eH\u0002J\t\u0010¶\u0001\u001a\u00020UH\u0002J\u0012\u0010·\u0001\u001a\u0002042\u0007\u0010\u0081\u0001\u001a\u00020CH\u0002J\t\u0010¸\u0001\u001a\u000204H\u0002J\u0012\u0010¹\u0001\u001a\u0002042\u0007\u0010\u0081\u0001\u001a\u00020CH\u0002J\b\u0010^\u001a\u00020\nH\u0002J\t\u0010º\u0001\u001a\u000204H\u0002J\t\u0010»\u0001\u001a\u000204H\u0002J\u0013\u0010½\u0001\u001a\u00030\u009e\u00012\u0007\u0010\"\u001a\u00030¼\u0001H\u0002J*\u0010W\u001a\u0002042\u0006\u0010z\u001a\u00020F2\u0006\u0010|\u001a\u00020{2\b\u0010}\u001a\u0004\u0018\u00010\u000e2\u0006\u0010D\u001a\u00020CH\u0002J \u00102\u001a\u0002042\u0006\u0010z\u001a\u00020F2\u0006\u0010|\u001a\u00020{2\u0006\u0010D\u001a\u00020CH\u0002J\u0011\u0010¾\u0001\u001a\u00020\n2\u0006\u0010D\u001a\u00020CH\u0002J\u0013\u0010Á\u0001\u001a\u00030À\u00012\u0007\u0010¿\u0001\u001a\u00020FH\u0007J\u0012\u0010Ã\u0001\u001a\u00020\u000e2\u0007\u0010Â\u0001\u001a\u00020UH\u0007J\u0011\u0010Ä\u0001\u001a\u00020\n2\u0006\u0010D\u001a\u00020CH\u0007J\u0011\u0010Å\u0001\u001a\u00020\n2\u0006\u0010D\u001a\u00020CH\u0007J\u0011\u0010Æ\u0001\u001a\u00020\n2\u0006\u0010D\u001a\u00020CH\u0007J\u0015\u0010É\u0001\u001a\u0002042\n\u0010È\u0001\u001a\u0005\u0018\u00010Ç\u0001H\u0007J\u0011\u0010Ê\u0001\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020CH\u0007R\u0019\u0010Ë\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0018\u0010Í\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\bW\u0010Ì\u0001R\u0018\u0010Î\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b2\u0010Ì\u0001R\u0018\u0010Ï\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\f\u0010Ì\u0001R\u0019\u0010Ð\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\b\n\u0006\b½\u0001\u0010Ì\u0001R\u0018\u0010Ñ\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b^\u0010Ì\u0001R\u0019\u0010Ò\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\b\n\u0006\bµ\u0001\u0010Ì\u0001R\u0019\u0010Ó\u0001\u001a\u00020U8\u0006@\u0006X\u0086T¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0019\u0010Õ\u0001\u001a\u00020U8\u0002@\u0002X\u0082T¢\u0006\b\n\u0006\b²\u0001\u0010Ô\u0001R\u0019\u0010Ö\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\b\n\u0006\b´\u0001\u0010Ì\u0001R\u0018\u0010×\u0001\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010Ô\u0001R\u0019\u0010Ù\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010Ø\u0001R\u0019\u0010Ú\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010Ø\u0001R\u001a\u0010Û\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010Ø\u0001R\u0019\u0010Ü\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010Ì\u0001R\u0019\u0010Ý\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010Ì\u0001R\u0019\u0010Þ\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010Ì\u0001R\u0019\u0010ß\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\b\n\u0006\b·\u0001\u0010Ì\u0001R\u0019\u0010à\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\b\n\u0006\b¸\u0001\u0010Ì\u0001R\u0019\u0010á\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\b\n\u0006\b»\u0001\u0010Ì\u0001R\u0019\u0010å\u0001\u001a\u0005\u0018\u00010â\u00018G@\u0006¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u0017\u0010ç\u0001\u001a\u00030â\u00018G@\u0006¢\u0006\b\u001a\u0006\bæ\u0001\u0010ä\u0001R!\u0010è\u0001\u001a\u00020\n8F@\u0007X\u0087\u0004¢\u0006\u0010\u0012\u0006\bê\u0001\u0010ë\u0001\u001a\u0006\bè\u0001\u0010é\u0001R\u0018\u0010î\u0001\u001a\u0004\u0018\u00010F8G@\u0006¢\u0006\b\u001a\u0006\bì\u0001\u0010í\u0001R\u0016\u0010ï\u0001\u001a\u00020\n8G@\u0006¢\u0006\b\u001a\u0006\bï\u0001\u0010é\u0001¨\u0006õ\u0001"}, d2 = {"Lcom/facebook/internal/Utility;", "", "", "range1", "range2", "intersectRanges", ExifInterface.GPS_DIRECTION_TRUE, "", "subset", "superset", "", "isSubset", "c", "isNullOrEmpty", "", SOAP.XMLNS, "valueIfNullOrEmpty", "coerceValueIfNullOrEmpty", "", AuthHandler.d, "unmodifiableCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "arrayList", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "hashSet", "([Ljava/lang/Object;)Ljava/util/HashSet;", "key", "md5hash", "sha1hash", "", HTTP.CONTENT_RANGE_BYTES, "sha256hash", "algorithm", z.j, hl.k, "Ljava/security/MessageDigest;", AuthorizeActivityBase.KEY_HASH, "i", "authority", "path", "Landroid/os/Bundle;", "parameters", "Landroid/net/Uri;", "buildUri", "queryString", "parseUrlQueryString", "b", "value", "", "putNonEmptyString", "", "list", "putCommaSeparatedStringList", "uri", "putUri", "bundle", "putJSONValueInBundle", "Ljava/io/Closeable;", "closeable", "closeQuietly", "Ljava/net/URLConnection;", AbsEsimOperation.HEADER_CONNECTION, "disconnectQuietly", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getMetadataApplicationId", "Lorg/json/JSONObject;", "jsonObject", "", "convertJSONObjectToHashMap", "convertJSONObjectToStringMap", "Lorg/json/JSONArray;", "jsonArray", "convertJSONArrayToList", "nonJSONPropertyKey", "getStringPropertyAsJSON", "Ljava/io/InputStream;", "inputStream", "readStreamToString", "Ljava/io/OutputStream;", "outputStream", "", "copyAndCloseInputStream", "a", "stringsEqualOrEmpty", "domain", "clearFacebookCookies", "tag", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "logd", "msg", "", "t", "areObjectsEqual", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "hasSameId", AbstractJSONTokenResponse.RESPONSE, "propertyName", "safeGetStringFromResponse", "propertyKey", "tryGetJSONObjectFromResponse", "tryGetJSONArrayFromResponse", "clearCaches", "Ljava/io/File;", "directoryOrFile", "deleteDirectory", "array", "asListNoNulls", "([Ljava/lang/Object;)Ljava/util/List;", "jsonArrayToStringList", "", "jsonArrayToSet", SportAnalytics.ParamValue.MapButtonType.MAP, "mapToJsonStr", "str", "jsonStrToMap", "params", "Lcom/facebook/internal/AttributionIdentifiers;", "attributionIdentifiers", "anonymousAppDeviceGUID", "limitEventUsage", "setAppEventAttributionParameters", "getAppVersion", "appContext", "setAppEventExtendedDeviceInfoParameters", "Ljava/lang/Class;", "clazz", "methodName", "parameterTypes", "Ljava/lang/reflect/Method;", "getMethodQuietly", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "className", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", SocialConstants.PARAM_RECEIVER, "method", "args", "invokeMethodQuietly", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "getActivityName", "target", "Lcom/facebook/internal/Utility$Predicate;", "predicate", "filter", "K", "Lcom/facebook/internal/Utility$Mapper;", "mapper", "getUriString", "isWebUri", "isContentUri", "isFileUri", "contentUri", "", "getContentSize", "Ljava/util/Date;", "dateBase", "getBundleLongAsDate", "Landroid/os/Parcel;", "parcel", "writeStringMapToParcel", "readStringMapFromParcel", "Lcom/facebook/AccessToken;", "token", "isCurrentAccessToken", "tokenGraphDomain", "getGraphDomainFromTokenDomain", "accessToken", "Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "callback", "getGraphMeRequestWithCacheAsync", "awaitGetGraphMeRequestWithCache", "Lcom/facebook/GraphRequest;", "g", SDKConstants.PARAM_GRAPH_DOMAIN, "h", "f", GoogleApiAvailabilityLight.b, com.google.android.exoplayer2.text.ttml.b.r, DTransferConstants.SEARCH_KEY, "o", "m", "r", "", GoogleApiAvailabilityLight.a, "l", "result", "Lcom/facebook/internal/Utility$PermissionsLists;", "handlePermissionResponse", SessionDescription.p, "generateRandomString", "mustFixWindowParamsForAutofill", "isAutofillAvailable", "isChromeOS", "Ljava/lang/Runnable;", "runnable", "runOnNonUiThread", "getAppName", "LOG_TAG", "Ljava/lang/String;", "HASH_ALGORITHM_MD5", "HASH_ALGORITHM_SHA1", "HASH_ALGORITHM_SHA256", "URL_SCHEME", "EXTRA_APP_EVENTS_INFO_FORMAT_VERSION", UrlUtils.UTF8, "DEFAULT_STREAM_BUFFER_SIZE", LogUtil.I, "REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS", "NO_CARRIER", "numCPUCores", "J", "timestampOfLastCheck", "totalExternalStorageGB", "availableExternalStorageGB", "deviceTimezoneAbbreviation", "deviceTimeZoneName", "carrierName", "ARC_DEVICE_PATTERN", "FACEBOOK_PROFILE_FIELDS", "INSTAGRAM_PROFILE_FIELDS", "Ljava/util/Locale;", "getResourceLocale", "()Ljava/util/Locale;", "resourceLocale", "getCurrentLocale", "currentLocale", "isAutoAppLinkSetup", "()Z", "isAutoAppLinkSetup$annotations", "()V", "getDataProcessingOptions", "()Lorg/json/JSONObject;", "dataProcessingOptions", "isDataProcessingRestricted", "<init>", "GraphMeRequestWithCacheCallback", "Mapper", "PermissionsLists", "Predicate", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Utility {
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;

    @NotNull
    public static final String LOG_TAG = "FacebookSDK";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String HASH_ALGORITHM_MD5 = "MD5";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String HASH_ALGORITHM_SHA1 = "SHA-1";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String HASH_ALGORITHM_SHA256 = "SHA-256";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String URL_SCHEME = "https";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String EXTRA_APP_EVENTS_INFO_FORMAT_VERSION = "a2";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String UTF8 = "UTF-8";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS = 1800000;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static int numCPUCores = 0;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final String ARC_DEVICE_PATTERN = ".+_cheets|cheets_.+";

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final String FACEBOOK_PROFILE_FIELDS = "id,name,first_name,middle_name,last_name";

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final String INSTAGRAM_PROFILE_FIELDS = "id,name,profile_picture";

    @NotNull
    public static final Utility INSTANCE = new Utility();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static long timestampOfLastCheck = -1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static long totalExternalStorageGB = -1;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static long availableExternalStorageGB = -1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static String deviceTimezoneAbbreviation = "";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static String deviceTimeZoneName = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final String NO_CARRIER = "NoCarrier";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static String carrierName = NO_CARRIER;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\t"}, d2 = {"Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "", "Lorg/json/JSONObject;", "userInfo", "", "onSuccess", "Lcom/facebook/FacebookException;", "error", "onFailure", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface GraphMeRequestWithCacheCallback {
        void onFailure(@Nullable FacebookException error);

        void onSuccess(@Nullable JSONObject userInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bç\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/Utility$Mapper;", ExifInterface.GPS_DIRECTION_TRUE, "K", "", "item", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    @Deprecated(message = "This type should not be used in Kotlin.")
    public interface Mapper<T, K> {
        K apply(T item);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B1\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/facebook/internal/Utility$PermissionsLists;", "", "", "", "a", "Ljava/util/List;", "getGrantedPermissions", "()Ljava/util/List;", "setGrantedPermissions", "(Ljava/util/List;)V", "grantedPermissions", "b", "getDeclinedPermissions", "setDeclinedPermissions", SDKConstants.PARAM_DECLINED_PERMISSIONS, "c", "getExpiredPermissions", "setExpiredPermissions", SDKConstants.PARAM_EXPIRED_PERMISSIONS, "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class PermissionsLists {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private List<String> grantedPermissions;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private List<String> declinedPermissions;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private List<String> expiredPermissions;

        public PermissionsLists(@NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
            this.grantedPermissions = list;
            this.declinedPermissions = list2;
            this.expiredPermissions = list3;
        }

        @NotNull
        public final List<String> getDeclinedPermissions() {
            return this.declinedPermissions;
        }

        @NotNull
        public final List<String> getExpiredPermissions() {
            return this.expiredPermissions;
        }

        @NotNull
        public final List<String> getGrantedPermissions() {
            return this.grantedPermissions;
        }

        public final void setDeclinedPermissions(@NotNull List<String> list) {
            this.declinedPermissions = list;
        }

        public final void setExpiredPermissions(@NotNull List<String> list) {
            this.expiredPermissions = list;
        }

        public final void setGrantedPermissions(@NotNull List<String> list) {
            this.grantedPermissions = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/Utility$Predicate;", ExifInterface.GPS_DIRECTION_TRUE, "", "item", "", "apply", "(Ljava/lang/Object;)Z", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    @Deprecated(message = "This type should not be used in Kotlin.")
    public interface Predicate<T> {
        boolean apply(T item);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "(Lcom/facebook/GraphResponse;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements GraphRequest.Callback {
        public final /* synthetic */ GraphMeRequestWithCacheCallback a;
        public final /* synthetic */ String b;

        public a(GraphMeRequestWithCacheCallback graphMeRequestWithCacheCallback, String str) {
            this.a = graphMeRequestWithCacheCallback;
            this.b = str;
        }

        @Override // com.facebook.GraphRequest.Callback
        public final void onCompleted(@NotNull GraphResponse graphResponse) {
            if (graphResponse.getError() != null) {
                this.a.onFailure(graphResponse.getError().getIo.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION java.lang.String());
                return;
            }
            String str = this.b;
            JSONObject jsonObject = graphResponse.getJsonObject();
            if (jsonObject == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ProfileInformationCache.putProfileInformation(str, jsonObject);
            this.a.onSuccess(graphResponse.getJsonObject());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "dir", "", "fileName", "", "accept", "(Ljava/io/File;Ljava/lang/String;)Z", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements FilenameFilter {
        public static final b a = new b();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    private Utility() {
    }

    private final void a(JSONObject params, AttributionIdentifiers attributionIdentifiers, String anonymousAppDeviceGUID, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !l(context)) {
            params.put("anon_id", anonymousAppDeviceGUID);
        } else {
            if (attributionIdentifiers.getIsTrackingLimited()) {
                return;
            }
            params.put("anon_id", anonymousAppDeviceGUID);
        }
    }

    @JvmStatic
    public static final <T> boolean areObjectsEqual(@Nullable T a2, @Nullable T b2) {
        if (a2 == null) {
            return b2 == null;
        }
        return Intrinsics.areEqual(a2, b2);
    }

    @Deprecated(message = "This method should not be used in Kotlin.", replaceWith = @ReplaceWith(expression = "kotlin.collections.arrayListOf", imports = {}))
    @JvmStatic
    @NotNull
    public static final <T> ArrayList<T> arrayList(@NotNull T... ts) {
        ArrayList<T> arrayList = new ArrayList<>(ts.length);
        for (T t : ts) {
            arrayList.add(t);
        }
        return arrayList;
    }

    @Deprecated(message = "This method should not be used in Kotlin.", replaceWith = @ReplaceWith(expression = "kotlin.collections.filterNotNull", imports = {}))
    @JvmStatic
    @NotNull
    public static final <T> List<T> asListNoNulls(@NotNull T... array) {
        ArrayList arrayList = new ArrayList();
        for (T t : array) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @JvmStatic
    @Nullable
    public static final JSONObject awaitGetGraphMeRequestWithCache(@NotNull String accessToken) {
        JSONObject profileInformation = ProfileInformationCache.getProfileInformation(accessToken);
        if (profileInformation != null) {
            return profileInformation;
        }
        GraphResponse graphResponseExecuteAndWait = INSTANCE.g(accessToken).executeAndWait();
        if (graphResponseExecuteAndWait.getError() != null) {
            return null;
        }
        return graphResponseExecuteAndWait.getJsonObject();
    }

    private final void b(JSONObject params, AttributionIdentifiers attributionIdentifiers, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !l(context)) {
            params.put("attribution", attributionIdentifiers.getAttributionId());
        } else {
            if (attributionIdentifiers.getIsTrackingLimited()) {
                return;
            }
            params.put("attribution", attributionIdentifiers.getAttributionId());
        }
    }

    @JvmStatic
    @NotNull
    public static final Uri buildUri(@Nullable String authority, @Nullable String path, @Nullable Bundle parameters) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(authority);
        builder.path(path);
        if (parameters != null) {
            for (String str : parameters.keySet()) {
                Object obj = parameters.get(str);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str, (String) obj);
                }
            }
        }
        return builder.build();
    }

    private final void c(Context context, String domain) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(domain);
        if (cookie != null) {
            Object[] array = StringsKt__StringsKt.split$default((CharSequence) cookie, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            for (String str : (String[]) array) {
                Object[] array2 = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{SearchCriteria.EQ}, false, 0, 6, (Object) null).toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array2;
                if (strArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    String str2 = strArr[0];
                    int length = str2.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    sb.append(str2.subSequence(i, length + 1).toString());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    cookieManager.setCookie(domain, sb.toString());
                }
            }
            cookieManager.removeExpiredCookie();
        }
    }

    @Deprecated(message = "It will be removed in v13.0.")
    @JvmStatic
    public static final void clearCaches() {
        ImageDownloader.clearCache();
    }

    @JvmStatic
    public static final void clearFacebookCookies(@NotNull Context context) {
        Utility utility = INSTANCE;
        utility.c(context, FacebookSdk.FACEBOOK_COM);
        utility.c(context, ".facebook.com");
        utility.c(context, "https://facebook.com");
        utility.c(context, "https://.facebook.com");
    }

    @JvmStatic
    public static final void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @JvmStatic
    @Nullable
    public static final String coerceValueIfNullOrEmpty(@Nullable String s, @Nullable String valueIfNullOrEmpty) {
        return isNullOrEmpty(s) ? valueIfNullOrEmpty : s;
    }

    @JvmStatic
    @NotNull
    public static final List<String> convertJSONArrayToList(@NotNull JSONArray jsonArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jsonArray.getString(i));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    @JvmStatic
    @NotNull
    public static final Map<String, Object> convertJSONObjectToHashMap(@NotNull JSONObject jsonObject) {
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArrayNames.getString(i);
                    Object objConvertJSONObjectToHashMap = jsonObject.get(string);
                    if (objConvertJSONObjectToHashMap instanceof JSONObject) {
                        objConvertJSONObjectToHashMap = convertJSONObjectToHashMap((JSONObject) objConvertJSONObjectToHashMap);
                    }
                    map.put(string, objConvertJSONObjectToHashMap);
                } catch (JSONException unused) {
                }
            }
        }
        return map;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> convertJSONObjectToStringMap(@NotNull JSONObject jsonObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jsonObject.optString(next);
            if (strOptString != null) {
                map.put(next, strOptString);
            }
        }
        return map;
    }

    @JvmStatic
    public static final int copyAndCloseInputStream(@Nullable InputStream inputStream, @NotNull OutputStream outputStream) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int i2 = bufferedInputStream2.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i2);
                    i += i2;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final long d(double bytes) {
        return Math.round(bytes / 1.073741824E9d);
    }

    @JvmStatic
    public static final void deleteDirectory(@Nullable File directoryOrFile) {
        File[] fileArrListFiles;
        if (directoryOrFile == null || !directoryOrFile.exists()) {
            return;
        }
        if (directoryOrFile.isDirectory() && (fileArrListFiles = directoryOrFile.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                deleteDirectory(file);
            }
        }
        directoryOrFile.delete();
    }

    @JvmStatic
    public static final void disconnectQuietly(@Nullable URLConnection connection) {
        if (connection == null || !(connection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) connection).disconnect();
    }

    private final boolean e() {
        return Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
    }

    private final String f() {
        AccessToken currentAccessToken = AccessToken.INSTANCE.getCurrentAccessToken();
        return (currentAccessToken == null || currentAccessToken.getGraphDomain() == null) ? "facebook" : currentAccessToken.getGraphDomain();
    }

    @Deprecated(message = "This method should not be used in Kotlin.", replaceWith = @ReplaceWith(expression = "kotlin.collections.filter", imports = {}))
    @JvmStatic
    @Nullable
    public static final <T> List<T> filter(@Nullable List<? extends T> target, @NotNull Predicate<T> predicate) {
        if (target == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : target) {
            if (predicate.apply(t)) {
                arrayList.add(t);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private final GraphRequest g(String accessToken) {
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, h(f()));
        bundle.putString("access_token", accessToken);
        GraphRequest graphRequestNewMeRequest = GraphRequest.INSTANCE.newMeRequest(null, null);
        graphRequestNewMeRequest.setParameters(bundle);
        graphRequestNewMeRequest.setHttpMethod(HttpMethod.GET);
        return graphRequestNewMeRequest;
    }

    @JvmStatic
    @NotNull
    public static final String generateRandomString(int length) {
        return new BigInteger(length * 5, new Random()).toString(32);
    }

    @JvmStatic
    @NotNull
    public static final String getActivityName(@Nullable Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    @JvmStatic
    @NotNull
    public static final String getAppName(@NotNull Context context) {
        try {
            String applicationName = FacebookSdk.getApplicationName();
            if (applicationName != null) {
                return applicationName;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    @Nullable
    public static final String getAppVersion() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        if (applicationContext != null) {
            try {
                PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final Date getBundleLongAsDate(@Nullable Bundle bundle, @Nullable String key, @NotNull Date dateBase) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(key);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    jLongValue = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        jLongValue = ((Number) obj).longValue();
        return jLongValue == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (jLongValue * 1000));
    }

    @JvmStatic
    public static final long getContentSize(@NotNull Uri contentUri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = FacebookSdk.getApplicationContext().getContentResolver().query(contentUri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @JvmStatic
    @NotNull
    public static final Locale getCurrentLocale() {
        Locale resourceLocale = getResourceLocale();
        return resourceLocale != null ? resourceLocale : Locale.getDefault();
    }

    @JvmStatic
    @Nullable
    public static final JSONObject getDataProcessingOptions() {
        if (CrashShieldHandler.isObjectCrashing(Utility.class)) {
            return null;
        }
        try {
            String string = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.DATA_PROCESSING_OPTIONS_PREFERENCES, 0).getString(FacebookSdk.DATA_PROCESSION_OPTIONS, null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utility.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final String getGraphDomainFromTokenDomain(@Nullable String tokenGraphDomain) {
        String facebookDomain = FacebookSdk.getFacebookDomain();
        if (tokenGraphDomain == null) {
            return facebookDomain;
        }
        int iHashCode = tokenGraphDomain.hashCode();
        if (iHashCode != -1253231569) {
            return (iHashCode == 28903346 && tokenGraphDomain.equals("instagram")) ? m.replace$default(facebookDomain, FacebookSdk.FACEBOOK_COM, FacebookSdk.INSTAGRAM_COM, false, 4, (Object) null) : facebookDomain;
        }
        return tokenGraphDomain.equals(FacebookSdk.GAMING) ? m.replace$default(facebookDomain, FacebookSdk.FACEBOOK_COM, "fb.gg", false, 4, (Object) null) : facebookDomain;
    }

    @JvmStatic
    public static final void getGraphMeRequestWithCacheAsync(@NotNull String accessToken, @NotNull GraphMeRequestWithCacheCallback callback) {
        JSONObject profileInformation = ProfileInformationCache.getProfileInformation(accessToken);
        if (profileInformation != null) {
            callback.onSuccess(profileInformation);
            return;
        }
        a aVar = new a(callback, accessToken);
        GraphRequest graphRequestG = INSTANCE.g(accessToken);
        graphRequestG.setCallback(aVar);
        graphRequestG.executeAsync();
    }

    @JvmStatic
    @NotNull
    public static final String getMetadataApplicationId(@Nullable Context context) {
        Validate.notNull(context, DbUtils.Const.Table.CONTEXT);
        return FacebookSdk.getApplicationId();
    }

    @JvmStatic
    @Nullable
    public static final Method getMethodQuietly(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>... parameterTypes) {
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Locale getResourceLocale() {
        try {
            return FacebookSdk.getApplicationContext().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Object getStringPropertyAsJSON(@NotNull JSONObject jsonObject, @Nullable String key, @Nullable String nonJSONPropertyKey) throws JSONException {
        Object objOpt = jsonObject.opt(key);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (nonJSONPropertyKey == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(nonJSONPropertyKey, objOpt);
        return jSONObject;
    }

    @JvmStatic
    @Nullable
    public static final String getUriString(@Nullable Uri uri) {
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    private final String h(String graphDomain) {
        return Intrinsics.areEqual(graphDomain, "instagram") ? INSTAGRAM_PROFILE_FIELDS : FACEBOOK_PROFILE_FIELDS;
    }

    @JvmStatic
    @NotNull
    public static final PermissionsLists handlePermissionResponse(@NotNull JSONObject result) throws JSONException {
        String strOptString;
        JSONArray jSONArray = result.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString2 = jSONObjectOptJSONObject.optString(PointCategory.PERMISSION);
            if (strOptString2 != null && !Intrinsics.areEqual(strOptString2, "installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                if (Intrinsics.areEqual(strOptString, "granted")) {
                    arrayList.add(strOptString2);
                } else if (Intrinsics.areEqual(strOptString, "declined")) {
                    arrayList2.add(strOptString2);
                } else if (Intrinsics.areEqual(strOptString, Constants.EXPIRED)) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        return new PermissionsLists(arrayList, arrayList2, arrayList3);
    }

    @Deprecated(message = "It will be removed in v13.0.")
    @JvmStatic
    public static final boolean hasSameId(@Nullable JSONObject a2, @Nullable JSONObject b2) {
        if (a2 == null || b2 == null || !a2.has("id") || !b2.has("id")) {
            return false;
        }
        if (Intrinsics.areEqual(a2, b2)) {
            return true;
        }
        String strOptString = a2.optString("id");
        String strOptString2 = b2.optString("id");
        if (strOptString == null || strOptString2 == null) {
            return false;
        }
        return Intrinsics.areEqual(strOptString, strOptString2);
    }

    @Deprecated(message = "This method should not be used in Kotlin.", replaceWith = @ReplaceWith(expression = "kotlin.collections.hashSetOf", imports = {}))
    @JvmStatic
    @NotNull
    public static final <T> HashSet<T> hashSet(@NotNull T... ts) {
        HashSet<T> hashSet = new HashSet<>(ts.length);
        for (T t : ts) {
            hashSet.add(t);
        }
        return hashSet;
    }

    private final String i(MessageDigest hash, byte[] bytes) {
        hash.update(bytes);
        byte[] bArrDigest = hash.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArrDigest) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString((b2 >> 0) & 15));
        }
        return sb.toString();
    }

    @Deprecated(message = "It will be removed in v13.0.")
    @JvmStatic
    @Nullable
    public static final int[] intersectRanges(@Nullable int[] range1, @Nullable int[] range2) {
        if (range1 == null) {
            return range2;
        }
        if (range2 == null) {
            return range1;
        }
        int[] iArr = new int[range1.length + range2.length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < range1.length && i2 < range2.length) {
            int i4 = range1[i];
            int i5 = range2[i2];
            int i6 = i < range1.length + (-1) ? range1[i + 1] : Integer.MAX_VALUE;
            int i7 = i2 < range2.length + (-1) ? range2[i2 + 1] : Integer.MAX_VALUE;
            if (i4 < i5) {
                if (i6 <= i5) {
                    i += 2;
                    i4 = Integer.MIN_VALUE;
                    i6 = Integer.MAX_VALUE;
                } else if (i6 > i7) {
                    i2 += 2;
                    i4 = i5;
                    i6 = i7;
                } else {
                    i += 2;
                    i4 = i5;
                }
            } else if (i7 <= i4) {
                i2 += 2;
                i4 = Integer.MIN_VALUE;
                i6 = Integer.MAX_VALUE;
            } else if (i7 > i6) {
                i += 2;
            } else {
                i2 += 2;
                i6 = i7;
            }
            if (i4 != Integer.MIN_VALUE) {
                int i8 = i3 + 1;
                iArr[i3] = i4;
                if (i6 == Integer.MAX_VALUE) {
                    i3 = i8;
                    break;
                }
                i3 = i8 + 1;
                iArr[i8] = i6;
            }
        }
        return Arrays.copyOf(iArr, i3);
    }

    @JvmStatic
    @Nullable
    public static final Object invokeMethodQuietly(@Nullable Object receiver, @NotNull Method method, @NotNull Object... args) {
        try {
            return method.invoke(receiver, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean isAutoAppLinkSetup() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1))));
            Context applicationContext = FacebookSdk.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            String packageName = applicationContext.getPackageName();
            Iterator<ResolveInfo> it2 = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(packageName, it2.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void isAutoAppLinkSetup$annotations() {
    }

    @JvmStatic
    public static final boolean isAutofillAvailable(@NotNull Context context) {
        AutofillManager autofillManager;
        return Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    @JvmStatic
    public static final boolean isChromeOS(@NotNull Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && new Regex(ARC_DEVICE_PATTERN).matches(str);
    }

    @JvmStatic
    public static final boolean isContentUri(@Nullable Uri uri) {
        return uri != null && m.equals("content", uri.getScheme(), true);
    }

    @JvmStatic
    public static final boolean isCurrentAccessToken(@Nullable AccessToken token) {
        return token != null && Intrinsics.areEqual(token, AccessToken.INSTANCE.getCurrentAccessToken());
    }

    @JvmStatic
    public static final boolean isDataProcessingRestricted() {
        if (CrashShieldHandler.isObjectCrashing(Utility.class)) {
            return false;
        }
        try {
            JSONObject dataProcessingOptions = getDataProcessingOptions();
            if (dataProcessingOptions != null) {
                try {
                    JSONArray jSONArray = dataProcessingOptions.getJSONArray(FacebookSdk.DATA_PROCESSION_OPTIONS);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        if (Intrinsics.areEqual(string.toLowerCase(), "ldu")) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utility.class);
            return false;
        }
    }

    @JvmStatic
    public static final boolean isFileUri(@Nullable Uri uri) {
        return uri != null && m.equals("file", uri.getScheme(), true);
    }

    @JvmStatic
    public static final <T> boolean isNullOrEmpty(@Nullable Collection<? extends T> c) {
        return c == null || c.isEmpty();
    }

    @Deprecated(message = "This method should not be used in Kotlin.", replaceWith = @ReplaceWith(expression = "kotlin.collections.containsAll", imports = {}))
    @JvmStatic
    public static final <T> boolean isSubset(@Nullable Collection<? extends T> subset, @Nullable Collection<? extends T> superset) {
        if (superset == null || superset.isEmpty()) {
            return subset == null || subset.isEmpty();
        }
        HashSet hashSet = new HashSet(superset);
        if (subset == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Iterator<? extends T> it2 = subset.iterator();
        while (it2.hasNext()) {
            if (!hashSet.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final boolean isWebUri(@Nullable Uri uri) {
        return uri != null && (m.equals("http", uri.getScheme(), true) || m.equals("https", uri.getScheme(), true) || m.equals("fbstaging", uri.getScheme(), true));
    }

    private final String j(String algorithm, String key) {
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(key, "null cannot be cast to non-null type java.lang.String");
        return k(algorithm, key.getBytes(charset));
    }

    @JvmStatic
    @NotNull
    public static final Set<String> jsonArrayToSet(@NotNull JSONArray jsonArray) throws JSONException {
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(jsonArray.getString(i));
        }
        return hashSet;
    }

    @JvmStatic
    @NotNull
    public static final List<String> jsonArrayToStringList(@NotNull JSONArray jsonArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jsonArray.getString(i));
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> jsonStrToMap(@NotNull String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    private final String k(String algorithm, byte[] bytes) {
        try {
            return i(MessageDigest.getInstance(algorithm), bytes);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private final boolean l(Context context) {
        Method methodQuietly = getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
        if (methodQuietly == null) {
            return false;
        }
        Object objInvokeMethodQuietly = invokeMethodQuietly(null, methodQuietly, context);
        return (objInvokeMethodQuietly instanceof Integer) && !(Intrinsics.areEqual(objInvokeMethodQuietly, (Object) 0) ^ true);
    }

    @JvmStatic
    public static final void logd(@Nullable String tag, @Nullable Exception e) {
        if (!FacebookSdk.isDebugEnabled() || tag == null || e == null) {
            return;
        }
        Log.d(tag, e.getClass().getSimpleName() + ": " + e.getMessage());
    }

    private final void m() {
        try {
            if (e()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                availableExternalStorageGB = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            availableExternalStorageGB = d(availableExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    @Deprecated(message = "This method should not be used in Kotlin.", replaceWith = @ReplaceWith(expression = "kotlin.collections.map", imports = {}))
    @JvmStatic
    @Nullable
    public static final <T, K> List<K> map(@Nullable List<? extends T> target, @NotNull Mapper<T, K> mapper) {
        if (target == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it2 = target.iterator();
        while (it2.hasNext()) {
            K kApply = mapper.apply(it2.next());
            if (kApply != null) {
                arrayList.add(kApply);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    public static final String mapToJsonStr(@NotNull Map<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    @JvmStatic
    @Nullable
    public static final String md5hash(@NotNull String key) {
        return INSTANCE.j(HASH_ALGORITHM_MD5, key);
    }

    @JvmStatic
    public static final boolean mustFixWindowParamsForAutofill(@NotNull Context context) {
        return isAutofillAvailable(context);
    }

    private final int n() {
        int i = numCPUCores;
        if (i > 0) {
            return i;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(b.a);
            if (fileArrListFiles != null) {
                numCPUCores = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (numCPUCores <= 0) {
            numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return numCPUCores;
    }

    private final void o(Context appContext) {
        if (Intrinsics.areEqual(carrierName, NO_CARRIER)) {
            try {
                Object systemService = appContext.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                carrierName = ((TelephonyManager) systemService).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    private final void p(Context appContext) {
        if (timestampOfLastCheck == -1 || System.currentTimeMillis() - timestampOfLastCheck >= REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS) {
            timestampOfLastCheck = System.currentTimeMillis();
            q();
            o(appContext);
            r();
            m();
        }
    }

    @JvmStatic
    @NotNull
    public static final Bundle parseUrlQueryString(@Nullable String queryString) {
        Bundle bundle = new Bundle();
        if (!isNullOrEmpty(queryString)) {
            if (queryString == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Object[] array = StringsKt__StringsKt.split$default((CharSequence) queryString, new String[]{com.alipay.sdk.m.s.a.l}, false, 0, 6, (Object) null).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            for (String str : (String[]) array) {
                Object[] array2 = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{SearchCriteria.EQ}, false, 0, 6, (Object) null).toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array2;
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    logd(LOG_TAG, e);
                }
            }
        }
        return bundle;
    }

    @JvmStatic
    public static final void putCommaSeparatedStringList(@NotNull Bundle b2, @Nullable String key, @Nullable List<String> list) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append(",");
            }
            b2.putString(key, sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "");
        }
    }

    @JvmStatic
    public static final boolean putJSONValueInBundle(@NotNull Bundle bundle, @Nullable String key, @Nullable Object value) {
        if (value == null) {
            bundle.remove(key);
            return true;
        }
        if (value instanceof Boolean) {
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
            return true;
        }
        if (value instanceof boolean[]) {
            bundle.putBooleanArray(key, (boolean[]) value);
            return true;
        }
        if (value instanceof Double) {
            bundle.putDouble(key, ((Number) value).doubleValue());
            return true;
        }
        if (value instanceof double[]) {
            bundle.putDoubleArray(key, (double[]) value);
            return true;
        }
        if (value instanceof Integer) {
            bundle.putInt(key, ((Number) value).intValue());
            return true;
        }
        if (value instanceof int[]) {
            bundle.putIntArray(key, (int[]) value);
            return true;
        }
        if (value instanceof Long) {
            bundle.putLong(key, ((Number) value).longValue());
            return true;
        }
        if (value instanceof long[]) {
            bundle.putLongArray(key, (long[]) value);
            return true;
        }
        if (value instanceof String) {
            bundle.putString(key, (String) value);
            return true;
        }
        if (value instanceof JSONArray) {
            bundle.putString(key, value.toString());
            return true;
        }
        if (!(value instanceof JSONObject)) {
            return false;
        }
        bundle.putString(key, value.toString());
        return true;
    }

    @JvmStatic
    public static final void putNonEmptyString(@NotNull Bundle b2, @Nullable String key, @Nullable String value) {
        if (isNullOrEmpty(value)) {
            return;
        }
        b2.putString(key, value);
    }

    @JvmStatic
    public static final void putUri(@NotNull Bundle b2, @Nullable String key, @Nullable Uri uri) {
        if (uri != null) {
            putNonEmptyString(b2, key, uri.toString());
        }
    }

    private final void q() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            deviceTimezoneAbbreviation = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            deviceTimeZoneName = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    private final void r() {
        try {
            if (e()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                totalExternalStorageGB = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            totalExternalStorageGB = d(totalExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    @NotNull
    public static final String readStreamToString(@Nullable InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i = inputStreamReader.read(cArr);
                        if (i == -1) {
                            String string = sb.toString();
                            closeQuietly(bufferedInputStream);
                            closeQuietly(inputStreamReader);
                            return string;
                        }
                        sb.append(cArr, 0, i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeQuietly(bufferedInputStream);
                    closeQuietly(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Map<String, String> readStringMapFromParcel(@NotNull Parcel parcel) {
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            map.put(parcel.readString(), parcel.readString());
        }
        return map;
    }

    @JvmStatic
    public static final void runOnNonUiThread(@Nullable Runnable runnable) {
        try {
            FacebookSdk.getExecutor().execute(runnable);
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    @NotNull
    public static final String safeGetStringFromResponse(@Nullable JSONObject response, @Nullable String propertyName) {
        return response != null ? response.optString(propertyName, "") : "";
    }

    @JvmStatic
    public static final void setAppEventAttributionParameters(@NotNull JSONObject params, @Nullable AttributionIdentifiers attributionIdentifiers, @Nullable String anonymousAppDeviceGUID, boolean limitEventUsage, @NotNull Context context) throws JSONException {
        FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
        if (!FeatureManager.isEnabled(feature)) {
            params.put("anon_id", anonymousAppDeviceGUID);
        }
        params.put("application_tracking_enabled", !limitEventUsage);
        params.put("advertiser_id_collection_enabled", FacebookSdk.getAdvertiserIDCollectionEnabled());
        if (attributionIdentifiers != null) {
            if (FeatureManager.isEnabled(feature)) {
                INSTANCE.a(params, attributionIdentifiers, anonymousAppDeviceGUID, context);
            }
            if (attributionIdentifiers.getAttributionId() != null) {
                if (FeatureManager.isEnabled(feature)) {
                    INSTANCE.b(params, attributionIdentifiers, context);
                } else {
                    params.put("attribution", attributionIdentifiers.getAttributionId());
                }
            }
            if (attributionIdentifiers.getAndroidAdvertiserId() != null) {
                params.put("advertiser_id", attributionIdentifiers.getAndroidAdvertiserId());
                params.put("advertiser_tracking_enabled", !attributionIdentifiers.getIsTrackingLimited());
            }
            if (!attributionIdentifiers.getIsTrackingLimited()) {
                String allHashedUserData = UserDataStore.getAllHashedUserData();
                if (!(allHashedUserData.length() == 0)) {
                    params.put("ud", allHashedUserData);
                }
            }
            if (attributionIdentifiers.getAndroidInstallerPackage() != null) {
                params.put("installer_package", attributionIdentifiers.getAndroidInstallerPackage());
            }
        }
    }

    @JvmStatic
    public static final void setAppEventExtendedDeviceInfoParameters(@NotNull JSONObject params, @NotNull Context appContext) throws JSONException {
        String str;
        Locale locale;
        int i;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(EXTRA_APP_EVENTS_INFO_FORMAT_VERSION);
        INSTANCE.p(appContext);
        String packageName = appContext.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + "_" + locale.getCountry());
        jSONArray.put(deviceTimezoneAbbreviation);
        jSONArray.put(carrierName);
        double d = 0.0d;
        try {
            Display defaultDisplay = null;
            if (Build.VERSION.SDK_INT >= 17) {
                Object systemService = appContext.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY);
                if (!(systemService instanceof DisplayManager)) {
                    systemService = null;
                }
                DisplayManager displayManager = (DisplayManager) systemService;
                if (displayManager != null) {
                    defaultDisplay = displayManager.getDisplay(0);
                }
            } else {
                Object systemService2 = appContext.getSystemService("window");
                if (!(systemService2 instanceof WindowManager)) {
                    systemService2 = null;
                }
                WindowManager windowManager = (WindowManager) systemService2;
                if (windowManager != null) {
                    defaultDisplay = windowManager.getDefaultDisplay();
                }
            }
            if (defaultDisplay != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i4 = displayMetrics.widthPixels;
                try {
                    int i5 = displayMetrics.heightPixels;
                    try {
                        d = displayMetrics.density;
                    } catch (Exception unused3) {
                    }
                    i = i5;
                    i2 = i4;
                } catch (Exception unused4) {
                    i2 = i4;
                    i = 0;
                }
            } else {
                i = 0;
            }
        } catch (Exception unused5) {
        }
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(INSTANCE.n());
        jSONArray.put(totalExternalStorageGB);
        jSONArray.put(availableExternalStorageGB);
        jSONArray.put(deviceTimeZoneName);
        params.put(com.facebook.appevents.codeless.internal.Constants.EXTINFO, jSONArray.toString());
    }

    @JvmStatic
    @Nullable
    public static final String sha1hash(@NotNull String key) {
        return INSTANCE.j(HASH_ALGORITHM_SHA1, key);
    }

    @JvmStatic
    @Nullable
    public static final String sha256hash(@Nullable String key) {
        if (key == null) {
            return null;
        }
        return INSTANCE.j("SHA-256", key);
    }

    @JvmStatic
    public static final boolean stringsEqualOrEmpty(@Nullable String a2, @Nullable String b2) {
        boolean z = a2 == null || a2.length() == 0;
        boolean z2 = b2 == null || b2.length() == 0;
        if (z && z2) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return Intrinsics.areEqual(a2, b2);
    }

    @JvmStatic
    @Nullable
    public static final JSONArray tryGetJSONArrayFromResponse(@Nullable JSONObject response, @Nullable String propertyKey) {
        if (response != null) {
            return response.optJSONArray(propertyKey);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final JSONObject tryGetJSONObjectFromResponse(@Nullable JSONObject response, @Nullable String propertyKey) {
        if (response != null) {
            return response.optJSONObject(propertyKey);
        }
        return null;
    }

    @Deprecated(message = "This method should not be used in Kotlin.", replaceWith = @ReplaceWith(expression = "kotlin.collections.listOf", imports = {}))
    @JvmStatic
    @NotNull
    public static final <T> Collection<T> unmodifiableCollection(@NotNull T... ts) {
        return Collections.unmodifiableCollection(Arrays.asList(Arrays.copyOf(ts, ts.length)));
    }

    @JvmStatic
    public static final void writeStringMapToParcel(@NotNull Parcel parcel, @Nullable Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    @JvmStatic
    @Nullable
    public static final Method getMethodQuietly(@NotNull String className, @NotNull String methodName, @NotNull Class<?>... parameterTypes) {
        try {
            return getMethodQuietly(Class.forName(className), methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @JvmStatic
    public static final boolean isNullOrEmpty(@Nullable String s) {
        if (s != null) {
            if (!(s.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    @Nullable
    public static final String sha1hash(@NotNull byte[] bytes) {
        return INSTANCE.k(HASH_ALGORITHM_SHA1, bytes);
    }

    @JvmStatic
    @Nullable
    public static final String sha256hash(@Nullable byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        return INSTANCE.k("SHA-256", bytes);
    }

    @JvmStatic
    public static final void logd(@Nullable String tag, @Nullable String msg) {
        if (!FacebookSdk.isDebugEnabled() || tag == null || msg == null) {
            return;
        }
        Log.d(tag, msg);
    }

    @JvmStatic
    public static final void logd(@Nullable String tag, @Nullable String msg, @Nullable Throwable t) {
        if (!FacebookSdk.isDebugEnabled() || isNullOrEmpty(tag)) {
            return;
        }
        Log.d(tag, msg, t);
    }
}
