package com.huami.moving.ui.sport.detail.manager;

import android.content.Context;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.sport.detail.data.ShowItemBean;
import com.huami.moving.ui.sport.detail.data.SportShowDataBean;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.RunnerPeripheralInfo;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.ui.view.card.CardInfoAdapter;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0092\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010t\u001a\u00020r\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010v\u001a\u00020\\¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u001f\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u001f\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J-\u0010\u001a\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0017H\u0002J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010-\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0019\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u00103\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u00104\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0019\u00106\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u00109\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010:\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0019\u0010<\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b<\u00101J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b=\u0010\u000bJ\u0010\u0010>\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010?\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010@\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010A\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002JL\u0010H\u001a\u00020G2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00022\u0018\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020D0C2\u0018\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020D0CH\u0002JD\u0010I\u001a\u00020G2\u0006\u0010B\u001a\u00020\u00022\u0018\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020D0C2\u0018\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020D0CH\u0002J\u0010\u0010K\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\bH\u0002J\u0010\u0010L\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\bH\u0002J\u0018\u0010O\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\u0017H\u0002J\u0010\u0010P\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010Q\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010R\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010S\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010T\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010U\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010V\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010W\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010X\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010Y\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010Z\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010[\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010]\u001a\u00020\\2\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J\b\u0010^\u001a\u00020\u0011H\u0002J\u0010\u0010_\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010`\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010a\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010c\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010d\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010g\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010h\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010k\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u00172\u0006\u0010j\u001a\u00020\u0017H\u0002J\u001d\u0010n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00042\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bn\u0010oJ \u0010q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020D0p2\u0006\u0010m\u001a\u00020lR\u0016\u0010t\u001a\u00020r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010sR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010uR\u0016\u0010v\u001a\u00020\\8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00108R\u001d\u0010z\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010w\u001a\u0004\bx\u0010yR\u001d\u0010|\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010w\u001a\u0004\b{\u0010yR\u001d\u0010~\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010w\u001a\u0004\b}\u0010yR\u001e\u0010\u0080\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010w\u001a\u0004\b\u007f\u0010yR\u001f\u0010\u0082\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u000f\u0010w\u001a\u0005\b\u0081\u0001\u0010yR\u001f\u0010\u0084\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u000e\u0010w\u001a\u0005\b\u0083\u0001\u0010yR\u001f\u0010\u0086\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\r\u0010w\u001a\u0005\b\u0085\u0001\u0010yR\u001f\u0010\u0088\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bb\u0010w\u001a\u0005\b\u0087\u0001\u0010yR\u001f\u0010\u008a\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bg\u0010w\u001a\u0005\b\u0089\u0001\u0010yR\u001f\u0010\u008c\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bS\u0010w\u001a\u0005\b\u008b\u0001\u0010yR\u001f\u0010\u008e\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b$\u0010w\u001a\u0005\b\u008d\u0001\u0010yR\u001f\u0010\u0090\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bA\u0010w\u001a\u0005\b\u008f\u0001\u0010yR\u001f\u0010\u0092\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b,\u0010w\u001a\u0005\b\u0091\u0001\u0010yR\u001f\u0010\u0094\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bW\u0010w\u001a\u0005\b\u0093\u0001\u0010yR\u001f\u0010\u0096\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bX\u0010w\u001a\u0005\b\u0095\u0001\u0010yR\u001f\u0010\u0098\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bU\u0010w\u001a\u0005\b\u0097\u0001\u0010yR\u001f\u0010\u009a\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u0015\u0010w\u001a\u0005\b\u0099\u0001\u0010yR\u001f\u0010\u009c\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u0014\u0010w\u001a\u0005\b\u009b\u0001\u0010yR\u001f\u0010\u009e\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b)\u0010w\u001a\u0005\b\u009d\u0001\u0010yR\u001f\u0010 \u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u0013\u0010w\u001a\u0005\b\u009f\u0001\u0010yR\u001f\u0010¢\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b&\u0010w\u001a\u0005\b¡\u0001\u0010yR\u001f\u0010¤\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b?\u0010w\u001a\u0005\b£\u0001\u0010yR\u001f\u0010¦\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b(\u0010w\u001a\u0005\b¥\u0001\u0010yR\u001f\u0010¨\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b_\u0010w\u001a\u0005\b§\u0001\u0010yR\u001f\u0010ª\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b0\u0010w\u001a\u0005\b©\u0001\u0010yR\u001f\u0010¬\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u001c\u0010w\u001a\u0005\b«\u0001\u0010yR\u001f\u0010®\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u001d\u0010w\u001a\u0005\b\u00ad\u0001\u0010yR\u001f\u0010°\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b9\u0010w\u001a\u0005\b¯\u0001\u0010yR\u001f\u0010²\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b>\u0010w\u001a\u0005\b±\u0001\u0010yR\u001f\u0010´\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bR\u0010w\u001a\u0005\b³\u0001\u0010yR\u001f\u0010¶\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b'\u0010w\u001a\u0005\bµ\u0001\u0010yR\u001f\u0010¸\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b[\u0010w\u001a\u0005\b·\u0001\u0010yR\u001f\u0010º\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u0016\u0010w\u001a\u0005\b¹\u0001\u0010yR\u001f\u0010¼\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bd\u0010w\u001a\u0005\b»\u0001\u0010yR\u001f\u0010¾\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b%\u0010w\u001a\u0005\b½\u0001\u0010yR\u001f\u0010À\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b@\u0010w\u001a\u0005\b¿\u0001\u0010yR\u001f\u0010Â\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b-\u0010w\u001a\u0005\bÁ\u0001\u0010yR\u001f\u0010Ä\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bT\u0010w\u001a\u0005\bÃ\u0001\u0010yR\u001f\u0010Æ\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b6\u0010w\u001a\u0005\bÅ\u0001\u0010yR\u001f\u0010È\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b#\u0010w\u001a\u0005\bÇ\u0001\u0010yR\u001f\u0010Ê\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\ba\u0010w\u001a\u0005\bÉ\u0001\u0010yR\u001f\u0010Ì\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bc\u0010w\u001a\u0005\bË\u0001\u0010yR\u001f\u0010Î\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bh\u0010w\u001a\u0005\bÍ\u0001\u0010yR\u001f\u0010Ð\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\be\u0010w\u001a\u0005\bÏ\u0001\u0010yR\u001f\u0010Ò\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bZ\u0010w\u001a\u0005\bÑ\u0001\u0010yR\u001f\u0010Ô\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bI\u0010w\u001a\u0005\bÓ\u0001\u0010yR\u001f\u0010Ö\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b4\u0010w\u001a\u0005\bÕ\u0001\u0010yR\u001f\u0010Ø\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b<\u0010w\u001a\u0005\b×\u0001\u0010yR\u001f\u0010Ú\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b8\u0010w\u001a\u0005\bÙ\u0001\u0010yR\u001f\u0010Ü\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bP\u0010w\u001a\u0005\bÛ\u0001\u0010yR\u001f\u0010Þ\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bQ\u0010w\u001a\u0005\bÝ\u0001\u0010yR\u001f\u0010à\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b3\u0010w\u001a\u0005\bß\u0001\u0010yR\u001f\u0010â\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b \u0010w\u001a\u0005\bá\u0001\u0010yR\u001f\u0010ä\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u001f\u0010w\u001a\u0005\bã\u0001\u0010yR\u001f\u0010æ\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b!\u0010w\u001a\u0005\bå\u0001\u0010yR\u001f\u0010è\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b+\u0010w\u001a\u0005\bç\u0001\u0010yR\u001f\u0010ê\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bV\u0010w\u001a\u0005\bé\u0001\u0010yR\u0018\u0010ì\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0007\n\u0005\b*\u0010ë\u0001R\u0018\u0010í\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0007\n\u0005\bk\u0010ë\u0001R\u001f\u0010ï\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b=\u0010w\u001a\u0005\bî\u0001\u0010yR\u001f\u0010ñ\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b:\u0010w\u001a\u0005\bð\u0001\u0010yR\u001f\u0010ó\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u001e\u0010w\u001a\u0005\bò\u0001\u0010yR\u001f\u0010õ\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b`\u0010w\u001a\u0005\bô\u0001\u0010yR\u001f\u0010÷\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bf\u0010w\u001a\u0005\bö\u0001\u0010yR\u001f\u0010ù\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b.\u0010w\u001a\u0005\bø\u0001\u0010yR\u001f\u0010û\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bY\u0010w\u001a\u0005\bú\u0001\u0010yR\u001f\u0010ý\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b2\u0010w\u001a\u0005\bü\u0001\u0010yR \u0010ÿ\u0001\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bô\u0001\u0010w\u001a\u0005\bþ\u0001\u0010yR \u0010\u0081\u0002\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bþ\u0001\u0010w\u001a\u0005\b\u0080\u0002\u0010y¨\u0006\u0084\u0002"}, d2 = {"Lcom/huami/moving/ui/sport/detail/manager/SportDataItemHandler;", "", "", "json", "", "", "a", "(Ljava/lang/String;)[[J", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "f", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;)[Ljava/lang/String;", "e", com.loc.z.j, "i", "h", "g", "", "value", "w", "u", "t", "J", "", "Lkotlin/Function1;", TransportUri.ACTION_BLOCK, "K1", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "C", LogUtil.D, "m0", "e0", "d0", "f0", "maxStep", "Q", GoogleApiAvailabilityLight.b, "L", "x", "H", "z", "v", "i0", "g0", com.google.android.exoplayer2.text.ttml.b.r, "N", "p0", "costTime", "B", "(Ljava/lang/Integer;)Ljava/lang/String;", "r0", "c0", "X", "speed", "P", "(Ljava/lang/Float;)Ljava/lang/String;", "Z", "E", "l0", "frequency", "Y", "k0", "F", "y", "M", "o", "name", "", "Lkotlin/Pair;", "invalidList", "effectiveList", "", "J1", "W", "trackrecord", "c", GoogleApiAvailabilityLight.a, "landingTime", "totalStep", "b", "a0", "b0", "G", "m", "O", SOAP.XMLNS, "h0", DTransferConstants.SEARCH_KEY, "r", "q0", "V", LogUtil.I, "", "H1", "I1", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "n0", "R", hl.k, ExifInterface.LATITUDE_SOUTH, "K", "U", "o0", "l", ExifInterface.GPS_DIRECTION_TRUE, "type", "index", "j0", "Lcom/huami/moving/ui/sport/detail/data/SportShowDataBean;", LargeWatchSkinActivity.KEY_BEAN, "handleSportMainData", "(Lcom/huami/moving/ui/sport/detail/data/SportShowDataBean;)[Ljava/lang/String;", "", "handleSportSubData", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", TdmillHmFragment.ARG_IS_METRIC, "Lkotlin/Lazy;", "P0", "()Ljava/lang/String;", "defaultValue", "D0", "avgSpeedAlloc", "C0", "avgSpeed", "W0", "hundredMeter", "t1", "stride", "s1", "stepNumber", "u1", "strideFrequency", "L0", GetWatermarkAPI.KEY_NAME_CONSUME, "E0", "avgStroke", "y1", "swolf", "w1", "swimStyle", "y0", "avgHeartRate", "b1", "maxHeartRate", "F1", SportAnalytics.ParamValue.ChartType.CHART_TRAINING_EFFECT, "k1", "pauseTime", "d1", "maxSpeed", "j1", "number_downslides", "O0", "cumulative_slippage", "E1", "total_down", "H0", "bestPace", "u0", "average_frequency", "V0", "highest_frequency", "R0", "fore_hand_count", "F0", "back_hand_count", "n1", "serve_count", "S0", "fore_hand_percent", "G0", "back_hand_percent", "o1", "serve_percent", "l1", "rateFfPercent", "z1", "timeTouchDown", "D1", "totalTime", "r1", "sportTime", "N0", "cumulativeRise", "M0", "cumulativeClimb", "e1", "maxStepFreq", "x0", "avgDistancePerStroke", "m1", "ruCostTime", com.alipay.sdk.m.x.c.c, "swimCostTime", "I0", "bikeCostTime", "K0", "cadence", "a1", "maxCadence", "Q0", "flyRadio", "w0", "avgBoatingFre", "Z0", "maxBoatingFre", "J0", "breakTime", "T0", "groupNum", "p1", "spo2Max", "q1", "spo2Min", "A1", "totalRestBetSets", "v0", "avgAltitude", "c1", "maxSlope", "B0", "avgSlope", "x1", "swimTrips", "z0", "avgPulloarTime", "A0", "avgReturnTime", "G1", "upstairsHeight", "i1", "minUpstairsFloors", "Ljava/lang/String;", "JSON_NAME_TRACKID", "JSON_NAME_SPORTTYPE", "X0", "hundredMeterBest", "B1", "totalStrokes", "h1", "maximumStrokeSpeed", "s0", "accumulatedGlideDistance", "f1", "maximumFall", "U0", "highestAltitude", "Y0", "lowestAltitude", "C1", "totalSwingTimes", "t0", "averagePressure", "g1", "maximumPressure", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/databases/model/Trackrecord;Z)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataItemHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Trackrecord record;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isMetric;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultValue = LazyKt__LazyJVMKt.lazy(new x());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgSpeedAlloc = LazyKt__LazyJVMKt.lazy(new l());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgSpeed = LazyKt__LazyJVMKt.lazy(new k());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy hundredMeter = LazyKt__LazyJVMKt.lazy(new l1());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy stride = LazyKt__LazyJVMKt.lazy(new i2());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy stepNumber = LazyKt__LazyJVMKt.lazy(new h2());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy strideFrequency = LazyKt__LazyJVMKt.lazy(new j2());

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy consume = LazyKt__LazyJVMKt.lazy(new t());

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgStroke = LazyKt__LazyJVMKt.lazy(new m());

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy swolf = LazyKt__LazyJVMKt.lazy(new n2());

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy swimStyle = LazyKt__LazyJVMKt.lazy(new l2());

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgHeartRate = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxHeartRate = LazyKt__LazyJVMKt.lazy(new q1());

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy trainingEffect = LazyKt__LazyJVMKt.lazy(new u2());

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy pauseTime = LazyKt__LazyJVMKt.lazy(new z1());

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxSpeed = LazyKt__LazyJVMKt.lazy(new s1());

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Lazy number_downslides = LazyKt__LazyJVMKt.lazy(new y1());

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy cumulative_slippage = LazyKt__LazyJVMKt.lazy(new w());

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Lazy total_down = LazyKt__LazyJVMKt.lazy(new t2());

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final Lazy bestPace = LazyKt__LazyJVMKt.lazy(new p());

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy average_frequency = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy highest_frequency = LazyKt__LazyJVMKt.lazy(new k1());

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy fore_hand_count = LazyKt__LazyJVMKt.lazy(new z());

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy back_hand_count = LazyKt__LazyJVMKt.lazy(new n());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy serve_count = LazyKt__LazyJVMKt.lazy(new c2());

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy fore_hand_percent = LazyKt__LazyJVMKt.lazy(new a0());

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy back_hand_percent = LazyKt__LazyJVMKt.lazy(new o());

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy serve_percent = LazyKt__LazyJVMKt.lazy(new d2());

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Lazy rateFfPercent = LazyKt__LazyJVMKt.lazy(new a2());

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeTouchDown = LazyKt__LazyJVMKt.lazy(new o2());

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final Lazy totalTime = LazyKt__LazyJVMKt.lazy(new s2());

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportTime = LazyKt__LazyJVMKt.lazy(new g2());

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final Lazy cumulativeRise = LazyKt__LazyJVMKt.lazy(new v());

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final Lazy cumulativeClimb = LazyKt__LazyJVMKt.lazy(new u());

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxStepFreq = LazyKt__LazyJVMKt.lazy(new t1());

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgDistancePerStroke = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private final Lazy ruCostTime = LazyKt__LazyJVMKt.lazy(new b2());

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    private final Lazy swimCostTime = LazyKt__LazyJVMKt.lazy(new k2());

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    private final Lazy bikeCostTime = LazyKt__LazyJVMKt.lazy(new q());

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    private final Lazy cadence = LazyKt__LazyJVMKt.lazy(new s());

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxCadence = LazyKt__LazyJVMKt.lazy(new p1());

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    private final Lazy flyRadio = LazyKt__LazyJVMKt.lazy(new y());

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgBoatingFre = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxBoatingFre = LazyKt__LazyJVMKt.lazy(new o1());

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    private final Lazy breakTime = LazyKt__LazyJVMKt.lazy(new r());

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    private final Lazy groupNum = LazyKt__LazyJVMKt.lazy(new i1());

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    private final Lazy spo2Max = LazyKt__LazyJVMKt.lazy(new e2());

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    private final Lazy spo2Min = LazyKt__LazyJVMKt.lazy(new f2());

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    private final Lazy totalRestBetSets = LazyKt__LazyJVMKt.lazy(new p2());

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgAltitude = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxSlope = LazyKt__LazyJVMKt.lazy(new r1());

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgSlope = LazyKt__LazyJVMKt.lazy(new j());

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    @NotNull
    private final Lazy swimTrips = LazyKt__LazyJVMKt.lazy(new m2());

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgPulloarTime = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgReturnTime = LazyKt__LazyJVMKt.lazy(new i());

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    @NotNull
    private final Lazy upstairsHeight = LazyKt__LazyJVMKt.lazy(new v2());

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    @NotNull
    private final Lazy minUpstairsFloors = LazyKt__LazyJVMKt.lazy(new x1());

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @NotNull
    private final String JSON_NAME_TRACKID = "trackid";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @NotNull
    private final String JSON_NAME_SPORTTYPE = "type";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    @NotNull
    private final Lazy hundredMeterBest = LazyKt__LazyJVMKt.lazy(new m1());

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    @NotNull
    private final Lazy totalStrokes = LazyKt__LazyJVMKt.lazy(new q2());

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @NotNull
    private final Lazy maximumStrokeSpeed = LazyKt__LazyJVMKt.lazy(new w1());

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @NotNull
    private final Lazy accumulatedGlideDistance = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    @NotNull
    private final Lazy maximumFall = LazyKt__LazyJVMKt.lazy(new u1());

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    @NotNull
    private final Lazy highestAltitude = LazyKt__LazyJVMKt.lazy(new j1());

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    @NotNull
    private final Lazy lowestAltitude = LazyKt__LazyJVMKt.lazy(new n1());

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    @NotNull
    private final Lazy totalSwingTimes = LazyKt__LazyJVMKt.lazy(new r2());

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    @NotNull
    private final Lazy averagePressure = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    @NotNull
    private final Lazy maximumPressure = LazyKt__LazyJVMKt.lazy(new v1());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.accumulated_glide_distance);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.fore_hand_ratio);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a1 extends Lambda implements Function1<Integer, String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(int i) {
            super(1);
            this.a = i;
        }

        @NotNull
        public final String a(int i) {
            return this.a + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + i + "%";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a2 extends Lambda implements Function0<String> {
        public a2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.ffpercent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.card_average_pressure);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function1<Integer, String> {
        public final /* synthetic */ Trackrecord a;
        public final /* synthetic */ SportDataItemHandler b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(Trackrecord trackrecord, SportDataItemHandler sportDataItemHandler) {
            super(1);
            this.a = trackrecord;
            this.b = sportDataItemHandler;
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(RunDataConversion.convertMeterToKmOrMile(this.a.getClimbDisDescend().intValue(), this.b.isMetric));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b1 extends Lambda implements Function1<Integer, String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(int i) {
            super(1);
            this.a = i;
        }

        @NotNull
        public final String a(int i) {
            return this.a + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + i + "%";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b2 extends Lambda implements Function0<String> {
        public b2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.run_time_cost);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.average_frequency);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final c0 a = new c0();

        public c0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c1 extends Lambda implements Function1<Integer, String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(int i) {
            super(1);
            this.a = i;
        }

        @NotNull
        public final String a(int i) {
            return this.a + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + i + "%";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c2 extends Lambda implements Function0<String> {
        public c2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.serve_count);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.average_altitude);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final d0 a = new d0();

        public d0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d1 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final d1 a = new d1();

        public d1() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d2 extends Lambda implements Function0<String> {
        public d2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.serve_ratio);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.sport_data_avg_boating_fre);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class e0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final e0 a = new e0();

        public e0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e1 extends Lambda implements Function1<Integer, String> {
        public e1() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return RunDataConversion.parseAltitude(i, SportDataItemHandler.this.isMetric);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e2 extends Lambda implements Function0<String> {
        public e2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.sport_detail_spo2_max);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.avg_distance_perStroke);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class f0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final f0 a = new f0();

        public f0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class f1 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final f1 a = new f1();

        public f1() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f2 extends Lambda implements Function0<String> {
        public f2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.sport_detail_spo2_min);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.running_indoor_averag_heart_rate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class g0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final g0 a = new g0();

        public g0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class g1 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final g1 a = new g1();

        public g1() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g2 extends Lambda implements Function0<String> {
        public g2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.sport_time_cost);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.avg_propeller_pulling_time);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h0 extends Lambda implements Function1<Integer, String> {
        public h0() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return RunDataConversion.parseAltitude(i, SportDataItemHandler.this.isMetric);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h1 extends Lambda implements Function1<Integer, String> {
        public static final h1 a = new h1();

        public h1() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return NumberFormatter.formatFloat2StringByLocale(i / 10.0f, 1, new int[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h2 extends Lambda implements Function0<String> {
        public h2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.running_step);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.avg_propeller_collecting_time);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i0 extends Lambda implements Function1<Integer, String> {
        public i0() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return RunDataConversion.parseAltitude(i, SportDataItemHandler.this.isMetric);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i1 extends Lambda implements Function0<String> {
        public i1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.total_number_of_groups);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i2 extends Lambda implements Function0<String> {
        public i2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.average_stride);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.average_slope);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class j0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final j0 a = new j0();

        public j0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j1 extends Lambda implements Function0<String> {
        public j1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.highest_altitude);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j2 extends Lambda implements Function0<String> {
        public j2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.average_cadence);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.running_average_speed);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k0 extends Lambda implements Function1<Integer, String> {
        public static final k0 a = new k0();

        public k0() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return i + "%";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k1 extends Lambda implements Function0<String> {
        public k1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.highest_frequency);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k2 extends Lambda implements Function0<String> {
        public k2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.swim_time_cost);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.running_avg_speed_pace);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class l0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final l0 a = new l0();

        public l0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l1 extends Lambda implements Function0<String> {
        public l1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            boolean z = SportDataItemHandler.this.isMetric;
            if (z) {
                return SportDataItemHandler.this.context.getString(R.string.average_pace_100_meters);
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return SportDataItemHandler.this.context.getString(R.string.average_pace_100_yards);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l2 extends Lambda implements Function0<String> {
        public l2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.main_stroke);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.average_stroke_speed);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class m0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final m0 a = new m0();

        public m0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m1 extends Lambda implements Function0<String> {
        public m1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            boolean z = SportDataItemHandler.this.isMetric;
            if (z) {
                return SportDataItemHandler.this.context.getString(R.string.best_pace_100_meters);
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return SportDataItemHandler.this.context.getString(R.string.best_pace_100_yards);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m2 extends Lambda implements Function0<String> {
        public m2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.number_of_trips);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.back_hand_count);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class n0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final n0 a = new n0();

        public n0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n1 extends Lambda implements Function0<String> {
        public n1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.lowest_altitude);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n2 extends Lambda implements Function0<String> {
        public n2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.over_view_swolf);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.back_hand_ratio);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class o0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final o0 a = new o0();

        public o0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o1 extends Lambda implements Function0<String> {
        public o1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.sport_data_max_boating_fre);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o2 extends Lambda implements Function0<String> {
        public o2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.time_touchdown);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.running_bigger_speed_pace);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class p0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final p0 a = new p0();

        public p0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p1 extends Lambda implements Function0<String> {
        public p1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.max_cadence);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p2 extends Lambda implements Function0<String> {
        public p2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.total_rest_time_between_sets);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.bike_time_cost);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class q0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final q0 a = new q0();

        public q0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q1 extends Lambda implements Function0<String> {
        public q1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.maximum_heart_rate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q2 extends Lambda implements Function0<String> {
        public q2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.total_strokes);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.rest_time);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class r0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final r0 a = new r0();

        public r0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r1 extends Lambda implements Function0<String> {
        public r1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.maximum_slope);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r2 extends Lambda implements Function0<String> {
        public r2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.total_swing_times);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.cadence);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class s0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final s0 a = new s0();

        public s0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s1 extends Lambda implements Function0<String> {
        public s1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.sport_maximum_speed);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s2 extends Lambda implements Function0<String> {
        public s2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.total_time_cost);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.running_burn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class t0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final t0 a = new t0();

        public t0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t1 extends Lambda implements Function0<String> {
        public t1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.highest_cadence);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t2 extends Lambda implements Function0<String> {
        public t2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.running_total_down);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.cumulative_climp);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class u0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final u0 a = new u0();

        public u0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u1 extends Lambda implements Function0<String> {
        public u1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.maximum_fall);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u2 extends Lambda implements Function0<String> {
        public u2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.sport_training_effect_aerobic);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.cumulative_rising_altitude);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class v0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final v0 a = new v0();

        public v0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v1 extends Lambda implements Function0<String> {
        public v1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.card_maximum_pressure);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v2 extends Lambda implements Function0<String> {
        public v2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.ascent_height);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.cumulative_slippage);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w0 extends Lambda implements Function1<Integer, String> {
        public w0() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return RunDataConversion.parseStrideLength(i, SportDataItemHandler.this.isMetric);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w1 extends Lambda implements Function0<String> {
        public w1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.maximum_stroke_speed);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.running_pace_empty);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class x0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final x0 a = new x0();

        public x0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x1 extends Lambda implements Function0<String> {
        public x1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.upstairs_frequency);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.flight_ratio);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class y0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final y0 a = new y0();

        public y0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y1 extends Lambda implements Function0<String> {
        public y1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.number_downslides);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<String> {
        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.fore_hand_count);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class z0 extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final z0 a = new z0();

        public z0() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z1 extends Lambda implements Function0<String> {
        public z1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SportDataItemHandler.this.context.getString(R.string.pause_time_cost);
        }
    }

    public SportDataItemHandler(@NotNull Context context, @NotNull Trackrecord trackrecord, boolean z2) {
        this.context = context;
        this.record = trackrecord;
        this.isMetric = z2;
    }

    private final String A(float value) {
        String strPaceConvertToSpeed = RunDataConversion.paceConvertToSpeed(value, this.isMetric);
        return strPaceConvertToSpeed == null ? P0() : strPaceConvertToSpeed;
    }

    private final String A0() {
        return (String) this.avgReturnTime.getValue();
    }

    private final String A1() {
        return (String) this.totalRestBetSets.getValue();
    }

    private final String B(Integer costTime) {
        String consumeTime = null;
        if (costTime != null) {
            if (!(costTime.intValue() > 0)) {
                costTime = null;
            }
            if (costTime != null) {
                consumeTime = DataFormatter.getConsumeTime(costTime.intValue());
            }
        }
        return consumeTime == null ? P0() : consumeTime;
    }

    private final String B0() {
        return (String) this.avgSlope.getValue();
    }

    private final String B1() {
        return (String) this.totalStrokes.getValue();
    }

    private final String C(Trackrecord record) {
        return K1(record.getClimbDisascend(), new h0());
    }

    private final String C0() {
        return (String) this.avgSpeed.getValue();
    }

    private final String C1() {
        return (String) this.totalSwingTimes.getValue();
    }

    private final String D(Trackrecord record) {
        return K1(record.getAltitudeAscend(), new i0());
    }

    private final String D0() {
        return (String) this.avgSpeedAlloc.getValue();
    }

    private final String D1() {
        return (String) this.totalTime.getValue();
    }

    private final String E(Trackrecord record) {
        return K1(Integer.valueOf(record.getDownhillNumber()), j0.a);
    }

    private final String E0() {
        return (String) this.avgStroke.getValue();
    }

    private final String E1() {
        return (String) this.total_down.getValue();
    }

    private final String F(Trackrecord record) {
        return K1(record.getFfpercent(), k0.a);
    }

    private final String F0() {
        return (String) this.back_hand_count.getValue();
    }

    private final String F1() {
        return (String) this.trainingEffect.getValue();
    }

    private final String G(Trackrecord record) {
        return K1(Integer.valueOf(record.getFloorNumber()), l0.a);
    }

    private final String G0() {
        return (String) this.back_hand_percent.getValue();
    }

    private final String G1() {
        return (String) this.upstairsHeight.getValue();
    }

    private final String H(Trackrecord record) {
        return K1(Integer.valueOf(record.getTotalGroup()), m0.a);
    }

    private final String H0() {
        return (String) this.bestPace.getValue();
    }

    private final boolean H1(int value) {
        RunnerPeripheralInfo runnerPeripheralInfo = RunnerPeripheralInfo.getInstance();
        int height = (runnerPeripheralInfo == null || runnerPeripheralInfo.getHeight() <= 0) ? 170 : runnerPeripheralInfo.getHeight();
        return value <= height && ((float) value) >= ((float) height) * 0.25f;
    }

    private final String I(float value) {
        Integer type = this.record.getType();
        String str = DataFormatter.getFormatPaceAndUnit(value, type == null ? 1 : type.intValue(), this.isMetric)[0];
        return str == null ? P0() : str;
    }

    private final String I0() {
        return (String) this.bikeCostTime.getValue();
    }

    private final float I1() {
        if (this.record.getMinrtp().floatValue() <= 0.0f) {
            return this.record.getMaxrtp().floatValue();
        }
        if (this.record.getMaxrtp().floatValue() <= 0.0f) {
            return this.record.getMinrtp().floatValue();
        }
        return (this.record.getMinrtp().floatValue() < this.record.getMaxrtp().floatValue() ? this.record.getMinrtp() : this.record.getMaxrtp()).floatValue();
    }

    private final String J(Trackrecord record) {
        String str;
        Float pace = record.getPace();
        if (pace == null) {
            str = null;
        } else {
            float fFloatValue = pace.floatValue();
            Integer type = record.getType();
            str = DataFormatter.getFormatPaceAndUnit(fFloatValue, type == null ? 1 : type.intValue(), this.isMetric)[0];
        }
        return str == null ? P0() : str;
    }

    private final String J0() {
        return (String) this.breakTime.getValue();
    }

    private final void J1(String value, String name, List<Pair<String, String>> invalidList, List<Pair<String, String>> effectiveList) {
        boolean zAreEqual = Intrinsics.areEqual(value, P0());
        if (zAreEqual) {
            invalidList.add(TuplesKt.to(name, value));
        } else {
            if (zAreEqual) {
                return;
            }
            effectiveList.add(TuplesKt.to(name, value));
        }
    }

    private final String K(Trackrecord record) {
        Integer numValueOf = Integer.valueOf(record.getMaxAltitude());
        if (!RunUtils.isAltiMeterValid(numValueOf.intValue())) {
            numValueOf = null;
        }
        String string = numValueOf != null ? numValueOf.toString() : null;
        return string == null ? P0() : string;
    }

    private final String K0() {
        return (String) this.cadence.getValue();
    }

    private final String K1(Integer value, Function1<? super Integer, String> block) {
        String strInvoke = null;
        if (value != null) {
            if (!(value.intValue() > 0)) {
                value = null;
            }
            if (value != null) {
                strInvoke = block.invoke(value);
            }
        }
        return strInvoke == null ? P0() : strInvoke;
    }

    private final String L(Trackrecord record) {
        return K1(Integer.valueOf(record.getMaxSFreq()), n0.a);
    }

    private final String L0() {
        return (String) this.consume.getValue();
    }

    private final String M(Trackrecord record) {
        return K1(record.getMaxCadence(), o0.a);
    }

    private final String M0() {
        return (String) this.cumulativeClimb.getValue();
    }

    private final String N(Trackrecord record) {
        Integer maxHR = record.getMaxHR();
        String strValueOf = null;
        if (maxHR != null) {
            if (!HeartRateConstant.isHRValueValid(maxHR.intValue())) {
                maxHR = null;
            }
            if (maxHR != null) {
                strValueOf = String.valueOf(maxHR.intValue());
            }
        }
        return strValueOf == null ? P0() : strValueOf;
    }

    private final String N0() {
        return (String) this.cumulativeRise.getValue();
    }

    private final String O(Trackrecord record) {
        return K1(Integer.valueOf(record.getMaxSlope()), p0.a);
    }

    private final String O0() {
        return (String) this.cumulative_slippage.getValue();
    }

    private final String P(Float speed) {
        String float2StringByLocale;
        if (speed == null) {
            float2StringByLocale = null;
        } else {
            float fConvertTokmph = RunDataConversion.convertTokmph(speed.floatValue());
            if (!this.isMetric) {
                fConvertTokmph = (float) (((double) fConvertTokmph) / 1.609344d);
            }
            float2StringByLocale = NumberFormatter.formatFloat2StringByLocale(fConvertTokmph, 2, 4);
        }
        return float2StringByLocale == null ? P0() : float2StringByLocale;
    }

    private final String P0() {
        return (String) this.defaultValue.getValue();
    }

    private final String Q(int maxStep) {
        return K1(Integer.valueOf(maxStep), q0.a);
    }

    private final String Q0() {
        return (String) this.flyRadio.getValue();
    }

    private final String R(Trackrecord record) {
        Float swimMaxStrokeSpeed = record.getSwimMaxStrokeSpeed();
        String strValueOf = null;
        if (swimMaxStrokeSpeed != null) {
            if (!(swimMaxStrokeSpeed.floatValue() > 0.0f)) {
                swimMaxStrokeSpeed = null;
            }
            if (swimMaxStrokeSpeed != null) {
                strValueOf = String.valueOf(kotlin.math.c.roundToInt(swimMaxStrokeSpeed.floatValue() * 60));
            }
        }
        return strValueOf == null ? P0() : strValueOf;
    }

    private final String R0() {
        return (String) this.fore_hand_count.getValue();
    }

    private final String S(Trackrecord record) {
        return K1(Integer.valueOf(record.getMaxDownhillFallMileage()), r0.a);
    }

    private final String S0() {
        return (String) this.fore_hand_percent.getValue();
    }

    private final String T(Trackrecord record) {
        return K1(Integer.valueOf(record.getMaximumPressure()), s0.a);
    }

    private final String T0() {
        return (String) this.groupNum.getValue();
    }

    private final String U(Trackrecord record) {
        Integer numValueOf = Integer.valueOf(record.getMinAltitude());
        if (!RunUtils.isAltiMeterValid(numValueOf.intValue())) {
            numValueOf = null;
        }
        String string = numValueOf != null ? numValueOf.toString() : null;
        return string == null ? P0() : string;
    }

    private final String U0() {
        return (String) this.highestAltitude.getValue();
    }

    private final String V(Trackrecord record) {
        Float minUpstairsFloors = record.getMinUpstairsFloors();
        if (!(minUpstairsFloors.floatValue() > 0.0f)) {
            minUpstairsFloors = null;
        }
        String float2String = minUpstairsFloors != null ? DataFormatter.formatFloat2String(minUpstairsFloors.floatValue(), 2, new int[0]) : null;
        return float2String == null ? P0() : float2String;
    }

    private final String V0() {
        return (String) this.highest_frequency.getValue();
    }

    private final void W(String name, List<Pair<String, String>> invalidList, List<Pair<String, String>> effectiveList) {
        long[][] jArrA = a(this.record.getChildListData());
        if (jArrA == null) {
            return;
        }
        int i3 = 0;
        long[] jArr = jArrA[0];
        int length = jArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i4 = i3 + 1;
            Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(jArr[i3], this.record.getSource().intValue());
            Integer type = trackRecordById.getType();
            if (type != null && type.intValue() == 1001) {
                if (Intrinsics.areEqual(name, m1())) {
                    J1(B(trackRecordById.getCosttime()), name, invalidList, effectiveList);
                }
            } else if (type != null && type.intValue() == 1009) {
                if (Intrinsics.areEqual(name, I0())) {
                    J1(B(trackRecordById.getCosttime()), name, invalidList, effectiveList);
                }
            } else if (type != null && type.intValue() == 1015 && Intrinsics.areEqual(name, v1())) {
                J1(B(trackRecordById.getCosttime()), name, invalidList, effectiveList);
            }
            if (i4 > length) {
                return;
            } else {
                i3 = i4;
            }
        }
    }

    private final String W0() {
        return (String) this.hundredMeter.getValue();
    }

    private final String X(Trackrecord record) {
        Integer pauseTime;
        if (record.getPauseTime() != null && ((pauseTime = record.getPauseTime()) == null || pauseTime.intValue() != -1)) {
            Integer pauseTime2 = record.getPauseTime();
            String consumeTime = null;
            if (pauseTime2 != null) {
                if (!(pauseTime2.intValue() > 0)) {
                    pauseTime2 = null;
                }
                if (pauseTime2 != null) {
                    consumeTime = DataFormatter.getConsumeTime(pauseTime2.intValue());
                }
            }
            return consumeTime == null ? P0() : consumeTime;
        }
        if (record.getEndtime() == null || record.getCosttime() == null) {
            return P0();
        }
        String consumeTime2 = DataFormatter.getConsumeTime(((record.getEndtime().longValue() - record.getTrackid().longValue()) - record.getCosttime().longValue()) - (record.getRopeSkippingRestTime() >= 0 ? record.getRopeSkippingRestTime() : 0L));
        boolean zAreEqual = Intrinsics.areEqual(consumeTime2, "00:00:00");
        if (zAreEqual) {
            consumeTime2 = P0();
        } else if (zAreEqual) {
            throw new NoWhenBranchMatchedException();
        }
        return consumeTime2;
    }

    private final String X0() {
        return (String) this.hundredMeterBest.getValue();
    }

    private final String Y(Integer frequency) {
        return K1(frequency, t0.a);
    }

    private final String Y0() {
        return (String) this.lowestAltitude.getValue();
    }

    private final String Z(Trackrecord record) {
        return K1(Integer.valueOf(record.getAccumulatedGap()), u0.a);
    }

    private final String Z0() {
        return (String) this.maxBoatingFre.getValue();
    }

    private final long[][] a(String json) {
        long[][] jArr = null;
        if (TextUtils.isEmpty(json)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(json);
            long[][] jArr2 = new long[2][];
            for (int i3 = 0; i3 < 2; i3++) {
                jArr2[i3] = new long[jSONArray.length()];
            }
            try {
                int length = jSONArray.length();
                if (length > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        long j3 = jSONArray.getJSONObject(i4).getLong(this.JSON_NAME_TRACKID);
                        int i6 = jSONArray.getJSONObject(i4).getInt(this.JSON_NAME_SPORTTYPE);
                        jArr2[0][i4] = j3;
                        jArr2[1][i4] = i6;
                        if (i5 >= length) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                return jArr2;
            } catch (JSONException e3) {
                e = e3;
                jArr = jArr2;
                e.printStackTrace();
                return jArr;
            }
        } catch (JSONException e4) {
            e = e4;
        }
    }

    private final String a0(Trackrecord record) {
        Integer numValueOf = Integer.valueOf(record.getSpo2Max());
        String str = null;
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            str = numValueOf.intValue() + "%";
        }
        return str == null ? P0() : str;
    }

    private final String a1() {
        return (String) this.maxCadence.getValue();
    }

    private final int b(int landingTime, int totalStep) {
        if (totalStep <= 0) {
            totalStep = 1;
        }
        int i3 = landingTime / totalStep;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    private final String b0(Trackrecord record) {
        Integer numValueOf = Integer.valueOf(record.getSpo2Min());
        String str = null;
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            str = numValueOf.intValue() + "%";
        }
        return str == null ? P0() : str;
    }

    private final String b1() {
        return (String) this.maxHeartRate.getValue();
    }

    private final String c(Trackrecord trackrecord) {
        Integer leftFlightRatio = trackrecord.getLeftFlightRatio();
        int iIntValue = leftFlightRatio == null ? 0 : leftFlightRatio.intValue();
        Integer rightFlightRatio = trackrecord.getRightFlightRatio();
        int iIntValue2 = rightFlightRatio == null ? 0 : rightFlightRatio.intValue();
        Integer flightRatio = trackrecord.getFlightRatio();
        int iIntValue3 = flightRatio == null ? 0 : flightRatio.intValue();
        boolean zIsSmartTShirt = SportDeviceUtils.isSmartTShirt(trackrecord.getDevice());
        if (SportDeviceUtils.isSmartShoe(trackrecord.getDevice())) {
            zIsSmartTShirt = true;
        }
        if (!zIsSmartTShirt) {
            return P0();
        }
        String string = this.context.getString(R.string.sports_left_feet);
        Context context = this.context;
        int i3 = R.string.runningdetail_flytime_ratio;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(iIntValue < 0 ? 0 : iIntValue);
        String str = string + context.getString(i3, objArr);
        String string2 = this.context.getString(R.string.sports_right_feet);
        Context context2 = this.context;
        Object[] objArr2 = new Object[1];
        objArr2[0] = Integer.valueOf(iIntValue2 < 0 ? 0 : iIntValue2);
        String str2 = string2 + context2.getString(i3, objArr2);
        String str3 = str + " | " + str2;
        if (iIntValue <= 0 && iIntValue2 <= 0) {
            return iIntValue3 > 0 ? this.context.getString(R.string.runningdetail_forefoot_ratio, Integer.valueOf(iIntValue3)) : P0();
        }
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            return iIntValue2 > 0 ? str2 : str;
        }
        return str3;
    }

    private final String c0(Trackrecord record) {
        Integer costtime = record.getCosttime();
        String consumeTime = null;
        if (costtime != null) {
            if (!(costtime.intValue() > 0)) {
                costtime = null;
            }
            if (costtime != null) {
                consumeTime = DataFormatter.getConsumeTime(costtime.intValue());
            }
        }
        return consumeTime == null ? P0() : consumeTime;
    }

    private final String c1() {
        return (String) this.maxSlope.getValue();
    }

    private final String d(Trackrecord trackrecord) {
        Integer leftLandingTime = trackrecord.getLeftLandingTime();
        boolean z2 = false;
        int iIntValue = leftLandingTime == null ? 0 : leftLandingTime.intValue();
        Integer rightLandingTime = trackrecord.getRightLandingTime();
        int iIntValue2 = rightLandingTime == null ? 0 : rightLandingTime.intValue();
        Integer landingTime = trackrecord.getLandingTime();
        int iIntValue3 = landingTime == null ? 0 : landingTime.intValue();
        boolean zIsSmartTShirt = SportDeviceUtils.isSmartTShirt(trackrecord.getDevice());
        boolean zIsSmartShoe = SportDeviceUtils.isSmartShoe(trackrecord.getDevice());
        Integer totalStep = trackrecord.getTotalStep();
        int iIntValue4 = totalStep == null ? 0 : totalStep.intValue();
        boolean z3 = true;
        if (zIsSmartTShirt) {
            iIntValue = b(iIntValue, iIntValue4);
            iIntValue2 = b(iIntValue2, iIntValue4);
            z2 = true;
        }
        if (zIsSmartShoe) {
            iIntValue3 = b(iIntValue3, iIntValue4);
        } else {
            z3 = z2;
        }
        if (!z3) {
            return P0();
        }
        if (iIntValue <= 0 && iIntValue2 <= 0) {
            if (iIntValue3 <= 0) {
                return P0();
            }
            return iIntValue3 + this.context.getString(R.string.millisecond);
        }
        String string = this.context.getString(R.string.sports_left_feet);
        Context context = this.context;
        int i3 = R.string.millisecond;
        String str = string + iIntValue + context.getString(i3);
        String str2 = this.context.getString(R.string.sports_right_feet) + iIntValue2 + this.context.getString(i3);
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            return iIntValue2 > 0 ? str2 : str;
        }
        return str + " | " + str2;
    }

    private final String d0(Trackrecord record) {
        return K1(record.getTotalStep(), v0.a);
    }

    private final String d1() {
        return (String) this.maxSpeed.getValue();
    }

    private final String[] e(Trackrecord record) {
        return new String[]{z(record), String.valueOf(R.string.running_cal_unit)};
    }

    private final String e0(Trackrecord record) {
        return !H1(record.getAvgStrideLength().intValue()) ? "--" : K1(record.getAvgStrideLength(), new w0());
    }

    private final String e1() {
        return (String) this.maxStepFreq.getValue();
    }

    private final String[] f(Trackrecord record) {
        if (record.getDistance() == null) {
            return new String[]{P0(), String.valueOf(this.isMetric ? R.string.running_kilometer : R.string.running_mile)};
        }
        CardInfoAdapter.Companion companion = CardInfoAdapter.INSTANCE;
        float fIntValue = record.getDistance().intValue();
        Integer type = record.getType();
        return companion.getFormatDisAndUnit(fIntValue, type != null ? type.intValue() : 1, this.isMetric);
    }

    private final String f0(Trackrecord record) {
        return K1(record.getSfreq(), x0.a);
    }

    private final String f1() {
        return (String) this.maximumFall.getValue();
    }

    private final String[] g(Trackrecord record) {
        if (record.getClimbDisDescend() == null) {
            return new String[]{P0(), String.valueOf(this.isMetric ? R.string.running_kilometer : R.string.running_mile)};
        }
        CardInfoAdapter.Companion companion = CardInfoAdapter.INSTANCE;
        float fIntValue = record.getClimbDisDescend().intValue();
        Integer type = record.getType();
        return companion.getFormatDisAndUnit(fIntValue, type != null ? type.intValue() : 1, this.isMetric);
    }

    private final String g0(Trackrecord record) {
        String string;
        Integer swimStyle = record.getSwimStyle();
        if (swimStyle == null) {
            string = null;
        } else {
            int iIntValue = swimStyle.intValue();
            if (iIntValue == 1) {
                string = this.context.getString(R.string.sport_swim_style_breaststroke);
            } else if (iIntValue == 2) {
                string = this.context.getString(R.string.sport_swim_style_freestyle);
            } else if (iIntValue == 3) {
                string = this.context.getString(R.string.sport_swim_style_backstroke);
            } else if (iIntValue != 4) {
                string = iIntValue != 6 ? P0() : this.context.getString(R.string.sport_swim_style_butterfly);
            } else {
                string = this.context.getString(R.string.sport_swim_style_medley);
            }
        }
        return string == null ? P0() : string;
    }

    private final String g1() {
        return (String) this.maximumPressure.getValue();
    }

    private final String[] h(Trackrecord record) {
        return new String[]{G(record), String.valueOf(R.string.over_view_floor)};
    }

    private final String h0(Trackrecord record) {
        return K1(record.getSwimTurns(), y0.a);
    }

    private final String h1() {
        return (String) this.maximumStrokeSpeed.getValue();
    }

    private final String[] i(Trackrecord record) {
        return new String[]{l0(record), String.valueOf(R.string.rope_skipping_unit)};
    }

    private final String i0(Trackrecord record) {
        return K1(record.getSwimSWOLF(), z0.a);
    }

    private final String i1() {
        return (String) this.minUpstairsFloors.getValue();
    }

    private final String[] j(Trackrecord record) {
        return new String[]{r0(record), String.valueOf(R.string.over_view_used_time)};
    }

    private final String j0(Trackrecord record, int type, int index) {
        String[] strArrK0 = k0(record);
        boolean zAreEqual = Intrinsics.areEqual(strArrK0[index], "--");
        if (zAreEqual) {
            return "--";
        }
        if (zAreEqual) {
            throw new NoWhenBranchMatchedException();
        }
        return (String) StringsKt__StringsKt.split$default((CharSequence) strArrK0[index], new String[]{FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE}, false, 0, 6, (Object) null).get(type);
    }

    private final String j1() {
        return (String) this.number_downslides.getValue();
    }

    private final String k(Trackrecord record) {
        return K1(record.getClimbDisDescend(), new b0(record, this));
    }

    private final String[] k0(Trackrecord record) {
        int i3;
        int i4;
        int i5;
        int tennisForeHand = record.getTennisForeHand();
        int tennisBackHand = record.getTennisBackHand();
        int tennisServe = record.getTennisServe();
        int i6 = tennisForeHand + tennisBackHand + tennisServe;
        if (i6 > 0) {
            i4 = (tennisForeHand * 100) / i6;
            if (i4 < 0) {
                i4 = 0;
            }
            int i7 = tennisBackHand + tennisServe;
            i3 = i7 > 0 ? (int) ((100 - i4) * (tennisBackHand / i7)) : 0;
            if (i3 < 0) {
                i3 = 0;
            }
            i5 = (100 - i4) - i3;
            if (i5 < 0) {
            }
            return new String[]{K1(Integer.valueOf(i4), new b1(tennisForeHand)), K1(Integer.valueOf(i3), new a1(tennisBackHand)), K1(Integer.valueOf(i5), new c1(tennisServe))};
        }
        i3 = 0;
        i4 = 0;
        i5 = 0;
        return new String[]{K1(Integer.valueOf(i4), new b1(tennisForeHand)), K1(Integer.valueOf(i3), new a1(tennisBackHand)), K1(Integer.valueOf(i5), new c1(tennisServe))};
    }

    private final String k1() {
        return (String) this.pauseTime.getValue();
    }

    private final String l(Trackrecord record) {
        return K1(Integer.valueOf(record.getAveragePressure()), c0.a);
    }

    private final String l0(Trackrecord record) {
        return K1(Integer.valueOf(record.getTouchStrokes()), d1.a);
    }

    private final String l1() {
        return (String) this.rateFfPercent.getValue();
    }

    private final String m(Trackrecord record) {
        Float avgAltitude = record.getAvgAltitude();
        if (!RunUtils.isAltiMeterValid((int) avgAltitude.floatValue())) {
            avgAltitude = null;
        }
        String string = avgAltitude != null ? avgAltitude.toString() : null;
        return string == null ? P0() : string;
    }

    private final String m0(Trackrecord record) {
        return K1(record.getAltitudeDescend(), new e1());
    }

    private final String m1() {
        return (String) this.ruCostTime.getValue();
    }

    private final String n(Trackrecord record) {
        return K1(record.getSfreq(), d0.a);
    }

    private final String n0(Trackrecord record) {
        return K1(record.getSwimStrokes(), f1.a);
    }

    private final String n1() {
        return (String) this.serve_count.getValue();
    }

    private final String o(Trackrecord record) {
        Float swimDistancePerStroke = record.getSwimDistancePerStroke();
        if (!(swimDistancePerStroke.floatValue() > 0.0f)) {
            swimDistancePerStroke = null;
        }
        String float2String = swimDistancePerStroke != null ? DataFormatter.formatFloat2String(swimDistancePerStroke.floatValue(), 2, new int[0]) : null;
        return float2String == null ? P0() : float2String;
    }

    private final String o0(Trackrecord record) {
        return K1(Integer.valueOf(record.getTouchStrokes()), g1.a);
    }

    private final String o1() {
        return (String) this.serve_percent.getValue();
    }

    private final String p(Trackrecord record) {
        Integer avghr = record.getAvghr();
        String strValueOf = null;
        if (avghr != null) {
            if (!HeartRateConstant.isHRValueValid(avghr.intValue())) {
                avghr = null;
            }
            if (avghr != null) {
                strValueOf = String.valueOf(avghr.intValue());
            }
        }
        return strValueOf == null ? P0() : strValueOf;
    }

    private final String p0(Trackrecord record) {
        return K1(record.getTeValue(), h1.a);
    }

    private final String p1() {
        return (String) this.spo2Max.getValue();
    }

    private final String q(Trackrecord record) {
        Float avgPulloarTime = record.getAvgPulloarTime();
        String float2String = null;
        if (avgPulloarTime != null) {
            if (!(avgPulloarTime.floatValue() > 0.0f)) {
                avgPulloarTime = null;
            }
            if (avgPulloarTime != null) {
                float2String = DataFormatter.formatFloat2String(avgPulloarTime.floatValue(), 2, new int[0]);
            }
        }
        return float2String == null ? P0() : float2String;
    }

    private final String q0(Trackrecord record) {
        Float upstairsHeight = record.getUpstairsHeight();
        if (!(upstairsHeight.floatValue() > 0.0f)) {
            upstairsHeight = null;
        }
        String float2String = upstairsHeight != null ? DataFormatter.formatFloat2String(upstairsHeight.floatValue(), 2, new int[0]) : null;
        return float2String == null ? P0() : float2String;
    }

    private final String q1() {
        return (String) this.spo2Min.getValue();
    }

    private final String r(Trackrecord record) {
        Float avgReturnTime = record.getAvgReturnTime();
        String float2String = null;
        if (avgReturnTime != null) {
            if (!(avgReturnTime.floatValue() > 0.0f)) {
                avgReturnTime = null;
            }
            if (avgReturnTime != null) {
                float2String = DataFormatter.formatFloat2String(avgReturnTime.floatValue(), 2, new int[0]);
            }
        }
        return float2String == null ? P0() : float2String;
    }

    private final String r0(Trackrecord record) {
        Long endtime = record.getEndtime();
        String consumeTime = endtime == null ? null : DataFormatter.getConsumeTime(endtime.longValue() - record.getTrackid().longValue());
        return consumeTime == null ? P0() : consumeTime;
    }

    private final String r1() {
        return (String) this.sportTime.getValue();
    }

    private final String s(Trackrecord record) {
        return K1(Integer.valueOf(record.getAvgSlope()), e0.a);
    }

    private final String s0() {
        return (String) this.accumulatedGlideDistance.getValue();
    }

    private final String s1() {
        return (String) this.stepNumber.getValue();
    }

    private final String t(Trackrecord record) {
        Float pace = record.getPace();
        String strPaceConvertToSpeed = pace == null ? null : RunDataConversion.paceConvertToSpeed(pace.floatValue(), this.isMetric);
        return strPaceConvertToSpeed == null ? P0() : strPaceConvertToSpeed;
    }

    private final String t0() {
        return (String) this.averagePressure.getValue();
    }

    private final String t1() {
        return (String) this.stride.getValue();
    }

    private final String u(Trackrecord record) {
        Float pace = record.getPace();
        String timeInSportFormForPace = pace == null ? null : DataFormatter.formatTimeInSportFormForPace((long) RunDataConversion.paceMultiplyKilo(pace.floatValue(), this.isMetric));
        return timeInSportFormForPace == null ? P0() : timeInSportFormForPace;
    }

    private final String u0() {
        return (String) this.average_frequency.getValue();
    }

    private final String u1() {
        return (String) this.strideFrequency.getValue();
    }

    private final String v(Trackrecord record) {
        Float swimAvgStrokeSpeed = record.getSwimAvgStrokeSpeed();
        String strValueOf = null;
        if (swimAvgStrokeSpeed != null) {
            if (!(swimAvgStrokeSpeed.floatValue() > 0.0f)) {
                swimAvgStrokeSpeed = null;
            }
            if (swimAvgStrokeSpeed != null) {
                strValueOf = String.valueOf(Math.round(swimAvgStrokeSpeed.floatValue() * 60));
            }
        }
        return strValueOf == null ? P0() : strValueOf;
    }

    private final String v0() {
        return (String) this.avgAltitude.getValue();
    }

    private final String v1() {
        return (String) this.swimCostTime.getValue();
    }

    private final String w(float value) {
        String timeInSportFormForPace = DataFormatter.formatTimeInSportFormForPace((long) RunDataConversion.paceMultiplyKilo(value, this.isMetric));
        return timeInSportFormForPace == null ? P0() : timeInSportFormForPace;
    }

    private final String w0() {
        return (String) this.avgBoatingFre.getValue();
    }

    private final String w1() {
        return (String) this.swimStyle.getValue();
    }

    private final String x(Trackrecord record) {
        Long lValueOf = Long.valueOf(record.getRopeSkippingRestTime());
        if (!(lValueOf.longValue() > 0)) {
            lValueOf = null;
        }
        String consumeTime = lValueOf != null ? DataFormatter.getConsumeTime(lValueOf.longValue()) : null;
        return consumeTime == null ? P0() : consumeTime;
    }

    private final String x0() {
        return (String) this.avgDistancePerStroke.getValue();
    }

    private final String x1() {
        return (String) this.swimTrips.getValue();
    }

    private final String y(Trackrecord record) {
        return K1(record.getAvgCadence(), f0.a);
    }

    private final String y0() {
        return (String) this.avgHeartRate.getValue();
    }

    private final String y1() {
        return (String) this.swolf.getValue();
    }

    private final String z(Trackrecord record) {
        return K1(record.getCal(), g0.a);
    }

    private final String z0() {
        return (String) this.avgPulloarTime.getValue();
    }

    private final String z1() {
        return (String) this.timeTouchDown.getValue();
    }

    @NotNull
    public final String[] handleSportMainData(@NotNull SportShowDataBean bean) {
        String mainData = bean.getMainData();
        if (Intrinsics.areEqual(mainData, MainData.DISTANCE.getValue())) {
            return f(this.record);
        }
        if (Intrinsics.areEqual(mainData, MainData.COST.getValue())) {
            return e(this.record);
        }
        if (Intrinsics.areEqual(mainData, MainData.SPORT_TIME.getValue())) {
            return j(this.record);
        }
        if (Intrinsics.areEqual(mainData, MainData.COUNT_TOTAL.getValue())) {
            return i(this.record);
        }
        if (Intrinsics.areEqual(mainData, MainData.FLOOR_NUMBER.getValue())) {
            return h(this.record);
        }
        return Intrinsics.areEqual(mainData, MainData.DOWNHILL_DISTANCE.getValue()) ? g(this.record) : f(this.record);
    }

    @NotNull
    public final List<Pair<String, String>> handleSportSubData(@NotNull SportShowDataBean bean) {
        int iIntValue = this.record.getType().intValue();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = bean.getShowData().iterator();
        while (it2.hasNext()) {
            int item_data_value = ((ShowItemBean) it2.next()).getItem_data_value();
            if (item_data_value == SportOverItem.SPORT_TIME.ordinal()) {
                J1(c0(this.record), r1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVG_SPEED.ordinal()) {
                J1(u(this.record), D0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.COST.ordinal()) {
                J1(z(this.record), L0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.FOREFOOT.ordinal()) {
                J1(F(this.record), l1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.TIME_TOUCHDOWN.ordinal()) {
                if (iIntValue == 1 || iIntValue == 7 || iIntValue == 8 || iIntValue == 25 || iIntValue == 26) {
                    J1(d(this.record), z1(), arrayList2, arrayList);
                }
            } else if (item_data_value == SportOverItem.VACANCY_RATIO.ordinal()) {
                if (iIntValue == 1 || iIntValue == 7 || iIntValue == 8 || iIntValue == 25 || iIntValue == 26) {
                    J1(c(this.record), Q0(), arrayList2, arrayList);
                }
            } else if (item_data_value == SportOverItem.AVERAGE_HEART_RATE.ordinal()) {
                J1(p(this.record), y0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.STEP_FREQUENCY.ordinal()) {
                J1(f0(this.record), u1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.STRIDE.ordinal()) {
                J1(e0(this.record), t1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.STEP_COUNT.ordinal()) {
                J1(d0(this.record), s1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.MAX_STEP_FRE.ordinal()) {
                J1(Q(200), e1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.OPTIMAL_PACE.ordinal()) {
                float fI1 = I1();
                if (iIntValue == 14 || iIntValue == 15) {
                    J1(I(fI1), X0(), arrayList2, arrayList);
                    Unit unit = Unit.INSTANCE;
                } else {
                    J1(w(fI1), H0(), arrayList2, arrayList);
                    Unit unit2 = Unit.INSTANCE;
                }
            } else if (item_data_value == SportOverItem.TRAINING_EFFECT.ordinal()) {
                J1(p0(this.record), F1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.PAUSE_TIME.ordinal()) {
                J1(X(this.record), k1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.TOTAL_TIME.ordinal()) {
                J1(r0(this.record), D1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.MAX_HEART_RATE.ordinal()) {
                J1(N(this.record), b1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.CUMULATIVE_RISE.ordinal()) {
                J1(D(this.record), N0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.CUMULATIVE_CLIMB.ordinal()) {
                J1(C(this.record), M0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.CUMULATIVE_DECLINE.ordinal()) {
                J1(m0(this.record), E1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.OPTIMUM_SPEED.ordinal()) {
                J1(A(I1()), d1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.SPEED.ordinal()) {
                J1(J(this.record), W0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.SWIMMING_POSTURE.ordinal()) {
                J1(g0(this.record), w1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVERAGE_STROKE_RATE.ordinal()) {
                J1(v(this.record), E0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.SWOLF.ordinal()) {
                J1(i0(this.record), y1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVERAGE_STROKE_DISTANCE.ordinal()) {
                J1(o(this.record), x0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.NUMBER_DOWNSLIDES.ordinal()) {
                J1(E(this.record), j1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.CUMULATIVE_SLIPPAGE.ordinal()) {
                J1(Z(this.record), O0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.SWIMMING_TIME.ordinal()) {
                W(v1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.RIDING_TIME.ordinal()) {
                W(I0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.RUNNING_TIME.ordinal()) {
                W(m1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.CADENCE.ordinal()) {
                J1(y(this.record), K0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.MAX_CADENCE.ordinal()) {
                J1(M(this.record), a1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.FOREHAND.ordinal()) {
                J1(j0(this.record, 0, 0), R0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.BACKHAND.ordinal()) {
                J1(j0(this.record, 0, 1), F0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.SERVE.ordinal()) {
                J1(j0(this.record, 0, 2), n1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVERAGE_FREQUENCY.ordinal()) {
                J1(Y(Integer.valueOf(this.record.getRopeSkippingAvgFrequency())), u0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.HIGHEST_FREQUENCY.ordinal()) {
                J1(Y(Integer.valueOf(this.record.getRopeSkippingMaxFrequency())), V0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVG_SPEEED.ordinal()) {
                J1(t(this.record), C0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVG_BOATING_FRE.ordinal()) {
                J1(n(this.record), w0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.MAX_BOATING_FRE.ordinal()) {
                J1(L(this.record), Z0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.BREAK_TIME.ordinal()) {
                J1(x(this.record), A1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.GROUP_NUM.ordinal()) {
                J1(H(this.record), T0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.SPO2_MAX.ordinal()) {
                J1(a0(this.record), p1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.SPO2_MIN.ordinal()) {
                J1(b0(this.record), q1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVERAGE_ALTITUDE.ordinal()) {
                J1(m(this.record), v0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.MAXIMUM_SLOPE.ordinal()) {
                J1(O(this.record), c1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVERAGE_SLOPE.ordinal()) {
                J1(s(this.record), B0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.NUMBER_OF_TRIPS.ordinal()) {
                J1(h0(this.record), x1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVG_PROPELLER_PULLING_TIME.ordinal()) {
                J1(q(this.record), z0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVG_PROPELLER_COLLECTING_TIME.ordinal()) {
                J1(r(this.record), A0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.ASCENT_HEIGHT.ordinal()) {
                J1(q0(this.record), G1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.UPSTAIRS_FREQUENCY.ordinal()) {
                J1(V(this.record), i1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.FOREHAND_PERCENT.ordinal()) {
                J1(j0(this.record, 1, 0), S0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.BACKHAND_PERCENT.ordinal()) {
                J1(j0(this.record, 1, 1), G0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.SERVE_PERCENT.ordinal()) {
                J1(j0(this.record, 1, 2), o1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.TOTAL_STROKES.ordinal()) {
                J1(n0(this.record), B1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.MAXIMUM_STROKE_SPEED.ordinal()) {
                J1(R(this.record), h1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.ACCUMULATED_GLIDE_DISTANCE.ordinal()) {
                J1(k(this.record), s0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.MAXIMUM_FALL.ordinal()) {
                J1(S(this.record), f1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.HIGHEST_ALTITUDE.ordinal()) {
                J1(K(this.record), U0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.LOWEST_ALTITUDE.ordinal()) {
                J1(U(this.record), Y0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.TOTAL_SWING_TIMES.ordinal()) {
                J1(o0(this.record), C1(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.AVERAGE_PRESSURE.ordinal()) {
                J1(l(this.record), t0(), arrayList2, arrayList);
            } else if (item_data_value == SportOverItem.MAXIMUM_PRESSURE.ordinal()) {
                J1(T(this.record), g1(), arrayList2, arrayList);
            }
        }
        return arrayList;
    }
}
