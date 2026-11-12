package com.xiaomi.fitness.watch.face;

import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.example.statistics.export.ScrollViewEffectiveExposeBiz;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceDetailIconAdapter;
import com.xiaomi.fitness.watch.face.adapter.FaceLabelAdapter;
import com.xiaomi.fitness.watch.face.adapter.FaceSuggestionAdapter;
import com.xiaomi.fitness.watch.face.data.FaceDeviceConfig;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.WatchFaceDao;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.edit.ui.FaceEditPreviewView;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.event.FaceInstallEvent;
import com.xiaomi.fitness.watch.face.event.FaceReSycEvent;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.FaceDownloadResultV2;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.fitness.watch.face.helper.FaceLowLatencyRequester;
import com.xiaomi.fitness.watch.face.helper.FacePreference;
import com.xiaomi.fitness.watch.face.request.FaceDetailResultV2;
import com.xiaomi.fitness.watch.face.request.FaceUserAction;
import com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModelKt;
import com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceDetailScrollView;
import com.xiaomi.fitness.watch.face.widget.FaceDialog;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.a4i;
import defpackage.av6;
import defpackage.gyi;
import defpackage.hx8;
import defpackage.iki;
import defpackage.im9;
import defpackage.isi;
import defpackage.ld8;
import defpackage.noi;
import defpackage.orf;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.tv1;
import defpackage.twi;
import defpackage.uw8;
import defpackage.wc0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 Ä\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002Ä\u0001B\b¢\u0006\u0005\bÃ\u0001\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u0011J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010\u0006J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u0010\u000eJ-\u00103\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000b2\u0014\u00102\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u00020\u000400H\u0002¢\u0006\u0004\b3\u00104J!\u00107\u001a\u00020\u00042\u0006\u00106\u001a\u0002052\b\b\u0002\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u00106\u001a\u0002052\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b9\u00108J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0004H\u0002¢\u0006\u0004\b>\u0010\u0006J\u0017\u0010@\u001a\u00020\u00042\u0006\u0010?\u001a\u000205H\u0002¢\u0006\u0004\b@\u0010AJ=\u0010I\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020D2\b\b\u0002\u0010G\u001a\u00020\u000b2\b\b\u0002\u0010H\u001a\u00020\u000bH\u0002¢\u0006\u0004\bI\u0010JJ+\u0010M\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010K\u001a\u00020B2\b\u0010L\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u001aH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0004H\u0002¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010T\u001a\u00020\u0004H\u0002¢\u0006\u0004\bT\u0010\u0006J+\u0010U\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010K\u001a\u00020B2\b\u0010L\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\bU\u0010NJ\u0019\u0010V\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0004H\u0002¢\u0006\u0004\bX\u0010\u0006J\u0017\u0010Y\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u000bH\u0002¢\u0006\u0004\bY\u0010\u000eJ\u000f\u0010Z\u001a\u00020\u0004H\u0002¢\u0006\u0004\bZ\u0010\u0006J\u000f\u0010[\u001a\u00020\u0004H\u0002¢\u0006\u0004\b[\u0010\u0006J\u000f\u0010\\\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\\\u0010\u0006J\u001c\u0010^\u001a\u0004\u0018\u0001052\b\b\u0002\u0010]\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0004H\u0002¢\u0006\u0004\b`\u0010\u0006J\u000f\u0010a\u001a\u00020BH\u0002¢\u0006\u0004\ba\u0010bJ\u001d\u0010e\u001a\u00020\u00042\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00040cH\u0002¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\u0004H\u0002¢\u0006\u0004\bg\u0010\u0006J\u0017\u0010i\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u001aH\u0002¢\u0006\u0004\bi\u0010#J\u000f\u0010j\u001a\u00020\u0004H\u0016¢\u0006\u0004\bj\u0010\u0006J\u000f\u0010k\u001a\u00020\u0004H\u0016¢\u0006\u0004\bk\u0010\u0006J!\u0010p\u001a\u00020\u00042\u0006\u0010m\u001a\u00020l2\b\u0010o\u001a\u0004\u0018\u00010nH\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010t\u001a\u00020\u00042\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\u0004H\u0014¢\u0006\u0004\bv\u0010\u0006J\u0019\u0010x\u001a\u00020\u00042\b\u0010w\u001a\u0004\u0018\u00010lH\u0016¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020\u0004H\u0014¢\u0006\u0004\bz\u0010\u0006J\u000f\u0010{\u001a\u00020\u0004H\u0016¢\u0006\u0004\b{\u0010\u0006J\u0017\u0010~\u001a\u00020\u00042\u0006\u0010}\u001a\u00020|H\u0016¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u0004H\u0014¢\u0006\u0005\b\u0080\u0001\u0010\u0006J\u0019\u0010\u0081\u0001\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u000bH\u0014¢\u0006\u0005\b\u0081\u0001\u0010\u000eJ\u0012\u0010\u0082\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J/\u0010\u0087\u0001\u001a\u00020\u00042\u0007\u0010\u0084\u0001\u001a\u00020\u001a2\u0007\u0010\u0085\u0001\u001a\u00020\u001a2\t\u0010\b\u001a\u0005\u0018\u00010\u0086\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020\u0004H\u0014¢\u0006\u0005\b\u0089\u0001\u0010\u0006J\u0011\u0010\u008a\u0001\u001a\u00020\u0004H\u0014¢\u0006\u0005\b\u008a\u0001\u0010\u0006J\u0011\u0010\u008b\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0005\b\u008b\u0001\u0010\u0006R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R+\u0010\u0094\u0001\u001a\r \u008f\u0001*\u0005\u0018\u00010\u008e\u00010\u008e\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0098\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0096\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0096\u0001R\u0019\u0010\u009e\u0001\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0098\u0001R\u0019\u0010\u009f\u0001\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0098\u0001R\u0019\u0010 \u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u009b\u0001R\u0019\u0010¡\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u009b\u0001R\u0019\u0010¢\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u009b\u0001R \u0010g\u001a\u00030£\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u0091\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u0096\u0001R\u0017\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u0096\u0001R\u0019\u0010¨\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u009b\u0001R\u0019\u0010©\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u009b\u0001R\u0019\u0010ª\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u009b\u0001R\u001f\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0019\u0010¯\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u009b\u0001R\u0019\u0010°\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0096\u0001R\u0018\u0010²\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001f\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0019\u0010¶\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010\u0096\u0001R\u0019\u0010·\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010\u0096\u0001R\u0018\u0010¹\u0001\u001a\u0004\u0018\u00010B8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010bR\u0019\u0010¼\u0001\u001a\u0004\u0018\u00010D8BX\u0082\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u0016\u0010¾\u0001\u001a\u00020B8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010bR\u0017\u0010¿\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010\u0083\u0001R\u0017\u0010Â\u0001\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001¨\u0006Å\u0001"}, d2 = {"Lcom/xiaomi/fitness/watch/face/FaceDetailFragment;", "Lcom/xiaomi/fitness/watch/face/FaceInfoBase;", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel;", "Lhx8;", "", "dismissProgressIfRebuild", "()V", "Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;", "data", "initDataView", "(Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;)V", "", "expand", "setTitleBar", "(Z)V", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "initDescText", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "initLabelList", "initAod", "initRecommendTab", "initIntroduction", "showPowerLevelDialog", "postAnimation", "", "ratio", "", "offset", "refreshPreview", "(FI)V", "initIconList", "faceData", "initBulletScreen", "index", "showBullet", "(I)V", "isTrail", "intentInstallOrUpdate", "resizeButtonGroup", "setCanPurchaseButton", "setVipButton", "setUninstallButton", "setCanUpgradeButton", "setCanEditButton", "setNormalHuamiButton", "setNormalButton", "requestPay", "installOrUpdate", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2;", "result", "requestDownload", "(ZLkotlin/jvm/functions/Function1;)V", "Ljava/io/File;", "file", "download", "(Ljava/io/File;Z)V", "doDownload", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel$DownloadRet;", Constants.KEY_PAY_RESULT_RET, "onDownload", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel$DownloadRet;)V", "onDownloadEnd", "zipFile", "unzipAndInstall", "(Ljava/io/File;)V", "", "path", "", "version", MediaStoreUtil.MediaInfo.SIZE, "needCheckStorage", "prepareOnly", "installBleFace", "(Ljava/lang/String;JJZZ)V", "id", "segmentLength", "doInstallFace", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "success", "code", "onBleInstallRet", "(ZI)V", "syncFace", "doDuplicate", "onM69LowStorage", "showFullDialog", "(Ljava/lang/String;)V", "onHuamiInstallSuccess", "onDelete", "finishInstall", "toDismissDialog", "onRealDismissDialog", "ignoreBin", "unzip", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestEdit", "getUnzipPath", "()Ljava/lang/String;", "Lkotlin/Function0;", "action", "checkConnect", "(Lkotlin/jvm/functions/Function0;)V", "trackExpose", "type", "trackClick", LifecycleConstantKt.ON_STOP, "onDestroyView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "setImageView", "v", "onClick", "(Landroid/view/View;)V", "setButton1", LifecycleConstantKt.ON_RESUME, "Lorf;", "event", "onMessageEvent", "(Lorf;)V", "setFace", "onFaceSet", "onBackPressed", "()Z", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "onActivityResult", "(IILandroid/content/Intent;)V", "onVisible", "onInvisible", LifecycleConstantKt.ON_DESTROY, "faceDataWrapper", "Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;", "Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "kotlin.jvm.PlatformType", "progressDialog$delegate", "Lkotlin/Lazy;", "getProgressDialog", "()Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "progressDialog", "debugFaceEdit", "Z", "license", "Ljava/lang/String;", "sign", "trialDuration", "I", "installing", "isPhotoFace", "templateId", "pageName", "pageSource", "utmSource", "positionId", "Lcom/example/statistics/export/ScrollViewEffectiveExposeBiz;", "trackExpose$delegate", "getTrackExpose", "()Lcom/example/statistics/export/ScrollViewEffectiveExposeBiz;", "touchAodDown", "headerHeight", "expandPathLength", "currentIconIndex", "", "Lcom/xiaomi/fitness/watch/face/request/FaceUserAction;", "userActionList", "Ljava/util/List;", "currentActionIndex", "userActionHasMore", "Landroid/os/Handler;", "userActionHandler", "Landroid/os/Handler;", "userActionRunnable", "Lkotlin/jvm/functions/Function0;", "bulletFirstVisible", "stackTop", "getFileHash", "fileHash", "getFileSize", "()Ljava/lang/Long;", "fileSize", "getRealFaceId", "realFaceId", "isLiteralFace", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceDetailFragment.kt\ncom/xiaomi/fitness/watch/face/FaceDetailFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1592:1\n54#2,3:1593\n24#2:1596\n59#2,6:1597\n54#2,3:1630\n24#2:1633\n59#2,6:1634\n295#3,2:1603\n360#3,7:1605\n1755#3,3:1612\n1782#3,4:1615\n360#3,7:1619\n1557#3:1626\n1628#3,3:1627\n1#4:1640\n*S KotlinDebug\n*F\n+ 1 FaceDetailFragment.kt\ncom/xiaomi/fitness/watch/face/FaceDetailFragment\n*L\n230#1:1593,3\n230#1:1596\n230#1:1597,6\n665#1:1630,3\n665#1:1633\n665#1:1634,6\n504#1:1603,2\n506#1:1605,7\n514#1:1612,3\n514#1:1615,4\n515#1:1619,7\n544#1:1626\n544#1:1627,3\n*E\n"})
public final class FaceDetailFragment extends Hilt_FaceDetailFragment<FaceDetailViewModel, hx8> {
    public static final int BIN_ID_INDEX_END = 49;
    public static final int BIN_ID_INDEX_START = 45;
    public static final int BIN_ID_OFFSET = 40;

    @NotNull
    public static final String FACE_PROGRESS_DIALOG_TAG = "face_progress_dialog_tag";

    @NotNull
    public static final String IS_PHOTO_FACE = "is_photo_face";

    @NotNull
    public static final String IS_RANDOM_PHOTO_FACE = "is_random_photo_face";

    @NotNull
    public static final String IS_TEMPLATE_PHOTO_FACE = "is_template_photo_face";

    @NotNull
    public static final String PAGE_NAME = "page_name";

    @NotNull
    public static final String PAGE_SOURCE = "page_source";

    @NotNull
    public static final String POSITION_ID = "position_id";

    @NotNull
    private static final String TAG = "FaceDetailFragment";

    @NotNull
    public static final String UTM_SOURCE = "utm_source";
    private boolean bulletFirstVisible;
    private int currentActionIndex;
    private int currentIconIndex;
    private boolean debugFaceEdit;
    private boolean expand;
    private int expandPathLength;

    @Nullable
    private FaceDetailResultV2 faceDataWrapper;
    private int headerHeight;
    private boolean installing;
    private boolean isPhotoFace;

    @Nullable
    private String license;

    @NotNull
    private String pageName;
    private int pageSource;
    private int positionId;

    /* JADX INFO: renamed from: progressDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressDialog;

    @Nullable
    private String sign;
    private boolean stackTop;

    @NotNull
    private String templateId;
    private boolean touchAodDown;

    /* JADX INFO: renamed from: trackExpose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trackExpose;
    private int trialDuration;

    @NotNull
    private final Handler userActionHandler;
    private boolean userActionHasMore;

    @NotNull
    private final List<FaceUserAction> userActionList;

    @NotNull
    private Function0<Unit> userActionRunnable;
    private int utmSource;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceDetailFragment$onHuamiInstallSuccess$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceDetailFragment$onHuamiInstallSuccess$1", f = "FaceDetailFragment.kt", i = {}, l = {1297}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33271(Continuation<? super C33271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceDetailFragment.this.new C33271(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel mDeviceModel = FaceDetailFragment.this.getMDeviceModel();
                String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
                WatchFace mInfo = FaceDetailFragment.this.getMInfo();
                String str = did + (mInfo != null ? mInfo.getId() : null);
                Long lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                WearableDeviceModel mDeviceModel2 = FaceDetailFragment.this.getMDeviceModel();
                String did2 = mDeviceModel2 != null ? mDeviceModel2.getDid() : null;
                WatchFace mInfo2 = FaceDetailFragment.this.getMInfo();
                String id = mInfo2 != null ? mInfo2.getId() : null;
                WatchFace mInfo3 = FaceDetailFragment.this.getMInfo();
                FaceCommonEntity faceCommonEntity = new FaceCommonEntity(str, lBoxLong, did2, id, mInfo3 != null ? mInfo3.getName() : null, null, null, null, null, null, 992, null);
                Logger.i(FaceDetailFragment.TAG, "save photo: " + faceCommonEntity);
                WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                this.label = 1;
                if (watchFaceDao.saveWatchFace(faceCommonEntity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ld8.c().l(new FaceInstallEvent());
            FaceDetailFragment faceDetailFragment = FaceDetailFragment.this;
            FaceManager faceManager = FaceManager.INSTANCE;
            WatchFace mInfo4 = faceDetailFragment.getMInfo();
            WatchFace face = faceManager.getFace(mInfo4 != null ? mInfo4.getId() : null);
            if (face == null) {
                face = FaceDetailFragment.this.getMInfo();
            }
            faceDetailFragment.setMInfo(face);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceDetailFragment$requestDownload$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceDetailFragment$requestDownload$1", f = "FaceDetailFragment.kt", i = {}, l = {938}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isTrail;
        final /* synthetic */ Function1<FaceDownloadResultV2, Unit> $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C33291(boolean z, Function1<? super FaceDownloadResultV2, Unit> function1, Continuation<? super C33291> continuation) {
            super(2, continuation);
            this.$isTrail = z;
            this.$result = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Function1 function1, FaceDownloadResultV2 faceDownloadResultV2) {
            function1.invoke2(faceDownloadResultV2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceDetailFragment.this.new C33291(this.$isTrail, this.$result, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WatchFace mInfo;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceDetailViewModel faceDetailViewModelAccess$getMViewModel = FaceDetailFragment.access$getMViewModel(FaceDetailFragment.this);
                String realFaceId = FaceDetailFragment.this.getRealFaceId();
                String id = (!FaceDetailFragment.this.isPhotoFace || (mInfo = FaceDetailFragment.this.getMInfo()) == null) ? null : mInfo.getId();
                boolean z = this.$isTrail;
                final Function1<FaceDownloadResultV2, Unit> function1 = this.$result;
                Function1<? super FaceDownloadResultV2, Unit> function2 = new Function1() { // from class: com.xiaomi.fitness.watch.face.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceDetailFragment.C33291.invokeSuspend$lambda$0(function1, (FaceDownloadResultV2) obj2);
                    }
                };
                this.label = 1;
                if (faceDetailViewModelAccess$getMViewModel.requestDownload(realFaceId, id, z, function2, this) == coroutine_suspended) {
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
            return ((C33291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceDetailFragment$requestEdit$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceDetailFragment$requestEdit$2", f = "FaceDetailFragment.kt", i = {}, l = {1435}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceDetailFragment$requestEdit$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceDetailFragment$requestEdit$2$1", f = "FaceDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ File $unzipFile;
            int label;
            final /* synthetic */ FaceDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FaceDetailFragment faceDetailFragment, File file, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = faceDetailFragment;
                this.$unzipFile = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$unzipFile, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.hideLoading();
                if (this.$unzipFile != null) {
                    FaceDetailFragment faceDetailFragment = this.this$0;
                    Bundle bundle = new Bundle();
                    FaceDetailFragment faceDetailFragment2 = this.this$0;
                    File file = this.$unzipFile;
                    FaceManager faceManager = FaceManager.INSTANCE;
                    WatchFace mInfo = faceDetailFragment2.getMInfo();
                    WatchFace face = faceManager.getFace(mInfo != null ? mInfo.getId() : null);
                    if (face == null) {
                        face = faceDetailFragment2.getMInfo();
                    }
                    bundle.putParcelable(FaceInfoBase.FACE_INFO, face);
                    bundle.putString(FaceEditFragment.FACE_UNZIP_PATH, file.getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                    BaseFragmentExKt.gotoPageForResult(faceDetailFragment, (Class<?>) FaceEditFragment.class, bundle, 10001);
                } else {
                    Context context = this.this$0.getContext();
                    if (context != null) {
                        ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
                    }
                    this.this$0.setButton1();
                    Logger.e(FaceDetailFragment.TAG, "request edit but unzip fail");
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceDetailFragment.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceDetailFragment faceDetailFragment = FaceDetailFragment.this;
                this.label = 1;
                obj = FaceDetailFragment.unzip$default(faceDetailFragment, false, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnyExtKt.main$default(null, new AnonymousClass1(FaceDetailFragment.this, (File) obj, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceDetailFragment$unzip$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceDetailFragment$unzip$2", f = "FaceDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33322 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        final /* synthetic */ boolean $ignoreBin;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33322(boolean z, Continuation<? super C33322> continuation) {
            super(2, continuation);
            this.$ignoreBin = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceDetailFragment.this.new C33322(this.$ignoreBin, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String did;
            String id;
            String fileHash;
            String did2;
            String id2;
            String did3;
            String id3;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FaceManager faceManager = FaceManager.INSTANCE;
            WearableDeviceModel mDeviceModel = FaceDetailFragment.this.getMDeviceModel();
            String str = "";
            if (mDeviceModel == null || (did = mDeviceModel.getDid()) == null) {
                did = "";
            }
            WatchFace mInfo = FaceDetailFragment.this.getMInfo();
            if (mInfo == null || (id = mInfo.getId()) == null) {
                id = "";
            }
            if (FaceDetailFragment.this.debugFaceEdit) {
                fileHash = "test";
            } else {
                fileHash = FaceDetailFragment.this.getFileHash();
                Intrinsics.checkNotNull(fileHash);
            }
            String watchFaceZipPath = faceManager.getWatchFaceZipPath(did, id, fileHash);
            boolean zExists = new File(watchFaceZipPath).exists();
            Logger.i(FaceDetailFragment.TAG, "unzip check " + watchFaceZipPath + " exist: " + zExists);
            if (!zExists) {
                return null;
            }
            DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
            WearableDeviceModel mDeviceModel2 = FaceDetailFragment.this.getMDeviceModel();
            if (mDeviceModel2 == null || (did2 = mDeviceModel2.getDid()) == null) {
                did2 = "";
            }
            WatchFace mInfo2 = FaceDetailFragment.this.getMInfo();
            if (mInfo2 == null || (id2 = mInfo2.getId()) == null) {
                id2 = "";
            }
            File fileCheckUnzipFiles = dialFileUtils.checkUnzipFiles(did2, id2, FaceDetailFragment.this.getFileHash(), this.$ignoreBin);
            if (fileCheckUnzipFiles != null) {
                return fileCheckUnzipFiles;
            }
            boolean zT = im9.T(watchFaceZipPath, FaceDetailFragment.this.getUnzipPath());
            WearableDeviceModel mDeviceModel3 = FaceDetailFragment.this.getMDeviceModel();
            if (mDeviceModel3 == null || (did3 = mDeviceModel3.getDid()) == null) {
                did3 = "";
            }
            WatchFace mInfo3 = FaceDetailFragment.this.getMInfo();
            if (mInfo3 != null && (id3 = mInfo3.getId()) != null) {
                str = id3;
            }
            File fileCheckUnzipFiles2 = dialFileUtils.checkUnzipFiles(did3, str, FaceDetailFragment.this.getFileHash(), this.$ignoreBin);
            Logger.i(FaceDetailFragment.TAG, "unzip file " + zT + ", target: " + (fileCheckUnzipFiles2 != null ? fileCheckUnzipFiles2.getPath() : null));
            return fileCheckUnzipFiles2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((C33322) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceDetailFragment$unzipAndInstall$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceDetailFragment$unzipAndInstall$1", f = "FaceDetailFragment.kt", i = {}, l = {1100}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceDetailFragment$unzipAndInstall$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceDetailFragment$unzipAndInstall$1$1", f = "FaceDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ File $unzipParentFile;
            int label;
            final /* synthetic */ FaceDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08051(File file, FaceDetailFragment faceDetailFragment, Continuation<? super C08051> continuation) {
                super(2, continuation);
                this.$unzipParentFile = file;
                this.this$0 = faceDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08051(this.$unzipParentFile, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Long version_code;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                File file = this.$unzipParentFile;
                File file2 = null;
                File[] fileArrListFiles = file != null ? file.listFiles() : null;
                if (this.$unzipParentFile != null && fileArrListFiles != null && fileArrListFiles.length != 0) {
                    Iterator it = ArrayIteratorKt.iterator(fileArrListFiles);
                    while (it.hasNext()) {
                        File file3 = (File) it.next();
                        String name = file3.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        if (StringsKt__StringsJVMKt.endsWith$default(name, ".bin", false, 2, null)) {
                            file2 = file3;
                            break;
                        }
                    }
                }
                if (file2 == null) {
                    Logger.e(FaceDetailFragment.TAG, "something error, bin not found");
                    Context context = this.this$0.getContext();
                    if (context != null) {
                        ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
                    }
                    this.this$0.toDismissDialog();
                    this.this$0.setButton1();
                } else {
                    this.this$0.getProgressDialog().setTitle(p1j.common_installing);
                    this.this$0.getProgressDialog().setProgress(!this.this$0.isLiteralFace() ? 1 : 0);
                    FaceDetailFragment faceDetailFragment = this.this$0;
                    String absolutePath = file2.getAbsolutePath();
                    FaceData mRequestData = this.this$0.getMRequestData();
                    long jLongValue = (mRequestData == null || (version_code = mRequestData.getVersion_code()) == null) ? 0L : version_code.longValue();
                    Long fileSize = this.this$0.getFileSize();
                    Intrinsics.checkNotNull(fileSize);
                    FaceDetailFragment.installBleFace$default(faceDetailFragment, absolutePath, jLongValue, fileSize.longValue(), false, false, 24, null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C33331(Continuation<? super C33331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceDetailFragment.this.new C33331(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceDetailFragment faceDetailFragment = FaceDetailFragment.this;
                this.label = 1;
                obj = faceDetailFragment.unzip(false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnyExtKt.main$default(null, new C08051((File) obj, FaceDetailFragment.this, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FaceDetailFragment() {
        super(ovi.g, tv1.d);
        this.progressDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: eq8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailFragment.progressDialog_delegate$lambda$0();
            }
        });
        this.templateId = "";
        this.pageName = "";
        this.trackExpose = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fq8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailFragment.trackExpose_delegate$lambda$1();
            }
        });
        this.userActionList = new ArrayList();
        this.userActionHasMore = true;
        this.userActionHandler = new Handler(Looper.getMainLooper());
        this.userActionRunnable = new Function0() { // from class: gq8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailFragment.userActionRunnable$lambda$27(this.f19230a);
            }
        };
        this.bulletFirstVisible = true;
        this.stackTop = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hx8 access$getMBinding(FaceDetailFragment faceDetailFragment) {
        return (hx8) faceDetailFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FaceDetailViewModel access$getMViewModel(FaceDetailFragment faceDetailFragment) {
        return (FaceDetailViewModel) faceDetailFragment.getMViewModel();
    }

    private final void checkConnect(Function0<Unit> action) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel != null && mDeviceModel.getIsDeviceConnected()) {
            action.invoke();
        } else {
            new CommonDialog.c("face_check_connect").setDialogTitle(p1j.q).setDialogDescription(p1j.p).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceDetailFragment.checkConnect.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        FaceDetailFragment.this.hideLoading();
                    } else {
                        if (which != -1) {
                            return;
                        }
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        Bundle bundle = new Bundle();
                        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
                        Context context = FaceDetailFragment.this.getContext();
                        if (context != null) {
                            MainExtKt.showMainActivity$default(context, null, bundle, 2, null);
                        }
                    }
                }
            }).showIfNeed(getChildFragmentManager());
            hideDelayLoading();
        }
    }

    private final void dismissProgressIfRebuild() {
        Fragment fragmentL0 = getParentFragmentManager().l0(FACE_PROGRESS_DIALOG_TAG);
        FaceDialog faceDialog = fragmentL0 instanceof FaceDialog ? (FaceDialog) fragmentL0 : null;
        Logger.d(TAG, "cache: " + faceDialog);
        if (faceDialog != null) {
            faceDialog.setProgress(0);
            faceDialog.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void doDownload(final File file, boolean isTrail) {
        setMDownloadFaceStartTime(System.currentTimeMillis());
        TextView installEditUpgrade = ((hx8) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
        ViewExtKt.gone(installEditUpgrade);
        TextView actionUseView = ((hx8) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
        ViewExtKt.gone(actionUseView);
        requestDownload(isTrail, new Function1() { // from class: qq8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDetailFragment.doDownload$lambda$39(this.f31741a, file, (FaceDownloadResultV2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit doDownload$lambda$39(final FaceDetailFragment this$0, File file, FaceDownloadResultV2 faceDownloadResultV2) {
        FaceDownloadResultV2.DownloadInfo download_info;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(file, "$file");
        String configFile = (faceDownloadResultV2 == null || (download_info = faceDownloadResultV2.getDownload_info()) == null) ? null : download_info.getConfigFile(((FaceDetailViewModel) this$0.getMViewModel()).getSupportZip());
        if (faceDownloadResultV2 != null && configFile != null) {
            this$0.license = faceDownloadResultV2.getLicense();
            this$0.sign = faceDownloadResultV2.getSign();
            this$0.trialDuration = faceDownloadResultV2.getTrailDuration();
            ((FaceDetailViewModel) this$0.getMViewModel()).downloadFace(configFile, file, this$0.getRealFaceId(), new Function1() { // from class: aq8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceDetailFragment.doDownload$lambda$39$lambda$38(this.f3351a, (FaceDetailViewModel.DownloadRet) obj);
                }
            });
            return Unit.INSTANCE;
        }
        this$0.toDismissDialog();
        this$0.setButton1();
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
        }
        ((hx8) this$0.getMBinding()).I.setEnabled(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doDownload$lambda$39$lambda$38(FaceDetailFragment this$0, FaceDetailViewModel.DownloadRet result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        this$0.onDownload(result);
        return Unit.INSTANCE;
    }

    private final void doDuplicate() {
        FaceData.BleExt ble_ext;
        FaceData mRequestData = getMRequestData();
        if (mRequestData == null || (ble_ext = mRequestData.getBle_ext()) == null || ble_ext.canEdit()) {
            return;
        }
        Logger.i(TAG, "doDuplicate cannot edit");
        setFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void doInstallFace(String path, String id, Integer segmentLength) {
        ((FaceDetailViewModel) getMViewModel()).doInstallFace(path, id, segmentLength, new Function1() { // from class: yq8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDetailFragment.doInstallFace$lambda$42(this.f40425a, (FaceDetailViewModel.FaceInstallRet) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doInstallFace$lambda$42(FaceDetailFragment this$0, FaceDetailViewModel.FaceInstallRet it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new FaceDetailFragment$doInstallFace$1$1(this$0, it, null), 1, null);
        return Unit.INSTANCE;
    }

    private final void download(final File file, final boolean isTrail) {
        DialogParams.DialogDescriptionString dialogDescriptionString;
        if (!NetworkExtKt.isNetworkAvailable()) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_hint_network_unavailable);
            }
            toDismissDialog();
            setButton1();
            return;
        }
        if (NetUtil.INSTANCE.isWifiCon(ApplicationExtKt.getApplication())) {
            doDownload(file, isTrail);
            return;
        }
        CommonDialog.c dialogTitle = new CommonDialog.c("face_download_not_wifi").setDialogTitle(p1j.j);
        Long fileSize = getFileSize();
        if ((fileSize != null ? fileSize.longValue() : 0L) > 0) {
            int i = p1j.n;
            Object[] objArr = new Object[1];
            Long fileSize2 = getFileSize();
            objArr[0] = Float.valueOf((fileSize2 != null ? fileSize2.longValue() : 0L) / 1048576.0f);
            dialogDescriptionString = new DialogParams.DialogDescriptionString(i, objArr);
        } else {
            dialogDescriptionString = new DialogParams.DialogDescriptionString(p1j.o, new Object[0]);
        }
        dialogTitle.setDialogDescriptionString(dialogDescriptionString).setCancelable(false).setCanceledOnBackPressed(false).setPositiveText(p1j.l).setNegativeText(p1j.x).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceDetailFragment.download.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    FaceDetailFragment.this.doDownload(file, isTrail);
                } else {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    FaceDetailFragment.access$getMViewModel(FaceDetailFragment.this).dismissProgress();
                    FaceDetailFragment.this.setButton1();
                }
            }
        }).showIfNeed(getChildFragmentManager());
    }

    public static /* synthetic */ void download$default(FaceDetailFragment faceDetailFragment, File file, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        faceDetailFragment.download(file, z);
    }

    private final void finishInstall() {
        String quantityString;
        Context context;
        toDismissDialog();
        FaceManager faceManager = FaceManager.INSTANCE;
        WatchFace mInfo = getMInfo();
        WatchFace face = faceManager.getFace(mInfo != null ? mInfo.getId() : null);
        if (face == null) {
            face = getMInfo();
        }
        setMInfo(face);
        Logger.i(TAG, "finishInstall");
        if (this.trialDuration == 0) {
            quantityString = getString(p1j.common_set_success);
        } else {
            Application application = ApplicationExtKt.getApplication();
            int i = gyi.i;
            int i2 = this.trialDuration;
            quantityString = ResourceExtKt.getQuantityString(application, i, i2, Integer.valueOf(i2));
        }
        Intrinsics.checkNotNull(quantityString);
        if (this.stackTop && (context = getContext()) != null) {
            ToastExtKt.toastShort(context, quantityString);
        }
        setButton1();
        this.installing = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getFileHash() {
        WatchFace mInfo = getMInfo();
        if (mInfo != null && mInfo.isLocalTestFace()) {
            return "designer";
        }
        if (((FaceDetailViewModel) getMViewModel()).getSupportZip()) {
            FaceData mRequestData = getMRequestData();
            if (mRequestData != null) {
                return mRequestData.getFile_hash_v2();
            }
        } else {
            FaceData mRequestData2 = getMRequestData();
            if (mRequestData2 != null) {
                return mRequestData2.getFile_hash();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Long getFileSize() {
        if (((FaceDetailViewModel) getMViewModel()).getSupportZip()) {
            FaceData mRequestData = getMRequestData();
            if (mRequestData != null) {
                return mRequestData.getFile_size_v2();
            }
            return null;
        }
        FaceData mRequestData2 = getMRequestData();
        if (mRequestData2 != null) {
            return Long.valueOf(mRequestData2.getFile_size());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRealFaceId() {
        if (this.isPhotoFace) {
            return this.templateId;
        }
        WatchFace mInfo = getMInfo();
        Intrinsics.checkNotNull(mInfo);
        return mInfo.getId();
    }

    private final ScrollViewEffectiveExposeBiz getTrackExpose() {
        return (ScrollViewEffectiveExposeBiz) this.trackExpose.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUnzipPath() {
        String strC = uw8.c();
        String str = File.separator;
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
        WatchFace mInfo = getMInfo();
        return strC + str + did + str + (mInfo != null ? mInfo.getId() : null) + str + getFileHash();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAod(final FaceData data) {
        String aod_icon = data.getAod_icon();
        boolean z = !(aod_icon == null || aod_icon.length() == 0);
        ((FaceDetailViewModel) getMViewModel()).getMModel().getHasAod().set(z);
        if (z) {
            ((hx8) getMBinding()).H.A.setOnTouchListener(new View.OnTouchListener() { // from class: oq8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return FaceDetailFragment.initAod$lambda$14(data, this, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initAod$lambda$14(FaceData data, FaceDetailFragment this$0, View view, MotionEvent motionEvent) {
        String id;
        String model;
        String firmwareVersion;
        String name;
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<FaceData.Icon> icon_list = data.getIcon_list();
        Intrinsics.checkNotNull(icon_list);
        FaceData.Icon icon = icon_list.get(this$0.currentIconIndex);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this$0.touchAodDown = true;
            ((hx8) this$0.getMBinding()).H.A.getParent().requestDisallowInterceptTouchEvent(true);
            FaceEditPreviewView styleView = ((hx8) this$0.getMBinding()).H.F;
            Intrinsics.checkNotNullExpressionValue(styleView, "styleView");
            ViewExtKt.invisible(styleView);
            FaceManager.INSTANCE.loadFaceUrl(icon.getAod_icon(), this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.105.0.1.39657");
            Object[] objArr = new Object[10];
            objArr[0] = "name";
            objArr[1] = "watchface_Turn";
            objArr[2] = "asset_id";
            WatchFace mInfo = this$0.getMInfo();
            String str = "";
            if (mInfo == null || (id = mInfo.getId()) == null) {
                id = "";
            }
            objArr[3] = id;
            objArr[4] = "device_model";
            WearableDeviceModel mDeviceModel = this$0.getMDeviceModel();
            if (mDeviceModel == null || (model = DeviceModelExtKt.getModel(mDeviceModel)) == null) {
                model = "";
            }
            objArr[5] = model;
            objArr[6] = "device_version";
            WearableDeviceModel mDeviceModel2 = this$0.getMDeviceModel();
            if (mDeviceModel2 == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(mDeviceModel2)) == null) {
                firmwareVersion = "";
            }
            objArr[7] = firmwareVersion;
            objArr[8] = OneTrack.Param.ASSET_NAME;
            WatchFace mInfo2 = this$0.getMInfo();
            if (mInfo2 != null && (name = mInfo2.getName()) != null) {
                str = name;
            }
            objArr[9] = str;
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        } else if (actionMasked == 1) {
            this$0.touchAodDown = false;
            ((hx8) this$0.getMBinding()).H.A.getParent().requestDisallowInterceptTouchEvent(false);
            FaceManager faceManager = FaceManager.INSTANCE;
            faceManager.loadFaceUrl(icon.getIcon(), this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            WatchFace mInfo3 = this$0.getMInfo();
            if (mInfo3 != null && mInfo3.getFaceType() == 4) {
                WatchFace mInfo4 = this$0.getMInfo();
                String styleUrl = mInfo4 != null ? mInfo4.getStyleUrl() : null;
                if (styleUrl != null && styleUrl.length() != 0) {
                    FaceEditPreviewView styleView2 = ((hx8) this$0.getMBinding()).H.F;
                    Intrinsics.checkNotNullExpressionValue(styleView2, "styleView");
                    ViewExtKt.visible(styleView2);
                    WatchFace mInfo5 = this$0.getMInfo();
                    Intrinsics.checkNotNull(mInfo5);
                    String styleUrl2 = mInfo5.getStyleUrl();
                    FaceEditPreviewView styleView3 = ((hx8) this$0.getMBinding()).H.F;
                    Intrinsics.checkNotNullExpressionValue(styleView3, "styleView");
                    faceManager.loadFaceUrl(styleUrl2, styleView3, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBulletScreen(FaceData faceData) {
        if (FacePreference.INSTANCE.showBulletScreen()) {
            ((FaceDetailViewModel) getMViewModel()).getUserActionList().observe(getViewLifecycleOwner(), new FaceDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tq8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceDetailFragment.initBulletScreen$lambda$29(this.f34939a, (Pair) obj);
                }
            }));
            ((FaceDetailViewModel) getMViewModel()).getUserActionList(faceData.getId(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initBulletScreen$lambda$29(FaceDetailFragment this$0, Pair pair) {
        String model;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.userActionHandler.removeCallbacksAndMessages(null);
        this$0.userActionHasMore = ((Boolean) pair.getSecond()).booleanValue();
        this$0.userActionList.clear();
        this$0.userActionList.addAll((Collection) pair.getFirst());
        if (this$0.userActionList.isEmpty()) {
            return Unit.INSTANCE;
        }
        if (this$0.bulletFirstVisible) {
            this$0.bulletFirstVisible = false;
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("expose_v3", "56.95.0.1.37361");
            Object[] objArr = new Object[2];
            objArr[0] = "device_model";
            WearableDeviceModel mDeviceModel = this$0.getMDeviceModel();
            if (mDeviceModel == null || (model = DeviceModelExtKt.getModel(mDeviceModel)) == null) {
                model = "";
            }
            objArr[1] = model;
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        }
        Handler handler = this$0.userActionHandler;
        final Function0<Unit> function0 = this$0.userActionRunnable;
        handler.post(new Runnable() { // from class: zp8
            @Override // java.lang.Runnable
            public final void run() {
                FaceDetailFragment.initBulletScreen$lambda$29$lambda$28(function0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBulletScreen$lambda$29$lambda$28(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDataView(FaceDetailResultV2 data) {
        Logger.i(TAG, "initDataView: " + data.getWatchFace());
        FaceSizeConstant faceSizeConstant = FaceSizeConstant.INSTANCE;
        FaceDeviceConfig deviceConfig = data.getDeviceConfig();
        faceSizeConstant.setCurrentType(deviceConfig != null ? deviceConfig.getShape() : 0);
        ((hx8) getMBinding()).V.setWaterMark(data.getWatchFace().isWhiteListFace());
        setMBrowseFaceStartTime(System.currentTimeMillis());
        this.faceDataWrapper = data;
        setMRequestData(data.getWatchFace());
        setButton1();
        initIconList(data.getWatchFace());
        initDescText(data.getWatchFace());
        initIntroduction(data.getWatchFace());
        initAod(data.getWatchFace());
        initRecommendTab(data);
        initBulletScreen(data.getWatchFace());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDescText(FaceData data) {
        int i = p1j.e1;
        Object[] objArr = new Object[1];
        Long fileSize = getFileSize();
        objArr[0] = Float.valueOf((fileSize != null ? fileSize.longValue() : 0L) / 1048576.0f);
        String string = getString(i, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (data.isPurchaseFace()) {
            string = (getString(p1j.r0, Float.valueOf(data.getPrice() / 100.0f)) + " | ") + string;
        }
        String publish_name = data.getPublish_name();
        if (publish_name != null && publish_name.length() != 0) {
            string = string + (" | " + data.getPublish_name());
        }
        if (data.getPower_level() != null) {
            ImageView powerLevel = ((hx8) getMBinding()).N;
            Intrinsics.checkNotNullExpressionValue(powerLevel, "powerLevel");
            ViewExtKt.visible(powerLevel);
            ((hx8) getMBinding()).N.setOnClickListener(new View.OnClickListener() { // from class: dq8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceDetailFragment.initDescText$lambda$12(this.f15810a, view);
                }
            });
            String str = " | " + getString(p1j.K);
            ImageView imageView = ((hx8) getMBinding()).N;
            Integer power_level = data.getPower_level();
            imageView.setImageResource((power_level != null && power_level.intValue() == 1) ? noi.h : (power_level != null && power_level.intValue() == 3) ? noi.g : noi.i);
            string = string + str;
        }
        List<FaceData.Attribute> attribute_list = data.getAttribute_list();
        if (attribute_list != null && !attribute_list.isEmpty()) {
            List<FaceData.Attribute> attribute_list2 = data.getAttribute_list();
            Intrinsics.checkNotNull(attribute_list2);
            for (FaceData.Attribute attribute : attribute_list2) {
                string = string + (" | " + getString(p1j.h, attribute.getAttribute_name(), attribute.getAttribute_value_name()));
            }
        }
        ((hx8) getMBinding()).M.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDescText$lambda$12(FaceDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showPowerLevelDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initIconList(FaceData data) {
        Object next;
        final List<FaceData.Icon> icon_list = data.getIcon_list();
        if (icon_list == null) {
            return;
        }
        int i = -1;
        if (!icon_list.isEmpty()) {
            Iterator<T> it = icon_list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt__StringsKt.contains$default((CharSequence) ((FaceData.Icon) next).getIcon(), (CharSequence) "webp?", false, 2, (Object) null));
            FaceData.Icon icon = (FaceData.Icon) next;
            if (icon == null) {
                icon = icon_list.get(0);
            }
            FaceManager faceManager = FaceManager.INSTANCE;
            String icon2 = icon.getIcon();
            FaceEditPreviewView mImageView = ((hx8) getMBinding()).H.D;
            Intrinsics.checkNotNullExpressionValue(mImageView, "mImageView");
            faceManager.loadFaceUrl(icon2, mImageView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            Iterator<FaceData.Icon> it2 = icon_list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                } else if (StringsKt__StringsKt.contains$default((CharSequence) it2.next().getIcon(), (CharSequence) "webp?", false, 2, (Object) null)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                i2 = 0;
            }
            this.currentIconIndex = i2;
            if (icon.getAod_icon().length() == 0) {
                ImageView aodSwitch = ((hx8) getMBinding()).H.A;
                Intrinsics.checkNotNullExpressionValue(aodSwitch, "aodSwitch");
                ViewExtKt.invisible(aodSwitch);
            } else {
                ImageView aodSwitch2 = ((hx8) getMBinding()).H.A;
                Intrinsics.checkNotNullExpressionValue(aodSwitch2, "aodSwitch");
                ViewExtKt.visible(aodSwitch2);
            }
        }
        List<FaceData.Icon> list = icon_list;
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (StringsKt__StringsKt.contains$default((CharSequence) ((FaceData.Icon) it3.next()).getIcon(), (CharSequence) "webp?", false, 2, (Object) null)) {
                    return;
                }
            }
        }
        if (z && list.isEmpty()) {
            return;
        }
        Iterator<T> it4 = list.iterator();
        int i3 = 0;
        while (it4.hasNext()) {
            if ((!StringsKt__StringsKt.contains$default((CharSequence) ((FaceData.Icon) it4.next()).getIcon(), (CharSequence) "webp?", false, 2, (Object) null)) && (i3 = i3 + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i3 < 2) {
            return;
        }
        Iterator<FaceData.Icon> it5 = icon_list.iterator();
        int i4 = 0;
        while (it5.hasNext()) {
            if (StringsKt__StringsKt.contains$default((CharSequence) it5.next().getIcon(), (CharSequence) "webp?", false, 2, (Object) null)) {
                i = i4;
                break;
            }
            i4++;
        }
        if (i > 0) {
            Collections.swap(icon_list, 0, i);
            this.currentIconIndex = 0;
        }
        RecyclerView iconList = ((hx8) getMBinding()).H.C;
        Intrinsics.checkNotNullExpressionValue(iconList, "iconList");
        ViewExtKt.visible(iconList);
        ((hx8) getMBinding()).H.C.setItemAnimator(null);
        ((hx8) getMBinding()).H.C.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.watch.face.FaceDetailFragment.initIconList.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                FaceDetailFragment.this.headerHeight += ExtUtilsKt.getDp(75);
                FaceDetailFragment faceDetailFragment = FaceDetailFragment.this;
                faceDetailFragment.expandPathLength = FaceDetailFragment.access$getMBinding(faceDetailFragment).S.getHeight() - FaceDetailFragment.this.headerHeight;
                FaceDetailFragment.access$getMBinding(FaceDetailFragment.this).H.C.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Logger.i(FaceDetailFragment.TAG, "headerHeight = " + FaceDetailFragment.this.headerHeight);
            }
        });
        FaceDetailIconAdapter faceDetailIconAdapter = new FaceDetailIconAdapter(new Function1() { // from class: vq8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDetailFragment.initIconList$lambda$25(this.f37127a, icon_list, ((Integer) obj).intValue());
            }
        });
        ((hx8) getMBinding()).H.C.setAdapter(faceDetailIconAdapter);
        ((hx8) getMBinding()).H.C.setLayoutManager(new LinearLayoutManager(ApplicationExtKt.getApplication(), 0, false));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList.add(((FaceData.Icon) it6.next()).getIcon());
        }
        faceDetailIconAdapter.setIconList(arrayList, this.currentIconIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initIconList$lambda$25(FaceDetailFragment this$0, List iconList, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(iconList, "$iconList");
        this$0.currentIconIndex = i;
        FaceData.Icon icon = (FaceData.Icon) iconList.get(i);
        if (icon.getAod_icon().length() == 0) {
            ImageView aodSwitch = ((hx8) this$0.getMBinding()).H.A;
            Intrinsics.checkNotNullExpressionValue(aodSwitch, "aodSwitch");
            ViewExtKt.invisible(aodSwitch);
        } else {
            ImageView aodSwitch2 = ((hx8) this$0.getMBinding()).H.A;
            Intrinsics.checkNotNullExpressionValue(aodSwitch2, "aodSwitch");
            ViewExtKt.visible(aodSwitch2);
        }
        FaceManager.INSTANCE.loadFaceUrl(icon.getIcon(), this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initIntroduction(final FaceData data) {
        String introduction = data.getIntroduction();
        boolean z = !(introduction == null || introduction.length() == 0);
        ((FaceDetailViewModel) getMViewModel()).getMModel().getHasDescription().set(z);
        if (z) {
            getMDescView().post(new Runnable() { // from class: lq8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceDetailFragment.initIntroduction$lambda$17(this.f25345a, data);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initIntroduction$lambda$17(FaceDetailFragment this$0, FaceData data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        this$0.getMDescView().setText(data.getIntroduction());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initLabelList(FaceData data) {
        List<FaceData.Tag> tag_list = data.getTag_list();
        boolean z = !(tag_list == null || tag_list.isEmpty());
        ((FaceDetailViewModel) getMViewModel()).getMModel().getHasLabelList().set(z);
        if (z) {
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(ApplicationExtKt.getApplication());
            flexboxLayoutManager.T(1);
            flexboxLayoutManager.U(0);
            flexboxLayoutManager.R(4);
            ((hx8) getMBinding()).J.setLayoutManager(flexboxLayoutManager);
            FaceLabelAdapter faceLabelAdapter = new FaceLabelAdapter();
            ((hx8) getMBinding()).J.setAdapter(faceLabelAdapter);
            List<FaceData.Tag> tag_list2 = data.getTag_list();
            Intrinsics.checkNotNull(tag_list2);
            faceLabelAdapter.setLabelList(tag_list2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRecommendTab(FaceDetailResultV2 data) {
        List<FaceData> recommend_list = data.getRecommend_list();
        boolean z = !(recommend_list == null || recommend_list.isEmpty());
        ((FaceDetailViewModel) getMViewModel()).getMModel().getHasRecommend().set(z);
        if (!z || getMDeviceModel() == null) {
            return;
        }
        ScrollViewEffectiveExposeBiz trackExpose = getTrackExpose();
        FaceDetailScrollView scrollView = ((hx8) getMBinding()).T;
        Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
        ScrollViewEffectiveExposeBiz.startTrackItemExpose$default(trackExpose, scrollView, new LinkedHashSet(), 0, 4, null);
        ((hx8) getMBinding()).B.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.watch.face.FaceDetailFragment.initRecommendTab.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ViewGroup.LayoutParams layoutParams = FaceDetailFragment.access$getMBinding(FaceDetailFragment.this).G.getLayoutParams();
                layoutParams.height = FaceDetailFragment.access$getMBinding(FaceDetailFragment.this).B.getHeight() + ExtUtilsKt.getDp(33);
                FaceDetailFragment.access$getMBinding(FaceDetailFragment.this).G.setLayoutParams(layoutParams);
                FaceDetailFragment.access$getMBinding(FaceDetailFragment.this).B.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        FaceSuggestionAdapter faceSuggestionAdapter = new FaceSuggestionAdapter(ConfigPreference.INSTANCE.getSHOW_WATCH_FACE_PRICE(), this.pageName, this.pageSource, this.utmSource, new Function2() { // from class: xq8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceDetailFragment.initRecommendTab$lambda$16(this.f39358a, ((Integer) obj).intValue(), (FaceData) obj2);
            }
        });
        ((hx8) getMBinding()).Q.setAdapter(faceSuggestionAdapter);
        RecyclerView recyclerView = ((hx8) getMBinding()).Q;
        Application application = ApplicationExtKt.getApplication();
        Context context = getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(application, (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? 2 : 4));
        List<FaceData> recommend_list2 = data.getRecommend_list();
        Intrinsics.checkNotNull(recommend_list2);
        faceSuggestionAdapter.setDataList(recommend_list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRecommendTab$lambda$16(FaceDetailFragment this$0, int i, FaceData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.stackTop = false;
        Bundle bundle = new Bundle();
        bundle.putInt(PAGE_SOURCE, 9);
        bundle.putInt("utm_source", this$0.pageSource);
        bundle.putInt("position_id", i + 1);
        bundle.putParcelable(FaceInfoBase.FACE_INFO, FaceExtKt.getFaceBean(it));
        Unit unit = Unit.INSTANCE;
        BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) FaceDetailFragment.class, bundle, 10001);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void installBleFace(final String path, long version, long size, boolean needCheckStorage, final boolean prepareOnly) {
        dotFaceInstallStart();
        FaceDetailViewModel faceDetailViewModel = (FaceDetailViewModel) getMViewModel();
        WatchFace mInfo = getMInfo();
        Intrinsics.checkNotNull(mInfo);
        faceDetailViewModel.installBleFace(mInfo.getId(), path, version, size, needCheckStorage, this.license, this.sign, Integer.valueOf(this.trialDuration), new Function3() { // from class: nq8
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FaceDetailFragment.installBleFace$lambda$41(prepareOnly, this, path, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Integer) obj3);
            }
        });
    }

    public static /* synthetic */ void installBleFace$default(FaceDetailFragment faceDetailFragment, String str, long j, long j2, boolean z, boolean z2, int i, Object obj) {
        faceDetailFragment.installBleFace(str, j, j2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit installBleFace$lambda$41(boolean z, FaceDetailFragment this$0, String str, boolean z2, int i, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onInstallBleFace: " + z2 + " " + i + " " + num);
        if (z) {
            Logger.i(TAG, "prepare install success, sign only");
            return Unit.INSTANCE;
        }
        if (z2) {
            this$0.installing = true;
            WatchFace mInfo = this$0.getMInfo();
            Intrinsics.checkNotNull(mInfo);
            this$0.doInstallFace(str, mInfo.getId(), num);
        } else {
            this$0.installing = false;
            if (i == 1) {
                Context context = this$0.getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, p1j.common_hint_device_busy);
                }
            } else if (i == 2) {
                this$0.doDuplicate();
            } else if (i == 3) {
                Context context2 = this$0.getContext();
                if (context2 != null) {
                    ToastExtKt.toastShort(context2, p1j.d0);
                }
            } else if (i == 4) {
                Context context3 = this$0.getContext();
                if (context3 != null) {
                    ToastExtKt.toastShort(context3, p1j.common_hint_battery_low);
                }
            } else if (i == 7) {
                Context context4 = this$0.getContext();
                if (context4 != null) {
                    ToastExtKt.toastShort(context4, p1j.c0);
                }
            } else if (i == 17) {
                WatchFace mInfo2 = this$0.getMInfo();
                Intrinsics.checkNotNull(mInfo2);
                this$0.onM69LowStorage(str, mInfo2.getId(), num);
            } else if (i == 101) {
                this$0.showFullDialog(str);
            } else if (i != 102) {
                Context context5 = this$0.getContext();
                if (context5 != null) {
                    ToastExtKt.toastShort(context5, p1j.s);
                }
            } else {
                Context context6 = this$0.getContext();
                if (context6 != null) {
                    ToastExtKt.toastShort(context6, p1j.S0);
                }
            }
            this$0.toDismissDialog();
            this$0.setButton1();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void installOrUpdate(boolean isTrail) {
        String fileHash;
        String id;
        if (!NetworkExtKt.isNetworkAvailable()) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_hint_network_unavailable);
            }
            toDismissDialog();
            setButton1();
            return;
        }
        if (getMRequestData() != null && (fileHash = getFileHash()) != null && fileHash.length() != 0) {
            FaceDetailViewModel faceDetailViewModel = (FaceDetailViewModel) getMViewModel();
            WatchFace mInfo = getMInfo();
            if (mInfo == null || (id = mInfo.getId()) == null) {
                id = "";
            }
            String fileHash2 = getFileHash();
            Intrinsics.checkNotNull(fileHash2);
            download(faceDetailViewModel.getInstallFilePath(id, fileHash2), isTrail);
            return;
        }
        Logger.i(TAG, "installOrUpdate error: " + getRealFaceId() + " " + getFileHash());
        Context context2 = getContext();
        if (context2 != null) {
            ToastExtKt.toastShort(context2, p1j.common_hint_unkonwn_error);
        }
        toDismissDialog();
        setButton1();
    }

    private final void intentInstallOrUpdate(final boolean isTrail) {
        trackClick(!isTrail ? 1 : 0);
        checkConnect(new Function0() { // from class: sp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailFragment.intentInstallOrUpdate$lambda$36(this.f33854a, isTrail);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit intentInstallOrUpdate$lambda$36(FaceDetailFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView installEditUpgrade = ((hx8) this$0.getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
        ViewExtKt.gone(installEditUpgrade);
        TextView actionUseView = ((hx8) this$0.getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
        ViewExtKt.gone(actionUseView);
        ConstraintLayout editGroup = ((hx8) this$0.getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(editGroup, "editGroup");
        ViewExtKt.gone(editGroup);
        this$0.getProgressDialog().showIfNeed(this$0.getParentFragmentManager());
        this$0.getProgressDialog().setTitle(this$0.isLiteralFace() ? p1j.I : p1j.common_installing);
        this$0.getProgressDialog().setProgress(0);
        this$0.installOrUpdate(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLiteralFace() {
        FaceData.BleExt ble_ext;
        FaceData mRequestData = getMRequestData();
        return (mRequestData == null || (ble_ext = mRequestData.getBle_ext()) == null || !ble_ext.isLiteralFace()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onBleInstallRet(boolean success, int code) {
        String id;
        WatchFace mInfo = getMInfo();
        Logger.i(TAG, "onBleInstallRet: id = " + (mInfo != null ? mInfo.getId() : null) + "; code = " + code + "; success = " + success);
        if (success) {
            doFaceInstallFinish(true, null);
            setMInstalled(true);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            if (mDeviceModel != null && DeviceModelExtKt.isHuaMi(mDeviceModel)) {
                onHuamiInstallSuccess();
                return;
            } else if (code == 3) {
                syncFace();
            } else {
                setFace();
            }
        } else {
            this.installing = false;
            doFaceInstallFinish(false, String.valueOf(code));
            if (code == 1) {
                Context context = getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, p1j.common_hint_device_busy);
                }
            } else if (code == 2) {
                doDuplicate();
            } else if (code == 3) {
                Context context2 = getContext();
                if (context2 != null) {
                    ToastExtKt.toastShort(context2, p1j.d0);
                }
            } else if (code != 4) {
                Context context3 = getContext();
                if (context3 != null) {
                    ToastExtKt.toastShort(context3, p1j.s);
                }
            } else {
                Context context4 = getContext();
                if (context4 != null) {
                    ToastExtKt.toastShort(context4, p1j.common_hint_battery_low);
                }
            }
            toDismissDialog();
            setButton1();
        }
        FaceDetailViewModel faceDetailViewModel = (FaceDetailViewModel) getMViewModel();
        WatchFace mInfo2 = getMInfo();
        if (mInfo2 == null || (id = mInfo2.getId()) == null) {
            id = "";
        }
        faceDetailViewModel.deleteBinFile(id, getFileHash());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onClick$lambda$35(final FaceDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (FaceManager.INSTANCE.isTryOut(this$0.getMInfo(), this$0.getMRequestData())) {
            this$0.showLoading();
            FaceDetailViewModel faceDetailViewModel = (FaceDetailViewModel) this$0.getMViewModel();
            WatchFace mInfo = this$0.getMInfo();
            Intrinsics.checkNotNull(mInfo);
            faceDetailViewModel.deleteFace(mInfo.getId(), new Function1() { // from class: cq8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceDetailFragment.onClick$lambda$35$lambda$34(this.f14613a, ((Boolean) obj).booleanValue());
                }
            });
            this$0.trackClick(4);
        } else {
            FaceData mRequestData = this$0.getMRequestData();
            if (mRequestData == null || !mRequestData.canPurchase()) {
                this$0.setFace();
                this$0.trackClick(5);
            } else {
                this$0.intentInstallOrUpdate(true);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$35$lambda$34(FaceDetailFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onDelete(z);
        return Unit.INSTANCE;
    }

    private final void onDelete(boolean success) {
        hideLoading();
        doFaceDeleteFinish();
        setButton1();
        if (!success) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_delete_failure);
                return;
            }
            return;
        }
        Context context2 = getContext();
        if (context2 != null) {
            ToastExtKt.toastShort(context2, this.trialDuration == 0 ? p1j.common_delete_success : p1j.v0);
        }
        setMInstalled(false);
        FaceManager.INSTANCE.delete(getMInfo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDownload(FaceDetailViewModel.DownloadRet ret) {
        int percent = ret.getPercent();
        if (percent == -2 || percent == -1) {
            Logger.i(TAG, "onDownload: fail = " + ret.getPercent());
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, FaceBleInfoViewModelKt.getTip(ret.getPercent()));
            }
            toDismissDialog();
            setButton1();
            dotFaceDownloadFinish(false, ret.getMsg());
            return;
        }
        if (percent != 100) {
            if (isLiteralFace()) {
                getProgressDialog().setProgress(ret.getPercent());
                return;
            }
            return;
        }
        FaceDetailViewModel faceDetailViewModel = (FaceDetailViewModel) getMViewModel();
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
        WatchFace mInfo = getMInfo();
        boolean zValidFile = faceDetailViewModel.validFile(did, mInfo != null ? mInfo.getId() : null, getFileHash());
        Logger.i(TAG, "face onDownload validZip: " + zValidFile);
        if (!zValidFile) {
            onDownload(new FaceDetailViewModel.DownloadRet(-2, "zip not valid"));
            return;
        }
        dotFaceDownloadFinish(true, null);
        if (getMRequestData() != null) {
            onDownloadEnd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDownloadEnd() {
        String id;
        FaceDetailViewModel faceDetailViewModel = (FaceDetailViewModel) getMViewModel();
        WatchFace mInfo = getMInfo();
        if (mInfo == null || (id = mInfo.getId()) == null) {
            id = "";
        }
        faceDetailViewModel.findFile(id, getFileHash(), new Function2() { // from class: kq8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceDetailFragment.onDownloadEnd$lambda$40(this.f24186a, (File) obj, (File) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onDownloadEnd$lambda$40(FaceDetailFragment this$0, File file, File file2) {
        FaceData mRequestData;
        long jLongValue;
        Long version_code;
        Long version_code2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceManager faceManager = FaceManager.INSTANCE;
        if (faceManager.canUpgrade(this$0.getMInfo(), this$0.getMDeviceModel())) {
            this$0.getProgressDialog().setProgress(!this$0.isLiteralFace());
            this$0.getProgressDialog().setTitle(p1j.common_installing);
            if (file2 != null) {
                this$0.unzipAndInstall(file2);
            } else if (file != null) {
                String absolutePath = file.getAbsolutePath();
                FaceData mRequestData2 = this$0.getMRequestData();
                installBleFace$default(this$0, absolutePath, (mRequestData2 == null || (version_code2 = mRequestData2.getVersion_code()) == null) ? 0L : version_code2.longValue(), file.length(), false, false, 24, null);
            }
        } else if (((FaceDetailViewModel) this$0.getMViewModel()).getSupportZip()) {
            WatchFace mInfo = this$0.getMInfo();
            if (faceManager.isInstalled(mInfo != null ? mInfo.getId() : null)) {
                AnyExtKt.io$default(null, new FaceDetailFragment$onDownloadEnd$1$1(this$0, null), 1, null);
            } else if (file != null) {
                this$0.getProgressDialog().setProgress(!this$0.isLiteralFace());
                this$0.getProgressDialog().setTitle(p1j.common_installing);
                String absolutePath2 = file.getAbsolutePath();
                mRequestData = this$0.getMRequestData();
                if (mRequestData != null) {
                    jLongValue = 0;
                } else {
                    jLongValue = 0;
                }
                installBleFace$default(this$0, absolutePath2, jLongValue, file.length(), false, false, 24, null);
            } else if (file2 != null) {
                this$0.getProgressDialog().setProgress(!this$0.isLiteralFace());
                this$0.getProgressDialog().setTitle(p1j.common_installing);
                this$0.unzipAndInstall(file2);
            }
        } else if (file != null) {
            this$0.getProgressDialog().setProgress(!this$0.isLiteralFace());
            this$0.getProgressDialog().setTitle(p1j.common_installing);
            String absolutePath3 = file.getAbsolutePath();
            mRequestData = this$0.getMRequestData();
            if (mRequestData != null || (version_code = mRequestData.getVersion_code()) == null) {
                jLongValue = 0;
            } else {
                jLongValue = version_code.longValue();
            }
            installBleFace$default(this$0, absolutePath3, jLongValue, file.length(), false, false, 24, null);
        } else if (file2 != null) {
            this$0.getProgressDialog().setProgress(!this$0.isLiteralFace());
            this$0.getProgressDialog().setTitle(p1j.common_installing);
            this$0.unzipAndInstall(file2);
        }
        return Unit.INSTANCE;
    }

    private final void onHuamiInstallSuccess() {
        AnyExtKt.io$default(null, new C33271(null), 1, null);
    }

    private final void onM69LowStorage(final String path, final String id, final Integer segmentLength) {
        new CommonDialog.c("onM69LowStorage").setDialogDescription(p1j.T0).setPositiveText(p1j.N).setNegativeText(p1j.common_exit).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceDetailFragment.onM69LowStorage.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                TextView installEditUpgrade = FaceDetailFragment.access$getMBinding(FaceDetailFragment.this).I;
                Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
                ViewExtKt.gone(installEditUpgrade);
                TextView actionUseView = FaceDetailFragment.access$getMBinding(FaceDetailFragment.this).A;
                Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
                ViewExtKt.gone(actionUseView);
                ConstraintLayout editGroup = FaceDetailFragment.access$getMBinding(FaceDetailFragment.this).D;
                Intrinsics.checkNotNullExpressionValue(editGroup, "editGroup");
                ViewExtKt.gone(editGroup);
                FaceDetailFragment.this.getProgressDialog().showIfNeed(FaceDetailFragment.this.getParentFragmentManager());
                FaceDetailFragment.this.getProgressDialog().setTitle(p1j.common_installing);
                FaceDetailFragment.this.getProgressDialog().setProgress(0);
                FaceDetailFragment.this.doInstallFace(path, id, segmentLength);
            }
        }).showIfNeed(getChildFragmentManager());
    }

    private final void onRealDismissDialog() {
        dismissDialogForce();
        TextView actionUseView = getActionUseView();
        if (actionUseView != null) {
            actionUseView.post(new Runnable() { // from class: sq8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceDetailFragment.onRealDismissDialog$lambda$43(this.f33883a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRealDismissDialog$lambda$43(FaceDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getProgressDialog().isShowing()) {
            this$0.getProgressDialog().setProgress(0);
            this$0.getProgressDialog().dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(FaceDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.postAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(FaceDetailFragment this$0, FaceDetailViewModel.FaceDetailLiveData faceDetailLiveData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (faceDetailLiveData.getCode() != 0) {
            this$0.setButton1();
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, faceDetailLiveData.getCode() == 22223 ? p1j.common_hint_network_unavailable : p1j.common_hint_unkonwn_error);
            }
        } else {
            FaceDetailResultV2 data = faceDetailLiveData.getData();
            if (data != null) {
                this$0.initDataView(data);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(FaceDetailFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.getProgressDialog().isShowing()) {
            this$0.getProgressDialog().showIfNeed(this$0.getParentFragmentManager());
        }
        if (this$0.isLiteralFace()) {
            FaceDialog progressDialog = this$0.getProgressDialog();
            Intrinsics.checkNotNull(num);
            progressDialog.setProgress(num.intValue());
        } else {
            this$0.getProgressDialog().setProgress(((num.intValue() * 99) / 100) + 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(FaceDetailFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRealDismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void postAnimation() {
        if (this.headerHeight == 0 || this.expandPathLength == 0 || ((hx8) getMBinding()).T.getScrollY() != 0) {
            return;
        }
        ((hx8) getMBinding()).T.setScrollEnabled(this.expand);
        ConstraintLayout buttonGroup = ((hx8) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(buttonGroup, "buttonGroup");
        ViewExtKt.setVisible(buttonGroup, this.expand);
        boolean z = this.expand;
        int i = this.headerHeight;
        if (z) {
            i += this.expandPathLength;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, z ? this.headerHeight : this.headerHeight + this.expandPathLength);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bq8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FaceDetailFragment.postAnimation$lambda$19$lambda$18(this.f4480a, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        this.expand = !this.expand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void postAnimation$lambda$19$lambda$18(FaceDetailFragment this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ViewGroup.LayoutParams layoutParams = ((hx8) this$0.getMBinding()).H.getRoot().getLayoutParams();
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        layoutParams.height = iIntValue;
        ((hx8) this$0.getMBinding()).H.getRoot().setLayoutParams(layoutParams);
        int i = iIntValue - this$0.headerHeight;
        ViewGroup.LayoutParams layoutParams2 = ((hx8) this$0.getMBinding()).H.A.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.topMargin = (ExtUtilsKt.getDp(120) * i) / this$0.expandPathLength;
        ((hx8) this$0.getMBinding()).H.A.setLayoutParams(marginLayoutParams);
        int i2 = FaceIcon.INFO_HEIGHT;
        this$0.refreshPreview((((float) (((((double) i2) * 0.27d) * ((double) i)) / ((double) this$0.expandPathLength))) + i2) / i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceDialog progressDialog_delegate$lambda$0() {
        return new FaceDialog.Builder(FACE_PROGRESS_DIALOG_TAG).create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshPreview(float ratio, int offset) {
        ViewGroup.LayoutParams layoutParams = ((hx8) getMBinding()).H.E.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = (offset * ExtUtilsKt.getDp(80)) / this.expandPathLength;
        marginLayoutParams.height = (int) (ExtUtilsKt.getDp(320) * ratio);
        marginLayoutParams.width = (int) (ExtUtilsKt.getDp(320) * ratio);
        ((hx8) getMBinding()).H.E.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = ((hx8) getMBinding()).H.D.getLayoutParams();
        layoutParams2.height = (int) (FaceIcon.INFO_WIDTH * ratio);
        layoutParams2.width = (int) (FaceIcon.INFO_HEIGHT * ratio);
        ((hx8) getMBinding()).H.D.setRatio(ratio);
        ((hx8) getMBinding()).H.D.setLayoutParams(layoutParams2);
        FaceEditPreviewView styleView = ((hx8) getMBinding()).H.F;
        Intrinsics.checkNotNullExpressionValue(styleView, "styleView");
        if (ExtUtilsKt.isVisible(styleView)) {
            ViewGroup.LayoutParams layoutParams3 = ((hx8) getMBinding()).H.D.getLayoutParams();
            layoutParams3.height = (int) (FaceIcon.INFO_WIDTH * ratio);
            layoutParams3.width = (int) (FaceIcon.INFO_HEIGHT * ratio);
            ((hx8) getMBinding()).H.F.setRatio(ratio);
            ((hx8) getMBinding()).H.F.setLayoutParams(layoutParams3);
        }
    }

    private final void requestDownload(boolean isTrail, Function1<? super FaceDownloadResultV2, Unit> result) {
        ScopeExtKt.scopeNetLife$default((Fragment) this, (Lifecycle.Event) null, (CoroutineDispatcher) null, (Function2) new C33291(isTrail, result, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestEdit() {
        String did;
        String id;
        String did2;
        String id2;
        DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        String str = "";
        if (mDeviceModel == null || (did = mDeviceModel.getDid()) == null) {
            did = "";
        }
        WatchFace mInfo = getMInfo();
        if (mInfo == null || (id = mInfo.getId()) == null) {
            id = "";
        }
        File fileCheckUnzipFiles$default = DialFileUtils.checkUnzipFiles$default(dialFileUtils, did, id, getFileHash(), false, 8, null);
        if (fileCheckUnzipFiles$default != null) {
            this.stackTop = false;
            Bundle bundle = new Bundle();
            FaceManager faceManager = FaceManager.INSTANCE;
            WatchFace mInfo2 = getMInfo();
            WatchFace face = faceManager.getFace(mInfo2 != null ? mInfo2.getId() : null);
            if (face == null) {
                face = getMInfo();
            }
            bundle.putParcelable(FaceInfoBase.FACE_INFO, face);
            bundle.putString(FaceEditFragment.FACE_UNZIP_PATH, fileCheckUnzipFiles$default.getAbsolutePath());
            Unit unit = Unit.INSTANCE;
            BaseFragmentExKt.gotoPageForResult(this, (Class<?>) FaceEditFragment.class, bundle, 10001);
            return;
        }
        FaceManager faceManager2 = FaceManager.INSTANCE;
        WearableDeviceModel mDeviceModel2 = getMDeviceModel();
        if (mDeviceModel2 == null || (did2 = mDeviceModel2.getDid()) == null) {
            did2 = "";
        }
        WatchFace mInfo3 = getMInfo();
        if (mInfo3 == null || (id2 = mInfo3.getId()) == null) {
            id2 = "";
        }
        if (this.debugFaceEdit) {
            str = "test";
        } else {
            String fileHash = getFileHash();
            if (fileHash != null) {
                str = fileHash;
            }
        }
        File file = new File(faceManager2.getWatchFaceZipPath(did2, id2, str));
        if (file.exists()) {
            showLoading();
            AnyExtKt.io$default(null, new AnonymousClass2(null), 1, null);
            return;
        }
        if (isLiteralFace()) {
            TextView installEditUpgrade = ((hx8) getMBinding()).I;
            Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
            ViewExtKt.gone(installEditUpgrade);
            TextView actionUseView = ((hx8) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
            ViewExtKt.gone(actionUseView);
            ConstraintLayout editGroup = ((hx8) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(editGroup, "editGroup");
            ViewExtKt.gone(editGroup);
            getProgressDialog().showIfNeed(getParentFragmentManager());
            getProgressDialog().setTitle(p1j.I);
            getProgressDialog().setProgress(0);
        } else {
            showLoading();
        }
        download$default(this, file, false, 2, null);
    }

    private final void requestPay() {
        String name;
        String id;
        trackClick(2);
        PaymentManager.Companion companion = PaymentManager.INSTANCE;
        PaymentManager payManagerExtKt = PayManagerExtKt.getInstance(companion);
        FaceData mRequestData = getMRequestData();
        String spu_id = mRequestData != null ? mRequestData.getSpu_id() : null;
        FaceData mRequestData2 = getMRequestData();
        Integer numValueOf = mRequestData2 != null ? Integer.valueOf(mRequestData2.getSpu_version()) : null;
        FaceData mRequestData3 = getMRequestData();
        String sku_id = mRequestData3 != null ? mRequestData3.getSku_id() : null;
        FaceData mRequestData4 = getMRequestData();
        Long lValueOf = mRequestData4 != null ? Long.valueOf(mRequestData4.getPrice()) : null;
        WatchFace mInfo = getMInfo();
        String str = (mInfo == null || (id = mInfo.getId()) == null) ? "" : id;
        WatchFace mInfo2 = getMInfo();
        SkuObject skuObjectBuildSkuObject$default = PaymentManager.DefaultImpls.buildSkuObject$default(payManagerExtKt, spu_id, numValueOf, sku_id, lValueOf, 0L, str, (mInfo2 == null || (name = mInfo2.getName()) == null) ? "" : name, 16, null);
        Bundle bundle = new Bundle();
        bundle.putInt("source", 22);
        bundle.putInt("utm_source", this.pageSource);
        PaymentManager payManagerExtKt2 = PayManagerExtKt.getInstance(companion);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        PaymentManager.DefaultImpls.intentToPay$default(payManagerExtKt2, fragmentActivityRequireActivity, CollectionsKt__CollectionsKt.mutableListOf(skuObjectBuildSkuObject$default), 0, false, false, false, false, 0, null, bundle, null, 1532, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resizeButtonGroup() {
        ViewGroup.LayoutParams layoutParams = ((hx8) getMBinding()).C.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        Context context = getContext();
        layoutParams.width = (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? -1 : ExtUtilsKt.getDp(393);
        ((hx8) getMBinding()).C.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCanEditButton() {
        ConstraintLayout buttonGroupBtn = ((hx8) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(buttonGroupBtn, "buttonGroupBtn");
        ViewExtKt.visible(buttonGroupBtn);
        ConstraintLayout editGroup = ((hx8) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(editGroup, "editGroup");
        ViewExtKt.visible(editGroup);
        ((hx8) getMBinding()).D.setEnabled(true);
        TextView actionUseView = ((hx8) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
        ViewExtKt.visible(actionUseView);
        TextView textView = ((hx8) getMBinding()).A;
        FaceManager faceManager = FaceManager.INSTANCE;
        textView.setText(faceManager.isCurrent(getMInfo()) ? p1j.A : p1j.L);
        TextView installEditUpgrade = ((hx8) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
        ViewExtKt.gone(installEditUpgrade);
        ((hx8) getMBinding()).A.setEnabled(true ^ faceManager.isCurrent(getMInfo()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCanPurchaseButton() {
        WatchFace mInfo;
        boolean zIsTryOut = FaceManager.INSTANCE.isTryOut(getMInfo(), getMRequestData());
        boolean zShowPurchaseButtonTest = FacePreference.INSTANCE.showPurchaseButtonTest();
        if (!zIsTryOut && zShowPurchaseButtonTest) {
            ConstraintLayout buttonGroupBtn = ((hx8) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(buttonGroupBtn, "buttonGroupBtn");
            ViewExtKt.gone(buttonGroupBtn);
            ConstraintLayout purchaseButtonNew = ((hx8) getMBinding()).O;
            Intrinsics.checkNotNullExpressionValue(purchaseButtonNew, "purchaseButtonNew");
            ViewExtKt.visible(purchaseButtonNew);
            TextView tryOutNew = ((hx8) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(tryOutNew, "tryOutNew");
            ViewExtKt.setVisible(tryOutNew, ((FaceDetailViewModel) getMViewModel()).getSupportTrial());
            ((hx8) getMBinding()).U.setEnabled(true);
            ((hx8) getMBinding()).U.setText(p1j.t0);
            TextView textView = ((hx8) getMBinding()).P;
            int i = p1j.s0;
            FaceData mRequestData = getMRequestData();
            Intrinsics.checkNotNull(mRequestData);
            textView.setText(getString(i, Float.valueOf(mRequestData.getPrice() / 100.0f)));
            return;
        }
        ConstraintLayout purchaseButtonNew2 = ((hx8) getMBinding()).O;
        Intrinsics.checkNotNullExpressionValue(purchaseButtonNew2, "purchaseButtonNew");
        ViewExtKt.gone(purchaseButtonNew2);
        ConstraintLayout buttonGroupBtn2 = ((hx8) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(buttonGroupBtn2, "buttonGroupBtn");
        ViewExtKt.visible(buttonGroupBtn2);
        ConstraintLayout editGroup = ((hx8) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(editGroup, "editGroup");
        ViewExtKt.setVisible(editGroup, zIsTryOut && (mInfo = getMInfo()) != null && mInfo.getCanEdit());
        ((hx8) getMBinding()).D.setEnabled(true);
        TextView actionUseView = ((hx8) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
        ViewExtKt.setVisible(actionUseView, ((FaceDetailViewModel) getMViewModel()).getSupportTrial());
        ((hx8) getMBinding()).A.setEnabled(true);
        ((hx8) getMBinding()).A.setText(zIsTryOut ? p1j.u0 : p1j.t0);
        TextView installEditUpgrade = ((hx8) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
        ViewExtKt.visible(installEditUpgrade);
        TextView textView2 = ((hx8) getMBinding()).I;
        int i2 = p1j.s0;
        FaceData mRequestData2 = getMRequestData();
        Intrinsics.checkNotNull(mRequestData2);
        textView2.setText(getString(i2, Float.valueOf(mRequestData2.getPrice() / 100.0f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCanUpgradeButton() {
        TextView actionUseView = ((hx8) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
        ViewExtKt.gone(actionUseView);
        TextView installEditUpgrade = ((hx8) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
        ViewExtKt.visible(installEditUpgrade);
        ((hx8) getMBinding()).I.setText(p1j.M);
        ((hx8) getMBinding()).I.setEnabled(true);
        ConstraintLayout editGroup = ((hx8) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(editGroup, "editGroup");
        WatchFace mInfo = getMInfo();
        ViewExtKt.setVisible(editGroup, mInfo != null && mInfo.getCanEdit());
        ((hx8) getMBinding()).D.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setFace$lambda$45(final FaceDetailFragment this$0) {
        String id;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceDetailViewModel faceDetailViewModel = (FaceDetailViewModel) this$0.getMViewModel();
        WatchFace mInfo = this$0.getMInfo();
        if (mInfo == null || (id = mInfo.getId()) == null) {
            id = "";
        }
        faceDetailViewModel.setFaceId(id, new Function1() { // from class: jq8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDetailFragment.setFace$lambda$45$lambda$44(this.f23019a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFace$lambda$45$lambda$44(FaceDetailFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onFaceSet(z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setNormalButton() {
        ConstraintLayout buttonGroupBtn = ((hx8) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(buttonGroupBtn, "buttonGroupBtn");
        ViewExtKt.visible(buttonGroupBtn);
        TextView actionUseView = ((hx8) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
        ViewExtKt.visible(actionUseView);
        TextView textView = ((hx8) getMBinding()).A;
        FaceManager faceManager = FaceManager.INSTANCE;
        textView.setText(faceManager.isCurrent(getMInfo()) ? p1j.A : p1j.L);
        ((hx8) getMBinding()).A.setEnabled(!faceManager.isCurrent(getMInfo()));
        TextView installEditUpgrade = ((hx8) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
        ViewExtKt.gone(installEditUpgrade);
        ConstraintLayout editGroup = ((hx8) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(editGroup, "editGroup");
        ViewExtKt.gone(editGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setNormalHuamiButton() {
        TextView installEditUpgrade = ((hx8) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
        ViewExtKt.visible(installEditUpgrade);
        ((hx8) getMBinding()).I.setText(p1j.H);
        ((hx8) getMBinding()).I.setEnabled(!this.installing);
        TextView actionUseView = ((hx8) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
        ViewExtKt.gone(actionUseView);
        ConstraintLayout editGroup = ((hx8) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(editGroup, "editGroup");
        ViewExtKt.gone(editGroup);
    }

    private final void setTitleBar(boolean expand) {
        View endView;
        setActionBarNormalTitleMode();
        setTitleBackground(iki.f);
        setTitle("");
        if (!expand) {
            FaceManager faceManager = FaceManager.INSTANCE;
            if (faceManager.canRemove(getMInfo())) {
                WatchFace mInfo = getMInfo();
                if (faceManager.isInstalled(mInfo != null ? mInfo.getId() : null)) {
                    IActionBar.DefaultImpls.setEndView$default(this, 0, noi.N, null, new View.OnClickListener() { // from class: rq8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FaceDetailFragment.setTitleBar$lambda$11(this.f32793a, view);
                        }
                    }, 5, null);
                    return;
                }
            }
        }
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar == null || (endView = miuiActionBar.getEndView()) == null) {
            return;
        }
        ViewExtKt.gone(endView);
    }

    public static /* synthetic */ void setTitleBar$default(FaceDetailFragment faceDetailFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        faceDetailFragment.setTitleBar(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleBar$lambda$11(final FaceDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        a4i a4iVar = new a4i(this$0.requireContext(), view);
        a4iVar.f(twi.f35139a);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: hq8
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return FaceDetailFragment.setTitleBar$lambda$11$lambda$10(this.f20336a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTitleBar$lambda$11$lambda$10(final FaceDetailFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (menuItem.getItemId() != isi.g1) {
            return true;
        }
        this$0.showLoading();
        this$0.checkConnect(new Function0() { // from class: yp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailFragment.setTitleBar$lambda$11$lambda$10$lambda$9(this.f40393a);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setTitleBar$lambda$11$lambda$10$lambda$9(final FaceDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceDetailViewModel faceDetailViewModel = (FaceDetailViewModel) this$0.getMViewModel();
        WatchFace mInfo = this$0.getMInfo();
        Intrinsics.checkNotNull(mInfo);
        faceDetailViewModel.deleteFace(mInfo.getId(), new Function1() { // from class: mq8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDetailFragment.setTitleBar$lambda$11$lambda$10$lambda$9$lambda$8(this.f27096a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTitleBar$lambda$11$lambda$10$lambda$9$lambda$8(FaceDetailFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onDelete(z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUninstallButton() {
        ConstraintLayout buttonGroupBtn = ((hx8) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(buttonGroupBtn, "buttonGroupBtn");
        ViewExtKt.visible(buttonGroupBtn);
        TextView installEditUpgrade = ((hx8) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
        ViewExtKt.visible(installEditUpgrade);
        ((hx8) getMBinding()).I.setText(p1j.H);
        ((hx8) getMBinding()).I.setEnabled(true);
        TextView actionUseView = ((hx8) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
        ViewExtKt.gone(actionUseView);
        ConstraintLayout editGroup = ((hx8) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(editGroup, "editGroup");
        ViewExtKt.gone(editGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setVipButton() {
        TextView installEditUpgrade = ((hx8) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(installEditUpgrade, "installEditUpgrade");
        ViewExtKt.visible(installEditUpgrade);
        ((hx8) getMBinding()).I.setText(p1j.w0);
        ((hx8) getMBinding()).I.setEnabled(true);
        TextView actionUseView = ((hx8) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(actionUseView, "actionUseView");
        ViewExtKt.gone(actionUseView);
        ConstraintLayout purchaseButtonNew = ((hx8) getMBinding()).O;
        Intrinsics.checkNotNullExpressionValue(purchaseButtonNew, "purchaseButtonNew");
        ViewExtKt.gone(purchaseButtonNew);
        ConstraintLayout editGroup = ((hx8) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(editGroup, "editGroup");
        ViewExtKt.gone(editGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showBullet(int index) {
        String id;
        if (index == 0 && this.userActionList.isEmpty()) {
            return;
        }
        String string = "";
        if (index == this.userActionList.size()) {
            this.currentActionIndex = 0;
            FaceDetailViewModel faceDetailViewModel = (FaceDetailViewModel) getMViewModel();
            WatchFace mInfo = getMInfo();
            if (mInfo != null && (id = mInfo.getId()) != null) {
                string = id;
            }
            faceDetailViewModel.getUserActionList(string, !this.userActionHasMore);
            return;
        }
        FaceUserAction faceUserAction = (FaceUserAction) CollectionsKt___CollectionsKt.getOrNull(this.userActionList, index);
        if (faceUserAction == null) {
            return;
        }
        ConstraintLayout bulletScreen = ((hx8) getMBinding()).H.B;
        Intrinsics.checkNotNullExpressionValue(bulletScreen, "bulletScreen");
        ViewExtKt.visible(bulletScreen);
        int type = faceUserAction.getType();
        int current = (int) ((faceUserAction.getCurrent() - faceUserAction.getCreate()) / ((long) 60));
        int i = current / 60;
        if (current <= 5) {
            if (type == 1) {
                string = getString(p1j.E, faceUserAction.getName());
            } else if (type == 2) {
                string = getString(p1j.F, faceUserAction.getName());
            } else if (type == 3) {
                string = getString(p1j.G, faceUserAction.getName());
            }
        } else if (current < 60) {
            if (type == 1) {
                string = getResources().getQuantityString(gyi.f, current, faceUserAction.getName(), Integer.valueOf(current));
            } else if (type == 2) {
                string = getResources().getQuantityString(gyi.g, current, faceUserAction.getName(), Integer.valueOf(current));
            } else if (type == 3) {
                string = getResources().getQuantityString(gyi.h, current, faceUserAction.getName(), Integer.valueOf(current));
            }
        } else if (i <= 24) {
            if (type == 1) {
                string = getResources().getQuantityString(gyi.c, current, faceUserAction.getName(), Integer.valueOf(i));
            } else if (type == 2) {
                string = getResources().getQuantityString(gyi.d, current, faceUserAction.getName(), Integer.valueOf(i));
            } else if (type == 3) {
                string = getResources().getQuantityString(gyi.e, current, faceUserAction.getName(), Integer.valueOf(i));
            }
        } else if (i > 24) {
            if (type == 1) {
                string = getString(p1j.B, faceUserAction.getName());
            } else if (type == 2) {
                string = getString(p1j.C, faceUserAction.getName());
            } else if (type == 3) {
                string = getString(p1j.D, faceUserAction.getName());
            }
        }
        Intrinsics.checkNotNull(string);
        ((hx8) getMBinding()).H.G.setText(string);
        ImageView userIcon = ((hx8) getMBinding()).H.H;
        Intrinsics.checkNotNullExpressionValue(userIcon, "userIcon");
        String icon = faceUserAction.getIcon();
        ImageLoader imageLoader = Coil.imageLoader(userIcon.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(userIcon.getContext()).data(icon).target(userIcon);
        builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(25)));
        imageLoader.enqueue(builderTarget.build());
        ((hx8) getMBinding()).H.B.setY(0.0f);
        this.userActionHandler.postDelayed(new Runnable() { // from class: tp8
            @Override // java.lang.Runnable
            public final void run() {
                FaceDetailFragment.showBullet$lambda$33(this.f34911a);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showBullet$lambda$33(final FaceDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((hx8) this$0.getMBinding()).H.B.animate().translationY(-((hx8) this$0.getMBinding()).H.B.getHeight()).setDuration(300L).withEndAction(new Runnable() { // from class: wq8
            @Override // java.lang.Runnable
            public final void run() {
                FaceDetailFragment.showBullet$lambda$33$lambda$32(this.f38249a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showBullet$lambda$33$lambda$32(FaceDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConstraintLayout bulletScreen = ((hx8) this$0.getMBinding()).H.B;
        Intrinsics.checkNotNullExpressionValue(bulletScreen, "bulletScreen");
        ViewExtKt.invisible(bulletScreen);
        this$0.currentActionIndex++;
        Handler handler = this$0.userActionHandler;
        final Function0<Unit> function0 = this$0.userActionRunnable;
        handler.post(new Runnable() { // from class: uq8
            @Override // java.lang.Runnable
            public final void run() {
                FaceDetailFragment.showBullet$lambda$33$lambda$32$lambda$31(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBullet$lambda$33$lambda$32$lambda$31(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final void showFullDialog(final String path) {
        new CommonDialog.c("face_replace_desc").setDialogDescription(p1j.R0).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceDetailFragment.showFullDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    FaceDetailFragment.this.setButton1();
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                FaceDetailFragment.this.getProgressDialog().showIfNeed(FaceDetailFragment.this.getParentFragmentManager());
                FaceDetailFragment.this.getProgressDialog().setTitle(p1j.common_installing);
                FaceDetailFragment.this.getProgressDialog().setProgress(0);
                FaceDetailFragment.installBleFace$default(FaceDetailFragment.this, path, 0L, 0L, false, false, 16, null);
            }
        }).showIfNeed(getParentFragmentManager());
    }

    private final void showPowerLevelDialog() {
        new CommonDialog.c("power level tips").setDialogTitle(p1j.K).setCustomView(LayoutInflater.from(requireContext()).inflate(ovi.S, (ViewGroup) null)).setPositiveText(p1j.J).create().showIfNeed(getParentFragmentManager());
    }

    private final void syncFace() {
        ld8.c().l(new FaceInstallEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void toDismissDialog() {
        ((FaceDetailViewModel) getMViewModel()).dismissProgress();
    }

    private final void trackClick(int type) {
        String id;
        String model;
        String firmwareVersion;
        String name;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.0.0.0.40117");
        Object[] objArr = new Object[16];
        objArr[0] = "btn_name";
        objArr[1] = "watchface_button";
        objArr[2] = "asset_id";
        WatchFace mInfo = getMInfo();
        String str = "";
        if (mInfo == null || (id = mInfo.getId()) == null) {
            id = "";
        }
        objArr[3] = id;
        objArr[4] = "test_type";
        objArr[5] = Integer.valueOf(type);
        objArr[6] = "device_model";
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || (model = DeviceModelExtKt.getModel(mDeviceModel)) == null) {
            model = "";
        }
        objArr[7] = model;
        objArr[8] = "source";
        objArr[9] = String.valueOf(this.pageSource);
        objArr[10] = "utm_source";
        objArr[11] = String.valueOf(this.utmSource);
        objArr[12] = "device_version";
        WearableDeviceModel mDeviceModel2 = getMDeviceModel();
        if (mDeviceModel2 == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(mDeviceModel2)) == null) {
            firmwareVersion = "";
        }
        objArr[13] = firmwareVersion;
        objArr[14] = OneTrack.Param.ASSET_NAME;
        WatchFace mInfo2 = getMInfo();
        if (mInfo2 != null && (name = mInfo2.getName()) != null) {
            str = name;
        }
        objArr[15] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    private final void trackExpose() {
        String id;
        String name;
        String tabName;
        String model;
        String firmwareVersion;
        if (getMBrowseFaceStartTime() <= 0) {
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - getMBrowseFaceStartTime()) / ((long) 1000);
        setMBrowseFaceStartTime(0L);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.47.1.1.19539");
        Object[] objArr = new Object[26];
        int i = 0;
        objArr[0] = "name";
        objArr[1] = "watchface_detail_page";
        objArr[2] = "position_id";
        objArr[3] = Integer.valueOf(this.positionId);
        objArr[4] = PAGE_NAME;
        objArr[5] = this.pageName;
        objArr[6] = "source";
        objArr[7] = String.valueOf(this.pageSource);
        objArr[8] = "utm_source";
        objArr[9] = String.valueOf(this.utmSource);
        objArr[10] = "duration_sec";
        objArr[11] = Long.valueOf(jCurrentTimeMillis);
        objArr[12] = "asset_id";
        WatchFace mInfo = getMInfo();
        String str = "";
        if (mInfo == null || (id = mInfo.getId()) == null) {
            id = "";
        }
        objArr[13] = id;
        objArr[14] = OneTrack.Param.ASSET_NAME;
        WatchFace mInfo2 = getMInfo();
        if (mInfo2 == null || (name = mInfo2.getName()) == null) {
            name = "";
        }
        objArr[15] = name;
        objArr[16] = HealthTabOneTrackExtKt.KEY_TYPE_NUM;
        WatchFace mInfo3 = getMInfo();
        objArr[17] = Integer.valueOf(mInfo3 != null ? mInfo3.getTabId() : 0);
        objArr[18] = "type_str";
        WatchFace mInfo4 = getMInfo();
        if (mInfo4 == null || (tabName = mInfo4.getTabName()) == null) {
            tabName = "";
        }
        objArr[19] = tabName;
        objArr[20] = "type_sku";
        FaceData mRequestData = getMRequestData();
        if (mRequestData != null && mRequestData.isPurchaseFace()) {
            i = 1;
        }
        objArr[21] = Integer.valueOf(i);
        objArr[22] = "device_model";
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || (model = DeviceModelExtKt.getModel(mDeviceModel)) == null) {
            model = "";
        }
        objArr[23] = model;
        objArr[24] = "device_version";
        WearableDeviceModel mDeviceModel2 = getMDeviceModel();
        if (mDeviceModel2 != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(mDeviceModel2)) != null) {
            str = firmwareVersion;
        }
        objArr[25] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollViewEffectiveExposeBiz trackExpose_delegate$lambda$1() {
        return new ScrollViewEffectiveExposeBiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object unzip(boolean z, Continuation<? super File> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C33322(z, null), continuation);
    }

    public static /* synthetic */ Object unzip$default(FaceDetailFragment faceDetailFragment, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return faceDetailFragment.unzip(z, continuation);
    }

    private final void unzipAndInstall(File zipFile) {
        AnyExtKt.io$default(null, new C33331(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userActionRunnable$lambda$27(FaceDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showBullet(this$0.currentActionIndex);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase, com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ovi.g;
    }

    public final FaceDialog getProgressDialog() {
        return (FaceDialog) this.progressDialog.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.stackTop = true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (this.installing) {
            return true;
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        if (Intrinsics.areEqual(v, ((hx8) getMBinding()).A)) {
            checkConnect(new Function0() { // from class: iq8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FaceDetailFragment.onClick$lambda$35(this.f21990a);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(v, ((hx8) getMBinding()).I)) {
            FaceData mRequestData = getMRequestData();
            if (mRequestData == null || !mRequestData.canPurchase()) {
                intentInstallOrUpdate(false);
                return;
            }
            if (NetworkExtKt.isNetworkAvailable()) {
                requestPay();
                return;
            }
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_hint_network_unavailable);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(v, ((hx8) getMBinding()).D)) {
            trackClick(3);
            requestEdit();
            return;
        }
        if (!Intrinsics.areEqual(v, ((hx8) getMBinding()).P)) {
            if (Intrinsics.areEqual(v, ((hx8) getMBinding()).U)) {
                intentInstallOrUpdate(true);
            }
        } else {
            if (NetworkExtKt.isNetworkAvailable()) {
                requestPay();
                return;
            }
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, p1j.common_hint_network_unavailable);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        resizeButtonGroup();
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.userActionHandler.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        trackExpose();
        ((FaceDetailViewModel) getMViewModel()).getLiveData().removeObservers(getViewLifecycleOwner());
        ((FaceDetailViewModel) getMViewModel()).getInstallFaceProgress().removeObservers(getViewLifecycleOwner());
        ((FaceDetailViewModel) getMViewModel()).getDismissDialogLiveData().removeObservers(getViewLifecycleOwner());
        setMInfo(null);
        setMRequestData(null);
        this.faceDataWrapper = null;
        setMRequestData(null);
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void onFaceSet(boolean success) {
        super.onFaceSet(success);
        Logger.i(TAG, "onFaceSet: success = " + success + "; installed = " + getMInstalled());
        doFaceSwitchFinish();
        toDismissDialog();
        FaceManager faceManager = FaceManager.INSTANCE;
        WatchFace mInfo = getMInfo();
        WatchFace face = faceManager.getFace(mInfo != null ? mInfo.getId() : null);
        if (face == null) {
            face = getMInfo();
        }
        setMInfo(face);
        setButton1();
        this.installing = false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        FaceLowLatencyRequester.INSTANCE.reset();
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void onMessageEvent(@NotNull orf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        if (event instanceof FaceReSycEvent) {
            FaceManager faceManager = FaceManager.INSTANCE;
            WatchFace mInfo = getMInfo();
            if (faceManager.getFace(mInfo != null ? mInfo.getId() : null) == null) {
                setButton1();
            } else {
                finishInstall();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        showLoading();
        setInitLoadingTime(System.currentTimeMillis());
        ((FaceDetailViewModel) getMViewModel()).requestData(getRealFaceId());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        try {
            MemoryCache memoryCache = Coil.imageLoader(ApplicationExtKt.getApplication()).getMemoryCache();
            if (memoryCache != null) {
                memoryCache.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitleBar$default(this, false, 1, null);
        dismissProgressIfRebuild();
        resizeButtonGroup();
        ((hx8) getMBinding()).H.q0(tv1.d, getMViewModel());
        ((hx8) getMBinding()).H.getRoot().setOnClickListener(new View.OnClickListener() { // from class: up8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FaceDetailFragment.onViewCreated$lambda$2(this.f35995a, view2);
            }
        });
        ((FaceDetailViewModel) getMViewModel()).getLiveData().observe(getViewLifecycleOwner(), new FaceDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vp8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDetailFragment.onViewCreated$lambda$4(this.f37102a, (FaceDetailViewModel.FaceDetailLiveData) obj);
            }
        }));
        ((FaceDetailViewModel) getMViewModel()).getInstallFaceProgress().observe(getViewLifecycleOwner(), new FaceDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wp8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDetailFragment.onViewCreated$lambda$5(this.f38209a, (Integer) obj);
            }
        }));
        ((FaceDetailViewModel) getMViewModel()).getDismissDialogLiveData().observe(getViewLifecycleOwner(), new FaceDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xp8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDetailFragment.onViewCreated$lambda$6(this.f39330a, (Boolean) obj);
            }
        }));
        ((hx8) getMBinding()).I.setOnClickListener(this);
        ((hx8) getMBinding()).D.setOnClickListener(this);
        ((hx8) getMBinding()).P.setOnClickListener(this);
        ((hx8) getMBinding()).U.setOnClickListener(this);
        Bundle arguments = getArguments();
        this.isPhotoFace = arguments != null ? arguments.getBoolean(IS_PHOTO_FACE) : false;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString(PAGE_NAME)) == null) {
            string = "";
        }
        this.pageName = string;
        Bundle arguments3 = getArguments();
        this.pageSource = arguments3 != null ? arguments3.getInt(PAGE_SOURCE) : 0;
        Bundle arguments4 = getArguments();
        this.positionId = arguments4 != null ? arguments4.getInt("position_id") : 0;
        Bundle arguments5 = getArguments();
        this.utmSource = arguments5 != null ? arguments5.getInt("utm_source") : 0;
        WatchFace mInfo = getMInfo();
        String id = mInfo != null ? mInfo.getId() : null;
        Logger.i(TAG, id + " isPhotoFace: " + this.isPhotoFace);
        if (this.isPhotoFace) {
            FaceManager faceManager = FaceManager.INSTANCE;
            WatchFace mInfo2 = getMInfo();
            String templateId = faceManager.getTemplateId(mInfo2 != null ? mInfo2.getId() : null);
            this.templateId = templateId != null ? templateId : "";
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        FaceLowLatencyRequester.INSTANCE.startTimer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void setButton1() {
        WatchFace mInfo;
        super.setButton1();
        setTitleBar$default(this, false, 1, null);
        ConstraintLayout purchaseButtonNew = ((hx8) getMBinding()).O;
        Intrinsics.checkNotNullExpressionValue(purchaseButtonNew, "purchaseButtonNew");
        ViewExtKt.gone(purchaseButtonNew);
        if (((FaceDetailViewModel) getMViewModel()).getSupportTrial() && FaceManager.INSTANCE.isTryOut(getMInfo(), getMRequestData())) {
            Logger.i(TAG, "setTryOutButton");
            setCanPurchaseButton();
            return;
        }
        FaceData mRequestData = getMRequestData();
        if (mRequestData != null && mRequestData.canPurchase()) {
            Logger.i(TAG, "setCanPurchaseButton");
            setCanPurchaseButton();
            return;
        }
        FaceData mRequestData2 = getMRequestData();
        if (mRequestData2 != null && mRequestData2.isVip()) {
            FaceManager faceManager = FaceManager.INSTANCE;
            WatchFace mInfo2 = getMInfo();
            if (!faceManager.isInstalled(mInfo2 != null ? mInfo2.getId() : null)) {
                Logger.i(TAG, "setVipButton");
                setVipButton();
                return;
            }
        }
        FaceManager faceManager2 = FaceManager.INSTANCE;
        WatchFace mInfo3 = getMInfo();
        if (!faceManager2.isInstalled(mInfo3 != null ? mInfo3.getId() : null)) {
            Logger.i(TAG, "setUninstallButton");
            setUninstallButton();
            return;
        }
        if (faceManager2.canUpgrade(getMInfo(), getMDeviceModel())) {
            Logger.i(TAG, "setCanUpgradeButton");
            setCanUpgradeButton();
            return;
        }
        if (((FaceDetailViewModel) getMViewModel()).getSupportZip() && (mInfo = getMInfo()) != null && mInfo.getCanEdit()) {
            Logger.i(TAG, "setCanEditButton");
            setCanEditButton();
            return;
        }
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            Logger.i(TAG, "setNormalButton");
            setNormalButton();
        } else {
            Logger.i(TAG, "setNormalHuamiButton");
            setNormalHuamiButton();
        }
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void setFace() {
        super.setFace();
        checkConnect(new Function0() { // from class: pq8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailFragment.setFace$lambda$45(this.f30639a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void setImageView() {
        WatchFace mInfo = getMInfo();
        if (mInfo != null && mInfo.getFaceType() == 4) {
            WatchFace mInfo2 = getMInfo();
            String styleUrl = mInfo2 != null ? mInfo2.getStyleUrl() : null;
            if (styleUrl != null && styleUrl.length() != 0) {
                FaceEditPreviewView styleView = ((hx8) getMBinding()).H.F;
                Intrinsics.checkNotNullExpressionValue(styleView, "styleView");
                ViewExtKt.visible(styleView);
                FaceManager faceManager = FaceManager.INSTANCE;
                WatchFace mInfo3 = getMInfo();
                Intrinsics.checkNotNull(mInfo3);
                String styleUrl2 = mInfo3.getStyleUrl();
                FaceEditPreviewView styleView2 = ((hx8) getMBinding()).H.F;
                Intrinsics.checkNotNullExpressionValue(styleView2, "styleView");
                faceManager.loadFaceUrl(styleUrl2, styleView2, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            }
        }
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        String bigIcon = mDeviceModel != null ? DeviceModelExtKt.getBigIcon(mDeviceModel) : null;
        int i = noi.P;
        WearableDeviceModel mDeviceModel2 = getMDeviceModel();
        if (mDeviceModel2 != null && DeviceModelExtKt.isBandType(mDeviceModel2)) {
            i = noi.O;
        }
        ImageView outlineView = ((hx8) getMBinding()).H.E;
        Intrinsics.checkNotNullExpressionValue(outlineView, "outlineView");
        ImageLoader imageLoader = Coil.imageLoader(outlineView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(outlineView.getContext()).data(bigIcon).target(outlineView);
        builderTarget.placeholder(i);
        builderTarget.size(ExtUtilsKt.getDp(320));
        imageLoader.enqueue(builderTarget.build());
        ((hx8) getMBinding()).H.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.watch.face.FaceDetailFragment.setImageView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                FaceDetailFragment faceDetailFragment = FaceDetailFragment.this;
                faceDetailFragment.headerHeight = FaceDetailFragment.access$getMBinding(faceDetailFragment).H.getRoot().getHeight();
                FaceDetailFragment faceDetailFragment2 = FaceDetailFragment.this;
                faceDetailFragment2.expandPathLength = FaceDetailFragment.access$getMBinding(faceDetailFragment2).S.getHeight() - FaceDetailFragment.this.headerHeight;
                FaceDetailFragment.access$getMBinding(FaceDetailFragment.this).H.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Logger.i(FaceDetailFragment.TAG, "headerHeight = " + FaceDetailFragment.this.headerHeight);
            }
        });
    }
}
