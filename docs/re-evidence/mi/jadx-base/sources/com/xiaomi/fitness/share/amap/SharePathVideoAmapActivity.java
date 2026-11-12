package com.xiaomi.fitness.share.amap;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.amap.api.maps.AMap;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.animation.ScaleAnimation;
import com.amap.api.maps.utils.overlay.MovingPointOverlay;
import com.mi.health.utils.MapUtilsKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.nanchen.screenrecordhelper.ScreenRecordHelper;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.video.share.adapter.ShowPicCarouselAdapter;
import com.xiaomi.fitness.detail.video.share.holder.EditDetailPanelHolder;
import com.xiaomi.fitness.detail.video.share.holder.ShareVideoHolder;
import com.xiaomi.fitness.detail.video.share.holder.SwitchMapPanelHolder;
import com.xiaomi.fitness.detail.video.share.holder.SwitchMusicPanelHolder;
import com.xiaomi.fitness.detail.video.share.holder.TabLayoutHolder;
import com.xiaomi.fitness.detail.video.share.holder.TimelineViewHolder;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.util.DownloadMusicUtil;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResUtilExtKt;
import com.xiaomi.fitness.detail.video.share.widget.ShowSportTracePicAndFeelingsFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity;
import com.xiaomi.fitness.share.amap.data.ImgTextData;
import com.xiaomi.fitness.share.amap.ext.MapPathExtKt;
import com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt;
import com.xiaomi.fitness.share.mapbox.ScreenRecorderService;
import com.xiaomi.fitness.share.view.DataTitleShareVideo;
import com.xiaomi.fitness.share.view.SportTraceDataView;
import com.xiaomi.fitness.util.AMapPathUtils;
import defpackage.av6;
import defpackage.bhl;
import defpackage.dki;
import defpackage.hoi;
import defpackage.hqp;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.ni4;
import defpackage.pqp;
import defpackage.sha;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u0000 \u008a\u00022\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u008a\u0002B\b¢\u0006\u0005\b\u0089\u0002\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010 \u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\r2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u001dj\b\u0012\u0004\u0012\u00020\u001a`\u001eH\u0002¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\t2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010\u0006J'\u0010)\u001a\u00020\u00042\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\t0\u001dj\b\u0012\u0004\u0012\u00020\t`\u001eH\u0002¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u00042\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\t0\u001dj\b\u0012\u0004\u0012\u00020\t`\u001eH\u0002¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010\u0006J\u0019\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u0010\u0006J)\u00107\u001a\u00020\u00042\u0006\u00102\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u000205H\u0003¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\u0004H\u0002¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010<\u001a\u00020\u0004H\u0002¢\u0006\u0004\b<\u0010\u0006J\u000f\u0010=\u001a\u00020\u0004H\u0002¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010>\u001a\u00020\u0004H\u0002¢\u0006\u0004\b>\u0010\u0006J\u000f\u0010?\u001a\u00020\u0004H\u0002¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010@\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010A\u001a\u00020\u0004H\u0002¢\u0006\u0004\bA\u0010\u0006J\u0013\u0010B\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0004¢\u0006\u0004\bD\u0010\u0006J\u0019\u0010G\u001a\u0004\u0018\u00010\u000b2\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ\u0019\u0010K\u001a\u00020\u00042\b\u0010J\u001a\u0004\u0018\u00010IH\u0014¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0004H\u0014¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010N\u001a\u00020\u0004H\u0014¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010O\u001a\u00020\u0004H\u0014¢\u0006\u0004\bO\u0010\u0006J\u0017\u0010Q\u001a\u00020\u00042\u0006\u0010P\u001a\u00020IH\u0014¢\u0006\u0004\bQ\u0010LJ\u000f\u0010R\u001a\u00020\u0004H\u0014¢\u0006\u0004\bR\u0010\u0006J)\u0010T\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\u0004¢\u0006\u0004\bV\u0010\u0006J\u001f\u0010[\u001a\u00020\u00042\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\u0004¢\u0006\u0004\b]\u0010\u0006J\r\u0010^\u001a\u00020\u0004¢\u0006\u0004\b^\u0010\u0006J\u000f\u0010_\u001a\u00020\u000fH\u0016¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\u0004¢\u0006\u0004\ba\u0010\u0006J\u0015\u0010d\u001a\u00020\u00042\u0006\u0010c\u001a\u00020b¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u0004H\u0016¢\u0006\u0004\bf\u0010\u0006R\"\u0010h\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010o\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010v\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010}\u001a\u0004\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010¤\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R*\u0010«\u0001\u001a\u00030ª\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R)\u0010±\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R(\u0010·\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0005\b»\u0001\u0010CR'\u0010¼\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0005\b¼\u0001\u0010`\"\u0005\b¾\u0001\u0010\u0014R'\u0010¿\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b¿\u0001\u0010½\u0001\u001a\u0005\b¿\u0001\u0010`\"\u0005\bÀ\u0001\u0010\u0014R'\u0010Á\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÁ\u0001\u0010½\u0001\u001a\u0005\bÁ\u0001\u0010`\"\u0005\bÂ\u0001\u0010\u0014R\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R)\u0010Æ\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010\u008d\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R)\u0010Ë\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010\u008d\u0001\u001a\u0006\bÌ\u0001\u0010È\u0001\"\u0006\bÍ\u0001\u0010Ê\u0001R)\u0010Î\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010\u008d\u0001\u001a\u0006\bÏ\u0001\u0010È\u0001\"\u0006\bÐ\u0001\u0010Ê\u0001R'\u0010Ñ\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÑ\u0001\u0010½\u0001\u001a\u0005\bÑ\u0001\u0010`\"\u0005\bÒ\u0001\u0010\u0014R'\u0010Ó\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÓ\u0001\u0010½\u0001\u001a\u0005\bÓ\u0001\u0010`\"\u0005\bÔ\u0001\u0010\u0014R'\u0010Õ\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÕ\u0001\u0010½\u0001\u001a\u0005\bÕ\u0001\u0010`\"\u0005\bÖ\u0001\u0010\u0014R)\u0010×\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b×\u0001\u0010\u008d\u0001\u001a\u0006\bØ\u0001\u0010È\u0001\"\u0006\bÙ\u0001\u0010Ê\u0001R+\u0010Ú\u0001\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R\u0019\u0010à\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010½\u0001R\u0019\u0010á\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010½\u0001R)\u0010â\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bâ\u0001\u0010\u008d\u0001\u001a\u0006\bã\u0001\u0010È\u0001\"\u0006\bä\u0001\u0010Ê\u0001R*\u0010æ\u0001\u001a\u00030å\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R,\u0010í\u0001\u001a\u0005\u0018\u00010ì\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R'\u0010ó\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bó\u0001\u0010½\u0001\u001a\u0005\bó\u0001\u0010`\"\u0005\bô\u0001\u0010\u0014R'\u0010õ\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bõ\u0001\u0010½\u0001\u001a\u0005\bõ\u0001\u0010`\"\u0005\bö\u0001\u0010\u0014R'\u0010÷\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b÷\u0001\u0010½\u0001\u001a\u0005\b÷\u0001\u0010`\"\u0005\bø\u0001\u0010\u0014R'\u0010ù\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bù\u0001\u0010½\u0001\u001a\u0005\bù\u0001\u0010`\"\u0005\bú\u0001\u0010\u0014R)\u0010û\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bû\u0001\u0010\u008d\u0001\u001a\u0006\bü\u0001\u0010È\u0001\"\u0006\bý\u0001\u0010Ê\u0001R)\u0010þ\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bþ\u0001\u0010\u008d\u0001\u001a\u0006\bÿ\u0001\u0010È\u0001\"\u0006\b\u0080\u0002\u0010Ê\u0001R\u001a\u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001a\u0010\u0084\u0002\u001a\u00030\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0083\u0002R\u0017\u0010\u0086\u0002\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010È\u0001R\u0017\u0010\u0088\u0002\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010È\u0001¨\u0006\u008b\u0002"}, d2 = {"Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;", "Lhqp;", "", "initTrace", "()V", "beginTrace", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/amap/api/maps/model/LatLng;", "latlng", "Landroid/graphics/Bitmap;", "bitmap", "", "code", "", "isPre", "setStartOrEndMarketAnimation", "(Lcom/amap/api/maps/model/LatLng;Landroid/graphics/Bitmap;IZ)V", "startMove", "(Z)V", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "traceStyleResModel", "endTrace", "(ZLcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;)V", "realIndex", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "curLocation", "colorInterval", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mUniformOriginalList", "drawColorLine", "(ILcom/xiaomi/fit/data/common/data/sport/Location;ILjava/util/ArrayList;)V", "latLng", "", "colorList", "drawLines", "(Lcom/amap/api/maps/model/LatLng;Ljava/util/List;)V", "clearPassPolyline", "list", "initMoveMarker", "(Ljava/util/ArrayList;)V", "initMoveMarker2", "showPreTrace", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "account", "showProfileInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;)V", "getSportRecordData", "resultCode", "Landroid/content/Intent;", "data", "", "musicPath", "screenRecord", "(ILandroid/content/Intent;Ljava/lang/String;)V", "initShareVideoHolder", "initEditDetailPanel", "initSwitchMapPanel", "initMusicPanel", "initTabLayout", "setTimelineDragCallback", "setEditOrEditBtnCallback", "showEditDialog", "stopScreenRecord", "bindView", "(Lhqp;)V", "reset", "Landroid/graphics/drawable/Drawable;", "sourceDrawable", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_PAUSE, "outState", "onSaveInstanceState", LifecycleConstantKt.ON_DESTROY, AccountInteractActivity.KEY_REQUEST_CODE, "onActivityResult", "(IILandroid/content/Intent;)V", "showWXShare", "Ljava/lang/Runnable;", "runnable", "", "delayMillis", "postDelay", "(Ljava/lang/Runnable;J)V", "startTrace", "endRecordTrace", "isInvalid", "()Z", "showStatusActionBar", "", "progressValue", "autoPlayPicCarousel", "(F)V", "onBackPressed", "Lcom/amap/api/maps/AMap;", "aMap", "Lcom/amap/api/maps/AMap;", "getAMap", "()Lcom/amap/api/maps/AMap;", "setAMap", "(Lcom/amap/api/maps/AMap;)V", "Lcom/amap/api/maps/utils/overlay/MovingPointOverlay;", "moveMarker", "Lcom/amap/api/maps/utils/overlay/MovingPointOverlay;", "getMoveMarker", "()Lcom/amap/api/maps/utils/overlay/MovingPointOverlay;", "setMoveMarker", "(Lcom/amap/api/maps/utils/overlay/MovingPointOverlay;)V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "Lcom/nanchen/screenrecordhelper/ScreenRecordHelper;", "screenRecordHelper", "Lcom/nanchen/screenrecordhelper/ScreenRecordHelper;", "getScreenRecordHelper", "()Lcom/nanchen/screenrecordhelper/ScreenRecordHelper;", "setScreenRecordHelper", "(Lcom/nanchen/screenrecordhelper/ScreenRecordHelper;)V", "Lcom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment;", "showPictureDialogFragment", "Lcom/xiaomi/fitness/detail/video/share/widget/ShowSportTracePicAndFeelingsFragment;", "Lcom/xiaomi/fitness/detail/video/share/adapter/ShowPicCarouselAdapter;", "showPicCarouselAdapter", "Lcom/xiaomi/fitness/detail/video/share/adapter/ShowPicCarouselAdapter;", "Landroid/os/CountDownTimer;", "showPicTimer", "Landroid/os/CountDownTimer;", "showPicCounter", "I", "Lcom/xiaomi/fitness/detail/video/share/holder/EditDetailPanelHolder;", "editDetailPanelHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/EditDetailPanelHolder;", "getEditDetailPanelHolder", "()Lcom/xiaomi/fitness/detail/video/share/holder/EditDetailPanelHolder;", "setEditDetailPanelHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/EditDetailPanelHolder;)V", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMapPanelHolder;", "switchMapPanelHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMapPanelHolder;", "getSwitchMapPanelHolder", "()Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMapPanelHolder;", "setSwitchMapPanelHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMapPanelHolder;)V", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;", "switchMusicPanelHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;", "getSwitchMusicPanelHolder", "()Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;", "setSwitchMusicPanelHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;)V", "Lcom/xiaomi/fitness/detail/video/share/holder/TabLayoutHolder;", "tabLayoutHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/TabLayoutHolder;", "getTabLayoutHolder", "()Lcom/xiaomi/fitness/detail/video/share/holder/TabLayoutHolder;", "setTabLayoutHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/TabLayoutHolder;)V", "Lcom/xiaomi/fitness/detail/video/share/holder/ShareVideoHolder;", "shareVideoHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/ShareVideoHolder;", "getShareVideoHolder", "()Lcom/xiaomi/fitness/detail/video/share/holder/ShareVideoHolder;", "setShareVideoHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/ShareVideoHolder;)V", "vm", "Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;", "getVm", "()Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;", "setVm", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;)V", "binding", "Lhqp;", "getBinding", "()Lhqp;", "setBinding", "isShowChangeItemA", "Z", "setShowChangeItemA", "isShowChangeItemB", "setShowChangeItemB", "isShowEditDialog", "setShowEditDialog", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "preRealIndex", "getPreRealIndex", "()I", "setPreRealIndex", "(I)V", "colorNextIndex", "getColorNextIndex", "setColorNextIndex", "lastColor", "getLastColor", "setLastColor", "isPlaying", "setPlaying", "isInterrupt", "setInterrupt", "isScreenRecord", "setScreenRecord", "screenResultCode", "getScreenResultCode", "setScreenResultCode", "screenData", "Landroid/content/Intent;", "getScreenData", "()Landroid/content/Intent;", "setScreenData", "(Landroid/content/Intent;)V", "isChangeBearing", "isPreTraceLoad", "rotateIndex", "getRotateIndex", "setRotateIndex", "Landroid/animation/ValueAnimator;", "distanceChangeAnimator", "Landroid/animation/ValueAnimator;", "getDistanceChangeAnimator", "()Landroid/animation/ValueAnimator;", "setDistanceChangeAnimator", "(Landroid/animation/ValueAnimator;)V", "Lcom/amap/api/maps/model/Marker;", "curMarker", "Lcom/amap/api/maps/model/Marker;", "getCurMarker", "()Lcom/amap/api/maps/model/Marker;", "setCurMarker", "(Lcom/amap/api/maps/model/Marker;)V", "isShowMaxRateMarker", "setShowMaxRateMarker", "isShowMaxHeightMarker", "setShowMaxHeightMarker", "isShowMaxPaceMarker", "setShowMaxPaceMarker", "isShowMaxSpeedMarker", "setShowMaxSpeedMarker", "curImgTextBeanIndex", "getCurImgTextBeanIndex", "setCurImgTextBeanIndex", "curKilo", "getCurKilo", "setCurKilo", "", "preLongitude", "D", "preLatitude", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSharePathVideoAmapActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharePathVideoAmapActivity.kt\ncom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,994:1\n53#2:995\n55#2:999\n53#2:1000\n55#2:1004\n50#3:996\n55#3:998\n50#3:1001\n55#3:1003\n107#4:997\n107#4:1002\n*S KotlinDebug\n*F\n+ 1 SharePathVideoAmapActivity.kt\ncom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity\n*L\n171#1:995\n171#1:999\n177#1:1000\n177#1:1004\n171#1:996\n171#1:998\n177#1:1001\n177#1:1003\n171#1:997\n177#1:1002\n*E\n"})
public final class SharePathVideoAmapActivity extends BaseBindingActivity<SharePathVideoViewModel, hqp> {

