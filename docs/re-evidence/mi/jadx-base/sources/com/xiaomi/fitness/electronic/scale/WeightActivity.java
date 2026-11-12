package com.xiaomi.fitness.electronic.scale;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.WeightActivity;
import com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter;
import com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl;
import com.xiaomi.fitness.electronic.scale.data.AddUserIcon;
import com.xiaomi.fitness.electronic.scale.data.Icon;
import com.xiaomi.fitness.electronic.scale.data.UserPhotoIcon;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.util.ScalePageUtil;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.widget.carousel.CarouselBannerModel;
import defpackage.a68;
import defpackage.av1;
import defpackage.av6;
import defpackage.bg4;
import defpackage.bk0;
import defpackage.bri;
import defpackage.cz7;
import defpackage.eji;
import defpackage.f4b;
import defpackage.gui;
import defpackage.gz7;
import defpackage.jx7;
import defpackage.kx7;
import defpackage.ld8;
import defpackage.lni;
import defpackage.lx7;
import defpackage.o4h;
import defpackage.rrr;
import defpackage.rw7;
import defpackage.sw7;
import defpackage.t48;
import defpackage.tw7;
import defpackage.u7r;
import defpackage.uno;
import defpackage.vw7;
import defpackage.wc0;
import defpackage.ww7;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import miuix.recyclerview.widget.RecyclerView;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_EIGHT_SCALE_WEIGHT)
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0017\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 Í\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002Í\u0001B\b¢\u0006\u0005\bÌ\u0001\u0010\u0014J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0014J'\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010\"J\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010\"J)\u0010*\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u0017H\u0003¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010\u0014J\u000f\u0010-\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u0010\u001aJ\u000f\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u0010\u0014J\u000f\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u0010\u0014J\u0019\u00103\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u0010\u001aJ\u0017\u00105\u001a\u00020\t2\u0006\u0010%\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u0010$J\u000f\u00108\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u0010\u0014J\u000f\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010\u0014J\u000f\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b:\u0010\u0014J\u000f\u0010;\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010\u0014J\u000f\u0010<\u001a\u00020\u0017H\u0002¢\u0006\u0004\b<\u0010$J\u000f\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\b=\u0010\u0014J\u0019\u0010@\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\tH\u0002¢\u0006\u0004\bB\u0010\u0014J\u000f\u0010C\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010\u0014J'\u0010G\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001cH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010\u0014J\u0019\u0010J\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u0017H\u0002¢\u0006\u0004\bJ\u0010\u001aJ\u001f\u0010K\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bK\u0010LJ/\u0010P\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJI\u0010U\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001c2\u0006\u0010R\u001a\u0002042\b\u0010S\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u0005H\u0002¢\u0006\u0004\bU\u0010VJK\u0010X\u001a\u00020\t2\b\u0010S\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u0002042\u0006\u0010D\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u001c2\b\b\u0002\u0010R\u001a\u000204H\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010\u0014J\u0017\u0010[\u001a\u00020\t2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b[\u0010AJ?\u0010\\\u001a\u00020\t2\u0006\u0010%\u001a\u0002042\u0006\u0010T\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001c2\u0006\u0010R\u001a\u000204H\u0002¢\u0006\u0004\b\\\u0010]J7\u0010^\u001a\u00020\t2\u0006\u0010%\u001a\u0002042\u0006\u0010T\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001c2\u0006\u0010R\u001a\u000204H\u0002¢\u0006\u0004\b^\u0010_J/\u0010`\u001a\u00020\t2\u0006\u0010%\u001a\u0002042\u0006\u0010E\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001cH\u0002¢\u0006\u0004\b`\u0010aJ?\u0010b\u001a\u00020\t2\u0006\u0010%\u001a\u0002042\u0006\u0010T\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001c2\u0006\u0010R\u001a\u000204H\u0002¢\u0006\u0004\bb\u0010]JG\u0010c\u001a\u00020\t2\u0006\u0010%\u001a\u0002042\u0006\u0010E\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001c2\u0006\u0010S\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u00052\u0006\u0010R\u001a\u000204H\u0002¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\tH\u0002¢\u0006\u0004\be\u0010\u0014J\u000f\u0010f\u001a\u00020\tH\u0002¢\u0006\u0004\bf\u0010\u0014J\u0017\u0010i\u001a\u00020\t2\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\tH\u0002¢\u0006\u0004\bk\u0010\u0014J\u000f\u0010l\u001a\u00020\tH\u0002¢\u0006\u0004\bl\u0010\u0014J\u000f\u0010m\u001a\u00020\tH\u0014¢\u0006\u0004\bm\u0010\u0014J\u0019\u0010n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\bn\u0010\u0012J\u0017\u0010q\u001a\u00020\t2\u0006\u0010p\u001a\u00020oH\u0007¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020\t2\u0006\u0010t\u001a\u00020sH\u0016¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\bw\u0010\"J\u000f\u0010x\u001a\u00020\tH\u0014¢\u0006\u0004\bx\u0010\u0014J\u000f\u0010y\u001a\u00020\tH\u0016¢\u0006\u0004\by\u0010\u0014J\u001f\u0010}\u001a\u00020\u00172\u0006\u0010z\u001a\u00020\u001c2\u0006\u0010|\u001a\u00020{H\u0016¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0080\u0001\u001a\u00020\t2\u0006\u0010\u007f\u001a\u00020\u000fH\u0014¢\u0006\u0005\b\u0080\u0001\u0010\u0012J\u001b\u0010\u0082\u0001\u001a\u00020\t2\u0007\u0010p\u001a\u00030\u0081\u0001H\u0007¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\tH\u0014¢\u0006\u0005\b\u0084\u0001\u0010\u0014R\u0019\u0010\u0085\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R*\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R,\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001a\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010\u0099\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0086\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009d\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0019\u0010¡\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010 \u0001R*\u0010¢\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0005\b¦\u0001\u0010\u0012R\u0019\u0010§\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010 \u0001R\u001b\u0010¨\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0017\u0010<\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b<\u0010\u0086\u0001R0\u0010«\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010ª\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001f\u0010¶\u0001\u001a\n\u0012\u0005\u0012\u00030µ\u00010´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R \u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¼\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001c\u0010¿\u0001\u001a\u0005\u0018\u00010¾\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R#\u0010Â\u0001\u001a\f\u0012\u0005\u0012\u00030Á\u0001\u0018\u00010´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010·\u0001R3\u0010Ä\u0001\u001a\f\u0012\u0005\u0012\u00030Ã\u0001\u0018\u00010ª\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010¬\u0001\u001a\u0006\bÅ\u0001\u0010®\u0001\"\u0006\bÆ\u0001\u0010°\u0001R\u0017\u0010É\u0001\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0017\u0010Ë\u0001\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010È\u0001¨\u0006Î\u0001"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/WeightActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/WeightViewModel;", "Lbk0;", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter$OnItemClickListener;", "", "did", "Lu7r;", "packet", "", "handleUploadWeightProcedure", "(Ljava/lang/String;Lu7r;)V", "handleUploadBodyComposition", "(Lu7r;)V", "handleUploadChildData", "Landroid/os/Bundle;", "savedInstanceState", "init", "(Landroid/os/Bundle;)V", "initView", "()V", "registerReceivers", "unRegisterReceivers", "", "isCollapse", "setActionBarIsCollapse", "(Z)V", "startWeight", "", "weight", "unit", "endWeight", "(Ljava/lang/String;II)V", "getAllVirtualAccount", "(Ljava/lang/String;)V", "shouldStepBodyFit", "()Z", "virtualId", "addVirtualAccount", "miId", "adRealAccount", "updateWeight", "setWeight", "(ILjava/lang/String;Z)V", "stepBodyFit", "startBodyProgress", "isRestore", "stepSmallObjectsResult", "reWeight", "isShowUserDialog", "canceledOnTouchOutside", "showUserDialog", "", "delVirtualUserToDevice", "(J)V", "isNoMeasureData", "stepFailed", "stepFailedApp0", "stepFailedApp1", "checkIsTeenager", "hasMain", "saveMainUser", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "virtualAccount", "saveVirtualUser", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "saveWeight", "stepVisitorResult", "sex", "age", "height", "gotoDataReport", "(III)V", "showGiveUpDialog", "showSaveWeightDialog", "addVirtualAccountIcon", "(Ljava/lang/String;Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "heartRate", "", "zk", "addRealAccountIcon", "(Ljava/lang/String;Ljava/lang/String;I[S)V", MedicalIdSPContract.PREF_BIRTHDAY, "url", "nickName", "syncRecordToVirtualUser", "(Ljava/lang/String;IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "userType", "addVirtualAccountWeightRecord", "(Ljava/lang/String;JIILjava/lang/String;IJ)V", "syncMainUserDataFromDevice", "handleVirtualAccountInfoIncompleteCase", "syncRecordToVirtualUserNew", "(JLjava/lang/String;IIIJ)V", "updateVirtualUserWeightToCloud", "(JLjava/lang/String;IIJ)V", "updateVirtualUserDataToDeviceNew", "(JIII)V", "addVirtualAccountWeightRecordNew", "syncRecordFromDeviceToVirtualUserNew", "(JIIILjava/lang/String;Ljava/lang/String;J)V", "syncMainUserDataFromDeviceNew", "initBanner", "Landroid/widget/ImageView;", "imageView", "setImageGuideLayoutParams", "(Landroid/widget/ImageView;)V", "showSmallDialog", "loadMiUser", LifecycleConstantKt.ON_START, "onCreate", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;", "event", "onEcoPacket", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;)V", "Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;", "icon", "onClick", "(Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;)V", "onAddUser", LifecycleConstantKt.ON_DESTROY, "onBackPressed", "featureId", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "outState", "onSaveInstanceState", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBodyCompositionSDKMeasureEvent;", "onBodyCompositionSDKMeasure", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBodyCompositionSDKMeasureEvent;)V", LifecycleConstantKt.ON_RESUME, "allUserSupportTestBodyFat", "Z", "showNoBodyFatErrorDialog", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "Lrw7;", "mBodyComposition", "Lrw7;", "getMBodyComposition", "()Lrw7;", "setMBodyComposition", "(Lrw7;)V", "", "mWeight", "F", "isFixNum", "mCurVirtualUserIcon", "Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;", "mDid", "Ljava/lang/String;", "userNickName", "mUnit", "I", "mWeightFailStatus", "mBundle", "Landroid/os/Bundle;", "getMBundle", "()Landroid/os/Bundle;", "setMBundle", "mMatchNum", "mPacket", "Lu7r;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "userDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getUserDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setUserDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter;", "userAdapter", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter;", "", "Lcom/xiaomi/fitness/electronic/scale/data/Icon;", "userIcons", "Ljava/util/List;", "Ljava/util/ArrayList;", "uIdList", "Ljava/util/ArrayList;", "Landroid/content/BroadcastReceiver;", "bluetoothMonitorReceiver", "Landroid/content/BroadcastReceiver;", "", Feature.GUIDE, "[I", "Lcom/xiaomi/fitness/widget/carousel/CarouselBannerModel;", "modelList", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "smallDialog", "getSmallDialog", "setSmallDialog", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWeightActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightActivity.kt\ncom/xiaomi/fitness/electronic/scale/WeightActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2441:1\n1863#2,2:2442\n1#3:2444\n*S KotlinDebug\n*F\n+ 1 WeightActivity.kt\ncom/xiaomi/fitness/electronic/scale/WeightActivity\n*L\n1211#1:2442,2\n*E\n"})
public final class WeightActivity extends Hilt_WeightActivity<WeightViewModel, bk0> implements UserPhotoAdapter.OnItemClickListener {
    public static final int CONFLICT_FLAG_MATCH_MANY_USER = 1;
    public static final int CONFLICT_FLAG_MATCH_NO_USER = 2;
    public static final int CONFLICT_FLAG_MATCH_ONLY_ONE_USER = 0;
    public static final int DEVICE_VERSION_ALL_USER_SUPPORT_TEST_BODY_FAT = 31;

    @NotNull
    public static final String KEY_WEIGHT_BIRTHDAY = "electronic_weight_birthday";

    @NotNull
    public static final String KEY_WEIGHT_CUR_USER_NICK_NAME = "electronic_weight_u_name";

    @NotNull
    public static final String KEY_WEIGHT_CUR_USER_URL = "electronic_weight_url";

    @NotNull
    public static final String KEY_WEIGHT_CUR_USER_VID = "electronic_weight_vid";

    @NotNull
    public static final String KEY_WEIGHT_DID = "electronic_weight_did";

    @NotNull
    public static final String KEY_WEIGHT_FAIL_STATUS = "electronic_weight_fail_status";

    @NotNull
    public static final String KEY_WEIGHT_HAS_CUR_AGE = "electronic_weight_age";

    @NotNull
    public static final String KEY_WEIGHT_HAS_CUR_HEIGHT = "electronic_weight_height";

    @NotNull
    public static final String KEY_WEIGHT_HAS_CUR_SEX = "electronic_weight_sex";

    @NotNull
    public static final String KEY_WEIGHT_HAS_CUR_USER = "electronic_weight_cur";

    @NotNull
    public static final String KEY_WEIGHT_HAS_MAIN = "electronic_weight_has_main";

    @NotNull
    public static final String KEY_WEIGHT_HAS_RESULT = "electronic_weight_has_result";

    @NotNull
    public static final String KEY_WEIGHT_HEIGHT = "electronic_weight_height";

    @NotNull
    public static final String KEY_WEIGHT_ID_LIST = "electronic_weight_id_list";

    @NotNull
    public static final String KEY_WEIGHT_IS_END = "electronic_weight_end";

    @NotNull
    public static final String KEY_WEIGHT_IS_FAILED = "electronic_weight_failed";

    @NotNull
    public static final String KEY_WEIGHT_IS_MEASURE_FINISH = "electronic_weight_finish";

    @NotNull
    public static final String KEY_WEIGHT_IS_NEW_FIRMVERSION = "electronic_weight_is_new";

    @NotNull
    public static final String KEY_WEIGHT_IS_SHOW_DIALOG = "electronic_weight_dialog";

    @NotNull
    public static final String KEY_WEIGHT_MATCH_NUM = "electronic_weight_match_num";

    @NotNull
    public static final String KEY_WEIGHT_NICK_NAME = "electronic_weight_nick_name";

    @NotNull
    public static final String KEY_WEIGHT_PROGRESS = "electronic_weight_progress";

    @NotNull
    public static final String KEY_WEIGHT_RESULT = "electronic_weight_result";

    @NotNull
    public static final String KEY_WEIGHT_SEX = "electronic_weight_sex";

    @NotNull
    public static final String KEY_WEIGHT_STATUS = "electronic_weight_status";

    @NotNull
    public static final String KEY_WEIGHT_TYPE = "electronic_weight_type";

    @NotNull
    public static final String KEY_WEIGHT_TYPE_VALUE = "electronic_weight_type";

    @NotNull
    public static final String KEY_WEIGHT_UNIT = "electronic_weight_unit";

    @NotNull
    public static final String KEY_WEIGHT_VALUE = "electronic_weight_value";

    @NotNull
    public static final String SAVE_WEIGHT = "electronic_name_save_weight";

    @NotNull
    public static final String TAG = "EightWeightActivity";
    public static final int WEIGHT_FAIL_STATUS_APP0 = 1;
    public static final int WEIGHT_FAIL_STATUS_APP1 = 2;
    public static final int WEIGHT_FAIL_STATUS_NO = 0;
    public static final int WEIGHT_SEX_FEMALE = 0;
    public static final int WEIGHT_SEX_MALE = 1;
    public static final int WEIGHT_STATUS_IN_ANALYSIS = 2;
    public static final int WEIGHT_STATUS_UPLOAD_BODY_COMPOSITION = 3;
    public static final int WEIGHT_STATUS_UPLOAD_PROCEDURE = 1;

    @NotNull
    public static final String WEIGHT_TYPE_NORMAL = "electronic_weight_normal";

    @NotNull
    public static final String WEIGHT_TYPE_VISITOR = "electronic_weight_visitor";
    private static boolean isEndWeight;
    private static boolean isFailed;
    private static boolean isMeasureFinished;
    private static boolean isOnlyWeight;
    private boolean allUserSupportTestBodyFat;

    @Nullable
    private int[] guide;
    private volatile boolean hasMain;
    private volatile boolean isFixNum;

    @Nullable
    private volatile rw7 mBodyComposition;

    @Nullable
    private Bundle mBundle;

    @Nullable
    private UserPhotoIcon mCurVirtualUserIcon;
    private volatile int mMatchNum;

    @Nullable
    private volatile u7r mPacket;
    private volatile float mWeight;

    @Nullable
    private List<CarouselBannerModel> modelList;
    private volatile boolean showNoBodyFatErrorDialog;

    @Nullable
    private CommonDialog<DialogParams> smallDialog;

    @Nullable
    private UserPhotoAdapter userAdapter;

    @Nullable
    private CommonDialog<?> userDialog;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isMeasureTimeOut = true;
    private static boolean isShowUserDialog = true;
    private static int mWeightStatus = 1;

    @NotNull
    private Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private String mDid = "";

    @NotNull
    private volatile String userNickName = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
    private volatile int mUnit = 1;
    private volatile int mWeightFailStatus = -1;

    @NotNull
    private final List<Icon> userIcons = new ArrayList();

    @NotNull
    private volatile ArrayList<String> uIdList = new ArrayList<>();

    @NotNull
    private final BroadcastReceiver bluetoothMonitorReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity$bluetoothMonitorReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            if (action != null && action.hashCode() == -1530327060 && action.equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0) == 10) {
                ToastUtil.showToast(this.this$0.getString(zzi.m0));
                this.this$0.finish();
            }
        }
    };

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0FR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/WeightActivity$Companion;", "", "<init>", "()V", "TAG", "", "isMeasureFinished", "", "isEndWeight", "isMeasureTimeOut", "isFailed", "isShowUserDialog", "isOnlyWeight", "SAVE_WEIGHT", "WEIGHT_TYPE_NORMAL", "WEIGHT_TYPE_VISITOR", "WEIGHT_SEX_MALE", "", "WEIGHT_SEX_FEMALE", "KEY_WEIGHT_TYPE", "KEY_WEIGHT_NICK_NAME", "KEY_WEIGHT_SEX", "KEY_WEIGHT_BIRTHDAY", "KEY_WEIGHT_HEIGHT", "KEY_WEIGHT_IS_END", "KEY_WEIGHT_IS_MEASURE_FINISH", "KEY_WEIGHT_VALUE", "KEY_WEIGHT_STATUS", "KEY_WEIGHT_TYPE_VALUE", "KEY_WEIGHT_IS_SHOW_DIALOG", "KEY_WEIGHT_IS_FAILED", "KEY_WEIGHT_MATCH_NUM", "KEY_WEIGHT_DID", "KEY_WEIGHT_UNIT", "KEY_WEIGHT_HAS_CUR_USER", "KEY_WEIGHT_CUR_USER_URL", "KEY_WEIGHT_CUR_USER_VID", "KEY_WEIGHT_CUR_USER_NICK_NAME", UserAddActivity.KEY_WEIGHT_RESULT, "KEY_WEIGHT_HAS_RESULT", "KEY_WEIGHT_HAS_CUR_AGE", "KEY_WEIGHT_HAS_CUR_HEIGHT", "KEY_WEIGHT_HAS_CUR_SEX", "KEY_WEIGHT_FAIL_STATUS", "KEY_WEIGHT_HAS_MAIN", "KEY_WEIGHT_ID_LIST", "KEY_WEIGHT_IS_NEW_FIRMVERSION", "KEY_WEIGHT_PROGRESS", "DEVICE_VERSION_ALL_USER_SUPPORT_TEST_BODY_FAT", "WEIGHT_STATUS_UPLOAD_PROCEDURE", "WEIGHT_STATUS_IN_ANALYSIS", "WEIGHT_STATUS_UPLOAD_BODY_COMPOSITION", "WEIGHT_FAIL_STATUS_NO", "WEIGHT_FAIL_STATUS_APP0", "WEIGHT_FAIL_STATUS_APP1", "CONFLICT_FLAG_MATCH_NO_USER", "CONFLICT_FLAG_MATCH_ONLY_ONE_USER", "CONFLICT_FLAG_MATCH_MANY_USER", "mWeightStatus", "getMWeightStatus", "()I", "setMWeightStatus", "(I)V", "showUpdateVirtualAccountDialog", "", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "callBack", "Lkotlin/Function0;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMWeightStatus() {
            return WeightActivity.mWeightStatus;
        }

        public final void setMWeightStatus(int i) {
            WeightActivity.mWeightStatus = i;
        }

        public final void showUpdateVirtualAccountDialog(@NotNull BaseActivity activity, @NotNull FragmentManager fragmentManager, @NotNull final Function0<Unit> callBack) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            CommonDialog commonDialogCreate = new CommonDialog.c("UpdateVirtualAccount").setDialogTitle(new DialogParams.DialogDescriptionString(zzi.y0, new Object[0])).setDialogDescriptionString(new DialogParams.DialogDescriptionString(zzi.G5, new Object[0])).setPositiveText(zzi.H0).setNegativeText(zzi.r0).create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity$Companion$showUpdateVirtualAccountDialog$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    if (which == -1) {
                        callBack.invoke();
                    }
                }
            });
            commonDialogCreate.showIfNeed(fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.WeightActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/electronic/scale/WeightActivity$onCreate$1", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "onError", "code", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C23451 implements OnEcoSyncCallback {
        public C23451() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(String str, WeightActivity this$0, Integer num) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            t48.c().d(str);
            this$0.allUserSupportTestBodyFat = num.intValue() >= 31;
            Logger.i(WeightActivity.TAG, "allUserSupportTestBodyFat: " + this$0.allUserSupportTestBodyFat);
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String did, int type, int code) {
            Logger.e(WeightActivity.TAG, "getDeviceVersion onOnError  did : " + did + " , type : " + type + " , code : " + code);
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onSuccess(String did, int type, EcoSyncResult result) {
            u7r packet;
            cz7 cz7VarP;
            gz7 gz7VarR;
            u7r packet2;
            cz7 cz7VarP2;
            gz7 gz7VarR2;
            String str = (result == null || (packet2 = result.getPacket()) == null || (cz7VarP2 = packet2.p()) == null || (gz7VarR2 = cz7VarP2.r()) == null) ? null : gz7VarR2.e;
            final Integer numValueOf = (result == null || (packet = result.getPacket()) == null || (cz7VarP = packet.p()) == null || (gz7VarR = cz7VarP.r()) == null) ? null : Integer.valueOf(gz7VarR.c);
            Intrinsics.checkNotNull(numValueOf);
            final String strA = a68.a(str, numValueOf.intValue());
            Logger.i(WeightActivity.TAG, "getDeviceVersion success  did : " + did + " , type : " + type + " , packet : " + (result != null ? result.getPacket() : null));
            Handler handler = WeightActivity.this.getHandler();
            final WeightActivity weightActivity = WeightActivity.this;
            handler.post(new Runnable() { // from class: ler
                @Override // java.lang.Runnable
                public final void run() {
                    WeightActivity.C23451.onSuccess$lambda$0(strA, weightActivity, numValueOf);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ bk0 access$getMBinding(WeightActivity weightActivity) {
        return (bk0) weightActivity.getMBinding();
    }

    private final void adRealAccount(String miId) {
        Logger.i(TAG, " handleWeight add real user miId " + miId);
        this.hasMain = true;
        if (this.uIdList.contains(miId)) {
            return;
        }
        Logger.i(TAG, " handleWeight added real user miId " + miId);
        this.uIdList.add(miId);
        shouldStepBodyFit();
    }

    private final void addRealAccountIcon(String miId, String did, int heartRate, short[] zk) {
        Logger.i(TAG, "handleWeight addRealAccountIcon");
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        this.userIcons.add(0, new UserPhotoIcon(did, miId, "", 0, companion.getInstance().getAvatarAddress(), this.userNickName, heartRate, companion.getInstance().getSex(), companion.getInstance().getAge(), (int) companion.getInstance().getHeight(), zk, false, 0L, false, null, 28672, null));
        UserPhotoAdapter userPhotoAdapter = this.userAdapter;
        if (userPhotoAdapter != null) {
            userPhotoAdapter.updateData(this.userIcons);
        }
    }

    private final void addVirtualAccount(String virtualId) {
        Logger.i(TAG, "handleWeight addVirtualAccount" + virtualId);
        if (this.uIdList.contains(virtualId)) {
            return;
        }
        Logger.i(TAG, "handleWeight addVirtualAccounted " + virtualId);
        this.uIdList.add(virtualId);
        shouldStepBodyFit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addVirtualAccountIcon(String did, VirtualAccount virtualAccount) {
        ((WeightViewModel) getMViewModel()).addVirtualAccountIcon(did, virtualAccount, this.userIcons, this.userAdapter, this.hasMain || this.mMatchNum == 0 || this.allUserSupportTestBodyFat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addVirtualAccountWeightRecord(String url, final long virtualId, int sex, int height, String nickName, final int userType, long birth) {
        if (userType == 2) {
            updateVirtualUserWeightToCloud(virtualId, nickName, sex, height, birth);
        }
        ((WeightViewModel) getMViewModel()).addVirtualAccountWeightRecord(this.mDid, "yunmai.scales.ms3001", url != null ? url : "", virtualId, nickName != null ? nickName : "", WeightManager.INSTANCE.getInstance().convertToKg(this.mWeight, this.mUnit), userType, System.currentTimeMillis(), this.mBodyComposition, new SyncWeightRecordCallback() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.addVirtualAccountWeightRecord.5
            @Override // com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback
            public void onFailed() {
                Logger.i(WeightActivity.TAG, "addVirtualAccountWeightRecord sync failed");
            }

            @Override // com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback
            public void onSuccess() {
                Logger.i(WeightActivity.TAG, "addVirtualAccountWeightRecord sync success");
            }
        }, new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.addVirtualAccountWeightRecord.6
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
            public void onSuccess() throws ClassNotFoundException {
                try {
                    CommonDialog<?> userDialog = WeightActivity.this.getUserDialog();
                    if (userDialog != null) {
                        userDialog.dismiss();
                    }
                } catch (Exception e) {
                    Logger.e(WeightActivity.TAG, " addVirtualAccountWeightRecord error  " + e);
                }
                Logger.i(WeightActivity.TAG, "handleWeight add virtual user success");
                int i = userType;
                if (i == 2) {
                    ScalePageUtil.INSTANCE.goVmData(virtualId, WeightActivity.this.showNoBodyFatErrorDialog, WeightActivity.this.allUserSupportTestBodyFat);
                    AppManager companion = AppManager.INSTANCE.getInstance();
                    Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
                    Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
                    companion.killActivity(cls);
                    WeightActivity.this.finish();
                    return;
                }
                if (i == 1) {
                    Logger.i(WeightActivity.TAG, " handleWeight addVirtualAccountWeightRecord success " + WeightActivity.this.showNoBodyFatErrorDialog);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("showNoBodyFatErrorDialog", WeightActivity.this.showNoBodyFatErrorDialog);
                    WeightActivity.this.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getWeightPageIntent(bundle, true));
                    AppManager companion2 = AppManager.INSTANCE.getInstance();
                    Class<?> cls2 = Class.forName(WeightGuideActivity.class.getName());
                    Intrinsics.checkNotNullExpressionValue(cls2, "forName(...)");
                    companion2.killActivity(cls2);
                    WeightActivity.this.finish();
                }
            }
        });
    }

    public static /* synthetic */ void addVirtualAccountWeightRecord$default(WeightActivity weightActivity, String str, long j, int i, int i2, String str2, int i3, long j2, int i4, Object obj) {
        weightActivity.addVirtualAccountWeightRecord(str, j, i, i2, str2, i3, (i4 & 64) != 0 ? 0L : j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addVirtualAccountWeightRecordNew(final long virtualId, String nickName, int sex, int age, int height, long birth) {
        sw7 sw7Var;
        sw7 sw7Var2;
        sw7 sw7Var3;
        sw7 sw7Var4;
        sw7 sw7Var5;
        sw7 sw7Var6;
        sw7 sw7Var7;
        sw7 sw7Var8;
        sw7 sw7Var9;
        sw7 sw7Var10;
        sw7 sw7Var11;
        sw7 sw7Var12;
        int[] iArr = new int[12];
        rw7 rw7Var = this.mBodyComposition;
        Integer numValueOf = (rw7Var == null || (sw7Var12 = rw7Var.h) == null) ? null : Integer.valueOf(sw7Var12.c);
        Intrinsics.checkNotNull(numValueOf);
        iArr[0] = numValueOf.intValue();
        rw7 rw7Var2 = this.mBodyComposition;
        Integer numValueOf2 = (rw7Var2 == null || (sw7Var11 = rw7Var2.h) == null) ? null : Integer.valueOf(sw7Var11.d);
        Intrinsics.checkNotNull(numValueOf2);
        iArr[1] = numValueOf2.intValue();
        rw7 rw7Var3 = this.mBodyComposition;
        Integer numValueOf3 = (rw7Var3 == null || (sw7Var10 = rw7Var3.h) == null) ? null : Integer.valueOf(sw7Var10.e);
        Intrinsics.checkNotNull(numValueOf3);
        iArr[2] = numValueOf3.intValue();
        rw7 rw7Var4 = this.mBodyComposition;
        Integer numValueOf4 = (rw7Var4 == null || (sw7Var9 = rw7Var4.h) == null) ? null : Integer.valueOf(sw7Var9.f);
        Intrinsics.checkNotNull(numValueOf4);
        iArr[3] = numValueOf4.intValue();
        rw7 rw7Var5 = this.mBodyComposition;
        Integer numValueOf5 = (rw7Var5 == null || (sw7Var8 = rw7Var5.h) == null) ? null : Integer.valueOf(sw7Var8.g);
        Intrinsics.checkNotNull(numValueOf5);
        iArr[4] = numValueOf5.intValue();
        rw7 rw7Var6 = this.mBodyComposition;
        Integer numValueOf6 = (rw7Var6 == null || (sw7Var7 = rw7Var6.h) == null) ? null : Integer.valueOf(sw7Var7.h);
        Intrinsics.checkNotNull(numValueOf6);
        iArr[5] = numValueOf6.intValue();
        rw7 rw7Var7 = this.mBodyComposition;
        Integer numValueOf7 = (rw7Var7 == null || (sw7Var6 = rw7Var7.i) == null) ? null : Integer.valueOf(sw7Var6.c);
        Intrinsics.checkNotNull(numValueOf7);
        iArr[6] = numValueOf7.intValue();
        rw7 rw7Var8 = this.mBodyComposition;
        Integer numValueOf8 = (rw7Var8 == null || (sw7Var5 = rw7Var8.i) == null) ? null : Integer.valueOf(sw7Var5.d);
        Intrinsics.checkNotNull(numValueOf8);
        iArr[7] = numValueOf8.intValue();
        rw7 rw7Var9 = this.mBodyComposition;
        Integer numValueOf9 = (rw7Var9 == null || (sw7Var4 = rw7Var9.i) == null) ? null : Integer.valueOf(sw7Var4.e);
        Intrinsics.checkNotNull(numValueOf9);
        iArr[8] = numValueOf9.intValue();
        rw7 rw7Var10 = this.mBodyComposition;
        Integer numValueOf10 = (rw7Var10 == null || (sw7Var3 = rw7Var10.i) == null) ? null : Integer.valueOf(sw7Var3.f);
        Intrinsics.checkNotNull(numValueOf10);
        iArr[9] = numValueOf10.intValue();
        rw7 rw7Var11 = this.mBodyComposition;
        Integer numValueOf11 = (rw7Var11 == null || (sw7Var2 = rw7Var11.i) == null) ? null : Integer.valueOf(sw7Var2.g);
        Intrinsics.checkNotNull(numValueOf11);
        iArr[10] = numValueOf11.intValue();
        rw7 rw7Var12 = this.mBodyComposition;
        Integer numValueOf12 = (rw7Var12 == null || (sw7Var = rw7Var12.i) == null) ? null : Integer.valueOf(sw7Var.h);
        Intrinsics.checkNotNull(numValueOf12);
        iArr[11] = numValueOf12.intValue();
        updateVirtualUserWeightToCloud(virtualId, nickName, sex, height, birth);
        WeightViewModel weightViewModel = (WeightViewModel) getMViewModel();
        String str = this.mDid;
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        rw7 rw7Var13 = this.mBodyComposition;
        Integer numValueOf13 = rw7Var13 != null ? Integer.valueOf(rw7Var13.f32963k) : null;
        Intrinsics.checkNotNull(numValueOf13);
        weightViewModel.addBodyCompositionWeightRecord(str, "yunmai.scales.ms3001", 2, userId, virtualId, "", nickName, numValueOf13.intValue(), sex, age, height, WeightManager.INSTANCE.getInstance().convertToKg(this.mWeight, this.mUnit), iArr, System.currentTimeMillis(), true, new SyncWeightRecordCallback() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.addVirtualAccountWeightRecordNew.1
            @Override // com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback
            public void onFailed() {
                Logger.i(WeightActivity.TAG, "addVirtualAccountWeightRecordNew sync failed");
            }

            @Override // com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback
            public void onSuccess() {
                Logger.i(WeightActivity.TAG, "addVirtualAccountWeightRecordNew sync success");
            }
        }, new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.addVirtualAccountWeightRecordNew.2
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
            public void onSuccess() throws ClassNotFoundException {
                Logger.i(WeightActivity.TAG, " handleWeight addVirtualAccountWeightRecordNew success showNoBodyFatErrorDialog : " + WeightActivity.this.showNoBodyFatErrorDialog);
                ScalePageUtil.INSTANCE.goVmData(virtualId, WeightActivity.this.showNoBodyFatErrorDialog, true);
                AppManager companion = AppManager.INSTANCE.getInstance();
                Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
                Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
                companion.killActivity(cls);
                WeightActivity.this.finish();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkIsTeenager() {
        if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
            WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
            String birthday = ((WeightViewModel) getMViewModel()).getBirthday();
            Intrinsics.checkNotNull(birthday);
            if (weightInfoUtil.getAge(birthday) >= 18) {
                return;
            }
        } else if (MiAccountManager.INSTANCE.getInstance().getAge() >= 18) {
            return;
        }
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setSubtitle(getString(zzi.h4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delVirtualUserToDevice(long virtualId) {
        ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).delVirtualUserToDevice(MiAccountManager.INSTANCE.getInstance().getMiId(), virtualId, this.mDid, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.delVirtualUserToDevice.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(WeightActivity.TAG, "delVirtualUserToDevice error it " + type + "  " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i(WeightActivity.TAG, "delVirtualUserToDevice success it " + (result != null ? result.getPacket() : null));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void endWeight(String did, int weight, int unit) {
        if (isEndWeight) {
            return;
        }
        Logger.i(TAG, "handleWeight endWeight matchNum  : " + this.mMatchNum);
        isEndWeight = true;
        this.mDid = did;
        this.mUnit = unit;
        int i = 10;
        this.mWeight = weight / 10;
        setWeight$default(this, weight, ((WeightViewModel) getMViewModel()).getUnitString(this.mUnit), false, 4, null);
        if (unit == 2) {
            i = 22;
        } else if (unit == 3) {
            i = 20;
        }
        if (this.mWeight < i && !Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
            stepSmallObjectsResult(false);
            return;
        }
        if (this.mMatchNum == 0) {
            if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
                Logger.i(TAG, "handleWeight VisitorMeasure mMatch is zero ");
            }
            if (!this.allUserSupportTestBodyFat) {
                this.handler.post(new Runnable() { // from class: qdr
                    @Override // java.lang.Runnable
                    public final void run() {
                        WeightActivity.endWeight$lambda$6(this.f31421a);
                    }
                });
                return;
            }
            this.mMatchNum = ((WeightViewModel) getMViewModel()).matchByCloud(WeightManager.INSTANCE.getInstance().convertToKg(this.mWeight, this.mUnit), this.mDid, this.uIdList);
            this.isFixNum = this.mMatchNum > 0;
            Logger.i("endWeight fix matchNum : " + this.mMatchNum + " userId List : " + f4b.c(this.uIdList), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endWeight$lambda$6(WeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stepFailedApp0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getAllVirtualAccount(final String did) {
        Logger.i(TAG, "handleWeight getAllVirtualAccount weight : " + this.mWeight);
        this.userIcons.clear();
        this.userIcons.add(new AddUserIcon("", lni.A, getString(zzi.F)));
        if (this.hasMain || this.mMatchNum == 0 || this.allUserSupportTestBodyFat) {
            addRealAccountIcon(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId(), did, 0, new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        }
        ((WeightViewModel) getMViewModel()).getAllVirtualAccount(did, new ElectronicScaleBaseViewModel.OnVirtualAccountListener() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.getAllVirtualAccount.1
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onFailed() {
            }

            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onFinishVirtualAccount() {
            }

            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onNoVirtualAccount() {
                Logger.i(WeightActivity.TAG, "handleWeight getAllVirtualAccount onNoVirtualAccount");
            }

            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onVirtualAccount(VirtualAccount account) {
                Intrinsics.checkNotNullParameter(account, "account");
                WeightActivity.this.addVirtualAccountIcon(did, account);
            }
        });
    }

    private final void gotoDataReport(int sex, int age, int height) {
        jx7 jx7Var;
        WeightManager companion = WeightManager.INSTANCE.getInstance();
        rw7 rw7Var = this.mBodyComposition;
        String strValueOf = String.valueOf((rw7Var == null || (jx7Var = rw7Var.c) == null) ? null : Long.valueOf(jx7Var.c));
        String str = this.mDid;
        rw7 rw7Var2 = this.mBodyComposition;
        Integer numValueOf = rw7Var2 != null ? Integer.valueOf(rw7Var2.f32963k) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue();
        float f = this.mWeight;
        int i = this.mUnit;
        rw7 rw7Var3 = this.mBodyComposition;
        lx7 lx7Var = rw7Var3 != null ? rw7Var3.j : null;
        Intrinsics.checkNotNull(lx7Var);
        rw7 rw7Var4 = this.mBodyComposition;
        sw7 sw7Var = rw7Var4 != null ? rw7Var4.h : null;
        Intrinsics.checkNotNull(sw7Var);
        rw7 rw7Var5 = this.mBodyComposition;
        sw7 sw7Var2 = rw7Var5 != null ? rw7Var5.i : null;
        Intrinsics.checkNotNull(sw7Var2);
        VirtualAccount virtualAccountGenerateVirtualUserFromResult = companion.generateVirtualUserFromResult(strValueOf, str, iIntValue, f, i, lx7Var, sw7Var, sw7Var2);
        if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
            String nickName = ((WeightViewModel) getMViewModel()).getNickName();
            Intrinsics.checkNotNull(nickName);
            virtualAccountGenerateVirtualUserFromResult.setName(nickName);
        }
        Intent intent = new Intent(this, (Class<?>) DataReportActivity.class);
        intent.putExtra(DataReportActivity.KEY_BODY_RESULT, virtualAccountGenerateVirtualUserFromResult);
        intent.putExtra(DataReportActivity.KEY_BODY_SEX, sex);
        intent.putExtra(DataReportActivity.KEY_BODY_AGE, age);
        intent.putExtra(DataReportActivity.KEY_BODY_HEIGHT, ((WeightViewModel) getMViewModel()).getHeight());
        Logger.i("handle weight VisitorMeasure result " + f4b.c(virtualAccountGenerateVirtualUserFromResult), new Object[0]);
        Logger.i("handle weight VisitorMeasure sex " + sex, new Object[0]);
        Logger.i("handle weight VisitorMeasure age " + age, new Object[0]);
        Logger.i("handle weight VisitorMeasure height " + height, new Object[0]);
        startActivity(intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleUploadBodyComposition(u7r packet) {
        Logger.i(TAG, "handleWeight UPLOAD_BODY_COMPOSITION");
        if (isMeasureFinished) {
            return;
        }
        isMeasureFinished = true;
        mWeightStatus = 3;
        ww7 ww7VarT = packet.t();
        this.mBodyComposition = ww7VarT != null ? ww7VarT.p() : null;
        rw7 rw7Var = this.mBodyComposition;
        Integer numValueOf = rw7Var != null ? Integer.valueOf(rw7Var.f) : null;
        Intrinsics.checkNotNull(numValueOf);
        this.mWeight = numValueOf.intValue() / 10;
        WeightManager companion = WeightManager.INSTANCE.getInstance();
        rw7 rw7Var2 = this.mBodyComposition;
        Integer numValueOf2 = rw7Var2 != null ? Integer.valueOf(rw7Var2.f) : null;
        Intrinsics.checkNotNull(numValueOf2);
        setWeight$default(this, companion.kgConvertOther(numValueOf2.intValue(), this.mUnit), ((WeightViewModel) getMViewModel()).getUnitString(this.mUnit), false, 4, null);
        this.handler.post(new Runnable() { // from class: ker
            @Override // java.lang.Runnable
            public final void run() {
                WeightActivity.handleUploadBodyComposition$lambda$3(this.f23785a);
            }
        });
        this.handler.postDelayed(new Runnable() { // from class: odr
            @Override // java.lang.Runnable
            public final void run() {
                WeightActivity.handleUploadBodyComposition$lambda$4(this.f29046a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void handleUploadBodyComposition$lambda$3(WeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((bk0) this$0.getMBinding()).O.setProgress(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleUploadBodyComposition$lambda$4(WeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!EightDeviceSyncImpl.INSTANCE.isBodyCompositionHasZk(this$0.mBodyComposition)) {
            this$0.stepFailed();
        }
        this$0.isShowUserDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleUploadChildData(u7r packet) {
        jx7 jx7Var;
        kx7 kx7Var;
        tw7 tw7VarQ;
        tw7 tw7VarQ2;
        Logger.i(TAG, "handleWeight UPLOAD_CHILD_DATA");
        if (isMeasureFinished) {
            return;
        }
        ww7 ww7VarT = packet.t();
        Long lValueOf = null;
        tw7 tw7VarQ3 = ww7VarT != null ? ww7VarT.q() : null;
        ww7 ww7VarT2 = packet.t();
        Integer numValueOf = (ww7VarT2 == null || (tw7VarQ2 = ww7VarT2.q()) == null) ? null : Integer.valueOf(tw7VarQ2.e);
        ww7 ww7VarT3 = packet.t();
        Integer numValueOf2 = (ww7VarT3 == null || (tw7VarQ = ww7VarT3.q()) == null) ? null : Integer.valueOf(tw7VarQ.f);
        Logger.i(TAG, " handleWeight userType " + numValueOf);
        Logger.i(TAG, " handleWeight matchNum " + this.mMatchNum);
        WeightManager companion = WeightManager.INSTANCE.getInstance();
        Intrinsics.checkNotNull(numValueOf2);
        setWeight$default(this, companion.kgConvertOther(numValueOf2.intValue(), this.mUnit), ((WeightViewModel) getMViewModel()).getUnitString(this.mUnit), false, 4, null);
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (tw7VarQ3 != null && (kx7Var = tw7VarQ3.d) != null) {
                lValueOf = Long.valueOf(kx7Var.c);
            }
            Intrinsics.checkNotNull(lValueOf);
            addVirtualAccount(String.valueOf(lValueOf.longValue()));
            return;
        }
        if (tw7VarQ3 != null && (jx7Var = tw7VarQ3.c) != null) {
            lValueOf = Long.valueOf(jx7Var.c);
        }
        Intrinsics.checkNotNull(lValueOf);
        adRealAccount(String.valueOf(lValueOf.longValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleUploadWeightProcedure(String did, u7r packet) {
        vw7 vw7VarW;
        vw7 vw7VarW2;
        vw7 vw7VarW3;
        vw7 vw7VarW4;
        vw7 vw7VarW5;
        if (isFailed || isMeasureFinished || isEndWeight) {
            return;
        }
        mWeightStatus = 1;
        ww7 ww7VarT = packet.t();
        Integer numValueOf = null;
        Integer numValueOf2 = (ww7VarT == null || (vw7VarW5 = ww7VarT.w()) == null) ? null : Integer.valueOf(vw7VarW5.c);
        if (numValueOf2 != null) {
            this.mWeight = numValueOf2.intValue() / 10;
        }
        ww7 ww7VarT2 = packet.t();
        Integer numValueOf3 = (ww7VarT2 == null || (vw7VarW4 = ww7VarT2.w()) == null) ? null : Integer.valueOf(vw7VarW4.f);
        Intrinsics.checkNotNull(numValueOf3);
        this.mMatchNum = numValueOf3.intValue();
        WeightViewModel weightViewModel = (WeightViewModel) getMViewModel();
        ww7 ww7VarT3 = packet.t();
        Integer numValueOf4 = (ww7VarT3 == null || (vw7VarW3 = ww7VarT3.w()) == null) ? null : Integer.valueOf(vw7VarW3.d);
        Intrinsics.checkNotNull(numValueOf4);
        String unitString = weightViewModel.getUnitString(numValueOf4.intValue());
        ww7 ww7VarT4 = packet.t();
        Integer numValueOf5 = (ww7VarT4 == null || (vw7VarW2 = ww7VarT4.w()) == null) ? null : Integer.valueOf(vw7VarW2.e);
        Logger.i(TAG, "handleWeight VisitorMeasure UPLOAD_WEIGH_PROCEDURE");
        Logger.i(TAG, "handleWeight VisitorMeasure weight" + numValueOf2);
        Logger.i(TAG, "handleWeight VisitorMeasure unit" + unitString);
        Logger.i(TAG, "handleWeight VisitorMeasure lockFlag" + numValueOf5);
        Logger.i(TAG, "handleWeight VisitorMeasure matchNum" + this.mMatchNum);
        if (numValueOf2 != null) {
            if (numValueOf2.intValue() <= 0) {
                if (isMeasureFinished || isFailed) {
                    return;
                }
                Logger.i(TAG, "handleWeight weight is 0");
                ToastUtil.showToast(getString(zzi.x4));
                finish();
                return;
            }
            setWeight$default(this, numValueOf2.intValue(), unitString, false, 4, null);
            if (numValueOf5 != null && numValueOf5.intValue() == 1) {
                int iIntValue = numValueOf2.intValue();
                ww7 ww7VarT5 = packet.t();
                if (ww7VarT5 != null && (vw7VarW = ww7VarT5.w()) != null) {
                    numValueOf = Integer.valueOf(vw7VarW.d);
                }
                Intrinsics.checkNotNull(numValueOf);
                endWeight(did, iIntValue, numValueOf.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleVirtualAccountInfoIncompleteCase(final VirtualAccount virtualAccount) {
        Companion companion = INSTANCE;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        companion.showUpdateVirtualAccountDialog(this, supportFragmentManager, new Function0() { // from class: jer
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightActivity.handleVirtualAccountInfoIncompleteCase$lambda$25(this.f22717a, virtualAccount);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleVirtualAccountInfoIncompleteCase$lambda$25(WeightActivity this$0, VirtualAccount virtualAccount) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(virtualAccount, "$virtualAccount");
        WeightResult weightResultBodyCompositionToWeightResult = WeightResult.INSTANCE.bodyCompositionToWeightResult(this$0.mBodyComposition, String.valueOf(virtualAccount.getAccountId()), this$0.mWeight, this$0.mDid, System.currentTimeMillis());
        Logger.i(TAG, "isIncomplete weightResult : " + f4b.c(weightResultBodyCompositionToWeightResult));
        virtualAccount.setSex(-1);
        UserAddActivity.INSTANCE.start(this$0, virtualAccount, 2, this$0.mDid, (FileUtils.S_IRWXU & 16) != 0 ? 0.0f : this$0.mWeight, (FileUtils.S_IRWXU & 32) != 0 ? 1 : this$0.mUnit, (FileUtils.S_IRWXU & 64) != 0 ? false : true, (FileUtils.S_IRWXU & 128) != 0 ? null : weightResultBodyCompositionToWeightResult, (FileUtils.S_IRWXU & 256) != 0 ? false : false);
        AppManager companion = AppManager.INSTANCE.getInstance();
        Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
        Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
        companion.killActivity(cls);
        this$0.finish();
        return Unit.INSTANCE;
    }

    private final boolean hasMain() {
        if (this.uIdList.size() < 1) {
            return false;
        }
        Iterator<T> it = this.uIdList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual((String) it.next(), MiAccountManager.INSTANCE.getInstance().getMiId())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void init(Bundle savedInstanceState) {
        isMeasureTimeOut = true;
        if (savedInstanceState == null) {
            isMeasureFinished = false;
            isEndWeight = false;
            isFailed = false;
            isShowUserDialog = true;
            mWeightStatus = 1;
            Bundle bundleExtra = getIntent().getBundleExtra(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_KEY);
            this.mBundle = bundleExtra;
            String string = bundleExtra != null ? bundleExtra.getString("electronic_weight_type") : null;
            ((WeightViewModel) getMViewModel()).setType(string);
            if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, string)) {
                WeightViewModel weightViewModel = (WeightViewModel) getMViewModel();
                Bundle bundle = this.mBundle;
                weightViewModel.setNickName(bundle != null ? bundle.getString(KEY_WEIGHT_NICK_NAME) : null);
                WeightViewModel weightViewModel2 = (WeightViewModel) getMViewModel();
                Bundle bundle2 = this.mBundle;
                weightViewModel2.setSex(bundle2 != null ? bundle2.getInt("electronic_weight_sex") : 0);
                WeightViewModel weightViewModel3 = (WeightViewModel) getMViewModel();
                Bundle bundle3 = this.mBundle;
                weightViewModel3.setBirthday(bundle3 != null ? bundle3.getString(KEY_WEIGHT_BIRTHDAY) : null);
                WeightViewModel weightViewModel4 = (WeightViewModel) getMViewModel();
                Bundle bundle4 = this.mBundle;
                weightViewModel4.setHeight(bundle4 != null ? bundle4.getInt("electronic_weight_height") : 0);
            } else {
                WeightViewModel weightViewModel5 = (WeightViewModel) getMViewModel();
                MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
                weightViewModel5.setHeight((int) companion.getInstance().getHeight());
                ((WeightViewModel) getMViewModel()).setSex(companion.getInstance().getSex());
            }
            startWeight();
        } else {
            isMeasureFinished = savedInstanceState.getBoolean("electronic_weight_finish");
            isEndWeight = savedInstanceState.getBoolean(KEY_WEIGHT_IS_END);
            isFailed = savedInstanceState.getBoolean(KEY_WEIGHT_IS_FAILED);
            isShowUserDialog = savedInstanceState.getBoolean("electronic_weight_dialog");
            mWeightStatus = savedInstanceState.getInt("electronic_weight_status");
            this.mWeight = savedInstanceState.getFloat(KEY_WEIGHT_VALUE);
            this.mUnit = savedInstanceState.getInt("electronic_weight_unit");
            ((WeightViewModel) getMViewModel()).setType(savedInstanceState.getString("electronic_weight_type"));
            this.mWeightFailStatus = savedInstanceState.getInt(KEY_WEIGHT_FAIL_STATUS);
            this.hasMain = savedInstanceState.getBoolean(KEY_WEIGHT_HAS_MAIN);
            ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList(KEY_WEIGHT_ID_LIST);
            Intrinsics.checkNotNull(stringArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            this.uIdList = stringArrayList;
            this.allUserSupportTestBodyFat = savedInstanceState.getBoolean(KEY_WEIGHT_IS_NEW_FIRMVERSION);
            if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
                ((WeightViewModel) getMViewModel()).setNickName(savedInstanceState.getString(KEY_WEIGHT_NICK_NAME));
                ((WeightViewModel) getMViewModel()).setSex(savedInstanceState.getInt("electronic_weight_sex"));
                ((WeightViewModel) getMViewModel()).setBirthday(savedInstanceState.getString(KEY_WEIGHT_BIRTHDAY));
                ((WeightViewModel) getMViewModel()).setHeight(savedInstanceState.getInt("electronic_weight_height"));
            } else {
                WeightViewModel weightViewModel6 = (WeightViewModel) getMViewModel();
                MiAccountManager.Companion companion2 = MiAccountManager.INSTANCE;
                weightViewModel6.setHeight((int) companion2.getInstance().getHeight());
                ((WeightViewModel) getMViewModel()).setSex(companion2.getInstance().getSex());
            }
            this.mMatchNum = savedInstanceState.getInt(KEY_WEIGHT_MATCH_NUM);
            String string2 = savedInstanceState.getString("electronic_weight_did");
            Intrinsics.checkNotNull(string2);
            this.mDid = string2;
            ((WeightViewModel) getMViewModel()).initVirtualAccount(this.mDid);
            if (savedInstanceState.getBoolean(KEY_WEIGHT_HAS_CUR_USER)) {
                String string3 = savedInstanceState.getString(KEY_WEIGHT_CUR_USER_NICK_NAME);
                String string4 = savedInstanceState.getString(KEY_WEIGHT_CUR_USER_VID);
                String string5 = savedInstanceState.getString(KEY_WEIGHT_CUR_USER_URL);
                if (this.allUserSupportTestBodyFat) {
                    int i = savedInstanceState.getInt(KEY_WEIGHT_HAS_CUR_AGE);
                    int i2 = savedInstanceState.getInt("electronic_weight_height");
                    int i3 = savedInstanceState.getInt("electronic_weight_sex");
                    String str = this.mDid;
                    String miId = MiAccountManager.INSTANCE.getInstance().getMiId();
                    Intrinsics.checkNotNull(string4);
                    Intrinsics.checkNotNull(string5);
                    this.mCurVirtualUserIcon = new UserPhotoIcon(str, miId, string4, 0, string5, string3, 0, i3, i, i2, null, true, 0L, false, null, 28672, null);
                } else {
                    String str2 = this.mDid;
                    String miId2 = MiAccountManager.INSTANCE.getInstance().getMiId();
                    Intrinsics.checkNotNull(string4);
                    Intrinsics.checkNotNull(string5);
                    this.mCurVirtualUserIcon = new UserPhotoIcon(str2, miId2, string4, 0, string5, string3, 0, 0, 0, 0, null, true, 0L, false, null, 28672, null);
                }
                UserPhotoIcon userPhotoIcon = this.mCurVirtualUserIcon;
                Intrinsics.checkNotNull(userPhotoIcon);
                userPhotoIcon.setVirtualAccount(((WeightViewModel) getMViewModel()).getVirtualUserByLocal(this.mDid, Long.parseLong(string4)));
            }
            if (savedInstanceState.getBoolean(KEY_WEIGHT_HAS_RESULT)) {
                String string6 = savedInstanceState.getString(KEY_WEIGHT_RESULT);
                Logger.i(TAG, "result:" + string6);
                this.mBodyComposition = (rw7) f4b.a(string6, rw7.class);
            }
            int i4 = 10;
            setWeight$default(this, (int) (this.mWeight * 10), ((WeightViewModel) getMViewModel()).getUnitString(this.mUnit), false, 4, null);
            if (this.mUnit == 2) {
                i4 = 22;
            } else if (this.mUnit == 3) {
                i4 = 20;
            }
            if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType()) && isMeasureFinished) {
                if (isNoMeasureData() || !EightDeviceSyncImpl.INSTANCE.hasUserBia(this.mBodyComposition)) {
                    stepFailed();
                } else {
                    stepVisitorResult();
                }
            } else if (this.mWeight >= i4 || Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType()) || !isEndWeight) {
                int i5 = mWeightStatus;
                if (i5 == 1) {
                    startWeight();
                } else if (i5 == 2) {
                    ((bk0) getMBinding()).O.setProgress(savedInstanceState.getInt(KEY_WEIGHT_PROGRESS));
                    stepBodyFit();
                } else if (this.mMatchNum == 0 || isFailed || isMeasureFinished) {
                    if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
                        Logger.i(TAG, "handleWeight reVisitorMeasure mMatch is zero ");
                    }
                    int i6 = this.mWeightFailStatus;
                    if (i6 == 1) {
                        stepFailedApp0();
                    } else if (i6 != 2) {
                        stepFailed();
                    } else {
                        stepFailedApp1();
                    }
                }
            } else {
                stepSmallObjectsResult(true);
            }
        }
        if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
            return;
        }
        EightDeviceSyncImpl eightDeviceSyncImpl = new EightDeviceSyncImpl();
        eightDeviceSyncImpl.syncMainUserInfoByDid(this.mDid, true);
        eightDeviceSyncImpl.syncVirtualUser(this.mDid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBanner() {
        this.guide = new int[]{zzi.O5, zzi.P5, zzi.Q5};
        ArrayList arrayList = new ArrayList();
        this.modelList = arrayList;
        Intrinsics.checkNotNull(arrayList);
        arrayList.add(new CarouselBannerModel(UIUtils.isNightMode(this) ? ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_GUIDE_1_NIGHT : ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_GUIDE_1, null, null, null, null, 30, null));
        List<CarouselBannerModel> list = this.modelList;
        Intrinsics.checkNotNull(list);
        list.add(new CarouselBannerModel(UIUtils.isNightMode(this) ? ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_GUIDE_2_NIGHT : ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_GUIDE_2, null, null, null, null, 30, null));
        List<CarouselBannerModel> list2 = this.modelList;
        Intrinsics.checkNotNull(list2);
        list2.add(new CarouselBannerModel(UIUtils.isNightMode(this) ? ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_GUIDE_3_NIGHT : ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_GUIDE_3, null, null, null, null, 30, null));
        EcoBanner bannerView = ((bk0) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(bannerView, "bannerView");
        ViewExtKt.visible(bannerView);
        ((bk0) getMBinding()).A.setUserInputEnabled(false);
        EcoBanner ecoBanner = ((bk0) getMBinding()).A;
        List<CarouselBannerModel> list3 = this.modelList;
        Intrinsics.checkNotNull(list3);
        ecoBanner.setData(list3);
        ((bk0) getMBinding()).A.setOnPageChangeListener(new EcoBanner.OnPageChangerListener() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.initBanner.1
            @Override // com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner.OnPageChangerListener
            public void onPageChange(int page) {
                if (page > -1) {
                    TextView textView = WeightActivity.access$getMBinding(WeightActivity.this).P;
                    int[] iArr = WeightActivity.this.guide;
                    Intrinsics.checkNotNull(iArr);
                    textView.setText(iArr[page % 3]);
                }
            }
        });
        ElectronicScaleManager.Companion companion = ElectronicScaleManager.INSTANCE;
        ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide1 = ((bk0) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(imgGuide1, "imgGuide1");
        electronicScaleManagerExtKt.loadImageFromNet(imgGuide1, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_1, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_1_NIGHT);
        ElectronicScaleManager electronicScaleManagerExtKt2 = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide2 = ((bk0) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(imgGuide2, "imgGuide2");
        electronicScaleManagerExtKt2.loadImageFromNet(imgGuide2, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_2, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_2_NIGHT);
        ElectronicScaleManager electronicScaleManagerExtKt3 = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide3 = ((bk0) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(imgGuide3, "imgGuide3");
        electronicScaleManagerExtKt3.loadImageFromNet(imgGuide3, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_3, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_3_NIGHT);
        ElectronicScaleManager electronicScaleManagerExtKt4 = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide4 = ((bk0) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(imgGuide4, "imgGuide4");
        electronicScaleManagerExtKt4.loadImageFromNet(imgGuide4, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_4, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_4_NIGHT);
        ElectronicScaleManager electronicScaleManagerExtKt5 = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide5 = ((bk0) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(imgGuide5, "imgGuide5");
        electronicScaleManagerExtKt5.loadImageFromNet(imgGuide5, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_5, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_5_NIGHT);
        ElectronicScaleManager electronicScaleManagerExtKt6 = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide6 = ((bk0) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(imgGuide6, "imgGuide6");
        electronicScaleManagerExtKt6.loadImageFromNet(imgGuide6, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_6, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_6_NIGHT);
        ((bk0) getMBinding()).A0.post(new Runnable() { // from class: aer
            @Override // java.lang.Runnable
            public final void run() {
                WeightActivity.initBanner$lambda$27(this.f934a);
            }
        });
        ((bk0) getMBinding()).m0.setText(Html.fromHtml(getString(zzi.B3)));
        ((bk0) getMBinding()).n0.setText(Html.fromHtml(getString(zzi.C3)));
        ((bk0) getMBinding()).o0.setText(Html.fromHtml(getString(zzi.D3)));
        ((bk0) getMBinding()).p0.setText(Html.fromHtml(getString(zzi.E3)));
        ((bk0) getMBinding()).q0.setText(Html.fromHtml(getString(zzi.F3)));
        ((bk0) getMBinding()).r0.setText(Html.fromHtml(getString(zzi.G3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initBanner$lambda$27(WeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imgGuide1 = ((bk0) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(imgGuide1, "imgGuide1");
        this$0.setImageGuideLayoutParams(imgGuide1);
        ImageView imgGuide2 = ((bk0) this$0.getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(imgGuide2, "imgGuide2");
        this$0.setImageGuideLayoutParams(imgGuide2);
        ImageView imgGuide3 = ((bk0) this$0.getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(imgGuide3, "imgGuide3");
        this$0.setImageGuideLayoutParams(imgGuide3);
        ImageView imgGuide4 = ((bk0) this$0.getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(imgGuide4, "imgGuide4");
        this$0.setImageGuideLayoutParams(imgGuide4);
        ImageView imgGuide5 = ((bk0) this$0.getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(imgGuide5, "imgGuide5");
        this$0.setImageGuideLayoutParams(imgGuide5);
        ImageView imgGuide6 = ((bk0) this$0.getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(imgGuide6, "imgGuide6");
        this$0.setImageGuideLayoutParams(imgGuide6);
    }

    private final void initView() {
        setActionBarDisplayable(true);
        registerReceivers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNoMeasureData() {
        if (this.mBodyComposition != null) {
            rw7 rw7Var = this.mBodyComposition;
            Intrinsics.checkNotNull(rw7Var);
            if (rw7Var.h != null) {
                rw7 rw7Var2 = this.mBodyComposition;
                Intrinsics.checkNotNull(rw7Var2);
                if (rw7Var2.h.c != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isShowUserDialog() {
        boolean z;
        rw7 rw7Var;
        kx7 kx7Var;
        if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
            isMeasureFinished = true;
            if (isNoMeasureData() || !EightDeviceSyncImpl.INSTANCE.hasUserBia(this.mBodyComposition)) {
                stepFailed();
                return;
            } else {
                stepVisitorResult();
                return;
            }
        }
        if (!this.allUserSupportTestBodyFat || this.mBodyComposition == null) {
            z = false;
        } else {
            rw7 rw7Var2 = this.mBodyComposition;
            Intrinsics.checkNotNull(rw7Var2);
            if (rw7Var2.e == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (this.mMatchNum != 1 && !z) {
            isShowUserDialog = true;
            if (this.allUserSupportTestBodyFat) {
                if (isNoMeasureData()) {
                    stepFailed();
                    return;
                } else {
                    stepFailedApp0();
                    return;
                }
            }
            if (this.hasMain && isNoMeasureData()) {
                stepFailed();
                return;
            } else {
                stepFailedApp0();
                return;
            }
        }
        Logger.i(TAG, "fix num : " + this.isFixNum);
        if (this.allUserSupportTestBodyFat && this.isFixNum) {
            Logger.i(TAG, "fix num size : " + this.uIdList.size());
            isShowUserDialog = false;
            stepFailed();
            return;
        }
        if (this.allUserSupportTestBodyFat ? (rw7Var = this.mBodyComposition) == null || (kx7Var = rw7Var.d) == null || kx7Var.c != 0 : !this.hasMain) {
            if (this.uIdList.size() > 0) {
                final Ref.LongRef longRef = new Ref.LongRef();
                String str = this.uIdList.get(0);
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                longRef.element = Long.parseLong(str);
                if (this.allUserSupportTestBodyFat && this.mBodyComposition != null) {
                    rw7 rw7Var3 = this.mBodyComposition;
                    Intrinsics.checkNotNull(rw7Var3);
                    longRef.element = rw7Var3.d.c;
                }
                ((WeightViewModel) getMViewModel()).getVirtualAccountByVirtualId(this.mDid, longRef.element, new ElectronicScaleBaseViewModel.OnVirtualAccountListener() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.isShowUserDialog.1
                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                    public void onFailed() throws ClassNotFoundException {
                        ToastUtil.showShortToast(zzi.e4);
                        ScalePageUtil.goVmData$default(ScalePageUtil.INSTANCE, longRef.element, false, true, 2, null);
                        AppManager companion = AppManager.INSTANCE.getInstance();
                        Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
                        Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
                        companion.killActivity(cls);
                        WeightActivity.this.finish();
                    }

                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                    public void onFinishVirtualAccount() {
                    }

                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                    public void onNoVirtualAccount() {
                        WeightActivity.isShowUserDialog = true;
                        Logger.i(WeightActivity.TAG, "handleWeight onNoVirtualAccount mMatchNum = 1  it ： " + longRef.element);
                        if (WeightActivity.this.allUserSupportTestBodyFat && WeightActivity.this.isNoMeasureData()) {
                            WeightActivity.this.stepFailed();
                        } else {
                            WeightActivity.this.stepFailedApp0();
                        }
                        WeightActivity.this.delVirtualUserToDevice(longRef.element);
                    }

                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                    public void onVirtualAccount(VirtualAccount account) {
                        Intrinsics.checkNotNullParameter(account, "account");
                        WeightActivity.isShowUserDialog = false;
                        if (!WeightActivity.this.allUserSupportTestBodyFat) {
                            WeightActivity weightActivity = WeightActivity.this;
                            weightActivity.mCurVirtualUserIcon = new UserPhotoIcon(weightActivity.mDid, String.valueOf(account.getUid()), String.valueOf(account.getAccountId()), 0, account.getIcon(), account.getName(), 0, 0, 0, 0, null, true, 0L, false, null, 28672, null);
                            int sex = account.getSex();
                            int height = account.getHeight();
                            long birth = account.getBirth();
                            WeightActivity weightActivity2 = WeightActivity.this;
                            weightActivity2.syncRecordToVirtualUser(weightActivity2.mDid, sex, height, birth, account.getIcon(), String.valueOf(account.getAccountId()), account.getName());
                            return;
                        }
                        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
                        String dateToString = weightInfoUtil.getDateToString(account.getBirth(), "yyyy-MM-dd");
                        Intrinsics.checkNotNull(dateToString);
                        int age = weightInfoUtil.getAge(dateToString);
                        WeightActivity weightActivity3 = WeightActivity.this;
                        weightActivity3.mCurVirtualUserIcon = new UserPhotoIcon(weightActivity3.mDid, String.valueOf(account.getUid()), String.valueOf(account.getAccountId()), 0, account.getIcon(), account.getName(), 0, account.getSex(), age, account.getHeight(), null, true, 0L, false, account, 12288, null);
                        if (WeightActivity.this.isNoMeasureData()) {
                            WeightActivity.this.stepFailed();
                            return;
                        }
                        UserPhotoIcon userPhotoIcon = WeightActivity.this.mCurVirtualUserIcon;
                        VirtualAccount virtualAccount = userPhotoIcon != null ? userPhotoIcon.getVirtualAccount() : null;
                        if (virtualAccount != null) {
                            WeightActivity weightActivity4 = WeightActivity.this;
                            if (virtualAccount.isIncomplete()) {
                                weightActivity4.stepFailed();
                                weightActivity4.handleVirtualAccountInfoIncompleteCase(virtualAccount);
                                return;
                            }
                        }
                        if (EightDeviceSyncImpl.INSTANCE.hasUserBia(WeightActivity.this.getMBodyComposition())) {
                            WeightActivity.this.syncRecordFromDeviceToVirtualUserNew(account.getAccountId(), age, account.getSex(), account.getHeight(), account.getIcon(), account.getName(), account.getBirth());
                        } else {
                            WeightActivity.this.stepFailedApp1();
                        }
                    }
                });
                return;
            }
            return;
        }
        isMeasureFinished = true;
        isShowUserDialog = false;
        this.mCurVirtualUserIcon = null;
        if (!this.allUserSupportTestBodyFat) {
            if (isNoMeasureData()) {
                stepFailed();
                return;
            } else {
                syncMainUserDataFromDevice();
                return;
            }
        }
        if (isNoMeasureData()) {
            stepFailed();
        } else if (EightDeviceSyncImpl.INSTANCE.hasUserBia(this.mBodyComposition)) {
            syncMainUserDataFromDeviceNew();
        } else {
            stepFailedApp1();
        }
    }

    private final void loadMiUser() {
        o4h<rrr.a> o4hVarB = rrr.b(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        final Function1 function1 = new Function1() { // from class: vdr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightActivity.loadMiUser$lambda$28(this.f36782a, (rrr.a) obj);
            }
        };
        bg4<? super rrr.a> bg4Var = new bg4() { // from class: wdr
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                WeightActivity.loadMiUser$lambda$29(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: xdr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightActivity.loadMiUser$lambda$30(this.f39033a, (Throwable) obj);
            }
        };
        o4hVarB.O(bg4Var, new bg4() { // from class: zdr
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                WeightActivity.loadMiUser$lambda$31(function2, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMiUser$lambda$28(WeightActivity this$0, rrr.a aVar) {
        String userId;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (aVar == null || (userId = aVar.f32838b) == null) {
            userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        }
        this$0.userNickName = userId;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadMiUser$lambda$29(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMiUser$lambda$30(WeightActivity this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.userNickName = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        Logger.e(TAG, "getProfileError : " + th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadMiUser$lambda$31(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEcoPacket$lambda$0(WeightActivity this$0, ScaleEventBusIds.OnEcoPaketEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        String did = event.getDid();
        u7r packet = event.getPacket();
        Intrinsics.checkNotNull(packet);
        this$0.handleUploadWeightProcedure(did, packet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEcoPacket$lambda$1(WeightActivity this$0, ScaleEventBusIds.OnEcoPaketEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        u7r packet = event.getPacket();
        Intrinsics.checkNotNull(packet);
        this$0.handleUploadBodyComposition(packet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEcoPacket$lambda$2(WeightActivity this$0, ScaleEventBusIds.OnEcoPaketEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        u7r packet = event.getPacket();
        Intrinsics.checkNotNull(packet);
        this$0.handleUploadChildData(packet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void reWeight() {
        ((WeightViewModel) getMViewModel()).reWeight(this.mDid);
        finish();
    }

    private final void registerReceivers() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.bluetoothMonitorReceiver, intentFilter);
        ld8.c().p(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveMainUser() {
        if (this.allUserSupportTestBodyFat && EightDeviceSyncImpl.INSTANCE.hasUserBia(this.mBodyComposition)) {
            syncMainUserDataFromDeviceNew();
        } else {
            MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
            addVirtualAccountWeightRecord$default(this, companion.getInstance().getMiId(), 0L, companion.getInstance().getSex(), (int) companion.getInstance().getHeight(), companion.getInstance().getNickName(), 1, 0L, 64, null);
        }
        ((WeightViewModel) getMViewModel()).updateMainUser(this.mDid, this.mWeight, this.mUnit);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void saveVirtualUser(final VirtualAccount virtualAccount) {
        String nickName;
        if (this.allUserSupportTestBodyFat) {
            if (virtualAccount == null) {
                Logger.e(TAG, "saveWeight allUserSupportTestBodyFat virtualAccount == null");
                return;
            }
            if (virtualAccount.isIncomplete()) {
                Companion companion = INSTANCE;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                companion.showUpdateVirtualAccountDialog(this, supportFragmentManager, new Function0() { // from class: der
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WeightActivity.saveVirtualUser$lambda$15(this.f15458a, virtualAccount);
                    }
                });
                return;
            }
            long accountId = virtualAccount.getAccountId();
            String name = virtualAccount.getName();
            int sex = virtualAccount.getSex();
            WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
            String dateToString = weightInfoUtil.getDateToString(virtualAccount.getBirth(), "yyyy-MM-dd");
            Intrinsics.checkNotNull(dateToString);
            syncRecordToVirtualUserNew(accountId, name, sex, weightInfoUtil.getAge(dateToString), virtualAccount.getHeight(), virtualAccount.getBirth());
            return;
        }
        UserPhotoIcon userPhotoIcon = this.mCurVirtualUserIcon;
        if (userPhotoIcon == null) {
            Logger.e(TAG, "saveWeight allUserSupportTestBodyFat virtualAccount == null");
            showUserDialog$default(this, false, 1, null);
            return;
        }
        Logger.i(TAG, "mCurVirtualUserIcon match = 1 : " + f4b.c(userPhotoIcon));
        WeightViewModel weightViewModel = (WeightViewModel) getMViewModel();
        String str = this.mDid;
        UserPhotoIcon userPhotoIcon2 = this.mCurVirtualUserIcon;
        Intrinsics.checkNotNull(userPhotoIcon2);
        final VirtualAccount virtualUserByLocal = weightViewModel.getVirtualUserByLocal(str, Long.parseLong(userPhotoIcon2.getVirtualId()));
        Logger.i(TAG, "mCurVirtualUserIcon curVirtualAccount : " + f4b.c(virtualUserByLocal));
        if (virtualUserByLocal == null) {
            Logger.i(TAG, "mCurVirtualUserIcon curVirtualAccount is null");
            showUserDialog$default(this, false, 1, null);
            return;
        }
        if (virtualUserByLocal.isIncomplete()) {
            Companion companion2 = INSTANCE;
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            companion2.showUpdateVirtualAccountDialog(this, supportFragmentManager2, new Function0() { // from class: eer
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WeightActivity.saveVirtualUser$lambda$16(this.f16573a, virtualUserByLocal);
                }
            });
            return;
        }
        String str2 = this.mDid;
        int sex2 = virtualUserByLocal.getSex();
        int height = virtualUserByLocal.getHeight();
        long birth = virtualUserByLocal.getBirth();
        UserPhotoIcon userPhotoIcon3 = this.mCurVirtualUserIcon;
        Intrinsics.checkNotNull(userPhotoIcon3);
        String url = userPhotoIcon3.getUrl();
        UserPhotoIcon userPhotoIcon4 = this.mCurVirtualUserIcon;
        Intrinsics.checkNotNull(userPhotoIcon4);
        String virtualId = userPhotoIcon4.getVirtualId();
        UserPhotoIcon userPhotoIcon5 = this.mCurVirtualUserIcon;
        Intrinsics.checkNotNull(userPhotoIcon5);
        if (userPhotoIcon5.getNickName() != null) {
            UserPhotoIcon userPhotoIcon6 = this.mCurVirtualUserIcon;
            Intrinsics.checkNotNull(userPhotoIcon6);
            nickName = userPhotoIcon6.getNickName();
            if (nickName == null) {
                nickName = "";
            }
        } else {
            nickName = "";
        }
        syncRecordToVirtualUser(str2, sex2, height, birth, url, virtualId, nickName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveVirtualUser$lambda$15(WeightActivity this$0, VirtualAccount virtualAccount) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeightResult weightResultBodyCompositionToWeightResult = WeightResult.INSTANCE.bodyCompositionToWeightResult(this$0.mBodyComposition, String.valueOf(virtualAccount.getAccountId()), this$0.mWeight, this$0.mDid, System.currentTimeMillis());
        Logger.i(TAG, "match = 1 isIncomplete weightResult : " + f4b.c(weightResultBodyCompositionToWeightResult));
        virtualAccount.setSex(-1);
        UserAddActivity.INSTANCE.start(this$0, virtualAccount, 2, this$0.mDid, (FileUtils.S_IRWXU & 16) != 0 ? 0.0f : this$0.mWeight, (FileUtils.S_IRWXU & 32) != 0 ? 1 : this$0.mUnit, (FileUtils.S_IRWXU & 64) != 0 ? false : true, (FileUtils.S_IRWXU & 128) != 0 ? null : weightResultBodyCompositionToWeightResult, (FileUtils.S_IRWXU & 256) != 0 ? false : false);
        AppManager companion = AppManager.INSTANCE.getInstance();
        Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
        Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
        companion.killActivity(cls);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveVirtualUser$lambda$16(WeightActivity this$0, VirtualAccount virtualAccount) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeightResult.Companion companion = WeightResult.INSTANCE;
        rw7 rw7Var = this$0.mBodyComposition;
        UserPhotoIcon userPhotoIcon = this$0.mCurVirtualUserIcon;
        Intrinsics.checkNotNull(userPhotoIcon);
        WeightResult weightResultBodyCompositionToWeightResult = companion.bodyCompositionToWeightResult(rw7Var, userPhotoIcon.getVirtualId(), this$0.mWeight, this$0.mDid, System.currentTimeMillis());
        Logger.i(TAG, "mCurVirtualUserIcon match = 1 isIncomplete weightResult : " + f4b.c(weightResultBodyCompositionToWeightResult));
        UserAddActivity.INSTANCE.start(this$0, virtualAccount, 2, this$0.mDid, (FileUtils.S_IRWXU & 16) != 0 ? 0.0f : this$0.mWeight, (FileUtils.S_IRWXU & 32) != 0 ? 1 : this$0.mUnit, (FileUtils.S_IRWXU & 64) != 0 ? false : true, (FileUtils.S_IRWXU & 128) != 0 ? null : weightResultBodyCompositionToWeightResult, (FileUtils.S_IRWXU & 256) != 0 ? false : false);
        AppManager companion2 = AppManager.INSTANCE.getInstance();
        Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
        Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
        companion2.killActivity(cls);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveWeight() {
        if (!this.isFixNum) {
            UserPhotoIcon userPhotoIcon = this.mCurVirtualUserIcon;
            if (userPhotoIcon == null) {
                Logger.i(TAG, "mCurVirtualUserIcon is null " + this.mWeight);
                saveMainUser();
                return;
            }
            Logger.i(TAG, "mCurVirtualUserIcon is syncRecordToVirtualUser " + f4b.c(userPhotoIcon) + " -  " + this.mWeight);
            UserPhotoIcon userPhotoIcon2 = this.mCurVirtualUserIcon;
            Intrinsics.checkNotNull(userPhotoIcon2);
            saveVirtualUser(userPhotoIcon2.getVirtualAccount());
            return;
        }
        if (hasMain()) {
            Logger.i(TAG, "isFixNum has main " + this.mWeight);
            saveMainUser();
            return;
        }
        if (this.uIdList.size() <= 0) {
            Logger.i(TAG, "isFixNum uIdList is 0");
            showUserDialog$default(this, false, 1, null);
            return;
        }
        WeightViewModel weightViewModel = (WeightViewModel) getMViewModel();
        String str = this.mDid;
        String str2 = this.uIdList.get(0);
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        VirtualAccount virtualUserByLocal = weightViewModel.getVirtualUserByLocal(str, Long.parseLong(str2));
        if (virtualUserByLocal != null) {
            Logger.i(TAG, "isFixNum virtualAccount is not null");
            saveVirtualUser(virtualUserByLocal);
        } else {
            Logger.i(TAG, "isFixNum virtualAccount is null");
            showUserDialog$default(this, false, 1, null);
        }
    }

    private final void setActionBarIsCollapse(boolean isCollapse) {
        if (isCollapse) {
            setActionBarExpandState(0);
            setActionBarResizeable(false);
        } else {
            setActionBarExpandState(1);
            setActionBarResizeable(true);
        }
    }

    private final void setImageGuideLayoutParams(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = (imageView.getMeasuredWidth() * 51) / 92;
        imageView.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    private final void setWeight(int weight, String unit, boolean updateWeight) {
        if (updateWeight) {
            this.mWeight = weight / 10;
        }
        int i = weight / 10;
        int i2 = weight % 10;
        Logger.i(TAG, "handleWeight set weight -> " + weight);
        Logger.i(TAG, "handleWeight set weight -> " + i2);
        ((bk0) getMBinding()).Q.setText(String.valueOf(i));
        ((bk0) getMBinding()).Y.setText(unit);
        ((bk0) getMBinding()).U.setText("." + i2);
        ((bk0) getMBinding()).T.setText(String.valueOf(i));
        ((bk0) getMBinding()).b0.setText(unit);
        ((bk0) getMBinding()).X.setText("." + i2);
        ((bk0) getMBinding()).R.setText(String.valueOf(i));
        ((bk0) getMBinding()).Z.setText(unit);
        ((bk0) getMBinding()).V.setText("." + i2);
        ((bk0) getMBinding()).S.setText(String.valueOf(i));
        ((bk0) getMBinding()).a0.setText(unit);
        ((bk0) getMBinding()).W.setText("." + i2);
        ((bk0) getMBinding()).O.setVisibility(0);
        if (((bk0) getMBinding()).O.getProgress() < 2) {
            ((bk0) getMBinding()).O.setProgress(2);
        }
    }

    public static /* synthetic */ void setWeight$default(WeightActivity weightActivity, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        weightActivity.setWeight(i, str, z);
    }

    private final boolean shouldStepBodyFit() {
        Logger.i(TAG, "handleWeight shouldPop VisitorMeasure updateMainUser matchNum:" + this.mMatchNum);
        Logger.i(TAG, "handleWeight shouldPop VisitorMeasure updateMainUser uIdList.size:" + this.uIdList.size());
        Logger.i(TAG, "handleWeight shouldPop VisitorMeasure updateMainUser hasMain:" + this.hasMain);
        if (this.mMatchNum > this.uIdList.size()) {
            return false;
        }
        Logger.i(TAG, "handleWeight VisitorMeasure shouldPop updateMainUser 1");
        isMeasureTimeOut = false;
        if (!this.hasMain && !this.allUserSupportTestBodyFat) {
            isShowUserDialog();
            return true;
        }
        Logger.i(TAG, "handleWeight VisitorMeasure shouldPop updateMainUser 2");
        mWeightStatus = 2;
        stepBodyFit();
        return true;
    }

    private final void showGiveUpDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("guide_give_up").setDialogDescription(zzi.h1).setPositiveText(zzi.f1).setNegativeText(zzi.f41831b).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.showGiveUpDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -3) {
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    } else if (which != -1) {
                        return;
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                WeightActivity.this.finish();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void showSaveWeightDialog(boolean canceledOnTouchOutside) {
        CommonDialog<?> commonDialog = this.userDialog;
        if (commonDialog != null) {
            Intrinsics.checkNotNull(commonDialog);
            if (commonDialog.isShowing()) {
                return;
            }
        }
        this.userIcons.add(new AddUserIcon("", lni.A, getString(zzi.F)));
        UserPhotoAdapter userPhotoAdapter = new UserPhotoAdapter(this.userIcons);
        this.userAdapter = userPhotoAdapter;
        Intrinsics.checkNotNull(userPhotoAdapter);
        userPhotoAdapter.setOnItemClickListener(this);
        View viewInflate = LayoutInflater.from(this).inflate(gui.v0, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(bri.C3);
        if (!this.allUserSupportTestBodyFat || isNoMeasureData()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(bri.O0);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setAdapter(this.userAdapter);
        this.userDialog = new CommonDialog.c(SAVE_WEIGHT).setDialogTitle(zzi.u5).setCustomView(viewInflate).setCanceledOnTouchOutside(canceledOnTouchOutside).setCanceledOnBackPressed(canceledOnTouchOutside).create();
        Logger.i(TAG, "handleWeight shouldPop commonDialog");
        CommonDialog<?> commonDialog2 = this.userDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.showIfNeed(getSupportFragmentManager());
    }

    public static /* synthetic */ void showSaveWeightDialog$default(WeightActivity weightActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        weightActivity.showSaveWeightDialog(z);
    }

    private final void showSmallDialog() {
        if (this.smallDialog == null) {
            this.smallDialog = new CommonDialog.c("small_dialog").setDialogTitle(zzi.T5).setDialogDescription(zzi.e5).setNeutralText(zzi.n4).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.showSmallDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which != -3 || dialog == null) {
                        return;
                    }
                    dialog.dismiss();
                }
            });
        }
        CommonDialog<DialogParams> commonDialog = this.smallDialog;
        Intrinsics.checkNotNull(commonDialog);
        if (commonDialog.isShowing()) {
            return;
        }
        CommonDialog<DialogParams> commonDialog2 = this.smallDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.show(getSupportFragmentManager(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showUserDialog(boolean canceledOnTouchOutside) {
        if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
            return;
        }
        this.userIcons.clear();
        showSaveWeightDialog(canceledOnTouchOutside);
        getAllVirtualAccount(this.mDid);
    }

    public static /* synthetic */ void showUserDialog$default(WeightActivity weightActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        weightActivity.showUserDialog(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startBodyProgress() {
        if (isFailed || isMeasureFinished) {
            ((bk0) getMBinding()).O.setProgress(10);
            return;
        }
        int progress = ((bk0) getMBinding()).O.getProgress();
        if (progress < 9) {
            progress++;
        }
        ((bk0) getMBinding()).O.setProgress(progress);
        this.handler.postDelayed(new Runnable() { // from class: fer
            @Override // java.lang.Runnable
            public final void run() {
                WeightActivity.startBodyProgress$lambda$7(this.f17717a);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startBodyProgress$lambda$7(WeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startBodyProgress();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startWeight() {
        setActionBarIsCollapse(true);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.U5));
        }
        ((bk0) getMBinding()).E0.setVisibility(0);
        ((bk0) getMBinding()).F0.setVisibility(4);
        ((bk0) getMBinding()).P.setText(getString(zzi.O5));
        ((bk0) getMBinding()).d0.setVisibility(4);
        ((bk0) getMBinding()).e0.setVisibility(4);
        Bundle bundleExtra = getIntent().getBundleExtra(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_KEY);
        Logger.i(TAG, "handleWeight bundle " + bundleExtra);
        if (bundleExtra != null) {
            int i = bundleExtra.getInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_UNIT_KEY);
            this.mWeight = bundleExtra.getInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_WEIGHT_KEY) / 10;
            int i2 = bundleExtra.getInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_LOCK_KEY);
            this.mMatchNum = bundleExtra.getInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_MATCH_NUM_KEY);
            String string = bundleExtra.getString(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_DID_KEY);
            if (string == null) {
                string = "";
            }
            this.mDid = string;
            Logger.i(TAG, "handleWeight unitIndex " + i);
            Logger.i(TAG, "handleWeight weight " + this.mWeight);
            Logger.i(TAG, "handleWeight isLock " + i2);
            Logger.i(TAG, "handleWeight mMatchNum " + this.mMatchNum);
            Logger.i(TAG, "handleWeight mDid " + this.mDid);
        }
        ((WeightViewModel) getMViewModel()).initVirtualAccount(this.mDid);
        this.handler.postDelayed(new Runnable() { // from class: pdr
            @Override // java.lang.Runnable
            public final void run() {
                WeightActivity.startWeight$lambda$5(this.f30304a);
            }
        }, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWeight$lambda$5(WeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (mWeightStatus != 1 || isFailed || isMeasureFinished) {
            return;
        }
        this$0.stepFailed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void stepBodyFit() {
        if (isFailed || isMeasureFinished) {
            return;
        }
        Logger.i(TAG, "handleWeight shouldPop updateMainUser stepBodyFit:" + mWeightStatus);
        ((bk0) getMBinding()).O.setVisibility(0);
        startBodyProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void stepFailed() {
        this.mWeightFailStatus = 0;
        isFailed = true;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle("  ");
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setBackgroundDrawable(ResourceExtKt.getResourceDrawable(this, eji.l));
        }
        ((bk0) getMBinding()).B0.setVisibility(8);
        ((bk0) getMBinding()).C0.setVisibility(8);
        ((bk0) getMBinding()).E0.setVisibility(4);
        ((bk0) getMBinding()).A0.setVisibility(0);
        if (!Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
            ((bk0) getMBinding()).d0.setVisibility(0);
            ((bk0) getMBinding()).e0.setVisibility(0);
            ((bk0) getMBinding()).e0.setOnClickListener(new View.OnClickListener() { // from class: ndr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightActivity.stepFailed$lambda$9(this.f27825a, view);
                }
            });
            ((bk0) getMBinding()).d0.setOnClickListener(new View.OnClickListener() { // from class: ydr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightActivity.stepFailed$lambda$10(this.f40081a, view);
                }
            });
            return;
        }
        ((bk0) getMBinding()).e0.setVisibility(8);
        ((bk0) getMBinding()).d0.setVisibility(8);
        EightDeviceSyncImpl.Companion companion = EightDeviceSyncImpl.INSTANCE;
        if (!companion.isBodyCompositionHasZk(this.mBodyComposition) || companion.hasUserBia(this.mBodyComposition)) {
            return;
        }
        stepFailedApp1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stepFailed$lambda$10(WeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.reWeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stepFailed$lambda$9(WeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        isOnlyWeight = true;
        if (isShowUserDialog) {
            showUserDialog$default(this$0, false, 1, null);
        } else {
            this$0.saveWeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void stepFailedApp0() {
        this.mWeightFailStatus = 1;
        isFailed = true;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.R5));
        }
        ((bk0) getMBinding()).E0.setVisibility(4);
        ((bk0) getMBinding()).A0.setVisibility(4);
        ((bk0) getMBinding()).B0.setVisibility(0);
        ((bk0) getMBinding()).C0.setVisibility(4);
        if (this.allUserSupportTestBodyFat) {
            ((bk0) getMBinding()).h0.setText(getString(zzi.J));
        } else {
            ((bk0) getMBinding()).h0.setText("");
        }
        ((bk0) getMBinding()).f0.setOnClickListener(new View.OnClickListener() { // from class: ber
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightActivity.stepFailedApp0$lambda$11(this.f4134a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stepFailedApp0$lambda$11(WeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        showUserDialog$default(this$0, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void stepFailedApp1() {
        this.mWeightFailStatus = 2;
        isFailed = true;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.R5));
        }
        ((bk0) getMBinding()).E0.setVisibility(4);
        ((bk0) getMBinding()).A0.setVisibility(4);
        ((bk0) getMBinding()).B0.setVisibility(4);
        ((bk0) getMBinding()).C0.setVisibility(0);
        if (Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
            ((bk0) getMBinding()).I.setVisibility(4);
        } else {
            ((bk0) getMBinding()).g0.setOnClickListener(new View.OnClickListener() { // from class: her
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightActivity.stepFailedApp1$lambda$12(this.f19995a, view);
                }
            });
            ((bk0) getMBinding()).c0.setOnClickListener(new View.OnClickListener() { // from class: ier
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws ClassNotFoundException {
                    WeightActivity.stepFailedApp1$lambda$13(this.f21067a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stepFailedApp1$lambda$12(WeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        isOnlyWeight = true;
        if (isShowUserDialog) {
            showUserDialog$default(this$0, false, 1, null);
        } else {
            this$0.saveWeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void stepFailedApp1$lambda$13(WeightActivity this$0, View view) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.uIdList.size() <= 0) {
            Logger.i(TAG, "stepFailedApp1 uIdList is 0");
            showUserDialog$default(this$0, false, 1, null);
            return;
        }
        if (Intrinsics.areEqual(this$0.uIdList.get(0), MiAccountManager.INSTANCE.getInstance().getMiId())) {
            UserIndicatorsActivity.INSTANCE.start(this$0, this$0.mDid, this$0.mWeight, this$0.mUnit, WeightResult.INSTANCE.bodyCompositionToWeightResult(this$0.mBodyComposition, "0", this$0.mWeight, this$0.mDid, System.currentTimeMillis()));
            AppManager companion = AppManager.INSTANCE.getInstance();
            Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            companion.killActivity(cls);
            this$0.finish();
            return;
        }
        WeightViewModel weightViewModel = (WeightViewModel) this$0.getMViewModel();
        String str = this$0.mDid;
        String str2 = this$0.uIdList.get(0);
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        VirtualAccount virtualUserByLocal = weightViewModel.getVirtualUserByLocal(str, Long.parseLong(str2));
        if (virtualUserByLocal == null) {
            Logger.i(TAG, "stepFailedApp1 virtualAccount(" + ((Object) this$0.uIdList.get(0)) + ") is null");
            showUserDialog$default(this$0, false, 1, null);
            return;
        }
        Logger.i(TAG, "stepFailedApp1 virtualAccount is not null");
        UserAddActivity.INSTANCE.start(this$0, virtualUserByLocal, 2, this$0.mDid, this$0.mWeight, this$0.mUnit, true, WeightResult.INSTANCE.bodyCompositionToWeightResult(this$0.mBodyComposition, String.valueOf(virtualUserByLocal.getAccountId()), this$0.mWeight, this$0.mDid, System.currentTimeMillis()), true);
        AppManager companion2 = AppManager.INSTANCE.getInstance();
        Class<?> cls2 = Class.forName(WeightGuideActivity.class.getName());
        Intrinsics.checkNotNullExpressionValue(cls2, "forName(...)");
        companion2.killActivity(cls2);
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void stepSmallObjectsResult(boolean isRestore) {
        if (!isMeasureFinished || isRestore) {
            isMeasureFinished = true;
            ((bk0) getMBinding()).E0.setVisibility(0);
            ((bk0) getMBinding()).P.setVisibility(0);
            ((bk0) getMBinding()).i0.setVisibility(0);
            ((bk0) getMBinding()).i0.setOnClickListener(new View.OnClickListener() { // from class: rdr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightActivity.stepSmallObjectsResult$lambda$8(this.f32452a, view);
                }
            });
            ((bk0) getMBinding()).O.setVisibility(4);
            ((bk0) getMBinding()).d0.setVisibility(4);
            ((bk0) getMBinding()).e0.setVisibility(4);
            showSmallDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stepSmallObjectsResult$lambda$8(WeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void stepVisitorResult() {
        if (isFailed) {
            return;
        }
        setActionBarIsCollapse(true);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.d0) + "-" + ((WeightViewModel) getMViewModel()).getNickName());
        }
        ((bk0) getMBinding()).E0.setVisibility(4);
        ((bk0) getMBinding()).F0.setVisibility(0);
        ((bk0) getMBinding()).z0.setOnClickListener(new View.OnClickListener() { // from class: ger
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightActivity.stepVisitorResult$lambda$19(this.f18907a, view);
            }
        });
        sendBroadcast(new Intent(VisitorWeightActivity.CLOSE_ACTIVITY_FLAG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void stepVisitorResult$lambda$19(WeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int sex = ((WeightViewModel) this$0.getMViewModel()).getSex();
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String birthday = ((WeightViewModel) this$0.getMViewModel()).getBirthday();
        Intrinsics.checkNotNull(birthday);
        this$0.gotoDataReport(sex, weightInfoUtil.getAge(weightInfoUtil.parseDate(birthday)), ((WeightViewModel) this$0.getMViewModel()).getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void syncMainUserDataFromDevice() {
        Logger.i("syncMainUserDataFromDevice ", new Object[0]);
        if (isNoMeasureData()) {
            this.mCurVirtualUserIcon = null;
            Logger.i(TAG, " handleWeight no measure data");
            stepFailed();
            return;
        }
        WeightViewModel weightViewModel = (WeightViewModel) getMViewModel();
        String str = this.mDid;
        float fConvertToKg = WeightManager.INSTANCE.getInstance().convertToKg(this.mWeight, this.mUnit);
        rw7 rw7Var = this.mBodyComposition;
        Intrinsics.checkNotNull(rw7Var);
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        weightViewModel.addBodyCompositionToDbNew(str, "yunmai.scales.ms3001", fConvertToKg, rw7Var, 0L, 1, companion.getInstance().getAvatarAddress(), companion.getInstance().getNickName(), null, new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.syncMainUserDataFromDevice.1
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
            public void onSuccess() throws ClassNotFoundException {
                try {
                    CommonDialog<?> userDialog = WeightActivity.this.getUserDialog();
                    if (userDialog != null) {
                        userDialog.dismiss();
                    }
                } catch (Exception e) {
                    Logger.e(WeightActivity.TAG, " syncMainUserDataFromDevice error  " + e);
                }
                Logger.i(WeightActivity.TAG, " handleWeight addBodyCompositionToDbNew success " + WeightActivity.this.showNoBodyFatErrorDialog);
                Bundle bundle = new Bundle();
                bundle.putBoolean("showNoBodyFatErrorDialog", WeightActivity.this.showNoBodyFatErrorDialog);
                WeightActivity.this.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getWeightPageIntent(bundle, true));
                AppManager companion2 = AppManager.INSTANCE.getInstance();
                Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
                Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
                companion2.killActivity(cls);
                WeightActivity.this.finish();
            }
        });
        ((WeightViewModel) getMViewModel()).updateMainUser(this.mDid, this.mWeight, this.mUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void syncMainUserDataFromDeviceNew() {
        sw7 sw7Var;
        sw7 sw7Var2;
        sw7 sw7Var3;
        sw7 sw7Var4;
        sw7 sw7Var5;
        sw7 sw7Var6;
        sw7 sw7Var7;
        sw7 sw7Var8;
        sw7 sw7Var9;
        sw7 sw7Var10;
        sw7 sw7Var11;
        sw7 sw7Var12;
        Logger.i("syncMainUserDataFromDeviceNew ", new Object[0]);
        if (EightDeviceSyncImpl.INSTANCE.hasUserBia(this.mBodyComposition) && this.mMatchNum == 1) {
            WeightViewModel weightViewModel = (WeightViewModel) getMViewModel();
            String str = this.mDid;
            float fConvertToKg = WeightManager.INSTANCE.getInstance().convertToKg(this.mWeight, this.mUnit);
            rw7 rw7Var = this.mBodyComposition;
            Intrinsics.checkNotNull(rw7Var);
            MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
            weightViewModel.addBodyCompositionToDbNew(str, "yunmai.scales.ms3001", fConvertToKg, rw7Var, 0L, 1, companion.getInstance().getAvatarAddress(), companion.getInstance().getNickName(), null, new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.syncMainUserDataFromDeviceNew.1
                @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
                public void onSuccess() throws ClassNotFoundException {
                    try {
                        CommonDialog<?> userDialog = WeightActivity.this.getUserDialog();
                        if (userDialog != null) {
                            userDialog.dismiss();
                        }
                    } catch (Exception e) {
                        Logger.e(WeightActivity.TAG, " syncMainUserDataFromDeviceNew error  " + e);
                    }
                    Logger.i(WeightActivity.TAG, " handleWeight addBodyCompositionToDb success " + WeightActivity.this.showNoBodyFatErrorDialog);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("showNoBodyFatErrorDialog", WeightActivity.this.showNoBodyFatErrorDialog);
                    WeightActivity.this.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getWeightPageIntent(bundle, true));
                    AppManager companion2 = AppManager.INSTANCE.getInstance();
                    Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
                    Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
                    companion2.killActivity(cls);
                    WeightActivity.this.finish();
                }
            });
            ((WeightViewModel) getMViewModel()).updateMainUser(this.mDid, this.mWeight, this.mUnit);
            return;
        }
        int[] iArr = new int[12];
        rw7 rw7Var2 = this.mBodyComposition;
        Integer numValueOf = (rw7Var2 == null || (sw7Var12 = rw7Var2.h) == null) ? null : Integer.valueOf(sw7Var12.c);
        Intrinsics.checkNotNull(numValueOf);
        iArr[0] = numValueOf.intValue();
        rw7 rw7Var3 = this.mBodyComposition;
        Integer numValueOf2 = (rw7Var3 == null || (sw7Var11 = rw7Var3.h) == null) ? null : Integer.valueOf(sw7Var11.d);
        Intrinsics.checkNotNull(numValueOf2);
        iArr[1] = numValueOf2.intValue();
        rw7 rw7Var4 = this.mBodyComposition;
        Integer numValueOf3 = (rw7Var4 == null || (sw7Var10 = rw7Var4.h) == null) ? null : Integer.valueOf(sw7Var10.e);
        Intrinsics.checkNotNull(numValueOf3);
        iArr[2] = numValueOf3.intValue();
        rw7 rw7Var5 = this.mBodyComposition;
        Integer numValueOf4 = (rw7Var5 == null || (sw7Var9 = rw7Var5.h) == null) ? null : Integer.valueOf(sw7Var9.f);
        Intrinsics.checkNotNull(numValueOf4);
        iArr[3] = numValueOf4.intValue();
        rw7 rw7Var6 = this.mBodyComposition;
        Integer numValueOf5 = (rw7Var6 == null || (sw7Var8 = rw7Var6.h) == null) ? null : Integer.valueOf(sw7Var8.g);
        Intrinsics.checkNotNull(numValueOf5);
        iArr[4] = numValueOf5.intValue();
        rw7 rw7Var7 = this.mBodyComposition;
        Integer numValueOf6 = (rw7Var7 == null || (sw7Var7 = rw7Var7.h) == null) ? null : Integer.valueOf(sw7Var7.h);
        Intrinsics.checkNotNull(numValueOf6);
        iArr[5] = numValueOf6.intValue();
        rw7 rw7Var8 = this.mBodyComposition;
        Integer numValueOf7 = (rw7Var8 == null || (sw7Var6 = rw7Var8.i) == null) ? null : Integer.valueOf(sw7Var6.c);
        Intrinsics.checkNotNull(numValueOf7);
        iArr[6] = numValueOf7.intValue();
        rw7 rw7Var9 = this.mBodyComposition;
        Integer numValueOf8 = (rw7Var9 == null || (sw7Var5 = rw7Var9.i) == null) ? null : Integer.valueOf(sw7Var5.d);
        Intrinsics.checkNotNull(numValueOf8);
        iArr[7] = numValueOf8.intValue();
        rw7 rw7Var10 = this.mBodyComposition;
        Integer numValueOf9 = (rw7Var10 == null || (sw7Var4 = rw7Var10.i) == null) ? null : Integer.valueOf(sw7Var4.e);
        Intrinsics.checkNotNull(numValueOf9);
        iArr[8] = numValueOf9.intValue();
        rw7 rw7Var11 = this.mBodyComposition;
        Integer numValueOf10 = (rw7Var11 == null || (sw7Var3 = rw7Var11.i) == null) ? null : Integer.valueOf(sw7Var3.f);
        Intrinsics.checkNotNull(numValueOf10);
        iArr[9] = numValueOf10.intValue();
        rw7 rw7Var12 = this.mBodyComposition;
        Integer numValueOf11 = (rw7Var12 == null || (sw7Var2 = rw7Var12.i) == null) ? null : Integer.valueOf(sw7Var2.g);
        Intrinsics.checkNotNull(numValueOf11);
        iArr[10] = numValueOf11.intValue();
        rw7 rw7Var13 = this.mBodyComposition;
        Integer numValueOf12 = (rw7Var13 == null || (sw7Var = rw7Var13.i) == null) ? null : Integer.valueOf(sw7Var.h);
        Intrinsics.checkNotNull(numValueOf12);
        iArr[11] = numValueOf12.intValue();
        WeightViewModel weightViewModel2 = (WeightViewModel) getMViewModel();
        String str2 = this.mDid;
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        MiAccountManager.Companion companion2 = MiAccountManager.INSTANCE;
        String avatarAddress = companion2.getInstance().getAvatarAddress();
        String nickName = companion2.getInstance().getNickName();
        rw7 rw7Var14 = this.mBodyComposition;
        Integer numValueOf13 = rw7Var14 != null ? Integer.valueOf(rw7Var14.f32963k) : null;
        Intrinsics.checkNotNull(numValueOf13);
        weightViewModel2.addBodyCompositionWeightRecord(str2, "yunmai.scales.ms3001", 1, userId, 0L, avatarAddress, nickName, numValueOf13.intValue(), companion2.getInstance().getSex(), companion2.getInstance().getAge(), companion2.getInstance().getHeight(), WeightManager.INSTANCE.getInstance().convertToKg(this.mWeight, this.mUnit), iArr, System.currentTimeMillis(), true, null, new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.syncMainUserDataFromDeviceNew.2
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
            public void onSuccess() throws ClassNotFoundException {
                Logger.i(WeightActivity.TAG, " handleWeight syncMainUserDataFromDeviceNew success " + WeightActivity.this.showNoBodyFatErrorDialog);
                Bundle bundle = new Bundle();
                bundle.putBoolean("showNoBodyFatErrorDialog", WeightActivity.this.showNoBodyFatErrorDialog);
                WeightActivity.this.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getWeightPageIntent(bundle, true));
                AppManager companion3 = AppManager.INSTANCE.getInstance();
                Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
                Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
                companion3.killActivity(cls);
                WeightActivity.this.finish();
            }
        });
        ((WeightViewModel) getMViewModel()).updateMainUser(this.mDid, this.mWeight, this.mUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void syncRecordFromDeviceToVirtualUserNew(long virtualId, int age, int sex, int height, String url, String nickName, long birth) {
        Logger.i(TAG, "syncRecordFromDeviceToVirtualUserNew");
        updateVirtualUserWeightToCloud(virtualId, nickName, sex, height, birth);
        WeightViewModel weightViewModel = (WeightViewModel) getMViewModel();
        String str = this.mDid;
        float fConvertToKg = WeightManager.INSTANCE.getInstance().convertToKg(this.mWeight, this.mUnit);
        rw7 rw7Var = this.mBodyComposition;
        Intrinsics.checkNotNull(rw7Var);
        weightViewModel.addBodyCompositionToDbNew(str, "yunmai.scales.ms3001", fConvertToKg, rw7Var, virtualId, 2, url, nickName, new SyncWeightRecordCallback() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.syncRecordFromDeviceToVirtualUserNew.1
            @Override // com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback
            public void onFailed() {
                Logger.i(WeightActivity.TAG, "syncRecordFromDeviceToVirtualUserNew sync failed");
            }

            @Override // com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback
            public void onSuccess() {
                Logger.i(WeightActivity.TAG, "syncRecordFromDeviceToVirtualUserNew sync success");
            }
        }, new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.syncRecordFromDeviceToVirtualUserNew.2
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
            public void onSuccess() throws ClassNotFoundException {
                try {
                    CommonDialog<?> userDialog = WeightActivity.this.getUserDialog();
                    if (userDialog != null) {
                        userDialog.dismiss();
                    }
                } catch (Exception e) {
                    Logger.e(WeightActivity.TAG, " syncRecordFromDeviceToVirtualUserNew error  " + e);
                }
                if (!EightDeviceSyncImpl.INSTANCE.hasUserBia(WeightActivity.this.getMBodyComposition())) {
                    WeightActivity.this.showNoBodyFatErrorDialog = true;
                }
                Logger.i(WeightActivity.TAG, "handleWeight add virtual addBodyCompositionToDb success " + WeightActivity.this.showNoBodyFatErrorDialog);
                ScalePageUtil scalePageUtil = ScalePageUtil.INSTANCE;
                UserPhotoIcon userPhotoIcon = WeightActivity.this.mCurVirtualUserIcon;
                Intrinsics.checkNotNull(userPhotoIcon);
                VirtualAccount virtualAccount = userPhotoIcon.getVirtualAccount();
                Intrinsics.checkNotNull(virtualAccount);
                scalePageUtil.goVmData(virtualAccount.getAccountId(), WeightActivity.this.showNoBodyFatErrorDialog, true);
                AppManager companion = AppManager.INSTANCE.getInstance();
                Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
                Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
                companion.killActivity(cls);
                WeightActivity.this.finish();
            }
        });
        updateVirtualUserDataToDeviceNew(virtualId, age, sex, height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void syncRecordToVirtualUser(String did, int sex, int height, long birth, String url, String virtualId, String nickName) {
        addVirtualAccountWeightRecord(url, Long.parseLong(virtualId), sex, height, nickName, 2, birth);
        t48.c().e(Long.valueOf(Long.parseLong(virtualId)), (int) (WeightManager.INSTANCE.getInstance().convertToKg(this.mWeight, this.mUnit) * 10));
        ((WeightViewModel) getMViewModel()).putLastSelected(did, virtualId);
        ((WeightViewModel) getMViewModel()).updateVirtualUserToDevice(Long.parseLong(virtualId), did, this.mWeight, this.mUnit, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.syncRecordToVirtualUser.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(WeightActivity.TAG, "handleWeight updateVirtualUserToDevice " + type + " " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.i(WeightActivity.TAG, "handleWeight updateVirtualUserToDevice user success " + (result != null ? result.getPacket() : null));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void syncRecordToVirtualUserNew(long virtualId, String nickName, int sex, int age, int height, long birth) {
        Logger.i(TAG, "syncRecordToVirtualUserNew");
        if (isNoMeasureData() || (this.mMatchNum == 1 && !EightDeviceSyncImpl.INSTANCE.hasUserBia(this.mBodyComposition))) {
            addVirtualAccountWeightRecord("", virtualId, sex, height, nickName, 2, birth);
        } else {
            addVirtualAccountWeightRecordNew(virtualId, nickName, sex, age, height, birth);
        }
        t48.c().e(Long.valueOf(virtualId), (int) (WeightManager.INSTANCE.getInstance().convertToKg(this.mWeight, this.mUnit) * 10));
        ((WeightViewModel) getMViewModel()).putLastSelected(this.mDid, String.valueOf(virtualId));
        updateVirtualUserDataToDeviceNew(virtualId, age, sex, height);
    }

    private final void unRegisterReceivers() {
        unregisterReceiver(this.bluetoothMonitorReceiver);
        ld8.c().r(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateVirtualUserDataToDeviceNew(long virtualId, int age, int sex, int height) {
        ((WeightViewModel) getMViewModel()).updateVirtualUserToDeviceNew(virtualId, this.mDid, this.mWeight, this.mUnit, age, sex, height, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.WeightActivity.updateVirtualUserDataToDeviceNew.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(WeightActivity.TAG, "handleWeight updateVirtualUserToDeviceNew " + type + " " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i(WeightActivity.TAG, "handleWeight updateVirtualUserToDeviceNew user success " + (result != null ? result.getPacket() : null));
            }
        });
    }

    private final void updateVirtualUserWeightToCloud(final long virtualId, final String nickName, final int sex, final int height, final long birth) {
        Logger.i(TAG, "updateVirtualUserWeightToCloud");
        ExecutorHelper.getBackgroundPool().execute(new Runnable() { // from class: cer
            @Override // java.lang.Runnable
            public final void run() {
                WeightActivity.updateVirtualUserWeightToCloud$lambda$26(this.f5259a, virtualId, nickName, sex, height, birth);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void updateVirtualUserWeightToCloud$lambda$26(WeightActivity this$0, long j, String nickName, int i, int i2, long j2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nickName, "$nickName");
        ((WeightViewModel) this$0.getMViewModel()).modifyVirtualAccount(String.valueOf(j), nickName, "", i, i2, WeightManager.INSTANCE.getInstance().convertToKg(this$0.mWeight, this$0.mUnit), j2, null);
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.m;
    }

    @Nullable
    public final rw7 getMBodyComposition() {
        return this.mBodyComposition;
    }

    @Nullable
    public final Bundle getMBundle() {
        return this.mBundle;
    }

    @Nullable
    public final CommonDialog<DialogParams> getSmallDialog() {
        return this.smallDialog;
    }

    @Nullable
    public final CommonDialog<?> getUserDialog() {
        return this.userDialog;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter.OnItemClickListener
    public void onAddUser(@NotNull String did) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(did, "did");
        if (((WeightViewModel) getMViewModel()).getVirtualUserCount() >= ((WeightViewModel) getMViewModel()).getVirtualUserMax()) {
            ToastUtil.showShortToast(getResources().getString(zzi.W3));
            return;
        }
        if (!this.allUserSupportTestBodyFat) {
            Logger.i(TAG, "onAddUser no allUserSupportTestBodyFat");
            VirtualAccount virtualAccount = new VirtualAccount(null, null, Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524283, null);
            UserAddActivity.INSTANCE.start(this, virtualAccount, 0, this.mDid, (FileUtils.S_IRWXU & 16) != 0 ? 0.0f : this.mWeight, (FileUtils.S_IRWXU & 32) != 0 ? 1 : this.mUnit, (FileUtils.S_IRWXU & 64) != 0 ? false : true, (FileUtils.S_IRWXU & 128) != 0 ? null : WeightResult.INSTANCE.bodyCompositionToWeightResult(this.mBodyComposition, String.valueOf(virtualAccount.getAccountId()), this.mWeight, this.mDid, System.currentTimeMillis()), (FileUtils.S_IRWXU & 256) != 0 ? false : false);
            AppManager companion = AppManager.INSTANCE.getInstance();
            Class<?> cls = Class.forName(WeightGuideActivity.class.getName());
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            companion.killActivity(cls);
            finish();
            return;
        }
        VirtualAccount virtualAccount2 = new VirtualAccount(null, null, Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524283, null);
        WeightResult weightResultBodyCompositionToWeightResult = WeightResult.INSTANCE.bodyCompositionToWeightResult(this.mBodyComposition, String.valueOf(virtualAccount2.getAccountId()), this.mWeight, this.mDid, System.currentTimeMillis());
        Logger.i(TAG, "onAddUser weightResult : " + f4b.c(weightResultBodyCompositionToWeightResult));
        UserAddActivity.INSTANCE.start(this, virtualAccount2, 0, this.mDid, (FileUtils.S_IRWXU & 16) != 0 ? 0.0f : this.mWeight, (FileUtils.S_IRWXU & 32) != 0 ? 1 : this.mUnit, (FileUtils.S_IRWXU & 64) != 0 ? false : true, (FileUtils.S_IRWXU & 128) != 0 ? null : weightResultBodyCompositionToWeightResult, (FileUtils.S_IRWXU & 256) != 0 ? false : false);
        AppManager companion2 = AppManager.INSTANCE.getInstance();
        Class<?> cls2 = Class.forName(WeightGuideActivity.class.getName());
        Intrinsics.checkNotNullExpressionValue(cls2, "forName(...)");
        companion2.killActivity(cls2);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (isEndWeight && !Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
            showGiveUpDialog();
            return;
        }
        CommonDialog<?> commonDialog = this.userDialog;
        if (commonDialog != null) {
            Intrinsics.checkNotNull(commonDialog);
            if (commonDialog.isShowing()) {
                CommonDialog<?> commonDialog2 = this.userDialog;
                Intrinsics.checkNotNull(commonDialog2);
                commonDialog2.dismiss();
            }
        }
        super.lambda$onCreate$0();
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onBodyCompositionSDKMeasure(@NotNull ScaleEventBusIds.OnBodyCompositionSDKMeasureEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.showNoBodyFatErrorDialog = !event.getIsSuccess();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter.OnItemClickListener
    public void onClick(@NotNull UserPhotoIcon icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Logger.i(TAG, "handleWeight add virtual user " + icon.getDid());
        Logger.i(TAG, "handleWeight add virtual user " + icon.getUrl());
        Logger.i(TAG, "handleWeight add virtual user " + icon.getVirtualId());
        Logger.i(TAG, "handleWeight add virtual user  " + this.mWeight);
        CommonDialog<?> commonDialog = this.userDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        this.mCurVirtualUserIcon = icon;
        if (!isShowUserDialog) {
            if (icon.getIsVirtual()) {
                stepFailed();
                return;
            }
            if (!this.allUserSupportTestBodyFat) {
                syncMainUserDataFromDevice();
                return;
            } else {
                if (!isNoMeasureData()) {
                    syncMainUserDataFromDeviceNew();
                    return;
                }
                MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
                addVirtualAccountWeightRecord$default(this, companion.getInstance().getMiId(), 0L, companion.getInstance().getSex(), (int) companion.getInstance().getHeight(), companion.getInstance().getNickName(), 1, 0L, 64, null);
                ((WeightViewModel) getMViewModel()).updateMainUser(this.mDid, this.mWeight, this.mUnit);
                return;
            }
        }
        if (!icon.getIsVirtual()) {
            Logger.i(TAG, "mCurVirtualUserIcon is null " + this.mWeight);
            if (!this.allUserSupportTestBodyFat) {
                if (!isNoMeasureData() && !isOnlyWeight) {
                    syncMainUserDataFromDevice();
                    return;
                }
                MiAccountManager.Companion companion2 = MiAccountManager.INSTANCE;
                addVirtualAccountWeightRecord$default(this, companion2.getInstance().getMiId(), 0L, companion2.getInstance().getSex(), (int) companion2.getInstance().getHeight(), companion2.getInstance().getNickName(), 1, 0L, 64, null);
                ((WeightViewModel) getMViewModel()).updateMainUser(this.mDid, this.mWeight, this.mUnit);
                return;
            }
            if (!isNoMeasureData() && MiAccountManager.INSTANCE.getInstance().getAge() >= 18) {
                syncMainUserDataFromDeviceNew();
                return;
            }
            MiAccountManager.Companion companion3 = MiAccountManager.INSTANCE;
            if (companion3.getInstance().getAge() < 18 && !isOnlyWeight) {
                this.showNoBodyFatErrorDialog = true;
            }
            addVirtualAccountWeightRecord$default(this, companion3.getInstance().getMiId(), 0L, companion3.getInstance().getSex(), (int) companion3.getInstance().getHeight(), companion3.getInstance().getNickName(), 1, 0L, 64, null);
            ((WeightViewModel) getMViewModel()).updateMainUser(this.mDid, this.mWeight, this.mUnit);
            return;
        }
        Logger.i(TAG, "mCurVirtualUserIcon is syncRecordToVirtualUser " + f4b.c(this.mCurVirtualUserIcon) + " -  " + this.mWeight);
        VirtualAccount virtualAccount = icon.getVirtualAccount();
        if (virtualAccount != null && virtualAccount.isIncomplete()) {
            handleVirtualAccountInfoIncompleteCase(virtualAccount);
            return;
        }
        Logger.i("account : " + f4b.c(virtualAccount), new Object[0]);
        if (!this.allUserSupportTestBodyFat) {
            this.mBodyComposition = null;
            int sex = virtualAccount != null ? virtualAccount.getSex() : 0;
            int height = virtualAccount != null ? virtualAccount.getHeight() : 0;
            long birth = virtualAccount != null ? virtualAccount.getBirth() : 0L;
            String str = this.mDid;
            String url = icon.getUrl();
            String virtualId = icon.getVirtualId();
            String nickName = icon.getNickName();
            Intrinsics.checkNotNull(nickName);
            syncRecordToVirtualUser(str, sex, height, birth, url, virtualId, nickName);
            return;
        }
        VirtualAccount virtualAccount2 = icon.getVirtualAccount();
        Long lValueOf = virtualAccount2 != null ? Long.valueOf(virtualAccount2.getAccountId()) : null;
        Intrinsics.checkNotNull(lValueOf);
        long jLongValue = lValueOf.longValue();
        VirtualAccount virtualAccount3 = icon.getVirtualAccount();
        String name = virtualAccount3 != null ? virtualAccount3.getName() : null;
        Intrinsics.checkNotNull(name);
        VirtualAccount virtualAccount4 = icon.getVirtualAccount();
        Integer numValueOf = virtualAccount4 != null ? Integer.valueOf(virtualAccount4.getSex()) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue();
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        Intrinsics.checkNotNull(virtualAccount);
        String dateToString = weightInfoUtil.getDateToString(virtualAccount.getBirth(), "yyyy-MM-dd");
        Intrinsics.checkNotNull(dateToString);
        int age = weightInfoUtil.getAge(dateToString);
        VirtualAccount virtualAccount5 = icon.getVirtualAccount();
        Integer numValueOf2 = virtualAccount5 != null ? Integer.valueOf(virtualAccount5.getHeight()) : null;
        Intrinsics.checkNotNull(numValueOf2);
        int iIntValue2 = numValueOf2.intValue();
        VirtualAccount virtualAccount6 = icon.getVirtualAccount();
        Long lValueOf2 = virtualAccount6 != null ? Long.valueOf(virtualAccount6.getBirth()) : null;
        Intrinsics.checkNotNull(lValueOf2);
        syncRecordToVirtualUserNew(jLongValue, name, iIntValue, age, iIntValue2, lValueOf2.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.electronic.scale.Hilt_WeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        init(savedInstanceState);
        initBanner();
        loadMiUser();
        ((WeightViewModel) getMViewModel()).getDeviceVersion(this.mDid, new C23451());
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_WeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.handler.removeCallbacksAndMessages(null);
        unRegisterReceivers();
        mWeightStatus = 1;
        isMeasureFinished = false;
        isEndWeight = false;
        isMeasureTimeOut = true;
        isFailed = false;
        isShowUserDialog = true;
        isOnlyWeight = false;
        ScalePageUtil.INSTANCE.setWEIGHT_ACTIVITY_IS_START(false);
        ScaleUtil.INSTANCE.setInWeight(false);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onEcoPacket(@NotNull final ScaleEventBusIds.OnEcoPaketEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Logger.i(TAG, "onEcoPacket");
        if (!Intrinsics.areEqual(this.mDid, event.getDid())) {
            Logger.i(TAG, "use scale error mDid : " + this.mDid + " , did : " + event.getDid());
            return;
        }
        if (isDestroyed()) {
            return;
        }
        this.mPacket = event.getPacket();
        u7r packet = event.getPacket();
        if (packet != null && packet.f == 13) {
            this.handler.post(new Runnable() { // from class: sdr
                @Override // java.lang.Runnable
                public final void run() {
                    WeightActivity.onEcoPacket$lambda$0(this.f33544a, event);
                }
            });
        }
        u7r packet2 = event.getPacket();
        if (packet2 != null && packet2.f == 12) {
            this.handler.post(new Runnable() { // from class: tdr
                @Override // java.lang.Runnable
                public final void run() {
                    WeightActivity.onEcoPacket$lambda$1(this.f34607a, event);
                }
            });
        }
        u7r packet3 = event.getPacket();
        if (packet3 == null || packet3.f != 16) {
            return;
        }
        this.handler.post(new Runnable() { // from class: udr
            @Override // java.lang.Runnable
            public final void run() {
                WeightActivity.onEcoPacket$lambda$2(this.f35666a, event);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onMenuItemSelected(featureId, item);
        }
        if (!isEndWeight || Intrinsics.areEqual(WEIGHT_TYPE_VISITOR, ((WeightViewModel) getMViewModel()).getType())) {
            finish();
            return true;
        }
        showGiveUpDialog();
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ScaleUtil.INSTANCE.setInWeight(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("electronic_weight_finish", isMeasureFinished);
        outState.putBoolean(KEY_WEIGHT_IS_END, isEndWeight);
        outState.putBoolean(KEY_WEIGHT_IS_FAILED, isFailed);
        outState.putBoolean("electronic_weight_dialog", isShowUserDialog);
        outState.putInt("electronic_weight_status", mWeightStatus);
        outState.putFloat(KEY_WEIGHT_VALUE, this.mWeight);
        outState.putString("electronic_weight_type", ((WeightViewModel) getMViewModel()).getType());
        outState.putString(KEY_WEIGHT_NICK_NAME, ((WeightViewModel) getMViewModel()).getNickName());
        outState.putInt("electronic_weight_sex", ((WeightViewModel) getMViewModel()).getSex());
        outState.putString(KEY_WEIGHT_BIRTHDAY, ((WeightViewModel) getMViewModel()).getBirthday());
        outState.putInt("electronic_weight_height", ((WeightViewModel) getMViewModel()).getHeight());
        outState.putInt(KEY_WEIGHT_MATCH_NUM, this.mMatchNum);
        outState.putString("electronic_weight_did", this.mDid);
        outState.putInt("electronic_weight_unit", this.mUnit);
        outState.putInt(KEY_WEIGHT_FAIL_STATUS, this.mWeightFailStatus);
        outState.putBoolean(KEY_WEIGHT_HAS_MAIN, this.hasMain);
        outState.putStringArrayList(KEY_WEIGHT_ID_LIST, this.uIdList);
        outState.putBoolean(KEY_WEIGHT_IS_NEW_FIRMVERSION, this.allUserSupportTestBodyFat);
        outState.putInt(KEY_WEIGHT_PROGRESS, ((bk0) getMBinding()).O.getProgress());
        if (this.mCurVirtualUserIcon == null) {
            outState.putBoolean(KEY_WEIGHT_HAS_CUR_USER, false);
        } else {
            outState.putBoolean(KEY_WEIGHT_HAS_CUR_USER, true);
            UserPhotoIcon userPhotoIcon = this.mCurVirtualUserIcon;
            Intrinsics.checkNotNull(userPhotoIcon);
            outState.putString(KEY_WEIGHT_CUR_USER_URL, userPhotoIcon.getUrl());
            UserPhotoIcon userPhotoIcon2 = this.mCurVirtualUserIcon;
            Intrinsics.checkNotNull(userPhotoIcon2);
            outState.putString(KEY_WEIGHT_CUR_USER_VID, userPhotoIcon2.getVirtualId());
            UserPhotoIcon userPhotoIcon3 = this.mCurVirtualUserIcon;
            Intrinsics.checkNotNull(userPhotoIcon3);
            outState.putString(KEY_WEIGHT_CUR_USER_NICK_NAME, userPhotoIcon3.getNickName());
            if (this.allUserSupportTestBodyFat) {
                UserPhotoIcon userPhotoIcon4 = this.mCurVirtualUserIcon;
                Intrinsics.checkNotNull(userPhotoIcon4);
                outState.putInt(KEY_WEIGHT_HAS_CUR_AGE, userPhotoIcon4.getAge());
                UserPhotoIcon userPhotoIcon5 = this.mCurVirtualUserIcon;
                Intrinsics.checkNotNull(userPhotoIcon5);
                outState.putInt("electronic_weight_height", userPhotoIcon5.getHeight());
                UserPhotoIcon userPhotoIcon6 = this.mCurVirtualUserIcon;
                Intrinsics.checkNotNull(userPhotoIcon6);
                outState.putInt("electronic_weight_sex", userPhotoIcon6.getSex());
            }
        }
        if (this.mBodyComposition == null) {
            outState.putBoolean(KEY_WEIGHT_HAS_RESULT, false);
        } else {
            outState.putBoolean(KEY_WEIGHT_HAS_RESULT, true);
            outState.putString(KEY_WEIGHT_RESULT, f4b.c(this.mBodyComposition));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public final void setHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }

    public final void setMBodyComposition(@Nullable rw7 rw7Var) {
        this.mBodyComposition = rw7Var;
    }

    public final void setMBundle(@Nullable Bundle bundle) {
        this.mBundle = bundle;
    }

    public final void setSmallDialog(@Nullable CommonDialog<DialogParams> commonDialog) {
        this.smallDialog = commonDialog;
    }

    public final void setUserDialog(@Nullable CommonDialog<?> commonDialog) {
        this.userDialog = commonDialog;
    }
}
