package com.xiaomi.fitness.device.manager.remote;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.fitness.capability.export.CapabilityManager;
import com.mi.fitness.capability.export.CapabilityManagerExtKt;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fit.device.DeviceFactory;
import com.xiaomi.fit.device.bind.BloodSugarDeviceBinder;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.AccessoryDevicePreference;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.DeviceStatus;
import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.fitness.device.manager.b;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.d;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.LocalDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.manager.extensions.OhterExtKt;
import com.xiaomi.fitness.device.manager.f;
import com.xiaomi.fitness.device.manager.g;
import com.xiaomi.fitness.device.manager.h;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl;
import com.xiaomi.fitness.device.model.api.DeviceBinder;
import com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote;
import com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.wearable.connection.ConnectSource;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import defpackage.qa6;
import defpackage.s33;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u000b*\u0002Ã\u0001\b\u0007\u0018\u0000 Ì\u00012\u00020\u0001:\u0002Ì\u0001B\u0015\b\u0007\u0012\b\u0010°\u0001\u001a\u00030¯\u0001¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u001d\u0010 \u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013H\u0002¢\u0006\u0004\b \u0010\u0017J\u001f\u0010\"\u001a\u00020\u00042\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\"\u0010\u0017J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u000eJ#\u0010*\u001a\b\u0012\u0004\u0012\u00020!0\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010\u000eJ\u0019\u0010,\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020$H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u00103J[\u0010:\u001a\u0004\u0018\u0001092\u0006\u00104\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00108\u001a\u00020$2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b:\u0010<J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b=\u0010\u0006J\u0019\u0010>\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b>\u0010-J\u0019\u0010@\u001a\u00020$2\b\u0010\u0010\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bD\u0010EJ!\u0010G\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\bH\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bI\u0010CJ\u001b\u0010J\u001a\u0004\u0018\u00010!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00042\u0006\u0010L\u001a\u00020!H\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\u00020\u00042\u0006\u0010O\u001a\u00020$2\u0006\u0010P\u001a\u00020$H\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010T\u001a\u00020\u00042\u0006\u0010S\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bT\u0010UJ\u0019\u0010V\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bV\u0010CJ\u0019\u0010W\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bW\u0010\u0006J\u0019\u0010X\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bX\u0010\u0006J\u0017\u0010Y\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bY\u0010\u0006J\u0015\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0016¢\u0006\u0004\bZ\u0010[J\u0015\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0016¢\u0006\u0004\b\\\u0010[J\u0017\u0010]\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b]\u0010\u0006J\u0017\u0010`\u001a\u00020\u00042\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u00042\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\bb\u0010aJ\u0017\u0010d\u001a\u00020\u00042\u0006\u0010_\u001a\u00020cH\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020\u00042\u0006\u0010_\u001a\u00020cH\u0016¢\u0006\u0004\bf\u0010eJ\u0017\u0010h\u001a\u00020\u00042\u0006\u0010_\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\u00042\u0006\u0010_\u001a\u00020gH\u0016¢\u0006\u0004\bj\u0010iJ\u0010\u0010k\u001a\u00020\u0004H\u0096@¢\u0006\u0004\bk\u0010lJ\u0015\u0010m\u001a\u00020\u00042\u0006\u0010O\u001a\u00020$¢\u0006\u0004\bm\u0010nJ\u001d\u0010m\u001a\u00020\u00042\u0006\u0010O\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bm\u0010UJ\u0019\u0010o\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bq\u0010EJ\u0019\u0010r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\br\u0010EJ\u0015\u0010s\u001a\b\u0012\u0004\u0012\u00020!0\u0013H\u0016¢\u0006\u0004\bs\u0010[J\u0019\u0010t\u001a\u0004\u0018\u00010!2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bt\u0010KJ\u001b\u0010u\u001a\u0004\u0018\u00010\u000f2\b\u00104\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bu\u0010pJ\u0019\u0010x\u001a\u0004\u0018\u00010w2\u0006\u0010v\u001a\u00020\u0002H\u0016¢\u0006\u0004\bx\u0010yJ\u0011\u0010z\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bz\u0010{J\u0019\u0010|\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b|\u0010pJ\u001a\u0010\u007f\u001a\u00020\u00042\b\u0010~\u001a\u0004\u0018\u00010}H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001a\u0010\u0082\u0001\u001a\u00020\u00042\u0007\u0010\u0081\u0001\u001a\u00020!H\u0016¢\u0006\u0005\b\u0082\u0001\u0010NJ\u001a\u0010\u0083\u0001\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0019\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0005\b\u0085\u0001\u0010\u0006J*\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00182\u0014\u0010\u0087\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$0\u0086\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J'\u0010\u008d\u0001\u001a\u00020\u00042\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\t\u0010~\u001a\u0005\u0018\u00010\u008c\u0001H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J%\u0010\u0090\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010~\u001a\u0005\u0018\u00010\u008f\u0001H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J%\u0010\u0092\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010~\u001a\u0005\u0018\u00010\u008f\u0001H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J.\u0010\u0094\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010~\u001a\u0005\u0018\u00010\u008f\u00012\u0007\u0010\u0093\u0001\u001a\u00020$H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0019\u0010\u0096\u0001\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0005\b\u0096\u0001\u0010\u0006J\u0017\u0010>\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b>\u0010\u0006J\u001a\u0010>\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0005\b>\u0010\u0097\u0001J\u0014\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J \u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000f2\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0005\b\u009d\u0001\u0010\u000eJ\"\u0010\u009f\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u009e\u0001\u001a\u00020$H\u0016¢\u0006\u0005\b\u009f\u0001\u00100J!\u0010 \u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020$H\u0016¢\u0006\u0005\b \u0001\u00100J\"\u0010¢\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010¡\u0001\u001a\u00020$H\u0016¢\u0006\u0005\b¢\u0001\u00100J\u0012\u0010£\u0001\u001a\u00020\bH\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J+\u0010¦\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010v\u001a\u00020\b2\u0007\u0010¥\u0001\u001a\u00020$H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0017\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0016¢\u0006\u0005\b¨\u0001\u0010[J\u001a\u0010©\u0001\u001a\u00020$2\u0006\u0010v\u001a\u00020\bH\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0019\u0010«\u0001\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0005\b«\u0001\u0010EJ\u0012\u0010¬\u0001\u001a\u00020\bH\u0016¢\u0006\u0006\b¬\u0001\u0010¤\u0001J\u001d\u0010\u00ad\u0001\u001a\u0004\u0018\u00010!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0005\b\u00ad\u0001\u0010KJ\u0017\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0016¢\u0006\u0005\b®\u0001\u0010[R\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020c0²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001e\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020^0²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010´\u0001R\u001e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020g0²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010´\u0001R\u001b\u0010·\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R$\u0010º\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0018\u0010½\u0001\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R$\u0010¿\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010»\u0001R$\u0010À\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010»\u0001R\u0019\u0010Á\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Ä\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010Æ\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u001c\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010[¨\u0006Í\u0001"}, d2 = {"Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl;", "Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternalRemote;", "", "did", "", "onConnectSuccessInternal", "(Ljava/lang/String;)V", "onDisconnectInternal", "", "errorCode", "retryTimes", "onConnectFailureInternal", "(Ljava/lang/String;II)V", "notifyDeviceChange", "()V", "Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "deviceModel", "notifyLocalDeviceChange", "(Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;)V", "", "Lcom/xiaomi/fitness/device/manager/export/bean/LocalDevice;", "localDeviceList", "onLoadLocalDeviceSuccess", "(Ljava/util/List;)V", "Lqa6;", "getDeviceModelInternal", "(Ljava/lang/String;)Lqa6;", "model", "cleanActiveDeviceModel", "clearAllModel", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;", "devices", "onRequestDeviceListSuccess", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "initDeviceModels", "device", "", "filteredDeviceInfo", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)Z", "initDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)Lqa6;", "onDeviceChange", "getDeviceInfos", "(Ljava/util/List;)Ljava/util/List;", "initCurrentDeviceModel", "(Lqa6;)V", "isRemoved", "releaseByDeviceModel", "(Ljava/lang/String;Z)V", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "findCurrentDevice", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/bean/Device;", "mac", "bleName", "nodeId", "oob", "bindServer", "Lcom/xiaomi/fitness/device/model/api/DeviceBinder;", "getDeviceBinder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/xiaomi/fitness/device/model/api/DeviceBinder;", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/model/api/DeviceBinder;", "removeDevice", "switchDevice", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "filteredCurrentDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "isConnected", "(Ljava/lang/String;)Z", "getDeviceStatus", "(Ljava/lang/String;)I", "status", "setDeviceStatus", "(Ljava/lang/String;I)V", "isCurrent", "getDeviceInfo", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "info", "setDeviceInfo", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "fromMainProcess", "isAppForeground", "connectDevice", "(ZZ)V", "openBluetooth", "ecoConnectDeviceByDid", "(ZLjava/lang/String;)V", "isConnectActive", "connectLocalDevice", "disconnectDevice", "removeDeviceModel", "getDeviceModels", "()Ljava/util/List;", "getLocalDeviceModels", "setCurrentDeviceModel", "Lcom/xiaomi/fitness/device/manager/g;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDeviceChangeListener", "(Lcom/xiaomi/fitness/device/manager/g;)V", "removeDeviceChangeListener", "Lcom/xiaomi/fitness/device/manager/h;", "addDeviceStatusListener", "(Lcom/xiaomi/fitness/device/manager/h;)V", "removeDeviceStatusListener", "Lcom/xiaomi/fitness/device/manager/f;", "addAccessoryDeviceStateListener", "(Lcom/xiaomi/fitness/device/manager/f;)V", "removeAccessoryDeviceStateListener", "initDeviceModelsByCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect", "(Z)V", "getDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "getDeviceCapability", "getDeviceCapabilityV2", "getDeviceInfoList", "getDeviceInfoInAll", "getDeviceModelByMac", "mode", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "getProduct", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "getCurrentDeviceModel", "()Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "getLocalDeviceModel", "Lcom/xiaomi/fitness/device/manager/b;", "callback", "requestDeviceList", "(Lcom/xiaomi/fitness/device/manager/b;)V", "deviceInfo", "addDeviceLocal", "updateDevice", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;)V", "removeLocalDevice", "Lkotlin/Function1;", "predicate", "findDeviceModel", "(Lkotlin/jvm/functions/Function1;)Lqa6;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;", "parameter", "Lcom/xiaomi/fitness/device/manager/a;", "bindDevice", "(Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;Lcom/xiaomi/fitness/device/manager/a;)V", "Lcom/xiaomi/fitness/device/manager/l;", "deauthorize", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l;)V", "unbindDevice", "syncData", "unbindBloodSugarDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l;Z)V", "cancelBind", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "getCurrentPhoneSid", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/device/manager/d;", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "(Lcom/xiaomi/fitness/device/manager/d;)Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", CervicalMucusRecord.Appearance.CLEAR, "isReadded", "notifyDeviceInit", "notifyDeviceDestroy", "isRebind", "notifyDeviceBind", "getWearableDeviceSize", "()I", Constants.EXTRA_FROM_APP, "switchDeviceWearMode", "(Ljava/lang/String;IZ)V", "getAccessoryDeviceModels", "hasAccessoryMode", "(I)Z", "getAccessoryMode", "getRequestStatus", "getDeviceInfoByModelFromAllDevice", "getNeedKeepAliveDeviceModel", "Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "mProductManager", "Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "Landroid/os/RemoteCallbackList;", "mDeviceStatusListeners", "Landroid/os/RemoteCallbackList;", "mDeviceChangeListeners", "mAccessoryDeviceStateListener", "mCurrentDeviceModel", "Lqa6;", "Ljava/util/concurrent/ConcurrentHashMap;", "mDeviceModels", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/fitness/device/manager/remote/DeviceContainerImpl;", "mDeviceContainer", "Lcom/xiaomi/fitness/device/manager/remote/DeviceContainerImpl;", "mLocalDeviceModels", "mActiveLocalDeviceModel", "requestStatus", "I", "com/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl$mDeviceConnectStateListener$1", "mDeviceConnectStateListener", "Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl$mDeviceConnectStateListener$1;", "needRetryRequest", "Z", "getAllDeviceModels", "allDeviceModels", "<init>", "(Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceManagerRemoteImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagerRemoteImpl.kt\ncom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1241:1\n90#2,19:1242\n90#2,19:1261\n90#2,19:1290\n90#2,19:1310\n90#2,19:1329\n90#2,19:1350\n90#2,19:1369\n1863#3,2:1280\n1863#3,2:1286\n1863#3,2:1288\n1863#3,2:1388\n1863#3,2:1390\n216#4,2:1282\n216#4,2:1284\n216#4,2:1348\n1#5:1309\n*S KotlinDebug\n*F\n+ 1 DeviceManagerRemoteImpl.kt\ncom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl\n*L\n379#1:1242,19\n385#1:1261,19\n791#1:1290,19\n1077#1:1310,19\n1087#1:1329,19\n1125#1:1350,19\n1186#1:1369,19\n421#1:1280,2\n669#1:1286,2\n719#1:1288,2\n1221#1:1388,2\n1232#1:1390,2\n537#1:1282,2\n571#1:1284,2\n1094#1:1348,2\n*E\n"})
public final class DeviceManagerRemoteImpl extends DeviceManagerInternalRemote {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int KEY_DEVICE_MANAGER_BINDER = 5;