    @NotNull
    public static final String TAG = "SharePathVideoAmapActivity";
    public AMap aMap;
    public hqp binding;
    private int colorNextIndex;
    private int curImgTextBeanIndex;
    private int curKilo;

    @Nullable
    private Marker curMarker;
    public ValueAnimator distanceChangeAnimator;
    public EditDetailPanelHolder editDetailPanelHolder;
    private boolean isChangeBearing;
    private boolean isInterrupt;
    private boolean isPlaying;
    private boolean isPreTraceLoad;
    private boolean isScreenRecord;
    private boolean isShowEditDialog;
    private int lastColor;

    @Nullable
    private Handler mHandler;

    @Nullable
    private MovingPointOverlay moveMarker;
    private double preLatitude;
    private double preLongitude;
    private int preRealIndex;
    private int rotateIndex;

    @Nullable
    private Intent screenData;

    @Nullable
    private ScreenRecordHelper screenRecordHelper;
    private int screenResultCode;
    public ShareVideoHolder shareVideoHolder;
    private ShowPicCarouselAdapter showPicCarouselAdapter;
    private int showPicCounter;

    @Nullable
    private CountDownTimer showPicTimer;
    private ShowSportTracePicAndFeelingsFragment showPictureDialogFragment;
    public SwitchMapPanelHolder switchMapPanelHolder;
    public SwitchMusicPanelHolder switchMusicPanelHolder;
    public TabLayoutHolder tabLayoutHolder;

