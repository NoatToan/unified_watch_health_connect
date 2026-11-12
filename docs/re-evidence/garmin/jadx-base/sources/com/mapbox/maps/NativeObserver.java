package com.mapbox.maps;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.extension.observable.EventsExtensionKt;
import com.mapbox.maps.plugin.delegates.listeners.OnCameraChangeListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapIdleListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapLoadErrorListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnRenderFrameFinishedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnRenderFrameStartedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceAddedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceDataLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceRemovedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleDataLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleImageMissingListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleImageUnusedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleLoadedListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0004µ\u0001¶\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b.\u0010-J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b8\u00107J\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b=\u0010<J\u0017\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bB\u0010AJ\u0017\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bG\u0010FJ3\u0010M\u001a\u00020L2\u0006\u0010I\u001a\u00020H2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bM\u0010NJ)\u0010Q\u001a\u00020L2\u0006\u0010P\u001a\u00020O2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010JH\u0007¢\u0006\u0004\bQ\u0010RJ3\u0010V\u001a\u00020L2\u0006\u0010T\u001a\u00020S2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bV\u0010WJ3\u0010[\u001a\u00020L2\u0006\u0010Y\u001a\u00020X2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b[\u0010\\J3\u0010`\u001a\u00020L2\u0006\u0010^\u001a\u00020]2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b`\u0010aJ3\u0010e\u001a\u00020L2\u0006\u0010c\u001a\u00020b2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\be\u0010fJ3\u0010j\u001a\u00020L2\u0006\u0010h\u001a\u00020g2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bj\u0010kJ3\u0010o\u001a\u00020L2\u0006\u0010m\u001a\u00020l2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010%¢\u0006\u0004\bo\u0010pJ3\u0010t\u001a\u00020L2\u0006\u0010r\u001a\u00020q2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010*¢\u0006\u0004\bt\u0010uJ3\u0010y\u001a\u00020L2\u0006\u0010w\u001a\u00020v2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010/¢\u0006\u0004\by\u0010zJ3\u0010~\u001a\u00020L2\u0006\u0010|\u001a\u00020{2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010}\u001a\u0004\u0018\u000104¢\u0006\u0004\b~\u0010\u007fJ9\u0010\u0083\u0001\u001a\u00020L2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u000109¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J9\u0010\u0088\u0001\u001a\u00020L2\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\u000b\b\u0002\u0010\u0087\u0001\u001a\u0004\u0018\u00010>¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J9\u0010\u008d\u0001\u001a\u00020L2\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\u000b\b\u0002\u0010\u008c\u0001\u001a\u0004\u0018\u00010C¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J,\u0010\u0091\u0001\u001a\u00020L2\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J8\u0010\u0097\u0001\u001a\u00020L2\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010JH\u0007¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0010\u0010\u0099\u0001\u001a\u00020\b¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0010\u0010\u009b\u0001\u001a\u00020\b¢\u0006\u0006\b\u009b\u0001\u0010\u009a\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\b2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J0\u0010¤\u0001\u001a\u00020\b2\u0007\u0010 \u0001\u001a\u00020\u00012\u0013\u0010£\u0001\u001a\u000e\u0012\t\u0012\u00070¢\u0001R\u00020\u00000¡\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010¦\u0001R\u001e\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020]0§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R#\u0010£\u0001\u001a\u000e\u0012\t\u0012\u00070¢\u0001R\u00020\u00000§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010©\u0001R0\u0010«\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020L0ª\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u0012\u0006\b¯\u0001\u0010\u009a\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R#\u0010±\u0001\u001a\u000e\u0012\t\u0012\u00070°\u0001R\u00020\u00000§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010©\u0001R0\u0010²\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020L0ª\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b²\u0001\u0010¬\u0001\u0012\u0006\b´\u0001\u0010\u009a\u0001\u001a\u0006\b³\u0001\u0010®\u0001¨\u0006·\u0001"}, d2 = {"Lcom/mapbox/maps/NativeObserver;", "", "Lcom/mapbox/maps/NativeMapImpl;", "observable", "<init>", "(Lcom/mapbox/maps/NativeMapImpl;)V", "Lcom/mapbox/maps/plugin/delegates/listeners/OnCameraChangeListener;", "onCameraChangeListener", "", "addOnCameraChangeListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnCameraChangeListener;)V", "removeOnCameraChangeListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadedListener;", "onMapLoadedListener", "addOnMapLoadedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadedListener;)V", "removeOnMapLoadedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnMapIdleListener;", "onMapIdleListener", "addOnMapIdleListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnMapIdleListener;)V", "removeOnMapIdleListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadErrorListener;", "onMapLoadErrorListener", "addOnMapLoadErrorListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadErrorListener;)V", "removeOnMapLoadErrorListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleLoadedListener;", "onStyleLoadedListener", "addOnStyleLoadedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleLoadedListener;)V", "removeOnStyleLoadedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleDataLoadedListener;", "onStyleDataLoadedListener", "addOnStyleDataLoadedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleDataLoadedListener;)V", "removeOnStyleDataLoadedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceDataLoadedListener;", "onSourceDataLoadedListener", "addOnSourceDataLoadedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceDataLoadedListener;)V", "removeOnSourceDataLoadedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceAddedListener;", "onSourceAddedListener", "addOnSourceAddedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceAddedListener;)V", "removeOnSourceAddedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceRemovedListener;", "onSourceRemovedListener", "addOnSourceRemovedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceRemovedListener;)V", "removeOnSourceRemovedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleImageMissingListener;", "onStyleImageMissingListener", "addOnStyleImageMissingListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleImageMissingListener;)V", "removeOnStyleImageMissingListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleImageUnusedListener;", "onStyleImageUnusedListener", "addOnStyleImageUnusedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleImageUnusedListener;)V", "removeOnStyleImageUnusedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnRenderFrameStartedListener;", "onRenderFrameStartedListener", "addOnRenderFrameStartedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnRenderFrameStartedListener;)V", "removeOnRenderFrameStartedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnRenderFrameFinishedListener;", "onRenderFrameFinishedListener", "addOnRenderFrameFinishedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnRenderFrameFinishedListener;)V", "removeOnRenderFrameFinishedListener", "Lcom/mapbox/maps/CameraChangedCallback;", "cameraChangedCallback", "Lkotlin/Function0;", "onCancel", "Lcom/mapbox/common/Cancelable;", "subscribeCameraChanged", "(Lcom/mapbox/maps/CameraChangedCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnCameraChangeListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "subscribeCameraChangedCoalesced", "(Lcom/mapbox/maps/CameraChangedCoalescedCallback;Le23/a;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadedCallback;", "mapLoadedCallback", "mapLoadedListener", "subscribeMapLoaded", "(Lcom/mapbox/maps/MapLoadedCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadedListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapIdleCallback;", "mapIdleCallback", "mapIdleListener", "subscribeMapIdle", "(Lcom/mapbox/maps/MapIdleCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnMapIdleListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "mapLoadingErrorCallback", "mapLoadingErrorListener", "subscribeMapLoadingError", "(Lcom/mapbox/maps/MapLoadingErrorCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadErrorListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleLoadedCallback;", "styleLoadedCallback", "styleLoadedListener", "subscribeStyleLoaded", "(Lcom/mapbox/maps/StyleLoadedCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleLoadedListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "styleDataLoadedCallback", "styleDataLoadedListener", "subscribeStyleDataLoaded", "(Lcom/mapbox/maps/StyleDataLoadedCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleDataLoadedListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceDataLoadedCallback;", "sourceDataLoadedCallback", "sourceDataLoadedListener", "subscribeSourceDataLoaded", "(Lcom/mapbox/maps/SourceDataLoadedCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceDataLoadedListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceAddedCallback;", "sourceAddedCallback", "sourceAddedListener", "subscribeSourceAdded", "(Lcom/mapbox/maps/SourceAddedCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceAddedListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceRemovedCallback;", "sourceRemovedCallback", "sourceRemovedListener", "subscribeSourceRemoved", "(Lcom/mapbox/maps/SourceRemovedCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceRemovedListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageMissingCallback;", "styleImageMissingCallback", "styleImageMissingListener", "subscribeStyleImageMissing", "(Lcom/mapbox/maps/StyleImageMissingCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleImageMissingListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;", "styleImageRemoveUnusedCallback", "styleImageUnusedListener", "subscribeStyleImageRemoveUnused", "(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleImageUnusedListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameStartedCallback;", "renderFrameStartedCallback", "renderFrameStarted", "subscribeRenderFrameStarted", "(Lcom/mapbox/maps/RenderFrameStartedCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnRenderFrameStartedListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "renderFrameFinishedCallback", "renderFrameFinishedListener", "subscribeRenderFrameFinished", "(Lcom/mapbox/maps/RenderFrameFinishedCallback;Le23/a;Lcom/mapbox/maps/plugin/delegates/listeners/OnRenderFrameFinishedListener;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/ResourceRequestCallback;", "resourceRequestCallback", "subscribeResourceRequest", "(Lcom/mapbox/maps/ResourceRequestCallback;Le23/a;)Lcom/mapbox/common/Cancelable;", "", "eventName", "Lcom/mapbox/maps/GenericEventCallback;", "genericEventCallback", "subscribeGenericEvent", "(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;Le23/a;)Lcom/mapbox/common/Cancelable;", "resubscribeStyleLoadListeners", "()V", "onDestroy", "Lcom/mapbox/maps/MapLoadingError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "sendMapLoadingError", "(Lcom/mapbox/maps/MapLoadingError;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;", "cancelableSet", "unsubscribeListener", "(Ljava/lang/Object;Ljava/util/Set;)V", "Lcom/mapbox/maps/NativeMapImpl;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "mapLoadingErrorCallbackSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "_cancelableSet", "Ljava/util/Set;", "get_cancelableSet$maps_sdk_release", "()Ljava/util/Set;", "get_cancelableSet$maps_sdk_release$annotations", "Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;", "resubscribableSet", "_resubscribableSet", "get_resubscribableSet$maps_sdk_release", "get_resubscribableSet$maps_sdk_release$annotations", "ExtendedCancelable", "ResubscribeExtendedCancelable", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeObserver {
    private final Set<? extends Cancelable> _cancelableSet;
    private final Set<? extends Cancelable> _resubscribableSet;
    private final CopyOnWriteArraySet<ExtendedCancelable> cancelableSet;
    private final CopyOnWriteArraySet<MapLoadingErrorCallback> mapLoadingErrorCallbackSet;
    private final NativeMapImpl observable;
    private final CopyOnWriteArraySet<ResubscribeExtendedCancelable> resubscribableSet;

    public NativeObserver(NativeMapImpl nativeMapImpl) {
        nativeMapImpl.getClass();
        this.observable = nativeMapImpl;
        this.mapLoadingErrorCallbackSet = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<ExtendedCancelable> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.cancelableSet = copyOnWriteArraySet;
        this._cancelableSet = copyOnWriteArraySet;
        CopyOnWriteArraySet<ResubscribeExtendedCancelable> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.resubscribableSet = copyOnWriteArraySet2;
        this._resubscribableSet = copyOnWriteArraySet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnCameraChangeListener$lambda$2(OnCameraChangeListener onCameraChangeListener, CameraChanged cameraChanged) {
        onCameraChangeListener.getClass();
        cameraChanged.getClass();
        onCameraChangeListener.onCameraChanged(EventsExtensionKt.toCameraChangedEventData(cameraChanged));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapIdleListener$lambda$4(OnMapIdleListener onMapIdleListener, MapIdle mapIdle) {
        onMapIdleListener.getClass();
        mapIdle.getClass();
        onMapIdleListener.onMapIdle(EventsExtensionKt.toMapIdleEventData(mapIdle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapLoadErrorListener$lambda$5(OnMapLoadErrorListener onMapLoadErrorListener, MapLoadingError mapLoadingError) {
        onMapLoadErrorListener.getClass();
        mapLoadingError.getClass();
        onMapLoadErrorListener.onMapLoadError(EventsExtensionKt.toMapLoadingErrorEventData(mapLoadingError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapLoadedListener$lambda$3(OnMapLoadedListener onMapLoadedListener, MapLoaded mapLoaded) {
        onMapLoadedListener.getClass();
        mapLoaded.getClass();
        onMapLoadedListener.onMapLoaded(EventsExtensionKt.toMapLoadedEventData(mapLoaded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnRenderFrameFinishedListener$lambda$14(OnRenderFrameFinishedListener onRenderFrameFinishedListener, RenderFrameFinished renderFrameFinished) {
        onRenderFrameFinishedListener.getClass();
        renderFrameFinished.getClass();
        onRenderFrameFinishedListener.onRenderFrameFinished(EventsExtensionKt.toRenderFrameFinishedEventData(renderFrameFinished));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnRenderFrameStartedListener$lambda$13(OnRenderFrameStartedListener onRenderFrameStartedListener, RenderFrameStarted renderFrameStarted) {
        onRenderFrameStartedListener.getClass();
        renderFrameStarted.getClass();
        onRenderFrameStartedListener.onRenderFrameStarted(EventsExtensionKt.toRenderFrameStartedEventData(renderFrameStarted));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceAddedListener$lambda$9(OnSourceAddedListener onSourceAddedListener, SourceAdded sourceAdded) {
        onSourceAddedListener.getClass();
        sourceAdded.getClass();
        onSourceAddedListener.onSourceAdded(EventsExtensionKt.toSourceAddedEventData(sourceAdded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceDataLoadedListener$lambda$8(OnSourceDataLoadedListener onSourceDataLoadedListener, SourceDataLoaded sourceDataLoaded) {
        onSourceDataLoadedListener.getClass();
        sourceDataLoaded.getClass();
        onSourceDataLoadedListener.onSourceDataLoaded(EventsExtensionKt.toSourceDataLoadedEventData(sourceDataLoaded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceRemovedListener$lambda$10(OnSourceRemovedListener onSourceRemovedListener, SourceRemoved sourceRemoved) {
        onSourceRemovedListener.getClass();
        sourceRemoved.getClass();
        onSourceRemovedListener.onSourceRemoved(EventsExtensionKt.toSourceRemovedEventData(sourceRemoved));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleDataLoadedListener$lambda$7(OnStyleDataLoadedListener onStyleDataLoadedListener, StyleDataLoaded styleDataLoaded) {
        onStyleDataLoadedListener.getClass();
        styleDataLoaded.getClass();
        onStyleDataLoadedListener.onStyleDataLoaded(EventsExtensionKt.toStyleDataLoadedEventData(styleDataLoaded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleImageMissingListener$lambda$11(OnStyleImageMissingListener onStyleImageMissingListener, StyleImageMissing styleImageMissing) {
        onStyleImageMissingListener.getClass();
        styleImageMissing.getClass();
        onStyleImageMissingListener.onStyleImageMissing(EventsExtensionKt.toStyleImageMissingEventData(styleImageMissing));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleImageUnusedListener$lambda$12(OnStyleImageUnusedListener onStyleImageUnusedListener, StyleImageRemoveUnused styleImageRemoveUnused) {
        onStyleImageUnusedListener.getClass();
        styleImageRemoveUnused.getClass();
        onStyleImageUnusedListener.onStyleImageUnused(EventsExtensionKt.toStyleImageUnusedEventData(styleImageRemoveUnused));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleLoadedListener$lambda$6(OnStyleLoadedListener onStyleLoadedListener, StyleLoaded styleLoaded) {
        onStyleLoadedListener.getClass();
        styleLoaded.getClass();
        onStyleLoadedListener.onStyleLoaded(EventsExtensionKt.toStyleLoadedEventData(styleLoaded));
    }

    public static /* synthetic */ void get_cancelableSet$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void get_resubscribableSet$maps_sdk_release$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeCameraChanged$default(NativeObserver nativeObserver, CameraChangedCallback cameraChangedCallback, e23.a aVar, OnCameraChangeListener onCameraChangeListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onCameraChangeListener = null;
        }
        return nativeObserver.subscribeCameraChanged(cameraChangedCallback, aVar, onCameraChangeListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeCameraChangedCoalesced$default(NativeObserver nativeObserver, CameraChangedCoalescedCallback cameraChangedCoalescedCallback, e23.a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        return nativeObserver.subscribeCameraChangedCoalesced(cameraChangedCoalescedCallback, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeGenericEvent$default(NativeObserver nativeObserver, String str, GenericEventCallback genericEventCallback, e23.a aVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        return nativeObserver.subscribeGenericEvent(str, genericEventCallback, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeMapIdle$default(NativeObserver nativeObserver, MapIdleCallback mapIdleCallback, e23.a aVar, OnMapIdleListener onMapIdleListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onMapIdleListener = null;
        }
        return nativeObserver.subscribeMapIdle(mapIdleCallback, aVar, onMapIdleListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeMapLoaded$default(NativeObserver nativeObserver, MapLoadedCallback mapLoadedCallback, e23.a aVar, OnMapLoadedListener onMapLoadedListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onMapLoadedListener = null;
        }
        return nativeObserver.subscribeMapLoaded(mapLoadedCallback, aVar, onMapLoadedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeMapLoadingError$default(NativeObserver nativeObserver, MapLoadingErrorCallback mapLoadingErrorCallback, e23.a aVar, OnMapLoadErrorListener onMapLoadErrorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onMapLoadErrorListener = null;
        }
        return nativeObserver.subscribeMapLoadingError(mapLoadingErrorCallback, aVar, onMapLoadErrorListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeRenderFrameFinished$default(NativeObserver nativeObserver, RenderFrameFinishedCallback renderFrameFinishedCallback, e23.a aVar, OnRenderFrameFinishedListener onRenderFrameFinishedListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onRenderFrameFinishedListener = null;
        }
        return nativeObserver.subscribeRenderFrameFinished(renderFrameFinishedCallback, aVar, onRenderFrameFinishedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeRenderFrameStarted$default(NativeObserver nativeObserver, RenderFrameStartedCallback renderFrameStartedCallback, e23.a aVar, OnRenderFrameStartedListener onRenderFrameStartedListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onRenderFrameStartedListener = null;
        }
        return nativeObserver.subscribeRenderFrameStarted(renderFrameStartedCallback, aVar, onRenderFrameStartedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeResourceRequest$default(NativeObserver nativeObserver, ResourceRequestCallback resourceRequestCallback, e23.a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        return nativeObserver.subscribeResourceRequest(resourceRequestCallback, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeSourceAdded$default(NativeObserver nativeObserver, SourceAddedCallback sourceAddedCallback, e23.a aVar, OnSourceAddedListener onSourceAddedListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onSourceAddedListener = null;
        }
        return nativeObserver.subscribeSourceAdded(sourceAddedCallback, aVar, onSourceAddedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeSourceDataLoaded$default(NativeObserver nativeObserver, SourceDataLoadedCallback sourceDataLoadedCallback, e23.a aVar, OnSourceDataLoadedListener onSourceDataLoadedListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onSourceDataLoadedListener = null;
        }
        return nativeObserver.subscribeSourceDataLoaded(sourceDataLoadedCallback, aVar, onSourceDataLoadedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeSourceRemoved$default(NativeObserver nativeObserver, SourceRemovedCallback sourceRemovedCallback, e23.a aVar, OnSourceRemovedListener onSourceRemovedListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onSourceRemovedListener = null;
        }
        return nativeObserver.subscribeSourceRemoved(sourceRemovedCallback, aVar, onSourceRemovedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeStyleDataLoaded$default(NativeObserver nativeObserver, StyleDataLoadedCallback styleDataLoadedCallback, e23.a aVar, OnStyleDataLoadedListener onStyleDataLoadedListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onStyleDataLoadedListener = null;
        }
        return nativeObserver.subscribeStyleDataLoaded(styleDataLoadedCallback, aVar, onStyleDataLoadedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeStyleImageMissing$default(NativeObserver nativeObserver, StyleImageMissingCallback styleImageMissingCallback, e23.a aVar, OnStyleImageMissingListener onStyleImageMissingListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onStyleImageMissingListener = null;
        }
        return nativeObserver.subscribeStyleImageMissing(styleImageMissingCallback, aVar, onStyleImageMissingListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeStyleImageRemoveUnused$default(NativeObserver nativeObserver, StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback, e23.a aVar, OnStyleImageUnusedListener onStyleImageUnusedListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onStyleImageUnusedListener = null;
        }
        return nativeObserver.subscribeStyleImageRemoveUnused(styleImageRemoveUnusedCallback, aVar, onStyleImageUnusedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeStyleLoaded$default(NativeObserver nativeObserver, StyleLoadedCallback styleLoadedCallback, e23.a aVar, OnStyleLoadedListener onStyleLoadedListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            onStyleLoadedListener = null;
        }
        return nativeObserver.subscribeStyleLoaded(styleLoadedCallback, aVar, onStyleLoadedListener);
    }

    private final void unsubscribeListener(Object listener, Set<? extends ExtendedCancelable> cancelableSet) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : cancelableSet) {
            if (s.g(((ExtendedCancelable) obj).getListener(), listener)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ExtendedCancelable) it.next()).cancel();
        }
    }

    @o13.e
    public final void addOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        onCameraChangeListener.getClass();
        subscribeCameraChanged$default(this, new com.google.firebase.crashlytics.internal.common.i(onCameraChangeListener, 18), null, onCameraChangeListener, 2, null);
    }

    @o13.e
    public final void addOnMapIdleListener(OnMapIdleListener onMapIdleListener) {
        onMapIdleListener.getClass();
        subscribeMapIdle$default(this, new com.google.firebase.crashlytics.internal.common.i(onMapIdleListener, 11), null, onMapIdleListener, 2, null);
    }

    @o13.e
    public final void addOnMapLoadErrorListener(OnMapLoadErrorListener onMapLoadErrorListener) {
        onMapLoadErrorListener.getClass();
        subscribeMapLoadingError$default(this, new n(onMapLoadErrorListener, 0), null, onMapLoadErrorListener, 2, null);
    }

    @o13.e
    public final void addOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        onMapLoadedListener.getClass();
        subscribeMapLoaded$default(this, new com.google.firebase.crashlytics.internal.common.i(onMapLoadedListener, 13), null, onMapLoadedListener, 2, null);
    }

    @o13.e
    public final void addOnRenderFrameFinishedListener(OnRenderFrameFinishedListener onRenderFrameFinishedListener) {
        onRenderFrameFinishedListener.getClass();
        subscribeRenderFrameFinished$default(this, new com.google.firebase.crashlytics.internal.common.i(onRenderFrameFinishedListener, 15), null, onRenderFrameFinishedListener, 2, null);
    }

    @o13.e
    public final void addOnRenderFrameStartedListener(OnRenderFrameStartedListener onRenderFrameStartedListener) {
        onRenderFrameStartedListener.getClass();
        subscribeRenderFrameStarted$default(this, new com.google.firebase.crashlytics.internal.common.i(onRenderFrameStartedListener, 19), null, onRenderFrameStartedListener, 2, null);
    }

    @o13.e
    public final void addOnSourceAddedListener(OnSourceAddedListener onSourceAddedListener) {
        onSourceAddedListener.getClass();
        subscribeSourceAdded$default(this, new com.google.firebase.crashlytics.internal.common.i(onSourceAddedListener, 21), null, onSourceAddedListener, 2, null);
    }

    @o13.e
    public final void addOnSourceDataLoadedListener(OnSourceDataLoadedListener onSourceDataLoadedListener) {
        onSourceDataLoadedListener.getClass();
        subscribeSourceDataLoaded$default(this, new com.google.firebase.crashlytics.internal.common.i(onSourceDataLoadedListener, 22), null, onSourceDataLoadedListener, 2, null);
    }

    @o13.e
    public final void addOnSourceRemovedListener(OnSourceRemovedListener onSourceRemovedListener) {
        onSourceRemovedListener.getClass();
        subscribeSourceRemoved$default(this, new com.google.firebase.crashlytics.internal.common.i(onSourceRemovedListener, 16), null, onSourceRemovedListener, 2, null);
    }

    @o13.e
    public final void addOnStyleDataLoadedListener(OnStyleDataLoadedListener onStyleDataLoadedListener) {
        onStyleDataLoadedListener.getClass();
        subscribeStyleDataLoaded$default(this, new com.google.firebase.crashlytics.internal.common.i(onStyleDataLoadedListener, 17), null, onStyleDataLoadedListener, 2, null);
    }

    @o13.e
    public final void addOnStyleImageMissingListener(OnStyleImageMissingListener onStyleImageMissingListener) {
        onStyleImageMissingListener.getClass();
        subscribeStyleImageMissing$default(this, new com.google.firebase.crashlytics.internal.common.i(onStyleImageMissingListener, 12), null, onStyleImageMissingListener, 2, null);
    }

    @o13.e
    public final void addOnStyleImageUnusedListener(OnStyleImageUnusedListener onStyleImageUnusedListener) {
        onStyleImageUnusedListener.getClass();
        subscribeStyleImageRemoveUnused$default(this, new com.google.firebase.crashlytics.internal.common.i(onStyleImageUnusedListener, 14), null, onStyleImageUnusedListener, 2, null);
    }

    @o13.e
    public final void addOnStyleLoadedListener(OnStyleLoadedListener onStyleLoadedListener) {
        onStyleLoadedListener.getClass();
        subscribeStyleLoaded$default(this, new com.google.firebase.crashlytics.internal.common.i(onStyleLoadedListener, 20), null, onStyleLoadedListener, 2, null);
    }

    public final Set<? extends Cancelable> get_cancelableSet$maps_sdk_release() {
        return this._cancelableSet;
    }

    public final Set<? extends Cancelable> get_resubscribableSet$maps_sdk_release() {
        return this._resubscribableSet;
    }

    public final void onDestroy() {
        Iterator<T> it = this.cancelableSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        Iterator<T> it3 = this.resubscribableSet.iterator();
        while (it3.hasNext()) {
            ((Cancelable) it3.next()).cancel();
        }
    }

    @o13.e
    public final void removeOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        onCameraChangeListener.getClass();
        unsubscribeListener(onCameraChangeListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnMapIdleListener(OnMapIdleListener onMapIdleListener) {
        onMapIdleListener.getClass();
        unsubscribeListener(onMapIdleListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnMapLoadErrorListener(OnMapLoadErrorListener onMapLoadErrorListener) {
        onMapLoadErrorListener.getClass();
        unsubscribeListener(onMapLoadErrorListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        onMapLoadedListener.getClass();
        unsubscribeListener(onMapLoadedListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnRenderFrameFinishedListener(OnRenderFrameFinishedListener onRenderFrameFinishedListener) {
        onRenderFrameFinishedListener.getClass();
        unsubscribeListener(onRenderFrameFinishedListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnRenderFrameStartedListener(OnRenderFrameStartedListener onRenderFrameStartedListener) {
        onRenderFrameStartedListener.getClass();
        unsubscribeListener(onRenderFrameStartedListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnSourceAddedListener(OnSourceAddedListener onSourceAddedListener) {
        onSourceAddedListener.getClass();
        unsubscribeListener(onSourceAddedListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnSourceDataLoadedListener(OnSourceDataLoadedListener onSourceDataLoadedListener) {
        onSourceDataLoadedListener.getClass();
        unsubscribeListener(onSourceDataLoadedListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnSourceRemovedListener(OnSourceRemovedListener onSourceRemovedListener) {
        onSourceRemovedListener.getClass();
        unsubscribeListener(onSourceRemovedListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnStyleDataLoadedListener(OnStyleDataLoadedListener onStyleDataLoadedListener) {
        onStyleDataLoadedListener.getClass();
        unsubscribeListener(onStyleDataLoadedListener, this.resubscribableSet);
    }

    @o13.e
    public final void removeOnStyleImageMissingListener(OnStyleImageMissingListener onStyleImageMissingListener) {
        onStyleImageMissingListener.getClass();
        unsubscribeListener(onStyleImageMissingListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnStyleImageUnusedListener(OnStyleImageUnusedListener onStyleImageUnusedListener) {
        onStyleImageUnusedListener.getClass();
        unsubscribeListener(onStyleImageUnusedListener, this.cancelableSet);
    }

    @o13.e
    public final void removeOnStyleLoadedListener(OnStyleLoadedListener onStyleLoadedListener) {
        onStyleLoadedListener.getClass();
        unsubscribeListener(onStyleLoadedListener, this.resubscribableSet);
    }

    public final void resubscribeStyleLoadListeners() {
        Iterator<T> it = this.resubscribableSet.iterator();
        while (it.hasNext()) {
            ((ResubscribeExtendedCancelable) it.next()).resubscribe();
        }
    }

    public final void sendMapLoadingError(MapLoadingError error) {
        error.getClass();
        Iterator<T> it = this.mapLoadingErrorCallbackSet.iterator();
        while (it.hasNext()) {
            ((MapLoadingErrorCallback) it.next()).run(error);
        }
    }

    public final Cancelable subscribeCameraChanged(CameraChangedCallback cameraChangedCallback, e23.a<Unit> onCancel, OnCameraChangeListener onCameraChangeListener) {
        cameraChangedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(cameraChangedCallback), onCancel, null, onCameraChangeListener, 4, null);
    }

    @com.mapbox.annotation.MapboxExperimental
    public final Cancelable subscribeCameraChangedCoalesced(CameraChangedCoalescedCallback cameraChangedCoalescedCallback, e23.a<Unit> onCancel) {
        cameraChangedCoalescedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(cameraChangedCoalescedCallback), onCancel, null, null, 12, null);
    }

    @MapboxExperimental
    public final Cancelable subscribeGenericEvent(String eventName, GenericEventCallback genericEventCallback, e23.a<Unit> onCancel) {
        eventName.getClass();
        genericEventCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(eventName, genericEventCallback), onCancel, null, null, 12, null);
    }

    public final Cancelable subscribeMapIdle(MapIdleCallback mapIdleCallback, e23.a<Unit> onCancel, OnMapIdleListener mapIdleListener) {
        mapIdleCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(mapIdleCallback), onCancel, null, mapIdleListener, 4, null);
    }

    public final Cancelable subscribeMapLoaded(MapLoadedCallback mapLoadedCallback, e23.a<Unit> onCancel, OnMapLoadedListener mapLoadedListener) {
        mapLoadedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(mapLoadedCallback), onCancel, null, mapLoadedListener, 4, null);
    }

    public final Cancelable subscribeMapLoadingError(MapLoadingErrorCallback mapLoadingErrorCallback, e23.a<Unit> onCancel, OnMapLoadErrorListener mapLoadingErrorListener) {
        mapLoadingErrorCallback.getClass();
        this.mapLoadingErrorCallbackSet.add(mapLoadingErrorCallback);
        return new ExtendedCancelable(this, this.observable.subscribe(mapLoadingErrorCallback), new AnonymousClass1(mapLoadingErrorCallback, onCancel), null, mapLoadingErrorListener, 4, null);
    }

    public final Cancelable subscribeRenderFrameFinished(RenderFrameFinishedCallback renderFrameFinishedCallback, e23.a<Unit> onCancel, OnRenderFrameFinishedListener renderFrameFinishedListener) {
        renderFrameFinishedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(renderFrameFinishedCallback), onCancel, null, renderFrameFinishedListener, 4, null);
    }

    public final Cancelable subscribeRenderFrameStarted(RenderFrameStartedCallback renderFrameStartedCallback, e23.a<Unit> onCancel, OnRenderFrameStartedListener renderFrameStarted) {
        renderFrameStartedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(renderFrameStartedCallback), onCancel, null, renderFrameStarted, 4, null);
    }

    public final Cancelable subscribeResourceRequest(ResourceRequestCallback resourceRequestCallback, e23.a<Unit> onCancel) {
        resourceRequestCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(resourceRequestCallback), onCancel, null, null, 12, null);
    }

    public final Cancelable subscribeSourceAdded(SourceAddedCallback sourceAddedCallback, e23.a<Unit> onCancel, OnSourceAddedListener sourceAddedListener) {
        sourceAddedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(sourceAddedCallback), onCancel, null, sourceAddedListener, 4, null);
    }

    public final Cancelable subscribeSourceDataLoaded(SourceDataLoadedCallback sourceDataLoadedCallback, e23.a<Unit> onCancel, OnSourceDataLoadedListener sourceDataLoadedListener) {
        sourceDataLoadedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(sourceDataLoadedCallback), onCancel, null, sourceDataLoadedListener, 4, null);
    }

    public final Cancelable subscribeSourceRemoved(SourceRemovedCallback sourceRemovedCallback, e23.a<Unit> onCancel, OnSourceRemovedListener sourceRemovedListener) {
        sourceRemovedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(sourceRemovedCallback), onCancel, null, sourceRemovedListener, 4, null);
    }

    public final Cancelable subscribeStyleDataLoaded(StyleDataLoadedCallback styleDataLoadedCallback, e23.a<Unit> onCancel, OnStyleDataLoadedListener styleDataLoadedListener) {
        styleDataLoadedCallback.getClass();
        NativeObserver$subscribeStyleDataLoaded$resubscriber$1 nativeObserver$subscribeStyleDataLoaded$resubscriber$1 = new NativeObserver$subscribeStyleDataLoaded$resubscriber$1(this, styleDataLoadedCallback);
        return new ResubscribeExtendedCancelable(this, nativeObserver$subscribeStyleDataLoaded$resubscriber$1, nativeObserver$subscribeStyleDataLoaded$resubscriber$1.invoke(), this.resubscribableSet, onCancel, styleDataLoadedListener);
    }

    public final Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback, e23.a<Unit> onCancel, OnStyleImageMissingListener styleImageMissingListener) {
        styleImageMissingCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(styleImageMissingCallback), onCancel, null, styleImageMissingListener, 4, null);
    }

    public final Cancelable subscribeStyleImageRemoveUnused(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback, e23.a<Unit> onCancel, OnStyleImageUnusedListener styleImageUnusedListener) {
        styleImageRemoveUnusedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(styleImageRemoveUnusedCallback), onCancel, null, styleImageUnusedListener, 4, null);
    }

    public final Cancelable subscribeStyleLoaded(StyleLoadedCallback styleLoadedCallback, e23.a<Unit> onCancel, OnStyleLoadedListener styleLoadedListener) {
        styleLoadedCallback.getClass();
        NativeObserver$subscribeStyleLoaded$resubscriber$1 nativeObserver$subscribeStyleLoaded$resubscriber$1 = new NativeObserver$subscribeStyleLoaded$resubscriber$1(this, styleLoadedCallback);
        return new ResubscribeExtendedCancelable(this, nativeObserver$subscribeStyleLoaded$resubscriber$1, nativeObserver$subscribeStyleLoaded$resubscriber$1.invoke(), this.resubscribableSet, onCancel, styleLoadedListener);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.NativeObserver$subscribeMapLoadingError$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements e23.a<Unit> {
        final /* synthetic */ MapLoadingErrorCallback $mapLoadingErrorCallback;
        final /* synthetic */ e23.a<Unit> $onCancel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MapLoadingErrorCallback mapLoadingErrorCallback, e23.a<Unit> aVar) {
            super(0);
            this.$mapLoadingErrorCallback = mapLoadingErrorCallback;
            this.$onCancel = aVar;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NativeObserver.this.mapLoadingErrorCallbackSet.remove(this.$mapLoadingErrorCallback);
            e23.a<Unit> aVar = this.$onCancel;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;", "Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;", "Lcom/mapbox/maps/NativeObserver;", "Lkotlin/Function0;", "Lcom/mapbox/common/Cancelable;", "resubscriber", "originalCancelable", "", "cancelableSet", "", "onCancel", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/mapbox/maps/NativeObserver;Le23/a;Lcom/mapbox/common/Cancelable;Ljava/util/Set;Le23/a;Ljava/lang/Object;)V", "resubscribe", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Le23/a;", "Lcom/mapbox/common/Cancelable;", "getOriginalCancelable", "()Lcom/mapbox/common/Cancelable;", "setOriginalCancelable", "(Lcom/mapbox/common/Cancelable;)V", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class ResubscribeExtendedCancelable extends ExtendedCancelable {
        private Cancelable originalCancelable;
        private final e23.a<Cancelable> resubscriber;
        final /* synthetic */ NativeObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ResubscribeExtendedCancelable(NativeObserver nativeObserver, e23.a<? extends Cancelable> aVar, Cancelable cancelable, Set<ResubscribeExtendedCancelable> set, e23.a<Unit> aVar2, Object obj) {
            super(nativeObserver, cancelable, aVar2, y0.d(set), obj);
            aVar.getClass();
            cancelable.getClass();
            set.getClass();
            this.this$0 = nativeObserver;
            this.resubscriber = aVar;
            this.originalCancelable = cancelable;
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!ResubscribeExtendedCancelable.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            return s.g(this.resubscriber, ((ResubscribeExtendedCancelable) other).resubscriber);
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public Cancelable getOriginalCancelable() {
            return this.originalCancelable;
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public int hashCode() {
            return Objects.hash(Integer.valueOf(super.hashCode()), this.resubscriber);
        }

        public final void resubscribe() {
            getOriginalCancelable().cancel();
            setOriginalCancelable(this.resubscriber.invoke());
        }

        public void setOriginalCancelable(Cancelable cancelable) {
            cancelable.getClass();
            this.originalCancelable = cancelable;
        }

        public /* synthetic */ ResubscribeExtendedCancelable(NativeObserver nativeObserver, e23.a aVar, Cancelable cancelable, Set set, e23.a aVar2, Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
            this(nativeObserver, aVar, cancelable, set, (i14 & 8) != 0 ? null : aVar2, (i14 & 16) != 0 ? null : obj);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0092\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;", "Lcom/mapbox/common/Cancelable;", "originalCancelable", "Lkotlin/Function0;", "", "onCancel", "", "Lcom/mapbox/maps/NativeObserver;", "cancelableSet", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Le23/a;Ljava/util/Set;Ljava/lang/Object;)V", "cancel", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/mapbox/common/Cancelable;", "getOriginalCancelable", "()Lcom/mapbox/common/Cancelable;", "Le23/a;", "getOnCancel", "()Le23/a;", "Ljava/util/Set;", "Ljava/lang/Object;", "getListener", "()Ljava/lang/Object;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public class ExtendedCancelable implements Cancelable {
        private final Set<ExtendedCancelable> cancelableSet;
        private final Object listener;
        private final e23.a<Unit> onCancel;
        private final Cancelable originalCancelable;
        final /* synthetic */ NativeObserver this$0;

        public /* synthetic */ ExtendedCancelable(NativeObserver nativeObserver, Cancelable cancelable, e23.a aVar, Set set, Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
            this(nativeObserver, cancelable, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? nativeObserver.cancelableSet : set, (i14 & 8) != 0 ? null : obj);
        }

        @Override // com.mapbox.common.Cancelable
        public void cancel() {
            this.cancelableSet.remove(this);
            getOriginalCancelable().cancel();
            e23.a<Unit> aVar = this.onCancel;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!getClass().equals(other != null ? other.getClass() : null)) {
                return false;
            }
            other.getClass();
            ExtendedCancelable extendedCancelable = (ExtendedCancelable) other;
            return s.g(getOriginalCancelable(), extendedCancelable.getOriginalCancelable()) && s.g(this.cancelableSet, extendedCancelable.cancelableSet) && s.g(this.onCancel, extendedCancelable.onCancel) && s.g(this.listener, extendedCancelable.listener);
        }

        public final Object getListener() {
            return this.listener;
        }

        public final e23.a<Unit> getOnCancel() {
            return this.onCancel;
        }

        public Cancelable getOriginalCancelable() {
            return this.originalCancelable;
        }

        public int hashCode() {
            return Objects.hash(getOriginalCancelable(), this.cancelableSet, this.onCancel, this.listener);
        }

        public ExtendedCancelable(NativeObserver nativeObserver, Cancelable cancelable, e23.a<Unit> aVar, Set<ExtendedCancelable> set, Object obj) {
            cancelable.getClass();
            set.getClass();
            this.this$0 = nativeObserver;
            this.originalCancelable = cancelable;
            this.onCancel = aVar;
            this.cancelableSet = set;
            this.listener = obj;
            set.add(this);
        }
    }
}
