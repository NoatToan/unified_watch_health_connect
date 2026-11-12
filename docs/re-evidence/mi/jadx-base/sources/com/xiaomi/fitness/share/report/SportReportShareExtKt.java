package com.xiaomi.fitness.share.report;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.transform.RoundedCornersTransformation;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.util.UrlConstants;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.view.DataCircleStickerView;
import com.xiaomi.fitness.detail.view.DistanceStepStickerView;
import com.xiaomi.fitness.detail.view.KcalStickerCircleView;
import com.xiaomi.fitness.detail.view.KcalStickerKmView;
import com.xiaomi.fitness.detail.view.KcalStickerRecentView;
import com.xiaomi.fitness.detail.view.NormalHrMaxMinStickerView;
import com.xiaomi.fitness.detail.view.NormalHrRecentStickerView;
import com.xiaomi.fitness.detail.view.NormalStickerCaloriesView;
import com.xiaomi.fitness.detail.view.NormalStickerImageView;
import com.xiaomi.fitness.detail.view.NormalStickerSportView;
import com.xiaomi.fitness.detail.view.NormalStickerTimeView;
import com.xiaomi.fitness.detail.view.SpeedStickerView;
import com.xiaomi.fitness.detail.view.StepWeekStickerView;
import com.xiaomi.fitness.detail.view.StickerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.training_plan.report.CustomerTrainPlanReportShareFragment;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.hoi;
import defpackage.im9;
import defpackage.j1j;
import defpackage.kfi;
import defpackage.nuf;
import defpackage.o3r;
import defpackage.opi;
import defpackage.s4m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0018\u001a\u00020\u00112\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004¢\u0006\u0004\b)\u0010\u0007\u001a\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004¢\u0006\u0004\b*\u0010\u0007\u001a\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004¢\u0006\u0004\b+\u0010\u0007\u001a\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020 0\u0004¢\u0006\u0004\b,\u0010\u0007\u001a\u0015\u0010.\u001a\u00020 2\u0006\u0010-\u001a\u00020 ¢\u0006\u0004\b.\u0010/\u001a\u0017\u00101\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0005H\u0002¢\u0006\u0004\b1\u00102\u001a\u0010\u00103\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b3\u00104\u001a\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020605¢\u0006\u0004\b7\u00108\u001a\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b9\u0010\u0007\u001a\u0011\u0010:\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b:\u0010\u0003\u001a\u0011\u0010;\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b;\u0010\u0003\u001a\u0011\u0010<\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b<\u0010\u0003\u001a\u0011\u0010=\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b=\u0010\u0003\u001a%\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\u0006\u0010%\u001a\u00020$2\b\u0010>\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b@\u0010A\u001a\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020?0\u00042\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bB\u0010C\u001a\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020?0\u00042\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bD\u0010C\u001a\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020?0\u00042\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bE\u0010C\u001a\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020?0\u00042\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bF\u0010C\u001a\u0011\u0010G\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bG\u0010H\u001a\u000f\u0010I\u001a\u00020\u0001H\u0002¢\u0006\u0004\bI\u0010J\u001a-\u0010Q\u001a\u00020\u00112\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020 2\u0006\u0010P\u001a\u00020 ¢\u0006\u0004\bQ\u0010R\u001a1\u0010X\u001a\u00020\u00112\u0006\u0010S\u001a\u00020M2\u0006\u0010T\u001a\u00020\u001c2\b\b\u0002\u0010V\u001a\u00020U2\b\b\u0002\u0010W\u001a\u00020\u0001¢\u0006\u0004\bX\u0010Y\u001a\u0017\u0010Z\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\u001cH\u0002¢\u0006\u0004\bZ\u0010[\u001a)\u0010`\u001a\u00020\u0011*\u00020\\2\b\b\u0002\u0010]\u001a\u00020\u00012\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110^¢\u0006\u0004\b`\u0010a\u001a#\u0010d\u001a\u00020\u00112\u0006\u0010c\u001a\u00020b2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110^¢\u0006\u0004\bd\u0010e\u001a\u001f\u0010h\u001a\u00020\u00112\u0006\u0010L\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u000106¢\u0006\u0004\bh\u0010i\u001a#\u0010j\u001a\u00020\u00112\u0006\u0010c\u001a\u00020b2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110^¢\u0006\u0004\bj\u0010e\u001a\u001f\u0010k\u001a\u00020\u00112\u0006\u0010L\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u000106¢\u0006\u0004\bk\u0010i\u001a\u001f\u0010l\u001a\u00020\u00112\u0006\u0010L\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u000106¢\u0006\u0004\bl\u0010i\u001a\u001f\u0010m\u001a\u00020\u00112\u0006\u0010L\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u000106¢\u0006\u0004\bm\u0010i\u001a-\u0010s\u001a\u00020\u00112\u0006\u0010o\u001a\u00020n2\u0006\u0010p\u001a\u00020\\2\u0006\u0010q\u001a\u00020\u00052\u0006\u0010r\u001a\u00020\u0005¢\u0006\u0004\bs\u0010t\u001a-\u0010u\u001a\u00020\u00112\u0006\u0010o\u001a\u00020n2\u0006\u0010p\u001a\u00020\\2\u0006\u0010q\u001a\u00020\u00052\u0006\u0010r\u001a\u00020\u0005¢\u0006\u0004\bu\u0010t\u001a-\u0010v\u001a\u00020\u00112\u0006\u0010o\u001a\u00020n2\u0006\u0010p\u001a\u00020\\2\u0006\u0010q\u001a\u00020\u00052\u0006\u0010r\u001a\u00020\u0005¢\u0006\u0004\bv\u0010t\u001a\u001d\u0010w\u001a\u00020\u00112\u0006\u0010L\u001a\u00020f2\u0006\u0010p\u001a\u00020\\¢\u0006\u0004\bw\u0010x\u001a\u0017\u0010z\u001a\u0004\u0018\u0001062\u0006\u0010y\u001a\u00020\u0005¢\u0006\u0004\bz\u0010{\u001a\u0018\u0010\u007f\u001a\u0004\u0018\u00010~2\u0006\u0010}\u001a\u00020|¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010~2\u0006\u0010}\u001a\u00020|¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001\u001a@\u0010\u0085\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020|2&\u0010_\u001a\"\u0012\u0017\u0012\u0015\u0018\u000106¢\u0006\u000e\b\u0083\u0001\u0012\t\b\u0084\u0001\u0012\u0004\b\b(g\u0012\u0004\u0012\u00020\u00110\u0082\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a)\u0010\u0088\u0001\u001a\u00020\u00112\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\\2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110^¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0019\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0006\u0010%\u001a\u00020$¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0017\u0010\u008d\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0017\u0010\u008f\u0001\u001a\u00020\u00058\u0002X\u0082T¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001\"\u0017\u0010\u0090\u0001\u001a\u00020\u00058\u0002X\u0082T¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008e\u0001\"\u0017\u0010\u0091\u0001\u001a\u00020\u00058\u0002X\u0082T¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008e\u0001\"\u0017\u0010\u0092\u0001\u001a\u00020\u00058\u0002X\u0082T¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008e\u0001\"\u0017\u0010\u0093\u0001\u001a\u00020\u00058\u0002X\u0082T¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008e\u0001\"\u0017\u0010\u0094\u0001\u001a\u00020\u00058\u0002X\u0082T¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008e\u0001\"\u0017\u0010\u0095\u0001\u001a\u00020\u00058\u0002X\u0082T¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u008e\u0001\"\u0017\u0010\u0096\u0001\u001a\u00020\u00058\u0002X\u0082T¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u008e\u0001\"\u0017\u0010\u0097\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u008e\u0001\"\u0017\u0010\u0098\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u008e\u0001\"\u001b\u0010\u0099\u0001\u001a\u00020\u00018\u0006¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010J\"\u0017\u0010\u009c\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u008e\u0001\"\u0017\u0010\u009d\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u008e\u0001\"\u0017\u0010\u009e\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u008e\u0001\"\u0017\u0010\u009f\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u008e\u0001\"\u0017\u0010 \u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b \u0001\u0010\u008e\u0001\"\u0017\u0010¡\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b¡\u0001\u0010\u008e\u0001\"\u0017\u0010¢\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b¢\u0001\u0010\u008e\u0001\"\u0017\u0010£\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b£\u0001\u0010\u008e\u0001\"\u0017\u0010¤\u0001\u001a\u00020\u00058\u0006X\u0086T¢\u0006\b\n\u0006\b¤\u0001\u0010\u008e\u0001\"\u0017\u0010¥\u0001\u001a\u00020 8\u0006X\u0086T¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001¨\u0006§\u0001"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "", "supportsGps", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Z", "", "", "getAllRectangleBgDownloadUrls", "()Ljava/util/List;", "getAllSquareBgDownloadUrls", "getFontURLList", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "fragment", "Landroidx/lifecycle/MutableLiveData;", "downloadResourcesAndGetIfDoneLiveData", "(Lcom/xiaomi/fitness/baseui/view/BaseFragment;)Landroidx/lifecycle/MutableLiveData;", "srcUrl", "filePath", "", "downloadFileWithCancelCheck", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/Exception;", PluginDeviceInfo.FICONOFFLINE, "liveData", "handleException", "(Ljava/lang/Exception;Landroidx/lifecycle/MutableLiveData;)V", "Ljava/io/File;", "file", "Landroid/net/Uri;", "getUriFromFile", "(Ljava/io/File;)Landroid/net/Uri;", "isRectangle", "", "index", "getLocalBgUri", "(ZI)Landroid/net/Uri;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "getLocalFontType", "(Landroid/content/Context;I)Landroid/graphics/Typeface;", "getCustomizeSharePreviewUris", "getAllRectangleBgUriList", "getAllSquareBgUriList", "getBgIndexList", "position", "getIndexByPosition", "(I)I", "fileName", "checkIfResourceExists", "(Ljava/lang/String;)Z", "checkIfAllResourcesExist", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "Landroid/graphics/Bitmap;", "getCommonQrCodeBitmapLiveData", "()Landroidx/lifecycle/LiveData;", "getSloganList", "supportsHr", "supportsStep", "supportsDistance", "supportsDistanceAndHR", "sportReport", "Lcom/xiaomi/fitness/detail/view/StickerView;", "getStickerListToShow", "(Landroid/content/Context;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Ljava/util/List;", "getCommonStickers", "(Landroid/content/Context;)Ljava/util/List;", "getDistanceStickers", "getHrStickers", "getDistanceAndHrStickers", "getCroppedImgUri", "()Landroid/net/Uri;", "isMiuiGalleryInstalled", "()Z", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/widget/ImageView;", "bg", SportReportShareExtKt.KEY_ASPECT_X, SportReportShareExtKt.KEY_ASPECT_Y, "handleCroppedImage", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Landroid/widget/ImageView;II)V", "imageView", SportRecordBundleKey.BUNDLE_PARAM_URI, "", "cornerRadius", "deleteAfterLoad", "loadImgWithHardwareRenderingDisabled", "(Landroid/widget/ImageView;Landroid/net/Uri;FZ)V", "deleteImage", "(Landroid/net/Uri;)V", "Landroid/view/View;", "show", "Lkotlin/Function0;", "callback", "listenOnClickWithPressEffect", "(Landroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "checkExternalStoragePermissionIfNeed", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V", "Landroid/app/Activity;", "bitmap", "onBitmapDownload", "(Landroid/app/Activity;Landroid/graphics/Bitmap;)V", "checkSaveImageToGalleryPermission", "onBitmapShareToWechat", "onBitmapShareToMoments", "onBitmapShareViaMore", "Ls4m;", "shareComponent", "view", "title", "des", "onViewDownload", "(Ls4m;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V", "onViewShareToWechat", "onViewShareToMoments", "onViewShareViaMore", "(Landroid/app/Activity;Landroid/view/View;)V", "bitmapUriStr", "getBitmapByUriStr", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "Landroidx/viewpager2/widget/ViewPager2;", "shareViewPager", "Landroidx/cardview/widget/CardView;", "findCurtCardViewInShareViewViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)Landroidx/cardview/widget/CardView;", "findJustDanceCardViewInShareViewViewPager", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "generateShareBitmapFromShareViewPager", "(Landroidx/viewpager2/widget/ViewPager2;Lkotlin/jvm/functions/Function1;)V", "cardView", "checkCardViewExistAndShareIfNeed", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView$o;", "getLinearOrFlexBoxLayoutManager", "(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$o;", "TAG", "Ljava/lang/String;", "ACTION_CROP", "KEY_CROP", "KEY_ASPECT_X", "KEY_ASPECT_Y", "KEY_RETURN_DATA", "MIUI_GALLERY_PACKAGE", "TYPE_IMAGES", "KEY_SCALE", "DEFAULT_SPORT_SHARE_FILE_NAME", "COMPACT_TRACE_FILE_NAME", "shouldUserMiuiGallery", "Z", "getShouldUserMiuiGallery", "KEY_SPORT_REPORT", "KEY_BITMAP_URI_STR", "KEY_SHOW_MAP", "KEY_DEFAULT_TAB_POSITION", CustomerTrainPlanReportShareFragment.TAG_DEFAULT_SHARE_VIEW_PAGER, "TAG_CUSTOMIZE_SHARE_VIEW_PAGER", "TAG_JUST_DANCE_SONGS_CUSTOMIZE_SHARE_VIEW_PAGER", "TAG_DYNAMIC_TRACE_SPORT_PATH_VIEW", "TAG_COMPACT_PATH_SPORT_PATH_VIEW", "CARD_RADIUS_IN_DP", "I", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportReportShareExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportReportShareExt.kt\ncom/xiaomi/fitness/share/report/SportReportShareExtKt\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,780:1\n54#2,3:781\n24#2:784\n59#2,4:785\n63#2,2:800\n489#3,11:789\n*S KotlinDebug\n*F\n+ 1 SportReportShareExt.kt\ncom/xiaomi/fitness/share/report/SportReportShareExtKt\n*L\n582#1:781,3\n582#1:784\n582#1:785,4\n582#1:800,2\n587#1:789,11\n*E\n"})
public final class SportReportShareExtKt {

