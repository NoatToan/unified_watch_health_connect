package com.xiaomi.fitness.watch.face;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.watch.face.FaceInfoBleFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceStyleAdapter;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.data.FacePhotoItem;
import com.xiaomi.fitness.watch.face.db.FaceBleMultiPhoto;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.WatchFaceDao;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.event.FaceInstallEvent;
import com.xiaomi.fitness.watch.face.event.FaceReSycEvent;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.FaceDownloadResultV2;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.fitness.watch.face.helper.FaceZhouHaiHelper;
import com.xiaomi.fitness.watch.face.helper.FaceZhouHaiListener;
import com.xiaomi.fitness.watch.face.impl.Callback;
import com.xiaomi.fitness.watch.face.request.FaceDetailResultV2;
import com.xiaomi.fitness.watch.face.view.FaceColorPickView;
import com.xiaomi.fitness.watch.face.view.FaceFunView;
import com.xiaomi.fitness.watch.face.view.FaceLayerColorView;
import com.xiaomi.fitness.watch.face.view.FaceLayerFunView;
import com.xiaomi.fitness.watch.face.view.FunInfo;
import com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel;
import com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModelKt;
import com.xiaomi.fitness.watch.face.widget.FaceDialog;
import com.xiaomi.fitness.watch.face.widget.PhotoBgPicker;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.av6;
import defpackage.gyi;
import defpackage.im9;
import defpackage.isi;
import defpackage.kq2;
import defpackage.l6a;
import defpackage.ld8;
import defpackage.orf;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.s5r;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002Õ\u0001\b\u0017\u0018\u0000 ü\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002ü\u0001B\b¢\u0006\u0005\bû\u0001\u0010\u0010J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010\u001bJ\u000f\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010\u0007J\u0019\u0010)\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u0010J\u0019\u0010-\u001a\u00020\f2\b\b\u0002\u0010,\u001a\u00020\u0005H\u0002¢\u0006\u0004\b-\u0010*J\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0010J\u001d\u00101\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0005H\u0002¢\u0006\u0004\b3\u0010\u0007J\u001d\u00107\u001a\u00020\f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0005H\u0002¢\u0006\u0004\b:\u0010*J\u000f\u0010;\u001a\u00020\fH\u0002¢\u0006\u0004\b;\u0010\u0010J\u000f\u0010<\u001a\u00020\fH\u0002¢\u0006\u0004\b<\u0010\u0010J\u0017\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\f2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bA\u0010@J%\u0010E\u001a\u00020\f2\u0014\u0010D\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020\f0BH\u0002¢\u0006\u0004\bE\u0010FJ'\u0010J\u001a\u00020\f2\u0006\u0010>\u001a\u00020=2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020GH\u0002¢\u0006\u0004\bJ\u0010KJ)\u0010O\u001a\u00020\f2\u0006\u0010>\u001a\u00020=2\u0006\u0010M\u001a\u00020L2\b\u0010N\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\f2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\bU\u0010\u001bJ\u000f\u0010V\u001a\u00020\fH\u0002¢\u0006\u0004\bV\u0010\u0010J\u000f\u0010W\u001a\u00020\fH\u0002¢\u0006\u0004\bW\u0010\u0010J)\u0010X\u001a\u00020\f2\u0006\u0010>\u001a\u00020=2\u0006\u0010M\u001a\u00020L2\b\u0010N\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bX\u0010PJ\u0013\u0010Z\u001a\u0006\u0012\u0002\b\u00030YH\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\\\u0010\u0007J\r\u0010]\u001a\u00020\u0005¢\u0006\u0004\b]\u0010\u0007J\u000f\u0010^\u001a\u00020\u0005H\u0014¢\u0006\u0004\b^\u0010\u0007J\u000f\u0010_\u001a\u00020\fH\u0016¢\u0006\u0004\b_\u0010\u0010J\u000f\u0010`\u001a\u00020\fH\u0016¢\u0006\u0004\b`\u0010\u0010J!\u0010e\u001a\u00020\f2\u0006\u0010b\u001a\u00020a2\b\u0010d\u001a\u0004\u0018\u00010cH\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\fH\u0014¢\u0006\u0004\bg\u0010\u0010J\u0017\u0010i\u001a\u00020\f2\u0006\u0010h\u001a\u00020\u0005H\u0014¢\u0006\u0004\bi\u0010*J\u0017\u0010l\u001a\u00020\f2\u0006\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\f2\u0006\u0010n\u001a\u00020\u0005H\u0014¢\u0006\u0004\bo\u0010*J\u000f\u0010p\u001a\u00020\fH\u0014¢\u0006\u0004\bp\u0010\u0010J\u0017\u0010r\u001a\u00020\f2\u0006\u0010q\u001a\u00020aH\u0016¢\u0006\u0004\br\u0010sJ)\u0010w\u001a\u00020\f2\u0006\u0010t\u001a\u00020\u00182\u0006\u0010u\u001a\u00020\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010vH\u0016¢\u0006\u0004\bw\u0010xJ'\u0010z\u001a\u00020\f2\u0006\u0010h\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010D\u001a\u0004\u0018\u00010y¢\u0006\u0004\bz\u0010{J\r\u0010|\u001a\u00020\f¢\u0006\u0004\b|\u0010\u0010J0\u0010\u0080\u0001\u001a\u00020\f2\u0006\u0010t\u001a\u00020\u00182\f\u0010}\u001a\b\u0012\u0004\u0012\u00020L042\u0006\u0010\u007f\u001a\u00020~H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020\u0005H\u0016¢\u0006\u0005\b\u0082\u0001\u0010\u0007J\u0011\u0010\u0083\u0001\u001a\u00020\fH\u0014¢\u0006\u0005\b\u0083\u0001\u0010\u0010J\u0011\u0010\u0084\u0001\u001a\u00020\fH\u0014¢\u0006\u0005\b\u0084\u0001\u0010\u0010J\u0011\u0010\u0085\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u0085\u0001\u0010\u0010R\u0017\u0010\u0086\u0001\u001a\u00020L8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R*\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u0010\u009b\u0001\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0087\u0001R#\u0010\u009f\u0001\u001a\u0006\u0012\u0002\b\u00030Y8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010[R*\u0010¡\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R)\u0010§\u0001\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010\u0087\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R1\u0010±\u0001\u001a\u00020\u00052\u0007\u0010¬\u0001\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0005\b¯\u0001\u0010\u0007\"\u0005\b°\u0001\u0010*R\u0019\u0010²\u0001\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010\u0087\u0001R\u0019\u0010³\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R)\u0010µ\u0001\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010\u0087\u0001\u001a\u0006\b¶\u0001\u0010©\u0001\"\u0006\b·\u0001\u0010«\u0001R)\u0010¸\u0001\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010\u0087\u0001\u001a\u0006\b¹\u0001\u0010©\u0001\"\u0006\bº\u0001\u0010«\u0001R'\u0010»\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0005\b»\u0001\u0010\u0007\"\u0005\b½\u0001\u0010*R+\u0010Ã\u0001\u001a\r ¿\u0001*\u0005\u0018\u00010¾\u00010¾\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÀ\u0001\u0010\u009d\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R'\u0010Ä\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÄ\u0001\u0010¼\u0001\u001a\u0005\bÅ\u0001\u0010\u0007\"\u0005\bÆ\u0001\u0010*R\u0019\u0010Ç\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010´\u0001R\u001e\u0010É\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u001e\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ê\u0001R\u001b\u0010Ì\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010\u0087\u0001R\u001b\u0010Í\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0087\u0001R\u0019\u0010Î\u0001\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010\u0087\u0001R\u001e\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001e\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00020Q0Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ñ\u0001R\u001f\u0010Ô\u0001\u001a\n\u0012\u0005\u0012\u00030Ó\u00010Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Ñ\u0001R\u0018\u0010Ö\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001b\u0010Ø\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010\u0087\u0001R+\u0010Ù\u0001\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÙ\u0001\u0010\u0087\u0001\u001a\u0006\bÚ\u0001\u0010©\u0001\"\u0006\bÛ\u0001\u0010«\u0001R\u0019\u0010Ü\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010¼\u0001R$\u0010ß\u0001\u001a\n\u0012\u0005\u0012\u00030Þ\u00010Ý\u00018\u0006¢\u0006\u0010\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001R0\u0010ã\u0001\u001a\t\u0012\u0004\u0012\u00020L0Ý\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bã\u0001\u0010à\u0001\u001a\u0006\bä\u0001\u0010â\u0001\"\u0006\bå\u0001\u0010æ\u0001R(\u0010ç\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bç\u0001\u0010´\u0001\u001a\u0006\bè\u0001\u0010é\u0001\"\u0005\bê\u0001\u0010\u001bR'\u0010ë\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bë\u0001\u0010¼\u0001\u001a\u0005\bì\u0001\u0010\u0007\"\u0005\bí\u0001\u0010*R'\u0010î\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bî\u0001\u0010¼\u0001\u001a\u0005\bï\u0001\u0010\u0007\"\u0005\bð\u0001\u0010*R\u0016\u0010ñ\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bñ\u0001\u0010\u0007R\u0016\u0010ò\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bò\u0001\u0010\u0007R\u0016\u0010ó\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bó\u0001\u0010\u0007R\u0016\u0010ô\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bô\u0001\u0010\u0007R\u0017\u0010ö\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\b\u001a\u0006\bõ\u0001\u0010é\u0001R\u0017\u0010ø\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010é\u0001R\r\u0010ú\u0001\u001a\u00030ù\u00018\u0016X\u0096\u0005¨\u0006ý\u0001"}, d2 = {"Lcom/xiaomi/fitness/watch/face/FaceInfoBleFragment;", "Lcom/xiaomi/fitness/watch/face/FaceInfoBase;", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel;", "Ll6a;", "Lkotlinx/coroutines/CoroutineScope;", "", "isListChanged", "()Z", "spiritColorChanged", "bgColorChanged", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "data", "", "setDataAndAction", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "initSelectView", "()V", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;", "ext", "initMulanPhotoWatchfaceView", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;)V", "hasBgImg", "loadSpiritColorView", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;Z)V", "", "code", "onDelete", "(I)V", "initEditData", "setExtraData", "setExtraPhotoFaceData", "initAodFace", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$EditRet;", "editRet", "onEditResult", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$EditRet;)V", "editFail", BroadcastsKt.SILENT_PUSHING_PROGRESS, "onImgTransfer", "isMultiPhotoFace", "showToast", "finishEdit", "(Z)V", "syncFace", "afterDownload", "installZhouHaiPhotoFace", "installOrUpdate", "Lkotlin/Function0;", "action", "checkConnect", "(Lkotlin/jvm/functions/Function0;)V", "funChanged", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;", "default", "initFunList", "([Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;)V", "isMultiPhoto", "openGallery", "pickerColor", "actionBtn1", "Ljava/io/File;", "file", HuamiUpgradeFragment.DOWNLOAD_TAG, "(Ljava/io/File;)V", "doDownload", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2;", "result", "requestDownload", "(Lkotlin/jvm/functions/Function1;)V", "", "version", MediaStoreUtil.MediaInfo.SIZE, "installBleFace", "(Ljava/io/File;JJ)V", "", "id", "segmentLength", "doInstallFace", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$DownloadRet;", Constants.KEY_PAY_RESULT_RET, "onDownload", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$DownloadRet;)V", "onBlePushProgress", "doDuplicate", "onRealDismissDialog", "onM69LowStorage", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "createConfirmExitDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "isSetChanged", "styleChanged", "bgImgChanged", LifecycleConstantKt.ON_STOP, "onDestroyView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setButton1", "success", "onFaceSet", "Lorf;", "event", "onMessageEvent", "(Lorf;)V", "isCurrent", "reqEdit", "setFace", "v", "onClick", "(Landroid/view/View;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "onActivityResult", "(IILandroid/content/Intent;)V", "Ls5r;", "onBleInstallRet", "(ZILs5r;)V", "dismissProgress", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onBackPressed", "onVisible", "onInvisible", LifecycleConstantKt.ON_DESTROY, "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/watch/face/view/FaceLayerColorView;", "colorView", "Lcom/xiaomi/fitness/watch/face/view/FaceLayerColorView;", "Lcom/xiaomi/fitness/watch/face/view/FaceFunView;", "funSlectView", "Lcom/xiaomi/fitness/watch/face/view/FaceFunView;", "Landroidx/recyclerview/widget/RecyclerView;", "styleRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "multiFaceLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "mFaceSize", "F", "getMFaceSize", "()F", "setMFaceSize", "(F)V", "spiritColor", "mConfirmExitDialog$delegate", "Lkotlin/Lazy;", "getMConfirmExitDialog", "mConfirmExitDialog", "Lcom/xiaomi/fitness/watch/face/widget/PhotoBgPicker;", "mPhotoPicker", "Lcom/xiaomi/fitness/watch/face/widget/PhotoBgPicker;", "getMPhotoPicker", "()Lcom/xiaomi/fitness/watch/face/widget/PhotoBgPicker;", "setMPhotoPicker", "(Lcom/xiaomi/fitness/watch/face/widget/PhotoBgPicker;)V", "photoId", "getPhotoId", "()Ljava/lang/String;", "setPhotoId", "(Ljava/lang/String;)V", "<set-?>", "setChanged$delegate", "Lkotlin/properties/ReadWriteProperty;", "getSetChanged", "setSetChanged", "setChanged", "bgColor", "originSize", "I", "bgImgMd5", "getBgImgMd5", "setBgImgMd5", "styleId", "getStyleId", "setStyleId", "isEditing", "Z", "setEditing", "Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "kotlin.jvm.PlatformType", "progressDialog$delegate", "getProgressDialog", "()Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "progressDialog", "progressShowing", "getProgressShowing", "setProgressShowing", "usedProgress", "Ljava/util/ArrayList;", "funList", "Ljava/util/ArrayList;", "preFunList", "license", "sign", "deviceShowImage", "Landroidx/lifecycle/Observer;", "bgImgTransferObserver", "Landroidx/lifecycle/Observer;", "downloadObserver", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$FaceInstallRet;", "faceInstallRetObserver", "com/xiaomi/fitness/watch/face/FaceInfoBleFragment$mFaceZhouHaiListener$1", "mFaceZhouHaiListener", "Lcom/xiaomi/fitness/watch/face/FaceInfoBleFragment$mFaceZhouHaiListener$1;", "mCurStyleUrl", "mCurBgImgPath", "getMCurBgImgPath", "setMCurBgImgPath", "imgNotFound", "", "Lcom/xiaomi/fitness/watch/face/data/FacePhotoItem;", "bgImgNewList", "Ljava/util/List;", "getBgImgNewList", "()Ljava/util/List;", "originMd5List", "getOriginMd5List", "setOriginMd5List", "(Ljava/util/List;)V", "editCode", "getEditCode", "()I", "setEditCode", "hasDelete", "getHasDelete", "setHasDelete", "editCurrent", "getEditCurrent", "setEditCurrent", "isMulanPhotoFace", "isM69PhotoFace", "isM65APhotoFace", "isZhouHaiPhotoFace", "getZhouHaiDeviceType", "zhouHaiDeviceType", "getLayoutId", "layoutId", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceInfoBleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceInfoBleFragment.kt\ncom/xiaomi/fitness/watch/face/FaceInfoBleFragment\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1526:1\n33#2,3:1527\n54#3,3:1530\n24#3:1533\n57#3,6:1534\n63#3,2:1541\n57#4:1540\n1#5:1543\n*S KotlinDebug\n*F\n+ 1 FaceInfoBleFragment.kt\ncom/xiaomi/fitness/watch/face/FaceInfoBleFragment\n*L\n100#1:1527,3\n665#1:1530,3\n665#1:1533\n665#1:1534,6\n665#1:1541,2\n665#1:1540\n*E\n"})
public class FaceInfoBleFragment extends Hilt_FaceInfoBleFragment<FaceBleInfoViewModel, l6a> implements CoroutineScope {
    public static final int CROP_REQUEST_CODE = 34;
    public static final int SELECT_REQUEST_CODE = 17;

