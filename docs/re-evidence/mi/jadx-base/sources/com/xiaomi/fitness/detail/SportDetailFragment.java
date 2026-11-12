package com.xiaomi.fitness.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mi.health.course.export.data.CourseInfoItem;
import com.mi.health.course.export.data.CourseItem;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.mi.health.map.data.GpsValues;
import com.mi.health.map.data.sportmodel.share.IShareMapLongView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.RouteReportData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportBasicReportKt;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItemKt;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongList;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.data.DivingOutInPosition;
import com.xiaomi.fit.fitness.parser.data.DivingPosition;
import com.xiaomi.fit.fitness.parser.data.OneDivingIdReport;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.SportDetailFragment;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.inner.SportDetailJustDanceDataFragmentKt;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseData;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseInfo;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseTrainSummary;
import com.xiaomi.fitness.detail.recycler.JustDanceCoverEntity;
import com.xiaomi.fitness.detail.recycler.OnItemTouchListener;
import com.xiaomi.fitness.detail.recycler.SportDetailCoverViewPagerAdapter;
import com.xiaomi.fitness.detail.view.MapScrollView;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.request.SportHttpRequest;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity;
import com.xiaomi.fitness.share.report.SportReportShareActivity;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.track.ExportTrackActivity;
import com.xiaomi.fitness.track.ExportTrackActivityKt;
import com.xiaomi.fitness.track.TrackDataHolder;
import com.xiaomi.fitness.util.BitMapUtils;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import defpackage.a4i;
import defpackage.av6;
import defpackage.bsi;
import defpackage.byi;
import defpackage.dki;
import defpackage.im9;
import defpackage.j1j;
import defpackage.lp5;
import defpackage.o5o;
import defpackage.qwi;
import defpackage.tjg;
import defpackage.x44;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 ì\u00012\u00020\u00012\u00020\u0002:\u0002ì\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JQ\u0010\u0094\u0001\u001a\u00030\u0095\u00012E\u0010\u0096\u0001\u001a@\u0012\u0019\u0012\u0017\u0018\u00010\u0098\u0001¢\u0006\u000f\b\u0099\u0001\u0012\n\b\u009a\u0001\u0012\u0005\b\b(\u009b\u0001\u0012\u0019\u0012\u0017\u0018\u00010\u0080\u0001¢\u0006\u000f\b\u0099\u0001\u0012\n\b\u009a\u0001\u0012\u0005\b\b(\u009c\u0001\u0012\u0005\u0012\u00030\u0095\u00010\u0097\u0001H\u0016J\b\u0010\u009d\u0001\u001a\u00030\u0095\u0001J\u0016\u0010\u009e\u0001\u001a\u00030\u0095\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001H\u0016J\u001f\u0010¡\u0001\u001a\u00030\u0095\u00012\u0007\u0010¢\u0001\u001a\u00020E2\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001H\u0016J\n\u0010¤\u0001\u001a\u00030\u0095\u0001H\u0016J\u0016\u0010¨\u0001\u001a\u00030\u0095\u00012\n\u0010©\u0001\u001a\u0005\u0018\u00010 \u0001H\u0002J\u0016\u0010ª\u0001\u001a\u00030\u0095\u00012\n\u0010©\u0001\u001a\u0005\u0018\u00010 \u0001H\u0016J\n\u0010±\u0001\u001a\u00030\u0095\u0001H\u0004J\u0014\u0010²\u0001\u001a\u00030\u0095\u00012\b\u0010\u009a\u0001\u001a\u00030\u0088\u0001H\u0014J\u001e\u0010³\u0001\u001a\u00030\u0095\u00012\u0007\u0010¢\u0001\u001a\u00020E2\t\b\u0002\u0010´\u0001\u001a\u00020]H\u0002J\u0016\u0010µ\u0001\u001a\u00030\u0095\u00012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0002J\n\u0010¶\u0001\u001a\u00030\u0095\u0001H\u0002J&\u0010·\u0001\u001a\u00030\u0095\u00012\u0007\u0010¸\u0001\u001a\u00020]2\b\u0010¹\u0001\u001a\u00030º\u00012\u0007\u0010»\u0001\u001a\u00020uH\u0002J\u0007\u0010¼\u0001\u001a\u00020uJ\u0019\u0010½\u0001\u001a\u00030\u0095\u00012\t\u0010¾\u0001\u001a\u0004\u0018\u00010u¢\u0006\u0003\u0010¿\u0001J\n\u0010À\u0001\u001a\u00030\u0095\u0001H\u0002J\n\u0010Á\u0001\u001a\u00030\u0095\u0001H\u0004J\n\u0010Â\u0001\u001a\u00030\u0095\u0001H\u0002JQ\u0010Ã\u0001\u001a\u00030\u0095\u00012E\u0010\u0096\u0001\u001a@\u0012\u0019\u0012\u0017\u0018\u00010\u0098\u0001¢\u0006\u000f\b\u0099\u0001\u0012\n\b\u009a\u0001\u0012\u0005\b\b(\u009b\u0001\u0012\u0019\u0012\u0017\u0018\u00010\u0080\u0001¢\u0006\u000f\b\u0099\u0001\u0012\n\b\u009a\u0001\u0012\u0005\b\b(\u009c\u0001\u0012\u0005\u0012\u00030\u0095\u00010\u0097\u0001H\u0016J\u0015\u0010Ä\u0001\u001a\u00030\u0095\u00012\t\u0010Å\u0001\u001a\u0004\u0018\u00010iH\u0002J\u0015\u0010Æ\u0001\u001a\u00030\u0095\u00012\t\u0010Å\u0001\u001a\u0004\u0018\u00010iH\u0002J\t\u0010Ç\u0001\u001a\u00020uH\u0002J\u0013\u0010È\u0001\u001a\u00030\u0095\u00012\u0007\u0010Å\u0001\u001a\u00020iH\u0002J\u0014\u0010É\u0001\u001a\u00030\u0080\u00012\b\u0010Ê\u0001\u001a\u00030Ë\u0001H\u0002J\u001d\u0010Ì\u0001\u001a\u00030\u0088\u00012\b\u0010Í\u0001\u001a\u00030\u0088\u00012\u0007\u0010Î\u0001\u001a\u00020cH\u0002J\u001c\u0010Ï\u0001\u001a\u00030\u0095\u00012\u0007\u0010Ð\u0001\u001a\u00020]2\u0007\u0010Å\u0001\u001a\u00020iH\u0002J%\u0010Ñ\u0001\u001a\u0017\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ó\u00010¯\u0001\u0012\u0004\u0012\u00020u0Ò\u0001H\u0082@¢\u0006\u0003\u0010Ô\u0001J\u0013\u0010Õ\u0001\u001a\u00030\u0095\u00012\u0007\u0010Å\u0001\u001a\u00020iH\u0002J\n\u0010Ö\u0001\u001a\u00030\u0095\u0001H$J\u0013\u0010×\u0001\u001a\u00030\u0095\u00012\u0007\u0010¢\u0001\u001a\u00020EH\u0002J\t\u0010Ø\u0001\u001a\u00020uH\u0002J\u0007\u0010Ù\u0001\u001a\u00020uJ\u0013\u0010Ú\u0001\u001a\u00030\u0095\u00012\u0007\u0010Û\u0001\u001a\u00020uH\u0016J\n\u0010Ü\u0001\u001a\u00030\u0095\u0001H\u0014J\n\u0010Þ\u0001\u001a\u00030\u0095\u0001H\u0014J\n\u0010ß\u0001\u001a\u00030\u0095\u0001H\u0016J\u001b\u0010ç\u0001\u001a\u00030\u0095\u00012\u000f\u0010è\u0001\u001a\n\u0012\u0005\u0012\u00030é\u00010¯\u0001H\u0002J\n\u0010ê\u0001\u001a\u00030\u0095\u0001H\u0002J\n\u0010ë\u0001\u001a\u00030\u0095\u0001H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020\u0012X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R\u001a\u0010,\u001a\u00020\u0012X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001a\u0010/\u001a\u00020\u0012X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016R\u001a\u00102\u001a\u000203X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000209X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020EX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020KX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020QX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020WX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u00020]X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010b\u001a\u00020cX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001c\u0010h\u001a\u0004\u0018\u00010iX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001c\u0010n\u001a\u0004\u0018\u00010oX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010t\u001a\u00020uX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010v\"\u0004\bw\u0010xR\u001c\u0010y\u001a\u0004\u0018\u00010zX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u0011\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0081\u0001\u001a\u00020uX\u0084\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010v\"\u0005\b\u0083\u0001\u0010xR\u0019\u0010\u0084\u0001\u001a\f\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010\u0085\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0087\u0001\u001a\u00030\u0088\u0001X\u0084\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\"\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u000f\u0010\u0093\u0001\u001a\u00020uX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010£\u0001\u001a\u00020uX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010¥\u0001\u001a\u00030\u0095\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u000f\u0010«\u0001\u001a\u00020cX\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010¬\u0001\u001a\u0018\u0012\u0005\u0012\u00030®\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030°\u00010¯\u00010\u00ad\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010Ý\u0001\u001a\u00020cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010à\u0001\u001a\n\u0012\u0005\u0012\u00030â\u00010á\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010ã\u0001\u001a\u00030ä\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010å\u0001\u001a\u00030æ\u0001X\u0082.¢\u0006\u0002\n\u0000¨\u0006í\u0001"}, d2 = {"Lcom/xiaomi/fitness/detail/SportDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lcom/mi/health/map/data/sportmodel/share/IShareMapLongView;", "<init>", "()V", "shareBottomView", "Lcom/xiaomi/fitness/detail/view/SportShareBottomView;", "getShareBottomView", "()Lcom/xiaomi/fitness/detail/view/SportShareBottomView;", "setShareBottomView", "(Lcom/xiaomi/fitness/detail/view/SportShareBottomView;)V", "basicInfoView", "Lcom/xiaomi/fitness/detail/view/SportRecordBasicInfoView;", "getBasicInfoView", "()Lcom/xiaomi/fitness/detail/view/SportRecordBasicInfoView;", "setBasicInfoView", "(Lcom/xiaomi/fitness/detail/view/SportRecordBasicInfoView;)V", "imgLocation", "Landroid/widget/ImageView;", "getImgLocation", "()Landroid/widget/ImageView;", "setImgLocation", "(Landroid/widget/ImageView;)V", "imgMapDialog", "getImgMapDialog", "setImgMapDialog", "sportPathView", "Lcom/mi/health/data/sportmodel/view/SportPathMapView;", "getSportPathView", "()Lcom/mi/health/data/sportmodel/view/SportPathMapView;", "setSportPathView", "(Lcom/mi/health/data/sportmodel/view/SportPathMapView;)V", "imgSportTrace", "Landroid/widget/LinearLayout;", "getImgSportTrace", "()Landroid/widget/LinearLayout;", "setImgSportTrace", "(Landroid/widget/LinearLayout;)V", "recordDetailContent", "getRecordDetailContent", "setRecordDetailContent", "imgBack", "getImgBack", "setImgBack", "imgShare", "getImgShare", "setImgShare", "imgDelete", "getImgDelete", "setImgDelete", "sportTitle", "Landroid/widget/TextView;", "getSportTitle", "()Landroid/widget/TextView;", "setSportTitle", "(Landroid/widget/TextView;)V", "mapScrollView", "Lcom/xiaomi/fitness/detail/view/MapScrollView;", "getMapScrollView", "()Lcom/xiaomi/fitness/detail/view/MapScrollView;", "setMapScrollView", "(Lcom/xiaomi/fitness/detail/view/MapScrollView;)V", "outContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getOutContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setOutContainer", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "marginView", "Landroid/view/View;", "getMarginView", "()Landroid/view/View;", "setMarginView", "(Landroid/view/View;)V", "reportAllRootView", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getReportAllRootView", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "setReportAllRootView", "(Landroidx/appcompat/widget/LinearLayoutCompat;)V", "sportShareLongView", "Lcom/xiaomi/fitness/detail/view/SportShareLongView;", "getSportShareLongView", "()Lcom/xiaomi/fitness/detail/view/SportShareLongView;", "setSportShareLongView", "(Lcom/xiaomi/fitness/detail/view/SportShareLongView;)V", "justDanceViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getJustDanceViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setJustDanceViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "sportDataType", "", "getSportDataType", "()I", "setSportDataType", "(I)V", SportConstants.KEY_TIMESTAMP, "", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getMBasicReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setMBasicReport", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "mGpsValues", "Lcom/mi/health/map/data/GpsValues;", "getMGpsValues", "()Lcom/mi/health/map/data/GpsValues;", "setMGpsValues", "(Lcom/mi/health/map/data/GpsValues;)V", "isGpsPathValid", "", "()Z", "setGpsPathValid", "(Z)V", "detailViewModel", "Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "getDetailViewModel", "()Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "setDetailViewModel", "(Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;)V", "qrBitmap", "Landroid/graphics/Bitmap;", "showFeedback", "getShowFeedback", "setShowFeedback", "feedBackDialog", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/DialogFragment;", "gotoSource", "", "getGotoSource", "()Ljava/lang/String;", "setGotoSource", "(Ljava/lang/String;)V", "routeData", "Lcom/xiaomi/fit/data/common/data/sport/RouteReportData;", "getRouteData", "()Lcom/xiaomi/fit/data/common/data/sport/RouteReportData;", "setRouteData", "(Lcom/xiaomi/fit/data/common/data/sport/RouteReportData;)V", "needShowTrainingPlanCourseInfo", "createShareBitmap", "", "callback", "Lkotlin/Function2;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "longPicUri", "longPicBitmap", "intentToShareVideo", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "isBindBasicInfo", LifecycleConstantKt.ON_START, "qrCodeBitMap", "getQrCodeBitMap", "()Lkotlin/Unit;", "initParamsFromBundle", SdkContants.KEY_BUNDLE, "onNewIntent", "courseId", "mRecordDetailMap", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "initView", "onTitleDecided", "setTopPadding", "top", "goToSportReportShareActivity", "initTitleBar", "addScrollChangeListener", "scrollHeight", "fractionTransform", "", "isGpsDetail", "supportSportTraceSelect", "setMarginViewHeight", "isGpsEnable", "(Ljava/lang/Boolean;)V", "changeRangeInReportMargin", "setRecordDetailContentBgBitmap", "setRecordDetailContentBg", "generateLongShareBitmapIfNeed", "showDeleteConfirmDialog", "report", "doExportTrack", "doExportHasGps", "chooseExportTrack", "buildBitmap", "recorder", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "getExportTrackNameForServer", "sportName", "startTime", "doExport", "choiceIndex", "getTrack", "Lkotlin/Pair;", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumpTpExportTrack", "resetUIDisplay", "showPopupMenu", "shouldShowExportTrackMenuItem", "supportGpsSport", "setStatueTextWhite", "isBlack", "onInvisible", "mFragmentVisibleTime", "onVisible", LifecycleConstantKt.ON_DESTROY, "justDanceCoverEntityList", "", "Lcom/xiaomi/fitness/detail/recycler/JustDanceCoverEntity;", "handler", "Landroid/os/Handler;", "autoPlayRunnable", "Ljava/lang/Runnable;", "initJustDanceViewPager", "justDaceList", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "postAutoPlayRunnable", "removeAutoPlayRunnable", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailFragment.kt\ncom/xiaomi/fitness/detail/SportDetailFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,1093:1\n1863#2,2:1094\n17#3:1096\n*S KotlinDebug\n*F\n+ 1 SportDetailFragment.kt\ncom/xiaomi/fitness/detail/SportDetailFragment\n*L\n1039#1:1094,2\n1073#1:1096\n*E\n"})
public abstract class SportDetailFragment extends BaseFragment implements IShareMapLongView {

    @NotNull
    public static final String PAGE_TYPE = "page_type";

    @NotNull
    public static final String TAG = "SportDetailFragment";
    private Runnable autoPlayRunnable;
    protected SportRecordBasicInfoView basicInfoView;
    private long courseId;

    @Nullable
    private SportRecordDetailViewModel detailViewModel;

    @Nullable
    private WeakReference<DialogFragment> feedBackDialog;

    @NotNull
    private String gotoSource;

    @NotNull
    private final Handler handler;
    protected ImageView imgBack;
    protected ImageView imgDelete;

    @Nullable
    private ImageView imgLocation;

    @Nullable
    private ImageView imgMapDialog;
    protected ImageView imgShare;

    @Nullable
    private LinearLayout imgSportTrace;
    private boolean isBindBasicInfo;
    private boolean isGpsPathValid;

    @NotNull
    private final List<JustDanceCoverEntity> justDanceCoverEntityList;
    protected ViewPager2 justDanceViewPager;

    @Nullable
    private SportBasicReport mBasicReport;
    private long mFragmentVisibleTime;

    @Nullable
    private GpsValues mGpsValues;

    @NotNull
    private Map<SportRecordKey, List<Object>> mRecordDetailMap;
    protected MapScrollView mapScrollView;
    protected View marginView;
    private boolean needShowTrainingPlanCourseInfo;
    protected ConstraintLayout outContainer;

    @Nullable
    private Bitmap qrBitmap;
    protected LinearLayout recordDetailContent;
    protected LinearLayoutCompat reportAllRootView;

    @Nullable
    private RouteReportData routeData;
    protected SportShareBottomView shareBottomView;
    private boolean showFeedback;
    private int sportDataType;

    @Nullable
    private SportPathMapView sportPathView;
    protected SportShareLongView sportShareLongView;
    protected TextView sportTitle;
    private long timeStamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int contentTopMargin = ExtUtilsKt.getDp(Float.valueOf(40.0f));

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/detail/SportDetailFragment$Companion;", "", "<init>", "()V", "TAG", "", MainTab.PAGE_TYPE, "contentTopMargin", "", "getContentTopMargin", "()I", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getContentTopMargin() {
            return SportDetailFragment.contentTopMargin;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.SportDetailFragment$doExport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailFragment$doExport$1", f = "SportDetailFragment.kt", i = {0, 0, 2}, l = {781, 791, 802, 815}, m = "invokeSuspend", n = {"fileType", "trackName", "filePath"}, s = {"L$0", "L$1", "L$0"})
    public static final class C18601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SportBasicReport $report;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.SportDetailFragment$doExport$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailFragment$doExport$1$1", f = "SportDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            public C03871(Continuation<? super C03871> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03871(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ToastUtil.INSTANCE.showToast(j1j.U0);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18601(SportBasicReport sportBasicReport, Continuation<? super C18601> continuation) {
            super(2, continuation);
            this.$report = sportBasicReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportDetailFragment.this.new C18601(this.$report, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0108  */
        /* JADX WARN: Code duplicated, block: B:38:0x0116  */
        /* JADX WARN: Code duplicated, block: B:40:0x0125 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String exportTrackNameForServer;
            String str;
            String strConvertTrackToFile;
            String str2;
            Recorder recorder;
            SportBasicReport sportBasicReport;
            Bitmap bitmapBuildBitmap;
            SportRecordDetailViewModel detailViewModel;
            Integer distance;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strC = lp5.c(SportDetailFragment.this.getSportDataType());
                if (strC == null) {
                    strC = "";
                }
                exportTrackNameForServer = SportDetailFragment.this.getExportTrackNameForServer(strC, this.$report.getStartTime());
                SportDetailFragment sportDetailFragment = SportDetailFragment.this;
                this.L$0 = ParserHelper.GPX;
                this.L$1 = exportTrackNameForServer;
                this.label = 1;
                obj = sportDetailFragment.getTrack(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = ParserHelper.GPX;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        strConvertTrackToFile = (String) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        str2 = strConvertTrackToFile;
                        recorder = (Recorder) obj;
                        if (recorder != null) {
                            SportDetailFragment sportDetailFragment2 = SportDetailFragment.this;
                            sportBasicReport = this.$report;
                            bitmapBuildBitmap = sportDetailFragment2.buildBitmap(recorder);
                            detailViewModel = sportDetailFragment2.getDetailViewModel();
                            if (detailViewModel != null) {
                                distance = sportBasicReport.getDistance();
                                this.L$0 = null;
                                this.label = 4;
                                if (detailViewModel.uploadTrack(str2, distance, recorder, bitmapBuildBitmap, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                exportTrackNameForServer = (String) this.L$1;
                String str3 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str3;
            }
            List<CommonTrackData> list = (List) ((Pair) obj).getFirst();
            ParserHelper parserHelper = ParserHelper.INSTANCE;
            strConvertTrackToFile = parserHelper.convertTrackToFile(str, exportTrackNameForServer, list, SportDetailFragment.this.getMBasicReport());
            Logger.i("SportDetailFragment", "filePath is :" + strConvertTrackToFile);
            String fileMD5 = MD5Util.getFileMD5(strConvertTrackToFile);
            if (strConvertTrackToFile.length() == 0 || !new File(strConvertTrackToFile).isFile() || fileMD5 == null || fileMD5.length() == 0) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C03871 c03871 = new C03871(null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (BuildersKt.withContext(main, c03871, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            String name = new File(strConvertTrackToFile).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            Pair<String, String> pairSeparateFileNameAndExtension = parserHelper.separateFileNameAndExtension(name);
            String strComponent1 = pairSeparateFileNameAndExtension.component1();
            pairSeparateFileNameAndExtension.component2();
            Logger.i("SportDetailFragment", "fileMD5 is ：" + fileMD5);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            SportDetailFragment$doExport$1$recorder$1 sportDetailFragment$doExport$1$recorder$1 = new SportDetailFragment$doExport$1$recorder$1(strComponent1, strConvertTrackToFile, str, fileMD5, null);
            this.L$0 = strConvertTrackToFile;
            this.L$1 = null;
            this.label = 3;
            obj = BuildersKt.withContext(io2, sportDetailFragment$doExport$1$recorder$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = strConvertTrackToFile;
            recorder = (Recorder) obj;
            if (recorder != null) {
                SportDetailFragment sportDetailFragment3 = SportDetailFragment.this;
                sportBasicReport = this.$report;
                bitmapBuildBitmap = sportDetailFragment3.buildBitmap(recorder);
                detailViewModel = sportDetailFragment3.getDetailViewModel();
                if (detailViewModel != null) {
                    distance = sportBasicReport.getDistance();
                    this.L$0 = null;
                    this.label = 4;
                    if (detailViewModel.uploadTrack(str2, distance, recorder, bitmapBuildBitmap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.SportDetailFragment$getTrack$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailFragment$getTrack$2", f = "SportDetailFragment.kt", i = {}, l = {1094}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSportDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailFragment.kt\ncom/xiaomi/fitness/detail/SportDetailFragment$getTrack$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1093:1\n314#2,9:1094\n323#2,2:1109\n1202#3,2:1103\n1230#3,4:1105\n*S KotlinDebug\n*F\n+ 1 SportDetailFragment.kt\ncom/xiaomi/fitness/detail/SportDetailFragment$getTrack$2\n*L\n838#1:1094,9\n838#1:1109,2\n853#1:1103,2\n853#1:1105,4\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends CommonTrackData>, ? extends Boolean>>, Object> {
        Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportDetailFragment.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends List<? extends CommonTrackData>, ? extends Boolean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Pair<? extends List<CommonTrackData>, Boolean>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CancellableContinuationImpl cancellableContinuationImpl;
            CancellableContinuationImpl cancellableContinuationImpl2;
            Number value;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            SportDetailFragment sportDetailFragment = SportDetailFragment.this;
            this.L$0 = sportDetailFragment;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
            cancellableContinuationImpl3.initCancellability();
            ArrayList arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            List arrayList3 = new ArrayList();
            List list = (List) sportDetailFragment.mRecordDetailMap.get(SportRecordKey.Height);
            if (list != null) {
                arrayList3 = list;
            }
            if (sportDetailFragment.getMGpsValues() != null) {
                GpsValues mGpsValues = sportDetailFragment.getMGpsValues();
                Intrinsics.checkNotNull(mGpsValues);
                arrayList2 = mGpsValues.originalLocationList;
            }
            boolean z = !arrayList2.isEmpty();
            if (z) {
                int i3 = 0;
                if (!arrayList3.isEmpty()) {
                    List list2 = arrayList3;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10)), 16));
                    for (Object obj3 : list2) {
                        linkedHashMap.put(Boxing.boxLong(((SportRecordItem) obj3).getStartTime()), obj3);
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        int i4 = i3 + 1;
                        Location location = (Location) it.next();
                        SportRecordItem sportRecordItem = (SportRecordItem) linkedHashMap.get(Boxing.boxLong(location.startTimeStamp));
                        double dDoubleValue = (sportRecordItem == null || (value = sportRecordItem.getValue()) == null) ? -100000.0d : value.doubleValue();
                        if (i3 < arrayList2.size() - i2) {
                            arrayList.add(new CommonTrackData(location.latitude, location.longitude, dDoubleValue, Boxing.boxLong(location.startTimeStamp * ((long) 1000)), location.flagSegment));
                        } else {
                            arrayList.add(new CommonTrackData(location.latitude, location.longitude, dDoubleValue, Boxing.boxLong(location.timeStamp * ((long) 1000)), false, 16, null));
                        }
                        cancellableContinuationImpl3 = cancellableContinuationImpl3;
                        it = it;
                        i3 = i4;
                        coroutine_suspended = coroutine_suspended;
                        i2 = 1;
                    }
                    obj2 = coroutine_suspended;
                    cancellableContinuationImpl = cancellableContinuationImpl3;
                } else {
                    obj2 = coroutine_suspended;
                    cancellableContinuationImpl = cancellableContinuationImpl3;
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        int i5 = i3 + 1;
                        Location location2 = (Location) it2.next();
                        if (i3 < arrayList2.size() - 1) {
                            arrayList.add(new CommonTrackData(location2.latitude, location2.longitude, 10001.0d, Boxing.boxLong(location2.startTimeStamp * ((long) 1000)), false, 16, null));
                        } else {
                            arrayList.add(new CommonTrackData(location2.latitude, location2.longitude, 10001.0d, Boxing.boxLong(location2.timeStamp * ((long) 1000)), false, 16, null));
                        }
                        it2 = it2;
                        i3 = i5;
                    }
                }
            } else {
                obj2 = coroutine_suspended;
                cancellableContinuationImpl = cancellableContinuationImpl3;
            }
            if (cancellableContinuationImpl.isCancelled() || cancellableContinuationImpl.isCompleted()) {
                cancellableContinuationImpl2 = cancellableContinuationImpl;
            } else {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl2 = cancellableContinuationImpl;
                cancellableContinuationImpl2.resumeWith(Result.m886constructorimpl(new Pair(arrayList, Boxing.boxBoolean(z))));
            }
            Object result = cancellableContinuationImpl2.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            Object obj4 = obj2;
            return result == obj4 ? obj4 : result;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<? extends List<CommonTrackData>, Boolean>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.SportDetailFragment$jumpTpExportTrack$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailFragment$jumpTpExportTrack$1", f = "SportDetailFragment.kt", i = {}, l = {917}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $hasGps;
        final /* synthetic */ String $name;
        final /* synthetic */ SportBasicReport $report;
        final /* synthetic */ Ref.ObjectRef<List<CommonTrackData>> $tracks;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18621(Ref.ObjectRef<List<CommonTrackData>> objectRef, Ref.BooleanRef booleanRef, String str, SportBasicReport sportBasicReport, Continuation<? super C18621> continuation) {
            super(2, continuation);
            this.$tracks = objectRef;
            this.$hasGps = booleanRef;
            this.$name = str;
            this.$report = sportBasicReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportDetailFragment.this.new C18621(this.$tracks, this.$hasGps, this.$name, this.$report, continuation);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportDetailFragment sportDetailFragment = SportDetailFragment.this;
                this.label = 1;
                obj = sportDetailFragment.getTrack(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Pair pair = (Pair) obj;
            this.$tracks.element = pair.getFirst();
            this.$hasGps.element = ((Boolean) pair.getSecond()).booleanValue();
            Intent intent = new Intent(SportDetailFragment.this.requireContext(), (Class<?>) ExportTrackActivity.class);
            TrackDataHolder.INSTANCE.setTracks(new ArrayList<>(this.$tracks.element));
            intent.putExtra(ExportTrackActivityKt.TRACKS_NAME, this.$name);
            intent.putExtra(ExportTrackActivityKt.TRACKS_HAS_GPS, this.$hasGps.element);
            intent.putExtra("sport_report", this.$report);
            SportDetailFragment.this.startActivity(intent);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SportDetailFragment() {
        super(0, 1, null);
        this.gotoSource = "workout_list_page";
        this.mRecordDetailMap = new LinkedHashMap();
        this.justDanceCoverEntityList = new ArrayList();
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final void addScrollChangeListener(final int scrollHeight, final float fractionTransform, final boolean isGpsDetail) {
        final Ref.IntRef intRef = new Ref.IntRef();
        getMapScrollView().setOnScrollChangeListener(new NestedScrollView.d() { // from class: efn
            @Override // androidx.core.widget.NestedScrollView.d
            public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                SportDetailFragment.addScrollChangeListener$lambda$16(intRef, scrollHeight, this, isGpsDetail, fractionTransform, nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    public static final void addScrollChangeListener$lambda$16(Ref.IntRef scrollYTemp, int i, SportDetailFragment this$0, boolean z, float f, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(scrollYTemp, "$scrollYTemp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        scrollYTemp.element = i3;
        if (i3 > i) {
            scrollYTemp.element = i;
        }
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int i8 = UIUtils.isNightMode(contextRequireContext) ? 0 : 255;
        if (z) {
            i6 = i8;
            i7 = i6;
        } else {
            Context contextRequireContext2 = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            if (UIUtils.isNightMode(contextRequireContext2)) {
                i6 = i8;
                i7 = i6;
            } else {
                i7 = 46;
                i6 = 97;
                i8 = 255;
            }
        }
        float f2 = ((scrollYTemp.element * 256) * f) / i;
        int iArgb = Color.argb(MathKt__MathJVMKt.roundToInt(f2), i8, i6, i7);
        this$0.getSportTitle().setBackgroundColor(iArgb);
        this$0.getSportTitle().setAlpha(f2);
        if (f2 >= 240.0f) {
            ImageView imageView = this$0.imgLocation;
            if (imageView != null) {
                imageView.setImageAlpha(0);
            }
            ImageView imageView2 = this$0.imgMapDialog;
            if (imageView2 != null) {
                imageView2.setImageAlpha(0);
            }
            ImageView imageView3 = this$0.imgLocation;
            if (imageView3 != null) {
                ViewExtKt.gone(imageView3);
            }
            ImageView imageView4 = this$0.imgMapDialog;
            if (imageView4 != null) {
                ViewExtKt.gone(imageView4);
            }
        } else {
            GpsValues gpsValues = this$0.mGpsValues;
            if (gpsValues != null && GpsValues.validGpsValue(gpsValues) && this$0.mBasicReport != null) {
                ImageView imageView5 = this$0.imgLocation;
                if (imageView5 != null) {
                    imageView5.setImageAlpha((int) (255 - f2));
                }
                ImageView imageView6 = this$0.imgMapDialog;
                if (imageView6 != null) {
                    imageView6.setImageAlpha((int) (255 - f2));
                }
                ImageView imageView7 = this$0.imgLocation;
                if (imageView7 != null) {
                    ViewExtKt.visible(imageView7);
                }
                ImageView imageView8 = this$0.imgMapDialog;
                if (imageView8 != null) {
                    ViewExtKt.visible(imageView8);
                }
            }
        }
        BaseFragmentExtKt.setStatusBarColor2(this$0, iArgb);
        Context contextRequireContext3 = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
        int i9 = z ? UIUtils.isNightMode(contextRequireContext3) ? 255 : 0 : 255;
        this$0.getSportTitle().setTextColor(Color.argb(MathKt__MathJVMKt.roundToInt(f2), i9, i9, i9));
        Context contextRequireContext4 = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
        int i10 = UIUtils.isNightMode(contextRequireContext4) ? 0 : 250;
        this$0.getOutContainer().setBackgroundColor(Color.argb(MathKt__MathJVMKt.roundToInt(f2), i10, i10, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap buildBitmap(Recorder recorder) {
        return BitMapUtils.INSTANCE.buildBitmap(recorder, this.sportPathView);
    }

    private final void changeRangeInReportMargin() {
    }

    private final void chooseExportTrack(final SportBasicReport report) {
        String[] strArr = {getString(j1j.m), getString(j1j.f22330k)};
        final Ref.IntRef intRef = new Ref.IntRef();
        CommonDialog commonDialogCreate = new CommonDialog.c("export track").setDialogTitle(j1j.o).setPositiveText(j1j.c).setNegativeText(j1j.f22329b).setItems(strArr).setItemsCheckedIndex(intRef.element).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.detail.SportDetailFragment.chooseExportTrack.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        intRef.element = which;
                        return;
                    }
                    SportDetailFragment.this.doExport(intRef.element, report);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doExport(int choiceIndex, SportBasicReport report) {
        if (choiceIndex == 0) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C18601(report, null), 3, null);
        } else {
            if (choiceIndex != 1) {
                return;
            }
            jumpTpExportTrack(report);
        }
    }

    private final boolean doExportHasGps() {
        Collection arrayList = new ArrayList();
        GpsValues gpsValues = this.mGpsValues;
        if (gpsValues != null) {
            Intrinsics.checkNotNull(gpsValues);
            arrayList = gpsValues.originalLocationList;
        }
        return !arrayList.isEmpty();
    }

    private final void doExportTrack(SportBasicReport report) {
        Logger.i("SportDetailFragment", "SportBasicReport is null:" + (report == null));
        if (report == null) {
            return;
        }
        if (doExportHasGps()) {
            chooseExportTrack(report);
        } else {
            jumpTpExportTrack(report);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void generateLongShareBitmapIfNeed$lambda$20$lambda$19(SportBasicReport it, SportDetailFragment this$0, final Function2 callback) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        if (FitnessSportTypeUtils.INSTANCE.supportGpsSport(it)) {
            Logger.i("SportDetailFragment", "intentToShareLongPic supportGpsSport");
            this$0.createShareBitmap(new Function2() { // from class: oen
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportDetailFragment.generateLongShareBitmapIfNeed$lambda$20$lambda$19$lambda$17(callback, (Uri) obj, (Bitmap) obj2);
                }
            });
        } else {
            Logger.i("SportDetailFragment", "intentToShareLongPic not supportGpsSport");
            this$0.createCommonBitmap(new Function2() { // from class: pen
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportDetailFragment.generateLongShareBitmapIfNeed$lambda$20$lambda$19$lambda$18(callback, (Uri) obj, (Bitmap) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateLongShareBitmapIfNeed$lambda$20$lambda$19$lambda$17(Function2 callback, Uri uri, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(uri, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateLongShareBitmapIfNeed$lambda$20$lambda$19$lambda$18(Function2 callback, Uri uri, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(uri, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getExportTrackNameForServer(String sportName, long startTime) {
        return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(startTime * ((long) 1000))) + sportName;
    }

    private final Unit getQrCodeBitMap() {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(im9.K() + File.separator + "qrLogo.jpg");
        if (bitmapDecodeFile == null) {
            launchOnLifecycleScope(new SportDetailFragment$qrCodeBitMap$1(this, null));
        } else {
            this.qrBitmap = bitmapDecodeFile;
            SportShareBottomView shareBottomView = getShareBottomView();
            Bitmap bitmap = this.qrBitmap;
            Intrinsics.checkNotNull(bitmap);
            shareBottomView.setQrBitmap(bitmap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTrack(Continuation<? super Pair<? extends List<CommonTrackData>, Boolean>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToSportReportShareActivity(Uri longPicUri) {
        Logger.i("SportDetailFragment", "goToSportReportShareActivity uri=" + longPicUri);
        hideLoading();
        Intent intent = new Intent(requireActivity(), (Class<?>) SportReportShareActivity.class);
        intent.putExtra("sport_report", this.mBasicReport);
        intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_GPS_VALID, this.isGpsPathValid);
        intent.putExtra(SportRecordBundleKey.BUNDLE_PARAM_URI, String.valueOf(longPicUri));
        if (this.sportDataType == 191) {
            SportRecordDetailViewModel sportRecordDetailViewModel = this.detailViewModel;
            Intrinsics.checkNotNull(sportRecordDetailViewModel);
            intent.putExtra(SportDetailJustDanceDataFragmentKt.BUNDLE_PARAMS_SPORT_DETAIL_JUST_DANCE_LIST, new SwitchSongList(sportRecordDetailViewModel.getSwitchJustDanceList().getValue()));
        }
        requireActivity().startActivity(intent);
    }

    private final void initJustDanceViewPager(List<SwitchSongItem> justDaceList) {
        if (justDaceList.isEmpty()) {
            ViewExtKt.visible(getMarginView());
            ViewExtKt.gone(getJustDanceViewPager());
            return;
        }
        this.justDanceCoverEntityList.clear();
        Iterator<T> it = justDaceList.iterator();
        while (it.hasNext()) {
            this.justDanceCoverEntityList.add(new JustDanceCoverEntity(SwitchSongItemKt.getViewPager((SwitchSongItem) it.next())));
        }
        ViewExtKt.visible(getJustDanceViewPager());
        ViewExtKt.gone(getMarginView());
        View childAt = getJustDanceViewPager().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        SportDetailCoverViewPagerAdapter sportDetailCoverViewPagerAdapter = new SportDetailCoverViewPagerAdapter(this.justDanceCoverEntityList);
        sportDetailCoverViewPagerAdapter.setOnItemTouchListener(new OnItemTouchListener() { // from class: com.xiaomi.fitness.detail.SportDetailFragment.initJustDanceViewPager.2
            @Override // com.xiaomi.fitness.detail.recycler.OnItemTouchListener
            public void touchDown() {
                SportDetailFragment.this.removeAutoPlayRunnable();
            }

            @Override // com.xiaomi.fitness.detail.recycler.OnItemTouchListener
            public void touchUp() {
                SportDetailFragment.this.postAutoPlayRunnable();
            }
        });
        getJustDanceViewPager().setOffscreenPageLimit(this.justDanceCoverEntityList.size());
        getJustDanceViewPager().setClipChildren(false);
        getJustDanceViewPager().setAdapter(sportDetailCoverViewPagerAdapter);
        getJustDanceViewPager().h(new ViewPager2.i() { // from class: com.xiaomi.fitness.detail.SportDetailFragment.initJustDanceViewPager.3
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                SportDetailFragment.this.removeAutoPlayRunnable();
                SportDetailFragment.this.postAutoPlayRunnable();
            }
        });
        this.autoPlayRunnable = new Runnable() { // from class: com.xiaomi.fitness.detail.SportDetailFragment$initJustDanceViewPager$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                int currentItem = this.this$0.getJustDanceViewPager().getCurrentItem();
                if (currentItem < this.this$0.justDanceCoverEntityList.size() - 1) {
                    this.this$0.getJustDanceViewPager().setCurrentItem(currentItem + 1);
                } else {
                    this.this$0.getJustDanceViewPager().k(0, false);
                }
                this.this$0.postAutoPlayRunnable();
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    private final void initParamsFromBundle(Bundle bundle) {
        boolean z;
        Long cloudCourseId;
        Long trainingPlanId;
        if (bundle != null) {
            this.sportDataType = bundle.getInt("sport_type", 22);
            SportBasicReport sportBasicReport = (SportBasicReport) bundle.getSerializable("sport_report");
            this.mBasicReport = sportBasicReport;
            boolean z2 = true;
            if (((sportBasicReport == null || (trainingPlanId = sportBasicReport.getTrainingPlanId()) == null) ? 0L : trainingPlanId.longValue()) <= 0) {
                z = false;
            } else {
                SportBasicReport sportBasicReport2 = this.mBasicReport;
                if (((sportBasicReport2 == null || (cloudCourseId = sportBasicReport2.getCloudCourseId()) == null) ? 0L : cloudCourseId.longValue()) > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            this.needShowTrainingPlanCourseInfo = z;
            Logger.d("SportDetailFragment", "needShowTrainingPlanCourseInfo: " + z);
            this.routeData = (RouteReportData) bundle.getSerializable(SportBasicReportKt.getROUTE_KEY());
            this.timeStamp = bundle.getLong("time_stamp", System.currentTimeMillis());
            SportBasicReport sportBasicReport3 = this.mBasicReport;
            if (sportBasicReport3 != null) {
                sportBasicReport3.setShowConnectDevice(bundle.getBoolean("connect_device", false));
            }
            this.gotoSource = bundle.getString("sport_source", "workout_list_page");
            SportBasicReport sportBasicReport4 = this.mBasicReport;
            if (sportBasicReport4 != null) {
                Intrinsics.checkNotNull(sportBasicReport4);
                if (sportBasicReport4.getSportType() != 3) {
                    SportBasicReport sportBasicReport5 = this.mBasicReport;
                    Intrinsics.checkNotNull(sportBasicReport5);
                    if (sportBasicReport5.getSportType() != 7) {
                        FitnessSportTypeUtils fitnessSportTypeUtils = FitnessSportTypeUtils.INSTANCE;
                        SportBasicReport sportBasicReport6 = this.mBasicReport;
                        Intrinsics.checkNotNull(sportBasicReport6);
                        if (!fitnessSportTypeUtils.supportGpsSport(sportBasicReport6)) {
                            z2 = false;
                        }
                    }
                }
                this.showFeedback = z2;
            }
        }
    }

    private final void initTitleBar() {
        int dp;
        float f;
        boolean z = false;
        setTopPadding$default(this, getSportTitle(), 0, 2, null);
        setTopPadding(getImgBack(), ExtUtilsKt.getDp(10));
        setTopPadding(getImgDelete(), ExtUtilsKt.getDp(10));
        setTopPadding(getImgShare(), ExtUtilsKt.getDp(10));
        getSportTitle().setText(lp5.c(this.sportDataType));
        ViewExtKt.clickWithTrigger$default(getImgShare(), 0L, new Function1() { // from class: bfn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailFragment.initTitleBar$lambda$13(this.f4155a, (ImageView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getImgBack(), 0L, new Function1() { // from class: cfn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailFragment.initTitleBar$lambda$14(this.f5287a, (ImageView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getImgDelete(), 0L, new Function1() { // from class: dfn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailFragment.initTitleBar$lambda$15(this.f15490a, (ImageView) obj);
            }
        }, 1, null);
        if (supportGpsSport()) {
            BaseFragmentExtKt.setStatusBarColor(this, dki.common_transparent);
            setRecordDetailContentBg();
            dp = ExtUtilsKt.getDp(Float.valueOf(250.0f));
            getSportTitle().setBackgroundColor(x44.a(dki.common_transparent));
            f = 0.95f;
            z = true;
        } else {
            dp = ExtUtilsKt.getDp(Float.valueOf(120.0f));
            BaseFragmentExtKt.setStatusBarColor(this, dki.common_transparent);
            getSportTitle().setBackgroundColor(x44.a(dki.common_transparent));
            getOutContainer().setBackgroundColor(ExtUtilsKt.getColor(dki.n0));
            f = 0.98f;
        }
        addScrollChangeListener(dp, f, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleBar$lambda$13(final SportDetailFragment this$0, final ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36902");
        pairArr[1] = TuplesKt.to("name", "btn_share");
        pairArr[2] = TuplesKt.to("type_str", String.valueOf(this$0.getSportTitle().getText()));
        SportBasicReport sportBasicReport = this$0.mBasicReport;
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(sportBasicReport != null ? Integer.valueOf(sportBasicReport.getSportType()) : null));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        Logger.i("SportDetailFragment", "initTitleBar imgShare clicked.");
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportReportShareExtKt.checkExternalStoragePermissionIfNeed(fragmentActivityRequireActivity, new Function0() { // from class: qen
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportDetailFragment.initTitleBar$lambda$13$lambda$12(this.f31445a, it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleBar$lambda$13$lambda$12(SportDetailFragment this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SportDetailFragment$initTitleBar$1$1$1(this$0, it, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleBar$lambda$14(SportDetailFragment this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleBar$lambda$15(SportDetailFragment this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showPopupMenu(this$0.getImgDelete());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$10(SportDetailFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mRecordDetailMap = map;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$11(SportDetailFragment this$0, SportsReportOperationalCourseData sportsReportOperationalCourseData) {
        String strC;
        SportsReportOperationalCourseInfo courseInfo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("report request", "detail type = " + this$0.sportDataType + " courseInfo: " + ((sportsReportOperationalCourseData == null || (courseInfo = sportsReportOperationalCourseData.getCourseInfo()) == null) ? null : courseInfo.getName()));
        if (sportsReportOperationalCourseData != null) {
            SportsReportOperationalCourseTrainSummary trainSummary = sportsReportOperationalCourseData.getTrainSummary();
            Integer numValueOf = trainSummary != null ? Integer.valueOf(trainSummary.getTrainTimes()) : null;
            String name = sportsReportOperationalCourseData.getCourseInfo().getName();
            if (TextUtils.isEmpty(name)) {
                String strC2 = lp5.c(this$0.sportDataType);
                this$0.getSportTitle().setText(strC2);
                Intrinsics.checkNotNull(strC2);
                this$0.onTitleDecided(strC2);
            } else {
                this$0.getSportTitle().setText(name);
                if (numValueOf == null || numValueOf.intValue() <= 0 || this$0.needShowTrainingPlanCourseInfo) {
                    this$0.onTitleDecided(name);
                } else {
                    String quantityString = this$0.getResources().getQuantityString(byi.course_record_times, numValueOf.intValue(), numValueOf);
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    String string = this$0.getString(j1j.course_record_summary, name, quantityString);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    this$0.onTitleDecided(string);
                }
            }
        } else {
            SportBasicReport sportBasicReport = this$0.mBasicReport;
            if (sportBasicReport == null || (strC = sportBasicReport.getCourseName()) == null) {
                strC = lp5.c(this$0.sportDataType);
            }
            this$0.getSportTitle().setText(strC);
            Intrinsics.checkNotNull(strC);
            this$0.onTitleDecided(strC);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$8(SportDetailFragment this$0, OneDivingIdReport it) {
        Integer entityOffsetTime;
        Integer divingAreaId;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        SportBasicReport sportBasicReport = this$0.mBasicReport;
        if (sportBasicReport != null) {
            sportBasicReport.setDivingAreaId(Integer.valueOf(it.getDiveAreaId()));
        }
        SportBasicReport sportBasicReport2 = this$0.mBasicReport;
        if (sportBasicReport2 != null) {
            sportBasicReport2.setDivingCountryId(Integer.valueOf(it.getDiveCountryId()));
        }
        Logger.i("SportHttpRequest", "divingAreaId " + it.getDiveAreaId() + "  divingCountryId  " + it.getDiveCountryId());
        SportBasicReport sportBasicReport3 = this$0.mBasicReport;
        if (sportBasicReport3 != null) {
            sportBasicReport3.setRequestDivingId(Boolean.TRUE);
        }
        SportRecordDetailViewModel sportRecordDetailViewModel = this$0.detailViewModel;
        Intrinsics.checkNotNull(sportRecordDetailViewModel);
        SportBasicReport sportBasicReport4 = this$0.mBasicReport;
        int iIntValue = 0;
        sportRecordDetailViewModel.getDivingPointNameFromNet((sportBasicReport4 == null || (divingAreaId = sportBasicReport4.getDivingAreaId()) == null) ? 0 : divingAreaId.intValue());
        SportBasicReport sportBasicReport5 = this$0.mBasicReport;
        if ((sportBasicReport5 != null ? sportBasicReport5.getSid() : null) != null) {
            FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
            SportBasicReport sportBasicReport6 = this$0.mBasicReport;
            String sid = sportBasicReport6 != null ? sportBasicReport6.getSid() : null;
            Intrinsics.checkNotNull(sid);
            SportBasicReport sportBasicReport7 = this$0.mBasicReport;
            if (sportBasicReport7 != null && (entityOffsetTime = sportBasicReport7.getEntityOffsetTime()) != null) {
                iIntValue = entityOffsetTime.intValue();
            }
            SportBasicReport sportBasicReport8 = this$0.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport8);
            fitnessDataExtKt.recordSportReport(sid, iIntValue, sportBasicReport8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$9(SportDetailFragment this$0, String it) {
        Integer entityOffsetTime;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("SportHttpRequest", "error " + it);
        SportBasicReport sportBasicReport = this$0.mBasicReport;
        if (sportBasicReport != null) {
            sportBasicReport.setRequestDivingId(Boolean.TRUE);
        }
        SportBasicReport sportBasicReport2 = this$0.mBasicReport;
        if ((sportBasicReport2 != null ? sportBasicReport2.getSid() : null) != null) {
            FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
            SportBasicReport sportBasicReport3 = this$0.mBasicReport;
            String sid = sportBasicReport3 != null ? sportBasicReport3.getSid() : null;
            Intrinsics.checkNotNull(sid);
            SportBasicReport sportBasicReport4 = this$0.mBasicReport;
            int iIntValue = (sportBasicReport4 == null || (entityOffsetTime = sportBasicReport4.getEntityOffsetTime()) == null) ? 0 : entityOffsetTime.intValue();
            SportBasicReport sportBasicReport5 = this$0.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport5);
            fitnessDataExtKt.recordSportReport(sid, iIntValue, sportBasicReport5);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToShareVideo$lambda$1$lambda$0(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.List] */
    private final void jumpTpExportTrack(SportBasicReport report) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt__CollectionsKt.emptyList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        String strC = lp5.c(this.sportDataType);
        Intrinsics.checkNotNull(strC);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C18621(objectRef, booleanRef, getExportTrackNameForServer(strC, report.getStartTime()), report, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(SportDetailFragment this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBasicInfoView().updateHeaderInfo(accountCoreInfo, this$0 instanceof SportDetailCommonFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(SportDetailFragment this$0, String str, List basicItemInfos) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(basicItemInfos, "basicItemInfos");
        Logger.d("SPORTS REPORT", "fresh observe");
        if (!this$0.isInvalid() && !this$0.isBindBasicInfo) {
            SportRecordBasicInfoView basicInfoView = this$0.getBasicInfoView();
            SportBasicReport sportBasicReport = this$0.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport);
            if (this$0.courseId > 0) {
                str = "";
            }
            basicInfoView.bindData(sportBasicReport, basicItemInfos, str, this$0 instanceof SportDetailCommonFragment, !this$0.needShowTrainingPlanCourseInfo);
            this$0.isBindBasicInfo = true;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(SportDetailFragment this$0, CourseInfoItem courseInfoItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (courseInfoItem != null) {
            String courseName = courseInfoItem.getCourseInfoItem().getCourseName();
            if (!TextUtils.isEmpty(courseName)) {
                this$0.getBasicInfoView().bindCourseName(courseName);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(SportDetailFragment this$0, List justDaceList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(justDaceList, "justDaceList");
        Logger.d("SPORTS REPORT", "fresh justDaceList：" + justDaceList);
        this$0.initJustDanceViewPager(justDaceList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postAutoPlayRunnable() {
        Handler handler = this.handler;
        Runnable runnable = this.autoPlayRunnable;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autoPlayRunnable");
            runnable = null;
        }
        handler.postDelayed(runnable, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeAutoPlayRunnable() {
        Handler handler = this.handler;
        Runnable runnable = this.autoPlayRunnable;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autoPlayRunnable");
            runnable = null;
        }
        handler.removeCallbacks(runnable);
    }

    private final void setRecordDetailContentBg() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        getRecordDetailContent().setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, UIUtils.isNightMode(contextRequireContext) ? new int[]{436207616, -855638016, -16777216} : new int[]{452655866, -839189766, -328966}));
    }

    private final void setTopPadding(View view, int top) {
        view.setPadding(0, DisplayUtil.getStatusBarHeight(), 0, 0);
    }

    public static /* synthetic */ void setTopPadding$default(SportDetailFragment sportDetailFragment, View view, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTopPadding");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        sportDetailFragment.setTopPadding(view, i);
    }

    private final boolean shouldShowExportTrackMenuItem() {
        return !AppUtil.INSTANCE.isPlayChannel();
    }

    private final void showDeleteConfirmDialog(final SportBasicReport report) {
        if (report == null) {
            return;
        }
        new CommonDialog.c("delete sport record").setDialogTitle(j1j.O0).setDialogDescription(j1j.N0).setPositiveText(j1j.c).setNegativeText(j1j.f22329b).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.detail.SportDetailFragment.showDeleteConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    boolean zDeleteSportReport = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).deleteSportReport(report);
                    Logger.i("delete sport record: " + zDeleteSportReport, new Object[0]);
                    Context context = this.getContext();
                    if (context != null) {
                        ToastExtKt.toastShort(context, zDeleteSportReport ? j1j.common_delete_success : j1j.common_delete_failure);
                    }
                    this.finish();
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(qwi.f31911a);
        MenuItem menuItemFindItem = a4iVar.d().findItem(bsi.p4);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        menuItemFindItem.setVisible(shouldShowExportTrackMenuItem());
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: ven
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return SportDetailFragment.showPopupMenu$lambda$21(this.f36820a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$21(SportDetailFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == bsi.o4) {
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36902");
            pairArr[1] = TuplesKt.to("name", "btn_delete_record");
            pairArr[2] = TuplesKt.to("type_str", String.valueOf(this$0.getSportTitle().getText()));
            SportBasicReport sportBasicReport = this$0.mBasicReport;
            pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(sportBasicReport != null ? Integer.valueOf(sportBasicReport.getSportType()) : null));
            oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
            this$0.showDeleteConfirmDialog(this$0.mBasicReport);
        } else if (itemId == bsi.p4) {
            IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            Pair[] pairArr2 = new Pair[4];
            pairArr2[0] = TuplesKt.to("tip", "56.93.0.1.36902");
            pairArr2[1] = TuplesKt.to("name", "btn_export_record");
            pairArr2[2] = TuplesKt.to("type_str", String.valueOf(this$0.getSportTitle().getText()));
            SportBasicReport sportBasicReport2 = this$0.mBasicReport;
            pairArr2[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(sportBasicReport2 != null ? Integer.valueOf(sportBasicReport2.getSportType()) : null));
            oneTrackExtKt2.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr2));
            this$0.doExportTrack(this$0.mBasicReport);
        }
        return true;
    }

    public void createShareBitmap(@NotNull Function2<? super Uri, ? super Bitmap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void generateLongShareBitmapIfNeed(@NotNull final Function2<? super Uri, ? super Bitmap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Logger.i("SportDetailFragment", "generateLongShareViewmBasicReport=" + this.mBasicReport + " shareBottomView=" + getShareBottomView());
        final SportBasicReport sportBasicReport = this.mBasicReport;
        if (sportBasicReport != null) {
            getShareBottomView().post(new Runnable() { // from class: afn
                @Override // java.lang.Runnable
                public final void run() {
                    SportDetailFragment.generateLongShareBitmapIfNeed$lambda$20$lambda$19(sportBasicReport, this, callback);
                }
            });
        }
    }

    @NotNull
    public final SportRecordBasicInfoView getBasicInfoView() {
        SportRecordBasicInfoView sportRecordBasicInfoView = this.basicInfoView;
        if (sportRecordBasicInfoView != null) {
            return sportRecordBasicInfoView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("basicInfoView");
        return null;
    }

    @Nullable
    public final SportRecordDetailViewModel getDetailViewModel() {
        return this.detailViewModel;
    }

    @NotNull
    public final String getGotoSource() {
        return this.gotoSource;
    }

    @NotNull
    public final ImageView getImgBack() {
        ImageView imageView = this.imgBack;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imgBack");
        return null;
    }

    @NotNull
    public final ImageView getImgDelete() {
        ImageView imageView = this.imgDelete;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imgDelete");
        return null;
    }

    @Nullable
    public final ImageView getImgLocation() {
        return this.imgLocation;
    }

    @Nullable
    public final ImageView getImgMapDialog() {
        return this.imgMapDialog;
    }

    @NotNull
    public final ImageView getImgShare() {
        ImageView imageView = this.imgShare;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imgShare");
        return null;
    }

    @Nullable
    public final LinearLayout getImgSportTrace() {
        return this.imgSportTrace;
    }

    @NotNull
    public final ViewPager2 getJustDanceViewPager() {
        ViewPager2 viewPager2 = this.justDanceViewPager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("justDanceViewPager");
        return null;
    }

    @Nullable
    public final SportBasicReport getMBasicReport() {
        return this.mBasicReport;
    }

    @Nullable
    public final GpsValues getMGpsValues() {
        return this.mGpsValues;
    }

    @NotNull
    public final MapScrollView getMapScrollView() {
        MapScrollView mapScrollView = this.mapScrollView;
        if (mapScrollView != null) {
            return mapScrollView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapScrollView");
        return null;
    }

    @NotNull
    public final View getMarginView() {
        View view = this.marginView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginView");
        return null;
    }

    @NotNull
    public final ConstraintLayout getOutContainer() {
        ConstraintLayout constraintLayout = this.outContainer;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("outContainer");
        return null;
    }

    @NotNull
    public final LinearLayout getRecordDetailContent() {
        LinearLayout linearLayout = this.recordDetailContent;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recordDetailContent");
        return null;
    }

    @NotNull
    public final LinearLayoutCompat getReportAllRootView() {
        LinearLayoutCompat linearLayoutCompat = this.reportAllRootView;
        if (linearLayoutCompat != null) {
            return linearLayoutCompat;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reportAllRootView");
        return null;
    }

    @Nullable
    public final RouteReportData getRouteData() {
        return this.routeData;
    }

    @NotNull
    public final SportShareBottomView getShareBottomView() {
        SportShareBottomView sportShareBottomView = this.shareBottomView;
        if (sportShareBottomView != null) {
            return sportShareBottomView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shareBottomView");
        return null;
    }

    public final boolean getShowFeedback() {
        return this.showFeedback;
    }

    public final int getSportDataType() {
        return this.sportDataType;
    }

    @Nullable
    public final SportPathMapView getSportPathView() {
        return this.sportPathView;
    }

    @NotNull
    public final SportShareLongView getSportShareLongView() {
        SportShareLongView sportShareLongView = this.sportShareLongView;
        if (sportShareLongView != null) {
            return sportShareLongView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sportShareLongView");
        return null;
    }

    @NotNull
    public final TextView getSportTitle() {
        TextView textView = this.sportTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sportTitle");
        return null;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    public final void initView() {
        SportBasicReport sportBasicReport;
        SportBasicReport sportBasicReport2;
        Float waterInletLongitude;
        Float waterInletLatitude;
        Float waterOutletLongitude;
        Float waterOutletLatitude;
        MutableLiveData<SportsReportOperationalCourseData> sportsReportOperationalCourseInfo;
        String strC;
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        Integer divingAreaId;
        String str;
        String sid;
        SportBasicReport sportBasicReport3;
        long startTime;
        SportBasicReport sportBasicReport4;
        long endTime;
        SportBasicReport sportBasicReport5;
        String string;
        SportBasicReport sportBasicReport6;
        Integer cloudCourseSource;
        Long cloudCourseId;
        initParamsFromBundle(getArguments());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.detailViewModel = (SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class);
        FitnessPersistKey fitnessPersistKey = FitnessPersistKey.INSTANCE;
        SportBasicReport sportBasicReport7 = this.mBasicReport;
        int iIntValue = 0;
        SportReportKey sportReportKey = fitnessPersistKey.getSportReportKey(sportBasicReport7 != null ? sportBasicReport7.getSportType() : 0);
        SportBasicReport sportBasicReport8 = this.mBasicReport;
        String sid2 = sportBasicReport8 != null ? sportBasicReport8.getSid() : null;
        if (sid2 != null && sid2.length() != 0 && sportReportKey != null) {
            SportBasicReport sportBasicReport9 = this.mBasicReport;
            if (Intrinsics.areEqual("xiaomiwear_app_manually", sportBasicReport9 != null ? sportBasicReport9.getSid() : null)) {
                sid = "app";
            } else {
                SportBasicReport sportBasicReport10 = this.mBasicReport;
                if (sportBasicReport10 != null) {
                    sid = sportBasicReport10.getSid();
                } else {
                    str = null;
                }
                SportRecordDetailViewModel sportRecordDetailViewModel = this.detailViewModel;
                Intrinsics.checkNotNull(sportRecordDetailViewModel);
                Intrinsics.checkNotNull(str);
                String key = sportReportKey.getKey();
                sportBasicReport3 = this.mBasicReport;
                if (sportBasicReport3 != null) {
                    startTime = sportBasicReport3.getStartTime();
                } else {
                    startTime = 0;
                }
                sportBasicReport4 = this.mBasicReport;
                if (sportBasicReport4 != null) {
                    endTime = sportBasicReport4.getEndTime();
                } else {
                    endTime = 0;
                }
                sportBasicReport5 = this.mBasicReport;
                if (sportBasicReport5 != null || (cloudCourseId = sportBasicReport5.getCloudCourseId()) == null) {
                    string = null;
                } else {
                    string = cloudCourseId.toString();
                }
                sportBasicReport6 = this.mBasicReport;
                if (sportBasicReport6 != null) {
                    cloudCourseSource = sportBasicReport6.getCloudCourseSource();
                } else {
                    cloudCourseSource = null;
                }
                sportRecordDetailViewModel.getReportInfoFromNet(str, key, startTime, endTime, string, cloudCourseSource);
            }
            str = sid;
            SportRecordDetailViewModel sportRecordDetailViewModel2 = this.detailViewModel;
            Intrinsics.checkNotNull(sportRecordDetailViewModel2);
            Intrinsics.checkNotNull(str);
            String key2 = sportReportKey.getKey();
            sportBasicReport3 = this.mBasicReport;
            if (sportBasicReport3 != null) {
                startTime = sportBasicReport3.getStartTime();
            } else {
                startTime = 0;
            }
            sportBasicReport4 = this.mBasicReport;
            if (sportBasicReport4 != null) {
                endTime = sportBasicReport4.getEndTime();
            } else {
                endTime = 0;
            }
            sportBasicReport5 = this.mBasicReport;
            if (sportBasicReport5 != null) {
                string = null;
            } else {
                string = null;
            }
            sportBasicReport6 = this.mBasicReport;
            if (sportBasicReport6 != null) {
                cloudCourseSource = sportBasicReport6.getCloudCourseSource();
            } else {
                cloudCourseSource = null;
            }
            sportRecordDetailViewModel2.getReportInfoFromNet(str, key2, startTime, endTime, string, cloudCourseSource);
        }
        SportBasicReport sportBasicReport11 = this.mBasicReport;
        if ((sportBasicReport11 != null ? sportBasicReport11.getDivingAreaId() : null) != null) {
            SportRecordDetailViewModel sportRecordDetailViewModel3 = this.detailViewModel;
            Intrinsics.checkNotNull(sportRecordDetailViewModel3);
            SportBasicReport sportBasicReport12 = this.mBasicReport;
            if (sportBasicReport12 != null && (divingAreaId = sportBasicReport12.getDivingAreaId()) != null) {
                iIntValue = divingAreaId.intValue();
            }
            sportRecordDetailViewModel3.getDivingPointNameFromNet(iIntValue);
        } else {
            SportBasicReport sportBasicReport13 = this.mBasicReport;
            if (sportBasicReport13 != null && Intrinsics.areEqual(sportBasicReport13.getRequestDivingId(), Boolean.FALSE) && tjg.a(ApplicationExtKt.getApplication()) && (((sportBasicReport = this.mBasicReport) != null && sportBasicReport.divingInPositionValid()) || ((sportBasicReport2 = this.mBasicReport) != null && sportBasicReport2.divingOutPositionValid()))) {
                SportBasicReport sportBasicReport14 = this.mBasicReport;
                float fFloatValue = 10000.0f;
                float fFloatValue2 = (sportBasicReport14 == null || (waterOutletLatitude = sportBasicReport14.getWaterOutletLatitude()) == null) ? 10000.0f : waterOutletLatitude.floatValue();
                SportBasicReport sportBasicReport15 = this.mBasicReport;
                DivingPosition divingPosition = new DivingPosition(fFloatValue2, (sportBasicReport15 == null || (waterOutletLongitude = sportBasicReport15.getWaterOutletLongitude()) == null) ? 10000.0f : waterOutletLongitude.floatValue());
                SportBasicReport sportBasicReport16 = this.mBasicReport;
                float fFloatValue3 = (sportBasicReport16 == null || (waterInletLatitude = sportBasicReport16.getWaterInletLatitude()) == null) ? 10000.0f : waterInletLatitude.floatValue();
                SportBasicReport sportBasicReport17 = this.mBasicReport;
                if (sportBasicReport17 != null && (waterInletLongitude = sportBasicReport17.getWaterInletLongitude()) != null) {
                    fFloatValue = waterInletLongitude.floatValue();
                }
                new SportHttpRequest().getDivingIDData(new DivingOutInPosition(new DivingPosition(fFloatValue3, fFloatValue), divingPosition), new Function1() { // from class: wen
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailFragment.initView$lambda$8(this.f37904a, (OneDivingIdReport) obj);
                    }
                }, new Function1() { // from class: xen
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailFragment.initView$lambda$9(this.f39052a, (String) obj);
                    }
                });
            }
        }
        initTitleBar();
        SportRecordDetailViewModel sportRecordDetailViewModel4 = this.detailViewModel;
        if (sportRecordDetailViewModel4 != null && (recordDetailMaps = sportRecordDetailViewModel4.getRecordDetailMaps()) != null) {
            recordDetailMaps.observe(requireActivity(), new SportDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yen
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailFragment.initView$lambda$10(this.f40105a, (Map) obj);
                }
            }));
        }
        if (this.courseId <= 0) {
            SportBasicReport sportBasicReport18 = this.mBasicReport;
            if (sportBasicReport18 == null || (strC = sportBasicReport18.getCourseName()) == null) {
                strC = lp5.c(this.sportDataType);
            }
            getSportTitle().setText(strC);
            Intrinsics.checkNotNull(strC);
            onTitleDecided(strC);
        }
        SportRecordDetailViewModel sportRecordDetailViewModel5 = this.detailViewModel;
        if (sportRecordDetailViewModel5 == null || (sportsReportOperationalCourseInfo = sportRecordDetailViewModel5.getSportsReportOperationalCourseInfo()) == null) {
            return;
        }
        sportsReportOperationalCourseInfo.observe(getViewLifecycleOwner(), new SportDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zen
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailFragment.initView$lambda$11(this.f41198a, (SportsReportOperationalCourseData) obj);
            }
        }));
    }

    public final void intentToShareVideo() {
        final Bundle bundle = new Bundle();
        SportBasicReport sportBasicReport = this.mBasicReport;
        if (sportBasicReport != null) {
            Intrinsics.checkNotNull(sportBasicReport);
            bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
            bundle.putSerializable("sport_report", this.mBasicReport);
            bundle.putInt("sport_type", this.sportDataType);
            if (AppUtil.INSTANCE.isPlayChannel()) {
                return;
            }
            LaunchExtensionKt.startActivity(this, (Class<?>) SharePathVideoAmapActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: nen
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailFragment.intentToShareVideo$lambda$1$lambda$0(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: isGpsPathValid, reason: from getter */
    public final boolean getIsGpsPathValid() {
        return this.isGpsPathValid;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).getMapboxInstance();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getBasicInfoView().cancelAvatarLoad();
        o5o.e().a();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        IOnetrack.Companion companion = IOnetrack.INSTANCE;
        OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797"), "name", "recent_workout_detail_page", "page_fragment", "day", "title", "运动详情", "data", "1");
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.mFragmentVisibleTime) / ((long) 1000);
        this.mFragmentVisibleTime = 0L;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(companion);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.93.0.1.36901");
        Object[] objArr = new Object[10];
        objArr[0] = "name";
        objArr[1] = "workout_detail_page";
        objArr[2] = "title";
        objArr[3] = getSportTitle().getText();
        objArr[4] = HealthTabOneTrackExtKt.KEY_TYPE_NUM;
        SportBasicReport sportBasicReport = this.mBasicReport;
        objArr[5] = String.valueOf(sportBasicReport != null ? sportBasicReport.getSportType() : -1);
        objArr[6] = "duration_sec";
        objArr[7] = Long.valueOf(jCurrentTimeMillis);
        objArr[8] = "source";
        objArr[9] = this.gotoSource;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        super.onInvisible();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        MutableLiveData<List<SwitchSongItem>> switchJustDanceList;
        MutableLiveData<CourseInfoItem> courseInfoResult;
        MutableLiveData<List<BasicItemInfo>> basicItemInfoLiveData;
        MutableLiveData<AccountCoreInfo> userInfoLiveData;
        super.onStart();
        getQrCodeBitMap();
        if (this.mBasicReport != null && getIsPrepared()) {
            final String strC = lp5.c(this.sportDataType);
            SportRecordDetailViewModel sportRecordDetailViewModel = this.detailViewModel;
            if (sportRecordDetailViewModel != null) {
                sportRecordDetailViewModel.m242getUserInfoLiveData();
            }
            SportRecordDetailViewModel sportRecordDetailViewModel2 = this.detailViewModel;
            if (sportRecordDetailViewModel2 != null && (userInfoLiveData = sportRecordDetailViewModel2.getUserInfoLiveData()) != null) {
                userInfoLiveData.observe(this, new SportDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ren
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailFragment.onStart$lambda$2(this.f32473a, (AccountCoreInfo) obj);
                    }
                }));
            }
            SportRecordDetailViewModel sportRecordDetailViewModel3 = this.detailViewModel;
            if (sportRecordDetailViewModel3 != null) {
                sportRecordDetailViewModel3.requestRecoverRateData(this.mBasicReport);
            }
            SportRecordDetailViewModel sportRecordDetailViewModel4 = this.detailViewModel;
            if (sportRecordDetailViewModel4 != null && (basicItemInfoLiveData = sportRecordDetailViewModel4.getBasicItemInfoLiveData()) != null) {
                basicItemInfoLiveData.observe(getViewLifecycleOwner(), new SportDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sen
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailFragment.onStart$lambda$3(this.f33568a, strC, (List) obj);
                    }
                }));
            }
            if (this.needShowTrainingPlanCourseInfo) {
                SportBasicReport sportBasicReport = this.mBasicReport;
                Intrinsics.checkNotNull(sportBasicReport);
                Long cloudCourseId = sportBasicReport.getCloudCourseId();
                CourseItem courseItem = new CourseItem(3, String.valueOf(cloudCourseId != null ? cloudCourseId.longValue() : 0L));
                SportRecordDetailViewModel sportRecordDetailViewModel5 = this.detailViewModel;
                if (sportRecordDetailViewModel5 != null) {
                    sportRecordDetailViewModel5.getCourseInfo(courseItem);
                }
                SportRecordDetailViewModel sportRecordDetailViewModel6 = this.detailViewModel;
                if (sportRecordDetailViewModel6 != null && (courseInfoResult = sportRecordDetailViewModel6.getCourseInfoResult()) != null) {
                    courseInfoResult.observe(getViewLifecycleOwner(), new SportDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ten
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return SportDetailFragment.onStart$lambda$5(this.f34625a, (CourseInfoItem) obj);
                        }
                    }));
                }
            }
        }
        SportRecordDetailViewModel sportRecordDetailViewModel7 = this.detailViewModel;
        if (sportRecordDetailViewModel7 == null || (switchJustDanceList = sportRecordDetailViewModel7.getSwitchJustDanceList()) == null) {
            return;
        }
        switchJustDanceList.observe(getViewLifecycleOwner(), new SportDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: uen
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailFragment.onStart$lambda$6(this.f35692a, (List) obj);
            }
        }));
    }

    public void onTitleDecided(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initView();
        UploadFileManager uploadFileManagerExtKt = UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uploadFileManagerExtKt.popCommentIfNeed(fragmentActivityRequireActivity);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mFragmentVisibleTime = System.currentTimeMillis();
    }

    public abstract void resetUIDisplay();

    public final void setBasicInfoView(@NotNull SportRecordBasicInfoView sportRecordBasicInfoView) {
        Intrinsics.checkNotNullParameter(sportRecordBasicInfoView, "<set-?>");
        this.basicInfoView = sportRecordBasicInfoView;
    }

    public final void setDetailViewModel(@Nullable SportRecordDetailViewModel sportRecordDetailViewModel) {
        this.detailViewModel = sportRecordDetailViewModel;
    }

    public final void setGotoSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gotoSource = str;
    }

    public final void setGpsPathValid(boolean z) {
        this.isGpsPathValid = z;
    }

    public final void setImgBack(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgBack = imageView;
    }

    public final void setImgDelete(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgDelete = imageView;
    }

    public final void setImgLocation(@Nullable ImageView imageView) {
        this.imgLocation = imageView;
    }

    public final void setImgMapDialog(@Nullable ImageView imageView) {
        this.imgMapDialog = imageView;
    }

    public final void setImgShare(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgShare = imageView;
    }

    public final void setImgSportTrace(@Nullable LinearLayout linearLayout) {
        this.imgSportTrace = linearLayout;
    }

    public final void setJustDanceViewPager(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<set-?>");
        this.justDanceViewPager = viewPager2;
    }

    public final void setMBasicReport(@Nullable SportBasicReport sportBasicReport) {
        this.mBasicReport = sportBasicReport;
    }

    public final void setMGpsValues(@Nullable GpsValues gpsValues) {
        this.mGpsValues = gpsValues;
    }

    public final void setMapScrollView(@NotNull MapScrollView mapScrollView) {
        Intrinsics.checkNotNullParameter(mapScrollView, "<set-?>");
        this.mapScrollView = mapScrollView;
    }

    public final void setMarginView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.marginView = view;
    }

    public final void setMarginViewHeight(@Nullable Boolean isGpsEnable) {
        ViewGroup.LayoutParams layoutParams = getMarginView().getLayoutParams();
        layoutParams.height = Intrinsics.areEqual(isGpsEnable, Boolean.TRUE) ? (DisplayUtil.getScreenHeight() / 2) + ExtUtilsKt.getDp(Float.valueOf(20.0f)) : ExtUtilsKt.getDp(280);
        getMarginView().setLayoutParams(layoutParams);
    }

    public final void setOutContainer(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.outContainer = constraintLayout;
    }

    public final void setRecordDetailContent(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.recordDetailContent = linearLayout;
    }

    public final void setRecordDetailContentBgBitmap() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        getRecordDetailContent().setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, UIUtils.isNightMode(contextRequireContext) ? new int[]{-1610612736, -16777216} : new int[]{-1594164486, -328966}));
    }

    public final void setReportAllRootView(@NotNull LinearLayoutCompat linearLayoutCompat) {
        Intrinsics.checkNotNullParameter(linearLayoutCompat, "<set-?>");
        this.reportAllRootView = linearLayoutCompat;
    }

    public final void setRouteData(@Nullable RouteReportData routeReportData) {
        this.routeData = routeReportData;
    }

    public final void setShareBottomView(@NotNull SportShareBottomView sportShareBottomView) {
        Intrinsics.checkNotNullParameter(sportShareBottomView, "<set-?>");
        this.shareBottomView = sportShareBottomView;
    }

    public final void setShowFeedback(boolean z) {
        this.showFeedback = z;
    }

    public final void setSportDataType(int i) {
        this.sportDataType = i;
    }

    public final void setSportPathView(@Nullable SportPathMapView sportPathMapView) {
        this.sportPathView = sportPathMapView;
    }

    public final void setSportShareLongView(@NotNull SportShareLongView sportShareLongView) {
        Intrinsics.checkNotNullParameter(sportShareLongView, "<set-?>");
        this.sportShareLongView = sportShareLongView;
    }

    public final void setSportTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.sportTitle = textView;
    }

    @Override // com.mi.health.map.data.sportmodel.share.IShareMapLongView
    public void setStatueTextWhite(boolean isBlack) {
        if (isInvalid()) {
            return;
        }
        DisplayUtil.setStatusBarFontColor(requireActivity(), isBlack);
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public final boolean supportGpsSport() {
        SportBasicReport sportBasicReport = this.mBasicReport;
        if (sportBasicReport == null) {
            return false;
        }
        FitnessSportTypeUtils fitnessSportTypeUtils = FitnessSportTypeUtils.INSTANCE;
        Intrinsics.checkNotNull(sportBasicReport);
        return fitnessSportTypeUtils.supportGpsSport(sportBasicReport);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public final boolean supportSportTraceSelect() {
        boolean z;
        boolean z2 = Build.VERSION.SDK_INT >= 29;
        if (AppUtil.INSTANCE.isPlayChannel()) {
            z = false;
        } else {
            SportRecordDetailViewModel sportRecordDetailViewModel = this.detailViewModel;
            Intrinsics.checkNotNull(sportRecordDetailViewModel);
            if (sportRecordDetailViewModel.supportGpsSport(this.mBasicReport) && GpsValues.validGpsValue(this.mGpsValues)) {
                z = true;
            } else {
                z = false;
            }
        }
        this.isGpsPathValid = z;
        FitnessSportTypeUtils fitnessSportTypeUtils = FitnessSportTypeUtils.INSTANCE;
        SportBasicReport sportBasicReport = this.mBasicReport;
        fitnessSportTypeUtils.supportsDynamicTrace(sportBasicReport != null ? Integer.valueOf(sportBasicReport.getSportType()) : null);
        return this.isGpsPathValid && z2;
    }
}
