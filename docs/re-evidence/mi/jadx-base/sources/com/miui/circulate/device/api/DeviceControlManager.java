package com.miui.circulate.device.api;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 12\u00020\u0001:\u000512345B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\bH\u0002J \u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020 H\u0002J\u0010\u0010)\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0017H\u0007J \u0010)\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020&J\u001a\u0010)\u001a\u00020 2\b\b\u0002\u0010*\u001a\u00020+2\u0006\u0010#\u001a\u00020\u0017H\u0007J*\u0010)\u001a\u00020 2\b\b\u0002\u0010*\u001a\u00020+2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020&J\u0010\u0010,\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0013H\u0002J\u0010\u0010-\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0017H\u0007J\u0016\u0010-\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0013J\u0010\u0010.\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0013H\u0002J\b\u0010/\u001a\u00020 H\u0002J\f\u00100\u001a\u00020\u0013*\u00020\bH\u0002R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/miui/circulate/device/api/DeviceControlManager;", "", "ctx", "Landroid/content/Context;", "looper", "Landroid/os/Looper;", "uriList", "", "Landroid/net/Uri;", "(Landroid/content/Context;Landroid/os/Looper;Ljava/util/List;)V", "observerRegister", "Lcom/miui/circulate/device/api/ObserverRegister;", "resolver", "Landroid/content/ContentResolver;", "(Landroid/content/Context;Landroid/os/Looper;Ljava/util/List;Lcom/miui/circulate/device/api/ObserverRegister;Landroid/content/ContentResolver;)V", "callback", "Lcom/miui/circulate/device/api/DeviceControlManager$HandlerCallback;", "deviceControlCache", "Ljava/util/LinkedHashMap;", "", "Lcom/miui/circulate/device/api/DeviceInfo;", "Lkotlin/collections/LinkedHashMap;", "deviceReceiver", "Lcom/miui/circulate/device/api/DeviceControlReceiver;", "handler", "Landroid/os/Handler;", "listObservers", "Ljava/util/ArrayList;", "Landroid/database/ContentObserver;", "Lkotlin/collections/ArrayList;", "updateObserver", "fillCache", "", "sourceUri", "handleStart", "receiver", "from", "search", "", "handleStop", "registerObserver", StatConstants.PARAM_START, "delay", "", "startInstantSearch", BroadcastsKt.SILENT_PUSHING_STOP, "stopInstantSearch", "unregisterObserver", "id", "Companion", "DefaultObserverRegister", "HandlerCallback", "ListContentObserver", "UpdateObserver", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceControlManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceControlManager.kt\ncom/miui/circulate/device/api/DeviceControlManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,325:1\n1#2:326\n1855#3,2:327\n1855#3,2:329\n1855#3:331\n1855#3,2:332\n1856#3:334\n37#4,2:335\n37#4,2:337\n*S KotlinDebug\n*F\n+ 1 DeviceControlManager.kt\ncom/miui/circulate/device/api/DeviceControlManager\n*L\n166#1:327,2\n175#1:329,2\n199#1:331\n203#1:332,2\n199#1:334\n231#1:335,2\n245#1:337,2\n*E\n"})
public final class DeviceControlManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MSG_START = 1;

    @Deprecated
    public static final int MSG_STOP = 2;

    @NotNull
    private final HandlerCallback callback;

    @NotNull
    private final Context ctx;

    @NotNull
    private final LinkedHashMap<String, DeviceInfo> deviceControlCache;

    @Nullable
    private DeviceControlReceiver deviceReceiver;

    @NotNull
    private final Handler handler;

    @NotNull
    private final ArrayList<ContentObserver> listObservers;

    @NotNull
    private final ObserverRegister observerRegister;

    @NotNull
    private final ContentResolver resolver;

    @Nullable
    private ContentObserver updateObserver;

    @NotNull
    private final List<Uri> uriList;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/miui/circulate/device/api/DeviceControlManager$Companion;", "", "()V", "MSG_START", "", "MSG_STOP", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/miui/circulate/device/api/DeviceControlManager$DefaultObserverRegister;", "Lcom/miui/circulate/device/api/ObserverRegister;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "registerContentObserver", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "notifyForDescendants", "", "observer", "Landroid/database/ContentObserver;", "unregisterContentObserver", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultObserverRegister implements ObserverRegister {

        @NotNull
        private final Context ctx;

        public DefaultObserverRegister(@NotNull Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            this.ctx = ctx;
        }

        @Override // com.miui.circulate.device.api.ObserverRegister
        @NotNull
        public Map<Uri, ObserverRegister.ContentObserverDesc> activeObservers() {
            return ObserverRegister.DefaultImpls.activeObservers(this);
        }

        @Override // com.miui.circulate.device.api.ObserverRegister
        public void registerContentObserver(@NotNull Uri uri, boolean notifyForDescendants, @NotNull ContentObserver observer) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.ctx.getContentResolver().registerContentObserver(uri, notifyForDescendants, observer);
        }

        @Override // com.miui.circulate.device.api.ObserverRegister
        public void unregisterContentObserver(@NotNull ContentObserver observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.ctx.getContentResolver().unregisterContentObserver(observer);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/miui/circulate/device/api/DeviceControlManager$HandlerCallback;", "Landroid/os/Handler$Callback;", "(Lcom/miui/circulate/device/api/DeviceControlManager;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class HandlerCallback implements Handler.Callback {
        public HandlerCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            String string = msg.getData().getString("from");
            int i = msg.what;
            if (i == 1) {
                boolean z = msg.getData().getBoolean("search", true);
                DeviceControlManager deviceControlManager = DeviceControlManager.this;
                Object obj = msg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.miui.circulate.device.api.DeviceControlReceiver");
                DeviceControlReceiver deviceControlReceiver = (DeviceControlReceiver) obj;
                if (string == null) {
                    string = "";
                }
                deviceControlManager.handleStart(deviceControlReceiver, string, z);
            } else if (i == 2) {
                DeviceControlManager deviceControlManager2 = DeviceControlManager.this;
                Object obj2 = msg.obj;
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.miui.circulate.device.api.DeviceControlReceiver");
                DeviceControlReceiver deviceControlReceiver2 = (DeviceControlReceiver) obj2;
                if (string == null) {
                    string = "";
                }
                deviceControlManager2.handleStop(deviceControlReceiver2, string);
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/miui/circulate/device/api/DeviceControlManager$ListContentObserver;", "Landroid/database/ContentObserver;", "(Lcom/miui/circulate/device/api/DeviceControlManager;)V", "onChange", "", "selfChange", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ListContentObserver extends ContentObserver {
        public ListContentObserver() {
            super(DeviceControlManager.this.handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, @Nullable Uri uri) {
            super.onChange(selfChange, uri);
            StringBuilder sb = new StringBuilder();
            sb.append("onChange uri=");
            sb.append(uri);
            DeviceControlManager.this.fillCache(uri);
            DeviceControlReceiver deviceControlReceiver = DeviceControlManager.this.deviceReceiver;
            if (deviceControlReceiver != null) {
                List<DeviceInfo> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(DeviceControlManager.this.deviceControlCache.values()));
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(ArrayLi…viceControlCache.values))");
                deviceControlReceiver.onDeviceListChange(listUnmodifiableList);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/miui/circulate/device/api/DeviceControlManager$UpdateObserver;", "Landroid/database/ContentObserver;", "(Lcom/miui/circulate/device/api/DeviceControlManager;)V", "onChange", "", "selfChange", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class UpdateObserver extends ContentObserver {
        public UpdateObserver() {
            super(DeviceControlManager.this.handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, @Nullable Uri uri) {
            Cursor cursorQuery;
            super.onChange(selfChange, uri);
            if (uri != null) {
                DeviceControlManager deviceControlManager = DeviceControlManager.this;
                String strId = deviceControlManager.id(uri);
                if (deviceControlManager.deviceControlCache.containsKey(strId) && (cursorQuery = deviceControlManager.resolver.query(uri, null, null, null, null)) != null) {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        if (cursor2.getCount() > 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(StringsKt___StringsKt.take(strId, 3));
                            sb.append(" update");
                            cursor2.moveToFirst();
                            DeviceInfo deviceInfo = DeviceInfo_BindEntityParserKt.parseDeviceInfo(cursor2);
                            if (deviceInfo != null) {
                                deviceControlManager.deviceControlCache.put(deviceInfo.getId(), deviceInfo);
                                DeviceControlReceiver deviceControlReceiver = deviceControlManager.deviceReceiver;
                                if (deviceControlReceiver != null) {
                                    deviceControlReceiver.onDeviceChange(deviceInfo);
                                }
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(cursor, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(cursor, th);
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceControlManager(@NotNull Context ctx, @NotNull Looper looper, @NotNull List<? extends Uri> uriList, @NotNull ObserverRegister observerRegister, @NotNull ContentResolver resolver) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(uriList, "uriList");
        Intrinsics.checkNotNullParameter(observerRegister, "observerRegister");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.ctx = ctx;
        this.uriList = uriList;
        this.observerRegister = observerRegister;
        this.resolver = resolver;
        HandlerCallback handlerCallback = new HandlerCallback();
        this.callback = handlerCallback;
        this.handler = new Handler(looper, handlerCallback);
        this.deviceControlCache = new LinkedHashMap<>();
        this.listObservers = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    public final void fillCache(Uri sourceUri) {
        Uri uri;
        Uri uriBuild;
        this.deviceControlCache.clear();
        for (Uri uri2 : this.uriList) {
            if (sourceUri == null) {
                uri = uri2;
            } else {
                if (StringsKt__StringsJVMKt.equals$default(uri2.getPath(), sourceUri.getPath(), false, 2, null)) {
                    Set<String> queryParameterNames = sourceUri.getQueryParameterNames();
                    Intrinsics.checkNotNullExpressionValue(queryParameterNames, "queryParameterNames");
                    uriBuild = null;
                    for (String str : queryParameterNames) {
                        uriBuild = uri2.buildUpon().appendQueryParameter(str, sourceUri.getQueryParameter(str)).build();
                    }
                } else {
                    uriBuild = uri2;
                }
                if (uriBuild == null) {
                    uri = uri2;
                } else {
                    uri = uriBuild;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("fillCache finalUri = ");
            sb.append(uri);
            Cursor cursorQuery = this.resolver.query(uri, null, null, null, null);
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("load ");
                    sb2.append(cursor2.getCount());
                    sb2.append(" device from cache");
                    while (cursor2.moveToNext()) {
                        DeviceInfo deviceInfo = DeviceInfo_BindEntityParserKt.parseDeviceInfo(cursor2);
                        if (deviceInfo != null) {
                            this.deviceControlCache.put(deviceInfo.getId(), deviceInfo);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(cursor, th);
                        throw th2;
                    }
                }
            }
        }
    }

    public static /* synthetic */ void fillCache$default(DeviceControlManager deviceControlManager, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = null;
        }
        deviceControlManager.fillCache(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStart(DeviceControlReceiver receiver, String from, boolean search) {
        if (this.deviceReceiver != null) {
            this.deviceReceiver = receiver;
            fillCache$default(this, null, 1, null);
            DeviceControlReceiver deviceControlReceiver = this.deviceReceiver;
            if (deviceControlReceiver != null) {
                List<DeviceInfo> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(this.deviceControlCache.values()));
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(ArrayLi…viceControlCache.values))");
                deviceControlReceiver.onDeviceListChange(listUnmodifiableList);
                return;
            }
            return;
        }
        this.deviceReceiver = receiver;
        fillCache$default(this, null, 1, null);
        registerObserver();
        DeviceControlReceiver deviceControlReceiver2 = this.deviceReceiver;
        if (deviceControlReceiver2 != null) {
            List<DeviceInfo> listUnmodifiableList2 = Collections.unmodifiableList(new ArrayList(this.deviceControlCache.values()));
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList2, "unmodifiableList(ArrayLi…viceControlCache.values))");
            deviceControlReceiver2.onDeviceListChange(listUnmodifiableList2);
        }
        if (search) {
            startInstantSearch(from);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStop(DeviceControlReceiver receiver, String from) {
        Intrinsics.areEqual(receiver, this.deviceReceiver);
        this.deviceReceiver = null;
        unregisterObserver();
        stopInstantSearch(from);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String id(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return lastPathSegment == null ? "" : lastPathSegment;
    }

    private final void registerObserver() {
        try {
            for (Uri uri : this.uriList) {
                ListContentObserver listContentObserver = new ListContentObserver();
                this.observerRegister.registerContentObserver(uri, false, listContentObserver);
                this.listObservers.add(listContentObserver);
            }
            UpdateObserver updateObserver = new UpdateObserver();
            this.observerRegister.registerContentObserver(Constant.INSTANCE.getDEVICE_META_LIST_URI(), true, updateObserver);
            this.updateObserver = updateObserver;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void start$default(DeviceControlManager deviceControlManager, long j, DeviceControlReceiver deviceControlReceiver, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = TimeUnit.SECONDS.toMillis(3L);
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = true;
        }
        deviceControlManager.start(j2, deviceControlReceiver, str, z);
    }

    private final void startInstantSearch(String from) {
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(Constant.QueryParameter.SEARCH_URI_LIST, (Parcelable[]) this.uriList.toArray(new Uri[0]));
            if (from.length() > 0) {
                bundle.putString("from", from);
            }
            this.resolver.call(Constant.INSTANCE.getMETHOD_CALL(), Constant.METHOD_START_SEARCH, (String) null, bundle);
        } catch (Exception unused) {
        }
    }

    private final void stopInstantSearch(String from) {
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(Constant.QueryParameter.SEARCH_URI_LIST, (Parcelable[]) this.uriList.toArray(new Uri[0]));
            if (from.length() > 0) {
                bundle.putString("from", from);
            }
            this.resolver.call(Constant.INSTANCE.getMETHOD_CALL(), Constant.METHOD_STOP_SEARCH, (String) null, bundle);
        } catch (Exception unused) {
        }
    }

    private final void unregisterObserver() {
        try {
            Iterator<T> it = this.listObservers.iterator();
            while (it.hasNext()) {
                this.observerRegister.unregisterContentObserver((ContentObserver) it.next());
            }
            ContentObserver contentObserver = this.updateObserver;
            if (contentObserver != null) {
                this.observerRegister.unregisterContentObserver(contentObserver);
            }
        } catch (Exception unused) {
        }
    }

    public final void start(long delay, @NotNull DeviceControlReceiver receiver, @NotNull String from, boolean search) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(from, "from");
        this.handler.removeMessages(1);
        Message messageObtain = Message.obtain(this.handler);
        messageObtain.what = 1;
        messageObtain.obj = receiver;
        Bundle bundle = new Bundle();
        bundle.putString("from", from);
        bundle.putBoolean("search", search);
        messageObtain.setData(bundle);
        this.handler.sendMessageDelayed(messageObtain, delay);
    }

    public final void stop(@NotNull DeviceControlReceiver receiver, @NotNull String from) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(from, "from");
        this.handler.removeMessages(1);
        Message messageObtain = Message.obtain(this.handler);
        messageObtain.what = 2;
        messageObtain.obj = receiver;
        Bundle bundle = new Bundle();
        bundle.putString("from", from);
        messageObtain.setData(bundle);
        this.handler.sendMessage(messageObtain);
    }

    public static /* synthetic */ void start$default(DeviceControlManager deviceControlManager, long j, DeviceControlReceiver deviceControlReceiver, int i, Object obj) {
        if ((i & 1) != 0) {
            j = TimeUnit.SECONDS.toMillis(3L);
        }
        deviceControlManager.start(j, deviceControlReceiver);
    }

    public static /* synthetic */ void start$default(DeviceControlManager deviceControlManager, DeviceControlReceiver deviceControlReceiver, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        deviceControlManager.start(deviceControlReceiver, str, z);
    }

    @Deprecated(message = "add param from", replaceWith = @ReplaceWith(expression = "stop(receiver: DeviceControlReceiver, from: String)", imports = {}))
    public final void stop(@NotNull DeviceControlReceiver receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.handler.removeMessages(1);
        Message messageObtain = Message.obtain(this.handler);
        messageObtain.what = 2;
        messageObtain.obj = receiver;
        this.handler.sendMessage(messageObtain);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeviceControlManager(Context context, Looper looper, List list, ObserverRegister observerRegister, ContentResolver contentResolver, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            looper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper()");
        }
        Looper looper2 = looper;
        List listArrayListOf = (i & 4) != 0 ? CollectionsKt__CollectionsKt.arrayListOf(Constant.INSTANCE.getEXPORT_LIST_URI()) : list;
        ObserverRegister defaultObserverRegister = (i & 8) != 0 ? new DefaultObserverRegister(context) : observerRegister;
        if ((i & 16) != 0) {
            contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "ctx.contentResolver");
        }
        this(context, looper2, (List<? extends Uri>) listArrayListOf, defaultObserverRegister, contentResolver);
    }

    @Deprecated(message = "add param form", replaceWith = @ReplaceWith(expression = "start(delay: Long = TimeUnit.SECONDS.toMillis(3), receiver: DeviceControlReceiver, from: String)", imports = {}))
    public final void start(long delay, @NotNull DeviceControlReceiver receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.handler.removeMessages(1);
        Message messageObtain = Message.obtain(this.handler);
        messageObtain.what = 1;
        messageObtain.obj = receiver;
        this.handler.sendMessageDelayed(messageObtain, delay);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeviceControlManager(Context context, Looper looper, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            looper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper()");
        }
        this(context, looper, (i & 4) != 0 ? CollectionsKt__CollectionsKt.arrayListOf(Constant.INSTANCE.getEXPORT_LIST_URI()) : list);
    }

    public final void start(@NotNull DeviceControlReceiver receiver, @NotNull String from, boolean search) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(from, "from");
        start(TimeUnit.SECONDS.toMillis(3L), receiver, from, search);
    }

    @Deprecated(message = "add param from", replaceWith = @ReplaceWith(expression = "start(receiver: DeviceControlReceiver, from: String)", imports = {}))
    public final void start(@NotNull DeviceControlReceiver receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        start(TimeUnit.SECONDS.toMillis(3L), receiver);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceControlManager(@NotNull Context ctx, @NotNull Looper looper, @NotNull List<? extends Uri> uriList) {
        this(ctx, looper, uriList, new DefaultObserverRegister(ctx), null, 16, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(uriList, "uriList");
    }
}