    @NotNull
    private static final String ACTION_CROP = "com.android.camera.action.CROP";
    public static final int CARD_RADIUS_IN_DP = 8;

    @NotNull
    public static final String COMPACT_TRACE_FILE_NAME = "compact_trace.jpg";

    @NotNull
    public static final String DEFAULT_SPORT_SHARE_FILE_NAME = "default_share.jpg";

    @NotNull
    private static final String KEY_ASPECT_X = "aspectX";

    @NotNull
    private static final String KEY_ASPECT_Y = "aspectY";

    @NotNull
    public static final String KEY_BITMAP_URI_STR = "bitmap_uri_str";

    @NotNull
    private static final String KEY_CROP = "crop";

    @NotNull
    public static final String KEY_DEFAULT_TAB_POSITION = "default_tab_position";

    @NotNull
    private static final String KEY_RETURN_DATA = "return-data";

    @NotNull
    private static final String KEY_SCALE = "scale";

    @NotNull
    public static final String KEY_SHOW_MAP = "show_map";

    @NotNull
    public static final String KEY_SPORT_REPORT = "sport_report";

    @NotNull
    private static final String MIUI_GALLERY_PACKAGE = "com.miui.gallery";

    @NotNull
    public static final String TAG = "SportReportShareExt";

    @NotNull
    public static final String TAG_COMPACT_PATH_SPORT_PATH_VIEW = "compact_path_sport_path_view";