    @NotNull
    private String bgColor;

    @NotNull
    private String bgImgMd5;

    @NotNull
    private final List<FacePhotoItem> bgImgNewList;

    @NotNull
    private final Observer<Integer> bgImgTransferObserver;
    private FaceLayerColorView colorView;

    @NotNull
    private String deviceShowImage;

    @NotNull
    private final Observer<FaceBleInfoViewModel.DownloadRet> downloadObserver;
    private int editCode;
    private boolean editCurrent;

    @NotNull
    private final Observer<FaceBleInfoViewModel.FaceInstallRet> faceInstallRetObserver;

    @NotNull
    private final ArrayList<Integer> funList;
    private FaceFunView funSlectView;
    private boolean hasDelete;
    private boolean imgNotFound;
    private boolean isEditing;

    @Nullable
    private String license;

    @Nullable
    private String mCurBgImgPath;

    @Nullable
    private String mCurStyleUrl;
    private float mFaceSize;

    @NotNull
    private final FaceInfoBleFragment$mFaceZhouHaiListener$1 mFaceZhouHaiListener;
    public PhotoBgPicker mPhotoPicker;
    private ConstraintLayout multiFaceLayout;

    @NotNull
    private List<String> originMd5List;
    private int originSize;

    @NotNull
    private final ArrayList<Integer> preFunList;

    /* JADX INFO: renamed from: progressDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressDialog;
    private boolean progressShowing;

    /* JADX INFO: renamed from: setChanged$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty setChanged;

    @Nullable
    private String sign;

    @NotNull
    private String styleId;
    private RecyclerView styleRecyclerView;
    private int usedProgress;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FaceInfoBleFragment.class, "setChanged", "getSetChanged()Z", 0))};
    private final /* synthetic */ CoroutineScope $$delegate_0 = CoroutineScopeKt.MainScope();

    @NotNull
    private final String TAG = "FaceInfoBleFragment";

    @NotNull
    private String spiritColor = "";