    @Nullable
    private ViewPager2 viewPager;
    public SharePathVideoViewModel vm;
    private boolean isShowChangeItemA = true;
    private boolean isShowChangeItemB = true;
    private boolean isShowMaxRateMarker = true;
    private boolean isShowMaxHeightMarker = true;
    private boolean isShowMaxPaceMarker = true;
    private boolean isShowMaxSpeedMarker = true;

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$2", f = "SharePathVideoAmapActivity.kt", i = {0, 0}, l = {168, 169}, m = "invokeSuspend", n = {"$this$flow", "musicFilePath"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = SharePathVideoAmapActivity.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x008b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String selectMusic;
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                if (!SharePathVideoAmapActivity.this.getIsInterrupt()) {
                    selectMusic = SharePathVideoAmapActivity.this.getSwitchMusicPanelHolder().getTraceStyleHolder().getSelectMusic();
                    FitnessLogUtils.i(SharePathVideoAmapActivity.TAG, "beginTrace music file path:" + selectMusic);
                    MapPathExtKt.changeTilt(SharePathVideoAmapActivity.this.getAMap());
                    SharePathVideoAmapActivity.access$getMBinding(SharePathVideoAmapActivity.this).L.hideEditLayout();
                    this.L$0 = flowCollector2;
                    this.L$1 = selectMusic;
                    this.label = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowCollector = flowCollector2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    if (flowCollector.emit(selectMusic, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                selectMusic = (String) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (flowCollector.emit(selectMusic, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass5<T> implements FlowCollector {
        public AnonymousClass5() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((String) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object emit(String str, Continuation<? super Unit> continuation) throws IOException {
            SharePathVideoAmapActivity$beginTrace$5$emit$1 sharePathVideoAmapActivity$beginTrace$5$emit$1;
            AnonymousClass5<T> anonymousClass5;
            if (continuation instanceof SharePathVideoAmapActivity$beginTrace$5$emit$1) {
                sharePathVideoAmapActivity$beginTrace$5$emit$1 = (SharePathVideoAmapActivity$beginTrace$5$emit$1) continuation;
                int i = sharePathVideoAmapActivity$beginTrace$5$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    sharePathVideoAmapActivity$beginTrace$5$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    sharePathVideoAmapActivity$beginTrace$5$emit$1 = new SharePathVideoAmapActivity$beginTrace$5$emit$1(this, continuation);
                }
            } else {
                sharePathVideoAmapActivity$beginTrace$5$emit$1 = new SharePathVideoAmapActivity$beginTrace$5$emit$1(this, continuation);
            }
            Object obj = sharePathVideoAmapActivity$beginTrace$5$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = sharePathVideoAmapActivity$beginTrace$5$emit$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!SharePathVideoAmapActivity.this.getIsInterrupt()) {
                    SharePathVideoAmapActivity.access$getMBinding(SharePathVideoAmapActivity.this).L.startClearDistanceAnim(500L);
                    SharePathVideoAmapActivity.access$getMBinding(SharePathVideoAmapActivity.this).L.translateOut();
                    if (SharePathVideoAmapActivity.this.getIsScreenRecord()) {
                        SharePathVideoAmapActivity sharePathVideoAmapActivity = SharePathVideoAmapActivity.this;
                        sharePathVideoAmapActivity.screenRecord(sharePathVideoAmapActivity.getScreenResultCode(), SharePathVideoAmapActivity.this.getScreenData(), str);
                    }
                    sharePathVideoAmapActivity$beginTrace$5$emit$1.L$0 = this;
                    sharePathVideoAmapActivity$beginTrace$5$emit$1.label = 1;
                    if (DelayKt.delay(1000L, sharePathVideoAmapActivity$beginTrace$5$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    anonymousClass5 = this;
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass5 = (AnonymousClass5) sharePathVideoAmapActivity$beginTrace$5$emit$1.L$0;
            ResultKt.throwOnFailure(obj);
            SharePathVideoAmapActivity.startMove$default(SharePathVideoAmapActivity.this, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$initTrace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$initTrace$1", f = "SharePathVideoAmapActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C29221(Continuation<? super C29221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharePathVideoAmapActivity.this.new C29221(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MapPathExtKt.buildVisibleBounds(SharePathVideoAmapActivity.this.getAMap(), SharePathVideoAmapActivity.access$getMViewModel(SharePathVideoAmapActivity.this).getMOriginalList());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$onActivityResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$onActivityResult$1", f = "SharePathVideoAmapActivity.kt", i = {}, l = {722}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C29231(Continuation<? super C29231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharePathVideoAmapActivity.this.new C29231(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharePathVideoAmapActivity sharePathVideoAmapActivity = SharePathVideoAmapActivity.this;
                this.label = 1;
                if (sharePathVideoAmapActivity.beginTrace(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$setEditOrEditBtnCallback$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/xiaomi/fitness/share/amap/SharePathVideoAmapActivity$setEditOrEditBtnCallback$1", "Lcom/xiaomi/fitness/share/view/SportTraceDataView$OnEditBtnClickListener;", "onEditBtnClick", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C29241 implements SportTraceDataView.OnEditBtnClickListener {
        public C29241() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onEditBtnClick$lambda$0(SharePathVideoAmapActivity this$0, TraceStyleResModel traceStyleResModel) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNull(traceStyleResModel);
            SharePathViewAmapActivityExtKt.setEditBasicTrace(this$0, traceStyleResModel);
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.share.view.SportTraceDataView.OnEditBtnClickListener
        public void onEditBtnClick() {
            ConstraintLayout editPanel = SharePathVideoAmapActivity.access$getMBinding(SharePathVideoAmapActivity.this).B;
            Intrinsics.checkNotNullExpressionValue(editPanel, "editPanel");
            ViewExtKt.visible(editPanel);
            SportTraceDataView sportTrackDataView = SharePathVideoAmapActivity.access$getMBinding(SharePathVideoAmapActivity.this).L;
            Intrinsics.checkNotNullExpressionValue(sportTrackDataView, "sportTrackDataView");
            ViewExtKt.gone(sportTrackDataView);
            MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData = SharePathVideoAmapActivity.access$getMViewModel(SharePathVideoAmapActivity.this).getTraceStyleResModeLiveData();
            final SharePathVideoAmapActivity sharePathVideoAmapActivity = SharePathVideoAmapActivity.this;
            traceStyleResModeLiveData.observe(sharePathVideoAmapActivity, new SharePathVideoAmapActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e7m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SharePathVideoAmapActivity.C29241.onEditBtnClick$lambda$0(sharePathVideoAmapActivity, (TraceStyleResModel) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$setStartOrEndMarketAnimation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$setStartOrEndMarketAnimation$1", f = "SharePathVideoAmapActivity.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $code;
        int label;
        final /* synthetic */ SharePathVideoAmapActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29251(int i, SharePathVideoAmapActivity sharePathVideoAmapActivity, Continuation<? super C29251> continuation) {
            super(2, continuation);
            this.$code = i;
            this.this$0 = sharePathVideoAmapActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29251(this.$code, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(1050L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.$code == 2) {
                SharePathViewAmapActivityExtKt.backChangeTilt(this.this$0);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$startTrace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$startTrace$1", f = "SharePathVideoAmapActivity.kt", i = {}, l = {764}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C29271(Continuation<? super C29271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharePathVideoAmapActivity.this.new C29271(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharePathVideoAmapActivity sharePathVideoAmapActivity = SharePathVideoAmapActivity.this;
                this.label = 1;
                if (sharePathVideoAmapActivity.beginTrace(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final /* synthetic */ hqp access$getMBinding(SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        return sharePathVideoAmapActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SharePathVideoViewModel access$getMViewModel(SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        return (SharePathVideoViewModel) sharePathVideoAmapActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object beginTrace(Continuation<? super Unit> continuation) {
        final TraceStyleResModel value = ((SharePathVideoViewModel) getMViewModel()).getTraceStyleResModeLiveData().getValue();
        if (value != null && !((SharePathVideoViewModel) getMViewModel()).getMOriginalList().isEmpty()) {
            clearPassPolyline();
            this.isPlaying = true;
            this.isInterrupt = false;
            FitnessLogUtils.i(TAG, "beginTrace");
            final Flow flow = FlowKt.flow(new AnonymousClass2(null));
            final Flow<String> flow2 = new Flow<String>() { // from class: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$$inlined$map$1

                /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$$inlined$map$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SharePathVideoAmapActivity.kt\ncom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity\n*L\n1#1,222:1\n54#2:223\n172#3,5:224\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ SharePathVideoAmapActivity this$0;

                    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$$inlined$map$1$2", f = "SharePathVideoAmapActivity.kt", i = {0}, l = {226, SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {"it"}, s = {"L$1"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, SharePathVideoAmapActivity sharePathVideoAmapActivity) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = sharePathVideoAmapActivity;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        FlowCollector flowCollector;
                        String str;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                str = (String) anonymousClass1.L$1;
                                flowCollector = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj2);
                        flowCollector = this.$this_unsafeFlow;
                        str = (String) obj;
                        if (!this.this$0.getIsInterrupt() && this.this$0.getAMap().getCameraPosition().zoom < MapTraceData.INSTANCE.getMapZoom()) {
                            MapPathExtKt.zoom(this.this$0.getAMap());
                            anonymousClass1.L$0 = flowCollector;
                            anonymousClass1.L$1 = str;
                            anonymousClass1.label = 1;
                            if (DelayKt.delay(1000L, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 2;
                        if (flowCollector.emit(str, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector<? super String> flowCollector, @NotNull Continuation continuation2) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation2);
                    return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Object objCollect = new Flow<String>() { // from class: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$$inlined$map$2

                /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$$inlined$map$2$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SharePathVideoAmapActivity.kt\ncom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity\n*L\n1#1,222:1\n54#2:223\n178#3,17:224\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ TraceStyleResModel $traceStyleResModel$inlined;
                    final /* synthetic */ SharePathVideoAmapActivity this$0;

                    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$$inlined$map$2$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$beginTrace$$inlined$map$2$2", f = "SharePathVideoAmapActivity.kt", i = {0}, l = {238, SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {"it"}, s = {"L$1"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, SharePathVideoAmapActivity sharePathVideoAmapActivity, TraceStyleResModel traceStyleResModel) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = sharePathVideoAmapActivity;
                        this.$traceStyleResModel$inlined = traceStyleResModel;
                    }

                    /* JADX WARN: Code duplicated, block: B:28:0x00ea A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        FlowCollector flowCollector;
                        String str;
                        FlowCollector flowCollector2;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                str = (String) anonymousClass1.L$1;
                                flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj2);
                        flowCollector = this.$this_unsafeFlow;
                        str = (String) obj;
                        if (!this.this$0.getIsInterrupt()) {
                            if (this.this$0.getAMap().getCameraPosition().zoom < 18.0f) {
                                AMap aMap = this.this$0.getAMap();
                                LatLng latLng = SharePathVideoAmapActivity.access$getMViewModel(this.this$0).getMOriginalList().get(0);
                                Intrinsics.checkNotNullExpressionValue(latLng, "get(...)");
                                MapPathExtKt.goStartPoint(aMap, latLng);
                            }
                            this.this$0.getAMap().clear();
                            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.this$0.getResources(), this.$traceStyleResModel$inlined.getStartIcon());
                            SharePathVideoAmapActivity sharePathVideoAmapActivity = this.this$0;
                            LatLng latLng2 = SharePathVideoAmapActivity.access$getMViewModel(sharePathVideoAmapActivity).getMOriginalList().get(0);
                            Intrinsics.checkNotNullExpressionValue(latLng2, "get(...)");
                            Intrinsics.checkNotNull(bitmapDecodeResource);
                            SharePathVideoAmapActivity.setStartOrEndMarketAnimation$default(sharePathVideoAmapActivity, latLng2, bitmapDecodeResource, 1, false, 8, null);
                            this.this$0.getBinding().E.reset();
                            anonymousClass1.L$0 = flowCollector;
                            anonymousClass1.L$1 = str;
                            anonymousClass1.label = 1;
                            if (DelayKt.delay(1000L, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            flowCollector2 = flowCollector;
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 2;
                        if (flowCollector.emit(str, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                        flowCollector = flowCollector2;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 2;
                        if (flowCollector.emit(str, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector<? super String> flowCollector, @NotNull Continuation continuation2) {
                    Object objCollect2 = flow2.collect(new AnonymousClass2(flowCollector, this, value), continuation2);
                    return objCollect2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
                }
            }.collect(new AnonymousClass5(), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$0(SharePathVideoAmapActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.setVisibility(8);
        if (((SharePathVideoViewModel) this$0.getMViewModel()).getMOriginalList().size() > 0) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new SharePathVideoAmapActivity$bindView$1$1(this$0, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(SharePathVideoAmapActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().G.setVisibility(8);
        DataTitleShareVideo titleBarShareVideo = this$0.getBinding().P;
        Intrinsics.checkNotNullExpressionValue(titleBarShareVideo, "titleBarShareVideo");
        ViewExtKt.invisible(titleBarShareVideo);
        bhl.q(this$0).D(this$0, this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(SharePathVideoAmapActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (SharePathViewAmapActivityExtKt.isHasEdit(this$0)) {
            this$0.showEditDialog();
        } else {
            this$0.finish();
        }
    }

    private final void clearPassPolyline() {
        getAMap().removeOnPolylineClickListener(new AMap.OnPolylineClickListener() { // from class: c7m
            @Override // com.amap.api.maps.AMap.OnPolylineClickListener
            public final void onPolylineClick(Polyline polyline) {
                SharePathVideoAmapActivity.clearPassPolyline$lambda$7(polyline);
            }
        });
        getAMap().clear();
        this.preLongitude = 0.0d;
        this.preLatitude = 0.0d;
        this.curKilo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearPassPolyline$lambda$7(Polyline polyline) {
        if (polyline != null) {
            polyline.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawColorLine(int realIndex, Location curLocation, int colorInterval, ArrayList<Location> mUniformOriginalList) {
        if (((SharePathVideoViewModel) getMViewModel()).getMUniformOriginalColorList().isEmpty()) {
            return;
        }
        if (realIndex >= this.colorNextIndex) {
            List<Integer> arrayList = new ArrayList<>();
            arrayList.add(((SharePathVideoViewModel) getMViewModel()).getMUniformOriginalColorList().get(this.preRealIndex));
            arrayList.add(((SharePathVideoViewModel) getMViewModel()).getMUniformOriginalColorList().get(realIndex));
            FitnessLogUtils.d("SharePathVideoAmapActivity2", "colorIndex:" + this.preRealIndex + " , colorInterval = " + colorInterval + ",  color = " + ((SharePathVideoViewModel) getMViewModel()).getMUniformOriginalColorList().get(this.preRealIndex) + "realIndex:" + realIndex + " , lastIndex:" + this.colorNextIndex);
            this.preRealIndex = realIndex;
            drawLines(AMapPathUtils.INSTANCE.createLatLng(curLocation), arrayList);
            this.colorNextIndex = realIndex + colorInterval;
            this.lastColor = mUniformOriginalList.size() - this.colorNextIndex < colorInterval ? ((SharePathVideoViewModel) getMViewModel()).getMUniformOriginalColorList().get(realIndex).intValue() : 0;
        }
        if (this.lastColor != 0) {
            List<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(Integer.valueOf(this.lastColor));
            arrayList2.add(Integer.valueOf(this.lastColor));
            drawLines(AMapPathUtils.INSTANCE.createLatLng(curLocation), arrayList2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void drawLines(LatLng latLng, List<Integer> colorList) {
        if (latLng == null) {
            return;
        }
        TraceStyleResModel value = ((SharePathVideoViewModel) getMViewModel()).getTraceStyleResModeLiveData().getValue();
        double d = this.preLatitude;
        if (d != 0.0d && d != 0.0d) {
            PolylineOptions polylineOptions = new PolylineOptions();
            polylineOptions.add(new LatLng(this.preLatitude, this.preLongitude));
            polylineOptions.add(latLng);
            polylineOptions.width(MapTraceData.INSTANCE.getMapTraceWidth()).zIndex(1.0f).useGradient(true).lineCapType(PolylineOptions.LineCapType.LineCapRound);
            if (value == null || !value.getIsDefault()) {
                Integer numValueOf = value != null ? Integer.valueOf(value.getTraceColor()) : null;
                Intrinsics.checkNotNull(numValueOf);
                polylineOptions.color(ni4.c(this, numValueOf.intValue()));
            } else {
                polylineOptions.colorValues(colorList);
            }
            getAMap().addPolyline(polylineOptions);
        }
        this.preLongitude = latLng.longitude;
        this.preLatitude = latLng.latitude;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void endTrace(boolean isPre, TraceStyleResModel traceStyleResModel) {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(128);
        }
        this.isPlaying = false;
        this.isScreenRecord = false;
        if (isPre) {
            ImageView play = getBinding().F;
            Intrinsics.checkNotNullExpressionValue(play, "play");
            ViewExtKt.gone(play);
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), traceStyleResModel.getEndIcon());
        LatLng latLng = ((SharePathVideoViewModel) getMViewModel()).getMOriginalList().get(((SharePathVideoViewModel) getMViewModel()).getMOriginalList().size() - 1);
        Intrinsics.checkNotNullExpressionValue(latLng, "get(...)");
        Intrinsics.checkNotNull(bitmapDecodeResource);
        setStartOrEndMarketAnimation(latLng, bitmapDecodeResource, 2, isPre);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getSportRecordData() {
        ((SharePathVideoViewModel) getMViewModel()).createDataList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initEditDetailPanel() {
        FitnessLogUtils.d(TAG, "initEditDetailPanel");
        pqp editDetailView = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(editDetailView, "editDetailView");
        SharePathVideoViewModel sharePathVideoViewModel = (SharePathVideoViewModel) getMViewModel();
        MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData = ((SharePathVideoViewModel) getMViewModel()).getTraceDataMapLiveData();
        Intrinsics.checkNotNull(traceDataMapLiveData);
        setEditDetailPanelHolder(new EditDetailPanelHolder(this, editDetailView, sharePathVideoViewModel, traceDataMapLiveData, ((SharePathVideoViewModel) getMViewModel()).getCurtProgressLiveData(), ((SharePathVideoViewModel) getMViewModel()).getTraceStyleResModeLiveData()));
        getEditDetailPanelHolder().initHolder();
        setTimelineDragCallback();
    }

    private final void initMoveMarker(ArrayList<LatLng> list) {
        Bitmap bitmapFromDrawable = getBitmapFromDrawable(getResources().getDrawable(hoi.n1));
        AMap aMap = getAMap();
        MarkerOptions markerOptionsAnchor = new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(bitmapFromDrawable)).anchor(0.5f, 0.5f);
        Intrinsics.checkNotNullExpressionValue(markerOptionsAnchor, "anchor(...)");
        Marker markerAddMarkerWithZIndex = MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsAnchor);
        AMap aMap2 = getAMap();
        Intrinsics.checkNotNull(markerAddMarkerWithZIndex);
        MovingPointOverlay movingPointOverlay = new MovingPointOverlay(aMap2, markerAddMarkerWithZIndex);
        this.moveMarker = movingPointOverlay;
        Intrinsics.checkNotNull(movingPointOverlay);
        movingPointOverlay.setPoints(list);
        MovingPointOverlay movingPointOverlay2 = this.moveMarker;
        Intrinsics.checkNotNull(movingPointOverlay2);
        movingPointOverlay2.setTotalDuration(15);
    }

    private final void initMoveMarker2(ArrayList<LatLng> list) {
        AMap aMap = getAMap();
        MarkerOptions markerOptionsAnchor = new MarkerOptions().anchor(0.5f, 0.5f);
        Intrinsics.checkNotNullExpressionValue(markerOptionsAnchor, "anchor(...)");
        Marker markerAddMarkerWithZIndex = MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsAnchor);
        AMap aMap2 = getAMap();
        Intrinsics.checkNotNull(markerAddMarkerWithZIndex);
        MovingPointOverlay movingPointOverlay = new MovingPointOverlay(aMap2, markerAddMarkerWithZIndex);
        this.moveMarker = movingPointOverlay;
        Intrinsics.checkNotNull(movingPointOverlay);
        movingPointOverlay.setPoints(list);
        MovingPointOverlay movingPointOverlay2 = this.moveMarker;
        Intrinsics.checkNotNull(movingPointOverlay2);
        movingPointOverlay2.setTotalDuration(15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initMusicPanel() {
        hqp mBinding = getMBinding();
        MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData = ((SharePathVideoViewModel) getMViewModel()).getTraceDataMapLiveData();
        Intrinsics.checkNotNull(traceDataMapLiveData);
        setSwitchMusicPanelHolder(new SwitchMusicPanelHolder(this, mBinding, traceDataMapLiveData, ((SharePathVideoViewModel) getMViewModel()).getCurtProgressLiveData(), ((SharePathVideoViewModel) getMViewModel()).getTraceStyleResModeLiveData()));
        getSwitchMusicPanelHolder().initHolder();
        getSwitchMusicPanelHolder().setOnTraceStyleItemClickCallback(new Function1() { // from class: u6m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SharePathVideoAmapActivity.initMusicPanel$lambda$12(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initMusicPanel$lambda$12(int i) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initShareVideoHolder() {
        setShareVideoHolder(new ShareVideoHolder(this, getMBinding(), ((SharePathVideoViewModel) getMViewModel()).getRecordedVideoUriLiveData(), ((SharePathVideoViewModel) getMViewModel()).getMBasicReport()));
        getShareVideoHolder().initHolder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSwitchMapPanel() {
        hqp mBinding = getMBinding();
        MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData = ((SharePathVideoViewModel) getMViewModel()).getTraceDataMapLiveData();
        Intrinsics.checkNotNull(traceDataMapLiveData);
        setSwitchMapPanelHolder(new SwitchMapPanelHolder(this, mBinding, traceDataMapLiveData, ((SharePathVideoViewModel) getMViewModel()).getCurtProgressLiveData(), ((SharePathVideoViewModel) getMViewModel()).getTraceStyleResModeLiveData()));
        getSwitchMapPanelHolder().initHolder();
        getSwitchMapPanelHolder().setOnTraceStyleItemClickCallback(new Function1() { // from class: x6m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SharePathVideoAmapActivity.initSwitchMapPanel$lambda$11(this.f38760a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initSwitchMapPanel$lambda$11(SharePathVideoAmapActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "initSwitchMapPanel setMapStyleHolderItemClickListener");
        Float value = ((SharePathVideoViewModel) this$0.getMViewModel()).getCurtProgressLiveData().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        SharePathViewAmapActivityExtKt.drawLinesWithProgressBar(this$0, value.floatValue() / 100, TraceStyleResUtilExtKt.getTraceStyleModel(i));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTabLayout() {
        setTabLayoutHolder(new TabLayoutHolder(this, getMBinding(), (SharePathVideoViewModel) getMViewModel(), getEditDetailPanelHolder()));
        getTabLayoutHolder().initHolder(getSwitchMusicPanelHolder());
        getTabLayoutHolder().setOnEditDetailSaveBtnCallback(new Function0() { // from class: r6m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SharePathVideoAmapActivity.initTabLayout$lambda$13(this.f32248a);
            }
        });
        getTabLayoutHolder().setOnCancelBtnClickCallback(new Function0() { // from class: v6m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SharePathVideoAmapActivity.initTabLayout$lambda$14(this.f36565a);
            }
        });
        TimelineViewHolder timelineHolder = getEditDetailPanelHolder().getTimelineHolder();
        TraceStyleResModel value = getVm().getTraceStyleResModeLiveData().getValue();
        timelineHolder.setDefaultProgressBarType(value != null ? value.getIsDefault() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initTabLayout$lambda$13(SharePathVideoAmapActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData = ((SharePathVideoViewModel) this$0.getMViewModel()).getTraceDataMapLiveData();
        Intrinsics.checkNotNull(traceDataMapLiveData);
        SportTracePointDataModel tracePointDataModelByProgressValue = SportTraceVideoShareUtilKt.getTracePointDataModelByProgressValue(traceDataMapLiveData, ((SharePathVideoViewModel) this$0.getMViewModel()).getCurtProgressLiveData());
        if (tracePointDataModelByProgressValue != null) {
            SharePathViewAmapActivityExtKt.addPicMarker(this$0, tracePointDataModelByProgressValue, ((SharePathVideoViewModel) this$0.getMViewModel()).getCurtProgressLiveData().getValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTabLayout$lambda$14(SharePathVideoAmapActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTabLayoutHolder().closeEditSection();
        return Unit.INSTANCE;
    }

    private final void initTrace() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C29221(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(SharePathVideoAmapActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showPreTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$8(SharePathVideoAmapActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            SportTraceDataView sportTraceDataView = this$0.getMBinding().L;
            int sportDataType = ((SharePathVideoViewModel) this$0.getMViewModel()).getSportDataType();
            SportBasicReport mBasicReport = ((SharePathVideoViewModel) this$0.getMViewModel()).getMBasicReport();
            Intrinsics.checkNotNull(mBasicReport);
            sportTraceDataView.bindSportDetailInfo(sportDataType, mBasicReport, ((SharePathVideoViewModel) this$0.getMViewModel()).getMDetailList());
            this$0.getEditDetailPanelHolder().setLineColor(((SharePathVideoViewModel) this$0.getMViewModel()).getMUniformOriginalColorList());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$9(SharePathVideoAmapActivity this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showProfileInfo(accountCoreInfo);
        this$0.getSportRecordData();
        this$0.initTrace();
        return ((SharePathVideoViewModel) this$0.getMViewModel()).getTraceStyleResModeLiveData().getValue() == null ? Unit.INSTANCE : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(26)
    public final void screenRecord(int resultCode, Intent data, String musicPath) {
        Intent intent = new Intent(this, (Class<?>) ScreenRecorderService.class);
        intent.putExtra("code", resultCode);
        intent.putExtra("data", data);
        intent.putExtra(DownloadMusicUtil.appUpgradeDirectory, musicPath);
        startForegroundService(intent);
        FitnessLogUtils.i(TAG, "Sport ScreenRecorder start service!");
    }

    private final void setEditOrEditBtnCallback() {
        getMBinding().L.setOnEditBtnClickListener(new C29241());
    }

    private final void setStartOrEndMarketAnimation(LatLng latlng, Bitmap bitmap, int code, boolean isPre) {
        MarkerOptions markerOptionsIcon = new MarkerOptions().position(latlng).icon(BitmapDescriptorFactory.fromBitmap(bitmap));
        AMap aMap = getAMap();
        Intrinsics.checkNotNull(markerOptionsIcon);
        Marker markerAddMarkerWithZIndex = MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsIcon);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f);
        scaleAnimation.setDuration(1000L);
        scaleAnimation.setInterpolator(new LinearInterpolator());
        if (markerAddMarkerWithZIndex != null) {
            markerAddMarkerWithZIndex.setAnimation(scaleAnimation);
        }
        if (markerAddMarkerWithZIndex != null) {
            markerAddMarkerWithZIndex.startAnimation();
        }
        if (isPre) {
            reset();
        } else {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C29251(code, this, null), 3, null);
        }
    }

    public static /* synthetic */ void setStartOrEndMarketAnimation$default(SharePathVideoAmapActivity sharePathVideoAmapActivity, LatLng latLng, Bitmap bitmap, int i, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        sharePathVideoAmapActivity.setStartOrEndMarketAnimation(latLng, bitmap, i, z);
    }

    private final void setTimelineDragCallback() {
        getEditDetailPanelHolder().setOnTimelineDragCallback(new Function1() { // from class: y6m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SharePathVideoAmapActivity.setTimelineDragCallback$lambda$15(this.f39865a, ((Float) obj).floatValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setTimelineDragCallback$lambda$15(SharePathVideoAmapActivity this$0, float f) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.d(TAG, "setDragListener progressValue=" + f + " setDragListener");
        if (this$0.isShowEditDialog) {
            TraceStyleResModel value = ((SharePathVideoViewModel) this$0.getMViewModel()).getTraceStyleResModeLiveData().getValue();
            Intrinsics.checkNotNull(value);
            SharePathViewAmapActivityExtKt.drawLinesWithProgressBar(this$0, f / 100, value);
        }
        return Unit.INSTANCE;
    }

    private final void showEditDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("statusChange").setDialogTitle(j1j.U5).setDialogDescription(j1j.T5).setCancelable(false).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).setPositiveText(j1j.c).setNegativeText(j1j.f22329b).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity.showEditDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    SharePathVideoAmapActivity.this.finish();
                }
                if (which == -2) {
                    SharePathVideoAmapActivity.this.dismissDialog();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPreTrace() {
        TraceStyleResModel value = ((SharePathVideoViewModel) getMViewModel()).getTraceStyleResModeLiveData().getValue();
        if (value == null) {
            return;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), value.getStartIcon());
        LatLng latLng = ((SharePathVideoViewModel) getMViewModel()).getMOriginalList().get(0);
        Intrinsics.checkNotNullExpressionValue(latLng, "get(...)");
        Intrinsics.checkNotNull(bitmapDecodeResource);
        setStartOrEndMarketAnimation$default(this, latLng, bitmapDecodeResource, 1, false, 8, null);
        int size = ((SharePathVideoViewModel) getMViewModel()).getMUniformOriginalList().size() / ((SharePathVideoViewModel) getMViewModel()).getMOriginalList().size();
        Iterator<T> it = ((SharePathVideoViewModel) getMViewModel()).getMUniformOriginalList().iterator();
        int i = 0;
        while (it.hasNext()) {
            drawColorLine(i, (Location) it.next(), size, ((SharePathVideoViewModel) getMViewModel()).getMUniformOriginalList());
            i++;
        }
        this.preRealIndex = 0;
        this.colorNextIndex = 0;
        this.lastColor = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showProfileInfo(AccountCoreInfo account) {
        SportBasicReport mBasicReport = ((SharePathVideoViewModel) getMViewModel()).getMBasicReport();
        getMBinding().H.bindData(account, TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(mBasicReport != null ? mBasicReport.getStartTime() : 0L, false, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startMove(final boolean isPre) throws IOException {
        setDistanceChangeAnimator(ValueAnimator.ofInt(1, ((SharePathVideoViewModel) getMViewModel()).getMUniformOriginalList().size()));
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        if (!isPre) {
            getMBinding().L.startSport(((SharePathVideoViewModel) getMViewModel()).getMTraceDuration());
        }
        getDistanceChangeAnimator().setDuration(isPre ? 1L : ((SharePathVideoViewModel) getMViewModel()).getMTraceDuration());
        getDistanceChangeAnimator().setInterpolator(new LinearInterpolator());
        getSwitchMusicPanelHolder().playMusic(true, getDistanceChangeAnimator().getDuration() + ((long) SharePathViewAmapActivityExtKt.calculateImgTextDuration(this)));
        final Ref.IntRef intRef = new Ref.IntRef();
        FitnessLogUtils.i(TAG, "path start move value size:" + getDistanceChangeAnimator().getValues().length + ",duration:" + getDistanceChangeAnimator().getDuration());
        getDistanceChangeAnimator().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: w6m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SharePathVideoAmapActivity.startMove$lambda$5(this.f37667a, isPre, intRef, valueAnimator);
            }
        });
        getDistanceChangeAnimator().start();
    }

    public static /* synthetic */ void startMove$default(SharePathVideoAmapActivity sharePathVideoAmapActivity, boolean z, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = false;
        }
        sharePathVideoAmapActivity.startMove(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void startMove$lambda$5(SharePathVideoAmapActivity this$0, boolean z, Ref.IntRef lastIndex, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lastIndex, "$lastIndex");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        ArrayList<Location> mUniformOriginalList = ((SharePathVideoViewModel) this$0.getMViewModel()).getMUniformOriginalList();
        int i = iIntValue == mUniformOriginalList.size() ? iIntValue - 1 : iIntValue;
        Location location = mUniformOriginalList.get(i);
        Intrinsics.checkNotNullExpressionValue(location, "get(...)");
        Location location2 = location;
        Object animatedValue2 = animation.getAnimatedValue();
        AMapPathUtils aMapPathUtils = AMapPathUtils.INSTANCE;
        Logger.i(TAG, "addUpdateListener animator index:" + animatedValue2 + ",cur latlng:" + aMapPathUtils.createLatLng(location2).latitude + "," + aMapPathUtils.createLatLng(location2).longitude);
        int size = ((SharePathVideoViewModel) this$0.getMViewModel()).getMUniformOriginalColorList().isEmpty() ? 0 : ((SharePathVideoViewModel) this$0.getMViewModel()).getMUniformOriginalList().size() / ((SharePathVideoViewModel) this$0.getMViewModel()).getMUniformOriginalColorList().size();
        if (!z) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new SharePathVideoAmapActivity$startMove$1$1(this$0, location2, z, i, size, mUniformOriginalList, iIntValue, null), 3, null);
            lastIndex.element = iIntValue;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new SharePathVideoAmapActivity$startMove$1$2(null), 3, null);
    }

    private final void stopScreenRecord() {
        if (bhl.q(this).n) {
            ToastUtil.showShortToast(getResources().getString(j1j.d6));
            bhl.q(this).H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void autoPlayPicCarousel(float progressValue) {
        MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData = ((SharePathVideoViewModel) getMViewModel()).getTraceDataMapLiveData();
        Intrinsics.checkNotNull(traceDataMapLiveData);
        Map<Float, SportTracePointDataModel> value = traceDataMapLiveData.getValue();
        ShowSportTracePicAndFeelingsFragment showSportTracePicAndFeelingsFragment = null;
        SportTracePointDataModel sportTracePointDataModel = value != null ? value.get(Float.valueOf(progressValue)) : null;
        List<Uri> imgUriList = sportTracePointDataModel != null ? sportTracePointDataModel.getImgUriList() : null;
        String feelings = sportTracePointDataModel != null ? sportTracePointDataModel.getFeelings() : null;
        List<Uri> list = imgUriList;
        if (list == null || list.isEmpty()) {
            return;
        }
        sha shaVarA0 = sha.A0(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(shaVarA0, "inflate(...)");
        this.viewPager = shaVarA0.B;
        if (feelings != null && !StringsKt__StringsKt.isBlank(feelings)) {
            shaVarA0.A.setText(getString(j1j.S1, sportTracePointDataModel.getFeelings()));
        }
        ShowPicCarouselAdapter showPicCarouselAdapter = this.showPicCarouselAdapter;
        if (showPicCarouselAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showPicCarouselAdapter");
            showPicCarouselAdapter = null;
        }
        showPicCarouselAdapter.updateData(imgUriList);
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            ShowPicCarouselAdapter showPicCarouselAdapter2 = this.showPicCarouselAdapter;
            if (showPicCarouselAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("showPicCarouselAdapter");
                showPicCarouselAdapter2 = null;
            }
            viewPager2.setAdapter(showPicCarouselAdapter2);
        }
        ViewPager2 viewPager3 = this.viewPager;
        if (viewPager3 != null) {
            viewPager3.setOffscreenPageLimit(3);
        }
        ViewPager2 viewPager4 = this.viewPager;
        if (viewPager4 != null) {
            viewPager4.setClipChildren(true);
        }
        ShowSportTracePicAndFeelingsFragment.Builder height = new ShowSportTracePicAndFeelingsFragment.Builder().setWidth(ExtUtilsKt.getDp(290)).setHeight(ExtUtilsKt.getDp(Integer.valueOf((feelings == null || StringsKt__StringsKt.isBlank(feelings)) ? 388 : FileUtils.S_IRWXU)));
        View root = shaVarA0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ShowSportTracePicAndFeelingsFragment showSportTracePicAndFeelingsFragmentCreate = height.setView(root).create();
        this.showPictureDialogFragment = showSportTracePicAndFeelingsFragmentCreate;
        if (showSportTracePicAndFeelingsFragmentCreate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showPictureDialogFragment");
        } else {
            showSportTracePicAndFeelingsFragment = showSportTracePicAndFeelingsFragmentCreate;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        showSportTracePicAndFeelingsFragment.show(supportFragmentManager);
        CountDownTimer countDownTimer = new CountDownTimer(((long) imgUriList.size()) * 1000) { // from class: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity.autoPlayPicCarousel.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                ShowSportTracePicAndFeelingsFragment showSportTracePicAndFeelingsFragment2 = SharePathVideoAmapActivity.this.showPictureDialogFragment;
                if (showSportTracePicAndFeelingsFragment2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("showPictureDialogFragment");
                    showSportTracePicAndFeelingsFragment2 = null;
                }
                showSportTracePicAndFeelingsFragment2.dismiss();
                SharePathVideoAmapActivity.this.showPicCounter = 0;
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                ViewPager2 viewPager5 = SharePathVideoAmapActivity.this.viewPager;
                if (viewPager5 != null) {
                    int i = SharePathVideoAmapActivity.this.showPicCounter;
                    SharePathVideoAmapActivity.this.showPicCounter = i + 1;
                    viewPager5.k(i, true);
                }
            }
        };
        this.showPicTimer = countDownTimer;
        countDownTimer.start();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull hqp hqpVar) {
        Intrinsics.checkNotNullParameter(hqpVar, "<this>");
        hqpVar.G.setOnClickListener(new View.OnClickListener() { // from class: z6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SharePathVideoAmapActivity.bindView$lambda$0(this.f40955a, view);
            }
        });
        hqpVar.L.getBinding().F.setOnClickListener(new View.OnClickListener() { // from class: a7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SharePathVideoAmapActivity.bindView$lambda$1(this.f726a, view);
            }
        });
        hqpVar.P.f12882a.setOnClickListener(new View.OnClickListener() { // from class: b7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SharePathVideoAmapActivity.bindView$lambda$2(this.f3896a, view);
            }
        });
        setAMap(hqpVar.D.getMap());
        getAMap().setMapType(2);
    }

    public final void endRecordTrace() {
    }

    @NotNull
    public final AMap getAMap() {
        AMap aMap = this.aMap;
        if (aMap != null) {
            return aMap;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aMap");
        return null;
    }

    @NotNull
    public final hqp getBinding() {
        hqp hqpVar = this.binding;
        if (hqpVar != null) {
            return hqpVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Nullable
    public final Bitmap getBitmapFromDrawable(@Nullable Drawable sourceDrawable) {
        if (sourceDrawable == null) {
            return null;
        }
        if (sourceDrawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) sourceDrawable).getBitmap();
        }
        Drawable.ConstantState constantState = sourceDrawable.getConstantState();
        if (constantState == null) {
            return null;
        }
        Drawable drawableMutate = constantState.newDrawable().mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableMutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableMutate.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final int getColorNextIndex() {
        return this.colorNextIndex;
    }

    public final int getCurImgTextBeanIndex() {
        return this.curImgTextBeanIndex;
    }

    public final int getCurKilo() {
        return this.curKilo;
    }

    @Nullable
    public final Marker getCurMarker() {
        return this.curMarker;
    }

    @NotNull
    public final ValueAnimator getDistanceChangeAnimator() {
        ValueAnimator valueAnimator = this.distanceChangeAnimator;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("distanceChangeAnimator");
        return null;
    }

    @NotNull
    public final EditDetailPanelHolder getEditDetailPanelHolder() {
        EditDetailPanelHolder editDetailPanelHolder = this.editDetailPanelHolder;
        if (editDetailPanelHolder != null) {
            return editDetailPanelHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editDetailPanelHolder");
        return null;
    }

    public final int getLastColor() {
        return this.lastColor;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ivi.k2;
    }

    @Nullable
    public final Handler getMHandler() {
        return this.mHandler;
    }

    @Nullable
    public final MovingPointOverlay getMoveMarker() {
        return this.moveMarker;
    }

    public final int getPreRealIndex() {
        return this.preRealIndex;
    }

    public final int getRotateIndex() {
        return this.rotateIndex;
    }

    @Nullable
    public final Intent getScreenData() {
        return this.screenData;
    }

    @Nullable
    public final ScreenRecordHelper getScreenRecordHelper() {
        return this.screenRecordHelper;
    }

    public final int getScreenResultCode() {
        return this.screenResultCode;
    }

    @NotNull
    public final ShareVideoHolder getShareVideoHolder() {
        ShareVideoHolder shareVideoHolder = this.shareVideoHolder;
        if (shareVideoHolder != null) {
            return shareVideoHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shareVideoHolder");
        return null;
    }

    @NotNull
    public final SwitchMapPanelHolder getSwitchMapPanelHolder() {
        SwitchMapPanelHolder switchMapPanelHolder = this.switchMapPanelHolder;
        if (switchMapPanelHolder != null) {
            return switchMapPanelHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("switchMapPanelHolder");
        return null;
    }

    @NotNull
    public final SwitchMusicPanelHolder getSwitchMusicPanelHolder() {
        SwitchMusicPanelHolder switchMusicPanelHolder = this.switchMusicPanelHolder;
        if (switchMusicPanelHolder != null) {
            return switchMusicPanelHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("switchMusicPanelHolder");
        return null;
    }

    @NotNull
    public final TabLayoutHolder getTabLayoutHolder() {
        TabLayoutHolder tabLayoutHolder = this.tabLayoutHolder;
        if (tabLayoutHolder != null) {
            return tabLayoutHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tabLayoutHolder");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @NotNull
    public final SharePathVideoViewModel getVm() {
        SharePathVideoViewModel sharePathVideoViewModel = this.vm;
        if (sharePathVideoViewModel != null) {
            return sharePathVideoViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vm");
        return null;
    }

    /* JADX INFO: renamed from: isInterrupt, reason: from getter */
    public final boolean getIsInterrupt() {
        return this.isInterrupt;
    }

    public boolean isInvalid() {
        return isFinishing() || isDestroyed();
    }

    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: isScreenRecord, reason: from getter */
    public final boolean getIsScreenRecord() {
        return this.isScreenRecord;
    }

    /* JADX INFO: renamed from: isShowChangeItemA, reason: from getter */
    public final boolean getIsShowChangeItemA() {
        return this.isShowChangeItemA;
    }

    /* JADX INFO: renamed from: isShowChangeItemB, reason: from getter */
    public final boolean getIsShowChangeItemB() {
        return this.isShowChangeItemB;
    }

    /* JADX INFO: renamed from: isShowEditDialog, reason: from getter */
    public final boolean getIsShowEditDialog() {
        return this.isShowEditDialog;
    }

    /* JADX INFO: renamed from: isShowMaxHeightMarker, reason: from getter */
    public final boolean getIsShowMaxHeightMarker() {
        return this.isShowMaxHeightMarker;
    }

    /* JADX INFO: renamed from: isShowMaxPaceMarker, reason: from getter */
    public final boolean getIsShowMaxPaceMarker() {
        return this.isShowMaxPaceMarker;
    }

    /* JADX INFO: renamed from: isShowMaxRateMarker, reason: from getter */
    public final boolean getIsShowMaxRateMarker() {
        return this.isShowMaxRateMarker;
    }

    /* JADX INFO: renamed from: isShowMaxSpeedMarker, reason: from getter */
    public final boolean getIsShowMaxSpeedMarker() {
        return this.isShowMaxSpeedMarker;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (data != null) {
                this.isScreenRecord = true;
                this.screenResultCode = resultCode;
                this.screenData = data;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C29231(null), 3, null);
                Logger.d(TAG, "Sport ScreenRecorder start service!");
            } else {
                ConstraintLayout editPanel = getMBinding().B;
                Intrinsics.checkNotNullExpressionValue(editPanel, "editPanel");
                if (!ExtUtilsKt.isVisible(editPanel)) {
                    getBinding().G.setVisibility(0);
                }
            }
        }
        if (requestCode == 1 && data == null) {
            bhl.q(this).n = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        getSwitchMusicPanelHolder().stopMusic();
        if (!this.isPlaying) {
            if (SharePathViewAmapActivityExtKt.isHasEdit(this)) {
                showEditDialog();
                return;
            } else {
                finish();
                return;
            }
        }
        try {
            getDistanceChangeAnimator().cancel();
        } catch (Exception unused) {
        }
        this.isInterrupt = true;
        getAMap().clear();
        stopScreenRecord();
        clearPassPolyline();
        TraceStyleResModel value = ((SharePathVideoViewModel) getMViewModel()).getTraceStyleResModeLiveData().getValue();
        Intrinsics.checkNotNull(value);
        endTrace(true, value);
        SharePathViewAmapActivityExtKt.backChangeTilt(this);
        showPreTrace();
        getBinding().L.stopAllAnim();
        SportTraceDataView sportTraceDataView = getMBinding().L;
        int sportDataType = ((SharePathVideoViewModel) getMViewModel()).getSportDataType();
        SportBasicReport mBasicReport = ((SharePathVideoViewModel) getMViewModel()).getMBasicReport();
        Intrinsics.checkNotNull(mBasicReport);
        sportTraceDataView.bindSportDetailInfo(sportDataType, mBasicReport, ((SharePathVideoViewModel) getMViewModel()).getMDetailList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBinding(getMBinding());
        setVm((SharePathVideoViewModel) getMViewModel());
        this.mHandler = new Handler(Looper.getMainLooper());
        MapPathExtKt.configMap(getAMap());
        setActionBarDisplayable(false);
        getMBinding().D.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        UIUtils.INSTANCE.setNavigationBarColor(this, dki.h);
        ((SharePathVideoViewModel) getMViewModel()).initBundleParams(getIntent().getExtras());
        getMBinding().getRoot().postDelayed(new Runnable() { // from class: d7m
            @Override // java.lang.Runnable
            public final void run() {
                SharePathVideoAmapActivity.onCreate$lambda$8(this.f15193a);
            }
        }, 500L);
        ((SharePathVideoViewModel) getMViewModel()).getUserInfo(new Function1() { // from class: s6m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SharePathVideoAmapActivity.onCreate$lambda$9(this.f33352a, (AccountCoreInfo) obj);
            }
        });
        ((SharePathVideoViewModel) getMViewModel()).isTrackDataLoad().observe(this, new SharePathVideoAmapActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: t6m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SharePathVideoAmapActivity.onCreate$lambda$10(this.f34378a, (Boolean) obj);
            }
        }));
        if (this.screenRecordHelper == null) {
            this.screenRecordHelper = new ScreenRecordHelper(this, new ScreenRecordHelper.OnVideoRecordListener() { // from class: com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity.onCreate.4
                @Override // com.nanchen.screenrecordhelper.ScreenRecordHelper.OnVideoRecordListener
                public void onBeforeRecord() {
                }

                @Override // com.nanchen.screenrecordhelper.ScreenRecordHelper.OnVideoRecordListener
                public void onCancelRecord() {
                }

                @Override // com.nanchen.screenrecordhelper.ScreenRecordHelper.OnVideoRecordListener
                public void onEndRecord() {
                    FitnessLogUtils.i(SharePathVideoAmapActivity.TAG, "ScreenRecordHelper onEndRecord running");
                }

                @Override // com.nanchen.screenrecordhelper.ScreenRecordHelper.OnVideoRecordListener
                public void onStartRecord() {
                }
            }, null, null, 12, null);
        }
        initEditDetailPanel();
        initSwitchMapPanel();
        initMusicPanel();
        initTabLayout();
        setEditOrEditBtnCallback();
        initShareVideoHolder();
        this.showPicCarouselAdapter = new ShowPicCarouselAdapter();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getMBinding().D.onDestroy();
        getMBinding().L.stopAllAnim();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CountDownTimer countDownTimer = this.showPicTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.showPicTimer = null;
        ImgTextData.INSTANCE.clear();
        stopScreenRecord();
        getTabLayoutHolder().setOnEditDetailSaveBtnCallback(null);
        getTabLayoutHolder().setOnCancelBtnClickCallback(null);
        getEditDetailPanelHolder().setOnTimelineDragCallback(null);
        bhl.q(this).x();
        reset();
        this.viewPager = null;
        getSwitchMusicPanelHolder().stopMusic();
        getSwitchMusicPanelHolder().reset();
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(128);
        }
        if (this.isPlaying) {
            try {
                getDistanceChangeAnimator().cancel();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getMBinding().D.onPause();
        Logger.d(TAG, "aMap curtStyleId=" + getAMap().getCurrentStyle());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getMBinding().D.onResume();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        getMBinding().D.onSaveInstanceState(outState);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getSwitchMusicPanelHolder().stopMusic();
    }

    public final void postDelay(@Nullable Runnable runnable, long delayMillis) {
        Handler handler = this.mHandler;
        Intrinsics.checkNotNull(handler);
        Intrinsics.checkNotNull(runnable);
        handler.postDelayed(runnable, delayMillis);
    }

    public final void reset() {
        this.isScreenRecord = false;
        this.isShowChangeItemA = true;
        this.isShowChangeItemB = true;
        this.isShowMaxRateMarker = true;
        this.isShowMaxHeightMarker = true;
        this.isShowMaxPaceMarker = true;
        this.isShowMaxSpeedMarker = true;
        SharePathViewAmapActivityExtKt.setMaxPaceInFirst(true);
        ImgTextData.INSTANCE.reset();
        this.curImgTextBeanIndex = 0;
        this.curKilo = 0;
        this.preLongitude = 0.0d;
        this.preLatitude = 0.0d;
        this.preRealIndex = 0;
        this.colorNextIndex = 0;
        this.lastColor = 0;
        this.rotateIndex = 0;
    }

    public final void setAMap(@NotNull AMap aMap) {
        Intrinsics.checkNotNullParameter(aMap, "<set-?>");
        this.aMap = aMap;
    }

    public final void setBinding(@NotNull hqp hqpVar) {
        Intrinsics.checkNotNullParameter(hqpVar, "<set-?>");
        this.binding = hqpVar;
    }

    public final void setColorNextIndex(int i) {
        this.colorNextIndex = i;
    }

    public final void setCurImgTextBeanIndex(int i) {
        this.curImgTextBeanIndex = i;
    }

    public final void setCurKilo(int i) {
        this.curKilo = i;
    }

    public final void setCurMarker(@Nullable Marker marker) {
        this.curMarker = marker;
    }

    public final void setDistanceChangeAnimator(@NotNull ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "<set-?>");
        this.distanceChangeAnimator = valueAnimator;
    }

    public final void setEditDetailPanelHolder(@NotNull EditDetailPanelHolder editDetailPanelHolder) {
        Intrinsics.checkNotNullParameter(editDetailPanelHolder, "<set-?>");
        this.editDetailPanelHolder = editDetailPanelHolder;
    }

    public final void setInterrupt(boolean z) {
        this.isInterrupt = z;
    }

    public final void setLastColor(int i) {
        this.lastColor = i;
    }

    public final void setMHandler(@Nullable Handler handler) {
        this.mHandler = handler;
    }

    public final void setMoveMarker(@Nullable MovingPointOverlay movingPointOverlay) {
        this.moveMarker = movingPointOverlay;
    }

    public final void setPlaying(boolean z) {
        this.isPlaying = z;
    }

    public final void setPreRealIndex(int i) {
        this.preRealIndex = i;
    }

    public final void setRotateIndex(int i) {
        this.rotateIndex = i;
    }

    public final void setScreenData(@Nullable Intent intent) {
        this.screenData = intent;
    }

    public final void setScreenRecord(boolean z) {
        this.isScreenRecord = z;
    }

    public final void setScreenRecordHelper(@Nullable ScreenRecordHelper screenRecordHelper) {
        this.screenRecordHelper = screenRecordHelper;
    }

    public final void setScreenResultCode(int i) {
        this.screenResultCode = i;
    }

    public final void setShareVideoHolder(@NotNull ShareVideoHolder shareVideoHolder) {
        Intrinsics.checkNotNullParameter(shareVideoHolder, "<set-?>");
        this.shareVideoHolder = shareVideoHolder;
    }

    public final void setShowChangeItemA(boolean z) {
        this.isShowChangeItemA = z;
    }

    public final void setShowChangeItemB(boolean z) {
        this.isShowChangeItemB = z;
    }

    public final void setShowEditDialog(boolean z) {
        this.isShowEditDialog = z;
    }

    public final void setShowMaxHeightMarker(boolean z) {
        this.isShowMaxHeightMarker = z;
    }

    public final void setShowMaxPaceMarker(boolean z) {
        this.isShowMaxPaceMarker = z;
    }

    public final void setShowMaxRateMarker(boolean z) {
        this.isShowMaxRateMarker = z;
    }

    public final void setShowMaxSpeedMarker(boolean z) {
        this.isShowMaxSpeedMarker = z;
    }

    public final void setSwitchMapPanelHolder(@NotNull SwitchMapPanelHolder switchMapPanelHolder) {
        Intrinsics.checkNotNullParameter(switchMapPanelHolder, "<set-?>");
        this.switchMapPanelHolder = switchMapPanelHolder;
    }

    public final void setSwitchMusicPanelHolder(@NotNull SwitchMusicPanelHolder switchMusicPanelHolder) {
        Intrinsics.checkNotNullParameter(switchMusicPanelHolder, "<set-?>");
        this.switchMusicPanelHolder = switchMusicPanelHolder;
    }

    public final void setTabLayoutHolder(@NotNull TabLayoutHolder tabLayoutHolder) {
        Intrinsics.checkNotNullParameter(tabLayoutHolder, "<set-?>");
        this.tabLayoutHolder = tabLayoutHolder;
    }

    public final void setVm(@NotNull SharePathVideoViewModel sharePathVideoViewModel) {
        Intrinsics.checkNotNullParameter(sharePathVideoViewModel, "<set-?>");
        this.vm = sharePathVideoViewModel;
    }

    public final void showStatusActionBar() {
    }

    public final void showWXShare() {
        ToastUtil.showShortToast(j1j.M);
    }

    public final void startTrace() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C29271(null), 3, null);
    }
}
