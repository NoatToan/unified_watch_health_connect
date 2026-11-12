package com.xiaomi.fitness.rn.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.api.UiInjectApi;
import com.xiaomi.fitness.rn.export.DeviceShareManager;
import com.xiaomi.fitness.rn.export.DeviceShareManagerExtKt;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RnSettingsExportApi;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.export.extensions.RnSettingsExportApiExtKt;
import com.xiaomi.fitness.rn.extetions.RNLogKt;
import com.xiaomi.fitness.rn.sdk.RnPersistManager;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.smarthome.device.api.DeviceStat;
import defpackage.af8;
import defpackage.d0d;
import defpackage.rri;
import defpackage.yui;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0013\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004JG\u0010\u0015\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u0018\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u001aJ#\u0010\u0018\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJK\u0010\"\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u001bJ\u001f\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u001bJ)\u0010)\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u001aJ'\u0010+\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u001aJ#\u0010,\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b,\u0010\u001bJ#\u0010-\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b-\u0010\u001bJS\u00100\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010.\u001a\u0004\u0018\u00010\u00172\u0006\u0010/\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u00101J_\u00104\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00172\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00172\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J1\u00107\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u00108JA\u0010<\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b>\u0010\u0004J3\u0010@\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ'\u0010B\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\bB\u0010\u001aJ7\u0010C\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\bE\u0010FJ+\u0010H\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010G\u001a\u00020?H\u0016¢\u0006\u0004\bH\u0010IJ\u0089\u0001\u0010V\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010J\u001a\u0004\u0018\u00010\u00052\b\u0010K\u001a\u0004\u0018\u00010\u00052\b\u0010L\u001a\u0004\u0018\u00010\u00052\b\u0010M\u001a\u0004\u0018\u00010\u00052\b\u0010N\u001a\u0004\u0018\u00010\u00052\u0006\u0010O\u001a\u00020?2\u0006\u0010P\u001a\u00020?2\u0006\u0010Q\u001a\u00020\u000e2\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010T\u001a\u00020\u000e2\b\u0010U\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010X\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\bX\u0010\u001bJ5\u0010Y\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\bY\u00108J=\u0010Z\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\bZ\u0010[J\u0013\u0010\\\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\\\u0010\u0004J\u0013\u0010]\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b]\u0010\u0004J\u0013\u0010^\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b^\u0010\u0004J\u0013\u0010_\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b_\u0010\u0004J\u0013\u0010`\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b`\u0010\u0004J'\u0010a\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\ba\u0010bJ\u0013\u0010c\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\bc\u0010\u0004J\u0013\u0010d\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\bd\u0010\u0004J\u0013\u0010e\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\be\u0010\u0004J7\u0010g\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bg\u0010hJ-\u0010i\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bi\u0010jJ-\u0010k\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bk\u0010jJ\u0019\u0010l\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0004\bl\u0010mJ\u0019\u0010n\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0004\bn\u0010mJ\u0013\u0010o\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\bo\u0010\u0004J\u0013\u0010p\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\bp\u0010\u0004J\u0013\u0010q\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\bq\u0010\u0004J\u0013\u0010r\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\br\u0010\u0004J\u0013\u0010s\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\bs\u0010\u0004J\u0013\u0010t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\bt\u0010\u0004J\u0013\u0010u\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\bu\u0010\u0004J#\u0010v\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bv\u0010wJ#\u0010x\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bx\u0010wJ7\u0010y\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\by\u0010hJ\u0013\u0010z\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\bz\u0010\u0004J\u0013\u0010{\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b{\u0010\u0004J+\u0010|\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020?2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b~\u0010\u007fJ0\u0010\u0080\u0001\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001c\u0010\u0082\u0001\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J%\u0010\u0084\u0001\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0005\b\u0084\u0001\u0010\u001bJO\u0010\u008a\u0001\u001a\u00020\u00142\u0007\u0010\u0085\u0001\u001a\u00020\u000b2\u0007\u0010\u0086\u0001\u001a\u00020\u000e2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010%\u001a\u0004\u0018\u00010\u00052\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00052\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J[\u0010\u0090\u0001\u001a\u00020\u00142\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010O\u001a\u00020?2\b\u0010J\u001a\u0004\u0018\u00010\u00052\b\u0010K\u001a\u0004\u0018\u00010\u00052\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J4\u0010\u0096\u0001\u001a\u00030\u0095\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00052\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\u00058\u0002X\u0082D¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009c\u0001"}, d2 = {"Lcom/xiaomi/fitness/rn/api/UiInjectApi;", "Ld0d;", "Ljava/lang/Class;", "getDeviceLauncher2Class", "()Ljava/lang/Class;", "", "var1", "getAlarmVideoNormalPlayerActivityClass", "(Ljava/lang/String;)Ljava/lang/Class;", "getAlarmVideoPlayerActivityClass", "getCloudVideoDownloadActivityClass", "Landroid/app/Activity;", "Lcom/xiaomi/smarthome/device/api/DeviceStat;", "var2", "", "var3", "", "var4", "Landroid/os/Bundle;", "var5", "", "openAddIRController", "(Landroid/app/Activity;Lcom/xiaomi/smarthome/device/api/DeviceStat;I[Ljava/lang/String;Landroid/os/Bundle;)V", "Lcom/facebook/react/bridge/ReadableArray;", "openEditDeviceGroupPage", "(Landroid/app/Activity;Lcom/facebook/react/bridge/ReadableArray;)V", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/app/Activity;Ljava/lang/String;)V", "activtiy", "device", "title", "description", "imagePath", "url", "openShareListBar", "(Landroid/app/Activity;Lcom/xiaomi/smarthome/device/api/DeviceStat;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;)V", LifecycleConstantKt.TYPE_ACTIVITY, "did", "openShareDevicePage", "openRoomManagementPage", "desc", "openSecuritySetting", "model", "openHelpPage", "openAssociatePage", "openBtGatewayPage", "var6", "var7", "privacyAndProtocolReview", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V", "Lcom/facebook/react/bridge/Callback;", "var8", "openPrivacyLicense", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Callback;)V", "pid", "openDeleteDevice", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)V", "mac", "name", "callback", "openChangeDeviceName", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)V", "getTimezoneActivityClass", "", "openXiaoAiLearnPage", "(Landroid/app/Activity;Ljava/lang/String;ZZ)V", "openConnectSucceedPage", "openCurtainGroupNamePage", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "loadUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "fullScreen", "loadUrlSupportRedirect", "(Ljava/lang/String;Ljava/lang/String;Z)V", "agreementURL", "privacyURL", "experiencePlanURL", "privacyURLForChildren", "privacyURLForWatch", "hideAgreement", "hideUserExperiencePlan", AccountInteractActivity.KEY_REQUEST_CODE, "Lcom/facebook/react/bridge/ReadableMap;", "params", "privacyId", "revokePrivacyContent", "openDeclarationWithConfig", "(Landroid/app/Activity;Lcom/xiaomi/smarthome/device/api/DeviceStat;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILcom/facebook/react/bridge/ReadableMap;ILjava/lang/String;)V", "openOperationCommonWebView", "startPowerMultikeyActivity", "openChangeDeviceIconDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;II)V", "getLightGroupSettingV2ActivityClass", "getLightGroupSettingActivityClass", "getLightGroupManageActivityClass", "getPluginRecommendSceneActivityClass", "getDeviceNetworkInfoActivityClass", "getAlarmVideoActivityClass", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;", "getPlaybackVideoActivityClass", "getAlbumActivityClass", "getAlbumViewerActivityClass", "Landroid/content/Context;", "openCloudVideoBuyPage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "openCloudVideoManagePage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "openOperationBannerPage", "openMiHomeLoginPage", "(Landroid/content/Context;)V", "openMiHomeMainPage", "getNASInfoActivityClass", "getNASDiscoveryActivityClass", "getResetPageRouteClass", "getStereoSettingActivityClass", "getScanBarcodeActivityClass", "getScreenLinkageDeviceActivityClass", "getCreateSceneFromRecommendActivityClass", "openMainMicoPage", "(Landroid/content/Context;Ljava/lang/String;)V", "openVoiceCtrlDeviceAuthPage", "openNFCWriteActivityForOpenPlugin", "getTimerSettingActivityClass", "getLocalAlarmPlayerActivityClass", "writeNFCData", "(Landroid/app/Activity;Ljava/lang/String;I)V", "isSupportWriteNfc", "(Landroid/app/Activity;)Z", "isBatchConvertSceneVisisbleWith", "(Landroid/app/Activity;Ljava/lang/String;Lcom/facebook/react/bridge/Callback;)V", "openConvertScenePage", "(Landroid/app/Activity;)V", "openNFCWriteActivityForConnectTV", "currentActivity", "type", "testUrl", "testVersionName", "fileMd5", "goBleOtaDeviceUpdateActivity", "(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/content/Intent;", "intent", "showUserLicenseUriDialog", "(Landroid/app/Activity;Lcom/xiaomi/smarthome/device/api/DeviceStat;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/content/Intent;)V", CardUIInfo.KEY_SUBTITILE, "Ld0d$a;", "onExitListener", "Landroid/view/View;", "getLoadingRNView", "(Ljava/lang/String;Ljava/lang/String;Ld0d$a;)Landroid/view/View;", "TAG", "Ljava/lang/String;", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class UiInjectApi implements d0d {

    @NotNull
    private final String TAG = "UiInjectApi";

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.api.UiInjectApi$openChangeDeviceName$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.api.UiInjectApi$openChangeDeviceName$1", f = "UiInjectApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Callback $callback;
        final /* synthetic */ String $did;
        final /* synthetic */ String $name;
        int label;
        final /* synthetic */ UiInjectApi this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, String str, String str2, UiInjectApi uiInjectApi, Callback callback, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$did = str;
            this.$name = str2;
            this.this$0 = uiInjectApi;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(UiInjectApi uiInjectApi, String str, Callback callback, String str2) {
            if (str2 != null && str2.length() > 0) {
                Logger.i(uiInjectApi.TAG, "openChangeDeviceName(" + str + ") success-(" + str2 + ")");
                af8.a(str, str2, "1");
                if (callback != null) {
                    callback.invoke(str2);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, this.$did, this.$name, this.this$0, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RnSettingsExportApi rnSettingsExportApiExtKt = RnSettingsExportApiExtKt.getInstance(RnSettingsExportApi.INSTANCE);
            WeakReference<Activity> weakReference = new WeakReference<>(this.$activity);
            final String str = this.$did;
            String str2 = this.$name;
            final UiInjectApi uiInjectApi = this.this$0;
            final Callback callback = this.$callback;
            rnSettingsExportApiExtKt.showRenameDeviceDialog(weakReference, str, str2, new Function1() { // from class: com.xiaomi.fitness.rn.api.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return UiInjectApi.AnonymousClass1.invokeSuspend$lambda$0(uiInjectApi, str, callback, (String) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.api.UiInjectApi$openDeclarationWithConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.api.UiInjectApi$openDeclarationWithConfig$1", f = "UiInjectApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $agreementURL;
        final /* synthetic */ DeviceStat $device;
        final /* synthetic */ int $privacyId;
        final /* synthetic */ String $privacyURL;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ String $revokePrivacyContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28741(Activity activity, DeviceStat deviceStat, String str, String str2, String str3, int i, int i2, Continuation<? super C28741> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$device = deviceStat;
            this.$agreementURL = str;
            this.$privacyURL = str2;
            this.$revokePrivacyContent = str3;
            this.$requestCode = i;
            this.$privacyId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28741(this.$activity, this.$device, this.$agreementURL, this.$privacyURL, this.$revokePrivacyContent, this.$requestCode, this.$privacyId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RnSettingsExportApi rnSettingsExportApiExtKt = RnSettingsExportApiExtKt.getInstance(RnSettingsExportApi.INSTANCE);
            Activity activity = this.$activity;
            String did = this.$device.did;
            Intrinsics.checkNotNullExpressionValue(did, "did");
            rnSettingsExportApiExtKt.openLawPolicyPageForResult(activity, did, this.$device.pid, this.$agreementURL, this.$privacyURL, this.$revokePrivacyContent, this.$requestCode, this.$privacyId);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.api.UiInjectApi$openDeleteDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.api.UiInjectApi$openDeleteDevice$1", f = "UiInjectApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $did;
        final /* synthetic */ int $pid;
        final /* synthetic */ String $title;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28751(Activity activity, String str, String str2, int i, Continuation<? super C28751> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$title = str;
            this.$did = str2;
            this.$pid = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(WeakReference weakReference, boolean z) {
            Activity activity;
            if (z && (activity = (Activity) weakReference.get()) != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28751(this.$activity, this.$title, this.$did, this.$pid, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final WeakReference<Activity> weakReference = new WeakReference<>(this.$activity);
            RnSettingsExportApiExtKt.getInstance(RnSettingsExportApi.INSTANCE).showDeleteDeviceDialog(weakReference, this.$title, this.$did, this.$pid, new Function1() { // from class: com.xiaomi.fitness.rn.api.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return UiInjectApi.C28751.invokeSuspend$lambda$0(weakReference, ((Boolean) obj2).booleanValue());
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.api.UiInjectApi$openHelpPage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.api.UiInjectApi$openHelpPage$1", f = "UiInjectApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28761(Activity activity, Continuation<? super C28761> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28761(this.$activity, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE).launchFeedback(this.$activity);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.api.UiInjectApi$openShareDevicePage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.api.UiInjectApi$openShareDevicePage$1", f = "UiInjectApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28771(Activity activity, String str, Continuation<? super C28771> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28771(this.$activity, this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceShareManagerExtKt.getInstance(DeviceShareManager.INSTANCE).gotoDeviceShareDetailActivity(this.$activity, this.$did);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.api.UiInjectApi$showUserLicenseUriDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.api.UiInjectApi$showUserLicenseUriDialog$1", f = "UiInjectApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $agreementURL;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ DeviceStat $device;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ View.OnClickListener $onClickListener;
        final /* synthetic */ String $privacyChangedContext;
        final /* synthetic */ String $privacyURL;
        int label;
        final /* synthetic */ UiInjectApi this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28781(Activity activity, DeviceStat deviceStat, String str, String str2, String str3, Intent intent, UiInjectApi uiInjectApi, View.OnClickListener onClickListener, Continuation<? super C28781> continuation) {
            super(2, continuation);
            this.$currentActivity = activity;
            this.$device = deviceStat;
            this.$agreementURL = str;
            this.$privacyURL = str2;
            this.$privacyChangedContext = str3;
            this.$intent = intent;
            this.this$0 = uiInjectApi;
            this.$onClickListener = onClickListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(Intent intent, final UiInjectApi uiInjectApi, final DeviceStat deviceStat, View.OnClickListener onClickListener, Activity activity, WeakReference weakReference, boolean z) {
            if (z) {
                String stringExtra = intent != null ? intent.getStringExtra("privacy_version") : null;
                int intExtra = intent != null ? intent.getIntExtra("privacy_id", 0) : 0;
                Logger.i(uiInjectApi.TAG, "showUserLicenseUriDialog, agree (" + stringExtra + ")," + deviceStat.did + ",privacyId:" + intExtra);
                RnPersistManager rnPersistManager = RnPersistManager.INSTANCE;
                String did = deviceStat.did;
                Intrinsics.checkNotNullExpressionValue(did, "did");
                rnPersistManager.setNativePrivacyConfirmationVersion(did, stringExtra);
                if (onClickListener != null) {
                    onClickListener.onClick(new View(activity));
                }
                RNDeviceManager rNDeviceManagerExtKt = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE);
                String did2 = deviceStat.did;
                Intrinsics.checkNotNullExpressionValue(did2, "did");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                rNDeviceManagerExtKt.acceptPrivacy(did2, intExtra, stringExtra, new Function1() { // from class: com.xiaomi.fitness.rn.api.c
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return UiInjectApi.C28781.invokeSuspend$lambda$2$lambda$0(uiInjectApi, deviceStat, ((Boolean) obj).booleanValue());
                    }
                }, new Function1() { // from class: com.xiaomi.fitness.rn.api.d
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return UiInjectApi.C28781.invokeSuspend$lambda$2$lambda$1(uiInjectApi, deviceStat, (ApiException) obj);
                    }
                });
            } else {
                Activity activity2 = (Activity) weakReference.get();
                if (activity2 != null) {
                    activity2.finish();
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$0(UiInjectApi uiInjectApi, DeviceStat deviceStat, boolean z) {
            Logger.i(uiInjectApi.TAG, "acceptPrivacy(" + deviceStat + ".did): onSuccess(" + z + ")");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$1(UiInjectApi uiInjectApi, DeviceStat deviceStat, ApiException apiException) {
            Logger.w(uiInjectApi.TAG, "acceptPrivacy(" + deviceStat.did + "): onFail(code=" + apiException.getErrorCode() + ")", apiException);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28781(this.$currentActivity, this.$device, this.$agreementURL, this.$privacyURL, this.$privacyChangedContext, this.$intent, this.this$0, this.$onClickListener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final WeakReference<Activity> weakReference = new WeakReference<>(this.$currentActivity);
            RnSettingsExportApi rnSettingsExportApiExtKt = RnSettingsExportApiExtKt.getInstance(RnSettingsExportApi.INSTANCE);
            String name = this.$device.name;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            String str = this.$agreementURL;
            String str2 = this.$privacyURL;
            String str3 = this.$privacyChangedContext;
            final Intent intent = this.$intent;
            final UiInjectApi uiInjectApi = this.this$0;
            final DeviceStat deviceStat = this.$device;
            final View.OnClickListener onClickListener = this.$onClickListener;
            final Activity activity = this.$currentActivity;
            rnSettingsExportApiExtKt.showUserLicenseUriDialog(weakReference, name, str, str2, str3, new Function1() { // from class: com.xiaomi.fitness.rn.api.e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return UiInjectApi.C28781.invokeSuspend$lambda$2(intent, uiInjectApi, deviceStat, onClickListener, activity, weakReference, ((Boolean) obj2).booleanValue());
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLoadingRNView$lambda$2(d0d.a aVar, View view) {
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getAlarmVideoActivityClass(@Nullable String var1, @Nullable String var2) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getAlarmVideoNormalPlayerActivityClass(@Nullable String var1) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getAlarmVideoPlayerActivityClass(@Nullable String var1) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getAlbumActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getAlbumViewerActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getCloudVideoDownloadActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getCreateSceneFromRecommendActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getDeviceLauncher2Class() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getDeviceNetworkInfoActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getLightGroupManageActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getLightGroupSettingActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getLightGroupSettingV2ActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public View getLoadingRNView(@Nullable String title, @Nullable String subTitle, @Nullable final d0d.a onExitListener) {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(yui.f40582a, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(rri.f)).setText("");
        ((ImageView) viewInflate.findViewById(rri.f32829a)).setOnClickListener(new View.OnClickListener() { // from class: u8q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UiInjectApi.getLoadingRNView$lambda$2(onExitListener, view);
            }
        });
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getLocalAlarmPlayerActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getNASDiscoveryActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getNASInfoActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getPlaybackVideoActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getPluginRecommendSceneActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getResetPageRouteClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getScanBarcodeActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getScreenLinkageDeviceActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getStereoSettingActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getTimerSettingActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    @NotNull
    public Class<?> getTimezoneActivityClass() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    public void goBleOtaDeviceUpdateActivity(@NotNull Activity currentActivity, int type, @Nullable String testUrl, @Nullable String did, @Nullable String testVersionName, @Nullable String fileMd5) {
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        RNLogKt.logi(this.TAG, "goBleOtaDeviceUpdateActivity " + type + "  " + testUrl + " " + did + " " + testVersionName + " " + fileMd5);
        if (did != null) {
            RnSettingsExportApiExtKt.getInstance(RnSettingsExportApi.INSTANCE).gotoOtaUpdateActivity(currentActivity, did, type);
        }
    }

    @Override // defpackage.d0d
    public void isBatchConvertSceneVisisbleWith(@Nullable Activity var1, @Nullable String var2, @Nullable Callback var3) {
        ToastUtil.showLongToast("isBatchConvertSceneVisisbleWith");
    }

    @Override // defpackage.d0d
    public boolean isSupportWriteNfc(@Nullable Activity var1) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    public void loadUrl(@NotNull String url, @NotNull String title) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        WebViewUtilKt.startWebView$default(url, title, false, false, null, false, null, false, 252, null);
    }

    @Override // defpackage.d0d
    public void loadUrlSupportRedirect(@Nullable String url, @Nullable String title, boolean fullScreen) {
        ToastUtil.showLongToast("loadUrlSupportRedirect");
    }

    @Override // defpackage.d0d
    public void openAddIRController(@Nullable Activity var1, @Nullable DeviceStat var2, int var3, @Nullable String[] var4, @Nullable Bundle var5) {
        ToastUtil.showLongToast("openAddIRController");
    }

    @Override // defpackage.d0d
    public void openAssociatePage(@Nullable Activity var1, @Nullable String var2) {
        ToastUtil.showLongToast("openAssociatePage");
    }

    @Override // defpackage.d0d
    public void openBtGatewayPage(@Nullable Activity var1, @Nullable String var2) {
        ToastUtil.showLongToast("openBtGatewayPage");
    }

    @Override // defpackage.d0d
    public void openChangeDeviceIconDialog(@Nullable Activity var1, @Nullable String var2, @Nullable String var3, int var4, int var5) {
        ToastUtil.showLongToast("openChangeDeviceIconDialog");
    }

    @Override // defpackage.d0d
    public void openChangeDeviceName(@NotNull Activity activity, @NotNull String did, @NotNull String mac, int pid, @NotNull String name, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(name, "name");
        AnyExtKt.main$default(null, new AnonymousClass1(activity, did, name, this, callback, null), 1, null);
    }

    @Override // defpackage.d0d
    public void openCloudVideoBuyPage(@Nullable Context var1, @Nullable String var2, @Nullable String var3, @Nullable String var4) {
        ToastUtil.showLongToast("openCloudVideoBuyPage");
    }

    @Override // defpackage.d0d
    public void openCloudVideoManagePage(@Nullable Context var1, @Nullable String var2, @Nullable String var3) {
        ToastUtil.showLongToast("openCloudVideoManagePage");
    }

    @Override // defpackage.d0d
    public void openConnectSucceedPage(@NotNull Activity activity, @NotNull String model, @NotNull String did) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        ToastUtil.showLongToast("openConnectSucceedPage");
    }

    @Override // defpackage.d0d
    public void openConvertScenePage(@Nullable Activity var1) {
        ToastUtil.showLongToast("openConvertScenePage");
    }

    @Override // defpackage.d0d
    public void openCurtainGroupNamePage(@Nullable Activity var1, @Nullable String var2, @Nullable String var3, @Nullable String var4) {
        ToastUtil.showLongToast("openCurtainGroupNamePage");
    }

    @Override // defpackage.d0d
    public void openDeclarationWithConfig(@Nullable Activity activity, @Nullable DeviceStat device, @Nullable String agreementURL, @Nullable String privacyURL, @Nullable String experiencePlanURL, @Nullable String privacyURLForChildren, @Nullable String privacyURLForWatch, boolean hideAgreement, boolean hideUserExperiencePlan, int requestCode, @Nullable ReadableMap params, int privacyId, @Nullable String revokePrivacyContent) {
        Logger.i(this.TAG, "openDeclarationWithConfig(did=" + (device != null ? device.did : null) + ",pid=" + (device != null ? Integer.valueOf(device.pid) : null) + ",privacyId=" + privacyId + "), hideAgreement=" + hideAgreement + ", agreementURL = " + agreementURL + ", privacyURL=" + privacyURL);
        if (activity == null || device == null || privacyURL == null) {
            return;
        }
        if (hideAgreement || agreementURL != null) {
            AnyExtKt.main$default(null, new C28741(activity, device, agreementURL, privacyURL, revokePrivacyContent, requestCode, privacyId, null), 1, null);
        }
    }

    @Override // defpackage.d0d
    public void openDeleteDevice(@NotNull Activity activity, @Nullable String title, @NotNull String did, int pid) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(did, "did");
        AnyExtKt.main$default(null, new C28751(activity, title, did, pid, null), 1, null);
    }

    @Override // defpackage.d0d
    public void openEditDeviceGroupPage(@Nullable Activity var1, @Nullable ReadableArray var2) {
        ToastUtil.showLongToast("openEditDeviceGroupPage");
    }

    @Override // defpackage.d0d
    public void openHelpPage(@NotNull Activity activity, @NotNull String model, @NotNull String did) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        AnyExtKt.main$default(null, new C28761(activity, null), 1, null);
    }

    @Override // defpackage.d0d
    public void openMainMicoPage(@Nullable Context var1, @Nullable String var2) {
        ToastUtil.showLongToast("openMainMicoPage");
    }

    @Override // defpackage.d0d
    public void openMiHomeLoginPage(@Nullable Context var1) {
        ToastUtil.showLongToast("openMiHomeLoginPage");
    }

    @Override // defpackage.d0d
    public void openMiHomeMainPage(@Nullable Context var1) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.d0d
    public void openNFCWriteActivityForConnectTV(@Nullable Activity var1, @Nullable String var2) {
        ToastUtil.showLongToast("openNFCWriteActivityForConnectTV");
    }

    @Override // defpackage.d0d
    public void openNFCWriteActivityForOpenPlugin(@Nullable Context var1, @Nullable String var2, @Nullable String var3, @Nullable String var4) {
        ToastUtil.showLongToast("openNFCWriteActivityForOpenPlugin");
    }

    @Override // defpackage.d0d
    public void openOperationBannerPage(@Nullable Context var1, @Nullable String var2, @Nullable String var3) {
        ToastUtil.showLongToast("openOperationBannerPage");
    }

    @Override // defpackage.d0d
    public void openOperationCommonWebView(@NotNull Activity activity, @NotNull String url) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(url, "url");
        WebViewUtilKt.startWebView$default(url, null, false, false, null, false, null, false, 254, null);
    }

    @Override // defpackage.d0d
    public void openPrivacyLicense(@Nullable Activity var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @Nullable ReadableArray var5, @Nullable String var6, @Nullable ReadableArray var7, @Nullable Callback var8) {
        ToastUtil.showLongToast("openPrivacyLicense");
    }

    @Override // defpackage.d0d
    public void openRoomManagementPage(@NotNull Activity activity, @NotNull String did) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(did, "did");
        ToastUtil.showLongToast("openRoomManagementPage");
    }

    @Override // defpackage.d0d
    public void openSecuritySetting(@NotNull Activity activity, @Nullable String did, @NotNull String desc) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(desc, "desc");
        ToastUtil.showLongToast("openSecuritySetting");
    }

    @Override // defpackage.d0d
    public void openShareDevicePage(@NotNull Activity activity, @NotNull String did) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(did, "did");
        AnyExtKt.main$default(null, new C28771(activity, did, null), 1, null);
    }

    @Override // defpackage.d0d
    public void openShareListBar(@Nullable Activity activtiy, @Nullable DeviceStat device, @Nullable String title, @Nullable String description, @Nullable ReadableArray imagePath, @Nullable String url) {
        Logger.i(this.TAG, "openShareListBar: imagePath(" + imagePath + "), url(" + url + ")");
        if (activtiy != null) {
            ReadableMap map = imagePath != null ? imagePath.getMap(0) : null;
            String string = map != null ? map.getString(SportRecordBundleKey.BUNDLE_PARAM_URI) : null;
            if (string != null && string.length() != 0) {
                RnSettingsExportApiExtKt.getInstance(RnSettingsExportApi.INSTANCE).openShareBitmapWindow(new WeakReference<>(activtiy), title, description, string);
                return;
            }
            Logger.w(this.TAG, "no path:(" + map + ")");
        }
    }

    @Override // defpackage.d0d
    public void openVoiceCtrlDeviceAuthPage(@Nullable Context var1, @Nullable String var2) {
        ToastUtil.showLongToast("openVoiceCtrlDeviceAuthPage");
    }

    @Override // defpackage.d0d
    public void openXiaoAiLearnPage(@Nullable Activity var1, @Nullable String var2, boolean var3, boolean var4) {
        ToastUtil.showLongToast("openXiaoAiLearnPage");
    }

    @Override // defpackage.d0d
    public void privacyAndProtocolReview(@Nullable Activity var1, @Nullable String var2, @Nullable String var3, @Nullable ReadableArray var4, @Nullable String var5, @Nullable ReadableArray var6, int var7) {
        ToastUtil.showLongToast("privacyAndProtocolReview");
    }

    @Override // defpackage.d0d
    public void showUserLicenseUriDialog(@Nullable Activity currentActivity, @Nullable DeviceStat device, boolean hideAgreement, @Nullable String agreementURL, @Nullable String privacyURL, @Nullable View.OnClickListener onClickListener, @Nullable Intent intent) {
        Logger.i(this.TAG, "showUserLicenseUriDialog, hideAgreement=" + hideAgreement + ", agreementURL = " + agreementURL + ", privacyURL=" + privacyURL);
        if (currentActivity == null || device == null || privacyURL == null) {
            return;
        }
        if (hideAgreement || agreementURL != null) {
            AnyExtKt.main$default(null, new C28781(currentActivity, device, agreementURL, privacyURL, intent != null ? intent.getStringExtra("privacy_content_changed") : null, intent, this, onClickListener, null), 1, null);
        }
    }

    @Override // defpackage.d0d
    public void startPowerMultikeyActivity(@Nullable Activity var1, @Nullable String var2, @Nullable String var3, int var4) {
        ToastUtil.showLongToast("startPowerMultikeyActivity");
    }

    @Override // defpackage.d0d
    public void writeNFCData(@Nullable Activity var1, @Nullable String var2, int var3) {
        ToastUtil.showLongToast("writeNFCData");
    }

    @Override // defpackage.d0d
    public void openEditDeviceGroupPage(@Nullable Activity var1, @Nullable String var2, @Nullable String var3) {
        ToastUtil.showLongToast("openEditDeviceGroupPage");
    }

    @Override // defpackage.d0d
    public void openEditDeviceGroupPage(@Nullable Activity var1, @Nullable String var2) {
        ToastUtil.showLongToast("openEditDeviceGroupPage");
    }
}