    /* JADX INFO: renamed from: mConfirmExitDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mConfirmExitDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oz8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceInfoBleFragment.mConfirmExitDialog_delegate$lambda$0(this.f29839a);
        }
    });

    @NotNull
    private String photoId = "";

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$initMulanPhotoWatchfaceView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoBleFragment$initMulanPhotoWatchfaceView$1", f = "FaceInfoBleFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FaceData.BleExt $ext;
        final /* synthetic */ boolean $hasBgImg;
        int label;
        final /* synthetic */ FaceInfoBleFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33441(boolean z, FaceInfoBleFragment faceInfoBleFragment, FaceData.BleExt bleExt, Continuation<? super C33441> continuation) {
            super(2, continuation);
            this.$hasBgImg = z;
            this.this$0 = faceInfoBleFragment;
            this.$ext = bleExt;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33441(this.$hasBgImg, this.this$0, this.$ext, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$hasBgImg) {
                this.this$0.getImgLabelView().setVisibility(0);
            }
            String mCurBgImgPath = this.this$0.getMCurBgImgPath();
            if (mCurBgImgPath == null || mCurBgImgPath.length() == 0) {
                FaceManager.INSTANCE.loadFaceUrl(this.$ext.getBottom_background(), this.this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            } else {
                FaceManager faceManager = FaceManager.INSTANCE;
                String mCurBgImgPath2 = this.this$0.getMCurBgImgPath();
                Intrinsics.checkNotNull(mCurBgImgPath2);
                faceManager.loadFaceFile(new File(FaceBlePhotoFragmentKt.getPngPath(mCurBgImgPath2)), this.this$0.getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
            }
            if (this.$ext.hasSpirit()) {
                this.this$0.loadSpiritColorView(this.$ext, this.$hasBgImg);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$onBleInstallRet$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoBleFragment$onBleInstallRet$1", f = "FaceInfoBleFragment.kt", i = {}, l = {1343}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33451(Continuation<? super C33451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceInfoBleFragment.this.new C33451(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String photoId = FaceInfoBleFragment.this.getPhotoId();
                long jCurrentTimeMillis = System.currentTimeMillis();
                WearableDeviceModel mDeviceModel = FaceInfoBleFragment.this.getMDeviceModel();
                FaceCommonEntity faceCommonEntity = new FaceCommonEntity(photoId, Boxing.boxLong(jCurrentTimeMillis), mDeviceModel != null ? mDeviceModel.getDid() : null, FaceInfoBleFragment.this.getFaceId(), null, FaceInfoBleFragment.this.spiritColor, null, FaceInfoBleFragment.this.getBgImgMd5(), FaceInfoBleFragment.this.getMCurBgImgPath(), null, 592, null);
                Logger.i("save photo: " + faceCommonEntity, new Object[0]);
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
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$onDelete$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoBleFragment$onDelete$1", f = "FaceInfoBleFragment.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33461(Continuation<? super C33461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceInfoBleFragment.this.new C33461(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                String photoId = FaceInfoBleFragment.this.getPhotoId();
                this.label = 1;
                if (watchFaceDao.deleteWatchFace(photoId, this) == coroutine_suspended) {
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
            return ((C33461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$onEditResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoBleFragment$onEditResult$1", f = "FaceInfoBleFragment.kt", i = {}, l = {707}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LinkedList<FaceBleMultiPhoto> $list;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33471(LinkedList<FaceBleMultiPhoto> linkedList, Continuation<? super C33471> continuation) {
            super(2, continuation);
            this.$list = linkedList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceInfoBleFragment.this.new C33471(this.$list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String photoId = FaceInfoBleFragment.this.getPhotoId();
                Long lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                WearableDeviceModel mDeviceModel = FaceInfoBleFragment.this.getMDeviceModel();
                FaceCommonEntity faceCommonEntity = new FaceCommonEntity(photoId, lBoxLong, mDeviceModel != null ? mDeviceModel.getDid() : null, FaceInfoBleFragment.this.getFaceId(), null, null, null, null, null, this.$list, 496, null);
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
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$onImgTransfer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoBleFragment$onImgTransfer$1", f = "FaceInfoBleFragment.kt", i = {}, l = {774}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LinkedList<FaceBleMultiPhoto> $list;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33481(LinkedList<FaceBleMultiPhoto> linkedList, Continuation<? super C33481> continuation) {
            super(2, continuation);
            this.$list = linkedList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceInfoBleFragment.this.new C33481(this.$list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String photoId = FaceInfoBleFragment.this.getPhotoId();
                Long lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                WearableDeviceModel mDeviceModel = FaceInfoBleFragment.this.getMDeviceModel();
                FaceCommonEntity faceCommonEntity = new FaceCommonEntity(photoId, lBoxLong, mDeviceModel != null ? mDeviceModel.getDid() : null, FaceInfoBleFragment.this.getFaceId(), null, null, null, null, null, this.$list, 496, null);
                Logger.i(FaceInfoBleFragment.this.TAG, "saveBlePhotos: " + faceCommonEntity);
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
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$onImgTransfer$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoBleFragment$onImgTransfer$2", f = "FaceInfoBleFragment.kt", i = {}, l = {788}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33492 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33492(Continuation<? super C33492> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceInfoBleFragment.this.new C33492(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String photoId = FaceInfoBleFragment.this.getPhotoId();
                long jCurrentTimeMillis = System.currentTimeMillis();
                WearableDeviceModel mDeviceModel = FaceInfoBleFragment.this.getMDeviceModel();
                FaceCommonEntity faceCommonEntity = new FaceCommonEntity(photoId, Boxing.boxLong(jCurrentTimeMillis), mDeviceModel != null ? mDeviceModel.getDid() : null, FaceInfoBleFragment.this.getFaceId(), null, null, null, FaceInfoBleFragment.this.getBgImgMd5(), FaceInfoBleFragment.this.getMCurBgImgPath(), null, 624, null);
                Logger.i("save photo: " + faceCommonEntity, new Object[0]);
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
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33492) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$requestDownload$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoBleFragment$requestDownload$1", f = "FaceInfoBleFragment.kt", i = {}, l = {1217}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<FaceDownloadResultV2, Unit> $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C33531(Function1<? super FaceDownloadResultV2, Unit> function1, Continuation<? super C33531> continuation) {
            super(2, continuation);
            this.$result = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceInfoBleFragment.this.new C33531(this.$result, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceBleInfoViewModel faceBleInfoViewModelAccess$getMViewModel = FaceInfoBleFragment.access$getMViewModel(FaceInfoBleFragment.this);
                String faceId = FaceInfoBleFragment.this.getFaceId();
                Function1<FaceDownloadResultV2, Unit> function1 = this.$result;
                this.label = 1;
                if (faceBleInfoViewModelAccess$getMViewModel.requestDownload(faceId, function1, this) == coroutine_suspended) {
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
            return ((C33531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$setExtraPhotoFaceData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoBleFragment$setExtraPhotoFaceData$2", f = "FaceInfoBleFragment.kt", i = {}, l = {620}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33552 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<FaceCommonEntity> $faceBlePhoto;
        Object L$0;
        int label;
        final /* synthetic */ FaceInfoBleFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33552(Ref.ObjectRef<FaceCommonEntity> objectRef, FaceInfoBleFragment faceInfoBleFragment, Continuation<? super C33552> continuation) {
            super(2, continuation);
            this.$faceBlePhoto = objectRef;
            this.this$0 = faceInfoBleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33552(this.$faceBlePhoto, this.this$0, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<FaceCommonEntity> objectRef;
            T t;
            int size;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef<FaceCommonEntity> objectRef2 = this.$faceBlePhoto;
                WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                String photoId = this.this$0.getPhotoId();
                this.L$0 = objectRef2;
                this.label = 1;
                Object watchFace = watchFaceDao.getWatchFace(photoId, this);
                if (watchFace == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t = watchFace;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
            }
            objectRef.element = t;
            Logger.i(this.this$0.TAG, "faceBlePhoto:" + this.$faceBlePhoto.element);
            if (this.$faceBlePhoto.element != null && this.this$0.getMInfo() != null) {
                FaceInfoBleFragment faceInfoBleFragment = this.this$0;
                FaceCommonEntity faceCommonEntity = this.$faceBlePhoto.element;
                Intrinsics.checkNotNull(faceCommonEntity);
                List<FaceBleMultiPhoto> multiPhotoDataList = faceCommonEntity.getMultiPhotoDataList();
                if (multiPhotoDataList == null || multiPhotoDataList.isEmpty()) {
                    size = 0;
                } else {
                    FaceCommonEntity faceCommonEntity2 = this.$faceBlePhoto.element;
                    Intrinsics.checkNotNull(faceCommonEntity2);
                    List<FaceBleMultiPhoto> multiPhotoDataList2 = faceCommonEntity2.getMultiPhotoDataList();
                    Intrinsics.checkNotNull(multiPhotoDataList2);
                    size = multiPhotoDataList2.size();
                }
                faceInfoBleFragment.originSize = size;
                WatchFace mInfo = this.this$0.getMInfo();
                Intrinsics.checkNotNull(mInfo);
                for (String str : mInfo.getBackgroundImageList()) {
                    FaceCommonEntity faceCommonEntity3 = this.$faceBlePhoto.element;
                    Intrinsics.checkNotNull(faceCommonEntity3);
                    List<FaceBleMultiPhoto> multiPhotoDataList3 = faceCommonEntity3.getMultiPhotoDataList();
                    Intrinsics.checkNotNull(multiPhotoDataList3);
                    for (FaceBleMultiPhoto faceBleMultiPhoto : multiPhotoDataList3) {
                        if (Intrinsics.areEqual(str, faceBleMultiPhoto.getMultiMd5())) {
                            Logger.i("init photo from device by Room: " + faceBleMultiPhoto.getMultiMd5(), new Object[0]);
                            this.this$0.getMPhotoPicker().addPhotoBg(new PhotoBgPicker.PhotoBgItem(faceBleMultiPhoto.getMultiPath(), faceBleMultiPhoto.getMultiMd5()));
                            this.this$0.getOriginMd5List().add(0, faceBleMultiPhoto.getMultiMd5());
                        }
                    }
                }
                if (!this.this$0.getMPhotoPicker().getPhotoList().isEmpty()) {
                    FaceManager.INSTANCE.loadFaceFile(new File(FaceBlePhotoFragmentKt.getPngPath(this.this$0.getMPhotoPicker().getPhotoList().get(0).getFilePath())), this.this$0.getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : this.this$0.getIsScreenOffWatchFace());
                }
            }
            this.this$0.hideDelayLoading();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33552) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.xiaomi.fitness.watch.face.FaceInfoBleFragment$mFaceZhouHaiListener$1] */
    public FaceInfoBleFragment() {
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.setChanged = new ObservableProperty<Boolean>(bool) { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.booleanValue();
                oldValue.booleanValue();
                this.setButton1();
            }
        };
        this.bgColor = "";
        this.bgImgMd5 = "";
        this.styleId = "";
        this.progressDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pz8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceInfoBleFragment.progressDialog_delegate$lambda$2();
            }
        });
        this.funList = new ArrayList<>();
        this.preFunList = new ArrayList<>();
        this.deviceShowImage = "";
        this.bgImgTransferObserver = new Observer() { // from class: rz8
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FaceInfoBleFragment.bgImgTransferObserver$lambda$3(this.f33086a, ((Integer) obj).intValue());
            }
        };
        this.downloadObserver = new Observer() { // from class: sz8
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FaceInfoBleFragment.downloadObserver$lambda$4(this.f34122a, (FaceBleInfoViewModel.DownloadRet) obj);
            }
        };
        this.faceInstallRetObserver = new Observer() { // from class: tz8
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FaceInfoBleFragment.faceInstallRetObserver$lambda$5(this.f35209a, (FaceBleInfoViewModel.FaceInstallRet) obj);
            }
        };
        this.mFaceZhouHaiListener = new FaceZhouHaiListener() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$mFaceZhouHaiListener$1
            @Override // com.xiaomi.fitness.watch.face.helper.FaceZhouHaiListener
            public void onResponseCustomDialData(byte[] data) {
                Logger.d("onResponseCustomDialData data = " + (data != null ? data.length : -1) + " ", new Object[0]);
                FaceManager faceManager = FaceManager.INSTANCE;
                FaceData mRequestData = this.this$0.getMRequestData();
                Intrinsics.checkNotNull(mRequestData);
                String str = faceManager.getBleZip(mRequestData.getFile_hash()) + "_face";
                boolean zS = im9.S(data, str);
                String fileMD5 = MD5Util.getFileMD5(str);
                Logger.d(this.this$0.TAG, "SavePhoto " + str + " " + zS + " " + fileMD5);
                if (!zS) {
                    this.this$0.onBleInstallRet(false, 255, null);
                    return;
                }
                File file = new File(str);
                FaceInfoBleFragment faceInfoBleFragment = this.this$0;
                FaceData mRequestData2 = faceInfoBleFragment.getMRequestData();
                Intrinsics.checkNotNull(mRequestData2);
                Long version_code = mRequestData2.getVersion_code();
                faceInfoBleFragment.installBleFace(file, version_code != null ? version_code.longValue() : 0L, file.length());
            }

            @Override // com.xiaomi.fitness.watch.face.helper.FaceZhouHaiListener
            public void onResponseCustomDialEffectImg(Bitmap bitmap) throws Throwable {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Logger.d(this.this$0.TAG, "onResponseCustomDialEffectImg w:" + bitmap.getWidth() + "  h:" + bitmap.getHeight());
                FaceManager faceManager = FaceManager.INSTANCE;
                FaceData mRequestData = this.this$0.getMRequestData();
                Intrinsics.checkNotNull(mRequestData);
                kq2.c(bitmap, FaceBlePhotoFragmentKt.getPngPath(faceManager.getBleZip(mRequestData.getFile_hash()) + "_preview"));
            }
        };
        this.imgNotFound = true;
        this.bgImgNewList = new ArrayList();
        this.originMd5List = new ArrayList();
        this.editCode = 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FaceBleInfoViewModel access$getMViewModel(FaceInfoBleFragment faceInfoBleFragment) {
        return (FaceBleInfoViewModel) faceInfoBleFragment.getMViewModel();
    }

    private final void actionBtn1() {
        String str = this.TAG;
        boolean setChanged = getSetChanged();
        boolean mInstalled = getMInstalled();
        WatchFace mInfo = getMInfo();
        Boolean boolValueOf = mInfo != null ? Boolean.valueOf(mInfo.getCanEdit()) : null;
        WatchFace mInfo2 = getMInfo();
        Logger.i(str, "actionBtn1 setChanged: " + setChanged + " mInstalled: " + mInstalled + " canEdit: " + boolValueOf + " isCurrent: " + (mInfo2 != null ? Boolean.valueOf(mInfo2.isCurrent()) : null));
        if (!getSetChanged()) {
            if (getMInstalled()) {
                setFace();
                return;
            } else {
                installOrUpdate();
                return;
            }
        }
        if (!getMInstalled()) {
            installOrUpdate();
            return;
        }
        WatchFace mInfo3 = getMInfo();
        if (mInfo3 == null || !mInfo3.getCanEdit()) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_not_support);
                return;
            }
            return;
        }
        if (isZhouHaiPhotoFace()) {
            installZhouHaiPhotoFace$default(this, false, 1, null);
        } else {
            WatchFace mInfo4 = getMInfo();
            reqEdit(mInfo4 != null ? mInfo4.isCurrent() : false);
        }
    }

    private final boolean bgColorChanged() {
        if (this.bgColor.length() > 0) {
            WatchFace mInfo = getMInfo();
            if (!Intrinsics.areEqual(mInfo != null ? mInfo.getBackgroundColor() : null, this.bgColor)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bgImgTransferObserver$lambda$3(FaceInfoBleFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onImgTransfer(i);
    }

    private final void checkConnect(Function0<Unit> action) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel != null && mDeviceModel.getIsDeviceConnected()) {
            action.invoke();
            return;
        }
        new CommonDialog.c("face_check_connect").setDialogTitle(p1j.q).setDialogDescription(p1j.p).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment.checkConnect.1
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
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
                    Context context = FaceInfoBleFragment.this.getContext();
                    if (context != null) {
                        MainExtKt.showMainActivity$default(context, null, bundle, 2, null);
                    }
                }
            }
        }).showIfNeed(getChildFragmentManager());
        if (this.isEditing) {
            this.isEditing = false;
            this.editCode = 20;
        }
        hideDelayLoading();
    }

    private final CommonDialog<?> createConfirmExitDialog() {
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("face_edit_no_save").setDialogTitle(p1j.K0).setDialogDescription(p1j.J0).setPositiveText(p1j.common_apply).setNegativeText(p1j.common_exit).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment.createConfirmExitDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    FaceInfoBleFragment.this.finish();
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    FaceInfoBleFragment faceInfoBleFragment = FaceInfoBleFragment.this;
                    faceInfoBleFragment.setSetChanged(faceInfoBleFragment.isSetChanged());
                    TextView actionUseView = FaceInfoBleFragment.this.getActionUseView();
                    if (actionUseView != null) {
                        actionUseView.performClick();
                    }
                }
            }
        });
        Intrinsics.checkNotNull(commonDialogCreate);
        return commonDialogCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doDownload(final File file) {
        setMDownloadFaceStartTime(System.currentTimeMillis());
        getProgressDialog().showIfNeed(getParentFragmentManager());
        this.progressShowing = true;
        TextView actionUseView = getActionUseView();
        if (actionUseView != null) {
            actionUseView.setEnabled(false);
        }
        requestDownload(new Function1() { // from class: uy8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.doDownload$lambda$39(this.f36273a, file, (FaceDownloadResultV2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit doDownload$lambda$39(FaceInfoBleFragment this$0, File file, FaceDownloadResultV2 faceDownloadResultV2) {
        FaceDownloadResultV2.DownloadInfo download_info;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(file, "$file");
        String config_file = (faceDownloadResultV2 == null || (download_info = faceDownloadResultV2.getDownload_info()) == null) ? null : download_info.getConfig_file();
        if (config_file != null) {
            this$0.license = faceDownloadResultV2.getLicense();
            this$0.sign = faceDownloadResultV2.getSign();
            ((FaceBleInfoViewModel) this$0.getMViewModel()).downloadFace(config_file, file, this$0.getFaceId());
            return Unit.INSTANCE;
        }
        this$0.dismissProgress();
        this$0.setButton1();
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
        }
        TextView actionUseView = this$0.getActionUseView();
        if (actionUseView != null) {
            actionUseView.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    private final void doDuplicate() {
        FaceData mRequestData = getMRequestData();
        FaceData.BleExt ble_ext = mRequestData != null ? mRequestData.getBle_ext() : null;
        setMInstalled(true);
        if (ble_ext == null || !ble_ext.canEdit()) {
            Logger.i(this.TAG, "doDuplicate cannot edit");
            setFace();
        } else {
            Logger.i(this.TAG, "doDuplicate can edit");
            reqEdit(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void doInstallFace(File file, String id, Integer segmentLength) {
        ((FaceBleInfoViewModel) getMViewModel()).doInstallFace(file, id, segmentLength);
    }

    private final void downLoad(final File file) {
        if (!NetworkExtKt.isNetworkAvailable()) {
            if (this.isEditing) {
                finishEdit$default(this, false, 1, null);
            }
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_hint_network_unavailable);
                return;
            }
            return;
        }
        FaceData mRequestData = getMRequestData();
        Intrinsics.checkNotNull(mRequestData);
        if (!TextUtils.isEmpty(mRequestData.getFile_hash())) {
            if (NetUtil.INSTANCE.isWifiCon(AppUtil.getApp())) {
                doDownload(file);
                return;
            } else {
                new CommonDialog.c("face_download_not_wifi").setDialogTitle(p1j.j).setDialogDescriptionString(this.mFaceSize > 0.0f ? new DialogParams.DialogDescriptionString(p1j.n, Float.valueOf(this.mFaceSize)) : new DialogParams.DialogDescriptionString(p1j.o, new Object[0])).setPositiveText(p1j.l).setNegativeText(p1j.x).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment.downLoad.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (which != -2) {
                            if (which != -1) {
                                return;
                            }
                            FaceInfoBleFragment.this.doDownload(file);
                        } else {
                            if (FaceInfoBleFragment.this.getIsEditing()) {
                                FaceInfoBleFragment.finishEdit$default(FaceInfoBleFragment.this, false, 1, null);
                            }
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                        }
                    }
                }).showIfNeed(getChildFragmentManager());
                return;
            }
        }
        if (this.isEditing) {
            finishEdit$default(this, false, 1, null);
        }
        Context context2 = getContext();
        if (context2 != null) {
            ToastExtKt.toastShort(context2, p1j.common_hint_unkonwn_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadObserver$lambda$4(FaceInfoBleFragment this$0, FaceBleInfoViewModel.DownloadRet it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onDownload(it);
    }

    private final void editFail() {
        syncFace();
        finishEdit$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void faceInstallRetObserver$lambda$5(FaceInfoBleFragment this$0, FaceBleInfoViewModel.FaceInstallRet it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onBleInstallRet(it.getSuccess(), it.getCode(), it.getResult());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishEdit(boolean showToast) {
        Context context;
        String backgroundColor;
        String backgroundColor2;
        WatchFace mInfo;
        int[] dataList;
        WatchFace mInfo2;
        FaceData.BleExt ble_ext;
        WatchFace mInfo3;
        dismissProgress();
        FaceManager faceManager = FaceManager.INSTANCE;
        WatchFace face = faceManager.getFace(getFaceId());
        if (face == null) {
            face = getMInfo();
        }
        setMInfo(face);
        setMInstalled(faceManager.isInstalled(getFaceId()));
        FaceData mRequestData = getMRequestData();
        if (mRequestData != null && (ble_ext = mRequestData.getBle_ext()) != null && ble_ext.hasSpirit() && (mInfo3 = getMInfo()) != null) {
            mInfo3.setSpiritColor(this.spiritColor);
        }
        if (this.styleId.length() > 0 && (mInfo2 = getMInfo()) != null) {
            mInfo2.setStyle(this.styleId);
        }
        Logger.i(this.TAG, "finishEdit: face = " + getMInfo() + "  setChanged = " + isSetChanged() + "; installed = " + getMInstalled() + "; editCode = " + this.editCode + ";");
        this.isEditing = false;
        this.editCurrent = false;
        WatchFace mInfo4 = getMInfo();
        if ((mInfo4 != null ? mInfo4.getDataList() : null) != null && (mInfo = getMInfo()) != null && (dataList = mInfo.getDataList()) != null) {
            if (!(dataList.length == 0)) {
                this.preFunList.clear();
                ArrayList<Integer> arrayList = this.preFunList;
                WatchFace mInfo5 = getMInfo();
                Intrinsics.checkNotNull(mInfo5);
                int[] dataList2 = mInfo5.getDataList();
                Intrinsics.checkNotNull(dataList2);
                arrayList.addAll(ArraysKt___ArraysKt.toList(dataList2));
            }
        }
        WatchFace mInfo6 = getMInfo();
        if (mInfo6 != null && (backgroundColor = mInfo6.getBackgroundColor()) != null && backgroundColor.length() > 0) {
            WatchFace mInfo7 = getMInfo();
            if (mInfo7 != null) {
                WatchFace mInfo8 = getMInfo();
                mInfo7.setBackgroundColor((mInfo8 == null || (backgroundColor2 = mInfo8.getBackgroundColor()) == null) ? null : StringsKt__StringsJVMKt.replace$default(backgroundColor2, "00", "", false, 4, (Object) null));
            }
            String str = this.TAG;
            WatchFace mInfo9 = getMInfo();
            Logger.d(str, "finishEdit: bgColor = " + (mInfo9 != null ? mInfo9.getBackgroundColor() : null) + " ");
        }
        setSetChanged(this.editCode == 10 ? false : isSetChanged());
        getActionDelView().setVisibility(faceManager.canRemove(getMInfo()) ? 0 : 8);
        getEmptyView().setVisibility(faceManager.canRemove(getMInfo()) ? 0 : 8);
        getApplyMargin().setVisibility(faceManager.canRemove(getMInfo()) ? 8 : 0);
        if (showToast && (context = getContext()) != null) {
            ToastExtKt.toastShort(context, FaceBleInfoViewModelKt.getTip(this.editCode));
        }
        this.editCode = 10;
    }

    public static /* synthetic */ void finishEdit$default(FaceInfoBleFragment faceInfoBleFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishEdit");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        faceInfoBleFragment.finishEdit(z);
    }

    private final boolean funChanged() {
        if (this.preFunList.size() != this.funList.size()) {
            return true;
        }
        int size = this.funList.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.areEqual(this.preFunList.get(i), this.funList.get(i))) {
                return true;
            }
        }
        return false;
    }

    private final CommonDialog<?> getMConfirmExitDialog() {
        return (CommonDialog) this.mConfirmExitDialog.getValue();
    }

    private final int getZhouHaiDeviceType() {
        if (isM65APhotoFace()) {
            return 3;
        }
        if (isM69PhotoFace()) {
            return 2;
        }
        return isMulanPhotoFace() ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void initAodFace() {
        String icon;
        String str;
        FaceData.BleExt ble_ext;
        FaceData.BleExt ble_ext2;
        if (getIsScreenOffWatchFace()) {
            Logger.i(this.TAG, "isScreenOffWatchFace " + getIsScreenOffWatchFace());
            if (this.mPhotoPicker != null) {
                getMPhotoPicker().setVisibility(8);
            }
            ImageView imageView = (ImageView) ((l6a) getMBinding()).getRoot().findViewById(isi.n1);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = DisplayUtil.dip2px(168.0f);
            layoutParams.height = DisplayUtil.dip2px(168.0f);
            imageView.setLayoutParams(layoutParams);
            String value = ((FaceBleInfoViewModel) getMViewModel()).getBgImg().getValue();
            if (value == null || value.length() == 0) {
                FaceManager faceManager = FaceManager.INSTANCE;
                FaceData mRequestData = getMRequestData();
                if (mRequestData == null || (ble_ext = mRequestData.getBle_ext()) == null || !ble_ext.hasBgImg()) {
                    FaceData mRequestData2 = getMRequestData();
                    if (mRequestData2 != null) {
                        icon = mRequestData2.getIcon();
                        str = icon;
                    } else {
                        str = null;
                    }
                } else {
                    FaceData mRequestData3 = getMRequestData();
                    if (mRequestData3 == null || (ble_ext2 = mRequestData3.getBle_ext()) == null) {
                        str = null;
                    } else {
                        icon = ble_ext2.getBottom_background();
                        str = icon;
                    }
                }
                faceManager.loadFaceUrl(str, getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : true, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            }
            View viewFindViewById = ((l6a) getMBinding()).getRoot().findViewById(isi.X0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ViewExtKt.visible(viewFindViewById);
            View viewFindViewById2 = ((l6a) getMBinding()).getRoot().findViewById(isi.W0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ViewExtKt.visible(viewFindViewById2);
            ((ConstraintLayout) ((l6a) getMBinding()).getRoot().findViewById(isi.f)).setVisibility(0);
            ImageView imageView2 = (ImageView) ((l6a) getMBinding()).getRoot().findViewById(isi.o1);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            String deviceIconUrl = mDeviceModel != null ? DeviceModelExtKt.getDeviceIconUrl(mDeviceModel, 2) : null;
            View viewFindViewById3 = ((l6a) getMBinding()).getRoot().findViewById(isi.o1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            ImageView imageView3 = (ImageView) viewFindViewById3;
            Coil.imageLoader(imageView3.getContext()).enqueue(new ImageRequest.Builder(imageView3.getContext()).data(deviceIconUrl).target(imageView3).build());
            FaceInfoView faceInfoView = (FaceInfoView) ((l6a) getMBinding()).getRoot().findViewById(isi.U0);
            FaceManager faceManager2 = FaceManager.INSTANCE;
            FaceData mRequestData4 = getMRequestData();
            String aod_icon = mRequestData4 != null ? mRequestData4.getAod_icon() : null;
            Intrinsics.checkNotNull(faceInfoView);
            faceManager2.loadFaceUrl(aod_icon, faceInfoView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : true, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            layoutParams2.width = DisplayUtil.dip2px(168.0f);
            layoutParams2.height = DisplayUtil.dip2px(168.0f);
            imageView2.setLayoutParams(layoutParams2);
            TextView screenOffTips = ((l6a) getMBinding()).O;
            Intrinsics.checkNotNullExpressionValue(screenOffTips, "screenOffTips");
            ViewExtKt.visible(screenOffTips);
            ((l6a) getMBinding()).O.setText(p1j.a1);
        }
    }

    private final void initEditData() {
        String backgroundColor;
        String backgroundImage;
        String backgroundImage2;
        WatchFace mInfo;
        int[] dataList;
        String style;
        WatchFace mInfo2 = getMInfo();
        String str = "";
        if (mInfo2 == null || (backgroundColor = mInfo2.getBackgroundColor()) == null) {
            backgroundColor = "";
        }
        this.bgColor = backgroundColor;
        WatchFace mInfo3 = getMInfo();
        if (mInfo3 == null || (backgroundImage = mInfo3.getBackgroundImage()) == null) {
            backgroundImage = "";
        }
        this.bgImgMd5 = backgroundImage;
        WatchFace mInfo4 = getMInfo();
        if (mInfo4 == null || (backgroundImage2 = mInfo4.getBackgroundImage()) == null) {
            backgroundImage2 = "";
        }
        this.deviceShowImage = backgroundImage2;
        WatchFace mInfo5 = getMInfo();
        if (mInfo5 != null && (style = mInfo5.getStyle()) != null) {
            str = style;
        }
        this.styleId = str;
        WatchFace mInfo6 = getMInfo();
        if ((mInfo6 != null ? mInfo6.getDataList() : null) == null || (mInfo = getMInfo()) == null || (dataList = mInfo.getDataList()) == null) {
            return;
        }
        if (!(dataList.length == 0)) {
            ArrayList<Integer> arrayList = this.funList;
            WatchFace mInfo7 = getMInfo();
            Intrinsics.checkNotNull(mInfo7);
            int[] dataList2 = mInfo7.getDataList();
            Intrinsics.checkNotNull(dataList2);
            arrayList.addAll(ArraysKt___ArraysJvmKt.asList(dataList2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    private final void initFunList(FaceData.Functions[] functionsArr) {
        boolean z;
        int id;
        this.funList.clear();
        WatchFace mInfo = getMInfo();
        int[] dataList = mInfo != null ? mInfo.getDataList() : null;
        if (dataList != null) {
            z = (dataList.length == 0) ^ true;
        }
        int length = functionsArr.length;
        for (int i = 0; i < length; i++) {
            ArrayList<Integer> arrayList = this.funList;
            if (z) {
                Intrinsics.checkNotNull(dataList);
                if (dataList.length > i) {
                    id = dataList[i];
                } else {
                    id = functionsArr[i].getId();
                }
            } else {
                id = functionsArr[i].getId();
            }
            arrayList.add(Integer.valueOf(id));
        }
    }

    private final void initMulanPhotoWatchfaceView(FaceData.BleExt ext) {
        FaceZhouHaiHelper.INSTANCE.setZhouHaiFaceListener(getZhouHaiDeviceType(), this.mFaceZhouHaiListener);
        AnyExtKt.main$default(null, new C33441(ext.hasBgImg(), this, ext, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSelectView() {
        MutableLiveData<String> color;
        FaceData mRequestData = getMRequestData();
        FaceFunView faceFunView = null;
        final FaceData.BleExt ble_ext = mRequestData != null ? mRequestData.getBle_ext() : null;
        if (ble_ext == null || !ble_ext.canEdit()) {
            FaceFunView faceFunView2 = this.funSlectView;
            if (faceFunView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("funSlectView");
            } else {
                faceFunView = faceFunView2;
            }
            faceFunView.setVisibility(8);
            getImgLabelView().setVisibility(8);
            FaceColorPickView bgColorsView = getBgColorsView();
            if (bgColorsView != null) {
                bgColorsView.setVisibility(8);
            }
            hideDelayLoading();
            return;
        }
        if (isM69PhotoFace() || isM65APhotoFace()) {
            initMulanPhotoWatchfaceView(ble_ext);
        }
        boolean z = true;
        if (isMulanPhotoFace()) {
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            if (mDeviceModel == null || !mDeviceModel.getIsDeviceConnected()) {
                hideDelayLoading();
                return;
            } else {
                FaceBleInfoViewModel.checkDeviceVersion$default((FaceBleInfoViewModel) getMViewModel(), "1.1.55", null, new Function1() { // from class: jz8
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FaceInfoBleFragment.initSelectView$lambda$22(this.f23260a, ble_ext, ((Boolean) obj).booleanValue());
                    }
                }, 2, null);
                return;
            }
        }
        hideDelayLoading();
        boolean zHasBgColor = ble_ext.hasBgColor();
        boolean zHasFun = FaceExtKt.hasFun(ble_ext);
        boolean zHasBgImg = ble_ext.hasBgImg();
        boolean zHasSpirit = ble_ext.hasSpirit();
        Logger.i(this.TAG, "initSelectView, hasBgColor: " + zHasBgColor + " hasFun: " + zHasFun + " hasBgImg: " + zHasBgImg + " hasSpiritColor: " + zHasSpirit);
        if (zHasBgImg) {
            getImgLabelView().setVisibility(0);
            ((FaceBleInfoViewModel) getMViewModel()).getBgImg().observe(getViewLifecycleOwner(), new FaceInfoBleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: kz8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceInfoBleFragment.initSelectView$lambda$23(this.f24438a, ble_ext, (String) obj);
                }
            }));
        }
        if (zHasBgColor) {
            FaceColorPickView bgColorsView2 = getBgColorsView();
            if (bgColorsView2 != null) {
                bgColorsView2.setVisibility(0);
            }
            FaceColorPickView bgColorsView3 = getBgColorsView();
            if (bgColorsView3 != null) {
                String[] bg_colors = ble_ext.getBg_colors();
                String str = this.bgColor;
                if (!zHasFun && !zHasBgImg) {
                    z = false;
                }
                bgColorsView3.setData(bg_colors, str, z);
            }
            FaceColorPickView bgColorsView4 = getBgColorsView();
            if (bgColorsView4 != null && (color = bgColorsView4.getColor()) != null) {
                color.observe(getViewLifecycleOwner(), new Observer() { // from class: lz8
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        FaceInfoBleFragment.initSelectView$lambda$24(this.f25579a, (String) obj);
                    }
                });
            }
        }
        if (zHasFun) {
            if (!zHasBgImg) {
                String bottom_background = ble_ext.getBottom_background();
                if (bottom_background != null && bottom_background.length() != 0) {
                    FaceManager.INSTANCE.loadFaceUrl(ble_ext.getBottom_background(), getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                }
                String styleUrl = ble_ext.getStyleUrl(this.styleId);
                FaceManager faceManager = FaceManager.INSTANCE;
                if (styleUrl == null || styleUrl.length() == 0) {
                    styleUrl = ble_ext.getUpper_background();
                }
                faceManager.loadFaceUrl(styleUrl, getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            }
            FaceFunView faceFunView3 = this.funSlectView;
            if (faceFunView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("funSlectView");
                faceFunView3 = null;
            }
            faceFunView3.setVisibility(0);
            FaceData.Functions[] functions = ble_ext.getFunctions();
            Intrinsics.checkNotNull(functions);
            initFunList(functions);
            FaceLayerFunView funView = getFunView();
            int[] icon_color = ble_ext.getIcon_color();
            int i = icon_color != null ? icon_color[0] : 0;
            int[] icon_style = ble_ext.getIcon_style();
            funView.setData(functions, i, icon_style != null ? icon_style[0] : 0, this.funList);
            FaceFunView faceFunView4 = this.funSlectView;
            if (faceFunView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("funSlectView");
                faceFunView4 = null;
            }
            faceFunView4.setData(this.funList, functions, zHasBgImg, this);
            FaceFunView faceFunView5 = this.funSlectView;
            if (faceFunView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("funSlectView");
            } else {
                faceFunView = faceFunView5;
            }
            faceFunView.getLiveData().observe(getViewLifecycleOwner(), new FaceInfoBleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mz8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceInfoBleFragment.initSelectView$lambda$25(this.f27368a, (FunInfo) obj);
                }
            }));
        }
        if (zHasSpirit) {
            loadSpiritColorView(ble_ext, zHasBgImg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSelectView$lambda$22(FaceInfoBleFragment this$0, FaceData.BleExt bleExt, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("checkDeviceVersion result:" + z, new Object[0]);
        if (!z) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.z2);
            }
        } else {
            if (this$0.isInvalid()) {
                return Unit.INSTANCE;
            }
            this$0.initMulanPhotoWatchfaceView(bleExt);
        }
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSelectView$lambda$23(FaceInfoBleFragment this$0, FaceData.BleExt bleExt, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = str == null || str.length() == 0;
        this$0.imgNotFound = z;
        if (!z) {
            FaceManager faceManager = FaceManager.INSTANCE;
            Intrinsics.checkNotNull(str);
            faceManager.loadFaceFile(new File(FaceBlePhotoFragmentKt.getPngPath(str)), this$0.getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : this$0.getIsScreenOffWatchFace());
            this$0.mCurBgImgPath = str;
        }
        if (this$0.imgNotFound) {
            FaceManager.INSTANCE.loadFaceUrl(bleExt.getBottom_background(), this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : this$0.getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        }
        String styleUrl = bleExt.getStyleUrl(this$0.styleId);
        if (styleUrl.length() == 0) {
            styleUrl = bleExt.getUpper_background();
        }
        String str2 = styleUrl;
        this$0.mCurStyleUrl = str2;
        FaceManager.INSTANCE.loadFaceUrl(str2, this$0.getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : this$0.getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        Logger.d(this$0.TAG, "initSelectView: " + this$0.imgNotFound);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelectView$lambda$24(FaceInfoBleFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMImageView().setVisibility(8);
        FaceLayerColorView faceLayerColorView = this$0.colorView;
        if (faceLayerColorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorView");
            faceLayerColorView = null;
        }
        Intrinsics.checkNotNull(str);
        faceLayerColorView.setColor(str);
        this$0.bgColor = str;
        this$0.bgImgMd5 = "";
        this$0.setSetChanged(this$0.isSetChanged());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSelectView$lambda$25(FaceInfoBleFragment this$0, FunInfo funInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.funList.set(funInfo.getFunPos(), Integer.valueOf(funInfo.getFunId()));
        this$0.getFunView().setItem(funInfo.getFunPos(), funInfo.getFunId());
        this$0.setSetChanged(this$0.isSetChanged());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void installBleFace(final File file, long version, long size) {
        long length;
        FaceData.BleExt ble_ext;
        TextView actionUseView = getActionUseView();
        if (actionUseView != null) {
            actionUseView.setEnabled(false);
        }
        FaceData mRequestData = getMRequestData();
        if (mRequestData == null || (ble_ext = mRequestData.getBle_ext()) == null || !ble_ext.isMultiPhotoFace()) {
            FaceBleInfoViewModel faceBleInfoViewModel = (FaceBleInfoViewModel) getMViewModel();
            long length2 = file.length();
            String str = this.mCurBgImgPath;
            if (str == null || str.length() == 0 || isZhouHaiPhotoFace()) {
                length = 0;
            } else {
                String str2 = this.mCurBgImgPath;
                Intrinsics.checkNotNull(str2);
                length = new File(str2).length();
            }
            FaceBleInfoViewModel.initInstallProgressSize$default(faceBleInfoViewModel, length2, length, null, 4, null);
        } else {
            FaceBleInfoViewModel.initInstallProgressSize$default((FaceBleInfoViewModel) getMViewModel(), file.length(), 0L, this.bgImgNewList, 2, null);
        }
        dotFaceInstallStart();
        ((FaceBleInfoViewModel) getMViewModel()).installBleFace(getFaceId(), file, version, size, this.license, this.sign, new Function3() { // from class: qz8
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FaceInfoBleFragment.installBleFace$lambda$40(this.f32014a, file, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Integer) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit installBleFace$lambda$40(FaceInfoBleFragment this$0, File file, boolean z, int i, Integer num) {
        int i2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(file, "$file");
        Logger.i(this$0.TAG, "onInstallBleFace: " + z + " " + i + " " + num);
        if (z) {
            this$0.doInstallFace(file, this$0.getFaceId(), num);
        } else if (i == 2) {
            this$0.doDuplicate();
        } else if (this$0.isEditing) {
            if (i == 1) {
                i2 = 14;
            } else if (i == 17) {
                i2 = 17;
            } else if (i != 3) {
                i2 = i != 4 ? 20 : 15;
            } else {
                i2 = 11;
            }
            this$0.editCode = i2;
            if (i == 17) {
                this$0.onM69LowStorage(file, this$0.getFaceId(), num);
            } else {
                finishEdit$default(this$0, false, 1, null);
            }
        } else {
            if (i == 1) {
                Context context = this$0.getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, p1j.common_hint_device_busy);
                }
            } else if (i == 17) {
                this$0.onM69LowStorage(file, this$0.getFaceId(), num);
            } else if (i == 3) {
                Context context2 = this$0.getContext();
                if (context2 != null) {
                    ToastExtKt.toastShort(context2, p1j.d0);
                }
            } else if (i != 4) {
                Context context3 = this$0.getContext();
                if (context3 != null) {
                    ToastExtKt.toastShort(context3, p1j.s);
                }
            } else {
                Context context4 = this$0.getContext();
                if (context4 != null) {
                    ToastExtKt.toastShort(context4, p1j.common_hint_battery_low);
                }
            }
            this$0.dismissProgress();
            this$0.setButton1();
        }
        return Unit.INSTANCE;
    }

    private final void installOrUpdate() {
        if (getMRequestData() != null) {
            FaceData mRequestData = getMRequestData();
            Intrinsics.checkNotNull(mRequestData);
            if (!TextUtils.isEmpty(mRequestData.getFile_hash())) {
                TextView actionUseView = getActionUseView();
                if (actionUseView != null) {
                    actionUseView.setKeepScreenOn(true);
                }
                if (isSetChanged()) {
                    this.isEditing = true;
                }
                FaceManager faceManager = FaceManager.INSTANCE;
                FaceData mRequestData2 = getMRequestData();
                Intrinsics.checkNotNull(mRequestData2);
                downLoad(new File(faceManager.getBleZip(mRequestData2.getFile_hash())));
                return;
            }
        }
        String str = this.TAG;
        FaceData mRequestData3 = getMRequestData();
        Logger.i(str, "installOrUpdate: date error " + (mRequestData3 != null ? mRequestData3.getFile_hash() : null));
        Context context = getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void installZhouHaiPhotoFace(boolean afterDownload) {
        if (!isZhouHaiPhotoFace()) {
            Logger.d(this.TAG, "installMulanPhotoFace error:do not SupportMulanPhotoWatchface");
            onBleInstallRet(false, 255, null);
            return;
        }
        FaceData mRequestData = getMRequestData();
        Intrinsics.checkNotNull(mRequestData);
        if (!FaceBleInfoViewModelKt.validZip(mRequestData.getFile_hash())) {
            FaceManager faceManager = FaceManager.INSTANCE;
            FaceData mRequestData2 = getMRequestData();
            Intrinsics.checkNotNull(mRequestData2);
            downLoad(new File(faceManager.getBleZip(mRequestData2.getFile_hash())));
            return;
        }
        if (isSetChanged()) {
            this.isEditing = true;
        }
        if (!afterDownload) {
            this.usedProgress = 0;
        }
        if (!this.progressShowing && (bgImgChanged() || spiritColorChanged())) {
            getProgressDialog().showIfNeed(getParentFragmentManager());
        } else if (!this.progressShowing) {
            showLoading();
        }
        FaceBleInfoViewModel faceBleInfoViewModel = (FaceBleInfoViewModel) getMViewModel();
        int zhouHaiDeviceType = getZhouHaiDeviceType();
        String str = this.spiritColor;
        String str2 = this.mCurBgImgPath;
        FaceData mRequestData3 = getMRequestData();
        Intrinsics.checkNotNull(mRequestData3);
        faceBleInfoViewModel.calculateFaceData(zhouHaiDeviceType, str, str2, mRequestData3, new Function1() { // from class: xz8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.installZhouHaiPhotoFace$lambda$28(this.f39610a, (Exception) obj);
            }
        });
    }

    public static /* synthetic */ void installZhouHaiPhotoFace$default(FaceInfoBleFragment faceInfoBleFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: installZhouHaiPhotoFace");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        faceInfoBleFragment.installZhouHaiPhotoFace(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit installZhouHaiPhotoFace$lambda$28(FaceInfoBleFragment this$0, Exception it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onBleInstallRet(false, 255, null);
        return Unit.INSTANCE;
    }

    private final boolean isListChanged() {
        if (this.originMd5List.size() != getMPhotoPicker().getPhotoList().size()) {
            return true;
        }
        int size = this.originMd5List.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.areEqual(this.originMd5List.get(i), getMPhotoPicker().getPhotoList().get(i).getMd5())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isM65APhotoFace() {
        FaceData.BleExt ble_ext;
        WearableDeviceModel mDeviceModel;
        FaceData mRequestData = getMRequestData();
        return (mRequestData == null || (ble_ext = mRequestData.getBle_ext()) == null || ble_ext.getType() != 1 || (mDeviceModel = getMDeviceModel()) == null || !DeviceModelExtKt.isSupportFeature(mDeviceModel, Feature.M65A_PHOTO_WATCHFACE)) ? false : true;
    }

    private final boolean isM69PhotoFace() {
        FaceData.BleExt ble_ext;
        WearableDeviceModel mDeviceModel;
        FaceData mRequestData = getMRequestData();
        return (mRequestData == null || (ble_ext = mRequestData.getBle_ext()) == null || ble_ext.getType() != 1 || (mDeviceModel = getMDeviceModel()) == null || !DeviceModelExtKt.isSupportFeature(mDeviceModel, Feature.M69_PHOTO_WATCHFACE)) ? false : true;
    }

    private final boolean isMulanPhotoFace() {
        FaceData.BleExt ble_ext;
        WearableDeviceModel mDeviceModel;
        FaceData mRequestData = getMRequestData();
        return (mRequestData == null || (ble_ext = mRequestData.getBle_ext()) == null || ble_ext.getType() != 1 || (mDeviceModel = getMDeviceModel()) == null || !DeviceModelExtKt.isSupportFeature(mDeviceModel, Feature.MULAN_PHOTO_WATCHFACE)) ? false : true;
    }

    private final boolean isMultiPhotoFace() {
        FaceData.BleExt ble_ext;
        FaceData mRequestData;
        FaceData.BleExt ble_ext2;
        FaceData mRequestData2;
        FaceData.BleExt ble_ext3;
        FaceData mRequestData3 = getMRequestData();
        return (mRequestData3 == null || (ble_ext = mRequestData3.getBle_ext()) == null || !ble_ext.hasBgImg() || (mRequestData = getMRequestData()) == null || (ble_ext2 = mRequestData.getBle_ext()) == null || !ble_ext2.canEdit() || (mRequestData2 = getMRequestData()) == null || (ble_ext3 = mRequestData2.getBle_ext()) == null || !ble_ext3.isMultiPhotoFace()) ? false : true;
    }

    private final boolean isZhouHaiPhotoFace() {
        return isMulanPhotoFace() || isM69PhotoFace() || isM65APhotoFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadSpiritColorView(FaceData.BleExt ext, boolean hasBgImg) {
        String spiritColor;
        MutableLiveData<String> color;
        String[] element_colours;
        WatchFace mInfo = getMInfo();
        if (mInfo == null || (spiritColor = mInfo.getSpiritColor()) == null) {
            spiritColor = this.spiritColor;
        }
        this.spiritColor = spiritColor;
        Logger.d(this.TAG, "spiritColor: " + spiritColor);
        if (this.spiritColor.length() == 0 && (element_colours = ext.getElement_colours()) != null && element_colours.length != 0) {
            String[] element_colours2 = ext.getElement_colours();
            Intrinsics.checkNotNull(element_colours2);
            this.spiritColor = element_colours2[0];
        }
        FaceColorPickView bgColorsView = getBgColorsView();
        if (bgColorsView != null) {
            ViewExtKt.visible(bgColorsView);
        }
        FaceColorPickView bgColorsView2 = getBgColorsView();
        if (bgColorsView2 != null) {
            bgColorsView2.setData(ext.getElement_colours(), this.spiritColor, hasBgImg);
        }
        FaceColorPickView bgColorsView3 = getBgColorsView();
        if (bgColorsView3 != null && (color = bgColorsView3.getColor()) != null) {
            color.observe(getViewLifecycleOwner(), new FaceInfoBleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xy8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceInfoBleFragment.loadSpiritColorView$lambda$26(this.f39582a, (String) obj);
                }
            }));
        }
        FaceManager.INSTANCE.loadFaceUrl(this.mCurStyleUrl, getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : new Callback() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment.loadSpiritColorView.2
            @Override // com.xiaomi.fitness.watch.face.impl.Callback
            public void onReady(Drawable drawable) {
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                FaceInfoBleFragment.this.getStyleView().setImageDrawable(drawable);
                FaceInfoBleFragment.this.getStyleView().tintColor(FaceInfoBleFragment.this.spiritColor);
            }
        }, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSpiritColorView$lambda$26(FaceInfoBleFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getStyleView().tintColor(str);
        this$0.spiritColor = str;
        this$0.setSetChanged(this$0.isSetChanged());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonDialog mConfirmExitDialog_delegate$lambda$0(FaceInfoBleFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.createConfirmExitDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onBlePushProgress(int progress) {
        int pushProgress = ((FaceBleInfoViewModel) getMViewModel()).getPushProgress(1, progress, this.isEditing && bgImgChanged() && !isZhouHaiPhotoFace());
        Logger.d("FaceDialog", "onBlePushProgress: " + this.usedProgress + " " + progress + " " + pushProgress);
        if (progress >= 100) {
            this.usedProgress = pushProgress;
        }
        getProgressDialog().setProgress(pushProgress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$30(FaceInfoBleFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.actionBtn1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onClick$lambda$31(FaceInfoBleFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((FaceBleInfoViewModel) this$0.getMViewModel()).deleteFace(this$0.getFaceId());
        return Unit.INSTANCE;
    }

    private final void onDelete(int code) {
        hideLoading();
        if (code != 0) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, code == 1 ? p1j.z2 : p1j.common_delete_failure);
                return;
            }
            return;
        }
        doFaceDeleteFinish();
        Context context2 = getContext();
        if (context2 != null) {
            ToastExtKt.toastShort(context2, p1j.common_delete_success);
        }
        getActionDelView().setVisibility(8);
        getEmptyView().setVisibility(8);
        getApplyMargin().setVisibility(0);
        setMInstalled(false);
        FaceManager faceManager = FaceManager.INSTANCE;
        faceManager.delete(getMInfo());
        ScopeExtKt.scopeNet$default(null, new C33461(null), 1, null);
        if (this.mPhotoPicker != null && (!getMPhotoPicker().getPhotoList().isEmpty())) {
            getMPhotoPicker().removeAllPhotoBg();
            FaceData mRequestData = getMRequestData();
            Intrinsics.checkNotNull(mRequestData);
            FaceData.BleExt ble_ext = mRequestData.getBle_ext();
            faceManager.loadFaceUrl(ble_ext != null ? ble_ext.getBottom_background() : null, getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        }
        this.originMd5List.clear();
        this.bgImgNewList.clear();
        this.deviceShowImage = "";
        WatchFace mInfo = getMInfo();
        if (mInfo != null) {
            mInfo.setStyle("");
        }
        WatchFace mInfo2 = getMInfo();
        if (mInfo2 != null) {
            mInfo2.setSpiritColor("");
        }
        setSetChanged(isSetChanged());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDownload(FaceBleInfoViewModel.DownloadRet ret) {
        int percent = ret.getPercent();
        if (percent == -2 || percent == -1) {
            TextView actionUseView = getActionUseView();
            if (actionUseView != null) {
                actionUseView.setKeepScreenOn(false);
            }
            if (this.isEditing) {
                this.editCode = 20;
                finishEdit$default(this, false, 1, null);
            } else {
                Logger.i(this.TAG, "onDownload: fail = " + ret.getPercent());
                Context context = getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, FaceBleInfoViewModelKt.getTip(ret.getPercent()));
                }
                setButton1();
            }
            dismissProgress();
            dotFaceDownloadFinish(false, ret.getMsg());
            return;
        }
        if (percent != 100) {
            getProgressDialog().setProgress(((FaceBleInfoViewModel) getMViewModel()).getDownloadProgress(ret.getPercent()));
            return;
        }
        FaceData mRequestData = getMRequestData();
        boolean zValidZip = FaceBleInfoViewModelKt.validZip(mRequestData != null ? mRequestData.getFile_hash() : null);
        String str = this.TAG;
        FaceData mRequestData2 = getMRequestData();
        Logger.i(str, "face onDownload validZip: " + (mRequestData2 != null ? mRequestData2.getFile_hash() : null) + " " + zValidZip);
        if (!zValidZip) {
            onDownload(new FaceBleInfoViewModel.DownloadRet(-2, "zip not valid"));
            return;
        }
        dotFaceDownloadFinish(true, null);
        getProgressDialog().setProgress(((FaceBleInfoViewModel) getMViewModel()).getDownloadProgress(ret.getPercent()));
        this.usedProgress = 1;
        if (isZhouHaiPhotoFace()) {
            installZhouHaiPhotoFace(true);
            return;
        }
        if (getMRequestData() == null) {
            Logger.i(this.TAG, "onDownload success, requestData null");
            return;
        }
        FaceManager faceManager = FaceManager.INSTANCE;
        FaceData mRequestData3 = getMRequestData();
        Intrinsics.checkNotNull(mRequestData3);
        File file = new File(faceManager.getBleZip(mRequestData3.getFile_hash()));
        FaceData mRequestData4 = getMRequestData();
        Intrinsics.checkNotNull(mRequestData4);
        Long version_code = mRequestData4.getVersion_code();
        long jLongValue = version_code != null ? version_code.longValue() : 0L;
        FaceData mRequestData5 = getMRequestData();
        Intrinsics.checkNotNull(mRequestData5);
        installBleFace(file, jLongValue, mRequestData5.getFile_size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onEditResult(FaceBleInfoViewModel.EditRet editRet) {
        boolean z;
        Logger.i(this.TAG, "onEditResult: " + editRet + ".ret  " + editRet.getSegmentLength());
        int ret = editRet.getRet();
        if (ret != 0) {
            if (ret == 1) {
                ((FaceBleInfoViewModel) getMViewModel()).transferImgList(this.bgImgNewList.subList(0, ((FaceBleInfoViewModel) getMViewModel()).getCanAcceptCount()), getFaceId(), editRet.getSegmentLength());
                return;
            } else if (ret != 2) {
                this.editCode = 20;
                editFail();
                return;
            } else {
                this.editCode = 13;
                editFail();
                return;
            }
        }
        WatchFace mInfo = getMInfo();
        if (mInfo != null) {
            mInfo.setStyle(this.styleId);
        }
        if (bgImgChanged()) {
            Logger.d(this.TAG, "onEditResult111: " + this.mCurBgImgPath + " " + getMInfo());
            List<FacePhotoItem> list = this.bgImgNewList;
            if (list == null || list.isEmpty()) {
                if (Intrinsics.areEqual(this.mCurBgImgPath, "")) {
                    this.originMd5List.clear();
                    LinkedList linkedList = new LinkedList();
                    for (PhotoBgPicker.PhotoBgItem photoBgItem : getMPhotoPicker().getPhotoList()) {
                        linkedList.add(new FaceBleMultiPhoto(photoBgItem.getFilePath(), photoBgItem.getMd5(), null, null, null, null, null, 124, null));
                        this.originMd5List.add(photoBgItem.getMd5());
                    }
                    Logger.d(this.TAG, "onEditResult photoId: " + this.photoId);
                    ScopeExtKt.scopeNet$default(null, new C33471(linkedList, null), 1, null);
                    dismissProgress();
                    setSetChanged(isSetChanged());
                    WatchFace mInfo2 = getMInfo();
                    if ((mInfo2 == null || !mInfo2.isCurrent()) && !this.editCurrent) {
                        setFace();
                    } else {
                        syncFace();
                    }
                } else {
                    FaceBleInfoViewModel faceBleInfoViewModel = (FaceBleInfoViewModel) getMViewModel();
                    String str = this.mCurBgImgPath;
                    Intrinsics.checkNotNull(str);
                    faceBleInfoViewModel.transferImg(str, getFaceId(), editRet.getSegmentLength());
                }
                z = false;
            } else {
                ((FaceBleInfoViewModel) getMViewModel()).transferImgList(this.bgImgNewList, getFaceId(), editRet.getSegmentLength());
            }
            this.hasDelete = z;
        }
        WatchFace mInfo3 = getMInfo();
        if ((mInfo3 == null || !mInfo3.isCurrent()) && !this.editCurrent) {
            setFace();
        } else {
            syncFace();
        }
        z = false;
        this.hasDelete = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onImgTransfer(int progress) {
        boolean z;
        if (progress != 100) {
            if (progress >= 0 && progress < 100) {
                getProgressDialog().setProgress(((FaceBleInfoViewModel) getMViewModel()).getImgProgress(this.usedProgress, progress));
                return;
            }
            Logger.i(this.TAG, "onImgTransfer: code = " + progress + "; editCurrent = " + this.editCurrent);
            this.editCode = 20;
            finishEdit$default(this, false, 1, null);
            return;
        }
        Logger.i(this.TAG, "onImgTransfer: code = " + progress + "; editCurrent = " + this.editCurrent);
        hideLoading();
        if (isMultiPhotoFace()) {
            this.originMd5List.clear();
            LinkedList linkedList = new LinkedList();
            for (PhotoBgPicker.PhotoBgItem photoBgItem : getMPhotoPicker().getPhotoList()) {
                linkedList.add(new FaceBleMultiPhoto(photoBgItem.getFilePath(), photoBgItem.getMd5(), null, null, null, null, null, 124, null));
                this.originMd5List.add(photoBgItem.getMd5());
            }
            Logger.i(this.TAG, "onImgTransfer photoId: " + this.photoId);
            C33481 c33481 = new C33481(linkedList, null);
            z = true;
            ScopeExtKt.scopeNet$default(null, c33481, 1, null);
            this.bgImgNewList.clear();
            setSetChanged(isSetChanged());
        } else {
            z = true;
            ScopeExtKt.scopeNet$default(null, new C33492(null), 1, null);
            this.deviceShowImage = this.bgImgMd5;
        }
        WatchFace mInfo = getMInfo();
        if ((mInfo == null || mInfo.isCurrent() != z) && !this.editCurrent) {
            setFace();
        } else {
            syncFace();
        }
    }

    private final void onM69LowStorage(final File file, final String id, final Integer segmentLength) {
        new CommonDialog.c("onM69LowStorage").setDialogDescription(p1j.T0).setPositiveText(p1j.N).setNegativeText(p1j.common_exit).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment.onM69LowStorage.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    FaceInfoBleFragment.this.finishEdit(false);
                } else {
                    if (which != -1) {
                        return;
                    }
                    FaceInfoBleFragment.this.getProgressDialog().showIfNeed(FaceInfoBleFragment.this.getParentFragmentManager());
                    FaceInfoBleFragment.this.doInstallFace(file, id, segmentLength);
                }
            }
        }).showIfNeed(getChildFragmentManager());
    }

    private final void onRealDismissDialog() {
        hideLoading();
        this.usedProgress = 0;
        TextView actionUseView = getActionUseView();
        if (actionUseView != null) {
            actionUseView.post(new Runnable() { // from class: a09
                @Override // java.lang.Runnable
                public final void run() {
                    FaceInfoBleFragment.onRealDismissDialog$lambda$41(this.f467a);
                }
            });
        }
        this.progressShowing = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRealDismissDialog$lambda$41(FaceInfoBleFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getProgressDialog().isShowing()) {
            this$0.getProgressDialog().setProgress(0);
            this$0.getProgressDialog().dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(FaceInfoBleFragment this$0, PhotoBgPicker.PhotoBgItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FaceManager.INSTANCE.loadFaceFile(new File(FaceBlePhotoFragmentKt.getPngPath(it.getFilePath())), this$0.getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : this$0.getIsScreenOffWatchFace());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(FaceInfoBleFragment this$0, FaceBleInfoViewModel.EditRet editRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(editRet);
        this$0.onEditResult(editRet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13(FaceInfoBleFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        this$0.onFaceSet(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14(FaceInfoBleFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.onBlePushProgress(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$15(FaceInfoBleFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRealDismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$16(FaceInfoBleFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num == null || num.intValue() != 0) {
            Intrinsics.checkNotNull(num);
            this$0.onDelete(num.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$18(FaceInfoBleFragment this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (stateData.i()) {
            this$0.setInitLoadingTime(System.currentTimeMillis());
            this$0.showLoading();
        } else if (stateData.h()) {
            this$0.hideDelayLoading();
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, stateData.c == 22223 ? p1j.common_hint_network_unavailable : p1j.common_hint_unkonwn_error);
            }
            this$0.setButton1();
        } else {
            FaceDetailResultV2 faceDetailResultV2 = (FaceDetailResultV2) stateData.f11668a;
            if (faceDetailResultV2 != null) {
                this$0.setDataAndAction(faceDetailResultV2.getWatchFace());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(FaceInfoBleFragment this$0, ConstraintLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onClick(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(FaceInfoBleFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.openGallery(true);
        } else {
            Context context = this$0.getContext();
            if (context != null) {
                String quantityString = this$0.getResources().getQuantityString(gyi.l, 8, 8);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                ToastExtKt.toastShort(context, quantityString);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(FaceInfoBleFragment this$0, int i, PhotoBgPicker.PhotoBgItem photoBgItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(photoBgItem, "<unused var>");
        PhotoBgPicker.PhotoBgItem photoBgItem2 = this$0.getMPhotoPicker().getPhotoList().get(i);
        String strRemovePhotoBg = this$0.getMPhotoPicker().removePhotoBg(i);
        if (strRemovePhotoBg != null) {
            FaceManager.INSTANCE.loadFaceFile(new File(FaceBlePhotoFragmentKt.getPngPath(strRemovePhotoBg)), this$0.getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : this$0.getIsScreenOffWatchFace());
        } else {
            FaceManager faceManager = FaceManager.INSTANCE;
            FaceData mRequestData = this$0.getMRequestData();
            Intrinsics.checkNotNull(mRequestData);
            FaceData.BleExt ble_ext = mRequestData.getBle_ext();
            faceManager.loadFaceUrl(ble_ext != null ? ble_ext.getBottom_background() : null, this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : this$0.getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        }
        for (FacePhotoItem facePhotoItem : this$0.bgImgNewList) {
            if (Intrinsics.areEqual(facePhotoItem.md5, photoBgItem2.getMd5())) {
                this$0.bgImgNewList.remove(facePhotoItem);
                return Unit.INSTANCE;
            }
        }
        this$0.hasDelete = true;
        this$0.setSetChanged(true);
        return Unit.INSTANCE;
    }

    private final void openGallery(boolean isMultiPhoto) {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        if (isMultiPhoto) {
            startForActivityResult(intent, new Function2() { // from class: yz8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FaceInfoBleFragment.openGallery$lambda$33(this.f40713a, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        } else {
            startForActivityResult(intent, new Function2() { // from class: zz8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FaceInfoBleFragment.openGallery$lambda$34(this.f41821a, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openGallery$lambda$33(FaceInfoBleFragment this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((intent != null ? intent.getData() : null) == null) {
            return Unit.INSTANCE;
        }
        FaceCropActivity.p(this$0.getActivity(), intent.getData(), 34, this$0.getFaceId(), null, null, null, false, true, FaceManager.INSTANCE.getProductImageFormat(this$0.getMDeviceModel()), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openGallery$lambda$34(FaceInfoBleFragment this$0, int i, Intent intent) {
        FaceData.BleExt ble_ext;
        FaceData.BleExt ble_ext2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String bottom_background = null;
        if ((intent != null ? intent.getData() : null) == null) {
            return Unit.INSTANCE;
        }
        FragmentActivity activity = this$0.getActivity();
        Uri data = intent.getData();
        String faceId = this$0.getFaceId();
        FaceData mRequestData = this$0.getMRequestData();
        FaceData.BgStyle[] bg_styles = (mRequestData == null || (ble_ext2 = mRequestData.getBle_ext()) == null) ? null : ble_ext2.getBg_styles();
        String str = this$0.mCurStyleUrl;
        FaceData mRequestData2 = this$0.getMRequestData();
        if (mRequestData2 != null && (ble_ext = mRequestData2.getBle_ext()) != null) {
            bottom_background = ble_ext.getBottom_background();
        }
        FaceCropActivity.p(activity, data, 34, faceId, bg_styles, str, bottom_background, false, false, 0, false);
        return Unit.INSTANCE;
    }

    private final void pickerColor() {
        final String str = this.spiritColor;
        new PaletteDialog().setOnCancel(new View.OnClickListener() { // from class: uz8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceInfoBleFragment.pickerColor$lambda$36(this.f36303a, str, view);
            }
        }).setOnColorChange(new PaletteDialog.OnColorChangeListener() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment.pickerColor.2
            @Override // com.xiaomi.fitness.watch.face.PaletteDialog.OnColorChangeListener
            public void onColorChange(int color) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(color)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                FaceInfoBleFragment.this.spiritColor = str2;
                Logger.d(FaceInfoBleFragment.this.TAG, "pickerColor: " + str2);
                FaceInfoBleFragment.this.getStyleView().tintColor(str2);
            }
        }).setOnConfirm(new View.OnClickListener() { // from class: vz8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceInfoBleFragment.pickerColor$lambda$37(this.f37388a, view);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wz8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FaceInfoBleFragment.pickerColor$lambda$38(this.f38505a, dialogInterface);
            }
        }).show(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickerColor$lambda$36(FaceInfoBleFragment this$0, String preColor, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(preColor, "$preColor");
        Logger.d(this$0.TAG, "pickerColor: cancel");
        this$0.spiritColor = preColor;
        if (preColor.length() != 0) {
            this$0.getStyleView().tintColor(this$0.spiritColor);
            return;
        }
        FaceManager faceManager = FaceManager.INSTANCE;
        FaceData mRequestData = this$0.getMRequestData();
        Intrinsics.checkNotNull(mRequestData);
        FaceData.BleExt ble_ext = mRequestData.getBle_ext();
        faceManager.loadFaceUrl(ble_ext != null ? ble_ext.getUpper_background() : null, this$0.getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickerColor$lambda$37(FaceInfoBleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setSetChanged(this$0.isSetChanged());
        Logger.d(this$0.TAG, "pickerColor: confirm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickerColor$lambda$38(FaceInfoBleFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setSetChanged(this$0.isSetChanged());
        Logger.d(this$0.TAG, "pickerColor: dismiss");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceDialog progressDialog_delegate$lambda$2() {
        return new FaceDialog.Builder("face dialog").create();
    }

    private final void requestDownload(Function1<? super FaceDownloadResultV2, Unit> result) {
        ScopeExtKt.scopeNetLife$default((Fragment) this, (Lifecycle.Event) null, (CoroutineDispatcher) null, (Function2) new C33531(result, null), 3, (Object) null);
    }

    private final void setDataAndAction(FaceData data) {
        String publish_name;
        setMBrowseFaceStartTime(System.currentTimeMillis());
        setMRequestData(data);
        setMInfo(FaceExtKt.getFaceBean(data));
        FaceData mRequestData = getMRequestData();
        String aod_icon = mRequestData != null ? mRequestData.getAod_icon() : null;
        setScreenOffWatchFace(!(aod_icon == null || aod_icon.length() == 0));
        FaceManager.INSTANCE.loadFaceUrl(data.getIcon(), getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        setButton1();
        boolean z = data.getFile_size() > 10485;
        if (TextUtils.isEmpty(data.getPublish_name())) {
            WatchFace mInfo = getMInfo();
            publish_name = mInfo != null ? mInfo.getPublish_name() : null;
        } else {
            publish_name = data.getPublish_name();
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(publish_name);
        getMSizeAuthorView().setVisibility(0);
        if (!z && zIsEmpty) {
            getMSizeAuthorView().setText(getString(p1j.i, publish_name));
        } else if (z && !zIsEmpty) {
            getMSizeAuthorView().setText(getString(p1j.c1, Float.valueOf(data.getFile_size() / 1048576.0f)));
        } else if (z) {
            getMSizeAuthorView().setText(getString(p1j.d1, Float.valueOf(data.getFile_size() / 1048576.0f), publish_name));
        } else {
            ViewExtKt.gone(getMSizeAuthorView());
        }
        TextView mDescView = getMDescView();
        FaceData mRequestData2 = getMRequestData();
        mDescView.setText(mRequestData2 != null ? mRequestData2.getIntroduction() : null);
        TextView mNameView = getMNameView();
        FaceData mRequestData3 = getMRequestData();
        mNameView.setText(mRequestData3 != null ? mRequestData3.getDisplay_name() : null);
        setExtraData();
    }

    private final void setExtraData() {
        String upper_background;
        WearableDeviceInfo deviceInfo;
        initSelectView();
        initAodFace();
        FaceData mRequestData = getMRequestData();
        FaceData.BleExt ble_ext = mRequestData != null ? mRequestData.getBle_ext() : null;
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        String did = (mDeviceModel == null || (deviceInfo = mDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getDid();
        String str = did + getFaceId();
        this.photoId = str;
        Logger.i(this.TAG, "init photoId: " + str + " " + isZhouHaiPhotoFace() + " " + isMulanPhotoFace() + " " + isM69PhotoFace());
        if (ble_ext != null && ble_ext.isMultiPhotoFace() && !isZhouHaiPhotoFace()) {
            setExtraPhotoFaceData();
        }
        String styleUrl = ble_ext != null ? ble_ext.getStyleUrl(this.styleId) : null;
        if (styleUrl == null || styleUrl.length() == 0) {
            upper_background = ble_ext != null ? ble_ext.getUpper_background() : null;
        } else {
            upper_background = styleUrl;
        }
        this.mCurStyleUrl = upper_background;
        FaceManager.INSTANCE.loadFaceUrl(upper_background, getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : new Callback() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment.setExtraData.1
            @Override // com.xiaomi.fitness.watch.face.impl.Callback
            public void onReady(Drawable drawable) {
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                FaceInfoBleFragment.this.getStyleView().setImageDrawable(drawable);
                FaceInfoBleFragment.this.getStyleView().tintColor(FaceInfoBleFragment.this.spiritColor);
            }
        }, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
    }

    private final void setExtraPhotoFaceData() {
        WatchFace mInfo;
        FaceData.BgStyle bgStyle;
        String style;
        FaceData.BgStyle bgStyle2;
        String style2;
        String upper_background;
        String style3;
        FaceFunView faceFunView = this.funSlectView;
        if (faceFunView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("funSlectView");
            faceFunView = null;
        }
        faceFunView.setVisibility(8);
        getImgLabelView().setVisibility(8);
        hideDelayLoading();
        FaceData mRequestData = getMRequestData();
        FaceData.BleExt ble_ext = mRequestData != null ? mRequestData.getBle_ext() : null;
        if (ble_ext == null || !ble_ext.canEdit()) {
            return;
        }
        WatchFace mInfo2 = getMInfo();
        String style4 = mInfo2 != null ? mInfo2.getStyle() : null;
        if ((style4 == null || style4.length() == 0) && (mInfo = getMInfo()) != null) {
            FaceData.BgStyle[] bg_styles = ble_ext.getBg_styles();
            mInfo.setStyle((bg_styles == null || (bgStyle = bg_styles[0]) == null) ? null : bgStyle.getId());
        }
        WatchFace mInfo3 = getMInfo();
        String styleUrl = "";
        if (mInfo3 == null || (style = mInfo3.getStyle()) == null) {
            style = "";
        }
        this.styleId = style;
        if (ble_ext.hasBgImg()) {
            ConstraintLayout constraintLayout = this.multiFaceLayout;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("multiFaceLayout");
                constraintLayout = null;
            }
            constraintLayout.setVisibility(0);
            getMPhotoPicker().setVisibility(0);
            RecyclerView recyclerView = this.styleRecyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("styleRecyclerView");
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = this.styleRecyclerView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("styleRecyclerView");
                recyclerView2 = null;
            }
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            WatchFace mInfo4 = getMInfo();
            if ((mInfo4 != null ? mInfo4.getStyle() : null) != null) {
                WatchFace mInfo5 = getMInfo();
                if (mInfo5 != null && (style3 = mInfo5.getStyle()) != null) {
                    styleUrl = style3;
                }
                styleUrl = ble_ext.getStyleUrl(styleUrl);
            } else {
                FaceData.BgStyle[] bg_styles2 = ble_ext.getBg_styles();
                if (bg_styles2 != null && (bgStyle2 = bg_styles2[0]) != null && (style2 = bgStyle2.getStyle()) != null) {
                    styleUrl = style2;
                }
            }
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            FaceStyleAdapter faceStyleAdapter = new FaceStyleAdapter(contextRequireContext, ble_ext.getBg_styles(), styleUrl, ble_ext.getBottom_background());
            faceStyleAdapter.setMultiPhotos(true);
            RecyclerView recyclerView3 = this.styleRecyclerView;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("styleRecyclerView");
                recyclerView3 = null;
            }
            recyclerView3.setAdapter(faceStyleAdapter);
            FaceManager faceManager = FaceManager.INSTANCE;
            faceManager.loadFaceUrl(ble_ext.getBottom_background(), getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            WatchFace mInfo6 = getMInfo();
            if (mInfo6 == null || (upper_background = mInfo6.getStyle()) == null) {
                upper_background = ble_ext.getUpper_background();
            }
            faceManager.loadFaceUrl(ble_ext.getStyleUrl(upper_background), getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            faceStyleAdapter.observeStyle(this, new Observer() { // from class: fz8
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    FaceInfoBleFragment.setExtraPhotoFaceData$lambda$27(this.f18388a, (FaceData.BgStyle) obj);
                }
            });
        }
        setButton1();
        ScopeExtKt.scopeNet$default(null, new C33552(new Ref.ObjectRef(), this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setExtraPhotoFaceData$lambda$27(final FaceInfoBleFragment this$0, FaceData.BgStyle style) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(style, "style");
        this$0.styleId = style.getId();
        if (style.getStyle().length() > 0) {
            FaceManager.INSTANCE.loadFaceUrl(style.getStyle(), this$0.getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : this$0.getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : new Callback() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment$setExtraPhotoFaceData$1$1
                @Override // com.xiaomi.fitness.watch.face.impl.Callback
                public void onReady(Drawable drawable) {
                    Intrinsics.checkNotNullParameter(drawable, "drawable");
                    this.this$0.getStyleView().setImageDrawable(drawable);
                    if (this.this$0.spiritColor.length() > 0) {
                        this.this$0.getStyleView().tintColor(this.this$0.spiritColor);
                    }
                }
            }, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            this$0.setSetChanged(this$0.isSetChanged());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setFace$lambda$29(FaceInfoBleFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "setFace: " + this$0.progressShowing);
        if (!this$0.progressShowing) {
            this$0.showLoading();
        }
        ((FaceBleInfoViewModel) this$0.getMViewModel()).setFaceId(this$0.getFaceId());
        return Unit.INSTANCE;
    }

    private final boolean spiritColorChanged() {
        if (this.spiritColor.length() > 0) {
            WatchFace mInfo = getMInfo();
            if (!Intrinsics.areEqual(mInfo != null ? mInfo.getSpiritColor() : null, this.spiritColor)) {
                return true;
            }
        }
        return false;
    }

    private final void syncFace() {
        Logger.i(this.TAG, "syncFace: editCode = " + this.editCode);
        ld8.c().l(new FaceInstallEvent());
    }

    public boolean bgImgChanged() {
        String str;
        FaceData.BleExt ble_ext;
        FaceData mRequestData = getMRequestData();
        if (mRequestData == null || (ble_ext = mRequestData.getBle_ext()) == null || !ble_ext.isMultiPhotoFace()) {
            if (this.bgImgMd5.length() <= 0 || Intrinsics.areEqual(this.deviceShowImage, this.bgImgMd5) || (str = this.mCurBgImgPath) == null || str.length() == 0) {
                return false;
            }
        } else if (this.bgImgNewList.size() <= 0 && this.originMd5List.size() == getMPhotoPicker().getPhotoList().size()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dismissProgress() {
        ((FaceBleInfoViewModel) getMViewModel()).dismissDialog();
    }

    @NotNull
    public final String getBgImgMd5() {
        return this.bgImgMd5;
    }

    @NotNull
    public final List<FacePhotoItem> getBgImgNewList() {
        return this.bgImgNewList;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final int getEditCode() {
        return this.editCode;
    }

    public final boolean getEditCurrent() {
        return this.editCurrent;
    }

    public final boolean getHasDelete() {
        return this.hasDelete;
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase, com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ovi.e0;
    }

    @Nullable
    public final String getMCurBgImgPath() {
        return this.mCurBgImgPath;
    }

    public final float getMFaceSize() {
        return this.mFaceSize;
    }

    @NotNull
    public final PhotoBgPicker getMPhotoPicker() {
        PhotoBgPicker photoBgPicker = this.mPhotoPicker;
        if (photoBgPicker != null) {
            return photoBgPicker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
        return null;
    }

    @NotNull
    public final List<String> getOriginMd5List() {
        return this.originMd5List;
    }

    @NotNull
    public final String getPhotoId() {
        return this.photoId;
    }

    public final FaceDialog getProgressDialog() {
        return (FaceDialog) this.progressDialog.getValue();
    }

    public final boolean getProgressShowing() {
        return this.progressShowing;
    }

    public final boolean getSetChanged() {
        return ((Boolean) this.setChanged.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @NotNull
    public final String getStyleId() {
        return this.styleId;
    }

    /* JADX INFO: renamed from: isEditing, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    public boolean isSetChanged() {
        FaceData.BleExt ble_ext;
        FaceData mRequestData = getMRequestData();
        if (mRequestData != null && (ble_ext = mRequestData.getBle_ext()) != null && ble_ext.isMultiPhotoFace()) {
            Logger.i(this.TAG, "isSetChanged " + styleChanged() + " " + isListChanged());
            if (!styleChanged() && !isListChanged() && !spiritColorChanged()) {
                return false;
            }
        } else if (!styleChanged() && !bgImgChanged() && !funChanged() && ((!FaceManager.INSTANCE.getFlag() || !bgColorChanged()) && !spiritColorChanged())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null && requestCode == 34) {
            this.mCurBgImgPath = data.getStringExtra(FaceBlePhotoFragmentKt.EXTRA_PATH);
            String stringExtra = data.getStringExtra(FaceBlePhotoFragmentKt.EXTRA_MD5);
            FaceData mRequestData = getMRequestData();
            Intrinsics.checkNotNull(mRequestData);
            FaceData.BleExt ble_ext = mRequestData.getBle_ext();
            if (ble_ext != null && ble_ext.isMultiPhotoFace()) {
                Iterator<PhotoBgPicker.PhotoBgItem> it = getMPhotoPicker().getPhotoList().iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(it.next().getMd5(), stringExtra)) {
                        Context context = getContext();
                        if (context != null) {
                            ToastExtKt.toastShort(context, p1j.W0);
                            return;
                        }
                        return;
                    }
                }
                Logger.i(this.TAG, "addPath " + this.mCurBgImgPath + " " + stringExtra);
                String str = this.mCurBgImgPath;
                if (str == null || str.length() == 0 || stringExtra == null || stringExtra.length() == 0) {
                    return;
                }
                FaceManager faceManager = FaceManager.INSTANCE;
                String str2 = this.mCurBgImgPath;
                Intrinsics.checkNotNull(str2);
                faceManager.loadFaceFile(new File(FaceBlePhotoFragmentKt.getPngPath(str2)), getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : getIsScreenOffWatchFace());
                PhotoBgPicker mPhotoPicker = getMPhotoPicker();
                PhotoBgPicker.PhotoBgItem.Companion companion = PhotoBgPicker.PhotoBgItem.INSTANCE;
                String str3 = this.mCurBgImgPath;
                Intrinsics.checkNotNull(str3);
                mPhotoPicker.addPhotoBg(companion.of(str3, stringExtra));
                this.bgImgNewList.add(new FacePhotoItem(this.mCurBgImgPath, stringExtra, (int) new File(this.mCurBgImgPath).length()));
                setSetChanged(true);
                return;
            }
            String str4 = this.mCurBgImgPath;
            if (str4 != null && str4.length() != 0 && stringExtra != null && stringExtra.length() != 0) {
                this.bgImgMd5 = stringExtra;
                getMImageView().setVisibility(0);
                FaceManager faceManager2 = FaceManager.INSTANCE;
                String str5 = this.mCurBgImgPath;
                Intrinsics.checkNotNull(str5);
                faceManager2.loadFaceFile(new File(FaceBlePhotoFragmentKt.getPngPath(str5)), getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : getIsScreenOffWatchFace());
                FaceLayerColorView faceLayerColorView = this.colorView;
                if (faceLayerColorView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("colorView");
                    faceLayerColorView = null;
                }
                faceLayerColorView.setVisibility(8);
                this.bgColor = "";
                FaceColorPickView bgColorsView = getBgColorsView();
                if (bgColorsView != null) {
                    bgColorsView.setCurColor(this.bgColor);
                }
            }
            FaceData.BgStyle bgStyle = (FaceData.BgStyle) data.getParcelableExtra(FaceBlePhotoFragmentKt.EXTRA_STYLE);
            if (bgStyle != null) {
                String id = bgStyle.getId();
                this.styleId = id != null ? id : "";
                this.mCurStyleUrl = bgStyle.getStyle();
                FaceManager.INSTANCE.loadFaceUrl(bgStyle.getStyle(), getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            }
            Logger.d(this.TAG, "onActivityResult: styleId = " + this.styleId + "; bgImgMd5 = " + this.bgImgMd5 + "; bgPath = " + this.mCurBgImgPath);
            setSetChanged(isSetChanged());
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (!getMInstalled() || !isSetChanged()) {
            return super.onBackPressed();
        }
        getMConfirmExitDialog().showIfNeed(getParentFragmentManager());
        return true;
    }

    public final void onBleInstallRet(boolean success, int code, @Nullable s5r result) {
        int i;
        WatchFace mInfo;
        Logger.i(this.TAG, "onBleInstallRet: id = " + getFaceId() + "; code = " + code + "; success = " + success + "; editing = " + this.isEditing + "; editable = " + (result != null ? Boolean.valueOf(result.e) : null));
        if (success) {
            doFaceInstallFinish(success, null);
            setMInstalled(true);
            boolean z = code == 3;
            boolean z2 = result != null ? result.e : false;
            if (z && (mInfo = getMInfo()) != null) {
                mInfo.setCurrent(true);
            }
            if (isZhouHaiPhotoFace()) {
                WatchFace mInfo2 = getMInfo();
                if (mInfo2 != null) {
                    mInfo2.setBackgroundImage(this.bgImgMd5);
                }
                WatchFace mInfo3 = getMInfo();
                if (mInfo3 != null) {
                    mInfo3.setSpiritColor(this.spiritColor);
                }
                this.deviceShowImage = this.bgImgMd5;
                AnyExtKt.io$default(null, new C33451(null), 1, null);
            }
            if (!isSetChanged()) {
                if (z) {
                    syncFace();
                    return;
                } else {
                    setFace();
                    return;
                }
            }
            if (!z2) {
                this.editCode = 16;
                syncFace();
                return;
            } else if (isZhouHaiPhotoFace()) {
                syncFace();
                return;
            } else {
                reqEdit(z);
                return;
            }
        }
        doFaceInstallFinish(success, String.valueOf(code));
        if (code == 2) {
            doDuplicate();
            return;
        }
        if (this.isEditing) {
            if (code == 1) {
                i = 14;
            } else if (code != 3) {
                i = code != 4 ? 20 : 15;
            } else {
                i = 11;
            }
            this.editCode = i;
            finishEdit$default(this, false, 1, null);
            return;
        }
        if (code == 1) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_hint_device_busy);
            }
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
        dismissProgress();
        setButton1();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (Intrinsics.areEqual(v, getActionUseView())) {
            checkConnect(new Function0() { // from class: vy8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FaceInfoBleFragment.onClick$lambda$30(this.f37358a);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(v, getActionDelView())) {
            showLoading();
            setInitLoadingTime(System.currentTimeMillis());
            checkConnect(new Function0() { // from class: wy8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FaceInfoBleFragment.onClick$lambda$31(this.f38475a);
                }
            });
        } else {
            if (!Intrinsics.areEqual(v, getImgLabelView())) {
                if (Intrinsics.areEqual(v, getPaletteView())) {
                    pickerColor();
                    return;
                }
                return;
            }
            FaceData mRequestData = getMRequestData();
            Intrinsics.checkNotNull(mRequestData);
            FaceData.BleExt ble_ext = mRequestData.getBle_ext();
            boolean z = false;
            if (ble_ext != null && ble_ext.isMultiPhotoFace()) {
                z = true;
            }
            openGallery(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((FaceBleInfoViewModel) getMViewModel()).getBgImgTransfer().removeObserver(this.bgImgTransferObserver);
        ((FaceBleInfoViewModel) getMViewModel()).getDownload().removeObserver(this.downloadObserver);
        ((FaceBleInfoViewModel) getMViewModel()).getFaceInstallRet().removeObserver(this.faceInstallRetObserver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((FaceBleInfoViewModel) getMViewModel()).liveData.removeObservers(getViewLifecycleOwner());
        ((FaceBleInfoViewModel) getMViewModel()).getEditRet().removeObservers(getViewLifecycleOwner());
        ((FaceBleInfoViewModel) getMViewModel()).getBgImgTransfer().removeObservers(getViewLifecycleOwner());
        ((FaceBleInfoViewModel) getMViewModel()).getSetFaceResult().removeObservers(getViewLifecycleOwner());
        ((FaceBleInfoViewModel) getMViewModel()).getInstallFaceProgress().removeObservers(getViewLifecycleOwner());
        ((FaceBleInfoViewModel) getMViewModel()).getFaceInstallRet().removeObservers(getViewLifecycleOwner());
        ((FaceBleInfoViewModel) getMViewModel()).getDownload().removeObservers(getViewLifecycleOwner());
        ((FaceBleInfoViewModel) getMViewModel()).getDismissDialogLiveData().removeObservers(getViewLifecycleOwner());
        ((FaceBleInfoViewModel) getMViewModel()).getDelete().removeObservers(getViewLifecycleOwner());
        setMRequestData(null);
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void onFaceSet(boolean success) {
        Logger.i(this.TAG, "onFaceSet: editing = " + this.isEditing + "; editCode = " + this.editCode + "; success = " + success + "; installed = " + getMInstalled());
        doFaceSwitchFinish();
        if (this.isEditing) {
            if (success) {
                return;
            }
            this.editCode = 20;
        } else if (getMInstalled()) {
            super.onFaceSet(success);
        } else {
            if (success) {
                return;
            }
            this.editCode = 20;
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        doFaceBrowseDetailFinish();
        stopLowLatency();
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void onMessageEvent(@NotNull orf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        Logger.d(this.TAG, "onMessageEvent: " + event + " :" + getMInstalled());
        if ((event instanceof FaceReSycEvent) && getMInstalled()) {
            if (FaceManager.INSTANCE.getFace(getFaceId()) == null) {
                onDelete(0);
            } else {
                finishEdit$default(this, false, 1, null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        boolean zOnRequestPermissionsResult = PermissionsUtil.INSTANCE.onRequestPermissionsResult(requestCode, grantResults);
        boolean z = false;
        if (Build.VERSION.SDK_INT < 29 && !zOnRequestPermissionsResult) {
            new CommonDialog.c("no_gallery_permission").setDialogTitle(p1j.L5).setDialogDescription(p1j.z0).setPositiveText(p1j.M5).setNegativeText(p1j.c).setCancelable(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBleFragment.onRequestPermissionsResult.1
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
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        Context context = FaceInfoBleFragment.this.getContext();
                        Intrinsics.checkNotNull(context);
                        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                        Context context2 = FaceInfoBleFragment.this.getContext();
                        Intrinsics.checkNotNull(context2);
                        context2.startActivity(intent);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                }
            }).showIfNeed(getChildFragmentManager());
            return;
        }
        FaceData mRequestData = getMRequestData();
        Intrinsics.checkNotNull(mRequestData);
        FaceData.BleExt ble_ext = mRequestData.getBle_ext();
        if (ble_ext != null && ble_ext.isMultiPhotoFace()) {
            z = true;
        }
        openGallery(z);
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
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        WatchFace mInfo;
        String strReplace$default;
        Intrinsics.checkNotNullParameter(view, "view");
        initEditData();
        super.onViewCreated(view, savedInstanceState);
        setActionBarNormalTitleMode();
        setActionDelView((TextView) ((l6a) getMBinding()).getRoot().findViewById(isi.f22048a));
        setImgLabelView((ConstraintLayout) ((l6a) getMBinding()).getRoot().findViewById(isi.K0));
        setBgColorsView((FaceColorPickView) ((l6a) getMBinding()).getRoot().findViewById(isi.p));
        FaceColorPickView bgColorsView = getBgColorsView();
        setPaletteView(bgColorsView != null ? (TextView) bgColorsView.findViewById(isi.p1) : null);
        setStyleView((FaceInfoView) ((l6a) getMBinding()).getRoot().findViewById(isi.j2));
        this.colorView = (FaceLayerColorView) ((l6a) getMBinding()).getRoot().findViewById(isi.A);
        setFunView((FaceLayerFunView) ((l6a) getMBinding()).getRoot().findViewById(isi.v0));
        this.funSlectView = (FaceFunView) ((l6a) getMBinding()).getRoot().findViewById(isi.u0);
        this.styleRecyclerView = (RecyclerView) ((l6a) getMBinding()).getRoot().findViewById(isi.m2);
        this.multiFaceLayout = (ConstraintLayout) ((l6a) getMBinding()).getRoot().findViewById(isi.i1);
        setMPhotoPicker((PhotoBgPicker) ((l6a) getMBinding()).getRoot().findViewById(isi.w1));
        setEmptyView(((l6a) getMBinding()).getRoot().findViewById(isi.f0));
        setApplyMargin(((l6a) getMBinding()).getRoot().findViewById(isi.h));
        View applyMargin = getApplyMargin();
        FaceManager faceManager = FaceManager.INSTANCE;
        applyMargin.setVisibility(faceManager.canRemove(getMInfo()) ? 8 : 0);
        getEmptyView().setVisibility(faceManager.canRemove(getMInfo()) ? 0 : 8);
        getActionDelView().setVisibility(faceManager.canRemove(getMInfo()) ? 0 : 8);
        getActionDelView().setOnClickListener(this);
        FaceColorPickView bgColorsView2 = getBgColorsView();
        if (bgColorsView2 != null) {
            bgColorsView2.setOnClickListener(this);
        }
        ViewExtKt.clickWithTrigger$default(getImgLabelView(), 0L, new Function1() { // from class: yy8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.onViewCreated$lambda$6(this.f40683a, (ConstraintLayout) obj);
            }
        }, 1, null);
        TextView paletteView = getPaletteView();
        if (paletteView != null) {
            paletteView.setOnClickListener(this);
        }
        getMPhotoPicker().setOnAddBtnClickListener(new Function1() { // from class: zy8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.onViewCreated$lambda$7(this.f41800a, ((Boolean) obj).booleanValue());
            }
        });
        getMPhotoPicker().setOnItemDelBtnClickListener(new Function2() { // from class: az8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceInfoBleFragment.onViewCreated$lambda$9(this.f3599a, ((Integer) obj).intValue(), (PhotoBgPicker.PhotoBgItem) obj2);
            }
        });
        getMPhotoPicker().setOnItemSelectBtnClickListener(new Function1() { // from class: bz8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.onViewCreated$lambda$11(this.f4743a, (PhotoBgPicker.PhotoBgItem) obj);
            }
        });
        if (getMInstalled()) {
            setMInfo(faceManager.getFace(getFaceId()));
        }
        WatchFace mInfo2 = getMInfo();
        if ((mInfo2 != null ? mInfo2.getBackgroundColor() : null) != null && (mInfo = getMInfo()) != null) {
            WatchFace mInfo3 = getMInfo();
            if (mInfo3 == null || (strReplace$default = mInfo3.getBackgroundColor()) == null) {
                strReplace$default = StringsKt__StringsJVMKt.replace$default("", "00", "", false, 4, (Object) null);
            }
            mInfo.setBackgroundColor(strReplace$default);
        }
        Logger.i(this.TAG, "initView: face = " + getMInfo() + "; installed = " + getMInstalled());
        ((FaceBleInfoViewModel) getMViewModel()).getEditRet().observe(getViewLifecycleOwner(), new FaceInfoBleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cz8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.onViewCreated$lambda$12(this.f14886a, (FaceBleInfoViewModel.EditRet) obj);
            }
        }));
        ((FaceBleInfoViewModel) getMViewModel()).getBgImgTransfer().observeForever(this.bgImgTransferObserver);
        ((FaceBleInfoViewModel) getMViewModel()).getSetFaceResult().observe(getViewLifecycleOwner(), new FaceInfoBleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dz8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.onViewCreated$lambda$13(this.f16090a, (Boolean) obj);
            }
        }));
        ((FaceBleInfoViewModel) getMViewModel()).getInstallFaceProgress().observe(getViewLifecycleOwner(), new FaceInfoBleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ez8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.onViewCreated$lambda$14(this.f17213a, (Integer) obj);
            }
        }));
        ((FaceBleInfoViewModel) getMViewModel()).getFaceInstallRet().observeForever(this.faceInstallRetObserver);
        ((FaceBleInfoViewModel) getMViewModel()).requestData(getFaceId(), this.bgImgMd5);
        ((FaceBleInfoViewModel) getMViewModel()).getDownload().observeForever(this.downloadObserver);
        ((FaceBleInfoViewModel) getMViewModel()).getDismissDialogLiveData().observe(getViewLifecycleOwner(), new FaceInfoBleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gz8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.onViewCreated$lambda$15(this.f19488a, (Boolean) obj);
            }
        }));
        ((FaceBleInfoViewModel) getMViewModel()).getDelete().observe(getViewLifecycleOwner(), new FaceInfoBleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hz8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.onViewCreated$lambda$16(this.f20618a, (Integer) obj);
            }
        }));
        ((FaceBleInfoViewModel) getMViewModel()).liveData.observe(getViewLifecycleOwner(), new FaceInfoBleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: iz8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoBleFragment.onViewCreated$lambda$18(this.f22247a, (StateData) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        requestLowLatency();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reqEdit(boolean isCurrent) {
        String str;
        boolean z;
        boolean z2 = true;
        this.isEditing = true;
        FaceData mRequestData = getMRequestData();
        Intrinsics.checkNotNull(mRequestData);
        FaceData.BleExt ble_ext = mRequestData.getBle_ext();
        if (ble_ext == null || !ble_ext.isMultiPhotoFace()) {
            if (!isCurrent && this.bgImgMd5.length() != 0) {
                z2 = false;
            }
            this.editCurrent = z2;
            if (!this.progressShowing && bgImgChanged()) {
                getProgressDialog().showIfNeed(getParentFragmentManager());
            } else if (!this.progressShowing) {
                showLoading();
            }
            ((FaceBleInfoViewModel) getMViewModel()).requestEdit(getFaceId(), this.bgColor, this.bgImgMd5, (!bgImgChanged() || (str = this.mCurBgImgPath) == null || str.length() == 0) ? 0L : new File(this.mCurBgImgPath).length(), this.styleId, funChanged() ? this.funList : null, this.spiritColor, this.editCurrent);
            return;
        }
        this.editCurrent = isCurrent || isSetChanged();
        this.mCurBgImgPath = "";
        if (!this.progressShowing && bgImgChanged()) {
            getProgressDialog().showIfNeed(getParentFragmentManager());
        } else if (!this.progressShowing) {
            showLoading();
        }
        String[] strArr = new String[this.bgImgNewList.size()];
        int[] iArr = new int[this.bgImgNewList.size()];
        int size = getMPhotoPicker().getPhotoList().size();
        String[] strArr2 = new String[size];
        if (this.hasDelete) {
            int size2 = getMPhotoPicker().getPhotoList().size();
            for (int i = 0; i < size2; i++) {
                strArr2[(getMPhotoPicker().getPhotoList().size() - i) - 1] = getMPhotoPicker().getPhotoList().get(i).getMd5();
            }
            z = size == 0;
        } else {
            z = false;
        }
        int size3 = this.bgImgNewList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            iArr[i2] = this.bgImgNewList.get(i2).size;
            strArr[i2] = this.bgImgNewList.get(i2).md5;
        }
        String str2 = this.TAG;
        String string = Arrays.toString(strArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = Arrays.toString(strArr2);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Logger.i(str2, "reqEdit bgImgMd5List:" + string + " bgImgOrderList:" + string2 + " }");
        ((FaceBleInfoViewModel) getMViewModel()).requestEdit(getFaceId(), strArr, iArr, strArr2, this.styleId, this.editCurrent, this.hasDelete, z, this.spiritColor);
    }

    public final void setBgImgMd5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bgImgMd5 = str;
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void setButton1() {
        WatchFace mInfo = getMInfo();
        if (mInfo != null && mInfo.isCurrent()) {
            TextView actionUseView = getActionUseView();
            if (actionUseView != null) {
                actionUseView.setEnabled(getSetChanged());
            }
            TextView actionUseView2 = getActionUseView();
            if (actionUseView2 != null) {
                WatchFace mInfo2 = getMInfo();
                actionUseView2.setText((mInfo2 == null || !mInfo2.getCanEdit()) ? p1j.common_use : p1j.Z0);
                return;
            }
            return;
        }
        if (getMInstalled()) {
            TextView actionUseView3 = getActionUseView();
            if (actionUseView3 != null) {
                actionUseView3.setEnabled(true);
            }
            TextView actionUseView4 = getActionUseView();
            if (actionUseView4 != null) {
                actionUseView4.setText(getSetChanged() ? p1j.Z0 : p1j.common_use);
                return;
            }
            return;
        }
        TextView actionUseView5 = getActionUseView();
        if (actionUseView5 != null) {
            actionUseView5.setText(p1j.common_download_use);
        }
        TextView actionUseView6 = getActionUseView();
        if (actionUseView6 != null) {
            actionUseView6.setEnabled(true);
        }
    }

    public final void setEditCode(int i) {
        this.editCode = i;
    }

    public final void setEditCurrent(boolean z) {
        this.editCurrent = z;
    }

    public final void setEditing(boolean z) {
        this.isEditing = z;
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void setFace() {
        checkConnect(new Function0() { // from class: nz8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceInfoBleFragment.setFace$lambda$29(this.f28584a);
            }
        });
    }

    public final void setHasDelete(boolean z) {
        this.hasDelete = z;
    }

    public final void setMCurBgImgPath(@Nullable String str) {
        this.mCurBgImgPath = str;
    }

    public final void setMFaceSize(float f) {
        this.mFaceSize = f;
    }

    public final void setMPhotoPicker(@NotNull PhotoBgPicker photoBgPicker) {
        Intrinsics.checkNotNullParameter(photoBgPicker, "<set-?>");
        this.mPhotoPicker = photoBgPicker;
    }

    public final void setOriginMd5List(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.originMd5List = list;
    }

    public final void setPhotoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.photoId = str;
    }

    public final void setProgressShowing(boolean z) {
        this.progressShowing = z;
    }

    public final void setSetChanged(boolean z) {
        this.setChanged.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setStyleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.styleId = str;
    }

    public final boolean styleChanged() {
        if (this.styleId.length() > 0) {
            WatchFace mInfo = getMInfo();
            if (!Intrinsics.areEqual(mInfo != null ? mInfo.getStyle() : null, this.styleId)) {
                return true;
            }
        }
        return false;
    }
}
