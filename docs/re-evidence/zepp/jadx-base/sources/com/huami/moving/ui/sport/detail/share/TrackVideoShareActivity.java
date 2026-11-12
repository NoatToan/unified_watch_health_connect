package com.huami.moving.ui.sport.detail.share;

import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.display.VirtualDisplay;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.gson.Gson;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.maps.IGPSSolution;
import com.huami.moving.maps.track.GPSContourTrack;
import com.huami.moving.maps.track.GPSSportTrackLoader;
import com.huami.moving.ui.offcut.SportEndPageBusiness;
import com.huami.moving.ui.sport.detail.share.TrackVideoShareActivity;
import com.huami.moving.ui.sport.detail.tool.ShareFileUtils;
import com.huami.moving.ui.utils.BitmapUtils;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.NavigationBarUtil;
import com.huami.moving.ui.utils.NetUtil;
import com.huami.moving.ui.utils.RunnerPeripheralInfo;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.SportTypeIconUtils;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.ui.utils.TriathlonChildSportUtil;
import com.huami.moving.ui.view.LinearGradientView;
import com.huami.moving.ui.view.card.CardInfoAdapter;
import com.huami.moving.ui.view.dialog.SportVideoAfterSaveShareDialog;
import com.huami.moving.utils.Utils;
import com.huami.moving.webapi.GetTrackVideoShareAPI;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.userproperty.UserPropertyManager;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.notification.TransportUri;
import com.huami.widget.toast.CustomToast;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ·\u00012\u00020\u00012\u00020\u0002:\u0002·\u0001B\t¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J-\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u001f\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u001c2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010!\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u00020\u00032\b\b\u0001\u0010)\u001a\u00020\rH\u0002J\b\u0010+\u001a\u00020\u0003H\u0002J\b\u0010,\u001a\u00020\u0003H\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010%\u001a\u00020-H\u0002J\b\u00100\u001a\u00020\u0003H\u0002J\b\u00101\u001a\u00020\u0003H\u0002J\b\u00103\u001a\u000202H\u0002J\u0010\u00105\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0014H\u0002J\b\u00106\u001a\u00020\u0003H\u0002J\u0010\u00108\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0014H\u0002J\b\u00109\u001a\u00020\u0003H\u0002J+\u0010<\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030;H\u0002¢\u0006\u0004\b<\u0010=J\n\u0010>\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010?\u001a\u00020\u0003H\u0002J\"\u0010E\u001a\u00020\u00142\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\b\b\u0002\u0010D\u001a\u00020\u000bH\u0002J,\u0010J\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\r2\b\u0010G\u001a\u0004\u0018\u00010\u00162\b\u0010H\u001a\u0004\u0018\u00010\t2\u0006\u0010I\u001a\u00020\u0019H\u0002J\u0010\u0010K\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0019H\u0002J\u0012\u0010L\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010M\u001a\u00020@H\u0016J\b\u0010N\u001a\u00020\u0003H\u0016J\u0010\u0010P\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u000bH\u0016J\b\u0010Q\u001a\u00020\u0003H\u0016J\b\u0010R\u001a\u00020\u0003H\u0014J\b\u0010S\u001a\u00020\u0003H\u0014J\u0010\u0010U\u001a\u00020\u00032\u0006\u0010T\u001a\u00020\u001fH\u0014J\u000e\u0010W\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u000bJ\"\u0010\\\u001a\u00020\u00032\u0006\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\u0010[\u001a\u0004\u0018\u00010ZH\u0014R\u0016\u0010G\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010]R\u0016\u0010H\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R(\u0010e\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010b\u001a\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010fR\u0016\u0010i\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00100R\u0016\u0010j\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00103R\u0016\u0010F\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0016\u0010k\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00103R\u0016\u0010l\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0018\u0010o\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010tR\u0016\u0010v\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00103R\u0016\u0010x\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u00103R\u0016\u0010y\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00103R\u0016\u0010{\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010zR\u0016\u0010}\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010zR\u0016\u0010~\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010zR\u0017\u0010\u0080\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u007fR\u0018\u0010\u0086\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u007fR\u0018\u0010\u0088\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u007fR\u0017\u0010\u0089\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u007fR\u0017\u0010\u008a\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010\u007fR\u0019\u0010\u008d\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b<\u0010\u008c\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0092\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bJ\u0010\u0090\u0001R\u0017\u0010\u0093\u0001\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010zR\u001a\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0099\u0001\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010zR\u0018\u0010\u009b\u0001\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010zR\u0018\u0010\u009d\u0001\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010zR\u0018\u0010\u009f\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010\bR\"\u0010¤\u0001\u001a\u00030 \u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0005\bw\u0010£\u0001R!\u0010§\u0001\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b¥\u0001\u0010¢\u0001\u001a\u0005\bm\u0010¦\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010®\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010°\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¯\u0001\u0010\u00ad\u0001R\u001c\u0010´\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001¨\u0006¸\u0001"}, d2 = {"Lcom/huami/moving/ui/sport/detail/share/TrackVideoShareActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/moving/maps/track/GPSSportTrackLoader$TrackLoadCallback;", "", "initView", "Landroid/widget/TextView;", "tetview", "a0", "Z", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "", "E", "", "value", "Lkotlin/Function1;", TransportUri.ACTION_BLOCK, "l0", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "F", "", "isSwim", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "mTrackData", LogUtil.D, "", "pace", "U", "", "z", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;)[Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "M", "Lcom/huami/moving/ui/utils/RunnerPeripheralInfo;", "info", "Landroid/widget/ImageView;", ViewHierarchyConstants.VIEW_KEY, "k0", "H", "B", "msg", "b0", "hideProgressDialog", "C", "Landroid/view/View;", "Landroid/graphics/Bitmap;", "O", "J", "i0", "Landroid/media/MediaRecorder;", LogUtil.I, "isPause", "j0", "P", "isRecord", "h0", "L", "permissions", "Lkotlin/Function0;", "W", "([Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "w", "V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/io/File;", "internalMove", FileDownloadModel.FILENAME, "x", "sportType", "trackData", "trackRecord", "progress", "Y", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "onCreate", "getAttechActivity", "whenMapLoaded", "path", "whenContourTrackCreated", "whenTrackDataLoaded", "onResume", "onDestroy", "outState", "onSaveInstanceState", "shareUrl", "showTrackVideoShareDialog", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "y", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "Lcom/huami/moving/maps/track/GPSSportTrackLoader;", "<set-?>", "Lcom/huami/moving/maps/track/GPSSportTrackLoader;", "getTrackLoader", "()Lcom/huami/moving/maps/track/GPSSportTrackLoader;", "trackLoader", "Landroid/view/View;", SportAnalytics.ParamValue.MapButtonType.MAP, "", "trackId", "deviceSource", "realSportType", "useAmap", "G", "Landroid/media/MediaRecorder;", "mMediaRecorder", "Landroid/hardware/display/VirtualDisplay;", "Landroid/hardware/display/VirtualDisplay;", "mVirtualDisplay", "Landroid/media/projection/MediaProjection;", "Landroid/media/projection/MediaProjection;", "mMediaProjection", "mScreenWidth", "K", "mScreenHeight", "mScreenDensity", "Landroid/widget/ImageView;", "mUserAvatar", "N", "mBackButton", "mPlayButton", "Landroid/widget/TextView;", "mUserName", "Q", "mRunDate", "R", "mRunDantance", ExifInterface.LATITUDE_SOUTH, "mDantanceLable", ExifInterface.GPS_DIRECTION_TRUE, "mRunStartTime", "mRunTime", "mRunCalories", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "mShareLinear", "Lcom/huami/moving/ui/view/LinearGradientView;", "X", "Lcom/huami/moving/ui/view/LinearGradientView;", "mMyMaskTop", "mMyMaskButtom", "mLableImage2", "Landroidx/constraintlayout/widget/ConstraintLayout;", "m0", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mContainerView", "n0", "mImageView", "o0", "mMapImageView", "p0", "mIvWaterMark", "q0", TdmillHmFragment.ARG_IS_METRIC, "Lcom/huami/moving/ui/offcut/SportEndPageBusiness;", "r0", "Lkotlin/Lazy;", "()Lcom/huami/moving/ui/offcut/SportEndPageBusiness;", "sportEndPageBusiness", "s0", "()Ljava/lang/String;", "defaultValue", "Lcom/huami/moving/ui/view/dialog/SportVideoAfterSaveShareDialog;", "t0", "Lcom/huami/moving/ui/view/dialog/SportVideoAfterSaveShareDialog;", "sportVideoAfterSaveShareDialog", "u0", "Ljava/lang/String;", "filePath", "v0", "fileName", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "w0", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class TrackVideoShareActivity extends BaseTitleActivity implements GPSSportTrackLoader.TrackLoadCallback {

    @NotNull
    private static final String A0 = "huami.mifit.sport.shareRouter";
    private static int B0 = 0;

    @Nullable
    private static MediaProjectionManager C0 = null;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "TrackVideoShareActivity";

    @NotNull
    private static final String x0 = "TRACK_ID";

    @NotNull
    private static final String y0 = "DEVICE_SOURCE";

    @NotNull
    private static final String z0 = "SPORT_TYPE";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private View map;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private long trackId;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int deviceSource;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int sportType;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private int realSportType;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private MediaRecorder mMediaRecorder;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private VirtualDisplay mVirtualDisplay;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    private MediaProjection mMediaProjection;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private int mScreenDensity;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private ImageView mUserAvatar;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private ImageView mBackButton;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private ImageView mPlayButton;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private TextView mUserName;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private TextView mRunDate;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private TextView mRunDantance;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private TextView mDantanceLable;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private TextView mRunStartTime;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private TextView mRunTime;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private TextView mRunCalories;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private RelativeLayout mShareLinear;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private LinearGradientView mMyMaskTop;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private LinearGradientView mMyMaskButtom;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private ImageView mLableImage2;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private ConstraintLayout mContainerView;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private ImageView mImageView;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private ImageView mMapImageView;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private ImageView mIvWaterMark;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private boolean isMetric;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportEndPageBusiness;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultValue;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    @Nullable
    private SportVideoAfterSaveShareDialog sportVideoAfterSaveShareDialog;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    private String filePath;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    private String fileName;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ParsedSportDetailData trackData;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private Trackrecord trackRecord;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private GPSSportTrackLoader trackLoader;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean useAmap = true;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private int mScreenWidth = 1080;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private int mScreenHeight = 1920;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/moving/ui/sport/detail/share/TrackVideoShareActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "trackId", "", "deviceSource", "sportType", "", "start", "Landroid/media/projection/MediaProjectionManager;", "mediaProjectionManager", "initMediaProjectionManager", "", "APPS_SETTINGS_TRACK_SHARE", "Ljava/lang/String;", TrackVideoShareActivity.y0, TrackVideoShareActivity.z0, "TAG", TrackVideoShareActivity.x0, "mProgress", LogUtil.I, "Landroid/media/projection/MediaProjectionManager;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void initMediaProjectionManager(@NotNull MediaProjectionManager mediaProjectionManager) {
            TrackVideoShareActivity.C0 = mediaProjectionManager;
        }

        public final void start(@NotNull Context context, long trackId, int deviceSource, int sportType) {
            context.startActivity(new Intent(context, (Class<?>) TrackVideoShareActivity.class).putExtra(TrackVideoShareActivity.x0, trackId).putExtra(TrackVideoShareActivity.y0, deviceSource).putExtra(TrackVideoShareActivity.z0, sportType));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "openOutputStream 失败，返回 null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "insert 失败，返回 null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "保存图片失败: " + Log.getStackTraceString(this.a);
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
            return TrackVideoShareActivity.this.getString(R.string.running_pace_empty);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final e a = new e();

        public e() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            String str = TrackVideoShareActivity.this.filePath;
            Objects.requireNonNull(str);
            return "保存地址：" + str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            String str = TrackVideoShareActivity.this.filePath;
            Objects.requireNonNull(str);
            return "保存地址：" + str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return " trackId:::" + TrackVideoShareActivity.this.trackId + ", deviceSource::" + TrackVideoShareActivity.this.deviceSource + ",sportType::" + TrackVideoShareActivity.this.sportType;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ long[][] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long[][] jArr) {
            super(0);
            this.a = jArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "subSports :::" + new Gson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TrackVideoShareActivity.this.i0();
            Analytics.recordEvent(new CountEventBuilder(SportAnalytics.SAVE_ROUTE_VIDEO_C).setAnonymous(false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Intent c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i, int i2, Intent intent) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "requestCode::" + this.a + ",resultCode::" + this.b + ",data::" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "录制开始";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setIconMessageType oncreate";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i, float f) {
            super(0);
            this.a = i;
            this.b = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sportType:" + this.a + ",progress:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ ParsedSportDetailData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i, ParsedSportDetailData parsedSportDetailData) {
            super(0);
            this.a = i;
            this.b = parsedSportDetailData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sportType:" + this.a + ",trackData.avgPace:" + this.b.getAvgPace();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ GPSContourTrack.LoadData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(GPSContourTrack.LoadData loadData) {
            super(0);
            this.a = loadData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sportType::" + this.a.complexMyTrackData.keySet().iterator().next();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ ParsedSportDetailData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i, ParsedSportDetailData parsedSportDetailData) {
            super(0);
            this.a = i;
            this.b = parsedSportDetailData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sportType:" + this.a + ",trackData.speedList：" + new Gson().toJson(this.b.getSpeedList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;
        public final /* synthetic */ Ref.FloatRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Ref.IntRef intRef, Ref.FloatRef floatRef) {
            super(0);
            this.a = intRef;
            this.b = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "distanceType ::" + this.a.element + ",distanceValue::" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public static final s a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setIconMessageType whenTrackDataLoaded";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackVideoShareActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sportEndPageBusiness = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SportEndPageBusiness>() { // from class: com.huami.moving.ui.sport.detail.share.TrackVideoShareActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.moving.ui.offcut.SportEndPageBusiness, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SportEndPageBusiness invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(SportEndPageBusiness.class), qualifier, objArr);
            }
        });
        this.defaultValue = LazyKt__LazyJVMKt.lazy(new d());
    }

    private final void A(float progress) {
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        GPSContourTrack.LoadData loadData = gPSSportTrackLoader == null ? null : gPSSportTrackLoader.getmData();
        if (loadData == null) {
            return;
        }
        float size = loadData.track.size() * progress;
        int size2 = loadData.complexTracks.size();
        int i2 = 1;
        if (1 > size2) {
            return;
        }
        int size3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            int iKeyAt = loadData.complexTracks.keyAt(i2 - 1);
            size3 += loadData.complexTracks.get(iKeyAt).size();
            float f2 = i3;
            if (size >= f2 && size <= size3) {
                Y(iKeyAt, loadData.complexMyTrackData.get(Integer.valueOf(iKeyAt)), loadData.complexTrackRecord.get(Integer.valueOf(iKeyAt)), (size - f2) / (size3 - i3));
            }
            if (i2 == size2) {
                return;
            }
            i3 = size3;
            i2 = i4;
        }
    }

    private final void B() {
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if (gPSSportTrackLoader == null) {
            return;
        }
        gPSSportTrackLoader.clearTrackVodePaly();
        gPSSportTrackLoader.unregisterListener();
        gPSSportTrackLoader.destroyMap();
        gPSSportTrackLoader.destroy();
    }

    private final void C() {
        hideProgressDialog();
        this.mLoadingDialog = null;
    }

    private final String D(boolean isSwim, ParsedSportDetailData mTrackData) {
        this.isMetric = RunnerData.getRunner().isMetric();
        return DataFormatter.formatTimeInSportForm((long) (isSwim ? RunDataConversion.paceMultiplyHund(mTrackData.getAvgPace(), this.isMetric) : RunDataConversion.paceMultiplyKilo(mTrackData.getAvgPace(), this.isMetric)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E(Trackrecord record) {
        return l0(record.getCal(), e.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F(Trackrecord record) {
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
        return consumeTime == null ? G() : consumeTime;
    }

    private final String G() {
        return (String) this.defaultValue.getValue();
    }

    private final int H() {
        return !this.useAmap ? R.layout.activity_share_sport_detail_map_google : R.layout.activity_share_sport_detail_map_gaode;
    }

    private final MediaRecorder I() {
        MediaRecorder mediaRecorder = new MediaRecorder();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            mediaRecorder.setVideoSource(2);
        }
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setVideoEncoder(2);
        mediaRecorder.setVideoSize(this.mScreenWidth, this.mScreenHeight);
        mediaRecorder.setVideoFrameRate(60);
        mediaRecorder.setVideoEncodingBitRate(10485760);
        mediaRecorder.setOrientationHint(0);
        this.fileName = new SimpleDateFormat("yyyyMMddHms", Locale.getDefault()).format(new Date()) + ".mp4";
        if (i2 >= 29) {
            File externalFilesDir = Intrinsics.areEqual("mounted", Environment.getExternalStorageState()) ? getExternalFilesDir("MiFit") : getFilesDir();
            String str = File.separator;
            String str2 = this.fileName;
            Objects.requireNonNull(str2);
            this.filePath = externalFilesDir + str + str2;
            HMLog.info(TAG, new f());
            String str3 = this.filePath;
            Objects.requireNonNull(str3);
            mediaRecorder.setOutputFile(str3);
        } else {
            String absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
            String str4 = File.separator;
            File file = new File(absolutePath + str4 + "MiFit");
            if (!file.exists()) {
                file.mkdirs();
            }
            String string = file.toString();
            String str5 = this.fileName;
            Objects.requireNonNull(str5);
            String str6 = string + str4 + str5;
            this.filePath = str6;
            Objects.requireNonNull(str6);
            mediaRecorder.setOutputFile(str6);
            HMLog.info(TAG, new g());
        }
        try {
            mediaRecorder.prepare();
        } catch (IOException e2) {
            e2.printStackTrace();
            e2.printStackTrace();
            HMLog.e(TAG, "发生异常。。", Unit.INSTANCE);
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
            e3.printStackTrace();
            HMLog.e(TAG, "发生异常。。", Unit.INSTANCE);
        }
        return mediaRecorder;
    }

    private final void J() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.mScreenDensity = displayMetrics.densityDpi;
    }

    private final SportEndPageBusiness K() {
        return (SportEndPageBusiness) this.sportEndPageBusiness.getValue();
    }

    private final void L() {
        RunnerPeripheralInfo runnerPeripheralInfo = RunnerPeripheralInfo.getInstance();
        GetTrackVideoShareAPI.INSTANCE.getSportShareUrl(this.trackId, DataTypeSource.RunSource.getSourceByValue(this.deviceSource), this.sportType, runnerPeripheralInfo.getAvatarUrl(), runnerPeripheralInfo.getName(), new IHMBasicHttpResponseHandler() { // from class: com.huami.moving.ui.sport.detail.share.TrackVideoShareActivity$getSportShareUrlToShare$1
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@Nullable HMHttpResponseData item) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@Nullable HMHttpResponseData item) {
                String str = new JSONObject(new String(item.getResponseBody(), Charsets.UTF_8)).optString("data") + (Utils.isMidong() ? "&source=watch" : "&source=mi");
                UserPropertyManager userPropertyManager = UserPropertyManager.INSTANCE;
                if (userPropertyManager.readLocal(HMAccountWebAPI.APPS_SETTINGS_TRACK_SHARE, null) != null) {
                    this.a.showTrackVideoShareDialog(userPropertyManager.readLocal(HMAccountWebAPI.APPS_SETTINGS_TRACK_SHARE, null) + "?data=" + str);
                }
            }
        });
    }

    private final void M(Bundle savedInstanceState) {
        Intent intent = getIntent();
        this.trackId = (intent == null ? null : Long.valueOf(intent.getLongExtra(x0, -1L))).longValue();
        Intent intent2 = getIntent();
        this.deviceSource = (intent2 == null ? null : Integer.valueOf(intent2.getIntExtra(y0, -1))).intValue();
        Intent intent3 = getIntent();
        this.sportType = (intent3 != null ? Integer.valueOf(intent3.getIntExtra(z0, -1)) : null).intValue();
        HMLog.info(TAG, new h());
        this.trackData = TrackDataManager.getInstance().getTrackData(this.trackId, this.deviceSource, this.sportType);
        this.trackRecord = TrackRecordManager.getInstance().getTrackRecordById(this.trackId, this.deviceSource);
        this.useAmap = true;
        int i2 = this.sportType;
        this.realSportType = i2;
        if (SportTypeIdentifier.isSubSport(i2)) {
            this.sportType -= 1000;
        }
        setContentView(H());
        this.map = findViewById(R.id.map);
        GPSSportTrackLoader gPSSportTrackLoader = new GPSSportTrackLoader(this, getSupportFragmentManager(), savedInstanceState, this.useAmap, true);
        this.trackLoader = gPSSportTrackLoader;
        int i3 = this.sportType;
        if (i3 == 2001 || i3 == 2002) {
            View view = this.map;
            Objects.requireNonNull(view);
            view.post(new Runnable() { // from class: as7
                @Override // java.lang.Runnable
                public final void run() {
                    TrackVideoShareActivity.N(this.a);
                }
            });
        } else {
            gPSSportTrackLoader.startSingleTrackVideoInMap(this.trackId, this.deviceSource, this.realSportType);
        }
        ImageView imageView = (ImageView) findViewById(R.id.image_icon);
        this.mImageView = imageView;
        Objects.requireNonNull(imageView);
        imageView.setImageResource(SportTypeIconUtils.INSTANCE.getImageByType(this.realSportType));
        ImageView imageView2 = this.mImageView;
        Objects.requireNonNull(imageView2);
        imageView2.setColorFilter(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(TrackVideoShareActivity trackVideoShareActivity) {
        long[][] jArrAnaChildSport = TriathlonChildSportUtil.anaChildSport(TrackRecordManager.getInstance().getTrackRecordById(trackVideoShareActivity.trackId, trackVideoShareActivity.deviceSource).getChildListData());
        HMLog.info(TAG, new i(jArrAnaChildSport));
        GPSSportTrackLoader trackLoader = trackVideoShareActivity.getTrackLoader();
        if (trackLoader == null) {
            return;
        }
        trackLoader.startComplexTrackVideoInMap(trackVideoShareActivity.trackId, trackVideoShareActivity.deviceSource, trackVideoShareActivity.realSportType, jArrAnaChildSport);
    }

    private final Bitmap O(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache(true));
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    private final void P() {
        Intent intent = new Intent(this, (Class<?>) MediaProjectionService.class);
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(TrackVideoShareActivity trackVideoShareActivity, View view) {
        trackVideoShareActivity.W(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, trackVideoShareActivity.new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(TrackVideoShareActivity trackVideoShareActivity, View view) {
        if (!NetUtil.isNetworkConnected(trackVideoShareActivity)) {
            CustomToast.makeText(trackVideoShareActivity, R.string.no_network_connection, 0).show();
        } else {
            trackVideoShareActivity.L();
            Analytics.recordEvent(new CountEventBuilder(SportAnalytics.SHARE_ROUTE_VIDEO_C).setAnonymous(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(TrackVideoShareActivity trackVideoShareActivity, View view) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", String.valueOf(B0));
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.QUIT_VIDEO_C).putExtras(linkedHashMap).setAnonymous(false));
        trackVideoShareActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(TrackVideoShareActivity trackVideoShareActivity, View view) {
        trackVideoShareActivity.h0(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pos", SportAnalytics.ParamValue.TrackVideo.ROUTE_VIDEO_PLAY);
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.PLAY_ROUTE_VIDEO_C).putExtras(linkedHashMap).setAnonymous(false));
    }

    private final String U(float pace) {
        this.isMetric = RunnerData.getRunner().isMetric();
        if ((pace == 0.0f) || !RunUtils.isPaceValid(pace)) {
            return NumberFormatter.formatDouble2StringByLocale(pace, 2, 4);
        }
        double d2 = ((double) 3600) / ((double) (pace * 1000));
        if (!this.isMetric) {
            d2 *= 0.6213712d;
        }
        return NumberFormatter.formatDouble2StringByLocale(d2, 2, 4);
    }

    private final void V() {
        if (Build.VERSION.SDK_INT >= 29) {
            String str = this.filePath;
            Objects.requireNonNull(str);
            File file = new File(str);
            String str2 = this.fileName;
            Objects.requireNonNull(str2);
            x(this, file, str2);
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        String str3 = this.filePath;
        Objects.requireNonNull(str3);
        intent.setData(Uri.fromFile(new File(str3)));
        sendBroadcast(intent);
        String str4 = this.filePath;
        Objects.requireNonNull(str4);
        sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + str4)));
    }

    private final void W(String[] permissions, final Function0<Unit> block) {
        new RxPermissions(this).request((String[]) Arrays.copyOf(permissions, permissions.length)).subscribe(new Consumer() { // from class: zr7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TrackVideoShareActivity.X(block, this, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(Function0 function0, TrackVideoShareActivity trackVideoShareActivity, Boolean bool) {
        if (bool.booleanValue()) {
            function0.invoke();
        } else {
            CustomToast.makeText(trackVideoShareActivity, trackVideoShareActivity.getString(R.string.run_share_save_permission_refuse), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(int sportType, ParsedSportDetailData trackData, Trackrecord trackRecord, float progress) {
        List<CommonTimeValuePoint> paceList;
        List<CommonTimeValuePoint> paceList2;
        CommonTimeValuePoint commonTimeValuePoint;
        List<CommonTimeValuePoint> speedList;
        List<CommonTimeValuePoint> speedList2;
        CommonTimeValuePoint commonTimeValuePoint2;
        this.isMetric = RunnerData.getRunner().isMetric();
        TextView textView = this.mRunTime;
        Objects.requireNonNull(textView);
        int length = textView.getText().toString().length();
        HMLog.info(TAG, new n(sportType, progress));
        int i2 = 0;
        if (sportType == 1 || sportType == 7 || sportType == 15 || sportType == 110 || sportType == 131 || sportType == 1001 || sportType == 1015) {
            if (!((trackData == null || (paceList = trackData.getPaceList()) == null || paceList.size() != 0) ? false : true)) {
                TextView textView2 = this.mRunTime;
                Objects.requireNonNull(textView2);
                float value = 0.0f;
                if (trackData != null && (paceList2 = trackData.getPaceList()) != null && (commonTimeValuePoint = paceList2.get((int) ((trackData.getPaceList().size() - 1) * progress))) != null) {
                    value = commonTimeValuePoint.getValue();
                }
                textView2.setText(DataFormatter.formatTimeInSportForm((long) RunDataConversion.paceMultiplyKilo(value, this.isMetric)));
            }
            if (!(progress == 1.0f) || trackData == null) {
                if ((progress == 1.0f ? (char) 1 : (char) 0) != 0 && trackData != null) {
                    HMLog.info(TAG, new o(sportType, trackData));
                    TextView textView3 = this.mRunTime;
                    Objects.requireNonNull(textView3);
                    String strPaceConvertToSpeed = RunDataConversion.paceConvertToSpeed(trackData.getAvgPace(), this.isMetric);
                    if (strPaceConvertToSpeed == null) {
                        strPaceConvertToSpeed = G();
                    }
                    textView3.setText(strPaceConvertToSpeed);
                }
            } else {
                TextView textView4 = this.mRunTime;
                Objects.requireNonNull(textView4);
                textView4.setText(D(sportType == 15 || sportType == 1015, trackData));
            }
            ImageView imageView = this.mLableImage2;
            Objects.requireNonNull(imageView);
            imageView.setImageResource(R.drawable.share_time_long);
        } else {
            if (sportType == 2001) {
                if ((progress == 1.0f ? (char) 1 : (char) 0) != 0) {
                    GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
                    GPSContourTrack.LoadData loadData = gPSSportTrackLoader == null ? null : gPSSportTrackLoader.getmData();
                    if ((loadData != null ? loadData.complexMyTrackData : null) != null) {
                        Integer num = (Integer) CollectionsKt.first(loadData.complexMyTrackData.keySet());
                        Y(num.intValue(), loadData.complexMyTrackData.get(num), loadData.complexTrackRecord.get(num), 1.0f);
                    }
                } else {
                    A(progress);
                }
            } else if (sportType != 2002) {
                if (!((trackData == null || (speedList = trackData.getSpeedList()) == null || speedList.size() != 0) ? false : true)) {
                    double value2 = 0.0d;
                    if (trackData != null && (speedList2 = trackData.getSpeedList()) != null && (commonTimeValuePoint2 = speedList2.get((int) ((trackData.getSpeedList().size() - 1) * progress))) != null) {
                        value2 = commonTimeValuePoint2.getValue();
                    }
                    if (value2 < 100.0d) {
                        TextView textView5 = this.mRunTime;
                        Objects.requireNonNull(textView5);
                        textView5.setText(NumberFormatter.formatDouble2StringByLocale(value2, 2, 4));
                    }
                    if (!(progress == 1.0f) || trackRecord == null) {
                        if ((progress == 1.0f ? (char) 1 : (char) 0) != 0 && trackData != null) {
                            HMLog.info(TAG, new q(sportType, trackData));
                            TextView textView6 = this.mRunTime;
                            Objects.requireNonNull(textView6);
                            String timeInSportForm = DataFormatter.formatTimeInSportForm((long) RunDataConversion.paceMultiplyKilo(trackData.getSpeedList().get(trackData.getSpeedList().size() - 1).getValue(), this.isMetric));
                            if (timeInSportForm == null) {
                                timeInSportForm = G();
                            }
                            textView6.setText(timeInSportForm);
                        }
                    } else {
                        TextView textView7 = this.mRunTime;
                        Objects.requireNonNull(textView7);
                        textView7.setText(U(trackRecord.getPace().floatValue()));
                    }
                    ImageView imageView2 = this.mLableImage2;
                    Objects.requireNonNull(imageView2);
                    imageView2.setImageResource(R.drawable.icon_track_speed);
                }
            } else {
                if (progress == 1.0f) {
                    GPSSportTrackLoader gPSSportTrackLoader2 = this.trackLoader;
                    GPSContourTrack.LoadData loadData2 = gPSSportTrackLoader2 == null ? null : gPSSportTrackLoader2.getmData();
                    if ((loadData2 != null ? loadData2.complexMyTrackData : null) != null) {
                        int size = loadData2.complexMyTrackData.keySet().size() - 1;
                        if (size >= 0) {
                            do {
                                i2++;
                                HMLog.info(TAG, new p(loadData2));
                            } while (i2 <= size);
                        }
                        Integer num2 = (Integer) CollectionsKt.first(loadData2.complexMyTrackData.keySet());
                        Y(num2.intValue(), loadData2.complexMyTrackData.get(num2), loadData2.complexTrackRecord.get(num2), 1.0f);
                    }
                } else {
                    A(progress);
                }
            }
        }
        TextView textView8 = this.mRunTime;
        Objects.requireNonNull(textView8);
        if (length != textView8.getText().toString().length()) {
            TextView textView9 = this.mRunTime;
            Objects.requireNonNull(textView9);
            Z(textView9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(TextView tetview) {
        try {
            TextPaint paint = tetview.getPaint();
            String string = tetview.getText().toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            float fMeasureText = paint.measureText(StringsKt__StringsKt.trim(string).toString());
            ViewGroup.LayoutParams layoutParams = tetview.getLayoutParams();
            layoutParams.width = (int) (fMeasureText + BaseTitleActivity.dp2px(getApplicationContext(), 10.0f));
            tetview.setLayoutParams(layoutParams);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(TextView tetview) {
        try {
            TextPaint paint = tetview.getPaint();
            String string = tetview.getText().toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            float fMeasureText = paint.measureText(StringsKt__StringsKt.trim(string).toString());
            ViewGroup.LayoutParams layoutParams = tetview.getLayoutParams();
            layoutParams.width = (int) (fMeasureText + BaseTitleActivity.dp2px(getApplicationContext(), 18.0f));
            tetview.setLayoutParams(layoutParams);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void b0(@StringRes int msg) {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null) {
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.show();
        } else {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(msg));
            this.mLoadingDialog = loadingDialogShowDialog;
            if (loadingDialogShowDialog == null) {
                return;
            }
            loadingDialogShowDialog.setCancelable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(final TrackVideoShareActivity trackVideoShareActivity, final String str, Bitmap bitmap) {
        ImageView imageView = trackVideoShareActivity.mMapImageView;
        Objects.requireNonNull(imageView);
        imageView.setImageBitmap(bitmap);
        ImageView imageView2 = trackVideoShareActivity.mMapImageView;
        Objects.requireNonNull(imageView2);
        imageView2.setVisibility(0);
        View view = trackVideoShareActivity.map;
        Objects.requireNonNull(view);
        view.setVisibility(8);
        Observable.timer(500L, TimeUnit.MILLISECONDS).flatMap(new Func1() { // from class: ur7
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return TrackVideoShareActivity.d0(this.a, (Long) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: ds7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                TrackVideoShareActivity.f0(this.a, str, (String) obj);
            }
        }, new Action1() { // from class: cs7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                TrackVideoShareActivity.g0(this.a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable d0(TrackVideoShareActivity trackVideoShareActivity, Long l2) throws Throwable {
        final String absolutePath = ShareFileUtils.INSTANCE.getShareCacheFile(trackVideoShareActivity.getApplicationContext(), "sport_video_short.jpg").getAbsolutePath();
        ConstraintLayout constraintLayout = trackVideoShareActivity.mContainerView;
        Objects.requireNonNull(constraintLayout);
        BitmapUtils.saveBitmapToFile(absolutePath, trackVideoShareActivity.O(constraintLayout), 90);
        return Observable.fromCallable(new Callable() { // from class: bs7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TrackVideoShareActivity.e0(absolutePath);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(TrackVideoShareActivity trackVideoShareActivity, String str, String str2) {
        trackVideoShareActivity.C();
        if (str2 != null) {
            View view = trackVideoShareActivity.map;
            Objects.requireNonNull(view);
            view.setVisibility(0);
            ImageView imageView = trackVideoShareActivity.mMapImageView;
            Objects.requireNonNull(imageView);
            imageView.setVisibility(8);
            RunnerPeripheralInfo runnerPeripheralInfo = RunnerPeripheralInfo.getInstance();
            VideoPageShareActivity.Companion companion = VideoPageShareActivity.INSTANCE;
            int i2 = R.string.track_video_share_title;
            Trackrecord trackrecord = trackVideoShareActivity.trackRecord;
            Objects.requireNonNull(trackrecord);
            companion.launch(trackVideoShareActivity, str2, trackVideoShareActivity.getString(i2, new Object[]{runnerPeripheralInfo.getName(), trackVideoShareActivity.z(trackrecord)[0] + trackVideoShareActivity.getString(R.string.run_share_common_km), trackVideoShareActivity.w()}), str, trackVideoShareActivity.getString(R.string.track_video_share_subtitle, new Object[]{trackVideoShareActivity.w()}));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(TrackVideoShareActivity trackVideoShareActivity, Throwable th) {
        HMLog.e(TAG, "Share Failed:", th);
        trackVideoShareActivity.C();
        CustomToast.makeText(trackVideoShareActivity.getApplicationContext(), R.string.share_fail, 0).show();
        View view = trackVideoShareActivity.map;
        Objects.requireNonNull(view);
        view.setVisibility(0);
        ImageView imageView = trackVideoShareActivity.mMapImageView;
        Objects.requireNonNull(imageView);
        imageView.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    private final void h0(final boolean isRecord) {
        GPSContourTrack.LoadData loadData;
        List<GPSPoint> list;
        if (isRecord) {
            ImageView imageView = this.mBackButton;
            Objects.requireNonNull(imageView);
            imageView.setVisibility(4);
            SystemClock.sleep(500L);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.FloatRef floatRef = new Ref.FloatRef();
        Trackrecord trackrecord = this.trackRecord;
        Objects.requireNonNull(trackrecord);
        floatRef.element = Float.parseFloat(z(trackrecord)[0]);
        if (this.sportType == 15) {
            Trackrecord trackrecord2 = this.trackRecord;
            Objects.requireNonNull(trackrecord2);
            floatRef.element = Float.parseFloat(z(trackrecord2)[0]) / 1000.0f;
        }
        float f2 = floatRef.element;
        int i2 = 10;
        if (f2 <= 1.0f) {
            intRef.element = 3;
        } else if (f2 > 1.0f && f2 <= 10.0f) {
            intRef.element = 8;
        } else if (f2 <= 10.0f || f2 > 20.0f) {
            intRef.element = 11;
        } else {
            intRef.element = 10;
        }
        HMLog.info(TAG, new r(intRef, floatRef));
        float f3 = floatRef.element;
        if (f3 < 1.0f) {
            i2 = 0;
        } else if (f3 >= 1.0f && f3 <= 10.0f) {
            i2 = 1;
        } else if (f3 > 10.0f && f3 <= 20.0f) {
            i2 = 2;
        } else if (f3 > 20.0f && f3 <= 75.0f) {
            i2 = 5;
        } else if (f3 <= 75.0f || f3 > 150.0f) {
            if (f3 > 150.0f && f3 <= 750.0f) {
                i2 = 50;
            } else if (f3 > 750.0f && f3 <= 1500.0f) {
                i2 = 100;
            } else if (f3 > 1500.0f && f3 <= 3000.0f) {
                i2 = 200;
            } else if (f3 > 3000.0f) {
                i2 = 500;
            } else {
                i2 = 0;
            }
        }
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if ((gPSSportTrackLoader == null || (loadData = gPSSportTrackLoader.getmData()) == null || (list = loadData.track) == null || list.size() != 0) ? false : true) {
            Toast.makeText(this, R.string.track_data_is_empty, 0).show();
            return;
        }
        GPSSportTrackLoader gPSSportTrackLoader2 = this.trackLoader;
        if (gPSSportTrackLoader2 == null) {
            return;
        }
        gPSSportTrackLoader2.startTrackPaly(i2, floatRef.element, intRef.element, new GPSSportTrackLoader.TrackPlayCallback() { // from class: com.huami.moving.ui.sport.detail.share.TrackVideoShareActivity$startTrackPlay$2

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onPlayFinish";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ float a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(float f) {
                    super(0);
                    this.a = f;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onPlayProgress:" + this.a;
                }
            }

            @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackPlayCallback
            public void onPlayFinish() {
                TrackVideoShareActivity trackVideoShareActivity;
                Trackrecord trackrecord3;
                TrackVideoShareActivity trackVideoShareActivity2;
                Trackrecord trackrecord4;
                LinearGradientView linearGradientView = this.a.mMyMaskTop;
                Objects.requireNonNull(linearGradientView);
                linearGradientView.setIsTouch(false);
                LinearGradientView linearGradientView2 = this.a.mMyMaskButtom;
                Objects.requireNonNull(linearGradientView2);
                linearGradientView2.setIsTouch(false);
                if (isRecord) {
                    this.a.j0(false);
                }
                ImageView imageView2 = this.a.mBackButton;
                Objects.requireNonNull(imageView2);
                imageView2.setVisibility(0);
                HMLog.info(TrackVideoShareActivity.TAG, a.a);
                try {
                    TextView textView = this.a.mRunDantance;
                    if (textView == null || (trackrecord4 = (trackVideoShareActivity2 = this.a).trackRecord) == null) {
                        throw null;
                    }
                    textView.setText(trackVideoShareActivity2.z(trackrecord4)[0]);
                    TrackVideoShareActivity trackVideoShareActivity3 = this.a;
                    TextView textView2 = trackVideoShareActivity3.mRunDantance;
                    if (textView2 == null) {
                        throw null;
                    }
                    trackVideoShareActivity3.a0(textView2);
                    TextView textView3 = this.a.mRunStartTime;
                    Objects.requireNonNull(textView3);
                    TrackVideoShareActivity trackVideoShareActivity4 = this.a;
                    Trackrecord trackrecord5 = trackVideoShareActivity4.trackRecord;
                    Objects.requireNonNull(trackrecord5);
                    textView3.setText(trackVideoShareActivity4.F(trackrecord5));
                    TrackVideoShareActivity trackVideoShareActivity5 = this.a;
                    int i3 = trackVideoShareActivity5.sportType;
                    ParsedSportDetailData parsedSportDetailData = this.a.trackData;
                    Objects.requireNonNull(parsedSportDetailData);
                    Trackrecord trackrecord6 = this.a.trackRecord;
                    Objects.requireNonNull(trackrecord6);
                    trackVideoShareActivity5.Y(i3, parsedSportDetailData, trackrecord6, 1.0f);
                    try {
                        TextView textView4 = this.a.mRunCalories;
                        if (textView4 == null || (trackrecord3 = (trackVideoShareActivity = this.a).trackRecord) == null) {
                            throw null;
                        }
                        textView4.setText(NumberFormatter.formatDouble2StringByLocale(Double.parseDouble(trackVideoShareActivity.E(trackrecord3)), 0, new int[0]));
                        TrackVideoShareActivity trackVideoShareActivity6 = this.a;
                        TextView textView5 = trackVideoShareActivity6.mRunDantance;
                        Objects.requireNonNull(textView5);
                        trackVideoShareActivity6.a0(textView5);
                        TrackVideoShareActivity trackVideoShareActivity7 = this.a;
                        TextView textView6 = trackVideoShareActivity7.mRunStartTime;
                        Objects.requireNonNull(textView6);
                        trackVideoShareActivity7.Z(textView6);
                        TrackVideoShareActivity trackVideoShareActivity8 = this.a;
                        TextView textView7 = trackVideoShareActivity8.mRunTime;
                        Objects.requireNonNull(textView7);
                        trackVideoShareActivity8.Z(textView7);
                        TrackVideoShareActivity trackVideoShareActivity9 = this.a;
                        TextView textView8 = trackVideoShareActivity9.mRunCalories;
                        Objects.requireNonNull(textView8);
                        trackVideoShareActivity9.Z(textView8);
                        ImageView imageView3 = this.a.mPlayButton;
                        Objects.requireNonNull(imageView3);
                        imageView3.setVisibility(0);
                        RelativeLayout relativeLayout = this.a.mShareLinear;
                        Objects.requireNonNull(relativeLayout);
                        relativeLayout.setVisibility(0);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        TextView textView9 = this.a.mRunCalories;
                        Objects.requireNonNull(textView9);
                        textView9.setText("--");
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }

            @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackPlayCallback
            public void onPlayProgress(float progress) {
                TrackVideoShareActivity trackVideoShareActivity;
                Trackrecord trackrecord3;
                if (Float.isNaN(progress)) {
                    return;
                }
                HMLog.info(TrackVideoShareActivity.TAG, new b(progress));
                TrackVideoShareActivity.Companion companion = TrackVideoShareActivity.INSTANCE;
                TrackVideoShareActivity.B0 = (int) (100 * progress);
                TextView textView = this.a.mRunDantance;
                Objects.requireNonNull(textView);
                int length = textView.getText().toString().length();
                if (this.a.sportType == 15) {
                    TextView textView2 = this.a.mRunDantance;
                    Objects.requireNonNull(textView2);
                    TrackVideoShareActivity trackVideoShareActivity2 = this.a;
                    Trackrecord trackrecord4 = trackVideoShareActivity2.trackRecord;
                    Objects.requireNonNull(trackrecord4);
                    double d2 = progress;
                    textView2.setText(String.valueOf((int) (Double.parseDouble(trackVideoShareActivity2.z(trackrecord4)[0]) * d2)));
                    TrackVideoShareActivity trackVideoShareActivity3 = this.a;
                    Trackrecord trackrecord5 = trackVideoShareActivity3.trackRecord;
                    Objects.requireNonNull(trackrecord5);
                    if (length != String.valueOf((int) (Double.parseDouble(trackVideoShareActivity3.z(trackrecord5)[0]) * d2)).length()) {
                        TrackVideoShareActivity trackVideoShareActivity4 = this.a;
                        TextView textView3 = trackVideoShareActivity4.mRunDantance;
                        Objects.requireNonNull(textView3);
                        trackVideoShareActivity4.a0(textView3);
                    }
                } else {
                    TextView textView4 = this.a.mRunDantance;
                    Objects.requireNonNull(textView4);
                    TrackVideoShareActivity trackVideoShareActivity5 = this.a;
                    Trackrecord trackrecord6 = trackVideoShareActivity5.trackRecord;
                    Objects.requireNonNull(trackrecord6);
                    double d3 = progress;
                    textView4.setText(NumberFormatter.formatDouble2StringByLocale(Double.parseDouble(trackVideoShareActivity5.z(trackrecord6)[0]) * d3, 2, new int[0]));
                    TrackVideoShareActivity trackVideoShareActivity6 = this.a;
                    Trackrecord trackrecord7 = trackVideoShareActivity6.trackRecord;
                    Objects.requireNonNull(trackrecord7);
                    if (length != NumberFormatter.formatDouble2StringByLocale(Double.parseDouble(trackVideoShareActivity6.z(trackrecord7)[0]) * d3, 2, new int[0]).length()) {
                        TrackVideoShareActivity trackVideoShareActivity7 = this.a;
                        TextView textView5 = trackVideoShareActivity7.mRunDantance;
                        Objects.requireNonNull(textView5);
                        trackVideoShareActivity7.a0(textView5);
                    }
                }
                TextView textView6 = this.a.mRunStartTime;
                Objects.requireNonNull(textView6);
                int length2 = textView6.getText().toString().length();
                TextView textView7 = this.a.mRunStartTime;
                Objects.requireNonNull(textView7);
                Trackrecord trackrecord8 = this.a.trackRecord;
                Objects.requireNonNull(trackrecord8);
                textView7.setText(DataFormatter.getConsumeTime((long) (trackrecord8.getCosttime().intValue() * progress)));
                TextView textView8 = this.a.mRunStartTime;
                Objects.requireNonNull(textView8);
                if (length2 != textView8.getText().toString().length()) {
                    TrackVideoShareActivity trackVideoShareActivity8 = this.a;
                    TextView textView9 = trackVideoShareActivity8.mRunStartTime;
                    Objects.requireNonNull(textView9);
                    trackVideoShareActivity8.Z(textView9);
                }
                TrackVideoShareActivity trackVideoShareActivity9 = this.a;
                int i3 = trackVideoShareActivity9.sportType;
                ParsedSportDetailData parsedSportDetailData = this.a.trackData;
                Objects.requireNonNull(parsedSportDetailData);
                Trackrecord trackrecord9 = this.a.trackRecord;
                Objects.requireNonNull(trackrecord9);
                trackVideoShareActivity9.Y(i3, parsedSportDetailData, trackrecord9, progress);
                try {
                    TextView textView10 = this.a.mRunCalories;
                    if (textView10 == null) {
                        throw null;
                    }
                    String string = textView10.getText().toString();
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    if (Intrinsics.areEqual("--", StringsKt__StringsKt.trim(string).toString())) {
                        return;
                    }
                    TextView textView11 = this.a.mRunCalories;
                    if (textView11 == null) {
                        throw null;
                    }
                    int length3 = textView11.getText().toString().length();
                    TextView textView12 = this.a.mRunCalories;
                    if (textView12 == null || (trackrecord3 = (trackVideoShareActivity = this.a).trackRecord) == null) {
                        throw null;
                    }
                    textView12.setText(NumberFormatter.formatDouble2StringByLocale(Double.parseDouble(trackVideoShareActivity.E(trackrecord3)) * ((double) progress), 0, new int[0]));
                    TextView textView13 = this.a.mRunCalories;
                    if (textView13 == null) {
                        throw null;
                    }
                    if (length3 != textView13.getText().toString().length()) {
                        TrackVideoShareActivity trackVideoShareActivity10 = this.a;
                        TextView textView14 = trackVideoShareActivity10.mRunCalories;
                        if (textView14 == null) {
                            throw null;
                        }
                        trackVideoShareActivity10.Z(textView14);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    TextView textView15 = this.a.mRunCalories;
                    Objects.requireNonNull(textView15);
                    textView15.setText("--");
                }
            }

            @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackPlayCallback
            public void onPlayStart() {
                LinearGradientView linearGradientView = this.a.mMyMaskTop;
                Objects.requireNonNull(linearGradientView);
                linearGradientView.setIsTouch(true);
                LinearGradientView linearGradientView2 = this.a.mMyMaskButtom;
                Objects.requireNonNull(linearGradientView2);
                linearGradientView2.setIsTouch(true);
                ImageView imageView2 = this.a.mPlayButton;
                Objects.requireNonNull(imageView2);
                imageView2.setVisibility(8);
                RelativeLayout relativeLayout = this.a.mShareLinear;
                Objects.requireNonNull(relativeLayout);
                relativeLayout.setVisibility(8);
            }
        });
    }

    private final void hideProgressDialog() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null || loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        if (Build.VERSION.SDK_INT >= 21) {
            MediaProjectionManager mediaProjectionManager = C0;
            Intent intentCreateScreenCaptureIntent = null;
            if (mediaProjectionManager != null && mediaProjectionManager != null) {
                intentCreateScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
            }
            ImageView imageView = this.mBackButton;
            Objects.requireNonNull(imageView);
            imageView.setVisibility(4);
            ImageView imageView2 = this.mPlayButton;
            Objects.requireNonNull(imageView2);
            imageView2.setVisibility(8);
            RelativeLayout relativeLayout = this.mShareLinear;
            Objects.requireNonNull(relativeLayout);
            relativeLayout.setVisibility(8);
            NavigationBarUtil navigationBarUtil = NavigationBarUtil.INSTANCE;
            navigationBarUtil.focusNotAle(getWindow());
            startActivityForResult(intentCreateScreenCaptureIntent, 2);
            navigationBarUtil.clearFocusNotAle(getWindow());
        }
    }

    private final void initView() {
        Trackrecord trackrecord;
        TextView textView = (TextView) findViewById(R.id.tv_track_video_save);
        TextView textView2 = (TextView) findViewById(R.id.tv_track_video_share);
        if (Utils.isMidong()) {
            int i2 = R.drawable.shape_rect_orange_corner_23_zepp;
            textView.setBackgroundResource(i2);
            textView2.setBackgroundResource(i2);
        } else {
            int i3 = R.drawable.shape_rect_orange_corner_23;
            textView.setBackgroundResource(i3);
            textView2.setBackgroundResource(i3);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: wr7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackVideoShareActivity.Q(this.a, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: vr7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackVideoShareActivity.R(this.a, view);
            }
        });
        int i4 = R.id.back;
        ((ImageView) findViewById(i4)).setOnClickListener(new View.OnClickListener() { // from class: xr7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackVideoShareActivity.S(this.a, view);
            }
        });
        this.mBackButton = (ImageView) findViewById(i4);
        this.mUserAvatar = (ImageView) findViewById(R.id.user_avatar);
        this.mUserName = (TextView) findViewById(R.id.user_name);
        this.mRunDate = (TextView) findViewById(R.id.track_time);
        this.mRunDantance = (TextView) findViewById(R.id.run_distance);
        this.mDantanceLable = (TextView) findViewById(R.id.lable_speed);
        this.mRunStartTime = (TextView) findViewById(R.id.share_start_time);
        this.mRunTime = (TextView) findViewById(R.id.run_time);
        this.mRunCalories = (TextView) findViewById(R.id.run_calories);
        this.mShareLinear = (RelativeLayout) findViewById(R.id.share_linear);
        this.mMyMaskTop = (LinearGradientView) findViewById(R.id.map_top);
        this.mMyMaskButtom = (LinearGradientView) findViewById(R.id.map_bottom);
        this.mLableImage2 = (ImageView) findViewById(R.id.lable_image_2);
        this.mContainerView = (ConstraintLayout) findViewById(R.id.container_view);
        this.mMapImageView = (ImageView) findViewById(R.id.map_image);
        this.mIvWaterMark = (ImageView) findViewById(R.id.iv_water_mark);
        if (!Utils.isMidong()) {
            ImageView imageView = this.mIvWaterMark;
            Objects.requireNonNull(imageView);
            imageView.setBackgroundResource(R.drawable.water_mark_life);
        }
        LinearGradientView linearGradientView = this.mMyMaskTop;
        Objects.requireNonNull(linearGradientView);
        linearGradientView.setColor(new int[]{ContextCompat.getColor(this, R.color.color_black40), 0});
        LinearGradientView linearGradientView2 = this.mMyMaskButtom;
        Objects.requireNonNull(linearGradientView2);
        linearGradientView2.setColor(new int[]{0, ContextCompat.getColor(this, R.color.color_black60)});
        RunnerPeripheralInfo runnerPeripheralInfo = RunnerPeripheralInfo.getInstance();
        ImageView imageView2 = this.mUserAvatar;
        Objects.requireNonNull(imageView2);
        k0(runnerPeripheralInfo, imageView2);
        TextView textView3 = this.mRunDate;
        Objects.requireNonNull(textView3);
        textView3.setText(K().getFullTimeFormatString(getApplicationContext(), this.trackId * ((long) 1000)));
        TextView textView4 = this.mUserName;
        Objects.requireNonNull(textView4);
        String name = runnerPeripheralInfo.getName();
        if (name == null) {
            name = "";
        }
        textView4.setText(name);
        TextView textView5 = this.mRunDantance;
        Objects.requireNonNull(textView5);
        Trackrecord trackrecord2 = this.trackRecord;
        Objects.requireNonNull(trackrecord2);
        textView5.setText(z(trackrecord2)[0]);
        TextView textView6 = this.mDantanceLable;
        Objects.requireNonNull(textView6);
        Trackrecord trackrecord3 = this.trackRecord;
        Objects.requireNonNull(trackrecord3);
        textView6.setText(getString(Integer.parseInt(z(trackrecord3)[1])));
        TextView textView7 = this.mRunStartTime;
        Objects.requireNonNull(textView7);
        Trackrecord trackrecord4 = this.trackRecord;
        Objects.requireNonNull(trackrecord4);
        textView7.setText(F(trackrecord4));
        try {
            TextView textView8 = this.mRunCalories;
            if (textView8 == null || (trackrecord = this.trackRecord) == null) {
                throw null;
            }
            textView8.setText(NumberFormatter.formatDouble2StringByLocale(Double.parseDouble(E(trackrecord)), 0, new int[0]));
            TextView textView9 = this.mRunDantance;
            Objects.requireNonNull(textView9);
            a0(textView9);
            TextView textView10 = this.mRunStartTime;
            Objects.requireNonNull(textView10);
            Z(textView10);
            TextView textView11 = this.mRunTime;
            Objects.requireNonNull(textView11);
            Z(textView11);
            TextView textView12 = this.mRunCalories;
            Objects.requireNonNull(textView12);
            Z(textView12);
            ImageView imageView3 = (ImageView) findViewById(R.id.image_play);
            this.mPlayButton = imageView3;
            Objects.requireNonNull(imageView3);
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: tr7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrackVideoShareActivity.T(this.a, view);
                }
            });
        } catch (Exception e2) {
            TextView textView13 = this.mRunCalories;
            Objects.requireNonNull(textView13);
            textView13.setText("--");
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(boolean isPause) {
        boolean z;
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            if (virtualDisplay != null) {
                virtualDisplay.release();
            }
            this.mVirtualDisplay = null;
        }
        MediaRecorder mediaRecorder = this.mMediaRecorder;
        if (mediaRecorder != null) {
            if (mediaRecorder != null) {
                mediaRecorder.setOnErrorListener(null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                MediaProjection mediaProjection = this.mMediaProjection;
                if (mediaProjection != null) {
                    mediaProjection.stop();
                }
                z = true;
            } else {
                z = false;
            }
            MediaRecorder mediaRecorder2 = this.mMediaRecorder;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
            }
        } else {
            z = false;
        }
        MediaProjection mediaProjection2 = this.mMediaProjection;
        if (mediaProjection2 != null) {
            if (Build.VERSION.SDK_INT >= 21 && !z && mediaProjection2 != null) {
                mediaProjection2.stop();
            }
            this.mMediaProjection = null;
        }
        if (isPause) {
            return;
        }
        SportVideoAfterSaveShareDialog sportVideoAfterSaveShareDialog = this.sportVideoAfterSaveShareDialog;
        if (sportVideoAfterSaveShareDialog != null && sportVideoAfterSaveShareDialog.isVisible()) {
            return;
        }
        if (this.sportVideoAfterSaveShareDialog == null) {
            this.sportVideoAfterSaveShareDialog = new SportVideoAfterSaveShareDialog();
        }
        SportVideoAfterSaveShareDialog sportVideoAfterSaveShareDialog2 = this.sportVideoAfterSaveShareDialog;
        if (sportVideoAfterSaveShareDialog2 != null) {
            sportVideoAfterSaveShareDialog2.showAllowingStateLoss(getSupportFragmentManager(), "TVSActivity");
        }
        V();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    private final void k0(RunnerPeripheralInfo info, ImageView view) {
        String avatarUrl;
        String avatarPath = info.getAvatarPath();
        if (avatarPath != null) {
            if (!new File(avatarPath).exists()) {
                avatarPath = null;
            }
            if (avatarPath == null) {
                avatarPath = null;
            } else {
                BitmapUtils.displayRoundImage(this, avatarPath, view);
            }
        } else {
            avatarPath = null;
        }
        if (avatarPath != null || (avatarUrl = info.getAvatarUrl()) == null) {
            return;
        }
        String str = kotlin.text.m.isBlank(avatarUrl) ? null : avatarUrl;
        if (str == null) {
            return;
        }
        BitmapUtils.displayRoundImage(this, str, view);
    }

    private final String l0(Integer value, Function1<? super Integer, String> block) {
        String strInvoke = null;
        if (value != null) {
            if (!(value.intValue() > 0)) {
                value = null;
            }
            if (value != null) {
                strInvoke = block.invoke(value);
            }
        }
        return strInvoke == null ? G() : strInvoke;
    }

    private final String w() {
        SportTypeIconUtils sportTypeIconUtils = SportTypeIconUtils.INSTANCE;
        if (!sportTypeIconUtils.getSportNameMap().containsKey(Integer.valueOf(this.sportType))) {
            return getString(R.string.running_sports_type_running);
        }
        Integer num = sportTypeIconUtils.getSportNameMap().get(Integer.valueOf(this.sportType));
        if (num == null) {
            return null;
        }
        return getString(num.intValue());
    }

    private final boolean x(Context context, File internalMove, String filename) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String str = Environment.DIRECTORY_MOVIES;
            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", filename);
            contentValues.put("mime_type", MimeTypes.VIDEO_MP4);
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues.put("relative_path", str);
            }
            ContentResolver contentResolver = context.getContentResolver();
            Uri uriInsert = contentResolver.insert(uri, contentValues);
            if (uriInsert == null) {
                HMLog.info(TAG, b.a);
            } else {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    ByteStreamsKt.copyTo$default(new FileInputStream(internalMove), outputStreamOpenOutputStream, 0, 2, null);
                    return true;
                }
                HMLog.info(TAG, a.a);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(false);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(TAG, new c(thM3848exceptionOrNullimpl));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    public static /* synthetic */ boolean y(TrackVideoShareActivity trackVideoShareActivity, Context context, File file, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = "share.mp4";
        }
        return trackVideoShareActivity.x(context, file, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String[] z(Trackrecord record) {
        this.isMetric = RunnerData.getRunner().isMetric();
        if (record.getDistance() == null) {
            return new String[]{G(), String.valueOf(this.isMetric ? R.string.run_share_common_km : R.string.running_mile)};
        }
        CardInfoAdapter.Companion companion = CardInfoAdapter.INSTANCE;
        float fIntValue = record.getDistance().intValue();
        Integer type = record.getType();
        return companion.getFormatDisAndUnit(fIntValue, type != null ? type.intValue() : 1, this.isMetric);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackLoadCallback
    @NotNull
    public Context getAttechActivity() {
        return this;
    }

    @Nullable
    public final GPSSportTrackLoader getTrackLoader() {
        return this.trackLoader;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        MediaProjectionManager mediaProjectionManager;
        VirtualDisplay virtualDisplayCreateVirtualDisplay;
        super.onActivityResult(requestCode, resultCode, data);
        HMLog.info(TAG, new k(requestCode, resultCode, data));
        NavigationBarUtil.INSTANCE.hideNavigationBar(getWindow());
        if (requestCode == 2 && resultCode != -1) {
            CustomToast.makeText(this, getString(R.string.run_share_record_permission_refuse), 0).show();
            ImageView imageView = this.mBackButton;
            Objects.requireNonNull(imageView);
            imageView.setVisibility(0);
            ImageView imageView2 = this.mPlayButton;
            Objects.requireNonNull(imageView2);
            imageView2.setVisibility(0);
            RelativeLayout relativeLayout = this.mShareLinear;
            Objects.requireNonNull(relativeLayout);
            relativeLayout.setVisibility(0);
            return;
        }
        if (requestCode != 2 || Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.mMediaProjection = (data == null || (mediaProjectionManager = C0) == null) ? null : mediaProjectionManager.getMediaProjection(resultCode, data);
        MediaRecorder mediaRecorderI = I();
        this.mMediaRecorder = mediaRecorderI;
        MediaProjection mediaProjection = this.mMediaProjection;
        if (mediaProjection == null) {
            virtualDisplayCreateVirtualDisplay = null;
        } else {
            virtualDisplayCreateVirtualDisplay = mediaProjection.createVirtualDisplay("TrackVideo", this.mScreenWidth, this.mScreenHeight, this.mScreenDensity, 16, mediaRecorderI == null ? null : mediaRecorderI.getSurface(), null, null);
        }
        this.mVirtualDisplay = virtualDisplayCreateVirtualDisplay;
        try {
            HMLog.info(TAG, l.a);
            h0(true);
            ImageView imageView3 = this.mPlayButton;
            if (imageView3 == null) {
                throw null;
            }
            imageView3.setVisibility(8);
            RelativeLayout relativeLayout2 = this.mShareLinear;
            if (relativeLayout2 == null) {
                throw null;
            }
            relativeLayout2.setVisibility(8);
            MediaRecorder mediaRecorder = this.mMediaRecorder;
            if (mediaRecorder == null) {
                return;
            }
            mediaRecorder.start();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseTitleActivity.STYLE.NONE);
        M(savedInstanceState);
        initView();
        J();
        P();
        HMLog.info(TAG, m.a);
        int i2 = this.sportType;
        ParsedSportDetailData parsedSportDetailData = this.trackData;
        Objects.requireNonNull(parsedSportDetailData);
        Trackrecord trackrecord = this.trackRecord;
        Objects.requireNonNull(trackrecord);
        Y(i2, parsedSportDetailData, trackrecord, 1.0f);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if (gPSSportTrackLoader != null) {
            gPSSportTrackLoader.pauseMap();
        }
        j0(true);
        B();
        super.onDestroy();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LinearGradientView linearGradientView = this.mMyMaskTop;
        Objects.requireNonNull(linearGradientView);
        linearGradientView.setIsTouch(false);
        LinearGradientView linearGradientView2 = this.mMyMaskButtom;
        Objects.requireNonNull(linearGradientView2);
        linearGradientView2.setIsTouch(false);
        super.onResume();
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if (gPSSportTrackLoader == null) {
            return;
        }
        gPSSportTrackLoader.resumeMap();
    }

    @Override // com.huami.view.basetitle.BaseFragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if (gPSSportTrackLoader == null) {
            return;
        }
        gPSSportTrackLoader.saveInstanceStateMap(outState);
    }

    public final void showTrackVideoShareDialog(@NotNull final String shareUrl) {
        b0(R.string.running_data_loading);
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if (gPSSportTrackLoader == null) {
            return;
        }
        gPSSportTrackLoader.mapScreenShot(new IGPSSolution.IOnMapScreenShotListener() { // from class: yr7
            @Override // com.huami.moving.maps.IGPSSolution.IOnMapScreenShotListener
            public final void onMapScreenShot(Bitmap bitmap) {
                TrackVideoShareActivity.c0(this.a, shareUrl, bitmap);
            }
        });
    }

    @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackLoadCallback
    public void whenContourTrackCreated(@NotNull String path) {
    }

    @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackLoadCallback
    public void whenMapLoaded() {
    }

    @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackLoadCallback
    public void whenTrackDataLoaded() {
        HMLog.info(TAG, s.a);
        int i2 = this.sportType;
        ParsedSportDetailData parsedSportDetailData = this.trackData;
        Objects.requireNonNull(parsedSportDetailData);
        Trackrecord trackrecord = this.trackRecord;
        Objects.requireNonNull(trackrecord);
        Y(i2, parsedSportDetailData, trackrecord, 1.0f);
    }
}
