package com.mapbox.maps.renderer;

import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.Surface;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.ContextMode;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxTracing;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.gl.TextureRenderer;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationUpdateMode;
import d53.w;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import k23.l;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.b0;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 Ê\u00012\u00020\u0001:\u0002Ê\u0001B9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBQ\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u000e\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010*J'\u0010/\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020 2\u0006\u00100\u001a\u00020\bH\u0007¢\u0006\u0004\b1\u00102J'\u00103\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0004\b3\u0010.J\u0017\u00105\u001a\u00020 2\u0006\u00104\u001a\u00020\bH\u0007¢\u0006\u0004\b5\u00102J\u0017\u00108\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020 2\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020 ¢\u0006\u0004\b>\u0010$J\u000f\u0010?\u001a\u00020 H\u0007¢\u0006\u0004\b?\u0010$J\u000f\u0010@\u001a\u00020 H\u0007¢\u0006\u0004\b@\u0010$J\u000f\u0010B\u001a\u00020 H\u0001¢\u0006\u0004\bA\u0010$J&\u0010F\u001a\u00020 2\u0006\u0010C\u001a\u00020\f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020 0DH\u0082\b¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\u00020 2\b\b\u0002\u0010H\u001a\u000206H\u0002¢\u0006\u0004\bI\u00109J\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u0010NJ\u0017\u0010P\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0006H\u0002¢\u0006\u0004\bR\u0010NJ\u000f\u0010S\u001a\u00020 H\u0002¢\u0006\u0004\bS\u0010$J\u000f\u0010T\u001a\u00020 H\u0002¢\u0006\u0004\bT\u0010$J\u000f\u0010U\u001a\u00020 H\u0002¢\u0006\u0004\bU\u0010$J\u0017\u0010V\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bV\u00109J\u000f\u0010W\u001a\u00020 H\u0002¢\u0006\u0004\bW\u0010$J\u000f\u0010X\u001a\u00020 H\u0002¢\u0006\u0004\bX\u0010$J\u0019\u0010Z\u001a\u00020 2\b\b\u0002\u0010Y\u001a\u00020\u0006H\u0002¢\u0006\u0004\bZ\u0010[J\u0019\u0010\\\u001a\u00020 2\b\b\u0002\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\\\u0010[J \u0010^\u001a\u00020 2\u000e\b\u0004\u0010]\u001a\b\u0012\u0004\u0012\u00020 0DH\u0082\b¢\u0006\u0004\b^\u0010_J!\u0010`\u001a\u00020 2\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010H\u001a\u000206H\u0002¢\u0006\u0004\b`\u0010aJ\u001d\u0010d\u001a\u00020 2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020:0bH\u0002¢\u0006\u0004\bd\u0010eR\u001a\u0010f\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010jR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010kR\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010oR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010pR\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010pR&\u0010q\u001a\b\u0012\u0004\u0012\u00020:0b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bq\u0010r\u0012\u0004\bu\u0010$\u001a\u0004\bs\u0010tR&\u0010v\u001a\b\u0012\u0004\u0012\u00020:0b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bv\u0010r\u0012\u0004\bx\u0010$\u001a\u0004\bw\u0010tR*\u0010,\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b,\u0010y\u0012\u0004\b~\u0010$\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R0\u0010\u0080\u0001\u001a\u00020\u007f8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u0012\u0005\b\u0086\u0001\u0010$\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010\u0087\u0001R\u0017\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u0087\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010jR\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u008b\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u008c\u0001R-\u0010\u008d\u0001\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0005\b\u008d\u0001\u0010j\u0012\u0005\b\u0090\u0001\u0010$\u001a\u0005\b\u008e\u0001\u0010N\"\u0005\b\u008f\u0001\u0010[R\u0018\u0010\u0091\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010jR-\u0010\u0092\u0001\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0005\b\u0092\u0001\u0010j\u0012\u0005\b\u0095\u0001\u0010$\u001a\u0005\b\u0093\u0001\u0010N\"\u0005\b\u0094\u0001\u0010[R3\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001f\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u0012\u0005\b\u009d\u0001\u0010$\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010£\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R(\u0010¥\u0001\u001a\u00020\u00062\u0007\u0010¤\u0001\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\u000e\n\u0005\b¥\u0001\u0010j\"\u0005\b¦\u0001\u0010[R6\u0010§\u0001\u001a\u00020\u00062\u0007\u0010¤\u0001\u001a\u00020\u00068\u0000@@X\u0081\u000e¢\u0006\u001c\n\u0005\b§\u0001\u0010j\u0012\u0005\bª\u0001\u0010$\u001a\u0005\b¨\u0001\u0010N\"\u0005\b©\u0001\u0010[R\u0016\u0010«\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b«\u0001\u0010oR\u0018\u0010¬\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010jR\u0018\u0010\u00ad\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010jR9\u0010¶\u0001\u001a\u0005\u0018\u00010®\u00012\n\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018@@@X\u0080\u008e\u0002¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010·\u0001R&\u0010¸\u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u0010j\u001a\u0005\b¹\u0001\u0010N\"\u0005\bº\u0001\u0010[R*\u0010¼\u0001\u001a\u00030»\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R\u001e\u0010Â\u0001\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bÂ\u0001\u0010Ã\u0001\u0012\u0005\bÄ\u0001\u0010$R\u0018\u0010Æ\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0016\u0010É\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010N¨\u0006Ë\u0001"}, d2 = {"Lcom/mapbox/maps/renderer/MapboxRenderThread;", "Landroid/view/Choreographer$FrameCallback;", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "mapboxRenderer", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "mapboxWidgetRenderer", "", "translucentSurface", "", "antialiasingSampleCount", "Lcom/mapbox/maps/ContextMode;", "contextMode", "", "mapName", "<init>", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;ZILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V", "Lcom/mapbox/maps/renderer/RenderHandlerThread;", "handlerThread", "Lcom/mapbox/maps/renderer/egl/EGLCore;", "eglCore", "Lcom/mapbox/maps/renderer/FpsManager;", "fpsManager", "Lcom/mapbox/maps/renderer/gl/TextureRenderer;", "widgetTextureRenderer", "Ljava/util/concurrent/locks/ReentrantLock;", "surfaceProcessingLock", "Ljava/util/concurrent/locks/Condition;", "createCondition", "destroyCondition", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;Lcom/mapbox/maps/renderer/RenderHandlerThread;Lcom/mapbox/maps/renderer/egl/EGLCore;Lcom/mapbox/maps/renderer/FpsManager;Lcom/mapbox/maps/renderer/gl/TextureRenderer;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;)V", "width", "height", "", "onSurfaceSizeChanged", "(II)V", "onSurfaceDestroyed", "()V", "Lcom/mapbox/maps/renderer/widget/Widget;", "widget", "addWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)V", "removeWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)Z", "Landroid/view/Surface;", "surface", "processAndroidSurface$maps_sdk_release", "(Landroid/view/Surface;II)V", "processAndroidSurface", "refreshRate", "setScreenRefreshRate", "(I)V", "onSurfaceCreated", "fps", "setUserRefreshRate", "", "frameTimeNanos", "doFrame", "(J)V", "Lcom/mapbox/maps/renderer/RenderEvent;", "renderEvent", "queueRenderEvent", "(Lcom/mapbox/maps/renderer/RenderEvent;)V", "scheduleThreadServiceTypeReset", "pause", "resume", "destroy$maps_sdk_release", "destroy", "sectionName", "Lkotlin/Function0;", "section", "trace", "(Ljava/lang/String;Le23/a;)V", "delayMillis", "postPrepareRenderFrame", "creatingSurface", "setUpRenderThread", "(Z)Z", "checkEglConfig", "()Z", "checkAndroidSurface", "checkEglSurface", "(Landroid/view/Surface;)Z", "checkEglContextCurrent", "checkSurfaceSizeChanged", "checkWidgetRender", "resetGlState", "draw", "swapBuffers", "releaseEglSurface", "tryRecreate", "releaseAll", "(Z)V", "prepareRenderFrame", "block", "renderPreparedGuardedRun", "(Le23/a;)V", "postNonRenderEvent", "(Lcom/mapbox/maps/renderer/RenderEvent;J)V", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "originalQueue", "drainQueue", "(Ljava/util/concurrent/ConcurrentLinkedQueue;)V", "renderHandlerThread", "Lcom/mapbox/maps/renderer/RenderHandlerThread;", "getRenderHandlerThread$maps_sdk_release", "()Lcom/mapbox/maps/renderer/RenderHandlerThread;", "Z", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "Lcom/mapbox/maps/renderer/egl/EGLCore;", "getEglCore$maps_sdk_release", "()Lcom/mapbox/maps/renderer/egl/EGLCore;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "renderEventQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "getRenderEventQueue$maps_sdk_release", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "getRenderEventQueue$maps_sdk_release$annotations", "nonRenderEventQueue", "getNonRenderEventQueue$maps_sdk_release", "getNonRenderEventQueue$maps_sdk_release$annotations", "Landroid/view/Surface;", "getSurface$maps_sdk_release", "()Landroid/view/Surface;", "setSurface$maps_sdk_release", "(Landroid/view/Surface;)V", "getSurface$maps_sdk_release$annotations", "Landroid/opengl/EGLSurface;", "eglSurface", "Landroid/opengl/EGLSurface;", "getEglSurface$maps_sdk_release", "()Landroid/opengl/EGLSurface;", "setEglSurface$maps_sdk_release", "(Landroid/opengl/EGLSurface;)V", "getEglSurface$maps_sdk_release$annotations", "I", "widgetRenderer", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "widgetRenderCreated", "Lcom/mapbox/maps/renderer/gl/TextureRenderer;", "Lcom/mapbox/maps/ContextMode;", "awaitingNextVsync", "getAwaitingNextVsync$maps_sdk_release", "setAwaitingNextVsync$maps_sdk_release", "getAwaitingNextVsync$maps_sdk_release$annotations", "sizeChanged", "paused", "getPaused$maps_sdk_release", "setPaused$maps_sdk_release", "getPaused$maps_sdk_release$annotations", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "renderThreadStatsRecorder", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "getRenderThreadStatsRecorder$maps_sdk_release", "()Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "setRenderThreadStatsRecorder$maps_sdk_release", "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V", "getRenderThreadStatsRecorder$maps_sdk_release$annotations", "Landroid/os/Handler;", "mainHandler$delegate", "Lo13/l;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler", "value", "nativeRenderCreated", "setNativeRenderCreated", "eglContextMadeCurrent", "getEglContextMadeCurrent$maps_sdk_release", "setEglContextMadeCurrent$maps_sdk_release", "getEglContextMadeCurrent$maps_sdk_release$annotations", "renderThreadPreparedLock", "eglContextCreated", "renderNotSupported", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "<set-?>", "fpsChangedListener$delegate", "Lg23/e;", "getFpsChangedListener$maps_sdk_release", "()Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setFpsChangedListener$maps_sdk_release", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "fpsChangedListener", "Lcom/mapbox/maps/renderer/FpsManager;", "needViewAnnotationSync", "getNeedViewAnnotationSync$maps_sdk_release", "setNeedViewAnnotationSync$maps_sdk_release", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "viewAnnotationMode", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "getViewAnnotationMode$maps_sdk_release", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "setViewAnnotationMode$maps_sdk_release", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V", "TAG", "Ljava/lang/String;", "getTAG$annotations", "Ljava/lang/Runnable;", "prepareRenderFrameRunnable", "Ljava/lang/Runnable;", "getRenderThreadPrepared", "renderThreadPrepared", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxRenderThread implements Choreographer.FrameCallback {
    static final /* synthetic */ l<Object>[] $$delegatedProperties = {s0.f105811a.f(new b0(MapboxRenderThread.class, "fpsChangedListener", "getFpsChangedListener$maps_sdk_release()Lcom/mapbox/maps/renderer/OnFpsChangedListener;", 0))};
    public static final long RESET_THREAD_SERVICE_TYPE_DELAY_MS = 300;
    public static final long RETRY_DELAY_MS = 50;
    private final String TAG;
    private volatile boolean awaitingNextVsync;
    private final ContextMode contextMode;
    private final Condition createCondition;
    private final Condition destroyCondition;
    private boolean eglContextCreated;
    private boolean eglContextMadeCurrent;
    private final EGLCore eglCore;
    private EGLSurface eglSurface;

    /* JADX INFO: renamed from: fpsChangedListener$delegate, reason: from kotlin metadata */
    private final g23.e fpsChangedListener;
    private final FpsManager fpsManager;
    private int height;

    /* JADX INFO: renamed from: mainHandler$delegate, reason: from kotlin metadata */
    private final o13.l mainHandler;
    private final MapboxRenderer mapboxRenderer;
    private boolean nativeRenderCreated;
    private boolean needViewAnnotationSync;
    private final ConcurrentLinkedQueue<RenderEvent> nonRenderEventQueue;
    private volatile boolean paused;
    private final Runnable prepareRenderFrameRunnable;
    private final ConcurrentLinkedQueue<RenderEvent> renderEventQueue;
    private final RenderHandlerThread renderHandlerThread;
    private boolean renderNotSupported;
    private final ReentrantLock renderThreadPreparedLock;
    private RenderThreadStatsRecorder renderThreadStatsRecorder;
    private boolean sizeChanged;
    private Surface surface;
    private final ReentrantLock surfaceProcessingLock;
    private final boolean translucentSurface;
    private volatile ViewAnnotationUpdateMode viewAnnotationMode;
    private boolean widgetRenderCreated;
    private final MapboxWidgetRenderer widgetRenderer;
    private final TextureRenderer widgetTextureRenderer;
    private int width;

    public MapboxRenderThread(MapboxRenderer mapboxRenderer, MapboxWidgetRenderer mapboxWidgetRenderer, boolean z14, int i14, ContextMode contextMode, String str) {
        mapboxRenderer.getClass();
        mapboxWidgetRenderer.getClass();
        contextMode.getClass();
        str.getClass();
        this.renderEventQueue = new ConcurrentLinkedQueue<>();
        this.nonRenderEventQueue = new ConcurrentLinkedQueue<>();
        this.mainHandler = m.b(MapboxRenderThread$mainHandler$2.INSTANCE);
        this.renderThreadPreparedLock = new ReentrantLock();
        g23.a aVar = g23.a.f75578a;
        final j jVar = null;
        this.fpsChangedListener = new g23.c<OnFpsChangedListener>(jVar) { // from class: com.mapbox.maps.renderer.MapboxRenderThread$special$$inlined$observable$1
            @Override // g23.c
            public void afterChange(l<?> property, OnFpsChangedListener oldValue, OnFpsChangedListener newValue) {
                property.getClass();
                OnFpsChangedListener onFpsChangedListener = newValue;
                if (s.g(oldValue, onFpsChangedListener)) {
                    return;
                }
                MapboxRenderThread mapboxRenderThread = this;
                MapboxRenderThread.postNonRenderEvent$default(mapboxRenderThread, new RenderEvent(new MapboxRenderThread$fpsChangedListener$2$1(mapboxRenderThread, onFpsChangedListener), false), 0L, 2, null);
            }
        };
        this.viewAnnotationMode = ViewAnnotationManager.DEFAULT_UPDATE_MODE;
        this.prepareRenderFrameRunnable = new c(this, 0);
        this.translucentSurface = z14;
        this.mapboxRenderer = mapboxRenderer;
        this.widgetRenderer = mapboxWidgetRenderer;
        this.TAG = "Mbgl-RenderThread".concat(!w.J(str) ? "\\".concat(str) : "");
        EGLCore eGLCore = new EGLCore(z14, i14, null, str, 4, null);
        this.eglCore = eGLCore;
        this.eglSurface = eGLCore.getEglNoSurface();
        this.widgetTextureRenderer = new TextureRenderer(0.0f, 1, jVar);
        this.contextMode = contextMode;
        RenderHandlerThread renderHandlerThread = new RenderHandlerThread(str);
        this.renderHandlerThread = renderHandlerThread;
        this.fpsManager = new FpsManager(renderHandlerThread.start(), str);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.surfaceProcessingLock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        this.createCondition = conditionNewCondition;
        Condition conditionNewCondition2 = reentrantLock.newCondition();
        conditionNewCondition2.getClass();
        this.destroyCondition = conditionNewCondition2;
    }

    private final boolean checkAndroidSurface() {
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            return true;
        }
        String str = this.TAG;
        StringBuilder sb3 = new StringBuilder("EGL was configured but Android surface.isValid=");
        Surface surface2 = this.surface;
        sb3.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        sb3.append(", waiting for a new one...");
        MapboxLogger.logW(str, sb3.toString());
        postPrepareRenderFrame(50L);
        return false;
    }

    private final boolean checkEglConfig() {
        if (!this.eglContextCreated) {
            if (!this.eglCore.prepareEgl()) {
                MapboxLogger.logE(this.TAG, "EGL was not configured, please check logs above.");
                this.renderNotSupported = true;
                return false;
            }
            this.eglContextCreated = true;
        }
        return true;
    }

    private final boolean checkEglContextCurrent() {
        if (this.eglCore.makeCurrent(this.eglSurface)) {
            return true;
        }
        MapboxLogger.logW(this.TAG, "EGL was configured but context could not be made current. Trying again in a moment...");
        postPrepareRenderFrame(50L);
        return false;
    }

    private final boolean checkEglSurface(Surface surface) {
        if (!s.g(this.eglSurface, this.eglCore.getEglNoSurface())) {
            return true;
        }
        EGLSurface eGLSurfaceCreateWindowSurface = this.eglCore.createWindowSurface(surface);
        this.eglSurface = eGLSurfaceCreateWindowSurface;
        if (!s.g(eGLSurfaceCreateWindowSurface, this.eglCore.getEglNoSurface())) {
            return true;
        }
        MapboxLogger.logW(this.TAG, "Could not create EGL surface although Android surface was valid, retrying in 50 ms...");
        postPrepareRenderFrame(50L);
        return false;
    }

    private final void checkSurfaceSizeChanged() {
        if (this.sizeChanged) {
            this.mapboxRenderer.onSurfaceChanged(this.width, this.height);
            this.widgetRenderer.onSurfaceChanged(this.width, this.height);
            this.sizeChanged = false;
        }
    }

    private final void checkWidgetRender() {
        if (this.eglContextCreated && !this.widgetRenderCreated && this.widgetRenderer.hasWidgets()) {
            this.widgetRenderer.setSharedContext(this.eglCore.getEglContext());
            this.widgetRenderCreated = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy$lambda$29$lambda$28$lambda$27(MapboxRenderThread mapboxRenderThread) {
        boolean z14;
        mapboxRenderThread.getClass();
        mapboxRenderThread.surfaceProcessingLock.lock();
        boolean z15 = true;
        try {
            if (mapboxRenderThread.eglContextMadeCurrent) {
                z14 = true;
            } else {
                mapboxRenderThread.destroyCondition.signal();
                mapboxRenderThread.surfaceProcessingLock.unlock();
                z14 = false;
            }
            try {
                if (mapboxRenderThread.nativeRenderCreated) {
                    releaseAll$default(mapboxRenderThread, false, 1, null);
                }
                mapboxRenderThread.renderHandlerThread.clearRenderEventQueue();
                mapboxRenderThread.fpsManager.destroy();
                mapboxRenderThread.eglCore.clearRendererStateListeners$maps_sdk_release();
                mapboxRenderThread.mapboxRenderer.setMap$maps_sdk_release(null);
                mapboxRenderThread.renderHandlerThread.stop();
                if (z14) {
                    mapboxRenderThread.destroyCondition.signal();
                    mapboxRenderThread.surfaceProcessingLock.unlock();
                    return;
                }
                ReentrantLock reentrantLock = mapboxRenderThread.surfaceProcessingLock;
                reentrantLock.lock();
                try {
                    mapboxRenderThread.createCondition.signal();
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    ReentrantLock reentrantLock2 = mapboxRenderThread.surfaceProcessingLock;
                    reentrantLock2.lock();
                    try {
                        mapboxRenderThread.destroyCondition.signal();
                    } finally {
                        reentrantLock2.unlock();
                    }
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            } catch (Throwable th4) {
                boolean z16 = z14;
                th = th4;
                z15 = z16;
                if (z15) {
                    mapboxRenderThread.destroyCondition.signal();
                    mapboxRenderThread.surfaceProcessingLock.unlock();
                } else {
                    ReentrantLock reentrantLock3 = mapboxRenderThread.surfaceProcessingLock;
                    reentrantLock3.lock();
                    try {
                        mapboxRenderThread.createCondition.signal();
                        Unit unit2 = Unit.INSTANCE;
                        reentrantLock3.unlock();
                        ReentrantLock reentrantLock4 = mapboxRenderThread.surfaceProcessingLock;
                        reentrantLock4.lock();
                        try {
                            mapboxRenderThread.destroyCondition.signal();
                        } finally {
                            reentrantLock4.unlock();
                        }
                    } catch (Throwable th5) {
                        reentrantLock3.unlock();
                        throw th5;
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private final void drainQueue(ConcurrentLinkedQueue<RenderEvent> originalQueue) {
        RenderEvent renderEventPoll = originalQueue.poll();
        while (renderEventPoll != null) {
            Runnable runnable = renderEventPoll.getRunnable();
            if (runnable != null) {
                runnable.run();
            }
            renderEventPoll = originalQueue.poll();
        }
    }

    private final void draw(long frameTimeNanos) {
        FpsManager fpsManager = this.fpsManager;
        RenderThreadStatsRecorder renderThreadStatsRecorder = this.renderThreadStatsRecorder;
        if (!fpsManager.preRender(frameTimeNanos, renderThreadStatsRecorder != null && renderThreadStatsRecorder.isRecording())) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        if (this.contextMode == ContextMode.SHARED) {
            GLES20.glClear(17664);
        }
        if (this.widgetRenderer.hasWidgets()) {
            if (this.widgetRenderer.getNeedRender()) {
                this.widgetRenderer.renderToFrameBuffer();
                this.eglCore.makeCurrent(this.eglSurface);
            }
            this.mapboxRenderer.render();
            resetGlState();
            if (this.widgetRenderer.hasTexture()) {
                this.widgetTextureRenderer.render(this.widgetRenderer.getTexture());
            }
        } else {
            this.mapboxRenderer.render();
        }
        drainQueue(this.renderEventQueue);
        this.fpsManager.postRender();
        if (this.needViewAnnotationSync && s.g(this.viewAnnotationMode, ViewAnnotationUpdateMode.MAP_SYNCHRONIZED)) {
            Choreographer.getInstance().postFrameCallback(new b(this, 0));
            GLES20.glFlush();
        } else {
            swapBuffers();
        }
        this.needViewAnnotationSync = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draw$lambda$6(MapboxRenderThread mapboxRenderThread, long j8) {
        mapboxRenderThread.getClass();
        mapboxRenderThread.swapBuffers();
    }

    public static /* synthetic */ void getAwaitingNextVsync$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getEglContextMadeCurrent$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getEglSurface$maps_sdk_release$annotations() {
    }

    private final Handler getMainHandler() {
        return (Handler) this.mainHandler.getValue();
    }

    public static /* synthetic */ void getNonRenderEventQueue$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getPaused$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getRenderEventQueue$maps_sdk_release$annotations() {
    }

    private final boolean getRenderThreadPrepared() {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            return this.eglContextMadeCurrent && this.nativeRenderCreated;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static /* synthetic */ void getRenderThreadStatsRecorder$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getSurface$maps_sdk_release$annotations() {
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceCreated$lambda$18$lambda$17$lambda$16(MapboxRenderThread mapboxRenderThread, Surface surface, int i14, int i15) {
        mapboxRenderThread.getClass();
        surface.getClass();
        mapboxRenderThread.processAndroidSurface$maps_sdk_release(surface, i14, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceDestroyed$lambda$14$lambda$13$lambda$12(MapboxRenderThread mapboxRenderThread) {
        mapboxRenderThread.getClass();
        mapboxRenderThread.awaitingNextVsync = false;
        Choreographer.getInstance().removeFrameCallback(mapboxRenderThread);
        ReentrantLock reentrantLock = mapboxRenderThread.surfaceProcessingLock;
        reentrantLock.lock();
        try {
            if (mapboxRenderThread.nativeRenderCreated && (mapboxRenderThread.mapboxRenderer instanceof MapboxTextureViewRenderer)) {
                releaseAll$default(mapboxRenderThread, false, 1, null);
                mapboxRenderThread.renderHandlerThread.clearRenderEventQueue();
            } else {
                mapboxRenderThread.releaseEglSurface();
            }
            mapboxRenderThread.fpsManager.onSurfaceDestroyed();
            mapboxRenderThread.destroyCondition.signal();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceSizeChanged$lambda$10(MapboxRenderThread mapboxRenderThread, int i14, int i15) {
        mapboxRenderThread.getClass();
        mapboxRenderThread.width = i14;
        mapboxRenderThread.height = i15;
        mapboxRenderThread.sizeChanged = true;
        prepareRenderFrame$default(mapboxRenderThread, false, 1, null);
    }

    private final void postNonRenderEvent(RenderEvent renderEvent, long delayMillis) {
        if (this.awaitingNextVsync) {
            this.nonRenderEventQueue.add(renderEvent);
        } else {
            this.renderHandlerThread.postDelayed(new cd0.f(26, this, renderEvent), delayMillis);
        }
    }

    public static /* synthetic */ void postNonRenderEvent$default(MapboxRenderThread mapboxRenderThread, RenderEvent renderEvent, long j8, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            j8 = 0;
        }
        mapboxRenderThread.postNonRenderEvent(renderEvent, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postNonRenderEvent$lambda$23(MapboxRenderThread mapboxRenderThread, RenderEvent renderEvent) {
        mapboxRenderThread.getClass();
        renderEvent.getClass();
        if (mapboxRenderThread.getRenderThreadPrepared()) {
            Runnable runnable = renderEvent.getRunnable();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (mapboxRenderThread.paused) {
            mapboxRenderThread.nonRenderEventQueue.add(renderEvent);
        } else {
            MapboxLogger.logW(mapboxRenderThread.TAG, "Non-render event could not be run, retrying in 50 ms...");
            mapboxRenderThread.postNonRenderEvent(renderEvent, 50L);
        }
    }

    private final void postPrepareRenderFrame(long delayMillis) {
        this.renderHandlerThread.postDelayed(this.prepareRenderFrameRunnable, delayMillis);
    }

    public static /* synthetic */ void postPrepareRenderFrame$default(MapboxRenderThread mapboxRenderThread, long j8, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = 0;
        }
        mapboxRenderThread.postPrepareRenderFrame(j8);
    }

    private final void prepareRenderFrame(boolean creatingSurface) {
        if (!this.awaitingNextVsync || creatingSurface) {
            if ((this.renderNotSupported || this.paused) && !creatingSurface) {
                MapboxLogger.logI(this.TAG, "Skip render frame - NOT creating surface although renderNotSupported (" + this.renderNotSupported + ") || paused (" + this.paused + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return;
            }
            if (creatingSurface || !getRenderThreadPrepared()) {
                if (MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
                    Trace.beginSection("mbx: set-up-render-thread");
                    try {
                        if (!setUpRenderThread(creatingSurface)) {
                            String str = this.TAG;
                            StringBuilder sb3 = new StringBuilder("Skip render frame - render thread NOT prepared although creatingSurface (");
                            sb3.append(creatingSurface);
                            sb3.append(") || !renderThreadPrepared (");
                            sb3.append(!getRenderThreadPrepared());
                            sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                            MapboxLogger.logI(str, sb3.toString());
                        }
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } else if (!setUpRenderThread(creatingSurface)) {
                    String str2 = this.TAG;
                    StringBuilder sb4 = new StringBuilder("Skip render frame - render thread NOT prepared although creatingSurface (");
                    sb4.append(creatingSurface);
                    sb4.append(") || !renderThreadPrepared (");
                    sb4.append(!getRenderThreadPrepared());
                    sb4.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                    MapboxLogger.logI(str2, sb4.toString());
                }
            }
            checkWidgetRender();
            checkSurfaceSizeChanged();
            Choreographer.getInstance().postFrameCallback(this);
            this.awaitingNextVsync = true;
        }
    }

    public static /* synthetic */ void prepareRenderFrame$default(MapboxRenderThread mapboxRenderThread, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        mapboxRenderThread.prepareRenderFrame(z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareRenderFrameRunnable$lambda$4(MapboxRenderThread mapboxRenderThread) {
        mapboxRenderThread.getClass();
        prepareRenderFrame$default(mapboxRenderThread, false, 1, null);
    }

    private final void releaseAll(boolean tryRecreate) {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            this.mapboxRenderer.destroyRenderer();
            MapboxLogger.logI(this.TAG, "Native renderer destroyed.");
            this.renderEventQueue.clear();
            this.nonRenderEventQueue.clear();
            setNativeRenderCreated(false);
            releaseEglSurface();
            if (this.eglContextCreated) {
                this.eglCore.release();
            }
            this.eglContextCreated = false;
            if (tryRecreate) {
                setUpRenderThread(true);
                return;
            }
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                return;
            }
            return;
        }
        Trace.beginSection("mbx: release-egl-all");
        try {
            this.mapboxRenderer.destroyRenderer();
            MapboxLogger.logI(this.TAG, "Native renderer destroyed.");
            this.renderEventQueue.clear();
            this.nonRenderEventQueue.clear();
            setNativeRenderCreated(false);
            releaseEglSurface();
            if (this.eglContextCreated) {
                this.eglCore.release();
            }
            this.eglContextCreated = false;
            if (tryRecreate) {
                setUpRenderThread(true);
            } else {
                Surface surface2 = this.surface;
                if (surface2 != null) {
                    surface2.release();
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public static /* synthetic */ void releaseAll$default(MapboxRenderThread mapboxRenderThread, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        mapboxRenderThread.releaseAll(z14);
    }

    private final void releaseEglSurface() {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            this.widgetTextureRenderer.release();
            this.eglCore.releaseSurface(this.eglSurface);
            setEglContextMadeCurrent$maps_sdk_release(false);
            this.eglSurface = this.eglCore.getEglNoSurface();
            this.widgetRenderCreated = false;
            this.widgetRenderer.release();
            return;
        }
        Trace.beginSection("mbx: release-egl-surface");
        try {
            this.widgetTextureRenderer.release();
            this.eglCore.releaseSurface(this.eglSurface);
            setEglContextMadeCurrent$maps_sdk_release(false);
            this.eglSurface = this.eglCore.getEglNoSurface();
            this.widgetRenderCreated = false;
            this.widgetRenderer.release();
        } finally {
            Trace.endSection();
        }
    }

    private final void renderPreparedGuardedRun(final e23.a<Unit> block) {
        if (getRenderThreadPrepared()) {
            block.invoke();
            return;
        }
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            MapboxLogger.logI(this.TAG, "renderThreadPrepared=false but Android surface is valid, trying to recreate EGL...");
            this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread.renderPreparedGuardedRun.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!MapboxRenderThread.this.setUpRenderThread(true)) {
                        MapboxLogger.logI(MapboxRenderThread.this.TAG, "Setting up render thread failed, check logs above.");
                    } else {
                        block.invoke();
                        MapboxLogger.logI(MapboxRenderThread.this.TAG, "Setting up render thread was OK, map should render again!");
                    }
                }
            });
        } else {
            if (this.paused) {
                return;
            }
            String str = this.TAG;
            StringBuilder sb3 = new StringBuilder("renderThreadPrepared=false and Android surface is not valid (isValid=");
            Surface surface2 = this.surface;
            sb3.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
            sb3.append("). Waiting for new one.");
            MapboxLogger.logI(str, sb3.toString());
        }
    }

    private final void resetGlState() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        GLES20.glBlendEquation(32774);
        GLES20.glDisable(2960);
        GLES20.glDisable(2929);
        GLES20.glUseProgram(0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleThreadServiceTypeReset$lambda$24(MapboxRenderThread mapboxRenderThread) {
        mapboxRenderThread.getClass();
        MapboxLogger.logI(mapboxRenderThread.TAG, "Executing thread service type reset from " + Thread.currentThread().getName() + " thread");
        mapboxRenderThread.mapboxRenderer.resetThreadServiceType();
    }

    private final void setNativeRenderCreated(boolean z14) {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            this.nativeRenderCreated = z14;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setScreenRefreshRate$lambda$15(MapboxRenderThread mapboxRenderThread, int i14) {
        mapboxRenderThread.getClass();
        mapboxRenderThread.fpsManager.setScreenRefreshRate(i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setUpRenderThread(boolean creatingSurface) {
        ReentrantLock reentrantLock = this.surfaceProcessingLock;
        reentrantLock.lock();
        try {
            try {
                MapboxLogger.logI(this.TAG, "Setting up render thread, flags: creatingSurface=" + creatingSurface + ", nativeRenderCreated=" + this.nativeRenderCreated + ", eglContextMadeCurrent=" + this.eglContextMadeCurrent + ", eglContextCreated=" + this.eglContextCreated + ", paused=" + this.paused);
                boolean zCheckEglConfig = checkEglConfig();
                boolean zCheckAndroidSurface = checkAndroidSurface();
                if (zCheckEglConfig && zCheckAndroidSurface) {
                    if (creatingSurface) {
                        this.eglCore.makeNothingCurrent();
                    }
                    Surface surface = this.surface;
                    surface.getClass();
                    if (checkEglSurface(surface)) {
                        setEglContextMadeCurrent$maps_sdk_release(checkEglContextCurrent());
                        if (this.eglContextMadeCurrent) {
                            if (!this.nativeRenderCreated) {
                                setNativeRenderCreated(true);
                                this.mapboxRenderer.createRenderer();
                                MapboxLogger.logI(this.TAG, "Native renderer created.");
                                this.mapboxRenderer.onSurfaceChanged(this.width, this.height);
                            }
                            this.createCondition.signal();
                            reentrantLock.unlock();
                            return true;
                        }
                    }
                }
                this.createCondition.signal();
                reentrantLock.unlock();
                return false;
            } catch (Throwable th3) {
                this.createCondition.signal();
                throw th3;
            }
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUserRefreshRate$lambda$19(MapboxRenderThread mapboxRenderThread, int i14) {
        mapboxRenderThread.getClass();
        mapboxRenderThread.fpsManager.setUserRefreshRate(i14);
    }

    private final void swapBuffers() {
        int iSwapBuffers = this.eglCore.swapBuffers(this.eglSurface);
        if (iSwapBuffers != 12288) {
            String str = this.TAG;
            if (iSwapBuffers == 12302) {
                MapboxLogger.logW(str, "Context lost. Waiting for re-acquire");
                releaseAll(true);
                return;
            }
            MapboxLogger.logW(str, "eglSwapBuffer error: " + iSwapBuffers + ". Waiting for new surface");
            releaseEglSurface();
        }
    }

    private final void trace(String sectionName, e23.a<Unit> section) {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            section.invoke();
            return;
        }
        Trace.beginSection("mbx: " + sectionName);
        try {
            section.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public final void addWidget(Widget widget) {
        widget.getClass();
        this.widgetRenderer.addWidget(widget);
    }

    public final void destroy$maps_sdk_release() {
        int i14 = 1;
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            MapboxLogger.logI(this.TAG, "destroy");
            ReentrantLock reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new c(this, i14));
                    MapboxLogger.logI(this.TAG, "destroy: waiting until all resources will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "destroy: all resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "destroy: render thread is not running.");
                }
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        Trace.beginSection("mbx: destroy");
        try {
            MapboxLogger.logI(this.TAG, "destroy");
            ReentrantLock reentrantLock2 = this.surfaceProcessingLock;
            reentrantLock2.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new c(this, i14));
                    MapboxLogger.logI(this.TAG, "destroy: waiting until all resources will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "destroy: all resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "destroy: render thread is not running.");
                }
                Unit unit2 = Unit.INSTANCE;
                reentrantLock2.unlock();
                Trace.endSection();
            } catch (Throwable th3) {
                reentrantLock2.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        RenderThreadStatsRecorder renderThreadStatsRecorder;
        RenderThreadStatsRecorder renderThreadStatsRecorder2;
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            RenderThreadStatsRecorder renderThreadStatsRecorder3 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos = (renderThreadStatsRecorder3 == null || !renderThreadStatsRecorder3.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (getRenderThreadPrepared() && !this.paused) {
                draw(frameTimeNanos);
            }
            this.awaitingNextVsync = false;
            drainQueue(this.nonRenderEventQueue);
            RenderThreadStatsRecorder renderThreadStatsRecorder4 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos2 = (renderThreadStatsRecorder4 == null || !renderThreadStatsRecorder4.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (jElapsedRealtimeNanos == 0 || jElapsedRealtimeNanos2 == 0 || (renderThreadStatsRecorder = this.renderThreadStatsRecorder) == null) {
                return;
            }
            renderThreadStatsRecorder.addFrameStats$maps_sdk_release((jElapsedRealtimeNanos2 - jElapsedRealtimeNanos) / 1000000.0d, this.fpsManager.getSkippedNow());
            return;
        }
        Trace.beginSection("mbx: do-frame");
        try {
            RenderThreadStatsRecorder renderThreadStatsRecorder5 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos3 = (renderThreadStatsRecorder5 == null || !renderThreadStatsRecorder5.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (getRenderThreadPrepared() && !this.paused) {
                draw(frameTimeNanos);
            }
            this.awaitingNextVsync = false;
            drainQueue(this.nonRenderEventQueue);
            RenderThreadStatsRecorder renderThreadStatsRecorder6 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos4 = (renderThreadStatsRecorder6 == null || !renderThreadStatsRecorder6.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (jElapsedRealtimeNanos3 != 0 && jElapsedRealtimeNanos4 != 0 && (renderThreadStatsRecorder2 = this.renderThreadStatsRecorder) != null) {
                renderThreadStatsRecorder2.addFrameStats$maps_sdk_release((jElapsedRealtimeNanos4 - jElapsedRealtimeNanos3) / 1000000.0d, this.fpsManager.getSkippedNow());
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: getAwaitingNextVsync$maps_sdk_release, reason: from getter */
    public final boolean getAwaitingNextVsync() {
        return this.awaitingNextVsync;
    }

    /* JADX INFO: renamed from: getEglContextMadeCurrent$maps_sdk_release, reason: from getter */
    public final boolean getEglContextMadeCurrent() {
        return this.eglContextMadeCurrent;
    }

    /* JADX INFO: renamed from: getEglCore$maps_sdk_release, reason: from getter */
    public final EGLCore getEglCore() {
        return this.eglCore;
    }

    /* JADX INFO: renamed from: getEglSurface$maps_sdk_release, reason: from getter */
    public final EGLSurface getEglSurface() {
        return this.eglSurface;
    }

    public final OnFpsChangedListener getFpsChangedListener$maps_sdk_release() {
        return (OnFpsChangedListener) this.fpsChangedListener.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: renamed from: getNeedViewAnnotationSync$maps_sdk_release, reason: from getter */
    public final boolean getNeedViewAnnotationSync() {
        return this.needViewAnnotationSync;
    }

    public final ConcurrentLinkedQueue<RenderEvent> getNonRenderEventQueue$maps_sdk_release() {
        return this.nonRenderEventQueue;
    }

    /* JADX INFO: renamed from: getPaused$maps_sdk_release, reason: from getter */
    public final boolean getPaused() {
        return this.paused;
    }

    public final ConcurrentLinkedQueue<RenderEvent> getRenderEventQueue$maps_sdk_release() {
        return this.renderEventQueue;
    }

    /* JADX INFO: renamed from: getRenderHandlerThread$maps_sdk_release, reason: from getter */
    public final RenderHandlerThread getRenderHandlerThread() {
        return this.renderHandlerThread;
    }

    /* JADX INFO: renamed from: getRenderThreadStatsRecorder$maps_sdk_release, reason: from getter */
    public final RenderThreadStatsRecorder getRenderThreadStatsRecorder() {
        return this.renderThreadStatsRecorder;
    }

    /* JADX INFO: renamed from: getSurface$maps_sdk_release, reason: from getter */
    public final Surface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: getViewAnnotationMode$maps_sdk_release, reason: from getter */
    public final ViewAnnotationUpdateMode getViewAnnotationMode() {
        return this.viewAnnotationMode;
    }

    public final void onSurfaceCreated(final Surface surface, final int width, final int height) {
        surface.getClass();
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            MapboxLogger.logI(this.TAG, "onSurfaceCreated");
            ReentrantLock reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            MapboxRenderThread.onSurfaceCreated$lambda$18$lambda$17$lambda$16(this.f54606a, surface, width, height);
                        }
                    });
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: waiting Android surface to be processed...");
                    this.createCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: Android surface was processed.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: render thread is not running.");
                }
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        Trace.beginSection("mbx: surface-created");
        try {
            MapboxLogger.logI(this.TAG, "onSurfaceCreated");
            ReentrantLock reentrantLock2 = this.surfaceProcessingLock;
            reentrantLock2.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            MapboxRenderThread.onSurfaceCreated$lambda$18$lambda$17$lambda$16(this.f54606a, surface, width, height);
                        }
                    });
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: waiting Android surface to be processed...");
                    this.createCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: Android surface was processed.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: render thread is not running.");
                }
                Unit unit2 = Unit.INSTANCE;
                reentrantLock2.unlock();
                Trace.endSection();
            } catch (Throwable th3) {
                reentrantLock2.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void onSurfaceDestroyed() {
        int i14 = 2;
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            MapboxLogger.logI(this.TAG, "onSurfaceDestroyed");
            ReentrantLock reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new c(this, i14));
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: waiting until EGL will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: EGL resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: render thread is not running.");
                }
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        Trace.beginSection("mbx: surface-destroyed");
        try {
            MapboxLogger.logI(this.TAG, "onSurfaceDestroyed");
            ReentrantLock reentrantLock2 = this.surfaceProcessingLock;
            reentrantLock2.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new c(this, i14));
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: waiting until EGL will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: EGL resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: render thread is not running.");
                }
                Unit unit2 = Unit.INSTANCE;
                reentrantLock2.unlock();
                Trace.endSection();
            } catch (Throwable th3) {
                reentrantLock2.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void onSurfaceSizeChanged(int width, int height) {
        if (this.width == width && this.height == height) {
            return;
        }
        this.renderHandlerThread.post(new com.mapbox.maps.d(this, width, height, 1));
    }

    public final void pause() {
        this.paused = true;
        MapboxLogger.logI(this.TAG, "Renderer paused");
    }

    public final void processAndroidSurface$maps_sdk_release(Surface surface, int width, int height) {
        surface.getClass();
        if (!s.g(this.surface, surface)) {
            if (this.surface != null) {
                MapboxLogger.logI(this.TAG, "Processing new android surface while current is not null, releasing current EGL and recreating native renderer.");
                releaseAll$default(this, false, 1, null);
            }
            this.surface = surface;
        }
        this.width = width;
        this.height = height;
        this.widgetRenderer.onSurfaceChanged(width, height);
        prepareRenderFrame(true);
    }

    public final void queueRenderEvent(RenderEvent renderEvent) {
        renderEvent.getClass();
        if (!renderEvent.getNeedRender()) {
            postNonRenderEvent$default(this, renderEvent, 0L, 2, null);
            return;
        }
        if (renderEvent.getRunnable() != null) {
            this.renderEventQueue.add(renderEvent);
        }
        if (getRenderThreadPrepared()) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            MapboxLogger.logI(this.TAG, "renderThreadPrepared=false but Android surface is valid, trying to recreate EGL...");
            this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$queueRenderEvent$$inlined$renderPreparedGuardedRun$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!this.this$0$inline_fun.setUpRenderThread(true)) {
                        MapboxLogger.logI(this.this$0$inline_fun.TAG, "Setting up render thread failed, check logs above.");
                    } else {
                        MapboxRenderThread.postPrepareRenderFrame$default(this, 0L, 1, null);
                        MapboxLogger.logI(this.this$0$inline_fun.TAG, "Setting up render thread was OK, map should render again!");
                    }
                }
            });
        } else {
            if (this.paused) {
                return;
            }
            String str = this.TAG;
            StringBuilder sb3 = new StringBuilder("renderThreadPrepared=false and Android surface is not valid (isValid=");
            Surface surface2 = this.surface;
            sb3.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
            sb3.append("). Waiting for new one.");
            MapboxLogger.logI(str, sb3.toString());
        }
    }

    public final boolean removeWidget(Widget widget) {
        widget.getClass();
        return this.widgetRenderer.removeWidget(widget);
    }

    public final void resume() {
        this.paused = false;
        String str = this.TAG;
        StringBuilder sb3 = new StringBuilder("Renderer resumed, renderThreadPrepared=");
        sb3.append(getRenderThreadPrepared());
        sb3.append(", surface.isValid=");
        Surface surface = this.surface;
        sb3.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        MapboxLogger.logI(str, sb3.toString());
        if (getRenderThreadPrepared()) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        Surface surface2 = this.surface;
        if (surface2 != null && surface2.isValid()) {
            MapboxLogger.logI(this.TAG, "renderThreadPrepared=false but Android surface is valid, trying to recreate EGL...");
            this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$resume$$inlined$renderPreparedGuardedRun$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!this.this$0.setUpRenderThread(true)) {
                        MapboxLogger.logI(this.this$0.TAG, "Setting up render thread failed, check logs above.");
                    } else {
                        MapboxRenderThread.postPrepareRenderFrame$default(this, 0L, 1, null);
                        MapboxLogger.logI(this.this$0.TAG, "Setting up render thread was OK, map should render again!");
                    }
                }
            });
        } else {
            if (this.paused) {
                return;
            }
            String str2 = this.TAG;
            StringBuilder sb4 = new StringBuilder("renderThreadPrepared=false and Android surface is not valid (isValid=");
            Surface surface3 = this.surface;
            sb4.append(surface3 != null ? Boolean.valueOf(surface3.isValid()) : null);
            sb4.append("). Waiting for new one.");
            MapboxLogger.logI(str2, sb4.toString());
        }
    }

    public final void scheduleThreadServiceTypeReset() {
        MapboxLogger.logI(this.TAG, "Scheduling thread service type reset with delay");
        getMainHandler().postDelayed(new c(this, 3), 300L);
    }

    public final void setAwaitingNextVsync$maps_sdk_release(boolean z14) {
        this.awaitingNextVsync = z14;
    }

    public final void setEglContextMadeCurrent$maps_sdk_release(boolean z14) {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            this.eglContextMadeCurrent = z14;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEglSurface$maps_sdk_release(EGLSurface eGLSurface) {
        eGLSurface.getClass();
        this.eglSurface = eGLSurface;
    }

    public final void setFpsChangedListener$maps_sdk_release(OnFpsChangedListener onFpsChangedListener) {
        this.fpsChangedListener.setValue(this, $$delegatedProperties[0], onFpsChangedListener);
    }

    public final void setNeedViewAnnotationSync$maps_sdk_release(boolean z14) {
        this.needViewAnnotationSync = z14;
    }

    public final void setPaused$maps_sdk_release(boolean z14) {
        this.paused = z14;
    }

    public final void setRenderThreadStatsRecorder$maps_sdk_release(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        this.renderThreadStatsRecorder = renderThreadStatsRecorder;
    }

    public final void setScreenRefreshRate(int refreshRate) {
        this.renderHandlerThread.post(new a(this, refreshRate, 1));
    }

    public final void setSurface$maps_sdk_release(Surface surface) {
        this.surface = surface;
    }

    public final void setUserRefreshRate(int fps) {
        this.renderHandlerThread.post(new a(this, fps, 0));
    }

    public final void setViewAnnotationMode$maps_sdk_release(ViewAnnotationUpdateMode viewAnnotationUpdateMode) {
        viewAnnotationUpdateMode.getClass();
        this.viewAnnotationMode = viewAnnotationUpdateMode;
    }

    public MapboxRenderThread(MapboxRenderer mapboxRenderer, MapboxWidgetRenderer mapboxWidgetRenderer, RenderHandlerThread renderHandlerThread, EGLCore eGLCore, FpsManager fpsManager, TextureRenderer textureRenderer, ReentrantLock reentrantLock, Condition condition, Condition condition2) {
        mapboxRenderer.getClass();
        mapboxWidgetRenderer.getClass();
        renderHandlerThread.getClass();
        eGLCore.getClass();
        fpsManager.getClass();
        textureRenderer.getClass();
        reentrantLock.getClass();
        condition.getClass();
        condition2.getClass();
        this.renderEventQueue = new ConcurrentLinkedQueue<>();
        this.nonRenderEventQueue = new ConcurrentLinkedQueue<>();
        this.mainHandler = m.b(MapboxRenderThread$mainHandler$2.INSTANCE);
        this.renderThreadPreparedLock = new ReentrantLock();
        g23.a aVar = g23.a.f75578a;
        final Object obj = null;
        this.fpsChangedListener = new g23.c<OnFpsChangedListener>(obj) { // from class: com.mapbox.maps.renderer.MapboxRenderThread$special$$inlined$observable$2
            @Override // g23.c
            public void afterChange(l<?> property, OnFpsChangedListener oldValue, OnFpsChangedListener newValue) {
                property.getClass();
                OnFpsChangedListener onFpsChangedListener = newValue;
                if (s.g(oldValue, onFpsChangedListener)) {
                    return;
                }
                MapboxRenderThread mapboxRenderThread = this;
                MapboxRenderThread.postNonRenderEvent$default(mapboxRenderThread, new RenderEvent(new MapboxRenderThread$fpsChangedListener$2$1(mapboxRenderThread, onFpsChangedListener), false), 0L, 2, null);
            }
        };
        this.viewAnnotationMode = ViewAnnotationManager.DEFAULT_UPDATE_MODE;
        this.prepareRenderFrameRunnable = new c(this, 0);
        this.translucentSurface = false;
        this.mapboxRenderer = mapboxRenderer;
        this.widgetRenderer = mapboxWidgetRenderer;
        this.renderHandlerThread = renderHandlerThread;
        this.eglCore = eGLCore;
        this.fpsManager = fpsManager;
        this.widgetTextureRenderer = textureRenderer;
        this.eglSurface = eGLCore.getEglNoSurface();
        this.contextMode = ContextMode.UNIQUE;
        this.surfaceProcessingLock = reentrantLock;
        this.createCondition = condition;
        this.destroyCondition = condition2;
        this.TAG = "";
    }
}