    @NotNull
    private static final String TAG = "DeviceManagerRemoteImpl";

    @NotNull
    private final RemoteCallbackList<f> mAccessoryDeviceStateListener;

    @NotNull
    private final ConcurrentHashMap<String, qa6> mActiveLocalDeviceModel;

    @Nullable
    private volatile qa6 mCurrentDeviceModel;

    @NotNull
    private final RemoteCallbackList<g> mDeviceChangeListeners;

    @NotNull
    private final DeviceManagerRemoteImpl$mDeviceConnectStateListener$1 mDeviceConnectStateListener;

    @NotNull
    private final DeviceContainerImpl mDeviceContainer;

    @NotNull
    private final ConcurrentHashMap<String, qa6> mDeviceModels;

    @NotNull
    private final RemoteCallbackList<h> mDeviceStatusListeners;

    @NotNull
    private final ConcurrentHashMap<String, qa6> mLocalDeviceModels;

    @NotNull
    private final ProductManagerRemoteInternal mProductManager;
    private boolean needRetryRequest;
    private volatile int requestStatus;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$1", f = "DeviceManagerRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerRemoteImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IMiWearCoreClient.INSTANCE.getInstance().addDeviceStateListener(DeviceManagerRemoteImpl.this.mDeviceConnectStateListener);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl$Companion;", "", "<init>", "()V", "KEY_DEVICE_MANAGER_BINDER", "", "TAG", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$addDeviceLocal$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$addDeviceLocal$1", f = "DeviceManagerRemoteImpl.kt", i = {}, l = {605}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceInfo $deviceInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19491(WearableDeviceInfo wearableDeviceInfo, Continuation<? super C19491> continuation) {
            super(2, continuation);
            this.$deviceInfo = wearableDeviceInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerRemoteImpl.this.new C19491(this.$deviceInfo, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceContainerImpl deviceContainerImpl = DeviceManagerRemoteImpl.this.mDeviceContainer;
                T t = this.$deviceInfo.device;
                Intrinsics.checkNotNull(t);
                this.label = 1;
                if (deviceContainerImpl.recordLocalBindDevice((WearableDevice) t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.i(DeviceManagerRemoteImpl.TAG, "onBindSuccess: wait bind result");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$deauthorize$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$deauthorize$1", f = "DeviceManagerRemoteImpl.kt", i = {}, l = {888}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ l $callback;
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19501(String str, l lVar, Continuation<? super C19501> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$callback = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerRemoteImpl.this.new C19501(this.$did, this.$callback, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0073  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            Integer num;
            l lVar;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceBinder deviceBinder = DeviceManagerRemoteImpl.this.getDeviceBinder(this.$did);
                if (deviceBinder != null) {
                    this.label = 1;
                    obj = deviceBinder.revokeAuthorization(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    num = null;
                }
                if ((num == null && num.intValue() == 0) || (num != null && num.intValue() == -1)) {
                    DeviceManagerRemoteImpl.this.removeDevice(this.$did);
                    lVar = this.$callback;
                    if (lVar != null) {
                        lVar.onSuccess();
                    }
                } else if (num != null && num.intValue() == -2) {
                    l lVar2 = this.$callback;
                    if (lVar2 != null) {
                        lVar2.onSuccess();
                    }
                } else {
                    l lVar3 = this.$callback;
                    if (lVar3 != null) {
                        lVar3.onFail(num != null ? num.intValue() : -10);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            num = (Integer) obj;
            if (num == null) {
                DeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            } else {
                DeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$getDeviceInfoInAll$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$getDeviceInfoInAll$1", f = "DeviceManagerRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C19511(Continuation<? super C19511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerRemoteImpl.this.new C19511(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceManagerRemoteImpl.this.mDeviceContainer.rawRecordPhone();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$initDeviceModelsByCache$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl", f = "DeviceManagerRemoteImpl.kt", i = {0, 1, 2, 2}, l = {407, 408, 409, 414}, m = "initDeviceModelsByCache", n = {"this", "this", "this", "bindDevices"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class C19521 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C19521(Continuation<? super C19521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceManagerRemoteImpl.this.initDeviceModelsByCache(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$initDeviceModelsByCache$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$initDeviceModelsByCache$2", f = "DeviceManagerRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<WearableDevice> $bindDevices;
        final /* synthetic */ List<LocalDevice> $localDeviceList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends WearableDevice> list, List<LocalDevice> list2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$bindDevices = list;
            this.$localDeviceList = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerRemoteImpl.this.new AnonymousClass2(this.$bindDevices, this.$localDeviceList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceManagerRemoteImpl.this.onRequestDeviceListSuccess(this.$bindDevices);
            DeviceManagerRemoteImpl.this.onLoadLocalDeviceSuccess(this.$localDeviceList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$requestDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$requestDeviceList$1", f = "DeviceManagerRemoteImpl.kt", i = {}, l = {552, 553}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ b $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19541(b bVar, Continuation<? super C19541> continuation) {
            super(2, continuation);
            this.$callback = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerRemoteImpl.this.new C19541(this.$callback, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            b bVar;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                DeviceManagerRemoteImpl.this.requestStatus = 2;
                DeviceManagerRemoteImpl.this.onRequestDeviceListSuccess((List) obj);
                bVar = this.$callback;
                if (bVar != null) {
                    bVar.onSuccess();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ProductManagerRemoteInternal productManagerRemoteInternal = DeviceManagerRemoteImpl.this.mProductManager;
            this.label = 1;
            if (productManagerRemoteInternal.update(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            DeviceContainerImpl deviceContainerImpl = DeviceManagerRemoteImpl.this.mDeviceContainer;
            this.label = 2;
            obj = deviceContainerImpl.requestBindDeviceList(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            DeviceManagerRemoteImpl.this.requestStatus = 2;
            DeviceManagerRemoteImpl.this.onRequestDeviceListSuccess((List) obj);
            bVar = this.$callback;
            if (bVar != null) {
                bVar.onSuccess();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$requestDeviceList$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$requestDeviceList$3", f = "DeviceManagerRemoteImpl.kt", i = {}, l = {563}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerRemoteImpl.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceContainerImpl deviceContainerImpl = DeviceManagerRemoteImpl.this.mDeviceContainer;
                this.label = 1;
                if (deviceContainerImpl.requestUnbindDeviceList(this) == coroutine_suspended) {
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
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$unbindBloodSugarDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$unbindBloodSugarDevice$1", f = "DeviceManagerRemoteImpl.kt", i = {}, l = {946}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ l $callback;
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $syncData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19551(String str, boolean z, l lVar, Continuation<? super C19551> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$syncData = z;
            this.$callback = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerRemoteImpl.this.new C19551(this.$did, this.$syncData, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceBinder deviceBinder = DeviceManagerRemoteImpl.this.getDeviceBinder(this.$did);
                Intrinsics.checkNotNull(deviceBinder, "null cannot be cast to non-null type com.xiaomi.fit.device.bind.BloodSugarDeviceBinder");
                boolean z = this.$syncData;
                this.label = 1;
                obj = ((BloodSugarDeviceBinder) deviceBinder).unbind(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            DeviceModelExtKt.logi("unbind bloodsugar " + this.$did + " from server, and result is " + iIntValue);
            if (iIntValue == -2) {
                l lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            } else if (iIntValue == -1 || iIntValue == 0) {
                DeviceManagerRemoteImpl.this.removeDevice(this.$did);
                l lVar2 = this.$callback;
                if (lVar2 != null) {
                    lVar2.onSuccess();
                }
            } else {
                l lVar3 = this.$callback;
                if (lVar3 != null) {
                    lVar3.onFail(iIntValue);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$unbindDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl$unbindDevice$1", f = "DeviceManagerRemoteImpl.kt", i = {}, l = {911, 914}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ l $callback;
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19561(String str, l lVar, Continuation<? super C19561> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$callback = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerRemoteImpl.this.new C19561(this.$did, this.$callback, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00b1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            Integer num;
            l lVar;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                DeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            DeviceBinder deviceBinder = DeviceManagerRemoteImpl.this.getDeviceBinder(this.$did);
            if (deviceBinder != null) {
                this.label = 1;
                obj = deviceBinder.unbind(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                num = null;
            }
            DeviceModelExtKt.logi("unbind " + this.$did + " from server, and result is " + num);
            if ((num == null && num.intValue() == 0) || (num != null && num.intValue() == -1)) {
                this.label = 2;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                DeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            } else if (num != null && num.intValue() == -2) {
                l lVar2 = this.$callback;
                if (lVar2 != null) {
                    lVar2.onSuccess();
                }
            } else if (num != null && num.intValue() == -3) {
                DeviceManagerRemoteImpl.this.removeDevice(this.$did);
                l lVar3 = this.$callback;
                if (lVar3 != null) {
                    lVar3.onSuccess();
                }
            } else {
                l lVar4 = this.$callback;
                if (lVar4 != null) {
                    lVar4.onFail(num != null ? num.intValue() : -10);
                }
            }
            return Unit.INSTANCE;
            num = (Integer) obj;
            DeviceModelExtKt.logi("unbind " + this.$did + " from server, and result is " + num);
            if (num == null) {
                this.label = 2;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                DeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            } else {
                this.label = 2;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                DeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DeviceManagerRemoteImpl(@NotNull ProductManagerRemoteInternal mProductManager) {
        Intrinsics.checkNotNullParameter(mProductManager, "mProductManager");
        this.mProductManager = mProductManager;
        this.mDeviceStatusListeners = new RemoteCallbackList<>();
        this.mDeviceChangeListeners = new RemoteCallbackList<>();
        this.mAccessoryDeviceStateListener = new RemoteCallbackList<>();
        this.mDeviceModels = new ConcurrentHashMap<>();
        this.mDeviceContainer = new DeviceContainerImpl();
        this.mLocalDeviceModels = new ConcurrentHashMap<>();
        this.mActiveLocalDeviceModel = new ConcurrentHashMap<>();
        this.mDeviceConnectStateListener = new DeviceManagerRemoteImpl$mDeviceConnectStateListener$1(this);
        this.needRetryRequest = true;
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cancelBind$lambda$26(String mac, qa6 it) {
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(it), mac);
    }

    private final void cleanActiveDeviceModel(String model) {
        DeviceModelExtKt.logi("clean active device model = " + model + ", active device count = " + this.mActiveLocalDeviceModel.size());
        for (Map.Entry<String, qa6> entry : this.mActiveLocalDeviceModel.entrySet()) {
            if (Intrinsics.areEqual(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(entry.getValue()), model)) {
                DeviceModelExtKt.logi("clean active device " + com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(entry.getValue()));
                this.mActiveLocalDeviceModel.remove(entry.getKey());
            }
        }
    }

    private final void clearAllModel() {
        DeviceModelExtKt.logi(TAG, "clearAllModel() called");
        Iterator<Map.Entry<String, qa6>> it = this.mDeviceModels.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().destroy(false);
            it.remove();
        }
        this.mDeviceModels.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectDevice$lambda$0(DeviceManagerRemoteImpl this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("Bluetooth is enabled", new Object[0]);
        this$0.connect(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectDevice$lambda$1(DeviceManagerRemoteImpl this$0, int i) {
        String did;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceManagerRemoteImpl$mDeviceConnectStateListener$1 deviceManagerRemoteImpl$mDeviceConnectStateListener$1 = this$0.mDeviceConnectStateListener;
        qa6 qa6Var = this$0.mCurrentDeviceModel;
        if (qa6Var == null || (did = qa6Var.getDid()) == null) {
            did = "";
        }
        deviceManagerRemoteImpl$mDeviceConnectStateListener$1.onConnectFailure(did, 109, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deauthorize$lambda$23(l lVar, AndroidScope androidScope, Throwable it) throws RemoteException {
        IBinder iBinderAsBinder;
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        DeviceModelExtKt.loge(TAG, "revoke device fail because " + it);
        if (lVar != null && (iBinderAsBinder = lVar.asBinder()) != null && iBinderAsBinder.isBinderAlive()) {
            if (it instanceof ApiException) {
                lVar.onFail(((ApiException) it).getErrorCode());
            } else {
                lVar.onFail(-10);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean disconnectDevice$lambda$4(String str, qa6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getDid(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ecoConnectDeviceByDid$lambda$2(DeviceManagerRemoteImpl this$0, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Logger.i("Bluetooth is enabled", new Object[0]);
        this$0.connect(true, did);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ecoConnectDeviceByDid$lambda$3(DeviceManagerRemoteImpl this$0, String did, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        this$0.mDeviceConnectStateListener.onConnectFailure(did, 109, 0);
        return Unit.INSTANCE;
    }

    private final boolean filteredCurrentDevice(WearableDeviceModel deviceModel) {
        return deviceModel == null || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLibai(deviceModel) || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLocalDevice(deviceModel) || DeviceModelExtKt.isAccessory(deviceModel) || com.xiaomi.fitness.device.manager.extensions.DeviceModelExtKt.isThirdPartyDevice(deviceModel);
    }

    private final boolean filteredDeviceInfo(WearableDeviceInfo device) {
        return device.isLocalDevice() || device.isLibai() || device.isEcg() || (!AppUtil.INSTANCE.isPlayChannel() && device.isWearOS());
    }

    private final Device findCurrentDevice(final String did) {
        return this.mDeviceContainer.findCurrentBindDevice(did, new Function1() { // from class: z96
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeviceManagerRemoteImpl.findCurrentDevice$lambda$21(this.f41036a, did, (Device) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findCurrentDevice$lambda$21(DeviceManagerRemoteImpl this$0, String did, Device it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(it, "it");
        return this$0.getDeviceModelInternal(did) != null && Intrinsics.areEqual(did, it.getDid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findDeviceModel$lambda$28(d dVar, qa6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return dVar.predicate(it.getRemote());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceBinder getDeviceBinder(String mac, String model, String bleName, String nodeId, String oob, boolean bindServer, String did) {
        WearableProduct product = getProduct(model);
        if (product == null) {
            DeviceModelExtKt.loge(TAG, "Cannot find product with model(" + model + ")");
            return null;
        }
        WearableDevice wearableDevice = new WearableDevice();
        wearableDevice.setProductId(product.getProductId());
        wearableDevice.setModel(model);
        String productName = product.getProductName();
        if (productName == null) {
            productName = "";
        }
        wearableDevice.setName(productName);
        if (did == null) {
            did = "";
        }
        wearableDevice.setDid(did);
        wearableDevice.setMac(mac);
        if (nodeId != null) {
            wearableDevice.setNodeId(nodeId);
        }
        WearableDeviceInfo wearableDeviceInfo = new WearableDeviceInfo();
        wearableDeviceInfo.device = wearableDevice;
        wearableDeviceInfo.setProduct(product);
        wearableDeviceInfo.setBleName(bleName);
        wearableDeviceInfo.setOob(oob);
        wearableDeviceInfo.setBindServer(bindServer);
        wearableDeviceInfo.setPrivateUUID(DeviceExtKt.convertUuid(product));
        return DeviceFactory.INSTANCE.getDeviceBinder(wearableDeviceInfo);
    }

    private final synchronized List<WearableDeviceInfo> getDeviceInfos(List<? extends WearableDevice> devices) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        DeviceModelExtKt.logi("all product is " + DeviceExtKt.getProductDetails(this.mProductManager) + ", device size " + devices.size());
        for (WearableDevice wearableDevice : devices) {
            Product productDetail = DeviceExtKt.getProductDetail(this.mProductManager, wearableDevice.getModel());
            if (productDetail != null) {
                WearableDeviceInfo wearableDeviceInfo = new WearableDeviceInfo();
                wearableDeviceInfo.device = wearableDevice;
                wearableDeviceInfo.setProduct(productDetail);
                wearableDeviceInfo.setPrivateUUID(DeviceExtKt.convertUuid(productDetail));
                arrayList.add(wearableDeviceInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getDeviceModelByMac$lambda$9(String str, qa6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(it), str);
    }

    private final synchronized qa6 getDeviceModelInternal(String did) {
        if (did != null) {
            if (did.length() != 0) {
                qa6 qa6Var = this.mDeviceModels.get(did);
                if (qa6Var == null) {
                    qa6Var = this.mLocalDeviceModels.get(did);
                }
                return qa6Var;
            }
        }
        return null;
    }

    private final synchronized void initCurrentDeviceModel(qa6 deviceModel) {
        try {
            DeviceModelExtKt.logi(TAG, "initCurrentDeviceModel: " + deviceModel + ">>>" + this.mCurrentDeviceModel);
            qa6 qa6Var = this.mCurrentDeviceModel;
            if (qa6Var != null) {
                if (Intrinsics.areEqual(qa6Var, deviceModel) && (!Intrinsics.areEqual(qa6Var, deviceModel) || !deviceModel.isReAdded())) {
                    qa6Var.setCurrentStatus(true);
                    notifyDeviceChange();
                    return;
                }
                releaseByDeviceModel(qa6Var.getDid(), false);
                if (qa6Var.getDeviceStatus() == 6) {
                    qa6Var.setDeviceStatus(5);
                }
                Logger.i(TAG, "initCurrentDeviceModel: it.isReadded = " + qa6Var.isReAdded());
                if (!qa6Var.isReAdded()) {
                    qa6Var.setCurrentStatus(false);
                }
            }
            this.mCurrentDeviceModel = deviceModel;
            qa6 qa6Var2 = this.mCurrentDeviceModel;
            DeviceModelExtKt.logi("mCurrentDeviceModel " + (qa6Var2 != null ? qa6Var2.getDid() : null));
            qa6 qa6Var3 = this.mCurrentDeviceModel;
            if (qa6Var3 != null) {
                qa6Var3.setCurrentStatus(true);
                DevicePreference.INSTANCE.setCURRENT_DEVICE_ID(qa6Var3.getDid());
            }
            onDeviceChange();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized qa6 initDeviceModel(WearableDeviceInfo device) {
        qa6 deviceModelInternal;
        try {
            deviceModelInternal = getDeviceModelInternal(device.getDid());
            DeviceModelExtKt.logi(TAG, "initDeviceModel() called with: device = " + device + ", deviceModel = " + deviceModelInternal);
            if (deviceModelInternal == null) {
                try {
                    deviceModelInternal = DeviceFactory.createDeviceModel(device);
                    Intrinsics.checkNotNull(deviceModelInternal);
                    deviceModelInternal.init();
                } catch (Exception e) {
                    e.printStackTrace();
                    DeviceModelExtKt.logi(TAG, "initDeviceModel,error: " + e.getMessage());
                    return null;
                }
            } else {
                deviceModelInternal.update(device);
            }
        } catch (Throwable th) {
            throw th;
        }
        return deviceModelInternal;
    }

    private final synchronized void initDeviceModels(List<WearableDeviceInfo> devices) {
        Integer numValueOf;
        if (devices != null) {
            try {
                numValueOf = Integer.valueOf(devices.size());
            } catch (Throwable th) {
                throw th;
            }
        } else {
            numValueOf = null;
        }
        DeviceModelExtKt.logi(TAG, "init DeviceModels by devices(size=" + numValueOf + ")");
        List<WearableDeviceInfo> list = devices;
        if (list == null || list.isEmpty()) {
            clearAllModel();
        } else {
            HashMap map = new HashMap();
            for (WearableDeviceInfo wearableDeviceInfo : devices) {
                if (!filteredDeviceInfo(wearableDeviceInfo)) {
                    qa6 qa6VarInitDeviceModel = initDeviceModel(wearableDeviceInfo);
                    this.mDeviceModels.remove(wearableDeviceInfo.getDid());
                    if (qa6VarInitDeviceModel != null) {
                        map.put(wearableDeviceInfo.getDid(), qa6VarInitDeviceModel);
                    }
                }
            }
            clearAllModel();
            this.mDeviceModels.putAll(map);
        }
    }

    private final void notifyDeviceChange() {
        RemoteCallbackList<g> remoteCallbackList = this.mDeviceChangeListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            g gVar = (g) broadcastItem;
                            qa6 qa6Var = this.mCurrentDeviceModel;
                            gVar.onChange(qa6Var != null ? qa6Var.getRemote() : null);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred when finishBroadcast", e3);
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }

    private final void notifyLocalDeviceChange(DeviceModelRemote deviceModel) {
        RemoteCallbackList<g> remoteCallbackList = this.mDeviceChangeListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((g) broadcastItem).onChange(deviceModel);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                }
                throw th;
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConnectFailureInternal(String did, int errorCode, int retryTimes) {
        DeviceModelRemote currentDeviceModel = getCurrentDeviceModel();
        if (Intrinsics.areEqual(currentDeviceModel != null ? currentDeviceModel.getDid() : null, did) && errorCode == 2007) {
            DeviceModelExtKt.logi(TAG, "onConnectFailureInternal() called with: did = " + did + ", errorCode = " + errorCode + ", retryTimes = " + retryTimes);
            if (this.needRetryRequest) {
                requestDeviceList(new b.a() { // from class: com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl.onConnectFailureInternal.1
                    @Override // com.xiaomi.fitness.device.manager.b
                    public void onFail(String cause, int code) {
                        DeviceModelExtKt.logi(DeviceManagerRemoteImpl.TAG, "onFail() called");
                    }

                    @Override // com.xiaomi.fitness.device.manager.b
                    public void onSuccess() {
                        DeviceModelExtKt.logi(DeviceManagerRemoteImpl.TAG, "onSuccess() called");
                        DeviceManagerRemoteImpl.this.connect(true);
                    }
                });
                this.needRetryRequest = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConnectSuccessInternal(String did) {
        this.needRetryRequest = true;
    }

    private final void onDeviceChange() {
        DeviceModelExtKt.logi("device list have changed");
        qa6 qa6Var = this.mCurrentDeviceModel;
        if (qa6Var != null && qa6Var.isReAdded()) {
            qa6 qa6Var2 = this.mCurrentDeviceModel;
            Intrinsics.checkNotNull(qa6Var2);
            qa6Var2.setReAdded(false);
        }
        notifyDeviceChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisconnectInternal(String did) {
        DeviceModelRemote currentDeviceModel = getCurrentDeviceModel();
        if (Intrinsics.areEqual(currentDeviceModel != null ? currentDeviceModel.getDid() : null, did)) {
            IMiWearCoreClient.INSTANCE.getInstance().setAppCapabilities(CapabilityManagerExtKt.getInstance(CapabilityManager.INSTANCE).getCapabilitiesInt());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadLocalDeviceSuccess(List<LocalDevice> localDeviceList) {
        List<WearableDeviceInfo> deviceInfos = getDeviceInfos(localDeviceList);
        HashMap map = new HashMap();
        for (WearableDeviceInfo wearableDeviceInfo : deviceInfos) {
            qa6 qa6VarInitDeviceModel = initDeviceModel(wearableDeviceInfo);
            this.mLocalDeviceModels.remove(wearableDeviceInfo.getDid());
            if (qa6VarInitDeviceModel != null) {
                map.put(wearableDeviceInfo.getDid(), qa6VarInitDeviceModel);
            }
        }
        this.mLocalDeviceModels.putAll(map);
        if (!this.mLocalDeviceModels.isEmpty()) {
            notifyLocalDeviceChange(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onRequestDeviceListSuccess(List<? extends WearableDevice> devices) {
        try {
            DeviceModelExtKt.logi(TAG, "request device list success " + devices.size());
            if (!devices.isEmpty()) {
                initDeviceModels(getDeviceInfos(devices));
                initCurrentDeviceModel();
            } else {
                clearAllModel();
                this.mCurrentDeviceModel = null;
                notifyDeviceChange();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void releaseByDeviceModel(String did, boolean isRemoved) {
        RemoteCallbackList<h> remoteCallbackList = this.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((h) broadcastItem).onDestroy(did, isRemoved);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                }
                throw th;
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeDevice(String did) {
        this.mDeviceContainer.removeDevice(did);
        qa6 qa6VarRemove = this.mDeviceModels.remove(did);
        if (qa6VarRemove == null) {
            return;
        }
        qa6VarRemove.setAccessoryMode(0);
        com.xiaomi.fitness.device.manager.extensions.DeviceModelExtKt.resetOnRemoveDevice(qa6VarRemove);
        qa6 qa6Var = this.mCurrentDeviceModel;
        if (Intrinsics.areEqual(qa6Var != null ? qa6Var.getDid() : null, did)) {
            qa6 qa6Var2 = this.mCurrentDeviceModel;
            if (qa6Var2 != null) {
                qa6Var2.destroy(true);
            }
            this.mCurrentDeviceModel = null;
            DevicePreference.INSTANCE.setCURRENT_DEVICE_ID("");
            initCurrentDeviceModel();
        } else {
            qa6VarRemove.destroy(true);
            onDeviceChange();
        }
        DeviceFactory.INSTANCE.removeDeviceBinder(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(qa6VarRemove));
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(did);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDeviceList$lambda$11(DeviceManagerRemoteImpl this$0, b bVar, AndroidScope androidScope, Throwable it) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        DeviceModelExtKt.loge(TAG, "requestDeviceList fail with " + it);
        this$0.requestStatus = 0;
        if (bVar != null) {
            bVar.onFail(it.getMessage(), -1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDeviceList$lambda$12(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        DeviceModelExtKt.loge(TAG, "requestUnbindDeviceList fail with " + it);
        return Unit.INSTANCE;
    }

    private final void switchDevice(qa6 deviceModel) {
        if (deviceModel == null || deviceModel.getIsCurrent()) {
            return;
        }
        initCurrentDeviceModel(deviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindBloodSugarDevice$lambda$25(l lVar, DeviceManagerRemoteImpl this$0, String did, AndroidScope androidScope, Throwable it) throws RemoteException {
        IBinder iBinderAsBinder;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        DeviceModelExtKt.loge(TAG, "unboundDevice fail because " + it);
        if (lVar != null && (iBinderAsBinder = lVar.asBinder()) != null && iBinderAsBinder.isBinderAlive()) {
            if (it instanceof ApiException) {
                ApiException apiException = (ApiException) it;
                if (apiException.getErrorCode() == -1) {
                    this$0.removeDevice(did);
                    lVar.onSuccess();
                } else {
                    lVar.onFail(apiException.getErrorCode());
                }
            } else {
                lVar.onFail(-10);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindDevice$lambda$24(l lVar, DeviceManagerRemoteImpl this$0, String did, AndroidScope androidScope, Throwable it) throws RemoteException {
        IBinder iBinderAsBinder;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        DeviceModelExtKt.loge("unboundDevice fail because " + it, it);
        if (lVar != null && (iBinderAsBinder = lVar.asBinder()) != null && iBinderAsBinder.isBinderAlive()) {
            if (it instanceof ApiException) {
                ApiException apiException = (ApiException) it;
                if (apiException.getErrorCode() == -1) {
                    this$0.removeDevice(did);
                    lVar.onSuccess();
                } else {
                    lVar.onFail(apiException.getErrorCode());
                }
            } else {
                lVar.onFail(-10);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public void addAccessoryDeviceStateListener(@NotNull f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mAccessoryDeviceStateListener.register(listener);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public void addDeviceChangeListener(@NotNull g listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.requestStatus == 2 || getCurrentDeviceModel() != null) {
            listener.onChange(getCurrentDeviceModel());
        }
        this.mDeviceChangeListeners.register(listener);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    public void addDeviceLocal(@NotNull WearableDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        WearableDevice wearableDevice = (WearableDevice) deviceInfo.device;
        if ((wearableDevice != null ? wearableDevice.getMac() : null) == null) {
            return;
        }
        if (!deviceInfo.isLocalDevice()) {
            if (!deviceInfo.isWearOS()) {
                DeviceModelExtKt.logi("add device local type unknown");
                return;
            }
            if (((WearableDevice) deviceInfo.device) == null) {
                Logger.i(TAG, "addDeviceLocal: error device");
                return;
            }
            qa6 qa6VarInitDeviceModel = initDeviceModel(deviceInfo);
            AnyExtKt.io$default(null, new C19491(deviceInfo, null), 1, null);
            if (qa6VarInitDeviceModel != null) {
                this.mDeviceModels.put(deviceInfo.getDid(), qa6VarInitDeviceModel);
                return;
            }
            return;
        }
        qa6 qa6VarInitDeviceModel2 = initDeviceModel(deviceInfo);
        WearableDevice wearableDevice2 = (WearableDevice) deviceInfo.device;
        DeviceModelExtKt.logi("add local device " + qa6VarInitDeviceModel2 + ", mac = " + (wearableDevice2 != null ? wearableDevice2.getMac() : null));
        if (qa6VarInitDeviceModel2 == null) {
            return;
        }
        cleanActiveDeviceModel(deviceInfo.getModel());
        this.mActiveLocalDeviceModel.put(deviceInfo.getDid(), qa6VarInitDeviceModel2);
        this.mLocalDeviceModels.put(deviceInfo.getDid(), qa6VarInitDeviceModel2);
        T t = deviceInfo.device;
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.xiaomi.fitness.device.manager.export.bean.LocalDevice");
        LocalDevice localDevice = (LocalDevice) t;
        DeviceModelExtKt.logi("add local device info " + localDevice);
        this.mDeviceContainer.saveLocalDevice(localDevice);
        notifyLocalDeviceChange(qa6VarInitDeviceModel2.getRemote());
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public void addDeviceStatusListener(@NotNull h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeviceStatusListeners.register(listener);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void bindDevice(@NotNull DeviceParameter parameter, @Nullable a callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        DeviceBinder deviceBinder = getDeviceBinder(parameter.getMac(), parameter.getModel(), parameter.getBleName(), parameter.getNodeId(), parameter.getOob(), parameter.getServerBind(), parameter.getDid());
        if (deviceBinder == null) {
            DeviceModelExtKt.loge(TAG, "Cannot find DeviceBinder when bind device");
            if (callback != null) {
                callback.onConnectFailure(-1);
                return;
            }
            return;
        }
        DeviceModelExtKt.logi("bindDevice() called with: mac = " + parameter.getMac() + ", model = " + parameter.getModel() + ", bleName = " + parameter.getBleName());
        deviceBinder.bind(parameter.getFrom(), callback);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void cancelBind(@NotNull final String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        qa6 qa6VarFindDeviceModel = findDeviceModel(new Function1() { // from class: ba6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeviceManagerRemoteImpl.cancelBind$lambda$26(mac, (qa6) obj));
            }
        });
        Logger.i(TAG, "cancelBind: dm = " + qa6VarFindDeviceModel + ", did = " + (qa6VarFindDeviceModel != null ? qa6VarFindDeviceModel.getDid() : null));
        if (qa6VarFindDeviceModel == null || TextUtils.isEmpty(qa6VarFindDeviceModel.getDid())) {
            DeviceBinder deviceBinder = DeviceFactory.INSTANCE.getDeviceBinder(mac);
            if (deviceBinder != null) {
                deviceBinder.cancel();
            }
        } else if (qa6VarFindDeviceModel != null) {
            qa6VarFindDeviceModel.disconnectDevice();
        }
        DeviceFactory.INSTANCE.removeDeviceBinder(mac);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    public void clear() {
        this.mDeviceContainer.clearAll();
        clearAllModel();
    }

    public final void connect(boolean fromMainProcess) {
        DeviceModelExtKt.loge("connect：" + this.mCurrentDeviceModel, new Exception());
        if (this.mCurrentDeviceModel == null) {
            DeviceModelExtKt.loge(TAG, "Current deviceModel is null");
            return;
        }
        if (!fromMainProcess) {
            qa6 qa6Var = this.mCurrentDeviceModel;
            Intrinsics.checkNotNull(qa6Var);
            if (!qa6Var.getIsConnectActive()) {
                DeviceModelExtKt.loge(TAG, "connect: from device process || OAID not valid");
                qa6 qa6Var2 = this.mCurrentDeviceModel;
                Intrinsics.checkNotNull(qa6Var2);
                setDeviceStatus(qa6Var2.getDid(), 9);
                return;
            }
        }
        ConnectSource.INSTANCE.setFromMainProcess(fromMainProcess);
        qa6 qa6Var3 = this.mCurrentDeviceModel;
        Intrinsics.checkNotNull(qa6Var3);
        qa6Var3.connectDevice();
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void connectDevice(final boolean fromMainProcess, boolean isAppForeground) {
        String did;
        if (Build.VERSION.SDK_INT >= 31 && !PermissionsUtil.INSTANCE.checkPermission("android.permission.BLUETOOTH_CONNECT")) {
            Logger.i(TAG, "connectDevice: bluetooth permission is not granted");
        }
        if (DevicePreference.INSTANCE.getIN_BIND_NEW_MODE()) {
            return;
        }
        if (fromMainProcess && isAppForeground) {
            BluetoothExtKt.openBluetooth(new Function0() { // from class: ia6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceManagerRemoteImpl.connectDevice$lambda$0(this.f20934a, fromMainProcess);
                }
            }, new Function1() { // from class: ja6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceManagerRemoteImpl.connectDevice$lambda$1(this.f22584a, ((Integer) obj).intValue());
                }
            });
            return;
        }
        if (s33.e()) {
            Logger.i("Bluetooth is enabled", new Object[0]);
            connect(fromMainProcess);
            return;
        }
        DeviceManagerRemoteImpl$mDeviceConnectStateListener$1 deviceManagerRemoteImpl$mDeviceConnectStateListener$1 = this.mDeviceConnectStateListener;
        qa6 qa6Var = this.mCurrentDeviceModel;
        if (qa6Var == null || (did = qa6Var.getDid()) == null) {
            did = "";
        }
        deviceManagerRemoteImpl$mDeviceConnectStateListener$1.onConnectFailure(did, 109, 0);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void connectLocalDevice(@Nullable String did) {
        DeviceModelExtKt.logi(TAG, "connectLocalDevice() called with: did = " + did);
        qa6 qa6Var = this.mActiveLocalDeviceModel.get(did);
        if (qa6Var == null) {
            qa6Var = this.mLocalDeviceModels.get(did);
            if (qa6Var == null) {
                DeviceModelExtKt.logi(TAG, "connectLocalDevice: no local device error");
                return;
            }
            DeviceModelExtKt.logi(TAG, "connectLocalDevice: find in all local device");
            cleanActiveDeviceModel(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(qa6Var));
            ConcurrentHashMap<String, qa6> concurrentHashMap = this.mActiveLocalDeviceModel;
            Intrinsics.checkNotNull(did);
            concurrentHashMap.put(did, qa6Var);
        } else {
            DeviceModelExtKt.logi("connectLocalDevice: find in active");
        }
        qa6Var.connectDevice();
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void deauthorize(@NotNull String did, @Nullable final l callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        ScopeExtKt.scopeNet$default(null, new C19501(did, callback, null), 1, null).m503catch(new Function2() { // from class: ga6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceManagerRemoteImpl.deauthorize$lambda$23(callback, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void disconnectDevice(@Nullable final String did) {
        qa6 qa6VarFindDeviceModel = findDeviceModel(new Function1() { // from class: ha6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeviceManagerRemoteImpl.disconnectDevice$lambda$4(did, (qa6) obj));
            }
        });
        DeviceModelExtKt.logi(TAG, "disconnectDevice: " + qa6VarFindDeviceModel);
        if (qa6VarFindDeviceModel != null) {
            qa6VarFindDeviceModel.disconnectDevice();
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void ecoConnectDeviceByDid(boolean openBluetooth, @NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (openBluetooth) {
            BluetoothExtKt.openBluetooth(new Function0() { // from class: ea6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceManagerRemoteImpl.ecoConnectDeviceByDid$lambda$2(this.f16440a, did);
                }
            }, new Function1() { // from class: fa6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceManagerRemoteImpl.ecoConnectDeviceByDid$lambda$3(this.f17589a, did, ((Integer) obj).intValue());
                }
            });
        } else if (!s33.e()) {
            this.mDeviceConnectStateListener.onConnectFailure(did, 109, 0);
        } else {
            Logger.i("Bluetooth is enabled", new Object[0]);
            connect(false, did);
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    @Nullable
    public qa6 findDeviceModel(@NotNull Function1<? super qa6, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<Map.Entry<String, qa6>> it = this.mDeviceModels.entrySet().iterator();
        while (it.hasNext()) {
            qa6 value = it.next().getValue();
            if (predicate.invoke2(value).booleanValue()) {
                return value;
            }
        }
        Iterator<Map.Entry<String, qa6>> it2 = this.mLocalDeviceModels.entrySet().iterator();
        while (it2.hasNext()) {
            qa6 value2 = it2.next().getValue();
            if (predicate.invoke2(value2).booleanValue()) {
                return value2;
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @NotNull
    public List<DeviceModelRemote> getAccessoryDeviceModels() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, qa6>> it = this.mDeviceModels.entrySet().iterator();
        while (it.hasNext()) {
            qa6 value = it.next().getValue();
            if (value.isAccessory()) {
                arrayList.add(value.getRemote());
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public int getAccessoryMode(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        qa6 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal != null) {
            return deviceModelInternal.getAccessoryMode();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    @NotNull
    public List<qa6> getAllDeviceModels() {
        Collection<qa6> collectionValues = this.mDeviceModels.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return CollectionsKt___CollectionsKt.toList(collectionValues);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @Nullable
    public synchronized DeviceModelRemote getCurrentDeviceModel() {
        qa6 qa6Var;
        qa6Var = this.mCurrentDeviceModel;
        return qa6Var != null ? qa6Var.getRemote() : null;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @Nullable
    public String getCurrentPhoneSid() {
        String oldHealthUniqueId = DeviceUtil.INSTANCE.getOldHealthUniqueId();
        DeviceModelExtKt.loge(TAG, "getCurrentPhoneSid getOldHealthUniqueId(" + oldHealthUniqueId + ")");
        if (TextUtils.isEmpty(oldHealthUniqueId)) {
            oldHealthUniqueId = DevicePreference.INSTANCE.getOLD_HEALTH_OAID();
            if (oldHealthUniqueId.length() == 0) {
                DeviceModelExtKt.logi(TAG, "getCurrentPhoneSid- getNewUniqueIdentify");
                oldHealthUniqueId = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getUniqueIdentify();
            }
            if (TextUtils.isEmpty(oldHealthUniqueId)) {
                DeviceModelExtKt.loge(TAG, "getCurrentPhoneSid identifier is empty");
                return null;
            }
        } else {
            DevicePreference devicePreference = DevicePreference.INSTANCE;
            Intrinsics.checkNotNull(oldHealthUniqueId);
            devicePreference.setOLD_HEALTH_OAID(oldHealthUniqueId);
        }
        DeviceModelExtKt.loge(TAG, "getCurrentPhoneSid device size(" + this.mDeviceContainer.getAllDeviceList().size() + ")");
        for (WearableDevice wearableDevice : this.mDeviceContainer.getAllDeviceList()) {
            if (wearableDevice.getIdentifier().contentEquals(oldHealthUniqueId)) {
                DeviceModelExtKt.loge(TAG, "getCurrentPhoneSid did(" + wearableDevice.getDid() + ")");
                DevicePreference.INSTANCE.setCUR_PHONE_DID(wearableDevice.getDid());
                return wearableDevice.getDid();
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public int getDeviceCapability(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        qa6 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal != null) {
            return deviceModelInternal.getDeviceCapability();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public int getDeviceCapabilityV2(@Nullable String did) {
        qa6 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal != null) {
            return deviceModelInternal.getDeviceCapabilityV2();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @Nullable
    public WearableDeviceInfo getDeviceInfo(@Nullable String did) {
        qa6 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal != null) {
            return deviceModelInternal.getDeviceInfo();
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @Nullable
    public WearableDeviceInfo getDeviceInfoByModelFromAllDevice(@Nullable String model) {
        for (WearableDeviceInfo wearableDeviceInfo : getDeviceInfoList()) {
            if (Intrinsics.areEqual(wearableDeviceInfo.getModel(), model)) {
                return wearableDeviceInfo;
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @Nullable
    public WearableDeviceInfo getDeviceInfoInAll(@NotNull String did) {
        Object next;
        Intrinsics.checkNotNullParameter(did, "did");
        if (!this.mDeviceContainer.getPhoneInfoUpdated()) {
            ScopeExtKt.scopeNet$default(null, new C19511(null), 1, null);
        }
        Iterator<T> it = this.mDeviceContainer.getAllDeviceList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((WearableDevice) next).getDid(), did));
        WearableDevice wearableDevice = (WearableDevice) next;
        if (wearableDevice == null) {
            DeviceModelExtKt.logi("Couldn't find device from all device list with " + did);
            return null;
        }
        Product productDetail = DeviceExtKt.getProductDetail(this.mProductManager, wearableDevice.getModel());
        if (productDetail != null) {
            WearableDeviceInfo wearableDeviceInfo = new WearableDeviceInfo();
            wearableDeviceInfo.device = wearableDevice;
            wearableDeviceInfo.setProduct(productDetail);
            wearableDeviceInfo.setPrivateUUID(DeviceExtKt.convertUuid(productDetail));
            return wearableDeviceInfo;
        }
        DeviceModelExtKt.logi("Couldn't find product with model(" + wearableDevice.getModel() + ")");
        return null;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @NotNull
    public List<WearableDeviceInfo> getDeviceInfoList() {
        return getDeviceInfos(this.mDeviceContainer.getAllDeviceList());
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @Nullable
    public DeviceModelRemote getDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        qa6 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal != null) {
            return deviceModelInternal.getRemote();
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @Nullable
    public synchronized DeviceModelRemote getDeviceModelByMac(@Nullable final String mac) {
        qa6 qa6VarFindDeviceModel;
        qa6VarFindDeviceModel = findDeviceModel(new Function1() { // from class: ka6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeviceManagerRemoteImpl.getDeviceModelByMac$lambda$9(mac, (qa6) obj));
            }
        });
        return qa6VarFindDeviceModel != null ? qa6VarFindDeviceModel.getRemote() : null;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @NotNull
    public List<DeviceModelRemote> getDeviceModels() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, qa6>> it = this.mDeviceModels.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().getRemote());
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public synchronized int getDeviceStatus(@Nullable String did) {
        Integer numValueOf;
        try {
            qa6 deviceModelInternal = getDeviceModelInternal(did);
            numValueOf = deviceModelInternal != null ? Integer.valueOf(deviceModelInternal.getDeviceStatus()) : null;
            DeviceModelExtKt.logi((deviceModelInternal != null ? com.xiaomi.fitness.device.manager.DeviceModelExtKt.getName(deviceModelInternal) : null) + "(" + did + ")'s status is " + numValueOf);
        } catch (Throwable th) {
            throw th;
        }
        return numValueOf != null ? numValueOf.intValue() : -1;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @Nullable
    public DeviceModelRemote getLocalDeviceModel(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        for (Map.Entry<String, qa6> entry : this.mActiveLocalDeviceModel.entrySet()) {
            if (Intrinsics.areEqual(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(entry.getValue()), model)) {
                return entry.getValue().getRemote();
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @NotNull
    public List<DeviceModelRemote> getLocalDeviceModels() {
        Logger.i(TAG, "getLocalDeviceModels");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, qa6>> it = this.mLocalDeviceModels.entrySet().iterator();
        while (it.hasNext()) {
            qa6 value = it.next().getValue();
            Logger.i(TAG, "getLocalDeviceModels: " + value);
            arrayList.add(value.getRemote());
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @NotNull
    public List<DeviceModelRemote> getNeedKeepAliveDeviceModel() {
        ArrayList arrayList = new ArrayList();
        DeviceModelRemote currentDeviceModel = getCurrentDeviceModel();
        if (currentDeviceModel != null) {
            arrayList.add(currentDeviceModel);
        }
        arrayList.addAll(getAccessoryDeviceModels());
        for (qa6 qa6Var : getAllDeviceModels()) {
            if (com.xiaomi.fitness.device.manager.extensions.DeviceModelExtKt.isThirdPartyDevice(qa6Var)) {
                arrayList.add(qa6Var.getRemote());
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @Nullable
    public WearableProduct getProduct(@NotNull String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return this.mProductManager.getProductByModel(mode);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public int getRequestStatus() {
        return this.requestStatus;
    }

    @Override // com.xiaomi.fitness.device.manager.c
    public int getWearableDeviceSize() {
        int i = 0;
        for (Map.Entry<String, qa6> entry : this.mDeviceModels.entrySet()) {
            DeviceModelExtKt.logi("getWearableDeviceSize() name : " + entry.getValue().getDeviceInfo().getName());
            DeviceModelExtKt.logi("getWearableDeviceSize() isWearOS : " + entry.getValue().getDeviceInfo().isWearOS());
            qa6 value = entry.getValue();
            if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLibai(value) && !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLocalDevice(value) && !com.xiaomi.fitness.device.manager.extensions.DeviceModelExtKt.isThirdPartyDevice(value)) {
                i++;
            }
        }
        DeviceModelExtKt.logi("getWearableDeviceSize() : " + i + " , mDeviceModels size : " + this.mDeviceModels.size());
        return i;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public boolean hasAccessoryMode(int mode) {
        return AccessoryDevicePreference.INSTANCE.getACCESSORY_DEVICE().contains(Integer.valueOf(mode));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    @Nullable
    public Object initDeviceModelsByCache(@NotNull Continuation<? super Unit> continuation) {
        C19521 c19521;
        DeviceManagerRemoteImpl deviceManagerRemoteImpl;
        List list;
        Object objLoadLocalDeviceList;
        List list2;
        DeviceManagerRemoteImpl deviceManagerRemoteImpl2;
        DeviceContainerImpl deviceContainerImpl;
        if (continuation instanceof C19521) {
            c19521 = (C19521) continuation;
            int i = c19521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19521.label = i - Integer.MIN_VALUE;
            } else {
                c19521 = new C19521(continuation);
            }
        } else {
            c19521 = new C19521(continuation);
        }
        Object objLoadBindDeviceList = c19521.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19521.label;
        if (i2 != 0) {
            if (i2 == 1) {
                deviceManagerRemoteImpl = (DeviceManagerRemoteImpl) c19521.L$0;
                ResultKt.throwOnFailure(objLoadBindDeviceList);
            } else if (i2 == 2) {
                deviceManagerRemoteImpl = (DeviceManagerRemoteImpl) c19521.L$0;
                ResultKt.throwOnFailure(objLoadBindDeviceList);
                list = (List) objLoadBindDeviceList;
                DeviceContainerImpl deviceContainerImpl2 = deviceManagerRemoteImpl.mDeviceContainer;
                c19521.L$0 = deviceManagerRemoteImpl;
                c19521.L$1 = list;
                c19521.label = 3;
                objLoadLocalDeviceList = deviceContainerImpl2.loadLocalDeviceList(c19521);
                if (objLoadLocalDeviceList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                DeviceManagerRemoteImpl deviceManagerRemoteImpl3 = deviceManagerRemoteImpl;
                list2 = list;
                objLoadBindDeviceList = objLoadLocalDeviceList;
                deviceManagerRemoteImpl2 = deviceManagerRemoteImpl3;
                AnyExtKt.main$default(null, deviceManagerRemoteImpl2.new AnonymousClass2(list2, (List) objLoadBindDeviceList, null), 1, null);
                deviceContainerImpl = deviceManagerRemoteImpl2.mDeviceContainer;
                c19521.L$0 = null;
                c19521.L$1 = null;
                c19521.label = 4;
                if (deviceContainerImpl.loadUnbindDeviceList(c19521) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 3) {
                list2 = (List) c19521.L$1;
                deviceManagerRemoteImpl2 = (DeviceManagerRemoteImpl) c19521.L$0;
                ResultKt.throwOnFailure(objLoadBindDeviceList);
                AnyExtKt.main$default(null, deviceManagerRemoteImpl2.new AnonymousClass2(list2, (List) objLoadBindDeviceList, null), 1, null);
                deviceContainerImpl = deviceManagerRemoteImpl2.mDeviceContainer;
                c19521.L$0 = null;
                c19521.L$1 = null;
                c19521.label = 4;
                if (deviceContainerImpl.loadUnbindDeviceList(c19521) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objLoadBindDeviceList);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objLoadBindDeviceList);
        ProductManagerRemoteInternal productManagerRemoteInternal = this.mProductManager;
        c19521.L$0 = this;
        c19521.label = 1;
        if (productManagerRemoteInternal.load(c19521) == coroutine_suspended) {
            return coroutine_suspended;
        }
        deviceManagerRemoteImpl = this;
        DeviceContainerImpl deviceContainerImpl3 = deviceManagerRemoteImpl.mDeviceContainer;
        c19521.L$0 = deviceManagerRemoteImpl;
        c19521.label = 2;
        objLoadBindDeviceList = deviceContainerImpl3.loadBindDeviceList(c19521);
        if (objLoadBindDeviceList == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = (List) objLoadBindDeviceList;
        DeviceContainerImpl deviceContainerImpl4 = deviceManagerRemoteImpl.mDeviceContainer;
        c19521.L$0 = deviceManagerRemoteImpl;
        c19521.L$1 = list;
        c19521.label = 3;
        objLoadLocalDeviceList = deviceContainerImpl4.loadLocalDeviceList(c19521);
        if (objLoadLocalDeviceList == coroutine_suspended) {
            return coroutine_suspended;
        }
        DeviceManagerRemoteImpl deviceManagerRemoteImpl4 = deviceManagerRemoteImpl;
        list2 = list;
        objLoadBindDeviceList = objLoadLocalDeviceList;
        deviceManagerRemoteImpl2 = deviceManagerRemoteImpl4;
        AnyExtKt.main$default(null, deviceManagerRemoteImpl2.new AnonymousClass2(list2, (List) objLoadBindDeviceList, null), 1, null);
        deviceContainerImpl = deviceManagerRemoteImpl2.mDeviceContainer;
        c19521.L$0 = null;
        c19521.L$1 = null;
        c19521.label = 4;
        if (deviceContainerImpl.loadUnbindDeviceList(c19521) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public boolean isConnectActive(@Nullable String did) {
        qa6 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal != null) {
            return deviceModelInternal.getIsConnectActive();
        }
        return false;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public synchronized boolean isConnected(@Nullable String did) {
        boolean z;
        qa6 deviceModelInternal = getDeviceModelInternal(did);
        z = false;
        if (deviceModelInternal != null && deviceModelInternal.getIsDeviceConnected()) {
            z = true;
        }
        return z;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public boolean isCurrent(@Nullable String did) {
        qa6 deviceModelInternal = getDeviceModelInternal(did);
        return deviceModelInternal != null && deviceModelInternal.getIsCurrent();
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    public void notifyDeviceBind(@NotNull String did, boolean isRebind) {
        Intrinsics.checkNotNullParameter(did, "did");
        RemoteCallbackList<h> remoteCallbackList = this.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((h) broadcastItem).onBind(did, isRebind);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred when finishBroadcast", e3);
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    public void notifyDeviceDestroy(@NotNull String did, boolean isRemoved) {
        Intrinsics.checkNotNullParameter(did, "did");
        releaseByDeviceModel(did, isRemoved);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    public void notifyDeviceInit(@NotNull String did, boolean isReadded) {
        Intrinsics.checkNotNullParameter(did, "did");
        RemoteCallbackList<h> remoteCallbackList = this.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((h) broadcastItem).onInIt(did, isReadded);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred when finishBroadcast", e3);
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public void removeAccessoryDeviceStateListener(@NotNull f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mAccessoryDeviceStateListener.unregister(listener);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public void removeDeviceChangeListener(@NotNull g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeviceChangeListeners.unregister(listener);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void removeDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.mDeviceModels.remove(did);
        this.mDeviceContainer.removeDevice(did);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public void removeDeviceStatusListener(@NotNull h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeviceStatusListeners.unregister(listener);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    public void removeLocalDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        DeviceModelExtKt.logi(TAG, "removeLocalDevice() called with: did = " + did);
        this.mDeviceContainer.removeLocalDevice(did);
        this.mActiveLocalDeviceModel.remove(did);
        qa6 qa6VarRemove = this.mLocalDeviceModels.remove(did);
        if (qa6VarRemove != null) {
            qa6VarRemove.destroy(true);
            DeviceFactory.INSTANCE.removeDeviceBinder(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(qa6VarRemove));
        }
        notifyLocalDeviceChange(qa6VarRemove != null ? qa6VarRemove.getRemote() : null);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void requestDeviceList(@Nullable final b callback) {
        if (this.requestStatus == 1) {
            DeviceModelExtKt.loge(TAG, "requesting device list now");
            return;
        }
        this.requestStatus = 1;
        ScopeExtKt.scopeNet$default(null, new C19541(callback, null), 1, null).m503catch(new Function2() { // from class: y96
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceManagerRemoteImpl.requestDeviceList$lambda$11(this.f39950a, callback, (AndroidScope) obj, (Throwable) obj2);
            }
        });
        ScopeExtKt.scopeNet$default(null, new AnonymousClass3(null), 1, null).m503catch(new Function2() { // from class: da6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceManagerRemoteImpl.requestDeviceList$lambda$12((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    public synchronized void setCurrentDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.mCurrentDeviceModel = this.mDeviceModels.get(did);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void setDeviceInfo(@NotNull WearableDeviceInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        qa6 deviceModelInternal = getDeviceModelInternal(info.getDid());
        if (deviceModelInternal != null) {
            deviceModelInternal.setDeviceInfo(info);
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public synchronized void setDeviceStatus(@Nullable String did, int status) {
        try {
            DeviceModelExtKt.logi(TAG, "update device(did=" + did + ") to status " + DeviceStatus.INSTANCE.statusToString(status));
            qa6 deviceModelInternal = getDeviceModelInternal(did);
            if (deviceModelInternal != null && !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLocalDevice(deviceModelInternal) && OhterExtKt.isAppAbandon(ApplicationExtKt.getApplication())) {
                deviceModelInternal.setDeviceStatus(8);
            } else if (status != 3 && status != 6 && status != 7 && deviceModelInternal != null && !deviceModelInternal.getIsConnectActive()) {
                deviceModelInternal.setDeviceStatus(9);
            } else if (deviceModelInternal != null) {
                deviceModelInternal.setDeviceStatus(status);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void switchDeviceWearMode(@NotNull String did, int mode, boolean fromApp) {
        qa6 deviceModelInternal;
        qa6 deviceModelInternal2;
        Intrinsics.checkNotNullParameter(did, "did");
        DeviceModelRemote currentDeviceModel = getCurrentDeviceModel();
        String did2 = currentDeviceModel != null ? currentDeviceModel.getDid() : null;
        Logger.i(TAG, "did= " + did + ",currentModel = " + did2 + " mDeviceModels=" + this.mDeviceModels);
        qa6 deviceModelInternal3 = getDeviceModelInternal(did);
        if (deviceModelInternal3 != null && deviceModelInternal3.getAccessoryMode() == mode) {
            Logger.i(TAG, "device already is mode " + mode);
            return;
        }
        if (mode == 0 && (deviceModelInternal2 = getDeviceModelInternal(did)) != null && !deviceModelInternal2.isAccessory()) {
            Logger.i(TAG, "model is not accessory,switch mode is BAND");
            return;
        }
        if (hasAccessoryMode(mode)) {
            Logger.i(TAG, "hasAccessoryMode mode = " + mode);
            RemoteCallbackList<f> remoteCallbackList = this.mAccessoryDeviceStateListener;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((f) broadcastItem).onAccessoryDeviceModeDuplicate(did, mode, fromApp);
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                    return;
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                    return;
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                    throw th;
                } catch (Exception e4) {
                    Logger.e("An exception occurred when finishBroadcast", e4);
                    throw th;
                }
            }
        }
        if (mode == 1) {
            DeviceModelRemote currentDeviceModel2 = getCurrentDeviceModel();
            if (Intrinsics.areEqual(did, currentDeviceModel2 != null ? currentDeviceModel2.getDid() : null)) {
                qa6 qa6Var = this.mDeviceModels.get(did);
                if (qa6Var != null) {
                    qa6Var.setAccessoryMode(mode);
                }
                DeviceModelRemote currentDeviceModel3 = getCurrentDeviceModel();
                String did3 = currentDeviceModel3 != null ? currentDeviceModel3.getDid() : null;
                Logger.i(TAG, "did= " + did + ",currentModel = " + did3 + " mDeviceModels=" + this.mDeviceModels + " ");
                List<Device> bindDeviceList = this.mDeviceContainer.getBindDeviceList();
                if (!bindDeviceList.isEmpty()) {
                    DeviceModelExtKt.logi(TAG, "switch pre device,devicelist " + bindDeviceList);
                    Iterator<Device> it = bindDeviceList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            deviceModelInternal = null;
                            break;
                        }
                        deviceModelInternal = getDeviceModelInternal(it.next().getDid());
                        if (!filteredCurrentDevice(deviceModelInternal)) {
                            DeviceModelExtKt.logi(TAG, "switchDeviceWearMode BEAN " + deviceModelInternal + ", filtered " + filteredCurrentDevice(deviceModelInternal));
                            break;
                        }
                    }
                    if (deviceModelInternal == null) {
                        DeviceModelExtKt.logi(TAG, "initCurrentDeviceModel: null ");
                        initCurrentDeviceModel(null);
                        DevicePreference devicePreference = DevicePreference.INSTANCE;
                        devicePreference.setCURRENT_DEVICE_ID("");
                        DeviceModelExtKt.logi(TAG, "DevicePreference.CURRENT_DEVICE_ID=" + devicePreference.getCURRENT_DEVICE_ID());
                    } else {
                        switchDevice(deviceModelInternal);
                    }
                } else {
                    DeviceModelExtKt.logi(TAG, "initCurrentDeviceModel: null");
                    initCurrentDeviceModel(null);
                    DevicePreference devicePreference2 = DevicePreference.INSTANCE;
                    devicePreference2.setCURRENT_DEVICE_ID("");
                    DeviceModelExtKt.logi(TAG, "DevicePreference.CURRENT_DEVICE_ID=" + devicePreference2.getCURRENT_DEVICE_ID());
                }
            }
        } else {
            DeviceModelRemote currentDeviceModel4 = getCurrentDeviceModel();
            Logger.i(TAG, "remove accessory mode = " + mode + ", current = " + (currentDeviceModel4 != null ? currentDeviceModel4.getDid() : null));
            qa6 deviceModelInternal4 = getDeviceModelInternal(did);
            if (deviceModelInternal4 != null) {
                deviceModelInternal4.setAccessoryMode(mode);
                DeviceModelRemote currentDeviceModel5 = getCurrentDeviceModel();
                if (currentDeviceModel5 != null && mode == 0 && !Intrinsics.areEqual(did, currentDeviceModel5.getDid())) {
                    deviceModelInternal4.disconnectDevice();
                }
            }
        }
        RemoteCallbackList<f> remoteCallbackList2 = this.mAccessoryDeviceStateListener;
        try {
            try {
                try {
                    int iBeginBroadcast2 = remoteCallbackList2.beginBroadcast();
                    for (int i2 = 0; i2 < iBeginBroadcast2; i2++) {
                        try {
                            IInterface broadcastItem2 = remoteCallbackList2.getBroadcastItem(i2);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem2, "getBroadcastItem(...)");
                            ((f) broadcastItem2).onAccessoryDeviceModeChange(did, mode, fromApp);
                        } catch (Exception e5) {
                            Logger.e("action(" + remoteCallbackList2.getBroadcastItem(i2) + ") throw exception", e5);
                        }
                    }
                    remoteCallbackList2.finishBroadcast();
                } catch (Exception e6) {
                    Logger.e("An exception occurred when finishBroadcast", e6);
                }
            } catch (Exception e7) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e7);
                remoteCallbackList2.finishBroadcast();
            }
        } catch (Throwable th2) {
            try {
                remoteCallbackList2.finishBroadcast();
                throw th2;
            } catch (Exception e8) {
                Logger.e("An exception occurred when finishBroadcast", e8);
                throw th2;
            }
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void unbindBloodSugarDevice(@NotNull final String did, @Nullable final l callback, boolean syncData) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "unbindBloodSugarDevice");
        ScopeExtKt.scopeNet$default(null, new C19551(did, syncData, callback, null), 1, null).m503catch(new Function2() { // from class: ca6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceManagerRemoteImpl.unbindBloodSugarDevice$lambda$25(callback, this, did, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void unbindDevice(@NotNull final String did, @Nullable final l callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        ScopeExtKt.scopeNet$default(null, new C19561(did, callback, null), 1, null).m503catch(new Function2() { // from class: aa6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceManagerRemoteImpl.unbindDevice$lambda$24(callback, this, did, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternal
    public void updateDevice(@NotNull WearableDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.mDeviceContainer.updateDeviceInfo(device);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    public void switchDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        switchDevice(getDeviceModelInternal(did));
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceSwitcher
    public void switchDevice(@Nullable WearableDeviceModel deviceModel) {
        DeviceModelExtKt.logi(TAG, "switchDevice() called with: deviceModel = " + deviceModel + ", " + (deviceModel != null ? Boolean.valueOf(deviceModel.getIsCurrent()) : null));
        if (deviceModel instanceof qa6) {
            switchDevice((qa6) deviceModel);
        } else if (deviceModel != null) {
            switchDevice(deviceModel.getDid());
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote, com.xiaomi.fitness.device.manager.c
    @Nullable
    public DeviceModelRemote findDeviceModel(@Nullable final d p) {
        qa6 qa6VarFindDeviceModel;
        if (p == null || (qa6VarFindDeviceModel = findDeviceModel(new Function1() { // from class: la6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeviceManagerRemoteImpl.findDeviceModel$lambda$28(p, (qa6) obj));
            }
        })) == null) {
            return null;
        }
        return qa6VarFindDeviceModel.getRemote();
    }

    public final void connect(boolean fromMainProcess, @NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        qa6 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal == null) {
            DeviceModelExtKt.loge(TAG, "Current deviceModel is null");
            return;
        }
        if (!fromMainProcess && deviceModelInternal.getIsCurrent() && DevicePreference.INSTANCE.getIN_BIND_NEW_MODE()) {
            DeviceModelExtKt.loge(TAG, "connect() current device in bind new mode");
        } else {
            ConnectSource.INSTANCE.setFromMainProcess(fromMainProcess);
            deviceModelInternal.connectDevice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceBinder getDeviceBinder(String did) {
        qa6 deviceModelInternal = getDeviceModelInternal(did);
        WearableDeviceInfo deviceInfo = deviceModelInternal != null ? deviceModelInternal.getDeviceInfo() : null;
        DeviceBinder deviceBinder = deviceInfo != null ? DeviceFactory.INSTANCE.getDeviceBinder(deviceInfo) : null;
        if (deviceBinder == null) {
            DeviceModelExtKt.loge(TAG, "Cannot find DeviceBinder(" + did + ") when unbound device");
        }
        return deviceBinder;
    }

    private final synchronized void initCurrentDeviceModel() {
        try {
            DevicePreference devicePreference = DevicePreference.INSTANCE;
            DeviceModelExtKt.logi("initCurrentDeviceModel current device is " + devicePreference.getCURRENT_DEVICE_ID());
            qa6 deviceModelInternal = getDeviceModelInternal(devicePreference.getCURRENT_DEVICE_ID());
            if (deviceModelInternal != null && !filteredCurrentDevice(deviceModelInternal)) {
                DeviceModelExtKt.logi(TAG, "initCurrentDeviceModel  use the exist device " + deviceModelInternal);
                initCurrentDeviceModel(deviceModelInternal);
            } else {
                List<Device> bindDeviceList = this.mDeviceContainer.getBindDeviceList();
                if (!bindDeviceList.isEmpty()) {
                    DeviceModelExtKt.logi(TAG, "initCurrentDeviceModel " + bindDeviceList);
                    Iterator<Device> it = bindDeviceList.iterator();
                    while (it.hasNext()) {
                        qa6 deviceModelInternal2 = getDeviceModelInternal(it.next().getDid());
                        DeviceModelExtKt.logi(TAG, "initCurrentDeviceModel " + deviceModelInternal2 + ", filtered " + filteredCurrentDevice(deviceModelInternal2));
                        if (!filteredCurrentDevice(deviceModelInternal2)) {
                            deviceModelInternal = deviceModelInternal2;
                            break;
                        }
                    }
                    initCurrentDeviceModel(deviceModelInternal);
                } else {
                    DeviceModelExtKt.logi(TAG, "initCurrentDeviceModel: null");
                    initCurrentDeviceModel(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