    @NotNull
    public static final String TAG_CUSTOMIZE_SHARE_VIEW_PAGER = "customize_share_view_pager";

    @NotNull
    public static final String TAG_DEFAULT_SHARE_VIEW_PAGER = "default_share_view_pager";

    @NotNull
    public static final String TAG_DYNAMIC_TRACE_SPORT_PATH_VIEW = "dynamic_trace_sport_path_view";

    @NotNull
    public static final String TAG_JUST_DANCE_SONGS_CUSTOMIZE_SHARE_VIEW_PAGER = "just_dance_customize_share_view_pager";

    @NotNull
    private static final String TYPE_IMAGES = "image/*";
    private static final boolean shouldUserMiuiGallery;

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.report.SportReportShareExtKt$checkIfAllResourcesExist$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.report.SportReportShareExtKt$checkIfAllResourcesExist$2", f = "SportReportShareExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSportReportShareExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportReportShareExt.kt\ncom/xiaomi/fitness/share/report/SportReportShareExtKt$checkIfAllResourcesExist$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,780:1\n1734#2,3:781\n*S KotlinDebug\n*F\n+ 1 SportReportShareExt.kt\ncom/xiaomi/fitness/share/report/SportReportShareExtKt$checkIfAllResourcesExist$2\n*L\n365#1:781,3\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ List<String> $filePaths;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<String> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$filePaths = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$filePaths, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<String> list = this.$filePaths;
            boolean z = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!new File((String) it.next()).exists()) {
                        z = false;
                        break;
                    }
                }
            }
            return Boxing.boxBoolean(z);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.report.SportReportShareExtKt$downloadFileWithCancelCheck$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.report.SportReportShareExtKt", f = "SportReportShareExt.kt", i = {0}, l = {215}, m = "downloadFileWithCancelCheck", n = {"srcUrl"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportReportShareExtKt.downloadFileWithCancelCheck(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.report.SportReportShareExtKt$downloadFileWithCancelCheck$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.report.SportReportShareExtKt$downloadFileWithCancelCheck$2", f = "SportReportShareExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29352 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
        final /* synthetic */ String $filePath;
        final /* synthetic */ String $srcUrl;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29352(String str, String str2, Continuation<? super C29352> continuation) {
            super(2, continuation);
            this.$srcUrl = str;
            this.$filePath = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29352 c29352 = new C29352(this.$srcUrl, this.$filePath, continuation);
            c29352.L$0 = obj;
            return c29352;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            InputStream inputStreamOpenStream = new URL(this.$srcUrl).openStream();
            String str = this.$filePath;
            try {
                CoroutineScopeKt.ensureActive(coroutineScope);
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                try {
                    CoroutineScopeKt.ensureActive(coroutineScope);
                    Intrinsics.checkNotNull(inputStreamOpenStream);
                    long jCopyTo$default = ByteStreamsKt.copyTo$default(inputStreamOpenStream, fileOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    Long lBoxLong = Boxing.boxLong(jCopyTo$default);
                    CloseableKt.closeFinally(inputStreamOpenStream, null);
                    return lBoxLong;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(inputStreamOpenStream, th3);
                    throw th4;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
            return ((C29352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.report.SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.report.SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1", f = "SportReportShareExt.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableLiveData<Boolean> $downloadDoneLiveData;
        final /* synthetic */ BaseFragment $fragment;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.share.report.SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.share.report.SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1", f = "SportReportShareExt.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nSportReportShareExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportReportShareExt.kt\ncom/xiaomi/fitness/share/report/SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,780:1\n1567#2:781\n1598#2,4:782\n*S KotlinDebug\n*F\n+ 1 SportReportShareExt.kt\ncom/xiaomi/fitness/share/report/SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1\n*L\n173#1:781\n173#1:782,4\n*E\n"})
        public static final class C07361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<String> $allResources;
            final /* synthetic */ MutableLiveData<Boolean> $downloadDoneLiveData;
            final /* synthetic */ String $outputDirPath;
            final /* synthetic */ List<String> $rectangleBgUrls;
            final /* synthetic */ List<String> $squareBgUrls;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07361(List<String> list, MutableLiveData<Boolean> mutableLiveData, List<String> list2, List<String> list3, String str, Continuation<? super C07361> continuation) {
                super(2, continuation);
                this.$allResources = list;
                this.$downloadDoneLiveData = mutableLiveData;
                this.$rectangleBgUrls = list2;
                this.$squareBgUrls = list3;
                this.$outputDirPath = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07361 c07361 = new C07361(this.$allResources, this.$downloadDoneLiveData, this.$rectangleBgUrls, this.$squareBgUrls, this.$outputDirPath, continuation);
                c07361.L$0 = obj;
                return c07361;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    List<String> list = this.$allResources;
                    List<String> list2 = this.$rectangleBgUrls;
                    List<String> list3 = this.$squareBgUrls;
                    String str = this.$outputDirPath;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    int i2 = 0;
                    for (Object obj2 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1(i2, list2, list3, (String) obj2, str, null), 2, null));
                        i2 = i3;
                    }
                    this.label = 1;
                    if (AwaitKt.awaitAll(arrayList, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.$downloadDoneLiveData.postValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29361(MutableLiveData<Boolean> mutableLiveData, BaseFragment baseFragment, Continuation<? super C29361> continuation) {
            super(2, continuation);
            this.$downloadDoneLiveData = mutableLiveData;
            this.$fragment = baseFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29361(this.$downloadDoneLiveData, this.$fragment, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List allRectangleBgDownloadUrls = SportReportShareExtKt.getAllRectangleBgDownloadUrls();
                    List allSquareBgDownloadUrls = SportReportShareExtKt.getAllSquareBgDownloadUrls();
                    C07361 c07361 = new C07361(CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Collection) allRectangleBgDownloadUrls, (Iterable) allSquareBgDownloadUrls), (Iterable) SportReportShareExtKt.getFontURLList()), this.$downloadDoneLiveData, allRectangleBgDownloadUrls, allSquareBgDownloadUrls, im9.L(), null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(c07361, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                SportReportShareExtKt.handleException(e, this.$downloadDoneLiveData);
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), j1j.common_download_fail);
            } finally {
                this.$fragment.hideLoading();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.report.SportReportShareExtKt$getCommonQrCodeBitmapLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.report.SportReportShareExtKt$getCommonQrCodeBitmapLiveData$1", f = "SportReportShareExt.kt", i = {}, l = {384}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29371 extends SuspendLambda implements Function2<LiveDataScope<Bitmap>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $qrCodeBitmap;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29371(Bitmap bitmap, Continuation<? super C29371> continuation) {
            super(2, continuation);
            this.$qrCodeBitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29371 c29371 = new C29371(this.$qrCodeBitmap, continuation);
            c29371.L$0 = obj;
            return c29371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Bitmap> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C29371) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                Bitmap bitmap = this.$qrCodeBitmap;
                Intrinsics.checkNotNull(bitmap);
                this.label = 1;
                if (liveDataScope.emit(bitmap, this) == coroutine_suspended) {
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
    }

    static {
        shouldUserMiuiGallery = RomUtils.isXiaomi() && isMiuiGalleryInstalled();
    }

    public static final void checkCardViewExistAndShareIfNeed(@Nullable View view, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (view == null) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), j1j.N1);
        } else {
            callback.invoke();
        }
    }

    public static final void checkExternalStoragePermissionIfNeed(@NotNull FragmentActivity fragmentActivity, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke();
    }

    @Nullable
    public static final Object checkIfAllResourcesExist(@NotNull Continuation<? super Boolean> continuation) {
        String strL = im9.L();
        int size = getAllRectangleBgDownloadUrls().size();
        int size2 = getAllSquareBgDownloadUrls().size();
        int size3 = getFontURLList().size();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        if (1 <= size2) {
            int i2 = 1;
            while (true) {
                arrayList.add(new File(strL).getAbsolutePath() + File.separator + "square-" + i2 + ".webp");
                if (i2 == size2) {
                    break;
                }
                i2++;
            }
        }
        if (1 <= size) {
            int i3 = 1;
            while (true) {
                arrayList.add(new File(strL).getAbsolutePath() + File.separator + "rectangle-" + i3 + ".webp");
                if (i3 == size) {
                    break;
                }
                i3++;
            }
        }
        if (1 <= size3) {
            while (true) {
                arrayList.add(new File(strL).getAbsolutePath() + File.separator + "misanslatin-" + i + ".otf");
                if (i == size3) {
                    break;
                }
                i++;
            }
        }
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(arrayList, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkIfResourceExists(String str) {
        return new File(new File(im9.L()).getAbsolutePath() + File.separator + str).exists();
    }

    public static final void checkSaveImageToGalleryPermission(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        if (Build.VERSION.SDK_INT < 29) {
            Logger.i(TAG, "checkExternalStoragePermissionIfNeed low version. permission needed");
            PermissionExtKt.permissions$default(fragmentActivity, (String[]) Arrays.copyOf(strArr, 1), (String[]) null, new Function1() { // from class: fzn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportReportShareExtKt.checkSaveImageToGalleryPermission$lambda$11(callback, fragmentActivity, (MultiplePermissionsBuilder) obj);
                }
            }, 2, (Object) null);
        } else {
            Logger.i(TAG, "checkExternalStoragePermissionIfNeed high version. No permission needed");
            callback.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkSaveImageToGalleryPermission$lambda$11(final Function0 callback, final FragmentActivity fragmentActivity, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: zyn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportReportShareExtKt.checkSaveImageToGalleryPermission$lambda$11$lambda$8(callback);
            }
        });
        permissions.denied(new Function1() { // from class: azn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportReportShareExtKt.checkSaveImageToGalleryPermission$lambda$11$lambda$10(fragmentActivity, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkSaveImageToGalleryPermission$lambda$11$lambda$10(final FragmentActivity fragmentActivity, final List it) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "checkExternalStoragePermissionIfNeed denied");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) it.get(0), fragmentActivity, null, null, null, new Function0() { // from class: gzn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportReportShareExtKt.checkSaveImageToGalleryPermission$lambda$11$lambda$10$lambda$9(fragmentActivity, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkSaveImageToGalleryPermission$lambda$11$lambda$10$lambda$9(FragmentActivity fragmentActivity, List it) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(it, "$it");
        PermissionsUtil.showSettingDialog$default(PermissionsUtil.INSTANCE, fragmentActivity, (String) it.get(0), true, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkSaveImageToGalleryPermission$lambda$11$lambda$8(Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke();
        Logger.i(TAG, "checkExternalStoragePermissionIfNeed allGranted");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteImage(Uri uri) {
        try {
            Logger.i(TAG, "deleteImage succeeded. rowDeleted=" + ApplicationExtKt.getApplication().getContentResolver().delete(uri, null, null));
        } catch (Exception e) {
            Logger.i(TAG, "deleteImage failed. error=" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object downloadFileWithCancelCheck(String str, String str2, Continuation<? super Unit> continuation) throws Exception {
        AnonymousClass1 anonymousClass1;
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
        Object objWithContext = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C29352 c29352 = new C29352(str, str2, null);
                anonymousClass1.L$0 = str;
                anonymousClass1.label = 1;
                objWithContext = BuildersKt.withContext(io2, c29352, anonymousClass1);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objWithContext);
            }
            ((Number) objWithContext).longValue();
            return Unit.INSTANCE;
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                Logger.i(TAG, "Download cancelled for " + str);
                throw e;
            }
            Logger.e(TAG, "Download failed for " + str + ": " + e.getMessage());
            throw new ResourceDownloadException("Failed to download " + str, e);
        }
    }

    @NotNull
    public static final MutableLiveData<Boolean> downloadResourcesAndGetIfDoneLiveData(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        PageState.DefaultImpls.showLoading$default(fragment, null, 0, true, 3, null);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C29361(mutableLiveData, fragment, null), 3, null);
        return mutableLiveData;
    }

    @Nullable
    public static final CardView findCurtCardViewInShareViewViewPager(@NotNull ViewPager2 shareViewPager) {
        Intrinsics.checkNotNullParameter(shareViewPager, "shareViewPager");
        ViewPager2 viewPager2 = (ViewPager2) shareViewPager.findViewWithTag("customize_share_view_pager");
        if (viewPager2 != null) {
            return (CardView) viewPager2.findViewWithTag(Integer.valueOf(viewPager2.getCurrentItem()));
        }
        return null;
    }

    @Nullable
    public static final CardView findJustDanceCardViewInShareViewViewPager(@NotNull ViewPager2 shareViewPager) {
        Intrinsics.checkNotNullParameter(shareViewPager, "shareViewPager");
        ViewPager2 viewPager2 = (ViewPager2) shareViewPager.findViewWithTag(TAG_JUST_DANCE_SONGS_CUSTOMIZE_SHARE_VIEW_PAGER);
        if (viewPager2 != null) {
            return (CardView) viewPager2.findViewWithTag(Integer.valueOf(viewPager2.getCurrentItem()));
        }
        return null;
    }

    public static final void generateShareBitmapFromShareViewPager(@NotNull ViewPager2 shareViewPager, @NotNull final Function1<? super Bitmap, Unit> callback) {
        Intrinsics.checkNotNullParameter(shareViewPager, "shareViewPager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((SportPathMapView) shareViewPager.findViewWithTag(TAG_DYNAMIC_TRACE_SPORT_PATH_VIEW)).createShareBitmap(new Function2() { // from class: czn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SportReportShareExtKt.generateShareBitmapFromShareViewPager$lambda$13(callback, (Uri) obj, (Bitmap) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateShareBitmapFromShareViewPager$lambda$13(Function1 callback, Uri uri, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> getAllRectangleBgDownloadUrls() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_1);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_2);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_3);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_4);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_5);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_6);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_7);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_8);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_9);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_10);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_11);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_12);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_13);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_14);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_15);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_16);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_17);
        arrayList.add(SportReportShareConstants.URL_RECTANGLE_18);
        return arrayList;
    }

    @NotNull
    public static final List<Uri> getAllRectangleBgUriList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 18; i++) {
            arrayList.add(getLocalBgUri(true, i));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> getAllSquareBgDownloadUrls() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SportReportShareConstants.URL_SQUARE_1);
        arrayList.add(SportReportShareConstants.URL_SQUARE_2);
        arrayList.add(SportReportShareConstants.URL_SQUARE_3);
        arrayList.add(SportReportShareConstants.URL_SQUARE_4);
        arrayList.add(SportReportShareConstants.URL_SQUARE_5);
        arrayList.add(SportReportShareConstants.URL_SQUARE_6);
        arrayList.add(SportReportShareConstants.URL_SQUARE_7);
        arrayList.add(SportReportShareConstants.URL_SQUARE_8);
        arrayList.add(SportReportShareConstants.URL_SQUARE_9);
        arrayList.add(SportReportShareConstants.URL_SQUARE_10);
        arrayList.add(SportReportShareConstants.URL_SQUARE_11);
        arrayList.add(SportReportShareConstants.URL_SQUARE_12);
        arrayList.add(SportReportShareConstants.URL_SQUARE_13);
        arrayList.add(SportReportShareConstants.URL_SQUARE_14);
        arrayList.add(SportReportShareConstants.URL_SQUARE_15);
        arrayList.add(SportReportShareConstants.URL_SQUARE_16);
        arrayList.add(SportReportShareConstants.URL_SQUARE_17);
        arrayList.add(SportReportShareConstants.URL_SQUARE_18);
        return arrayList;
    }

    @NotNull
    public static final List<Uri> getAllSquareBgUriList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 18; i++) {
            arrayList.add(getLocalBgUri(false, i));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> getBgIndexList() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{15, 4, 6, 9, 1, 2});
    }

    @Nullable
    public static final Bitmap getBitmapByUriStr(@NotNull String bitmapUriStr) {
        Intrinsics.checkNotNullParameter(bitmapUriStr, "bitmapUriStr");
        try {
            Uri uri = Uri.parse(bitmapUriStr);
            String path = uri.getPath();
            Logger.i(TAG, "onViewCreated uri=" + uri + " uriPath=" + path);
            return BitmapFactory.decodeFile(path);
        } catch (Exception e) {
            Logger.i(TAG, "getBitmapByUriStr failed. exception=" + e);
            return null;
        }
    }

    @NotNull
    public static final LiveData<Bitmap> getCommonQrCodeBitmapLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C29371(kfi.b(UrlConstants.INSTANCE.getQRCodeDownloadHtmlUrl(), ExtUtilsKt.getDp(80), -16777216, -1, BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), hoi.x)), null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<StickerView> getCommonStickers(Context context) {
        int i = 2;
        return CollectionsKt__CollectionsKt.listOf((Object[]) new StickerView[]{new NormalStickerTimeView(context, null, i, 0 == true ? 1 : 0), new NormalStickerCaloriesView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new NormalStickerSportView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new NormalStickerImageView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0)});
    }

    private static final Uri getCroppedImgUri() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", "cropped_image_" + System.currentTimeMillis() + ".jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_DCIM + File.separator + "SportReportShare");
        return im9.N() ? ApplicationExtKt.getApplication().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) : ApplicationExtKt.getApplication().getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValues);
    }

    @NotNull
    public static final List<Uri> getCustomizeSharePreviewUris() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getLocalBgUri(true, 15));
        arrayList.add(getLocalBgUri(true, 4));
        arrayList.add(getLocalBgUri(true, 6));
        arrayList.add(getLocalBgUri(false, 9));
        arrayList.add(getLocalBgUri(false, 1));
        arrayList.add(getLocalBgUri(false, 2));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<StickerView> getDistanceAndHrStickers(Context context) {
        int i = 2;
        return CollectionsKt__CollectionsKt.listOf((Object[]) new StickerView[]{new KcalStickerRecentView(context, null, i, 0 == true ? 1 : 0), new KcalStickerCircleView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new KcalStickerKmView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new SpeedStickerView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<StickerView> getDistanceStickers(Context context) {
        int i = 2;
        return CollectionsKt__CollectionsKt.listOf((Object[]) new StickerView[]{new DataCircleStickerView(context, null, i, 0 == true ? 1 : 0), new DistanceStepStickerView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> getFontURLList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SportReportShareConstants.URL_FONT_REGULAR);
        arrayList.add(SportReportShareConstants.URL_FONT_ROCKNESS);
        arrayList.add(SportReportShareConstants.URL_FONT_GILROY_BLACK);
        arrayList.add(SportReportShareConstants.URL_FONT_ITALIC);
        arrayList.add(SportReportShareConstants.URL_FONT_YUN_DONG);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<StickerView> getHrStickers(Context context) {
        int i = 2;
        return CollectionsKt__CollectionsKt.listOf((Object[]) new StickerView[]{new NormalHrRecentStickerView(context, null, i, 0 == true ? 1 : 0), new NormalHrMaxMinStickerView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new StepWeekStickerView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0)});
    }

    public static final int getIndexByPosition(int i) {
        if (i == 0) {
            return 15;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 6;
        }
        if (i == 3) {
            return 9;
        }
        if (i != 4) {
            return i != 5 ? 0 : 2;
        }
        return 1;
    }

    @NotNull
    public static final RecyclerView.o getLinearOrFlexBoxLayoutManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = UIUtils.INSTANCE.getScreenState() == 0;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
        flexboxLayoutManager.T(1);
        flexboxLayoutManager.U(0);
        return z ? flexboxLayoutManager : new LinearLayoutManager(context, 0, false);
    }

    @NotNull
    public static final Uri getLocalBgUri(boolean z, int i) {
        StringBuilder sb;
        String str;
        String strL = im9.L();
        int i2 = i + 1;
        if (z) {
            sb = new StringBuilder();
            str = "rectangle-";
        } else {
            sb = new StringBuilder();
            str = "square-";
        }
        sb.append(str);
        sb.append(i2);
        sb.append(".webp");
        String string = sb.toString();
        return getUriFromFile(new File(new File(strL).getAbsolutePath() + File.separator + string));
    }

    @NotNull
    public static final Typeface getLocalFontType(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        String absolutePath = new File(im9.L()).getAbsolutePath();
        String str = File.separator;
        String str2 = absolutePath + str + ("misanslatin-" + (i + 1) + ".otf");
        if (!new File(str2).exists()) {
            Typeface typefaceAsResourceId = DisplayUtil.getTypefaceAsResourceId(context, opi.f29366a);
            Intrinsics.checkNotNull(typefaceAsResourceId);
            return typefaceAsResourceId;
        }
        try {
            return Typeface.createFromFile(str2);
        } catch (Exception unused) {
            Typeface typefaceAsResourceId2 = DisplayUtil.getTypefaceAsResourceId(context, opi.f29366a);
            Intrinsics.checkNotNull(typefaceAsResourceId2);
            return typefaceAsResourceId2;
        }
    }

    public static final boolean getShouldUserMiuiGallery() {
        return shouldUserMiuiGallery;
    }

    @NotNull
    public static final List<String> getSloganList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ResourceExtKt.getString(j1j.t2));
        arrayList.add(ResourceExtKt.getString(j1j.u2));
        arrayList.add(ResourceExtKt.getString(j1j.y2));
        arrayList.add(ResourceExtKt.getString(j1j.v2));
        arrayList.add(ResourceExtKt.getString(j1j.s2));
        arrayList.add(ResourceExtKt.getString(j1j.w2));
        arrayList.add(ResourceExtKt.getString(j1j.r2));
        arrayList.add(ResourceExtKt.getString(j1j.x2));
        return arrayList;
    }

    @NotNull
    public static final List<StickerView> getStickerListToShow(@NotNull Context context, @Nullable SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (sportBasicReport == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getCommonStickers(context));
        if (supportsDistanceAndHR(sportBasicReport)) {
            arrayList.addAll(getDistanceAndHrStickers(context));
        }
        if (supportsDistance(sportBasicReport)) {
            arrayList.addAll(getDistanceStickers(context));
        }
        if (supportsHr(sportBasicReport)) {
            arrayList.addAll(getHrStickers(context));
        }
        return arrayList;
    }

    private static final Uri getUriFromFile(File file) {
        Uri uriForFile = FileProvider.getUriForFile(ApplicationExtKt.getApplication(), im9.B(), file);
        Intrinsics.checkNotNull(uriForFile);
        return uriForFile;
    }

    public static final void handleCroppedImage(@NotNull final BaseActivity activity, @NotNull final ImageView bg, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bg, "bg");
        Intent data = new Intent(RomUtils.isXiaomi() ? "android.intent.action.PICK" : "android.intent.action.OPEN_DOCUMENT").setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        if (shouldUserMiuiGallery) {
            data.setPackage(MIUI_GALLERY_PACKAGE);
        }
        activity.startForActivityResult(data, new Function2() { // from class: bzn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SportReportShareExtKt.handleCroppedImage$lambda$2(activity, bg, i, i2, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleCroppedImage$lambda$2(final BaseActivity activity, final ImageView bg, int i, int i2, int i3, Intent intent) {
        Uri data;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(bg, "$bg");
        if (intent != null && (data = intent.getData()) != null) {
            Intent intent2 = new Intent(ACTION_CROP);
            intent2.setDataAndType(data, TYPE_IMAGES);
            intent2.addFlags(1);
            intent2.addFlags(2);
            intent2.putExtra(KEY_CROP, "true");
            intent2.putExtra(KEY_SCALE, true);
            intent2.putExtra(KEY_ASPECT_X, i);
            intent2.putExtra(KEY_ASPECT_Y, i2);
            intent2.putExtra(KEY_RETURN_DATA, false);
            final Uri croppedImgUri = getCroppedImgUri();
            Logger.i(TAG, "croppedImgUri=" + croppedImgUri);
            intent2.putExtra("output", croppedImgUri);
            if (shouldUserMiuiGallery) {
                intent2.setPackage(MIUI_GALLERY_PACKAGE);
            }
            try {
                activity.startForActivityResult(intent2, new Function2() { // from class: dzn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SportReportShareExtKt.handleCroppedImage$lambda$2$lambda$1(croppedImgUri, activity, bg, ((Integer) obj).intValue(), (Intent) obj2);
                    }
                });
            } catch (Exception e) {
                loadImgWithHardwareRenderingDisabled$default(bg, data, 0.0f, false, 12, null);
                Logger.i(TAG, "handleCroppedImage exception=" + e);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleCroppedImage$lambda$2$lambda$1(Uri uri, BaseActivity activity, ImageView bg, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(bg, "$bg");
        boolean z = intent != null;
        Logger.i(TAG, "handleCroppedImage cropBackResultCode=" + i + " cropped=" + z);
        if (uri == null) {
            ToastExtKt.toastShort(activity, j1j.common_load_fail);
        } else if (!z || i == 0) {
            Logger.i(TAG, "handleCroppedImage The user didn't crop any picture.");
        } else {
            loadImgWithHardwareRenderingDisabled$default(bg, uri, 0.0f, true, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleException(Exception exc, MutableLiveData<Boolean> mutableLiveData) {
        if (exc instanceof CancellationException) {
            Logger.i(TAG, "Download process cancelled");
            mutableLiveData.postValue(Boolean.FALSE);
            return;
        }
        if (!(exc instanceof ResourceDownloadException)) {
            Logger.e(TAG, "Unexpected error: " + exc.getMessage());
            mutableLiveData.postValue(Boolean.FALSE);
            return;
        }
        Throwable cause = exc.getCause();
        Logger.e(TAG, "Critical download failure: " + (cause != null ? cause.getMessage() : null));
        mutableLiveData.postValue(Boolean.FALSE);
    }

    private static final boolean isMiuiGalleryInstalled() {
        try {
            ApplicationExtKt.getApplication().getPackageManager().getPackageInfo(MIUI_GALLERY_PACKAGE, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final void listenOnClickWithPressEffect(@NotNull View view, boolean z, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (z) {
            nuf.f(view);
            ViewExtKt.clickWithTrigger$default(view, 0L, new Function1() { // from class: izn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportReportShareExtKt.listenOnClickWithPressEffect$lambda$6(callback, (View) obj);
                }
            }, 1, null);
        }
    }

    public static /* synthetic */ void listenOnClickWithPressEffect$default(View view, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        listenOnClickWithPressEffect(view, z, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenOnClickWithPressEffect$lambda$6(Function0 callback, View it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        callback.invoke();
        return Unit.INSTANCE;
    }

    public static final void loadImgWithHardwareRenderingDisabled(@NotNull ImageView imageView, @NotNull final Uri uri, float f, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(uri, "uri");
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(uri).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.allowHardware(false);
        builderTarget.transformations(new RoundedCornersTransformation(f));
        if (z) {
            builderTarget.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.share.report.SportReportShareExtKt$loadImgWithHardwareRenderingDisabled$lambda$5$$inlined$listener$default$1
                @Override // coil.request.ImageRequest.Listener
                public void onCancel(@NotNull ImageRequest request) {
                }

                @Override // coil.request.ImageRequest.Listener
                public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                    SportReportShareExtKt.deleteImage(uri);
                }

                @Override // coil.request.ImageRequest.Listener
                public void onStart(@NotNull ImageRequest request) {
                }

                @Override // coil.request.ImageRequest.Listener
                public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
                    SportReportShareExtKt.deleteImage(uri);
                }
            });
        }
        imageLoader.enqueue(builderTarget.build());
    }

    public static /* synthetic */ void loadImgWithHardwareRenderingDisabled$default(ImageView imageView, Uri uri, float f, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            f = ExtUtilsKt.getDp(8);
        }
        if ((i & 8) != 0) {
            z = false;
        }
        loadImgWithHardwareRenderingDisabled(imageView, uri, f, z);
    }

    public static final void onBitmapDownload(@NotNull final Activity activity, @Nullable final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        checkSaveImageToGalleryPermission((FragmentActivity) activity, new Function0() { // from class: hzn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportReportShareExtKt.onBitmapDownload$lambda$7(activity, bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBitmapDownload$lambda$7(Activity activity, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        ShareUtil.saveImageToGallery((BaseActivity) activity, bitmap);
        return Unit.INSTANCE;
    }

    public static final void onBitmapShareToMoments(@NotNull Activity activity, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (bitmap == null) {
            return;
        }
        o3r.i().v(activity, bitmap, "title", "des", o3r.k());
    }

    public static final void onBitmapShareToWechat(@NotNull Activity activity, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (bitmap == null) {
            return;
        }
        o3r.i().v(activity, bitmap, "title", "des", o3r.j());
    }

    public static final void onBitmapShareViaMore(@NotNull Activity activity, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (bitmap == null) {
            return;
        }
        ShareUtil.INSTANCE.shareBitmapViaMore(new WeakReference<>(activity), bitmap);
    }

    public static final void onViewDownload(@NotNull final s4m shareComponent, @NotNull final View view, @NotNull final String title, @NotNull final String des) {
        Intrinsics.checkNotNullParameter(shareComponent, "shareComponent");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(des, "des");
        if (shareComponent.f() == null || !(shareComponent.f() instanceof FragmentActivity)) {
            return;
        }
        Activity activityF = shareComponent.f();
        Intrinsics.checkNotNull(activityF, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        checkSaveImageToGalleryPermission((FragmentActivity) activityF, new Function0() { // from class: ezn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportReportShareExtKt.onViewDownload$lambda$12(shareComponent, title, des, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewDownload$lambda$12(s4m shareComponent, String title, String des, View view) {
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(des, "$des");
        Intrinsics.checkNotNullParameter(view, "$view");
        shareComponent.e(title, des, view);
        return Unit.INSTANCE;
    }

    public static final void onViewShareToMoments(@NotNull s4m shareComponent, @NotNull View view, @NotNull String title, @NotNull String des) {
        Intrinsics.checkNotNullParameter(shareComponent, "shareComponent");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(des, "des");
        shareComponent.v(title, des, view);
    }

    public static final void onViewShareToWechat(@NotNull s4m shareComponent, @NotNull View view, @NotNull String title, @NotNull String des) {
        Intrinsics.checkNotNullParameter(shareComponent, "shareComponent");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(des, "des");
        shareComponent.u(title, des, view);
    }

    public static final void onViewShareViaMore(@NotNull Activity activity, @NotNull View view) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(view, 0, 0, 6, null);
        ShareUtil shareUtil = ShareUtil.INSTANCE;
        shareUtil.shareBitmapViaMore(new WeakReference<>(activity), shareUtil.getRoundedCornerBitmap(bitmapLoadBitmapFromView$default, ExtUtilsKt.getDp(16)));
    }

    public static final boolean supportsDistance(@NotNull SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        Integer distance = sportBasicReport.getDistance();
        return distance != null && distance.intValue() > 0;
    }

    public static final boolean supportsDistanceAndHR(@NotNull SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        return supportsHr(sportBasicReport) && supportsDistance(sportBasicReport);
    }

    public static final boolean supportsGps(@Nullable SportBasicReport sportBasicReport) {
        if (sportBasicReport == null) {
            return false;
        }
        return FitnessSportTypeUtils.INSTANCE.supportGpsSport(sportBasicReport);
    }

    public static final boolean supportsHr(@NotNull SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        Integer avgHr = sportBasicReport.getAvgHr();
        return avgHr != null && avgHr.intValue() > 0;
    }

    public static final boolean supportsStep(@NotNull SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        Integer steps = sportBasicReport.getSteps();
        return steps != null && steps.intValue() > 0;
    }
}
